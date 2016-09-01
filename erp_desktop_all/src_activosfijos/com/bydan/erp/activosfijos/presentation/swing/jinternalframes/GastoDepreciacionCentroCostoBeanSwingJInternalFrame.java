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
package com.bydan.erp.activosfijos.presentation.swing.jinternalframes;




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

import com.bydan.erp.activosfijos.util.GastoDepreciacionCentroCostoConstantesFunciones;
import com.bydan.erp.activosfijos.util.GastoDepreciacionCentroCostoParameterReturnGeneral;
//import com.bydan.erp.activosfijos.util.GastoDepreciacionCentroCostoParameterGeneral;
//import com.bydan.erp.activosfijos.presentation.report.source.GastoDepreciacionCentroCostoBean;
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

import com.bydan.erp.activosfijos.presentation.swing.jinternalframes.auxiliar.*;
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
import com.bydan.erp.activosfijos.resources.reportes.AuxiliarReportes;


import com.bydan.erp.activosfijos.util.*;
import com.bydan.erp.activosfijos.business.logic.*;

import com.bydan.erp.seguridad.business.logic.*;
import com.bydan.erp.contabilidad.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.activosfijos.business.entity.*;
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


import com.bydan.erp.activosfijos.presentation.web.jsf.sessionbean.*;

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
public class GastoDepreciacionCentroCostoBeanSwingJInternalFrame extends GastoDepreciacionCentroCostoJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(GastoDepreciacionCentroCostoBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<GastoDepreciacionCentroCosto> gastodepreciacioncentrocostoValidator = new ClassValidator<GastoDepreciacionCentroCosto>(GastoDepreciacionCentroCosto.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public GastoDepreciacionCentroCosto gastodepreciacioncentrocosto;	
	public GastoDepreciacionCentroCosto gastodepreciacioncentrocostoAux;
	public GastoDepreciacionCentroCosto gastodepreciacioncentrocostoAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public GastoDepreciacionCentroCosto gastodepreciacioncentrocostoTotales;
	public Long idGastoDepreciacionCentroCostoActual;
	public Long iIdNuevoGastoDepreciacionCentroCosto=0L;
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

	public String sFinalQueryComboCentroCosto="";

	public List<CentroCosto> centrocostosForeignKey;

	public List<CentroCosto> getcentrocostosForeignKey() {
		return centrocostosForeignKey;
	}

	public void setcentrocostosForeignKey(List<CentroCosto> centrocostosForeignKey) {
		this.centrocostosForeignKey = centrocostosForeignKey;
	}

	//OBJETO FK ACTUAL
	public CentroCosto centrocostoForeignKey;

	public CentroCosto getcentrocostoForeignKey() {
		return centrocostoForeignKey;
	}

	public void setcentrocostoForeignKey(CentroCosto centrocostoForeignKey) {
		this.centrocostoForeignKey = centrocostoForeignKey;
	}

	public String sFinalQueryComboDetalleActivoFijo="";

	public List<DetalleActivoFijo> detalleactivofijosForeignKey;

	public List<DetalleActivoFijo> getdetalleactivofijosForeignKey() {
		return detalleactivofijosForeignKey;
	}

	public void setdetalleactivofijosForeignKey(List<DetalleActivoFijo> detalleactivofijosForeignKey) {
		this.detalleactivofijosForeignKey = detalleactivofijosForeignKey;
	}

	//OBJETO FK ACTUAL
	public DetalleActivoFijo detalleactivofijoForeignKey;

	public DetalleActivoFijo getdetalleactivofijoForeignKey() {
		return detalleactivofijoForeignKey;
	}

	public void setdetalleactivofijoForeignKey(DetalleActivoFijo detalleactivofijoForeignKey) {
		this.detalleactivofijoForeignKey = detalleactivofijoForeignKey;
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

		
	
	
	
	//BUSQUEDA INTERNA FK
	public Long idCentroCostoActual=0L;

	public Long getidCentroCostoActual() {
		return idCentroCostoActual;
	}

	public void setidCentroCostoActual(Long idCentroCostoActual) {
		this.idCentroCostoActual= idCentroCostoActual;
	}
	public Long idCuentaContableActual=0L;

	public Long getidCuentaContableActual() {
		return idCuentaContableActual;
	}

	public void setidCuentaContableActual(Long idCuentaContableActual) {
		this.idCuentaContableActual= idCuentaContableActual;
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
	
	public Boolean isPermisoTodoGastoDepreciacionCentroCosto;
	public Boolean isPermisoNuevoGastoDepreciacionCentroCosto;
	public Boolean isPermisoActualizarGastoDepreciacionCentroCosto;
	public Boolean isPermisoActualizarOriginalGastoDepreciacionCentroCosto;
	public Boolean isPermisoEliminarGastoDepreciacionCentroCosto;
	public Boolean isPermisoGuardarCambiosGastoDepreciacionCentroCosto;
	public Boolean isPermisoConsultaGastoDepreciacionCentroCosto;
	public Boolean isPermisoBusquedaGastoDepreciacionCentroCosto;
	public Boolean isPermisoReporteGastoDepreciacionCentroCosto;
	public Boolean isPermisoPaginacionMedioGastoDepreciacionCentroCosto;
	public Boolean isPermisoPaginacionAltoGastoDepreciacionCentroCosto;
	public Boolean isPermisoPaginacionTodoGastoDepreciacionCentroCosto;
	public Boolean isPermisoCopiarGastoDepreciacionCentroCosto;
	public Boolean isPermisoVerFormGastoDepreciacionCentroCosto;
	public Boolean isPermisoDuplicarGastoDepreciacionCentroCosto;
	public Boolean isPermisoOrdenGastoDepreciacionCentroCosto;
	
	
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
	
	public GastoDepreciacionCentroCostoParameterReturnGeneral gastodepreciacioncentrocostoReturnGeneral;
	public GastoDepreciacionCentroCostoParameterReturnGeneral gastodepreciacioncentrocostoParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoGastoDepreciacionCentroCosto=false;
	public Boolean esParaAccionDesdeFormularioGastoDepreciacionCentroCosto=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected GastoDepreciacionCentroCostoSessionBeanAdditional gastodepreciacioncentrocostoSessionBeanAdditional=null;
	
	public GastoDepreciacionCentroCostoSessionBeanAdditional getGastoDepreciacionCentroCostoSessionBeanAdditional() {
		return this.gastodepreciacioncentrocostoSessionBeanAdditional;
	}
	
	public void setGastoDepreciacionCentroCostoSessionBeanAdditional(GastoDepreciacionCentroCostoSessionBeanAdditional gastodepreciacioncentrocostoSessionBeanAdditional) {
		try {
			this.gastodepreciacioncentrocostoSessionBeanAdditional=gastodepreciacioncentrocostoSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected GastoDepreciacionCentroCostoBeanSwingJInternalFrameAdditional gastodepreciacioncentrocostoBeanSwingJInternalFrameAdditional=null;
	//public class GastoDepreciacionCentroCostoBeanSwingJInternalFrame
	
	public GastoDepreciacionCentroCostoBeanSwingJInternalFrameAdditional getGastoDepreciacionCentroCostoBeanSwingJInternalFrameAdditional() {
		return this.gastodepreciacioncentrocostoBeanSwingJInternalFrameAdditional;
	}
	
	public void setGastoDepreciacionCentroCostoBeanSwingJInternalFrameAdditional(GastoDepreciacionCentroCostoBeanSwingJInternalFrameAdditional gastodepreciacioncentrocostoBeanSwingJInternalFrameAdditional) {
		try {
			this.gastodepreciacioncentrocostoBeanSwingJInternalFrameAdditional=gastodepreciacioncentrocostoBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public GastoDepreciacionCentroCostoLogic gastodepreciacioncentrocostoLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public GastoDepreciacionCentroCosto gastodepreciacioncentrocostoBean;
	public GastoDepreciacionCentroCostoConstantesFunciones gastodepreciacioncentrocostoConstantesFunciones;
	//public GastoDepreciacionCentroCostoParameterReturnGeneral gastodepreciacioncentrocostoReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	public SucursalLogic sucursalLogic;
	public CentroCostoLogic centrocostoLogic;
	public DetalleActivoFijoLogic detalleactivofijoLogic;
	public CuentaContableLogic cuentacontableLogic;
	
	//PARAMETROS
	
	
	//public List<GastoDepreciacionCentroCosto> gastodepreciacioncentrocostos;	
	//public List<GastoDepreciacionCentroCosto> gastodepreciacioncentrocostosEliminados;
	//public List<GastoDepreciacionCentroCosto> gastodepreciacioncentrocostosAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoGastoDepreciacionCentroCosto=false;
	public Boolean isVisibilidadCeldaDuplicarGastoDepreciacionCentroCosto=true;
	public Boolean isVisibilidadCeldaCopiarGastoDepreciacionCentroCosto=true;
	public Boolean isVisibilidadCeldaVerFormGastoDepreciacionCentroCosto=true;
	public Boolean isVisibilidadCeldaOrdenGastoDepreciacionCentroCosto=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesGastoDepreciacionCentroCosto=false;
	public Boolean isVisibilidadCeldaModificarGastoDepreciacionCentroCosto=false;
	public Boolean isVisibilidadCeldaActualizarGastoDepreciacionCentroCosto=false;
	public Boolean isVisibilidadCeldaEliminarGastoDepreciacionCentroCosto=false;
	public Boolean isVisibilidadCeldaCancelarGastoDepreciacionCentroCosto=false;
	public Boolean isVisibilidadCeldaGuardarGastoDepreciacionCentroCosto=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosGastoDepreciacionCentroCosto=false;	
	
	
	public Boolean isVisibilidadFK_IdCentroCosto=false;
	public Boolean isVisibilidadFK_IdCuentaContable=false;
	public Boolean isVisibilidadFK_IdDetalleActivoFijo=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	public Boolean isVisibilidadFK_IdSucursal=false;
	
	public Long getiIdNuevoGastoDepreciacionCentroCosto() {
		return this.iIdNuevoGastoDepreciacionCentroCosto;
	}

	public void setiIdNuevoGastoDepreciacionCentroCosto(Long iIdNuevoGastoDepreciacionCentroCosto) {
		this.iIdNuevoGastoDepreciacionCentroCosto = iIdNuevoGastoDepreciacionCentroCosto;
	}
	
	public Long getidGastoDepreciacionCentroCostoActual() {
		return this.idGastoDepreciacionCentroCostoActual;
	}

	public void setidGastoDepreciacionCentroCostoActual(Long idGastoDepreciacionCentroCostoActual) {
		this.idGastoDepreciacionCentroCostoActual = idGastoDepreciacionCentroCostoActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public GastoDepreciacionCentroCosto getgastodepreciacioncentrocosto() {
		return this.gastodepreciacioncentrocosto;
	}

	public void setgastodepreciacioncentrocosto(GastoDepreciacionCentroCosto gastodepreciacioncentrocosto) {
		this.gastodepreciacioncentrocosto = gastodepreciacioncentrocosto;
	}
	
	public GastoDepreciacionCentroCosto getgastodepreciacioncentrocostoAux() {
		return this.gastodepreciacioncentrocostoAux;
	}

	public void setgastodepreciacioncentrocostoAux(GastoDepreciacionCentroCosto gastodepreciacioncentrocostoAux) {
		this.gastodepreciacioncentrocostoAux = gastodepreciacioncentrocostoAux;
	}				
	
	public GastoDepreciacionCentroCosto getgastodepreciacioncentrocostoAnterior() {
		return this.gastodepreciacioncentrocostoAnterior;
	}

	public void setgastodepreciacioncentrocostoAnterior(GastoDepreciacionCentroCosto gastodepreciacioncentrocostoAnterior) {
		this.gastodepreciacioncentrocostoAnterior = gastodepreciacioncentrocostoAnterior;
	}	
	
	public GastoDepreciacionCentroCosto getgastodepreciacioncentrocostoTotales() {
		return this.gastodepreciacioncentrocostoTotales;
	}

	public void setgastodepreciacioncentrocostoTotales(GastoDepreciacionCentroCosto gastodepreciacioncentrocostoTotales) {
		this.gastodepreciacioncentrocostoTotales = gastodepreciacioncentrocostoTotales;
	}	
	
	public GastoDepreciacionCentroCosto getgastodepreciacioncentrocostoBean() {
		return this.gastodepreciacioncentrocostoBean;
	}

	public void setgastodepreciacioncentrocostoBean(GastoDepreciacionCentroCosto gastodepreciacioncentrocostoBean) {
		this.gastodepreciacioncentrocostoBean = gastodepreciacioncentrocostoBean;
	}	
	
	public GastoDepreciacionCentroCostoParameterReturnGeneral getgastodepreciacioncentrocostoReturnGeneral() {
		return this.gastodepreciacioncentrocostoReturnGeneral;
	}

	public void setgastodepreciacioncentrocostoReturnGeneral(GastoDepreciacionCentroCostoParameterReturnGeneral gastodepreciacioncentrocostoReturnGeneral) {
		this.gastodepreciacioncentrocostoReturnGeneral = gastodepreciacioncentrocostoReturnGeneral;
	}	
	
	
	public Long id_centro_costoFK_IdCentroCosto=null;

	public Long getid_centro_costoFK_IdCentroCosto() {
		return this.id_centro_costoFK_IdCentroCosto;
	}

	public void setid_centro_costoFK_IdCentroCosto(Long id_centro_costoFK_IdCentroCosto) {
		this.id_centro_costoFK_IdCentroCosto = id_centro_costoFK_IdCentroCosto;
	}

	public Long id_cuenta_contableFK_IdCuentaContable=-1L;

	public Long getid_cuenta_contableFK_IdCuentaContable() {
		return this.id_cuenta_contableFK_IdCuentaContable;
	}

	public void setid_cuenta_contableFK_IdCuentaContable(Long id_cuenta_contableFK_IdCuentaContable) {
		this.id_cuenta_contableFK_IdCuentaContable = id_cuenta_contableFK_IdCuentaContable;
	}

	public Long id_detalle_activo_fijoFK_IdDetalleActivoFijo=-1L;

	public Long getid_detalle_activo_fijoFK_IdDetalleActivoFijo() {
		return this.id_detalle_activo_fijoFK_IdDetalleActivoFijo;
	}

	public void setid_detalle_activo_fijoFK_IdDetalleActivoFijo(Long id_detalle_activo_fijoFK_IdDetalleActivoFijo) {
		this.id_detalle_activo_fijoFK_IdDetalleActivoFijo = id_detalle_activo_fijoFK_IdDetalleActivoFijo;
	}

	public Long id_empresaFK_IdEmpresa=-1L;

	public Long getid_empresaFK_IdEmpresa() {
		return this.id_empresaFK_IdEmpresa;
	}

	public void setid_empresaFK_IdEmpresa(Long id_empresaFK_IdEmpresa) {
		this.id_empresaFK_IdEmpresa = id_empresaFK_IdEmpresa;
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
	
	
	public GastoDepreciacionCentroCostoLogic getGastoDepreciacionCentroCostoLogic()	{		
		return gastodepreciacioncentrocostoLogic;
	}

	public void setGastoDepreciacionCentroCostoLogic(GastoDepreciacionCentroCostoLogic gastodepreciacioncentrocostoLogic) {
		this.gastodepreciacioncentrocostoLogic = gastodepreciacioncentrocostoLogic;
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
	
	public Boolean getIsEsNuevoGastoDepreciacionCentroCosto() {
		return isEsNuevoGastoDepreciacionCentroCosto;
	}

	public void setIsEsNuevoGastoDepreciacionCentroCosto(Boolean isEsNuevoGastoDepreciacionCentroCosto) {
		this.isEsNuevoGastoDepreciacionCentroCosto = isEsNuevoGastoDepreciacionCentroCosto;
	}

	public Boolean getEsParaAccionDesdeFormularioGastoDepreciacionCentroCosto() {
		return esParaAccionDesdeFormularioGastoDepreciacionCentroCosto;
	}
	
	public void setEsParaAccionDesdeFormularioGastoDepreciacionCentroCosto(Boolean esParaAccionDesdeFormularioGastoDepreciacionCentroCosto) {
		this.esParaAccionDesdeFormularioGastoDepreciacionCentroCosto = esParaAccionDesdeFormularioGastoDepreciacionCentroCosto;
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

			if(this.gastodepreciacioncentrocostoSessionBean==null) {
				this.gastodepreciacioncentrocostoSessionBean=new GastoDepreciacionCentroCostoSessionBean();
			}

			if(!this.gastodepreciacioncentrocostoSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(gastodepreciacioncentrocostoSessionBean.getlidEmpresaActual());
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

			if(this.gastodepreciacioncentrocostoSessionBean==null) {
				this.gastodepreciacioncentrocostoSessionBean=new GastoDepreciacionCentroCostoSessionBean();
			}

			if(!this.gastodepreciacioncentrocostoSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
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
					sucursalLogic.getEntityWithConnection(gastodepreciacioncentrocostoSessionBean.getlidSucursalActual());
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

	public void cargarCombosCentroCostosForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.centrocostosForeignKey=new ArrayList<CentroCosto>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			CentroCostoLogic centrocostoLogic=new CentroCostoLogic();

			//centrocostoLogic.getCentroCostoDataAccess().setIsForForeingKeyData(true);

			if(this.gastodepreciacioncentrocostoSessionBean==null) {
				this.gastodepreciacioncentrocostoSessionBean=new GastoDepreciacionCentroCostoSessionBean();
			}

			if(!this.gastodepreciacioncentrocostoSessionBean.getisBusquedaDesdeForeignKeySesionCentroCosto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//centrocostoLogic.getCentroCostoDataAccess().setIsForForeingKeyData(true);

					centrocostoLogic.getTodosCentroCostosWithConnection(sFinalQuery,new Pagination());

					this.centrocostosForeignKey=centrocostoLogic.getCentroCostos();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaCentroCosto(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					centrocostoLogic.getEntityWithConnection(gastodepreciacioncentrocostoSessionBean.getlidCentroCostoActual());
					this.centrocostosForeignKey.add(centrocostoLogic.getCentroCosto());
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

	public void cargarCombosDetalleActivoFijosForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.detalleactivofijosForeignKey=new ArrayList<DetalleActivoFijo>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			DetalleActivoFijoLogic detalleactivofijoLogic=new DetalleActivoFijoLogic();

			//detalleactivofijoLogic.getDetalleActivoFijoDataAccess().setIsForForeingKeyData(true);

			if(this.gastodepreciacioncentrocostoSessionBean==null) {
				this.gastodepreciacioncentrocostoSessionBean=new GastoDepreciacionCentroCostoSessionBean();
			}

			if(!this.gastodepreciacioncentrocostoSessionBean.getisBusquedaDesdeForeignKeySesionDetalleActivoFijo()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//detalleactivofijoLogic.getDetalleActivoFijoDataAccess().setIsForForeingKeyData(true);

					detalleactivofijoLogic.getTodosDetalleActivoFijosWithConnection(sFinalQuery,new Pagination());

					this.detalleactivofijosForeignKey=detalleactivofijoLogic.getDetalleActivoFijos();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaDetalleActivoFijo(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					detalleactivofijoLogic.getEntityWithConnection(gastodepreciacioncentrocostoSessionBean.getlidDetalleActivoFijoActual());
					this.detalleactivofijosForeignKey.add(detalleactivofijoLogic.getDetalleActivoFijo());
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

			if(this.gastodepreciacioncentrocostoSessionBean==null) {
				this.gastodepreciacioncentrocostoSessionBean=new GastoDepreciacionCentroCostoSessionBean();
			}

			if(!this.gastodepreciacioncentrocostoSessionBean.getisBusquedaDesdeForeignKeySesionCuentaContable()) {
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
					cuentacontableLogic.getEntityWithConnection(gastodepreciacioncentrocostoSessionBean.getlidCuentaContableActual());
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

					if(this.gastodepreciacioncentrocosto!=null) {
						this.gastodepreciacioncentrocosto.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto!=null) {
						this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto.jComboBoxid_empresaGastoDepreciacionCentroCosto.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaGastoDepreciacionCentroCosto.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto!=null) {
						if(this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto.jComboBoxid_empresaGastoDepreciacionCentroCosto.getItemCount()>0) {
							this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto.jComboBoxid_empresaGastoDepreciacionCentroCosto.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaGastoDepreciacionCentroCostoGenerico)throws Exception
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
				jComboBoxid_empresaGastoDepreciacionCentroCostoGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaGastoDepreciacionCentroCostoGenerico!=null && jComboBoxid_empresaGastoDepreciacionCentroCostoGenerico.getItemCount()>0) {
					jComboBoxid_empresaGastoDepreciacionCentroCostoGenerico.setSelectedIndex(0);
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

					if(this.gastodepreciacioncentrocosto!=null) {
						this.gastodepreciacioncentrocosto.setSucursal(sucursalTemp);
					}

					if(this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto!=null) {
						this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto.jComboBoxid_sucursalGastoDepreciacionCentroCosto.setSelectedItem(sucursalTemp);
					}
				} else {
					//jComboBoxid_sucursalGastoDepreciacionCentroCosto.setSelectedItem(sucursalTemp);
					if(this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto!=null) {
						if(this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto.jComboBoxid_sucursalGastoDepreciacionCentroCosto.getItemCount()>0) {
							this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto.jComboBoxid_sucursalGastoDepreciacionCentroCosto.setSelectedIndex(0);
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
	public void setActualSucursalForeignKeyGenerico(Long idSucursalSeleccionado,JComboBox jComboBoxid_sucursalGastoDepreciacionCentroCostoGenerico)throws Exception
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
				jComboBoxid_sucursalGastoDepreciacionCentroCostoGenerico.setSelectedItem(sucursalTemp);
			} else {
				if(jComboBoxid_sucursalGastoDepreciacionCentroCostoGenerico!=null && jComboBoxid_sucursalGastoDepreciacionCentroCostoGenerico.getItemCount()>0) {
					jComboBoxid_sucursalGastoDepreciacionCentroCostoGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualCentroCostoForeignKey(Long idCentroCostoSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			CentroCosto  centrocostoTemp=null;

			for(CentroCosto centrocostoAux:centrocostosForeignKey) {
				if(centrocostoAux.getId()!=null && centrocostoAux.getId().equals(idCentroCostoSeleccionado)) {
					centrocostoTemp=centrocostoAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(centrocostoTemp!=null) {

					if(this.gastodepreciacioncentrocosto!=null) {
						this.gastodepreciacioncentrocosto.setCentroCosto(centrocostoTemp);
					}

					if(this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto!=null) {
						this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto.jComboBoxid_centro_costoGastoDepreciacionCentroCosto.setSelectedItem(centrocostoTemp);
					}
				} else {
					//jComboBoxid_centro_costoGastoDepreciacionCentroCosto.setSelectedItem(centrocostoTemp);
					if(this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto!=null) {
						if(this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto.jComboBoxid_centro_costoGastoDepreciacionCentroCosto.getItemCount()>0) {
							this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto.jComboBoxid_centro_costoGastoDepreciacionCentroCosto.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdCentroCosto") || sFormularioTipoBusqueda.equals("Todos")){
					if(centrocostoTemp!=null && jComboBoxid_centro_costoFK_IdCentroCostoGastoDepreciacionCentroCosto!=null) {
						jComboBoxid_centro_costoFK_IdCentroCostoGastoDepreciacionCentroCosto.setSelectedItem(centrocostoTemp);
					} else {
						if(jComboBoxid_centro_costoFK_IdCentroCostoGastoDepreciacionCentroCosto!=null) {
							//jComboBoxid_centro_costoFK_IdCentroCostoGastoDepreciacionCentroCosto.setSelectedItem(centrocostoTemp);
							if(jComboBoxid_centro_costoFK_IdCentroCostoGastoDepreciacionCentroCosto.getItemCount()>0) {
								jComboBoxid_centro_costoFK_IdCentroCostoGastoDepreciacionCentroCosto.setSelectedIndex(0);
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

	public String getActualCentroCostoForeignKeyDescripcion(Long idCentroCostoSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			CentroCosto  centrocostoTemp=null;

			for(CentroCosto centrocostoAux:centrocostosForeignKey) {
				if(centrocostoAux.getId()!=null && centrocostoAux.getId().equals(idCentroCostoSeleccionado)) {
					centrocostoTemp=centrocostoAux;
					break;
				}
			}


			sDescripcion=CentroCostoConstantesFunciones.getCentroCostoDescripcion(centrocostoTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualCentroCostoForeignKeyGenerico(Long idCentroCostoSeleccionado,JComboBox jComboBoxid_centro_costoGastoDepreciacionCentroCostoGenerico)throws Exception
	{
		try
		{
			CentroCosto  centrocostoTemp=null;

			for(CentroCosto centrocostoAux:centrocostosForeignKey) {
				if(centrocostoAux.getId()!=null && centrocostoAux.getId().equals(idCentroCostoSeleccionado)) {
					centrocostoTemp=centrocostoAux;
					break;
				}
			}

			if(centrocostoTemp!=null) {
				jComboBoxid_centro_costoGastoDepreciacionCentroCostoGenerico.setSelectedItem(centrocostoTemp);
			} else {
				if(jComboBoxid_centro_costoGastoDepreciacionCentroCostoGenerico!=null && jComboBoxid_centro_costoGastoDepreciacionCentroCostoGenerico.getItemCount()>0) {
					jComboBoxid_centro_costoGastoDepreciacionCentroCostoGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualDetalleActivoFijoForeignKey(Long idDetalleActivoFijoSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			DetalleActivoFijo  detalleactivofijoTemp=null;

			for(DetalleActivoFijo detalleactivofijoAux:detalleactivofijosForeignKey) {
				if(detalleactivofijoAux.getId()!=null && detalleactivofijoAux.getId().equals(idDetalleActivoFijoSeleccionado)) {
					detalleactivofijoTemp=detalleactivofijoAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(detalleactivofijoTemp!=null) {

					if(this.gastodepreciacioncentrocosto!=null) {
						this.gastodepreciacioncentrocosto.setDetalleActivoFijo(detalleactivofijoTemp);
					}

					if(this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto!=null) {
						this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto.jComboBoxid_detalle_activo_fijoGastoDepreciacionCentroCosto.setSelectedItem(detalleactivofijoTemp);
					}
				} else {
					//jComboBoxid_detalle_activo_fijoGastoDepreciacionCentroCosto.setSelectedItem(detalleactivofijoTemp);
					if(this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto!=null) {
						if(this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto.jComboBoxid_detalle_activo_fijoGastoDepreciacionCentroCosto.getItemCount()>0) {
							this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto.jComboBoxid_detalle_activo_fijoGastoDepreciacionCentroCosto.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdDetalleActivoFijo") || sFormularioTipoBusqueda.equals("Todos")){
					if(detalleactivofijoTemp!=null && jComboBoxid_detalle_activo_fijoFK_IdDetalleActivoFijoGastoDepreciacionCentroCosto!=null) {
						jComboBoxid_detalle_activo_fijoFK_IdDetalleActivoFijoGastoDepreciacionCentroCosto.setSelectedItem(detalleactivofijoTemp);
					} else {
						if(jComboBoxid_detalle_activo_fijoFK_IdDetalleActivoFijoGastoDepreciacionCentroCosto!=null) {
							//jComboBoxid_detalle_activo_fijoFK_IdDetalleActivoFijoGastoDepreciacionCentroCosto.setSelectedItem(detalleactivofijoTemp);
							if(jComboBoxid_detalle_activo_fijoFK_IdDetalleActivoFijoGastoDepreciacionCentroCosto.getItemCount()>0) {
								jComboBoxid_detalle_activo_fijoFK_IdDetalleActivoFijoGastoDepreciacionCentroCosto.setSelectedIndex(0);
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

	public String getActualDetalleActivoFijoForeignKeyDescripcion(Long idDetalleActivoFijoSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			DetalleActivoFijo  detalleactivofijoTemp=null;

			for(DetalleActivoFijo detalleactivofijoAux:detalleactivofijosForeignKey) {
				if(detalleactivofijoAux.getId()!=null && detalleactivofijoAux.getId().equals(idDetalleActivoFijoSeleccionado)) {
					detalleactivofijoTemp=detalleactivofijoAux;
					break;
				}
			}


			sDescripcion=DetalleActivoFijoConstantesFunciones.getDetalleActivoFijoDescripcion(detalleactivofijoTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualDetalleActivoFijoForeignKeyGenerico(Long idDetalleActivoFijoSeleccionado,JComboBox jComboBoxid_detalle_activo_fijoGastoDepreciacionCentroCostoGenerico)throws Exception
	{
		try
		{
			DetalleActivoFijo  detalleactivofijoTemp=null;

			for(DetalleActivoFijo detalleactivofijoAux:detalleactivofijosForeignKey) {
				if(detalleactivofijoAux.getId()!=null && detalleactivofijoAux.getId().equals(idDetalleActivoFijoSeleccionado)) {
					detalleactivofijoTemp=detalleactivofijoAux;
					break;
				}
			}

			if(detalleactivofijoTemp!=null) {
				jComboBoxid_detalle_activo_fijoGastoDepreciacionCentroCostoGenerico.setSelectedItem(detalleactivofijoTemp);
			} else {
				if(jComboBoxid_detalle_activo_fijoGastoDepreciacionCentroCostoGenerico!=null && jComboBoxid_detalle_activo_fijoGastoDepreciacionCentroCostoGenerico.getItemCount()>0) {
					jComboBoxid_detalle_activo_fijoGastoDepreciacionCentroCostoGenerico.setSelectedIndex(0);
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

					if(this.gastodepreciacioncentrocosto!=null) {
						this.gastodepreciacioncentrocosto.setCuentaContable(cuentacontableTemp);
					}

					if(this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto!=null) {
						this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto.jComboBoxid_cuenta_contableGastoDepreciacionCentroCosto.setSelectedItem(cuentacontableTemp);
					}
				} else {
					//jComboBoxid_cuenta_contableGastoDepreciacionCentroCosto.setSelectedItem(cuentacontableTemp);
					if(this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto!=null) {
						if(this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto.jComboBoxid_cuenta_contableGastoDepreciacionCentroCosto.getItemCount()>0) {
							this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto.jComboBoxid_cuenta_contableGastoDepreciacionCentroCosto.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdCuentaContable") || sFormularioTipoBusqueda.equals("Todos")){
					if(cuentacontableTemp!=null && jComboBoxid_cuenta_contableFK_IdCuentaContableGastoDepreciacionCentroCosto!=null) {
						jComboBoxid_cuenta_contableFK_IdCuentaContableGastoDepreciacionCentroCosto.setSelectedItem(cuentacontableTemp);
					} else {
						if(jComboBoxid_cuenta_contableFK_IdCuentaContableGastoDepreciacionCentroCosto!=null) {
							//jComboBoxid_cuenta_contableFK_IdCuentaContableGastoDepreciacionCentroCosto.setSelectedItem(cuentacontableTemp);
							if(jComboBoxid_cuenta_contableFK_IdCuentaContableGastoDepreciacionCentroCosto.getItemCount()>0) {
								jComboBoxid_cuenta_contableFK_IdCuentaContableGastoDepreciacionCentroCosto.setSelectedIndex(0);
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
	public void setActualCuentaContableForeignKeyGenerico(Long idCuentaContableSeleccionado,JComboBox jComboBoxid_cuenta_contableGastoDepreciacionCentroCostoGenerico)throws Exception
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
				jComboBoxid_cuenta_contableGastoDepreciacionCentroCostoGenerico.setSelectedItem(cuentacontableTemp);
			} else {
				if(jComboBoxid_cuenta_contableGastoDepreciacionCentroCostoGenerico!=null && jComboBoxid_cuenta_contableGastoDepreciacionCentroCostoGenerico.getItemCount()>0) {
					jComboBoxid_cuenta_contableGastoDepreciacionCentroCostoGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(GastoDepreciacionCentroCosto gastodepreciacioncentrocosto,JComboBox jComboBoxid_empresaGastoDepreciacionCentroCostoGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaGastoDepreciacionCentroCostoGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto.jComboBoxid_empresaGastoDepreciacionCentroCosto.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaGastoDepreciacionCentroCostoGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				gastodepreciacioncentrocosto.setid_empresa(empresaAux.getId());
				gastodepreciacioncentrocosto.setempresa_descripcion(GastoDepreciacionCentroCostoConstantesFunciones.getEmpresaDescripcion(empresaAux));
				gastodepreciacioncentrocosto.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarSucursalForeignKey(GastoDepreciacionCentroCosto gastodepreciacioncentrocosto,JComboBox jComboBoxid_sucursalGastoDepreciacionCentroCostoGenerico)throws Exception
	{
		try
		{
			Sucursal  sucursalAux=new Sucursal();

			if(jComboBoxid_sucursalGastoDepreciacionCentroCostoGenerico==null) {
				sucursalAux=(Sucursal)this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto.jComboBoxid_sucursalGastoDepreciacionCentroCosto.getSelectedItem();
			} else {
				sucursalAux=(Sucursal)jComboBoxid_sucursalGastoDepreciacionCentroCostoGenerico.getSelectedItem();
			}

			if(sucursalAux!=null && sucursalAux.getId()!=null) {
				gastodepreciacioncentrocosto.setid_sucursal(sucursalAux.getId());
				gastodepreciacioncentrocosto.setsucursal_descripcion(GastoDepreciacionCentroCostoConstantesFunciones.getSucursalDescripcion(sucursalAux));
				gastodepreciacioncentrocosto.setSucursal(sucursalAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarCentroCostoForeignKey(GastoDepreciacionCentroCosto gastodepreciacioncentrocosto,JComboBox jComboBoxid_centro_costoGastoDepreciacionCentroCostoGenerico)throws Exception
	{
		try
		{
			CentroCosto  centrocostoAux=new CentroCosto();

			if(jComboBoxid_centro_costoGastoDepreciacionCentroCostoGenerico==null) {
				centrocostoAux=(CentroCosto)this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto.jComboBoxid_centro_costoGastoDepreciacionCentroCosto.getSelectedItem();
			} else {
				centrocostoAux=(CentroCosto)jComboBoxid_centro_costoGastoDepreciacionCentroCostoGenerico.getSelectedItem();
			}

			if(centrocostoAux!=null) {
				gastodepreciacioncentrocosto.setid_centro_costo(centrocostoAux.getId());
				gastodepreciacioncentrocosto.setcentrocosto_descripcion(GastoDepreciacionCentroCostoConstantesFunciones.getCentroCostoDescripcion(centrocostoAux));
				gastodepreciacioncentrocosto.setCentroCosto(centrocostoAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarDetalleActivoFijoForeignKey(GastoDepreciacionCentroCosto gastodepreciacioncentrocosto,JComboBox jComboBoxid_detalle_activo_fijoGastoDepreciacionCentroCostoGenerico)throws Exception
	{
		try
		{
			DetalleActivoFijo  detalleactivofijoAux=new DetalleActivoFijo();

			if(jComboBoxid_detalle_activo_fijoGastoDepreciacionCentroCostoGenerico==null) {
				detalleactivofijoAux=(DetalleActivoFijo)this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto.jComboBoxid_detalle_activo_fijoGastoDepreciacionCentroCosto.getSelectedItem();
			} else {
				detalleactivofijoAux=(DetalleActivoFijo)jComboBoxid_detalle_activo_fijoGastoDepreciacionCentroCostoGenerico.getSelectedItem();
			}

			if(detalleactivofijoAux!=null && detalleactivofijoAux.getId()!=null) {
				gastodepreciacioncentrocosto.setid_detalle_activo_fijo(detalleactivofijoAux.getId());
				gastodepreciacioncentrocosto.setdetalleactivofijo_descripcion(GastoDepreciacionCentroCostoConstantesFunciones.getDetalleActivoFijoDescripcion(detalleactivofijoAux));
				gastodepreciacioncentrocosto.setDetalleActivoFijo(detalleactivofijoAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarCuentaContableForeignKey(GastoDepreciacionCentroCosto gastodepreciacioncentrocosto,JComboBox jComboBoxid_cuenta_contableGastoDepreciacionCentroCostoGenerico)throws Exception
	{
		try
		{
			CuentaContable  cuentacontableAux=new CuentaContable();

			if(jComboBoxid_cuenta_contableGastoDepreciacionCentroCostoGenerico==null) {
				cuentacontableAux=(CuentaContable)this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto.jComboBoxid_cuenta_contableGastoDepreciacionCentroCosto.getSelectedItem();
			} else {
				cuentacontableAux=(CuentaContable)jComboBoxid_cuenta_contableGastoDepreciacionCentroCostoGenerico.getSelectedItem();
			}

			if(cuentacontableAux!=null && cuentacontableAux.getId()!=null) {
				gastodepreciacioncentrocosto.setid_cuenta_contable(cuentacontableAux.getId());
				gastodepreciacioncentrocosto.setcuentacontable_descripcion(GastoDepreciacionCentroCostoConstantesFunciones.getCuentaContableDescripcion(cuentacontableAux));
				gastodepreciacioncentrocosto.setCuentaContable(cuentacontableAux);			}
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

					if(!GastoDepreciacionCentroCostoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto!=null) { 
							this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto.jComboBoxid_empresaGastoDepreciacionCentroCosto.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto.jComboBoxid_empresaGastoDepreciacionCentroCosto.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto!=null) { 
					}

					if(!GastoDepreciacionCentroCostoJInternalFrame.ISBINDING_MANUAL) {
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

					if(!GastoDepreciacionCentroCostoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto!=null) { 
							this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto.jComboBoxid_sucursalGastoDepreciacionCentroCosto.removeAllItems();

							for(Sucursal sucursal:this.sucursalsForeignKey) {
								this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto.jComboBoxid_sucursalGastoDepreciacionCentroCosto.addItem(sucursal);
							}
						}
					}

					if(this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto!=null) { 
					}

					if(!GastoDepreciacionCentroCostoJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameCentroCostosForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingCentroCosto=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!GastoDepreciacionCentroCostoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto!=null) { 
							this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto.jComboBoxid_centro_costoGastoDepreciacionCentroCosto.removeAllItems();

							for(CentroCosto centrocosto:this.centrocostosForeignKey) {
								this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto.jComboBoxid_centro_costoGastoDepreciacionCentroCosto.addItem(centrocosto);
							}
						}
					}

					if(this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto!=null) { 
					}

					if(!GastoDepreciacionCentroCostoJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdCentroCosto") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!GastoDepreciacionCentroCostoJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_centro_costoFK_IdCentroCostoGastoDepreciacionCentroCosto.removeAllItems();

							for(CentroCosto centrocosto:this.centrocostosForeignKey) {
								this.jComboBoxid_centro_costoFK_IdCentroCostoGastoDepreciacionCentroCosto.addItem(centrocosto);
							}
						}

						if(!GastoDepreciacionCentroCostoJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameDetalleActivoFijosForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingDetalleActivoFijo=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!GastoDepreciacionCentroCostoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto!=null) { 
							this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto.jComboBoxid_detalle_activo_fijoGastoDepreciacionCentroCosto.removeAllItems();

							for(DetalleActivoFijo detalleactivofijo:this.detalleactivofijosForeignKey) {
								this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto.jComboBoxid_detalle_activo_fijoGastoDepreciacionCentroCosto.addItem(detalleactivofijo);
							}
						}
					}

					if(this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto!=null) { 
					}

					if(!GastoDepreciacionCentroCostoJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdDetalleActivoFijo") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!GastoDepreciacionCentroCostoJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_detalle_activo_fijoFK_IdDetalleActivoFijoGastoDepreciacionCentroCosto.removeAllItems();

							for(DetalleActivoFijo detalleactivofijo:this.detalleactivofijosForeignKey) {
								this.jComboBoxid_detalle_activo_fijoFK_IdDetalleActivoFijoGastoDepreciacionCentroCosto.addItem(detalleactivofijo);
							}
						}

						if(!GastoDepreciacionCentroCostoJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

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

					if(!GastoDepreciacionCentroCostoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto!=null) { 
							this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto.jComboBoxid_cuenta_contableGastoDepreciacionCentroCosto.removeAllItems();

							for(CuentaContable cuentacontable:this.cuentacontablesForeignKey) {
								this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto.jComboBoxid_cuenta_contableGastoDepreciacionCentroCosto.addItem(cuentacontable);
							}
						}
					}

					if(this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto!=null) { 
					}

					if(!GastoDepreciacionCentroCostoJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdCuentaContable") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!GastoDepreciacionCentroCostoJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_cuenta_contableFK_IdCuentaContableGastoDepreciacionCentroCosto.removeAllItems();

							for(CuentaContable cuentacontable:this.cuentacontablesForeignKey) {
								this.jComboBoxid_cuenta_contableFK_IdCuentaContableGastoDepreciacionCentroCosto.addItem(cuentacontable);
							}
						}

						if(!GastoDepreciacionCentroCostoJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto!=null) {
							this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto.jComboBoxid_empresaGastoDepreciacionCentroCosto.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto!=null) {
							this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto.jComboBoxid_empresaGastoDepreciacionCentroCosto.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto!=null) {
							this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto.jComboBoxid_sucursalGastoDepreciacionCentroCosto.setSelectedItem(sucursal);
						}
					} else {
						if(this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto!=null) {
							this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto.jComboBoxid_sucursalGastoDepreciacionCentroCosto.setSelectedIndex(iIndexSelected);
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

		public void setSelectedItemCombosFrameCentroCostoForeignKey(CentroCosto centrocosto,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto!=null) {
							this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto.jComboBoxid_centro_costoGastoDepreciacionCentroCosto.setSelectedItem(centrocosto);
						}
					} else {
						if(this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto!=null) {
							this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto.jComboBoxid_centro_costoGastoDepreciacionCentroCosto.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_centro_costoFK_IdCentroCostoGastoDepreciacionCentroCosto.setSelectedItem(centrocosto);
						} else {
							this.jComboBoxid_centro_costoFK_IdCentroCostoGastoDepreciacionCentroCosto.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameDetalleActivoFijoForeignKey(DetalleActivoFijo detalleactivofijo,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto!=null) {
							this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto.jComboBoxid_detalle_activo_fijoGastoDepreciacionCentroCosto.setSelectedItem(detalleactivofijo);
						}
					} else {
						if(this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto!=null) {
							this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto.jComboBoxid_detalle_activo_fijoGastoDepreciacionCentroCosto.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_detalle_activo_fijoFK_IdDetalleActivoFijoGastoDepreciacionCentroCosto.setSelectedItem(detalleactivofijo);
						} else {
							this.jComboBoxid_detalle_activo_fijoFK_IdDetalleActivoFijoGastoDepreciacionCentroCosto.setSelectedIndex(iIndexSelected);
						}

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
						if(this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto!=null) {
							this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto.jComboBoxid_cuenta_contableGastoDepreciacionCentroCosto.setSelectedItem(cuentacontable);
						}
					} else {
						if(this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto!=null) {
							this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto.jComboBoxid_cuenta_contableGastoDepreciacionCentroCosto.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_cuenta_contableFK_IdCuentaContableGastoDepreciacionCentroCosto.setSelectedItem(cuentacontable);
						} else {
							this.jComboBoxid_cuenta_contableFK_IdCuentaContableGastoDepreciacionCentroCosto.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesGastoDepreciacionCentroCosto() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			GastoDepreciacionCentroCostoConstantesFunciones.refrescarForeignKeysDescripcionesGastoDepreciacionCentroCosto(this.gastodepreciacioncentrocostoLogic.getGastoDepreciacionCentroCostos());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			GastoDepreciacionCentroCostoConstantesFunciones.refrescarForeignKeysDescripcionesGastoDepreciacionCentroCosto(this.gastodepreciacioncentrocostos);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
		classes.add(new Classe(Sucursal.class));
		classes.add(new Classe(CentroCosto.class));
		classes.add(new Classe(DetalleActivoFijo.class));
		classes.add(new Classe(CuentaContable.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//gastodepreciacioncentrocostoLogic.setGastoDepreciacionCentroCostos(this.gastodepreciacioncentrocostos);
			gastodepreciacioncentrocostoLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public GastoDepreciacionCentroCostoParameterReturnGeneral getGastoDepreciacionCentroCostoParameterGeneral() {
		return this.gastodepreciacioncentrocostoParameterGeneral;
	}
	
	public void setGastoDepreciacionCentroCostoParameterGeneral(GastoDepreciacionCentroCostoParameterReturnGeneral gastodepreciacioncentrocostoParameterGeneral) {
		this.gastodepreciacioncentrocostoParameterGeneral = gastodepreciacioncentrocostoParameterGeneral;
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
	
	public Boolean getIsPermisoTodoGastoDepreciacionCentroCosto() {
		return isPermisoTodoGastoDepreciacionCentroCosto;
	}

	public void setIsPermisoTodoGastoDepreciacionCentroCosto(Boolean isPermisoTodoGastoDepreciacionCentroCosto) {
		this.isPermisoTodoGastoDepreciacionCentroCosto = isPermisoTodoGastoDepreciacionCentroCosto;
	}

	public Boolean getIsPermisoNuevoGastoDepreciacionCentroCosto() {
		return isPermisoNuevoGastoDepreciacionCentroCosto;
	}

	public void setIsPermisoNuevoGastoDepreciacionCentroCosto(Boolean isPermisoNuevoGastoDepreciacionCentroCosto) {
		this.isPermisoNuevoGastoDepreciacionCentroCosto = isPermisoNuevoGastoDepreciacionCentroCosto;
	}

	public Boolean getIsPermisoActualizarGastoDepreciacionCentroCosto() {
		return isPermisoActualizarGastoDepreciacionCentroCosto;
	}

	public void setIsPermisoActualizarGastoDepreciacionCentroCosto(Boolean isPermisoActualizarGastoDepreciacionCentroCosto) {
		this.isPermisoActualizarGastoDepreciacionCentroCosto = isPermisoActualizarGastoDepreciacionCentroCosto;
	}

	public Boolean getIsPermisoEliminarGastoDepreciacionCentroCosto() {
		return isPermisoEliminarGastoDepreciacionCentroCosto;
	}

	public void setIsPermisoEliminarGastoDepreciacionCentroCosto(Boolean isPermisoEliminarGastoDepreciacionCentroCosto) {
		this.isPermisoEliminarGastoDepreciacionCentroCosto = isPermisoEliminarGastoDepreciacionCentroCosto;
	}

	public Boolean getIsPermisoGuardarCambiosGastoDepreciacionCentroCosto() {
		return isPermisoGuardarCambiosGastoDepreciacionCentroCosto;
	}

	public void setIsPermisoGuardarCambiosGastoDepreciacionCentroCosto(Boolean isPermisoGuardarCambiosGastoDepreciacionCentroCosto) {
		this.isPermisoGuardarCambiosGastoDepreciacionCentroCosto = isPermisoGuardarCambiosGastoDepreciacionCentroCosto;
	}
	
	public Boolean getIsPermisoConsultaGastoDepreciacionCentroCosto() {
		return isPermisoConsultaGastoDepreciacionCentroCosto;
	}

	public void setIsPermisoConsultaGastoDepreciacionCentroCosto(Boolean isPermisoConsultaGastoDepreciacionCentroCosto) {
		this.isPermisoConsultaGastoDepreciacionCentroCosto = isPermisoConsultaGastoDepreciacionCentroCosto;
	}

	public Boolean getIsPermisoBusquedaGastoDepreciacionCentroCosto() {
		return isPermisoBusquedaGastoDepreciacionCentroCosto;
	}

	public void setIsPermisoBusquedaGastoDepreciacionCentroCosto(Boolean isPermisoBusquedaGastoDepreciacionCentroCosto) {
		this.isPermisoBusquedaGastoDepreciacionCentroCosto = isPermisoBusquedaGastoDepreciacionCentroCosto;
	}

	public Boolean getIsPermisoReporteGastoDepreciacionCentroCosto() {
		return isPermisoReporteGastoDepreciacionCentroCosto;
	}

	public void setIsPermisoReporteGastoDepreciacionCentroCosto(Boolean isPermisoReporteGastoDepreciacionCentroCosto) {
		this.isPermisoReporteGastoDepreciacionCentroCosto = isPermisoReporteGastoDepreciacionCentroCosto;
	}
	
	public Boolean getIsPermisoPaginacionMedioGastoDepreciacionCentroCosto() {
		return isPermisoPaginacionMedioGastoDepreciacionCentroCosto;
	}

	public void setIsPermisoPaginacionMedioGastoDepreciacionCentroCosto(Boolean isPermisoPaginacionMedioGastoDepreciacionCentroCosto) {
		this.isPermisoPaginacionMedioGastoDepreciacionCentroCosto = isPermisoPaginacionMedioGastoDepreciacionCentroCosto;
	}
	
	public Boolean getIsPermisoPaginacionTodoGastoDepreciacionCentroCosto() {
		return isPermisoPaginacionTodoGastoDepreciacionCentroCosto;
	}

	public void setIsPermisoPaginacionTodoGastoDepreciacionCentroCosto(Boolean isPermisoPaginacionTodoGastoDepreciacionCentroCosto) {
		this.isPermisoPaginacionTodoGastoDepreciacionCentroCosto = isPermisoPaginacionTodoGastoDepreciacionCentroCosto;
	}
	
	public Boolean getIsPermisoPaginacionAltoGastoDepreciacionCentroCosto() {
		return isPermisoPaginacionAltoGastoDepreciacionCentroCosto;
	}

	public void setIsPermisoPaginacionAltoGastoDepreciacionCentroCosto(Boolean isPermisoPaginacionAltoGastoDepreciacionCentroCosto) {
		this.isPermisoPaginacionAltoGastoDepreciacionCentroCosto = isPermisoPaginacionAltoGastoDepreciacionCentroCosto;
	}
	
	public Boolean getIsPermisoCopiarGastoDepreciacionCentroCosto() {
		return isPermisoCopiarGastoDepreciacionCentroCosto;
	}

	public void setIsPermisoCopiarGastoDepreciacionCentroCosto(Boolean isPermisoCopiarGastoDepreciacionCentroCosto) {
		this.isPermisoCopiarGastoDepreciacionCentroCosto = isPermisoCopiarGastoDepreciacionCentroCosto;
	}
	
	public Boolean getIsPermisoVerFormGastoDepreciacionCentroCosto() {
		return isPermisoVerFormGastoDepreciacionCentroCosto;
	}

	public void setIsPermisoVerFormGastoDepreciacionCentroCosto(Boolean isPermisoVerFormGastoDepreciacionCentroCosto) {
		this.isPermisoVerFormGastoDepreciacionCentroCosto = isPermisoVerFormGastoDepreciacionCentroCosto;
	}
	
	public Boolean getIsPermisoDuplicarGastoDepreciacionCentroCosto() {
		return isPermisoDuplicarGastoDepreciacionCentroCosto;
	}

	public void setIsPermisoDuplicarGastoDepreciacionCentroCosto(Boolean isPermisoDuplicarGastoDepreciacionCentroCosto) {
		this.isPermisoDuplicarGastoDepreciacionCentroCosto = isPermisoDuplicarGastoDepreciacionCentroCosto;
	}
	
	public Boolean getIsPermisoOrdenGastoDepreciacionCentroCosto() {
		return isPermisoOrdenGastoDepreciacionCentroCosto;
	}

	public void setIsPermisoOrdenGastoDepreciacionCentroCosto(Boolean isPermisoOrdenGastoDepreciacionCentroCosto) {
		this.isPermisoOrdenGastoDepreciacionCentroCosto = isPermisoOrdenGastoDepreciacionCentroCosto;
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
	
	public Boolean getIsVisibilidadCeldaNuevoGastoDepreciacionCentroCosto() {
		return isVisibilidadCeldaNuevoGastoDepreciacionCentroCosto;
	}

	public void setIsVisibilidadCeldaNuevoGastoDepreciacionCentroCosto(Boolean isVisibilidadCeldaNuevoGastoDepreciacionCentroCosto) {
		this.isVisibilidadCeldaNuevoGastoDepreciacionCentroCosto = isVisibilidadCeldaNuevoGastoDepreciacionCentroCosto;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarGastoDepreciacionCentroCosto() {
		return isVisibilidadCeldaDuplicarGastoDepreciacionCentroCosto;
	}

	public void setIsVisibilidadCeldaDuplicarGastoDepreciacionCentroCosto(Boolean isVisibilidadCeldaDuplicarGastoDepreciacionCentroCosto) {
		this.isVisibilidadCeldaDuplicarGastoDepreciacionCentroCosto = isVisibilidadCeldaDuplicarGastoDepreciacionCentroCosto;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarGastoDepreciacionCentroCosto() {
		return isVisibilidadCeldaCopiarGastoDepreciacionCentroCosto;
	}

	public void setIsVisibilidadCeldaCopiarGastoDepreciacionCentroCosto(Boolean isVisibilidadCeldaCopiarGastoDepreciacionCentroCosto) {
		this.isVisibilidadCeldaCopiarGastoDepreciacionCentroCosto = isVisibilidadCeldaCopiarGastoDepreciacionCentroCosto;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormGastoDepreciacionCentroCosto() {
		return isVisibilidadCeldaVerFormGastoDepreciacionCentroCosto;
	}

	public void setIsVisibilidadCeldaVerFormGastoDepreciacionCentroCosto(Boolean isVisibilidadCeldaVerFormGastoDepreciacionCentroCosto) {
		this.isVisibilidadCeldaVerFormGastoDepreciacionCentroCosto = isVisibilidadCeldaVerFormGastoDepreciacionCentroCosto;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenGastoDepreciacionCentroCosto() {
		return isVisibilidadCeldaOrdenGastoDepreciacionCentroCosto;
	}

	public void setIsVisibilidadCeldaOrdenGastoDepreciacionCentroCosto(Boolean isVisibilidadCeldaOrdenGastoDepreciacionCentroCosto) {
		this.isVisibilidadCeldaOrdenGastoDepreciacionCentroCosto = isVisibilidadCeldaOrdenGastoDepreciacionCentroCosto;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesGastoDepreciacionCentroCosto() {
		return isVisibilidadCeldaNuevoRelacionesGastoDepreciacionCentroCosto;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesGastoDepreciacionCentroCosto(Boolean isVisibilidadCeldaNuevoRelacionesGastoDepreciacionCentroCosto) {
		this.isVisibilidadCeldaNuevoRelacionesGastoDepreciacionCentroCosto = isVisibilidadCeldaNuevoRelacionesGastoDepreciacionCentroCosto;
	}
	
	public Boolean getIsVisibilidadCeldaModificarGastoDepreciacionCentroCosto() {
		return isVisibilidadCeldaModificarGastoDepreciacionCentroCosto;
	}

	public void setIsVisibilidadCeldaModificarGastoDepreciacionCentroCosto(Boolean isVisibilidadCeldaModificarGastoDepreciacionCentroCosto) {
		this.isVisibilidadCeldaModificarGastoDepreciacionCentroCosto = isVisibilidadCeldaModificarGastoDepreciacionCentroCosto;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarGastoDepreciacionCentroCosto() {
		return isVisibilidadCeldaActualizarGastoDepreciacionCentroCosto;
	}

	public void setIsVisibilidadCeldaActualizarGastoDepreciacionCentroCosto(Boolean isVisibilidadCeldaActualizarGastoDepreciacionCentroCosto) {
		this.isVisibilidadCeldaActualizarGastoDepreciacionCentroCosto = isVisibilidadCeldaActualizarGastoDepreciacionCentroCosto;
	}

	public Boolean getIsVisibilidadCeldaEliminarGastoDepreciacionCentroCosto() {
		return isVisibilidadCeldaEliminarGastoDepreciacionCentroCosto;
	}

	public void setIsVisibilidadCeldaEliminarGastoDepreciacionCentroCosto(Boolean isVisibilidadCeldaEliminarGastoDepreciacionCentroCosto) {
		this.isVisibilidadCeldaEliminarGastoDepreciacionCentroCosto = isVisibilidadCeldaEliminarGastoDepreciacionCentroCosto;
	}

	public Boolean getIsVisibilidadCeldaCancelarGastoDepreciacionCentroCosto() {
		return isVisibilidadCeldaCancelarGastoDepreciacionCentroCosto;
	}

	public void setIsVisibilidadCeldaCancelarGastoDepreciacionCentroCosto(Boolean isVisibilidadCeldaCancelarGastoDepreciacionCentroCosto) {
		this.isVisibilidadCeldaCancelarGastoDepreciacionCentroCosto = isVisibilidadCeldaCancelarGastoDepreciacionCentroCosto;
	}

	public Boolean getIsVisibilidadCeldaGuardarGastoDepreciacionCentroCosto() {
		return isVisibilidadCeldaGuardarGastoDepreciacionCentroCosto;
	}

	public void setIsVisibilidadCeldaGuardarGastoDepreciacionCentroCosto(Boolean isVisibilidadCeldaGuardarGastoDepreciacionCentroCosto) {
		this.isVisibilidadCeldaGuardarGastoDepreciacionCentroCosto = isVisibilidadCeldaGuardarGastoDepreciacionCentroCosto;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosGastoDepreciacionCentroCosto() {
		return isVisibilidadCeldaGuardarCambiosGastoDepreciacionCentroCosto;
	}

	public void setIsVisibilidadCeldaGuardarCambiosGastoDepreciacionCentroCosto(Boolean isVisibilidadCeldaGuardarCambiosGastoDepreciacionCentroCosto) {
		this.isVisibilidadCeldaGuardarCambiosGastoDepreciacionCentroCosto = isVisibilidadCeldaGuardarCambiosGastoDepreciacionCentroCosto;
	}
		
	public GastoDepreciacionCentroCostoSessionBean getgastodepreciacioncentrocostoSessionBean() {
		return this.gastodepreciacioncentrocostoSessionBean;
	}
	
	public void setgastodepreciacioncentrocostoSessionBean(GastoDepreciacionCentroCostoSessionBean gastodepreciacioncentrocostoSessionBean) {
		this.gastodepreciacioncentrocostoSessionBean=gastodepreciacioncentrocostoSessionBean;
	}
	
	
	public Boolean getisVisibilidadFK_IdCentroCosto() {
		return this.isVisibilidadFK_IdCentroCosto;
	}

	public void setisVisibilidadFK_IdCentroCosto(Boolean isVisibilidadFK_IdCentroCosto) {
		this.isVisibilidadFK_IdCentroCosto=isVisibilidadFK_IdCentroCosto;
	}

	public Boolean getisVisibilidadFK_IdCuentaContable() {
		return this.isVisibilidadFK_IdCuentaContable;
	}

	public void setisVisibilidadFK_IdCuentaContable(Boolean isVisibilidadFK_IdCuentaContable) {
		this.isVisibilidadFK_IdCuentaContable=isVisibilidadFK_IdCuentaContable;
	}

	public Boolean getisVisibilidadFK_IdDetalleActivoFijo() {
		return this.isVisibilidadFK_IdDetalleActivoFijo;
	}

	public void setisVisibilidadFK_IdDetalleActivoFijo(Boolean isVisibilidadFK_IdDetalleActivoFijo) {
		this.isVisibilidadFK_IdDetalleActivoFijo=isVisibilidadFK_IdDetalleActivoFijo;
	}

	public Boolean getisVisibilidadFK_IdEmpresa() {
		return this.isVisibilidadFK_IdEmpresa;
	}

	public void setisVisibilidadFK_IdEmpresa(Boolean isVisibilidadFK_IdEmpresa) {
		this.isVisibilidadFK_IdEmpresa=isVisibilidadFK_IdEmpresa;
	}

	public Boolean getisVisibilidadFK_IdSucursal() {
		return this.isVisibilidadFK_IdSucursal;
	}

	public void setisVisibilidadFK_IdSucursal(Boolean isVisibilidadFK_IdSucursal) {
		this.isVisibilidadFK_IdSucursal=isVisibilidadFK_IdSucursal;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysGastoDepreciacionCentroCosto(GastoDepreciacionCentroCosto gastodepreciacioncentrocosto)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(gastodepreciacioncentrocosto,null);
				this.setActualParaGuardarSucursalForeignKey(gastodepreciacioncentrocosto,null);
				this.setActualParaGuardarCentroCostoForeignKey(gastodepreciacioncentrocosto,null);
				this.setActualParaGuardarDetalleActivoFijoForeignKey(gastodepreciacioncentrocosto,null);
				this.setActualParaGuardarCuentaContableForeignKey(gastodepreciacioncentrocosto,null);
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
	
	public void bugActualizarReferenciaActual(GastoDepreciacionCentroCosto gastodepreciacioncentrocosto,GastoDepreciacionCentroCosto gastodepreciacioncentrocostoAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalGastoDepreciacionCentroCosto(gastodepreciacioncentrocosto);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		gastodepreciacioncentrocostoAux.setId(gastodepreciacioncentrocosto.getId());
		gastodepreciacioncentrocostoAux.setVersionRow(gastodepreciacioncentrocosto.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessGastoDepreciacionCentroCosto();
		
			int intSelectedRow = this.jTableDatosGastoDepreciacionCentroCosto.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.gastodepreciacioncentrocosto =(GastoDepreciacionCentroCosto) this.gastodepreciacioncentrocostoLogic.getGastoDepreciacionCentroCostos().toArray()[this.jTableDatosGastoDepreciacionCentroCosto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.gastodepreciacioncentrocosto =(GastoDepreciacionCentroCosto) this.gastodepreciacioncentrocostos.toArray()[this.jTableDatosGastoDepreciacionCentroCosto.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(GastoDepreciacionCentroCostoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualGastoDepreciacionCentroCosto(this.gastodepreciacioncentrocosto,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysGastoDepreciacionCentroCosto(this.gastodepreciacioncentrocosto);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = gastodepreciacioncentrocostoValidator.getInvalidValues(this.gastodepreciacioncentrocosto);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			gastodepreciacioncentrocostoLogic.setDatosCliente(datosCliente);
			gastodepreciacioncentrocostoLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				gastodepreciacioncentrocostoAux=new  GastoDepreciacionCentroCosto();
				
				gastodepreciacioncentrocostoAux.setIsNew(true);
				gastodepreciacioncentrocostoAux.setIsChanged(true);
				
				gastodepreciacioncentrocostoAux.setGastoDepreciacionCentroCostoOriginal(this.gastodepreciacioncentrocosto);
				
				gastodepreciacioncentrocostoAux.setId(this.gastodepreciacioncentrocosto.getId());	
				gastodepreciacioncentrocostoAux.setVersionRow(this.gastodepreciacioncentrocosto.getVersionRow());	
				gastodepreciacioncentrocostoAux.setid_empresa(this.gastodepreciacioncentrocosto.getid_empresa());	
				gastodepreciacioncentrocostoAux.setid_sucursal(this.gastodepreciacioncentrocosto.getid_sucursal());	
				gastodepreciacioncentrocostoAux.setid_centro_costo(this.gastodepreciacioncentrocosto.getid_centro_costo());	
				gastodepreciacioncentrocostoAux.setid_detalle_activo_fijo(this.gastodepreciacioncentrocosto.getid_detalle_activo_fijo());	
				gastodepreciacioncentrocostoAux.setid_cuenta_contable(this.gastodepreciacioncentrocosto.getid_cuenta_contable());	
				gastodepreciacioncentrocostoAux.setporcentaje(this.gastodepreciacioncentrocosto.getporcentaje());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.gastodepreciacioncentrocostoSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.gastodepreciacioncentrocostoSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(gastodepreciacioncentrocostoAux,gastodepreciacioncentrocostoLogic.getGastoDepreciacionCentroCostos());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(gastodepreciacioncentrocostoAux,gastodepreciacioncentrocostos);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.gastodepreciacioncentrocostoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.gastodepreciacioncentrocostoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						gastodepreciacioncentrocostoLogic.saveGastoDepreciacionCentroCostos();//WithConnection
						//gastodepreciacioncentrocostoLogic.getSetVersionRowGastoDepreciacionCentroCostos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.gastodepreciacioncentrocosto,gastodepreciacioncentrocostoAux);
					
					this.refrescarForeignKeysDescripcionesGastoDepreciacionCentroCosto();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.gastodepreciacioncentrocostoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE	
						
						if(!this.gastodepreciacioncentrocostoSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								gastodepreciacioncentrocostoLogic.saveGastoDepreciacionCentroCostoRelaciones(gastodepreciacioncentrocostoAux);//WithConnection
								//gastodepreciacioncentrocostoLogic.getSetVersionRowGastoDepreciacionCentroCostos();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.gastodepreciacioncentrocosto,gastodepreciacioncentrocostoAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE	
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.gastodepreciacioncentrocostoSessionBean.getEstaModoGuardarRelaciones() 
									|| this.gastodepreciacioncentrocostoSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(gastodepreciacioncentrocostoAux,gastodepreciacioncentrocostoLogic.getGastoDepreciacionCentroCostos());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(gastodepreciacioncentrocostoAux,gastodepreciacioncentrocostos);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.gastodepreciacioncentrocosto,gastodepreciacioncentrocostoAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				gastodepreciacioncentrocostoAux=new  GastoDepreciacionCentroCosto();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.gastodepreciacioncentrocostoSessionBean.getEsGuardarRelacionado() 
					|| (this.gastodepreciacioncentrocostoSessionBean.getEsGuardarRelacionado() && this.gastodepreciacioncentrocosto.getId()>=0)) {
						
					gastodepreciacioncentrocostoAux.setIsNew(false);
				}
				
				gastodepreciacioncentrocostoAux.setIsDeleted(false);
			
				gastodepreciacioncentrocostoAux.setId(this.gastodepreciacioncentrocosto.getId());	
				gastodepreciacioncentrocostoAux.setVersionRow(this.gastodepreciacioncentrocosto.getVersionRow());	
				gastodepreciacioncentrocostoAux.setid_empresa(this.gastodepreciacioncentrocosto.getid_empresa());	
				gastodepreciacioncentrocostoAux.setid_sucursal(this.gastodepreciacioncentrocosto.getid_sucursal());	
				gastodepreciacioncentrocostoAux.setid_centro_costo(this.gastodepreciacioncentrocosto.getid_centro_costo());	
				gastodepreciacioncentrocostoAux.setid_detalle_activo_fijo(this.gastodepreciacioncentrocosto.getid_detalle_activo_fijo());	
				gastodepreciacioncentrocostoAux.setid_cuenta_contable(this.gastodepreciacioncentrocosto.getid_cuenta_contable());	
				gastodepreciacioncentrocostoAux.setporcentaje(this.gastodepreciacioncentrocosto.getporcentaje());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(gastodepreciacioncentrocostoAux,gastodepreciacioncentrocostoLogic.getGastoDepreciacionCentroCostos());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(gastodepreciacioncentrocostoAux,gastodepreciacioncentrocostos);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.gastodepreciacioncentrocostoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.gastodepreciacioncentrocostoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						gastodepreciacioncentrocostoLogic.saveGastoDepreciacionCentroCostos();//WithConnection
						//gastodepreciacioncentrocostoLogic.getSetVersionRowGastoDepreciacionCentroCostos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.gastodepreciacioncentrocosto,gastodepreciacioncentrocostoAux);
					
					this.refrescarForeignKeysDescripcionesGastoDepreciacionCentroCosto();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.gastodepreciacioncentrocostoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						if(!this.gastodepreciacioncentrocostoSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								gastodepreciacioncentrocostoLogic.saveGastoDepreciacionCentroCostoRelaciones(gastodepreciacioncentrocostoAux);//WithConnection
								//gastodepreciacioncentrocostoLogic.getSetVersionRowGastoDepreciacionCentroCostos();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.gastodepreciacioncentrocosto,gastodepreciacioncentrocostoAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.gastodepreciacioncentrocostoSessionBean.getEstaModoGuardarRelaciones() 
									|| this.gastodepreciacioncentrocostoSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(gastodepreciacioncentrocostoAux,gastodepreciacioncentrocostoLogic.getGastoDepreciacionCentroCostos());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(gastodepreciacioncentrocostoAux,gastodepreciacioncentrocostos);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.gastodepreciacioncentrocosto,gastodepreciacioncentrocostoAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				gastodepreciacioncentrocostoAux=new  GastoDepreciacionCentroCosto();
				
				gastodepreciacioncentrocostoAux.setIsNew(false);
				gastodepreciacioncentrocostoAux.setIsChanged(false);
				
				gastodepreciacioncentrocostoAux.setIsDeleted(true);
				
				gastodepreciacioncentrocostoAux.setId(this.gastodepreciacioncentrocosto.getId());	
				gastodepreciacioncentrocostoAux.setVersionRow(this.gastodepreciacioncentrocosto.getVersionRow());	
				gastodepreciacioncentrocostoAux.setid_empresa(this.gastodepreciacioncentrocosto.getid_empresa());	
				gastodepreciacioncentrocostoAux.setid_sucursal(this.gastodepreciacioncentrocosto.getid_sucursal());	
				gastodepreciacioncentrocostoAux.setid_centro_costo(this.gastodepreciacioncentrocosto.getid_centro_costo());	
				gastodepreciacioncentrocostoAux.setid_detalle_activo_fijo(this.gastodepreciacioncentrocosto.getid_detalle_activo_fijo());	
				gastodepreciacioncentrocostoAux.setid_cuenta_contable(this.gastodepreciacioncentrocosto.getid_cuenta_contable());	
				gastodepreciacioncentrocostoAux.setporcentaje(this.gastodepreciacioncentrocosto.getporcentaje());	
				
				if(this.gastodepreciacioncentrocostoSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.gastodepreciacioncentrocostoAux.getId()>=0) {	
						this.gastodepreciacioncentrocostosEliminados.add(gastodepreciacioncentrocostoAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(gastodepreciacioncentrocostoAux,gastodepreciacioncentrocostoLogic.getGastoDepreciacionCentroCostos());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(gastodepreciacioncentrocostoAux,gastodepreciacioncentrocostos);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.gastodepreciacioncentrocostoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.gastodepreciacioncentrocostoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						gastodepreciacioncentrocostoLogic.saveGastoDepreciacionCentroCostos();//WithConnection
						//gastodepreciacioncentrocostoLogic.getSetVersionRowGastoDepreciacionCentroCostos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.gastodepreciacioncentrocostoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						
						if(!this.gastodepreciacioncentrocostoSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								gastodepreciacioncentrocostoLogic.saveGastoDepreciacionCentroCostoRelaciones(gastodepreciacioncentrocostoAux);//WithConnection
								//gastodepreciacioncentrocostoLogic.getSetVersionRowGastoDepreciacionCentroCostos();//WithConnection
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
							if(this.gastodepreciacioncentrocostoSessionBean.getEstaModoGuardarRelaciones() 
								|| this.gastodepreciacioncentrocostoSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(gastodepreciacioncentrocostoAux,gastodepreciacioncentrocostoLogic.getGastoDepreciacionCentroCostos());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(gastodepreciacioncentrocostoAux,gastodepreciacioncentrocostos);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.gastodepreciacioncentrocostoLogic.getGastoDepreciacionCentroCostos().addAll(this.gastodepreciacioncentrocostosEliminados);
					
					gastodepreciacioncentrocostoLogic.saveGastoDepreciacionCentroCostos();//WithConnection
					//gastodepreciacioncentrocostoLogic.getSetVersionRowGastoDepreciacionCentroCostos();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesGastoDepreciacionCentroCosto();
				
				this.gastodepreciacioncentrocostosEliminados= new ArrayList<GastoDepreciacionCentroCosto>();		
			}
			
			if(this.gastodepreciacioncentrocostoSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.gastodepreciacioncentrocostoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Gasto Depreciacion Centro Costo GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Gasto Depreciacion Centro Costo",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.gastodepreciacioncentrocosto=gastodepreciacioncentrocostoAux;
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
      		//this.finishProcessGastoDepreciacionCentroCosto();
      	}
		
	}	
	
	public void actualizarRelaciones(GastoDepreciacionCentroCosto gastodepreciacioncentrocostoLocal) throws Exception {
		
		if(this.gastodepreciacioncentrocostoSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(GastoDepreciacionCentroCosto gastodepreciacioncentrocostoLocal) throws Exception {	
		if(this.gastodepreciacioncentrocostoSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				gastodepreciacioncentrocostoLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(SucursalDetalleFormJInternalFrame.class)) {
				SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrameLocal=(SucursalBeanSwingJInternalFrame) ((SucursalDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				sucursalBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoSucursal(sucursalBeanSwingJInternalFrameLocal.getsucursal(),true);
				sucursalBeanSwingJInternalFrameLocal.actualizarLista(sucursalBeanSwingJInternalFrameLocal.sucursal,this.sucursalsForeignKey);

				sucursalBeanSwingJInternalFrameLocal.actualizarRelaciones(sucursalBeanSwingJInternalFrameLocal.sucursal);

				gastodepreciacioncentrocostoLocal.setSucursal(sucursalBeanSwingJInternalFrameLocal.sucursal);

				this.addItemDefectoCombosForeignKeySucursal();
				this.cargarCombosFrameSucursalsForeignKey("Formulario");
				this.setActualSucursalForeignKey(sucursalBeanSwingJInternalFrameLocal.sucursal.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(CentroCostoDetalleFormJInternalFrame.class)) {
				CentroCostoBeanSwingJInternalFrame centrocostoBeanSwingJInternalFrameLocal=(CentroCostoBeanSwingJInternalFrame) ((CentroCostoDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				centrocostoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoCentroCosto(centrocostoBeanSwingJInternalFrameLocal.getcentrocosto(),true);
				centrocostoBeanSwingJInternalFrameLocal.actualizarLista(centrocostoBeanSwingJInternalFrameLocal.centrocosto,this.centrocostosForeignKey);

				centrocostoBeanSwingJInternalFrameLocal.actualizarRelaciones(centrocostoBeanSwingJInternalFrameLocal.centrocosto);

				gastodepreciacioncentrocostoLocal.setCentroCosto(centrocostoBeanSwingJInternalFrameLocal.centrocosto);

				this.addItemDefectoCombosForeignKeyCentroCosto();
				this.cargarCombosFrameCentroCostosForeignKey("Formulario");
				this.setActualCentroCostoForeignKey(centrocostoBeanSwingJInternalFrameLocal.centrocosto.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(DetalleActivoFijoDetalleFormJInternalFrame.class)) {
				DetalleActivoFijoBeanSwingJInternalFrame detalleactivofijoBeanSwingJInternalFrameLocal=(DetalleActivoFijoBeanSwingJInternalFrame) ((DetalleActivoFijoDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				detalleactivofijoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoDetalleActivoFijo(detalleactivofijoBeanSwingJInternalFrameLocal.getdetalleactivofijo(),true);
				detalleactivofijoBeanSwingJInternalFrameLocal.actualizarLista(detalleactivofijoBeanSwingJInternalFrameLocal.detalleactivofijo,this.detalleactivofijosForeignKey);

				detalleactivofijoBeanSwingJInternalFrameLocal.actualizarRelaciones(detalleactivofijoBeanSwingJInternalFrameLocal.detalleactivofijo);

				gastodepreciacioncentrocostoLocal.setDetalleActivoFijo(detalleactivofijoBeanSwingJInternalFrameLocal.detalleactivofijo);

				this.addItemDefectoCombosForeignKeyDetalleActivoFijo();
				this.cargarCombosFrameDetalleActivoFijosForeignKey("Formulario");
				this.setActualDetalleActivoFijoForeignKey(detalleactivofijoBeanSwingJInternalFrameLocal.detalleactivofijo.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(CuentaContableDetalleFormJInternalFrame.class)) {
				CuentaContableBeanSwingJInternalFrame cuentacontableBeanSwingJInternalFrameLocal=(CuentaContableBeanSwingJInternalFrame) ((CuentaContableDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				cuentacontableBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoCuentaContable(cuentacontableBeanSwingJInternalFrameLocal.getcuentacontable(),true);
				cuentacontableBeanSwingJInternalFrameLocal.actualizarLista(cuentacontableBeanSwingJInternalFrameLocal.cuentacontable,this.cuentacontablesForeignKey);

				cuentacontableBeanSwingJInternalFrameLocal.actualizarRelaciones(cuentacontableBeanSwingJInternalFrameLocal.cuentacontable);

				gastodepreciacioncentrocostoLocal.setCuentaContable(cuentacontableBeanSwingJInternalFrameLocal.cuentacontable);

				this.addItemDefectoCombosForeignKeyCuentaContable();
				this.cargarCombosFrameCuentaContablesForeignKey("Formulario");
				this.setActualCuentaContableForeignKey(cuentacontableBeanSwingJInternalFrameLocal.cuentacontable.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarGastoDepreciacionCentroCostoActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosGastoDepreciacionCentroCosto.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.gastodepreciacioncentrocosto =(GastoDepreciacionCentroCosto) this.gastodepreciacioncentrocostoLogic.getGastoDepreciacionCentroCostos().toArray()[this.jTableDatosGastoDepreciacionCentroCosto.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.gastodepreciacioncentrocosto =(GastoDepreciacionCentroCosto) this.gastodepreciacioncentrocostos.toArray()[this.jTableDatosGastoDepreciacionCentroCosto.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = gastodepreciacioncentrocostoValidator.getInvalidValues(this.gastodepreciacioncentrocosto);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(GastoDepreciacionCentroCosto gastodepreciacioncentrocosto,List<GastoDepreciacionCentroCosto> gastodepreciacioncentrocostos) throws Exception {
		try	{		
			GastoDepreciacionCentroCostoConstantesFunciones.actualizarLista(gastodepreciacioncentrocosto,gastodepreciacioncentrocostos,this.gastodepreciacioncentrocostoSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(GastoDepreciacionCentroCosto gastodepreciacioncentrocosto,List<GastoDepreciacionCentroCosto> gastodepreciacioncentrocostos) throws Exception {
		try	{			
			GastoDepreciacionCentroCostoConstantesFunciones.actualizarSelectedLista(gastodepreciacioncentrocosto,gastodepreciacioncentrocostos);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<GastoDepreciacionCentroCosto> gastodepreciacioncentrocostosLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				gastodepreciacioncentrocostosLocal=this.gastodepreciacioncentrocostoLogic.getGastoDepreciacionCentroCostos();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				gastodepreciacioncentrocostosLocal=this.gastodepreciacioncentrocostos;
			}
			//ARCHITECTURE
		
			for(GastoDepreciacionCentroCosto gastodepreciacioncentrocostoLocal:gastodepreciacioncentrocostosLocal) {
				if(this.permiteMantenimiento(gastodepreciacioncentrocostoLocal) && gastodepreciacioncentrocostoLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+GastoDepreciacionCentroCostoConstantesFunciones.getGastoDepreciacionCentroCostoLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(GastoDepreciacionCentroCostoConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto.jLabelid_empresaGastoDepreciacionCentroCosto,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(GastoDepreciacionCentroCostoConstantesFunciones.IDSUCURSAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto.jLabelid_sucursalGastoDepreciacionCentroCosto,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(GastoDepreciacionCentroCostoConstantesFunciones.IDCENTROCOSTO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto.jLabelid_centro_costoGastoDepreciacionCentroCosto,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(GastoDepreciacionCentroCostoConstantesFunciones.IDDETALLEACTIVOFIJO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto.jLabelid_detalle_activo_fijoGastoDepreciacionCentroCosto,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(GastoDepreciacionCentroCostoConstantesFunciones.IDCUENTACONTABLE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto.jLabelid_cuenta_contableGastoDepreciacionCentroCosto,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(GastoDepreciacionCentroCostoConstantesFunciones.PORCENTAJE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto.jLabelporcentajeGastoDepreciacionCentroCosto,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto.jLabelid_empresaGastoDepreciacionCentroCosto,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto.jLabelid_sucursalGastoDepreciacionCentroCosto,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto.jLabelid_centro_costoGastoDepreciacionCentroCosto,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto.jLabelid_detalle_activo_fijoGastoDepreciacionCentroCosto,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto.jLabelid_cuenta_contableGastoDepreciacionCentroCosto,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto.jLabelporcentajeGastoDepreciacionCentroCosto,"");
		
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
		this.iIdNuevoGastoDepreciacionCentroCosto--;	
		
		
		this.gastodepreciacioncentrocostoAux=new GastoDepreciacionCentroCosto();
		
		this.gastodepreciacioncentrocostoAux.setId(this.iIdNuevoGastoDepreciacionCentroCosto);
		this.gastodepreciacioncentrocostoAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.gastodepreciacioncentrocostoLogic.getGastoDepreciacionCentroCostos().add(this.gastodepreciacioncentrocostoAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.gastodepreciacioncentrocostos.add(this.gastodepreciacioncentrocostoAux);
		}
		//ARCHITECTURE
		
		this.gastodepreciacioncentrocosto=this.gastodepreciacioncentrocostoAux;
		
		if(GastoDepreciacionCentroCostoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioGastoDepreciacionCentroCosto(this.gastodepreciacioncentrocosto);
			this.setVariablesObjetoActualToFormularioForeignKeyGastoDepreciacionCentroCosto(this.gastodepreciacioncentrocosto);
		}
				
		//this.setDefaultControlesGastoDepreciacionCentroCosto();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyGastoDepreciacionCentroCosto();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyGastoDepreciacionCentroCosto();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyGastoDepreciacionCentroCosto();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualGastoDepreciacionCentroCosto(this.gastodepreciacioncentrocostoBean,this.gastodepreciacioncentrocosto,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysGastoDepreciacionCentroCosto(this.gastodepreciacioncentrocosto);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(GastoDepreciacionCentroCostoConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.gastodepreciacioncentrocostoSessionBean.getConGuardarRelaciones()) {
			classes=GastoDepreciacionCentroCostoConstantesFunciones.getClassesRelationshipsOfGastoDepreciacionCentroCosto(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.gastodepreciacioncentrocostoReturnGeneral=gastodepreciacioncentrocostoLogic.procesarEventosGastoDepreciacionCentroCostosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.gastodepreciacioncentrocostoLogic.getGastoDepreciacionCentroCostos(),this.gastodepreciacioncentrocosto,this.gastodepreciacioncentrocostoParameterGeneral,this.isEsNuevoGastoDepreciacionCentroCosto,classes);//this.gastodepreciacioncentrocostoLogic.getGastoDepreciacionCentroCosto()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanGastoDepreciacionCentroCosto(this.gastodepreciacioncentrocostoReturnGeneral,this.gastodepreciacioncentrocostoBean,false);
		
		if(this.gastodepreciacioncentrocostoReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyGastoDepreciacionCentroCosto(this.gastodepreciacioncentrocostoReturnGeneral.getGastoDepreciacionCentroCosto());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioGastoDepreciacionCentroCosto(this.gastodepreciacioncentrocostoReturnGeneral.getGastoDepreciacionCentroCosto());
		}
		
		if(this.gastodepreciacioncentrocostoReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioGastoDepreciacionCentroCosto(this.gastodepreciacioncentrocostoReturnGeneral.getGastoDepreciacionCentroCosto(),classes);//this.gastodepreciacioncentrocostoBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualGastoDepreciacionCentroCosto(this.gastodepreciacioncentrocosto,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyGastoDepreciacionCentroCosto();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyGastoDepreciacionCentroCosto();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			GastoDepreciacionCentroCostoBeanSwingJInternalFrameAdditional.RecargarFormGastoDepreciacionCentroCosto(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingGastoDepreciacionCentroCosto(false);
						
			if(gastodepreciacioncentrocostoSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(GastoDepreciacionCentroCostoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualGastoDepreciacionCentroCosto();
			}
			
			this.actualizarVisualTableDatosGastoDepreciacionCentroCosto();
			
			this.jTableDatosGastoDepreciacionCentroCosto.setRowSelectionInterval(this.getIndiceNuevoGastoDepreciacionCentroCosto(), this.getIndiceNuevoGastoDepreciacionCentroCosto());
			
			this.seleccionarFilaTablaGastoDepreciacionCentroCostoActual();
						
			this.actualizarEstadoCeldasBotonesGastoDepreciacionCentroCosto("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesGastoDepreciacionCentroCosto(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto.jTextFieldporcentajeGastoDepreciacionCentroCosto.setEnabled(isHabilitar && this.gastodepreciacioncentrocostoConstantesFunciones.activarporcentajeGastoDepreciacionCentroCosto);	
		//
		this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto.jComboBoxid_empresaGastoDepreciacionCentroCosto.setEnabled(isHabilitar && this.gastodepreciacioncentrocostoConstantesFunciones.activarid_empresaGastoDepreciacionCentroCosto);//
		this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto.jComboBoxid_sucursalGastoDepreciacionCentroCosto.setEnabled(isHabilitar && this.gastodepreciacioncentrocostoConstantesFunciones.activarid_sucursalGastoDepreciacionCentroCosto);
		this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto.jComboBoxid_centro_costoGastoDepreciacionCentroCosto.setEnabled(isHabilitar && this.gastodepreciacioncentrocostoConstantesFunciones.activarid_centro_costoGastoDepreciacionCentroCosto);
		this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto.jComboBoxid_detalle_activo_fijoGastoDepreciacionCentroCosto.setEnabled(isHabilitar && this.gastodepreciacioncentrocostoConstantesFunciones.activarid_detalle_activo_fijoGastoDepreciacionCentroCosto);
		this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto.jComboBoxid_cuenta_contableGastoDepreciacionCentroCosto.setEnabled(isHabilitar && this.gastodepreciacioncentrocostoConstantesFunciones.activarid_cuenta_contableGastoDepreciacionCentroCosto);
	};
	
	public void setDefaultControlesGastoDepreciacionCentroCosto() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoGastoDepreciacionCentroCosto(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.gastodepreciacioncentrocostoSessionBean.setConGuardarRelaciones(true);			
			this.gastodepreciacioncentrocostoSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto.jTabbedPaneRelacionesGastoDepreciacionCentroCosto.setVisible(true);
			
					
		} else {
			//this.gastodepreciacioncentrocostoSessionBean.setConGuardarRelaciones(false);			
			this.gastodepreciacioncentrocostoSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto.jTabbedPaneRelacionesGastoDepreciacionCentroCosto.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoGastoDepreciacionCentroCosto() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(GastoDepreciacionCentroCosto gastodepreciacioncentrocostoAux:this.gastodepreciacioncentrocostoLogic.getGastoDepreciacionCentroCostos()) {
				if(gastodepreciacioncentrocostoAux.getId().equals(this.iIdNuevoGastoDepreciacionCentroCosto)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(GastoDepreciacionCentroCosto gastodepreciacioncentrocostoAux:this.gastodepreciacioncentrocostos) {
				if(gastodepreciacioncentrocostoAux.getId().equals(this.iIdNuevoGastoDepreciacionCentroCosto)) {
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
	
	public int getIndiceActualGastoDepreciacionCentroCosto(GastoDepreciacionCentroCosto gastodepreciacioncentrocosto,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(GastoDepreciacionCentroCosto gastodepreciacioncentrocostoAux:this.gastodepreciacioncentrocostoLogic.getGastoDepreciacionCentroCostos()) {
				if(gastodepreciacioncentrocostoAux.getId().equals(gastodepreciacioncentrocosto.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(GastoDepreciacionCentroCosto gastodepreciacioncentrocostoAux:this.gastodepreciacioncentrocostos) {
				if(gastodepreciacioncentrocostoAux.getId().equals(gastodepreciacioncentrocosto.getId())) {
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
	
	public void setCamposBaseDesdeOriginalGastoDepreciacionCentroCosto(GastoDepreciacionCentroCosto gastodepreciacioncentrocostoOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(GastoDepreciacionCentroCosto gastodepreciacioncentrocostoAux:this.gastodepreciacioncentrocostoLogic.getGastoDepreciacionCentroCostos()) {
				if(gastodepreciacioncentrocostoAux.getGastoDepreciacionCentroCostoOriginal().getId().equals(gastodepreciacioncentrocostoOriginal.getId())) {
					existe=true;
					gastodepreciacioncentrocostoOriginal.setId(gastodepreciacioncentrocostoAux.getId());
					gastodepreciacioncentrocostoOriginal.setVersionRow(gastodepreciacioncentrocostoAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(GastoDepreciacionCentroCosto gastodepreciacioncentrocostoAux:this.gastodepreciacioncentrocostos) {
				if(gastodepreciacioncentrocostoAux.getGastoDepreciacionCentroCostoOriginal().getId().equals(gastodepreciacioncentrocostoOriginal.getId())) {
					existe=true;
					gastodepreciacioncentrocostoOriginal.setId(gastodepreciacioncentrocostoAux.getId());
					gastodepreciacioncentrocostoOriginal.setVersionRow(gastodepreciacioncentrocostoAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosGastoDepreciacionCentroCosto(Boolean esParaCancelar) throws Exception {
		gastodepreciacioncentrocostosAux=new ArrayList<GastoDepreciacionCentroCosto>();
		gastodepreciacioncentrocostoAux=new GastoDepreciacionCentroCosto();
		
		if(!this.gastodepreciacioncentrocostoSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(GastoDepreciacionCentroCosto gastodepreciacioncentrocostoAux:this.gastodepreciacioncentrocostoLogic.getGastoDepreciacionCentroCostos()) {
					if(gastodepreciacioncentrocostoAux.getId()<0) {
						gastodepreciacioncentrocostosAux.add(gastodepreciacioncentrocostoAux);
					}		
				}
				this.iIdNuevoGastoDepreciacionCentroCosto=0L;
				this.gastodepreciacioncentrocostoLogic.getGastoDepreciacionCentroCostos().removeAll(gastodepreciacioncentrocostosAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(GastoDepreciacionCentroCosto gastodepreciacioncentrocostoAux:this.gastodepreciacioncentrocostos) {
					if(gastodepreciacioncentrocostoAux.getId()<0) {
						gastodepreciacioncentrocostosAux.add(gastodepreciacioncentrocostoAux);
					}		
				}
				this.iIdNuevoGastoDepreciacionCentroCosto=0L;
				this.gastodepreciacioncentrocostos.removeAll(gastodepreciacioncentrocostosAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoGastoDepreciacionCentroCosto 
					&& this.gastodepreciacioncentrocostoLogic.getGastoDepreciacionCentroCostos().size()>0
					) {
					gastodepreciacioncentrocostoAux=this.gastodepreciacioncentrocostoLogic.getGastoDepreciacionCentroCostos().get(this.gastodepreciacioncentrocostoLogic.getGastoDepreciacionCentroCostos().size() - 1);
				
					if(gastodepreciacioncentrocostoAux.getId()<0) {
						this.gastodepreciacioncentrocostoLogic.getGastoDepreciacionCentroCostos().remove(gastodepreciacioncentrocostoAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoGastoDepreciacionCentroCosto && this.gastodepreciacioncentrocostos.size()>0) {
					gastodepreciacioncentrocostoAux=this.gastodepreciacioncentrocostos.get(this.gastodepreciacioncentrocostos.size() - 1);
				
					if(gastodepreciacioncentrocostoAux.getId()<0) {
						this.gastodepreciacioncentrocostos.remove(gastodepreciacioncentrocostoAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoGastoDepreciacionCentroCosto(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(gastodepreciacioncentrocosto.getId()<0) {
				this.gastodepreciacioncentrocostoLogic.getGastoDepreciacionCentroCostos().remove(this.gastodepreciacioncentrocosto);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(gastodepreciacioncentrocosto.getId()<0) {
				this.gastodepreciacioncentrocostos.remove(this.gastodepreciacioncentrocosto);
			}
		}			
	}
	
	public void setEstadosInicialesGastoDepreciacionCentroCosto(List<GastoDepreciacionCentroCosto> gastodepreciacioncentrocostosAux) throws Exception {
		GastoDepreciacionCentroCostoConstantesFunciones.setEstadosInicialesGastoDepreciacionCentroCosto(gastodepreciacioncentrocostosAux);
	}
	
	public void setEstadosInicialesGastoDepreciacionCentroCosto(GastoDepreciacionCentroCosto gastodepreciacioncentrocostoAux) throws Exception {
		GastoDepreciacionCentroCostoConstantesFunciones.setEstadosInicialesGastoDepreciacionCentroCosto(gastodepreciacioncentrocostoAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarGastoDepreciacionCentroCostoActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesGastoDepreciacionCentroCosto("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,GastoDepreciacionCentroCostoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarGastoDepreciacionCentroCostoActual()) {
				if(!this.isEsNuevoGastoDepreciacionCentroCosto) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesGastoDepreciacionCentroCosto("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoGastoDepreciacionCentroCosto=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,GastoDepreciacionCentroCostoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarGastoDepreciacionCentroCostoActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Gasto Depreciacion Centro Costo ?", "MANTENIMIENTO DE Gasto Depreciacion Centro Costo", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesGastoDepreciacionCentroCosto("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,GastoDepreciacionCentroCostoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GastoDepreciacionCentroCostoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(GastoDepreciacionCentroCosto gastodepreciacioncentrocosto) throws Exception {
		GastoDepreciacionCentroCostoConstantesFunciones.seleccionarAsignar(this.gastodepreciacioncentrocosto,gastodepreciacioncentrocosto);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarGastoDepreciacionCentroCosto=this.isPermisoActualizarOriginalGastoDepreciacionCentroCosto;
			
			
			this.seleccionarAsignar(gastodepreciacioncentrocosto);
			
			

			idCentroCostoActual=gastodepreciacioncentrocosto.getid_centro_costo();
			this.seleccionarCentroCostoActual();

			idCuentaContableActual=gastodepreciacioncentrocosto.getid_cuenta_contable();
			this.seleccionarCuentaContableActual();
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			GastoDepreciacionCentroCostoConstantesFunciones.quitarEspaciosGastoDepreciacionCentroCosto(this.gastodepreciacioncentrocosto,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesGastoDepreciacionCentroCosto("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GastoDepreciacionCentroCostoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.gastodepreciacioncentrocostoSessionBean.setsFuncionBusquedaRapida(this.gastodepreciacioncentrocostoSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GastoDepreciacionCentroCostoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	//BUSQUEDA INTERNA FK
	public void seleccionarCentroCostoActual() throws Exception {
		try	{
			CentroCosto centrocostoAux=new CentroCosto();

			if(this.idCentroCostoActual != null && this.idCentroCostoActual>0) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					centrocostoLogic.getEntityWithConnection(this.idCentroCostoActual);
					centrocostoAux= centrocostoLogic.getCentroCosto();
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE

				centrocostosForeignKey=new ArrayList<CentroCosto>();
				centrocostosForeignKey.add(centrocostoAux);
			}

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}
	public void seleccionarCuentaContableActual() throws Exception {
		try	{
			CuentaContable cuentacontableAux=new CuentaContable();

			if(this.idCuentaContableActual != null && this.idCuentaContableActual>0) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					cuentacontableLogic.getEntityWithConnection(this.idCuentaContableActual);
					cuentacontableAux= cuentacontableLogic.getCuentaContable();
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE

				cuentacontablesForeignKey=new ArrayList<CuentaContable>();
				cuentacontablesForeignKey.add(cuentacontableAux);
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
			if(this.isEsNuevoGastoDepreciacionCentroCosto) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosGastoDepreciacionCentroCosto(esParaCancelar);				
				this.cancelarNuevoGastoDepreciacionCentroCosto(esParaCancelar);								
			}
			
			this.gastodepreciacioncentrocosto=new GastoDepreciacionCentroCosto();
			
			this.inicializarGastoDepreciacionCentroCosto();
			
			this.actualizarEstadoCeldasBotonesGastoDepreciacionCentroCosto("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GastoDepreciacionCentroCostoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarGastoDepreciacionCentroCosto() throws Exception {
		try {
			GastoDepreciacionCentroCostoConstantesFunciones.inicializarGastoDepreciacionCentroCosto(this.gastodepreciacioncentrocosto);
			
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
			FuncionesSwing.manageException(this, e,logger,GastoDepreciacionCentroCostoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.gastodepreciacioncentrocostoLogic.getGastoDepreciacionCentroCostos().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GastoDepreciacionCentroCostoConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteGastoDepreciacionCentroCostos(String sAccionBusqueda,List<GastoDepreciacionCentroCosto> gastodepreciacioncentrocostosParaReportes) throws Exception {
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
					sPathReporteFinal="GastoDepreciacionCentroCosto"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="GastoDepreciacionCentroCostoMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("GastoDepreciacionCentroCostoMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="GastoDepreciacionCentroCosto"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Gasto Depreciacion Centro Costos");		
		parameters.put("busquedapor", GastoDepreciacionCentroCostoConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceGastoDepreciacionCentroCosto=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			GastoDepreciacionCentroCostoConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			GastoDepreciacionCentroCostoConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceGastoDepreciacionCentroCosto=new JRBeanArrayDataSource(GastoDepreciacionCentroCostoJInternalFrame.TraerGastoDepreciacionCentroCostoBeans(gastodepreciacioncentrocostosParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceGastoDepreciacionCentroCosto);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+GastoDepreciacionCentroCostoConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+GastoDepreciacionCentroCostoConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(GastoDepreciacionCentroCostoBean.TraerGastoDepreciacionCentroCostoBeans(gastodepreciacioncentrocostosParaReportes).toArray()));
							
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
				this.generarExcelReporteGastoDepreciacionCentroCostos(sAccionBusqueda,sTipoArchivoReporte,gastodepreciacioncentrocostosParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalGastoDepreciacionCentroCostos(sAccionBusqueda,sTipoArchivoReporte,gastodepreciacioncentrocostosParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoGastoDepreciacionCentroCostoActionPerformed(null);
					//this.generarExcelReporteGastoDepreciacionCentroCostos(sAccionBusqueda,sTipoArchivoReporte,gastodepreciacioncentrocostosParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalGastoDepreciacionCentroCostos(sAccionBusqueda,sTipoArchivoReporte,gastodepreciacioncentrocostosParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesGastoDepreciacionCentroCostos(sAccionBusqueda,sTipoArchivoReporte,gastodepreciacioncentrocostosParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesGastoDepreciacionCentroCostos(sAccionBusqueda,sTipoArchivoReporte,gastodepreciacioncentrocostosParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteGastoDepreciacionCentroCostos(String sAccionBusqueda,String sTipoArchivoReporte,List<GastoDepreciacionCentroCosto> gastodepreciacioncentrocostosParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"gastodepreciacioncentrocosto";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("GastoDepreciacionCentroCostos");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderGastoDepreciacionCentroCosto("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(GastoDepreciacionCentroCosto gastodepreciacioncentrocosto : gastodepreciacioncentrocostosParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			GastoDepreciacionCentroCostoConstantesFunciones.generarExcelReporteDataGastoDepreciacionCentroCosto("NORMAL",row,workbook,gastodepreciacioncentrocosto,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.gastodepreciacioncentrocostoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Gasto Depreciacion Centro Costo",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderGastoDepreciacionCentroCosto(String sTipo,Row row,Workbook workbook) {
		
		GastoDepreciacionCentroCostoConstantesFunciones.generarExcelReporteHeaderGastoDepreciacionCentroCosto(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalGastoDepreciacionCentroCostos(String sAccionBusqueda,String sTipoArchivoReporte,List<GastoDepreciacionCentroCosto> gastodepreciacioncentrocostosParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"gastodepreciacioncentrocosto_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("GastoDepreciacionCentroCostos");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(GastoDepreciacionCentroCosto gastodepreciacioncentrocosto : gastodepreciacioncentrocostosParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(GastoDepreciacionCentroCostoConstantesFunciones.getGastoDepreciacionCentroCostoDescripcion(gastodepreciacioncentrocosto));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(GastoDepreciacionCentroCostoConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(GastoDepreciacionCentroCostoConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(gastodepreciacioncentrocosto.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(GastoDepreciacionCentroCostoConstantesFunciones.LABEL_IDSUCURSAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(GastoDepreciacionCentroCostoConstantesFunciones.LABEL_IDSUCURSAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(gastodepreciacioncentrocosto.getsucursal_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(GastoDepreciacionCentroCostoConstantesFunciones.LABEL_IDCENTROCOSTO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(GastoDepreciacionCentroCostoConstantesFunciones.LABEL_IDCENTROCOSTO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(gastodepreciacioncentrocosto.getcentrocosto_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(GastoDepreciacionCentroCostoConstantesFunciones.LABEL_IDDETALLEACTIVOFIJO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(GastoDepreciacionCentroCostoConstantesFunciones.LABEL_IDDETALLEACTIVOFIJO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(gastodepreciacioncentrocosto.getdetalleactivofijo_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(GastoDepreciacionCentroCostoConstantesFunciones.LABEL_IDCUENTACONTABLE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(GastoDepreciacionCentroCostoConstantesFunciones.LABEL_IDCUENTACONTABLE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(gastodepreciacioncentrocosto.getcuentacontable_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(GastoDepreciacionCentroCostoConstantesFunciones.LABEL_PORCENTAJE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(GastoDepreciacionCentroCostoConstantesFunciones.LABEL_PORCENTAJE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(gastodepreciacioncentrocosto.getporcentaje());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.gastodepreciacioncentrocostoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Gasto Depreciacion Centro Costo",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesGastoDepreciacionCentroCostos(String sAccionBusqueda,String sTipoArchivoReporte,List<GastoDepreciacionCentroCosto> gastodepreciacioncentrocostosParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<GastoDepreciacionCentroCosto> gastodepreciacioncentrocostosRespaldo=null;
		
		classes=GastoDepreciacionCentroCostoConstantesFunciones.getClassesRelationshipsOfGastoDepreciacionCentroCosto(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.gastodepreciacioncentrocostoLogic.setDatosCliente(this.datosCliente);
		this.gastodepreciacioncentrocostoLogic.setDatosDeep(this.datosDeep);
		this.gastodepreciacioncentrocostoLogic.setIsConDeep(true);
		
		gastodepreciacioncentrocostosRespaldo=this.gastodepreciacioncentrocostoLogic.getGastoDepreciacionCentroCostos();
		
		this.gastodepreciacioncentrocostoLogic.setGastoDepreciacionCentroCostos(gastodepreciacioncentrocostosParaReportes);	
		this.gastodepreciacioncentrocostoLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		gastodepreciacioncentrocostosParaReportes=this.gastodepreciacioncentrocostoLogic.getGastoDepreciacionCentroCostos();
		this.gastodepreciacioncentrocostoLogic.setGastoDepreciacionCentroCostos(gastodepreciacioncentrocostosRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"gastodepreciacioncentrocosto_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("GastoDepreciacionCentroCostos");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderGastoDepreciacionCentroCosto("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(GastoDepreciacionCentroCosto gastodepreciacioncentrocosto : gastodepreciacioncentrocostosParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderGastoDepreciacionCentroCosto("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			GastoDepreciacionCentroCostoConstantesFunciones.generarExcelReporteDataGastoDepreciacionCentroCosto("NORMAL",row,workbook,gastodepreciacioncentrocosto,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(GastoDepreciacionCentroCostoConstantesFunciones.getGastoDepreciacionCentroCostoDescripcion(gastodepreciacioncentrocosto));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.gastodepreciacioncentrocostoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Gasto Depreciacion Centro Costo",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoGastoDepreciacionCentroCosto.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoGastoDepreciacionCentroCosto.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoGastoDepreciacionCentroCosto.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoGastoDepreciacionCentroCosto.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessGastoDepreciacionCentroCosto() throws Exception {		
		this.startProcessGastoDepreciacionCentroCosto(true);
	}
	
	public void startProcessGastoDepreciacionCentroCosto(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasGastoDepreciacionCentroCosto ,this.jPanelParametrosReportesGastoDepreciacionCentroCosto, this.jScrollPanelDatosGastoDepreciacionCentroCosto,this.jPanelPaginacionGastoDepreciacionCentroCosto, this.jScrollPanelDatosEdicionGastoDepreciacionCentroCosto, this.jPanelAccionesGastoDepreciacionCentroCosto,this.jPanelAccionesFormularioGastoDepreciacionCentroCosto,this.jmenuBarGastoDepreciacionCentroCosto,this.jmenuBarDetalleGastoDepreciacionCentroCosto,this.jTtoolBarGastoDepreciacionCentroCosto,this.jTtoolBarDetalleGastoDepreciacionCentroCosto);		
		
		final JTabbedPane jTabbedPaneBusquedasGastoDepreciacionCentroCosto=this.jTabbedPaneBusquedasGastoDepreciacionCentroCosto; 
		
		final JPanel jPanelParametrosReportesGastoDepreciacionCentroCosto=this.jPanelParametrosReportesGastoDepreciacionCentroCosto;
		//final JScrollPane jScrollPanelDatosGastoDepreciacionCentroCosto=this.jScrollPanelDatosGastoDepreciacionCentroCosto;
		final JTable jTableDatosGastoDepreciacionCentroCosto=this.jTableDatosGastoDepreciacionCentroCosto;		
		final JPanel jPanelPaginacionGastoDepreciacionCentroCosto=this.jPanelPaginacionGastoDepreciacionCentroCosto;
		//final JScrollPane jScrollPanelDatosEdicionGastoDepreciacionCentroCosto=this.jScrollPanelDatosEdicionGastoDepreciacionCentroCosto;
		final JPanel jPanelAccionesGastoDepreciacionCentroCosto=this.jPanelAccionesGastoDepreciacionCentroCosto;
		
		JPanel jPanelCamposAuxiliarGastoDepreciacionCentroCosto=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarGastoDepreciacionCentroCosto=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto!=null) {
			jPanelCamposAuxiliarGastoDepreciacionCentroCosto=this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto.jPanelCamposGastoDepreciacionCentroCosto;
			jPanelAccionesFormularioAuxiliarGastoDepreciacionCentroCosto=this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto.jPanelAccionesFormularioGastoDepreciacionCentroCosto;
		}
		
		final JPanel jPanelCamposGastoDepreciacionCentroCosto=jPanelCamposAuxiliarGastoDepreciacionCentroCosto;
		final JPanel jPanelAccionesFormularioGastoDepreciacionCentroCosto=jPanelAccionesFormularioAuxiliarGastoDepreciacionCentroCosto;
		
		
		final JMenuBar jmenuBarGastoDepreciacionCentroCosto=this.jmenuBarGastoDepreciacionCentroCosto;
		final JToolBar jTtoolBarGastoDepreciacionCentroCosto=this.jTtoolBarGastoDepreciacionCentroCosto;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarGastoDepreciacionCentroCosto=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarGastoDepreciacionCentroCosto=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto!=null) {
			jmenuBarDetalleAuxiliarGastoDepreciacionCentroCosto=this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto.jmenuBarDetalleGastoDepreciacionCentroCosto;
			jTtoolBarDetalleAuxiliarGastoDepreciacionCentroCosto=this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto.jTtoolBarDetalleGastoDepreciacionCentroCosto;
		}
		
		final JMenuBar jmenuBarDetalleGastoDepreciacionCentroCosto=jmenuBarDetalleAuxiliarGastoDepreciacionCentroCosto;
		final JToolBar jTtoolBarDetalleGastoDepreciacionCentroCosto=jTtoolBarDetalleAuxiliarGastoDepreciacionCentroCosto;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasGastoDepreciacionCentroCosto;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesGastoDepreciacionCentroCosto;
			processRunnable.jTableDatos=jTableDatosGastoDepreciacionCentroCosto;
			processRunnable.jPanelCampos=jPanelCamposGastoDepreciacionCentroCosto;
			processRunnable.jPanelPaginacion=jPanelPaginacionGastoDepreciacionCentroCosto;
			processRunnable.jPanelAcciones=jPanelAccionesGastoDepreciacionCentroCosto;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioGastoDepreciacionCentroCosto;
			
			
			processRunnable.jmenuBar=jmenuBarGastoDepreciacionCentroCosto;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleGastoDepreciacionCentroCosto;
			processRunnable.jTtoolBar=jTtoolBarGastoDepreciacionCentroCosto;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleGastoDepreciacionCentroCosto;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasGastoDepreciacionCentroCosto ,jPanelParametrosReportesGastoDepreciacionCentroCosto,jTableDatosGastoDepreciacionCentroCosto, /*jScrollPanelDatosGastoDepreciacionCentroCosto,*/jPanelCamposGastoDepreciacionCentroCosto,jPanelPaginacionGastoDepreciacionCentroCosto, /*jScrollPanelDatosEdicionGastoDepreciacionCentroCosto,*/ jPanelAccionesGastoDepreciacionCentroCosto,jPanelAccionesFormularioGastoDepreciacionCentroCosto,jmenuBarGastoDepreciacionCentroCosto,jmenuBarDetalleGastoDepreciacionCentroCosto,jTtoolBarGastoDepreciacionCentroCosto,jTtoolBarDetalleGastoDepreciacionCentroCosto);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasGastoDepreciacionCentroCosto ,jPanelParametrosReportesGastoDepreciacionCentroCosto, jScrollPanelDatosGastoDepreciacionCentroCosto,jPanelPaginacionGastoDepreciacionCentroCosto, jScrollPanelDatosEdicionGastoDepreciacionCentroCosto, jPanelAccionesGastoDepreciacionCentroCosto,jPanelAccionesFormularioGastoDepreciacionCentroCosto,jmenuBarGastoDepreciacionCentroCosto,jmenuBarDetalleGastoDepreciacionCentroCosto,jTtoolBarGastoDepreciacionCentroCosto,jTtoolBarDetalleGastoDepreciacionCentroCosto);
						
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
	
	public void finishProcessGastoDepreciacionCentroCosto() {// throws Exception 
		this.finishProcessGastoDepreciacionCentroCosto(true);
	}
	
	public void finishProcessGastoDepreciacionCentroCosto(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasGastoDepreciacionCentroCosto ,this.jPanelParametrosReportesGastoDepreciacionCentroCosto, this.jScrollPanelDatosGastoDepreciacionCentroCosto,this.jPanelPaginacionGastoDepreciacionCentroCosto, this.jScrollPanelDatosEdicionGastoDepreciacionCentroCosto, this.jPanelAccionesGastoDepreciacionCentroCosto,this.jPanelAccionesFormularioGastoDepreciacionCentroCosto,this.jmenuBarGastoDepreciacionCentroCosto,this.jmenuBarDetalleGastoDepreciacionCentroCosto,this.jTtoolBarGastoDepreciacionCentroCosto,this.jTtoolBarDetalleGastoDepreciacionCentroCosto);		
		
		final JTabbedPane jTabbedPaneBusquedasGastoDepreciacionCentroCosto=this.jTabbedPaneBusquedasGastoDepreciacionCentroCosto; 
		
		final JPanel jPanelParametrosReportesGastoDepreciacionCentroCosto=this.jPanelParametrosReportesGastoDepreciacionCentroCosto;
		//final JScrollPane jScrollPanelDatosGastoDepreciacionCentroCosto=this.jScrollPanelDatosGastoDepreciacionCentroCosto;
		final JTable jTableDatosGastoDepreciacionCentroCosto=this.jTableDatosGastoDepreciacionCentroCosto;		
		final JPanel jPanelPaginacionGastoDepreciacionCentroCosto=this.jPanelPaginacionGastoDepreciacionCentroCosto;
		//final JScrollPane jScrollPanelDatosEdicionGastoDepreciacionCentroCosto=this.jScrollPanelDatosEdicionGastoDepreciacionCentroCosto;
		final JPanel jPanelAccionesGastoDepreciacionCentroCosto=this.jPanelAccionesGastoDepreciacionCentroCosto;
		
		JPanel jPanelCamposAuxiliarGastoDepreciacionCentroCosto=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarGastoDepreciacionCentroCosto=new JPanel();
		
		if(this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto!=null) {
			jPanelCamposAuxiliarGastoDepreciacionCentroCosto=this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto.jPanelCamposGastoDepreciacionCentroCosto;
			jPanelAccionesFormularioAuxiliarGastoDepreciacionCentroCosto=this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto.jPanelAccionesFormularioGastoDepreciacionCentroCosto;
		}
		
		final JPanel jPanelCamposGastoDepreciacionCentroCosto=jPanelCamposAuxiliarGastoDepreciacionCentroCosto;
		final JPanel jPanelAccionesFormularioGastoDepreciacionCentroCosto=jPanelAccionesFormularioAuxiliarGastoDepreciacionCentroCosto;
		
		
		final JMenuBar jmenuBarGastoDepreciacionCentroCosto=this.jmenuBarGastoDepreciacionCentroCosto;		
		final JToolBar jTtoolBarGastoDepreciacionCentroCosto=this.jTtoolBarGastoDepreciacionCentroCosto;
				
		JMenuBar jmenuBarDetalleAuxiliarGastoDepreciacionCentroCosto=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarGastoDepreciacionCentroCosto=new JToolBar();
		
		if(this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto!=null) {
			jmenuBarDetalleAuxiliarGastoDepreciacionCentroCosto=this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto.jmenuBarDetalleGastoDepreciacionCentroCosto;
			jTtoolBarDetalleAuxiliarGastoDepreciacionCentroCosto=this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto.jTtoolBarDetalleGastoDepreciacionCentroCosto;		
		}
		
		final JMenuBar jmenuBarDetalleGastoDepreciacionCentroCosto=jmenuBarDetalleAuxiliarGastoDepreciacionCentroCosto;
		final JToolBar jTtoolBarDetalleGastoDepreciacionCentroCosto=jTtoolBarDetalleAuxiliarGastoDepreciacionCentroCosto;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasGastoDepreciacionCentroCosto;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesGastoDepreciacionCentroCosto;
			processRunnable.jTableDatos=jTableDatosGastoDepreciacionCentroCosto;
			processRunnable.jPanelCampos=jPanelCamposGastoDepreciacionCentroCosto;
			processRunnable.jPanelPaginacion=jPanelPaginacionGastoDepreciacionCentroCosto;
			processRunnable.jPanelAcciones=jPanelAccionesGastoDepreciacionCentroCosto;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioGastoDepreciacionCentroCosto;
			
			
			processRunnable.jmenuBar=jmenuBarGastoDepreciacionCentroCosto;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleGastoDepreciacionCentroCosto;
			processRunnable.jTtoolBar=jTtoolBarGastoDepreciacionCentroCosto;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleGastoDepreciacionCentroCosto;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasGastoDepreciacionCentroCosto ,jPanelParametrosReportesGastoDepreciacionCentroCosto, jTableDatosGastoDepreciacionCentroCosto,/*jScrollPanelDatosGastoDepreciacionCentroCosto,*/jPanelCamposGastoDepreciacionCentroCosto,jPanelPaginacionGastoDepreciacionCentroCosto, /*jScrollPanelDatosEdicionGastoDepreciacionCentroCosto,*/ jPanelAccionesGastoDepreciacionCentroCosto,jPanelAccionesFormularioGastoDepreciacionCentroCosto,jmenuBarGastoDepreciacionCentroCosto,jmenuBarDetalleGastoDepreciacionCentroCosto,jTtoolBarGastoDepreciacionCentroCosto,jTtoolBarDetalleGastoDepreciacionCentroCosto));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesGastoDepreciacionCentroCosto(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarGastoDepreciacionCentroCosto(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuGastoDepreciacionCentroCosto(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarGastoDepreciacionCentroCosto(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarGastoDepreciacionCentroCosto,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleGastoDepreciacionCentroCosto,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuGastoDepreciacionCentroCosto(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarGastoDepreciacionCentroCosto,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleGastoDepreciacionCentroCosto,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.gastodepreciacioncentrocostoConstantesFunciones.getsFinalQueryGastoDepreciacionCentroCosto();
		String  finalQueryPaginacionTodos=this.gastodepreciacioncentrocostoConstantesFunciones.getsFinalQueryGastoDepreciacionCentroCosto();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=GastoDepreciacionCentroCostoConstantesFunciones.getArrayColumnasGlobalesNoGastoDepreciacionCentroCosto(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=GastoDepreciacionCentroCostoConstantesFunciones.getArrayColumnasGlobalesGastoDepreciacionCentroCosto(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,GastoDepreciacionCentroCostoConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.gastodepreciacioncentrocostosEliminados= new ArrayList<GastoDepreciacionCentroCosto>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessGastoDepreciacionCentroCosto();
		
				///*GastoDepreciacionCentroCostoSessionBean*/this.gastodepreciacioncentrocostoSessionBean=new GastoDepreciacionCentroCostoSessionBean();
			
			if(this.gastodepreciacioncentrocostoSessionBean==null) {
				this.gastodepreciacioncentrocostoSessionBean=new GastoDepreciacionCentroCostoSessionBean();
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
					this.iNumeroPaginacion=GastoDepreciacionCentroCostoConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=GastoDepreciacionCentroCostoConstantesFunciones.getClassesForeignKeysOfGastoDepreciacionCentroCosto(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/gastodepreciacioncentrocosto."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			gastodepreciacioncentrocostosAux= new ArrayList<GastoDepreciacionCentroCosto>();
			
				
			gastodepreciacioncentrocostoLogic.setDatosCliente(this.datosCliente);
			gastodepreciacioncentrocostoLogic.setDatosDeep(this.datosDeep);
			gastodepreciacioncentrocostoLogic.setIsConDeep(true);
			
			
			gastodepreciacioncentrocostoLogic.getGastoDepreciacionCentroCostoDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					gastodepreciacioncentrocostoLogic.getTodosGastoDepreciacionCentroCostos(finalQueryGlobal,pagination);
					
					//gastodepreciacioncentrocostoLogic.getTodosGastoDepreciacionCentroCostosWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(gastodepreciacioncentrocostoLogic.getGastoDepreciacionCentroCostos()==null|| gastodepreciacioncentrocostoLogic.getGastoDepreciacionCentroCostos().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							gastodepreciacioncentrocostosAux= new ArrayList<GastoDepreciacionCentroCosto>();
							gastodepreciacioncentrocostosAux.addAll(gastodepreciacioncentrocostoLogic.getGastoDepreciacionCentroCostos());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							gastodepreciacioncentrocostosAux= new ArrayList<GastoDepreciacionCentroCosto>();
							gastodepreciacioncentrocostosAux.addAll(gastodepreciacioncentrocostos);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							gastodepreciacioncentrocostoLogic.getTodosGastoDepreciacionCentroCostos(finalQueryGlobal+"",this.pagination);												
							
							//gastodepreciacioncentrocostoLogic.getTodosGastoDepreciacionCentroCostosWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteGastoDepreciacionCentroCostos("Todos",gastodepreciacioncentrocostoLogic.getGastoDepreciacionCentroCostos() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							gastodepreciacioncentrocostoLogic.setGastoDepreciacionCentroCostos(new ArrayList<GastoDepreciacionCentroCosto>());					
							gastodepreciacioncentrocostoLogic.getGastoDepreciacionCentroCostos().addAll(gastodepreciacioncentrocostosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							gastodepreciacioncentrocostos=new ArrayList<GastoDepreciacionCentroCosto>();
							gastodepreciacioncentrocostos.addAll(gastodepreciacioncentrocostosAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idGastoDepreciacionCentroCosto=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idGastoDepreciacionCentroCosto=this.idActual;
				
				} else if(this.idGastoDepreciacionCentroCostoActual!=null && this.idGastoDepreciacionCentroCostoActual!=0L) {
					idGastoDepreciacionCentroCosto=idGastoDepreciacionCentroCostoActual;
				}
				
					
				this.sDetalleReporte=GastoDepreciacionCentroCostoConstantesFunciones.getDetalleIndicePorId(idGastoDepreciacionCentroCosto);
				
				this.gastodepreciacioncentrocostos=new ArrayList<GastoDepreciacionCentroCosto>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					gastodepreciacioncentrocostoLogic.getEntity(idGastoDepreciacionCentroCosto);
					
					//gastodepreciacioncentrocostoLogic.getEntityWithConnection(idGastoDepreciacionCentroCosto);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					gastodepreciacioncentrocostoLogic.setGastoDepreciacionCentroCostos(new ArrayList<GastoDepreciacionCentroCosto>());
					gastodepreciacioncentrocostoLogic.getGastoDepreciacionCentroCostos().add(gastodepreciacioncentrocostoLogic.getGastoDepreciacionCentroCosto());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.gastodepreciacioncentrocostos=new ArrayList<GastoDepreciacionCentroCosto>();
					this.gastodepreciacioncentrocostos.add(gastodepreciacioncentrocosto);
				}
				
				if(gastodepreciacioncentrocostoLogic.getGastoDepreciacionCentroCosto()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdCentroCosto")) {
				this.sDetalleReporte=GastoDepreciacionCentroCostoConstantesFunciones.getDetalleIndiceFK_IdCentroCosto(id_centro_costoFK_IdCentroCosto);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					gastodepreciacioncentrocostoLogic.getGastoDepreciacionCentroCostosFK_IdCentroCosto(finalQueryGlobal,pagination,id_centro_costoFK_IdCentroCosto);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=GastoDepreciacionCentroCostoConstantesFunciones.getDetalleIndiceFK_IdCentroCosto(id_centro_costoFK_IdCentroCosto);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=GastoDepreciacionCentroCostoConstantesFunciones.getDetalleIndiceFK_IdCentroCosto(id_centro_costoFK_IdCentroCosto);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=gastodepreciacioncentrocostoLogic.getGastoDepreciacionCentroCostos()==null||gastodepreciacioncentrocostoLogic.getGastoDepreciacionCentroCostos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=gastodepreciacioncentrocostos==null|| gastodepreciacioncentrocostos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						gastodepreciacioncentrocostosAux=new ArrayList<GastoDepreciacionCentroCosto>();
						gastodepreciacioncentrocostosAux.addAll(gastodepreciacioncentrocostoLogic.getGastoDepreciacionCentroCostos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							gastodepreciacioncentrocostosAux=new ArrayList<GastoDepreciacionCentroCosto>();
							gastodepreciacioncentrocostosAux.addAll(gastodepreciacioncentrocostos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							gastodepreciacioncentrocostoLogic.getGastoDepreciacionCentroCostosFK_IdCentroCosto(finalQueryGlobal,pagination,id_centro_costoFK_IdCentroCosto);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=GastoDepreciacionCentroCostoConstantesFunciones.getDetalleIndiceFK_IdCentroCosto(id_centro_costoFK_IdCentroCosto);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=GastoDepreciacionCentroCostoConstantesFunciones.getDetalleIndiceFK_IdCentroCosto(id_centro_costoFK_IdCentroCosto);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteGastoDepreciacionCentroCostos("FK_IdCentroCosto",gastodepreciacioncentrocostoLogic.getGastoDepreciacionCentroCostos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteGastoDepreciacionCentroCostos("FK_IdCentroCosto",gastodepreciacioncentrocostos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						gastodepreciacioncentrocostoLogic.setGastoDepreciacionCentroCostos(new ArrayList<GastoDepreciacionCentroCosto>());
						gastodepreciacioncentrocostoLogic.getGastoDepreciacionCentroCostos().addAll(gastodepreciacioncentrocostosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							gastodepreciacioncentrocostos=new ArrayList<GastoDepreciacionCentroCosto>();
							gastodepreciacioncentrocostos.addAll(gastodepreciacioncentrocostosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdCuentaContable")) {
				this.sDetalleReporte=GastoDepreciacionCentroCostoConstantesFunciones.getDetalleIndiceFK_IdCuentaContable(id_cuenta_contableFK_IdCuentaContable);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					gastodepreciacioncentrocostoLogic.getGastoDepreciacionCentroCostosFK_IdCuentaContable(finalQueryGlobal,pagination,id_cuenta_contableFK_IdCuentaContable);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=GastoDepreciacionCentroCostoConstantesFunciones.getDetalleIndiceFK_IdCuentaContable(id_cuenta_contableFK_IdCuentaContable);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=GastoDepreciacionCentroCostoConstantesFunciones.getDetalleIndiceFK_IdCuentaContable(id_cuenta_contableFK_IdCuentaContable);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=gastodepreciacioncentrocostoLogic.getGastoDepreciacionCentroCostos()==null||gastodepreciacioncentrocostoLogic.getGastoDepreciacionCentroCostos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=gastodepreciacioncentrocostos==null|| gastodepreciacioncentrocostos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						gastodepreciacioncentrocostosAux=new ArrayList<GastoDepreciacionCentroCosto>();
						gastodepreciacioncentrocostosAux.addAll(gastodepreciacioncentrocostoLogic.getGastoDepreciacionCentroCostos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							gastodepreciacioncentrocostosAux=new ArrayList<GastoDepreciacionCentroCosto>();
							gastodepreciacioncentrocostosAux.addAll(gastodepreciacioncentrocostos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							gastodepreciacioncentrocostoLogic.getGastoDepreciacionCentroCostosFK_IdCuentaContable(finalQueryGlobal,pagination,id_cuenta_contableFK_IdCuentaContable);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=GastoDepreciacionCentroCostoConstantesFunciones.getDetalleIndiceFK_IdCuentaContable(id_cuenta_contableFK_IdCuentaContable);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=GastoDepreciacionCentroCostoConstantesFunciones.getDetalleIndiceFK_IdCuentaContable(id_cuenta_contableFK_IdCuentaContable);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteGastoDepreciacionCentroCostos("FK_IdCuentaContable",gastodepreciacioncentrocostoLogic.getGastoDepreciacionCentroCostos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteGastoDepreciacionCentroCostos("FK_IdCuentaContable",gastodepreciacioncentrocostos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						gastodepreciacioncentrocostoLogic.setGastoDepreciacionCentroCostos(new ArrayList<GastoDepreciacionCentroCosto>());
						gastodepreciacioncentrocostoLogic.getGastoDepreciacionCentroCostos().addAll(gastodepreciacioncentrocostosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							gastodepreciacioncentrocostos=new ArrayList<GastoDepreciacionCentroCosto>();
							gastodepreciacioncentrocostos.addAll(gastodepreciacioncentrocostosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdDetalleActivoFijo")) {
				this.sDetalleReporte=GastoDepreciacionCentroCostoConstantesFunciones.getDetalleIndiceFK_IdDetalleActivoFijo(id_detalle_activo_fijoFK_IdDetalleActivoFijo);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					gastodepreciacioncentrocostoLogic.getGastoDepreciacionCentroCostosFK_IdDetalleActivoFijo(finalQueryGlobal,pagination,id_detalle_activo_fijoFK_IdDetalleActivoFijo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=GastoDepreciacionCentroCostoConstantesFunciones.getDetalleIndiceFK_IdDetalleActivoFijo(id_detalle_activo_fijoFK_IdDetalleActivoFijo);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=GastoDepreciacionCentroCostoConstantesFunciones.getDetalleIndiceFK_IdDetalleActivoFijo(id_detalle_activo_fijoFK_IdDetalleActivoFijo);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=gastodepreciacioncentrocostoLogic.getGastoDepreciacionCentroCostos()==null||gastodepreciacioncentrocostoLogic.getGastoDepreciacionCentroCostos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=gastodepreciacioncentrocostos==null|| gastodepreciacioncentrocostos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						gastodepreciacioncentrocostosAux=new ArrayList<GastoDepreciacionCentroCosto>();
						gastodepreciacioncentrocostosAux.addAll(gastodepreciacioncentrocostoLogic.getGastoDepreciacionCentroCostos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							gastodepreciacioncentrocostosAux=new ArrayList<GastoDepreciacionCentroCosto>();
							gastodepreciacioncentrocostosAux.addAll(gastodepreciacioncentrocostos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							gastodepreciacioncentrocostoLogic.getGastoDepreciacionCentroCostosFK_IdDetalleActivoFijo(finalQueryGlobal,pagination,id_detalle_activo_fijoFK_IdDetalleActivoFijo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=GastoDepreciacionCentroCostoConstantesFunciones.getDetalleIndiceFK_IdDetalleActivoFijo(id_detalle_activo_fijoFK_IdDetalleActivoFijo);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=GastoDepreciacionCentroCostoConstantesFunciones.getDetalleIndiceFK_IdDetalleActivoFijo(id_detalle_activo_fijoFK_IdDetalleActivoFijo);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteGastoDepreciacionCentroCostos("FK_IdDetalleActivoFijo",gastodepreciacioncentrocostoLogic.getGastoDepreciacionCentroCostos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteGastoDepreciacionCentroCostos("FK_IdDetalleActivoFijo",gastodepreciacioncentrocostos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						gastodepreciacioncentrocostoLogic.setGastoDepreciacionCentroCostos(new ArrayList<GastoDepreciacionCentroCosto>());
						gastodepreciacioncentrocostoLogic.getGastoDepreciacionCentroCostos().addAll(gastodepreciacioncentrocostosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							gastodepreciacioncentrocostos=new ArrayList<GastoDepreciacionCentroCosto>();
							gastodepreciacioncentrocostos.addAll(gastodepreciacioncentrocostosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=GastoDepreciacionCentroCostoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					gastodepreciacioncentrocostoLogic.getGastoDepreciacionCentroCostosFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=GastoDepreciacionCentroCostoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=GastoDepreciacionCentroCostoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=gastodepreciacioncentrocostoLogic.getGastoDepreciacionCentroCostos()==null||gastodepreciacioncentrocostoLogic.getGastoDepreciacionCentroCostos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=gastodepreciacioncentrocostos==null|| gastodepreciacioncentrocostos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						gastodepreciacioncentrocostosAux=new ArrayList<GastoDepreciacionCentroCosto>();
						gastodepreciacioncentrocostosAux.addAll(gastodepreciacioncentrocostoLogic.getGastoDepreciacionCentroCostos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							gastodepreciacioncentrocostosAux=new ArrayList<GastoDepreciacionCentroCosto>();
							gastodepreciacioncentrocostosAux.addAll(gastodepreciacioncentrocostos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							gastodepreciacioncentrocostoLogic.getGastoDepreciacionCentroCostosFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=GastoDepreciacionCentroCostoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=GastoDepreciacionCentroCostoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteGastoDepreciacionCentroCostos("FK_IdEmpresa",gastodepreciacioncentrocostoLogic.getGastoDepreciacionCentroCostos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteGastoDepreciacionCentroCostos("FK_IdEmpresa",gastodepreciacioncentrocostos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						gastodepreciacioncentrocostoLogic.setGastoDepreciacionCentroCostos(new ArrayList<GastoDepreciacionCentroCosto>());
						gastodepreciacioncentrocostoLogic.getGastoDepreciacionCentroCostos().addAll(gastodepreciacioncentrocostosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							gastodepreciacioncentrocostos=new ArrayList<GastoDepreciacionCentroCosto>();
							gastodepreciacioncentrocostos.addAll(gastodepreciacioncentrocostosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdSucursal")) {
				this.sDetalleReporte=GastoDepreciacionCentroCostoConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					gastodepreciacioncentrocostoLogic.getGastoDepreciacionCentroCostosFK_IdSucursal(finalQueryGlobal,pagination,id_sucursalFK_IdSucursal);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=GastoDepreciacionCentroCostoConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=GastoDepreciacionCentroCostoConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=gastodepreciacioncentrocostoLogic.getGastoDepreciacionCentroCostos()==null||gastodepreciacioncentrocostoLogic.getGastoDepreciacionCentroCostos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=gastodepreciacioncentrocostos==null|| gastodepreciacioncentrocostos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						gastodepreciacioncentrocostosAux=new ArrayList<GastoDepreciacionCentroCosto>();
						gastodepreciacioncentrocostosAux.addAll(gastodepreciacioncentrocostoLogic.getGastoDepreciacionCentroCostos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							gastodepreciacioncentrocostosAux=new ArrayList<GastoDepreciacionCentroCosto>();
							gastodepreciacioncentrocostosAux.addAll(gastodepreciacioncentrocostos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							gastodepreciacioncentrocostoLogic.getGastoDepreciacionCentroCostosFK_IdSucursal(finalQueryGlobal,pagination,id_sucursalFK_IdSucursal);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=GastoDepreciacionCentroCostoConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=GastoDepreciacionCentroCostoConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteGastoDepreciacionCentroCostos("FK_IdSucursal",gastodepreciacioncentrocostoLogic.getGastoDepreciacionCentroCostos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteGastoDepreciacionCentroCostos("FK_IdSucursal",gastodepreciacioncentrocostos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						gastodepreciacioncentrocostoLogic.setGastoDepreciacionCentroCostos(new ArrayList<GastoDepreciacionCentroCosto>());
						gastodepreciacioncentrocostoLogic.getGastoDepreciacionCentroCostos().addAll(gastodepreciacioncentrocostosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							gastodepreciacioncentrocostos=new ArrayList<GastoDepreciacionCentroCosto>();
							gastodepreciacioncentrocostos.addAll(gastodepreciacioncentrocostosAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesGastoDepreciacionCentroCosto();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessGastoDepreciacionCentroCosto();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=gastodepreciacioncentrocostoLogic.getGastoDepreciacionCentroCostos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=gastodepreciacioncentrocostos.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=gastodepreciacioncentrocostoLogic.getGastoDepreciacionCentroCostos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=gastodepreciacioncentrocostos.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(GastoDepreciacionCentroCosto gastodepreciacioncentrocosto) {
		Boolean permite=true;
		
		if(this.gastodepreciacioncentrocosto.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=GastoDepreciacionCentroCostoConstantesFunciones.getOrderByListaGastoDepreciacionCentroCosto();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=GastoDepreciacionCentroCostoConstantesFunciones.getOrderByListaGastoDepreciacionCentroCosto();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(GastoDepreciacionCentroCosto gastodepreciacioncentrocosto:gastodepreciacioncentrocostoLogic.getGastoDepreciacionCentroCostos()) {
				if(gastodepreciacioncentrocosto.getsType().equals(Constantes2.S_TOTALES)) {
					gastodepreciacioncentrocostoTotales=gastodepreciacioncentrocosto;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(GastoDepreciacionCentroCosto gastodepreciacioncentrocosto:this.gastodepreciacioncentrocostos) {
				if(gastodepreciacioncentrocosto.getsType().equals(Constantes2.S_TOTALES)) {
					gastodepreciacioncentrocostoTotales=gastodepreciacioncentrocosto;
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
			this.gastodepreciacioncentrocostoAux=new GastoDepreciacionCentroCosto();
			this.gastodepreciacioncentrocostoAux.setsType(Constantes2.S_TOTALES);
			this.gastodepreciacioncentrocostoAux.setIsNew(false);
			this.gastodepreciacioncentrocostoAux.setIsChanged(false);
			this.gastodepreciacioncentrocostoAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				GastoDepreciacionCentroCostoConstantesFunciones.TotalizarValoresFilaGastoDepreciacionCentroCosto(this.gastodepreciacioncentrocostoLogic.getGastoDepreciacionCentroCostos(),this.gastodepreciacioncentrocostoAux);
				
				this.gastodepreciacioncentrocostoLogic.getGastoDepreciacionCentroCostos().add(this.gastodepreciacioncentrocostoAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				GastoDepreciacionCentroCostoConstantesFunciones.TotalizarValoresFilaGastoDepreciacionCentroCosto(this.gastodepreciacioncentrocostos,this.gastodepreciacioncentrocostoAux);
				
				this.gastodepreciacioncentrocostos.add(this.gastodepreciacioncentrocostoAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		gastodepreciacioncentrocostoTotales=new GastoDepreciacionCentroCosto();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.gastodepreciacioncentrocostoLogic.getGastoDepreciacionCentroCostos().remove(gastodepreciacioncentrocostoTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.gastodepreciacioncentrocostos.remove(gastodepreciacioncentrocostoTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		gastodepreciacioncentrocostoTotales=new GastoDepreciacionCentroCosto();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(GastoDepreciacionCentroCosto gastodepreciacioncentrocosto:gastodepreciacioncentrocostoLogic.getGastoDepreciacionCentroCostos()) {
				if(gastodepreciacioncentrocosto.getsType().equals(Constantes2.S_TOTALES)) {
					gastodepreciacioncentrocostoTotales=gastodepreciacioncentrocosto;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				GastoDepreciacionCentroCostoConstantesFunciones.TotalizarValoresFilaGastoDepreciacionCentroCosto(this.gastodepreciacioncentrocostoLogic.getGastoDepreciacionCentroCostos(),gastodepreciacioncentrocostoTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(GastoDepreciacionCentroCosto gastodepreciacioncentrocosto:this.gastodepreciacioncentrocostos) {
				if(gastodepreciacioncentrocosto.getsType().equals(Constantes2.S_TOTALES)) {
					gastodepreciacioncentrocostoTotales=gastodepreciacioncentrocosto;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				GastoDepreciacionCentroCostoConstantesFunciones.TotalizarValoresFilaGastoDepreciacionCentroCosto(this.gastodepreciacioncentrocostos,gastodepreciacioncentrocostoTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GastoDepreciacionCentroCostoConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getGastoDepreciacionCentroCostosFK_IdCentroCosto()throws Exception {
		try {
			sAccionBusqueda="FK_IdCentroCosto";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getGastoDepreciacionCentroCostosFK_IdCuentaContable()throws Exception {
		try {
			sAccionBusqueda="FK_IdCuentaContable";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getGastoDepreciacionCentroCostosFK_IdDetalleActivoFijo()throws Exception {
		try {
			sAccionBusqueda="FK_IdDetalleActivoFijo";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getGastoDepreciacionCentroCostosFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getGastoDepreciacionCentroCostosFK_IdSucursal()throws Exception {
		try {
			sAccionBusqueda="FK_IdSucursal";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getGastoDepreciacionCentroCostosFK_IdCentroCosto(String sFinalQuery,Long id_centro_costo)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					gastodepreciacioncentrocostoLogic.getGastoDepreciacionCentroCostosFK_IdCentroCosto(sFinalQuery,this.pagination,id_centro_costo);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getGastoDepreciacionCentroCostosFK_IdCuentaContable(String sFinalQuery,Long id_cuenta_contable)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					gastodepreciacioncentrocostoLogic.getGastoDepreciacionCentroCostosFK_IdCuentaContable(sFinalQuery,this.pagination,id_cuenta_contable);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getGastoDepreciacionCentroCostosFK_IdDetalleActivoFijo(String sFinalQuery,Long id_detalle_activo_fijo)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					gastodepreciacioncentrocostoLogic.getGastoDepreciacionCentroCostosFK_IdDetalleActivoFijo(sFinalQuery,this.pagination,id_detalle_activo_fijo);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getGastoDepreciacionCentroCostosFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					gastodepreciacioncentrocostoLogic.getGastoDepreciacionCentroCostosFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getGastoDepreciacionCentroCostosFK_IdSucursal(String sFinalQuery,Long id_sucursal)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					gastodepreciacioncentrocostoLogic.getGastoDepreciacionCentroCostosFK_IdSucursal(sFinalQuery,this.pagination,id_sucursal);
				
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
	
	public void inicializarPermisosGastoDepreciacionCentroCosto() {
		this.isPermisoTodoGastoDepreciacionCentroCosto=false;
		this.isPermisoNuevoGastoDepreciacionCentroCosto=false;
		this.isPermisoActualizarGastoDepreciacionCentroCosto=false;
		this.isPermisoActualizarOriginalGastoDepreciacionCentroCosto=false;
		this.isPermisoEliminarGastoDepreciacionCentroCosto=false;
		this.isPermisoGuardarCambiosGastoDepreciacionCentroCosto=false;
		this.isPermisoConsultaGastoDepreciacionCentroCosto=false;
		this.isPermisoBusquedaGastoDepreciacionCentroCosto=false;
		this.isPermisoReporteGastoDepreciacionCentroCosto=false;		
		this.isPermisoOrdenGastoDepreciacionCentroCosto=false;		
		this.isPermisoPaginacionMedioGastoDepreciacionCentroCosto=false;		
		this.isPermisoPaginacionAltoGastoDepreciacionCentroCosto=false;
		this.isPermisoPaginacionTodoGastoDepreciacionCentroCosto=false;
		this.isPermisoCopiarGastoDepreciacionCentroCosto=false;		
		this.isPermisoVerFormGastoDepreciacionCentroCosto=false;		
		this.isPermisoDuplicarGastoDepreciacionCentroCosto=false;		
		this.isPermisoOrdenGastoDepreciacionCentroCosto=false;		
	}
	
	public void setPermisosUsuarioGastoDepreciacionCentroCosto(Boolean isPermiso) {
		this.isPermisoTodoGastoDepreciacionCentroCosto=isPermiso;
		this.isPermisoNuevoGastoDepreciacionCentroCosto=isPermiso;
		this.isPermisoActualizarGastoDepreciacionCentroCosto=isPermiso;
		this.isPermisoActualizarOriginalGastoDepreciacionCentroCosto=isPermiso;
		this.isPermisoEliminarGastoDepreciacionCentroCosto=isPermiso;
		this.isPermisoGuardarCambiosGastoDepreciacionCentroCosto=isPermiso;
		this.isPermisoConsultaGastoDepreciacionCentroCosto=isPermiso;
		this.isPermisoBusquedaGastoDepreciacionCentroCosto=isPermiso;
		this.isPermisoReporteGastoDepreciacionCentroCosto=isPermiso;
		this.isPermisoOrdenGastoDepreciacionCentroCosto=isPermiso;		
		this.isPermisoPaginacionMedioGastoDepreciacionCentroCosto=isPermiso;		
		this.isPermisoPaginacionAltoGastoDepreciacionCentroCosto=isPermiso;		
		this.isPermisoPaginacionTodoGastoDepreciacionCentroCosto=isPermiso;		
		this.isPermisoCopiarGastoDepreciacionCentroCosto=isPermiso;		
		this.isPermisoVerFormGastoDepreciacionCentroCosto=isPermiso;		
		this.isPermisoDuplicarGastoDepreciacionCentroCosto=isPermiso;
		this.isPermisoOrdenGastoDepreciacionCentroCosto=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioGastoDepreciacionCentroCosto(Boolean isPermiso) {
		//this.isPermisoTodoGastoDepreciacionCentroCosto=isPermiso;
		this.isPermisoNuevoGastoDepreciacionCentroCosto=isPermiso;
		this.isPermisoActualizarGastoDepreciacionCentroCosto=isPermiso;
		this.isPermisoActualizarOriginalGastoDepreciacionCentroCosto=isPermiso;
		this.isPermisoEliminarGastoDepreciacionCentroCosto=isPermiso;
		this.isPermisoGuardarCambiosGastoDepreciacionCentroCosto=isPermiso;
		//this.isPermisoConsultaGastoDepreciacionCentroCosto=isPermiso;
		//this.isPermisoBusquedaGastoDepreciacionCentroCosto=isPermiso;
		//this.isPermisoReporteGastoDepreciacionCentroCosto=isPermiso;
		//this.isPermisoOrdenGastoDepreciacionCentroCosto=isPermiso;		
		//this.isPermisoPaginacionMedioGastoDepreciacionCentroCosto=isPermiso;		
		//this.isPermisoPaginacionAltoGastoDepreciacionCentroCosto=isPermiso;		
		//this.isPermisoPaginacionTodoGastoDepreciacionCentroCosto=isPermiso;		
		//this.isPermisoCopiarGastoDepreciacionCentroCosto=isPermiso;		
		//this.isPermisoDuplicarGastoDepreciacionCentroCosto=isPermiso;
		//this.isPermisoOrdenGastoDepreciacionCentroCosto=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioGastoDepreciacionCentroCostoClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(GastoDepreciacionCentroCostoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebGastoDepreciacionCentroCosto(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioGastoDepreciacionCentroCostoClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioGastoDepreciacionCentroCostoClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionGastoDepreciacionCentroCostoClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioGastoDepreciacionCentroCostoClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioGastoDepreciacionCentroCosto() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(GastoDepreciacionCentroCostoJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.gastodepreciacioncentrocostoSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, GastoDepreciacionCentroCostoConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoGastoDepreciacionCentroCosto=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarGastoDepreciacionCentroCosto=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalGastoDepreciacionCentroCosto=this.isPermisoActualizarGastoDepreciacionCentroCosto;
			this.isPermisoEliminarGastoDepreciacionCentroCosto=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosGastoDepreciacionCentroCosto=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaGastoDepreciacionCentroCosto=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaGastoDepreciacionCentroCosto=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoGastoDepreciacionCentroCosto=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteGastoDepreciacionCentroCosto=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenGastoDepreciacionCentroCosto=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioGastoDepreciacionCentroCosto=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoGastoDepreciacionCentroCosto=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoGastoDepreciacionCentroCosto=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarGastoDepreciacionCentroCosto=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormGastoDepreciacionCentroCosto=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarGastoDepreciacionCentroCosto=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenGastoDepreciacionCentroCosto=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.gastodepreciacioncentrocostoSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosGastoDepreciacionCentroCosto.setToolTipText(this.jTableDatosGastoDepreciacionCentroCosto.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioGastoDepreciacionCentroCosto(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioGastoDepreciacionCentroCosto(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(GastoDepreciacionCentroCostoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(GastoDepreciacionCentroCostoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioGastoDepreciacionCentroCosto() throws Exception {
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
	public void inicializarCombosForeignKeyGastoDepreciacionCentroCostoListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
				this.sucursalsForeignKey=new ArrayList();
				this.centrocostosForeignKey=new ArrayList();
				this.detalleactivofijosForeignKey=new ArrayList();
				this.cuentacontablesForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyGastoDepreciacionCentroCostoListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(GastoDepreciacionCentroCostoJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyGastoDepreciacionCentroCostoListas(false);
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeySucursalListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyCentroCostoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyDetalleActivoFijoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyCuentaContableListas(cargarCombosDependencia,sFinalQueryCombo);
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

	public void cargarCombosForeignKeyCentroCostoListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.centrocostosForeignKey==null||this.centrocostosForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=CentroCostoConstantesFunciones.getArrayColumnasGlobalesCentroCosto(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,CentroCostoConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=CentroCostoConstantesFunciones.SFINALQUERY;

				this.cargarCombosCentroCostosForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyDetalleActivoFijoListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.detalleactivofijosForeignKey==null||this.detalleactivofijosForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=DetalleActivoFijoConstantesFunciones.getArrayColumnasGlobalesDetalleActivoFijo(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,DetalleActivoFijoConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=DetalleActivoFijoConstantesFunciones.SFINALQUERY;

				this.cargarCombosDetalleActivoFijosForeignKeyLista(finalQueryGlobal);
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
	
	public void cargarCombosLoteForeignKeyGastoDepreciacionCentroCostoListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			GastoDepreciacionCentroCostoParameterReturnGeneral gastodepreciacioncentrocostoReturnGeneral=new GastoDepreciacionCentroCostoParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.gastodepreciacioncentrocostoConstantesFunciones.cargarid_empresaGastoDepreciacionCentroCosto)
					 || (this.esRecargarFks && this.gastodepreciacioncentrocostoConstantesFunciones.cargarid_empresaGastoDepreciacionCentroCosto)) {

					if(!this.gastodepreciacioncentrocostoSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+gastodepreciacioncentrocostoSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}


				String finalQueryGlobalSucursal="";

				if(((this.sucursalsForeignKey==null||this.sucursalsForeignKey.size()<=0) && this.gastodepreciacioncentrocostoConstantesFunciones.cargarid_sucursalGastoDepreciacionCentroCosto)
					 || (this.esRecargarFks && this.gastodepreciacioncentrocostoConstantesFunciones.cargarid_sucursalGastoDepreciacionCentroCosto)) {

					if(!this.gastodepreciacioncentrocostoSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=SucursalConstantesFunciones.getArrayColumnasGlobalesSucursal(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalSucursal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,SucursalConstantesFunciones.TABLENAME);

						finalQueryGlobalSucursal=Funciones.GetFinalQueryAppend(finalQueryGlobalSucursal, "");
						finalQueryGlobalSucursal+=SucursalConstantesFunciones.SFINALQUERY;

						//this.cargarCombosSucursalsForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalSucursal=" WHERE " + ConstantesSql.ID + "="+gastodepreciacioncentrocostoSessionBean.getlidSucursalActual();
					}
				} else {
					finalQueryGlobalSucursal="NONE";
				}


				String finalQueryGlobalCentroCosto="";

				if(((this.centrocostosForeignKey==null||this.centrocostosForeignKey.size()<=0) && this.gastodepreciacioncentrocostoConstantesFunciones.cargarid_centro_costoGastoDepreciacionCentroCosto)
					 || (this.esRecargarFks && this.gastodepreciacioncentrocostoConstantesFunciones.cargarid_centro_costoGastoDepreciacionCentroCosto)) {

					if(!this.gastodepreciacioncentrocostoSessionBean.getisBusquedaDesdeForeignKeySesionCentroCosto()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=CentroCostoConstantesFunciones.getArrayColumnasGlobalesCentroCosto(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalCentroCosto=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,CentroCostoConstantesFunciones.TABLENAME);

						finalQueryGlobalCentroCosto=Funciones.GetFinalQueryAppend(finalQueryGlobalCentroCosto, "");
						finalQueryGlobalCentroCosto+=CentroCostoConstantesFunciones.SFINALQUERY;

						//this.cargarCombosCentroCostosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalCentroCosto=" WHERE " + ConstantesSql.ID + "="+gastodepreciacioncentrocostoSessionBean.getlidCentroCostoActual();
					}
				} else {
					finalQueryGlobalCentroCosto="NONE";
				}


				String finalQueryGlobalDetalleActivoFijo="";

				if(((this.detalleactivofijosForeignKey==null||this.detalleactivofijosForeignKey.size()<=0) && this.gastodepreciacioncentrocostoConstantesFunciones.cargarid_detalle_activo_fijoGastoDepreciacionCentroCosto)
					 || (this.esRecargarFks && this.gastodepreciacioncentrocostoConstantesFunciones.cargarid_detalle_activo_fijoGastoDepreciacionCentroCosto)) {

					if(!this.gastodepreciacioncentrocostoSessionBean.getisBusquedaDesdeForeignKeySesionDetalleActivoFijo()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=DetalleActivoFijoConstantesFunciones.getArrayColumnasGlobalesDetalleActivoFijo(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalDetalleActivoFijo=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,DetalleActivoFijoConstantesFunciones.TABLENAME);

						finalQueryGlobalDetalleActivoFijo=Funciones.GetFinalQueryAppend(finalQueryGlobalDetalleActivoFijo, "");
						finalQueryGlobalDetalleActivoFijo+=DetalleActivoFijoConstantesFunciones.SFINALQUERY;

						//this.cargarCombosDetalleActivoFijosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalDetalleActivoFijo=" WHERE " + ConstantesSql.ID + "="+gastodepreciacioncentrocostoSessionBean.getlidDetalleActivoFijoActual();
					}
				} else {
					finalQueryGlobalDetalleActivoFijo="NONE";
				}


				String finalQueryGlobalCuentaContable="";

				if(((this.cuentacontablesForeignKey==null||this.cuentacontablesForeignKey.size()<=0) && this.gastodepreciacioncentrocostoConstantesFunciones.cargarid_cuenta_contableGastoDepreciacionCentroCosto)
					 || (this.esRecargarFks && this.gastodepreciacioncentrocostoConstantesFunciones.cargarid_cuenta_contableGastoDepreciacionCentroCosto)) {

					if(!this.gastodepreciacioncentrocostoSessionBean.getisBusquedaDesdeForeignKeySesionCuentaContable()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();

						this.arrDatoGeneralNo.add("id_modulo");

						arrColumnasGlobales=CuentaContableConstantesFunciones.getArrayColumnasGlobalesCuentaContable(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalCuentaContable=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,CuentaContableConstantesFunciones.TABLENAME);

						finalQueryGlobalCuentaContable=Funciones.GetFinalQueryAppend(finalQueryGlobalCuentaContable, "");
						finalQueryGlobalCuentaContable+=CuentaContableConstantesFunciones.SFINALQUERY;

						//this.cargarCombosCuentaContablesForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalCuentaContable=" WHERE " + ConstantesSql.ID + "="+gastodepreciacioncentrocostoSessionBean.getlidCuentaContableActual();
					}
				} else {
					finalQueryGlobalCuentaContable="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				gastodepreciacioncentrocostoReturnGeneral=gastodepreciacioncentrocostoLogic.cargarCombosLoteForeignKeyGastoDepreciacionCentroCosto(finalQueryGlobalEmpresa,finalQueryGlobalSucursal,finalQueryGlobalCentroCosto,finalQueryGlobalDetalleActivoFijo,finalQueryGlobalCuentaContable);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=gastodepreciacioncentrocostoReturnGeneral.getempresasForeignKey();
			}

			if(!finalQueryGlobalSucursal.equals("NONE")) {
				this.sucursalsForeignKey=gastodepreciacioncentrocostoReturnGeneral.getsucursalsForeignKey();
			}

			if(!finalQueryGlobalCentroCosto.equals("NONE")) {
				this.centrocostosForeignKey=gastodepreciacioncentrocostoReturnGeneral.getcentrocostosForeignKey();
			}

			if(!finalQueryGlobalDetalleActivoFijo.equals("NONE")) {
				this.detalleactivofijosForeignKey=gastodepreciacioncentrocostoReturnGeneral.getdetalleactivofijosForeignKey();
			}

			if(!finalQueryGlobalCuentaContable.equals("NONE")) {
				this.cuentacontablesForeignKey=gastodepreciacioncentrocostoReturnGeneral.getcuentacontablesForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyGastoDepreciacionCentroCosto()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeySucursal();
			this.addItemDefectoCombosForeignKeyCentroCosto();
			this.addItemDefectoCombosForeignKeyDetalleActivoFijo();
			this.addItemDefectoCombosForeignKeyCuentaContable();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.gastodepreciacioncentrocostoSessionBean==null) {
				this.gastodepreciacioncentrocostoSessionBean=new GastoDepreciacionCentroCostoSessionBean();
			}

			if(!this.gastodepreciacioncentrocostoSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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

			if(!this.gastodepreciacioncentrocostoSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
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

	public void addItemDefectoCombosForeignKeyCentroCosto()throws Exception {
		try {

			if(!this.gastodepreciacioncentrocostoSessionBean.getisBusquedaDesdeForeignKeySesionCentroCosto()) {
				CentroCosto centrocosto=new CentroCosto();
				CentroCostoConstantesFunciones.setCentroCostoDescripcion(centrocosto,Constantes.SMENSAJE_ESCOJA_OPCION);
				centrocosto.setId(null);

				if(!CentroCostoConstantesFunciones.ExisteEnLista(this.centrocostosForeignKey,centrocosto,true)) {

					this.centrocostosForeignKey.add(0,centrocosto);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyDetalleActivoFijo()throws Exception {
		try {

			if(!this.gastodepreciacioncentrocostoSessionBean.getisBusquedaDesdeForeignKeySesionDetalleActivoFijo()) {
				DetalleActivoFijo detalleactivofijo=new DetalleActivoFijo();
				DetalleActivoFijoConstantesFunciones.setDetalleActivoFijoDescripcion(detalleactivofijo,Constantes.SMENSAJE_ESCOJA_OPCION);
				detalleactivofijo.setId(null);

				if(!DetalleActivoFijoConstantesFunciones.ExisteEnLista(this.detalleactivofijosForeignKey,detalleactivofijo,true)) {

					this.detalleactivofijosForeignKey.add(0,detalleactivofijo);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyCuentaContable()throws Exception {
		try {

			if(!this.gastodepreciacioncentrocostoSessionBean.getisBusquedaDesdeForeignKeySesionCuentaContable()) {
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
	
	public void initActionsCombosTodosForeignKeyGastoDepreciacionCentroCosto()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyGastoDepreciacionCentroCosto(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyGastoDepreciacionCentroCosto()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
				this.setActualSucursalForeignKey(this.parametroGeneralUsuario.getid_sucursal(),false,"Formulario");
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyGastoDepreciacionCentroCosto();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyGastoDepreciacionCentroCosto(GastoDepreciacionCentroCosto gastodepreciacioncentrocosto)throws Exception {	
		try {
			
			this.setActualCentroCostoForeignKey(gastodepreciacioncentrocosto.getid_centro_costo(),false,"Formulario");
			this.setActualDetalleActivoFijoForeignKey(gastodepreciacioncentrocosto.getid_detalle_activo_fijo(),false,"Formulario");
			this.setActualCuentaContableForeignKey(gastodepreciacioncentrocosto.getid_cuenta_contable(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyGastoDepreciacionCentroCosto(GastoDepreciacionCentroCosto gastodepreciacioncentrocosto,String sTipoEvento)throws Exception {	
		try {
			
			

				if(gastodepreciacioncentrocosto.getCentroCosto()!=null && !sTipoEvento.equals("id_centro_costoGastoDepreciacionCentroCosto")) { //sTipoEvento Evita Bucle Infinito

					this.centrocostosForeignKey=new ArrayList<CentroCosto>();
					this.centrocostosForeignKey.add(gastodepreciacioncentrocosto.getCentroCosto());

					this.addItemDefectoCombosForeignKeyCentroCosto();
					this.cargarCombosFrameCentroCostosForeignKey("Todos");
				}

				if(gastodepreciacioncentrocosto.getCuentaContable()!=null && !sTipoEvento.equals("id_cuenta_contableGastoDepreciacionCentroCosto")) { //sTipoEvento Evita Bucle Infinito

					this.cuentacontablesForeignKey=new ArrayList<CuentaContable>();
					this.cuentacontablesForeignKey.add(gastodepreciacioncentrocosto.getCuentaContable());

					this.addItemDefectoCombosForeignKeyCuentaContable();
					this.cargarCombosFrameCuentaContablesForeignKey("Todos");
				}
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyGastoDepreciacionCentroCosto()throws Exception {	
		try {
			
			this.setActualCentroCostoForeignKey(this.gastodepreciacioncentrocostoConstantesFunciones.getid_centro_costo(),false,"Formulario");
			this.setActualDetalleActivoFijoForeignKey(this.gastodepreciacioncentrocostoConstantesFunciones.getid_detalle_activo_fijo(),false,"Formulario");
			this.setActualCuentaContableForeignKey(this.gastodepreciacioncentrocostoConstantesFunciones.getid_cuenta_contable(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyGastoDepreciacionCentroCosto()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyGastoDepreciacionCentroCosto()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyGastoDepreciacionCentroCosto()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroGastoDepreciacionCentroCosto()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyGastoDepreciacionCentroCosto()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameSucursalsForeignKey("Todos");
			this.cargarCombosFrameCentroCostosForeignKey("Todos");
			this.cargarCombosFrameDetalleActivoFijosForeignKey("Todos");
			this.cargarCombosFrameCuentaContablesForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyGastoDepreciacionCentroCosto(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameSucursalsForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameCentroCostosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameDetalleActivoFijosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameCuentaContablesForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyGastoDepreciacionCentroCosto()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto.jComboBoxid_empresaGastoDepreciacionCentroCosto!=null && this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto.jComboBoxid_empresaGastoDepreciacionCentroCosto.getItemCount()>0) {
				this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto.jComboBoxid_empresaGastoDepreciacionCentroCosto.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto.jComboBoxid_sucursalGastoDepreciacionCentroCosto!=null && this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto.jComboBoxid_sucursalGastoDepreciacionCentroCosto.getItemCount()>0) {
				this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto.jComboBoxid_sucursalGastoDepreciacionCentroCosto.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto.jComboBoxid_centro_costoGastoDepreciacionCentroCosto!=null && this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto.jComboBoxid_centro_costoGastoDepreciacionCentroCosto.getItemCount()>0) {
				this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto.jComboBoxid_centro_costoGastoDepreciacionCentroCosto.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto.jComboBoxid_detalle_activo_fijoGastoDepreciacionCentroCosto!=null && this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto.jComboBoxid_detalle_activo_fijoGastoDepreciacionCentroCosto.getItemCount()>0) {
				this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto.jComboBoxid_detalle_activo_fijoGastoDepreciacionCentroCosto.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto.jComboBoxid_cuenta_contableGastoDepreciacionCentroCosto!=null && this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto.jComboBoxid_cuenta_contableGastoDepreciacionCentroCosto.getItemCount()>0) {
				this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto.jComboBoxid_cuenta_contableGastoDepreciacionCentroCosto.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	










	
	

	public GastoDepreciacionCentroCostoBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public GastoDepreciacionCentroCostoBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public GastoDepreciacionCentroCostoBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.gastodepreciacioncentrocostoSessionBean=new GastoDepreciacionCentroCostoSessionBean(); 
		this.gastodepreciacioncentrocostoConstantesFunciones=new GastoDepreciacionCentroCostoConstantesFunciones(); 
		this.gastodepreciacioncentrocostoBean=new GastoDepreciacionCentroCosto();//(this.gastodepreciacioncentrocostoConstantesFunciones); 		
		this.gastodepreciacioncentrocostoReturnGeneral=new GastoDepreciacionCentroCostoParameterReturnGeneral(); 
		
		this.gastodepreciacioncentrocostoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.gastodepreciacioncentrocostoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public GastoDepreciacionCentroCostoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public GastoDepreciacionCentroCostoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public GastoDepreciacionCentroCostoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessGastoDepreciacionCentroCosto(true);
			
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
			
			this.gastodepreciacioncentrocostoConstantesFunciones=new GastoDepreciacionCentroCostoConstantesFunciones(); 
			this.gastodepreciacioncentrocostoBean=new GastoDepreciacionCentroCosto();//this.gastodepreciacioncentrocostoConstantesFunciones); 			
			this.gastodepreciacioncentrocostoReturnGeneral=new GastoDepreciacionCentroCostoParameterReturnGeneral(); 
		
			GastoDepreciacionCentroCostoBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Gasto Depreciacion Centro Costo Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			this.conTotales=true;
			
			
			this.gastodepreciacioncentrocosto=new GastoDepreciacionCentroCosto();
			this.gastodepreciacioncentrocostos = new ArrayList<GastoDepreciacionCentroCosto>();
			this.gastodepreciacioncentrocostosAux = new ArrayList<GastoDepreciacionCentroCosto>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.gastodepreciacioncentrocostoLogic=new GastoDepreciacionCentroCostoLogic();
				this.gastodepreciacioncentrocostoLogic.getNewConnexionToDeep("");
			}
			
			//this.gastodepreciacioncentrocostoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.gastodepreciacioncentrocostoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoGastoDepreciacionCentroCosto!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoGastoDepreciacionCentroCosto);	
					}
					
					if(this.jInternalFrameImportacionGastoDepreciacionCentroCosto!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionGastoDepreciacionCentroCosto);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByGastoDepreciacionCentroCosto!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByGastoDepreciacionCentroCosto);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto);
				this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto.setVisible(false);
				this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoGastoDepreciacionCentroCosto!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoGastoDepreciacionCentroCosto);
					this.jInternalFrameReporteDinamicoGastoDepreciacionCentroCosto.setVisible(false);
					this.jInternalFrameReporteDinamicoGastoDepreciacionCentroCosto.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionGastoDepreciacionCentroCosto!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionGastoDepreciacionCentroCosto);
					this.jInternalFrameImportacionGastoDepreciacionCentroCosto.setVisible(false);
					this.jInternalFrameImportacionGastoDepreciacionCentroCosto.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByGastoDepreciacionCentroCosto!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByGastoDepreciacionCentroCosto);
					this.jInternalFrameOrderByGastoDepreciacionCentroCosto.setVisible(false);
					this.jInternalFrameOrderByGastoDepreciacionCentroCosto.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idGastoDepreciacionCentroCostoActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=GastoDepreciacionCentroCostoConstantesFunciones.INUMEROPAGINACION;
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
			
			this.gastodepreciacioncentrocostoReturnGeneral=new GastoDepreciacionCentroCostoParameterReturnGeneral();
			
			this.gastodepreciacioncentrocostoParameterGeneral=new GastoDepreciacionCentroCostoParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.gastodepreciacioncentrocostoLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.gastodepreciacioncentrocostoSessionBean.getEsGuardarRelacionado()) {
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
			
			if(GastoDepreciacionCentroCostoJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.gastodepreciacioncentrocostoSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,GastoDepreciacionCentroCostoConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.gastodepreciacioncentrocostoSessionBean.getEsGuardarRelacionado(),this.gastodepreciacioncentrocostoSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,GastoDepreciacionCentroCostoConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.gastodepreciacioncentrocostoSessionBean.getEsGuardarRelacionado(),this.gastodepreciacioncentrocostoSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoGastoDepreciacionCentroCosto=false;
			this.isVisibilidadCeldaDuplicarGastoDepreciacionCentroCosto=true;
			this.isVisibilidadCeldaCopiarGastoDepreciacionCentroCosto=true;
			this.isVisibilidadCeldaVerFormGastoDepreciacionCentroCosto=true;
			this.isVisibilidadCeldaOrdenGastoDepreciacionCentroCosto=true;
			this.isVisibilidadCeldaNuevoRelacionesGastoDepreciacionCentroCosto=false;
			this.isVisibilidadCeldaModificarGastoDepreciacionCentroCosto=false;
			this.isVisibilidadCeldaActualizarGastoDepreciacionCentroCosto=false;
			this.isVisibilidadCeldaEliminarGastoDepreciacionCentroCosto=false;
			this.isVisibilidadCeldaCancelarGastoDepreciacionCentroCosto=false;
			this.isVisibilidadCeldaGuardarGastoDepreciacionCentroCosto=false;
			this.isVisibilidadCeldaGuardarCambiosGastoDepreciacionCentroCosto=false;
			
			
			this.isVisibilidadFK_IdCentroCosto=true;
			this.isVisibilidadFK_IdCuentaContable=true;
			this.isVisibilidadFK_IdDetalleActivoFijo=true;
			this.isVisibilidadFK_IdEmpresa=true;
			this.isVisibilidadFK_IdSucursal=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesGastoDepreciacionCentroCosto("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosGastoDepreciacionCentroCosto();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioGastoDepreciacionCentroCosto(false);
			
			this.setPermisosUsuarioGastoDepreciacionCentroCosto();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.gastodepreciacioncentrocostoSessionBean.getEsGuardarRelacionado() 
				|| (this.gastodepreciacioncentrocostoSessionBean.getEsGuardarRelacionado() && this.gastodepreciacioncentrocostoSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioGastoDepreciacionCentroCostoClasesRelacionadas();
			}
			
			if(this.gastodepreciacioncentrocostoSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioGastoDepreciacionCentroCostoClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!GastoDepreciacionCentroCostoJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosGastoDepreciacionCentroCosto();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualGastoDepreciacionCentroCosto();
			}
			
			if(!this.isPermisoBusquedaGastoDepreciacionCentroCosto) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasGastoDepreciacionCentroCosto.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.gastodepreciacioncentrocostoSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(true);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(true);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioGastoDepreciacionCentroCosto,this.isPermisoPaginacionMedioGastoDepreciacionCentroCosto,this.isPermisoPaginacionTodoGastoDepreciacionCentroCosto);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(GastoDepreciacionCentroCostoConstantesFunciones.getTiposSeleccionarGastoDepreciacionCentroCosto());
				
				this.tiposColumnasSelect=GastoDepreciacionCentroCostoConstantesFunciones.getTiposSeleccionarGastoDepreciacionCentroCosto(true);
				
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
			//if(!this.gastodepreciacioncentrocostoSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioGastoDepreciacionCentroCosto();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(true,false,true);
				this.setAccionesUsuarioGastoDepreciacionCentroCosto(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(true,false,true);							
				this.setAccionesUsuarioGastoDepreciacionCentroCosto(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesGastoDepreciacionCentroCosto() ;
			
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
			this.centrocostoLogic=new CentroCostoLogic();
			this.detalleactivofijoLogic=new DetalleActivoFijoLogic();
			this.cuentacontableLogic=new CuentaContableLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				gastodepreciacioncentrocostoImplementable= (GastoDepreciacionCentroCostoImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+GastoDepreciacionCentroCostoConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				gastodepreciacioncentrocostoImplementableHome= (GastoDepreciacionCentroCostoImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+GastoDepreciacionCentroCostoConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.gastodepreciacioncentrocostos= new ArrayList<GastoDepreciacionCentroCosto>();
			this.gastodepreciacioncentrocostosEliminados= new ArrayList<GastoDepreciacionCentroCosto>();
						
			this.isEsNuevoGastoDepreciacionCentroCosto=false;
			this.esParaAccionDesdeFormularioGastoDepreciacionCentroCosto=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			//BUSQUEDA INTERNA FK
			this.idCentroCostoActual=0L;
			this.idCuentaContableActual=0L;
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			this.sucursalsForeignKey=new ArrayList<Sucursal>() ;
			this.centrocostosForeignKey=new ArrayList<CentroCosto>() ;
			this.detalleactivofijosForeignKey=new ArrayList<DetalleActivoFijo>() ;
			this.cuentacontablesForeignKey=new ArrayList<CuentaContable>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyGastoDepreciacionCentroCosto(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroGastoDepreciacionCentroCosto();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.gastodepreciacioncentrocostoSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			GastoDepreciacionCentroCostoBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=GastoDepreciacionCentroCostoConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesGastoDepreciacionCentroCosto("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingGastoDepreciacionCentroCosto(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioGastoDepreciacionCentroCosto();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioGastoDepreciacionCentroCosto();
			}
			
			GastoDepreciacionCentroCostoBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasGastoDepreciacionCentroCosto.getTabCount(); i++) {
					this.jTabbedPaneBusquedasGastoDepreciacionCentroCosto.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasGastoDepreciacionCentroCosto.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.gastodepreciacioncentrocostoLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessGastoDepreciacionCentroCosto(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga GastoDepreciacionCentroCosto: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.gastodepreciacioncentrocostoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,GastoDepreciacionCentroCostoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.gastodepreciacioncentrocostoLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectGastoDepreciacionCentroCosto() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesGastoDepreciacionCentroCosto")) {
				iIndex=this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto.jTabbedPaneRelacionesGastoDepreciacionCentroCosto.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto.jTabbedPaneRelacionesGastoDepreciacionCentroCosto.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosGastoDepreciacionCentroCosto.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessGastoDepreciacionCentroCosto();	
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
	
	public void cargarCombosForeignKeyGastoDepreciacionCentroCosto(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyGastoDepreciacionCentroCosto(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyGastoDepreciacionCentroCosto(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyGastoDepreciacionCentroCostoListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyGastoDepreciacionCentroCosto();
		
		this.cargarCombosFrameForeignKeyGastoDepreciacionCentroCosto();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyGastoDepreciacionCentroCosto();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyGastoDepreciacionCentroCosto();
		}
	}
	
	

	public void cargarCombosForeignKeyCentroCosto(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyCentroCostoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyCentroCosto();
				this.cargarCombosFrameCentroCostosForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaCentroCosto(this.centrocostosForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyDetalleActivoFijo(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyDetalleActivoFijoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyDetalleActivoFijo();
				this.cargarCombosFrameDetalleActivoFijosForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaDetalleActivoFijo(this.detalleactivofijosForeignKey);

		} catch(Exception e) {
			throw e;
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
	
	public void jButtonNuevoGastoDepreciacionCentroCostoActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.gastodepreciacioncentrocostoSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			GastoDepreciacionCentroCostoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.gastodepreciacioncentrocosto,new Object(),this.gastodepreciacioncentrocostoParameterGeneral,this.gastodepreciacioncentrocostoReturnGeneral);
			
			
			if(jTableDatosGastoDepreciacionCentroCosto.getRowCount()>=1) {
				jTableDatosGastoDepreciacionCentroCosto.removeRowSelectionInterval(0, jTableDatosGastoDepreciacionCentroCosto.getRowCount()-1);						
			}
			
			this.isEsNuevoGastoDepreciacionCentroCosto=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoGastoDepreciacionCentroCosto(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesGastoDepreciacionCentroCosto(true);			
			//this.gastodepreciacioncentrocosto=new GastoDepreciacionCentroCosto();
			//this.gastodepreciacioncentrocosto.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesGastoDepreciacionCentroCosto(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualGastoDepreciacionCentroCosto() ;
			
			if(GastoDepreciacionCentroCostoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleGastoDepreciacionCentroCosto(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.gastodepreciacioncentrocosto);	
			this.actualizarInformacion("INFO_PADRE",false,this.gastodepreciacioncentrocosto);				
			
			GastoDepreciacionCentroCostoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.gastodepreciacioncentrocosto,new Object(),this.gastodepreciacioncentrocostoParameterGeneral,this.gastodepreciacioncentrocostoReturnGeneral);
			
			if(this.gastodepreciacioncentrocostoSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar GastoDepreciacionCentroCosto: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			GastoDepreciacionCentroCostoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.gastodepreciacioncentrocosto,new Object(),this.gastodepreciacioncentrocostoParameterGeneral,this.gastodepreciacioncentrocostoReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,GastoDepreciacionCentroCostoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarGastoDepreciacionCentroCostoActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<GastoDepreciacionCentroCosto> gastodepreciacioncentrocostosSeleccionados=new ArrayList<GastoDepreciacionCentroCosto>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosGastoDepreciacionCentroCosto.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosGastoDepreciacionCentroCosto.getSelectedRows().length;			
			}
			
			gastodepreciacioncentrocostosSeleccionados=this.getGastoDepreciacionCentroCostosSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoGastoDepreciacionCentroCosto--;			
				//GastoDepreciacionCentroCosto gastodepreciacioncentrocostoAux= new GastoDepreciacionCentroCosto();			
				//gastodepreciacioncentrocostoAux.setId(this.iIdNuevoGastoDepreciacionCentroCosto);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//GastoDepreciacionCentroCosto gastodepreciacioncentrocostoOrigen=new GastoDepreciacionCentroCosto();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(GastoDepreciacionCentroCosto gastodepreciacioncentrocostoOrigen : gastodepreciacioncentrocostosSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosGastoDepreciacionCentroCosto.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							gastodepreciacioncentrocostoOrigen =(GastoDepreciacionCentroCosto) this.gastodepreciacioncentrocostoLogic.getGastoDepreciacionCentroCostos().toArray()[this.jTableDatosGastoDepreciacionCentroCosto.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							gastodepreciacioncentrocostoOrigen =(GastoDepreciacionCentroCosto) this.gastodepreciacioncentrocostos.toArray()[this.jTableDatosGastoDepreciacionCentroCosto.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaGastoDepreciacionCentroCosto();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.gastodepreciacioncentrocosto.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosGastoDepreciacionCentroCosto(gastodepreciacioncentrocostoOrigen,this.gastodepreciacioncentrocosto,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysGastoDepreciacionCentroCosto(this.gastodepreciacioncentrocosto);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.gastodepreciacioncentrocostoLogic.getGastoDepreciacionCentroCostos().add(this.gastodepreciacioncentrocostoAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.gastodepreciacioncentrocostos.add(this.gastodepreciacioncentrocostoAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaGastoDepreciacionCentroCosto(false);
				
				this.jTableDatosGastoDepreciacionCentroCosto.setRowSelectionInterval(this.getIndiceNuevoGastoDepreciacionCentroCosto(), this.getIndiceNuevoGastoDepreciacionCentroCosto());
				
				int iLastRow =  this.jTableDatosGastoDepreciacionCentroCosto.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosGastoDepreciacionCentroCosto.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosGastoDepreciacionCentroCosto.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaGastoDepreciacionCentroCosto(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,GastoDepreciacionCentroCostoConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarGastoDepreciacionCentroCostoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<GastoDepreciacionCentroCosto> gastodepreciacioncentrocostosSeleccionados=new ArrayList<GastoDepreciacionCentroCosto>();									
		
			GastoDepreciacionCentroCosto gastodepreciacioncentrocostoOrigen=new GastoDepreciacionCentroCosto();
			GastoDepreciacionCentroCosto gastodepreciacioncentrocostoDestino=new GastoDepreciacionCentroCosto();
				
			gastodepreciacioncentrocostosSeleccionados=this.getGastoDepreciacionCentroCostosSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosGastoDepreciacionCentroCosto.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || gastodepreciacioncentrocostosSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosGastoDepreciacionCentroCosto.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						gastodepreciacioncentrocostoOrigen =(GastoDepreciacionCentroCosto) this.gastodepreciacioncentrocostoLogic.getGastoDepreciacionCentroCostos().toArray()[this.jTableDatosGastoDepreciacionCentroCosto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						gastodepreciacioncentrocostoOrigen =(GastoDepreciacionCentroCosto) this.gastodepreciacioncentrocostos.toArray()[this.jTableDatosGastoDepreciacionCentroCosto.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						gastodepreciacioncentrocostoDestino =(GastoDepreciacionCentroCosto) this.gastodepreciacioncentrocostoLogic.getGastoDepreciacionCentroCostos().toArray()[this.jTableDatosGastoDepreciacionCentroCosto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						gastodepreciacioncentrocostoDestino =(GastoDepreciacionCentroCosto) this.gastodepreciacioncentrocostos.toArray()[this.jTableDatosGastoDepreciacionCentroCosto.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				gastodepreciacioncentrocostoOrigen =gastodepreciacioncentrocostosSeleccionados.get(0);
				gastodepreciacioncentrocostoDestino =gastodepreciacioncentrocostosSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosGastoDepreciacionCentroCosto(gastodepreciacioncentrocostoOrigen,gastodepreciacioncentrocostoDestino,true,false);
				
				gastodepreciacioncentrocostoDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(gastodepreciacioncentrocostoDestino,gastodepreciacioncentrocostoLogic.getGastoDepreciacionCentroCostos());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(gastodepreciacioncentrocostoDestino,gastodepreciacioncentrocostos);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaGastoDepreciacionCentroCosto(false);
				
				//this.jTableDatosGastoDepreciacionCentroCosto.setRowSelectionInterval(this.getIndiceNuevoGastoDepreciacionCentroCosto(), this.getIndiceNuevoGastoDepreciacionCentroCosto());
				
				int iLastRow =  this.jTableDatosGastoDepreciacionCentroCosto.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosGastoDepreciacionCentroCosto.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosGastoDepreciacionCentroCosto.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaGastoDepreciacionCentroCosto(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GastoDepreciacionCentroCostoConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormGastoDepreciacionCentroCostoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GastoDepreciacionCentroCostoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarGastoDepreciacionCentroCostoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesGastoDepreciacionCentroCosto.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasGastoDepreciacionCentroCosto.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesGastoDepreciacionCentroCosto.setVisible(!isVisible);
			this.jPanelPaginacionGastoDepreciacionCentroCosto.setVisible(!isVisible);
			this.jPanelAccionesGastoDepreciacionCentroCosto.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GastoDepreciacionCentroCostoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarGastoDepreciacionCentroCostoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameGastoDepreciacionCentroCosto();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GastoDepreciacionCentroCostoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoGastoDepreciacionCentroCostoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoGastoDepreciacionCentroCosto();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GastoDepreciacionCentroCostoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionGastoDepreciacionCentroCostoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionGastoDepreciacionCentroCosto();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GastoDepreciacionCentroCostoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByGastoDepreciacionCentroCostoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByGastoDepreciacionCentroCosto();
			
			this.abrirFrameOrderByGastoDepreciacionCentroCosto();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GastoDepreciacionCentroCostoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByGastoDepreciacionCentroCostoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByGastoDepreciacionCentroCosto();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GastoDepreciacionCentroCostoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleGastoDepreciacionCentroCosto(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormGastoDepreciacionCentroCosto);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto.isMaximum()) {
					this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto.setSize(this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto.iWidthFormulario,this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto.isMaximum()) {
						this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto.jContentPaneDetalleGastoDepreciacionCentroCosto.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto.jTabbedPaneRelacionesGastoDepreciacionCentroCosto.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto.jContentPaneDetalleGastoDepreciacionCentroCosto.getWidth(),GastoDepreciacionCentroCostoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto.jTabbedPaneRelacionesGastoDepreciacionCentroCosto.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto.jContentPaneDetalleGastoDepreciacionCentroCosto.getWidth(),GastoDepreciacionCentroCostoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto.jTabbedPaneRelacionesGastoDepreciacionCentroCosto.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto.jContentPaneDetalleGastoDepreciacionCentroCosto.getWidth(),GastoDepreciacionCentroCostoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto.setVisible(true);
	        this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,GastoDepreciacionCentroCostoConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByGastoDepreciacionCentroCosto() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByGastoDepreciacionCentroCosto==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByGastoDepreciacionCentroCosto=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByGastoDepreciacionCentroCosto,false,this);
				} else {
					this.jInternalFrameOrderByGastoDepreciacionCentroCosto=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByGastoDepreciacionCentroCosto,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByGastoDepreciacionCentroCosto);
				this.jInternalFrameOrderByGastoDepreciacionCentroCosto.setVisible(false);
				this.jInternalFrameOrderByGastoDepreciacionCentroCosto.setSelected(false);
				
				this.jInternalFrameOrderByGastoDepreciacionCentroCosto.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByGastoDepreciacionCentroCosto"));
				
				this.inicializarActualizarBindingTablaOrderByGastoDepreciacionCentroCosto();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionGastoDepreciacionCentroCosto() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionGastoDepreciacionCentroCosto==null) {
				
				this.jInternalFrameImportacionGastoDepreciacionCentroCosto=new ImportacionJInternalFrame(GastoDepreciacionCentroCostoConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionGastoDepreciacionCentroCosto);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionGastoDepreciacionCentroCosto);
				this.jInternalFrameImportacionGastoDepreciacionCentroCosto.setVisible(false);
				this.jInternalFrameImportacionGastoDepreciacionCentroCosto.setSelected(false);


				this.jInternalFrameImportacionGastoDepreciacionCentroCosto.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionGastoDepreciacionCentroCosto"));
				this.jInternalFrameImportacionGastoDepreciacionCentroCosto.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionGastoDepreciacionCentroCosto"));
				this.jInternalFrameImportacionGastoDepreciacionCentroCosto.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionGastoDepreciacionCentroCosto"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoGastoDepreciacionCentroCosto() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoGastoDepreciacionCentroCosto==null) {
				this.jInternalFrameReporteDinamicoGastoDepreciacionCentroCosto=new ReporteDinamicoJInternalFrame(GastoDepreciacionCentroCostoConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoGastoDepreciacionCentroCosto);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoGastoDepreciacionCentroCosto);
				this.jInternalFrameReporteDinamicoGastoDepreciacionCentroCosto.setVisible(false);
				this.jInternalFrameReporteDinamicoGastoDepreciacionCentroCosto.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoGastoDepreciacionCentroCosto.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoGastoDepreciacionCentroCosto"));
				this.jInternalFrameReporteDinamicoGastoDepreciacionCentroCosto.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoGastoDepreciacionCentroCosto"));
				this.jInternalFrameReporteDinamicoGastoDepreciacionCentroCosto.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoGastoDepreciacionCentroCosto"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualGastoDepreciacionCentroCosto();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleGastoDepreciacionCentroCosto() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormGastoDepreciacionCentroCosto);
			
	       	this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto.setVisible(false);
	        this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto.setSelected(false);
			
			//this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto.dispose();
			//this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,GastoDepreciacionCentroCostoConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoGastoDepreciacionCentroCosto() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoGastoDepreciacionCentroCosto.setVisible(true);
	        this.jInternalFrameReporteDinamicoGastoDepreciacionCentroCosto.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,GastoDepreciacionCentroCostoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionGastoDepreciacionCentroCosto() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionGastoDepreciacionCentroCosto.setVisible(true);
	        this.jInternalFrameImportacionGastoDepreciacionCentroCosto.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,GastoDepreciacionCentroCostoConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByGastoDepreciacionCentroCosto() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByGastoDepreciacionCentroCosto.setVisible(true);
	        this.jInternalFrameOrderByGastoDepreciacionCentroCosto.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,GastoDepreciacionCentroCostoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByGastoDepreciacionCentroCosto() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByGastoDepreciacionCentroCosto.setVisible(false);
	        this.jInternalFrameOrderByGastoDepreciacionCentroCosto.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,GastoDepreciacionCentroCostoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoGastoDepreciacionCentroCosto() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoGastoDepreciacionCentroCosto.setVisible(false);
	        this.jInternalFrameReporteDinamicoGastoDepreciacionCentroCosto.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,GastoDepreciacionCentroCostoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionGastoDepreciacionCentroCosto() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionGastoDepreciacionCentroCosto.setVisible(false);
	        this.jInternalFrameImportacionGastoDepreciacionCentroCosto.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,GastoDepreciacionCentroCostoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	

				public void abrirFrameTreeCentroCosto(String sTipoProceso) { //throws Exception
					try {
						//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
						//this.jDesktopPane.add(jInternalFrameTreeCentroCosto);
						CentroCostoBeanSwingJInternalFrame centrocostoBeanSwingJInternalFrame=new CentroCostoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.BUSQUEDA,false,false,false,true);
						centrocostoBeanSwingJInternalFrame.setJInternalFrameParent(this);
						centrocostoBeanSwingJInternalFrame.jInternalFrameTreeCentroCosto.setsTipoProceso(sTipoProceso);

						if(sTipoProceso.equals("BUSQUEDA_FK")) {
							centrocostoBeanSwingJInternalFrame.jInternalFrameTreeCentroCosto.sTipoBusqueda="CentroCosto";
						}

						centrocostoBeanSwingJInternalFrame.getTodosCentroCostoArbol();
						centrocostoBeanSwingJInternalFrame.jInternalFrameTreeCentroCosto.setCentroCostos(centrocostoBeanSwingJInternalFrame.centrocostosArbol);
						centrocostoBeanSwingJInternalFrame.jInternalFrameTreeCentroCosto.CargarTreeCentroCosto();
						centrocostoBeanSwingJInternalFrame.jInternalFrameTreeCentroCosto.setVisible(true);
						centrocostoBeanSwingJInternalFrame.jInternalFrameTreeCentroCosto.setSelected(true);

						//SE CAMBIA PARENT ORIGINAL PARA QUE RETORNE EN ESTE FORMULARIO
						centrocostoBeanSwingJInternalFrame.jInternalFrameTreeCentroCosto.jInternalFrameParent=this;
						TitledBorder titledBorderGastoDepreciacionCentroCosto=(TitledBorder)this.jScrollPanelDatosGastoDepreciacionCentroCosto.getBorder();
						TitledBorder titledBorderCentroCosto=(TitledBorder)centrocostoBeanSwingJInternalFrame.jScrollPanelDatosCentroCosto.getBorder();

						titledBorderCentroCosto.setTitle(titledBorderGastoDepreciacionCentroCosto.getTitle() + " -> Centro Costo");


						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,centrocostoBeanSwingJInternalFrame);
						}
						this.jDesktopPane.add(centrocostoBeanSwingJInternalFrame);

					} catch (Exception e) {
						e.getStackTrace();
						//Funciones<%=getFrameworkDomain()%>.manageException(this, e,logger,<%=GetNombreClaseC(TablaBase.ToString())%>ConstantesFunciones.CLASSNAME);
					}
				}

				public void cerrarFrameTreeCentroCosto(CentroCostoBeanSwingJInternalFrame jInternalFrameTreeCentroCosto) throws Exception {
					try {
						//jDesktopPane.add(jInternalFrameTreeCentroCosto);
						jInternalFrameTreeCentroCosto.setVisible(false);
						jInternalFrameTreeCentroCosto.setSelected(false);
						//jInternalFrameTreeCentroCosto.dispose();
						//jInternalFrameTreeCentroCosto=null;
					} catch (final java.beans.PropertyVetoException e) {
						FuncionesSwing.manageException(this, e,logger);
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
						TitledBorder titledBorderGastoDepreciacionCentroCosto=(TitledBorder)this.jScrollPanelDatosGastoDepreciacionCentroCosto.getBorder();
						TitledBorder titledBorderCuentaContable=(TitledBorder)cuentacontableBeanSwingJInternalFrame.jScrollPanelDatosCuentaContable.getBorder();

						titledBorderCuentaContable.setTitle(titledBorderGastoDepreciacionCentroCosto.getTitle() + " -> Cuenta Contable");


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
	
	public void jButtonModificarGastoDepreciacionCentroCostoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarGastoDepreciacionCentroCosto(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GastoDepreciacionCentroCostoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarGastoDepreciacionCentroCosto(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosGastoDepreciacionCentroCosto.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesGastoDepreciacionCentroCosto(true);
			//this.isEsNuevoGastoDepreciacionCentroCosto=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.gastodepreciacioncentrocosto =(GastoDepreciacionCentroCosto) this.gastodepreciacioncentrocostoLogic.getGastoDepreciacionCentroCostos().toArray()[this.jTableDatosGastoDepreciacionCentroCosto.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.gastodepreciacioncentrocosto =(GastoDepreciacionCentroCosto) this.gastodepreciacioncentrocostos.toArray()[this.jTableDatosGastoDepreciacionCentroCosto.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesGastoDepreciacionCentroCosto("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesGastoDepreciacionCentroCosto(false) ;
			
			if(gastodepreciacioncentrocostoSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(GastoDepreciacionCentroCostoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleGastoDepreciacionCentroCosto(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualGastoDepreciacionCentroCosto(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GastoDepreciacionCentroCostoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaGastoDepreciacionCentroCostoActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosGastoDepreciacionCentroCosto.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.gastodepreciacioncentrocosto =(GastoDepreciacionCentroCosto) this.gastodepreciacioncentrocostoLogic.getGastoDepreciacionCentroCostos().toArray()[this.jTableDatosGastoDepreciacionCentroCosto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.gastodepreciacioncentrocosto =(GastoDepreciacionCentroCosto) this.gastodepreciacioncentrocostos.toArray()[this.jTableDatosGastoDepreciacionCentroCosto.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GastoDepreciacionCentroCostoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarGastoDepreciacionCentroCosto(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosGastoDepreciacionCentroCosto.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesGastoDepreciacionCentroCosto(true);
			//this.isEsNuevoGastoDepreciacionCentroCosto=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.gastodepreciacioncentrocosto =(GastoDepreciacionCentroCosto) this.gastodepreciacioncentrocostoLogic.getGastoDepreciacionCentroCostos().toArray()[this.jTableDatosGastoDepreciacionCentroCosto.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.gastodepreciacioncentrocosto =(GastoDepreciacionCentroCosto) this.gastodepreciacioncentrocostos.toArray()[this.jTableDatosGastoDepreciacionCentroCosto.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.gastodepreciacioncentrocosto.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesGastoDepreciacionCentroCosto("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesGastoDepreciacionCentroCosto(false) ;
			
			if(GastoDepreciacionCentroCostoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleGastoDepreciacionCentroCosto(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualGastoDepreciacionCentroCosto(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GastoDepreciacionCentroCostoConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
			
			if(sType.equals("CentroCosto")) {
				if(!this.gastodepreciacioncentrocostoConstantesFunciones.cargarid_centro_costoGastoDepreciacionCentroCosto) {
					this.cargarCombosCentroCostosForeignKeyLista(" where id="+id);
					//this.inicializarActualizarBindingGastoDepreciacionCentroCosto(false,false);
					this.cargarCombosFrameCentroCostosForeignKey("Todos");
				}

				this.setCombosCodigoDesdeBusquedaid_centro_costo (id);

				this.recargarComboTablaCentroCosto(this.centrocostosForeignKey);

			}
			
			if(sType.equals("CuentaContable")) {
				if(!this.gastodepreciacioncentrocostoConstantesFunciones.cargarid_cuenta_contableGastoDepreciacionCentroCosto) {
					this.cargarCombosCuentaContablesForeignKeyLista(" where id="+id);
					//this.inicializarActualizarBindingGastoDepreciacionCentroCosto(false,false);
					this.cargarCombosFrameCuentaContablesForeignKey("Todos");
				}

				this.setCombosCodigoDesdeBusquedaid_cuenta_contable (id);

				this.recargarComboTablaCuentaContable(this.cuentacontablesForeignKey);

			}
		} catch(Exception e) {
			throw e;
		}
	}
	
			
	
	public void recargarComboTablaCentroCosto(List<CentroCosto> centrocostosForeignKey)throws Exception{
		TableColumn tableColumnCentroCosto=this.jTableDatosGastoDepreciacionCentroCosto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosGastoDepreciacionCentroCosto,GastoDepreciacionCentroCostoConstantesFunciones.LABEL_IDCENTROCOSTO));
		TableCellEditor tableCellEditorCentroCosto =tableColumnCentroCosto.getCellEditor();

		CentroCostoTableCell centrocostoTableCellFk=(CentroCostoTableCell)tableCellEditorCentroCosto;

		if(centrocostoTableCellFk!=null) {
			centrocostoTableCellFk.setcentrocostosForeignKey(centrocostosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosGastoDepreciacionCentroCosto.getSelectedRow();

		//if(intSelectedRow<=0) {
			//centrocostoTableCellFk.setRowActual(intSelectedRow);
			//centrocostoTableCellFk.setcentrocostosForeignKeyActual(centrocostosForeignKey);
		//}


		if(centrocostoTableCellFk!=null) {
			centrocostoTableCellFk.RecargarCentroCostosForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaDetalleActivoFijo(List<DetalleActivoFijo> detalleactivofijosForeignKey)throws Exception{
		TableColumn tableColumnDetalleActivoFijo=this.jTableDatosGastoDepreciacionCentroCosto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosGastoDepreciacionCentroCosto,GastoDepreciacionCentroCostoConstantesFunciones.LABEL_IDDETALLEACTIVOFIJO));
		TableCellEditor tableCellEditorDetalleActivoFijo =tableColumnDetalleActivoFijo.getCellEditor();

		DetalleActivoFijoTableCell detalleactivofijoTableCellFk=(DetalleActivoFijoTableCell)tableCellEditorDetalleActivoFijo;

		if(detalleactivofijoTableCellFk!=null) {
			detalleactivofijoTableCellFk.setdetalleactivofijosForeignKey(detalleactivofijosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosGastoDepreciacionCentroCosto.getSelectedRow();

		//if(intSelectedRow<=0) {
			//detalleactivofijoTableCellFk.setRowActual(intSelectedRow);
			//detalleactivofijoTableCellFk.setdetalleactivofijosForeignKeyActual(detalleactivofijosForeignKey);
		//}


		if(detalleactivofijoTableCellFk!=null) {
			detalleactivofijoTableCellFk.RecargarDetalleActivoFijosForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaCuentaContable(List<CuentaContable> cuentacontablesForeignKey)throws Exception{
		TableColumn tableColumnCuentaContable=this.jTableDatosGastoDepreciacionCentroCosto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosGastoDepreciacionCentroCosto,GastoDepreciacionCentroCostoConstantesFunciones.LABEL_IDCUENTACONTABLE));
		TableCellEditor tableCellEditorCuentaContable =tableColumnCuentaContable.getCellEditor();

		CuentaContableTableCell cuentacontableTableCellFk=(CuentaContableTableCell)tableCellEditorCuentaContable;

		if(cuentacontableTableCellFk!=null) {
			cuentacontableTableCellFk.setcuentacontablesForeignKey(cuentacontablesForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosGastoDepreciacionCentroCosto.getSelectedRow();

		//if(intSelectedRow<=0) {
			//cuentacontableTableCellFk.setRowActual(intSelectedRow);
			//cuentacontableTableCellFk.setcuentacontablesForeignKeyActual(cuentacontablesForeignKey);
		//}


		if(cuentacontableTableCellFk!=null) {
			cuentacontableTableCellFk.RecargarCuentaContablesForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	

	public void setCombosCodigoDesdeBusquedaid_centro_costo (Long id) throws Exception {
		this.setActualCentroCostoForeignKey(id,true,"Todos");

	};
	

	public void setCombosCodigoDesdeBusquedaid_cuenta_contable (Long id) throws Exception {
		this.setActualCuentaContableForeignKey(id,true,"Todos");

	};
	
	public void jButtonActualizarGastoDepreciacionCentroCostoActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.gastodepreciacioncentrocostoLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesGastoDepreciacionCentroCosto(false);
			
			//if(!this.isEsNuevoGastoDepreciacionCentroCosto) {								
				int intSelectedRow = this.jTableDatosGastoDepreciacionCentroCosto.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.gastodepreciacioncentrocosto =(GastoDepreciacionCentroCosto) this.gastodepreciacioncentrocostoLogic.getGastoDepreciacionCentroCostos().toArray()[this.jTableDatosGastoDepreciacionCentroCosto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.gastodepreciacioncentrocosto =(GastoDepreciacionCentroCosto) this.gastodepreciacioncentrocostos.toArray()[this.jTableDatosGastoDepreciacionCentroCosto.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(GastoDepreciacionCentroCostoJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualGastoDepreciacionCentroCosto(this.gastodepreciacioncentrocosto,true);
				this.setVariablesFormularioToObjetoActualForeignKeysGastoDepreciacionCentroCosto(this.gastodepreciacioncentrocosto);
				
			}
			
			if(this.permiteMantenimiento(this.gastodepreciacioncentrocosto)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.gastodepreciacioncentrocostoSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoGastoDepreciacionCentroCosto=true;
					this.inicializarActualizarBindingTablaGastoDepreciacionCentroCosto(false);
					this.isEsNuevoGastoDepreciacionCentroCosto=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoGastoDepreciacionCentroCosto=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoGastoDepreciacionCentroCosto=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesGastoDepreciacionCentroCosto(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualGastoDepreciacionCentroCosto(false);
				
				this.habilitarDeshabilitarControlesGastoDepreciacionCentroCosto(false);
			
												
				
				if(GastoDepreciacionCentroCostoJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleGastoDepreciacionCentroCosto();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoGastoDepreciacionCentroCostoActionPerformed(evt,gastodepreciacioncentrocostoSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualGastoDepreciacionCentroCosto(this.gastodepreciacioncentrocosto,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosGastoDepreciacionCentroCosto.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,gastodepreciacioncentrocostoSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.gastodepreciacioncentrocostoLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.gastodepreciacioncentrocosto.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(GastoDepreciacionCentroCosto.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",GastoDepreciacionCentroCosto.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.gastodepreciacioncentrocostoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,GastoDepreciacionCentroCostoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.gastodepreciacioncentrocostoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarGastoDepreciacionCentroCostoActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.gastodepreciacioncentrocostoLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosGastoDepreciacionCentroCosto.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.gastodepreciacioncentrocosto =(GastoDepreciacionCentroCosto) this.gastodepreciacioncentrocostoLogic.getGastoDepreciacionCentroCostos().toArray()[this.jTableDatosGastoDepreciacionCentroCosto.convertRowIndexToModel(intSelectedRow)];
				this.gastodepreciacioncentrocosto.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.gastodepreciacioncentrocosto =(GastoDepreciacionCentroCosto) this.gastodepreciacioncentrocostos.toArray()[this.jTableDatosGastoDepreciacionCentroCosto.convertRowIndexToModel(intSelectedRow)];
				this.gastodepreciacioncentrocosto.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.gastodepreciacioncentrocosto)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.gastodepreciacioncentrocostoSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((GastoDepreciacionCentroCostoModel) this.jTableDatosGastoDepreciacionCentroCosto.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoGastoDepreciacionCentroCosto=true;
				this.inicializarActualizarBindingTablaGastoDepreciacionCentroCosto(false);
				this.isEsNuevoGastoDepreciacionCentroCosto=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesGastoDepreciacionCentroCosto(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualGastoDepreciacionCentroCosto(false);
				
				this.habilitarDeshabilitarControlesGastoDepreciacionCentroCosto(false);
				
				
				
				if(GastoDepreciacionCentroCostoJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleGastoDepreciacionCentroCosto();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.gastodepreciacioncentrocostoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.gastodepreciacioncentrocostoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,GastoDepreciacionCentroCostoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.gastodepreciacioncentrocostoLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarGastoDepreciacionCentroCostoActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosGastoDepreciacionCentroCosto.getRowCount()>=1) {
				jTableDatosGastoDepreciacionCentroCosto.removeRowSelectionInterval(0, jTableDatosGastoDepreciacionCentroCosto.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesGastoDepreciacionCentroCosto(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaGastoDepreciacionCentroCosto(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesGastoDepreciacionCentroCosto(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualGastoDepreciacionCentroCosto(false) ;
			
			this.isEsNuevoGastoDepreciacionCentroCosto=false;
			
			if(GastoDepreciacionCentroCostoJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleGastoDepreciacionCentroCosto();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GastoDepreciacionCentroCostoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosGastoDepreciacionCentroCostoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.gastodepreciacioncentrocostoLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingGastoDepreciacionCentroCosto(false);
				
				//SI ES MANUAL
				if(GastoDepreciacionCentroCostoJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualGastoDepreciacionCentroCosto();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.gastodepreciacioncentrocostoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.gastodepreciacioncentrocostoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,GastoDepreciacionCentroCostoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.gastodepreciacioncentrocostoLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosGastoDepreciacionCentroCostoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoGastoDepreciacionCentroCosto--;			
			//GastoDepreciacionCentroCosto gastodepreciacioncentrocostoAux= new GastoDepreciacionCentroCosto();			
			//gastodepreciacioncentrocostoAux.setId(this.iIdNuevoGastoDepreciacionCentroCosto);
			
			if(this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaGastoDepreciacionCentroCosto();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysGastoDepreciacionCentroCosto(this.gastodepreciacioncentrocosto);
			
			this.gastodepreciacioncentrocosto.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.gastodepreciacioncentrocostoLogic.getGastoDepreciacionCentroCostos().add(this.gastodepreciacioncentrocostoAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.gastodepreciacioncentrocostos.add(this.gastodepreciacioncentrocostoAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaGastoDepreciacionCentroCosto(false);
			
			this.jTableDatosGastoDepreciacionCentroCosto.setRowSelectionInterval(this.getIndiceNuevoGastoDepreciacionCentroCosto(), this.getIndiceNuevoGastoDepreciacionCentroCosto());
			
			int iLastRow =  this.jTableDatosGastoDepreciacionCentroCosto.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosGastoDepreciacionCentroCosto.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosGastoDepreciacionCentroCosto.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaGastoDepreciacionCentroCosto(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,GastoDepreciacionCentroCostoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionGastoDepreciacionCentroCostoActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.gastodepreciacioncentrocostoLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingGastoDepreciacionCentroCosto(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingGastoDepreciacionCentroCosto(false);
			
			//SI ES MANUAL
			if(GastoDepreciacionCentroCostoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualGastoDepreciacionCentroCosto();
			}
			
			//this.abrirFrameTreeGastoDepreciacionCentroCosto();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.gastodepreciacioncentrocostoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.gastodepreciacioncentrocostoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,GastoDepreciacionCentroCostoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.gastodepreciacioncentrocostoLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionGastoDepreciacionCentroCostoActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Gasto Depreciacion Centro CostoS ?", "MANTENIMIENTO DE Gasto Depreciacion Centro Costo", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionGastoDepreciacionCentroCosto.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralGastoDepreciacionCentroCosto();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.gastodepreciacioncentrocostoReturnGeneral=gastodepreciacioncentrocostoLogic.procesarImportacionGastoDepreciacionCentroCostosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.gastodepreciacioncentrocostoParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarGastoDepreciacionCentroCostoReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GastoDepreciacionCentroCostoConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionGastoDepreciacionCentroCostoActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionGastoDepreciacionCentroCosto.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionGastoDepreciacionCentroCosto.setFileImportacion(this.jInternalFrameImportacionGastoDepreciacionCentroCosto.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionGastoDepreciacionCentroCosto.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionGastoDepreciacionCentroCosto.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionGastoDepreciacionCentroCosto.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionGastoDepreciacionCentroCosto.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GastoDepreciacionCentroCostoConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoGastoDepreciacionCentroCostoActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<GastoDepreciacionCentroCosto> gastodepreciacioncentrocostosSeleccionados=new ArrayList<GastoDepreciacionCentroCosto>();		

		gastodepreciacioncentrocostosSeleccionados=this.getGastoDepreciacionCentroCostosSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoGastoDepreciacionCentroCosto.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoGastoDepreciacionCentroCosto.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("GastoDepreciacionCentroCostoBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"GastoDepreciacionCentroCostoBaseDesign.jrxml";
			
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
			
			this.generarReporteGastoDepreciacionCentroCostos("Todos",gastodepreciacioncentrocostosSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.gastodepreciacioncentrocostoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Gasto Depreciacion Centro Costo",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GastoDepreciacionCentroCostoConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoGastoDepreciacionCentroCosto.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoGastoDepreciacionCentroCosto.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case GastoDepreciacionCentroCostoConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case GastoDepreciacionCentroCostoConstantesFunciones.LABEL_IDSUCURSAL:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Sucursal_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Sucursal_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Sucursal_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Sucursal_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case GastoDepreciacionCentroCostoConstantesFunciones.LABEL_IDCENTROCOSTO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_CentroCosto_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_CentroCosto_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_CentroCosto_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_CentroCosto_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case GastoDepreciacionCentroCostoConstantesFunciones.LABEL_IDDETALLEACTIVOFIJO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_DetalleActivoFijo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_DetalleActivoFijo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_DetalleActivoFijo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_DetalleActivoFijo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case GastoDepreciacionCentroCostoConstantesFunciones.LABEL_IDCUENTACONTABLE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_CuentaContable_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_CuentaContable_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_CuentaContable_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_CuentaContable_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case GastoDepreciacionCentroCostoConstantesFunciones.LABEL_PORCENTAJE:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_rcentaje_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_rcentaje_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_rcentaje_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_rcentaje_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoGastoDepreciacionCentroCosto.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoGastoDepreciacionCentroCosto.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoGastoDepreciacionCentroCosto.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case GastoDepreciacionCentroCostoConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case GastoDepreciacionCentroCostoConstantesFunciones.LABEL_IDSUCURSAL:
					sNombreCampoCategoria="id_sucursal";
					break;

				case GastoDepreciacionCentroCostoConstantesFunciones.LABEL_IDCENTROCOSTO:
					sNombreCampoCategoria="id_centro_costo";
					break;

				case GastoDepreciacionCentroCostoConstantesFunciones.LABEL_IDDETALLEACTIVOFIJO:
					sNombreCampoCategoria="id_detalle_activo_fijo";
					break;

				case GastoDepreciacionCentroCostoConstantesFunciones.LABEL_IDCUENTACONTABLE:
					sNombreCampoCategoria="id_cuenta_contable";
					break;

				case GastoDepreciacionCentroCostoConstantesFunciones.LABEL_PORCENTAJE:
					sNombreCampoCategoria="porcentaje";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoGastoDepreciacionCentroCosto.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case GastoDepreciacionCentroCostoConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case GastoDepreciacionCentroCostoConstantesFunciones.LABEL_IDSUCURSAL:
					sNombreCampoCategoriaValor="id_sucursal";
					break;

				case GastoDepreciacionCentroCostoConstantesFunciones.LABEL_IDCENTROCOSTO:
					sNombreCampoCategoriaValor="id_centro_costo";
					break;

				case GastoDepreciacionCentroCostoConstantesFunciones.LABEL_IDDETALLEACTIVOFIJO:
					sNombreCampoCategoriaValor="id_detalle_activo_fijo";
					break;

				case GastoDepreciacionCentroCostoConstantesFunciones.LABEL_IDCUENTACONTABLE:
					sNombreCampoCategoriaValor="id_cuenta_contable";
					break;

				case GastoDepreciacionCentroCostoConstantesFunciones.LABEL_PORCENTAJE:
					sNombreCampoCategoriaValor="porcentaje";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoGastoDepreciacionCentroCosto.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoGastoDepreciacionCentroCosto.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case GastoDepreciacionCentroCostoConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case GastoDepreciacionCentroCostoConstantesFunciones.LABEL_IDSUCURSAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Sucursal",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_sucursal");
					break;

				case GastoDepreciacionCentroCostoConstantesFunciones.LABEL_IDCENTROCOSTO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Centro Costo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_centro_costo");
					break;

				case GastoDepreciacionCentroCostoConstantesFunciones.LABEL_IDDETALLEACTIVOFIJO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Detalle Activo Fijo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_detalle_activo_fijo");
					break;

				case GastoDepreciacionCentroCostoConstantesFunciones.LABEL_IDCUENTACONTABLE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Cuenta Contable",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_cuenta_contable");
					break;

				case GastoDepreciacionCentroCostoConstantesFunciones.LABEL_PORCENTAJE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Porcentaje",sNombreCampoCategoria,sNombreCampoCategoriaValor,"porcentaje");
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
	
	public void jButtonGenerarExcelReporteDinamicoGastoDepreciacionCentroCostoActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<GastoDepreciacionCentroCosto> gastodepreciacioncentrocostosSeleccionados=new ArrayList<GastoDepreciacionCentroCosto>();		
		
		gastodepreciacioncentrocostosSeleccionados=this.getGastoDepreciacionCentroCostosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"gastodepreciacioncentrocosto";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("GastoDepreciacionCentroCostos");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoGastoDepreciacionCentroCosto.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoGastoDepreciacionCentroCosto.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case GastoDepreciacionCentroCostoConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(GastoDepreciacionCentroCostoConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(GastoDepreciacionCentroCosto gastodepreciacioncentrocosto:gastodepreciacioncentrocostosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(gastodepreciacioncentrocosto.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case GastoDepreciacionCentroCostoConstantesFunciones.LABEL_IDSUCURSAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(GastoDepreciacionCentroCostoConstantesFunciones.LABEL_IDSUCURSAL);
					iRow++;

					for(GastoDepreciacionCentroCosto gastodepreciacioncentrocosto:gastodepreciacioncentrocostosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(gastodepreciacioncentrocosto.getsucursal_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case GastoDepreciacionCentroCostoConstantesFunciones.LABEL_IDCENTROCOSTO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(GastoDepreciacionCentroCostoConstantesFunciones.LABEL_IDCENTROCOSTO);
					iRow++;

					for(GastoDepreciacionCentroCosto gastodepreciacioncentrocosto:gastodepreciacioncentrocostosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(gastodepreciacioncentrocosto.getcentrocosto_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case GastoDepreciacionCentroCostoConstantesFunciones.LABEL_IDDETALLEACTIVOFIJO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(GastoDepreciacionCentroCostoConstantesFunciones.LABEL_IDDETALLEACTIVOFIJO);
					iRow++;

					for(GastoDepreciacionCentroCosto gastodepreciacioncentrocosto:gastodepreciacioncentrocostosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(gastodepreciacioncentrocosto.getdetalleactivofijo_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case GastoDepreciacionCentroCostoConstantesFunciones.LABEL_IDCUENTACONTABLE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(GastoDepreciacionCentroCostoConstantesFunciones.LABEL_IDCUENTACONTABLE);
					iRow++;

					for(GastoDepreciacionCentroCosto gastodepreciacioncentrocosto:gastodepreciacioncentrocostosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(gastodepreciacioncentrocosto.getcuentacontable_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case GastoDepreciacionCentroCostoConstantesFunciones.LABEL_PORCENTAJE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(GastoDepreciacionCentroCostoConstantesFunciones.LABEL_PORCENTAJE);
					iRow++;

					for(GastoDepreciacionCentroCosto gastodepreciacioncentrocosto:gastodepreciacioncentrocostosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(gastodepreciacioncentrocosto.getporcentaje());
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
			//	this.getFilaCabeceraExportarExcelGastoDepreciacionCentroCosto(row);				
			//	iRow++;
			//}				
			
			//for(GastoDepreciacionCentroCosto gastodepreciacioncentrocostoAux:gastodepreciacioncentrocostosSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelGastoDepreciacionCentroCosto(gastodepreciacioncentrocostoAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.gastodepreciacioncentrocostoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Gasto Depreciacion Centro Costo",JOptionPane.INFORMATION_MESSAGE);
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
				this.gastodepreciacioncentrocostoLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingGastoDepreciacionCentroCosto(false);
			
			//SI ES MANUAL
			if(GastoDepreciacionCentroCostoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualGastoDepreciacionCentroCosto();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.gastodepreciacioncentrocostoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.gastodepreciacioncentrocostoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.gastodepreciacioncentrocostoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresGastoDepreciacionCentroCostoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.gastodepreciacioncentrocostoLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingGastoDepreciacionCentroCosto(false);
			
			//SI ES MANUAL
			if(GastoDepreciacionCentroCostoJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualGastoDepreciacionCentroCosto();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.gastodepreciacioncentrocostoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.gastodepreciacioncentrocostoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,GastoDepreciacionCentroCostoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.gastodepreciacioncentrocostoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesGastoDepreciacionCentroCostoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.gastodepreciacioncentrocostoLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingGastoDepreciacionCentroCosto(false);
			
			//SI ES MANUAL
			if(GastoDepreciacionCentroCostoJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualGastoDepreciacionCentroCosto();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.gastodepreciacioncentrocostoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.gastodepreciacioncentrocostoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,GastoDepreciacionCentroCostoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.gastodepreciacioncentrocostoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaGastoDepreciacionCentroCosto() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosGastoDepreciacionCentroCosto.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosGastoDepreciacionCentroCosto.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosGastoDepreciacionCentroCosto.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosGastoDepreciacionCentroCosto.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosGastoDepreciacionCentroCosto.setMinimumSize(dimensionMinimum);
		this.jTableDatosGastoDepreciacionCentroCosto.setMaximumSize(dimensionMaximum);
		this.jTableDatosGastoDepreciacionCentroCosto.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingGastoDepreciacionCentroCosto(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingGastoDepreciacionCentroCosto(esInicializar,true);
	}
	
	public void inicializarActualizarBindingGastoDepreciacionCentroCosto(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaGastoDepreciacionCentroCosto(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesGastoDepreciacionCentroCosto(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.gastodepreciacioncentrocostoSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasGastoDepreciacionCentroCosto(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesGastoDepreciacionCentroCosto(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesGastoDepreciacionCentroCosto(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !GastoDepreciacionCentroCostoJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!GastoDepreciacionCentroCostoJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualGastoDepreciacionCentroCosto() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaGastoDepreciacionCentroCosto();
		
		this.inicializarActualizarBindingBotonesManualGastoDepreciacionCentroCosto(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.gastodepreciacioncentrocostoSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualGastoDepreciacionCentroCosto();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesGastoDepreciacionCentroCosto() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualGastoDepreciacionCentroCosto(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualGastoDepreciacionCentroCosto(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosGastoDepreciacionCentroCosto.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosGastoDepreciacionCentroCosto.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteGastoDepreciacionCentroCosto.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto.jCheckBoxPostAccionNuevoGastoDepreciacionCentroCosto.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto.jCheckBoxPostAccionSinCerrarGastoDepreciacionCentroCosto.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto.jCheckBoxPostAccionSinMensajeGastoDepreciacionCentroCosto.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosGastoDepreciacionCentroCosto.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosGastoDepreciacionCentroCosto.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteGastoDepreciacionCentroCosto.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto!=null) {
				this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto.jCheckBoxPostAccionNuevoGastoDepreciacionCentroCosto.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto.jCheckBoxPostAccionSinCerrarGastoDepreciacionCentroCosto.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto.jCheckBoxPostAccionSinMensajeGastoDepreciacionCentroCosto.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionGastoDepreciacionCentroCosto.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionGastoDepreciacionCentroCosto.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto.jComboBoxTiposAccionesFormularioGastoDepreciacionCentroCosto.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesGastoDepreciacionCentroCosto.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoGastoDepreciacionCentroCosto!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoGastoDepreciacionCentroCosto.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesGastoDepreciacionCentroCosto.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesGastoDepreciacionCentroCosto.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarGastoDepreciacionCentroCosto.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesGastoDepreciacionCentroCosto.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoGastoDepreciacionCentroCosto!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoGastoDepreciacionCentroCosto.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesGastoDepreciacionCentroCosto.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralGastoDepreciacionCentroCosto.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesGastoDepreciacionCentroCosto(Boolean esInicializar) throws Exception {
		try	{	
			if(GastoDepreciacionCentroCostoJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualGastoDepreciacionCentroCosto(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesGastoDepreciacionCentroCosto() throws Exception {
		try	{
			if(GastoDepreciacionCentroCostoJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualGastoDepreciacionCentroCosto();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleGastoDepreciacionCentroCosto() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto.jComboBoxTiposAccionesFormularioGastoDepreciacionCentroCosto.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto.jComboBoxTiposAccionesFormularioGastoDepreciacionCentroCosto.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualGastoDepreciacionCentroCosto() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesGastoDepreciacionCentroCosto.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesGastoDepreciacionCentroCosto.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesGastoDepreciacionCentroCosto.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesGastoDepreciacionCentroCosto.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesGastoDepreciacionCentroCosto.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesGastoDepreciacionCentroCosto.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionGastoDepreciacionCentroCosto.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionGastoDepreciacionCentroCosto.addItem(reporte);
			}
			
			
			if(!this.gastodepreciacioncentrocostoSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionGastoDepreciacionCentroCosto.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionGastoDepreciacionCentroCosto.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesGastoDepreciacionCentroCosto.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesGastoDepreciacionCentroCosto.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesGastoDepreciacionCentroCosto.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesGastoDepreciacionCentroCosto.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto.jComboBoxTiposAccionesFormularioGastoDepreciacionCentroCosto.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto.jComboBoxTiposAccionesFormularioGastoDepreciacionCentroCosto.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarGastoDepreciacionCentroCosto.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarGastoDepreciacionCentroCosto.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarGastoDepreciacionCentroCosto.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualGastoDepreciacionCentroCosto();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualGastoDepreciacionCentroCosto() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoGastoDepreciacionCentroCosto!=null) {
				this.jInternalFrameReporteDinamicoGastoDepreciacionCentroCosto.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoGastoDepreciacionCentroCosto.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoGastoDepreciacionCentroCosto!=null) {
				this.jInternalFrameReporteDinamicoGastoDepreciacionCentroCosto.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoGastoDepreciacionCentroCosto.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoGastoDepreciacionCentroCosto!=null) {
				
				if(this.jInternalFrameReporteDinamicoGastoDepreciacionCentroCosto.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoGastoDepreciacionCentroCosto.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoGastoDepreciacionCentroCosto.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoGastoDepreciacionCentroCosto.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoGastoDepreciacionCentroCosto.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoGastoDepreciacionCentroCosto.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
				
				//TIPOS COLUMNAS CATEGORIA DINAMICO
				if(this.jInternalFrameReporteDinamicoGastoDepreciacionCentroCosto.getjComboBoxColumnaCategoriaGrafico()!=null) {
					this.jInternalFrameReporteDinamicoGastoDepreciacionCentroCosto.getjComboBoxColumnaCategoriaGrafico().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoria=GastoDepreciacionCentroCostoConstantesFunciones.getTiposSeleccionarGastoDepreciacionCentroCosto(true,true,false,true,true);
						
					for(Reporte reporte:tiposColumnasCategoria) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoGastoDepreciacionCentroCosto.getjComboBoxColumnaCategoriaGrafico().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS CATEGORIA VALOR DINAMICO
				if(this.jInternalFrameReporteDinamicoGastoDepreciacionCentroCosto.getjComboBoxColumnaCategoriaValor()!=null) {
					this.jInternalFrameReporteDinamicoGastoDepreciacionCentroCosto.getjComboBoxColumnaCategoriaValor().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoriaValor=GastoDepreciacionCentroCostoConstantesFunciones.getTiposSeleccionarGastoDepreciacionCentroCosto(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasCategoriaValor) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoGastoDepreciacionCentroCosto.getjComboBoxColumnaCategoriaValor().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS VALOR
				defaultListModel=new DefaultListModel<Reporte>();
					
				if(this.jInternalFrameReporteDinamicoGastoDepreciacionCentroCosto.getjListColumnasValoresGrafico()!=null) {
					this.jInternalFrameReporteDinamicoGastoDepreciacionCentroCosto.getjListColumnasValoresGrafico().removeAll();
						
					ArrayList<Reporte> tiposColumnasValor=GastoDepreciacionCentroCostoConstantesFunciones.getTiposSeleccionarGastoDepreciacionCentroCosto(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasValor) {//this.tiposSeleccionar
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoGastoDepreciacionCentroCosto.getjListColumnasValoresGrafico().setModel(defaultListModel);									
						
				}
					
				//TIPOS GRAFICOS REPORTES DINAMICOS
				if(this.jInternalFrameReporteDinamicoGastoDepreciacionCentroCosto.getjComboBoxTiposGraficosReportesDinamico()!=null) {
					this.jInternalFrameReporteDinamicoGastoDepreciacionCentroCosto.getjComboBoxTiposGraficosReportesDinamico().removeAllItems();
						
					for(Reporte reporte:this.tiposGraficosReportes) {
						this.jInternalFrameReporteDinamicoGastoDepreciacionCentroCosto.getjComboBoxTiposGraficosReportesDinamico().addItem(reporte);
					}
					
				}
			
			
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualGastoDepreciacionCentroCosto()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_centro_costoFK_IdCentroCostoGastoDepreciacionCentroCosto.getSelectedItem()!=null){this.id_centro_costoFK_IdCentroCosto=((CentroCosto)this.jComboBoxid_centro_costoFK_IdCentroCostoGastoDepreciacionCentroCosto.getSelectedItem()).getId();}
		if(this.jComboBoxid_cuenta_contableFK_IdCuentaContableGastoDepreciacionCentroCosto.getSelectedItem()!=null){this.id_cuenta_contableFK_IdCuentaContable=((CuentaContable)this.jComboBoxid_cuenta_contableFK_IdCuentaContableGastoDepreciacionCentroCosto.getSelectedItem()).getId();}
		if(this.jComboBoxid_detalle_activo_fijoFK_IdDetalleActivoFijoGastoDepreciacionCentroCosto.getSelectedItem()!=null){this.id_detalle_activo_fijoFK_IdDetalleActivoFijo=((DetalleActivoFijo)this.jComboBoxid_detalle_activo_fijoFK_IdDetalleActivoFijoGastoDepreciacionCentroCosto.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasGastoDepreciacionCentroCosto(Boolean esInicializar) throws Exception {				
		if(GastoDepreciacionCentroCostoJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualGastoDepreciacionCentroCosto();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaGastoDepreciacionCentroCosto() throws Exception {
		this.inicializarActualizarBindingTablaGastoDepreciacionCentroCosto(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByGastoDepreciacionCentroCosto() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByGastoDepreciacionCentroCosto.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByGastoDepreciacionCentroCosto.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByGastoDepreciacionCentroCosto.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new GastoDepreciacionCentroCostoPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByGastoDepreciacionCentroCosto.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByGastoDepreciacionCentroCosto.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new GastoDepreciacionCentroCostoPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosGastoDepreciacionCentroCostoOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosGastoDepreciacionCentroCostoOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new GastoDepreciacionCentroCostoPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByGastoDepreciacionCentroCosto.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByGastoDepreciacionCentroCosto.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new GastoDepreciacionCentroCostoPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByGastoDepreciacionCentroCosto.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaGastoDepreciacionCentroCosto(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=gastodepreciacioncentrocostoLogic.getGastoDepreciacionCentroCostos().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=gastodepreciacioncentrocostos.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(GastoDepreciacionCentroCostoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosGastoDepreciacionCentroCosto.setModel(new GastoDepreciacionCentroCostoModel(this.gastodepreciacioncentrocostoLogic.getGastoDepreciacionCentroCostos(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosGastoDepreciacionCentroCosto.setModel(new GastoDepreciacionCentroCostoModel(this.gastodepreciacioncentrocostos,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByGastoDepreciacionCentroCosto!=null && this.jInternalFrameOrderByGastoDepreciacionCentroCosto.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByGastoDepreciacionCentroCosto();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosGastoDepreciacionCentroCosto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosGastoDepreciacionCentroCosto,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new GastoDepreciacionCentroCostoPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+GastoDepreciacionCentroCostoConstantesFunciones.SCLASSWEBTITULO,gastodepreciacioncentrocostoConstantesFunciones.resaltarSeleccionarGastoDepreciacionCentroCosto,iSizeTabla,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+GastoDepreciacionCentroCostoConstantesFunciones.SCLASSWEBTITULO,gastodepreciacioncentrocostoConstantesFunciones.resaltarSeleccionarGastoDepreciacionCentroCosto,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosGastoDepreciacionCentroCosto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosGastoDepreciacionCentroCosto,GastoDepreciacionCentroCostoConstantesFunciones.LABEL_ID));

		if(this.gastodepreciacioncentrocostoConstantesFunciones.mostraridGastoDepreciacionCentroCosto && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,GastoDepreciacionCentroCostoConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.gastodepreciacioncentrocostoConstantesFunciones.resaltaridGastoDepreciacionCentroCosto,this.gastodepreciacioncentrocostoConstantesFunciones.activaridGastoDepreciacionCentroCosto,iSizeTabla,this,true,"idGastoDepreciacionCentroCosto","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.gastodepreciacioncentrocostoConstantesFunciones.resaltaridGastoDepreciacionCentroCosto,this.gastodepreciacioncentrocostoConstantesFunciones.activaridGastoDepreciacionCentroCosto,this,true,"idGastoDepreciacionCentroCosto","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosGastoDepreciacionCentroCosto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosGastoDepreciacionCentroCosto,GastoDepreciacionCentroCostoConstantesFunciones.LABEL_IDEMPRESA));

		if(this.gastodepreciacioncentrocostoConstantesFunciones.mostrarid_empresaGastoDepreciacionCentroCosto && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,GastoDepreciacionCentroCostoConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.gastodepreciacioncentrocostoConstantesFunciones.resaltarid_empresaGastoDepreciacionCentroCosto,this,this.gastodepreciacioncentrocostoConstantesFunciones.activarid_empresaGastoDepreciacionCentroCosto,iSizeTabla));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.gastodepreciacioncentrocostoConstantesFunciones.resaltarid_empresaGastoDepreciacionCentroCosto,this,this.gastodepreciacioncentrocostoConstantesFunciones.activarid_empresaGastoDepreciacionCentroCosto,false,"id_empresaGastoDepreciacionCentroCosto","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new GastoDepreciacionCentroCostoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosGastoDepreciacionCentroCosto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosGastoDepreciacionCentroCosto,GastoDepreciacionCentroCostoConstantesFunciones.LABEL_IDSUCURSAL));

		if(this.gastodepreciacioncentrocostoConstantesFunciones.mostrarid_sucursalGastoDepreciacionCentroCosto && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,GastoDepreciacionCentroCostoConstantesFunciones.LABEL_IDSUCURSAL,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new SucursalTableCell(this.sucursalsForeignKey,this.gastodepreciacioncentrocostoConstantesFunciones.resaltarid_sucursalGastoDepreciacionCentroCosto,this,this.gastodepreciacioncentrocostoConstantesFunciones.activarid_sucursalGastoDepreciacionCentroCosto,iSizeTabla));
			tableColumn.setCellEditor(new SucursalTableCell(this.sucursalsForeignKey,this.gastodepreciacioncentrocostoConstantesFunciones.resaltarid_sucursalGastoDepreciacionCentroCosto,this,this.gastodepreciacioncentrocostoConstantesFunciones.activarid_sucursalGastoDepreciacionCentroCosto,false,"id_sucursalGastoDepreciacionCentroCosto","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new GastoDepreciacionCentroCostoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosGastoDepreciacionCentroCosto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosGastoDepreciacionCentroCosto,GastoDepreciacionCentroCostoConstantesFunciones.LABEL_IDCENTROCOSTO));

		if(this.gastodepreciacioncentrocostoConstantesFunciones.mostrarid_centro_costoGastoDepreciacionCentroCosto && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,GastoDepreciacionCentroCostoConstantesFunciones.LABEL_IDCENTROCOSTO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new CentroCostoTableCell(this.centrocostosForeignKey,this.gastodepreciacioncentrocostoConstantesFunciones.resaltarid_centro_costoGastoDepreciacionCentroCosto,this,this.gastodepreciacioncentrocostoConstantesFunciones.activarid_centro_costoGastoDepreciacionCentroCosto,iSizeTabla));
			tableColumn.setCellEditor(new CentroCostoTableCell(this.centrocostosForeignKey,this.gastodepreciacioncentrocostoConstantesFunciones.resaltarid_centro_costoGastoDepreciacionCentroCosto,this,this.gastodepreciacioncentrocostoConstantesFunciones.activarid_centro_costoGastoDepreciacionCentroCosto,true,"id_centro_costoGastoDepreciacionCentroCosto","CON_BUSQUEDA"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new GastoDepreciacionCentroCostoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosGastoDepreciacionCentroCosto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosGastoDepreciacionCentroCosto,GastoDepreciacionCentroCostoConstantesFunciones.LABEL_IDDETALLEACTIVOFIJO));

		if(this.gastodepreciacioncentrocostoConstantesFunciones.mostrarid_detalle_activo_fijoGastoDepreciacionCentroCosto && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,GastoDepreciacionCentroCostoConstantesFunciones.LABEL_IDDETALLEACTIVOFIJO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new DetalleActivoFijoTableCell(this.detalleactivofijosForeignKey,this.gastodepreciacioncentrocostoConstantesFunciones.resaltarid_detalle_activo_fijoGastoDepreciacionCentroCosto,this,this.gastodepreciacioncentrocostoConstantesFunciones.activarid_detalle_activo_fijoGastoDepreciacionCentroCosto,iSizeTabla));
			tableColumn.setCellEditor(new DetalleActivoFijoTableCell(this.detalleactivofijosForeignKey,this.gastodepreciacioncentrocostoConstantesFunciones.resaltarid_detalle_activo_fijoGastoDepreciacionCentroCosto,this,this.gastodepreciacioncentrocostoConstantesFunciones.activarid_detalle_activo_fijoGastoDepreciacionCentroCosto,true,"id_detalle_activo_fijoGastoDepreciacionCentroCosto","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new GastoDepreciacionCentroCostoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosGastoDepreciacionCentroCosto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosGastoDepreciacionCentroCosto,GastoDepreciacionCentroCostoConstantesFunciones.LABEL_IDCUENTACONTABLE));

		if(this.gastodepreciacioncentrocostoConstantesFunciones.mostrarid_cuenta_contableGastoDepreciacionCentroCosto && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,GastoDepreciacionCentroCostoConstantesFunciones.LABEL_IDCUENTACONTABLE,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new CuentaContableTableCell(this.cuentacontablesForeignKey,this.gastodepreciacioncentrocostoConstantesFunciones.resaltarid_cuenta_contableGastoDepreciacionCentroCosto,this,this.gastodepreciacioncentrocostoConstantesFunciones.activarid_cuenta_contableGastoDepreciacionCentroCosto,iSizeTabla));
			tableColumn.setCellEditor(new CuentaContableTableCell(this.cuentacontablesForeignKey,this.gastodepreciacioncentrocostoConstantesFunciones.resaltarid_cuenta_contableGastoDepreciacionCentroCosto,this,this.gastodepreciacioncentrocostoConstantesFunciones.activarid_cuenta_contableGastoDepreciacionCentroCosto,true,"id_cuenta_contableGastoDepreciacionCentroCosto","CON_BUSQUEDA"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70);
			//tableColumn.addPropertyChangeListener(new GastoDepreciacionCentroCostoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosGastoDepreciacionCentroCosto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosGastoDepreciacionCentroCosto,GastoDepreciacionCentroCostoConstantesFunciones.LABEL_PORCENTAJE));

		if(this.gastodepreciacioncentrocostoConstantesFunciones.mostrarporcentajeGastoDepreciacionCentroCosto && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,GastoDepreciacionCentroCostoConstantesFunciones.LABEL_PORCENTAJE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.gastodepreciacioncentrocostoConstantesFunciones.resaltarporcentajeGastoDepreciacionCentroCosto,this.gastodepreciacioncentrocostoConstantesFunciones.activarporcentajeGastoDepreciacionCentroCosto,iSizeTabla,this,true,"porcentajeGastoDepreciacionCentroCosto","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.gastodepreciacioncentrocostoConstantesFunciones.resaltarporcentajeGastoDepreciacionCentroCosto,this.gastodepreciacioncentrocostoConstantesFunciones.activarporcentajeGastoDepreciacionCentroCosto,this,true,"porcentajeGastoDepreciacionCentroCosto","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new GastoDepreciacionCentroCostoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.gastodepreciacioncentrocostoSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.gastodepreciacioncentrocostoSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.gastodepreciacioncentrocostoSessionBean.getEsGuardarRelacionado(),iSizeTabla));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosGastoDepreciacionCentroCosto.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.gastodepreciacioncentrocostoSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.gastodepreciacioncentrocostoSessionBean.getEsGuardarRelacionado(),iSizeTabla));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosGastoDepreciacionCentroCosto.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarGastoDepreciacionCentroCosto && this.isPermisoGuardarCambiosGastoDepreciacionCentroCosto) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.gastodepreciacioncentrocostoSessionBean.getEsGuardarRelacionado(),iSizeTabla));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.gastodepreciacioncentrocostoSessionBean.getEsGuardarRelacionado(),iSizeTabla));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosGastoDepreciacionCentroCosto.addColumn(tableColumn);
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
			
			this.jTableDatosGastoDepreciacionCentroCosto.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarGastoDepreciacionCentroCosto && this.isPermisoGuardarCambiosGastoDepreciacionCentroCosto) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarGastoDepreciacionCentroCosto && this.isPermisoGuardarCambiosGastoDepreciacionCentroCosto) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosGastoDepreciacionCentroCosto.moveColumn(this.jTableDatosGastoDepreciacionCentroCosto.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosGastoDepreciacionCentroCosto.moveColumn(this.jTableDatosGastoDepreciacionCentroCosto.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosGastoDepreciacionCentroCosto.moveColumn(this.jTableDatosGastoDepreciacionCentroCosto.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosGastoDepreciacionCentroCosto.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosGastoDepreciacionCentroCosto.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosGastoDepreciacionCentroCosto,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!GastoDepreciacionCentroCostoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosGastoDepreciacionCentroCosto.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosGastoDepreciacionCentroCosto.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!GastoDepreciacionCentroCostoJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!GastoDepreciacionCentroCostoJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosGastoDepreciacionCentroCosto.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosGastoDepreciacionCentroCosto.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosGastoDepreciacionCentroCosto.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=gastodepreciacioncentrocostoLogic.getGastoDepreciacionCentroCostos().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=gastodepreciacioncentrocostos.size()-1;
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
		//this.jTableDatosGastoDepreciacionCentroCosto.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosGastoDepreciacionCentroCosto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosGastoDepreciacionCentroCosto();
			
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
				
				//this.isEsNuevoGastoDepreciacionCentroCosto=false;
					
				GastoDepreciacionCentroCostoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.gastodepreciacioncentrocosto,new Object(),this.gastodepreciacioncentrocostoParameterGeneral,this.gastodepreciacioncentrocostoReturnGeneral);
			
				if(this.gastodepreciacioncentrocostoSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosGastoDepreciacionCentroCosto.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosGastoDepreciacionCentroCosto.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.gastodepreciacioncentrocosto =(GastoDepreciacionCentroCosto) this.gastodepreciacioncentrocostoLogic.getGastoDepreciacionCentroCostos().toArray()[this.jTableDatosGastoDepreciacionCentroCosto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.gastodepreciacioncentrocosto =(GastoDepreciacionCentroCosto) this.gastodepreciacioncentrocostos.toArray()[this.jTableDatosGastoDepreciacionCentroCosto.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.gastodepreciacioncentrocosto.getsType().equals("DUPLICADO")
				   || this.gastodepreciacioncentrocosto.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoGastoDepreciacionCentroCosto=true;
				
				} else {
					this.isEsNuevoGastoDepreciacionCentroCosto=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.gastodepreciacioncentrocostoSessionBean.getEsGuardarRelacionado()) {
					if(this.gastodepreciacioncentrocosto.getId()>=0 && !this.gastodepreciacioncentrocosto.getIsNew()) {						
						this.isEsNuevoGastoDepreciacionCentroCosto=false;
						
					} else {
						this.isEsNuevoGastoDepreciacionCentroCosto=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoGastoDepreciacionCentroCosto(esRelaciones);						
				
				this.seleccionarGastoDepreciacionCentroCosto(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.gastodepreciacioncentrocosto.getId()<0) {
					this.isEsNuevoGastoDepreciacionCentroCosto=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarGastoDepreciacionCentroCosto(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarGastoDepreciacionCentroCosto(evt,rowIndex);
				}	
				
				if(this.gastodepreciacioncentrocostoSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion GastoDepreciacionCentroCosto: " + this.dDif); 
					}
				}								
				
				GastoDepreciacionCentroCostoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.gastodepreciacioncentrocosto,new Object(),this.gastodepreciacioncentrocostoParameterGeneral,this.gastodepreciacioncentrocostoReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarGastoDepreciacionCentroCosto(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.gastodepreciacioncentrocosto)) {
					if(this.gastodepreciacioncentrocosto.getId()>0) {
						this.gastodepreciacioncentrocosto.setIsDeleted(true);
						
						this.gastodepreciacioncentrocostosEliminados.add(this.gastodepreciacioncentrocosto);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.gastodepreciacioncentrocostoLogic.getGastoDepreciacionCentroCostos().remove(this.gastodepreciacioncentrocosto);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.gastodepreciacioncentrocostos.remove(this.gastodepreciacioncentrocosto);				
					}
					
					
					((GastoDepreciacionCentroCostoModel) this.jTableDatosGastoDepreciacionCentroCosto.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaGastoDepreciacionCentroCosto(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,GastoDepreciacionCentroCostoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarGastoDepreciacionCentroCosto(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoGastoDepreciacionCentroCosto) {
			
			if(this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosGastoDepreciacionCentroCosto.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosGastoDepreciacionCentroCosto.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.gastodepreciacioncentrocosto =(GastoDepreciacionCentroCosto) this.gastodepreciacioncentrocostoLogic.getGastoDepreciacionCentroCostos().toArray()[this.jTableDatosGastoDepreciacionCentroCosto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.gastodepreciacioncentrocosto =(GastoDepreciacionCentroCosto) this.gastodepreciacioncentrocostos.toArray()[this.jTableDatosGastoDepreciacionCentroCosto.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(GastoDepreciacionCentroCostoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioGastoDepreciacionCentroCosto(this.gastodepreciacioncentrocosto);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.gastodepreciacioncentrocostoConstantesFunciones.cargarid_empresaGastoDepreciacionCentroCosto || this.gastodepreciacioncentrocostoConstantesFunciones.event_dependid_empresaGastoDepreciacionCentroCosto) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.gastodepreciacioncentrocosto.getid_empresa());
									//this.inicializarActualizarBindingGastoDepreciacionCentroCosto(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(gastodepreciacioncentrocosto.getEmpresa()!=null) {
							this.empresasForeignKey.add(gastodepreciacioncentrocosto.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.gastodepreciacioncentrocosto.getid_empresa(),false,"Formulario");

					//Sucursal
					if(!this.gastodepreciacioncentrocostoConstantesFunciones.cargarid_sucursalGastoDepreciacionCentroCosto || this.gastodepreciacioncentrocostoConstantesFunciones.event_dependid_sucursalGastoDepreciacionCentroCosto) {
						//this.cargarCombosSucursalsForeignKeyLista(" where id="+this.gastodepreciacioncentrocosto.getid_sucursal());
									//this.inicializarActualizarBindingGastoDepreciacionCentroCosto(false,false);
						this.sucursalsForeignKey=new ArrayList<Sucursal>();

						if(gastodepreciacioncentrocosto.getSucursal()!=null) {
							this.sucursalsForeignKey.add(gastodepreciacioncentrocosto.getSucursal());
						}

						this.addItemDefectoCombosForeignKeySucursal();
						this.cargarCombosFrameSucursalsForeignKey("Todos");
					}
					this.setActualSucursalForeignKey(this.gastodepreciacioncentrocosto.getid_sucursal(),false,"Formulario");

					//CentroCosto
					if(!this.gastodepreciacioncentrocostoConstantesFunciones.cargarid_centro_costoGastoDepreciacionCentroCosto || this.gastodepreciacioncentrocostoConstantesFunciones.event_dependid_centro_costoGastoDepreciacionCentroCosto) {
						//this.cargarCombosCentroCostosForeignKeyLista(" where id="+this.gastodepreciacioncentrocosto.getid_centro_costo());
									//this.inicializarActualizarBindingGastoDepreciacionCentroCosto(false,false);
						this.centrocostosForeignKey=new ArrayList<CentroCosto>();

						if(gastodepreciacioncentrocosto.getCentroCosto()!=null) {
							this.centrocostosForeignKey.add(gastodepreciacioncentrocosto.getCentroCosto());
						}

						this.addItemDefectoCombosForeignKeyCentroCosto();
						this.cargarCombosFrameCentroCostosForeignKey("Todos");
					}
					this.setActualCentroCostoForeignKey(this.gastodepreciacioncentrocosto.getid_centro_costo(),false,"Formulario");

					//DetalleActivoFijo
					if(!this.gastodepreciacioncentrocostoConstantesFunciones.cargarid_detalle_activo_fijoGastoDepreciacionCentroCosto || this.gastodepreciacioncentrocostoConstantesFunciones.event_dependid_detalle_activo_fijoGastoDepreciacionCentroCosto) {
						//this.cargarCombosDetalleActivoFijosForeignKeyLista(" where id="+this.gastodepreciacioncentrocosto.getid_detalle_activo_fijo());
									//this.inicializarActualizarBindingGastoDepreciacionCentroCosto(false,false);
						this.detalleactivofijosForeignKey=new ArrayList<DetalleActivoFijo>();

						if(gastodepreciacioncentrocosto.getDetalleActivoFijo()!=null) {
							this.detalleactivofijosForeignKey.add(gastodepreciacioncentrocosto.getDetalleActivoFijo());
						}

						this.addItemDefectoCombosForeignKeyDetalleActivoFijo();
						this.cargarCombosFrameDetalleActivoFijosForeignKey("Todos");
					}
					this.setActualDetalleActivoFijoForeignKey(this.gastodepreciacioncentrocosto.getid_detalle_activo_fijo(),false,"Formulario");

					//CuentaContable
					if(!this.gastodepreciacioncentrocostoConstantesFunciones.cargarid_cuenta_contableGastoDepreciacionCentroCosto || this.gastodepreciacioncentrocostoConstantesFunciones.event_dependid_cuenta_contableGastoDepreciacionCentroCosto) {
						//this.cargarCombosCuentaContablesForeignKeyLista(" where id="+this.gastodepreciacioncentrocosto.getid_cuenta_contable());
									//this.inicializarActualizarBindingGastoDepreciacionCentroCosto(false,false);
						this.cuentacontablesForeignKey=new ArrayList<CuentaContable>();

						if(gastodepreciacioncentrocosto.getCuentaContable()!=null) {
							this.cuentacontablesForeignKey.add(gastodepreciacioncentrocosto.getCuentaContable());
						}

						this.addItemDefectoCombosForeignKeyCuentaContable();
						this.cargarCombosFrameCuentaContablesForeignKey("Todos");
					}
					this.setActualCuentaContableForeignKey(this.gastodepreciacioncentrocosto.getid_cuenta_contable(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesGastoDepreciacionCentroCosto("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesGastoDepreciacionCentroCosto(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualGastoDepreciacionCentroCosto() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GastoDepreciacionCentroCostoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoGastoDepreciacionCentroCosto(GastoDepreciacionCentroCosto gastodepreciacioncentrocosto) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoGastoDepreciacionCentroCosto(gastodepreciacioncentrocosto,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoGastoDepreciacionCentroCosto(GastoDepreciacionCentroCosto gastodepreciacioncentrocosto,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioGastoDepreciacionCentroCosto(gastodepreciacioncentrocosto);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyGastoDepreciacionCentroCosto(gastodepreciacioncentrocosto,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyGastoDepreciacionCentroCosto(gastodepreciacioncentrocosto);
	}
	
	public void setVariablesObjetoActualToFormularioGastoDepreciacionCentroCosto(GastoDepreciacionCentroCosto gastodepreciacioncentrocosto) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto.jLabelidGastoDepreciacionCentroCosto.setText(gastodepreciacioncentrocosto.getId().toString());
			this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto.jTextFieldporcentajeGastoDepreciacionCentroCosto.setText(gastodepreciacioncentrocosto.getporcentaje().toString());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,GastoDepreciacionCentroCostoConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,GastoDepreciacionCentroCosto gastodepreciacioncentrocostoLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,gastodepreciacioncentrocostoLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,GastoDepreciacionCentroCosto gastodepreciacioncentrocostoLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				gastodepreciacioncentrocostoLocal=this.gastodepreciacioncentrocosto;
			} else {
				gastodepreciacioncentrocostoLocal=this.gastodepreciacioncentrocostoAnterior;
			}
		}
		
		if(this.permiteMantenimiento(gastodepreciacioncentrocostoLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoGastoDepreciacionCentroCosto(gastodepreciacioncentrocostoLocal,true);
					
					if(gastodepreciacioncentrocostoSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(gastodepreciacioncentrocostoLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.gastodepreciacioncentrocostoSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(gastodepreciacioncentrocostoLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoGastoDepreciacionCentroCosto(GastoDepreciacionCentroCosto gastodepreciacioncentrocosto,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualGastoDepreciacionCentroCosto(gastodepreciacioncentrocosto,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysGastoDepreciacionCentroCosto(gastodepreciacioncentrocosto);
	}
	
	public void setVariablesFormularioToObjetoActualGastoDepreciacionCentroCosto(GastoDepreciacionCentroCosto gastodepreciacioncentrocosto,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualGastoDepreciacionCentroCosto(gastodepreciacioncentrocosto,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualGastoDepreciacionCentroCosto(GastoDepreciacionCentroCosto gastodepreciacioncentrocosto,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto.jLabelidGastoDepreciacionCentroCosto.getText()==null || this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto.jLabelidGastoDepreciacionCentroCosto.getText()=="" || this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto.jLabelidGastoDepreciacionCentroCosto.getText()=="Id") {
				this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto.jLabelidGastoDepreciacionCentroCosto.setText("0");
			}

			if(conColumnasBase) {gastodepreciacioncentrocosto.setId(Long.parseLong(this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto.jLabelidGastoDepreciacionCentroCosto.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+GastoDepreciacionCentroCostoConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto.jLabelIdGastoDepreciacionCentroCosto,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			gastodepreciacioncentrocosto.setporcentaje(Double.parseDouble(this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto.jTextFieldporcentajeGastoDepreciacionCentroCosto.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+GastoDepreciacionCentroCostoConstantesFunciones.LABEL_PORCENTAJE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto.jLabelporcentajeGastoDepreciacionCentroCosto,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,GastoDepreciacionCentroCostoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualGastoDepreciacionCentroCosto(GastoDepreciacionCentroCosto gastodepreciacioncentrocostoBean,GastoDepreciacionCentroCosto gastodepreciacioncentrocosto,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conDefault || (!conDefault && gastodepreciacioncentrocostoBean.getid_centro_costo()!=null && !gastodepreciacioncentrocostoBean.getid_centro_costo().equals(null))) {gastodepreciacioncentrocosto.setid_centro_costo(gastodepreciacioncentrocostoBean.getid_centro_costo());}
			if(conDefault || (!conDefault && gastodepreciacioncentrocostoBean.getid_detalle_activo_fijo()!=null && !gastodepreciacioncentrocostoBean.getid_detalle_activo_fijo().equals(-1L))) {gastodepreciacioncentrocosto.setid_detalle_activo_fijo(gastodepreciacioncentrocostoBean.getid_detalle_activo_fijo());}
			if(conDefault || (!conDefault && gastodepreciacioncentrocostoBean.getid_cuenta_contable()!=null && !gastodepreciacioncentrocostoBean.getid_cuenta_contable().equals(-1L))) {gastodepreciacioncentrocosto.setid_cuenta_contable(gastodepreciacioncentrocostoBean.getid_cuenta_contable());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,GastoDepreciacionCentroCostoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosGastoDepreciacionCentroCosto(GastoDepreciacionCentroCosto gastodepreciacioncentrocostoOrigen,GastoDepreciacionCentroCosto gastodepreciacioncentrocosto,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && gastodepreciacioncentrocostoOrigen.getId()!=null && !gastodepreciacioncentrocostoOrigen.getId().equals(0L))) {gastodepreciacioncentrocosto.setId(gastodepreciacioncentrocostoOrigen.getId());}}
			if(conDefault || (!conDefault && gastodepreciacioncentrocostoOrigen.getid_centro_costo()!=null && !gastodepreciacioncentrocostoOrigen.getid_centro_costo().equals(null))) {gastodepreciacioncentrocosto.setid_centro_costo(gastodepreciacioncentrocostoOrigen.getid_centro_costo());}
			if(conDefault || (!conDefault && gastodepreciacioncentrocostoOrigen.getid_detalle_activo_fijo()!=null && !gastodepreciacioncentrocostoOrigen.getid_detalle_activo_fijo().equals(-1L))) {gastodepreciacioncentrocosto.setid_detalle_activo_fijo(gastodepreciacioncentrocostoOrigen.getid_detalle_activo_fijo());}
			if(conDefault || (!conDefault && gastodepreciacioncentrocostoOrigen.getid_cuenta_contable()!=null && !gastodepreciacioncentrocostoOrigen.getid_cuenta_contable().equals(-1L))) {gastodepreciacioncentrocosto.setid_cuenta_contable(gastodepreciacioncentrocostoOrigen.getid_cuenta_contable());}
			if(conDefault || (!conDefault && gastodepreciacioncentrocostoOrigen.getporcentaje()!=null && !gastodepreciacioncentrocostoOrigen.getporcentaje().equals(0.0))) {gastodepreciacioncentrocosto.setporcentaje(gastodepreciacioncentrocostoOrigen.getporcentaje());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,GastoDepreciacionCentroCostoConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioGastoDepreciacionCentroCosto(GastoDepreciacionCentroCosto gastodepreciacioncentrocosto) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto.jLabelidGastoDepreciacionCentroCosto.setText(gastodepreciacioncentrocosto.getId().toString());
			this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto.jTextFieldporcentajeGastoDepreciacionCentroCosto.setText(gastodepreciacioncentrocosto.getporcentaje().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GastoDepreciacionCentroCostoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioGastoDepreciacionCentroCosto(GastoDepreciacionCentroCostoBean gastodepreciacioncentrocostoBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto.jLabelidGastoDepreciacionCentroCosto.setText(gastodepreciacioncentrocostoBean.getId().toString());
			this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto.jTextFieldporcentajeGastoDepreciacionCentroCosto.setText(gastodepreciacioncentrocostoBean.getporcentaje().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GastoDepreciacionCentroCostoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanGastoDepreciacionCentroCosto(GastoDepreciacionCentroCostoParameterReturnGeneral gastodepreciacioncentrocostoReturnGeneral,GastoDepreciacionCentroCostoBean gastodepreciacioncentrocostoBean,Boolean conDefault) throws Exception { 
		try {
			GastoDepreciacionCentroCosto gastodepreciacioncentrocostoLocal=new GastoDepreciacionCentroCosto();
			
			gastodepreciacioncentrocostoLocal=gastodepreciacioncentrocostoReturnGeneral.getGastoDepreciacionCentroCosto();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && gastodepreciacioncentrocostoLocal.getId()!=null && !gastodepreciacioncentrocostoLocal.getId().equals(0L))) {gastodepreciacioncentrocostoBean.setId(gastodepreciacioncentrocostoLocal.getId());}}
			if(conDefault || (!conDefault && gastodepreciacioncentrocostoLocal.getid_centro_costo()!=null && !gastodepreciacioncentrocostoLocal.getid_centro_costo().equals(null))) {gastodepreciacioncentrocostoBean.setid_centro_costo(gastodepreciacioncentrocostoLocal.getid_centro_costo());}
			if(conDefault || (!conDefault && gastodepreciacioncentrocostoLocal.getid_detalle_activo_fijo()!=null && !gastodepreciacioncentrocostoLocal.getid_detalle_activo_fijo().equals(-1L))) {gastodepreciacioncentrocostoBean.setid_detalle_activo_fijo(gastodepreciacioncentrocostoLocal.getid_detalle_activo_fijo());}
			if(conDefault || (!conDefault && gastodepreciacioncentrocostoLocal.getid_cuenta_contable()!=null && !gastodepreciacioncentrocostoLocal.getid_cuenta_contable().equals(-1L))) {gastodepreciacioncentrocostoBean.setid_cuenta_contable(gastodepreciacioncentrocostoLocal.getid_cuenta_contable());}
			if(conDefault || (!conDefault && gastodepreciacioncentrocostoLocal.getporcentaje()!=null && !gastodepreciacioncentrocostoLocal.getporcentaje().equals(0.0))) {gastodepreciacioncentrocostoBean.setporcentaje(gastodepreciacioncentrocostoLocal.getporcentaje());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GastoDepreciacionCentroCostoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxGastoDepreciacionCentroCostoGenerico(Long idGastoDepreciacionCentroCostoSeleccionado,JComboBox jComboBoxGastoDepreciacionCentroCosto,List<GastoDepreciacionCentroCosto> gastodepreciacioncentrocostosLocal)throws Exception {
		try {
			GastoDepreciacionCentroCosto  gastodepreciacioncentrocostoTemp=null;

			for(GastoDepreciacionCentroCosto gastodepreciacioncentrocostoAux:gastodepreciacioncentrocostosLocal) {
				if(gastodepreciacioncentrocostoAux.getId()!=null && gastodepreciacioncentrocostoAux.getId().equals(idGastoDepreciacionCentroCostoSeleccionado)) {
					gastodepreciacioncentrocostoTemp=gastodepreciacioncentrocostoAux;
					break;
				}
			}

			jComboBoxGastoDepreciacionCentroCosto.setSelectedItem(gastodepreciacioncentrocostoTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxGastoDepreciacionCentroCostoGenerico(JComboBox jComboBoxGastoDepreciacionCentroCosto,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxGastoDepreciacionCentroCosto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxGastoDepreciacionCentroCosto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxGastoDepreciacionCentroCosto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxGastoDepreciacionCentroCosto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxGastoDepreciacionCentroCosto.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxGastoDepreciacionCentroCosto.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxGastoDepreciacionCentroCosto.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxGastoDepreciacionCentroCosto.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxGastoDepreciacionCentroCosto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxGastoDepreciacionCentroCosto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,GastoDepreciacionCentroCostoConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			gastodepreciacioncentrocosto=(GastoDepreciacionCentroCosto) gastodepreciacioncentrocostoLogic.getGastoDepreciacionCentroCostos().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			gastodepreciacioncentrocosto =(GastoDepreciacionCentroCosto) gastodepreciacioncentrocostos.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!gastodepreciacioncentrocosto.getIsNew() && !gastodepreciacioncentrocosto.getIsChanged() && !gastodepreciacioncentrocosto.getIsDeleted()) {
				sDescripcion=gastodepreciacioncentrocosto.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=gastodepreciacioncentrocosto.getempresa_descripcion();
			}
		}

		if(sTipo.equals("Sucursal")) {
			//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
			if(!gastodepreciacioncentrocosto.getIsNew() && !gastodepreciacioncentrocosto.getIsChanged() && !gastodepreciacioncentrocosto.getIsDeleted()) {
				sDescripcion=gastodepreciacioncentrocosto.getsucursal_descripcion();
			} else {
				//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
				sDescripcion=gastodepreciacioncentrocosto.getsucursal_descripcion();
			}
		}

		if(sTipo.equals("CentroCosto")) {
			//sDescripcion=this.getActualCentroCostoForeignKeyDescripcion((Long)value);
			if(!gastodepreciacioncentrocosto.getIsNew() && !gastodepreciacioncentrocosto.getIsChanged() && !gastodepreciacioncentrocosto.getIsDeleted()) {
				sDescripcion=gastodepreciacioncentrocosto.getcentrocosto_descripcion();
			} else {
				//sDescripcion=this.getActualCentroCostoForeignKeyDescripcion((Long)value);
				sDescripcion=gastodepreciacioncentrocosto.getcentrocosto_descripcion();
			}
		}

		if(sTipo.equals("DetalleActivoFijo")) {
			//sDescripcion=this.getActualDetalleActivoFijoForeignKeyDescripcion((Long)value);
			if(!gastodepreciacioncentrocosto.getIsNew() && !gastodepreciacioncentrocosto.getIsChanged() && !gastodepreciacioncentrocosto.getIsDeleted()) {
				sDescripcion=gastodepreciacioncentrocosto.getdetalleactivofijo_descripcion();
			} else {
				//sDescripcion=this.getActualDetalleActivoFijoForeignKeyDescripcion((Long)value);
				sDescripcion=gastodepreciacioncentrocosto.getdetalleactivofijo_descripcion();
			}
		}

		if(sTipo.equals("CuentaContable")) {
			//sDescripcion=this.getActualCuentaContableForeignKeyDescripcion((Long)value);
			if(!gastodepreciacioncentrocosto.getIsNew() && !gastodepreciacioncentrocosto.getIsChanged() && !gastodepreciacioncentrocosto.getIsDeleted()) {
				sDescripcion=gastodepreciacioncentrocosto.getcuentacontable_descripcion();
			} else {
				//sDescripcion=this.getActualCuentaContableForeignKeyDescripcion((Long)value);
				sDescripcion=gastodepreciacioncentrocosto.getcuentacontable_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		GastoDepreciacionCentroCosto gastodepreciacioncentrocostoRow=new GastoDepreciacionCentroCosto();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			gastodepreciacioncentrocostoRow=(GastoDepreciacionCentroCosto) gastodepreciacioncentrocostoLogic.getGastoDepreciacionCentroCostos().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			gastodepreciacioncentrocostoRow=(GastoDepreciacionCentroCosto) gastodepreciacioncentrocostos.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualGastoDepreciacionCentroCosto(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoGastoDepreciacionCentroCosto.setVisible((this.isVisibilidadCeldaNuevoGastoDepreciacionCentroCosto && this.isPermisoNuevoGastoDepreciacionCentroCosto));			
			this.jButtonDuplicarGastoDepreciacionCentroCosto.setVisible((this.isVisibilidadCeldaDuplicarGastoDepreciacionCentroCosto && this.isPermisoDuplicarGastoDepreciacionCentroCosto));			
			this.jButtonCopiarGastoDepreciacionCentroCosto.setVisible((this.isVisibilidadCeldaCopiarGastoDepreciacionCentroCosto && this.isPermisoCopiarGastoDepreciacionCentroCosto));
			this.jButtonVerFormGastoDepreciacionCentroCosto.setVisible((this.isVisibilidadCeldaVerFormGastoDepreciacionCentroCosto && this.isPermisoVerFormGastoDepreciacionCentroCosto));
			
			this.jButtonAbrirOrderByGastoDepreciacionCentroCosto.setVisible((this.isVisibilidadCeldaOrdenGastoDepreciacionCentroCosto && this.isPermisoOrdenGastoDepreciacionCentroCosto));			
			
			this.jButtonNuevoRelacionesGastoDepreciacionCentroCosto.setVisible((this.isVisibilidadCeldaNuevoRelacionesGastoDepreciacionCentroCosto && this.isPermisoNuevoGastoDepreciacionCentroCosto));			
			this.jButtonNuevoGuardarCambiosGastoDepreciacionCentroCosto.setVisible((this.isVisibilidadCeldaNuevoGastoDepreciacionCentroCosto && this.isPermisoNuevoGastoDepreciacionCentroCosto && this.isPermisoGuardarCambiosGastoDepreciacionCentroCosto));
			
			if(this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto!=null) {
			this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto.jButtonModificarGastoDepreciacionCentroCosto.setVisible((this.isVisibilidadCeldaModificarGastoDepreciacionCentroCosto && this.isPermisoActualizarGastoDepreciacionCentroCosto));	
			this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto.jButtonActualizarGastoDepreciacionCentroCosto.setVisible((this.isVisibilidadCeldaActualizarGastoDepreciacionCentroCosto && this.isPermisoActualizarGastoDepreciacionCentroCosto));	
			this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto.jButtonEliminarGastoDepreciacionCentroCosto.setVisible((this.isVisibilidadCeldaEliminarGastoDepreciacionCentroCosto && this.isPermisoEliminarGastoDepreciacionCentroCosto));
			this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto.jButtonCancelarGastoDepreciacionCentroCosto.setVisible(this.isVisibilidadCeldaCancelarGastoDepreciacionCentroCosto);							
			this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto.jButtonGuardarCambiosGastoDepreciacionCentroCosto.setVisible((this.isVisibilidadCeldaGuardarGastoDepreciacionCentroCosto && this.isPermisoGuardarCambiosGastoDepreciacionCentroCosto));			
			
			}
						
			this.jButtonGuardarCambiosTablaGastoDepreciacionCentroCosto.setVisible((this.isVisibilidadCeldaGuardarCambiosGastoDepreciacionCentroCosto && this.isPermisoGuardarCambiosGastoDepreciacionCentroCosto));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarGastoDepreciacionCentroCosto.setVisible((this.isVisibilidadCeldaNuevoGastoDepreciacionCentroCosto && this.isPermisoNuevoGastoDepreciacionCentroCosto));						
			this.jButtonDuplicarToolBarGastoDepreciacionCentroCosto.setVisible((this.isVisibilidadCeldaDuplicarGastoDepreciacionCentroCosto && this.isPermisoDuplicarGastoDepreciacionCentroCosto));						
			this.jButtonCopiarToolBarGastoDepreciacionCentroCosto.setVisible((this.isVisibilidadCeldaCopiarGastoDepreciacionCentroCosto && this.isPermisoCopiarGastoDepreciacionCentroCosto));			
			this.jButtonVerFormToolBarGastoDepreciacionCentroCosto.setVisible((this.isVisibilidadCeldaVerFormGastoDepreciacionCentroCosto && this.isPermisoVerFormGastoDepreciacionCentroCosto));			
			this.jButtonAbrirOrderByToolBarGastoDepreciacionCentroCosto.setVisible((this.isVisibilidadCeldaOrdenGastoDepreciacionCentroCosto && this.isPermisoOrdenGastoDepreciacionCentroCosto));
			this.jButtonNuevoRelacionesToolBarGastoDepreciacionCentroCosto.setVisible((this.isVisibilidadCeldaNuevoRelacionesGastoDepreciacionCentroCosto && this.isPermisoNuevoGastoDepreciacionCentroCosto));			
			this.jButtonNuevoGuardarCambiosToolBarGastoDepreciacionCentroCosto.setVisible((this.isVisibilidadCeldaNuevoGastoDepreciacionCentroCosto && this.isPermisoNuevoGastoDepreciacionCentroCosto && this.isPermisoGuardarCambiosGastoDepreciacionCentroCosto));			
			
			if(this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto!=null) {
			this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto.jButtonModificarToolBarGastoDepreciacionCentroCosto.setVisible((this.isVisibilidadCeldaModificarGastoDepreciacionCentroCosto && this.isPermisoActualizarGastoDepreciacionCentroCosto));	
			this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto.jButtonActualizarToolBarGastoDepreciacionCentroCosto.setVisible((this.isVisibilidadCeldaActualizarGastoDepreciacionCentroCosto  && this.isPermisoActualizarGastoDepreciacionCentroCosto));	
			this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto.jButtonEliminarToolBarGastoDepreciacionCentroCosto.setVisible((this.isVisibilidadCeldaEliminarGastoDepreciacionCentroCosto && this.isPermisoEliminarGastoDepreciacionCentroCosto));
			this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto.jButtonCancelarToolBarGastoDepreciacionCentroCosto.setVisible(this.isVisibilidadCeldaCancelarGastoDepreciacionCentroCosto);				
			this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto.jButtonGuardarCambiosToolBarGastoDepreciacionCentroCosto.setVisible((this.isVisibilidadCeldaGuardarGastoDepreciacionCentroCosto && this.isPermisoGuardarCambiosGastoDepreciacionCentroCosto));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarGastoDepreciacionCentroCosto.setVisible((this.isVisibilidadCeldaGuardarCambiosGastoDepreciacionCentroCosto && this.isPermisoGuardarCambiosGastoDepreciacionCentroCosto));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoGastoDepreciacionCentroCosto.setVisible((this.isVisibilidadCeldaNuevoGastoDepreciacionCentroCosto && this.isPermisoNuevoGastoDepreciacionCentroCosto));			
			this.jMenuItemDuplicarGastoDepreciacionCentroCosto.setVisible((this.isVisibilidadCeldaDuplicarGastoDepreciacionCentroCosto && this.isPermisoDuplicarGastoDepreciacionCentroCosto));			
			this.jMenuItemCopiarGastoDepreciacionCentroCosto.setVisible((this.isVisibilidadCeldaCopiarGastoDepreciacionCentroCosto && this.isPermisoCopiarGastoDepreciacionCentroCosto));			
			this.jMenuItemVerFormGastoDepreciacionCentroCosto.setVisible((this.isVisibilidadCeldaVerFormGastoDepreciacionCentroCosto && this.isPermisoVerFormGastoDepreciacionCentroCosto));			
			this.jMenuItemAbrirOrderByGastoDepreciacionCentroCosto.setVisible((this.isVisibilidadCeldaOrdenGastoDepreciacionCentroCosto && this.isPermisoOrdenGastoDepreciacionCentroCosto));			
			//this.jMenuItemMostrarOcultarGastoDepreciacionCentroCosto.setVisible((this.isVisibilidadCeldaOrdenGastoDepreciacionCentroCosto && this.isPermisoOrdenGastoDepreciacionCentroCosto));
			this.jMenuItemDetalleAbrirOrderByGastoDepreciacionCentroCosto.setVisible((this.isVisibilidadCeldaOrdenGastoDepreciacionCentroCosto && this.isPermisoOrdenGastoDepreciacionCentroCosto));			
			//this.jMenuItemDetalleMostrarOcultarGastoDepreciacionCentroCosto.setVisible((this.isVisibilidadCeldaOrdenGastoDepreciacionCentroCosto && this.isPermisoOrdenGastoDepreciacionCentroCosto));			
			this.jMenuItemNuevoRelacionesGastoDepreciacionCentroCosto.setVisible((this.isVisibilidadCeldaNuevoRelacionesGastoDepreciacionCentroCosto && this.isPermisoNuevoGastoDepreciacionCentroCosto));			
			this.jMenuItemNuevoGuardarCambiosGastoDepreciacionCentroCosto.setVisible((this.isVisibilidadCeldaNuevoGastoDepreciacionCentroCosto && this.isPermisoNuevoGastoDepreciacionCentroCosto && this.isPermisoGuardarCambiosGastoDepreciacionCentroCosto));									
			
			if(this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto!=null) {
			this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto.jMenuItemModificarGastoDepreciacionCentroCosto.setVisible((this.isVisibilidadCeldaModificarGastoDepreciacionCentroCosto && this.isPermisoActualizarGastoDepreciacionCentroCosto));	
			this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto.jMenuItemActualizarGastoDepreciacionCentroCosto.setVisible((this.isVisibilidadCeldaActualizarGastoDepreciacionCentroCosto && this.isPermisoActualizarGastoDepreciacionCentroCosto));	
			this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto.jMenuItemEliminarGastoDepreciacionCentroCosto.setVisible((this.isVisibilidadCeldaEliminarGastoDepreciacionCentroCosto && this.isPermisoEliminarGastoDepreciacionCentroCosto));
			this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto.jMenuItemCancelarGastoDepreciacionCentroCosto.setVisible(this.isVisibilidadCeldaCancelarGastoDepreciacionCentroCosto);				
			}
			
			this.jMenuItemGuardarCambiosGastoDepreciacionCentroCosto.setVisible((this.isVisibilidadCeldaGuardarGastoDepreciacionCentroCosto && this.isPermisoGuardarCambiosGastoDepreciacionCentroCosto));						
			this.jMenuItemGuardarCambiosTablaGastoDepreciacionCentroCosto.setVisible((this.isVisibilidadCeldaGuardarCambiosGastoDepreciacionCentroCosto && this.isPermisoGuardarCambiosGastoDepreciacionCentroCosto));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoGastoDepreciacionCentroCosto=this.jButtonNuevoGastoDepreciacionCentroCosto.isVisible();
			this.isVisibilidadCeldaDuplicarGastoDepreciacionCentroCosto=this.jButtonDuplicarGastoDepreciacionCentroCosto.isVisible();
			this.isVisibilidadCeldaCopiarGastoDepreciacionCentroCosto=this.jButtonCopiarGastoDepreciacionCentroCosto.isVisible();
			this.isVisibilidadCeldaVerFormGastoDepreciacionCentroCosto=this.jButtonVerFormGastoDepreciacionCentroCosto.isVisible();
			
			this.isVisibilidadCeldaOrdenGastoDepreciacionCentroCosto=this.jButtonAbrirOrderByGastoDepreciacionCentroCosto.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesGastoDepreciacionCentroCosto=this.jButtonNuevoRelacionesGastoDepreciacionCentroCosto.isVisible();
			this.isVisibilidadCeldaModificarGastoDepreciacionCentroCosto=this.jButtonModificarGastoDepreciacionCentroCosto.isVisible();
			
			if(this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto!=null) {
			this.isVisibilidadCeldaActualizarGastoDepreciacionCentroCosto=this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto.jButtonActualizarGastoDepreciacionCentroCosto.isVisible();
			this.isVisibilidadCeldaEliminarGastoDepreciacionCentroCosto=this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto.jButtonEliminarGastoDepreciacionCentroCosto.isVisible();
			this.isVisibilidadCeldaCancelarGastoDepreciacionCentroCosto=this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto.jButtonCancelarGastoDepreciacionCentroCosto.isVisible();
			this.isVisibilidadCeldaGuardarGastoDepreciacionCentroCosto=this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto.jButtonGuardarCambiosGastoDepreciacionCentroCosto.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosGastoDepreciacionCentroCosto=this.jButtonGuardarCambiosTablaGastoDepreciacionCentroCosto.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoGastoDepreciacionCentroCosto=this.jButtonNuevoToolBarGastoDepreciacionCentroCosto.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesGastoDepreciacionCentroCosto=this.jButtonNuevoRelacionesToolBarGastoDepreciacionCentroCosto.isVisible();
			
			if(this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto!=null) {
			this.isVisibilidadCeldaModificarGastoDepreciacionCentroCosto=this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto.jButtonModificarToolBarGastoDepreciacionCentroCosto.isVisible();
			this.isVisibilidadCeldaActualizarGastoDepreciacionCentroCosto=this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto.jButtonActualizarToolBarGastoDepreciacionCentroCosto.isVisible();
			this.isVisibilidadCeldaEliminarGastoDepreciacionCentroCosto=this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto.jButtonEliminarToolBarGastoDepreciacionCentroCosto.isVisible();
			this.isVisibilidadCeldaCancelarGastoDepreciacionCentroCosto=this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto.jButtonCancelarToolBarGastoDepreciacionCentroCosto.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarGastoDepreciacionCentroCosto=this.jButtonGuardarCambiosToolBarGastoDepreciacionCentroCosto.isVisible();
			this.isVisibilidadCeldaGuardarCambiosGastoDepreciacionCentroCosto=this.jButtonGuardarCambiosTablaToolBarGastoDepreciacionCentroCosto.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoGastoDepreciacionCentroCosto=this.jMenuItemNuevoGastoDepreciacionCentroCosto.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesGastoDepreciacionCentroCosto=this.jMenuItemNuevoRelacionesGastoDepreciacionCentroCosto.isVisible();
			
			if(this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto!=null) {
			this.isVisibilidadCeldaModificarGastoDepreciacionCentroCosto=this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto.jMenuItemModificarGastoDepreciacionCentroCosto.isVisible();
			this.isVisibilidadCeldaActualizarGastoDepreciacionCentroCosto=this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto.jMenuItemActualizarGastoDepreciacionCentroCosto.isVisible();
			this.isVisibilidadCeldaEliminarGastoDepreciacionCentroCosto=this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto.jMenuItemEliminarGastoDepreciacionCentroCosto.isVisible();
			this.isVisibilidadCeldaCancelarGastoDepreciacionCentroCosto=this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto.jMenuItemCancelarGastoDepreciacionCentroCosto.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarGastoDepreciacionCentroCosto=this.jMenuItemGuardarCambiosGastoDepreciacionCentroCosto.isVisible();
			this.isVisibilidadCeldaGuardarCambiosGastoDepreciacionCentroCosto=this.jMenuItemGuardarCambiosTablaGastoDepreciacionCentroCosto.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesGastoDepreciacionCentroCosto(Boolean esInicializar) {
		if(GastoDepreciacionCentroCostoJInternalFrame.ISBINDING_MANUAL) {			
			if(this.gastodepreciacioncentrocostoSessionBean.getConGuardarRelaciones()) {
				//if(this.gastodepreciacioncentrocostoSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesGastoDepreciacionCentroCosto();
			}
			
			this.inicializarActualizarBindingBotonesManualGastoDepreciacionCentroCosto(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualGastoDepreciacionCentroCosto() {
		this.jButtonNuevoGastoDepreciacionCentroCosto.setVisible(this.isPermisoNuevoGastoDepreciacionCentroCosto);			
		this.jButtonDuplicarGastoDepreciacionCentroCosto.setVisible(this.isPermisoDuplicarGastoDepreciacionCentroCosto);			
		this.jButtonCopiarGastoDepreciacionCentroCosto.setVisible(this.isPermisoCopiarGastoDepreciacionCentroCosto);			
		this.jButtonVerFormGastoDepreciacionCentroCosto.setVisible(this.isPermisoVerFormGastoDepreciacionCentroCosto);			
		
		this.jButtonAbrirOrderByGastoDepreciacionCentroCosto.setVisible(this.isPermisoOrdenGastoDepreciacionCentroCosto);					
		
		this.jButtonNuevoRelacionesGastoDepreciacionCentroCosto.setVisible(this.isPermisoNuevoGastoDepreciacionCentroCosto);			
		
		if(this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto.jButtonModificarGastoDepreciacionCentroCosto.setVisible(this.isPermisoActualizarGastoDepreciacionCentroCosto);	
			this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto.jButtonActualizarGastoDepreciacionCentroCosto.setVisible(this.isPermisoActualizarGastoDepreciacionCentroCosto);	
			this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto.jButtonEliminarGastoDepreciacionCentroCosto.setVisible(this.isPermisoEliminarGastoDepreciacionCentroCosto);
			this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto.jButtonCancelarGastoDepreciacionCentroCosto.setVisible(this.isVisibilidadCeldaCancelarGastoDepreciacionCentroCosto);						
			this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto.jButtonGuardarCambiosGastoDepreciacionCentroCosto.setVisible(this.isPermisoGuardarCambiosGastoDepreciacionCentroCosto);							
		}
		
		this.jButtonGuardarCambiosTablaGastoDepreciacionCentroCosto.setVisible(this.isPermisoActualizarGastoDepreciacionCentroCosto);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleGastoDepreciacionCentroCosto() {
		this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto.jButtonModificarGastoDepreciacionCentroCosto.setVisible(this.isPermisoActualizarGastoDepreciacionCentroCosto);	
		this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto.jButtonActualizarGastoDepreciacionCentroCosto.setVisible(this.isPermisoActualizarGastoDepreciacionCentroCosto);	
		this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto.jButtonEliminarGastoDepreciacionCentroCosto.setVisible(this.isPermisoEliminarGastoDepreciacionCentroCosto);
		this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto.jButtonCancelarGastoDepreciacionCentroCosto.setVisible(this.isVisibilidadCeldaCancelarGastoDepreciacionCentroCosto);							
		this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto.jButtonGuardarCambiosGastoDepreciacionCentroCosto.setVisible((this.isVisibilidadCeldaGuardarGastoDepreciacionCentroCosto && this.isPermisoGuardarCambiosGastoDepreciacionCentroCosto));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosGastoDepreciacionCentroCosto() {
		if(GastoDepreciacionCentroCostoJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualGastoDepreciacionCentroCosto();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesGastoDepreciacionCentroCosto() {
	}
	
	public void jTableDatosGastoDepreciacionCentroCostoListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarGastoDepreciacionCentroCosto(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GastoDepreciacionCentroCostoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidGastoDepreciacionCentroCostoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.gastodepreciacioncentrocostoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosGastoDepreciacionCentroCosto.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualGastoDepreciacionCentroCosto(this.getgastodepreciacioncentrocosto(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysGastoDepreciacionCentroCosto(this.gastodepreciacioncentrocosto);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.gastodepreciacioncentrocosto =(GastoDepreciacionCentroCosto) this.gastodepreciacioncentrocostoLogic.getGastoDepreciacionCentroCostos().toArray()[this.jTableDatosGastoDepreciacionCentroCosto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.gastodepreciacioncentrocosto =(GastoDepreciacionCentroCosto) this.gastodepreciacioncentrocostos.toArray()[this.jTableDatosGastoDepreciacionCentroCosto.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.gastodepreciacioncentrocosto==null) {
						this.gastodepreciacioncentrocosto = new GastoDepreciacionCentroCosto();
					}

					this.setVariablesFormularioToObjetoActualGastoDepreciacionCentroCosto(this.gastodepreciacioncentrocosto,true);
					this.setVariablesFormularioToObjetoActualForeignKeysGastoDepreciacionCentroCosto(this.gastodepreciacioncentrocosto);
				}

				if(this.gastodepreciacioncentrocosto.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.gastodepreciacioncentrocosto.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingGastoDepreciacionCentroCosto(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.gastodepreciacioncentrocostoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.gastodepreciacioncentrocostoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,GastoDepreciacionCentroCostoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.gastodepreciacioncentrocostoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaGastoDepreciacionCentroCostoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.gastodepreciacioncentrocostoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebGastoDepreciacionCentroCosto(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosGastoDepreciacionCentroCosto.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosGastoDepreciacionCentroCosto.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosGastoDepreciacionCentroCosto.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.gastodepreciacioncentrocosto =(GastoDepreciacionCentroCosto) this.gastodepreciacioncentrocostoLogic.getGastoDepreciacionCentroCostos().toArray()[this.jTableDatosGastoDepreciacionCentroCosto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.gastodepreciacioncentrocosto =(GastoDepreciacionCentroCosto) this.gastodepreciacioncentrocostos.toArray()[this.jTableDatosGastoDepreciacionCentroCosto.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualGastoDepreciacionCentroCosto(this.getgastodepreciacioncentrocosto(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysGastoDepreciacionCentroCosto(this.gastodepreciacioncentrocosto);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.gastodepreciacioncentrocostoLogic.getConnexion());

				if(this.gastodepreciacioncentrocosto.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.gastodepreciacioncentrocosto.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderGastoDepreciacionCentroCosto=(TitledBorder)this.jScrollPanelDatosGastoDepreciacionCentroCosto.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderGastoDepreciacionCentroCosto.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.gastodepreciacioncentrocostoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.gastodepreciacioncentrocostoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,GastoDepreciacionCentroCostoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.gastodepreciacioncentrocostoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaGastoDepreciacionCentroCostoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.gastodepreciacioncentrocostoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosGastoDepreciacionCentroCosto.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualGastoDepreciacionCentroCosto(this.getgastodepreciacioncentrocosto(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysGastoDepreciacionCentroCosto(this.gastodepreciacioncentrocosto);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.gastodepreciacioncentrocosto =(GastoDepreciacionCentroCosto) this.gastodepreciacioncentrocostoLogic.getGastoDepreciacionCentroCostos().toArray()[this.jTableDatosGastoDepreciacionCentroCosto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.gastodepreciacioncentrocosto =(GastoDepreciacionCentroCosto) this.gastodepreciacioncentrocostos.toArray()[this.jTableDatosGastoDepreciacionCentroCosto.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.gastodepreciacioncentrocosto==null) {
						this.gastodepreciacioncentrocosto = new GastoDepreciacionCentroCosto();
					}

					this.setVariablesFormularioToObjetoActualGastoDepreciacionCentroCosto(this.gastodepreciacioncentrocosto,true);
					this.setVariablesFormularioToObjetoActualForeignKeysGastoDepreciacionCentroCosto(this.gastodepreciacioncentrocosto);
				}

				if(this.gastodepreciacioncentrocosto.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.gastodepreciacioncentrocosto.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingGastoDepreciacionCentroCosto(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.gastodepreciacioncentrocostoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.gastodepreciacioncentrocostoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,GastoDepreciacionCentroCostoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.gastodepreciacioncentrocostoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_sucursalGastoDepreciacionCentroCostoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.gastodepreciacioncentrocostoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisosucursal=true;

			idTienePermisosucursal=this.tienePermisosUsuarioEnPaginaWebGastoDepreciacionCentroCosto(SucursalConstantesFunciones.CLASSNAME);

			if(idTienePermisosucursal) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosGastoDepreciacionCentroCosto.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosGastoDepreciacionCentroCosto.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosGastoDepreciacionCentroCosto.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.gastodepreciacioncentrocosto =(GastoDepreciacionCentroCosto) this.gastodepreciacioncentrocostoLogic.getGastoDepreciacionCentroCostos().toArray()[this.jTableDatosGastoDepreciacionCentroCosto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.gastodepreciacioncentrocosto =(GastoDepreciacionCentroCosto) this.gastodepreciacioncentrocostos.toArray()[this.jTableDatosGastoDepreciacionCentroCosto.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualGastoDepreciacionCentroCosto(this.getgastodepreciacioncentrocosto(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysGastoDepreciacionCentroCosto(this.gastodepreciacioncentrocosto);

				this.sucursalBeanSwingJInternalFrame=new SucursalBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.sucursalBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.sucursalBeanSwingJInternalFrame.getSucursalLogic().setConnexion(this.gastodepreciacioncentrocostoLogic.getConnexion());

				if(this.gastodepreciacioncentrocosto.getid_sucursal()!=null) {
					this.sucursalBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.sucursalBeanSwingJInternalFrame.setIdActual(this.gastodepreciacioncentrocosto.getid_sucursal());
					this.sucursalBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.inicializarActualizarBindingTablaSucursal();
				}

				JInternalFrameBase jinternalFrame =this.sucursalBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderGastoDepreciacionCentroCosto=(TitledBorder)this.jScrollPanelDatosGastoDepreciacionCentroCosto.getBorder();
				TitledBorder titledBordersucursal=(TitledBorder)this.sucursalBeanSwingJInternalFrame.jScrollPanelDatosSucursal.getBorder();

				titledBordersucursal.setTitle(titledBorderGastoDepreciacionCentroCosto.getTitle() + " -> Sucursal");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.gastodepreciacioncentrocostoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.gastodepreciacioncentrocostoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,GastoDepreciacionCentroCostoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.gastodepreciacioncentrocostoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_sucursalGastoDepreciacionCentroCostoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.gastodepreciacioncentrocostoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosGastoDepreciacionCentroCosto.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualGastoDepreciacionCentroCosto(this.getgastodepreciacioncentrocosto(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysGastoDepreciacionCentroCosto(this.gastodepreciacioncentrocosto);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.gastodepreciacioncentrocosto =(GastoDepreciacionCentroCosto) this.gastodepreciacioncentrocostoLogic.getGastoDepreciacionCentroCostos().toArray()[this.jTableDatosGastoDepreciacionCentroCosto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.gastodepreciacioncentrocosto =(GastoDepreciacionCentroCosto) this.gastodepreciacioncentrocostos.toArray()[this.jTableDatosGastoDepreciacionCentroCosto.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.gastodepreciacioncentrocosto==null) {
						this.gastodepreciacioncentrocosto = new GastoDepreciacionCentroCosto();
					}

					this.setVariablesFormularioToObjetoActualGastoDepreciacionCentroCosto(this.gastodepreciacioncentrocosto,true);
					this.setVariablesFormularioToObjetoActualForeignKeysGastoDepreciacionCentroCosto(this.gastodepreciacioncentrocosto);
				}

				if(this.gastodepreciacioncentrocosto.getid_sucursal()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_sucursal = "+this.gastodepreciacioncentrocosto.getid_sucursal().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingGastoDepreciacionCentroCosto(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.gastodepreciacioncentrocostoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.gastodepreciacioncentrocostoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,GastoDepreciacionCentroCostoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.gastodepreciacioncentrocostoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_centro_costoGastoDepreciacionCentroCostoActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {
			this.centrocostoBeanSwingJInternalFrame=new CentroCostoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.BUSQUEDA,false,false,false,true);
			this.centrocostoBeanSwingJInternalFrame.setJInternalFrameParent(this);
			this.centrocostoBeanSwingJInternalFrame.sTipoBusqueda="CentroCosto";

			if(!this.sFinalQueryGeneral_centrocosto.equals("")) {
				this.centrocostoBeanSwingJInternalFrame.setsFinalQueryGeneral(this.sFinalQueryGeneral_centrocosto);
				this.centrocostoBeanSwingJInternalFrame.sAccionBusqueda="Query";


				this.centrocostoBeanSwingJInternalFrame.procesarBusqueda(this.centrocostoBeanSwingJInternalFrame.sAccionBusqueda);
				this.centrocostoBeanSwingJInternalFrame.inicializarActualizarBindingCentroCosto(false);
			}

			if(!this.sFinalQueryComboCentroCosto.equals("") && false) {
			}


			JInternalFrameBase jinternalFrame =this.centrocostoBeanSwingJInternalFrame;
			jinternalFrame.setAutoscrolls(true);
			//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
			jinternalFrame.setVisible(true); 


			TitledBorder titledBorderGastoDepreciacionCentroCosto=null;
			TitledBorder titledBordercentrocosto=null;

			if(!this.jScrollPanelDatosGastoDepreciacionCentroCosto.getBorder().getClass().equals(EmptyBorder.class)) {
				titledBorderGastoDepreciacionCentroCosto=(TitledBorder)this.jScrollPanelDatosGastoDepreciacionCentroCosto.getBorder();
				titledBordercentrocosto=(TitledBorder)this.centrocostoBeanSwingJInternalFrame.jScrollPanelDatosCentroCosto.getBorder();

				titledBordercentrocosto.setTitle(titledBorderGastoDepreciacionCentroCosto.getTitle() + " -> Centro Costo");
			}

			if(!Constantes.CON_VARIAS_VENTANAS) {
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
			}

			this.jDesktopPane.add(jinternalFrame);

			jinternalFrame.setSelected(true);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GastoDepreciacionCentroCostoConstantesFunciones.CLASSNAME);
		}
	}

	public void jButtonid_centro_costoGastoDepreciacionCentroCostoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.gastodepreciacioncentrocostoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisocentrocosto=true;

			idTienePermisocentrocosto=this.tienePermisosUsuarioEnPaginaWebGastoDepreciacionCentroCosto(CentroCostoConstantesFunciones.CLASSNAME);

			if(idTienePermisocentrocosto) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosGastoDepreciacionCentroCosto.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosGastoDepreciacionCentroCosto.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosGastoDepreciacionCentroCosto.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.gastodepreciacioncentrocosto =(GastoDepreciacionCentroCosto) this.gastodepreciacioncentrocostoLogic.getGastoDepreciacionCentroCostos().toArray()[this.jTableDatosGastoDepreciacionCentroCosto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.gastodepreciacioncentrocosto =(GastoDepreciacionCentroCosto) this.gastodepreciacioncentrocostos.toArray()[this.jTableDatosGastoDepreciacionCentroCosto.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualGastoDepreciacionCentroCosto(this.getgastodepreciacioncentrocosto(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysGastoDepreciacionCentroCosto(this.gastodepreciacioncentrocosto);

				this.centrocostoBeanSwingJInternalFrame=new CentroCostoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.centrocostoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.centrocostoBeanSwingJInternalFrame.getCentroCostoLogic().setConnexion(this.gastodepreciacioncentrocostoLogic.getConnexion());

				if(this.gastodepreciacioncentrocosto.getid_centro_costo()!=null) {
					this.centrocostoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.centrocostoBeanSwingJInternalFrame.setIdActual(this.gastodepreciacioncentrocosto.getid_centro_costo());
					this.centrocostoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.centrocostoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.centrocostoBeanSwingJInternalFrame.inicializarActualizarBindingTablaCentroCosto();
				}

				JInternalFrameBase jinternalFrame =this.centrocostoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderGastoDepreciacionCentroCosto=(TitledBorder)this.jScrollPanelDatosGastoDepreciacionCentroCosto.getBorder();
				TitledBorder titledBordercentrocosto=(TitledBorder)this.centrocostoBeanSwingJInternalFrame.jScrollPanelDatosCentroCosto.getBorder();

				titledBordercentrocosto.setTitle(titledBorderGastoDepreciacionCentroCosto.getTitle() + " -> Centro Costo");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.gastodepreciacioncentrocostoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.gastodepreciacioncentrocostoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,GastoDepreciacionCentroCostoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.gastodepreciacioncentrocostoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_centro_costoGastoDepreciacionCentroCostoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.gastodepreciacioncentrocostoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosGastoDepreciacionCentroCosto.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualGastoDepreciacionCentroCosto(this.getgastodepreciacioncentrocosto(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysGastoDepreciacionCentroCosto(this.gastodepreciacioncentrocosto);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.gastodepreciacioncentrocosto =(GastoDepreciacionCentroCosto) this.gastodepreciacioncentrocostoLogic.getGastoDepreciacionCentroCostos().toArray()[this.jTableDatosGastoDepreciacionCentroCosto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.gastodepreciacioncentrocosto =(GastoDepreciacionCentroCosto) this.gastodepreciacioncentrocostos.toArray()[this.jTableDatosGastoDepreciacionCentroCosto.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.gastodepreciacioncentrocosto==null) {
						this.gastodepreciacioncentrocosto = new GastoDepreciacionCentroCosto();
					}

					this.setVariablesFormularioToObjetoActualGastoDepreciacionCentroCosto(this.gastodepreciacioncentrocosto,true);
					this.setVariablesFormularioToObjetoActualForeignKeysGastoDepreciacionCentroCosto(this.gastodepreciacioncentrocosto);
				}

				if(this.gastodepreciacioncentrocosto.getid_centro_costo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_centro_costo = "+this.gastodepreciacioncentrocosto.getid_centro_costo().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingGastoDepreciacionCentroCosto(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.gastodepreciacioncentrocostoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.gastodepreciacioncentrocostoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,GastoDepreciacionCentroCostoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.gastodepreciacioncentrocostoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_detalle_activo_fijoGastoDepreciacionCentroCostoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.gastodepreciacioncentrocostoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisodetalleactivofijo=true;

			idTienePermisodetalleactivofijo=this.tienePermisosUsuarioEnPaginaWebGastoDepreciacionCentroCosto(DetalleActivoFijoConstantesFunciones.CLASSNAME);

			if(idTienePermisodetalleactivofijo) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosGastoDepreciacionCentroCosto.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosGastoDepreciacionCentroCosto.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosGastoDepreciacionCentroCosto.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.gastodepreciacioncentrocosto =(GastoDepreciacionCentroCosto) this.gastodepreciacioncentrocostoLogic.getGastoDepreciacionCentroCostos().toArray()[this.jTableDatosGastoDepreciacionCentroCosto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.gastodepreciacioncentrocosto =(GastoDepreciacionCentroCosto) this.gastodepreciacioncentrocostos.toArray()[this.jTableDatosGastoDepreciacionCentroCosto.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualGastoDepreciacionCentroCosto(this.getgastodepreciacioncentrocosto(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysGastoDepreciacionCentroCosto(this.gastodepreciacioncentrocosto);

				this.detalleactivofijoBeanSwingJInternalFrame=new DetalleActivoFijoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.detalleactivofijoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.detalleactivofijoBeanSwingJInternalFrame.getDetalleActivoFijoLogic().setConnexion(this.gastodepreciacioncentrocostoLogic.getConnexion());

				if(this.gastodepreciacioncentrocosto.getid_detalle_activo_fijo()!=null) {
					this.detalleactivofijoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.detalleactivofijoBeanSwingJInternalFrame.setIdActual(this.gastodepreciacioncentrocosto.getid_detalle_activo_fijo());
					this.detalleactivofijoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.detalleactivofijoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.detalleactivofijoBeanSwingJInternalFrame.inicializarActualizarBindingTablaDetalleActivoFijo();
				}

				JInternalFrameBase jinternalFrame =this.detalleactivofijoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderGastoDepreciacionCentroCosto=(TitledBorder)this.jScrollPanelDatosGastoDepreciacionCentroCosto.getBorder();
				TitledBorder titledBorderdetalleactivofijo=(TitledBorder)this.detalleactivofijoBeanSwingJInternalFrame.jScrollPanelDatosDetalleActivoFijo.getBorder();

				titledBorderdetalleactivofijo.setTitle(titledBorderGastoDepreciacionCentroCosto.getTitle() + " -> Detalle Activo Fijo");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.gastodepreciacioncentrocostoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.gastodepreciacioncentrocostoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,GastoDepreciacionCentroCostoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.gastodepreciacioncentrocostoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_detalle_activo_fijoGastoDepreciacionCentroCostoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.gastodepreciacioncentrocostoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosGastoDepreciacionCentroCosto.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualGastoDepreciacionCentroCosto(this.getgastodepreciacioncentrocosto(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysGastoDepreciacionCentroCosto(this.gastodepreciacioncentrocosto);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.gastodepreciacioncentrocosto =(GastoDepreciacionCentroCosto) this.gastodepreciacioncentrocostoLogic.getGastoDepreciacionCentroCostos().toArray()[this.jTableDatosGastoDepreciacionCentroCosto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.gastodepreciacioncentrocosto =(GastoDepreciacionCentroCosto) this.gastodepreciacioncentrocostos.toArray()[this.jTableDatosGastoDepreciacionCentroCosto.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.gastodepreciacioncentrocosto==null) {
						this.gastodepreciacioncentrocosto = new GastoDepreciacionCentroCosto();
					}

					this.setVariablesFormularioToObjetoActualGastoDepreciacionCentroCosto(this.gastodepreciacioncentrocosto,true);
					this.setVariablesFormularioToObjetoActualForeignKeysGastoDepreciacionCentroCosto(this.gastodepreciacioncentrocosto);
				}

				if(this.gastodepreciacioncentrocosto.getid_detalle_activo_fijo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_detalle_activo_fijo = "+this.gastodepreciacioncentrocosto.getid_detalle_activo_fijo().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingGastoDepreciacionCentroCosto(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.gastodepreciacioncentrocostoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.gastodepreciacioncentrocostoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,GastoDepreciacionCentroCostoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.gastodepreciacioncentrocostoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_cuenta_contableGastoDepreciacionCentroCostoActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {
			this.cuentacontableBeanSwingJInternalFrame=new CuentaContableBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.BUSQUEDA,false,false,false,true);
			this.cuentacontableBeanSwingJInternalFrame.setJInternalFrameParent(this);
			this.cuentacontableBeanSwingJInternalFrame.sTipoBusqueda="CuentaContable";

			if(!this.sFinalQueryGeneral_cuentacontable.equals("")) {
				this.cuentacontableBeanSwingJInternalFrame.setsFinalQueryGeneral(this.sFinalQueryGeneral_cuentacontable);
				this.cuentacontableBeanSwingJInternalFrame.sAccionBusqueda="Query";


				this.cuentacontableBeanSwingJInternalFrame.procesarBusqueda(this.cuentacontableBeanSwingJInternalFrame.sAccionBusqueda);
				this.cuentacontableBeanSwingJInternalFrame.inicializarActualizarBindingCuentaContable(false);
			}

			if(!this.sFinalQueryComboCuentaContable.equals("") && false) {
			}


			JInternalFrameBase jinternalFrame =this.cuentacontableBeanSwingJInternalFrame;
			jinternalFrame.setAutoscrolls(true);
			//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
			jinternalFrame.setVisible(true); 


			TitledBorder titledBorderGastoDepreciacionCentroCosto=null;
			TitledBorder titledBordercuentacontable=null;

			if(!this.jScrollPanelDatosGastoDepreciacionCentroCosto.getBorder().getClass().equals(EmptyBorder.class)) {
				titledBorderGastoDepreciacionCentroCosto=(TitledBorder)this.jScrollPanelDatosGastoDepreciacionCentroCosto.getBorder();
				titledBordercuentacontable=(TitledBorder)this.cuentacontableBeanSwingJInternalFrame.jScrollPanelDatosCuentaContable.getBorder();

				titledBordercuentacontable.setTitle(titledBorderGastoDepreciacionCentroCosto.getTitle() + " -> Cuenta Contable");
			}

			if(!Constantes.CON_VARIAS_VENTANAS) {
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
			}

			this.jDesktopPane.add(jinternalFrame);

			jinternalFrame.setSelected(true);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GastoDepreciacionCentroCostoConstantesFunciones.CLASSNAME);
		}
	}

	public void jButtonid_cuenta_contableGastoDepreciacionCentroCostoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.gastodepreciacioncentrocostoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisocuentacontable=true;

			idTienePermisocuentacontable=this.tienePermisosUsuarioEnPaginaWebGastoDepreciacionCentroCosto(CuentaContableConstantesFunciones.CLASSNAME);

			if(idTienePermisocuentacontable) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosGastoDepreciacionCentroCosto.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosGastoDepreciacionCentroCosto.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosGastoDepreciacionCentroCosto.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.gastodepreciacioncentrocosto =(GastoDepreciacionCentroCosto) this.gastodepreciacioncentrocostoLogic.getGastoDepreciacionCentroCostos().toArray()[this.jTableDatosGastoDepreciacionCentroCosto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.gastodepreciacioncentrocosto =(GastoDepreciacionCentroCosto) this.gastodepreciacioncentrocostos.toArray()[this.jTableDatosGastoDepreciacionCentroCosto.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualGastoDepreciacionCentroCosto(this.getgastodepreciacioncentrocosto(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysGastoDepreciacionCentroCosto(this.gastodepreciacioncentrocosto);

				this.cuentacontableBeanSwingJInternalFrame=new CuentaContableBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.cuentacontableBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.cuentacontableBeanSwingJInternalFrame.getCuentaContableLogic().setConnexion(this.gastodepreciacioncentrocostoLogic.getConnexion());

				if(this.gastodepreciacioncentrocosto.getid_cuenta_contable()!=null) {
					this.cuentacontableBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.cuentacontableBeanSwingJInternalFrame.setIdActual(this.gastodepreciacioncentrocosto.getid_cuenta_contable());
					this.cuentacontableBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.cuentacontableBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.cuentacontableBeanSwingJInternalFrame.inicializarActualizarBindingTablaCuentaContable();
				}

				JInternalFrameBase jinternalFrame =this.cuentacontableBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderGastoDepreciacionCentroCosto=(TitledBorder)this.jScrollPanelDatosGastoDepreciacionCentroCosto.getBorder();
				TitledBorder titledBordercuentacontable=(TitledBorder)this.cuentacontableBeanSwingJInternalFrame.jScrollPanelDatosCuentaContable.getBorder();

				titledBordercuentacontable.setTitle(titledBorderGastoDepreciacionCentroCosto.getTitle() + " -> Cuenta Contable");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.gastodepreciacioncentrocostoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.gastodepreciacioncentrocostoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,GastoDepreciacionCentroCostoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.gastodepreciacioncentrocostoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_cuenta_contableGastoDepreciacionCentroCostoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.gastodepreciacioncentrocostoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosGastoDepreciacionCentroCosto.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualGastoDepreciacionCentroCosto(this.getgastodepreciacioncentrocosto(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysGastoDepreciacionCentroCosto(this.gastodepreciacioncentrocosto);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.gastodepreciacioncentrocosto =(GastoDepreciacionCentroCosto) this.gastodepreciacioncentrocostoLogic.getGastoDepreciacionCentroCostos().toArray()[this.jTableDatosGastoDepreciacionCentroCosto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.gastodepreciacioncentrocosto =(GastoDepreciacionCentroCosto) this.gastodepreciacioncentrocostos.toArray()[this.jTableDatosGastoDepreciacionCentroCosto.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.gastodepreciacioncentrocosto==null) {
						this.gastodepreciacioncentrocosto = new GastoDepreciacionCentroCosto();
					}

					this.setVariablesFormularioToObjetoActualGastoDepreciacionCentroCosto(this.gastodepreciacioncentrocosto,true);
					this.setVariablesFormularioToObjetoActualForeignKeysGastoDepreciacionCentroCosto(this.gastodepreciacioncentrocosto);
				}

				if(this.gastodepreciacioncentrocosto.getid_cuenta_contable()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_cuenta_contable = "+this.gastodepreciacioncentrocosto.getid_cuenta_contable().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingGastoDepreciacionCentroCosto(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.gastodepreciacioncentrocostoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.gastodepreciacioncentrocostoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,GastoDepreciacionCentroCostoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.gastodepreciacioncentrocostoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonporcentajeGastoDepreciacionCentroCostoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.gastodepreciacioncentrocostoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosGastoDepreciacionCentroCosto.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualGastoDepreciacionCentroCosto(this.getgastodepreciacioncentrocosto(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysGastoDepreciacionCentroCosto(this.gastodepreciacioncentrocosto);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.gastodepreciacioncentrocosto =(GastoDepreciacionCentroCosto) this.gastodepreciacioncentrocostoLogic.getGastoDepreciacionCentroCostos().toArray()[this.jTableDatosGastoDepreciacionCentroCosto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.gastodepreciacioncentrocosto =(GastoDepreciacionCentroCosto) this.gastodepreciacioncentrocostos.toArray()[this.jTableDatosGastoDepreciacionCentroCosto.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.gastodepreciacioncentrocosto==null) {
						this.gastodepreciacioncentrocosto = new GastoDepreciacionCentroCosto();
					}

					this.setVariablesFormularioToObjetoActualGastoDepreciacionCentroCosto(this.gastodepreciacioncentrocosto,true);
					this.setVariablesFormularioToObjetoActualForeignKeysGastoDepreciacionCentroCosto(this.gastodepreciacioncentrocosto);
				}

				if(this.gastodepreciacioncentrocosto.getporcentaje()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where porcentaje = "+this.gastodepreciacioncentrocosto.getporcentaje().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingGastoDepreciacionCentroCosto(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.gastodepreciacioncentrocostoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.gastodepreciacioncentrocostoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,GastoDepreciacionCentroCostoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.gastodepreciacioncentrocostoLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdCentroCostoGastoDepreciacionCentroCostoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.gastodepreciacioncentrocostoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingGastoDepreciacionCentroCosto(false,false);

			this.getGastoDepreciacionCentroCostosFK_IdCentroCosto();

			this.inicializarActualizarBindingGastoDepreciacionCentroCosto(false);

			//if(GastoDepreciacionCentroCostoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingGastoDepreciacionCentroCosto(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.gastodepreciacioncentrocostoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.gastodepreciacioncentrocostoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,GastoDepreciacionCentroCostoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.gastodepreciacioncentrocostoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdCuentaContableGastoDepreciacionCentroCostoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.gastodepreciacioncentrocostoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingGastoDepreciacionCentroCosto(false,false);

			this.getGastoDepreciacionCentroCostosFK_IdCuentaContable();

			this.inicializarActualizarBindingGastoDepreciacionCentroCosto(false);

			//if(GastoDepreciacionCentroCostoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingGastoDepreciacionCentroCosto(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.gastodepreciacioncentrocostoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.gastodepreciacioncentrocostoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,GastoDepreciacionCentroCostoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.gastodepreciacioncentrocostoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdDetalleActivoFijoGastoDepreciacionCentroCostoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.gastodepreciacioncentrocostoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingGastoDepreciacionCentroCosto(false,false);

			this.getGastoDepreciacionCentroCostosFK_IdDetalleActivoFijo();

			this.inicializarActualizarBindingGastoDepreciacionCentroCosto(false);

			//if(GastoDepreciacionCentroCostoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingGastoDepreciacionCentroCosto(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.gastodepreciacioncentrocostoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.gastodepreciacioncentrocostoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,GastoDepreciacionCentroCostoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.gastodepreciacioncentrocostoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaGastoDepreciacionCentroCostoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.gastodepreciacioncentrocostoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingGastoDepreciacionCentroCosto(false,false);

			this.getGastoDepreciacionCentroCostosFK_IdEmpresa();

			this.inicializarActualizarBindingGastoDepreciacionCentroCosto(false);

			//if(GastoDepreciacionCentroCostoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingGastoDepreciacionCentroCosto(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.gastodepreciacioncentrocostoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.gastodepreciacioncentrocostoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,GastoDepreciacionCentroCostoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.gastodepreciacioncentrocostoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdSucursalGastoDepreciacionCentroCostoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.gastodepreciacioncentrocostoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingGastoDepreciacionCentroCosto(false,false);

			this.getGastoDepreciacionCentroCostosFK_IdSucursal();

			this.inicializarActualizarBindingGastoDepreciacionCentroCosto(false);

			//if(GastoDepreciacionCentroCostoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingGastoDepreciacionCentroCosto(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.gastodepreciacioncentrocostoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.gastodepreciacioncentrocostoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,GastoDepreciacionCentroCostoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.gastodepreciacioncentrocostoLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameGastoDepreciacionCentroCosto() {
		if(this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto!=null) {
			this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto.setVisible(false);	    			
			this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto.dispose();
			this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoGastoDepreciacionCentroCosto!=null) {
			this.jInternalFrameReporteDinamicoGastoDepreciacionCentroCosto.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoGastoDepreciacionCentroCosto.dispose();
			this.jInternalFrameReporteDinamicoGastoDepreciacionCentroCosto=null;
		}
		
		if(this.jInternalFrameImportacionGastoDepreciacionCentroCosto!=null) {
			this.jInternalFrameImportacionGastoDepreciacionCentroCosto.setVisible(false);	    			
			this.jInternalFrameImportacionGastoDepreciacionCentroCosto.dispose();
			this.jInternalFrameImportacionGastoDepreciacionCentroCosto=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessGastoDepreciacionCentroCosto();
			
			GastoDepreciacionCentroCostoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.gastodepreciacioncentrocosto,new Object(),this.gastodepreciacioncentrocostoParameterGeneral,this.gastodepreciacioncentrocostoReturnGeneral);
			
			
			if(sTipo.equals("NuevoGastoDepreciacionCentroCosto")) {
				jButtonNuevoGastoDepreciacionCentroCostoActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarGastoDepreciacionCentroCosto")) {
				jButtonDuplicarGastoDepreciacionCentroCostoActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarGastoDepreciacionCentroCosto")) {
				jButtonCopiarGastoDepreciacionCentroCostoActionPerformed(evt);
			} else if(sTipo.equals("VerFormGastoDepreciacionCentroCosto")) {
				jButtonVerFormGastoDepreciacionCentroCostoActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarGastoDepreciacionCentroCosto")) {
				jButtonNuevoGastoDepreciacionCentroCostoActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarGastoDepreciacionCentroCosto")) {
				jButtonDuplicarGastoDepreciacionCentroCostoActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoGastoDepreciacionCentroCosto")) {
				jButtonNuevoGastoDepreciacionCentroCostoActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarGastoDepreciacionCentroCosto")) {
				jButtonDuplicarGastoDepreciacionCentroCostoActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesGastoDepreciacionCentroCosto")) {
				jButtonNuevoGastoDepreciacionCentroCostoActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarGastoDepreciacionCentroCosto")) {
				jButtonNuevoGastoDepreciacionCentroCostoActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesGastoDepreciacionCentroCosto")) {
				jButtonNuevoGastoDepreciacionCentroCostoActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarGastoDepreciacionCentroCosto")) {
				jButtonModificarGastoDepreciacionCentroCostoActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarGastoDepreciacionCentroCosto")) {
				jButtonModificarGastoDepreciacionCentroCostoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarGastoDepreciacionCentroCosto")) {
				jButtonModificarGastoDepreciacionCentroCostoActionPerformed(evt);
			} else if(sTipo.equals("ActualizarGastoDepreciacionCentroCosto")) {
				jButtonActualizarGastoDepreciacionCentroCostoActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarGastoDepreciacionCentroCosto")) {
				jButtonActualizarGastoDepreciacionCentroCostoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarGastoDepreciacionCentroCosto")) {
				jButtonActualizarGastoDepreciacionCentroCostoActionPerformed(evt);
			} else if(sTipo.equals("EliminarGastoDepreciacionCentroCosto")) {
				jButtonEliminarGastoDepreciacionCentroCostoActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarGastoDepreciacionCentroCosto")) {
				jButtonEliminarGastoDepreciacionCentroCostoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarGastoDepreciacionCentroCosto")) {
				jButtonEliminarGastoDepreciacionCentroCostoActionPerformed(evt);
			} else if(sTipo.equals("CancelarGastoDepreciacionCentroCosto")) {
				jButtonCancelarGastoDepreciacionCentroCostoActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarGastoDepreciacionCentroCosto")) {
				jButtonCancelarGastoDepreciacionCentroCostoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarGastoDepreciacionCentroCosto")) {
				jButtonCancelarGastoDepreciacionCentroCostoActionPerformed(evt);
			} else if(sTipo.equals("CerrarGastoDepreciacionCentroCosto")) {
				jButtonCerrarGastoDepreciacionCentroCostoActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarGastoDepreciacionCentroCosto")) {
				jButtonCerrarGastoDepreciacionCentroCostoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarGastoDepreciacionCentroCosto")) {
				jButtonCerrarGastoDepreciacionCentroCostoActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarGastoDepreciacionCentroCosto")) {
				jButtonMostrarOcultarGastoDepreciacionCentroCostoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarGastoDepreciacionCentroCosto")) {
				jButtonCancelarGastoDepreciacionCentroCostoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosGastoDepreciacionCentroCosto")) {
				jButtonGuardarCambiosGastoDepreciacionCentroCostoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarGastoDepreciacionCentroCosto")) {
				jButtonGuardarCambiosGastoDepreciacionCentroCostoActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarGastoDepreciacionCentroCosto")) {
				jButtonCopiarGastoDepreciacionCentroCostoActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarGastoDepreciacionCentroCosto")) {
				jButtonVerFormGastoDepreciacionCentroCostoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosGastoDepreciacionCentroCosto")) {
				jButtonGuardarCambiosGastoDepreciacionCentroCostoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarGastoDepreciacionCentroCosto")) {
				jButtonCopiarGastoDepreciacionCentroCostoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormGastoDepreciacionCentroCosto")) {
				jButtonVerFormGastoDepreciacionCentroCostoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaGastoDepreciacionCentroCosto")) {
				jButtonGuardarCambiosGastoDepreciacionCentroCostoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarGastoDepreciacionCentroCosto")) {
				jButtonGuardarCambiosGastoDepreciacionCentroCostoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaGastoDepreciacionCentroCosto")) {
				jButtonGuardarCambiosGastoDepreciacionCentroCostoActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionGastoDepreciacionCentroCosto")) {
				jButtonRecargarInformacionGastoDepreciacionCentroCostoActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarGastoDepreciacionCentroCosto")) {
				jButtonRecargarInformacionGastoDepreciacionCentroCostoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionGastoDepreciacionCentroCosto")) {
				jButtonRecargarInformacionGastoDepreciacionCentroCostoActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresGastoDepreciacionCentroCosto")) {
				jButtonAnterioresGastoDepreciacionCentroCostoActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarGastoDepreciacionCentroCosto")) {
				jButtonAnterioresGastoDepreciacionCentroCostoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreGastoDepreciacionCentroCosto")) {
				jButtonAnterioresGastoDepreciacionCentroCostoActionPerformed(evt);
			} else if(sTipo.equals("SiguientesGastoDepreciacionCentroCosto")) {
				jButtonSiguientesGastoDepreciacionCentroCostoActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarGastoDepreciacionCentroCosto")) {
				jButtonSiguientesGastoDepreciacionCentroCostoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesGastoDepreciacionCentroCosto")) {
				jButtonSiguientesGastoDepreciacionCentroCostoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByGastoDepreciacionCentroCosto") || sTipo.equals("MenuItemDetalleAbrirOrderByGastoDepreciacionCentroCosto")) {
				jButtonAbrirOrderByGastoDepreciacionCentroCostoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarGastoDepreciacionCentroCosto") || sTipo.equals("MenuItemDetalleMostrarOcultarGastoDepreciacionCentroCosto")) {
				jButtonMostrarOcultarGastoDepreciacionCentroCostoActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosGastoDepreciacionCentroCosto")) {
				jButtonNuevoGuardarCambiosGastoDepreciacionCentroCostoActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarGastoDepreciacionCentroCosto")) {
				jButtonNuevoGuardarCambiosGastoDepreciacionCentroCostoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosGastoDepreciacionCentroCosto")) {
				jButtonNuevoGuardarCambiosGastoDepreciacionCentroCostoActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoGastoDepreciacionCentroCosto")) {
				jButtonCerrarReporteDinamicoGastoDepreciacionCentroCostoActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoGastoDepreciacionCentroCosto")) {
				jButtonGenerarReporteDinamicoGastoDepreciacionCentroCostoActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoGastoDepreciacionCentroCosto")) {
				
				jButtonGenerarExcelReporteDinamicoGastoDepreciacionCentroCostoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionGastoDepreciacionCentroCosto")) {
				jButtonCerrarImportacionGastoDepreciacionCentroCostoActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionGastoDepreciacionCentroCosto")) {
				
				jButtonGenerarImportacionGastoDepreciacionCentroCostoActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionGastoDepreciacionCentroCosto")) {
				
				jButtonAbrirImportacionGastoDepreciacionCentroCostoActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesGastoDepreciacionCentroCosto")) {
				jComboBoxTiposAccionesGastoDepreciacionCentroCostoActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesGastoDepreciacionCentroCosto")) {
				jComboBoxTiposRelacionesGastoDepreciacionCentroCostoActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioGastoDepreciacionCentroCosto")) {
				jComboBoxTiposAccionesGastoDepreciacionCentroCostoActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarGastoDepreciacionCentroCosto")) {
				
				jComboBoxTiposSeleccionarGastoDepreciacionCentroCostoActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralGastoDepreciacionCentroCosto")) {
				jTextFieldValorCampoGeneralGastoDepreciacionCentroCostoActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByGastoDepreciacionCentroCosto")) {
				jButtonAbrirOrderByGastoDepreciacionCentroCostoActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarGastoDepreciacionCentroCosto")) {
				jButtonAbrirOrderByGastoDepreciacionCentroCostoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByGastoDepreciacionCentroCosto")) {
				jButtonCerrarOrderByGastoDepreciacionCentroCostoActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idGastoDepreciacionCentroCostoBusqueda")) {
				this.jButtonidGastoDepreciacionCentroCostoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaGastoDepreciacionCentroCostoUpdate")) {
				this.jButtonid_empresaGastoDepreciacionCentroCostoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaGastoDepreciacionCentroCostoBusqueda")) {
				this.jButtonid_empresaGastoDepreciacionCentroCostoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalGastoDepreciacionCentroCostoUpdate")) {
				this.jButtonid_sucursalGastoDepreciacionCentroCostoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalGastoDepreciacionCentroCostoBusqueda")) {
				this.jButtonid_sucursalGastoDepreciacionCentroCostoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_centro_costoGastoDepreciacionCentroCosto")) {
				this.jButtonid_centro_costoGastoDepreciacionCentroCostoActionPerformed(evt);
			}
			//BUSQUEDA ARBOL CAMPO
			else if(sTipo.equals("id_centro_costoGastoDepreciacionCentroCostoArbol")) {
				this.abrirFrameTreeCentroCosto("BUSQUEDA_FK");
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_centro_costoGastoDepreciacionCentroCostoUpdate")) {
				this.jButtonid_centro_costoGastoDepreciacionCentroCostoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_centro_costoGastoDepreciacionCentroCostoBusqueda")) {
				this.jButtonid_centro_costoGastoDepreciacionCentroCostoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_detalle_activo_fijoGastoDepreciacionCentroCostoUpdate")) {
				this.jButtonid_detalle_activo_fijoGastoDepreciacionCentroCostoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_detalle_activo_fijoGastoDepreciacionCentroCostoBusqueda")) {
				this.jButtonid_detalle_activo_fijoGastoDepreciacionCentroCostoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_cuenta_contableGastoDepreciacionCentroCosto")) {
				this.jButtonid_cuenta_contableGastoDepreciacionCentroCostoActionPerformed(evt);
			}
			//BUSQUEDA ARBOL CAMPO
			else if(sTipo.equals("id_cuenta_contableGastoDepreciacionCentroCostoArbol")) {
				this.abrirFrameTreeCuentaContable("BUSQUEDA_FK");
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_cuenta_contableGastoDepreciacionCentroCostoUpdate")) {
				this.jButtonid_cuenta_contableGastoDepreciacionCentroCostoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_cuenta_contableGastoDepreciacionCentroCostoBusqueda")) {
				this.jButtonid_cuenta_contableGastoDepreciacionCentroCostoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("porcentajeGastoDepreciacionCentroCostoBusqueda")) {
				this.jButtonporcentajeGastoDepreciacionCentroCostoBusquedaActionPerformed(evt);
			}
			
			
			else if(sTipo.equals("id_centro_costoGastoDepreciacionCentroCosto")) {
				this.jButtonid_centro_costoGastoDepreciacionCentroCostoActionPerformed(evt);
			}
			else if(sTipo.equals("id_cuenta_contableGastoDepreciacionCentroCosto")) {
				this.jButtonid_cuenta_contableGastoDepreciacionCentroCostoActionPerformed(evt);
			}
			
			
			else if(sTipo.equals("FK_IdCentroCostoGastoDepreciacionCentroCosto")) {
				this.jButtonFK_IdCentroCostoGastoDepreciacionCentroCostoActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdCuentaContableGastoDepreciacionCentroCosto")) {
				this.jButtonFK_IdCuentaContableGastoDepreciacionCentroCostoActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdDetalleActivoFijoGastoDepreciacionCentroCosto")) {
				this.jButtonFK_IdDetalleActivoFijoGastoDepreciacionCentroCostoActionPerformed(evt);
			}
			
			;
			
			
			GastoDepreciacionCentroCostoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.gastodepreciacioncentrocosto,new Object(),this.gastodepreciacioncentrocostoParameterGeneral,this.gastodepreciacioncentrocostoReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GastoDepreciacionCentroCostoConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessGastoDepreciacionCentroCosto();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaGastoDepreciacionCentroCostoActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.gastodepreciacioncentrocosto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.gastodepreciacioncentrocosto);
				
				GastoDepreciacionCentroCostoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.gastodepreciacioncentrocosto,new Object(),this.gastodepreciacioncentrocostoParameterGeneral,this.gastodepreciacioncentrocostoReturnGeneral);
				
				


				
				GastoDepreciacionCentroCostoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.gastodepreciacioncentrocosto,new Object(),this.gastodepreciacioncentrocostoParameterGeneral,this.gastodepreciacioncentrocostoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(GastoDepreciacionCentroCosto.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",GastoDepreciacionCentroCosto.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,GastoDepreciacionCentroCostoConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			GastoDepreciacionCentroCosto gastodepreciacioncentrocostoLocal=null;
			
			if(!this.getEsControlTabla()) {
				gastodepreciacioncentrocostoLocal=this.gastodepreciacioncentrocosto;
			} else {
				gastodepreciacioncentrocostoLocal=this.gastodepreciacioncentrocostoAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GastoDepreciacionCentroCostoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.gastodepreciacioncentrocosto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.gastodepreciacioncentrocosto);
				
				GastoDepreciacionCentroCostoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.gastodepreciacioncentrocosto,new Object(),this.gastodepreciacioncentrocostoParameterGeneral,this.gastodepreciacioncentrocostoReturnGeneral);
							
				
				


				
				GastoDepreciacionCentroCostoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.gastodepreciacioncentrocosto,new Object(),this.gastodepreciacioncentrocostoParameterGeneral,this.gastodepreciacioncentrocostoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(GastoDepreciacionCentroCosto.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",GastoDepreciacionCentroCosto.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GastoDepreciacionCentroCostoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaGastoDepreciacionCentroCostoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosGastoDepreciacionCentroCosto.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.gastodepreciacioncentrocostoAnterior =(GastoDepreciacionCentroCosto) this.gastodepreciacioncentrocostoLogic.getGastoDepreciacionCentroCostos().toArray()[this.jTableDatosGastoDepreciacionCentroCosto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.gastodepreciacioncentrocostoAnterior =(GastoDepreciacionCentroCosto) this.gastodepreciacioncentrocostos.toArray()[this.jTableDatosGastoDepreciacionCentroCosto.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GastoDepreciacionCentroCostoConstantesFunciones.CLASSNAME);
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
			
			GastoDepreciacionCentroCostoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.gastodepreciacioncentrocosto,new Object(),this.gastodepreciacioncentrocostoParameterGeneral,this.gastodepreciacioncentrocostoReturnGeneral);
			
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
			
			


			
			GastoDepreciacionCentroCostoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.gastodepreciacioncentrocosto,new Object(),this.gastodepreciacioncentrocostoParameterGeneral,this.gastodepreciacioncentrocostoReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GastoDepreciacionCentroCostoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GastoDepreciacionCentroCostoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GastoDepreciacionCentroCostoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaGastoDepreciacionCentroCostoActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.gastodepreciacioncentrocosto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.gastodepreciacioncentrocosto);
				
				GastoDepreciacionCentroCostoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.gastodepreciacioncentrocosto,new Object(),this.gastodepreciacioncentrocostoParameterGeneral,this.gastodepreciacioncentrocostoReturnGeneral);
								
						
				


				
				GastoDepreciacionCentroCostoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.gastodepreciacioncentrocosto,new Object(),this.gastodepreciacioncentrocostoParameterGeneral,this.gastodepreciacioncentrocostoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(GastoDepreciacionCentroCosto.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",GastoDepreciacionCentroCosto.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GastoDepreciacionCentroCostoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.gastodepreciacioncentrocosto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.gastodepreciacioncentrocosto);
				
				GastoDepreciacionCentroCostoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.gastodepreciacioncentrocosto,new Object(),this.gastodepreciacioncentrocostoParameterGeneral,this.gastodepreciacioncentrocostoReturnGeneral);
								
				
				


				
				GastoDepreciacionCentroCostoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.gastodepreciacioncentrocosto,new Object(),this.gastodepreciacioncentrocostoParameterGeneral,this.gastodepreciacioncentrocostoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(GastoDepreciacionCentroCosto.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",GastoDepreciacionCentroCosto.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GastoDepreciacionCentroCostoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaGastoDepreciacionCentroCostoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosGastoDepreciacionCentroCosto.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.gastodepreciacioncentrocostoAnterior =(GastoDepreciacionCentroCosto) this.gastodepreciacioncentrocostoLogic.getGastoDepreciacionCentroCostos().toArray()[this.jTableDatosGastoDepreciacionCentroCosto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.gastodepreciacioncentrocostoAnterior =(GastoDepreciacionCentroCosto) this.gastodepreciacioncentrocostos.toArray()[this.jTableDatosGastoDepreciacionCentroCosto.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GastoDepreciacionCentroCostoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.gastodepreciacioncentrocosto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.gastodepreciacioncentrocosto);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GastoDepreciacionCentroCostoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaGastoDepreciacionCentroCostoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosGastoDepreciacionCentroCosto.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.gastodepreciacioncentrocostoAnterior =(GastoDepreciacionCentroCosto) this.gastodepreciacioncentrocostoLogic.getGastoDepreciacionCentroCostos().toArray()[this.jTableDatosGastoDepreciacionCentroCosto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.gastodepreciacioncentrocostoAnterior =(GastoDepreciacionCentroCosto) this.gastodepreciacioncentrocostos.toArray()[this.jTableDatosGastoDepreciacionCentroCosto.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GastoDepreciacionCentroCostoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaGastoDepreciacionCentroCostoActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.gastodepreciacioncentrocosto);
			
			this.actualizarInformacion("INFO_PADRE",false,this.gastodepreciacioncentrocosto);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GastoDepreciacionCentroCostoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.gastodepreciacioncentrocosto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.gastodepreciacioncentrocosto);
				
				GastoDepreciacionCentroCostoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.gastodepreciacioncentrocosto,new Object(),this.gastodepreciacioncentrocostoParameterGeneral,this.gastodepreciacioncentrocostoReturnGeneral);
							
				
				


				
				GastoDepreciacionCentroCostoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.gastodepreciacioncentrocosto,new Object(),this.gastodepreciacioncentrocostoParameterGeneral,this.gastodepreciacioncentrocostoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(GastoDepreciacionCentroCosto.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",GastoDepreciacionCentroCosto.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GastoDepreciacionCentroCostoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaGastoDepreciacionCentroCostoActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosGastoDepreciacionCentroCosto.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.gastodepreciacioncentrocostoAnterior =(GastoDepreciacionCentroCosto) this.gastodepreciacioncentrocostoLogic.getGastoDepreciacionCentroCostos().toArray()[this.jTableDatosGastoDepreciacionCentroCosto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.gastodepreciacioncentrocostoAnterior =(GastoDepreciacionCentroCosto) this.gastodepreciacioncentrocostos.toArray()[this.jTableDatosGastoDepreciacionCentroCosto.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GastoDepreciacionCentroCostoConstantesFunciones.CLASSNAME);
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
			
			GastoDepreciacionCentroCostoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.gastodepreciacioncentrocosto,new Object(),this.gastodepreciacioncentrocostoParameterGeneral,this.gastodepreciacioncentrocostoReturnGeneral);
			
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
			
			


			
			GastoDepreciacionCentroCostoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.gastodepreciacioncentrocosto,new Object(),this.gastodepreciacioncentrocostoParameterGeneral,this.gastodepreciacioncentrocostoReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GastoDepreciacionCentroCostoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GastoDepreciacionCentroCostoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GastoDepreciacionCentroCostoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaGastoDepreciacionCentroCostoActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.gastodepreciacioncentrocosto);
			
			this.actualizarInformacion("INFO_PADRE",false,this.gastodepreciacioncentrocosto);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GastoDepreciacionCentroCostoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.gastodepreciacioncentrocosto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.gastodepreciacioncentrocosto);
				
				GastoDepreciacionCentroCostoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.gastodepreciacioncentrocosto,new Object(),this.gastodepreciacioncentrocostoParameterGeneral,this.gastodepreciacioncentrocostoReturnGeneral);
								
				
				


				
				GastoDepreciacionCentroCostoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.gastodepreciacioncentrocosto,new Object(),this.gastodepreciacioncentrocostoParameterGeneral,this.gastodepreciacioncentrocostoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(GastoDepreciacionCentroCosto.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",GastoDepreciacionCentroCosto.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GastoDepreciacionCentroCostoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaGastoDepreciacionCentroCostoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosGastoDepreciacionCentroCosto.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.gastodepreciacioncentrocostoAnterior =(GastoDepreciacionCentroCosto) this.gastodepreciacioncentrocostoLogic.getGastoDepreciacionCentroCostos().toArray()[this.jTableDatosGastoDepreciacionCentroCosto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.gastodepreciacioncentrocostoAnterior =(GastoDepreciacionCentroCosto) this.gastodepreciacioncentrocostos.toArray()[this.jTableDatosGastoDepreciacionCentroCosto.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GastoDepreciacionCentroCostoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaGastoDepreciacionCentroCostoActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.gastodepreciacioncentrocosto);
			
			this.actualizarInformacion("INFO_PADRE",false,this.gastodepreciacioncentrocosto);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GastoDepreciacionCentroCostoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaGastoDepreciacionCentroCostoActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.gastodepreciacioncentrocosto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.gastodepreciacioncentrocosto);
				
				GastoDepreciacionCentroCostoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.gastodepreciacioncentrocosto,new Object(),this.gastodepreciacioncentrocostoParameterGeneral,this.gastodepreciacioncentrocostoReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosGastoDepreciacionCentroCosto")) {
					jCheckBoxSeleccionarTodosGastoDepreciacionCentroCostoItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosGastoDepreciacionCentroCosto")) {
					jCheckBoxSeleccionadosGastoDepreciacionCentroCostoItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarGastoDepreciacionCentroCosto")) {
					
				}
				
				


				
				
				GastoDepreciacionCentroCostoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.gastodepreciacioncentrocosto,new Object(),this.gastodepreciacioncentrocostoParameterGeneral,this.gastodepreciacioncentrocostoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(GastoDepreciacionCentroCosto.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",GastoDepreciacionCentroCosto.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GastoDepreciacionCentroCostoConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.gastodepreciacioncentrocosto);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.gastodepreciacioncentrocosto);
				
				GastoDepreciacionCentroCostoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.gastodepreciacioncentrocosto,new Object(),this.gastodepreciacioncentrocostoParameterGeneral,this.gastodepreciacioncentrocostoReturnGeneral);
												
				
				


				
				
				GastoDepreciacionCentroCostoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.gastodepreciacioncentrocosto,new Object(),this.gastodepreciacioncentrocostoParameterGeneral,this.gastodepreciacioncentrocostoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(GastoDepreciacionCentroCosto.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",GastoDepreciacionCentroCosto.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GastoDepreciacionCentroCostoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaGastoDepreciacionCentroCostoActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosGastoDepreciacionCentroCosto.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.gastodepreciacioncentrocostoAnterior =(GastoDepreciacionCentroCosto) this.gastodepreciacioncentrocostoLogic.getGastoDepreciacionCentroCostos().toArray()[this.jTableDatosGastoDepreciacionCentroCosto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.gastodepreciacioncentrocostoAnterior =(GastoDepreciacionCentroCosto) this.gastodepreciacioncentrocostos.toArray()[this.jTableDatosGastoDepreciacionCentroCosto.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GastoDepreciacionCentroCostoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaGastoDepreciacionCentroCostoActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.gastodepreciacioncentrocosto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.gastodepreciacioncentrocosto);
				
				GastoDepreciacionCentroCostoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.gastodepreciacioncentrocosto,new Object(),this.gastodepreciacioncentrocostoParameterGeneral,this.gastodepreciacioncentrocostoReturnGeneral);
				
				
				GastoDepreciacionCentroCostoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.gastodepreciacioncentrocosto,new Object(),this.gastodepreciacioncentrocostoParameterGeneral,this.gastodepreciacioncentrocostoReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GastoDepreciacionCentroCostoConstantesFunciones.CLASSNAME);
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
			
			GastoDepreciacionCentroCostoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.gastodepreciacioncentrocosto,new Object(),this.gastodepreciacioncentrocostoParameterGeneral,this.gastodepreciacioncentrocostoReturnGeneral);
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
			
			


			
			GastoDepreciacionCentroCostoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.gastodepreciacioncentrocosto,new Object(),this.gastodepreciacioncentrocostoParameterGeneral,this.gastodepreciacioncentrocostoReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GastoDepreciacionCentroCostoConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaGastoDepreciacionCentroCostoActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.gastodepreciacioncentrocosto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.gastodepreciacioncentrocosto);
				
				GastoDepreciacionCentroCostoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.gastodepreciacioncentrocosto,new Object(),this.gastodepreciacioncentrocostoParameterGeneral,this.gastodepreciacioncentrocostoReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				GastoDepreciacionCentroCostoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.gastodepreciacioncentrocosto,new Object(),this.gastodepreciacioncentrocostoParameterGeneral,this.gastodepreciacioncentrocostoReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(GastoDepreciacionCentroCosto.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",GastoDepreciacionCentroCosto.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GastoDepreciacionCentroCostoConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.gastodepreciacioncentrocosto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.gastodepreciacioncentrocosto);
				
				GastoDepreciacionCentroCostoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.gastodepreciacioncentrocosto,new Object(),this.gastodepreciacioncentrocostoParameterGeneral,this.gastodepreciacioncentrocostoReturnGeneral);
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
				
				


				
				GastoDepreciacionCentroCostoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.gastodepreciacioncentrocosto,new Object(),this.gastodepreciacioncentrocostoParameterGeneral,this.gastodepreciacioncentrocostoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(GastoDepreciacionCentroCosto.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",GastoDepreciacionCentroCosto.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GastoDepreciacionCentroCostoConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaGastoDepreciacionCentroCostoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosGastoDepreciacionCentroCosto.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.gastodepreciacioncentrocostoAnterior =(GastoDepreciacionCentroCosto) this.gastodepreciacioncentrocostoLogic.getGastoDepreciacionCentroCostos().toArray()[this.jTableDatosGastoDepreciacionCentroCosto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.gastodepreciacioncentrocostoAnterior =(GastoDepreciacionCentroCosto) this.gastodepreciacioncentrocostos.toArray()[this.jTableDatosGastoDepreciacionCentroCosto.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GastoDepreciacionCentroCostoConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				GastoDepreciacionCentroCostoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.gastodepreciacioncentrocosto,new Object(),this.gastodepreciacioncentrocostoParameterGeneral,this.gastodepreciacioncentrocostoReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarGastoDepreciacionCentroCosto")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosGastoDepreciacionCentroCostoListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosGastoDepreciacionCentroCosto.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.gastodepreciacioncentrocosto =(GastoDepreciacionCentroCosto) this.gastodepreciacioncentrocostoLogic.getGastoDepreciacionCentroCostos().toArray()[this.jTableDatosGastoDepreciacionCentroCosto.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.gastodepreciacioncentrocosto =(GastoDepreciacionCentroCosto) this.gastodepreciacioncentrocostos.toArray()[this.jTableDatosGastoDepreciacionCentroCosto.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.gastodepreciacioncentrocosto);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarGastoDepreciacionCentroCosto")) {
				
				}
				
				GastoDepreciacionCentroCostoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.gastodepreciacioncentrocosto,new Object(),this.gastodepreciacioncentrocostoParameterGeneral,this.gastodepreciacioncentrocostoReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GastoDepreciacionCentroCostoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			GastoDepreciacionCentroCostoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.gastodepreciacioncentrocosto,new Object(),this.gastodepreciacioncentrocostoParameterGeneral,this.gastodepreciacioncentrocostoReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarGastoDepreciacionCentroCosto")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosGastoDepreciacionCentroCosto.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarGastoDepreciacionCentroCosto")) {
			
			}
			
			GastoDepreciacionCentroCostoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.gastodepreciacioncentrocosto,new Object(),this.gastodepreciacioncentrocostoParameterGeneral,this.gastodepreciacioncentrocostoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GastoDepreciacionCentroCostoConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessGastoDepreciacionCentroCosto();
			
			GastoDepreciacionCentroCostoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.gastodepreciacioncentrocosto,new Object(),this.gastodepreciacioncentrocostoParameterGeneral,this.gastodepreciacioncentrocostoReturnGeneral);
			
			if(sTipo.equals("NuevoGastoDepreciacionCentroCosto")) {
				jButtonNuevoGastoDepreciacionCentroCostoActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarGastoDepreciacionCentroCosto")) {
				jButtonDuplicarGastoDepreciacionCentroCostoActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarGastoDepreciacionCentroCosto")) {
				jButtonCopiarGastoDepreciacionCentroCostoActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormGastoDepreciacionCentroCosto")) {
				jButtonVerFormGastoDepreciacionCentroCostoActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesGastoDepreciacionCentroCosto")) {
				jButtonNuevoGastoDepreciacionCentroCostoActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarGastoDepreciacionCentroCosto")) {
				jButtonModificarGastoDepreciacionCentroCostoActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarGastoDepreciacionCentroCosto")) {
				jButtonActualizarGastoDepreciacionCentroCostoActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarGastoDepreciacionCentroCosto")) {
				jButtonEliminarGastoDepreciacionCentroCostoActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaGastoDepreciacionCentroCosto")) {
				jButtonGuardarCambiosGastoDepreciacionCentroCostoActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarGastoDepreciacionCentroCosto")) {
				jButtonCancelarGastoDepreciacionCentroCostoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarGastoDepreciacionCentroCosto")) {
				jButtonCerrarGastoDepreciacionCentroCostoActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosGastoDepreciacionCentroCosto")) {
				jButtonGuardarCambiosGastoDepreciacionCentroCostoActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosGastoDepreciacionCentroCosto")) {
				jButtonNuevoGuardarCambiosGastoDepreciacionCentroCostoActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByGastoDepreciacionCentroCosto")) {
				jButtonAbrirOrderByGastoDepreciacionCentroCostoActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionGastoDepreciacionCentroCosto")) {
				jButtonRecargarInformacionGastoDepreciacionCentroCostoActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresGastoDepreciacionCentroCosto")) {
				jButtonAnterioresGastoDepreciacionCentroCostoActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesGastoDepreciacionCentroCosto")) {
				jButtonSiguientesGastoDepreciacionCentroCostoActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idGastoDepreciacionCentroCostoBusqueda")) {
				this.jButtonidGastoDepreciacionCentroCostoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaGastoDepreciacionCentroCostoUpdate")) {
				this.jButtonid_empresaGastoDepreciacionCentroCostoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaGastoDepreciacionCentroCostoBusqueda")) {
				this.jButtonid_empresaGastoDepreciacionCentroCostoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalGastoDepreciacionCentroCostoUpdate")) {
				this.jButtonid_sucursalGastoDepreciacionCentroCostoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalGastoDepreciacionCentroCostoBusqueda")) {
				this.jButtonid_sucursalGastoDepreciacionCentroCostoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_centro_costoGastoDepreciacionCentroCosto")) {
				this.jButtonid_centro_costoGastoDepreciacionCentroCostoActionPerformed(evt);
			}
			//BUSQUEDA ARBOL CAMPO
			else if(sTipo.equals("id_centro_costoGastoDepreciacionCentroCostoArbol")) {
				this.abrirFrameTreeCentroCosto("BUSQUEDA_FK");
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_centro_costoGastoDepreciacionCentroCostoUpdate")) {
				this.jButtonid_centro_costoGastoDepreciacionCentroCostoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_centro_costoGastoDepreciacionCentroCostoBusqueda")) {
				this.jButtonid_centro_costoGastoDepreciacionCentroCostoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_detalle_activo_fijoGastoDepreciacionCentroCostoUpdate")) {
				this.jButtonid_detalle_activo_fijoGastoDepreciacionCentroCostoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_detalle_activo_fijoGastoDepreciacionCentroCostoBusqueda")) {
				this.jButtonid_detalle_activo_fijoGastoDepreciacionCentroCostoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_cuenta_contableGastoDepreciacionCentroCosto")) {
				this.jButtonid_cuenta_contableGastoDepreciacionCentroCostoActionPerformed(evt);
			}
			//BUSQUEDA ARBOL CAMPO
			else if(sTipo.equals("id_cuenta_contableGastoDepreciacionCentroCostoArbol")) {
				this.abrirFrameTreeCuentaContable("BUSQUEDA_FK");
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_cuenta_contableGastoDepreciacionCentroCostoUpdate")) {
				this.jButtonid_cuenta_contableGastoDepreciacionCentroCostoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_cuenta_contableGastoDepreciacionCentroCostoBusqueda")) {
				this.jButtonid_cuenta_contableGastoDepreciacionCentroCostoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("porcentajeGastoDepreciacionCentroCostoBusqueda")) {
				this.jButtonporcentajeGastoDepreciacionCentroCostoBusquedaActionPerformed(evt);
			}
			
			GastoDepreciacionCentroCostoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.gastodepreciacioncentrocosto,new Object(),this.gastodepreciacioncentrocostoParameterGeneral,this.gastodepreciacioncentrocostoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GastoDepreciacionCentroCostoConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessGastoDepreciacionCentroCosto();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			GastoDepreciacionCentroCostoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.gastodepreciacioncentrocosto,new Object(),this.gastodepreciacioncentrocostoParameterGeneral,this.gastodepreciacioncentrocostoReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameGastoDepreciacionCentroCosto")) {
				closingInternalFrameGastoDepreciacionCentroCosto();
				
			} else if(sTipo.equals("jButtonCancelarGastoDepreciacionCentroCosto")) {
				JInternalFrameBase jInternalFrameDetalleFormGastoDepreciacionCentroCosto = (JInternalFrameBase)evt.getSource();
	            	
	            GastoDepreciacionCentroCostoBeanSwingJInternalFrame jInternalFrameParent=(GastoDepreciacionCentroCostoBeanSwingJInternalFrame)jInternalFrameDetalleFormGastoDepreciacionCentroCosto.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarGastoDepreciacionCentroCostoActionPerformed(null);
			}
			
			GastoDepreciacionCentroCostoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.gastodepreciacioncentrocosto,new Object(),this.gastodepreciacioncentrocostoParameterGeneral,this.gastodepreciacioncentrocostoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GastoDepreciacionCentroCostoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormGastoDepreciacionCentroCosto(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormGastoDepreciacionCentroCosto(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormGastoDepreciacionCentroCosto(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.gastodepreciacioncentrocosto)) {
			if(!esControlTabla) {
				if(GastoDepreciacionCentroCostoJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualGastoDepreciacionCentroCosto(this.gastodepreciacioncentrocosto,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysGastoDepreciacionCentroCosto(this.gastodepreciacioncentrocosto);			
				}
				
				if(this.gastodepreciacioncentrocostoSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualGastoDepreciacionCentroCosto(this.gastodepreciacioncentrocosto,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.gastodepreciacioncentrocostoReturnGeneral=gastodepreciacioncentrocostoLogic.procesarEventosGastoDepreciacionCentroCostosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.gastodepreciacioncentrocostoLogic.getGastoDepreciacionCentroCostos(),this.gastodepreciacioncentrocosto,this.gastodepreciacioncentrocostoParameterGeneral,this.isEsNuevoGastoDepreciacionCentroCosto,classes);//this.gastodepreciacioncentrocostoLogic.getGastoDepreciacionCentroCosto()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanGastoDepreciacionCentroCosto(this.gastodepreciacioncentrocostoReturnGeneral,this.gastodepreciacioncentrocostoBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.gastodepreciacioncentrocostoSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanGastoDepreciacionCentroCosto(classes,this.gastodepreciacioncentrocostoReturnGeneral,this.gastodepreciacioncentrocostoBean,false);
					}
						
					if(this.gastodepreciacioncentrocostoReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyGastoDepreciacionCentroCosto(this.gastodepreciacioncentrocostoReturnGeneral.getGastoDepreciacionCentroCosto());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioGastoDepreciacionCentroCosto(this.gastodepreciacioncentrocostoReturnGeneral.getGastoDepreciacionCentroCosto());	
					}
						
					if(this.gastodepreciacioncentrocostoReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioGastoDepreciacionCentroCosto(this.gastodepreciacioncentrocostoReturnGeneral.getGastoDepreciacionCentroCosto(),classes);//this.gastodepreciacioncentrocostoBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioGastoDepreciacionCentroCosto(this.gastodepreciacioncentrocosto,classes);//this.gastodepreciacioncentrocostoBean);									
				}
			
				if(GastoDepreciacionCentroCostoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualGastoDepreciacionCentroCosto(this.gastodepreciacioncentrocosto,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysGastoDepreciacionCentroCosto(this.gastodepreciacioncentrocosto);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.gastodepreciacioncentrocostoAnterior!=null) {
						this.gastodepreciacioncentrocosto=this.gastodepreciacioncentrocostoAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.gastodepreciacioncentrocostoReturnGeneral=gastodepreciacioncentrocostoLogic.procesarEventosGastoDepreciacionCentroCostosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.gastodepreciacioncentrocostoLogic.getGastoDepreciacionCentroCostos(),this.gastodepreciacioncentrocosto,this.gastodepreciacioncentrocostoParameterGeneral,this.isEsNuevoGastoDepreciacionCentroCosto,classes);//this.gastodepreciacioncentrocostoLogic.getGastoDepreciacionCentroCosto()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.gastodepreciacioncentrocostoSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.gastodepreciacioncentrocostoSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.gastodepreciacioncentrocostoReturnGeneral.getGastoDepreciacionCentroCosto(),gastodepreciacioncentrocostoLogic.getGastoDepreciacionCentroCostos());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.gastodepreciacioncentrocostoReturnGeneral.getGastoDepreciacionCentroCosto(),this.gastodepreciacioncentrocostos);
				}
				//ARCHITECTURE
				
				//this.jTableDatosGastoDepreciacionCentroCosto.repaint();
				
				//((AbstractTableModel) this.jTableDatosGastoDepreciacionCentroCosto.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosGastoDepreciacionCentroCosto();
			}
		}
	}
	
	public void actualizarVisualTableDatosGastoDepreciacionCentroCosto() throws Exception {
		
		GastoDepreciacionCentroCostoModel gastodepreciacioncentrocostoModel=(GastoDepreciacionCentroCostoModel)this.jTableDatosGastoDepreciacionCentroCosto.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			gastodepreciacioncentrocostoModel.gastodepreciacioncentrocostos=this.gastodepreciacioncentrocostoLogic.getGastoDepreciacionCentroCostos();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			gastodepreciacioncentrocostoModel.gastodepreciacioncentrocostos=this.gastodepreciacioncentrocostos;
		}
		
		
		((GastoDepreciacionCentroCostoModel) this.jTableDatosGastoDepreciacionCentroCosto.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaGastoDepreciacionCentroCosto() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getgastodepreciacioncentrocostoAnterior(),this.gastodepreciacioncentrocostoLogic.getGastoDepreciacionCentroCostos());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getgastodepreciacioncentrocostoAnterior(),this.gastodepreciacioncentrocostos);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosGastoDepreciacionCentroCosto();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioGastoDepreciacionCentroCosto(GastoDepreciacionCentroCosto gastodepreciacioncentrocosto,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GastoDepreciacionCentroCostoConstantesFunciones.CLASSNAME);
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
										
				GastoDepreciacionCentroCostoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.gastodepreciacioncentrocosto,new Object(),generalEntityParameterGeneral,this.gastodepreciacioncentrocostoReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.gastodepreciacioncentrocostoSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=GastoDepreciacionCentroCostoConstantesFunciones.getClassesRelationshipsOfGastoDepreciacionCentroCosto(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=GastoDepreciacionCentroCostoConstantesFunciones.getClassesRelationshipsFromStringsOfGastoDepreciacionCentroCosto(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormGastoDepreciacionCentroCosto(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				GastoDepreciacionCentroCostoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.gastodepreciacioncentrocosto,new Object(),generalEntityParameterGeneral,this.gastodepreciacioncentrocostoReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GastoDepreciacionCentroCostoConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioGastoDepreciacionCentroCosto(GastoDepreciacionCentroCostoBean gastodepreciacioncentrocostoBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GastoDepreciacionCentroCostoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanGastoDepreciacionCentroCosto(ArrayList<Classe> classes,GastoDepreciacionCentroCostoReturnGeneral gastodepreciacioncentrocostoReturnGeneral,GastoDepreciacionCentroCostoBean gastodepreciacioncentrocostoBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualGastoDepreciacionCentroCosto(GastoDepreciacionCentroCosto gastodepreciacioncentrocosto,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.gastodepreciacioncentrocosto)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto = new GastoDepreciacionCentroCostoDetalleFormJInternalFrame(jDesktopPane,this.gastodepreciacioncentrocostoSessionBean.getConGuardarRelaciones(),this.gastodepreciacioncentrocostoSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto);
		this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto.setVisible(false);
		this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto.setSelected(false);						
		
		this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto.gastodepreciacioncentrocostoLogic=this.gastodepreciacioncentrocostoLogic;
		
		this.cargarCombosFrameForeignKeyGastoDepreciacionCentroCosto("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleGastoDepreciacionCentroCosto();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleGastoDepreciacionCentroCosto();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyGastoDepreciacionCentroCosto("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyGastoDepreciacionCentroCosto();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarGastoDepreciacionCentroCosto"));
		
		this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto.jButtonModificarGastoDepreciacionCentroCosto.addActionListener(new ButtonActionListener(this,"ModificarGastoDepreciacionCentroCosto"));

		
		this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto.jButtonModificarToolBarGastoDepreciacionCentroCosto.addActionListener(new ButtonActionListener(this,"ModificarToolBarGastoDepreciacionCentroCosto"));
					
		this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto.jMenuItemModificarGastoDepreciacionCentroCosto.addActionListener(new ButtonActionListener(this,"MenuItemModificarGastoDepreciacionCentroCosto"));		
		
		
		
		this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto.jButtonActualizarGastoDepreciacionCentroCosto.addActionListener (new ButtonActionListener(this,"ActualizarGastoDepreciacionCentroCosto"));
		
		
		this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto.jButtonActualizarToolBarGastoDepreciacionCentroCosto.addActionListener(new ButtonActionListener(this,"ActualizarToolBarGastoDepreciacionCentroCosto"));
						
		this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto.jMenuItemActualizarGastoDepreciacionCentroCosto.addActionListener (new ButtonActionListener(this,"MenuItemActualizarGastoDepreciacionCentroCosto"));		
		
		
		
		this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto.jButtonEliminarGastoDepreciacionCentroCosto.addActionListener (new ButtonActionListener(this,"EliminarGastoDepreciacionCentroCosto"));
		
		
		this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto.jButtonEliminarToolBarGastoDepreciacionCentroCosto.addActionListener (new ButtonActionListener(this,"EliminarToolBarGastoDepreciacionCentroCosto"));
								
		this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto.jMenuItemEliminarGastoDepreciacionCentroCosto.addActionListener (new ButtonActionListener(this,"MenuItemEliminarGastoDepreciacionCentroCosto"));		
		
		
		
		this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto.jButtonCancelarGastoDepreciacionCentroCosto.addActionListener (new ButtonActionListener(this,"CancelarGastoDepreciacionCentroCosto"));
		
		
		this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto.jButtonCancelarToolBarGastoDepreciacionCentroCosto.addActionListener (new ButtonActionListener(this,"CancelarToolBarGastoDepreciacionCentroCosto"));
					
		this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto.jMenuItemCancelarGastoDepreciacionCentroCosto.addActionListener (new ButtonActionListener(this,"MenuItemCancelarGastoDepreciacionCentroCosto"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto.jMenuItemDetalleCerrarGastoDepreciacionCentroCosto.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarGastoDepreciacionCentroCosto"));		
		
		
		
		this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto.jButtonGuardarCambiosToolBarGastoDepreciacionCentroCosto.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarGastoDepreciacionCentroCosto"));
		
		
		
		this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto.jButtonGuardarCambiosToolBarGastoDepreciacionCentroCosto.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarGastoDepreciacionCentroCosto"));
		
		
		
		this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto.jComboBoxTiposAccionesFormularioGastoDepreciacionCentroCosto.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioGastoDepreciacionCentroCosto"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto.jButtonidGastoDepreciacionCentroCostoBusqueda.addActionListener(new ButtonActionListener(this,"idGastoDepreciacionCentroCostoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto.jButtonid_empresaGastoDepreciacionCentroCostoUpdate.addActionListener(new ButtonActionListener(this,"id_empresaGastoDepreciacionCentroCostoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto.jButtonid_empresaGastoDepreciacionCentroCostoBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaGastoDepreciacionCentroCostoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto.jButtonid_sucursalGastoDepreciacionCentroCostoUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalGastoDepreciacionCentroCostoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto.jButtonid_sucursalGastoDepreciacionCentroCostoBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalGastoDepreciacionCentroCostoBusqueda"));
		//jButtonid_centro_costoGastoDepreciacionCentroCosto.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_centro_costoGastoDepreciacionCentroCostoActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto.jButtonid_centro_costoGastoDepreciacionCentroCosto.addActionListener(new ButtonActionListener(this,"id_centro_costoGastoDepreciacionCentroCosto"));
		//jButtonid_centro_costoGastoDepreciacionCentroCostoArbol.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			abrirFrameTreeCentroCosto("BUSQUEDA_FK");
		//		}
		//	}
		//);

		//BUSQUEDA ARBOL CAMPO
		this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto.jButtonid_centro_costoGastoDepreciacionCentroCostoArbol.addActionListener(new ButtonActionListener(this,"id_centro_costoGastoDepreciacionCentroCostoArbol"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto.jButtonid_centro_costoGastoDepreciacionCentroCostoUpdate.addActionListener(new ButtonActionListener(this,"id_centro_costoGastoDepreciacionCentroCostoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto.jButtonid_centro_costoGastoDepreciacionCentroCostoBusqueda.addActionListener(new ButtonActionListener(this,"id_centro_costoGastoDepreciacionCentroCostoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto.jButtonid_detalle_activo_fijoGastoDepreciacionCentroCostoUpdate.addActionListener(new ButtonActionListener(this,"id_detalle_activo_fijoGastoDepreciacionCentroCostoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto.jButtonid_detalle_activo_fijoGastoDepreciacionCentroCostoBusqueda.addActionListener(new ButtonActionListener(this,"id_detalle_activo_fijoGastoDepreciacionCentroCostoBusqueda"));
		//jButtonid_cuenta_contableGastoDepreciacionCentroCosto.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_cuenta_contableGastoDepreciacionCentroCostoActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto.jButtonid_cuenta_contableGastoDepreciacionCentroCosto.addActionListener(new ButtonActionListener(this,"id_cuenta_contableGastoDepreciacionCentroCosto"));
		//jButtonid_cuenta_contableGastoDepreciacionCentroCostoArbol.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			abrirFrameTreeCuentaContable("BUSQUEDA_FK");
		//		}
		//	}
		//);

		//BUSQUEDA ARBOL CAMPO
		this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto.jButtonid_cuenta_contableGastoDepreciacionCentroCostoArbol.addActionListener(new ButtonActionListener(this,"id_cuenta_contableGastoDepreciacionCentroCostoArbol"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto.jButtonid_cuenta_contableGastoDepreciacionCentroCostoUpdate.addActionListener(new ButtonActionListener(this,"id_cuenta_contableGastoDepreciacionCentroCostoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto.jButtonid_cuenta_contableGastoDepreciacionCentroCostoBusqueda.addActionListener(new ButtonActionListener(this,"id_cuenta_contableGastoDepreciacionCentroCostoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto.jButtonporcentajeGastoDepreciacionCentroCostoBusqueda.addActionListener(new ButtonActionListener(this,"porcentajeGastoDepreciacionCentroCostoBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto.jTabbedPaneRelacionesGastoDepreciacionCentroCosto.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesGastoDepreciacionCentroCosto"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameGastoDepreciacionCentroCosto"));
		
		if(this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarGastoDepreciacionCentroCosto"));
		}
		
		this.jTableDatosGastoDepreciacionCentroCosto.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarGastoDepreciacionCentroCosto"));
		
		this.jTableDatosGastoDepreciacionCentroCosto.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarGastoDepreciacionCentroCosto"));
		
		this.jButtonNuevoGastoDepreciacionCentroCosto.addActionListener(new ButtonActionListener(this,"NuevoGastoDepreciacionCentroCosto"));
		
		this.jButtonDuplicarGastoDepreciacionCentroCosto.addActionListener(new ButtonActionListener(this,"DuplicarGastoDepreciacionCentroCosto"));
		
		this.jButtonCopiarGastoDepreciacionCentroCosto.addActionListener(new ButtonActionListener(this,"CopiarGastoDepreciacionCentroCosto"));
		
		this.jButtonVerFormGastoDepreciacionCentroCosto.addActionListener(new ButtonActionListener(this,"VerFormGastoDepreciacionCentroCosto"));
		
		
		this.jButtonNuevoToolBarGastoDepreciacionCentroCosto.addActionListener(new ButtonActionListener(this,"NuevoToolBarGastoDepreciacionCentroCosto"));
			
		this.jButtonDuplicarToolBarGastoDepreciacionCentroCosto.addActionListener(new ButtonActionListener(this,"DuplicarToolBarGastoDepreciacionCentroCosto"));
			
		this.jMenuItemNuevoGastoDepreciacionCentroCosto.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGastoDepreciacionCentroCosto"));
			
		this.jMenuItemDuplicarGastoDepreciacionCentroCosto.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarGastoDepreciacionCentroCosto"));		
		
		
		this.jButtonNuevoRelacionesGastoDepreciacionCentroCosto.addActionListener (new ButtonActionListener(this,"NuevoRelacionesGastoDepreciacionCentroCosto"));
		
		
		this.jButtonNuevoRelacionesToolBarGastoDepreciacionCentroCosto.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarGastoDepreciacionCentroCosto"));
			
		this.jMenuItemNuevoRelacionesGastoDepreciacionCentroCosto.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesGastoDepreciacionCentroCosto"));		
		
		
		if(this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto.jButtonModificarGastoDepreciacionCentroCosto.addActionListener(new ButtonActionListener(this,"ModificarGastoDepreciacionCentroCosto"));
		}
		
		
		if(this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto.jButtonModificarToolBarGastoDepreciacionCentroCosto.addActionListener(new ButtonActionListener(this,"ModificarToolBarGastoDepreciacionCentroCosto"));
			
			this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto.jMenuItemModificarGastoDepreciacionCentroCosto.addActionListener(new ButtonActionListener(this,"MenuItemModificarGastoDepreciacionCentroCosto"));		
		}
		
		
		if(this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto.jButtonActualizarGastoDepreciacionCentroCosto.addActionListener (new ButtonActionListener(this,"ActualizarGastoDepreciacionCentroCosto"));
		}
		
		
		if(this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto.jButtonActualizarToolBarGastoDepreciacionCentroCosto.addActionListener(new ButtonActionListener(this,"ActualizarToolBarGastoDepreciacionCentroCosto"));
				
			this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto.jMenuItemActualizarGastoDepreciacionCentroCosto.addActionListener (new ButtonActionListener(this,"MenuItemActualizarGastoDepreciacionCentroCosto"));		
		}
		
		
		if(this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto.jButtonEliminarGastoDepreciacionCentroCosto.addActionListener (new ButtonActionListener(this,"EliminarGastoDepreciacionCentroCosto"));
		}
		
		
		if(this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto.jButtonEliminarToolBarGastoDepreciacionCentroCosto.addActionListener (new ButtonActionListener(this,"EliminarToolBarGastoDepreciacionCentroCosto"));
						
			this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto.jMenuItemEliminarGastoDepreciacionCentroCosto.addActionListener (new ButtonActionListener(this,"MenuItemEliminarGastoDepreciacionCentroCosto"));		
		}
		
		
		if(this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto.jButtonCancelarGastoDepreciacionCentroCosto.addActionListener (new ButtonActionListener(this,"CancelarGastoDepreciacionCentroCosto"));
		}
		
		
		if(this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto.jButtonCancelarToolBarGastoDepreciacionCentroCosto.addActionListener (new ButtonActionListener(this,"CancelarToolBarGastoDepreciacionCentroCosto"));
			
			this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto.jMenuItemCancelarGastoDepreciacionCentroCosto.addActionListener (new ButtonActionListener(this,"MenuItemCancelarGastoDepreciacionCentroCosto"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarGastoDepreciacionCentroCosto.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarGastoDepreciacionCentroCosto"));		
		
		
		this.jButtonCerrarGastoDepreciacionCentroCosto.addActionListener (new ButtonActionListener(this,"CerrarGastoDepreciacionCentroCosto"));
		
		
		this.jButtonCerrarToolBarGastoDepreciacionCentroCosto.addActionListener (new ButtonActionListener(this,"CerrarToolBarGastoDepreciacionCentroCosto"));
			
		this.jMenuItemCerrarGastoDepreciacionCentroCosto.addActionListener (new ButtonActionListener(this,"MenuItemCerrarGastoDepreciacionCentroCosto"));
			
		if(this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto.jMenuItemDetalleCerrarGastoDepreciacionCentroCosto.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarGastoDepreciacionCentroCosto"));		
		}
		
		
		if(this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto.jButtonGuardarCambiosGastoDepreciacionCentroCosto.addActionListener (new ButtonActionListener(this,"GuardarCambiosGastoDepreciacionCentroCosto"));
		}
		
		
		if(this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto.jButtonGuardarCambiosToolBarGastoDepreciacionCentroCosto.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarGastoDepreciacionCentroCosto"));
		}
		
		this.jButtonCopiarToolBarGastoDepreciacionCentroCosto.addActionListener (new ButtonActionListener(this,"CopiarToolBarGastoDepreciacionCentroCosto"));
			
		this.jButtonVerFormToolBarGastoDepreciacionCentroCosto.addActionListener (new ButtonActionListener(this,"VerFormToolBarGastoDepreciacionCentroCosto"));
		
		this.jMenuItemGuardarCambiosGastoDepreciacionCentroCosto.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosGastoDepreciacionCentroCosto"));
			
		this.jMenuItemCopiarGastoDepreciacionCentroCosto.addActionListener (new ButtonActionListener(this,"MenuItemCopiarGastoDepreciacionCentroCosto"));		
		
		this.jMenuItemVerFormGastoDepreciacionCentroCosto.addActionListener (new ButtonActionListener(this,"MenuItemVerFormGastoDepreciacionCentroCosto"));		
		
		
		this.jButtonGuardarCambiosTablaGastoDepreciacionCentroCosto.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaGastoDepreciacionCentroCosto"));
		
		
		this.jButtonGuardarCambiosTablaToolBarGastoDepreciacionCentroCosto.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarGastoDepreciacionCentroCosto"));
			
		this.jMenuItemGuardarCambiosTablaGastoDepreciacionCentroCosto.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaGastoDepreciacionCentroCosto"));		
		
		
		
		this.jButtonRecargarInformacionGastoDepreciacionCentroCosto.addActionListener (new ButtonActionListener(this,"RecargarInformacionGastoDepreciacionCentroCosto"));
					
		this.jButtonRecargarInformacionToolBarGastoDepreciacionCentroCosto.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarGastoDepreciacionCentroCosto"));
		
		this.jMenuItemRecargarInformacionGastoDepreciacionCentroCosto.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionGastoDepreciacionCentroCosto"));		
		
		
		
		this.jButtonAnterioresGastoDepreciacionCentroCosto.addActionListener (new ButtonActionListener(this,"AnterioresGastoDepreciacionCentroCosto"));
		
		
		this.jButtonAnterioresToolBarGastoDepreciacionCentroCosto.addActionListener (new ButtonActionListener(this,"AnterioresToolBarGastoDepreciacionCentroCosto"));
		
		this.jMenuItemAnterioresGastoDepreciacionCentroCosto.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresGastoDepreciacionCentroCosto"));		
		
		
		this.jButtonSiguientesGastoDepreciacionCentroCosto.addActionListener (new ButtonActionListener(this,"SiguientesGastoDepreciacionCentroCosto"));
		
		
		this.jButtonSiguientesToolBarGastoDepreciacionCentroCosto.addActionListener (new ButtonActionListener(this,"SiguientesToolBarGastoDepreciacionCentroCosto"));
			
		this.jMenuItemSiguientesGastoDepreciacionCentroCosto.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesGastoDepreciacionCentroCosto"));
			
		this.jMenuItemAbrirOrderByGastoDepreciacionCentroCosto.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByGastoDepreciacionCentroCosto"));
			
		this.jMenuItemMostrarOcultarGastoDepreciacionCentroCosto.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarGastoDepreciacionCentroCosto"));
			
		this.jMenuItemDetalleAbrirOrderByGastoDepreciacionCentroCosto.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByGastoDepreciacionCentroCosto"));
			
		this.jMenuItemDetalleMostarOcultarGastoDepreciacionCentroCosto.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarGastoDepreciacionCentroCosto"));		
		
		
		this.jButtonNuevoGuardarCambiosGastoDepreciacionCentroCosto.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosGastoDepreciacionCentroCosto"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarGastoDepreciacionCentroCosto.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarGastoDepreciacionCentroCosto"));
			
		this.jMenuItemNuevoGuardarCambiosGastoDepreciacionCentroCosto.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosGastoDepreciacionCentroCosto"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosGastoDepreciacionCentroCosto.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosGastoDepreciacionCentroCosto"));

		this.jCheckBoxSeleccionadosGastoDepreciacionCentroCosto.addItemListener(new CheckBoxItemListener(this,"SeleccionadosGastoDepreciacionCentroCosto"));
		
		if(this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto.jComboBoxTiposAccionesFormularioGastoDepreciacionCentroCosto.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioGastoDepreciacionCentroCosto"));
		}
		
		
		this.jComboBoxTiposRelacionesGastoDepreciacionCentroCosto.addActionListener (new ButtonActionListener(this,"TiposRelacionesGastoDepreciacionCentroCosto"));
			
		this.jComboBoxTiposAccionesGastoDepreciacionCentroCosto.addActionListener (new ButtonActionListener(this,"TiposAccionesGastoDepreciacionCentroCosto"));
					
		this.jComboBoxTiposSeleccionarGastoDepreciacionCentroCosto.addActionListener (new ButtonActionListener(this,"TiposSeleccionarGastoDepreciacionCentroCosto"));
			
		this.jTextFieldValorCampoGeneralGastoDepreciacionCentroCosto.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralGastoDepreciacionCentroCosto"));		
		
		
		if(this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto.jButtonidGastoDepreciacionCentroCostoBusqueda.addActionListener(new ButtonActionListener(this,"idGastoDepreciacionCentroCostoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto.jButtonid_empresaGastoDepreciacionCentroCostoUpdate.addActionListener(new ButtonActionListener(this,"id_empresaGastoDepreciacionCentroCostoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto.jButtonid_empresaGastoDepreciacionCentroCostoBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaGastoDepreciacionCentroCostoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto.jButtonid_sucursalGastoDepreciacionCentroCostoUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalGastoDepreciacionCentroCostoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto.jButtonid_sucursalGastoDepreciacionCentroCostoBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalGastoDepreciacionCentroCostoBusqueda"));
		//jButtonid_centro_costoGastoDepreciacionCentroCosto.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_centro_costoGastoDepreciacionCentroCostoActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto.jButtonid_centro_costoGastoDepreciacionCentroCosto.addActionListener(new ButtonActionListener(this,"id_centro_costoGastoDepreciacionCentroCosto"));
		//jButtonid_centro_costoGastoDepreciacionCentroCostoArbol.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			abrirFrameTreeCentroCosto("BUSQUEDA_FK");
		//		}
		//	}
		//);

		//BUSQUEDA ARBOL CAMPO
		this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto.jButtonid_centro_costoGastoDepreciacionCentroCostoArbol.addActionListener(new ButtonActionListener(this,"id_centro_costoGastoDepreciacionCentroCostoArbol"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto.jButtonid_centro_costoGastoDepreciacionCentroCostoUpdate.addActionListener(new ButtonActionListener(this,"id_centro_costoGastoDepreciacionCentroCostoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto.jButtonid_centro_costoGastoDepreciacionCentroCostoBusqueda.addActionListener(new ButtonActionListener(this,"id_centro_costoGastoDepreciacionCentroCostoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto.jButtonid_detalle_activo_fijoGastoDepreciacionCentroCostoUpdate.addActionListener(new ButtonActionListener(this,"id_detalle_activo_fijoGastoDepreciacionCentroCostoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto.jButtonid_detalle_activo_fijoGastoDepreciacionCentroCostoBusqueda.addActionListener(new ButtonActionListener(this,"id_detalle_activo_fijoGastoDepreciacionCentroCostoBusqueda"));
		//jButtonid_cuenta_contableGastoDepreciacionCentroCosto.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_cuenta_contableGastoDepreciacionCentroCostoActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto.jButtonid_cuenta_contableGastoDepreciacionCentroCosto.addActionListener(new ButtonActionListener(this,"id_cuenta_contableGastoDepreciacionCentroCosto"));
		//jButtonid_cuenta_contableGastoDepreciacionCentroCostoArbol.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			abrirFrameTreeCuentaContable("BUSQUEDA_FK");
		//		}
		//	}
		//);

		//BUSQUEDA ARBOL CAMPO
		this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto.jButtonid_cuenta_contableGastoDepreciacionCentroCostoArbol.addActionListener(new ButtonActionListener(this,"id_cuenta_contableGastoDepreciacionCentroCostoArbol"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto.jButtonid_cuenta_contableGastoDepreciacionCentroCostoUpdate.addActionListener(new ButtonActionListener(this,"id_cuenta_contableGastoDepreciacionCentroCostoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto.jButtonid_cuenta_contableGastoDepreciacionCentroCostoBusqueda.addActionListener(new ButtonActionListener(this,"id_cuenta_contableGastoDepreciacionCentroCostoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto.jButtonporcentajeGastoDepreciacionCentroCostoBusqueda.addActionListener(new ButtonActionListener(this,"porcentajeGastoDepreciacionCentroCostoBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonFK_IdCentroCostoGastoDepreciacionCentroCosto.addActionListener(new ButtonActionListener(this,"FK_IdCentroCostoGastoDepreciacionCentroCosto"));

			this.jButtonBuscarFK_IdCentroCostoid_centro_costoGastoDepreciacionCentroCosto.addActionListener(new ButtonActionListener(this,"id_centro_costoGastoDepreciacionCentroCosto"));

			this.jButtonFK_IdCuentaContableGastoDepreciacionCentroCosto.addActionListener(new ButtonActionListener(this,"FK_IdCuentaContableGastoDepreciacionCentroCosto"));

			this.jButtonBuscarFK_IdCuentaContableid_cuenta_contableGastoDepreciacionCentroCosto.addActionListener(new ButtonActionListener(this,"id_cuenta_contableGastoDepreciacionCentroCosto"));

			this.jButtonFK_IdDetalleActivoFijoGastoDepreciacionCentroCosto.addActionListener(new ButtonActionListener(this,"FK_IdDetalleActivoFijoGastoDepreciacionCentroCosto"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoGastoDepreciacionCentroCosto!=null) {
				this.jInternalFrameReporteDinamicoGastoDepreciacionCentroCosto.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoGastoDepreciacionCentroCosto"));
				this.jInternalFrameReporteDinamicoGastoDepreciacionCentroCosto.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoGastoDepreciacionCentroCosto"));
				this.jInternalFrameReporteDinamicoGastoDepreciacionCentroCosto.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoGastoDepreciacionCentroCosto"));
			}
			
			//this.jButtonCerrarReporteDinamicoGastoDepreciacionCentroCosto.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoGastoDepreciacionCentroCosto"));				
			//this.jButtonGenerarReporteDinamicoGastoDepreciacionCentroCosto.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoGastoDepreciacionCentroCosto"));
			//this.jButtonGenerarExcelReporteDinamicoGastoDepreciacionCentroCosto.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoGastoDepreciacionCentroCosto"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionGastoDepreciacionCentroCosto!=null) {
				this.jInternalFrameImportacionGastoDepreciacionCentroCosto.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionGastoDepreciacionCentroCosto"));
				this.jInternalFrameImportacionGastoDepreciacionCentroCosto.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionGastoDepreciacionCentroCosto"));
				this.jInternalFrameImportacionGastoDepreciacionCentroCosto.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionGastoDepreciacionCentroCosto"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByGastoDepreciacionCentroCosto.addActionListener (new ButtonActionListener(this,"AbrirOrderByGastoDepreciacionCentroCosto"));
			
			this.jButtonAbrirOrderByToolBarGastoDepreciacionCentroCosto.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarGastoDepreciacionCentroCosto"));			
			
			if(this.jInternalFrameOrderByGastoDepreciacionCentroCosto!=null) {
				this.jInternalFrameOrderByGastoDepreciacionCentroCosto.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByGastoDepreciacionCentroCosto"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto.jTabbedPaneRelacionesGastoDepreciacionCentroCosto.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesGastoDepreciacionCentroCosto"));
		
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
            		closingInternalFrameGastoDepreciacionCentroCosto();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormGastoDepreciacionCentroCosto = (JInternalFrameBase)event.getSource();
	            	
	            GastoDepreciacionCentroCostoBeanSwingJInternalFrame jInternalFrameParent=(GastoDepreciacionCentroCostoBeanSwingJInternalFrame)jInternalFrameDetalleFormGastoDepreciacionCentroCosto.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarGastoDepreciacionCentroCostoActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosGastoDepreciacionCentroCosto.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosGastoDepreciacionCentroCostoListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosGastoDepreciacionCentroCosto.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosGastoDepreciacionCentroCosto.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoGastoDepreciacionCentroCosto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGastoDepreciacionCentroCostoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarGastoDepreciacionCentroCosto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGastoDepreciacionCentroCostoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGastoDepreciacionCentroCosto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGastoDepreciacionCentroCostoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoGastoDepreciacionCentroCosto";
		inputMap = this.jButtonNuevoGastoDepreciacionCentroCosto.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoGastoDepreciacionCentroCosto.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoGastoDepreciacionCentroCostoActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesGastoDepreciacionCentroCosto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGastoDepreciacionCentroCostoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarGastoDepreciacionCentroCosto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGastoDepreciacionCentroCostoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesGastoDepreciacionCentroCosto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGastoDepreciacionCentroCostoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesGastoDepreciacionCentroCosto";
		inputMap = this.jButtonNuevoRelacionesGastoDepreciacionCentroCosto.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesGastoDepreciacionCentroCosto.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoGastoDepreciacionCentroCostoActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarGastoDepreciacionCentroCosto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarGastoDepreciacionCentroCostoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarGastoDepreciacionCentroCosto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarGastoDepreciacionCentroCostoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarGastoDepreciacionCentroCosto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarGastoDepreciacionCentroCostoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarGastoDepreciacionCentroCosto";
		inputMap = this.jButtonModificarGastoDepreciacionCentroCosto.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarGastoDepreciacionCentroCosto.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarGastoDepreciacionCentroCostoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarGastoDepreciacionCentroCosto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarGastoDepreciacionCentroCostoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarGastoDepreciacionCentroCosto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarGastoDepreciacionCentroCostoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarGastoDepreciacionCentroCosto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarGastoDepreciacionCentroCostoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarGastoDepreciacionCentroCosto";
		inputMap = this.jButtonActualizarGastoDepreciacionCentroCosto.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarGastoDepreciacionCentroCosto.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarGastoDepreciacionCentroCostoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarGastoDepreciacionCentroCosto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarGastoDepreciacionCentroCostoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarGastoDepreciacionCentroCosto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarGastoDepreciacionCentroCostoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarGastoDepreciacionCentroCosto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarGastoDepreciacionCentroCostoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarGastoDepreciacionCentroCosto";
		inputMap = this.jButtonEliminarGastoDepreciacionCentroCosto.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarGastoDepreciacionCentroCosto.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarGastoDepreciacionCentroCostoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarGastoDepreciacionCentroCosto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarGastoDepreciacionCentroCostoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarGastoDepreciacionCentroCosto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarGastoDepreciacionCentroCostoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarGastoDepreciacionCentroCosto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarGastoDepreciacionCentroCostoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarGastoDepreciacionCentroCosto";
		inputMap = this.jButtonCancelarGastoDepreciacionCentroCosto.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarGastoDepreciacionCentroCosto.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarGastoDepreciacionCentroCostoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarGastoDepreciacionCentroCosto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarGastoDepreciacionCentroCostoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarGastoDepreciacionCentroCosto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarGastoDepreciacionCentroCostoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarGastoDepreciacionCentroCosto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarGastoDepreciacionCentroCostoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarGastoDepreciacionCentroCosto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarGastoDepreciacionCentroCostoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarGastoDepreciacionCentroCostoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarGastoDepreciacionCentroCosto";
		inputMap = this.jButtonCerrarGastoDepreciacionCentroCosto.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarGastoDepreciacionCentroCosto.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarGastoDepreciacionCentroCostoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto.jButtonGuardarCambiosGastoDepreciacionCentroCosto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosGastoDepreciacionCentroCostoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarGastoDepreciacionCentroCosto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosGastoDepreciacionCentroCostoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosGastoDepreciacionCentroCosto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosGastoDepreciacionCentroCostoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaGastoDepreciacionCentroCosto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosGastoDepreciacionCentroCostoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarGastoDepreciacionCentroCosto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosGastoDepreciacionCentroCostoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaGastoDepreciacionCentroCosto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosGastoDepreciacionCentroCostoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosGastoDepreciacionCentroCosto";
		inputMap = this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto.jButtonGuardarCambiosGastoDepreciacionCentroCosto.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto.jButtonGuardarCambiosGastoDepreciacionCentroCosto.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosGastoDepreciacionCentroCostoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionGastoDepreciacionCentroCosto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionGastoDepreciacionCentroCostoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarGastoDepreciacionCentroCosto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionGastoDepreciacionCentroCostoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionGastoDepreciacionCentroCosto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionGastoDepreciacionCentroCostoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresGastoDepreciacionCentroCosto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresGastoDepreciacionCentroCostoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarGastoDepreciacionCentroCosto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresGastoDepreciacionCentroCostoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresGastoDepreciacionCentroCosto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresGastoDepreciacionCentroCostoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesGastoDepreciacionCentroCosto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesGastoDepreciacionCentroCostoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarGastoDepreciacionCentroCosto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesGastoDepreciacionCentroCostoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesGastoDepreciacionCentroCosto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesGastoDepreciacionCentroCostoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosGastoDepreciacionCentroCosto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosGastoDepreciacionCentroCostoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarGastoDepreciacionCentroCosto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosGastoDepreciacionCentroCostoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosGastoDepreciacionCentroCosto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosGastoDepreciacionCentroCostoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosGastoDepreciacionCentroCosto.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosGastoDepreciacionCentroCostoItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesGastoDepreciacionCentroCosto.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesGastoDepreciacionCentroCostoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarGastoDepreciacionCentroCosto.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarGastoDepreciacionCentroCostoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralGastoDepreciacionCentroCosto.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralGastoDepreciacionCentroCostoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto.jButtonidGastoDepreciacionCentroCostoBusqueda.addActionListener(new ButtonActionListener(this,"idGastoDepreciacionCentroCostoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto.jButtonid_empresaGastoDepreciacionCentroCostoUpdate.addActionListener(new ButtonActionListener(this,"id_empresaGastoDepreciacionCentroCostoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto.jButtonid_empresaGastoDepreciacionCentroCostoBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaGastoDepreciacionCentroCostoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto.jButtonid_sucursalGastoDepreciacionCentroCostoUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalGastoDepreciacionCentroCostoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto.jButtonid_sucursalGastoDepreciacionCentroCostoBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalGastoDepreciacionCentroCostoBusqueda"));
		//jButtonid_centro_costoGastoDepreciacionCentroCosto.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_centro_costoGastoDepreciacionCentroCostoActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto.jButtonid_centro_costoGastoDepreciacionCentroCosto.addActionListener(new ButtonActionListener(this,"id_centro_costoGastoDepreciacionCentroCosto"));
		//jButtonid_centro_costoGastoDepreciacionCentroCostoArbol.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			abrirFrameTreeCentroCosto("BUSQUEDA_FK");
		//		}
		//	}
		//);

		//BUSQUEDA ARBOL CAMPO
		this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto.jButtonid_centro_costoGastoDepreciacionCentroCostoArbol.addActionListener(new ButtonActionListener(this,"id_centro_costoGastoDepreciacionCentroCostoArbol"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto.jButtonid_centro_costoGastoDepreciacionCentroCostoUpdate.addActionListener(new ButtonActionListener(this,"id_centro_costoGastoDepreciacionCentroCostoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto.jButtonid_centro_costoGastoDepreciacionCentroCostoBusqueda.addActionListener(new ButtonActionListener(this,"id_centro_costoGastoDepreciacionCentroCostoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto.jButtonid_detalle_activo_fijoGastoDepreciacionCentroCostoUpdate.addActionListener(new ButtonActionListener(this,"id_detalle_activo_fijoGastoDepreciacionCentroCostoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto.jButtonid_detalle_activo_fijoGastoDepreciacionCentroCostoBusqueda.addActionListener(new ButtonActionListener(this,"id_detalle_activo_fijoGastoDepreciacionCentroCostoBusqueda"));
		//jButtonid_cuenta_contableGastoDepreciacionCentroCosto.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_cuenta_contableGastoDepreciacionCentroCostoActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto.jButtonid_cuenta_contableGastoDepreciacionCentroCosto.addActionListener(new ButtonActionListener(this,"id_cuenta_contableGastoDepreciacionCentroCosto"));
		//jButtonid_cuenta_contableGastoDepreciacionCentroCostoArbol.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			abrirFrameTreeCuentaContable("BUSQUEDA_FK");
		//		}
		//	}
		//);

		//BUSQUEDA ARBOL CAMPO
		this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto.jButtonid_cuenta_contableGastoDepreciacionCentroCostoArbol.addActionListener(new ButtonActionListener(this,"id_cuenta_contableGastoDepreciacionCentroCostoArbol"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto.jButtonid_cuenta_contableGastoDepreciacionCentroCostoUpdate.addActionListener(new ButtonActionListener(this,"id_cuenta_contableGastoDepreciacionCentroCostoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto.jButtonid_cuenta_contableGastoDepreciacionCentroCostoBusqueda.addActionListener(new ButtonActionListener(this,"id_cuenta_contableGastoDepreciacionCentroCostoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto.jButtonporcentajeGastoDepreciacionCentroCostoBusqueda.addActionListener(new ButtonActionListener(this,"porcentajeGastoDepreciacionCentroCostoBusqueda"));
		
		
		this.jButtonFK_IdCentroCostoGastoDepreciacionCentroCosto.addActionListener(new ButtonActionListener(this,"FK_IdCentroCostoGastoDepreciacionCentroCosto"));

		this.jButtonBuscarFK_IdCentroCostoid_centro_costoGastoDepreciacionCentroCosto.addActionListener(new ButtonActionListener(this,"id_centro_costoGastoDepreciacionCentroCosto"));

		this.jButtonFK_IdCuentaContableGastoDepreciacionCentroCosto.addActionListener(new ButtonActionListener(this,"FK_IdCuentaContableGastoDepreciacionCentroCosto"));

		this.jButtonBuscarFK_IdCuentaContableid_cuenta_contableGastoDepreciacionCentroCosto.addActionListener(new ButtonActionListener(this,"id_cuenta_contableGastoDepreciacionCentroCosto"));

		this.jButtonFK_IdDetalleActivoFijoGastoDepreciacionCentroCosto.addActionListener(new ButtonActionListener(this,"FK_IdDetalleActivoFijoGastoDepreciacionCentroCosto"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoGastoDepreciacionCentroCosto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoGastoDepreciacionCentroCostoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoGastoDepreciacionCentroCosto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoGastoDepreciacionCentroCostoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoGastoDepreciacionCentroCosto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoGastoDepreciacionCentroCostoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionGastoDepreciacionCentroCosto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionGastoDepreciacionCentroCostoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionGastoDepreciacionCentroCosto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionGastoDepreciacionCentroCostoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionGastoDepreciacionCentroCosto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionGastoDepreciacionCentroCostoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarGastoDepreciacionCentroCostoActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarGastoDepreciacionCentroCosto.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GastoDepreciacionCentroCostoConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosGastoDepreciacionCentroCosto(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(GastoDepreciacionCentroCosto gastodepreciacioncentrocostoAux:this.gastodepreciacioncentrocostoLogic.getGastoDepreciacionCentroCostos()) {
					gastodepreciacioncentrocostoAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(GastoDepreciacionCentroCosto gastodepreciacioncentrocostoAux:gastodepreciacioncentrocostos) {
					gastodepreciacioncentrocostoAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GastoDepreciacionCentroCostoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosGastoDepreciacionCentroCostoItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingGastoDepreciacionCentroCosto(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(GastoDepreciacionCentroCosto gastodepreciacioncentrocostoAux:this.gastodepreciacioncentrocostoLogic.getGastoDepreciacionCentroCostos()) {
						gastodepreciacioncentrocostoAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(GastoDepreciacionCentroCosto gastodepreciacioncentrocostoAux:gastodepreciacioncentrocostos) {
						gastodepreciacioncentrocostoAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(GastoDepreciacionCentroCosto gastodepreciacioncentrocostoAux:this.gastodepreciacioncentrocostoLogic.getGastoDepreciacionCentroCostos()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(GastoDepreciacionCentroCosto gastodepreciacioncentrocostoAux:gastodepreciacioncentrocostos) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaGastoDepreciacionCentroCosto(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosGastoDepreciacionCentroCosto.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosGastoDepreciacionCentroCosto.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosGastoDepreciacionCentroCosto,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GastoDepreciacionCentroCostoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosGastoDepreciacionCentroCostoItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingGastoDepreciacionCentroCosto(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosGastoDepreciacionCentroCosto.getSelectedRows();
			
			GastoDepreciacionCentroCosto gastodepreciacioncentrocostoLocal=new GastoDepreciacionCentroCosto();
			
			//this.seleccionarTodosGastoDepreciacionCentroCosto(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					gastodepreciacioncentrocostoLocal =(GastoDepreciacionCentroCosto) this.gastodepreciacioncentrocostoLogic.getGastoDepreciacionCentroCostos().toArray()[this.jTableDatosGastoDepreciacionCentroCosto.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					gastodepreciacioncentrocostoLocal =(GastoDepreciacionCentroCosto) this.gastodepreciacioncentrocostos.toArray()[this.jTableDatosGastoDepreciacionCentroCosto.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				gastodepreciacioncentrocostoLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(GastoDepreciacionCentroCosto gastodepreciacioncentrocostoAux:this.gastodepreciacioncentrocostoLogic.getGastoDepreciacionCentroCostos()) {
						gastodepreciacioncentrocostoAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(GastoDepreciacionCentroCosto gastodepreciacioncentrocostoAux:gastodepreciacioncentrocostos) {
						gastodepreciacioncentrocostoAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaGastoDepreciacionCentroCosto(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosGastoDepreciacionCentroCosto.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosGastoDepreciacionCentroCosto.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosGastoDepreciacionCentroCosto,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GastoDepreciacionCentroCostoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualGastoDepreciacionCentroCostoItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GastoDepreciacionCentroCostoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarGastoDepreciacionCentroCostoParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GastoDepreciacionCentroCostoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralGastoDepreciacionCentroCostoActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingGastoDepreciacionCentroCosto(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralGastoDepreciacionCentroCosto.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(GastoDepreciacionCentroCosto gastodepreciacioncentrocostoAux:this.gastodepreciacioncentrocostoLogic.getGastoDepreciacionCentroCostos()) {
				
						if(sTipoSeleccionar.equals(GastoDepreciacionCentroCostoConstantesFunciones.LABEL_PORCENTAJE)) {
							existe=true;
							gastodepreciacioncentrocostoAux.setporcentaje(Double.parseDouble(this.sValorCampoGeneral));
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(GastoDepreciacionCentroCosto gastodepreciacioncentrocostoAux:gastodepreciacioncentrocostos) {
					
						if(sTipoSeleccionar.equals(GastoDepreciacionCentroCostoConstantesFunciones.LABEL_PORCENTAJE)) {
							existe=true;
							gastodepreciacioncentrocostoAux.setporcentaje(Double.parseDouble(this.sValorCampoGeneral));
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaGastoDepreciacionCentroCosto(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GastoDepreciacionCentroCostoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesGastoDepreciacionCentroCostoActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingGastoDepreciacionCentroCosto(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioGastoDepreciacionCentroCosto=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesGastoDepreciacionCentroCosto.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto.jComboBoxTiposAccionesFormularioGastoDepreciacionCentroCosto.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteGastoDepreciacionCentroCosto) {				
					conSplash=true;//false;										
					
					//this.startProcessGastoDepreciacionCentroCosto(conSplash);
				
					this.generarReporteGastoDepreciacionCentroCostosSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesGastoDepreciacionCentroCosto.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto.jComboBoxTiposAccionesFormularioGastoDepreciacionCentroCosto.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoGastoDepreciacionCentroCostosSeleccionados();
				//this.jComboBoxTiposAccionesGastoDepreciacionCentroCosto.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoGastoDepreciacionCentroCostosSeleccionados(false);
				//this.jComboBoxTiposAccionesGastoDepreciacionCentroCosto.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoGastoDepreciacionCentroCostosSeleccionados(true);
				//this.jComboBoxTiposAccionesGastoDepreciacionCentroCosto.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessGastoDepreciacionCentroCosto();
				
				this.exportarGastoDepreciacionCentroCostosSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesGastoDepreciacionCentroCosto.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto.jComboBoxTiposAccionesFormularioGastoDepreciacionCentroCosto.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionGastoDepreciacionCentroCostos();
				//this.importarGastoDepreciacionCentroCostos();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesGastoDepreciacionCentroCosto.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto.jComboBoxTiposAccionesFormularioGastoDepreciacionCentroCosto.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessGastoDepreciacionCentroCosto();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelGastoDepreciacionCentroCostosSeleccionados();
				//this.jComboBoxTiposAccionesGastoDepreciacionCentroCosto.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Gasto Depreciacion Centro Costo", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessGastoDepreciacionCentroCosto();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoGastoDepreciacionCentroCosto)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyGastoDepreciacionCentroCosto(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Gasto Depreciacion Centro Costo",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesGastoDepreciacionCentroCosto.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto.jComboBoxTiposAccionesFormularioGastoDepreciacionCentroCosto.setSelectedIndex(0);					
				}	
			} 			
			else if(GastoDepreciacionCentroCostoBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteGastoDepreciacionCentroCosto) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessGastoDepreciacionCentroCosto(conSplash);
					
						//this.actualizarParametrosGeneralGastoDepreciacionCentroCosto();
						
						this.generarReporteProcesoAccionGastoDepreciacionCentroCostosSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesGastoDepreciacionCentroCosto.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto.jComboBoxTiposAccionesFormularioGastoDepreciacionCentroCosto.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(GastoDepreciacionCentroCostoBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Gasto Depreciacion Centro CostoS SELECCIONADOS?", "MANTENIMIENTO DE Gasto Depreciacion Centro Costo", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessGastoDepreciacionCentroCosto();
				
						this.actualizarParametrosGeneralGastoDepreciacionCentroCosto();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.gastodepreciacioncentrocostoReturnGeneral=gastodepreciacioncentrocostoLogic.procesarAccionGastoDepreciacionCentroCostosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.gastodepreciacioncentrocostoLogic.getGastoDepreciacionCentroCostos(),this.gastodepreciacioncentrocostoParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarGastoDepreciacionCentroCostoReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesGastoDepreciacionCentroCosto.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto.jComboBoxTiposAccionesFormularioGastoDepreciacionCentroCosto.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralGastoDepreciacionCentroCosto();
					
					GastoDepreciacionCentroCostoBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarGastoDepreciacionCentroCostoReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesGastoDepreciacionCentroCosto.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto.jComboBoxTiposAccionesFormularioGastoDepreciacionCentroCosto.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,GastoDepreciacionCentroCostoConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessGastoDepreciacionCentroCosto(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesGastoDepreciacionCentroCostoActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessGastoDepreciacionCentroCosto();
			
			if(this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<GastoDepreciacionCentroCosto> gastodepreciacioncentrocostosSeleccionados=new ArrayList<GastoDepreciacionCentroCosto>();		
			GastoDepreciacionCentroCosto gastodepreciacioncentrocosto=new GastoDepreciacionCentroCosto();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingGastoDepreciacionCentroCosto(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesGastoDepreciacionCentroCosto.getSelectedItem();
			
			
			
			
			gastodepreciacioncentrocostosSeleccionados=this.getGastoDepreciacionCentroCostosSeleccionados(true);
			//this.sTipoAccion;
			
			if(gastodepreciacioncentrocostosSeleccionados.size()==1) {
				for(GastoDepreciacionCentroCosto gastodepreciacioncentrocostoAux:gastodepreciacioncentrocostosSeleccionados) {
					gastodepreciacioncentrocosto=gastodepreciacioncentrocostoAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GastoDepreciacionCentroCostoConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessGastoDepreciacionCentroCosto();
			
      		//this.finishProcessGastoDepreciacionCentroCosto(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarGastoDepreciacionCentroCostoReturnGeneral() throws Exception {
		if(this.gastodepreciacioncentrocostoReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.gastodepreciacioncentrocostoReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.gastodepreciacioncentrocostoReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.gastodepreciacioncentrocostoReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.gastodepreciacioncentrocostoReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.gastodepreciacioncentrocostoReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingGastoDepreciacionCentroCosto(false);
		}
		
		if(this.gastodepreciacioncentrocostoReturnGeneral.getConRetornoLista() || this.gastodepreciacioncentrocostoReturnGeneral.getConRetornoObjeto()) {
			if(this.gastodepreciacioncentrocostoReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.gastodepreciacioncentrocostoLogic.setGastoDepreciacionCentroCostos(this.gastodepreciacioncentrocostoReturnGeneral.getGastoDepreciacionCentroCostos());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.gastodepreciacioncentrocostoReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.gastodepreciacioncentrocostoLogic.setGastoDepreciacionCentroCosto(this.gastodepreciacioncentrocostoReturnGeneral.getGastoDepreciacionCentroCosto());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingGastoDepreciacionCentroCosto(false);
		}
	}
	
	public void actualizarParametrosGeneralGastoDepreciacionCentroCosto() throws Exception {
		
		
	}
	
	public ArrayList<GastoDepreciacionCentroCosto> getGastoDepreciacionCentroCostosSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<GastoDepreciacionCentroCosto> gastodepreciacioncentrocostosSeleccionados=new ArrayList<GastoDepreciacionCentroCosto>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioGastoDepreciacionCentroCosto) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(GastoDepreciacionCentroCosto gastodepreciacioncentrocostoAux:gastodepreciacioncentrocostoLogic.getGastoDepreciacionCentroCostos()) {
					if(gastodepreciacioncentrocostoAux.getIsSelected()) {
						gastodepreciacioncentrocostosSeleccionados.add(gastodepreciacioncentrocostoAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(GastoDepreciacionCentroCosto gastodepreciacioncentrocostoAux:this.gastodepreciacioncentrocostos) {
					if(gastodepreciacioncentrocostoAux.getIsSelected()) {
						gastodepreciacioncentrocostosSeleccionados.add(gastodepreciacioncentrocostoAux);				
					}
				}
			}
			
			if(gastodepreciacioncentrocostosSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						gastodepreciacioncentrocostosSeleccionados.addAll(this.gastodepreciacioncentrocostoLogic.getGastoDepreciacionCentroCostos());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						gastodepreciacioncentrocostosSeleccionados.addAll(this.gastodepreciacioncentrocostos);				
					}
				}
			}
		} else {
			gastodepreciacioncentrocostosSeleccionados.add(this.gastodepreciacioncentrocosto);
		}
		
		return gastodepreciacioncentrocostosSeleccionados;
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
	
	public void generarReporteGastoDepreciacionCentroCostosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalGastoDepreciacionCentroCostosSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoGastoDepreciacionCentroCostosSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoGastoDepreciacionCentroCostosSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoGastoDepreciacionCentroCostosSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Gasto Depreciacion Centro Costo",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesGastoDepreciacionCentroCostosSeleccionados() throws Exception {
		ArrayList<GastoDepreciacionCentroCosto> gastodepreciacioncentrocostosSeleccionados=new ArrayList<GastoDepreciacionCentroCosto>();		
		
		gastodepreciacioncentrocostosSeleccionados=this.getGastoDepreciacionCentroCostosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteGastoDepreciacionCentroCostos("Todos",gastodepreciacioncentrocostosSeleccionados);
		
	}	
	
	public void generarReporteNormalGastoDepreciacionCentroCostosSeleccionados() throws Exception {
		ArrayList<GastoDepreciacionCentroCosto> gastodepreciacioncentrocostosSeleccionados=new ArrayList<GastoDepreciacionCentroCosto>();		
		
		gastodepreciacioncentrocostosSeleccionados=this.getGastoDepreciacionCentroCostosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteGastoDepreciacionCentroCostos("Todos",gastodepreciacioncentrocostosSeleccionados);
	}		
	
	public void generarReporteProcesoAccionGastoDepreciacionCentroCostosSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<GastoDepreciacionCentroCosto> gastodepreciacioncentrocostosSeleccionados=new ArrayList<GastoDepreciacionCentroCosto>();
		
		gastodepreciacioncentrocostosSeleccionados=this.getGastoDepreciacionCentroCostosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteGastoDepreciacionCentroCostos("Todos",gastodepreciacioncentrocostosSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoGastoDepreciacionCentroCostosSeleccionados() throws Exception {
		ArrayList<GastoDepreciacionCentroCosto> gastodepreciacioncentrocostosSeleccionados=new ArrayList<GastoDepreciacionCentroCosto>();		
		
		
		this.abrirInicializarFrameReporteDinamicoGastoDepreciacionCentroCosto();
		
		
		gastodepreciacioncentrocostosSeleccionados=this.getGastoDepreciacionCentroCostosSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoGastoDepreciacionCentroCosto();
		
		
		//this.generarReporteGastoDepreciacionCentroCostos("Todos",gastodepreciacioncentrocostosSeleccionados ,gastodepreciacioncentrocostoImplementable,gastodepreciacioncentrocostoImplementableHome);
	}
	
	public void mostrarImportacionGastoDepreciacionCentroCostos() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionGastoDepreciacionCentroCosto();
		
		this.abrirFrameImportacionGastoDepreciacionCentroCosto();		
		
			
		//this.generarReporteGastoDepreciacionCentroCostos("Todos",gastodepreciacioncentrocostosSeleccionados ,gastodepreciacioncentrocostoImplementable,gastodepreciacioncentrocostoImplementableHome);
	}
	
	public void importarGastoDepreciacionCentroCostos() throws Exception {		
	
	}
	
	public void exportarGastoDepreciacionCentroCostosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelGastoDepreciacionCentroCostosSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoGastoDepreciacionCentroCostosSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlGastoDepreciacionCentroCostosSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Gasto Depreciacion Centro Costo",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoGastoDepreciacionCentroCostosSeleccionados() throws Exception {
		ArrayList<GastoDepreciacionCentroCosto> gastodepreciacioncentrocostosSeleccionados=new ArrayList<GastoDepreciacionCentroCosto>();		
		
		gastodepreciacioncentrocostosSeleccionados=this.getGastoDepreciacionCentroCostosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"gastodepreciacioncentrocosto."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarGastoDepreciacionCentroCosto(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(GastoDepreciacionCentroCosto gastodepreciacioncentrocostoAux:gastodepreciacioncentrocostosSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarGastoDepreciacionCentroCosto(gastodepreciacioncentrocostoAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//gastodepreciacioncentrocostoAux.setsDetalleGeneralEntityReporte(gastodepreciacioncentrocostoAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.gastodepreciacioncentrocostoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Gasto Depreciacion Centro Costo",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarGastoDepreciacionCentroCosto(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=GastoDepreciacionCentroCostoConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=GastoDepreciacionCentroCostoConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=GastoDepreciacionCentroCostoConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=GastoDepreciacionCentroCostoConstantesFunciones.LABEL_IDSUCURSAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=GastoDepreciacionCentroCostoConstantesFunciones.LABEL_IDCENTROCOSTO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=GastoDepreciacionCentroCostoConstantesFunciones.LABEL_IDDETALLEACTIVOFIJO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=GastoDepreciacionCentroCostoConstantesFunciones.LABEL_IDCUENTACONTABLE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=GastoDepreciacionCentroCostoConstantesFunciones.LABEL_PORCENTAJE;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarGastoDepreciacionCentroCosto(GastoDepreciacionCentroCosto gastodepreciacioncentrocosto,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=gastodepreciacioncentrocosto.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=gastodepreciacioncentrocosto.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=gastodepreciacioncentrocosto.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=gastodepreciacioncentrocosto.getsucursal_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=gastodepreciacioncentrocosto.getcentrocosto_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=gastodepreciacioncentrocosto.getdetalleactivofijo_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=gastodepreciacioncentrocosto.getcuentacontable_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=gastodepreciacioncentrocosto.getporcentaje().toString();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelGastoDepreciacionCentroCostosSeleccionados() throws Exception {
		ArrayList<GastoDepreciacionCentroCosto> gastodepreciacioncentrocostosSeleccionados=new ArrayList<GastoDepreciacionCentroCosto>();		
		
		gastodepreciacioncentrocostosSeleccionados=this.getGastoDepreciacionCentroCostosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"gastodepreciacioncentrocosto.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("GastoDepreciacionCentroCostos");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelGastoDepreciacionCentroCosto(row);				
				iRow++;
			}				
			
			for(GastoDepreciacionCentroCosto gastodepreciacioncentrocostoAux:gastodepreciacioncentrocostosSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelGastoDepreciacionCentroCosto(gastodepreciacioncentrocostoAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.gastodepreciacioncentrocostoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Gasto Depreciacion Centro Costo",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlGastoDepreciacionCentroCostosSeleccionados() throws Exception {
		ArrayList<GastoDepreciacionCentroCosto> gastodepreciacioncentrocostosSeleccionados=new ArrayList<GastoDepreciacionCentroCosto>();		
		
		gastodepreciacioncentrocostosSeleccionados=this.getGastoDepreciacionCentroCostosSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"gastodepreciacioncentrocosto.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("gastodepreciacioncentrocostos");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("gastodepreciacioncentrocosto");
			//elementRoot.appendChild(element);
		
			for(GastoDepreciacionCentroCosto gastodepreciacioncentrocostoAux:gastodepreciacioncentrocostosSeleccionados) {
				element = document.createElement("gastodepreciacioncentrocosto");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlGastoDepreciacionCentroCosto(gastodepreciacioncentrocostoAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.gastodepreciacioncentrocostoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Gasto Depreciacion Centro Costo",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelGastoDepreciacionCentroCosto(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(GastoDepreciacionCentroCostoConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(GastoDepreciacionCentroCostoConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(GastoDepreciacionCentroCostoConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(GastoDepreciacionCentroCostoConstantesFunciones.LABEL_IDSUCURSAL);
		cell = row.createCell(iColumn++);cell.setCellValue(GastoDepreciacionCentroCostoConstantesFunciones.LABEL_IDCENTROCOSTO);
		cell = row.createCell(iColumn++);cell.setCellValue(GastoDepreciacionCentroCostoConstantesFunciones.LABEL_IDDETALLEACTIVOFIJO);
		cell = row.createCell(iColumn++);cell.setCellValue(GastoDepreciacionCentroCostoConstantesFunciones.LABEL_IDCUENTACONTABLE);
		cell = row.createCell(iColumn++);cell.setCellValue(GastoDepreciacionCentroCostoConstantesFunciones.LABEL_PORCENTAJE);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelGastoDepreciacionCentroCosto(GastoDepreciacionCentroCosto gastodepreciacioncentrocosto,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(gastodepreciacioncentrocosto.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(gastodepreciacioncentrocosto.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(gastodepreciacioncentrocosto.getsucursal_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(gastodepreciacioncentrocosto.getcentrocosto_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(gastodepreciacioncentrocosto.getdetalleactivofijo_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(gastodepreciacioncentrocosto.getcuentacontable_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(gastodepreciacioncentrocosto.getporcentaje());				
	}
	
	public void setFilaDatosExportarXmlGastoDepreciacionCentroCosto(GastoDepreciacionCentroCosto gastodepreciacioncentrocosto,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(GastoDepreciacionCentroCostoConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(gastodepreciacioncentrocosto.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(GastoDepreciacionCentroCostoConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(gastodepreciacioncentrocosto.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(GastoDepreciacionCentroCostoConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(gastodepreciacioncentrocosto.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementsucursal_descripcion = document.createElement(GastoDepreciacionCentroCostoConstantesFunciones.IDSUCURSAL);
		elementsucursal_descripcion.appendChild(document.createTextNode(gastodepreciacioncentrocosto.getsucursal_descripcion()));
		element.appendChild(elementsucursal_descripcion);

		Element elementcentrocosto_descripcion = document.createElement(GastoDepreciacionCentroCostoConstantesFunciones.IDCENTROCOSTO);
		elementcentrocosto_descripcion.appendChild(document.createTextNode(gastodepreciacioncentrocosto.getcentrocosto_descripcion()));
		element.appendChild(elementcentrocosto_descripcion);

		Element elementdetalleactivofijo_descripcion = document.createElement(GastoDepreciacionCentroCostoConstantesFunciones.IDDETALLEACTIVOFIJO);
		elementdetalleactivofijo_descripcion.appendChild(document.createTextNode(gastodepreciacioncentrocosto.getdetalleactivofijo_descripcion()));
		element.appendChild(elementdetalleactivofijo_descripcion);

		Element elementcuentacontable_descripcion = document.createElement(GastoDepreciacionCentroCostoConstantesFunciones.IDCUENTACONTABLE);
		elementcuentacontable_descripcion.appendChild(document.createTextNode(gastodepreciacioncentrocosto.getcuentacontable_descripcion()));
		element.appendChild(elementcuentacontable_descripcion);

		Element elementporcentaje = document.createElement(GastoDepreciacionCentroCostoConstantesFunciones.PORCENTAJE);
		elementporcentaje.appendChild(document.createTextNode(gastodepreciacioncentrocosto.getporcentaje().toString().trim()));
		element.appendChild(elementporcentaje);
	}
	
	public void generarReporteGroupGenericoGastoDepreciacionCentroCostosSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<GastoDepreciacionCentroCosto> gastodepreciacioncentrocostosSeleccionados=new ArrayList<GastoDepreciacionCentroCosto>();
		
		gastodepreciacioncentrocostosSeleccionados=this.getGastoDepreciacionCentroCostosSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoGastoDepreciacionCentroCosto(gastodepreciacioncentrocostosSeleccionados);
		
		this.generarReporteGastoDepreciacionCentroCostos("Todos",gastodepreciacioncentrocostosSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoGastoDepreciacionCentroCosto(ArrayList<GastoDepreciacionCentroCosto> gastodepreciacioncentrocostosSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(GastoDepreciacionCentroCosto gastodepreciacioncentrocostoAux:gastodepreciacioncentrocostosSeleccionados) {
				gastodepreciacioncentrocostoAux.setsDetalleGeneralEntityReporte(gastodepreciacioncentrocostoAux.toString());
			
				if(sTipoSeleccionar.equals(GastoDepreciacionCentroCostoConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					gastodepreciacioncentrocostoAux.setsDescripcionGeneralEntityReporte1(gastodepreciacioncentrocostoAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(GastoDepreciacionCentroCostoConstantesFunciones.LABEL_IDSUCURSAL)) {
					existe=true;
					gastodepreciacioncentrocostoAux.setsDescripcionGeneralEntityReporte1(gastodepreciacioncentrocostoAux.getsucursal_descripcion());
				}
				 else if(sTipoSeleccionar.equals(GastoDepreciacionCentroCostoConstantesFunciones.LABEL_IDCENTROCOSTO)) {
					existe=true;
					gastodepreciacioncentrocostoAux.setsDescripcionGeneralEntityReporte1(gastodepreciacioncentrocostoAux.getcentrocosto_descripcion());
				}
				 else if(sTipoSeleccionar.equals(GastoDepreciacionCentroCostoConstantesFunciones.LABEL_IDDETALLEACTIVOFIJO)) {
					existe=true;
					gastodepreciacioncentrocostoAux.setsDescripcionGeneralEntityReporte1(gastodepreciacioncentrocostoAux.getdetalleactivofijo_descripcion());
				}
				 else if(sTipoSeleccionar.equals(GastoDepreciacionCentroCostoConstantesFunciones.LABEL_IDCUENTACONTABLE)) {
					existe=true;
					gastodepreciacioncentrocostoAux.setsDescripcionGeneralEntityReporte1(gastodepreciacioncentrocostoAux.getcuentacontable_descripcion());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GastoDepreciacionCentroCostoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesGastoDepreciacionCentroCosto(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoGastoDepreciacionCentroCosto=true;
				this.isVisibilidadCeldaNuevoRelacionesGastoDepreciacionCentroCosto=true;
				this.isVisibilidadCeldaGuardarCambiosGastoDepreciacionCentroCosto=true;
			}
			
			this.isVisibilidadCeldaModificarGastoDepreciacionCentroCosto=false;
			this.isVisibilidadCeldaActualizarGastoDepreciacionCentroCosto=false;
			this.isVisibilidadCeldaEliminarGastoDepreciacionCentroCosto=false;
			this.isVisibilidadCeldaCancelarGastoDepreciacionCentroCosto=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarGastoDepreciacionCentroCosto=true;
				} else {
					this.isVisibilidadCeldaGuardarGastoDepreciacionCentroCosto=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoGastoDepreciacionCentroCosto=false;
			this.isVisibilidadCeldaNuevoRelacionesGastoDepreciacionCentroCosto=false;
			this.isVisibilidadCeldaGuardarCambiosGastoDepreciacionCentroCosto=false;
			this.isVisibilidadCeldaModificarGastoDepreciacionCentroCosto=false;
			this.isVisibilidadCeldaActualizarGastoDepreciacionCentroCosto=true;
			this.isVisibilidadCeldaEliminarGastoDepreciacionCentroCosto=false;
			this.isVisibilidadCeldaCancelarGastoDepreciacionCentroCosto=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarGastoDepreciacionCentroCosto=true;
				} else {
					this.isVisibilidadCeldaGuardarGastoDepreciacionCentroCosto=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoGastoDepreciacionCentroCosto=false;
			this.isVisibilidadCeldaNuevoRelacionesGastoDepreciacionCentroCosto=false;
			this.isVisibilidadCeldaGuardarCambiosGastoDepreciacionCentroCosto=false;
			this.isVisibilidadCeldaModificarGastoDepreciacionCentroCosto=false;
			this.isVisibilidadCeldaActualizarGastoDepreciacionCentroCosto=true;
			this.isVisibilidadCeldaEliminarGastoDepreciacionCentroCosto=true;
			this.isVisibilidadCeldaCancelarGastoDepreciacionCentroCosto=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarGastoDepreciacionCentroCosto=true;
				} else {
					this.isVisibilidadCeldaGuardarGastoDepreciacionCentroCosto=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoGastoDepreciacionCentroCosto=false;
			this.isVisibilidadCeldaNuevoRelacionesGastoDepreciacionCentroCosto=false;
			this.isVisibilidadCeldaGuardarCambiosGastoDepreciacionCentroCosto=false;
			this.isVisibilidadCeldaModificarGastoDepreciacionCentroCosto=false;
			this.isVisibilidadCeldaActualizarGastoDepreciacionCentroCosto=true;
			this.isVisibilidadCeldaEliminarGastoDepreciacionCentroCosto=false;
			this.isVisibilidadCeldaCancelarGastoDepreciacionCentroCosto=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarGastoDepreciacionCentroCosto=false;
				} else {
					this.isVisibilidadCeldaGuardarGastoDepreciacionCentroCosto=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoGastoDepreciacionCentroCosto=true;
			this.isVisibilidadCeldaNuevoRelacionesGastoDepreciacionCentroCosto=true;
			this.isVisibilidadCeldaGuardarCambiosGastoDepreciacionCentroCosto=true;
			this.isVisibilidadCeldaModificarGastoDepreciacionCentroCosto=false;
			this.isVisibilidadCeldaActualizarGastoDepreciacionCentroCosto=false;
			this.isVisibilidadCeldaEliminarGastoDepreciacionCentroCosto=false;
			this.isVisibilidadCeldaCancelarGastoDepreciacionCentroCosto=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarGastoDepreciacionCentroCosto=true;
				} else {
					this.isVisibilidadCeldaGuardarGastoDepreciacionCentroCosto=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoGastoDepreciacionCentroCosto=false;
			this.isVisibilidadCeldaNuevoRelacionesGastoDepreciacionCentroCosto=false;
			this.isVisibilidadCeldaGuardarCambiosGastoDepreciacionCentroCosto=false;
			this.isVisibilidadCeldaActualizarGastoDepreciacionCentroCosto=false;
			this.isVisibilidadCeldaEliminarGastoDepreciacionCentroCosto=false;
			this.isVisibilidadCeldaCancelarGastoDepreciacionCentroCosto=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarGastoDepreciacionCentroCosto=false;
				} else {
					this.isVisibilidadCeldaGuardarGastoDepreciacionCentroCosto=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoGastoDepreciacionCentroCosto=false;
			this.isVisibilidadCeldaNuevoRelacionesGastoDepreciacionCentroCosto=false;
			this.isVisibilidadCeldaGuardarCambiosGastoDepreciacionCentroCosto=false;
			this.isVisibilidadCeldaModificarGastoDepreciacionCentroCosto=true;
			this.isVisibilidadCeldaActualizarGastoDepreciacionCentroCosto=false;
			this.isVisibilidadCeldaEliminarGastoDepreciacionCentroCosto=false;
			this.isVisibilidadCeldaCancelarGastoDepreciacionCentroCosto=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarGastoDepreciacionCentroCosto=false;
				} else {
					this.isVisibilidadCeldaGuardarGastoDepreciacionCentroCosto=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(GastoDepreciacionCentroCostoJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoGastoDepreciacionCentroCosto=true;
			this.isVisibilidadCeldaNuevoRelacionesGastoDepreciacionCentroCosto=true;
			this.isVisibilidadCeldaGuardarCambiosGastoDepreciacionCentroCosto=true;
		} else {
			this.actualizarEstadoPanelsGastoDepreciacionCentroCosto(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarGastoDepreciacionCentroCosto=false;
			//this.isVisibilidadCeldaVerFormGastoDepreciacionCentroCosto=false;
			this.isVisibilidadCeldaDuplicarGastoDepreciacionCentroCosto=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!gastodepreciacioncentrocostoSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesGastoDepreciacionCentroCosto=false;
		} else {
			this.isVisibilidadCeldaNuevoGastoDepreciacionCentroCosto=false;
			this.isVisibilidadCeldaGuardarCambiosGastoDepreciacionCentroCosto=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(gastodepreciacioncentrocostoSessionBean.getEsGuardarRelacionado()) {
			if(!gastodepreciacioncentrocostoSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesGastoDepreciacionCentroCosto=false;												
			}
			
			this.jButtonCerrarGastoDepreciacionCentroCosto.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesGastoDepreciacionCentroCosto=false;
		}
		
		if(!this.permiteMantenimiento(this.gastodepreciacioncentrocosto)) {
			this.isVisibilidadCeldaActualizarGastoDepreciacionCentroCosto=false;
			this.isVisibilidadCeldaEliminarGastoDepreciacionCentroCosto=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesGastoDepreciacionCentroCosto() {
	}
	
	public void actualizarEstadoPanelsGastoDepreciacionCentroCosto(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionGastoDepreciacionCentroCosto!=null) {
				this.jScrollPanelDatosEdicionGastoDepreciacionCentroCosto.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasGastoDepreciacionCentroCosto!=null) {
				this.jTabbedPaneBusquedasGastoDepreciacionCentroCosto.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosGastoDepreciacionCentroCosto!=null) {
				this.jScrollPanelDatosGastoDepreciacionCentroCosto.setVisible(true);
			}
			
			if(this.jPanelPaginacionGastoDepreciacionCentroCosto!=null) {
				this.jPanelPaginacionGastoDepreciacionCentroCosto.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesGastoDepreciacionCentroCosto!=null) {
				this.jPanelParametrosReportesGastoDepreciacionCentroCosto.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionGastoDepreciacionCentroCosto!=null) {
				this.jScrollPanelDatosEdicionGastoDepreciacionCentroCosto.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasGastoDepreciacionCentroCosto!=null) {
				this.jTabbedPaneBusquedasGastoDepreciacionCentroCosto.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosGastoDepreciacionCentroCosto!=null) {
				this.jScrollPanelDatosGastoDepreciacionCentroCosto.setVisible(false);
			}
			
			if(this.jPanelPaginacionGastoDepreciacionCentroCosto!=null) {
				this.jPanelPaginacionGastoDepreciacionCentroCosto.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesGastoDepreciacionCentroCosto!=null) {
				this.jPanelParametrosReportesGastoDepreciacionCentroCosto.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionGastoDepreciacionCentroCosto!=null) {
				this.jScrollPanelDatosEdicionGastoDepreciacionCentroCosto.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasGastoDepreciacionCentroCosto!=null) {
				this.jTabbedPaneBusquedasGastoDepreciacionCentroCosto.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosGastoDepreciacionCentroCosto!=null) {
				this.jScrollPanelDatosGastoDepreciacionCentroCosto.setVisible(false);
			}
			
			if(this.jPanelPaginacionGastoDepreciacionCentroCosto!=null) {
				this.jPanelPaginacionGastoDepreciacionCentroCosto.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesGastoDepreciacionCentroCosto!=null) {
				this.jPanelParametrosReportesGastoDepreciacionCentroCosto.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionGastoDepreciacionCentroCosto!=null) {
				this.jScrollPanelDatosEdicionGastoDepreciacionCentroCosto.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasGastoDepreciacionCentroCosto!=null) {
				this.jTabbedPaneBusquedasGastoDepreciacionCentroCosto.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosGastoDepreciacionCentroCosto!=null) {
				this.jScrollPanelDatosGastoDepreciacionCentroCosto.setVisible(false);
			}
			
			if(this.jPanelPaginacionGastoDepreciacionCentroCosto!=null) {
				this.jPanelPaginacionGastoDepreciacionCentroCosto.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesGastoDepreciacionCentroCosto!=null) {
				this.jPanelParametrosReportesGastoDepreciacionCentroCosto.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionGastoDepreciacionCentroCosto!=null) {
				this.jScrollPanelDatosEdicionGastoDepreciacionCentroCosto.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasGastoDepreciacionCentroCosto!=null) {
				this.jTabbedPaneBusquedasGastoDepreciacionCentroCosto.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosGastoDepreciacionCentroCosto!=null) {
				this.jScrollPanelDatosGastoDepreciacionCentroCosto.setVisible(true);
			}
			
			if(this.jPanelPaginacionGastoDepreciacionCentroCosto!=null) {
				this.jPanelPaginacionGastoDepreciacionCentroCosto.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesGastoDepreciacionCentroCosto!=null) {
				this.jPanelParametrosReportesGastoDepreciacionCentroCosto.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionGastoDepreciacionCentroCosto!=null) {
				this.jScrollPanelDatosEdicionGastoDepreciacionCentroCosto.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasGastoDepreciacionCentroCosto!=null) {
				this.jTabbedPaneBusquedasGastoDepreciacionCentroCosto.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosGastoDepreciacionCentroCosto!=null) {
				this.jScrollPanelDatosGastoDepreciacionCentroCosto.setVisible(true);
			}
			
			if(this.jPanelPaginacionGastoDepreciacionCentroCosto!=null) {
				this.jPanelPaginacionGastoDepreciacionCentroCosto.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesGastoDepreciacionCentroCosto!=null) {
				this.jPanelParametrosReportesGastoDepreciacionCentroCosto.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionGastoDepreciacionCentroCosto!=null) {
				this.jScrollPanelDatosEdicionGastoDepreciacionCentroCosto.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasGastoDepreciacionCentroCosto!=null) {
				this.jTabbedPaneBusquedasGastoDepreciacionCentroCosto.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosGastoDepreciacionCentroCosto!=null) {
				this.jScrollPanelDatosGastoDepreciacionCentroCosto.setVisible(true);
			}
			
			if(this.jPanelPaginacionGastoDepreciacionCentroCosto!=null) {
				this.jPanelPaginacionGastoDepreciacionCentroCosto.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesGastoDepreciacionCentroCosto!=null) {
				this.jPanelParametrosReportesGastoDepreciacionCentroCosto.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.gastodepreciacioncentrocostoSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasGastoDepreciacionCentroCosto!=null) {
					this.jTabbedPaneBusquedasGastoDepreciacionCentroCosto.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesGastoDepreciacionCentroCosto!=null) {
				this.jPanelParametrosReportesGastoDepreciacionCentroCosto.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.gastodepreciacioncentrocostoSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasGastoDepreciacionCentroCosto!=null) {
				this.jTabbedPaneBusquedasGastoDepreciacionCentroCosto.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesGastoDepreciacionCentroCosto!=null) {
				this.jPanelParametrosReportesGastoDepreciacionCentroCosto.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadFK_IdCentroCosto=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdCentroCosto) {this.jTabbedPaneBusquedasGastoDepreciacionCentroCosto.remove(jPanelFK_IdCentroCostoGastoDepreciacionCentroCosto);}

			this.isVisibilidadFK_IdCuentaContable=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdCuentaContable) {this.jTabbedPaneBusquedasGastoDepreciacionCentroCosto.remove(jPanelFK_IdCuentaContableGastoDepreciacionCentroCosto);}

			this.isVisibilidadFK_IdDetalleActivoFijo=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdDetalleActivoFijo) {this.jTabbedPaneBusquedasGastoDepreciacionCentroCosto.remove(jPanelFK_IdDetalleActivoFijoGastoDepreciacionCentroCosto);}
		}
		
	}

	public void setVisibilidadBusquedasParaSucursal(Boolean isParaSucursal){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaSucursalNegation=!isParaSucursal;

			this.isVisibilidadFK_IdCentroCosto=isParaSucursalNegation;
			if(!this.isVisibilidadFK_IdCentroCosto) {this.jTabbedPaneBusquedasGastoDepreciacionCentroCosto.remove(jPanelFK_IdCentroCostoGastoDepreciacionCentroCosto);}

			this.isVisibilidadFK_IdCuentaContable=isParaSucursalNegation;
			if(!this.isVisibilidadFK_IdCuentaContable) {this.jTabbedPaneBusquedasGastoDepreciacionCentroCosto.remove(jPanelFK_IdCuentaContableGastoDepreciacionCentroCosto);}

			this.isVisibilidadFK_IdDetalleActivoFijo=isParaSucursalNegation;
			if(!this.isVisibilidadFK_IdDetalleActivoFijo) {this.jTabbedPaneBusquedasGastoDepreciacionCentroCosto.remove(jPanelFK_IdDetalleActivoFijoGastoDepreciacionCentroCosto);}
		}
		
	}

	public void setVisibilidadBusquedasParaCentroCosto(Boolean isParaCentroCosto){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaCentroCostoNegation=!isParaCentroCosto;

			this.isVisibilidadFK_IdCentroCosto=isParaCentroCosto;
			if(!this.isVisibilidadFK_IdCentroCosto) {this.jTabbedPaneBusquedasGastoDepreciacionCentroCosto.remove(jPanelFK_IdCentroCostoGastoDepreciacionCentroCosto);}

			this.isVisibilidadFK_IdCuentaContable=isParaCentroCostoNegation;
			if(!this.isVisibilidadFK_IdCuentaContable) {this.jTabbedPaneBusquedasGastoDepreciacionCentroCosto.remove(jPanelFK_IdCuentaContableGastoDepreciacionCentroCosto);}

			this.isVisibilidadFK_IdDetalleActivoFijo=isParaCentroCostoNegation;
			if(!this.isVisibilidadFK_IdDetalleActivoFijo) {this.jTabbedPaneBusquedasGastoDepreciacionCentroCosto.remove(jPanelFK_IdDetalleActivoFijoGastoDepreciacionCentroCosto);}
		}
		
	}

	public void setVisibilidadBusquedasParaDetalleActivoFijo(Boolean isParaDetalleActivoFijo){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaDetalleActivoFijoNegation=!isParaDetalleActivoFijo;

			this.isVisibilidadFK_IdCentroCosto=isParaDetalleActivoFijoNegation;
			if(!this.isVisibilidadFK_IdCentroCosto) {this.jTabbedPaneBusquedasGastoDepreciacionCentroCosto.remove(jPanelFK_IdCentroCostoGastoDepreciacionCentroCosto);}

			this.isVisibilidadFK_IdCuentaContable=isParaDetalleActivoFijoNegation;
			if(!this.isVisibilidadFK_IdCuentaContable) {this.jTabbedPaneBusquedasGastoDepreciacionCentroCosto.remove(jPanelFK_IdCuentaContableGastoDepreciacionCentroCosto);}

			this.isVisibilidadFK_IdDetalleActivoFijo=isParaDetalleActivoFijo;
			if(!this.isVisibilidadFK_IdDetalleActivoFijo) {this.jTabbedPaneBusquedasGastoDepreciacionCentroCosto.remove(jPanelFK_IdDetalleActivoFijoGastoDepreciacionCentroCosto);}
		}
		
	}

	public void setVisibilidadBusquedasParaCuentaContable(Boolean isParaCuentaContable){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaCuentaContableNegation=!isParaCuentaContable;

			this.isVisibilidadFK_IdCentroCosto=isParaCuentaContableNegation;
			if(!this.isVisibilidadFK_IdCentroCosto) {this.jTabbedPaneBusquedasGastoDepreciacionCentroCosto.remove(jPanelFK_IdCentroCostoGastoDepreciacionCentroCosto);}

			this.isVisibilidadFK_IdCuentaContable=isParaCuentaContable;
			if(!this.isVisibilidadFK_IdCuentaContable) {this.jTabbedPaneBusquedasGastoDepreciacionCentroCosto.remove(jPanelFK_IdCuentaContableGastoDepreciacionCentroCosto);}

			this.isVisibilidadFK_IdDetalleActivoFijo=isParaCuentaContableNegation;
			if(!this.isVisibilidadFK_IdDetalleActivoFijo) {this.jTabbedPaneBusquedasGastoDepreciacionCentroCosto.remove(jPanelFK_IdDetalleActivoFijoGastoDepreciacionCentroCosto);}
		}
		
	}
	
	
	
	

	public String registrarSesionGastoDepreciacionCentroCostoParaBusquedaCentroCostos() throws Exception {
		Boolean isPaginaPopupCentroCosto=false;

		try {

			if(gastodepreciacioncentrocostoSessionBean==null) {
				gastodepreciacioncentrocostoSessionBean=new GastoDepreciacionCentroCostoSessionBean();
			}

			if(centrocostoSessionBean==null) {
				centrocostoSessionBean=new CentroCostoSessionBean();
			}

			centrocostoSessionBean.setsPathNavegacionActual(gastodepreciacioncentrocostoSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+CentroCostoConstantesFunciones.SCLASSWEBTITULO);
			centrocostoSessionBean.setisPermiteRecargarInformacion(false);
			centrocostoSessionBean.setisPaginaPopup(true);
			isPaginaPopupCentroCosto=centrocostoSessionBean.getisPaginaPopup();
			centrocostoSessionBean.setisPaginaPopup(false);
			centrocostoSessionBean.setEstaModoBusqueda(true);
			centrocostoSessionBean.setsFuncionBusquedaRapida("window.opener.gastodepreciacioncentrocostoFuncionGeneral.setCombosCodigoDesdeBusquedaid_centro_costo(TO_REPLACE);");
			centrocostoSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeCentroCosto(true);
			centrocostoSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeCentroCosto(GastoDepreciacionCentroCostoConstantesFunciones.SNOMBREOPCION);
			//centrocostoSessionBean.setisBusquedaDesdeForeignKeySesionGastoDepreciacionCentroCosto(true);
			//centrocostoSessionBean.setlidGastoDepreciacionCentroCostoActual(this.idGastoDepreciacionCentroCostoActual);

			gastodepreciacioncentrocostoSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyGastoDepreciacionCentroCosto(true);
			gastodepreciacioncentrocostoSessionBean.setlIdGastoDepreciacionCentroCostoActualForeignKey(this.idGastoDepreciacionCentroCostoActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
			return "";
	}

	public String registrarSesionGastoDepreciacionCentroCostoParaBusquedaCuentaContables() throws Exception {
		Boolean isPaginaPopupCuentaContable=false;

		try {

			if(gastodepreciacioncentrocostoSessionBean==null) {
				gastodepreciacioncentrocostoSessionBean=new GastoDepreciacionCentroCostoSessionBean();
			}

			if(cuentacontableSessionBean==null) {
				cuentacontableSessionBean=new CuentaContableSessionBean();
			}

			cuentacontableSessionBean.setsPathNavegacionActual(gastodepreciacioncentrocostoSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+CuentaContableConstantesFunciones.SCLASSWEBTITULO);
			cuentacontableSessionBean.setisPermiteRecargarInformacion(false);
			cuentacontableSessionBean.setisPaginaPopup(true);
			isPaginaPopupCuentaContable=cuentacontableSessionBean.getisPaginaPopup();
			cuentacontableSessionBean.setisPaginaPopup(false);
			cuentacontableSessionBean.setEstaModoBusqueda(true);
			cuentacontableSessionBean.setsFuncionBusquedaRapida("window.opener.gastodepreciacioncentrocostoFuncionGeneral.setCombosCodigoDesdeBusquedaid_cuenta_contable(TO_REPLACE);");
			cuentacontableSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeCuentaContable(true);
			cuentacontableSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeCuentaContable(GastoDepreciacionCentroCostoConstantesFunciones.SNOMBREOPCION);
			//cuentacontableSessionBean.setisBusquedaDesdeForeignKeySesionGastoDepreciacionCentroCosto(true);
			//cuentacontableSessionBean.setlidGastoDepreciacionCentroCostoActual(this.idGastoDepreciacionCentroCostoActual);

			gastodepreciacioncentrocostoSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyGastoDepreciacionCentroCosto(true);
			gastodepreciacioncentrocostoSessionBean.setlIdGastoDepreciacionCentroCostoActualForeignKey(this.idGastoDepreciacionCentroCostoActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
			return "";
	}
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//GastoDepreciacionCentroCostoSessionBean gastodepreciacioncentrocostoSessionBean=new GastoDepreciacionCentroCostoSessionBean();
		
		if(this.gastodepreciacioncentrocostoSessionBean==null) {
			this.gastodepreciacioncentrocostoSessionBean=new GastoDepreciacionCentroCostoSessionBean();
		}
		
		this.gastodepreciacioncentrocostoSessionBean.setsUltimaBusquedaGastoDepreciacionCentroCosto(this.getsAccionBusqueda());
		this.gastodepreciacioncentrocostoSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.gastodepreciacioncentrocostoSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdCentroCosto")) {
			gastodepreciacioncentrocostoSessionBean.setid_centro_costo(this.getid_centro_costoFK_IdCentroCosto());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdCuentaContable")) {
			gastodepreciacioncentrocostoSessionBean.setid_cuenta_contable(this.getid_cuenta_contableFK_IdCuentaContable());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdDetalleActivoFijo")) {
			gastodepreciacioncentrocostoSessionBean.setid_detalle_activo_fijo(this.getid_detalle_activo_fijoFK_IdDetalleActivoFijo());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			gastodepreciacioncentrocostoSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdSucursal")) {
			gastodepreciacioncentrocostoSessionBean.setid_sucursal(this.getid_sucursalFK_IdSucursal());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//GastoDepreciacionCentroCostoSessionBean gastodepreciacioncentrocostoSessionBean=new GastoDepreciacionCentroCostoSessionBean();
		
		if(this.gastodepreciacioncentrocostoSessionBean==null) {
			this.gastodepreciacioncentrocostoSessionBean=new GastoDepreciacionCentroCostoSessionBean();
		}
		
		if(this.gastodepreciacioncentrocostoSessionBean.getsUltimaBusquedaGastoDepreciacionCentroCosto()!=null&&!this.gastodepreciacioncentrocostoSessionBean.getsUltimaBusquedaGastoDepreciacionCentroCosto().equals("")) {
			this.setsAccionBusqueda(gastodepreciacioncentrocostoSessionBean.getsUltimaBusquedaGastoDepreciacionCentroCosto());
			this.setiNumeroPaginacion(gastodepreciacioncentrocostoSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(gastodepreciacioncentrocostoSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdCentroCosto")) {
				this.setid_centro_costoFK_IdCentroCosto(gastodepreciacioncentrocostoSessionBean.getid_centro_costo());
				gastodepreciacioncentrocostoSessionBean.setid_centro_costo(null);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdCuentaContable")) {
				this.setid_cuenta_contableFK_IdCuentaContable(gastodepreciacioncentrocostoSessionBean.getid_cuenta_contable());
				gastodepreciacioncentrocostoSessionBean.setid_cuenta_contable(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdDetalleActivoFijo")) {
				this.setid_detalle_activo_fijoFK_IdDetalleActivoFijo(gastodepreciacioncentrocostoSessionBean.getid_detalle_activo_fijo());
				gastodepreciacioncentrocostoSessionBean.setid_detalle_activo_fijo(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(gastodepreciacioncentrocostoSessionBean.getid_empresa());
				gastodepreciacioncentrocostoSessionBean.setid_empresa(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdSucursal")) {
				this.setid_sucursalFK_IdSucursal(gastodepreciacioncentrocostoSessionBean.getid_sucursal());
				gastodepreciacioncentrocostoSessionBean.setid_sucursal(-1L);
			}
		}
		
		this.gastodepreciacioncentrocostoSessionBean.setsUltimaBusquedaGastoDepreciacionCentroCosto("");
		this.gastodepreciacioncentrocostoSessionBean.setiNumeroPaginacion(GastoDepreciacionCentroCostoConstantesFunciones.INUMEROPAGINACION);
		this.gastodepreciacioncentrocostoSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaGastoDepreciacionCentroCosto(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioGastoDepreciacionCentroCosto() {
		this.updateBorderResaltarBusquedasFormularioGastoDepreciacionCentroCosto();
		this.updateVisibilidadBusquedasFormularioGastoDepreciacionCentroCosto();
		this.updateHabilitarBusquedasFormularioGastoDepreciacionCentroCosto();
	}
	
	public void updateBorderResaltarBusquedasFormularioGastoDepreciacionCentroCosto() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasGastoDepreciacionCentroCosto.getComponents().length>0) {
	

		if(this.gastodepreciacioncentrocostoConstantesFunciones.resaltarFK_IdCentroCostoGastoDepreciacionCentroCosto!=null) {
			index= this.jTabbedPaneBusquedasGastoDepreciacionCentroCosto.indexOfComponent(this.jPanelFK_IdCentroCostoGastoDepreciacionCentroCosto);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasGastoDepreciacionCentroCosto.getComponent(index);
				jPanel.setBorder(this.gastodepreciacioncentrocostoConstantesFunciones.resaltarFK_IdCentroCostoGastoDepreciacionCentroCosto);
			}
		}

		if(this.gastodepreciacioncentrocostoConstantesFunciones.resaltarFK_IdCuentaContableGastoDepreciacionCentroCosto!=null) {
			index= this.jTabbedPaneBusquedasGastoDepreciacionCentroCosto.indexOfComponent(this.jPanelFK_IdCuentaContableGastoDepreciacionCentroCosto);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasGastoDepreciacionCentroCosto.getComponent(index);
				jPanel.setBorder(this.gastodepreciacioncentrocostoConstantesFunciones.resaltarFK_IdCuentaContableGastoDepreciacionCentroCosto);
			}
		}

		if(this.gastodepreciacioncentrocostoConstantesFunciones.resaltarFK_IdDetalleActivoFijoGastoDepreciacionCentroCosto!=null) {
			index= this.jTabbedPaneBusquedasGastoDepreciacionCentroCosto.indexOfComponent(this.jPanelFK_IdDetalleActivoFijoGastoDepreciacionCentroCosto);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasGastoDepreciacionCentroCosto.getComponent(index);
				jPanel.setBorder(this.gastodepreciacioncentrocostoConstantesFunciones.resaltarFK_IdDetalleActivoFijoGastoDepreciacionCentroCosto);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioGastoDepreciacionCentroCosto() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasGastoDepreciacionCentroCosto.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasGastoDepreciacionCentroCosto.indexOfComponent(this.jPanelFK_IdCentroCostoGastoDepreciacionCentroCosto);
			jPanel=(JPanel)this.jTabbedPaneBusquedasGastoDepreciacionCentroCosto.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.gastodepreciacioncentrocostoConstantesFunciones.mostrarFK_IdCentroCostoGastoDepreciacionCentroCosto);
			if(!this.gastodepreciacioncentrocostoConstantesFunciones.mostrarFK_IdCentroCostoGastoDepreciacionCentroCosto && index>-1) {
				this.jTabbedPaneBusquedasGastoDepreciacionCentroCosto.remove(index);
			}

			index= this.jTabbedPaneBusquedasGastoDepreciacionCentroCosto.indexOfComponent(this.jPanelFK_IdCuentaContableGastoDepreciacionCentroCosto);
			jPanel=(JPanel)this.jTabbedPaneBusquedasGastoDepreciacionCentroCosto.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.gastodepreciacioncentrocostoConstantesFunciones.mostrarFK_IdCuentaContableGastoDepreciacionCentroCosto);
			if(!this.gastodepreciacioncentrocostoConstantesFunciones.mostrarFK_IdCuentaContableGastoDepreciacionCentroCosto && index>-1) {
				this.jTabbedPaneBusquedasGastoDepreciacionCentroCosto.remove(index);
			}

			index= this.jTabbedPaneBusquedasGastoDepreciacionCentroCosto.indexOfComponent(this.jPanelFK_IdDetalleActivoFijoGastoDepreciacionCentroCosto);
			jPanel=(JPanel)this.jTabbedPaneBusquedasGastoDepreciacionCentroCosto.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.gastodepreciacioncentrocostoConstantesFunciones.mostrarFK_IdDetalleActivoFijoGastoDepreciacionCentroCosto);
			if(!this.gastodepreciacioncentrocostoConstantesFunciones.mostrarFK_IdDetalleActivoFijoGastoDepreciacionCentroCosto && index>-1) {
				this.jTabbedPaneBusquedasGastoDepreciacionCentroCosto.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioGastoDepreciacionCentroCosto() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasGastoDepreciacionCentroCosto.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasGastoDepreciacionCentroCosto.indexOfComponent(this.jPanelFK_IdCentroCostoGastoDepreciacionCentroCosto);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasGastoDepreciacionCentroCosto.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.gastodepreciacioncentrocostoConstantesFunciones.activarFK_IdCentroCostoGastoDepreciacionCentroCosto);
				this.jTabbedPaneBusquedasGastoDepreciacionCentroCosto.setEnabledAt(index,this.gastodepreciacioncentrocostoConstantesFunciones.activarFK_IdCentroCostoGastoDepreciacionCentroCosto);
			}

			index= this.jTabbedPaneBusquedasGastoDepreciacionCentroCosto.indexOfComponent(this.jPanelFK_IdCuentaContableGastoDepreciacionCentroCosto);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasGastoDepreciacionCentroCosto.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.gastodepreciacioncentrocostoConstantesFunciones.activarFK_IdCuentaContableGastoDepreciacionCentroCosto);
				this.jTabbedPaneBusquedasGastoDepreciacionCentroCosto.setEnabledAt(index,this.gastodepreciacioncentrocostoConstantesFunciones.activarFK_IdCuentaContableGastoDepreciacionCentroCosto);
			}

			index= this.jTabbedPaneBusquedasGastoDepreciacionCentroCosto.indexOfComponent(this.jPanelFK_IdDetalleActivoFijoGastoDepreciacionCentroCosto);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasGastoDepreciacionCentroCosto.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.gastodepreciacioncentrocostoConstantesFunciones.activarFK_IdDetalleActivoFijoGastoDepreciacionCentroCosto);
				this.jTabbedPaneBusquedasGastoDepreciacionCentroCosto.setEnabledAt(index,this.gastodepreciacioncentrocostoConstantesFunciones.activarFK_IdDetalleActivoFijoGastoDepreciacionCentroCosto);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaGastoDepreciacionCentroCosto(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("FK_IdCentroCosto")) {
			index= this.jTabbedPaneBusquedasGastoDepreciacionCentroCosto.indexOfComponent(this.jPanelFK_IdCentroCostoGastoDepreciacionCentroCosto);

			this.jTabbedPaneBusquedasGastoDepreciacionCentroCosto.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasGastoDepreciacionCentroCosto.getComponent(index);

			this.gastodepreciacioncentrocostoConstantesFunciones.setResaltarFK_IdCentroCostoGastoDepreciacionCentroCosto(resaltar);

			jPanel.setBorder(this.gastodepreciacioncentrocostoConstantesFunciones.resaltarFK_IdCentroCostoGastoDepreciacionCentroCosto);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdCuentaContable")) {
			index= this.jTabbedPaneBusquedasGastoDepreciacionCentroCosto.indexOfComponent(this.jPanelFK_IdCuentaContableGastoDepreciacionCentroCosto);

			this.jTabbedPaneBusquedasGastoDepreciacionCentroCosto.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasGastoDepreciacionCentroCosto.getComponent(index);

			this.gastodepreciacioncentrocostoConstantesFunciones.setResaltarFK_IdCuentaContableGastoDepreciacionCentroCosto(resaltar);

			jPanel.setBorder(this.gastodepreciacioncentrocostoConstantesFunciones.resaltarFK_IdCuentaContableGastoDepreciacionCentroCosto);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdDetalleActivoFijo")) {
			index= this.jTabbedPaneBusquedasGastoDepreciacionCentroCosto.indexOfComponent(this.jPanelFK_IdDetalleActivoFijoGastoDepreciacionCentroCosto);

			this.jTabbedPaneBusquedasGastoDepreciacionCentroCosto.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasGastoDepreciacionCentroCosto.getComponent(index);

			this.gastodepreciacioncentrocostoConstantesFunciones.setResaltarFK_IdDetalleActivoFijoGastoDepreciacionCentroCosto(resaltar);

			jPanel.setBorder(this.gastodepreciacioncentrocostoConstantesFunciones.resaltarFK_IdDetalleActivoFijoGastoDepreciacionCentroCosto);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarGastoDepreciacionCentroCosto.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioGastoDepreciacionCentroCosto() throws Exception {

		if(this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioGastoDepreciacionCentroCosto();
		this.updateVisibilidadResaltarControlesFormularioGastoDepreciacionCentroCosto();
		this.updateHabilitarResaltarControlesFormularioGastoDepreciacionCentroCosto();
		
	}
	
	public void updateBorderResaltarControlesFormularioGastoDepreciacionCentroCosto() throws Exception {
		if(this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.gastodepreciacioncentrocostoConstantesFunciones.resaltaridGastoDepreciacionCentroCosto!=null && this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto!=null) {this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto.jLabelidGastoDepreciacionCentroCosto.setBorder(this.gastodepreciacioncentrocostoConstantesFunciones.resaltaridGastoDepreciacionCentroCosto);}
		if(this.gastodepreciacioncentrocostoConstantesFunciones.resaltarid_empresaGastoDepreciacionCentroCosto!=null && this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto!=null) {this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto.jComboBoxid_empresaGastoDepreciacionCentroCosto.setBorder(this.gastodepreciacioncentrocostoConstantesFunciones.resaltarid_empresaGastoDepreciacionCentroCosto);}
		if(this.gastodepreciacioncentrocostoConstantesFunciones.resaltarid_sucursalGastoDepreciacionCentroCosto!=null && this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto!=null) {this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto.jComboBoxid_sucursalGastoDepreciacionCentroCosto.setBorder(this.gastodepreciacioncentrocostoConstantesFunciones.resaltarid_sucursalGastoDepreciacionCentroCosto);}
		if(this.gastodepreciacioncentrocostoConstantesFunciones.resaltarid_centro_costoGastoDepreciacionCentroCosto!=null && this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto!=null) {this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto.jComboBoxid_centro_costoGastoDepreciacionCentroCosto.setBorder(this.gastodepreciacioncentrocostoConstantesFunciones.resaltarid_centro_costoGastoDepreciacionCentroCosto);}
		if(this.gastodepreciacioncentrocostoConstantesFunciones.resaltarid_detalle_activo_fijoGastoDepreciacionCentroCosto!=null && this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto!=null) {this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto.jComboBoxid_detalle_activo_fijoGastoDepreciacionCentroCosto.setBorder(this.gastodepreciacioncentrocostoConstantesFunciones.resaltarid_detalle_activo_fijoGastoDepreciacionCentroCosto);}
		if(this.gastodepreciacioncentrocostoConstantesFunciones.resaltarid_cuenta_contableGastoDepreciacionCentroCosto!=null && this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto!=null) {this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto.jComboBoxid_cuenta_contableGastoDepreciacionCentroCosto.setBorder(this.gastodepreciacioncentrocostoConstantesFunciones.resaltarid_cuenta_contableGastoDepreciacionCentroCosto);}
		if(this.gastodepreciacioncentrocostoConstantesFunciones.resaltarporcentajeGastoDepreciacionCentroCosto!=null && this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto!=null) {this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto.jTextFieldporcentajeGastoDepreciacionCentroCosto.setBorder(this.gastodepreciacioncentrocostoConstantesFunciones.resaltarporcentajeGastoDepreciacionCentroCosto);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioGastoDepreciacionCentroCosto() throws Exception {		
		if(this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto!=null) {
	
		//this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto.jLabelidGastoDepreciacionCentroCosto.setVisible(this.gastodepreciacioncentrocostoConstantesFunciones.mostraridGastoDepreciacionCentroCosto);
		this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto.jPanelidGastoDepreciacionCentroCosto.setVisible(this.gastodepreciacioncentrocostoConstantesFunciones.mostraridGastoDepreciacionCentroCosto);
		//this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto.jComboBoxid_empresaGastoDepreciacionCentroCosto.setVisible(this.gastodepreciacioncentrocostoConstantesFunciones.mostrarid_empresaGastoDepreciacionCentroCosto);
		this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto.jPanelid_empresaGastoDepreciacionCentroCosto.setVisible(this.gastodepreciacioncentrocostoConstantesFunciones.mostrarid_empresaGastoDepreciacionCentroCosto);
		//this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto.jComboBoxid_sucursalGastoDepreciacionCentroCosto.setVisible(this.gastodepreciacioncentrocostoConstantesFunciones.mostrarid_sucursalGastoDepreciacionCentroCosto);
		this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto.jPanelid_sucursalGastoDepreciacionCentroCosto.setVisible(this.gastodepreciacioncentrocostoConstantesFunciones.mostrarid_sucursalGastoDepreciacionCentroCosto);
		//this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto.jComboBoxid_centro_costoGastoDepreciacionCentroCosto.setVisible(this.gastodepreciacioncentrocostoConstantesFunciones.mostrarid_centro_costoGastoDepreciacionCentroCosto);
		this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto.jPanelid_centro_costoGastoDepreciacionCentroCosto.setVisible(this.gastodepreciacioncentrocostoConstantesFunciones.mostrarid_centro_costoGastoDepreciacionCentroCosto);
			this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto.jButtonid_centro_costoGastoDepreciacionCentroCosto.setVisible(this.gastodepreciacioncentrocostoConstantesFunciones.mostrarid_centro_costoGastoDepreciacionCentroCosto);
		//this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto.jComboBoxid_detalle_activo_fijoGastoDepreciacionCentroCosto.setVisible(this.gastodepreciacioncentrocostoConstantesFunciones.mostrarid_detalle_activo_fijoGastoDepreciacionCentroCosto);
		this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto.jPanelid_detalle_activo_fijoGastoDepreciacionCentroCosto.setVisible(this.gastodepreciacioncentrocostoConstantesFunciones.mostrarid_detalle_activo_fijoGastoDepreciacionCentroCosto);
		//this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto.jComboBoxid_cuenta_contableGastoDepreciacionCentroCosto.setVisible(this.gastodepreciacioncentrocostoConstantesFunciones.mostrarid_cuenta_contableGastoDepreciacionCentroCosto);
		this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto.jPanelid_cuenta_contableGastoDepreciacionCentroCosto.setVisible(this.gastodepreciacioncentrocostoConstantesFunciones.mostrarid_cuenta_contableGastoDepreciacionCentroCosto);
			this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto.jButtonid_cuenta_contableGastoDepreciacionCentroCosto.setVisible(this.gastodepreciacioncentrocostoConstantesFunciones.mostrarid_cuenta_contableGastoDepreciacionCentroCosto);
		//this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto.jTextFieldporcentajeGastoDepreciacionCentroCosto.setVisible(this.gastodepreciacioncentrocostoConstantesFunciones.mostrarporcentajeGastoDepreciacionCentroCosto);
		this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto.jPanelporcentajeGastoDepreciacionCentroCosto.setVisible(this.gastodepreciacioncentrocostoConstantesFunciones.mostrarporcentajeGastoDepreciacionCentroCosto);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioGastoDepreciacionCentroCosto() throws Exception {
		if(this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto!=null) {
	
		this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto.jLabelidGastoDepreciacionCentroCosto.setEnabled(this.gastodepreciacioncentrocostoConstantesFunciones.activaridGastoDepreciacionCentroCosto);
		this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto.jComboBoxid_empresaGastoDepreciacionCentroCosto.setEnabled(this.gastodepreciacioncentrocostoConstantesFunciones.activarid_empresaGastoDepreciacionCentroCosto);
		this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto.jComboBoxid_sucursalGastoDepreciacionCentroCosto.setEnabled(this.gastodepreciacioncentrocostoConstantesFunciones.activarid_sucursalGastoDepreciacionCentroCosto);
		this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto.jComboBoxid_centro_costoGastoDepreciacionCentroCosto.setEnabled(this.gastodepreciacioncentrocostoConstantesFunciones.activarid_centro_costoGastoDepreciacionCentroCosto);
			this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto.jButtonid_centro_costoGastoDepreciacionCentroCosto.setEnabled(this.gastodepreciacioncentrocostoConstantesFunciones.activarid_centro_costoGastoDepreciacionCentroCosto);
		this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto.jComboBoxid_detalle_activo_fijoGastoDepreciacionCentroCosto.setEnabled(this.gastodepreciacioncentrocostoConstantesFunciones.activarid_detalle_activo_fijoGastoDepreciacionCentroCosto);
		this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto.jComboBoxid_cuenta_contableGastoDepreciacionCentroCosto.setEnabled(this.gastodepreciacioncentrocostoConstantesFunciones.activarid_cuenta_contableGastoDepreciacionCentroCosto);
			this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto.jButtonid_cuenta_contableGastoDepreciacionCentroCosto.setEnabled(this.gastodepreciacioncentrocostoConstantesFunciones.activarid_cuenta_contableGastoDepreciacionCentroCosto);
		this.jInternalFrameDetalleFormGastoDepreciacionCentroCosto.jTextFieldporcentajeGastoDepreciacionCentroCosto.setEnabled(this.gastodepreciacioncentrocostoConstantesFunciones.activarporcentajeGastoDepreciacionCentroCosto);
		}
	}
	
		
}