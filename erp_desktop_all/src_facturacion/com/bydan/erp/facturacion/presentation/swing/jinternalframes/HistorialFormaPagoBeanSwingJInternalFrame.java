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

import com.bydan.erp.facturacion.util.HistorialFormaPagoConstantesFunciones;
import com.bydan.erp.facturacion.util.HistorialFormaPagoParameterReturnGeneral;
//import com.bydan.erp.facturacion.util.HistorialFormaPagoParameterGeneral;
//import com.bydan.erp.facturacion.presentation.report.source.HistorialFormaPagoBean;
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
import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.contabilidad.util.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class HistorialFormaPagoBeanSwingJInternalFrame extends HistorialFormaPagoJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(HistorialFormaPagoBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<HistorialFormaPago> historialformapagoValidator = new ClassValidator<HistorialFormaPago>(HistorialFormaPago.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public HistorialFormaPago historialformapago;	
	public HistorialFormaPago historialformapagoAux;
	public HistorialFormaPago historialformapagoAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public HistorialFormaPago historialformapagoTotales;
	public Long idHistorialFormaPagoActual;
	public Long iIdNuevoHistorialFormaPago=0L;
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

	public String sFinalQueryComboFactura="";

	public List<Factura> facturasForeignKey;

	public List<Factura> getfacturasForeignKey() {
		return facturasForeignKey;
	}

	public void setfacturasForeignKey(List<Factura> facturasForeignKey) {
		this.facturasForeignKey = facturasForeignKey;
	}

	//OBJETO FK ACTUAL
	public Factura facturaForeignKey;

	public Factura getfacturaForeignKey() {
		return facturaForeignKey;
	}

	public void setfacturaForeignKey(Factura facturaForeignKey) {
		this.facturaForeignKey = facturaForeignKey;
	}

	public String sFinalQueryComboTipoFormaPago="";

	public List<TipoFormaPago> tipoformapagosForeignKey;

	public List<TipoFormaPago> gettipoformapagosForeignKey() {
		return tipoformapagosForeignKey;
	}

	public void settipoformapagosForeignKey(List<TipoFormaPago> tipoformapagosForeignKey) {
		this.tipoformapagosForeignKey = tipoformapagosForeignKey;
	}

	//OBJETO FK ACTUAL
	public TipoFormaPago tipoformapagoForeignKey;

	public TipoFormaPago gettipoformapagoForeignKey() {
		return tipoformapagoForeignKey;
	}

	public void settipoformapagoForeignKey(TipoFormaPago tipoformapagoForeignKey) {
		this.tipoformapagoForeignKey = tipoformapagoForeignKey;
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

		
	
	
	
	//BUSQUEDA INTERNA FK
	public Long idFacturaActual=0L;

	public Long getidFacturaActual() {
		return idFacturaActual;
	}

	public void setidFacturaActual(Long idFacturaActual) {
		this.idFacturaActual= idFacturaActual;
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
	
	public Boolean isPermisoTodoHistorialFormaPago;
	public Boolean isPermisoNuevoHistorialFormaPago;
	public Boolean isPermisoActualizarHistorialFormaPago;
	public Boolean isPermisoActualizarOriginalHistorialFormaPago;
	public Boolean isPermisoEliminarHistorialFormaPago;
	public Boolean isPermisoGuardarCambiosHistorialFormaPago;
	public Boolean isPermisoConsultaHistorialFormaPago;
	public Boolean isPermisoBusquedaHistorialFormaPago;
	public Boolean isPermisoReporteHistorialFormaPago;
	public Boolean isPermisoPaginacionMedioHistorialFormaPago;
	public Boolean isPermisoPaginacionAltoHistorialFormaPago;
	public Boolean isPermisoPaginacionTodoHistorialFormaPago;
	public Boolean isPermisoCopiarHistorialFormaPago;
	public Boolean isPermisoVerFormHistorialFormaPago;
	public Boolean isPermisoDuplicarHistorialFormaPago;
	public Boolean isPermisoOrdenHistorialFormaPago;
	
	
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
	
	public HistorialFormaPagoParameterReturnGeneral historialformapagoReturnGeneral;
	public HistorialFormaPagoParameterReturnGeneral historialformapagoParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoHistorialFormaPago=false;
	public Boolean esParaAccionDesdeFormularioHistorialFormaPago=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected HistorialFormaPagoSessionBeanAdditional historialformapagoSessionBeanAdditional=null;
	
	public HistorialFormaPagoSessionBeanAdditional getHistorialFormaPagoSessionBeanAdditional() {
		return this.historialformapagoSessionBeanAdditional;
	}
	
	public void setHistorialFormaPagoSessionBeanAdditional(HistorialFormaPagoSessionBeanAdditional historialformapagoSessionBeanAdditional) {
		try {
			this.historialformapagoSessionBeanAdditional=historialformapagoSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected HistorialFormaPagoBeanSwingJInternalFrameAdditional historialformapagoBeanSwingJInternalFrameAdditional=null;
	//public class HistorialFormaPagoBeanSwingJInternalFrame
	
	public HistorialFormaPagoBeanSwingJInternalFrameAdditional getHistorialFormaPagoBeanSwingJInternalFrameAdditional() {
		return this.historialformapagoBeanSwingJInternalFrameAdditional;
	}
	
	public void setHistorialFormaPagoBeanSwingJInternalFrameAdditional(HistorialFormaPagoBeanSwingJInternalFrameAdditional historialformapagoBeanSwingJInternalFrameAdditional) {
		try {
			this.historialformapagoBeanSwingJInternalFrameAdditional=historialformapagoBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public HistorialFormaPagoLogic historialformapagoLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public HistorialFormaPago historialformapagoBean;
	public HistorialFormaPagoConstantesFunciones historialformapagoConstantesFunciones;
	//public HistorialFormaPagoParameterReturnGeneral historialformapagoReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	public SucursalLogic sucursalLogic;
	public EjercicioLogic ejercicioLogic;
	public PeriodoLogic periodoLogic;
	public FacturaLogic facturaLogic;
	public TipoFormaPagoLogic tipoformapagoLogic;
	public CuentaContableLogic cuentacontableLogic;
	public AnioLogic anioLogic;
	public MesLogic mesLogic;
	
	//PARAMETROS
	
	
	//public List<HistorialFormaPago> historialformapagos;	
	//public List<HistorialFormaPago> historialformapagosEliminados;
	//public List<HistorialFormaPago> historialformapagosAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoHistorialFormaPago=false;
	public Boolean isVisibilidadCeldaDuplicarHistorialFormaPago=true;
	public Boolean isVisibilidadCeldaCopiarHistorialFormaPago=true;
	public Boolean isVisibilidadCeldaVerFormHistorialFormaPago=true;
	public Boolean isVisibilidadCeldaOrdenHistorialFormaPago=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesHistorialFormaPago=false;
	public Boolean isVisibilidadCeldaModificarHistorialFormaPago=false;
	public Boolean isVisibilidadCeldaActualizarHistorialFormaPago=false;
	public Boolean isVisibilidadCeldaEliminarHistorialFormaPago=false;
	public Boolean isVisibilidadCeldaCancelarHistorialFormaPago=false;
	public Boolean isVisibilidadCeldaGuardarHistorialFormaPago=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosHistorialFormaPago=false;	
	
	
	public Boolean isVisibilidadFK_IdAnio=false;
	public Boolean isVisibilidadFK_IdCuentaContable=false;
	public Boolean isVisibilidadFK_IdEjercicio=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	public Boolean isVisibilidadFK_IdFactura=false;
	public Boolean isVisibilidadFK_IdMes=false;
	public Boolean isVisibilidadFK_IdPeriodo=false;
	public Boolean isVisibilidadFK_IdSucursal=false;
	public Boolean isVisibilidadFK_IdTipoFormaPago=false;
	
	public Long getiIdNuevoHistorialFormaPago() {
		return this.iIdNuevoHistorialFormaPago;
	}

	public void setiIdNuevoHistorialFormaPago(Long iIdNuevoHistorialFormaPago) {
		this.iIdNuevoHistorialFormaPago = iIdNuevoHistorialFormaPago;
	}
	
	public Long getidHistorialFormaPagoActual() {
		return this.idHistorialFormaPagoActual;
	}

	public void setidHistorialFormaPagoActual(Long idHistorialFormaPagoActual) {
		this.idHistorialFormaPagoActual = idHistorialFormaPagoActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public HistorialFormaPago gethistorialformapago() {
		return this.historialformapago;
	}

	public void sethistorialformapago(HistorialFormaPago historialformapago) {
		this.historialformapago = historialformapago;
	}
	
	public HistorialFormaPago gethistorialformapagoAux() {
		return this.historialformapagoAux;
	}

	public void sethistorialformapagoAux(HistorialFormaPago historialformapagoAux) {
		this.historialformapagoAux = historialformapagoAux;
	}				
	
	public HistorialFormaPago gethistorialformapagoAnterior() {
		return this.historialformapagoAnterior;
	}

	public void sethistorialformapagoAnterior(HistorialFormaPago historialformapagoAnterior) {
		this.historialformapagoAnterior = historialformapagoAnterior;
	}	
	
	public HistorialFormaPago gethistorialformapagoTotales() {
		return this.historialformapagoTotales;
	}

	public void sethistorialformapagoTotales(HistorialFormaPago historialformapagoTotales) {
		this.historialformapagoTotales = historialformapagoTotales;
	}	
	
	public HistorialFormaPago gethistorialformapagoBean() {
		return this.historialformapagoBean;
	}

	public void sethistorialformapagoBean(HistorialFormaPago historialformapagoBean) {
		this.historialformapagoBean = historialformapagoBean;
	}	
	
	public HistorialFormaPagoParameterReturnGeneral gethistorialformapagoReturnGeneral() {
		return this.historialformapagoReturnGeneral;
	}

	public void sethistorialformapagoReturnGeneral(HistorialFormaPagoParameterReturnGeneral historialformapagoReturnGeneral) {
		this.historialformapagoReturnGeneral = historialformapagoReturnGeneral;
	}	
	
	
	public Long id_anioFK_IdAnio=null;

	public Long getid_anioFK_IdAnio() {
		return this.id_anioFK_IdAnio;
	}

	public void setid_anioFK_IdAnio(Long id_anioFK_IdAnio) {
		this.id_anioFK_IdAnio = id_anioFK_IdAnio;
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

	public Long id_facturaFK_IdFactura=-1L;

	public Long getid_facturaFK_IdFactura() {
		return this.id_facturaFK_IdFactura;
	}

	public void setid_facturaFK_IdFactura(Long id_facturaFK_IdFactura) {
		this.id_facturaFK_IdFactura = id_facturaFK_IdFactura;
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

	public Long id_sucursalFK_IdSucursal=-1L;

	public Long getid_sucursalFK_IdSucursal() {
		return this.id_sucursalFK_IdSucursal;
	}

	public void setid_sucursalFK_IdSucursal(Long id_sucursalFK_IdSucursal) {
		this.id_sucursalFK_IdSucursal = id_sucursalFK_IdSucursal;
	}

	public Long id_tipo_forma_pagoFK_IdTipoFormaPago=-1L;

	public Long getid_tipo_forma_pagoFK_IdTipoFormaPago() {
		return this.id_tipo_forma_pagoFK_IdTipoFormaPago;
	}

	public void setid_tipo_forma_pagoFK_IdTipoFormaPago(Long id_tipo_forma_pagoFK_IdTipoFormaPago) {
		this.id_tipo_forma_pagoFK_IdTipoFormaPago = id_tipo_forma_pagoFK_IdTipoFormaPago;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public HistorialFormaPagoLogic getHistorialFormaPagoLogic()	{		
		return historialformapagoLogic;
	}

	public void setHistorialFormaPagoLogic(HistorialFormaPagoLogic historialformapagoLogic) {
		this.historialformapagoLogic = historialformapagoLogic;
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
	
	public Boolean getIsEsNuevoHistorialFormaPago() {
		return isEsNuevoHistorialFormaPago;
	}

	public void setIsEsNuevoHistorialFormaPago(Boolean isEsNuevoHistorialFormaPago) {
		this.isEsNuevoHistorialFormaPago = isEsNuevoHistorialFormaPago;
	}

	public Boolean getEsParaAccionDesdeFormularioHistorialFormaPago() {
		return esParaAccionDesdeFormularioHistorialFormaPago;
	}
	
	public void setEsParaAccionDesdeFormularioHistorialFormaPago(Boolean esParaAccionDesdeFormularioHistorialFormaPago) {
		this.esParaAccionDesdeFormularioHistorialFormaPago = esParaAccionDesdeFormularioHistorialFormaPago;
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

			if(this.historialformapagoSessionBean==null) {
				this.historialformapagoSessionBean=new HistorialFormaPagoSessionBean();
			}

			if(!this.historialformapagoSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(historialformapagoSessionBean.getlidEmpresaActual());
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

			if(this.historialformapagoSessionBean==null) {
				this.historialformapagoSessionBean=new HistorialFormaPagoSessionBean();
			}

			if(!this.historialformapagoSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
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
					sucursalLogic.getEntityWithConnection(historialformapagoSessionBean.getlidSucursalActual());
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

			if(this.historialformapagoSessionBean==null) {
				this.historialformapagoSessionBean=new HistorialFormaPagoSessionBean();
			}

			if(!this.historialformapagoSessionBean.getisBusquedaDesdeForeignKeySesionEjercicio()) {
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
					ejercicioLogic.getEntityWithConnection(historialformapagoSessionBean.getlidEjercicioActual());
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

			if(this.historialformapagoSessionBean==null) {
				this.historialformapagoSessionBean=new HistorialFormaPagoSessionBean();
			}

			if(!this.historialformapagoSessionBean.getisBusquedaDesdeForeignKeySesionPeriodo()) {
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
					periodoLogic.getEntityWithConnection(historialformapagoSessionBean.getlidPeriodoActual());
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

	public void cargarCombosFacturasForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.facturasForeignKey=new ArrayList<Factura>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			FacturaLogic facturaLogic=new FacturaLogic();

			//facturaLogic.getFacturaDataAccess().setIsForForeingKeyData(true);

			if(this.historialformapagoSessionBean==null) {
				this.historialformapagoSessionBean=new HistorialFormaPagoSessionBean();
			}

			if(!this.historialformapagoSessionBean.getisBusquedaDesdeForeignKeySesionFactura()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//facturaLogic.getFacturaDataAccess().setIsForForeingKeyData(true);

					facturaLogic.getTodosFacturasWithConnection(sFinalQuery,new Pagination());

					this.facturasForeignKey=facturaLogic.getFacturas();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaFactura(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					facturaLogic.getEntityWithConnection(historialformapagoSessionBean.getlidFacturaActual());
					this.facturasForeignKey.add(facturaLogic.getFactura());
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

	public void cargarCombosTipoFormaPagosForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.tipoformapagosForeignKey=new ArrayList<TipoFormaPago>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			TipoFormaPagoLogic tipoformapagoLogic=new TipoFormaPagoLogic();

			//tipoformapagoLogic.getTipoFormaPagoDataAccess().setIsForForeingKeyData(true);

			if(this.historialformapagoSessionBean==null) {
				this.historialformapagoSessionBean=new HistorialFormaPagoSessionBean();
			}

			if(!this.historialformapagoSessionBean.getisBusquedaDesdeForeignKeySesionTipoFormaPago()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//tipoformapagoLogic.getTipoFormaPagoDataAccess().setIsForForeingKeyData(true);

					tipoformapagoLogic.getTodosTipoFormaPagosWithConnection(sFinalQuery,new Pagination());

					this.tipoformapagosForeignKey=tipoformapagoLogic.getTipoFormaPagos();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaTipoFormaPago(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipoformapagoLogic.getEntityWithConnection(historialformapagoSessionBean.getlidTipoFormaPagoActual());
					this.tipoformapagosForeignKey.add(tipoformapagoLogic.getTipoFormaPago());
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

			if(this.historialformapagoSessionBean==null) {
				this.historialformapagoSessionBean=new HistorialFormaPagoSessionBean();
			}

			if(!this.historialformapagoSessionBean.getisBusquedaDesdeForeignKeySesionCuentaContable()) {
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
					cuentacontableLogic.getEntityWithConnection(historialformapagoSessionBean.getlidCuentaContableActual());
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

			if(this.historialformapagoSessionBean==null) {
				this.historialformapagoSessionBean=new HistorialFormaPagoSessionBean();
			}

			if(!this.historialformapagoSessionBean.getisBusquedaDesdeForeignKeySesionAnio()) {
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
					anioLogic.getEntityWithConnection(historialformapagoSessionBean.getlidAnioActual());
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

			if(this.historialformapagoSessionBean==null) {
				this.historialformapagoSessionBean=new HistorialFormaPagoSessionBean();
			}

			if(!this.historialformapagoSessionBean.getisBusquedaDesdeForeignKeySesionMes()) {
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
					mesLogic.getEntityWithConnection(historialformapagoSessionBean.getlidMesActual());
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

					if(this.historialformapago!=null) {
						this.historialformapago.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormHistorialFormaPago!=null) {
						this.jInternalFrameDetalleFormHistorialFormaPago.jComboBoxid_empresaHistorialFormaPago.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaHistorialFormaPago.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormHistorialFormaPago!=null) {
						if(this.jInternalFrameDetalleFormHistorialFormaPago.jComboBoxid_empresaHistorialFormaPago.getItemCount()>0) {
							this.jInternalFrameDetalleFormHistorialFormaPago.jComboBoxid_empresaHistorialFormaPago.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaHistorialFormaPagoGenerico)throws Exception
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
				jComboBoxid_empresaHistorialFormaPagoGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaHistorialFormaPagoGenerico!=null && jComboBoxid_empresaHistorialFormaPagoGenerico.getItemCount()>0) {
					jComboBoxid_empresaHistorialFormaPagoGenerico.setSelectedIndex(0);
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

					if(this.historialformapago!=null) {
						this.historialformapago.setSucursal(sucursalTemp);
					}

					if(this.jInternalFrameDetalleFormHistorialFormaPago!=null) {
						this.jInternalFrameDetalleFormHistorialFormaPago.jComboBoxid_sucursalHistorialFormaPago.setSelectedItem(sucursalTemp);
					}
				} else {
					//jComboBoxid_sucursalHistorialFormaPago.setSelectedItem(sucursalTemp);
					if(this.jInternalFrameDetalleFormHistorialFormaPago!=null) {
						if(this.jInternalFrameDetalleFormHistorialFormaPago.jComboBoxid_sucursalHistorialFormaPago.getItemCount()>0) {
							this.jInternalFrameDetalleFormHistorialFormaPago.jComboBoxid_sucursalHistorialFormaPago.setSelectedIndex(0);
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
	public void setActualSucursalForeignKeyGenerico(Long idSucursalSeleccionado,JComboBox jComboBoxid_sucursalHistorialFormaPagoGenerico)throws Exception
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
				jComboBoxid_sucursalHistorialFormaPagoGenerico.setSelectedItem(sucursalTemp);
			} else {
				if(jComboBoxid_sucursalHistorialFormaPagoGenerico!=null && jComboBoxid_sucursalHistorialFormaPagoGenerico.getItemCount()>0) {
					jComboBoxid_sucursalHistorialFormaPagoGenerico.setSelectedIndex(0);
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

					if(this.historialformapago!=null) {
						this.historialformapago.setEjercicio(ejercicioTemp);
					}

					if(this.jInternalFrameDetalleFormHistorialFormaPago!=null) {
						this.jInternalFrameDetalleFormHistorialFormaPago.jComboBoxid_ejercicioHistorialFormaPago.setSelectedItem(ejercicioTemp);
					}
				} else {
					//jComboBoxid_ejercicioHistorialFormaPago.setSelectedItem(ejercicioTemp);
					if(this.jInternalFrameDetalleFormHistorialFormaPago!=null) {
						if(this.jInternalFrameDetalleFormHistorialFormaPago.jComboBoxid_ejercicioHistorialFormaPago.getItemCount()>0) {
							this.jInternalFrameDetalleFormHistorialFormaPago.jComboBoxid_ejercicioHistorialFormaPago.setSelectedIndex(0);
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
	public void setActualEjercicioForeignKeyGenerico(Long idEjercicioSeleccionado,JComboBox jComboBoxid_ejercicioHistorialFormaPagoGenerico)throws Exception
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
				jComboBoxid_ejercicioHistorialFormaPagoGenerico.setSelectedItem(ejercicioTemp);
			} else {
				if(jComboBoxid_ejercicioHistorialFormaPagoGenerico!=null && jComboBoxid_ejercicioHistorialFormaPagoGenerico.getItemCount()>0) {
					jComboBoxid_ejercicioHistorialFormaPagoGenerico.setSelectedIndex(0);
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

					if(this.historialformapago!=null) {
						this.historialformapago.setPeriodo(periodoTemp);
					}

					if(this.jInternalFrameDetalleFormHistorialFormaPago!=null) {
						this.jInternalFrameDetalleFormHistorialFormaPago.jComboBoxid_periodoHistorialFormaPago.setSelectedItem(periodoTemp);
					}
				} else {
					//jComboBoxid_periodoHistorialFormaPago.setSelectedItem(periodoTemp);
					if(this.jInternalFrameDetalleFormHistorialFormaPago!=null) {
						if(this.jInternalFrameDetalleFormHistorialFormaPago.jComboBoxid_periodoHistorialFormaPago.getItemCount()>0) {
							this.jInternalFrameDetalleFormHistorialFormaPago.jComboBoxid_periodoHistorialFormaPago.setSelectedIndex(0);
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
	public void setActualPeriodoForeignKeyGenerico(Long idPeriodoSeleccionado,JComboBox jComboBoxid_periodoHistorialFormaPagoGenerico)throws Exception
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
				jComboBoxid_periodoHistorialFormaPagoGenerico.setSelectedItem(periodoTemp);
			} else {
				if(jComboBoxid_periodoHistorialFormaPagoGenerico!=null && jComboBoxid_periodoHistorialFormaPagoGenerico.getItemCount()>0) {
					jComboBoxid_periodoHistorialFormaPagoGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualFacturaForeignKey(Long idFacturaSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Factura  facturaTemp=null;

			for(Factura facturaAux:facturasForeignKey) {
				if(facturaAux.getId()!=null && facturaAux.getId().equals(idFacturaSeleccionado)) {
					facturaTemp=facturaAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(facturaTemp!=null) {

					if(this.historialformapago!=null) {
						this.historialformapago.setFactura(facturaTemp);
					}

					if(this.jInternalFrameDetalleFormHistorialFormaPago!=null) {
						this.jInternalFrameDetalleFormHistorialFormaPago.jComboBoxid_facturaHistorialFormaPago.setSelectedItem(facturaTemp);
					}
				} else {
					//jComboBoxid_facturaHistorialFormaPago.setSelectedItem(facturaTemp);
					if(this.jInternalFrameDetalleFormHistorialFormaPago!=null) {
						if(this.jInternalFrameDetalleFormHistorialFormaPago.jComboBoxid_facturaHistorialFormaPago.getItemCount()>0) {
							this.jInternalFrameDetalleFormHistorialFormaPago.jComboBoxid_facturaHistorialFormaPago.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdFactura") || sFormularioTipoBusqueda.equals("Todos")){
					if(facturaTemp!=null && jComboBoxid_facturaFK_IdFacturaHistorialFormaPago!=null) {
						jComboBoxid_facturaFK_IdFacturaHistorialFormaPago.setSelectedItem(facturaTemp);
					} else {
						if(jComboBoxid_facturaFK_IdFacturaHistorialFormaPago!=null) {
							//jComboBoxid_facturaFK_IdFacturaHistorialFormaPago.setSelectedItem(facturaTemp);
							if(jComboBoxid_facturaFK_IdFacturaHistorialFormaPago.getItemCount()>0) {
								jComboBoxid_facturaFK_IdFacturaHistorialFormaPago.setSelectedIndex(0);
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

	public String getActualFacturaForeignKeyDescripcion(Long idFacturaSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Factura  facturaTemp=null;

			for(Factura facturaAux:facturasForeignKey) {
				if(facturaAux.getId()!=null && facturaAux.getId().equals(idFacturaSeleccionado)) {
					facturaTemp=facturaAux;
					break;
				}
			}


			sDescripcion=FacturaConstantesFunciones.getFacturaDescripcion(facturaTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualFacturaForeignKeyGenerico(Long idFacturaSeleccionado,JComboBox jComboBoxid_facturaHistorialFormaPagoGenerico)throws Exception
	{
		try
		{
			Factura  facturaTemp=null;

			for(Factura facturaAux:facturasForeignKey) {
				if(facturaAux.getId()!=null && facturaAux.getId().equals(idFacturaSeleccionado)) {
					facturaTemp=facturaAux;
					break;
				}
			}

			if(facturaTemp!=null) {
				jComboBoxid_facturaHistorialFormaPagoGenerico.setSelectedItem(facturaTemp);
			} else {
				if(jComboBoxid_facturaHistorialFormaPagoGenerico!=null && jComboBoxid_facturaHistorialFormaPagoGenerico.getItemCount()>0) {
					jComboBoxid_facturaHistorialFormaPagoGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualTipoFormaPagoForeignKey(Long idTipoFormaPagoSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			TipoFormaPago  tipoformapagoTemp=null;

			for(TipoFormaPago tipoformapagoAux:tipoformapagosForeignKey) {
				if(tipoformapagoAux.getId()!=null && tipoformapagoAux.getId().equals(idTipoFormaPagoSeleccionado)) {
					tipoformapagoTemp=tipoformapagoAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(tipoformapagoTemp!=null) {

					if(this.historialformapago!=null) {
						this.historialformapago.setTipoFormaPago(tipoformapagoTemp);
					}

					if(this.jInternalFrameDetalleFormHistorialFormaPago!=null) {
						this.jInternalFrameDetalleFormHistorialFormaPago.jComboBoxid_tipo_forma_pagoHistorialFormaPago.setSelectedItem(tipoformapagoTemp);
					}
				} else {
					//jComboBoxid_tipo_forma_pagoHistorialFormaPago.setSelectedItem(tipoformapagoTemp);
					if(this.jInternalFrameDetalleFormHistorialFormaPago!=null) {
						if(this.jInternalFrameDetalleFormHistorialFormaPago.jComboBoxid_tipo_forma_pagoHistorialFormaPago.getItemCount()>0) {
							this.jInternalFrameDetalleFormHistorialFormaPago.jComboBoxid_tipo_forma_pagoHistorialFormaPago.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdTipoFormaPago") || sFormularioTipoBusqueda.equals("Todos")){
					if(tipoformapagoTemp!=null && jComboBoxid_tipo_forma_pagoFK_IdTipoFormaPagoHistorialFormaPago!=null) {
						jComboBoxid_tipo_forma_pagoFK_IdTipoFormaPagoHistorialFormaPago.setSelectedItem(tipoformapagoTemp);
					} else {
						if(jComboBoxid_tipo_forma_pagoFK_IdTipoFormaPagoHistorialFormaPago!=null) {
							//jComboBoxid_tipo_forma_pagoFK_IdTipoFormaPagoHistorialFormaPago.setSelectedItem(tipoformapagoTemp);
							if(jComboBoxid_tipo_forma_pagoFK_IdTipoFormaPagoHistorialFormaPago.getItemCount()>0) {
								jComboBoxid_tipo_forma_pagoFK_IdTipoFormaPagoHistorialFormaPago.setSelectedIndex(0);
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

	public String getActualTipoFormaPagoForeignKeyDescripcion(Long idTipoFormaPagoSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			TipoFormaPago  tipoformapagoTemp=null;

			for(TipoFormaPago tipoformapagoAux:tipoformapagosForeignKey) {
				if(tipoformapagoAux.getId()!=null && tipoformapagoAux.getId().equals(idTipoFormaPagoSeleccionado)) {
					tipoformapagoTemp=tipoformapagoAux;
					break;
				}
			}


			sDescripcion=TipoFormaPagoConstantesFunciones.getTipoFormaPagoDescripcion(tipoformapagoTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualTipoFormaPagoForeignKeyGenerico(Long idTipoFormaPagoSeleccionado,JComboBox jComboBoxid_tipo_forma_pagoHistorialFormaPagoGenerico)throws Exception
	{
		try
		{
			TipoFormaPago  tipoformapagoTemp=null;

			for(TipoFormaPago tipoformapagoAux:tipoformapagosForeignKey) {
				if(tipoformapagoAux.getId()!=null && tipoformapagoAux.getId().equals(idTipoFormaPagoSeleccionado)) {
					tipoformapagoTemp=tipoformapagoAux;
					break;
				}
			}

			if(tipoformapagoTemp!=null) {
				jComboBoxid_tipo_forma_pagoHistorialFormaPagoGenerico.setSelectedItem(tipoformapagoTemp);
			} else {
				if(jComboBoxid_tipo_forma_pagoHistorialFormaPagoGenerico!=null && jComboBoxid_tipo_forma_pagoHistorialFormaPagoGenerico.getItemCount()>0) {
					jComboBoxid_tipo_forma_pagoHistorialFormaPagoGenerico.setSelectedIndex(0);
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

					if(this.historialformapago!=null) {
						this.historialformapago.setCuentaContable(cuentacontableTemp);
					}

					if(this.jInternalFrameDetalleFormHistorialFormaPago!=null) {
						this.jInternalFrameDetalleFormHistorialFormaPago.jComboBoxid_cuenta_contableHistorialFormaPago.setSelectedItem(cuentacontableTemp);
					}
				} else {
					//jComboBoxid_cuenta_contableHistorialFormaPago.setSelectedItem(cuentacontableTemp);
					if(this.jInternalFrameDetalleFormHistorialFormaPago!=null) {
						if(this.jInternalFrameDetalleFormHistorialFormaPago.jComboBoxid_cuenta_contableHistorialFormaPago.getItemCount()>0) {
							this.jInternalFrameDetalleFormHistorialFormaPago.jComboBoxid_cuenta_contableHistorialFormaPago.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdCuentaContable") || sFormularioTipoBusqueda.equals("Todos")){
					if(cuentacontableTemp!=null && jComboBoxid_cuenta_contableFK_IdCuentaContableHistorialFormaPago!=null) {
						jComboBoxid_cuenta_contableFK_IdCuentaContableHistorialFormaPago.setSelectedItem(cuentacontableTemp);
					} else {
						if(jComboBoxid_cuenta_contableFK_IdCuentaContableHistorialFormaPago!=null) {
							//jComboBoxid_cuenta_contableFK_IdCuentaContableHistorialFormaPago.setSelectedItem(cuentacontableTemp);
							if(jComboBoxid_cuenta_contableFK_IdCuentaContableHistorialFormaPago.getItemCount()>0) {
								jComboBoxid_cuenta_contableFK_IdCuentaContableHistorialFormaPago.setSelectedIndex(0);
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
	public void setActualCuentaContableForeignKeyGenerico(Long idCuentaContableSeleccionado,JComboBox jComboBoxid_cuenta_contableHistorialFormaPagoGenerico)throws Exception
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
				jComboBoxid_cuenta_contableHistorialFormaPagoGenerico.setSelectedItem(cuentacontableTemp);
			} else {
				if(jComboBoxid_cuenta_contableHistorialFormaPagoGenerico!=null && jComboBoxid_cuenta_contableHistorialFormaPagoGenerico.getItemCount()>0) {
					jComboBoxid_cuenta_contableHistorialFormaPagoGenerico.setSelectedIndex(0);
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

					if(this.historialformapago!=null) {
						this.historialformapago.setAnio(anioTemp);
					}

					if(this.jInternalFrameDetalleFormHistorialFormaPago!=null) {
						this.jInternalFrameDetalleFormHistorialFormaPago.jComboBoxid_anioHistorialFormaPago.setSelectedItem(anioTemp);
					}
				} else {
					//jComboBoxid_anioHistorialFormaPago.setSelectedItem(anioTemp);
					if(this.jInternalFrameDetalleFormHistorialFormaPago!=null) {
						if(this.jInternalFrameDetalleFormHistorialFormaPago.jComboBoxid_anioHistorialFormaPago.getItemCount()>0) {
							this.jInternalFrameDetalleFormHistorialFormaPago.jComboBoxid_anioHistorialFormaPago.setSelectedIndex(0);
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
	public void setActualAnioForeignKeyGenerico(Long idAnioSeleccionado,JComboBox jComboBoxid_anioHistorialFormaPagoGenerico)throws Exception
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
				jComboBoxid_anioHistorialFormaPagoGenerico.setSelectedItem(anioTemp);
			} else {
				if(jComboBoxid_anioHistorialFormaPagoGenerico!=null && jComboBoxid_anioHistorialFormaPagoGenerico.getItemCount()>0) {
					jComboBoxid_anioHistorialFormaPagoGenerico.setSelectedIndex(0);
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

					if(this.historialformapago!=null) {
						this.historialformapago.setMes(mesTemp);
					}

					if(this.jInternalFrameDetalleFormHistorialFormaPago!=null) {
						this.jInternalFrameDetalleFormHistorialFormaPago.jComboBoxid_mesHistorialFormaPago.setSelectedItem(mesTemp);
					}
				} else {
					//jComboBoxid_mesHistorialFormaPago.setSelectedItem(mesTemp);
					if(this.jInternalFrameDetalleFormHistorialFormaPago!=null) {
						if(this.jInternalFrameDetalleFormHistorialFormaPago.jComboBoxid_mesHistorialFormaPago.getItemCount()>0) {
							this.jInternalFrameDetalleFormHistorialFormaPago.jComboBoxid_mesHistorialFormaPago.setSelectedIndex(0);
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
	public void setActualMesForeignKeyGenerico(Long idMesSeleccionado,JComboBox jComboBoxid_mesHistorialFormaPagoGenerico)throws Exception
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
				jComboBoxid_mesHistorialFormaPagoGenerico.setSelectedItem(mesTemp);
			} else {
				if(jComboBoxid_mesHistorialFormaPagoGenerico!=null && jComboBoxid_mesHistorialFormaPagoGenerico.getItemCount()>0) {
					jComboBoxid_mesHistorialFormaPagoGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(HistorialFormaPago historialformapago,JComboBox jComboBoxid_empresaHistorialFormaPagoGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaHistorialFormaPagoGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormHistorialFormaPago.jComboBoxid_empresaHistorialFormaPago.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaHistorialFormaPagoGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				historialformapago.setid_empresa(empresaAux.getId());
				historialformapago.setempresa_descripcion(HistorialFormaPagoConstantesFunciones.getEmpresaDescripcion(empresaAux));
				historialformapago.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarSucursalForeignKey(HistorialFormaPago historialformapago,JComboBox jComboBoxid_sucursalHistorialFormaPagoGenerico)throws Exception
	{
		try
		{
			Sucursal  sucursalAux=new Sucursal();

			if(jComboBoxid_sucursalHistorialFormaPagoGenerico==null) {
				sucursalAux=(Sucursal)this.jInternalFrameDetalleFormHistorialFormaPago.jComboBoxid_sucursalHistorialFormaPago.getSelectedItem();
			} else {
				sucursalAux=(Sucursal)jComboBoxid_sucursalHistorialFormaPagoGenerico.getSelectedItem();
			}

			if(sucursalAux!=null && sucursalAux.getId()!=null) {
				historialformapago.setid_sucursal(sucursalAux.getId());
				historialformapago.setsucursal_descripcion(HistorialFormaPagoConstantesFunciones.getSucursalDescripcion(sucursalAux));
				historialformapago.setSucursal(sucursalAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEjercicioForeignKey(HistorialFormaPago historialformapago,JComboBox jComboBoxid_ejercicioHistorialFormaPagoGenerico)throws Exception
	{
		try
		{
			Ejercicio  ejercicioAux=new Ejercicio();

			if(jComboBoxid_ejercicioHistorialFormaPagoGenerico==null) {
				ejercicioAux=(Ejercicio)this.jInternalFrameDetalleFormHistorialFormaPago.jComboBoxid_ejercicioHistorialFormaPago.getSelectedItem();
			} else {
				ejercicioAux=(Ejercicio)jComboBoxid_ejercicioHistorialFormaPagoGenerico.getSelectedItem();
			}

			if(ejercicioAux!=null && ejercicioAux.getId()!=null) {
				historialformapago.setid_ejercicio(ejercicioAux.getId());
				historialformapago.setejercicio_descripcion(HistorialFormaPagoConstantesFunciones.getEjercicioDescripcion(ejercicioAux));
				historialformapago.setEjercicio(ejercicioAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarPeriodoForeignKey(HistorialFormaPago historialformapago,JComboBox jComboBoxid_periodoHistorialFormaPagoGenerico)throws Exception
	{
		try
		{
			Periodo  periodoAux=new Periodo();

			if(jComboBoxid_periodoHistorialFormaPagoGenerico==null) {
				periodoAux=(Periodo)this.jInternalFrameDetalleFormHistorialFormaPago.jComboBoxid_periodoHistorialFormaPago.getSelectedItem();
			} else {
				periodoAux=(Periodo)jComboBoxid_periodoHistorialFormaPagoGenerico.getSelectedItem();
			}

			if(periodoAux!=null && periodoAux.getId()!=null) {
				if(periodoAux.getid_estado_periodo().equals(0L)) {
					throw new Exception("Periodo INACTIVO, NO PUEDE GUARDAR LA INFORMACION CONSULTE CON EL ADMINISTRADOR");
				}

				historialformapago.setid_periodo(periodoAux.getId());
				historialformapago.setperiodo_descripcion(HistorialFormaPagoConstantesFunciones.getPeriodoDescripcion(periodoAux));
				historialformapago.setPeriodo(periodoAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarFacturaForeignKey(HistorialFormaPago historialformapago,JComboBox jComboBoxid_facturaHistorialFormaPagoGenerico)throws Exception
	{
		try
		{
			Factura  facturaAux=new Factura();

			if(jComboBoxid_facturaHistorialFormaPagoGenerico==null) {
				facturaAux=(Factura)this.jInternalFrameDetalleFormHistorialFormaPago.jComboBoxid_facturaHistorialFormaPago.getSelectedItem();
			} else {
				facturaAux=(Factura)jComboBoxid_facturaHistorialFormaPagoGenerico.getSelectedItem();
			}

			if(facturaAux!=null && facturaAux.getId()!=null) {
				historialformapago.setid_factura(facturaAux.getId());
				historialformapago.setfactura_descripcion(HistorialFormaPagoConstantesFunciones.getFacturaDescripcion(facturaAux));
				historialformapago.setFactura(facturaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarTipoFormaPagoForeignKey(HistorialFormaPago historialformapago,JComboBox jComboBoxid_tipo_forma_pagoHistorialFormaPagoGenerico)throws Exception
	{
		try
		{
			TipoFormaPago  tipoformapagoAux=new TipoFormaPago();

			if(jComboBoxid_tipo_forma_pagoHistorialFormaPagoGenerico==null) {
				tipoformapagoAux=(TipoFormaPago)this.jInternalFrameDetalleFormHistorialFormaPago.jComboBoxid_tipo_forma_pagoHistorialFormaPago.getSelectedItem();
			} else {
				tipoformapagoAux=(TipoFormaPago)jComboBoxid_tipo_forma_pagoHistorialFormaPagoGenerico.getSelectedItem();
			}

			if(tipoformapagoAux!=null && tipoformapagoAux.getId()!=null) {
				historialformapago.setid_tipo_forma_pago(tipoformapagoAux.getId());
				historialformapago.settipoformapago_descripcion(HistorialFormaPagoConstantesFunciones.getTipoFormaPagoDescripcion(tipoformapagoAux));
				historialformapago.setTipoFormaPago(tipoformapagoAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarCuentaContableForeignKey(HistorialFormaPago historialformapago,JComboBox jComboBoxid_cuenta_contableHistorialFormaPagoGenerico)throws Exception
	{
		try
		{
			CuentaContable  cuentacontableAux=new CuentaContable();

			if(jComboBoxid_cuenta_contableHistorialFormaPagoGenerico==null) {
				cuentacontableAux=(CuentaContable)this.jInternalFrameDetalleFormHistorialFormaPago.jComboBoxid_cuenta_contableHistorialFormaPago.getSelectedItem();
			} else {
				cuentacontableAux=(CuentaContable)jComboBoxid_cuenta_contableHistorialFormaPagoGenerico.getSelectedItem();
			}

			if(cuentacontableAux!=null && cuentacontableAux.getId()!=null) {
				historialformapago.setid_cuenta_contable(cuentacontableAux.getId());
				historialformapago.setcuentacontable_descripcion(HistorialFormaPagoConstantesFunciones.getCuentaContableDescripcion(cuentacontableAux));
				historialformapago.setCuentaContable(cuentacontableAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarAnioForeignKey(HistorialFormaPago historialformapago,JComboBox jComboBoxid_anioHistorialFormaPagoGenerico)throws Exception
	{
		try
		{
			Anio  anioAux=new Anio();

			if(jComboBoxid_anioHistorialFormaPagoGenerico==null) {
				anioAux=(Anio)this.jInternalFrameDetalleFormHistorialFormaPago.jComboBoxid_anioHistorialFormaPago.getSelectedItem();
			} else {
				anioAux=(Anio)jComboBoxid_anioHistorialFormaPagoGenerico.getSelectedItem();
			}

			if(anioAux!=null) {
				historialformapago.setid_anio(anioAux.getId());
				historialformapago.setanio_descripcion(HistorialFormaPagoConstantesFunciones.getAnioDescripcion(anioAux));
				historialformapago.setAnio(anioAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarMesForeignKey(HistorialFormaPago historialformapago,JComboBox jComboBoxid_mesHistorialFormaPagoGenerico)throws Exception
	{
		try
		{
			Mes  mesAux=new Mes();

			if(jComboBoxid_mesHistorialFormaPagoGenerico==null) {
				mesAux=(Mes)this.jInternalFrameDetalleFormHistorialFormaPago.jComboBoxid_mesHistorialFormaPago.getSelectedItem();
			} else {
				mesAux=(Mes)jComboBoxid_mesHistorialFormaPagoGenerico.getSelectedItem();
			}

			if(mesAux!=null) {
				historialformapago.setid_mes(mesAux.getId());
				historialformapago.setmes_descripcion(HistorialFormaPagoConstantesFunciones.getMesDescripcion(mesAux));
				historialformapago.setMes(mesAux);			}
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

					if(!HistorialFormaPagoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormHistorialFormaPago!=null) { 
							this.jInternalFrameDetalleFormHistorialFormaPago.jComboBoxid_empresaHistorialFormaPago.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormHistorialFormaPago.jComboBoxid_empresaHistorialFormaPago.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormHistorialFormaPago!=null) { 
					}

					if(!HistorialFormaPagoJInternalFrame.ISBINDING_MANUAL) {
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

					if(!HistorialFormaPagoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormHistorialFormaPago!=null) { 
							this.jInternalFrameDetalleFormHistorialFormaPago.jComboBoxid_sucursalHistorialFormaPago.removeAllItems();

							for(Sucursal sucursal:this.sucursalsForeignKey) {
								this.jInternalFrameDetalleFormHistorialFormaPago.jComboBoxid_sucursalHistorialFormaPago.addItem(sucursal);
							}
						}
					}

					if(this.jInternalFrameDetalleFormHistorialFormaPago!=null) { 
					}

					if(!HistorialFormaPagoJInternalFrame.ISBINDING_MANUAL) {
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

					if(!HistorialFormaPagoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormHistorialFormaPago!=null) { 
							this.jInternalFrameDetalleFormHistorialFormaPago.jComboBoxid_ejercicioHistorialFormaPago.removeAllItems();

							for(Ejercicio ejercicio:this.ejerciciosForeignKey) {
								this.jInternalFrameDetalleFormHistorialFormaPago.jComboBoxid_ejercicioHistorialFormaPago.addItem(ejercicio);
							}
						}
					}

					if(this.jInternalFrameDetalleFormHistorialFormaPago!=null) { 
					}

					if(!HistorialFormaPagoJInternalFrame.ISBINDING_MANUAL) {
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

					if(!HistorialFormaPagoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormHistorialFormaPago!=null) { 
							this.jInternalFrameDetalleFormHistorialFormaPago.jComboBoxid_periodoHistorialFormaPago.removeAllItems();

							for(Periodo periodo:this.periodosForeignKey) {
								this.jInternalFrameDetalleFormHistorialFormaPago.jComboBoxid_periodoHistorialFormaPago.addItem(periodo);
							}
						}
					}

					if(this.jInternalFrameDetalleFormHistorialFormaPago!=null) { 
					}

					if(!HistorialFormaPagoJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameFacturasForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingFactura=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!HistorialFormaPagoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormHistorialFormaPago!=null) { 
							this.jInternalFrameDetalleFormHistorialFormaPago.jComboBoxid_facturaHistorialFormaPago.removeAllItems();

							for(Factura factura:this.facturasForeignKey) {
								this.jInternalFrameDetalleFormHistorialFormaPago.jComboBoxid_facturaHistorialFormaPago.addItem(factura);
							}
						}
					}

					if(this.jInternalFrameDetalleFormHistorialFormaPago!=null) { 
					}

					if(!HistorialFormaPagoJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdFactura") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!HistorialFormaPagoJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_facturaFK_IdFacturaHistorialFormaPago.removeAllItems();

							for(Factura factura:this.facturasForeignKey) {
								this.jComboBoxid_facturaFK_IdFacturaHistorialFormaPago.addItem(factura);
							}
						}

						if(!HistorialFormaPagoJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameTipoFormaPagosForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingTipoFormaPago=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!HistorialFormaPagoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormHistorialFormaPago!=null) { 
							this.jInternalFrameDetalleFormHistorialFormaPago.jComboBoxid_tipo_forma_pagoHistorialFormaPago.removeAllItems();

							for(TipoFormaPago tipoformapago:this.tipoformapagosForeignKey) {
								this.jInternalFrameDetalleFormHistorialFormaPago.jComboBoxid_tipo_forma_pagoHistorialFormaPago.addItem(tipoformapago);
							}
						}
					}

					if(this.jInternalFrameDetalleFormHistorialFormaPago!=null) { 
					}

					if(!HistorialFormaPagoJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdTipoFormaPago") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!HistorialFormaPagoJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_tipo_forma_pagoFK_IdTipoFormaPagoHistorialFormaPago.removeAllItems();

							for(TipoFormaPago tipoformapago:this.tipoformapagosForeignKey) {
								this.jComboBoxid_tipo_forma_pagoFK_IdTipoFormaPagoHistorialFormaPago.addItem(tipoformapago);
							}
						}

						if(!HistorialFormaPagoJInternalFrame.ISBINDING_MANUAL) {
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

					if(!HistorialFormaPagoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormHistorialFormaPago!=null) { 
							this.jInternalFrameDetalleFormHistorialFormaPago.jComboBoxid_cuenta_contableHistorialFormaPago.removeAllItems();

							for(CuentaContable cuentacontable:this.cuentacontablesForeignKey) {
								this.jInternalFrameDetalleFormHistorialFormaPago.jComboBoxid_cuenta_contableHistorialFormaPago.addItem(cuentacontable);
							}
						}
					}

					if(this.jInternalFrameDetalleFormHistorialFormaPago!=null) { 
					}

					if(!HistorialFormaPagoJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdCuentaContable") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!HistorialFormaPagoJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_cuenta_contableFK_IdCuentaContableHistorialFormaPago.removeAllItems();

							for(CuentaContable cuentacontable:this.cuentacontablesForeignKey) {
								this.jComboBoxid_cuenta_contableFK_IdCuentaContableHistorialFormaPago.addItem(cuentacontable);
							}
						}

						if(!HistorialFormaPagoJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

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

					if(!HistorialFormaPagoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormHistorialFormaPago!=null) { 
							this.jInternalFrameDetalleFormHistorialFormaPago.jComboBoxid_anioHistorialFormaPago.removeAllItems();

							for(Anio anio:this.aniosForeignKey) {
								this.jInternalFrameDetalleFormHistorialFormaPago.jComboBoxid_anioHistorialFormaPago.addItem(anio);
							}
						}
					}

					if(this.jInternalFrameDetalleFormHistorialFormaPago!=null) { 
					}

					if(!HistorialFormaPagoJInternalFrame.ISBINDING_MANUAL) {
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

					if(!HistorialFormaPagoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormHistorialFormaPago!=null) { 
							this.jInternalFrameDetalleFormHistorialFormaPago.jComboBoxid_mesHistorialFormaPago.removeAllItems();

							for(Mes mes:this.messForeignKey) {
								this.jInternalFrameDetalleFormHistorialFormaPago.jComboBoxid_mesHistorialFormaPago.addItem(mes);
							}
						}
					}

					if(this.jInternalFrameDetalleFormHistorialFormaPago!=null) { 
					}

					if(!HistorialFormaPagoJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

	


		public void setSelectedItemCombosFrameEmpresaForeignKey(Empresa empresa,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormHistorialFormaPago!=null) {
							this.jInternalFrameDetalleFormHistorialFormaPago.jComboBoxid_empresaHistorialFormaPago.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormHistorialFormaPago!=null) {
							this.jInternalFrameDetalleFormHistorialFormaPago.jComboBoxid_empresaHistorialFormaPago.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormHistorialFormaPago!=null) {
							this.jInternalFrameDetalleFormHistorialFormaPago.jComboBoxid_sucursalHistorialFormaPago.setSelectedItem(sucursal);
						}
					} else {
						if(this.jInternalFrameDetalleFormHistorialFormaPago!=null) {
							this.jInternalFrameDetalleFormHistorialFormaPago.jComboBoxid_sucursalHistorialFormaPago.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormHistorialFormaPago!=null) {
							this.jInternalFrameDetalleFormHistorialFormaPago.jComboBoxid_ejercicioHistorialFormaPago.setSelectedItem(ejercicio);
						}
					} else {
						if(this.jInternalFrameDetalleFormHistorialFormaPago!=null) {
							this.jInternalFrameDetalleFormHistorialFormaPago.jComboBoxid_ejercicioHistorialFormaPago.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormHistorialFormaPago!=null) {
							this.jInternalFrameDetalleFormHistorialFormaPago.jComboBoxid_periodoHistorialFormaPago.setSelectedItem(periodo);
						}
					} else {
						if(this.jInternalFrameDetalleFormHistorialFormaPago!=null) {
							this.jInternalFrameDetalleFormHistorialFormaPago.jComboBoxid_periodoHistorialFormaPago.setSelectedIndex(iIndexSelected);
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

		public void setSelectedItemCombosFrameFacturaForeignKey(Factura factura,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormHistorialFormaPago!=null) {
							this.jInternalFrameDetalleFormHistorialFormaPago.jComboBoxid_facturaHistorialFormaPago.setSelectedItem(factura);
						}
					} else {
						if(this.jInternalFrameDetalleFormHistorialFormaPago!=null) {
							this.jInternalFrameDetalleFormHistorialFormaPago.jComboBoxid_facturaHistorialFormaPago.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_facturaFK_IdFacturaHistorialFormaPago.setSelectedItem(factura);
						} else {
							this.jComboBoxid_facturaFK_IdFacturaHistorialFormaPago.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameTipoFormaPagoForeignKey(TipoFormaPago tipoformapago,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormHistorialFormaPago!=null) {
							this.jInternalFrameDetalleFormHistorialFormaPago.jComboBoxid_tipo_forma_pagoHistorialFormaPago.setSelectedItem(tipoformapago);
						}
					} else {
						if(this.jInternalFrameDetalleFormHistorialFormaPago!=null) {
							this.jInternalFrameDetalleFormHistorialFormaPago.jComboBoxid_tipo_forma_pagoHistorialFormaPago.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_tipo_forma_pagoFK_IdTipoFormaPagoHistorialFormaPago.setSelectedItem(tipoformapago);
						} else {
							this.jComboBoxid_tipo_forma_pagoFK_IdTipoFormaPagoHistorialFormaPago.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormHistorialFormaPago!=null) {
							this.jInternalFrameDetalleFormHistorialFormaPago.jComboBoxid_cuenta_contableHistorialFormaPago.setSelectedItem(cuentacontable);
						}
					} else {
						if(this.jInternalFrameDetalleFormHistorialFormaPago!=null) {
							this.jInternalFrameDetalleFormHistorialFormaPago.jComboBoxid_cuenta_contableHistorialFormaPago.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_cuenta_contableFK_IdCuentaContableHistorialFormaPago.setSelectedItem(cuentacontable);
						} else {
							this.jComboBoxid_cuenta_contableFK_IdCuentaContableHistorialFormaPago.setSelectedIndex(iIndexSelected);
						}

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
						if(this.jInternalFrameDetalleFormHistorialFormaPago!=null) {
							this.jInternalFrameDetalleFormHistorialFormaPago.jComboBoxid_anioHistorialFormaPago.setSelectedItem(anio);
						}
					} else {
						if(this.jInternalFrameDetalleFormHistorialFormaPago!=null) {
							this.jInternalFrameDetalleFormHistorialFormaPago.jComboBoxid_anioHistorialFormaPago.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormHistorialFormaPago!=null) {
							this.jInternalFrameDetalleFormHistorialFormaPago.jComboBoxid_mesHistorialFormaPago.setSelectedItem(mes);
						}
					} else {
						if(this.jInternalFrameDetalleFormHistorialFormaPago!=null) {
							this.jInternalFrameDetalleFormHistorialFormaPago.jComboBoxid_mesHistorialFormaPago.setSelectedIndex(iIndexSelected);
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

	


	
	public void refrescarForeignKeysDescripcionesHistorialFormaPago() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			HistorialFormaPagoConstantesFunciones.refrescarForeignKeysDescripcionesHistorialFormaPago(this.historialformapagoLogic.getHistorialFormaPagos());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			HistorialFormaPagoConstantesFunciones.refrescarForeignKeysDescripcionesHistorialFormaPago(this.historialformapagos);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
		classes.add(new Classe(Sucursal.class));
		classes.add(new Classe(Ejercicio.class));
		classes.add(new Classe(Periodo.class));
		classes.add(new Classe(Factura.class));
		classes.add(new Classe(TipoFormaPago.class));
		classes.add(new Classe(CuentaContable.class));
		classes.add(new Classe(Anio.class));
		classes.add(new Classe(Mes.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//historialformapagoLogic.setHistorialFormaPagos(this.historialformapagos);
			historialformapagoLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public HistorialFormaPagoParameterReturnGeneral getHistorialFormaPagoParameterGeneral() {
		return this.historialformapagoParameterGeneral;
	}
	
	public void setHistorialFormaPagoParameterGeneral(HistorialFormaPagoParameterReturnGeneral historialformapagoParameterGeneral) {
		this.historialformapagoParameterGeneral = historialformapagoParameterGeneral;
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
	
	public Boolean getIsPermisoTodoHistorialFormaPago() {
		return isPermisoTodoHistorialFormaPago;
	}

	public void setIsPermisoTodoHistorialFormaPago(Boolean isPermisoTodoHistorialFormaPago) {
		this.isPermisoTodoHistorialFormaPago = isPermisoTodoHistorialFormaPago;
	}

	public Boolean getIsPermisoNuevoHistorialFormaPago() {
		return isPermisoNuevoHistorialFormaPago;
	}

	public void setIsPermisoNuevoHistorialFormaPago(Boolean isPermisoNuevoHistorialFormaPago) {
		this.isPermisoNuevoHistorialFormaPago = isPermisoNuevoHistorialFormaPago;
	}

	public Boolean getIsPermisoActualizarHistorialFormaPago() {
		return isPermisoActualizarHistorialFormaPago;
	}

	public void setIsPermisoActualizarHistorialFormaPago(Boolean isPermisoActualizarHistorialFormaPago) {
		this.isPermisoActualizarHistorialFormaPago = isPermisoActualizarHistorialFormaPago;
	}

	public Boolean getIsPermisoEliminarHistorialFormaPago() {
		return isPermisoEliminarHistorialFormaPago;
	}

	public void setIsPermisoEliminarHistorialFormaPago(Boolean isPermisoEliminarHistorialFormaPago) {
		this.isPermisoEliminarHistorialFormaPago = isPermisoEliminarHistorialFormaPago;
	}

	public Boolean getIsPermisoGuardarCambiosHistorialFormaPago() {
		return isPermisoGuardarCambiosHistorialFormaPago;
	}

	public void setIsPermisoGuardarCambiosHistorialFormaPago(Boolean isPermisoGuardarCambiosHistorialFormaPago) {
		this.isPermisoGuardarCambiosHistorialFormaPago = isPermisoGuardarCambiosHistorialFormaPago;
	}
	
	public Boolean getIsPermisoConsultaHistorialFormaPago() {
		return isPermisoConsultaHistorialFormaPago;
	}

	public void setIsPermisoConsultaHistorialFormaPago(Boolean isPermisoConsultaHistorialFormaPago) {
		this.isPermisoConsultaHistorialFormaPago = isPermisoConsultaHistorialFormaPago;
	}

	public Boolean getIsPermisoBusquedaHistorialFormaPago() {
		return isPermisoBusquedaHistorialFormaPago;
	}

	public void setIsPermisoBusquedaHistorialFormaPago(Boolean isPermisoBusquedaHistorialFormaPago) {
		this.isPermisoBusquedaHistorialFormaPago = isPermisoBusquedaHistorialFormaPago;
	}

	public Boolean getIsPermisoReporteHistorialFormaPago() {
		return isPermisoReporteHistorialFormaPago;
	}

	public void setIsPermisoReporteHistorialFormaPago(Boolean isPermisoReporteHistorialFormaPago) {
		this.isPermisoReporteHistorialFormaPago = isPermisoReporteHistorialFormaPago;
	}
	
	public Boolean getIsPermisoPaginacionMedioHistorialFormaPago() {
		return isPermisoPaginacionMedioHistorialFormaPago;
	}

	public void setIsPermisoPaginacionMedioHistorialFormaPago(Boolean isPermisoPaginacionMedioHistorialFormaPago) {
		this.isPermisoPaginacionMedioHistorialFormaPago = isPermisoPaginacionMedioHistorialFormaPago;
	}
	
	public Boolean getIsPermisoPaginacionTodoHistorialFormaPago() {
		return isPermisoPaginacionTodoHistorialFormaPago;
	}

	public void setIsPermisoPaginacionTodoHistorialFormaPago(Boolean isPermisoPaginacionTodoHistorialFormaPago) {
		this.isPermisoPaginacionTodoHistorialFormaPago = isPermisoPaginacionTodoHistorialFormaPago;
	}
	
	public Boolean getIsPermisoPaginacionAltoHistorialFormaPago() {
		return isPermisoPaginacionAltoHistorialFormaPago;
	}

	public void setIsPermisoPaginacionAltoHistorialFormaPago(Boolean isPermisoPaginacionAltoHistorialFormaPago) {
		this.isPermisoPaginacionAltoHistorialFormaPago = isPermisoPaginacionAltoHistorialFormaPago;
	}
	
	public Boolean getIsPermisoCopiarHistorialFormaPago() {
		return isPermisoCopiarHistorialFormaPago;
	}

	public void setIsPermisoCopiarHistorialFormaPago(Boolean isPermisoCopiarHistorialFormaPago) {
		this.isPermisoCopiarHistorialFormaPago = isPermisoCopiarHistorialFormaPago;
	}
	
	public Boolean getIsPermisoVerFormHistorialFormaPago() {
		return isPermisoVerFormHistorialFormaPago;
	}

	public void setIsPermisoVerFormHistorialFormaPago(Boolean isPermisoVerFormHistorialFormaPago) {
		this.isPermisoVerFormHistorialFormaPago = isPermisoVerFormHistorialFormaPago;
	}
	
	public Boolean getIsPermisoDuplicarHistorialFormaPago() {
		return isPermisoDuplicarHistorialFormaPago;
	}

	public void setIsPermisoDuplicarHistorialFormaPago(Boolean isPermisoDuplicarHistorialFormaPago) {
		this.isPermisoDuplicarHistorialFormaPago = isPermisoDuplicarHistorialFormaPago;
	}
	
	public Boolean getIsPermisoOrdenHistorialFormaPago() {
		return isPermisoOrdenHistorialFormaPago;
	}

	public void setIsPermisoOrdenHistorialFormaPago(Boolean isPermisoOrdenHistorialFormaPago) {
		this.isPermisoOrdenHistorialFormaPago = isPermisoOrdenHistorialFormaPago;
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
	
	public Boolean getIsVisibilidadCeldaNuevoHistorialFormaPago() {
		return isVisibilidadCeldaNuevoHistorialFormaPago;
	}

	public void setIsVisibilidadCeldaNuevoHistorialFormaPago(Boolean isVisibilidadCeldaNuevoHistorialFormaPago) {
		this.isVisibilidadCeldaNuevoHistorialFormaPago = isVisibilidadCeldaNuevoHistorialFormaPago;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarHistorialFormaPago() {
		return isVisibilidadCeldaDuplicarHistorialFormaPago;
	}

	public void setIsVisibilidadCeldaDuplicarHistorialFormaPago(Boolean isVisibilidadCeldaDuplicarHistorialFormaPago) {
		this.isVisibilidadCeldaDuplicarHistorialFormaPago = isVisibilidadCeldaDuplicarHistorialFormaPago;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarHistorialFormaPago() {
		return isVisibilidadCeldaCopiarHistorialFormaPago;
	}

	public void setIsVisibilidadCeldaCopiarHistorialFormaPago(Boolean isVisibilidadCeldaCopiarHistorialFormaPago) {
		this.isVisibilidadCeldaCopiarHistorialFormaPago = isVisibilidadCeldaCopiarHistorialFormaPago;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormHistorialFormaPago() {
		return isVisibilidadCeldaVerFormHistorialFormaPago;
	}

	public void setIsVisibilidadCeldaVerFormHistorialFormaPago(Boolean isVisibilidadCeldaVerFormHistorialFormaPago) {
		this.isVisibilidadCeldaVerFormHistorialFormaPago = isVisibilidadCeldaVerFormHistorialFormaPago;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenHistorialFormaPago() {
		return isVisibilidadCeldaOrdenHistorialFormaPago;
	}

	public void setIsVisibilidadCeldaOrdenHistorialFormaPago(Boolean isVisibilidadCeldaOrdenHistorialFormaPago) {
		this.isVisibilidadCeldaOrdenHistorialFormaPago = isVisibilidadCeldaOrdenHistorialFormaPago;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesHistorialFormaPago() {
		return isVisibilidadCeldaNuevoRelacionesHistorialFormaPago;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesHistorialFormaPago(Boolean isVisibilidadCeldaNuevoRelacionesHistorialFormaPago) {
		this.isVisibilidadCeldaNuevoRelacionesHistorialFormaPago = isVisibilidadCeldaNuevoRelacionesHistorialFormaPago;
	}
	
	public Boolean getIsVisibilidadCeldaModificarHistorialFormaPago() {
		return isVisibilidadCeldaModificarHistorialFormaPago;
	}

	public void setIsVisibilidadCeldaModificarHistorialFormaPago(Boolean isVisibilidadCeldaModificarHistorialFormaPago) {
		this.isVisibilidadCeldaModificarHistorialFormaPago = isVisibilidadCeldaModificarHistorialFormaPago;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarHistorialFormaPago() {
		return isVisibilidadCeldaActualizarHistorialFormaPago;
	}

	public void setIsVisibilidadCeldaActualizarHistorialFormaPago(Boolean isVisibilidadCeldaActualizarHistorialFormaPago) {
		this.isVisibilidadCeldaActualizarHistorialFormaPago = isVisibilidadCeldaActualizarHistorialFormaPago;
	}

	public Boolean getIsVisibilidadCeldaEliminarHistorialFormaPago() {
		return isVisibilidadCeldaEliminarHistorialFormaPago;
	}

	public void setIsVisibilidadCeldaEliminarHistorialFormaPago(Boolean isVisibilidadCeldaEliminarHistorialFormaPago) {
		this.isVisibilidadCeldaEliminarHistorialFormaPago = isVisibilidadCeldaEliminarHistorialFormaPago;
	}

	public Boolean getIsVisibilidadCeldaCancelarHistorialFormaPago() {
		return isVisibilidadCeldaCancelarHistorialFormaPago;
	}

	public void setIsVisibilidadCeldaCancelarHistorialFormaPago(Boolean isVisibilidadCeldaCancelarHistorialFormaPago) {
		this.isVisibilidadCeldaCancelarHistorialFormaPago = isVisibilidadCeldaCancelarHistorialFormaPago;
	}

	public Boolean getIsVisibilidadCeldaGuardarHistorialFormaPago() {
		return isVisibilidadCeldaGuardarHistorialFormaPago;
	}

	public void setIsVisibilidadCeldaGuardarHistorialFormaPago(Boolean isVisibilidadCeldaGuardarHistorialFormaPago) {
		this.isVisibilidadCeldaGuardarHistorialFormaPago = isVisibilidadCeldaGuardarHistorialFormaPago;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosHistorialFormaPago() {
		return isVisibilidadCeldaGuardarCambiosHistorialFormaPago;
	}

	public void setIsVisibilidadCeldaGuardarCambiosHistorialFormaPago(Boolean isVisibilidadCeldaGuardarCambiosHistorialFormaPago) {
		this.isVisibilidadCeldaGuardarCambiosHistorialFormaPago = isVisibilidadCeldaGuardarCambiosHistorialFormaPago;
	}
		
	public HistorialFormaPagoSessionBean gethistorialformapagoSessionBean() {
		return this.historialformapagoSessionBean;
	}
	
	public void sethistorialformapagoSessionBean(HistorialFormaPagoSessionBean historialformapagoSessionBean) {
		this.historialformapagoSessionBean=historialformapagoSessionBean;
	}
	
	
	public Boolean getisVisibilidadFK_IdAnio() {
		return this.isVisibilidadFK_IdAnio;
	}

	public void setisVisibilidadFK_IdAnio(Boolean isVisibilidadFK_IdAnio) {
		this.isVisibilidadFK_IdAnio=isVisibilidadFK_IdAnio;
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

	public Boolean getisVisibilidadFK_IdFactura() {
		return this.isVisibilidadFK_IdFactura;
	}

	public void setisVisibilidadFK_IdFactura(Boolean isVisibilidadFK_IdFactura) {
		this.isVisibilidadFK_IdFactura=isVisibilidadFK_IdFactura;
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

	public Boolean getisVisibilidadFK_IdSucursal() {
		return this.isVisibilidadFK_IdSucursal;
	}

	public void setisVisibilidadFK_IdSucursal(Boolean isVisibilidadFK_IdSucursal) {
		this.isVisibilidadFK_IdSucursal=isVisibilidadFK_IdSucursal;
	}

	public Boolean getisVisibilidadFK_IdTipoFormaPago() {
		return this.isVisibilidadFK_IdTipoFormaPago;
	}

	public void setisVisibilidadFK_IdTipoFormaPago(Boolean isVisibilidadFK_IdTipoFormaPago) {
		this.isVisibilidadFK_IdTipoFormaPago=isVisibilidadFK_IdTipoFormaPago;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysHistorialFormaPago(HistorialFormaPago historialformapago)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(historialformapago,null);
				this.setActualParaGuardarSucursalForeignKey(historialformapago,null);
				this.setActualParaGuardarEjercicioForeignKey(historialformapago,null);
				this.setActualParaGuardarPeriodoForeignKey(historialformapago,null);
				this.setActualParaGuardarFacturaForeignKey(historialformapago,null);
				this.setActualParaGuardarTipoFormaPagoForeignKey(historialformapago,null);
				this.setActualParaGuardarCuentaContableForeignKey(historialformapago,null);
				this.setActualParaGuardarAnioForeignKey(historialformapago,null);
				this.setActualParaGuardarMesForeignKey(historialformapago,null);
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
	
	public void bugActualizarReferenciaActual(HistorialFormaPago historialformapago,HistorialFormaPago historialformapagoAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalHistorialFormaPago(historialformapago);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		historialformapagoAux.setId(historialformapago.getId());
		historialformapagoAux.setVersionRow(historialformapago.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessHistorialFormaPago();
		
			int intSelectedRow = this.jTableDatosHistorialFormaPago.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.historialformapago =(HistorialFormaPago) this.historialformapagoLogic.getHistorialFormaPagos().toArray()[this.jTableDatosHistorialFormaPago.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.historialformapago =(HistorialFormaPago) this.historialformapagos.toArray()[this.jTableDatosHistorialFormaPago.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(HistorialFormaPagoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualHistorialFormaPago(this.historialformapago,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysHistorialFormaPago(this.historialformapago);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = historialformapagoValidator.getInvalidValues(this.historialformapago);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			historialformapagoLogic.setDatosCliente(datosCliente);
			historialformapagoLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				historialformapagoAux=new  HistorialFormaPago();
				
				historialformapagoAux.setIsNew(true);
				historialformapagoAux.setIsChanged(true);
				
				historialformapagoAux.setHistorialFormaPagoOriginal(this.historialformapago);
				
				historialformapagoAux.setId(this.historialformapago.getId());	
				historialformapagoAux.setVersionRow(this.historialformapago.getVersionRow());	
				historialformapagoAux.setid_empresa(this.historialformapago.getid_empresa());	
				historialformapagoAux.setid_sucursal(this.historialformapago.getid_sucursal());	
				historialformapagoAux.setid_ejercicio(this.historialformapago.getid_ejercicio());	
				historialformapagoAux.setid_periodo(this.historialformapago.getid_periodo());	
				historialformapagoAux.setid_factura(this.historialformapago.getid_factura());	
				historialformapagoAux.setid_tipo_forma_pago(this.historialformapago.getid_tipo_forma_pago());	
				historialformapagoAux.setid_cuenta_contable(this.historialformapago.getid_cuenta_contable());	
				historialformapagoAux.setnumero_dias(this.historialformapago.getnumero_dias());	
				historialformapagoAux.setvalor(this.historialformapago.getvalor());	
				historialformapagoAux.setfecha(this.historialformapago.getfecha());	
				historialformapagoAux.setporcentaje(this.historialformapago.getporcentaje());	
				historialformapagoAux.setporcentaje_retencion(this.historialformapago.getporcentaje_retencion());	
				historialformapagoAux.setbase_retencion(this.historialformapago.getbase_retencion());	
				historialformapagoAux.setnumero_retencion(this.historialformapago.getnumero_retencion());	
				historialformapagoAux.setnombre_retencion(this.historialformapago.getnombre_retencion());	
				historialformapagoAux.setid_anio(this.historialformapago.getid_anio());	
				historialformapagoAux.setid_mes(this.historialformapago.getid_mes());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.historialformapagoSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.historialformapagoSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(historialformapagoAux,historialformapagoLogic.getHistorialFormaPagos());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(historialformapagoAux,historialformapagos);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.historialformapagoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.historialformapagoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						historialformapagoLogic.saveHistorialFormaPagos();//WithConnection
						//historialformapagoLogic.getSetVersionRowHistorialFormaPagos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.historialformapago,historialformapagoAux);
					
					this.refrescarForeignKeysDescripcionesHistorialFormaPago();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.historialformapagoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE	
						
						if(!this.historialformapagoSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								historialformapagoLogic.saveHistorialFormaPagoRelaciones(historialformapagoAux);//WithConnection
								//historialformapagoLogic.getSetVersionRowHistorialFormaPagos();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.historialformapago,historialformapagoAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE	
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.historialformapagoSessionBean.getEstaModoGuardarRelaciones() 
									|| this.historialformapagoSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(historialformapagoAux,historialformapagoLogic.getHistorialFormaPagos());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(historialformapagoAux,historialformapagos);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.historialformapago,historialformapagoAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				historialformapagoAux=new  HistorialFormaPago();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.historialformapagoSessionBean.getEsGuardarRelacionado() 
					|| (this.historialformapagoSessionBean.getEsGuardarRelacionado() && this.historialformapago.getId()>=0)) {
						
					historialformapagoAux.setIsNew(false);
				}
				
				historialformapagoAux.setIsDeleted(false);
			
				historialformapagoAux.setId(this.historialformapago.getId());	
				historialformapagoAux.setVersionRow(this.historialformapago.getVersionRow());	
				historialformapagoAux.setid_empresa(this.historialformapago.getid_empresa());	
				historialformapagoAux.setid_sucursal(this.historialformapago.getid_sucursal());	
				historialformapagoAux.setid_ejercicio(this.historialformapago.getid_ejercicio());	
				historialformapagoAux.setid_periodo(this.historialformapago.getid_periodo());	
				historialformapagoAux.setid_factura(this.historialformapago.getid_factura());	
				historialformapagoAux.setid_tipo_forma_pago(this.historialformapago.getid_tipo_forma_pago());	
				historialformapagoAux.setid_cuenta_contable(this.historialformapago.getid_cuenta_contable());	
				historialformapagoAux.setnumero_dias(this.historialformapago.getnumero_dias());	
				historialformapagoAux.setvalor(this.historialformapago.getvalor());	
				historialformapagoAux.setfecha(this.historialformapago.getfecha());	
				historialformapagoAux.setporcentaje(this.historialformapago.getporcentaje());	
				historialformapagoAux.setporcentaje_retencion(this.historialformapago.getporcentaje_retencion());	
				historialformapagoAux.setbase_retencion(this.historialformapago.getbase_retencion());	
				historialformapagoAux.setnumero_retencion(this.historialformapago.getnumero_retencion());	
				historialformapagoAux.setnombre_retencion(this.historialformapago.getnombre_retencion());	
				historialformapagoAux.setid_anio(this.historialformapago.getid_anio());	
				historialformapagoAux.setid_mes(this.historialformapago.getid_mes());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(historialformapagoAux,historialformapagoLogic.getHistorialFormaPagos());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(historialformapagoAux,historialformapagos);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.historialformapagoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.historialformapagoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						historialformapagoLogic.saveHistorialFormaPagos();//WithConnection
						//historialformapagoLogic.getSetVersionRowHistorialFormaPagos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.historialformapago,historialformapagoAux);
					
					this.refrescarForeignKeysDescripcionesHistorialFormaPago();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.historialformapagoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						if(!this.historialformapagoSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								historialformapagoLogic.saveHistorialFormaPagoRelaciones(historialformapagoAux);//WithConnection
								//historialformapagoLogic.getSetVersionRowHistorialFormaPagos();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.historialformapago,historialformapagoAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.historialformapagoSessionBean.getEstaModoGuardarRelaciones() 
									|| this.historialformapagoSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(historialformapagoAux,historialformapagoLogic.getHistorialFormaPagos());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(historialformapagoAux,historialformapagos);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.historialformapago,historialformapagoAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				historialformapagoAux=new  HistorialFormaPago();
				
				historialformapagoAux.setIsNew(false);
				historialformapagoAux.setIsChanged(false);
				
				historialformapagoAux.setIsDeleted(true);
				
				historialformapagoAux.setId(this.historialformapago.getId());	
				historialformapagoAux.setVersionRow(this.historialformapago.getVersionRow());	
				historialformapagoAux.setid_empresa(this.historialformapago.getid_empresa());	
				historialformapagoAux.setid_sucursal(this.historialformapago.getid_sucursal());	
				historialformapagoAux.setid_ejercicio(this.historialformapago.getid_ejercicio());	
				historialformapagoAux.setid_periodo(this.historialformapago.getid_periodo());	
				historialformapagoAux.setid_factura(this.historialformapago.getid_factura());	
				historialformapagoAux.setid_tipo_forma_pago(this.historialformapago.getid_tipo_forma_pago());	
				historialformapagoAux.setid_cuenta_contable(this.historialformapago.getid_cuenta_contable());	
				historialformapagoAux.setnumero_dias(this.historialformapago.getnumero_dias());	
				historialformapagoAux.setvalor(this.historialformapago.getvalor());	
				historialformapagoAux.setfecha(this.historialformapago.getfecha());	
				historialformapagoAux.setporcentaje(this.historialformapago.getporcentaje());	
				historialformapagoAux.setporcentaje_retencion(this.historialformapago.getporcentaje_retencion());	
				historialformapagoAux.setbase_retencion(this.historialformapago.getbase_retencion());	
				historialformapagoAux.setnumero_retencion(this.historialformapago.getnumero_retencion());	
				historialformapagoAux.setnombre_retencion(this.historialformapago.getnombre_retencion());	
				historialformapagoAux.setid_anio(this.historialformapago.getid_anio());	
				historialformapagoAux.setid_mes(this.historialformapago.getid_mes());	
				
				if(this.historialformapagoSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.historialformapagoAux.getId()>=0) {	
						this.historialformapagosEliminados.add(historialformapagoAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(historialformapagoAux,historialformapagoLogic.getHistorialFormaPagos());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(historialformapagoAux,historialformapagos);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.historialformapagoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.historialformapagoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						historialformapagoLogic.saveHistorialFormaPagos();//WithConnection
						//historialformapagoLogic.getSetVersionRowHistorialFormaPagos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.historialformapagoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						
						if(!this.historialformapagoSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								historialformapagoLogic.saveHistorialFormaPagoRelaciones(historialformapagoAux);//WithConnection
								//historialformapagoLogic.getSetVersionRowHistorialFormaPagos();//WithConnection
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
							if(this.historialformapagoSessionBean.getEstaModoGuardarRelaciones() 
								|| this.historialformapagoSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(historialformapagoAux,historialformapagoLogic.getHistorialFormaPagos());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(historialformapagoAux,historialformapagos);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.historialformapagoLogic.getHistorialFormaPagos().addAll(this.historialformapagosEliminados);
					
					historialformapagoLogic.saveHistorialFormaPagos();//WithConnection
					//historialformapagoLogic.getSetVersionRowHistorialFormaPagos();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesHistorialFormaPago();
				
				this.historialformapagosEliminados= new ArrayList<HistorialFormaPago>();		
			}
			
			if(this.historialformapagoSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.historialformapagoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Historial Forma Pago GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Historial Forma Pago",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.historialformapago=historialformapagoAux;
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
      		//this.finishProcessHistorialFormaPago();
      	}
		
	}	
	
	public void actualizarRelaciones(HistorialFormaPago historialformapagoLocal) throws Exception {
		
		if(this.historialformapagoSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(HistorialFormaPago historialformapagoLocal) throws Exception {	
		if(this.historialformapagoSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				historialformapagoLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(SucursalDetalleFormJInternalFrame.class)) {
				SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrameLocal=(SucursalBeanSwingJInternalFrame) ((SucursalDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				sucursalBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoSucursal(sucursalBeanSwingJInternalFrameLocal.getsucursal(),true);
				sucursalBeanSwingJInternalFrameLocal.actualizarLista(sucursalBeanSwingJInternalFrameLocal.sucursal,this.sucursalsForeignKey);

				sucursalBeanSwingJInternalFrameLocal.actualizarRelaciones(sucursalBeanSwingJInternalFrameLocal.sucursal);

				historialformapagoLocal.setSucursal(sucursalBeanSwingJInternalFrameLocal.sucursal);

				this.addItemDefectoCombosForeignKeySucursal();
				this.cargarCombosFrameSucursalsForeignKey("Formulario");
				this.setActualSucursalForeignKey(sucursalBeanSwingJInternalFrameLocal.sucursal.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(EjercicioDetalleFormJInternalFrame.class)) {
				EjercicioBeanSwingJInternalFrame ejercicioBeanSwingJInternalFrameLocal=(EjercicioBeanSwingJInternalFrame) ((EjercicioDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				ejercicioBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEjercicio(ejercicioBeanSwingJInternalFrameLocal.getejercicio(),true);
				ejercicioBeanSwingJInternalFrameLocal.actualizarLista(ejercicioBeanSwingJInternalFrameLocal.ejercicio,this.ejerciciosForeignKey);

				ejercicioBeanSwingJInternalFrameLocal.actualizarRelaciones(ejercicioBeanSwingJInternalFrameLocal.ejercicio);

				historialformapagoLocal.setEjercicio(ejercicioBeanSwingJInternalFrameLocal.ejercicio);

				this.addItemDefectoCombosForeignKeyEjercicio();
				this.cargarCombosFrameEjerciciosForeignKey("Formulario");
				this.setActualEjercicioForeignKey(ejercicioBeanSwingJInternalFrameLocal.ejercicio.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(PeriodoDetalleFormJInternalFrame.class)) {
				PeriodoBeanSwingJInternalFrame periodoBeanSwingJInternalFrameLocal=(PeriodoBeanSwingJInternalFrame) ((PeriodoDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				periodoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoPeriodo(periodoBeanSwingJInternalFrameLocal.getperiodo(),true);
				periodoBeanSwingJInternalFrameLocal.actualizarLista(periodoBeanSwingJInternalFrameLocal.periodo,this.periodosForeignKey);

				periodoBeanSwingJInternalFrameLocal.actualizarRelaciones(periodoBeanSwingJInternalFrameLocal.periodo);

				historialformapagoLocal.setPeriodo(periodoBeanSwingJInternalFrameLocal.periodo);

				this.addItemDefectoCombosForeignKeyPeriodo();
				this.cargarCombosFramePeriodosForeignKey("Formulario");
				this.setActualPeriodoForeignKey(periodoBeanSwingJInternalFrameLocal.periodo.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(FacturaDetalleFormJInternalFrame.class)) {
				FacturaBeanSwingJInternalFrame facturaBeanSwingJInternalFrameLocal=(FacturaBeanSwingJInternalFrame) ((FacturaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				facturaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoFactura(facturaBeanSwingJInternalFrameLocal.getfactura(),true);
				facturaBeanSwingJInternalFrameLocal.actualizarLista(facturaBeanSwingJInternalFrameLocal.factura,this.facturasForeignKey);

				facturaBeanSwingJInternalFrameLocal.actualizarRelaciones(facturaBeanSwingJInternalFrameLocal.factura);

				historialformapagoLocal.setFactura(facturaBeanSwingJInternalFrameLocal.factura);

				this.addItemDefectoCombosForeignKeyFactura();
				this.cargarCombosFrameFacturasForeignKey("Formulario");
				this.setActualFacturaForeignKey(facturaBeanSwingJInternalFrameLocal.factura.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(TipoFormaPagoDetalleFormJInternalFrame.class)) {
				TipoFormaPagoBeanSwingJInternalFrame tipoformapagoBeanSwingJInternalFrameLocal=(TipoFormaPagoBeanSwingJInternalFrame) ((TipoFormaPagoDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				tipoformapagoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoTipoFormaPago(tipoformapagoBeanSwingJInternalFrameLocal.gettipoformapago(),true);
				tipoformapagoBeanSwingJInternalFrameLocal.actualizarLista(tipoformapagoBeanSwingJInternalFrameLocal.tipoformapago,this.tipoformapagosForeignKey);

				tipoformapagoBeanSwingJInternalFrameLocal.actualizarRelaciones(tipoformapagoBeanSwingJInternalFrameLocal.tipoformapago);

				historialformapagoLocal.setTipoFormaPago(tipoformapagoBeanSwingJInternalFrameLocal.tipoformapago);

				this.addItemDefectoCombosForeignKeyTipoFormaPago();
				this.cargarCombosFrameTipoFormaPagosForeignKey("Formulario");
				this.setActualTipoFormaPagoForeignKey(tipoformapagoBeanSwingJInternalFrameLocal.tipoformapago.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(CuentaContableDetalleFormJInternalFrame.class)) {
				CuentaContableBeanSwingJInternalFrame cuentacontableBeanSwingJInternalFrameLocal=(CuentaContableBeanSwingJInternalFrame) ((CuentaContableDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				cuentacontableBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoCuentaContable(cuentacontableBeanSwingJInternalFrameLocal.getcuentacontable(),true);
				cuentacontableBeanSwingJInternalFrameLocal.actualizarLista(cuentacontableBeanSwingJInternalFrameLocal.cuentacontable,this.cuentacontablesForeignKey);

				cuentacontableBeanSwingJInternalFrameLocal.actualizarRelaciones(cuentacontableBeanSwingJInternalFrameLocal.cuentacontable);

				historialformapagoLocal.setCuentaContable(cuentacontableBeanSwingJInternalFrameLocal.cuentacontable);

				this.addItemDefectoCombosForeignKeyCuentaContable();
				this.cargarCombosFrameCuentaContablesForeignKey("Formulario");
				this.setActualCuentaContableForeignKey(cuentacontableBeanSwingJInternalFrameLocal.cuentacontable.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(AnioDetalleFormJInternalFrame.class)) {
				AnioBeanSwingJInternalFrame anioBeanSwingJInternalFrameLocal=(AnioBeanSwingJInternalFrame) ((AnioDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				anioBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoAnio(anioBeanSwingJInternalFrameLocal.getanio(),true);
				anioBeanSwingJInternalFrameLocal.actualizarLista(anioBeanSwingJInternalFrameLocal.anio,this.aniosForeignKey);

				anioBeanSwingJInternalFrameLocal.actualizarRelaciones(anioBeanSwingJInternalFrameLocal.anio);

				historialformapagoLocal.setAnio(anioBeanSwingJInternalFrameLocal.anio);

				this.addItemDefectoCombosForeignKeyAnio();
				this.cargarCombosFrameAniosForeignKey("Formulario");
				this.setActualAnioForeignKey(anioBeanSwingJInternalFrameLocal.anio.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(MesDetalleFormJInternalFrame.class)) {
				MesBeanSwingJInternalFrame mesBeanSwingJInternalFrameLocal=(MesBeanSwingJInternalFrame) ((MesDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				mesBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoMes(mesBeanSwingJInternalFrameLocal.getmes(),true);
				mesBeanSwingJInternalFrameLocal.actualizarLista(mesBeanSwingJInternalFrameLocal.mes,this.messForeignKey);

				mesBeanSwingJInternalFrameLocal.actualizarRelaciones(mesBeanSwingJInternalFrameLocal.mes);

				historialformapagoLocal.setMes(mesBeanSwingJInternalFrameLocal.mes);

				this.addItemDefectoCombosForeignKeyMes();
				this.cargarCombosFrameMessForeignKey("Formulario");
				this.setActualMesForeignKey(mesBeanSwingJInternalFrameLocal.mes.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarHistorialFormaPagoActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosHistorialFormaPago.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.historialformapago =(HistorialFormaPago) this.historialformapagoLogic.getHistorialFormaPagos().toArray()[this.jTableDatosHistorialFormaPago.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.historialformapago =(HistorialFormaPago) this.historialformapagos.toArray()[this.jTableDatosHistorialFormaPago.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = historialformapagoValidator.getInvalidValues(this.historialformapago);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(HistorialFormaPago historialformapago,List<HistorialFormaPago> historialformapagos) throws Exception {
		try	{		
			HistorialFormaPagoConstantesFunciones.actualizarLista(historialformapago,historialformapagos,this.historialformapagoSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(HistorialFormaPago historialformapago,List<HistorialFormaPago> historialformapagos) throws Exception {
		try	{			
			HistorialFormaPagoConstantesFunciones.actualizarSelectedLista(historialformapago,historialformapagos);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<HistorialFormaPago> historialformapagosLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				historialformapagosLocal=this.historialformapagoLogic.getHistorialFormaPagos();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				historialformapagosLocal=this.historialformapagos;
			}
			//ARCHITECTURE
		
			for(HistorialFormaPago historialformapagoLocal:historialformapagosLocal) {
				if(this.permiteMantenimiento(historialformapagoLocal) && historialformapagoLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+HistorialFormaPagoConstantesFunciones.getHistorialFormaPagoLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(HistorialFormaPagoConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormHistorialFormaPago.jLabelid_empresaHistorialFormaPago,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(HistorialFormaPagoConstantesFunciones.IDSUCURSAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormHistorialFormaPago.jLabelid_sucursalHistorialFormaPago,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(HistorialFormaPagoConstantesFunciones.IDEJERCICIO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormHistorialFormaPago.jLabelid_ejercicioHistorialFormaPago,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(HistorialFormaPagoConstantesFunciones.IDPERIODO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormHistorialFormaPago.jLabelid_periodoHistorialFormaPago,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(HistorialFormaPagoConstantesFunciones.IDFACTURA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormHistorialFormaPago.jLabelid_facturaHistorialFormaPago,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(HistorialFormaPagoConstantesFunciones.IDTIPOFORMAPAGO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormHistorialFormaPago.jLabelid_tipo_forma_pagoHistorialFormaPago,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(HistorialFormaPagoConstantesFunciones.IDCUENTACONTABLE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormHistorialFormaPago.jLabelid_cuenta_contableHistorialFormaPago,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(HistorialFormaPagoConstantesFunciones.NUMERODIAS)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormHistorialFormaPago.jLabelnumero_diasHistorialFormaPago,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(HistorialFormaPagoConstantesFunciones.VALOR)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormHistorialFormaPago.jLabelvalorHistorialFormaPago,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(HistorialFormaPagoConstantesFunciones.FECHA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormHistorialFormaPago.jLabelfechaHistorialFormaPago,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(HistorialFormaPagoConstantesFunciones.PORCENTAJE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormHistorialFormaPago.jLabelporcentajeHistorialFormaPago,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(HistorialFormaPagoConstantesFunciones.PORCENTAJERETENCION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormHistorialFormaPago.jLabelporcentaje_retencionHistorialFormaPago,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(HistorialFormaPagoConstantesFunciones.BASERETENCION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormHistorialFormaPago.jLabelbase_retencionHistorialFormaPago,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(HistorialFormaPagoConstantesFunciones.NUMERORETENCION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormHistorialFormaPago.jLabelnumero_retencionHistorialFormaPago,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(HistorialFormaPagoConstantesFunciones.NOMBRERETENCION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormHistorialFormaPago.jLabelnombre_retencionHistorialFormaPago,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(HistorialFormaPagoConstantesFunciones.IDANIO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormHistorialFormaPago.jLabelid_anioHistorialFormaPago,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(HistorialFormaPagoConstantesFunciones.IDMES)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormHistorialFormaPago.jLabelid_mesHistorialFormaPago,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormHistorialFormaPago!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormHistorialFormaPago.jLabelid_empresaHistorialFormaPago,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormHistorialFormaPago.jLabelid_sucursalHistorialFormaPago,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormHistorialFormaPago.jLabelid_ejercicioHistorialFormaPago,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormHistorialFormaPago.jLabelid_periodoHistorialFormaPago,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormHistorialFormaPago.jLabelid_facturaHistorialFormaPago,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormHistorialFormaPago.jLabelid_tipo_forma_pagoHistorialFormaPago,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormHistorialFormaPago.jLabelid_cuenta_contableHistorialFormaPago,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormHistorialFormaPago.jLabelnumero_diasHistorialFormaPago,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormHistorialFormaPago.jLabelvalorHistorialFormaPago,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormHistorialFormaPago.jLabelfechaHistorialFormaPago,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormHistorialFormaPago.jLabelporcentajeHistorialFormaPago,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormHistorialFormaPago.jLabelporcentaje_retencionHistorialFormaPago,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormHistorialFormaPago.jLabelbase_retencionHistorialFormaPago,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormHistorialFormaPago.jLabelnumero_retencionHistorialFormaPago,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormHistorialFormaPago.jLabelnombre_retencionHistorialFormaPago,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormHistorialFormaPago.jLabelid_anioHistorialFormaPago,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormHistorialFormaPago.jLabelid_mesHistorialFormaPago,"");
		
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
		this.iIdNuevoHistorialFormaPago--;	
		
		
		this.historialformapagoAux=new HistorialFormaPago();
		
		this.historialformapagoAux.setId(this.iIdNuevoHistorialFormaPago);
		this.historialformapagoAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.historialformapagoLogic.getHistorialFormaPagos().add(this.historialformapagoAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.historialformapagos.add(this.historialformapagoAux);
		}
		//ARCHITECTURE
		
		this.historialformapago=this.historialformapagoAux;
		
		if(HistorialFormaPagoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioHistorialFormaPago(this.historialformapago);
			this.setVariablesObjetoActualToFormularioForeignKeyHistorialFormaPago(this.historialformapago);
		}
				
		//this.setDefaultControlesHistorialFormaPago();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyHistorialFormaPago();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyHistorialFormaPago();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyHistorialFormaPago();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualHistorialFormaPago(this.historialformapagoBean,this.historialformapago,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysHistorialFormaPago(this.historialformapago);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(HistorialFormaPagoConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.historialformapagoSessionBean.getConGuardarRelaciones()) {
			classes=HistorialFormaPagoConstantesFunciones.getClassesRelationshipsOfHistorialFormaPago(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.historialformapagoReturnGeneral=historialformapagoLogic.procesarEventosHistorialFormaPagosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.historialformapagoLogic.getHistorialFormaPagos(),this.historialformapago,this.historialformapagoParameterGeneral,this.isEsNuevoHistorialFormaPago,classes);//this.historialformapagoLogic.getHistorialFormaPago()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanHistorialFormaPago(this.historialformapagoReturnGeneral,this.historialformapagoBean,false);
		
		if(this.historialformapagoReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyHistorialFormaPago(this.historialformapagoReturnGeneral.getHistorialFormaPago());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioHistorialFormaPago(this.historialformapagoReturnGeneral.getHistorialFormaPago());
		}
		
		if(this.historialformapagoReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioHistorialFormaPago(this.historialformapagoReturnGeneral.getHistorialFormaPago(),classes);//this.historialformapagoBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualHistorialFormaPago(this.historialformapago,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyHistorialFormaPago();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyHistorialFormaPago();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			HistorialFormaPagoBeanSwingJInternalFrameAdditional.RecargarFormHistorialFormaPago(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingHistorialFormaPago(false);
						
			if(historialformapagoSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(HistorialFormaPagoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualHistorialFormaPago();
			}
			
			this.actualizarVisualTableDatosHistorialFormaPago();
			
			this.jTableDatosHistorialFormaPago.setRowSelectionInterval(this.getIndiceNuevoHistorialFormaPago(), this.getIndiceNuevoHistorialFormaPago());
			
			this.seleccionarFilaTablaHistorialFormaPagoActual();
						
			this.actualizarEstadoCeldasBotonesHistorialFormaPago("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesHistorialFormaPago(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormHistorialFormaPago.jTextFieldnumero_diasHistorialFormaPago.setEnabled(isHabilitar && this.historialformapagoConstantesFunciones.activarnumero_diasHistorialFormaPago);
		this.jInternalFrameDetalleFormHistorialFormaPago.jTextFieldvalorHistorialFormaPago.setEnabled(isHabilitar && this.historialformapagoConstantesFunciones.activarvalorHistorialFormaPago);
		this.jInternalFrameDetalleFormHistorialFormaPago.jDateChooserfechaHistorialFormaPago.setEnabled(isHabilitar && this.historialformapagoConstantesFunciones.activarfechaHistorialFormaPago);
		this.jInternalFrameDetalleFormHistorialFormaPago.jTextFieldporcentajeHistorialFormaPago.setEnabled(isHabilitar && this.historialformapagoConstantesFunciones.activarporcentajeHistorialFormaPago);
		this.jInternalFrameDetalleFormHistorialFormaPago.jTextFieldporcentaje_retencionHistorialFormaPago.setEnabled(isHabilitar && this.historialformapagoConstantesFunciones.activarporcentaje_retencionHistorialFormaPago);
		this.jInternalFrameDetalleFormHistorialFormaPago.jTextFieldbase_retencionHistorialFormaPago.setEnabled(isHabilitar && this.historialformapagoConstantesFunciones.activarbase_retencionHistorialFormaPago);
		this.jInternalFrameDetalleFormHistorialFormaPago.jTextFieldnumero_retencionHistorialFormaPago.setEnabled(isHabilitar && this.historialformapagoConstantesFunciones.activarnumero_retencionHistorialFormaPago);
		this.jInternalFrameDetalleFormHistorialFormaPago.jTextAreanombre_retencionHistorialFormaPago.setEnabled(isHabilitar && this.historialformapagoConstantesFunciones.activarnombre_retencionHistorialFormaPago);	
		//
		this.jInternalFrameDetalleFormHistorialFormaPago.jComboBoxid_empresaHistorialFormaPago.setEnabled(isHabilitar && this.historialformapagoConstantesFunciones.activarid_empresaHistorialFormaPago);//
		this.jInternalFrameDetalleFormHistorialFormaPago.jComboBoxid_sucursalHistorialFormaPago.setEnabled(isHabilitar && this.historialformapagoConstantesFunciones.activarid_sucursalHistorialFormaPago);//
		this.jInternalFrameDetalleFormHistorialFormaPago.jComboBoxid_ejercicioHistorialFormaPago.setEnabled(isHabilitar && this.historialformapagoConstantesFunciones.activarid_ejercicioHistorialFormaPago);//
		this.jInternalFrameDetalleFormHistorialFormaPago.jComboBoxid_periodoHistorialFormaPago.setEnabled(isHabilitar && this.historialformapagoConstantesFunciones.activarid_periodoHistorialFormaPago);
		this.jInternalFrameDetalleFormHistorialFormaPago.jComboBoxid_facturaHistorialFormaPago.setEnabled(isHabilitar && this.historialformapagoConstantesFunciones.activarid_facturaHistorialFormaPago);
		this.jInternalFrameDetalleFormHistorialFormaPago.jComboBoxid_tipo_forma_pagoHistorialFormaPago.setEnabled(isHabilitar && this.historialformapagoConstantesFunciones.activarid_tipo_forma_pagoHistorialFormaPago);
		this.jInternalFrameDetalleFormHistorialFormaPago.jComboBoxid_cuenta_contableHistorialFormaPago.setEnabled(isHabilitar && this.historialformapagoConstantesFunciones.activarid_cuenta_contableHistorialFormaPago);//
		this.jInternalFrameDetalleFormHistorialFormaPago.jComboBoxid_anioHistorialFormaPago.setEnabled(isHabilitar && this.historialformapagoConstantesFunciones.activarid_anioHistorialFormaPago);//
		this.jInternalFrameDetalleFormHistorialFormaPago.jComboBoxid_mesHistorialFormaPago.setEnabled(isHabilitar && this.historialformapagoConstantesFunciones.activarid_mesHistorialFormaPago);
	};
	
	public void setDefaultControlesHistorialFormaPago() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoHistorialFormaPago(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.historialformapagoSessionBean.setConGuardarRelaciones(true);			
			this.historialformapagoSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormHistorialFormaPago.jTabbedPaneRelacionesHistorialFormaPago.setVisible(true);
			
					
		} else {
			//this.historialformapagoSessionBean.setConGuardarRelaciones(false);			
			this.historialformapagoSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormHistorialFormaPago.jTabbedPaneRelacionesHistorialFormaPago.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoHistorialFormaPago() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(HistorialFormaPago historialformapagoAux:this.historialformapagoLogic.getHistorialFormaPagos()) {
				if(historialformapagoAux.getId().equals(this.iIdNuevoHistorialFormaPago)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(HistorialFormaPago historialformapagoAux:this.historialformapagos) {
				if(historialformapagoAux.getId().equals(this.iIdNuevoHistorialFormaPago)) {
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
	
	public int getIndiceActualHistorialFormaPago(HistorialFormaPago historialformapago,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(HistorialFormaPago historialformapagoAux:this.historialformapagoLogic.getHistorialFormaPagos()) {
				if(historialformapagoAux.getId().equals(historialformapago.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(HistorialFormaPago historialformapagoAux:this.historialformapagos) {
				if(historialformapagoAux.getId().equals(historialformapago.getId())) {
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
	
	public void setCamposBaseDesdeOriginalHistorialFormaPago(HistorialFormaPago historialformapagoOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(HistorialFormaPago historialformapagoAux:this.historialformapagoLogic.getHistorialFormaPagos()) {
				if(historialformapagoAux.getHistorialFormaPagoOriginal().getId().equals(historialformapagoOriginal.getId())) {
					existe=true;
					historialformapagoOriginal.setId(historialformapagoAux.getId());
					historialformapagoOriginal.setVersionRow(historialformapagoAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(HistorialFormaPago historialformapagoAux:this.historialformapagos) {
				if(historialformapagoAux.getHistorialFormaPagoOriginal().getId().equals(historialformapagoOriginal.getId())) {
					existe=true;
					historialformapagoOriginal.setId(historialformapagoAux.getId());
					historialformapagoOriginal.setVersionRow(historialformapagoAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosHistorialFormaPago(Boolean esParaCancelar) throws Exception {
		historialformapagosAux=new ArrayList<HistorialFormaPago>();
		historialformapagoAux=new HistorialFormaPago();
		
		if(!this.historialformapagoSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(HistorialFormaPago historialformapagoAux:this.historialformapagoLogic.getHistorialFormaPagos()) {
					if(historialformapagoAux.getId()<0) {
						historialformapagosAux.add(historialformapagoAux);
					}		
				}
				this.iIdNuevoHistorialFormaPago=0L;
				this.historialformapagoLogic.getHistorialFormaPagos().removeAll(historialformapagosAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(HistorialFormaPago historialformapagoAux:this.historialformapagos) {
					if(historialformapagoAux.getId()<0) {
						historialformapagosAux.add(historialformapagoAux);
					}		
				}
				this.iIdNuevoHistorialFormaPago=0L;
				this.historialformapagos.removeAll(historialformapagosAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoHistorialFormaPago 
					&& this.historialformapagoLogic.getHistorialFormaPagos().size()>0
					) {
					historialformapagoAux=this.historialformapagoLogic.getHistorialFormaPagos().get(this.historialformapagoLogic.getHistorialFormaPagos().size() - 1);
				
					if(historialformapagoAux.getId()<0) {
						this.historialformapagoLogic.getHistorialFormaPagos().remove(historialformapagoAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoHistorialFormaPago && this.historialformapagos.size()>0) {
					historialformapagoAux=this.historialformapagos.get(this.historialformapagos.size() - 1);
				
					if(historialformapagoAux.getId()<0) {
						this.historialformapagos.remove(historialformapagoAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoHistorialFormaPago(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(historialformapago.getId()<0) {
				this.historialformapagoLogic.getHistorialFormaPagos().remove(this.historialformapago);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(historialformapago.getId()<0) {
				this.historialformapagos.remove(this.historialformapago);
			}
		}			
	}
	
	public void setEstadosInicialesHistorialFormaPago(List<HistorialFormaPago> historialformapagosAux) throws Exception {
		HistorialFormaPagoConstantesFunciones.setEstadosInicialesHistorialFormaPago(historialformapagosAux);
	}
	
	public void setEstadosInicialesHistorialFormaPago(HistorialFormaPago historialformapagoAux) throws Exception {
		HistorialFormaPagoConstantesFunciones.setEstadosInicialesHistorialFormaPago(historialformapagoAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarHistorialFormaPagoActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesHistorialFormaPago("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,HistorialFormaPagoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarHistorialFormaPagoActual()) {
				if(!this.isEsNuevoHistorialFormaPago) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesHistorialFormaPago("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoHistorialFormaPago=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,HistorialFormaPagoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarHistorialFormaPagoActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Historial Forma Pago ?", "MANTENIMIENTO DE Historial Forma Pago", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesHistorialFormaPago("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,HistorialFormaPagoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,HistorialFormaPagoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(HistorialFormaPago historialformapago) throws Exception {
		HistorialFormaPagoConstantesFunciones.seleccionarAsignar(this.historialformapago,historialformapago);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarHistorialFormaPago=this.isPermisoActualizarOriginalHistorialFormaPago;
			
			
			this.seleccionarAsignar(historialformapago);
			
			

			idFacturaActual=historialformapago.getid_factura();
			this.seleccionarFacturaActual();

			idCuentaContableActual=historialformapago.getid_cuenta_contable();
			this.seleccionarCuentaContableActual();
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			HistorialFormaPagoConstantesFunciones.quitarEspaciosHistorialFormaPago(this.historialformapago,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesHistorialFormaPago("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,HistorialFormaPagoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.historialformapagoSessionBean.setsFuncionBusquedaRapida(this.historialformapagoSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,HistorialFormaPagoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	//BUSQUEDA INTERNA FK
	public void seleccionarFacturaActual() throws Exception {
		try	{
			Factura facturaAux=new Factura();

			if(this.idFacturaActual != null && this.idFacturaActual>0) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					facturaLogic.getEntityWithConnection(this.idFacturaActual);
					facturaAux= facturaLogic.getFactura();
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE

				facturasForeignKey=new ArrayList<Factura>();
				facturasForeignKey.add(facturaAux);
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
			if(this.isEsNuevoHistorialFormaPago) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosHistorialFormaPago(esParaCancelar);				
				this.cancelarNuevoHistorialFormaPago(esParaCancelar);								
			}
			
			this.historialformapago=new HistorialFormaPago();
			
			this.inicializarHistorialFormaPago();
			
			this.actualizarEstadoCeldasBotonesHistorialFormaPago("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,HistorialFormaPagoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarHistorialFormaPago() throws Exception {
		try {
			HistorialFormaPagoConstantesFunciones.inicializarHistorialFormaPago(this.historialformapago);
			
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
			FuncionesSwing.manageException(this, e,logger,HistorialFormaPagoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.historialformapagoLogic.getHistorialFormaPagos().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,HistorialFormaPagoConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteHistorialFormaPagos(String sAccionBusqueda,List<HistorialFormaPago> historialformapagosParaReportes) throws Exception {
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
					sPathReporteFinal="HistorialFormaPago"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="HistorialFormaPagoMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("HistorialFormaPagoMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="HistorialFormaPago"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Historial Forma Pagos");		
		parameters.put("busquedapor", HistorialFormaPagoConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceHistorialFormaPago=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			HistorialFormaPagoConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			HistorialFormaPagoConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceHistorialFormaPago=new JRBeanArrayDataSource(HistorialFormaPagoJInternalFrame.TraerHistorialFormaPagoBeans(historialformapagosParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceHistorialFormaPago);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+HistorialFormaPagoConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+HistorialFormaPagoConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(HistorialFormaPagoBean.TraerHistorialFormaPagoBeans(historialformapagosParaReportes).toArray()));
							
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
				this.generarExcelReporteHistorialFormaPagos(sAccionBusqueda,sTipoArchivoReporte,historialformapagosParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalHistorialFormaPagos(sAccionBusqueda,sTipoArchivoReporte,historialformapagosParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoHistorialFormaPagoActionPerformed(null);
					//this.generarExcelReporteHistorialFormaPagos(sAccionBusqueda,sTipoArchivoReporte,historialformapagosParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalHistorialFormaPagos(sAccionBusqueda,sTipoArchivoReporte,historialformapagosParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesHistorialFormaPagos(sAccionBusqueda,sTipoArchivoReporte,historialformapagosParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesHistorialFormaPagos(sAccionBusqueda,sTipoArchivoReporte,historialformapagosParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHistorialFormaPagos(String sAccionBusqueda,String sTipoArchivoReporte,List<HistorialFormaPago> historialformapagosParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"historialformapago";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("HistorialFormaPagos");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderHistorialFormaPago("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(HistorialFormaPago historialformapago : historialformapagosParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			HistorialFormaPagoConstantesFunciones.generarExcelReporteDataHistorialFormaPago("NORMAL",row,workbook,historialformapago,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.historialformapagoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Historial Forma Pago",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderHistorialFormaPago(String sTipo,Row row,Workbook workbook) {
		
		HistorialFormaPagoConstantesFunciones.generarExcelReporteHeaderHistorialFormaPago(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalHistorialFormaPagos(String sAccionBusqueda,String sTipoArchivoReporte,List<HistorialFormaPago> historialformapagosParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"historialformapago_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("HistorialFormaPagos");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(HistorialFormaPago historialformapago : historialformapagosParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(HistorialFormaPagoConstantesFunciones.getHistorialFormaPagoDescripcion(historialformapago));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(HistorialFormaPagoConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(HistorialFormaPagoConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(historialformapago.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(HistorialFormaPagoConstantesFunciones.LABEL_IDSUCURSAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(HistorialFormaPagoConstantesFunciones.LABEL_IDSUCURSAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(historialformapago.getsucursal_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(HistorialFormaPagoConstantesFunciones.LABEL_IDEJERCICIO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(HistorialFormaPagoConstantesFunciones.LABEL_IDEJERCICIO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(historialformapago.getejercicio_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(HistorialFormaPagoConstantesFunciones.LABEL_IDPERIODO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(HistorialFormaPagoConstantesFunciones.LABEL_IDPERIODO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(historialformapago.getperiodo_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(HistorialFormaPagoConstantesFunciones.LABEL_IDFACTURA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(HistorialFormaPagoConstantesFunciones.LABEL_IDFACTURA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(historialformapago.getfactura_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(HistorialFormaPagoConstantesFunciones.LABEL_IDTIPOFORMAPAGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(HistorialFormaPagoConstantesFunciones.LABEL_IDTIPOFORMAPAGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(historialformapago.gettipoformapago_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(HistorialFormaPagoConstantesFunciones.LABEL_IDCUENTACONTABLE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(HistorialFormaPagoConstantesFunciones.LABEL_IDCUENTACONTABLE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(historialformapago.getcuentacontable_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(HistorialFormaPagoConstantesFunciones.LABEL_NUMERODIAS))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(HistorialFormaPagoConstantesFunciones.LABEL_NUMERODIAS);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(historialformapago.getnumero_dias());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(HistorialFormaPagoConstantesFunciones.LABEL_VALOR))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(HistorialFormaPagoConstantesFunciones.LABEL_VALOR);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(historialformapago.getvalor());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(HistorialFormaPagoConstantesFunciones.LABEL_FECHA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(HistorialFormaPagoConstantesFunciones.LABEL_FECHA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(historialformapago.getfecha());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(HistorialFormaPagoConstantesFunciones.LABEL_PORCENTAJE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(HistorialFormaPagoConstantesFunciones.LABEL_PORCENTAJE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(historialformapago.getporcentaje());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(HistorialFormaPagoConstantesFunciones.LABEL_PORCENTAJERETENCION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(HistorialFormaPagoConstantesFunciones.LABEL_PORCENTAJERETENCION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(historialformapago.getporcentaje_retencion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(HistorialFormaPagoConstantesFunciones.LABEL_BASERETENCION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(HistorialFormaPagoConstantesFunciones.LABEL_BASERETENCION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(historialformapago.getbase_retencion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(HistorialFormaPagoConstantesFunciones.LABEL_NUMERORETENCION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(HistorialFormaPagoConstantesFunciones.LABEL_NUMERORETENCION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(historialformapago.getnumero_retencion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(HistorialFormaPagoConstantesFunciones.LABEL_NOMBRERETENCION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(HistorialFormaPagoConstantesFunciones.LABEL_NOMBRERETENCION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(historialformapago.getnombre_retencion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(HistorialFormaPagoConstantesFunciones.LABEL_IDANIO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(HistorialFormaPagoConstantesFunciones.LABEL_IDANIO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(historialformapago.getanio_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(HistorialFormaPagoConstantesFunciones.LABEL_IDMES))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(HistorialFormaPagoConstantesFunciones.LABEL_IDMES);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(historialformapago.getmes_descripcion());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.historialformapagoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Historial Forma Pago",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesHistorialFormaPagos(String sAccionBusqueda,String sTipoArchivoReporte,List<HistorialFormaPago> historialformapagosParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<HistorialFormaPago> historialformapagosRespaldo=null;
		
		classes=HistorialFormaPagoConstantesFunciones.getClassesRelationshipsOfHistorialFormaPago(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.historialformapagoLogic.setDatosCliente(this.datosCliente);
		this.historialformapagoLogic.setDatosDeep(this.datosDeep);
		this.historialformapagoLogic.setIsConDeep(true);
		
		historialformapagosRespaldo=this.historialformapagoLogic.getHistorialFormaPagos();
		
		this.historialformapagoLogic.setHistorialFormaPagos(historialformapagosParaReportes);	
		this.historialformapagoLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		historialformapagosParaReportes=this.historialformapagoLogic.getHistorialFormaPagos();
		this.historialformapagoLogic.setHistorialFormaPagos(historialformapagosRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"historialformapago_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("HistorialFormaPagos");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderHistorialFormaPago("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(HistorialFormaPago historialformapago : historialformapagosParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderHistorialFormaPago("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			HistorialFormaPagoConstantesFunciones.generarExcelReporteDataHistorialFormaPago("NORMAL",row,workbook,historialformapago,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(HistorialFormaPagoConstantesFunciones.getHistorialFormaPagoDescripcion(historialformapago));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.historialformapagoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Historial Forma Pago",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoHistorialFormaPago.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoHistorialFormaPago.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoHistorialFormaPago.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoHistorialFormaPago.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessHistorialFormaPago() throws Exception {		
		this.startProcessHistorialFormaPago(true);
	}
	
	public void startProcessHistorialFormaPago(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasHistorialFormaPago ,this.jPanelParametrosReportesHistorialFormaPago, this.jScrollPanelDatosHistorialFormaPago,this.jPanelPaginacionHistorialFormaPago, this.jScrollPanelDatosEdicionHistorialFormaPago, this.jPanelAccionesHistorialFormaPago,this.jPanelAccionesFormularioHistorialFormaPago,this.jmenuBarHistorialFormaPago,this.jmenuBarDetalleHistorialFormaPago,this.jTtoolBarHistorialFormaPago,this.jTtoolBarDetalleHistorialFormaPago);		
		
		final JTabbedPane jTabbedPaneBusquedasHistorialFormaPago=this.jTabbedPaneBusquedasHistorialFormaPago; 
		
		final JPanel jPanelParametrosReportesHistorialFormaPago=this.jPanelParametrosReportesHistorialFormaPago;
		//final JScrollPane jScrollPanelDatosHistorialFormaPago=this.jScrollPanelDatosHistorialFormaPago;
		final JTable jTableDatosHistorialFormaPago=this.jTableDatosHistorialFormaPago;		
		final JPanel jPanelPaginacionHistorialFormaPago=this.jPanelPaginacionHistorialFormaPago;
		//final JScrollPane jScrollPanelDatosEdicionHistorialFormaPago=this.jScrollPanelDatosEdicionHistorialFormaPago;
		final JPanel jPanelAccionesHistorialFormaPago=this.jPanelAccionesHistorialFormaPago;
		
		JPanel jPanelCamposAuxiliarHistorialFormaPago=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarHistorialFormaPago=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormHistorialFormaPago!=null) {
			jPanelCamposAuxiliarHistorialFormaPago=this.jInternalFrameDetalleFormHistorialFormaPago.jPanelCamposHistorialFormaPago;
			jPanelAccionesFormularioAuxiliarHistorialFormaPago=this.jInternalFrameDetalleFormHistorialFormaPago.jPanelAccionesFormularioHistorialFormaPago;
		}
		
		final JPanel jPanelCamposHistorialFormaPago=jPanelCamposAuxiliarHistorialFormaPago;
		final JPanel jPanelAccionesFormularioHistorialFormaPago=jPanelAccionesFormularioAuxiliarHistorialFormaPago;
		
		
		final JMenuBar jmenuBarHistorialFormaPago=this.jmenuBarHistorialFormaPago;
		final JToolBar jTtoolBarHistorialFormaPago=this.jTtoolBarHistorialFormaPago;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarHistorialFormaPago=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarHistorialFormaPago=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormHistorialFormaPago!=null) {
			jmenuBarDetalleAuxiliarHistorialFormaPago=this.jInternalFrameDetalleFormHistorialFormaPago.jmenuBarDetalleHistorialFormaPago;
			jTtoolBarDetalleAuxiliarHistorialFormaPago=this.jInternalFrameDetalleFormHistorialFormaPago.jTtoolBarDetalleHistorialFormaPago;
		}
		
		final JMenuBar jmenuBarDetalleHistorialFormaPago=jmenuBarDetalleAuxiliarHistorialFormaPago;
		final JToolBar jTtoolBarDetalleHistorialFormaPago=jTtoolBarDetalleAuxiliarHistorialFormaPago;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasHistorialFormaPago;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesHistorialFormaPago;
			processRunnable.jTableDatos=jTableDatosHistorialFormaPago;
			processRunnable.jPanelCampos=jPanelCamposHistorialFormaPago;
			processRunnable.jPanelPaginacion=jPanelPaginacionHistorialFormaPago;
			processRunnable.jPanelAcciones=jPanelAccionesHistorialFormaPago;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioHistorialFormaPago;
			
			
			processRunnable.jmenuBar=jmenuBarHistorialFormaPago;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleHistorialFormaPago;
			processRunnable.jTtoolBar=jTtoolBarHistorialFormaPago;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleHistorialFormaPago;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasHistorialFormaPago ,jPanelParametrosReportesHistorialFormaPago,jTableDatosHistorialFormaPago, /*jScrollPanelDatosHistorialFormaPago,*/jPanelCamposHistorialFormaPago,jPanelPaginacionHistorialFormaPago, /*jScrollPanelDatosEdicionHistorialFormaPago,*/ jPanelAccionesHistorialFormaPago,jPanelAccionesFormularioHistorialFormaPago,jmenuBarHistorialFormaPago,jmenuBarDetalleHistorialFormaPago,jTtoolBarHistorialFormaPago,jTtoolBarDetalleHistorialFormaPago);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasHistorialFormaPago ,jPanelParametrosReportesHistorialFormaPago, jScrollPanelDatosHistorialFormaPago,jPanelPaginacionHistorialFormaPago, jScrollPanelDatosEdicionHistorialFormaPago, jPanelAccionesHistorialFormaPago,jPanelAccionesFormularioHistorialFormaPago,jmenuBarHistorialFormaPago,jmenuBarDetalleHistorialFormaPago,jTtoolBarHistorialFormaPago,jTtoolBarDetalleHistorialFormaPago);
						
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
	
	public void finishProcessHistorialFormaPago() {// throws Exception 
		this.finishProcessHistorialFormaPago(true);
	}
	
	public void finishProcessHistorialFormaPago(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasHistorialFormaPago ,this.jPanelParametrosReportesHistorialFormaPago, this.jScrollPanelDatosHistorialFormaPago,this.jPanelPaginacionHistorialFormaPago, this.jScrollPanelDatosEdicionHistorialFormaPago, this.jPanelAccionesHistorialFormaPago,this.jPanelAccionesFormularioHistorialFormaPago,this.jmenuBarHistorialFormaPago,this.jmenuBarDetalleHistorialFormaPago,this.jTtoolBarHistorialFormaPago,this.jTtoolBarDetalleHistorialFormaPago);		
		
		final JTabbedPane jTabbedPaneBusquedasHistorialFormaPago=this.jTabbedPaneBusquedasHistorialFormaPago; 
		
		final JPanel jPanelParametrosReportesHistorialFormaPago=this.jPanelParametrosReportesHistorialFormaPago;
		//final JScrollPane jScrollPanelDatosHistorialFormaPago=this.jScrollPanelDatosHistorialFormaPago;
		final JTable jTableDatosHistorialFormaPago=this.jTableDatosHistorialFormaPago;		
		final JPanel jPanelPaginacionHistorialFormaPago=this.jPanelPaginacionHistorialFormaPago;
		//final JScrollPane jScrollPanelDatosEdicionHistorialFormaPago=this.jScrollPanelDatosEdicionHistorialFormaPago;
		final JPanel jPanelAccionesHistorialFormaPago=this.jPanelAccionesHistorialFormaPago;
		
		JPanel jPanelCamposAuxiliarHistorialFormaPago=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarHistorialFormaPago=new JPanel();
		
		if(this.jInternalFrameDetalleFormHistorialFormaPago!=null) {
			jPanelCamposAuxiliarHistorialFormaPago=this.jInternalFrameDetalleFormHistorialFormaPago.jPanelCamposHistorialFormaPago;
			jPanelAccionesFormularioAuxiliarHistorialFormaPago=this.jInternalFrameDetalleFormHistorialFormaPago.jPanelAccionesFormularioHistorialFormaPago;
		}
		
		final JPanel jPanelCamposHistorialFormaPago=jPanelCamposAuxiliarHistorialFormaPago;
		final JPanel jPanelAccionesFormularioHistorialFormaPago=jPanelAccionesFormularioAuxiliarHistorialFormaPago;
		
		
		final JMenuBar jmenuBarHistorialFormaPago=this.jmenuBarHistorialFormaPago;		
		final JToolBar jTtoolBarHistorialFormaPago=this.jTtoolBarHistorialFormaPago;
				
		JMenuBar jmenuBarDetalleAuxiliarHistorialFormaPago=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarHistorialFormaPago=new JToolBar();
		
		if(this.jInternalFrameDetalleFormHistorialFormaPago!=null) {
			jmenuBarDetalleAuxiliarHistorialFormaPago=this.jInternalFrameDetalleFormHistorialFormaPago.jmenuBarDetalleHistorialFormaPago;
			jTtoolBarDetalleAuxiliarHistorialFormaPago=this.jInternalFrameDetalleFormHistorialFormaPago.jTtoolBarDetalleHistorialFormaPago;		
		}
		
		final JMenuBar jmenuBarDetalleHistorialFormaPago=jmenuBarDetalleAuxiliarHistorialFormaPago;
		final JToolBar jTtoolBarDetalleHistorialFormaPago=jTtoolBarDetalleAuxiliarHistorialFormaPago;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasHistorialFormaPago;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesHistorialFormaPago;
			processRunnable.jTableDatos=jTableDatosHistorialFormaPago;
			processRunnable.jPanelCampos=jPanelCamposHistorialFormaPago;
			processRunnable.jPanelPaginacion=jPanelPaginacionHistorialFormaPago;
			processRunnable.jPanelAcciones=jPanelAccionesHistorialFormaPago;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioHistorialFormaPago;
			
			
			processRunnable.jmenuBar=jmenuBarHistorialFormaPago;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleHistorialFormaPago;
			processRunnable.jTtoolBar=jTtoolBarHistorialFormaPago;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleHistorialFormaPago;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasHistorialFormaPago ,jPanelParametrosReportesHistorialFormaPago, jTableDatosHistorialFormaPago,/*jScrollPanelDatosHistorialFormaPago,*/jPanelCamposHistorialFormaPago,jPanelPaginacionHistorialFormaPago, /*jScrollPanelDatosEdicionHistorialFormaPago,*/ jPanelAccionesHistorialFormaPago,jPanelAccionesFormularioHistorialFormaPago,jmenuBarHistorialFormaPago,jmenuBarDetalleHistorialFormaPago,jTtoolBarHistorialFormaPago,jTtoolBarDetalleHistorialFormaPago));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesHistorialFormaPago(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarHistorialFormaPago(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuHistorialFormaPago(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarHistorialFormaPago(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarHistorialFormaPago,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleHistorialFormaPago,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuHistorialFormaPago(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarHistorialFormaPago,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleHistorialFormaPago,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.historialformapagoConstantesFunciones.getsFinalQueryHistorialFormaPago();
		String  finalQueryPaginacionTodos=this.historialformapagoConstantesFunciones.getsFinalQueryHistorialFormaPago();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=HistorialFormaPagoConstantesFunciones.getArrayColumnasGlobalesNoHistorialFormaPago(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=HistorialFormaPagoConstantesFunciones.getArrayColumnasGlobalesHistorialFormaPago(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,HistorialFormaPagoConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.historialformapagosEliminados= new ArrayList<HistorialFormaPago>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessHistorialFormaPago();
		
				///*HistorialFormaPagoSessionBean*/this.historialformapagoSessionBean=new HistorialFormaPagoSessionBean();
			
			if(this.historialformapagoSessionBean==null) {
				this.historialformapagoSessionBean=new HistorialFormaPagoSessionBean();
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
					this.iNumeroPaginacion=HistorialFormaPagoConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=HistorialFormaPagoConstantesFunciones.getClassesForeignKeysOfHistorialFormaPago(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/historialformapago."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			historialformapagosAux= new ArrayList<HistorialFormaPago>();
			
				
			historialformapagoLogic.setDatosCliente(this.datosCliente);
			historialformapagoLogic.setDatosDeep(this.datosDeep);
			historialformapagoLogic.setIsConDeep(true);
			
			
			historialformapagoLogic.getHistorialFormaPagoDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					historialformapagoLogic.getTodosHistorialFormaPagos(finalQueryGlobal,pagination);
					
					//historialformapagoLogic.getTodosHistorialFormaPagosWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(historialformapagoLogic.getHistorialFormaPagos()==null|| historialformapagoLogic.getHistorialFormaPagos().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							historialformapagosAux= new ArrayList<HistorialFormaPago>();
							historialformapagosAux.addAll(historialformapagoLogic.getHistorialFormaPagos());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							historialformapagosAux= new ArrayList<HistorialFormaPago>();
							historialformapagosAux.addAll(historialformapagos);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							historialformapagoLogic.getTodosHistorialFormaPagos(finalQueryGlobal+"",this.pagination);												
							
							//historialformapagoLogic.getTodosHistorialFormaPagosWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteHistorialFormaPagos("Todos",historialformapagoLogic.getHistorialFormaPagos() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							historialformapagoLogic.setHistorialFormaPagos(new ArrayList<HistorialFormaPago>());					
							historialformapagoLogic.getHistorialFormaPagos().addAll(historialformapagosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							historialformapagos=new ArrayList<HistorialFormaPago>();
							historialformapagos.addAll(historialformapagosAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idHistorialFormaPago=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idHistorialFormaPago=this.idActual;
				
				} else if(this.idHistorialFormaPagoActual!=null && this.idHistorialFormaPagoActual!=0L) {
					idHistorialFormaPago=idHistorialFormaPagoActual;
				}
				
					
				this.sDetalleReporte=HistorialFormaPagoConstantesFunciones.getDetalleIndicePorId(idHistorialFormaPago);
				
				this.historialformapagos=new ArrayList<HistorialFormaPago>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					historialformapagoLogic.getEntity(idHistorialFormaPago);
					
					//historialformapagoLogic.getEntityWithConnection(idHistorialFormaPago);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					historialformapagoLogic.setHistorialFormaPagos(new ArrayList<HistorialFormaPago>());
					historialformapagoLogic.getHistorialFormaPagos().add(historialformapagoLogic.getHistorialFormaPago());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.historialformapagos=new ArrayList<HistorialFormaPago>();
					this.historialformapagos.add(historialformapago);
				}
				
				if(historialformapagoLogic.getHistorialFormaPago()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdCuentaContable")) {
				this.sDetalleReporte=HistorialFormaPagoConstantesFunciones.getDetalleIndiceFK_IdCuentaContable(id_cuenta_contableFK_IdCuentaContable);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					historialformapagoLogic.getHistorialFormaPagosFK_IdCuentaContable(finalQueryGlobal,pagination,id_cuenta_contableFK_IdCuentaContable);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=HistorialFormaPagoConstantesFunciones.getDetalleIndiceFK_IdCuentaContable(id_cuenta_contableFK_IdCuentaContable);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=HistorialFormaPagoConstantesFunciones.getDetalleIndiceFK_IdCuentaContable(id_cuenta_contableFK_IdCuentaContable);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=historialformapagoLogic.getHistorialFormaPagos()==null||historialformapagoLogic.getHistorialFormaPagos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=historialformapagos==null|| historialformapagos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						historialformapagosAux=new ArrayList<HistorialFormaPago>();
						historialformapagosAux.addAll(historialformapagoLogic.getHistorialFormaPagos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							historialformapagosAux=new ArrayList<HistorialFormaPago>();
							historialformapagosAux.addAll(historialformapagos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							historialformapagoLogic.getHistorialFormaPagosFK_IdCuentaContable(finalQueryGlobal,pagination,id_cuenta_contableFK_IdCuentaContable);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=HistorialFormaPagoConstantesFunciones.getDetalleIndiceFK_IdCuentaContable(id_cuenta_contableFK_IdCuentaContable);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=HistorialFormaPagoConstantesFunciones.getDetalleIndiceFK_IdCuentaContable(id_cuenta_contableFK_IdCuentaContable);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteHistorialFormaPagos("FK_IdCuentaContable",historialformapagoLogic.getHistorialFormaPagos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteHistorialFormaPagos("FK_IdCuentaContable",historialformapagos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						historialformapagoLogic.setHistorialFormaPagos(new ArrayList<HistorialFormaPago>());
						historialformapagoLogic.getHistorialFormaPagos().addAll(historialformapagosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							historialformapagos=new ArrayList<HistorialFormaPago>();
							historialformapagos.addAll(historialformapagosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdEjercicio")) {
				this.sDetalleReporte=HistorialFormaPagoConstantesFunciones.getDetalleIndiceFK_IdEjercicio(id_ejercicioFK_IdEjercicio);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					historialformapagoLogic.getHistorialFormaPagosFK_IdEjercicio(finalQueryGlobal,pagination,id_ejercicioFK_IdEjercicio);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=HistorialFormaPagoConstantesFunciones.getDetalleIndiceFK_IdEjercicio(id_ejercicioFK_IdEjercicio);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=HistorialFormaPagoConstantesFunciones.getDetalleIndiceFK_IdEjercicio(id_ejercicioFK_IdEjercicio);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=historialformapagoLogic.getHistorialFormaPagos()==null||historialformapagoLogic.getHistorialFormaPagos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=historialformapagos==null|| historialformapagos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						historialformapagosAux=new ArrayList<HistorialFormaPago>();
						historialformapagosAux.addAll(historialformapagoLogic.getHistorialFormaPagos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							historialformapagosAux=new ArrayList<HistorialFormaPago>();
							historialformapagosAux.addAll(historialformapagos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							historialformapagoLogic.getHistorialFormaPagosFK_IdEjercicio(finalQueryGlobal,pagination,id_ejercicioFK_IdEjercicio);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=HistorialFormaPagoConstantesFunciones.getDetalleIndiceFK_IdEjercicio(id_ejercicioFK_IdEjercicio);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=HistorialFormaPagoConstantesFunciones.getDetalleIndiceFK_IdEjercicio(id_ejercicioFK_IdEjercicio);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteHistorialFormaPagos("FK_IdEjercicio",historialformapagoLogic.getHistorialFormaPagos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteHistorialFormaPagos("FK_IdEjercicio",historialformapagos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						historialformapagoLogic.setHistorialFormaPagos(new ArrayList<HistorialFormaPago>());
						historialformapagoLogic.getHistorialFormaPagos().addAll(historialformapagosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							historialformapagos=new ArrayList<HistorialFormaPago>();
							historialformapagos.addAll(historialformapagosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=HistorialFormaPagoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					historialformapagoLogic.getHistorialFormaPagosFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=HistorialFormaPagoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=HistorialFormaPagoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=historialformapagoLogic.getHistorialFormaPagos()==null||historialformapagoLogic.getHistorialFormaPagos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=historialformapagos==null|| historialformapagos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						historialformapagosAux=new ArrayList<HistorialFormaPago>();
						historialformapagosAux.addAll(historialformapagoLogic.getHistorialFormaPagos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							historialformapagosAux=new ArrayList<HistorialFormaPago>();
							historialformapagosAux.addAll(historialformapagos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							historialformapagoLogic.getHistorialFormaPagosFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=HistorialFormaPagoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=HistorialFormaPagoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteHistorialFormaPagos("FK_IdEmpresa",historialformapagoLogic.getHistorialFormaPagos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteHistorialFormaPagos("FK_IdEmpresa",historialformapagos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						historialformapagoLogic.setHistorialFormaPagos(new ArrayList<HistorialFormaPago>());
						historialformapagoLogic.getHistorialFormaPagos().addAll(historialformapagosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							historialformapagos=new ArrayList<HistorialFormaPago>();
							historialformapagos.addAll(historialformapagosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdFactura")) {
				this.sDetalleReporte=HistorialFormaPagoConstantesFunciones.getDetalleIndiceFK_IdFactura(id_facturaFK_IdFactura);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					historialformapagoLogic.getHistorialFormaPagosFK_IdFactura(finalQueryGlobal,pagination,id_facturaFK_IdFactura);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=HistorialFormaPagoConstantesFunciones.getDetalleIndiceFK_IdFactura(id_facturaFK_IdFactura);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=HistorialFormaPagoConstantesFunciones.getDetalleIndiceFK_IdFactura(id_facturaFK_IdFactura);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=historialformapagoLogic.getHistorialFormaPagos()==null||historialformapagoLogic.getHistorialFormaPagos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=historialformapagos==null|| historialformapagos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						historialformapagosAux=new ArrayList<HistorialFormaPago>();
						historialformapagosAux.addAll(historialformapagoLogic.getHistorialFormaPagos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							historialformapagosAux=new ArrayList<HistorialFormaPago>();
							historialformapagosAux.addAll(historialformapagos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							historialformapagoLogic.getHistorialFormaPagosFK_IdFactura(finalQueryGlobal,pagination,id_facturaFK_IdFactura);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=HistorialFormaPagoConstantesFunciones.getDetalleIndiceFK_IdFactura(id_facturaFK_IdFactura);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=HistorialFormaPagoConstantesFunciones.getDetalleIndiceFK_IdFactura(id_facturaFK_IdFactura);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteHistorialFormaPagos("FK_IdFactura",historialformapagoLogic.getHistorialFormaPagos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteHistorialFormaPagos("FK_IdFactura",historialformapagos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						historialformapagoLogic.setHistorialFormaPagos(new ArrayList<HistorialFormaPago>());
						historialformapagoLogic.getHistorialFormaPagos().addAll(historialformapagosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							historialformapagos=new ArrayList<HistorialFormaPago>();
							historialformapagos.addAll(historialformapagosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdPeriodo")) {
				this.sDetalleReporte=HistorialFormaPagoConstantesFunciones.getDetalleIndiceFK_IdPeriodo(id_periodoFK_IdPeriodo);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					historialformapagoLogic.getHistorialFormaPagosFK_IdPeriodo(finalQueryGlobal,pagination,id_periodoFK_IdPeriodo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=HistorialFormaPagoConstantesFunciones.getDetalleIndiceFK_IdPeriodo(id_periodoFK_IdPeriodo);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=HistorialFormaPagoConstantesFunciones.getDetalleIndiceFK_IdPeriodo(id_periodoFK_IdPeriodo);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=historialformapagoLogic.getHistorialFormaPagos()==null||historialformapagoLogic.getHistorialFormaPagos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=historialformapagos==null|| historialformapagos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						historialformapagosAux=new ArrayList<HistorialFormaPago>();
						historialformapagosAux.addAll(historialformapagoLogic.getHistorialFormaPagos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							historialformapagosAux=new ArrayList<HistorialFormaPago>();
							historialformapagosAux.addAll(historialformapagos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							historialformapagoLogic.getHistorialFormaPagosFK_IdPeriodo(finalQueryGlobal,pagination,id_periodoFK_IdPeriodo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=HistorialFormaPagoConstantesFunciones.getDetalleIndiceFK_IdPeriodo(id_periodoFK_IdPeriodo);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=HistorialFormaPagoConstantesFunciones.getDetalleIndiceFK_IdPeriodo(id_periodoFK_IdPeriodo);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteHistorialFormaPagos("FK_IdPeriodo",historialformapagoLogic.getHistorialFormaPagos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteHistorialFormaPagos("FK_IdPeriodo",historialformapagos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						historialformapagoLogic.setHistorialFormaPagos(new ArrayList<HistorialFormaPago>());
						historialformapagoLogic.getHistorialFormaPagos().addAll(historialformapagosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							historialformapagos=new ArrayList<HistorialFormaPago>();
							historialformapagos.addAll(historialformapagosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdSucursal")) {
				this.sDetalleReporte=HistorialFormaPagoConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					historialformapagoLogic.getHistorialFormaPagosFK_IdSucursal(finalQueryGlobal,pagination,id_sucursalFK_IdSucursal);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=HistorialFormaPagoConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=HistorialFormaPagoConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=historialformapagoLogic.getHistorialFormaPagos()==null||historialformapagoLogic.getHistorialFormaPagos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=historialformapagos==null|| historialformapagos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						historialformapagosAux=new ArrayList<HistorialFormaPago>();
						historialformapagosAux.addAll(historialformapagoLogic.getHistorialFormaPagos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							historialformapagosAux=new ArrayList<HistorialFormaPago>();
							historialformapagosAux.addAll(historialformapagos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							historialformapagoLogic.getHistorialFormaPagosFK_IdSucursal(finalQueryGlobal,pagination,id_sucursalFK_IdSucursal);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=HistorialFormaPagoConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=HistorialFormaPagoConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteHistorialFormaPagos("FK_IdSucursal",historialformapagoLogic.getHistorialFormaPagos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteHistorialFormaPagos("FK_IdSucursal",historialformapagos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						historialformapagoLogic.setHistorialFormaPagos(new ArrayList<HistorialFormaPago>());
						historialformapagoLogic.getHistorialFormaPagos().addAll(historialformapagosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							historialformapagos=new ArrayList<HistorialFormaPago>();
							historialformapagos.addAll(historialformapagosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdTipoFormaPago")) {
				this.sDetalleReporte=HistorialFormaPagoConstantesFunciones.getDetalleIndiceFK_IdTipoFormaPago(id_tipo_forma_pagoFK_IdTipoFormaPago);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					historialformapagoLogic.getHistorialFormaPagosFK_IdTipoFormaPago(finalQueryGlobal,pagination,id_tipo_forma_pagoFK_IdTipoFormaPago);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=HistorialFormaPagoConstantesFunciones.getDetalleIndiceFK_IdTipoFormaPago(id_tipo_forma_pagoFK_IdTipoFormaPago);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=HistorialFormaPagoConstantesFunciones.getDetalleIndiceFK_IdTipoFormaPago(id_tipo_forma_pagoFK_IdTipoFormaPago);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=historialformapagoLogic.getHistorialFormaPagos()==null||historialformapagoLogic.getHistorialFormaPagos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=historialformapagos==null|| historialformapagos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						historialformapagosAux=new ArrayList<HistorialFormaPago>();
						historialformapagosAux.addAll(historialformapagoLogic.getHistorialFormaPagos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							historialformapagosAux=new ArrayList<HistorialFormaPago>();
							historialformapagosAux.addAll(historialformapagos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							historialformapagoLogic.getHistorialFormaPagosFK_IdTipoFormaPago(finalQueryGlobal,pagination,id_tipo_forma_pagoFK_IdTipoFormaPago);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=HistorialFormaPagoConstantesFunciones.getDetalleIndiceFK_IdTipoFormaPago(id_tipo_forma_pagoFK_IdTipoFormaPago);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=HistorialFormaPagoConstantesFunciones.getDetalleIndiceFK_IdTipoFormaPago(id_tipo_forma_pagoFK_IdTipoFormaPago);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteHistorialFormaPagos("FK_IdTipoFormaPago",historialformapagoLogic.getHistorialFormaPagos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteHistorialFormaPagos("FK_IdTipoFormaPago",historialformapagos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						historialformapagoLogic.setHistorialFormaPagos(new ArrayList<HistorialFormaPago>());
						historialformapagoLogic.getHistorialFormaPagos().addAll(historialformapagosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							historialformapagos=new ArrayList<HistorialFormaPago>();
							historialformapagos.addAll(historialformapagosAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesHistorialFormaPago();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessHistorialFormaPago();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=historialformapagoLogic.getHistorialFormaPagos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=historialformapagos.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=historialformapagoLogic.getHistorialFormaPagos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=historialformapagos.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(HistorialFormaPago historialformapago) {
		Boolean permite=true;
		
		if(this.historialformapago.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=HistorialFormaPagoConstantesFunciones.getOrderByListaHistorialFormaPago();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=HistorialFormaPagoConstantesFunciones.getOrderByListaHistorialFormaPago();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(HistorialFormaPago historialformapago:historialformapagoLogic.getHistorialFormaPagos()) {
				if(historialformapago.getsType().equals(Constantes2.S_TOTALES)) {
					historialformapagoTotales=historialformapago;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(HistorialFormaPago historialformapago:this.historialformapagos) {
				if(historialformapago.getsType().equals(Constantes2.S_TOTALES)) {
					historialformapagoTotales=historialformapago;
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
			this.historialformapagoAux=new HistorialFormaPago();
			this.historialformapagoAux.setsType(Constantes2.S_TOTALES);
			this.historialformapagoAux.setIsNew(false);
			this.historialformapagoAux.setIsChanged(false);
			this.historialformapagoAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				HistorialFormaPagoConstantesFunciones.TotalizarValoresFilaHistorialFormaPago(this.historialformapagoLogic.getHistorialFormaPagos(),this.historialformapagoAux);
				
				this.historialformapagoLogic.getHistorialFormaPagos().add(this.historialformapagoAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				HistorialFormaPagoConstantesFunciones.TotalizarValoresFilaHistorialFormaPago(this.historialformapagos,this.historialformapagoAux);
				
				this.historialformapagos.add(this.historialformapagoAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		historialformapagoTotales=new HistorialFormaPago();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.historialformapagoLogic.getHistorialFormaPagos().remove(historialformapagoTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.historialformapagos.remove(historialformapagoTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		historialformapagoTotales=new HistorialFormaPago();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(HistorialFormaPago historialformapago:historialformapagoLogic.getHistorialFormaPagos()) {
				if(historialformapago.getsType().equals(Constantes2.S_TOTALES)) {
					historialformapagoTotales=historialformapago;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				HistorialFormaPagoConstantesFunciones.TotalizarValoresFilaHistorialFormaPago(this.historialformapagoLogic.getHistorialFormaPagos(),historialformapagoTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(HistorialFormaPago historialformapago:this.historialformapagos) {
				if(historialformapago.getsType().equals(Constantes2.S_TOTALES)) {
					historialformapagoTotales=historialformapago;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				HistorialFormaPagoConstantesFunciones.TotalizarValoresFilaHistorialFormaPago(this.historialformapagos,historialformapagoTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,HistorialFormaPagoConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getHistorialFormaPagosFK_IdAnio()throws Exception {
		try {
			sAccionBusqueda="FK_IdAnio";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getHistorialFormaPagosFK_IdCuentaContable()throws Exception {
		try {
			sAccionBusqueda="FK_IdCuentaContable";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getHistorialFormaPagosFK_IdEjercicio()throws Exception {
		try {
			sAccionBusqueda="FK_IdEjercicio";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getHistorialFormaPagosFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getHistorialFormaPagosFK_IdFactura()throws Exception {
		try {
			sAccionBusqueda="FK_IdFactura";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getHistorialFormaPagosFK_IdMes()throws Exception {
		try {
			sAccionBusqueda="FK_IdMes";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getHistorialFormaPagosFK_IdPeriodo()throws Exception {
		try {
			sAccionBusqueda="FK_IdPeriodo";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getHistorialFormaPagosFK_IdSucursal()throws Exception {
		try {
			sAccionBusqueda="FK_IdSucursal";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getHistorialFormaPagosFK_IdTipoFormaPago()throws Exception {
		try {
			sAccionBusqueda="FK_IdTipoFormaPago";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getHistorialFormaPagosFK_IdAnio(String sFinalQuery,Long id_anio)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					historialformapagoLogic.getHistorialFormaPagosFK_IdAnio(sFinalQuery,this.pagination,id_anio);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getHistorialFormaPagosFK_IdCuentaContable(String sFinalQuery,Long id_cuenta_contable)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					historialformapagoLogic.getHistorialFormaPagosFK_IdCuentaContable(sFinalQuery,this.pagination,id_cuenta_contable);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getHistorialFormaPagosFK_IdEjercicio(String sFinalQuery,Long id_ejercicio)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					historialformapagoLogic.getHistorialFormaPagosFK_IdEjercicio(sFinalQuery,this.pagination,id_ejercicio);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getHistorialFormaPagosFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					historialformapagoLogic.getHistorialFormaPagosFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getHistorialFormaPagosFK_IdFactura(String sFinalQuery,Long id_factura)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					historialformapagoLogic.getHistorialFormaPagosFK_IdFactura(sFinalQuery,this.pagination,id_factura);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getHistorialFormaPagosFK_IdMes(String sFinalQuery,Long id_mes)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					historialformapagoLogic.getHistorialFormaPagosFK_IdMes(sFinalQuery,this.pagination,id_mes);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getHistorialFormaPagosFK_IdPeriodo(String sFinalQuery,Long id_periodo)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					historialformapagoLogic.getHistorialFormaPagosFK_IdPeriodo(sFinalQuery,this.pagination,id_periodo);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getHistorialFormaPagosFK_IdSucursal(String sFinalQuery,Long id_sucursal)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					historialformapagoLogic.getHistorialFormaPagosFK_IdSucursal(sFinalQuery,this.pagination,id_sucursal);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getHistorialFormaPagosFK_IdTipoFormaPago(String sFinalQuery,Long id_tipo_forma_pago)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					historialformapagoLogic.getHistorialFormaPagosFK_IdTipoFormaPago(sFinalQuery,this.pagination,id_tipo_forma_pago);
				
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
	
	public void inicializarPermisosHistorialFormaPago() {
		this.isPermisoTodoHistorialFormaPago=false;
		this.isPermisoNuevoHistorialFormaPago=false;
		this.isPermisoActualizarHistorialFormaPago=false;
		this.isPermisoActualizarOriginalHistorialFormaPago=false;
		this.isPermisoEliminarHistorialFormaPago=false;
		this.isPermisoGuardarCambiosHistorialFormaPago=false;
		this.isPermisoConsultaHistorialFormaPago=false;
		this.isPermisoBusquedaHistorialFormaPago=false;
		this.isPermisoReporteHistorialFormaPago=false;		
		this.isPermisoOrdenHistorialFormaPago=false;		
		this.isPermisoPaginacionMedioHistorialFormaPago=false;		
		this.isPermisoPaginacionAltoHistorialFormaPago=false;
		this.isPermisoPaginacionTodoHistorialFormaPago=false;
		this.isPermisoCopiarHistorialFormaPago=false;		
		this.isPermisoVerFormHistorialFormaPago=false;		
		this.isPermisoDuplicarHistorialFormaPago=false;		
		this.isPermisoOrdenHistorialFormaPago=false;		
	}
	
	public void setPermisosUsuarioHistorialFormaPago(Boolean isPermiso) {
		this.isPermisoTodoHistorialFormaPago=isPermiso;
		this.isPermisoNuevoHistorialFormaPago=isPermiso;
		this.isPermisoActualizarHistorialFormaPago=isPermiso;
		this.isPermisoActualizarOriginalHistorialFormaPago=isPermiso;
		this.isPermisoEliminarHistorialFormaPago=isPermiso;
		this.isPermisoGuardarCambiosHistorialFormaPago=isPermiso;
		this.isPermisoConsultaHistorialFormaPago=isPermiso;
		this.isPermisoBusquedaHistorialFormaPago=isPermiso;
		this.isPermisoReporteHistorialFormaPago=isPermiso;
		this.isPermisoOrdenHistorialFormaPago=isPermiso;		
		this.isPermisoPaginacionMedioHistorialFormaPago=isPermiso;		
		this.isPermisoPaginacionAltoHistorialFormaPago=isPermiso;		
		this.isPermisoPaginacionTodoHistorialFormaPago=isPermiso;		
		this.isPermisoCopiarHistorialFormaPago=isPermiso;		
		this.isPermisoVerFormHistorialFormaPago=isPermiso;		
		this.isPermisoDuplicarHistorialFormaPago=isPermiso;
		this.isPermisoOrdenHistorialFormaPago=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioHistorialFormaPago(Boolean isPermiso) {
		//this.isPermisoTodoHistorialFormaPago=isPermiso;
		this.isPermisoNuevoHistorialFormaPago=isPermiso;
		this.isPermisoActualizarHistorialFormaPago=isPermiso;
		this.isPermisoActualizarOriginalHistorialFormaPago=isPermiso;
		this.isPermisoEliminarHistorialFormaPago=isPermiso;
		this.isPermisoGuardarCambiosHistorialFormaPago=isPermiso;
		//this.isPermisoConsultaHistorialFormaPago=isPermiso;
		//this.isPermisoBusquedaHistorialFormaPago=isPermiso;
		//this.isPermisoReporteHistorialFormaPago=isPermiso;
		//this.isPermisoOrdenHistorialFormaPago=isPermiso;		
		//this.isPermisoPaginacionMedioHistorialFormaPago=isPermiso;		
		//this.isPermisoPaginacionAltoHistorialFormaPago=isPermiso;		
		//this.isPermisoPaginacionTodoHistorialFormaPago=isPermiso;		
		//this.isPermisoCopiarHistorialFormaPago=isPermiso;		
		//this.isPermisoDuplicarHistorialFormaPago=isPermiso;
		//this.isPermisoOrdenHistorialFormaPago=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioHistorialFormaPagoClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(HistorialFormaPagoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebHistorialFormaPago(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioHistorialFormaPagoClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioHistorialFormaPagoClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionHistorialFormaPagoClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioHistorialFormaPagoClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioHistorialFormaPago() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(HistorialFormaPagoJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.historialformapagoSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, HistorialFormaPagoConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoHistorialFormaPago=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarHistorialFormaPago=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalHistorialFormaPago=this.isPermisoActualizarHistorialFormaPago;
			this.isPermisoEliminarHistorialFormaPago=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosHistorialFormaPago=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaHistorialFormaPago=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaHistorialFormaPago=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoHistorialFormaPago=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteHistorialFormaPago=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenHistorialFormaPago=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioHistorialFormaPago=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoHistorialFormaPago=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoHistorialFormaPago=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarHistorialFormaPago=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormHistorialFormaPago=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarHistorialFormaPago=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenHistorialFormaPago=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.historialformapagoSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosHistorialFormaPago.setToolTipText(this.jTableDatosHistorialFormaPago.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioHistorialFormaPago(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioHistorialFormaPago(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(HistorialFormaPagoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(HistorialFormaPagoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioHistorialFormaPago() throws Exception {
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
	public void inicializarCombosForeignKeyHistorialFormaPagoListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
				this.sucursalsForeignKey=new ArrayList();
				this.ejerciciosForeignKey=new ArrayList();
				this.periodosForeignKey=new ArrayList();
				this.facturasForeignKey=new ArrayList();
				this.tipoformapagosForeignKey=new ArrayList();
				this.cuentacontablesForeignKey=new ArrayList();
				this.aniosForeignKey=new ArrayList();
				this.messForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyHistorialFormaPagoListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(HistorialFormaPagoJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyHistorialFormaPagoListas(false);
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeySucursalListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyEjercicioListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyPeriodoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyFacturaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyTipoFormaPagoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyCuentaContableListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyAnioListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyMesListas(cargarCombosDependencia,sFinalQueryCombo);
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

	public void cargarCombosForeignKeyFacturaListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.facturasForeignKey==null||this.facturasForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=FacturaConstantesFunciones.getArrayColumnasGlobalesFactura(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,FacturaConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=FacturaConstantesFunciones.SFINALQUERY;

				this.cargarCombosFacturasForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyTipoFormaPagoListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.tipoformapagosForeignKey==null||this.tipoformapagosForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=TipoFormaPagoConstantesFunciones.getArrayColumnasGlobalesTipoFormaPago(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TipoFormaPagoConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=TipoFormaPagoConstantesFunciones.SFINALQUERY;

				this.cargarCombosTipoFormaPagosForeignKeyLista(finalQueryGlobal);
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
	
	public void cargarCombosLoteForeignKeyHistorialFormaPagoListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			HistorialFormaPagoParameterReturnGeneral historialformapagoReturnGeneral=new HistorialFormaPagoParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.historialformapagoConstantesFunciones.cargarid_empresaHistorialFormaPago)
					 || (this.esRecargarFks && this.historialformapagoConstantesFunciones.cargarid_empresaHistorialFormaPago)) {

					if(!this.historialformapagoSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+historialformapagoSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}


				String finalQueryGlobalSucursal="";

				if(((this.sucursalsForeignKey==null||this.sucursalsForeignKey.size()<=0) && this.historialformapagoConstantesFunciones.cargarid_sucursalHistorialFormaPago)
					 || (this.esRecargarFks && this.historialformapagoConstantesFunciones.cargarid_sucursalHistorialFormaPago)) {

					if(!this.historialformapagoSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=SucursalConstantesFunciones.getArrayColumnasGlobalesSucursal(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalSucursal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,SucursalConstantesFunciones.TABLENAME);

						finalQueryGlobalSucursal=Funciones.GetFinalQueryAppend(finalQueryGlobalSucursal, "");
						finalQueryGlobalSucursal+=SucursalConstantesFunciones.SFINALQUERY;

						//this.cargarCombosSucursalsForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalSucursal=" WHERE " + ConstantesSql.ID + "="+historialformapagoSessionBean.getlidSucursalActual();
					}
				} else {
					finalQueryGlobalSucursal="NONE";
				}


				String finalQueryGlobalEjercicio="";

				if(((this.ejerciciosForeignKey==null||this.ejerciciosForeignKey.size()<=0) && this.historialformapagoConstantesFunciones.cargarid_ejercicioHistorialFormaPago)
					 || (this.esRecargarFks && this.historialformapagoConstantesFunciones.cargarid_ejercicioHistorialFormaPago)) {

					if(!this.historialformapagoSessionBean.getisBusquedaDesdeForeignKeySesionEjercicio()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EjercicioConstantesFunciones.getArrayColumnasGlobalesEjercicio(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEjercicio=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EjercicioConstantesFunciones.TABLENAME);

						finalQueryGlobalEjercicio=Funciones.GetFinalQueryAppend(finalQueryGlobalEjercicio, "");
						finalQueryGlobalEjercicio+=EjercicioConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEjerciciosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEjercicio=" WHERE " + ConstantesSql.ID + "="+historialformapagoSessionBean.getlidEjercicioActual();
					}
				} else {
					finalQueryGlobalEjercicio="NONE";
				}


				String finalQueryGlobalPeriodo="";

				if(((this.periodosForeignKey==null||this.periodosForeignKey.size()<=0) && this.historialformapagoConstantesFunciones.cargarid_periodoHistorialFormaPago)
					 || (this.esRecargarFks && this.historialformapagoConstantesFunciones.cargarid_periodoHistorialFormaPago)) {

					if(!this.historialformapagoSessionBean.getisBusquedaDesdeForeignKeySesionPeriodo()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=PeriodoConstantesFunciones.getArrayColumnasGlobalesPeriodo(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalPeriodo=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,PeriodoConstantesFunciones.TABLENAME);

						finalQueryGlobalPeriodo=Funciones.GetFinalQueryAppend(finalQueryGlobalPeriodo, "");
						finalQueryGlobalPeriodo+=PeriodoConstantesFunciones.SFINALQUERY;

						//this.cargarCombosPeriodosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalPeriodo=" WHERE " + ConstantesSql.ID + "="+historialformapagoSessionBean.getlidPeriodoActual();
					}
				} else {
					finalQueryGlobalPeriodo="NONE";
				}


				String finalQueryGlobalFactura="";

				if(((this.facturasForeignKey==null||this.facturasForeignKey.size()<=0) && this.historialformapagoConstantesFunciones.cargarid_facturaHistorialFormaPago)
					 || (this.esRecargarFks && this.historialformapagoConstantesFunciones.cargarid_facturaHistorialFormaPago)) {

					if(!this.historialformapagoSessionBean.getisBusquedaDesdeForeignKeySesionFactura()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=FacturaConstantesFunciones.getArrayColumnasGlobalesFactura(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalFactura=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,FacturaConstantesFunciones.TABLENAME);

						finalQueryGlobalFactura=Funciones.GetFinalQueryAppend(finalQueryGlobalFactura, "");
						finalQueryGlobalFactura+=FacturaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosFacturasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalFactura=" WHERE " + ConstantesSql.ID + "="+historialformapagoSessionBean.getlidFacturaActual();
					}
				} else {
					finalQueryGlobalFactura="NONE";
				}


				String finalQueryGlobalTipoFormaPago="";

				if(((this.tipoformapagosForeignKey==null||this.tipoformapagosForeignKey.size()<=0) && this.historialformapagoConstantesFunciones.cargarid_tipo_forma_pagoHistorialFormaPago)
					 || (this.esRecargarFks && this.historialformapagoConstantesFunciones.cargarid_tipo_forma_pagoHistorialFormaPago)) {

					if(!this.historialformapagoSessionBean.getisBusquedaDesdeForeignKeySesionTipoFormaPago()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=TipoFormaPagoConstantesFunciones.getArrayColumnasGlobalesTipoFormaPago(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalTipoFormaPago=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TipoFormaPagoConstantesFunciones.TABLENAME);

						finalQueryGlobalTipoFormaPago=Funciones.GetFinalQueryAppend(finalQueryGlobalTipoFormaPago, "");
						finalQueryGlobalTipoFormaPago+=TipoFormaPagoConstantesFunciones.SFINALQUERY;

						//this.cargarCombosTipoFormaPagosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalTipoFormaPago=" WHERE " + ConstantesSql.ID + "="+historialformapagoSessionBean.getlidTipoFormaPagoActual();
					}
				} else {
					finalQueryGlobalTipoFormaPago="NONE";
				}


				String finalQueryGlobalCuentaContable="";

				if(((this.cuentacontablesForeignKey==null||this.cuentacontablesForeignKey.size()<=0) && this.historialformapagoConstantesFunciones.cargarid_cuenta_contableHistorialFormaPago)
					 || (this.esRecargarFks && this.historialformapagoConstantesFunciones.cargarid_cuenta_contableHistorialFormaPago)) {

					if(!this.historialformapagoSessionBean.getisBusquedaDesdeForeignKeySesionCuentaContable()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();

						this.arrDatoGeneralNo.add("id_modulo");

						arrColumnasGlobales=CuentaContableConstantesFunciones.getArrayColumnasGlobalesCuentaContable(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalCuentaContable=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,CuentaContableConstantesFunciones.TABLENAME);

						finalQueryGlobalCuentaContable=Funciones.GetFinalQueryAppend(finalQueryGlobalCuentaContable, "");
						finalQueryGlobalCuentaContable+=CuentaContableConstantesFunciones.SFINALQUERY;

						//this.cargarCombosCuentaContablesForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalCuentaContable=" WHERE " + ConstantesSql.ID + "="+historialformapagoSessionBean.getlidCuentaContableActual();
					}
				} else {
					finalQueryGlobalCuentaContable="NONE";
				}


				String finalQueryGlobalAnio="";

				if(((this.aniosForeignKey==null||this.aniosForeignKey.size()<=0) && this.historialformapagoConstantesFunciones.cargarid_anioHistorialFormaPago)
					 || (this.esRecargarFks && this.historialformapagoConstantesFunciones.cargarid_anioHistorialFormaPago)) {

					if(!this.historialformapagoSessionBean.getisBusquedaDesdeForeignKeySesionAnio()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=AnioConstantesFunciones.getArrayColumnasGlobalesAnio(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalAnio=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,AnioConstantesFunciones.TABLENAME);

						finalQueryGlobalAnio=Funciones.GetFinalQueryAppend(finalQueryGlobalAnio, "");
						finalQueryGlobalAnio+=AnioConstantesFunciones.SFINALQUERY;

						//this.cargarCombosAniosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalAnio=" WHERE " + ConstantesSql.ID + "="+historialformapagoSessionBean.getlidAnioActual();
					}
				} else {
					finalQueryGlobalAnio="NONE";
				}


				String finalQueryGlobalMes="";

				if(((this.messForeignKey==null||this.messForeignKey.size()<=0) && this.historialformapagoConstantesFunciones.cargarid_mesHistorialFormaPago)
					 || (this.esRecargarFks && this.historialformapagoConstantesFunciones.cargarid_mesHistorialFormaPago)) {

					if(!this.historialformapagoSessionBean.getisBusquedaDesdeForeignKeySesionMes()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=MesConstantesFunciones.getArrayColumnasGlobalesMes(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalMes=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,MesConstantesFunciones.TABLENAME);

						finalQueryGlobalMes=Funciones.GetFinalQueryAppend(finalQueryGlobalMes, "");
						finalQueryGlobalMes+=MesConstantesFunciones.SFINALQUERY;

						//this.cargarCombosMessForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalMes=" WHERE " + ConstantesSql.ID + "="+historialformapagoSessionBean.getlidMesActual();
					}
				} else {
					finalQueryGlobalMes="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				historialformapagoReturnGeneral=historialformapagoLogic.cargarCombosLoteForeignKeyHistorialFormaPago(finalQueryGlobalEmpresa,finalQueryGlobalSucursal,finalQueryGlobalEjercicio,finalQueryGlobalPeriodo,finalQueryGlobalFactura,finalQueryGlobalTipoFormaPago,finalQueryGlobalCuentaContable,finalQueryGlobalAnio,finalQueryGlobalMes);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=historialformapagoReturnGeneral.getempresasForeignKey();
			}

			if(!finalQueryGlobalSucursal.equals("NONE")) {
				this.sucursalsForeignKey=historialformapagoReturnGeneral.getsucursalsForeignKey();
			}

			if(!finalQueryGlobalEjercicio.equals("NONE")) {
				this.ejerciciosForeignKey=historialformapagoReturnGeneral.getejerciciosForeignKey();
			}

			if(!finalQueryGlobalPeriodo.equals("NONE")) {
				this.periodosForeignKey=historialformapagoReturnGeneral.getperiodosForeignKey();
			}

			if(!finalQueryGlobalFactura.equals("NONE")) {
				this.facturasForeignKey=historialformapagoReturnGeneral.getfacturasForeignKey();
			}

			if(!finalQueryGlobalTipoFormaPago.equals("NONE")) {
				this.tipoformapagosForeignKey=historialformapagoReturnGeneral.gettipoformapagosForeignKey();
			}

			if(!finalQueryGlobalCuentaContable.equals("NONE")) {
				this.cuentacontablesForeignKey=historialformapagoReturnGeneral.getcuentacontablesForeignKey();
			}

			if(!finalQueryGlobalAnio.equals("NONE")) {
				this.aniosForeignKey=historialformapagoReturnGeneral.getaniosForeignKey();
			}

			if(!finalQueryGlobalMes.equals("NONE")) {
				this.messForeignKey=historialformapagoReturnGeneral.getmessForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyHistorialFormaPago()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeySucursal();
			this.addItemDefectoCombosForeignKeyEjercicio();
			this.addItemDefectoCombosForeignKeyPeriodo();
			this.addItemDefectoCombosForeignKeyFactura();
			this.addItemDefectoCombosForeignKeyTipoFormaPago();
			this.addItemDefectoCombosForeignKeyCuentaContable();
			this.addItemDefectoCombosForeignKeyAnio();
			this.addItemDefectoCombosForeignKeyMes();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.historialformapagoSessionBean==null) {
				this.historialformapagoSessionBean=new HistorialFormaPagoSessionBean();
			}

			if(!this.historialformapagoSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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

			if(!this.historialformapagoSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
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

			if(!this.historialformapagoSessionBean.getisBusquedaDesdeForeignKeySesionEjercicio()) {
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

			if(!this.historialformapagoSessionBean.getisBusquedaDesdeForeignKeySesionPeriodo()) {
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

	public void addItemDefectoCombosForeignKeyFactura()throws Exception {
		try {

			if(!this.historialformapagoSessionBean.getisBusquedaDesdeForeignKeySesionFactura()) {
				Factura factura=new Factura();
				FacturaConstantesFunciones.setFacturaDescripcion(factura,Constantes.SMENSAJE_ESCOJA_OPCION);
				factura.setId(null);

				if(!FacturaConstantesFunciones.ExisteEnLista(this.facturasForeignKey,factura,true)) {

					this.facturasForeignKey.add(0,factura);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyTipoFormaPago()throws Exception {
		try {

			if(!this.historialformapagoSessionBean.getisBusquedaDesdeForeignKeySesionTipoFormaPago()) {
				TipoFormaPago tipoformapago=new TipoFormaPago();
				TipoFormaPagoConstantesFunciones.setTipoFormaPagoDescripcion(tipoformapago,Constantes.SMENSAJE_ESCOJA_OPCION);
				tipoformapago.setId(null);

				if(!TipoFormaPagoConstantesFunciones.ExisteEnLista(this.tipoformapagosForeignKey,tipoformapago,true)) {

					this.tipoformapagosForeignKey.add(0,tipoformapago);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyCuentaContable()throws Exception {
		try {

			if(!this.historialformapagoSessionBean.getisBusquedaDesdeForeignKeySesionCuentaContable()) {
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

	public void addItemDefectoCombosForeignKeyAnio()throws Exception {
		try {

			if(!this.historialformapagoSessionBean.getisBusquedaDesdeForeignKeySesionAnio()) {
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

			if(!this.historialformapagoSessionBean.getisBusquedaDesdeForeignKeySesionMes()) {
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
	
	public void initActionsCombosTodosForeignKeyHistorialFormaPago()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyHistorialFormaPago(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyHistorialFormaPago()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
				this.setActualSucursalForeignKey(this.parametroGeneralUsuario.getid_sucursal(),false,"Formulario");
				this.setActualEjercicioForeignKey(this.parametroGeneralUsuario.getid_ejercicio(),false,"Formulario");
				this.setActualPeriodoForeignKey(this.parametroGeneralUsuario.getid_periodo(),false,"Formulario");
			
			
				this.historialformapago.setfecha(this.parametroGeneralUsuario.getfecha_sistema());
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyHistorialFormaPago();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyHistorialFormaPago(HistorialFormaPago historialformapago)throws Exception {	
		try {
			
			this.setActualFacturaForeignKey(historialformapago.getid_factura(),false,"Formulario");
			this.setActualTipoFormaPagoForeignKey(historialformapago.getid_tipo_forma_pago(),false,"Formulario");
			this.setActualCuentaContableForeignKey(historialformapago.getid_cuenta_contable(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyHistorialFormaPago(HistorialFormaPago historialformapago,String sTipoEvento)throws Exception {	
		try {
			
			

				if(historialformapago.getFactura()!=null && !sTipoEvento.equals("id_facturaHistorialFormaPago")) { //sTipoEvento Evita Bucle Infinito

					this.facturasForeignKey=new ArrayList<Factura>();
					this.facturasForeignKey.add(historialformapago.getFactura());

					this.addItemDefectoCombosForeignKeyFactura();
					this.cargarCombosFrameFacturasForeignKey("Todos");
				}

				if(historialformapago.getCuentaContable()!=null && !sTipoEvento.equals("id_cuenta_contableHistorialFormaPago")) { //sTipoEvento Evita Bucle Infinito

					this.cuentacontablesForeignKey=new ArrayList<CuentaContable>();
					this.cuentacontablesForeignKey.add(historialformapago.getCuentaContable());

					this.addItemDefectoCombosForeignKeyCuentaContable();
					this.cargarCombosFrameCuentaContablesForeignKey("Todos");
				}
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyHistorialFormaPago()throws Exception {	
		try {
			
			this.setActualFacturaForeignKey(this.historialformapagoConstantesFunciones.getid_factura(),false,"Formulario");
			this.setActualTipoFormaPagoForeignKey(this.historialformapagoConstantesFunciones.getid_tipo_forma_pago(),false,"Formulario");
			this.setActualCuentaContableForeignKey(this.historialformapagoConstantesFunciones.getid_cuenta_contable(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyHistorialFormaPago()throws Exception {	
		try {
			

				if(this.jInternalFrameDetalleFormHistorialFormaPago!=null) {
					Ejercicio ejercicioActual=(Ejercicio)this.jInternalFrameDetalleFormHistorialFormaPago.jComboBoxid_ejercicioHistorialFormaPago.getSelectedItem();
					this.setActualAnioForeignKey(ejercicioActual.getid_anio(),false,"Formulario");
				}

				if(this.jInternalFrameDetalleFormHistorialFormaPago!=null) {
					Periodo periodoActual=(Periodo)this.jInternalFrameDetalleFormHistorialFormaPago.jComboBoxid_periodoHistorialFormaPago.getSelectedItem();
					this.setActualMesForeignKey(periodoActual.getid_mes(),false,"Formulario");
				}
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyHistorialFormaPago()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyHistorialFormaPago()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroHistorialFormaPago()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyHistorialFormaPago()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameSucursalsForeignKey("Todos");
			this.cargarCombosFrameEjerciciosForeignKey("Todos");
			this.cargarCombosFramePeriodosForeignKey("Todos");
			this.cargarCombosFrameFacturasForeignKey("Todos");
			this.cargarCombosFrameTipoFormaPagosForeignKey("Todos");
			this.cargarCombosFrameCuentaContablesForeignKey("Todos");
			this.cargarCombosFrameAniosForeignKey("Todos");
			this.cargarCombosFrameMessForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyHistorialFormaPago(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameSucursalsForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameEjerciciosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFramePeriodosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameFacturasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameTipoFormaPagosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameCuentaContablesForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameAniosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameMessForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyHistorialFormaPago()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormHistorialFormaPago.jComboBoxid_empresaHistorialFormaPago!=null && this.jInternalFrameDetalleFormHistorialFormaPago.jComboBoxid_empresaHistorialFormaPago.getItemCount()>0) {
				this.jInternalFrameDetalleFormHistorialFormaPago.jComboBoxid_empresaHistorialFormaPago.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormHistorialFormaPago.jComboBoxid_sucursalHistorialFormaPago!=null && this.jInternalFrameDetalleFormHistorialFormaPago.jComboBoxid_sucursalHistorialFormaPago.getItemCount()>0) {
				this.jInternalFrameDetalleFormHistorialFormaPago.jComboBoxid_sucursalHistorialFormaPago.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormHistorialFormaPago.jComboBoxid_ejercicioHistorialFormaPago!=null && this.jInternalFrameDetalleFormHistorialFormaPago.jComboBoxid_ejercicioHistorialFormaPago.getItemCount()>0) {
				this.jInternalFrameDetalleFormHistorialFormaPago.jComboBoxid_ejercicioHistorialFormaPago.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormHistorialFormaPago.jComboBoxid_periodoHistorialFormaPago!=null && this.jInternalFrameDetalleFormHistorialFormaPago.jComboBoxid_periodoHistorialFormaPago.getItemCount()>0) {
				this.jInternalFrameDetalleFormHistorialFormaPago.jComboBoxid_periodoHistorialFormaPago.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormHistorialFormaPago.jComboBoxid_facturaHistorialFormaPago!=null && this.jInternalFrameDetalleFormHistorialFormaPago.jComboBoxid_facturaHistorialFormaPago.getItemCount()>0) {
				this.jInternalFrameDetalleFormHistorialFormaPago.jComboBoxid_facturaHistorialFormaPago.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormHistorialFormaPago.jComboBoxid_tipo_forma_pagoHistorialFormaPago!=null && this.jInternalFrameDetalleFormHistorialFormaPago.jComboBoxid_tipo_forma_pagoHistorialFormaPago.getItemCount()>0) {
				this.jInternalFrameDetalleFormHistorialFormaPago.jComboBoxid_tipo_forma_pagoHistorialFormaPago.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormHistorialFormaPago.jComboBoxid_cuenta_contableHistorialFormaPago!=null && this.jInternalFrameDetalleFormHistorialFormaPago.jComboBoxid_cuenta_contableHistorialFormaPago.getItemCount()>0) {
				this.jInternalFrameDetalleFormHistorialFormaPago.jComboBoxid_cuenta_contableHistorialFormaPago.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormHistorialFormaPago.jComboBoxid_anioHistorialFormaPago!=null && this.jInternalFrameDetalleFormHistorialFormaPago.jComboBoxid_anioHistorialFormaPago.getItemCount()>0) {
				this.jInternalFrameDetalleFormHistorialFormaPago.jComboBoxid_anioHistorialFormaPago.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormHistorialFormaPago.jComboBoxid_mesHistorialFormaPago!=null && this.jInternalFrameDetalleFormHistorialFormaPago.jComboBoxid_mesHistorialFormaPago.getItemCount()>0) {
				this.jInternalFrameDetalleFormHistorialFormaPago.jComboBoxid_mesHistorialFormaPago.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	


















	
	

	public HistorialFormaPagoBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public HistorialFormaPagoBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public HistorialFormaPagoBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.historialformapagoSessionBean=new HistorialFormaPagoSessionBean(); 
		this.historialformapagoConstantesFunciones=new HistorialFormaPagoConstantesFunciones(); 
		this.historialformapagoBean=new HistorialFormaPago();//(this.historialformapagoConstantesFunciones); 		
		this.historialformapagoReturnGeneral=new HistorialFormaPagoParameterReturnGeneral(); 
		
		this.historialformapagoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.historialformapagoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public HistorialFormaPagoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public HistorialFormaPagoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public HistorialFormaPagoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessHistorialFormaPago(true);
			
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
			
			this.historialformapagoConstantesFunciones=new HistorialFormaPagoConstantesFunciones(); 
			this.historialformapagoBean=new HistorialFormaPago();//this.historialformapagoConstantesFunciones); 			
			this.historialformapagoReturnGeneral=new HistorialFormaPagoParameterReturnGeneral(); 
		
			HistorialFormaPagoBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Historial Forma Pago Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			this.conTotales=true;
			
			
			this.historialformapago=new HistorialFormaPago();
			this.historialformapagos = new ArrayList<HistorialFormaPago>();
			this.historialformapagosAux = new ArrayList<HistorialFormaPago>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialformapagoLogic=new HistorialFormaPagoLogic();
				this.historialformapagoLogic.getNewConnexionToDeep("");
			}
			
			//this.historialformapagoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.historialformapagoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormHistorialFormaPago);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoHistorialFormaPago!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoHistorialFormaPago);	
					}
					
					if(this.jInternalFrameImportacionHistorialFormaPago!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionHistorialFormaPago);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByHistorialFormaPago!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByHistorialFormaPago);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormHistorialFormaPago!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormHistorialFormaPago);
				this.jInternalFrameDetalleFormHistorialFormaPago.setVisible(false);
				this.jInternalFrameDetalleFormHistorialFormaPago.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoHistorialFormaPago!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoHistorialFormaPago);
					this.jInternalFrameReporteDinamicoHistorialFormaPago.setVisible(false);
					this.jInternalFrameReporteDinamicoHistorialFormaPago.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionHistorialFormaPago!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionHistorialFormaPago);
					this.jInternalFrameImportacionHistorialFormaPago.setVisible(false);
					this.jInternalFrameImportacionHistorialFormaPago.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByHistorialFormaPago!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByHistorialFormaPago);
					this.jInternalFrameOrderByHistorialFormaPago.setVisible(false);
					this.jInternalFrameOrderByHistorialFormaPago.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idHistorialFormaPagoActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=HistorialFormaPagoConstantesFunciones.INUMEROPAGINACION;
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
			
			this.historialformapagoReturnGeneral=new HistorialFormaPagoParameterReturnGeneral();
			
			this.historialformapagoParameterGeneral=new HistorialFormaPagoParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.historialformapagoLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.historialformapagoSessionBean.getEsGuardarRelacionado()) {
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
			
			if(HistorialFormaPagoJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.historialformapagoSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,HistorialFormaPagoConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.historialformapagoSessionBean.getEsGuardarRelacionado(),this.historialformapagoSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,HistorialFormaPagoConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.historialformapagoSessionBean.getEsGuardarRelacionado(),this.historialformapagoSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoHistorialFormaPago=false;
			this.isVisibilidadCeldaDuplicarHistorialFormaPago=true;
			this.isVisibilidadCeldaCopiarHistorialFormaPago=true;
			this.isVisibilidadCeldaVerFormHistorialFormaPago=true;
			this.isVisibilidadCeldaOrdenHistorialFormaPago=true;
			this.isVisibilidadCeldaNuevoRelacionesHistorialFormaPago=false;
			this.isVisibilidadCeldaModificarHistorialFormaPago=false;
			this.isVisibilidadCeldaActualizarHistorialFormaPago=false;
			this.isVisibilidadCeldaEliminarHistorialFormaPago=false;
			this.isVisibilidadCeldaCancelarHistorialFormaPago=false;
			this.isVisibilidadCeldaGuardarHistorialFormaPago=false;
			this.isVisibilidadCeldaGuardarCambiosHistorialFormaPago=false;
			
			
			this.isVisibilidadFK_IdAnio=true;
			this.isVisibilidadFK_IdCuentaContable=true;
			this.isVisibilidadFK_IdEjercicio=true;
			this.isVisibilidadFK_IdEmpresa=true;
			this.isVisibilidadFK_IdFactura=true;
			this.isVisibilidadFK_IdMes=true;
			this.isVisibilidadFK_IdPeriodo=true;
			this.isVisibilidadFK_IdSucursal=true;
			this.isVisibilidadFK_IdTipoFormaPago=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesHistorialFormaPago("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosHistorialFormaPago();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioHistorialFormaPago(false);
			
			this.setPermisosUsuarioHistorialFormaPago();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.historialformapagoSessionBean.getEsGuardarRelacionado() 
				|| (this.historialformapagoSessionBean.getEsGuardarRelacionado() && this.historialformapagoSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioHistorialFormaPagoClasesRelacionadas();
			}
			
			if(this.historialformapagoSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioHistorialFormaPagoClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!HistorialFormaPagoJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosHistorialFormaPago();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualHistorialFormaPago();
			}
			
			if(!this.isPermisoBusquedaHistorialFormaPago) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasHistorialFormaPago.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.historialformapagoSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(true);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(true);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioHistorialFormaPago,this.isPermisoPaginacionMedioHistorialFormaPago,this.isPermisoPaginacionTodoHistorialFormaPago);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(HistorialFormaPagoConstantesFunciones.getTiposSeleccionarHistorialFormaPago());
				
				this.tiposColumnasSelect=HistorialFormaPagoConstantesFunciones.getTiposSeleccionarHistorialFormaPago(true);
				
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
			//if(!this.historialformapagoSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioHistorialFormaPago();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(true,false,true);
				this.setAccionesUsuarioHistorialFormaPago(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(true,false,true);							
				this.setAccionesUsuarioHistorialFormaPago(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesHistorialFormaPago() ;
			
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
			this.facturaLogic=new FacturaLogic();
			this.tipoformapagoLogic=new TipoFormaPagoLogic();
			this.cuentacontableLogic=new CuentaContableLogic();
			this.anioLogic=new AnioLogic();
			this.mesLogic=new MesLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				historialformapagoImplementable= (HistorialFormaPagoImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+HistorialFormaPagoConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				historialformapagoImplementableHome= (HistorialFormaPagoImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+HistorialFormaPagoConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.historialformapagos= new ArrayList<HistorialFormaPago>();
			this.historialformapagosEliminados= new ArrayList<HistorialFormaPago>();
						
			this.isEsNuevoHistorialFormaPago=false;
			this.esParaAccionDesdeFormularioHistorialFormaPago=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			//BUSQUEDA INTERNA FK
			this.idFacturaActual=0L;
			this.idCuentaContableActual=0L;
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			this.sucursalsForeignKey=new ArrayList<Sucursal>() ;
			this.ejerciciosForeignKey=new ArrayList<Ejercicio>() ;
			this.periodosForeignKey=new ArrayList<Periodo>() ;
			this.facturasForeignKey=new ArrayList<Factura>() ;
			this.tipoformapagosForeignKey=new ArrayList<TipoFormaPago>() ;
			this.cuentacontablesForeignKey=new ArrayList<CuentaContable>() ;
			this.aniosForeignKey=new ArrayList<Anio>() ;
			this.messForeignKey=new ArrayList<Mes>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyHistorialFormaPago(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroHistorialFormaPago();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.historialformapagoSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			HistorialFormaPagoBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=HistorialFormaPagoConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesHistorialFormaPago("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingHistorialFormaPago(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormHistorialFormaPago!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioHistorialFormaPago();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioHistorialFormaPago();
			}
			
			HistorialFormaPagoBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasHistorialFormaPago.getTabCount(); i++) {
					this.jTabbedPaneBusquedasHistorialFormaPago.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasHistorialFormaPago.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialformapagoLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessHistorialFormaPago(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga HistorialFormaPago: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialformapagoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,HistorialFormaPagoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialformapagoLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectHistorialFormaPago() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesHistorialFormaPago")) {
				iIndex=this.jInternalFrameDetalleFormHistorialFormaPago.jTabbedPaneRelacionesHistorialFormaPago.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormHistorialFormaPago.jTabbedPaneRelacionesHistorialFormaPago.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosHistorialFormaPago.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessHistorialFormaPago();	
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
	
	public void cargarCombosForeignKeyHistorialFormaPago(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyHistorialFormaPago(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyHistorialFormaPago(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyHistorialFormaPagoListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyHistorialFormaPago();
		
		this.cargarCombosFrameForeignKeyHistorialFormaPago();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyHistorialFormaPago();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyHistorialFormaPago();
		}
	}
	
	

	public void cargarCombosForeignKeyFactura(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyFacturaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyFactura();
				this.cargarCombosFrameFacturasForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaFactura(this.facturasForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyTipoFormaPago(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyTipoFormaPagoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyTipoFormaPago();
				this.cargarCombosFrameTipoFormaPagosForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaTipoFormaPago(this.tipoformapagosForeignKey);

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
	
	public void jButtonNuevoHistorialFormaPagoActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.historialformapagoSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormHistorialFormaPago==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			HistorialFormaPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.historialformapago,new Object(),this.historialformapagoParameterGeneral,this.historialformapagoReturnGeneral);
			
			
			if(jTableDatosHistorialFormaPago.getRowCount()>=1) {
				jTableDatosHistorialFormaPago.removeRowSelectionInterval(0, jTableDatosHistorialFormaPago.getRowCount()-1);						
			}
			
			this.isEsNuevoHistorialFormaPago=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoHistorialFormaPago(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesHistorialFormaPago(true);			
			//this.historialformapago=new HistorialFormaPago();
			//this.historialformapago.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesHistorialFormaPago(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualHistorialFormaPago() ;
			
			if(HistorialFormaPagoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleHistorialFormaPago(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.historialformapago);	
			this.actualizarInformacion("INFO_PADRE",false,this.historialformapago);				
			
			HistorialFormaPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.historialformapago,new Object(),this.historialformapagoParameterGeneral,this.historialformapagoReturnGeneral);
			
			if(this.historialformapagoSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar HistorialFormaPago: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			HistorialFormaPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.historialformapago,new Object(),this.historialformapagoParameterGeneral,this.historialformapagoReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,HistorialFormaPagoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarHistorialFormaPagoActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<HistorialFormaPago> historialformapagosSeleccionados=new ArrayList<HistorialFormaPago>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosHistorialFormaPago.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosHistorialFormaPago.getSelectedRows().length;			
			}
			
			historialformapagosSeleccionados=this.getHistorialFormaPagosSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoHistorialFormaPago--;			
				//HistorialFormaPago historialformapagoAux= new HistorialFormaPago();			
				//historialformapagoAux.setId(this.iIdNuevoHistorialFormaPago);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//HistorialFormaPago historialformapagoOrigen=new HistorialFormaPago();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(HistorialFormaPago historialformapagoOrigen : historialformapagosSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosHistorialFormaPago.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							historialformapagoOrigen =(HistorialFormaPago) this.historialformapagoLogic.getHistorialFormaPagos().toArray()[this.jTableDatosHistorialFormaPago.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							historialformapagoOrigen =(HistorialFormaPago) this.historialformapagos.toArray()[this.jTableDatosHistorialFormaPago.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaHistorialFormaPago();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.historialformapago.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosHistorialFormaPago(historialformapagoOrigen,this.historialformapago,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysHistorialFormaPago(this.historialformapago);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.historialformapagoLogic.getHistorialFormaPagos().add(this.historialformapagoAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.historialformapagos.add(this.historialformapagoAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaHistorialFormaPago(false);
				
				this.jTableDatosHistorialFormaPago.setRowSelectionInterval(this.getIndiceNuevoHistorialFormaPago(), this.getIndiceNuevoHistorialFormaPago());
				
				int iLastRow =  this.jTableDatosHistorialFormaPago.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosHistorialFormaPago.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosHistorialFormaPago.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaHistorialFormaPago(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,HistorialFormaPagoConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarHistorialFormaPagoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<HistorialFormaPago> historialformapagosSeleccionados=new ArrayList<HistorialFormaPago>();									
		
			HistorialFormaPago historialformapagoOrigen=new HistorialFormaPago();
			HistorialFormaPago historialformapagoDestino=new HistorialFormaPago();
				
			historialformapagosSeleccionados=this.getHistorialFormaPagosSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosHistorialFormaPago.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || historialformapagosSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosHistorialFormaPago.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						historialformapagoOrigen =(HistorialFormaPago) this.historialformapagoLogic.getHistorialFormaPagos().toArray()[this.jTableDatosHistorialFormaPago.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						historialformapagoOrigen =(HistorialFormaPago) this.historialformapagos.toArray()[this.jTableDatosHistorialFormaPago.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						historialformapagoDestino =(HistorialFormaPago) this.historialformapagoLogic.getHistorialFormaPagos().toArray()[this.jTableDatosHistorialFormaPago.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						historialformapagoDestino =(HistorialFormaPago) this.historialformapagos.toArray()[this.jTableDatosHistorialFormaPago.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				historialformapagoOrigen =historialformapagosSeleccionados.get(0);
				historialformapagoDestino =historialformapagosSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosHistorialFormaPago(historialformapagoOrigen,historialformapagoDestino,true,false);
				
				historialformapagoDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(historialformapagoDestino,historialformapagoLogic.getHistorialFormaPagos());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(historialformapagoDestino,historialformapagos);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaHistorialFormaPago(false);
				
				//this.jTableDatosHistorialFormaPago.setRowSelectionInterval(this.getIndiceNuevoHistorialFormaPago(), this.getIndiceNuevoHistorialFormaPago());
				
				int iLastRow =  this.jTableDatosHistorialFormaPago.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosHistorialFormaPago.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosHistorialFormaPago.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaHistorialFormaPago(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,HistorialFormaPagoConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormHistorialFormaPagoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormHistorialFormaPago==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormHistorialFormaPago.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,HistorialFormaPagoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarHistorialFormaPagoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesHistorialFormaPago.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasHistorialFormaPago.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesHistorialFormaPago.setVisible(!isVisible);
			this.jPanelPaginacionHistorialFormaPago.setVisible(!isVisible);
			this.jPanelAccionesHistorialFormaPago.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,HistorialFormaPagoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarHistorialFormaPagoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameHistorialFormaPago();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,HistorialFormaPagoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoHistorialFormaPagoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoHistorialFormaPago();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,HistorialFormaPagoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionHistorialFormaPagoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionHistorialFormaPago();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,HistorialFormaPagoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByHistorialFormaPagoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByHistorialFormaPago();
			
			this.abrirFrameOrderByHistorialFormaPago();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,HistorialFormaPagoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByHistorialFormaPagoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByHistorialFormaPago();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,HistorialFormaPagoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleHistorialFormaPago(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormHistorialFormaPago);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormHistorialFormaPago.isMaximum()) {
					this.jInternalFrameDetalleFormHistorialFormaPago.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormHistorialFormaPago.setSize(this.jInternalFrameDetalleFormHistorialFormaPago.iWidthFormulario,this.jInternalFrameDetalleFormHistorialFormaPago.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormHistorialFormaPago.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormHistorialFormaPago.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormHistorialFormaPago.isMaximum()) {
						this.jInternalFrameDetalleFormHistorialFormaPago.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormHistorialFormaPago.jContentPaneDetalleHistorialFormaPago.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormHistorialFormaPago.jTabbedPaneRelacionesHistorialFormaPago.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormHistorialFormaPago.jContentPaneDetalleHistorialFormaPago.getWidth(),HistorialFormaPagoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormHistorialFormaPago.jTabbedPaneRelacionesHistorialFormaPago.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormHistorialFormaPago.jContentPaneDetalleHistorialFormaPago.getWidth(),HistorialFormaPagoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormHistorialFormaPago.jTabbedPaneRelacionesHistorialFormaPago.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormHistorialFormaPago.jContentPaneDetalleHistorialFormaPago.getWidth(),HistorialFormaPagoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormHistorialFormaPago.setVisible(true);
	        this.jInternalFrameDetalleFormHistorialFormaPago.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,HistorialFormaPagoConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByHistorialFormaPago() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByHistorialFormaPago==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByHistorialFormaPago=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByHistorialFormaPago,false,this);
				} else {
					this.jInternalFrameOrderByHistorialFormaPago=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByHistorialFormaPago,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByHistorialFormaPago);
				this.jInternalFrameOrderByHistorialFormaPago.setVisible(false);
				this.jInternalFrameOrderByHistorialFormaPago.setSelected(false);
				
				this.jInternalFrameOrderByHistorialFormaPago.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByHistorialFormaPago"));
				
				this.inicializarActualizarBindingTablaOrderByHistorialFormaPago();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionHistorialFormaPago() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionHistorialFormaPago==null) {
				
				this.jInternalFrameImportacionHistorialFormaPago=new ImportacionJInternalFrame(HistorialFormaPagoConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionHistorialFormaPago);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionHistorialFormaPago);
				this.jInternalFrameImportacionHistorialFormaPago.setVisible(false);
				this.jInternalFrameImportacionHistorialFormaPago.setSelected(false);


				this.jInternalFrameImportacionHistorialFormaPago.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionHistorialFormaPago"));
				this.jInternalFrameImportacionHistorialFormaPago.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionHistorialFormaPago"));
				this.jInternalFrameImportacionHistorialFormaPago.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionHistorialFormaPago"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoHistorialFormaPago() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoHistorialFormaPago==null) {
				this.jInternalFrameReporteDinamicoHistorialFormaPago=new ReporteDinamicoJInternalFrame(HistorialFormaPagoConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoHistorialFormaPago);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoHistorialFormaPago);
				this.jInternalFrameReporteDinamicoHistorialFormaPago.setVisible(false);
				this.jInternalFrameReporteDinamicoHistorialFormaPago.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoHistorialFormaPago.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoHistorialFormaPago"));
				this.jInternalFrameReporteDinamicoHistorialFormaPago.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoHistorialFormaPago"));
				this.jInternalFrameReporteDinamicoHistorialFormaPago.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoHistorialFormaPago"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualHistorialFormaPago();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleHistorialFormaPago() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormHistorialFormaPago);
			
	       	this.jInternalFrameDetalleFormHistorialFormaPago.setVisible(false);
	        this.jInternalFrameDetalleFormHistorialFormaPago.setSelected(false);
			
			//this.jInternalFrameDetalleFormHistorialFormaPago.dispose();
			//this.jInternalFrameDetalleFormHistorialFormaPago=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,HistorialFormaPagoConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoHistorialFormaPago() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoHistorialFormaPago.setVisible(true);
	        this.jInternalFrameReporteDinamicoHistorialFormaPago.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,HistorialFormaPagoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionHistorialFormaPago() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionHistorialFormaPago.setVisible(true);
	        this.jInternalFrameImportacionHistorialFormaPago.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,HistorialFormaPagoConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByHistorialFormaPago() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByHistorialFormaPago.setVisible(true);
	        this.jInternalFrameOrderByHistorialFormaPago.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,HistorialFormaPagoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByHistorialFormaPago() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByHistorialFormaPago.setVisible(false);
	        this.jInternalFrameOrderByHistorialFormaPago.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,HistorialFormaPagoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoHistorialFormaPago() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoHistorialFormaPago.setVisible(false);
	        this.jInternalFrameReporteDinamicoHistorialFormaPago.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,HistorialFormaPagoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionHistorialFormaPago() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionHistorialFormaPago.setVisible(false);
	        this.jInternalFrameImportacionHistorialFormaPago.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,HistorialFormaPagoConstantesFunciones.CLASSNAME);
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
						TitledBorder titledBorderHistorialFormaPago=(TitledBorder)this.jScrollPanelDatosHistorialFormaPago.getBorder();
						TitledBorder titledBorderCuentaContable=(TitledBorder)cuentacontableBeanSwingJInternalFrame.jScrollPanelDatosCuentaContable.getBorder();

						titledBorderCuentaContable.setTitle(titledBorderHistorialFormaPago.getTitle() + " -> Cuenta Contable");


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
	
	public void jButtonModificarHistorialFormaPagoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarHistorialFormaPago(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,HistorialFormaPagoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarHistorialFormaPago(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosHistorialFormaPago.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesHistorialFormaPago(true);
			//this.isEsNuevoHistorialFormaPago=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialformapago =(HistorialFormaPago) this.historialformapagoLogic.getHistorialFormaPagos().toArray()[this.jTableDatosHistorialFormaPago.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.historialformapago =(HistorialFormaPago) this.historialformapagos.toArray()[this.jTableDatosHistorialFormaPago.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesHistorialFormaPago("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesHistorialFormaPago(false) ;
			
			if(historialformapagoSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(HistorialFormaPagoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleHistorialFormaPago(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualHistorialFormaPago(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,HistorialFormaPagoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaHistorialFormaPagoActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosHistorialFormaPago.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.historialformapago =(HistorialFormaPago) this.historialformapagoLogic.getHistorialFormaPagos().toArray()[this.jTableDatosHistorialFormaPago.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.historialformapago =(HistorialFormaPago) this.historialformapagos.toArray()[this.jTableDatosHistorialFormaPago.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,HistorialFormaPagoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarHistorialFormaPago(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormHistorialFormaPago==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosHistorialFormaPago.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesHistorialFormaPago(true);
			//this.isEsNuevoHistorialFormaPago=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialformapago =(HistorialFormaPago) this.historialformapagoLogic.getHistorialFormaPagos().toArray()[this.jTableDatosHistorialFormaPago.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.historialformapago =(HistorialFormaPago) this.historialformapagos.toArray()[this.jTableDatosHistorialFormaPago.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.historialformapago.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesHistorialFormaPago("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesHistorialFormaPago(false) ;
			
			if(HistorialFormaPagoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleHistorialFormaPago(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualHistorialFormaPago(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,HistorialFormaPagoConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
			
			if(sType.equals("Factura")) {
				if(!this.historialformapagoConstantesFunciones.cargarid_facturaHistorialFormaPago) {
					this.cargarCombosFacturasForeignKeyLista(" where id="+id);
					//this.inicializarActualizarBindingHistorialFormaPago(false,false);
					this.cargarCombosFrameFacturasForeignKey("Todos");
				}

				this.setCombosCodigoDesdeBusquedaid_factura (id);

				this.recargarComboTablaFactura(this.facturasForeignKey);

			}
			
			if(sType.equals("CuentaContable")) {
				if(!this.historialformapagoConstantesFunciones.cargarid_cuenta_contableHistorialFormaPago) {
					this.cargarCombosCuentaContablesForeignKeyLista(" where id="+id);
					//this.inicializarActualizarBindingHistorialFormaPago(false,false);
					this.cargarCombosFrameCuentaContablesForeignKey("Todos");
				}

				this.setCombosCodigoDesdeBusquedaid_cuenta_contable (id);

				this.recargarComboTablaCuentaContable(this.cuentacontablesForeignKey);

			}
		} catch(Exception e) {
			throw e;
		}
	}
	
					
	
	public void recargarComboTablaFactura(List<Factura> facturasForeignKey)throws Exception{
		TableColumn tableColumnFactura=this.jTableDatosHistorialFormaPago.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosHistorialFormaPago,HistorialFormaPagoConstantesFunciones.LABEL_IDFACTURA));
		TableCellEditor tableCellEditorFactura =tableColumnFactura.getCellEditor();

		FacturaTableCell facturaTableCellFk=(FacturaTableCell)tableCellEditorFactura;

		if(facturaTableCellFk!=null) {
			facturaTableCellFk.setfacturasForeignKey(facturasForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosHistorialFormaPago.getSelectedRow();

		//if(intSelectedRow<=0) {
			//facturaTableCellFk.setRowActual(intSelectedRow);
			//facturaTableCellFk.setfacturasForeignKeyActual(facturasForeignKey);
		//}


		if(facturaTableCellFk!=null) {
			facturaTableCellFk.RecargarFacturasForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaTipoFormaPago(List<TipoFormaPago> tipoformapagosForeignKey)throws Exception{
		TableColumn tableColumnTipoFormaPago=this.jTableDatosHistorialFormaPago.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosHistorialFormaPago,HistorialFormaPagoConstantesFunciones.LABEL_IDTIPOFORMAPAGO));
		TableCellEditor tableCellEditorTipoFormaPago =tableColumnTipoFormaPago.getCellEditor();

		TipoFormaPagoTableCell tipoformapagoTableCellFk=(TipoFormaPagoTableCell)tableCellEditorTipoFormaPago;

		if(tipoformapagoTableCellFk!=null) {
			tipoformapagoTableCellFk.settipoformapagosForeignKey(tipoformapagosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosHistorialFormaPago.getSelectedRow();

		//if(intSelectedRow<=0) {
			//tipoformapagoTableCellFk.setRowActual(intSelectedRow);
			//tipoformapagoTableCellFk.settipoformapagosForeignKeyActual(tipoformapagosForeignKey);
		//}


		if(tipoformapagoTableCellFk!=null) {
			tipoformapagoTableCellFk.RecargarTipoFormaPagosForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaCuentaContable(List<CuentaContable> cuentacontablesForeignKey)throws Exception{
		TableColumn tableColumnCuentaContable=this.jTableDatosHistorialFormaPago.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosHistorialFormaPago,HistorialFormaPagoConstantesFunciones.LABEL_IDCUENTACONTABLE));
		TableCellEditor tableCellEditorCuentaContable =tableColumnCuentaContable.getCellEditor();

		CuentaContableTableCell cuentacontableTableCellFk=(CuentaContableTableCell)tableCellEditorCuentaContable;

		if(cuentacontableTableCellFk!=null) {
			cuentacontableTableCellFk.setcuentacontablesForeignKey(cuentacontablesForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosHistorialFormaPago.getSelectedRow();

		//if(intSelectedRow<=0) {
			//cuentacontableTableCellFk.setRowActual(intSelectedRow);
			//cuentacontableTableCellFk.setcuentacontablesForeignKeyActual(cuentacontablesForeignKey);
		//}


		if(cuentacontableTableCellFk!=null) {
			cuentacontableTableCellFk.RecargarCuentaContablesForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaAnio(List<Anio> aniosForeignKey)throws Exception{
		TableColumn tableColumnAnio=this.jTableDatosHistorialFormaPago.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosHistorialFormaPago,HistorialFormaPagoConstantesFunciones.LABEL_IDANIO));
		TableCellEditor tableCellEditorAnio =tableColumnAnio.getCellEditor();

		AnioTableCell anioTableCellFk=(AnioTableCell)tableCellEditorAnio;

		if(anioTableCellFk!=null) {
			anioTableCellFk.setaniosForeignKey(aniosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosHistorialFormaPago.getSelectedRow();

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
		TableColumn tableColumnMes=this.jTableDatosHistorialFormaPago.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosHistorialFormaPago,HistorialFormaPagoConstantesFunciones.LABEL_IDMES));
		TableCellEditor tableCellEditorMes =tableColumnMes.getCellEditor();

		MesTableCell mesTableCellFk=(MesTableCell)tableCellEditorMes;

		if(mesTableCellFk!=null) {
			mesTableCellFk.setmessForeignKey(messForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosHistorialFormaPago.getSelectedRow();

		//if(intSelectedRow<=0) {
			//mesTableCellFk.setRowActual(intSelectedRow);
			//mesTableCellFk.setmessForeignKeyActual(messForeignKey);
		//}


		if(mesTableCellFk!=null) {
			mesTableCellFk.RecargarMessForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	

	public void setCombosCodigoDesdeBusquedaid_factura (Long id) throws Exception {
		this.setActualFacturaForeignKey(id,true,"Todos");

	};
	

	public void setCombosCodigoDesdeBusquedaid_cuenta_contable (Long id) throws Exception {
		this.setActualCuentaContableForeignKey(id,true,"Todos");

	};
	
	public void jButtonActualizarHistorialFormaPagoActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialformapagoLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesHistorialFormaPago(false);
			
			//if(!this.isEsNuevoHistorialFormaPago) {								
				int intSelectedRow = this.jTableDatosHistorialFormaPago.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.historialformapago =(HistorialFormaPago) this.historialformapagoLogic.getHistorialFormaPagos().toArray()[this.jTableDatosHistorialFormaPago.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.historialformapago =(HistorialFormaPago) this.historialformapagos.toArray()[this.jTableDatosHistorialFormaPago.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(HistorialFormaPagoJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualHistorialFormaPago(this.historialformapago,true);
				this.setVariablesFormularioToObjetoActualForeignKeysHistorialFormaPago(this.historialformapago);
				
			}
			
			if(this.permiteMantenimiento(this.historialformapago)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.historialformapagoSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoHistorialFormaPago=true;
					this.inicializarActualizarBindingTablaHistorialFormaPago(false);
					this.isEsNuevoHistorialFormaPago=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoHistorialFormaPago=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoHistorialFormaPago=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesHistorialFormaPago(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualHistorialFormaPago(false);
				
				this.habilitarDeshabilitarControlesHistorialFormaPago(false);
			
												
				
				if(HistorialFormaPagoJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleHistorialFormaPago();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoHistorialFormaPagoActionPerformed(evt,historialformapagoSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualHistorialFormaPago(this.historialformapago,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosHistorialFormaPago.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,historialformapagoSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialformapagoLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.historialformapago.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(HistorialFormaPago.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",HistorialFormaPago.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialformapagoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,HistorialFormaPagoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialformapagoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarHistorialFormaPagoActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialformapagoLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosHistorialFormaPago.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialformapago =(HistorialFormaPago) this.historialformapagoLogic.getHistorialFormaPagos().toArray()[this.jTableDatosHistorialFormaPago.convertRowIndexToModel(intSelectedRow)];
				this.historialformapago.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.historialformapago =(HistorialFormaPago) this.historialformapagos.toArray()[this.jTableDatosHistorialFormaPago.convertRowIndexToModel(intSelectedRow)];
				this.historialformapago.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.historialformapago)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.historialformapagoSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((HistorialFormaPagoModel) this.jTableDatosHistorialFormaPago.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoHistorialFormaPago=true;
				this.inicializarActualizarBindingTablaHistorialFormaPago(false);
				this.isEsNuevoHistorialFormaPago=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesHistorialFormaPago(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualHistorialFormaPago(false);
				
				this.habilitarDeshabilitarControlesHistorialFormaPago(false);
				
				
				
				if(HistorialFormaPagoJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleHistorialFormaPago();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialformapagoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialformapagoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,HistorialFormaPagoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialformapagoLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarHistorialFormaPagoActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosHistorialFormaPago.getRowCount()>=1) {
				jTableDatosHistorialFormaPago.removeRowSelectionInterval(0, jTableDatosHistorialFormaPago.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesHistorialFormaPago(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaHistorialFormaPago(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesHistorialFormaPago(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualHistorialFormaPago(false) ;
			
			this.isEsNuevoHistorialFormaPago=false;
			
			if(HistorialFormaPagoJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleHistorialFormaPago();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,HistorialFormaPagoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosHistorialFormaPagoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialformapagoLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingHistorialFormaPago(false);
				
				//SI ES MANUAL
				if(HistorialFormaPagoJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualHistorialFormaPago();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialformapagoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialformapagoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,HistorialFormaPagoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialformapagoLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosHistorialFormaPagoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoHistorialFormaPago--;			
			//HistorialFormaPago historialformapagoAux= new HistorialFormaPago();			
			//historialformapagoAux.setId(this.iIdNuevoHistorialFormaPago);
			
			if(this.jInternalFrameDetalleFormHistorialFormaPago==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaHistorialFormaPago();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysHistorialFormaPago(this.historialformapago);
			
			this.historialformapago.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.historialformapagoLogic.getHistorialFormaPagos().add(this.historialformapagoAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.historialformapagos.add(this.historialformapagoAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaHistorialFormaPago(false);
			
			this.jTableDatosHistorialFormaPago.setRowSelectionInterval(this.getIndiceNuevoHistorialFormaPago(), this.getIndiceNuevoHistorialFormaPago());
			
			int iLastRow =  this.jTableDatosHistorialFormaPago.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosHistorialFormaPago.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosHistorialFormaPago.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaHistorialFormaPago(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,HistorialFormaPagoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionHistorialFormaPagoActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialformapagoLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingHistorialFormaPago(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingHistorialFormaPago(false);
			
			//SI ES MANUAL
			if(HistorialFormaPagoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualHistorialFormaPago();
			}
			
			//this.abrirFrameTreeHistorialFormaPago();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialformapagoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialformapagoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,HistorialFormaPagoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialformapagoLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionHistorialFormaPagoActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Historial Forma PagoS ?", "MANTENIMIENTO DE Historial Forma Pago", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionHistorialFormaPago.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralHistorialFormaPago();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.historialformapagoReturnGeneral=historialformapagoLogic.procesarImportacionHistorialFormaPagosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.historialformapagoParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarHistorialFormaPagoReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,HistorialFormaPagoConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionHistorialFormaPagoActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionHistorialFormaPago.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionHistorialFormaPago.setFileImportacion(this.jInternalFrameImportacionHistorialFormaPago.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionHistorialFormaPago.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionHistorialFormaPago.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionHistorialFormaPago.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionHistorialFormaPago.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,HistorialFormaPagoConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoHistorialFormaPagoActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<HistorialFormaPago> historialformapagosSeleccionados=new ArrayList<HistorialFormaPago>();		

		historialformapagosSeleccionados=this.getHistorialFormaPagosSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoHistorialFormaPago.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoHistorialFormaPago.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("HistorialFormaPagoBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"HistorialFormaPagoBaseDesign.jrxml";
			
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
			
			this.generarReporteHistorialFormaPagos("Todos",historialformapagosSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.historialformapagoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Historial Forma Pago",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,HistorialFormaPagoConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoHistorialFormaPago.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoHistorialFormaPago.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case HistorialFormaPagoConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case HistorialFormaPagoConstantesFunciones.LABEL_IDSUCURSAL:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Sucursal_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Sucursal_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Sucursal_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Sucursal_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case HistorialFormaPagoConstantesFunciones.LABEL_IDEJERCICIO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Ejercicio_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Ejercicio_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Ejercicio_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Ejercicio_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case HistorialFormaPagoConstantesFunciones.LABEL_IDPERIODO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Periodo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Periodo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Periodo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Periodo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case HistorialFormaPagoConstantesFunciones.LABEL_IDFACTURA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Factura_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Factura_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Factura_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Factura_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case HistorialFormaPagoConstantesFunciones.LABEL_IDTIPOFORMAPAGO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_TipoFormaPago_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_TipoFormaPago_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_TipoFormaPago_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_TipoFormaPago_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case HistorialFormaPagoConstantesFunciones.LABEL_IDCUENTACONTABLE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_CuentaContable_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_CuentaContable_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_CuentaContable_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_CuentaContable_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case HistorialFormaPagoConstantesFunciones.LABEL_NUMERODIAS:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_meroDias_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_meroDias_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_meroDias_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_meroDias_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case HistorialFormaPagoConstantesFunciones.LABEL_VALOR:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_lor_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_lor_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_lor_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_lor_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case HistorialFormaPagoConstantesFunciones.LABEL_FECHA:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_cha_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_cha_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_cha_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_cha_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case HistorialFormaPagoConstantesFunciones.LABEL_PORCENTAJE:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_rcentaje_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_rcentaje_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_rcentaje_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_rcentaje_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case HistorialFormaPagoConstantesFunciones.LABEL_PORCENTAJERETENCION:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_rcentajeRetencion_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_rcentajeRetencion_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_rcentajeRetencion_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_rcentajeRetencion_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case HistorialFormaPagoConstantesFunciones.LABEL_BASERETENCION:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_seRetencion_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_seRetencion_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_seRetencion_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_seRetencion_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case HistorialFormaPagoConstantesFunciones.LABEL_NUMERORETENCION:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_meroRetencion_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_meroRetencion_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_meroRetencion_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_meroRetencion_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case HistorialFormaPagoConstantesFunciones.LABEL_NOMBRERETENCION:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreRetencion_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreRetencion_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreRetencion_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreRetencion_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case HistorialFormaPagoConstantesFunciones.LABEL_IDANIO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Anio_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Anio_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Anio_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Anio_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case HistorialFormaPagoConstantesFunciones.LABEL_IDMES:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Mes_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Mes_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Mes_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Mes_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoHistorialFormaPago.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoHistorialFormaPago.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoHistorialFormaPago.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case HistorialFormaPagoConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case HistorialFormaPagoConstantesFunciones.LABEL_IDSUCURSAL:
					sNombreCampoCategoria="id_sucursal";
					break;

				case HistorialFormaPagoConstantesFunciones.LABEL_IDEJERCICIO:
					sNombreCampoCategoria="id_ejercicio";
					break;

				case HistorialFormaPagoConstantesFunciones.LABEL_IDPERIODO:
					sNombreCampoCategoria="id_periodo";
					break;

				case HistorialFormaPagoConstantesFunciones.LABEL_IDFACTURA:
					sNombreCampoCategoria="id_factura";
					break;

				case HistorialFormaPagoConstantesFunciones.LABEL_IDTIPOFORMAPAGO:
					sNombreCampoCategoria="id_tipo_forma_pago";
					break;

				case HistorialFormaPagoConstantesFunciones.LABEL_IDCUENTACONTABLE:
					sNombreCampoCategoria="id_cuenta_contable";
					break;

				case HistorialFormaPagoConstantesFunciones.LABEL_NUMERODIAS:
					sNombreCampoCategoria="numero_dias";
					break;

				case HistorialFormaPagoConstantesFunciones.LABEL_VALOR:
					sNombreCampoCategoria="valor";
					break;

				case HistorialFormaPagoConstantesFunciones.LABEL_FECHA:
					sNombreCampoCategoria="fecha";
					break;

				case HistorialFormaPagoConstantesFunciones.LABEL_PORCENTAJE:
					sNombreCampoCategoria="porcentaje";
					break;

				case HistorialFormaPagoConstantesFunciones.LABEL_PORCENTAJERETENCION:
					sNombreCampoCategoria="porcentaje_retencion";
					break;

				case HistorialFormaPagoConstantesFunciones.LABEL_BASERETENCION:
					sNombreCampoCategoria="base_retencion";
					break;

				case HistorialFormaPagoConstantesFunciones.LABEL_NUMERORETENCION:
					sNombreCampoCategoria="numero_retencion";
					break;

				case HistorialFormaPagoConstantesFunciones.LABEL_NOMBRERETENCION:
					sNombreCampoCategoria="nombre_retencion";
					break;

				case HistorialFormaPagoConstantesFunciones.LABEL_IDANIO:
					sNombreCampoCategoria="id_anio";
					break;

				case HistorialFormaPagoConstantesFunciones.LABEL_IDMES:
					sNombreCampoCategoria="id_mes";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoHistorialFormaPago.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case HistorialFormaPagoConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case HistorialFormaPagoConstantesFunciones.LABEL_IDSUCURSAL:
					sNombreCampoCategoriaValor="id_sucursal";
					break;

				case HistorialFormaPagoConstantesFunciones.LABEL_IDEJERCICIO:
					sNombreCampoCategoriaValor="id_ejercicio";
					break;

				case HistorialFormaPagoConstantesFunciones.LABEL_IDPERIODO:
					sNombreCampoCategoriaValor="id_periodo";
					break;

				case HistorialFormaPagoConstantesFunciones.LABEL_IDFACTURA:
					sNombreCampoCategoriaValor="id_factura";
					break;

				case HistorialFormaPagoConstantesFunciones.LABEL_IDTIPOFORMAPAGO:
					sNombreCampoCategoriaValor="id_tipo_forma_pago";
					break;

				case HistorialFormaPagoConstantesFunciones.LABEL_IDCUENTACONTABLE:
					sNombreCampoCategoriaValor="id_cuenta_contable";
					break;

				case HistorialFormaPagoConstantesFunciones.LABEL_NUMERODIAS:
					sNombreCampoCategoriaValor="numero_dias";
					break;

				case HistorialFormaPagoConstantesFunciones.LABEL_VALOR:
					sNombreCampoCategoriaValor="valor";
					break;

				case HistorialFormaPagoConstantesFunciones.LABEL_FECHA:
					sNombreCampoCategoriaValor="fecha";
					break;

				case HistorialFormaPagoConstantesFunciones.LABEL_PORCENTAJE:
					sNombreCampoCategoriaValor="porcentaje";
					break;

				case HistorialFormaPagoConstantesFunciones.LABEL_PORCENTAJERETENCION:
					sNombreCampoCategoriaValor="porcentaje_retencion";
					break;

				case HistorialFormaPagoConstantesFunciones.LABEL_BASERETENCION:
					sNombreCampoCategoriaValor="base_retencion";
					break;

				case HistorialFormaPagoConstantesFunciones.LABEL_NUMERORETENCION:
					sNombreCampoCategoriaValor="numero_retencion";
					break;

				case HistorialFormaPagoConstantesFunciones.LABEL_NOMBRERETENCION:
					sNombreCampoCategoriaValor="nombre_retencion";
					break;

				case HistorialFormaPagoConstantesFunciones.LABEL_IDANIO:
					sNombreCampoCategoriaValor="id_anio";
					break;

				case HistorialFormaPagoConstantesFunciones.LABEL_IDMES:
					sNombreCampoCategoriaValor="id_mes";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoHistorialFormaPago.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoHistorialFormaPago.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case HistorialFormaPagoConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case HistorialFormaPagoConstantesFunciones.LABEL_IDSUCURSAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Sucursal",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_sucursal");
					break;

				case HistorialFormaPagoConstantesFunciones.LABEL_IDEJERCICIO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Ejercicio",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_ejercicio");
					break;

				case HistorialFormaPagoConstantesFunciones.LABEL_IDPERIODO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Periodo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_periodo");
					break;

				case HistorialFormaPagoConstantesFunciones.LABEL_IDFACTURA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Factura",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_factura");
					break;

				case HistorialFormaPagoConstantesFunciones.LABEL_IDTIPOFORMAPAGO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Tipo Forma Pago",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_tipo_forma_pago");
					break;

				case HistorialFormaPagoConstantesFunciones.LABEL_IDCUENTACONTABLE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Cuenta Contable",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_cuenta_contable");
					break;

				case HistorialFormaPagoConstantesFunciones.LABEL_NUMERODIAS:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Numero Dias",sNombreCampoCategoria,sNombreCampoCategoriaValor,"numero_dias");
					break;

				case HistorialFormaPagoConstantesFunciones.LABEL_VALOR:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Valor",sNombreCampoCategoria,sNombreCampoCategoriaValor,"valor");
					break;

				case HistorialFormaPagoConstantesFunciones.LABEL_FECHA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Fecha",sNombreCampoCategoria,sNombreCampoCategoriaValor,"fecha");
					break;

				case HistorialFormaPagoConstantesFunciones.LABEL_PORCENTAJE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Porcentaje",sNombreCampoCategoria,sNombreCampoCategoriaValor,"porcentaje");
					break;

				case HistorialFormaPagoConstantesFunciones.LABEL_PORCENTAJERETENCION:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Porcentaje Retencion",sNombreCampoCategoria,sNombreCampoCategoriaValor,"porcentaje_retencion");
					break;

				case HistorialFormaPagoConstantesFunciones.LABEL_BASERETENCION:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Base Retencion",sNombreCampoCategoria,sNombreCampoCategoriaValor,"base_retencion");
					break;

				case HistorialFormaPagoConstantesFunciones.LABEL_NUMERORETENCION:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Numero Retencion",sNombreCampoCategoria,sNombreCampoCategoriaValor,"numero_retencion");
					break;

				case HistorialFormaPagoConstantesFunciones.LABEL_NOMBRERETENCION:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Retencion",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_retencion");
					break;

				case HistorialFormaPagoConstantesFunciones.LABEL_IDANIO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Anio",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_anio");
					break;

				case HistorialFormaPagoConstantesFunciones.LABEL_IDMES:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Mes",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_mes");
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
	
	public void jButtonGenerarExcelReporteDinamicoHistorialFormaPagoActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<HistorialFormaPago> historialformapagosSeleccionados=new ArrayList<HistorialFormaPago>();		
		
		historialformapagosSeleccionados=this.getHistorialFormaPagosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"historialformapago";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("HistorialFormaPagos");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoHistorialFormaPago.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoHistorialFormaPago.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case HistorialFormaPagoConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(HistorialFormaPagoConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(HistorialFormaPago historialformapago:historialformapagosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(historialformapago.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case HistorialFormaPagoConstantesFunciones.LABEL_IDSUCURSAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(HistorialFormaPagoConstantesFunciones.LABEL_IDSUCURSAL);
					iRow++;

					for(HistorialFormaPago historialformapago:historialformapagosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(historialformapago.getsucursal_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case HistorialFormaPagoConstantesFunciones.LABEL_IDEJERCICIO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(HistorialFormaPagoConstantesFunciones.LABEL_IDEJERCICIO);
					iRow++;

					for(HistorialFormaPago historialformapago:historialformapagosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(historialformapago.getejercicio_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case HistorialFormaPagoConstantesFunciones.LABEL_IDPERIODO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(HistorialFormaPagoConstantesFunciones.LABEL_IDPERIODO);
					iRow++;

					for(HistorialFormaPago historialformapago:historialformapagosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(historialformapago.getperiodo_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case HistorialFormaPagoConstantesFunciones.LABEL_IDFACTURA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(HistorialFormaPagoConstantesFunciones.LABEL_IDFACTURA);
					iRow++;

					for(HistorialFormaPago historialformapago:historialformapagosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(historialformapago.getfactura_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case HistorialFormaPagoConstantesFunciones.LABEL_IDTIPOFORMAPAGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(HistorialFormaPagoConstantesFunciones.LABEL_IDTIPOFORMAPAGO);
					iRow++;

					for(HistorialFormaPago historialformapago:historialformapagosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(historialformapago.gettipoformapago_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case HistorialFormaPagoConstantesFunciones.LABEL_IDCUENTACONTABLE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(HistorialFormaPagoConstantesFunciones.LABEL_IDCUENTACONTABLE);
					iRow++;

					for(HistorialFormaPago historialformapago:historialformapagosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(historialformapago.getcuentacontable_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case HistorialFormaPagoConstantesFunciones.LABEL_NUMERODIAS:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(HistorialFormaPagoConstantesFunciones.LABEL_NUMERODIAS);
					iRow++;

					for(HistorialFormaPago historialformapago:historialformapagosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(historialformapago.getnumero_dias());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case HistorialFormaPagoConstantesFunciones.LABEL_VALOR:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(HistorialFormaPagoConstantesFunciones.LABEL_VALOR);
					iRow++;

					for(HistorialFormaPago historialformapago:historialformapagosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(historialformapago.getvalor());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case HistorialFormaPagoConstantesFunciones.LABEL_FECHA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(HistorialFormaPagoConstantesFunciones.LABEL_FECHA);
					iRow++;

					for(HistorialFormaPago historialformapago:historialformapagosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(historialformapago.getfecha());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case HistorialFormaPagoConstantesFunciones.LABEL_PORCENTAJE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(HistorialFormaPagoConstantesFunciones.LABEL_PORCENTAJE);
					iRow++;

					for(HistorialFormaPago historialformapago:historialformapagosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(historialformapago.getporcentaje());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case HistorialFormaPagoConstantesFunciones.LABEL_PORCENTAJERETENCION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(HistorialFormaPagoConstantesFunciones.LABEL_PORCENTAJERETENCION);
					iRow++;

					for(HistorialFormaPago historialformapago:historialformapagosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(historialformapago.getporcentaje_retencion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case HistorialFormaPagoConstantesFunciones.LABEL_BASERETENCION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(HistorialFormaPagoConstantesFunciones.LABEL_BASERETENCION);
					iRow++;

					for(HistorialFormaPago historialformapago:historialformapagosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(historialformapago.getbase_retencion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case HistorialFormaPagoConstantesFunciones.LABEL_NUMERORETENCION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(HistorialFormaPagoConstantesFunciones.LABEL_NUMERORETENCION);
					iRow++;

					for(HistorialFormaPago historialformapago:historialformapagosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(historialformapago.getnumero_retencion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case HistorialFormaPagoConstantesFunciones.LABEL_NOMBRERETENCION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(HistorialFormaPagoConstantesFunciones.LABEL_NOMBRERETENCION);
					iRow++;

					for(HistorialFormaPago historialformapago:historialformapagosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(historialformapago.getnombre_retencion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case HistorialFormaPagoConstantesFunciones.LABEL_IDANIO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(HistorialFormaPagoConstantesFunciones.LABEL_IDANIO);
					iRow++;

					for(HistorialFormaPago historialformapago:historialformapagosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(historialformapago.getanio_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case HistorialFormaPagoConstantesFunciones.LABEL_IDMES:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(HistorialFormaPagoConstantesFunciones.LABEL_IDMES);
					iRow++;

					for(HistorialFormaPago historialformapago:historialformapagosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(historialformapago.getmes_descripcion());
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
			//	this.getFilaCabeceraExportarExcelHistorialFormaPago(row);				
			//	iRow++;
			//}				
			
			//for(HistorialFormaPago historialformapagoAux:historialformapagosSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelHistorialFormaPago(historialformapagoAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.historialformapagoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Historial Forma Pago",JOptionPane.INFORMATION_MESSAGE);
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
				this.historialformapagoLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingHistorialFormaPago(false);
			
			//SI ES MANUAL
			if(HistorialFormaPagoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualHistorialFormaPago();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialformapagoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialformapagoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialformapagoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresHistorialFormaPagoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialformapagoLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingHistorialFormaPago(false);
			
			//SI ES MANUAL
			if(HistorialFormaPagoJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualHistorialFormaPago();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialformapagoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialformapagoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,HistorialFormaPagoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialformapagoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesHistorialFormaPagoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialformapagoLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingHistorialFormaPago(false);
			
			//SI ES MANUAL
			if(HistorialFormaPagoJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualHistorialFormaPago();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialformapagoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialformapagoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,HistorialFormaPagoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialformapagoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaHistorialFormaPago() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosHistorialFormaPago.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosHistorialFormaPago.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosHistorialFormaPago.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosHistorialFormaPago.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosHistorialFormaPago.setMinimumSize(dimensionMinimum);
		this.jTableDatosHistorialFormaPago.setMaximumSize(dimensionMaximum);
		this.jTableDatosHistorialFormaPago.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingHistorialFormaPago(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingHistorialFormaPago(esInicializar,true);
	}
	
	public void inicializarActualizarBindingHistorialFormaPago(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaHistorialFormaPago(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesHistorialFormaPago(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.historialformapagoSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasHistorialFormaPago(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesHistorialFormaPago(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesHistorialFormaPago(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !HistorialFormaPagoJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!HistorialFormaPagoJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualHistorialFormaPago() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaHistorialFormaPago();
		
		this.inicializarActualizarBindingBotonesManualHistorialFormaPago(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.historialformapagoSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualHistorialFormaPago();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesHistorialFormaPago() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualHistorialFormaPago(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualHistorialFormaPago(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosHistorialFormaPago.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosHistorialFormaPago.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteHistorialFormaPago.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormHistorialFormaPago!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormHistorialFormaPago.jCheckBoxPostAccionNuevoHistorialFormaPago.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormHistorialFormaPago.jCheckBoxPostAccionSinCerrarHistorialFormaPago.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormHistorialFormaPago.jCheckBoxPostAccionSinMensajeHistorialFormaPago.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosHistorialFormaPago.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosHistorialFormaPago.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteHistorialFormaPago.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormHistorialFormaPago!=null) {
				this.jInternalFrameDetalleFormHistorialFormaPago.jCheckBoxPostAccionNuevoHistorialFormaPago.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormHistorialFormaPago.jCheckBoxPostAccionSinCerrarHistorialFormaPago.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormHistorialFormaPago.jCheckBoxPostAccionSinMensajeHistorialFormaPago.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionHistorialFormaPago.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionHistorialFormaPago.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormHistorialFormaPago!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormHistorialFormaPago.jComboBoxTiposAccionesFormularioHistorialFormaPago.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesHistorialFormaPago.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoHistorialFormaPago!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoHistorialFormaPago.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesHistorialFormaPago.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesHistorialFormaPago.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarHistorialFormaPago.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesHistorialFormaPago.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoHistorialFormaPago!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoHistorialFormaPago.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesHistorialFormaPago.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralHistorialFormaPago.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesHistorialFormaPago(Boolean esInicializar) throws Exception {
		try	{	
			if(HistorialFormaPagoJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualHistorialFormaPago(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesHistorialFormaPago() throws Exception {
		try	{
			if(HistorialFormaPagoJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualHistorialFormaPago();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleHistorialFormaPago() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormHistorialFormaPago.jComboBoxTiposAccionesFormularioHistorialFormaPago.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormHistorialFormaPago.jComboBoxTiposAccionesFormularioHistorialFormaPago.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualHistorialFormaPago() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesHistorialFormaPago.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesHistorialFormaPago.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesHistorialFormaPago.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesHistorialFormaPago.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesHistorialFormaPago.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesHistorialFormaPago.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionHistorialFormaPago.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionHistorialFormaPago.addItem(reporte);
			}
			
			
			if(!this.historialformapagoSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionHistorialFormaPago.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionHistorialFormaPago.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesHistorialFormaPago.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesHistorialFormaPago.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesHistorialFormaPago.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesHistorialFormaPago.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormHistorialFormaPago!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormHistorialFormaPago.jComboBoxTiposAccionesFormularioHistorialFormaPago.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormHistorialFormaPago.jComboBoxTiposAccionesFormularioHistorialFormaPago.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarHistorialFormaPago.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarHistorialFormaPago.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarHistorialFormaPago.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualHistorialFormaPago();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualHistorialFormaPago() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoHistorialFormaPago!=null) {
				this.jInternalFrameReporteDinamicoHistorialFormaPago.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoHistorialFormaPago.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoHistorialFormaPago!=null) {
				this.jInternalFrameReporteDinamicoHistorialFormaPago.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoHistorialFormaPago.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoHistorialFormaPago!=null) {
				
				if(this.jInternalFrameReporteDinamicoHistorialFormaPago.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoHistorialFormaPago.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoHistorialFormaPago.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoHistorialFormaPago.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoHistorialFormaPago.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoHistorialFormaPago.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
				
				//TIPOS COLUMNAS CATEGORIA DINAMICO
				if(this.jInternalFrameReporteDinamicoHistorialFormaPago.getjComboBoxColumnaCategoriaGrafico()!=null) {
					this.jInternalFrameReporteDinamicoHistorialFormaPago.getjComboBoxColumnaCategoriaGrafico().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoria=HistorialFormaPagoConstantesFunciones.getTiposSeleccionarHistorialFormaPago(true,true,false,true,true);
						
					for(Reporte reporte:tiposColumnasCategoria) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoHistorialFormaPago.getjComboBoxColumnaCategoriaGrafico().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS CATEGORIA VALOR DINAMICO
				if(this.jInternalFrameReporteDinamicoHistorialFormaPago.getjComboBoxColumnaCategoriaValor()!=null) {
					this.jInternalFrameReporteDinamicoHistorialFormaPago.getjComboBoxColumnaCategoriaValor().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoriaValor=HistorialFormaPagoConstantesFunciones.getTiposSeleccionarHistorialFormaPago(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasCategoriaValor) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoHistorialFormaPago.getjComboBoxColumnaCategoriaValor().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS VALOR
				defaultListModel=new DefaultListModel<Reporte>();
					
				if(this.jInternalFrameReporteDinamicoHistorialFormaPago.getjListColumnasValoresGrafico()!=null) {
					this.jInternalFrameReporteDinamicoHistorialFormaPago.getjListColumnasValoresGrafico().removeAll();
						
					ArrayList<Reporte> tiposColumnasValor=HistorialFormaPagoConstantesFunciones.getTiposSeleccionarHistorialFormaPago(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasValor) {//this.tiposSeleccionar
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoHistorialFormaPago.getjListColumnasValoresGrafico().setModel(defaultListModel);									
						
				}
					
				//TIPOS GRAFICOS REPORTES DINAMICOS
				if(this.jInternalFrameReporteDinamicoHistorialFormaPago.getjComboBoxTiposGraficosReportesDinamico()!=null) {
					this.jInternalFrameReporteDinamicoHistorialFormaPago.getjComboBoxTiposGraficosReportesDinamico().removeAllItems();
						
					for(Reporte reporte:this.tiposGraficosReportes) {
						this.jInternalFrameReporteDinamicoHistorialFormaPago.getjComboBoxTiposGraficosReportesDinamico().addItem(reporte);
					}
					
				}
			
			
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualHistorialFormaPago()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_cuenta_contableFK_IdCuentaContableHistorialFormaPago.getSelectedItem()!=null){this.id_cuenta_contableFK_IdCuentaContable=((CuentaContable)this.jComboBoxid_cuenta_contableFK_IdCuentaContableHistorialFormaPago.getSelectedItem()).getId();}
		if(this.jComboBoxid_facturaFK_IdFacturaHistorialFormaPago.getSelectedItem()!=null){this.id_facturaFK_IdFactura=((Factura)this.jComboBoxid_facturaFK_IdFacturaHistorialFormaPago.getSelectedItem()).getId();}
		if(this.jComboBoxid_tipo_forma_pagoFK_IdTipoFormaPagoHistorialFormaPago.getSelectedItem()!=null){this.id_tipo_forma_pagoFK_IdTipoFormaPago=((TipoFormaPago)this.jComboBoxid_tipo_forma_pagoFK_IdTipoFormaPagoHistorialFormaPago.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasHistorialFormaPago(Boolean esInicializar) throws Exception {				
		if(HistorialFormaPagoJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualHistorialFormaPago();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaHistorialFormaPago() throws Exception {
		this.inicializarActualizarBindingTablaHistorialFormaPago(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByHistorialFormaPago() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByHistorialFormaPago.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByHistorialFormaPago.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByHistorialFormaPago.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new HistorialFormaPagoPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByHistorialFormaPago.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByHistorialFormaPago.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new HistorialFormaPagoPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosHistorialFormaPagoOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosHistorialFormaPagoOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new HistorialFormaPagoPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByHistorialFormaPago.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByHistorialFormaPago.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new HistorialFormaPagoPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByHistorialFormaPago.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaHistorialFormaPago(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=historialformapagoLogic.getHistorialFormaPagos().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=historialformapagos.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(HistorialFormaPagoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosHistorialFormaPago.setModel(new HistorialFormaPagoModel(this.historialformapagoLogic.getHistorialFormaPagos(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosHistorialFormaPago.setModel(new HistorialFormaPagoModel(this.historialformapagos,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByHistorialFormaPago!=null && this.jInternalFrameOrderByHistorialFormaPago.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByHistorialFormaPago();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosHistorialFormaPago.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosHistorialFormaPago,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new HistorialFormaPagoPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+HistorialFormaPagoConstantesFunciones.SCLASSWEBTITULO,historialformapagoConstantesFunciones.resaltarSeleccionarHistorialFormaPago,iSizeTabla,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+HistorialFormaPagoConstantesFunciones.SCLASSWEBTITULO,historialformapagoConstantesFunciones.resaltarSeleccionarHistorialFormaPago,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosHistorialFormaPago.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosHistorialFormaPago,HistorialFormaPagoConstantesFunciones.LABEL_ID));

		if(this.historialformapagoConstantesFunciones.mostraridHistorialFormaPago && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,HistorialFormaPagoConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.historialformapagoConstantesFunciones.resaltaridHistorialFormaPago,this.historialformapagoConstantesFunciones.activaridHistorialFormaPago,iSizeTabla,this,true,"idHistorialFormaPago","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.historialformapagoConstantesFunciones.resaltaridHistorialFormaPago,this.historialformapagoConstantesFunciones.activaridHistorialFormaPago,this,true,"idHistorialFormaPago","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosHistorialFormaPago.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosHistorialFormaPago,HistorialFormaPagoConstantesFunciones.LABEL_IDEMPRESA));

		if(this.historialformapagoConstantesFunciones.mostrarid_empresaHistorialFormaPago && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,HistorialFormaPagoConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.historialformapagoConstantesFunciones.resaltarid_empresaHistorialFormaPago,this,this.historialformapagoConstantesFunciones.activarid_empresaHistorialFormaPago,iSizeTabla));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.historialformapagoConstantesFunciones.resaltarid_empresaHistorialFormaPago,this,this.historialformapagoConstantesFunciones.activarid_empresaHistorialFormaPago,false,"id_empresaHistorialFormaPago","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new HistorialFormaPagoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosHistorialFormaPago.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosHistorialFormaPago,HistorialFormaPagoConstantesFunciones.LABEL_IDSUCURSAL));

		if(this.historialformapagoConstantesFunciones.mostrarid_sucursalHistorialFormaPago && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,HistorialFormaPagoConstantesFunciones.LABEL_IDSUCURSAL,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new SucursalTableCell(this.sucursalsForeignKey,this.historialformapagoConstantesFunciones.resaltarid_sucursalHistorialFormaPago,this,this.historialformapagoConstantesFunciones.activarid_sucursalHistorialFormaPago,iSizeTabla));
			tableColumn.setCellEditor(new SucursalTableCell(this.sucursalsForeignKey,this.historialformapagoConstantesFunciones.resaltarid_sucursalHistorialFormaPago,this,this.historialformapagoConstantesFunciones.activarid_sucursalHistorialFormaPago,false,"id_sucursalHistorialFormaPago","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new HistorialFormaPagoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosHistorialFormaPago.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosHistorialFormaPago,HistorialFormaPagoConstantesFunciones.LABEL_IDEJERCICIO));

		if(this.historialformapagoConstantesFunciones.mostrarid_ejercicioHistorialFormaPago && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,HistorialFormaPagoConstantesFunciones.LABEL_IDEJERCICIO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EjercicioTableCell(this.ejerciciosForeignKey,this.historialformapagoConstantesFunciones.resaltarid_ejercicioHistorialFormaPago,this,this.historialformapagoConstantesFunciones.activarid_ejercicioHistorialFormaPago,iSizeTabla));
			tableColumn.setCellEditor(new EjercicioTableCell(this.ejerciciosForeignKey,this.historialformapagoConstantesFunciones.resaltarid_ejercicioHistorialFormaPago,this,this.historialformapagoConstantesFunciones.activarid_ejercicioHistorialFormaPago,false,"id_ejercicioHistorialFormaPago","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new HistorialFormaPagoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosHistorialFormaPago.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosHistorialFormaPago,HistorialFormaPagoConstantesFunciones.LABEL_IDPERIODO));

		if(this.historialformapagoConstantesFunciones.mostrarid_periodoHistorialFormaPago && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,HistorialFormaPagoConstantesFunciones.LABEL_IDPERIODO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new PeriodoTableCell(this.periodosForeignKey,this.historialformapagoConstantesFunciones.resaltarid_periodoHistorialFormaPago,this,this.historialformapagoConstantesFunciones.activarid_periodoHistorialFormaPago,iSizeTabla));
			tableColumn.setCellEditor(new PeriodoTableCell(this.periodosForeignKey,this.historialformapagoConstantesFunciones.resaltarid_periodoHistorialFormaPago,this,this.historialformapagoConstantesFunciones.activarid_periodoHistorialFormaPago,false,"id_periodoHistorialFormaPago","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new HistorialFormaPagoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosHistorialFormaPago.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosHistorialFormaPago,HistorialFormaPagoConstantesFunciones.LABEL_IDFACTURA));

		if(this.historialformapagoConstantesFunciones.mostrarid_facturaHistorialFormaPago && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,HistorialFormaPagoConstantesFunciones.LABEL_IDFACTURA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new FacturaTableCell(this.facturasForeignKey,this.historialformapagoConstantesFunciones.resaltarid_facturaHistorialFormaPago,this,this.historialformapagoConstantesFunciones.activarid_facturaHistorialFormaPago,iSizeTabla));
			tableColumn.setCellEditor(new FacturaTableCell(this.facturasForeignKey,this.historialformapagoConstantesFunciones.resaltarid_facturaHistorialFormaPago,this,this.historialformapagoConstantesFunciones.activarid_facturaHistorialFormaPago,true,"id_facturaHistorialFormaPago","CON_BUSQUEDA"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new HistorialFormaPagoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosHistorialFormaPago.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosHistorialFormaPago,HistorialFormaPagoConstantesFunciones.LABEL_IDTIPOFORMAPAGO));

		if(this.historialformapagoConstantesFunciones.mostrarid_tipo_forma_pagoHistorialFormaPago && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,HistorialFormaPagoConstantesFunciones.LABEL_IDTIPOFORMAPAGO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new TipoFormaPagoTableCell(this.tipoformapagosForeignKey,this.historialformapagoConstantesFunciones.resaltarid_tipo_forma_pagoHistorialFormaPago,this,this.historialformapagoConstantesFunciones.activarid_tipo_forma_pagoHistorialFormaPago,iSizeTabla));
			tableColumn.setCellEditor(new TipoFormaPagoTableCell(this.tipoformapagosForeignKey,this.historialformapagoConstantesFunciones.resaltarid_tipo_forma_pagoHistorialFormaPago,this,this.historialformapagoConstantesFunciones.activarid_tipo_forma_pagoHistorialFormaPago,true,"id_tipo_forma_pagoHistorialFormaPago","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new HistorialFormaPagoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosHistorialFormaPago.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosHistorialFormaPago,HistorialFormaPagoConstantesFunciones.LABEL_IDCUENTACONTABLE));

		if(this.historialformapagoConstantesFunciones.mostrarid_cuenta_contableHistorialFormaPago && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,HistorialFormaPagoConstantesFunciones.LABEL_IDCUENTACONTABLE,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new CuentaContableTableCell(this.cuentacontablesForeignKey,this.historialformapagoConstantesFunciones.resaltarid_cuenta_contableHistorialFormaPago,this,this.historialformapagoConstantesFunciones.activarid_cuenta_contableHistorialFormaPago,iSizeTabla));
			tableColumn.setCellEditor(new CuentaContableTableCell(this.cuentacontablesForeignKey,this.historialformapagoConstantesFunciones.resaltarid_cuenta_contableHistorialFormaPago,this,this.historialformapagoConstantesFunciones.activarid_cuenta_contableHistorialFormaPago,true,"id_cuenta_contableHistorialFormaPago","CON_BUSQUEDA"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70);
			//tableColumn.addPropertyChangeListener(new HistorialFormaPagoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosHistorialFormaPago.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosHistorialFormaPago,HistorialFormaPagoConstantesFunciones.LABEL_NUMERODIAS));

		if(this.historialformapagoConstantesFunciones.mostrarnumero_diasHistorialFormaPago && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,HistorialFormaPagoConstantesFunciones.LABEL_NUMERODIAS,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.historialformapagoConstantesFunciones.resaltarnumero_diasHistorialFormaPago,this.historialformapagoConstantesFunciones.activarnumero_diasHistorialFormaPago,iSizeTabla,this,true,"numero_diasHistorialFormaPago","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.historialformapagoConstantesFunciones.resaltarnumero_diasHistorialFormaPago,this.historialformapagoConstantesFunciones.activarnumero_diasHistorialFormaPago,this,true,"numero_diasHistorialFormaPago","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new HistorialFormaPagoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosHistorialFormaPago.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosHistorialFormaPago,HistorialFormaPagoConstantesFunciones.LABEL_VALOR));

		if(this.historialformapagoConstantesFunciones.mostrarvalorHistorialFormaPago && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,HistorialFormaPagoConstantesFunciones.LABEL_VALOR,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.historialformapagoConstantesFunciones.resaltarvalorHistorialFormaPago,this.historialformapagoConstantesFunciones.activarvalorHistorialFormaPago,iSizeTabla,this,true,"valorHistorialFormaPago","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.historialformapagoConstantesFunciones.resaltarvalorHistorialFormaPago,this.historialformapagoConstantesFunciones.activarvalorHistorialFormaPago,this,true,"valorHistorialFormaPago","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new HistorialFormaPagoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosHistorialFormaPago.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosHistorialFormaPago,HistorialFormaPagoConstantesFunciones.LABEL_FECHA));

		if(this.historialformapagoConstantesFunciones.mostrarfechaHistorialFormaPago && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,HistorialFormaPagoConstantesFunciones.LABEL_FECHA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new DateRenderer(this.historialformapagoConstantesFunciones.resaltarfechaHistorialFormaPago,this.historialformapagoConstantesFunciones.activarfechaHistorialFormaPago,iSizeTabla,this,true,"fechaHistorialFormaPago","BASICO"));
			tableColumn.setCellEditor(new DateEditorRenderer(this.historialformapagoConstantesFunciones.resaltarfechaHistorialFormaPago,this.historialformapagoConstantesFunciones.activarfechaHistorialFormaPago,this,true,"fechaHistorialFormaPago","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30);
			//tableColumn.addPropertyChangeListener(new HistorialFormaPagoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosHistorialFormaPago.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosHistorialFormaPago,HistorialFormaPagoConstantesFunciones.LABEL_PORCENTAJE));

		if(this.historialformapagoConstantesFunciones.mostrarporcentajeHistorialFormaPago && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,HistorialFormaPagoConstantesFunciones.LABEL_PORCENTAJE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.historialformapagoConstantesFunciones.resaltarporcentajeHistorialFormaPago,this.historialformapagoConstantesFunciones.activarporcentajeHistorialFormaPago,iSizeTabla,this,true,"porcentajeHistorialFormaPago","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.historialformapagoConstantesFunciones.resaltarporcentajeHistorialFormaPago,this.historialformapagoConstantesFunciones.activarporcentajeHistorialFormaPago,this,true,"porcentajeHistorialFormaPago","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new HistorialFormaPagoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosHistorialFormaPago.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosHistorialFormaPago,HistorialFormaPagoConstantesFunciones.LABEL_PORCENTAJERETENCION));

		if(this.historialformapagoConstantesFunciones.mostrarporcentaje_retencionHistorialFormaPago && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,HistorialFormaPagoConstantesFunciones.LABEL_PORCENTAJERETENCION,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.historialformapagoConstantesFunciones.resaltarporcentaje_retencionHistorialFormaPago,this.historialformapagoConstantesFunciones.activarporcentaje_retencionHistorialFormaPago,iSizeTabla,this,true,"porcentaje_retencionHistorialFormaPago","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.historialformapagoConstantesFunciones.resaltarporcentaje_retencionHistorialFormaPago,this.historialformapagoConstantesFunciones.activarporcentaje_retencionHistorialFormaPago,this,true,"porcentaje_retencionHistorialFormaPago","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new HistorialFormaPagoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosHistorialFormaPago.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosHistorialFormaPago,HistorialFormaPagoConstantesFunciones.LABEL_BASERETENCION));

		if(this.historialformapagoConstantesFunciones.mostrarbase_retencionHistorialFormaPago && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,HistorialFormaPagoConstantesFunciones.LABEL_BASERETENCION,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.historialformapagoConstantesFunciones.resaltarbase_retencionHistorialFormaPago,this.historialformapagoConstantesFunciones.activarbase_retencionHistorialFormaPago,iSizeTabla,this,true,"base_retencionHistorialFormaPago","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.historialformapagoConstantesFunciones.resaltarbase_retencionHistorialFormaPago,this.historialformapagoConstantesFunciones.activarbase_retencionHistorialFormaPago,this,true,"base_retencionHistorialFormaPago","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new HistorialFormaPagoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosHistorialFormaPago.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosHistorialFormaPago,HistorialFormaPagoConstantesFunciones.LABEL_NUMERORETENCION));

		if(this.historialformapagoConstantesFunciones.mostrarnumero_retencionHistorialFormaPago && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,HistorialFormaPagoConstantesFunciones.LABEL_NUMERORETENCION,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.historialformapagoConstantesFunciones.resaltarnumero_retencionHistorialFormaPago,this.historialformapagoConstantesFunciones.activarnumero_retencionHistorialFormaPago,iSizeTabla,this,true,"numero_retencionHistorialFormaPago","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.historialformapagoConstantesFunciones.resaltarnumero_retencionHistorialFormaPago,this.historialformapagoConstantesFunciones.activarnumero_retencionHistorialFormaPago,this,true,"numero_retencionHistorialFormaPago","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new HistorialFormaPagoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosHistorialFormaPago.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosHistorialFormaPago,HistorialFormaPagoConstantesFunciones.LABEL_NOMBRERETENCION));

		if(this.historialformapagoConstantesFunciones.mostrarnombre_retencionHistorialFormaPago && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,HistorialFormaPagoConstantesFunciones.LABEL_NOMBRERETENCION,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.historialformapagoConstantesFunciones.resaltarnombre_retencionHistorialFormaPago,this.historialformapagoConstantesFunciones.activarnombre_retencionHistorialFormaPago,iSizeTabla,this,true,"nombre_retencionHistorialFormaPago","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.historialformapagoConstantesFunciones.resaltarnombre_retencionHistorialFormaPago,this.historialformapagoConstantesFunciones.activarnombre_retencionHistorialFormaPago,this,true,"nombre_retencionHistorialFormaPago","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new HistorialFormaPagoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosHistorialFormaPago.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosHistorialFormaPago,HistorialFormaPagoConstantesFunciones.LABEL_IDANIO));

		if(this.historialformapagoConstantesFunciones.mostrarid_anioHistorialFormaPago && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,HistorialFormaPagoConstantesFunciones.LABEL_IDANIO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new AnioTableCell(this.aniosForeignKey,this.historialformapagoConstantesFunciones.resaltarid_anioHistorialFormaPago,this,this.historialformapagoConstantesFunciones.activarid_anioHistorialFormaPago,iSizeTabla));
			tableColumn.setCellEditor(new AnioTableCell(this.aniosForeignKey,this.historialformapagoConstantesFunciones.resaltarid_anioHistorialFormaPago,this,this.historialformapagoConstantesFunciones.activarid_anioHistorialFormaPago,true,"id_anioHistorialFormaPago","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new HistorialFormaPagoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosHistorialFormaPago.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosHistorialFormaPago,HistorialFormaPagoConstantesFunciones.LABEL_IDMES));

		if(this.historialformapagoConstantesFunciones.mostrarid_mesHistorialFormaPago && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,HistorialFormaPagoConstantesFunciones.LABEL_IDMES,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new MesTableCell(this.messForeignKey,this.historialformapagoConstantesFunciones.resaltarid_mesHistorialFormaPago,this,this.historialformapagoConstantesFunciones.activarid_mesHistorialFormaPago,iSizeTabla));
			tableColumn.setCellEditor(new MesTableCell(this.messForeignKey,this.historialformapagoConstantesFunciones.resaltarid_mesHistorialFormaPago,this,this.historialformapagoConstantesFunciones.activarid_mesHistorialFormaPago,true,"id_mesHistorialFormaPago","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new HistorialFormaPagoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.historialformapagoSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.historialformapagoSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.historialformapagoSessionBean.getEsGuardarRelacionado(),iSizeTabla));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosHistorialFormaPago.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.historialformapagoSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.historialformapagoSessionBean.getEsGuardarRelacionado(),iSizeTabla));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosHistorialFormaPago.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarHistorialFormaPago && this.isPermisoGuardarCambiosHistorialFormaPago) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.historialformapagoSessionBean.getEsGuardarRelacionado(),iSizeTabla));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.historialformapagoSessionBean.getEsGuardarRelacionado(),iSizeTabla));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosHistorialFormaPago.addColumn(tableColumn);
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
			
			this.jTableDatosHistorialFormaPago.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarHistorialFormaPago && this.isPermisoGuardarCambiosHistorialFormaPago) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarHistorialFormaPago && this.isPermisoGuardarCambiosHistorialFormaPago) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosHistorialFormaPago.moveColumn(this.jTableDatosHistorialFormaPago.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosHistorialFormaPago.moveColumn(this.jTableDatosHistorialFormaPago.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosHistorialFormaPago.moveColumn(this.jTableDatosHistorialFormaPago.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosHistorialFormaPago.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosHistorialFormaPago.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosHistorialFormaPago,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!HistorialFormaPagoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosHistorialFormaPago.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosHistorialFormaPago.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!HistorialFormaPagoJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!HistorialFormaPagoJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosHistorialFormaPago.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosHistorialFormaPago.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosHistorialFormaPago.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=historialformapagoLogic.getHistorialFormaPagos().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=historialformapagos.size()-1;
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
		//this.jTableDatosHistorialFormaPago.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosHistorialFormaPago.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosHistorialFormaPago();
			
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
				
				//this.isEsNuevoHistorialFormaPago=false;
					
				HistorialFormaPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.historialformapago,new Object(),this.historialformapagoParameterGeneral,this.historialformapagoReturnGeneral);
			
				if(this.historialformapagoSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormHistorialFormaPago==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosHistorialFormaPago.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosHistorialFormaPago.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.historialformapago =(HistorialFormaPago) this.historialformapagoLogic.getHistorialFormaPagos().toArray()[this.jTableDatosHistorialFormaPago.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.historialformapago =(HistorialFormaPago) this.historialformapagos.toArray()[this.jTableDatosHistorialFormaPago.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.historialformapago.getsType().equals("DUPLICADO")
				   || this.historialformapago.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoHistorialFormaPago=true;
				
				} else {
					this.isEsNuevoHistorialFormaPago=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.historialformapagoSessionBean.getEsGuardarRelacionado()) {
					if(this.historialformapago.getId()>=0 && !this.historialformapago.getIsNew()) {						
						this.isEsNuevoHistorialFormaPago=false;
						
					} else {
						this.isEsNuevoHistorialFormaPago=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoHistorialFormaPago(esRelaciones);						
				
				this.seleccionarHistorialFormaPago(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.historialformapago.getId()<0) {
					this.isEsNuevoHistorialFormaPago=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarHistorialFormaPago(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarHistorialFormaPago(evt,rowIndex);
				}	
				
				if(this.historialformapagoSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion HistorialFormaPago: " + this.dDif); 
					}
				}								
				
				HistorialFormaPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.historialformapago,new Object(),this.historialformapagoParameterGeneral,this.historialformapagoReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarHistorialFormaPago(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.historialformapago)) {
					if(this.historialformapago.getId()>0) {
						this.historialformapago.setIsDeleted(true);
						
						this.historialformapagosEliminados.add(this.historialformapago);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.historialformapagoLogic.getHistorialFormaPagos().remove(this.historialformapago);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.historialformapagos.remove(this.historialformapago);				
					}
					
					
					((HistorialFormaPagoModel) this.jTableDatosHistorialFormaPago.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaHistorialFormaPago(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,HistorialFormaPagoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarHistorialFormaPago(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoHistorialFormaPago) {
			
			if(this.jInternalFrameDetalleFormHistorialFormaPago==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosHistorialFormaPago.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosHistorialFormaPago.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.historialformapago =(HistorialFormaPago) this.historialformapagoLogic.getHistorialFormaPagos().toArray()[this.jTableDatosHistorialFormaPago.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.historialformapago =(HistorialFormaPago) this.historialformapagos.toArray()[this.jTableDatosHistorialFormaPago.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(HistorialFormaPagoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioHistorialFormaPago(this.historialformapago);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.historialformapagoConstantesFunciones.cargarid_empresaHistorialFormaPago || this.historialformapagoConstantesFunciones.event_dependid_empresaHistorialFormaPago) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.historialformapago.getid_empresa());
									//this.inicializarActualizarBindingHistorialFormaPago(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(historialformapago.getEmpresa()!=null) {
							this.empresasForeignKey.add(historialformapago.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.historialformapago.getid_empresa(),false,"Formulario");

					//Sucursal
					if(!this.historialformapagoConstantesFunciones.cargarid_sucursalHistorialFormaPago || this.historialformapagoConstantesFunciones.event_dependid_sucursalHistorialFormaPago) {
						//this.cargarCombosSucursalsForeignKeyLista(" where id="+this.historialformapago.getid_sucursal());
									//this.inicializarActualizarBindingHistorialFormaPago(false,false);
						this.sucursalsForeignKey=new ArrayList<Sucursal>();

						if(historialformapago.getSucursal()!=null) {
							this.sucursalsForeignKey.add(historialformapago.getSucursal());
						}

						this.addItemDefectoCombosForeignKeySucursal();
						this.cargarCombosFrameSucursalsForeignKey("Todos");
					}
					this.setActualSucursalForeignKey(this.historialformapago.getid_sucursal(),false,"Formulario");

					//Ejercicio
					if(!this.historialformapagoConstantesFunciones.cargarid_ejercicioHistorialFormaPago || this.historialformapagoConstantesFunciones.event_dependid_ejercicioHistorialFormaPago) {
						//this.cargarCombosEjerciciosForeignKeyLista(" where id="+this.historialformapago.getid_ejercicio());
									//this.inicializarActualizarBindingHistorialFormaPago(false,false);
						this.ejerciciosForeignKey=new ArrayList<Ejercicio>();

						if(historialformapago.getEjercicio()!=null) {
							this.ejerciciosForeignKey.add(historialformapago.getEjercicio());
						}

						this.addItemDefectoCombosForeignKeyEjercicio();
						this.cargarCombosFrameEjerciciosForeignKey("Todos");
					}
					this.setActualEjercicioForeignKey(this.historialformapago.getid_ejercicio(),false,"Formulario");

					//Periodo
					if(!this.historialformapagoConstantesFunciones.cargarid_periodoHistorialFormaPago || this.historialformapagoConstantesFunciones.event_dependid_periodoHistorialFormaPago) {
						//this.cargarCombosPeriodosForeignKeyLista(" where id="+this.historialformapago.getid_periodo());
									//this.inicializarActualizarBindingHistorialFormaPago(false,false);
						this.periodosForeignKey=new ArrayList<Periodo>();

						if(historialformapago.getPeriodo()!=null) {
							this.periodosForeignKey.add(historialformapago.getPeriodo());
						}

						this.addItemDefectoCombosForeignKeyPeriodo();
						this.cargarCombosFramePeriodosForeignKey("Todos");
					}
					this.setActualPeriodoForeignKey(this.historialformapago.getid_periodo(),false,"Formulario");

					//Factura
					if(!this.historialformapagoConstantesFunciones.cargarid_facturaHistorialFormaPago || this.historialformapagoConstantesFunciones.event_dependid_facturaHistorialFormaPago) {
						//this.cargarCombosFacturasForeignKeyLista(" where id="+this.historialformapago.getid_factura());
									//this.inicializarActualizarBindingHistorialFormaPago(false,false);
						this.facturasForeignKey=new ArrayList<Factura>();

						if(historialformapago.getFactura()!=null) {
							this.facturasForeignKey.add(historialformapago.getFactura());
						}

						this.addItemDefectoCombosForeignKeyFactura();
						this.cargarCombosFrameFacturasForeignKey("Todos");
					}
					this.setActualFacturaForeignKey(this.historialformapago.getid_factura(),false,"Formulario");

					//TipoFormaPago
					if(!this.historialformapagoConstantesFunciones.cargarid_tipo_forma_pagoHistorialFormaPago || this.historialformapagoConstantesFunciones.event_dependid_tipo_forma_pagoHistorialFormaPago) {
						//this.cargarCombosTipoFormaPagosForeignKeyLista(" where id="+this.historialformapago.getid_tipo_forma_pago());
									//this.inicializarActualizarBindingHistorialFormaPago(false,false);
						this.tipoformapagosForeignKey=new ArrayList<TipoFormaPago>();

						if(historialformapago.getTipoFormaPago()!=null) {
							this.tipoformapagosForeignKey.add(historialformapago.getTipoFormaPago());
						}

						this.addItemDefectoCombosForeignKeyTipoFormaPago();
						this.cargarCombosFrameTipoFormaPagosForeignKey("Todos");
					}
					this.setActualTipoFormaPagoForeignKey(this.historialformapago.getid_tipo_forma_pago(),false,"Formulario");

					//CuentaContable
					if(!this.historialformapagoConstantesFunciones.cargarid_cuenta_contableHistorialFormaPago || this.historialformapagoConstantesFunciones.event_dependid_cuenta_contableHistorialFormaPago) {
						//this.cargarCombosCuentaContablesForeignKeyLista(" where id="+this.historialformapago.getid_cuenta_contable());
									//this.inicializarActualizarBindingHistorialFormaPago(false,false);
						this.cuentacontablesForeignKey=new ArrayList<CuentaContable>();

						if(historialformapago.getCuentaContable()!=null) {
							this.cuentacontablesForeignKey.add(historialformapago.getCuentaContable());
						}

						this.addItemDefectoCombosForeignKeyCuentaContable();
						this.cargarCombosFrameCuentaContablesForeignKey("Todos");
					}
					this.setActualCuentaContableForeignKey(this.historialformapago.getid_cuenta_contable(),false,"Formulario");

					//Anio
					if(!this.historialformapagoConstantesFunciones.cargarid_anioHistorialFormaPago || this.historialformapagoConstantesFunciones.event_dependid_anioHistorialFormaPago) {
						//this.cargarCombosAniosForeignKeyLista(" where id="+this.historialformapago.getid_anio());
									//this.inicializarActualizarBindingHistorialFormaPago(false,false);
						this.aniosForeignKey=new ArrayList<Anio>();

						if(historialformapago.getAnio()!=null) {
							this.aniosForeignKey.add(historialformapago.getAnio());
						}

						this.addItemDefectoCombosForeignKeyAnio();
						this.cargarCombosFrameAniosForeignKey("Todos");
					}
					this.setActualAnioForeignKey(this.historialformapago.getid_anio(),false,"Formulario");

					//Mes
					if(!this.historialformapagoConstantesFunciones.cargarid_mesHistorialFormaPago || this.historialformapagoConstantesFunciones.event_dependid_mesHistorialFormaPago) {
						//this.cargarCombosMessForeignKeyLista(" where id="+this.historialformapago.getid_mes());
									//this.inicializarActualizarBindingHistorialFormaPago(false,false);
						this.messForeignKey=new ArrayList<Mes>();

						if(historialformapago.getMes()!=null) {
							this.messForeignKey.add(historialformapago.getMes());
						}

						this.addItemDefectoCombosForeignKeyMes();
						this.cargarCombosFrameMessForeignKey("Todos");
					}
					this.setActualMesForeignKey(this.historialformapago.getid_mes(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesHistorialFormaPago("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesHistorialFormaPago(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualHistorialFormaPago() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,HistorialFormaPagoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoHistorialFormaPago(HistorialFormaPago historialformapago) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoHistorialFormaPago(historialformapago,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoHistorialFormaPago(HistorialFormaPago historialformapago,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioHistorialFormaPago(historialformapago);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyHistorialFormaPago(historialformapago,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyHistorialFormaPago(historialformapago);
	}
	
	public void setVariablesObjetoActualToFormularioHistorialFormaPago(HistorialFormaPago historialformapago) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormHistorialFormaPago==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormHistorialFormaPago.jLabelidHistorialFormaPago.setText(historialformapago.getId().toString());
			this.jInternalFrameDetalleFormHistorialFormaPago.jTextFieldnumero_diasHistorialFormaPago.setText(historialformapago.getnumero_dias().toString());
			this.jInternalFrameDetalleFormHistorialFormaPago.jTextFieldvalorHistorialFormaPago.setText(historialformapago.getvalor().toString());
			this.jInternalFrameDetalleFormHistorialFormaPago.jDateChooserfechaHistorialFormaPago.setDate(historialformapago.getfecha());
			this.jInternalFrameDetalleFormHistorialFormaPago.jTextFieldporcentajeHistorialFormaPago.setText(historialformapago.getporcentaje().toString());
			this.jInternalFrameDetalleFormHistorialFormaPago.jTextFieldporcentaje_retencionHistorialFormaPago.setText(historialformapago.getporcentaje_retencion().toString());
			this.jInternalFrameDetalleFormHistorialFormaPago.jTextFieldbase_retencionHistorialFormaPago.setText(historialformapago.getbase_retencion().toString());
			this.jInternalFrameDetalleFormHistorialFormaPago.jTextFieldnumero_retencionHistorialFormaPago.setText(historialformapago.getnumero_retencion().toString());
			this.jInternalFrameDetalleFormHistorialFormaPago.jTextAreanombre_retencionHistorialFormaPago.setText(historialformapago.getnombre_retencion());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,HistorialFormaPagoConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,HistorialFormaPago historialformapagoLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,historialformapagoLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,HistorialFormaPago historialformapagoLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				historialformapagoLocal=this.historialformapago;
			} else {
				historialformapagoLocal=this.historialformapagoAnterior;
			}
		}
		
		if(this.permiteMantenimiento(historialformapagoLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoHistorialFormaPago(historialformapagoLocal,true);
					
					if(historialformapagoSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(historialformapagoLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.historialformapagoSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(historialformapagoLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoHistorialFormaPago(HistorialFormaPago historialformapago,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualHistorialFormaPago(historialformapago,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysHistorialFormaPago(historialformapago);
	}
	
	public void setVariablesFormularioToObjetoActualHistorialFormaPago(HistorialFormaPago historialformapago,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualHistorialFormaPago(historialformapago,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualHistorialFormaPago(HistorialFormaPago historialformapago,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormHistorialFormaPago==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormHistorialFormaPago.jLabelidHistorialFormaPago.getText()==null || this.jInternalFrameDetalleFormHistorialFormaPago.jLabelidHistorialFormaPago.getText()=="" || this.jInternalFrameDetalleFormHistorialFormaPago.jLabelidHistorialFormaPago.getText()=="Id") {
				this.jInternalFrameDetalleFormHistorialFormaPago.jLabelidHistorialFormaPago.setText("0");
			}

			if(conColumnasBase) {historialformapago.setId(Long.parseLong(this.jInternalFrameDetalleFormHistorialFormaPago.jLabelidHistorialFormaPago.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+HistorialFormaPagoConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormHistorialFormaPago.jLabelIdHistorialFormaPago,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			historialformapago.setnumero_dias(Integer.parseInt(this.jInternalFrameDetalleFormHistorialFormaPago.jTextFieldnumero_diasHistorialFormaPago.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+HistorialFormaPagoConstantesFunciones.LABEL_NUMERODIAS+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormHistorialFormaPago.jLabelnumero_diasHistorialFormaPago,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			historialformapago.setvalor(Double.parseDouble(this.jInternalFrameDetalleFormHistorialFormaPago.jTextFieldvalorHistorialFormaPago.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+HistorialFormaPagoConstantesFunciones.LABEL_VALOR+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormHistorialFormaPago.jLabelvalorHistorialFormaPago,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			historialformapago.setfecha(this.jInternalFrameDetalleFormHistorialFormaPago.jDateChooserfechaHistorialFormaPago.getDate());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+HistorialFormaPagoConstantesFunciones.LABEL_FECHA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormHistorialFormaPago.jLabelfechaHistorialFormaPago,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			historialformapago.setporcentaje(Double.parseDouble(this.jInternalFrameDetalleFormHistorialFormaPago.jTextFieldporcentajeHistorialFormaPago.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+HistorialFormaPagoConstantesFunciones.LABEL_PORCENTAJE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormHistorialFormaPago.jLabelporcentajeHistorialFormaPago,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			historialformapago.setporcentaje_retencion(Double.parseDouble(this.jInternalFrameDetalleFormHistorialFormaPago.jTextFieldporcentaje_retencionHistorialFormaPago.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+HistorialFormaPagoConstantesFunciones.LABEL_PORCENTAJERETENCION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormHistorialFormaPago.jLabelporcentaje_retencionHistorialFormaPago,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			historialformapago.setbase_retencion(Double.parseDouble(this.jInternalFrameDetalleFormHistorialFormaPago.jTextFieldbase_retencionHistorialFormaPago.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+HistorialFormaPagoConstantesFunciones.LABEL_BASERETENCION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormHistorialFormaPago.jLabelbase_retencionHistorialFormaPago,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			historialformapago.setnumero_retencion(Integer.parseInt(this.jInternalFrameDetalleFormHistorialFormaPago.jTextFieldnumero_retencionHistorialFormaPago.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+HistorialFormaPagoConstantesFunciones.LABEL_NUMERORETENCION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormHistorialFormaPago.jLabelnumero_retencionHistorialFormaPago,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			historialformapago.setnombre_retencion(this.jInternalFrameDetalleFormHistorialFormaPago.jTextAreanombre_retencionHistorialFormaPago.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+HistorialFormaPagoConstantesFunciones.LABEL_NOMBRERETENCION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormHistorialFormaPago.jLabelnombre_retencionHistorialFormaPago,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,HistorialFormaPagoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualHistorialFormaPago(HistorialFormaPago historialformapagoBean,HistorialFormaPago historialformapago,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,HistorialFormaPagoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosHistorialFormaPago(HistorialFormaPago historialformapagoOrigen,HistorialFormaPago historialformapago,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && historialformapagoOrigen.getId()!=null && !historialformapagoOrigen.getId().equals(0L))) {historialformapago.setId(historialformapagoOrigen.getId());}}
			if(conDefault || (!conDefault && historialformapagoOrigen.getnumero_dias()!=null && !historialformapagoOrigen.getnumero_dias().equals(0))) {historialformapago.setnumero_dias(historialformapagoOrigen.getnumero_dias());}
			if(conDefault || (!conDefault && historialformapagoOrigen.getvalor()!=null && !historialformapagoOrigen.getvalor().equals(0.0))) {historialformapago.setvalor(historialformapagoOrigen.getvalor());}
			if(conDefault || (!conDefault && historialformapagoOrigen.getfecha()!=null && !historialformapagoOrigen.getfecha().equals(new Date()))) {historialformapago.setfecha(historialformapagoOrigen.getfecha());}
			if(conDefault || (!conDefault && historialformapagoOrigen.getporcentaje()!=null && !historialformapagoOrigen.getporcentaje().equals(0.0))) {historialformapago.setporcentaje(historialformapagoOrigen.getporcentaje());}
			if(conDefault || (!conDefault && historialformapagoOrigen.getporcentaje_retencion()!=null && !historialformapagoOrigen.getporcentaje_retencion().equals(0.0))) {historialformapago.setporcentaje_retencion(historialformapagoOrigen.getporcentaje_retencion());}
			if(conDefault || (!conDefault && historialformapagoOrigen.getbase_retencion()!=null && !historialformapagoOrigen.getbase_retencion().equals(0.0))) {historialformapago.setbase_retencion(historialformapagoOrigen.getbase_retencion());}
			if(conDefault || (!conDefault && historialformapagoOrigen.getnumero_retencion()!=null && !historialformapagoOrigen.getnumero_retencion().equals(0))) {historialformapago.setnumero_retencion(historialformapagoOrigen.getnumero_retencion());}
			if(conDefault || (!conDefault && historialformapagoOrigen.getnombre_retencion()!=null && !historialformapagoOrigen.getnombre_retencion().equals(""))) {historialformapago.setnombre_retencion(historialformapagoOrigen.getnombre_retencion());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,HistorialFormaPagoConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioHistorialFormaPago(HistorialFormaPago historialformapago) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormHistorialFormaPago.jLabelidHistorialFormaPago.setText(historialformapago.getId().toString());
			this.jInternalFrameDetalleFormHistorialFormaPago.jTextFieldnumero_diasHistorialFormaPago.setText(historialformapago.getnumero_dias().toString());
			this.jInternalFrameDetalleFormHistorialFormaPago.jTextFieldvalorHistorialFormaPago.setText(historialformapago.getvalor().toString());
			this.jInternalFrameDetalleFormHistorialFormaPago.jDateChooserfechaHistorialFormaPago.setDate(historialformapago.getfecha());
			this.jInternalFrameDetalleFormHistorialFormaPago.jTextFieldporcentajeHistorialFormaPago.setText(historialformapago.getporcentaje().toString());
			this.jInternalFrameDetalleFormHistorialFormaPago.jTextFieldporcentaje_retencionHistorialFormaPago.setText(historialformapago.getporcentaje_retencion().toString());
			this.jInternalFrameDetalleFormHistorialFormaPago.jTextFieldbase_retencionHistorialFormaPago.setText(historialformapago.getbase_retencion().toString());
			this.jInternalFrameDetalleFormHistorialFormaPago.jTextFieldnumero_retencionHistorialFormaPago.setText(historialformapago.getnumero_retencion().toString());
			this.jInternalFrameDetalleFormHistorialFormaPago.jTextAreanombre_retencionHistorialFormaPago.setText(historialformapago.getnombre_retencion());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,HistorialFormaPagoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioHistorialFormaPago(HistorialFormaPagoBean historialformapagoBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormHistorialFormaPago.jLabelidHistorialFormaPago.setText(historialformapagoBean.getId().toString());
			this.jInternalFrameDetalleFormHistorialFormaPago.jTextFieldnumero_diasHistorialFormaPago.setText(historialformapagoBean.getnumero_dias().toString());
			this.jInternalFrameDetalleFormHistorialFormaPago.jTextFieldvalorHistorialFormaPago.setText(historialformapagoBean.getvalor().toString());
			this.jInternalFrameDetalleFormHistorialFormaPago.jDateChooserfechaHistorialFormaPago.setDate(historialformapagoBean.getfecha());
			this.jInternalFrameDetalleFormHistorialFormaPago.jTextFieldporcentajeHistorialFormaPago.setText(historialformapagoBean.getporcentaje().toString());
			this.jInternalFrameDetalleFormHistorialFormaPago.jTextFieldporcentaje_retencionHistorialFormaPago.setText(historialformapagoBean.getporcentaje_retencion().toString());
			this.jInternalFrameDetalleFormHistorialFormaPago.jTextFieldbase_retencionHistorialFormaPago.setText(historialformapagoBean.getbase_retencion().toString());
			this.jInternalFrameDetalleFormHistorialFormaPago.jTextFieldnumero_retencionHistorialFormaPago.setText(historialformapagoBean.getnumero_retencion().toString());
			this.jInternalFrameDetalleFormHistorialFormaPago.jTextAreanombre_retencionHistorialFormaPago.setText(historialformapagoBean.getnombre_retencion());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,HistorialFormaPagoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanHistorialFormaPago(HistorialFormaPagoParameterReturnGeneral historialformapagoReturnGeneral,HistorialFormaPagoBean historialformapagoBean,Boolean conDefault) throws Exception { 
		try {
			HistorialFormaPago historialformapagoLocal=new HistorialFormaPago();
			
			historialformapagoLocal=historialformapagoReturnGeneral.getHistorialFormaPago();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && historialformapagoLocal.getId()!=null && !historialformapagoLocal.getId().equals(0L))) {historialformapagoBean.setId(historialformapagoLocal.getId());}}
			if(conDefault || (!conDefault && historialformapagoLocal.getnumero_dias()!=null && !historialformapagoLocal.getnumero_dias().equals(0))) {historialformapagoBean.setnumero_dias(historialformapagoLocal.getnumero_dias());}
			if(conDefault || (!conDefault && historialformapagoLocal.getvalor()!=null && !historialformapagoLocal.getvalor().equals(0.0))) {historialformapagoBean.setvalor(historialformapagoLocal.getvalor());}
			if(conDefault || (!conDefault && historialformapagoLocal.getfecha()!=null && !historialformapagoLocal.getfecha().equals(new Date()))) {historialformapagoBean.setfecha(historialformapagoLocal.getfecha());}
			if(conDefault || (!conDefault && historialformapagoLocal.getporcentaje()!=null && !historialformapagoLocal.getporcentaje().equals(0.0))) {historialformapagoBean.setporcentaje(historialformapagoLocal.getporcentaje());}
			if(conDefault || (!conDefault && historialformapagoLocal.getporcentaje_retencion()!=null && !historialformapagoLocal.getporcentaje_retencion().equals(0.0))) {historialformapagoBean.setporcentaje_retencion(historialformapagoLocal.getporcentaje_retencion());}
			if(conDefault || (!conDefault && historialformapagoLocal.getbase_retencion()!=null && !historialformapagoLocal.getbase_retencion().equals(0.0))) {historialformapagoBean.setbase_retencion(historialformapagoLocal.getbase_retencion());}
			if(conDefault || (!conDefault && historialformapagoLocal.getnumero_retencion()!=null && !historialformapagoLocal.getnumero_retencion().equals(0))) {historialformapagoBean.setnumero_retencion(historialformapagoLocal.getnumero_retencion());}
			if(conDefault || (!conDefault && historialformapagoLocal.getnombre_retencion()!=null && !historialformapagoLocal.getnombre_retencion().equals(""))) {historialformapagoBean.setnombre_retencion(historialformapagoLocal.getnombre_retencion());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,HistorialFormaPagoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxHistorialFormaPagoGenerico(Long idHistorialFormaPagoSeleccionado,JComboBox jComboBoxHistorialFormaPago,List<HistorialFormaPago> historialformapagosLocal)throws Exception {
		try {
			HistorialFormaPago  historialformapagoTemp=null;

			for(HistorialFormaPago historialformapagoAux:historialformapagosLocal) {
				if(historialformapagoAux.getId()!=null && historialformapagoAux.getId().equals(idHistorialFormaPagoSeleccionado)) {
					historialformapagoTemp=historialformapagoAux;
					break;
				}
			}

			jComboBoxHistorialFormaPago.setSelectedItem(historialformapagoTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxHistorialFormaPagoGenerico(JComboBox jComboBoxHistorialFormaPago,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxHistorialFormaPago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxHistorialFormaPago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxHistorialFormaPago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxHistorialFormaPago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxHistorialFormaPago.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxHistorialFormaPago.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxHistorialFormaPago.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxHistorialFormaPago.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxHistorialFormaPago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxHistorialFormaPago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,HistorialFormaPagoConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			historialformapago=(HistorialFormaPago) historialformapagoLogic.getHistorialFormaPagos().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			historialformapago =(HistorialFormaPago) historialformapagos.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!historialformapago.getIsNew() && !historialformapago.getIsChanged() && !historialformapago.getIsDeleted()) {
				sDescripcion=historialformapago.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=historialformapago.getempresa_descripcion();
			}
		}

		if(sTipo.equals("Sucursal")) {
			//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
			if(!historialformapago.getIsNew() && !historialformapago.getIsChanged() && !historialformapago.getIsDeleted()) {
				sDescripcion=historialformapago.getsucursal_descripcion();
			} else {
				//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
				sDescripcion=historialformapago.getsucursal_descripcion();
			}
		}

		if(sTipo.equals("Ejercicio")) {
			//sDescripcion=this.getActualEjercicioForeignKeyDescripcion((Long)value);
			if(!historialformapago.getIsNew() && !historialformapago.getIsChanged() && !historialformapago.getIsDeleted()) {
				sDescripcion=historialformapago.getejercicio_descripcion();
			} else {
				//sDescripcion=this.getActualEjercicioForeignKeyDescripcion((Long)value);
				sDescripcion=historialformapago.getejercicio_descripcion();
			}
		}

		if(sTipo.equals("Periodo")) {
			//sDescripcion=this.getActualPeriodoForeignKeyDescripcion((Long)value);
			if(!historialformapago.getIsNew() && !historialformapago.getIsChanged() && !historialformapago.getIsDeleted()) {
				sDescripcion=historialformapago.getperiodo_descripcion();
			} else {
				//sDescripcion=this.getActualPeriodoForeignKeyDescripcion((Long)value);
				sDescripcion=historialformapago.getperiodo_descripcion();
			}
		}

		if(sTipo.equals("Factura")) {
			//sDescripcion=this.getActualFacturaForeignKeyDescripcion((Long)value);
			if(!historialformapago.getIsNew() && !historialformapago.getIsChanged() && !historialformapago.getIsDeleted()) {
				sDescripcion=historialformapago.getfactura_descripcion();
			} else {
				//sDescripcion=this.getActualFacturaForeignKeyDescripcion((Long)value);
				sDescripcion=historialformapago.getfactura_descripcion();
			}
		}

		if(sTipo.equals("TipoFormaPago")) {
			//sDescripcion=this.getActualTipoFormaPagoForeignKeyDescripcion((Long)value);
			if(!historialformapago.getIsNew() && !historialformapago.getIsChanged() && !historialformapago.getIsDeleted()) {
				sDescripcion=historialformapago.gettipoformapago_descripcion();
			} else {
				//sDescripcion=this.getActualTipoFormaPagoForeignKeyDescripcion((Long)value);
				sDescripcion=historialformapago.gettipoformapago_descripcion();
			}
		}

		if(sTipo.equals("CuentaContable")) {
			//sDescripcion=this.getActualCuentaContableForeignKeyDescripcion((Long)value);
			if(!historialformapago.getIsNew() && !historialformapago.getIsChanged() && !historialformapago.getIsDeleted()) {
				sDescripcion=historialformapago.getcuentacontable_descripcion();
			} else {
				//sDescripcion=this.getActualCuentaContableForeignKeyDescripcion((Long)value);
				sDescripcion=historialformapago.getcuentacontable_descripcion();
			}
		}

		if(sTipo.equals("Anio")) {
			//sDescripcion=this.getActualAnioForeignKeyDescripcion((Long)value);
			if(!historialformapago.getIsNew() && !historialformapago.getIsChanged() && !historialformapago.getIsDeleted()) {
				sDescripcion=historialformapago.getanio_descripcion();
			} else {
				//sDescripcion=this.getActualAnioForeignKeyDescripcion((Long)value);
				sDescripcion=historialformapago.getanio_descripcion();
			}
		}

		if(sTipo.equals("Mes")) {
			//sDescripcion=this.getActualMesForeignKeyDescripcion((Long)value);
			if(!historialformapago.getIsNew() && !historialformapago.getIsChanged() && !historialformapago.getIsDeleted()) {
				sDescripcion=historialformapago.getmes_descripcion();
			} else {
				//sDescripcion=this.getActualMesForeignKeyDescripcion((Long)value);
				sDescripcion=historialformapago.getmes_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		HistorialFormaPago historialformapagoRow=new HistorialFormaPago();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			historialformapagoRow=(HistorialFormaPago) historialformapagoLogic.getHistorialFormaPagos().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			historialformapagoRow=(HistorialFormaPago) historialformapagos.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualHistorialFormaPago(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoHistorialFormaPago.setVisible((this.isVisibilidadCeldaNuevoHistorialFormaPago && this.isPermisoNuevoHistorialFormaPago));			
			this.jButtonDuplicarHistorialFormaPago.setVisible((this.isVisibilidadCeldaDuplicarHistorialFormaPago && this.isPermisoDuplicarHistorialFormaPago));			
			this.jButtonCopiarHistorialFormaPago.setVisible((this.isVisibilidadCeldaCopiarHistorialFormaPago && this.isPermisoCopiarHistorialFormaPago));
			this.jButtonVerFormHistorialFormaPago.setVisible((this.isVisibilidadCeldaVerFormHistorialFormaPago && this.isPermisoVerFormHistorialFormaPago));
			
			this.jButtonAbrirOrderByHistorialFormaPago.setVisible((this.isVisibilidadCeldaOrdenHistorialFormaPago && this.isPermisoOrdenHistorialFormaPago));			
			
			this.jButtonNuevoRelacionesHistorialFormaPago.setVisible((this.isVisibilidadCeldaNuevoRelacionesHistorialFormaPago && this.isPermisoNuevoHistorialFormaPago));			
			this.jButtonNuevoGuardarCambiosHistorialFormaPago.setVisible((this.isVisibilidadCeldaNuevoHistorialFormaPago && this.isPermisoNuevoHistorialFormaPago && this.isPermisoGuardarCambiosHistorialFormaPago));
			
			if(this.jInternalFrameDetalleFormHistorialFormaPago!=null) {
			this.jInternalFrameDetalleFormHistorialFormaPago.jButtonModificarHistorialFormaPago.setVisible((this.isVisibilidadCeldaModificarHistorialFormaPago && this.isPermisoActualizarHistorialFormaPago));	
			this.jInternalFrameDetalleFormHistorialFormaPago.jButtonActualizarHistorialFormaPago.setVisible((this.isVisibilidadCeldaActualizarHistorialFormaPago && this.isPermisoActualizarHistorialFormaPago));	
			this.jInternalFrameDetalleFormHistorialFormaPago.jButtonEliminarHistorialFormaPago.setVisible((this.isVisibilidadCeldaEliminarHistorialFormaPago && this.isPermisoEliminarHistorialFormaPago));
			this.jInternalFrameDetalleFormHistorialFormaPago.jButtonCancelarHistorialFormaPago.setVisible(this.isVisibilidadCeldaCancelarHistorialFormaPago);							
			this.jInternalFrameDetalleFormHistorialFormaPago.jButtonGuardarCambiosHistorialFormaPago.setVisible((this.isVisibilidadCeldaGuardarHistorialFormaPago && this.isPermisoGuardarCambiosHistorialFormaPago));			
			
			}
						
			this.jButtonGuardarCambiosTablaHistorialFormaPago.setVisible((this.isVisibilidadCeldaGuardarCambiosHistorialFormaPago && this.isPermisoGuardarCambiosHistorialFormaPago));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarHistorialFormaPago.setVisible((this.isVisibilidadCeldaNuevoHistorialFormaPago && this.isPermisoNuevoHistorialFormaPago));						
			this.jButtonDuplicarToolBarHistorialFormaPago.setVisible((this.isVisibilidadCeldaDuplicarHistorialFormaPago && this.isPermisoDuplicarHistorialFormaPago));						
			this.jButtonCopiarToolBarHistorialFormaPago.setVisible((this.isVisibilidadCeldaCopiarHistorialFormaPago && this.isPermisoCopiarHistorialFormaPago));			
			this.jButtonVerFormToolBarHistorialFormaPago.setVisible((this.isVisibilidadCeldaVerFormHistorialFormaPago && this.isPermisoVerFormHistorialFormaPago));			
			this.jButtonAbrirOrderByToolBarHistorialFormaPago.setVisible((this.isVisibilidadCeldaOrdenHistorialFormaPago && this.isPermisoOrdenHistorialFormaPago));
			this.jButtonNuevoRelacionesToolBarHistorialFormaPago.setVisible((this.isVisibilidadCeldaNuevoRelacionesHistorialFormaPago && this.isPermisoNuevoHistorialFormaPago));			
			this.jButtonNuevoGuardarCambiosToolBarHistorialFormaPago.setVisible((this.isVisibilidadCeldaNuevoHistorialFormaPago && this.isPermisoNuevoHistorialFormaPago && this.isPermisoGuardarCambiosHistorialFormaPago));			
			
			if(this.jInternalFrameDetalleFormHistorialFormaPago!=null) {
			this.jInternalFrameDetalleFormHistorialFormaPago.jButtonModificarToolBarHistorialFormaPago.setVisible((this.isVisibilidadCeldaModificarHistorialFormaPago && this.isPermisoActualizarHistorialFormaPago));	
			this.jInternalFrameDetalleFormHistorialFormaPago.jButtonActualizarToolBarHistorialFormaPago.setVisible((this.isVisibilidadCeldaActualizarHistorialFormaPago  && this.isPermisoActualizarHistorialFormaPago));	
			this.jInternalFrameDetalleFormHistorialFormaPago.jButtonEliminarToolBarHistorialFormaPago.setVisible((this.isVisibilidadCeldaEliminarHistorialFormaPago && this.isPermisoEliminarHistorialFormaPago));
			this.jInternalFrameDetalleFormHistorialFormaPago.jButtonCancelarToolBarHistorialFormaPago.setVisible(this.isVisibilidadCeldaCancelarHistorialFormaPago);				
			this.jInternalFrameDetalleFormHistorialFormaPago.jButtonGuardarCambiosToolBarHistorialFormaPago.setVisible((this.isVisibilidadCeldaGuardarHistorialFormaPago && this.isPermisoGuardarCambiosHistorialFormaPago));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarHistorialFormaPago.setVisible((this.isVisibilidadCeldaGuardarCambiosHistorialFormaPago && this.isPermisoGuardarCambiosHistorialFormaPago));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoHistorialFormaPago.setVisible((this.isVisibilidadCeldaNuevoHistorialFormaPago && this.isPermisoNuevoHistorialFormaPago));			
			this.jMenuItemDuplicarHistorialFormaPago.setVisible((this.isVisibilidadCeldaDuplicarHistorialFormaPago && this.isPermisoDuplicarHistorialFormaPago));			
			this.jMenuItemCopiarHistorialFormaPago.setVisible((this.isVisibilidadCeldaCopiarHistorialFormaPago && this.isPermisoCopiarHistorialFormaPago));			
			this.jMenuItemVerFormHistorialFormaPago.setVisible((this.isVisibilidadCeldaVerFormHistorialFormaPago && this.isPermisoVerFormHistorialFormaPago));			
			this.jMenuItemAbrirOrderByHistorialFormaPago.setVisible((this.isVisibilidadCeldaOrdenHistorialFormaPago && this.isPermisoOrdenHistorialFormaPago));			
			//this.jMenuItemMostrarOcultarHistorialFormaPago.setVisible((this.isVisibilidadCeldaOrdenHistorialFormaPago && this.isPermisoOrdenHistorialFormaPago));
			this.jMenuItemDetalleAbrirOrderByHistorialFormaPago.setVisible((this.isVisibilidadCeldaOrdenHistorialFormaPago && this.isPermisoOrdenHistorialFormaPago));			
			//this.jMenuItemDetalleMostrarOcultarHistorialFormaPago.setVisible((this.isVisibilidadCeldaOrdenHistorialFormaPago && this.isPermisoOrdenHistorialFormaPago));			
			this.jMenuItemNuevoRelacionesHistorialFormaPago.setVisible((this.isVisibilidadCeldaNuevoRelacionesHistorialFormaPago && this.isPermisoNuevoHistorialFormaPago));			
			this.jMenuItemNuevoGuardarCambiosHistorialFormaPago.setVisible((this.isVisibilidadCeldaNuevoHistorialFormaPago && this.isPermisoNuevoHistorialFormaPago && this.isPermisoGuardarCambiosHistorialFormaPago));									
			
			if(this.jInternalFrameDetalleFormHistorialFormaPago!=null) {
			this.jInternalFrameDetalleFormHistorialFormaPago.jMenuItemModificarHistorialFormaPago.setVisible((this.isVisibilidadCeldaModificarHistorialFormaPago && this.isPermisoActualizarHistorialFormaPago));	
			this.jInternalFrameDetalleFormHistorialFormaPago.jMenuItemActualizarHistorialFormaPago.setVisible((this.isVisibilidadCeldaActualizarHistorialFormaPago && this.isPermisoActualizarHistorialFormaPago));	
			this.jInternalFrameDetalleFormHistorialFormaPago.jMenuItemEliminarHistorialFormaPago.setVisible((this.isVisibilidadCeldaEliminarHistorialFormaPago && this.isPermisoEliminarHistorialFormaPago));
			this.jInternalFrameDetalleFormHistorialFormaPago.jMenuItemCancelarHistorialFormaPago.setVisible(this.isVisibilidadCeldaCancelarHistorialFormaPago);				
			}
			
			this.jMenuItemGuardarCambiosHistorialFormaPago.setVisible((this.isVisibilidadCeldaGuardarHistorialFormaPago && this.isPermisoGuardarCambiosHistorialFormaPago));						
			this.jMenuItemGuardarCambiosTablaHistorialFormaPago.setVisible((this.isVisibilidadCeldaGuardarCambiosHistorialFormaPago && this.isPermisoGuardarCambiosHistorialFormaPago));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoHistorialFormaPago=this.jButtonNuevoHistorialFormaPago.isVisible();
			this.isVisibilidadCeldaDuplicarHistorialFormaPago=this.jButtonDuplicarHistorialFormaPago.isVisible();
			this.isVisibilidadCeldaCopiarHistorialFormaPago=this.jButtonCopiarHistorialFormaPago.isVisible();
			this.isVisibilidadCeldaVerFormHistorialFormaPago=this.jButtonVerFormHistorialFormaPago.isVisible();
			
			this.isVisibilidadCeldaOrdenHistorialFormaPago=this.jButtonAbrirOrderByHistorialFormaPago.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesHistorialFormaPago=this.jButtonNuevoRelacionesHistorialFormaPago.isVisible();
			this.isVisibilidadCeldaModificarHistorialFormaPago=this.jButtonModificarHistorialFormaPago.isVisible();
			
			if(this.jInternalFrameDetalleFormHistorialFormaPago!=null) {
			this.isVisibilidadCeldaActualizarHistorialFormaPago=this.jInternalFrameDetalleFormHistorialFormaPago.jButtonActualizarHistorialFormaPago.isVisible();
			this.isVisibilidadCeldaEliminarHistorialFormaPago=this.jInternalFrameDetalleFormHistorialFormaPago.jButtonEliminarHistorialFormaPago.isVisible();
			this.isVisibilidadCeldaCancelarHistorialFormaPago=this.jInternalFrameDetalleFormHistorialFormaPago.jButtonCancelarHistorialFormaPago.isVisible();
			this.isVisibilidadCeldaGuardarHistorialFormaPago=this.jInternalFrameDetalleFormHistorialFormaPago.jButtonGuardarCambiosHistorialFormaPago.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosHistorialFormaPago=this.jButtonGuardarCambiosTablaHistorialFormaPago.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoHistorialFormaPago=this.jButtonNuevoToolBarHistorialFormaPago.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesHistorialFormaPago=this.jButtonNuevoRelacionesToolBarHistorialFormaPago.isVisible();
			
			if(this.jInternalFrameDetalleFormHistorialFormaPago!=null) {
			this.isVisibilidadCeldaModificarHistorialFormaPago=this.jInternalFrameDetalleFormHistorialFormaPago.jButtonModificarToolBarHistorialFormaPago.isVisible();
			this.isVisibilidadCeldaActualizarHistorialFormaPago=this.jInternalFrameDetalleFormHistorialFormaPago.jButtonActualizarToolBarHistorialFormaPago.isVisible();
			this.isVisibilidadCeldaEliminarHistorialFormaPago=this.jInternalFrameDetalleFormHistorialFormaPago.jButtonEliminarToolBarHistorialFormaPago.isVisible();
			this.isVisibilidadCeldaCancelarHistorialFormaPago=this.jInternalFrameDetalleFormHistorialFormaPago.jButtonCancelarToolBarHistorialFormaPago.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarHistorialFormaPago=this.jButtonGuardarCambiosToolBarHistorialFormaPago.isVisible();
			this.isVisibilidadCeldaGuardarCambiosHistorialFormaPago=this.jButtonGuardarCambiosTablaToolBarHistorialFormaPago.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoHistorialFormaPago=this.jMenuItemNuevoHistorialFormaPago.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesHistorialFormaPago=this.jMenuItemNuevoRelacionesHistorialFormaPago.isVisible();
			
			if(this.jInternalFrameDetalleFormHistorialFormaPago!=null) {
			this.isVisibilidadCeldaModificarHistorialFormaPago=this.jInternalFrameDetalleFormHistorialFormaPago.jMenuItemModificarHistorialFormaPago.isVisible();
			this.isVisibilidadCeldaActualizarHistorialFormaPago=this.jInternalFrameDetalleFormHistorialFormaPago.jMenuItemActualizarHistorialFormaPago.isVisible();
			this.isVisibilidadCeldaEliminarHistorialFormaPago=this.jInternalFrameDetalleFormHistorialFormaPago.jMenuItemEliminarHistorialFormaPago.isVisible();
			this.isVisibilidadCeldaCancelarHistorialFormaPago=this.jInternalFrameDetalleFormHistorialFormaPago.jMenuItemCancelarHistorialFormaPago.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarHistorialFormaPago=this.jMenuItemGuardarCambiosHistorialFormaPago.isVisible();
			this.isVisibilidadCeldaGuardarCambiosHistorialFormaPago=this.jMenuItemGuardarCambiosTablaHistorialFormaPago.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesHistorialFormaPago(Boolean esInicializar) {
		if(HistorialFormaPagoJInternalFrame.ISBINDING_MANUAL) {			
			if(this.historialformapagoSessionBean.getConGuardarRelaciones()) {
				//if(this.historialformapagoSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesHistorialFormaPago();
			}
			
			this.inicializarActualizarBindingBotonesManualHistorialFormaPago(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualHistorialFormaPago() {
		this.jButtonNuevoHistorialFormaPago.setVisible(this.isPermisoNuevoHistorialFormaPago);			
		this.jButtonDuplicarHistorialFormaPago.setVisible(this.isPermisoDuplicarHistorialFormaPago);			
		this.jButtonCopiarHistorialFormaPago.setVisible(this.isPermisoCopiarHistorialFormaPago);			
		this.jButtonVerFormHistorialFormaPago.setVisible(this.isPermisoVerFormHistorialFormaPago);			
		
		this.jButtonAbrirOrderByHistorialFormaPago.setVisible(this.isPermisoOrdenHistorialFormaPago);					
		
		this.jButtonNuevoRelacionesHistorialFormaPago.setVisible(this.isPermisoNuevoHistorialFormaPago);			
		
		if(this.jInternalFrameDetalleFormHistorialFormaPago!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormHistorialFormaPago.jButtonModificarHistorialFormaPago.setVisible(this.isPermisoActualizarHistorialFormaPago);	
			this.jInternalFrameDetalleFormHistorialFormaPago.jButtonActualizarHistorialFormaPago.setVisible(this.isPermisoActualizarHistorialFormaPago);	
			this.jInternalFrameDetalleFormHistorialFormaPago.jButtonEliminarHistorialFormaPago.setVisible(this.isPermisoEliminarHistorialFormaPago);
			this.jInternalFrameDetalleFormHistorialFormaPago.jButtonCancelarHistorialFormaPago.setVisible(this.isVisibilidadCeldaCancelarHistorialFormaPago);						
			this.jInternalFrameDetalleFormHistorialFormaPago.jButtonGuardarCambiosHistorialFormaPago.setVisible(this.isPermisoGuardarCambiosHistorialFormaPago);							
		}
		
		this.jButtonGuardarCambiosTablaHistorialFormaPago.setVisible(this.isPermisoActualizarHistorialFormaPago);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleHistorialFormaPago() {
		this.jInternalFrameDetalleFormHistorialFormaPago.jButtonModificarHistorialFormaPago.setVisible(this.isPermisoActualizarHistorialFormaPago);	
		this.jInternalFrameDetalleFormHistorialFormaPago.jButtonActualizarHistorialFormaPago.setVisible(this.isPermisoActualizarHistorialFormaPago);	
		this.jInternalFrameDetalleFormHistorialFormaPago.jButtonEliminarHistorialFormaPago.setVisible(this.isPermisoEliminarHistorialFormaPago);
		this.jInternalFrameDetalleFormHistorialFormaPago.jButtonCancelarHistorialFormaPago.setVisible(this.isVisibilidadCeldaCancelarHistorialFormaPago);							
		this.jInternalFrameDetalleFormHistorialFormaPago.jButtonGuardarCambiosHistorialFormaPago.setVisible((this.isVisibilidadCeldaGuardarHistorialFormaPago && this.isPermisoGuardarCambiosHistorialFormaPago));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosHistorialFormaPago() {
		if(HistorialFormaPagoJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualHistorialFormaPago();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesHistorialFormaPago() {
	}
	
	public void jTableDatosHistorialFormaPagoListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarHistorialFormaPago(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,HistorialFormaPagoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidHistorialFormaPagoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.historialformapagoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosHistorialFormaPago.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualHistorialFormaPago(this.gethistorialformapago(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysHistorialFormaPago(this.historialformapago);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.historialformapago =(HistorialFormaPago) this.historialformapagoLogic.getHistorialFormaPagos().toArray()[this.jTableDatosHistorialFormaPago.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.historialformapago =(HistorialFormaPago) this.historialformapagos.toArray()[this.jTableDatosHistorialFormaPago.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.historialformapago==null) {
						this.historialformapago = new HistorialFormaPago();
					}

					this.setVariablesFormularioToObjetoActualHistorialFormaPago(this.historialformapago,true);
					this.setVariablesFormularioToObjetoActualForeignKeysHistorialFormaPago(this.historialformapago);
				}

				if(this.historialformapago.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.historialformapago.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingHistorialFormaPago(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.historialformapagoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.historialformapagoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,HistorialFormaPagoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.historialformapagoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaHistorialFormaPagoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialformapagoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebHistorialFormaPago(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosHistorialFormaPago.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosHistorialFormaPago.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosHistorialFormaPago.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.historialformapago =(HistorialFormaPago) this.historialformapagoLogic.getHistorialFormaPagos().toArray()[this.jTableDatosHistorialFormaPago.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.historialformapago =(HistorialFormaPago) this.historialformapagos.toArray()[this.jTableDatosHistorialFormaPago.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualHistorialFormaPago(this.gethistorialformapago(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysHistorialFormaPago(this.historialformapago);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.historialformapagoLogic.getConnexion());

				if(this.historialformapago.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.historialformapago.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderHistorialFormaPago=(TitledBorder)this.jScrollPanelDatosHistorialFormaPago.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderHistorialFormaPago.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialformapagoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialformapagoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,HistorialFormaPagoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialformapagoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaHistorialFormaPagoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.historialformapagoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosHistorialFormaPago.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualHistorialFormaPago(this.gethistorialformapago(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysHistorialFormaPago(this.historialformapago);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.historialformapago =(HistorialFormaPago) this.historialformapagoLogic.getHistorialFormaPagos().toArray()[this.jTableDatosHistorialFormaPago.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.historialformapago =(HistorialFormaPago) this.historialformapagos.toArray()[this.jTableDatosHistorialFormaPago.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.historialformapago==null) {
						this.historialformapago = new HistorialFormaPago();
					}

					this.setVariablesFormularioToObjetoActualHistorialFormaPago(this.historialformapago,true);
					this.setVariablesFormularioToObjetoActualForeignKeysHistorialFormaPago(this.historialformapago);
				}

				if(this.historialformapago.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.historialformapago.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingHistorialFormaPago(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.historialformapagoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.historialformapagoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,HistorialFormaPagoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.historialformapagoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_sucursalHistorialFormaPagoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialformapagoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisosucursal=true;

			idTienePermisosucursal=this.tienePermisosUsuarioEnPaginaWebHistorialFormaPago(SucursalConstantesFunciones.CLASSNAME);

			if(idTienePermisosucursal) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosHistorialFormaPago.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosHistorialFormaPago.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosHistorialFormaPago.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.historialformapago =(HistorialFormaPago) this.historialformapagoLogic.getHistorialFormaPagos().toArray()[this.jTableDatosHistorialFormaPago.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.historialformapago =(HistorialFormaPago) this.historialformapagos.toArray()[this.jTableDatosHistorialFormaPago.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualHistorialFormaPago(this.gethistorialformapago(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysHistorialFormaPago(this.historialformapago);

				this.sucursalBeanSwingJInternalFrame=new SucursalBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.sucursalBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.sucursalBeanSwingJInternalFrame.getSucursalLogic().setConnexion(this.historialformapagoLogic.getConnexion());

				if(this.historialformapago.getid_sucursal()!=null) {
					this.sucursalBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.sucursalBeanSwingJInternalFrame.setIdActual(this.historialformapago.getid_sucursal());
					this.sucursalBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.inicializarActualizarBindingTablaSucursal();
				}

				JInternalFrameBase jinternalFrame =this.sucursalBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderHistorialFormaPago=(TitledBorder)this.jScrollPanelDatosHistorialFormaPago.getBorder();
				TitledBorder titledBordersucursal=(TitledBorder)this.sucursalBeanSwingJInternalFrame.jScrollPanelDatosSucursal.getBorder();

				titledBordersucursal.setTitle(titledBorderHistorialFormaPago.getTitle() + " -> Sucursal");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialformapagoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialformapagoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,HistorialFormaPagoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialformapagoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_sucursalHistorialFormaPagoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.historialformapagoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosHistorialFormaPago.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualHistorialFormaPago(this.gethistorialformapago(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysHistorialFormaPago(this.historialformapago);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.historialformapago =(HistorialFormaPago) this.historialformapagoLogic.getHistorialFormaPagos().toArray()[this.jTableDatosHistorialFormaPago.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.historialformapago =(HistorialFormaPago) this.historialformapagos.toArray()[this.jTableDatosHistorialFormaPago.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.historialformapago==null) {
						this.historialformapago = new HistorialFormaPago();
					}

					this.setVariablesFormularioToObjetoActualHistorialFormaPago(this.historialformapago,true);
					this.setVariablesFormularioToObjetoActualForeignKeysHistorialFormaPago(this.historialformapago);
				}

				if(this.historialformapago.getid_sucursal()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_sucursal = "+this.historialformapago.getid_sucursal().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingHistorialFormaPago(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.historialformapagoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.historialformapagoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,HistorialFormaPagoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.historialformapagoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_ejercicioHistorialFormaPagoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialformapagoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoejercicio=true;

			idTienePermisoejercicio=this.tienePermisosUsuarioEnPaginaWebHistorialFormaPago(EjercicioConstantesFunciones.CLASSNAME);

			if(idTienePermisoejercicio) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosHistorialFormaPago.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosHistorialFormaPago.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosHistorialFormaPago.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.historialformapago =(HistorialFormaPago) this.historialformapagoLogic.getHistorialFormaPagos().toArray()[this.jTableDatosHistorialFormaPago.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.historialformapago =(HistorialFormaPago) this.historialformapagos.toArray()[this.jTableDatosHistorialFormaPago.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualHistorialFormaPago(this.gethistorialformapago(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysHistorialFormaPago(this.historialformapago);

				this.ejercicioBeanSwingJInternalFrame=new EjercicioBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.ejercicioBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.ejercicioBeanSwingJInternalFrame.getEjercicioLogic().setConnexion(this.historialformapagoLogic.getConnexion());

				if(this.historialformapago.getid_ejercicio()!=null) {
					this.ejercicioBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.ejercicioBeanSwingJInternalFrame.setIdActual(this.historialformapago.getid_ejercicio());
					this.ejercicioBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.ejercicioBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.ejercicioBeanSwingJInternalFrame.inicializarActualizarBindingTablaEjercicio();
				}

				JInternalFrameBase jinternalFrame =this.ejercicioBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderHistorialFormaPago=(TitledBorder)this.jScrollPanelDatosHistorialFormaPago.getBorder();
				TitledBorder titledBorderejercicio=(TitledBorder)this.ejercicioBeanSwingJInternalFrame.jScrollPanelDatosEjercicio.getBorder();

				titledBorderejercicio.setTitle(titledBorderHistorialFormaPago.getTitle() + " -> Ejercicio");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialformapagoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialformapagoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,HistorialFormaPagoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialformapagoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_ejercicioHistorialFormaPagoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.historialformapagoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosHistorialFormaPago.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualHistorialFormaPago(this.gethistorialformapago(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysHistorialFormaPago(this.historialformapago);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.historialformapago =(HistorialFormaPago) this.historialformapagoLogic.getHistorialFormaPagos().toArray()[this.jTableDatosHistorialFormaPago.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.historialformapago =(HistorialFormaPago) this.historialformapagos.toArray()[this.jTableDatosHistorialFormaPago.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.historialformapago==null) {
						this.historialformapago = new HistorialFormaPago();
					}

					this.setVariablesFormularioToObjetoActualHistorialFormaPago(this.historialformapago,true);
					this.setVariablesFormularioToObjetoActualForeignKeysHistorialFormaPago(this.historialformapago);
				}

				if(this.historialformapago.getid_ejercicio()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_ejercicio = "+this.historialformapago.getid_ejercicio().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingHistorialFormaPago(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.historialformapagoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.historialformapagoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,HistorialFormaPagoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.historialformapagoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_periodoHistorialFormaPagoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialformapagoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoperiodo=true;

			idTienePermisoperiodo=this.tienePermisosUsuarioEnPaginaWebHistorialFormaPago(PeriodoConstantesFunciones.CLASSNAME);

			if(idTienePermisoperiodo) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosHistorialFormaPago.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosHistorialFormaPago.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosHistorialFormaPago.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.historialformapago =(HistorialFormaPago) this.historialformapagoLogic.getHistorialFormaPagos().toArray()[this.jTableDatosHistorialFormaPago.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.historialformapago =(HistorialFormaPago) this.historialformapagos.toArray()[this.jTableDatosHistorialFormaPago.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualHistorialFormaPago(this.gethistorialformapago(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysHistorialFormaPago(this.historialformapago);

				this.periodoBeanSwingJInternalFrame=new PeriodoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.periodoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.periodoBeanSwingJInternalFrame.getPeriodoLogic().setConnexion(this.historialformapagoLogic.getConnexion());

				if(this.historialformapago.getid_periodo()!=null) {
					this.periodoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.periodoBeanSwingJInternalFrame.setIdActual(this.historialformapago.getid_periodo());
					this.periodoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.periodoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.periodoBeanSwingJInternalFrame.inicializarActualizarBindingTablaPeriodo();
				}

				JInternalFrameBase jinternalFrame =this.periodoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderHistorialFormaPago=(TitledBorder)this.jScrollPanelDatosHistorialFormaPago.getBorder();
				TitledBorder titledBorderperiodo=(TitledBorder)this.periodoBeanSwingJInternalFrame.jScrollPanelDatosPeriodo.getBorder();

				titledBorderperiodo.setTitle(titledBorderHistorialFormaPago.getTitle() + " -> Periodo");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialformapagoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialformapagoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,HistorialFormaPagoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialformapagoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_periodoHistorialFormaPagoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.historialformapagoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosHistorialFormaPago.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualHistorialFormaPago(this.gethistorialformapago(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysHistorialFormaPago(this.historialformapago);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.historialformapago =(HistorialFormaPago) this.historialformapagoLogic.getHistorialFormaPagos().toArray()[this.jTableDatosHistorialFormaPago.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.historialformapago =(HistorialFormaPago) this.historialformapagos.toArray()[this.jTableDatosHistorialFormaPago.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.historialformapago==null) {
						this.historialformapago = new HistorialFormaPago();
					}

					this.setVariablesFormularioToObjetoActualHistorialFormaPago(this.historialformapago,true);
					this.setVariablesFormularioToObjetoActualForeignKeysHistorialFormaPago(this.historialformapago);
				}

				if(this.historialformapago.getid_periodo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_periodo = "+this.historialformapago.getid_periodo().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingHistorialFormaPago(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.historialformapagoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.historialformapagoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,HistorialFormaPagoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.historialformapagoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_facturaHistorialFormaPagoActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {
			this.facturaBeanSwingJInternalFrame=new FacturaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.BUSQUEDA,false,false,false,true);
			this.facturaBeanSwingJInternalFrame.setJInternalFrameParent(this);
			this.facturaBeanSwingJInternalFrame.sTipoBusqueda="Factura";

			if(!this.sFinalQueryGeneral_factura.equals("")) {
				this.facturaBeanSwingJInternalFrame.setsFinalQueryGeneral(this.sFinalQueryGeneral_factura);
				this.facturaBeanSwingJInternalFrame.sAccionBusqueda="Query";


				this.facturaBeanSwingJInternalFrame.procesarBusqueda(this.facturaBeanSwingJInternalFrame.sAccionBusqueda);
				this.facturaBeanSwingJInternalFrame.inicializarActualizarBindingFactura(false);
			}

			if(!this.sFinalQueryComboFactura.equals("") && false) {
			}


			JInternalFrameBase jinternalFrame =this.facturaBeanSwingJInternalFrame;
			jinternalFrame.setAutoscrolls(true);
			//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
			jinternalFrame.setVisible(true); 


			TitledBorder titledBorderHistorialFormaPago=null;
			TitledBorder titledBorderfactura=null;

			if(!this.jScrollPanelDatosHistorialFormaPago.getBorder().getClass().equals(EmptyBorder.class)) {
				titledBorderHistorialFormaPago=(TitledBorder)this.jScrollPanelDatosHistorialFormaPago.getBorder();
				titledBorderfactura=(TitledBorder)this.facturaBeanSwingJInternalFrame.jScrollPanelDatosFactura.getBorder();

				titledBorderfactura.setTitle(titledBorderHistorialFormaPago.getTitle() + " -> Factura");
			}

			if(!Constantes.CON_VARIAS_VENTANAS) {
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
			}

			this.jDesktopPane.add(jinternalFrame);

			jinternalFrame.setSelected(true);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,HistorialFormaPagoConstantesFunciones.CLASSNAME);
		}
	}

	public void jButtonid_facturaHistorialFormaPagoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialformapagoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisofactura=true;

			idTienePermisofactura=this.tienePermisosUsuarioEnPaginaWebHistorialFormaPago(FacturaConstantesFunciones.CLASSNAME);

			if(idTienePermisofactura) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosHistorialFormaPago.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosHistorialFormaPago.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosHistorialFormaPago.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.historialformapago =(HistorialFormaPago) this.historialformapagoLogic.getHistorialFormaPagos().toArray()[this.jTableDatosHistorialFormaPago.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.historialformapago =(HistorialFormaPago) this.historialformapagos.toArray()[this.jTableDatosHistorialFormaPago.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualHistorialFormaPago(this.gethistorialformapago(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysHistorialFormaPago(this.historialformapago);

				this.facturaBeanSwingJInternalFrame=new FacturaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.facturaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.facturaBeanSwingJInternalFrame.getFacturaLogic().setConnexion(this.historialformapagoLogic.getConnexion());

				if(this.historialformapago.getid_factura()!=null) {
					this.facturaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.facturaBeanSwingJInternalFrame.setIdActual(this.historialformapago.getid_factura());
					this.facturaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.facturaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.facturaBeanSwingJInternalFrame.inicializarActualizarBindingTablaFactura();
				}

				JInternalFrameBase jinternalFrame =this.facturaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderHistorialFormaPago=(TitledBorder)this.jScrollPanelDatosHistorialFormaPago.getBorder();
				TitledBorder titledBorderfactura=(TitledBorder)this.facturaBeanSwingJInternalFrame.jScrollPanelDatosFactura.getBorder();

				titledBorderfactura.setTitle(titledBorderHistorialFormaPago.getTitle() + " -> Factura");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialformapagoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialformapagoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,HistorialFormaPagoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialformapagoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_facturaHistorialFormaPagoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.historialformapagoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosHistorialFormaPago.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualHistorialFormaPago(this.gethistorialformapago(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysHistorialFormaPago(this.historialformapago);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.historialformapago =(HistorialFormaPago) this.historialformapagoLogic.getHistorialFormaPagos().toArray()[this.jTableDatosHistorialFormaPago.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.historialformapago =(HistorialFormaPago) this.historialformapagos.toArray()[this.jTableDatosHistorialFormaPago.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.historialformapago==null) {
						this.historialformapago = new HistorialFormaPago();
					}

					this.setVariablesFormularioToObjetoActualHistorialFormaPago(this.historialformapago,true);
					this.setVariablesFormularioToObjetoActualForeignKeysHistorialFormaPago(this.historialformapago);
				}

				if(this.historialformapago.getid_factura()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_factura = "+this.historialformapago.getid_factura().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingHistorialFormaPago(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.historialformapagoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.historialformapagoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,HistorialFormaPagoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.historialformapagoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_tipo_forma_pagoHistorialFormaPagoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialformapagoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisotipoformapago=true;

			idTienePermisotipoformapago=this.tienePermisosUsuarioEnPaginaWebHistorialFormaPago(TipoFormaPagoConstantesFunciones.CLASSNAME);

			if(idTienePermisotipoformapago) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosHistorialFormaPago.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosHistorialFormaPago.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosHistorialFormaPago.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.historialformapago =(HistorialFormaPago) this.historialformapagoLogic.getHistorialFormaPagos().toArray()[this.jTableDatosHistorialFormaPago.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.historialformapago =(HistorialFormaPago) this.historialformapagos.toArray()[this.jTableDatosHistorialFormaPago.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualHistorialFormaPago(this.gethistorialformapago(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysHistorialFormaPago(this.historialformapago);

				this.tipoformapagoBeanSwingJInternalFrame=new TipoFormaPagoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.tipoformapagoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.tipoformapagoBeanSwingJInternalFrame.getTipoFormaPagoLogic().setConnexion(this.historialformapagoLogic.getConnexion());

				if(this.historialformapago.getid_tipo_forma_pago()!=null) {
					this.tipoformapagoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.tipoformapagoBeanSwingJInternalFrame.setIdActual(this.historialformapago.getid_tipo_forma_pago());
					this.tipoformapagoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.tipoformapagoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.tipoformapagoBeanSwingJInternalFrame.inicializarActualizarBindingTablaTipoFormaPago();
				}

				JInternalFrameBase jinternalFrame =this.tipoformapagoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderHistorialFormaPago=(TitledBorder)this.jScrollPanelDatosHistorialFormaPago.getBorder();
				TitledBorder titledBordertipoformapago=(TitledBorder)this.tipoformapagoBeanSwingJInternalFrame.jScrollPanelDatosTipoFormaPago.getBorder();

				titledBordertipoformapago.setTitle(titledBorderHistorialFormaPago.getTitle() + " -> Tipo Forma Pago");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialformapagoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialformapagoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,HistorialFormaPagoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialformapagoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_tipo_forma_pagoHistorialFormaPagoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.historialformapagoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosHistorialFormaPago.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualHistorialFormaPago(this.gethistorialformapago(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysHistorialFormaPago(this.historialformapago);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.historialformapago =(HistorialFormaPago) this.historialformapagoLogic.getHistorialFormaPagos().toArray()[this.jTableDatosHistorialFormaPago.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.historialformapago =(HistorialFormaPago) this.historialformapagos.toArray()[this.jTableDatosHistorialFormaPago.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.historialformapago==null) {
						this.historialformapago = new HistorialFormaPago();
					}

					this.setVariablesFormularioToObjetoActualHistorialFormaPago(this.historialformapago,true);
					this.setVariablesFormularioToObjetoActualForeignKeysHistorialFormaPago(this.historialformapago);
				}

				if(this.historialformapago.getid_tipo_forma_pago()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_tipo_forma_pago = "+this.historialformapago.getid_tipo_forma_pago().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingHistorialFormaPago(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.historialformapagoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.historialformapagoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,HistorialFormaPagoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.historialformapagoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_cuenta_contableHistorialFormaPagoActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
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


			TitledBorder titledBorderHistorialFormaPago=null;
			TitledBorder titledBordercuentacontable=null;

			if(!this.jScrollPanelDatosHistorialFormaPago.getBorder().getClass().equals(EmptyBorder.class)) {
				titledBorderHistorialFormaPago=(TitledBorder)this.jScrollPanelDatosHistorialFormaPago.getBorder();
				titledBordercuentacontable=(TitledBorder)this.cuentacontableBeanSwingJInternalFrame.jScrollPanelDatosCuentaContable.getBorder();

				titledBordercuentacontable.setTitle(titledBorderHistorialFormaPago.getTitle() + " -> Cuenta Contable");
			}

			if(!Constantes.CON_VARIAS_VENTANAS) {
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
			}

			this.jDesktopPane.add(jinternalFrame);

			jinternalFrame.setSelected(true);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,HistorialFormaPagoConstantesFunciones.CLASSNAME);
		}
	}

	public void jButtonid_cuenta_contableHistorialFormaPagoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialformapagoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisocuentacontable=true;

			idTienePermisocuentacontable=this.tienePermisosUsuarioEnPaginaWebHistorialFormaPago(CuentaContableConstantesFunciones.CLASSNAME);

			if(idTienePermisocuentacontable) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosHistorialFormaPago.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosHistorialFormaPago.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosHistorialFormaPago.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.historialformapago =(HistorialFormaPago) this.historialformapagoLogic.getHistorialFormaPagos().toArray()[this.jTableDatosHistorialFormaPago.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.historialformapago =(HistorialFormaPago) this.historialformapagos.toArray()[this.jTableDatosHistorialFormaPago.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualHistorialFormaPago(this.gethistorialformapago(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysHistorialFormaPago(this.historialformapago);

				this.cuentacontableBeanSwingJInternalFrame=new CuentaContableBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.cuentacontableBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.cuentacontableBeanSwingJInternalFrame.getCuentaContableLogic().setConnexion(this.historialformapagoLogic.getConnexion());

				if(this.historialformapago.getid_cuenta_contable()!=null) {
					this.cuentacontableBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.cuentacontableBeanSwingJInternalFrame.setIdActual(this.historialformapago.getid_cuenta_contable());
					this.cuentacontableBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.cuentacontableBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.cuentacontableBeanSwingJInternalFrame.inicializarActualizarBindingTablaCuentaContable();
				}

				JInternalFrameBase jinternalFrame =this.cuentacontableBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderHistorialFormaPago=(TitledBorder)this.jScrollPanelDatosHistorialFormaPago.getBorder();
				TitledBorder titledBordercuentacontable=(TitledBorder)this.cuentacontableBeanSwingJInternalFrame.jScrollPanelDatosCuentaContable.getBorder();

				titledBordercuentacontable.setTitle(titledBorderHistorialFormaPago.getTitle() + " -> Cuenta Contable");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialformapagoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialformapagoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,HistorialFormaPagoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialformapagoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_cuenta_contableHistorialFormaPagoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.historialformapagoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosHistorialFormaPago.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualHistorialFormaPago(this.gethistorialformapago(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysHistorialFormaPago(this.historialformapago);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.historialformapago =(HistorialFormaPago) this.historialformapagoLogic.getHistorialFormaPagos().toArray()[this.jTableDatosHistorialFormaPago.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.historialformapago =(HistorialFormaPago) this.historialformapagos.toArray()[this.jTableDatosHistorialFormaPago.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.historialformapago==null) {
						this.historialformapago = new HistorialFormaPago();
					}

					this.setVariablesFormularioToObjetoActualHistorialFormaPago(this.historialformapago,true);
					this.setVariablesFormularioToObjetoActualForeignKeysHistorialFormaPago(this.historialformapago);
				}

				if(this.historialformapago.getid_cuenta_contable()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_cuenta_contable = "+this.historialformapago.getid_cuenta_contable().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingHistorialFormaPago(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.historialformapagoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.historialformapagoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,HistorialFormaPagoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.historialformapagoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnumero_diasHistorialFormaPagoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.historialformapagoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosHistorialFormaPago.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualHistorialFormaPago(this.gethistorialformapago(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysHistorialFormaPago(this.historialformapago);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.historialformapago =(HistorialFormaPago) this.historialformapagoLogic.getHistorialFormaPagos().toArray()[this.jTableDatosHistorialFormaPago.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.historialformapago =(HistorialFormaPago) this.historialformapagos.toArray()[this.jTableDatosHistorialFormaPago.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.historialformapago==null) {
						this.historialformapago = new HistorialFormaPago();
					}

					this.setVariablesFormularioToObjetoActualHistorialFormaPago(this.historialformapago,true);
					this.setVariablesFormularioToObjetoActualForeignKeysHistorialFormaPago(this.historialformapago);
				}

				if(this.historialformapago.getnumero_dias()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where numero_dias = "+this.historialformapago.getnumero_dias().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingHistorialFormaPago(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.historialformapagoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.historialformapagoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,HistorialFormaPagoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.historialformapagoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonvalorHistorialFormaPagoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.historialformapagoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosHistorialFormaPago.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualHistorialFormaPago(this.gethistorialformapago(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysHistorialFormaPago(this.historialformapago);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.historialformapago =(HistorialFormaPago) this.historialformapagoLogic.getHistorialFormaPagos().toArray()[this.jTableDatosHistorialFormaPago.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.historialformapago =(HistorialFormaPago) this.historialformapagos.toArray()[this.jTableDatosHistorialFormaPago.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.historialformapago==null) {
						this.historialformapago = new HistorialFormaPago();
					}

					this.setVariablesFormularioToObjetoActualHistorialFormaPago(this.historialformapago,true);
					this.setVariablesFormularioToObjetoActualForeignKeysHistorialFormaPago(this.historialformapago);
				}

				if(this.historialformapago.getvalor()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where valor = "+this.historialformapago.getvalor().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingHistorialFormaPago(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.historialformapagoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.historialformapagoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,HistorialFormaPagoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.historialformapagoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfechaHistorialFormaPagoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.historialformapagoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosHistorialFormaPago.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualHistorialFormaPago(this.gethistorialformapago(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysHistorialFormaPago(this.historialformapago);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.historialformapago =(HistorialFormaPago) this.historialformapagoLogic.getHistorialFormaPagos().toArray()[this.jTableDatosHistorialFormaPago.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.historialformapago =(HistorialFormaPago) this.historialformapagos.toArray()[this.jTableDatosHistorialFormaPago.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.historialformapago==null) {
						this.historialformapago = new HistorialFormaPago();
					}

					this.setVariablesFormularioToObjetoActualHistorialFormaPago(this.historialformapago,true);
					this.setVariablesFormularioToObjetoActualForeignKeysHistorialFormaPago(this.historialformapago);
				}

				if(this.historialformapago.getfecha()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha = '"+Funciones2.getStringPostgresDate(this.historialformapago.getfecha())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingHistorialFormaPago(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.historialformapagoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.historialformapagoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,HistorialFormaPagoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.historialformapagoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonporcentajeHistorialFormaPagoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.historialformapagoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosHistorialFormaPago.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualHistorialFormaPago(this.gethistorialformapago(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysHistorialFormaPago(this.historialformapago);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.historialformapago =(HistorialFormaPago) this.historialformapagoLogic.getHistorialFormaPagos().toArray()[this.jTableDatosHistorialFormaPago.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.historialformapago =(HistorialFormaPago) this.historialformapagos.toArray()[this.jTableDatosHistorialFormaPago.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.historialformapago==null) {
						this.historialformapago = new HistorialFormaPago();
					}

					this.setVariablesFormularioToObjetoActualHistorialFormaPago(this.historialformapago,true);
					this.setVariablesFormularioToObjetoActualForeignKeysHistorialFormaPago(this.historialformapago);
				}

				if(this.historialformapago.getporcentaje()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where porcentaje = "+this.historialformapago.getporcentaje().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingHistorialFormaPago(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.historialformapagoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.historialformapagoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,HistorialFormaPagoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.historialformapagoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonporcentaje_retencionHistorialFormaPagoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.historialformapagoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosHistorialFormaPago.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualHistorialFormaPago(this.gethistorialformapago(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysHistorialFormaPago(this.historialformapago);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.historialformapago =(HistorialFormaPago) this.historialformapagoLogic.getHistorialFormaPagos().toArray()[this.jTableDatosHistorialFormaPago.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.historialformapago =(HistorialFormaPago) this.historialformapagos.toArray()[this.jTableDatosHistorialFormaPago.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.historialformapago==null) {
						this.historialformapago = new HistorialFormaPago();
					}

					this.setVariablesFormularioToObjetoActualHistorialFormaPago(this.historialformapago,true);
					this.setVariablesFormularioToObjetoActualForeignKeysHistorialFormaPago(this.historialformapago);
				}

				if(this.historialformapago.getporcentaje_retencion()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where porcentaje_retencion = "+this.historialformapago.getporcentaje_retencion().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingHistorialFormaPago(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.historialformapagoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.historialformapagoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,HistorialFormaPagoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.historialformapagoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonbase_retencionHistorialFormaPagoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.historialformapagoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosHistorialFormaPago.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualHistorialFormaPago(this.gethistorialformapago(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysHistorialFormaPago(this.historialformapago);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.historialformapago =(HistorialFormaPago) this.historialformapagoLogic.getHistorialFormaPagos().toArray()[this.jTableDatosHistorialFormaPago.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.historialformapago =(HistorialFormaPago) this.historialformapagos.toArray()[this.jTableDatosHistorialFormaPago.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.historialformapago==null) {
						this.historialformapago = new HistorialFormaPago();
					}

					this.setVariablesFormularioToObjetoActualHistorialFormaPago(this.historialformapago,true);
					this.setVariablesFormularioToObjetoActualForeignKeysHistorialFormaPago(this.historialformapago);
				}

				if(this.historialformapago.getbase_retencion()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where base_retencion = "+this.historialformapago.getbase_retencion().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingHistorialFormaPago(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.historialformapagoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.historialformapagoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,HistorialFormaPagoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.historialformapagoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnumero_retencionHistorialFormaPagoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.historialformapagoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosHistorialFormaPago.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualHistorialFormaPago(this.gethistorialformapago(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysHistorialFormaPago(this.historialformapago);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.historialformapago =(HistorialFormaPago) this.historialformapagoLogic.getHistorialFormaPagos().toArray()[this.jTableDatosHistorialFormaPago.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.historialformapago =(HistorialFormaPago) this.historialformapagos.toArray()[this.jTableDatosHistorialFormaPago.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.historialformapago==null) {
						this.historialformapago = new HistorialFormaPago();
					}

					this.setVariablesFormularioToObjetoActualHistorialFormaPago(this.historialformapago,true);
					this.setVariablesFormularioToObjetoActualForeignKeysHistorialFormaPago(this.historialformapago);
				}

				if(this.historialformapago.getnumero_retencion()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where numero_retencion = "+this.historialformapago.getnumero_retencion().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingHistorialFormaPago(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.historialformapagoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.historialformapagoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,HistorialFormaPagoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.historialformapagoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_retencionHistorialFormaPagoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.historialformapagoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosHistorialFormaPago.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualHistorialFormaPago(this.gethistorialformapago(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysHistorialFormaPago(this.historialformapago);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.historialformapago =(HistorialFormaPago) this.historialformapagoLogic.getHistorialFormaPagos().toArray()[this.jTableDatosHistorialFormaPago.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.historialformapago =(HistorialFormaPago) this.historialformapagos.toArray()[this.jTableDatosHistorialFormaPago.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.historialformapago==null) {
						this.historialformapago = new HistorialFormaPago();
					}

					this.setVariablesFormularioToObjetoActualHistorialFormaPago(this.historialformapago,true);
					this.setVariablesFormularioToObjetoActualForeignKeysHistorialFormaPago(this.historialformapago);
				}

				if(this.historialformapago.getnombre_retencion()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_retencion like '%"+this.historialformapago.getnombre_retencion()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingHistorialFormaPago(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.historialformapagoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.historialformapagoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,HistorialFormaPagoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.historialformapagoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_anioHistorialFormaPagoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialformapagoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoanio=true;

			idTienePermisoanio=this.tienePermisosUsuarioEnPaginaWebHistorialFormaPago(AnioConstantesFunciones.CLASSNAME);

			if(idTienePermisoanio) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosHistorialFormaPago.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosHistorialFormaPago.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosHistorialFormaPago.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.historialformapago =(HistorialFormaPago) this.historialformapagoLogic.getHistorialFormaPagos().toArray()[this.jTableDatosHistorialFormaPago.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.historialformapago =(HistorialFormaPago) this.historialformapagos.toArray()[this.jTableDatosHistorialFormaPago.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualHistorialFormaPago(this.gethistorialformapago(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysHistorialFormaPago(this.historialformapago);

				this.anioBeanSwingJInternalFrame=new AnioBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.anioBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.anioBeanSwingJInternalFrame.getAnioLogic().setConnexion(this.historialformapagoLogic.getConnexion());

				if(this.historialformapago.getid_anio()!=null) {
					this.anioBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.anioBeanSwingJInternalFrame.setIdActual(this.historialformapago.getid_anio());
					this.anioBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.anioBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.anioBeanSwingJInternalFrame.inicializarActualizarBindingTablaAnio();
				}

				JInternalFrameBase jinternalFrame =this.anioBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderHistorialFormaPago=(TitledBorder)this.jScrollPanelDatosHistorialFormaPago.getBorder();
				TitledBorder titledBorderanio=(TitledBorder)this.anioBeanSwingJInternalFrame.jScrollPanelDatosAnio.getBorder();

				titledBorderanio.setTitle(titledBorderHistorialFormaPago.getTitle() + " -> Anio");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialformapagoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialformapagoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,HistorialFormaPagoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialformapagoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_anioHistorialFormaPagoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.historialformapagoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosHistorialFormaPago.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualHistorialFormaPago(this.gethistorialformapago(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysHistorialFormaPago(this.historialformapago);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.historialformapago =(HistorialFormaPago) this.historialformapagoLogic.getHistorialFormaPagos().toArray()[this.jTableDatosHistorialFormaPago.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.historialformapago =(HistorialFormaPago) this.historialformapagos.toArray()[this.jTableDatosHistorialFormaPago.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.historialformapago==null) {
						this.historialformapago = new HistorialFormaPago();
					}

					this.setVariablesFormularioToObjetoActualHistorialFormaPago(this.historialformapago,true);
					this.setVariablesFormularioToObjetoActualForeignKeysHistorialFormaPago(this.historialformapago);
				}

				if(this.historialformapago.getid_anio()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_anio = "+this.historialformapago.getid_anio().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingHistorialFormaPago(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.historialformapagoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.historialformapagoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,HistorialFormaPagoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.historialformapagoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_mesHistorialFormaPagoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialformapagoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisomes=true;

			idTienePermisomes=this.tienePermisosUsuarioEnPaginaWebHistorialFormaPago(MesConstantesFunciones.CLASSNAME);

			if(idTienePermisomes) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosHistorialFormaPago.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosHistorialFormaPago.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosHistorialFormaPago.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.historialformapago =(HistorialFormaPago) this.historialformapagoLogic.getHistorialFormaPagos().toArray()[this.jTableDatosHistorialFormaPago.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.historialformapago =(HistorialFormaPago) this.historialformapagos.toArray()[this.jTableDatosHistorialFormaPago.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualHistorialFormaPago(this.gethistorialformapago(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysHistorialFormaPago(this.historialformapago);

				this.mesBeanSwingJInternalFrame=new MesBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.mesBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.mesBeanSwingJInternalFrame.getMesLogic().setConnexion(this.historialformapagoLogic.getConnexion());

				if(this.historialformapago.getid_mes()!=null) {
					this.mesBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.mesBeanSwingJInternalFrame.setIdActual(this.historialformapago.getid_mes());
					this.mesBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.mesBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.mesBeanSwingJInternalFrame.inicializarActualizarBindingTablaMes();
				}

				JInternalFrameBase jinternalFrame =this.mesBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderHistorialFormaPago=(TitledBorder)this.jScrollPanelDatosHistorialFormaPago.getBorder();
				TitledBorder titledBordermes=(TitledBorder)this.mesBeanSwingJInternalFrame.jScrollPanelDatosMes.getBorder();

				titledBordermes.setTitle(titledBorderHistorialFormaPago.getTitle() + " -> Mes");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialformapagoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialformapagoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,HistorialFormaPagoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialformapagoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_mesHistorialFormaPagoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.historialformapagoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosHistorialFormaPago.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualHistorialFormaPago(this.gethistorialformapago(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysHistorialFormaPago(this.historialformapago);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.historialformapago =(HistorialFormaPago) this.historialformapagoLogic.getHistorialFormaPagos().toArray()[this.jTableDatosHistorialFormaPago.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.historialformapago =(HistorialFormaPago) this.historialformapagos.toArray()[this.jTableDatosHistorialFormaPago.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.historialformapago==null) {
						this.historialformapago = new HistorialFormaPago();
					}

					this.setVariablesFormularioToObjetoActualHistorialFormaPago(this.historialformapago,true);
					this.setVariablesFormularioToObjetoActualForeignKeysHistorialFormaPago(this.historialformapago);
				}

				if(this.historialformapago.getid_mes()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_mes = "+this.historialformapago.getid_mes().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingHistorialFormaPago(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.historialformapagoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.historialformapagoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,HistorialFormaPagoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.historialformapagoLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdAnioHistorialFormaPagoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialformapagoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingHistorialFormaPago(false,false);

			this.getHistorialFormaPagosFK_IdAnio();

			this.inicializarActualizarBindingHistorialFormaPago(false);

			//if(HistorialFormaPagoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingHistorialFormaPago(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialformapagoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialformapagoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,HistorialFormaPagoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialformapagoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdCuentaContableHistorialFormaPagoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialformapagoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingHistorialFormaPago(false,false);

			this.getHistorialFormaPagosFK_IdCuentaContable();

			this.inicializarActualizarBindingHistorialFormaPago(false);

			//if(HistorialFormaPagoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingHistorialFormaPago(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialformapagoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialformapagoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,HistorialFormaPagoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialformapagoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEjercicioHistorialFormaPagoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialformapagoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingHistorialFormaPago(false,false);

			this.getHistorialFormaPagosFK_IdEjercicio();

			this.inicializarActualizarBindingHistorialFormaPago(false);

			//if(HistorialFormaPagoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingHistorialFormaPago(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialformapagoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialformapagoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,HistorialFormaPagoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialformapagoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaHistorialFormaPagoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialformapagoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingHistorialFormaPago(false,false);

			this.getHistorialFormaPagosFK_IdEmpresa();

			this.inicializarActualizarBindingHistorialFormaPago(false);

			//if(HistorialFormaPagoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingHistorialFormaPago(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialformapagoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialformapagoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,HistorialFormaPagoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialformapagoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdFacturaHistorialFormaPagoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialformapagoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingHistorialFormaPago(false,false);

			this.getHistorialFormaPagosFK_IdFactura();

			this.inicializarActualizarBindingHistorialFormaPago(false);

			//if(HistorialFormaPagoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingHistorialFormaPago(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialformapagoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialformapagoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,HistorialFormaPagoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialformapagoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdMesHistorialFormaPagoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialformapagoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingHistorialFormaPago(false,false);

			this.getHistorialFormaPagosFK_IdMes();

			this.inicializarActualizarBindingHistorialFormaPago(false);

			//if(HistorialFormaPagoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingHistorialFormaPago(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialformapagoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialformapagoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,HistorialFormaPagoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialformapagoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdPeriodoHistorialFormaPagoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialformapagoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingHistorialFormaPago(false,false);

			this.getHistorialFormaPagosFK_IdPeriodo();

			this.inicializarActualizarBindingHistorialFormaPago(false);

			//if(HistorialFormaPagoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingHistorialFormaPago(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialformapagoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialformapagoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,HistorialFormaPagoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialformapagoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdSucursalHistorialFormaPagoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialformapagoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingHistorialFormaPago(false,false);

			this.getHistorialFormaPagosFK_IdSucursal();

			this.inicializarActualizarBindingHistorialFormaPago(false);

			//if(HistorialFormaPagoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingHistorialFormaPago(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialformapagoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialformapagoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,HistorialFormaPagoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialformapagoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdTipoFormaPagoHistorialFormaPagoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialformapagoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingHistorialFormaPago(false,false);

			this.getHistorialFormaPagosFK_IdTipoFormaPago();

			this.inicializarActualizarBindingHistorialFormaPago(false);

			//if(HistorialFormaPagoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingHistorialFormaPago(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialformapagoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialformapagoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,HistorialFormaPagoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialformapagoLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameHistorialFormaPago() {
		if(this.jInternalFrameDetalleFormHistorialFormaPago!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormHistorialFormaPago!=null) {
			this.jInternalFrameDetalleFormHistorialFormaPago.setVisible(false);	    			
			this.jInternalFrameDetalleFormHistorialFormaPago.dispose();
			this.jInternalFrameDetalleFormHistorialFormaPago=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoHistorialFormaPago!=null) {
			this.jInternalFrameReporteDinamicoHistorialFormaPago.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoHistorialFormaPago.dispose();
			this.jInternalFrameReporteDinamicoHistorialFormaPago=null;
		}
		
		if(this.jInternalFrameImportacionHistorialFormaPago!=null) {
			this.jInternalFrameImportacionHistorialFormaPago.setVisible(false);	    			
			this.jInternalFrameImportacionHistorialFormaPago.dispose();
			this.jInternalFrameImportacionHistorialFormaPago=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessHistorialFormaPago();
			
			HistorialFormaPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.historialformapago,new Object(),this.historialformapagoParameterGeneral,this.historialformapagoReturnGeneral);
			
			
			if(sTipo.equals("NuevoHistorialFormaPago")) {
				jButtonNuevoHistorialFormaPagoActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarHistorialFormaPago")) {
				jButtonDuplicarHistorialFormaPagoActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarHistorialFormaPago")) {
				jButtonCopiarHistorialFormaPagoActionPerformed(evt);
			} else if(sTipo.equals("VerFormHistorialFormaPago")) {
				jButtonVerFormHistorialFormaPagoActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarHistorialFormaPago")) {
				jButtonNuevoHistorialFormaPagoActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarHistorialFormaPago")) {
				jButtonDuplicarHistorialFormaPagoActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoHistorialFormaPago")) {
				jButtonNuevoHistorialFormaPagoActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarHistorialFormaPago")) {
				jButtonDuplicarHistorialFormaPagoActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesHistorialFormaPago")) {
				jButtonNuevoHistorialFormaPagoActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarHistorialFormaPago")) {
				jButtonNuevoHistorialFormaPagoActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesHistorialFormaPago")) {
				jButtonNuevoHistorialFormaPagoActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarHistorialFormaPago")) {
				jButtonModificarHistorialFormaPagoActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarHistorialFormaPago")) {
				jButtonModificarHistorialFormaPagoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarHistorialFormaPago")) {
				jButtonModificarHistorialFormaPagoActionPerformed(evt);
			} else if(sTipo.equals("ActualizarHistorialFormaPago")) {
				jButtonActualizarHistorialFormaPagoActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarHistorialFormaPago")) {
				jButtonActualizarHistorialFormaPagoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarHistorialFormaPago")) {
				jButtonActualizarHistorialFormaPagoActionPerformed(evt);
			} else if(sTipo.equals("EliminarHistorialFormaPago")) {
				jButtonEliminarHistorialFormaPagoActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarHistorialFormaPago")) {
				jButtonEliminarHistorialFormaPagoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarHistorialFormaPago")) {
				jButtonEliminarHistorialFormaPagoActionPerformed(evt);
			} else if(sTipo.equals("CancelarHistorialFormaPago")) {
				jButtonCancelarHistorialFormaPagoActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarHistorialFormaPago")) {
				jButtonCancelarHistorialFormaPagoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarHistorialFormaPago")) {
				jButtonCancelarHistorialFormaPagoActionPerformed(evt);
			} else if(sTipo.equals("CerrarHistorialFormaPago")) {
				jButtonCerrarHistorialFormaPagoActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarHistorialFormaPago")) {
				jButtonCerrarHistorialFormaPagoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarHistorialFormaPago")) {
				jButtonCerrarHistorialFormaPagoActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarHistorialFormaPago")) {
				jButtonMostrarOcultarHistorialFormaPagoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarHistorialFormaPago")) {
				jButtonCancelarHistorialFormaPagoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosHistorialFormaPago")) {
				jButtonGuardarCambiosHistorialFormaPagoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarHistorialFormaPago")) {
				jButtonGuardarCambiosHistorialFormaPagoActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarHistorialFormaPago")) {
				jButtonCopiarHistorialFormaPagoActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarHistorialFormaPago")) {
				jButtonVerFormHistorialFormaPagoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosHistorialFormaPago")) {
				jButtonGuardarCambiosHistorialFormaPagoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarHistorialFormaPago")) {
				jButtonCopiarHistorialFormaPagoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormHistorialFormaPago")) {
				jButtonVerFormHistorialFormaPagoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaHistorialFormaPago")) {
				jButtonGuardarCambiosHistorialFormaPagoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarHistorialFormaPago")) {
				jButtonGuardarCambiosHistorialFormaPagoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaHistorialFormaPago")) {
				jButtonGuardarCambiosHistorialFormaPagoActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionHistorialFormaPago")) {
				jButtonRecargarInformacionHistorialFormaPagoActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarHistorialFormaPago")) {
				jButtonRecargarInformacionHistorialFormaPagoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionHistorialFormaPago")) {
				jButtonRecargarInformacionHistorialFormaPagoActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresHistorialFormaPago")) {
				jButtonAnterioresHistorialFormaPagoActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarHistorialFormaPago")) {
				jButtonAnterioresHistorialFormaPagoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreHistorialFormaPago")) {
				jButtonAnterioresHistorialFormaPagoActionPerformed(evt);
			} else if(sTipo.equals("SiguientesHistorialFormaPago")) {
				jButtonSiguientesHistorialFormaPagoActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarHistorialFormaPago")) {
				jButtonSiguientesHistorialFormaPagoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesHistorialFormaPago")) {
				jButtonSiguientesHistorialFormaPagoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByHistorialFormaPago") || sTipo.equals("MenuItemDetalleAbrirOrderByHistorialFormaPago")) {
				jButtonAbrirOrderByHistorialFormaPagoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarHistorialFormaPago") || sTipo.equals("MenuItemDetalleMostrarOcultarHistorialFormaPago")) {
				jButtonMostrarOcultarHistorialFormaPagoActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosHistorialFormaPago")) {
				jButtonNuevoGuardarCambiosHistorialFormaPagoActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarHistorialFormaPago")) {
				jButtonNuevoGuardarCambiosHistorialFormaPagoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosHistorialFormaPago")) {
				jButtonNuevoGuardarCambiosHistorialFormaPagoActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoHistorialFormaPago")) {
				jButtonCerrarReporteDinamicoHistorialFormaPagoActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoHistorialFormaPago")) {
				jButtonGenerarReporteDinamicoHistorialFormaPagoActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoHistorialFormaPago")) {
				
				jButtonGenerarExcelReporteDinamicoHistorialFormaPagoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionHistorialFormaPago")) {
				jButtonCerrarImportacionHistorialFormaPagoActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionHistorialFormaPago")) {
				
				jButtonGenerarImportacionHistorialFormaPagoActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionHistorialFormaPago")) {
				
				jButtonAbrirImportacionHistorialFormaPagoActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesHistorialFormaPago")) {
				jComboBoxTiposAccionesHistorialFormaPagoActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesHistorialFormaPago")) {
				jComboBoxTiposRelacionesHistorialFormaPagoActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioHistorialFormaPago")) {
				jComboBoxTiposAccionesHistorialFormaPagoActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarHistorialFormaPago")) {
				
				jComboBoxTiposSeleccionarHistorialFormaPagoActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralHistorialFormaPago")) {
				jTextFieldValorCampoGeneralHistorialFormaPagoActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByHistorialFormaPago")) {
				jButtonAbrirOrderByHistorialFormaPagoActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarHistorialFormaPago")) {
				jButtonAbrirOrderByHistorialFormaPagoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByHistorialFormaPago")) {
				jButtonCerrarOrderByHistorialFormaPagoActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idHistorialFormaPagoBusqueda")) {
				this.jButtonidHistorialFormaPagoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaHistorialFormaPagoUpdate")) {
				this.jButtonid_empresaHistorialFormaPagoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaHistorialFormaPagoBusqueda")) {
				this.jButtonid_empresaHistorialFormaPagoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalHistorialFormaPagoUpdate")) {
				this.jButtonid_sucursalHistorialFormaPagoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalHistorialFormaPagoBusqueda")) {
				this.jButtonid_sucursalHistorialFormaPagoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_ejercicioHistorialFormaPagoUpdate")) {
				this.jButtonid_ejercicioHistorialFormaPagoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_ejercicioHistorialFormaPagoBusqueda")) {
				this.jButtonid_ejercicioHistorialFormaPagoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_periodoHistorialFormaPagoUpdate")) {
				this.jButtonid_periodoHistorialFormaPagoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_periodoHistorialFormaPagoBusqueda")) {
				this.jButtonid_periodoHistorialFormaPagoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_facturaHistorialFormaPago")) {
				this.jButtonid_facturaHistorialFormaPagoActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_facturaHistorialFormaPagoUpdate")) {
				this.jButtonid_facturaHistorialFormaPagoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_facturaHistorialFormaPagoBusqueda")) {
				this.jButtonid_facturaHistorialFormaPagoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_forma_pagoHistorialFormaPagoUpdate")) {
				this.jButtonid_tipo_forma_pagoHistorialFormaPagoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_forma_pagoHistorialFormaPagoBusqueda")) {
				this.jButtonid_tipo_forma_pagoHistorialFormaPagoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_cuenta_contableHistorialFormaPago")) {
				this.jButtonid_cuenta_contableHistorialFormaPagoActionPerformed(evt);
			}
			//BUSQUEDA ARBOL CAMPO
			else if(sTipo.equals("id_cuenta_contableHistorialFormaPagoArbol")) {
				this.abrirFrameTreeCuentaContable("BUSQUEDA_FK");
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_cuenta_contableHistorialFormaPagoUpdate")) {
				this.jButtonid_cuenta_contableHistorialFormaPagoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_cuenta_contableHistorialFormaPagoBusqueda")) {
				this.jButtonid_cuenta_contableHistorialFormaPagoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_diasHistorialFormaPagoBusqueda")) {
				this.jButtonnumero_diasHistorialFormaPagoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("valorHistorialFormaPagoBusqueda")) {
				this.jButtonvalorHistorialFormaPagoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fechaHistorialFormaPagoBusqueda")) {
				this.jButtonfechaHistorialFormaPagoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("porcentajeHistorialFormaPagoBusqueda")) {
				this.jButtonporcentajeHistorialFormaPagoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("porcentaje_retencionHistorialFormaPagoBusqueda")) {
				this.jButtonporcentaje_retencionHistorialFormaPagoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("base_retencionHistorialFormaPagoBusqueda")) {
				this.jButtonbase_retencionHistorialFormaPagoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_retencionHistorialFormaPagoBusqueda")) {
				this.jButtonnumero_retencionHistorialFormaPagoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_retencionHistorialFormaPagoBusqueda")) {
				this.jButtonnombre_retencionHistorialFormaPagoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_anioHistorialFormaPagoUpdate")) {
				this.jButtonid_anioHistorialFormaPagoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_anioHistorialFormaPagoBusqueda")) {
				this.jButtonid_anioHistorialFormaPagoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_mesHistorialFormaPagoUpdate")) {
				this.jButtonid_mesHistorialFormaPagoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_mesHistorialFormaPagoBusqueda")) {
				this.jButtonid_mesHistorialFormaPagoBusquedaActionPerformed(evt);
			}
			
			
			else if(sTipo.equals("id_cuenta_contableHistorialFormaPago")) {
				this.jButtonid_cuenta_contableHistorialFormaPagoActionPerformed(evt);
			}
			else if(sTipo.equals("id_facturaHistorialFormaPago")) {
				this.jButtonid_facturaHistorialFormaPagoActionPerformed(evt);
			}
			
			
			else if(sTipo.equals("FK_IdCuentaContableHistorialFormaPago")) {
				this.jButtonFK_IdCuentaContableHistorialFormaPagoActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdFacturaHistorialFormaPago")) {
				this.jButtonFK_IdFacturaHistorialFormaPagoActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdTipoFormaPagoHistorialFormaPago")) {
				this.jButtonFK_IdTipoFormaPagoHistorialFormaPagoActionPerformed(evt);
			}
			
			;
			
			
			HistorialFormaPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.historialformapago,new Object(),this.historialformapagoParameterGeneral,this.historialformapagoReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,HistorialFormaPagoConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessHistorialFormaPago();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaHistorialFormaPagoActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.historialformapago);
				
				this.actualizarInformacion("INFO_PADRE",false,this.historialformapago);
				
				HistorialFormaPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.historialformapago,new Object(),this.historialformapagoParameterGeneral,this.historialformapagoReturnGeneral);
				
				


				
				HistorialFormaPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.historialformapago,new Object(),this.historialformapagoParameterGeneral,this.historialformapagoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(HistorialFormaPago.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",HistorialFormaPago.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,HistorialFormaPagoConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			HistorialFormaPago historialformapagoLocal=null;
			
			if(!this.getEsControlTabla()) {
				historialformapagoLocal=this.historialformapago;
			} else {
				historialformapagoLocal=this.historialformapagoAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,HistorialFormaPagoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.historialformapago);
				
				this.actualizarInformacion("INFO_PADRE",false,this.historialformapago);
				
				HistorialFormaPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.historialformapago,new Object(),this.historialformapagoParameterGeneral,this.historialformapagoReturnGeneral);
							
				
				


				
				HistorialFormaPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.historialformapago,new Object(),this.historialformapagoParameterGeneral,this.historialformapagoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(HistorialFormaPago.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",HistorialFormaPago.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,HistorialFormaPagoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaHistorialFormaPagoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosHistorialFormaPago.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.historialformapagoAnterior =(HistorialFormaPago) this.historialformapagoLogic.getHistorialFormaPagos().toArray()[this.jTableDatosHistorialFormaPago.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.historialformapagoAnterior =(HistorialFormaPago) this.historialformapagos.toArray()[this.jTableDatosHistorialFormaPago.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,HistorialFormaPagoConstantesFunciones.CLASSNAME);
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
			
			HistorialFormaPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.historialformapago,new Object(),this.historialformapagoParameterGeneral,this.historialformapagoReturnGeneral);
			
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
			
			


			
			HistorialFormaPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.historialformapago,new Object(),this.historialformapagoParameterGeneral,this.historialformapagoReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,HistorialFormaPagoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,HistorialFormaPagoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,HistorialFormaPagoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaHistorialFormaPagoActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.historialformapago);
				
				this.actualizarInformacion("INFO_PADRE",false,this.historialformapago);
				
				HistorialFormaPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.historialformapago,new Object(),this.historialformapagoParameterGeneral,this.historialformapagoReturnGeneral);
								
						
				


				
				HistorialFormaPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.historialformapago,new Object(),this.historialformapagoParameterGeneral,this.historialformapagoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(HistorialFormaPago.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",HistorialFormaPago.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,HistorialFormaPagoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.historialformapago);
				
				this.actualizarInformacion("INFO_PADRE",false,this.historialformapago);
				
				HistorialFormaPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.historialformapago,new Object(),this.historialformapagoParameterGeneral,this.historialformapagoReturnGeneral);
								
				
				


				
				HistorialFormaPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.historialformapago,new Object(),this.historialformapagoParameterGeneral,this.historialformapagoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(HistorialFormaPago.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",HistorialFormaPago.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,HistorialFormaPagoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaHistorialFormaPagoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosHistorialFormaPago.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.historialformapagoAnterior =(HistorialFormaPago) this.historialformapagoLogic.getHistorialFormaPagos().toArray()[this.jTableDatosHistorialFormaPago.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.historialformapagoAnterior =(HistorialFormaPago) this.historialformapagos.toArray()[this.jTableDatosHistorialFormaPago.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,HistorialFormaPagoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.historialformapago);
				
				this.actualizarInformacion("INFO_PADRE",false,this.historialformapago);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,HistorialFormaPagoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaHistorialFormaPagoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosHistorialFormaPago.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.historialformapagoAnterior =(HistorialFormaPago) this.historialformapagoLogic.getHistorialFormaPagos().toArray()[this.jTableDatosHistorialFormaPago.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.historialformapagoAnterior =(HistorialFormaPago) this.historialformapagos.toArray()[this.jTableDatosHistorialFormaPago.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,HistorialFormaPagoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaHistorialFormaPagoActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.historialformapago);
			
			this.actualizarInformacion("INFO_PADRE",false,this.historialformapago);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,HistorialFormaPagoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.historialformapago);
				
				this.actualizarInformacion("INFO_PADRE",false,this.historialformapago);
				
				HistorialFormaPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.historialformapago,new Object(),this.historialformapagoParameterGeneral,this.historialformapagoReturnGeneral);
							
				
				


				
				HistorialFormaPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.historialformapago,new Object(),this.historialformapagoParameterGeneral,this.historialformapagoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(HistorialFormaPago.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",HistorialFormaPago.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,HistorialFormaPagoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaHistorialFormaPagoActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosHistorialFormaPago.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.historialformapagoAnterior =(HistorialFormaPago) this.historialformapagoLogic.getHistorialFormaPagos().toArray()[this.jTableDatosHistorialFormaPago.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.historialformapagoAnterior =(HistorialFormaPago) this.historialformapagos.toArray()[this.jTableDatosHistorialFormaPago.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,HistorialFormaPagoConstantesFunciones.CLASSNAME);
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
			
			HistorialFormaPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.historialformapago,new Object(),this.historialformapagoParameterGeneral,this.historialformapagoReturnGeneral);
			
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
			
			


			
			HistorialFormaPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.historialformapago,new Object(),this.historialformapagoParameterGeneral,this.historialformapagoReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,HistorialFormaPagoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,HistorialFormaPagoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,HistorialFormaPagoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaHistorialFormaPagoActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.historialformapago);
			
			this.actualizarInformacion("INFO_PADRE",false,this.historialformapago);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,HistorialFormaPagoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.historialformapago);
				
				this.actualizarInformacion("INFO_PADRE",false,this.historialformapago);
				
				HistorialFormaPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.historialformapago,new Object(),this.historialformapagoParameterGeneral,this.historialformapagoReturnGeneral);
								
				
				


				
				HistorialFormaPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.historialformapago,new Object(),this.historialformapagoParameterGeneral,this.historialformapagoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(HistorialFormaPago.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",HistorialFormaPago.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,HistorialFormaPagoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaHistorialFormaPagoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosHistorialFormaPago.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.historialformapagoAnterior =(HistorialFormaPago) this.historialformapagoLogic.getHistorialFormaPagos().toArray()[this.jTableDatosHistorialFormaPago.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.historialformapagoAnterior =(HistorialFormaPago) this.historialformapagos.toArray()[this.jTableDatosHistorialFormaPago.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,HistorialFormaPagoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaHistorialFormaPagoActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.historialformapago);
			
			this.actualizarInformacion("INFO_PADRE",false,this.historialformapago);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,HistorialFormaPagoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaHistorialFormaPagoActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.historialformapago);
				
				this.actualizarInformacion("INFO_PADRE",false,this.historialformapago);
				
				HistorialFormaPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.historialformapago,new Object(),this.historialformapagoParameterGeneral,this.historialformapagoReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosHistorialFormaPago")) {
					jCheckBoxSeleccionarTodosHistorialFormaPagoItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosHistorialFormaPago")) {
					jCheckBoxSeleccionadosHistorialFormaPagoItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarHistorialFormaPago")) {
					
				}
				
				


				
				
				HistorialFormaPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.historialformapago,new Object(),this.historialformapagoParameterGeneral,this.historialformapagoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(HistorialFormaPago.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",HistorialFormaPago.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,HistorialFormaPagoConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.historialformapago);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.historialformapago);
				
				HistorialFormaPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.historialformapago,new Object(),this.historialformapagoParameterGeneral,this.historialformapagoReturnGeneral);
												
				
				


				
				
				HistorialFormaPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.historialformapago,new Object(),this.historialformapagoParameterGeneral,this.historialformapagoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(HistorialFormaPago.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",HistorialFormaPago.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,HistorialFormaPagoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaHistorialFormaPagoActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosHistorialFormaPago.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.historialformapagoAnterior =(HistorialFormaPago) this.historialformapagoLogic.getHistorialFormaPagos().toArray()[this.jTableDatosHistorialFormaPago.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.historialformapagoAnterior =(HistorialFormaPago) this.historialformapagos.toArray()[this.jTableDatosHistorialFormaPago.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,HistorialFormaPagoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaHistorialFormaPagoActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.historialformapago);
				
				this.actualizarInformacion("INFO_PADRE",false,this.historialformapago);
				
				HistorialFormaPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.historialformapago,new Object(),this.historialformapagoParameterGeneral,this.historialformapagoReturnGeneral);
				
				
				HistorialFormaPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.historialformapago,new Object(),this.historialformapagoParameterGeneral,this.historialformapagoReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,HistorialFormaPagoConstantesFunciones.CLASSNAME);
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
			
			HistorialFormaPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.historialformapago,new Object(),this.historialformapagoParameterGeneral,this.historialformapagoReturnGeneral);
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
			
			


			
			HistorialFormaPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.historialformapago,new Object(),this.historialformapagoParameterGeneral,this.historialformapagoReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,HistorialFormaPagoConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaHistorialFormaPagoActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.historialformapago);
				
				this.actualizarInformacion("INFO_PADRE",false,this.historialformapago);
				
				HistorialFormaPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.historialformapago,new Object(),this.historialformapagoParameterGeneral,this.historialformapagoReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				HistorialFormaPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.historialformapago,new Object(),this.historialformapagoParameterGeneral,this.historialformapagoReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(HistorialFormaPago.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",HistorialFormaPago.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,HistorialFormaPagoConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.historialformapago);
				
				this.actualizarInformacion("INFO_PADRE",false,this.historialformapago);
				
				HistorialFormaPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.historialformapago,new Object(),this.historialformapagoParameterGeneral,this.historialformapagoReturnGeneral);
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
				
				


				
				HistorialFormaPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.historialformapago,new Object(),this.historialformapagoParameterGeneral,this.historialformapagoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(HistorialFormaPago.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",HistorialFormaPago.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,HistorialFormaPagoConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaHistorialFormaPagoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosHistorialFormaPago.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.historialformapagoAnterior =(HistorialFormaPago) this.historialformapagoLogic.getHistorialFormaPagos().toArray()[this.jTableDatosHistorialFormaPago.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.historialformapagoAnterior =(HistorialFormaPago) this.historialformapagos.toArray()[this.jTableDatosHistorialFormaPago.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,HistorialFormaPagoConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				HistorialFormaPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.historialformapago,new Object(),this.historialformapagoParameterGeneral,this.historialformapagoReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarHistorialFormaPago")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosHistorialFormaPagoListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosHistorialFormaPago.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.historialformapago =(HistorialFormaPago) this.historialformapagoLogic.getHistorialFormaPagos().toArray()[this.jTableDatosHistorialFormaPago.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.historialformapago =(HistorialFormaPago) this.historialformapagos.toArray()[this.jTableDatosHistorialFormaPago.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.historialformapago);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarHistorialFormaPago")) {
				
				}
				
				HistorialFormaPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.historialformapago,new Object(),this.historialformapagoParameterGeneral,this.historialformapagoReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,HistorialFormaPagoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			HistorialFormaPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.historialformapago,new Object(),this.historialformapagoParameterGeneral,this.historialformapagoReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarHistorialFormaPago")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosHistorialFormaPago.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarHistorialFormaPago")) {
			
			}
			
			HistorialFormaPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.historialformapago,new Object(),this.historialformapagoParameterGeneral,this.historialformapagoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,HistorialFormaPagoConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessHistorialFormaPago();
			
			HistorialFormaPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.historialformapago,new Object(),this.historialformapagoParameterGeneral,this.historialformapagoReturnGeneral);
			
			if(sTipo.equals("NuevoHistorialFormaPago")) {
				jButtonNuevoHistorialFormaPagoActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarHistorialFormaPago")) {
				jButtonDuplicarHistorialFormaPagoActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarHistorialFormaPago")) {
				jButtonCopiarHistorialFormaPagoActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormHistorialFormaPago")) {
				jButtonVerFormHistorialFormaPagoActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesHistorialFormaPago")) {
				jButtonNuevoHistorialFormaPagoActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarHistorialFormaPago")) {
				jButtonModificarHistorialFormaPagoActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarHistorialFormaPago")) {
				jButtonActualizarHistorialFormaPagoActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarHistorialFormaPago")) {
				jButtonEliminarHistorialFormaPagoActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaHistorialFormaPago")) {
				jButtonGuardarCambiosHistorialFormaPagoActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarHistorialFormaPago")) {
				jButtonCancelarHistorialFormaPagoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarHistorialFormaPago")) {
				jButtonCerrarHistorialFormaPagoActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosHistorialFormaPago")) {
				jButtonGuardarCambiosHistorialFormaPagoActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosHistorialFormaPago")) {
				jButtonNuevoGuardarCambiosHistorialFormaPagoActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByHistorialFormaPago")) {
				jButtonAbrirOrderByHistorialFormaPagoActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionHistorialFormaPago")) {
				jButtonRecargarInformacionHistorialFormaPagoActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresHistorialFormaPago")) {
				jButtonAnterioresHistorialFormaPagoActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesHistorialFormaPago")) {
				jButtonSiguientesHistorialFormaPagoActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idHistorialFormaPagoBusqueda")) {
				this.jButtonidHistorialFormaPagoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaHistorialFormaPagoUpdate")) {
				this.jButtonid_empresaHistorialFormaPagoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaHistorialFormaPagoBusqueda")) {
				this.jButtonid_empresaHistorialFormaPagoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalHistorialFormaPagoUpdate")) {
				this.jButtonid_sucursalHistorialFormaPagoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalHistorialFormaPagoBusqueda")) {
				this.jButtonid_sucursalHistorialFormaPagoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_ejercicioHistorialFormaPagoUpdate")) {
				this.jButtonid_ejercicioHistorialFormaPagoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_ejercicioHistorialFormaPagoBusqueda")) {
				this.jButtonid_ejercicioHistorialFormaPagoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_periodoHistorialFormaPagoUpdate")) {
				this.jButtonid_periodoHistorialFormaPagoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_periodoHistorialFormaPagoBusqueda")) {
				this.jButtonid_periodoHistorialFormaPagoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_facturaHistorialFormaPago")) {
				this.jButtonid_facturaHistorialFormaPagoActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_facturaHistorialFormaPagoUpdate")) {
				this.jButtonid_facturaHistorialFormaPagoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_facturaHistorialFormaPagoBusqueda")) {
				this.jButtonid_facturaHistorialFormaPagoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_forma_pagoHistorialFormaPagoUpdate")) {
				this.jButtonid_tipo_forma_pagoHistorialFormaPagoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_forma_pagoHistorialFormaPagoBusqueda")) {
				this.jButtonid_tipo_forma_pagoHistorialFormaPagoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_cuenta_contableHistorialFormaPago")) {
				this.jButtonid_cuenta_contableHistorialFormaPagoActionPerformed(evt);
			}
			//BUSQUEDA ARBOL CAMPO
			else if(sTipo.equals("id_cuenta_contableHistorialFormaPagoArbol")) {
				this.abrirFrameTreeCuentaContable("BUSQUEDA_FK");
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_cuenta_contableHistorialFormaPagoUpdate")) {
				this.jButtonid_cuenta_contableHistorialFormaPagoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_cuenta_contableHistorialFormaPagoBusqueda")) {
				this.jButtonid_cuenta_contableHistorialFormaPagoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_diasHistorialFormaPagoBusqueda")) {
				this.jButtonnumero_diasHistorialFormaPagoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("valorHistorialFormaPagoBusqueda")) {
				this.jButtonvalorHistorialFormaPagoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fechaHistorialFormaPagoBusqueda")) {
				this.jButtonfechaHistorialFormaPagoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("porcentajeHistorialFormaPagoBusqueda")) {
				this.jButtonporcentajeHistorialFormaPagoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("porcentaje_retencionHistorialFormaPagoBusqueda")) {
				this.jButtonporcentaje_retencionHistorialFormaPagoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("base_retencionHistorialFormaPagoBusqueda")) {
				this.jButtonbase_retencionHistorialFormaPagoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_retencionHistorialFormaPagoBusqueda")) {
				this.jButtonnumero_retencionHistorialFormaPagoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_retencionHistorialFormaPagoBusqueda")) {
				this.jButtonnombre_retencionHistorialFormaPagoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_anioHistorialFormaPagoUpdate")) {
				this.jButtonid_anioHistorialFormaPagoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_anioHistorialFormaPagoBusqueda")) {
				this.jButtonid_anioHistorialFormaPagoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_mesHistorialFormaPagoUpdate")) {
				this.jButtonid_mesHistorialFormaPagoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_mesHistorialFormaPagoBusqueda")) {
				this.jButtonid_mesHistorialFormaPagoBusquedaActionPerformed(evt);
			}
			
			HistorialFormaPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.historialformapago,new Object(),this.historialformapagoParameterGeneral,this.historialformapagoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,HistorialFormaPagoConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessHistorialFormaPago();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			HistorialFormaPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.historialformapago,new Object(),this.historialformapagoParameterGeneral,this.historialformapagoReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameHistorialFormaPago")) {
				closingInternalFrameHistorialFormaPago();
				
			} else if(sTipo.equals("jButtonCancelarHistorialFormaPago")) {
				JInternalFrameBase jInternalFrameDetalleFormHistorialFormaPago = (JInternalFrameBase)evt.getSource();
	            	
	            HistorialFormaPagoBeanSwingJInternalFrame jInternalFrameParent=(HistorialFormaPagoBeanSwingJInternalFrame)jInternalFrameDetalleFormHistorialFormaPago.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarHistorialFormaPagoActionPerformed(null);
			}
			
			HistorialFormaPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.historialformapago,new Object(),this.historialformapagoParameterGeneral,this.historialformapagoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,HistorialFormaPagoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormHistorialFormaPago(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormHistorialFormaPago(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormHistorialFormaPago(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.historialformapago)) {
			if(!esControlTabla) {
				if(HistorialFormaPagoJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualHistorialFormaPago(this.historialformapago,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysHistorialFormaPago(this.historialformapago);			
				}
				
				if(this.historialformapagoSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualHistorialFormaPago(this.historialformapago,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.historialformapagoReturnGeneral=historialformapagoLogic.procesarEventosHistorialFormaPagosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.historialformapagoLogic.getHistorialFormaPagos(),this.historialformapago,this.historialformapagoParameterGeneral,this.isEsNuevoHistorialFormaPago,classes);//this.historialformapagoLogic.getHistorialFormaPago()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanHistorialFormaPago(this.historialformapagoReturnGeneral,this.historialformapagoBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.historialformapagoSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanHistorialFormaPago(classes,this.historialformapagoReturnGeneral,this.historialformapagoBean,false);
					}
						
					if(this.historialformapagoReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyHistorialFormaPago(this.historialformapagoReturnGeneral.getHistorialFormaPago());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioHistorialFormaPago(this.historialformapagoReturnGeneral.getHistorialFormaPago());	
					}
						
					if(this.historialformapagoReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioHistorialFormaPago(this.historialformapagoReturnGeneral.getHistorialFormaPago(),classes);//this.historialformapagoBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioHistorialFormaPago(this.historialformapago,classes);//this.historialformapagoBean);									
				}
			
				if(HistorialFormaPagoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualHistorialFormaPago(this.historialformapago,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysHistorialFormaPago(this.historialformapago);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.historialformapagoAnterior!=null) {
						this.historialformapago=this.historialformapagoAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.historialformapagoReturnGeneral=historialformapagoLogic.procesarEventosHistorialFormaPagosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.historialformapagoLogic.getHistorialFormaPagos(),this.historialformapago,this.historialformapagoParameterGeneral,this.isEsNuevoHistorialFormaPago,classes);//this.historialformapagoLogic.getHistorialFormaPago()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.historialformapagoSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.historialformapagoSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.historialformapagoReturnGeneral.getHistorialFormaPago(),historialformapagoLogic.getHistorialFormaPagos());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.historialformapagoReturnGeneral.getHistorialFormaPago(),this.historialformapagos);
				}
				//ARCHITECTURE
				
				//this.jTableDatosHistorialFormaPago.repaint();
				
				//((AbstractTableModel) this.jTableDatosHistorialFormaPago.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosHistorialFormaPago();
			}
		}
	}
	
	public void actualizarVisualTableDatosHistorialFormaPago() throws Exception {
		
		HistorialFormaPagoModel historialformapagoModel=(HistorialFormaPagoModel)this.jTableDatosHistorialFormaPago.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			historialformapagoModel.historialformapagos=this.historialformapagoLogic.getHistorialFormaPagos();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			historialformapagoModel.historialformapagos=this.historialformapagos;
		}
		
		
		((HistorialFormaPagoModel) this.jTableDatosHistorialFormaPago.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaHistorialFormaPago() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.gethistorialformapagoAnterior(),this.historialformapagoLogic.getHistorialFormaPagos());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.gethistorialformapagoAnterior(),this.historialformapagos);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosHistorialFormaPago();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioHistorialFormaPago(HistorialFormaPago historialformapago,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,HistorialFormaPagoConstantesFunciones.CLASSNAME);
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
										
				HistorialFormaPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.historialformapago,new Object(),generalEntityParameterGeneral,this.historialformapagoReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.historialformapagoSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=HistorialFormaPagoConstantesFunciones.getClassesRelationshipsOfHistorialFormaPago(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=HistorialFormaPagoConstantesFunciones.getClassesRelationshipsFromStringsOfHistorialFormaPago(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormHistorialFormaPago(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				HistorialFormaPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.historialformapago,new Object(),generalEntityParameterGeneral,this.historialformapagoReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,HistorialFormaPagoConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioHistorialFormaPago(HistorialFormaPagoBean historialformapagoBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,HistorialFormaPagoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanHistorialFormaPago(ArrayList<Classe> classes,HistorialFormaPagoReturnGeneral historialformapagoReturnGeneral,HistorialFormaPagoBean historialformapagoBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualHistorialFormaPago(HistorialFormaPago historialformapago,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.historialformapago)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormHistorialFormaPago = new HistorialFormaPagoDetalleFormJInternalFrame(jDesktopPane,this.historialformapagoSessionBean.getConGuardarRelaciones(),this.historialformapagoSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormHistorialFormaPago);
		this.jInternalFrameDetalleFormHistorialFormaPago.setVisible(false);
		this.jInternalFrameDetalleFormHistorialFormaPago.setSelected(false);						
		
		this.jInternalFrameDetalleFormHistorialFormaPago.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormHistorialFormaPago.historialformapagoLogic=this.historialformapagoLogic;
		
		this.cargarCombosFrameForeignKeyHistorialFormaPago("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleHistorialFormaPago();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleHistorialFormaPago();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyHistorialFormaPago("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyHistorialFormaPago();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormHistorialFormaPago.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarHistorialFormaPago"));
		
		this.jInternalFrameDetalleFormHistorialFormaPago.jButtonModificarHistorialFormaPago.addActionListener(new ButtonActionListener(this,"ModificarHistorialFormaPago"));

		
		this.jInternalFrameDetalleFormHistorialFormaPago.jButtonModificarToolBarHistorialFormaPago.addActionListener(new ButtonActionListener(this,"ModificarToolBarHistorialFormaPago"));
					
		this.jInternalFrameDetalleFormHistorialFormaPago.jMenuItemModificarHistorialFormaPago.addActionListener(new ButtonActionListener(this,"MenuItemModificarHistorialFormaPago"));		
		
		
		
		this.jInternalFrameDetalleFormHistorialFormaPago.jButtonActualizarHistorialFormaPago.addActionListener (new ButtonActionListener(this,"ActualizarHistorialFormaPago"));
		
		
		this.jInternalFrameDetalleFormHistorialFormaPago.jButtonActualizarToolBarHistorialFormaPago.addActionListener(new ButtonActionListener(this,"ActualizarToolBarHistorialFormaPago"));
						
		this.jInternalFrameDetalleFormHistorialFormaPago.jMenuItemActualizarHistorialFormaPago.addActionListener (new ButtonActionListener(this,"MenuItemActualizarHistorialFormaPago"));		
		
		
		
		this.jInternalFrameDetalleFormHistorialFormaPago.jButtonEliminarHistorialFormaPago.addActionListener (new ButtonActionListener(this,"EliminarHistorialFormaPago"));
		
		
		this.jInternalFrameDetalleFormHistorialFormaPago.jButtonEliminarToolBarHistorialFormaPago.addActionListener (new ButtonActionListener(this,"EliminarToolBarHistorialFormaPago"));
								
		this.jInternalFrameDetalleFormHistorialFormaPago.jMenuItemEliminarHistorialFormaPago.addActionListener (new ButtonActionListener(this,"MenuItemEliminarHistorialFormaPago"));		
		
		
		
		this.jInternalFrameDetalleFormHistorialFormaPago.jButtonCancelarHistorialFormaPago.addActionListener (new ButtonActionListener(this,"CancelarHistorialFormaPago"));
		
		
		this.jInternalFrameDetalleFormHistorialFormaPago.jButtonCancelarToolBarHistorialFormaPago.addActionListener (new ButtonActionListener(this,"CancelarToolBarHistorialFormaPago"));
					
		this.jInternalFrameDetalleFormHistorialFormaPago.jMenuItemCancelarHistorialFormaPago.addActionListener (new ButtonActionListener(this,"MenuItemCancelarHistorialFormaPago"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormHistorialFormaPago.jMenuItemDetalleCerrarHistorialFormaPago.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarHistorialFormaPago"));		
		
		
		
		this.jInternalFrameDetalleFormHistorialFormaPago.jButtonGuardarCambiosToolBarHistorialFormaPago.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarHistorialFormaPago"));
		
		
		
		this.jInternalFrameDetalleFormHistorialFormaPago.jButtonGuardarCambiosToolBarHistorialFormaPago.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarHistorialFormaPago"));
		
		
		
		this.jInternalFrameDetalleFormHistorialFormaPago.jComboBoxTiposAccionesFormularioHistorialFormaPago.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioHistorialFormaPago"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormHistorialFormaPago.jButtonidHistorialFormaPagoBusqueda.addActionListener(new ButtonActionListener(this,"idHistorialFormaPagoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormHistorialFormaPago.jButtonid_empresaHistorialFormaPagoUpdate.addActionListener(new ButtonActionListener(this,"id_empresaHistorialFormaPagoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormHistorialFormaPago.jButtonid_empresaHistorialFormaPagoBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaHistorialFormaPagoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormHistorialFormaPago.jButtonid_sucursalHistorialFormaPagoUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalHistorialFormaPagoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormHistorialFormaPago.jButtonid_sucursalHistorialFormaPagoBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalHistorialFormaPagoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormHistorialFormaPago.jButtonid_ejercicioHistorialFormaPagoUpdate.addActionListener(new ButtonActionListener(this,"id_ejercicioHistorialFormaPagoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormHistorialFormaPago.jButtonid_ejercicioHistorialFormaPagoBusqueda.addActionListener(new ButtonActionListener(this,"id_ejercicioHistorialFormaPagoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormHistorialFormaPago.jButtonid_periodoHistorialFormaPagoUpdate.addActionListener(new ButtonActionListener(this,"id_periodoHistorialFormaPagoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormHistorialFormaPago.jButtonid_periodoHistorialFormaPagoBusqueda.addActionListener(new ButtonActionListener(this,"id_periodoHistorialFormaPagoBusqueda"));
		//jButtonid_facturaHistorialFormaPago.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_facturaHistorialFormaPagoActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormHistorialFormaPago.jButtonid_facturaHistorialFormaPago.addActionListener(new ButtonActionListener(this,"id_facturaHistorialFormaPago"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormHistorialFormaPago.jButtonid_facturaHistorialFormaPagoUpdate.addActionListener(new ButtonActionListener(this,"id_facturaHistorialFormaPagoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormHistorialFormaPago.jButtonid_facturaHistorialFormaPagoBusqueda.addActionListener(new ButtonActionListener(this,"id_facturaHistorialFormaPagoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormHistorialFormaPago.jButtonid_tipo_forma_pagoHistorialFormaPagoUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_forma_pagoHistorialFormaPagoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormHistorialFormaPago.jButtonid_tipo_forma_pagoHistorialFormaPagoBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_forma_pagoHistorialFormaPagoBusqueda"));
		//jButtonid_cuenta_contableHistorialFormaPago.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_cuenta_contableHistorialFormaPagoActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormHistorialFormaPago.jButtonid_cuenta_contableHistorialFormaPago.addActionListener(new ButtonActionListener(this,"id_cuenta_contableHistorialFormaPago"));
		//jButtonid_cuenta_contableHistorialFormaPagoArbol.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			abrirFrameTreeCuentaContable("BUSQUEDA_FK");
		//		}
		//	}
		//);

		//BUSQUEDA ARBOL CAMPO
		this.jInternalFrameDetalleFormHistorialFormaPago.jButtonid_cuenta_contableHistorialFormaPagoArbol.addActionListener(new ButtonActionListener(this,"id_cuenta_contableHistorialFormaPagoArbol"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormHistorialFormaPago.jButtonid_cuenta_contableHistorialFormaPagoUpdate.addActionListener(new ButtonActionListener(this,"id_cuenta_contableHistorialFormaPagoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormHistorialFormaPago.jButtonid_cuenta_contableHistorialFormaPagoBusqueda.addActionListener(new ButtonActionListener(this,"id_cuenta_contableHistorialFormaPagoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormHistorialFormaPago.jButtonnumero_diasHistorialFormaPagoBusqueda.addActionListener(new ButtonActionListener(this,"numero_diasHistorialFormaPagoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormHistorialFormaPago.jButtonvalorHistorialFormaPagoBusqueda.addActionListener(new ButtonActionListener(this,"valorHistorialFormaPagoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormHistorialFormaPago.jButtonfechaHistorialFormaPagoBusqueda.addActionListener(new ButtonActionListener(this,"fechaHistorialFormaPagoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormHistorialFormaPago.jButtonporcentajeHistorialFormaPagoBusqueda.addActionListener(new ButtonActionListener(this,"porcentajeHistorialFormaPagoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormHistorialFormaPago.jButtonporcentaje_retencionHistorialFormaPagoBusqueda.addActionListener(new ButtonActionListener(this,"porcentaje_retencionHistorialFormaPagoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormHistorialFormaPago.jButtonbase_retencionHistorialFormaPagoBusqueda.addActionListener(new ButtonActionListener(this,"base_retencionHistorialFormaPagoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormHistorialFormaPago.jButtonnumero_retencionHistorialFormaPagoBusqueda.addActionListener(new ButtonActionListener(this,"numero_retencionHistorialFormaPagoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormHistorialFormaPago.jButtonnombre_retencionHistorialFormaPagoBusqueda.addActionListener(new ButtonActionListener(this,"nombre_retencionHistorialFormaPagoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormHistorialFormaPago.jButtonid_anioHistorialFormaPagoUpdate.addActionListener(new ButtonActionListener(this,"id_anioHistorialFormaPagoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormHistorialFormaPago.jButtonid_anioHistorialFormaPagoBusqueda.addActionListener(new ButtonActionListener(this,"id_anioHistorialFormaPagoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormHistorialFormaPago.jButtonid_mesHistorialFormaPagoUpdate.addActionListener(new ButtonActionListener(this,"id_mesHistorialFormaPagoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormHistorialFormaPago.jButtonid_mesHistorialFormaPagoBusqueda.addActionListener(new ButtonActionListener(this,"id_mesHistorialFormaPagoBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormHistorialFormaPago.jTabbedPaneRelacionesHistorialFormaPago.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesHistorialFormaPago"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameHistorialFormaPago"));
		
		if(this.jInternalFrameDetalleFormHistorialFormaPago!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormHistorialFormaPago.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarHistorialFormaPago"));
		}
		
		this.jTableDatosHistorialFormaPago.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarHistorialFormaPago"));
		
		this.jTableDatosHistorialFormaPago.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarHistorialFormaPago"));
		
		this.jButtonNuevoHistorialFormaPago.addActionListener(new ButtonActionListener(this,"NuevoHistorialFormaPago"));
		
		this.jButtonDuplicarHistorialFormaPago.addActionListener(new ButtonActionListener(this,"DuplicarHistorialFormaPago"));
		
		this.jButtonCopiarHistorialFormaPago.addActionListener(new ButtonActionListener(this,"CopiarHistorialFormaPago"));
		
		this.jButtonVerFormHistorialFormaPago.addActionListener(new ButtonActionListener(this,"VerFormHistorialFormaPago"));
		
		
		this.jButtonNuevoToolBarHistorialFormaPago.addActionListener(new ButtonActionListener(this,"NuevoToolBarHistorialFormaPago"));
			
		this.jButtonDuplicarToolBarHistorialFormaPago.addActionListener(new ButtonActionListener(this,"DuplicarToolBarHistorialFormaPago"));
			
		this.jMenuItemNuevoHistorialFormaPago.addActionListener (new ButtonActionListener(this,"MenuItemNuevoHistorialFormaPago"));
			
		this.jMenuItemDuplicarHistorialFormaPago.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarHistorialFormaPago"));		
		
		
		this.jButtonNuevoRelacionesHistorialFormaPago.addActionListener (new ButtonActionListener(this,"NuevoRelacionesHistorialFormaPago"));
		
		
		this.jButtonNuevoRelacionesToolBarHistorialFormaPago.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarHistorialFormaPago"));
			
		this.jMenuItemNuevoRelacionesHistorialFormaPago.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesHistorialFormaPago"));		
		
		
		if(this.jInternalFrameDetalleFormHistorialFormaPago!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormHistorialFormaPago.jButtonModificarHistorialFormaPago.addActionListener(new ButtonActionListener(this,"ModificarHistorialFormaPago"));
		}
		
		
		if(this.jInternalFrameDetalleFormHistorialFormaPago!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormHistorialFormaPago.jButtonModificarToolBarHistorialFormaPago.addActionListener(new ButtonActionListener(this,"ModificarToolBarHistorialFormaPago"));
			
			this.jInternalFrameDetalleFormHistorialFormaPago.jMenuItemModificarHistorialFormaPago.addActionListener(new ButtonActionListener(this,"MenuItemModificarHistorialFormaPago"));		
		}
		
		
		if(this.jInternalFrameDetalleFormHistorialFormaPago!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormHistorialFormaPago.jButtonActualizarHistorialFormaPago.addActionListener (new ButtonActionListener(this,"ActualizarHistorialFormaPago"));
		}
		
		
		if(this.jInternalFrameDetalleFormHistorialFormaPago!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormHistorialFormaPago.jButtonActualizarToolBarHistorialFormaPago.addActionListener(new ButtonActionListener(this,"ActualizarToolBarHistorialFormaPago"));
				
			this.jInternalFrameDetalleFormHistorialFormaPago.jMenuItemActualizarHistorialFormaPago.addActionListener (new ButtonActionListener(this,"MenuItemActualizarHistorialFormaPago"));		
		}
		
		
		if(this.jInternalFrameDetalleFormHistorialFormaPago!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormHistorialFormaPago.jButtonEliminarHistorialFormaPago.addActionListener (new ButtonActionListener(this,"EliminarHistorialFormaPago"));
		}
		
		
		if(this.jInternalFrameDetalleFormHistorialFormaPago!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormHistorialFormaPago.jButtonEliminarToolBarHistorialFormaPago.addActionListener (new ButtonActionListener(this,"EliminarToolBarHistorialFormaPago"));
						
			this.jInternalFrameDetalleFormHistorialFormaPago.jMenuItemEliminarHistorialFormaPago.addActionListener (new ButtonActionListener(this,"MenuItemEliminarHistorialFormaPago"));		
		}
		
		
		if(this.jInternalFrameDetalleFormHistorialFormaPago!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormHistorialFormaPago.jButtonCancelarHistorialFormaPago.addActionListener (new ButtonActionListener(this,"CancelarHistorialFormaPago"));
		}
		
		
		if(this.jInternalFrameDetalleFormHistorialFormaPago!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormHistorialFormaPago.jButtonCancelarToolBarHistorialFormaPago.addActionListener (new ButtonActionListener(this,"CancelarToolBarHistorialFormaPago"));
			
			this.jInternalFrameDetalleFormHistorialFormaPago.jMenuItemCancelarHistorialFormaPago.addActionListener (new ButtonActionListener(this,"MenuItemCancelarHistorialFormaPago"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarHistorialFormaPago.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarHistorialFormaPago"));		
		
		
		this.jButtonCerrarHistorialFormaPago.addActionListener (new ButtonActionListener(this,"CerrarHistorialFormaPago"));
		
		
		this.jButtonCerrarToolBarHistorialFormaPago.addActionListener (new ButtonActionListener(this,"CerrarToolBarHistorialFormaPago"));
			
		this.jMenuItemCerrarHistorialFormaPago.addActionListener (new ButtonActionListener(this,"MenuItemCerrarHistorialFormaPago"));
			
		if(this.jInternalFrameDetalleFormHistorialFormaPago!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormHistorialFormaPago.jMenuItemDetalleCerrarHistorialFormaPago.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarHistorialFormaPago"));		
		}
		
		
		if(this.jInternalFrameDetalleFormHistorialFormaPago!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormHistorialFormaPago.jButtonGuardarCambiosHistorialFormaPago.addActionListener (new ButtonActionListener(this,"GuardarCambiosHistorialFormaPago"));
		}
		
		
		if(this.jInternalFrameDetalleFormHistorialFormaPago!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormHistorialFormaPago.jButtonGuardarCambiosToolBarHistorialFormaPago.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarHistorialFormaPago"));
		}
		
		this.jButtonCopiarToolBarHistorialFormaPago.addActionListener (new ButtonActionListener(this,"CopiarToolBarHistorialFormaPago"));
			
		this.jButtonVerFormToolBarHistorialFormaPago.addActionListener (new ButtonActionListener(this,"VerFormToolBarHistorialFormaPago"));
		
		this.jMenuItemGuardarCambiosHistorialFormaPago.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosHistorialFormaPago"));
			
		this.jMenuItemCopiarHistorialFormaPago.addActionListener (new ButtonActionListener(this,"MenuItemCopiarHistorialFormaPago"));		
		
		this.jMenuItemVerFormHistorialFormaPago.addActionListener (new ButtonActionListener(this,"MenuItemVerFormHistorialFormaPago"));		
		
		
		this.jButtonGuardarCambiosTablaHistorialFormaPago.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaHistorialFormaPago"));
		
		
		this.jButtonGuardarCambiosTablaToolBarHistorialFormaPago.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarHistorialFormaPago"));
			
		this.jMenuItemGuardarCambiosTablaHistorialFormaPago.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaHistorialFormaPago"));		
		
		
		
		this.jButtonRecargarInformacionHistorialFormaPago.addActionListener (new ButtonActionListener(this,"RecargarInformacionHistorialFormaPago"));
					
		this.jButtonRecargarInformacionToolBarHistorialFormaPago.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarHistorialFormaPago"));
		
		this.jMenuItemRecargarInformacionHistorialFormaPago.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionHistorialFormaPago"));		
		
		
		
		this.jButtonAnterioresHistorialFormaPago.addActionListener (new ButtonActionListener(this,"AnterioresHistorialFormaPago"));
		
		
		this.jButtonAnterioresToolBarHistorialFormaPago.addActionListener (new ButtonActionListener(this,"AnterioresToolBarHistorialFormaPago"));
		
		this.jMenuItemAnterioresHistorialFormaPago.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresHistorialFormaPago"));		
		
		
		this.jButtonSiguientesHistorialFormaPago.addActionListener (new ButtonActionListener(this,"SiguientesHistorialFormaPago"));
		
		
		this.jButtonSiguientesToolBarHistorialFormaPago.addActionListener (new ButtonActionListener(this,"SiguientesToolBarHistorialFormaPago"));
			
		this.jMenuItemSiguientesHistorialFormaPago.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesHistorialFormaPago"));
			
		this.jMenuItemAbrirOrderByHistorialFormaPago.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByHistorialFormaPago"));
			
		this.jMenuItemMostrarOcultarHistorialFormaPago.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarHistorialFormaPago"));
			
		this.jMenuItemDetalleAbrirOrderByHistorialFormaPago.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByHistorialFormaPago"));
			
		this.jMenuItemDetalleMostarOcultarHistorialFormaPago.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarHistorialFormaPago"));		
		
		
		this.jButtonNuevoGuardarCambiosHistorialFormaPago.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosHistorialFormaPago"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarHistorialFormaPago.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarHistorialFormaPago"));
			
		this.jMenuItemNuevoGuardarCambiosHistorialFormaPago.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosHistorialFormaPago"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosHistorialFormaPago.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosHistorialFormaPago"));

		this.jCheckBoxSeleccionadosHistorialFormaPago.addItemListener(new CheckBoxItemListener(this,"SeleccionadosHistorialFormaPago"));
		
		if(this.jInternalFrameDetalleFormHistorialFormaPago!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormHistorialFormaPago.jComboBoxTiposAccionesFormularioHistorialFormaPago.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioHistorialFormaPago"));
		}
		
		
		this.jComboBoxTiposRelacionesHistorialFormaPago.addActionListener (new ButtonActionListener(this,"TiposRelacionesHistorialFormaPago"));
			
		this.jComboBoxTiposAccionesHistorialFormaPago.addActionListener (new ButtonActionListener(this,"TiposAccionesHistorialFormaPago"));
					
		this.jComboBoxTiposSeleccionarHistorialFormaPago.addActionListener (new ButtonActionListener(this,"TiposSeleccionarHistorialFormaPago"));
			
		this.jTextFieldValorCampoGeneralHistorialFormaPago.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralHistorialFormaPago"));		
		
		
		if(this.jInternalFrameDetalleFormHistorialFormaPago!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormHistorialFormaPago.jButtonidHistorialFormaPagoBusqueda.addActionListener(new ButtonActionListener(this,"idHistorialFormaPagoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormHistorialFormaPago.jButtonid_empresaHistorialFormaPagoUpdate.addActionListener(new ButtonActionListener(this,"id_empresaHistorialFormaPagoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormHistorialFormaPago.jButtonid_empresaHistorialFormaPagoBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaHistorialFormaPagoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormHistorialFormaPago.jButtonid_sucursalHistorialFormaPagoUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalHistorialFormaPagoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormHistorialFormaPago.jButtonid_sucursalHistorialFormaPagoBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalHistorialFormaPagoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormHistorialFormaPago.jButtonid_ejercicioHistorialFormaPagoUpdate.addActionListener(new ButtonActionListener(this,"id_ejercicioHistorialFormaPagoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormHistorialFormaPago.jButtonid_ejercicioHistorialFormaPagoBusqueda.addActionListener(new ButtonActionListener(this,"id_ejercicioHistorialFormaPagoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormHistorialFormaPago.jButtonid_periodoHistorialFormaPagoUpdate.addActionListener(new ButtonActionListener(this,"id_periodoHistorialFormaPagoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormHistorialFormaPago.jButtonid_periodoHistorialFormaPagoBusqueda.addActionListener(new ButtonActionListener(this,"id_periodoHistorialFormaPagoBusqueda"));
		//jButtonid_facturaHistorialFormaPago.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_facturaHistorialFormaPagoActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormHistorialFormaPago.jButtonid_facturaHistorialFormaPago.addActionListener(new ButtonActionListener(this,"id_facturaHistorialFormaPago"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormHistorialFormaPago.jButtonid_facturaHistorialFormaPagoUpdate.addActionListener(new ButtonActionListener(this,"id_facturaHistorialFormaPagoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormHistorialFormaPago.jButtonid_facturaHistorialFormaPagoBusqueda.addActionListener(new ButtonActionListener(this,"id_facturaHistorialFormaPagoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormHistorialFormaPago.jButtonid_tipo_forma_pagoHistorialFormaPagoUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_forma_pagoHistorialFormaPagoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormHistorialFormaPago.jButtonid_tipo_forma_pagoHistorialFormaPagoBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_forma_pagoHistorialFormaPagoBusqueda"));
		//jButtonid_cuenta_contableHistorialFormaPago.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_cuenta_contableHistorialFormaPagoActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormHistorialFormaPago.jButtonid_cuenta_contableHistorialFormaPago.addActionListener(new ButtonActionListener(this,"id_cuenta_contableHistorialFormaPago"));
		//jButtonid_cuenta_contableHistorialFormaPagoArbol.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			abrirFrameTreeCuentaContable("BUSQUEDA_FK");
		//		}
		//	}
		//);

		//BUSQUEDA ARBOL CAMPO
		this.jInternalFrameDetalleFormHistorialFormaPago.jButtonid_cuenta_contableHistorialFormaPagoArbol.addActionListener(new ButtonActionListener(this,"id_cuenta_contableHistorialFormaPagoArbol"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormHistorialFormaPago.jButtonid_cuenta_contableHistorialFormaPagoUpdate.addActionListener(new ButtonActionListener(this,"id_cuenta_contableHistorialFormaPagoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormHistorialFormaPago.jButtonid_cuenta_contableHistorialFormaPagoBusqueda.addActionListener(new ButtonActionListener(this,"id_cuenta_contableHistorialFormaPagoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormHistorialFormaPago.jButtonnumero_diasHistorialFormaPagoBusqueda.addActionListener(new ButtonActionListener(this,"numero_diasHistorialFormaPagoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormHistorialFormaPago.jButtonvalorHistorialFormaPagoBusqueda.addActionListener(new ButtonActionListener(this,"valorHistorialFormaPagoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormHistorialFormaPago.jButtonfechaHistorialFormaPagoBusqueda.addActionListener(new ButtonActionListener(this,"fechaHistorialFormaPagoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormHistorialFormaPago.jButtonporcentajeHistorialFormaPagoBusqueda.addActionListener(new ButtonActionListener(this,"porcentajeHistorialFormaPagoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormHistorialFormaPago.jButtonporcentaje_retencionHistorialFormaPagoBusqueda.addActionListener(new ButtonActionListener(this,"porcentaje_retencionHistorialFormaPagoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormHistorialFormaPago.jButtonbase_retencionHistorialFormaPagoBusqueda.addActionListener(new ButtonActionListener(this,"base_retencionHistorialFormaPagoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormHistorialFormaPago.jButtonnumero_retencionHistorialFormaPagoBusqueda.addActionListener(new ButtonActionListener(this,"numero_retencionHistorialFormaPagoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormHistorialFormaPago.jButtonnombre_retencionHistorialFormaPagoBusqueda.addActionListener(new ButtonActionListener(this,"nombre_retencionHistorialFormaPagoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormHistorialFormaPago.jButtonid_anioHistorialFormaPagoUpdate.addActionListener(new ButtonActionListener(this,"id_anioHistorialFormaPagoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormHistorialFormaPago.jButtonid_anioHistorialFormaPagoBusqueda.addActionListener(new ButtonActionListener(this,"id_anioHistorialFormaPagoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormHistorialFormaPago.jButtonid_mesHistorialFormaPagoUpdate.addActionListener(new ButtonActionListener(this,"id_mesHistorialFormaPagoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormHistorialFormaPago.jButtonid_mesHistorialFormaPagoBusqueda.addActionListener(new ButtonActionListener(this,"id_mesHistorialFormaPagoBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonFK_IdCuentaContableHistorialFormaPago.addActionListener(new ButtonActionListener(this,"FK_IdCuentaContableHistorialFormaPago"));

			this.jButtonBuscarFK_IdCuentaContableid_cuenta_contableHistorialFormaPago.addActionListener(new ButtonActionListener(this,"id_cuenta_contableHistorialFormaPago"));

			this.jButtonFK_IdFacturaHistorialFormaPago.addActionListener(new ButtonActionListener(this,"FK_IdFacturaHistorialFormaPago"));

			this.jButtonBuscarFK_IdFacturaid_facturaHistorialFormaPago.addActionListener(new ButtonActionListener(this,"id_facturaHistorialFormaPago"));

			this.jButtonFK_IdTipoFormaPagoHistorialFormaPago.addActionListener(new ButtonActionListener(this,"FK_IdTipoFormaPagoHistorialFormaPago"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoHistorialFormaPago!=null) {
				this.jInternalFrameReporteDinamicoHistorialFormaPago.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoHistorialFormaPago"));
				this.jInternalFrameReporteDinamicoHistorialFormaPago.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoHistorialFormaPago"));
				this.jInternalFrameReporteDinamicoHistorialFormaPago.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoHistorialFormaPago"));
			}
			
			//this.jButtonCerrarReporteDinamicoHistorialFormaPago.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoHistorialFormaPago"));				
			//this.jButtonGenerarReporteDinamicoHistorialFormaPago.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoHistorialFormaPago"));
			//this.jButtonGenerarExcelReporteDinamicoHistorialFormaPago.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoHistorialFormaPago"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionHistorialFormaPago!=null) {
				this.jInternalFrameImportacionHistorialFormaPago.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionHistorialFormaPago"));
				this.jInternalFrameImportacionHistorialFormaPago.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionHistorialFormaPago"));
				this.jInternalFrameImportacionHistorialFormaPago.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionHistorialFormaPago"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByHistorialFormaPago.addActionListener (new ButtonActionListener(this,"AbrirOrderByHistorialFormaPago"));
			
			this.jButtonAbrirOrderByToolBarHistorialFormaPago.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarHistorialFormaPago"));			
			
			if(this.jInternalFrameOrderByHistorialFormaPago!=null) {
				this.jInternalFrameOrderByHistorialFormaPago.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByHistorialFormaPago"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormHistorialFormaPago!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormHistorialFormaPago!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormHistorialFormaPago.jTabbedPaneRelacionesHistorialFormaPago.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesHistorialFormaPago"));
		
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
            		closingInternalFrameHistorialFormaPago();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormHistorialFormaPago.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormHistorialFormaPago = (JInternalFrameBase)event.getSource();
	            	
	            HistorialFormaPagoBeanSwingJInternalFrame jInternalFrameParent=(HistorialFormaPagoBeanSwingJInternalFrame)jInternalFrameDetalleFormHistorialFormaPago.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarHistorialFormaPagoActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosHistorialFormaPago.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosHistorialFormaPagoListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosHistorialFormaPago.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosHistorialFormaPago.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoHistorialFormaPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoHistorialFormaPagoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarHistorialFormaPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoHistorialFormaPagoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoHistorialFormaPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoHistorialFormaPagoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoHistorialFormaPago";
		inputMap = this.jButtonNuevoHistorialFormaPago.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoHistorialFormaPago.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoHistorialFormaPagoActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesHistorialFormaPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoHistorialFormaPagoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarHistorialFormaPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoHistorialFormaPagoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesHistorialFormaPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoHistorialFormaPagoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesHistorialFormaPago";
		inputMap = this.jButtonNuevoRelacionesHistorialFormaPago.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesHistorialFormaPago.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoHistorialFormaPagoActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarHistorialFormaPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarHistorialFormaPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarHistorialFormaPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarHistorialFormaPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarHistorialFormaPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarHistorialFormaPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarHistorialFormaPago";
		inputMap = this.jButtonModificarHistorialFormaPago.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarHistorialFormaPago.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarHistorialFormaPagoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarHistorialFormaPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarHistorialFormaPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarHistorialFormaPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarHistorialFormaPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarHistorialFormaPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarHistorialFormaPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarHistorialFormaPago";
		inputMap = this.jButtonActualizarHistorialFormaPago.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarHistorialFormaPago.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarHistorialFormaPagoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarHistorialFormaPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarHistorialFormaPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarHistorialFormaPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarHistorialFormaPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarHistorialFormaPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarHistorialFormaPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarHistorialFormaPago";
		inputMap = this.jButtonEliminarHistorialFormaPago.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarHistorialFormaPago.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarHistorialFormaPagoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarHistorialFormaPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarHistorialFormaPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarHistorialFormaPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarHistorialFormaPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarHistorialFormaPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarHistorialFormaPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarHistorialFormaPago";
		inputMap = this.jButtonCancelarHistorialFormaPago.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarHistorialFormaPago.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarHistorialFormaPagoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarHistorialFormaPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarHistorialFormaPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarHistorialFormaPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarHistorialFormaPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarHistorialFormaPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarHistorialFormaPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarHistorialFormaPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarHistorialFormaPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarHistorialFormaPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarHistorialFormaPago";
		inputMap = this.jButtonCerrarHistorialFormaPago.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarHistorialFormaPago.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarHistorialFormaPagoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormHistorialFormaPago.jButtonGuardarCambiosHistorialFormaPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosHistorialFormaPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarHistorialFormaPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosHistorialFormaPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosHistorialFormaPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosHistorialFormaPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaHistorialFormaPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosHistorialFormaPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarHistorialFormaPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosHistorialFormaPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaHistorialFormaPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosHistorialFormaPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosHistorialFormaPago";
		inputMap = this.jInternalFrameDetalleFormHistorialFormaPago.jButtonGuardarCambiosHistorialFormaPago.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormHistorialFormaPago.jButtonGuardarCambiosHistorialFormaPago.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosHistorialFormaPagoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionHistorialFormaPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionHistorialFormaPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarHistorialFormaPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionHistorialFormaPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionHistorialFormaPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionHistorialFormaPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresHistorialFormaPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresHistorialFormaPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarHistorialFormaPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresHistorialFormaPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresHistorialFormaPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresHistorialFormaPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesHistorialFormaPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesHistorialFormaPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarHistorialFormaPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesHistorialFormaPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesHistorialFormaPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesHistorialFormaPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosHistorialFormaPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosHistorialFormaPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarHistorialFormaPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosHistorialFormaPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosHistorialFormaPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosHistorialFormaPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosHistorialFormaPago.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosHistorialFormaPagoItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesHistorialFormaPago.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesHistorialFormaPagoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarHistorialFormaPago.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarHistorialFormaPagoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralHistorialFormaPago.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralHistorialFormaPagoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormHistorialFormaPago.jButtonidHistorialFormaPagoBusqueda.addActionListener(new ButtonActionListener(this,"idHistorialFormaPagoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormHistorialFormaPago.jButtonid_empresaHistorialFormaPagoUpdate.addActionListener(new ButtonActionListener(this,"id_empresaHistorialFormaPagoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormHistorialFormaPago.jButtonid_empresaHistorialFormaPagoBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaHistorialFormaPagoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormHistorialFormaPago.jButtonid_sucursalHistorialFormaPagoUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalHistorialFormaPagoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormHistorialFormaPago.jButtonid_sucursalHistorialFormaPagoBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalHistorialFormaPagoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormHistorialFormaPago.jButtonid_ejercicioHistorialFormaPagoUpdate.addActionListener(new ButtonActionListener(this,"id_ejercicioHistorialFormaPagoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormHistorialFormaPago.jButtonid_ejercicioHistorialFormaPagoBusqueda.addActionListener(new ButtonActionListener(this,"id_ejercicioHistorialFormaPagoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormHistorialFormaPago.jButtonid_periodoHistorialFormaPagoUpdate.addActionListener(new ButtonActionListener(this,"id_periodoHistorialFormaPagoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormHistorialFormaPago.jButtonid_periodoHistorialFormaPagoBusqueda.addActionListener(new ButtonActionListener(this,"id_periodoHistorialFormaPagoBusqueda"));
		//jButtonid_facturaHistorialFormaPago.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_facturaHistorialFormaPagoActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormHistorialFormaPago.jButtonid_facturaHistorialFormaPago.addActionListener(new ButtonActionListener(this,"id_facturaHistorialFormaPago"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormHistorialFormaPago.jButtonid_facturaHistorialFormaPagoUpdate.addActionListener(new ButtonActionListener(this,"id_facturaHistorialFormaPagoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormHistorialFormaPago.jButtonid_facturaHistorialFormaPagoBusqueda.addActionListener(new ButtonActionListener(this,"id_facturaHistorialFormaPagoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormHistorialFormaPago.jButtonid_tipo_forma_pagoHistorialFormaPagoUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_forma_pagoHistorialFormaPagoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormHistorialFormaPago.jButtonid_tipo_forma_pagoHistorialFormaPagoBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_forma_pagoHistorialFormaPagoBusqueda"));
		//jButtonid_cuenta_contableHistorialFormaPago.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_cuenta_contableHistorialFormaPagoActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormHistorialFormaPago.jButtonid_cuenta_contableHistorialFormaPago.addActionListener(new ButtonActionListener(this,"id_cuenta_contableHistorialFormaPago"));
		//jButtonid_cuenta_contableHistorialFormaPagoArbol.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			abrirFrameTreeCuentaContable("BUSQUEDA_FK");
		//		}
		//	}
		//);

		//BUSQUEDA ARBOL CAMPO
		this.jInternalFrameDetalleFormHistorialFormaPago.jButtonid_cuenta_contableHistorialFormaPagoArbol.addActionListener(new ButtonActionListener(this,"id_cuenta_contableHistorialFormaPagoArbol"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormHistorialFormaPago.jButtonid_cuenta_contableHistorialFormaPagoUpdate.addActionListener(new ButtonActionListener(this,"id_cuenta_contableHistorialFormaPagoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormHistorialFormaPago.jButtonid_cuenta_contableHistorialFormaPagoBusqueda.addActionListener(new ButtonActionListener(this,"id_cuenta_contableHistorialFormaPagoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormHistorialFormaPago.jButtonnumero_diasHistorialFormaPagoBusqueda.addActionListener(new ButtonActionListener(this,"numero_diasHistorialFormaPagoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormHistorialFormaPago.jButtonvalorHistorialFormaPagoBusqueda.addActionListener(new ButtonActionListener(this,"valorHistorialFormaPagoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormHistorialFormaPago.jButtonfechaHistorialFormaPagoBusqueda.addActionListener(new ButtonActionListener(this,"fechaHistorialFormaPagoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormHistorialFormaPago.jButtonporcentajeHistorialFormaPagoBusqueda.addActionListener(new ButtonActionListener(this,"porcentajeHistorialFormaPagoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormHistorialFormaPago.jButtonporcentaje_retencionHistorialFormaPagoBusqueda.addActionListener(new ButtonActionListener(this,"porcentaje_retencionHistorialFormaPagoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormHistorialFormaPago.jButtonbase_retencionHistorialFormaPagoBusqueda.addActionListener(new ButtonActionListener(this,"base_retencionHistorialFormaPagoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormHistorialFormaPago.jButtonnumero_retencionHistorialFormaPagoBusqueda.addActionListener(new ButtonActionListener(this,"numero_retencionHistorialFormaPagoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormHistorialFormaPago.jButtonnombre_retencionHistorialFormaPagoBusqueda.addActionListener(new ButtonActionListener(this,"nombre_retencionHistorialFormaPagoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormHistorialFormaPago.jButtonid_anioHistorialFormaPagoUpdate.addActionListener(new ButtonActionListener(this,"id_anioHistorialFormaPagoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormHistorialFormaPago.jButtonid_anioHistorialFormaPagoBusqueda.addActionListener(new ButtonActionListener(this,"id_anioHistorialFormaPagoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormHistorialFormaPago.jButtonid_mesHistorialFormaPagoUpdate.addActionListener(new ButtonActionListener(this,"id_mesHistorialFormaPagoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormHistorialFormaPago.jButtonid_mesHistorialFormaPagoBusqueda.addActionListener(new ButtonActionListener(this,"id_mesHistorialFormaPagoBusqueda"));
		
		
		this.jButtonFK_IdCuentaContableHistorialFormaPago.addActionListener(new ButtonActionListener(this,"FK_IdCuentaContableHistorialFormaPago"));

		this.jButtonBuscarFK_IdCuentaContableid_cuenta_contableHistorialFormaPago.addActionListener(new ButtonActionListener(this,"id_cuenta_contableHistorialFormaPago"));

		this.jButtonFK_IdFacturaHistorialFormaPago.addActionListener(new ButtonActionListener(this,"FK_IdFacturaHistorialFormaPago"));

		this.jButtonBuscarFK_IdFacturaid_facturaHistorialFormaPago.addActionListener(new ButtonActionListener(this,"id_facturaHistorialFormaPago"));

		this.jButtonFK_IdTipoFormaPagoHistorialFormaPago.addActionListener(new ButtonActionListener(this,"FK_IdTipoFormaPagoHistorialFormaPago"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoHistorialFormaPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoHistorialFormaPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoHistorialFormaPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoHistorialFormaPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoHistorialFormaPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoHistorialFormaPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionHistorialFormaPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionHistorialFormaPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionHistorialFormaPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionHistorialFormaPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionHistorialFormaPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionHistorialFormaPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarHistorialFormaPagoActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarHistorialFormaPago.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,HistorialFormaPagoConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosHistorialFormaPago(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(HistorialFormaPago historialformapagoAux:this.historialformapagoLogic.getHistorialFormaPagos()) {
					historialformapagoAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(HistorialFormaPago historialformapagoAux:historialformapagos) {
					historialformapagoAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,HistorialFormaPagoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosHistorialFormaPagoItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingHistorialFormaPago(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(HistorialFormaPago historialformapagoAux:this.historialformapagoLogic.getHistorialFormaPagos()) {
						historialformapagoAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(HistorialFormaPago historialformapagoAux:historialformapagos) {
						historialformapagoAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(HistorialFormaPago historialformapagoAux:this.historialformapagoLogic.getHistorialFormaPagos()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(HistorialFormaPago historialformapagoAux:historialformapagos) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaHistorialFormaPago(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosHistorialFormaPago.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosHistorialFormaPago.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosHistorialFormaPago,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,HistorialFormaPagoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosHistorialFormaPagoItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingHistorialFormaPago(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosHistorialFormaPago.getSelectedRows();
			
			HistorialFormaPago historialformapagoLocal=new HistorialFormaPago();
			
			//this.seleccionarTodosHistorialFormaPago(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					historialformapagoLocal =(HistorialFormaPago) this.historialformapagoLogic.getHistorialFormaPagos().toArray()[this.jTableDatosHistorialFormaPago.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					historialformapagoLocal =(HistorialFormaPago) this.historialformapagos.toArray()[this.jTableDatosHistorialFormaPago.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				historialformapagoLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(HistorialFormaPago historialformapagoAux:this.historialformapagoLogic.getHistorialFormaPagos()) {
						historialformapagoAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(HistorialFormaPago historialformapagoAux:historialformapagos) {
						historialformapagoAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaHistorialFormaPago(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosHistorialFormaPago.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosHistorialFormaPago.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosHistorialFormaPago,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,HistorialFormaPagoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualHistorialFormaPagoItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,HistorialFormaPagoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarHistorialFormaPagoParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,HistorialFormaPagoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralHistorialFormaPagoActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingHistorialFormaPago(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralHistorialFormaPago.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(HistorialFormaPago historialformapagoAux:this.historialformapagoLogic.getHistorialFormaPagos()) {
				
						if(sTipoSeleccionar.equals(HistorialFormaPagoConstantesFunciones.LABEL_NUMERODIAS)) {
							existe=true;
							historialformapagoAux.setnumero_dias(Integer.parseInt(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(HistorialFormaPagoConstantesFunciones.LABEL_VALOR)) {
							existe=true;
							historialformapagoAux.setvalor(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(HistorialFormaPagoConstantesFunciones.LABEL_FECHA)) {
							existe=true;
							historialformapagoAux.setfecha(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(HistorialFormaPagoConstantesFunciones.LABEL_PORCENTAJE)) {
							existe=true;
							historialformapagoAux.setporcentaje(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(HistorialFormaPagoConstantesFunciones.LABEL_PORCENTAJERETENCION)) {
							existe=true;
							historialformapagoAux.setporcentaje_retencion(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(HistorialFormaPagoConstantesFunciones.LABEL_BASERETENCION)) {
							existe=true;
							historialformapagoAux.setbase_retencion(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(HistorialFormaPagoConstantesFunciones.LABEL_NUMERORETENCION)) {
							existe=true;
							historialformapagoAux.setnumero_retencion(Integer.parseInt(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(HistorialFormaPagoConstantesFunciones.LABEL_NOMBRERETENCION)) {
							existe=true;
							historialformapagoAux.setnombre_retencion(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(HistorialFormaPago historialformapagoAux:historialformapagos) {
					
						if(sTipoSeleccionar.equals(HistorialFormaPagoConstantesFunciones.LABEL_NUMERODIAS)) {
							existe=true;
							historialformapagoAux.setnumero_dias(Integer.parseInt(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(HistorialFormaPagoConstantesFunciones.LABEL_VALOR)) {
							existe=true;
							historialformapagoAux.setvalor(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(HistorialFormaPagoConstantesFunciones.LABEL_FECHA)) {
							existe=true;
							historialformapagoAux.setfecha(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(HistorialFormaPagoConstantesFunciones.LABEL_PORCENTAJE)) {
							existe=true;
							historialformapagoAux.setporcentaje(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(HistorialFormaPagoConstantesFunciones.LABEL_PORCENTAJERETENCION)) {
							existe=true;
							historialformapagoAux.setporcentaje_retencion(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(HistorialFormaPagoConstantesFunciones.LABEL_BASERETENCION)) {
							existe=true;
							historialformapagoAux.setbase_retencion(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(HistorialFormaPagoConstantesFunciones.LABEL_NUMERORETENCION)) {
							existe=true;
							historialformapagoAux.setnumero_retencion(Integer.parseInt(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(HistorialFormaPagoConstantesFunciones.LABEL_NOMBRERETENCION)) {
							existe=true;
							historialformapagoAux.setnombre_retencion(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaHistorialFormaPago(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,HistorialFormaPagoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesHistorialFormaPagoActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingHistorialFormaPago(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioHistorialFormaPago=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesHistorialFormaPago.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormHistorialFormaPago.jComboBoxTiposAccionesFormularioHistorialFormaPago.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteHistorialFormaPago) {				
					conSplash=true;//false;										
					
					//this.startProcessHistorialFormaPago(conSplash);
				
					this.generarReporteHistorialFormaPagosSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesHistorialFormaPago.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormHistorialFormaPago.jComboBoxTiposAccionesFormularioHistorialFormaPago.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoHistorialFormaPagosSeleccionados();
				//this.jComboBoxTiposAccionesHistorialFormaPago.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoHistorialFormaPagosSeleccionados(false);
				//this.jComboBoxTiposAccionesHistorialFormaPago.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoHistorialFormaPagosSeleccionados(true);
				//this.jComboBoxTiposAccionesHistorialFormaPago.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessHistorialFormaPago();
				
				this.exportarHistorialFormaPagosSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesHistorialFormaPago.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormHistorialFormaPago.jComboBoxTiposAccionesFormularioHistorialFormaPago.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionHistorialFormaPagos();
				//this.importarHistorialFormaPagos();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesHistorialFormaPago.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormHistorialFormaPago.jComboBoxTiposAccionesFormularioHistorialFormaPago.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessHistorialFormaPago();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelHistorialFormaPagosSeleccionados();
				//this.jComboBoxTiposAccionesHistorialFormaPago.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Historial Forma Pago", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessHistorialFormaPago();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoHistorialFormaPago)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyHistorialFormaPago(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Historial Forma Pago",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesHistorialFormaPago.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormHistorialFormaPago.jComboBoxTiposAccionesFormularioHistorialFormaPago.setSelectedIndex(0);					
				}	
			} 			
			else if(HistorialFormaPagoBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteHistorialFormaPago) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessHistorialFormaPago(conSplash);
					
						//this.actualizarParametrosGeneralHistorialFormaPago();
						
						this.generarReporteProcesoAccionHistorialFormaPagosSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesHistorialFormaPago.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormHistorialFormaPago.jComboBoxTiposAccionesFormularioHistorialFormaPago.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(HistorialFormaPagoBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Historial Forma PagoS SELECCIONADOS?", "MANTENIMIENTO DE Historial Forma Pago", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessHistorialFormaPago();
				
						this.actualizarParametrosGeneralHistorialFormaPago();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.historialformapagoReturnGeneral=historialformapagoLogic.procesarAccionHistorialFormaPagosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.historialformapagoLogic.getHistorialFormaPagos(),this.historialformapagoParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarHistorialFormaPagoReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesHistorialFormaPago.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormHistorialFormaPago.jComboBoxTiposAccionesFormularioHistorialFormaPago.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralHistorialFormaPago();
					
					HistorialFormaPagoBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarHistorialFormaPagoReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesHistorialFormaPago.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormHistorialFormaPago.jComboBoxTiposAccionesFormularioHistorialFormaPago.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,HistorialFormaPagoConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessHistorialFormaPago(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesHistorialFormaPagoActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessHistorialFormaPago();
			
			if(this.jInternalFrameDetalleFormHistorialFormaPago==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<HistorialFormaPago> historialformapagosSeleccionados=new ArrayList<HistorialFormaPago>();		
			HistorialFormaPago historialformapago=new HistorialFormaPago();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingHistorialFormaPago(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesHistorialFormaPago.getSelectedItem();
			
			
			
			
			historialformapagosSeleccionados=this.getHistorialFormaPagosSeleccionados(true);
			//this.sTipoAccion;
			
			if(historialformapagosSeleccionados.size()==1) {
				for(HistorialFormaPago historialformapagoAux:historialformapagosSeleccionados) {
					historialformapago=historialformapagoAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,HistorialFormaPagoConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessHistorialFormaPago();
			
      		//this.finishProcessHistorialFormaPago(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarHistorialFormaPagoReturnGeneral() throws Exception {
		if(this.historialformapagoReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.historialformapagoReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.historialformapagoReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.historialformapagoReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.historialformapagoReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.historialformapagoReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingHistorialFormaPago(false);
		}
		
		if(this.historialformapagoReturnGeneral.getConRetornoLista() || this.historialformapagoReturnGeneral.getConRetornoObjeto()) {
			if(this.historialformapagoReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.historialformapagoLogic.setHistorialFormaPagos(this.historialformapagoReturnGeneral.getHistorialFormaPagos());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.historialformapagoReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.historialformapagoLogic.setHistorialFormaPago(this.historialformapagoReturnGeneral.getHistorialFormaPago());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingHistorialFormaPago(false);
		}
	}
	
	public void actualizarParametrosGeneralHistorialFormaPago() throws Exception {
		
		
	}
	
	public ArrayList<HistorialFormaPago> getHistorialFormaPagosSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<HistorialFormaPago> historialformapagosSeleccionados=new ArrayList<HistorialFormaPago>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioHistorialFormaPago) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(HistorialFormaPago historialformapagoAux:historialformapagoLogic.getHistorialFormaPagos()) {
					if(historialformapagoAux.getIsSelected()) {
						historialformapagosSeleccionados.add(historialformapagoAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(HistorialFormaPago historialformapagoAux:this.historialformapagos) {
					if(historialformapagoAux.getIsSelected()) {
						historialformapagosSeleccionados.add(historialformapagoAux);				
					}
				}
			}
			
			if(historialformapagosSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						historialformapagosSeleccionados.addAll(this.historialformapagoLogic.getHistorialFormaPagos());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						historialformapagosSeleccionados.addAll(this.historialformapagos);				
					}
				}
			}
		} else {
			historialformapagosSeleccionados.add(this.historialformapago);
		}
		
		return historialformapagosSeleccionados;
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
	
	public void generarReporteHistorialFormaPagosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalHistorialFormaPagosSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoHistorialFormaPagosSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoHistorialFormaPagosSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoHistorialFormaPagosSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Historial Forma Pago",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesHistorialFormaPagosSeleccionados() throws Exception {
		ArrayList<HistorialFormaPago> historialformapagosSeleccionados=new ArrayList<HistorialFormaPago>();		
		
		historialformapagosSeleccionados=this.getHistorialFormaPagosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteHistorialFormaPagos("Todos",historialformapagosSeleccionados);
		
	}	
	
	public void generarReporteNormalHistorialFormaPagosSeleccionados() throws Exception {
		ArrayList<HistorialFormaPago> historialformapagosSeleccionados=new ArrayList<HistorialFormaPago>();		
		
		historialformapagosSeleccionados=this.getHistorialFormaPagosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteHistorialFormaPagos("Todos",historialformapagosSeleccionados);
	}		
	
	public void generarReporteProcesoAccionHistorialFormaPagosSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<HistorialFormaPago> historialformapagosSeleccionados=new ArrayList<HistorialFormaPago>();
		
		historialformapagosSeleccionados=this.getHistorialFormaPagosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteHistorialFormaPagos("Todos",historialformapagosSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoHistorialFormaPagosSeleccionados() throws Exception {
		ArrayList<HistorialFormaPago> historialformapagosSeleccionados=new ArrayList<HistorialFormaPago>();		
		
		
		this.abrirInicializarFrameReporteDinamicoHistorialFormaPago();
		
		
		historialformapagosSeleccionados=this.getHistorialFormaPagosSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoHistorialFormaPago();
		
		
		//this.generarReporteHistorialFormaPagos("Todos",historialformapagosSeleccionados ,historialformapagoImplementable,historialformapagoImplementableHome);
	}
	
	public void mostrarImportacionHistorialFormaPagos() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionHistorialFormaPago();
		
		this.abrirFrameImportacionHistorialFormaPago();		
		
			
		//this.generarReporteHistorialFormaPagos("Todos",historialformapagosSeleccionados ,historialformapagoImplementable,historialformapagoImplementableHome);
	}
	
	public void importarHistorialFormaPagos() throws Exception {		
	
	}
	
	public void exportarHistorialFormaPagosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelHistorialFormaPagosSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoHistorialFormaPagosSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlHistorialFormaPagosSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Historial Forma Pago",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoHistorialFormaPagosSeleccionados() throws Exception {
		ArrayList<HistorialFormaPago> historialformapagosSeleccionados=new ArrayList<HistorialFormaPago>();		
		
		historialformapagosSeleccionados=this.getHistorialFormaPagosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"historialformapago."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarHistorialFormaPago(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(HistorialFormaPago historialformapagoAux:historialformapagosSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarHistorialFormaPago(historialformapagoAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//historialformapagoAux.setsDetalleGeneralEntityReporte(historialformapagoAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.historialformapagoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Historial Forma Pago",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarHistorialFormaPago(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=HistorialFormaPagoConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=HistorialFormaPagoConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=HistorialFormaPagoConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=HistorialFormaPagoConstantesFunciones.LABEL_IDSUCURSAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=HistorialFormaPagoConstantesFunciones.LABEL_IDEJERCICIO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=HistorialFormaPagoConstantesFunciones.LABEL_IDPERIODO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=HistorialFormaPagoConstantesFunciones.LABEL_IDFACTURA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=HistorialFormaPagoConstantesFunciones.LABEL_IDTIPOFORMAPAGO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=HistorialFormaPagoConstantesFunciones.LABEL_IDCUENTACONTABLE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=HistorialFormaPagoConstantesFunciones.LABEL_NUMERODIAS;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=HistorialFormaPagoConstantesFunciones.LABEL_VALOR;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=HistorialFormaPagoConstantesFunciones.LABEL_FECHA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=HistorialFormaPagoConstantesFunciones.LABEL_PORCENTAJE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=HistorialFormaPagoConstantesFunciones.LABEL_PORCENTAJERETENCION;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=HistorialFormaPagoConstantesFunciones.LABEL_BASERETENCION;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=HistorialFormaPagoConstantesFunciones.LABEL_NUMERORETENCION;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=HistorialFormaPagoConstantesFunciones.LABEL_NOMBRERETENCION;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=HistorialFormaPagoConstantesFunciones.LABEL_IDANIO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=HistorialFormaPagoConstantesFunciones.LABEL_IDMES;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarHistorialFormaPago(HistorialFormaPago historialformapago,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=historialformapago.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=historialformapago.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=historialformapago.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=historialformapago.getsucursal_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=historialformapago.getejercicio_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=historialformapago.getperiodo_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=historialformapago.getfactura_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=historialformapago.gettipoformapago_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=historialformapago.getcuentacontable_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=historialformapago.getnumero_dias().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=historialformapago.getvalor().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=historialformapago.getfecha().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=historialformapago.getporcentaje().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=historialformapago.getporcentaje_retencion().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=historialformapago.getbase_retencion().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=historialformapago.getnumero_retencion().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=historialformapago.getnombre_retencion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=historialformapago.getanio_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=historialformapago.getmes_descripcion();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelHistorialFormaPagosSeleccionados() throws Exception {
		ArrayList<HistorialFormaPago> historialformapagosSeleccionados=new ArrayList<HistorialFormaPago>();		
		
		historialformapagosSeleccionados=this.getHistorialFormaPagosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"historialformapago.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("HistorialFormaPagos");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelHistorialFormaPago(row);				
				iRow++;
			}				
			
			for(HistorialFormaPago historialformapagoAux:historialformapagosSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelHistorialFormaPago(historialformapagoAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.historialformapagoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Historial Forma Pago",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlHistorialFormaPagosSeleccionados() throws Exception {
		ArrayList<HistorialFormaPago> historialformapagosSeleccionados=new ArrayList<HistorialFormaPago>();		
		
		historialformapagosSeleccionados=this.getHistorialFormaPagosSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"historialformapago.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("historialformapagos");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("historialformapago");
			//elementRoot.appendChild(element);
		
			for(HistorialFormaPago historialformapagoAux:historialformapagosSeleccionados) {
				element = document.createElement("historialformapago");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlHistorialFormaPago(historialformapagoAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.historialformapagoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Historial Forma Pago",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelHistorialFormaPago(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(HistorialFormaPagoConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(HistorialFormaPagoConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(HistorialFormaPagoConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(HistorialFormaPagoConstantesFunciones.LABEL_IDSUCURSAL);
		cell = row.createCell(iColumn++);cell.setCellValue(HistorialFormaPagoConstantesFunciones.LABEL_IDEJERCICIO);
		cell = row.createCell(iColumn++);cell.setCellValue(HistorialFormaPagoConstantesFunciones.LABEL_IDPERIODO);
		cell = row.createCell(iColumn++);cell.setCellValue(HistorialFormaPagoConstantesFunciones.LABEL_IDFACTURA);
		cell = row.createCell(iColumn++);cell.setCellValue(HistorialFormaPagoConstantesFunciones.LABEL_IDTIPOFORMAPAGO);
		cell = row.createCell(iColumn++);cell.setCellValue(HistorialFormaPagoConstantesFunciones.LABEL_IDCUENTACONTABLE);
		cell = row.createCell(iColumn++);cell.setCellValue(HistorialFormaPagoConstantesFunciones.LABEL_NUMERODIAS);
		cell = row.createCell(iColumn++);cell.setCellValue(HistorialFormaPagoConstantesFunciones.LABEL_VALOR);
		cell = row.createCell(iColumn++);cell.setCellValue(HistorialFormaPagoConstantesFunciones.LABEL_FECHA);
		cell = row.createCell(iColumn++);cell.setCellValue(HistorialFormaPagoConstantesFunciones.LABEL_PORCENTAJE);
		cell = row.createCell(iColumn++);cell.setCellValue(HistorialFormaPagoConstantesFunciones.LABEL_PORCENTAJERETENCION);
		cell = row.createCell(iColumn++);cell.setCellValue(HistorialFormaPagoConstantesFunciones.LABEL_BASERETENCION);
		cell = row.createCell(iColumn++);cell.setCellValue(HistorialFormaPagoConstantesFunciones.LABEL_NUMERORETENCION);
		cell = row.createCell(iColumn++);cell.setCellValue(HistorialFormaPagoConstantesFunciones.LABEL_NOMBRERETENCION);
		cell = row.createCell(iColumn++);cell.setCellValue(HistorialFormaPagoConstantesFunciones.LABEL_IDANIO);
		cell = row.createCell(iColumn++);cell.setCellValue(HistorialFormaPagoConstantesFunciones.LABEL_IDMES);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelHistorialFormaPago(HistorialFormaPago historialformapago,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(historialformapago.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(historialformapago.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(historialformapago.getsucursal_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(historialformapago.getejercicio_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(historialformapago.getperiodo_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(historialformapago.getfactura_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(historialformapago.gettipoformapago_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(historialformapago.getcuentacontable_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(historialformapago.getnumero_dias());
		cell = row.createCell(iColumn++);cell.setCellValue(historialformapago.getvalor());
		cell = row.createCell(iColumn++);cell.setCellValue(historialformapago.getfecha());
		cell = row.createCell(iColumn++);cell.setCellValue(historialformapago.getporcentaje());
		cell = row.createCell(iColumn++);cell.setCellValue(historialformapago.getporcentaje_retencion());
		cell = row.createCell(iColumn++);cell.setCellValue(historialformapago.getbase_retencion());
		cell = row.createCell(iColumn++);cell.setCellValue(historialformapago.getnumero_retencion());
		cell = row.createCell(iColumn++);cell.setCellValue(historialformapago.getnombre_retencion());
		cell = row.createCell(iColumn++);cell.setCellValue(historialformapago.getanio_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(historialformapago.getmes_descripcion());				
	}
	
	public void setFilaDatosExportarXmlHistorialFormaPago(HistorialFormaPago historialformapago,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(HistorialFormaPagoConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(historialformapago.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(HistorialFormaPagoConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(historialformapago.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(HistorialFormaPagoConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(historialformapago.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementsucursal_descripcion = document.createElement(HistorialFormaPagoConstantesFunciones.IDSUCURSAL);
		elementsucursal_descripcion.appendChild(document.createTextNode(historialformapago.getsucursal_descripcion()));
		element.appendChild(elementsucursal_descripcion);

		Element elementejercicio_descripcion = document.createElement(HistorialFormaPagoConstantesFunciones.IDEJERCICIO);
		elementejercicio_descripcion.appendChild(document.createTextNode(historialformapago.getejercicio_descripcion()));
		element.appendChild(elementejercicio_descripcion);

		Element elementperiodo_descripcion = document.createElement(HistorialFormaPagoConstantesFunciones.IDPERIODO);
		elementperiodo_descripcion.appendChild(document.createTextNode(historialformapago.getperiodo_descripcion()));
		element.appendChild(elementperiodo_descripcion);

		Element elementfactura_descripcion = document.createElement(HistorialFormaPagoConstantesFunciones.IDFACTURA);
		elementfactura_descripcion.appendChild(document.createTextNode(historialformapago.getfactura_descripcion()));
		element.appendChild(elementfactura_descripcion);

		Element elementtipoformapago_descripcion = document.createElement(HistorialFormaPagoConstantesFunciones.IDTIPOFORMAPAGO);
		elementtipoformapago_descripcion.appendChild(document.createTextNode(historialformapago.gettipoformapago_descripcion()));
		element.appendChild(elementtipoformapago_descripcion);

		Element elementcuentacontable_descripcion = document.createElement(HistorialFormaPagoConstantesFunciones.IDCUENTACONTABLE);
		elementcuentacontable_descripcion.appendChild(document.createTextNode(historialformapago.getcuentacontable_descripcion()));
		element.appendChild(elementcuentacontable_descripcion);

		Element elementnumero_dias = document.createElement(HistorialFormaPagoConstantesFunciones.NUMERODIAS);
		elementnumero_dias.appendChild(document.createTextNode(historialformapago.getnumero_dias().toString().trim()));
		element.appendChild(elementnumero_dias);

		Element elementvalor = document.createElement(HistorialFormaPagoConstantesFunciones.VALOR);
		elementvalor.appendChild(document.createTextNode(historialformapago.getvalor().toString().trim()));
		element.appendChild(elementvalor);

		Element elementfecha = document.createElement(HistorialFormaPagoConstantesFunciones.FECHA);
		elementfecha.appendChild(document.createTextNode(historialformapago.getfecha().toString().trim()));
		element.appendChild(elementfecha);

		Element elementporcentaje = document.createElement(HistorialFormaPagoConstantesFunciones.PORCENTAJE);
		elementporcentaje.appendChild(document.createTextNode(historialformapago.getporcentaje().toString().trim()));
		element.appendChild(elementporcentaje);

		Element elementporcentaje_retencion = document.createElement(HistorialFormaPagoConstantesFunciones.PORCENTAJERETENCION);
		elementporcentaje_retencion.appendChild(document.createTextNode(historialformapago.getporcentaje_retencion().toString().trim()));
		element.appendChild(elementporcentaje_retencion);

		Element elementbase_retencion = document.createElement(HistorialFormaPagoConstantesFunciones.BASERETENCION);
		elementbase_retencion.appendChild(document.createTextNode(historialformapago.getbase_retencion().toString().trim()));
		element.appendChild(elementbase_retencion);

		Element elementnumero_retencion = document.createElement(HistorialFormaPagoConstantesFunciones.NUMERORETENCION);
		elementnumero_retencion.appendChild(document.createTextNode(historialformapago.getnumero_retencion().toString().trim()));
		element.appendChild(elementnumero_retencion);

		Element elementnombre_retencion = document.createElement(HistorialFormaPagoConstantesFunciones.NOMBRERETENCION);
		elementnombre_retencion.appendChild(document.createTextNode(historialformapago.getnombre_retencion().trim()));
		element.appendChild(elementnombre_retencion);

		Element elementanio_descripcion = document.createElement(HistorialFormaPagoConstantesFunciones.IDANIO);
		elementanio_descripcion.appendChild(document.createTextNode(historialformapago.getanio_descripcion()));
		element.appendChild(elementanio_descripcion);

		Element elementmes_descripcion = document.createElement(HistorialFormaPagoConstantesFunciones.IDMES);
		elementmes_descripcion.appendChild(document.createTextNode(historialformapago.getmes_descripcion()));
		element.appendChild(elementmes_descripcion);
	}
	
	public void generarReporteGroupGenericoHistorialFormaPagosSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<HistorialFormaPago> historialformapagosSeleccionados=new ArrayList<HistorialFormaPago>();
		
		historialformapagosSeleccionados=this.getHistorialFormaPagosSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoHistorialFormaPago(historialformapagosSeleccionados);
		
		this.generarReporteHistorialFormaPagos("Todos",historialformapagosSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoHistorialFormaPago(ArrayList<HistorialFormaPago> historialformapagosSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(HistorialFormaPago historialformapagoAux:historialformapagosSeleccionados) {
				historialformapagoAux.setsDetalleGeneralEntityReporte(historialformapagoAux.toString());
			
				if(sTipoSeleccionar.equals(HistorialFormaPagoConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					historialformapagoAux.setsDescripcionGeneralEntityReporte1(historialformapagoAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(HistorialFormaPagoConstantesFunciones.LABEL_IDSUCURSAL)) {
					existe=true;
					historialformapagoAux.setsDescripcionGeneralEntityReporte1(historialformapagoAux.getsucursal_descripcion());
				}
				 else if(sTipoSeleccionar.equals(HistorialFormaPagoConstantesFunciones.LABEL_IDEJERCICIO)) {
					existe=true;
					historialformapagoAux.setsDescripcionGeneralEntityReporte1(historialformapagoAux.getejercicio_descripcion());
				}
				 else if(sTipoSeleccionar.equals(HistorialFormaPagoConstantesFunciones.LABEL_IDPERIODO)) {
					existe=true;
					historialformapagoAux.setsDescripcionGeneralEntityReporte1(historialformapagoAux.getperiodo_descripcion());
				}
				 else if(sTipoSeleccionar.equals(HistorialFormaPagoConstantesFunciones.LABEL_IDFACTURA)) {
					existe=true;
					historialformapagoAux.setsDescripcionGeneralEntityReporte1(historialformapagoAux.getfactura_descripcion());
				}
				 else if(sTipoSeleccionar.equals(HistorialFormaPagoConstantesFunciones.LABEL_IDTIPOFORMAPAGO)) {
					existe=true;
					historialformapagoAux.setsDescripcionGeneralEntityReporte1(historialformapagoAux.gettipoformapago_descripcion());
				}
				 else if(sTipoSeleccionar.equals(HistorialFormaPagoConstantesFunciones.LABEL_IDCUENTACONTABLE)) {
					existe=true;
					historialformapagoAux.setsDescripcionGeneralEntityReporte1(historialformapagoAux.getcuentacontable_descripcion());
				}
				 else if(sTipoSeleccionar.equals(HistorialFormaPagoConstantesFunciones.LABEL_NUMERODIAS)) {
					existe=true;
					historialformapagoAux.setsDescripcionGeneralEntityReporte1(historialformapagoAux.getnumero_dias().toString());
				}
				 else if(sTipoSeleccionar.equals(HistorialFormaPagoConstantesFunciones.LABEL_FECHA)) {
					existe=true;
					historialformapagoAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(historialformapagoAux.getfecha()));
				}
				 else if(sTipoSeleccionar.equals(HistorialFormaPagoConstantesFunciones.LABEL_NUMERORETENCION)) {
					existe=true;
					historialformapagoAux.setsDescripcionGeneralEntityReporte1(historialformapagoAux.getnumero_retencion().toString());
				}
				 else if(sTipoSeleccionar.equals(HistorialFormaPagoConstantesFunciones.LABEL_NOMBRERETENCION)) {
					existe=true;
					historialformapagoAux.setsDescripcionGeneralEntityReporte1(historialformapagoAux.getnombre_retencion());
				}
				 else if(sTipoSeleccionar.equals(HistorialFormaPagoConstantesFunciones.LABEL_IDANIO)) {
					existe=true;
					historialformapagoAux.setsDescripcionGeneralEntityReporte1(historialformapagoAux.getanio_descripcion());
				}
				 else if(sTipoSeleccionar.equals(HistorialFormaPagoConstantesFunciones.LABEL_IDMES)) {
					existe=true;
					historialformapagoAux.setsDescripcionGeneralEntityReporte1(historialformapagoAux.getmes_descripcion());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,HistorialFormaPagoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesHistorialFormaPago(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoHistorialFormaPago=true;
				this.isVisibilidadCeldaNuevoRelacionesHistorialFormaPago=true;
				this.isVisibilidadCeldaGuardarCambiosHistorialFormaPago=true;
			}
			
			this.isVisibilidadCeldaModificarHistorialFormaPago=false;
			this.isVisibilidadCeldaActualizarHistorialFormaPago=false;
			this.isVisibilidadCeldaEliminarHistorialFormaPago=false;
			this.isVisibilidadCeldaCancelarHistorialFormaPago=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarHistorialFormaPago=true;
				} else {
					this.isVisibilidadCeldaGuardarHistorialFormaPago=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoHistorialFormaPago=false;
			this.isVisibilidadCeldaNuevoRelacionesHistorialFormaPago=false;
			this.isVisibilidadCeldaGuardarCambiosHistorialFormaPago=false;
			this.isVisibilidadCeldaModificarHistorialFormaPago=false;
			this.isVisibilidadCeldaActualizarHistorialFormaPago=true;
			this.isVisibilidadCeldaEliminarHistorialFormaPago=false;
			this.isVisibilidadCeldaCancelarHistorialFormaPago=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarHistorialFormaPago=true;
				} else {
					this.isVisibilidadCeldaGuardarHistorialFormaPago=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoHistorialFormaPago=false;
			this.isVisibilidadCeldaNuevoRelacionesHistorialFormaPago=false;
			this.isVisibilidadCeldaGuardarCambiosHistorialFormaPago=false;
			this.isVisibilidadCeldaModificarHistorialFormaPago=false;
			this.isVisibilidadCeldaActualizarHistorialFormaPago=true;
			this.isVisibilidadCeldaEliminarHistorialFormaPago=true;
			this.isVisibilidadCeldaCancelarHistorialFormaPago=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarHistorialFormaPago=true;
				} else {
					this.isVisibilidadCeldaGuardarHistorialFormaPago=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoHistorialFormaPago=false;
			this.isVisibilidadCeldaNuevoRelacionesHistorialFormaPago=false;
			this.isVisibilidadCeldaGuardarCambiosHistorialFormaPago=false;
			this.isVisibilidadCeldaModificarHistorialFormaPago=false;
			this.isVisibilidadCeldaActualizarHistorialFormaPago=true;
			this.isVisibilidadCeldaEliminarHistorialFormaPago=false;
			this.isVisibilidadCeldaCancelarHistorialFormaPago=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarHistorialFormaPago=false;
				} else {
					this.isVisibilidadCeldaGuardarHistorialFormaPago=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoHistorialFormaPago=true;
			this.isVisibilidadCeldaNuevoRelacionesHistorialFormaPago=true;
			this.isVisibilidadCeldaGuardarCambiosHistorialFormaPago=true;
			this.isVisibilidadCeldaModificarHistorialFormaPago=false;
			this.isVisibilidadCeldaActualizarHistorialFormaPago=false;
			this.isVisibilidadCeldaEliminarHistorialFormaPago=false;
			this.isVisibilidadCeldaCancelarHistorialFormaPago=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarHistorialFormaPago=true;
				} else {
					this.isVisibilidadCeldaGuardarHistorialFormaPago=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoHistorialFormaPago=false;
			this.isVisibilidadCeldaNuevoRelacionesHistorialFormaPago=false;
			this.isVisibilidadCeldaGuardarCambiosHistorialFormaPago=false;
			this.isVisibilidadCeldaActualizarHistorialFormaPago=false;
			this.isVisibilidadCeldaEliminarHistorialFormaPago=false;
			this.isVisibilidadCeldaCancelarHistorialFormaPago=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarHistorialFormaPago=false;
				} else {
					this.isVisibilidadCeldaGuardarHistorialFormaPago=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoHistorialFormaPago=false;
			this.isVisibilidadCeldaNuevoRelacionesHistorialFormaPago=false;
			this.isVisibilidadCeldaGuardarCambiosHistorialFormaPago=false;
			this.isVisibilidadCeldaModificarHistorialFormaPago=true;
			this.isVisibilidadCeldaActualizarHistorialFormaPago=false;
			this.isVisibilidadCeldaEliminarHistorialFormaPago=false;
			this.isVisibilidadCeldaCancelarHistorialFormaPago=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarHistorialFormaPago=false;
				} else {
					this.isVisibilidadCeldaGuardarHistorialFormaPago=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(HistorialFormaPagoJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoHistorialFormaPago=true;
			this.isVisibilidadCeldaNuevoRelacionesHistorialFormaPago=true;
			this.isVisibilidadCeldaGuardarCambiosHistorialFormaPago=true;
		} else {
			this.actualizarEstadoPanelsHistorialFormaPago(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarHistorialFormaPago=false;
			//this.isVisibilidadCeldaVerFormHistorialFormaPago=false;
			this.isVisibilidadCeldaDuplicarHistorialFormaPago=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!historialformapagoSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesHistorialFormaPago=false;
		} else {
			this.isVisibilidadCeldaNuevoHistorialFormaPago=false;
			this.isVisibilidadCeldaGuardarCambiosHistorialFormaPago=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(historialformapagoSessionBean.getEsGuardarRelacionado()) {
			if(!historialformapagoSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesHistorialFormaPago=false;												
			}
			
			this.jButtonCerrarHistorialFormaPago.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesHistorialFormaPago=false;
		}
		
		if(!this.permiteMantenimiento(this.historialformapago)) {
			this.isVisibilidadCeldaActualizarHistorialFormaPago=false;
			this.isVisibilidadCeldaEliminarHistorialFormaPago=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesHistorialFormaPago() {
	}
	
	public void actualizarEstadoPanelsHistorialFormaPago(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionHistorialFormaPago!=null) {
				this.jScrollPanelDatosEdicionHistorialFormaPago.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasHistorialFormaPago!=null) {
				this.jTabbedPaneBusquedasHistorialFormaPago.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosHistorialFormaPago!=null) {
				this.jScrollPanelDatosHistorialFormaPago.setVisible(true);
			}
			
			if(this.jPanelPaginacionHistorialFormaPago!=null) {
				this.jPanelPaginacionHistorialFormaPago.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesHistorialFormaPago!=null) {
				this.jPanelParametrosReportesHistorialFormaPago.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionHistorialFormaPago!=null) {
				this.jScrollPanelDatosEdicionHistorialFormaPago.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasHistorialFormaPago!=null) {
				this.jTabbedPaneBusquedasHistorialFormaPago.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosHistorialFormaPago!=null) {
				this.jScrollPanelDatosHistorialFormaPago.setVisible(false);
			}
			
			if(this.jPanelPaginacionHistorialFormaPago!=null) {
				this.jPanelPaginacionHistorialFormaPago.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesHistorialFormaPago!=null) {
				this.jPanelParametrosReportesHistorialFormaPago.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionHistorialFormaPago!=null) {
				this.jScrollPanelDatosEdicionHistorialFormaPago.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasHistorialFormaPago!=null) {
				this.jTabbedPaneBusquedasHistorialFormaPago.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosHistorialFormaPago!=null) {
				this.jScrollPanelDatosHistorialFormaPago.setVisible(false);
			}
			
			if(this.jPanelPaginacionHistorialFormaPago!=null) {
				this.jPanelPaginacionHistorialFormaPago.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesHistorialFormaPago!=null) {
				this.jPanelParametrosReportesHistorialFormaPago.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionHistorialFormaPago!=null) {
				this.jScrollPanelDatosEdicionHistorialFormaPago.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasHistorialFormaPago!=null) {
				this.jTabbedPaneBusquedasHistorialFormaPago.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosHistorialFormaPago!=null) {
				this.jScrollPanelDatosHistorialFormaPago.setVisible(false);
			}
			
			if(this.jPanelPaginacionHistorialFormaPago!=null) {
				this.jPanelPaginacionHistorialFormaPago.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesHistorialFormaPago!=null) {
				this.jPanelParametrosReportesHistorialFormaPago.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionHistorialFormaPago!=null) {
				this.jScrollPanelDatosEdicionHistorialFormaPago.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasHistorialFormaPago!=null) {
				this.jTabbedPaneBusquedasHistorialFormaPago.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosHistorialFormaPago!=null) {
				this.jScrollPanelDatosHistorialFormaPago.setVisible(true);
			}
			
			if(this.jPanelPaginacionHistorialFormaPago!=null) {
				this.jPanelPaginacionHistorialFormaPago.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesHistorialFormaPago!=null) {
				this.jPanelParametrosReportesHistorialFormaPago.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionHistorialFormaPago!=null) {
				this.jScrollPanelDatosEdicionHistorialFormaPago.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasHistorialFormaPago!=null) {
				this.jTabbedPaneBusquedasHistorialFormaPago.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosHistorialFormaPago!=null) {
				this.jScrollPanelDatosHistorialFormaPago.setVisible(true);
			}
			
			if(this.jPanelPaginacionHistorialFormaPago!=null) {
				this.jPanelPaginacionHistorialFormaPago.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesHistorialFormaPago!=null) {
				this.jPanelParametrosReportesHistorialFormaPago.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionHistorialFormaPago!=null) {
				this.jScrollPanelDatosEdicionHistorialFormaPago.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasHistorialFormaPago!=null) {
				this.jTabbedPaneBusquedasHistorialFormaPago.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosHistorialFormaPago!=null) {
				this.jScrollPanelDatosHistorialFormaPago.setVisible(true);
			}
			
			if(this.jPanelPaginacionHistorialFormaPago!=null) {
				this.jPanelPaginacionHistorialFormaPago.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesHistorialFormaPago!=null) {
				this.jPanelParametrosReportesHistorialFormaPago.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.historialformapagoSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasHistorialFormaPago!=null) {
					this.jTabbedPaneBusquedasHistorialFormaPago.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesHistorialFormaPago!=null) {
				this.jPanelParametrosReportesHistorialFormaPago.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.historialformapagoSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasHistorialFormaPago!=null) {
				this.jTabbedPaneBusquedasHistorialFormaPago.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesHistorialFormaPago!=null) {
				this.jPanelParametrosReportesHistorialFormaPago.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadFK_IdCuentaContable=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdCuentaContable) {this.jTabbedPaneBusquedasHistorialFormaPago.remove(jPanelFK_IdCuentaContableHistorialFormaPago);}

			this.isVisibilidadFK_IdFactura=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdFactura) {this.jTabbedPaneBusquedasHistorialFormaPago.remove(jPanelFK_IdFacturaHistorialFormaPago);}

			this.isVisibilidadFK_IdTipoFormaPago=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdTipoFormaPago) {this.jTabbedPaneBusquedasHistorialFormaPago.remove(jPanelFK_IdTipoFormaPagoHistorialFormaPago);}
		}
		
	}

	public void setVisibilidadBusquedasParaSucursal(Boolean isParaSucursal){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaSucursalNegation=!isParaSucursal;

			this.isVisibilidadFK_IdCuentaContable=isParaSucursalNegation;
			if(!this.isVisibilidadFK_IdCuentaContable) {this.jTabbedPaneBusquedasHistorialFormaPago.remove(jPanelFK_IdCuentaContableHistorialFormaPago);}

			this.isVisibilidadFK_IdFactura=isParaSucursalNegation;
			if(!this.isVisibilidadFK_IdFactura) {this.jTabbedPaneBusquedasHistorialFormaPago.remove(jPanelFK_IdFacturaHistorialFormaPago);}

			this.isVisibilidadFK_IdTipoFormaPago=isParaSucursalNegation;
			if(!this.isVisibilidadFK_IdTipoFormaPago) {this.jTabbedPaneBusquedasHistorialFormaPago.remove(jPanelFK_IdTipoFormaPagoHistorialFormaPago);}
		}
		
	}

	public void setVisibilidadBusquedasParaEjercicio(Boolean isParaEjercicio){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEjercicioNegation=!isParaEjercicio;

			this.isVisibilidadFK_IdCuentaContable=isParaEjercicioNegation;
			if(!this.isVisibilidadFK_IdCuentaContable) {this.jTabbedPaneBusquedasHistorialFormaPago.remove(jPanelFK_IdCuentaContableHistorialFormaPago);}

			this.isVisibilidadFK_IdFactura=isParaEjercicioNegation;
			if(!this.isVisibilidadFK_IdFactura) {this.jTabbedPaneBusquedasHistorialFormaPago.remove(jPanelFK_IdFacturaHistorialFormaPago);}

			this.isVisibilidadFK_IdTipoFormaPago=isParaEjercicioNegation;
			if(!this.isVisibilidadFK_IdTipoFormaPago) {this.jTabbedPaneBusquedasHistorialFormaPago.remove(jPanelFK_IdTipoFormaPagoHistorialFormaPago);}
		}
		
	}

	public void setVisibilidadBusquedasParaPeriodo(Boolean isParaPeriodo){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaPeriodoNegation=!isParaPeriodo;

			this.isVisibilidadFK_IdCuentaContable=isParaPeriodoNegation;
			if(!this.isVisibilidadFK_IdCuentaContable) {this.jTabbedPaneBusquedasHistorialFormaPago.remove(jPanelFK_IdCuentaContableHistorialFormaPago);}

			this.isVisibilidadFK_IdFactura=isParaPeriodoNegation;
			if(!this.isVisibilidadFK_IdFactura) {this.jTabbedPaneBusquedasHistorialFormaPago.remove(jPanelFK_IdFacturaHistorialFormaPago);}

			this.isVisibilidadFK_IdTipoFormaPago=isParaPeriodoNegation;
			if(!this.isVisibilidadFK_IdTipoFormaPago) {this.jTabbedPaneBusquedasHistorialFormaPago.remove(jPanelFK_IdTipoFormaPagoHistorialFormaPago);}
		}
		
	}

	public void setVisibilidadBusquedasParaFactura(Boolean isParaFactura){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaFacturaNegation=!isParaFactura;

			this.isVisibilidadFK_IdCuentaContable=isParaFacturaNegation;
			if(!this.isVisibilidadFK_IdCuentaContable) {this.jTabbedPaneBusquedasHistorialFormaPago.remove(jPanelFK_IdCuentaContableHistorialFormaPago);}

			this.isVisibilidadFK_IdFactura=isParaFactura;
			if(!this.isVisibilidadFK_IdFactura) {this.jTabbedPaneBusquedasHistorialFormaPago.remove(jPanelFK_IdFacturaHistorialFormaPago);}

			this.isVisibilidadFK_IdTipoFormaPago=isParaFacturaNegation;
			if(!this.isVisibilidadFK_IdTipoFormaPago) {this.jTabbedPaneBusquedasHistorialFormaPago.remove(jPanelFK_IdTipoFormaPagoHistorialFormaPago);}
		}
		
	}

	public void setVisibilidadBusquedasParaTipoFormaPago(Boolean isParaTipoFormaPago){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaTipoFormaPagoNegation=!isParaTipoFormaPago;

			this.isVisibilidadFK_IdCuentaContable=isParaTipoFormaPagoNegation;
			if(!this.isVisibilidadFK_IdCuentaContable) {this.jTabbedPaneBusquedasHistorialFormaPago.remove(jPanelFK_IdCuentaContableHistorialFormaPago);}

			this.isVisibilidadFK_IdFactura=isParaTipoFormaPagoNegation;
			if(!this.isVisibilidadFK_IdFactura) {this.jTabbedPaneBusquedasHistorialFormaPago.remove(jPanelFK_IdFacturaHistorialFormaPago);}

			this.isVisibilidadFK_IdTipoFormaPago=isParaTipoFormaPago;
			if(!this.isVisibilidadFK_IdTipoFormaPago) {this.jTabbedPaneBusquedasHistorialFormaPago.remove(jPanelFK_IdTipoFormaPagoHistorialFormaPago);}
		}
		
	}

	public void setVisibilidadBusquedasParaCuentaContable(Boolean isParaCuentaContable){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaCuentaContableNegation=!isParaCuentaContable;

			this.isVisibilidadFK_IdCuentaContable=isParaCuentaContable;
			if(!this.isVisibilidadFK_IdCuentaContable) {this.jTabbedPaneBusquedasHistorialFormaPago.remove(jPanelFK_IdCuentaContableHistorialFormaPago);}

			this.isVisibilidadFK_IdFactura=isParaCuentaContableNegation;
			if(!this.isVisibilidadFK_IdFactura) {this.jTabbedPaneBusquedasHistorialFormaPago.remove(jPanelFK_IdFacturaHistorialFormaPago);}

			this.isVisibilidadFK_IdTipoFormaPago=isParaCuentaContableNegation;
			if(!this.isVisibilidadFK_IdTipoFormaPago) {this.jTabbedPaneBusquedasHistorialFormaPago.remove(jPanelFK_IdTipoFormaPagoHistorialFormaPago);}
		}
		
	}

	public void setVisibilidadBusquedasParaAnio(Boolean isParaAnio){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaAnioNegation=!isParaAnio;

			this.isVisibilidadFK_IdCuentaContable=isParaAnioNegation;
			if(!this.isVisibilidadFK_IdCuentaContable) {this.jTabbedPaneBusquedasHistorialFormaPago.remove(jPanelFK_IdCuentaContableHistorialFormaPago);}

			this.isVisibilidadFK_IdFactura=isParaAnioNegation;
			if(!this.isVisibilidadFK_IdFactura) {this.jTabbedPaneBusquedasHistorialFormaPago.remove(jPanelFK_IdFacturaHistorialFormaPago);}

			this.isVisibilidadFK_IdTipoFormaPago=isParaAnioNegation;
			if(!this.isVisibilidadFK_IdTipoFormaPago) {this.jTabbedPaneBusquedasHistorialFormaPago.remove(jPanelFK_IdTipoFormaPagoHistorialFormaPago);}
		}
		
	}

	public void setVisibilidadBusquedasParaMes(Boolean isParaMes){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaMesNegation=!isParaMes;

			this.isVisibilidadFK_IdCuentaContable=isParaMesNegation;
			if(!this.isVisibilidadFK_IdCuentaContable) {this.jTabbedPaneBusquedasHistorialFormaPago.remove(jPanelFK_IdCuentaContableHistorialFormaPago);}

			this.isVisibilidadFK_IdFactura=isParaMesNegation;
			if(!this.isVisibilidadFK_IdFactura) {this.jTabbedPaneBusquedasHistorialFormaPago.remove(jPanelFK_IdFacturaHistorialFormaPago);}

			this.isVisibilidadFK_IdTipoFormaPago=isParaMesNegation;
			if(!this.isVisibilidadFK_IdTipoFormaPago) {this.jTabbedPaneBusquedasHistorialFormaPago.remove(jPanelFK_IdTipoFormaPagoHistorialFormaPago);}
		}
		
	}
	
	
	
	

	public String registrarSesionHistorialFormaPagoParaBusquedaFacturas() throws Exception {
		Boolean isPaginaPopupFactura=false;

		try {

			if(historialformapagoSessionBean==null) {
				historialformapagoSessionBean=new HistorialFormaPagoSessionBean();
			}

			if(facturaSessionBean==null) {
				facturaSessionBean=new FacturaSessionBean();
			}

			facturaSessionBean.setsPathNavegacionActual(historialformapagoSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+FacturaConstantesFunciones.SCLASSWEBTITULO);
			facturaSessionBean.setisPermiteRecargarInformacion(false);
			facturaSessionBean.setisPaginaPopup(true);
			isPaginaPopupFactura=facturaSessionBean.getisPaginaPopup();
			facturaSessionBean.setisPaginaPopup(false);
			facturaSessionBean.setEstaModoBusqueda(true);
			facturaSessionBean.setsFuncionBusquedaRapida("window.opener.historialformapagoFuncionGeneral.setCombosCodigoDesdeBusquedaid_factura(TO_REPLACE);");
			facturaSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeFactura(true);
			facturaSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeFactura(HistorialFormaPagoConstantesFunciones.SNOMBREOPCION);
			//facturaSessionBean.setisBusquedaDesdeForeignKeySesionHistorialFormaPago(true);
			//facturaSessionBean.setlidHistorialFormaPagoActual(this.idHistorialFormaPagoActual);

			historialformapagoSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyHistorialFormaPago(true);
			historialformapagoSessionBean.setlIdHistorialFormaPagoActualForeignKey(this.idHistorialFormaPagoActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
			return "";
	}

	public String registrarSesionHistorialFormaPagoParaBusquedaCuentaContables() throws Exception {
		Boolean isPaginaPopupCuentaContable=false;

		try {

			if(historialformapagoSessionBean==null) {
				historialformapagoSessionBean=new HistorialFormaPagoSessionBean();
			}

			if(cuentacontableSessionBean==null) {
				cuentacontableSessionBean=new CuentaContableSessionBean();
			}

			cuentacontableSessionBean.setsPathNavegacionActual(historialformapagoSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+CuentaContableConstantesFunciones.SCLASSWEBTITULO);
			cuentacontableSessionBean.setisPermiteRecargarInformacion(false);
			cuentacontableSessionBean.setisPaginaPopup(true);
			isPaginaPopupCuentaContable=cuentacontableSessionBean.getisPaginaPopup();
			cuentacontableSessionBean.setisPaginaPopup(false);
			cuentacontableSessionBean.setEstaModoBusqueda(true);
			cuentacontableSessionBean.setsFuncionBusquedaRapida("window.opener.historialformapagoFuncionGeneral.setCombosCodigoDesdeBusquedaid_cuenta_contable(TO_REPLACE);");
			cuentacontableSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeCuentaContable(true);
			cuentacontableSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeCuentaContable(HistorialFormaPagoConstantesFunciones.SNOMBREOPCION);
			//cuentacontableSessionBean.setisBusquedaDesdeForeignKeySesionHistorialFormaPago(true);
			//cuentacontableSessionBean.setlidHistorialFormaPagoActual(this.idHistorialFormaPagoActual);

			historialformapagoSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyHistorialFormaPago(true);
			historialformapagoSessionBean.setlIdHistorialFormaPagoActualForeignKey(this.idHistorialFormaPagoActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
			return "";
	}
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//HistorialFormaPagoSessionBean historialformapagoSessionBean=new HistorialFormaPagoSessionBean();
		
		if(this.historialformapagoSessionBean==null) {
			this.historialformapagoSessionBean=new HistorialFormaPagoSessionBean();
		}
		
		this.historialformapagoSessionBean.setsUltimaBusquedaHistorialFormaPago(this.getsAccionBusqueda());
		this.historialformapagoSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.historialformapagoSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdCuentaContable")) {
			historialformapagoSessionBean.setid_cuenta_contable(this.getid_cuenta_contableFK_IdCuentaContable());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdEjercicio")) {
			historialformapagoSessionBean.setid_ejercicio(this.getid_ejercicioFK_IdEjercicio());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			historialformapagoSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdFactura")) {
			historialformapagoSessionBean.setid_factura(this.getid_facturaFK_IdFactura());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdPeriodo")) {
			historialformapagoSessionBean.setid_periodo(this.getid_periodoFK_IdPeriodo());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdSucursal")) {
			historialformapagoSessionBean.setid_sucursal(this.getid_sucursalFK_IdSucursal());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdTipoFormaPago")) {
			historialformapagoSessionBean.setid_tipo_forma_pago(this.getid_tipo_forma_pagoFK_IdTipoFormaPago());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//HistorialFormaPagoSessionBean historialformapagoSessionBean=new HistorialFormaPagoSessionBean();
		
		if(this.historialformapagoSessionBean==null) {
			this.historialformapagoSessionBean=new HistorialFormaPagoSessionBean();
		}
		
		if(this.historialformapagoSessionBean.getsUltimaBusquedaHistorialFormaPago()!=null&&!this.historialformapagoSessionBean.getsUltimaBusquedaHistorialFormaPago().equals("")) {
			this.setsAccionBusqueda(historialformapagoSessionBean.getsUltimaBusquedaHistorialFormaPago());
			this.setiNumeroPaginacion(historialformapagoSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(historialformapagoSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdCuentaContable")) {
				this.setid_cuenta_contableFK_IdCuentaContable(historialformapagoSessionBean.getid_cuenta_contable());
				historialformapagoSessionBean.setid_cuenta_contable(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdEjercicio")) {
				this.setid_ejercicioFK_IdEjercicio(historialformapagoSessionBean.getid_ejercicio());
				historialformapagoSessionBean.setid_ejercicio(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(historialformapagoSessionBean.getid_empresa());
				historialformapagoSessionBean.setid_empresa(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdFactura")) {
				this.setid_facturaFK_IdFactura(historialformapagoSessionBean.getid_factura());
				historialformapagoSessionBean.setid_factura(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdPeriodo")) {
				this.setid_periodoFK_IdPeriodo(historialformapagoSessionBean.getid_periodo());
				historialformapagoSessionBean.setid_periodo(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdSucursal")) {
				this.setid_sucursalFK_IdSucursal(historialformapagoSessionBean.getid_sucursal());
				historialformapagoSessionBean.setid_sucursal(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdTipoFormaPago")) {
				this.setid_tipo_forma_pagoFK_IdTipoFormaPago(historialformapagoSessionBean.getid_tipo_forma_pago());
				historialformapagoSessionBean.setid_tipo_forma_pago(-1L);
			}
		}
		
		this.historialformapagoSessionBean.setsUltimaBusquedaHistorialFormaPago("");
		this.historialformapagoSessionBean.setiNumeroPaginacion(HistorialFormaPagoConstantesFunciones.INUMEROPAGINACION);
		this.historialformapagoSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaHistorialFormaPago(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioHistorialFormaPago() {
		this.updateBorderResaltarBusquedasFormularioHistorialFormaPago();
		this.updateVisibilidadBusquedasFormularioHistorialFormaPago();
		this.updateHabilitarBusquedasFormularioHistorialFormaPago();
	}
	
	public void updateBorderResaltarBusquedasFormularioHistorialFormaPago() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasHistorialFormaPago.getComponents().length>0) {
	

		if(this.historialformapagoConstantesFunciones.resaltarFK_IdCuentaContableHistorialFormaPago!=null) {
			index= this.jTabbedPaneBusquedasHistorialFormaPago.indexOfComponent(this.jPanelFK_IdCuentaContableHistorialFormaPago);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasHistorialFormaPago.getComponent(index);
				jPanel.setBorder(this.historialformapagoConstantesFunciones.resaltarFK_IdCuentaContableHistorialFormaPago);
			}
		}

		if(this.historialformapagoConstantesFunciones.resaltarFK_IdFacturaHistorialFormaPago!=null) {
			index= this.jTabbedPaneBusquedasHistorialFormaPago.indexOfComponent(this.jPanelFK_IdFacturaHistorialFormaPago);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasHistorialFormaPago.getComponent(index);
				jPanel.setBorder(this.historialformapagoConstantesFunciones.resaltarFK_IdFacturaHistorialFormaPago);
			}
		}

		if(this.historialformapagoConstantesFunciones.resaltarFK_IdTipoFormaPagoHistorialFormaPago!=null) {
			index= this.jTabbedPaneBusquedasHistorialFormaPago.indexOfComponent(this.jPanelFK_IdTipoFormaPagoHistorialFormaPago);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasHistorialFormaPago.getComponent(index);
				jPanel.setBorder(this.historialformapagoConstantesFunciones.resaltarFK_IdTipoFormaPagoHistorialFormaPago);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioHistorialFormaPago() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasHistorialFormaPago.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasHistorialFormaPago.indexOfComponent(this.jPanelFK_IdCuentaContableHistorialFormaPago);
			jPanel=(JPanel)this.jTabbedPaneBusquedasHistorialFormaPago.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.historialformapagoConstantesFunciones.mostrarFK_IdCuentaContableHistorialFormaPago);
			if(!this.historialformapagoConstantesFunciones.mostrarFK_IdCuentaContableHistorialFormaPago && index>-1) {
				this.jTabbedPaneBusquedasHistorialFormaPago.remove(index);
			}

			index= this.jTabbedPaneBusquedasHistorialFormaPago.indexOfComponent(this.jPanelFK_IdFacturaHistorialFormaPago);
			jPanel=(JPanel)this.jTabbedPaneBusquedasHistorialFormaPago.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.historialformapagoConstantesFunciones.mostrarFK_IdFacturaHistorialFormaPago);
			if(!this.historialformapagoConstantesFunciones.mostrarFK_IdFacturaHistorialFormaPago && index>-1) {
				this.jTabbedPaneBusquedasHistorialFormaPago.remove(index);
			}

			index= this.jTabbedPaneBusquedasHistorialFormaPago.indexOfComponent(this.jPanelFK_IdTipoFormaPagoHistorialFormaPago);
			jPanel=(JPanel)this.jTabbedPaneBusquedasHistorialFormaPago.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.historialformapagoConstantesFunciones.mostrarFK_IdTipoFormaPagoHistorialFormaPago);
			if(!this.historialformapagoConstantesFunciones.mostrarFK_IdTipoFormaPagoHistorialFormaPago && index>-1) {
				this.jTabbedPaneBusquedasHistorialFormaPago.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioHistorialFormaPago() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasHistorialFormaPago.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasHistorialFormaPago.indexOfComponent(this.jPanelFK_IdCuentaContableHistorialFormaPago);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasHistorialFormaPago.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.historialformapagoConstantesFunciones.activarFK_IdCuentaContableHistorialFormaPago);
				this.jTabbedPaneBusquedasHistorialFormaPago.setEnabledAt(index,this.historialformapagoConstantesFunciones.activarFK_IdCuentaContableHistorialFormaPago);
			}

			index= this.jTabbedPaneBusquedasHistorialFormaPago.indexOfComponent(this.jPanelFK_IdFacturaHistorialFormaPago);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasHistorialFormaPago.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.historialformapagoConstantesFunciones.activarFK_IdFacturaHistorialFormaPago);
				this.jTabbedPaneBusquedasHistorialFormaPago.setEnabledAt(index,this.historialformapagoConstantesFunciones.activarFK_IdFacturaHistorialFormaPago);
			}

			index= this.jTabbedPaneBusquedasHistorialFormaPago.indexOfComponent(this.jPanelFK_IdTipoFormaPagoHistorialFormaPago);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasHistorialFormaPago.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.historialformapagoConstantesFunciones.activarFK_IdTipoFormaPagoHistorialFormaPago);
				this.jTabbedPaneBusquedasHistorialFormaPago.setEnabledAt(index,this.historialformapagoConstantesFunciones.activarFK_IdTipoFormaPagoHistorialFormaPago);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaHistorialFormaPago(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("FK_IdCuentaContable")) {
			index= this.jTabbedPaneBusquedasHistorialFormaPago.indexOfComponent(this.jPanelFK_IdCuentaContableHistorialFormaPago);

			this.jTabbedPaneBusquedasHistorialFormaPago.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasHistorialFormaPago.getComponent(index);

			this.historialformapagoConstantesFunciones.setResaltarFK_IdCuentaContableHistorialFormaPago(resaltar);

			jPanel.setBorder(this.historialformapagoConstantesFunciones.resaltarFK_IdCuentaContableHistorialFormaPago);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdFactura")) {
			index= this.jTabbedPaneBusquedasHistorialFormaPago.indexOfComponent(this.jPanelFK_IdFacturaHistorialFormaPago);

			this.jTabbedPaneBusquedasHistorialFormaPago.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasHistorialFormaPago.getComponent(index);

			this.historialformapagoConstantesFunciones.setResaltarFK_IdFacturaHistorialFormaPago(resaltar);

			jPanel.setBorder(this.historialformapagoConstantesFunciones.resaltarFK_IdFacturaHistorialFormaPago);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdTipoFormaPago")) {
			index= this.jTabbedPaneBusquedasHistorialFormaPago.indexOfComponent(this.jPanelFK_IdTipoFormaPagoHistorialFormaPago);

			this.jTabbedPaneBusquedasHistorialFormaPago.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasHistorialFormaPago.getComponent(index);

			this.historialformapagoConstantesFunciones.setResaltarFK_IdTipoFormaPagoHistorialFormaPago(resaltar);

			jPanel.setBorder(this.historialformapagoConstantesFunciones.resaltarFK_IdTipoFormaPagoHistorialFormaPago);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarHistorialFormaPago.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioHistorialFormaPago() throws Exception {

		if(this.jInternalFrameDetalleFormHistorialFormaPago==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioHistorialFormaPago();
		this.updateVisibilidadResaltarControlesFormularioHistorialFormaPago();
		this.updateHabilitarResaltarControlesFormularioHistorialFormaPago();
		
	}
	
	public void updateBorderResaltarControlesFormularioHistorialFormaPago() throws Exception {
		if(this.jInternalFrameDetalleFormHistorialFormaPago==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.historialformapagoConstantesFunciones.resaltaridHistorialFormaPago!=null && this.jInternalFrameDetalleFormHistorialFormaPago!=null) {this.jInternalFrameDetalleFormHistorialFormaPago.jLabelidHistorialFormaPago.setBorder(this.historialformapagoConstantesFunciones.resaltaridHistorialFormaPago);}
		if(this.historialformapagoConstantesFunciones.resaltarid_empresaHistorialFormaPago!=null && this.jInternalFrameDetalleFormHistorialFormaPago!=null) {this.jInternalFrameDetalleFormHistorialFormaPago.jComboBoxid_empresaHistorialFormaPago.setBorder(this.historialformapagoConstantesFunciones.resaltarid_empresaHistorialFormaPago);}
		if(this.historialformapagoConstantesFunciones.resaltarid_sucursalHistorialFormaPago!=null && this.jInternalFrameDetalleFormHistorialFormaPago!=null) {this.jInternalFrameDetalleFormHistorialFormaPago.jComboBoxid_sucursalHistorialFormaPago.setBorder(this.historialformapagoConstantesFunciones.resaltarid_sucursalHistorialFormaPago);}
		if(this.historialformapagoConstantesFunciones.resaltarid_ejercicioHistorialFormaPago!=null && this.jInternalFrameDetalleFormHistorialFormaPago!=null) {this.jInternalFrameDetalleFormHistorialFormaPago.jComboBoxid_ejercicioHistorialFormaPago.setBorder(this.historialformapagoConstantesFunciones.resaltarid_ejercicioHistorialFormaPago);}
		if(this.historialformapagoConstantesFunciones.resaltarid_periodoHistorialFormaPago!=null && this.jInternalFrameDetalleFormHistorialFormaPago!=null) {this.jInternalFrameDetalleFormHistorialFormaPago.jComboBoxid_periodoHistorialFormaPago.setBorder(this.historialformapagoConstantesFunciones.resaltarid_periodoHistorialFormaPago);}
		if(this.historialformapagoConstantesFunciones.resaltarid_facturaHistorialFormaPago!=null && this.jInternalFrameDetalleFormHistorialFormaPago!=null) {this.jInternalFrameDetalleFormHistorialFormaPago.jComboBoxid_facturaHistorialFormaPago.setBorder(this.historialformapagoConstantesFunciones.resaltarid_facturaHistorialFormaPago);}
		if(this.historialformapagoConstantesFunciones.resaltarid_tipo_forma_pagoHistorialFormaPago!=null && this.jInternalFrameDetalleFormHistorialFormaPago!=null) {this.jInternalFrameDetalleFormHistorialFormaPago.jComboBoxid_tipo_forma_pagoHistorialFormaPago.setBorder(this.historialformapagoConstantesFunciones.resaltarid_tipo_forma_pagoHistorialFormaPago);}
		if(this.historialformapagoConstantesFunciones.resaltarid_cuenta_contableHistorialFormaPago!=null && this.jInternalFrameDetalleFormHistorialFormaPago!=null) {this.jInternalFrameDetalleFormHistorialFormaPago.jComboBoxid_cuenta_contableHistorialFormaPago.setBorder(this.historialformapagoConstantesFunciones.resaltarid_cuenta_contableHistorialFormaPago);}
		if(this.historialformapagoConstantesFunciones.resaltarnumero_diasHistorialFormaPago!=null && this.jInternalFrameDetalleFormHistorialFormaPago!=null) {this.jInternalFrameDetalleFormHistorialFormaPago.jTextFieldnumero_diasHistorialFormaPago.setBorder(this.historialformapagoConstantesFunciones.resaltarnumero_diasHistorialFormaPago);}
		if(this.historialformapagoConstantesFunciones.resaltarvalorHistorialFormaPago!=null && this.jInternalFrameDetalleFormHistorialFormaPago!=null) {this.jInternalFrameDetalleFormHistorialFormaPago.jTextFieldvalorHistorialFormaPago.setBorder(this.historialformapagoConstantesFunciones.resaltarvalorHistorialFormaPago);}
		if(this.historialformapagoConstantesFunciones.resaltarfechaHistorialFormaPago!=null && this.jInternalFrameDetalleFormHistorialFormaPago!=null) {this.jInternalFrameDetalleFormHistorialFormaPago.jDateChooserfechaHistorialFormaPago.setBorder(this.historialformapagoConstantesFunciones.resaltarfechaHistorialFormaPago);}
		if(this.historialformapagoConstantesFunciones.resaltarporcentajeHistorialFormaPago!=null && this.jInternalFrameDetalleFormHistorialFormaPago!=null) {this.jInternalFrameDetalleFormHistorialFormaPago.jTextFieldporcentajeHistorialFormaPago.setBorder(this.historialformapagoConstantesFunciones.resaltarporcentajeHistorialFormaPago);}
		if(this.historialformapagoConstantesFunciones.resaltarporcentaje_retencionHistorialFormaPago!=null && this.jInternalFrameDetalleFormHistorialFormaPago!=null) {this.jInternalFrameDetalleFormHistorialFormaPago.jTextFieldporcentaje_retencionHistorialFormaPago.setBorder(this.historialformapagoConstantesFunciones.resaltarporcentaje_retencionHistorialFormaPago);}
		if(this.historialformapagoConstantesFunciones.resaltarbase_retencionHistorialFormaPago!=null && this.jInternalFrameDetalleFormHistorialFormaPago!=null) {this.jInternalFrameDetalleFormHistorialFormaPago.jTextFieldbase_retencionHistorialFormaPago.setBorder(this.historialformapagoConstantesFunciones.resaltarbase_retencionHistorialFormaPago);}
		if(this.historialformapagoConstantesFunciones.resaltarnumero_retencionHistorialFormaPago!=null && this.jInternalFrameDetalleFormHistorialFormaPago!=null) {this.jInternalFrameDetalleFormHistorialFormaPago.jTextFieldnumero_retencionHistorialFormaPago.setBorder(this.historialformapagoConstantesFunciones.resaltarnumero_retencionHistorialFormaPago);}
		if(this.historialformapagoConstantesFunciones.resaltarnombre_retencionHistorialFormaPago!=null && this.jInternalFrameDetalleFormHistorialFormaPago!=null) {this.jInternalFrameDetalleFormHistorialFormaPago.jTextAreanombre_retencionHistorialFormaPago.setBorder(this.historialformapagoConstantesFunciones.resaltarnombre_retencionHistorialFormaPago);}
		if(this.historialformapagoConstantesFunciones.resaltarid_anioHistorialFormaPago!=null && this.jInternalFrameDetalleFormHistorialFormaPago!=null) {this.jInternalFrameDetalleFormHistorialFormaPago.jComboBoxid_anioHistorialFormaPago.setBorder(this.historialformapagoConstantesFunciones.resaltarid_anioHistorialFormaPago);}
		if(this.historialformapagoConstantesFunciones.resaltarid_mesHistorialFormaPago!=null && this.jInternalFrameDetalleFormHistorialFormaPago!=null) {this.jInternalFrameDetalleFormHistorialFormaPago.jComboBoxid_mesHistorialFormaPago.setBorder(this.historialformapagoConstantesFunciones.resaltarid_mesHistorialFormaPago);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioHistorialFormaPago() throws Exception {		
		if(this.jInternalFrameDetalleFormHistorialFormaPago==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormHistorialFormaPago!=null) {
	
		//this.jInternalFrameDetalleFormHistorialFormaPago.jLabelidHistorialFormaPago.setVisible(this.historialformapagoConstantesFunciones.mostraridHistorialFormaPago);
		this.jInternalFrameDetalleFormHistorialFormaPago.jPanelidHistorialFormaPago.setVisible(this.historialformapagoConstantesFunciones.mostraridHistorialFormaPago);
		//this.jInternalFrameDetalleFormHistorialFormaPago.jComboBoxid_empresaHistorialFormaPago.setVisible(this.historialformapagoConstantesFunciones.mostrarid_empresaHistorialFormaPago);
		this.jInternalFrameDetalleFormHistorialFormaPago.jPanelid_empresaHistorialFormaPago.setVisible(this.historialformapagoConstantesFunciones.mostrarid_empresaHistorialFormaPago);
		//this.jInternalFrameDetalleFormHistorialFormaPago.jComboBoxid_sucursalHistorialFormaPago.setVisible(this.historialformapagoConstantesFunciones.mostrarid_sucursalHistorialFormaPago);
		this.jInternalFrameDetalleFormHistorialFormaPago.jPanelid_sucursalHistorialFormaPago.setVisible(this.historialformapagoConstantesFunciones.mostrarid_sucursalHistorialFormaPago);
		//this.jInternalFrameDetalleFormHistorialFormaPago.jComboBoxid_ejercicioHistorialFormaPago.setVisible(this.historialformapagoConstantesFunciones.mostrarid_ejercicioHistorialFormaPago);
		this.jInternalFrameDetalleFormHistorialFormaPago.jPanelid_ejercicioHistorialFormaPago.setVisible(this.historialformapagoConstantesFunciones.mostrarid_ejercicioHistorialFormaPago);
		//this.jInternalFrameDetalleFormHistorialFormaPago.jComboBoxid_periodoHistorialFormaPago.setVisible(this.historialformapagoConstantesFunciones.mostrarid_periodoHistorialFormaPago);
		this.jInternalFrameDetalleFormHistorialFormaPago.jPanelid_periodoHistorialFormaPago.setVisible(this.historialformapagoConstantesFunciones.mostrarid_periodoHistorialFormaPago);
		//this.jInternalFrameDetalleFormHistorialFormaPago.jComboBoxid_facturaHistorialFormaPago.setVisible(this.historialformapagoConstantesFunciones.mostrarid_facturaHistorialFormaPago);
		this.jInternalFrameDetalleFormHistorialFormaPago.jPanelid_facturaHistorialFormaPago.setVisible(this.historialformapagoConstantesFunciones.mostrarid_facturaHistorialFormaPago);
			this.jInternalFrameDetalleFormHistorialFormaPago.jButtonid_facturaHistorialFormaPago.setVisible(this.historialformapagoConstantesFunciones.mostrarid_facturaHistorialFormaPago);
		//this.jInternalFrameDetalleFormHistorialFormaPago.jComboBoxid_tipo_forma_pagoHistorialFormaPago.setVisible(this.historialformapagoConstantesFunciones.mostrarid_tipo_forma_pagoHistorialFormaPago);
		this.jInternalFrameDetalleFormHistorialFormaPago.jPanelid_tipo_forma_pagoHistorialFormaPago.setVisible(this.historialformapagoConstantesFunciones.mostrarid_tipo_forma_pagoHistorialFormaPago);
		//this.jInternalFrameDetalleFormHistorialFormaPago.jComboBoxid_cuenta_contableHistorialFormaPago.setVisible(this.historialformapagoConstantesFunciones.mostrarid_cuenta_contableHistorialFormaPago);
		this.jInternalFrameDetalleFormHistorialFormaPago.jPanelid_cuenta_contableHistorialFormaPago.setVisible(this.historialformapagoConstantesFunciones.mostrarid_cuenta_contableHistorialFormaPago);
			this.jInternalFrameDetalleFormHistorialFormaPago.jButtonid_cuenta_contableHistorialFormaPago.setVisible(this.historialformapagoConstantesFunciones.mostrarid_cuenta_contableHistorialFormaPago);
		//this.jInternalFrameDetalleFormHistorialFormaPago.jTextFieldnumero_diasHistorialFormaPago.setVisible(this.historialformapagoConstantesFunciones.mostrarnumero_diasHistorialFormaPago);
		this.jInternalFrameDetalleFormHistorialFormaPago.jPanelnumero_diasHistorialFormaPago.setVisible(this.historialformapagoConstantesFunciones.mostrarnumero_diasHistorialFormaPago);
		//this.jInternalFrameDetalleFormHistorialFormaPago.jTextFieldvalorHistorialFormaPago.setVisible(this.historialformapagoConstantesFunciones.mostrarvalorHistorialFormaPago);
		this.jInternalFrameDetalleFormHistorialFormaPago.jPanelvalorHistorialFormaPago.setVisible(this.historialformapagoConstantesFunciones.mostrarvalorHistorialFormaPago);
		//this.jInternalFrameDetalleFormHistorialFormaPago.jDateChooserfechaHistorialFormaPago.setVisible(this.historialformapagoConstantesFunciones.mostrarfechaHistorialFormaPago);
		this.jInternalFrameDetalleFormHistorialFormaPago.jPanelfechaHistorialFormaPago.setVisible(this.historialformapagoConstantesFunciones.mostrarfechaHistorialFormaPago);
		//this.jInternalFrameDetalleFormHistorialFormaPago.jTextFieldporcentajeHistorialFormaPago.setVisible(this.historialformapagoConstantesFunciones.mostrarporcentajeHistorialFormaPago);
		this.jInternalFrameDetalleFormHistorialFormaPago.jPanelporcentajeHistorialFormaPago.setVisible(this.historialformapagoConstantesFunciones.mostrarporcentajeHistorialFormaPago);
		//this.jInternalFrameDetalleFormHistorialFormaPago.jTextFieldporcentaje_retencionHistorialFormaPago.setVisible(this.historialformapagoConstantesFunciones.mostrarporcentaje_retencionHistorialFormaPago);
		this.jInternalFrameDetalleFormHistorialFormaPago.jPanelporcentaje_retencionHistorialFormaPago.setVisible(this.historialformapagoConstantesFunciones.mostrarporcentaje_retencionHistorialFormaPago);
		//this.jInternalFrameDetalleFormHistorialFormaPago.jTextFieldbase_retencionHistorialFormaPago.setVisible(this.historialformapagoConstantesFunciones.mostrarbase_retencionHistorialFormaPago);
		this.jInternalFrameDetalleFormHistorialFormaPago.jPanelbase_retencionHistorialFormaPago.setVisible(this.historialformapagoConstantesFunciones.mostrarbase_retencionHistorialFormaPago);
		//this.jInternalFrameDetalleFormHistorialFormaPago.jTextFieldnumero_retencionHistorialFormaPago.setVisible(this.historialformapagoConstantesFunciones.mostrarnumero_retencionHistorialFormaPago);
		this.jInternalFrameDetalleFormHistorialFormaPago.jPanelnumero_retencionHistorialFormaPago.setVisible(this.historialformapagoConstantesFunciones.mostrarnumero_retencionHistorialFormaPago);
		//this.jInternalFrameDetalleFormHistorialFormaPago.jTextAreanombre_retencionHistorialFormaPago.setVisible(this.historialformapagoConstantesFunciones.mostrarnombre_retencionHistorialFormaPago);
		this.jInternalFrameDetalleFormHistorialFormaPago.jPanelnombre_retencionHistorialFormaPago.setVisible(this.historialformapagoConstantesFunciones.mostrarnombre_retencionHistorialFormaPago);
		//this.jInternalFrameDetalleFormHistorialFormaPago.jComboBoxid_anioHistorialFormaPago.setVisible(this.historialformapagoConstantesFunciones.mostrarid_anioHistorialFormaPago);
		this.jInternalFrameDetalleFormHistorialFormaPago.jPanelid_anioHistorialFormaPago.setVisible(this.historialformapagoConstantesFunciones.mostrarid_anioHistorialFormaPago);
		//this.jInternalFrameDetalleFormHistorialFormaPago.jComboBoxid_mesHistorialFormaPago.setVisible(this.historialformapagoConstantesFunciones.mostrarid_mesHistorialFormaPago);
		this.jInternalFrameDetalleFormHistorialFormaPago.jPanelid_mesHistorialFormaPago.setVisible(this.historialformapagoConstantesFunciones.mostrarid_mesHistorialFormaPago);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioHistorialFormaPago() throws Exception {
		if(this.jInternalFrameDetalleFormHistorialFormaPago==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormHistorialFormaPago!=null) {
	
		this.jInternalFrameDetalleFormHistorialFormaPago.jLabelidHistorialFormaPago.setEnabled(this.historialformapagoConstantesFunciones.activaridHistorialFormaPago);
		this.jInternalFrameDetalleFormHistorialFormaPago.jComboBoxid_empresaHistorialFormaPago.setEnabled(this.historialformapagoConstantesFunciones.activarid_empresaHistorialFormaPago);
		this.jInternalFrameDetalleFormHistorialFormaPago.jComboBoxid_sucursalHistorialFormaPago.setEnabled(this.historialformapagoConstantesFunciones.activarid_sucursalHistorialFormaPago);
		this.jInternalFrameDetalleFormHistorialFormaPago.jComboBoxid_ejercicioHistorialFormaPago.setEnabled(this.historialformapagoConstantesFunciones.activarid_ejercicioHistorialFormaPago);
		this.jInternalFrameDetalleFormHistorialFormaPago.jComboBoxid_periodoHistorialFormaPago.setEnabled(this.historialformapagoConstantesFunciones.activarid_periodoHistorialFormaPago);
		this.jInternalFrameDetalleFormHistorialFormaPago.jComboBoxid_facturaHistorialFormaPago.setEnabled(this.historialformapagoConstantesFunciones.activarid_facturaHistorialFormaPago);
			this.jInternalFrameDetalleFormHistorialFormaPago.jButtonid_facturaHistorialFormaPago.setEnabled(this.historialformapagoConstantesFunciones.activarid_facturaHistorialFormaPago);
		this.jInternalFrameDetalleFormHistorialFormaPago.jComboBoxid_tipo_forma_pagoHistorialFormaPago.setEnabled(this.historialformapagoConstantesFunciones.activarid_tipo_forma_pagoHistorialFormaPago);
		this.jInternalFrameDetalleFormHistorialFormaPago.jComboBoxid_cuenta_contableHistorialFormaPago.setEnabled(this.historialformapagoConstantesFunciones.activarid_cuenta_contableHistorialFormaPago);
			this.jInternalFrameDetalleFormHistorialFormaPago.jButtonid_cuenta_contableHistorialFormaPago.setEnabled(this.historialformapagoConstantesFunciones.activarid_cuenta_contableHistorialFormaPago);
		this.jInternalFrameDetalleFormHistorialFormaPago.jTextFieldnumero_diasHistorialFormaPago.setEnabled(this.historialformapagoConstantesFunciones.activarnumero_diasHistorialFormaPago);
		this.jInternalFrameDetalleFormHistorialFormaPago.jTextFieldvalorHistorialFormaPago.setEnabled(this.historialformapagoConstantesFunciones.activarvalorHistorialFormaPago);
		this.jInternalFrameDetalleFormHistorialFormaPago.jDateChooserfechaHistorialFormaPago.setEnabled(this.historialformapagoConstantesFunciones.activarfechaHistorialFormaPago);
		this.jInternalFrameDetalleFormHistorialFormaPago.jTextFieldporcentajeHistorialFormaPago.setEnabled(this.historialformapagoConstantesFunciones.activarporcentajeHistorialFormaPago);
		this.jInternalFrameDetalleFormHistorialFormaPago.jTextFieldporcentaje_retencionHistorialFormaPago.setEnabled(this.historialformapagoConstantesFunciones.activarporcentaje_retencionHistorialFormaPago);
		this.jInternalFrameDetalleFormHistorialFormaPago.jTextFieldbase_retencionHistorialFormaPago.setEnabled(this.historialformapagoConstantesFunciones.activarbase_retencionHistorialFormaPago);
		this.jInternalFrameDetalleFormHistorialFormaPago.jTextFieldnumero_retencionHistorialFormaPago.setEnabled(this.historialformapagoConstantesFunciones.activarnumero_retencionHistorialFormaPago);
		this.jInternalFrameDetalleFormHistorialFormaPago.jTextAreanombre_retencionHistorialFormaPago.setEnabled(this.historialformapagoConstantesFunciones.activarnombre_retencionHistorialFormaPago);
		this.jInternalFrameDetalleFormHistorialFormaPago.jComboBoxid_anioHistorialFormaPago.setEnabled(this.historialformapagoConstantesFunciones.activarid_anioHistorialFormaPago);
		this.jInternalFrameDetalleFormHistorialFormaPago.jComboBoxid_mesHistorialFormaPago.setEnabled(this.historialformapagoConstantesFunciones.activarid_mesHistorialFormaPago);
		}
	}
	
		
}