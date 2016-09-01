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
package com.bydan.erp.cartera.presentation.swing.jinternalframes;




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

import com.bydan.erp.cartera.util.CuentaPorCobrarConstantesFunciones;
import com.bydan.erp.cartera.util.CuentaPorCobrarParameterReturnGeneral;
//import com.bydan.erp.cartera.util.CuentaPorCobrarParameterGeneral;
//import com.bydan.erp.cartera.presentation.report.source.CuentaPorCobrarBean;
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

import com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar.*;
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
import com.bydan.erp.cartera.resources.reportes.AuxiliarReportes;


import com.bydan.erp.cartera.util.*;
import com.bydan.erp.cartera.business.logic.*;

import com.bydan.erp.seguridad.business.logic.*;
import com.bydan.erp.contabilidad.business.logic.*;
import com.bydan.erp.tesoreria.business.logic.*;
import com.bydan.erp.facturacion.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.cartera.business.entity.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;

import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.auxiliar.*;
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


import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;

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
import com.bydan.erp.tesoreria.business.entity.*;
import com.bydan.erp.facturacion.business.entity.*;
import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.contabilidad.util.*;
import com.bydan.erp.tesoreria.util.*;
import com.bydan.erp.facturacion.util.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class CuentaPorCobrarBeanSwingJInternalFrame extends CuentaPorCobrarJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(CuentaPorCobrarBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<CuentaPorCobrar> cuentaporcobrarValidator = new ClassValidator<CuentaPorCobrar>(CuentaPorCobrar.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public CuentaPorCobrar cuentaporcobrar;	
	public CuentaPorCobrar cuentaporcobrarAux;
	public CuentaPorCobrar cuentaporcobrarAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public CuentaPorCobrar cuentaporcobrarTotales;
	public Long idCuentaPorCobrarActual;
	public Long iIdNuevoCuentaPorCobrar=0L;
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

	public String sFinalQueryComboModulo="";

	public List<Modulo> modulosForeignKey;

	public List<Modulo> getmodulosForeignKey() {
		return modulosForeignKey;
	}

	public void setmodulosForeignKey(List<Modulo> modulosForeignKey) {
		this.modulosForeignKey = modulosForeignKey;
	}

	//OBJETO FK ACTUAL
	public Modulo moduloForeignKey;

	public Modulo getmoduloForeignKey() {
		return moduloForeignKey;
	}

	public void setmoduloForeignKey(Modulo moduloForeignKey) {
		this.moduloForeignKey = moduloForeignKey;
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

	public String sFinalQueryComboMoneda="";

	public List<Moneda> monedasForeignKey;

	public List<Moneda> getmonedasForeignKey() {
		return monedasForeignKey;
	}

	public void setmonedasForeignKey(List<Moneda> monedasForeignKey) {
		this.monedasForeignKey = monedasForeignKey;
	}

	//OBJETO FK ACTUAL
	public Moneda monedaForeignKey;

	public Moneda getmonedaForeignKey() {
		return monedaForeignKey;
	}

	public void setmonedaForeignKey(Moneda monedaForeignKey) {
		this.monedaForeignKey = monedaForeignKey;
	}

	public String sFinalQueryComboCliente="";

	public List<Cliente> clientesForeignKey;

	public List<Cliente> getclientesForeignKey() {
		return clientesForeignKey;
	}

	public void setclientesForeignKey(List<Cliente> clientesForeignKey) {
		this.clientesForeignKey = clientesForeignKey;
	}

	//OBJETO FK ACTUAL
	public Cliente clienteForeignKey;

	public Cliente getclienteForeignKey() {
		return clienteForeignKey;
	}

	public void setclienteForeignKey(Cliente clienteForeignKey) {
		this.clienteForeignKey = clienteForeignKey;
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

	public String sFinalQueryComboTipoTransaccionModulo="";

	public List<TipoTransaccionModulo> tipotransaccionmodulosForeignKey;

	public List<TipoTransaccionModulo> gettipotransaccionmodulosForeignKey() {
		return tipotransaccionmodulosForeignKey;
	}

	public void settipotransaccionmodulosForeignKey(List<TipoTransaccionModulo> tipotransaccionmodulosForeignKey) {
		this.tipotransaccionmodulosForeignKey = tipotransaccionmodulosForeignKey;
	}

	//OBJETO FK ACTUAL
	public TipoTransaccionModulo tipotransaccionmoduloForeignKey;

	public TipoTransaccionModulo gettipotransaccionmoduloForeignKey() {
		return tipotransaccionmoduloForeignKey;
	}

	public void settipotransaccionmoduloForeignKey(TipoTransaccionModulo tipotransaccionmoduloForeignKey) {
		this.tipotransaccionmoduloForeignKey = tipotransaccionmoduloForeignKey;
	}

	public String sFinalQueryComboAsientoContable="";

	public List<AsientoContable> asientocontablesForeignKey;

	public List<AsientoContable> getasientocontablesForeignKey() {
		return asientocontablesForeignKey;
	}

	public void setasientocontablesForeignKey(List<AsientoContable> asientocontablesForeignKey) {
		this.asientocontablesForeignKey = asientocontablesForeignKey;
	}

	//OBJETO FK ACTUAL
	public AsientoContable asientocontableForeignKey;

	public AsientoContable getasientocontableForeignKey() {
		return asientocontableForeignKey;
	}

	public void setasientocontableForeignKey(AsientoContable asientocontableForeignKey) {
		this.asientocontableForeignKey = asientocontableForeignKey;
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

		
	
	
	
	//BUSQUEDA INTERNA FK
	public Long idClienteActual=0L;

	public Long getidClienteActual() {
		return idClienteActual;
	}

	public void setidClienteActual(Long idClienteActual) {
		this.idClienteActual= idClienteActual;
	}
	public Long idAsientoContableActual=0L;

	public Long getidAsientoContableActual() {
		return idAsientoContableActual;
	}

	public void setidAsientoContableActual(Long idAsientoContableActual) {
		this.idAsientoContableActual= idAsientoContableActual;
	}
	public Long idFacturaActual=0L;

	public Long getidFacturaActual() {
		return idFacturaActual;
	}

	public void setidFacturaActual(Long idFacturaActual) {
		this.idFacturaActual= idFacturaActual;
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
	
	public Boolean isPermisoTodoCuentaPorCobrar;
	public Boolean isPermisoNuevoCuentaPorCobrar;
	public Boolean isPermisoActualizarCuentaPorCobrar;
	public Boolean isPermisoActualizarOriginalCuentaPorCobrar;
	public Boolean isPermisoEliminarCuentaPorCobrar;
	public Boolean isPermisoGuardarCambiosCuentaPorCobrar;
	public Boolean isPermisoConsultaCuentaPorCobrar;
	public Boolean isPermisoBusquedaCuentaPorCobrar;
	public Boolean isPermisoReporteCuentaPorCobrar;
	public Boolean isPermisoPaginacionMedioCuentaPorCobrar;
	public Boolean isPermisoPaginacionAltoCuentaPorCobrar;
	public Boolean isPermisoPaginacionTodoCuentaPorCobrar;
	public Boolean isPermisoCopiarCuentaPorCobrar;
	public Boolean isPermisoVerFormCuentaPorCobrar;
	public Boolean isPermisoDuplicarCuentaPorCobrar;
	public Boolean isPermisoOrdenCuentaPorCobrar;
	
	
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
	
	public CuentaPorCobrarParameterReturnGeneral cuentaporcobrarReturnGeneral;
	public CuentaPorCobrarParameterReturnGeneral cuentaporcobrarParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoCuentaPorCobrar=false;
	public Boolean esParaAccionDesdeFormularioCuentaPorCobrar=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected CuentaPorCobrarSessionBeanAdditional cuentaporcobrarSessionBeanAdditional=null;
	
	public CuentaPorCobrarSessionBeanAdditional getCuentaPorCobrarSessionBeanAdditional() {
		return this.cuentaporcobrarSessionBeanAdditional;
	}
	
	public void setCuentaPorCobrarSessionBeanAdditional(CuentaPorCobrarSessionBeanAdditional cuentaporcobrarSessionBeanAdditional) {
		try {
			this.cuentaporcobrarSessionBeanAdditional=cuentaporcobrarSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected CuentaPorCobrarBeanSwingJInternalFrameAdditional cuentaporcobrarBeanSwingJInternalFrameAdditional=null;
	//public class CuentaPorCobrarBeanSwingJInternalFrame
	
	public CuentaPorCobrarBeanSwingJInternalFrameAdditional getCuentaPorCobrarBeanSwingJInternalFrameAdditional() {
		return this.cuentaporcobrarBeanSwingJInternalFrameAdditional;
	}
	
	public void setCuentaPorCobrarBeanSwingJInternalFrameAdditional(CuentaPorCobrarBeanSwingJInternalFrameAdditional cuentaporcobrarBeanSwingJInternalFrameAdditional) {
		try {
			this.cuentaporcobrarBeanSwingJInternalFrameAdditional=cuentaporcobrarBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public CuentaPorCobrarLogic cuentaporcobrarLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public CuentaPorCobrar cuentaporcobrarBean;
	public CuentaPorCobrarConstantesFunciones cuentaporcobrarConstantesFunciones;
	//public CuentaPorCobrarParameterReturnGeneral cuentaporcobrarReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	public SucursalLogic sucursalLogic;
	public ModuloLogic moduloLogic;
	public EjercicioLogic ejercicioLogic;
	public MonedaLogic monedaLogic;
	public ClienteLogic clienteLogic;
	public TransaccionLogic transaccionLogic;
	public TipoTransaccionModuloLogic tipotransaccionmoduloLogic;
	public AsientoContableLogic asientocontableLogic;
	public FacturaLogic facturaLogic;
	
	//PARAMETROS
	
	
	//public List<CuentaPorCobrar> cuentaporcobrars;	
	//public List<CuentaPorCobrar> cuentaporcobrarsEliminados;
	//public List<CuentaPorCobrar> cuentaporcobrarsAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoCuentaPorCobrar=false;
	public Boolean isVisibilidadCeldaDuplicarCuentaPorCobrar=true;
	public Boolean isVisibilidadCeldaCopiarCuentaPorCobrar=true;
	public Boolean isVisibilidadCeldaVerFormCuentaPorCobrar=true;
	public Boolean isVisibilidadCeldaOrdenCuentaPorCobrar=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesCuentaPorCobrar=false;
	public Boolean isVisibilidadCeldaModificarCuentaPorCobrar=false;
	public Boolean isVisibilidadCeldaActualizarCuentaPorCobrar=false;
	public Boolean isVisibilidadCeldaEliminarCuentaPorCobrar=false;
	public Boolean isVisibilidadCeldaCancelarCuentaPorCobrar=false;
	public Boolean isVisibilidadCeldaGuardarCuentaPorCobrar=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosCuentaPorCobrar=false;	
	
	
	public Boolean isVisibilidadFK_IdAsientoContable=false;
	public Boolean isVisibilidadFK_IdCliente=false;
	public Boolean isVisibilidadFK_IdEjercicio=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	public Boolean isVisibilidadFK_IdFactura=false;
	public Boolean isVisibilidadFK_IdModulo=false;
	public Boolean isVisibilidadFK_IdMoneda=false;
	public Boolean isVisibilidadFK_IdSucursal=false;
	public Boolean isVisibilidadFK_IdTipoTransaccionModulo=false;
	public Boolean isVisibilidadFK_IdTransaccion=false;
	
	public Long getiIdNuevoCuentaPorCobrar() {
		return this.iIdNuevoCuentaPorCobrar;
	}

	public void setiIdNuevoCuentaPorCobrar(Long iIdNuevoCuentaPorCobrar) {
		this.iIdNuevoCuentaPorCobrar = iIdNuevoCuentaPorCobrar;
	}
	
	public Long getidCuentaPorCobrarActual() {
		return this.idCuentaPorCobrarActual;
	}

	public void setidCuentaPorCobrarActual(Long idCuentaPorCobrarActual) {
		this.idCuentaPorCobrarActual = idCuentaPorCobrarActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public CuentaPorCobrar getcuentaporcobrar() {
		return this.cuentaporcobrar;
	}

	public void setcuentaporcobrar(CuentaPorCobrar cuentaporcobrar) {
		this.cuentaporcobrar = cuentaporcobrar;
	}
	
	public CuentaPorCobrar getcuentaporcobrarAux() {
		return this.cuentaporcobrarAux;
	}

	public void setcuentaporcobrarAux(CuentaPorCobrar cuentaporcobrarAux) {
		this.cuentaporcobrarAux = cuentaporcobrarAux;
	}				
	
	public CuentaPorCobrar getcuentaporcobrarAnterior() {
		return this.cuentaporcobrarAnterior;
	}

	public void setcuentaporcobrarAnterior(CuentaPorCobrar cuentaporcobrarAnterior) {
		this.cuentaporcobrarAnterior = cuentaporcobrarAnterior;
	}	
	
	public CuentaPorCobrar getcuentaporcobrarTotales() {
		return this.cuentaporcobrarTotales;
	}

	public void setcuentaporcobrarTotales(CuentaPorCobrar cuentaporcobrarTotales) {
		this.cuentaporcobrarTotales = cuentaporcobrarTotales;
	}	
	
	public CuentaPorCobrar getcuentaporcobrarBean() {
		return this.cuentaporcobrarBean;
	}

	public void setcuentaporcobrarBean(CuentaPorCobrar cuentaporcobrarBean) {
		this.cuentaporcobrarBean = cuentaporcobrarBean;
	}	
	
	public CuentaPorCobrarParameterReturnGeneral getcuentaporcobrarReturnGeneral() {
		return this.cuentaporcobrarReturnGeneral;
	}

	public void setcuentaporcobrarReturnGeneral(CuentaPorCobrarParameterReturnGeneral cuentaporcobrarReturnGeneral) {
		this.cuentaporcobrarReturnGeneral = cuentaporcobrarReturnGeneral;
	}	
	
	
	public Long id_asiento_contableFK_IdAsientoContable=-1L;

	public Long getid_asiento_contableFK_IdAsientoContable() {
		return this.id_asiento_contableFK_IdAsientoContable;
	}

	public void setid_asiento_contableFK_IdAsientoContable(Long id_asiento_contableFK_IdAsientoContable) {
		this.id_asiento_contableFK_IdAsientoContable = id_asiento_contableFK_IdAsientoContable;
	}

	public Long id_clienteFK_IdCliente=-1L;

	public Long getid_clienteFK_IdCliente() {
		return this.id_clienteFK_IdCliente;
	}

	public void setid_clienteFK_IdCliente(Long id_clienteFK_IdCliente) {
		this.id_clienteFK_IdCliente = id_clienteFK_IdCliente;
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

	public Long id_moduloFK_IdModulo=-1L;

	public Long getid_moduloFK_IdModulo() {
		return this.id_moduloFK_IdModulo;
	}

	public void setid_moduloFK_IdModulo(Long id_moduloFK_IdModulo) {
		this.id_moduloFK_IdModulo = id_moduloFK_IdModulo;
	}

	public Long id_monedaFK_IdMoneda=-1L;

	public Long getid_monedaFK_IdMoneda() {
		return this.id_monedaFK_IdMoneda;
	}

	public void setid_monedaFK_IdMoneda(Long id_monedaFK_IdMoneda) {
		this.id_monedaFK_IdMoneda = id_monedaFK_IdMoneda;
	}

	public Long id_sucursalFK_IdSucursal=-1L;

	public Long getid_sucursalFK_IdSucursal() {
		return this.id_sucursalFK_IdSucursal;
	}

	public void setid_sucursalFK_IdSucursal(Long id_sucursalFK_IdSucursal) {
		this.id_sucursalFK_IdSucursal = id_sucursalFK_IdSucursal;
	}

	public Long id_tipo_transaccion_moduloFK_IdTipoTransaccionModulo=null;

	public Long getid_tipo_transaccion_moduloFK_IdTipoTransaccionModulo() {
		return this.id_tipo_transaccion_moduloFK_IdTipoTransaccionModulo;
	}

	public void setid_tipo_transaccion_moduloFK_IdTipoTransaccionModulo(Long id_tipo_transaccion_moduloFK_IdTipoTransaccionModulo) {
		this.id_tipo_transaccion_moduloFK_IdTipoTransaccionModulo = id_tipo_transaccion_moduloFK_IdTipoTransaccionModulo;
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
	
	
	public CuentaPorCobrarLogic getCuentaPorCobrarLogic()	{		
		return cuentaporcobrarLogic;
	}

	public void setCuentaPorCobrarLogic(CuentaPorCobrarLogic cuentaporcobrarLogic) {
		this.cuentaporcobrarLogic = cuentaporcobrarLogic;
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
	
	public Boolean getIsEsNuevoCuentaPorCobrar() {
		return isEsNuevoCuentaPorCobrar;
	}

	public void setIsEsNuevoCuentaPorCobrar(Boolean isEsNuevoCuentaPorCobrar) {
		this.isEsNuevoCuentaPorCobrar = isEsNuevoCuentaPorCobrar;
	}

	public Boolean getEsParaAccionDesdeFormularioCuentaPorCobrar() {
		return esParaAccionDesdeFormularioCuentaPorCobrar;
	}
	
	public void setEsParaAccionDesdeFormularioCuentaPorCobrar(Boolean esParaAccionDesdeFormularioCuentaPorCobrar) {
		this.esParaAccionDesdeFormularioCuentaPorCobrar = esParaAccionDesdeFormularioCuentaPorCobrar;
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

			if(this.cuentaporcobrarSessionBean==null) {
				this.cuentaporcobrarSessionBean=new CuentaPorCobrarSessionBean();
			}

			if(!this.cuentaporcobrarSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(cuentaporcobrarSessionBean.getlidEmpresaActual());
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

			if(this.cuentaporcobrarSessionBean==null) {
				this.cuentaporcobrarSessionBean=new CuentaPorCobrarSessionBean();
			}

			if(!this.cuentaporcobrarSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
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
					sucursalLogic.getEntityWithConnection(cuentaporcobrarSessionBean.getlidSucursalActual());
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

	public void cargarCombosModulosForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.modulosForeignKey=new ArrayList<Modulo>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			ModuloLogic moduloLogic=new ModuloLogic();

			//moduloLogic.getModuloDataAccess().setIsForForeingKeyData(true);

			if(this.cuentaporcobrarSessionBean==null) {
				this.cuentaporcobrarSessionBean=new CuentaPorCobrarSessionBean();
			}

			if(!this.cuentaporcobrarSessionBean.getisBusquedaDesdeForeignKeySesionModulo()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//moduloLogic.getModuloDataAccess().setIsForForeingKeyData(true);

					moduloLogic.getTodosModulosWithConnection(sFinalQuery,new Pagination());

					this.modulosForeignKey=moduloLogic.getModulos();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaModulo(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					moduloLogic.getEntityWithConnection(cuentaporcobrarSessionBean.getlidModuloActual());
					this.modulosForeignKey.add(moduloLogic.getModulo());
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

			if(this.cuentaporcobrarSessionBean==null) {
				this.cuentaporcobrarSessionBean=new CuentaPorCobrarSessionBean();
			}

			if(!this.cuentaporcobrarSessionBean.getisBusquedaDesdeForeignKeySesionEjercicio()) {
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
					ejercicioLogic.getEntityWithConnection(cuentaporcobrarSessionBean.getlidEjercicioActual());
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

	public void cargarCombosMonedasForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.monedasForeignKey=new ArrayList<Moneda>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			MonedaLogic monedaLogic=new MonedaLogic();

			//monedaLogic.getMonedaDataAccess().setIsForForeingKeyData(true);

			if(this.cuentaporcobrarSessionBean==null) {
				this.cuentaporcobrarSessionBean=new CuentaPorCobrarSessionBean();
			}

			if(!this.cuentaporcobrarSessionBean.getisBusquedaDesdeForeignKeySesionMoneda()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//monedaLogic.getMonedaDataAccess().setIsForForeingKeyData(true);

					monedaLogic.getTodosMonedasWithConnection(sFinalQuery,new Pagination());

					this.monedasForeignKey=monedaLogic.getMonedas();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaMoneda(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					monedaLogic.getEntityWithConnection(cuentaporcobrarSessionBean.getlidMonedaActual());
					this.monedasForeignKey.add(monedaLogic.getMoneda());
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

	public void cargarCombosClientesForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.clientesForeignKey=new ArrayList<Cliente>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			ClienteLogic clienteLogic=new ClienteLogic();

			//clienteLogic.getClienteDataAccess().setIsForForeingKeyData(true);

			if(this.cuentaporcobrarSessionBean==null) {
				this.cuentaporcobrarSessionBean=new CuentaPorCobrarSessionBean();
			}

			if(!this.cuentaporcobrarSessionBean.getisBusquedaDesdeForeignKeySesionCliente()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//clienteLogic.getClienteDataAccess().setIsForForeingKeyData(true);

					clienteLogic.getTodosClientesWithConnection(sFinalQuery,new Pagination());

					this.clientesForeignKey=clienteLogic.getClientes();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaCliente(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					clienteLogic.getEntityWithConnection(cuentaporcobrarSessionBean.getlidClienteActual());
					this.clientesForeignKey.add(clienteLogic.getCliente());
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

			if(this.cuentaporcobrarSessionBean==null) {
				this.cuentaporcobrarSessionBean=new CuentaPorCobrarSessionBean();
			}

			if(!this.cuentaporcobrarSessionBean.getisBusquedaDesdeForeignKeySesionTransaccion()) {
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
					transaccionLogic.getEntityWithConnection(cuentaporcobrarSessionBean.getlidTransaccionActual());
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

	public void cargarCombosTipoTransaccionModulosForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.tipotransaccionmodulosForeignKey=new ArrayList<TipoTransaccionModulo>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			TipoTransaccionModuloLogic tipotransaccionmoduloLogic=new TipoTransaccionModuloLogic();

			//tipotransaccionmoduloLogic.getTipoTransaccionModuloDataAccess().setIsForForeingKeyData(true);

			if(this.cuentaporcobrarSessionBean==null) {
				this.cuentaporcobrarSessionBean=new CuentaPorCobrarSessionBean();
			}

			if(!this.cuentaporcobrarSessionBean.getisBusquedaDesdeForeignKeySesionTipoTransaccionModulo()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//tipotransaccionmoduloLogic.getTipoTransaccionModuloDataAccess().setIsForForeingKeyData(true);

					tipotransaccionmoduloLogic.getTodosTipoTransaccionModulosWithConnection(sFinalQuery,new Pagination());

					this.tipotransaccionmodulosForeignKey=tipotransaccionmoduloLogic.getTipoTransaccionModulos();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaTipoTransaccionModulo(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipotransaccionmoduloLogic.getEntityWithConnection(cuentaporcobrarSessionBean.getlidTipoTransaccionModuloActual());
					this.tipotransaccionmodulosForeignKey.add(tipotransaccionmoduloLogic.getTipoTransaccionModulo());
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

	public void cargarCombosAsientoContablesForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.asientocontablesForeignKey=new ArrayList<AsientoContable>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			AsientoContableLogic asientocontableLogic=new AsientoContableLogic();

			//asientocontableLogic.getAsientoContableDataAccess().setIsForForeingKeyData(true);

			if(this.cuentaporcobrarSessionBean==null) {
				this.cuentaporcobrarSessionBean=new CuentaPorCobrarSessionBean();
			}

			if(!this.cuentaporcobrarSessionBean.getisBusquedaDesdeForeignKeySesionAsientoContable()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//asientocontableLogic.getAsientoContableDataAccess().setIsForForeingKeyData(true);

					asientocontableLogic.getTodosAsientoContablesWithConnection(sFinalQuery,new Pagination());

					this.asientocontablesForeignKey=asientocontableLogic.getAsientoContables();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaAsientoContable(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					asientocontableLogic.getEntityWithConnection(cuentaporcobrarSessionBean.getlidAsientoContableActual());
					this.asientocontablesForeignKey.add(asientocontableLogic.getAsientoContable());
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

			if(this.cuentaporcobrarSessionBean==null) {
				this.cuentaporcobrarSessionBean=new CuentaPorCobrarSessionBean();
			}

			if(!this.cuentaporcobrarSessionBean.getisBusquedaDesdeForeignKeySesionFactura()) {
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
					facturaLogic.getEntityWithConnection(cuentaporcobrarSessionBean.getlidFacturaActual());
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

					if(this.cuentaporcobrar!=null) {
						this.cuentaporcobrar.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormCuentaPorCobrar!=null) {
						this.jInternalFrameDetalleFormCuentaPorCobrar.jComboBoxid_empresaCuentaPorCobrar.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaCuentaPorCobrar.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormCuentaPorCobrar!=null) {
						if(this.jInternalFrameDetalleFormCuentaPorCobrar.jComboBoxid_empresaCuentaPorCobrar.getItemCount()>0) {
							this.jInternalFrameDetalleFormCuentaPorCobrar.jComboBoxid_empresaCuentaPorCobrar.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaCuentaPorCobrarGenerico)throws Exception
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
				jComboBoxid_empresaCuentaPorCobrarGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaCuentaPorCobrarGenerico!=null && jComboBoxid_empresaCuentaPorCobrarGenerico.getItemCount()>0) {
					jComboBoxid_empresaCuentaPorCobrarGenerico.setSelectedIndex(0);
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

					if(this.cuentaporcobrar!=null) {
						this.cuentaporcobrar.setSucursal(sucursalTemp);
					}

					if(this.jInternalFrameDetalleFormCuentaPorCobrar!=null) {
						this.jInternalFrameDetalleFormCuentaPorCobrar.jComboBoxid_sucursalCuentaPorCobrar.setSelectedItem(sucursalTemp);
					}
				} else {
					//jComboBoxid_sucursalCuentaPorCobrar.setSelectedItem(sucursalTemp);
					if(this.jInternalFrameDetalleFormCuentaPorCobrar!=null) {
						if(this.jInternalFrameDetalleFormCuentaPorCobrar.jComboBoxid_sucursalCuentaPorCobrar.getItemCount()>0) {
							this.jInternalFrameDetalleFormCuentaPorCobrar.jComboBoxid_sucursalCuentaPorCobrar.setSelectedIndex(0);
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
	public void setActualSucursalForeignKeyGenerico(Long idSucursalSeleccionado,JComboBox jComboBoxid_sucursalCuentaPorCobrarGenerico)throws Exception
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
				jComboBoxid_sucursalCuentaPorCobrarGenerico.setSelectedItem(sucursalTemp);
			} else {
				if(jComboBoxid_sucursalCuentaPorCobrarGenerico!=null && jComboBoxid_sucursalCuentaPorCobrarGenerico.getItemCount()>0) {
					jComboBoxid_sucursalCuentaPorCobrarGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualModuloForeignKey(Long idModuloSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Modulo  moduloTemp=null;

			for(Modulo moduloAux:modulosForeignKey) {
				if(moduloAux.getId()!=null && moduloAux.getId().equals(idModuloSeleccionado)) {
					moduloTemp=moduloAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(moduloTemp!=null) {

					if(this.cuentaporcobrar!=null) {
						this.cuentaporcobrar.setModulo(moduloTemp);
					}

					if(this.jInternalFrameDetalleFormCuentaPorCobrar!=null) {
						this.jInternalFrameDetalleFormCuentaPorCobrar.jComboBoxid_moduloCuentaPorCobrar.setSelectedItem(moduloTemp);
					}
				} else {
					//jComboBoxid_moduloCuentaPorCobrar.setSelectedItem(moduloTemp);
					if(this.jInternalFrameDetalleFormCuentaPorCobrar!=null) {
						if(this.jInternalFrameDetalleFormCuentaPorCobrar.jComboBoxid_moduloCuentaPorCobrar.getItemCount()>0) {
							this.jInternalFrameDetalleFormCuentaPorCobrar.jComboBoxid_moduloCuentaPorCobrar.setSelectedIndex(0);
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

	public String getActualModuloForeignKeyDescripcion(Long idModuloSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Modulo  moduloTemp=null;

			for(Modulo moduloAux:modulosForeignKey) {
				if(moduloAux.getId()!=null && moduloAux.getId().equals(idModuloSeleccionado)) {
					moduloTemp=moduloAux;
					break;
				}
			}


			sDescripcion=ModuloConstantesFunciones.getModuloDescripcion(moduloTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualModuloForeignKeyGenerico(Long idModuloSeleccionado,JComboBox jComboBoxid_moduloCuentaPorCobrarGenerico)throws Exception
	{
		try
		{
			Modulo  moduloTemp=null;

			for(Modulo moduloAux:modulosForeignKey) {
				if(moduloAux.getId()!=null && moduloAux.getId().equals(idModuloSeleccionado)) {
					moduloTemp=moduloAux;
					break;
				}
			}

			if(moduloTemp!=null) {
				jComboBoxid_moduloCuentaPorCobrarGenerico.setSelectedItem(moduloTemp);
			} else {
				if(jComboBoxid_moduloCuentaPorCobrarGenerico!=null && jComboBoxid_moduloCuentaPorCobrarGenerico.getItemCount()>0) {
					jComboBoxid_moduloCuentaPorCobrarGenerico.setSelectedIndex(0);
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

					if(this.cuentaporcobrar!=null) {
						this.cuentaporcobrar.setEjercicio(ejercicioTemp);
					}

					if(this.jInternalFrameDetalleFormCuentaPorCobrar!=null) {
						this.jInternalFrameDetalleFormCuentaPorCobrar.jComboBoxid_ejercicioCuentaPorCobrar.setSelectedItem(ejercicioTemp);
					}
				} else {
					//jComboBoxid_ejercicioCuentaPorCobrar.setSelectedItem(ejercicioTemp);
					if(this.jInternalFrameDetalleFormCuentaPorCobrar!=null) {
						if(this.jInternalFrameDetalleFormCuentaPorCobrar.jComboBoxid_ejercicioCuentaPorCobrar.getItemCount()>0) {
							this.jInternalFrameDetalleFormCuentaPorCobrar.jComboBoxid_ejercicioCuentaPorCobrar.setSelectedIndex(0);
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
	public void setActualEjercicioForeignKeyGenerico(Long idEjercicioSeleccionado,JComboBox jComboBoxid_ejercicioCuentaPorCobrarGenerico)throws Exception
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
				jComboBoxid_ejercicioCuentaPorCobrarGenerico.setSelectedItem(ejercicioTemp);
			} else {
				if(jComboBoxid_ejercicioCuentaPorCobrarGenerico!=null && jComboBoxid_ejercicioCuentaPorCobrarGenerico.getItemCount()>0) {
					jComboBoxid_ejercicioCuentaPorCobrarGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualMonedaForeignKey(Long idMonedaSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Moneda  monedaTemp=null;

			for(Moneda monedaAux:monedasForeignKey) {
				if(monedaAux.getId()!=null && monedaAux.getId().equals(idMonedaSeleccionado)) {
					monedaTemp=monedaAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(monedaTemp!=null) {

					if(this.cuentaporcobrar!=null) {
						this.cuentaporcobrar.setMoneda(monedaTemp);
					}

					if(this.jInternalFrameDetalleFormCuentaPorCobrar!=null) {
						this.jInternalFrameDetalleFormCuentaPorCobrar.jComboBoxid_monedaCuentaPorCobrar.setSelectedItem(monedaTemp);
					}
				} else {
					//jComboBoxid_monedaCuentaPorCobrar.setSelectedItem(monedaTemp);
					if(this.jInternalFrameDetalleFormCuentaPorCobrar!=null) {
						if(this.jInternalFrameDetalleFormCuentaPorCobrar.jComboBoxid_monedaCuentaPorCobrar.getItemCount()>0) {
							this.jInternalFrameDetalleFormCuentaPorCobrar.jComboBoxid_monedaCuentaPorCobrar.setSelectedIndex(0);
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

	public String getActualMonedaForeignKeyDescripcion(Long idMonedaSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Moneda  monedaTemp=null;

			for(Moneda monedaAux:monedasForeignKey) {
				if(monedaAux.getId()!=null && monedaAux.getId().equals(idMonedaSeleccionado)) {
					monedaTemp=monedaAux;
					break;
				}
			}


			sDescripcion=MonedaConstantesFunciones.getMonedaDescripcion(monedaTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualMonedaForeignKeyGenerico(Long idMonedaSeleccionado,JComboBox jComboBoxid_monedaCuentaPorCobrarGenerico)throws Exception
	{
		try
		{
			Moneda  monedaTemp=null;

			for(Moneda monedaAux:monedasForeignKey) {
				if(monedaAux.getId()!=null && monedaAux.getId().equals(idMonedaSeleccionado)) {
					monedaTemp=monedaAux;
					break;
				}
			}

			if(monedaTemp!=null) {
				jComboBoxid_monedaCuentaPorCobrarGenerico.setSelectedItem(monedaTemp);
			} else {
				if(jComboBoxid_monedaCuentaPorCobrarGenerico!=null && jComboBoxid_monedaCuentaPorCobrarGenerico.getItemCount()>0) {
					jComboBoxid_monedaCuentaPorCobrarGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualClienteForeignKey(Long idClienteSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Cliente  clienteTemp=null;

			for(Cliente clienteAux:clientesForeignKey) {
				if(clienteAux.getId()!=null && clienteAux.getId().equals(idClienteSeleccionado)) {
					clienteTemp=clienteAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(clienteTemp!=null) {

					if(this.cuentaporcobrar!=null) {
						this.cuentaporcobrar.setCliente(clienteTemp);
					}

					if(this.jInternalFrameDetalleFormCuentaPorCobrar!=null) {
						this.jInternalFrameDetalleFormCuentaPorCobrar.jComboBoxid_clienteCuentaPorCobrar.setSelectedItem(clienteTemp);
					}
				} else {
					//jComboBoxid_clienteCuentaPorCobrar.setSelectedItem(clienteTemp);
					if(this.jInternalFrameDetalleFormCuentaPorCobrar!=null) {
						if(this.jInternalFrameDetalleFormCuentaPorCobrar.jComboBoxid_clienteCuentaPorCobrar.getItemCount()>0) {
							this.jInternalFrameDetalleFormCuentaPorCobrar.jComboBoxid_clienteCuentaPorCobrar.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdCliente") || sFormularioTipoBusqueda.equals("Todos")){
					if(clienteTemp!=null && jComboBoxid_clienteFK_IdClienteCuentaPorCobrar!=null) {
						jComboBoxid_clienteFK_IdClienteCuentaPorCobrar.setSelectedItem(clienteTemp);
					} else {
						if(jComboBoxid_clienteFK_IdClienteCuentaPorCobrar!=null) {
							//jComboBoxid_clienteFK_IdClienteCuentaPorCobrar.setSelectedItem(clienteTemp);
							if(jComboBoxid_clienteFK_IdClienteCuentaPorCobrar.getItemCount()>0) {
								jComboBoxid_clienteFK_IdClienteCuentaPorCobrar.setSelectedIndex(0);
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

	public String getActualClienteForeignKeyDescripcion(Long idClienteSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Cliente  clienteTemp=null;

			for(Cliente clienteAux:clientesForeignKey) {
				if(clienteAux.getId()!=null && clienteAux.getId().equals(idClienteSeleccionado)) {
					clienteTemp=clienteAux;
					break;
				}
			}


			sDescripcion=ClienteConstantesFunciones.getClienteDescripcion(clienteTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualClienteForeignKeyGenerico(Long idClienteSeleccionado,JComboBox jComboBoxid_clienteCuentaPorCobrarGenerico)throws Exception
	{
		try
		{
			Cliente  clienteTemp=null;

			for(Cliente clienteAux:clientesForeignKey) {
				if(clienteAux.getId()!=null && clienteAux.getId().equals(idClienteSeleccionado)) {
					clienteTemp=clienteAux;
					break;
				}
			}

			if(clienteTemp!=null) {
				jComboBoxid_clienteCuentaPorCobrarGenerico.setSelectedItem(clienteTemp);
			} else {
				if(jComboBoxid_clienteCuentaPorCobrarGenerico!=null && jComboBoxid_clienteCuentaPorCobrarGenerico.getItemCount()>0) {
					jComboBoxid_clienteCuentaPorCobrarGenerico.setSelectedIndex(0);
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

					if(this.cuentaporcobrar!=null) {
						this.cuentaporcobrar.setTransaccion(transaccionTemp);
					}

					if(this.jInternalFrameDetalleFormCuentaPorCobrar!=null) {
						this.jInternalFrameDetalleFormCuentaPorCobrar.jComboBoxid_transaccionCuentaPorCobrar.setSelectedItem(transaccionTemp);
					}
				} else {
					//jComboBoxid_transaccionCuentaPorCobrar.setSelectedItem(transaccionTemp);
					if(this.jInternalFrameDetalleFormCuentaPorCobrar!=null) {
						if(this.jInternalFrameDetalleFormCuentaPorCobrar.jComboBoxid_transaccionCuentaPorCobrar.getItemCount()>0) {
							this.jInternalFrameDetalleFormCuentaPorCobrar.jComboBoxid_transaccionCuentaPorCobrar.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdTransaccion") || sFormularioTipoBusqueda.equals("Todos")){
					if(transaccionTemp!=null && jComboBoxid_transaccionFK_IdTransaccionCuentaPorCobrar!=null) {
						jComboBoxid_transaccionFK_IdTransaccionCuentaPorCobrar.setSelectedItem(transaccionTemp);
					} else {
						if(jComboBoxid_transaccionFK_IdTransaccionCuentaPorCobrar!=null) {
							//jComboBoxid_transaccionFK_IdTransaccionCuentaPorCobrar.setSelectedItem(transaccionTemp);
							if(jComboBoxid_transaccionFK_IdTransaccionCuentaPorCobrar.getItemCount()>0) {
								jComboBoxid_transaccionFK_IdTransaccionCuentaPorCobrar.setSelectedIndex(0);
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
	public void setActualTransaccionForeignKeyGenerico(Long idTransaccionSeleccionado,JComboBox jComboBoxid_transaccionCuentaPorCobrarGenerico)throws Exception
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
				jComboBoxid_transaccionCuentaPorCobrarGenerico.setSelectedItem(transaccionTemp);
			} else {
				if(jComboBoxid_transaccionCuentaPorCobrarGenerico!=null && jComboBoxid_transaccionCuentaPorCobrarGenerico.getItemCount()>0) {
					jComboBoxid_transaccionCuentaPorCobrarGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualTipoTransaccionModuloForeignKey(Long idTipoTransaccionModuloSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			TipoTransaccionModulo  tipotransaccionmoduloTemp=null;

			for(TipoTransaccionModulo tipotransaccionmoduloAux:tipotransaccionmodulosForeignKey) {
				if(tipotransaccionmoduloAux.getId()!=null && tipotransaccionmoduloAux.getId().equals(idTipoTransaccionModuloSeleccionado)) {
					tipotransaccionmoduloTemp=tipotransaccionmoduloAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(tipotransaccionmoduloTemp!=null) {

					if(this.cuentaporcobrar!=null) {
						this.cuentaporcobrar.setTipoTransaccionModulo(tipotransaccionmoduloTemp);
					}

					if(this.jInternalFrameDetalleFormCuentaPorCobrar!=null) {
						this.jInternalFrameDetalleFormCuentaPorCobrar.jComboBoxid_tipo_transaccion_moduloCuentaPorCobrar.setSelectedItem(tipotransaccionmoduloTemp);
					}
				} else {
					//jComboBoxid_tipo_transaccion_moduloCuentaPorCobrar.setSelectedItem(tipotransaccionmoduloTemp);
					if(this.jInternalFrameDetalleFormCuentaPorCobrar!=null) {
						if(this.jInternalFrameDetalleFormCuentaPorCobrar.jComboBoxid_tipo_transaccion_moduloCuentaPorCobrar.getItemCount()>0) {
							this.jInternalFrameDetalleFormCuentaPorCobrar.jComboBoxid_tipo_transaccion_moduloCuentaPorCobrar.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdTipoTransaccionModulo") || sFormularioTipoBusqueda.equals("Todos")){
					if(tipotransaccionmoduloTemp!=null && jComboBoxid_tipo_transaccion_moduloFK_IdTipoTransaccionModuloCuentaPorCobrar!=null) {
						jComboBoxid_tipo_transaccion_moduloFK_IdTipoTransaccionModuloCuentaPorCobrar.setSelectedItem(tipotransaccionmoduloTemp);
					} else {
						if(jComboBoxid_tipo_transaccion_moduloFK_IdTipoTransaccionModuloCuentaPorCobrar!=null) {
							//jComboBoxid_tipo_transaccion_moduloFK_IdTipoTransaccionModuloCuentaPorCobrar.setSelectedItem(tipotransaccionmoduloTemp);
							if(jComboBoxid_tipo_transaccion_moduloFK_IdTipoTransaccionModuloCuentaPorCobrar.getItemCount()>0) {
								jComboBoxid_tipo_transaccion_moduloFK_IdTipoTransaccionModuloCuentaPorCobrar.setSelectedIndex(0);
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

	public String getActualTipoTransaccionModuloForeignKeyDescripcion(Long idTipoTransaccionModuloSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			TipoTransaccionModulo  tipotransaccionmoduloTemp=null;

			for(TipoTransaccionModulo tipotransaccionmoduloAux:tipotransaccionmodulosForeignKey) {
				if(tipotransaccionmoduloAux.getId()!=null && tipotransaccionmoduloAux.getId().equals(idTipoTransaccionModuloSeleccionado)) {
					tipotransaccionmoduloTemp=tipotransaccionmoduloAux;
					break;
				}
			}


			sDescripcion=TipoTransaccionModuloConstantesFunciones.getTipoTransaccionModuloDescripcion(tipotransaccionmoduloTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualTipoTransaccionModuloForeignKeyGenerico(Long idTipoTransaccionModuloSeleccionado,JComboBox jComboBoxid_tipo_transaccion_moduloCuentaPorCobrarGenerico)throws Exception
	{
		try
		{
			TipoTransaccionModulo  tipotransaccionmoduloTemp=null;

			for(TipoTransaccionModulo tipotransaccionmoduloAux:tipotransaccionmodulosForeignKey) {
				if(tipotransaccionmoduloAux.getId()!=null && tipotransaccionmoduloAux.getId().equals(idTipoTransaccionModuloSeleccionado)) {
					tipotransaccionmoduloTemp=tipotransaccionmoduloAux;
					break;
				}
			}

			if(tipotransaccionmoduloTemp!=null) {
				jComboBoxid_tipo_transaccion_moduloCuentaPorCobrarGenerico.setSelectedItem(tipotransaccionmoduloTemp);
			} else {
				if(jComboBoxid_tipo_transaccion_moduloCuentaPorCobrarGenerico!=null && jComboBoxid_tipo_transaccion_moduloCuentaPorCobrarGenerico.getItemCount()>0) {
					jComboBoxid_tipo_transaccion_moduloCuentaPorCobrarGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualAsientoContableForeignKey(Long idAsientoContableSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			AsientoContable  asientocontableTemp=null;

			for(AsientoContable asientocontableAux:asientocontablesForeignKey) {
				if(asientocontableAux.getId()!=null && asientocontableAux.getId().equals(idAsientoContableSeleccionado)) {
					asientocontableTemp=asientocontableAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(asientocontableTemp!=null) {

					if(this.cuentaporcobrar!=null) {
						this.cuentaporcobrar.setAsientoContable(asientocontableTemp);
					}

					if(this.jInternalFrameDetalleFormCuentaPorCobrar!=null) {
						this.jInternalFrameDetalleFormCuentaPorCobrar.jComboBoxid_asiento_contableCuentaPorCobrar.setSelectedItem(asientocontableTemp);
					}
				} else {
					//jComboBoxid_asiento_contableCuentaPorCobrar.setSelectedItem(asientocontableTemp);
					if(this.jInternalFrameDetalleFormCuentaPorCobrar!=null) {
						if(this.jInternalFrameDetalleFormCuentaPorCobrar.jComboBoxid_asiento_contableCuentaPorCobrar.getItemCount()>0) {
							this.jInternalFrameDetalleFormCuentaPorCobrar.jComboBoxid_asiento_contableCuentaPorCobrar.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdAsientoContable") || sFormularioTipoBusqueda.equals("Todos")){
					if(asientocontableTemp!=null && jComboBoxid_asiento_contableFK_IdAsientoContableCuentaPorCobrar!=null) {
						jComboBoxid_asiento_contableFK_IdAsientoContableCuentaPorCobrar.setSelectedItem(asientocontableTemp);
					} else {
						if(jComboBoxid_asiento_contableFK_IdAsientoContableCuentaPorCobrar!=null) {
							//jComboBoxid_asiento_contableFK_IdAsientoContableCuentaPorCobrar.setSelectedItem(asientocontableTemp);
							if(jComboBoxid_asiento_contableFK_IdAsientoContableCuentaPorCobrar.getItemCount()>0) {
								jComboBoxid_asiento_contableFK_IdAsientoContableCuentaPorCobrar.setSelectedIndex(0);
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

	public String getActualAsientoContableForeignKeyDescripcion(Long idAsientoContableSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			AsientoContable  asientocontableTemp=null;

			for(AsientoContable asientocontableAux:asientocontablesForeignKey) {
				if(asientocontableAux.getId()!=null && asientocontableAux.getId().equals(idAsientoContableSeleccionado)) {
					asientocontableTemp=asientocontableAux;
					break;
				}
			}


			sDescripcion=AsientoContableConstantesFunciones.getAsientoContableDescripcion(asientocontableTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualAsientoContableForeignKeyGenerico(Long idAsientoContableSeleccionado,JComboBox jComboBoxid_asiento_contableCuentaPorCobrarGenerico)throws Exception
	{
		try
		{
			AsientoContable  asientocontableTemp=null;

			for(AsientoContable asientocontableAux:asientocontablesForeignKey) {
				if(asientocontableAux.getId()!=null && asientocontableAux.getId().equals(idAsientoContableSeleccionado)) {
					asientocontableTemp=asientocontableAux;
					break;
				}
			}

			if(asientocontableTemp!=null) {
				jComboBoxid_asiento_contableCuentaPorCobrarGenerico.setSelectedItem(asientocontableTemp);
			} else {
				if(jComboBoxid_asiento_contableCuentaPorCobrarGenerico!=null && jComboBoxid_asiento_contableCuentaPorCobrarGenerico.getItemCount()>0) {
					jComboBoxid_asiento_contableCuentaPorCobrarGenerico.setSelectedIndex(0);
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

					if(this.cuentaporcobrar!=null) {
						this.cuentaporcobrar.setFactura(facturaTemp);
					}

					if(this.jInternalFrameDetalleFormCuentaPorCobrar!=null) {
						this.jInternalFrameDetalleFormCuentaPorCobrar.jComboBoxid_facturaCuentaPorCobrar.setSelectedItem(facturaTemp);
					}
				} else {
					//jComboBoxid_facturaCuentaPorCobrar.setSelectedItem(facturaTemp);
					if(this.jInternalFrameDetalleFormCuentaPorCobrar!=null) {
						if(this.jInternalFrameDetalleFormCuentaPorCobrar.jComboBoxid_facturaCuentaPorCobrar.getItemCount()>0) {
							this.jInternalFrameDetalleFormCuentaPorCobrar.jComboBoxid_facturaCuentaPorCobrar.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdFactura") || sFormularioTipoBusqueda.equals("Todos")){
					if(facturaTemp!=null && jComboBoxid_facturaFK_IdFacturaCuentaPorCobrar!=null) {
						jComboBoxid_facturaFK_IdFacturaCuentaPorCobrar.setSelectedItem(facturaTemp);
					} else {
						if(jComboBoxid_facturaFK_IdFacturaCuentaPorCobrar!=null) {
							//jComboBoxid_facturaFK_IdFacturaCuentaPorCobrar.setSelectedItem(facturaTemp);
							if(jComboBoxid_facturaFK_IdFacturaCuentaPorCobrar.getItemCount()>0) {
								jComboBoxid_facturaFK_IdFacturaCuentaPorCobrar.setSelectedIndex(0);
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
	public void setActualFacturaForeignKeyGenerico(Long idFacturaSeleccionado,JComboBox jComboBoxid_facturaCuentaPorCobrarGenerico)throws Exception
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
				jComboBoxid_facturaCuentaPorCobrarGenerico.setSelectedItem(facturaTemp);
			} else {
				if(jComboBoxid_facturaCuentaPorCobrarGenerico!=null && jComboBoxid_facturaCuentaPorCobrarGenerico.getItemCount()>0) {
					jComboBoxid_facturaCuentaPorCobrarGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(CuentaPorCobrar cuentaporcobrar,JComboBox jComboBoxid_empresaCuentaPorCobrarGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaCuentaPorCobrarGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormCuentaPorCobrar.jComboBoxid_empresaCuentaPorCobrar.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaCuentaPorCobrarGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				cuentaporcobrar.setid_empresa(empresaAux.getId());
				cuentaporcobrar.setempresa_descripcion(CuentaPorCobrarConstantesFunciones.getEmpresaDescripcion(empresaAux));
				cuentaporcobrar.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarSucursalForeignKey(CuentaPorCobrar cuentaporcobrar,JComboBox jComboBoxid_sucursalCuentaPorCobrarGenerico)throws Exception
	{
		try
		{
			Sucursal  sucursalAux=new Sucursal();

			if(jComboBoxid_sucursalCuentaPorCobrarGenerico==null) {
				sucursalAux=(Sucursal)this.jInternalFrameDetalleFormCuentaPorCobrar.jComboBoxid_sucursalCuentaPorCobrar.getSelectedItem();
			} else {
				sucursalAux=(Sucursal)jComboBoxid_sucursalCuentaPorCobrarGenerico.getSelectedItem();
			}

			if(sucursalAux!=null && sucursalAux.getId()!=null) {
				cuentaporcobrar.setid_sucursal(sucursalAux.getId());
				cuentaporcobrar.setsucursal_descripcion(CuentaPorCobrarConstantesFunciones.getSucursalDescripcion(sucursalAux));
				cuentaporcobrar.setSucursal(sucursalAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarModuloForeignKey(CuentaPorCobrar cuentaporcobrar,JComboBox jComboBoxid_moduloCuentaPorCobrarGenerico)throws Exception
	{
		try
		{
			Modulo  moduloAux=new Modulo();

			if(jComboBoxid_moduloCuentaPorCobrarGenerico==null) {
				moduloAux=(Modulo)this.jInternalFrameDetalleFormCuentaPorCobrar.jComboBoxid_moduloCuentaPorCobrar.getSelectedItem();
			} else {
				moduloAux=(Modulo)jComboBoxid_moduloCuentaPorCobrarGenerico.getSelectedItem();
			}

			if(moduloAux!=null && moduloAux.getId()!=null) {
				cuentaporcobrar.setid_modulo(moduloAux.getId());
				cuentaporcobrar.setmodulo_descripcion(CuentaPorCobrarConstantesFunciones.getModuloDescripcion(moduloAux));
				cuentaporcobrar.setModulo(moduloAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEjercicioForeignKey(CuentaPorCobrar cuentaporcobrar,JComboBox jComboBoxid_ejercicioCuentaPorCobrarGenerico)throws Exception
	{
		try
		{
			Ejercicio  ejercicioAux=new Ejercicio();

			if(jComboBoxid_ejercicioCuentaPorCobrarGenerico==null) {
				ejercicioAux=(Ejercicio)this.jInternalFrameDetalleFormCuentaPorCobrar.jComboBoxid_ejercicioCuentaPorCobrar.getSelectedItem();
			} else {
				ejercicioAux=(Ejercicio)jComboBoxid_ejercicioCuentaPorCobrarGenerico.getSelectedItem();
			}

			if(ejercicioAux!=null && ejercicioAux.getId()!=null) {
				cuentaporcobrar.setid_ejercicio(ejercicioAux.getId());
				cuentaporcobrar.setejercicio_descripcion(CuentaPorCobrarConstantesFunciones.getEjercicioDescripcion(ejercicioAux));
				cuentaporcobrar.setEjercicio(ejercicioAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarMonedaForeignKey(CuentaPorCobrar cuentaporcobrar,JComboBox jComboBoxid_monedaCuentaPorCobrarGenerico)throws Exception
	{
		try
		{
			Moneda  monedaAux=new Moneda();

			if(jComboBoxid_monedaCuentaPorCobrarGenerico==null) {
				monedaAux=(Moneda)this.jInternalFrameDetalleFormCuentaPorCobrar.jComboBoxid_monedaCuentaPorCobrar.getSelectedItem();
			} else {
				monedaAux=(Moneda)jComboBoxid_monedaCuentaPorCobrarGenerico.getSelectedItem();
			}

			if(monedaAux!=null && monedaAux.getId()!=null) {
				cuentaporcobrar.setid_moneda(monedaAux.getId());
				cuentaporcobrar.setmoneda_descripcion(CuentaPorCobrarConstantesFunciones.getMonedaDescripcion(monedaAux));
				cuentaporcobrar.setMoneda(monedaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarClienteForeignKey(CuentaPorCobrar cuentaporcobrar,JComboBox jComboBoxid_clienteCuentaPorCobrarGenerico)throws Exception
	{
		try
		{
			Cliente  clienteAux=new Cliente();

			if(jComboBoxid_clienteCuentaPorCobrarGenerico==null) {
				clienteAux=(Cliente)this.jInternalFrameDetalleFormCuentaPorCobrar.jComboBoxid_clienteCuentaPorCobrar.getSelectedItem();
			} else {
				clienteAux=(Cliente)jComboBoxid_clienteCuentaPorCobrarGenerico.getSelectedItem();
			}

			if(clienteAux!=null && clienteAux.getId()!=null) {
				cuentaporcobrar.setid_cliente(clienteAux.getId());
				cuentaporcobrar.setcliente_descripcion(CuentaPorCobrarConstantesFunciones.getClienteDescripcion(clienteAux));
				cuentaporcobrar.setCliente(clienteAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarTransaccionForeignKey(CuentaPorCobrar cuentaporcobrar,JComboBox jComboBoxid_transaccionCuentaPorCobrarGenerico)throws Exception
	{
		try
		{
			Transaccion  transaccionAux=new Transaccion();

			if(jComboBoxid_transaccionCuentaPorCobrarGenerico==null) {
				transaccionAux=(Transaccion)this.jInternalFrameDetalleFormCuentaPorCobrar.jComboBoxid_transaccionCuentaPorCobrar.getSelectedItem();
			} else {
				transaccionAux=(Transaccion)jComboBoxid_transaccionCuentaPorCobrarGenerico.getSelectedItem();
			}

			if(transaccionAux!=null && transaccionAux.getId()!=null) {
				cuentaporcobrar.setid_transaccion(transaccionAux.getId());
				cuentaporcobrar.settransaccion_descripcion(CuentaPorCobrarConstantesFunciones.getTransaccionDescripcion(transaccionAux));
				cuentaporcobrar.setTransaccion(transaccionAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarTipoTransaccionModuloForeignKey(CuentaPorCobrar cuentaporcobrar,JComboBox jComboBoxid_tipo_transaccion_moduloCuentaPorCobrarGenerico)throws Exception
	{
		try
		{
			TipoTransaccionModulo  tipotransaccionmoduloAux=new TipoTransaccionModulo();

			if(jComboBoxid_tipo_transaccion_moduloCuentaPorCobrarGenerico==null) {
				tipotransaccionmoduloAux=(TipoTransaccionModulo)this.jInternalFrameDetalleFormCuentaPorCobrar.jComboBoxid_tipo_transaccion_moduloCuentaPorCobrar.getSelectedItem();
			} else {
				tipotransaccionmoduloAux=(TipoTransaccionModulo)jComboBoxid_tipo_transaccion_moduloCuentaPorCobrarGenerico.getSelectedItem();
			}

			if(tipotransaccionmoduloAux!=null) {
				cuentaporcobrar.setid_tipo_transaccion_modulo(tipotransaccionmoduloAux.getId());
				cuentaporcobrar.settipotransaccionmodulo_descripcion(CuentaPorCobrarConstantesFunciones.getTipoTransaccionModuloDescripcion(tipotransaccionmoduloAux));
				cuentaporcobrar.setTipoTransaccionModulo(tipotransaccionmoduloAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarAsientoContableForeignKey(CuentaPorCobrar cuentaporcobrar,JComboBox jComboBoxid_asiento_contableCuentaPorCobrarGenerico)throws Exception
	{
		try
		{
			AsientoContable  asientocontableAux=new AsientoContable();

			if(jComboBoxid_asiento_contableCuentaPorCobrarGenerico==null) {
				asientocontableAux=(AsientoContable)this.jInternalFrameDetalleFormCuentaPorCobrar.jComboBoxid_asiento_contableCuentaPorCobrar.getSelectedItem();
			} else {
				asientocontableAux=(AsientoContable)jComboBoxid_asiento_contableCuentaPorCobrarGenerico.getSelectedItem();
			}

			if(asientocontableAux!=null && asientocontableAux.getId()!=null) {
				cuentaporcobrar.setid_asiento_contable(asientocontableAux.getId());
				cuentaporcobrar.setasientocontable_descripcion(CuentaPorCobrarConstantesFunciones.getAsientoContableDescripcion(asientocontableAux));
				cuentaporcobrar.setAsientoContable(asientocontableAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarFacturaForeignKey(CuentaPorCobrar cuentaporcobrar,JComboBox jComboBoxid_facturaCuentaPorCobrarGenerico)throws Exception
	{
		try
		{
			Factura  facturaAux=new Factura();

			if(jComboBoxid_facturaCuentaPorCobrarGenerico==null) {
				facturaAux=(Factura)this.jInternalFrameDetalleFormCuentaPorCobrar.jComboBoxid_facturaCuentaPorCobrar.getSelectedItem();
			} else {
				facturaAux=(Factura)jComboBoxid_facturaCuentaPorCobrarGenerico.getSelectedItem();
			}

			if(facturaAux!=null && facturaAux.getId()!=null) {
				cuentaporcobrar.setid_factura(facturaAux.getId());
				cuentaporcobrar.setfactura_descripcion(CuentaPorCobrarConstantesFunciones.getFacturaDescripcion(facturaAux));
				cuentaporcobrar.setFactura(facturaAux);			}
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

					if(!CuentaPorCobrarJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormCuentaPorCobrar!=null) { 
							this.jInternalFrameDetalleFormCuentaPorCobrar.jComboBoxid_empresaCuentaPorCobrar.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormCuentaPorCobrar.jComboBoxid_empresaCuentaPorCobrar.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormCuentaPorCobrar!=null) { 
					}

					if(!CuentaPorCobrarJInternalFrame.ISBINDING_MANUAL) {
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

					if(!CuentaPorCobrarJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormCuentaPorCobrar!=null) { 
							this.jInternalFrameDetalleFormCuentaPorCobrar.jComboBoxid_sucursalCuentaPorCobrar.removeAllItems();

							for(Sucursal sucursal:this.sucursalsForeignKey) {
								this.jInternalFrameDetalleFormCuentaPorCobrar.jComboBoxid_sucursalCuentaPorCobrar.addItem(sucursal);
							}
						}
					}

					if(this.jInternalFrameDetalleFormCuentaPorCobrar!=null) { 
					}

					if(!CuentaPorCobrarJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameModulosForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingModulo=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!CuentaPorCobrarJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormCuentaPorCobrar!=null) { 
							this.jInternalFrameDetalleFormCuentaPorCobrar.jComboBoxid_moduloCuentaPorCobrar.removeAllItems();

							for(Modulo modulo:this.modulosForeignKey) {
								this.jInternalFrameDetalleFormCuentaPorCobrar.jComboBoxid_moduloCuentaPorCobrar.addItem(modulo);
							}
						}
					}

					if(this.jInternalFrameDetalleFormCuentaPorCobrar!=null) { 
					}

					if(!CuentaPorCobrarJInternalFrame.ISBINDING_MANUAL) {
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

					if(!CuentaPorCobrarJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormCuentaPorCobrar!=null) { 
							this.jInternalFrameDetalleFormCuentaPorCobrar.jComboBoxid_ejercicioCuentaPorCobrar.removeAllItems();

							for(Ejercicio ejercicio:this.ejerciciosForeignKey) {
								this.jInternalFrameDetalleFormCuentaPorCobrar.jComboBoxid_ejercicioCuentaPorCobrar.addItem(ejercicio);
							}
						}
					}

					if(this.jInternalFrameDetalleFormCuentaPorCobrar!=null) { 
					}

					if(!CuentaPorCobrarJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameMonedasForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingMoneda=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!CuentaPorCobrarJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormCuentaPorCobrar!=null) { 
							this.jInternalFrameDetalleFormCuentaPorCobrar.jComboBoxid_monedaCuentaPorCobrar.removeAllItems();

							for(Moneda moneda:this.monedasForeignKey) {
								this.jInternalFrameDetalleFormCuentaPorCobrar.jComboBoxid_monedaCuentaPorCobrar.addItem(moneda);
							}
						}
					}

					if(this.jInternalFrameDetalleFormCuentaPorCobrar!=null) { 
					}

					if(!CuentaPorCobrarJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameClientesForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingCliente=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!CuentaPorCobrarJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormCuentaPorCobrar!=null) { 
							this.jInternalFrameDetalleFormCuentaPorCobrar.jComboBoxid_clienteCuentaPorCobrar.removeAllItems();

							for(Cliente cliente:this.clientesForeignKey) {
								this.jInternalFrameDetalleFormCuentaPorCobrar.jComboBoxid_clienteCuentaPorCobrar.addItem(cliente);
							}
						}
					}

					if(this.jInternalFrameDetalleFormCuentaPorCobrar!=null) { 
					}

					if(!CuentaPorCobrarJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdCliente") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!CuentaPorCobrarJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_clienteFK_IdClienteCuentaPorCobrar.removeAllItems();

							for(Cliente cliente:this.clientesForeignKey) {
								this.jComboBoxid_clienteFK_IdClienteCuentaPorCobrar.addItem(cliente);
							}
						}

						if(!CuentaPorCobrarJInternalFrame.ISBINDING_MANUAL) {
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

					if(!CuentaPorCobrarJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormCuentaPorCobrar!=null) { 
							this.jInternalFrameDetalleFormCuentaPorCobrar.jComboBoxid_transaccionCuentaPorCobrar.removeAllItems();

							for(Transaccion transaccion:this.transaccionsForeignKey) {
								this.jInternalFrameDetalleFormCuentaPorCobrar.jComboBoxid_transaccionCuentaPorCobrar.addItem(transaccion);
							}
						}
					}

					if(this.jInternalFrameDetalleFormCuentaPorCobrar!=null) { 
					}

					if(!CuentaPorCobrarJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdTransaccion") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!CuentaPorCobrarJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_transaccionFK_IdTransaccionCuentaPorCobrar.removeAllItems();

							for(Transaccion transaccion:this.transaccionsForeignKey) {
								this.jComboBoxid_transaccionFK_IdTransaccionCuentaPorCobrar.addItem(transaccion);
							}
						}

						if(!CuentaPorCobrarJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameTipoTransaccionModulosForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingTipoTransaccionModulo=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!CuentaPorCobrarJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormCuentaPorCobrar!=null) { 
							this.jInternalFrameDetalleFormCuentaPorCobrar.jComboBoxid_tipo_transaccion_moduloCuentaPorCobrar.removeAllItems();

							for(TipoTransaccionModulo tipotransaccionmodulo:this.tipotransaccionmodulosForeignKey) {
								this.jInternalFrameDetalleFormCuentaPorCobrar.jComboBoxid_tipo_transaccion_moduloCuentaPorCobrar.addItem(tipotransaccionmodulo);
							}
						}
					}

					if(this.jInternalFrameDetalleFormCuentaPorCobrar!=null) { 
					}

					if(!CuentaPorCobrarJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdTipoTransaccionModulo") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!CuentaPorCobrarJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_tipo_transaccion_moduloFK_IdTipoTransaccionModuloCuentaPorCobrar.removeAllItems();

							for(TipoTransaccionModulo tipotransaccionmodulo:this.tipotransaccionmodulosForeignKey) {
								this.jComboBoxid_tipo_transaccion_moduloFK_IdTipoTransaccionModuloCuentaPorCobrar.addItem(tipotransaccionmodulo);
							}
						}

						if(!CuentaPorCobrarJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameAsientoContablesForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingAsientoContable=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!CuentaPorCobrarJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormCuentaPorCobrar!=null) { 
							this.jInternalFrameDetalleFormCuentaPorCobrar.jComboBoxid_asiento_contableCuentaPorCobrar.removeAllItems();

							for(AsientoContable asientocontable:this.asientocontablesForeignKey) {
								this.jInternalFrameDetalleFormCuentaPorCobrar.jComboBoxid_asiento_contableCuentaPorCobrar.addItem(asientocontable);
							}
						}
					}

					if(this.jInternalFrameDetalleFormCuentaPorCobrar!=null) { 
					}

					if(!CuentaPorCobrarJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdAsientoContable") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!CuentaPorCobrarJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_asiento_contableFK_IdAsientoContableCuentaPorCobrar.removeAllItems();

							for(AsientoContable asientocontable:this.asientocontablesForeignKey) {
								this.jComboBoxid_asiento_contableFK_IdAsientoContableCuentaPorCobrar.addItem(asientocontable);
							}
						}

						if(!CuentaPorCobrarJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

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

					if(!CuentaPorCobrarJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormCuentaPorCobrar!=null) { 
							this.jInternalFrameDetalleFormCuentaPorCobrar.jComboBoxid_facturaCuentaPorCobrar.removeAllItems();

							for(Factura factura:this.facturasForeignKey) {
								this.jInternalFrameDetalleFormCuentaPorCobrar.jComboBoxid_facturaCuentaPorCobrar.addItem(factura);
							}
						}
					}

					if(this.jInternalFrameDetalleFormCuentaPorCobrar!=null) { 
					}

					if(!CuentaPorCobrarJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdFactura") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!CuentaPorCobrarJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_facturaFK_IdFacturaCuentaPorCobrar.removeAllItems();

							for(Factura factura:this.facturasForeignKey) {
								this.jComboBoxid_facturaFK_IdFacturaCuentaPorCobrar.addItem(factura);
							}
						}

						if(!CuentaPorCobrarJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormCuentaPorCobrar!=null) {
							this.jInternalFrameDetalleFormCuentaPorCobrar.jComboBoxid_empresaCuentaPorCobrar.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormCuentaPorCobrar!=null) {
							this.jInternalFrameDetalleFormCuentaPorCobrar.jComboBoxid_empresaCuentaPorCobrar.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormCuentaPorCobrar!=null) {
							this.jInternalFrameDetalleFormCuentaPorCobrar.jComboBoxid_sucursalCuentaPorCobrar.setSelectedItem(sucursal);
						}
					} else {
						if(this.jInternalFrameDetalleFormCuentaPorCobrar!=null) {
							this.jInternalFrameDetalleFormCuentaPorCobrar.jComboBoxid_sucursalCuentaPorCobrar.setSelectedIndex(iIndexSelected);
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

		public void setSelectedItemCombosFrameModuloForeignKey(Modulo modulo,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormCuentaPorCobrar!=null) {
							this.jInternalFrameDetalleFormCuentaPorCobrar.jComboBoxid_moduloCuentaPorCobrar.setSelectedItem(modulo);
						}
					} else {
						if(this.jInternalFrameDetalleFormCuentaPorCobrar!=null) {
							this.jInternalFrameDetalleFormCuentaPorCobrar.jComboBoxid_moduloCuentaPorCobrar.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormCuentaPorCobrar!=null) {
							this.jInternalFrameDetalleFormCuentaPorCobrar.jComboBoxid_ejercicioCuentaPorCobrar.setSelectedItem(ejercicio);
						}
					} else {
						if(this.jInternalFrameDetalleFormCuentaPorCobrar!=null) {
							this.jInternalFrameDetalleFormCuentaPorCobrar.jComboBoxid_ejercicioCuentaPorCobrar.setSelectedIndex(iIndexSelected);
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

		public void setSelectedItemCombosFrameMonedaForeignKey(Moneda moneda,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormCuentaPorCobrar!=null) {
							this.jInternalFrameDetalleFormCuentaPorCobrar.jComboBoxid_monedaCuentaPorCobrar.setSelectedItem(moneda);
						}
					} else {
						if(this.jInternalFrameDetalleFormCuentaPorCobrar!=null) {
							this.jInternalFrameDetalleFormCuentaPorCobrar.jComboBoxid_monedaCuentaPorCobrar.setSelectedIndex(iIndexSelected);
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

		public void setSelectedItemCombosFrameClienteForeignKey(Cliente cliente,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormCuentaPorCobrar!=null) {
							this.jInternalFrameDetalleFormCuentaPorCobrar.jComboBoxid_clienteCuentaPorCobrar.setSelectedItem(cliente);
						}
					} else {
						if(this.jInternalFrameDetalleFormCuentaPorCobrar!=null) {
							this.jInternalFrameDetalleFormCuentaPorCobrar.jComboBoxid_clienteCuentaPorCobrar.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_clienteFK_IdClienteCuentaPorCobrar.setSelectedItem(cliente);
						} else {
							this.jComboBoxid_clienteFK_IdClienteCuentaPorCobrar.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormCuentaPorCobrar!=null) {
							this.jInternalFrameDetalleFormCuentaPorCobrar.jComboBoxid_transaccionCuentaPorCobrar.setSelectedItem(transaccion);
						}
					} else {
						if(this.jInternalFrameDetalleFormCuentaPorCobrar!=null) {
							this.jInternalFrameDetalleFormCuentaPorCobrar.jComboBoxid_transaccionCuentaPorCobrar.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_transaccionFK_IdTransaccionCuentaPorCobrar.setSelectedItem(transaccion);
						} else {
							this.jComboBoxid_transaccionFK_IdTransaccionCuentaPorCobrar.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameTipoTransaccionModuloForeignKey(TipoTransaccionModulo tipotransaccionmodulo,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormCuentaPorCobrar!=null) {
							this.jInternalFrameDetalleFormCuentaPorCobrar.jComboBoxid_tipo_transaccion_moduloCuentaPorCobrar.setSelectedItem(tipotransaccionmodulo);
						}
					} else {
						if(this.jInternalFrameDetalleFormCuentaPorCobrar!=null) {
							this.jInternalFrameDetalleFormCuentaPorCobrar.jComboBoxid_tipo_transaccion_moduloCuentaPorCobrar.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_tipo_transaccion_moduloFK_IdTipoTransaccionModuloCuentaPorCobrar.setSelectedItem(tipotransaccionmodulo);
						} else {
							this.jComboBoxid_tipo_transaccion_moduloFK_IdTipoTransaccionModuloCuentaPorCobrar.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameAsientoContableForeignKey(AsientoContable asientocontable,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormCuentaPorCobrar!=null) {
							this.jInternalFrameDetalleFormCuentaPorCobrar.jComboBoxid_asiento_contableCuentaPorCobrar.setSelectedItem(asientocontable);
						}
					} else {
						if(this.jInternalFrameDetalleFormCuentaPorCobrar!=null) {
							this.jInternalFrameDetalleFormCuentaPorCobrar.jComboBoxid_asiento_contableCuentaPorCobrar.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_asiento_contableFK_IdAsientoContableCuentaPorCobrar.setSelectedItem(asientocontable);
						} else {
							this.jComboBoxid_asiento_contableFK_IdAsientoContableCuentaPorCobrar.setSelectedIndex(iIndexSelected);
						}

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
						if(this.jInternalFrameDetalleFormCuentaPorCobrar!=null) {
							this.jInternalFrameDetalleFormCuentaPorCobrar.jComboBoxid_facturaCuentaPorCobrar.setSelectedItem(factura);
						}
					} else {
						if(this.jInternalFrameDetalleFormCuentaPorCobrar!=null) {
							this.jInternalFrameDetalleFormCuentaPorCobrar.jComboBoxid_facturaCuentaPorCobrar.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_facturaFK_IdFacturaCuentaPorCobrar.setSelectedItem(factura);
						} else {
							this.jComboBoxid_facturaFK_IdFacturaCuentaPorCobrar.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesCuentaPorCobrar() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			CuentaPorCobrarConstantesFunciones.refrescarForeignKeysDescripcionesCuentaPorCobrar(this.cuentaporcobrarLogic.getCuentaPorCobrars());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			CuentaPorCobrarConstantesFunciones.refrescarForeignKeysDescripcionesCuentaPorCobrar(this.cuentaporcobrars);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
		classes.add(new Classe(Sucursal.class));
		classes.add(new Classe(Modulo.class));
		classes.add(new Classe(Ejercicio.class));
		classes.add(new Classe(Moneda.class));
		classes.add(new Classe(Cliente.class));
		classes.add(new Classe(Transaccion.class));
		classes.add(new Classe(TipoTransaccionModulo.class));
		classes.add(new Classe(AsientoContable.class));
		classes.add(new Classe(Factura.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//cuentaporcobrarLogic.setCuentaPorCobrars(this.cuentaporcobrars);
			cuentaporcobrarLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public CuentaPorCobrarParameterReturnGeneral getCuentaPorCobrarParameterGeneral() {
		return this.cuentaporcobrarParameterGeneral;
	}
	
	public void setCuentaPorCobrarParameterGeneral(CuentaPorCobrarParameterReturnGeneral cuentaporcobrarParameterGeneral) {
		this.cuentaporcobrarParameterGeneral = cuentaporcobrarParameterGeneral;
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
	
	public Boolean getIsPermisoTodoCuentaPorCobrar() {
		return isPermisoTodoCuentaPorCobrar;
	}

	public void setIsPermisoTodoCuentaPorCobrar(Boolean isPermisoTodoCuentaPorCobrar) {
		this.isPermisoTodoCuentaPorCobrar = isPermisoTodoCuentaPorCobrar;
	}

	public Boolean getIsPermisoNuevoCuentaPorCobrar() {
		return isPermisoNuevoCuentaPorCobrar;
	}

	public void setIsPermisoNuevoCuentaPorCobrar(Boolean isPermisoNuevoCuentaPorCobrar) {
		this.isPermisoNuevoCuentaPorCobrar = isPermisoNuevoCuentaPorCobrar;
	}

	public Boolean getIsPermisoActualizarCuentaPorCobrar() {
		return isPermisoActualizarCuentaPorCobrar;
	}

	public void setIsPermisoActualizarCuentaPorCobrar(Boolean isPermisoActualizarCuentaPorCobrar) {
		this.isPermisoActualizarCuentaPorCobrar = isPermisoActualizarCuentaPorCobrar;
	}

	public Boolean getIsPermisoEliminarCuentaPorCobrar() {
		return isPermisoEliminarCuentaPorCobrar;
	}

	public void setIsPermisoEliminarCuentaPorCobrar(Boolean isPermisoEliminarCuentaPorCobrar) {
		this.isPermisoEliminarCuentaPorCobrar = isPermisoEliminarCuentaPorCobrar;
	}

	public Boolean getIsPermisoGuardarCambiosCuentaPorCobrar() {
		return isPermisoGuardarCambiosCuentaPorCobrar;
	}

	public void setIsPermisoGuardarCambiosCuentaPorCobrar(Boolean isPermisoGuardarCambiosCuentaPorCobrar) {
		this.isPermisoGuardarCambiosCuentaPorCobrar = isPermisoGuardarCambiosCuentaPorCobrar;
	}
	
	public Boolean getIsPermisoConsultaCuentaPorCobrar() {
		return isPermisoConsultaCuentaPorCobrar;
	}

	public void setIsPermisoConsultaCuentaPorCobrar(Boolean isPermisoConsultaCuentaPorCobrar) {
		this.isPermisoConsultaCuentaPorCobrar = isPermisoConsultaCuentaPorCobrar;
	}

	public Boolean getIsPermisoBusquedaCuentaPorCobrar() {
		return isPermisoBusquedaCuentaPorCobrar;
	}

	public void setIsPermisoBusquedaCuentaPorCobrar(Boolean isPermisoBusquedaCuentaPorCobrar) {
		this.isPermisoBusquedaCuentaPorCobrar = isPermisoBusquedaCuentaPorCobrar;
	}

	public Boolean getIsPermisoReporteCuentaPorCobrar() {
		return isPermisoReporteCuentaPorCobrar;
	}

	public void setIsPermisoReporteCuentaPorCobrar(Boolean isPermisoReporteCuentaPorCobrar) {
		this.isPermisoReporteCuentaPorCobrar = isPermisoReporteCuentaPorCobrar;
	}
	
	public Boolean getIsPermisoPaginacionMedioCuentaPorCobrar() {
		return isPermisoPaginacionMedioCuentaPorCobrar;
	}

	public void setIsPermisoPaginacionMedioCuentaPorCobrar(Boolean isPermisoPaginacionMedioCuentaPorCobrar) {
		this.isPermisoPaginacionMedioCuentaPorCobrar = isPermisoPaginacionMedioCuentaPorCobrar;
	}
	
	public Boolean getIsPermisoPaginacionTodoCuentaPorCobrar() {
		return isPermisoPaginacionTodoCuentaPorCobrar;
	}

	public void setIsPermisoPaginacionTodoCuentaPorCobrar(Boolean isPermisoPaginacionTodoCuentaPorCobrar) {
		this.isPermisoPaginacionTodoCuentaPorCobrar = isPermisoPaginacionTodoCuentaPorCobrar;
	}
	
	public Boolean getIsPermisoPaginacionAltoCuentaPorCobrar() {
		return isPermisoPaginacionAltoCuentaPorCobrar;
	}

	public void setIsPermisoPaginacionAltoCuentaPorCobrar(Boolean isPermisoPaginacionAltoCuentaPorCobrar) {
		this.isPermisoPaginacionAltoCuentaPorCobrar = isPermisoPaginacionAltoCuentaPorCobrar;
	}
	
	public Boolean getIsPermisoCopiarCuentaPorCobrar() {
		return isPermisoCopiarCuentaPorCobrar;
	}

	public void setIsPermisoCopiarCuentaPorCobrar(Boolean isPermisoCopiarCuentaPorCobrar) {
		this.isPermisoCopiarCuentaPorCobrar = isPermisoCopiarCuentaPorCobrar;
	}
	
	public Boolean getIsPermisoVerFormCuentaPorCobrar() {
		return isPermisoVerFormCuentaPorCobrar;
	}

	public void setIsPermisoVerFormCuentaPorCobrar(Boolean isPermisoVerFormCuentaPorCobrar) {
		this.isPermisoVerFormCuentaPorCobrar = isPermisoVerFormCuentaPorCobrar;
	}
	
	public Boolean getIsPermisoDuplicarCuentaPorCobrar() {
		return isPermisoDuplicarCuentaPorCobrar;
	}

	public void setIsPermisoDuplicarCuentaPorCobrar(Boolean isPermisoDuplicarCuentaPorCobrar) {
		this.isPermisoDuplicarCuentaPorCobrar = isPermisoDuplicarCuentaPorCobrar;
	}
	
	public Boolean getIsPermisoOrdenCuentaPorCobrar() {
		return isPermisoOrdenCuentaPorCobrar;
	}

	public void setIsPermisoOrdenCuentaPorCobrar(Boolean isPermisoOrdenCuentaPorCobrar) {
		this.isPermisoOrdenCuentaPorCobrar = isPermisoOrdenCuentaPorCobrar;
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
	
	public Boolean getIsVisibilidadCeldaNuevoCuentaPorCobrar() {
		return isVisibilidadCeldaNuevoCuentaPorCobrar;
	}

	public void setIsVisibilidadCeldaNuevoCuentaPorCobrar(Boolean isVisibilidadCeldaNuevoCuentaPorCobrar) {
		this.isVisibilidadCeldaNuevoCuentaPorCobrar = isVisibilidadCeldaNuevoCuentaPorCobrar;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarCuentaPorCobrar() {
		return isVisibilidadCeldaDuplicarCuentaPorCobrar;
	}

	public void setIsVisibilidadCeldaDuplicarCuentaPorCobrar(Boolean isVisibilidadCeldaDuplicarCuentaPorCobrar) {
		this.isVisibilidadCeldaDuplicarCuentaPorCobrar = isVisibilidadCeldaDuplicarCuentaPorCobrar;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarCuentaPorCobrar() {
		return isVisibilidadCeldaCopiarCuentaPorCobrar;
	}

	public void setIsVisibilidadCeldaCopiarCuentaPorCobrar(Boolean isVisibilidadCeldaCopiarCuentaPorCobrar) {
		this.isVisibilidadCeldaCopiarCuentaPorCobrar = isVisibilidadCeldaCopiarCuentaPorCobrar;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormCuentaPorCobrar() {
		return isVisibilidadCeldaVerFormCuentaPorCobrar;
	}

	public void setIsVisibilidadCeldaVerFormCuentaPorCobrar(Boolean isVisibilidadCeldaVerFormCuentaPorCobrar) {
		this.isVisibilidadCeldaVerFormCuentaPorCobrar = isVisibilidadCeldaVerFormCuentaPorCobrar;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenCuentaPorCobrar() {
		return isVisibilidadCeldaOrdenCuentaPorCobrar;
	}

	public void setIsVisibilidadCeldaOrdenCuentaPorCobrar(Boolean isVisibilidadCeldaOrdenCuentaPorCobrar) {
		this.isVisibilidadCeldaOrdenCuentaPorCobrar = isVisibilidadCeldaOrdenCuentaPorCobrar;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesCuentaPorCobrar() {
		return isVisibilidadCeldaNuevoRelacionesCuentaPorCobrar;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesCuentaPorCobrar(Boolean isVisibilidadCeldaNuevoRelacionesCuentaPorCobrar) {
		this.isVisibilidadCeldaNuevoRelacionesCuentaPorCobrar = isVisibilidadCeldaNuevoRelacionesCuentaPorCobrar;
	}
	
	public Boolean getIsVisibilidadCeldaModificarCuentaPorCobrar() {
		return isVisibilidadCeldaModificarCuentaPorCobrar;
	}

	public void setIsVisibilidadCeldaModificarCuentaPorCobrar(Boolean isVisibilidadCeldaModificarCuentaPorCobrar) {
		this.isVisibilidadCeldaModificarCuentaPorCobrar = isVisibilidadCeldaModificarCuentaPorCobrar;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarCuentaPorCobrar() {
		return isVisibilidadCeldaActualizarCuentaPorCobrar;
	}

	public void setIsVisibilidadCeldaActualizarCuentaPorCobrar(Boolean isVisibilidadCeldaActualizarCuentaPorCobrar) {
		this.isVisibilidadCeldaActualizarCuentaPorCobrar = isVisibilidadCeldaActualizarCuentaPorCobrar;
	}

	public Boolean getIsVisibilidadCeldaEliminarCuentaPorCobrar() {
		return isVisibilidadCeldaEliminarCuentaPorCobrar;
	}

	public void setIsVisibilidadCeldaEliminarCuentaPorCobrar(Boolean isVisibilidadCeldaEliminarCuentaPorCobrar) {
		this.isVisibilidadCeldaEliminarCuentaPorCobrar = isVisibilidadCeldaEliminarCuentaPorCobrar;
	}

	public Boolean getIsVisibilidadCeldaCancelarCuentaPorCobrar() {
		return isVisibilidadCeldaCancelarCuentaPorCobrar;
	}

	public void setIsVisibilidadCeldaCancelarCuentaPorCobrar(Boolean isVisibilidadCeldaCancelarCuentaPorCobrar) {
		this.isVisibilidadCeldaCancelarCuentaPorCobrar = isVisibilidadCeldaCancelarCuentaPorCobrar;
	}

	public Boolean getIsVisibilidadCeldaGuardarCuentaPorCobrar() {
		return isVisibilidadCeldaGuardarCuentaPorCobrar;
	}

	public void setIsVisibilidadCeldaGuardarCuentaPorCobrar(Boolean isVisibilidadCeldaGuardarCuentaPorCobrar) {
		this.isVisibilidadCeldaGuardarCuentaPorCobrar = isVisibilidadCeldaGuardarCuentaPorCobrar;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosCuentaPorCobrar() {
		return isVisibilidadCeldaGuardarCambiosCuentaPorCobrar;
	}

	public void setIsVisibilidadCeldaGuardarCambiosCuentaPorCobrar(Boolean isVisibilidadCeldaGuardarCambiosCuentaPorCobrar) {
		this.isVisibilidadCeldaGuardarCambiosCuentaPorCobrar = isVisibilidadCeldaGuardarCambiosCuentaPorCobrar;
	}
		
	public CuentaPorCobrarSessionBean getcuentaporcobrarSessionBean() {
		return this.cuentaporcobrarSessionBean;
	}
	
	public void setcuentaporcobrarSessionBean(CuentaPorCobrarSessionBean cuentaporcobrarSessionBean) {
		this.cuentaporcobrarSessionBean=cuentaporcobrarSessionBean;
	}
	
	
	public Boolean getisVisibilidadFK_IdAsientoContable() {
		return this.isVisibilidadFK_IdAsientoContable;
	}

	public void setisVisibilidadFK_IdAsientoContable(Boolean isVisibilidadFK_IdAsientoContable) {
		this.isVisibilidadFK_IdAsientoContable=isVisibilidadFK_IdAsientoContable;
	}

	public Boolean getisVisibilidadFK_IdCliente() {
		return this.isVisibilidadFK_IdCliente;
	}

	public void setisVisibilidadFK_IdCliente(Boolean isVisibilidadFK_IdCliente) {
		this.isVisibilidadFK_IdCliente=isVisibilidadFK_IdCliente;
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

	public Boolean getisVisibilidadFK_IdModulo() {
		return this.isVisibilidadFK_IdModulo;
	}

	public void setisVisibilidadFK_IdModulo(Boolean isVisibilidadFK_IdModulo) {
		this.isVisibilidadFK_IdModulo=isVisibilidadFK_IdModulo;
	}

	public Boolean getisVisibilidadFK_IdMoneda() {
		return this.isVisibilidadFK_IdMoneda;
	}

	public void setisVisibilidadFK_IdMoneda(Boolean isVisibilidadFK_IdMoneda) {
		this.isVisibilidadFK_IdMoneda=isVisibilidadFK_IdMoneda;
	}

	public Boolean getisVisibilidadFK_IdSucursal() {
		return this.isVisibilidadFK_IdSucursal;
	}

	public void setisVisibilidadFK_IdSucursal(Boolean isVisibilidadFK_IdSucursal) {
		this.isVisibilidadFK_IdSucursal=isVisibilidadFK_IdSucursal;
	}

	public Boolean getisVisibilidadFK_IdTipoTransaccionModulo() {
		return this.isVisibilidadFK_IdTipoTransaccionModulo;
	}

	public void setisVisibilidadFK_IdTipoTransaccionModulo(Boolean isVisibilidadFK_IdTipoTransaccionModulo) {
		this.isVisibilidadFK_IdTipoTransaccionModulo=isVisibilidadFK_IdTipoTransaccionModulo;
	}

	public Boolean getisVisibilidadFK_IdTransaccion() {
		return this.isVisibilidadFK_IdTransaccion;
	}

	public void setisVisibilidadFK_IdTransaccion(Boolean isVisibilidadFK_IdTransaccion) {
		this.isVisibilidadFK_IdTransaccion=isVisibilidadFK_IdTransaccion;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysCuentaPorCobrar(CuentaPorCobrar cuentaporcobrar)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(cuentaporcobrar,null);
				this.setActualParaGuardarSucursalForeignKey(cuentaporcobrar,null);
				this.setActualParaGuardarModuloForeignKey(cuentaporcobrar,null);
				this.setActualParaGuardarEjercicioForeignKey(cuentaporcobrar,null);
				this.setActualParaGuardarMonedaForeignKey(cuentaporcobrar,null);
				this.setActualParaGuardarClienteForeignKey(cuentaporcobrar,null);
				this.setActualParaGuardarTransaccionForeignKey(cuentaporcobrar,null);
				this.setActualParaGuardarTipoTransaccionModuloForeignKey(cuentaporcobrar,null);
				this.setActualParaGuardarAsientoContableForeignKey(cuentaporcobrar,null);
				this.setActualParaGuardarFacturaForeignKey(cuentaporcobrar,null);
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
	
	public void bugActualizarReferenciaActual(CuentaPorCobrar cuentaporcobrar,CuentaPorCobrar cuentaporcobrarAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalCuentaPorCobrar(cuentaporcobrar);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		cuentaporcobrarAux.setId(cuentaporcobrar.getId());
		cuentaporcobrarAux.setVersionRow(cuentaporcobrar.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessCuentaPorCobrar();
		
			int intSelectedRow = this.jTableDatosCuentaPorCobrar.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuentaporcobrar =(CuentaPorCobrar) this.cuentaporcobrarLogic.getCuentaPorCobrars().toArray()[this.jTableDatosCuentaPorCobrar.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.cuentaporcobrar =(CuentaPorCobrar) this.cuentaporcobrars.toArray()[this.jTableDatosCuentaPorCobrar.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(CuentaPorCobrarJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualCuentaPorCobrar(this.cuentaporcobrar,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysCuentaPorCobrar(this.cuentaporcobrar);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = cuentaporcobrarValidator.getInvalidValues(this.cuentaporcobrar);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			cuentaporcobrarLogic.setDatosCliente(datosCliente);
			cuentaporcobrarLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				cuentaporcobrarAux=new  CuentaPorCobrar();
				
				cuentaporcobrarAux.setIsNew(true);
				cuentaporcobrarAux.setIsChanged(true);
				
				cuentaporcobrarAux.setCuentaPorCobrarOriginal(this.cuentaporcobrar);
				
				cuentaporcobrarAux.setId(this.cuentaporcobrar.getId());	
				cuentaporcobrarAux.setVersionRow(this.cuentaporcobrar.getVersionRow());	
				cuentaporcobrarAux.setid_empresa(this.cuentaporcobrar.getid_empresa());	
				cuentaporcobrarAux.setid_sucursal(this.cuentaporcobrar.getid_sucursal());	
				cuentaporcobrarAux.setid_modulo(this.cuentaporcobrar.getid_modulo());	
				cuentaporcobrarAux.setid_ejercicio(this.cuentaporcobrar.getid_ejercicio());	
				cuentaporcobrarAux.setid_moneda(this.cuentaporcobrar.getid_moneda());	
				cuentaporcobrarAux.setid_cliente(this.cuentaporcobrar.getid_cliente());	
				cuentaporcobrarAux.setid_transaccion(this.cuentaporcobrar.getid_transaccion());	
				cuentaporcobrarAux.setid_tipo_transaccion_modulo(this.cuentaporcobrar.getid_tipo_transaccion_modulo());	
				cuentaporcobrarAux.setid_asiento_contable(this.cuentaporcobrar.getid_asiento_contable());	
				cuentaporcobrarAux.setid_factura(this.cuentaporcobrar.getid_factura());	
				cuentaporcobrarAux.setfecha(this.cuentaporcobrar.getfecha());	
				cuentaporcobrarAux.setmonto(this.cuentaporcobrar.getmonto());	
				cuentaporcobrarAux.setnumero_comprobante(this.cuentaporcobrar.getnumero_comprobante());	
				cuentaporcobrarAux.setdebito(this.cuentaporcobrar.getdebito());	
				cuentaporcobrarAux.setcredito(this.cuentaporcobrar.getcredito());	
				cuentaporcobrarAux.setdetalle(this.cuentaporcobrar.getdetalle());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.cuentaporcobrarSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.cuentaporcobrarSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(cuentaporcobrarAux,cuentaporcobrarLogic.getCuentaPorCobrars());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(cuentaporcobrarAux,cuentaporcobrars);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.cuentaporcobrarSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.cuentaporcobrarSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						cuentaporcobrarLogic.saveCuentaPorCobrars();//WithConnection
						//cuentaporcobrarLogic.getSetVersionRowCuentaPorCobrars();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.cuentaporcobrar,cuentaporcobrarAux);
					
					this.refrescarForeignKeysDescripcionesCuentaPorCobrar();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.cuentaporcobrarSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE	
						
						if(!this.cuentaporcobrarSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								cuentaporcobrarLogic.saveCuentaPorCobrarRelaciones(cuentaporcobrarAux);//WithConnection
								//cuentaporcobrarLogic.getSetVersionRowCuentaPorCobrars();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.cuentaporcobrar,cuentaporcobrarAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE	
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.cuentaporcobrarSessionBean.getEstaModoGuardarRelaciones() 
									|| this.cuentaporcobrarSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(cuentaporcobrarAux,cuentaporcobrarLogic.getCuentaPorCobrars());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(cuentaporcobrarAux,cuentaporcobrars);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.cuentaporcobrar,cuentaporcobrarAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				cuentaporcobrarAux=new  CuentaPorCobrar();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.cuentaporcobrarSessionBean.getEsGuardarRelacionado() 
					|| (this.cuentaporcobrarSessionBean.getEsGuardarRelacionado() && this.cuentaporcobrar.getId()>=0)) {
						
					cuentaporcobrarAux.setIsNew(false);
				}
				
				cuentaporcobrarAux.setIsDeleted(false);
			
				cuentaporcobrarAux.setId(this.cuentaporcobrar.getId());	
				cuentaporcobrarAux.setVersionRow(this.cuentaporcobrar.getVersionRow());	
				cuentaporcobrarAux.setid_empresa(this.cuentaporcobrar.getid_empresa());	
				cuentaporcobrarAux.setid_sucursal(this.cuentaporcobrar.getid_sucursal());	
				cuentaporcobrarAux.setid_modulo(this.cuentaporcobrar.getid_modulo());	
				cuentaporcobrarAux.setid_ejercicio(this.cuentaporcobrar.getid_ejercicio());	
				cuentaporcobrarAux.setid_moneda(this.cuentaporcobrar.getid_moneda());	
				cuentaporcobrarAux.setid_cliente(this.cuentaporcobrar.getid_cliente());	
				cuentaporcobrarAux.setid_transaccion(this.cuentaporcobrar.getid_transaccion());	
				cuentaporcobrarAux.setid_tipo_transaccion_modulo(this.cuentaporcobrar.getid_tipo_transaccion_modulo());	
				cuentaporcobrarAux.setid_asiento_contable(this.cuentaporcobrar.getid_asiento_contable());	
				cuentaporcobrarAux.setid_factura(this.cuentaporcobrar.getid_factura());	
				cuentaporcobrarAux.setfecha(this.cuentaporcobrar.getfecha());	
				cuentaporcobrarAux.setmonto(this.cuentaporcobrar.getmonto());	
				cuentaporcobrarAux.setnumero_comprobante(this.cuentaporcobrar.getnumero_comprobante());	
				cuentaporcobrarAux.setdebito(this.cuentaporcobrar.getdebito());	
				cuentaporcobrarAux.setcredito(this.cuentaporcobrar.getcredito());	
				cuentaporcobrarAux.setdetalle(this.cuentaporcobrar.getdetalle());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(cuentaporcobrarAux,cuentaporcobrarLogic.getCuentaPorCobrars());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(cuentaporcobrarAux,cuentaporcobrars);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.cuentaporcobrarSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.cuentaporcobrarSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						cuentaporcobrarLogic.saveCuentaPorCobrars();//WithConnection
						//cuentaporcobrarLogic.getSetVersionRowCuentaPorCobrars();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.cuentaporcobrar,cuentaporcobrarAux);
					
					this.refrescarForeignKeysDescripcionesCuentaPorCobrar();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.cuentaporcobrarSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						if(!this.cuentaporcobrarSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								cuentaporcobrarLogic.saveCuentaPorCobrarRelaciones(cuentaporcobrarAux);//WithConnection
								//cuentaporcobrarLogic.getSetVersionRowCuentaPorCobrars();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.cuentaporcobrar,cuentaporcobrarAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.cuentaporcobrarSessionBean.getEstaModoGuardarRelaciones() 
									|| this.cuentaporcobrarSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(cuentaporcobrarAux,cuentaporcobrarLogic.getCuentaPorCobrars());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(cuentaporcobrarAux,cuentaporcobrars);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.cuentaporcobrar,cuentaporcobrarAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				cuentaporcobrarAux=new  CuentaPorCobrar();
				
				cuentaporcobrarAux.setIsNew(false);
				cuentaporcobrarAux.setIsChanged(false);
				
				cuentaporcobrarAux.setIsDeleted(true);
				
				cuentaporcobrarAux.setId(this.cuentaporcobrar.getId());	
				cuentaporcobrarAux.setVersionRow(this.cuentaporcobrar.getVersionRow());	
				cuentaporcobrarAux.setid_empresa(this.cuentaporcobrar.getid_empresa());	
				cuentaporcobrarAux.setid_sucursal(this.cuentaporcobrar.getid_sucursal());	
				cuentaporcobrarAux.setid_modulo(this.cuentaporcobrar.getid_modulo());	
				cuentaporcobrarAux.setid_ejercicio(this.cuentaporcobrar.getid_ejercicio());	
				cuentaporcobrarAux.setid_moneda(this.cuentaporcobrar.getid_moneda());	
				cuentaporcobrarAux.setid_cliente(this.cuentaporcobrar.getid_cliente());	
				cuentaporcobrarAux.setid_transaccion(this.cuentaporcobrar.getid_transaccion());	
				cuentaporcobrarAux.setid_tipo_transaccion_modulo(this.cuentaporcobrar.getid_tipo_transaccion_modulo());	
				cuentaporcobrarAux.setid_asiento_contable(this.cuentaporcobrar.getid_asiento_contable());	
				cuentaporcobrarAux.setid_factura(this.cuentaporcobrar.getid_factura());	
				cuentaporcobrarAux.setfecha(this.cuentaporcobrar.getfecha());	
				cuentaporcobrarAux.setmonto(this.cuentaporcobrar.getmonto());	
				cuentaporcobrarAux.setnumero_comprobante(this.cuentaporcobrar.getnumero_comprobante());	
				cuentaporcobrarAux.setdebito(this.cuentaporcobrar.getdebito());	
				cuentaporcobrarAux.setcredito(this.cuentaporcobrar.getcredito());	
				cuentaporcobrarAux.setdetalle(this.cuentaporcobrar.getdetalle());	
				
				if(this.cuentaporcobrarSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.cuentaporcobrarAux.getId()>=0) {	
						this.cuentaporcobrarsEliminados.add(cuentaporcobrarAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(cuentaporcobrarAux,cuentaporcobrarLogic.getCuentaPorCobrars());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(cuentaporcobrarAux,cuentaporcobrars);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.cuentaporcobrarSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.cuentaporcobrarSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						cuentaporcobrarLogic.saveCuentaPorCobrars();//WithConnection
						//cuentaporcobrarLogic.getSetVersionRowCuentaPorCobrars();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.cuentaporcobrarSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						
						if(!this.cuentaporcobrarSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								cuentaporcobrarLogic.saveCuentaPorCobrarRelaciones(cuentaporcobrarAux);//WithConnection
								//cuentaporcobrarLogic.getSetVersionRowCuentaPorCobrars();//WithConnection
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
							if(this.cuentaporcobrarSessionBean.getEstaModoGuardarRelaciones() 
								|| this.cuentaporcobrarSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(cuentaporcobrarAux,cuentaporcobrarLogic.getCuentaPorCobrars());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(cuentaporcobrarAux,cuentaporcobrars);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuentaporcobrarLogic.getCuentaPorCobrars().addAll(this.cuentaporcobrarsEliminados);
					
					cuentaporcobrarLogic.saveCuentaPorCobrars();//WithConnection
					//cuentaporcobrarLogic.getSetVersionRowCuentaPorCobrars();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesCuentaPorCobrar();
				
				this.cuentaporcobrarsEliminados= new ArrayList<CuentaPorCobrar>();		
			}
			
			if(this.cuentaporcobrarSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cuentaporcobrarSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Cuenta Por Cobrar GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Cuenta Por Cobrar",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.cuentaporcobrar=cuentaporcobrarAux;
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
      		//this.finishProcessCuentaPorCobrar();
      	}
		
	}	
	
	public void actualizarRelaciones(CuentaPorCobrar cuentaporcobrarLocal) throws Exception {
		
		if(this.cuentaporcobrarSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(CuentaPorCobrar cuentaporcobrarLocal) throws Exception {	
		if(this.cuentaporcobrarSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				cuentaporcobrarLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(SucursalDetalleFormJInternalFrame.class)) {
				SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrameLocal=(SucursalBeanSwingJInternalFrame) ((SucursalDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				sucursalBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoSucursal(sucursalBeanSwingJInternalFrameLocal.getsucursal(),true);
				sucursalBeanSwingJInternalFrameLocal.actualizarLista(sucursalBeanSwingJInternalFrameLocal.sucursal,this.sucursalsForeignKey);

				sucursalBeanSwingJInternalFrameLocal.actualizarRelaciones(sucursalBeanSwingJInternalFrameLocal.sucursal);

				cuentaporcobrarLocal.setSucursal(sucursalBeanSwingJInternalFrameLocal.sucursal);

				this.addItemDefectoCombosForeignKeySucursal();
				this.cargarCombosFrameSucursalsForeignKey("Formulario");
				this.setActualSucursalForeignKey(sucursalBeanSwingJInternalFrameLocal.sucursal.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(ModuloDetalleFormJInternalFrame.class)) {
				ModuloBeanSwingJInternalFrame moduloBeanSwingJInternalFrameLocal=(ModuloBeanSwingJInternalFrame) ((ModuloDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				moduloBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoModulo(moduloBeanSwingJInternalFrameLocal.getmodulo(),true);
				moduloBeanSwingJInternalFrameLocal.actualizarLista(moduloBeanSwingJInternalFrameLocal.modulo,this.modulosForeignKey);

				moduloBeanSwingJInternalFrameLocal.actualizarRelaciones(moduloBeanSwingJInternalFrameLocal.modulo);

				cuentaporcobrarLocal.setModulo(moduloBeanSwingJInternalFrameLocal.modulo);

				this.addItemDefectoCombosForeignKeyModulo();
				this.cargarCombosFrameModulosForeignKey("Formulario");
				this.setActualModuloForeignKey(moduloBeanSwingJInternalFrameLocal.modulo.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(EjercicioDetalleFormJInternalFrame.class)) {
				EjercicioBeanSwingJInternalFrame ejercicioBeanSwingJInternalFrameLocal=(EjercicioBeanSwingJInternalFrame) ((EjercicioDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				ejercicioBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEjercicio(ejercicioBeanSwingJInternalFrameLocal.getejercicio(),true);
				ejercicioBeanSwingJInternalFrameLocal.actualizarLista(ejercicioBeanSwingJInternalFrameLocal.ejercicio,this.ejerciciosForeignKey);

				ejercicioBeanSwingJInternalFrameLocal.actualizarRelaciones(ejercicioBeanSwingJInternalFrameLocal.ejercicio);

				cuentaporcobrarLocal.setEjercicio(ejercicioBeanSwingJInternalFrameLocal.ejercicio);

				this.addItemDefectoCombosForeignKeyEjercicio();
				this.cargarCombosFrameEjerciciosForeignKey("Formulario");
				this.setActualEjercicioForeignKey(ejercicioBeanSwingJInternalFrameLocal.ejercicio.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(MonedaDetalleFormJInternalFrame.class)) {
				MonedaBeanSwingJInternalFrame monedaBeanSwingJInternalFrameLocal=(MonedaBeanSwingJInternalFrame) ((MonedaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				monedaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoMoneda(monedaBeanSwingJInternalFrameLocal.getmoneda(),true);
				monedaBeanSwingJInternalFrameLocal.actualizarLista(monedaBeanSwingJInternalFrameLocal.moneda,this.monedasForeignKey);

				monedaBeanSwingJInternalFrameLocal.actualizarRelaciones(monedaBeanSwingJInternalFrameLocal.moneda);

				cuentaporcobrarLocal.setMoneda(monedaBeanSwingJInternalFrameLocal.moneda);

				this.addItemDefectoCombosForeignKeyMoneda();
				this.cargarCombosFrameMonedasForeignKey("Formulario");
				this.setActualMonedaForeignKey(monedaBeanSwingJInternalFrameLocal.moneda.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(ClienteDetalleFormJInternalFrame.class)) {
				ClienteBeanSwingJInternalFrame clienteBeanSwingJInternalFrameLocal=(ClienteBeanSwingJInternalFrame) ((ClienteDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				clienteBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoCliente(clienteBeanSwingJInternalFrameLocal.getcliente(),true);
				clienteBeanSwingJInternalFrameLocal.actualizarLista(clienteBeanSwingJInternalFrameLocal.cliente,this.clientesForeignKey);

				clienteBeanSwingJInternalFrameLocal.actualizarRelaciones(clienteBeanSwingJInternalFrameLocal.cliente);

				cuentaporcobrarLocal.setCliente(clienteBeanSwingJInternalFrameLocal.cliente);

				this.addItemDefectoCombosForeignKeyCliente();
				this.cargarCombosFrameClientesForeignKey("Formulario");
				this.setActualClienteForeignKey(clienteBeanSwingJInternalFrameLocal.cliente.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(TransaccionDetalleFormJInternalFrame.class)) {
				TransaccionBeanSwingJInternalFrame transaccionBeanSwingJInternalFrameLocal=(TransaccionBeanSwingJInternalFrame) ((TransaccionDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				transaccionBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoTransaccion(transaccionBeanSwingJInternalFrameLocal.gettransaccion(),true);
				transaccionBeanSwingJInternalFrameLocal.actualizarLista(transaccionBeanSwingJInternalFrameLocal.transaccion,this.transaccionsForeignKey);

				transaccionBeanSwingJInternalFrameLocal.actualizarRelaciones(transaccionBeanSwingJInternalFrameLocal.transaccion);

				cuentaporcobrarLocal.setTransaccion(transaccionBeanSwingJInternalFrameLocal.transaccion);

				this.addItemDefectoCombosForeignKeyTransaccion();
				this.cargarCombosFrameTransaccionsForeignKey("Formulario");
				this.setActualTransaccionForeignKey(transaccionBeanSwingJInternalFrameLocal.transaccion.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(TipoTransaccionModuloDetalleFormJInternalFrame.class)) {
				TipoTransaccionModuloBeanSwingJInternalFrame tipotransaccionmoduloBeanSwingJInternalFrameLocal=(TipoTransaccionModuloBeanSwingJInternalFrame) ((TipoTransaccionModuloDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				tipotransaccionmoduloBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoTipoTransaccionModulo(tipotransaccionmoduloBeanSwingJInternalFrameLocal.gettipotransaccionmodulo(),true);
				tipotransaccionmoduloBeanSwingJInternalFrameLocal.actualizarLista(tipotransaccionmoduloBeanSwingJInternalFrameLocal.tipotransaccionmodulo,this.tipotransaccionmodulosForeignKey);

				tipotransaccionmoduloBeanSwingJInternalFrameLocal.actualizarRelaciones(tipotransaccionmoduloBeanSwingJInternalFrameLocal.tipotransaccionmodulo);

				cuentaporcobrarLocal.setTipoTransaccionModulo(tipotransaccionmoduloBeanSwingJInternalFrameLocal.tipotransaccionmodulo);

				this.addItemDefectoCombosForeignKeyTipoTransaccionModulo();
				this.cargarCombosFrameTipoTransaccionModulosForeignKey("Formulario");
				this.setActualTipoTransaccionModuloForeignKey(tipotransaccionmoduloBeanSwingJInternalFrameLocal.tipotransaccionmodulo.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(AsientoContableDetalleFormJInternalFrame.class)) {
				AsientoContableBeanSwingJInternalFrame asientocontableBeanSwingJInternalFrameLocal=(AsientoContableBeanSwingJInternalFrame) ((AsientoContableDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				asientocontableBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoAsientoContable(asientocontableBeanSwingJInternalFrameLocal.getasientocontable(),true);
				asientocontableBeanSwingJInternalFrameLocal.actualizarLista(asientocontableBeanSwingJInternalFrameLocal.asientocontable,this.asientocontablesForeignKey);

				asientocontableBeanSwingJInternalFrameLocal.actualizarRelaciones(asientocontableBeanSwingJInternalFrameLocal.asientocontable);

				cuentaporcobrarLocal.setAsientoContable(asientocontableBeanSwingJInternalFrameLocal.asientocontable);

				this.addItemDefectoCombosForeignKeyAsientoContable();
				this.cargarCombosFrameAsientoContablesForeignKey("Formulario");
				this.setActualAsientoContableForeignKey(asientocontableBeanSwingJInternalFrameLocal.asientocontable.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(FacturaDetalleFormJInternalFrame.class)) {
				FacturaBeanSwingJInternalFrame facturaBeanSwingJInternalFrameLocal=(FacturaBeanSwingJInternalFrame) ((FacturaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				facturaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoFactura(facturaBeanSwingJInternalFrameLocal.getfactura(),true);
				facturaBeanSwingJInternalFrameLocal.actualizarLista(facturaBeanSwingJInternalFrameLocal.factura,this.facturasForeignKey);

				facturaBeanSwingJInternalFrameLocal.actualizarRelaciones(facturaBeanSwingJInternalFrameLocal.factura);

				cuentaporcobrarLocal.setFactura(facturaBeanSwingJInternalFrameLocal.factura);

				this.addItemDefectoCombosForeignKeyFactura();
				this.cargarCombosFrameFacturasForeignKey("Formulario");
				this.setActualFacturaForeignKey(facturaBeanSwingJInternalFrameLocal.factura.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarCuentaPorCobrarActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosCuentaPorCobrar.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.cuentaporcobrar =(CuentaPorCobrar) this.cuentaporcobrarLogic.getCuentaPorCobrars().toArray()[this.jTableDatosCuentaPorCobrar.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.cuentaporcobrar =(CuentaPorCobrar) this.cuentaporcobrars.toArray()[this.jTableDatosCuentaPorCobrar.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = cuentaporcobrarValidator.getInvalidValues(this.cuentaporcobrar);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(CuentaPorCobrar cuentaporcobrar,List<CuentaPorCobrar> cuentaporcobrars) throws Exception {
		try	{		
			CuentaPorCobrarConstantesFunciones.actualizarLista(cuentaporcobrar,cuentaporcobrars,this.cuentaporcobrarSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(CuentaPorCobrar cuentaporcobrar,List<CuentaPorCobrar> cuentaporcobrars) throws Exception {
		try	{			
			CuentaPorCobrarConstantesFunciones.actualizarSelectedLista(cuentaporcobrar,cuentaporcobrars);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<CuentaPorCobrar> cuentaporcobrarsLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				cuentaporcobrarsLocal=this.cuentaporcobrarLogic.getCuentaPorCobrars();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				cuentaporcobrarsLocal=this.cuentaporcobrars;
			}
			//ARCHITECTURE
		
			for(CuentaPorCobrar cuentaporcobrarLocal:cuentaporcobrarsLocal) {
				if(this.permiteMantenimiento(cuentaporcobrarLocal) && cuentaporcobrarLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+CuentaPorCobrarConstantesFunciones.getCuentaPorCobrarLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(CuentaPorCobrarConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCuentaPorCobrar.jLabelid_empresaCuentaPorCobrar,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CuentaPorCobrarConstantesFunciones.IDSUCURSAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCuentaPorCobrar.jLabelid_sucursalCuentaPorCobrar,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CuentaPorCobrarConstantesFunciones.IDMODULO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCuentaPorCobrar.jLabelid_moduloCuentaPorCobrar,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CuentaPorCobrarConstantesFunciones.IDEJERCICIO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCuentaPorCobrar.jLabelid_ejercicioCuentaPorCobrar,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CuentaPorCobrarConstantesFunciones.IDMONEDA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCuentaPorCobrar.jLabelid_monedaCuentaPorCobrar,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CuentaPorCobrarConstantesFunciones.IDCLIENTE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCuentaPorCobrar.jLabelid_clienteCuentaPorCobrar,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CuentaPorCobrarConstantesFunciones.IDTRANSACCION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCuentaPorCobrar.jLabelid_transaccionCuentaPorCobrar,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CuentaPorCobrarConstantesFunciones.IDTIPOTRANSACCIONMODULO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCuentaPorCobrar.jLabelid_tipo_transaccion_moduloCuentaPorCobrar,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CuentaPorCobrarConstantesFunciones.IDASIENTOCONTABLE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCuentaPorCobrar.jLabelid_asiento_contableCuentaPorCobrar,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CuentaPorCobrarConstantesFunciones.IDFACTURA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCuentaPorCobrar.jLabelid_facturaCuentaPorCobrar,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CuentaPorCobrarConstantesFunciones.FECHA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCuentaPorCobrar.jLabelfechaCuentaPorCobrar,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CuentaPorCobrarConstantesFunciones.MONTO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCuentaPorCobrar.jLabelmontoCuentaPorCobrar,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CuentaPorCobrarConstantesFunciones.NUMEROCOMPROBANTE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCuentaPorCobrar.jLabelnumero_comprobanteCuentaPorCobrar,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CuentaPorCobrarConstantesFunciones.DEBITO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCuentaPorCobrar.jLabeldebitoCuentaPorCobrar,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CuentaPorCobrarConstantesFunciones.CREDITO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCuentaPorCobrar.jLabelcreditoCuentaPorCobrar,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CuentaPorCobrarConstantesFunciones.DETALLE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCuentaPorCobrar.jLabeldetalleCuentaPorCobrar,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormCuentaPorCobrar!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCuentaPorCobrar.jLabelid_empresaCuentaPorCobrar,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCuentaPorCobrar.jLabelid_sucursalCuentaPorCobrar,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCuentaPorCobrar.jLabelid_moduloCuentaPorCobrar,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCuentaPorCobrar.jLabelid_ejercicioCuentaPorCobrar,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCuentaPorCobrar.jLabelid_monedaCuentaPorCobrar,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCuentaPorCobrar.jLabelid_clienteCuentaPorCobrar,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCuentaPorCobrar.jLabelid_transaccionCuentaPorCobrar,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCuentaPorCobrar.jLabelid_tipo_transaccion_moduloCuentaPorCobrar,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCuentaPorCobrar.jLabelid_asiento_contableCuentaPorCobrar,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCuentaPorCobrar.jLabelid_facturaCuentaPorCobrar,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCuentaPorCobrar.jLabelfechaCuentaPorCobrar,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCuentaPorCobrar.jLabelmontoCuentaPorCobrar,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCuentaPorCobrar.jLabelnumero_comprobanteCuentaPorCobrar,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCuentaPorCobrar.jLabeldebitoCuentaPorCobrar,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCuentaPorCobrar.jLabelcreditoCuentaPorCobrar,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCuentaPorCobrar.jLabeldetalleCuentaPorCobrar,"");
		
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
		this.iIdNuevoCuentaPorCobrar--;	
		
		
		this.cuentaporcobrarAux=new CuentaPorCobrar();
		
		this.cuentaporcobrarAux.setId(this.iIdNuevoCuentaPorCobrar);
		this.cuentaporcobrarAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.cuentaporcobrarLogic.getCuentaPorCobrars().add(this.cuentaporcobrarAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.cuentaporcobrars.add(this.cuentaporcobrarAux);
		}
		//ARCHITECTURE
		
		this.cuentaporcobrar=this.cuentaporcobrarAux;
		
		if(CuentaPorCobrarJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioCuentaPorCobrar(this.cuentaporcobrar);
			this.setVariablesObjetoActualToFormularioForeignKeyCuentaPorCobrar(this.cuentaporcobrar);
		}
				
		//this.setDefaultControlesCuentaPorCobrar();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyCuentaPorCobrar();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyCuentaPorCobrar();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyCuentaPorCobrar();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualCuentaPorCobrar(this.cuentaporcobrarBean,this.cuentaporcobrar,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysCuentaPorCobrar(this.cuentaporcobrar);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(CuentaPorCobrarConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.cuentaporcobrarSessionBean.getConGuardarRelaciones()) {
			classes=CuentaPorCobrarConstantesFunciones.getClassesRelationshipsOfCuentaPorCobrar(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.cuentaporcobrarReturnGeneral=cuentaporcobrarLogic.procesarEventosCuentaPorCobrarsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.cuentaporcobrarLogic.getCuentaPorCobrars(),this.cuentaporcobrar,this.cuentaporcobrarParameterGeneral,this.isEsNuevoCuentaPorCobrar,classes);//this.cuentaporcobrarLogic.getCuentaPorCobrar()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanCuentaPorCobrar(this.cuentaporcobrarReturnGeneral,this.cuentaporcobrarBean,false);
		
		if(this.cuentaporcobrarReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyCuentaPorCobrar(this.cuentaporcobrarReturnGeneral.getCuentaPorCobrar());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioCuentaPorCobrar(this.cuentaporcobrarReturnGeneral.getCuentaPorCobrar());
		}
		
		if(this.cuentaporcobrarReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioCuentaPorCobrar(this.cuentaporcobrarReturnGeneral.getCuentaPorCobrar(),classes);//this.cuentaporcobrarBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualCuentaPorCobrar(this.cuentaporcobrar,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyCuentaPorCobrar();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyCuentaPorCobrar();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			CuentaPorCobrarBeanSwingJInternalFrameAdditional.RecargarFormCuentaPorCobrar(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingCuentaPorCobrar(false);
						
			if(cuentaporcobrarSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(CuentaPorCobrarJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualCuentaPorCobrar();
			}
			
			this.actualizarVisualTableDatosCuentaPorCobrar();
			
			this.jTableDatosCuentaPorCobrar.setRowSelectionInterval(this.getIndiceNuevoCuentaPorCobrar(), this.getIndiceNuevoCuentaPorCobrar());
			
			this.seleccionarFilaTablaCuentaPorCobrarActual();
						
			this.actualizarEstadoCeldasBotonesCuentaPorCobrar("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesCuentaPorCobrar(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormCuentaPorCobrar.jDateChooserfechaCuentaPorCobrar.setEnabled(isHabilitar && this.cuentaporcobrarConstantesFunciones.activarfechaCuentaPorCobrar);
		this.jInternalFrameDetalleFormCuentaPorCobrar.jTextFieldmontoCuentaPorCobrar.setEnabled(isHabilitar && this.cuentaporcobrarConstantesFunciones.activarmontoCuentaPorCobrar);
		this.jInternalFrameDetalleFormCuentaPorCobrar.jTextFieldnumero_comprobanteCuentaPorCobrar.setEnabled(isHabilitar && this.cuentaporcobrarConstantesFunciones.activarnumero_comprobanteCuentaPorCobrar);
		this.jInternalFrameDetalleFormCuentaPorCobrar.jTextFielddebitoCuentaPorCobrar.setEnabled(isHabilitar && this.cuentaporcobrarConstantesFunciones.activardebitoCuentaPorCobrar);
		this.jInternalFrameDetalleFormCuentaPorCobrar.jTextFieldcreditoCuentaPorCobrar.setEnabled(isHabilitar && this.cuentaporcobrarConstantesFunciones.activarcreditoCuentaPorCobrar);
		this.jInternalFrameDetalleFormCuentaPorCobrar.jTextAreadetalleCuentaPorCobrar.setEnabled(isHabilitar && this.cuentaporcobrarConstantesFunciones.activardetalleCuentaPorCobrar);	
		//
		this.jInternalFrameDetalleFormCuentaPorCobrar.jComboBoxid_empresaCuentaPorCobrar.setEnabled(isHabilitar && this.cuentaporcobrarConstantesFunciones.activarid_empresaCuentaPorCobrar);//
		this.jInternalFrameDetalleFormCuentaPorCobrar.jComboBoxid_sucursalCuentaPorCobrar.setEnabled(isHabilitar && this.cuentaporcobrarConstantesFunciones.activarid_sucursalCuentaPorCobrar);//
		this.jInternalFrameDetalleFormCuentaPorCobrar.jComboBoxid_moduloCuentaPorCobrar.setEnabled(isHabilitar && this.cuentaporcobrarConstantesFunciones.activarid_moduloCuentaPorCobrar);//
		this.jInternalFrameDetalleFormCuentaPorCobrar.jComboBoxid_ejercicioCuentaPorCobrar.setEnabled(isHabilitar && this.cuentaporcobrarConstantesFunciones.activarid_ejercicioCuentaPorCobrar);//
		this.jInternalFrameDetalleFormCuentaPorCobrar.jComboBoxid_monedaCuentaPorCobrar.setEnabled(isHabilitar && this.cuentaporcobrarConstantesFunciones.activarid_monedaCuentaPorCobrar);
		this.jInternalFrameDetalleFormCuentaPorCobrar.jComboBoxid_clienteCuentaPorCobrar.setEnabled(isHabilitar && this.cuentaporcobrarConstantesFunciones.activarid_clienteCuentaPorCobrar);
		this.jInternalFrameDetalleFormCuentaPorCobrar.jComboBoxid_transaccionCuentaPorCobrar.setEnabled(isHabilitar && this.cuentaporcobrarConstantesFunciones.activarid_transaccionCuentaPorCobrar);//
		this.jInternalFrameDetalleFormCuentaPorCobrar.jComboBoxid_tipo_transaccion_moduloCuentaPorCobrar.setEnabled(isHabilitar && this.cuentaporcobrarConstantesFunciones.activarid_tipo_transaccion_moduloCuentaPorCobrar);
		this.jInternalFrameDetalleFormCuentaPorCobrar.jComboBoxid_asiento_contableCuentaPorCobrar.setEnabled(isHabilitar && this.cuentaporcobrarConstantesFunciones.activarid_asiento_contableCuentaPorCobrar);
		this.jInternalFrameDetalleFormCuentaPorCobrar.jComboBoxid_facturaCuentaPorCobrar.setEnabled(isHabilitar && this.cuentaporcobrarConstantesFunciones.activarid_facturaCuentaPorCobrar);
	};
	
	public void setDefaultControlesCuentaPorCobrar() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoCuentaPorCobrar(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.cuentaporcobrarSessionBean.setConGuardarRelaciones(true);			
			this.cuentaporcobrarSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormCuentaPorCobrar.jTabbedPaneRelacionesCuentaPorCobrar.setVisible(true);
			
					
		} else {
			//this.cuentaporcobrarSessionBean.setConGuardarRelaciones(false);			
			this.cuentaporcobrarSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormCuentaPorCobrar.jTabbedPaneRelacionesCuentaPorCobrar.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoCuentaPorCobrar() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(CuentaPorCobrar cuentaporcobrarAux:this.cuentaporcobrarLogic.getCuentaPorCobrars()) {
				if(cuentaporcobrarAux.getId().equals(this.iIdNuevoCuentaPorCobrar)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(CuentaPorCobrar cuentaporcobrarAux:this.cuentaporcobrars) {
				if(cuentaporcobrarAux.getId().equals(this.iIdNuevoCuentaPorCobrar)) {
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
	
	public int getIndiceActualCuentaPorCobrar(CuentaPorCobrar cuentaporcobrar,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(CuentaPorCobrar cuentaporcobrarAux:this.cuentaporcobrarLogic.getCuentaPorCobrars()) {
				if(cuentaporcobrarAux.getId().equals(cuentaporcobrar.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(CuentaPorCobrar cuentaporcobrarAux:this.cuentaporcobrars) {
				if(cuentaporcobrarAux.getId().equals(cuentaporcobrar.getId())) {
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
	
	public void setCamposBaseDesdeOriginalCuentaPorCobrar(CuentaPorCobrar cuentaporcobrarOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(CuentaPorCobrar cuentaporcobrarAux:this.cuentaporcobrarLogic.getCuentaPorCobrars()) {
				if(cuentaporcobrarAux.getCuentaPorCobrarOriginal().getId().equals(cuentaporcobrarOriginal.getId())) {
					existe=true;
					cuentaporcobrarOriginal.setId(cuentaporcobrarAux.getId());
					cuentaporcobrarOriginal.setVersionRow(cuentaporcobrarAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(CuentaPorCobrar cuentaporcobrarAux:this.cuentaporcobrars) {
				if(cuentaporcobrarAux.getCuentaPorCobrarOriginal().getId().equals(cuentaporcobrarOriginal.getId())) {
					existe=true;
					cuentaporcobrarOriginal.setId(cuentaporcobrarAux.getId());
					cuentaporcobrarOriginal.setVersionRow(cuentaporcobrarAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosCuentaPorCobrar(Boolean esParaCancelar) throws Exception {
		cuentaporcobrarsAux=new ArrayList<CuentaPorCobrar>();
		cuentaporcobrarAux=new CuentaPorCobrar();
		
		if(!this.cuentaporcobrarSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(CuentaPorCobrar cuentaporcobrarAux:this.cuentaporcobrarLogic.getCuentaPorCobrars()) {
					if(cuentaporcobrarAux.getId()<0) {
						cuentaporcobrarsAux.add(cuentaporcobrarAux);
					}		
				}
				this.iIdNuevoCuentaPorCobrar=0L;
				this.cuentaporcobrarLogic.getCuentaPorCobrars().removeAll(cuentaporcobrarsAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(CuentaPorCobrar cuentaporcobrarAux:this.cuentaporcobrars) {
					if(cuentaporcobrarAux.getId()<0) {
						cuentaporcobrarsAux.add(cuentaporcobrarAux);
					}		
				}
				this.iIdNuevoCuentaPorCobrar=0L;
				this.cuentaporcobrars.removeAll(cuentaporcobrarsAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoCuentaPorCobrar 
					&& this.cuentaporcobrarLogic.getCuentaPorCobrars().size()>0
					) {
					cuentaporcobrarAux=this.cuentaporcobrarLogic.getCuentaPorCobrars().get(this.cuentaporcobrarLogic.getCuentaPorCobrars().size() - 1);
				
					if(cuentaporcobrarAux.getId()<0) {
						this.cuentaporcobrarLogic.getCuentaPorCobrars().remove(cuentaporcobrarAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoCuentaPorCobrar && this.cuentaporcobrars.size()>0) {
					cuentaporcobrarAux=this.cuentaporcobrars.get(this.cuentaporcobrars.size() - 1);
				
					if(cuentaporcobrarAux.getId()<0) {
						this.cuentaporcobrars.remove(cuentaporcobrarAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoCuentaPorCobrar(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(cuentaporcobrar.getId()<0) {
				this.cuentaporcobrarLogic.getCuentaPorCobrars().remove(this.cuentaporcobrar);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(cuentaporcobrar.getId()<0) {
				this.cuentaporcobrars.remove(this.cuentaporcobrar);
			}
		}			
	}
	
	public void setEstadosInicialesCuentaPorCobrar(List<CuentaPorCobrar> cuentaporcobrarsAux) throws Exception {
		CuentaPorCobrarConstantesFunciones.setEstadosInicialesCuentaPorCobrar(cuentaporcobrarsAux);
	}
	
	public void setEstadosInicialesCuentaPorCobrar(CuentaPorCobrar cuentaporcobrarAux) throws Exception {
		CuentaPorCobrarConstantesFunciones.setEstadosInicialesCuentaPorCobrar(cuentaporcobrarAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarCuentaPorCobrarActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesCuentaPorCobrar("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CuentaPorCobrarConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarCuentaPorCobrarActual()) {
				if(!this.isEsNuevoCuentaPorCobrar) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesCuentaPorCobrar("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoCuentaPorCobrar=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CuentaPorCobrarConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarCuentaPorCobrarActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Cuenta Por Cobrar ?", "MANTENIMIENTO DE Cuenta Por Cobrar", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesCuentaPorCobrar("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CuentaPorCobrarConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CuentaPorCobrarConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(CuentaPorCobrar cuentaporcobrar) throws Exception {
		CuentaPorCobrarConstantesFunciones.seleccionarAsignar(this.cuentaporcobrar,cuentaporcobrar);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarCuentaPorCobrar=this.isPermisoActualizarOriginalCuentaPorCobrar;
			
			
			this.seleccionarAsignar(cuentaporcobrar);
			
			

			idClienteActual=cuentaporcobrar.getid_cliente();
			this.seleccionarClienteActual();

			idAsientoContableActual=cuentaporcobrar.getid_asiento_contable();
			this.seleccionarAsientoContableActual();

			idFacturaActual=cuentaporcobrar.getid_factura();
			this.seleccionarFacturaActual();
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			CuentaPorCobrarConstantesFunciones.quitarEspaciosCuentaPorCobrar(this.cuentaporcobrar,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesCuentaPorCobrar("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CuentaPorCobrarConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.cuentaporcobrarSessionBean.setsFuncionBusquedaRapida(this.cuentaporcobrarSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CuentaPorCobrarConstantesFunciones.CLASSNAME);
		}
	}
	
	
	//BUSQUEDA INTERNA FK
	public void seleccionarClienteActual() throws Exception {
		try	{
			Cliente clienteAux=new Cliente();

			if(this.idClienteActual != null && this.idClienteActual>0) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					clienteLogic.getEntityWithConnection(this.idClienteActual);
					clienteAux= clienteLogic.getCliente();
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE

				clientesForeignKey=new ArrayList<Cliente>();
				clientesForeignKey.add(clienteAux);
			}

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}
	public void seleccionarAsientoContableActual() throws Exception {
		try	{
			AsientoContable asientocontableAux=new AsientoContable();

			if(this.idAsientoContableActual != null && this.idAsientoContableActual>0) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					asientocontableLogic.getEntityWithConnection(this.idAsientoContableActual);
					asientocontableAux= asientocontableLogic.getAsientoContable();
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE

				asientocontablesForeignKey=new ArrayList<AsientoContable>();
				asientocontablesForeignKey.add(asientocontableAux);
			}

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}
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
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoCuentaPorCobrar) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosCuentaPorCobrar(esParaCancelar);				
				this.cancelarNuevoCuentaPorCobrar(esParaCancelar);								
			}
			
			this.cuentaporcobrar=new CuentaPorCobrar();
			
			this.inicializarCuentaPorCobrar();
			
			this.actualizarEstadoCeldasBotonesCuentaPorCobrar("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CuentaPorCobrarConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarCuentaPorCobrar() throws Exception {
		try {
			CuentaPorCobrarConstantesFunciones.inicializarCuentaPorCobrar(this.cuentaporcobrar);
			
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
			FuncionesSwing.manageException(this, e,logger,CuentaPorCobrarConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.cuentaporcobrarLogic.getCuentaPorCobrars().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CuentaPorCobrarConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteCuentaPorCobrars(String sAccionBusqueda,List<CuentaPorCobrar> cuentaporcobrarsParaReportes) throws Exception {
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
					sPathReporteFinal="CuentaPorCobrar"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="CuentaPorCobrarMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("CuentaPorCobrarMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="CuentaPorCobrar"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Cuenta Por Cobrares");		
		parameters.put("busquedapor", CuentaPorCobrarConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceCuentaPorCobrar=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			CuentaPorCobrarConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			CuentaPorCobrarConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceCuentaPorCobrar=new JRBeanArrayDataSource(CuentaPorCobrarJInternalFrame.TraerCuentaPorCobrarBeans(cuentaporcobrarsParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceCuentaPorCobrar);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+CuentaPorCobrarConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+CuentaPorCobrarConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(CuentaPorCobrarBean.TraerCuentaPorCobrarBeans(cuentaporcobrarsParaReportes).toArray()));
							
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
				this.generarExcelReporteCuentaPorCobrars(sAccionBusqueda,sTipoArchivoReporte,cuentaporcobrarsParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalCuentaPorCobrars(sAccionBusqueda,sTipoArchivoReporte,cuentaporcobrarsParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoCuentaPorCobrarActionPerformed(null);
					//this.generarExcelReporteCuentaPorCobrars(sAccionBusqueda,sTipoArchivoReporte,cuentaporcobrarsParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalCuentaPorCobrars(sAccionBusqueda,sTipoArchivoReporte,cuentaporcobrarsParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesCuentaPorCobrars(sAccionBusqueda,sTipoArchivoReporte,cuentaporcobrarsParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesCuentaPorCobrars(sAccionBusqueda,sTipoArchivoReporte,cuentaporcobrarsParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteCuentaPorCobrars(String sAccionBusqueda,String sTipoArchivoReporte,List<CuentaPorCobrar> cuentaporcobrarsParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"cuentaporcobrar";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("CuentaPorCobrars");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderCuentaPorCobrar("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(CuentaPorCobrar cuentaporcobrar : cuentaporcobrarsParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			CuentaPorCobrarConstantesFunciones.generarExcelReporteDataCuentaPorCobrar("NORMAL",row,workbook,cuentaporcobrar,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cuentaporcobrarSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Cuenta Por Cobrar",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderCuentaPorCobrar(String sTipo,Row row,Workbook workbook) {
		
		CuentaPorCobrarConstantesFunciones.generarExcelReporteHeaderCuentaPorCobrar(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalCuentaPorCobrars(String sAccionBusqueda,String sTipoArchivoReporte,List<CuentaPorCobrar> cuentaporcobrarsParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"cuentaporcobrar_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("CuentaPorCobrars");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(CuentaPorCobrar cuentaporcobrar : cuentaporcobrarsParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(CuentaPorCobrarConstantesFunciones.getCuentaPorCobrarDescripcion(cuentaporcobrar));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CuentaPorCobrarConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CuentaPorCobrarConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cuentaporcobrar.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CuentaPorCobrarConstantesFunciones.LABEL_IDSUCURSAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CuentaPorCobrarConstantesFunciones.LABEL_IDSUCURSAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cuentaporcobrar.getsucursal_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CuentaPorCobrarConstantesFunciones.LABEL_IDMODULO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CuentaPorCobrarConstantesFunciones.LABEL_IDMODULO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cuentaporcobrar.getmodulo_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CuentaPorCobrarConstantesFunciones.LABEL_IDEJERCICIO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CuentaPorCobrarConstantesFunciones.LABEL_IDEJERCICIO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cuentaporcobrar.getejercicio_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CuentaPorCobrarConstantesFunciones.LABEL_IDMONEDA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CuentaPorCobrarConstantesFunciones.LABEL_IDMONEDA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cuentaporcobrar.getmoneda_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CuentaPorCobrarConstantesFunciones.LABEL_IDCLIENTE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CuentaPorCobrarConstantesFunciones.LABEL_IDCLIENTE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cuentaporcobrar.getcliente_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CuentaPorCobrarConstantesFunciones.LABEL_IDTRANSACCION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CuentaPorCobrarConstantesFunciones.LABEL_IDTRANSACCION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cuentaporcobrar.gettransaccion_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CuentaPorCobrarConstantesFunciones.LABEL_IDTIPOTRANSACCIONMODULO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CuentaPorCobrarConstantesFunciones.LABEL_IDTIPOTRANSACCIONMODULO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cuentaporcobrar.gettipotransaccionmodulo_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CuentaPorCobrarConstantesFunciones.LABEL_IDASIENTOCONTABLE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CuentaPorCobrarConstantesFunciones.LABEL_IDASIENTOCONTABLE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cuentaporcobrar.getasientocontable_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CuentaPorCobrarConstantesFunciones.LABEL_IDFACTURA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CuentaPorCobrarConstantesFunciones.LABEL_IDFACTURA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cuentaporcobrar.getfactura_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CuentaPorCobrarConstantesFunciones.LABEL_FECHA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CuentaPorCobrarConstantesFunciones.LABEL_FECHA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cuentaporcobrar.getfecha());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CuentaPorCobrarConstantesFunciones.LABEL_MONTO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CuentaPorCobrarConstantesFunciones.LABEL_MONTO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cuentaporcobrar.getmonto());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CuentaPorCobrarConstantesFunciones.LABEL_NUMEROCOMPROBANTE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CuentaPorCobrarConstantesFunciones.LABEL_NUMEROCOMPROBANTE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cuentaporcobrar.getnumero_comprobante());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CuentaPorCobrarConstantesFunciones.LABEL_DEBITO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CuentaPorCobrarConstantesFunciones.LABEL_DEBITO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cuentaporcobrar.getdebito());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CuentaPorCobrarConstantesFunciones.LABEL_CREDITO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CuentaPorCobrarConstantesFunciones.LABEL_CREDITO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cuentaporcobrar.getcredito());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CuentaPorCobrarConstantesFunciones.LABEL_DETALLE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CuentaPorCobrarConstantesFunciones.LABEL_DETALLE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cuentaporcobrar.getdetalle());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cuentaporcobrarSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Cuenta Por Cobrar",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesCuentaPorCobrars(String sAccionBusqueda,String sTipoArchivoReporte,List<CuentaPorCobrar> cuentaporcobrarsParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<CuentaPorCobrar> cuentaporcobrarsRespaldo=null;
		
		classes=CuentaPorCobrarConstantesFunciones.getClassesRelationshipsOfCuentaPorCobrar(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.cuentaporcobrarLogic.setDatosCliente(this.datosCliente);
		this.cuentaporcobrarLogic.setDatosDeep(this.datosDeep);
		this.cuentaporcobrarLogic.setIsConDeep(true);
		
		cuentaporcobrarsRespaldo=this.cuentaporcobrarLogic.getCuentaPorCobrars();
		
		this.cuentaporcobrarLogic.setCuentaPorCobrars(cuentaporcobrarsParaReportes);	
		this.cuentaporcobrarLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		cuentaporcobrarsParaReportes=this.cuentaporcobrarLogic.getCuentaPorCobrars();
		this.cuentaporcobrarLogic.setCuentaPorCobrars(cuentaporcobrarsRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"cuentaporcobrar_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("CuentaPorCobrars");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderCuentaPorCobrar("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(CuentaPorCobrar cuentaporcobrar : cuentaporcobrarsParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderCuentaPorCobrar("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			CuentaPorCobrarConstantesFunciones.generarExcelReporteDataCuentaPorCobrar("NORMAL",row,workbook,cuentaporcobrar,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(CuentaPorCobrarConstantesFunciones.getCuentaPorCobrarDescripcion(cuentaporcobrar));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cuentaporcobrarSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Cuenta Por Cobrar",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoCuentaPorCobrar.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoCuentaPorCobrar.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoCuentaPorCobrar.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoCuentaPorCobrar.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessCuentaPorCobrar() throws Exception {		
		this.startProcessCuentaPorCobrar(true);
	}
	
	public void startProcessCuentaPorCobrar(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasCuentaPorCobrar ,this.jPanelParametrosReportesCuentaPorCobrar, this.jScrollPanelDatosCuentaPorCobrar,this.jPanelPaginacionCuentaPorCobrar, this.jScrollPanelDatosEdicionCuentaPorCobrar, this.jPanelAccionesCuentaPorCobrar,this.jPanelAccionesFormularioCuentaPorCobrar,this.jmenuBarCuentaPorCobrar,this.jmenuBarDetalleCuentaPorCobrar,this.jTtoolBarCuentaPorCobrar,this.jTtoolBarDetalleCuentaPorCobrar);		
		
		final JTabbedPane jTabbedPaneBusquedasCuentaPorCobrar=this.jTabbedPaneBusquedasCuentaPorCobrar; 
		
		final JPanel jPanelParametrosReportesCuentaPorCobrar=this.jPanelParametrosReportesCuentaPorCobrar;
		//final JScrollPane jScrollPanelDatosCuentaPorCobrar=this.jScrollPanelDatosCuentaPorCobrar;
		final JTable jTableDatosCuentaPorCobrar=this.jTableDatosCuentaPorCobrar;		
		final JPanel jPanelPaginacionCuentaPorCobrar=this.jPanelPaginacionCuentaPorCobrar;
		//final JScrollPane jScrollPanelDatosEdicionCuentaPorCobrar=this.jScrollPanelDatosEdicionCuentaPorCobrar;
		final JPanel jPanelAccionesCuentaPorCobrar=this.jPanelAccionesCuentaPorCobrar;
		
		JPanel jPanelCamposAuxiliarCuentaPorCobrar=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarCuentaPorCobrar=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormCuentaPorCobrar!=null) {
			jPanelCamposAuxiliarCuentaPorCobrar=this.jInternalFrameDetalleFormCuentaPorCobrar.jPanelCamposCuentaPorCobrar;
			jPanelAccionesFormularioAuxiliarCuentaPorCobrar=this.jInternalFrameDetalleFormCuentaPorCobrar.jPanelAccionesFormularioCuentaPorCobrar;
		}
		
		final JPanel jPanelCamposCuentaPorCobrar=jPanelCamposAuxiliarCuentaPorCobrar;
		final JPanel jPanelAccionesFormularioCuentaPorCobrar=jPanelAccionesFormularioAuxiliarCuentaPorCobrar;
		
		
		final JMenuBar jmenuBarCuentaPorCobrar=this.jmenuBarCuentaPorCobrar;
		final JToolBar jTtoolBarCuentaPorCobrar=this.jTtoolBarCuentaPorCobrar;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarCuentaPorCobrar=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarCuentaPorCobrar=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormCuentaPorCobrar!=null) {
			jmenuBarDetalleAuxiliarCuentaPorCobrar=this.jInternalFrameDetalleFormCuentaPorCobrar.jmenuBarDetalleCuentaPorCobrar;
			jTtoolBarDetalleAuxiliarCuentaPorCobrar=this.jInternalFrameDetalleFormCuentaPorCobrar.jTtoolBarDetalleCuentaPorCobrar;
		}
		
		final JMenuBar jmenuBarDetalleCuentaPorCobrar=jmenuBarDetalleAuxiliarCuentaPorCobrar;
		final JToolBar jTtoolBarDetalleCuentaPorCobrar=jTtoolBarDetalleAuxiliarCuentaPorCobrar;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasCuentaPorCobrar;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesCuentaPorCobrar;
			processRunnable.jTableDatos=jTableDatosCuentaPorCobrar;
			processRunnable.jPanelCampos=jPanelCamposCuentaPorCobrar;
			processRunnable.jPanelPaginacion=jPanelPaginacionCuentaPorCobrar;
			processRunnable.jPanelAcciones=jPanelAccionesCuentaPorCobrar;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioCuentaPorCobrar;
			
			
			processRunnable.jmenuBar=jmenuBarCuentaPorCobrar;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleCuentaPorCobrar;
			processRunnable.jTtoolBar=jTtoolBarCuentaPorCobrar;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleCuentaPorCobrar;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasCuentaPorCobrar ,jPanelParametrosReportesCuentaPorCobrar,jTableDatosCuentaPorCobrar, /*jScrollPanelDatosCuentaPorCobrar,*/jPanelCamposCuentaPorCobrar,jPanelPaginacionCuentaPorCobrar, /*jScrollPanelDatosEdicionCuentaPorCobrar,*/ jPanelAccionesCuentaPorCobrar,jPanelAccionesFormularioCuentaPorCobrar,jmenuBarCuentaPorCobrar,jmenuBarDetalleCuentaPorCobrar,jTtoolBarCuentaPorCobrar,jTtoolBarDetalleCuentaPorCobrar);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasCuentaPorCobrar ,jPanelParametrosReportesCuentaPorCobrar, jScrollPanelDatosCuentaPorCobrar,jPanelPaginacionCuentaPorCobrar, jScrollPanelDatosEdicionCuentaPorCobrar, jPanelAccionesCuentaPorCobrar,jPanelAccionesFormularioCuentaPorCobrar,jmenuBarCuentaPorCobrar,jmenuBarDetalleCuentaPorCobrar,jTtoolBarCuentaPorCobrar,jTtoolBarDetalleCuentaPorCobrar);
						
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
	
	public void finishProcessCuentaPorCobrar() {// throws Exception 
		this.finishProcessCuentaPorCobrar(true);
	}
	
	public void finishProcessCuentaPorCobrar(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasCuentaPorCobrar ,this.jPanelParametrosReportesCuentaPorCobrar, this.jScrollPanelDatosCuentaPorCobrar,this.jPanelPaginacionCuentaPorCobrar, this.jScrollPanelDatosEdicionCuentaPorCobrar, this.jPanelAccionesCuentaPorCobrar,this.jPanelAccionesFormularioCuentaPorCobrar,this.jmenuBarCuentaPorCobrar,this.jmenuBarDetalleCuentaPorCobrar,this.jTtoolBarCuentaPorCobrar,this.jTtoolBarDetalleCuentaPorCobrar);		
		
		final JTabbedPane jTabbedPaneBusquedasCuentaPorCobrar=this.jTabbedPaneBusquedasCuentaPorCobrar; 
		
		final JPanel jPanelParametrosReportesCuentaPorCobrar=this.jPanelParametrosReportesCuentaPorCobrar;
		//final JScrollPane jScrollPanelDatosCuentaPorCobrar=this.jScrollPanelDatosCuentaPorCobrar;
		final JTable jTableDatosCuentaPorCobrar=this.jTableDatosCuentaPorCobrar;		
		final JPanel jPanelPaginacionCuentaPorCobrar=this.jPanelPaginacionCuentaPorCobrar;
		//final JScrollPane jScrollPanelDatosEdicionCuentaPorCobrar=this.jScrollPanelDatosEdicionCuentaPorCobrar;
		final JPanel jPanelAccionesCuentaPorCobrar=this.jPanelAccionesCuentaPorCobrar;
		
		JPanel jPanelCamposAuxiliarCuentaPorCobrar=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarCuentaPorCobrar=new JPanel();
		
		if(this.jInternalFrameDetalleFormCuentaPorCobrar!=null) {
			jPanelCamposAuxiliarCuentaPorCobrar=this.jInternalFrameDetalleFormCuentaPorCobrar.jPanelCamposCuentaPorCobrar;
			jPanelAccionesFormularioAuxiliarCuentaPorCobrar=this.jInternalFrameDetalleFormCuentaPorCobrar.jPanelAccionesFormularioCuentaPorCobrar;
		}
		
		final JPanel jPanelCamposCuentaPorCobrar=jPanelCamposAuxiliarCuentaPorCobrar;
		final JPanel jPanelAccionesFormularioCuentaPorCobrar=jPanelAccionesFormularioAuxiliarCuentaPorCobrar;
		
		
		final JMenuBar jmenuBarCuentaPorCobrar=this.jmenuBarCuentaPorCobrar;		
		final JToolBar jTtoolBarCuentaPorCobrar=this.jTtoolBarCuentaPorCobrar;
				
		JMenuBar jmenuBarDetalleAuxiliarCuentaPorCobrar=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarCuentaPorCobrar=new JToolBar();
		
		if(this.jInternalFrameDetalleFormCuentaPorCobrar!=null) {
			jmenuBarDetalleAuxiliarCuentaPorCobrar=this.jInternalFrameDetalleFormCuentaPorCobrar.jmenuBarDetalleCuentaPorCobrar;
			jTtoolBarDetalleAuxiliarCuentaPorCobrar=this.jInternalFrameDetalleFormCuentaPorCobrar.jTtoolBarDetalleCuentaPorCobrar;		
		}
		
		final JMenuBar jmenuBarDetalleCuentaPorCobrar=jmenuBarDetalleAuxiliarCuentaPorCobrar;
		final JToolBar jTtoolBarDetalleCuentaPorCobrar=jTtoolBarDetalleAuxiliarCuentaPorCobrar;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasCuentaPorCobrar;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesCuentaPorCobrar;
			processRunnable.jTableDatos=jTableDatosCuentaPorCobrar;
			processRunnable.jPanelCampos=jPanelCamposCuentaPorCobrar;
			processRunnable.jPanelPaginacion=jPanelPaginacionCuentaPorCobrar;
			processRunnable.jPanelAcciones=jPanelAccionesCuentaPorCobrar;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioCuentaPorCobrar;
			
			
			processRunnable.jmenuBar=jmenuBarCuentaPorCobrar;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleCuentaPorCobrar;
			processRunnable.jTtoolBar=jTtoolBarCuentaPorCobrar;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleCuentaPorCobrar;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasCuentaPorCobrar ,jPanelParametrosReportesCuentaPorCobrar, jTableDatosCuentaPorCobrar,/*jScrollPanelDatosCuentaPorCobrar,*/jPanelCamposCuentaPorCobrar,jPanelPaginacionCuentaPorCobrar, /*jScrollPanelDatosEdicionCuentaPorCobrar,*/ jPanelAccionesCuentaPorCobrar,jPanelAccionesFormularioCuentaPorCobrar,jmenuBarCuentaPorCobrar,jmenuBarDetalleCuentaPorCobrar,jTtoolBarCuentaPorCobrar,jTtoolBarDetalleCuentaPorCobrar));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesCuentaPorCobrar(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarCuentaPorCobrar(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuCuentaPorCobrar(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarCuentaPorCobrar(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarCuentaPorCobrar,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleCuentaPorCobrar,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuCuentaPorCobrar(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarCuentaPorCobrar,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleCuentaPorCobrar,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.cuentaporcobrarConstantesFunciones.getsFinalQueryCuentaPorCobrar();
		String  finalQueryPaginacionTodos=this.cuentaporcobrarConstantesFunciones.getsFinalQueryCuentaPorCobrar();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=CuentaPorCobrarConstantesFunciones.getArrayColumnasGlobalesNoCuentaPorCobrar(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=CuentaPorCobrarConstantesFunciones.getArrayColumnasGlobalesCuentaPorCobrar(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,CuentaPorCobrarConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.cuentaporcobrarsEliminados= new ArrayList<CuentaPorCobrar>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessCuentaPorCobrar();
		
				///*CuentaPorCobrarSessionBean*/this.cuentaporcobrarSessionBean=new CuentaPorCobrarSessionBean();
			
			if(this.cuentaporcobrarSessionBean==null) {
				this.cuentaporcobrarSessionBean=new CuentaPorCobrarSessionBean();
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
					this.iNumeroPaginacion=CuentaPorCobrarConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=CuentaPorCobrarConstantesFunciones.getClassesForeignKeysOfCuentaPorCobrar(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/cuentaporcobrar."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			cuentaporcobrarsAux= new ArrayList<CuentaPorCobrar>();
			
				
			cuentaporcobrarLogic.setDatosCliente(this.datosCliente);
			cuentaporcobrarLogic.setDatosDeep(this.datosDeep);
			cuentaporcobrarLogic.setIsConDeep(true);
			
			
			cuentaporcobrarLogic.getCuentaPorCobrarDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					cuentaporcobrarLogic.getTodosCuentaPorCobrars(finalQueryGlobal,pagination);
					
					//cuentaporcobrarLogic.getTodosCuentaPorCobrarsWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(cuentaporcobrarLogic.getCuentaPorCobrars()==null|| cuentaporcobrarLogic.getCuentaPorCobrars().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							cuentaporcobrarsAux= new ArrayList<CuentaPorCobrar>();
							cuentaporcobrarsAux.addAll(cuentaporcobrarLogic.getCuentaPorCobrars());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							cuentaporcobrarsAux= new ArrayList<CuentaPorCobrar>();
							cuentaporcobrarsAux.addAll(cuentaporcobrars);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							cuentaporcobrarLogic.getTodosCuentaPorCobrars(finalQueryGlobal+"",this.pagination);												
							
							//cuentaporcobrarLogic.getTodosCuentaPorCobrarsWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteCuentaPorCobrars("Todos",cuentaporcobrarLogic.getCuentaPorCobrars() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							cuentaporcobrarLogic.setCuentaPorCobrars(new ArrayList<CuentaPorCobrar>());					
							cuentaporcobrarLogic.getCuentaPorCobrars().addAll(cuentaporcobrarsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							cuentaporcobrars=new ArrayList<CuentaPorCobrar>();
							cuentaporcobrars.addAll(cuentaporcobrarsAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idCuentaPorCobrar=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idCuentaPorCobrar=this.idActual;
				
				} else if(this.idCuentaPorCobrarActual!=null && this.idCuentaPorCobrarActual!=0L) {
					idCuentaPorCobrar=idCuentaPorCobrarActual;
				}
				
					
				this.sDetalleReporte=CuentaPorCobrarConstantesFunciones.getDetalleIndicePorId(idCuentaPorCobrar);
				
				this.cuentaporcobrars=new ArrayList<CuentaPorCobrar>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					cuentaporcobrarLogic.getEntity(idCuentaPorCobrar);
					
					//cuentaporcobrarLogic.getEntityWithConnection(idCuentaPorCobrar);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					cuentaporcobrarLogic.setCuentaPorCobrars(new ArrayList<CuentaPorCobrar>());
					cuentaporcobrarLogic.getCuentaPorCobrars().add(cuentaporcobrarLogic.getCuentaPorCobrar());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.cuentaporcobrars=new ArrayList<CuentaPorCobrar>();
					this.cuentaporcobrars.add(cuentaporcobrar);
				}
				
				if(cuentaporcobrarLogic.getCuentaPorCobrar()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdAsientoContable")) {
				this.sDetalleReporte=CuentaPorCobrarConstantesFunciones.getDetalleIndiceFK_IdAsientoContable(id_asiento_contableFK_IdAsientoContable);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					cuentaporcobrarLogic.getCuentaPorCobrarsFK_IdAsientoContable(finalQueryGlobal,pagination,id_asiento_contableFK_IdAsientoContable);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=CuentaPorCobrarConstantesFunciones.getDetalleIndiceFK_IdAsientoContable(id_asiento_contableFK_IdAsientoContable);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=CuentaPorCobrarConstantesFunciones.getDetalleIndiceFK_IdAsientoContable(id_asiento_contableFK_IdAsientoContable);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=cuentaporcobrarLogic.getCuentaPorCobrars()==null||cuentaporcobrarLogic.getCuentaPorCobrars().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=cuentaporcobrars==null|| cuentaporcobrars.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						cuentaporcobrarsAux=new ArrayList<CuentaPorCobrar>();
						cuentaporcobrarsAux.addAll(cuentaporcobrarLogic.getCuentaPorCobrars());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							cuentaporcobrarsAux=new ArrayList<CuentaPorCobrar>();
							cuentaporcobrarsAux.addAll(cuentaporcobrars);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							cuentaporcobrarLogic.getCuentaPorCobrarsFK_IdAsientoContable(finalQueryGlobal,pagination,id_asiento_contableFK_IdAsientoContable);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=CuentaPorCobrarConstantesFunciones.getDetalleIndiceFK_IdAsientoContable(id_asiento_contableFK_IdAsientoContable);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=CuentaPorCobrarConstantesFunciones.getDetalleIndiceFK_IdAsientoContable(id_asiento_contableFK_IdAsientoContable);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteCuentaPorCobrars("FK_IdAsientoContable",cuentaporcobrarLogic.getCuentaPorCobrars());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteCuentaPorCobrars("FK_IdAsientoContable",cuentaporcobrars);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						cuentaporcobrarLogic.setCuentaPorCobrars(new ArrayList<CuentaPorCobrar>());
						cuentaporcobrarLogic.getCuentaPorCobrars().addAll(cuentaporcobrarsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							cuentaporcobrars=new ArrayList<CuentaPorCobrar>();
							cuentaporcobrars.addAll(cuentaporcobrarsAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdCliente")) {
				this.sDetalleReporte=CuentaPorCobrarConstantesFunciones.getDetalleIndiceFK_IdCliente(id_clienteFK_IdCliente);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					cuentaporcobrarLogic.getCuentaPorCobrarsFK_IdCliente(finalQueryGlobal,pagination,id_clienteFK_IdCliente);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=CuentaPorCobrarConstantesFunciones.getDetalleIndiceFK_IdCliente(id_clienteFK_IdCliente);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=CuentaPorCobrarConstantesFunciones.getDetalleIndiceFK_IdCliente(id_clienteFK_IdCliente);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=cuentaporcobrarLogic.getCuentaPorCobrars()==null||cuentaporcobrarLogic.getCuentaPorCobrars().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=cuentaporcobrars==null|| cuentaporcobrars.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						cuentaporcobrarsAux=new ArrayList<CuentaPorCobrar>();
						cuentaporcobrarsAux.addAll(cuentaporcobrarLogic.getCuentaPorCobrars());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							cuentaporcobrarsAux=new ArrayList<CuentaPorCobrar>();
							cuentaporcobrarsAux.addAll(cuentaporcobrars);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							cuentaporcobrarLogic.getCuentaPorCobrarsFK_IdCliente(finalQueryGlobal,pagination,id_clienteFK_IdCliente);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=CuentaPorCobrarConstantesFunciones.getDetalleIndiceFK_IdCliente(id_clienteFK_IdCliente);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=CuentaPorCobrarConstantesFunciones.getDetalleIndiceFK_IdCliente(id_clienteFK_IdCliente);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteCuentaPorCobrars("FK_IdCliente",cuentaporcobrarLogic.getCuentaPorCobrars());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteCuentaPorCobrars("FK_IdCliente",cuentaporcobrars);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						cuentaporcobrarLogic.setCuentaPorCobrars(new ArrayList<CuentaPorCobrar>());
						cuentaporcobrarLogic.getCuentaPorCobrars().addAll(cuentaporcobrarsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							cuentaporcobrars=new ArrayList<CuentaPorCobrar>();
							cuentaporcobrars.addAll(cuentaporcobrarsAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdEjercicio")) {
				this.sDetalleReporte=CuentaPorCobrarConstantesFunciones.getDetalleIndiceFK_IdEjercicio(id_ejercicioFK_IdEjercicio);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					cuentaporcobrarLogic.getCuentaPorCobrarsFK_IdEjercicio(finalQueryGlobal,pagination,id_ejercicioFK_IdEjercicio);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=CuentaPorCobrarConstantesFunciones.getDetalleIndiceFK_IdEjercicio(id_ejercicioFK_IdEjercicio);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=CuentaPorCobrarConstantesFunciones.getDetalleIndiceFK_IdEjercicio(id_ejercicioFK_IdEjercicio);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=cuentaporcobrarLogic.getCuentaPorCobrars()==null||cuentaporcobrarLogic.getCuentaPorCobrars().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=cuentaporcobrars==null|| cuentaporcobrars.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						cuentaporcobrarsAux=new ArrayList<CuentaPorCobrar>();
						cuentaporcobrarsAux.addAll(cuentaporcobrarLogic.getCuentaPorCobrars());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							cuentaporcobrarsAux=new ArrayList<CuentaPorCobrar>();
							cuentaporcobrarsAux.addAll(cuentaporcobrars);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							cuentaporcobrarLogic.getCuentaPorCobrarsFK_IdEjercicio(finalQueryGlobal,pagination,id_ejercicioFK_IdEjercicio);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=CuentaPorCobrarConstantesFunciones.getDetalleIndiceFK_IdEjercicio(id_ejercicioFK_IdEjercicio);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=CuentaPorCobrarConstantesFunciones.getDetalleIndiceFK_IdEjercicio(id_ejercicioFK_IdEjercicio);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteCuentaPorCobrars("FK_IdEjercicio",cuentaporcobrarLogic.getCuentaPorCobrars());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteCuentaPorCobrars("FK_IdEjercicio",cuentaporcobrars);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						cuentaporcobrarLogic.setCuentaPorCobrars(new ArrayList<CuentaPorCobrar>());
						cuentaporcobrarLogic.getCuentaPorCobrars().addAll(cuentaporcobrarsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							cuentaporcobrars=new ArrayList<CuentaPorCobrar>();
							cuentaporcobrars.addAll(cuentaporcobrarsAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=CuentaPorCobrarConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					cuentaporcobrarLogic.getCuentaPorCobrarsFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=CuentaPorCobrarConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=CuentaPorCobrarConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=cuentaporcobrarLogic.getCuentaPorCobrars()==null||cuentaporcobrarLogic.getCuentaPorCobrars().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=cuentaporcobrars==null|| cuentaporcobrars.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						cuentaporcobrarsAux=new ArrayList<CuentaPorCobrar>();
						cuentaporcobrarsAux.addAll(cuentaporcobrarLogic.getCuentaPorCobrars());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							cuentaporcobrarsAux=new ArrayList<CuentaPorCobrar>();
							cuentaporcobrarsAux.addAll(cuentaporcobrars);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							cuentaporcobrarLogic.getCuentaPorCobrarsFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=CuentaPorCobrarConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=CuentaPorCobrarConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteCuentaPorCobrars("FK_IdEmpresa",cuentaporcobrarLogic.getCuentaPorCobrars());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteCuentaPorCobrars("FK_IdEmpresa",cuentaporcobrars);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						cuentaporcobrarLogic.setCuentaPorCobrars(new ArrayList<CuentaPorCobrar>());
						cuentaporcobrarLogic.getCuentaPorCobrars().addAll(cuentaporcobrarsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							cuentaporcobrars=new ArrayList<CuentaPorCobrar>();
							cuentaporcobrars.addAll(cuentaporcobrarsAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdFactura")) {
				this.sDetalleReporte=CuentaPorCobrarConstantesFunciones.getDetalleIndiceFK_IdFactura(id_facturaFK_IdFactura);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					cuentaporcobrarLogic.getCuentaPorCobrarsFK_IdFactura(finalQueryGlobal,pagination,id_facturaFK_IdFactura);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=CuentaPorCobrarConstantesFunciones.getDetalleIndiceFK_IdFactura(id_facturaFK_IdFactura);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=CuentaPorCobrarConstantesFunciones.getDetalleIndiceFK_IdFactura(id_facturaFK_IdFactura);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=cuentaporcobrarLogic.getCuentaPorCobrars()==null||cuentaporcobrarLogic.getCuentaPorCobrars().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=cuentaporcobrars==null|| cuentaporcobrars.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						cuentaporcobrarsAux=new ArrayList<CuentaPorCobrar>();
						cuentaporcobrarsAux.addAll(cuentaporcobrarLogic.getCuentaPorCobrars());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							cuentaporcobrarsAux=new ArrayList<CuentaPorCobrar>();
							cuentaporcobrarsAux.addAll(cuentaporcobrars);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							cuentaporcobrarLogic.getCuentaPorCobrarsFK_IdFactura(finalQueryGlobal,pagination,id_facturaFK_IdFactura);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=CuentaPorCobrarConstantesFunciones.getDetalleIndiceFK_IdFactura(id_facturaFK_IdFactura);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=CuentaPorCobrarConstantesFunciones.getDetalleIndiceFK_IdFactura(id_facturaFK_IdFactura);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteCuentaPorCobrars("FK_IdFactura",cuentaporcobrarLogic.getCuentaPorCobrars());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteCuentaPorCobrars("FK_IdFactura",cuentaporcobrars);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						cuentaporcobrarLogic.setCuentaPorCobrars(new ArrayList<CuentaPorCobrar>());
						cuentaporcobrarLogic.getCuentaPorCobrars().addAll(cuentaporcobrarsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							cuentaporcobrars=new ArrayList<CuentaPorCobrar>();
							cuentaporcobrars.addAll(cuentaporcobrarsAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdModulo")) {
				this.sDetalleReporte=CuentaPorCobrarConstantesFunciones.getDetalleIndiceFK_IdModulo(id_moduloFK_IdModulo);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					cuentaporcobrarLogic.getCuentaPorCobrarsFK_IdModulo(finalQueryGlobal,pagination,id_moduloFK_IdModulo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=CuentaPorCobrarConstantesFunciones.getDetalleIndiceFK_IdModulo(id_moduloFK_IdModulo);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=CuentaPorCobrarConstantesFunciones.getDetalleIndiceFK_IdModulo(id_moduloFK_IdModulo);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=cuentaporcobrarLogic.getCuentaPorCobrars()==null||cuentaporcobrarLogic.getCuentaPorCobrars().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=cuentaporcobrars==null|| cuentaporcobrars.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						cuentaporcobrarsAux=new ArrayList<CuentaPorCobrar>();
						cuentaporcobrarsAux.addAll(cuentaporcobrarLogic.getCuentaPorCobrars());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							cuentaporcobrarsAux=new ArrayList<CuentaPorCobrar>();
							cuentaporcobrarsAux.addAll(cuentaporcobrars);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							cuentaporcobrarLogic.getCuentaPorCobrarsFK_IdModulo(finalQueryGlobal,pagination,id_moduloFK_IdModulo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=CuentaPorCobrarConstantesFunciones.getDetalleIndiceFK_IdModulo(id_moduloFK_IdModulo);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=CuentaPorCobrarConstantesFunciones.getDetalleIndiceFK_IdModulo(id_moduloFK_IdModulo);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteCuentaPorCobrars("FK_IdModulo",cuentaporcobrarLogic.getCuentaPorCobrars());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteCuentaPorCobrars("FK_IdModulo",cuentaporcobrars);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						cuentaporcobrarLogic.setCuentaPorCobrars(new ArrayList<CuentaPorCobrar>());
						cuentaporcobrarLogic.getCuentaPorCobrars().addAll(cuentaporcobrarsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							cuentaporcobrars=new ArrayList<CuentaPorCobrar>();
							cuentaporcobrars.addAll(cuentaporcobrarsAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdMoneda")) {
				this.sDetalleReporte=CuentaPorCobrarConstantesFunciones.getDetalleIndiceFK_IdMoneda(id_monedaFK_IdMoneda);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					cuentaporcobrarLogic.getCuentaPorCobrarsFK_IdMoneda(finalQueryGlobal,pagination,id_monedaFK_IdMoneda);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=CuentaPorCobrarConstantesFunciones.getDetalleIndiceFK_IdMoneda(id_monedaFK_IdMoneda);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=CuentaPorCobrarConstantesFunciones.getDetalleIndiceFK_IdMoneda(id_monedaFK_IdMoneda);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=cuentaporcobrarLogic.getCuentaPorCobrars()==null||cuentaporcobrarLogic.getCuentaPorCobrars().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=cuentaporcobrars==null|| cuentaporcobrars.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						cuentaporcobrarsAux=new ArrayList<CuentaPorCobrar>();
						cuentaporcobrarsAux.addAll(cuentaporcobrarLogic.getCuentaPorCobrars());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							cuentaporcobrarsAux=new ArrayList<CuentaPorCobrar>();
							cuentaporcobrarsAux.addAll(cuentaporcobrars);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							cuentaporcobrarLogic.getCuentaPorCobrarsFK_IdMoneda(finalQueryGlobal,pagination,id_monedaFK_IdMoneda);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=CuentaPorCobrarConstantesFunciones.getDetalleIndiceFK_IdMoneda(id_monedaFK_IdMoneda);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=CuentaPorCobrarConstantesFunciones.getDetalleIndiceFK_IdMoneda(id_monedaFK_IdMoneda);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteCuentaPorCobrars("FK_IdMoneda",cuentaporcobrarLogic.getCuentaPorCobrars());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteCuentaPorCobrars("FK_IdMoneda",cuentaporcobrars);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						cuentaporcobrarLogic.setCuentaPorCobrars(new ArrayList<CuentaPorCobrar>());
						cuentaporcobrarLogic.getCuentaPorCobrars().addAll(cuentaporcobrarsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							cuentaporcobrars=new ArrayList<CuentaPorCobrar>();
							cuentaporcobrars.addAll(cuentaporcobrarsAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdSucursal")) {
				this.sDetalleReporte=CuentaPorCobrarConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					cuentaporcobrarLogic.getCuentaPorCobrarsFK_IdSucursal(finalQueryGlobal,pagination,id_sucursalFK_IdSucursal);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=CuentaPorCobrarConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=CuentaPorCobrarConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=cuentaporcobrarLogic.getCuentaPorCobrars()==null||cuentaporcobrarLogic.getCuentaPorCobrars().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=cuentaporcobrars==null|| cuentaporcobrars.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						cuentaporcobrarsAux=new ArrayList<CuentaPorCobrar>();
						cuentaporcobrarsAux.addAll(cuentaporcobrarLogic.getCuentaPorCobrars());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							cuentaporcobrarsAux=new ArrayList<CuentaPorCobrar>();
							cuentaporcobrarsAux.addAll(cuentaporcobrars);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							cuentaporcobrarLogic.getCuentaPorCobrarsFK_IdSucursal(finalQueryGlobal,pagination,id_sucursalFK_IdSucursal);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=CuentaPorCobrarConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=CuentaPorCobrarConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteCuentaPorCobrars("FK_IdSucursal",cuentaporcobrarLogic.getCuentaPorCobrars());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteCuentaPorCobrars("FK_IdSucursal",cuentaporcobrars);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						cuentaporcobrarLogic.setCuentaPorCobrars(new ArrayList<CuentaPorCobrar>());
						cuentaporcobrarLogic.getCuentaPorCobrars().addAll(cuentaporcobrarsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							cuentaporcobrars=new ArrayList<CuentaPorCobrar>();
							cuentaporcobrars.addAll(cuentaporcobrarsAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdTipoTransaccionModulo")) {
				this.sDetalleReporte=CuentaPorCobrarConstantesFunciones.getDetalleIndiceFK_IdTipoTransaccionModulo(id_tipo_transaccion_moduloFK_IdTipoTransaccionModulo);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					cuentaporcobrarLogic.getCuentaPorCobrarsFK_IdTipoTransaccionModulo(finalQueryGlobal,pagination,id_tipo_transaccion_moduloFK_IdTipoTransaccionModulo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=CuentaPorCobrarConstantesFunciones.getDetalleIndiceFK_IdTipoTransaccionModulo(id_tipo_transaccion_moduloFK_IdTipoTransaccionModulo);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=CuentaPorCobrarConstantesFunciones.getDetalleIndiceFK_IdTipoTransaccionModulo(id_tipo_transaccion_moduloFK_IdTipoTransaccionModulo);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=cuentaporcobrarLogic.getCuentaPorCobrars()==null||cuentaporcobrarLogic.getCuentaPorCobrars().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=cuentaporcobrars==null|| cuentaporcobrars.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						cuentaporcobrarsAux=new ArrayList<CuentaPorCobrar>();
						cuentaporcobrarsAux.addAll(cuentaporcobrarLogic.getCuentaPorCobrars());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							cuentaporcobrarsAux=new ArrayList<CuentaPorCobrar>();
							cuentaporcobrarsAux.addAll(cuentaporcobrars);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							cuentaporcobrarLogic.getCuentaPorCobrarsFK_IdTipoTransaccionModulo(finalQueryGlobal,pagination,id_tipo_transaccion_moduloFK_IdTipoTransaccionModulo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=CuentaPorCobrarConstantesFunciones.getDetalleIndiceFK_IdTipoTransaccionModulo(id_tipo_transaccion_moduloFK_IdTipoTransaccionModulo);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=CuentaPorCobrarConstantesFunciones.getDetalleIndiceFK_IdTipoTransaccionModulo(id_tipo_transaccion_moduloFK_IdTipoTransaccionModulo);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteCuentaPorCobrars("FK_IdTipoTransaccionModulo",cuentaporcobrarLogic.getCuentaPorCobrars());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteCuentaPorCobrars("FK_IdTipoTransaccionModulo",cuentaporcobrars);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						cuentaporcobrarLogic.setCuentaPorCobrars(new ArrayList<CuentaPorCobrar>());
						cuentaporcobrarLogic.getCuentaPorCobrars().addAll(cuentaporcobrarsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							cuentaporcobrars=new ArrayList<CuentaPorCobrar>();
							cuentaporcobrars.addAll(cuentaporcobrarsAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdTransaccion")) {
				this.sDetalleReporte=CuentaPorCobrarConstantesFunciones.getDetalleIndiceFK_IdTransaccion(id_transaccionFK_IdTransaccion);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					cuentaporcobrarLogic.getCuentaPorCobrarsFK_IdTransaccion(finalQueryGlobal,pagination,id_transaccionFK_IdTransaccion);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=CuentaPorCobrarConstantesFunciones.getDetalleIndiceFK_IdTransaccion(id_transaccionFK_IdTransaccion);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=CuentaPorCobrarConstantesFunciones.getDetalleIndiceFK_IdTransaccion(id_transaccionFK_IdTransaccion);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=cuentaporcobrarLogic.getCuentaPorCobrars()==null||cuentaporcobrarLogic.getCuentaPorCobrars().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=cuentaporcobrars==null|| cuentaporcobrars.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						cuentaporcobrarsAux=new ArrayList<CuentaPorCobrar>();
						cuentaporcobrarsAux.addAll(cuentaporcobrarLogic.getCuentaPorCobrars());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							cuentaporcobrarsAux=new ArrayList<CuentaPorCobrar>();
							cuentaporcobrarsAux.addAll(cuentaporcobrars);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							cuentaporcobrarLogic.getCuentaPorCobrarsFK_IdTransaccion(finalQueryGlobal,pagination,id_transaccionFK_IdTransaccion);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=CuentaPorCobrarConstantesFunciones.getDetalleIndiceFK_IdTransaccion(id_transaccionFK_IdTransaccion);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=CuentaPorCobrarConstantesFunciones.getDetalleIndiceFK_IdTransaccion(id_transaccionFK_IdTransaccion);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteCuentaPorCobrars("FK_IdTransaccion",cuentaporcobrarLogic.getCuentaPorCobrars());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteCuentaPorCobrars("FK_IdTransaccion",cuentaporcobrars);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						cuentaporcobrarLogic.setCuentaPorCobrars(new ArrayList<CuentaPorCobrar>());
						cuentaporcobrarLogic.getCuentaPorCobrars().addAll(cuentaporcobrarsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							cuentaporcobrars=new ArrayList<CuentaPorCobrar>();
							cuentaporcobrars.addAll(cuentaporcobrarsAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesCuentaPorCobrar();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessCuentaPorCobrar();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=cuentaporcobrarLogic.getCuentaPorCobrars().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=cuentaporcobrars.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=cuentaporcobrarLogic.getCuentaPorCobrars().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=cuentaporcobrars.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(CuentaPorCobrar cuentaporcobrar) {
		Boolean permite=true;
		
		if(this.cuentaporcobrar.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=CuentaPorCobrarConstantesFunciones.getOrderByListaCuentaPorCobrar();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=CuentaPorCobrarConstantesFunciones.getOrderByListaCuentaPorCobrar();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(CuentaPorCobrar cuentaporcobrar:cuentaporcobrarLogic.getCuentaPorCobrars()) {
				if(cuentaporcobrar.getsType().equals(Constantes2.S_TOTALES)) {
					cuentaporcobrarTotales=cuentaporcobrar;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(CuentaPorCobrar cuentaporcobrar:this.cuentaporcobrars) {
				if(cuentaporcobrar.getsType().equals(Constantes2.S_TOTALES)) {
					cuentaporcobrarTotales=cuentaporcobrar;
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
			this.cuentaporcobrarAux=new CuentaPorCobrar();
			this.cuentaporcobrarAux.setsType(Constantes2.S_TOTALES);
			this.cuentaporcobrarAux.setIsNew(false);
			this.cuentaporcobrarAux.setIsChanged(false);
			this.cuentaporcobrarAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				CuentaPorCobrarConstantesFunciones.TotalizarValoresFilaCuentaPorCobrar(this.cuentaporcobrarLogic.getCuentaPorCobrars(),this.cuentaporcobrarAux);
				
				this.cuentaporcobrarLogic.getCuentaPorCobrars().add(this.cuentaporcobrarAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				CuentaPorCobrarConstantesFunciones.TotalizarValoresFilaCuentaPorCobrar(this.cuentaporcobrars,this.cuentaporcobrarAux);
				
				this.cuentaporcobrars.add(this.cuentaporcobrarAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		cuentaporcobrarTotales=new CuentaPorCobrar();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.cuentaporcobrarLogic.getCuentaPorCobrars().remove(cuentaporcobrarTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.cuentaporcobrars.remove(cuentaporcobrarTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		cuentaporcobrarTotales=new CuentaPorCobrar();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(CuentaPorCobrar cuentaporcobrar:cuentaporcobrarLogic.getCuentaPorCobrars()) {
				if(cuentaporcobrar.getsType().equals(Constantes2.S_TOTALES)) {
					cuentaporcobrarTotales=cuentaporcobrar;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				CuentaPorCobrarConstantesFunciones.TotalizarValoresFilaCuentaPorCobrar(this.cuentaporcobrarLogic.getCuentaPorCobrars(),cuentaporcobrarTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(CuentaPorCobrar cuentaporcobrar:this.cuentaporcobrars) {
				if(cuentaporcobrar.getsType().equals(Constantes2.S_TOTALES)) {
					cuentaporcobrarTotales=cuentaporcobrar;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				CuentaPorCobrarConstantesFunciones.TotalizarValoresFilaCuentaPorCobrar(this.cuentaporcobrars,cuentaporcobrarTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CuentaPorCobrarConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getCuentaPorCobrarsFK_IdAsientoContable()throws Exception {
		try {
			sAccionBusqueda="FK_IdAsientoContable";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getCuentaPorCobrarsFK_IdCliente()throws Exception {
		try {
			sAccionBusqueda="FK_IdCliente";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getCuentaPorCobrarsFK_IdEjercicio()throws Exception {
		try {
			sAccionBusqueda="FK_IdEjercicio";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getCuentaPorCobrarsFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getCuentaPorCobrarsFK_IdFactura()throws Exception {
		try {
			sAccionBusqueda="FK_IdFactura";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getCuentaPorCobrarsFK_IdModulo()throws Exception {
		try {
			sAccionBusqueda="FK_IdModulo";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getCuentaPorCobrarsFK_IdMoneda()throws Exception {
		try {
			sAccionBusqueda="FK_IdMoneda";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getCuentaPorCobrarsFK_IdSucursal()throws Exception {
		try {
			sAccionBusqueda="FK_IdSucursal";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getCuentaPorCobrarsFK_IdTipoTransaccionModulo()throws Exception {
		try {
			sAccionBusqueda="FK_IdTipoTransaccionModulo";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getCuentaPorCobrarsFK_IdTransaccion()throws Exception {
		try {
			sAccionBusqueda="FK_IdTransaccion";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getCuentaPorCobrarsFK_IdAsientoContable(String sFinalQuery,Long id_asiento_contable)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					cuentaporcobrarLogic.getCuentaPorCobrarsFK_IdAsientoContable(sFinalQuery,this.pagination,id_asiento_contable);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getCuentaPorCobrarsFK_IdCliente(String sFinalQuery,Long id_cliente)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					cuentaporcobrarLogic.getCuentaPorCobrarsFK_IdCliente(sFinalQuery,this.pagination,id_cliente);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getCuentaPorCobrarsFK_IdEjercicio(String sFinalQuery,Long id_ejercicio)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					cuentaporcobrarLogic.getCuentaPorCobrarsFK_IdEjercicio(sFinalQuery,this.pagination,id_ejercicio);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getCuentaPorCobrarsFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					cuentaporcobrarLogic.getCuentaPorCobrarsFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getCuentaPorCobrarsFK_IdFactura(String sFinalQuery,Long id_factura)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					cuentaporcobrarLogic.getCuentaPorCobrarsFK_IdFactura(sFinalQuery,this.pagination,id_factura);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getCuentaPorCobrarsFK_IdModulo(String sFinalQuery,Long id_modulo)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					cuentaporcobrarLogic.getCuentaPorCobrarsFK_IdModulo(sFinalQuery,this.pagination,id_modulo);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getCuentaPorCobrarsFK_IdMoneda(String sFinalQuery,Long id_moneda)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					cuentaporcobrarLogic.getCuentaPorCobrarsFK_IdMoneda(sFinalQuery,this.pagination,id_moneda);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getCuentaPorCobrarsFK_IdSucursal(String sFinalQuery,Long id_sucursal)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					cuentaporcobrarLogic.getCuentaPorCobrarsFK_IdSucursal(sFinalQuery,this.pagination,id_sucursal);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getCuentaPorCobrarsFK_IdTipoTransaccionModulo(String sFinalQuery,Long id_tipo_transaccion_modulo)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					cuentaporcobrarLogic.getCuentaPorCobrarsFK_IdTipoTransaccionModulo(sFinalQuery,this.pagination,id_tipo_transaccion_modulo);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getCuentaPorCobrarsFK_IdTransaccion(String sFinalQuery,Long id_transaccion)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					cuentaporcobrarLogic.getCuentaPorCobrarsFK_IdTransaccion(sFinalQuery,this.pagination,id_transaccion);
				
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
	
	public void inicializarPermisosCuentaPorCobrar() {
		this.isPermisoTodoCuentaPorCobrar=false;
		this.isPermisoNuevoCuentaPorCobrar=false;
		this.isPermisoActualizarCuentaPorCobrar=false;
		this.isPermisoActualizarOriginalCuentaPorCobrar=false;
		this.isPermisoEliminarCuentaPorCobrar=false;
		this.isPermisoGuardarCambiosCuentaPorCobrar=false;
		this.isPermisoConsultaCuentaPorCobrar=false;
		this.isPermisoBusquedaCuentaPorCobrar=false;
		this.isPermisoReporteCuentaPorCobrar=false;		
		this.isPermisoOrdenCuentaPorCobrar=false;		
		this.isPermisoPaginacionMedioCuentaPorCobrar=false;		
		this.isPermisoPaginacionAltoCuentaPorCobrar=false;
		this.isPermisoPaginacionTodoCuentaPorCobrar=false;
		this.isPermisoCopiarCuentaPorCobrar=false;		
		this.isPermisoVerFormCuentaPorCobrar=false;		
		this.isPermisoDuplicarCuentaPorCobrar=false;		
		this.isPermisoOrdenCuentaPorCobrar=false;		
	}
	
	public void setPermisosUsuarioCuentaPorCobrar(Boolean isPermiso) {
		this.isPermisoTodoCuentaPorCobrar=isPermiso;
		this.isPermisoNuevoCuentaPorCobrar=isPermiso;
		this.isPermisoActualizarCuentaPorCobrar=isPermiso;
		this.isPermisoActualizarOriginalCuentaPorCobrar=isPermiso;
		this.isPermisoEliminarCuentaPorCobrar=isPermiso;
		this.isPermisoGuardarCambiosCuentaPorCobrar=isPermiso;
		this.isPermisoConsultaCuentaPorCobrar=isPermiso;
		this.isPermisoBusquedaCuentaPorCobrar=isPermiso;
		this.isPermisoReporteCuentaPorCobrar=isPermiso;
		this.isPermisoOrdenCuentaPorCobrar=isPermiso;		
		this.isPermisoPaginacionMedioCuentaPorCobrar=isPermiso;		
		this.isPermisoPaginacionAltoCuentaPorCobrar=isPermiso;		
		this.isPermisoPaginacionTodoCuentaPorCobrar=isPermiso;		
		this.isPermisoCopiarCuentaPorCobrar=isPermiso;		
		this.isPermisoVerFormCuentaPorCobrar=isPermiso;		
		this.isPermisoDuplicarCuentaPorCobrar=isPermiso;
		this.isPermisoOrdenCuentaPorCobrar=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioCuentaPorCobrar(Boolean isPermiso) {
		//this.isPermisoTodoCuentaPorCobrar=isPermiso;
		this.isPermisoNuevoCuentaPorCobrar=isPermiso;
		this.isPermisoActualizarCuentaPorCobrar=isPermiso;
		this.isPermisoActualizarOriginalCuentaPorCobrar=isPermiso;
		this.isPermisoEliminarCuentaPorCobrar=isPermiso;
		this.isPermisoGuardarCambiosCuentaPorCobrar=isPermiso;
		//this.isPermisoConsultaCuentaPorCobrar=isPermiso;
		//this.isPermisoBusquedaCuentaPorCobrar=isPermiso;
		//this.isPermisoReporteCuentaPorCobrar=isPermiso;
		//this.isPermisoOrdenCuentaPorCobrar=isPermiso;		
		//this.isPermisoPaginacionMedioCuentaPorCobrar=isPermiso;		
		//this.isPermisoPaginacionAltoCuentaPorCobrar=isPermiso;		
		//this.isPermisoPaginacionTodoCuentaPorCobrar=isPermiso;		
		//this.isPermisoCopiarCuentaPorCobrar=isPermiso;		
		//this.isPermisoDuplicarCuentaPorCobrar=isPermiso;
		//this.isPermisoOrdenCuentaPorCobrar=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioCuentaPorCobrarClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(CuentaPorCobrarJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebCuentaPorCobrar(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioCuentaPorCobrarClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioCuentaPorCobrarClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionCuentaPorCobrarClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioCuentaPorCobrarClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioCuentaPorCobrar() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(CuentaPorCobrarJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.cuentaporcobrarSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, CuentaPorCobrarConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoCuentaPorCobrar=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarCuentaPorCobrar=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalCuentaPorCobrar=this.isPermisoActualizarCuentaPorCobrar;
			this.isPermisoEliminarCuentaPorCobrar=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosCuentaPorCobrar=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaCuentaPorCobrar=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaCuentaPorCobrar=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoCuentaPorCobrar=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteCuentaPorCobrar=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenCuentaPorCobrar=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioCuentaPorCobrar=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoCuentaPorCobrar=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoCuentaPorCobrar=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarCuentaPorCobrar=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormCuentaPorCobrar=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarCuentaPorCobrar=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenCuentaPorCobrar=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.cuentaporcobrarSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosCuentaPorCobrar.setToolTipText(this.jTableDatosCuentaPorCobrar.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioCuentaPorCobrar(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioCuentaPorCobrar(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(CuentaPorCobrarJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(CuentaPorCobrarJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioCuentaPorCobrar() throws Exception {
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
	public void inicializarCombosForeignKeyCuentaPorCobrarListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
				this.sucursalsForeignKey=new ArrayList();
				this.modulosForeignKey=new ArrayList();
				this.ejerciciosForeignKey=new ArrayList();
				this.monedasForeignKey=new ArrayList();
				this.clientesForeignKey=new ArrayList();
				this.transaccionsForeignKey=new ArrayList();
				this.tipotransaccionmodulosForeignKey=new ArrayList();
				this.asientocontablesForeignKey=new ArrayList();
				this.facturasForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyCuentaPorCobrarListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(CuentaPorCobrarJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyCuentaPorCobrarListas(false);
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeySucursalListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyModuloListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyEjercicioListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyMonedaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyClienteListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyTransaccionListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyTipoTransaccionModuloListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyAsientoContableListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyFacturaListas(cargarCombosDependencia,sFinalQueryCombo);
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

	public void cargarCombosForeignKeyModuloListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.modulosForeignKey==null||this.modulosForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=ModuloConstantesFunciones.getArrayColumnasGlobalesModulo(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,ModuloConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=ModuloConstantesFunciones.SFINALQUERY;

				this.cargarCombosModulosForeignKeyLista(finalQueryGlobal);
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

	public void cargarCombosForeignKeyMonedaListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.monedasForeignKey==null||this.monedasForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=MonedaConstantesFunciones.getArrayColumnasGlobalesMoneda(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,MonedaConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=MonedaConstantesFunciones.SFINALQUERY;

				this.cargarCombosMonedasForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyClienteListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.clientesForeignKey==null||this.clientesForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=ClienteConstantesFunciones.getArrayColumnasGlobalesCliente(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,ClienteConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=ClienteConstantesFunciones.SFINALQUERY;

				this.cargarCombosClientesForeignKeyLista(finalQueryGlobal);
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

	public void cargarCombosForeignKeyTipoTransaccionModuloListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.tipotransaccionmodulosForeignKey==null||this.tipotransaccionmodulosForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=TipoTransaccionModuloConstantesFunciones.getArrayColumnasGlobalesTipoTransaccionModulo(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TipoTransaccionModuloConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=TipoTransaccionModuloConstantesFunciones.SFINALQUERY;

				this.cargarCombosTipoTransaccionModulosForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyAsientoContableListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.asientocontablesForeignKey==null||this.asientocontablesForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=AsientoContableConstantesFunciones.getArrayColumnasGlobalesAsientoContable(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,AsientoContableConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=AsientoContableConstantesFunciones.SFINALQUERY;

				this.cargarCombosAsientoContablesForeignKeyLista(finalQueryGlobal);
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
	
	public void cargarCombosLoteForeignKeyCuentaPorCobrarListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			CuentaPorCobrarParameterReturnGeneral cuentaporcobrarReturnGeneral=new CuentaPorCobrarParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.cuentaporcobrarConstantesFunciones.cargarid_empresaCuentaPorCobrar)
					 || (this.esRecargarFks && this.cuentaporcobrarConstantesFunciones.cargarid_empresaCuentaPorCobrar)) {

					if(!this.cuentaporcobrarSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+cuentaporcobrarSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}


				String finalQueryGlobalSucursal="";

				if(((this.sucursalsForeignKey==null||this.sucursalsForeignKey.size()<=0) && this.cuentaporcobrarConstantesFunciones.cargarid_sucursalCuentaPorCobrar)
					 || (this.esRecargarFks && this.cuentaporcobrarConstantesFunciones.cargarid_sucursalCuentaPorCobrar)) {

					if(!this.cuentaporcobrarSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=SucursalConstantesFunciones.getArrayColumnasGlobalesSucursal(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalSucursal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,SucursalConstantesFunciones.TABLENAME);

						finalQueryGlobalSucursal=Funciones.GetFinalQueryAppend(finalQueryGlobalSucursal, "");
						finalQueryGlobalSucursal+=SucursalConstantesFunciones.SFINALQUERY;

						//this.cargarCombosSucursalsForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalSucursal=" WHERE " + ConstantesSql.ID + "="+cuentaporcobrarSessionBean.getlidSucursalActual();
					}
				} else {
					finalQueryGlobalSucursal="NONE";
				}


				String finalQueryGlobalModulo="";

				if(((this.modulosForeignKey==null||this.modulosForeignKey.size()<=0) && this.cuentaporcobrarConstantesFunciones.cargarid_moduloCuentaPorCobrar)
					 || (this.esRecargarFks && this.cuentaporcobrarConstantesFunciones.cargarid_moduloCuentaPorCobrar)) {

					if(!this.cuentaporcobrarSessionBean.getisBusquedaDesdeForeignKeySesionModulo()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=ModuloConstantesFunciones.getArrayColumnasGlobalesModulo(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalModulo=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,ModuloConstantesFunciones.TABLENAME);

						finalQueryGlobalModulo=Funciones.GetFinalQueryAppend(finalQueryGlobalModulo, "");
						finalQueryGlobalModulo+=ModuloConstantesFunciones.SFINALQUERY;

						//this.cargarCombosModulosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalModulo=" WHERE " + ConstantesSql.ID + "="+cuentaporcobrarSessionBean.getlidModuloActual();
					}
				} else {
					finalQueryGlobalModulo="NONE";
				}


				String finalQueryGlobalEjercicio="";

				if(((this.ejerciciosForeignKey==null||this.ejerciciosForeignKey.size()<=0) && this.cuentaporcobrarConstantesFunciones.cargarid_ejercicioCuentaPorCobrar)
					 || (this.esRecargarFks && this.cuentaporcobrarConstantesFunciones.cargarid_ejercicioCuentaPorCobrar)) {

					if(!this.cuentaporcobrarSessionBean.getisBusquedaDesdeForeignKeySesionEjercicio()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EjercicioConstantesFunciones.getArrayColumnasGlobalesEjercicio(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEjercicio=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EjercicioConstantesFunciones.TABLENAME);

						finalQueryGlobalEjercicio=Funciones.GetFinalQueryAppend(finalQueryGlobalEjercicio, "");
						finalQueryGlobalEjercicio+=EjercicioConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEjerciciosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEjercicio=" WHERE " + ConstantesSql.ID + "="+cuentaporcobrarSessionBean.getlidEjercicioActual();
					}
				} else {
					finalQueryGlobalEjercicio="NONE";
				}


				String finalQueryGlobalMoneda="";

				if(((this.monedasForeignKey==null||this.monedasForeignKey.size()<=0) && this.cuentaporcobrarConstantesFunciones.cargarid_monedaCuentaPorCobrar)
					 || (this.esRecargarFks && this.cuentaporcobrarConstantesFunciones.cargarid_monedaCuentaPorCobrar)) {

					if(!this.cuentaporcobrarSessionBean.getisBusquedaDesdeForeignKeySesionMoneda()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=MonedaConstantesFunciones.getArrayColumnasGlobalesMoneda(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalMoneda=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,MonedaConstantesFunciones.TABLENAME);

						finalQueryGlobalMoneda=Funciones.GetFinalQueryAppend(finalQueryGlobalMoneda, "");
						finalQueryGlobalMoneda+=MonedaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosMonedasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalMoneda=" WHERE " + ConstantesSql.ID + "="+cuentaporcobrarSessionBean.getlidMonedaActual();
					}
				} else {
					finalQueryGlobalMoneda="NONE";
				}


				String finalQueryGlobalCliente="";

				if(((this.clientesForeignKey==null||this.clientesForeignKey.size()<=0) && this.cuentaporcobrarConstantesFunciones.cargarid_clienteCuentaPorCobrar)
					 || (this.esRecargarFks && this.cuentaporcobrarConstantesFunciones.cargarid_clienteCuentaPorCobrar)) {

					if(!this.cuentaporcobrarSessionBean.getisBusquedaDesdeForeignKeySesionCliente()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=ClienteConstantesFunciones.getArrayColumnasGlobalesCliente(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalCliente=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,ClienteConstantesFunciones.TABLENAME);

						finalQueryGlobalCliente=Funciones.GetFinalQueryAppend(finalQueryGlobalCliente, "");
						finalQueryGlobalCliente+=ClienteConstantesFunciones.SFINALQUERY;

						//this.cargarCombosClientesForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalCliente=" WHERE " + ConstantesSql.ID + "="+cuentaporcobrarSessionBean.getlidClienteActual();
					}
				} else {
					finalQueryGlobalCliente="NONE";
				}


				String finalQueryGlobalTransaccion="";

				if(((this.transaccionsForeignKey==null||this.transaccionsForeignKey.size()<=0) && this.cuentaporcobrarConstantesFunciones.cargarid_transaccionCuentaPorCobrar)
					 || (this.esRecargarFks && this.cuentaporcobrarConstantesFunciones.cargarid_transaccionCuentaPorCobrar)) {

					if(!this.cuentaporcobrarSessionBean.getisBusquedaDesdeForeignKeySesionTransaccion()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=TransaccionConstantesFunciones.getArrayColumnasGlobalesTransaccion(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalTransaccion=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TransaccionConstantesFunciones.TABLENAME);

						finalQueryGlobalTransaccion=Funciones.GetFinalQueryAppend(finalQueryGlobalTransaccion, "");
						finalQueryGlobalTransaccion+=TransaccionConstantesFunciones.SFINALQUERY;

						//this.cargarCombosTransaccionsForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalTransaccion=" WHERE " + ConstantesSql.ID + "="+cuentaporcobrarSessionBean.getlidTransaccionActual();
					}
				} else {
					finalQueryGlobalTransaccion="NONE";
				}


				String finalQueryGlobalTipoTransaccionModulo="";

				if(((this.tipotransaccionmodulosForeignKey==null||this.tipotransaccionmodulosForeignKey.size()<=0) && this.cuentaporcobrarConstantesFunciones.cargarid_tipo_transaccion_moduloCuentaPorCobrar)
					 || (this.esRecargarFks && this.cuentaporcobrarConstantesFunciones.cargarid_tipo_transaccion_moduloCuentaPorCobrar)) {

					if(!this.cuentaporcobrarSessionBean.getisBusquedaDesdeForeignKeySesionTipoTransaccionModulo()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=TipoTransaccionModuloConstantesFunciones.getArrayColumnasGlobalesTipoTransaccionModulo(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalTipoTransaccionModulo=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TipoTransaccionModuloConstantesFunciones.TABLENAME);

						finalQueryGlobalTipoTransaccionModulo=Funciones.GetFinalQueryAppend(finalQueryGlobalTipoTransaccionModulo, "");
						finalQueryGlobalTipoTransaccionModulo+=TipoTransaccionModuloConstantesFunciones.SFINALQUERY;

						//this.cargarCombosTipoTransaccionModulosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalTipoTransaccionModulo=" WHERE " + ConstantesSql.ID + "="+cuentaporcobrarSessionBean.getlidTipoTransaccionModuloActual();
					}
				} else {
					finalQueryGlobalTipoTransaccionModulo="NONE";
				}


				String finalQueryGlobalAsientoContable="";

				if(((this.asientocontablesForeignKey==null||this.asientocontablesForeignKey.size()<=0) && this.cuentaporcobrarConstantesFunciones.cargarid_asiento_contableCuentaPorCobrar)
					 || (this.esRecargarFks && this.cuentaporcobrarConstantesFunciones.cargarid_asiento_contableCuentaPorCobrar)) {

					if(!this.cuentaporcobrarSessionBean.getisBusquedaDesdeForeignKeySesionAsientoContable()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=AsientoContableConstantesFunciones.getArrayColumnasGlobalesAsientoContable(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalAsientoContable=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,AsientoContableConstantesFunciones.TABLENAME);

						finalQueryGlobalAsientoContable=Funciones.GetFinalQueryAppend(finalQueryGlobalAsientoContable, "");
						finalQueryGlobalAsientoContable+=AsientoContableConstantesFunciones.SFINALQUERY;

						//this.cargarCombosAsientoContablesForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalAsientoContable=" WHERE " + ConstantesSql.ID + "="+cuentaporcobrarSessionBean.getlidAsientoContableActual();
					}
				} else {
					finalQueryGlobalAsientoContable="NONE";
				}


				String finalQueryGlobalFactura="";

				if(((this.facturasForeignKey==null||this.facturasForeignKey.size()<=0) && this.cuentaporcobrarConstantesFunciones.cargarid_facturaCuentaPorCobrar)
					 || (this.esRecargarFks && this.cuentaporcobrarConstantesFunciones.cargarid_facturaCuentaPorCobrar)) {

					if(!this.cuentaporcobrarSessionBean.getisBusquedaDesdeForeignKeySesionFactura()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=FacturaConstantesFunciones.getArrayColumnasGlobalesFactura(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalFactura=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,FacturaConstantesFunciones.TABLENAME);

						finalQueryGlobalFactura=Funciones.GetFinalQueryAppend(finalQueryGlobalFactura, "");
						finalQueryGlobalFactura+=FacturaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosFacturasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalFactura=" WHERE " + ConstantesSql.ID + "="+cuentaporcobrarSessionBean.getlidFacturaActual();
					}
				} else {
					finalQueryGlobalFactura="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				cuentaporcobrarReturnGeneral=cuentaporcobrarLogic.cargarCombosLoteForeignKeyCuentaPorCobrar(finalQueryGlobalEmpresa,finalQueryGlobalSucursal,finalQueryGlobalModulo,finalQueryGlobalEjercicio,finalQueryGlobalMoneda,finalQueryGlobalCliente,finalQueryGlobalTransaccion,finalQueryGlobalTipoTransaccionModulo,finalQueryGlobalAsientoContable,finalQueryGlobalFactura);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=cuentaporcobrarReturnGeneral.getempresasForeignKey();
			}

			if(!finalQueryGlobalSucursal.equals("NONE")) {
				this.sucursalsForeignKey=cuentaporcobrarReturnGeneral.getsucursalsForeignKey();
			}

			if(!finalQueryGlobalModulo.equals("NONE")) {
				this.modulosForeignKey=cuentaporcobrarReturnGeneral.getmodulosForeignKey();
			}

			if(!finalQueryGlobalEjercicio.equals("NONE")) {
				this.ejerciciosForeignKey=cuentaporcobrarReturnGeneral.getejerciciosForeignKey();
			}

			if(!finalQueryGlobalMoneda.equals("NONE")) {
				this.monedasForeignKey=cuentaporcobrarReturnGeneral.getmonedasForeignKey();
			}

			if(!finalQueryGlobalCliente.equals("NONE")) {
				this.clientesForeignKey=cuentaporcobrarReturnGeneral.getclientesForeignKey();
			}

			if(!finalQueryGlobalTransaccion.equals("NONE")) {
				this.transaccionsForeignKey=cuentaporcobrarReturnGeneral.gettransaccionsForeignKey();
			}

			if(!finalQueryGlobalTipoTransaccionModulo.equals("NONE")) {
				this.tipotransaccionmodulosForeignKey=cuentaporcobrarReturnGeneral.gettipotransaccionmodulosForeignKey();
			}

			if(!finalQueryGlobalAsientoContable.equals("NONE")) {
				this.asientocontablesForeignKey=cuentaporcobrarReturnGeneral.getasientocontablesForeignKey();
			}

			if(!finalQueryGlobalFactura.equals("NONE")) {
				this.facturasForeignKey=cuentaporcobrarReturnGeneral.getfacturasForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyCuentaPorCobrar()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeySucursal();
			this.addItemDefectoCombosForeignKeyModulo();
			this.addItemDefectoCombosForeignKeyEjercicio();
			this.addItemDefectoCombosForeignKeyMoneda();
			this.addItemDefectoCombosForeignKeyCliente();
			this.addItemDefectoCombosForeignKeyTransaccion();
			this.addItemDefectoCombosForeignKeyTipoTransaccionModulo();
			this.addItemDefectoCombosForeignKeyAsientoContable();
			this.addItemDefectoCombosForeignKeyFactura();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.cuentaporcobrarSessionBean==null) {
				this.cuentaporcobrarSessionBean=new CuentaPorCobrarSessionBean();
			}

			if(!this.cuentaporcobrarSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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

			if(!this.cuentaporcobrarSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
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

	public void addItemDefectoCombosForeignKeyModulo()throws Exception {
		try {

			if(!this.cuentaporcobrarSessionBean.getisBusquedaDesdeForeignKeySesionModulo()) {
				Modulo modulo=new Modulo();
				ModuloConstantesFunciones.setModuloDescripcion(modulo,Constantes.SMENSAJE_ESCOJA_OPCION);
				modulo.setId(null);

				if(!ModuloConstantesFunciones.ExisteEnLista(this.modulosForeignKey,modulo,true)) {

					this.modulosForeignKey.add(0,modulo);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyEjercicio()throws Exception {
		try {

			if(!this.cuentaporcobrarSessionBean.getisBusquedaDesdeForeignKeySesionEjercicio()) {
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

	public void addItemDefectoCombosForeignKeyMoneda()throws Exception {
		try {

			if(!this.cuentaporcobrarSessionBean.getisBusquedaDesdeForeignKeySesionMoneda()) {
				Moneda moneda=new Moneda();
				MonedaConstantesFunciones.setMonedaDescripcion(moneda,Constantes.SMENSAJE_ESCOJA_OPCION);
				moneda.setId(null);

				if(!MonedaConstantesFunciones.ExisteEnLista(this.monedasForeignKey,moneda,true)) {

					this.monedasForeignKey.add(0,moneda);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyCliente()throws Exception {
		try {

			if(!this.cuentaporcobrarSessionBean.getisBusquedaDesdeForeignKeySesionCliente()) {
				Cliente cliente=new Cliente();
				ClienteConstantesFunciones.setClienteDescripcion(cliente,Constantes.SMENSAJE_ESCOJA_OPCION);
				cliente.setId(null);

				if(!ClienteConstantesFunciones.ExisteEnLista(this.clientesForeignKey,cliente,true)) {

					this.clientesForeignKey.add(0,cliente);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyTransaccion()throws Exception {
		try {

			if(!this.cuentaporcobrarSessionBean.getisBusquedaDesdeForeignKeySesionTransaccion()) {
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

	public void addItemDefectoCombosForeignKeyTipoTransaccionModulo()throws Exception {
		try {

			if(!this.cuentaporcobrarSessionBean.getisBusquedaDesdeForeignKeySesionTipoTransaccionModulo()) {
				TipoTransaccionModulo tipotransaccionmodulo=new TipoTransaccionModulo();
				TipoTransaccionModuloConstantesFunciones.setTipoTransaccionModuloDescripcion(tipotransaccionmodulo,Constantes.SMENSAJE_ESCOJA_OPCION);
				tipotransaccionmodulo.setId(null);

				if(!TipoTransaccionModuloConstantesFunciones.ExisteEnLista(this.tipotransaccionmodulosForeignKey,tipotransaccionmodulo,true)) {

					this.tipotransaccionmodulosForeignKey.add(0,tipotransaccionmodulo);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyAsientoContable()throws Exception {
		try {

			if(!this.cuentaporcobrarSessionBean.getisBusquedaDesdeForeignKeySesionAsientoContable()) {
				AsientoContable asientocontable=new AsientoContable();
				AsientoContableConstantesFunciones.setAsientoContableDescripcion(asientocontable,Constantes.SMENSAJE_ESCOJA_OPCION);
				asientocontable.setId(null);

				if(!AsientoContableConstantesFunciones.ExisteEnLista(this.asientocontablesForeignKey,asientocontable,true)) {

					this.asientocontablesForeignKey.add(0,asientocontable);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyFactura()throws Exception {
		try {

			if(!this.cuentaporcobrarSessionBean.getisBusquedaDesdeForeignKeySesionFactura()) {
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
	
	public void initActionsCombosTodosForeignKeyCuentaPorCobrar()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyCuentaPorCobrar(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyCuentaPorCobrar()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
				this.setActualSucursalForeignKey(this.parametroGeneralUsuario.getid_sucursal(),false,"Formulario");
				this.setActualModuloForeignKey(this.moduloActual.getId(),false,"Formulario");
				this.setActualEjercicioForeignKey(this.parametroGeneralUsuario.getid_ejercicio(),false,"Formulario");
				this.setActualMonedaForeignKey(this.parametroGeneralUsuario.getid_moneda(),false,"Formulario");
			
			
				this.cuentaporcobrar.setfecha(this.parametroGeneralUsuario.getfecha_sistema());
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyCuentaPorCobrar();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyCuentaPorCobrar(CuentaPorCobrar cuentaporcobrar)throws Exception {	
		try {
			
			this.setActualClienteForeignKey(cuentaporcobrar.getid_cliente(),false,"Formulario");
			this.setActualTransaccionForeignKey(cuentaporcobrar.getid_transaccion(),false,"Formulario");
			this.setActualTipoTransaccionModuloForeignKey(cuentaporcobrar.getid_tipo_transaccion_modulo(),false,"Formulario");
			this.setActualAsientoContableForeignKey(cuentaporcobrar.getid_asiento_contable(),false,"Formulario");
			this.setActualFacturaForeignKey(cuentaporcobrar.getid_factura(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyCuentaPorCobrar(CuentaPorCobrar cuentaporcobrar,String sTipoEvento)throws Exception {	
		try {
			
			

				if(cuentaporcobrar.getCliente()!=null && !sTipoEvento.equals("id_clienteCuentaPorCobrar")) { //sTipoEvento Evita Bucle Infinito

					this.clientesForeignKey=new ArrayList<Cliente>();
					this.clientesForeignKey.add(cuentaporcobrar.getCliente());

					this.addItemDefectoCombosForeignKeyCliente();
					this.cargarCombosFrameClientesForeignKey("Todos");
				}

				if(cuentaporcobrar.getAsientoContable()!=null && !sTipoEvento.equals("id_asiento_contableCuentaPorCobrar")) { //sTipoEvento Evita Bucle Infinito

					this.asientocontablesForeignKey=new ArrayList<AsientoContable>();
					this.asientocontablesForeignKey.add(cuentaporcobrar.getAsientoContable());

					this.addItemDefectoCombosForeignKeyAsientoContable();
					this.cargarCombosFrameAsientoContablesForeignKey("Todos");
				}

				if(cuentaporcobrar.getFactura()!=null && !sTipoEvento.equals("id_facturaCuentaPorCobrar")) { //sTipoEvento Evita Bucle Infinito

					this.facturasForeignKey=new ArrayList<Factura>();
					this.facturasForeignKey.add(cuentaporcobrar.getFactura());

					this.addItemDefectoCombosForeignKeyFactura();
					this.cargarCombosFrameFacturasForeignKey("Todos");
				}
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyCuentaPorCobrar()throws Exception {	
		try {
			
			this.setActualClienteForeignKey(this.cuentaporcobrarConstantesFunciones.getid_cliente(),false,"Formulario");
			this.setActualTransaccionForeignKey(this.cuentaporcobrarConstantesFunciones.getid_transaccion(),false,"Formulario");
			this.setActualTipoTransaccionModuloForeignKey(this.cuentaporcobrarConstantesFunciones.getid_tipo_transaccion_modulo(),false,"Formulario");
			this.setActualAsientoContableForeignKey(this.cuentaporcobrarConstantesFunciones.getid_asiento_contable(),false,"Formulario");
			this.setActualFacturaForeignKey(this.cuentaporcobrarConstantesFunciones.getid_factura(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyCuentaPorCobrar()throws Exception {	
		try {
			

				if(this.jInternalFrameDetalleFormCuentaPorCobrar!=null) {
					Ejercicio ejercicioActual=(Ejercicio)this.jInternalFrameDetalleFormCuentaPorCobrar.jComboBoxid_ejercicioCuentaPorCobrar.getSelectedItem();
				}
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyCuentaPorCobrar()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyCuentaPorCobrar()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroCuentaPorCobrar()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyCuentaPorCobrar()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameSucursalsForeignKey("Todos");
			this.cargarCombosFrameModulosForeignKey("Todos");
			this.cargarCombosFrameEjerciciosForeignKey("Todos");
			this.cargarCombosFrameMonedasForeignKey("Todos");
			this.cargarCombosFrameClientesForeignKey("Todos");
			this.cargarCombosFrameTransaccionsForeignKey("Todos");
			this.cargarCombosFrameTipoTransaccionModulosForeignKey("Todos");
			this.cargarCombosFrameAsientoContablesForeignKey("Todos");
			this.cargarCombosFrameFacturasForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyCuentaPorCobrar(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameSucursalsForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameModulosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameEjerciciosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameMonedasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameClientesForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameTransaccionsForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameTipoTransaccionModulosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameAsientoContablesForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameFacturasForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyCuentaPorCobrar()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormCuentaPorCobrar.jComboBoxid_empresaCuentaPorCobrar!=null && this.jInternalFrameDetalleFormCuentaPorCobrar.jComboBoxid_empresaCuentaPorCobrar.getItemCount()>0) {
				this.jInternalFrameDetalleFormCuentaPorCobrar.jComboBoxid_empresaCuentaPorCobrar.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormCuentaPorCobrar.jComboBoxid_sucursalCuentaPorCobrar!=null && this.jInternalFrameDetalleFormCuentaPorCobrar.jComboBoxid_sucursalCuentaPorCobrar.getItemCount()>0) {
				this.jInternalFrameDetalleFormCuentaPorCobrar.jComboBoxid_sucursalCuentaPorCobrar.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormCuentaPorCobrar.jComboBoxid_moduloCuentaPorCobrar!=null && this.jInternalFrameDetalleFormCuentaPorCobrar.jComboBoxid_moduloCuentaPorCobrar.getItemCount()>0) {
				this.jInternalFrameDetalleFormCuentaPorCobrar.jComboBoxid_moduloCuentaPorCobrar.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormCuentaPorCobrar.jComboBoxid_ejercicioCuentaPorCobrar!=null && this.jInternalFrameDetalleFormCuentaPorCobrar.jComboBoxid_ejercicioCuentaPorCobrar.getItemCount()>0) {
				this.jInternalFrameDetalleFormCuentaPorCobrar.jComboBoxid_ejercicioCuentaPorCobrar.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormCuentaPorCobrar.jComboBoxid_monedaCuentaPorCobrar!=null && this.jInternalFrameDetalleFormCuentaPorCobrar.jComboBoxid_monedaCuentaPorCobrar.getItemCount()>0) {
				this.jInternalFrameDetalleFormCuentaPorCobrar.jComboBoxid_monedaCuentaPorCobrar.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormCuentaPorCobrar.jComboBoxid_clienteCuentaPorCobrar!=null && this.jInternalFrameDetalleFormCuentaPorCobrar.jComboBoxid_clienteCuentaPorCobrar.getItemCount()>0) {
				this.jInternalFrameDetalleFormCuentaPorCobrar.jComboBoxid_clienteCuentaPorCobrar.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormCuentaPorCobrar.jComboBoxid_transaccionCuentaPorCobrar!=null && this.jInternalFrameDetalleFormCuentaPorCobrar.jComboBoxid_transaccionCuentaPorCobrar.getItemCount()>0) {
				this.jInternalFrameDetalleFormCuentaPorCobrar.jComboBoxid_transaccionCuentaPorCobrar.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormCuentaPorCobrar.jComboBoxid_tipo_transaccion_moduloCuentaPorCobrar!=null && this.jInternalFrameDetalleFormCuentaPorCobrar.jComboBoxid_tipo_transaccion_moduloCuentaPorCobrar.getItemCount()>0) {
				this.jInternalFrameDetalleFormCuentaPorCobrar.jComboBoxid_tipo_transaccion_moduloCuentaPorCobrar.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormCuentaPorCobrar.jComboBoxid_asiento_contableCuentaPorCobrar!=null && this.jInternalFrameDetalleFormCuentaPorCobrar.jComboBoxid_asiento_contableCuentaPorCobrar.getItemCount()>0) {
				this.jInternalFrameDetalleFormCuentaPorCobrar.jComboBoxid_asiento_contableCuentaPorCobrar.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormCuentaPorCobrar.jComboBoxid_facturaCuentaPorCobrar!=null && this.jInternalFrameDetalleFormCuentaPorCobrar.jComboBoxid_facturaCuentaPorCobrar.getItemCount()>0) {
				this.jInternalFrameDetalleFormCuentaPorCobrar.jComboBoxid_facturaCuentaPorCobrar.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	




















	
	

	public CuentaPorCobrarBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public CuentaPorCobrarBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public CuentaPorCobrarBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.cuentaporcobrarSessionBean=new CuentaPorCobrarSessionBean(); 
		this.cuentaporcobrarConstantesFunciones=new CuentaPorCobrarConstantesFunciones(); 
		this.cuentaporcobrarBean=new CuentaPorCobrar();//(this.cuentaporcobrarConstantesFunciones); 		
		this.cuentaporcobrarReturnGeneral=new CuentaPorCobrarParameterReturnGeneral(); 
		
		this.cuentaporcobrarSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.cuentaporcobrarSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public CuentaPorCobrarBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public CuentaPorCobrarBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public CuentaPorCobrarBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessCuentaPorCobrar(true);
			
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
			
			this.cuentaporcobrarConstantesFunciones=new CuentaPorCobrarConstantesFunciones(); 
			this.cuentaporcobrarBean=new CuentaPorCobrar();//this.cuentaporcobrarConstantesFunciones); 			
			this.cuentaporcobrarReturnGeneral=new CuentaPorCobrarParameterReturnGeneral(); 
		
			CuentaPorCobrarBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Cuenta Por Cobrar Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			this.conTotales=true;
			
			
			this.cuentaporcobrar=new CuentaPorCobrar();
			this.cuentaporcobrars = new ArrayList<CuentaPorCobrar>();
			this.cuentaporcobrarsAux = new ArrayList<CuentaPorCobrar>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentaporcobrarLogic=new CuentaPorCobrarLogic();
				this.cuentaporcobrarLogic.getNewConnexionToDeep("");
			}
			
			//this.cuentaporcobrarSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.cuentaporcobrarSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormCuentaPorCobrar);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoCuentaPorCobrar!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoCuentaPorCobrar);	
					}
					
					if(this.jInternalFrameImportacionCuentaPorCobrar!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionCuentaPorCobrar);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByCuentaPorCobrar!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByCuentaPorCobrar);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormCuentaPorCobrar!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormCuentaPorCobrar);
				this.jInternalFrameDetalleFormCuentaPorCobrar.setVisible(false);
				this.jInternalFrameDetalleFormCuentaPorCobrar.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoCuentaPorCobrar!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoCuentaPorCobrar);
					this.jInternalFrameReporteDinamicoCuentaPorCobrar.setVisible(false);
					this.jInternalFrameReporteDinamicoCuentaPorCobrar.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionCuentaPorCobrar!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionCuentaPorCobrar);
					this.jInternalFrameImportacionCuentaPorCobrar.setVisible(false);
					this.jInternalFrameImportacionCuentaPorCobrar.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByCuentaPorCobrar!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByCuentaPorCobrar);
					this.jInternalFrameOrderByCuentaPorCobrar.setVisible(false);
					this.jInternalFrameOrderByCuentaPorCobrar.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idCuentaPorCobrarActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=CuentaPorCobrarConstantesFunciones.INUMEROPAGINACION;
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
			
			this.cuentaporcobrarReturnGeneral=new CuentaPorCobrarParameterReturnGeneral();
			
			this.cuentaporcobrarParameterGeneral=new CuentaPorCobrarParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.cuentaporcobrarLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.cuentaporcobrarSessionBean.getEsGuardarRelacionado()) {
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
			
			if(CuentaPorCobrarJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.cuentaporcobrarSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,CuentaPorCobrarConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.cuentaporcobrarSessionBean.getEsGuardarRelacionado(),this.cuentaporcobrarSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,CuentaPorCobrarConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.cuentaporcobrarSessionBean.getEsGuardarRelacionado(),this.cuentaporcobrarSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoCuentaPorCobrar=false;
			this.isVisibilidadCeldaDuplicarCuentaPorCobrar=true;
			this.isVisibilidadCeldaCopiarCuentaPorCobrar=true;
			this.isVisibilidadCeldaVerFormCuentaPorCobrar=true;
			this.isVisibilidadCeldaOrdenCuentaPorCobrar=true;
			this.isVisibilidadCeldaNuevoRelacionesCuentaPorCobrar=false;
			this.isVisibilidadCeldaModificarCuentaPorCobrar=false;
			this.isVisibilidadCeldaActualizarCuentaPorCobrar=false;
			this.isVisibilidadCeldaEliminarCuentaPorCobrar=false;
			this.isVisibilidadCeldaCancelarCuentaPorCobrar=false;
			this.isVisibilidadCeldaGuardarCuentaPorCobrar=false;
			this.isVisibilidadCeldaGuardarCambiosCuentaPorCobrar=false;
			
			
			this.isVisibilidadFK_IdAsientoContable=true;
			this.isVisibilidadFK_IdCliente=true;
			this.isVisibilidadFK_IdEjercicio=true;
			this.isVisibilidadFK_IdEmpresa=true;
			this.isVisibilidadFK_IdFactura=true;
			this.isVisibilidadFK_IdModulo=true;
			this.isVisibilidadFK_IdMoneda=true;
			this.isVisibilidadFK_IdSucursal=true;
			this.isVisibilidadFK_IdTipoTransaccionModulo=true;
			this.isVisibilidadFK_IdTransaccion=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesCuentaPorCobrar("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosCuentaPorCobrar();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioCuentaPorCobrar(false);
			
			this.setPermisosUsuarioCuentaPorCobrar();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.cuentaporcobrarSessionBean.getEsGuardarRelacionado() 
				|| (this.cuentaporcobrarSessionBean.getEsGuardarRelacionado() && this.cuentaporcobrarSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioCuentaPorCobrarClasesRelacionadas();
			}
			
			if(this.cuentaporcobrarSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioCuentaPorCobrarClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!CuentaPorCobrarJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosCuentaPorCobrar();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualCuentaPorCobrar();
			}
			
			if(!this.isPermisoBusquedaCuentaPorCobrar) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasCuentaPorCobrar.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.cuentaporcobrarSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(true);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(true);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioCuentaPorCobrar,this.isPermisoPaginacionMedioCuentaPorCobrar,this.isPermisoPaginacionTodoCuentaPorCobrar);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(CuentaPorCobrarConstantesFunciones.getTiposSeleccionarCuentaPorCobrar());
				
				this.tiposColumnasSelect=CuentaPorCobrarConstantesFunciones.getTiposSeleccionarCuentaPorCobrar(true);
				
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
			//if(!this.cuentaporcobrarSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioCuentaPorCobrar();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(true,false,true);
				this.setAccionesUsuarioCuentaPorCobrar(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(true,false,true);							
				this.setAccionesUsuarioCuentaPorCobrar(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesCuentaPorCobrar() ;
			
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
			this.moduloLogic=new ModuloLogic();
			this.ejercicioLogic=new EjercicioLogic();
			this.monedaLogic=new MonedaLogic();
			this.clienteLogic=new ClienteLogic();
			this.transaccionLogic=new TransaccionLogic();
			this.tipotransaccionmoduloLogic=new TipoTransaccionModuloLogic();
			this.asientocontableLogic=new AsientoContableLogic();
			this.facturaLogic=new FacturaLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				cuentaporcobrarImplementable= (CuentaPorCobrarImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+CuentaPorCobrarConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				cuentaporcobrarImplementableHome= (CuentaPorCobrarImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+CuentaPorCobrarConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.cuentaporcobrars= new ArrayList<CuentaPorCobrar>();
			this.cuentaporcobrarsEliminados= new ArrayList<CuentaPorCobrar>();
						
			this.isEsNuevoCuentaPorCobrar=false;
			this.esParaAccionDesdeFormularioCuentaPorCobrar=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			//BUSQUEDA INTERNA FK
			this.idClienteActual=0L;
			this.idAsientoContableActual=0L;
			this.idFacturaActual=0L;
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			this.sucursalsForeignKey=new ArrayList<Sucursal>() ;
			this.modulosForeignKey=new ArrayList<Modulo>() ;
			this.ejerciciosForeignKey=new ArrayList<Ejercicio>() ;
			this.monedasForeignKey=new ArrayList<Moneda>() ;
			this.clientesForeignKey=new ArrayList<Cliente>() ;
			this.transaccionsForeignKey=new ArrayList<Transaccion>() ;
			this.tipotransaccionmodulosForeignKey=new ArrayList<TipoTransaccionModulo>() ;
			this.asientocontablesForeignKey=new ArrayList<AsientoContable>() ;
			this.facturasForeignKey=new ArrayList<Factura>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyCuentaPorCobrar(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroCuentaPorCobrar();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.cuentaporcobrarSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			CuentaPorCobrarBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=CuentaPorCobrarConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesCuentaPorCobrar("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingCuentaPorCobrar(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormCuentaPorCobrar!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioCuentaPorCobrar();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioCuentaPorCobrar();
			}
			
			CuentaPorCobrarBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasCuentaPorCobrar.getTabCount(); i++) {
					this.jTabbedPaneBusquedasCuentaPorCobrar.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasCuentaPorCobrar.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentaporcobrarLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessCuentaPorCobrar(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga CuentaPorCobrar: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentaporcobrarLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,CuentaPorCobrarConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentaporcobrarLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectCuentaPorCobrar() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesCuentaPorCobrar")) {
				iIndex=this.jInternalFrameDetalleFormCuentaPorCobrar.jTabbedPaneRelacionesCuentaPorCobrar.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormCuentaPorCobrar.jTabbedPaneRelacionesCuentaPorCobrar.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosCuentaPorCobrar.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessCuentaPorCobrar();	
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
	
	public void cargarCombosForeignKeyCuentaPorCobrar(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyCuentaPorCobrar(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyCuentaPorCobrar(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyCuentaPorCobrarListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyCuentaPorCobrar();
		
		this.cargarCombosFrameForeignKeyCuentaPorCobrar();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyCuentaPorCobrar();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyCuentaPorCobrar();
		}
	}
	
	

	public void cargarCombosForeignKeyCliente(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyClienteListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyCliente();
				this.cargarCombosFrameClientesForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaCliente(this.clientesForeignKey);

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

	public void cargarCombosForeignKeyTipoTransaccionModulo(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyTipoTransaccionModuloListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyTipoTransaccionModulo();
				this.cargarCombosFrameTipoTransaccionModulosForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaTipoTransaccionModulo(this.tipotransaccionmodulosForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyAsientoContable(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyAsientoContableListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyAsientoContable();
				this.cargarCombosFrameAsientoContablesForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaAsientoContable(this.asientocontablesForeignKey);

		} catch(Exception e) {
			throw e;
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
	
	public void jButtonNuevoCuentaPorCobrarActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.cuentaporcobrarSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormCuentaPorCobrar==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			CuentaPorCobrarBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.cuentaporcobrar,new Object(),this.cuentaporcobrarParameterGeneral,this.cuentaporcobrarReturnGeneral);
			
			
			if(jTableDatosCuentaPorCobrar.getRowCount()>=1) {
				jTableDatosCuentaPorCobrar.removeRowSelectionInterval(0, jTableDatosCuentaPorCobrar.getRowCount()-1);						
			}
			
			this.isEsNuevoCuentaPorCobrar=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoCuentaPorCobrar(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesCuentaPorCobrar(true);			
			//this.cuentaporcobrar=new CuentaPorCobrar();
			//this.cuentaporcobrar.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesCuentaPorCobrar(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualCuentaPorCobrar() ;
			
			if(CuentaPorCobrarJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleCuentaPorCobrar(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.cuentaporcobrar);	
			this.actualizarInformacion("INFO_PADRE",false,this.cuentaporcobrar);				
			
			CuentaPorCobrarBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.cuentaporcobrar,new Object(),this.cuentaporcobrarParameterGeneral,this.cuentaporcobrarReturnGeneral);
			
			if(this.cuentaporcobrarSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar CuentaPorCobrar: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			CuentaPorCobrarBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.cuentaporcobrar,new Object(),this.cuentaporcobrarParameterGeneral,this.cuentaporcobrarReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,CuentaPorCobrarConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarCuentaPorCobrarActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<CuentaPorCobrar> cuentaporcobrarsSeleccionados=new ArrayList<CuentaPorCobrar>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosCuentaPorCobrar.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosCuentaPorCobrar.getSelectedRows().length;			
			}
			
			cuentaporcobrarsSeleccionados=this.getCuentaPorCobrarsSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoCuentaPorCobrar--;			
				//CuentaPorCobrar cuentaporcobrarAux= new CuentaPorCobrar();			
				//cuentaporcobrarAux.setId(this.iIdNuevoCuentaPorCobrar);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//CuentaPorCobrar cuentaporcobrarOrigen=new CuentaPorCobrar();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(CuentaPorCobrar cuentaporcobrarOrigen : cuentaporcobrarsSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosCuentaPorCobrar.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							cuentaporcobrarOrigen =(CuentaPorCobrar) this.cuentaporcobrarLogic.getCuentaPorCobrars().toArray()[this.jTableDatosCuentaPorCobrar.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							cuentaporcobrarOrigen =(CuentaPorCobrar) this.cuentaporcobrars.toArray()[this.jTableDatosCuentaPorCobrar.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaCuentaPorCobrar();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.cuentaporcobrar.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosCuentaPorCobrar(cuentaporcobrarOrigen,this.cuentaporcobrar,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysCuentaPorCobrar(this.cuentaporcobrar);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.cuentaporcobrarLogic.getCuentaPorCobrars().add(this.cuentaporcobrarAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.cuentaporcobrars.add(this.cuentaporcobrarAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaCuentaPorCobrar(false);
				
				this.jTableDatosCuentaPorCobrar.setRowSelectionInterval(this.getIndiceNuevoCuentaPorCobrar(), this.getIndiceNuevoCuentaPorCobrar());
				
				int iLastRow =  this.jTableDatosCuentaPorCobrar.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosCuentaPorCobrar.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosCuentaPorCobrar.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaCuentaPorCobrar(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,CuentaPorCobrarConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarCuentaPorCobrarActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<CuentaPorCobrar> cuentaporcobrarsSeleccionados=new ArrayList<CuentaPorCobrar>();									
		
			CuentaPorCobrar cuentaporcobrarOrigen=new CuentaPorCobrar();
			CuentaPorCobrar cuentaporcobrarDestino=new CuentaPorCobrar();
				
			cuentaporcobrarsSeleccionados=this.getCuentaPorCobrarsSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosCuentaPorCobrar.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || cuentaporcobrarsSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosCuentaPorCobrar.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						cuentaporcobrarOrigen =(CuentaPorCobrar) this.cuentaporcobrarLogic.getCuentaPorCobrars().toArray()[this.jTableDatosCuentaPorCobrar.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						cuentaporcobrarOrigen =(CuentaPorCobrar) this.cuentaporcobrars.toArray()[this.jTableDatosCuentaPorCobrar.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						cuentaporcobrarDestino =(CuentaPorCobrar) this.cuentaporcobrarLogic.getCuentaPorCobrars().toArray()[this.jTableDatosCuentaPorCobrar.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						cuentaporcobrarDestino =(CuentaPorCobrar) this.cuentaporcobrars.toArray()[this.jTableDatosCuentaPorCobrar.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				cuentaporcobrarOrigen =cuentaporcobrarsSeleccionados.get(0);
				cuentaporcobrarDestino =cuentaporcobrarsSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosCuentaPorCobrar(cuentaporcobrarOrigen,cuentaporcobrarDestino,true,false);
				
				cuentaporcobrarDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(cuentaporcobrarDestino,cuentaporcobrarLogic.getCuentaPorCobrars());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(cuentaporcobrarDestino,cuentaporcobrars);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaCuentaPorCobrar(false);
				
				//this.jTableDatosCuentaPorCobrar.setRowSelectionInterval(this.getIndiceNuevoCuentaPorCobrar(), this.getIndiceNuevoCuentaPorCobrar());
				
				int iLastRow =  this.jTableDatosCuentaPorCobrar.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosCuentaPorCobrar.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosCuentaPorCobrar.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaCuentaPorCobrar(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CuentaPorCobrarConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormCuentaPorCobrarActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormCuentaPorCobrar==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormCuentaPorCobrar.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CuentaPorCobrarConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarCuentaPorCobrarActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesCuentaPorCobrar.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasCuentaPorCobrar.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesCuentaPorCobrar.setVisible(!isVisible);
			this.jPanelPaginacionCuentaPorCobrar.setVisible(!isVisible);
			this.jPanelAccionesCuentaPorCobrar.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CuentaPorCobrarConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarCuentaPorCobrarActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameCuentaPorCobrar();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CuentaPorCobrarConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoCuentaPorCobrarActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoCuentaPorCobrar();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CuentaPorCobrarConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionCuentaPorCobrarActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionCuentaPorCobrar();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CuentaPorCobrarConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByCuentaPorCobrarActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByCuentaPorCobrar();
			
			this.abrirFrameOrderByCuentaPorCobrar();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CuentaPorCobrarConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByCuentaPorCobrarActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByCuentaPorCobrar();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CuentaPorCobrarConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleCuentaPorCobrar(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormCuentaPorCobrar);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormCuentaPorCobrar.isMaximum()) {
					this.jInternalFrameDetalleFormCuentaPorCobrar.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormCuentaPorCobrar.setSize(this.jInternalFrameDetalleFormCuentaPorCobrar.iWidthFormulario,this.jInternalFrameDetalleFormCuentaPorCobrar.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormCuentaPorCobrar.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormCuentaPorCobrar.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormCuentaPorCobrar.isMaximum()) {
						this.jInternalFrameDetalleFormCuentaPorCobrar.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormCuentaPorCobrar.jContentPaneDetalleCuentaPorCobrar.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormCuentaPorCobrar.jTabbedPaneRelacionesCuentaPorCobrar.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormCuentaPorCobrar.jContentPaneDetalleCuentaPorCobrar.getWidth(),CuentaPorCobrarConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormCuentaPorCobrar.jTabbedPaneRelacionesCuentaPorCobrar.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormCuentaPorCobrar.jContentPaneDetalleCuentaPorCobrar.getWidth(),CuentaPorCobrarConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormCuentaPorCobrar.jTabbedPaneRelacionesCuentaPorCobrar.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormCuentaPorCobrar.jContentPaneDetalleCuentaPorCobrar.getWidth(),CuentaPorCobrarConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormCuentaPorCobrar.setVisible(true);
	        this.jInternalFrameDetalleFormCuentaPorCobrar.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CuentaPorCobrarConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByCuentaPorCobrar() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByCuentaPorCobrar==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByCuentaPorCobrar=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByCuentaPorCobrar,false,this);
				} else {
					this.jInternalFrameOrderByCuentaPorCobrar=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByCuentaPorCobrar,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByCuentaPorCobrar);
				this.jInternalFrameOrderByCuentaPorCobrar.setVisible(false);
				this.jInternalFrameOrderByCuentaPorCobrar.setSelected(false);
				
				this.jInternalFrameOrderByCuentaPorCobrar.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByCuentaPorCobrar"));
				
				this.inicializarActualizarBindingTablaOrderByCuentaPorCobrar();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionCuentaPorCobrar() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionCuentaPorCobrar==null) {
				
				this.jInternalFrameImportacionCuentaPorCobrar=new ImportacionJInternalFrame(CuentaPorCobrarConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionCuentaPorCobrar);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionCuentaPorCobrar);
				this.jInternalFrameImportacionCuentaPorCobrar.setVisible(false);
				this.jInternalFrameImportacionCuentaPorCobrar.setSelected(false);


				this.jInternalFrameImportacionCuentaPorCobrar.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionCuentaPorCobrar"));
				this.jInternalFrameImportacionCuentaPorCobrar.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionCuentaPorCobrar"));
				this.jInternalFrameImportacionCuentaPorCobrar.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionCuentaPorCobrar"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoCuentaPorCobrar() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoCuentaPorCobrar==null) {
				this.jInternalFrameReporteDinamicoCuentaPorCobrar=new ReporteDinamicoJInternalFrame(CuentaPorCobrarConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoCuentaPorCobrar);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoCuentaPorCobrar);
				this.jInternalFrameReporteDinamicoCuentaPorCobrar.setVisible(false);
				this.jInternalFrameReporteDinamicoCuentaPorCobrar.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoCuentaPorCobrar.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoCuentaPorCobrar"));
				this.jInternalFrameReporteDinamicoCuentaPorCobrar.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoCuentaPorCobrar"));
				this.jInternalFrameReporteDinamicoCuentaPorCobrar.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoCuentaPorCobrar"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualCuentaPorCobrar();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleCuentaPorCobrar() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormCuentaPorCobrar);
			
	       	this.jInternalFrameDetalleFormCuentaPorCobrar.setVisible(false);
	        this.jInternalFrameDetalleFormCuentaPorCobrar.setSelected(false);
			
			//this.jInternalFrameDetalleFormCuentaPorCobrar.dispose();
			//this.jInternalFrameDetalleFormCuentaPorCobrar=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CuentaPorCobrarConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoCuentaPorCobrar() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoCuentaPorCobrar.setVisible(true);
	        this.jInternalFrameReporteDinamicoCuentaPorCobrar.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CuentaPorCobrarConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionCuentaPorCobrar() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionCuentaPorCobrar.setVisible(true);
	        this.jInternalFrameImportacionCuentaPorCobrar.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CuentaPorCobrarConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByCuentaPorCobrar() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByCuentaPorCobrar.setVisible(true);
	        this.jInternalFrameOrderByCuentaPorCobrar.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CuentaPorCobrarConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByCuentaPorCobrar() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByCuentaPorCobrar.setVisible(false);
	        this.jInternalFrameOrderByCuentaPorCobrar.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CuentaPorCobrarConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoCuentaPorCobrar() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoCuentaPorCobrar.setVisible(false);
	        this.jInternalFrameReporteDinamicoCuentaPorCobrar.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CuentaPorCobrarConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionCuentaPorCobrar() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionCuentaPorCobrar.setVisible(false);
	        this.jInternalFrameImportacionCuentaPorCobrar.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CuentaPorCobrarConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarCuentaPorCobrarActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarCuentaPorCobrar(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CuentaPorCobrarConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarCuentaPorCobrar(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosCuentaPorCobrar.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesCuentaPorCobrar(true);
			//this.isEsNuevoCuentaPorCobrar=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentaporcobrar =(CuentaPorCobrar) this.cuentaporcobrarLogic.getCuentaPorCobrars().toArray()[this.jTableDatosCuentaPorCobrar.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.cuentaporcobrar =(CuentaPorCobrar) this.cuentaporcobrars.toArray()[this.jTableDatosCuentaPorCobrar.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesCuentaPorCobrar("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesCuentaPorCobrar(false) ;
			
			if(cuentaporcobrarSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(CuentaPorCobrarJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleCuentaPorCobrar(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualCuentaPorCobrar(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CuentaPorCobrarConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaCuentaPorCobrarActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosCuentaPorCobrar.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuentaporcobrar =(CuentaPorCobrar) this.cuentaporcobrarLogic.getCuentaPorCobrars().toArray()[this.jTableDatosCuentaPorCobrar.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.cuentaporcobrar =(CuentaPorCobrar) this.cuentaporcobrars.toArray()[this.jTableDatosCuentaPorCobrar.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CuentaPorCobrarConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarCuentaPorCobrar(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormCuentaPorCobrar==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosCuentaPorCobrar.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesCuentaPorCobrar(true);
			//this.isEsNuevoCuentaPorCobrar=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentaporcobrar =(CuentaPorCobrar) this.cuentaporcobrarLogic.getCuentaPorCobrars().toArray()[this.jTableDatosCuentaPorCobrar.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.cuentaporcobrar =(CuentaPorCobrar) this.cuentaporcobrars.toArray()[this.jTableDatosCuentaPorCobrar.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.cuentaporcobrar.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesCuentaPorCobrar("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesCuentaPorCobrar(false) ;
			
			if(CuentaPorCobrarJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleCuentaPorCobrar(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualCuentaPorCobrar(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CuentaPorCobrarConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
			
			if(sType.equals("Cliente")) {
				if(!this.cuentaporcobrarConstantesFunciones.cargarid_clienteCuentaPorCobrar) {
					this.cargarCombosClientesForeignKeyLista(" where id="+id);
					//this.inicializarActualizarBindingCuentaPorCobrar(false,false);
					this.cargarCombosFrameClientesForeignKey("Todos");
				}

				this.setCombosCodigoDesdeBusquedaid_cliente (id);

				this.recargarComboTablaCliente(this.clientesForeignKey);

			}
			
			if(sType.equals("AsientoContable")) {
				if(!this.cuentaporcobrarConstantesFunciones.cargarid_asiento_contableCuentaPorCobrar) {
					this.cargarCombosAsientoContablesForeignKeyLista(" where id="+id);
					//this.inicializarActualizarBindingCuentaPorCobrar(false,false);
					this.cargarCombosFrameAsientoContablesForeignKey("Todos");
				}

				this.setCombosCodigoDesdeBusquedaid_asiento_contable (id);

				this.recargarComboTablaAsientoContable(this.asientocontablesForeignKey);

			}
			
			if(sType.equals("Factura")) {
				if(!this.cuentaporcobrarConstantesFunciones.cargarid_facturaCuentaPorCobrar) {
					this.cargarCombosFacturasForeignKeyLista(" where id="+id);
					//this.inicializarActualizarBindingCuentaPorCobrar(false,false);
					this.cargarCombosFrameFacturasForeignKey("Todos");
				}

				this.setCombosCodigoDesdeBusquedaid_factura (id);

				this.recargarComboTablaFactura(this.facturasForeignKey);

			}
		} catch(Exception e) {
			throw e;
		}
	}
	
						
	
	public void recargarComboTablaCliente(List<Cliente> clientesForeignKey)throws Exception{
		TableColumn tableColumnCliente=this.jTableDatosCuentaPorCobrar.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCuentaPorCobrar,CuentaPorCobrarConstantesFunciones.LABEL_IDCLIENTE));
		TableCellEditor tableCellEditorCliente =tableColumnCliente.getCellEditor();

		ClienteTableCell clienteTableCellFk=(ClienteTableCell)tableCellEditorCliente;

		if(clienteTableCellFk!=null) {
			clienteTableCellFk.setclientesForeignKey(clientesForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosCuentaPorCobrar.getSelectedRow();

		//if(intSelectedRow<=0) {
			//clienteTableCellFk.setRowActual(intSelectedRow);
			//clienteTableCellFk.setclientesForeignKeyActual(clientesForeignKey);
		//}


		if(clienteTableCellFk!=null) {
			clienteTableCellFk.RecargarClientesForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaTransaccion(List<Transaccion> transaccionsForeignKey)throws Exception{
		TableColumn tableColumnTransaccion=this.jTableDatosCuentaPorCobrar.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCuentaPorCobrar,CuentaPorCobrarConstantesFunciones.LABEL_IDTRANSACCION));
		TableCellEditor tableCellEditorTransaccion =tableColumnTransaccion.getCellEditor();

		TransaccionTableCell transaccionTableCellFk=(TransaccionTableCell)tableCellEditorTransaccion;

		if(transaccionTableCellFk!=null) {
			transaccionTableCellFk.settransaccionsForeignKey(transaccionsForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosCuentaPorCobrar.getSelectedRow();

		//if(intSelectedRow<=0) {
			//transaccionTableCellFk.setRowActual(intSelectedRow);
			//transaccionTableCellFk.settransaccionsForeignKeyActual(transaccionsForeignKey);
		//}


		if(transaccionTableCellFk!=null) {
			transaccionTableCellFk.RecargarTransaccionsForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaTipoTransaccionModulo(List<TipoTransaccionModulo> tipotransaccionmodulosForeignKey)throws Exception{
		TableColumn tableColumnTipoTransaccionModulo=this.jTableDatosCuentaPorCobrar.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCuentaPorCobrar,CuentaPorCobrarConstantesFunciones.LABEL_IDTIPOTRANSACCIONMODULO));
		TableCellEditor tableCellEditorTipoTransaccionModulo =tableColumnTipoTransaccionModulo.getCellEditor();

		TipoTransaccionModuloTableCell tipotransaccionmoduloTableCellFk=(TipoTransaccionModuloTableCell)tableCellEditorTipoTransaccionModulo;

		if(tipotransaccionmoduloTableCellFk!=null) {
			tipotransaccionmoduloTableCellFk.settipotransaccionmodulosForeignKey(tipotransaccionmodulosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosCuentaPorCobrar.getSelectedRow();

		//if(intSelectedRow<=0) {
			//tipotransaccionmoduloTableCellFk.setRowActual(intSelectedRow);
			//tipotransaccionmoduloTableCellFk.settipotransaccionmodulosForeignKeyActual(tipotransaccionmodulosForeignKey);
		//}


		if(tipotransaccionmoduloTableCellFk!=null) {
			tipotransaccionmoduloTableCellFk.RecargarTipoTransaccionModulosForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaAsientoContable(List<AsientoContable> asientocontablesForeignKey)throws Exception{
		TableColumn tableColumnAsientoContable=this.jTableDatosCuentaPorCobrar.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCuentaPorCobrar,CuentaPorCobrarConstantesFunciones.LABEL_IDASIENTOCONTABLE));
		TableCellEditor tableCellEditorAsientoContable =tableColumnAsientoContable.getCellEditor();

		AsientoContableTableCell asientocontableTableCellFk=(AsientoContableTableCell)tableCellEditorAsientoContable;

		if(asientocontableTableCellFk!=null) {
			asientocontableTableCellFk.setasientocontablesForeignKey(asientocontablesForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosCuentaPorCobrar.getSelectedRow();

		//if(intSelectedRow<=0) {
			//asientocontableTableCellFk.setRowActual(intSelectedRow);
			//asientocontableTableCellFk.setasientocontablesForeignKeyActual(asientocontablesForeignKey);
		//}


		if(asientocontableTableCellFk!=null) {
			asientocontableTableCellFk.RecargarAsientoContablesForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaFactura(List<Factura> facturasForeignKey)throws Exception{
		TableColumn tableColumnFactura=this.jTableDatosCuentaPorCobrar.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCuentaPorCobrar,CuentaPorCobrarConstantesFunciones.LABEL_IDFACTURA));
		TableCellEditor tableCellEditorFactura =tableColumnFactura.getCellEditor();

		FacturaTableCell facturaTableCellFk=(FacturaTableCell)tableCellEditorFactura;

		if(facturaTableCellFk!=null) {
			facturaTableCellFk.setfacturasForeignKey(facturasForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosCuentaPorCobrar.getSelectedRow();

		//if(intSelectedRow<=0) {
			//facturaTableCellFk.setRowActual(intSelectedRow);
			//facturaTableCellFk.setfacturasForeignKeyActual(facturasForeignKey);
		//}


		if(facturaTableCellFk!=null) {
			facturaTableCellFk.RecargarFacturasForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	

	public void setCombosCodigoDesdeBusquedaid_cliente (Long id) throws Exception {
		this.setActualClienteForeignKey(id,true,"Todos");

	};
	

	public void setCombosCodigoDesdeBusquedaid_asiento_contable (Long id) throws Exception {
		this.setActualAsientoContableForeignKey(id,true,"Todos");

	};
	

	public void setCombosCodigoDesdeBusquedaid_factura (Long id) throws Exception {
		this.setActualFacturaForeignKey(id,true,"Todos");

	};
	
	public void jButtonActualizarCuentaPorCobrarActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentaporcobrarLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesCuentaPorCobrar(false);
			
			//if(!this.isEsNuevoCuentaPorCobrar) {								
				int intSelectedRow = this.jTableDatosCuentaPorCobrar.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuentaporcobrar =(CuentaPorCobrar) this.cuentaporcobrarLogic.getCuentaPorCobrars().toArray()[this.jTableDatosCuentaPorCobrar.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.cuentaporcobrar =(CuentaPorCobrar) this.cuentaporcobrars.toArray()[this.jTableDatosCuentaPorCobrar.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(CuentaPorCobrarJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualCuentaPorCobrar(this.cuentaporcobrar,true);
				this.setVariablesFormularioToObjetoActualForeignKeysCuentaPorCobrar(this.cuentaporcobrar);
				
			}
			
			if(this.permiteMantenimiento(this.cuentaporcobrar)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.cuentaporcobrarSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoCuentaPorCobrar=true;
					this.inicializarActualizarBindingTablaCuentaPorCobrar(false);
					this.isEsNuevoCuentaPorCobrar=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoCuentaPorCobrar=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoCuentaPorCobrar=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesCuentaPorCobrar(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualCuentaPorCobrar(false);
				
				this.habilitarDeshabilitarControlesCuentaPorCobrar(false);
			
												
				
				if(CuentaPorCobrarJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleCuentaPorCobrar();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoCuentaPorCobrarActionPerformed(evt,cuentaporcobrarSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualCuentaPorCobrar(this.cuentaporcobrar,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosCuentaPorCobrar.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,cuentaporcobrarSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentaporcobrarLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.cuentaporcobrar.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(CuentaPorCobrar.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CuentaPorCobrar.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentaporcobrarLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,CuentaPorCobrarConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentaporcobrarLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarCuentaPorCobrarActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentaporcobrarLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosCuentaPorCobrar.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentaporcobrar =(CuentaPorCobrar) this.cuentaporcobrarLogic.getCuentaPorCobrars().toArray()[this.jTableDatosCuentaPorCobrar.convertRowIndexToModel(intSelectedRow)];
				this.cuentaporcobrar.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.cuentaporcobrar =(CuentaPorCobrar) this.cuentaporcobrars.toArray()[this.jTableDatosCuentaPorCobrar.convertRowIndexToModel(intSelectedRow)];
				this.cuentaporcobrar.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.cuentaporcobrar)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.cuentaporcobrarSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((CuentaPorCobrarModel) this.jTableDatosCuentaPorCobrar.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoCuentaPorCobrar=true;
				this.inicializarActualizarBindingTablaCuentaPorCobrar(false);
				this.isEsNuevoCuentaPorCobrar=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesCuentaPorCobrar(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualCuentaPorCobrar(false);
				
				this.habilitarDeshabilitarControlesCuentaPorCobrar(false);
				
				
				
				if(CuentaPorCobrarJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleCuentaPorCobrar();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentaporcobrarLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentaporcobrarLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CuentaPorCobrarConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentaporcobrarLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarCuentaPorCobrarActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosCuentaPorCobrar.getRowCount()>=1) {
				jTableDatosCuentaPorCobrar.removeRowSelectionInterval(0, jTableDatosCuentaPorCobrar.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesCuentaPorCobrar(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaCuentaPorCobrar(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesCuentaPorCobrar(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualCuentaPorCobrar(false) ;
			
			this.isEsNuevoCuentaPorCobrar=false;
			
			if(CuentaPorCobrarJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleCuentaPorCobrar();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CuentaPorCobrarConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosCuentaPorCobrarActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentaporcobrarLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingCuentaPorCobrar(false);
				
				//SI ES MANUAL
				if(CuentaPorCobrarJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualCuentaPorCobrar();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentaporcobrarLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentaporcobrarLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CuentaPorCobrarConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentaporcobrarLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosCuentaPorCobrarActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoCuentaPorCobrar--;			
			//CuentaPorCobrar cuentaporcobrarAux= new CuentaPorCobrar();			
			//cuentaporcobrarAux.setId(this.iIdNuevoCuentaPorCobrar);
			
			if(this.jInternalFrameDetalleFormCuentaPorCobrar==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaCuentaPorCobrar();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysCuentaPorCobrar(this.cuentaporcobrar);
			
			this.cuentaporcobrar.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.cuentaporcobrarLogic.getCuentaPorCobrars().add(this.cuentaporcobrarAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.cuentaporcobrars.add(this.cuentaporcobrarAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaCuentaPorCobrar(false);
			
			this.jTableDatosCuentaPorCobrar.setRowSelectionInterval(this.getIndiceNuevoCuentaPorCobrar(), this.getIndiceNuevoCuentaPorCobrar());
			
			int iLastRow =  this.jTableDatosCuentaPorCobrar.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosCuentaPorCobrar.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosCuentaPorCobrar.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaCuentaPorCobrar(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,CuentaPorCobrarConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionCuentaPorCobrarActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentaporcobrarLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingCuentaPorCobrar(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingCuentaPorCobrar(false);
			
			//SI ES MANUAL
			if(CuentaPorCobrarJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualCuentaPorCobrar();
			}
			
			//this.abrirFrameTreeCuentaPorCobrar();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentaporcobrarLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentaporcobrarLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,CuentaPorCobrarConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentaporcobrarLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionCuentaPorCobrarActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Cuenta Por CobrarES ?", "MANTENIMIENTO DE Cuenta Por Cobrar", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionCuentaPorCobrar.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralCuentaPorCobrar();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.cuentaporcobrarReturnGeneral=cuentaporcobrarLogic.procesarImportacionCuentaPorCobrarsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.cuentaporcobrarParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarCuentaPorCobrarReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CuentaPorCobrarConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionCuentaPorCobrarActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionCuentaPorCobrar.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionCuentaPorCobrar.setFileImportacion(this.jInternalFrameImportacionCuentaPorCobrar.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionCuentaPorCobrar.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionCuentaPorCobrar.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionCuentaPorCobrar.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionCuentaPorCobrar.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CuentaPorCobrarConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoCuentaPorCobrarActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<CuentaPorCobrar> cuentaporcobrarsSeleccionados=new ArrayList<CuentaPorCobrar>();		

		cuentaporcobrarsSeleccionados=this.getCuentaPorCobrarsSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoCuentaPorCobrar.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoCuentaPorCobrar.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("CuentaPorCobrarBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"CuentaPorCobrarBaseDesign.jrxml";
			
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
			
			this.generarReporteCuentaPorCobrars("Todos",cuentaporcobrarsSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cuentaporcobrarSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Cuenta Por Cobrar",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CuentaPorCobrarConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoCuentaPorCobrar.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoCuentaPorCobrar.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case CuentaPorCobrarConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CuentaPorCobrarConstantesFunciones.LABEL_IDSUCURSAL:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Sucursal_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Sucursal_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Sucursal_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Sucursal_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CuentaPorCobrarConstantesFunciones.LABEL_IDMODULO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Modulo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Modulo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Modulo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Modulo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CuentaPorCobrarConstantesFunciones.LABEL_IDEJERCICIO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Ejercicio_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Ejercicio_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Ejercicio_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Ejercicio_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CuentaPorCobrarConstantesFunciones.LABEL_IDMONEDA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Moneda_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Moneda_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Moneda_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Moneda_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CuentaPorCobrarConstantesFunciones.LABEL_IDCLIENTE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Cliente_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Cliente_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Cliente_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Cliente_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CuentaPorCobrarConstantesFunciones.LABEL_IDTRANSACCION:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Transaccion_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Transaccion_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Transaccion_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Transaccion_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CuentaPorCobrarConstantesFunciones.LABEL_IDTIPOTRANSACCIONMODULO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_TipoTransaccionModulo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_TipoTransaccionModulo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_TipoTransaccionModulo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_TipoTransaccionModulo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CuentaPorCobrarConstantesFunciones.LABEL_IDASIENTOCONTABLE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_AsientoContable_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_AsientoContable_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_AsientoContable_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_AsientoContable_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CuentaPorCobrarConstantesFunciones.LABEL_IDFACTURA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Factura_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Factura_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Factura_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Factura_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CuentaPorCobrarConstantesFunciones.LABEL_FECHA:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_cha_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_cha_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_cha_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_cha_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CuentaPorCobrarConstantesFunciones.LABEL_MONTO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_nto_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_nto_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_nto_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_nto_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CuentaPorCobrarConstantesFunciones.LABEL_NUMEROCOMPROBANTE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_meroComprobante_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_meroComprobante_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_meroComprobante_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_meroComprobante_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CuentaPorCobrarConstantesFunciones.LABEL_DEBITO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_bito_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_bito_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_bito_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_bito_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CuentaPorCobrarConstantesFunciones.LABEL_CREDITO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_edito_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_edito_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_edito_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_edito_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CuentaPorCobrarConstantesFunciones.LABEL_DETALLE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_talle_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_talle_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_talle_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_talle_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoCuentaPorCobrar.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoCuentaPorCobrar.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoCuentaPorCobrar.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case CuentaPorCobrarConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case CuentaPorCobrarConstantesFunciones.LABEL_IDSUCURSAL:
					sNombreCampoCategoria="id_sucursal";
					break;

				case CuentaPorCobrarConstantesFunciones.LABEL_IDMODULO:
					sNombreCampoCategoria="id_modulo";
					break;

				case CuentaPorCobrarConstantesFunciones.LABEL_IDEJERCICIO:
					sNombreCampoCategoria="id_ejercicio";
					break;

				case CuentaPorCobrarConstantesFunciones.LABEL_IDMONEDA:
					sNombreCampoCategoria="id_moneda";
					break;

				case CuentaPorCobrarConstantesFunciones.LABEL_IDCLIENTE:
					sNombreCampoCategoria="id_cliente";
					break;

				case CuentaPorCobrarConstantesFunciones.LABEL_IDTRANSACCION:
					sNombreCampoCategoria="id_transaccion";
					break;

				case CuentaPorCobrarConstantesFunciones.LABEL_IDTIPOTRANSACCIONMODULO:
					sNombreCampoCategoria="id_tipo_transaccion_modulo";
					break;

				case CuentaPorCobrarConstantesFunciones.LABEL_IDASIENTOCONTABLE:
					sNombreCampoCategoria="id_asiento_contable";
					break;

				case CuentaPorCobrarConstantesFunciones.LABEL_IDFACTURA:
					sNombreCampoCategoria="id_factura";
					break;

				case CuentaPorCobrarConstantesFunciones.LABEL_FECHA:
					sNombreCampoCategoria="fecha";
					break;

				case CuentaPorCobrarConstantesFunciones.LABEL_MONTO:
					sNombreCampoCategoria="monto";
					break;

				case CuentaPorCobrarConstantesFunciones.LABEL_NUMEROCOMPROBANTE:
					sNombreCampoCategoria="numero_comprobante";
					break;

				case CuentaPorCobrarConstantesFunciones.LABEL_DEBITO:
					sNombreCampoCategoria="debito";
					break;

				case CuentaPorCobrarConstantesFunciones.LABEL_CREDITO:
					sNombreCampoCategoria="credito";
					break;

				case CuentaPorCobrarConstantesFunciones.LABEL_DETALLE:
					sNombreCampoCategoria="detalle";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoCuentaPorCobrar.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case CuentaPorCobrarConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case CuentaPorCobrarConstantesFunciones.LABEL_IDSUCURSAL:
					sNombreCampoCategoriaValor="id_sucursal";
					break;

				case CuentaPorCobrarConstantesFunciones.LABEL_IDMODULO:
					sNombreCampoCategoriaValor="id_modulo";
					break;

				case CuentaPorCobrarConstantesFunciones.LABEL_IDEJERCICIO:
					sNombreCampoCategoriaValor="id_ejercicio";
					break;

				case CuentaPorCobrarConstantesFunciones.LABEL_IDMONEDA:
					sNombreCampoCategoriaValor="id_moneda";
					break;

				case CuentaPorCobrarConstantesFunciones.LABEL_IDCLIENTE:
					sNombreCampoCategoriaValor="id_cliente";
					break;

				case CuentaPorCobrarConstantesFunciones.LABEL_IDTRANSACCION:
					sNombreCampoCategoriaValor="id_transaccion";
					break;

				case CuentaPorCobrarConstantesFunciones.LABEL_IDTIPOTRANSACCIONMODULO:
					sNombreCampoCategoriaValor="id_tipo_transaccion_modulo";
					break;

				case CuentaPorCobrarConstantesFunciones.LABEL_IDASIENTOCONTABLE:
					sNombreCampoCategoriaValor="id_asiento_contable";
					break;

				case CuentaPorCobrarConstantesFunciones.LABEL_IDFACTURA:
					sNombreCampoCategoriaValor="id_factura";
					break;

				case CuentaPorCobrarConstantesFunciones.LABEL_FECHA:
					sNombreCampoCategoriaValor="fecha";
					break;

				case CuentaPorCobrarConstantesFunciones.LABEL_MONTO:
					sNombreCampoCategoriaValor="monto";
					break;

				case CuentaPorCobrarConstantesFunciones.LABEL_NUMEROCOMPROBANTE:
					sNombreCampoCategoriaValor="numero_comprobante";
					break;

				case CuentaPorCobrarConstantesFunciones.LABEL_DEBITO:
					sNombreCampoCategoriaValor="debito";
					break;

				case CuentaPorCobrarConstantesFunciones.LABEL_CREDITO:
					sNombreCampoCategoriaValor="credito";
					break;

				case CuentaPorCobrarConstantesFunciones.LABEL_DETALLE:
					sNombreCampoCategoriaValor="detalle";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoCuentaPorCobrar.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoCuentaPorCobrar.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case CuentaPorCobrarConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case CuentaPorCobrarConstantesFunciones.LABEL_IDSUCURSAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Sucursal",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_sucursal");
					break;

				case CuentaPorCobrarConstantesFunciones.LABEL_IDMODULO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Modulo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_modulo");
					break;

				case CuentaPorCobrarConstantesFunciones.LABEL_IDEJERCICIO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Ejercicio",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_ejercicio");
					break;

				case CuentaPorCobrarConstantesFunciones.LABEL_IDMONEDA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Moneda",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_moneda");
					break;

				case CuentaPorCobrarConstantesFunciones.LABEL_IDCLIENTE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Cliente",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_cliente");
					break;

				case CuentaPorCobrarConstantesFunciones.LABEL_IDTRANSACCION:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Transaccion",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_transaccion");
					break;

				case CuentaPorCobrarConstantesFunciones.LABEL_IDTIPOTRANSACCIONMODULO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Tipo Transaccion Modulo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_tipo_transaccion_modulo");
					break;

				case CuentaPorCobrarConstantesFunciones.LABEL_IDASIENTOCONTABLE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Asiento Contable",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_asiento_contable");
					break;

				case CuentaPorCobrarConstantesFunciones.LABEL_IDFACTURA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Factura",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_factura");
					break;

				case CuentaPorCobrarConstantesFunciones.LABEL_FECHA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Fecha",sNombreCampoCategoria,sNombreCampoCategoriaValor,"fecha");
					break;

				case CuentaPorCobrarConstantesFunciones.LABEL_MONTO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Monto",sNombreCampoCategoria,sNombreCampoCategoriaValor,"monto");
					break;

				case CuentaPorCobrarConstantesFunciones.LABEL_NUMEROCOMPROBANTE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Numero Comprobante",sNombreCampoCategoria,sNombreCampoCategoriaValor,"numero_comprobante");
					break;

				case CuentaPorCobrarConstantesFunciones.LABEL_DEBITO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Debito",sNombreCampoCategoria,sNombreCampoCategoriaValor,"debito");
					break;

				case CuentaPorCobrarConstantesFunciones.LABEL_CREDITO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Credito",sNombreCampoCategoria,sNombreCampoCategoriaValor,"credito");
					break;

				case CuentaPorCobrarConstantesFunciones.LABEL_DETALLE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Detalle",sNombreCampoCategoria,sNombreCampoCategoriaValor,"detalle");
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
	
	public void jButtonGenerarExcelReporteDinamicoCuentaPorCobrarActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<CuentaPorCobrar> cuentaporcobrarsSeleccionados=new ArrayList<CuentaPorCobrar>();		
		
		cuentaporcobrarsSeleccionados=this.getCuentaPorCobrarsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"cuentaporcobrar";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("CuentaPorCobrars");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoCuentaPorCobrar.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoCuentaPorCobrar.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case CuentaPorCobrarConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CuentaPorCobrarConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(CuentaPorCobrar cuentaporcobrar:cuentaporcobrarsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cuentaporcobrar.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CuentaPorCobrarConstantesFunciones.LABEL_IDSUCURSAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CuentaPorCobrarConstantesFunciones.LABEL_IDSUCURSAL);
					iRow++;

					for(CuentaPorCobrar cuentaporcobrar:cuentaporcobrarsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cuentaporcobrar.getsucursal_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CuentaPorCobrarConstantesFunciones.LABEL_IDMODULO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CuentaPorCobrarConstantesFunciones.LABEL_IDMODULO);
					iRow++;

					for(CuentaPorCobrar cuentaporcobrar:cuentaporcobrarsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cuentaporcobrar.getmodulo_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CuentaPorCobrarConstantesFunciones.LABEL_IDEJERCICIO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CuentaPorCobrarConstantesFunciones.LABEL_IDEJERCICIO);
					iRow++;

					for(CuentaPorCobrar cuentaporcobrar:cuentaporcobrarsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cuentaporcobrar.getejercicio_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CuentaPorCobrarConstantesFunciones.LABEL_IDMONEDA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CuentaPorCobrarConstantesFunciones.LABEL_IDMONEDA);
					iRow++;

					for(CuentaPorCobrar cuentaporcobrar:cuentaporcobrarsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cuentaporcobrar.getmoneda_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CuentaPorCobrarConstantesFunciones.LABEL_IDCLIENTE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CuentaPorCobrarConstantesFunciones.LABEL_IDCLIENTE);
					iRow++;

					for(CuentaPorCobrar cuentaporcobrar:cuentaporcobrarsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cuentaporcobrar.getcliente_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CuentaPorCobrarConstantesFunciones.LABEL_IDTRANSACCION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CuentaPorCobrarConstantesFunciones.LABEL_IDTRANSACCION);
					iRow++;

					for(CuentaPorCobrar cuentaporcobrar:cuentaporcobrarsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cuentaporcobrar.gettransaccion_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CuentaPorCobrarConstantesFunciones.LABEL_IDTIPOTRANSACCIONMODULO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CuentaPorCobrarConstantesFunciones.LABEL_IDTIPOTRANSACCIONMODULO);
					iRow++;

					for(CuentaPorCobrar cuentaporcobrar:cuentaporcobrarsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cuentaporcobrar.gettipotransaccionmodulo_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CuentaPorCobrarConstantesFunciones.LABEL_IDASIENTOCONTABLE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CuentaPorCobrarConstantesFunciones.LABEL_IDASIENTOCONTABLE);
					iRow++;

					for(CuentaPorCobrar cuentaporcobrar:cuentaporcobrarsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cuentaporcobrar.getasientocontable_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CuentaPorCobrarConstantesFunciones.LABEL_IDFACTURA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CuentaPorCobrarConstantesFunciones.LABEL_IDFACTURA);
					iRow++;

					for(CuentaPorCobrar cuentaporcobrar:cuentaporcobrarsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cuentaporcobrar.getfactura_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CuentaPorCobrarConstantesFunciones.LABEL_FECHA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CuentaPorCobrarConstantesFunciones.LABEL_FECHA);
					iRow++;

					for(CuentaPorCobrar cuentaporcobrar:cuentaporcobrarsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cuentaporcobrar.getfecha());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CuentaPorCobrarConstantesFunciones.LABEL_MONTO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CuentaPorCobrarConstantesFunciones.LABEL_MONTO);
					iRow++;

					for(CuentaPorCobrar cuentaporcobrar:cuentaporcobrarsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cuentaporcobrar.getmonto());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CuentaPorCobrarConstantesFunciones.LABEL_NUMEROCOMPROBANTE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CuentaPorCobrarConstantesFunciones.LABEL_NUMEROCOMPROBANTE);
					iRow++;

					for(CuentaPorCobrar cuentaporcobrar:cuentaporcobrarsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cuentaporcobrar.getnumero_comprobante());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CuentaPorCobrarConstantesFunciones.LABEL_DEBITO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CuentaPorCobrarConstantesFunciones.LABEL_DEBITO);
					iRow++;

					for(CuentaPorCobrar cuentaporcobrar:cuentaporcobrarsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cuentaporcobrar.getdebito());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CuentaPorCobrarConstantesFunciones.LABEL_CREDITO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CuentaPorCobrarConstantesFunciones.LABEL_CREDITO);
					iRow++;

					for(CuentaPorCobrar cuentaporcobrar:cuentaporcobrarsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cuentaporcobrar.getcredito());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CuentaPorCobrarConstantesFunciones.LABEL_DETALLE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CuentaPorCobrarConstantesFunciones.LABEL_DETALLE);
					iRow++;

					for(CuentaPorCobrar cuentaporcobrar:cuentaporcobrarsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cuentaporcobrar.getdetalle());
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
			//	this.getFilaCabeceraExportarExcelCuentaPorCobrar(row);				
			//	iRow++;
			//}				
			
			//for(CuentaPorCobrar cuentaporcobrarAux:cuentaporcobrarsSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelCuentaPorCobrar(cuentaporcobrarAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cuentaporcobrarSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Cuenta Por Cobrar",JOptionPane.INFORMATION_MESSAGE);
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
				this.cuentaporcobrarLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingCuentaPorCobrar(false);
			
			//SI ES MANUAL
			if(CuentaPorCobrarJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualCuentaPorCobrar();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentaporcobrarLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentaporcobrarLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentaporcobrarLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresCuentaPorCobrarActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentaporcobrarLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingCuentaPorCobrar(false);
			
			//SI ES MANUAL
			if(CuentaPorCobrarJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualCuentaPorCobrar();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentaporcobrarLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentaporcobrarLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,CuentaPorCobrarConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentaporcobrarLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesCuentaPorCobrarActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentaporcobrarLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingCuentaPorCobrar(false);
			
			//SI ES MANUAL
			if(CuentaPorCobrarJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualCuentaPorCobrar();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentaporcobrarLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentaporcobrarLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,CuentaPorCobrarConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentaporcobrarLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaCuentaPorCobrar() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosCuentaPorCobrar.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosCuentaPorCobrar.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosCuentaPorCobrar.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosCuentaPorCobrar.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosCuentaPorCobrar.setMinimumSize(dimensionMinimum);
		this.jTableDatosCuentaPorCobrar.setMaximumSize(dimensionMaximum);
		this.jTableDatosCuentaPorCobrar.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingCuentaPorCobrar(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingCuentaPorCobrar(esInicializar,true);
	}
	
	public void inicializarActualizarBindingCuentaPorCobrar(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaCuentaPorCobrar(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesCuentaPorCobrar(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.cuentaporcobrarSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasCuentaPorCobrar(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesCuentaPorCobrar(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesCuentaPorCobrar(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !CuentaPorCobrarJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!CuentaPorCobrarJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualCuentaPorCobrar() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaCuentaPorCobrar();
		
		this.inicializarActualizarBindingBotonesManualCuentaPorCobrar(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.cuentaporcobrarSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualCuentaPorCobrar();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesCuentaPorCobrar() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualCuentaPorCobrar(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualCuentaPorCobrar(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosCuentaPorCobrar.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosCuentaPorCobrar.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteCuentaPorCobrar.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormCuentaPorCobrar!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormCuentaPorCobrar.jCheckBoxPostAccionNuevoCuentaPorCobrar.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormCuentaPorCobrar.jCheckBoxPostAccionSinCerrarCuentaPorCobrar.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormCuentaPorCobrar.jCheckBoxPostAccionSinMensajeCuentaPorCobrar.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosCuentaPorCobrar.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosCuentaPorCobrar.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteCuentaPorCobrar.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormCuentaPorCobrar!=null) {
				this.jInternalFrameDetalleFormCuentaPorCobrar.jCheckBoxPostAccionNuevoCuentaPorCobrar.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormCuentaPorCobrar.jCheckBoxPostAccionSinCerrarCuentaPorCobrar.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormCuentaPorCobrar.jCheckBoxPostAccionSinMensajeCuentaPorCobrar.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionCuentaPorCobrar.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionCuentaPorCobrar.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormCuentaPorCobrar!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormCuentaPorCobrar.jComboBoxTiposAccionesFormularioCuentaPorCobrar.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesCuentaPorCobrar.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoCuentaPorCobrar!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoCuentaPorCobrar.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesCuentaPorCobrar.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesCuentaPorCobrar.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarCuentaPorCobrar.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesCuentaPorCobrar.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoCuentaPorCobrar!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoCuentaPorCobrar.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesCuentaPorCobrar.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralCuentaPorCobrar.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesCuentaPorCobrar(Boolean esInicializar) throws Exception {
		try	{	
			if(CuentaPorCobrarJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualCuentaPorCobrar(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesCuentaPorCobrar() throws Exception {
		try	{
			if(CuentaPorCobrarJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualCuentaPorCobrar();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleCuentaPorCobrar() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormCuentaPorCobrar.jComboBoxTiposAccionesFormularioCuentaPorCobrar.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormCuentaPorCobrar.jComboBoxTiposAccionesFormularioCuentaPorCobrar.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualCuentaPorCobrar() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesCuentaPorCobrar.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesCuentaPorCobrar.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesCuentaPorCobrar.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesCuentaPorCobrar.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesCuentaPorCobrar.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesCuentaPorCobrar.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionCuentaPorCobrar.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionCuentaPorCobrar.addItem(reporte);
			}
			
			
			if(!this.cuentaporcobrarSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionCuentaPorCobrar.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionCuentaPorCobrar.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesCuentaPorCobrar.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesCuentaPorCobrar.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesCuentaPorCobrar.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesCuentaPorCobrar.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormCuentaPorCobrar!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormCuentaPorCobrar.jComboBoxTiposAccionesFormularioCuentaPorCobrar.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormCuentaPorCobrar.jComboBoxTiposAccionesFormularioCuentaPorCobrar.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarCuentaPorCobrar.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarCuentaPorCobrar.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarCuentaPorCobrar.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualCuentaPorCobrar();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualCuentaPorCobrar() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoCuentaPorCobrar!=null) {
				this.jInternalFrameReporteDinamicoCuentaPorCobrar.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoCuentaPorCobrar.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoCuentaPorCobrar!=null) {
				this.jInternalFrameReporteDinamicoCuentaPorCobrar.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoCuentaPorCobrar.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoCuentaPorCobrar!=null) {
				
				if(this.jInternalFrameReporteDinamicoCuentaPorCobrar.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoCuentaPorCobrar.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoCuentaPorCobrar.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoCuentaPorCobrar.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoCuentaPorCobrar.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoCuentaPorCobrar.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
				
				//TIPOS COLUMNAS CATEGORIA DINAMICO
				if(this.jInternalFrameReporteDinamicoCuentaPorCobrar.getjComboBoxColumnaCategoriaGrafico()!=null) {
					this.jInternalFrameReporteDinamicoCuentaPorCobrar.getjComboBoxColumnaCategoriaGrafico().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoria=CuentaPorCobrarConstantesFunciones.getTiposSeleccionarCuentaPorCobrar(true,true,false,true,true);
						
					for(Reporte reporte:tiposColumnasCategoria) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoCuentaPorCobrar.getjComboBoxColumnaCategoriaGrafico().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS CATEGORIA VALOR DINAMICO
				if(this.jInternalFrameReporteDinamicoCuentaPorCobrar.getjComboBoxColumnaCategoriaValor()!=null) {
					this.jInternalFrameReporteDinamicoCuentaPorCobrar.getjComboBoxColumnaCategoriaValor().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoriaValor=CuentaPorCobrarConstantesFunciones.getTiposSeleccionarCuentaPorCobrar(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasCategoriaValor) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoCuentaPorCobrar.getjComboBoxColumnaCategoriaValor().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS VALOR
				defaultListModel=new DefaultListModel<Reporte>();
					
				if(this.jInternalFrameReporteDinamicoCuentaPorCobrar.getjListColumnasValoresGrafico()!=null) {
					this.jInternalFrameReporteDinamicoCuentaPorCobrar.getjListColumnasValoresGrafico().removeAll();
						
					ArrayList<Reporte> tiposColumnasValor=CuentaPorCobrarConstantesFunciones.getTiposSeleccionarCuentaPorCobrar(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasValor) {//this.tiposSeleccionar
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoCuentaPorCobrar.getjListColumnasValoresGrafico().setModel(defaultListModel);									
						
				}
					
				//TIPOS GRAFICOS REPORTES DINAMICOS
				if(this.jInternalFrameReporteDinamicoCuentaPorCobrar.getjComboBoxTiposGraficosReportesDinamico()!=null) {
					this.jInternalFrameReporteDinamicoCuentaPorCobrar.getjComboBoxTiposGraficosReportesDinamico().removeAllItems();
						
					for(Reporte reporte:this.tiposGraficosReportes) {
						this.jInternalFrameReporteDinamicoCuentaPorCobrar.getjComboBoxTiposGraficosReportesDinamico().addItem(reporte);
					}
					
				}
			
			
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualCuentaPorCobrar()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_asiento_contableFK_IdAsientoContableCuentaPorCobrar.getSelectedItem()!=null){this.id_asiento_contableFK_IdAsientoContable=((AsientoContable)this.jComboBoxid_asiento_contableFK_IdAsientoContableCuentaPorCobrar.getSelectedItem()).getId();}
		if(this.jComboBoxid_clienteFK_IdClienteCuentaPorCobrar.getSelectedItem()!=null){this.id_clienteFK_IdCliente=((Cliente)this.jComboBoxid_clienteFK_IdClienteCuentaPorCobrar.getSelectedItem()).getId();}
		if(this.jComboBoxid_facturaFK_IdFacturaCuentaPorCobrar.getSelectedItem()!=null){this.id_facturaFK_IdFactura=((Factura)this.jComboBoxid_facturaFK_IdFacturaCuentaPorCobrar.getSelectedItem()).getId();}
		if(this.jComboBoxid_tipo_transaccion_moduloFK_IdTipoTransaccionModuloCuentaPorCobrar.getSelectedItem()!=null){this.id_tipo_transaccion_moduloFK_IdTipoTransaccionModulo=((TipoTransaccionModulo)this.jComboBoxid_tipo_transaccion_moduloFK_IdTipoTransaccionModuloCuentaPorCobrar.getSelectedItem()).getId();}
		if(this.jComboBoxid_transaccionFK_IdTransaccionCuentaPorCobrar.getSelectedItem()!=null){this.id_transaccionFK_IdTransaccion=((Transaccion)this.jComboBoxid_transaccionFK_IdTransaccionCuentaPorCobrar.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasCuentaPorCobrar(Boolean esInicializar) throws Exception {				
		if(CuentaPorCobrarJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualCuentaPorCobrar();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaCuentaPorCobrar() throws Exception {
		this.inicializarActualizarBindingTablaCuentaPorCobrar(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByCuentaPorCobrar() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByCuentaPorCobrar.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByCuentaPorCobrar.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByCuentaPorCobrar.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new CuentaPorCobrarPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByCuentaPorCobrar.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByCuentaPorCobrar.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new CuentaPorCobrarPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosCuentaPorCobrarOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCuentaPorCobrarOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new CuentaPorCobrarPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByCuentaPorCobrar.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByCuentaPorCobrar.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new CuentaPorCobrarPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByCuentaPorCobrar.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaCuentaPorCobrar(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=cuentaporcobrarLogic.getCuentaPorCobrars().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=cuentaporcobrars.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(CuentaPorCobrarJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosCuentaPorCobrar.setModel(new CuentaPorCobrarModel(this.cuentaporcobrarLogic.getCuentaPorCobrars(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosCuentaPorCobrar.setModel(new CuentaPorCobrarModel(this.cuentaporcobrars,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByCuentaPorCobrar!=null && this.jInternalFrameOrderByCuentaPorCobrar.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByCuentaPorCobrar();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosCuentaPorCobrar.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCuentaPorCobrar,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new CuentaPorCobrarPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+CuentaPorCobrarConstantesFunciones.SCLASSWEBTITULO,cuentaporcobrarConstantesFunciones.resaltarSeleccionarCuentaPorCobrar,iSizeTabla,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+CuentaPorCobrarConstantesFunciones.SCLASSWEBTITULO,cuentaporcobrarConstantesFunciones.resaltarSeleccionarCuentaPorCobrar,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosCuentaPorCobrar.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCuentaPorCobrar,CuentaPorCobrarConstantesFunciones.LABEL_ID));

		if(this.cuentaporcobrarConstantesFunciones.mostraridCuentaPorCobrar && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CuentaPorCobrarConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.cuentaporcobrarConstantesFunciones.resaltaridCuentaPorCobrar,this.cuentaporcobrarConstantesFunciones.activaridCuentaPorCobrar,iSizeTabla,this,true,"idCuentaPorCobrar","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.cuentaporcobrarConstantesFunciones.resaltaridCuentaPorCobrar,this.cuentaporcobrarConstantesFunciones.activaridCuentaPorCobrar,this,true,"idCuentaPorCobrar","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCuentaPorCobrar.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCuentaPorCobrar,CuentaPorCobrarConstantesFunciones.LABEL_IDEMPRESA));

		if(this.cuentaporcobrarConstantesFunciones.mostrarid_empresaCuentaPorCobrar && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CuentaPorCobrarConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.cuentaporcobrarConstantesFunciones.resaltarid_empresaCuentaPorCobrar,this,this.cuentaporcobrarConstantesFunciones.activarid_empresaCuentaPorCobrar,iSizeTabla));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.cuentaporcobrarConstantesFunciones.resaltarid_empresaCuentaPorCobrar,this,this.cuentaporcobrarConstantesFunciones.activarid_empresaCuentaPorCobrar,false,"id_empresaCuentaPorCobrar","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new CuentaPorCobrarPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCuentaPorCobrar.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCuentaPorCobrar,CuentaPorCobrarConstantesFunciones.LABEL_IDSUCURSAL));

		if(this.cuentaporcobrarConstantesFunciones.mostrarid_sucursalCuentaPorCobrar && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CuentaPorCobrarConstantesFunciones.LABEL_IDSUCURSAL,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new SucursalTableCell(this.sucursalsForeignKey,this.cuentaporcobrarConstantesFunciones.resaltarid_sucursalCuentaPorCobrar,this,this.cuentaporcobrarConstantesFunciones.activarid_sucursalCuentaPorCobrar,iSizeTabla));
			tableColumn.setCellEditor(new SucursalTableCell(this.sucursalsForeignKey,this.cuentaporcobrarConstantesFunciones.resaltarid_sucursalCuentaPorCobrar,this,this.cuentaporcobrarConstantesFunciones.activarid_sucursalCuentaPorCobrar,false,"id_sucursalCuentaPorCobrar","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new CuentaPorCobrarPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCuentaPorCobrar.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCuentaPorCobrar,CuentaPorCobrarConstantesFunciones.LABEL_IDMODULO));

		if(this.cuentaporcobrarConstantesFunciones.mostrarid_moduloCuentaPorCobrar && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CuentaPorCobrarConstantesFunciones.LABEL_IDMODULO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new ModuloTableCell(this.modulosForeignKey,this.cuentaporcobrarConstantesFunciones.resaltarid_moduloCuentaPorCobrar,this,this.cuentaporcobrarConstantesFunciones.activarid_moduloCuentaPorCobrar,iSizeTabla));
			tableColumn.setCellEditor(new ModuloTableCell(this.modulosForeignKey,this.cuentaporcobrarConstantesFunciones.resaltarid_moduloCuentaPorCobrar,this,this.cuentaporcobrarConstantesFunciones.activarid_moduloCuentaPorCobrar,false,"id_moduloCuentaPorCobrar","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new CuentaPorCobrarPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCuentaPorCobrar.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCuentaPorCobrar,CuentaPorCobrarConstantesFunciones.LABEL_IDEJERCICIO));

		if(this.cuentaporcobrarConstantesFunciones.mostrarid_ejercicioCuentaPorCobrar && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CuentaPorCobrarConstantesFunciones.LABEL_IDEJERCICIO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EjercicioTableCell(this.ejerciciosForeignKey,this.cuentaporcobrarConstantesFunciones.resaltarid_ejercicioCuentaPorCobrar,this,this.cuentaporcobrarConstantesFunciones.activarid_ejercicioCuentaPorCobrar,iSizeTabla));
			tableColumn.setCellEditor(new EjercicioTableCell(this.ejerciciosForeignKey,this.cuentaporcobrarConstantesFunciones.resaltarid_ejercicioCuentaPorCobrar,this,this.cuentaporcobrarConstantesFunciones.activarid_ejercicioCuentaPorCobrar,false,"id_ejercicioCuentaPorCobrar","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new CuentaPorCobrarPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCuentaPorCobrar.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCuentaPorCobrar,CuentaPorCobrarConstantesFunciones.LABEL_IDMONEDA));

		if(this.cuentaporcobrarConstantesFunciones.mostrarid_monedaCuentaPorCobrar && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CuentaPorCobrarConstantesFunciones.LABEL_IDMONEDA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new MonedaTableCell(this.monedasForeignKey,this.cuentaporcobrarConstantesFunciones.resaltarid_monedaCuentaPorCobrar,this,this.cuentaporcobrarConstantesFunciones.activarid_monedaCuentaPorCobrar,iSizeTabla));
			tableColumn.setCellEditor(new MonedaTableCell(this.monedasForeignKey,this.cuentaporcobrarConstantesFunciones.resaltarid_monedaCuentaPorCobrar,this,this.cuentaporcobrarConstantesFunciones.activarid_monedaCuentaPorCobrar,false,"id_monedaCuentaPorCobrar","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new CuentaPorCobrarPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCuentaPorCobrar.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCuentaPorCobrar,CuentaPorCobrarConstantesFunciones.LABEL_IDCLIENTE));

		if(this.cuentaporcobrarConstantesFunciones.mostrarid_clienteCuentaPorCobrar && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CuentaPorCobrarConstantesFunciones.LABEL_IDCLIENTE,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new ClienteTableCell(this.clientesForeignKey,this.cuentaporcobrarConstantesFunciones.resaltarid_clienteCuentaPorCobrar,this,this.cuentaporcobrarConstantesFunciones.activarid_clienteCuentaPorCobrar,iSizeTabla));
			tableColumn.setCellEditor(new ClienteTableCell(this.clientesForeignKey,this.cuentaporcobrarConstantesFunciones.resaltarid_clienteCuentaPorCobrar,this,this.cuentaporcobrarConstantesFunciones.activarid_clienteCuentaPorCobrar,true,"id_clienteCuentaPorCobrar","CON_BUSQUEDA"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75);
			//tableColumn.addPropertyChangeListener(new CuentaPorCobrarPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCuentaPorCobrar.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCuentaPorCobrar,CuentaPorCobrarConstantesFunciones.LABEL_IDTRANSACCION));

		if(this.cuentaporcobrarConstantesFunciones.mostrarid_transaccionCuentaPorCobrar && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CuentaPorCobrarConstantesFunciones.LABEL_IDTRANSACCION,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new TransaccionTableCell(this.transaccionsForeignKey,this.cuentaporcobrarConstantesFunciones.resaltarid_transaccionCuentaPorCobrar,this,this.cuentaporcobrarConstantesFunciones.activarid_transaccionCuentaPorCobrar,iSizeTabla));
			tableColumn.setCellEditor(new TransaccionTableCell(this.transaccionsForeignKey,this.cuentaporcobrarConstantesFunciones.resaltarid_transaccionCuentaPorCobrar,this,this.cuentaporcobrarConstantesFunciones.activarid_transaccionCuentaPorCobrar,true,"id_transaccionCuentaPorCobrar","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50);
			//tableColumn.addPropertyChangeListener(new CuentaPorCobrarPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCuentaPorCobrar.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCuentaPorCobrar,CuentaPorCobrarConstantesFunciones.LABEL_IDASIENTOCONTABLE));

		if(this.cuentaporcobrarConstantesFunciones.mostrarid_asiento_contableCuentaPorCobrar && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CuentaPorCobrarConstantesFunciones.LABEL_IDASIENTOCONTABLE,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new AsientoContableTableCell(this.asientocontablesForeignKey,this.cuentaporcobrarConstantesFunciones.resaltarid_asiento_contableCuentaPorCobrar,this,this.cuentaporcobrarConstantesFunciones.activarid_asiento_contableCuentaPorCobrar,iSizeTabla));
			tableColumn.setCellEditor(new AsientoContableTableCell(this.asientocontablesForeignKey,this.cuentaporcobrarConstantesFunciones.resaltarid_asiento_contableCuentaPorCobrar,this,this.cuentaporcobrarConstantesFunciones.activarid_asiento_contableCuentaPorCobrar,true,"id_asiento_contableCuentaPorCobrar","CON_BUSQUEDA"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new CuentaPorCobrarPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCuentaPorCobrar.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCuentaPorCobrar,CuentaPorCobrarConstantesFunciones.LABEL_IDFACTURA));

		if(this.cuentaporcobrarConstantesFunciones.mostrarid_facturaCuentaPorCobrar && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CuentaPorCobrarConstantesFunciones.LABEL_IDFACTURA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new FacturaTableCell(this.facturasForeignKey,this.cuentaporcobrarConstantesFunciones.resaltarid_facturaCuentaPorCobrar,this,this.cuentaporcobrarConstantesFunciones.activarid_facturaCuentaPorCobrar,iSizeTabla));
			tableColumn.setCellEditor(new FacturaTableCell(this.facturasForeignKey,this.cuentaporcobrarConstantesFunciones.resaltarid_facturaCuentaPorCobrar,this,this.cuentaporcobrarConstantesFunciones.activarid_facturaCuentaPorCobrar,true,"id_facturaCuentaPorCobrar","CON_BUSQUEDA"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new CuentaPorCobrarPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCuentaPorCobrar.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCuentaPorCobrar,CuentaPorCobrarConstantesFunciones.LABEL_FECHA));

		if(this.cuentaporcobrarConstantesFunciones.mostrarfechaCuentaPorCobrar && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CuentaPorCobrarConstantesFunciones.LABEL_FECHA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new DateRenderer(this.cuentaporcobrarConstantesFunciones.resaltarfechaCuentaPorCobrar,this.cuentaporcobrarConstantesFunciones.activarfechaCuentaPorCobrar,iSizeTabla,this,true,"fechaCuentaPorCobrar","BASICO"));
			tableColumn.setCellEditor(new DateEditorRenderer(this.cuentaporcobrarConstantesFunciones.resaltarfechaCuentaPorCobrar,this.cuentaporcobrarConstantesFunciones.activarfechaCuentaPorCobrar,this,true,"fechaCuentaPorCobrar","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30);
			//tableColumn.addPropertyChangeListener(new CuentaPorCobrarPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCuentaPorCobrar.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCuentaPorCobrar,CuentaPorCobrarConstantesFunciones.LABEL_MONTO));

		if(this.cuentaporcobrarConstantesFunciones.mostrarmontoCuentaPorCobrar && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CuentaPorCobrarConstantesFunciones.LABEL_MONTO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.cuentaporcobrarConstantesFunciones.resaltarmontoCuentaPorCobrar,this.cuentaporcobrarConstantesFunciones.activarmontoCuentaPorCobrar,iSizeTabla,this,true,"montoCuentaPorCobrar","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.cuentaporcobrarConstantesFunciones.resaltarmontoCuentaPorCobrar,this.cuentaporcobrarConstantesFunciones.activarmontoCuentaPorCobrar,this,true,"montoCuentaPorCobrar","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new CuentaPorCobrarPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCuentaPorCobrar.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCuentaPorCobrar,CuentaPorCobrarConstantesFunciones.LABEL_NUMEROCOMPROBANTE));

		if(this.cuentaporcobrarConstantesFunciones.mostrarnumero_comprobanteCuentaPorCobrar && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CuentaPorCobrarConstantesFunciones.LABEL_NUMEROCOMPROBANTE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.cuentaporcobrarConstantesFunciones.resaltarnumero_comprobanteCuentaPorCobrar,this.cuentaporcobrarConstantesFunciones.activarnumero_comprobanteCuentaPorCobrar,iSizeTabla,this,true,"numero_comprobanteCuentaPorCobrar","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.cuentaporcobrarConstantesFunciones.resaltarnumero_comprobanteCuentaPorCobrar,this.cuentaporcobrarConstantesFunciones.activarnumero_comprobanteCuentaPorCobrar,this,true,"numero_comprobanteCuentaPorCobrar","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new CuentaPorCobrarPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCuentaPorCobrar.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCuentaPorCobrar,CuentaPorCobrarConstantesFunciones.LABEL_DEBITO));

		if(this.cuentaporcobrarConstantesFunciones.mostrardebitoCuentaPorCobrar && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CuentaPorCobrarConstantesFunciones.LABEL_DEBITO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.cuentaporcobrarConstantesFunciones.resaltardebitoCuentaPorCobrar,this.cuentaporcobrarConstantesFunciones.activardebitoCuentaPorCobrar,iSizeTabla,this,true,"debitoCuentaPorCobrar","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.cuentaporcobrarConstantesFunciones.resaltardebitoCuentaPorCobrar,this.cuentaporcobrarConstantesFunciones.activardebitoCuentaPorCobrar,this,true,"debitoCuentaPorCobrar","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new CuentaPorCobrarPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCuentaPorCobrar.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCuentaPorCobrar,CuentaPorCobrarConstantesFunciones.LABEL_CREDITO));

		if(this.cuentaporcobrarConstantesFunciones.mostrarcreditoCuentaPorCobrar && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CuentaPorCobrarConstantesFunciones.LABEL_CREDITO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.cuentaporcobrarConstantesFunciones.resaltarcreditoCuentaPorCobrar,this.cuentaporcobrarConstantesFunciones.activarcreditoCuentaPorCobrar,iSizeTabla,this,true,"creditoCuentaPorCobrar","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.cuentaporcobrarConstantesFunciones.resaltarcreditoCuentaPorCobrar,this.cuentaporcobrarConstantesFunciones.activarcreditoCuentaPorCobrar,this,true,"creditoCuentaPorCobrar","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new CuentaPorCobrarPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCuentaPorCobrar.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCuentaPorCobrar,CuentaPorCobrarConstantesFunciones.LABEL_DETALLE));

		if(this.cuentaporcobrarConstantesFunciones.mostrardetalleCuentaPorCobrar && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CuentaPorCobrarConstantesFunciones.LABEL_DETALLE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.cuentaporcobrarConstantesFunciones.resaltardetalleCuentaPorCobrar,this.cuentaporcobrarConstantesFunciones.activardetalleCuentaPorCobrar,iSizeTabla,this,true,"detalleCuentaPorCobrar","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.cuentaporcobrarConstantesFunciones.resaltardetalleCuentaPorCobrar,this.cuentaporcobrarConstantesFunciones.activardetalleCuentaPorCobrar,this,true,"detalleCuentaPorCobrar","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new CuentaPorCobrarPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.cuentaporcobrarSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.cuentaporcobrarSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.cuentaporcobrarSessionBean.getEsGuardarRelacionado(),iSizeTabla));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosCuentaPorCobrar.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.cuentaporcobrarSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.cuentaporcobrarSessionBean.getEsGuardarRelacionado(),iSizeTabla));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosCuentaPorCobrar.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarCuentaPorCobrar && this.isPermisoGuardarCambiosCuentaPorCobrar) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.cuentaporcobrarSessionBean.getEsGuardarRelacionado(),iSizeTabla));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.cuentaporcobrarSessionBean.getEsGuardarRelacionado(),iSizeTabla));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosCuentaPorCobrar.addColumn(tableColumn);
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
			
			this.jTableDatosCuentaPorCobrar.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarCuentaPorCobrar && this.isPermisoGuardarCambiosCuentaPorCobrar) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarCuentaPorCobrar && this.isPermisoGuardarCambiosCuentaPorCobrar) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosCuentaPorCobrar.moveColumn(this.jTableDatosCuentaPorCobrar.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosCuentaPorCobrar.moveColumn(this.jTableDatosCuentaPorCobrar.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosCuentaPorCobrar.moveColumn(this.jTableDatosCuentaPorCobrar.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosCuentaPorCobrar.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosCuentaPorCobrar.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosCuentaPorCobrar,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!CuentaPorCobrarJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosCuentaPorCobrar.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosCuentaPorCobrar.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!CuentaPorCobrarJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!CuentaPorCobrarJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosCuentaPorCobrar.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosCuentaPorCobrar.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosCuentaPorCobrar.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=cuentaporcobrarLogic.getCuentaPorCobrars().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=cuentaporcobrars.size()-1;
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
		//this.jTableDatosCuentaPorCobrar.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosCuentaPorCobrar.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosCuentaPorCobrar();
			
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
				
				//this.isEsNuevoCuentaPorCobrar=false;
					
				CuentaPorCobrarBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.cuentaporcobrar,new Object(),this.cuentaporcobrarParameterGeneral,this.cuentaporcobrarReturnGeneral);
			
				if(this.cuentaporcobrarSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormCuentaPorCobrar==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosCuentaPorCobrar.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosCuentaPorCobrar.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuentaporcobrar =(CuentaPorCobrar) this.cuentaporcobrarLogic.getCuentaPorCobrars().toArray()[this.jTableDatosCuentaPorCobrar.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.cuentaporcobrar =(CuentaPorCobrar) this.cuentaporcobrars.toArray()[this.jTableDatosCuentaPorCobrar.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.cuentaporcobrar.getsType().equals("DUPLICADO")
				   || this.cuentaporcobrar.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoCuentaPorCobrar=true;
				
				} else {
					this.isEsNuevoCuentaPorCobrar=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.cuentaporcobrarSessionBean.getEsGuardarRelacionado()) {
					if(this.cuentaporcobrar.getId()>=0 && !this.cuentaporcobrar.getIsNew()) {						
						this.isEsNuevoCuentaPorCobrar=false;
						
					} else {
						this.isEsNuevoCuentaPorCobrar=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoCuentaPorCobrar(esRelaciones);						
				
				this.seleccionarCuentaPorCobrar(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.cuentaporcobrar.getId()<0) {
					this.isEsNuevoCuentaPorCobrar=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarCuentaPorCobrar(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarCuentaPorCobrar(evt,rowIndex);
				}	
				
				if(this.cuentaporcobrarSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion CuentaPorCobrar: " + this.dDif); 
					}
				}								
				
				CuentaPorCobrarBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.cuentaporcobrar,new Object(),this.cuentaporcobrarParameterGeneral,this.cuentaporcobrarReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarCuentaPorCobrar(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.cuentaporcobrar)) {
					if(this.cuentaporcobrar.getId()>0) {
						this.cuentaporcobrar.setIsDeleted(true);
						
						this.cuentaporcobrarsEliminados.add(this.cuentaporcobrar);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.cuentaporcobrarLogic.getCuentaPorCobrars().remove(this.cuentaporcobrar);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.cuentaporcobrars.remove(this.cuentaporcobrar);				
					}
					
					
					((CuentaPorCobrarModel) this.jTableDatosCuentaPorCobrar.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaCuentaPorCobrar(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,CuentaPorCobrarConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarCuentaPorCobrar(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoCuentaPorCobrar) {
			
			if(this.jInternalFrameDetalleFormCuentaPorCobrar==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosCuentaPorCobrar.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosCuentaPorCobrar.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuentaporcobrar =(CuentaPorCobrar) this.cuentaporcobrarLogic.getCuentaPorCobrars().toArray()[this.jTableDatosCuentaPorCobrar.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.cuentaporcobrar =(CuentaPorCobrar) this.cuentaporcobrars.toArray()[this.jTableDatosCuentaPorCobrar.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(CuentaPorCobrarJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioCuentaPorCobrar(this.cuentaporcobrar);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.cuentaporcobrarConstantesFunciones.cargarid_empresaCuentaPorCobrar || this.cuentaporcobrarConstantesFunciones.event_dependid_empresaCuentaPorCobrar) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.cuentaporcobrar.getid_empresa());
									//this.inicializarActualizarBindingCuentaPorCobrar(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(cuentaporcobrar.getEmpresa()!=null) {
							this.empresasForeignKey.add(cuentaporcobrar.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.cuentaporcobrar.getid_empresa(),false,"Formulario");

					//Sucursal
					if(!this.cuentaporcobrarConstantesFunciones.cargarid_sucursalCuentaPorCobrar || this.cuentaporcobrarConstantesFunciones.event_dependid_sucursalCuentaPorCobrar) {
						//this.cargarCombosSucursalsForeignKeyLista(" where id="+this.cuentaporcobrar.getid_sucursal());
									//this.inicializarActualizarBindingCuentaPorCobrar(false,false);
						this.sucursalsForeignKey=new ArrayList<Sucursal>();

						if(cuentaporcobrar.getSucursal()!=null) {
							this.sucursalsForeignKey.add(cuentaporcobrar.getSucursal());
						}

						this.addItemDefectoCombosForeignKeySucursal();
						this.cargarCombosFrameSucursalsForeignKey("Todos");
					}
					this.setActualSucursalForeignKey(this.cuentaporcobrar.getid_sucursal(),false,"Formulario");

					//Modulo
					if(!this.cuentaporcobrarConstantesFunciones.cargarid_moduloCuentaPorCobrar || this.cuentaporcobrarConstantesFunciones.event_dependid_moduloCuentaPorCobrar) {
						//this.cargarCombosModulosForeignKeyLista(" where id="+this.cuentaporcobrar.getid_modulo());
									//this.inicializarActualizarBindingCuentaPorCobrar(false,false);
						this.modulosForeignKey=new ArrayList<Modulo>();

						if(cuentaporcobrar.getModulo()!=null) {
							this.modulosForeignKey.add(cuentaporcobrar.getModulo());
						}

						this.addItemDefectoCombosForeignKeyModulo();
						this.cargarCombosFrameModulosForeignKey("Todos");
					}
					this.setActualModuloForeignKey(this.cuentaporcobrar.getid_modulo(),false,"Formulario");

					//Ejercicio
					if(!this.cuentaporcobrarConstantesFunciones.cargarid_ejercicioCuentaPorCobrar || this.cuentaporcobrarConstantesFunciones.event_dependid_ejercicioCuentaPorCobrar) {
						//this.cargarCombosEjerciciosForeignKeyLista(" where id="+this.cuentaporcobrar.getid_ejercicio());
									//this.inicializarActualizarBindingCuentaPorCobrar(false,false);
						this.ejerciciosForeignKey=new ArrayList<Ejercicio>();

						if(cuentaporcobrar.getEjercicio()!=null) {
							this.ejerciciosForeignKey.add(cuentaporcobrar.getEjercicio());
						}

						this.addItemDefectoCombosForeignKeyEjercicio();
						this.cargarCombosFrameEjerciciosForeignKey("Todos");
					}
					this.setActualEjercicioForeignKey(this.cuentaporcobrar.getid_ejercicio(),false,"Formulario");

					//Moneda
					if(!this.cuentaporcobrarConstantesFunciones.cargarid_monedaCuentaPorCobrar || this.cuentaporcobrarConstantesFunciones.event_dependid_monedaCuentaPorCobrar) {
						//this.cargarCombosMonedasForeignKeyLista(" where id="+this.cuentaporcobrar.getid_moneda());
									//this.inicializarActualizarBindingCuentaPorCobrar(false,false);
						this.monedasForeignKey=new ArrayList<Moneda>();

						if(cuentaporcobrar.getMoneda()!=null) {
							this.monedasForeignKey.add(cuentaporcobrar.getMoneda());
						}

						this.addItemDefectoCombosForeignKeyMoneda();
						this.cargarCombosFrameMonedasForeignKey("Todos");
					}
					this.setActualMonedaForeignKey(this.cuentaporcobrar.getid_moneda(),false,"Formulario");

					//Cliente
					if(!this.cuentaporcobrarConstantesFunciones.cargarid_clienteCuentaPorCobrar || this.cuentaporcobrarConstantesFunciones.event_dependid_clienteCuentaPorCobrar) {
						//this.cargarCombosClientesForeignKeyLista(" where id="+this.cuentaporcobrar.getid_cliente());
									//this.inicializarActualizarBindingCuentaPorCobrar(false,false);
						this.clientesForeignKey=new ArrayList<Cliente>();

						if(cuentaporcobrar.getCliente()!=null) {
							this.clientesForeignKey.add(cuentaporcobrar.getCliente());
						}

						this.addItemDefectoCombosForeignKeyCliente();
						this.cargarCombosFrameClientesForeignKey("Todos");
					}
					this.setActualClienteForeignKey(this.cuentaporcobrar.getid_cliente(),false,"Formulario");

					//Transaccion
					if(!this.cuentaporcobrarConstantesFunciones.cargarid_transaccionCuentaPorCobrar || this.cuentaporcobrarConstantesFunciones.event_dependid_transaccionCuentaPorCobrar) {
						//this.cargarCombosTransaccionsForeignKeyLista(" where id="+this.cuentaporcobrar.getid_transaccion());
									//this.inicializarActualizarBindingCuentaPorCobrar(false,false);
						this.transaccionsForeignKey=new ArrayList<Transaccion>();

						if(cuentaporcobrar.getTransaccion()!=null) {
							this.transaccionsForeignKey.add(cuentaporcobrar.getTransaccion());
						}

						this.addItemDefectoCombosForeignKeyTransaccion();
						this.cargarCombosFrameTransaccionsForeignKey("Todos");
					}
					this.setActualTransaccionForeignKey(this.cuentaporcobrar.getid_transaccion(),false,"Formulario");

					//TipoTransaccionModulo
					if(!this.cuentaporcobrarConstantesFunciones.cargarid_tipo_transaccion_moduloCuentaPorCobrar || this.cuentaporcobrarConstantesFunciones.event_dependid_tipo_transaccion_moduloCuentaPorCobrar) {
						//this.cargarCombosTipoTransaccionModulosForeignKeyLista(" where id="+this.cuentaporcobrar.getid_tipo_transaccion_modulo());
									//this.inicializarActualizarBindingCuentaPorCobrar(false,false);
						this.tipotransaccionmodulosForeignKey=new ArrayList<TipoTransaccionModulo>();

						if(cuentaporcobrar.getTipoTransaccionModulo()!=null) {
							this.tipotransaccionmodulosForeignKey.add(cuentaporcobrar.getTipoTransaccionModulo());
						}

						this.addItemDefectoCombosForeignKeyTipoTransaccionModulo();
						this.cargarCombosFrameTipoTransaccionModulosForeignKey("Todos");
					}
					this.setActualTipoTransaccionModuloForeignKey(this.cuentaporcobrar.getid_tipo_transaccion_modulo(),false,"Formulario");

					//AsientoContable
					if(!this.cuentaporcobrarConstantesFunciones.cargarid_asiento_contableCuentaPorCobrar || this.cuentaporcobrarConstantesFunciones.event_dependid_asiento_contableCuentaPorCobrar) {
						//this.cargarCombosAsientoContablesForeignKeyLista(" where id="+this.cuentaporcobrar.getid_asiento_contable());
									//this.inicializarActualizarBindingCuentaPorCobrar(false,false);
						this.asientocontablesForeignKey=new ArrayList<AsientoContable>();

						if(cuentaporcobrar.getAsientoContable()!=null) {
							this.asientocontablesForeignKey.add(cuentaporcobrar.getAsientoContable());
						}

						this.addItemDefectoCombosForeignKeyAsientoContable();
						this.cargarCombosFrameAsientoContablesForeignKey("Todos");
					}
					this.setActualAsientoContableForeignKey(this.cuentaporcobrar.getid_asiento_contable(),false,"Formulario");

					//Factura
					if(!this.cuentaporcobrarConstantesFunciones.cargarid_facturaCuentaPorCobrar || this.cuentaporcobrarConstantesFunciones.event_dependid_facturaCuentaPorCobrar) {
						//this.cargarCombosFacturasForeignKeyLista(" where id="+this.cuentaporcobrar.getid_factura());
									//this.inicializarActualizarBindingCuentaPorCobrar(false,false);
						this.facturasForeignKey=new ArrayList<Factura>();

						if(cuentaporcobrar.getFactura()!=null) {
							this.facturasForeignKey.add(cuentaporcobrar.getFactura());
						}

						this.addItemDefectoCombosForeignKeyFactura();
						this.cargarCombosFrameFacturasForeignKey("Todos");
					}
					this.setActualFacturaForeignKey(this.cuentaporcobrar.getid_factura(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesCuentaPorCobrar("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesCuentaPorCobrar(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualCuentaPorCobrar() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CuentaPorCobrarConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoCuentaPorCobrar(CuentaPorCobrar cuentaporcobrar) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoCuentaPorCobrar(cuentaporcobrar,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoCuentaPorCobrar(CuentaPorCobrar cuentaporcobrar,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioCuentaPorCobrar(cuentaporcobrar);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyCuentaPorCobrar(cuentaporcobrar,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyCuentaPorCobrar(cuentaporcobrar);
	}
	
	public void setVariablesObjetoActualToFormularioCuentaPorCobrar(CuentaPorCobrar cuentaporcobrar) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormCuentaPorCobrar==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormCuentaPorCobrar.jLabelidCuentaPorCobrar.setText(cuentaporcobrar.getId().toString());
			this.jInternalFrameDetalleFormCuentaPorCobrar.jDateChooserfechaCuentaPorCobrar.setDate(cuentaporcobrar.getfecha());
			this.jInternalFrameDetalleFormCuentaPorCobrar.jTextFieldmontoCuentaPorCobrar.setText(cuentaporcobrar.getmonto().toString());
			this.jInternalFrameDetalleFormCuentaPorCobrar.jTextFieldnumero_comprobanteCuentaPorCobrar.setText(cuentaporcobrar.getnumero_comprobante());
			this.jInternalFrameDetalleFormCuentaPorCobrar.jTextFielddebitoCuentaPorCobrar.setText(cuentaporcobrar.getdebito().toString());
			this.jInternalFrameDetalleFormCuentaPorCobrar.jTextFieldcreditoCuentaPorCobrar.setText(cuentaporcobrar.getcredito().toString());
			this.jInternalFrameDetalleFormCuentaPorCobrar.jTextAreadetalleCuentaPorCobrar.setText(cuentaporcobrar.getdetalle());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CuentaPorCobrarConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,CuentaPorCobrar cuentaporcobrarLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,cuentaporcobrarLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,CuentaPorCobrar cuentaporcobrarLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				cuentaporcobrarLocal=this.cuentaporcobrar;
			} else {
				cuentaporcobrarLocal=this.cuentaporcobrarAnterior;
			}
		}
		
		if(this.permiteMantenimiento(cuentaporcobrarLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoCuentaPorCobrar(cuentaporcobrarLocal,true);
					
					if(cuentaporcobrarSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(cuentaporcobrarLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.cuentaporcobrarSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(cuentaporcobrarLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoCuentaPorCobrar(CuentaPorCobrar cuentaporcobrar,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualCuentaPorCobrar(cuentaporcobrar,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysCuentaPorCobrar(cuentaporcobrar);
	}
	
	public void setVariablesFormularioToObjetoActualCuentaPorCobrar(CuentaPorCobrar cuentaporcobrar,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualCuentaPorCobrar(cuentaporcobrar,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualCuentaPorCobrar(CuentaPorCobrar cuentaporcobrar,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormCuentaPorCobrar==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormCuentaPorCobrar.jLabelidCuentaPorCobrar.getText()==null || this.jInternalFrameDetalleFormCuentaPorCobrar.jLabelidCuentaPorCobrar.getText()=="" || this.jInternalFrameDetalleFormCuentaPorCobrar.jLabelidCuentaPorCobrar.getText()=="Id") {
				this.jInternalFrameDetalleFormCuentaPorCobrar.jLabelidCuentaPorCobrar.setText("0");
			}

			if(conColumnasBase) {cuentaporcobrar.setId(Long.parseLong(this.jInternalFrameDetalleFormCuentaPorCobrar.jLabelidCuentaPorCobrar.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CuentaPorCobrarConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCuentaPorCobrar.jLabelIdCuentaPorCobrar,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			cuentaporcobrar.setfecha(this.jInternalFrameDetalleFormCuentaPorCobrar.jDateChooserfechaCuentaPorCobrar.getDate());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CuentaPorCobrarConstantesFunciones.LABEL_FECHA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCuentaPorCobrar.jLabelfechaCuentaPorCobrar,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			cuentaporcobrar.setmonto(Double.parseDouble(this.jInternalFrameDetalleFormCuentaPorCobrar.jTextFieldmontoCuentaPorCobrar.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CuentaPorCobrarConstantesFunciones.LABEL_MONTO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCuentaPorCobrar.jLabelmontoCuentaPorCobrar,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			cuentaporcobrar.setnumero_comprobante(this.jInternalFrameDetalleFormCuentaPorCobrar.jTextFieldnumero_comprobanteCuentaPorCobrar.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CuentaPorCobrarConstantesFunciones.LABEL_NUMEROCOMPROBANTE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCuentaPorCobrar.jLabelnumero_comprobanteCuentaPorCobrar,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			cuentaporcobrar.setdebito(Double.parseDouble(this.jInternalFrameDetalleFormCuentaPorCobrar.jTextFielddebitoCuentaPorCobrar.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CuentaPorCobrarConstantesFunciones.LABEL_DEBITO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCuentaPorCobrar.jLabeldebitoCuentaPorCobrar,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			cuentaporcobrar.setcredito(Double.parseDouble(this.jInternalFrameDetalleFormCuentaPorCobrar.jTextFieldcreditoCuentaPorCobrar.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CuentaPorCobrarConstantesFunciones.LABEL_CREDITO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCuentaPorCobrar.jLabelcreditoCuentaPorCobrar,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			cuentaporcobrar.setdetalle(this.jInternalFrameDetalleFormCuentaPorCobrar.jTextAreadetalleCuentaPorCobrar.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CuentaPorCobrarConstantesFunciones.LABEL_DETALLE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCuentaPorCobrar.jLabeldetalleCuentaPorCobrar,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CuentaPorCobrarConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualCuentaPorCobrar(CuentaPorCobrar cuentaporcobrarBean,CuentaPorCobrar cuentaporcobrar,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conDefault || (!conDefault && cuentaporcobrarBean.getid_cliente()!=null && !cuentaporcobrarBean.getid_cliente().equals(-1L))) {cuentaporcobrar.setid_cliente(cuentaporcobrarBean.getid_cliente());}
			if(conDefault || (!conDefault && cuentaporcobrarBean.getid_transaccion()!=null && !cuentaporcobrarBean.getid_transaccion().equals(-1L))) {cuentaporcobrar.setid_transaccion(cuentaporcobrarBean.getid_transaccion());}
			if(conDefault || (!conDefault && cuentaporcobrarBean.getid_asiento_contable()!=null && !cuentaporcobrarBean.getid_asiento_contable().equals(-1L))) {cuentaporcobrar.setid_asiento_contable(cuentaporcobrarBean.getid_asiento_contable());}
			if(conDefault || (!conDefault && cuentaporcobrarBean.getid_factura()!=null && !cuentaporcobrarBean.getid_factura().equals(-1L))) {cuentaporcobrar.setid_factura(cuentaporcobrarBean.getid_factura());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CuentaPorCobrarConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosCuentaPorCobrar(CuentaPorCobrar cuentaporcobrarOrigen,CuentaPorCobrar cuentaporcobrar,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && cuentaporcobrarOrigen.getId()!=null && !cuentaporcobrarOrigen.getId().equals(0L))) {cuentaporcobrar.setId(cuentaporcobrarOrigen.getId());}}
			if(conDefault || (!conDefault && cuentaporcobrarOrigen.getid_cliente()!=null && !cuentaporcobrarOrigen.getid_cliente().equals(-1L))) {cuentaporcobrar.setid_cliente(cuentaporcobrarOrigen.getid_cliente());}
			if(conDefault || (!conDefault && cuentaporcobrarOrigen.getid_transaccion()!=null && !cuentaporcobrarOrigen.getid_transaccion().equals(-1L))) {cuentaporcobrar.setid_transaccion(cuentaporcobrarOrigen.getid_transaccion());}
			if(conDefault || (!conDefault && cuentaporcobrarOrigen.getid_tipo_transaccion_modulo()!=null && !cuentaporcobrarOrigen.getid_tipo_transaccion_modulo().equals(null))) {cuentaporcobrar.setid_tipo_transaccion_modulo(cuentaporcobrarOrigen.getid_tipo_transaccion_modulo());}
			if(conDefault || (!conDefault && cuentaporcobrarOrigen.getid_asiento_contable()!=null && !cuentaporcobrarOrigen.getid_asiento_contable().equals(-1L))) {cuentaporcobrar.setid_asiento_contable(cuentaporcobrarOrigen.getid_asiento_contable());}
			if(conDefault || (!conDefault && cuentaporcobrarOrigen.getid_factura()!=null && !cuentaporcobrarOrigen.getid_factura().equals(-1L))) {cuentaporcobrar.setid_factura(cuentaporcobrarOrigen.getid_factura());}
			if(conDefault || (!conDefault && cuentaporcobrarOrigen.getfecha()!=null && !cuentaporcobrarOrigen.getfecha().equals(new Date()))) {cuentaporcobrar.setfecha(cuentaporcobrarOrigen.getfecha());}
			if(conDefault || (!conDefault && cuentaporcobrarOrigen.getmonto()!=null && !cuentaporcobrarOrigen.getmonto().equals(0.0))) {cuentaporcobrar.setmonto(cuentaporcobrarOrigen.getmonto());}
			if(conDefault || (!conDefault && cuentaporcobrarOrigen.getnumero_comprobante()!=null && !cuentaporcobrarOrigen.getnumero_comprobante().equals(""))) {cuentaporcobrar.setnumero_comprobante(cuentaporcobrarOrigen.getnumero_comprobante());}
			if(conDefault || (!conDefault && cuentaporcobrarOrigen.getdebito()!=null && !cuentaporcobrarOrigen.getdebito().equals(0.0))) {cuentaporcobrar.setdebito(cuentaporcobrarOrigen.getdebito());}
			if(conDefault || (!conDefault && cuentaporcobrarOrigen.getcredito()!=null && !cuentaporcobrarOrigen.getcredito().equals(0.0))) {cuentaporcobrar.setcredito(cuentaporcobrarOrigen.getcredito());}
			if(conDefault || (!conDefault && cuentaporcobrarOrigen.getdetalle()!=null && !cuentaporcobrarOrigen.getdetalle().equals(""))) {cuentaporcobrar.setdetalle(cuentaporcobrarOrigen.getdetalle());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CuentaPorCobrarConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioCuentaPorCobrar(CuentaPorCobrar cuentaporcobrar) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormCuentaPorCobrar.jLabelidCuentaPorCobrar.setText(cuentaporcobrar.getId().toString());
			this.jInternalFrameDetalleFormCuentaPorCobrar.jDateChooserfechaCuentaPorCobrar.setDate(cuentaporcobrar.getfecha());
			this.jInternalFrameDetalleFormCuentaPorCobrar.jTextFieldmontoCuentaPorCobrar.setText(cuentaporcobrar.getmonto().toString());
			this.jInternalFrameDetalleFormCuentaPorCobrar.jTextFieldnumero_comprobanteCuentaPorCobrar.setText(cuentaporcobrar.getnumero_comprobante());
			this.jInternalFrameDetalleFormCuentaPorCobrar.jTextFielddebitoCuentaPorCobrar.setText(cuentaporcobrar.getdebito().toString());
			this.jInternalFrameDetalleFormCuentaPorCobrar.jTextFieldcreditoCuentaPorCobrar.setText(cuentaporcobrar.getcredito().toString());
			this.jInternalFrameDetalleFormCuentaPorCobrar.jTextAreadetalleCuentaPorCobrar.setText(cuentaporcobrar.getdetalle());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CuentaPorCobrarConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioCuentaPorCobrar(CuentaPorCobrarBean cuentaporcobrarBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormCuentaPorCobrar.jLabelidCuentaPorCobrar.setText(cuentaporcobrarBean.getId().toString());
			this.jInternalFrameDetalleFormCuentaPorCobrar.jDateChooserfechaCuentaPorCobrar.setDate(cuentaporcobrarBean.getfecha());
			this.jInternalFrameDetalleFormCuentaPorCobrar.jTextFieldmontoCuentaPorCobrar.setText(cuentaporcobrarBean.getmonto().toString());
			this.jInternalFrameDetalleFormCuentaPorCobrar.jTextFieldnumero_comprobanteCuentaPorCobrar.setText(cuentaporcobrarBean.getnumero_comprobante());
			this.jInternalFrameDetalleFormCuentaPorCobrar.jTextFielddebitoCuentaPorCobrar.setText(cuentaporcobrarBean.getdebito().toString());
			this.jInternalFrameDetalleFormCuentaPorCobrar.jTextFieldcreditoCuentaPorCobrar.setText(cuentaporcobrarBean.getcredito().toString());
			this.jInternalFrameDetalleFormCuentaPorCobrar.jTextAreadetalleCuentaPorCobrar.setText(cuentaporcobrarBean.getdetalle());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CuentaPorCobrarConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanCuentaPorCobrar(CuentaPorCobrarParameterReturnGeneral cuentaporcobrarReturnGeneral,CuentaPorCobrarBean cuentaporcobrarBean,Boolean conDefault) throws Exception { 
		try {
			CuentaPorCobrar cuentaporcobrarLocal=new CuentaPorCobrar();
			
			cuentaporcobrarLocal=cuentaporcobrarReturnGeneral.getCuentaPorCobrar();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && cuentaporcobrarLocal.getId()!=null && !cuentaporcobrarLocal.getId().equals(0L))) {cuentaporcobrarBean.setId(cuentaporcobrarLocal.getId());}}
			if(conDefault || (!conDefault && cuentaporcobrarLocal.getid_cliente()!=null && !cuentaporcobrarLocal.getid_cliente().equals(-1L))) {cuentaporcobrarBean.setid_cliente(cuentaporcobrarLocal.getid_cliente());}
			if(conDefault || (!conDefault && cuentaporcobrarLocal.getid_transaccion()!=null && !cuentaporcobrarLocal.getid_transaccion().equals(-1L))) {cuentaporcobrarBean.setid_transaccion(cuentaporcobrarLocal.getid_transaccion());}
			if(conDefault || (!conDefault && cuentaporcobrarLocal.getid_asiento_contable()!=null && !cuentaporcobrarLocal.getid_asiento_contable().equals(-1L))) {cuentaporcobrarBean.setid_asiento_contable(cuentaporcobrarLocal.getid_asiento_contable());}
			if(conDefault || (!conDefault && cuentaporcobrarLocal.getid_factura()!=null && !cuentaporcobrarLocal.getid_factura().equals(-1L))) {cuentaporcobrarBean.setid_factura(cuentaporcobrarLocal.getid_factura());}
			if(conDefault || (!conDefault && cuentaporcobrarLocal.getfecha()!=null && !cuentaporcobrarLocal.getfecha().equals(new Date()))) {cuentaporcobrarBean.setfecha(cuentaporcobrarLocal.getfecha());}
			if(conDefault || (!conDefault && cuentaporcobrarLocal.getmonto()!=null && !cuentaporcobrarLocal.getmonto().equals(0.0))) {cuentaporcobrarBean.setmonto(cuentaporcobrarLocal.getmonto());}
			if(conDefault || (!conDefault && cuentaporcobrarLocal.getnumero_comprobante()!=null && !cuentaporcobrarLocal.getnumero_comprobante().equals(""))) {cuentaporcobrarBean.setnumero_comprobante(cuentaporcobrarLocal.getnumero_comprobante());}
			if(conDefault || (!conDefault && cuentaporcobrarLocal.getdebito()!=null && !cuentaporcobrarLocal.getdebito().equals(0.0))) {cuentaporcobrarBean.setdebito(cuentaporcobrarLocal.getdebito());}
			if(conDefault || (!conDefault && cuentaporcobrarLocal.getcredito()!=null && !cuentaporcobrarLocal.getcredito().equals(0.0))) {cuentaporcobrarBean.setcredito(cuentaporcobrarLocal.getcredito());}
			if(conDefault || (!conDefault && cuentaporcobrarLocal.getdetalle()!=null && !cuentaporcobrarLocal.getdetalle().equals(""))) {cuentaporcobrarBean.setdetalle(cuentaporcobrarLocal.getdetalle());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CuentaPorCobrarConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxCuentaPorCobrarGenerico(Long idCuentaPorCobrarSeleccionado,JComboBox jComboBoxCuentaPorCobrar,List<CuentaPorCobrar> cuentaporcobrarsLocal)throws Exception {
		try {
			CuentaPorCobrar  cuentaporcobrarTemp=null;

			for(CuentaPorCobrar cuentaporcobrarAux:cuentaporcobrarsLocal) {
				if(cuentaporcobrarAux.getId()!=null && cuentaporcobrarAux.getId().equals(idCuentaPorCobrarSeleccionado)) {
					cuentaporcobrarTemp=cuentaporcobrarAux;
					break;
				}
			}

			jComboBoxCuentaPorCobrar.setSelectedItem(cuentaporcobrarTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxCuentaPorCobrarGenerico(JComboBox jComboBoxCuentaPorCobrar,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxCuentaPorCobrar.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxCuentaPorCobrar.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxCuentaPorCobrar.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxCuentaPorCobrar.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxCuentaPorCobrar.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxCuentaPorCobrar.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxCuentaPorCobrar.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxCuentaPorCobrar.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxCuentaPorCobrar.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxCuentaPorCobrar.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,CuentaPorCobrarConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			cuentaporcobrar=(CuentaPorCobrar) cuentaporcobrarLogic.getCuentaPorCobrars().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			cuentaporcobrar =(CuentaPorCobrar) cuentaporcobrars.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!cuentaporcobrar.getIsNew() && !cuentaporcobrar.getIsChanged() && !cuentaporcobrar.getIsDeleted()) {
				sDescripcion=cuentaporcobrar.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=cuentaporcobrar.getempresa_descripcion();
			}
		}

		if(sTipo.equals("Sucursal")) {
			//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
			if(!cuentaporcobrar.getIsNew() && !cuentaporcobrar.getIsChanged() && !cuentaporcobrar.getIsDeleted()) {
				sDescripcion=cuentaporcobrar.getsucursal_descripcion();
			} else {
				//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
				sDescripcion=cuentaporcobrar.getsucursal_descripcion();
			}
		}

		if(sTipo.equals("Modulo")) {
			//sDescripcion=this.getActualModuloForeignKeyDescripcion((Long)value);
			if(!cuentaporcobrar.getIsNew() && !cuentaporcobrar.getIsChanged() && !cuentaporcobrar.getIsDeleted()) {
				sDescripcion=cuentaporcobrar.getmodulo_descripcion();
			} else {
				//sDescripcion=this.getActualModuloForeignKeyDescripcion((Long)value);
				sDescripcion=cuentaporcobrar.getmodulo_descripcion();
			}
		}

		if(sTipo.equals("Ejercicio")) {
			//sDescripcion=this.getActualEjercicioForeignKeyDescripcion((Long)value);
			if(!cuentaporcobrar.getIsNew() && !cuentaporcobrar.getIsChanged() && !cuentaporcobrar.getIsDeleted()) {
				sDescripcion=cuentaporcobrar.getejercicio_descripcion();
			} else {
				//sDescripcion=this.getActualEjercicioForeignKeyDescripcion((Long)value);
				sDescripcion=cuentaporcobrar.getejercicio_descripcion();
			}
		}

		if(sTipo.equals("Moneda")) {
			//sDescripcion=this.getActualMonedaForeignKeyDescripcion((Long)value);
			if(!cuentaporcobrar.getIsNew() && !cuentaporcobrar.getIsChanged() && !cuentaporcobrar.getIsDeleted()) {
				sDescripcion=cuentaporcobrar.getmoneda_descripcion();
			} else {
				//sDescripcion=this.getActualMonedaForeignKeyDescripcion((Long)value);
				sDescripcion=cuentaporcobrar.getmoneda_descripcion();
			}
		}

		if(sTipo.equals("Cliente")) {
			//sDescripcion=this.getActualClienteForeignKeyDescripcion((Long)value);
			if(!cuentaporcobrar.getIsNew() && !cuentaporcobrar.getIsChanged() && !cuentaporcobrar.getIsDeleted()) {
				sDescripcion=cuentaporcobrar.getcliente_descripcion();
			} else {
				//sDescripcion=this.getActualClienteForeignKeyDescripcion((Long)value);
				sDescripcion=cuentaporcobrar.getcliente_descripcion();
			}
		}

		if(sTipo.equals("Transaccion")) {
			//sDescripcion=this.getActualTransaccionForeignKeyDescripcion((Long)value);
			if(!cuentaporcobrar.getIsNew() && !cuentaporcobrar.getIsChanged() && !cuentaporcobrar.getIsDeleted()) {
				sDescripcion=cuentaporcobrar.gettransaccion_descripcion();
			} else {
				//sDescripcion=this.getActualTransaccionForeignKeyDescripcion((Long)value);
				sDescripcion=cuentaporcobrar.gettransaccion_descripcion();
			}
		}

		if(sTipo.equals("TipoTransaccionModulo")) {
			//sDescripcion=this.getActualTipoTransaccionModuloForeignKeyDescripcion((Long)value);
			if(!cuentaporcobrar.getIsNew() && !cuentaporcobrar.getIsChanged() && !cuentaporcobrar.getIsDeleted()) {
				sDescripcion=cuentaporcobrar.gettipotransaccionmodulo_descripcion();
			} else {
				//sDescripcion=this.getActualTipoTransaccionModuloForeignKeyDescripcion((Long)value);
				sDescripcion=cuentaporcobrar.gettipotransaccionmodulo_descripcion();
			}
		}

		if(sTipo.equals("AsientoContable")) {
			//sDescripcion=this.getActualAsientoContableForeignKeyDescripcion((Long)value);
			if(!cuentaporcobrar.getIsNew() && !cuentaporcobrar.getIsChanged() && !cuentaporcobrar.getIsDeleted()) {
				sDescripcion=cuentaporcobrar.getasientocontable_descripcion();
			} else {
				//sDescripcion=this.getActualAsientoContableForeignKeyDescripcion((Long)value);
				sDescripcion=cuentaporcobrar.getasientocontable_descripcion();
			}
		}

		if(sTipo.equals("Factura")) {
			//sDescripcion=this.getActualFacturaForeignKeyDescripcion((Long)value);
			if(!cuentaporcobrar.getIsNew() && !cuentaporcobrar.getIsChanged() && !cuentaporcobrar.getIsDeleted()) {
				sDescripcion=cuentaporcobrar.getfactura_descripcion();
			} else {
				//sDescripcion=this.getActualFacturaForeignKeyDescripcion((Long)value);
				sDescripcion=cuentaporcobrar.getfactura_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		CuentaPorCobrar cuentaporcobrarRow=new CuentaPorCobrar();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			cuentaporcobrarRow=(CuentaPorCobrar) cuentaporcobrarLogic.getCuentaPorCobrars().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			cuentaporcobrarRow=(CuentaPorCobrar) cuentaporcobrars.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualCuentaPorCobrar(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoCuentaPorCobrar.setVisible((this.isVisibilidadCeldaNuevoCuentaPorCobrar && this.isPermisoNuevoCuentaPorCobrar));			
			this.jButtonDuplicarCuentaPorCobrar.setVisible((this.isVisibilidadCeldaDuplicarCuentaPorCobrar && this.isPermisoDuplicarCuentaPorCobrar));			
			this.jButtonCopiarCuentaPorCobrar.setVisible((this.isVisibilidadCeldaCopiarCuentaPorCobrar && this.isPermisoCopiarCuentaPorCobrar));
			this.jButtonVerFormCuentaPorCobrar.setVisible((this.isVisibilidadCeldaVerFormCuentaPorCobrar && this.isPermisoVerFormCuentaPorCobrar));
			
			this.jButtonAbrirOrderByCuentaPorCobrar.setVisible((this.isVisibilidadCeldaOrdenCuentaPorCobrar && this.isPermisoOrdenCuentaPorCobrar));			
			
			this.jButtonNuevoRelacionesCuentaPorCobrar.setVisible((this.isVisibilidadCeldaNuevoRelacionesCuentaPorCobrar && this.isPermisoNuevoCuentaPorCobrar));			
			this.jButtonNuevoGuardarCambiosCuentaPorCobrar.setVisible((this.isVisibilidadCeldaNuevoCuentaPorCobrar && this.isPermisoNuevoCuentaPorCobrar && this.isPermisoGuardarCambiosCuentaPorCobrar));
			
			if(this.jInternalFrameDetalleFormCuentaPorCobrar!=null) {
			this.jInternalFrameDetalleFormCuentaPorCobrar.jButtonModificarCuentaPorCobrar.setVisible((this.isVisibilidadCeldaModificarCuentaPorCobrar && this.isPermisoActualizarCuentaPorCobrar));	
			this.jInternalFrameDetalleFormCuentaPorCobrar.jButtonActualizarCuentaPorCobrar.setVisible((this.isVisibilidadCeldaActualizarCuentaPorCobrar && this.isPermisoActualizarCuentaPorCobrar));	
			this.jInternalFrameDetalleFormCuentaPorCobrar.jButtonEliminarCuentaPorCobrar.setVisible((this.isVisibilidadCeldaEliminarCuentaPorCobrar && this.isPermisoEliminarCuentaPorCobrar));
			this.jInternalFrameDetalleFormCuentaPorCobrar.jButtonCancelarCuentaPorCobrar.setVisible(this.isVisibilidadCeldaCancelarCuentaPorCobrar);							
			this.jInternalFrameDetalleFormCuentaPorCobrar.jButtonGuardarCambiosCuentaPorCobrar.setVisible((this.isVisibilidadCeldaGuardarCuentaPorCobrar && this.isPermisoGuardarCambiosCuentaPorCobrar));			
			
			}
						
			this.jButtonGuardarCambiosTablaCuentaPorCobrar.setVisible((this.isVisibilidadCeldaGuardarCambiosCuentaPorCobrar && this.isPermisoGuardarCambiosCuentaPorCobrar));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarCuentaPorCobrar.setVisible((this.isVisibilidadCeldaNuevoCuentaPorCobrar && this.isPermisoNuevoCuentaPorCobrar));						
			this.jButtonDuplicarToolBarCuentaPorCobrar.setVisible((this.isVisibilidadCeldaDuplicarCuentaPorCobrar && this.isPermisoDuplicarCuentaPorCobrar));						
			this.jButtonCopiarToolBarCuentaPorCobrar.setVisible((this.isVisibilidadCeldaCopiarCuentaPorCobrar && this.isPermisoCopiarCuentaPorCobrar));			
			this.jButtonVerFormToolBarCuentaPorCobrar.setVisible((this.isVisibilidadCeldaVerFormCuentaPorCobrar && this.isPermisoVerFormCuentaPorCobrar));			
			this.jButtonAbrirOrderByToolBarCuentaPorCobrar.setVisible((this.isVisibilidadCeldaOrdenCuentaPorCobrar && this.isPermisoOrdenCuentaPorCobrar));
			this.jButtonNuevoRelacionesToolBarCuentaPorCobrar.setVisible((this.isVisibilidadCeldaNuevoRelacionesCuentaPorCobrar && this.isPermisoNuevoCuentaPorCobrar));			
			this.jButtonNuevoGuardarCambiosToolBarCuentaPorCobrar.setVisible((this.isVisibilidadCeldaNuevoCuentaPorCobrar && this.isPermisoNuevoCuentaPorCobrar && this.isPermisoGuardarCambiosCuentaPorCobrar));			
			
			if(this.jInternalFrameDetalleFormCuentaPorCobrar!=null) {
			this.jInternalFrameDetalleFormCuentaPorCobrar.jButtonModificarToolBarCuentaPorCobrar.setVisible((this.isVisibilidadCeldaModificarCuentaPorCobrar && this.isPermisoActualizarCuentaPorCobrar));	
			this.jInternalFrameDetalleFormCuentaPorCobrar.jButtonActualizarToolBarCuentaPorCobrar.setVisible((this.isVisibilidadCeldaActualizarCuentaPorCobrar  && this.isPermisoActualizarCuentaPorCobrar));	
			this.jInternalFrameDetalleFormCuentaPorCobrar.jButtonEliminarToolBarCuentaPorCobrar.setVisible((this.isVisibilidadCeldaEliminarCuentaPorCobrar && this.isPermisoEliminarCuentaPorCobrar));
			this.jInternalFrameDetalleFormCuentaPorCobrar.jButtonCancelarToolBarCuentaPorCobrar.setVisible(this.isVisibilidadCeldaCancelarCuentaPorCobrar);				
			this.jInternalFrameDetalleFormCuentaPorCobrar.jButtonGuardarCambiosToolBarCuentaPorCobrar.setVisible((this.isVisibilidadCeldaGuardarCuentaPorCobrar && this.isPermisoGuardarCambiosCuentaPorCobrar));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarCuentaPorCobrar.setVisible((this.isVisibilidadCeldaGuardarCambiosCuentaPorCobrar && this.isPermisoGuardarCambiosCuentaPorCobrar));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoCuentaPorCobrar.setVisible((this.isVisibilidadCeldaNuevoCuentaPorCobrar && this.isPermisoNuevoCuentaPorCobrar));			
			this.jMenuItemDuplicarCuentaPorCobrar.setVisible((this.isVisibilidadCeldaDuplicarCuentaPorCobrar && this.isPermisoDuplicarCuentaPorCobrar));			
			this.jMenuItemCopiarCuentaPorCobrar.setVisible((this.isVisibilidadCeldaCopiarCuentaPorCobrar && this.isPermisoCopiarCuentaPorCobrar));			
			this.jMenuItemVerFormCuentaPorCobrar.setVisible((this.isVisibilidadCeldaVerFormCuentaPorCobrar && this.isPermisoVerFormCuentaPorCobrar));			
			this.jMenuItemAbrirOrderByCuentaPorCobrar.setVisible((this.isVisibilidadCeldaOrdenCuentaPorCobrar && this.isPermisoOrdenCuentaPorCobrar));			
			//this.jMenuItemMostrarOcultarCuentaPorCobrar.setVisible((this.isVisibilidadCeldaOrdenCuentaPorCobrar && this.isPermisoOrdenCuentaPorCobrar));
			this.jMenuItemDetalleAbrirOrderByCuentaPorCobrar.setVisible((this.isVisibilidadCeldaOrdenCuentaPorCobrar && this.isPermisoOrdenCuentaPorCobrar));			
			//this.jMenuItemDetalleMostrarOcultarCuentaPorCobrar.setVisible((this.isVisibilidadCeldaOrdenCuentaPorCobrar && this.isPermisoOrdenCuentaPorCobrar));			
			this.jMenuItemNuevoRelacionesCuentaPorCobrar.setVisible((this.isVisibilidadCeldaNuevoRelacionesCuentaPorCobrar && this.isPermisoNuevoCuentaPorCobrar));			
			this.jMenuItemNuevoGuardarCambiosCuentaPorCobrar.setVisible((this.isVisibilidadCeldaNuevoCuentaPorCobrar && this.isPermisoNuevoCuentaPorCobrar && this.isPermisoGuardarCambiosCuentaPorCobrar));									
			
			if(this.jInternalFrameDetalleFormCuentaPorCobrar!=null) {
			this.jInternalFrameDetalleFormCuentaPorCobrar.jMenuItemModificarCuentaPorCobrar.setVisible((this.isVisibilidadCeldaModificarCuentaPorCobrar && this.isPermisoActualizarCuentaPorCobrar));	
			this.jInternalFrameDetalleFormCuentaPorCobrar.jMenuItemActualizarCuentaPorCobrar.setVisible((this.isVisibilidadCeldaActualizarCuentaPorCobrar && this.isPermisoActualizarCuentaPorCobrar));	
			this.jInternalFrameDetalleFormCuentaPorCobrar.jMenuItemEliminarCuentaPorCobrar.setVisible((this.isVisibilidadCeldaEliminarCuentaPorCobrar && this.isPermisoEliminarCuentaPorCobrar));
			this.jInternalFrameDetalleFormCuentaPorCobrar.jMenuItemCancelarCuentaPorCobrar.setVisible(this.isVisibilidadCeldaCancelarCuentaPorCobrar);				
			}
			
			this.jMenuItemGuardarCambiosCuentaPorCobrar.setVisible((this.isVisibilidadCeldaGuardarCuentaPorCobrar && this.isPermisoGuardarCambiosCuentaPorCobrar));						
			this.jMenuItemGuardarCambiosTablaCuentaPorCobrar.setVisible((this.isVisibilidadCeldaGuardarCambiosCuentaPorCobrar && this.isPermisoGuardarCambiosCuentaPorCobrar));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoCuentaPorCobrar=this.jButtonNuevoCuentaPorCobrar.isVisible();
			this.isVisibilidadCeldaDuplicarCuentaPorCobrar=this.jButtonDuplicarCuentaPorCobrar.isVisible();
			this.isVisibilidadCeldaCopiarCuentaPorCobrar=this.jButtonCopiarCuentaPorCobrar.isVisible();
			this.isVisibilidadCeldaVerFormCuentaPorCobrar=this.jButtonVerFormCuentaPorCobrar.isVisible();
			
			this.isVisibilidadCeldaOrdenCuentaPorCobrar=this.jButtonAbrirOrderByCuentaPorCobrar.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesCuentaPorCobrar=this.jButtonNuevoRelacionesCuentaPorCobrar.isVisible();
			this.isVisibilidadCeldaModificarCuentaPorCobrar=this.jButtonModificarCuentaPorCobrar.isVisible();
			
			if(this.jInternalFrameDetalleFormCuentaPorCobrar!=null) {
			this.isVisibilidadCeldaActualizarCuentaPorCobrar=this.jInternalFrameDetalleFormCuentaPorCobrar.jButtonActualizarCuentaPorCobrar.isVisible();
			this.isVisibilidadCeldaEliminarCuentaPorCobrar=this.jInternalFrameDetalleFormCuentaPorCobrar.jButtonEliminarCuentaPorCobrar.isVisible();
			this.isVisibilidadCeldaCancelarCuentaPorCobrar=this.jInternalFrameDetalleFormCuentaPorCobrar.jButtonCancelarCuentaPorCobrar.isVisible();
			this.isVisibilidadCeldaGuardarCuentaPorCobrar=this.jInternalFrameDetalleFormCuentaPorCobrar.jButtonGuardarCambiosCuentaPorCobrar.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosCuentaPorCobrar=this.jButtonGuardarCambiosTablaCuentaPorCobrar.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoCuentaPorCobrar=this.jButtonNuevoToolBarCuentaPorCobrar.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesCuentaPorCobrar=this.jButtonNuevoRelacionesToolBarCuentaPorCobrar.isVisible();
			
			if(this.jInternalFrameDetalleFormCuentaPorCobrar!=null) {
			this.isVisibilidadCeldaModificarCuentaPorCobrar=this.jInternalFrameDetalleFormCuentaPorCobrar.jButtonModificarToolBarCuentaPorCobrar.isVisible();
			this.isVisibilidadCeldaActualizarCuentaPorCobrar=this.jInternalFrameDetalleFormCuentaPorCobrar.jButtonActualizarToolBarCuentaPorCobrar.isVisible();
			this.isVisibilidadCeldaEliminarCuentaPorCobrar=this.jInternalFrameDetalleFormCuentaPorCobrar.jButtonEliminarToolBarCuentaPorCobrar.isVisible();
			this.isVisibilidadCeldaCancelarCuentaPorCobrar=this.jInternalFrameDetalleFormCuentaPorCobrar.jButtonCancelarToolBarCuentaPorCobrar.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarCuentaPorCobrar=this.jButtonGuardarCambiosToolBarCuentaPorCobrar.isVisible();
			this.isVisibilidadCeldaGuardarCambiosCuentaPorCobrar=this.jButtonGuardarCambiosTablaToolBarCuentaPorCobrar.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoCuentaPorCobrar=this.jMenuItemNuevoCuentaPorCobrar.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesCuentaPorCobrar=this.jMenuItemNuevoRelacionesCuentaPorCobrar.isVisible();
			
			if(this.jInternalFrameDetalleFormCuentaPorCobrar!=null) {
			this.isVisibilidadCeldaModificarCuentaPorCobrar=this.jInternalFrameDetalleFormCuentaPorCobrar.jMenuItemModificarCuentaPorCobrar.isVisible();
			this.isVisibilidadCeldaActualizarCuentaPorCobrar=this.jInternalFrameDetalleFormCuentaPorCobrar.jMenuItemActualizarCuentaPorCobrar.isVisible();
			this.isVisibilidadCeldaEliminarCuentaPorCobrar=this.jInternalFrameDetalleFormCuentaPorCobrar.jMenuItemEliminarCuentaPorCobrar.isVisible();
			this.isVisibilidadCeldaCancelarCuentaPorCobrar=this.jInternalFrameDetalleFormCuentaPorCobrar.jMenuItemCancelarCuentaPorCobrar.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarCuentaPorCobrar=this.jMenuItemGuardarCambiosCuentaPorCobrar.isVisible();
			this.isVisibilidadCeldaGuardarCambiosCuentaPorCobrar=this.jMenuItemGuardarCambiosTablaCuentaPorCobrar.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesCuentaPorCobrar(Boolean esInicializar) {
		if(CuentaPorCobrarJInternalFrame.ISBINDING_MANUAL) {			
			if(this.cuentaporcobrarSessionBean.getConGuardarRelaciones()) {
				//if(this.cuentaporcobrarSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesCuentaPorCobrar();
			}
			
			this.inicializarActualizarBindingBotonesManualCuentaPorCobrar(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualCuentaPorCobrar() {
		this.jButtonNuevoCuentaPorCobrar.setVisible(this.isPermisoNuevoCuentaPorCobrar);			
		this.jButtonDuplicarCuentaPorCobrar.setVisible(this.isPermisoDuplicarCuentaPorCobrar);			
		this.jButtonCopiarCuentaPorCobrar.setVisible(this.isPermisoCopiarCuentaPorCobrar);			
		this.jButtonVerFormCuentaPorCobrar.setVisible(this.isPermisoVerFormCuentaPorCobrar);			
		
		this.jButtonAbrirOrderByCuentaPorCobrar.setVisible(this.isPermisoOrdenCuentaPorCobrar);					
		
		this.jButtonNuevoRelacionesCuentaPorCobrar.setVisible(this.isPermisoNuevoCuentaPorCobrar);			
		
		if(this.jInternalFrameDetalleFormCuentaPorCobrar!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCuentaPorCobrar.jButtonModificarCuentaPorCobrar.setVisible(this.isPermisoActualizarCuentaPorCobrar);	
			this.jInternalFrameDetalleFormCuentaPorCobrar.jButtonActualizarCuentaPorCobrar.setVisible(this.isPermisoActualizarCuentaPorCobrar);	
			this.jInternalFrameDetalleFormCuentaPorCobrar.jButtonEliminarCuentaPorCobrar.setVisible(this.isPermisoEliminarCuentaPorCobrar);
			this.jInternalFrameDetalleFormCuentaPorCobrar.jButtonCancelarCuentaPorCobrar.setVisible(this.isVisibilidadCeldaCancelarCuentaPorCobrar);						
			this.jInternalFrameDetalleFormCuentaPorCobrar.jButtonGuardarCambiosCuentaPorCobrar.setVisible(this.isPermisoGuardarCambiosCuentaPorCobrar);							
		}
		
		this.jButtonGuardarCambiosTablaCuentaPorCobrar.setVisible(this.isPermisoActualizarCuentaPorCobrar);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleCuentaPorCobrar() {
		this.jInternalFrameDetalleFormCuentaPorCobrar.jButtonModificarCuentaPorCobrar.setVisible(this.isPermisoActualizarCuentaPorCobrar);	
		this.jInternalFrameDetalleFormCuentaPorCobrar.jButtonActualizarCuentaPorCobrar.setVisible(this.isPermisoActualizarCuentaPorCobrar);	
		this.jInternalFrameDetalleFormCuentaPorCobrar.jButtonEliminarCuentaPorCobrar.setVisible(this.isPermisoEliminarCuentaPorCobrar);
		this.jInternalFrameDetalleFormCuentaPorCobrar.jButtonCancelarCuentaPorCobrar.setVisible(this.isVisibilidadCeldaCancelarCuentaPorCobrar);							
		this.jInternalFrameDetalleFormCuentaPorCobrar.jButtonGuardarCambiosCuentaPorCobrar.setVisible((this.isVisibilidadCeldaGuardarCuentaPorCobrar && this.isPermisoGuardarCambiosCuentaPorCobrar));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosCuentaPorCobrar() {
		if(CuentaPorCobrarJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualCuentaPorCobrar();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesCuentaPorCobrar() {
	}
	
	public void jTableDatosCuentaPorCobrarListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarCuentaPorCobrar(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CuentaPorCobrarConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidCuentaPorCobrarBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuentaporcobrarLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCuentaPorCobrar.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCuentaPorCobrar(this.getcuentaporcobrar(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCuentaPorCobrar(this.cuentaporcobrar);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cuentaporcobrar =(CuentaPorCobrar) this.cuentaporcobrarLogic.getCuentaPorCobrars().toArray()[this.jTableDatosCuentaPorCobrar.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cuentaporcobrar =(CuentaPorCobrar) this.cuentaporcobrars.toArray()[this.jTableDatosCuentaPorCobrar.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cuentaporcobrar==null) {
						this.cuentaporcobrar = new CuentaPorCobrar();
					}

					this.setVariablesFormularioToObjetoActualCuentaPorCobrar(this.cuentaporcobrar,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCuentaPorCobrar(this.cuentaporcobrar);
				}

				if(this.cuentaporcobrar.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.cuentaporcobrar.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCuentaPorCobrar(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuentaporcobrarLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuentaporcobrarLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CuentaPorCobrarConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuentaporcobrarLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaCuentaPorCobrarUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentaporcobrarLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebCuentaPorCobrar(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCuentaPorCobrar.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosCuentaPorCobrar.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosCuentaPorCobrar.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuentaporcobrar =(CuentaPorCobrar) this.cuentaporcobrarLogic.getCuentaPorCobrars().toArray()[this.jTableDatosCuentaPorCobrar.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.cuentaporcobrar =(CuentaPorCobrar) this.cuentaporcobrars.toArray()[this.jTableDatosCuentaPorCobrar.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualCuentaPorCobrar(this.getcuentaporcobrar(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysCuentaPorCobrar(this.cuentaporcobrar);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.cuentaporcobrarLogic.getConnexion());

				if(this.cuentaporcobrar.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.cuentaporcobrar.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderCuentaPorCobrar=(TitledBorder)this.jScrollPanelDatosCuentaPorCobrar.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderCuentaPorCobrar.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentaporcobrarLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentaporcobrarLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CuentaPorCobrarConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentaporcobrarLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaCuentaPorCobrarBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuentaporcobrarLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCuentaPorCobrar.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCuentaPorCobrar(this.getcuentaporcobrar(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCuentaPorCobrar(this.cuentaporcobrar);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cuentaporcobrar =(CuentaPorCobrar) this.cuentaporcobrarLogic.getCuentaPorCobrars().toArray()[this.jTableDatosCuentaPorCobrar.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cuentaporcobrar =(CuentaPorCobrar) this.cuentaporcobrars.toArray()[this.jTableDatosCuentaPorCobrar.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cuentaporcobrar==null) {
						this.cuentaporcobrar = new CuentaPorCobrar();
					}

					this.setVariablesFormularioToObjetoActualCuentaPorCobrar(this.cuentaporcobrar,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCuentaPorCobrar(this.cuentaporcobrar);
				}

				if(this.cuentaporcobrar.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.cuentaporcobrar.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCuentaPorCobrar(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuentaporcobrarLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuentaporcobrarLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CuentaPorCobrarConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuentaporcobrarLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_sucursalCuentaPorCobrarUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentaporcobrarLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisosucursal=true;

			idTienePermisosucursal=this.tienePermisosUsuarioEnPaginaWebCuentaPorCobrar(SucursalConstantesFunciones.CLASSNAME);

			if(idTienePermisosucursal) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCuentaPorCobrar.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosCuentaPorCobrar.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosCuentaPorCobrar.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuentaporcobrar =(CuentaPorCobrar) this.cuentaporcobrarLogic.getCuentaPorCobrars().toArray()[this.jTableDatosCuentaPorCobrar.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.cuentaporcobrar =(CuentaPorCobrar) this.cuentaporcobrars.toArray()[this.jTableDatosCuentaPorCobrar.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualCuentaPorCobrar(this.getcuentaporcobrar(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysCuentaPorCobrar(this.cuentaporcobrar);

				this.sucursalBeanSwingJInternalFrame=new SucursalBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.sucursalBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.sucursalBeanSwingJInternalFrame.getSucursalLogic().setConnexion(this.cuentaporcobrarLogic.getConnexion());

				if(this.cuentaporcobrar.getid_sucursal()!=null) {
					this.sucursalBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.sucursalBeanSwingJInternalFrame.setIdActual(this.cuentaporcobrar.getid_sucursal());
					this.sucursalBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.inicializarActualizarBindingTablaSucursal();
				}

				JInternalFrameBase jinternalFrame =this.sucursalBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderCuentaPorCobrar=(TitledBorder)this.jScrollPanelDatosCuentaPorCobrar.getBorder();
				TitledBorder titledBordersucursal=(TitledBorder)this.sucursalBeanSwingJInternalFrame.jScrollPanelDatosSucursal.getBorder();

				titledBordersucursal.setTitle(titledBorderCuentaPorCobrar.getTitle() + " -> Sucursal");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentaporcobrarLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentaporcobrarLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CuentaPorCobrarConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentaporcobrarLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_sucursalCuentaPorCobrarBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuentaporcobrarLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCuentaPorCobrar.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCuentaPorCobrar(this.getcuentaporcobrar(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCuentaPorCobrar(this.cuentaporcobrar);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cuentaporcobrar =(CuentaPorCobrar) this.cuentaporcobrarLogic.getCuentaPorCobrars().toArray()[this.jTableDatosCuentaPorCobrar.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cuentaporcobrar =(CuentaPorCobrar) this.cuentaporcobrars.toArray()[this.jTableDatosCuentaPorCobrar.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cuentaporcobrar==null) {
						this.cuentaporcobrar = new CuentaPorCobrar();
					}

					this.setVariablesFormularioToObjetoActualCuentaPorCobrar(this.cuentaporcobrar,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCuentaPorCobrar(this.cuentaporcobrar);
				}

				if(this.cuentaporcobrar.getid_sucursal()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_sucursal = "+this.cuentaporcobrar.getid_sucursal().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCuentaPorCobrar(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuentaporcobrarLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuentaporcobrarLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CuentaPorCobrarConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuentaporcobrarLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_moduloCuentaPorCobrarUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentaporcobrarLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisomodulo=true;

			idTienePermisomodulo=this.tienePermisosUsuarioEnPaginaWebCuentaPorCobrar(ModuloConstantesFunciones.CLASSNAME);

			if(idTienePermisomodulo) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCuentaPorCobrar.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosCuentaPorCobrar.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosCuentaPorCobrar.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuentaporcobrar =(CuentaPorCobrar) this.cuentaporcobrarLogic.getCuentaPorCobrars().toArray()[this.jTableDatosCuentaPorCobrar.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.cuentaporcobrar =(CuentaPorCobrar) this.cuentaporcobrars.toArray()[this.jTableDatosCuentaPorCobrar.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualCuentaPorCobrar(this.getcuentaporcobrar(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysCuentaPorCobrar(this.cuentaporcobrar);

				this.moduloBeanSwingJInternalFrame=new ModuloBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.moduloBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.moduloBeanSwingJInternalFrame.getModuloLogic().setConnexion(this.cuentaporcobrarLogic.getConnexion());

				if(this.cuentaporcobrar.getid_modulo()!=null) {
					this.moduloBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.moduloBeanSwingJInternalFrame.setIdActual(this.cuentaporcobrar.getid_modulo());
					this.moduloBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.moduloBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.moduloBeanSwingJInternalFrame.inicializarActualizarBindingTablaModulo();
				}

				JInternalFrameBase jinternalFrame =this.moduloBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderCuentaPorCobrar=(TitledBorder)this.jScrollPanelDatosCuentaPorCobrar.getBorder();
				TitledBorder titledBordermodulo=(TitledBorder)this.moduloBeanSwingJInternalFrame.jScrollPanelDatosModulo.getBorder();

				titledBordermodulo.setTitle(titledBorderCuentaPorCobrar.getTitle() + " -> Modulo");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentaporcobrarLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentaporcobrarLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CuentaPorCobrarConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentaporcobrarLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_moduloCuentaPorCobrarBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuentaporcobrarLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCuentaPorCobrar.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCuentaPorCobrar(this.getcuentaporcobrar(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCuentaPorCobrar(this.cuentaporcobrar);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cuentaporcobrar =(CuentaPorCobrar) this.cuentaporcobrarLogic.getCuentaPorCobrars().toArray()[this.jTableDatosCuentaPorCobrar.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cuentaporcobrar =(CuentaPorCobrar) this.cuentaporcobrars.toArray()[this.jTableDatosCuentaPorCobrar.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cuentaporcobrar==null) {
						this.cuentaporcobrar = new CuentaPorCobrar();
					}

					this.setVariablesFormularioToObjetoActualCuentaPorCobrar(this.cuentaporcobrar,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCuentaPorCobrar(this.cuentaporcobrar);
				}

				if(this.cuentaporcobrar.getid_modulo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_modulo = "+this.cuentaporcobrar.getid_modulo().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCuentaPorCobrar(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuentaporcobrarLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuentaporcobrarLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CuentaPorCobrarConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuentaporcobrarLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_ejercicioCuentaPorCobrarUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentaporcobrarLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoejercicio=true;

			idTienePermisoejercicio=this.tienePermisosUsuarioEnPaginaWebCuentaPorCobrar(EjercicioConstantesFunciones.CLASSNAME);

			if(idTienePermisoejercicio) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCuentaPorCobrar.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosCuentaPorCobrar.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosCuentaPorCobrar.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuentaporcobrar =(CuentaPorCobrar) this.cuentaporcobrarLogic.getCuentaPorCobrars().toArray()[this.jTableDatosCuentaPorCobrar.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.cuentaporcobrar =(CuentaPorCobrar) this.cuentaporcobrars.toArray()[this.jTableDatosCuentaPorCobrar.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualCuentaPorCobrar(this.getcuentaporcobrar(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysCuentaPorCobrar(this.cuentaporcobrar);

				this.ejercicioBeanSwingJInternalFrame=new EjercicioBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.ejercicioBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.ejercicioBeanSwingJInternalFrame.getEjercicioLogic().setConnexion(this.cuentaporcobrarLogic.getConnexion());

				if(this.cuentaporcobrar.getid_ejercicio()!=null) {
					this.ejercicioBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.ejercicioBeanSwingJInternalFrame.setIdActual(this.cuentaporcobrar.getid_ejercicio());
					this.ejercicioBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.ejercicioBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.ejercicioBeanSwingJInternalFrame.inicializarActualizarBindingTablaEjercicio();
				}

				JInternalFrameBase jinternalFrame =this.ejercicioBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderCuentaPorCobrar=(TitledBorder)this.jScrollPanelDatosCuentaPorCobrar.getBorder();
				TitledBorder titledBorderejercicio=(TitledBorder)this.ejercicioBeanSwingJInternalFrame.jScrollPanelDatosEjercicio.getBorder();

				titledBorderejercicio.setTitle(titledBorderCuentaPorCobrar.getTitle() + " -> Ejercicio");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentaporcobrarLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentaporcobrarLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CuentaPorCobrarConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentaporcobrarLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_ejercicioCuentaPorCobrarBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuentaporcobrarLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCuentaPorCobrar.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCuentaPorCobrar(this.getcuentaporcobrar(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCuentaPorCobrar(this.cuentaporcobrar);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cuentaporcobrar =(CuentaPorCobrar) this.cuentaporcobrarLogic.getCuentaPorCobrars().toArray()[this.jTableDatosCuentaPorCobrar.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cuentaporcobrar =(CuentaPorCobrar) this.cuentaporcobrars.toArray()[this.jTableDatosCuentaPorCobrar.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cuentaporcobrar==null) {
						this.cuentaporcobrar = new CuentaPorCobrar();
					}

					this.setVariablesFormularioToObjetoActualCuentaPorCobrar(this.cuentaporcobrar,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCuentaPorCobrar(this.cuentaporcobrar);
				}

				if(this.cuentaporcobrar.getid_ejercicio()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_ejercicio = "+this.cuentaporcobrar.getid_ejercicio().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCuentaPorCobrar(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuentaporcobrarLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuentaporcobrarLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CuentaPorCobrarConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuentaporcobrarLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_monedaCuentaPorCobrarUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentaporcobrarLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisomoneda=true;

			idTienePermisomoneda=this.tienePermisosUsuarioEnPaginaWebCuentaPorCobrar(MonedaConstantesFunciones.CLASSNAME);

			if(idTienePermisomoneda) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCuentaPorCobrar.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosCuentaPorCobrar.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosCuentaPorCobrar.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuentaporcobrar =(CuentaPorCobrar) this.cuentaporcobrarLogic.getCuentaPorCobrars().toArray()[this.jTableDatosCuentaPorCobrar.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.cuentaporcobrar =(CuentaPorCobrar) this.cuentaporcobrars.toArray()[this.jTableDatosCuentaPorCobrar.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualCuentaPorCobrar(this.getcuentaporcobrar(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysCuentaPorCobrar(this.cuentaporcobrar);

				this.monedaBeanSwingJInternalFrame=new MonedaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.monedaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.monedaBeanSwingJInternalFrame.getMonedaLogic().setConnexion(this.cuentaporcobrarLogic.getConnexion());

				if(this.cuentaporcobrar.getid_moneda()!=null) {
					this.monedaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.monedaBeanSwingJInternalFrame.setIdActual(this.cuentaporcobrar.getid_moneda());
					this.monedaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.monedaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.monedaBeanSwingJInternalFrame.inicializarActualizarBindingTablaMoneda();
				}

				JInternalFrameBase jinternalFrame =this.monedaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderCuentaPorCobrar=(TitledBorder)this.jScrollPanelDatosCuentaPorCobrar.getBorder();
				TitledBorder titledBordermoneda=(TitledBorder)this.monedaBeanSwingJInternalFrame.jScrollPanelDatosMoneda.getBorder();

				titledBordermoneda.setTitle(titledBorderCuentaPorCobrar.getTitle() + " -> Moneda");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentaporcobrarLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentaporcobrarLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CuentaPorCobrarConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentaporcobrarLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_monedaCuentaPorCobrarBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuentaporcobrarLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCuentaPorCobrar.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCuentaPorCobrar(this.getcuentaporcobrar(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCuentaPorCobrar(this.cuentaporcobrar);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cuentaporcobrar =(CuentaPorCobrar) this.cuentaporcobrarLogic.getCuentaPorCobrars().toArray()[this.jTableDatosCuentaPorCobrar.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cuentaporcobrar =(CuentaPorCobrar) this.cuentaporcobrars.toArray()[this.jTableDatosCuentaPorCobrar.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cuentaporcobrar==null) {
						this.cuentaporcobrar = new CuentaPorCobrar();
					}

					this.setVariablesFormularioToObjetoActualCuentaPorCobrar(this.cuentaporcobrar,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCuentaPorCobrar(this.cuentaporcobrar);
				}

				if(this.cuentaporcobrar.getid_moneda()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_moneda = "+this.cuentaporcobrar.getid_moneda().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCuentaPorCobrar(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuentaporcobrarLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuentaporcobrarLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CuentaPorCobrarConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuentaporcobrarLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_clienteCuentaPorCobrarActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {
			this.clienteBeanSwingJInternalFrame=new ClienteBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.BUSQUEDA,false,false,false,true);
			this.clienteBeanSwingJInternalFrame.setJInternalFrameParent(this);
			this.clienteBeanSwingJInternalFrame.sTipoBusqueda="Cliente";

			if(!this.sFinalQueryGeneral_cliente.equals("")) {
				this.clienteBeanSwingJInternalFrame.setsFinalQueryGeneral(this.sFinalQueryGeneral_cliente);
				this.clienteBeanSwingJInternalFrame.sAccionBusqueda="Query";


				this.clienteBeanSwingJInternalFrame.procesarBusqueda(this.clienteBeanSwingJInternalFrame.sAccionBusqueda);
				this.clienteBeanSwingJInternalFrame.inicializarActualizarBindingCliente(false);
			}

			if(!this.sFinalQueryComboCliente.equals("") && false) {
			}


			JInternalFrameBase jinternalFrame =this.clienteBeanSwingJInternalFrame;
			jinternalFrame.setAutoscrolls(true);
			//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
			jinternalFrame.setVisible(true); 


			TitledBorder titledBorderCuentaPorCobrar=null;
			TitledBorder titledBordercliente=null;

			if(!this.jScrollPanelDatosCuentaPorCobrar.getBorder().getClass().equals(EmptyBorder.class)) {
				titledBorderCuentaPorCobrar=(TitledBorder)this.jScrollPanelDatosCuentaPorCobrar.getBorder();
				titledBordercliente=(TitledBorder)this.clienteBeanSwingJInternalFrame.jScrollPanelDatosCliente.getBorder();

				titledBordercliente.setTitle(titledBorderCuentaPorCobrar.getTitle() + " -> Cliente");
			}

			if(!Constantes.CON_VARIAS_VENTANAS) {
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
			}

			this.jDesktopPane.add(jinternalFrame);

			jinternalFrame.setSelected(true);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CuentaPorCobrarConstantesFunciones.CLASSNAME);
		}
	}

	public void jButtonid_clienteCuentaPorCobrarUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentaporcobrarLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisocliente=true;

			idTienePermisocliente=this.tienePermisosUsuarioEnPaginaWebCuentaPorCobrar(ClienteConstantesFunciones.CLASSNAME);

			if(idTienePermisocliente) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCuentaPorCobrar.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosCuentaPorCobrar.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosCuentaPorCobrar.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuentaporcobrar =(CuentaPorCobrar) this.cuentaporcobrarLogic.getCuentaPorCobrars().toArray()[this.jTableDatosCuentaPorCobrar.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.cuentaporcobrar =(CuentaPorCobrar) this.cuentaporcobrars.toArray()[this.jTableDatosCuentaPorCobrar.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualCuentaPorCobrar(this.getcuentaporcobrar(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysCuentaPorCobrar(this.cuentaporcobrar);

				this.clienteBeanSwingJInternalFrame=new ClienteBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.clienteBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.clienteBeanSwingJInternalFrame.getClienteLogic().setConnexion(this.cuentaporcobrarLogic.getConnexion());

				if(this.cuentaporcobrar.getid_cliente()!=null) {
					this.clienteBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.clienteBeanSwingJInternalFrame.setIdActual(this.cuentaporcobrar.getid_cliente());
					this.clienteBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.clienteBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.clienteBeanSwingJInternalFrame.inicializarActualizarBindingTablaCliente();
				}

				JInternalFrameBase jinternalFrame =this.clienteBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderCuentaPorCobrar=(TitledBorder)this.jScrollPanelDatosCuentaPorCobrar.getBorder();
				TitledBorder titledBordercliente=(TitledBorder)this.clienteBeanSwingJInternalFrame.jScrollPanelDatosCliente.getBorder();

				titledBordercliente.setTitle(titledBorderCuentaPorCobrar.getTitle() + " -> Cliente");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentaporcobrarLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentaporcobrarLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CuentaPorCobrarConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentaporcobrarLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_clienteCuentaPorCobrarBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuentaporcobrarLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCuentaPorCobrar.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCuentaPorCobrar(this.getcuentaporcobrar(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCuentaPorCobrar(this.cuentaporcobrar);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cuentaporcobrar =(CuentaPorCobrar) this.cuentaporcobrarLogic.getCuentaPorCobrars().toArray()[this.jTableDatosCuentaPorCobrar.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cuentaporcobrar =(CuentaPorCobrar) this.cuentaporcobrars.toArray()[this.jTableDatosCuentaPorCobrar.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cuentaporcobrar==null) {
						this.cuentaporcobrar = new CuentaPorCobrar();
					}

					this.setVariablesFormularioToObjetoActualCuentaPorCobrar(this.cuentaporcobrar,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCuentaPorCobrar(this.cuentaporcobrar);
				}

				if(this.cuentaporcobrar.getid_cliente()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_cliente = "+this.cuentaporcobrar.getid_cliente().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCuentaPorCobrar(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuentaporcobrarLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuentaporcobrarLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CuentaPorCobrarConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuentaporcobrarLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_transaccionCuentaPorCobrarUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentaporcobrarLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisotransaccion=true;

			idTienePermisotransaccion=this.tienePermisosUsuarioEnPaginaWebCuentaPorCobrar(TransaccionConstantesFunciones.CLASSNAME);

			if(idTienePermisotransaccion) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCuentaPorCobrar.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosCuentaPorCobrar.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosCuentaPorCobrar.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuentaporcobrar =(CuentaPorCobrar) this.cuentaporcobrarLogic.getCuentaPorCobrars().toArray()[this.jTableDatosCuentaPorCobrar.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.cuentaporcobrar =(CuentaPorCobrar) this.cuentaporcobrars.toArray()[this.jTableDatosCuentaPorCobrar.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualCuentaPorCobrar(this.getcuentaporcobrar(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysCuentaPorCobrar(this.cuentaporcobrar);

				this.transaccionBeanSwingJInternalFrame=new TransaccionBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.transaccionBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.transaccionBeanSwingJInternalFrame.getTransaccionLogic().setConnexion(this.cuentaporcobrarLogic.getConnexion());

				if(this.cuentaporcobrar.getid_transaccion()!=null) {
					this.transaccionBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.transaccionBeanSwingJInternalFrame.setIdActual(this.cuentaporcobrar.getid_transaccion());
					this.transaccionBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.transaccionBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.transaccionBeanSwingJInternalFrame.inicializarActualizarBindingTablaTransaccion();
				}

				JInternalFrameBase jinternalFrame =this.transaccionBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderCuentaPorCobrar=(TitledBorder)this.jScrollPanelDatosCuentaPorCobrar.getBorder();
				TitledBorder titledBordertransaccion=(TitledBorder)this.transaccionBeanSwingJInternalFrame.jScrollPanelDatosTransaccion.getBorder();

				titledBordertransaccion.setTitle(titledBorderCuentaPorCobrar.getTitle() + " -> Transaccion");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentaporcobrarLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentaporcobrarLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CuentaPorCobrarConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentaporcobrarLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_transaccionCuentaPorCobrarBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuentaporcobrarLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCuentaPorCobrar.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCuentaPorCobrar(this.getcuentaporcobrar(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCuentaPorCobrar(this.cuentaporcobrar);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cuentaporcobrar =(CuentaPorCobrar) this.cuentaporcobrarLogic.getCuentaPorCobrars().toArray()[this.jTableDatosCuentaPorCobrar.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cuentaporcobrar =(CuentaPorCobrar) this.cuentaporcobrars.toArray()[this.jTableDatosCuentaPorCobrar.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cuentaporcobrar==null) {
						this.cuentaporcobrar = new CuentaPorCobrar();
					}

					this.setVariablesFormularioToObjetoActualCuentaPorCobrar(this.cuentaporcobrar,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCuentaPorCobrar(this.cuentaporcobrar);
				}

				if(this.cuentaporcobrar.getid_transaccion()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_transaccion = "+this.cuentaporcobrar.getid_transaccion().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCuentaPorCobrar(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuentaporcobrarLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuentaporcobrarLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CuentaPorCobrarConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuentaporcobrarLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_tipo_transaccion_moduloCuentaPorCobrarUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentaporcobrarLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisotipotransaccionmodulo=true;

			idTienePermisotipotransaccionmodulo=this.tienePermisosUsuarioEnPaginaWebCuentaPorCobrar(TipoTransaccionModuloConstantesFunciones.CLASSNAME);

			if(idTienePermisotipotransaccionmodulo) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCuentaPorCobrar.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosCuentaPorCobrar.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosCuentaPorCobrar.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuentaporcobrar =(CuentaPorCobrar) this.cuentaporcobrarLogic.getCuentaPorCobrars().toArray()[this.jTableDatosCuentaPorCobrar.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.cuentaporcobrar =(CuentaPorCobrar) this.cuentaporcobrars.toArray()[this.jTableDatosCuentaPorCobrar.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualCuentaPorCobrar(this.getcuentaporcobrar(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysCuentaPorCobrar(this.cuentaporcobrar);

				this.tipotransaccionmoduloBeanSwingJInternalFrame=new TipoTransaccionModuloBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.tipotransaccionmoduloBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.tipotransaccionmoduloBeanSwingJInternalFrame.getTipoTransaccionModuloLogic().setConnexion(this.cuentaporcobrarLogic.getConnexion());

				if(this.cuentaporcobrar.getid_tipo_transaccion_modulo()!=null) {
					this.tipotransaccionmoduloBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.tipotransaccionmoduloBeanSwingJInternalFrame.setIdActual(this.cuentaporcobrar.getid_tipo_transaccion_modulo());
					this.tipotransaccionmoduloBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.tipotransaccionmoduloBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.tipotransaccionmoduloBeanSwingJInternalFrame.inicializarActualizarBindingTablaTipoTransaccionModulo();
				}

				JInternalFrameBase jinternalFrame =this.tipotransaccionmoduloBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderCuentaPorCobrar=(TitledBorder)this.jScrollPanelDatosCuentaPorCobrar.getBorder();
				TitledBorder titledBordertipotransaccionmodulo=(TitledBorder)this.tipotransaccionmoduloBeanSwingJInternalFrame.jScrollPanelDatosTipoTransaccionModulo.getBorder();

				titledBordertipotransaccionmodulo.setTitle(titledBorderCuentaPorCobrar.getTitle() + " -> Tipo Transaccion Modulo");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentaporcobrarLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentaporcobrarLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CuentaPorCobrarConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentaporcobrarLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_tipo_transaccion_moduloCuentaPorCobrarBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuentaporcobrarLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCuentaPorCobrar.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCuentaPorCobrar(this.getcuentaporcobrar(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCuentaPorCobrar(this.cuentaporcobrar);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cuentaporcobrar =(CuentaPorCobrar) this.cuentaporcobrarLogic.getCuentaPorCobrars().toArray()[this.jTableDatosCuentaPorCobrar.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cuentaporcobrar =(CuentaPorCobrar) this.cuentaporcobrars.toArray()[this.jTableDatosCuentaPorCobrar.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cuentaporcobrar==null) {
						this.cuentaporcobrar = new CuentaPorCobrar();
					}

					this.setVariablesFormularioToObjetoActualCuentaPorCobrar(this.cuentaporcobrar,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCuentaPorCobrar(this.cuentaporcobrar);
				}

				if(this.cuentaporcobrar.getid_tipo_transaccion_modulo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_tipo_transaccion_modulo = "+this.cuentaporcobrar.getid_tipo_transaccion_modulo().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCuentaPorCobrar(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuentaporcobrarLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuentaporcobrarLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CuentaPorCobrarConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuentaporcobrarLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_asiento_contableCuentaPorCobrarActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {
			this.asientocontableBeanSwingJInternalFrame=new AsientoContableBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.BUSQUEDA,false,false,false,true);
			this.asientocontableBeanSwingJInternalFrame.setJInternalFrameParent(this);
			this.asientocontableBeanSwingJInternalFrame.sTipoBusqueda="AsientoContable";

			if(!this.sFinalQueryGeneral_asientocontable.equals("")) {
				this.asientocontableBeanSwingJInternalFrame.setsFinalQueryGeneral(this.sFinalQueryGeneral_asientocontable);
				this.asientocontableBeanSwingJInternalFrame.sAccionBusqueda="Query";


				this.asientocontableBeanSwingJInternalFrame.procesarBusqueda(this.asientocontableBeanSwingJInternalFrame.sAccionBusqueda);
				this.asientocontableBeanSwingJInternalFrame.inicializarActualizarBindingAsientoContable(false);
			}

			if(!this.sFinalQueryComboAsientoContable.equals("") && false) {
			}


			JInternalFrameBase jinternalFrame =this.asientocontableBeanSwingJInternalFrame;
			jinternalFrame.setAutoscrolls(true);
			//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
			jinternalFrame.setVisible(true); 


			TitledBorder titledBorderCuentaPorCobrar=null;
			TitledBorder titledBorderasientocontable=null;

			if(!this.jScrollPanelDatosCuentaPorCobrar.getBorder().getClass().equals(EmptyBorder.class)) {
				titledBorderCuentaPorCobrar=(TitledBorder)this.jScrollPanelDatosCuentaPorCobrar.getBorder();
				titledBorderasientocontable=(TitledBorder)this.asientocontableBeanSwingJInternalFrame.jScrollPanelDatosAsientoContable.getBorder();

				titledBorderasientocontable.setTitle(titledBorderCuentaPorCobrar.getTitle() + " -> Asiento Contable");
			}

			if(!Constantes.CON_VARIAS_VENTANAS) {
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
			}

			this.jDesktopPane.add(jinternalFrame);

			jinternalFrame.setSelected(true);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CuentaPorCobrarConstantesFunciones.CLASSNAME);
		}
	}

	public void jButtonid_asiento_contableCuentaPorCobrarUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentaporcobrarLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoasientocontable=true;

			idTienePermisoasientocontable=this.tienePermisosUsuarioEnPaginaWebCuentaPorCobrar(AsientoContableConstantesFunciones.CLASSNAME);

			if(idTienePermisoasientocontable) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCuentaPorCobrar.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosCuentaPorCobrar.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosCuentaPorCobrar.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuentaporcobrar =(CuentaPorCobrar) this.cuentaporcobrarLogic.getCuentaPorCobrars().toArray()[this.jTableDatosCuentaPorCobrar.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.cuentaporcobrar =(CuentaPorCobrar) this.cuentaporcobrars.toArray()[this.jTableDatosCuentaPorCobrar.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualCuentaPorCobrar(this.getcuentaporcobrar(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysCuentaPorCobrar(this.cuentaporcobrar);

				this.asientocontableBeanSwingJInternalFrame=new AsientoContableBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.asientocontableBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.asientocontableBeanSwingJInternalFrame.getAsientoContableLogic().setConnexion(this.cuentaporcobrarLogic.getConnexion());

				if(this.cuentaporcobrar.getid_asiento_contable()!=null) {
					this.asientocontableBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.asientocontableBeanSwingJInternalFrame.setIdActual(this.cuentaporcobrar.getid_asiento_contable());
					this.asientocontableBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.asientocontableBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.asientocontableBeanSwingJInternalFrame.inicializarActualizarBindingTablaAsientoContable();
				}

				JInternalFrameBase jinternalFrame =this.asientocontableBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderCuentaPorCobrar=(TitledBorder)this.jScrollPanelDatosCuentaPorCobrar.getBorder();
				TitledBorder titledBorderasientocontable=(TitledBorder)this.asientocontableBeanSwingJInternalFrame.jScrollPanelDatosAsientoContable.getBorder();

				titledBorderasientocontable.setTitle(titledBorderCuentaPorCobrar.getTitle() + " -> Asiento Contable");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentaporcobrarLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentaporcobrarLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CuentaPorCobrarConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentaporcobrarLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_asiento_contableCuentaPorCobrarBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuentaporcobrarLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCuentaPorCobrar.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCuentaPorCobrar(this.getcuentaporcobrar(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCuentaPorCobrar(this.cuentaporcobrar);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cuentaporcobrar =(CuentaPorCobrar) this.cuentaporcobrarLogic.getCuentaPorCobrars().toArray()[this.jTableDatosCuentaPorCobrar.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cuentaporcobrar =(CuentaPorCobrar) this.cuentaporcobrars.toArray()[this.jTableDatosCuentaPorCobrar.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cuentaporcobrar==null) {
						this.cuentaporcobrar = new CuentaPorCobrar();
					}

					this.setVariablesFormularioToObjetoActualCuentaPorCobrar(this.cuentaporcobrar,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCuentaPorCobrar(this.cuentaporcobrar);
				}

				if(this.cuentaporcobrar.getid_asiento_contable()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_asiento_contable = "+this.cuentaporcobrar.getid_asiento_contable().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCuentaPorCobrar(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuentaporcobrarLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuentaporcobrarLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CuentaPorCobrarConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuentaporcobrarLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_facturaCuentaPorCobrarActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
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


			TitledBorder titledBorderCuentaPorCobrar=null;
			TitledBorder titledBorderfactura=null;

			if(!this.jScrollPanelDatosCuentaPorCobrar.getBorder().getClass().equals(EmptyBorder.class)) {
				titledBorderCuentaPorCobrar=(TitledBorder)this.jScrollPanelDatosCuentaPorCobrar.getBorder();
				titledBorderfactura=(TitledBorder)this.facturaBeanSwingJInternalFrame.jScrollPanelDatosFactura.getBorder();

				titledBorderfactura.setTitle(titledBorderCuentaPorCobrar.getTitle() + " -> Factura");
			}

			if(!Constantes.CON_VARIAS_VENTANAS) {
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
			}

			this.jDesktopPane.add(jinternalFrame);

			jinternalFrame.setSelected(true);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CuentaPorCobrarConstantesFunciones.CLASSNAME);
		}
	}

	public void jButtonid_facturaCuentaPorCobrarUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentaporcobrarLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisofactura=true;

			idTienePermisofactura=this.tienePermisosUsuarioEnPaginaWebCuentaPorCobrar(FacturaConstantesFunciones.CLASSNAME);

			if(idTienePermisofactura) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCuentaPorCobrar.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosCuentaPorCobrar.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosCuentaPorCobrar.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuentaporcobrar =(CuentaPorCobrar) this.cuentaporcobrarLogic.getCuentaPorCobrars().toArray()[this.jTableDatosCuentaPorCobrar.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.cuentaporcobrar =(CuentaPorCobrar) this.cuentaporcobrars.toArray()[this.jTableDatosCuentaPorCobrar.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualCuentaPorCobrar(this.getcuentaporcobrar(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysCuentaPorCobrar(this.cuentaporcobrar);

				this.facturaBeanSwingJInternalFrame=new FacturaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.facturaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.facturaBeanSwingJInternalFrame.getFacturaLogic().setConnexion(this.cuentaporcobrarLogic.getConnexion());

				if(this.cuentaporcobrar.getid_factura()!=null) {
					this.facturaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.facturaBeanSwingJInternalFrame.setIdActual(this.cuentaporcobrar.getid_factura());
					this.facturaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.facturaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.facturaBeanSwingJInternalFrame.inicializarActualizarBindingTablaFactura();
				}

				JInternalFrameBase jinternalFrame =this.facturaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderCuentaPorCobrar=(TitledBorder)this.jScrollPanelDatosCuentaPorCobrar.getBorder();
				TitledBorder titledBorderfactura=(TitledBorder)this.facturaBeanSwingJInternalFrame.jScrollPanelDatosFactura.getBorder();

				titledBorderfactura.setTitle(titledBorderCuentaPorCobrar.getTitle() + " -> Factura");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentaporcobrarLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentaporcobrarLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CuentaPorCobrarConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentaporcobrarLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_facturaCuentaPorCobrarBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuentaporcobrarLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCuentaPorCobrar.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCuentaPorCobrar(this.getcuentaporcobrar(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCuentaPorCobrar(this.cuentaporcobrar);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cuentaporcobrar =(CuentaPorCobrar) this.cuentaporcobrarLogic.getCuentaPorCobrars().toArray()[this.jTableDatosCuentaPorCobrar.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cuentaporcobrar =(CuentaPorCobrar) this.cuentaporcobrars.toArray()[this.jTableDatosCuentaPorCobrar.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cuentaporcobrar==null) {
						this.cuentaporcobrar = new CuentaPorCobrar();
					}

					this.setVariablesFormularioToObjetoActualCuentaPorCobrar(this.cuentaporcobrar,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCuentaPorCobrar(this.cuentaporcobrar);
				}

				if(this.cuentaporcobrar.getid_factura()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_factura = "+this.cuentaporcobrar.getid_factura().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCuentaPorCobrar(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuentaporcobrarLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuentaporcobrarLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CuentaPorCobrarConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuentaporcobrarLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfechaCuentaPorCobrarBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuentaporcobrarLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCuentaPorCobrar.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCuentaPorCobrar(this.getcuentaporcobrar(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCuentaPorCobrar(this.cuentaporcobrar);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cuentaporcobrar =(CuentaPorCobrar) this.cuentaporcobrarLogic.getCuentaPorCobrars().toArray()[this.jTableDatosCuentaPorCobrar.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cuentaporcobrar =(CuentaPorCobrar) this.cuentaporcobrars.toArray()[this.jTableDatosCuentaPorCobrar.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cuentaporcobrar==null) {
						this.cuentaporcobrar = new CuentaPorCobrar();
					}

					this.setVariablesFormularioToObjetoActualCuentaPorCobrar(this.cuentaporcobrar,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCuentaPorCobrar(this.cuentaporcobrar);
				}

				if(this.cuentaporcobrar.getfecha()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha = '"+Funciones2.getStringPostgresDate(this.cuentaporcobrar.getfecha())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCuentaPorCobrar(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuentaporcobrarLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuentaporcobrarLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CuentaPorCobrarConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuentaporcobrarLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonmontoCuentaPorCobrarBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuentaporcobrarLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCuentaPorCobrar.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCuentaPorCobrar(this.getcuentaporcobrar(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCuentaPorCobrar(this.cuentaporcobrar);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cuentaporcobrar =(CuentaPorCobrar) this.cuentaporcobrarLogic.getCuentaPorCobrars().toArray()[this.jTableDatosCuentaPorCobrar.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cuentaporcobrar =(CuentaPorCobrar) this.cuentaporcobrars.toArray()[this.jTableDatosCuentaPorCobrar.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cuentaporcobrar==null) {
						this.cuentaporcobrar = new CuentaPorCobrar();
					}

					this.setVariablesFormularioToObjetoActualCuentaPorCobrar(this.cuentaporcobrar,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCuentaPorCobrar(this.cuentaporcobrar);
				}

				if(this.cuentaporcobrar.getmonto()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where monto = "+this.cuentaporcobrar.getmonto().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCuentaPorCobrar(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuentaporcobrarLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuentaporcobrarLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CuentaPorCobrarConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuentaporcobrarLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnumero_comprobanteCuentaPorCobrarBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuentaporcobrarLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCuentaPorCobrar.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCuentaPorCobrar(this.getcuentaporcobrar(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCuentaPorCobrar(this.cuentaporcobrar);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cuentaporcobrar =(CuentaPorCobrar) this.cuentaporcobrarLogic.getCuentaPorCobrars().toArray()[this.jTableDatosCuentaPorCobrar.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cuentaporcobrar =(CuentaPorCobrar) this.cuentaporcobrars.toArray()[this.jTableDatosCuentaPorCobrar.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cuentaporcobrar==null) {
						this.cuentaporcobrar = new CuentaPorCobrar();
					}

					this.setVariablesFormularioToObjetoActualCuentaPorCobrar(this.cuentaporcobrar,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCuentaPorCobrar(this.cuentaporcobrar);
				}

				if(this.cuentaporcobrar.getnumero_comprobante()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where numero_comprobante like '%"+this.cuentaporcobrar.getnumero_comprobante()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCuentaPorCobrar(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuentaporcobrarLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuentaporcobrarLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CuentaPorCobrarConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuentaporcobrarLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtondebitoCuentaPorCobrarBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuentaporcobrarLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCuentaPorCobrar.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCuentaPorCobrar(this.getcuentaporcobrar(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCuentaPorCobrar(this.cuentaporcobrar);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cuentaporcobrar =(CuentaPorCobrar) this.cuentaporcobrarLogic.getCuentaPorCobrars().toArray()[this.jTableDatosCuentaPorCobrar.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cuentaporcobrar =(CuentaPorCobrar) this.cuentaporcobrars.toArray()[this.jTableDatosCuentaPorCobrar.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cuentaporcobrar==null) {
						this.cuentaporcobrar = new CuentaPorCobrar();
					}

					this.setVariablesFormularioToObjetoActualCuentaPorCobrar(this.cuentaporcobrar,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCuentaPorCobrar(this.cuentaporcobrar);
				}

				if(this.cuentaporcobrar.getdebito()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where debito = "+this.cuentaporcobrar.getdebito().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCuentaPorCobrar(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuentaporcobrarLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuentaporcobrarLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CuentaPorCobrarConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuentaporcobrarLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncreditoCuentaPorCobrarBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuentaporcobrarLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCuentaPorCobrar.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCuentaPorCobrar(this.getcuentaporcobrar(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCuentaPorCobrar(this.cuentaporcobrar);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cuentaporcobrar =(CuentaPorCobrar) this.cuentaporcobrarLogic.getCuentaPorCobrars().toArray()[this.jTableDatosCuentaPorCobrar.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cuentaporcobrar =(CuentaPorCobrar) this.cuentaporcobrars.toArray()[this.jTableDatosCuentaPorCobrar.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cuentaporcobrar==null) {
						this.cuentaporcobrar = new CuentaPorCobrar();
					}

					this.setVariablesFormularioToObjetoActualCuentaPorCobrar(this.cuentaporcobrar,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCuentaPorCobrar(this.cuentaporcobrar);
				}

				if(this.cuentaporcobrar.getcredito()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where credito = "+this.cuentaporcobrar.getcredito().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCuentaPorCobrar(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuentaporcobrarLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuentaporcobrarLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CuentaPorCobrarConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuentaporcobrarLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtondetalleCuentaPorCobrarBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuentaporcobrarLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCuentaPorCobrar.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCuentaPorCobrar(this.getcuentaporcobrar(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCuentaPorCobrar(this.cuentaporcobrar);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cuentaporcobrar =(CuentaPorCobrar) this.cuentaporcobrarLogic.getCuentaPorCobrars().toArray()[this.jTableDatosCuentaPorCobrar.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cuentaporcobrar =(CuentaPorCobrar) this.cuentaporcobrars.toArray()[this.jTableDatosCuentaPorCobrar.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cuentaporcobrar==null) {
						this.cuentaporcobrar = new CuentaPorCobrar();
					}

					this.setVariablesFormularioToObjetoActualCuentaPorCobrar(this.cuentaporcobrar,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCuentaPorCobrar(this.cuentaporcobrar);
				}

				if(this.cuentaporcobrar.getdetalle()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where detalle like '%"+this.cuentaporcobrar.getdetalle()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCuentaPorCobrar(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuentaporcobrarLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuentaporcobrarLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CuentaPorCobrarConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuentaporcobrarLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdAsientoContableCuentaPorCobrarActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentaporcobrarLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingCuentaPorCobrar(false,false);

			this.getCuentaPorCobrarsFK_IdAsientoContable();

			this.inicializarActualizarBindingCuentaPorCobrar(false);

			//if(CuentaPorCobrarBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingCuentaPorCobrar(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentaporcobrarLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentaporcobrarLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CuentaPorCobrarConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentaporcobrarLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdClienteCuentaPorCobrarActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentaporcobrarLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingCuentaPorCobrar(false,false);

			this.getCuentaPorCobrarsFK_IdCliente();

			this.inicializarActualizarBindingCuentaPorCobrar(false);

			//if(CuentaPorCobrarBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingCuentaPorCobrar(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentaporcobrarLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentaporcobrarLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CuentaPorCobrarConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentaporcobrarLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEjercicioCuentaPorCobrarActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentaporcobrarLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingCuentaPorCobrar(false,false);

			this.getCuentaPorCobrarsFK_IdEjercicio();

			this.inicializarActualizarBindingCuentaPorCobrar(false);

			//if(CuentaPorCobrarBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingCuentaPorCobrar(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentaporcobrarLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentaporcobrarLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CuentaPorCobrarConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentaporcobrarLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaCuentaPorCobrarActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentaporcobrarLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingCuentaPorCobrar(false,false);

			this.getCuentaPorCobrarsFK_IdEmpresa();

			this.inicializarActualizarBindingCuentaPorCobrar(false);

			//if(CuentaPorCobrarBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingCuentaPorCobrar(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentaporcobrarLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentaporcobrarLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CuentaPorCobrarConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentaporcobrarLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdFacturaCuentaPorCobrarActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentaporcobrarLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingCuentaPorCobrar(false,false);

			this.getCuentaPorCobrarsFK_IdFactura();

			this.inicializarActualizarBindingCuentaPorCobrar(false);

			//if(CuentaPorCobrarBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingCuentaPorCobrar(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentaporcobrarLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentaporcobrarLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CuentaPorCobrarConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentaporcobrarLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdModuloCuentaPorCobrarActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentaporcobrarLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingCuentaPorCobrar(false,false);

			this.getCuentaPorCobrarsFK_IdModulo();

			this.inicializarActualizarBindingCuentaPorCobrar(false);

			//if(CuentaPorCobrarBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingCuentaPorCobrar(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentaporcobrarLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentaporcobrarLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CuentaPorCobrarConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentaporcobrarLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdMonedaCuentaPorCobrarActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentaporcobrarLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingCuentaPorCobrar(false,false);

			this.getCuentaPorCobrarsFK_IdMoneda();

			this.inicializarActualizarBindingCuentaPorCobrar(false);

			//if(CuentaPorCobrarBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingCuentaPorCobrar(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentaporcobrarLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentaporcobrarLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CuentaPorCobrarConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentaporcobrarLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdSucursalCuentaPorCobrarActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentaporcobrarLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingCuentaPorCobrar(false,false);

			this.getCuentaPorCobrarsFK_IdSucursal();

			this.inicializarActualizarBindingCuentaPorCobrar(false);

			//if(CuentaPorCobrarBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingCuentaPorCobrar(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentaporcobrarLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentaporcobrarLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CuentaPorCobrarConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentaporcobrarLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdTipoTransaccionModuloCuentaPorCobrarActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentaporcobrarLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingCuentaPorCobrar(false,false);

			this.getCuentaPorCobrarsFK_IdTipoTransaccionModulo();

			this.inicializarActualizarBindingCuentaPorCobrar(false);

			//if(CuentaPorCobrarBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingCuentaPorCobrar(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentaporcobrarLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentaporcobrarLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CuentaPorCobrarConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentaporcobrarLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdTransaccionCuentaPorCobrarActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentaporcobrarLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingCuentaPorCobrar(false,false);

			this.getCuentaPorCobrarsFK_IdTransaccion();

			this.inicializarActualizarBindingCuentaPorCobrar(false);

			//if(CuentaPorCobrarBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingCuentaPorCobrar(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentaporcobrarLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentaporcobrarLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CuentaPorCobrarConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentaporcobrarLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameCuentaPorCobrar() {
		if(this.jInternalFrameDetalleFormCuentaPorCobrar!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormCuentaPorCobrar!=null) {
			this.jInternalFrameDetalleFormCuentaPorCobrar.setVisible(false);	    			
			this.jInternalFrameDetalleFormCuentaPorCobrar.dispose();
			this.jInternalFrameDetalleFormCuentaPorCobrar=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoCuentaPorCobrar!=null) {
			this.jInternalFrameReporteDinamicoCuentaPorCobrar.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoCuentaPorCobrar.dispose();
			this.jInternalFrameReporteDinamicoCuentaPorCobrar=null;
		}
		
		if(this.jInternalFrameImportacionCuentaPorCobrar!=null) {
			this.jInternalFrameImportacionCuentaPorCobrar.setVisible(false);	    			
			this.jInternalFrameImportacionCuentaPorCobrar.dispose();
			this.jInternalFrameImportacionCuentaPorCobrar=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessCuentaPorCobrar();
			
			CuentaPorCobrarBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cuentaporcobrar,new Object(),this.cuentaporcobrarParameterGeneral,this.cuentaporcobrarReturnGeneral);
			
			
			if(sTipo.equals("NuevoCuentaPorCobrar")) {
				jButtonNuevoCuentaPorCobrarActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarCuentaPorCobrar")) {
				jButtonDuplicarCuentaPorCobrarActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarCuentaPorCobrar")) {
				jButtonCopiarCuentaPorCobrarActionPerformed(evt);
			} else if(sTipo.equals("VerFormCuentaPorCobrar")) {
				jButtonVerFormCuentaPorCobrarActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarCuentaPorCobrar")) {
				jButtonNuevoCuentaPorCobrarActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarCuentaPorCobrar")) {
				jButtonDuplicarCuentaPorCobrarActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoCuentaPorCobrar")) {
				jButtonNuevoCuentaPorCobrarActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarCuentaPorCobrar")) {
				jButtonDuplicarCuentaPorCobrarActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesCuentaPorCobrar")) {
				jButtonNuevoCuentaPorCobrarActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarCuentaPorCobrar")) {
				jButtonNuevoCuentaPorCobrarActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesCuentaPorCobrar")) {
				jButtonNuevoCuentaPorCobrarActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarCuentaPorCobrar")) {
				jButtonModificarCuentaPorCobrarActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarCuentaPorCobrar")) {
				jButtonModificarCuentaPorCobrarActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarCuentaPorCobrar")) {
				jButtonModificarCuentaPorCobrarActionPerformed(evt);
			} else if(sTipo.equals("ActualizarCuentaPorCobrar")) {
				jButtonActualizarCuentaPorCobrarActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarCuentaPorCobrar")) {
				jButtonActualizarCuentaPorCobrarActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarCuentaPorCobrar")) {
				jButtonActualizarCuentaPorCobrarActionPerformed(evt);
			} else if(sTipo.equals("EliminarCuentaPorCobrar")) {
				jButtonEliminarCuentaPorCobrarActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarCuentaPorCobrar")) {
				jButtonEliminarCuentaPorCobrarActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarCuentaPorCobrar")) {
				jButtonEliminarCuentaPorCobrarActionPerformed(evt);
			} else if(sTipo.equals("CancelarCuentaPorCobrar")) {
				jButtonCancelarCuentaPorCobrarActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarCuentaPorCobrar")) {
				jButtonCancelarCuentaPorCobrarActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarCuentaPorCobrar")) {
				jButtonCancelarCuentaPorCobrarActionPerformed(evt);
			} else if(sTipo.equals("CerrarCuentaPorCobrar")) {
				jButtonCerrarCuentaPorCobrarActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarCuentaPorCobrar")) {
				jButtonCerrarCuentaPorCobrarActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarCuentaPorCobrar")) {
				jButtonCerrarCuentaPorCobrarActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarCuentaPorCobrar")) {
				jButtonMostrarOcultarCuentaPorCobrarActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarCuentaPorCobrar")) {
				jButtonCancelarCuentaPorCobrarActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosCuentaPorCobrar")) {
				jButtonGuardarCambiosCuentaPorCobrarActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarCuentaPorCobrar")) {
				jButtonGuardarCambiosCuentaPorCobrarActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarCuentaPorCobrar")) {
				jButtonCopiarCuentaPorCobrarActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarCuentaPorCobrar")) {
				jButtonVerFormCuentaPorCobrarActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosCuentaPorCobrar")) {
				jButtonGuardarCambiosCuentaPorCobrarActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarCuentaPorCobrar")) {
				jButtonCopiarCuentaPorCobrarActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormCuentaPorCobrar")) {
				jButtonVerFormCuentaPorCobrarActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaCuentaPorCobrar")) {
				jButtonGuardarCambiosCuentaPorCobrarActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarCuentaPorCobrar")) {
				jButtonGuardarCambiosCuentaPorCobrarActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaCuentaPorCobrar")) {
				jButtonGuardarCambiosCuentaPorCobrarActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionCuentaPorCobrar")) {
				jButtonRecargarInformacionCuentaPorCobrarActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarCuentaPorCobrar")) {
				jButtonRecargarInformacionCuentaPorCobrarActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionCuentaPorCobrar")) {
				jButtonRecargarInformacionCuentaPorCobrarActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresCuentaPorCobrar")) {
				jButtonAnterioresCuentaPorCobrarActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarCuentaPorCobrar")) {
				jButtonAnterioresCuentaPorCobrarActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreCuentaPorCobrar")) {
				jButtonAnterioresCuentaPorCobrarActionPerformed(evt);
			} else if(sTipo.equals("SiguientesCuentaPorCobrar")) {
				jButtonSiguientesCuentaPorCobrarActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarCuentaPorCobrar")) {
				jButtonSiguientesCuentaPorCobrarActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesCuentaPorCobrar")) {
				jButtonSiguientesCuentaPorCobrarActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByCuentaPorCobrar") || sTipo.equals("MenuItemDetalleAbrirOrderByCuentaPorCobrar")) {
				jButtonAbrirOrderByCuentaPorCobrarActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarCuentaPorCobrar") || sTipo.equals("MenuItemDetalleMostrarOcultarCuentaPorCobrar")) {
				jButtonMostrarOcultarCuentaPorCobrarActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosCuentaPorCobrar")) {
				jButtonNuevoGuardarCambiosCuentaPorCobrarActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarCuentaPorCobrar")) {
				jButtonNuevoGuardarCambiosCuentaPorCobrarActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosCuentaPorCobrar")) {
				jButtonNuevoGuardarCambiosCuentaPorCobrarActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoCuentaPorCobrar")) {
				jButtonCerrarReporteDinamicoCuentaPorCobrarActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoCuentaPorCobrar")) {
				jButtonGenerarReporteDinamicoCuentaPorCobrarActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoCuentaPorCobrar")) {
				
				jButtonGenerarExcelReporteDinamicoCuentaPorCobrarActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionCuentaPorCobrar")) {
				jButtonCerrarImportacionCuentaPorCobrarActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionCuentaPorCobrar")) {
				
				jButtonGenerarImportacionCuentaPorCobrarActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionCuentaPorCobrar")) {
				
				jButtonAbrirImportacionCuentaPorCobrarActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesCuentaPorCobrar")) {
				jComboBoxTiposAccionesCuentaPorCobrarActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesCuentaPorCobrar")) {
				jComboBoxTiposRelacionesCuentaPorCobrarActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioCuentaPorCobrar")) {
				jComboBoxTiposAccionesCuentaPorCobrarActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarCuentaPorCobrar")) {
				
				jComboBoxTiposSeleccionarCuentaPorCobrarActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralCuentaPorCobrar")) {
				jTextFieldValorCampoGeneralCuentaPorCobrarActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByCuentaPorCobrar")) {
				jButtonAbrirOrderByCuentaPorCobrarActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarCuentaPorCobrar")) {
				jButtonAbrirOrderByCuentaPorCobrarActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByCuentaPorCobrar")) {
				jButtonCerrarOrderByCuentaPorCobrarActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idCuentaPorCobrarBusqueda")) {
				this.jButtonidCuentaPorCobrarBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaCuentaPorCobrarUpdate")) {
				this.jButtonid_empresaCuentaPorCobrarUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaCuentaPorCobrarBusqueda")) {
				this.jButtonid_empresaCuentaPorCobrarBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalCuentaPorCobrarUpdate")) {
				this.jButtonid_sucursalCuentaPorCobrarUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalCuentaPorCobrarBusqueda")) {
				this.jButtonid_sucursalCuentaPorCobrarBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_moduloCuentaPorCobrarUpdate")) {
				this.jButtonid_moduloCuentaPorCobrarUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_moduloCuentaPorCobrarBusqueda")) {
				this.jButtonid_moduloCuentaPorCobrarBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_ejercicioCuentaPorCobrarUpdate")) {
				this.jButtonid_ejercicioCuentaPorCobrarUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_ejercicioCuentaPorCobrarBusqueda")) {
				this.jButtonid_ejercicioCuentaPorCobrarBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_monedaCuentaPorCobrarUpdate")) {
				this.jButtonid_monedaCuentaPorCobrarUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_monedaCuentaPorCobrarBusqueda")) {
				this.jButtonid_monedaCuentaPorCobrarBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_clienteCuentaPorCobrar")) {
				this.jButtonid_clienteCuentaPorCobrarActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_clienteCuentaPorCobrarUpdate")) {
				this.jButtonid_clienteCuentaPorCobrarUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_clienteCuentaPorCobrarBusqueda")) {
				this.jButtonid_clienteCuentaPorCobrarBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_transaccionCuentaPorCobrarUpdate")) {
				this.jButtonid_transaccionCuentaPorCobrarUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_transaccionCuentaPorCobrarBusqueda")) {
				this.jButtonid_transaccionCuentaPorCobrarBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_transaccion_moduloCuentaPorCobrarUpdate")) {
				this.jButtonid_tipo_transaccion_moduloCuentaPorCobrarUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_transaccion_moduloCuentaPorCobrarBusqueda")) {
				this.jButtonid_tipo_transaccion_moduloCuentaPorCobrarBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_asiento_contableCuentaPorCobrar")) {
				this.jButtonid_asiento_contableCuentaPorCobrarActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_asiento_contableCuentaPorCobrarUpdate")) {
				this.jButtonid_asiento_contableCuentaPorCobrarUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_asiento_contableCuentaPorCobrarBusqueda")) {
				this.jButtonid_asiento_contableCuentaPorCobrarBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_facturaCuentaPorCobrar")) {
				this.jButtonid_facturaCuentaPorCobrarActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_facturaCuentaPorCobrarUpdate")) {
				this.jButtonid_facturaCuentaPorCobrarUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_facturaCuentaPorCobrarBusqueda")) {
				this.jButtonid_facturaCuentaPorCobrarBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fechaCuentaPorCobrarBusqueda")) {
				this.jButtonfechaCuentaPorCobrarBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("montoCuentaPorCobrarBusqueda")) {
				this.jButtonmontoCuentaPorCobrarBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_comprobanteCuentaPorCobrarBusqueda")) {
				this.jButtonnumero_comprobanteCuentaPorCobrarBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("debitoCuentaPorCobrarBusqueda")) {
				this.jButtondebitoCuentaPorCobrarBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("creditoCuentaPorCobrarBusqueda")) {
				this.jButtoncreditoCuentaPorCobrarBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("detalleCuentaPorCobrarBusqueda")) {
				this.jButtondetalleCuentaPorCobrarBusquedaActionPerformed(evt);
			}
			
			
			else if(sTipo.equals("id_asiento_contableCuentaPorCobrar")) {
				this.jButtonid_asiento_contableCuentaPorCobrarActionPerformed(evt);
			}
			else if(sTipo.equals("id_clienteCuentaPorCobrar")) {
				this.jButtonid_clienteCuentaPorCobrarActionPerformed(evt);
			}
			else if(sTipo.equals("id_facturaCuentaPorCobrar")) {
				this.jButtonid_facturaCuentaPorCobrarActionPerformed(evt);
			}
			
			
			else if(sTipo.equals("FK_IdAsientoContableCuentaPorCobrar")) {
				this.jButtonFK_IdAsientoContableCuentaPorCobrarActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdClienteCuentaPorCobrar")) {
				this.jButtonFK_IdClienteCuentaPorCobrarActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdFacturaCuentaPorCobrar")) {
				this.jButtonFK_IdFacturaCuentaPorCobrarActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdTipoTransaccionModuloCuentaPorCobrar")) {
				this.jButtonFK_IdTipoTransaccionModuloCuentaPorCobrarActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdTransaccionCuentaPorCobrar")) {
				this.jButtonFK_IdTransaccionCuentaPorCobrarActionPerformed(evt);
			}
			
			;
			
			
			CuentaPorCobrarBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cuentaporcobrar,new Object(),this.cuentaporcobrarParameterGeneral,this.cuentaporcobrarReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CuentaPorCobrarConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessCuentaPorCobrar();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCuentaPorCobrarActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cuentaporcobrar);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cuentaporcobrar);
				
				CuentaPorCobrarBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cuentaporcobrar,new Object(),this.cuentaporcobrarParameterGeneral,this.cuentaporcobrarReturnGeneral);
				
				


				
				CuentaPorCobrarBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cuentaporcobrar,new Object(),this.cuentaporcobrarParameterGeneral,this.cuentaporcobrarReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CuentaPorCobrar.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CuentaPorCobrar.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,CuentaPorCobrarConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			CuentaPorCobrar cuentaporcobrarLocal=null;
			
			if(!this.getEsControlTabla()) {
				cuentaporcobrarLocal=this.cuentaporcobrar;
			} else {
				cuentaporcobrarLocal=this.cuentaporcobrarAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CuentaPorCobrarConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cuentaporcobrar);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cuentaporcobrar);
				
				CuentaPorCobrarBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cuentaporcobrar,new Object(),this.cuentaporcobrarParameterGeneral,this.cuentaporcobrarReturnGeneral);
							
				
				


				
				CuentaPorCobrarBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cuentaporcobrar,new Object(),this.cuentaporcobrarParameterGeneral,this.cuentaporcobrarReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CuentaPorCobrar.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CuentaPorCobrar.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CuentaPorCobrarConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCuentaPorCobrarActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosCuentaPorCobrar.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuentaporcobrarAnterior =(CuentaPorCobrar) this.cuentaporcobrarLogic.getCuentaPorCobrars().toArray()[this.jTableDatosCuentaPorCobrar.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.cuentaporcobrarAnterior =(CuentaPorCobrar) this.cuentaporcobrars.toArray()[this.jTableDatosCuentaPorCobrar.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CuentaPorCobrarConstantesFunciones.CLASSNAME);
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
			
			CuentaPorCobrarBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cuentaporcobrar,new Object(),this.cuentaporcobrarParameterGeneral,this.cuentaporcobrarReturnGeneral);
			
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
			
			


			
			CuentaPorCobrarBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cuentaporcobrar,new Object(),this.cuentaporcobrarParameterGeneral,this.cuentaporcobrarReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CuentaPorCobrarConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CuentaPorCobrarConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CuentaPorCobrarConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCuentaPorCobrarActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cuentaporcobrar);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cuentaporcobrar);
				
				CuentaPorCobrarBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cuentaporcobrar,new Object(),this.cuentaporcobrarParameterGeneral,this.cuentaporcobrarReturnGeneral);
								
						
				


				
				CuentaPorCobrarBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cuentaporcobrar,new Object(),this.cuentaporcobrarParameterGeneral,this.cuentaporcobrarReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CuentaPorCobrar.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CuentaPorCobrar.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CuentaPorCobrarConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cuentaporcobrar);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cuentaporcobrar);
				
				CuentaPorCobrarBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cuentaporcobrar,new Object(),this.cuentaporcobrarParameterGeneral,this.cuentaporcobrarReturnGeneral);
								
				
				


				
				CuentaPorCobrarBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cuentaporcobrar,new Object(),this.cuentaporcobrarParameterGeneral,this.cuentaporcobrarReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CuentaPorCobrar.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CuentaPorCobrar.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CuentaPorCobrarConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCuentaPorCobrarActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosCuentaPorCobrar.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuentaporcobrarAnterior =(CuentaPorCobrar) this.cuentaporcobrarLogic.getCuentaPorCobrars().toArray()[this.jTableDatosCuentaPorCobrar.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.cuentaporcobrarAnterior =(CuentaPorCobrar) this.cuentaporcobrars.toArray()[this.jTableDatosCuentaPorCobrar.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CuentaPorCobrarConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cuentaporcobrar);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cuentaporcobrar);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CuentaPorCobrarConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCuentaPorCobrarActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosCuentaPorCobrar.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuentaporcobrarAnterior =(CuentaPorCobrar) this.cuentaporcobrarLogic.getCuentaPorCobrars().toArray()[this.jTableDatosCuentaPorCobrar.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.cuentaporcobrarAnterior =(CuentaPorCobrar) this.cuentaporcobrars.toArray()[this.jTableDatosCuentaPorCobrar.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CuentaPorCobrarConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCuentaPorCobrarActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.cuentaporcobrar);
			
			this.actualizarInformacion("INFO_PADRE",false,this.cuentaporcobrar);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CuentaPorCobrarConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cuentaporcobrar);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cuentaporcobrar);
				
				CuentaPorCobrarBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cuentaporcobrar,new Object(),this.cuentaporcobrarParameterGeneral,this.cuentaporcobrarReturnGeneral);
							
				
				


				
				CuentaPorCobrarBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cuentaporcobrar,new Object(),this.cuentaporcobrarParameterGeneral,this.cuentaporcobrarReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CuentaPorCobrar.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CuentaPorCobrar.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CuentaPorCobrarConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCuentaPorCobrarActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosCuentaPorCobrar.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cuentaporcobrarAnterior =(CuentaPorCobrar) this.cuentaporcobrarLogic.getCuentaPorCobrars().toArray()[this.jTableDatosCuentaPorCobrar.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.cuentaporcobrarAnterior =(CuentaPorCobrar) this.cuentaporcobrars.toArray()[this.jTableDatosCuentaPorCobrar.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CuentaPorCobrarConstantesFunciones.CLASSNAME);
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
			
			CuentaPorCobrarBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cuentaporcobrar,new Object(),this.cuentaporcobrarParameterGeneral,this.cuentaporcobrarReturnGeneral);
			
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
			
			


			
			CuentaPorCobrarBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cuentaporcobrar,new Object(),this.cuentaporcobrarParameterGeneral,this.cuentaporcobrarReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CuentaPorCobrarConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CuentaPorCobrarConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CuentaPorCobrarConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCuentaPorCobrarActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.cuentaporcobrar);
			
			this.actualizarInformacion("INFO_PADRE",false,this.cuentaporcobrar);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CuentaPorCobrarConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cuentaporcobrar);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cuentaporcobrar);
				
				CuentaPorCobrarBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cuentaporcobrar,new Object(),this.cuentaporcobrarParameterGeneral,this.cuentaporcobrarReturnGeneral);
								
				
				


				
				CuentaPorCobrarBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cuentaporcobrar,new Object(),this.cuentaporcobrarParameterGeneral,this.cuentaporcobrarReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CuentaPorCobrar.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CuentaPorCobrar.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CuentaPorCobrarConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCuentaPorCobrarActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosCuentaPorCobrar.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuentaporcobrarAnterior =(CuentaPorCobrar) this.cuentaporcobrarLogic.getCuentaPorCobrars().toArray()[this.jTableDatosCuentaPorCobrar.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.cuentaporcobrarAnterior =(CuentaPorCobrar) this.cuentaporcobrars.toArray()[this.jTableDatosCuentaPorCobrar.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CuentaPorCobrarConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCuentaPorCobrarActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.cuentaporcobrar);
			
			this.actualizarInformacion("INFO_PADRE",false,this.cuentaporcobrar);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CuentaPorCobrarConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCuentaPorCobrarActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cuentaporcobrar);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cuentaporcobrar);
				
				CuentaPorCobrarBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cuentaporcobrar,new Object(),this.cuentaporcobrarParameterGeneral,this.cuentaporcobrarReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosCuentaPorCobrar")) {
					jCheckBoxSeleccionarTodosCuentaPorCobrarItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosCuentaPorCobrar")) {
					jCheckBoxSeleccionadosCuentaPorCobrarItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarCuentaPorCobrar")) {
					
				}
				
				


				
				
				CuentaPorCobrarBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cuentaporcobrar,new Object(),this.cuentaporcobrarParameterGeneral,this.cuentaporcobrarReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CuentaPorCobrar.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CuentaPorCobrar.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CuentaPorCobrarConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.cuentaporcobrar);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.cuentaporcobrar);
				
				CuentaPorCobrarBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cuentaporcobrar,new Object(),this.cuentaporcobrarParameterGeneral,this.cuentaporcobrarReturnGeneral);
												
				
				


				
				
				CuentaPorCobrarBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cuentaporcobrar,new Object(),this.cuentaporcobrarParameterGeneral,this.cuentaporcobrarReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CuentaPorCobrar.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CuentaPorCobrar.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CuentaPorCobrarConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCuentaPorCobrarActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosCuentaPorCobrar.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cuentaporcobrarAnterior =(CuentaPorCobrar) this.cuentaporcobrarLogic.getCuentaPorCobrars().toArray()[this.jTableDatosCuentaPorCobrar.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.cuentaporcobrarAnterior =(CuentaPorCobrar) this.cuentaporcobrars.toArray()[this.jTableDatosCuentaPorCobrar.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CuentaPorCobrarConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCuentaPorCobrarActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cuentaporcobrar);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cuentaporcobrar);
				
				CuentaPorCobrarBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cuentaporcobrar,new Object(),this.cuentaporcobrarParameterGeneral,this.cuentaporcobrarReturnGeneral);
				
				
				CuentaPorCobrarBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cuentaporcobrar,new Object(),this.cuentaporcobrarParameterGeneral,this.cuentaporcobrarReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CuentaPorCobrarConstantesFunciones.CLASSNAME);
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
			
			CuentaPorCobrarBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.cuentaporcobrar,new Object(),this.cuentaporcobrarParameterGeneral,this.cuentaporcobrarReturnGeneral);
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
			
			


			
			CuentaPorCobrarBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cuentaporcobrar,new Object(),this.cuentaporcobrarParameterGeneral,this.cuentaporcobrarReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CuentaPorCobrarConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCuentaPorCobrarActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cuentaporcobrar);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cuentaporcobrar);
				
				CuentaPorCobrarBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.cuentaporcobrar,new Object(),this.cuentaporcobrarParameterGeneral,this.cuentaporcobrarReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				CuentaPorCobrarBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cuentaporcobrar,new Object(),this.cuentaporcobrarParameterGeneral,this.cuentaporcobrarReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CuentaPorCobrar.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CuentaPorCobrar.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CuentaPorCobrarConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cuentaporcobrar);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cuentaporcobrar);
				
				CuentaPorCobrarBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.cuentaporcobrar,new Object(),this.cuentaporcobrarParameterGeneral,this.cuentaporcobrarReturnGeneral);
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
				
				


				
				CuentaPorCobrarBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cuentaporcobrar,new Object(),this.cuentaporcobrarParameterGeneral,this.cuentaporcobrarReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CuentaPorCobrar.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CuentaPorCobrar.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CuentaPorCobrarConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCuentaPorCobrarActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosCuentaPorCobrar.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuentaporcobrarAnterior =(CuentaPorCobrar) this.cuentaporcobrarLogic.getCuentaPorCobrars().toArray()[this.jTableDatosCuentaPorCobrar.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.cuentaporcobrarAnterior =(CuentaPorCobrar) this.cuentaporcobrars.toArray()[this.jTableDatosCuentaPorCobrar.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CuentaPorCobrarConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				CuentaPorCobrarBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cuentaporcobrar,new Object(),this.cuentaporcobrarParameterGeneral,this.cuentaporcobrarReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarCuentaPorCobrar")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosCuentaPorCobrarListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosCuentaPorCobrar.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.cuentaporcobrar =(CuentaPorCobrar) this.cuentaporcobrarLogic.getCuentaPorCobrars().toArray()[this.jTableDatosCuentaPorCobrar.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.cuentaporcobrar =(CuentaPorCobrar) this.cuentaporcobrars.toArray()[this.jTableDatosCuentaPorCobrar.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.cuentaporcobrar);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarCuentaPorCobrar")) {
				
				}
				
				CuentaPorCobrarBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cuentaporcobrar,new Object(),this.cuentaporcobrarParameterGeneral,this.cuentaporcobrarReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CuentaPorCobrarConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			CuentaPorCobrarBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.cuentaporcobrar,new Object(),this.cuentaporcobrarParameterGeneral,this.cuentaporcobrarReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarCuentaPorCobrar")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosCuentaPorCobrar.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarCuentaPorCobrar")) {
			
			}
			
			CuentaPorCobrarBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.cuentaporcobrar,new Object(),this.cuentaporcobrarParameterGeneral,this.cuentaporcobrarReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CuentaPorCobrarConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessCuentaPorCobrar();
			
			CuentaPorCobrarBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cuentaporcobrar,new Object(),this.cuentaporcobrarParameterGeneral,this.cuentaporcobrarReturnGeneral);
			
			if(sTipo.equals("NuevoCuentaPorCobrar")) {
				jButtonNuevoCuentaPorCobrarActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarCuentaPorCobrar")) {
				jButtonDuplicarCuentaPorCobrarActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarCuentaPorCobrar")) {
				jButtonCopiarCuentaPorCobrarActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormCuentaPorCobrar")) {
				jButtonVerFormCuentaPorCobrarActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesCuentaPorCobrar")) {
				jButtonNuevoCuentaPorCobrarActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarCuentaPorCobrar")) {
				jButtonModificarCuentaPorCobrarActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarCuentaPorCobrar")) {
				jButtonActualizarCuentaPorCobrarActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarCuentaPorCobrar")) {
				jButtonEliminarCuentaPorCobrarActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaCuentaPorCobrar")) {
				jButtonGuardarCambiosCuentaPorCobrarActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarCuentaPorCobrar")) {
				jButtonCancelarCuentaPorCobrarActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarCuentaPorCobrar")) {
				jButtonCerrarCuentaPorCobrarActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosCuentaPorCobrar")) {
				jButtonGuardarCambiosCuentaPorCobrarActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosCuentaPorCobrar")) {
				jButtonNuevoGuardarCambiosCuentaPorCobrarActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByCuentaPorCobrar")) {
				jButtonAbrirOrderByCuentaPorCobrarActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionCuentaPorCobrar")) {
				jButtonRecargarInformacionCuentaPorCobrarActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresCuentaPorCobrar")) {
				jButtonAnterioresCuentaPorCobrarActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesCuentaPorCobrar")) {
				jButtonSiguientesCuentaPorCobrarActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idCuentaPorCobrarBusqueda")) {
				this.jButtonidCuentaPorCobrarBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaCuentaPorCobrarUpdate")) {
				this.jButtonid_empresaCuentaPorCobrarUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaCuentaPorCobrarBusqueda")) {
				this.jButtonid_empresaCuentaPorCobrarBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalCuentaPorCobrarUpdate")) {
				this.jButtonid_sucursalCuentaPorCobrarUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalCuentaPorCobrarBusqueda")) {
				this.jButtonid_sucursalCuentaPorCobrarBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_moduloCuentaPorCobrarUpdate")) {
				this.jButtonid_moduloCuentaPorCobrarUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_moduloCuentaPorCobrarBusqueda")) {
				this.jButtonid_moduloCuentaPorCobrarBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_ejercicioCuentaPorCobrarUpdate")) {
				this.jButtonid_ejercicioCuentaPorCobrarUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_ejercicioCuentaPorCobrarBusqueda")) {
				this.jButtonid_ejercicioCuentaPorCobrarBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_monedaCuentaPorCobrarUpdate")) {
				this.jButtonid_monedaCuentaPorCobrarUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_monedaCuentaPorCobrarBusqueda")) {
				this.jButtonid_monedaCuentaPorCobrarBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_clienteCuentaPorCobrar")) {
				this.jButtonid_clienteCuentaPorCobrarActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_clienteCuentaPorCobrarUpdate")) {
				this.jButtonid_clienteCuentaPorCobrarUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_clienteCuentaPorCobrarBusqueda")) {
				this.jButtonid_clienteCuentaPorCobrarBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_transaccionCuentaPorCobrarUpdate")) {
				this.jButtonid_transaccionCuentaPorCobrarUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_transaccionCuentaPorCobrarBusqueda")) {
				this.jButtonid_transaccionCuentaPorCobrarBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_transaccion_moduloCuentaPorCobrarUpdate")) {
				this.jButtonid_tipo_transaccion_moduloCuentaPorCobrarUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_transaccion_moduloCuentaPorCobrarBusqueda")) {
				this.jButtonid_tipo_transaccion_moduloCuentaPorCobrarBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_asiento_contableCuentaPorCobrar")) {
				this.jButtonid_asiento_contableCuentaPorCobrarActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_asiento_contableCuentaPorCobrarUpdate")) {
				this.jButtonid_asiento_contableCuentaPorCobrarUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_asiento_contableCuentaPorCobrarBusqueda")) {
				this.jButtonid_asiento_contableCuentaPorCobrarBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_facturaCuentaPorCobrar")) {
				this.jButtonid_facturaCuentaPorCobrarActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_facturaCuentaPorCobrarUpdate")) {
				this.jButtonid_facturaCuentaPorCobrarUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_facturaCuentaPorCobrarBusqueda")) {
				this.jButtonid_facturaCuentaPorCobrarBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fechaCuentaPorCobrarBusqueda")) {
				this.jButtonfechaCuentaPorCobrarBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("montoCuentaPorCobrarBusqueda")) {
				this.jButtonmontoCuentaPorCobrarBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_comprobanteCuentaPorCobrarBusqueda")) {
				this.jButtonnumero_comprobanteCuentaPorCobrarBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("debitoCuentaPorCobrarBusqueda")) {
				this.jButtondebitoCuentaPorCobrarBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("creditoCuentaPorCobrarBusqueda")) {
				this.jButtoncreditoCuentaPorCobrarBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("detalleCuentaPorCobrarBusqueda")) {
				this.jButtondetalleCuentaPorCobrarBusquedaActionPerformed(evt);
			}
			
			CuentaPorCobrarBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cuentaporcobrar,new Object(),this.cuentaporcobrarParameterGeneral,this.cuentaporcobrarReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CuentaPorCobrarConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessCuentaPorCobrar();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			CuentaPorCobrarBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.cuentaporcobrar,new Object(),this.cuentaporcobrarParameterGeneral,this.cuentaporcobrarReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameCuentaPorCobrar")) {
				closingInternalFrameCuentaPorCobrar();
				
			} else if(sTipo.equals("jButtonCancelarCuentaPorCobrar")) {
				JInternalFrameBase jInternalFrameDetalleFormCuentaPorCobrar = (JInternalFrameBase)evt.getSource();
	            	
	            CuentaPorCobrarBeanSwingJInternalFrame jInternalFrameParent=(CuentaPorCobrarBeanSwingJInternalFrame)jInternalFrameDetalleFormCuentaPorCobrar.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarCuentaPorCobrarActionPerformed(null);
			}
			
			CuentaPorCobrarBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.cuentaporcobrar,new Object(),this.cuentaporcobrarParameterGeneral,this.cuentaporcobrarReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CuentaPorCobrarConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormCuentaPorCobrar(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormCuentaPorCobrar(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormCuentaPorCobrar(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.cuentaporcobrar)) {
			if(!esControlTabla) {
				if(CuentaPorCobrarJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualCuentaPorCobrar(this.cuentaporcobrar,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysCuentaPorCobrar(this.cuentaporcobrar);			
				}
				
				if(this.cuentaporcobrarSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualCuentaPorCobrar(this.cuentaporcobrar,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.cuentaporcobrarReturnGeneral=cuentaporcobrarLogic.procesarEventosCuentaPorCobrarsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.cuentaporcobrarLogic.getCuentaPorCobrars(),this.cuentaporcobrar,this.cuentaporcobrarParameterGeneral,this.isEsNuevoCuentaPorCobrar,classes);//this.cuentaporcobrarLogic.getCuentaPorCobrar()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanCuentaPorCobrar(this.cuentaporcobrarReturnGeneral,this.cuentaporcobrarBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.cuentaporcobrarSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanCuentaPorCobrar(classes,this.cuentaporcobrarReturnGeneral,this.cuentaporcobrarBean,false);
					}
						
					if(this.cuentaporcobrarReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyCuentaPorCobrar(this.cuentaporcobrarReturnGeneral.getCuentaPorCobrar());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioCuentaPorCobrar(this.cuentaporcobrarReturnGeneral.getCuentaPorCobrar());	
					}
						
					if(this.cuentaporcobrarReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioCuentaPorCobrar(this.cuentaporcobrarReturnGeneral.getCuentaPorCobrar(),classes);//this.cuentaporcobrarBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioCuentaPorCobrar(this.cuentaporcobrar,classes);//this.cuentaporcobrarBean);									
				}
			
				if(CuentaPorCobrarJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualCuentaPorCobrar(this.cuentaporcobrar,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysCuentaPorCobrar(this.cuentaporcobrar);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.cuentaporcobrarAnterior!=null) {
						this.cuentaporcobrar=this.cuentaporcobrarAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.cuentaporcobrarReturnGeneral=cuentaporcobrarLogic.procesarEventosCuentaPorCobrarsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.cuentaporcobrarLogic.getCuentaPorCobrars(),this.cuentaporcobrar,this.cuentaporcobrarParameterGeneral,this.isEsNuevoCuentaPorCobrar,classes);//this.cuentaporcobrarLogic.getCuentaPorCobrar()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.cuentaporcobrarSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.cuentaporcobrarSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.cuentaporcobrarReturnGeneral.getCuentaPorCobrar(),cuentaporcobrarLogic.getCuentaPorCobrars());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.cuentaporcobrarReturnGeneral.getCuentaPorCobrar(),this.cuentaporcobrars);
				}
				//ARCHITECTURE
				
				//this.jTableDatosCuentaPorCobrar.repaint();
				
				//((AbstractTableModel) this.jTableDatosCuentaPorCobrar.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosCuentaPorCobrar();
			}
		}
	}
	
	public void actualizarVisualTableDatosCuentaPorCobrar() throws Exception {
		
		CuentaPorCobrarModel cuentaporcobrarModel=(CuentaPorCobrarModel)this.jTableDatosCuentaPorCobrar.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			cuentaporcobrarModel.cuentaporcobrars=this.cuentaporcobrarLogic.getCuentaPorCobrars();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			cuentaporcobrarModel.cuentaporcobrars=this.cuentaporcobrars;
		}
		
		
		((CuentaPorCobrarModel) this.jTableDatosCuentaPorCobrar.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaCuentaPorCobrar() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getcuentaporcobrarAnterior(),this.cuentaporcobrarLogic.getCuentaPorCobrars());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getcuentaporcobrarAnterior(),this.cuentaporcobrars);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosCuentaPorCobrar();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioCuentaPorCobrar(CuentaPorCobrar cuentaporcobrar,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CuentaPorCobrarConstantesFunciones.CLASSNAME);
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
										
				CuentaPorCobrarBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.cuentaporcobrar,new Object(),generalEntityParameterGeneral,this.cuentaporcobrarReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.cuentaporcobrarSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=CuentaPorCobrarConstantesFunciones.getClassesRelationshipsOfCuentaPorCobrar(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=CuentaPorCobrarConstantesFunciones.getClassesRelationshipsFromStringsOfCuentaPorCobrar(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormCuentaPorCobrar(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				CuentaPorCobrarBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.cuentaporcobrar,new Object(),generalEntityParameterGeneral,this.cuentaporcobrarReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CuentaPorCobrarConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioCuentaPorCobrar(CuentaPorCobrarBean cuentaporcobrarBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CuentaPorCobrarConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanCuentaPorCobrar(ArrayList<Classe> classes,CuentaPorCobrarReturnGeneral cuentaporcobrarReturnGeneral,CuentaPorCobrarBean cuentaporcobrarBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualCuentaPorCobrar(CuentaPorCobrar cuentaporcobrar,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.cuentaporcobrar)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormCuentaPorCobrar = new CuentaPorCobrarDetalleFormJInternalFrame(jDesktopPane,this.cuentaporcobrarSessionBean.getConGuardarRelaciones(),this.cuentaporcobrarSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormCuentaPorCobrar);
		this.jInternalFrameDetalleFormCuentaPorCobrar.setVisible(false);
		this.jInternalFrameDetalleFormCuentaPorCobrar.setSelected(false);						
		
		this.jInternalFrameDetalleFormCuentaPorCobrar.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormCuentaPorCobrar.cuentaporcobrarLogic=this.cuentaporcobrarLogic;
		
		this.cargarCombosFrameForeignKeyCuentaPorCobrar("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleCuentaPorCobrar();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleCuentaPorCobrar();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyCuentaPorCobrar("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyCuentaPorCobrar();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormCuentaPorCobrar.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarCuentaPorCobrar"));
		
		this.jInternalFrameDetalleFormCuentaPorCobrar.jButtonModificarCuentaPorCobrar.addActionListener(new ButtonActionListener(this,"ModificarCuentaPorCobrar"));

		
		this.jInternalFrameDetalleFormCuentaPorCobrar.jButtonModificarToolBarCuentaPorCobrar.addActionListener(new ButtonActionListener(this,"ModificarToolBarCuentaPorCobrar"));
					
		this.jInternalFrameDetalleFormCuentaPorCobrar.jMenuItemModificarCuentaPorCobrar.addActionListener(new ButtonActionListener(this,"MenuItemModificarCuentaPorCobrar"));		
		
		
		
		this.jInternalFrameDetalleFormCuentaPorCobrar.jButtonActualizarCuentaPorCobrar.addActionListener (new ButtonActionListener(this,"ActualizarCuentaPorCobrar"));
		
		
		this.jInternalFrameDetalleFormCuentaPorCobrar.jButtonActualizarToolBarCuentaPorCobrar.addActionListener(new ButtonActionListener(this,"ActualizarToolBarCuentaPorCobrar"));
						
		this.jInternalFrameDetalleFormCuentaPorCobrar.jMenuItemActualizarCuentaPorCobrar.addActionListener (new ButtonActionListener(this,"MenuItemActualizarCuentaPorCobrar"));		
		
		
		
		this.jInternalFrameDetalleFormCuentaPorCobrar.jButtonEliminarCuentaPorCobrar.addActionListener (new ButtonActionListener(this,"EliminarCuentaPorCobrar"));
		
		
		this.jInternalFrameDetalleFormCuentaPorCobrar.jButtonEliminarToolBarCuentaPorCobrar.addActionListener (new ButtonActionListener(this,"EliminarToolBarCuentaPorCobrar"));
								
		this.jInternalFrameDetalleFormCuentaPorCobrar.jMenuItemEliminarCuentaPorCobrar.addActionListener (new ButtonActionListener(this,"MenuItemEliminarCuentaPorCobrar"));		
		
		
		
		this.jInternalFrameDetalleFormCuentaPorCobrar.jButtonCancelarCuentaPorCobrar.addActionListener (new ButtonActionListener(this,"CancelarCuentaPorCobrar"));
		
		
		this.jInternalFrameDetalleFormCuentaPorCobrar.jButtonCancelarToolBarCuentaPorCobrar.addActionListener (new ButtonActionListener(this,"CancelarToolBarCuentaPorCobrar"));
					
		this.jInternalFrameDetalleFormCuentaPorCobrar.jMenuItemCancelarCuentaPorCobrar.addActionListener (new ButtonActionListener(this,"MenuItemCancelarCuentaPorCobrar"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormCuentaPorCobrar.jMenuItemDetalleCerrarCuentaPorCobrar.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarCuentaPorCobrar"));		
		
		
		
		this.jInternalFrameDetalleFormCuentaPorCobrar.jButtonGuardarCambiosToolBarCuentaPorCobrar.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarCuentaPorCobrar"));
		
		
		
		this.jInternalFrameDetalleFormCuentaPorCobrar.jButtonGuardarCambiosToolBarCuentaPorCobrar.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarCuentaPorCobrar"));
		
		
		
		this.jInternalFrameDetalleFormCuentaPorCobrar.jComboBoxTiposAccionesFormularioCuentaPorCobrar.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioCuentaPorCobrar"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCuentaPorCobrar.jButtonidCuentaPorCobrarBusqueda.addActionListener(new ButtonActionListener(this,"idCuentaPorCobrarBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCuentaPorCobrar.jButtonid_empresaCuentaPorCobrarUpdate.addActionListener(new ButtonActionListener(this,"id_empresaCuentaPorCobrarUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCuentaPorCobrar.jButtonid_empresaCuentaPorCobrarBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaCuentaPorCobrarBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCuentaPorCobrar.jButtonid_sucursalCuentaPorCobrarUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalCuentaPorCobrarUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCuentaPorCobrar.jButtonid_sucursalCuentaPorCobrarBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalCuentaPorCobrarBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCuentaPorCobrar.jButtonid_moduloCuentaPorCobrarUpdate.addActionListener(new ButtonActionListener(this,"id_moduloCuentaPorCobrarUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCuentaPorCobrar.jButtonid_moduloCuentaPorCobrarBusqueda.addActionListener(new ButtonActionListener(this,"id_moduloCuentaPorCobrarBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCuentaPorCobrar.jButtonid_ejercicioCuentaPorCobrarUpdate.addActionListener(new ButtonActionListener(this,"id_ejercicioCuentaPorCobrarUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCuentaPorCobrar.jButtonid_ejercicioCuentaPorCobrarBusqueda.addActionListener(new ButtonActionListener(this,"id_ejercicioCuentaPorCobrarBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCuentaPorCobrar.jButtonid_monedaCuentaPorCobrarUpdate.addActionListener(new ButtonActionListener(this,"id_monedaCuentaPorCobrarUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCuentaPorCobrar.jButtonid_monedaCuentaPorCobrarBusqueda.addActionListener(new ButtonActionListener(this,"id_monedaCuentaPorCobrarBusqueda"));
		//jButtonid_clienteCuentaPorCobrar.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_clienteCuentaPorCobrarActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormCuentaPorCobrar.jButtonid_clienteCuentaPorCobrar.addActionListener(new ButtonActionListener(this,"id_clienteCuentaPorCobrar"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCuentaPorCobrar.jButtonid_clienteCuentaPorCobrarUpdate.addActionListener(new ButtonActionListener(this,"id_clienteCuentaPorCobrarUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCuentaPorCobrar.jButtonid_clienteCuentaPorCobrarBusqueda.addActionListener(new ButtonActionListener(this,"id_clienteCuentaPorCobrarBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCuentaPorCobrar.jButtonid_transaccionCuentaPorCobrarUpdate.addActionListener(new ButtonActionListener(this,"id_transaccionCuentaPorCobrarUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCuentaPorCobrar.jButtonid_transaccionCuentaPorCobrarBusqueda.addActionListener(new ButtonActionListener(this,"id_transaccionCuentaPorCobrarBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCuentaPorCobrar.jButtonid_tipo_transaccion_moduloCuentaPorCobrarUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_transaccion_moduloCuentaPorCobrarUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCuentaPorCobrar.jButtonid_tipo_transaccion_moduloCuentaPorCobrarBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_transaccion_moduloCuentaPorCobrarBusqueda"));
		//jButtonid_asiento_contableCuentaPorCobrar.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_asiento_contableCuentaPorCobrarActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormCuentaPorCobrar.jButtonid_asiento_contableCuentaPorCobrar.addActionListener(new ButtonActionListener(this,"id_asiento_contableCuentaPorCobrar"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCuentaPorCobrar.jButtonid_asiento_contableCuentaPorCobrarUpdate.addActionListener(new ButtonActionListener(this,"id_asiento_contableCuentaPorCobrarUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCuentaPorCobrar.jButtonid_asiento_contableCuentaPorCobrarBusqueda.addActionListener(new ButtonActionListener(this,"id_asiento_contableCuentaPorCobrarBusqueda"));
		//jButtonid_facturaCuentaPorCobrar.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_facturaCuentaPorCobrarActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormCuentaPorCobrar.jButtonid_facturaCuentaPorCobrar.addActionListener(new ButtonActionListener(this,"id_facturaCuentaPorCobrar"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCuentaPorCobrar.jButtonid_facturaCuentaPorCobrarUpdate.addActionListener(new ButtonActionListener(this,"id_facturaCuentaPorCobrarUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCuentaPorCobrar.jButtonid_facturaCuentaPorCobrarBusqueda.addActionListener(new ButtonActionListener(this,"id_facturaCuentaPorCobrarBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCuentaPorCobrar.jButtonfechaCuentaPorCobrarBusqueda.addActionListener(new ButtonActionListener(this,"fechaCuentaPorCobrarBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCuentaPorCobrar.jButtonmontoCuentaPorCobrarBusqueda.addActionListener(new ButtonActionListener(this,"montoCuentaPorCobrarBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCuentaPorCobrar.jButtonnumero_comprobanteCuentaPorCobrarBusqueda.addActionListener(new ButtonActionListener(this,"numero_comprobanteCuentaPorCobrarBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCuentaPorCobrar.jButtondebitoCuentaPorCobrarBusqueda.addActionListener(new ButtonActionListener(this,"debitoCuentaPorCobrarBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCuentaPorCobrar.jButtoncreditoCuentaPorCobrarBusqueda.addActionListener(new ButtonActionListener(this,"creditoCuentaPorCobrarBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCuentaPorCobrar.jButtondetalleCuentaPorCobrarBusqueda.addActionListener(new ButtonActionListener(this,"detalleCuentaPorCobrarBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormCuentaPorCobrar.jTabbedPaneRelacionesCuentaPorCobrar.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesCuentaPorCobrar"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameCuentaPorCobrar"));
		
		if(this.jInternalFrameDetalleFormCuentaPorCobrar!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCuentaPorCobrar.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarCuentaPorCobrar"));
		}
		
		this.jTableDatosCuentaPorCobrar.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarCuentaPorCobrar"));
		
		this.jTableDatosCuentaPorCobrar.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarCuentaPorCobrar"));
		
		this.jButtonNuevoCuentaPorCobrar.addActionListener(new ButtonActionListener(this,"NuevoCuentaPorCobrar"));
		
		this.jButtonDuplicarCuentaPorCobrar.addActionListener(new ButtonActionListener(this,"DuplicarCuentaPorCobrar"));
		
		this.jButtonCopiarCuentaPorCobrar.addActionListener(new ButtonActionListener(this,"CopiarCuentaPorCobrar"));
		
		this.jButtonVerFormCuentaPorCobrar.addActionListener(new ButtonActionListener(this,"VerFormCuentaPorCobrar"));
		
		
		this.jButtonNuevoToolBarCuentaPorCobrar.addActionListener(new ButtonActionListener(this,"NuevoToolBarCuentaPorCobrar"));
			
		this.jButtonDuplicarToolBarCuentaPorCobrar.addActionListener(new ButtonActionListener(this,"DuplicarToolBarCuentaPorCobrar"));
			
		this.jMenuItemNuevoCuentaPorCobrar.addActionListener (new ButtonActionListener(this,"MenuItemNuevoCuentaPorCobrar"));
			
		this.jMenuItemDuplicarCuentaPorCobrar.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarCuentaPorCobrar"));		
		
		
		this.jButtonNuevoRelacionesCuentaPorCobrar.addActionListener (new ButtonActionListener(this,"NuevoRelacionesCuentaPorCobrar"));
		
		
		this.jButtonNuevoRelacionesToolBarCuentaPorCobrar.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarCuentaPorCobrar"));
			
		this.jMenuItemNuevoRelacionesCuentaPorCobrar.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesCuentaPorCobrar"));		
		
		
		if(this.jInternalFrameDetalleFormCuentaPorCobrar!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCuentaPorCobrar.jButtonModificarCuentaPorCobrar.addActionListener(new ButtonActionListener(this,"ModificarCuentaPorCobrar"));
		}
		
		
		if(this.jInternalFrameDetalleFormCuentaPorCobrar!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCuentaPorCobrar.jButtonModificarToolBarCuentaPorCobrar.addActionListener(new ButtonActionListener(this,"ModificarToolBarCuentaPorCobrar"));
			
			this.jInternalFrameDetalleFormCuentaPorCobrar.jMenuItemModificarCuentaPorCobrar.addActionListener(new ButtonActionListener(this,"MenuItemModificarCuentaPorCobrar"));		
		}
		
		
		if(this.jInternalFrameDetalleFormCuentaPorCobrar!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormCuentaPorCobrar.jButtonActualizarCuentaPorCobrar.addActionListener (new ButtonActionListener(this,"ActualizarCuentaPorCobrar"));
		}
		
		
		if(this.jInternalFrameDetalleFormCuentaPorCobrar!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCuentaPorCobrar.jButtonActualizarToolBarCuentaPorCobrar.addActionListener(new ButtonActionListener(this,"ActualizarToolBarCuentaPorCobrar"));
				
			this.jInternalFrameDetalleFormCuentaPorCobrar.jMenuItemActualizarCuentaPorCobrar.addActionListener (new ButtonActionListener(this,"MenuItemActualizarCuentaPorCobrar"));		
		}
		
		
		if(this.jInternalFrameDetalleFormCuentaPorCobrar!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCuentaPorCobrar.jButtonEliminarCuentaPorCobrar.addActionListener (new ButtonActionListener(this,"EliminarCuentaPorCobrar"));
		}
		
		
		if(this.jInternalFrameDetalleFormCuentaPorCobrar!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCuentaPorCobrar.jButtonEliminarToolBarCuentaPorCobrar.addActionListener (new ButtonActionListener(this,"EliminarToolBarCuentaPorCobrar"));
						
			this.jInternalFrameDetalleFormCuentaPorCobrar.jMenuItemEliminarCuentaPorCobrar.addActionListener (new ButtonActionListener(this,"MenuItemEliminarCuentaPorCobrar"));		
		}
		
		
		if(this.jInternalFrameDetalleFormCuentaPorCobrar!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCuentaPorCobrar.jButtonCancelarCuentaPorCobrar.addActionListener (new ButtonActionListener(this,"CancelarCuentaPorCobrar"));
		}
		
		
		if(this.jInternalFrameDetalleFormCuentaPorCobrar!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCuentaPorCobrar.jButtonCancelarToolBarCuentaPorCobrar.addActionListener (new ButtonActionListener(this,"CancelarToolBarCuentaPorCobrar"));
			
			this.jInternalFrameDetalleFormCuentaPorCobrar.jMenuItemCancelarCuentaPorCobrar.addActionListener (new ButtonActionListener(this,"MenuItemCancelarCuentaPorCobrar"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarCuentaPorCobrar.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarCuentaPorCobrar"));		
		
		
		this.jButtonCerrarCuentaPorCobrar.addActionListener (new ButtonActionListener(this,"CerrarCuentaPorCobrar"));
		
		
		this.jButtonCerrarToolBarCuentaPorCobrar.addActionListener (new ButtonActionListener(this,"CerrarToolBarCuentaPorCobrar"));
			
		this.jMenuItemCerrarCuentaPorCobrar.addActionListener (new ButtonActionListener(this,"MenuItemCerrarCuentaPorCobrar"));
			
		if(this.jInternalFrameDetalleFormCuentaPorCobrar!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCuentaPorCobrar.jMenuItemDetalleCerrarCuentaPorCobrar.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarCuentaPorCobrar"));		
		}
		
		
		if(this.jInternalFrameDetalleFormCuentaPorCobrar!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCuentaPorCobrar.jButtonGuardarCambiosCuentaPorCobrar.addActionListener (new ButtonActionListener(this,"GuardarCambiosCuentaPorCobrar"));
		}
		
		
		if(this.jInternalFrameDetalleFormCuentaPorCobrar!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCuentaPorCobrar.jButtonGuardarCambiosToolBarCuentaPorCobrar.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarCuentaPorCobrar"));
		}
		
		this.jButtonCopiarToolBarCuentaPorCobrar.addActionListener (new ButtonActionListener(this,"CopiarToolBarCuentaPorCobrar"));
			
		this.jButtonVerFormToolBarCuentaPorCobrar.addActionListener (new ButtonActionListener(this,"VerFormToolBarCuentaPorCobrar"));
		
		this.jMenuItemGuardarCambiosCuentaPorCobrar.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosCuentaPorCobrar"));
			
		this.jMenuItemCopiarCuentaPorCobrar.addActionListener (new ButtonActionListener(this,"MenuItemCopiarCuentaPorCobrar"));		
		
		this.jMenuItemVerFormCuentaPorCobrar.addActionListener (new ButtonActionListener(this,"MenuItemVerFormCuentaPorCobrar"));		
		
		
		this.jButtonGuardarCambiosTablaCuentaPorCobrar.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaCuentaPorCobrar"));
		
		
		this.jButtonGuardarCambiosTablaToolBarCuentaPorCobrar.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarCuentaPorCobrar"));
			
		this.jMenuItemGuardarCambiosTablaCuentaPorCobrar.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaCuentaPorCobrar"));		
		
		
		
		this.jButtonRecargarInformacionCuentaPorCobrar.addActionListener (new ButtonActionListener(this,"RecargarInformacionCuentaPorCobrar"));
					
		this.jButtonRecargarInformacionToolBarCuentaPorCobrar.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarCuentaPorCobrar"));
		
		this.jMenuItemRecargarInformacionCuentaPorCobrar.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionCuentaPorCobrar"));		
		
		
		
		this.jButtonAnterioresCuentaPorCobrar.addActionListener (new ButtonActionListener(this,"AnterioresCuentaPorCobrar"));
		
		
		this.jButtonAnterioresToolBarCuentaPorCobrar.addActionListener (new ButtonActionListener(this,"AnterioresToolBarCuentaPorCobrar"));
		
		this.jMenuItemAnterioresCuentaPorCobrar.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresCuentaPorCobrar"));		
		
		
		this.jButtonSiguientesCuentaPorCobrar.addActionListener (new ButtonActionListener(this,"SiguientesCuentaPorCobrar"));
		
		
		this.jButtonSiguientesToolBarCuentaPorCobrar.addActionListener (new ButtonActionListener(this,"SiguientesToolBarCuentaPorCobrar"));
			
		this.jMenuItemSiguientesCuentaPorCobrar.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesCuentaPorCobrar"));
			
		this.jMenuItemAbrirOrderByCuentaPorCobrar.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByCuentaPorCobrar"));
			
		this.jMenuItemMostrarOcultarCuentaPorCobrar.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarCuentaPorCobrar"));
			
		this.jMenuItemDetalleAbrirOrderByCuentaPorCobrar.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByCuentaPorCobrar"));
			
		this.jMenuItemDetalleMostarOcultarCuentaPorCobrar.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarCuentaPorCobrar"));		
		
		
		this.jButtonNuevoGuardarCambiosCuentaPorCobrar.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosCuentaPorCobrar"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarCuentaPorCobrar.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarCuentaPorCobrar"));
			
		this.jMenuItemNuevoGuardarCambiosCuentaPorCobrar.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosCuentaPorCobrar"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosCuentaPorCobrar.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosCuentaPorCobrar"));

		this.jCheckBoxSeleccionadosCuentaPorCobrar.addItemListener(new CheckBoxItemListener(this,"SeleccionadosCuentaPorCobrar"));
		
		if(this.jInternalFrameDetalleFormCuentaPorCobrar!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCuentaPorCobrar.jComboBoxTiposAccionesFormularioCuentaPorCobrar.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioCuentaPorCobrar"));
		}
		
		
		this.jComboBoxTiposRelacionesCuentaPorCobrar.addActionListener (new ButtonActionListener(this,"TiposRelacionesCuentaPorCobrar"));
			
		this.jComboBoxTiposAccionesCuentaPorCobrar.addActionListener (new ButtonActionListener(this,"TiposAccionesCuentaPorCobrar"));
					
		this.jComboBoxTiposSeleccionarCuentaPorCobrar.addActionListener (new ButtonActionListener(this,"TiposSeleccionarCuentaPorCobrar"));
			
		this.jTextFieldValorCampoGeneralCuentaPorCobrar.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralCuentaPorCobrar"));		
		
		
		if(this.jInternalFrameDetalleFormCuentaPorCobrar!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCuentaPorCobrar.jButtonidCuentaPorCobrarBusqueda.addActionListener(new ButtonActionListener(this,"idCuentaPorCobrarBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCuentaPorCobrar.jButtonid_empresaCuentaPorCobrarUpdate.addActionListener(new ButtonActionListener(this,"id_empresaCuentaPorCobrarUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCuentaPorCobrar.jButtonid_empresaCuentaPorCobrarBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaCuentaPorCobrarBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCuentaPorCobrar.jButtonid_sucursalCuentaPorCobrarUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalCuentaPorCobrarUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCuentaPorCobrar.jButtonid_sucursalCuentaPorCobrarBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalCuentaPorCobrarBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCuentaPorCobrar.jButtonid_moduloCuentaPorCobrarUpdate.addActionListener(new ButtonActionListener(this,"id_moduloCuentaPorCobrarUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCuentaPorCobrar.jButtonid_moduloCuentaPorCobrarBusqueda.addActionListener(new ButtonActionListener(this,"id_moduloCuentaPorCobrarBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCuentaPorCobrar.jButtonid_ejercicioCuentaPorCobrarUpdate.addActionListener(new ButtonActionListener(this,"id_ejercicioCuentaPorCobrarUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCuentaPorCobrar.jButtonid_ejercicioCuentaPorCobrarBusqueda.addActionListener(new ButtonActionListener(this,"id_ejercicioCuentaPorCobrarBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCuentaPorCobrar.jButtonid_monedaCuentaPorCobrarUpdate.addActionListener(new ButtonActionListener(this,"id_monedaCuentaPorCobrarUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCuentaPorCobrar.jButtonid_monedaCuentaPorCobrarBusqueda.addActionListener(new ButtonActionListener(this,"id_monedaCuentaPorCobrarBusqueda"));
		//jButtonid_clienteCuentaPorCobrar.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_clienteCuentaPorCobrarActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormCuentaPorCobrar.jButtonid_clienteCuentaPorCobrar.addActionListener(new ButtonActionListener(this,"id_clienteCuentaPorCobrar"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCuentaPorCobrar.jButtonid_clienteCuentaPorCobrarUpdate.addActionListener(new ButtonActionListener(this,"id_clienteCuentaPorCobrarUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCuentaPorCobrar.jButtonid_clienteCuentaPorCobrarBusqueda.addActionListener(new ButtonActionListener(this,"id_clienteCuentaPorCobrarBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCuentaPorCobrar.jButtonid_transaccionCuentaPorCobrarUpdate.addActionListener(new ButtonActionListener(this,"id_transaccionCuentaPorCobrarUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCuentaPorCobrar.jButtonid_transaccionCuentaPorCobrarBusqueda.addActionListener(new ButtonActionListener(this,"id_transaccionCuentaPorCobrarBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCuentaPorCobrar.jButtonid_tipo_transaccion_moduloCuentaPorCobrarUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_transaccion_moduloCuentaPorCobrarUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCuentaPorCobrar.jButtonid_tipo_transaccion_moduloCuentaPorCobrarBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_transaccion_moduloCuentaPorCobrarBusqueda"));
		//jButtonid_asiento_contableCuentaPorCobrar.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_asiento_contableCuentaPorCobrarActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormCuentaPorCobrar.jButtonid_asiento_contableCuentaPorCobrar.addActionListener(new ButtonActionListener(this,"id_asiento_contableCuentaPorCobrar"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCuentaPorCobrar.jButtonid_asiento_contableCuentaPorCobrarUpdate.addActionListener(new ButtonActionListener(this,"id_asiento_contableCuentaPorCobrarUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCuentaPorCobrar.jButtonid_asiento_contableCuentaPorCobrarBusqueda.addActionListener(new ButtonActionListener(this,"id_asiento_contableCuentaPorCobrarBusqueda"));
		//jButtonid_facturaCuentaPorCobrar.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_facturaCuentaPorCobrarActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormCuentaPorCobrar.jButtonid_facturaCuentaPorCobrar.addActionListener(new ButtonActionListener(this,"id_facturaCuentaPorCobrar"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCuentaPorCobrar.jButtonid_facturaCuentaPorCobrarUpdate.addActionListener(new ButtonActionListener(this,"id_facturaCuentaPorCobrarUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCuentaPorCobrar.jButtonid_facturaCuentaPorCobrarBusqueda.addActionListener(new ButtonActionListener(this,"id_facturaCuentaPorCobrarBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCuentaPorCobrar.jButtonfechaCuentaPorCobrarBusqueda.addActionListener(new ButtonActionListener(this,"fechaCuentaPorCobrarBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCuentaPorCobrar.jButtonmontoCuentaPorCobrarBusqueda.addActionListener(new ButtonActionListener(this,"montoCuentaPorCobrarBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCuentaPorCobrar.jButtonnumero_comprobanteCuentaPorCobrarBusqueda.addActionListener(new ButtonActionListener(this,"numero_comprobanteCuentaPorCobrarBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCuentaPorCobrar.jButtondebitoCuentaPorCobrarBusqueda.addActionListener(new ButtonActionListener(this,"debitoCuentaPorCobrarBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCuentaPorCobrar.jButtoncreditoCuentaPorCobrarBusqueda.addActionListener(new ButtonActionListener(this,"creditoCuentaPorCobrarBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCuentaPorCobrar.jButtondetalleCuentaPorCobrarBusqueda.addActionListener(new ButtonActionListener(this,"detalleCuentaPorCobrarBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonFK_IdAsientoContableCuentaPorCobrar.addActionListener(new ButtonActionListener(this,"FK_IdAsientoContableCuentaPorCobrar"));

			this.jButtonBuscarFK_IdAsientoContableid_asiento_contableCuentaPorCobrar.addActionListener(new ButtonActionListener(this,"id_asiento_contableCuentaPorCobrar"));

			this.jButtonFK_IdClienteCuentaPorCobrar.addActionListener(new ButtonActionListener(this,"FK_IdClienteCuentaPorCobrar"));

			this.jButtonBuscarFK_IdClienteid_clienteCuentaPorCobrar.addActionListener(new ButtonActionListener(this,"id_clienteCuentaPorCobrar"));

			this.jButtonFK_IdFacturaCuentaPorCobrar.addActionListener(new ButtonActionListener(this,"FK_IdFacturaCuentaPorCobrar"));

			this.jButtonBuscarFK_IdFacturaid_facturaCuentaPorCobrar.addActionListener(new ButtonActionListener(this,"id_facturaCuentaPorCobrar"));

			this.jButtonFK_IdTipoTransaccionModuloCuentaPorCobrar.addActionListener(new ButtonActionListener(this,"FK_IdTipoTransaccionModuloCuentaPorCobrar"));

			this.jButtonFK_IdTransaccionCuentaPorCobrar.addActionListener(new ButtonActionListener(this,"FK_IdTransaccionCuentaPorCobrar"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoCuentaPorCobrar!=null) {
				this.jInternalFrameReporteDinamicoCuentaPorCobrar.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoCuentaPorCobrar"));
				this.jInternalFrameReporteDinamicoCuentaPorCobrar.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoCuentaPorCobrar"));
				this.jInternalFrameReporteDinamicoCuentaPorCobrar.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoCuentaPorCobrar"));
			}
			
			//this.jButtonCerrarReporteDinamicoCuentaPorCobrar.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoCuentaPorCobrar"));				
			//this.jButtonGenerarReporteDinamicoCuentaPorCobrar.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoCuentaPorCobrar"));
			//this.jButtonGenerarExcelReporteDinamicoCuentaPorCobrar.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoCuentaPorCobrar"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionCuentaPorCobrar!=null) {
				this.jInternalFrameImportacionCuentaPorCobrar.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionCuentaPorCobrar"));
				this.jInternalFrameImportacionCuentaPorCobrar.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionCuentaPorCobrar"));
				this.jInternalFrameImportacionCuentaPorCobrar.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionCuentaPorCobrar"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByCuentaPorCobrar.addActionListener (new ButtonActionListener(this,"AbrirOrderByCuentaPorCobrar"));
			
			this.jButtonAbrirOrderByToolBarCuentaPorCobrar.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarCuentaPorCobrar"));			
			
			if(this.jInternalFrameOrderByCuentaPorCobrar!=null) {
				this.jInternalFrameOrderByCuentaPorCobrar.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByCuentaPorCobrar"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormCuentaPorCobrar!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormCuentaPorCobrar!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCuentaPorCobrar.jTabbedPaneRelacionesCuentaPorCobrar.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesCuentaPorCobrar"));
		
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
            		closingInternalFrameCuentaPorCobrar();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormCuentaPorCobrar.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormCuentaPorCobrar = (JInternalFrameBase)event.getSource();
	            	
	            CuentaPorCobrarBeanSwingJInternalFrame jInternalFrameParent=(CuentaPorCobrarBeanSwingJInternalFrame)jInternalFrameDetalleFormCuentaPorCobrar.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarCuentaPorCobrarActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosCuentaPorCobrar.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosCuentaPorCobrarListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosCuentaPorCobrar.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosCuentaPorCobrar.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoCuentaPorCobrar.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoCuentaPorCobrarActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarCuentaPorCobrar.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoCuentaPorCobrarActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoCuentaPorCobrar.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoCuentaPorCobrarActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoCuentaPorCobrar";
		inputMap = this.jButtonNuevoCuentaPorCobrar.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoCuentaPorCobrar.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoCuentaPorCobrarActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesCuentaPorCobrar.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoCuentaPorCobrarActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarCuentaPorCobrar.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoCuentaPorCobrarActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesCuentaPorCobrar.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoCuentaPorCobrarActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesCuentaPorCobrar";
		inputMap = this.jButtonNuevoRelacionesCuentaPorCobrar.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesCuentaPorCobrar.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoCuentaPorCobrarActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarCuentaPorCobrar.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarCuentaPorCobrarActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarCuentaPorCobrar.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarCuentaPorCobrarActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarCuentaPorCobrar.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarCuentaPorCobrarActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarCuentaPorCobrar";
		inputMap = this.jButtonModificarCuentaPorCobrar.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarCuentaPorCobrar.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarCuentaPorCobrarActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarCuentaPorCobrar.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarCuentaPorCobrarActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarCuentaPorCobrar.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarCuentaPorCobrarActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarCuentaPorCobrar.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarCuentaPorCobrarActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarCuentaPorCobrar";
		inputMap = this.jButtonActualizarCuentaPorCobrar.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarCuentaPorCobrar.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarCuentaPorCobrarActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarCuentaPorCobrar.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarCuentaPorCobrarActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarCuentaPorCobrar.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarCuentaPorCobrarActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarCuentaPorCobrar.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarCuentaPorCobrarActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarCuentaPorCobrar";
		inputMap = this.jButtonEliminarCuentaPorCobrar.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarCuentaPorCobrar.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarCuentaPorCobrarActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarCuentaPorCobrar.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarCuentaPorCobrarActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarCuentaPorCobrar.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarCuentaPorCobrarActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarCuentaPorCobrar.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarCuentaPorCobrarActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarCuentaPorCobrar";
		inputMap = this.jButtonCancelarCuentaPorCobrar.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarCuentaPorCobrar.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarCuentaPorCobrarActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarCuentaPorCobrar.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarCuentaPorCobrarActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarCuentaPorCobrar.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarCuentaPorCobrarActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarCuentaPorCobrar.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarCuentaPorCobrarActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarCuentaPorCobrar.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarCuentaPorCobrarActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarCuentaPorCobrarActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarCuentaPorCobrar";
		inputMap = this.jButtonCerrarCuentaPorCobrar.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarCuentaPorCobrar.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarCuentaPorCobrarActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormCuentaPorCobrar.jButtonGuardarCambiosCuentaPorCobrar.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosCuentaPorCobrarActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarCuentaPorCobrar.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosCuentaPorCobrarActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosCuentaPorCobrar.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosCuentaPorCobrarActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaCuentaPorCobrar.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosCuentaPorCobrarActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarCuentaPorCobrar.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosCuentaPorCobrarActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaCuentaPorCobrar.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosCuentaPorCobrarActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosCuentaPorCobrar";
		inputMap = this.jInternalFrameDetalleFormCuentaPorCobrar.jButtonGuardarCambiosCuentaPorCobrar.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormCuentaPorCobrar.jButtonGuardarCambiosCuentaPorCobrar.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosCuentaPorCobrarActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionCuentaPorCobrar.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionCuentaPorCobrarActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarCuentaPorCobrar.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionCuentaPorCobrarActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionCuentaPorCobrar.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionCuentaPorCobrarActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresCuentaPorCobrar.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresCuentaPorCobrarActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarCuentaPorCobrar.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresCuentaPorCobrarActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresCuentaPorCobrar.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresCuentaPorCobrarActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesCuentaPorCobrar.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesCuentaPorCobrarActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarCuentaPorCobrar.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesCuentaPorCobrarActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesCuentaPorCobrar.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesCuentaPorCobrarActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosCuentaPorCobrar.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosCuentaPorCobrarActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarCuentaPorCobrar.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosCuentaPorCobrarActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosCuentaPorCobrar.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosCuentaPorCobrarActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosCuentaPorCobrar.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosCuentaPorCobrarItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesCuentaPorCobrar.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesCuentaPorCobrarActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarCuentaPorCobrar.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarCuentaPorCobrarActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralCuentaPorCobrar.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralCuentaPorCobrarActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCuentaPorCobrar.jButtonidCuentaPorCobrarBusqueda.addActionListener(new ButtonActionListener(this,"idCuentaPorCobrarBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCuentaPorCobrar.jButtonid_empresaCuentaPorCobrarUpdate.addActionListener(new ButtonActionListener(this,"id_empresaCuentaPorCobrarUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCuentaPorCobrar.jButtonid_empresaCuentaPorCobrarBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaCuentaPorCobrarBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCuentaPorCobrar.jButtonid_sucursalCuentaPorCobrarUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalCuentaPorCobrarUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCuentaPorCobrar.jButtonid_sucursalCuentaPorCobrarBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalCuentaPorCobrarBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCuentaPorCobrar.jButtonid_moduloCuentaPorCobrarUpdate.addActionListener(new ButtonActionListener(this,"id_moduloCuentaPorCobrarUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCuentaPorCobrar.jButtonid_moduloCuentaPorCobrarBusqueda.addActionListener(new ButtonActionListener(this,"id_moduloCuentaPorCobrarBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCuentaPorCobrar.jButtonid_ejercicioCuentaPorCobrarUpdate.addActionListener(new ButtonActionListener(this,"id_ejercicioCuentaPorCobrarUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCuentaPorCobrar.jButtonid_ejercicioCuentaPorCobrarBusqueda.addActionListener(new ButtonActionListener(this,"id_ejercicioCuentaPorCobrarBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCuentaPorCobrar.jButtonid_monedaCuentaPorCobrarUpdate.addActionListener(new ButtonActionListener(this,"id_monedaCuentaPorCobrarUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCuentaPorCobrar.jButtonid_monedaCuentaPorCobrarBusqueda.addActionListener(new ButtonActionListener(this,"id_monedaCuentaPorCobrarBusqueda"));
		//jButtonid_clienteCuentaPorCobrar.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_clienteCuentaPorCobrarActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormCuentaPorCobrar.jButtonid_clienteCuentaPorCobrar.addActionListener(new ButtonActionListener(this,"id_clienteCuentaPorCobrar"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCuentaPorCobrar.jButtonid_clienteCuentaPorCobrarUpdate.addActionListener(new ButtonActionListener(this,"id_clienteCuentaPorCobrarUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCuentaPorCobrar.jButtonid_clienteCuentaPorCobrarBusqueda.addActionListener(new ButtonActionListener(this,"id_clienteCuentaPorCobrarBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCuentaPorCobrar.jButtonid_transaccionCuentaPorCobrarUpdate.addActionListener(new ButtonActionListener(this,"id_transaccionCuentaPorCobrarUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCuentaPorCobrar.jButtonid_transaccionCuentaPorCobrarBusqueda.addActionListener(new ButtonActionListener(this,"id_transaccionCuentaPorCobrarBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCuentaPorCobrar.jButtonid_tipo_transaccion_moduloCuentaPorCobrarUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_transaccion_moduloCuentaPorCobrarUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCuentaPorCobrar.jButtonid_tipo_transaccion_moduloCuentaPorCobrarBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_transaccion_moduloCuentaPorCobrarBusqueda"));
		//jButtonid_asiento_contableCuentaPorCobrar.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_asiento_contableCuentaPorCobrarActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormCuentaPorCobrar.jButtonid_asiento_contableCuentaPorCobrar.addActionListener(new ButtonActionListener(this,"id_asiento_contableCuentaPorCobrar"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCuentaPorCobrar.jButtonid_asiento_contableCuentaPorCobrarUpdate.addActionListener(new ButtonActionListener(this,"id_asiento_contableCuentaPorCobrarUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCuentaPorCobrar.jButtonid_asiento_contableCuentaPorCobrarBusqueda.addActionListener(new ButtonActionListener(this,"id_asiento_contableCuentaPorCobrarBusqueda"));
		//jButtonid_facturaCuentaPorCobrar.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_facturaCuentaPorCobrarActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormCuentaPorCobrar.jButtonid_facturaCuentaPorCobrar.addActionListener(new ButtonActionListener(this,"id_facturaCuentaPorCobrar"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCuentaPorCobrar.jButtonid_facturaCuentaPorCobrarUpdate.addActionListener(new ButtonActionListener(this,"id_facturaCuentaPorCobrarUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCuentaPorCobrar.jButtonid_facturaCuentaPorCobrarBusqueda.addActionListener(new ButtonActionListener(this,"id_facturaCuentaPorCobrarBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCuentaPorCobrar.jButtonfechaCuentaPorCobrarBusqueda.addActionListener(new ButtonActionListener(this,"fechaCuentaPorCobrarBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCuentaPorCobrar.jButtonmontoCuentaPorCobrarBusqueda.addActionListener(new ButtonActionListener(this,"montoCuentaPorCobrarBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCuentaPorCobrar.jButtonnumero_comprobanteCuentaPorCobrarBusqueda.addActionListener(new ButtonActionListener(this,"numero_comprobanteCuentaPorCobrarBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCuentaPorCobrar.jButtondebitoCuentaPorCobrarBusqueda.addActionListener(new ButtonActionListener(this,"debitoCuentaPorCobrarBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCuentaPorCobrar.jButtoncreditoCuentaPorCobrarBusqueda.addActionListener(new ButtonActionListener(this,"creditoCuentaPorCobrarBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCuentaPorCobrar.jButtondetalleCuentaPorCobrarBusqueda.addActionListener(new ButtonActionListener(this,"detalleCuentaPorCobrarBusqueda"));
		
		
		this.jButtonFK_IdAsientoContableCuentaPorCobrar.addActionListener(new ButtonActionListener(this,"FK_IdAsientoContableCuentaPorCobrar"));

		this.jButtonBuscarFK_IdAsientoContableid_asiento_contableCuentaPorCobrar.addActionListener(new ButtonActionListener(this,"id_asiento_contableCuentaPorCobrar"));

		this.jButtonFK_IdClienteCuentaPorCobrar.addActionListener(new ButtonActionListener(this,"FK_IdClienteCuentaPorCobrar"));

		this.jButtonBuscarFK_IdClienteid_clienteCuentaPorCobrar.addActionListener(new ButtonActionListener(this,"id_clienteCuentaPorCobrar"));

		this.jButtonFK_IdFacturaCuentaPorCobrar.addActionListener(new ButtonActionListener(this,"FK_IdFacturaCuentaPorCobrar"));

		this.jButtonBuscarFK_IdFacturaid_facturaCuentaPorCobrar.addActionListener(new ButtonActionListener(this,"id_facturaCuentaPorCobrar"));

		this.jButtonFK_IdTipoTransaccionModuloCuentaPorCobrar.addActionListener(new ButtonActionListener(this,"FK_IdTipoTransaccionModuloCuentaPorCobrar"));

		this.jButtonFK_IdTransaccionCuentaPorCobrar.addActionListener(new ButtonActionListener(this,"FK_IdTransaccionCuentaPorCobrar"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoCuentaPorCobrar.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoCuentaPorCobrarActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoCuentaPorCobrar.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoCuentaPorCobrarActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoCuentaPorCobrar.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoCuentaPorCobrarActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionCuentaPorCobrar.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionCuentaPorCobrarActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionCuentaPorCobrar.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionCuentaPorCobrarActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionCuentaPorCobrar.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionCuentaPorCobrarActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarCuentaPorCobrarActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarCuentaPorCobrar.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CuentaPorCobrarConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosCuentaPorCobrar(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(CuentaPorCobrar cuentaporcobrarAux:this.cuentaporcobrarLogic.getCuentaPorCobrars()) {
					cuentaporcobrarAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(CuentaPorCobrar cuentaporcobrarAux:cuentaporcobrars) {
					cuentaporcobrarAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CuentaPorCobrarConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosCuentaPorCobrarItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingCuentaPorCobrar(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(CuentaPorCobrar cuentaporcobrarAux:this.cuentaporcobrarLogic.getCuentaPorCobrars()) {
						cuentaporcobrarAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(CuentaPorCobrar cuentaporcobrarAux:cuentaporcobrars) {
						cuentaporcobrarAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(CuentaPorCobrar cuentaporcobrarAux:this.cuentaporcobrarLogic.getCuentaPorCobrars()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(CuentaPorCobrar cuentaporcobrarAux:cuentaporcobrars) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaCuentaPorCobrar(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosCuentaPorCobrar.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosCuentaPorCobrar.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosCuentaPorCobrar,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CuentaPorCobrarConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosCuentaPorCobrarItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingCuentaPorCobrar(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosCuentaPorCobrar.getSelectedRows();
			
			CuentaPorCobrar cuentaporcobrarLocal=new CuentaPorCobrar();
			
			//this.seleccionarTodosCuentaPorCobrar(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					cuentaporcobrarLocal =(CuentaPorCobrar) this.cuentaporcobrarLogic.getCuentaPorCobrars().toArray()[this.jTableDatosCuentaPorCobrar.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					cuentaporcobrarLocal =(CuentaPorCobrar) this.cuentaporcobrars.toArray()[this.jTableDatosCuentaPorCobrar.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				cuentaporcobrarLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(CuentaPorCobrar cuentaporcobrarAux:this.cuentaporcobrarLogic.getCuentaPorCobrars()) {
						cuentaporcobrarAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(CuentaPorCobrar cuentaporcobrarAux:cuentaporcobrars) {
						cuentaporcobrarAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaCuentaPorCobrar(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosCuentaPorCobrar.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosCuentaPorCobrar.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosCuentaPorCobrar,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CuentaPorCobrarConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualCuentaPorCobrarItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CuentaPorCobrarConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarCuentaPorCobrarParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CuentaPorCobrarConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralCuentaPorCobrarActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingCuentaPorCobrar(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralCuentaPorCobrar.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(CuentaPorCobrar cuentaporcobrarAux:this.cuentaporcobrarLogic.getCuentaPorCobrars()) {
				
						if(sTipoSeleccionar.equals(CuentaPorCobrarConstantesFunciones.LABEL_FECHA)) {
							existe=true;
							cuentaporcobrarAux.setfecha(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(CuentaPorCobrarConstantesFunciones.LABEL_MONTO)) {
							existe=true;
							cuentaporcobrarAux.setmonto(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(CuentaPorCobrarConstantesFunciones.LABEL_NUMEROCOMPROBANTE)) {
							existe=true;
							cuentaporcobrarAux.setnumero_comprobante(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(CuentaPorCobrarConstantesFunciones.LABEL_DEBITO)) {
							existe=true;
							cuentaporcobrarAux.setdebito(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(CuentaPorCobrarConstantesFunciones.LABEL_CREDITO)) {
							existe=true;
							cuentaporcobrarAux.setcredito(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(CuentaPorCobrarConstantesFunciones.LABEL_DETALLE)) {
							existe=true;
							cuentaporcobrarAux.setdetalle(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(CuentaPorCobrar cuentaporcobrarAux:cuentaporcobrars) {
					
						if(sTipoSeleccionar.equals(CuentaPorCobrarConstantesFunciones.LABEL_FECHA)) {
							existe=true;
							cuentaporcobrarAux.setfecha(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(CuentaPorCobrarConstantesFunciones.LABEL_MONTO)) {
							existe=true;
							cuentaporcobrarAux.setmonto(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(CuentaPorCobrarConstantesFunciones.LABEL_NUMEROCOMPROBANTE)) {
							existe=true;
							cuentaporcobrarAux.setnumero_comprobante(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(CuentaPorCobrarConstantesFunciones.LABEL_DEBITO)) {
							existe=true;
							cuentaporcobrarAux.setdebito(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(CuentaPorCobrarConstantesFunciones.LABEL_CREDITO)) {
							existe=true;
							cuentaporcobrarAux.setcredito(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(CuentaPorCobrarConstantesFunciones.LABEL_DETALLE)) {
							existe=true;
							cuentaporcobrarAux.setdetalle(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaCuentaPorCobrar(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CuentaPorCobrarConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesCuentaPorCobrarActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingCuentaPorCobrar(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioCuentaPorCobrar=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesCuentaPorCobrar.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormCuentaPorCobrar.jComboBoxTiposAccionesFormularioCuentaPorCobrar.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteCuentaPorCobrar) {				
					conSplash=true;//false;										
					
					//this.startProcessCuentaPorCobrar(conSplash);
				
					this.generarReporteCuentaPorCobrarsSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesCuentaPorCobrar.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormCuentaPorCobrar.jComboBoxTiposAccionesFormularioCuentaPorCobrar.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoCuentaPorCobrarsSeleccionados();
				//this.jComboBoxTiposAccionesCuentaPorCobrar.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoCuentaPorCobrarsSeleccionados(false);
				//this.jComboBoxTiposAccionesCuentaPorCobrar.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoCuentaPorCobrarsSeleccionados(true);
				//this.jComboBoxTiposAccionesCuentaPorCobrar.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessCuentaPorCobrar();
				
				this.exportarCuentaPorCobrarsSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesCuentaPorCobrar.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormCuentaPorCobrar.jComboBoxTiposAccionesFormularioCuentaPorCobrar.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionCuentaPorCobrars();
				//this.importarCuentaPorCobrars();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesCuentaPorCobrar.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormCuentaPorCobrar.jComboBoxTiposAccionesFormularioCuentaPorCobrar.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessCuentaPorCobrar();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelCuentaPorCobrarsSeleccionados();
				//this.jComboBoxTiposAccionesCuentaPorCobrar.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Cuenta Por Cobrar", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessCuentaPorCobrar();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoCuentaPorCobrar)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyCuentaPorCobrar(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Cuenta Por Cobrar",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesCuentaPorCobrar.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormCuentaPorCobrar.jComboBoxTiposAccionesFormularioCuentaPorCobrar.setSelectedIndex(0);					
				}	
			} 			
			else if(CuentaPorCobrarBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteCuentaPorCobrar) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessCuentaPorCobrar(conSplash);
					
						//this.actualizarParametrosGeneralCuentaPorCobrar();
						
						this.generarReporteProcesoAccionCuentaPorCobrarsSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesCuentaPorCobrar.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormCuentaPorCobrar.jComboBoxTiposAccionesFormularioCuentaPorCobrar.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(CuentaPorCobrarBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Cuenta Por CobrarES SELECCIONADOS?", "MANTENIMIENTO DE Cuenta Por Cobrar", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessCuentaPorCobrar();
				
						this.actualizarParametrosGeneralCuentaPorCobrar();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.cuentaporcobrarReturnGeneral=cuentaporcobrarLogic.procesarAccionCuentaPorCobrarsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.cuentaporcobrarLogic.getCuentaPorCobrars(),this.cuentaporcobrarParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarCuentaPorCobrarReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesCuentaPorCobrar.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormCuentaPorCobrar.jComboBoxTiposAccionesFormularioCuentaPorCobrar.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralCuentaPorCobrar();
					
					CuentaPorCobrarBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarCuentaPorCobrarReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesCuentaPorCobrar.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormCuentaPorCobrar.jComboBoxTiposAccionesFormularioCuentaPorCobrar.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,CuentaPorCobrarConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessCuentaPorCobrar(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesCuentaPorCobrarActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessCuentaPorCobrar();
			
			if(this.jInternalFrameDetalleFormCuentaPorCobrar==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<CuentaPorCobrar> cuentaporcobrarsSeleccionados=new ArrayList<CuentaPorCobrar>();		
			CuentaPorCobrar cuentaporcobrar=new CuentaPorCobrar();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingCuentaPorCobrar(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesCuentaPorCobrar.getSelectedItem();
			
			
			
			
			cuentaporcobrarsSeleccionados=this.getCuentaPorCobrarsSeleccionados(true);
			//this.sTipoAccion;
			
			if(cuentaporcobrarsSeleccionados.size()==1) {
				for(CuentaPorCobrar cuentaporcobrarAux:cuentaporcobrarsSeleccionados) {
					cuentaporcobrar=cuentaporcobrarAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CuentaPorCobrarConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessCuentaPorCobrar();
			
      		//this.finishProcessCuentaPorCobrar(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarCuentaPorCobrarReturnGeneral() throws Exception {
		if(this.cuentaporcobrarReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.cuentaporcobrarReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.cuentaporcobrarReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.cuentaporcobrarReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.cuentaporcobrarReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.cuentaporcobrarReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingCuentaPorCobrar(false);
		}
		
		if(this.cuentaporcobrarReturnGeneral.getConRetornoLista() || this.cuentaporcobrarReturnGeneral.getConRetornoObjeto()) {
			if(this.cuentaporcobrarReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.cuentaporcobrarLogic.setCuentaPorCobrars(this.cuentaporcobrarReturnGeneral.getCuentaPorCobrars());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.cuentaporcobrarReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.cuentaporcobrarLogic.setCuentaPorCobrar(this.cuentaporcobrarReturnGeneral.getCuentaPorCobrar());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingCuentaPorCobrar(false);
		}
	}
	
	public void actualizarParametrosGeneralCuentaPorCobrar() throws Exception {
		
		
	}
	
	public ArrayList<CuentaPorCobrar> getCuentaPorCobrarsSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<CuentaPorCobrar> cuentaporcobrarsSeleccionados=new ArrayList<CuentaPorCobrar>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioCuentaPorCobrar) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(CuentaPorCobrar cuentaporcobrarAux:cuentaporcobrarLogic.getCuentaPorCobrars()) {
					if(cuentaporcobrarAux.getIsSelected()) {
						cuentaporcobrarsSeleccionados.add(cuentaporcobrarAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(CuentaPorCobrar cuentaporcobrarAux:this.cuentaporcobrars) {
					if(cuentaporcobrarAux.getIsSelected()) {
						cuentaporcobrarsSeleccionados.add(cuentaporcobrarAux);				
					}
				}
			}
			
			if(cuentaporcobrarsSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						cuentaporcobrarsSeleccionados.addAll(this.cuentaporcobrarLogic.getCuentaPorCobrars());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						cuentaporcobrarsSeleccionados.addAll(this.cuentaporcobrars);				
					}
				}
			}
		} else {
			cuentaporcobrarsSeleccionados.add(this.cuentaporcobrar);
		}
		
		return cuentaporcobrarsSeleccionados;
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
	
	public void generarReporteCuentaPorCobrarsSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalCuentaPorCobrarsSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoCuentaPorCobrarsSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoCuentaPorCobrarsSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoCuentaPorCobrarsSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Cuenta Por Cobrar",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesCuentaPorCobrarsSeleccionados() throws Exception {
		ArrayList<CuentaPorCobrar> cuentaporcobrarsSeleccionados=new ArrayList<CuentaPorCobrar>();		
		
		cuentaporcobrarsSeleccionados=this.getCuentaPorCobrarsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteCuentaPorCobrars("Todos",cuentaporcobrarsSeleccionados);
		
	}	
	
	public void generarReporteNormalCuentaPorCobrarsSeleccionados() throws Exception {
		ArrayList<CuentaPorCobrar> cuentaporcobrarsSeleccionados=new ArrayList<CuentaPorCobrar>();		
		
		cuentaporcobrarsSeleccionados=this.getCuentaPorCobrarsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteCuentaPorCobrars("Todos",cuentaporcobrarsSeleccionados);
	}		
	
	public void generarReporteProcesoAccionCuentaPorCobrarsSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<CuentaPorCobrar> cuentaporcobrarsSeleccionados=new ArrayList<CuentaPorCobrar>();
		
		cuentaporcobrarsSeleccionados=this.getCuentaPorCobrarsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteCuentaPorCobrars("Todos",cuentaporcobrarsSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoCuentaPorCobrarsSeleccionados() throws Exception {
		ArrayList<CuentaPorCobrar> cuentaporcobrarsSeleccionados=new ArrayList<CuentaPorCobrar>();		
		
		
		this.abrirInicializarFrameReporteDinamicoCuentaPorCobrar();
		
		
		cuentaporcobrarsSeleccionados=this.getCuentaPorCobrarsSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoCuentaPorCobrar();
		
		
		//this.generarReporteCuentaPorCobrars("Todos",cuentaporcobrarsSeleccionados ,cuentaporcobrarImplementable,cuentaporcobrarImplementableHome);
	}
	
	public void mostrarImportacionCuentaPorCobrars() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionCuentaPorCobrar();
		
		this.abrirFrameImportacionCuentaPorCobrar();		
		
			
		//this.generarReporteCuentaPorCobrars("Todos",cuentaporcobrarsSeleccionados ,cuentaporcobrarImplementable,cuentaporcobrarImplementableHome);
	}
	
	public void importarCuentaPorCobrars() throws Exception {		
	
	}
	
	public void exportarCuentaPorCobrarsSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelCuentaPorCobrarsSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoCuentaPorCobrarsSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlCuentaPorCobrarsSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Cuenta Por Cobrar",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoCuentaPorCobrarsSeleccionados() throws Exception {
		ArrayList<CuentaPorCobrar> cuentaporcobrarsSeleccionados=new ArrayList<CuentaPorCobrar>();		
		
		cuentaporcobrarsSeleccionados=this.getCuentaPorCobrarsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"cuentaporcobrar."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarCuentaPorCobrar(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(CuentaPorCobrar cuentaporcobrarAux:cuentaporcobrarsSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarCuentaPorCobrar(cuentaporcobrarAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//cuentaporcobrarAux.setsDetalleGeneralEntityReporte(cuentaporcobrarAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cuentaporcobrarSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Cuenta Por Cobrar",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarCuentaPorCobrar(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=CuentaPorCobrarConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CuentaPorCobrarConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CuentaPorCobrarConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CuentaPorCobrarConstantesFunciones.LABEL_IDSUCURSAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CuentaPorCobrarConstantesFunciones.LABEL_IDMODULO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CuentaPorCobrarConstantesFunciones.LABEL_IDEJERCICIO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CuentaPorCobrarConstantesFunciones.LABEL_IDMONEDA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CuentaPorCobrarConstantesFunciones.LABEL_IDCLIENTE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CuentaPorCobrarConstantesFunciones.LABEL_IDTRANSACCION;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CuentaPorCobrarConstantesFunciones.LABEL_IDTIPOTRANSACCIONMODULO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CuentaPorCobrarConstantesFunciones.LABEL_IDASIENTOCONTABLE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CuentaPorCobrarConstantesFunciones.LABEL_IDFACTURA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CuentaPorCobrarConstantesFunciones.LABEL_FECHA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CuentaPorCobrarConstantesFunciones.LABEL_MONTO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CuentaPorCobrarConstantesFunciones.LABEL_NUMEROCOMPROBANTE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CuentaPorCobrarConstantesFunciones.LABEL_DEBITO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CuentaPorCobrarConstantesFunciones.LABEL_CREDITO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CuentaPorCobrarConstantesFunciones.LABEL_DETALLE;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarCuentaPorCobrar(CuentaPorCobrar cuentaporcobrar,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=cuentaporcobrar.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=cuentaporcobrar.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=cuentaporcobrar.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cuentaporcobrar.getsucursal_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cuentaporcobrar.getmodulo_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cuentaporcobrar.getejercicio_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cuentaporcobrar.getmoneda_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cuentaporcobrar.getcliente_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cuentaporcobrar.gettransaccion_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cuentaporcobrar.gettipotransaccionmodulo_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cuentaporcobrar.getasientocontable_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cuentaporcobrar.getfactura_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cuentaporcobrar.getfecha().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cuentaporcobrar.getmonto().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cuentaporcobrar.getnumero_comprobante();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cuentaporcobrar.getdebito().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cuentaporcobrar.getcredito().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cuentaporcobrar.getdetalle();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelCuentaPorCobrarsSeleccionados() throws Exception {
		ArrayList<CuentaPorCobrar> cuentaporcobrarsSeleccionados=new ArrayList<CuentaPorCobrar>();		
		
		cuentaporcobrarsSeleccionados=this.getCuentaPorCobrarsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"cuentaporcobrar.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("CuentaPorCobrars");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelCuentaPorCobrar(row);				
				iRow++;
			}				
			
			for(CuentaPorCobrar cuentaporcobrarAux:cuentaporcobrarsSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelCuentaPorCobrar(cuentaporcobrarAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cuentaporcobrarSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Cuenta Por Cobrar",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlCuentaPorCobrarsSeleccionados() throws Exception {
		ArrayList<CuentaPorCobrar> cuentaporcobrarsSeleccionados=new ArrayList<CuentaPorCobrar>();		
		
		cuentaporcobrarsSeleccionados=this.getCuentaPorCobrarsSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"cuentaporcobrar.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("cuentaporcobrars");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("cuentaporcobrar");
			//elementRoot.appendChild(element);
		
			for(CuentaPorCobrar cuentaporcobrarAux:cuentaporcobrarsSeleccionados) {
				element = document.createElement("cuentaporcobrar");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlCuentaPorCobrar(cuentaporcobrarAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cuentaporcobrarSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Cuenta Por Cobrar",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelCuentaPorCobrar(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(CuentaPorCobrarConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(CuentaPorCobrarConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(CuentaPorCobrarConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(CuentaPorCobrarConstantesFunciones.LABEL_IDSUCURSAL);
		cell = row.createCell(iColumn++);cell.setCellValue(CuentaPorCobrarConstantesFunciones.LABEL_IDMODULO);
		cell = row.createCell(iColumn++);cell.setCellValue(CuentaPorCobrarConstantesFunciones.LABEL_IDEJERCICIO);
		cell = row.createCell(iColumn++);cell.setCellValue(CuentaPorCobrarConstantesFunciones.LABEL_IDMONEDA);
		cell = row.createCell(iColumn++);cell.setCellValue(CuentaPorCobrarConstantesFunciones.LABEL_IDCLIENTE);
		cell = row.createCell(iColumn++);cell.setCellValue(CuentaPorCobrarConstantesFunciones.LABEL_IDTRANSACCION);
		cell = row.createCell(iColumn++);cell.setCellValue(CuentaPorCobrarConstantesFunciones.LABEL_IDTIPOTRANSACCIONMODULO);
		cell = row.createCell(iColumn++);cell.setCellValue(CuentaPorCobrarConstantesFunciones.LABEL_IDASIENTOCONTABLE);
		cell = row.createCell(iColumn++);cell.setCellValue(CuentaPorCobrarConstantesFunciones.LABEL_IDFACTURA);
		cell = row.createCell(iColumn++);cell.setCellValue(CuentaPorCobrarConstantesFunciones.LABEL_FECHA);
		cell = row.createCell(iColumn++);cell.setCellValue(CuentaPorCobrarConstantesFunciones.LABEL_MONTO);
		cell = row.createCell(iColumn++);cell.setCellValue(CuentaPorCobrarConstantesFunciones.LABEL_NUMEROCOMPROBANTE);
		cell = row.createCell(iColumn++);cell.setCellValue(CuentaPorCobrarConstantesFunciones.LABEL_DEBITO);
		cell = row.createCell(iColumn++);cell.setCellValue(CuentaPorCobrarConstantesFunciones.LABEL_CREDITO);
		cell = row.createCell(iColumn++);cell.setCellValue(CuentaPorCobrarConstantesFunciones.LABEL_DETALLE);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelCuentaPorCobrar(CuentaPorCobrar cuentaporcobrar,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(cuentaporcobrar.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(cuentaporcobrar.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(cuentaporcobrar.getsucursal_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(cuentaporcobrar.getmodulo_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(cuentaporcobrar.getejercicio_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(cuentaporcobrar.getmoneda_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(cuentaporcobrar.getcliente_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(cuentaporcobrar.gettransaccion_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(cuentaporcobrar.gettipotransaccionmodulo_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(cuentaporcobrar.getasientocontable_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(cuentaporcobrar.getfactura_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(cuentaporcobrar.getfecha());
		cell = row.createCell(iColumn++);cell.setCellValue(cuentaporcobrar.getmonto());
		cell = row.createCell(iColumn++);cell.setCellValue(cuentaporcobrar.getnumero_comprobante());
		cell = row.createCell(iColumn++);cell.setCellValue(cuentaporcobrar.getdebito());
		cell = row.createCell(iColumn++);cell.setCellValue(cuentaporcobrar.getcredito());
		cell = row.createCell(iColumn++);cell.setCellValue(cuentaporcobrar.getdetalle());				
	}
	
	public void setFilaDatosExportarXmlCuentaPorCobrar(CuentaPorCobrar cuentaporcobrar,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(CuentaPorCobrarConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(cuentaporcobrar.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(CuentaPorCobrarConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(cuentaporcobrar.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(CuentaPorCobrarConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(cuentaporcobrar.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementsucursal_descripcion = document.createElement(CuentaPorCobrarConstantesFunciones.IDSUCURSAL);
		elementsucursal_descripcion.appendChild(document.createTextNode(cuentaporcobrar.getsucursal_descripcion()));
		element.appendChild(elementsucursal_descripcion);

		Element elementmodulo_descripcion = document.createElement(CuentaPorCobrarConstantesFunciones.IDMODULO);
		elementmodulo_descripcion.appendChild(document.createTextNode(cuentaporcobrar.getmodulo_descripcion()));
		element.appendChild(elementmodulo_descripcion);

		Element elementejercicio_descripcion = document.createElement(CuentaPorCobrarConstantesFunciones.IDEJERCICIO);
		elementejercicio_descripcion.appendChild(document.createTextNode(cuentaporcobrar.getejercicio_descripcion()));
		element.appendChild(elementejercicio_descripcion);

		Element elementmoneda_descripcion = document.createElement(CuentaPorCobrarConstantesFunciones.IDMONEDA);
		elementmoneda_descripcion.appendChild(document.createTextNode(cuentaporcobrar.getmoneda_descripcion()));
		element.appendChild(elementmoneda_descripcion);

		Element elementcliente_descripcion = document.createElement(CuentaPorCobrarConstantesFunciones.IDCLIENTE);
		elementcliente_descripcion.appendChild(document.createTextNode(cuentaporcobrar.getcliente_descripcion()));
		element.appendChild(elementcliente_descripcion);

		Element elementtransaccion_descripcion = document.createElement(CuentaPorCobrarConstantesFunciones.IDTRANSACCION);
		elementtransaccion_descripcion.appendChild(document.createTextNode(cuentaporcobrar.gettransaccion_descripcion()));
		element.appendChild(elementtransaccion_descripcion);

		Element elementtipotransaccionmodulo_descripcion = document.createElement(CuentaPorCobrarConstantesFunciones.IDTIPOTRANSACCIONMODULO);
		elementtipotransaccionmodulo_descripcion.appendChild(document.createTextNode(cuentaporcobrar.gettipotransaccionmodulo_descripcion()));
		element.appendChild(elementtipotransaccionmodulo_descripcion);

		Element elementasientocontable_descripcion = document.createElement(CuentaPorCobrarConstantesFunciones.IDASIENTOCONTABLE);
		elementasientocontable_descripcion.appendChild(document.createTextNode(cuentaporcobrar.getasientocontable_descripcion()));
		element.appendChild(elementasientocontable_descripcion);

		Element elementfactura_descripcion = document.createElement(CuentaPorCobrarConstantesFunciones.IDFACTURA);
		elementfactura_descripcion.appendChild(document.createTextNode(cuentaporcobrar.getfactura_descripcion()));
		element.appendChild(elementfactura_descripcion);

		Element elementfecha = document.createElement(CuentaPorCobrarConstantesFunciones.FECHA);
		elementfecha.appendChild(document.createTextNode(cuentaporcobrar.getfecha().toString().trim()));
		element.appendChild(elementfecha);

		Element elementmonto = document.createElement(CuentaPorCobrarConstantesFunciones.MONTO);
		elementmonto.appendChild(document.createTextNode(cuentaporcobrar.getmonto().toString().trim()));
		element.appendChild(elementmonto);

		Element elementnumero_comprobante = document.createElement(CuentaPorCobrarConstantesFunciones.NUMEROCOMPROBANTE);
		elementnumero_comprobante.appendChild(document.createTextNode(cuentaporcobrar.getnumero_comprobante().trim()));
		element.appendChild(elementnumero_comprobante);

		Element elementdebito = document.createElement(CuentaPorCobrarConstantesFunciones.DEBITO);
		elementdebito.appendChild(document.createTextNode(cuentaporcobrar.getdebito().toString().trim()));
		element.appendChild(elementdebito);

		Element elementcredito = document.createElement(CuentaPorCobrarConstantesFunciones.CREDITO);
		elementcredito.appendChild(document.createTextNode(cuentaporcobrar.getcredito().toString().trim()));
		element.appendChild(elementcredito);

		Element elementdetalle = document.createElement(CuentaPorCobrarConstantesFunciones.DETALLE);
		elementdetalle.appendChild(document.createTextNode(cuentaporcobrar.getdetalle().trim()));
		element.appendChild(elementdetalle);
	}
	
	public void generarReporteGroupGenericoCuentaPorCobrarsSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<CuentaPorCobrar> cuentaporcobrarsSeleccionados=new ArrayList<CuentaPorCobrar>();
		
		cuentaporcobrarsSeleccionados=this.getCuentaPorCobrarsSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoCuentaPorCobrar(cuentaporcobrarsSeleccionados);
		
		this.generarReporteCuentaPorCobrars("Todos",cuentaporcobrarsSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoCuentaPorCobrar(ArrayList<CuentaPorCobrar> cuentaporcobrarsSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(CuentaPorCobrar cuentaporcobrarAux:cuentaporcobrarsSeleccionados) {
				cuentaporcobrarAux.setsDetalleGeneralEntityReporte(cuentaporcobrarAux.toString());
			
				if(sTipoSeleccionar.equals(CuentaPorCobrarConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					cuentaporcobrarAux.setsDescripcionGeneralEntityReporte1(cuentaporcobrarAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(CuentaPorCobrarConstantesFunciones.LABEL_IDSUCURSAL)) {
					existe=true;
					cuentaporcobrarAux.setsDescripcionGeneralEntityReporte1(cuentaporcobrarAux.getsucursal_descripcion());
				}
				 else if(sTipoSeleccionar.equals(CuentaPorCobrarConstantesFunciones.LABEL_IDMODULO)) {
					existe=true;
					cuentaporcobrarAux.setsDescripcionGeneralEntityReporte1(cuentaporcobrarAux.getmodulo_descripcion());
				}
				 else if(sTipoSeleccionar.equals(CuentaPorCobrarConstantesFunciones.LABEL_IDEJERCICIO)) {
					existe=true;
					cuentaporcobrarAux.setsDescripcionGeneralEntityReporte1(cuentaporcobrarAux.getejercicio_descripcion());
				}
				 else if(sTipoSeleccionar.equals(CuentaPorCobrarConstantesFunciones.LABEL_IDMONEDA)) {
					existe=true;
					cuentaporcobrarAux.setsDescripcionGeneralEntityReporte1(cuentaporcobrarAux.getmoneda_descripcion());
				}
				 else if(sTipoSeleccionar.equals(CuentaPorCobrarConstantesFunciones.LABEL_IDCLIENTE)) {
					existe=true;
					cuentaporcobrarAux.setsDescripcionGeneralEntityReporte1(cuentaporcobrarAux.getcliente_descripcion());
				}
				 else if(sTipoSeleccionar.equals(CuentaPorCobrarConstantesFunciones.LABEL_IDTRANSACCION)) {
					existe=true;
					cuentaporcobrarAux.setsDescripcionGeneralEntityReporte1(cuentaporcobrarAux.gettransaccion_descripcion());
				}
				 else if(sTipoSeleccionar.equals(CuentaPorCobrarConstantesFunciones.LABEL_IDTIPOTRANSACCIONMODULO)) {
					existe=true;
					cuentaporcobrarAux.setsDescripcionGeneralEntityReporte1(cuentaporcobrarAux.gettipotransaccionmodulo_descripcion());
				}
				 else if(sTipoSeleccionar.equals(CuentaPorCobrarConstantesFunciones.LABEL_IDASIENTOCONTABLE)) {
					existe=true;
					cuentaporcobrarAux.setsDescripcionGeneralEntityReporte1(cuentaporcobrarAux.getasientocontable_descripcion());
				}
				 else if(sTipoSeleccionar.equals(CuentaPorCobrarConstantesFunciones.LABEL_IDFACTURA)) {
					existe=true;
					cuentaporcobrarAux.setsDescripcionGeneralEntityReporte1(cuentaporcobrarAux.getfactura_descripcion());
				}
				 else if(sTipoSeleccionar.equals(CuentaPorCobrarConstantesFunciones.LABEL_FECHA)) {
					existe=true;
					cuentaporcobrarAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(cuentaporcobrarAux.getfecha()));
				}
				 else if(sTipoSeleccionar.equals(CuentaPorCobrarConstantesFunciones.LABEL_NUMEROCOMPROBANTE)) {
					existe=true;
					cuentaporcobrarAux.setsDescripcionGeneralEntityReporte1(cuentaporcobrarAux.getnumero_comprobante());
				}
				 else if(sTipoSeleccionar.equals(CuentaPorCobrarConstantesFunciones.LABEL_DETALLE)) {
					existe=true;
					cuentaporcobrarAux.setsDescripcionGeneralEntityReporte1(cuentaporcobrarAux.getdetalle());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CuentaPorCobrarConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesCuentaPorCobrar(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoCuentaPorCobrar=true;
				this.isVisibilidadCeldaNuevoRelacionesCuentaPorCobrar=true;
				this.isVisibilidadCeldaGuardarCambiosCuentaPorCobrar=true;
			}
			
			this.isVisibilidadCeldaModificarCuentaPorCobrar=false;
			this.isVisibilidadCeldaActualizarCuentaPorCobrar=false;
			this.isVisibilidadCeldaEliminarCuentaPorCobrar=false;
			this.isVisibilidadCeldaCancelarCuentaPorCobrar=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCuentaPorCobrar=true;
				} else {
					this.isVisibilidadCeldaGuardarCuentaPorCobrar=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoCuentaPorCobrar=false;
			this.isVisibilidadCeldaNuevoRelacionesCuentaPorCobrar=false;
			this.isVisibilidadCeldaGuardarCambiosCuentaPorCobrar=false;
			this.isVisibilidadCeldaModificarCuentaPorCobrar=false;
			this.isVisibilidadCeldaActualizarCuentaPorCobrar=true;
			this.isVisibilidadCeldaEliminarCuentaPorCobrar=false;
			this.isVisibilidadCeldaCancelarCuentaPorCobrar=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCuentaPorCobrar=true;
				} else {
					this.isVisibilidadCeldaGuardarCuentaPorCobrar=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoCuentaPorCobrar=false;
			this.isVisibilidadCeldaNuevoRelacionesCuentaPorCobrar=false;
			this.isVisibilidadCeldaGuardarCambiosCuentaPorCobrar=false;
			this.isVisibilidadCeldaModificarCuentaPorCobrar=false;
			this.isVisibilidadCeldaActualizarCuentaPorCobrar=true;
			this.isVisibilidadCeldaEliminarCuentaPorCobrar=true;
			this.isVisibilidadCeldaCancelarCuentaPorCobrar=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCuentaPorCobrar=true;
				} else {
					this.isVisibilidadCeldaGuardarCuentaPorCobrar=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoCuentaPorCobrar=false;
			this.isVisibilidadCeldaNuevoRelacionesCuentaPorCobrar=false;
			this.isVisibilidadCeldaGuardarCambiosCuentaPorCobrar=false;
			this.isVisibilidadCeldaModificarCuentaPorCobrar=false;
			this.isVisibilidadCeldaActualizarCuentaPorCobrar=true;
			this.isVisibilidadCeldaEliminarCuentaPorCobrar=false;
			this.isVisibilidadCeldaCancelarCuentaPorCobrar=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCuentaPorCobrar=false;
				} else {
					this.isVisibilidadCeldaGuardarCuentaPorCobrar=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoCuentaPorCobrar=true;
			this.isVisibilidadCeldaNuevoRelacionesCuentaPorCobrar=true;
			this.isVisibilidadCeldaGuardarCambiosCuentaPorCobrar=true;
			this.isVisibilidadCeldaModificarCuentaPorCobrar=false;
			this.isVisibilidadCeldaActualizarCuentaPorCobrar=false;
			this.isVisibilidadCeldaEliminarCuentaPorCobrar=false;
			this.isVisibilidadCeldaCancelarCuentaPorCobrar=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCuentaPorCobrar=true;
				} else {
					this.isVisibilidadCeldaGuardarCuentaPorCobrar=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoCuentaPorCobrar=false;
			this.isVisibilidadCeldaNuevoRelacionesCuentaPorCobrar=false;
			this.isVisibilidadCeldaGuardarCambiosCuentaPorCobrar=false;
			this.isVisibilidadCeldaActualizarCuentaPorCobrar=false;
			this.isVisibilidadCeldaEliminarCuentaPorCobrar=false;
			this.isVisibilidadCeldaCancelarCuentaPorCobrar=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCuentaPorCobrar=false;
				} else {
					this.isVisibilidadCeldaGuardarCuentaPorCobrar=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoCuentaPorCobrar=false;
			this.isVisibilidadCeldaNuevoRelacionesCuentaPorCobrar=false;
			this.isVisibilidadCeldaGuardarCambiosCuentaPorCobrar=false;
			this.isVisibilidadCeldaModificarCuentaPorCobrar=true;
			this.isVisibilidadCeldaActualizarCuentaPorCobrar=false;
			this.isVisibilidadCeldaEliminarCuentaPorCobrar=false;
			this.isVisibilidadCeldaCancelarCuentaPorCobrar=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCuentaPorCobrar=false;
				} else {
					this.isVisibilidadCeldaGuardarCuentaPorCobrar=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(CuentaPorCobrarJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoCuentaPorCobrar=true;
			this.isVisibilidadCeldaNuevoRelacionesCuentaPorCobrar=true;
			this.isVisibilidadCeldaGuardarCambiosCuentaPorCobrar=true;
		} else {
			this.actualizarEstadoPanelsCuentaPorCobrar(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarCuentaPorCobrar=false;
			//this.isVisibilidadCeldaVerFormCuentaPorCobrar=false;
			this.isVisibilidadCeldaDuplicarCuentaPorCobrar=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!cuentaporcobrarSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesCuentaPorCobrar=false;
		} else {
			this.isVisibilidadCeldaNuevoCuentaPorCobrar=false;
			this.isVisibilidadCeldaGuardarCambiosCuentaPorCobrar=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(cuentaporcobrarSessionBean.getEsGuardarRelacionado()) {
			if(!cuentaporcobrarSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesCuentaPorCobrar=false;												
			}
			
			this.jButtonCerrarCuentaPorCobrar.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesCuentaPorCobrar=false;
		}
		
		if(!this.permiteMantenimiento(this.cuentaporcobrar)) {
			this.isVisibilidadCeldaActualizarCuentaPorCobrar=false;
			this.isVisibilidadCeldaEliminarCuentaPorCobrar=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesCuentaPorCobrar() {
	}
	
	public void actualizarEstadoPanelsCuentaPorCobrar(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionCuentaPorCobrar!=null) {
				this.jScrollPanelDatosEdicionCuentaPorCobrar.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCuentaPorCobrar!=null) {
				this.jTabbedPaneBusquedasCuentaPorCobrar.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosCuentaPorCobrar!=null) {
				this.jScrollPanelDatosCuentaPorCobrar.setVisible(true);
			}
			
			if(this.jPanelPaginacionCuentaPorCobrar!=null) {
				this.jPanelPaginacionCuentaPorCobrar.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesCuentaPorCobrar!=null) {
				this.jPanelParametrosReportesCuentaPorCobrar.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionCuentaPorCobrar!=null) {
				this.jScrollPanelDatosEdicionCuentaPorCobrar.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCuentaPorCobrar!=null) {
				this.jTabbedPaneBusquedasCuentaPorCobrar.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosCuentaPorCobrar!=null) {
				this.jScrollPanelDatosCuentaPorCobrar.setVisible(false);
			}
			
			if(this.jPanelPaginacionCuentaPorCobrar!=null) {
				this.jPanelPaginacionCuentaPorCobrar.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesCuentaPorCobrar!=null) {
				this.jPanelParametrosReportesCuentaPorCobrar.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionCuentaPorCobrar!=null) {
				this.jScrollPanelDatosEdicionCuentaPorCobrar.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCuentaPorCobrar!=null) {
				this.jTabbedPaneBusquedasCuentaPorCobrar.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosCuentaPorCobrar!=null) {
				this.jScrollPanelDatosCuentaPorCobrar.setVisible(false);
			}
			
			if(this.jPanelPaginacionCuentaPorCobrar!=null) {
				this.jPanelPaginacionCuentaPorCobrar.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesCuentaPorCobrar!=null) {
				this.jPanelParametrosReportesCuentaPorCobrar.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionCuentaPorCobrar!=null) {
				this.jScrollPanelDatosEdicionCuentaPorCobrar.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCuentaPorCobrar!=null) {
				this.jTabbedPaneBusquedasCuentaPorCobrar.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosCuentaPorCobrar!=null) {
				this.jScrollPanelDatosCuentaPorCobrar.setVisible(false);
			}
			
			if(this.jPanelPaginacionCuentaPorCobrar!=null) {
				this.jPanelPaginacionCuentaPorCobrar.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesCuentaPorCobrar!=null) {
				this.jPanelParametrosReportesCuentaPorCobrar.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionCuentaPorCobrar!=null) {
				this.jScrollPanelDatosEdicionCuentaPorCobrar.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCuentaPorCobrar!=null) {
				this.jTabbedPaneBusquedasCuentaPorCobrar.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosCuentaPorCobrar!=null) {
				this.jScrollPanelDatosCuentaPorCobrar.setVisible(true);
			}
			
			if(this.jPanelPaginacionCuentaPorCobrar!=null) {
				this.jPanelPaginacionCuentaPorCobrar.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesCuentaPorCobrar!=null) {
				this.jPanelParametrosReportesCuentaPorCobrar.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionCuentaPorCobrar!=null) {
				this.jScrollPanelDatosEdicionCuentaPorCobrar.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCuentaPorCobrar!=null) {
				this.jTabbedPaneBusquedasCuentaPorCobrar.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosCuentaPorCobrar!=null) {
				this.jScrollPanelDatosCuentaPorCobrar.setVisible(true);
			}
			
			if(this.jPanelPaginacionCuentaPorCobrar!=null) {
				this.jPanelPaginacionCuentaPorCobrar.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesCuentaPorCobrar!=null) {
				this.jPanelParametrosReportesCuentaPorCobrar.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionCuentaPorCobrar!=null) {
				this.jScrollPanelDatosEdicionCuentaPorCobrar.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCuentaPorCobrar!=null) {
				this.jTabbedPaneBusquedasCuentaPorCobrar.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosCuentaPorCobrar!=null) {
				this.jScrollPanelDatosCuentaPorCobrar.setVisible(true);
			}
			
			if(this.jPanelPaginacionCuentaPorCobrar!=null) {
				this.jPanelPaginacionCuentaPorCobrar.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesCuentaPorCobrar!=null) {
				this.jPanelParametrosReportesCuentaPorCobrar.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.cuentaporcobrarSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasCuentaPorCobrar!=null) {
					this.jTabbedPaneBusquedasCuentaPorCobrar.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesCuentaPorCobrar!=null) {
				this.jPanelParametrosReportesCuentaPorCobrar.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.cuentaporcobrarSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCuentaPorCobrar!=null) {
				this.jTabbedPaneBusquedasCuentaPorCobrar.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesCuentaPorCobrar!=null) {
				this.jPanelParametrosReportesCuentaPorCobrar.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadFK_IdAsientoContable=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdAsientoContable) {this.jTabbedPaneBusquedasCuentaPorCobrar.remove(jPanelFK_IdAsientoContableCuentaPorCobrar);}

			this.isVisibilidadFK_IdCliente=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdCliente) {this.jTabbedPaneBusquedasCuentaPorCobrar.remove(jPanelFK_IdClienteCuentaPorCobrar);}

			this.isVisibilidadFK_IdFactura=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdFactura) {this.jTabbedPaneBusquedasCuentaPorCobrar.remove(jPanelFK_IdFacturaCuentaPorCobrar);}

			this.isVisibilidadFK_IdTipoTransaccionModulo=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdTipoTransaccionModulo) {this.jTabbedPaneBusquedasCuentaPorCobrar.remove(jPanelFK_IdTipoTransaccionModuloCuentaPorCobrar);}

			this.isVisibilidadFK_IdTransaccion=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdTransaccion) {this.jTabbedPaneBusquedasCuentaPorCobrar.remove(jPanelFK_IdTransaccionCuentaPorCobrar);}
		}
		
	}

	public void setVisibilidadBusquedasParaSucursal(Boolean isParaSucursal){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaSucursalNegation=!isParaSucursal;

			this.isVisibilidadFK_IdAsientoContable=isParaSucursalNegation;
			if(!this.isVisibilidadFK_IdAsientoContable) {this.jTabbedPaneBusquedasCuentaPorCobrar.remove(jPanelFK_IdAsientoContableCuentaPorCobrar);}

			this.isVisibilidadFK_IdCliente=isParaSucursalNegation;
			if(!this.isVisibilidadFK_IdCliente) {this.jTabbedPaneBusquedasCuentaPorCobrar.remove(jPanelFK_IdClienteCuentaPorCobrar);}

			this.isVisibilidadFK_IdFactura=isParaSucursalNegation;
			if(!this.isVisibilidadFK_IdFactura) {this.jTabbedPaneBusquedasCuentaPorCobrar.remove(jPanelFK_IdFacturaCuentaPorCobrar);}

			this.isVisibilidadFK_IdTipoTransaccionModulo=isParaSucursalNegation;
			if(!this.isVisibilidadFK_IdTipoTransaccionModulo) {this.jTabbedPaneBusquedasCuentaPorCobrar.remove(jPanelFK_IdTipoTransaccionModuloCuentaPorCobrar);}

			this.isVisibilidadFK_IdTransaccion=isParaSucursalNegation;
			if(!this.isVisibilidadFK_IdTransaccion) {this.jTabbedPaneBusquedasCuentaPorCobrar.remove(jPanelFK_IdTransaccionCuentaPorCobrar);}
		}
		
	}

	public void setVisibilidadBusquedasParaModulo(Boolean isParaModulo){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaModuloNegation=!isParaModulo;

			this.isVisibilidadFK_IdAsientoContable=isParaModuloNegation;
			if(!this.isVisibilidadFK_IdAsientoContable) {this.jTabbedPaneBusquedasCuentaPorCobrar.remove(jPanelFK_IdAsientoContableCuentaPorCobrar);}

			this.isVisibilidadFK_IdCliente=isParaModuloNegation;
			if(!this.isVisibilidadFK_IdCliente) {this.jTabbedPaneBusquedasCuentaPorCobrar.remove(jPanelFK_IdClienteCuentaPorCobrar);}

			this.isVisibilidadFK_IdFactura=isParaModuloNegation;
			if(!this.isVisibilidadFK_IdFactura) {this.jTabbedPaneBusquedasCuentaPorCobrar.remove(jPanelFK_IdFacturaCuentaPorCobrar);}

			this.isVisibilidadFK_IdTipoTransaccionModulo=isParaModuloNegation;
			if(!this.isVisibilidadFK_IdTipoTransaccionModulo) {this.jTabbedPaneBusquedasCuentaPorCobrar.remove(jPanelFK_IdTipoTransaccionModuloCuentaPorCobrar);}

			this.isVisibilidadFK_IdTransaccion=isParaModuloNegation;
			if(!this.isVisibilidadFK_IdTransaccion) {this.jTabbedPaneBusquedasCuentaPorCobrar.remove(jPanelFK_IdTransaccionCuentaPorCobrar);}
		}
		
	}

	public void setVisibilidadBusquedasParaEjercicio(Boolean isParaEjercicio){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEjercicioNegation=!isParaEjercicio;

			this.isVisibilidadFK_IdAsientoContable=isParaEjercicioNegation;
			if(!this.isVisibilidadFK_IdAsientoContable) {this.jTabbedPaneBusquedasCuentaPorCobrar.remove(jPanelFK_IdAsientoContableCuentaPorCobrar);}

			this.isVisibilidadFK_IdCliente=isParaEjercicioNegation;
			if(!this.isVisibilidadFK_IdCliente) {this.jTabbedPaneBusquedasCuentaPorCobrar.remove(jPanelFK_IdClienteCuentaPorCobrar);}

			this.isVisibilidadFK_IdFactura=isParaEjercicioNegation;
			if(!this.isVisibilidadFK_IdFactura) {this.jTabbedPaneBusquedasCuentaPorCobrar.remove(jPanelFK_IdFacturaCuentaPorCobrar);}

			this.isVisibilidadFK_IdTipoTransaccionModulo=isParaEjercicioNegation;
			if(!this.isVisibilidadFK_IdTipoTransaccionModulo) {this.jTabbedPaneBusquedasCuentaPorCobrar.remove(jPanelFK_IdTipoTransaccionModuloCuentaPorCobrar);}

			this.isVisibilidadFK_IdTransaccion=isParaEjercicioNegation;
			if(!this.isVisibilidadFK_IdTransaccion) {this.jTabbedPaneBusquedasCuentaPorCobrar.remove(jPanelFK_IdTransaccionCuentaPorCobrar);}
		}
		
	}

	public void setVisibilidadBusquedasParaMoneda(Boolean isParaMoneda){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaMonedaNegation=!isParaMoneda;

			this.isVisibilidadFK_IdAsientoContable=isParaMonedaNegation;
			if(!this.isVisibilidadFK_IdAsientoContable) {this.jTabbedPaneBusquedasCuentaPorCobrar.remove(jPanelFK_IdAsientoContableCuentaPorCobrar);}

			this.isVisibilidadFK_IdCliente=isParaMonedaNegation;
			if(!this.isVisibilidadFK_IdCliente) {this.jTabbedPaneBusquedasCuentaPorCobrar.remove(jPanelFK_IdClienteCuentaPorCobrar);}

			this.isVisibilidadFK_IdFactura=isParaMonedaNegation;
			if(!this.isVisibilidadFK_IdFactura) {this.jTabbedPaneBusquedasCuentaPorCobrar.remove(jPanelFK_IdFacturaCuentaPorCobrar);}

			this.isVisibilidadFK_IdTipoTransaccionModulo=isParaMonedaNegation;
			if(!this.isVisibilidadFK_IdTipoTransaccionModulo) {this.jTabbedPaneBusquedasCuentaPorCobrar.remove(jPanelFK_IdTipoTransaccionModuloCuentaPorCobrar);}

			this.isVisibilidadFK_IdTransaccion=isParaMonedaNegation;
			if(!this.isVisibilidadFK_IdTransaccion) {this.jTabbedPaneBusquedasCuentaPorCobrar.remove(jPanelFK_IdTransaccionCuentaPorCobrar);}
		}
		
	}

	public void setVisibilidadBusquedasParaCliente(Boolean isParaCliente){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaClienteNegation=!isParaCliente;

			this.isVisibilidadFK_IdAsientoContable=isParaClienteNegation;
			if(!this.isVisibilidadFK_IdAsientoContable) {this.jTabbedPaneBusquedasCuentaPorCobrar.remove(jPanelFK_IdAsientoContableCuentaPorCobrar);}

			this.isVisibilidadFK_IdCliente=isParaCliente;
			if(!this.isVisibilidadFK_IdCliente) {this.jTabbedPaneBusquedasCuentaPorCobrar.remove(jPanelFK_IdClienteCuentaPorCobrar);}

			this.isVisibilidadFK_IdFactura=isParaClienteNegation;
			if(!this.isVisibilidadFK_IdFactura) {this.jTabbedPaneBusquedasCuentaPorCobrar.remove(jPanelFK_IdFacturaCuentaPorCobrar);}

			this.isVisibilidadFK_IdTipoTransaccionModulo=isParaClienteNegation;
			if(!this.isVisibilidadFK_IdTipoTransaccionModulo) {this.jTabbedPaneBusquedasCuentaPorCobrar.remove(jPanelFK_IdTipoTransaccionModuloCuentaPorCobrar);}

			this.isVisibilidadFK_IdTransaccion=isParaClienteNegation;
			if(!this.isVisibilidadFK_IdTransaccion) {this.jTabbedPaneBusquedasCuentaPorCobrar.remove(jPanelFK_IdTransaccionCuentaPorCobrar);}
		}
		
	}

	public void setVisibilidadBusquedasParaTransaccion(Boolean isParaTransaccion){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaTransaccionNegation=!isParaTransaccion;

			this.isVisibilidadFK_IdAsientoContable=isParaTransaccionNegation;
			if(!this.isVisibilidadFK_IdAsientoContable) {this.jTabbedPaneBusquedasCuentaPorCobrar.remove(jPanelFK_IdAsientoContableCuentaPorCobrar);}

			this.isVisibilidadFK_IdCliente=isParaTransaccionNegation;
			if(!this.isVisibilidadFK_IdCliente) {this.jTabbedPaneBusquedasCuentaPorCobrar.remove(jPanelFK_IdClienteCuentaPorCobrar);}

			this.isVisibilidadFK_IdFactura=isParaTransaccionNegation;
			if(!this.isVisibilidadFK_IdFactura) {this.jTabbedPaneBusquedasCuentaPorCobrar.remove(jPanelFK_IdFacturaCuentaPorCobrar);}

			this.isVisibilidadFK_IdTipoTransaccionModulo=isParaTransaccionNegation;
			if(!this.isVisibilidadFK_IdTipoTransaccionModulo) {this.jTabbedPaneBusquedasCuentaPorCobrar.remove(jPanelFK_IdTipoTransaccionModuloCuentaPorCobrar);}

			this.isVisibilidadFK_IdTransaccion=isParaTransaccion;
			if(!this.isVisibilidadFK_IdTransaccion) {this.jTabbedPaneBusquedasCuentaPorCobrar.remove(jPanelFK_IdTransaccionCuentaPorCobrar);}
		}
		
	}

	public void setVisibilidadBusquedasParaTipoTransaccionModulo(Boolean isParaTipoTransaccionModulo){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaTipoTransaccionModuloNegation=!isParaTipoTransaccionModulo;

			this.isVisibilidadFK_IdAsientoContable=isParaTipoTransaccionModuloNegation;
			if(!this.isVisibilidadFK_IdAsientoContable) {this.jTabbedPaneBusquedasCuentaPorCobrar.remove(jPanelFK_IdAsientoContableCuentaPorCobrar);}

			this.isVisibilidadFK_IdCliente=isParaTipoTransaccionModuloNegation;
			if(!this.isVisibilidadFK_IdCliente) {this.jTabbedPaneBusquedasCuentaPorCobrar.remove(jPanelFK_IdClienteCuentaPorCobrar);}

			this.isVisibilidadFK_IdFactura=isParaTipoTransaccionModuloNegation;
			if(!this.isVisibilidadFK_IdFactura) {this.jTabbedPaneBusquedasCuentaPorCobrar.remove(jPanelFK_IdFacturaCuentaPorCobrar);}

			this.isVisibilidadFK_IdTipoTransaccionModulo=isParaTipoTransaccionModulo;
			if(!this.isVisibilidadFK_IdTipoTransaccionModulo) {this.jTabbedPaneBusquedasCuentaPorCobrar.remove(jPanelFK_IdTipoTransaccionModuloCuentaPorCobrar);}

			this.isVisibilidadFK_IdTransaccion=isParaTipoTransaccionModuloNegation;
			if(!this.isVisibilidadFK_IdTransaccion) {this.jTabbedPaneBusquedasCuentaPorCobrar.remove(jPanelFK_IdTransaccionCuentaPorCobrar);}
		}
		
	}

	public void setVisibilidadBusquedasParaAsientoContable(Boolean isParaAsientoContable){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaAsientoContableNegation=!isParaAsientoContable;

			this.isVisibilidadFK_IdAsientoContable=isParaAsientoContable;
			if(!this.isVisibilidadFK_IdAsientoContable) {this.jTabbedPaneBusquedasCuentaPorCobrar.remove(jPanelFK_IdAsientoContableCuentaPorCobrar);}

			this.isVisibilidadFK_IdCliente=isParaAsientoContableNegation;
			if(!this.isVisibilidadFK_IdCliente) {this.jTabbedPaneBusquedasCuentaPorCobrar.remove(jPanelFK_IdClienteCuentaPorCobrar);}

			this.isVisibilidadFK_IdFactura=isParaAsientoContableNegation;
			if(!this.isVisibilidadFK_IdFactura) {this.jTabbedPaneBusquedasCuentaPorCobrar.remove(jPanelFK_IdFacturaCuentaPorCobrar);}

			this.isVisibilidadFK_IdTipoTransaccionModulo=isParaAsientoContableNegation;
			if(!this.isVisibilidadFK_IdTipoTransaccionModulo) {this.jTabbedPaneBusquedasCuentaPorCobrar.remove(jPanelFK_IdTipoTransaccionModuloCuentaPorCobrar);}

			this.isVisibilidadFK_IdTransaccion=isParaAsientoContableNegation;
			if(!this.isVisibilidadFK_IdTransaccion) {this.jTabbedPaneBusquedasCuentaPorCobrar.remove(jPanelFK_IdTransaccionCuentaPorCobrar);}
		}
		
	}

	public void setVisibilidadBusquedasParaFactura(Boolean isParaFactura){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaFacturaNegation=!isParaFactura;

			this.isVisibilidadFK_IdAsientoContable=isParaFacturaNegation;
			if(!this.isVisibilidadFK_IdAsientoContable) {this.jTabbedPaneBusquedasCuentaPorCobrar.remove(jPanelFK_IdAsientoContableCuentaPorCobrar);}

			this.isVisibilidadFK_IdCliente=isParaFacturaNegation;
			if(!this.isVisibilidadFK_IdCliente) {this.jTabbedPaneBusquedasCuentaPorCobrar.remove(jPanelFK_IdClienteCuentaPorCobrar);}

			this.isVisibilidadFK_IdFactura=isParaFactura;
			if(!this.isVisibilidadFK_IdFactura) {this.jTabbedPaneBusquedasCuentaPorCobrar.remove(jPanelFK_IdFacturaCuentaPorCobrar);}

			this.isVisibilidadFK_IdTipoTransaccionModulo=isParaFacturaNegation;
			if(!this.isVisibilidadFK_IdTipoTransaccionModulo) {this.jTabbedPaneBusquedasCuentaPorCobrar.remove(jPanelFK_IdTipoTransaccionModuloCuentaPorCobrar);}

			this.isVisibilidadFK_IdTransaccion=isParaFacturaNegation;
			if(!this.isVisibilidadFK_IdTransaccion) {this.jTabbedPaneBusquedasCuentaPorCobrar.remove(jPanelFK_IdTransaccionCuentaPorCobrar);}
		}
		
	}
	
	
	
	

	public String registrarSesionCuentaPorCobrarParaBusquedaClientes() throws Exception {
		Boolean isPaginaPopupCliente=false;

		try {

			if(cuentaporcobrarSessionBean==null) {
				cuentaporcobrarSessionBean=new CuentaPorCobrarSessionBean();
			}

			if(clienteSessionBean==null) {
				clienteSessionBean=new ClienteSessionBean();
			}

			clienteSessionBean.setsPathNavegacionActual(cuentaporcobrarSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+ClienteConstantesFunciones.SCLASSWEBTITULO);
			clienteSessionBean.setisPermiteRecargarInformacion(false);
			clienteSessionBean.setisPaginaPopup(true);
			isPaginaPopupCliente=clienteSessionBean.getisPaginaPopup();
			clienteSessionBean.setisPaginaPopup(false);
			clienteSessionBean.setEstaModoBusqueda(true);
			clienteSessionBean.setsFuncionBusquedaRapida("window.opener.cuentaporcobrarFuncionGeneral.setCombosCodigoDesdeBusquedaid_cliente(TO_REPLACE);");
			clienteSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeCliente(true);
			clienteSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeCliente(CuentaPorCobrarConstantesFunciones.SNOMBREOPCION);
			//clienteSessionBean.setisBusquedaDesdeForeignKeySesionCuentaPorCobrar(true);
			//clienteSessionBean.setlidCuentaPorCobrarActual(this.idCuentaPorCobrarActual);

			cuentaporcobrarSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyCuentaPorCobrar(true);
			cuentaporcobrarSessionBean.setlIdCuentaPorCobrarActualForeignKey(this.idCuentaPorCobrarActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
			return "";
	}

	public String registrarSesionCuentaPorCobrarParaBusquedaAsientoContables() throws Exception {
		Boolean isPaginaPopupAsientoContable=false;

		try {

			if(cuentaporcobrarSessionBean==null) {
				cuentaporcobrarSessionBean=new CuentaPorCobrarSessionBean();
			}

			if(asientocontableSessionBean==null) {
				asientocontableSessionBean=new AsientoContableSessionBean();
			}

			asientocontableSessionBean.setsPathNavegacionActual(cuentaporcobrarSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+AsientoContableConstantesFunciones.SCLASSWEBTITULO);
			asientocontableSessionBean.setisPermiteRecargarInformacion(false);
			asientocontableSessionBean.setisPaginaPopup(true);
			isPaginaPopupAsientoContable=asientocontableSessionBean.getisPaginaPopup();
			asientocontableSessionBean.setisPaginaPopup(false);
			asientocontableSessionBean.setEstaModoBusqueda(true);
			asientocontableSessionBean.setsFuncionBusquedaRapida("window.opener.cuentaporcobrarFuncionGeneral.setCombosCodigoDesdeBusquedaid_asiento_contable(TO_REPLACE);");
			asientocontableSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeAsientoContable(true);
			asientocontableSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeAsientoContable(CuentaPorCobrarConstantesFunciones.SNOMBREOPCION);
			//asientocontableSessionBean.setisBusquedaDesdeForeignKeySesionCuentaPorCobrar(true);
			//asientocontableSessionBean.setlidCuentaPorCobrarActual(this.idCuentaPorCobrarActual);

			cuentaporcobrarSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyCuentaPorCobrar(true);
			cuentaporcobrarSessionBean.setlIdCuentaPorCobrarActualForeignKey(this.idCuentaPorCobrarActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
			return "";
	}

	public String registrarSesionCuentaPorCobrarParaBusquedaFacturas() throws Exception {
		Boolean isPaginaPopupFactura=false;

		try {

			if(cuentaporcobrarSessionBean==null) {
				cuentaporcobrarSessionBean=new CuentaPorCobrarSessionBean();
			}

			if(facturaSessionBean==null) {
				facturaSessionBean=new FacturaSessionBean();
			}

			facturaSessionBean.setsPathNavegacionActual(cuentaporcobrarSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+FacturaConstantesFunciones.SCLASSWEBTITULO);
			facturaSessionBean.setisPermiteRecargarInformacion(false);
			facturaSessionBean.setisPaginaPopup(true);
			isPaginaPopupFactura=facturaSessionBean.getisPaginaPopup();
			facturaSessionBean.setisPaginaPopup(false);
			facturaSessionBean.setEstaModoBusqueda(true);
			facturaSessionBean.setsFuncionBusquedaRapida("window.opener.cuentaporcobrarFuncionGeneral.setCombosCodigoDesdeBusquedaid_factura(TO_REPLACE);");
			facturaSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeFactura(true);
			facturaSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeFactura(CuentaPorCobrarConstantesFunciones.SNOMBREOPCION);
			//facturaSessionBean.setisBusquedaDesdeForeignKeySesionCuentaPorCobrar(true);
			//facturaSessionBean.setlidCuentaPorCobrarActual(this.idCuentaPorCobrarActual);

			cuentaporcobrarSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyCuentaPorCobrar(true);
			cuentaporcobrarSessionBean.setlIdCuentaPorCobrarActualForeignKey(this.idCuentaPorCobrarActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
			return "";
	}
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//CuentaPorCobrarSessionBean cuentaporcobrarSessionBean=new CuentaPorCobrarSessionBean();
		
		if(this.cuentaporcobrarSessionBean==null) {
			this.cuentaporcobrarSessionBean=new CuentaPorCobrarSessionBean();
		}
		
		this.cuentaporcobrarSessionBean.setsUltimaBusquedaCuentaPorCobrar(this.getsAccionBusqueda());
		this.cuentaporcobrarSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.cuentaporcobrarSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdAsientoContable")) {
			cuentaporcobrarSessionBean.setid_asiento_contable(this.getid_asiento_contableFK_IdAsientoContable());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdCliente")) {
			cuentaporcobrarSessionBean.setid_cliente(this.getid_clienteFK_IdCliente());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdEjercicio")) {
			cuentaporcobrarSessionBean.setid_ejercicio(this.getid_ejercicioFK_IdEjercicio());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			cuentaporcobrarSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdFactura")) {
			cuentaporcobrarSessionBean.setid_factura(this.getid_facturaFK_IdFactura());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdModulo")) {
			cuentaporcobrarSessionBean.setid_modulo(this.getid_moduloFK_IdModulo());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdMoneda")) {
			cuentaporcobrarSessionBean.setid_moneda(this.getid_monedaFK_IdMoneda());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdSucursal")) {
			cuentaporcobrarSessionBean.setid_sucursal(this.getid_sucursalFK_IdSucursal());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdTipoTransaccionModulo")) {
			cuentaporcobrarSessionBean.setid_tipo_transaccion_modulo(this.getid_tipo_transaccion_moduloFK_IdTipoTransaccionModulo());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdTransaccion")) {
			cuentaporcobrarSessionBean.setid_transaccion(this.getid_transaccionFK_IdTransaccion());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//CuentaPorCobrarSessionBean cuentaporcobrarSessionBean=new CuentaPorCobrarSessionBean();
		
		if(this.cuentaporcobrarSessionBean==null) {
			this.cuentaporcobrarSessionBean=new CuentaPorCobrarSessionBean();
		}
		
		if(this.cuentaporcobrarSessionBean.getsUltimaBusquedaCuentaPorCobrar()!=null&&!this.cuentaporcobrarSessionBean.getsUltimaBusquedaCuentaPorCobrar().equals("")) {
			this.setsAccionBusqueda(cuentaporcobrarSessionBean.getsUltimaBusquedaCuentaPorCobrar());
			this.setiNumeroPaginacion(cuentaporcobrarSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(cuentaporcobrarSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdAsientoContable")) {
				this.setid_asiento_contableFK_IdAsientoContable(cuentaporcobrarSessionBean.getid_asiento_contable());
				cuentaporcobrarSessionBean.setid_asiento_contable(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdCliente")) {
				this.setid_clienteFK_IdCliente(cuentaporcobrarSessionBean.getid_cliente());
				cuentaporcobrarSessionBean.setid_cliente(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdEjercicio")) {
				this.setid_ejercicioFK_IdEjercicio(cuentaporcobrarSessionBean.getid_ejercicio());
				cuentaporcobrarSessionBean.setid_ejercicio(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(cuentaporcobrarSessionBean.getid_empresa());
				cuentaporcobrarSessionBean.setid_empresa(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdFactura")) {
				this.setid_facturaFK_IdFactura(cuentaporcobrarSessionBean.getid_factura());
				cuentaporcobrarSessionBean.setid_factura(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdModulo")) {
				this.setid_moduloFK_IdModulo(cuentaporcobrarSessionBean.getid_modulo());
				cuentaporcobrarSessionBean.setid_modulo(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdMoneda")) {
				this.setid_monedaFK_IdMoneda(cuentaporcobrarSessionBean.getid_moneda());
				cuentaporcobrarSessionBean.setid_moneda(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdSucursal")) {
				this.setid_sucursalFK_IdSucursal(cuentaporcobrarSessionBean.getid_sucursal());
				cuentaporcobrarSessionBean.setid_sucursal(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdTipoTransaccionModulo")) {
				this.setid_tipo_transaccion_moduloFK_IdTipoTransaccionModulo(cuentaporcobrarSessionBean.getid_tipo_transaccion_modulo());
				cuentaporcobrarSessionBean.setid_tipo_transaccion_modulo(null);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdTransaccion")) {
				this.setid_transaccionFK_IdTransaccion(cuentaporcobrarSessionBean.getid_transaccion());
				cuentaporcobrarSessionBean.setid_transaccion(-1L);
			}
		}
		
		this.cuentaporcobrarSessionBean.setsUltimaBusquedaCuentaPorCobrar("");
		this.cuentaporcobrarSessionBean.setiNumeroPaginacion(CuentaPorCobrarConstantesFunciones.INUMEROPAGINACION);
		this.cuentaporcobrarSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaCuentaPorCobrar(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioCuentaPorCobrar() {
		this.updateBorderResaltarBusquedasFormularioCuentaPorCobrar();
		this.updateVisibilidadBusquedasFormularioCuentaPorCobrar();
		this.updateHabilitarBusquedasFormularioCuentaPorCobrar();
	}
	
	public void updateBorderResaltarBusquedasFormularioCuentaPorCobrar() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasCuentaPorCobrar.getComponents().length>0) {
	

		if(this.cuentaporcobrarConstantesFunciones.resaltarFK_IdAsientoContableCuentaPorCobrar!=null) {
			index= this.jTabbedPaneBusquedasCuentaPorCobrar.indexOfComponent(this.jPanelFK_IdAsientoContableCuentaPorCobrar);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasCuentaPorCobrar.getComponent(index);
				jPanel.setBorder(this.cuentaporcobrarConstantesFunciones.resaltarFK_IdAsientoContableCuentaPorCobrar);
			}
		}

		if(this.cuentaporcobrarConstantesFunciones.resaltarFK_IdClienteCuentaPorCobrar!=null) {
			index= this.jTabbedPaneBusquedasCuentaPorCobrar.indexOfComponent(this.jPanelFK_IdClienteCuentaPorCobrar);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasCuentaPorCobrar.getComponent(index);
				jPanel.setBorder(this.cuentaporcobrarConstantesFunciones.resaltarFK_IdClienteCuentaPorCobrar);
			}
		}

		if(this.cuentaporcobrarConstantesFunciones.resaltarFK_IdFacturaCuentaPorCobrar!=null) {
			index= this.jTabbedPaneBusquedasCuentaPorCobrar.indexOfComponent(this.jPanelFK_IdFacturaCuentaPorCobrar);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasCuentaPorCobrar.getComponent(index);
				jPanel.setBorder(this.cuentaporcobrarConstantesFunciones.resaltarFK_IdFacturaCuentaPorCobrar);
			}
		}

		if(this.cuentaporcobrarConstantesFunciones.resaltarFK_IdTipoTransaccionModuloCuentaPorCobrar!=null) {
			index= this.jTabbedPaneBusquedasCuentaPorCobrar.indexOfComponent(this.jPanelFK_IdTipoTransaccionModuloCuentaPorCobrar);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasCuentaPorCobrar.getComponent(index);
				jPanel.setBorder(this.cuentaporcobrarConstantesFunciones.resaltarFK_IdTipoTransaccionModuloCuentaPorCobrar);
			}
		}

		if(this.cuentaporcobrarConstantesFunciones.resaltarFK_IdTransaccionCuentaPorCobrar!=null) {
			index= this.jTabbedPaneBusquedasCuentaPorCobrar.indexOfComponent(this.jPanelFK_IdTransaccionCuentaPorCobrar);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasCuentaPorCobrar.getComponent(index);
				jPanel.setBorder(this.cuentaporcobrarConstantesFunciones.resaltarFK_IdTransaccionCuentaPorCobrar);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioCuentaPorCobrar() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasCuentaPorCobrar.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasCuentaPorCobrar.indexOfComponent(this.jPanelFK_IdAsientoContableCuentaPorCobrar);
			jPanel=(JPanel)this.jTabbedPaneBusquedasCuentaPorCobrar.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.cuentaporcobrarConstantesFunciones.mostrarFK_IdAsientoContableCuentaPorCobrar);
			if(!this.cuentaporcobrarConstantesFunciones.mostrarFK_IdAsientoContableCuentaPorCobrar && index>-1) {
				this.jTabbedPaneBusquedasCuentaPorCobrar.remove(index);
			}

			index= this.jTabbedPaneBusquedasCuentaPorCobrar.indexOfComponent(this.jPanelFK_IdClienteCuentaPorCobrar);
			jPanel=(JPanel)this.jTabbedPaneBusquedasCuentaPorCobrar.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.cuentaporcobrarConstantesFunciones.mostrarFK_IdClienteCuentaPorCobrar);
			if(!this.cuentaporcobrarConstantesFunciones.mostrarFK_IdClienteCuentaPorCobrar && index>-1) {
				this.jTabbedPaneBusquedasCuentaPorCobrar.remove(index);
			}

			index= this.jTabbedPaneBusquedasCuentaPorCobrar.indexOfComponent(this.jPanelFK_IdFacturaCuentaPorCobrar);
			jPanel=(JPanel)this.jTabbedPaneBusquedasCuentaPorCobrar.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.cuentaporcobrarConstantesFunciones.mostrarFK_IdFacturaCuentaPorCobrar);
			if(!this.cuentaporcobrarConstantesFunciones.mostrarFK_IdFacturaCuentaPorCobrar && index>-1) {
				this.jTabbedPaneBusquedasCuentaPorCobrar.remove(index);
			}

			index= this.jTabbedPaneBusquedasCuentaPorCobrar.indexOfComponent(this.jPanelFK_IdTipoTransaccionModuloCuentaPorCobrar);
			jPanel=(JPanel)this.jTabbedPaneBusquedasCuentaPorCobrar.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.cuentaporcobrarConstantesFunciones.mostrarFK_IdTipoTransaccionModuloCuentaPorCobrar);
			if(!this.cuentaporcobrarConstantesFunciones.mostrarFK_IdTipoTransaccionModuloCuentaPorCobrar && index>-1) {
				this.jTabbedPaneBusquedasCuentaPorCobrar.remove(index);
			}

			index= this.jTabbedPaneBusquedasCuentaPorCobrar.indexOfComponent(this.jPanelFK_IdTransaccionCuentaPorCobrar);
			jPanel=(JPanel)this.jTabbedPaneBusquedasCuentaPorCobrar.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.cuentaporcobrarConstantesFunciones.mostrarFK_IdTransaccionCuentaPorCobrar);
			if(!this.cuentaporcobrarConstantesFunciones.mostrarFK_IdTransaccionCuentaPorCobrar && index>-1) {
				this.jTabbedPaneBusquedasCuentaPorCobrar.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioCuentaPorCobrar() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasCuentaPorCobrar.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasCuentaPorCobrar.indexOfComponent(this.jPanelFK_IdAsientoContableCuentaPorCobrar);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasCuentaPorCobrar.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.cuentaporcobrarConstantesFunciones.activarFK_IdAsientoContableCuentaPorCobrar);
				this.jTabbedPaneBusquedasCuentaPorCobrar.setEnabledAt(index,this.cuentaporcobrarConstantesFunciones.activarFK_IdAsientoContableCuentaPorCobrar);
			}

			index= this.jTabbedPaneBusquedasCuentaPorCobrar.indexOfComponent(this.jPanelFK_IdClienteCuentaPorCobrar);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasCuentaPorCobrar.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.cuentaporcobrarConstantesFunciones.activarFK_IdClienteCuentaPorCobrar);
				this.jTabbedPaneBusquedasCuentaPorCobrar.setEnabledAt(index,this.cuentaporcobrarConstantesFunciones.activarFK_IdClienteCuentaPorCobrar);
			}

			index= this.jTabbedPaneBusquedasCuentaPorCobrar.indexOfComponent(this.jPanelFK_IdFacturaCuentaPorCobrar);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasCuentaPorCobrar.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.cuentaporcobrarConstantesFunciones.activarFK_IdFacturaCuentaPorCobrar);
				this.jTabbedPaneBusquedasCuentaPorCobrar.setEnabledAt(index,this.cuentaporcobrarConstantesFunciones.activarFK_IdFacturaCuentaPorCobrar);
			}

			index= this.jTabbedPaneBusquedasCuentaPorCobrar.indexOfComponent(this.jPanelFK_IdTipoTransaccionModuloCuentaPorCobrar);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasCuentaPorCobrar.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.cuentaporcobrarConstantesFunciones.activarFK_IdTipoTransaccionModuloCuentaPorCobrar);
				this.jTabbedPaneBusquedasCuentaPorCobrar.setEnabledAt(index,this.cuentaporcobrarConstantesFunciones.activarFK_IdTipoTransaccionModuloCuentaPorCobrar);
			}

			index= this.jTabbedPaneBusquedasCuentaPorCobrar.indexOfComponent(this.jPanelFK_IdTransaccionCuentaPorCobrar);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasCuentaPorCobrar.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.cuentaporcobrarConstantesFunciones.activarFK_IdTransaccionCuentaPorCobrar);
				this.jTabbedPaneBusquedasCuentaPorCobrar.setEnabledAt(index,this.cuentaporcobrarConstantesFunciones.activarFK_IdTransaccionCuentaPorCobrar);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaCuentaPorCobrar(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("FK_IdAsientoContable")) {
			index= this.jTabbedPaneBusquedasCuentaPorCobrar.indexOfComponent(this.jPanelFK_IdAsientoContableCuentaPorCobrar);

			this.jTabbedPaneBusquedasCuentaPorCobrar.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasCuentaPorCobrar.getComponent(index);

			this.cuentaporcobrarConstantesFunciones.setResaltarFK_IdAsientoContableCuentaPorCobrar(resaltar);

			jPanel.setBorder(this.cuentaporcobrarConstantesFunciones.resaltarFK_IdAsientoContableCuentaPorCobrar);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdCliente")) {
			index= this.jTabbedPaneBusquedasCuentaPorCobrar.indexOfComponent(this.jPanelFK_IdClienteCuentaPorCobrar);

			this.jTabbedPaneBusquedasCuentaPorCobrar.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasCuentaPorCobrar.getComponent(index);

			this.cuentaporcobrarConstantesFunciones.setResaltarFK_IdClienteCuentaPorCobrar(resaltar);

			jPanel.setBorder(this.cuentaporcobrarConstantesFunciones.resaltarFK_IdClienteCuentaPorCobrar);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdFactura")) {
			index= this.jTabbedPaneBusquedasCuentaPorCobrar.indexOfComponent(this.jPanelFK_IdFacturaCuentaPorCobrar);

			this.jTabbedPaneBusquedasCuentaPorCobrar.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasCuentaPorCobrar.getComponent(index);

			this.cuentaporcobrarConstantesFunciones.setResaltarFK_IdFacturaCuentaPorCobrar(resaltar);

			jPanel.setBorder(this.cuentaporcobrarConstantesFunciones.resaltarFK_IdFacturaCuentaPorCobrar);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdTipoTransaccionModulo")) {
			index= this.jTabbedPaneBusquedasCuentaPorCobrar.indexOfComponent(this.jPanelFK_IdTipoTransaccionModuloCuentaPorCobrar);

			this.jTabbedPaneBusquedasCuentaPorCobrar.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasCuentaPorCobrar.getComponent(index);

			this.cuentaporcobrarConstantesFunciones.setResaltarFK_IdTipoTransaccionModuloCuentaPorCobrar(resaltar);

			jPanel.setBorder(this.cuentaporcobrarConstantesFunciones.resaltarFK_IdTipoTransaccionModuloCuentaPorCobrar);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdTransaccion")) {
			index= this.jTabbedPaneBusquedasCuentaPorCobrar.indexOfComponent(this.jPanelFK_IdTransaccionCuentaPorCobrar);

			this.jTabbedPaneBusquedasCuentaPorCobrar.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasCuentaPorCobrar.getComponent(index);

			this.cuentaporcobrarConstantesFunciones.setResaltarFK_IdTransaccionCuentaPorCobrar(resaltar);

			jPanel.setBorder(this.cuentaporcobrarConstantesFunciones.resaltarFK_IdTransaccionCuentaPorCobrar);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarCuentaPorCobrar.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioCuentaPorCobrar() throws Exception {

		if(this.jInternalFrameDetalleFormCuentaPorCobrar==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioCuentaPorCobrar();
		this.updateVisibilidadResaltarControlesFormularioCuentaPorCobrar();
		this.updateHabilitarResaltarControlesFormularioCuentaPorCobrar();
		
	}
	
	public void updateBorderResaltarControlesFormularioCuentaPorCobrar() throws Exception {
		if(this.jInternalFrameDetalleFormCuentaPorCobrar==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.cuentaporcobrarConstantesFunciones.resaltaridCuentaPorCobrar!=null && this.jInternalFrameDetalleFormCuentaPorCobrar!=null) {this.jInternalFrameDetalleFormCuentaPorCobrar.jLabelidCuentaPorCobrar.setBorder(this.cuentaporcobrarConstantesFunciones.resaltaridCuentaPorCobrar);}
		if(this.cuentaporcobrarConstantesFunciones.resaltarid_empresaCuentaPorCobrar!=null && this.jInternalFrameDetalleFormCuentaPorCobrar!=null) {this.jInternalFrameDetalleFormCuentaPorCobrar.jComboBoxid_empresaCuentaPorCobrar.setBorder(this.cuentaporcobrarConstantesFunciones.resaltarid_empresaCuentaPorCobrar);}
		if(this.cuentaporcobrarConstantesFunciones.resaltarid_sucursalCuentaPorCobrar!=null && this.jInternalFrameDetalleFormCuentaPorCobrar!=null) {this.jInternalFrameDetalleFormCuentaPorCobrar.jComboBoxid_sucursalCuentaPorCobrar.setBorder(this.cuentaporcobrarConstantesFunciones.resaltarid_sucursalCuentaPorCobrar);}
		if(this.cuentaporcobrarConstantesFunciones.resaltarid_moduloCuentaPorCobrar!=null && this.jInternalFrameDetalleFormCuentaPorCobrar!=null) {this.jInternalFrameDetalleFormCuentaPorCobrar.jComboBoxid_moduloCuentaPorCobrar.setBorder(this.cuentaporcobrarConstantesFunciones.resaltarid_moduloCuentaPorCobrar);}
		if(this.cuentaporcobrarConstantesFunciones.resaltarid_ejercicioCuentaPorCobrar!=null && this.jInternalFrameDetalleFormCuentaPorCobrar!=null) {this.jInternalFrameDetalleFormCuentaPorCobrar.jComboBoxid_ejercicioCuentaPorCobrar.setBorder(this.cuentaporcobrarConstantesFunciones.resaltarid_ejercicioCuentaPorCobrar);}
		if(this.cuentaporcobrarConstantesFunciones.resaltarid_monedaCuentaPorCobrar!=null && this.jInternalFrameDetalleFormCuentaPorCobrar!=null) {this.jInternalFrameDetalleFormCuentaPorCobrar.jComboBoxid_monedaCuentaPorCobrar.setBorder(this.cuentaporcobrarConstantesFunciones.resaltarid_monedaCuentaPorCobrar);}
		if(this.cuentaporcobrarConstantesFunciones.resaltarid_clienteCuentaPorCobrar!=null && this.jInternalFrameDetalleFormCuentaPorCobrar!=null) {this.jInternalFrameDetalleFormCuentaPorCobrar.jComboBoxid_clienteCuentaPorCobrar.setBorder(this.cuentaporcobrarConstantesFunciones.resaltarid_clienteCuentaPorCobrar);}
		if(this.cuentaporcobrarConstantesFunciones.resaltarid_transaccionCuentaPorCobrar!=null && this.jInternalFrameDetalleFormCuentaPorCobrar!=null) {this.jInternalFrameDetalleFormCuentaPorCobrar.jComboBoxid_transaccionCuentaPorCobrar.setBorder(this.cuentaporcobrarConstantesFunciones.resaltarid_transaccionCuentaPorCobrar);}
		if(this.cuentaporcobrarConstantesFunciones.resaltarid_tipo_transaccion_moduloCuentaPorCobrar!=null && this.jInternalFrameDetalleFormCuentaPorCobrar!=null) {this.jInternalFrameDetalleFormCuentaPorCobrar.jComboBoxid_tipo_transaccion_moduloCuentaPorCobrar.setBorder(this.cuentaporcobrarConstantesFunciones.resaltarid_tipo_transaccion_moduloCuentaPorCobrar);}
		if(this.cuentaporcobrarConstantesFunciones.resaltarid_asiento_contableCuentaPorCobrar!=null && this.jInternalFrameDetalleFormCuentaPorCobrar!=null) {this.jInternalFrameDetalleFormCuentaPorCobrar.jComboBoxid_asiento_contableCuentaPorCobrar.setBorder(this.cuentaporcobrarConstantesFunciones.resaltarid_asiento_contableCuentaPorCobrar);}
		if(this.cuentaporcobrarConstantesFunciones.resaltarid_facturaCuentaPorCobrar!=null && this.jInternalFrameDetalleFormCuentaPorCobrar!=null) {this.jInternalFrameDetalleFormCuentaPorCobrar.jComboBoxid_facturaCuentaPorCobrar.setBorder(this.cuentaporcobrarConstantesFunciones.resaltarid_facturaCuentaPorCobrar);}
		if(this.cuentaporcobrarConstantesFunciones.resaltarfechaCuentaPorCobrar!=null && this.jInternalFrameDetalleFormCuentaPorCobrar!=null) {this.jInternalFrameDetalleFormCuentaPorCobrar.jDateChooserfechaCuentaPorCobrar.setBorder(this.cuentaporcobrarConstantesFunciones.resaltarfechaCuentaPorCobrar);}
		if(this.cuentaporcobrarConstantesFunciones.resaltarmontoCuentaPorCobrar!=null && this.jInternalFrameDetalleFormCuentaPorCobrar!=null) {this.jInternalFrameDetalleFormCuentaPorCobrar.jTextFieldmontoCuentaPorCobrar.setBorder(this.cuentaporcobrarConstantesFunciones.resaltarmontoCuentaPorCobrar);}
		if(this.cuentaporcobrarConstantesFunciones.resaltarnumero_comprobanteCuentaPorCobrar!=null && this.jInternalFrameDetalleFormCuentaPorCobrar!=null) {this.jInternalFrameDetalleFormCuentaPorCobrar.jTextFieldnumero_comprobanteCuentaPorCobrar.setBorder(this.cuentaporcobrarConstantesFunciones.resaltarnumero_comprobanteCuentaPorCobrar);}
		if(this.cuentaporcobrarConstantesFunciones.resaltardebitoCuentaPorCobrar!=null && this.jInternalFrameDetalleFormCuentaPorCobrar!=null) {this.jInternalFrameDetalleFormCuentaPorCobrar.jTextFielddebitoCuentaPorCobrar.setBorder(this.cuentaporcobrarConstantesFunciones.resaltardebitoCuentaPorCobrar);}
		if(this.cuentaporcobrarConstantesFunciones.resaltarcreditoCuentaPorCobrar!=null && this.jInternalFrameDetalleFormCuentaPorCobrar!=null) {this.jInternalFrameDetalleFormCuentaPorCobrar.jTextFieldcreditoCuentaPorCobrar.setBorder(this.cuentaporcobrarConstantesFunciones.resaltarcreditoCuentaPorCobrar);}
		if(this.cuentaporcobrarConstantesFunciones.resaltardetalleCuentaPorCobrar!=null && this.jInternalFrameDetalleFormCuentaPorCobrar!=null) {this.jInternalFrameDetalleFormCuentaPorCobrar.jTextAreadetalleCuentaPorCobrar.setBorder(this.cuentaporcobrarConstantesFunciones.resaltardetalleCuentaPorCobrar);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioCuentaPorCobrar() throws Exception {		
		if(this.jInternalFrameDetalleFormCuentaPorCobrar==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormCuentaPorCobrar!=null) {
	
		//this.jInternalFrameDetalleFormCuentaPorCobrar.jLabelidCuentaPorCobrar.setVisible(this.cuentaporcobrarConstantesFunciones.mostraridCuentaPorCobrar);
		this.jInternalFrameDetalleFormCuentaPorCobrar.jPanelidCuentaPorCobrar.setVisible(this.cuentaporcobrarConstantesFunciones.mostraridCuentaPorCobrar);
		//this.jInternalFrameDetalleFormCuentaPorCobrar.jComboBoxid_empresaCuentaPorCobrar.setVisible(this.cuentaporcobrarConstantesFunciones.mostrarid_empresaCuentaPorCobrar);
		this.jInternalFrameDetalleFormCuentaPorCobrar.jPanelid_empresaCuentaPorCobrar.setVisible(this.cuentaporcobrarConstantesFunciones.mostrarid_empresaCuentaPorCobrar);
		//this.jInternalFrameDetalleFormCuentaPorCobrar.jComboBoxid_sucursalCuentaPorCobrar.setVisible(this.cuentaporcobrarConstantesFunciones.mostrarid_sucursalCuentaPorCobrar);
		this.jInternalFrameDetalleFormCuentaPorCobrar.jPanelid_sucursalCuentaPorCobrar.setVisible(this.cuentaporcobrarConstantesFunciones.mostrarid_sucursalCuentaPorCobrar);
		//this.jInternalFrameDetalleFormCuentaPorCobrar.jComboBoxid_moduloCuentaPorCobrar.setVisible(this.cuentaporcobrarConstantesFunciones.mostrarid_moduloCuentaPorCobrar);
		this.jInternalFrameDetalleFormCuentaPorCobrar.jPanelid_moduloCuentaPorCobrar.setVisible(this.cuentaporcobrarConstantesFunciones.mostrarid_moduloCuentaPorCobrar);
		//this.jInternalFrameDetalleFormCuentaPorCobrar.jComboBoxid_ejercicioCuentaPorCobrar.setVisible(this.cuentaporcobrarConstantesFunciones.mostrarid_ejercicioCuentaPorCobrar);
		this.jInternalFrameDetalleFormCuentaPorCobrar.jPanelid_ejercicioCuentaPorCobrar.setVisible(this.cuentaporcobrarConstantesFunciones.mostrarid_ejercicioCuentaPorCobrar);
		//this.jInternalFrameDetalleFormCuentaPorCobrar.jComboBoxid_monedaCuentaPorCobrar.setVisible(this.cuentaporcobrarConstantesFunciones.mostrarid_monedaCuentaPorCobrar);
		this.jInternalFrameDetalleFormCuentaPorCobrar.jPanelid_monedaCuentaPorCobrar.setVisible(this.cuentaporcobrarConstantesFunciones.mostrarid_monedaCuentaPorCobrar);
		//this.jInternalFrameDetalleFormCuentaPorCobrar.jComboBoxid_clienteCuentaPorCobrar.setVisible(this.cuentaporcobrarConstantesFunciones.mostrarid_clienteCuentaPorCobrar);
		this.jInternalFrameDetalleFormCuentaPorCobrar.jPanelid_clienteCuentaPorCobrar.setVisible(this.cuentaporcobrarConstantesFunciones.mostrarid_clienteCuentaPorCobrar);
			this.jInternalFrameDetalleFormCuentaPorCobrar.jButtonid_clienteCuentaPorCobrar.setVisible(this.cuentaporcobrarConstantesFunciones.mostrarid_clienteCuentaPorCobrar);
		//this.jInternalFrameDetalleFormCuentaPorCobrar.jComboBoxid_transaccionCuentaPorCobrar.setVisible(this.cuentaporcobrarConstantesFunciones.mostrarid_transaccionCuentaPorCobrar);
		this.jInternalFrameDetalleFormCuentaPorCobrar.jPanelid_transaccionCuentaPorCobrar.setVisible(this.cuentaporcobrarConstantesFunciones.mostrarid_transaccionCuentaPorCobrar);
		//this.jInternalFrameDetalleFormCuentaPorCobrar.jComboBoxid_tipo_transaccion_moduloCuentaPorCobrar.setVisible(this.cuentaporcobrarConstantesFunciones.mostrarid_tipo_transaccion_moduloCuentaPorCobrar);
		this.jInternalFrameDetalleFormCuentaPorCobrar.jPanelid_tipo_transaccion_moduloCuentaPorCobrar.setVisible(this.cuentaporcobrarConstantesFunciones.mostrarid_tipo_transaccion_moduloCuentaPorCobrar);
		//this.jInternalFrameDetalleFormCuentaPorCobrar.jComboBoxid_asiento_contableCuentaPorCobrar.setVisible(this.cuentaporcobrarConstantesFunciones.mostrarid_asiento_contableCuentaPorCobrar);
		this.jInternalFrameDetalleFormCuentaPorCobrar.jPanelid_asiento_contableCuentaPorCobrar.setVisible(this.cuentaporcobrarConstantesFunciones.mostrarid_asiento_contableCuentaPorCobrar);
			this.jInternalFrameDetalleFormCuentaPorCobrar.jButtonid_asiento_contableCuentaPorCobrar.setVisible(this.cuentaporcobrarConstantesFunciones.mostrarid_asiento_contableCuentaPorCobrar);
		//this.jInternalFrameDetalleFormCuentaPorCobrar.jComboBoxid_facturaCuentaPorCobrar.setVisible(this.cuentaporcobrarConstantesFunciones.mostrarid_facturaCuentaPorCobrar);
		this.jInternalFrameDetalleFormCuentaPorCobrar.jPanelid_facturaCuentaPorCobrar.setVisible(this.cuentaporcobrarConstantesFunciones.mostrarid_facturaCuentaPorCobrar);
			this.jInternalFrameDetalleFormCuentaPorCobrar.jButtonid_facturaCuentaPorCobrar.setVisible(this.cuentaporcobrarConstantesFunciones.mostrarid_facturaCuentaPorCobrar);
		//this.jInternalFrameDetalleFormCuentaPorCobrar.jDateChooserfechaCuentaPorCobrar.setVisible(this.cuentaporcobrarConstantesFunciones.mostrarfechaCuentaPorCobrar);
		this.jInternalFrameDetalleFormCuentaPorCobrar.jPanelfechaCuentaPorCobrar.setVisible(this.cuentaporcobrarConstantesFunciones.mostrarfechaCuentaPorCobrar);
		//this.jInternalFrameDetalleFormCuentaPorCobrar.jTextFieldmontoCuentaPorCobrar.setVisible(this.cuentaporcobrarConstantesFunciones.mostrarmontoCuentaPorCobrar);
		this.jInternalFrameDetalleFormCuentaPorCobrar.jPanelmontoCuentaPorCobrar.setVisible(this.cuentaporcobrarConstantesFunciones.mostrarmontoCuentaPorCobrar);
		//this.jInternalFrameDetalleFormCuentaPorCobrar.jTextFieldnumero_comprobanteCuentaPorCobrar.setVisible(this.cuentaporcobrarConstantesFunciones.mostrarnumero_comprobanteCuentaPorCobrar);
		this.jInternalFrameDetalleFormCuentaPorCobrar.jPanelnumero_comprobanteCuentaPorCobrar.setVisible(this.cuentaporcobrarConstantesFunciones.mostrarnumero_comprobanteCuentaPorCobrar);
		//this.jInternalFrameDetalleFormCuentaPorCobrar.jTextFielddebitoCuentaPorCobrar.setVisible(this.cuentaporcobrarConstantesFunciones.mostrardebitoCuentaPorCobrar);
		this.jInternalFrameDetalleFormCuentaPorCobrar.jPaneldebitoCuentaPorCobrar.setVisible(this.cuentaporcobrarConstantesFunciones.mostrardebitoCuentaPorCobrar);
		//this.jInternalFrameDetalleFormCuentaPorCobrar.jTextFieldcreditoCuentaPorCobrar.setVisible(this.cuentaporcobrarConstantesFunciones.mostrarcreditoCuentaPorCobrar);
		this.jInternalFrameDetalleFormCuentaPorCobrar.jPanelcreditoCuentaPorCobrar.setVisible(this.cuentaporcobrarConstantesFunciones.mostrarcreditoCuentaPorCobrar);
		//this.jInternalFrameDetalleFormCuentaPorCobrar.jTextAreadetalleCuentaPorCobrar.setVisible(this.cuentaporcobrarConstantesFunciones.mostrardetalleCuentaPorCobrar);
		this.jInternalFrameDetalleFormCuentaPorCobrar.jPaneldetalleCuentaPorCobrar.setVisible(this.cuentaporcobrarConstantesFunciones.mostrardetalleCuentaPorCobrar);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioCuentaPorCobrar() throws Exception {
		if(this.jInternalFrameDetalleFormCuentaPorCobrar==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormCuentaPorCobrar!=null) {
	
		this.jInternalFrameDetalleFormCuentaPorCobrar.jLabelidCuentaPorCobrar.setEnabled(this.cuentaporcobrarConstantesFunciones.activaridCuentaPorCobrar);
		this.jInternalFrameDetalleFormCuentaPorCobrar.jComboBoxid_empresaCuentaPorCobrar.setEnabled(this.cuentaporcobrarConstantesFunciones.activarid_empresaCuentaPorCobrar);
		this.jInternalFrameDetalleFormCuentaPorCobrar.jComboBoxid_sucursalCuentaPorCobrar.setEnabled(this.cuentaporcobrarConstantesFunciones.activarid_sucursalCuentaPorCobrar);
		this.jInternalFrameDetalleFormCuentaPorCobrar.jComboBoxid_moduloCuentaPorCobrar.setEnabled(this.cuentaporcobrarConstantesFunciones.activarid_moduloCuentaPorCobrar);
		this.jInternalFrameDetalleFormCuentaPorCobrar.jComboBoxid_ejercicioCuentaPorCobrar.setEnabled(this.cuentaporcobrarConstantesFunciones.activarid_ejercicioCuentaPorCobrar);
		this.jInternalFrameDetalleFormCuentaPorCobrar.jComboBoxid_monedaCuentaPorCobrar.setEnabled(this.cuentaporcobrarConstantesFunciones.activarid_monedaCuentaPorCobrar);
		this.jInternalFrameDetalleFormCuentaPorCobrar.jComboBoxid_clienteCuentaPorCobrar.setEnabled(this.cuentaporcobrarConstantesFunciones.activarid_clienteCuentaPorCobrar);
			this.jInternalFrameDetalleFormCuentaPorCobrar.jButtonid_clienteCuentaPorCobrar.setEnabled(this.cuentaporcobrarConstantesFunciones.activarid_clienteCuentaPorCobrar);
		this.jInternalFrameDetalleFormCuentaPorCobrar.jComboBoxid_transaccionCuentaPorCobrar.setEnabled(this.cuentaporcobrarConstantesFunciones.activarid_transaccionCuentaPorCobrar);
		this.jInternalFrameDetalleFormCuentaPorCobrar.jComboBoxid_tipo_transaccion_moduloCuentaPorCobrar.setEnabled(this.cuentaporcobrarConstantesFunciones.activarid_tipo_transaccion_moduloCuentaPorCobrar);
		this.jInternalFrameDetalleFormCuentaPorCobrar.jComboBoxid_asiento_contableCuentaPorCobrar.setEnabled(this.cuentaporcobrarConstantesFunciones.activarid_asiento_contableCuentaPorCobrar);
			this.jInternalFrameDetalleFormCuentaPorCobrar.jButtonid_asiento_contableCuentaPorCobrar.setEnabled(this.cuentaporcobrarConstantesFunciones.activarid_asiento_contableCuentaPorCobrar);
		this.jInternalFrameDetalleFormCuentaPorCobrar.jComboBoxid_facturaCuentaPorCobrar.setEnabled(this.cuentaporcobrarConstantesFunciones.activarid_facturaCuentaPorCobrar);
			this.jInternalFrameDetalleFormCuentaPorCobrar.jButtonid_facturaCuentaPorCobrar.setEnabled(this.cuentaporcobrarConstantesFunciones.activarid_facturaCuentaPorCobrar);
		this.jInternalFrameDetalleFormCuentaPorCobrar.jDateChooserfechaCuentaPorCobrar.setEnabled(this.cuentaporcobrarConstantesFunciones.activarfechaCuentaPorCobrar);
		this.jInternalFrameDetalleFormCuentaPorCobrar.jTextFieldmontoCuentaPorCobrar.setEnabled(this.cuentaporcobrarConstantesFunciones.activarmontoCuentaPorCobrar);
		this.jInternalFrameDetalleFormCuentaPorCobrar.jTextFieldnumero_comprobanteCuentaPorCobrar.setEnabled(this.cuentaporcobrarConstantesFunciones.activarnumero_comprobanteCuentaPorCobrar);
		this.jInternalFrameDetalleFormCuentaPorCobrar.jTextFielddebitoCuentaPorCobrar.setEnabled(this.cuentaporcobrarConstantesFunciones.activardebitoCuentaPorCobrar);
		this.jInternalFrameDetalleFormCuentaPorCobrar.jTextFieldcreditoCuentaPorCobrar.setEnabled(this.cuentaporcobrarConstantesFunciones.activarcreditoCuentaPorCobrar);
		this.jInternalFrameDetalleFormCuentaPorCobrar.jTextAreadetalleCuentaPorCobrar.setEnabled(this.cuentaporcobrarConstantesFunciones.activardetalleCuentaPorCobrar);
		}
	}
	
		
}