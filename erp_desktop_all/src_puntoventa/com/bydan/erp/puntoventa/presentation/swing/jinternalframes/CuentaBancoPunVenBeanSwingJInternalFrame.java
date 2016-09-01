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
package com.bydan.erp.puntoventa.presentation.swing.jinternalframes;




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

import com.bydan.erp.puntoventa.util.CuentaBancoPunVenConstantesFunciones;
import com.bydan.erp.puntoventa.util.CuentaBancoPunVenParameterReturnGeneral;
//import com.bydan.erp.puntoventa.util.CuentaBancoPunVenParameterGeneral;
//import com.bydan.erp.puntoventa.presentation.report.source.CuentaBancoPunVenBean;
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

import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.auxiliar.*;
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
import com.bydan.erp.puntoventa.resources.reportes.AuxiliarReportes;


import com.bydan.erp.puntoventa.util.*;
import com.bydan.erp.puntoventa.business.logic.*;

import com.bydan.erp.seguridad.business.logic.*;
import com.bydan.erp.tesoreria.business.logic.*;
import com.bydan.erp.cartera.business.logic.*;
import com.bydan.erp.contabilidad.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.puntoventa.business.entity.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;

import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar.*;
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


import com.bydan.erp.puntoventa.presentation.web.jsf.sessionbean.*;

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
import com.bydan.erp.tesoreria.business.entity.*;
import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.tesoreria.util.*;
import com.bydan.erp.cartera.util.*;
import com.bydan.erp.contabilidad.util.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class CuentaBancoPunVenBeanSwingJInternalFrame extends CuentaBancoPunVenJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(CuentaBancoPunVenBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<CuentaBancoPunVen> cuentabancopunvenValidator = new ClassValidator<CuentaBancoPunVen>(CuentaBancoPunVen.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public CuentaBancoPunVen cuentabancopunven;	
	public CuentaBancoPunVen cuentabancopunvenAux;
	public CuentaBancoPunVen cuentabancopunvenAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public CuentaBancoPunVen cuentabancopunvenTotales;
	public Long idCuentaBancoPunVenActual;
	public Long iIdNuevoCuentaBancoPunVen=0L;
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

	public String sFinalQueryComboBanco="";

	public List<Banco> bancosForeignKey;

	public List<Banco> getbancosForeignKey() {
		return bancosForeignKey;
	}

	public void setbancosForeignKey(List<Banco> bancosForeignKey) {
		this.bancosForeignKey = bancosForeignKey;
	}

	//OBJETO FK ACTUAL
	public Banco bancoForeignKey;

	public Banco getbancoForeignKey() {
		return bancoForeignKey;
	}

	public void setbancoForeignKey(Banco bancoForeignKey) {
		this.bancoForeignKey = bancoForeignKey;
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
	public Long idClienteActual=0L;

	public Long getidClienteActual() {
		return idClienteActual;
	}

	public void setidClienteActual(Long idClienteActual) {
		this.idClienteActual= idClienteActual;
	}
	
	

	public Boolean isTienePermisosFormaPagoPuntoVenta=false;

	public Boolean getIsTienePermisosFormaPagoPuntoVenta() {
		return isTienePermisosFormaPagoPuntoVenta;
	}

	public void setIsTienePermisosFormaPagoPuntoVenta(Boolean isTienePermisosFormaPagoPuntoVenta) {
		this.isTienePermisosFormaPagoPuntoVenta= isTienePermisosFormaPagoPuntoVenta;
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
	
	public Boolean isPermisoTodoCuentaBancoPunVen;
	public Boolean isPermisoNuevoCuentaBancoPunVen;
	public Boolean isPermisoActualizarCuentaBancoPunVen;
	public Boolean isPermisoActualizarOriginalCuentaBancoPunVen;
	public Boolean isPermisoEliminarCuentaBancoPunVen;
	public Boolean isPermisoGuardarCambiosCuentaBancoPunVen;
	public Boolean isPermisoConsultaCuentaBancoPunVen;
	public Boolean isPermisoBusquedaCuentaBancoPunVen;
	public Boolean isPermisoReporteCuentaBancoPunVen;
	public Boolean isPermisoPaginacionMedioCuentaBancoPunVen;
	public Boolean isPermisoPaginacionAltoCuentaBancoPunVen;
	public Boolean isPermisoPaginacionTodoCuentaBancoPunVen;
	public Boolean isPermisoCopiarCuentaBancoPunVen;
	public Boolean isPermisoVerFormCuentaBancoPunVen;
	public Boolean isPermisoDuplicarCuentaBancoPunVen;
	public Boolean isPermisoOrdenCuentaBancoPunVen;
	
	
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
	
	public CuentaBancoPunVenParameterReturnGeneral cuentabancopunvenReturnGeneral;
	public CuentaBancoPunVenParameterReturnGeneral cuentabancopunvenParameterGeneral;
	
	

	public FormaPagoPuntoVentaLogic formapagopuntoventaLogic=null;

	public FormaPagoPuntoVentaLogic getFormaPagoPuntoVentaLogic() {
		return formapagopuntoventaLogic;
	}

	public void setFormaPagoPuntoVentaLogic(FormaPagoPuntoVentaLogic formapagopuntoventaLogic) {
		this.formapagopuntoventaLogic = formapagopuntoventaLogic;
	}
 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoCuentaBancoPunVen=false;
	public Boolean esParaAccionDesdeFormularioCuentaBancoPunVen=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected CuentaBancoPunVenSessionBeanAdditional cuentabancopunvenSessionBeanAdditional=null;
	
	public CuentaBancoPunVenSessionBeanAdditional getCuentaBancoPunVenSessionBeanAdditional() {
		return this.cuentabancopunvenSessionBeanAdditional;
	}
	
	public void setCuentaBancoPunVenSessionBeanAdditional(CuentaBancoPunVenSessionBeanAdditional cuentabancopunvenSessionBeanAdditional) {
		try {
			this.cuentabancopunvenSessionBeanAdditional=cuentabancopunvenSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected CuentaBancoPunVenBeanSwingJInternalFrameAdditional cuentabancopunvenBeanSwingJInternalFrameAdditional=null;
	//public class CuentaBancoPunVenBeanSwingJInternalFrame
	
	public CuentaBancoPunVenBeanSwingJInternalFrameAdditional getCuentaBancoPunVenBeanSwingJInternalFrameAdditional() {
		return this.cuentabancopunvenBeanSwingJInternalFrameAdditional;
	}
	
	public void setCuentaBancoPunVenBeanSwingJInternalFrameAdditional(CuentaBancoPunVenBeanSwingJInternalFrameAdditional cuentabancopunvenBeanSwingJInternalFrameAdditional) {
		try {
			this.cuentabancopunvenBeanSwingJInternalFrameAdditional=cuentabancopunvenBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public CuentaBancoPunVenLogic cuentabancopunvenLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public CuentaBancoPunVen cuentabancopunvenBean;
	public CuentaBancoPunVenConstantesFunciones cuentabancopunvenConstantesFunciones;
	//public CuentaBancoPunVenParameterReturnGeneral cuentabancopunvenReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	public SucursalLogic sucursalLogic;
	public BancoLogic bancoLogic;
	public ClienteLogic clienteLogic;
	public CuentaContableLogic cuentacontableLogic;
	
	//PARAMETROS
	
	
	//public List<CuentaBancoPunVen> cuentabancopunvens;	
	//public List<CuentaBancoPunVen> cuentabancopunvensEliminados;
	//public List<CuentaBancoPunVen> cuentabancopunvensAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoCuentaBancoPunVen=false;
	public Boolean isVisibilidadCeldaDuplicarCuentaBancoPunVen=true;
	public Boolean isVisibilidadCeldaCopiarCuentaBancoPunVen=true;
	public Boolean isVisibilidadCeldaVerFormCuentaBancoPunVen=true;
	public Boolean isVisibilidadCeldaOrdenCuentaBancoPunVen=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesCuentaBancoPunVen=false;
	public Boolean isVisibilidadCeldaModificarCuentaBancoPunVen=false;
	public Boolean isVisibilidadCeldaActualizarCuentaBancoPunVen=false;
	public Boolean isVisibilidadCeldaEliminarCuentaBancoPunVen=false;
	public Boolean isVisibilidadCeldaCancelarCuentaBancoPunVen=false;
	public Boolean isVisibilidadCeldaGuardarCuentaBancoPunVen=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosCuentaBancoPunVen=false;	
	
	
	public Boolean isVisibilidadFK_IdBanco=false;
	public Boolean isVisibilidadFK_IdCliente=false;
	public Boolean isVisibilidadFK_IdCuentaContable=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	public Boolean isVisibilidadFK_IdSucursal=false;
	
	public Long getiIdNuevoCuentaBancoPunVen() {
		return this.iIdNuevoCuentaBancoPunVen;
	}

	public void setiIdNuevoCuentaBancoPunVen(Long iIdNuevoCuentaBancoPunVen) {
		this.iIdNuevoCuentaBancoPunVen = iIdNuevoCuentaBancoPunVen;
	}
	
	public Long getidCuentaBancoPunVenActual() {
		return this.idCuentaBancoPunVenActual;
	}

	public void setidCuentaBancoPunVenActual(Long idCuentaBancoPunVenActual) {
		this.idCuentaBancoPunVenActual = idCuentaBancoPunVenActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public CuentaBancoPunVen getcuentabancopunven() {
		return this.cuentabancopunven;
	}

	public void setcuentabancopunven(CuentaBancoPunVen cuentabancopunven) {
		this.cuentabancopunven = cuentabancopunven;
	}
	
	public CuentaBancoPunVen getcuentabancopunvenAux() {
		return this.cuentabancopunvenAux;
	}

	public void setcuentabancopunvenAux(CuentaBancoPunVen cuentabancopunvenAux) {
		this.cuentabancopunvenAux = cuentabancopunvenAux;
	}				
	
	public CuentaBancoPunVen getcuentabancopunvenAnterior() {
		return this.cuentabancopunvenAnterior;
	}

	public void setcuentabancopunvenAnterior(CuentaBancoPunVen cuentabancopunvenAnterior) {
		this.cuentabancopunvenAnterior = cuentabancopunvenAnterior;
	}	
	
	public CuentaBancoPunVen getcuentabancopunvenTotales() {
		return this.cuentabancopunvenTotales;
	}

	public void setcuentabancopunvenTotales(CuentaBancoPunVen cuentabancopunvenTotales) {
		this.cuentabancopunvenTotales = cuentabancopunvenTotales;
	}	
	
	public CuentaBancoPunVen getcuentabancopunvenBean() {
		return this.cuentabancopunvenBean;
	}

	public void setcuentabancopunvenBean(CuentaBancoPunVen cuentabancopunvenBean) {
		this.cuentabancopunvenBean = cuentabancopunvenBean;
	}	
	
	public CuentaBancoPunVenParameterReturnGeneral getcuentabancopunvenReturnGeneral() {
		return this.cuentabancopunvenReturnGeneral;
	}

	public void setcuentabancopunvenReturnGeneral(CuentaBancoPunVenParameterReturnGeneral cuentabancopunvenReturnGeneral) {
		this.cuentabancopunvenReturnGeneral = cuentabancopunvenReturnGeneral;
	}	
	
	
	public Long id_bancoFK_IdBanco=-1L;

	public Long getid_bancoFK_IdBanco() {
		return this.id_bancoFK_IdBanco;
	}

	public void setid_bancoFK_IdBanco(Long id_bancoFK_IdBanco) {
		this.id_bancoFK_IdBanco = id_bancoFK_IdBanco;
	}

	public Long id_clienteFK_IdCliente=-1L;

	public Long getid_clienteFK_IdCliente() {
		return this.id_clienteFK_IdCliente;
	}

	public void setid_clienteFK_IdCliente(Long id_clienteFK_IdCliente) {
		this.id_clienteFK_IdCliente = id_clienteFK_IdCliente;
	}

	public Long id_cuenta_contableFK_IdCuentaContable=-1L;

	public Long getid_cuenta_contableFK_IdCuentaContable() {
		return this.id_cuenta_contableFK_IdCuentaContable;
	}

	public void setid_cuenta_contableFK_IdCuentaContable(Long id_cuenta_contableFK_IdCuentaContable) {
		this.id_cuenta_contableFK_IdCuentaContable = id_cuenta_contableFK_IdCuentaContable;
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
	
	
	public CuentaBancoPunVenLogic getCuentaBancoPunVenLogic()	{		
		return cuentabancopunvenLogic;
	}

	public void setCuentaBancoPunVenLogic(CuentaBancoPunVenLogic cuentabancopunvenLogic) {
		this.cuentabancopunvenLogic = cuentabancopunvenLogic;
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
	
	public Boolean getIsEsNuevoCuentaBancoPunVen() {
		return isEsNuevoCuentaBancoPunVen;
	}

	public void setIsEsNuevoCuentaBancoPunVen(Boolean isEsNuevoCuentaBancoPunVen) {
		this.isEsNuevoCuentaBancoPunVen = isEsNuevoCuentaBancoPunVen;
	}

	public Boolean getEsParaAccionDesdeFormularioCuentaBancoPunVen() {
		return esParaAccionDesdeFormularioCuentaBancoPunVen;
	}
	
	public void setEsParaAccionDesdeFormularioCuentaBancoPunVen(Boolean esParaAccionDesdeFormularioCuentaBancoPunVen) {
		this.esParaAccionDesdeFormularioCuentaBancoPunVen = esParaAccionDesdeFormularioCuentaBancoPunVen;
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

			if(this.cuentabancopunvenSessionBean==null) {
				this.cuentabancopunvenSessionBean=new CuentaBancoPunVenSessionBean();
			}

			if(!this.cuentabancopunvenSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(cuentabancopunvenSessionBean.getlidEmpresaActual());
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

			if(this.cuentabancopunvenSessionBean==null) {
				this.cuentabancopunvenSessionBean=new CuentaBancoPunVenSessionBean();
			}

			if(!this.cuentabancopunvenSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
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
					sucursalLogic.getEntityWithConnection(cuentabancopunvenSessionBean.getlidSucursalActual());
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

	public void cargarCombosBancosForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.bancosForeignKey=new ArrayList<Banco>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			BancoLogic bancoLogic=new BancoLogic();

			//bancoLogic.getBancoDataAccess().setIsForForeingKeyData(true);

			if(this.cuentabancopunvenSessionBean==null) {
				this.cuentabancopunvenSessionBean=new CuentaBancoPunVenSessionBean();
			}

			if(!this.cuentabancopunvenSessionBean.getisBusquedaDesdeForeignKeySesionBanco()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//bancoLogic.getBancoDataAccess().setIsForForeingKeyData(true);

					bancoLogic.getTodosBancosWithConnection(sFinalQuery,new Pagination());

					this.bancosForeignKey=bancoLogic.getBancos();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaBanco(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					bancoLogic.getEntityWithConnection(cuentabancopunvenSessionBean.getlidBancoActual());
					this.bancosForeignKey.add(bancoLogic.getBanco());
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

			if(this.cuentabancopunvenSessionBean==null) {
				this.cuentabancopunvenSessionBean=new CuentaBancoPunVenSessionBean();
			}

			if(!this.cuentabancopunvenSessionBean.getisBusquedaDesdeForeignKeySesionCliente()) {
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
					clienteLogic.getEntityWithConnection(cuentabancopunvenSessionBean.getlidClienteActual());
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

			if(this.cuentabancopunvenSessionBean==null) {
				this.cuentabancopunvenSessionBean=new CuentaBancoPunVenSessionBean();
			}

			if(!this.cuentabancopunvenSessionBean.getisBusquedaDesdeForeignKeySesionCuentaContable()) {
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
					cuentacontableLogic.getEntityWithConnection(cuentabancopunvenSessionBean.getlidCuentaContableActual());
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

					if(this.cuentabancopunven!=null) {
						this.cuentabancopunven.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormCuentaBancoPunVen!=null) {
						this.jInternalFrameDetalleFormCuentaBancoPunVen.jComboBoxid_empresaCuentaBancoPunVen.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaCuentaBancoPunVen.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormCuentaBancoPunVen!=null) {
						if(this.jInternalFrameDetalleFormCuentaBancoPunVen.jComboBoxid_empresaCuentaBancoPunVen.getItemCount()>0) {
							this.jInternalFrameDetalleFormCuentaBancoPunVen.jComboBoxid_empresaCuentaBancoPunVen.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaCuentaBancoPunVenGenerico)throws Exception
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
				jComboBoxid_empresaCuentaBancoPunVenGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaCuentaBancoPunVenGenerico!=null && jComboBoxid_empresaCuentaBancoPunVenGenerico.getItemCount()>0) {
					jComboBoxid_empresaCuentaBancoPunVenGenerico.setSelectedIndex(0);
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

					if(this.cuentabancopunven!=null) {
						this.cuentabancopunven.setSucursal(sucursalTemp);
					}

					if(this.jInternalFrameDetalleFormCuentaBancoPunVen!=null) {
						this.jInternalFrameDetalleFormCuentaBancoPunVen.jComboBoxid_sucursalCuentaBancoPunVen.setSelectedItem(sucursalTemp);
					}
				} else {
					//jComboBoxid_sucursalCuentaBancoPunVen.setSelectedItem(sucursalTemp);
					if(this.jInternalFrameDetalleFormCuentaBancoPunVen!=null) {
						if(this.jInternalFrameDetalleFormCuentaBancoPunVen.jComboBoxid_sucursalCuentaBancoPunVen.getItemCount()>0) {
							this.jInternalFrameDetalleFormCuentaBancoPunVen.jComboBoxid_sucursalCuentaBancoPunVen.setSelectedIndex(0);
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
	public void setActualSucursalForeignKeyGenerico(Long idSucursalSeleccionado,JComboBox jComboBoxid_sucursalCuentaBancoPunVenGenerico)throws Exception
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
				jComboBoxid_sucursalCuentaBancoPunVenGenerico.setSelectedItem(sucursalTemp);
			} else {
				if(jComboBoxid_sucursalCuentaBancoPunVenGenerico!=null && jComboBoxid_sucursalCuentaBancoPunVenGenerico.getItemCount()>0) {
					jComboBoxid_sucursalCuentaBancoPunVenGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualBancoForeignKey(Long idBancoSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Banco  bancoTemp=null;

			for(Banco bancoAux:bancosForeignKey) {
				if(bancoAux.getId()!=null && bancoAux.getId().equals(idBancoSeleccionado)) {
					bancoTemp=bancoAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(bancoTemp!=null) {

					if(this.cuentabancopunven!=null) {
						this.cuentabancopunven.setBanco(bancoTemp);
					}

					if(this.jInternalFrameDetalleFormCuentaBancoPunVen!=null) {
						this.jInternalFrameDetalleFormCuentaBancoPunVen.jComboBoxid_bancoCuentaBancoPunVen.setSelectedItem(bancoTemp);
					}
				} else {
					//jComboBoxid_bancoCuentaBancoPunVen.setSelectedItem(bancoTemp);
					if(this.jInternalFrameDetalleFormCuentaBancoPunVen!=null) {
						if(this.jInternalFrameDetalleFormCuentaBancoPunVen.jComboBoxid_bancoCuentaBancoPunVen.getItemCount()>0) {
							this.jInternalFrameDetalleFormCuentaBancoPunVen.jComboBoxid_bancoCuentaBancoPunVen.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdBanco") || sFormularioTipoBusqueda.equals("Todos")){
					if(bancoTemp!=null && jComboBoxid_bancoFK_IdBancoCuentaBancoPunVen!=null) {
						jComboBoxid_bancoFK_IdBancoCuentaBancoPunVen.setSelectedItem(bancoTemp);
					} else {
						if(jComboBoxid_bancoFK_IdBancoCuentaBancoPunVen!=null) {
							//jComboBoxid_bancoFK_IdBancoCuentaBancoPunVen.setSelectedItem(bancoTemp);
							if(jComboBoxid_bancoFK_IdBancoCuentaBancoPunVen.getItemCount()>0) {
								jComboBoxid_bancoFK_IdBancoCuentaBancoPunVen.setSelectedIndex(0);
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

	public String getActualBancoForeignKeyDescripcion(Long idBancoSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Banco  bancoTemp=null;

			for(Banco bancoAux:bancosForeignKey) {
				if(bancoAux.getId()!=null && bancoAux.getId().equals(idBancoSeleccionado)) {
					bancoTemp=bancoAux;
					break;
				}
			}


			sDescripcion=BancoConstantesFunciones.getBancoDescripcion(bancoTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualBancoForeignKeyGenerico(Long idBancoSeleccionado,JComboBox jComboBoxid_bancoCuentaBancoPunVenGenerico)throws Exception
	{
		try
		{
			Banco  bancoTemp=null;

			for(Banco bancoAux:bancosForeignKey) {
				if(bancoAux.getId()!=null && bancoAux.getId().equals(idBancoSeleccionado)) {
					bancoTemp=bancoAux;
					break;
				}
			}

			if(bancoTemp!=null) {
				jComboBoxid_bancoCuentaBancoPunVenGenerico.setSelectedItem(bancoTemp);
			} else {
				if(jComboBoxid_bancoCuentaBancoPunVenGenerico!=null && jComboBoxid_bancoCuentaBancoPunVenGenerico.getItemCount()>0) {
					jComboBoxid_bancoCuentaBancoPunVenGenerico.setSelectedIndex(0);
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

					if(this.cuentabancopunven!=null) {
						this.cuentabancopunven.setCliente(clienteTemp);
					}

					if(this.jInternalFrameDetalleFormCuentaBancoPunVen!=null) {
						this.jInternalFrameDetalleFormCuentaBancoPunVen.jComboBoxid_clienteCuentaBancoPunVen.setSelectedItem(clienteTemp);
					}
				} else {
					//jComboBoxid_clienteCuentaBancoPunVen.setSelectedItem(clienteTemp);
					if(this.jInternalFrameDetalleFormCuentaBancoPunVen!=null) {
						if(this.jInternalFrameDetalleFormCuentaBancoPunVen.jComboBoxid_clienteCuentaBancoPunVen.getItemCount()>0) {
							this.jInternalFrameDetalleFormCuentaBancoPunVen.jComboBoxid_clienteCuentaBancoPunVen.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdCliente") || sFormularioTipoBusqueda.equals("Todos")){
					if(clienteTemp!=null && jComboBoxid_clienteFK_IdClienteCuentaBancoPunVen!=null) {
						jComboBoxid_clienteFK_IdClienteCuentaBancoPunVen.setSelectedItem(clienteTemp);
					} else {
						if(jComboBoxid_clienteFK_IdClienteCuentaBancoPunVen!=null) {
							//jComboBoxid_clienteFK_IdClienteCuentaBancoPunVen.setSelectedItem(clienteTemp);
							if(jComboBoxid_clienteFK_IdClienteCuentaBancoPunVen.getItemCount()>0) {
								jComboBoxid_clienteFK_IdClienteCuentaBancoPunVen.setSelectedIndex(0);
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
	public void setActualClienteForeignKeyGenerico(Long idClienteSeleccionado,JComboBox jComboBoxid_clienteCuentaBancoPunVenGenerico)throws Exception
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
				jComboBoxid_clienteCuentaBancoPunVenGenerico.setSelectedItem(clienteTemp);
			} else {
				if(jComboBoxid_clienteCuentaBancoPunVenGenerico!=null && jComboBoxid_clienteCuentaBancoPunVenGenerico.getItemCount()>0) {
					jComboBoxid_clienteCuentaBancoPunVenGenerico.setSelectedIndex(0);
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

					if(this.cuentabancopunven!=null) {
						this.cuentabancopunven.setCuentaContable(cuentacontableTemp);
					}

					if(this.jInternalFrameDetalleFormCuentaBancoPunVen!=null) {
						this.jInternalFrameDetalleFormCuentaBancoPunVen.jComboBoxid_cuenta_contableCuentaBancoPunVen.setSelectedItem(cuentacontableTemp);
					}
				} else {
					//jComboBoxid_cuenta_contableCuentaBancoPunVen.setSelectedItem(cuentacontableTemp);
					if(this.jInternalFrameDetalleFormCuentaBancoPunVen!=null) {
						if(this.jInternalFrameDetalleFormCuentaBancoPunVen.jComboBoxid_cuenta_contableCuentaBancoPunVen.getItemCount()>0) {
							this.jInternalFrameDetalleFormCuentaBancoPunVen.jComboBoxid_cuenta_contableCuentaBancoPunVen.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdCuentaContable") || sFormularioTipoBusqueda.equals("Todos")){
					if(cuentacontableTemp!=null && jComboBoxid_cuenta_contableFK_IdCuentaContableCuentaBancoPunVen!=null) {
						jComboBoxid_cuenta_contableFK_IdCuentaContableCuentaBancoPunVen.setSelectedItem(cuentacontableTemp);
					} else {
						if(jComboBoxid_cuenta_contableFK_IdCuentaContableCuentaBancoPunVen!=null) {
							//jComboBoxid_cuenta_contableFK_IdCuentaContableCuentaBancoPunVen.setSelectedItem(cuentacontableTemp);
							if(jComboBoxid_cuenta_contableFK_IdCuentaContableCuentaBancoPunVen.getItemCount()>0) {
								jComboBoxid_cuenta_contableFK_IdCuentaContableCuentaBancoPunVen.setSelectedIndex(0);
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
	public void setActualCuentaContableForeignKeyGenerico(Long idCuentaContableSeleccionado,JComboBox jComboBoxid_cuenta_contableCuentaBancoPunVenGenerico)throws Exception
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
				jComboBoxid_cuenta_contableCuentaBancoPunVenGenerico.setSelectedItem(cuentacontableTemp);
			} else {
				if(jComboBoxid_cuenta_contableCuentaBancoPunVenGenerico!=null && jComboBoxid_cuenta_contableCuentaBancoPunVenGenerico.getItemCount()>0) {
					jComboBoxid_cuenta_contableCuentaBancoPunVenGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(CuentaBancoPunVen cuentabancopunven,JComboBox jComboBoxid_empresaCuentaBancoPunVenGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaCuentaBancoPunVenGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormCuentaBancoPunVen.jComboBoxid_empresaCuentaBancoPunVen.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaCuentaBancoPunVenGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				cuentabancopunven.setid_empresa(empresaAux.getId());
				cuentabancopunven.setempresa_descripcion(CuentaBancoPunVenConstantesFunciones.getEmpresaDescripcion(empresaAux));
				cuentabancopunven.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarSucursalForeignKey(CuentaBancoPunVen cuentabancopunven,JComboBox jComboBoxid_sucursalCuentaBancoPunVenGenerico)throws Exception
	{
		try
		{
			Sucursal  sucursalAux=new Sucursal();

			if(jComboBoxid_sucursalCuentaBancoPunVenGenerico==null) {
				sucursalAux=(Sucursal)this.jInternalFrameDetalleFormCuentaBancoPunVen.jComboBoxid_sucursalCuentaBancoPunVen.getSelectedItem();
			} else {
				sucursalAux=(Sucursal)jComboBoxid_sucursalCuentaBancoPunVenGenerico.getSelectedItem();
			}

			if(sucursalAux!=null && sucursalAux.getId()!=null) {
				cuentabancopunven.setid_sucursal(sucursalAux.getId());
				cuentabancopunven.setsucursal_descripcion(CuentaBancoPunVenConstantesFunciones.getSucursalDescripcion(sucursalAux));
				cuentabancopunven.setSucursal(sucursalAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarBancoForeignKey(CuentaBancoPunVen cuentabancopunven,JComboBox jComboBoxid_bancoCuentaBancoPunVenGenerico)throws Exception
	{
		try
		{
			Banco  bancoAux=new Banco();

			if(jComboBoxid_bancoCuentaBancoPunVenGenerico==null) {
				bancoAux=(Banco)this.jInternalFrameDetalleFormCuentaBancoPunVen.jComboBoxid_bancoCuentaBancoPunVen.getSelectedItem();
			} else {
				bancoAux=(Banco)jComboBoxid_bancoCuentaBancoPunVenGenerico.getSelectedItem();
			}

			if(bancoAux!=null && bancoAux.getId()!=null) {
				cuentabancopunven.setid_banco(bancoAux.getId());
				cuentabancopunven.setbanco_descripcion(CuentaBancoPunVenConstantesFunciones.getBancoDescripcion(bancoAux));
				cuentabancopunven.setBanco(bancoAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarClienteForeignKey(CuentaBancoPunVen cuentabancopunven,JComboBox jComboBoxid_clienteCuentaBancoPunVenGenerico)throws Exception
	{
		try
		{
			Cliente  clienteAux=new Cliente();

			if(jComboBoxid_clienteCuentaBancoPunVenGenerico==null) {
				clienteAux=(Cliente)this.jInternalFrameDetalleFormCuentaBancoPunVen.jComboBoxid_clienteCuentaBancoPunVen.getSelectedItem();
			} else {
				clienteAux=(Cliente)jComboBoxid_clienteCuentaBancoPunVenGenerico.getSelectedItem();
			}

			if(clienteAux!=null && clienteAux.getId()!=null) {
				cuentabancopunven.setid_cliente(clienteAux.getId());
				cuentabancopunven.setcliente_descripcion(CuentaBancoPunVenConstantesFunciones.getClienteDescripcion(clienteAux));
				cuentabancopunven.setCliente(clienteAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarCuentaContableForeignKey(CuentaBancoPunVen cuentabancopunven,JComboBox jComboBoxid_cuenta_contableCuentaBancoPunVenGenerico)throws Exception
	{
		try
		{
			CuentaContable  cuentacontableAux=new CuentaContable();

			if(jComboBoxid_cuenta_contableCuentaBancoPunVenGenerico==null) {
				cuentacontableAux=(CuentaContable)this.jInternalFrameDetalleFormCuentaBancoPunVen.jComboBoxid_cuenta_contableCuentaBancoPunVen.getSelectedItem();
			} else {
				cuentacontableAux=(CuentaContable)jComboBoxid_cuenta_contableCuentaBancoPunVenGenerico.getSelectedItem();
			}

			if(cuentacontableAux!=null && cuentacontableAux.getId()!=null) {
				cuentabancopunven.setid_cuenta_contable(cuentacontableAux.getId());
				cuentabancopunven.setcuentacontable_descripcion(CuentaBancoPunVenConstantesFunciones.getCuentaContableDescripcion(cuentacontableAux));
				cuentabancopunven.setCuentaContable(cuentacontableAux);			}
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

					if(!CuentaBancoPunVenJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormCuentaBancoPunVen!=null) { 
							this.jInternalFrameDetalleFormCuentaBancoPunVen.jComboBoxid_empresaCuentaBancoPunVen.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormCuentaBancoPunVen.jComboBoxid_empresaCuentaBancoPunVen.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormCuentaBancoPunVen!=null) { 
					}

					if(!CuentaBancoPunVenJInternalFrame.ISBINDING_MANUAL) {
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

					if(!CuentaBancoPunVenJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormCuentaBancoPunVen!=null) { 
							this.jInternalFrameDetalleFormCuentaBancoPunVen.jComboBoxid_sucursalCuentaBancoPunVen.removeAllItems();

							for(Sucursal sucursal:this.sucursalsForeignKey) {
								this.jInternalFrameDetalleFormCuentaBancoPunVen.jComboBoxid_sucursalCuentaBancoPunVen.addItem(sucursal);
							}
						}
					}

					if(this.jInternalFrameDetalleFormCuentaBancoPunVen!=null) { 
					}

					if(!CuentaBancoPunVenJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameBancosForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingBanco=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!CuentaBancoPunVenJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormCuentaBancoPunVen!=null) { 
							this.jInternalFrameDetalleFormCuentaBancoPunVen.jComboBoxid_bancoCuentaBancoPunVen.removeAllItems();

							for(Banco banco:this.bancosForeignKey) {
								this.jInternalFrameDetalleFormCuentaBancoPunVen.jComboBoxid_bancoCuentaBancoPunVen.addItem(banco);
							}
						}
					}

					if(this.jInternalFrameDetalleFormCuentaBancoPunVen!=null) { 
					}

					if(!CuentaBancoPunVenJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdBanco") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!CuentaBancoPunVenJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_bancoFK_IdBancoCuentaBancoPunVen.removeAllItems();

							for(Banco banco:this.bancosForeignKey) {
								this.jComboBoxid_bancoFK_IdBancoCuentaBancoPunVen.addItem(banco);
							}
						}

						if(!CuentaBancoPunVenJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

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

					if(!CuentaBancoPunVenJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormCuentaBancoPunVen!=null) { 
							this.jInternalFrameDetalleFormCuentaBancoPunVen.jComboBoxid_clienteCuentaBancoPunVen.removeAllItems();

							for(Cliente cliente:this.clientesForeignKey) {
								this.jInternalFrameDetalleFormCuentaBancoPunVen.jComboBoxid_clienteCuentaBancoPunVen.addItem(cliente);
							}
						}
					}

					if(this.jInternalFrameDetalleFormCuentaBancoPunVen!=null) { 
					}

					if(!CuentaBancoPunVenJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdCliente") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!CuentaBancoPunVenJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_clienteFK_IdClienteCuentaBancoPunVen.removeAllItems();

							for(Cliente cliente:this.clientesForeignKey) {
								this.jComboBoxid_clienteFK_IdClienteCuentaBancoPunVen.addItem(cliente);
							}
						}

						if(!CuentaBancoPunVenJInternalFrame.ISBINDING_MANUAL) {
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

					if(!CuentaBancoPunVenJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormCuentaBancoPunVen!=null) { 
							this.jInternalFrameDetalleFormCuentaBancoPunVen.jComboBoxid_cuenta_contableCuentaBancoPunVen.removeAllItems();

							for(CuentaContable cuentacontable:this.cuentacontablesForeignKey) {
								this.jInternalFrameDetalleFormCuentaBancoPunVen.jComboBoxid_cuenta_contableCuentaBancoPunVen.addItem(cuentacontable);
							}
						}
					}

					if(this.jInternalFrameDetalleFormCuentaBancoPunVen!=null) { 
					}

					if(!CuentaBancoPunVenJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdCuentaContable") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!CuentaBancoPunVenJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_cuenta_contableFK_IdCuentaContableCuentaBancoPunVen.removeAllItems();

							for(CuentaContable cuentacontable:this.cuentacontablesForeignKey) {
								this.jComboBoxid_cuenta_contableFK_IdCuentaContableCuentaBancoPunVen.addItem(cuentacontable);
							}
						}

						if(!CuentaBancoPunVenJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormCuentaBancoPunVen!=null) {
							this.jInternalFrameDetalleFormCuentaBancoPunVen.jComboBoxid_empresaCuentaBancoPunVen.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormCuentaBancoPunVen!=null) {
							this.jInternalFrameDetalleFormCuentaBancoPunVen.jComboBoxid_empresaCuentaBancoPunVen.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormCuentaBancoPunVen!=null) {
							this.jInternalFrameDetalleFormCuentaBancoPunVen.jComboBoxid_sucursalCuentaBancoPunVen.setSelectedItem(sucursal);
						}
					} else {
						if(this.jInternalFrameDetalleFormCuentaBancoPunVen!=null) {
							this.jInternalFrameDetalleFormCuentaBancoPunVen.jComboBoxid_sucursalCuentaBancoPunVen.setSelectedIndex(iIndexSelected);
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

		public void setSelectedItemCombosFrameBancoForeignKey(Banco banco,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormCuentaBancoPunVen!=null) {
							this.jInternalFrameDetalleFormCuentaBancoPunVen.jComboBoxid_bancoCuentaBancoPunVen.setSelectedItem(banco);
						}
					} else {
						if(this.jInternalFrameDetalleFormCuentaBancoPunVen!=null) {
							this.jInternalFrameDetalleFormCuentaBancoPunVen.jComboBoxid_bancoCuentaBancoPunVen.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_bancoFK_IdBancoCuentaBancoPunVen.setSelectedItem(banco);
						} else {
							this.jComboBoxid_bancoFK_IdBancoCuentaBancoPunVen.setSelectedIndex(iIndexSelected);
						}

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
						if(this.jInternalFrameDetalleFormCuentaBancoPunVen!=null) {
							this.jInternalFrameDetalleFormCuentaBancoPunVen.jComboBoxid_clienteCuentaBancoPunVen.setSelectedItem(cliente);
						}
					} else {
						if(this.jInternalFrameDetalleFormCuentaBancoPunVen!=null) {
							this.jInternalFrameDetalleFormCuentaBancoPunVen.jComboBoxid_clienteCuentaBancoPunVen.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_clienteFK_IdClienteCuentaBancoPunVen.setSelectedItem(cliente);
						} else {
							this.jComboBoxid_clienteFK_IdClienteCuentaBancoPunVen.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormCuentaBancoPunVen!=null) {
							this.jInternalFrameDetalleFormCuentaBancoPunVen.jComboBoxid_cuenta_contableCuentaBancoPunVen.setSelectedItem(cuentacontable);
						}
					} else {
						if(this.jInternalFrameDetalleFormCuentaBancoPunVen!=null) {
							this.jInternalFrameDetalleFormCuentaBancoPunVen.jComboBoxid_cuenta_contableCuentaBancoPunVen.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_cuenta_contableFK_IdCuentaContableCuentaBancoPunVen.setSelectedItem(cuentacontable);
						} else {
							this.jComboBoxid_cuenta_contableFK_IdCuentaContableCuentaBancoPunVen.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesCuentaBancoPunVen() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			CuentaBancoPunVenConstantesFunciones.refrescarForeignKeysDescripcionesCuentaBancoPunVen(this.cuentabancopunvenLogic.getCuentaBancoPunVens());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			CuentaBancoPunVenConstantesFunciones.refrescarForeignKeysDescripcionesCuentaBancoPunVen(this.cuentabancopunvens);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
		classes.add(new Classe(Sucursal.class));
		classes.add(new Classe(Banco.class));
		classes.add(new Classe(Cliente.class));
		classes.add(new Classe(CuentaContable.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//cuentabancopunvenLogic.setCuentaBancoPunVens(this.cuentabancopunvens);
			cuentabancopunvenLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public CuentaBancoPunVenParameterReturnGeneral getCuentaBancoPunVenParameterGeneral() {
		return this.cuentabancopunvenParameterGeneral;
	}
	
	public void setCuentaBancoPunVenParameterGeneral(CuentaBancoPunVenParameterReturnGeneral cuentabancopunvenParameterGeneral) {
		this.cuentabancopunvenParameterGeneral = cuentabancopunvenParameterGeneral;
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
	
	public Boolean getIsPermisoTodoCuentaBancoPunVen() {
		return isPermisoTodoCuentaBancoPunVen;
	}

	public void setIsPermisoTodoCuentaBancoPunVen(Boolean isPermisoTodoCuentaBancoPunVen) {
		this.isPermisoTodoCuentaBancoPunVen = isPermisoTodoCuentaBancoPunVen;
	}

	public Boolean getIsPermisoNuevoCuentaBancoPunVen() {
		return isPermisoNuevoCuentaBancoPunVen;
	}

	public void setIsPermisoNuevoCuentaBancoPunVen(Boolean isPermisoNuevoCuentaBancoPunVen) {
		this.isPermisoNuevoCuentaBancoPunVen = isPermisoNuevoCuentaBancoPunVen;
	}

	public Boolean getIsPermisoActualizarCuentaBancoPunVen() {
		return isPermisoActualizarCuentaBancoPunVen;
	}

	public void setIsPermisoActualizarCuentaBancoPunVen(Boolean isPermisoActualizarCuentaBancoPunVen) {
		this.isPermisoActualizarCuentaBancoPunVen = isPermisoActualizarCuentaBancoPunVen;
	}

	public Boolean getIsPermisoEliminarCuentaBancoPunVen() {
		return isPermisoEliminarCuentaBancoPunVen;
	}

	public void setIsPermisoEliminarCuentaBancoPunVen(Boolean isPermisoEliminarCuentaBancoPunVen) {
		this.isPermisoEliminarCuentaBancoPunVen = isPermisoEliminarCuentaBancoPunVen;
	}

	public Boolean getIsPermisoGuardarCambiosCuentaBancoPunVen() {
		return isPermisoGuardarCambiosCuentaBancoPunVen;
	}

	public void setIsPermisoGuardarCambiosCuentaBancoPunVen(Boolean isPermisoGuardarCambiosCuentaBancoPunVen) {
		this.isPermisoGuardarCambiosCuentaBancoPunVen = isPermisoGuardarCambiosCuentaBancoPunVen;
	}
	
	public Boolean getIsPermisoConsultaCuentaBancoPunVen() {
		return isPermisoConsultaCuentaBancoPunVen;
	}

	public void setIsPermisoConsultaCuentaBancoPunVen(Boolean isPermisoConsultaCuentaBancoPunVen) {
		this.isPermisoConsultaCuentaBancoPunVen = isPermisoConsultaCuentaBancoPunVen;
	}

	public Boolean getIsPermisoBusquedaCuentaBancoPunVen() {
		return isPermisoBusquedaCuentaBancoPunVen;
	}

	public void setIsPermisoBusquedaCuentaBancoPunVen(Boolean isPermisoBusquedaCuentaBancoPunVen) {
		this.isPermisoBusquedaCuentaBancoPunVen = isPermisoBusquedaCuentaBancoPunVen;
	}

	public Boolean getIsPermisoReporteCuentaBancoPunVen() {
		return isPermisoReporteCuentaBancoPunVen;
	}

	public void setIsPermisoReporteCuentaBancoPunVen(Boolean isPermisoReporteCuentaBancoPunVen) {
		this.isPermisoReporteCuentaBancoPunVen = isPermisoReporteCuentaBancoPunVen;
	}
	
	public Boolean getIsPermisoPaginacionMedioCuentaBancoPunVen() {
		return isPermisoPaginacionMedioCuentaBancoPunVen;
	}

	public void setIsPermisoPaginacionMedioCuentaBancoPunVen(Boolean isPermisoPaginacionMedioCuentaBancoPunVen) {
		this.isPermisoPaginacionMedioCuentaBancoPunVen = isPermisoPaginacionMedioCuentaBancoPunVen;
	}
	
	public Boolean getIsPermisoPaginacionTodoCuentaBancoPunVen() {
		return isPermisoPaginacionTodoCuentaBancoPunVen;
	}

	public void setIsPermisoPaginacionTodoCuentaBancoPunVen(Boolean isPermisoPaginacionTodoCuentaBancoPunVen) {
		this.isPermisoPaginacionTodoCuentaBancoPunVen = isPermisoPaginacionTodoCuentaBancoPunVen;
	}
	
	public Boolean getIsPermisoPaginacionAltoCuentaBancoPunVen() {
		return isPermisoPaginacionAltoCuentaBancoPunVen;
	}

	public void setIsPermisoPaginacionAltoCuentaBancoPunVen(Boolean isPermisoPaginacionAltoCuentaBancoPunVen) {
		this.isPermisoPaginacionAltoCuentaBancoPunVen = isPermisoPaginacionAltoCuentaBancoPunVen;
	}
	
	public Boolean getIsPermisoCopiarCuentaBancoPunVen() {
		return isPermisoCopiarCuentaBancoPunVen;
	}

	public void setIsPermisoCopiarCuentaBancoPunVen(Boolean isPermisoCopiarCuentaBancoPunVen) {
		this.isPermisoCopiarCuentaBancoPunVen = isPermisoCopiarCuentaBancoPunVen;
	}
	
	public Boolean getIsPermisoVerFormCuentaBancoPunVen() {
		return isPermisoVerFormCuentaBancoPunVen;
	}

	public void setIsPermisoVerFormCuentaBancoPunVen(Boolean isPermisoVerFormCuentaBancoPunVen) {
		this.isPermisoVerFormCuentaBancoPunVen = isPermisoVerFormCuentaBancoPunVen;
	}
	
	public Boolean getIsPermisoDuplicarCuentaBancoPunVen() {
		return isPermisoDuplicarCuentaBancoPunVen;
	}

	public void setIsPermisoDuplicarCuentaBancoPunVen(Boolean isPermisoDuplicarCuentaBancoPunVen) {
		this.isPermisoDuplicarCuentaBancoPunVen = isPermisoDuplicarCuentaBancoPunVen;
	}
	
	public Boolean getIsPermisoOrdenCuentaBancoPunVen() {
		return isPermisoOrdenCuentaBancoPunVen;
	}

	public void setIsPermisoOrdenCuentaBancoPunVen(Boolean isPermisoOrdenCuentaBancoPunVen) {
		this.isPermisoOrdenCuentaBancoPunVen = isPermisoOrdenCuentaBancoPunVen;
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
	
	public Boolean getIsVisibilidadCeldaNuevoCuentaBancoPunVen() {
		return isVisibilidadCeldaNuevoCuentaBancoPunVen;
	}

	public void setIsVisibilidadCeldaNuevoCuentaBancoPunVen(Boolean isVisibilidadCeldaNuevoCuentaBancoPunVen) {
		this.isVisibilidadCeldaNuevoCuentaBancoPunVen = isVisibilidadCeldaNuevoCuentaBancoPunVen;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarCuentaBancoPunVen() {
		return isVisibilidadCeldaDuplicarCuentaBancoPunVen;
	}

	public void setIsVisibilidadCeldaDuplicarCuentaBancoPunVen(Boolean isVisibilidadCeldaDuplicarCuentaBancoPunVen) {
		this.isVisibilidadCeldaDuplicarCuentaBancoPunVen = isVisibilidadCeldaDuplicarCuentaBancoPunVen;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarCuentaBancoPunVen() {
		return isVisibilidadCeldaCopiarCuentaBancoPunVen;
	}

	public void setIsVisibilidadCeldaCopiarCuentaBancoPunVen(Boolean isVisibilidadCeldaCopiarCuentaBancoPunVen) {
		this.isVisibilidadCeldaCopiarCuentaBancoPunVen = isVisibilidadCeldaCopiarCuentaBancoPunVen;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormCuentaBancoPunVen() {
		return isVisibilidadCeldaVerFormCuentaBancoPunVen;
	}

	public void setIsVisibilidadCeldaVerFormCuentaBancoPunVen(Boolean isVisibilidadCeldaVerFormCuentaBancoPunVen) {
		this.isVisibilidadCeldaVerFormCuentaBancoPunVen = isVisibilidadCeldaVerFormCuentaBancoPunVen;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenCuentaBancoPunVen() {
		return isVisibilidadCeldaOrdenCuentaBancoPunVen;
	}

	public void setIsVisibilidadCeldaOrdenCuentaBancoPunVen(Boolean isVisibilidadCeldaOrdenCuentaBancoPunVen) {
		this.isVisibilidadCeldaOrdenCuentaBancoPunVen = isVisibilidadCeldaOrdenCuentaBancoPunVen;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesCuentaBancoPunVen() {
		return isVisibilidadCeldaNuevoRelacionesCuentaBancoPunVen;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesCuentaBancoPunVen(Boolean isVisibilidadCeldaNuevoRelacionesCuentaBancoPunVen) {
		this.isVisibilidadCeldaNuevoRelacionesCuentaBancoPunVen = isVisibilidadCeldaNuevoRelacionesCuentaBancoPunVen;
	}
	
	public Boolean getIsVisibilidadCeldaModificarCuentaBancoPunVen() {
		return isVisibilidadCeldaModificarCuentaBancoPunVen;
	}

	public void setIsVisibilidadCeldaModificarCuentaBancoPunVen(Boolean isVisibilidadCeldaModificarCuentaBancoPunVen) {
		this.isVisibilidadCeldaModificarCuentaBancoPunVen = isVisibilidadCeldaModificarCuentaBancoPunVen;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarCuentaBancoPunVen() {
		return isVisibilidadCeldaActualizarCuentaBancoPunVen;
	}

	public void setIsVisibilidadCeldaActualizarCuentaBancoPunVen(Boolean isVisibilidadCeldaActualizarCuentaBancoPunVen) {
		this.isVisibilidadCeldaActualizarCuentaBancoPunVen = isVisibilidadCeldaActualizarCuentaBancoPunVen;
	}

	public Boolean getIsVisibilidadCeldaEliminarCuentaBancoPunVen() {
		return isVisibilidadCeldaEliminarCuentaBancoPunVen;
	}

	public void setIsVisibilidadCeldaEliminarCuentaBancoPunVen(Boolean isVisibilidadCeldaEliminarCuentaBancoPunVen) {
		this.isVisibilidadCeldaEliminarCuentaBancoPunVen = isVisibilidadCeldaEliminarCuentaBancoPunVen;
	}

	public Boolean getIsVisibilidadCeldaCancelarCuentaBancoPunVen() {
		return isVisibilidadCeldaCancelarCuentaBancoPunVen;
	}

	public void setIsVisibilidadCeldaCancelarCuentaBancoPunVen(Boolean isVisibilidadCeldaCancelarCuentaBancoPunVen) {
		this.isVisibilidadCeldaCancelarCuentaBancoPunVen = isVisibilidadCeldaCancelarCuentaBancoPunVen;
	}

	public Boolean getIsVisibilidadCeldaGuardarCuentaBancoPunVen() {
		return isVisibilidadCeldaGuardarCuentaBancoPunVen;
	}

	public void setIsVisibilidadCeldaGuardarCuentaBancoPunVen(Boolean isVisibilidadCeldaGuardarCuentaBancoPunVen) {
		this.isVisibilidadCeldaGuardarCuentaBancoPunVen = isVisibilidadCeldaGuardarCuentaBancoPunVen;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosCuentaBancoPunVen() {
		return isVisibilidadCeldaGuardarCambiosCuentaBancoPunVen;
	}

	public void setIsVisibilidadCeldaGuardarCambiosCuentaBancoPunVen(Boolean isVisibilidadCeldaGuardarCambiosCuentaBancoPunVen) {
		this.isVisibilidadCeldaGuardarCambiosCuentaBancoPunVen = isVisibilidadCeldaGuardarCambiosCuentaBancoPunVen;
	}
		
	public CuentaBancoPunVenSessionBean getcuentabancopunvenSessionBean() {
		return this.cuentabancopunvenSessionBean;
	}
	
	public void setcuentabancopunvenSessionBean(CuentaBancoPunVenSessionBean cuentabancopunvenSessionBean) {
		this.cuentabancopunvenSessionBean=cuentabancopunvenSessionBean;
	}
	
	
	public Boolean getisVisibilidadFK_IdBanco() {
		return this.isVisibilidadFK_IdBanco;
	}

	public void setisVisibilidadFK_IdBanco(Boolean isVisibilidadFK_IdBanco) {
		this.isVisibilidadFK_IdBanco=isVisibilidadFK_IdBanco;
	}

	public Boolean getisVisibilidadFK_IdCliente() {
		return this.isVisibilidadFK_IdCliente;
	}

	public void setisVisibilidadFK_IdCliente(Boolean isVisibilidadFK_IdCliente) {
		this.isVisibilidadFK_IdCliente=isVisibilidadFK_IdCliente;
	}

	public Boolean getisVisibilidadFK_IdCuentaContable() {
		return this.isVisibilidadFK_IdCuentaContable;
	}

	public void setisVisibilidadFK_IdCuentaContable(Boolean isVisibilidadFK_IdCuentaContable) {
		this.isVisibilidadFK_IdCuentaContable=isVisibilidadFK_IdCuentaContable;
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

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysCuentaBancoPunVen(CuentaBancoPunVen cuentabancopunven)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(cuentabancopunven,null);
				this.setActualParaGuardarSucursalForeignKey(cuentabancopunven,null);
				this.setActualParaGuardarBancoForeignKey(cuentabancopunven,null);
				this.setActualParaGuardarClienteForeignKey(cuentabancopunven,null);
				this.setActualParaGuardarCuentaContableForeignKey(cuentabancopunven,null);
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
	
	public void bugActualizarReferenciaActual(CuentaBancoPunVen cuentabancopunven,CuentaBancoPunVen cuentabancopunvenAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalCuentaBancoPunVen(cuentabancopunven);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		cuentabancopunvenAux.setId(cuentabancopunven.getId());
		cuentabancopunvenAux.setVersionRow(cuentabancopunven.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessCuentaBancoPunVen();
		
			int intSelectedRow = this.jTableDatosCuentaBancoPunVen.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuentabancopunven =(CuentaBancoPunVen) this.cuentabancopunvenLogic.getCuentaBancoPunVens().toArray()[this.jTableDatosCuentaBancoPunVen.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.cuentabancopunven =(CuentaBancoPunVen) this.cuentabancopunvens.toArray()[this.jTableDatosCuentaBancoPunVen.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(CuentaBancoPunVenJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualCuentaBancoPunVen(this.cuentabancopunven,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysCuentaBancoPunVen(this.cuentabancopunven);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = cuentabancopunvenValidator.getInvalidValues(this.cuentabancopunven);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			cuentabancopunvenLogic.setDatosCliente(datosCliente);
			cuentabancopunvenLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				cuentabancopunvenAux=new  CuentaBancoPunVen();
				
				cuentabancopunvenAux.setIsNew(true);
				cuentabancopunvenAux.setIsChanged(true);
				
				cuentabancopunvenAux.setCuentaBancoPunVenOriginal(this.cuentabancopunven);
				
				cuentabancopunvenAux.setId(this.cuentabancopunven.getId());	
				cuentabancopunvenAux.setVersionRow(this.cuentabancopunven.getVersionRow());	
				cuentabancopunvenAux.setid_empresa(this.cuentabancopunven.getid_empresa());	
				cuentabancopunvenAux.setid_sucursal(this.cuentabancopunven.getid_sucursal());	
				cuentabancopunvenAux.setid_banco(this.cuentabancopunven.getid_banco());	
				cuentabancopunvenAux.setid_cliente(this.cuentabancopunven.getid_cliente());	
				cuentabancopunvenAux.setid_cuenta_contable(this.cuentabancopunven.getid_cuenta_contable());	
				cuentabancopunvenAux.setcodigo(this.cuentabancopunven.getcodigo());	
				cuentabancopunvenAux.setnombre(this.cuentabancopunven.getnombre());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.cuentabancopunvenSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.cuentabancopunvenSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(cuentabancopunvenAux,cuentabancopunvenLogic.getCuentaBancoPunVens());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(cuentabancopunvenAux,cuentabancopunvens);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.cuentabancopunvenSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.cuentabancopunvenSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						cuentabancopunvenLogic.saveCuentaBancoPunVens();//WithConnection
						//cuentabancopunvenLogic.getSetVersionRowCuentaBancoPunVens();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.cuentabancopunven,cuentabancopunvenAux);
					
					this.refrescarForeignKeysDescripcionesCuentaBancoPunVen();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.cuentabancopunvenSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormCuentaBancoPunVen.formapagopuntoventaBeanSwingJInternalFrame.formapagopuntoventaLogic.getFormaPagoPuntoVentas().addAll(this.jInternalFrameDetalleFormCuentaBancoPunVen.formapagopuntoventaBeanSwingJInternalFrame.formapagopuntoventasEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormCuentaBancoPunVen.formapagopuntoventaBeanSwingJInternalFrame.formapagopuntoventas.addAll(this.jInternalFrameDetalleFormCuentaBancoPunVen.formapagopuntoventaBeanSwingJInternalFrame.formapagopuntoventasEliminados);
						}
						//ARCHITECTURE	
						
						if(!this.cuentabancopunvenSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormCuentaBancoPunVen.formapagopuntoventaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormCuentaBancoPunVen.formapagopuntoventaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormCuentaBancoPunVen.formapagopuntoventaBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormCuentaBancoPunVen.formapagopuntoventaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormCuentaBancoPunVen.formapagopuntoventaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormCuentaBancoPunVen.formapagopuntoventaBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								cuentabancopunvenLogic.saveCuentaBancoPunVenRelaciones(cuentabancopunvenAux,this.jInternalFrameDetalleFormCuentaBancoPunVen.formapagopuntoventaBeanSwingJInternalFrame.formapagopuntoventaLogic.getFormaPagoPuntoVentas());//WithConnection
								//cuentabancopunvenLogic.getSetVersionRowCuentaBancoPunVens();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.cuentabancopunven,cuentabancopunvenAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormCuentaBancoPunVen.formapagopuntoventaBeanSwingJInternalFrame.formapagopuntoventaLogic.setFormaPagoPuntoVentas(new ArrayList<FormaPagoPuntoVenta>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormCuentaBancoPunVen.formapagopuntoventaBeanSwingJInternalFrame.formapagopuntoventas= new ArrayList<FormaPagoPuntoVenta>();
							}
							//ARCHITECTURE	
						} else {
							
							

							if(this.jInternalFrameDetalleFormCuentaBancoPunVen.formapagopuntoventaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormCuentaBancoPunVen.formapagopuntoventaBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormCuentaBancoPunVen.formapagopuntoventaBeanSwingJInternalFrame.quitarFilaTotales();}
							cuentabancopunvenAux.setFormaPagoPuntoVentas(this.jInternalFrameDetalleFormCuentaBancoPunVen.formapagopuntoventaBeanSwingJInternalFrame.formapagopuntoventaLogic.getFormaPagoPuntoVentas());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.cuentabancopunvenSessionBean.getEstaModoGuardarRelaciones() 
									|| this.cuentabancopunvenSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(cuentabancopunvenAux,cuentabancopunvenLogic.getCuentaBancoPunVens());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(cuentabancopunvenAux,cuentabancopunvens);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.cuentabancopunven,cuentabancopunvenAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				cuentabancopunvenAux=new  CuentaBancoPunVen();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.cuentabancopunvenSessionBean.getEsGuardarRelacionado() 
					|| (this.cuentabancopunvenSessionBean.getEsGuardarRelacionado() && this.cuentabancopunven.getId()>=0)) {
						
					cuentabancopunvenAux.setIsNew(false);
				}
				
				cuentabancopunvenAux.setIsDeleted(false);
			
				cuentabancopunvenAux.setId(this.cuentabancopunven.getId());	
				cuentabancopunvenAux.setVersionRow(this.cuentabancopunven.getVersionRow());	
				cuentabancopunvenAux.setid_empresa(this.cuentabancopunven.getid_empresa());	
				cuentabancopunvenAux.setid_sucursal(this.cuentabancopunven.getid_sucursal());	
				cuentabancopunvenAux.setid_banco(this.cuentabancopunven.getid_banco());	
				cuentabancopunvenAux.setid_cliente(this.cuentabancopunven.getid_cliente());	
				cuentabancopunvenAux.setid_cuenta_contable(this.cuentabancopunven.getid_cuenta_contable());	
				cuentabancopunvenAux.setcodigo(this.cuentabancopunven.getcodigo());	
				cuentabancopunvenAux.setnombre(this.cuentabancopunven.getnombre());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(cuentabancopunvenAux,cuentabancopunvenLogic.getCuentaBancoPunVens());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(cuentabancopunvenAux,cuentabancopunvens);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.cuentabancopunvenSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.cuentabancopunvenSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						cuentabancopunvenLogic.saveCuentaBancoPunVens();//WithConnection
						//cuentabancopunvenLogic.getSetVersionRowCuentaBancoPunVens();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.cuentabancopunven,cuentabancopunvenAux);
					
					this.refrescarForeignKeysDescripcionesCuentaBancoPunVen();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.cuentabancopunvenSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormCuentaBancoPunVen.formapagopuntoventaBeanSwingJInternalFrame.formapagopuntoventaLogic.getFormaPagoPuntoVentas().addAll(this.jInternalFrameDetalleFormCuentaBancoPunVen.formapagopuntoventaBeanSwingJInternalFrame.formapagopuntoventasEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormCuentaBancoPunVen.formapagopuntoventaBeanSwingJInternalFrame.formapagopuntoventas.addAll(this.jInternalFrameDetalleFormCuentaBancoPunVen.formapagopuntoventaBeanSwingJInternalFrame.formapagopuntoventasEliminados);
						}
						//ARCHITECTURE
						
						if(!this.cuentabancopunvenSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormCuentaBancoPunVen.formapagopuntoventaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormCuentaBancoPunVen.formapagopuntoventaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormCuentaBancoPunVen.formapagopuntoventaBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormCuentaBancoPunVen.formapagopuntoventaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormCuentaBancoPunVen.formapagopuntoventaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormCuentaBancoPunVen.formapagopuntoventaBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								cuentabancopunvenLogic.saveCuentaBancoPunVenRelaciones(cuentabancopunvenAux,this.jInternalFrameDetalleFormCuentaBancoPunVen.formapagopuntoventaBeanSwingJInternalFrame.formapagopuntoventaLogic.getFormaPagoPuntoVentas());//WithConnection
								//cuentabancopunvenLogic.getSetVersionRowCuentaBancoPunVens();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.cuentabancopunven,cuentabancopunvenAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormCuentaBancoPunVen.formapagopuntoventaBeanSwingJInternalFrame.formapagopuntoventaLogic.setFormaPagoPuntoVentas(new ArrayList<FormaPagoPuntoVenta>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormCuentaBancoPunVen.formapagopuntoventaBeanSwingJInternalFrame.formapagopuntoventas= new ArrayList<FormaPagoPuntoVenta>();
							}
							//ARCHITECTURE
						} else {
							
							

							if(this.jInternalFrameDetalleFormCuentaBancoPunVen.formapagopuntoventaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormCuentaBancoPunVen.formapagopuntoventaBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormCuentaBancoPunVen.formapagopuntoventaBeanSwingJInternalFrame.quitarFilaTotales();}
							cuentabancopunvenAux.setFormaPagoPuntoVentas(this.jInternalFrameDetalleFormCuentaBancoPunVen.formapagopuntoventaBeanSwingJInternalFrame.formapagopuntoventaLogic.getFormaPagoPuntoVentas());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.cuentabancopunvenSessionBean.getEstaModoGuardarRelaciones() 
									|| this.cuentabancopunvenSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(cuentabancopunvenAux,cuentabancopunvenLogic.getCuentaBancoPunVens());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(cuentabancopunvenAux,cuentabancopunvens);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.cuentabancopunven,cuentabancopunvenAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				cuentabancopunvenAux=new  CuentaBancoPunVen();
				
				cuentabancopunvenAux.setIsNew(false);
				cuentabancopunvenAux.setIsChanged(false);
				
				cuentabancopunvenAux.setIsDeleted(true);
				
				cuentabancopunvenAux.setId(this.cuentabancopunven.getId());	
				cuentabancopunvenAux.setVersionRow(this.cuentabancopunven.getVersionRow());	
				cuentabancopunvenAux.setid_empresa(this.cuentabancopunven.getid_empresa());	
				cuentabancopunvenAux.setid_sucursal(this.cuentabancopunven.getid_sucursal());	
				cuentabancopunvenAux.setid_banco(this.cuentabancopunven.getid_banco());	
				cuentabancopunvenAux.setid_cliente(this.cuentabancopunven.getid_cliente());	
				cuentabancopunvenAux.setid_cuenta_contable(this.cuentabancopunven.getid_cuenta_contable());	
				cuentabancopunvenAux.setcodigo(this.cuentabancopunven.getcodigo());	
				cuentabancopunvenAux.setnombre(this.cuentabancopunven.getnombre());	
				
				if(this.cuentabancopunvenSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.cuentabancopunvenAux.getId()>=0) {	
						this.cuentabancopunvensEliminados.add(cuentabancopunvenAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(cuentabancopunvenAux,cuentabancopunvenLogic.getCuentaBancoPunVens());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(cuentabancopunvenAux,cuentabancopunvens);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.cuentabancopunvenSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.cuentabancopunvenSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						cuentabancopunvenLogic.saveCuentaBancoPunVens();//WithConnection
						//cuentabancopunvenLogic.getSetVersionRowCuentaBancoPunVens();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.cuentabancopunvenSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormCuentaBancoPunVen.formapagopuntoventaBeanSwingJInternalFrame.formapagopuntoventaLogic.getFormaPagoPuntoVentas().addAll(this.jInternalFrameDetalleFormCuentaBancoPunVen.formapagopuntoventaBeanSwingJInternalFrame.formapagopuntoventasEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormCuentaBancoPunVen.formapagopuntoventaBeanSwingJInternalFrame.formapagopuntoventas.addAll(this.jInternalFrameDetalleFormCuentaBancoPunVen.formapagopuntoventaBeanSwingJInternalFrame.formapagopuntoventasEliminados);
						}
						//ARCHITECTURE
						
						
						if(!this.cuentabancopunvenSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormCuentaBancoPunVen.formapagopuntoventaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormCuentaBancoPunVen.formapagopuntoventaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormCuentaBancoPunVen.formapagopuntoventaBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormCuentaBancoPunVen.formapagopuntoventaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormCuentaBancoPunVen.formapagopuntoventaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormCuentaBancoPunVen.formapagopuntoventaBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								cuentabancopunvenLogic.saveCuentaBancoPunVenRelaciones(cuentabancopunvenAux,this.jInternalFrameDetalleFormCuentaBancoPunVen.formapagopuntoventaBeanSwingJInternalFrame.formapagopuntoventaLogic.getFormaPagoPuntoVentas());//WithConnection
								//cuentabancopunvenLogic.getSetVersionRowCuentaBancoPunVens();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormCuentaBancoPunVen.formapagopuntoventaBeanSwingJInternalFrame.formapagopuntoventaLogic.setFormaPagoPuntoVentas(new ArrayList<FormaPagoPuntoVenta>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormCuentaBancoPunVen.formapagopuntoventaBeanSwingJInternalFrame.formapagopuntoventas= new ArrayList<FormaPagoPuntoVenta>();
							}
							//ARCHITECTURE
						}
					}  else {
							
						

							if(this.jInternalFrameDetalleFormCuentaBancoPunVen.formapagopuntoventaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormCuentaBancoPunVen.formapagopuntoventaBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormCuentaBancoPunVen.formapagopuntoventaBeanSwingJInternalFrame.quitarFilaTotales();}
							cuentabancopunvenAux.setFormaPagoPuntoVentas(this.jInternalFrameDetalleFormCuentaBancoPunVen.formapagopuntoventaBeanSwingJInternalFrame.formapagopuntoventaLogic.getFormaPagoPuntoVentas());
								
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							if(this.cuentabancopunvenSessionBean.getEstaModoGuardarRelaciones() 
								|| this.cuentabancopunvenSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(cuentabancopunvenAux,cuentabancopunvenLogic.getCuentaBancoPunVens());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(cuentabancopunvenAux,cuentabancopunvens);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuentabancopunvenLogic.getCuentaBancoPunVens().addAll(this.cuentabancopunvensEliminados);
					
					cuentabancopunvenLogic.saveCuentaBancoPunVens();//WithConnection
					//cuentabancopunvenLogic.getSetVersionRowCuentaBancoPunVens();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesCuentaBancoPunVen();
				
				this.cuentabancopunvensEliminados= new ArrayList<CuentaBancoPunVen>();		
			}
			
			if(this.cuentabancopunvenSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cuentabancopunvenSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Cuenta Banco GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Cuenta Banco",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.cuentabancopunven=cuentabancopunvenAux;
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
      		//this.finishProcessCuentaBancoPunVen();
      	}
		
	}	
	
	public void actualizarRelaciones(CuentaBancoPunVen cuentabancopunvenLocal) throws Exception {
		
		if(this.cuentabancopunvenSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
				cuentabancopunvenLocal.setFormaPagoPuntoVentas(this.jInternalFrameDetalleFormCuentaBancoPunVen.formapagopuntoventaBeanSwingJInternalFrame.formapagopuntoventaLogic.getFormaPagoPuntoVentas());
			
			} else {
			
				cuentabancopunvenLocal.setFormaPagoPuntoVentas(this.jInternalFrameDetalleFormCuentaBancoPunVen.formapagopuntoventaBeanSwingJInternalFrame.formapagopuntoventas);	
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(CuentaBancoPunVen cuentabancopunvenLocal) throws Exception {	
		if(this.cuentabancopunvenSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				cuentabancopunvenLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(SucursalDetalleFormJInternalFrame.class)) {
				SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrameLocal=(SucursalBeanSwingJInternalFrame) ((SucursalDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				sucursalBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoSucursal(sucursalBeanSwingJInternalFrameLocal.getsucursal(),true);
				sucursalBeanSwingJInternalFrameLocal.actualizarLista(sucursalBeanSwingJInternalFrameLocal.sucursal,this.sucursalsForeignKey);

				sucursalBeanSwingJInternalFrameLocal.actualizarRelaciones(sucursalBeanSwingJInternalFrameLocal.sucursal);

				cuentabancopunvenLocal.setSucursal(sucursalBeanSwingJInternalFrameLocal.sucursal);

				this.addItemDefectoCombosForeignKeySucursal();
				this.cargarCombosFrameSucursalsForeignKey("Formulario");
				this.setActualSucursalForeignKey(sucursalBeanSwingJInternalFrameLocal.sucursal.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(BancoDetalleFormJInternalFrame.class)) {
				BancoBeanSwingJInternalFrame bancoBeanSwingJInternalFrameLocal=(BancoBeanSwingJInternalFrame) ((BancoDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				bancoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoBanco(bancoBeanSwingJInternalFrameLocal.getbanco(),true);
				bancoBeanSwingJInternalFrameLocal.actualizarLista(bancoBeanSwingJInternalFrameLocal.banco,this.bancosForeignKey);

				bancoBeanSwingJInternalFrameLocal.actualizarRelaciones(bancoBeanSwingJInternalFrameLocal.banco);

				cuentabancopunvenLocal.setBanco(bancoBeanSwingJInternalFrameLocal.banco);

				this.addItemDefectoCombosForeignKeyBanco();
				this.cargarCombosFrameBancosForeignKey("Formulario");
				this.setActualBancoForeignKey(bancoBeanSwingJInternalFrameLocal.banco.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(ClienteDetalleFormJInternalFrame.class)) {
				ClienteBeanSwingJInternalFrame clienteBeanSwingJInternalFrameLocal=(ClienteBeanSwingJInternalFrame) ((ClienteDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				clienteBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoCliente(clienteBeanSwingJInternalFrameLocal.getcliente(),true);
				clienteBeanSwingJInternalFrameLocal.actualizarLista(clienteBeanSwingJInternalFrameLocal.cliente,this.clientesForeignKey);

				clienteBeanSwingJInternalFrameLocal.actualizarRelaciones(clienteBeanSwingJInternalFrameLocal.cliente);

				cuentabancopunvenLocal.setCliente(clienteBeanSwingJInternalFrameLocal.cliente);

				this.addItemDefectoCombosForeignKeyCliente();
				this.cargarCombosFrameClientesForeignKey("Formulario");
				this.setActualClienteForeignKey(clienteBeanSwingJInternalFrameLocal.cliente.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(CuentaContableDetalleFormJInternalFrame.class)) {
				CuentaContableBeanSwingJInternalFrame cuentacontableBeanSwingJInternalFrameLocal=(CuentaContableBeanSwingJInternalFrame) ((CuentaContableDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				cuentacontableBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoCuentaContable(cuentacontableBeanSwingJInternalFrameLocal.getcuentacontable(),true);
				cuentacontableBeanSwingJInternalFrameLocal.actualizarLista(cuentacontableBeanSwingJInternalFrameLocal.cuentacontable,this.cuentacontablesForeignKey);

				cuentacontableBeanSwingJInternalFrameLocal.actualizarRelaciones(cuentacontableBeanSwingJInternalFrameLocal.cuentacontable);

				cuentabancopunvenLocal.setCuentaContable(cuentacontableBeanSwingJInternalFrameLocal.cuentacontable);

				this.addItemDefectoCombosForeignKeyCuentaContable();
				this.cargarCombosFrameCuentaContablesForeignKey("Formulario");
				this.setActualCuentaContableForeignKey(cuentacontableBeanSwingJInternalFrameLocal.cuentacontable.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarCuentaBancoPunVenActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosCuentaBancoPunVen.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.cuentabancopunven =(CuentaBancoPunVen) this.cuentabancopunvenLogic.getCuentaBancoPunVens().toArray()[this.jTableDatosCuentaBancoPunVen.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.cuentabancopunven =(CuentaBancoPunVen) this.cuentabancopunvens.toArray()[this.jTableDatosCuentaBancoPunVen.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = cuentabancopunvenValidator.getInvalidValues(this.cuentabancopunven);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(CuentaBancoPunVen cuentabancopunven,List<CuentaBancoPunVen> cuentabancopunvens) throws Exception {
		try	{		
			CuentaBancoPunVenConstantesFunciones.actualizarLista(cuentabancopunven,cuentabancopunvens,this.cuentabancopunvenSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(CuentaBancoPunVen cuentabancopunven,List<CuentaBancoPunVen> cuentabancopunvens) throws Exception {
		try	{			
			CuentaBancoPunVenConstantesFunciones.actualizarSelectedLista(cuentabancopunven,cuentabancopunvens);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<CuentaBancoPunVen> cuentabancopunvensLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				cuentabancopunvensLocal=this.cuentabancopunvenLogic.getCuentaBancoPunVens();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				cuentabancopunvensLocal=this.cuentabancopunvens;
			}
			//ARCHITECTURE
		
			for(CuentaBancoPunVen cuentabancopunvenLocal:cuentabancopunvensLocal) {
				if(this.permiteMantenimiento(cuentabancopunvenLocal) && cuentabancopunvenLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+CuentaBancoPunVenConstantesFunciones.getCuentaBancoPunVenLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(CuentaBancoPunVenConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCuentaBancoPunVen.jLabelid_empresaCuentaBancoPunVen,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CuentaBancoPunVenConstantesFunciones.IDSUCURSAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCuentaBancoPunVen.jLabelid_sucursalCuentaBancoPunVen,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CuentaBancoPunVenConstantesFunciones.IDBANCO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCuentaBancoPunVen.jLabelid_bancoCuentaBancoPunVen,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CuentaBancoPunVenConstantesFunciones.IDCLIENTE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCuentaBancoPunVen.jLabelid_clienteCuentaBancoPunVen,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CuentaBancoPunVenConstantesFunciones.IDCUENTACONTABLE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCuentaBancoPunVen.jLabelid_cuenta_contableCuentaBancoPunVen,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CuentaBancoPunVenConstantesFunciones.CODIGO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCuentaBancoPunVen.jLabelcodigoCuentaBancoPunVen,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CuentaBancoPunVenConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCuentaBancoPunVen.jLabelnombreCuentaBancoPunVen,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormCuentaBancoPunVen!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCuentaBancoPunVen.jLabelid_empresaCuentaBancoPunVen,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCuentaBancoPunVen.jLabelid_sucursalCuentaBancoPunVen,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCuentaBancoPunVen.jLabelid_bancoCuentaBancoPunVen,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCuentaBancoPunVen.jLabelid_clienteCuentaBancoPunVen,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCuentaBancoPunVen.jLabelid_cuenta_contableCuentaBancoPunVen,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCuentaBancoPunVen.jLabelcodigoCuentaBancoPunVen,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCuentaBancoPunVen.jLabelnombreCuentaBancoPunVen,"");
		
		}
	}
	
	
	
	public void actualizarObjetoPadreFk(String sTipo)  throws Exception {
		if(sTipo.equals("XXXAuxiliar")) {
		
		}
		
		 else  if(sTipo.equals("FormaPagoPuntoVenta")) {
			if(this.cuentabancopunven==null) {
				this.cuentabancopunven= new CuentaBancoPunVen();
			}

			if(this.cuentabancopunvenSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoCuentaBancoPunVen
				this.setVariablesFormularioToObjetoActualCuentaBancoPunVen(this.cuentabancopunven,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysCuentaBancoPunVen(this.cuentabancopunven);

				this.jInternalFrameDetalleFormCuentaBancoPunVen.formapagopuntoventaBeanSwingJInternalFrame.getformapagopuntoventa().setCuentaBancoPunVen(this.cuentabancopunven);
			}

			return;
		}
	}
	
	public void nuevoPreparar() throws Exception {
		this.nuevoPreparar(false);
	}
	
	public void nuevoPreparar(Boolean esNuevoGuardarCambios) throws Exception {
		this.iIdNuevoCuentaBancoPunVen--;	
		
		
		this.cuentabancopunvenAux=new CuentaBancoPunVen();
		
		this.cuentabancopunvenAux.setId(this.iIdNuevoCuentaBancoPunVen);
		this.cuentabancopunvenAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.cuentabancopunvenLogic.getCuentaBancoPunVens().add(this.cuentabancopunvenAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.cuentabancopunvens.add(this.cuentabancopunvenAux);
		}
		//ARCHITECTURE
		
		this.cuentabancopunven=this.cuentabancopunvenAux;
		
		if(CuentaBancoPunVenJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioCuentaBancoPunVen(this.cuentabancopunven);
			this.setVariablesObjetoActualToFormularioForeignKeyCuentaBancoPunVen(this.cuentabancopunven);
		}
				
		//this.setDefaultControlesCuentaBancoPunVen();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyCuentaBancoPunVen();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyCuentaBancoPunVen();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyCuentaBancoPunVen();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualCuentaBancoPunVen(this.cuentabancopunvenBean,this.cuentabancopunven,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysCuentaBancoPunVen(this.cuentabancopunven);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(CuentaBancoPunVenConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.cuentabancopunvenSessionBean.getConGuardarRelaciones()) {
			classes=CuentaBancoPunVenConstantesFunciones.getClassesRelationshipsOfCuentaBancoPunVen(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.cuentabancopunvenReturnGeneral=cuentabancopunvenLogic.procesarEventosCuentaBancoPunVensWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.cuentabancopunvenLogic.getCuentaBancoPunVens(),this.cuentabancopunven,this.cuentabancopunvenParameterGeneral,this.isEsNuevoCuentaBancoPunVen,classes);//this.cuentabancopunvenLogic.getCuentaBancoPunVen()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanCuentaBancoPunVen(this.cuentabancopunvenReturnGeneral,this.cuentabancopunvenBean,false);
		
		if(this.cuentabancopunvenReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyCuentaBancoPunVen(this.cuentabancopunvenReturnGeneral.getCuentaBancoPunVen());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioCuentaBancoPunVen(this.cuentabancopunvenReturnGeneral.getCuentaBancoPunVen());
		}
		
		if(this.cuentabancopunvenReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioCuentaBancoPunVen(this.cuentabancopunvenReturnGeneral.getCuentaBancoPunVen(),classes);//this.cuentabancopunvenBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualCuentaBancoPunVen(this.cuentabancopunven,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyCuentaBancoPunVen();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyCuentaBancoPunVen();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			CuentaBancoPunVenBeanSwingJInternalFrameAdditional.RecargarFormCuentaBancoPunVen(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingCuentaBancoPunVen(false);
						
			if(cuentabancopunvenSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
				

				if(this.jInternalFrameDetalleFormCuentaBancoPunVen.formapagopuntoventaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormCuentaBancoPunVen.formapagopuntoventaBeanSwingJInternalFrame.formapagopuntoventaSessionBean.getEsGuardarRelacionado() && FormaPagoPuntoVentaJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonFormaPagoPuntoVentaActionPerformed(null,-1,false,true,null);
				}				
			}
				
			//SI ES MANUAL
			if(CuentaBancoPunVenJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualCuentaBancoPunVen();
			}
			
			this.actualizarVisualTableDatosCuentaBancoPunVen();
			
			this.jTableDatosCuentaBancoPunVen.setRowSelectionInterval(this.getIndiceNuevoCuentaBancoPunVen(), this.getIndiceNuevoCuentaBancoPunVen());
			
			this.seleccionarFilaTablaCuentaBancoPunVenActual();
						
			this.actualizarEstadoCeldasBotonesCuentaBancoPunVen("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesCuentaBancoPunVen(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormCuentaBancoPunVen.jTextFieldcodigoCuentaBancoPunVen.setEnabled(isHabilitar && this.cuentabancopunvenConstantesFunciones.activarcodigoCuentaBancoPunVen);
		this.jInternalFrameDetalleFormCuentaBancoPunVen.jTextAreanombreCuentaBancoPunVen.setEnabled(isHabilitar && this.cuentabancopunvenConstantesFunciones.activarnombreCuentaBancoPunVen);	
		//
		this.jInternalFrameDetalleFormCuentaBancoPunVen.jComboBoxid_empresaCuentaBancoPunVen.setEnabled(isHabilitar && this.cuentabancopunvenConstantesFunciones.activarid_empresaCuentaBancoPunVen);//
		this.jInternalFrameDetalleFormCuentaBancoPunVen.jComboBoxid_sucursalCuentaBancoPunVen.setEnabled(isHabilitar && this.cuentabancopunvenConstantesFunciones.activarid_sucursalCuentaBancoPunVen);
		this.jInternalFrameDetalleFormCuentaBancoPunVen.jComboBoxid_bancoCuentaBancoPunVen.setEnabled(isHabilitar && this.cuentabancopunvenConstantesFunciones.activarid_bancoCuentaBancoPunVen);
		this.jInternalFrameDetalleFormCuentaBancoPunVen.jComboBoxid_clienteCuentaBancoPunVen.setEnabled(isHabilitar && this.cuentabancopunvenConstantesFunciones.activarid_clienteCuentaBancoPunVen);
		this.jInternalFrameDetalleFormCuentaBancoPunVen.jComboBoxid_cuenta_contableCuentaBancoPunVen.setEnabled(isHabilitar && this.cuentabancopunvenConstantesFunciones.activarid_cuenta_contableCuentaBancoPunVen);
	};
	
	public void setDefaultControlesCuentaBancoPunVen() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoCuentaBancoPunVen(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.cuentabancopunvenSessionBean.setConGuardarRelaciones(true);			
			this.cuentabancopunvenSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormCuentaBancoPunVen.jTabbedPaneRelacionesCuentaBancoPunVen.setVisible(true);
			
			

			if(this.jInternalFrameDetalleFormCuentaBancoPunVen.formapagopuntoventaBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormCuentaBancoPunVen.formapagopuntoventaBeanSwingJInternalFrame.formapagopuntoventaSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormCuentaBancoPunVen.formapagopuntoventaBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}		
		} else {
			//this.cuentabancopunvenSessionBean.setConGuardarRelaciones(false);			
			this.cuentabancopunvenSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormCuentaBancoPunVen.jTabbedPaneRelacionesCuentaBancoPunVen.setVisible(false);
			
			

			if(this.jInternalFrameDetalleFormCuentaBancoPunVen.formapagopuntoventaBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormCuentaBancoPunVen.formapagopuntoventaBeanSwingJInternalFrame.formapagopuntoventaSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormCuentaBancoPunVen.formapagopuntoventaBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}
		}
	};
	
	public int getIndiceNuevoCuentaBancoPunVen() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(CuentaBancoPunVen cuentabancopunvenAux:this.cuentabancopunvenLogic.getCuentaBancoPunVens()) {
				if(cuentabancopunvenAux.getId().equals(this.iIdNuevoCuentaBancoPunVen)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(CuentaBancoPunVen cuentabancopunvenAux:this.cuentabancopunvens) {
				if(cuentabancopunvenAux.getId().equals(this.iIdNuevoCuentaBancoPunVen)) {
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
	
	public int getIndiceActualCuentaBancoPunVen(CuentaBancoPunVen cuentabancopunven,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(CuentaBancoPunVen cuentabancopunvenAux:this.cuentabancopunvenLogic.getCuentaBancoPunVens()) {
				if(cuentabancopunvenAux.getId().equals(cuentabancopunven.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(CuentaBancoPunVen cuentabancopunvenAux:this.cuentabancopunvens) {
				if(cuentabancopunvenAux.getId().equals(cuentabancopunven.getId())) {
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
	
	public void setCamposBaseDesdeOriginalCuentaBancoPunVen(CuentaBancoPunVen cuentabancopunvenOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(CuentaBancoPunVen cuentabancopunvenAux:this.cuentabancopunvenLogic.getCuentaBancoPunVens()) {
				if(cuentabancopunvenAux.getCuentaBancoPunVenOriginal().getId().equals(cuentabancopunvenOriginal.getId())) {
					existe=true;
					cuentabancopunvenOriginal.setId(cuentabancopunvenAux.getId());
					cuentabancopunvenOriginal.setVersionRow(cuentabancopunvenAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(CuentaBancoPunVen cuentabancopunvenAux:this.cuentabancopunvens) {
				if(cuentabancopunvenAux.getCuentaBancoPunVenOriginal().getId().equals(cuentabancopunvenOriginal.getId())) {
					existe=true;
					cuentabancopunvenOriginal.setId(cuentabancopunvenAux.getId());
					cuentabancopunvenOriginal.setVersionRow(cuentabancopunvenAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosCuentaBancoPunVen(Boolean esParaCancelar) throws Exception {
		cuentabancopunvensAux=new ArrayList<CuentaBancoPunVen>();
		cuentabancopunvenAux=new CuentaBancoPunVen();
		
		if(!this.cuentabancopunvenSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(CuentaBancoPunVen cuentabancopunvenAux:this.cuentabancopunvenLogic.getCuentaBancoPunVens()) {
					if(cuentabancopunvenAux.getId()<0) {
						cuentabancopunvensAux.add(cuentabancopunvenAux);
					}		
				}
				this.iIdNuevoCuentaBancoPunVen=0L;
				this.cuentabancopunvenLogic.getCuentaBancoPunVens().removeAll(cuentabancopunvensAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(CuentaBancoPunVen cuentabancopunvenAux:this.cuentabancopunvens) {
					if(cuentabancopunvenAux.getId()<0) {
						cuentabancopunvensAux.add(cuentabancopunvenAux);
					}		
				}
				this.iIdNuevoCuentaBancoPunVen=0L;
				this.cuentabancopunvens.removeAll(cuentabancopunvensAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoCuentaBancoPunVen 
					&& this.cuentabancopunvenLogic.getCuentaBancoPunVens().size()>0
					) {
					cuentabancopunvenAux=this.cuentabancopunvenLogic.getCuentaBancoPunVens().get(this.cuentabancopunvenLogic.getCuentaBancoPunVens().size() - 1);
				
					if(cuentabancopunvenAux.getId()<0) {
						this.cuentabancopunvenLogic.getCuentaBancoPunVens().remove(cuentabancopunvenAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoCuentaBancoPunVen && this.cuentabancopunvens.size()>0) {
					cuentabancopunvenAux=this.cuentabancopunvens.get(this.cuentabancopunvens.size() - 1);
				
					if(cuentabancopunvenAux.getId()<0) {
						this.cuentabancopunvens.remove(cuentabancopunvenAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoCuentaBancoPunVen(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(cuentabancopunven.getId()<0) {
				this.cuentabancopunvenLogic.getCuentaBancoPunVens().remove(this.cuentabancopunven);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(cuentabancopunven.getId()<0) {
				this.cuentabancopunvens.remove(this.cuentabancopunven);
			}
		}			
	}
	
	public void setEstadosInicialesCuentaBancoPunVen(List<CuentaBancoPunVen> cuentabancopunvensAux) throws Exception {
		CuentaBancoPunVenConstantesFunciones.setEstadosInicialesCuentaBancoPunVen(cuentabancopunvensAux);
	}
	
	public void setEstadosInicialesCuentaBancoPunVen(CuentaBancoPunVen cuentabancopunvenAux) throws Exception {
		CuentaBancoPunVenConstantesFunciones.setEstadosInicialesCuentaBancoPunVen(cuentabancopunvenAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarCuentaBancoPunVenActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesCuentaBancoPunVen("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CuentaBancoPunVenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarCuentaBancoPunVenActual()) {
				if(!this.isEsNuevoCuentaBancoPunVen) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesCuentaBancoPunVen("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoCuentaBancoPunVen=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CuentaBancoPunVenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarCuentaBancoPunVenActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Cuenta Banco ?", "MANTENIMIENTO DE Cuenta Banco", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesCuentaBancoPunVen("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CuentaBancoPunVenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CuentaBancoPunVenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(CuentaBancoPunVen cuentabancopunven) throws Exception {
		CuentaBancoPunVenConstantesFunciones.seleccionarAsignar(this.cuentabancopunven,cuentabancopunven);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarCuentaBancoPunVen=this.isPermisoActualizarOriginalCuentaBancoPunVen;
			
			
			this.seleccionarAsignar(cuentabancopunven);
			
			

			idClienteActual=cuentabancopunven.getid_cliente();
			this.seleccionarClienteActual();
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			CuentaBancoPunVenConstantesFunciones.quitarEspaciosCuentaBancoPunVen(this.cuentabancopunven,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesCuentaBancoPunVen("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CuentaBancoPunVenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.cuentabancopunvenSessionBean.setsFuncionBusquedaRapida(this.cuentabancopunvenSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CuentaBancoPunVenConstantesFunciones.CLASSNAME);
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
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoCuentaBancoPunVen) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosCuentaBancoPunVen(esParaCancelar);				
				this.cancelarNuevoCuentaBancoPunVen(esParaCancelar);								
			}
			
			this.cuentabancopunven=new CuentaBancoPunVen();
			
			this.inicializarCuentaBancoPunVen();
			
			this.actualizarEstadoCeldasBotonesCuentaBancoPunVen("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CuentaBancoPunVenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarCuentaBancoPunVen() throws Exception {
		try {
			CuentaBancoPunVenConstantesFunciones.inicializarCuentaBancoPunVen(this.cuentabancopunven);
			
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
			FuncionesSwing.manageException(this, e,logger,CuentaBancoPunVenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.cuentabancopunvenLogic.getCuentaBancoPunVens().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CuentaBancoPunVenConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteCuentaBancoPunVens(String sAccionBusqueda,List<CuentaBancoPunVen> cuentabancopunvensParaReportes) throws Exception {
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
					sPathReporteFinal="CuentaBancoPunVen"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="CuentaBancoPunVenMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("CuentaBancoPunVenMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="CuentaBancoPunVen"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Cuenta Bancoes");		
		parameters.put("busquedapor", CuentaBancoPunVenConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			parameters.put("SUBREPORT_DIR", sPathReportes);
		}
		
		parameters.put("con_grafico", this.conGraficoReporte);
		
		JasperReport jasperReport = (JasperReport)JRLoader.loadObject(reportFile);
				
		this.cargarDatosCliente();
		
		ArrayList<Classe> classes=new ArrayList<Classe>();		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			
			classes.add(new Classe(FormaPagoPuntoVenta.class));
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {		
				try	{
					
					CuentaBancoPunVenLogic cuentabancopunvenLogicAuxiliar=new CuentaBancoPunVenLogic();
					cuentabancopunvenLogicAuxiliar.setDatosCliente(cuentabancopunvenLogic.getDatosCliente());				
					cuentabancopunvenLogicAuxiliar.setCuentaBancoPunVens(cuentabancopunvensParaReportes);
					
					cuentabancopunvenLogicAuxiliar.cargarRelacionesLoteForeignKeyCuentaBancoPunVenWithConnection(); //deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes, "");
					
					cuentabancopunvensParaReportes=cuentabancopunvenLogicAuxiliar.getCuentaBancoPunVens();
					
					//cuentabancopunvenLogic.getNewConnexionToDeep();
					
					//for (CuentaBancoPunVen cuentabancopunven:cuentabancopunvensParaReportes) {
					//	cuentabancopunvenLogic.deepLoad(cuentabancopunven, false, DeepLoadType.INCLUDE, classes);
					//}						
					//cuentabancopunvenLogic.commitNewConnexionToDeep();
					
						
				} catch(Exception e) {
					throw e;
					
				} finally {
					//cuentabancopunvenLogic.closeNewConnexionToDeep();
				}
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			//ARCHITECTURE		
			
		
			
			

			InputStream reportFileFormaPagoPuntoVenta = AuxiliarReportes.class.getResourceAsStream("FormaPagoPuntoVentaDetalleRelacionesDesign.jasper");
			parameters.put("subreport_formapagopuntoventa", reportFileFormaPagoPuntoVenta);
		} else {
			//FK DEBERIA TRAERSE DE ANTEMANO
			
		}
								
		
		//CLASSES PARA REPORTES OBJETOS RELACIONADOS
		if(!this.sTipoReporte.equals("RELACIONES")) {//!isEsReporteRelaciones
			classes=new ArrayList<Classe>();
		}
		
		JRBeanArrayDataSource jrbeanArrayDataSourceCuentaBancoPunVen=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			CuentaBancoPunVenConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			CuentaBancoPunVenConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceCuentaBancoPunVen=new JRBeanArrayDataSource(CuentaBancoPunVenJInternalFrame.TraerCuentaBancoPunVenBeans(cuentabancopunvensParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceCuentaBancoPunVen);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+CuentaBancoPunVenConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+CuentaBancoPunVenConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(CuentaBancoPunVenBean.TraerCuentaBancoPunVenBeans(cuentabancopunvensParaReportes).toArray()));
							
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
				this.generarExcelReporteCuentaBancoPunVens(sAccionBusqueda,sTipoArchivoReporte,cuentabancopunvensParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalCuentaBancoPunVens(sAccionBusqueda,sTipoArchivoReporte,cuentabancopunvensParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoCuentaBancoPunVenActionPerformed(null);
					//this.generarExcelReporteCuentaBancoPunVens(sAccionBusqueda,sTipoArchivoReporte,cuentabancopunvensParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalCuentaBancoPunVens(sAccionBusqueda,sTipoArchivoReporte,cuentabancopunvensParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesCuentaBancoPunVens(sAccionBusqueda,sTipoArchivoReporte,cuentabancopunvensParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesCuentaBancoPunVens(sAccionBusqueda,sTipoArchivoReporte,cuentabancopunvensParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteCuentaBancoPunVens(String sAccionBusqueda,String sTipoArchivoReporte,List<CuentaBancoPunVen> cuentabancopunvensParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"cuentabancopunven";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("CuentaBancoPunVens");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderCuentaBancoPunVen("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(CuentaBancoPunVen cuentabancopunven : cuentabancopunvensParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			CuentaBancoPunVenConstantesFunciones.generarExcelReporteDataCuentaBancoPunVen("NORMAL",row,workbook,cuentabancopunven,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cuentabancopunvenSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Cuenta Banco",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderCuentaBancoPunVen(String sTipo,Row row,Workbook workbook) {
		
		CuentaBancoPunVenConstantesFunciones.generarExcelReporteHeaderCuentaBancoPunVen(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalCuentaBancoPunVens(String sAccionBusqueda,String sTipoArchivoReporte,List<CuentaBancoPunVen> cuentabancopunvensParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"cuentabancopunven_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("CuentaBancoPunVens");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(CuentaBancoPunVen cuentabancopunven : cuentabancopunvensParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(CuentaBancoPunVenConstantesFunciones.getCuentaBancoPunVenDescripcion(cuentabancopunven));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CuentaBancoPunVenConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CuentaBancoPunVenConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cuentabancopunven.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CuentaBancoPunVenConstantesFunciones.LABEL_IDSUCURSAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CuentaBancoPunVenConstantesFunciones.LABEL_IDSUCURSAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cuentabancopunven.getsucursal_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CuentaBancoPunVenConstantesFunciones.LABEL_IDBANCO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CuentaBancoPunVenConstantesFunciones.LABEL_IDBANCO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cuentabancopunven.getbanco_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CuentaBancoPunVenConstantesFunciones.LABEL_IDCLIENTE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CuentaBancoPunVenConstantesFunciones.LABEL_IDCLIENTE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cuentabancopunven.getcliente_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CuentaBancoPunVenConstantesFunciones.LABEL_IDCUENTACONTABLE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CuentaBancoPunVenConstantesFunciones.LABEL_IDCUENTACONTABLE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cuentabancopunven.getcuentacontable_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CuentaBancoPunVenConstantesFunciones.LABEL_CODIGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CuentaBancoPunVenConstantesFunciones.LABEL_CODIGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cuentabancopunven.getcodigo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CuentaBancoPunVenConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CuentaBancoPunVenConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cuentabancopunven.getnombre());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cuentabancopunvenSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Cuenta Banco",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesCuentaBancoPunVens(String sAccionBusqueda,String sTipoArchivoReporte,List<CuentaBancoPunVen> cuentabancopunvensParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<CuentaBancoPunVen> cuentabancopunvensRespaldo=null;
		
		classes=CuentaBancoPunVenConstantesFunciones.getClassesRelationshipsOfCuentaBancoPunVen(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.cuentabancopunvenLogic.setDatosCliente(this.datosCliente);
		this.cuentabancopunvenLogic.setDatosDeep(this.datosDeep);
		this.cuentabancopunvenLogic.setIsConDeep(true);
		
		cuentabancopunvensRespaldo=this.cuentabancopunvenLogic.getCuentaBancoPunVens();
		
		this.cuentabancopunvenLogic.setCuentaBancoPunVens(cuentabancopunvensParaReportes);	
		this.cuentabancopunvenLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		cuentabancopunvensParaReportes=this.cuentabancopunvenLogic.getCuentaBancoPunVens();
		this.cuentabancopunvenLogic.setCuentaBancoPunVens(cuentabancopunvensRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"cuentabancopunven_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("CuentaBancoPunVens");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderCuentaBancoPunVen("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(CuentaBancoPunVen cuentabancopunven : cuentabancopunvensParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderCuentaBancoPunVen("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			CuentaBancoPunVenConstantesFunciones.generarExcelReporteDataCuentaBancoPunVen("NORMAL",row,workbook,cuentabancopunven,cellStyleDataAux);
		
			
			


				//FormaPagoPuntoVenta
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(FormaPagoPuntoVentaConstantesFunciones.SCLASSWEBTITULO))) {

				if(cuentabancopunven.getFormaPagoPuntoVentas()!=null && cuentabancopunven.getFormaPagoPuntoVentas().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(FormaPagoPuntoVentaConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					FormaPagoPuntoVentaConstantesFunciones.generarExcelReporteHeaderFormaPagoPuntoVenta("RELACIONADO",row,workbook);
				}

				if(cuentabancopunven.getFormaPagoPuntoVentas()!=null) {
					i2=0;
					for(FormaPagoPuntoVenta formapagopuntoventa : cuentabancopunven.getFormaPagoPuntoVentas()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						FormaPagoPuntoVentaConstantesFunciones.generarExcelReporteDataFormaPagoPuntoVenta("RELACIONADO",row,workbook,formapagopuntoventa,cellStyleDataAuxHijo);
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
		cell.setCellValue(CuentaBancoPunVenConstantesFunciones.getCuentaBancoPunVenDescripcion(cuentabancopunven));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cuentabancopunvenSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Cuenta Banco",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoCuentaBancoPunVen.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoCuentaBancoPunVen.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoCuentaBancoPunVen.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoCuentaBancoPunVen.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessCuentaBancoPunVen() throws Exception {		
		this.startProcessCuentaBancoPunVen(true);
	}
	
	public void startProcessCuentaBancoPunVen(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasCuentaBancoPunVen ,this.jPanelParametrosReportesCuentaBancoPunVen, this.jScrollPanelDatosCuentaBancoPunVen,this.jPanelPaginacionCuentaBancoPunVen, this.jScrollPanelDatosEdicionCuentaBancoPunVen, this.jPanelAccionesCuentaBancoPunVen,this.jPanelAccionesFormularioCuentaBancoPunVen,this.jmenuBarCuentaBancoPunVen,this.jmenuBarDetalleCuentaBancoPunVen,this.jTtoolBarCuentaBancoPunVen,this.jTtoolBarDetalleCuentaBancoPunVen);		
		
		final JTabbedPane jTabbedPaneBusquedasCuentaBancoPunVen=this.jTabbedPaneBusquedasCuentaBancoPunVen; 
		
		final JPanel jPanelParametrosReportesCuentaBancoPunVen=this.jPanelParametrosReportesCuentaBancoPunVen;
		//final JScrollPane jScrollPanelDatosCuentaBancoPunVen=this.jScrollPanelDatosCuentaBancoPunVen;
		final JTable jTableDatosCuentaBancoPunVen=this.jTableDatosCuentaBancoPunVen;		
		final JPanel jPanelPaginacionCuentaBancoPunVen=this.jPanelPaginacionCuentaBancoPunVen;
		//final JScrollPane jScrollPanelDatosEdicionCuentaBancoPunVen=this.jScrollPanelDatosEdicionCuentaBancoPunVen;
		final JPanel jPanelAccionesCuentaBancoPunVen=this.jPanelAccionesCuentaBancoPunVen;
		
		JPanel jPanelCamposAuxiliarCuentaBancoPunVen=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarCuentaBancoPunVen=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormCuentaBancoPunVen!=null) {
			jPanelCamposAuxiliarCuentaBancoPunVen=this.jInternalFrameDetalleFormCuentaBancoPunVen.jPanelCamposCuentaBancoPunVen;
			jPanelAccionesFormularioAuxiliarCuentaBancoPunVen=this.jInternalFrameDetalleFormCuentaBancoPunVen.jPanelAccionesFormularioCuentaBancoPunVen;
		}
		
		final JPanel jPanelCamposCuentaBancoPunVen=jPanelCamposAuxiliarCuentaBancoPunVen;
		final JPanel jPanelAccionesFormularioCuentaBancoPunVen=jPanelAccionesFormularioAuxiliarCuentaBancoPunVen;
		
		
		final JMenuBar jmenuBarCuentaBancoPunVen=this.jmenuBarCuentaBancoPunVen;
		final JToolBar jTtoolBarCuentaBancoPunVen=this.jTtoolBarCuentaBancoPunVen;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarCuentaBancoPunVen=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarCuentaBancoPunVen=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormCuentaBancoPunVen!=null) {
			jmenuBarDetalleAuxiliarCuentaBancoPunVen=this.jInternalFrameDetalleFormCuentaBancoPunVen.jmenuBarDetalleCuentaBancoPunVen;
			jTtoolBarDetalleAuxiliarCuentaBancoPunVen=this.jInternalFrameDetalleFormCuentaBancoPunVen.jTtoolBarDetalleCuentaBancoPunVen;
		}
		
		final JMenuBar jmenuBarDetalleCuentaBancoPunVen=jmenuBarDetalleAuxiliarCuentaBancoPunVen;
		final JToolBar jTtoolBarDetalleCuentaBancoPunVen=jTtoolBarDetalleAuxiliarCuentaBancoPunVen;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasCuentaBancoPunVen;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesCuentaBancoPunVen;
			processRunnable.jTableDatos=jTableDatosCuentaBancoPunVen;
			processRunnable.jPanelCampos=jPanelCamposCuentaBancoPunVen;
			processRunnable.jPanelPaginacion=jPanelPaginacionCuentaBancoPunVen;
			processRunnable.jPanelAcciones=jPanelAccionesCuentaBancoPunVen;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioCuentaBancoPunVen;
			
			
			processRunnable.jmenuBar=jmenuBarCuentaBancoPunVen;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleCuentaBancoPunVen;
			processRunnable.jTtoolBar=jTtoolBarCuentaBancoPunVen;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleCuentaBancoPunVen;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasCuentaBancoPunVen ,jPanelParametrosReportesCuentaBancoPunVen,jTableDatosCuentaBancoPunVen, /*jScrollPanelDatosCuentaBancoPunVen,*/jPanelCamposCuentaBancoPunVen,jPanelPaginacionCuentaBancoPunVen, /*jScrollPanelDatosEdicionCuentaBancoPunVen,*/ jPanelAccionesCuentaBancoPunVen,jPanelAccionesFormularioCuentaBancoPunVen,jmenuBarCuentaBancoPunVen,jmenuBarDetalleCuentaBancoPunVen,jTtoolBarCuentaBancoPunVen,jTtoolBarDetalleCuentaBancoPunVen);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasCuentaBancoPunVen ,jPanelParametrosReportesCuentaBancoPunVen, jScrollPanelDatosCuentaBancoPunVen,jPanelPaginacionCuentaBancoPunVen, jScrollPanelDatosEdicionCuentaBancoPunVen, jPanelAccionesCuentaBancoPunVen,jPanelAccionesFormularioCuentaBancoPunVen,jmenuBarCuentaBancoPunVen,jmenuBarDetalleCuentaBancoPunVen,jTtoolBarCuentaBancoPunVen,jTtoolBarDetalleCuentaBancoPunVen);
						
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
	
	public void finishProcessCuentaBancoPunVen() {// throws Exception 
		this.finishProcessCuentaBancoPunVen(true);
	}
	
	public void finishProcessCuentaBancoPunVen(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasCuentaBancoPunVen ,this.jPanelParametrosReportesCuentaBancoPunVen, this.jScrollPanelDatosCuentaBancoPunVen,this.jPanelPaginacionCuentaBancoPunVen, this.jScrollPanelDatosEdicionCuentaBancoPunVen, this.jPanelAccionesCuentaBancoPunVen,this.jPanelAccionesFormularioCuentaBancoPunVen,this.jmenuBarCuentaBancoPunVen,this.jmenuBarDetalleCuentaBancoPunVen,this.jTtoolBarCuentaBancoPunVen,this.jTtoolBarDetalleCuentaBancoPunVen);		
		
		final JTabbedPane jTabbedPaneBusquedasCuentaBancoPunVen=this.jTabbedPaneBusquedasCuentaBancoPunVen; 
		
		final JPanel jPanelParametrosReportesCuentaBancoPunVen=this.jPanelParametrosReportesCuentaBancoPunVen;
		//final JScrollPane jScrollPanelDatosCuentaBancoPunVen=this.jScrollPanelDatosCuentaBancoPunVen;
		final JTable jTableDatosCuentaBancoPunVen=this.jTableDatosCuentaBancoPunVen;		
		final JPanel jPanelPaginacionCuentaBancoPunVen=this.jPanelPaginacionCuentaBancoPunVen;
		//final JScrollPane jScrollPanelDatosEdicionCuentaBancoPunVen=this.jScrollPanelDatosEdicionCuentaBancoPunVen;
		final JPanel jPanelAccionesCuentaBancoPunVen=this.jPanelAccionesCuentaBancoPunVen;
		
		JPanel jPanelCamposAuxiliarCuentaBancoPunVen=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarCuentaBancoPunVen=new JPanel();
		
		if(this.jInternalFrameDetalleFormCuentaBancoPunVen!=null) {
			jPanelCamposAuxiliarCuentaBancoPunVen=this.jInternalFrameDetalleFormCuentaBancoPunVen.jPanelCamposCuentaBancoPunVen;
			jPanelAccionesFormularioAuxiliarCuentaBancoPunVen=this.jInternalFrameDetalleFormCuentaBancoPunVen.jPanelAccionesFormularioCuentaBancoPunVen;
		}
		
		final JPanel jPanelCamposCuentaBancoPunVen=jPanelCamposAuxiliarCuentaBancoPunVen;
		final JPanel jPanelAccionesFormularioCuentaBancoPunVen=jPanelAccionesFormularioAuxiliarCuentaBancoPunVen;
		
		
		final JMenuBar jmenuBarCuentaBancoPunVen=this.jmenuBarCuentaBancoPunVen;		
		final JToolBar jTtoolBarCuentaBancoPunVen=this.jTtoolBarCuentaBancoPunVen;
				
		JMenuBar jmenuBarDetalleAuxiliarCuentaBancoPunVen=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarCuentaBancoPunVen=new JToolBar();
		
		if(this.jInternalFrameDetalleFormCuentaBancoPunVen!=null) {
			jmenuBarDetalleAuxiliarCuentaBancoPunVen=this.jInternalFrameDetalleFormCuentaBancoPunVen.jmenuBarDetalleCuentaBancoPunVen;
			jTtoolBarDetalleAuxiliarCuentaBancoPunVen=this.jInternalFrameDetalleFormCuentaBancoPunVen.jTtoolBarDetalleCuentaBancoPunVen;		
		}
		
		final JMenuBar jmenuBarDetalleCuentaBancoPunVen=jmenuBarDetalleAuxiliarCuentaBancoPunVen;
		final JToolBar jTtoolBarDetalleCuentaBancoPunVen=jTtoolBarDetalleAuxiliarCuentaBancoPunVen;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasCuentaBancoPunVen;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesCuentaBancoPunVen;
			processRunnable.jTableDatos=jTableDatosCuentaBancoPunVen;
			processRunnable.jPanelCampos=jPanelCamposCuentaBancoPunVen;
			processRunnable.jPanelPaginacion=jPanelPaginacionCuentaBancoPunVen;
			processRunnable.jPanelAcciones=jPanelAccionesCuentaBancoPunVen;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioCuentaBancoPunVen;
			
			
			processRunnable.jmenuBar=jmenuBarCuentaBancoPunVen;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleCuentaBancoPunVen;
			processRunnable.jTtoolBar=jTtoolBarCuentaBancoPunVen;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleCuentaBancoPunVen;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasCuentaBancoPunVen ,jPanelParametrosReportesCuentaBancoPunVen, jTableDatosCuentaBancoPunVen,/*jScrollPanelDatosCuentaBancoPunVen,*/jPanelCamposCuentaBancoPunVen,jPanelPaginacionCuentaBancoPunVen, /*jScrollPanelDatosEdicionCuentaBancoPunVen,*/ jPanelAccionesCuentaBancoPunVen,jPanelAccionesFormularioCuentaBancoPunVen,jmenuBarCuentaBancoPunVen,jmenuBarDetalleCuentaBancoPunVen,jTtoolBarCuentaBancoPunVen,jTtoolBarDetalleCuentaBancoPunVen));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesCuentaBancoPunVen(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarCuentaBancoPunVen(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuCuentaBancoPunVen(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarCuentaBancoPunVen(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarCuentaBancoPunVen,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleCuentaBancoPunVen,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuCuentaBancoPunVen(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarCuentaBancoPunVen,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleCuentaBancoPunVen,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.cuentabancopunvenConstantesFunciones.getsFinalQueryCuentaBancoPunVen();
		String  finalQueryPaginacionTodos=this.cuentabancopunvenConstantesFunciones.getsFinalQueryCuentaBancoPunVen();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=CuentaBancoPunVenConstantesFunciones.getArrayColumnasGlobalesNoCuentaBancoPunVen(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=CuentaBancoPunVenConstantesFunciones.getArrayColumnasGlobalesCuentaBancoPunVen(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,CuentaBancoPunVenConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.cuentabancopunvensEliminados= new ArrayList<CuentaBancoPunVen>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessCuentaBancoPunVen();
		
				///*CuentaBancoPunVenSessionBean*/this.cuentabancopunvenSessionBean=new CuentaBancoPunVenSessionBean();
			
			if(this.cuentabancopunvenSessionBean==null) {
				this.cuentabancopunvenSessionBean=new CuentaBancoPunVenSessionBean();
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
					this.iNumeroPaginacion=CuentaBancoPunVenConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=CuentaBancoPunVenConstantesFunciones.getClassesForeignKeysOfCuentaBancoPunVen(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/cuentabancopunven."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			cuentabancopunvensAux= new ArrayList<CuentaBancoPunVen>();
			
				
			cuentabancopunvenLogic.setDatosCliente(this.datosCliente);
			cuentabancopunvenLogic.setDatosDeep(this.datosDeep);
			cuentabancopunvenLogic.setIsConDeep(true);
			
			
			cuentabancopunvenLogic.getCuentaBancoPunVenDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					cuentabancopunvenLogic.getTodosCuentaBancoPunVens(finalQueryGlobal,pagination);
					
					//cuentabancopunvenLogic.getTodosCuentaBancoPunVensWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(cuentabancopunvenLogic.getCuentaBancoPunVens()==null|| cuentabancopunvenLogic.getCuentaBancoPunVens().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							cuentabancopunvensAux= new ArrayList<CuentaBancoPunVen>();
							cuentabancopunvensAux.addAll(cuentabancopunvenLogic.getCuentaBancoPunVens());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							cuentabancopunvensAux= new ArrayList<CuentaBancoPunVen>();
							cuentabancopunvensAux.addAll(cuentabancopunvens);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							cuentabancopunvenLogic.getTodosCuentaBancoPunVens(finalQueryGlobal+"",this.pagination);												
							
							//cuentabancopunvenLogic.getTodosCuentaBancoPunVensWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteCuentaBancoPunVens("Todos",cuentabancopunvenLogic.getCuentaBancoPunVens() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							cuentabancopunvenLogic.setCuentaBancoPunVens(new ArrayList<CuentaBancoPunVen>());					
							cuentabancopunvenLogic.getCuentaBancoPunVens().addAll(cuentabancopunvensAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							cuentabancopunvens=new ArrayList<CuentaBancoPunVen>();
							cuentabancopunvens.addAll(cuentabancopunvensAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idCuentaBancoPunVen=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idCuentaBancoPunVen=this.idActual;
				
				} else if(this.idCuentaBancoPunVenActual!=null && this.idCuentaBancoPunVenActual!=0L) {
					idCuentaBancoPunVen=idCuentaBancoPunVenActual;
				}
				
					
				this.sDetalleReporte=CuentaBancoPunVenConstantesFunciones.getDetalleIndicePorId(idCuentaBancoPunVen);
				
				this.cuentabancopunvens=new ArrayList<CuentaBancoPunVen>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					cuentabancopunvenLogic.getEntity(idCuentaBancoPunVen);
					
					//cuentabancopunvenLogic.getEntityWithConnection(idCuentaBancoPunVen);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					cuentabancopunvenLogic.setCuentaBancoPunVens(new ArrayList<CuentaBancoPunVen>());
					cuentabancopunvenLogic.getCuentaBancoPunVens().add(cuentabancopunvenLogic.getCuentaBancoPunVen());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.cuentabancopunvens=new ArrayList<CuentaBancoPunVen>();
					this.cuentabancopunvens.add(cuentabancopunven);
				}
				
				if(cuentabancopunvenLogic.getCuentaBancoPunVen()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdBanco")) {
				this.sDetalleReporte=CuentaBancoPunVenConstantesFunciones.getDetalleIndiceFK_IdBanco(id_bancoFK_IdBanco);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					cuentabancopunvenLogic.getCuentaBancoPunVensFK_IdBanco(finalQueryGlobal,pagination,id_bancoFK_IdBanco);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=CuentaBancoPunVenConstantesFunciones.getDetalleIndiceFK_IdBanco(id_bancoFK_IdBanco);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=CuentaBancoPunVenConstantesFunciones.getDetalleIndiceFK_IdBanco(id_bancoFK_IdBanco);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=cuentabancopunvenLogic.getCuentaBancoPunVens()==null||cuentabancopunvenLogic.getCuentaBancoPunVens().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=cuentabancopunvens==null|| cuentabancopunvens.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						cuentabancopunvensAux=new ArrayList<CuentaBancoPunVen>();
						cuentabancopunvensAux.addAll(cuentabancopunvenLogic.getCuentaBancoPunVens());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							cuentabancopunvensAux=new ArrayList<CuentaBancoPunVen>();
							cuentabancopunvensAux.addAll(cuentabancopunvens);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							cuentabancopunvenLogic.getCuentaBancoPunVensFK_IdBanco(finalQueryGlobal,pagination,id_bancoFK_IdBanco);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=CuentaBancoPunVenConstantesFunciones.getDetalleIndiceFK_IdBanco(id_bancoFK_IdBanco);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=CuentaBancoPunVenConstantesFunciones.getDetalleIndiceFK_IdBanco(id_bancoFK_IdBanco);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteCuentaBancoPunVens("FK_IdBanco",cuentabancopunvenLogic.getCuentaBancoPunVens());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteCuentaBancoPunVens("FK_IdBanco",cuentabancopunvens);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						cuentabancopunvenLogic.setCuentaBancoPunVens(new ArrayList<CuentaBancoPunVen>());
						cuentabancopunvenLogic.getCuentaBancoPunVens().addAll(cuentabancopunvensAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							cuentabancopunvens=new ArrayList<CuentaBancoPunVen>();
							cuentabancopunvens.addAll(cuentabancopunvensAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdCliente")) {
				this.sDetalleReporte=CuentaBancoPunVenConstantesFunciones.getDetalleIndiceFK_IdCliente(id_clienteFK_IdCliente);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					cuentabancopunvenLogic.getCuentaBancoPunVensFK_IdCliente(finalQueryGlobal,pagination,id_clienteFK_IdCliente);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=CuentaBancoPunVenConstantesFunciones.getDetalleIndiceFK_IdCliente(id_clienteFK_IdCliente);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=CuentaBancoPunVenConstantesFunciones.getDetalleIndiceFK_IdCliente(id_clienteFK_IdCliente);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=cuentabancopunvenLogic.getCuentaBancoPunVens()==null||cuentabancopunvenLogic.getCuentaBancoPunVens().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=cuentabancopunvens==null|| cuentabancopunvens.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						cuentabancopunvensAux=new ArrayList<CuentaBancoPunVen>();
						cuentabancopunvensAux.addAll(cuentabancopunvenLogic.getCuentaBancoPunVens());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							cuentabancopunvensAux=new ArrayList<CuentaBancoPunVen>();
							cuentabancopunvensAux.addAll(cuentabancopunvens);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							cuentabancopunvenLogic.getCuentaBancoPunVensFK_IdCliente(finalQueryGlobal,pagination,id_clienteFK_IdCliente);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=CuentaBancoPunVenConstantesFunciones.getDetalleIndiceFK_IdCliente(id_clienteFK_IdCliente);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=CuentaBancoPunVenConstantesFunciones.getDetalleIndiceFK_IdCliente(id_clienteFK_IdCliente);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteCuentaBancoPunVens("FK_IdCliente",cuentabancopunvenLogic.getCuentaBancoPunVens());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteCuentaBancoPunVens("FK_IdCliente",cuentabancopunvens);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						cuentabancopunvenLogic.setCuentaBancoPunVens(new ArrayList<CuentaBancoPunVen>());
						cuentabancopunvenLogic.getCuentaBancoPunVens().addAll(cuentabancopunvensAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							cuentabancopunvens=new ArrayList<CuentaBancoPunVen>();
							cuentabancopunvens.addAll(cuentabancopunvensAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdCuentaContable")) {
				this.sDetalleReporte=CuentaBancoPunVenConstantesFunciones.getDetalleIndiceFK_IdCuentaContable(id_cuenta_contableFK_IdCuentaContable);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					cuentabancopunvenLogic.getCuentaBancoPunVensFK_IdCuentaContable(finalQueryGlobal,pagination,id_cuenta_contableFK_IdCuentaContable);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=CuentaBancoPunVenConstantesFunciones.getDetalleIndiceFK_IdCuentaContable(id_cuenta_contableFK_IdCuentaContable);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=CuentaBancoPunVenConstantesFunciones.getDetalleIndiceFK_IdCuentaContable(id_cuenta_contableFK_IdCuentaContable);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=cuentabancopunvenLogic.getCuentaBancoPunVens()==null||cuentabancopunvenLogic.getCuentaBancoPunVens().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=cuentabancopunvens==null|| cuentabancopunvens.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						cuentabancopunvensAux=new ArrayList<CuentaBancoPunVen>();
						cuentabancopunvensAux.addAll(cuentabancopunvenLogic.getCuentaBancoPunVens());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							cuentabancopunvensAux=new ArrayList<CuentaBancoPunVen>();
							cuentabancopunvensAux.addAll(cuentabancopunvens);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							cuentabancopunvenLogic.getCuentaBancoPunVensFK_IdCuentaContable(finalQueryGlobal,pagination,id_cuenta_contableFK_IdCuentaContable);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=CuentaBancoPunVenConstantesFunciones.getDetalleIndiceFK_IdCuentaContable(id_cuenta_contableFK_IdCuentaContable);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=CuentaBancoPunVenConstantesFunciones.getDetalleIndiceFK_IdCuentaContable(id_cuenta_contableFK_IdCuentaContable);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteCuentaBancoPunVens("FK_IdCuentaContable",cuentabancopunvenLogic.getCuentaBancoPunVens());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteCuentaBancoPunVens("FK_IdCuentaContable",cuentabancopunvens);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						cuentabancopunvenLogic.setCuentaBancoPunVens(new ArrayList<CuentaBancoPunVen>());
						cuentabancopunvenLogic.getCuentaBancoPunVens().addAll(cuentabancopunvensAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							cuentabancopunvens=new ArrayList<CuentaBancoPunVen>();
							cuentabancopunvens.addAll(cuentabancopunvensAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=CuentaBancoPunVenConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					cuentabancopunvenLogic.getCuentaBancoPunVensFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=CuentaBancoPunVenConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=CuentaBancoPunVenConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=cuentabancopunvenLogic.getCuentaBancoPunVens()==null||cuentabancopunvenLogic.getCuentaBancoPunVens().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=cuentabancopunvens==null|| cuentabancopunvens.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						cuentabancopunvensAux=new ArrayList<CuentaBancoPunVen>();
						cuentabancopunvensAux.addAll(cuentabancopunvenLogic.getCuentaBancoPunVens());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							cuentabancopunvensAux=new ArrayList<CuentaBancoPunVen>();
							cuentabancopunvensAux.addAll(cuentabancopunvens);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							cuentabancopunvenLogic.getCuentaBancoPunVensFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=CuentaBancoPunVenConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=CuentaBancoPunVenConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteCuentaBancoPunVens("FK_IdEmpresa",cuentabancopunvenLogic.getCuentaBancoPunVens());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteCuentaBancoPunVens("FK_IdEmpresa",cuentabancopunvens);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						cuentabancopunvenLogic.setCuentaBancoPunVens(new ArrayList<CuentaBancoPunVen>());
						cuentabancopunvenLogic.getCuentaBancoPunVens().addAll(cuentabancopunvensAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							cuentabancopunvens=new ArrayList<CuentaBancoPunVen>();
							cuentabancopunvens.addAll(cuentabancopunvensAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdSucursal")) {
				this.sDetalleReporte=CuentaBancoPunVenConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					cuentabancopunvenLogic.getCuentaBancoPunVensFK_IdSucursal(finalQueryGlobal,pagination,id_sucursalFK_IdSucursal);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=CuentaBancoPunVenConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=CuentaBancoPunVenConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=cuentabancopunvenLogic.getCuentaBancoPunVens()==null||cuentabancopunvenLogic.getCuentaBancoPunVens().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=cuentabancopunvens==null|| cuentabancopunvens.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						cuentabancopunvensAux=new ArrayList<CuentaBancoPunVen>();
						cuentabancopunvensAux.addAll(cuentabancopunvenLogic.getCuentaBancoPunVens());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							cuentabancopunvensAux=new ArrayList<CuentaBancoPunVen>();
							cuentabancopunvensAux.addAll(cuentabancopunvens);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							cuentabancopunvenLogic.getCuentaBancoPunVensFK_IdSucursal(finalQueryGlobal,pagination,id_sucursalFK_IdSucursal);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=CuentaBancoPunVenConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=CuentaBancoPunVenConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteCuentaBancoPunVens("FK_IdSucursal",cuentabancopunvenLogic.getCuentaBancoPunVens());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteCuentaBancoPunVens("FK_IdSucursal",cuentabancopunvens);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						cuentabancopunvenLogic.setCuentaBancoPunVens(new ArrayList<CuentaBancoPunVen>());
						cuentabancopunvenLogic.getCuentaBancoPunVens().addAll(cuentabancopunvensAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							cuentabancopunvens=new ArrayList<CuentaBancoPunVen>();
							cuentabancopunvens.addAll(cuentabancopunvensAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesCuentaBancoPunVen();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessCuentaBancoPunVen();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=cuentabancopunvenLogic.getCuentaBancoPunVens().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=cuentabancopunvens.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=cuentabancopunvenLogic.getCuentaBancoPunVens().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=cuentabancopunvens.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(CuentaBancoPunVen cuentabancopunven) {
		Boolean permite=true;
		
		if(this.cuentabancopunven.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=CuentaBancoPunVenConstantesFunciones.getOrderByListaCuentaBancoPunVen();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=CuentaBancoPunVenConstantesFunciones.getOrderByListaCuentaBancoPunVen();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(CuentaBancoPunVen cuentabancopunven:cuentabancopunvenLogic.getCuentaBancoPunVens()) {
				if(cuentabancopunven.getsType().equals(Constantes2.S_TOTALES)) {
					cuentabancopunvenTotales=cuentabancopunven;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(CuentaBancoPunVen cuentabancopunven:this.cuentabancopunvens) {
				if(cuentabancopunven.getsType().equals(Constantes2.S_TOTALES)) {
					cuentabancopunvenTotales=cuentabancopunven;
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
			this.cuentabancopunvenAux=new CuentaBancoPunVen();
			this.cuentabancopunvenAux.setsType(Constantes2.S_TOTALES);
			this.cuentabancopunvenAux.setIsNew(false);
			this.cuentabancopunvenAux.setIsChanged(false);
			this.cuentabancopunvenAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				CuentaBancoPunVenConstantesFunciones.TotalizarValoresFilaCuentaBancoPunVen(this.cuentabancopunvenLogic.getCuentaBancoPunVens(),this.cuentabancopunvenAux);
				
				this.cuentabancopunvenLogic.getCuentaBancoPunVens().add(this.cuentabancopunvenAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				CuentaBancoPunVenConstantesFunciones.TotalizarValoresFilaCuentaBancoPunVen(this.cuentabancopunvens,this.cuentabancopunvenAux);
				
				this.cuentabancopunvens.add(this.cuentabancopunvenAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		cuentabancopunvenTotales=new CuentaBancoPunVen();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.cuentabancopunvenLogic.getCuentaBancoPunVens().remove(cuentabancopunvenTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.cuentabancopunvens.remove(cuentabancopunvenTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		cuentabancopunvenTotales=new CuentaBancoPunVen();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(CuentaBancoPunVen cuentabancopunven:cuentabancopunvenLogic.getCuentaBancoPunVens()) {
				if(cuentabancopunven.getsType().equals(Constantes2.S_TOTALES)) {
					cuentabancopunvenTotales=cuentabancopunven;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				CuentaBancoPunVenConstantesFunciones.TotalizarValoresFilaCuentaBancoPunVen(this.cuentabancopunvenLogic.getCuentaBancoPunVens(),cuentabancopunvenTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(CuentaBancoPunVen cuentabancopunven:this.cuentabancopunvens) {
				if(cuentabancopunven.getsType().equals(Constantes2.S_TOTALES)) {
					cuentabancopunvenTotales=cuentabancopunven;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				CuentaBancoPunVenConstantesFunciones.TotalizarValoresFilaCuentaBancoPunVen(this.cuentabancopunvens,cuentabancopunvenTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CuentaBancoPunVenConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getCuentaBancoPunVensFK_IdBanco()throws Exception {
		try {
			sAccionBusqueda="FK_IdBanco";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getCuentaBancoPunVensFK_IdCliente()throws Exception {
		try {
			sAccionBusqueda="FK_IdCliente";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getCuentaBancoPunVensFK_IdCuentaContable()throws Exception {
		try {
			sAccionBusqueda="FK_IdCuentaContable";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getCuentaBancoPunVensFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getCuentaBancoPunVensFK_IdSucursal()throws Exception {
		try {
			sAccionBusqueda="FK_IdSucursal";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getCuentaBancoPunVensFK_IdBanco(String sFinalQuery,Long id_banco)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					cuentabancopunvenLogic.getCuentaBancoPunVensFK_IdBanco(sFinalQuery,this.pagination,id_banco);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getCuentaBancoPunVensFK_IdCliente(String sFinalQuery,Long id_cliente)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					cuentabancopunvenLogic.getCuentaBancoPunVensFK_IdCliente(sFinalQuery,this.pagination,id_cliente);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getCuentaBancoPunVensFK_IdCuentaContable(String sFinalQuery,Long id_cuenta_contable)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					cuentabancopunvenLogic.getCuentaBancoPunVensFK_IdCuentaContable(sFinalQuery,this.pagination,id_cuenta_contable);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getCuentaBancoPunVensFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					cuentabancopunvenLogic.getCuentaBancoPunVensFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getCuentaBancoPunVensFK_IdSucursal(String sFinalQuery,Long id_sucursal)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					cuentabancopunvenLogic.getCuentaBancoPunVensFK_IdSucursal(sFinalQuery,this.pagination,id_sucursal);
				
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
	
	public void inicializarPermisosCuentaBancoPunVen() {
		this.isPermisoTodoCuentaBancoPunVen=false;
		this.isPermisoNuevoCuentaBancoPunVen=false;
		this.isPermisoActualizarCuentaBancoPunVen=false;
		this.isPermisoActualizarOriginalCuentaBancoPunVen=false;
		this.isPermisoEliminarCuentaBancoPunVen=false;
		this.isPermisoGuardarCambiosCuentaBancoPunVen=false;
		this.isPermisoConsultaCuentaBancoPunVen=false;
		this.isPermisoBusquedaCuentaBancoPunVen=false;
		this.isPermisoReporteCuentaBancoPunVen=false;		
		this.isPermisoOrdenCuentaBancoPunVen=false;		
		this.isPermisoPaginacionMedioCuentaBancoPunVen=false;		
		this.isPermisoPaginacionAltoCuentaBancoPunVen=false;
		this.isPermisoPaginacionTodoCuentaBancoPunVen=false;
		this.isPermisoCopiarCuentaBancoPunVen=false;		
		this.isPermisoVerFormCuentaBancoPunVen=false;		
		this.isPermisoDuplicarCuentaBancoPunVen=false;		
		this.isPermisoOrdenCuentaBancoPunVen=false;		
	}
	
	public void setPermisosUsuarioCuentaBancoPunVen(Boolean isPermiso) {
		this.isPermisoTodoCuentaBancoPunVen=isPermiso;
		this.isPermisoNuevoCuentaBancoPunVen=isPermiso;
		this.isPermisoActualizarCuentaBancoPunVen=isPermiso;
		this.isPermisoActualizarOriginalCuentaBancoPunVen=isPermiso;
		this.isPermisoEliminarCuentaBancoPunVen=isPermiso;
		this.isPermisoGuardarCambiosCuentaBancoPunVen=isPermiso;
		this.isPermisoConsultaCuentaBancoPunVen=isPermiso;
		this.isPermisoBusquedaCuentaBancoPunVen=isPermiso;
		this.isPermisoReporteCuentaBancoPunVen=isPermiso;
		this.isPermisoOrdenCuentaBancoPunVen=isPermiso;		
		this.isPermisoPaginacionMedioCuentaBancoPunVen=isPermiso;		
		this.isPermisoPaginacionAltoCuentaBancoPunVen=isPermiso;		
		this.isPermisoPaginacionTodoCuentaBancoPunVen=isPermiso;		
		this.isPermisoCopiarCuentaBancoPunVen=isPermiso;		
		this.isPermisoVerFormCuentaBancoPunVen=isPermiso;		
		this.isPermisoDuplicarCuentaBancoPunVen=isPermiso;
		this.isPermisoOrdenCuentaBancoPunVen=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioCuentaBancoPunVen(Boolean isPermiso) {
		//this.isPermisoTodoCuentaBancoPunVen=isPermiso;
		this.isPermisoNuevoCuentaBancoPunVen=isPermiso;
		this.isPermisoActualizarCuentaBancoPunVen=isPermiso;
		this.isPermisoActualizarOriginalCuentaBancoPunVen=isPermiso;
		this.isPermisoEliminarCuentaBancoPunVen=isPermiso;
		this.isPermisoGuardarCambiosCuentaBancoPunVen=isPermiso;
		//this.isPermisoConsultaCuentaBancoPunVen=isPermiso;
		//this.isPermisoBusquedaCuentaBancoPunVen=isPermiso;
		//this.isPermisoReporteCuentaBancoPunVen=isPermiso;
		//this.isPermisoOrdenCuentaBancoPunVen=isPermiso;		
		//this.isPermisoPaginacionMedioCuentaBancoPunVen=isPermiso;		
		//this.isPermisoPaginacionAltoCuentaBancoPunVen=isPermiso;		
		//this.isPermisoPaginacionTodoCuentaBancoPunVen=isPermiso;		
		//this.isPermisoCopiarCuentaBancoPunVen=isPermiso;		
		//this.isPermisoDuplicarCuentaBancoPunVen=isPermiso;
		//this.isPermisoOrdenCuentaBancoPunVen=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioCuentaBancoPunVenClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		arrPaginas.add(FormaPagoPuntoVentaConstantesFunciones.SNOMBREOPCION);
		
		if(CuentaBancoPunVenJInternalFrame.CON_LLAMADA_SIMPLE) {
			this.opcionsRelacionadas.addAll(this.sistemaReturnGeneral.getOpcionsRelacionadas());
			
		} else {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				opcionsFinal=sistemaLogicAdditional.tienePermisosOpcionesEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, arrPaginas);
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			
			this.opcionsRelacionadas.addAll(opcionsFinal);
		}
		
		

		this.isTienePermisosFormaPagoPuntoVenta=false;
		this.isTienePermisosFormaPagoPuntoVenta=this.verificarGetPermisosUsuarioOpcionCuentaBancoPunVenClaseRelacionada(this.opcionsRelacionadas,FormaPagoPuntoVentaConstantesFunciones.SNOMBREOPCION);
		
	}
	
	public Boolean tienePermisosUsuarioEnPaginaWebCuentaBancoPunVen(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioCuentaBancoPunVenClasesRelacionadas(Boolean conPermiso) throws Exception {
		
		this.isTienePermisosFormaPagoPuntoVenta=conPermiso;
	}
	
	public Boolean verificarGetPermisosUsuarioCuentaBancoPunVenClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionCuentaBancoPunVenClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioCuentaBancoPunVenClasesRelacionadas() throws Exception {
		

		if(!this.isTienePermisosFormaPagoPuntoVenta && this.jInternalFrameDetalleFormCuentaBancoPunVen!=null && this.jInternalFrameDetalleFormCuentaBancoPunVen.formapagopuntoventaBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormCuentaBancoPunVen.jTabbedPaneRelacionesCuentaBancoPunVen.remove(this.jInternalFrameDetalleFormCuentaBancoPunVen.formapagopuntoventaBeanSwingJInternalFrame.getContentPane());
		}
	}
	
	public void setPermisosUsuarioCuentaBancoPunVen() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(CuentaBancoPunVenJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.cuentabancopunvenSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, CuentaBancoPunVenConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoCuentaBancoPunVen=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarCuentaBancoPunVen=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalCuentaBancoPunVen=this.isPermisoActualizarCuentaBancoPunVen;
			this.isPermisoEliminarCuentaBancoPunVen=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosCuentaBancoPunVen=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaCuentaBancoPunVen=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaCuentaBancoPunVen=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoCuentaBancoPunVen=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteCuentaBancoPunVen=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenCuentaBancoPunVen=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioCuentaBancoPunVen=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoCuentaBancoPunVen=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoCuentaBancoPunVen=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarCuentaBancoPunVen=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormCuentaBancoPunVen=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarCuentaBancoPunVen=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenCuentaBancoPunVen=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.cuentabancopunvenSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosCuentaBancoPunVen.setToolTipText(this.jTableDatosCuentaBancoPunVen.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioCuentaBancoPunVen(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioCuentaBancoPunVen(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(CuentaBancoPunVenJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(CuentaBancoPunVenJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioCuentaBancoPunVen() throws Exception {
		Reporte reporte=null;
		
		

		if(this.isTienePermisosFormaPagoPuntoVenta && this.cuentabancopunvenConstantesFunciones.mostrarFormaPagoPuntoVentaCuentaBancoPunVen && !CuentaBancoPunVenConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Forma Pago");
			reporte.setsDescripcion("Forma Pago");
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
	public void inicializarCombosForeignKeyCuentaBancoPunVenListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
				this.sucursalsForeignKey=new ArrayList();
				this.bancosForeignKey=new ArrayList();
				this.clientesForeignKey=new ArrayList();
				this.cuentacontablesForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyCuentaBancoPunVenListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(CuentaBancoPunVenJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyCuentaBancoPunVenListas(false);
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeySucursalListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyBancoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyClienteListas(cargarCombosDependencia,sFinalQueryCombo);
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

	public void cargarCombosForeignKeyBancoListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.bancosForeignKey==null||this.bancosForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=BancoConstantesFunciones.getArrayColumnasGlobalesBanco(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,BancoConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=BancoConstantesFunciones.SFINALQUERY;

				this.cargarCombosBancosForeignKeyLista(finalQueryGlobal);
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
	
	public void cargarCombosLoteForeignKeyCuentaBancoPunVenListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			CuentaBancoPunVenParameterReturnGeneral cuentabancopunvenReturnGeneral=new CuentaBancoPunVenParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.cuentabancopunvenConstantesFunciones.cargarid_empresaCuentaBancoPunVen)
					 || (this.esRecargarFks && this.cuentabancopunvenConstantesFunciones.cargarid_empresaCuentaBancoPunVen)) {

					if(!this.cuentabancopunvenSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+cuentabancopunvenSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}


				String finalQueryGlobalSucursal="";

				if(((this.sucursalsForeignKey==null||this.sucursalsForeignKey.size()<=0) && this.cuentabancopunvenConstantesFunciones.cargarid_sucursalCuentaBancoPunVen)
					 || (this.esRecargarFks && this.cuentabancopunvenConstantesFunciones.cargarid_sucursalCuentaBancoPunVen)) {

					if(!this.cuentabancopunvenSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=SucursalConstantesFunciones.getArrayColumnasGlobalesSucursal(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalSucursal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,SucursalConstantesFunciones.TABLENAME);

						finalQueryGlobalSucursal=Funciones.GetFinalQueryAppend(finalQueryGlobalSucursal, "");
						finalQueryGlobalSucursal+=SucursalConstantesFunciones.SFINALQUERY;

						//this.cargarCombosSucursalsForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalSucursal=" WHERE " + ConstantesSql.ID + "="+cuentabancopunvenSessionBean.getlidSucursalActual();
					}
				} else {
					finalQueryGlobalSucursal="NONE";
				}


				String finalQueryGlobalBanco="";

				if(((this.bancosForeignKey==null||this.bancosForeignKey.size()<=0) && this.cuentabancopunvenConstantesFunciones.cargarid_bancoCuentaBancoPunVen)
					 || (this.esRecargarFks && this.cuentabancopunvenConstantesFunciones.cargarid_bancoCuentaBancoPunVen)) {

					if(!this.cuentabancopunvenSessionBean.getisBusquedaDesdeForeignKeySesionBanco()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=BancoConstantesFunciones.getArrayColumnasGlobalesBanco(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalBanco=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,BancoConstantesFunciones.TABLENAME);

						finalQueryGlobalBanco=Funciones.GetFinalQueryAppend(finalQueryGlobalBanco, "");
						finalQueryGlobalBanco+=BancoConstantesFunciones.SFINALQUERY;

						//this.cargarCombosBancosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalBanco=" WHERE " + ConstantesSql.ID + "="+cuentabancopunvenSessionBean.getlidBancoActual();
					}
				} else {
					finalQueryGlobalBanco="NONE";
				}


				String finalQueryGlobalCliente="";

				if(((this.clientesForeignKey==null||this.clientesForeignKey.size()<=0) && this.cuentabancopunvenConstantesFunciones.cargarid_clienteCuentaBancoPunVen)
					 || (this.esRecargarFks && this.cuentabancopunvenConstantesFunciones.cargarid_clienteCuentaBancoPunVen)) {

					if(!this.cuentabancopunvenSessionBean.getisBusquedaDesdeForeignKeySesionCliente()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=ClienteConstantesFunciones.getArrayColumnasGlobalesCliente(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalCliente=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,ClienteConstantesFunciones.TABLENAME);

						finalQueryGlobalCliente=Funciones.GetFinalQueryAppend(finalQueryGlobalCliente, "");
						finalQueryGlobalCliente+=ClienteConstantesFunciones.SFINALQUERY;

						//this.cargarCombosClientesForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalCliente=" WHERE " + ConstantesSql.ID + "="+cuentabancopunvenSessionBean.getlidClienteActual();
					}
				} else {
					finalQueryGlobalCliente="NONE";
				}


				String finalQueryGlobalCuentaContable="";

				if(((this.cuentacontablesForeignKey==null||this.cuentacontablesForeignKey.size()<=0) && this.cuentabancopunvenConstantesFunciones.cargarid_cuenta_contableCuentaBancoPunVen)
					 || (this.esRecargarFks && this.cuentabancopunvenConstantesFunciones.cargarid_cuenta_contableCuentaBancoPunVen)) {

					if(!this.cuentabancopunvenSessionBean.getisBusquedaDesdeForeignKeySesionCuentaContable()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();

						this.arrDatoGeneralNo.add("id_modulo");

						arrColumnasGlobales=CuentaContableConstantesFunciones.getArrayColumnasGlobalesCuentaContable(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalCuentaContable=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,CuentaContableConstantesFunciones.TABLENAME);

						finalQueryGlobalCuentaContable=Funciones.GetFinalQueryAppend(finalQueryGlobalCuentaContable, "");
						finalQueryGlobalCuentaContable+=CuentaContableConstantesFunciones.SFINALQUERY;

						//this.cargarCombosCuentaContablesForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalCuentaContable=" WHERE " + ConstantesSql.ID + "="+cuentabancopunvenSessionBean.getlidCuentaContableActual();
					}
				} else {
					finalQueryGlobalCuentaContable="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				cuentabancopunvenReturnGeneral=cuentabancopunvenLogic.cargarCombosLoteForeignKeyCuentaBancoPunVen(finalQueryGlobalEmpresa,finalQueryGlobalSucursal,finalQueryGlobalBanco,finalQueryGlobalCliente,finalQueryGlobalCuentaContable);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=cuentabancopunvenReturnGeneral.getempresasForeignKey();
			}

			if(!finalQueryGlobalSucursal.equals("NONE")) {
				this.sucursalsForeignKey=cuentabancopunvenReturnGeneral.getsucursalsForeignKey();
			}

			if(!finalQueryGlobalBanco.equals("NONE")) {
				this.bancosForeignKey=cuentabancopunvenReturnGeneral.getbancosForeignKey();
			}

			if(!finalQueryGlobalCliente.equals("NONE")) {
				this.clientesForeignKey=cuentabancopunvenReturnGeneral.getclientesForeignKey();
			}

			if(!finalQueryGlobalCuentaContable.equals("NONE")) {
				this.cuentacontablesForeignKey=cuentabancopunvenReturnGeneral.getcuentacontablesForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyCuentaBancoPunVen()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeySucursal();
			this.addItemDefectoCombosForeignKeyBanco();
			this.addItemDefectoCombosForeignKeyCliente();
			this.addItemDefectoCombosForeignKeyCuentaContable();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.cuentabancopunvenSessionBean==null) {
				this.cuentabancopunvenSessionBean=new CuentaBancoPunVenSessionBean();
			}

			if(!this.cuentabancopunvenSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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

			if(!this.cuentabancopunvenSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
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

	public void addItemDefectoCombosForeignKeyBanco()throws Exception {
		try {

			if(!this.cuentabancopunvenSessionBean.getisBusquedaDesdeForeignKeySesionBanco()) {
				Banco banco=new Banco();
				BancoConstantesFunciones.setBancoDescripcion(banco,Constantes.SMENSAJE_ESCOJA_OPCION);
				banco.setId(null);

				if(!BancoConstantesFunciones.ExisteEnLista(this.bancosForeignKey,banco,true)) {

					this.bancosForeignKey.add(0,banco);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyCliente()throws Exception {
		try {

			if(!this.cuentabancopunvenSessionBean.getisBusquedaDesdeForeignKeySesionCliente()) {
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

	public void addItemDefectoCombosForeignKeyCuentaContable()throws Exception {
		try {

			if(!this.cuentabancopunvenSessionBean.getisBusquedaDesdeForeignKeySesionCuentaContable()) {
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
	
	public void initActionsCombosTodosForeignKeyCuentaBancoPunVen()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyCuentaBancoPunVen(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyCuentaBancoPunVen()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
				this.setActualSucursalForeignKey(this.parametroGeneralUsuario.getid_sucursal(),false,"Formulario");
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyCuentaBancoPunVen();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyCuentaBancoPunVen(CuentaBancoPunVen cuentabancopunven)throws Exception {	
		try {
			
			this.setActualBancoForeignKey(cuentabancopunven.getid_banco(),false,"Formulario");
			this.setActualClienteForeignKey(cuentabancopunven.getid_cliente(),false,"Formulario");
			this.setActualCuentaContableForeignKey(cuentabancopunven.getid_cuenta_contable(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyCuentaBancoPunVen(CuentaBancoPunVen cuentabancopunven,String sTipoEvento)throws Exception {	
		try {
			
			

				if(cuentabancopunven.getCliente()!=null && !sTipoEvento.equals("id_clienteCuentaBancoPunVen")) { //sTipoEvento Evita Bucle Infinito

					this.clientesForeignKey=new ArrayList<Cliente>();
					this.clientesForeignKey.add(cuentabancopunven.getCliente());

					this.addItemDefectoCombosForeignKeyCliente();
					this.cargarCombosFrameClientesForeignKey("Todos");
				}
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyCuentaBancoPunVen()throws Exception {	
		try {
			
			this.setActualBancoForeignKey(this.cuentabancopunvenConstantesFunciones.getid_banco(),false,"Formulario");
			this.setActualClienteForeignKey(this.cuentabancopunvenConstantesFunciones.getid_cliente(),false,"Formulario");
			this.setActualCuentaContableForeignKey(this.cuentabancopunvenConstantesFunciones.getid_cuenta_contable(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyCuentaBancoPunVen()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyCuentaBancoPunVen()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyCuentaBancoPunVen()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroCuentaBancoPunVen()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyCuentaBancoPunVen()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameSucursalsForeignKey("Todos");
			this.cargarCombosFrameBancosForeignKey("Todos");
			this.cargarCombosFrameClientesForeignKey("Todos");
			this.cargarCombosFrameCuentaContablesForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyCuentaBancoPunVen(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameSucursalsForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameBancosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameClientesForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameCuentaContablesForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyCuentaBancoPunVen()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormCuentaBancoPunVen.jComboBoxid_empresaCuentaBancoPunVen!=null && this.jInternalFrameDetalleFormCuentaBancoPunVen.jComboBoxid_empresaCuentaBancoPunVen.getItemCount()>0) {
				this.jInternalFrameDetalleFormCuentaBancoPunVen.jComboBoxid_empresaCuentaBancoPunVen.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormCuentaBancoPunVen.jComboBoxid_sucursalCuentaBancoPunVen!=null && this.jInternalFrameDetalleFormCuentaBancoPunVen.jComboBoxid_sucursalCuentaBancoPunVen.getItemCount()>0) {
				this.jInternalFrameDetalleFormCuentaBancoPunVen.jComboBoxid_sucursalCuentaBancoPunVen.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormCuentaBancoPunVen.jComboBoxid_bancoCuentaBancoPunVen!=null && this.jInternalFrameDetalleFormCuentaBancoPunVen.jComboBoxid_bancoCuentaBancoPunVen.getItemCount()>0) {
				this.jInternalFrameDetalleFormCuentaBancoPunVen.jComboBoxid_bancoCuentaBancoPunVen.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormCuentaBancoPunVen.jComboBoxid_clienteCuentaBancoPunVen!=null && this.jInternalFrameDetalleFormCuentaBancoPunVen.jComboBoxid_clienteCuentaBancoPunVen.getItemCount()>0) {
				this.jInternalFrameDetalleFormCuentaBancoPunVen.jComboBoxid_clienteCuentaBancoPunVen.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormCuentaBancoPunVen.jComboBoxid_cuenta_contableCuentaBancoPunVen!=null && this.jInternalFrameDetalleFormCuentaBancoPunVen.jComboBoxid_cuenta_contableCuentaBancoPunVen.getItemCount()>0) {
				this.jInternalFrameDetalleFormCuentaBancoPunVen.jComboBoxid_cuenta_contableCuentaBancoPunVen.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	










	
	

	public CuentaBancoPunVenBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public CuentaBancoPunVenBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public CuentaBancoPunVenBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.cuentabancopunvenSessionBean=new CuentaBancoPunVenSessionBean(); 
		this.cuentabancopunvenConstantesFunciones=new CuentaBancoPunVenConstantesFunciones(); 
		this.cuentabancopunvenBean=new CuentaBancoPunVen();//(this.cuentabancopunvenConstantesFunciones); 		
		this.cuentabancopunvenReturnGeneral=new CuentaBancoPunVenParameterReturnGeneral(); 
		
		this.cuentabancopunvenSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.cuentabancopunvenSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public CuentaBancoPunVenBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public CuentaBancoPunVenBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public CuentaBancoPunVenBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessCuentaBancoPunVen(true);
			
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
			
			this.cuentabancopunvenConstantesFunciones=new CuentaBancoPunVenConstantesFunciones(); 
			this.cuentabancopunvenBean=new CuentaBancoPunVen();//this.cuentabancopunvenConstantesFunciones); 			
			this.cuentabancopunvenReturnGeneral=new CuentaBancoPunVenParameterReturnGeneral(); 
		
			CuentaBancoPunVenBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Cuenta Banco Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.cuentabancopunven=new CuentaBancoPunVen();
			this.cuentabancopunvens = new ArrayList<CuentaBancoPunVen>();
			this.cuentabancopunvensAux = new ArrayList<CuentaBancoPunVen>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentabancopunvenLogic=new CuentaBancoPunVenLogic();
				this.cuentabancopunvenLogic.getNewConnexionToDeep("");
			}
			
			//this.cuentabancopunvenSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.cuentabancopunvenSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormCuentaBancoPunVen);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoCuentaBancoPunVen!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoCuentaBancoPunVen);	
					}
					
					if(this.jInternalFrameImportacionCuentaBancoPunVen!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionCuentaBancoPunVen);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByCuentaBancoPunVen!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByCuentaBancoPunVen);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormCuentaBancoPunVen!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormCuentaBancoPunVen);
				this.jInternalFrameDetalleFormCuentaBancoPunVen.setVisible(false);
				this.jInternalFrameDetalleFormCuentaBancoPunVen.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoCuentaBancoPunVen!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoCuentaBancoPunVen);
					this.jInternalFrameReporteDinamicoCuentaBancoPunVen.setVisible(false);
					this.jInternalFrameReporteDinamicoCuentaBancoPunVen.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionCuentaBancoPunVen!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionCuentaBancoPunVen);
					this.jInternalFrameImportacionCuentaBancoPunVen.setVisible(false);
					this.jInternalFrameImportacionCuentaBancoPunVen.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByCuentaBancoPunVen!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByCuentaBancoPunVen);
					this.jInternalFrameOrderByCuentaBancoPunVen.setVisible(false);
					this.jInternalFrameOrderByCuentaBancoPunVen.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idCuentaBancoPunVenActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=CuentaBancoPunVenConstantesFunciones.INUMEROPAGINACION;
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
			
			this.cuentabancopunvenReturnGeneral=new CuentaBancoPunVenParameterReturnGeneral();
			
			this.cuentabancopunvenParameterGeneral=new CuentaBancoPunVenParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.cuentabancopunvenLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.cuentabancopunvenSessionBean.getEsGuardarRelacionado()) {
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
			
			if(CuentaBancoPunVenJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.cuentabancopunvenSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
				arrPaginas.add(FormaPagoPuntoVentaConstantesFunciones.SNOMBREOPCION);
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,CuentaBancoPunVenConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.cuentabancopunvenSessionBean.getEsGuardarRelacionado(),this.cuentabancopunvenSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,CuentaBancoPunVenConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.cuentabancopunvenSessionBean.getEsGuardarRelacionado(),this.cuentabancopunvenSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoCuentaBancoPunVen=false;
			this.isVisibilidadCeldaDuplicarCuentaBancoPunVen=true;
			this.isVisibilidadCeldaCopiarCuentaBancoPunVen=true;
			this.isVisibilidadCeldaVerFormCuentaBancoPunVen=true;
			this.isVisibilidadCeldaOrdenCuentaBancoPunVen=true;
			this.isVisibilidadCeldaNuevoRelacionesCuentaBancoPunVen=false;
			this.isVisibilidadCeldaModificarCuentaBancoPunVen=false;
			this.isVisibilidadCeldaActualizarCuentaBancoPunVen=false;
			this.isVisibilidadCeldaEliminarCuentaBancoPunVen=false;
			this.isVisibilidadCeldaCancelarCuentaBancoPunVen=false;
			this.isVisibilidadCeldaGuardarCuentaBancoPunVen=false;
			this.isVisibilidadCeldaGuardarCambiosCuentaBancoPunVen=false;
			
			
			this.isVisibilidadFK_IdBanco=true;
			this.isVisibilidadFK_IdCliente=true;
			this.isVisibilidadFK_IdCuentaContable=true;
			this.isVisibilidadFK_IdEmpresa=true;
			this.isVisibilidadFK_IdSucursal=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesCuentaBancoPunVen("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosCuentaBancoPunVen();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioCuentaBancoPunVen(false);
			
			this.setPermisosUsuarioCuentaBancoPunVen();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.cuentabancopunvenSessionBean.getEsGuardarRelacionado() 
				|| (this.cuentabancopunvenSessionBean.getEsGuardarRelacionado() && this.cuentabancopunvenSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioCuentaBancoPunVenClasesRelacionadas();
			}
			
			if(this.cuentabancopunvenSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioCuentaBancoPunVenClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!CuentaBancoPunVenJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosCuentaBancoPunVen();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualCuentaBancoPunVen();
			}
			
			if(!this.isPermisoBusquedaCuentaBancoPunVen) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasCuentaBancoPunVen.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.cuentabancopunvenSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				this.tiposReportes.add(new Reporte("RELACIONES","RELACIONES"));
				this.tiposReportesDinamico.add(new Reporte("RELACIONES","RELACIONES"));
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioCuentaBancoPunVen,this.isPermisoPaginacionMedioCuentaBancoPunVen,this.isPermisoPaginacionTodoCuentaBancoPunVen);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(CuentaBancoPunVenConstantesFunciones.getTiposSeleccionarCuentaBancoPunVen());
				
				this.tiposColumnasSelect=CuentaBancoPunVenConstantesFunciones.getTiposSeleccionarCuentaBancoPunVen(true);
				
				this.tiposRelacionesSelect=new ArrayList<Reporte>();								
				
				this.cargarTiposRelacionesSelectCuentaBancoPunVen();				
				//this.tiposRelacionesSelect=CuentaBancoPunVenConstantesFunciones.getTiposRelacionesCuentaBancoPunVen(true);
				
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
			//if(!this.cuentabancopunvenSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioCuentaBancoPunVen();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,false,true);
				this.setAccionesUsuarioCuentaBancoPunVen(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,false,true);							
				this.setAccionesUsuarioCuentaBancoPunVen(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesCuentaBancoPunVen() ;
			
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
			
			
			this.formapagopuntoventaLogic=new FormaPagoPuntoVentaLogic(); 
			jasperPrint = null;												
			
			//FK
			
			this.empresaLogic=new EmpresaLogic();
			this.sucursalLogic=new SucursalLogic();
			this.bancoLogic=new BancoLogic();
			this.clienteLogic=new ClienteLogic();
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
				cuentabancopunvenImplementable= (CuentaBancoPunVenImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+CuentaBancoPunVenConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				cuentabancopunvenImplementableHome= (CuentaBancoPunVenImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+CuentaBancoPunVenConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.cuentabancopunvens= new ArrayList<CuentaBancoPunVen>();
			this.cuentabancopunvensEliminados= new ArrayList<CuentaBancoPunVen>();
						
			this.isEsNuevoCuentaBancoPunVen=false;
			this.esParaAccionDesdeFormularioCuentaBancoPunVen=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			//BUSQUEDA INTERNA FK
			this.idClienteActual=0L;
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			this.sucursalsForeignKey=new ArrayList<Sucursal>() ;
			this.bancosForeignKey=new ArrayList<Banco>() ;
			this.clientesForeignKey=new ArrayList<Cliente>() ;
			this.cuentacontablesForeignKey=new ArrayList<CuentaContable>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyCuentaBancoPunVen(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroCuentaBancoPunVen();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.cuentabancopunvenSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			CuentaBancoPunVenBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=CuentaBancoPunVenConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesCuentaBancoPunVen("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingCuentaBancoPunVen(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormCuentaBancoPunVen!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioCuentaBancoPunVen();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioCuentaBancoPunVen();
			}
			
			CuentaBancoPunVenBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasCuentaBancoPunVen.getTabCount(); i++) {
					this.jTabbedPaneBusquedasCuentaBancoPunVen.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasCuentaBancoPunVen.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentabancopunvenLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessCuentaBancoPunVen(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga CuentaBancoPunVen: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentabancopunvenLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,CuentaBancoPunVenConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentabancopunvenLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectCuentaBancoPunVen() {
		Reporte reporte=new Reporte();
		
	

		reporte=new Reporte();
		reporte.setsCodigo(FormaPagoPuntoVentaConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(FormaPagoPuntoVentaConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesCuentaBancoPunVen")) {
				iIndex=this.jInternalFrameDetalleFormCuentaBancoPunVen.jTabbedPaneRelacionesCuentaBancoPunVen.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormCuentaBancoPunVen.jTabbedPaneRelacionesCuentaBancoPunVen.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosCuentaBancoPunVen.getSelectedRow();	
				
				

				if(sTitle.equals("Forma Pagoes")) {
					if(!FormaPagoPuntoVentaJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessCuentaBancoPunVen();

						this.cargarParteTabPanelRelacionadaFormaPagoPuntoVenta(iIndex,intSelectedRow);
					}
					
				}
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessCuentaBancoPunVen();	
			}
		}
    }
	
	

	public void cargarParteTabPanelRelacionadaFormaPagoPuntoVenta(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormCuentaBancoPunVen.cargarSessionConBeanSwingJInternalFrameFormaPagoPuntoVenta(false,true,iIndex);
		this.jButtonFormaPagoPuntoVentaActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaFormaPagoPuntoVenta();

		//this.jTabbedPaneRelacionesCuentaBancoPunVen.updateUI();
		//this.jTabbedPaneRelacionesCuentaBancoPunVen.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesCuentaBancoPunVen.setSelectedIndex(iIndex);


	}
	
	public void jButtonRelacionActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
				 if(sTipo.equals("FormaPagoPuntoVenta")) {
				int row=this.jTableDatosCuentaBancoPunVen.getSelectedRow();
				jButtonFormaPagoPuntoVentaActionPerformed(evt,row,true,false,null);
				}
  		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
	
	public void cargarMenuRelaciones() {	
		JMenuItem jmenuItem= new JMenuItem("General");
		String sLabelMenu="";
		
		if(!this.cuentabancopunvenSessionBean.getEsGuardarRelacionado()) {
			for(Reporte reporte:this.tiposRelaciones) {
			

				if(reporte.getsCodigo().equals("Forma Pago")) {

					if(this.isTienePermisosFormaPagoPuntoVenta && this.cuentabancopunvenConstantesFunciones.mostrarFormaPagoPuntoVentaCuentaBancoPunVen && !CuentaBancoPunVenConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Forma Pagoes"+"("+FormaPagoPuntoVentaConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Forma Pagoes");

						if(cuentabancopunvenConstantesFunciones.resaltarFormaPagoPuntoVentaCuentaBancoPunVen!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(cuentabancopunvenConstantesFunciones.resaltarFormaPagoPuntoVentaCuentaBancoPunVen);
						}

						jmenuItem.setEnabled(this.cuentabancopunvenConstantesFunciones.activarFormaPagoPuntoVentaCuentaBancoPunVen);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"FormaPagoPuntoVenta"));

						

						this.jInternalFrameDetalleFormCuentaBancoPunVen.jmenuDetalleCuentaBancoPunVen.add(jmenuItem);

						
					}

					continue;
				}
			}
		}
	}		
	
	public void cargarCombosForeignKeyCuentaBancoPunVen(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyCuentaBancoPunVen(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyCuentaBancoPunVen(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyCuentaBancoPunVenListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyCuentaBancoPunVen();
		
		this.cargarCombosFrameForeignKeyCuentaBancoPunVen();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyCuentaBancoPunVen();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyCuentaBancoPunVen();
		}
	}
	
	

	public void cargarCombosForeignKeyBanco(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyBancoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyBanco();
				this.cargarCombosFrameBancosForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaBanco(this.bancosForeignKey);

		} catch(Exception e) {
			throw e;
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
	
	public void jButtonNuevoCuentaBancoPunVenActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.cuentabancopunvenSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormCuentaBancoPunVen==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			CuentaBancoPunVenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.cuentabancopunven,new Object(),this.cuentabancopunvenParameterGeneral,this.cuentabancopunvenReturnGeneral);
			
			
			if(jTableDatosCuentaBancoPunVen.getRowCount()>=1) {
				jTableDatosCuentaBancoPunVen.removeRowSelectionInterval(0, jTableDatosCuentaBancoPunVen.getRowCount()-1);						
			}
			
			this.isEsNuevoCuentaBancoPunVen=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoCuentaBancoPunVen(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesCuentaBancoPunVen(true);			
			//this.cuentabancopunven=new CuentaBancoPunVen();
			//this.cuentabancopunven.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesCuentaBancoPunVen(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualCuentaBancoPunVen() ;
			
			if(CuentaBancoPunVenJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleCuentaBancoPunVen(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.cuentabancopunven);	
			this.actualizarInformacion("INFO_PADRE",false,this.cuentabancopunven);				
			
			CuentaBancoPunVenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.cuentabancopunven,new Object(),this.cuentabancopunvenParameterGeneral,this.cuentabancopunvenReturnGeneral);
			
			if(this.cuentabancopunvenSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar CuentaBancoPunVen: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			CuentaBancoPunVenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.cuentabancopunven,new Object(),this.cuentabancopunvenParameterGeneral,this.cuentabancopunvenReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,CuentaBancoPunVenConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarCuentaBancoPunVenActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<CuentaBancoPunVen> cuentabancopunvensSeleccionados=new ArrayList<CuentaBancoPunVen>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosCuentaBancoPunVen.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosCuentaBancoPunVen.getSelectedRows().length;			
			}
			
			cuentabancopunvensSeleccionados=this.getCuentaBancoPunVensSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoCuentaBancoPunVen--;			
				//CuentaBancoPunVen cuentabancopunvenAux= new CuentaBancoPunVen();			
				//cuentabancopunvenAux.setId(this.iIdNuevoCuentaBancoPunVen);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//CuentaBancoPunVen cuentabancopunvenOrigen=new CuentaBancoPunVen();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(CuentaBancoPunVen cuentabancopunvenOrigen : cuentabancopunvensSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosCuentaBancoPunVen.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							cuentabancopunvenOrigen =(CuentaBancoPunVen) this.cuentabancopunvenLogic.getCuentaBancoPunVens().toArray()[this.jTableDatosCuentaBancoPunVen.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							cuentabancopunvenOrigen =(CuentaBancoPunVen) this.cuentabancopunvens.toArray()[this.jTableDatosCuentaBancoPunVen.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaCuentaBancoPunVen();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.cuentabancopunven.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosCuentaBancoPunVen(cuentabancopunvenOrigen,this.cuentabancopunven,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysCuentaBancoPunVen(this.cuentabancopunven);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.cuentabancopunvenLogic.getCuentaBancoPunVens().add(this.cuentabancopunvenAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.cuentabancopunvens.add(this.cuentabancopunvenAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaCuentaBancoPunVen(false);
				
				this.jTableDatosCuentaBancoPunVen.setRowSelectionInterval(this.getIndiceNuevoCuentaBancoPunVen(), this.getIndiceNuevoCuentaBancoPunVen());
				
				int iLastRow =  this.jTableDatosCuentaBancoPunVen.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosCuentaBancoPunVen.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosCuentaBancoPunVen.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaCuentaBancoPunVen(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,CuentaBancoPunVenConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarCuentaBancoPunVenActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<CuentaBancoPunVen> cuentabancopunvensSeleccionados=new ArrayList<CuentaBancoPunVen>();									
		
			CuentaBancoPunVen cuentabancopunvenOrigen=new CuentaBancoPunVen();
			CuentaBancoPunVen cuentabancopunvenDestino=new CuentaBancoPunVen();
				
			cuentabancopunvensSeleccionados=this.getCuentaBancoPunVensSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosCuentaBancoPunVen.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || cuentabancopunvensSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosCuentaBancoPunVen.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						cuentabancopunvenOrigen =(CuentaBancoPunVen) this.cuentabancopunvenLogic.getCuentaBancoPunVens().toArray()[this.jTableDatosCuentaBancoPunVen.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						cuentabancopunvenOrigen =(CuentaBancoPunVen) this.cuentabancopunvens.toArray()[this.jTableDatosCuentaBancoPunVen.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						cuentabancopunvenDestino =(CuentaBancoPunVen) this.cuentabancopunvenLogic.getCuentaBancoPunVens().toArray()[this.jTableDatosCuentaBancoPunVen.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						cuentabancopunvenDestino =(CuentaBancoPunVen) this.cuentabancopunvens.toArray()[this.jTableDatosCuentaBancoPunVen.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				cuentabancopunvenOrigen =cuentabancopunvensSeleccionados.get(0);
				cuentabancopunvenDestino =cuentabancopunvensSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosCuentaBancoPunVen(cuentabancopunvenOrigen,cuentabancopunvenDestino,true,false);
				
				cuentabancopunvenDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(cuentabancopunvenDestino,cuentabancopunvenLogic.getCuentaBancoPunVens());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(cuentabancopunvenDestino,cuentabancopunvens);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaCuentaBancoPunVen(false);
				
				//this.jTableDatosCuentaBancoPunVen.setRowSelectionInterval(this.getIndiceNuevoCuentaBancoPunVen(), this.getIndiceNuevoCuentaBancoPunVen());
				
				int iLastRow =  this.jTableDatosCuentaBancoPunVen.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosCuentaBancoPunVen.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosCuentaBancoPunVen.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaCuentaBancoPunVen(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CuentaBancoPunVenConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormCuentaBancoPunVenActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormCuentaBancoPunVen==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormCuentaBancoPunVen.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CuentaBancoPunVenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarCuentaBancoPunVenActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesCuentaBancoPunVen.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasCuentaBancoPunVen.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesCuentaBancoPunVen.setVisible(!isVisible);
			this.jPanelPaginacionCuentaBancoPunVen.setVisible(!isVisible);
			this.jPanelAccionesCuentaBancoPunVen.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CuentaBancoPunVenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarCuentaBancoPunVenActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameCuentaBancoPunVen();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CuentaBancoPunVenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoCuentaBancoPunVenActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoCuentaBancoPunVen();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CuentaBancoPunVenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionCuentaBancoPunVenActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionCuentaBancoPunVen();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CuentaBancoPunVenConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByCuentaBancoPunVenActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByCuentaBancoPunVen();
			
			this.abrirFrameOrderByCuentaBancoPunVen();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CuentaBancoPunVenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByCuentaBancoPunVenActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByCuentaBancoPunVen();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CuentaBancoPunVenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleCuentaBancoPunVen(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormCuentaBancoPunVen);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormCuentaBancoPunVen.isMaximum()) {
					this.jInternalFrameDetalleFormCuentaBancoPunVen.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormCuentaBancoPunVen.setSize(this.jInternalFrameDetalleFormCuentaBancoPunVen.iWidthFormulario,this.jInternalFrameDetalleFormCuentaBancoPunVen.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormCuentaBancoPunVen.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormCuentaBancoPunVen.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormCuentaBancoPunVen.isMaximum()) {
						this.jInternalFrameDetalleFormCuentaBancoPunVen.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormCuentaBancoPunVen.jContentPaneDetalleCuentaBancoPunVen.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormCuentaBancoPunVen.jTabbedPaneRelacionesCuentaBancoPunVen.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormCuentaBancoPunVen.jContentPaneDetalleCuentaBancoPunVen.getWidth(),CuentaBancoPunVenConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormCuentaBancoPunVen.jTabbedPaneRelacionesCuentaBancoPunVen.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormCuentaBancoPunVen.jContentPaneDetalleCuentaBancoPunVen.getWidth(),CuentaBancoPunVenConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormCuentaBancoPunVen.jTabbedPaneRelacionesCuentaBancoPunVen.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormCuentaBancoPunVen.jContentPaneDetalleCuentaBancoPunVen.getWidth(),CuentaBancoPunVenConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					

					if(FormaPagoPuntoVentaJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaFormaPagoPuntoVenta();
					}
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormCuentaBancoPunVen.setVisible(true);
	        this.jInternalFrameDetalleFormCuentaBancoPunVen.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CuentaBancoPunVenConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByCuentaBancoPunVen() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByCuentaBancoPunVen==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByCuentaBancoPunVen=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByCuentaBancoPunVen,false,this);
				} else {
					this.jInternalFrameOrderByCuentaBancoPunVen=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByCuentaBancoPunVen,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByCuentaBancoPunVen);
				this.jInternalFrameOrderByCuentaBancoPunVen.setVisible(false);
				this.jInternalFrameOrderByCuentaBancoPunVen.setSelected(false);
				
				this.jInternalFrameOrderByCuentaBancoPunVen.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByCuentaBancoPunVen"));
				
				this.inicializarActualizarBindingTablaOrderByCuentaBancoPunVen();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionCuentaBancoPunVen() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionCuentaBancoPunVen==null) {
				
				this.jInternalFrameImportacionCuentaBancoPunVen=new ImportacionJInternalFrame(CuentaBancoPunVenConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionCuentaBancoPunVen);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionCuentaBancoPunVen);
				this.jInternalFrameImportacionCuentaBancoPunVen.setVisible(false);
				this.jInternalFrameImportacionCuentaBancoPunVen.setSelected(false);


				this.jInternalFrameImportacionCuentaBancoPunVen.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionCuentaBancoPunVen"));
				this.jInternalFrameImportacionCuentaBancoPunVen.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionCuentaBancoPunVen"));
				this.jInternalFrameImportacionCuentaBancoPunVen.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionCuentaBancoPunVen"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoCuentaBancoPunVen() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoCuentaBancoPunVen==null) {
				this.jInternalFrameReporteDinamicoCuentaBancoPunVen=new ReporteDinamicoJInternalFrame(CuentaBancoPunVenConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoCuentaBancoPunVen);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoCuentaBancoPunVen);
				this.jInternalFrameReporteDinamicoCuentaBancoPunVen.setVisible(false);
				this.jInternalFrameReporteDinamicoCuentaBancoPunVen.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoCuentaBancoPunVen.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoCuentaBancoPunVen"));
				this.jInternalFrameReporteDinamicoCuentaBancoPunVen.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoCuentaBancoPunVen"));
				this.jInternalFrameReporteDinamicoCuentaBancoPunVen.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoCuentaBancoPunVen"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualCuentaBancoPunVen();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		

	public void redimensionarTablaPanelRelacionadaFormaPagoPuntoVenta() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormCuentaBancoPunVen.formapagopuntoventaBeanSwingJInternalFrame.jScrollPanelDatosFormaPagoPuntoVenta.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormCuentaBancoPunVen.jContentPaneDetalleCuentaBancoPunVen.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormCuentaBancoPunVen.formapagopuntoventaBeanSwingJInternalFrame.jScrollPanelDatosFormaPagoPuntoVenta.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormCuentaBancoPunVen.formapagopuntoventaBeanSwingJInternalFrame.jScrollPanelDatosFormaPagoPuntoVenta.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormCuentaBancoPunVen.formapagopuntoventaBeanSwingJInternalFrame.jScrollPanelDatosFormaPagoPuntoVenta.setPreferredSize(dimension);


	}
					
	public void cerrarFrameDetalleCuentaBancoPunVen() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormCuentaBancoPunVen);
			
	       	this.jInternalFrameDetalleFormCuentaBancoPunVen.setVisible(false);
	        this.jInternalFrameDetalleFormCuentaBancoPunVen.setSelected(false);
			
			//this.jInternalFrameDetalleFormCuentaBancoPunVen.dispose();
			//this.jInternalFrameDetalleFormCuentaBancoPunVen=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CuentaBancoPunVenConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoCuentaBancoPunVen() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoCuentaBancoPunVen.setVisible(true);
	        this.jInternalFrameReporteDinamicoCuentaBancoPunVen.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CuentaBancoPunVenConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionCuentaBancoPunVen() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionCuentaBancoPunVen.setVisible(true);
	        this.jInternalFrameImportacionCuentaBancoPunVen.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CuentaBancoPunVenConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByCuentaBancoPunVen() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByCuentaBancoPunVen.setVisible(true);
	        this.jInternalFrameOrderByCuentaBancoPunVen.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CuentaBancoPunVenConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByCuentaBancoPunVen() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByCuentaBancoPunVen.setVisible(false);
	        this.jInternalFrameOrderByCuentaBancoPunVen.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CuentaBancoPunVenConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoCuentaBancoPunVen() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoCuentaBancoPunVen.setVisible(false);
	        this.jInternalFrameReporteDinamicoCuentaBancoPunVen.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CuentaBancoPunVenConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionCuentaBancoPunVen() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionCuentaBancoPunVen.setVisible(false);
	        this.jInternalFrameImportacionCuentaBancoPunVen.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CuentaBancoPunVenConstantesFunciones.CLASSNAME);
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
						TitledBorder titledBorderCuentaBancoPunVen=(TitledBorder)this.jScrollPanelDatosCuentaBancoPunVen.getBorder();
						TitledBorder titledBorderCuentaContable=(TitledBorder)cuentacontableBeanSwingJInternalFrame.jScrollPanelDatosCuentaContable.getBorder();

						titledBorderCuentaContable.setTitle(titledBorderCuentaBancoPunVen.getTitle() + " -> Cuenta Contable");


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
	
	public void jButtonModificarCuentaBancoPunVenActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarCuentaBancoPunVen(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CuentaBancoPunVenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarCuentaBancoPunVen(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosCuentaBancoPunVen.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesCuentaBancoPunVen(true);
			//this.isEsNuevoCuentaBancoPunVen=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentabancopunven =(CuentaBancoPunVen) this.cuentabancopunvenLogic.getCuentaBancoPunVens().toArray()[this.jTableDatosCuentaBancoPunVen.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.cuentabancopunven =(CuentaBancoPunVen) this.cuentabancopunvens.toArray()[this.jTableDatosCuentaBancoPunVen.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesCuentaBancoPunVen("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesCuentaBancoPunVen(false) ;
			
			if(cuentabancopunvenSessionBean.getConGuardarRelaciones()) {
			

				if(this.jInternalFrameDetalleFormCuentaBancoPunVen.formapagopuntoventaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormCuentaBancoPunVen.formapagopuntoventaBeanSwingJInternalFrame.formapagopuntoventaSessionBean.getEsGuardarRelacionado() && FormaPagoPuntoVentaJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonFormaPagoPuntoVentaActionPerformed(null,intSelectedRow,false,true,null);
				}
			}
			
			if(CuentaBancoPunVenJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleCuentaBancoPunVen(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualCuentaBancoPunVen(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CuentaBancoPunVenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaCuentaBancoPunVenActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosCuentaBancoPunVen.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuentabancopunven =(CuentaBancoPunVen) this.cuentabancopunvenLogic.getCuentaBancoPunVens().toArray()[this.jTableDatosCuentaBancoPunVen.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.cuentabancopunven =(CuentaBancoPunVen) this.cuentabancopunvens.toArray()[this.jTableDatosCuentaBancoPunVen.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CuentaBancoPunVenConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarCuentaBancoPunVen(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormCuentaBancoPunVen==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosCuentaBancoPunVen.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesCuentaBancoPunVen(true);
			//this.isEsNuevoCuentaBancoPunVen=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentabancopunven =(CuentaBancoPunVen) this.cuentabancopunvenLogic.getCuentaBancoPunVens().toArray()[this.jTableDatosCuentaBancoPunVen.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.cuentabancopunven =(CuentaBancoPunVen) this.cuentabancopunvens.toArray()[this.jTableDatosCuentaBancoPunVen.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.cuentabancopunven.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesCuentaBancoPunVen("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesCuentaBancoPunVen(false) ;
			
			if(CuentaBancoPunVenJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleCuentaBancoPunVen(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualCuentaBancoPunVen(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CuentaBancoPunVenConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
			
			if(sType.equals("Cliente")) {
				if(!this.cuentabancopunvenConstantesFunciones.cargarid_clienteCuentaBancoPunVen) {
					this.cargarCombosClientesForeignKeyLista(" where id="+id);
					//this.inicializarActualizarBindingCuentaBancoPunVen(false,false);
					this.cargarCombosFrameClientesForeignKey("Todos");
				}

				this.setCombosCodigoDesdeBusquedaid_cliente (id);

				this.recargarComboTablaCliente(this.clientesForeignKey);

			}
		} catch(Exception e) {
			throw e;
		}
	}
	
			
	
	public void recargarComboTablaBanco(List<Banco> bancosForeignKey)throws Exception{
		TableColumn tableColumnBanco=this.jTableDatosCuentaBancoPunVen.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCuentaBancoPunVen,CuentaBancoPunVenConstantesFunciones.LABEL_IDBANCO));
		TableCellEditor tableCellEditorBanco =tableColumnBanco.getCellEditor();

		BancoTableCell bancoTableCellFk=(BancoTableCell)tableCellEditorBanco;

		if(bancoTableCellFk!=null) {
			bancoTableCellFk.setbancosForeignKey(bancosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosCuentaBancoPunVen.getSelectedRow();

		//if(intSelectedRow<=0) {
			//bancoTableCellFk.setRowActual(intSelectedRow);
			//bancoTableCellFk.setbancosForeignKeyActual(bancosForeignKey);
		//}


		if(bancoTableCellFk!=null) {
			bancoTableCellFk.RecargarBancosForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaCliente(List<Cliente> clientesForeignKey)throws Exception{
		TableColumn tableColumnCliente=this.jTableDatosCuentaBancoPunVen.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCuentaBancoPunVen,CuentaBancoPunVenConstantesFunciones.LABEL_IDCLIENTE));
		TableCellEditor tableCellEditorCliente =tableColumnCliente.getCellEditor();

		ClienteTableCell clienteTableCellFk=(ClienteTableCell)tableCellEditorCliente;

		if(clienteTableCellFk!=null) {
			clienteTableCellFk.setclientesForeignKey(clientesForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosCuentaBancoPunVen.getSelectedRow();

		//if(intSelectedRow<=0) {
			//clienteTableCellFk.setRowActual(intSelectedRow);
			//clienteTableCellFk.setclientesForeignKeyActual(clientesForeignKey);
		//}


		if(clienteTableCellFk!=null) {
			clienteTableCellFk.RecargarClientesForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaCuentaContable(List<CuentaContable> cuentacontablesForeignKey)throws Exception{
		TableColumn tableColumnCuentaContable=this.jTableDatosCuentaBancoPunVen.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCuentaBancoPunVen,CuentaBancoPunVenConstantesFunciones.LABEL_IDCUENTACONTABLE));
		TableCellEditor tableCellEditorCuentaContable =tableColumnCuentaContable.getCellEditor();

		CuentaContableTableCell cuentacontableTableCellFk=(CuentaContableTableCell)tableCellEditorCuentaContable;

		if(cuentacontableTableCellFk!=null) {
			cuentacontableTableCellFk.setcuentacontablesForeignKey(cuentacontablesForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosCuentaBancoPunVen.getSelectedRow();

		//if(intSelectedRow<=0) {
			//cuentacontableTableCellFk.setRowActual(intSelectedRow);
			//cuentacontableTableCellFk.setcuentacontablesForeignKeyActual(cuentacontablesForeignKey);
		//}


		if(cuentacontableTableCellFk!=null) {
			cuentacontableTableCellFk.RecargarCuentaContablesForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	

	public void setCombosCodigoDesdeBusquedaid_cliente (Long id) throws Exception {
		this.setActualClienteForeignKey(id,true,"Todos");

	};
	
	public void jButtonActualizarCuentaBancoPunVenActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentabancopunvenLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesCuentaBancoPunVen(false);
			
			//if(!this.isEsNuevoCuentaBancoPunVen) {								
				int intSelectedRow = this.jTableDatosCuentaBancoPunVen.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuentabancopunven =(CuentaBancoPunVen) this.cuentabancopunvenLogic.getCuentaBancoPunVens().toArray()[this.jTableDatosCuentaBancoPunVen.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.cuentabancopunven =(CuentaBancoPunVen) this.cuentabancopunvens.toArray()[this.jTableDatosCuentaBancoPunVen.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(CuentaBancoPunVenJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualCuentaBancoPunVen(this.cuentabancopunven,true);
				this.setVariablesFormularioToObjetoActualForeignKeysCuentaBancoPunVen(this.cuentabancopunven);
				
			}
			
			if(this.permiteMantenimiento(this.cuentabancopunven)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.cuentabancopunvenSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoCuentaBancoPunVen=true;
					this.inicializarActualizarBindingTablaCuentaBancoPunVen(false);
					this.isEsNuevoCuentaBancoPunVen=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoCuentaBancoPunVen=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoCuentaBancoPunVen=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesCuentaBancoPunVen(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualCuentaBancoPunVen(false);
				
				this.habilitarDeshabilitarControlesCuentaBancoPunVen(false);
			
												
				
				if(CuentaBancoPunVenJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleCuentaBancoPunVen();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoCuentaBancoPunVenActionPerformed(evt,cuentabancopunvenSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualCuentaBancoPunVen(this.cuentabancopunven,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosCuentaBancoPunVen.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,cuentabancopunvenSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentabancopunvenLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.cuentabancopunven.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(CuentaBancoPunVen.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CuentaBancoPunVen.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentabancopunvenLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,CuentaBancoPunVenConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentabancopunvenLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarCuentaBancoPunVenActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentabancopunvenLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosCuentaBancoPunVen.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentabancopunven =(CuentaBancoPunVen) this.cuentabancopunvenLogic.getCuentaBancoPunVens().toArray()[this.jTableDatosCuentaBancoPunVen.convertRowIndexToModel(intSelectedRow)];
				this.cuentabancopunven.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.cuentabancopunven =(CuentaBancoPunVen) this.cuentabancopunvens.toArray()[this.jTableDatosCuentaBancoPunVen.convertRowIndexToModel(intSelectedRow)];
				this.cuentabancopunven.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.cuentabancopunven)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.cuentabancopunvenSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((CuentaBancoPunVenModel) this.jTableDatosCuentaBancoPunVen.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoCuentaBancoPunVen=true;
				this.inicializarActualizarBindingTablaCuentaBancoPunVen(false);
				this.isEsNuevoCuentaBancoPunVen=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesCuentaBancoPunVen(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualCuentaBancoPunVen(false);
				
				this.habilitarDeshabilitarControlesCuentaBancoPunVen(false);
				
				
				
				if(CuentaBancoPunVenJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleCuentaBancoPunVen();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentabancopunvenLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentabancopunvenLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CuentaBancoPunVenConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentabancopunvenLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarCuentaBancoPunVenActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosCuentaBancoPunVen.getRowCount()>=1) {
				jTableDatosCuentaBancoPunVen.removeRowSelectionInterval(0, jTableDatosCuentaBancoPunVen.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesCuentaBancoPunVen(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaCuentaBancoPunVen(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesCuentaBancoPunVen(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualCuentaBancoPunVen(false) ;
			
			this.isEsNuevoCuentaBancoPunVen=false;
			
			if(CuentaBancoPunVenJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleCuentaBancoPunVen();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CuentaBancoPunVenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosCuentaBancoPunVenActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentabancopunvenLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingCuentaBancoPunVen(false);
				
				//SI ES MANUAL
				if(CuentaBancoPunVenJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualCuentaBancoPunVen();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentabancopunvenLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentabancopunvenLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CuentaBancoPunVenConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentabancopunvenLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosCuentaBancoPunVenActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoCuentaBancoPunVen--;			
			//CuentaBancoPunVen cuentabancopunvenAux= new CuentaBancoPunVen();			
			//cuentabancopunvenAux.setId(this.iIdNuevoCuentaBancoPunVen);
			
			if(this.jInternalFrameDetalleFormCuentaBancoPunVen==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaCuentaBancoPunVen();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysCuentaBancoPunVen(this.cuentabancopunven);
			
			this.cuentabancopunven.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.cuentabancopunvenLogic.getCuentaBancoPunVens().add(this.cuentabancopunvenAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.cuentabancopunvens.add(this.cuentabancopunvenAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaCuentaBancoPunVen(false);
			
			this.jTableDatosCuentaBancoPunVen.setRowSelectionInterval(this.getIndiceNuevoCuentaBancoPunVen(), this.getIndiceNuevoCuentaBancoPunVen());
			
			int iLastRow =  this.jTableDatosCuentaBancoPunVen.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosCuentaBancoPunVen.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosCuentaBancoPunVen.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaCuentaBancoPunVen(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,CuentaBancoPunVenConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionCuentaBancoPunVenActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentabancopunvenLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingCuentaBancoPunVen(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingCuentaBancoPunVen(false);
			
			//SI ES MANUAL
			if(CuentaBancoPunVenJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualCuentaBancoPunVen();
			}
			
			//this.abrirFrameTreeCuentaBancoPunVen();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentabancopunvenLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentabancopunvenLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,CuentaBancoPunVenConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentabancopunvenLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionCuentaBancoPunVenActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Cuenta BancoES ?", "MANTENIMIENTO DE Cuenta Banco", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionCuentaBancoPunVen.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralCuentaBancoPunVen();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.cuentabancopunvenReturnGeneral=cuentabancopunvenLogic.procesarImportacionCuentaBancoPunVensWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.cuentabancopunvenParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarCuentaBancoPunVenReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CuentaBancoPunVenConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionCuentaBancoPunVenActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionCuentaBancoPunVen.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionCuentaBancoPunVen.setFileImportacion(this.jInternalFrameImportacionCuentaBancoPunVen.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionCuentaBancoPunVen.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionCuentaBancoPunVen.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionCuentaBancoPunVen.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionCuentaBancoPunVen.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CuentaBancoPunVenConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoCuentaBancoPunVenActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<CuentaBancoPunVen> cuentabancopunvensSeleccionados=new ArrayList<CuentaBancoPunVen>();		

		cuentabancopunvensSeleccionados=this.getCuentaBancoPunVensSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoCuentaBancoPunVen.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoCuentaBancoPunVen.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("CuentaBancoPunVenBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"CuentaBancoPunVenBaseDesign.jrxml";
			
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
			
			this.generarReporteCuentaBancoPunVens("Todos",cuentabancopunvensSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cuentabancopunvenSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Cuenta Banco",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CuentaBancoPunVenConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoCuentaBancoPunVen.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoCuentaBancoPunVen.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case CuentaBancoPunVenConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CuentaBancoPunVenConstantesFunciones.LABEL_IDSUCURSAL:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Sucursal_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Sucursal_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Sucursal_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Sucursal_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CuentaBancoPunVenConstantesFunciones.LABEL_IDBANCO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Banco_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Banco_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Banco_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Banco_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CuentaBancoPunVenConstantesFunciones.LABEL_IDCLIENTE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Cliente_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Cliente_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Cliente_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Cliente_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CuentaBancoPunVenConstantesFunciones.LABEL_IDCUENTACONTABLE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_CuentaContable_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_CuentaContable_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_CuentaContable_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_CuentaContable_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CuentaBancoPunVenConstantesFunciones.LABEL_CODIGO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CuentaBancoPunVenConstantesFunciones.LABEL_NOMBRE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbre_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbre_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbre_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbre_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoCuentaBancoPunVen.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoCuentaBancoPunVen.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoCuentaBancoPunVen.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case CuentaBancoPunVenConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case CuentaBancoPunVenConstantesFunciones.LABEL_IDSUCURSAL:
					sNombreCampoCategoria="id_sucursal";
					break;

				case CuentaBancoPunVenConstantesFunciones.LABEL_IDBANCO:
					sNombreCampoCategoria="id_banco";
					break;

				case CuentaBancoPunVenConstantesFunciones.LABEL_IDCLIENTE:
					sNombreCampoCategoria="id_cliente";
					break;

				case CuentaBancoPunVenConstantesFunciones.LABEL_IDCUENTACONTABLE:
					sNombreCampoCategoria="id_cuenta_contable";
					break;

				case CuentaBancoPunVenConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoria="codigo";
					break;

				case CuentaBancoPunVenConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoCuentaBancoPunVen.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case CuentaBancoPunVenConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case CuentaBancoPunVenConstantesFunciones.LABEL_IDSUCURSAL:
					sNombreCampoCategoriaValor="id_sucursal";
					break;

				case CuentaBancoPunVenConstantesFunciones.LABEL_IDBANCO:
					sNombreCampoCategoriaValor="id_banco";
					break;

				case CuentaBancoPunVenConstantesFunciones.LABEL_IDCLIENTE:
					sNombreCampoCategoriaValor="id_cliente";
					break;

				case CuentaBancoPunVenConstantesFunciones.LABEL_IDCUENTACONTABLE:
					sNombreCampoCategoriaValor="id_cuenta_contable";
					break;

				case CuentaBancoPunVenConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoriaValor="codigo";
					break;

				case CuentaBancoPunVenConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoCuentaBancoPunVen.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoCuentaBancoPunVen.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case CuentaBancoPunVenConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case CuentaBancoPunVenConstantesFunciones.LABEL_IDSUCURSAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Sucursal",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_sucursal");
					break;

				case CuentaBancoPunVenConstantesFunciones.LABEL_IDBANCO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Banco",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_banco");
					break;

				case CuentaBancoPunVenConstantesFunciones.LABEL_IDCLIENTE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Cliente",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_cliente");
					break;

				case CuentaBancoPunVenConstantesFunciones.LABEL_IDCUENTACONTABLE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Cuenta Contable",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_cuenta_contable");
					break;

				case CuentaBancoPunVenConstantesFunciones.LABEL_CODIGO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo");
					break;

				case CuentaBancoPunVenConstantesFunciones.LABEL_NOMBRE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre");
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
	
	public void jButtonGenerarExcelReporteDinamicoCuentaBancoPunVenActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<CuentaBancoPunVen> cuentabancopunvensSeleccionados=new ArrayList<CuentaBancoPunVen>();		
		
		cuentabancopunvensSeleccionados=this.getCuentaBancoPunVensSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"cuentabancopunven";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("CuentaBancoPunVens");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoCuentaBancoPunVen.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoCuentaBancoPunVen.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case CuentaBancoPunVenConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CuentaBancoPunVenConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(CuentaBancoPunVen cuentabancopunven:cuentabancopunvensSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cuentabancopunven.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CuentaBancoPunVenConstantesFunciones.LABEL_IDSUCURSAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CuentaBancoPunVenConstantesFunciones.LABEL_IDSUCURSAL);
					iRow++;

					for(CuentaBancoPunVen cuentabancopunven:cuentabancopunvensSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cuentabancopunven.getsucursal_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CuentaBancoPunVenConstantesFunciones.LABEL_IDBANCO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CuentaBancoPunVenConstantesFunciones.LABEL_IDBANCO);
					iRow++;

					for(CuentaBancoPunVen cuentabancopunven:cuentabancopunvensSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cuentabancopunven.getbanco_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CuentaBancoPunVenConstantesFunciones.LABEL_IDCLIENTE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CuentaBancoPunVenConstantesFunciones.LABEL_IDCLIENTE);
					iRow++;

					for(CuentaBancoPunVen cuentabancopunven:cuentabancopunvensSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cuentabancopunven.getcliente_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CuentaBancoPunVenConstantesFunciones.LABEL_IDCUENTACONTABLE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CuentaBancoPunVenConstantesFunciones.LABEL_IDCUENTACONTABLE);
					iRow++;

					for(CuentaBancoPunVen cuentabancopunven:cuentabancopunvensSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cuentabancopunven.getcuentacontable_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CuentaBancoPunVenConstantesFunciones.LABEL_CODIGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CuentaBancoPunVenConstantesFunciones.LABEL_CODIGO);
					iRow++;

					for(CuentaBancoPunVen cuentabancopunven:cuentabancopunvensSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cuentabancopunven.getcodigo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CuentaBancoPunVenConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CuentaBancoPunVenConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(CuentaBancoPunVen cuentabancopunven:cuentabancopunvensSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cuentabancopunven.getnombre());
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
			//	this.getFilaCabeceraExportarExcelCuentaBancoPunVen(row);				
			//	iRow++;
			//}				
			
			//for(CuentaBancoPunVen cuentabancopunvenAux:cuentabancopunvensSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelCuentaBancoPunVen(cuentabancopunvenAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cuentabancopunvenSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Cuenta Banco",JOptionPane.INFORMATION_MESSAGE);
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
				this.cuentabancopunvenLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingCuentaBancoPunVen(false);
			
			//SI ES MANUAL
			if(CuentaBancoPunVenJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualCuentaBancoPunVen();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentabancopunvenLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentabancopunvenLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentabancopunvenLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresCuentaBancoPunVenActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentabancopunvenLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingCuentaBancoPunVen(false);
			
			//SI ES MANUAL
			if(CuentaBancoPunVenJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualCuentaBancoPunVen();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentabancopunvenLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentabancopunvenLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,CuentaBancoPunVenConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentabancopunvenLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesCuentaBancoPunVenActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentabancopunvenLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingCuentaBancoPunVen(false);
			
			//SI ES MANUAL
			if(CuentaBancoPunVenJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualCuentaBancoPunVen();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentabancopunvenLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentabancopunvenLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,CuentaBancoPunVenConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentabancopunvenLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaCuentaBancoPunVen() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosCuentaBancoPunVen.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosCuentaBancoPunVen.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosCuentaBancoPunVen.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosCuentaBancoPunVen.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosCuentaBancoPunVen.setMinimumSize(dimensionMinimum);
		this.jTableDatosCuentaBancoPunVen.setMaximumSize(dimensionMaximum);
		this.jTableDatosCuentaBancoPunVen.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingCuentaBancoPunVen(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingCuentaBancoPunVen(esInicializar,true);
	}
	
	public void inicializarActualizarBindingCuentaBancoPunVen(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaCuentaBancoPunVen(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesCuentaBancoPunVen(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.cuentabancopunvenSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasCuentaBancoPunVen(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesCuentaBancoPunVen(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesCuentaBancoPunVen(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !CuentaBancoPunVenJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!CuentaBancoPunVenJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualCuentaBancoPunVen() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaCuentaBancoPunVen();
		
		this.inicializarActualizarBindingBotonesManualCuentaBancoPunVen(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.cuentabancopunvenSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualCuentaBancoPunVen();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesCuentaBancoPunVen() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualCuentaBancoPunVen(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualCuentaBancoPunVen(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosCuentaBancoPunVen.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosCuentaBancoPunVen.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteCuentaBancoPunVen.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormCuentaBancoPunVen!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormCuentaBancoPunVen.jCheckBoxPostAccionNuevoCuentaBancoPunVen.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormCuentaBancoPunVen.jCheckBoxPostAccionSinCerrarCuentaBancoPunVen.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormCuentaBancoPunVen.jCheckBoxPostAccionSinMensajeCuentaBancoPunVen.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosCuentaBancoPunVen.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosCuentaBancoPunVen.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteCuentaBancoPunVen.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormCuentaBancoPunVen!=null) {
				this.jInternalFrameDetalleFormCuentaBancoPunVen.jCheckBoxPostAccionNuevoCuentaBancoPunVen.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormCuentaBancoPunVen.jCheckBoxPostAccionSinCerrarCuentaBancoPunVen.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormCuentaBancoPunVen.jCheckBoxPostAccionSinMensajeCuentaBancoPunVen.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionCuentaBancoPunVen.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionCuentaBancoPunVen.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormCuentaBancoPunVen!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormCuentaBancoPunVen.jComboBoxTiposAccionesFormularioCuentaBancoPunVen.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesCuentaBancoPunVen.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoCuentaBancoPunVen!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoCuentaBancoPunVen.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesCuentaBancoPunVen.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesCuentaBancoPunVen.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarCuentaBancoPunVen.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesCuentaBancoPunVen.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoCuentaBancoPunVen!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoCuentaBancoPunVen.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesCuentaBancoPunVen.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralCuentaBancoPunVen.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesCuentaBancoPunVen(Boolean esInicializar) throws Exception {
		try	{	
			if(CuentaBancoPunVenJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualCuentaBancoPunVen(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesCuentaBancoPunVen() throws Exception {
		try	{
			if(CuentaBancoPunVenJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualCuentaBancoPunVen();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleCuentaBancoPunVen() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormCuentaBancoPunVen.jComboBoxTiposAccionesFormularioCuentaBancoPunVen.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormCuentaBancoPunVen.jComboBoxTiposAccionesFormularioCuentaBancoPunVen.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualCuentaBancoPunVen() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesCuentaBancoPunVen.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesCuentaBancoPunVen.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesCuentaBancoPunVen.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesCuentaBancoPunVen.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesCuentaBancoPunVen.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesCuentaBancoPunVen.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionCuentaBancoPunVen.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionCuentaBancoPunVen.addItem(reporte);
			}
			
			
			if(!this.cuentabancopunvenSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionCuentaBancoPunVen.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionCuentaBancoPunVen.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesCuentaBancoPunVen.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesCuentaBancoPunVen.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesCuentaBancoPunVen.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesCuentaBancoPunVen.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormCuentaBancoPunVen!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormCuentaBancoPunVen.jComboBoxTiposAccionesFormularioCuentaBancoPunVen.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormCuentaBancoPunVen.jComboBoxTiposAccionesFormularioCuentaBancoPunVen.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarCuentaBancoPunVen.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarCuentaBancoPunVen.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarCuentaBancoPunVen.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualCuentaBancoPunVen();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualCuentaBancoPunVen() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoCuentaBancoPunVen!=null) {
				this.jInternalFrameReporteDinamicoCuentaBancoPunVen.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoCuentaBancoPunVen.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoCuentaBancoPunVen!=null) {
				this.jInternalFrameReporteDinamicoCuentaBancoPunVen.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoCuentaBancoPunVen.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoCuentaBancoPunVen!=null) {
				
				if(this.jInternalFrameReporteDinamicoCuentaBancoPunVen.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoCuentaBancoPunVen.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoCuentaBancoPunVen.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoCuentaBancoPunVen.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoCuentaBancoPunVen.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoCuentaBancoPunVen.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualCuentaBancoPunVen()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_bancoFK_IdBancoCuentaBancoPunVen.getSelectedItem()!=null){this.id_bancoFK_IdBanco=((Banco)this.jComboBoxid_bancoFK_IdBancoCuentaBancoPunVen.getSelectedItem()).getId();}
		if(this.jComboBoxid_clienteFK_IdClienteCuentaBancoPunVen.getSelectedItem()!=null){this.id_clienteFK_IdCliente=((Cliente)this.jComboBoxid_clienteFK_IdClienteCuentaBancoPunVen.getSelectedItem()).getId();}
		if(this.jComboBoxid_cuenta_contableFK_IdCuentaContableCuentaBancoPunVen.getSelectedItem()!=null){this.id_cuenta_contableFK_IdCuentaContable=((CuentaContable)this.jComboBoxid_cuenta_contableFK_IdCuentaContableCuentaBancoPunVen.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasCuentaBancoPunVen(Boolean esInicializar) throws Exception {				
		if(CuentaBancoPunVenJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualCuentaBancoPunVen();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaCuentaBancoPunVen() throws Exception {
		this.inicializarActualizarBindingTablaCuentaBancoPunVen(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByCuentaBancoPunVen() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByCuentaBancoPunVen.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByCuentaBancoPunVen.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByCuentaBancoPunVen.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new CuentaBancoPunVenPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByCuentaBancoPunVen.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByCuentaBancoPunVen.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new CuentaBancoPunVenPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosCuentaBancoPunVenOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCuentaBancoPunVenOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new CuentaBancoPunVenPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByCuentaBancoPunVen.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByCuentaBancoPunVen.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new CuentaBancoPunVenPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByCuentaBancoPunVen.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaCuentaBancoPunVen(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=cuentabancopunvenLogic.getCuentaBancoPunVens().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=cuentabancopunvens.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(CuentaBancoPunVenJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosCuentaBancoPunVen.setModel(new CuentaBancoPunVenModel(this.cuentabancopunvenLogic.getCuentaBancoPunVens(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosCuentaBancoPunVen.setModel(new CuentaBancoPunVenModel(this.cuentabancopunvens,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByCuentaBancoPunVen!=null && this.jInternalFrameOrderByCuentaBancoPunVen.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByCuentaBancoPunVen();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosCuentaBancoPunVen.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCuentaBancoPunVen,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new CuentaBancoPunVenPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+CuentaBancoPunVenConstantesFunciones.SCLASSWEBTITULO,cuentabancopunvenConstantesFunciones.resaltarSeleccionarCuentaBancoPunVen,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+CuentaBancoPunVenConstantesFunciones.SCLASSWEBTITULO,cuentabancopunvenConstantesFunciones.resaltarSeleccionarCuentaBancoPunVen,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosCuentaBancoPunVen.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCuentaBancoPunVen,CuentaBancoPunVenConstantesFunciones.LABEL_ID));

		if(this.cuentabancopunvenConstantesFunciones.mostraridCuentaBancoPunVen && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CuentaBancoPunVenConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.cuentabancopunvenConstantesFunciones.resaltaridCuentaBancoPunVen,this.cuentabancopunvenConstantesFunciones.activaridCuentaBancoPunVen,this,true,"idCuentaBancoPunVen","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.cuentabancopunvenConstantesFunciones.resaltaridCuentaBancoPunVen,this.cuentabancopunvenConstantesFunciones.activaridCuentaBancoPunVen,this,true,"idCuentaBancoPunVen","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCuentaBancoPunVen.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCuentaBancoPunVen,CuentaBancoPunVenConstantesFunciones.LABEL_IDEMPRESA));

		if(this.cuentabancopunvenConstantesFunciones.mostrarid_empresaCuentaBancoPunVen && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CuentaBancoPunVenConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.cuentabancopunvenConstantesFunciones.resaltarid_empresaCuentaBancoPunVen,this,this.cuentabancopunvenConstantesFunciones.activarid_empresaCuentaBancoPunVen));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.cuentabancopunvenConstantesFunciones.resaltarid_empresaCuentaBancoPunVen,this,this.cuentabancopunvenConstantesFunciones.activarid_empresaCuentaBancoPunVen,false,"id_empresaCuentaBancoPunVen","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new CuentaBancoPunVenPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCuentaBancoPunVen.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCuentaBancoPunVen,CuentaBancoPunVenConstantesFunciones.LABEL_IDSUCURSAL));

		if(this.cuentabancopunvenConstantesFunciones.mostrarid_sucursalCuentaBancoPunVen && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CuentaBancoPunVenConstantesFunciones.LABEL_IDSUCURSAL,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new SucursalTableCell(this.sucursalsForeignKey,this.cuentabancopunvenConstantesFunciones.resaltarid_sucursalCuentaBancoPunVen,this,this.cuentabancopunvenConstantesFunciones.activarid_sucursalCuentaBancoPunVen));
			tableColumn.setCellEditor(new SucursalTableCell(this.sucursalsForeignKey,this.cuentabancopunvenConstantesFunciones.resaltarid_sucursalCuentaBancoPunVen,this,this.cuentabancopunvenConstantesFunciones.activarid_sucursalCuentaBancoPunVen,false,"id_sucursalCuentaBancoPunVen","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new CuentaBancoPunVenPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCuentaBancoPunVen.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCuentaBancoPunVen,CuentaBancoPunVenConstantesFunciones.LABEL_IDBANCO));

		if(this.cuentabancopunvenConstantesFunciones.mostrarid_bancoCuentaBancoPunVen && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CuentaBancoPunVenConstantesFunciones.LABEL_IDBANCO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new BancoTableCell(this.bancosForeignKey,this.cuentabancopunvenConstantesFunciones.resaltarid_bancoCuentaBancoPunVen,this,this.cuentabancopunvenConstantesFunciones.activarid_bancoCuentaBancoPunVen));
			tableColumn.setCellEditor(new BancoTableCell(this.bancosForeignKey,this.cuentabancopunvenConstantesFunciones.resaltarid_bancoCuentaBancoPunVen,this,this.cuentabancopunvenConstantesFunciones.activarid_bancoCuentaBancoPunVen,true,"id_bancoCuentaBancoPunVen","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new CuentaBancoPunVenPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCuentaBancoPunVen.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCuentaBancoPunVen,CuentaBancoPunVenConstantesFunciones.LABEL_IDCLIENTE));

		if(this.cuentabancopunvenConstantesFunciones.mostrarid_clienteCuentaBancoPunVen && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CuentaBancoPunVenConstantesFunciones.LABEL_IDCLIENTE,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new ClienteTableCell(this.clientesForeignKey,this.cuentabancopunvenConstantesFunciones.resaltarid_clienteCuentaBancoPunVen,this,this.cuentabancopunvenConstantesFunciones.activarid_clienteCuentaBancoPunVen));
			tableColumn.setCellEditor(new ClienteTableCell(this.clientesForeignKey,this.cuentabancopunvenConstantesFunciones.resaltarid_clienteCuentaBancoPunVen,this,this.cuentabancopunvenConstantesFunciones.activarid_clienteCuentaBancoPunVen,true,"id_clienteCuentaBancoPunVen","CON_BUSQUEDA"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75);
			//tableColumn.addPropertyChangeListener(new CuentaBancoPunVenPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCuentaBancoPunVen.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCuentaBancoPunVen,CuentaBancoPunVenConstantesFunciones.LABEL_IDCUENTACONTABLE));

		if(this.cuentabancopunvenConstantesFunciones.mostrarid_cuenta_contableCuentaBancoPunVen && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CuentaBancoPunVenConstantesFunciones.LABEL_IDCUENTACONTABLE,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new CuentaContableTableCell(this.cuentacontablesForeignKey,this.cuentabancopunvenConstantesFunciones.resaltarid_cuenta_contableCuentaBancoPunVen,this,this.cuentabancopunvenConstantesFunciones.activarid_cuenta_contableCuentaBancoPunVen));
			tableColumn.setCellEditor(new CuentaContableTableCell(this.cuentacontablesForeignKey,this.cuentabancopunvenConstantesFunciones.resaltarid_cuenta_contableCuentaBancoPunVen,this,this.cuentabancopunvenConstantesFunciones.activarid_cuenta_contableCuentaBancoPunVen,true,"id_cuenta_contableCuentaBancoPunVen","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70);
			//tableColumn.addPropertyChangeListener(new CuentaBancoPunVenPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCuentaBancoPunVen.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCuentaBancoPunVen,CuentaBancoPunVenConstantesFunciones.LABEL_CODIGO));

		if(this.cuentabancopunvenConstantesFunciones.mostrarcodigoCuentaBancoPunVen && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CuentaBancoPunVenConstantesFunciones.LABEL_CODIGO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.cuentabancopunvenConstantesFunciones.resaltarcodigoCuentaBancoPunVen,this.cuentabancopunvenConstantesFunciones.activarcodigoCuentaBancoPunVen,this,true,"codigoCuentaBancoPunVen","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.cuentabancopunvenConstantesFunciones.resaltarcodigoCuentaBancoPunVen,this.cuentabancopunvenConstantesFunciones.activarcodigoCuentaBancoPunVen,this,true,"codigoCuentaBancoPunVen","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new CuentaBancoPunVenPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCuentaBancoPunVen.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCuentaBancoPunVen,CuentaBancoPunVenConstantesFunciones.LABEL_NOMBRE));

		if(this.cuentabancopunvenConstantesFunciones.mostrarnombreCuentaBancoPunVen && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CuentaBancoPunVenConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.cuentabancopunvenConstantesFunciones.resaltarnombreCuentaBancoPunVen,this.cuentabancopunvenConstantesFunciones.activarnombreCuentaBancoPunVen,this,true,"nombreCuentaBancoPunVen","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.cuentabancopunvenConstantesFunciones.resaltarnombreCuentaBancoPunVen,this.cuentabancopunvenConstantesFunciones.activarnombreCuentaBancoPunVen,this,true,"nombreCuentaBancoPunVen","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new CuentaBancoPunVenPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.cuentabancopunvenSessionBean.getEsGuardarRelacionado()
			&& !this.esParaBusquedaForeignKey) {
			

			if(this.isTienePermisosFormaPagoPuntoVenta && this.cuentabancopunvenConstantesFunciones.mostrarFormaPagoPuntoVentaCuentaBancoPunVen && !CuentaBancoPunVenConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Forma Pagoes");
				tableColumn.setHeaderValue("Forma Pagoes");
				tableColumn.setCellRenderer(new FormaPagoPuntoVentaTableCell(cuentabancopunvenConstantesFunciones.resaltarFormaPagoPuntoVentaCuentaBancoPunVen,this,this.cuentabancopunvenConstantesFunciones.activarFormaPagoPuntoVentaCuentaBancoPunVen));
				tableColumn.setCellEditor(new FormaPagoPuntoVentaTableCell(cuentabancopunvenConstantesFunciones.resaltarFormaPagoPuntoVentaCuentaBancoPunVen,this,this.cuentabancopunvenConstantesFunciones.activarFormaPagoPuntoVentaCuentaBancoPunVen));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosCuentaBancoPunVen.addColumn(tableColumn);
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.cuentabancopunvenSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.cuentabancopunvenSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosCuentaBancoPunVen.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.cuentabancopunvenSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.cuentabancopunvenSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosCuentaBancoPunVen.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarCuentaBancoPunVen && this.isPermisoGuardarCambiosCuentaBancoPunVen) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.cuentabancopunvenSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.cuentabancopunvenSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosCuentaBancoPunVen.addColumn(tableColumn);
				}
			}			
						
			if(this.conMaximoRelaciones && this.cuentabancopunvenSessionBean.getConGuardarRelaciones()) {
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
				
					this.jTableDatosCuentaBancoPunVen.addColumn(tableColumn);
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
			
			this.jTableDatosCuentaBancoPunVen.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarCuentaBancoPunVen && this.isPermisoGuardarCambiosCuentaBancoPunVen) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.cuentabancopunvenSessionBean.getConGuardarRelaciones()) {			
				//PERMITE EDITAR RELACIONES
				iUltimaColumna++;//2
			}
		}
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarCuentaBancoPunVen && this.isPermisoGuardarCambiosCuentaBancoPunVen) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosCuentaBancoPunVen.moveColumn(this.jTableDatosCuentaBancoPunVen.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosCuentaBancoPunVen.moveColumn(this.jTableDatosCuentaBancoPunVen.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.cuentabancopunvenSessionBean.getConGuardarRelaciones()) {	
				if(iUltimaColumna>1) {
					iUltimaColumna--;
				}
				
				//iNuevaPosicionColumna++;
				
				//REUBICA EDITAR RELACIONES
				jTableDatosCuentaBancoPunVen.moveColumn(this.jTableDatosCuentaBancoPunVen.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1
			}
		}
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosCuentaBancoPunVen.moveColumn(this.jTableDatosCuentaBancoPunVen.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosCuentaBancoPunVen.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosCuentaBancoPunVen.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosCuentaBancoPunVen,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!CuentaBancoPunVenJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosCuentaBancoPunVen.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosCuentaBancoPunVen.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!CuentaBancoPunVenJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!CuentaBancoPunVenJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosCuentaBancoPunVen.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosCuentaBancoPunVen.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosCuentaBancoPunVen.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=cuentabancopunvenLogic.getCuentaBancoPunVens().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=cuentabancopunvens.size()-1;
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
		//this.jTableDatosCuentaBancoPunVen.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosCuentaBancoPunVen.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosCuentaBancoPunVen();
			
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
				
				//this.isEsNuevoCuentaBancoPunVen=false;
					
				CuentaBancoPunVenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.cuentabancopunven,new Object(),this.cuentabancopunvenParameterGeneral,this.cuentabancopunvenReturnGeneral);
			
				if(this.cuentabancopunvenSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormCuentaBancoPunVen==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosCuentaBancoPunVen.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosCuentaBancoPunVen.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuentabancopunven =(CuentaBancoPunVen) this.cuentabancopunvenLogic.getCuentaBancoPunVens().toArray()[this.jTableDatosCuentaBancoPunVen.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.cuentabancopunven =(CuentaBancoPunVen) this.cuentabancopunvens.toArray()[this.jTableDatosCuentaBancoPunVen.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.cuentabancopunven.getsType().equals("DUPLICADO")
				   || this.cuentabancopunven.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoCuentaBancoPunVen=true;
				
				} else {
					this.isEsNuevoCuentaBancoPunVen=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.cuentabancopunvenSessionBean.getEsGuardarRelacionado()) {
					if(this.cuentabancopunven.getId()>=0 && !this.cuentabancopunven.getIsNew()) {						
						this.isEsNuevoCuentaBancoPunVen=false;
						
					} else {
						this.isEsNuevoCuentaBancoPunVen=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoCuentaBancoPunVen(esRelaciones);						
				
				this.seleccionarCuentaBancoPunVen(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.cuentabancopunven.getId()<0) {
					this.isEsNuevoCuentaBancoPunVen=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarCuentaBancoPunVen(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarCuentaBancoPunVen(evt,rowIndex);
				}	
				
				if(this.cuentabancopunvenSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion CuentaBancoPunVen: " + this.dDif); 
					}
				}								
				
				CuentaBancoPunVenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.cuentabancopunven,new Object(),this.cuentabancopunvenParameterGeneral,this.cuentabancopunvenReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarCuentaBancoPunVen(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.cuentabancopunven)) {
					if(this.cuentabancopunven.getId()>0) {
						this.cuentabancopunven.setIsDeleted(true);
						
						this.cuentabancopunvensEliminados.add(this.cuentabancopunven);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.cuentabancopunvenLogic.getCuentaBancoPunVens().remove(this.cuentabancopunven);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.cuentabancopunvens.remove(this.cuentabancopunven);				
					}
					
					
					((CuentaBancoPunVenModel) this.jTableDatosCuentaBancoPunVen.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaCuentaBancoPunVen(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,CuentaBancoPunVenConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarCuentaBancoPunVen(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoCuentaBancoPunVen) {
			
			if(this.jInternalFrameDetalleFormCuentaBancoPunVen==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosCuentaBancoPunVen.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosCuentaBancoPunVen.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuentabancopunven =(CuentaBancoPunVen) this.cuentabancopunvenLogic.getCuentaBancoPunVens().toArray()[this.jTableDatosCuentaBancoPunVen.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.cuentabancopunven =(CuentaBancoPunVen) this.cuentabancopunvens.toArray()[this.jTableDatosCuentaBancoPunVen.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(CuentaBancoPunVenJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioCuentaBancoPunVen(this.cuentabancopunven);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.cuentabancopunvenConstantesFunciones.cargarid_empresaCuentaBancoPunVen || this.cuentabancopunvenConstantesFunciones.event_dependid_empresaCuentaBancoPunVen) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.cuentabancopunven.getid_empresa());
									//this.inicializarActualizarBindingCuentaBancoPunVen(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(cuentabancopunven.getEmpresa()!=null) {
							this.empresasForeignKey.add(cuentabancopunven.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.cuentabancopunven.getid_empresa(),false,"Formulario");

					//Sucursal
					if(!this.cuentabancopunvenConstantesFunciones.cargarid_sucursalCuentaBancoPunVen || this.cuentabancopunvenConstantesFunciones.event_dependid_sucursalCuentaBancoPunVen) {
						//this.cargarCombosSucursalsForeignKeyLista(" where id="+this.cuentabancopunven.getid_sucursal());
									//this.inicializarActualizarBindingCuentaBancoPunVen(false,false);
						this.sucursalsForeignKey=new ArrayList<Sucursal>();

						if(cuentabancopunven.getSucursal()!=null) {
							this.sucursalsForeignKey.add(cuentabancopunven.getSucursal());
						}

						this.addItemDefectoCombosForeignKeySucursal();
						this.cargarCombosFrameSucursalsForeignKey("Todos");
					}
					this.setActualSucursalForeignKey(this.cuentabancopunven.getid_sucursal(),false,"Formulario");

					//Banco
					if(!this.cuentabancopunvenConstantesFunciones.cargarid_bancoCuentaBancoPunVen || this.cuentabancopunvenConstantesFunciones.event_dependid_bancoCuentaBancoPunVen) {
						//this.cargarCombosBancosForeignKeyLista(" where id="+this.cuentabancopunven.getid_banco());
									//this.inicializarActualizarBindingCuentaBancoPunVen(false,false);
						this.bancosForeignKey=new ArrayList<Banco>();

						if(cuentabancopunven.getBanco()!=null) {
							this.bancosForeignKey.add(cuentabancopunven.getBanco());
						}

						this.addItemDefectoCombosForeignKeyBanco();
						this.cargarCombosFrameBancosForeignKey("Todos");
					}
					this.setActualBancoForeignKey(this.cuentabancopunven.getid_banco(),false,"Formulario");

					//Cliente
					if(!this.cuentabancopunvenConstantesFunciones.cargarid_clienteCuentaBancoPunVen || this.cuentabancopunvenConstantesFunciones.event_dependid_clienteCuentaBancoPunVen) {
						//this.cargarCombosClientesForeignKeyLista(" where id="+this.cuentabancopunven.getid_cliente());
									//this.inicializarActualizarBindingCuentaBancoPunVen(false,false);
						this.clientesForeignKey=new ArrayList<Cliente>();

						if(cuentabancopunven.getCliente()!=null) {
							this.clientesForeignKey.add(cuentabancopunven.getCliente());
						}

						this.addItemDefectoCombosForeignKeyCliente();
						this.cargarCombosFrameClientesForeignKey("Todos");
					}
					this.setActualClienteForeignKey(this.cuentabancopunven.getid_cliente(),false,"Formulario");

					//CuentaContable
					if(!this.cuentabancopunvenConstantesFunciones.cargarid_cuenta_contableCuentaBancoPunVen || this.cuentabancopunvenConstantesFunciones.event_dependid_cuenta_contableCuentaBancoPunVen) {
						//this.cargarCombosCuentaContablesForeignKeyLista(" where id="+this.cuentabancopunven.getid_cuenta_contable());
									//this.inicializarActualizarBindingCuentaBancoPunVen(false,false);
						this.cuentacontablesForeignKey=new ArrayList<CuentaContable>();

						if(cuentabancopunven.getCuentaContable()!=null) {
							this.cuentacontablesForeignKey.add(cuentabancopunven.getCuentaContable());
						}

						this.addItemDefectoCombosForeignKeyCuentaContable();
						this.cargarCombosFrameCuentaContablesForeignKey("Todos");
					}
					this.setActualCuentaContableForeignKey(this.cuentabancopunven.getid_cuenta_contable(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesCuentaBancoPunVen("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesCuentaBancoPunVen(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualCuentaBancoPunVen() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CuentaBancoPunVenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoCuentaBancoPunVen(CuentaBancoPunVen cuentabancopunven) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoCuentaBancoPunVen(cuentabancopunven,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoCuentaBancoPunVen(CuentaBancoPunVen cuentabancopunven,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioCuentaBancoPunVen(cuentabancopunven);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyCuentaBancoPunVen(cuentabancopunven,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyCuentaBancoPunVen(cuentabancopunven);
	}
	
	public void setVariablesObjetoActualToFormularioCuentaBancoPunVen(CuentaBancoPunVen cuentabancopunven) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormCuentaBancoPunVen==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormCuentaBancoPunVen.jLabelidCuentaBancoPunVen.setText(cuentabancopunven.getId().toString());
			this.jInternalFrameDetalleFormCuentaBancoPunVen.jTextFieldcodigoCuentaBancoPunVen.setText(cuentabancopunven.getcodigo());
			this.jInternalFrameDetalleFormCuentaBancoPunVen.jTextAreanombreCuentaBancoPunVen.setText(cuentabancopunven.getnombre());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CuentaBancoPunVenConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,CuentaBancoPunVen cuentabancopunvenLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,cuentabancopunvenLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,CuentaBancoPunVen cuentabancopunvenLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				cuentabancopunvenLocal=this.cuentabancopunven;
			} else {
				cuentabancopunvenLocal=this.cuentabancopunvenAnterior;
			}
		}
		
		if(this.permiteMantenimiento(cuentabancopunvenLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoCuentaBancoPunVen(cuentabancopunvenLocal,true);
					
					if(cuentabancopunvenSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(cuentabancopunvenLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.cuentabancopunvenSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(cuentabancopunvenLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoCuentaBancoPunVen(CuentaBancoPunVen cuentabancopunven,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualCuentaBancoPunVen(cuentabancopunven,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysCuentaBancoPunVen(cuentabancopunven);
	}
	
	public void setVariablesFormularioToObjetoActualCuentaBancoPunVen(CuentaBancoPunVen cuentabancopunven,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualCuentaBancoPunVen(cuentabancopunven,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualCuentaBancoPunVen(CuentaBancoPunVen cuentabancopunven,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormCuentaBancoPunVen==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormCuentaBancoPunVen.jLabelidCuentaBancoPunVen.getText()==null || this.jInternalFrameDetalleFormCuentaBancoPunVen.jLabelidCuentaBancoPunVen.getText()=="" || this.jInternalFrameDetalleFormCuentaBancoPunVen.jLabelidCuentaBancoPunVen.getText()=="Id") {
				this.jInternalFrameDetalleFormCuentaBancoPunVen.jLabelidCuentaBancoPunVen.setText("0");
			}

			if(conColumnasBase) {cuentabancopunven.setId(Long.parseLong(this.jInternalFrameDetalleFormCuentaBancoPunVen.jLabelidCuentaBancoPunVen.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CuentaBancoPunVenConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCuentaBancoPunVen.jLabelIdCuentaBancoPunVen,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			cuentabancopunven.setcodigo(this.jInternalFrameDetalleFormCuentaBancoPunVen.jTextFieldcodigoCuentaBancoPunVen.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CuentaBancoPunVenConstantesFunciones.LABEL_CODIGO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCuentaBancoPunVen.jLabelcodigoCuentaBancoPunVen,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			cuentabancopunven.setnombre(this.jInternalFrameDetalleFormCuentaBancoPunVen.jTextAreanombreCuentaBancoPunVen.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CuentaBancoPunVenConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCuentaBancoPunVen.jLabelnombreCuentaBancoPunVen,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CuentaBancoPunVenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualCuentaBancoPunVen(CuentaBancoPunVen cuentabancopunvenBean,CuentaBancoPunVen cuentabancopunven,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conDefault || (!conDefault && cuentabancopunvenBean.getid_banco()!=null && !cuentabancopunvenBean.getid_banco().equals(-1L))) {cuentabancopunven.setid_banco(cuentabancopunvenBean.getid_banco());}
			if(conDefault || (!conDefault && cuentabancopunvenBean.getid_cliente()!=null && !cuentabancopunvenBean.getid_cliente().equals(-1L))) {cuentabancopunven.setid_cliente(cuentabancopunvenBean.getid_cliente());}
			if(conDefault || (!conDefault && cuentabancopunvenBean.getid_cuenta_contable()!=null && !cuentabancopunvenBean.getid_cuenta_contable().equals(-1L))) {cuentabancopunven.setid_cuenta_contable(cuentabancopunvenBean.getid_cuenta_contable());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CuentaBancoPunVenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosCuentaBancoPunVen(CuentaBancoPunVen cuentabancopunvenOrigen,CuentaBancoPunVen cuentabancopunven,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && cuentabancopunvenOrigen.getId()!=null && !cuentabancopunvenOrigen.getId().equals(0L))) {cuentabancopunven.setId(cuentabancopunvenOrigen.getId());}}
			if(conDefault || (!conDefault && cuentabancopunvenOrigen.getid_banco()!=null && !cuentabancopunvenOrigen.getid_banco().equals(-1L))) {cuentabancopunven.setid_banco(cuentabancopunvenOrigen.getid_banco());}
			if(conDefault || (!conDefault && cuentabancopunvenOrigen.getid_cliente()!=null && !cuentabancopunvenOrigen.getid_cliente().equals(-1L))) {cuentabancopunven.setid_cliente(cuentabancopunvenOrigen.getid_cliente());}
			if(conDefault || (!conDefault && cuentabancopunvenOrigen.getid_cuenta_contable()!=null && !cuentabancopunvenOrigen.getid_cuenta_contable().equals(-1L))) {cuentabancopunven.setid_cuenta_contable(cuentabancopunvenOrigen.getid_cuenta_contable());}
			if(conDefault || (!conDefault && cuentabancopunvenOrigen.getcodigo()!=null && !cuentabancopunvenOrigen.getcodigo().equals(""))) {cuentabancopunven.setcodigo(cuentabancopunvenOrigen.getcodigo());}
			if(conDefault || (!conDefault && cuentabancopunvenOrigen.getnombre()!=null && !cuentabancopunvenOrigen.getnombre().equals(""))) {cuentabancopunven.setnombre(cuentabancopunvenOrigen.getnombre());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CuentaBancoPunVenConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioCuentaBancoPunVen(CuentaBancoPunVen cuentabancopunven) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormCuentaBancoPunVen.jLabelidCuentaBancoPunVen.setText(cuentabancopunven.getId().toString());
			this.jInternalFrameDetalleFormCuentaBancoPunVen.jTextFieldcodigoCuentaBancoPunVen.setText(cuentabancopunven.getcodigo());
			this.jInternalFrameDetalleFormCuentaBancoPunVen.jTextAreanombreCuentaBancoPunVen.setText(cuentabancopunven.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CuentaBancoPunVenConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioCuentaBancoPunVen(CuentaBancoPunVenBean cuentabancopunvenBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormCuentaBancoPunVen.jLabelidCuentaBancoPunVen.setText(cuentabancopunvenBean.getId().toString());
			this.jInternalFrameDetalleFormCuentaBancoPunVen.jTextFieldcodigoCuentaBancoPunVen.setText(cuentabancopunvenBean.getcodigo());
			this.jInternalFrameDetalleFormCuentaBancoPunVen.jTextAreanombreCuentaBancoPunVen.setText(cuentabancopunvenBean.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CuentaBancoPunVenConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanCuentaBancoPunVen(CuentaBancoPunVenParameterReturnGeneral cuentabancopunvenReturnGeneral,CuentaBancoPunVenBean cuentabancopunvenBean,Boolean conDefault) throws Exception { 
		try {
			CuentaBancoPunVen cuentabancopunvenLocal=new CuentaBancoPunVen();
			
			cuentabancopunvenLocal=cuentabancopunvenReturnGeneral.getCuentaBancoPunVen();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && cuentabancopunvenLocal.getId()!=null && !cuentabancopunvenLocal.getId().equals(0L))) {cuentabancopunvenBean.setId(cuentabancopunvenLocal.getId());}}
			if(conDefault || (!conDefault && cuentabancopunvenLocal.getid_banco()!=null && !cuentabancopunvenLocal.getid_banco().equals(-1L))) {cuentabancopunvenBean.setid_banco(cuentabancopunvenLocal.getid_banco());}
			if(conDefault || (!conDefault && cuentabancopunvenLocal.getid_cliente()!=null && !cuentabancopunvenLocal.getid_cliente().equals(-1L))) {cuentabancopunvenBean.setid_cliente(cuentabancopunvenLocal.getid_cliente());}
			if(conDefault || (!conDefault && cuentabancopunvenLocal.getid_cuenta_contable()!=null && !cuentabancopunvenLocal.getid_cuenta_contable().equals(-1L))) {cuentabancopunvenBean.setid_cuenta_contable(cuentabancopunvenLocal.getid_cuenta_contable());}
			if(conDefault || (!conDefault && cuentabancopunvenLocal.getcodigo()!=null && !cuentabancopunvenLocal.getcodigo().equals(""))) {cuentabancopunvenBean.setcodigo(cuentabancopunvenLocal.getcodigo());}
			if(conDefault || (!conDefault && cuentabancopunvenLocal.getnombre()!=null && !cuentabancopunvenLocal.getnombre().equals(""))) {cuentabancopunvenBean.setnombre(cuentabancopunvenLocal.getnombre());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CuentaBancoPunVenConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxCuentaBancoPunVenGenerico(Long idCuentaBancoPunVenSeleccionado,JComboBox jComboBoxCuentaBancoPunVen,List<CuentaBancoPunVen> cuentabancopunvensLocal)throws Exception {
		try {
			CuentaBancoPunVen  cuentabancopunvenTemp=null;

			for(CuentaBancoPunVen cuentabancopunvenAux:cuentabancopunvensLocal) {
				if(cuentabancopunvenAux.getId()!=null && cuentabancopunvenAux.getId().equals(idCuentaBancoPunVenSeleccionado)) {
					cuentabancopunvenTemp=cuentabancopunvenAux;
					break;
				}
			}

			jComboBoxCuentaBancoPunVen.setSelectedItem(cuentabancopunvenTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxCuentaBancoPunVenGenerico(JComboBox jComboBoxCuentaBancoPunVen,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxCuentaBancoPunVen.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxCuentaBancoPunVen.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxCuentaBancoPunVen.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxCuentaBancoPunVen.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxCuentaBancoPunVen.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxCuentaBancoPunVen.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxCuentaBancoPunVen.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxCuentaBancoPunVen.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxCuentaBancoPunVen.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxCuentaBancoPunVen.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			
		if(sTipo.equals("FormaPagoPuntoVenta")) {
			jButtonFormaPagoPuntoVentaActionPerformed(evt,rowIndex,true,false,null);
		}
		} catch (Exception e) {
			FuncionesSwing.manageException2(this, e,logger,CuentaBancoPunVenConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			cuentabancopunven=(CuentaBancoPunVen) cuentabancopunvenLogic.getCuentaBancoPunVens().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			cuentabancopunven =(CuentaBancoPunVen) cuentabancopunvens.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!cuentabancopunven.getIsNew() && !cuentabancopunven.getIsChanged() && !cuentabancopunven.getIsDeleted()) {
				sDescripcion=cuentabancopunven.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=cuentabancopunven.getempresa_descripcion();
			}
		}

		if(sTipo.equals("Sucursal")) {
			//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
			if(!cuentabancopunven.getIsNew() && !cuentabancopunven.getIsChanged() && !cuentabancopunven.getIsDeleted()) {
				sDescripcion=cuentabancopunven.getsucursal_descripcion();
			} else {
				//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
				sDescripcion=cuentabancopunven.getsucursal_descripcion();
			}
		}

		if(sTipo.equals("Banco")) {
			//sDescripcion=this.getActualBancoForeignKeyDescripcion((Long)value);
			if(!cuentabancopunven.getIsNew() && !cuentabancopunven.getIsChanged() && !cuentabancopunven.getIsDeleted()) {
				sDescripcion=cuentabancopunven.getbanco_descripcion();
			} else {
				//sDescripcion=this.getActualBancoForeignKeyDescripcion((Long)value);
				sDescripcion=cuentabancopunven.getbanco_descripcion();
			}
		}

		if(sTipo.equals("Cliente")) {
			//sDescripcion=this.getActualClienteForeignKeyDescripcion((Long)value);
			if(!cuentabancopunven.getIsNew() && !cuentabancopunven.getIsChanged() && !cuentabancopunven.getIsDeleted()) {
				sDescripcion=cuentabancopunven.getcliente_descripcion();
			} else {
				//sDescripcion=this.getActualClienteForeignKeyDescripcion((Long)value);
				sDescripcion=cuentabancopunven.getcliente_descripcion();
			}
		}

		if(sTipo.equals("CuentaContable")) {
			//sDescripcion=this.getActualCuentaContableForeignKeyDescripcion((Long)value);
			if(!cuentabancopunven.getIsNew() && !cuentabancopunven.getIsChanged() && !cuentabancopunven.getIsDeleted()) {
				sDescripcion=cuentabancopunven.getcuentacontable_descripcion();
			} else {
				//sDescripcion=this.getActualCuentaContableForeignKeyDescripcion((Long)value);
				sDescripcion=cuentabancopunven.getcuentacontable_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		CuentaBancoPunVen cuentabancopunvenRow=new CuentaBancoPunVen();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			cuentabancopunvenRow=(CuentaBancoPunVen) cuentabancopunvenLogic.getCuentaBancoPunVens().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			cuentabancopunvenRow=(CuentaBancoPunVen) cuentabancopunvens.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	public void jButtonFormaPagoPuntoVentaActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,CuentaBancoPunVen cuentabancopunven) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormCuentaBancoPunVen==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuentabancopunvenLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cuentabancopunven = (CuentaBancoPunVen)this.cuentabancopunvenLogic.getCuentaBancoPunVens().toArray()[this.jTableDatosCuentaBancoPunVen.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.cuentabancopunven = (CuentaBancoPunVen)this.cuentabancopunvens.toArray()[this.jTableDatosCuentaBancoPunVen.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(cuentabancopunven!=null) {
						this.cuentabancopunven = cuentabancopunven;
					} else {
						this.cuentabancopunven = new CuentaBancoPunVen();
					}
				}

				if(this.isTienePermisosFormaPagoPuntoVenta && this.permiteMantenimiento(this.cuentabancopunven)) {
					FormaPagoPuntoVentaBeanSwingJInternalFrame formapagopuntoventaBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormCuentaBancoPunVen.formapagopuntoventaBeanSwingJInternalFramePopup=new FormaPagoPuntoVentaBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormCuentaBancoPunVen.formapagopuntoventaBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						formapagopuntoventaBeanSwingJInternalFrame=this.jInternalFrameDetalleFormCuentaBancoPunVen.formapagopuntoventaBeanSwingJInternalFramePopup;
					} else {
						formapagopuntoventaBeanSwingJInternalFrame=this.jInternalFrameDetalleFormCuentaBancoPunVen.formapagopuntoventaBeanSwingJInternalFrame;
					}

					List<CuentaBancoPunVen> cuentabancopunvens=new ArrayList<CuentaBancoPunVen>();
					cuentabancopunvens.add(this.cuentabancopunven);
					if(!esRelacionado) {
						//formapagopuntoventaBeanSwingJInternalFrame.formapagopuntoventaSessionBean.setConGuardarRelaciones(false);
						//formapagopuntoventaBeanSwingJInternalFrame.formapagopuntoventaSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					formapagopuntoventaBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormCuentaBancoPunVen.cargarFormaPagoPuntoVentaBeanSwingJInternalFrame(cuentabancopunvens,this.cuentabancopunven,formapagopuntoventaBeanSwingJInternalFrame,/*conInicializar,*/formapagopuntoventaBeanSwingJInternalFrame.formapagopuntoventaSessionBean.getConGuardarRelaciones(),formapagopuntoventaBeanSwingJInternalFrame.formapagopuntoventaSessionBean.getEsGuardarRelacionado());
					formapagopuntoventaBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						formapagopuntoventaBeanSwingJInternalFrame.actualizarEstadoPanelsFormaPagoPuntoVenta("no_relacionado");

						formapagopuntoventaBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(FormaPagoPuntoVentaConstantesFunciones.ITAMANIOFILATABLA + (FormaPagoPuntoVentaConstantesFunciones.ITAMANIOFILATABLA/2));

						formapagopuntoventaBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderCuentaBancoPunVen=(TitledBorder)this.jScrollPanelDatosCuentaBancoPunVen.getBorder();
						TitledBorder titledBorderFormaPagoPuntoVenta=(TitledBorder)formapagopuntoventaBeanSwingJInternalFrame.jScrollPanelDatosFormaPagoPuntoVenta.getBorder();

						titledBorderFormaPagoPuntoVenta.setTitle(titledBorderCuentaBancoPunVen.getTitle() + " -> Forma Pago");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,formapagopuntoventaBeanSwingJInternalFrame);
						}

						formapagopuntoventaBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(formapagopuntoventaBeanSwingJInternalFrame);

						formapagopuntoventaBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.cuentabancopunvenSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Forma Pago",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuentabancopunvenLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuentabancopunvenLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,CuentaBancoPunVenConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuentabancopunvenLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualCuentaBancoPunVen(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoCuentaBancoPunVen.setVisible((this.isVisibilidadCeldaNuevoCuentaBancoPunVen && this.isPermisoNuevoCuentaBancoPunVen));			
			this.jButtonDuplicarCuentaBancoPunVen.setVisible((this.isVisibilidadCeldaDuplicarCuentaBancoPunVen && this.isPermisoDuplicarCuentaBancoPunVen));			
			this.jButtonCopiarCuentaBancoPunVen.setVisible((this.isVisibilidadCeldaCopiarCuentaBancoPunVen && this.isPermisoCopiarCuentaBancoPunVen));
			this.jButtonVerFormCuentaBancoPunVen.setVisible((this.isVisibilidadCeldaVerFormCuentaBancoPunVen && this.isPermisoVerFormCuentaBancoPunVen));
			
			this.jButtonAbrirOrderByCuentaBancoPunVen.setVisible((this.isVisibilidadCeldaOrdenCuentaBancoPunVen && this.isPermisoOrdenCuentaBancoPunVen));			
			
			this.jButtonNuevoRelacionesCuentaBancoPunVen.setVisible((this.isVisibilidadCeldaNuevoRelacionesCuentaBancoPunVen && this.isPermisoNuevoCuentaBancoPunVen));			
			this.jButtonNuevoGuardarCambiosCuentaBancoPunVen.setVisible((this.isVisibilidadCeldaNuevoCuentaBancoPunVen && this.isPermisoNuevoCuentaBancoPunVen && this.isPermisoGuardarCambiosCuentaBancoPunVen));
			
			if(this.jInternalFrameDetalleFormCuentaBancoPunVen!=null) {
			this.jInternalFrameDetalleFormCuentaBancoPunVen.jButtonModificarCuentaBancoPunVen.setVisible((this.isVisibilidadCeldaModificarCuentaBancoPunVen && this.isPermisoActualizarCuentaBancoPunVen));	
			this.jInternalFrameDetalleFormCuentaBancoPunVen.jButtonActualizarCuentaBancoPunVen.setVisible((this.isVisibilidadCeldaActualizarCuentaBancoPunVen && this.isPermisoActualizarCuentaBancoPunVen));	
			this.jInternalFrameDetalleFormCuentaBancoPunVen.jButtonEliminarCuentaBancoPunVen.setVisible((this.isVisibilidadCeldaEliminarCuentaBancoPunVen && this.isPermisoEliminarCuentaBancoPunVen));
			this.jInternalFrameDetalleFormCuentaBancoPunVen.jButtonCancelarCuentaBancoPunVen.setVisible(this.isVisibilidadCeldaCancelarCuentaBancoPunVen);							
			this.jInternalFrameDetalleFormCuentaBancoPunVen.jButtonGuardarCambiosCuentaBancoPunVen.setVisible((this.isVisibilidadCeldaGuardarCuentaBancoPunVen && this.isPermisoGuardarCambiosCuentaBancoPunVen));			
			
			}
						
			this.jButtonGuardarCambiosTablaCuentaBancoPunVen.setVisible((this.isVisibilidadCeldaGuardarCambiosCuentaBancoPunVen && this.isPermisoGuardarCambiosCuentaBancoPunVen));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarCuentaBancoPunVen.setVisible((this.isVisibilidadCeldaNuevoCuentaBancoPunVen && this.isPermisoNuevoCuentaBancoPunVen));						
			this.jButtonDuplicarToolBarCuentaBancoPunVen.setVisible((this.isVisibilidadCeldaDuplicarCuentaBancoPunVen && this.isPermisoDuplicarCuentaBancoPunVen));						
			this.jButtonCopiarToolBarCuentaBancoPunVen.setVisible((this.isVisibilidadCeldaCopiarCuentaBancoPunVen && this.isPermisoCopiarCuentaBancoPunVen));			
			this.jButtonVerFormToolBarCuentaBancoPunVen.setVisible((this.isVisibilidadCeldaVerFormCuentaBancoPunVen && this.isPermisoVerFormCuentaBancoPunVen));			
			this.jButtonAbrirOrderByToolBarCuentaBancoPunVen.setVisible((this.isVisibilidadCeldaOrdenCuentaBancoPunVen && this.isPermisoOrdenCuentaBancoPunVen));
			this.jButtonNuevoRelacionesToolBarCuentaBancoPunVen.setVisible((this.isVisibilidadCeldaNuevoRelacionesCuentaBancoPunVen && this.isPermisoNuevoCuentaBancoPunVen));			
			this.jButtonNuevoGuardarCambiosToolBarCuentaBancoPunVen.setVisible((this.isVisibilidadCeldaNuevoCuentaBancoPunVen && this.isPermisoNuevoCuentaBancoPunVen && this.isPermisoGuardarCambiosCuentaBancoPunVen));			
			
			if(this.jInternalFrameDetalleFormCuentaBancoPunVen!=null) {
			this.jInternalFrameDetalleFormCuentaBancoPunVen.jButtonModificarToolBarCuentaBancoPunVen.setVisible((this.isVisibilidadCeldaModificarCuentaBancoPunVen && this.isPermisoActualizarCuentaBancoPunVen));	
			this.jInternalFrameDetalleFormCuentaBancoPunVen.jButtonActualizarToolBarCuentaBancoPunVen.setVisible((this.isVisibilidadCeldaActualizarCuentaBancoPunVen  && this.isPermisoActualizarCuentaBancoPunVen));	
			this.jInternalFrameDetalleFormCuentaBancoPunVen.jButtonEliminarToolBarCuentaBancoPunVen.setVisible((this.isVisibilidadCeldaEliminarCuentaBancoPunVen && this.isPermisoEliminarCuentaBancoPunVen));
			this.jInternalFrameDetalleFormCuentaBancoPunVen.jButtonCancelarToolBarCuentaBancoPunVen.setVisible(this.isVisibilidadCeldaCancelarCuentaBancoPunVen);				
			this.jInternalFrameDetalleFormCuentaBancoPunVen.jButtonGuardarCambiosToolBarCuentaBancoPunVen.setVisible((this.isVisibilidadCeldaGuardarCuentaBancoPunVen && this.isPermisoGuardarCambiosCuentaBancoPunVen));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarCuentaBancoPunVen.setVisible((this.isVisibilidadCeldaGuardarCambiosCuentaBancoPunVen && this.isPermisoGuardarCambiosCuentaBancoPunVen));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoCuentaBancoPunVen.setVisible((this.isVisibilidadCeldaNuevoCuentaBancoPunVen && this.isPermisoNuevoCuentaBancoPunVen));			
			this.jMenuItemDuplicarCuentaBancoPunVen.setVisible((this.isVisibilidadCeldaDuplicarCuentaBancoPunVen && this.isPermisoDuplicarCuentaBancoPunVen));			
			this.jMenuItemCopiarCuentaBancoPunVen.setVisible((this.isVisibilidadCeldaCopiarCuentaBancoPunVen && this.isPermisoCopiarCuentaBancoPunVen));			
			this.jMenuItemVerFormCuentaBancoPunVen.setVisible((this.isVisibilidadCeldaVerFormCuentaBancoPunVen && this.isPermisoVerFormCuentaBancoPunVen));			
			this.jMenuItemAbrirOrderByCuentaBancoPunVen.setVisible((this.isVisibilidadCeldaOrdenCuentaBancoPunVen && this.isPermisoOrdenCuentaBancoPunVen));			
			//this.jMenuItemMostrarOcultarCuentaBancoPunVen.setVisible((this.isVisibilidadCeldaOrdenCuentaBancoPunVen && this.isPermisoOrdenCuentaBancoPunVen));
			this.jMenuItemDetalleAbrirOrderByCuentaBancoPunVen.setVisible((this.isVisibilidadCeldaOrdenCuentaBancoPunVen && this.isPermisoOrdenCuentaBancoPunVen));			
			//this.jMenuItemDetalleMostrarOcultarCuentaBancoPunVen.setVisible((this.isVisibilidadCeldaOrdenCuentaBancoPunVen && this.isPermisoOrdenCuentaBancoPunVen));			
			this.jMenuItemNuevoRelacionesCuentaBancoPunVen.setVisible((this.isVisibilidadCeldaNuevoRelacionesCuentaBancoPunVen && this.isPermisoNuevoCuentaBancoPunVen));			
			this.jMenuItemNuevoGuardarCambiosCuentaBancoPunVen.setVisible((this.isVisibilidadCeldaNuevoCuentaBancoPunVen && this.isPermisoNuevoCuentaBancoPunVen && this.isPermisoGuardarCambiosCuentaBancoPunVen));									
			
			if(this.jInternalFrameDetalleFormCuentaBancoPunVen!=null) {
			this.jInternalFrameDetalleFormCuentaBancoPunVen.jMenuItemModificarCuentaBancoPunVen.setVisible((this.isVisibilidadCeldaModificarCuentaBancoPunVen && this.isPermisoActualizarCuentaBancoPunVen));	
			this.jInternalFrameDetalleFormCuentaBancoPunVen.jMenuItemActualizarCuentaBancoPunVen.setVisible((this.isVisibilidadCeldaActualizarCuentaBancoPunVen && this.isPermisoActualizarCuentaBancoPunVen));	
			this.jInternalFrameDetalleFormCuentaBancoPunVen.jMenuItemEliminarCuentaBancoPunVen.setVisible((this.isVisibilidadCeldaEliminarCuentaBancoPunVen && this.isPermisoEliminarCuentaBancoPunVen));
			this.jInternalFrameDetalleFormCuentaBancoPunVen.jMenuItemCancelarCuentaBancoPunVen.setVisible(this.isVisibilidadCeldaCancelarCuentaBancoPunVen);				
			}
			
			this.jMenuItemGuardarCambiosCuentaBancoPunVen.setVisible((this.isVisibilidadCeldaGuardarCuentaBancoPunVen && this.isPermisoGuardarCambiosCuentaBancoPunVen));						
			this.jMenuItemGuardarCambiosTablaCuentaBancoPunVen.setVisible((this.isVisibilidadCeldaGuardarCambiosCuentaBancoPunVen && this.isPermisoGuardarCambiosCuentaBancoPunVen));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoCuentaBancoPunVen=this.jButtonNuevoCuentaBancoPunVen.isVisible();
			this.isVisibilidadCeldaDuplicarCuentaBancoPunVen=this.jButtonDuplicarCuentaBancoPunVen.isVisible();
			this.isVisibilidadCeldaCopiarCuentaBancoPunVen=this.jButtonCopiarCuentaBancoPunVen.isVisible();
			this.isVisibilidadCeldaVerFormCuentaBancoPunVen=this.jButtonVerFormCuentaBancoPunVen.isVisible();
			
			this.isVisibilidadCeldaOrdenCuentaBancoPunVen=this.jButtonAbrirOrderByCuentaBancoPunVen.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesCuentaBancoPunVen=this.jButtonNuevoRelacionesCuentaBancoPunVen.isVisible();
			this.isVisibilidadCeldaModificarCuentaBancoPunVen=this.jButtonModificarCuentaBancoPunVen.isVisible();
			
			if(this.jInternalFrameDetalleFormCuentaBancoPunVen!=null) {
			this.isVisibilidadCeldaActualizarCuentaBancoPunVen=this.jInternalFrameDetalleFormCuentaBancoPunVen.jButtonActualizarCuentaBancoPunVen.isVisible();
			this.isVisibilidadCeldaEliminarCuentaBancoPunVen=this.jInternalFrameDetalleFormCuentaBancoPunVen.jButtonEliminarCuentaBancoPunVen.isVisible();
			this.isVisibilidadCeldaCancelarCuentaBancoPunVen=this.jInternalFrameDetalleFormCuentaBancoPunVen.jButtonCancelarCuentaBancoPunVen.isVisible();
			this.isVisibilidadCeldaGuardarCuentaBancoPunVen=this.jInternalFrameDetalleFormCuentaBancoPunVen.jButtonGuardarCambiosCuentaBancoPunVen.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosCuentaBancoPunVen=this.jButtonGuardarCambiosTablaCuentaBancoPunVen.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoCuentaBancoPunVen=this.jButtonNuevoToolBarCuentaBancoPunVen.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesCuentaBancoPunVen=this.jButtonNuevoRelacionesToolBarCuentaBancoPunVen.isVisible();
			
			if(this.jInternalFrameDetalleFormCuentaBancoPunVen!=null) {
			this.isVisibilidadCeldaModificarCuentaBancoPunVen=this.jInternalFrameDetalleFormCuentaBancoPunVen.jButtonModificarToolBarCuentaBancoPunVen.isVisible();
			this.isVisibilidadCeldaActualizarCuentaBancoPunVen=this.jInternalFrameDetalleFormCuentaBancoPunVen.jButtonActualizarToolBarCuentaBancoPunVen.isVisible();
			this.isVisibilidadCeldaEliminarCuentaBancoPunVen=this.jInternalFrameDetalleFormCuentaBancoPunVen.jButtonEliminarToolBarCuentaBancoPunVen.isVisible();
			this.isVisibilidadCeldaCancelarCuentaBancoPunVen=this.jInternalFrameDetalleFormCuentaBancoPunVen.jButtonCancelarToolBarCuentaBancoPunVen.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarCuentaBancoPunVen=this.jButtonGuardarCambiosToolBarCuentaBancoPunVen.isVisible();
			this.isVisibilidadCeldaGuardarCambiosCuentaBancoPunVen=this.jButtonGuardarCambiosTablaToolBarCuentaBancoPunVen.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoCuentaBancoPunVen=this.jMenuItemNuevoCuentaBancoPunVen.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesCuentaBancoPunVen=this.jMenuItemNuevoRelacionesCuentaBancoPunVen.isVisible();
			
			if(this.jInternalFrameDetalleFormCuentaBancoPunVen!=null) {
			this.isVisibilidadCeldaModificarCuentaBancoPunVen=this.jInternalFrameDetalleFormCuentaBancoPunVen.jMenuItemModificarCuentaBancoPunVen.isVisible();
			this.isVisibilidadCeldaActualizarCuentaBancoPunVen=this.jInternalFrameDetalleFormCuentaBancoPunVen.jMenuItemActualizarCuentaBancoPunVen.isVisible();
			this.isVisibilidadCeldaEliminarCuentaBancoPunVen=this.jInternalFrameDetalleFormCuentaBancoPunVen.jMenuItemEliminarCuentaBancoPunVen.isVisible();
			this.isVisibilidadCeldaCancelarCuentaBancoPunVen=this.jInternalFrameDetalleFormCuentaBancoPunVen.jMenuItemCancelarCuentaBancoPunVen.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarCuentaBancoPunVen=this.jMenuItemGuardarCambiosCuentaBancoPunVen.isVisible();
			this.isVisibilidadCeldaGuardarCambiosCuentaBancoPunVen=this.jMenuItemGuardarCambiosTablaCuentaBancoPunVen.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesCuentaBancoPunVen(Boolean esInicializar) {
		if(CuentaBancoPunVenJInternalFrame.ISBINDING_MANUAL) {			
			if(this.cuentabancopunvenSessionBean.getConGuardarRelaciones()) {
				//if(this.cuentabancopunvenSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesCuentaBancoPunVen();
			}
			
			this.inicializarActualizarBindingBotonesManualCuentaBancoPunVen(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualCuentaBancoPunVen() {
		this.jButtonNuevoCuentaBancoPunVen.setVisible(this.isPermisoNuevoCuentaBancoPunVen);			
		this.jButtonDuplicarCuentaBancoPunVen.setVisible(this.isPermisoDuplicarCuentaBancoPunVen);			
		this.jButtonCopiarCuentaBancoPunVen.setVisible(this.isPermisoCopiarCuentaBancoPunVen);			
		this.jButtonVerFormCuentaBancoPunVen.setVisible(this.isPermisoVerFormCuentaBancoPunVen);			
		
		this.jButtonAbrirOrderByCuentaBancoPunVen.setVisible(this.isPermisoOrdenCuentaBancoPunVen);					
		
		this.jButtonNuevoRelacionesCuentaBancoPunVen.setVisible(this.isPermisoNuevoCuentaBancoPunVen);			
		
		if(this.jInternalFrameDetalleFormCuentaBancoPunVen!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCuentaBancoPunVen.jButtonModificarCuentaBancoPunVen.setVisible(this.isPermisoActualizarCuentaBancoPunVen);	
			this.jInternalFrameDetalleFormCuentaBancoPunVen.jButtonActualizarCuentaBancoPunVen.setVisible(this.isPermisoActualizarCuentaBancoPunVen);	
			this.jInternalFrameDetalleFormCuentaBancoPunVen.jButtonEliminarCuentaBancoPunVen.setVisible(this.isPermisoEliminarCuentaBancoPunVen);
			this.jInternalFrameDetalleFormCuentaBancoPunVen.jButtonCancelarCuentaBancoPunVen.setVisible(this.isVisibilidadCeldaCancelarCuentaBancoPunVen);						
			this.jInternalFrameDetalleFormCuentaBancoPunVen.jButtonGuardarCambiosCuentaBancoPunVen.setVisible(this.isPermisoGuardarCambiosCuentaBancoPunVen);							
		}
		
		this.jButtonGuardarCambiosTablaCuentaBancoPunVen.setVisible(this.isPermisoActualizarCuentaBancoPunVen);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleCuentaBancoPunVen() {
		this.jInternalFrameDetalleFormCuentaBancoPunVen.jButtonModificarCuentaBancoPunVen.setVisible(this.isPermisoActualizarCuentaBancoPunVen);	
		this.jInternalFrameDetalleFormCuentaBancoPunVen.jButtonActualizarCuentaBancoPunVen.setVisible(this.isPermisoActualizarCuentaBancoPunVen);	
		this.jInternalFrameDetalleFormCuentaBancoPunVen.jButtonEliminarCuentaBancoPunVen.setVisible(this.isPermisoEliminarCuentaBancoPunVen);
		this.jInternalFrameDetalleFormCuentaBancoPunVen.jButtonCancelarCuentaBancoPunVen.setVisible(this.isVisibilidadCeldaCancelarCuentaBancoPunVen);							
		this.jInternalFrameDetalleFormCuentaBancoPunVen.jButtonGuardarCambiosCuentaBancoPunVen.setVisible((this.isVisibilidadCeldaGuardarCuentaBancoPunVen && this.isPermisoGuardarCambiosCuentaBancoPunVen));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosCuentaBancoPunVen() {
		if(CuentaBancoPunVenJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualCuentaBancoPunVen();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesCuentaBancoPunVen() {
	}
	
	public void jTableDatosCuentaBancoPunVenListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarCuentaBancoPunVen(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CuentaBancoPunVenConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidCuentaBancoPunVenBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuentabancopunvenLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCuentaBancoPunVen.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCuentaBancoPunVen(this.getcuentabancopunven(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCuentaBancoPunVen(this.cuentabancopunven);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cuentabancopunven =(CuentaBancoPunVen) this.cuentabancopunvenLogic.getCuentaBancoPunVens().toArray()[this.jTableDatosCuentaBancoPunVen.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cuentabancopunven =(CuentaBancoPunVen) this.cuentabancopunvens.toArray()[this.jTableDatosCuentaBancoPunVen.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cuentabancopunven==null) {
						this.cuentabancopunven = new CuentaBancoPunVen();
					}

					this.setVariablesFormularioToObjetoActualCuentaBancoPunVen(this.cuentabancopunven,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCuentaBancoPunVen(this.cuentabancopunven);
				}

				if(this.cuentabancopunven.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.cuentabancopunven.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCuentaBancoPunVen(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuentabancopunvenLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuentabancopunvenLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CuentaBancoPunVenConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuentabancopunvenLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaCuentaBancoPunVenUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentabancopunvenLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebCuentaBancoPunVen(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCuentaBancoPunVen.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosCuentaBancoPunVen.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosCuentaBancoPunVen.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuentabancopunven =(CuentaBancoPunVen) this.cuentabancopunvenLogic.getCuentaBancoPunVens().toArray()[this.jTableDatosCuentaBancoPunVen.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.cuentabancopunven =(CuentaBancoPunVen) this.cuentabancopunvens.toArray()[this.jTableDatosCuentaBancoPunVen.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualCuentaBancoPunVen(this.getcuentabancopunven(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysCuentaBancoPunVen(this.cuentabancopunven);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.cuentabancopunvenLogic.getConnexion());

				if(this.cuentabancopunven.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.cuentabancopunven.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderCuentaBancoPunVen=(TitledBorder)this.jScrollPanelDatosCuentaBancoPunVen.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderCuentaBancoPunVen.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentabancopunvenLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentabancopunvenLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CuentaBancoPunVenConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentabancopunvenLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaCuentaBancoPunVenBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuentabancopunvenLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCuentaBancoPunVen.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCuentaBancoPunVen(this.getcuentabancopunven(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCuentaBancoPunVen(this.cuentabancopunven);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cuentabancopunven =(CuentaBancoPunVen) this.cuentabancopunvenLogic.getCuentaBancoPunVens().toArray()[this.jTableDatosCuentaBancoPunVen.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cuentabancopunven =(CuentaBancoPunVen) this.cuentabancopunvens.toArray()[this.jTableDatosCuentaBancoPunVen.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cuentabancopunven==null) {
						this.cuentabancopunven = new CuentaBancoPunVen();
					}

					this.setVariablesFormularioToObjetoActualCuentaBancoPunVen(this.cuentabancopunven,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCuentaBancoPunVen(this.cuentabancopunven);
				}

				if(this.cuentabancopunven.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.cuentabancopunven.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCuentaBancoPunVen(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuentabancopunvenLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuentabancopunvenLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CuentaBancoPunVenConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuentabancopunvenLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_sucursalCuentaBancoPunVenUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentabancopunvenLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisosucursal=true;

			idTienePermisosucursal=this.tienePermisosUsuarioEnPaginaWebCuentaBancoPunVen(SucursalConstantesFunciones.CLASSNAME);

			if(idTienePermisosucursal) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCuentaBancoPunVen.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosCuentaBancoPunVen.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosCuentaBancoPunVen.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuentabancopunven =(CuentaBancoPunVen) this.cuentabancopunvenLogic.getCuentaBancoPunVens().toArray()[this.jTableDatosCuentaBancoPunVen.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.cuentabancopunven =(CuentaBancoPunVen) this.cuentabancopunvens.toArray()[this.jTableDatosCuentaBancoPunVen.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualCuentaBancoPunVen(this.getcuentabancopunven(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysCuentaBancoPunVen(this.cuentabancopunven);

				this.sucursalBeanSwingJInternalFrame=new SucursalBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.sucursalBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.sucursalBeanSwingJInternalFrame.getSucursalLogic().setConnexion(this.cuentabancopunvenLogic.getConnexion());

				if(this.cuentabancopunven.getid_sucursal()!=null) {
					this.sucursalBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.sucursalBeanSwingJInternalFrame.setIdActual(this.cuentabancopunven.getid_sucursal());
					this.sucursalBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.inicializarActualizarBindingTablaSucursal();
				}

				JInternalFrameBase jinternalFrame =this.sucursalBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderCuentaBancoPunVen=(TitledBorder)this.jScrollPanelDatosCuentaBancoPunVen.getBorder();
				TitledBorder titledBordersucursal=(TitledBorder)this.sucursalBeanSwingJInternalFrame.jScrollPanelDatosSucursal.getBorder();

				titledBordersucursal.setTitle(titledBorderCuentaBancoPunVen.getTitle() + " -> Sucursal");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentabancopunvenLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentabancopunvenLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CuentaBancoPunVenConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentabancopunvenLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_sucursalCuentaBancoPunVenBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuentabancopunvenLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCuentaBancoPunVen.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCuentaBancoPunVen(this.getcuentabancopunven(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCuentaBancoPunVen(this.cuentabancopunven);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cuentabancopunven =(CuentaBancoPunVen) this.cuentabancopunvenLogic.getCuentaBancoPunVens().toArray()[this.jTableDatosCuentaBancoPunVen.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cuentabancopunven =(CuentaBancoPunVen) this.cuentabancopunvens.toArray()[this.jTableDatosCuentaBancoPunVen.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cuentabancopunven==null) {
						this.cuentabancopunven = new CuentaBancoPunVen();
					}

					this.setVariablesFormularioToObjetoActualCuentaBancoPunVen(this.cuentabancopunven,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCuentaBancoPunVen(this.cuentabancopunven);
				}

				if(this.cuentabancopunven.getid_sucursal()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_sucursal = "+this.cuentabancopunven.getid_sucursal().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCuentaBancoPunVen(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuentabancopunvenLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuentabancopunvenLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CuentaBancoPunVenConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuentabancopunvenLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_bancoCuentaBancoPunVenUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentabancopunvenLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisobanco=true;

			idTienePermisobanco=this.tienePermisosUsuarioEnPaginaWebCuentaBancoPunVen(BancoConstantesFunciones.CLASSNAME);

			if(idTienePermisobanco) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCuentaBancoPunVen.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosCuentaBancoPunVen.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosCuentaBancoPunVen.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuentabancopunven =(CuentaBancoPunVen) this.cuentabancopunvenLogic.getCuentaBancoPunVens().toArray()[this.jTableDatosCuentaBancoPunVen.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.cuentabancopunven =(CuentaBancoPunVen) this.cuentabancopunvens.toArray()[this.jTableDatosCuentaBancoPunVen.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualCuentaBancoPunVen(this.getcuentabancopunven(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysCuentaBancoPunVen(this.cuentabancopunven);

				this.bancoBeanSwingJInternalFrame=new BancoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.bancoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.bancoBeanSwingJInternalFrame.getBancoLogic().setConnexion(this.cuentabancopunvenLogic.getConnexion());

				if(this.cuentabancopunven.getid_banco()!=null) {
					this.bancoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.bancoBeanSwingJInternalFrame.setIdActual(this.cuentabancopunven.getid_banco());
					this.bancoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.bancoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.bancoBeanSwingJInternalFrame.inicializarActualizarBindingTablaBanco();
				}

				JInternalFrameBase jinternalFrame =this.bancoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderCuentaBancoPunVen=(TitledBorder)this.jScrollPanelDatosCuentaBancoPunVen.getBorder();
				TitledBorder titledBorderbanco=(TitledBorder)this.bancoBeanSwingJInternalFrame.jScrollPanelDatosBanco.getBorder();

				titledBorderbanco.setTitle(titledBorderCuentaBancoPunVen.getTitle() + " -> Banco");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentabancopunvenLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentabancopunvenLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CuentaBancoPunVenConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentabancopunvenLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_bancoCuentaBancoPunVenBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuentabancopunvenLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCuentaBancoPunVen.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCuentaBancoPunVen(this.getcuentabancopunven(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCuentaBancoPunVen(this.cuentabancopunven);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cuentabancopunven =(CuentaBancoPunVen) this.cuentabancopunvenLogic.getCuentaBancoPunVens().toArray()[this.jTableDatosCuentaBancoPunVen.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cuentabancopunven =(CuentaBancoPunVen) this.cuentabancopunvens.toArray()[this.jTableDatosCuentaBancoPunVen.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cuentabancopunven==null) {
						this.cuentabancopunven = new CuentaBancoPunVen();
					}

					this.setVariablesFormularioToObjetoActualCuentaBancoPunVen(this.cuentabancopunven,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCuentaBancoPunVen(this.cuentabancopunven);
				}

				if(this.cuentabancopunven.getid_banco()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_banco = "+this.cuentabancopunven.getid_banco().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCuentaBancoPunVen(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuentabancopunvenLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuentabancopunvenLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CuentaBancoPunVenConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuentabancopunvenLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_clienteCuentaBancoPunVenActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
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


			TitledBorder titledBorderCuentaBancoPunVen=null;
			TitledBorder titledBordercliente=null;

			if(!this.jScrollPanelDatosCuentaBancoPunVen.getBorder().getClass().equals(EmptyBorder.class)) {
				titledBorderCuentaBancoPunVen=(TitledBorder)this.jScrollPanelDatosCuentaBancoPunVen.getBorder();
				titledBordercliente=(TitledBorder)this.clienteBeanSwingJInternalFrame.jScrollPanelDatosCliente.getBorder();

				titledBordercliente.setTitle(titledBorderCuentaBancoPunVen.getTitle() + " -> Cliente");
			}

			if(!Constantes.CON_VARIAS_VENTANAS) {
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
			}

			this.jDesktopPane.add(jinternalFrame);

			jinternalFrame.setSelected(true);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CuentaBancoPunVenConstantesFunciones.CLASSNAME);
		}
	}

	public void jButtonid_clienteCuentaBancoPunVenUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentabancopunvenLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisocliente=true;

			idTienePermisocliente=this.tienePermisosUsuarioEnPaginaWebCuentaBancoPunVen(ClienteConstantesFunciones.CLASSNAME);

			if(idTienePermisocliente) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCuentaBancoPunVen.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosCuentaBancoPunVen.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosCuentaBancoPunVen.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuentabancopunven =(CuentaBancoPunVen) this.cuentabancopunvenLogic.getCuentaBancoPunVens().toArray()[this.jTableDatosCuentaBancoPunVen.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.cuentabancopunven =(CuentaBancoPunVen) this.cuentabancopunvens.toArray()[this.jTableDatosCuentaBancoPunVen.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualCuentaBancoPunVen(this.getcuentabancopunven(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysCuentaBancoPunVen(this.cuentabancopunven);

				this.clienteBeanSwingJInternalFrame=new ClienteBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.clienteBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.clienteBeanSwingJInternalFrame.getClienteLogic().setConnexion(this.cuentabancopunvenLogic.getConnexion());

				if(this.cuentabancopunven.getid_cliente()!=null) {
					this.clienteBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.clienteBeanSwingJInternalFrame.setIdActual(this.cuentabancopunven.getid_cliente());
					this.clienteBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.clienteBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.clienteBeanSwingJInternalFrame.inicializarActualizarBindingTablaCliente();
				}

				JInternalFrameBase jinternalFrame =this.clienteBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderCuentaBancoPunVen=(TitledBorder)this.jScrollPanelDatosCuentaBancoPunVen.getBorder();
				TitledBorder titledBordercliente=(TitledBorder)this.clienteBeanSwingJInternalFrame.jScrollPanelDatosCliente.getBorder();

				titledBordercliente.setTitle(titledBorderCuentaBancoPunVen.getTitle() + " -> Cliente");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentabancopunvenLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentabancopunvenLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CuentaBancoPunVenConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentabancopunvenLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_clienteCuentaBancoPunVenBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuentabancopunvenLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCuentaBancoPunVen.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCuentaBancoPunVen(this.getcuentabancopunven(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCuentaBancoPunVen(this.cuentabancopunven);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cuentabancopunven =(CuentaBancoPunVen) this.cuentabancopunvenLogic.getCuentaBancoPunVens().toArray()[this.jTableDatosCuentaBancoPunVen.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cuentabancopunven =(CuentaBancoPunVen) this.cuentabancopunvens.toArray()[this.jTableDatosCuentaBancoPunVen.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cuentabancopunven==null) {
						this.cuentabancopunven = new CuentaBancoPunVen();
					}

					this.setVariablesFormularioToObjetoActualCuentaBancoPunVen(this.cuentabancopunven,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCuentaBancoPunVen(this.cuentabancopunven);
				}

				if(this.cuentabancopunven.getid_cliente()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_cliente = "+this.cuentabancopunven.getid_cliente().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCuentaBancoPunVen(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuentabancopunvenLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuentabancopunvenLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CuentaBancoPunVenConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuentabancopunvenLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_cuenta_contableCuentaBancoPunVenUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentabancopunvenLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisocuentacontable=true;

			idTienePermisocuentacontable=this.tienePermisosUsuarioEnPaginaWebCuentaBancoPunVen(CuentaContableConstantesFunciones.CLASSNAME);

			if(idTienePermisocuentacontable) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCuentaBancoPunVen.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosCuentaBancoPunVen.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosCuentaBancoPunVen.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuentabancopunven =(CuentaBancoPunVen) this.cuentabancopunvenLogic.getCuentaBancoPunVens().toArray()[this.jTableDatosCuentaBancoPunVen.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.cuentabancopunven =(CuentaBancoPunVen) this.cuentabancopunvens.toArray()[this.jTableDatosCuentaBancoPunVen.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualCuentaBancoPunVen(this.getcuentabancopunven(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysCuentaBancoPunVen(this.cuentabancopunven);

				this.cuentacontableBeanSwingJInternalFrame=new CuentaContableBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.cuentacontableBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.cuentacontableBeanSwingJInternalFrame.getCuentaContableLogic().setConnexion(this.cuentabancopunvenLogic.getConnexion());

				if(this.cuentabancopunven.getid_cuenta_contable()!=null) {
					this.cuentacontableBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.cuentacontableBeanSwingJInternalFrame.setIdActual(this.cuentabancopunven.getid_cuenta_contable());
					this.cuentacontableBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.cuentacontableBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.cuentacontableBeanSwingJInternalFrame.inicializarActualizarBindingTablaCuentaContable();
				}

				JInternalFrameBase jinternalFrame =this.cuentacontableBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderCuentaBancoPunVen=(TitledBorder)this.jScrollPanelDatosCuentaBancoPunVen.getBorder();
				TitledBorder titledBordercuentacontable=(TitledBorder)this.cuentacontableBeanSwingJInternalFrame.jScrollPanelDatosCuentaContable.getBorder();

				titledBordercuentacontable.setTitle(titledBorderCuentaBancoPunVen.getTitle() + " -> Cuenta Contable");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentabancopunvenLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentabancopunvenLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CuentaBancoPunVenConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentabancopunvenLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_cuenta_contableCuentaBancoPunVenBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuentabancopunvenLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCuentaBancoPunVen.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCuentaBancoPunVen(this.getcuentabancopunven(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCuentaBancoPunVen(this.cuentabancopunven);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cuentabancopunven =(CuentaBancoPunVen) this.cuentabancopunvenLogic.getCuentaBancoPunVens().toArray()[this.jTableDatosCuentaBancoPunVen.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cuentabancopunven =(CuentaBancoPunVen) this.cuentabancopunvens.toArray()[this.jTableDatosCuentaBancoPunVen.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cuentabancopunven==null) {
						this.cuentabancopunven = new CuentaBancoPunVen();
					}

					this.setVariablesFormularioToObjetoActualCuentaBancoPunVen(this.cuentabancopunven,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCuentaBancoPunVen(this.cuentabancopunven);
				}

				if(this.cuentabancopunven.getid_cuenta_contable()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_cuenta_contable = "+this.cuentabancopunven.getid_cuenta_contable().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCuentaBancoPunVen(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuentabancopunvenLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuentabancopunvenLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CuentaBancoPunVenConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuentabancopunvenLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigoCuentaBancoPunVenBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuentabancopunvenLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCuentaBancoPunVen.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCuentaBancoPunVen(this.getcuentabancopunven(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCuentaBancoPunVen(this.cuentabancopunven);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cuentabancopunven =(CuentaBancoPunVen) this.cuentabancopunvenLogic.getCuentaBancoPunVens().toArray()[this.jTableDatosCuentaBancoPunVen.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cuentabancopunven =(CuentaBancoPunVen) this.cuentabancopunvens.toArray()[this.jTableDatosCuentaBancoPunVen.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cuentabancopunven==null) {
						this.cuentabancopunven = new CuentaBancoPunVen();
					}

					this.setVariablesFormularioToObjetoActualCuentaBancoPunVen(this.cuentabancopunven,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCuentaBancoPunVen(this.cuentabancopunven);
				}

				if(this.cuentabancopunven.getcodigo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo like '%"+this.cuentabancopunven.getcodigo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCuentaBancoPunVen(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuentabancopunvenLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuentabancopunvenLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CuentaBancoPunVenConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuentabancopunvenLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreCuentaBancoPunVenBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuentabancopunvenLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCuentaBancoPunVen.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCuentaBancoPunVen(this.getcuentabancopunven(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCuentaBancoPunVen(this.cuentabancopunven);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cuentabancopunven =(CuentaBancoPunVen) this.cuentabancopunvenLogic.getCuentaBancoPunVens().toArray()[this.jTableDatosCuentaBancoPunVen.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cuentabancopunven =(CuentaBancoPunVen) this.cuentabancopunvens.toArray()[this.jTableDatosCuentaBancoPunVen.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cuentabancopunven==null) {
						this.cuentabancopunven = new CuentaBancoPunVen();
					}

					this.setVariablesFormularioToObjetoActualCuentaBancoPunVen(this.cuentabancopunven,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCuentaBancoPunVen(this.cuentabancopunven);
				}

				if(this.cuentabancopunven.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.cuentabancopunven.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCuentaBancoPunVen(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuentabancopunvenLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuentabancopunvenLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CuentaBancoPunVenConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuentabancopunvenLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdBancoCuentaBancoPunVenActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentabancopunvenLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingCuentaBancoPunVen(false,false);

			this.getCuentaBancoPunVensFK_IdBanco();

			this.inicializarActualizarBindingCuentaBancoPunVen(false);

			//if(CuentaBancoPunVenBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingCuentaBancoPunVen(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentabancopunvenLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentabancopunvenLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CuentaBancoPunVenConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentabancopunvenLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdClienteCuentaBancoPunVenActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentabancopunvenLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingCuentaBancoPunVen(false,false);

			this.getCuentaBancoPunVensFK_IdCliente();

			this.inicializarActualizarBindingCuentaBancoPunVen(false);

			//if(CuentaBancoPunVenBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingCuentaBancoPunVen(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentabancopunvenLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentabancopunvenLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CuentaBancoPunVenConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentabancopunvenLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdCuentaContableCuentaBancoPunVenActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentabancopunvenLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingCuentaBancoPunVen(false,false);

			this.getCuentaBancoPunVensFK_IdCuentaContable();

			this.inicializarActualizarBindingCuentaBancoPunVen(false);

			//if(CuentaBancoPunVenBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingCuentaBancoPunVen(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentabancopunvenLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentabancopunvenLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CuentaBancoPunVenConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentabancopunvenLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaCuentaBancoPunVenActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentabancopunvenLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingCuentaBancoPunVen(false,false);

			this.getCuentaBancoPunVensFK_IdEmpresa();

			this.inicializarActualizarBindingCuentaBancoPunVen(false);

			//if(CuentaBancoPunVenBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingCuentaBancoPunVen(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentabancopunvenLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentabancopunvenLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CuentaBancoPunVenConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentabancopunvenLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdSucursalCuentaBancoPunVenActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentabancopunvenLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingCuentaBancoPunVen(false,false);

			this.getCuentaBancoPunVensFK_IdSucursal();

			this.inicializarActualizarBindingCuentaBancoPunVen(false);

			//if(CuentaBancoPunVenBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingCuentaBancoPunVen(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentabancopunvenLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentabancopunvenLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CuentaBancoPunVenConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentabancopunvenLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameCuentaBancoPunVen() {
		if(this.jInternalFrameDetalleFormCuentaBancoPunVen!=null) {
		

		if(this.jInternalFrameDetalleFormCuentaBancoPunVen.formapagopuntoventaBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormCuentaBancoPunVen.formapagopuntoventaBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormCuentaBancoPunVen.formapagopuntoventaBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormCuentaBancoPunVen.formapagopuntoventaBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormCuentaBancoPunVen.formapagopuntoventaBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormCuentaBancoPunVen.formapagopuntoventaBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormCuentaBancoPunVen.formapagopuntoventaBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormCuentaBancoPunVen.formapagopuntoventaBeanSwingJInternalFramePopup=null;
		}	
		
		
		}
		
		if(this.jInternalFrameDetalleFormCuentaBancoPunVen!=null) {
			this.jInternalFrameDetalleFormCuentaBancoPunVen.setVisible(false);	    			
			this.jInternalFrameDetalleFormCuentaBancoPunVen.dispose();
			this.jInternalFrameDetalleFormCuentaBancoPunVen=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoCuentaBancoPunVen!=null) {
			this.jInternalFrameReporteDinamicoCuentaBancoPunVen.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoCuentaBancoPunVen.dispose();
			this.jInternalFrameReporteDinamicoCuentaBancoPunVen=null;
		}
		
		if(this.jInternalFrameImportacionCuentaBancoPunVen!=null) {
			this.jInternalFrameImportacionCuentaBancoPunVen.setVisible(false);	    			
			this.jInternalFrameImportacionCuentaBancoPunVen.dispose();
			this.jInternalFrameImportacionCuentaBancoPunVen=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessCuentaBancoPunVen();
			
			CuentaBancoPunVenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cuentabancopunven,new Object(),this.cuentabancopunvenParameterGeneral,this.cuentabancopunvenReturnGeneral);
			
			
			if(sTipo.equals("NuevoCuentaBancoPunVen")) {
				jButtonNuevoCuentaBancoPunVenActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarCuentaBancoPunVen")) {
				jButtonDuplicarCuentaBancoPunVenActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarCuentaBancoPunVen")) {
				jButtonCopiarCuentaBancoPunVenActionPerformed(evt);
			} else if(sTipo.equals("VerFormCuentaBancoPunVen")) {
				jButtonVerFormCuentaBancoPunVenActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarCuentaBancoPunVen")) {
				jButtonNuevoCuentaBancoPunVenActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarCuentaBancoPunVen")) {
				jButtonDuplicarCuentaBancoPunVenActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoCuentaBancoPunVen")) {
				jButtonNuevoCuentaBancoPunVenActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarCuentaBancoPunVen")) {
				jButtonDuplicarCuentaBancoPunVenActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesCuentaBancoPunVen")) {
				jButtonNuevoCuentaBancoPunVenActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarCuentaBancoPunVen")) {
				jButtonNuevoCuentaBancoPunVenActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesCuentaBancoPunVen")) {
				jButtonNuevoCuentaBancoPunVenActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarCuentaBancoPunVen")) {
				jButtonModificarCuentaBancoPunVenActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarCuentaBancoPunVen")) {
				jButtonModificarCuentaBancoPunVenActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarCuentaBancoPunVen")) {
				jButtonModificarCuentaBancoPunVenActionPerformed(evt);
			} else if(sTipo.equals("ActualizarCuentaBancoPunVen")) {
				jButtonActualizarCuentaBancoPunVenActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarCuentaBancoPunVen")) {
				jButtonActualizarCuentaBancoPunVenActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarCuentaBancoPunVen")) {
				jButtonActualizarCuentaBancoPunVenActionPerformed(evt);
			} else if(sTipo.equals("EliminarCuentaBancoPunVen")) {
				jButtonEliminarCuentaBancoPunVenActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarCuentaBancoPunVen")) {
				jButtonEliminarCuentaBancoPunVenActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarCuentaBancoPunVen")) {
				jButtonEliminarCuentaBancoPunVenActionPerformed(evt);
			} else if(sTipo.equals("CancelarCuentaBancoPunVen")) {
				jButtonCancelarCuentaBancoPunVenActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarCuentaBancoPunVen")) {
				jButtonCancelarCuentaBancoPunVenActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarCuentaBancoPunVen")) {
				jButtonCancelarCuentaBancoPunVenActionPerformed(evt);
			} else if(sTipo.equals("CerrarCuentaBancoPunVen")) {
				jButtonCerrarCuentaBancoPunVenActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarCuentaBancoPunVen")) {
				jButtonCerrarCuentaBancoPunVenActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarCuentaBancoPunVen")) {
				jButtonCerrarCuentaBancoPunVenActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarCuentaBancoPunVen")) {
				jButtonMostrarOcultarCuentaBancoPunVenActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarCuentaBancoPunVen")) {
				jButtonCancelarCuentaBancoPunVenActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosCuentaBancoPunVen")) {
				jButtonGuardarCambiosCuentaBancoPunVenActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarCuentaBancoPunVen")) {
				jButtonGuardarCambiosCuentaBancoPunVenActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarCuentaBancoPunVen")) {
				jButtonCopiarCuentaBancoPunVenActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarCuentaBancoPunVen")) {
				jButtonVerFormCuentaBancoPunVenActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosCuentaBancoPunVen")) {
				jButtonGuardarCambiosCuentaBancoPunVenActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarCuentaBancoPunVen")) {
				jButtonCopiarCuentaBancoPunVenActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormCuentaBancoPunVen")) {
				jButtonVerFormCuentaBancoPunVenActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaCuentaBancoPunVen")) {
				jButtonGuardarCambiosCuentaBancoPunVenActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarCuentaBancoPunVen")) {
				jButtonGuardarCambiosCuentaBancoPunVenActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaCuentaBancoPunVen")) {
				jButtonGuardarCambiosCuentaBancoPunVenActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionCuentaBancoPunVen")) {
				jButtonRecargarInformacionCuentaBancoPunVenActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarCuentaBancoPunVen")) {
				jButtonRecargarInformacionCuentaBancoPunVenActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionCuentaBancoPunVen")) {
				jButtonRecargarInformacionCuentaBancoPunVenActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresCuentaBancoPunVen")) {
				jButtonAnterioresCuentaBancoPunVenActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarCuentaBancoPunVen")) {
				jButtonAnterioresCuentaBancoPunVenActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreCuentaBancoPunVen")) {
				jButtonAnterioresCuentaBancoPunVenActionPerformed(evt);
			} else if(sTipo.equals("SiguientesCuentaBancoPunVen")) {
				jButtonSiguientesCuentaBancoPunVenActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarCuentaBancoPunVen")) {
				jButtonSiguientesCuentaBancoPunVenActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesCuentaBancoPunVen")) {
				jButtonSiguientesCuentaBancoPunVenActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByCuentaBancoPunVen") || sTipo.equals("MenuItemDetalleAbrirOrderByCuentaBancoPunVen")) {
				jButtonAbrirOrderByCuentaBancoPunVenActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarCuentaBancoPunVen") || sTipo.equals("MenuItemDetalleMostrarOcultarCuentaBancoPunVen")) {
				jButtonMostrarOcultarCuentaBancoPunVenActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosCuentaBancoPunVen")) {
				jButtonNuevoGuardarCambiosCuentaBancoPunVenActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarCuentaBancoPunVen")) {
				jButtonNuevoGuardarCambiosCuentaBancoPunVenActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosCuentaBancoPunVen")) {
				jButtonNuevoGuardarCambiosCuentaBancoPunVenActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoCuentaBancoPunVen")) {
				jButtonCerrarReporteDinamicoCuentaBancoPunVenActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoCuentaBancoPunVen")) {
				jButtonGenerarReporteDinamicoCuentaBancoPunVenActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoCuentaBancoPunVen")) {
				
				jButtonGenerarExcelReporteDinamicoCuentaBancoPunVenActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionCuentaBancoPunVen")) {
				jButtonCerrarImportacionCuentaBancoPunVenActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionCuentaBancoPunVen")) {
				
				jButtonGenerarImportacionCuentaBancoPunVenActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionCuentaBancoPunVen")) {
				
				jButtonAbrirImportacionCuentaBancoPunVenActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesCuentaBancoPunVen")) {
				jComboBoxTiposAccionesCuentaBancoPunVenActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesCuentaBancoPunVen")) {
				jComboBoxTiposRelacionesCuentaBancoPunVenActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioCuentaBancoPunVen")) {
				jComboBoxTiposAccionesCuentaBancoPunVenActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarCuentaBancoPunVen")) {
				
				jComboBoxTiposSeleccionarCuentaBancoPunVenActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralCuentaBancoPunVen")) {
				jTextFieldValorCampoGeneralCuentaBancoPunVenActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByCuentaBancoPunVen")) {
				jButtonAbrirOrderByCuentaBancoPunVenActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarCuentaBancoPunVen")) {
				jButtonAbrirOrderByCuentaBancoPunVenActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByCuentaBancoPunVen")) {
				jButtonCerrarOrderByCuentaBancoPunVenActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idCuentaBancoPunVenBusqueda")) {
				this.jButtonidCuentaBancoPunVenBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaCuentaBancoPunVenUpdate")) {
				this.jButtonid_empresaCuentaBancoPunVenUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaCuentaBancoPunVenBusqueda")) {
				this.jButtonid_empresaCuentaBancoPunVenBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalCuentaBancoPunVenUpdate")) {
				this.jButtonid_sucursalCuentaBancoPunVenUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalCuentaBancoPunVenBusqueda")) {
				this.jButtonid_sucursalCuentaBancoPunVenBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_bancoCuentaBancoPunVenUpdate")) {
				this.jButtonid_bancoCuentaBancoPunVenUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_bancoCuentaBancoPunVenBusqueda")) {
				this.jButtonid_bancoCuentaBancoPunVenBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_clienteCuentaBancoPunVen")) {
				this.jButtonid_clienteCuentaBancoPunVenActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_clienteCuentaBancoPunVenUpdate")) {
				this.jButtonid_clienteCuentaBancoPunVenUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_clienteCuentaBancoPunVenBusqueda")) {
				this.jButtonid_clienteCuentaBancoPunVenBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_cuenta_contableCuentaBancoPunVenUpdate")) {
				this.jButtonid_cuenta_contableCuentaBancoPunVenUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_cuenta_contableCuentaBancoPunVenBusqueda")) {
				this.jButtonid_cuenta_contableCuentaBancoPunVenBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoCuentaBancoPunVenBusqueda")) {
				this.jButtoncodigoCuentaBancoPunVenBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreCuentaBancoPunVenBusqueda")) {
				this.jButtonnombreCuentaBancoPunVenBusquedaActionPerformed(evt);
			}
			
			
			else if(sTipo.equals("id_clienteCuentaBancoPunVen")) {
				this.jButtonid_clienteCuentaBancoPunVenActionPerformed(evt);
			}
			
			
			else if(sTipo.equals("FK_IdBancoCuentaBancoPunVen")) {
				this.jButtonFK_IdBancoCuentaBancoPunVenActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdClienteCuentaBancoPunVen")) {
				this.jButtonFK_IdClienteCuentaBancoPunVenActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdCuentaContableCuentaBancoPunVen")) {
				this.jButtonFK_IdCuentaContableCuentaBancoPunVenActionPerformed(evt);
			}
			
			;
			
			
			CuentaBancoPunVenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cuentabancopunven,new Object(),this.cuentabancopunvenParameterGeneral,this.cuentabancopunvenReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CuentaBancoPunVenConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessCuentaBancoPunVen();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCuentaBancoPunVenActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cuentabancopunven);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cuentabancopunven);
				
				CuentaBancoPunVenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cuentabancopunven,new Object(),this.cuentabancopunvenParameterGeneral,this.cuentabancopunvenReturnGeneral);
				
				


				
				CuentaBancoPunVenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cuentabancopunven,new Object(),this.cuentabancopunvenParameterGeneral,this.cuentabancopunvenReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CuentaBancoPunVen.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CuentaBancoPunVen.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,CuentaBancoPunVenConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			CuentaBancoPunVen cuentabancopunvenLocal=null;
			
			if(!this.getEsControlTabla()) {
				cuentabancopunvenLocal=this.cuentabancopunven;
			} else {
				cuentabancopunvenLocal=this.cuentabancopunvenAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CuentaBancoPunVenConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cuentabancopunven);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cuentabancopunven);
				
				CuentaBancoPunVenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cuentabancopunven,new Object(),this.cuentabancopunvenParameterGeneral,this.cuentabancopunvenReturnGeneral);
							
				
				


				
				CuentaBancoPunVenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cuentabancopunven,new Object(),this.cuentabancopunvenParameterGeneral,this.cuentabancopunvenReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CuentaBancoPunVen.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CuentaBancoPunVen.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CuentaBancoPunVenConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCuentaBancoPunVenActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosCuentaBancoPunVen.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuentabancopunvenAnterior =(CuentaBancoPunVen) this.cuentabancopunvenLogic.getCuentaBancoPunVens().toArray()[this.jTableDatosCuentaBancoPunVen.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.cuentabancopunvenAnterior =(CuentaBancoPunVen) this.cuentabancopunvens.toArray()[this.jTableDatosCuentaBancoPunVen.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CuentaBancoPunVenConstantesFunciones.CLASSNAME);
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
			
			CuentaBancoPunVenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cuentabancopunven,new Object(),this.cuentabancopunvenParameterGeneral,this.cuentabancopunvenReturnGeneral);
			
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
			
			


			
			CuentaBancoPunVenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cuentabancopunven,new Object(),this.cuentabancopunvenParameterGeneral,this.cuentabancopunvenReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CuentaBancoPunVenConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CuentaBancoPunVenConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CuentaBancoPunVenConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCuentaBancoPunVenActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cuentabancopunven);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cuentabancopunven);
				
				CuentaBancoPunVenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cuentabancopunven,new Object(),this.cuentabancopunvenParameterGeneral,this.cuentabancopunvenReturnGeneral);
								
						
				


				
				CuentaBancoPunVenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cuentabancopunven,new Object(),this.cuentabancopunvenParameterGeneral,this.cuentabancopunvenReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CuentaBancoPunVen.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CuentaBancoPunVen.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CuentaBancoPunVenConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cuentabancopunven);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cuentabancopunven);
				
				CuentaBancoPunVenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cuentabancopunven,new Object(),this.cuentabancopunvenParameterGeneral,this.cuentabancopunvenReturnGeneral);
								
				
				


				
				CuentaBancoPunVenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cuentabancopunven,new Object(),this.cuentabancopunvenParameterGeneral,this.cuentabancopunvenReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CuentaBancoPunVen.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CuentaBancoPunVen.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CuentaBancoPunVenConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCuentaBancoPunVenActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosCuentaBancoPunVen.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuentabancopunvenAnterior =(CuentaBancoPunVen) this.cuentabancopunvenLogic.getCuentaBancoPunVens().toArray()[this.jTableDatosCuentaBancoPunVen.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.cuentabancopunvenAnterior =(CuentaBancoPunVen) this.cuentabancopunvens.toArray()[this.jTableDatosCuentaBancoPunVen.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CuentaBancoPunVenConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cuentabancopunven);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cuentabancopunven);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CuentaBancoPunVenConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCuentaBancoPunVenActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosCuentaBancoPunVen.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuentabancopunvenAnterior =(CuentaBancoPunVen) this.cuentabancopunvenLogic.getCuentaBancoPunVens().toArray()[this.jTableDatosCuentaBancoPunVen.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.cuentabancopunvenAnterior =(CuentaBancoPunVen) this.cuentabancopunvens.toArray()[this.jTableDatosCuentaBancoPunVen.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CuentaBancoPunVenConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCuentaBancoPunVenActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.cuentabancopunven);
			
			this.actualizarInformacion("INFO_PADRE",false,this.cuentabancopunven);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CuentaBancoPunVenConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cuentabancopunven);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cuentabancopunven);
				
				CuentaBancoPunVenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cuentabancopunven,new Object(),this.cuentabancopunvenParameterGeneral,this.cuentabancopunvenReturnGeneral);
							
				
				


				
				CuentaBancoPunVenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cuentabancopunven,new Object(),this.cuentabancopunvenParameterGeneral,this.cuentabancopunvenReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CuentaBancoPunVen.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CuentaBancoPunVen.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CuentaBancoPunVenConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCuentaBancoPunVenActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosCuentaBancoPunVen.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cuentabancopunvenAnterior =(CuentaBancoPunVen) this.cuentabancopunvenLogic.getCuentaBancoPunVens().toArray()[this.jTableDatosCuentaBancoPunVen.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.cuentabancopunvenAnterior =(CuentaBancoPunVen) this.cuentabancopunvens.toArray()[this.jTableDatosCuentaBancoPunVen.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CuentaBancoPunVenConstantesFunciones.CLASSNAME);
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
			
			CuentaBancoPunVenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cuentabancopunven,new Object(),this.cuentabancopunvenParameterGeneral,this.cuentabancopunvenReturnGeneral);
			
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
			
			


			
			CuentaBancoPunVenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cuentabancopunven,new Object(),this.cuentabancopunvenParameterGeneral,this.cuentabancopunvenReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CuentaBancoPunVenConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CuentaBancoPunVenConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CuentaBancoPunVenConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCuentaBancoPunVenActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.cuentabancopunven);
			
			this.actualizarInformacion("INFO_PADRE",false,this.cuentabancopunven);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CuentaBancoPunVenConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cuentabancopunven);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cuentabancopunven);
				
				CuentaBancoPunVenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cuentabancopunven,new Object(),this.cuentabancopunvenParameterGeneral,this.cuentabancopunvenReturnGeneral);
								
				
				


				
				CuentaBancoPunVenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cuentabancopunven,new Object(),this.cuentabancopunvenParameterGeneral,this.cuentabancopunvenReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CuentaBancoPunVen.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CuentaBancoPunVen.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CuentaBancoPunVenConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCuentaBancoPunVenActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosCuentaBancoPunVen.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuentabancopunvenAnterior =(CuentaBancoPunVen) this.cuentabancopunvenLogic.getCuentaBancoPunVens().toArray()[this.jTableDatosCuentaBancoPunVen.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.cuentabancopunvenAnterior =(CuentaBancoPunVen) this.cuentabancopunvens.toArray()[this.jTableDatosCuentaBancoPunVen.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CuentaBancoPunVenConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCuentaBancoPunVenActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.cuentabancopunven);
			
			this.actualizarInformacion("INFO_PADRE",false,this.cuentabancopunven);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CuentaBancoPunVenConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCuentaBancoPunVenActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cuentabancopunven);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cuentabancopunven);
				
				CuentaBancoPunVenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cuentabancopunven,new Object(),this.cuentabancopunvenParameterGeneral,this.cuentabancopunvenReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosCuentaBancoPunVen")) {
					jCheckBoxSeleccionarTodosCuentaBancoPunVenItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosCuentaBancoPunVen")) {
					jCheckBoxSeleccionadosCuentaBancoPunVenItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarCuentaBancoPunVen")) {
					
				}
				
				


				
				
				CuentaBancoPunVenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cuentabancopunven,new Object(),this.cuentabancopunvenParameterGeneral,this.cuentabancopunvenReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CuentaBancoPunVen.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CuentaBancoPunVen.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CuentaBancoPunVenConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.cuentabancopunven);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.cuentabancopunven);
				
				CuentaBancoPunVenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cuentabancopunven,new Object(),this.cuentabancopunvenParameterGeneral,this.cuentabancopunvenReturnGeneral);
												
				
				


				
				
				CuentaBancoPunVenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cuentabancopunven,new Object(),this.cuentabancopunvenParameterGeneral,this.cuentabancopunvenReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CuentaBancoPunVen.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CuentaBancoPunVen.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CuentaBancoPunVenConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCuentaBancoPunVenActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosCuentaBancoPunVen.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cuentabancopunvenAnterior =(CuentaBancoPunVen) this.cuentabancopunvenLogic.getCuentaBancoPunVens().toArray()[this.jTableDatosCuentaBancoPunVen.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.cuentabancopunvenAnterior =(CuentaBancoPunVen) this.cuentabancopunvens.toArray()[this.jTableDatosCuentaBancoPunVen.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CuentaBancoPunVenConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCuentaBancoPunVenActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cuentabancopunven);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cuentabancopunven);
				
				CuentaBancoPunVenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cuentabancopunven,new Object(),this.cuentabancopunvenParameterGeneral,this.cuentabancopunvenReturnGeneral);
				
				
				CuentaBancoPunVenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cuentabancopunven,new Object(),this.cuentabancopunvenParameterGeneral,this.cuentabancopunvenReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CuentaBancoPunVenConstantesFunciones.CLASSNAME);
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
			
			CuentaBancoPunVenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.cuentabancopunven,new Object(),this.cuentabancopunvenParameterGeneral,this.cuentabancopunvenReturnGeneral);
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
			
			


			
			CuentaBancoPunVenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cuentabancopunven,new Object(),this.cuentabancopunvenParameterGeneral,this.cuentabancopunvenReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CuentaBancoPunVenConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCuentaBancoPunVenActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cuentabancopunven);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cuentabancopunven);
				
				CuentaBancoPunVenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.cuentabancopunven,new Object(),this.cuentabancopunvenParameterGeneral,this.cuentabancopunvenReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				CuentaBancoPunVenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cuentabancopunven,new Object(),this.cuentabancopunvenParameterGeneral,this.cuentabancopunvenReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CuentaBancoPunVen.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CuentaBancoPunVen.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CuentaBancoPunVenConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cuentabancopunven);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cuentabancopunven);
				
				CuentaBancoPunVenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.cuentabancopunven,new Object(),this.cuentabancopunvenParameterGeneral,this.cuentabancopunvenReturnGeneral);
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
				
				


				
				CuentaBancoPunVenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cuentabancopunven,new Object(),this.cuentabancopunvenParameterGeneral,this.cuentabancopunvenReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CuentaBancoPunVen.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CuentaBancoPunVen.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CuentaBancoPunVenConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCuentaBancoPunVenActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosCuentaBancoPunVen.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuentabancopunvenAnterior =(CuentaBancoPunVen) this.cuentabancopunvenLogic.getCuentaBancoPunVens().toArray()[this.jTableDatosCuentaBancoPunVen.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.cuentabancopunvenAnterior =(CuentaBancoPunVen) this.cuentabancopunvens.toArray()[this.jTableDatosCuentaBancoPunVen.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CuentaBancoPunVenConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				CuentaBancoPunVenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cuentabancopunven,new Object(),this.cuentabancopunvenParameterGeneral,this.cuentabancopunvenReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarCuentaBancoPunVen")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosCuentaBancoPunVenListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosCuentaBancoPunVen.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.cuentabancopunven =(CuentaBancoPunVen) this.cuentabancopunvenLogic.getCuentaBancoPunVens().toArray()[this.jTableDatosCuentaBancoPunVen.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.cuentabancopunven =(CuentaBancoPunVen) this.cuentabancopunvens.toArray()[this.jTableDatosCuentaBancoPunVen.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.cuentabancopunven);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarCuentaBancoPunVen")) {
				
				}
				
				CuentaBancoPunVenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cuentabancopunven,new Object(),this.cuentabancopunvenParameterGeneral,this.cuentabancopunvenReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CuentaBancoPunVenConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			CuentaBancoPunVenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.cuentabancopunven,new Object(),this.cuentabancopunvenParameterGeneral,this.cuentabancopunvenReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarCuentaBancoPunVen")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosCuentaBancoPunVen.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarCuentaBancoPunVen")) {
			
			}
			
			CuentaBancoPunVenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.cuentabancopunven,new Object(),this.cuentabancopunvenParameterGeneral,this.cuentabancopunvenReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CuentaBancoPunVenConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessCuentaBancoPunVen();
			
			CuentaBancoPunVenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cuentabancopunven,new Object(),this.cuentabancopunvenParameterGeneral,this.cuentabancopunvenReturnGeneral);
			
			if(sTipo.equals("NuevoCuentaBancoPunVen")) {
				jButtonNuevoCuentaBancoPunVenActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarCuentaBancoPunVen")) {
				jButtonDuplicarCuentaBancoPunVenActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarCuentaBancoPunVen")) {
				jButtonCopiarCuentaBancoPunVenActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormCuentaBancoPunVen")) {
				jButtonVerFormCuentaBancoPunVenActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesCuentaBancoPunVen")) {
				jButtonNuevoCuentaBancoPunVenActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarCuentaBancoPunVen")) {
				jButtonModificarCuentaBancoPunVenActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarCuentaBancoPunVen")) {
				jButtonActualizarCuentaBancoPunVenActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarCuentaBancoPunVen")) {
				jButtonEliminarCuentaBancoPunVenActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaCuentaBancoPunVen")) {
				jButtonGuardarCambiosCuentaBancoPunVenActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarCuentaBancoPunVen")) {
				jButtonCancelarCuentaBancoPunVenActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarCuentaBancoPunVen")) {
				jButtonCerrarCuentaBancoPunVenActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosCuentaBancoPunVen")) {
				jButtonGuardarCambiosCuentaBancoPunVenActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosCuentaBancoPunVen")) {
				jButtonNuevoGuardarCambiosCuentaBancoPunVenActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByCuentaBancoPunVen")) {
				jButtonAbrirOrderByCuentaBancoPunVenActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionCuentaBancoPunVen")) {
				jButtonRecargarInformacionCuentaBancoPunVenActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresCuentaBancoPunVen")) {
				jButtonAnterioresCuentaBancoPunVenActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesCuentaBancoPunVen")) {
				jButtonSiguientesCuentaBancoPunVenActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idCuentaBancoPunVenBusqueda")) {
				this.jButtonidCuentaBancoPunVenBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaCuentaBancoPunVenUpdate")) {
				this.jButtonid_empresaCuentaBancoPunVenUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaCuentaBancoPunVenBusqueda")) {
				this.jButtonid_empresaCuentaBancoPunVenBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalCuentaBancoPunVenUpdate")) {
				this.jButtonid_sucursalCuentaBancoPunVenUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalCuentaBancoPunVenBusqueda")) {
				this.jButtonid_sucursalCuentaBancoPunVenBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_bancoCuentaBancoPunVenUpdate")) {
				this.jButtonid_bancoCuentaBancoPunVenUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_bancoCuentaBancoPunVenBusqueda")) {
				this.jButtonid_bancoCuentaBancoPunVenBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_clienteCuentaBancoPunVen")) {
				this.jButtonid_clienteCuentaBancoPunVenActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_clienteCuentaBancoPunVenUpdate")) {
				this.jButtonid_clienteCuentaBancoPunVenUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_clienteCuentaBancoPunVenBusqueda")) {
				this.jButtonid_clienteCuentaBancoPunVenBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_cuenta_contableCuentaBancoPunVenUpdate")) {
				this.jButtonid_cuenta_contableCuentaBancoPunVenUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_cuenta_contableCuentaBancoPunVenBusqueda")) {
				this.jButtonid_cuenta_contableCuentaBancoPunVenBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoCuentaBancoPunVenBusqueda")) {
				this.jButtoncodigoCuentaBancoPunVenBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreCuentaBancoPunVenBusqueda")) {
				this.jButtonnombreCuentaBancoPunVenBusquedaActionPerformed(evt);
			}
			
			CuentaBancoPunVenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cuentabancopunven,new Object(),this.cuentabancopunvenParameterGeneral,this.cuentabancopunvenReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CuentaBancoPunVenConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessCuentaBancoPunVen();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			CuentaBancoPunVenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.cuentabancopunven,new Object(),this.cuentabancopunvenParameterGeneral,this.cuentabancopunvenReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameCuentaBancoPunVen")) {
				closingInternalFrameCuentaBancoPunVen();
				
			} else if(sTipo.equals("jButtonCancelarCuentaBancoPunVen")) {
				JInternalFrameBase jInternalFrameDetalleFormCuentaBancoPunVen = (JInternalFrameBase)evt.getSource();
	            	
	            CuentaBancoPunVenBeanSwingJInternalFrame jInternalFrameParent=(CuentaBancoPunVenBeanSwingJInternalFrame)jInternalFrameDetalleFormCuentaBancoPunVen.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarCuentaBancoPunVenActionPerformed(null);
			}
			
			CuentaBancoPunVenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.cuentabancopunven,new Object(),this.cuentabancopunvenParameterGeneral,this.cuentabancopunvenReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CuentaBancoPunVenConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormCuentaBancoPunVen(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormCuentaBancoPunVen(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormCuentaBancoPunVen(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.cuentabancopunven)) {
			if(!esControlTabla) {
				if(CuentaBancoPunVenJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualCuentaBancoPunVen(this.cuentabancopunven,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysCuentaBancoPunVen(this.cuentabancopunven);			
				}
				
				if(this.cuentabancopunvenSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualCuentaBancoPunVen(this.cuentabancopunven,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.cuentabancopunvenReturnGeneral=cuentabancopunvenLogic.procesarEventosCuentaBancoPunVensWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.cuentabancopunvenLogic.getCuentaBancoPunVens(),this.cuentabancopunven,this.cuentabancopunvenParameterGeneral,this.isEsNuevoCuentaBancoPunVen,classes);//this.cuentabancopunvenLogic.getCuentaBancoPunVen()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanCuentaBancoPunVen(this.cuentabancopunvenReturnGeneral,this.cuentabancopunvenBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.cuentabancopunvenSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanCuentaBancoPunVen(classes,this.cuentabancopunvenReturnGeneral,this.cuentabancopunvenBean,false);
					}
						
					if(this.cuentabancopunvenReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyCuentaBancoPunVen(this.cuentabancopunvenReturnGeneral.getCuentaBancoPunVen());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioCuentaBancoPunVen(this.cuentabancopunvenReturnGeneral.getCuentaBancoPunVen());	
					}
						
					if(this.cuentabancopunvenReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioCuentaBancoPunVen(this.cuentabancopunvenReturnGeneral.getCuentaBancoPunVen(),classes);//this.cuentabancopunvenBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioCuentaBancoPunVen(this.cuentabancopunven,classes);//this.cuentabancopunvenBean);									
				}
			
				if(CuentaBancoPunVenJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualCuentaBancoPunVen(this.cuentabancopunven,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysCuentaBancoPunVen(this.cuentabancopunven);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.cuentabancopunvenAnterior!=null) {
						this.cuentabancopunven=this.cuentabancopunvenAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.cuentabancopunvenReturnGeneral=cuentabancopunvenLogic.procesarEventosCuentaBancoPunVensWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.cuentabancopunvenLogic.getCuentaBancoPunVens(),this.cuentabancopunven,this.cuentabancopunvenParameterGeneral,this.isEsNuevoCuentaBancoPunVen,classes);//this.cuentabancopunvenLogic.getCuentaBancoPunVen()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.cuentabancopunvenSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.cuentabancopunvenSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.cuentabancopunvenReturnGeneral.getCuentaBancoPunVen(),cuentabancopunvenLogic.getCuentaBancoPunVens());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.cuentabancopunvenReturnGeneral.getCuentaBancoPunVen(),this.cuentabancopunvens);
				}
				//ARCHITECTURE
				
				//this.jTableDatosCuentaBancoPunVen.repaint();
				
				//((AbstractTableModel) this.jTableDatosCuentaBancoPunVen.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosCuentaBancoPunVen();
			}
		}
	}
	
	public void actualizarVisualTableDatosCuentaBancoPunVen() throws Exception {
		
		CuentaBancoPunVenModel cuentabancopunvenModel=(CuentaBancoPunVenModel)this.jTableDatosCuentaBancoPunVen.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			cuentabancopunvenModel.cuentabancopunvens=this.cuentabancopunvenLogic.getCuentaBancoPunVens();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			cuentabancopunvenModel.cuentabancopunvens=this.cuentabancopunvens;
		}
		
		
		((CuentaBancoPunVenModel) this.jTableDatosCuentaBancoPunVen.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaCuentaBancoPunVen() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getcuentabancopunvenAnterior(),this.cuentabancopunvenLogic.getCuentaBancoPunVens());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getcuentabancopunvenAnterior(),this.cuentabancopunvens);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosCuentaBancoPunVen();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioCuentaBancoPunVen(CuentaBancoPunVen cuentabancopunven,ArrayList<Classe> classes) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(FormaPagoPuntoVenta.class)) {
					this.jInternalFrameDetalleFormCuentaBancoPunVen.formapagopuntoventaBeanSwingJInternalFrame.formapagopuntoventaLogic.setFormaPagoPuntoVentas(cuentabancopunven.getFormaPagoPuntoVentas());
					this.jInternalFrameDetalleFormCuentaBancoPunVen.formapagopuntoventaBeanSwingJInternalFrame.inicializarActualizarBindingTablaFormaPagoPuntoVenta(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CuentaBancoPunVenConstantesFunciones.CLASSNAME);
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
										
				CuentaBancoPunVenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.cuentabancopunven,new Object(),generalEntityParameterGeneral,this.cuentabancopunvenReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.cuentabancopunvenSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=CuentaBancoPunVenConstantesFunciones.getClassesRelationshipsOfCuentaBancoPunVen(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=CuentaBancoPunVenConstantesFunciones.getClassesRelationshipsFromStringsOfCuentaBancoPunVen(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormCuentaBancoPunVen(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				CuentaBancoPunVenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.cuentabancopunven,new Object(),generalEntityParameterGeneral,this.cuentabancopunvenReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CuentaBancoPunVenConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioCuentaBancoPunVen(CuentaBancoPunVenBean cuentabancopunvenBean) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(FormaPagoPuntoVenta.class)) {
					this.jInternalFrameDetalleFormCuentaBancoPunVen.formapagopuntoventaBeanSwingJInternalFrame.formapagopuntoventaLogic.setFormaPagoPuntoVentas(cuentabancopunven.getFormaPagoPuntoVentas());
					this.jInternalFrameDetalleFormCuentaBancoPunVen.formapagopuntoventaBeanSwingJInternalFrame.inicializarActualizarBindingTablaFormaPagoPuntoVenta(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CuentaBancoPunVenConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanCuentaBancoPunVen(ArrayList<Classe> classes,CuentaBancoPunVenReturnGeneral cuentabancopunvenReturnGeneral,CuentaBancoPunVenBean cuentabancopunvenBean,Boolean conDefault) throws Exception {
		
			this.cuentabancopunvenBean.setFormaPagoPuntoVentas(cuentabancopunvenReturnGeneral.getCuentaBancoPunVen().getFormaPagoPuntoVentas());
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualCuentaBancoPunVen(CuentaBancoPunVen cuentabancopunven,ArrayList<Classe> classes) throws Exception {
		
			for(Classe clas:classes) {
				if(clas.clas.equals(FormaPagoPuntoVenta.class)) {
					cuentabancopunven.setFormaPagoPuntoVentas(this.jInternalFrameDetalleFormCuentaBancoPunVen.formapagopuntoventaBeanSwingJInternalFrame.formapagopuntoventaLogic.getFormaPagoPuntoVentas());
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
		if(!paraTabla && !this.permiteMantenimiento(this.cuentabancopunven)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormCuentaBancoPunVen = new CuentaBancoPunVenDetalleFormJInternalFrame(jDesktopPane,this.cuentabancopunvenSessionBean.getConGuardarRelaciones(),this.cuentabancopunvenSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormCuentaBancoPunVen);
		this.jInternalFrameDetalleFormCuentaBancoPunVen.setVisible(false);
		this.jInternalFrameDetalleFormCuentaBancoPunVen.setSelected(false);						
		
		this.jInternalFrameDetalleFormCuentaBancoPunVen.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormCuentaBancoPunVen.cuentabancopunvenLogic=this.cuentabancopunvenLogic;
		
		this.cargarCombosFrameForeignKeyCuentaBancoPunVen("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleCuentaBancoPunVen();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleCuentaBancoPunVen();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyCuentaBancoPunVen("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyCuentaBancoPunVen();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormCuentaBancoPunVen.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarCuentaBancoPunVen"));
		
		this.jInternalFrameDetalleFormCuentaBancoPunVen.jButtonModificarCuentaBancoPunVen.addActionListener(new ButtonActionListener(this,"ModificarCuentaBancoPunVen"));

		
		this.jInternalFrameDetalleFormCuentaBancoPunVen.jButtonModificarToolBarCuentaBancoPunVen.addActionListener(new ButtonActionListener(this,"ModificarToolBarCuentaBancoPunVen"));
					
		this.jInternalFrameDetalleFormCuentaBancoPunVen.jMenuItemModificarCuentaBancoPunVen.addActionListener(new ButtonActionListener(this,"MenuItemModificarCuentaBancoPunVen"));		
		
		
		
		this.jInternalFrameDetalleFormCuentaBancoPunVen.jButtonActualizarCuentaBancoPunVen.addActionListener (new ButtonActionListener(this,"ActualizarCuentaBancoPunVen"));
		
		
		this.jInternalFrameDetalleFormCuentaBancoPunVen.jButtonActualizarToolBarCuentaBancoPunVen.addActionListener(new ButtonActionListener(this,"ActualizarToolBarCuentaBancoPunVen"));
						
		this.jInternalFrameDetalleFormCuentaBancoPunVen.jMenuItemActualizarCuentaBancoPunVen.addActionListener (new ButtonActionListener(this,"MenuItemActualizarCuentaBancoPunVen"));		
		
		
		
		this.jInternalFrameDetalleFormCuentaBancoPunVen.jButtonEliminarCuentaBancoPunVen.addActionListener (new ButtonActionListener(this,"EliminarCuentaBancoPunVen"));
		
		
		this.jInternalFrameDetalleFormCuentaBancoPunVen.jButtonEliminarToolBarCuentaBancoPunVen.addActionListener (new ButtonActionListener(this,"EliminarToolBarCuentaBancoPunVen"));
								
		this.jInternalFrameDetalleFormCuentaBancoPunVen.jMenuItemEliminarCuentaBancoPunVen.addActionListener (new ButtonActionListener(this,"MenuItemEliminarCuentaBancoPunVen"));		
		
		
		
		this.jInternalFrameDetalleFormCuentaBancoPunVen.jButtonCancelarCuentaBancoPunVen.addActionListener (new ButtonActionListener(this,"CancelarCuentaBancoPunVen"));
		
		
		this.jInternalFrameDetalleFormCuentaBancoPunVen.jButtonCancelarToolBarCuentaBancoPunVen.addActionListener (new ButtonActionListener(this,"CancelarToolBarCuentaBancoPunVen"));
					
		this.jInternalFrameDetalleFormCuentaBancoPunVen.jMenuItemCancelarCuentaBancoPunVen.addActionListener (new ButtonActionListener(this,"MenuItemCancelarCuentaBancoPunVen"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormCuentaBancoPunVen.jMenuItemDetalleCerrarCuentaBancoPunVen.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarCuentaBancoPunVen"));		
		
		
		
		this.jInternalFrameDetalleFormCuentaBancoPunVen.jButtonGuardarCambiosToolBarCuentaBancoPunVen.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarCuentaBancoPunVen"));
		
		
		
		this.jInternalFrameDetalleFormCuentaBancoPunVen.jButtonGuardarCambiosToolBarCuentaBancoPunVen.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarCuentaBancoPunVen"));
		
		
		
		this.jInternalFrameDetalleFormCuentaBancoPunVen.jComboBoxTiposAccionesFormularioCuentaBancoPunVen.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioCuentaBancoPunVen"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCuentaBancoPunVen.jButtonidCuentaBancoPunVenBusqueda.addActionListener(new ButtonActionListener(this,"idCuentaBancoPunVenBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCuentaBancoPunVen.jButtonid_empresaCuentaBancoPunVenUpdate.addActionListener(new ButtonActionListener(this,"id_empresaCuentaBancoPunVenUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCuentaBancoPunVen.jButtonid_empresaCuentaBancoPunVenBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaCuentaBancoPunVenBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCuentaBancoPunVen.jButtonid_sucursalCuentaBancoPunVenUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalCuentaBancoPunVenUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCuentaBancoPunVen.jButtonid_sucursalCuentaBancoPunVenBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalCuentaBancoPunVenBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCuentaBancoPunVen.jButtonid_bancoCuentaBancoPunVenUpdate.addActionListener(new ButtonActionListener(this,"id_bancoCuentaBancoPunVenUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCuentaBancoPunVen.jButtonid_bancoCuentaBancoPunVenBusqueda.addActionListener(new ButtonActionListener(this,"id_bancoCuentaBancoPunVenBusqueda"));
		//jButtonid_clienteCuentaBancoPunVen.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_clienteCuentaBancoPunVenActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormCuentaBancoPunVen.jButtonid_clienteCuentaBancoPunVen.addActionListener(new ButtonActionListener(this,"id_clienteCuentaBancoPunVen"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCuentaBancoPunVen.jButtonid_clienteCuentaBancoPunVenUpdate.addActionListener(new ButtonActionListener(this,"id_clienteCuentaBancoPunVenUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCuentaBancoPunVen.jButtonid_clienteCuentaBancoPunVenBusqueda.addActionListener(new ButtonActionListener(this,"id_clienteCuentaBancoPunVenBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCuentaBancoPunVen.jButtonid_cuenta_contableCuentaBancoPunVenUpdate.addActionListener(new ButtonActionListener(this,"id_cuenta_contableCuentaBancoPunVenUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCuentaBancoPunVen.jButtonid_cuenta_contableCuentaBancoPunVenBusqueda.addActionListener(new ButtonActionListener(this,"id_cuenta_contableCuentaBancoPunVenBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCuentaBancoPunVen.jButtoncodigoCuentaBancoPunVenBusqueda.addActionListener(new ButtonActionListener(this,"codigoCuentaBancoPunVenBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCuentaBancoPunVen.jButtonnombreCuentaBancoPunVenBusqueda.addActionListener(new ButtonActionListener(this,"nombreCuentaBancoPunVenBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormCuentaBancoPunVen.jTabbedPaneRelacionesCuentaBancoPunVen.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesCuentaBancoPunVen"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameCuentaBancoPunVen"));
		
		if(this.jInternalFrameDetalleFormCuentaBancoPunVen!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCuentaBancoPunVen.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarCuentaBancoPunVen"));
		}
		
		this.jTableDatosCuentaBancoPunVen.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarCuentaBancoPunVen"));
		
		this.jTableDatosCuentaBancoPunVen.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarCuentaBancoPunVen"));
		
		this.jButtonNuevoCuentaBancoPunVen.addActionListener(new ButtonActionListener(this,"NuevoCuentaBancoPunVen"));
		
		this.jButtonDuplicarCuentaBancoPunVen.addActionListener(new ButtonActionListener(this,"DuplicarCuentaBancoPunVen"));
		
		this.jButtonCopiarCuentaBancoPunVen.addActionListener(new ButtonActionListener(this,"CopiarCuentaBancoPunVen"));
		
		this.jButtonVerFormCuentaBancoPunVen.addActionListener(new ButtonActionListener(this,"VerFormCuentaBancoPunVen"));
		
		
		this.jButtonNuevoToolBarCuentaBancoPunVen.addActionListener(new ButtonActionListener(this,"NuevoToolBarCuentaBancoPunVen"));
			
		this.jButtonDuplicarToolBarCuentaBancoPunVen.addActionListener(new ButtonActionListener(this,"DuplicarToolBarCuentaBancoPunVen"));
			
		this.jMenuItemNuevoCuentaBancoPunVen.addActionListener (new ButtonActionListener(this,"MenuItemNuevoCuentaBancoPunVen"));
			
		this.jMenuItemDuplicarCuentaBancoPunVen.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarCuentaBancoPunVen"));		
		
		
		this.jButtonNuevoRelacionesCuentaBancoPunVen.addActionListener (new ButtonActionListener(this,"NuevoRelacionesCuentaBancoPunVen"));
		
		
		this.jButtonNuevoRelacionesToolBarCuentaBancoPunVen.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarCuentaBancoPunVen"));
			
		this.jMenuItemNuevoRelacionesCuentaBancoPunVen.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesCuentaBancoPunVen"));		
		
		
		if(this.jInternalFrameDetalleFormCuentaBancoPunVen!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCuentaBancoPunVen.jButtonModificarCuentaBancoPunVen.addActionListener(new ButtonActionListener(this,"ModificarCuentaBancoPunVen"));
		}
		
		
		if(this.jInternalFrameDetalleFormCuentaBancoPunVen!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCuentaBancoPunVen.jButtonModificarToolBarCuentaBancoPunVen.addActionListener(new ButtonActionListener(this,"ModificarToolBarCuentaBancoPunVen"));
			
			this.jInternalFrameDetalleFormCuentaBancoPunVen.jMenuItemModificarCuentaBancoPunVen.addActionListener(new ButtonActionListener(this,"MenuItemModificarCuentaBancoPunVen"));		
		}
		
		
		if(this.jInternalFrameDetalleFormCuentaBancoPunVen!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormCuentaBancoPunVen.jButtonActualizarCuentaBancoPunVen.addActionListener (new ButtonActionListener(this,"ActualizarCuentaBancoPunVen"));
		}
		
		
		if(this.jInternalFrameDetalleFormCuentaBancoPunVen!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCuentaBancoPunVen.jButtonActualizarToolBarCuentaBancoPunVen.addActionListener(new ButtonActionListener(this,"ActualizarToolBarCuentaBancoPunVen"));
				
			this.jInternalFrameDetalleFormCuentaBancoPunVen.jMenuItemActualizarCuentaBancoPunVen.addActionListener (new ButtonActionListener(this,"MenuItemActualizarCuentaBancoPunVen"));		
		}
		
		
		if(this.jInternalFrameDetalleFormCuentaBancoPunVen!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCuentaBancoPunVen.jButtonEliminarCuentaBancoPunVen.addActionListener (new ButtonActionListener(this,"EliminarCuentaBancoPunVen"));
		}
		
		
		if(this.jInternalFrameDetalleFormCuentaBancoPunVen!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCuentaBancoPunVen.jButtonEliminarToolBarCuentaBancoPunVen.addActionListener (new ButtonActionListener(this,"EliminarToolBarCuentaBancoPunVen"));
						
			this.jInternalFrameDetalleFormCuentaBancoPunVen.jMenuItemEliminarCuentaBancoPunVen.addActionListener (new ButtonActionListener(this,"MenuItemEliminarCuentaBancoPunVen"));		
		}
		
		
		if(this.jInternalFrameDetalleFormCuentaBancoPunVen!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCuentaBancoPunVen.jButtonCancelarCuentaBancoPunVen.addActionListener (new ButtonActionListener(this,"CancelarCuentaBancoPunVen"));
		}
		
		
		if(this.jInternalFrameDetalleFormCuentaBancoPunVen!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCuentaBancoPunVen.jButtonCancelarToolBarCuentaBancoPunVen.addActionListener (new ButtonActionListener(this,"CancelarToolBarCuentaBancoPunVen"));
			
			this.jInternalFrameDetalleFormCuentaBancoPunVen.jMenuItemCancelarCuentaBancoPunVen.addActionListener (new ButtonActionListener(this,"MenuItemCancelarCuentaBancoPunVen"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarCuentaBancoPunVen.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarCuentaBancoPunVen"));		
		
		
		this.jButtonCerrarCuentaBancoPunVen.addActionListener (new ButtonActionListener(this,"CerrarCuentaBancoPunVen"));
		
		
		this.jButtonCerrarToolBarCuentaBancoPunVen.addActionListener (new ButtonActionListener(this,"CerrarToolBarCuentaBancoPunVen"));
			
		this.jMenuItemCerrarCuentaBancoPunVen.addActionListener (new ButtonActionListener(this,"MenuItemCerrarCuentaBancoPunVen"));
			
		if(this.jInternalFrameDetalleFormCuentaBancoPunVen!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCuentaBancoPunVen.jMenuItemDetalleCerrarCuentaBancoPunVen.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarCuentaBancoPunVen"));		
		}
		
		
		if(this.jInternalFrameDetalleFormCuentaBancoPunVen!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCuentaBancoPunVen.jButtonGuardarCambiosCuentaBancoPunVen.addActionListener (new ButtonActionListener(this,"GuardarCambiosCuentaBancoPunVen"));
		}
		
		
		if(this.jInternalFrameDetalleFormCuentaBancoPunVen!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCuentaBancoPunVen.jButtonGuardarCambiosToolBarCuentaBancoPunVen.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarCuentaBancoPunVen"));
		}
		
		this.jButtonCopiarToolBarCuentaBancoPunVen.addActionListener (new ButtonActionListener(this,"CopiarToolBarCuentaBancoPunVen"));
			
		this.jButtonVerFormToolBarCuentaBancoPunVen.addActionListener (new ButtonActionListener(this,"VerFormToolBarCuentaBancoPunVen"));
		
		this.jMenuItemGuardarCambiosCuentaBancoPunVen.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosCuentaBancoPunVen"));
			
		this.jMenuItemCopiarCuentaBancoPunVen.addActionListener (new ButtonActionListener(this,"MenuItemCopiarCuentaBancoPunVen"));		
		
		this.jMenuItemVerFormCuentaBancoPunVen.addActionListener (new ButtonActionListener(this,"MenuItemVerFormCuentaBancoPunVen"));		
		
		
		this.jButtonGuardarCambiosTablaCuentaBancoPunVen.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaCuentaBancoPunVen"));
		
		
		this.jButtonGuardarCambiosTablaToolBarCuentaBancoPunVen.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarCuentaBancoPunVen"));
			
		this.jMenuItemGuardarCambiosTablaCuentaBancoPunVen.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaCuentaBancoPunVen"));		
		
		
		
		this.jButtonRecargarInformacionCuentaBancoPunVen.addActionListener (new ButtonActionListener(this,"RecargarInformacionCuentaBancoPunVen"));
					
		this.jButtonRecargarInformacionToolBarCuentaBancoPunVen.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarCuentaBancoPunVen"));
		
		this.jMenuItemRecargarInformacionCuentaBancoPunVen.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionCuentaBancoPunVen"));		
		
		
		
		this.jButtonAnterioresCuentaBancoPunVen.addActionListener (new ButtonActionListener(this,"AnterioresCuentaBancoPunVen"));
		
		
		this.jButtonAnterioresToolBarCuentaBancoPunVen.addActionListener (new ButtonActionListener(this,"AnterioresToolBarCuentaBancoPunVen"));
		
		this.jMenuItemAnterioresCuentaBancoPunVen.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresCuentaBancoPunVen"));		
		
		
		this.jButtonSiguientesCuentaBancoPunVen.addActionListener (new ButtonActionListener(this,"SiguientesCuentaBancoPunVen"));
		
		
		this.jButtonSiguientesToolBarCuentaBancoPunVen.addActionListener (new ButtonActionListener(this,"SiguientesToolBarCuentaBancoPunVen"));
			
		this.jMenuItemSiguientesCuentaBancoPunVen.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesCuentaBancoPunVen"));
			
		this.jMenuItemAbrirOrderByCuentaBancoPunVen.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByCuentaBancoPunVen"));
			
		this.jMenuItemMostrarOcultarCuentaBancoPunVen.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarCuentaBancoPunVen"));
			
		this.jMenuItemDetalleAbrirOrderByCuentaBancoPunVen.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByCuentaBancoPunVen"));
			
		this.jMenuItemDetalleMostarOcultarCuentaBancoPunVen.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarCuentaBancoPunVen"));		
		
		
		this.jButtonNuevoGuardarCambiosCuentaBancoPunVen.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosCuentaBancoPunVen"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarCuentaBancoPunVen.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarCuentaBancoPunVen"));
			
		this.jMenuItemNuevoGuardarCambiosCuentaBancoPunVen.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosCuentaBancoPunVen"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosCuentaBancoPunVen.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosCuentaBancoPunVen"));

		this.jCheckBoxSeleccionadosCuentaBancoPunVen.addItemListener(new CheckBoxItemListener(this,"SeleccionadosCuentaBancoPunVen"));
		
		if(this.jInternalFrameDetalleFormCuentaBancoPunVen!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCuentaBancoPunVen.jComboBoxTiposAccionesFormularioCuentaBancoPunVen.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioCuentaBancoPunVen"));
		}
		
		
		this.jComboBoxTiposRelacionesCuentaBancoPunVen.addActionListener (new ButtonActionListener(this,"TiposRelacionesCuentaBancoPunVen"));
			
		this.jComboBoxTiposAccionesCuentaBancoPunVen.addActionListener (new ButtonActionListener(this,"TiposAccionesCuentaBancoPunVen"));
					
		this.jComboBoxTiposSeleccionarCuentaBancoPunVen.addActionListener (new ButtonActionListener(this,"TiposSeleccionarCuentaBancoPunVen"));
			
		this.jTextFieldValorCampoGeneralCuentaBancoPunVen.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralCuentaBancoPunVen"));		
		
		
		if(this.jInternalFrameDetalleFormCuentaBancoPunVen!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCuentaBancoPunVen.jButtonidCuentaBancoPunVenBusqueda.addActionListener(new ButtonActionListener(this,"idCuentaBancoPunVenBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCuentaBancoPunVen.jButtonid_empresaCuentaBancoPunVenUpdate.addActionListener(new ButtonActionListener(this,"id_empresaCuentaBancoPunVenUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCuentaBancoPunVen.jButtonid_empresaCuentaBancoPunVenBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaCuentaBancoPunVenBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCuentaBancoPunVen.jButtonid_sucursalCuentaBancoPunVenUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalCuentaBancoPunVenUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCuentaBancoPunVen.jButtonid_sucursalCuentaBancoPunVenBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalCuentaBancoPunVenBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCuentaBancoPunVen.jButtonid_bancoCuentaBancoPunVenUpdate.addActionListener(new ButtonActionListener(this,"id_bancoCuentaBancoPunVenUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCuentaBancoPunVen.jButtonid_bancoCuentaBancoPunVenBusqueda.addActionListener(new ButtonActionListener(this,"id_bancoCuentaBancoPunVenBusqueda"));
		//jButtonid_clienteCuentaBancoPunVen.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_clienteCuentaBancoPunVenActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormCuentaBancoPunVen.jButtonid_clienteCuentaBancoPunVen.addActionListener(new ButtonActionListener(this,"id_clienteCuentaBancoPunVen"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCuentaBancoPunVen.jButtonid_clienteCuentaBancoPunVenUpdate.addActionListener(new ButtonActionListener(this,"id_clienteCuentaBancoPunVenUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCuentaBancoPunVen.jButtonid_clienteCuentaBancoPunVenBusqueda.addActionListener(new ButtonActionListener(this,"id_clienteCuentaBancoPunVenBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCuentaBancoPunVen.jButtonid_cuenta_contableCuentaBancoPunVenUpdate.addActionListener(new ButtonActionListener(this,"id_cuenta_contableCuentaBancoPunVenUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCuentaBancoPunVen.jButtonid_cuenta_contableCuentaBancoPunVenBusqueda.addActionListener(new ButtonActionListener(this,"id_cuenta_contableCuentaBancoPunVenBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCuentaBancoPunVen.jButtoncodigoCuentaBancoPunVenBusqueda.addActionListener(new ButtonActionListener(this,"codigoCuentaBancoPunVenBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCuentaBancoPunVen.jButtonnombreCuentaBancoPunVenBusqueda.addActionListener(new ButtonActionListener(this,"nombreCuentaBancoPunVenBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonFK_IdBancoCuentaBancoPunVen.addActionListener(new ButtonActionListener(this,"FK_IdBancoCuentaBancoPunVen"));

			this.jButtonFK_IdClienteCuentaBancoPunVen.addActionListener(new ButtonActionListener(this,"FK_IdClienteCuentaBancoPunVen"));

			this.jButtonBuscarFK_IdClienteid_clienteCuentaBancoPunVen.addActionListener(new ButtonActionListener(this,"id_clienteCuentaBancoPunVen"));

			this.jButtonFK_IdCuentaContableCuentaBancoPunVen.addActionListener(new ButtonActionListener(this,"FK_IdCuentaContableCuentaBancoPunVen"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoCuentaBancoPunVen!=null) {
				this.jInternalFrameReporteDinamicoCuentaBancoPunVen.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoCuentaBancoPunVen"));
				this.jInternalFrameReporteDinamicoCuentaBancoPunVen.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoCuentaBancoPunVen"));
				this.jInternalFrameReporteDinamicoCuentaBancoPunVen.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoCuentaBancoPunVen"));
			}
			
			//this.jButtonCerrarReporteDinamicoCuentaBancoPunVen.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoCuentaBancoPunVen"));				
			//this.jButtonGenerarReporteDinamicoCuentaBancoPunVen.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoCuentaBancoPunVen"));
			//this.jButtonGenerarExcelReporteDinamicoCuentaBancoPunVen.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoCuentaBancoPunVen"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionCuentaBancoPunVen!=null) {
				this.jInternalFrameImportacionCuentaBancoPunVen.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionCuentaBancoPunVen"));
				this.jInternalFrameImportacionCuentaBancoPunVen.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionCuentaBancoPunVen"));
				this.jInternalFrameImportacionCuentaBancoPunVen.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionCuentaBancoPunVen"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByCuentaBancoPunVen.addActionListener (new ButtonActionListener(this,"AbrirOrderByCuentaBancoPunVen"));
			
			this.jButtonAbrirOrderByToolBarCuentaBancoPunVen.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarCuentaBancoPunVen"));			
			
			if(this.jInternalFrameOrderByCuentaBancoPunVen!=null) {
				this.jInternalFrameOrderByCuentaBancoPunVen.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByCuentaBancoPunVen"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormCuentaBancoPunVen!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormCuentaBancoPunVen!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCuentaBancoPunVen.jTabbedPaneRelacionesCuentaBancoPunVen.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesCuentaBancoPunVen"));
		
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
            		closingInternalFrameCuentaBancoPunVen();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormCuentaBancoPunVen.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormCuentaBancoPunVen = (JInternalFrameBase)event.getSource();
	            	
	            CuentaBancoPunVenBeanSwingJInternalFrame jInternalFrameParent=(CuentaBancoPunVenBeanSwingJInternalFrame)jInternalFrameDetalleFormCuentaBancoPunVen.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarCuentaBancoPunVenActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosCuentaBancoPunVen.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosCuentaBancoPunVenListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosCuentaBancoPunVen.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosCuentaBancoPunVen.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoCuentaBancoPunVen.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoCuentaBancoPunVenActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarCuentaBancoPunVen.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoCuentaBancoPunVenActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoCuentaBancoPunVen.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoCuentaBancoPunVenActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoCuentaBancoPunVen";
		inputMap = this.jButtonNuevoCuentaBancoPunVen.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoCuentaBancoPunVen.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoCuentaBancoPunVenActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesCuentaBancoPunVen.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoCuentaBancoPunVenActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarCuentaBancoPunVen.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoCuentaBancoPunVenActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesCuentaBancoPunVen.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoCuentaBancoPunVenActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesCuentaBancoPunVen";
		inputMap = this.jButtonNuevoRelacionesCuentaBancoPunVen.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesCuentaBancoPunVen.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoCuentaBancoPunVenActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarCuentaBancoPunVen.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarCuentaBancoPunVenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarCuentaBancoPunVen.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarCuentaBancoPunVenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarCuentaBancoPunVen.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarCuentaBancoPunVenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarCuentaBancoPunVen";
		inputMap = this.jButtonModificarCuentaBancoPunVen.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarCuentaBancoPunVen.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarCuentaBancoPunVenActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarCuentaBancoPunVen.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarCuentaBancoPunVenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarCuentaBancoPunVen.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarCuentaBancoPunVenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarCuentaBancoPunVen.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarCuentaBancoPunVenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarCuentaBancoPunVen";
		inputMap = this.jButtonActualizarCuentaBancoPunVen.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarCuentaBancoPunVen.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarCuentaBancoPunVenActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarCuentaBancoPunVen.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarCuentaBancoPunVenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarCuentaBancoPunVen.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarCuentaBancoPunVenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarCuentaBancoPunVen.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarCuentaBancoPunVenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarCuentaBancoPunVen";
		inputMap = this.jButtonEliminarCuentaBancoPunVen.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarCuentaBancoPunVen.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarCuentaBancoPunVenActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarCuentaBancoPunVen.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarCuentaBancoPunVenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarCuentaBancoPunVen.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarCuentaBancoPunVenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarCuentaBancoPunVen.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarCuentaBancoPunVenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarCuentaBancoPunVen";
		inputMap = this.jButtonCancelarCuentaBancoPunVen.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarCuentaBancoPunVen.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarCuentaBancoPunVenActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarCuentaBancoPunVen.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarCuentaBancoPunVenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarCuentaBancoPunVen.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarCuentaBancoPunVenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarCuentaBancoPunVen.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarCuentaBancoPunVenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarCuentaBancoPunVen.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarCuentaBancoPunVenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarCuentaBancoPunVenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarCuentaBancoPunVen";
		inputMap = this.jButtonCerrarCuentaBancoPunVen.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarCuentaBancoPunVen.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarCuentaBancoPunVenActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormCuentaBancoPunVen.jButtonGuardarCambiosCuentaBancoPunVen.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosCuentaBancoPunVenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarCuentaBancoPunVen.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosCuentaBancoPunVenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosCuentaBancoPunVen.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosCuentaBancoPunVenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaCuentaBancoPunVen.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosCuentaBancoPunVenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarCuentaBancoPunVen.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosCuentaBancoPunVenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaCuentaBancoPunVen.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosCuentaBancoPunVenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosCuentaBancoPunVen";
		inputMap = this.jInternalFrameDetalleFormCuentaBancoPunVen.jButtonGuardarCambiosCuentaBancoPunVen.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormCuentaBancoPunVen.jButtonGuardarCambiosCuentaBancoPunVen.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosCuentaBancoPunVenActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionCuentaBancoPunVen.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionCuentaBancoPunVenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarCuentaBancoPunVen.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionCuentaBancoPunVenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionCuentaBancoPunVen.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionCuentaBancoPunVenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresCuentaBancoPunVen.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresCuentaBancoPunVenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarCuentaBancoPunVen.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresCuentaBancoPunVenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresCuentaBancoPunVen.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresCuentaBancoPunVenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesCuentaBancoPunVen.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesCuentaBancoPunVenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarCuentaBancoPunVen.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesCuentaBancoPunVenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesCuentaBancoPunVen.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesCuentaBancoPunVenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosCuentaBancoPunVen.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosCuentaBancoPunVenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarCuentaBancoPunVen.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosCuentaBancoPunVenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosCuentaBancoPunVen.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosCuentaBancoPunVenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosCuentaBancoPunVen.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosCuentaBancoPunVenItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesCuentaBancoPunVen.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesCuentaBancoPunVenActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarCuentaBancoPunVen.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarCuentaBancoPunVenActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralCuentaBancoPunVen.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralCuentaBancoPunVenActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCuentaBancoPunVen.jButtonidCuentaBancoPunVenBusqueda.addActionListener(new ButtonActionListener(this,"idCuentaBancoPunVenBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCuentaBancoPunVen.jButtonid_empresaCuentaBancoPunVenUpdate.addActionListener(new ButtonActionListener(this,"id_empresaCuentaBancoPunVenUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCuentaBancoPunVen.jButtonid_empresaCuentaBancoPunVenBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaCuentaBancoPunVenBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCuentaBancoPunVen.jButtonid_sucursalCuentaBancoPunVenUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalCuentaBancoPunVenUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCuentaBancoPunVen.jButtonid_sucursalCuentaBancoPunVenBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalCuentaBancoPunVenBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCuentaBancoPunVen.jButtonid_bancoCuentaBancoPunVenUpdate.addActionListener(new ButtonActionListener(this,"id_bancoCuentaBancoPunVenUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCuentaBancoPunVen.jButtonid_bancoCuentaBancoPunVenBusqueda.addActionListener(new ButtonActionListener(this,"id_bancoCuentaBancoPunVenBusqueda"));
		//jButtonid_clienteCuentaBancoPunVen.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_clienteCuentaBancoPunVenActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormCuentaBancoPunVen.jButtonid_clienteCuentaBancoPunVen.addActionListener(new ButtonActionListener(this,"id_clienteCuentaBancoPunVen"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCuentaBancoPunVen.jButtonid_clienteCuentaBancoPunVenUpdate.addActionListener(new ButtonActionListener(this,"id_clienteCuentaBancoPunVenUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCuentaBancoPunVen.jButtonid_clienteCuentaBancoPunVenBusqueda.addActionListener(new ButtonActionListener(this,"id_clienteCuentaBancoPunVenBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCuentaBancoPunVen.jButtonid_cuenta_contableCuentaBancoPunVenUpdate.addActionListener(new ButtonActionListener(this,"id_cuenta_contableCuentaBancoPunVenUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCuentaBancoPunVen.jButtonid_cuenta_contableCuentaBancoPunVenBusqueda.addActionListener(new ButtonActionListener(this,"id_cuenta_contableCuentaBancoPunVenBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCuentaBancoPunVen.jButtoncodigoCuentaBancoPunVenBusqueda.addActionListener(new ButtonActionListener(this,"codigoCuentaBancoPunVenBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCuentaBancoPunVen.jButtonnombreCuentaBancoPunVenBusqueda.addActionListener(new ButtonActionListener(this,"nombreCuentaBancoPunVenBusqueda"));
		
		
		this.jButtonFK_IdBancoCuentaBancoPunVen.addActionListener(new ButtonActionListener(this,"FK_IdBancoCuentaBancoPunVen"));

		this.jButtonFK_IdClienteCuentaBancoPunVen.addActionListener(new ButtonActionListener(this,"FK_IdClienteCuentaBancoPunVen"));

		this.jButtonBuscarFK_IdClienteid_clienteCuentaBancoPunVen.addActionListener(new ButtonActionListener(this,"id_clienteCuentaBancoPunVen"));

		this.jButtonFK_IdCuentaContableCuentaBancoPunVen.addActionListener(new ButtonActionListener(this,"FK_IdCuentaContableCuentaBancoPunVen"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoCuentaBancoPunVen.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoCuentaBancoPunVenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoCuentaBancoPunVen.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoCuentaBancoPunVenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoCuentaBancoPunVen.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoCuentaBancoPunVenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionCuentaBancoPunVen.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionCuentaBancoPunVenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionCuentaBancoPunVen.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionCuentaBancoPunVenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionCuentaBancoPunVen.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionCuentaBancoPunVenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarCuentaBancoPunVenActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarCuentaBancoPunVen.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CuentaBancoPunVenConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosCuentaBancoPunVen(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(CuentaBancoPunVen cuentabancopunvenAux:this.cuentabancopunvenLogic.getCuentaBancoPunVens()) {
					cuentabancopunvenAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(CuentaBancoPunVen cuentabancopunvenAux:cuentabancopunvens) {
					cuentabancopunvenAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CuentaBancoPunVenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosCuentaBancoPunVenItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingCuentaBancoPunVen(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(CuentaBancoPunVen cuentabancopunvenAux:this.cuentabancopunvenLogic.getCuentaBancoPunVens()) {
						cuentabancopunvenAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(CuentaBancoPunVen cuentabancopunvenAux:cuentabancopunvens) {
						cuentabancopunvenAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(CuentaBancoPunVen cuentabancopunvenAux:this.cuentabancopunvenLogic.getCuentaBancoPunVens()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(CuentaBancoPunVen cuentabancopunvenAux:cuentabancopunvens) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaCuentaBancoPunVen(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosCuentaBancoPunVen.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosCuentaBancoPunVen.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosCuentaBancoPunVen,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CuentaBancoPunVenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosCuentaBancoPunVenItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingCuentaBancoPunVen(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosCuentaBancoPunVen.getSelectedRows();
			
			CuentaBancoPunVen cuentabancopunvenLocal=new CuentaBancoPunVen();
			
			//this.seleccionarTodosCuentaBancoPunVen(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					cuentabancopunvenLocal =(CuentaBancoPunVen) this.cuentabancopunvenLogic.getCuentaBancoPunVens().toArray()[this.jTableDatosCuentaBancoPunVen.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					cuentabancopunvenLocal =(CuentaBancoPunVen) this.cuentabancopunvens.toArray()[this.jTableDatosCuentaBancoPunVen.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				cuentabancopunvenLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(CuentaBancoPunVen cuentabancopunvenAux:this.cuentabancopunvenLogic.getCuentaBancoPunVens()) {
						cuentabancopunvenAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(CuentaBancoPunVen cuentabancopunvenAux:cuentabancopunvens) {
						cuentabancopunvenAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaCuentaBancoPunVen(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosCuentaBancoPunVen.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosCuentaBancoPunVen.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosCuentaBancoPunVen,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CuentaBancoPunVenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualCuentaBancoPunVenItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CuentaBancoPunVenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarCuentaBancoPunVenParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CuentaBancoPunVenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralCuentaBancoPunVenActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingCuentaBancoPunVen(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralCuentaBancoPunVen.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(CuentaBancoPunVen cuentabancopunvenAux:this.cuentabancopunvenLogic.getCuentaBancoPunVens()) {
				
						if(sTipoSeleccionar.equals(CuentaBancoPunVenConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							cuentabancopunvenAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(CuentaBancoPunVenConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							cuentabancopunvenAux.setnombre(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(CuentaBancoPunVen cuentabancopunvenAux:cuentabancopunvens) {
					
						if(sTipoSeleccionar.equals(CuentaBancoPunVenConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							cuentabancopunvenAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(CuentaBancoPunVenConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							cuentabancopunvenAux.setnombre(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaCuentaBancoPunVen(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CuentaBancoPunVenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesCuentaBancoPunVenActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingCuentaBancoPunVen(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioCuentaBancoPunVen=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesCuentaBancoPunVen.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormCuentaBancoPunVen.jComboBoxTiposAccionesFormularioCuentaBancoPunVen.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteCuentaBancoPunVen) {				
					conSplash=true;//false;										
					
					//this.startProcessCuentaBancoPunVen(conSplash);
				
					this.generarReporteCuentaBancoPunVensSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesCuentaBancoPunVen.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormCuentaBancoPunVen.jComboBoxTiposAccionesFormularioCuentaBancoPunVen.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoCuentaBancoPunVensSeleccionados();
				//this.jComboBoxTiposAccionesCuentaBancoPunVen.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoCuentaBancoPunVensSeleccionados(false);
				//this.jComboBoxTiposAccionesCuentaBancoPunVen.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoCuentaBancoPunVensSeleccionados(true);
				//this.jComboBoxTiposAccionesCuentaBancoPunVen.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessCuentaBancoPunVen();
				
				this.exportarCuentaBancoPunVensSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesCuentaBancoPunVen.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormCuentaBancoPunVen.jComboBoxTiposAccionesFormularioCuentaBancoPunVen.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionCuentaBancoPunVens();
				//this.importarCuentaBancoPunVens();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesCuentaBancoPunVen.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormCuentaBancoPunVen.jComboBoxTiposAccionesFormularioCuentaBancoPunVen.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessCuentaBancoPunVen();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelCuentaBancoPunVensSeleccionados();
				//this.jComboBoxTiposAccionesCuentaBancoPunVen.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Cuenta Banco", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessCuentaBancoPunVen();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoCuentaBancoPunVen)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyCuentaBancoPunVen(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Cuenta Banco",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesCuentaBancoPunVen.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormCuentaBancoPunVen.jComboBoxTiposAccionesFormularioCuentaBancoPunVen.setSelectedIndex(0);					
				}	
			} 			
			else if(CuentaBancoPunVenBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteCuentaBancoPunVen) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessCuentaBancoPunVen(conSplash);
					
						//this.actualizarParametrosGeneralCuentaBancoPunVen();
						
						this.generarReporteProcesoAccionCuentaBancoPunVensSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesCuentaBancoPunVen.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormCuentaBancoPunVen.jComboBoxTiposAccionesFormularioCuentaBancoPunVen.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(CuentaBancoPunVenBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Cuenta BancoES SELECCIONADOS?", "MANTENIMIENTO DE Cuenta Banco", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessCuentaBancoPunVen();
				
						this.actualizarParametrosGeneralCuentaBancoPunVen();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.cuentabancopunvenReturnGeneral=cuentabancopunvenLogic.procesarAccionCuentaBancoPunVensWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.cuentabancopunvenLogic.getCuentaBancoPunVens(),this.cuentabancopunvenParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarCuentaBancoPunVenReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesCuentaBancoPunVen.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormCuentaBancoPunVen.jComboBoxTiposAccionesFormularioCuentaBancoPunVen.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralCuentaBancoPunVen();
					
					CuentaBancoPunVenBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarCuentaBancoPunVenReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesCuentaBancoPunVen.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormCuentaBancoPunVen.jComboBoxTiposAccionesFormularioCuentaBancoPunVen.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,CuentaBancoPunVenConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessCuentaBancoPunVen(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesCuentaBancoPunVenActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessCuentaBancoPunVen();
			
			if(this.jInternalFrameDetalleFormCuentaBancoPunVen==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<CuentaBancoPunVen> cuentabancopunvensSeleccionados=new ArrayList<CuentaBancoPunVen>();		
			CuentaBancoPunVen cuentabancopunven=new CuentaBancoPunVen();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingCuentaBancoPunVen(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesCuentaBancoPunVen.getSelectedItem();
			
			
			
			
			cuentabancopunvensSeleccionados=this.getCuentaBancoPunVensSeleccionados(true);
			//this.sTipoAccion;
			
			if(cuentabancopunvensSeleccionados.size()==1) {
				for(CuentaBancoPunVen cuentabancopunvenAux:cuentabancopunvensSeleccionados) {
					cuentabancopunven=cuentabancopunvenAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
				else if(this.sTipoRelacion.equals("Forma Pago")) {
					jButtonFormaPagoPuntoVentaActionPerformed(null,rowIndex,true,false,cuentabancopunven);
				}
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CuentaBancoPunVenConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessCuentaBancoPunVen();
			
      		//this.finishProcessCuentaBancoPunVen(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarCuentaBancoPunVenReturnGeneral() throws Exception {
		if(this.cuentabancopunvenReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.cuentabancopunvenReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.cuentabancopunvenReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.cuentabancopunvenReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.cuentabancopunvenReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.cuentabancopunvenReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingCuentaBancoPunVen(false);
		}
		
		if(this.cuentabancopunvenReturnGeneral.getConRetornoLista() || this.cuentabancopunvenReturnGeneral.getConRetornoObjeto()) {
			if(this.cuentabancopunvenReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.cuentabancopunvenLogic.setCuentaBancoPunVens(this.cuentabancopunvenReturnGeneral.getCuentaBancoPunVens());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.cuentabancopunvenReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.cuentabancopunvenLogic.setCuentaBancoPunVen(this.cuentabancopunvenReturnGeneral.getCuentaBancoPunVen());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingCuentaBancoPunVen(false);
		}
	}
	
	public void actualizarParametrosGeneralCuentaBancoPunVen() throws Exception {
		
		
	}
	
	public ArrayList<CuentaBancoPunVen> getCuentaBancoPunVensSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<CuentaBancoPunVen> cuentabancopunvensSeleccionados=new ArrayList<CuentaBancoPunVen>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioCuentaBancoPunVen) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(CuentaBancoPunVen cuentabancopunvenAux:cuentabancopunvenLogic.getCuentaBancoPunVens()) {
					if(cuentabancopunvenAux.getIsSelected()) {
						cuentabancopunvensSeleccionados.add(cuentabancopunvenAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(CuentaBancoPunVen cuentabancopunvenAux:this.cuentabancopunvens) {
					if(cuentabancopunvenAux.getIsSelected()) {
						cuentabancopunvensSeleccionados.add(cuentabancopunvenAux);				
					}
				}
			}
			
			if(cuentabancopunvensSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						cuentabancopunvensSeleccionados.addAll(this.cuentabancopunvenLogic.getCuentaBancoPunVens());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						cuentabancopunvensSeleccionados.addAll(this.cuentabancopunvens);				
					}
				}
			}
		} else {
			cuentabancopunvensSeleccionados.add(this.cuentabancopunven);
		}
		
		return cuentabancopunvensSeleccionados;
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
	
	public void generarReporteCuentaBancoPunVensSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalCuentaBancoPunVensSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoCuentaBancoPunVensSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoCuentaBancoPunVensSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoCuentaBancoPunVensSeleccionados(true);
		}
		else if(this.sTipoReporte.equals("RELACIONES")) {
			//SI SE GENERA REPORTE RELACIONES
			existe=true;
			this.generarReporteRelacionesCuentaBancoPunVensSeleccionados();
		}					
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Cuenta Banco",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesCuentaBancoPunVensSeleccionados() throws Exception {
		ArrayList<CuentaBancoPunVen> cuentabancopunvensSeleccionados=new ArrayList<CuentaBancoPunVen>();		
		
		cuentabancopunvensSeleccionados=this.getCuentaBancoPunVensSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteCuentaBancoPunVens("Todos",cuentabancopunvensSeleccionados);
		
	}	
	
	public void generarReporteNormalCuentaBancoPunVensSeleccionados() throws Exception {
		ArrayList<CuentaBancoPunVen> cuentabancopunvensSeleccionados=new ArrayList<CuentaBancoPunVen>();		
		
		cuentabancopunvensSeleccionados=this.getCuentaBancoPunVensSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteCuentaBancoPunVens("Todos",cuentabancopunvensSeleccionados);
	}		
	
	public void generarReporteProcesoAccionCuentaBancoPunVensSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<CuentaBancoPunVen> cuentabancopunvensSeleccionados=new ArrayList<CuentaBancoPunVen>();
		
		cuentabancopunvensSeleccionados=this.getCuentaBancoPunVensSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteCuentaBancoPunVens("Todos",cuentabancopunvensSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoCuentaBancoPunVensSeleccionados() throws Exception {
		ArrayList<CuentaBancoPunVen> cuentabancopunvensSeleccionados=new ArrayList<CuentaBancoPunVen>();		
		
		
		this.abrirInicializarFrameReporteDinamicoCuentaBancoPunVen();
		
		
		cuentabancopunvensSeleccionados=this.getCuentaBancoPunVensSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoCuentaBancoPunVen();
		
		
		//this.generarReporteCuentaBancoPunVens("Todos",cuentabancopunvensSeleccionados ,cuentabancopunvenImplementable,cuentabancopunvenImplementableHome);
	}
	
	public void mostrarImportacionCuentaBancoPunVens() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionCuentaBancoPunVen();
		
		this.abrirFrameImportacionCuentaBancoPunVen();		
		
			
		//this.generarReporteCuentaBancoPunVens("Todos",cuentabancopunvensSeleccionados ,cuentabancopunvenImplementable,cuentabancopunvenImplementableHome);
	}
	
	public void importarCuentaBancoPunVens() throws Exception {		
	
	}
	
	public void exportarCuentaBancoPunVensSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelCuentaBancoPunVensSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoCuentaBancoPunVensSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlCuentaBancoPunVensSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Cuenta Banco",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoCuentaBancoPunVensSeleccionados() throws Exception {
		ArrayList<CuentaBancoPunVen> cuentabancopunvensSeleccionados=new ArrayList<CuentaBancoPunVen>();		
		
		cuentabancopunvensSeleccionados=this.getCuentaBancoPunVensSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"cuentabancopunven."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarCuentaBancoPunVen(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(CuentaBancoPunVen cuentabancopunvenAux:cuentabancopunvensSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarCuentaBancoPunVen(cuentabancopunvenAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//cuentabancopunvenAux.setsDetalleGeneralEntityReporte(cuentabancopunvenAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cuentabancopunvenSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Cuenta Banco",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarCuentaBancoPunVen(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=CuentaBancoPunVenConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CuentaBancoPunVenConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CuentaBancoPunVenConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CuentaBancoPunVenConstantesFunciones.LABEL_IDSUCURSAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CuentaBancoPunVenConstantesFunciones.LABEL_IDBANCO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CuentaBancoPunVenConstantesFunciones.LABEL_IDCLIENTE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CuentaBancoPunVenConstantesFunciones.LABEL_IDCUENTACONTABLE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CuentaBancoPunVenConstantesFunciones.LABEL_CODIGO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CuentaBancoPunVenConstantesFunciones.LABEL_NOMBRE;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarCuentaBancoPunVen(CuentaBancoPunVen cuentabancopunven,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=cuentabancopunven.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=cuentabancopunven.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=cuentabancopunven.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cuentabancopunven.getsucursal_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cuentabancopunven.getbanco_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cuentabancopunven.getcliente_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cuentabancopunven.getcuentacontable_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cuentabancopunven.getcodigo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cuentabancopunven.getnombre();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelCuentaBancoPunVensSeleccionados() throws Exception {
		ArrayList<CuentaBancoPunVen> cuentabancopunvensSeleccionados=new ArrayList<CuentaBancoPunVen>();		
		
		cuentabancopunvensSeleccionados=this.getCuentaBancoPunVensSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"cuentabancopunven.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("CuentaBancoPunVens");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelCuentaBancoPunVen(row);				
				iRow++;
			}				
			
			for(CuentaBancoPunVen cuentabancopunvenAux:cuentabancopunvensSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelCuentaBancoPunVen(cuentabancopunvenAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cuentabancopunvenSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Cuenta Banco",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlCuentaBancoPunVensSeleccionados() throws Exception {
		ArrayList<CuentaBancoPunVen> cuentabancopunvensSeleccionados=new ArrayList<CuentaBancoPunVen>();		
		
		cuentabancopunvensSeleccionados=this.getCuentaBancoPunVensSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"cuentabancopunven.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("cuentabancopunvens");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("cuentabancopunven");
			//elementRoot.appendChild(element);
		
			for(CuentaBancoPunVen cuentabancopunvenAux:cuentabancopunvensSeleccionados) {
				element = document.createElement("cuentabancopunven");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlCuentaBancoPunVen(cuentabancopunvenAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cuentabancopunvenSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Cuenta Banco",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelCuentaBancoPunVen(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(CuentaBancoPunVenConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(CuentaBancoPunVenConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(CuentaBancoPunVenConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(CuentaBancoPunVenConstantesFunciones.LABEL_IDSUCURSAL);
		cell = row.createCell(iColumn++);cell.setCellValue(CuentaBancoPunVenConstantesFunciones.LABEL_IDBANCO);
		cell = row.createCell(iColumn++);cell.setCellValue(CuentaBancoPunVenConstantesFunciones.LABEL_IDCLIENTE);
		cell = row.createCell(iColumn++);cell.setCellValue(CuentaBancoPunVenConstantesFunciones.LABEL_IDCUENTACONTABLE);
		cell = row.createCell(iColumn++);cell.setCellValue(CuentaBancoPunVenConstantesFunciones.LABEL_CODIGO);
		cell = row.createCell(iColumn++);cell.setCellValue(CuentaBancoPunVenConstantesFunciones.LABEL_NOMBRE);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelCuentaBancoPunVen(CuentaBancoPunVen cuentabancopunven,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(cuentabancopunven.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(cuentabancopunven.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(cuentabancopunven.getsucursal_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(cuentabancopunven.getbanco_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(cuentabancopunven.getcliente_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(cuentabancopunven.getcuentacontable_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(cuentabancopunven.getcodigo());
		cell = row.createCell(iColumn++);cell.setCellValue(cuentabancopunven.getnombre());				
	}
	
	public void setFilaDatosExportarXmlCuentaBancoPunVen(CuentaBancoPunVen cuentabancopunven,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(CuentaBancoPunVenConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(cuentabancopunven.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(CuentaBancoPunVenConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(cuentabancopunven.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(CuentaBancoPunVenConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(cuentabancopunven.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementsucursal_descripcion = document.createElement(CuentaBancoPunVenConstantesFunciones.IDSUCURSAL);
		elementsucursal_descripcion.appendChild(document.createTextNode(cuentabancopunven.getsucursal_descripcion()));
		element.appendChild(elementsucursal_descripcion);

		Element elementbanco_descripcion = document.createElement(CuentaBancoPunVenConstantesFunciones.IDBANCO);
		elementbanco_descripcion.appendChild(document.createTextNode(cuentabancopunven.getbanco_descripcion()));
		element.appendChild(elementbanco_descripcion);

		Element elementcliente_descripcion = document.createElement(CuentaBancoPunVenConstantesFunciones.IDCLIENTE);
		elementcliente_descripcion.appendChild(document.createTextNode(cuentabancopunven.getcliente_descripcion()));
		element.appendChild(elementcliente_descripcion);

		Element elementcuentacontable_descripcion = document.createElement(CuentaBancoPunVenConstantesFunciones.IDCUENTACONTABLE);
		elementcuentacontable_descripcion.appendChild(document.createTextNode(cuentabancopunven.getcuentacontable_descripcion()));
		element.appendChild(elementcuentacontable_descripcion);

		Element elementcodigo = document.createElement(CuentaBancoPunVenConstantesFunciones.CODIGO);
		elementcodigo.appendChild(document.createTextNode(cuentabancopunven.getcodigo().trim()));
		element.appendChild(elementcodigo);

		Element elementnombre = document.createElement(CuentaBancoPunVenConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(cuentabancopunven.getnombre().trim()));
		element.appendChild(elementnombre);
	}
	
	public void generarReporteGroupGenericoCuentaBancoPunVensSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<CuentaBancoPunVen> cuentabancopunvensSeleccionados=new ArrayList<CuentaBancoPunVen>();
		
		cuentabancopunvensSeleccionados=this.getCuentaBancoPunVensSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoCuentaBancoPunVen(cuentabancopunvensSeleccionados);
		
		this.generarReporteCuentaBancoPunVens("Todos",cuentabancopunvensSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoCuentaBancoPunVen(ArrayList<CuentaBancoPunVen> cuentabancopunvensSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(CuentaBancoPunVen cuentabancopunvenAux:cuentabancopunvensSeleccionados) {
				cuentabancopunvenAux.setsDetalleGeneralEntityReporte(cuentabancopunvenAux.toString());
			
				if(sTipoSeleccionar.equals(CuentaBancoPunVenConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					cuentabancopunvenAux.setsDescripcionGeneralEntityReporte1(cuentabancopunvenAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(CuentaBancoPunVenConstantesFunciones.LABEL_IDSUCURSAL)) {
					existe=true;
					cuentabancopunvenAux.setsDescripcionGeneralEntityReporte1(cuentabancopunvenAux.getsucursal_descripcion());
				}
				 else if(sTipoSeleccionar.equals(CuentaBancoPunVenConstantesFunciones.LABEL_IDBANCO)) {
					existe=true;
					cuentabancopunvenAux.setsDescripcionGeneralEntityReporte1(cuentabancopunvenAux.getbanco_descripcion());
				}
				 else if(sTipoSeleccionar.equals(CuentaBancoPunVenConstantesFunciones.LABEL_IDCLIENTE)) {
					existe=true;
					cuentabancopunvenAux.setsDescripcionGeneralEntityReporte1(cuentabancopunvenAux.getcliente_descripcion());
				}
				 else if(sTipoSeleccionar.equals(CuentaBancoPunVenConstantesFunciones.LABEL_IDCUENTACONTABLE)) {
					existe=true;
					cuentabancopunvenAux.setsDescripcionGeneralEntityReporte1(cuentabancopunvenAux.getcuentacontable_descripcion());
				}
				 else if(sTipoSeleccionar.equals(CuentaBancoPunVenConstantesFunciones.LABEL_CODIGO)) {
					existe=true;
					cuentabancopunvenAux.setsDescripcionGeneralEntityReporte1(cuentabancopunvenAux.getcodigo());
				}
				 else if(sTipoSeleccionar.equals(CuentaBancoPunVenConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					cuentabancopunvenAux.setsDescripcionGeneralEntityReporte1(cuentabancopunvenAux.getnombre());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CuentaBancoPunVenConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesCuentaBancoPunVen(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoCuentaBancoPunVen=true;
				this.isVisibilidadCeldaNuevoRelacionesCuentaBancoPunVen=true;
				this.isVisibilidadCeldaGuardarCambiosCuentaBancoPunVen=true;
			}
			
			this.isVisibilidadCeldaModificarCuentaBancoPunVen=false;
			this.isVisibilidadCeldaActualizarCuentaBancoPunVen=false;
			this.isVisibilidadCeldaEliminarCuentaBancoPunVen=false;
			this.isVisibilidadCeldaCancelarCuentaBancoPunVen=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCuentaBancoPunVen=true;
				} else {
					this.isVisibilidadCeldaGuardarCuentaBancoPunVen=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoCuentaBancoPunVen=false;
			this.isVisibilidadCeldaNuevoRelacionesCuentaBancoPunVen=false;
			this.isVisibilidadCeldaGuardarCambiosCuentaBancoPunVen=false;
			this.isVisibilidadCeldaModificarCuentaBancoPunVen=false;
			this.isVisibilidadCeldaActualizarCuentaBancoPunVen=true;
			this.isVisibilidadCeldaEliminarCuentaBancoPunVen=false;
			this.isVisibilidadCeldaCancelarCuentaBancoPunVen=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCuentaBancoPunVen=true;
				} else {
					this.isVisibilidadCeldaGuardarCuentaBancoPunVen=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoCuentaBancoPunVen=false;
			this.isVisibilidadCeldaNuevoRelacionesCuentaBancoPunVen=false;
			this.isVisibilidadCeldaGuardarCambiosCuentaBancoPunVen=false;
			this.isVisibilidadCeldaModificarCuentaBancoPunVen=false;
			this.isVisibilidadCeldaActualizarCuentaBancoPunVen=true;
			this.isVisibilidadCeldaEliminarCuentaBancoPunVen=true;
			this.isVisibilidadCeldaCancelarCuentaBancoPunVen=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCuentaBancoPunVen=true;
				} else {
					this.isVisibilidadCeldaGuardarCuentaBancoPunVen=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoCuentaBancoPunVen=false;
			this.isVisibilidadCeldaNuevoRelacionesCuentaBancoPunVen=false;
			this.isVisibilidadCeldaGuardarCambiosCuentaBancoPunVen=false;
			this.isVisibilidadCeldaModificarCuentaBancoPunVen=false;
			this.isVisibilidadCeldaActualizarCuentaBancoPunVen=true;
			this.isVisibilidadCeldaEliminarCuentaBancoPunVen=false;
			this.isVisibilidadCeldaCancelarCuentaBancoPunVen=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCuentaBancoPunVen=false;
				} else {
					this.isVisibilidadCeldaGuardarCuentaBancoPunVen=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoCuentaBancoPunVen=true;
			this.isVisibilidadCeldaNuevoRelacionesCuentaBancoPunVen=true;
			this.isVisibilidadCeldaGuardarCambiosCuentaBancoPunVen=true;
			this.isVisibilidadCeldaModificarCuentaBancoPunVen=false;
			this.isVisibilidadCeldaActualizarCuentaBancoPunVen=false;
			this.isVisibilidadCeldaEliminarCuentaBancoPunVen=false;
			this.isVisibilidadCeldaCancelarCuentaBancoPunVen=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCuentaBancoPunVen=true;
				} else {
					this.isVisibilidadCeldaGuardarCuentaBancoPunVen=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoCuentaBancoPunVen=false;
			this.isVisibilidadCeldaNuevoRelacionesCuentaBancoPunVen=false;
			this.isVisibilidadCeldaGuardarCambiosCuentaBancoPunVen=false;
			this.isVisibilidadCeldaActualizarCuentaBancoPunVen=false;
			this.isVisibilidadCeldaEliminarCuentaBancoPunVen=false;
			this.isVisibilidadCeldaCancelarCuentaBancoPunVen=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCuentaBancoPunVen=false;
				} else {
					this.isVisibilidadCeldaGuardarCuentaBancoPunVen=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoCuentaBancoPunVen=false;
			this.isVisibilidadCeldaNuevoRelacionesCuentaBancoPunVen=false;
			this.isVisibilidadCeldaGuardarCambiosCuentaBancoPunVen=false;
			this.isVisibilidadCeldaModificarCuentaBancoPunVen=true;
			this.isVisibilidadCeldaActualizarCuentaBancoPunVen=false;
			this.isVisibilidadCeldaEliminarCuentaBancoPunVen=false;
			this.isVisibilidadCeldaCancelarCuentaBancoPunVen=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCuentaBancoPunVen=false;
				} else {
					this.isVisibilidadCeldaGuardarCuentaBancoPunVen=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(CuentaBancoPunVenJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoCuentaBancoPunVen=true;
			this.isVisibilidadCeldaNuevoRelacionesCuentaBancoPunVen=true;
			this.isVisibilidadCeldaGuardarCambiosCuentaBancoPunVen=true;
		} else {
			this.actualizarEstadoPanelsCuentaBancoPunVen(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarCuentaBancoPunVen=false;
			//this.isVisibilidadCeldaVerFormCuentaBancoPunVen=false;
			this.isVisibilidadCeldaDuplicarCuentaBancoPunVen=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!cuentabancopunvenSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesCuentaBancoPunVen=false;
		} else {
			this.isVisibilidadCeldaNuevoCuentaBancoPunVen=false;
			this.isVisibilidadCeldaGuardarCambiosCuentaBancoPunVen=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(cuentabancopunvenSessionBean.getEsGuardarRelacionado()) {
			if(!cuentabancopunvenSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesCuentaBancoPunVen=false;												
			}
			
			this.jButtonCerrarCuentaBancoPunVen.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesCuentaBancoPunVen=false;
		}
		
		if(!this.permiteMantenimiento(this.cuentabancopunven)) {
			this.isVisibilidadCeldaActualizarCuentaBancoPunVen=false;
			this.isVisibilidadCeldaEliminarCuentaBancoPunVen=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesCuentaBancoPunVen() {
		this.isVisibilidadCeldaNuevoCuentaBancoPunVen=false;
		this.isVisibilidadCeldaGuardarCambiosCuentaBancoPunVen=false;
	}
	
	public void actualizarEstadoPanelsCuentaBancoPunVen(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionCuentaBancoPunVen!=null) {
				this.jScrollPanelDatosEdicionCuentaBancoPunVen.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCuentaBancoPunVen!=null) {
				this.jTabbedPaneBusquedasCuentaBancoPunVen.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosCuentaBancoPunVen!=null) {
				this.jScrollPanelDatosCuentaBancoPunVen.setVisible(true);
			}
			
			if(this.jPanelPaginacionCuentaBancoPunVen!=null) {
				this.jPanelPaginacionCuentaBancoPunVen.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesCuentaBancoPunVen!=null) {
				this.jPanelParametrosReportesCuentaBancoPunVen.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionCuentaBancoPunVen!=null) {
				this.jScrollPanelDatosEdicionCuentaBancoPunVen.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCuentaBancoPunVen!=null) {
				this.jTabbedPaneBusquedasCuentaBancoPunVen.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosCuentaBancoPunVen!=null) {
				this.jScrollPanelDatosCuentaBancoPunVen.setVisible(false);
			}
			
			if(this.jPanelPaginacionCuentaBancoPunVen!=null) {
				this.jPanelPaginacionCuentaBancoPunVen.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesCuentaBancoPunVen!=null) {
				this.jPanelParametrosReportesCuentaBancoPunVen.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionCuentaBancoPunVen!=null) {
				this.jScrollPanelDatosEdicionCuentaBancoPunVen.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCuentaBancoPunVen!=null) {
				this.jTabbedPaneBusquedasCuentaBancoPunVen.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosCuentaBancoPunVen!=null) {
				this.jScrollPanelDatosCuentaBancoPunVen.setVisible(false);
			}
			
			if(this.jPanelPaginacionCuentaBancoPunVen!=null) {
				this.jPanelPaginacionCuentaBancoPunVen.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesCuentaBancoPunVen!=null) {
				this.jPanelParametrosReportesCuentaBancoPunVen.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionCuentaBancoPunVen!=null) {
				this.jScrollPanelDatosEdicionCuentaBancoPunVen.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCuentaBancoPunVen!=null) {
				this.jTabbedPaneBusquedasCuentaBancoPunVen.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosCuentaBancoPunVen!=null) {
				this.jScrollPanelDatosCuentaBancoPunVen.setVisible(false);
			}
			
			if(this.jPanelPaginacionCuentaBancoPunVen!=null) {
				this.jPanelPaginacionCuentaBancoPunVen.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesCuentaBancoPunVen!=null) {
				this.jPanelParametrosReportesCuentaBancoPunVen.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionCuentaBancoPunVen!=null) {
				this.jScrollPanelDatosEdicionCuentaBancoPunVen.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCuentaBancoPunVen!=null) {
				this.jTabbedPaneBusquedasCuentaBancoPunVen.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosCuentaBancoPunVen!=null) {
				this.jScrollPanelDatosCuentaBancoPunVen.setVisible(true);
			}
			
			if(this.jPanelPaginacionCuentaBancoPunVen!=null) {
				this.jPanelPaginacionCuentaBancoPunVen.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesCuentaBancoPunVen!=null) {
				this.jPanelParametrosReportesCuentaBancoPunVen.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionCuentaBancoPunVen!=null) {
				this.jScrollPanelDatosEdicionCuentaBancoPunVen.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCuentaBancoPunVen!=null) {
				this.jTabbedPaneBusquedasCuentaBancoPunVen.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosCuentaBancoPunVen!=null) {
				this.jScrollPanelDatosCuentaBancoPunVen.setVisible(true);
			}
			
			if(this.jPanelPaginacionCuentaBancoPunVen!=null) {
				this.jPanelPaginacionCuentaBancoPunVen.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesCuentaBancoPunVen!=null) {
				this.jPanelParametrosReportesCuentaBancoPunVen.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionCuentaBancoPunVen!=null) {
				this.jScrollPanelDatosEdicionCuentaBancoPunVen.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCuentaBancoPunVen!=null) {
				this.jTabbedPaneBusquedasCuentaBancoPunVen.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosCuentaBancoPunVen!=null) {
				this.jScrollPanelDatosCuentaBancoPunVen.setVisible(true);
			}
			
			if(this.jPanelPaginacionCuentaBancoPunVen!=null) {
				this.jPanelPaginacionCuentaBancoPunVen.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesCuentaBancoPunVen!=null) {
				this.jPanelParametrosReportesCuentaBancoPunVen.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.cuentabancopunvenSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasCuentaBancoPunVen!=null) {
					this.jTabbedPaneBusquedasCuentaBancoPunVen.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesCuentaBancoPunVen!=null) {
				this.jPanelParametrosReportesCuentaBancoPunVen.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.cuentabancopunvenSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCuentaBancoPunVen!=null) {
				this.jTabbedPaneBusquedasCuentaBancoPunVen.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesCuentaBancoPunVen!=null) {
				this.jPanelParametrosReportesCuentaBancoPunVen.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadFK_IdBanco=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdBanco) {this.jTabbedPaneBusquedasCuentaBancoPunVen.remove(jPanelFK_IdBancoCuentaBancoPunVen);}

			this.isVisibilidadFK_IdCliente=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdCliente) {this.jTabbedPaneBusquedasCuentaBancoPunVen.remove(jPanelFK_IdClienteCuentaBancoPunVen);}

			this.isVisibilidadFK_IdCuentaContable=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdCuentaContable) {this.jTabbedPaneBusquedasCuentaBancoPunVen.remove(jPanelFK_IdCuentaContableCuentaBancoPunVen);}
		}
		
	}

	public void setVisibilidadBusquedasParaSucursal(Boolean isParaSucursal){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaSucursalNegation=!isParaSucursal;

			this.isVisibilidadFK_IdBanco=isParaSucursalNegation;
			if(!this.isVisibilidadFK_IdBanco) {this.jTabbedPaneBusquedasCuentaBancoPunVen.remove(jPanelFK_IdBancoCuentaBancoPunVen);}

			this.isVisibilidadFK_IdCliente=isParaSucursalNegation;
			if(!this.isVisibilidadFK_IdCliente) {this.jTabbedPaneBusquedasCuentaBancoPunVen.remove(jPanelFK_IdClienteCuentaBancoPunVen);}

			this.isVisibilidadFK_IdCuentaContable=isParaSucursalNegation;
			if(!this.isVisibilidadFK_IdCuentaContable) {this.jTabbedPaneBusquedasCuentaBancoPunVen.remove(jPanelFK_IdCuentaContableCuentaBancoPunVen);}
		}
		
	}

	public void setVisibilidadBusquedasParaBanco(Boolean isParaBanco){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaBancoNegation=!isParaBanco;

			this.isVisibilidadFK_IdBanco=isParaBanco;
			if(!this.isVisibilidadFK_IdBanco) {this.jTabbedPaneBusquedasCuentaBancoPunVen.remove(jPanelFK_IdBancoCuentaBancoPunVen);}

			this.isVisibilidadFK_IdCliente=isParaBancoNegation;
			if(!this.isVisibilidadFK_IdCliente) {this.jTabbedPaneBusquedasCuentaBancoPunVen.remove(jPanelFK_IdClienteCuentaBancoPunVen);}

			this.isVisibilidadFK_IdCuentaContable=isParaBancoNegation;
			if(!this.isVisibilidadFK_IdCuentaContable) {this.jTabbedPaneBusquedasCuentaBancoPunVen.remove(jPanelFK_IdCuentaContableCuentaBancoPunVen);}
		}
		
	}

	public void setVisibilidadBusquedasParaCliente(Boolean isParaCliente){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaClienteNegation=!isParaCliente;

			this.isVisibilidadFK_IdBanco=isParaClienteNegation;
			if(!this.isVisibilidadFK_IdBanco) {this.jTabbedPaneBusquedasCuentaBancoPunVen.remove(jPanelFK_IdBancoCuentaBancoPunVen);}

			this.isVisibilidadFK_IdCliente=isParaCliente;
			if(!this.isVisibilidadFK_IdCliente) {this.jTabbedPaneBusquedasCuentaBancoPunVen.remove(jPanelFK_IdClienteCuentaBancoPunVen);}

			this.isVisibilidadFK_IdCuentaContable=isParaClienteNegation;
			if(!this.isVisibilidadFK_IdCuentaContable) {this.jTabbedPaneBusquedasCuentaBancoPunVen.remove(jPanelFK_IdCuentaContableCuentaBancoPunVen);}
		}
		
	}

	public void setVisibilidadBusquedasParaCuentaContable(Boolean isParaCuentaContable){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaCuentaContableNegation=!isParaCuentaContable;

			this.isVisibilidadFK_IdBanco=isParaCuentaContableNegation;
			if(!this.isVisibilidadFK_IdBanco) {this.jTabbedPaneBusquedasCuentaBancoPunVen.remove(jPanelFK_IdBancoCuentaBancoPunVen);}

			this.isVisibilidadFK_IdCliente=isParaCuentaContableNegation;
			if(!this.isVisibilidadFK_IdCliente) {this.jTabbedPaneBusquedasCuentaBancoPunVen.remove(jPanelFK_IdClienteCuentaBancoPunVen);}

			this.isVisibilidadFK_IdCuentaContable=isParaCuentaContable;
			if(!this.isVisibilidadFK_IdCuentaContable) {this.jTabbedPaneBusquedasCuentaBancoPunVen.remove(jPanelFK_IdCuentaContableCuentaBancoPunVen);}
		}
		
	}
	
	

	public String registrarSesionCuentaBancoPunVenParaFormaPagoPuntoVentaes() throws Exception {
		Boolean isPaginaPopupFormaPagoPuntoVenta=false;

		try {

			if(this.cuentabancopunvenSessionBean==null) {
				this.cuentabancopunvenSessionBean=new CuentaBancoPunVenSessionBean();
			}

			if(this.jInternalFrameDetalleFormCuentaBancoPunVen.formapagopuntoventaSessionBean==null) {
				this.jInternalFrameDetalleFormCuentaBancoPunVen.formapagopuntoventaSessionBean=new FormaPagoPuntoVentaSessionBean();
			}

			this.jInternalFrameDetalleFormCuentaBancoPunVen.formapagopuntoventaSessionBean.setsPathNavegacionActual(cuentabancopunvenSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+FormaPagoPuntoVentaConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormCuentaBancoPunVen.formapagopuntoventaSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupFormaPagoPuntoVenta=this.jInternalFrameDetalleFormCuentaBancoPunVen.formapagopuntoventaSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormCuentaBancoPunVen.formapagopuntoventaSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeFormaPagoPuntoVenta(true);
			this.jInternalFrameDetalleFormCuentaBancoPunVen.formapagopuntoventaSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeFormaPagoPuntoVenta(CuentaBancoPunVenConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormCuentaBancoPunVen.formapagopuntoventaSessionBean.setisBusquedaDesdeForeignKeySesionCuentaBancoPunVen(true);
			this.jInternalFrameDetalleFormCuentaBancoPunVen.formapagopuntoventaSessionBean.setlidCuentaBancoPunVenActual(this.idCuentaBancoPunVenActual);

			cuentabancopunvenSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyCuentaBancoPunVen(true);
			cuentabancopunvenSessionBean.setlIdCuentaBancoPunVenActualForeignKey(this.idCuentaBancoPunVenActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}
	
	

	public String registrarSesionCuentaBancoPunVenParaBusquedaClientes() throws Exception {
		Boolean isPaginaPopupCliente=false;

		try {

			if(cuentabancopunvenSessionBean==null) {
				cuentabancopunvenSessionBean=new CuentaBancoPunVenSessionBean();
			}

			if(clienteSessionBean==null) {
				clienteSessionBean=new ClienteSessionBean();
			}

			clienteSessionBean.setsPathNavegacionActual(cuentabancopunvenSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+ClienteConstantesFunciones.SCLASSWEBTITULO);
			clienteSessionBean.setisPermiteRecargarInformacion(false);
			clienteSessionBean.setisPaginaPopup(true);
			isPaginaPopupCliente=clienteSessionBean.getisPaginaPopup();
			clienteSessionBean.setisPaginaPopup(false);
			clienteSessionBean.setEstaModoBusqueda(true);
			clienteSessionBean.setsFuncionBusquedaRapida("window.opener.cuentabancopunvenFuncionGeneral.setCombosCodigoDesdeBusquedaid_cliente(TO_REPLACE);");
			clienteSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeCliente(true);
			clienteSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeCliente(CuentaBancoPunVenConstantesFunciones.SNOMBREOPCION);
			//clienteSessionBean.setisBusquedaDesdeForeignKeySesionCuentaBancoPunVen(true);
			//clienteSessionBean.setlidCuentaBancoPunVenActual(this.idCuentaBancoPunVenActual);

			cuentabancopunvenSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyCuentaBancoPunVen(true);
			cuentabancopunvenSessionBean.setlIdCuentaBancoPunVenActualForeignKey(this.idCuentaBancoPunVenActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
			return "";
	}
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//CuentaBancoPunVenSessionBean cuentabancopunvenSessionBean=new CuentaBancoPunVenSessionBean();
		
		if(this.cuentabancopunvenSessionBean==null) {
			this.cuentabancopunvenSessionBean=new CuentaBancoPunVenSessionBean();
		}
		
		this.cuentabancopunvenSessionBean.setsUltimaBusquedaCuentaBancoPunVen(this.getsAccionBusqueda());
		this.cuentabancopunvenSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.cuentabancopunvenSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdBanco")) {
			cuentabancopunvenSessionBean.setid_banco(this.getid_bancoFK_IdBanco());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdCliente")) {
			cuentabancopunvenSessionBean.setid_cliente(this.getid_clienteFK_IdCliente());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdCuentaContable")) {
			cuentabancopunvenSessionBean.setid_cuenta_contable(this.getid_cuenta_contableFK_IdCuentaContable());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			cuentabancopunvenSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdSucursal")) {
			cuentabancopunvenSessionBean.setid_sucursal(this.getid_sucursalFK_IdSucursal());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//CuentaBancoPunVenSessionBean cuentabancopunvenSessionBean=new CuentaBancoPunVenSessionBean();
		
		if(this.cuentabancopunvenSessionBean==null) {
			this.cuentabancopunvenSessionBean=new CuentaBancoPunVenSessionBean();
		}
		
		if(this.cuentabancopunvenSessionBean.getsUltimaBusquedaCuentaBancoPunVen()!=null&&!this.cuentabancopunvenSessionBean.getsUltimaBusquedaCuentaBancoPunVen().equals("")) {
			this.setsAccionBusqueda(cuentabancopunvenSessionBean.getsUltimaBusquedaCuentaBancoPunVen());
			this.setiNumeroPaginacion(cuentabancopunvenSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(cuentabancopunvenSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdBanco")) {
				this.setid_bancoFK_IdBanco(cuentabancopunvenSessionBean.getid_banco());
				cuentabancopunvenSessionBean.setid_banco(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdCliente")) {
				this.setid_clienteFK_IdCliente(cuentabancopunvenSessionBean.getid_cliente());
				cuentabancopunvenSessionBean.setid_cliente(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdCuentaContable")) {
				this.setid_cuenta_contableFK_IdCuentaContable(cuentabancopunvenSessionBean.getid_cuenta_contable());
				cuentabancopunvenSessionBean.setid_cuenta_contable(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(cuentabancopunvenSessionBean.getid_empresa());
				cuentabancopunvenSessionBean.setid_empresa(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdSucursal")) {
				this.setid_sucursalFK_IdSucursal(cuentabancopunvenSessionBean.getid_sucursal());
				cuentabancopunvenSessionBean.setid_sucursal(-1L);
			}
		}
		
		this.cuentabancopunvenSessionBean.setsUltimaBusquedaCuentaBancoPunVen("");
		this.cuentabancopunvenSessionBean.setiNumeroPaginacion(CuentaBancoPunVenConstantesFunciones.INUMEROPAGINACION);
		this.cuentabancopunvenSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaCuentaBancoPunVen(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioCuentaBancoPunVen() {
		this.updateBorderResaltarBusquedasFormularioCuentaBancoPunVen();
		this.updateVisibilidadBusquedasFormularioCuentaBancoPunVen();
		this.updateHabilitarBusquedasFormularioCuentaBancoPunVen();
	}
	
	public void updateBorderResaltarBusquedasFormularioCuentaBancoPunVen() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasCuentaBancoPunVen.getComponents().length>0) {
	

		if(this.cuentabancopunvenConstantesFunciones.resaltarFK_IdBancoCuentaBancoPunVen!=null) {
			index= this.jTabbedPaneBusquedasCuentaBancoPunVen.indexOfComponent(this.jPanelFK_IdBancoCuentaBancoPunVen);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasCuentaBancoPunVen.getComponent(index);
				jPanel.setBorder(this.cuentabancopunvenConstantesFunciones.resaltarFK_IdBancoCuentaBancoPunVen);
			}
		}

		if(this.cuentabancopunvenConstantesFunciones.resaltarFK_IdClienteCuentaBancoPunVen!=null) {
			index= this.jTabbedPaneBusquedasCuentaBancoPunVen.indexOfComponent(this.jPanelFK_IdClienteCuentaBancoPunVen);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasCuentaBancoPunVen.getComponent(index);
				jPanel.setBorder(this.cuentabancopunvenConstantesFunciones.resaltarFK_IdClienteCuentaBancoPunVen);
			}
		}

		if(this.cuentabancopunvenConstantesFunciones.resaltarFK_IdCuentaContableCuentaBancoPunVen!=null) {
			index= this.jTabbedPaneBusquedasCuentaBancoPunVen.indexOfComponent(this.jPanelFK_IdCuentaContableCuentaBancoPunVen);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasCuentaBancoPunVen.getComponent(index);
				jPanel.setBorder(this.cuentabancopunvenConstantesFunciones.resaltarFK_IdCuentaContableCuentaBancoPunVen);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioCuentaBancoPunVen() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasCuentaBancoPunVen.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasCuentaBancoPunVen.indexOfComponent(this.jPanelFK_IdBancoCuentaBancoPunVen);
			jPanel=(JPanel)this.jTabbedPaneBusquedasCuentaBancoPunVen.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.cuentabancopunvenConstantesFunciones.mostrarFK_IdBancoCuentaBancoPunVen);
			if(!this.cuentabancopunvenConstantesFunciones.mostrarFK_IdBancoCuentaBancoPunVen && index>-1) {
				this.jTabbedPaneBusquedasCuentaBancoPunVen.remove(index);
			}

			index= this.jTabbedPaneBusquedasCuentaBancoPunVen.indexOfComponent(this.jPanelFK_IdClienteCuentaBancoPunVen);
			jPanel=(JPanel)this.jTabbedPaneBusquedasCuentaBancoPunVen.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.cuentabancopunvenConstantesFunciones.mostrarFK_IdClienteCuentaBancoPunVen);
			if(!this.cuentabancopunvenConstantesFunciones.mostrarFK_IdClienteCuentaBancoPunVen && index>-1) {
				this.jTabbedPaneBusquedasCuentaBancoPunVen.remove(index);
			}

			index= this.jTabbedPaneBusquedasCuentaBancoPunVen.indexOfComponent(this.jPanelFK_IdCuentaContableCuentaBancoPunVen);
			jPanel=(JPanel)this.jTabbedPaneBusquedasCuentaBancoPunVen.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.cuentabancopunvenConstantesFunciones.mostrarFK_IdCuentaContableCuentaBancoPunVen);
			if(!this.cuentabancopunvenConstantesFunciones.mostrarFK_IdCuentaContableCuentaBancoPunVen && index>-1) {
				this.jTabbedPaneBusquedasCuentaBancoPunVen.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioCuentaBancoPunVen() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasCuentaBancoPunVen.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasCuentaBancoPunVen.indexOfComponent(this.jPanelFK_IdBancoCuentaBancoPunVen);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasCuentaBancoPunVen.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.cuentabancopunvenConstantesFunciones.activarFK_IdBancoCuentaBancoPunVen);
				this.jTabbedPaneBusquedasCuentaBancoPunVen.setEnabledAt(index,this.cuentabancopunvenConstantesFunciones.activarFK_IdBancoCuentaBancoPunVen);
			}

			index= this.jTabbedPaneBusquedasCuentaBancoPunVen.indexOfComponent(this.jPanelFK_IdClienteCuentaBancoPunVen);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasCuentaBancoPunVen.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.cuentabancopunvenConstantesFunciones.activarFK_IdClienteCuentaBancoPunVen);
				this.jTabbedPaneBusquedasCuentaBancoPunVen.setEnabledAt(index,this.cuentabancopunvenConstantesFunciones.activarFK_IdClienteCuentaBancoPunVen);
			}

			index= this.jTabbedPaneBusquedasCuentaBancoPunVen.indexOfComponent(this.jPanelFK_IdCuentaContableCuentaBancoPunVen);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasCuentaBancoPunVen.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.cuentabancopunvenConstantesFunciones.activarFK_IdCuentaContableCuentaBancoPunVen);
				this.jTabbedPaneBusquedasCuentaBancoPunVen.setEnabledAt(index,this.cuentabancopunvenConstantesFunciones.activarFK_IdCuentaContableCuentaBancoPunVen);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaCuentaBancoPunVen(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("FK_IdBanco")) {
			index= this.jTabbedPaneBusquedasCuentaBancoPunVen.indexOfComponent(this.jPanelFK_IdBancoCuentaBancoPunVen);

			this.jTabbedPaneBusquedasCuentaBancoPunVen.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasCuentaBancoPunVen.getComponent(index);

			this.cuentabancopunvenConstantesFunciones.setResaltarFK_IdBancoCuentaBancoPunVen(resaltar);

			jPanel.setBorder(this.cuentabancopunvenConstantesFunciones.resaltarFK_IdBancoCuentaBancoPunVen);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdCliente")) {
			index= this.jTabbedPaneBusquedasCuentaBancoPunVen.indexOfComponent(this.jPanelFK_IdClienteCuentaBancoPunVen);

			this.jTabbedPaneBusquedasCuentaBancoPunVen.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasCuentaBancoPunVen.getComponent(index);

			this.cuentabancopunvenConstantesFunciones.setResaltarFK_IdClienteCuentaBancoPunVen(resaltar);

			jPanel.setBorder(this.cuentabancopunvenConstantesFunciones.resaltarFK_IdClienteCuentaBancoPunVen);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdCuentaContable")) {
			index= this.jTabbedPaneBusquedasCuentaBancoPunVen.indexOfComponent(this.jPanelFK_IdCuentaContableCuentaBancoPunVen);

			this.jTabbedPaneBusquedasCuentaBancoPunVen.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasCuentaBancoPunVen.getComponent(index);

			this.cuentabancopunvenConstantesFunciones.setResaltarFK_IdCuentaContableCuentaBancoPunVen(resaltar);

			jPanel.setBorder(this.cuentabancopunvenConstantesFunciones.resaltarFK_IdCuentaContableCuentaBancoPunVen);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarCuentaBancoPunVen.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioCuentaBancoPunVen() throws Exception {

		if(this.jInternalFrameDetalleFormCuentaBancoPunVen==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioCuentaBancoPunVen();
		this.updateVisibilidadResaltarControlesFormularioCuentaBancoPunVen();
		this.updateHabilitarResaltarControlesFormularioCuentaBancoPunVen();
		
	}
	
	public void updateBorderResaltarControlesFormularioCuentaBancoPunVen() throws Exception {
		if(this.jInternalFrameDetalleFormCuentaBancoPunVen==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.cuentabancopunvenConstantesFunciones.resaltaridCuentaBancoPunVen!=null && this.jInternalFrameDetalleFormCuentaBancoPunVen!=null) {this.jInternalFrameDetalleFormCuentaBancoPunVen.jLabelidCuentaBancoPunVen.setBorder(this.cuentabancopunvenConstantesFunciones.resaltaridCuentaBancoPunVen);}
		if(this.cuentabancopunvenConstantesFunciones.resaltarid_empresaCuentaBancoPunVen!=null && this.jInternalFrameDetalleFormCuentaBancoPunVen!=null) {this.jInternalFrameDetalleFormCuentaBancoPunVen.jComboBoxid_empresaCuentaBancoPunVen.setBorder(this.cuentabancopunvenConstantesFunciones.resaltarid_empresaCuentaBancoPunVen);}
		if(this.cuentabancopunvenConstantesFunciones.resaltarid_sucursalCuentaBancoPunVen!=null && this.jInternalFrameDetalleFormCuentaBancoPunVen!=null) {this.jInternalFrameDetalleFormCuentaBancoPunVen.jComboBoxid_sucursalCuentaBancoPunVen.setBorder(this.cuentabancopunvenConstantesFunciones.resaltarid_sucursalCuentaBancoPunVen);}
		if(this.cuentabancopunvenConstantesFunciones.resaltarid_bancoCuentaBancoPunVen!=null && this.jInternalFrameDetalleFormCuentaBancoPunVen!=null) {this.jInternalFrameDetalleFormCuentaBancoPunVen.jComboBoxid_bancoCuentaBancoPunVen.setBorder(this.cuentabancopunvenConstantesFunciones.resaltarid_bancoCuentaBancoPunVen);}
		if(this.cuentabancopunvenConstantesFunciones.resaltarid_clienteCuentaBancoPunVen!=null && this.jInternalFrameDetalleFormCuentaBancoPunVen!=null) {this.jInternalFrameDetalleFormCuentaBancoPunVen.jComboBoxid_clienteCuentaBancoPunVen.setBorder(this.cuentabancopunvenConstantesFunciones.resaltarid_clienteCuentaBancoPunVen);}
		if(this.cuentabancopunvenConstantesFunciones.resaltarid_cuenta_contableCuentaBancoPunVen!=null && this.jInternalFrameDetalleFormCuentaBancoPunVen!=null) {this.jInternalFrameDetalleFormCuentaBancoPunVen.jComboBoxid_cuenta_contableCuentaBancoPunVen.setBorder(this.cuentabancopunvenConstantesFunciones.resaltarid_cuenta_contableCuentaBancoPunVen);}
		if(this.cuentabancopunvenConstantesFunciones.resaltarcodigoCuentaBancoPunVen!=null && this.jInternalFrameDetalleFormCuentaBancoPunVen!=null) {this.jInternalFrameDetalleFormCuentaBancoPunVen.jTextFieldcodigoCuentaBancoPunVen.setBorder(this.cuentabancopunvenConstantesFunciones.resaltarcodigoCuentaBancoPunVen);}
		if(this.cuentabancopunvenConstantesFunciones.resaltarnombreCuentaBancoPunVen!=null && this.jInternalFrameDetalleFormCuentaBancoPunVen!=null) {this.jInternalFrameDetalleFormCuentaBancoPunVen.jTextAreanombreCuentaBancoPunVen.setBorder(this.cuentabancopunvenConstantesFunciones.resaltarnombreCuentaBancoPunVen);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioCuentaBancoPunVen() throws Exception {		
		if(this.jInternalFrameDetalleFormCuentaBancoPunVen==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormCuentaBancoPunVen!=null) {
	
		//this.jInternalFrameDetalleFormCuentaBancoPunVen.jLabelidCuentaBancoPunVen.setVisible(this.cuentabancopunvenConstantesFunciones.mostraridCuentaBancoPunVen);
		this.jInternalFrameDetalleFormCuentaBancoPunVen.jPanelidCuentaBancoPunVen.setVisible(this.cuentabancopunvenConstantesFunciones.mostraridCuentaBancoPunVen);
		//this.jInternalFrameDetalleFormCuentaBancoPunVen.jComboBoxid_empresaCuentaBancoPunVen.setVisible(this.cuentabancopunvenConstantesFunciones.mostrarid_empresaCuentaBancoPunVen);
		this.jInternalFrameDetalleFormCuentaBancoPunVen.jPanelid_empresaCuentaBancoPunVen.setVisible(this.cuentabancopunvenConstantesFunciones.mostrarid_empresaCuentaBancoPunVen);
		//this.jInternalFrameDetalleFormCuentaBancoPunVen.jComboBoxid_sucursalCuentaBancoPunVen.setVisible(this.cuentabancopunvenConstantesFunciones.mostrarid_sucursalCuentaBancoPunVen);
		this.jInternalFrameDetalleFormCuentaBancoPunVen.jPanelid_sucursalCuentaBancoPunVen.setVisible(this.cuentabancopunvenConstantesFunciones.mostrarid_sucursalCuentaBancoPunVen);
		//this.jInternalFrameDetalleFormCuentaBancoPunVen.jComboBoxid_bancoCuentaBancoPunVen.setVisible(this.cuentabancopunvenConstantesFunciones.mostrarid_bancoCuentaBancoPunVen);
		this.jInternalFrameDetalleFormCuentaBancoPunVen.jPanelid_bancoCuentaBancoPunVen.setVisible(this.cuentabancopunvenConstantesFunciones.mostrarid_bancoCuentaBancoPunVen);
		//this.jInternalFrameDetalleFormCuentaBancoPunVen.jComboBoxid_clienteCuentaBancoPunVen.setVisible(this.cuentabancopunvenConstantesFunciones.mostrarid_clienteCuentaBancoPunVen);
		this.jInternalFrameDetalleFormCuentaBancoPunVen.jPanelid_clienteCuentaBancoPunVen.setVisible(this.cuentabancopunvenConstantesFunciones.mostrarid_clienteCuentaBancoPunVen);
			this.jInternalFrameDetalleFormCuentaBancoPunVen.jButtonid_clienteCuentaBancoPunVen.setVisible(this.cuentabancopunvenConstantesFunciones.mostrarid_clienteCuentaBancoPunVen);
		//this.jInternalFrameDetalleFormCuentaBancoPunVen.jComboBoxid_cuenta_contableCuentaBancoPunVen.setVisible(this.cuentabancopunvenConstantesFunciones.mostrarid_cuenta_contableCuentaBancoPunVen);
		this.jInternalFrameDetalleFormCuentaBancoPunVen.jPanelid_cuenta_contableCuentaBancoPunVen.setVisible(this.cuentabancopunvenConstantesFunciones.mostrarid_cuenta_contableCuentaBancoPunVen);
		//this.jInternalFrameDetalleFormCuentaBancoPunVen.jTextFieldcodigoCuentaBancoPunVen.setVisible(this.cuentabancopunvenConstantesFunciones.mostrarcodigoCuentaBancoPunVen);
		this.jInternalFrameDetalleFormCuentaBancoPunVen.jPanelcodigoCuentaBancoPunVen.setVisible(this.cuentabancopunvenConstantesFunciones.mostrarcodigoCuentaBancoPunVen);
		//this.jInternalFrameDetalleFormCuentaBancoPunVen.jTextAreanombreCuentaBancoPunVen.setVisible(this.cuentabancopunvenConstantesFunciones.mostrarnombreCuentaBancoPunVen);
		this.jInternalFrameDetalleFormCuentaBancoPunVen.jPanelnombreCuentaBancoPunVen.setVisible(this.cuentabancopunvenConstantesFunciones.mostrarnombreCuentaBancoPunVen);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioCuentaBancoPunVen() throws Exception {
		if(this.jInternalFrameDetalleFormCuentaBancoPunVen==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormCuentaBancoPunVen!=null) {
	
		this.jInternalFrameDetalleFormCuentaBancoPunVen.jLabelidCuentaBancoPunVen.setEnabled(this.cuentabancopunvenConstantesFunciones.activaridCuentaBancoPunVen);
		this.jInternalFrameDetalleFormCuentaBancoPunVen.jComboBoxid_empresaCuentaBancoPunVen.setEnabled(this.cuentabancopunvenConstantesFunciones.activarid_empresaCuentaBancoPunVen);
		this.jInternalFrameDetalleFormCuentaBancoPunVen.jComboBoxid_sucursalCuentaBancoPunVen.setEnabled(this.cuentabancopunvenConstantesFunciones.activarid_sucursalCuentaBancoPunVen);
		this.jInternalFrameDetalleFormCuentaBancoPunVen.jComboBoxid_bancoCuentaBancoPunVen.setEnabled(this.cuentabancopunvenConstantesFunciones.activarid_bancoCuentaBancoPunVen);
		this.jInternalFrameDetalleFormCuentaBancoPunVen.jComboBoxid_clienteCuentaBancoPunVen.setEnabled(this.cuentabancopunvenConstantesFunciones.activarid_clienteCuentaBancoPunVen);
			this.jInternalFrameDetalleFormCuentaBancoPunVen.jButtonid_clienteCuentaBancoPunVen.setEnabled(this.cuentabancopunvenConstantesFunciones.activarid_clienteCuentaBancoPunVen);
		this.jInternalFrameDetalleFormCuentaBancoPunVen.jComboBoxid_cuenta_contableCuentaBancoPunVen.setEnabled(this.cuentabancopunvenConstantesFunciones.activarid_cuenta_contableCuentaBancoPunVen);
		this.jInternalFrameDetalleFormCuentaBancoPunVen.jTextFieldcodigoCuentaBancoPunVen.setEnabled(this.cuentabancopunvenConstantesFunciones.activarcodigoCuentaBancoPunVen);
		this.jInternalFrameDetalleFormCuentaBancoPunVen.jTextAreanombreCuentaBancoPunVen.setEnabled(this.cuentabancopunvenConstantesFunciones.activarnombreCuentaBancoPunVen);
		}
	}
	
		
}