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
package com.bydan.erp.tesoreria.presentation.swing.jinternalframes;




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

import com.bydan.erp.tesoreria.util.TransaccionConstantesFunciones;
import com.bydan.erp.tesoreria.util.TransaccionParameterReturnGeneral;
//import com.bydan.erp.tesoreria.util.TransaccionParameterGeneral;
//import com.bydan.erp.tesoreria.presentation.report.source.TransaccionBean;
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

import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.auxiliar.*;
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
import com.bydan.erp.tesoreria.resources.reportes.AuxiliarReportes;


import com.bydan.erp.tesoreria.util.*;
import com.bydan.erp.tesoreria.business.logic.*;

import com.bydan.erp.seguridad.business.logic.*;
import com.bydan.erp.cartera.business.logic.*;
import com.bydan.erp.contabilidad.business.logic.*;
import com.bydan.erp.tesoreria.business.logic.*;
import com.bydan.erp.facturacion.business.logic.*;
import com.bydan.erp.produccion.business.logic.*;
import com.bydan.erp.inventario.business.logic.*;
import com.bydan.erp.nomina.business.logic.*;
import com.bydan.erp.importaciones.business.logic.*;
import com.bydan.erp.puntoventa.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.tesoreria.business.entity.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.produccion.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.importaciones.presentation.swing.jinternalframes.*;
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.*;

import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.produccion.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.importaciones.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.auxiliar.*;






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


import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;

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
import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.tesoreria.business.entity.*;
import com.bydan.erp.facturacion.business.entity.*;
import com.bydan.erp.produccion.business.entity.*;
import com.bydan.erp.inventario.business.entity.*;
import com.bydan.erp.nomina.business.entity.*;
import com.bydan.erp.importaciones.business.entity.*;
import com.bydan.erp.puntoventa.business.entity.*;
import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.cartera.util.*;
import com.bydan.erp.contabilidad.util.*;
import com.bydan.erp.tesoreria.util.*;
import com.bydan.erp.facturacion.util.*;
import com.bydan.erp.produccion.util.*;
import com.bydan.erp.inventario.util.*;
import com.bydan.erp.nomina.util.*;
import com.bydan.erp.importaciones.util.*;
import com.bydan.erp.puntoventa.util.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.produccion.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.importaciones.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.puntoventa.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class TransaccionBeanSwingJInternalFrame extends TransaccionJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(TransaccionBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<Transaccion> transaccionValidator = new ClassValidator<Transaccion>(Transaccion.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public Transaccion transaccion;	
	public Transaccion transaccionAux;
	public Transaccion transaccionAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public Transaccion transaccionTotales;
	public Long idTransaccionActual;
	public Long iIdNuevoTransaccion=0L;
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

	public String sFinalQueryComboTipoTransa="";

	public List<TipoTransa> tipotransasForeignKey;

	public List<TipoTransa> gettipotransasForeignKey() {
		return tipotransasForeignKey;
	}

	public void settipotransasForeignKey(List<TipoTransa> tipotransasForeignKey) {
		this.tipotransasForeignKey = tipotransasForeignKey;
	}

	//OBJETO FK ACTUAL
	public TipoTransa tipotransaForeignKey;

	public TipoTransa gettipotransaForeignKey() {
		return tipotransaForeignKey;
	}

	public void settipotransaForeignKey(TipoTransa tipotransaForeignKey) {
		this.tipotransaForeignKey = tipotransaForeignKey;
	}

	public String sFinalQueryComboTipoComprobante="";

	public List<TipoComprobante> tipocomprobantesForeignKey;

	public List<TipoComprobante> gettipocomprobantesForeignKey() {
		return tipocomprobantesForeignKey;
	}

	public void settipocomprobantesForeignKey(List<TipoComprobante> tipocomprobantesForeignKey) {
		this.tipocomprobantesForeignKey = tipocomprobantesForeignKey;
	}

	//OBJETO FK ACTUAL
	public TipoComprobante tipocomprobanteForeignKey;

	public TipoComprobante gettipocomprobanteForeignKey() {
		return tipocomprobanteForeignKey;
	}

	public void settipocomprobanteForeignKey(TipoComprobante tipocomprobanteForeignKey) {
		this.tipocomprobanteForeignKey = tipocomprobanteForeignKey;
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

	public String sFinalQueryComboTipoRetencion="";

	public List<TipoRetencion> tiporetencionsForeignKey;

	public List<TipoRetencion> gettiporetencionsForeignKey() {
		return tiporetencionsForeignKey;
	}

	public void settiporetencionsForeignKey(List<TipoRetencion> tiporetencionsForeignKey) {
		this.tiporetencionsForeignKey = tiporetencionsForeignKey;
	}

	//OBJETO FK ACTUAL
	public TipoRetencion tiporetencionForeignKey;

	public TipoRetencion gettiporetencionForeignKey() {
		return tiporetencionForeignKey;
	}

	public void settiporetencionForeignKey(TipoRetencion tiporetencionForeignKey) {
		this.tiporetencionForeignKey = tiporetencionForeignKey;
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
	
	public Boolean isPermisoTodoTransaccion;
	public Boolean isPermisoNuevoTransaccion;
	public Boolean isPermisoActualizarTransaccion;
	public Boolean isPermisoActualizarOriginalTransaccion;
	public Boolean isPermisoEliminarTransaccion;
	public Boolean isPermisoGuardarCambiosTransaccion;
	public Boolean isPermisoConsultaTransaccion;
	public Boolean isPermisoBusquedaTransaccion;
	public Boolean isPermisoReporteTransaccion;
	public Boolean isPermisoPaginacionMedioTransaccion;
	public Boolean isPermisoPaginacionAltoTransaccion;
	public Boolean isPermisoPaginacionTodoTransaccion;
	public Boolean isPermisoCopiarTransaccion;
	public Boolean isPermisoVerFormTransaccion;
	public Boolean isPermisoDuplicarTransaccion;
	public Boolean isPermisoOrdenTransaccion;
	
	
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
	
	public TransaccionParameterReturnGeneral transaccionReturnGeneral;
	public TransaccionParameterReturnGeneral transaccionParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoTransaccion=false;
	public Boolean esParaAccionDesdeFormularioTransaccion=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected TransaccionSessionBeanAdditional transaccionSessionBeanAdditional=null;
	
	public TransaccionSessionBeanAdditional getTransaccionSessionBeanAdditional() {
		return this.transaccionSessionBeanAdditional;
	}
	
	public void setTransaccionSessionBeanAdditional(TransaccionSessionBeanAdditional transaccionSessionBeanAdditional) {
		try {
			this.transaccionSessionBeanAdditional=transaccionSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected TransaccionBeanSwingJInternalFrameAdditional transaccionBeanSwingJInternalFrameAdditional=null;
	//public class TransaccionBeanSwingJInternalFrame
	
	public TransaccionBeanSwingJInternalFrameAdditional getTransaccionBeanSwingJInternalFrameAdditional() {
		return this.transaccionBeanSwingJInternalFrameAdditional;
	}
	
	public void setTransaccionBeanSwingJInternalFrameAdditional(TransaccionBeanSwingJInternalFrameAdditional transaccionBeanSwingJInternalFrameAdditional) {
		try {
			this.transaccionBeanSwingJInternalFrameAdditional=transaccionBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public TransaccionLogic transaccionLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public Transaccion transaccionBean;
	public TransaccionConstantesFunciones transaccionConstantesFunciones;
	//public TransaccionParameterReturnGeneral transaccionReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	public SucursalLogic sucursalLogic;
	public ModuloLogic moduloLogic;
	public TipoTransaLogic tipotransaLogic;
	public TipoComprobanteLogic tipocomprobanteLogic;
	public TipoTransaccionModuloLogic tipotransaccionmoduloLogic;
	public TipoRetencionLogic tiporetencionLogic;
	public CuentaContableLogic cuentacontableLogic;
	
	//PARAMETROS
	
	
	//public List<Transaccion> transaccions;	
	//public List<Transaccion> transaccionsEliminados;
	//public List<Transaccion> transaccionsAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoTransaccion=false;
	public Boolean isVisibilidadCeldaDuplicarTransaccion=true;
	public Boolean isVisibilidadCeldaCopiarTransaccion=true;
	public Boolean isVisibilidadCeldaVerFormTransaccion=true;
	public Boolean isVisibilidadCeldaOrdenTransaccion=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesTransaccion=false;
	public Boolean isVisibilidadCeldaModificarTransaccion=false;
	public Boolean isVisibilidadCeldaActualizarTransaccion=false;
	public Boolean isVisibilidadCeldaEliminarTransaccion=false;
	public Boolean isVisibilidadCeldaCancelarTransaccion=false;
	public Boolean isVisibilidadCeldaGuardarTransaccion=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosTransaccion=false;	
	
	
	public Boolean isVisibilidadBusquedaPorCodigo=false;
	public Boolean isVisibilidadBusquedaPorIdModuloPorTipoTransaccion=false;
	public Boolean isVisibilidadBusquedaPorNombre=false;
	public Boolean isVisibilidadFK_IdCuentaContable=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	public Boolean isVisibilidadFK_IdModulo=false;
	public Boolean isVisibilidadFK_IdSucursal=false;
	public Boolean isVisibilidadFK_IdTipoComprobante=false;
	public Boolean isVisibilidadFK_IdTipoRetencion=false;
	public Boolean isVisibilidadFK_IdTipoTransa=false;
	public Boolean isVisibilidadFK_IdTipoTransaccionModulo=false;
	
	public Long getiIdNuevoTransaccion() {
		return this.iIdNuevoTransaccion;
	}

	public void setiIdNuevoTransaccion(Long iIdNuevoTransaccion) {
		this.iIdNuevoTransaccion = iIdNuevoTransaccion;
	}
	
	public Long getidTransaccionActual() {
		return this.idTransaccionActual;
	}

	public void setidTransaccionActual(Long idTransaccionActual) {
		this.idTransaccionActual = idTransaccionActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public Transaccion gettransaccion() {
		return this.transaccion;
	}

	public void settransaccion(Transaccion transaccion) {
		this.transaccion = transaccion;
	}
	
	public Transaccion gettransaccionAux() {
		return this.transaccionAux;
	}

	public void settransaccionAux(Transaccion transaccionAux) {
		this.transaccionAux = transaccionAux;
	}				
	
	public Transaccion gettransaccionAnterior() {
		return this.transaccionAnterior;
	}

	public void settransaccionAnterior(Transaccion transaccionAnterior) {
		this.transaccionAnterior = transaccionAnterior;
	}	
	
	public Transaccion gettransaccionTotales() {
		return this.transaccionTotales;
	}

	public void settransaccionTotales(Transaccion transaccionTotales) {
		this.transaccionTotales = transaccionTotales;
	}	
	
	public Transaccion gettransaccionBean() {
		return this.transaccionBean;
	}

	public void settransaccionBean(Transaccion transaccionBean) {
		this.transaccionBean = transaccionBean;
	}	
	
	public TransaccionParameterReturnGeneral gettransaccionReturnGeneral() {
		return this.transaccionReturnGeneral;
	}

	public void settransaccionReturnGeneral(TransaccionParameterReturnGeneral transaccionReturnGeneral) {
		this.transaccionReturnGeneral = transaccionReturnGeneral;
	}	
	
	
	public String codigoBusquedaPorCodigo="";

	public String getcodigoBusquedaPorCodigo() {
		return this.codigoBusquedaPorCodigo;
	}

	public void setcodigoBusquedaPorCodigo(String codigoBusquedaPorCodigo) {
		this.codigoBusquedaPorCodigo = codigoBusquedaPorCodigo;
	}

	public Long id_moduloBusquedaPorIdModuloPorTipoTransaccion=-1L;

	public Long getid_moduloBusquedaPorIdModuloPorTipoTransaccion() {
		return this.id_moduloBusquedaPorIdModuloPorTipoTransaccion;
	}

	public void setid_moduloBusquedaPorIdModuloPorTipoTransaccion(Long id_moduloBusquedaPorIdModuloPorTipoTransaccion) {
		this.id_moduloBusquedaPorIdModuloPorTipoTransaccion = id_moduloBusquedaPorIdModuloPorTipoTransaccion;
	}

;
	public Long id_tipo_transaccion_moduloBusquedaPorIdModuloPorTipoTransaccion=null;

	public Long getid_tipo_transaccion_moduloBusquedaPorIdModuloPorTipoTransaccion() {
		return this.id_tipo_transaccion_moduloBusquedaPorIdModuloPorTipoTransaccion;
	}

	public void setid_tipo_transaccion_moduloBusquedaPorIdModuloPorTipoTransaccion(Long id_tipo_transaccion_moduloBusquedaPorIdModuloPorTipoTransaccion) {
		this.id_tipo_transaccion_moduloBusquedaPorIdModuloPorTipoTransaccion = id_tipo_transaccion_moduloBusquedaPorIdModuloPorTipoTransaccion;
	}

	public String nombreBusquedaPorNombre="";

	public String getnombreBusquedaPorNombre() {
		return this.nombreBusquedaPorNombre;
	}

	public void setnombreBusquedaPorNombre(String nombreBusquedaPorNombre) {
		this.nombreBusquedaPorNombre = nombreBusquedaPorNombre;
	}

	public Long id_cuenta_contableFK_IdCuentaContable=null;

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

	public Long id_moduloFK_IdModulo=-1L;

	public Long getid_moduloFK_IdModulo() {
		return this.id_moduloFK_IdModulo;
	}

	public void setid_moduloFK_IdModulo(Long id_moduloFK_IdModulo) {
		this.id_moduloFK_IdModulo = id_moduloFK_IdModulo;
	}

	public Long id_sucursalFK_IdSucursal=-1L;

	public Long getid_sucursalFK_IdSucursal() {
		return this.id_sucursalFK_IdSucursal;
	}

	public void setid_sucursalFK_IdSucursal(Long id_sucursalFK_IdSucursal) {
		this.id_sucursalFK_IdSucursal = id_sucursalFK_IdSucursal;
	}

	public Long id_tipo_comprobanteFK_IdTipoComprobante=null;

	public Long getid_tipo_comprobanteFK_IdTipoComprobante() {
		return this.id_tipo_comprobanteFK_IdTipoComprobante;
	}

	public void setid_tipo_comprobanteFK_IdTipoComprobante(Long id_tipo_comprobanteFK_IdTipoComprobante) {
		this.id_tipo_comprobanteFK_IdTipoComprobante = id_tipo_comprobanteFK_IdTipoComprobante;
	}

	public Long id_tipo_retencionFK_IdTipoRetencion=-1L;

	public Long getid_tipo_retencionFK_IdTipoRetencion() {
		return this.id_tipo_retencionFK_IdTipoRetencion;
	}

	public void setid_tipo_retencionFK_IdTipoRetencion(Long id_tipo_retencionFK_IdTipoRetencion) {
		this.id_tipo_retencionFK_IdTipoRetencion = id_tipo_retencionFK_IdTipoRetencion;
	}

	public Long id_tipo_transaFK_IdTipoTransa=-1L;

	public Long getid_tipo_transaFK_IdTipoTransa() {
		return this.id_tipo_transaFK_IdTipoTransa;
	}

	public void setid_tipo_transaFK_IdTipoTransa(Long id_tipo_transaFK_IdTipoTransa) {
		this.id_tipo_transaFK_IdTipoTransa = id_tipo_transaFK_IdTipoTransa;
	}

	public Long id_tipo_transaccion_moduloFK_IdTipoTransaccionModulo=null;

	public Long getid_tipo_transaccion_moduloFK_IdTipoTransaccionModulo() {
		return this.id_tipo_transaccion_moduloFK_IdTipoTransaccionModulo;
	}

	public void setid_tipo_transaccion_moduloFK_IdTipoTransaccionModulo(Long id_tipo_transaccion_moduloFK_IdTipoTransaccionModulo) {
		this.id_tipo_transaccion_moduloFK_IdTipoTransaccionModulo = id_tipo_transaccion_moduloFK_IdTipoTransaccionModulo;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public TransaccionLogic getTransaccionLogic()	{		
		return transaccionLogic;
	}

	public void setTransaccionLogic(TransaccionLogic transaccionLogic) {
		this.transaccionLogic = transaccionLogic;
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
	
	public Boolean getIsEsNuevoTransaccion() {
		return isEsNuevoTransaccion;
	}

	public void setIsEsNuevoTransaccion(Boolean isEsNuevoTransaccion) {
		this.isEsNuevoTransaccion = isEsNuevoTransaccion;
	}

	public Boolean getEsParaAccionDesdeFormularioTransaccion() {
		return esParaAccionDesdeFormularioTransaccion;
	}
	
	public void setEsParaAccionDesdeFormularioTransaccion(Boolean esParaAccionDesdeFormularioTransaccion) {
		this.esParaAccionDesdeFormularioTransaccion = esParaAccionDesdeFormularioTransaccion;
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

			if(this.transaccionSessionBean==null) {
				this.transaccionSessionBean=new TransaccionSessionBean();
			}

			if(!this.transaccionSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(transaccionSessionBean.getlidEmpresaActual());
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

			if(this.transaccionSessionBean==null) {
				this.transaccionSessionBean=new TransaccionSessionBean();
			}

			if(!this.transaccionSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
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
					sucursalLogic.getEntityWithConnection(transaccionSessionBean.getlidSucursalActual());
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

			if(this.transaccionSessionBean==null) {
				this.transaccionSessionBean=new TransaccionSessionBean();
			}

			if(!this.transaccionSessionBean.getisBusquedaDesdeForeignKeySesionModulo()) {
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
					moduloLogic.getEntityWithConnection(transaccionSessionBean.getlidModuloActual());
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

	public void cargarCombosTipoTransasForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.tipotransasForeignKey=new ArrayList<TipoTransa>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			TipoTransaLogic tipotransaLogic=new TipoTransaLogic();

			//tipotransaLogic.getTipoTransaDataAccess().setIsForForeingKeyData(true);

			if(this.transaccionSessionBean==null) {
				this.transaccionSessionBean=new TransaccionSessionBean();
			}

			if(!this.transaccionSessionBean.getisBusquedaDesdeForeignKeySesionTipoTransa()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//tipotransaLogic.getTipoTransaDataAccess().setIsForForeingKeyData(true);

					tipotransaLogic.getTodosTipoTransasWithConnection(sFinalQuery,new Pagination());

					this.tipotransasForeignKey=tipotransaLogic.getTipoTransas();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaTipoTransa(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipotransaLogic.getEntityWithConnection(transaccionSessionBean.getlidTipoTransaActual());
					this.tipotransasForeignKey.add(tipotransaLogic.getTipoTransa());
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

	public void cargarCombosTipoComprobantesForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.tipocomprobantesForeignKey=new ArrayList<TipoComprobante>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			TipoComprobanteLogic tipocomprobanteLogic=new TipoComprobanteLogic();

			//tipocomprobanteLogic.getTipoComprobanteDataAccess().setIsForForeingKeyData(true);

			if(this.transaccionSessionBean==null) {
				this.transaccionSessionBean=new TransaccionSessionBean();
			}

			if(!this.transaccionSessionBean.getisBusquedaDesdeForeignKeySesionTipoComprobante()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//tipocomprobanteLogic.getTipoComprobanteDataAccess().setIsForForeingKeyData(true);

					tipocomprobanteLogic.getTodosTipoComprobantesWithConnection(sFinalQuery,new Pagination());

					this.tipocomprobantesForeignKey=tipocomprobanteLogic.getTipoComprobantes();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaTipoComprobante(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipocomprobanteLogic.getEntityWithConnection(transaccionSessionBean.getlidTipoComprobanteActual());
					this.tipocomprobantesForeignKey.add(tipocomprobanteLogic.getTipoComprobante());
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

			if(this.transaccionSessionBean==null) {
				this.transaccionSessionBean=new TransaccionSessionBean();
			}

			if(!this.transaccionSessionBean.getisBusquedaDesdeForeignKeySesionTipoTransaccionModulo()) {
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
					tipotransaccionmoduloLogic.getEntityWithConnection(transaccionSessionBean.getlidTipoTransaccionModuloActual());
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

	public void cargarCombosTipoRetencionsForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.tiporetencionsForeignKey=new ArrayList<TipoRetencion>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			TipoRetencionLogic tiporetencionLogic=new TipoRetencionLogic();

			//tiporetencionLogic.getTipoRetencionDataAccess().setIsForForeingKeyData(true);

			if(this.transaccionSessionBean==null) {
				this.transaccionSessionBean=new TransaccionSessionBean();
			}

			if(!this.transaccionSessionBean.getisBusquedaDesdeForeignKeySesionTipoRetencion()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//tiporetencionLogic.getTipoRetencionDataAccess().setIsForForeingKeyData(true);

					tiporetencionLogic.getTodosTipoRetencionsWithConnection(sFinalQuery,new Pagination());

					this.tiporetencionsForeignKey=tiporetencionLogic.getTipoRetencions();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaTipoRetencion(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					tiporetencionLogic.getEntityWithConnection(transaccionSessionBean.getlidTipoRetencionActual());
					this.tiporetencionsForeignKey.add(tiporetencionLogic.getTipoRetencion());
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

			if(this.transaccionSessionBean==null) {
				this.transaccionSessionBean=new TransaccionSessionBean();
			}

			if(!this.transaccionSessionBean.getisBusquedaDesdeForeignKeySesionCuentaContable()) {
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
					cuentacontableLogic.getEntityWithConnection(transaccionSessionBean.getlidCuentaContableActual());
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

					if(this.transaccion!=null) {
						this.transaccion.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormTransaccion!=null) {
						this.jInternalFrameDetalleFormTransaccion.jComboBoxid_empresaTransaccion.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaTransaccion.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormTransaccion!=null) {
						if(this.jInternalFrameDetalleFormTransaccion.jComboBoxid_empresaTransaccion.getItemCount()>0) {
							this.jInternalFrameDetalleFormTransaccion.jComboBoxid_empresaTransaccion.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaTransaccionGenerico)throws Exception
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
				jComboBoxid_empresaTransaccionGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaTransaccionGenerico!=null && jComboBoxid_empresaTransaccionGenerico.getItemCount()>0) {
					jComboBoxid_empresaTransaccionGenerico.setSelectedIndex(0);
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

					if(this.transaccion!=null) {
						this.transaccion.setSucursal(sucursalTemp);
					}

					if(this.jInternalFrameDetalleFormTransaccion!=null) {
						this.jInternalFrameDetalleFormTransaccion.jComboBoxid_sucursalTransaccion.setSelectedItem(sucursalTemp);
					}
				} else {
					//jComboBoxid_sucursalTransaccion.setSelectedItem(sucursalTemp);
					if(this.jInternalFrameDetalleFormTransaccion!=null) {
						if(this.jInternalFrameDetalleFormTransaccion.jComboBoxid_sucursalTransaccion.getItemCount()>0) {
							this.jInternalFrameDetalleFormTransaccion.jComboBoxid_sucursalTransaccion.setSelectedIndex(0);
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
	public void setActualSucursalForeignKeyGenerico(Long idSucursalSeleccionado,JComboBox jComboBoxid_sucursalTransaccionGenerico)throws Exception
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
				jComboBoxid_sucursalTransaccionGenerico.setSelectedItem(sucursalTemp);
			} else {
				if(jComboBoxid_sucursalTransaccionGenerico!=null && jComboBoxid_sucursalTransaccionGenerico.getItemCount()>0) {
					jComboBoxid_sucursalTransaccionGenerico.setSelectedIndex(0);
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

					if(this.transaccion!=null) {
						this.transaccion.setModulo(moduloTemp);
					}

					if(this.jInternalFrameDetalleFormTransaccion!=null) {
						this.jInternalFrameDetalleFormTransaccion.jComboBoxid_moduloTransaccion.setSelectedItem(moduloTemp);
					}
				} else {
					//jComboBoxid_moduloTransaccion.setSelectedItem(moduloTemp);
					if(this.jInternalFrameDetalleFormTransaccion!=null) {
						if(this.jInternalFrameDetalleFormTransaccion.jComboBoxid_moduloTransaccion.getItemCount()>0) {
							this.jInternalFrameDetalleFormTransaccion.jComboBoxid_moduloTransaccion.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaPorIdModuloPorTipoTransaccion") || sFormularioTipoBusqueda.equals("Todos")){
					if(moduloTemp!=null && jComboBoxid_moduloBusquedaPorIdModuloPorTipoTransaccionTransaccion!=null) {
						jComboBoxid_moduloBusquedaPorIdModuloPorTipoTransaccionTransaccion.setSelectedItem(moduloTemp);
					} else {
						if(jComboBoxid_moduloBusquedaPorIdModuloPorTipoTransaccionTransaccion!=null) {
							//jComboBoxid_moduloBusquedaPorIdModuloPorTipoTransaccionTransaccion.setSelectedItem(moduloTemp);
							if(jComboBoxid_moduloBusquedaPorIdModuloPorTipoTransaccionTransaccion.getItemCount()>0) {
								jComboBoxid_moduloBusquedaPorIdModuloPorTipoTransaccionTransaccion.setSelectedIndex(0);
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
	public void setActualModuloForeignKeyGenerico(Long idModuloSeleccionado,JComboBox jComboBoxid_moduloTransaccionGenerico)throws Exception
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
				jComboBoxid_moduloTransaccionGenerico.setSelectedItem(moduloTemp);
			} else {
				if(jComboBoxid_moduloTransaccionGenerico!=null && jComboBoxid_moduloTransaccionGenerico.getItemCount()>0) {
					jComboBoxid_moduloTransaccionGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualTipoTransaForeignKey(Long idTipoTransaSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			TipoTransa  tipotransaTemp=null;

			for(TipoTransa tipotransaAux:tipotransasForeignKey) {
				if(tipotransaAux.getId()!=null && tipotransaAux.getId().equals(idTipoTransaSeleccionado)) {
					tipotransaTemp=tipotransaAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(tipotransaTemp!=null) {

					if(this.transaccion!=null) {
						this.transaccion.setTipoTransa(tipotransaTemp);
					}

					if(this.jInternalFrameDetalleFormTransaccion!=null) {
						this.jInternalFrameDetalleFormTransaccion.jComboBoxid_tipo_transaTransaccion.setSelectedItem(tipotransaTemp);
					}
				} else {
					//jComboBoxid_tipo_transaTransaccion.setSelectedItem(tipotransaTemp);
					if(this.jInternalFrameDetalleFormTransaccion!=null) {
						if(this.jInternalFrameDetalleFormTransaccion.jComboBoxid_tipo_transaTransaccion.getItemCount()>0) {
							this.jInternalFrameDetalleFormTransaccion.jComboBoxid_tipo_transaTransaccion.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdTipoTransa") || sFormularioTipoBusqueda.equals("Todos")){
					if(tipotransaTemp!=null && jComboBoxid_tipo_transaFK_IdTipoTransaTransaccion!=null) {
						jComboBoxid_tipo_transaFK_IdTipoTransaTransaccion.setSelectedItem(tipotransaTemp);
					} else {
						if(jComboBoxid_tipo_transaFK_IdTipoTransaTransaccion!=null) {
							//jComboBoxid_tipo_transaFK_IdTipoTransaTransaccion.setSelectedItem(tipotransaTemp);
							if(jComboBoxid_tipo_transaFK_IdTipoTransaTransaccion.getItemCount()>0) {
								jComboBoxid_tipo_transaFK_IdTipoTransaTransaccion.setSelectedIndex(0);
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

	public String getActualTipoTransaForeignKeyDescripcion(Long idTipoTransaSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			TipoTransa  tipotransaTemp=null;

			for(TipoTransa tipotransaAux:tipotransasForeignKey) {
				if(tipotransaAux.getId()!=null && tipotransaAux.getId().equals(idTipoTransaSeleccionado)) {
					tipotransaTemp=tipotransaAux;
					break;
				}
			}


			sDescripcion=TipoTransaConstantesFunciones.getTipoTransaDescripcion(tipotransaTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualTipoTransaForeignKeyGenerico(Long idTipoTransaSeleccionado,JComboBox jComboBoxid_tipo_transaTransaccionGenerico)throws Exception
	{
		try
		{
			TipoTransa  tipotransaTemp=null;

			for(TipoTransa tipotransaAux:tipotransasForeignKey) {
				if(tipotransaAux.getId()!=null && tipotransaAux.getId().equals(idTipoTransaSeleccionado)) {
					tipotransaTemp=tipotransaAux;
					break;
				}
			}

			if(tipotransaTemp!=null) {
				jComboBoxid_tipo_transaTransaccionGenerico.setSelectedItem(tipotransaTemp);
			} else {
				if(jComboBoxid_tipo_transaTransaccionGenerico!=null && jComboBoxid_tipo_transaTransaccionGenerico.getItemCount()>0) {
					jComboBoxid_tipo_transaTransaccionGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualTipoComprobanteForeignKey(Long idTipoComprobanteSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			TipoComprobante  tipocomprobanteTemp=null;

			for(TipoComprobante tipocomprobanteAux:tipocomprobantesForeignKey) {
				if(tipocomprobanteAux.getId()!=null && tipocomprobanteAux.getId().equals(idTipoComprobanteSeleccionado)) {
					tipocomprobanteTemp=tipocomprobanteAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(tipocomprobanteTemp!=null) {

					if(this.transaccion!=null) {
						this.transaccion.setTipoComprobante(tipocomprobanteTemp);
					}

					if(this.jInternalFrameDetalleFormTransaccion!=null) {
						this.jInternalFrameDetalleFormTransaccion.jComboBoxid_tipo_comprobanteTransaccion.setSelectedItem(tipocomprobanteTemp);
					}
				} else {
					//jComboBoxid_tipo_comprobanteTransaccion.setSelectedItem(tipocomprobanteTemp);
					if(this.jInternalFrameDetalleFormTransaccion!=null) {
						if(this.jInternalFrameDetalleFormTransaccion.jComboBoxid_tipo_comprobanteTransaccion.getItemCount()>0) {
							this.jInternalFrameDetalleFormTransaccion.jComboBoxid_tipo_comprobanteTransaccion.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdTipoComprobante") || sFormularioTipoBusqueda.equals("Todos")){
					if(tipocomprobanteTemp!=null && jComboBoxid_tipo_comprobanteFK_IdTipoComprobanteTransaccion!=null) {
						jComboBoxid_tipo_comprobanteFK_IdTipoComprobanteTransaccion.setSelectedItem(tipocomprobanteTemp);
					} else {
						if(jComboBoxid_tipo_comprobanteFK_IdTipoComprobanteTransaccion!=null) {
							//jComboBoxid_tipo_comprobanteFK_IdTipoComprobanteTransaccion.setSelectedItem(tipocomprobanteTemp);
							if(jComboBoxid_tipo_comprobanteFK_IdTipoComprobanteTransaccion.getItemCount()>0) {
								jComboBoxid_tipo_comprobanteFK_IdTipoComprobanteTransaccion.setSelectedIndex(0);
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

	public String getActualTipoComprobanteForeignKeyDescripcion(Long idTipoComprobanteSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			TipoComprobante  tipocomprobanteTemp=null;

			for(TipoComprobante tipocomprobanteAux:tipocomprobantesForeignKey) {
				if(tipocomprobanteAux.getId()!=null && tipocomprobanteAux.getId().equals(idTipoComprobanteSeleccionado)) {
					tipocomprobanteTemp=tipocomprobanteAux;
					break;
				}
			}


			sDescripcion=TipoComprobanteConstantesFunciones.getTipoComprobanteDescripcion(tipocomprobanteTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualTipoComprobanteForeignKeyGenerico(Long idTipoComprobanteSeleccionado,JComboBox jComboBoxid_tipo_comprobanteTransaccionGenerico)throws Exception
	{
		try
		{
			TipoComprobante  tipocomprobanteTemp=null;

			for(TipoComprobante tipocomprobanteAux:tipocomprobantesForeignKey) {
				if(tipocomprobanteAux.getId()!=null && tipocomprobanteAux.getId().equals(idTipoComprobanteSeleccionado)) {
					tipocomprobanteTemp=tipocomprobanteAux;
					break;
				}
			}

			if(tipocomprobanteTemp!=null) {
				jComboBoxid_tipo_comprobanteTransaccionGenerico.setSelectedItem(tipocomprobanteTemp);
			} else {
				if(jComboBoxid_tipo_comprobanteTransaccionGenerico!=null && jComboBoxid_tipo_comprobanteTransaccionGenerico.getItemCount()>0) {
					jComboBoxid_tipo_comprobanteTransaccionGenerico.setSelectedIndex(0);
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

					if(this.transaccion!=null) {
						this.transaccion.setTipoTransaccionModulo(tipotransaccionmoduloTemp);
					}

					if(this.jInternalFrameDetalleFormTransaccion!=null) {
						this.jInternalFrameDetalleFormTransaccion.jComboBoxid_tipo_transaccion_moduloTransaccion.setSelectedItem(tipotransaccionmoduloTemp);
					}
				} else {
					//jComboBoxid_tipo_transaccion_moduloTransaccion.setSelectedItem(tipotransaccionmoduloTemp);
					if(this.jInternalFrameDetalleFormTransaccion!=null) {
						if(this.jInternalFrameDetalleFormTransaccion.jComboBoxid_tipo_transaccion_moduloTransaccion.getItemCount()>0) {
							this.jInternalFrameDetalleFormTransaccion.jComboBoxid_tipo_transaccion_moduloTransaccion.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaPorIdModuloPorTipoTransaccion") || sFormularioTipoBusqueda.equals("Todos")){
					if(tipotransaccionmoduloTemp!=null && jComboBoxid_tipo_transaccion_moduloBusquedaPorIdModuloPorTipoTransaccionTransaccion!=null) {
						jComboBoxid_tipo_transaccion_moduloBusquedaPorIdModuloPorTipoTransaccionTransaccion.setSelectedItem(tipotransaccionmoduloTemp);
					} else {
						if(jComboBoxid_tipo_transaccion_moduloBusquedaPorIdModuloPorTipoTransaccionTransaccion!=null) {
							//jComboBoxid_tipo_transaccion_moduloBusquedaPorIdModuloPorTipoTransaccionTransaccion.setSelectedItem(tipotransaccionmoduloTemp);
							if(jComboBoxid_tipo_transaccion_moduloBusquedaPorIdModuloPorTipoTransaccionTransaccion.getItemCount()>0) {
								jComboBoxid_tipo_transaccion_moduloBusquedaPorIdModuloPorTipoTransaccionTransaccion.setSelectedIndex(0);
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
	public void setActualTipoTransaccionModuloForeignKeyGenerico(Long idTipoTransaccionModuloSeleccionado,JComboBox jComboBoxid_tipo_transaccion_moduloTransaccionGenerico)throws Exception
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
				jComboBoxid_tipo_transaccion_moduloTransaccionGenerico.setSelectedItem(tipotransaccionmoduloTemp);
			} else {
				if(jComboBoxid_tipo_transaccion_moduloTransaccionGenerico!=null && jComboBoxid_tipo_transaccion_moduloTransaccionGenerico.getItemCount()>0) {
					jComboBoxid_tipo_transaccion_moduloTransaccionGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualTipoRetencionForeignKey(Long idTipoRetencionSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			TipoRetencion  tiporetencionTemp=null;

			for(TipoRetencion tiporetencionAux:tiporetencionsForeignKey) {
				if(tiporetencionAux.getId()!=null && tiporetencionAux.getId().equals(idTipoRetencionSeleccionado)) {
					tiporetencionTemp=tiporetencionAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(tiporetencionTemp!=null) {

					if(this.transaccion!=null) {
						this.transaccion.setTipoRetencion(tiporetencionTemp);
					}

					if(this.jInternalFrameDetalleFormTransaccion!=null) {
						this.jInternalFrameDetalleFormTransaccion.jComboBoxid_tipo_retencionTransaccion.setSelectedItem(tiporetencionTemp);
					}
				} else {
					//jComboBoxid_tipo_retencionTransaccion.setSelectedItem(tiporetencionTemp);
					if(this.jInternalFrameDetalleFormTransaccion!=null) {
						if(this.jInternalFrameDetalleFormTransaccion.jComboBoxid_tipo_retencionTransaccion.getItemCount()>0) {
							this.jInternalFrameDetalleFormTransaccion.jComboBoxid_tipo_retencionTransaccion.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdTipoRetencion") || sFormularioTipoBusqueda.equals("Todos")){
					if(tiporetencionTemp!=null && jComboBoxid_tipo_retencionFK_IdTipoRetencionTransaccion!=null) {
						jComboBoxid_tipo_retencionFK_IdTipoRetencionTransaccion.setSelectedItem(tiporetencionTemp);
					} else {
						if(jComboBoxid_tipo_retencionFK_IdTipoRetencionTransaccion!=null) {
							//jComboBoxid_tipo_retencionFK_IdTipoRetencionTransaccion.setSelectedItem(tiporetencionTemp);
							if(jComboBoxid_tipo_retencionFK_IdTipoRetencionTransaccion.getItemCount()>0) {
								jComboBoxid_tipo_retencionFK_IdTipoRetencionTransaccion.setSelectedIndex(0);
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

	public String getActualTipoRetencionForeignKeyDescripcion(Long idTipoRetencionSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			TipoRetencion  tiporetencionTemp=null;

			for(TipoRetencion tiporetencionAux:tiporetencionsForeignKey) {
				if(tiporetencionAux.getId()!=null && tiporetencionAux.getId().equals(idTipoRetencionSeleccionado)) {
					tiporetencionTemp=tiporetencionAux;
					break;
				}
			}


			sDescripcion=TipoRetencionConstantesFunciones.getTipoRetencionDescripcion(tiporetencionTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualTipoRetencionForeignKeyGenerico(Long idTipoRetencionSeleccionado,JComboBox jComboBoxid_tipo_retencionTransaccionGenerico)throws Exception
	{
		try
		{
			TipoRetencion  tiporetencionTemp=null;

			for(TipoRetencion tiporetencionAux:tiporetencionsForeignKey) {
				if(tiporetencionAux.getId()!=null && tiporetencionAux.getId().equals(idTipoRetencionSeleccionado)) {
					tiporetencionTemp=tiporetencionAux;
					break;
				}
			}

			if(tiporetencionTemp!=null) {
				jComboBoxid_tipo_retencionTransaccionGenerico.setSelectedItem(tiporetencionTemp);
			} else {
				if(jComboBoxid_tipo_retencionTransaccionGenerico!=null && jComboBoxid_tipo_retencionTransaccionGenerico.getItemCount()>0) {
					jComboBoxid_tipo_retencionTransaccionGenerico.setSelectedIndex(0);
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

					if(this.transaccion!=null) {
						this.transaccion.setCuentaContable(cuentacontableTemp);
					}

					if(this.jInternalFrameDetalleFormTransaccion!=null) {
						this.jInternalFrameDetalleFormTransaccion.jComboBoxid_cuenta_contableTransaccion.setSelectedItem(cuentacontableTemp);
					}
				} else {
					//jComboBoxid_cuenta_contableTransaccion.setSelectedItem(cuentacontableTemp);
					if(this.jInternalFrameDetalleFormTransaccion!=null) {
						if(this.jInternalFrameDetalleFormTransaccion.jComboBoxid_cuenta_contableTransaccion.getItemCount()>0) {
							this.jInternalFrameDetalleFormTransaccion.jComboBoxid_cuenta_contableTransaccion.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdCuentaContable") || sFormularioTipoBusqueda.equals("Todos")){
					if(cuentacontableTemp!=null && jComboBoxid_cuenta_contableFK_IdCuentaContableTransaccion!=null) {
						jComboBoxid_cuenta_contableFK_IdCuentaContableTransaccion.setSelectedItem(cuentacontableTemp);
					} else {
						if(jComboBoxid_cuenta_contableFK_IdCuentaContableTransaccion!=null) {
							//jComboBoxid_cuenta_contableFK_IdCuentaContableTransaccion.setSelectedItem(cuentacontableTemp);
							if(jComboBoxid_cuenta_contableFK_IdCuentaContableTransaccion.getItemCount()>0) {
								jComboBoxid_cuenta_contableFK_IdCuentaContableTransaccion.setSelectedIndex(0);
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
	public void setActualCuentaContableForeignKeyGenerico(Long idCuentaContableSeleccionado,JComboBox jComboBoxid_cuenta_contableTransaccionGenerico)throws Exception
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
				jComboBoxid_cuenta_contableTransaccionGenerico.setSelectedItem(cuentacontableTemp);
			} else {
				if(jComboBoxid_cuenta_contableTransaccionGenerico!=null && jComboBoxid_cuenta_contableTransaccionGenerico.getItemCount()>0) {
					jComboBoxid_cuenta_contableTransaccionGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(Transaccion transaccion,JComboBox jComboBoxid_empresaTransaccionGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaTransaccionGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormTransaccion.jComboBoxid_empresaTransaccion.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaTransaccionGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				transaccion.setid_empresa(empresaAux.getId());
				transaccion.setempresa_descripcion(TransaccionConstantesFunciones.getEmpresaDescripcion(empresaAux));
				transaccion.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarSucursalForeignKey(Transaccion transaccion,JComboBox jComboBoxid_sucursalTransaccionGenerico)throws Exception
	{
		try
		{
			Sucursal  sucursalAux=new Sucursal();

			if(jComboBoxid_sucursalTransaccionGenerico==null) {
				sucursalAux=(Sucursal)this.jInternalFrameDetalleFormTransaccion.jComboBoxid_sucursalTransaccion.getSelectedItem();
			} else {
				sucursalAux=(Sucursal)jComboBoxid_sucursalTransaccionGenerico.getSelectedItem();
			}

			if(sucursalAux!=null && sucursalAux.getId()!=null) {
				transaccion.setid_sucursal(sucursalAux.getId());
				transaccion.setsucursal_descripcion(TransaccionConstantesFunciones.getSucursalDescripcion(sucursalAux));
				transaccion.setSucursal(sucursalAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarModuloForeignKey(Transaccion transaccion,JComboBox jComboBoxid_moduloTransaccionGenerico)throws Exception
	{
		try
		{
			Modulo  moduloAux=new Modulo();

			if(jComboBoxid_moduloTransaccionGenerico==null) {
				moduloAux=(Modulo)this.jInternalFrameDetalleFormTransaccion.jComboBoxid_moduloTransaccion.getSelectedItem();
			} else {
				moduloAux=(Modulo)jComboBoxid_moduloTransaccionGenerico.getSelectedItem();
			}

			if(moduloAux!=null && moduloAux.getId()!=null) {
				transaccion.setid_modulo(moduloAux.getId());
				transaccion.setmodulo_descripcion(TransaccionConstantesFunciones.getModuloDescripcion(moduloAux));
				transaccion.setModulo(moduloAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarTipoTransaForeignKey(Transaccion transaccion,JComboBox jComboBoxid_tipo_transaTransaccionGenerico)throws Exception
	{
		try
		{
			TipoTransa  tipotransaAux=new TipoTransa();

			if(jComboBoxid_tipo_transaTransaccionGenerico==null) {
				tipotransaAux=(TipoTransa)this.jInternalFrameDetalleFormTransaccion.jComboBoxid_tipo_transaTransaccion.getSelectedItem();
			} else {
				tipotransaAux=(TipoTransa)jComboBoxid_tipo_transaTransaccionGenerico.getSelectedItem();
			}

			if(tipotransaAux!=null && tipotransaAux.getId()!=null) {
				transaccion.setid_tipo_transa(tipotransaAux.getId());
				transaccion.settipotransa_descripcion(TransaccionConstantesFunciones.getTipoTransaDescripcion(tipotransaAux));
				transaccion.setTipoTransa(tipotransaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarTipoComprobanteForeignKey(Transaccion transaccion,JComboBox jComboBoxid_tipo_comprobanteTransaccionGenerico)throws Exception
	{
		try
		{
			TipoComprobante  tipocomprobanteAux=new TipoComprobante();

			if(jComboBoxid_tipo_comprobanteTransaccionGenerico==null) {
				tipocomprobanteAux=(TipoComprobante)this.jInternalFrameDetalleFormTransaccion.jComboBoxid_tipo_comprobanteTransaccion.getSelectedItem();
			} else {
				tipocomprobanteAux=(TipoComprobante)jComboBoxid_tipo_comprobanteTransaccionGenerico.getSelectedItem();
			}

			if(tipocomprobanteAux!=null) {
				transaccion.setid_tipo_comprobante(tipocomprobanteAux.getId());
				transaccion.settipocomprobante_descripcion(TransaccionConstantesFunciones.getTipoComprobanteDescripcion(tipocomprobanteAux));
				transaccion.setTipoComprobante(tipocomprobanteAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarTipoTransaccionModuloForeignKey(Transaccion transaccion,JComboBox jComboBoxid_tipo_transaccion_moduloTransaccionGenerico)throws Exception
	{
		try
		{
			TipoTransaccionModulo  tipotransaccionmoduloAux=new TipoTransaccionModulo();

			if(jComboBoxid_tipo_transaccion_moduloTransaccionGenerico==null) {
				tipotransaccionmoduloAux=(TipoTransaccionModulo)this.jInternalFrameDetalleFormTransaccion.jComboBoxid_tipo_transaccion_moduloTransaccion.getSelectedItem();
			} else {
				tipotransaccionmoduloAux=(TipoTransaccionModulo)jComboBoxid_tipo_transaccion_moduloTransaccionGenerico.getSelectedItem();
			}

			if(tipotransaccionmoduloAux!=null) {
				transaccion.setid_tipo_transaccion_modulo(tipotransaccionmoduloAux.getId());
				transaccion.settipotransaccionmodulo_descripcion(TransaccionConstantesFunciones.getTipoTransaccionModuloDescripcion(tipotransaccionmoduloAux));
				transaccion.setTipoTransaccionModulo(tipotransaccionmoduloAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarTipoRetencionForeignKey(Transaccion transaccion,JComboBox jComboBoxid_tipo_retencionTransaccionGenerico)throws Exception
	{
		try
		{
			TipoRetencion  tiporetencionAux=new TipoRetencion();

			if(jComboBoxid_tipo_retencionTransaccionGenerico==null) {
				tiporetencionAux=(TipoRetencion)this.jInternalFrameDetalleFormTransaccion.jComboBoxid_tipo_retencionTransaccion.getSelectedItem();
			} else {
				tiporetencionAux=(TipoRetencion)jComboBoxid_tipo_retencionTransaccionGenerico.getSelectedItem();
			}

			if(tiporetencionAux!=null && tiporetencionAux.getId()!=null) {
				transaccion.setid_tipo_retencion(tiporetencionAux.getId());
				transaccion.settiporetencion_descripcion(TransaccionConstantesFunciones.getTipoRetencionDescripcion(tiporetencionAux));
				transaccion.setTipoRetencion(tiporetencionAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarCuentaContableForeignKey(Transaccion transaccion,JComboBox jComboBoxid_cuenta_contableTransaccionGenerico)throws Exception
	{
		try
		{
			CuentaContable  cuentacontableAux=new CuentaContable();

			if(jComboBoxid_cuenta_contableTransaccionGenerico==null) {
				cuentacontableAux=(CuentaContable)this.jInternalFrameDetalleFormTransaccion.jComboBoxid_cuenta_contableTransaccion.getSelectedItem();
			} else {
				cuentacontableAux=(CuentaContable)jComboBoxid_cuenta_contableTransaccionGenerico.getSelectedItem();
			}

			if(cuentacontableAux!=null) {
				transaccion.setid_cuenta_contable(cuentacontableAux.getId());
				transaccion.setcuentacontable_descripcion(TransaccionConstantesFunciones.getCuentaContableDescripcion(cuentacontableAux));
				transaccion.setCuentaContable(cuentacontableAux);			}
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

					if(!TransaccionJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormTransaccion!=null) { 
							this.jInternalFrameDetalleFormTransaccion.jComboBoxid_empresaTransaccion.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormTransaccion.jComboBoxid_empresaTransaccion.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormTransaccion!=null) { 
					}

					if(!TransaccionJInternalFrame.ISBINDING_MANUAL) {
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

					if(!TransaccionJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormTransaccion!=null) { 
							this.jInternalFrameDetalleFormTransaccion.jComboBoxid_sucursalTransaccion.removeAllItems();

							for(Sucursal sucursal:this.sucursalsForeignKey) {
								this.jInternalFrameDetalleFormTransaccion.jComboBoxid_sucursalTransaccion.addItem(sucursal);
							}
						}
					}

					if(this.jInternalFrameDetalleFormTransaccion!=null) { 
					}

					if(!TransaccionJInternalFrame.ISBINDING_MANUAL) {
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

					if(!TransaccionJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormTransaccion!=null) { 
							this.jInternalFrameDetalleFormTransaccion.jComboBoxid_moduloTransaccion.removeAllItems();

							for(Modulo modulo:this.modulosForeignKey) {
								this.jInternalFrameDetalleFormTransaccion.jComboBoxid_moduloTransaccion.addItem(modulo);
							}
						}
					}

					if(this.jInternalFrameDetalleFormTransaccion!=null) { 
					}

					if(!TransaccionJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaPorIdModuloPorTipoTransaccion") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!TransaccionJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_moduloBusquedaPorIdModuloPorTipoTransaccionTransaccion.removeAllItems();

							for(Modulo modulo:this.modulosForeignKey) {
								this.jComboBoxid_moduloBusquedaPorIdModuloPorTipoTransaccionTransaccion.addItem(modulo);
							}
						}

						if(!TransaccionJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameTipoTransasForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingTipoTransa=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!TransaccionJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormTransaccion!=null) { 
							this.jInternalFrameDetalleFormTransaccion.jComboBoxid_tipo_transaTransaccion.removeAllItems();

							for(TipoTransa tipotransa:this.tipotransasForeignKey) {
								this.jInternalFrameDetalleFormTransaccion.jComboBoxid_tipo_transaTransaccion.addItem(tipotransa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormTransaccion!=null) { 
					}

					if(!TransaccionJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdTipoTransa") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!TransaccionJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_tipo_transaFK_IdTipoTransaTransaccion.removeAllItems();

							for(TipoTransa tipotransa:this.tipotransasForeignKey) {
								this.jComboBoxid_tipo_transaFK_IdTipoTransaTransaccion.addItem(tipotransa);
							}
						}

						if(!TransaccionJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameTipoComprobantesForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingTipoComprobante=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!TransaccionJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormTransaccion!=null) { 
							this.jInternalFrameDetalleFormTransaccion.jComboBoxid_tipo_comprobanteTransaccion.removeAllItems();

							for(TipoComprobante tipocomprobante:this.tipocomprobantesForeignKey) {
								this.jInternalFrameDetalleFormTransaccion.jComboBoxid_tipo_comprobanteTransaccion.addItem(tipocomprobante);
							}
						}
					}

					if(this.jInternalFrameDetalleFormTransaccion!=null) { 
					}

					if(!TransaccionJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdTipoComprobante") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!TransaccionJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_tipo_comprobanteFK_IdTipoComprobanteTransaccion.removeAllItems();

							for(TipoComprobante tipocomprobante:this.tipocomprobantesForeignKey) {
								this.jComboBoxid_tipo_comprobanteFK_IdTipoComprobanteTransaccion.addItem(tipocomprobante);
							}
						}

						if(!TransaccionJInternalFrame.ISBINDING_MANUAL) {
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

					if(!TransaccionJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormTransaccion!=null) { 
							this.jInternalFrameDetalleFormTransaccion.jComboBoxid_tipo_transaccion_moduloTransaccion.removeAllItems();

							for(TipoTransaccionModulo tipotransaccionmodulo:this.tipotransaccionmodulosForeignKey) {
								this.jInternalFrameDetalleFormTransaccion.jComboBoxid_tipo_transaccion_moduloTransaccion.addItem(tipotransaccionmodulo);
							}
						}
					}

					if(this.jInternalFrameDetalleFormTransaccion!=null) { 
					}

					if(!TransaccionJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaPorIdModuloPorTipoTransaccion") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!TransaccionJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_tipo_transaccion_moduloBusquedaPorIdModuloPorTipoTransaccionTransaccion.removeAllItems();

							for(TipoTransaccionModulo tipotransaccionmodulo:this.tipotransaccionmodulosForeignKey) {
								this.jComboBoxid_tipo_transaccion_moduloBusquedaPorIdModuloPorTipoTransaccionTransaccion.addItem(tipotransaccionmodulo);
							}
						}

						if(!TransaccionJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameTipoRetencionsForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingTipoRetencion=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!TransaccionJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormTransaccion!=null) { 
							this.jInternalFrameDetalleFormTransaccion.jComboBoxid_tipo_retencionTransaccion.removeAllItems();

							for(TipoRetencion tiporetencion:this.tiporetencionsForeignKey) {
								this.jInternalFrameDetalleFormTransaccion.jComboBoxid_tipo_retencionTransaccion.addItem(tiporetencion);
							}
						}
					}

					if(this.jInternalFrameDetalleFormTransaccion!=null) { 
					}

					if(!TransaccionJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdTipoRetencion") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!TransaccionJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_tipo_retencionFK_IdTipoRetencionTransaccion.removeAllItems();

							for(TipoRetencion tiporetencion:this.tiporetencionsForeignKey) {
								this.jComboBoxid_tipo_retencionFK_IdTipoRetencionTransaccion.addItem(tiporetencion);
							}
						}

						if(!TransaccionJInternalFrame.ISBINDING_MANUAL) {
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

					if(!TransaccionJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormTransaccion!=null) { 
							this.jInternalFrameDetalleFormTransaccion.jComboBoxid_cuenta_contableTransaccion.removeAllItems();

							for(CuentaContable cuentacontable:this.cuentacontablesForeignKey) {
								this.jInternalFrameDetalleFormTransaccion.jComboBoxid_cuenta_contableTransaccion.addItem(cuentacontable);
							}
						}
					}

					if(this.jInternalFrameDetalleFormTransaccion!=null) { 
					}

					if(!TransaccionJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdCuentaContable") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!TransaccionJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_cuenta_contableFK_IdCuentaContableTransaccion.removeAllItems();

							for(CuentaContable cuentacontable:this.cuentacontablesForeignKey) {
								this.jComboBoxid_cuenta_contableFK_IdCuentaContableTransaccion.addItem(cuentacontable);
							}
						}

						if(!TransaccionJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormTransaccion!=null) {
							this.jInternalFrameDetalleFormTransaccion.jComboBoxid_empresaTransaccion.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormTransaccion!=null) {
							this.jInternalFrameDetalleFormTransaccion.jComboBoxid_empresaTransaccion.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormTransaccion!=null) {
							this.jInternalFrameDetalleFormTransaccion.jComboBoxid_sucursalTransaccion.setSelectedItem(sucursal);
						}
					} else {
						if(this.jInternalFrameDetalleFormTransaccion!=null) {
							this.jInternalFrameDetalleFormTransaccion.jComboBoxid_sucursalTransaccion.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormTransaccion!=null) {
							this.jInternalFrameDetalleFormTransaccion.jComboBoxid_moduloTransaccion.setSelectedItem(modulo);
						}
					} else {
						if(this.jInternalFrameDetalleFormTransaccion!=null) {
							this.jInternalFrameDetalleFormTransaccion.jComboBoxid_moduloTransaccion.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_moduloBusquedaPorIdModuloPorTipoTransaccionTransaccion.setSelectedItem(modulo);
						} else {
							this.jComboBoxid_moduloBusquedaPorIdModuloPorTipoTransaccionTransaccion.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameTipoTransaForeignKey(TipoTransa tipotransa,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormTransaccion!=null) {
							this.jInternalFrameDetalleFormTransaccion.jComboBoxid_tipo_transaTransaccion.setSelectedItem(tipotransa);
						}
					} else {
						if(this.jInternalFrameDetalleFormTransaccion!=null) {
							this.jInternalFrameDetalleFormTransaccion.jComboBoxid_tipo_transaTransaccion.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_tipo_transaFK_IdTipoTransaTransaccion.setSelectedItem(tipotransa);
						} else {
							this.jComboBoxid_tipo_transaFK_IdTipoTransaTransaccion.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameTipoComprobanteForeignKey(TipoComprobante tipocomprobante,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormTransaccion!=null) {
							this.jInternalFrameDetalleFormTransaccion.jComboBoxid_tipo_comprobanteTransaccion.setSelectedItem(tipocomprobante);
						}
					} else {
						if(this.jInternalFrameDetalleFormTransaccion!=null) {
							this.jInternalFrameDetalleFormTransaccion.jComboBoxid_tipo_comprobanteTransaccion.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_tipo_comprobanteFK_IdTipoComprobanteTransaccion.setSelectedItem(tipocomprobante);
						} else {
							this.jComboBoxid_tipo_comprobanteFK_IdTipoComprobanteTransaccion.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormTransaccion!=null) {
							this.jInternalFrameDetalleFormTransaccion.jComboBoxid_tipo_transaccion_moduloTransaccion.setSelectedItem(tipotransaccionmodulo);
						}
					} else {
						if(this.jInternalFrameDetalleFormTransaccion!=null) {
							this.jInternalFrameDetalleFormTransaccion.jComboBoxid_tipo_transaccion_moduloTransaccion.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_tipo_transaccion_moduloBusquedaPorIdModuloPorTipoTransaccionTransaccion.setSelectedItem(tipotransaccionmodulo);
						} else {
							this.jComboBoxid_tipo_transaccion_moduloBusquedaPorIdModuloPorTipoTransaccionTransaccion.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameTipoRetencionForeignKey(TipoRetencion tiporetencion,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormTransaccion!=null) {
							this.jInternalFrameDetalleFormTransaccion.jComboBoxid_tipo_retencionTransaccion.setSelectedItem(tiporetencion);
						}
					} else {
						if(this.jInternalFrameDetalleFormTransaccion!=null) {
							this.jInternalFrameDetalleFormTransaccion.jComboBoxid_tipo_retencionTransaccion.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_tipo_retencionFK_IdTipoRetencionTransaccion.setSelectedItem(tiporetencion);
						} else {
							this.jComboBoxid_tipo_retencionFK_IdTipoRetencionTransaccion.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormTransaccion!=null) {
							this.jInternalFrameDetalleFormTransaccion.jComboBoxid_cuenta_contableTransaccion.setSelectedItem(cuentacontable);
						}
					} else {
						if(this.jInternalFrameDetalleFormTransaccion!=null) {
							this.jInternalFrameDetalleFormTransaccion.jComboBoxid_cuenta_contableTransaccion.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_cuenta_contableFK_IdCuentaContableTransaccion.setSelectedItem(cuentacontable);
						} else {
							this.jComboBoxid_cuenta_contableFK_IdCuentaContableTransaccion.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesTransaccion() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			TransaccionConstantesFunciones.refrescarForeignKeysDescripcionesTransaccion(this.transaccionLogic.getTransaccions());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			TransaccionConstantesFunciones.refrescarForeignKeysDescripcionesTransaccion(this.transaccions);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
		classes.add(new Classe(Sucursal.class));
		classes.add(new Classe(Modulo.class));
		classes.add(new Classe(TipoTransa.class));
		classes.add(new Classe(TipoComprobante.class));
		classes.add(new Classe(TipoTransaccionModulo.class));
		classes.add(new Classe(TipoRetencion.class));
		classes.add(new Classe(CuentaContable.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//transaccionLogic.setTransaccions(this.transaccions);
			transaccionLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public TransaccionParameterReturnGeneral getTransaccionParameterGeneral() {
		return this.transaccionParameterGeneral;
	}
	
	public void setTransaccionParameterGeneral(TransaccionParameterReturnGeneral transaccionParameterGeneral) {
		this.transaccionParameterGeneral = transaccionParameterGeneral;
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
	
	public Boolean getIsPermisoTodoTransaccion() {
		return isPermisoTodoTransaccion;
	}

	public void setIsPermisoTodoTransaccion(Boolean isPermisoTodoTransaccion) {
		this.isPermisoTodoTransaccion = isPermisoTodoTransaccion;
	}

	public Boolean getIsPermisoNuevoTransaccion() {
		return isPermisoNuevoTransaccion;
	}

	public void setIsPermisoNuevoTransaccion(Boolean isPermisoNuevoTransaccion) {
		this.isPermisoNuevoTransaccion = isPermisoNuevoTransaccion;
	}

	public Boolean getIsPermisoActualizarTransaccion() {
		return isPermisoActualizarTransaccion;
	}

	public void setIsPermisoActualizarTransaccion(Boolean isPermisoActualizarTransaccion) {
		this.isPermisoActualizarTransaccion = isPermisoActualizarTransaccion;
	}

	public Boolean getIsPermisoEliminarTransaccion() {
		return isPermisoEliminarTransaccion;
	}

	public void setIsPermisoEliminarTransaccion(Boolean isPermisoEliminarTransaccion) {
		this.isPermisoEliminarTransaccion = isPermisoEliminarTransaccion;
	}

	public Boolean getIsPermisoGuardarCambiosTransaccion() {
		return isPermisoGuardarCambiosTransaccion;
	}

	public void setIsPermisoGuardarCambiosTransaccion(Boolean isPermisoGuardarCambiosTransaccion) {
		this.isPermisoGuardarCambiosTransaccion = isPermisoGuardarCambiosTransaccion;
	}
	
	public Boolean getIsPermisoConsultaTransaccion() {
		return isPermisoConsultaTransaccion;
	}

	public void setIsPermisoConsultaTransaccion(Boolean isPermisoConsultaTransaccion) {
		this.isPermisoConsultaTransaccion = isPermisoConsultaTransaccion;
	}

	public Boolean getIsPermisoBusquedaTransaccion() {
		return isPermisoBusquedaTransaccion;
	}

	public void setIsPermisoBusquedaTransaccion(Boolean isPermisoBusquedaTransaccion) {
		this.isPermisoBusquedaTransaccion = isPermisoBusquedaTransaccion;
	}

	public Boolean getIsPermisoReporteTransaccion() {
		return isPermisoReporteTransaccion;
	}

	public void setIsPermisoReporteTransaccion(Boolean isPermisoReporteTransaccion) {
		this.isPermisoReporteTransaccion = isPermisoReporteTransaccion;
	}
	
	public Boolean getIsPermisoPaginacionMedioTransaccion() {
		return isPermisoPaginacionMedioTransaccion;
	}

	public void setIsPermisoPaginacionMedioTransaccion(Boolean isPermisoPaginacionMedioTransaccion) {
		this.isPermisoPaginacionMedioTransaccion = isPermisoPaginacionMedioTransaccion;
	}
	
	public Boolean getIsPermisoPaginacionTodoTransaccion() {
		return isPermisoPaginacionTodoTransaccion;
	}

	public void setIsPermisoPaginacionTodoTransaccion(Boolean isPermisoPaginacionTodoTransaccion) {
		this.isPermisoPaginacionTodoTransaccion = isPermisoPaginacionTodoTransaccion;
	}
	
	public Boolean getIsPermisoPaginacionAltoTransaccion() {
		return isPermisoPaginacionAltoTransaccion;
	}

	public void setIsPermisoPaginacionAltoTransaccion(Boolean isPermisoPaginacionAltoTransaccion) {
		this.isPermisoPaginacionAltoTransaccion = isPermisoPaginacionAltoTransaccion;
	}
	
	public Boolean getIsPermisoCopiarTransaccion() {
		return isPermisoCopiarTransaccion;
	}

	public void setIsPermisoCopiarTransaccion(Boolean isPermisoCopiarTransaccion) {
		this.isPermisoCopiarTransaccion = isPermisoCopiarTransaccion;
	}
	
	public Boolean getIsPermisoVerFormTransaccion() {
		return isPermisoVerFormTransaccion;
	}

	public void setIsPermisoVerFormTransaccion(Boolean isPermisoVerFormTransaccion) {
		this.isPermisoVerFormTransaccion = isPermisoVerFormTransaccion;
	}
	
	public Boolean getIsPermisoDuplicarTransaccion() {
		return isPermisoDuplicarTransaccion;
	}

	public void setIsPermisoDuplicarTransaccion(Boolean isPermisoDuplicarTransaccion) {
		this.isPermisoDuplicarTransaccion = isPermisoDuplicarTransaccion;
	}
	
	public Boolean getIsPermisoOrdenTransaccion() {
		return isPermisoOrdenTransaccion;
	}

	public void setIsPermisoOrdenTransaccion(Boolean isPermisoOrdenTransaccion) {
		this.isPermisoOrdenTransaccion = isPermisoOrdenTransaccion;
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
	
	public Boolean getIsVisibilidadCeldaNuevoTransaccion() {
		return isVisibilidadCeldaNuevoTransaccion;
	}

	public void setIsVisibilidadCeldaNuevoTransaccion(Boolean isVisibilidadCeldaNuevoTransaccion) {
		this.isVisibilidadCeldaNuevoTransaccion = isVisibilidadCeldaNuevoTransaccion;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarTransaccion() {
		return isVisibilidadCeldaDuplicarTransaccion;
	}

	public void setIsVisibilidadCeldaDuplicarTransaccion(Boolean isVisibilidadCeldaDuplicarTransaccion) {
		this.isVisibilidadCeldaDuplicarTransaccion = isVisibilidadCeldaDuplicarTransaccion;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarTransaccion() {
		return isVisibilidadCeldaCopiarTransaccion;
	}

	public void setIsVisibilidadCeldaCopiarTransaccion(Boolean isVisibilidadCeldaCopiarTransaccion) {
		this.isVisibilidadCeldaCopiarTransaccion = isVisibilidadCeldaCopiarTransaccion;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormTransaccion() {
		return isVisibilidadCeldaVerFormTransaccion;
	}

	public void setIsVisibilidadCeldaVerFormTransaccion(Boolean isVisibilidadCeldaVerFormTransaccion) {
		this.isVisibilidadCeldaVerFormTransaccion = isVisibilidadCeldaVerFormTransaccion;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenTransaccion() {
		return isVisibilidadCeldaOrdenTransaccion;
	}

	public void setIsVisibilidadCeldaOrdenTransaccion(Boolean isVisibilidadCeldaOrdenTransaccion) {
		this.isVisibilidadCeldaOrdenTransaccion = isVisibilidadCeldaOrdenTransaccion;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesTransaccion() {
		return isVisibilidadCeldaNuevoRelacionesTransaccion;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesTransaccion(Boolean isVisibilidadCeldaNuevoRelacionesTransaccion) {
		this.isVisibilidadCeldaNuevoRelacionesTransaccion = isVisibilidadCeldaNuevoRelacionesTransaccion;
	}
	
	public Boolean getIsVisibilidadCeldaModificarTransaccion() {
		return isVisibilidadCeldaModificarTransaccion;
	}

	public void setIsVisibilidadCeldaModificarTransaccion(Boolean isVisibilidadCeldaModificarTransaccion) {
		this.isVisibilidadCeldaModificarTransaccion = isVisibilidadCeldaModificarTransaccion;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarTransaccion() {
		return isVisibilidadCeldaActualizarTransaccion;
	}

	public void setIsVisibilidadCeldaActualizarTransaccion(Boolean isVisibilidadCeldaActualizarTransaccion) {
		this.isVisibilidadCeldaActualizarTransaccion = isVisibilidadCeldaActualizarTransaccion;
	}

	public Boolean getIsVisibilidadCeldaEliminarTransaccion() {
		return isVisibilidadCeldaEliminarTransaccion;
	}

	public void setIsVisibilidadCeldaEliminarTransaccion(Boolean isVisibilidadCeldaEliminarTransaccion) {
		this.isVisibilidadCeldaEliminarTransaccion = isVisibilidadCeldaEliminarTransaccion;
	}

	public Boolean getIsVisibilidadCeldaCancelarTransaccion() {
		return isVisibilidadCeldaCancelarTransaccion;
	}

	public void setIsVisibilidadCeldaCancelarTransaccion(Boolean isVisibilidadCeldaCancelarTransaccion) {
		this.isVisibilidadCeldaCancelarTransaccion = isVisibilidadCeldaCancelarTransaccion;
	}

	public Boolean getIsVisibilidadCeldaGuardarTransaccion() {
		return isVisibilidadCeldaGuardarTransaccion;
	}

	public void setIsVisibilidadCeldaGuardarTransaccion(Boolean isVisibilidadCeldaGuardarTransaccion) {
		this.isVisibilidadCeldaGuardarTransaccion = isVisibilidadCeldaGuardarTransaccion;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosTransaccion() {
		return isVisibilidadCeldaGuardarCambiosTransaccion;
	}

	public void setIsVisibilidadCeldaGuardarCambiosTransaccion(Boolean isVisibilidadCeldaGuardarCambiosTransaccion) {
		this.isVisibilidadCeldaGuardarCambiosTransaccion = isVisibilidadCeldaGuardarCambiosTransaccion;
	}
		
	public TransaccionSessionBean gettransaccionSessionBean() {
		return this.transaccionSessionBean;
	}
	
	public void settransaccionSessionBean(TransaccionSessionBean transaccionSessionBean) {
		this.transaccionSessionBean=transaccionSessionBean;
	}
	
	
	public Boolean getisVisibilidadBusquedaPorCodigo() {
		return this.isVisibilidadBusquedaPorCodigo;
	}

	public void setisVisibilidadBusquedaPorCodigo(Boolean isVisibilidadBusquedaPorCodigo) {
		this.isVisibilidadBusquedaPorCodigo=isVisibilidadBusquedaPorCodigo;
	}

	public Boolean getisVisibilidadBusquedaPorIdModuloPorTipoTransaccion() {
		return this.isVisibilidadBusquedaPorIdModuloPorTipoTransaccion;
	}

	public void setisVisibilidadBusquedaPorIdModuloPorTipoTransaccion(Boolean isVisibilidadBusquedaPorIdModuloPorTipoTransaccion) {
		this.isVisibilidadBusquedaPorIdModuloPorTipoTransaccion=isVisibilidadBusquedaPorIdModuloPorTipoTransaccion;
	}

	public Boolean getisVisibilidadBusquedaPorNombre() {
		return this.isVisibilidadBusquedaPorNombre;
	}

	public void setisVisibilidadBusquedaPorNombre(Boolean isVisibilidadBusquedaPorNombre) {
		this.isVisibilidadBusquedaPorNombre=isVisibilidadBusquedaPorNombre;
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

	public Boolean getisVisibilidadFK_IdModulo() {
		return this.isVisibilidadFK_IdModulo;
	}

	public void setisVisibilidadFK_IdModulo(Boolean isVisibilidadFK_IdModulo) {
		this.isVisibilidadFK_IdModulo=isVisibilidadFK_IdModulo;
	}

	public Boolean getisVisibilidadFK_IdSucursal() {
		return this.isVisibilidadFK_IdSucursal;
	}

	public void setisVisibilidadFK_IdSucursal(Boolean isVisibilidadFK_IdSucursal) {
		this.isVisibilidadFK_IdSucursal=isVisibilidadFK_IdSucursal;
	}

	public Boolean getisVisibilidadFK_IdTipoComprobante() {
		return this.isVisibilidadFK_IdTipoComprobante;
	}

	public void setisVisibilidadFK_IdTipoComprobante(Boolean isVisibilidadFK_IdTipoComprobante) {
		this.isVisibilidadFK_IdTipoComprobante=isVisibilidadFK_IdTipoComprobante;
	}

	public Boolean getisVisibilidadFK_IdTipoRetencion() {
		return this.isVisibilidadFK_IdTipoRetencion;
	}

	public void setisVisibilidadFK_IdTipoRetencion(Boolean isVisibilidadFK_IdTipoRetencion) {
		this.isVisibilidadFK_IdTipoRetencion=isVisibilidadFK_IdTipoRetencion;
	}

	public Boolean getisVisibilidadFK_IdTipoTransa() {
		return this.isVisibilidadFK_IdTipoTransa;
	}

	public void setisVisibilidadFK_IdTipoTransa(Boolean isVisibilidadFK_IdTipoTransa) {
		this.isVisibilidadFK_IdTipoTransa=isVisibilidadFK_IdTipoTransa;
	}

	public Boolean getisVisibilidadFK_IdTipoTransaccionModulo() {
		return this.isVisibilidadFK_IdTipoTransaccionModulo;
	}

	public void setisVisibilidadFK_IdTipoTransaccionModulo(Boolean isVisibilidadFK_IdTipoTransaccionModulo) {
		this.isVisibilidadFK_IdTipoTransaccionModulo=isVisibilidadFK_IdTipoTransaccionModulo;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysTransaccion(Transaccion transaccion)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(transaccion,null);
				this.setActualParaGuardarSucursalForeignKey(transaccion,null);
				this.setActualParaGuardarModuloForeignKey(transaccion,null);
				this.setActualParaGuardarTipoTransaForeignKey(transaccion,null);
				this.setActualParaGuardarTipoComprobanteForeignKey(transaccion,null);
				this.setActualParaGuardarTipoTransaccionModuloForeignKey(transaccion,null);
				this.setActualParaGuardarTipoRetencionForeignKey(transaccion,null);
				this.setActualParaGuardarCuentaContableForeignKey(transaccion,null);
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
	
	public void bugActualizarReferenciaActual(Transaccion transaccion,Transaccion transaccionAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalTransaccion(transaccion);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		transaccionAux.setId(transaccion.getId());
		transaccionAux.setVersionRow(transaccion.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessTransaccion();
		
			int intSelectedRow = this.jTableDatosTransaccion.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transaccion =(Transaccion) this.transaccionLogic.getTransaccions().toArray()[this.jTableDatosTransaccion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.transaccion =(Transaccion) this.transaccions.toArray()[this.jTableDatosTransaccion.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(TransaccionJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualTransaccion(this.transaccion,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysTransaccion(this.transaccion);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = transaccionValidator.getInvalidValues(this.transaccion);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			transaccionLogic.setDatosCliente(datosCliente);
			transaccionLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				transaccionAux=new  Transaccion();
				
				transaccionAux.setIsNew(true);
				transaccionAux.setIsChanged(true);
				
				transaccionAux.setTransaccionOriginal(this.transaccion);
				
				transaccionAux.setId(this.transaccion.getId());	
				transaccionAux.setVersionRow(this.transaccion.getVersionRow());	
				transaccionAux.setid_empresa(this.transaccion.getid_empresa());	
				transaccionAux.setid_sucursal(this.transaccion.getid_sucursal());	
				transaccionAux.setcodigo(this.transaccion.getcodigo());	
				transaccionAux.setnombre(this.transaccion.getnombre());	
				transaccionAux.setid_modulo(this.transaccion.getid_modulo());	
				transaccionAux.setid_tipo_transa(this.transaccion.getid_tipo_transa());	
				transaccionAux.setid_tipo_comprobante(this.transaccion.getid_tipo_comprobante());	
				transaccionAux.setid_tipo_transaccion_modulo(this.transaccion.getid_tipo_transaccion_modulo());	
				transaccionAux.setid_tipo_retencion(this.transaccion.getid_tipo_retencion());	
				transaccionAux.setid_cuenta_contable(this.transaccion.getid_cuenta_contable());	
				transaccionAux.setdescripcion(this.transaccion.getdescripcion());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.transaccionSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.transaccionSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(transaccionAux,transaccionLogic.getTransaccions());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(transaccionAux,transaccions);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.transaccionSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.transaccionSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						transaccionLogic.saveTransaccions();//WithConnection
						//transaccionLogic.getSetVersionRowTransaccions();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.transaccion,transaccionAux);
					
					this.refrescarForeignKeysDescripcionesTransaccion();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				transaccionAux=new  Transaccion();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.transaccionSessionBean.getEsGuardarRelacionado() 
					|| (this.transaccionSessionBean.getEsGuardarRelacionado() && this.transaccion.getId()>=0)) {
						
					transaccionAux.setIsNew(false);
				}
				
				transaccionAux.setIsDeleted(false);
			
				transaccionAux.setId(this.transaccion.getId());	
				transaccionAux.setVersionRow(this.transaccion.getVersionRow());	
				transaccionAux.setid_empresa(this.transaccion.getid_empresa());	
				transaccionAux.setid_sucursal(this.transaccion.getid_sucursal());	
				transaccionAux.setcodigo(this.transaccion.getcodigo());	
				transaccionAux.setnombre(this.transaccion.getnombre());	
				transaccionAux.setid_modulo(this.transaccion.getid_modulo());	
				transaccionAux.setid_tipo_transa(this.transaccion.getid_tipo_transa());	
				transaccionAux.setid_tipo_comprobante(this.transaccion.getid_tipo_comprobante());	
				transaccionAux.setid_tipo_transaccion_modulo(this.transaccion.getid_tipo_transaccion_modulo());	
				transaccionAux.setid_tipo_retencion(this.transaccion.getid_tipo_retencion());	
				transaccionAux.setid_cuenta_contable(this.transaccion.getid_cuenta_contable());	
				transaccionAux.setdescripcion(this.transaccion.getdescripcion());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(transaccionAux,transaccionLogic.getTransaccions());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(transaccionAux,transaccions);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.transaccionSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.transaccionSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						transaccionLogic.saveTransaccions();//WithConnection
						//transaccionLogic.getSetVersionRowTransaccions();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.transaccion,transaccionAux);
					
					this.refrescarForeignKeysDescripcionesTransaccion();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				transaccionAux=new  Transaccion();
				
				transaccionAux.setIsNew(false);
				transaccionAux.setIsChanged(false);
				
				transaccionAux.setIsDeleted(true);
				
				transaccionAux.setId(this.transaccion.getId());	
				transaccionAux.setVersionRow(this.transaccion.getVersionRow());	
				transaccionAux.setid_empresa(this.transaccion.getid_empresa());	
				transaccionAux.setid_sucursal(this.transaccion.getid_sucursal());	
				transaccionAux.setcodigo(this.transaccion.getcodigo());	
				transaccionAux.setnombre(this.transaccion.getnombre());	
				transaccionAux.setid_modulo(this.transaccion.getid_modulo());	
				transaccionAux.setid_tipo_transa(this.transaccion.getid_tipo_transa());	
				transaccionAux.setid_tipo_comprobante(this.transaccion.getid_tipo_comprobante());	
				transaccionAux.setid_tipo_transaccion_modulo(this.transaccion.getid_tipo_transaccion_modulo());	
				transaccionAux.setid_tipo_retencion(this.transaccion.getid_tipo_retencion());	
				transaccionAux.setid_cuenta_contable(this.transaccion.getid_cuenta_contable());	
				transaccionAux.setdescripcion(this.transaccion.getdescripcion());	
				
				if(this.transaccionSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.transaccionAux.getId()>=0) {	
						this.transaccionsEliminados.add(transaccionAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(transaccionAux,transaccionLogic.getTransaccions());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(transaccionAux,transaccions);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.transaccionSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.transaccionSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						transaccionLogic.saveTransaccions();//WithConnection
						//transaccionLogic.getSetVersionRowTransaccions();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transaccionLogic.getTransaccions().addAll(this.transaccionsEliminados);
					
					transaccionLogic.saveTransaccions();//WithConnection
					//transaccionLogic.getSetVersionRowTransaccions();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesTransaccion();
				
				this.transaccionsEliminados= new ArrayList<Transaccion>();		
			}
			
			if(this.transaccionSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.transaccionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Transaccion GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Transaccion",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.transaccion=transaccionAux;
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
      		//this.finishProcessTransaccion();
      	}
		
	}	
	
	public void actualizarRelaciones(Transaccion transaccionLocal) throws Exception {
		
		if(this.transaccionSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(Transaccion transaccionLocal) throws Exception {	
		if(this.transaccionSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				transaccionLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(SucursalDetalleFormJInternalFrame.class)) {
				SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrameLocal=(SucursalBeanSwingJInternalFrame) ((SucursalDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				sucursalBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoSucursal(sucursalBeanSwingJInternalFrameLocal.getsucursal(),true);
				sucursalBeanSwingJInternalFrameLocal.actualizarLista(sucursalBeanSwingJInternalFrameLocal.sucursal,this.sucursalsForeignKey);

				sucursalBeanSwingJInternalFrameLocal.actualizarRelaciones(sucursalBeanSwingJInternalFrameLocal.sucursal);

				transaccionLocal.setSucursal(sucursalBeanSwingJInternalFrameLocal.sucursal);

				this.addItemDefectoCombosForeignKeySucursal();
				this.cargarCombosFrameSucursalsForeignKey("Formulario");
				this.setActualSucursalForeignKey(sucursalBeanSwingJInternalFrameLocal.sucursal.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(ModuloDetalleFormJInternalFrame.class)) {
				ModuloBeanSwingJInternalFrame moduloBeanSwingJInternalFrameLocal=(ModuloBeanSwingJInternalFrame) ((ModuloDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				moduloBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoModulo(moduloBeanSwingJInternalFrameLocal.getmodulo(),true);
				moduloBeanSwingJInternalFrameLocal.actualizarLista(moduloBeanSwingJInternalFrameLocal.modulo,this.modulosForeignKey);

				moduloBeanSwingJInternalFrameLocal.actualizarRelaciones(moduloBeanSwingJInternalFrameLocal.modulo);

				transaccionLocal.setModulo(moduloBeanSwingJInternalFrameLocal.modulo);

				this.addItemDefectoCombosForeignKeyModulo();
				this.cargarCombosFrameModulosForeignKey("Formulario");
				this.setActualModuloForeignKey(moduloBeanSwingJInternalFrameLocal.modulo.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(TipoTransaDetalleFormJInternalFrame.class)) {
				TipoTransaBeanSwingJInternalFrame tipotransaBeanSwingJInternalFrameLocal=(TipoTransaBeanSwingJInternalFrame) ((TipoTransaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				tipotransaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoTipoTransa(tipotransaBeanSwingJInternalFrameLocal.gettipotransa(),true);
				tipotransaBeanSwingJInternalFrameLocal.actualizarLista(tipotransaBeanSwingJInternalFrameLocal.tipotransa,this.tipotransasForeignKey);

				tipotransaBeanSwingJInternalFrameLocal.actualizarRelaciones(tipotransaBeanSwingJInternalFrameLocal.tipotransa);

				transaccionLocal.setTipoTransa(tipotransaBeanSwingJInternalFrameLocal.tipotransa);

				this.addItemDefectoCombosForeignKeyTipoTransa();
				this.cargarCombosFrameTipoTransasForeignKey("Formulario");
				this.setActualTipoTransaForeignKey(tipotransaBeanSwingJInternalFrameLocal.tipotransa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(TipoComprobanteDetalleFormJInternalFrame.class)) {
				TipoComprobanteBeanSwingJInternalFrame tipocomprobanteBeanSwingJInternalFrameLocal=(TipoComprobanteBeanSwingJInternalFrame) ((TipoComprobanteDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				tipocomprobanteBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoTipoComprobante(tipocomprobanteBeanSwingJInternalFrameLocal.gettipocomprobante(),true);
				tipocomprobanteBeanSwingJInternalFrameLocal.actualizarLista(tipocomprobanteBeanSwingJInternalFrameLocal.tipocomprobante,this.tipocomprobantesForeignKey);

				tipocomprobanteBeanSwingJInternalFrameLocal.actualizarRelaciones(tipocomprobanteBeanSwingJInternalFrameLocal.tipocomprobante);

				transaccionLocal.setTipoComprobante(tipocomprobanteBeanSwingJInternalFrameLocal.tipocomprobante);

				this.addItemDefectoCombosForeignKeyTipoComprobante();
				this.cargarCombosFrameTipoComprobantesForeignKey("Formulario");
				this.setActualTipoComprobanteForeignKey(tipocomprobanteBeanSwingJInternalFrameLocal.tipocomprobante.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(TipoTransaccionModuloDetalleFormJInternalFrame.class)) {
				TipoTransaccionModuloBeanSwingJInternalFrame tipotransaccionmoduloBeanSwingJInternalFrameLocal=(TipoTransaccionModuloBeanSwingJInternalFrame) ((TipoTransaccionModuloDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				tipotransaccionmoduloBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoTipoTransaccionModulo(tipotransaccionmoduloBeanSwingJInternalFrameLocal.gettipotransaccionmodulo(),true);
				tipotransaccionmoduloBeanSwingJInternalFrameLocal.actualizarLista(tipotransaccionmoduloBeanSwingJInternalFrameLocal.tipotransaccionmodulo,this.tipotransaccionmodulosForeignKey);

				tipotransaccionmoduloBeanSwingJInternalFrameLocal.actualizarRelaciones(tipotransaccionmoduloBeanSwingJInternalFrameLocal.tipotransaccionmodulo);

				transaccionLocal.setTipoTransaccionModulo(tipotransaccionmoduloBeanSwingJInternalFrameLocal.tipotransaccionmodulo);

				this.addItemDefectoCombosForeignKeyTipoTransaccionModulo();
				this.cargarCombosFrameTipoTransaccionModulosForeignKey("Formulario");
				this.setActualTipoTransaccionModuloForeignKey(tipotransaccionmoduloBeanSwingJInternalFrameLocal.tipotransaccionmodulo.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(TipoRetencionDetalleFormJInternalFrame.class)) {
				TipoRetencionBeanSwingJInternalFrame tiporetencionBeanSwingJInternalFrameLocal=(TipoRetencionBeanSwingJInternalFrame) ((TipoRetencionDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				tiporetencionBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoTipoRetencion(tiporetencionBeanSwingJInternalFrameLocal.gettiporetencion(),true);
				tiporetencionBeanSwingJInternalFrameLocal.actualizarLista(tiporetencionBeanSwingJInternalFrameLocal.tiporetencion,this.tiporetencionsForeignKey);

				tiporetencionBeanSwingJInternalFrameLocal.actualizarRelaciones(tiporetencionBeanSwingJInternalFrameLocal.tiporetencion);

				transaccionLocal.setTipoRetencion(tiporetencionBeanSwingJInternalFrameLocal.tiporetencion);

				this.addItemDefectoCombosForeignKeyTipoRetencion();
				this.cargarCombosFrameTipoRetencionsForeignKey("Formulario");
				this.setActualTipoRetencionForeignKey(tiporetencionBeanSwingJInternalFrameLocal.tiporetencion.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(CuentaContableDetalleFormJInternalFrame.class)) {
				CuentaContableBeanSwingJInternalFrame cuentacontableBeanSwingJInternalFrameLocal=(CuentaContableBeanSwingJInternalFrame) ((CuentaContableDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				cuentacontableBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoCuentaContable(cuentacontableBeanSwingJInternalFrameLocal.getcuentacontable(),true);
				cuentacontableBeanSwingJInternalFrameLocal.actualizarLista(cuentacontableBeanSwingJInternalFrameLocal.cuentacontable,this.cuentacontablesForeignKey);

				cuentacontableBeanSwingJInternalFrameLocal.actualizarRelaciones(cuentacontableBeanSwingJInternalFrameLocal.cuentacontable);

				transaccionLocal.setCuentaContable(cuentacontableBeanSwingJInternalFrameLocal.cuentacontable);

				this.addItemDefectoCombosForeignKeyCuentaContable();
				this.cargarCombosFrameCuentaContablesForeignKey("Formulario");
				this.setActualCuentaContableForeignKey(cuentacontableBeanSwingJInternalFrameLocal.cuentacontable.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarTransaccionActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosTransaccion.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.transaccion =(Transaccion) this.transaccionLogic.getTransaccions().toArray()[this.jTableDatosTransaccion.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.transaccion =(Transaccion) this.transaccions.toArray()[this.jTableDatosTransaccion.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = transaccionValidator.getInvalidValues(this.transaccion);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(Transaccion transaccion,List<Transaccion> transaccions) throws Exception {
		try	{		
			TransaccionConstantesFunciones.actualizarLista(transaccion,transaccions,this.transaccionSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(Transaccion transaccion,List<Transaccion> transaccions) throws Exception {
		try	{			
			TransaccionConstantesFunciones.actualizarSelectedLista(transaccion,transaccions);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<Transaccion> transaccionsLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				transaccionsLocal=this.transaccionLogic.getTransaccions();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				transaccionsLocal=this.transaccions;
			}
			//ARCHITECTURE
		
			for(Transaccion transaccionLocal:transaccionsLocal) {
				if(this.permiteMantenimiento(transaccionLocal) && transaccionLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+TransaccionConstantesFunciones.getTransaccionLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(TransaccionConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTransaccion.jLabelid_empresaTransaccion,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TransaccionConstantesFunciones.IDSUCURSAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTransaccion.jLabelid_sucursalTransaccion,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TransaccionConstantesFunciones.CODIGO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTransaccion.jLabelcodigoTransaccion,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TransaccionConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTransaccion.jLabelnombreTransaccion,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TransaccionConstantesFunciones.IDMODULO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTransaccion.jLabelid_moduloTransaccion,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TransaccionConstantesFunciones.IDTIPOTRANSA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTransaccion.jLabelid_tipo_transaTransaccion,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TransaccionConstantesFunciones.IDTIPOCOMPROBANTE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTransaccion.jLabelid_tipo_comprobanteTransaccion,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TransaccionConstantesFunciones.IDTIPOTRANSACCIONMODULO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTransaccion.jLabelid_tipo_transaccion_moduloTransaccion,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TransaccionConstantesFunciones.IDTIPORETENCION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTransaccion.jLabelid_tipo_retencionTransaccion,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TransaccionConstantesFunciones.IDCUENTACONTABLE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTransaccion.jLabelid_cuenta_contableTransaccion,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TransaccionConstantesFunciones.DESCRIPCION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTransaccion.jLabeldescripcionTransaccion,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormTransaccion!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTransaccion.jLabelid_empresaTransaccion,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTransaccion.jLabelid_sucursalTransaccion,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTransaccion.jLabelcodigoTransaccion,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTransaccion.jLabelnombreTransaccion,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTransaccion.jLabelid_moduloTransaccion,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTransaccion.jLabelid_tipo_transaTransaccion,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTransaccion.jLabelid_tipo_comprobanteTransaccion,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTransaccion.jLabelid_tipo_transaccion_moduloTransaccion,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTransaccion.jLabelid_tipo_retencionTransaccion,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTransaccion.jLabelid_cuenta_contableTransaccion,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTransaccion.jLabeldescripcionTransaccion,"");
		
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
		this.iIdNuevoTransaccion--;	
		
		
		this.transaccionAux=new Transaccion();
		
		this.transaccionAux.setId(this.iIdNuevoTransaccion);
		this.transaccionAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.transaccionLogic.getTransaccions().add(this.transaccionAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.transaccions.add(this.transaccionAux);
		}
		//ARCHITECTURE
		
		this.transaccion=this.transaccionAux;
		
		if(TransaccionJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioTransaccion(this.transaccion);
			this.setVariablesObjetoActualToFormularioForeignKeyTransaccion(this.transaccion);
		}
				
		//this.setDefaultControlesTransaccion();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyTransaccion();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyTransaccion();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyTransaccion();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTransaccion(this.transaccionBean,this.transaccion,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysTransaccion(this.transaccion);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(TransaccionConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.transaccionSessionBean.getConGuardarRelaciones()) {
			classes=TransaccionConstantesFunciones.getClassesRelationshipsOfTransaccion(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.transaccionReturnGeneral=transaccionLogic.procesarEventosTransaccionsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.transaccionLogic.getTransaccions(),this.transaccion,this.transaccionParameterGeneral,this.isEsNuevoTransaccion,classes);//this.transaccionLogic.getTransaccion()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanTransaccion(this.transaccionReturnGeneral,this.transaccionBean,false);
		
		if(this.transaccionReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyTransaccion(this.transaccionReturnGeneral.getTransaccion());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioTransaccion(this.transaccionReturnGeneral.getTransaccion());
		}
		
		if(this.transaccionReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioTransaccion(this.transaccionReturnGeneral.getTransaccion(),classes);//this.transaccionBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualTransaccion(this.transaccion,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyTransaccion();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyTransaccion();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			TransaccionBeanSwingJInternalFrameAdditional.RecargarFormTransaccion(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingTransaccion(false);
						
			if(transaccionSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(TransaccionJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTransaccion();
			}
			
			this.actualizarVisualTableDatosTransaccion();
			
			this.jTableDatosTransaccion.setRowSelectionInterval(this.getIndiceNuevoTransaccion(), this.getIndiceNuevoTransaccion());
			
			this.seleccionarFilaTablaTransaccionActual();
						
			this.actualizarEstadoCeldasBotonesTransaccion("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesTransaccion(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormTransaccion.jTextFieldcodigoTransaccion.setEnabled(isHabilitar && this.transaccionConstantesFunciones.activarcodigoTransaccion);
		this.jInternalFrameDetalleFormTransaccion.jTextAreanombreTransaccion.setEnabled(isHabilitar && this.transaccionConstantesFunciones.activarnombreTransaccion);
		this.jInternalFrameDetalleFormTransaccion.jTextAreadescripcionTransaccion.setEnabled(isHabilitar && this.transaccionConstantesFunciones.activardescripcionTransaccion);	
		//
		this.jInternalFrameDetalleFormTransaccion.jComboBoxid_empresaTransaccion.setEnabled(isHabilitar && this.transaccionConstantesFunciones.activarid_empresaTransaccion);//
		this.jInternalFrameDetalleFormTransaccion.jComboBoxid_sucursalTransaccion.setEnabled(isHabilitar && this.transaccionConstantesFunciones.activarid_sucursalTransaccion);//
		this.jInternalFrameDetalleFormTransaccion.jComboBoxid_moduloTransaccion.setEnabled(isHabilitar && this.transaccionConstantesFunciones.activarid_moduloTransaccion);
		this.jInternalFrameDetalleFormTransaccion.jComboBoxid_tipo_transaTransaccion.setEnabled(isHabilitar && this.transaccionConstantesFunciones.activarid_tipo_transaTransaccion);
		this.jInternalFrameDetalleFormTransaccion.jComboBoxid_tipo_comprobanteTransaccion.setEnabled(isHabilitar && this.transaccionConstantesFunciones.activarid_tipo_comprobanteTransaccion);//
		this.jInternalFrameDetalleFormTransaccion.jComboBoxid_tipo_transaccion_moduloTransaccion.setEnabled(isHabilitar && this.transaccionConstantesFunciones.activarid_tipo_transaccion_moduloTransaccion);
		this.jInternalFrameDetalleFormTransaccion.jComboBoxid_tipo_retencionTransaccion.setEnabled(isHabilitar && this.transaccionConstantesFunciones.activarid_tipo_retencionTransaccion);
		this.jInternalFrameDetalleFormTransaccion.jComboBoxid_cuenta_contableTransaccion.setEnabled(isHabilitar && this.transaccionConstantesFunciones.activarid_cuenta_contableTransaccion);
	};
	
	public void setDefaultControlesTransaccion() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoTransaccion(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.transaccionSessionBean.setConGuardarRelaciones(true);			
			this.transaccionSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormTransaccion.jTabbedPaneRelacionesTransaccion.setVisible(true);
			
					
		} else {
			//this.transaccionSessionBean.setConGuardarRelaciones(false);			
			this.transaccionSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormTransaccion.jTabbedPaneRelacionesTransaccion.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoTransaccion() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Transaccion transaccionAux:this.transaccionLogic.getTransaccions()) {
				if(transaccionAux.getId().equals(this.iIdNuevoTransaccion)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Transaccion transaccionAux:this.transaccions) {
				if(transaccionAux.getId().equals(this.iIdNuevoTransaccion)) {
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
	
	public int getIndiceActualTransaccion(Transaccion transaccion,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Transaccion transaccionAux:this.transaccionLogic.getTransaccions()) {
				if(transaccionAux.getId().equals(transaccion.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Transaccion transaccionAux:this.transaccions) {
				if(transaccionAux.getId().equals(transaccion.getId())) {
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
	
	public void setCamposBaseDesdeOriginalTransaccion(Transaccion transaccionOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Transaccion transaccionAux:this.transaccionLogic.getTransaccions()) {
				if(transaccionAux.getTransaccionOriginal().getId().equals(transaccionOriginal.getId())) {
					existe=true;
					transaccionOriginal.setId(transaccionAux.getId());
					transaccionOriginal.setVersionRow(transaccionAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Transaccion transaccionAux:this.transaccions) {
				if(transaccionAux.getTransaccionOriginal().getId().equals(transaccionOriginal.getId())) {
					existe=true;
					transaccionOriginal.setId(transaccionAux.getId());
					transaccionOriginal.setVersionRow(transaccionAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosTransaccion(Boolean esParaCancelar) throws Exception {
		transaccionsAux=new ArrayList<Transaccion>();
		transaccionAux=new Transaccion();
		
		if(!this.transaccionSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(Transaccion transaccionAux:this.transaccionLogic.getTransaccions()) {
					if(transaccionAux.getId()<0) {
						transaccionsAux.add(transaccionAux);
					}		
				}
				this.iIdNuevoTransaccion=0L;
				this.transaccionLogic.getTransaccions().removeAll(transaccionsAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Transaccion transaccionAux:this.transaccions) {
					if(transaccionAux.getId()<0) {
						transaccionsAux.add(transaccionAux);
					}		
				}
				this.iIdNuevoTransaccion=0L;
				this.transaccions.removeAll(transaccionsAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoTransaccion 
					&& this.transaccionLogic.getTransaccions().size()>0
					) {
					transaccionAux=this.transaccionLogic.getTransaccions().get(this.transaccionLogic.getTransaccions().size() - 1);
				
					if(transaccionAux.getId()<0) {
						this.transaccionLogic.getTransaccions().remove(transaccionAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoTransaccion && this.transaccions.size()>0) {
					transaccionAux=this.transaccions.get(this.transaccions.size() - 1);
				
					if(transaccionAux.getId()<0) {
						this.transaccions.remove(transaccionAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoTransaccion(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(transaccion.getId()<0) {
				this.transaccionLogic.getTransaccions().remove(this.transaccion);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(transaccion.getId()<0) {
				this.transaccions.remove(this.transaccion);
			}
		}			
	}
	
	public void setEstadosInicialesTransaccion(List<Transaccion> transaccionsAux) throws Exception {
		TransaccionConstantesFunciones.setEstadosInicialesTransaccion(transaccionsAux);
	}
	
	public void setEstadosInicialesTransaccion(Transaccion transaccionAux) throws Exception {
		TransaccionConstantesFunciones.setEstadosInicialesTransaccion(transaccionAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarTransaccionActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesTransaccion("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TransaccionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarTransaccionActual()) {
				if(!this.isEsNuevoTransaccion) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesTransaccion("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoTransaccion=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TransaccionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarTransaccionActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Transaccion ?", "MANTENIMIENTO DE Transaccion", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesTransaccion("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TransaccionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransaccionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(Transaccion transaccion) throws Exception {
		TransaccionConstantesFunciones.seleccionarAsignar(this.transaccion,transaccion);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarTransaccion=this.isPermisoActualizarOriginalTransaccion;
			
			
			this.seleccionarAsignar(transaccion);
			
			

			idCuentaContableActual=transaccion.getid_cuenta_contable();
			this.seleccionarCuentaContableActual();
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			TransaccionConstantesFunciones.quitarEspaciosTransaccion(this.transaccion,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesTransaccion("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransaccionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.transaccionSessionBean.setsFuncionBusquedaRapida(this.transaccionSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransaccionConstantesFunciones.CLASSNAME);
		}
	}
	
	
	//BUSQUEDA INTERNA FK
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
			if(this.isEsNuevoTransaccion) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosTransaccion(esParaCancelar);				
				this.cancelarNuevoTransaccion(esParaCancelar);								
			}
			
			this.transaccion=new Transaccion();
			
			this.inicializarTransaccion();
			
			this.actualizarEstadoCeldasBotonesTransaccion("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransaccionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarTransaccion() throws Exception {
		try {
			TransaccionConstantesFunciones.inicializarTransaccion(this.transaccion);
			
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
			FuncionesSwing.manageException(this, e,logger,TransaccionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.transaccionLogic.getTransaccions().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransaccionConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteTransaccions(String sAccionBusqueda,List<Transaccion> transaccionsParaReportes) throws Exception {
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
					sPathReporteFinal="Transaccion"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="TransaccionMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("TransaccionMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="Transaccion"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Transacciones");		
		parameters.put("busquedapor", TransaccionConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceTransaccion=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			TransaccionConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			TransaccionConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceTransaccion=new JRBeanArrayDataSource(TransaccionJInternalFrame.TraerTransaccionBeans(transaccionsParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceTransaccion);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+TransaccionConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+TransaccionConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(TransaccionBean.TraerTransaccionBeans(transaccionsParaReportes).toArray()));
							
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
				this.generarExcelReporteTransaccions(sAccionBusqueda,sTipoArchivoReporte,transaccionsParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalTransaccions(sAccionBusqueda,sTipoArchivoReporte,transaccionsParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoTransaccionActionPerformed(null);
					//this.generarExcelReporteTransaccions(sAccionBusqueda,sTipoArchivoReporte,transaccionsParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalTransaccions(sAccionBusqueda,sTipoArchivoReporte,transaccionsParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesTransaccions(sAccionBusqueda,sTipoArchivoReporte,transaccionsParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesTransaccions(sAccionBusqueda,sTipoArchivoReporte,transaccionsParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteTransaccions(String sAccionBusqueda,String sTipoArchivoReporte,List<Transaccion> transaccionsParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"transaccion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("Transaccions");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTransaccion("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(Transaccion transaccion : transaccionsParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			TransaccionConstantesFunciones.generarExcelReporteDataTransaccion("NORMAL",row,workbook,transaccion,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.transaccionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Transaccion",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderTransaccion(String sTipo,Row row,Workbook workbook) {
		
		TransaccionConstantesFunciones.generarExcelReporteHeaderTransaccion(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalTransaccions(String sAccionBusqueda,String sTipoArchivoReporte,List<Transaccion> transaccionsParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"transaccion_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("Transaccions");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(Transaccion transaccion : transaccionsParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(TransaccionConstantesFunciones.getTransaccionDescripcion(transaccion));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TransaccionConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TransaccionConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(transaccion.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TransaccionConstantesFunciones.LABEL_IDSUCURSAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TransaccionConstantesFunciones.LABEL_IDSUCURSAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(transaccion.getsucursal_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TransaccionConstantesFunciones.LABEL_CODIGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TransaccionConstantesFunciones.LABEL_CODIGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(transaccion.getcodigo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TransaccionConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TransaccionConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(transaccion.getnombre());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TransaccionConstantesFunciones.LABEL_IDMODULO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TransaccionConstantesFunciones.LABEL_IDMODULO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(transaccion.getmodulo_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TransaccionConstantesFunciones.LABEL_IDTIPOTRANSA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TransaccionConstantesFunciones.LABEL_IDTIPOTRANSA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(transaccion.gettipotransa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TransaccionConstantesFunciones.LABEL_IDTIPOCOMPROBANTE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TransaccionConstantesFunciones.LABEL_IDTIPOCOMPROBANTE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(transaccion.gettipocomprobante_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TransaccionConstantesFunciones.LABEL_IDTIPOTRANSACCIONMODULO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TransaccionConstantesFunciones.LABEL_IDTIPOTRANSACCIONMODULO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(transaccion.gettipotransaccionmodulo_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TransaccionConstantesFunciones.LABEL_IDTIPORETENCION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TransaccionConstantesFunciones.LABEL_IDTIPORETENCION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(transaccion.gettiporetencion_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TransaccionConstantesFunciones.LABEL_IDCUENTACONTABLE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TransaccionConstantesFunciones.LABEL_IDCUENTACONTABLE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(transaccion.getcuentacontable_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TransaccionConstantesFunciones.LABEL_DESCRIPCION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TransaccionConstantesFunciones.LABEL_DESCRIPCION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(transaccion.getdescripcion());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.transaccionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Transaccion",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesTransaccions(String sAccionBusqueda,String sTipoArchivoReporte,List<Transaccion> transaccionsParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<Transaccion> transaccionsRespaldo=null;
		
		classes=TransaccionConstantesFunciones.getClassesRelationshipsOfTransaccion(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.transaccionLogic.setDatosCliente(this.datosCliente);
		this.transaccionLogic.setDatosDeep(this.datosDeep);
		this.transaccionLogic.setIsConDeep(true);
		
		transaccionsRespaldo=this.transaccionLogic.getTransaccions();
		
		this.transaccionLogic.setTransaccions(transaccionsParaReportes);	
		this.transaccionLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		transaccionsParaReportes=this.transaccionLogic.getTransaccions();
		this.transaccionLogic.setTransaccions(transaccionsRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"transaccion_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("Transaccions");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTransaccion("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(Transaccion transaccion : transaccionsParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderTransaccion("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			TransaccionConstantesFunciones.generarExcelReporteDataTransaccion("NORMAL",row,workbook,transaccion,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(TransaccionConstantesFunciones.getTransaccionDescripcion(transaccion));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.transaccionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Transaccion",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoTransaccion.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTransaccion.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoTransaccion.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTransaccion.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessTransaccion() throws Exception {		
		this.startProcessTransaccion(true);
	}
	
	public void startProcessTransaccion(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasTransaccion ,this.jPanelParametrosReportesTransaccion, this.jScrollPanelDatosTransaccion,this.jPanelPaginacionTransaccion, this.jScrollPanelDatosEdicionTransaccion, this.jPanelAccionesTransaccion,this.jPanelAccionesFormularioTransaccion,this.jmenuBarTransaccion,this.jmenuBarDetalleTransaccion,this.jTtoolBarTransaccion,this.jTtoolBarDetalleTransaccion);		
		
		final JTabbedPane jTabbedPaneBusquedasTransaccion=this.jTabbedPaneBusquedasTransaccion; 
		
		final JPanel jPanelParametrosReportesTransaccion=this.jPanelParametrosReportesTransaccion;
		//final JScrollPane jScrollPanelDatosTransaccion=this.jScrollPanelDatosTransaccion;
		final JTable jTableDatosTransaccion=this.jTableDatosTransaccion;		
		final JPanel jPanelPaginacionTransaccion=this.jPanelPaginacionTransaccion;
		//final JScrollPane jScrollPanelDatosEdicionTransaccion=this.jScrollPanelDatosEdicionTransaccion;
		final JPanel jPanelAccionesTransaccion=this.jPanelAccionesTransaccion;
		
		JPanel jPanelCamposAuxiliarTransaccion=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarTransaccion=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormTransaccion!=null) {
			jPanelCamposAuxiliarTransaccion=this.jInternalFrameDetalleFormTransaccion.jPanelCamposTransaccion;
			jPanelAccionesFormularioAuxiliarTransaccion=this.jInternalFrameDetalleFormTransaccion.jPanelAccionesFormularioTransaccion;
		}
		
		final JPanel jPanelCamposTransaccion=jPanelCamposAuxiliarTransaccion;
		final JPanel jPanelAccionesFormularioTransaccion=jPanelAccionesFormularioAuxiliarTransaccion;
		
		
		final JMenuBar jmenuBarTransaccion=this.jmenuBarTransaccion;
		final JToolBar jTtoolBarTransaccion=this.jTtoolBarTransaccion;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarTransaccion=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTransaccion=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormTransaccion!=null) {
			jmenuBarDetalleAuxiliarTransaccion=this.jInternalFrameDetalleFormTransaccion.jmenuBarDetalleTransaccion;
			jTtoolBarDetalleAuxiliarTransaccion=this.jInternalFrameDetalleFormTransaccion.jTtoolBarDetalleTransaccion;
		}
		
		final JMenuBar jmenuBarDetalleTransaccion=jmenuBarDetalleAuxiliarTransaccion;
		final JToolBar jTtoolBarDetalleTransaccion=jTtoolBarDetalleAuxiliarTransaccion;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTransaccion;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTransaccion;
			processRunnable.jTableDatos=jTableDatosTransaccion;
			processRunnable.jPanelCampos=jPanelCamposTransaccion;
			processRunnable.jPanelPaginacion=jPanelPaginacionTransaccion;
			processRunnable.jPanelAcciones=jPanelAccionesTransaccion;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTransaccion;
			
			
			processRunnable.jmenuBar=jmenuBarTransaccion;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTransaccion;
			processRunnable.jTtoolBar=jTtoolBarTransaccion;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTransaccion;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasTransaccion ,jPanelParametrosReportesTransaccion,jTableDatosTransaccion, /*jScrollPanelDatosTransaccion,*/jPanelCamposTransaccion,jPanelPaginacionTransaccion, /*jScrollPanelDatosEdicionTransaccion,*/ jPanelAccionesTransaccion,jPanelAccionesFormularioTransaccion,jmenuBarTransaccion,jmenuBarDetalleTransaccion,jTtoolBarTransaccion,jTtoolBarDetalleTransaccion);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasTransaccion ,jPanelParametrosReportesTransaccion, jScrollPanelDatosTransaccion,jPanelPaginacionTransaccion, jScrollPanelDatosEdicionTransaccion, jPanelAccionesTransaccion,jPanelAccionesFormularioTransaccion,jmenuBarTransaccion,jmenuBarDetalleTransaccion,jTtoolBarTransaccion,jTtoolBarDetalleTransaccion);
						
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
	
	public void finishProcessTransaccion() {// throws Exception 
		this.finishProcessTransaccion(true);
	}
	
	public void finishProcessTransaccion(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasTransaccion ,this.jPanelParametrosReportesTransaccion, this.jScrollPanelDatosTransaccion,this.jPanelPaginacionTransaccion, this.jScrollPanelDatosEdicionTransaccion, this.jPanelAccionesTransaccion,this.jPanelAccionesFormularioTransaccion,this.jmenuBarTransaccion,this.jmenuBarDetalleTransaccion,this.jTtoolBarTransaccion,this.jTtoolBarDetalleTransaccion);		
		
		final JTabbedPane jTabbedPaneBusquedasTransaccion=this.jTabbedPaneBusquedasTransaccion; 
		
		final JPanel jPanelParametrosReportesTransaccion=this.jPanelParametrosReportesTransaccion;
		//final JScrollPane jScrollPanelDatosTransaccion=this.jScrollPanelDatosTransaccion;
		final JTable jTableDatosTransaccion=this.jTableDatosTransaccion;		
		final JPanel jPanelPaginacionTransaccion=this.jPanelPaginacionTransaccion;
		//final JScrollPane jScrollPanelDatosEdicionTransaccion=this.jScrollPanelDatosEdicionTransaccion;
		final JPanel jPanelAccionesTransaccion=this.jPanelAccionesTransaccion;
		
		JPanel jPanelCamposAuxiliarTransaccion=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarTransaccion=new JPanel();
		
		if(this.jInternalFrameDetalleFormTransaccion!=null) {
			jPanelCamposAuxiliarTransaccion=this.jInternalFrameDetalleFormTransaccion.jPanelCamposTransaccion;
			jPanelAccionesFormularioAuxiliarTransaccion=this.jInternalFrameDetalleFormTransaccion.jPanelAccionesFormularioTransaccion;
		}
		
		final JPanel jPanelCamposTransaccion=jPanelCamposAuxiliarTransaccion;
		final JPanel jPanelAccionesFormularioTransaccion=jPanelAccionesFormularioAuxiliarTransaccion;
		
		
		final JMenuBar jmenuBarTransaccion=this.jmenuBarTransaccion;		
		final JToolBar jTtoolBarTransaccion=this.jTtoolBarTransaccion;
				
		JMenuBar jmenuBarDetalleAuxiliarTransaccion=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTransaccion=new JToolBar();
		
		if(this.jInternalFrameDetalleFormTransaccion!=null) {
			jmenuBarDetalleAuxiliarTransaccion=this.jInternalFrameDetalleFormTransaccion.jmenuBarDetalleTransaccion;
			jTtoolBarDetalleAuxiliarTransaccion=this.jInternalFrameDetalleFormTransaccion.jTtoolBarDetalleTransaccion;		
		}
		
		final JMenuBar jmenuBarDetalleTransaccion=jmenuBarDetalleAuxiliarTransaccion;
		final JToolBar jTtoolBarDetalleTransaccion=jTtoolBarDetalleAuxiliarTransaccion;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTransaccion;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTransaccion;
			processRunnable.jTableDatos=jTableDatosTransaccion;
			processRunnable.jPanelCampos=jPanelCamposTransaccion;
			processRunnable.jPanelPaginacion=jPanelPaginacionTransaccion;
			processRunnable.jPanelAcciones=jPanelAccionesTransaccion;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTransaccion;
			
			
			processRunnable.jmenuBar=jmenuBarTransaccion;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTransaccion;
			processRunnable.jTtoolBar=jTtoolBarTransaccion;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTransaccion;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasTransaccion ,jPanelParametrosReportesTransaccion, jTableDatosTransaccion,/*jScrollPanelDatosTransaccion,*/jPanelCamposTransaccion,jPanelPaginacionTransaccion, /*jScrollPanelDatosEdicionTransaccion,*/ jPanelAccionesTransaccion,jPanelAccionesFormularioTransaccion,jmenuBarTransaccion,jmenuBarDetalleTransaccion,jTtoolBarTransaccion,jTtoolBarDetalleTransaccion));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesTransaccion(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarTransaccion(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuTransaccion(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarTransaccion(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarTransaccion,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleTransaccion,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuTransaccion(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarTransaccion,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleTransaccion,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.transaccionConstantesFunciones.getsFinalQueryTransaccion();
		String  finalQueryPaginacionTodos=this.transaccionConstantesFunciones.getsFinalQueryTransaccion();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=TransaccionConstantesFunciones.getArrayColumnasGlobalesNoTransaccion(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=TransaccionConstantesFunciones.getArrayColumnasGlobalesTransaccion(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,TransaccionConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.transaccionsEliminados= new ArrayList<Transaccion>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessTransaccion();
		
				///*TransaccionSessionBean*/this.transaccionSessionBean=new TransaccionSessionBean();
			
			if(this.transaccionSessionBean==null) {
				this.transaccionSessionBean=new TransaccionSessionBean();
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
					this.iNumeroPaginacion=TransaccionConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=TransaccionConstantesFunciones.getClassesForeignKeysOfTransaccion(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/transaccion."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			transaccionsAux= new ArrayList<Transaccion>();
			
				
			transaccionLogic.setDatosCliente(this.datosCliente);
			transaccionLogic.setDatosDeep(this.datosDeep);
			transaccionLogic.setIsConDeep(true);
			
			
			transaccionLogic.getTransaccionDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					transaccionLogic.getTodosTransaccions(finalQueryGlobal,pagination);
					
					//transaccionLogic.getTodosTransaccionsWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(transaccionLogic.getTransaccions()==null|| transaccionLogic.getTransaccions().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							transaccionsAux= new ArrayList<Transaccion>();
							transaccionsAux.addAll(transaccionLogic.getTransaccions());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							transaccionsAux= new ArrayList<Transaccion>();
							transaccionsAux.addAll(transaccions);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							transaccionLogic.getTodosTransaccions(finalQueryGlobal+"",this.pagination);												
							
							//transaccionLogic.getTodosTransaccionsWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteTransaccions("Todos",transaccionLogic.getTransaccions() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							transaccionLogic.setTransaccions(new ArrayList<Transaccion>());					
							transaccionLogic.getTransaccions().addAll(transaccionsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							transaccions=new ArrayList<Transaccion>();
							transaccions.addAll(transaccionsAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idTransaccion=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idTransaccion=this.idActual;
				
				} else if(this.idTransaccionActual!=null && this.idTransaccionActual!=0L) {
					idTransaccion=idTransaccionActual;
				}
				
					
				this.sDetalleReporte=TransaccionConstantesFunciones.getDetalleIndicePorId(idTransaccion);
				
				this.transaccions=new ArrayList<Transaccion>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					transaccionLogic.getEntity(idTransaccion);
					
					//transaccionLogic.getEntityWithConnection(idTransaccion);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					transaccionLogic.setTransaccions(new ArrayList<Transaccion>());
					transaccionLogic.getTransaccions().add(transaccionLogic.getTransaccion());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.transaccions=new ArrayList<Transaccion>();
					this.transaccions.add(transaccion);
				}
				
				if(transaccionLogic.getTransaccion()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("BusquedaPorCodigo")) {
				this.sDetalleReporte=TransaccionConstantesFunciones.getDetalleIndiceBusquedaPorCodigo(codigoBusquedaPorCodigo);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					transaccionLogic.getTransaccionsBusquedaPorCodigo(finalQueryGlobal,pagination,codigoBusquedaPorCodigo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TransaccionConstantesFunciones.getDetalleIndiceBusquedaPorCodigo(codigoBusquedaPorCodigo);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TransaccionConstantesFunciones.getDetalleIndiceBusquedaPorCodigo(codigoBusquedaPorCodigo);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=transaccionLogic.getTransaccions()==null||transaccionLogic.getTransaccions().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=transaccions==null|| transaccions.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						transaccionsAux=new ArrayList<Transaccion>();
						transaccionsAux.addAll(transaccionLogic.getTransaccions());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							transaccionsAux=new ArrayList<Transaccion>();
							transaccionsAux.addAll(transaccions);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							transaccionLogic.getTransaccionsBusquedaPorCodigo(finalQueryGlobal,pagination,codigoBusquedaPorCodigo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TransaccionConstantesFunciones.getDetalleIndiceBusquedaPorCodigo(codigoBusquedaPorCodigo);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TransaccionConstantesFunciones.getDetalleIndiceBusquedaPorCodigo(codigoBusquedaPorCodigo);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteTransaccions("BusquedaPorCodigo",transaccionLogic.getTransaccions());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteTransaccions("BusquedaPorCodigo",transaccions);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						transaccionLogic.setTransaccions(new ArrayList<Transaccion>());
						transaccionLogic.getTransaccions().addAll(transaccionsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							transaccions=new ArrayList<Transaccion>();
							transaccions.addAll(transaccionsAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("BusquedaPorIdModuloPorTipoTransaccion")) {
				this.sDetalleReporte=TransaccionConstantesFunciones.getDetalleIndiceBusquedaPorIdModuloPorTipoTransaccion(id_moduloBusquedaPorIdModuloPorTipoTransaccion,id_tipo_transaccion_moduloBusquedaPorIdModuloPorTipoTransaccion);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					transaccionLogic.getTransaccionsBusquedaPorIdModuloPorTipoTransaccion(finalQueryGlobal,pagination,id_moduloBusquedaPorIdModuloPorTipoTransaccion,id_tipo_transaccion_moduloBusquedaPorIdModuloPorTipoTransaccion);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TransaccionConstantesFunciones.getDetalleIndiceBusquedaPorIdModuloPorTipoTransaccion(id_moduloBusquedaPorIdModuloPorTipoTransaccion,id_tipo_transaccion_moduloBusquedaPorIdModuloPorTipoTransaccion);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TransaccionConstantesFunciones.getDetalleIndiceBusquedaPorIdModuloPorTipoTransaccion(id_moduloBusquedaPorIdModuloPorTipoTransaccion,id_tipo_transaccion_moduloBusquedaPorIdModuloPorTipoTransaccion);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=transaccionLogic.getTransaccions()==null||transaccionLogic.getTransaccions().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=transaccions==null|| transaccions.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						transaccionsAux=new ArrayList<Transaccion>();
						transaccionsAux.addAll(transaccionLogic.getTransaccions());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							transaccionsAux=new ArrayList<Transaccion>();
							transaccionsAux.addAll(transaccions);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							transaccionLogic.getTransaccionsBusquedaPorIdModuloPorTipoTransaccion(finalQueryGlobal,pagination,id_moduloBusquedaPorIdModuloPorTipoTransaccion,id_tipo_transaccion_moduloBusquedaPorIdModuloPorTipoTransaccion);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TransaccionConstantesFunciones.getDetalleIndiceBusquedaPorIdModuloPorTipoTransaccion(id_moduloBusquedaPorIdModuloPorTipoTransaccion,id_tipo_transaccion_moduloBusquedaPorIdModuloPorTipoTransaccion);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TransaccionConstantesFunciones.getDetalleIndiceBusquedaPorIdModuloPorTipoTransaccion(id_moduloBusquedaPorIdModuloPorTipoTransaccion,id_tipo_transaccion_moduloBusquedaPorIdModuloPorTipoTransaccion);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteTransaccions("BusquedaPorIdModuloPorTipoTransaccion",transaccionLogic.getTransaccions());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteTransaccions("BusquedaPorIdModuloPorTipoTransaccion",transaccions);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						transaccionLogic.setTransaccions(new ArrayList<Transaccion>());
						transaccionLogic.getTransaccions().addAll(transaccionsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							transaccions=new ArrayList<Transaccion>();
							transaccions.addAll(transaccionsAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("BusquedaPorNombre")) {
				this.sDetalleReporte=TransaccionConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					transaccionLogic.getTransaccionsBusquedaPorNombre(finalQueryGlobal,pagination,nombreBusquedaPorNombre);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TransaccionConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TransaccionConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=transaccionLogic.getTransaccions()==null||transaccionLogic.getTransaccions().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=transaccions==null|| transaccions.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						transaccionsAux=new ArrayList<Transaccion>();
						transaccionsAux.addAll(transaccionLogic.getTransaccions());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							transaccionsAux=new ArrayList<Transaccion>();
							transaccionsAux.addAll(transaccions);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							transaccionLogic.getTransaccionsBusquedaPorNombre(finalQueryGlobal,pagination,nombreBusquedaPorNombre);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TransaccionConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TransaccionConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteTransaccions("BusquedaPorNombre",transaccionLogic.getTransaccions());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteTransaccions("BusquedaPorNombre",transaccions);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						transaccionLogic.setTransaccions(new ArrayList<Transaccion>());
						transaccionLogic.getTransaccions().addAll(transaccionsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							transaccions=new ArrayList<Transaccion>();
							transaccions.addAll(transaccionsAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdCuentaContable")) {
				this.sDetalleReporte=TransaccionConstantesFunciones.getDetalleIndiceFK_IdCuentaContable(id_cuenta_contableFK_IdCuentaContable);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					transaccionLogic.getTransaccionsFK_IdCuentaContable(finalQueryGlobal,pagination,id_cuenta_contableFK_IdCuentaContable);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TransaccionConstantesFunciones.getDetalleIndiceFK_IdCuentaContable(id_cuenta_contableFK_IdCuentaContable);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TransaccionConstantesFunciones.getDetalleIndiceFK_IdCuentaContable(id_cuenta_contableFK_IdCuentaContable);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=transaccionLogic.getTransaccions()==null||transaccionLogic.getTransaccions().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=transaccions==null|| transaccions.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						transaccionsAux=new ArrayList<Transaccion>();
						transaccionsAux.addAll(transaccionLogic.getTransaccions());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							transaccionsAux=new ArrayList<Transaccion>();
							transaccionsAux.addAll(transaccions);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							transaccionLogic.getTransaccionsFK_IdCuentaContable(finalQueryGlobal,pagination,id_cuenta_contableFK_IdCuentaContable);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TransaccionConstantesFunciones.getDetalleIndiceFK_IdCuentaContable(id_cuenta_contableFK_IdCuentaContable);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TransaccionConstantesFunciones.getDetalleIndiceFK_IdCuentaContable(id_cuenta_contableFK_IdCuentaContable);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteTransaccions("FK_IdCuentaContable",transaccionLogic.getTransaccions());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteTransaccions("FK_IdCuentaContable",transaccions);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						transaccionLogic.setTransaccions(new ArrayList<Transaccion>());
						transaccionLogic.getTransaccions().addAll(transaccionsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							transaccions=new ArrayList<Transaccion>();
							transaccions.addAll(transaccionsAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=TransaccionConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					transaccionLogic.getTransaccionsFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TransaccionConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TransaccionConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=transaccionLogic.getTransaccions()==null||transaccionLogic.getTransaccions().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=transaccions==null|| transaccions.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						transaccionsAux=new ArrayList<Transaccion>();
						transaccionsAux.addAll(transaccionLogic.getTransaccions());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							transaccionsAux=new ArrayList<Transaccion>();
							transaccionsAux.addAll(transaccions);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							transaccionLogic.getTransaccionsFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TransaccionConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TransaccionConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteTransaccions("FK_IdEmpresa",transaccionLogic.getTransaccions());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteTransaccions("FK_IdEmpresa",transaccions);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						transaccionLogic.setTransaccions(new ArrayList<Transaccion>());
						transaccionLogic.getTransaccions().addAll(transaccionsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							transaccions=new ArrayList<Transaccion>();
							transaccions.addAll(transaccionsAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdModulo")) {
				this.sDetalleReporte=TransaccionConstantesFunciones.getDetalleIndiceFK_IdModulo(id_moduloFK_IdModulo);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					transaccionLogic.getTransaccionsFK_IdModulo(finalQueryGlobal,pagination,id_moduloFK_IdModulo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TransaccionConstantesFunciones.getDetalleIndiceFK_IdModulo(id_moduloFK_IdModulo);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TransaccionConstantesFunciones.getDetalleIndiceFK_IdModulo(id_moduloFK_IdModulo);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=transaccionLogic.getTransaccions()==null||transaccionLogic.getTransaccions().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=transaccions==null|| transaccions.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						transaccionsAux=new ArrayList<Transaccion>();
						transaccionsAux.addAll(transaccionLogic.getTransaccions());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							transaccionsAux=new ArrayList<Transaccion>();
							transaccionsAux.addAll(transaccions);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							transaccionLogic.getTransaccionsFK_IdModulo(finalQueryGlobal,pagination,id_moduloFK_IdModulo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TransaccionConstantesFunciones.getDetalleIndiceFK_IdModulo(id_moduloFK_IdModulo);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TransaccionConstantesFunciones.getDetalleIndiceFK_IdModulo(id_moduloFK_IdModulo);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteTransaccions("FK_IdModulo",transaccionLogic.getTransaccions());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteTransaccions("FK_IdModulo",transaccions);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						transaccionLogic.setTransaccions(new ArrayList<Transaccion>());
						transaccionLogic.getTransaccions().addAll(transaccionsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							transaccions=new ArrayList<Transaccion>();
							transaccions.addAll(transaccionsAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdSucursal")) {
				this.sDetalleReporte=TransaccionConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					transaccionLogic.getTransaccionsFK_IdSucursal(finalQueryGlobal,pagination,id_sucursalFK_IdSucursal);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TransaccionConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TransaccionConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=transaccionLogic.getTransaccions()==null||transaccionLogic.getTransaccions().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=transaccions==null|| transaccions.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						transaccionsAux=new ArrayList<Transaccion>();
						transaccionsAux.addAll(transaccionLogic.getTransaccions());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							transaccionsAux=new ArrayList<Transaccion>();
							transaccionsAux.addAll(transaccions);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							transaccionLogic.getTransaccionsFK_IdSucursal(finalQueryGlobal,pagination,id_sucursalFK_IdSucursal);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TransaccionConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TransaccionConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteTransaccions("FK_IdSucursal",transaccionLogic.getTransaccions());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteTransaccions("FK_IdSucursal",transaccions);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						transaccionLogic.setTransaccions(new ArrayList<Transaccion>());
						transaccionLogic.getTransaccions().addAll(transaccionsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							transaccions=new ArrayList<Transaccion>();
							transaccions.addAll(transaccionsAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdTipoComprobante")) {
				this.sDetalleReporte=TransaccionConstantesFunciones.getDetalleIndiceFK_IdTipoComprobante(id_tipo_comprobanteFK_IdTipoComprobante);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					transaccionLogic.getTransaccionsFK_IdTipoComprobante(finalQueryGlobal,pagination,id_tipo_comprobanteFK_IdTipoComprobante);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TransaccionConstantesFunciones.getDetalleIndiceFK_IdTipoComprobante(id_tipo_comprobanteFK_IdTipoComprobante);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TransaccionConstantesFunciones.getDetalleIndiceFK_IdTipoComprobante(id_tipo_comprobanteFK_IdTipoComprobante);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=transaccionLogic.getTransaccions()==null||transaccionLogic.getTransaccions().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=transaccions==null|| transaccions.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						transaccionsAux=new ArrayList<Transaccion>();
						transaccionsAux.addAll(transaccionLogic.getTransaccions());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							transaccionsAux=new ArrayList<Transaccion>();
							transaccionsAux.addAll(transaccions);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							transaccionLogic.getTransaccionsFK_IdTipoComprobante(finalQueryGlobal,pagination,id_tipo_comprobanteFK_IdTipoComprobante);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TransaccionConstantesFunciones.getDetalleIndiceFK_IdTipoComprobante(id_tipo_comprobanteFK_IdTipoComprobante);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TransaccionConstantesFunciones.getDetalleIndiceFK_IdTipoComprobante(id_tipo_comprobanteFK_IdTipoComprobante);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteTransaccions("FK_IdTipoComprobante",transaccionLogic.getTransaccions());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteTransaccions("FK_IdTipoComprobante",transaccions);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						transaccionLogic.setTransaccions(new ArrayList<Transaccion>());
						transaccionLogic.getTransaccions().addAll(transaccionsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							transaccions=new ArrayList<Transaccion>();
							transaccions.addAll(transaccionsAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdTipoRetencion")) {
				this.sDetalleReporte=TransaccionConstantesFunciones.getDetalleIndiceFK_IdTipoRetencion(id_tipo_retencionFK_IdTipoRetencion);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					transaccionLogic.getTransaccionsFK_IdTipoRetencion(finalQueryGlobal,pagination,id_tipo_retencionFK_IdTipoRetencion);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TransaccionConstantesFunciones.getDetalleIndiceFK_IdTipoRetencion(id_tipo_retencionFK_IdTipoRetencion);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TransaccionConstantesFunciones.getDetalleIndiceFK_IdTipoRetencion(id_tipo_retencionFK_IdTipoRetencion);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=transaccionLogic.getTransaccions()==null||transaccionLogic.getTransaccions().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=transaccions==null|| transaccions.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						transaccionsAux=new ArrayList<Transaccion>();
						transaccionsAux.addAll(transaccionLogic.getTransaccions());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							transaccionsAux=new ArrayList<Transaccion>();
							transaccionsAux.addAll(transaccions);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							transaccionLogic.getTransaccionsFK_IdTipoRetencion(finalQueryGlobal,pagination,id_tipo_retencionFK_IdTipoRetencion);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TransaccionConstantesFunciones.getDetalleIndiceFK_IdTipoRetencion(id_tipo_retencionFK_IdTipoRetencion);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TransaccionConstantesFunciones.getDetalleIndiceFK_IdTipoRetencion(id_tipo_retencionFK_IdTipoRetencion);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteTransaccions("FK_IdTipoRetencion",transaccionLogic.getTransaccions());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteTransaccions("FK_IdTipoRetencion",transaccions);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						transaccionLogic.setTransaccions(new ArrayList<Transaccion>());
						transaccionLogic.getTransaccions().addAll(transaccionsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							transaccions=new ArrayList<Transaccion>();
							transaccions.addAll(transaccionsAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdTipoTransa")) {
				this.sDetalleReporte=TransaccionConstantesFunciones.getDetalleIndiceFK_IdTipoTransa(id_tipo_transaFK_IdTipoTransa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					transaccionLogic.getTransaccionsFK_IdTipoTransa(finalQueryGlobal,pagination,id_tipo_transaFK_IdTipoTransa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TransaccionConstantesFunciones.getDetalleIndiceFK_IdTipoTransa(id_tipo_transaFK_IdTipoTransa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TransaccionConstantesFunciones.getDetalleIndiceFK_IdTipoTransa(id_tipo_transaFK_IdTipoTransa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=transaccionLogic.getTransaccions()==null||transaccionLogic.getTransaccions().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=transaccions==null|| transaccions.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						transaccionsAux=new ArrayList<Transaccion>();
						transaccionsAux.addAll(transaccionLogic.getTransaccions());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							transaccionsAux=new ArrayList<Transaccion>();
							transaccionsAux.addAll(transaccions);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							transaccionLogic.getTransaccionsFK_IdTipoTransa(finalQueryGlobal,pagination,id_tipo_transaFK_IdTipoTransa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TransaccionConstantesFunciones.getDetalleIndiceFK_IdTipoTransa(id_tipo_transaFK_IdTipoTransa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TransaccionConstantesFunciones.getDetalleIndiceFK_IdTipoTransa(id_tipo_transaFK_IdTipoTransa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteTransaccions("FK_IdTipoTransa",transaccionLogic.getTransaccions());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteTransaccions("FK_IdTipoTransa",transaccions);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						transaccionLogic.setTransaccions(new ArrayList<Transaccion>());
						transaccionLogic.getTransaccions().addAll(transaccionsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							transaccions=new ArrayList<Transaccion>();
							transaccions.addAll(transaccionsAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesTransaccion();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessTransaccion();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=transaccionLogic.getTransaccions().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=transaccions.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=transaccionLogic.getTransaccions().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=transaccions.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(Transaccion transaccion) {
		Boolean permite=true;
		
		if(this.transaccion.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=TransaccionConstantesFunciones.getOrderByListaTransaccion();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=TransaccionConstantesFunciones.getOrderByListaTransaccion();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Transaccion transaccion:transaccionLogic.getTransaccions()) {
				if(transaccion.getsType().equals(Constantes2.S_TOTALES)) {
					transaccionTotales=transaccion;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Transaccion transaccion:this.transaccions) {
				if(transaccion.getsType().equals(Constantes2.S_TOTALES)) {
					transaccionTotales=transaccion;
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
			this.transaccionAux=new Transaccion();
			this.transaccionAux.setsType(Constantes2.S_TOTALES);
			this.transaccionAux.setIsNew(false);
			this.transaccionAux.setIsChanged(false);
			this.transaccionAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				TransaccionConstantesFunciones.TotalizarValoresFilaTransaccion(this.transaccionLogic.getTransaccions(),this.transaccionAux);
				
				this.transaccionLogic.getTransaccions().add(this.transaccionAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				TransaccionConstantesFunciones.TotalizarValoresFilaTransaccion(this.transaccions,this.transaccionAux);
				
				this.transaccions.add(this.transaccionAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		transaccionTotales=new Transaccion();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.transaccionLogic.getTransaccions().remove(transaccionTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.transaccions.remove(transaccionTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		transaccionTotales=new Transaccion();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Transaccion transaccion:transaccionLogic.getTransaccions()) {
				if(transaccion.getsType().equals(Constantes2.S_TOTALES)) {
					transaccionTotales=transaccion;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TransaccionConstantesFunciones.TotalizarValoresFilaTransaccion(this.transaccionLogic.getTransaccions(),transaccionTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Transaccion transaccion:this.transaccions) {
				if(transaccion.getsType().equals(Constantes2.S_TOTALES)) {
					transaccionTotales=transaccion;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TransaccionConstantesFunciones.TotalizarValoresFilaTransaccion(this.transaccions,transaccionTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransaccionConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getTransaccionsBusquedaPorCodigo()throws Exception {
		try {
			sAccionBusqueda="BusquedaPorCodigo";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getTransaccionsBusquedaPorIdModuloPorTipoTransaccion()throws Exception {
		try {
			sAccionBusqueda="BusquedaPorIdModuloPorTipoTransaccion";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getTransaccionsBusquedaPorNombre()throws Exception {
		try {
			sAccionBusqueda="BusquedaPorNombre";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getTransaccionsFK_IdCuentaContable()throws Exception {
		try {
			sAccionBusqueda="FK_IdCuentaContable";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getTransaccionsFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getTransaccionsFK_IdModulo()throws Exception {
		try {
			sAccionBusqueda="FK_IdModulo";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getTransaccionsFK_IdSucursal()throws Exception {
		try {
			sAccionBusqueda="FK_IdSucursal";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getTransaccionsFK_IdTipoComprobante()throws Exception {
		try {
			sAccionBusqueda="FK_IdTipoComprobante";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getTransaccionsFK_IdTipoRetencion()throws Exception {
		try {
			sAccionBusqueda="FK_IdTipoRetencion";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getTransaccionsFK_IdTipoTransa()throws Exception {
		try {
			sAccionBusqueda="FK_IdTipoTransa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getTransaccionsFK_IdTipoTransaccionModulo()throws Exception {
		try {
			sAccionBusqueda="FK_IdTipoTransaccionModulo";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getTransaccionPorIdPorEmprePorSucuPorModuPorTipoTransa()throws Exception {
		try {
			sAccionBusqueda="PorIdPorEmprePorSucuPorModuPorTipoTransa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			throw e;
		}
	}

	
	
	public void getTransaccionsBusquedaPorCodigo(String sFinalQuery,String codigo)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					transaccionLogic.getTransaccionsBusquedaPorCodigo(sFinalQuery,this.pagination,codigo);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getTransaccionsBusquedaPorIdModuloPorTipoTransaccion(String sFinalQuery,Long id_modulo,Long id_tipo_transaccion_modulo)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					transaccionLogic.getTransaccionsBusquedaPorIdModuloPorTipoTransaccion(sFinalQuery,this.pagination,id_modulo,id_tipo_transaccion_modulo);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getTransaccionsBusquedaPorNombre(String sFinalQuery,String nombre)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					transaccionLogic.getTransaccionsBusquedaPorNombre(sFinalQuery,this.pagination,nombre);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getTransaccionsFK_IdCuentaContable(String sFinalQuery,Long id_cuenta_contable)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					transaccionLogic.getTransaccionsFK_IdCuentaContable(sFinalQuery,this.pagination,id_cuenta_contable);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getTransaccionsFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					transaccionLogic.getTransaccionsFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getTransaccionsFK_IdModulo(String sFinalQuery,Long id_modulo)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					transaccionLogic.getTransaccionsFK_IdModulo(sFinalQuery,this.pagination,id_modulo);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getTransaccionsFK_IdSucursal(String sFinalQuery,Long id_sucursal)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					transaccionLogic.getTransaccionsFK_IdSucursal(sFinalQuery,this.pagination,id_sucursal);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getTransaccionsFK_IdTipoComprobante(String sFinalQuery,Long id_tipo_comprobante)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					transaccionLogic.getTransaccionsFK_IdTipoComprobante(sFinalQuery,this.pagination,id_tipo_comprobante);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getTransaccionsFK_IdTipoRetencion(String sFinalQuery,Long id_tipo_retencion)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					transaccionLogic.getTransaccionsFK_IdTipoRetencion(sFinalQuery,this.pagination,id_tipo_retencion);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getTransaccionsFK_IdTipoTransa(String sFinalQuery,Long id_tipo_transa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					transaccionLogic.getTransaccionsFK_IdTipoTransa(sFinalQuery,this.pagination,id_tipo_transa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getTransaccionsFK_IdTipoTransaccionModulo(String sFinalQuery,Long id_tipo_transaccion_modulo)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					transaccionLogic.getTransaccionsFK_IdTipoTransaccionModulo(sFinalQuery,this.pagination,id_tipo_transaccion_modulo);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getTransaccionPorIdPorEmprePorSucuPorModuPorTipoTransa(Long id,Long id_empresa,Long id_sucursal,Long id_modulo,Long id_tipo_transaccion_modulo)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					transaccionLogic.getTransaccionPorIdPorEmprePorSucuPorModuPorTipoTransa(id,id_empresa,id_sucursal,id_modulo,id_tipo_transaccion_modulo);
				
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
	
	public void inicializarPermisosTransaccion() {
		this.isPermisoTodoTransaccion=false;
		this.isPermisoNuevoTransaccion=false;
		this.isPermisoActualizarTransaccion=false;
		this.isPermisoActualizarOriginalTransaccion=false;
		this.isPermisoEliminarTransaccion=false;
		this.isPermisoGuardarCambiosTransaccion=false;
		this.isPermisoConsultaTransaccion=false;
		this.isPermisoBusquedaTransaccion=false;
		this.isPermisoReporteTransaccion=false;		
		this.isPermisoOrdenTransaccion=false;		
		this.isPermisoPaginacionMedioTransaccion=false;		
		this.isPermisoPaginacionAltoTransaccion=false;
		this.isPermisoPaginacionTodoTransaccion=false;
		this.isPermisoCopiarTransaccion=false;		
		this.isPermisoVerFormTransaccion=false;		
		this.isPermisoDuplicarTransaccion=false;		
		this.isPermisoOrdenTransaccion=false;		
	}
	
	public void setPermisosUsuarioTransaccion(Boolean isPermiso) {
		this.isPermisoTodoTransaccion=isPermiso;
		this.isPermisoNuevoTransaccion=isPermiso;
		this.isPermisoActualizarTransaccion=isPermiso;
		this.isPermisoActualizarOriginalTransaccion=isPermiso;
		this.isPermisoEliminarTransaccion=isPermiso;
		this.isPermisoGuardarCambiosTransaccion=isPermiso;
		this.isPermisoConsultaTransaccion=isPermiso;
		this.isPermisoBusquedaTransaccion=isPermiso;
		this.isPermisoReporteTransaccion=isPermiso;
		this.isPermisoOrdenTransaccion=isPermiso;		
		this.isPermisoPaginacionMedioTransaccion=isPermiso;		
		this.isPermisoPaginacionAltoTransaccion=isPermiso;		
		this.isPermisoPaginacionTodoTransaccion=isPermiso;		
		this.isPermisoCopiarTransaccion=isPermiso;		
		this.isPermisoVerFormTransaccion=isPermiso;		
		this.isPermisoDuplicarTransaccion=isPermiso;
		this.isPermisoOrdenTransaccion=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioTransaccion(Boolean isPermiso) {
		//this.isPermisoTodoTransaccion=isPermiso;
		this.isPermisoNuevoTransaccion=isPermiso;
		this.isPermisoActualizarTransaccion=isPermiso;
		this.isPermisoActualizarOriginalTransaccion=isPermiso;
		this.isPermisoEliminarTransaccion=isPermiso;
		this.isPermisoGuardarCambiosTransaccion=isPermiso;
		//this.isPermisoConsultaTransaccion=isPermiso;
		//this.isPermisoBusquedaTransaccion=isPermiso;
		//this.isPermisoReporteTransaccion=isPermiso;
		//this.isPermisoOrdenTransaccion=isPermiso;		
		//this.isPermisoPaginacionMedioTransaccion=isPermiso;		
		//this.isPermisoPaginacionAltoTransaccion=isPermiso;		
		//this.isPermisoPaginacionTodoTransaccion=isPermiso;		
		//this.isPermisoCopiarTransaccion=isPermiso;		
		//this.isPermisoDuplicarTransaccion=isPermiso;
		//this.isPermisoOrdenTransaccion=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioTransaccionClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(TransaccionJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebTransaccion(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioTransaccionClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioTransaccionClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionTransaccionClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioTransaccionClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioTransaccion() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(TransaccionJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.transaccionSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, TransaccionConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoTransaccion=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarTransaccion=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalTransaccion=this.isPermisoActualizarTransaccion;
			this.isPermisoEliminarTransaccion=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosTransaccion=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaTransaccion=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaTransaccion=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoTransaccion=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteTransaccion=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTransaccion=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioTransaccion=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoTransaccion=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoTransaccion=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarTransaccion=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormTransaccion=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarTransaccion=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTransaccion=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.transaccionSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosTransaccion.setToolTipText(this.jTableDatosTransaccion.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioTransaccion(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioTransaccion(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(TransaccionJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(TransaccionJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioTransaccion() throws Exception {
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
	public void inicializarCombosForeignKeyTransaccionListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
				this.sucursalsForeignKey=new ArrayList();
				this.modulosForeignKey=new ArrayList();
				this.tipotransasForeignKey=new ArrayList();
				this.tipocomprobantesForeignKey=new ArrayList();
				this.tipotransaccionmodulosForeignKey=new ArrayList();
				this.tiporetencionsForeignKey=new ArrayList();
				this.cuentacontablesForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyTransaccionListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(TransaccionJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyTransaccionListas(false);
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeySucursalListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyModuloListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyTipoTransaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyTipoComprobanteListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyTipoTransaccionModuloListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyTipoRetencionListas(cargarCombosDependencia,sFinalQueryCombo);
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

	public void cargarCombosForeignKeyTipoTransaListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.tipotransasForeignKey==null||this.tipotransasForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=TipoTransaConstantesFunciones.getArrayColumnasGlobalesTipoTransa(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TipoTransaConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=TipoTransaConstantesFunciones.SFINALQUERY;

				this.cargarCombosTipoTransasForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyTipoComprobanteListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.tipocomprobantesForeignKey==null||this.tipocomprobantesForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=TipoComprobanteConstantesFunciones.getArrayColumnasGlobalesTipoComprobante(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TipoComprobanteConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=TipoComprobanteConstantesFunciones.SFINALQUERY;

				this.cargarCombosTipoComprobantesForeignKeyLista(finalQueryGlobal);
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

			if(cargarCombosDependencia && (this.tipotransaccionmodulosForeignKey==null||this.tipotransaccionmodulosForeignKey.size()<=0)) {
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

	public void cargarCombosForeignKeyTipoRetencionListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.tiporetencionsForeignKey==null||this.tiporetencionsForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=TipoRetencionConstantesFunciones.getArrayColumnasGlobalesTipoRetencion(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TipoRetencionConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=TipoRetencionConstantesFunciones.SFINALQUERY;

				this.cargarCombosTipoRetencionsForeignKeyLista(finalQueryGlobal);
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
	
	public void cargarCombosLoteForeignKeyTransaccionListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			TransaccionParameterReturnGeneral transaccionReturnGeneral=new TransaccionParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.transaccionConstantesFunciones.cargarid_empresaTransaccion)
					 || (this.esRecargarFks && this.transaccionConstantesFunciones.cargarid_empresaTransaccion)) {

					if(!this.transaccionSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+transaccionSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}


				String finalQueryGlobalSucursal="";

				if(((this.sucursalsForeignKey==null||this.sucursalsForeignKey.size()<=0) && this.transaccionConstantesFunciones.cargarid_sucursalTransaccion)
					 || (this.esRecargarFks && this.transaccionConstantesFunciones.cargarid_sucursalTransaccion)) {

					if(!this.transaccionSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=SucursalConstantesFunciones.getArrayColumnasGlobalesSucursal(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalSucursal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,SucursalConstantesFunciones.TABLENAME);

						finalQueryGlobalSucursal=Funciones.GetFinalQueryAppend(finalQueryGlobalSucursal, "");
						finalQueryGlobalSucursal+=SucursalConstantesFunciones.SFINALQUERY;

						//this.cargarCombosSucursalsForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalSucursal=" WHERE " + ConstantesSql.ID + "="+transaccionSessionBean.getlidSucursalActual();
					}
				} else {
					finalQueryGlobalSucursal="NONE";
				}


				String finalQueryGlobalModulo="";

				if(((this.modulosForeignKey==null||this.modulosForeignKey.size()<=0) && this.transaccionConstantesFunciones.cargarid_moduloTransaccion)
					 || (this.esRecargarFks && this.transaccionConstantesFunciones.cargarid_moduloTransaccion)) {

					if(!this.transaccionSessionBean.getisBusquedaDesdeForeignKeySesionModulo()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=ModuloConstantesFunciones.getArrayColumnasGlobalesModulo(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalModulo=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,ModuloConstantesFunciones.TABLENAME);

						finalQueryGlobalModulo=Funciones.GetFinalQueryAppend(finalQueryGlobalModulo, "");
						finalQueryGlobalModulo+=ModuloConstantesFunciones.SFINALQUERY;

						//this.cargarCombosModulosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalModulo=" WHERE " + ConstantesSql.ID + "="+transaccionSessionBean.getlidModuloActual();
					}
				} else {
					finalQueryGlobalModulo="NONE";
				}


				String finalQueryGlobalTipoTransa="";

				if(((this.tipotransasForeignKey==null||this.tipotransasForeignKey.size()<=0) && this.transaccionConstantesFunciones.cargarid_tipo_transaTransaccion)
					 || (this.esRecargarFks && this.transaccionConstantesFunciones.cargarid_tipo_transaTransaccion)) {

					if(!this.transaccionSessionBean.getisBusquedaDesdeForeignKeySesionTipoTransa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=TipoTransaConstantesFunciones.getArrayColumnasGlobalesTipoTransa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalTipoTransa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TipoTransaConstantesFunciones.TABLENAME);

						finalQueryGlobalTipoTransa=Funciones.GetFinalQueryAppend(finalQueryGlobalTipoTransa, "");
						finalQueryGlobalTipoTransa+=TipoTransaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosTipoTransasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalTipoTransa=" WHERE " + ConstantesSql.ID + "="+transaccionSessionBean.getlidTipoTransaActual();
					}
				} else {
					finalQueryGlobalTipoTransa="NONE";
				}


				String finalQueryGlobalTipoComprobante="";

				if(((this.tipocomprobantesForeignKey==null||this.tipocomprobantesForeignKey.size()<=0) && this.transaccionConstantesFunciones.cargarid_tipo_comprobanteTransaccion)
					 || (this.esRecargarFks && this.transaccionConstantesFunciones.cargarid_tipo_comprobanteTransaccion)) {

					if(!this.transaccionSessionBean.getisBusquedaDesdeForeignKeySesionTipoComprobante()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=TipoComprobanteConstantesFunciones.getArrayColumnasGlobalesTipoComprobante(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalTipoComprobante=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TipoComprobanteConstantesFunciones.TABLENAME);

						finalQueryGlobalTipoComprobante=Funciones.GetFinalQueryAppend(finalQueryGlobalTipoComprobante, "");
						finalQueryGlobalTipoComprobante+=TipoComprobanteConstantesFunciones.SFINALQUERY;

						//this.cargarCombosTipoComprobantesForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalTipoComprobante=" WHERE " + ConstantesSql.ID + "="+transaccionSessionBean.getlidTipoComprobanteActual();
					}
				} else {
					finalQueryGlobalTipoComprobante="NONE";
				}


				String finalQueryGlobalTipoTransaccionModulo="";

				if(cargarCombosDependencia && ((this.tipotransaccionmodulosForeignKey==null||this.tipotransaccionmodulosForeignKey.size()<=0) && this.transaccionConstantesFunciones.cargarid_tipo_transaccion_moduloTransaccion)
					 || (this.esRecargarFks && this.transaccionConstantesFunciones.cargarid_tipo_transaccion_moduloTransaccion)) {

					if(!this.transaccionSessionBean.getisBusquedaDesdeForeignKeySesionTipoTransaccionModulo()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=TipoTransaccionModuloConstantesFunciones.getArrayColumnasGlobalesTipoTransaccionModulo(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalTipoTransaccionModulo=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TipoTransaccionModuloConstantesFunciones.TABLENAME);

						finalQueryGlobalTipoTransaccionModulo=Funciones.GetFinalQueryAppend(finalQueryGlobalTipoTransaccionModulo, "");
						finalQueryGlobalTipoTransaccionModulo+=TipoTransaccionModuloConstantesFunciones.SFINALQUERY;

						//this.cargarCombosTipoTransaccionModulosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalTipoTransaccionModulo=" WHERE " + ConstantesSql.ID + "="+transaccionSessionBean.getlidTipoTransaccionModuloActual();
					}
				} else {
					finalQueryGlobalTipoTransaccionModulo="NONE";
				}


				String finalQueryGlobalTipoRetencion="";

				if(((this.tiporetencionsForeignKey==null||this.tiporetencionsForeignKey.size()<=0) && this.transaccionConstantesFunciones.cargarid_tipo_retencionTransaccion)
					 || (this.esRecargarFks && this.transaccionConstantesFunciones.cargarid_tipo_retencionTransaccion)) {

					if(!this.transaccionSessionBean.getisBusquedaDesdeForeignKeySesionTipoRetencion()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=TipoRetencionConstantesFunciones.getArrayColumnasGlobalesTipoRetencion(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalTipoRetencion=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TipoRetencionConstantesFunciones.TABLENAME);

						finalQueryGlobalTipoRetencion=Funciones.GetFinalQueryAppend(finalQueryGlobalTipoRetencion, "");
						finalQueryGlobalTipoRetencion+=TipoRetencionConstantesFunciones.SFINALQUERY;

						//this.cargarCombosTipoRetencionsForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalTipoRetencion=" WHERE " + ConstantesSql.ID + "="+transaccionSessionBean.getlidTipoRetencionActual();
					}
				} else {
					finalQueryGlobalTipoRetencion="NONE";
				}


				String finalQueryGlobalCuentaContable="";

				if(((this.cuentacontablesForeignKey==null||this.cuentacontablesForeignKey.size()<=0) && this.transaccionConstantesFunciones.cargarid_cuenta_contableTransaccion)
					 || (this.esRecargarFks && this.transaccionConstantesFunciones.cargarid_cuenta_contableTransaccion)) {

					if(!this.transaccionSessionBean.getisBusquedaDesdeForeignKeySesionCuentaContable()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();

						this.arrDatoGeneralNo.add("id_modulo");

						arrColumnasGlobales=CuentaContableConstantesFunciones.getArrayColumnasGlobalesCuentaContable(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalCuentaContable=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,CuentaContableConstantesFunciones.TABLENAME);

						finalQueryGlobalCuentaContable=Funciones.GetFinalQueryAppend(finalQueryGlobalCuentaContable, "");
						finalQueryGlobalCuentaContable+=CuentaContableConstantesFunciones.SFINALQUERY;

						//this.cargarCombosCuentaContablesForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalCuentaContable=" WHERE " + ConstantesSql.ID + "="+transaccionSessionBean.getlidCuentaContableActual();
					}
				} else {
					finalQueryGlobalCuentaContable="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				transaccionReturnGeneral=transaccionLogic.cargarCombosLoteForeignKeyTransaccion(finalQueryGlobalEmpresa,finalQueryGlobalSucursal,finalQueryGlobalModulo,finalQueryGlobalTipoTransa,finalQueryGlobalTipoComprobante,finalQueryGlobalTipoTransaccionModulo,finalQueryGlobalTipoRetencion,finalQueryGlobalCuentaContable);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=transaccionReturnGeneral.getempresasForeignKey();
			}

			if(!finalQueryGlobalSucursal.equals("NONE")) {
				this.sucursalsForeignKey=transaccionReturnGeneral.getsucursalsForeignKey();
			}

			if(!finalQueryGlobalModulo.equals("NONE")) {
				this.modulosForeignKey=transaccionReturnGeneral.getmodulosForeignKey();
			}

			if(!finalQueryGlobalTipoTransa.equals("NONE")) {
				this.tipotransasForeignKey=transaccionReturnGeneral.gettipotransasForeignKey();
			}

			if(!finalQueryGlobalTipoComprobante.equals("NONE")) {
				this.tipocomprobantesForeignKey=transaccionReturnGeneral.gettipocomprobantesForeignKey();
			}

			if(!finalQueryGlobalTipoTransaccionModulo.equals("NONE")) {
				this.tipotransaccionmodulosForeignKey=transaccionReturnGeneral.gettipotransaccionmodulosForeignKey();
			}

			if(!finalQueryGlobalTipoRetencion.equals("NONE")) {
				this.tiporetencionsForeignKey=transaccionReturnGeneral.gettiporetencionsForeignKey();
			}

			if(!finalQueryGlobalCuentaContable.equals("NONE")) {
				this.cuentacontablesForeignKey=transaccionReturnGeneral.getcuentacontablesForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyTransaccion()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeySucursal();
			this.addItemDefectoCombosForeignKeyModulo();
			this.addItemDefectoCombosForeignKeyTipoTransa();
			this.addItemDefectoCombosForeignKeyTipoComprobante();
			this.addItemDefectoCombosForeignKeyTipoTransaccionModulo();
			this.addItemDefectoCombosForeignKeyTipoRetencion();
			this.addItemDefectoCombosForeignKeyCuentaContable();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.transaccionSessionBean==null) {
				this.transaccionSessionBean=new TransaccionSessionBean();
			}

			if(!this.transaccionSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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

			if(!this.transaccionSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
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

			if(!this.transaccionSessionBean.getisBusquedaDesdeForeignKeySesionModulo()) {
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

	public void addItemDefectoCombosForeignKeyTipoTransa()throws Exception {
		try {

			if(!this.transaccionSessionBean.getisBusquedaDesdeForeignKeySesionTipoTransa()) {
				TipoTransa tipotransa=new TipoTransa();
				TipoTransaConstantesFunciones.setTipoTransaDescripcion(tipotransa,Constantes.SMENSAJE_ESCOJA_OPCION);
				tipotransa.setId(null);

				if(!TipoTransaConstantesFunciones.ExisteEnLista(this.tipotransasForeignKey,tipotransa,true)) {

					this.tipotransasForeignKey.add(0,tipotransa);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyTipoComprobante()throws Exception {
		try {

			if(!this.transaccionSessionBean.getisBusquedaDesdeForeignKeySesionTipoComprobante()) {
				TipoComprobante tipocomprobante=new TipoComprobante();
				TipoComprobanteConstantesFunciones.setTipoComprobanteDescripcion(tipocomprobante,Constantes.SMENSAJE_ESCOJA_OPCION);
				tipocomprobante.setId(null);

				if(!TipoComprobanteConstantesFunciones.ExisteEnLista(this.tipocomprobantesForeignKey,tipocomprobante,true)) {

					this.tipocomprobantesForeignKey.add(0,tipocomprobante);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyTipoTransaccionModulo()throws Exception {
		try {

			if(!this.transaccionSessionBean.getisBusquedaDesdeForeignKeySesionTipoTransaccionModulo()) {
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

	public void addItemDefectoCombosForeignKeyTipoRetencion()throws Exception {
		try {

			if(!this.transaccionSessionBean.getisBusquedaDesdeForeignKeySesionTipoRetencion()) {
				TipoRetencion tiporetencion=new TipoRetencion();
				TipoRetencionConstantesFunciones.setTipoRetencionDescripcion(tiporetencion,Constantes.SMENSAJE_ESCOJA_OPCION);
				tiporetencion.setId(null);

				if(!TipoRetencionConstantesFunciones.ExisteEnLista(this.tiporetencionsForeignKey,tiporetencion,true)) {

					this.tiporetencionsForeignKey.add(0,tiporetencion);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyCuentaContable()throws Exception {
		try {

			if(!this.transaccionSessionBean.getisBusquedaDesdeForeignKeySesionCuentaContable()) {
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
	
	public void initActionsCombosTodosForeignKeyTransaccion()throws Exception {
		try {
			
			this.initActionsCombosForeignKeyModulo("Todos");
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyTransaccion(String sFormularioTipoBusqueda)throws Exception {
		try {
			
			this.initActionsCombosForeignKeyModulo(sFormularioTipoBusqueda);
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	@SuppressWarnings("rawtypes")
	public void procesarActionsCombosForeignKeyModulo(JComboBox jComboBoxModuloGenerico,String sFormularioTipoBusqueda)throws Exception {
		try {
			String sFinalQueryCombo="";
			Modulo moduloLocal=(Modulo)jComboBoxModuloGenerico.getSelectedItem();

			if(moduloLocal!=null  && moduloLocal.getId()!=null  && moduloLocal.getId()>0) {
				sFinalQueryCombo="  WHERE  id_modulo="+moduloLocal.getId();
			}
			//REDEFINE

			//COPIA PARA VENTANA BUSQUEDA
			this.sFinalQueryComboTipoTransaccionModulo=sFinalQueryCombo;

			this.tipotransaccionmodulosForeignKey=new ArrayList<TipoTransaccionModulo>();
			this.cargarCombosForeignKeyTipoTransaccionModulo(true,false,false,sFinalQueryCombo,sFormularioTipoBusqueda);
		} catch(Exception e) {
			throw e;
		}
	}
	
	



	public void initActionsCombosForeignKeyModulo(String sFormularioTipoBusqueda)throws Exception {
		try {
			if(sFormularioTipoBusqueda.equals("Todos") || sFormularioTipoBusqueda.equals("Formulario")) {
				if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
					if(this.jInternalFrameDetalleFormTransaccion!=null) {
						this.jInternalFrameDetalleFormTransaccion.jComboBoxid_moduloTransaccion.addItemListener(new ComboBoxItemListener(this,"id_moduloTransaccion"));
						this.jInternalFrameDetalleFormTransaccion.jComboBoxid_moduloTransaccion.addFocusListener(new ComboBoxFocusListener(this,"id_moduloTransaccion"));
					}
				} else {
					if(this.jInternalFrameDetalleFormTransaccion!=null) {
						this.jInternalFrameDetalleFormTransaccion.jComboBoxid_moduloTransaccion.addActionListener(new ComboBoxActionListener(this,"id_moduloTransaccion"));
						this.jInternalFrameDetalleFormTransaccion.jComboBoxid_moduloTransaccion.addFocusListener(new ComboBoxFocusListener(this,"id_moduloTransaccion"));
					}
				}
			}

			if(sFormularioTipoBusqueda.equals("Todos")) {

				if(!this.conCargarMinimo) {
				
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						this.jComboBoxid_moduloBusquedaPorIdModuloPorTipoTransaccionTransaccion.addItemListener(new ComboBoxItemListener(this,"jComboBoxid_moduloBusquedaPorIdModuloPorTipoTransaccionTransaccion"));

						this.jComboBoxid_moduloBusquedaPorIdModuloPorTipoTransaccionTransaccion.addFocusListener(new ComboBoxFocusListener(this,"jComboBoxid_moduloBusquedaPorIdModuloPorTipoTransaccionTransaccion"));

					} else {
						this.jComboBoxid_moduloBusquedaPorIdModuloPorTipoTransaccionTransaccion.addActionListener(new ComboBoxActionListener(this,"jComboBoxid_moduloBusquedaPorIdModuloPorTipoTransaccionTransaccion"));

						this.jComboBoxid_moduloBusquedaPorIdModuloPorTipoTransaccionTransaccion.addFocusListener(new ComboBoxFocusListener(this,"jComboBoxid_moduloBusquedaPorIdModuloPorTipoTransaccionTransaccion"));

					}
			
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesGlobalesCombosForeignKeyTransaccion()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
				this.setActualSucursalForeignKey(this.parametroGeneralUsuario.getid_sucursal(),false,"Formulario");
				this.setActualModuloForeignKey(this.moduloActual.getId(),false,"Formulario");
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyTransaccion();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyTransaccion(Transaccion transaccion)throws Exception {	
		try {
			
			this.setActualTipoTransaForeignKey(transaccion.getid_tipo_transa(),false,"Formulario");
			this.setActualTipoComprobanteForeignKey(transaccion.getid_tipo_comprobante(),false,"Formulario");
			this.setActualTipoTransaccionModuloForeignKey(transaccion.getid_tipo_transaccion_modulo(),false,"Formulario");
			this.setActualTipoRetencionForeignKey(transaccion.getid_tipo_retencion(),false,"Formulario");
			this.setActualCuentaContableForeignKey(transaccion.getid_cuenta_contable(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyTransaccion(Transaccion transaccion,String sTipoEvento)throws Exception {	
		try {
			
			

				if(transaccion.getCuentaContable()!=null && !sTipoEvento.equals("id_cuenta_contableTransaccion")) { //sTipoEvento Evita Bucle Infinito

					this.cuentacontablesForeignKey=new ArrayList<CuentaContable>();
					this.cuentacontablesForeignKey.add(transaccion.getCuentaContable());

					this.addItemDefectoCombosForeignKeyCuentaContable();
					this.cargarCombosFrameCuentaContablesForeignKey("Todos");
				}
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyTransaccion()throws Exception {	
		try {
			
			this.setActualTipoTransaForeignKey(this.transaccionConstantesFunciones.getid_tipo_transa(),false,"Formulario");
			this.setActualTipoComprobanteForeignKey(this.transaccionConstantesFunciones.getid_tipo_comprobante(),false,"Formulario");
			this.setActualTipoTransaccionModuloForeignKey(this.transaccionConstantesFunciones.getid_tipo_transaccion_modulo(),false,"Formulario");
			this.setActualTipoRetencionForeignKey(this.transaccionConstantesFunciones.getid_tipo_retencion(),false,"Formulario");
			this.setActualCuentaContableForeignKey(this.transaccionConstantesFunciones.getid_cuenta_contable(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyTransaccion()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyTransaccion()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyTransaccion()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroTransaccion()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyTransaccion()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameSucursalsForeignKey("Todos");
			this.cargarCombosFrameModulosForeignKey("Todos");
			this.cargarCombosFrameTipoTransasForeignKey("Todos");
			this.cargarCombosFrameTipoComprobantesForeignKey("Todos");
			this.cargarCombosFrameTipoTransaccionModulosForeignKey("Todos");
			this.cargarCombosFrameTipoRetencionsForeignKey("Todos");
			this.cargarCombosFrameCuentaContablesForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyTransaccion(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameSucursalsForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameModulosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameTipoTransasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameTipoComprobantesForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameTipoTransaccionModulosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameTipoRetencionsForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameCuentaContablesForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyTransaccion()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormTransaccion.jComboBoxid_empresaTransaccion!=null && this.jInternalFrameDetalleFormTransaccion.jComboBoxid_empresaTransaccion.getItemCount()>0) {
				this.jInternalFrameDetalleFormTransaccion.jComboBoxid_empresaTransaccion.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormTransaccion.jComboBoxid_sucursalTransaccion!=null && this.jInternalFrameDetalleFormTransaccion.jComboBoxid_sucursalTransaccion.getItemCount()>0) {
				this.jInternalFrameDetalleFormTransaccion.jComboBoxid_sucursalTransaccion.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormTransaccion.jComboBoxid_moduloTransaccion!=null && this.jInternalFrameDetalleFormTransaccion.jComboBoxid_moduloTransaccion.getItemCount()>0) {
				this.jInternalFrameDetalleFormTransaccion.jComboBoxid_moduloTransaccion.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormTransaccion.jComboBoxid_tipo_transaTransaccion!=null && this.jInternalFrameDetalleFormTransaccion.jComboBoxid_tipo_transaTransaccion.getItemCount()>0) {
				this.jInternalFrameDetalleFormTransaccion.jComboBoxid_tipo_transaTransaccion.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormTransaccion.jComboBoxid_tipo_comprobanteTransaccion!=null && this.jInternalFrameDetalleFormTransaccion.jComboBoxid_tipo_comprobanteTransaccion.getItemCount()>0) {
				this.jInternalFrameDetalleFormTransaccion.jComboBoxid_tipo_comprobanteTransaccion.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormTransaccion.jComboBoxid_tipo_transaccion_moduloTransaccion!=null && this.jInternalFrameDetalleFormTransaccion.jComboBoxid_tipo_transaccion_moduloTransaccion.getItemCount()>0) {
				this.jInternalFrameDetalleFormTransaccion.jComboBoxid_tipo_transaccion_moduloTransaccion.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormTransaccion.jComboBoxid_tipo_retencionTransaccion!=null && this.jInternalFrameDetalleFormTransaccion.jComboBoxid_tipo_retencionTransaccion.getItemCount()>0) {
				this.jInternalFrameDetalleFormTransaccion.jComboBoxid_tipo_retencionTransaccion.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormTransaccion.jComboBoxid_cuenta_contableTransaccion!=null && this.jInternalFrameDetalleFormTransaccion.jComboBoxid_cuenta_contableTransaccion.getItemCount()>0) {
				this.jInternalFrameDetalleFormTransaccion.jComboBoxid_cuenta_contableTransaccion.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	





	public void recargarFormTransaccionModulo(JComboBox<?> jComboBoxGenericoModulo,String sFormularioTipoBusqueda) throws Exception {

		this.recargarFormTransaccionid_tipo_transaccion_modulo(jComboBoxGenericoModulo,sFormularioTipoBusqueda,"Modulo",false);
	}










	
	



	public void recargarFormTransaccionid_tipo_transaccion_modulo(JComboBox<?> jComboBoxGenericoTipoTransaccionModulo,String sFormularioTipoBusqueda,String sTipoComboOrigen,Boolean conIrServidorAplicacion) throws Exception {
		try {

			String sFinalQuery="";

			if(sTipoComboOrigen.equals("Modulo")){
				this.setActualParaGuardarModuloForeignKey(this.transaccion,jComboBoxGenericoTipoTransaccionModulo);
			}

			if(this.transaccion.getid_modulo()!=null && this.transaccion.getid_modulo()!=0L) {
				sFinalQuery+="  WHERE  id_modulo="+this.transaccion.getid_modulo();
			} else {
				sFinalQuery+="  WHERE  id_modulo=-1";
			}



			//BUCLE RECURSIVO
			this.setActualTipoTransaccionModuloForeignKey(this.transaccion.getid_modulo(),true,sFormularioTipoBusqueda);

			this.cargarCombosTipoTransaccionModulosForeignKeyLista(sFinalQuery);

			this.cargarCombosFrameTipoTransaccionModulosForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public TransaccionBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public TransaccionBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public TransaccionBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.transaccionSessionBean=new TransaccionSessionBean(); 
		this.transaccionConstantesFunciones=new TransaccionConstantesFunciones(); 
		this.transaccionBean=new Transaccion();//(this.transaccionConstantesFunciones); 		
		this.transaccionReturnGeneral=new TransaccionParameterReturnGeneral(); 
		
		this.transaccionSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.transaccionSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public TransaccionBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public TransaccionBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public TransaccionBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessTransaccion(true);
			
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
			
			this.transaccionConstantesFunciones=new TransaccionConstantesFunciones(); 
			this.transaccionBean=new Transaccion();//this.transaccionConstantesFunciones); 			
			this.transaccionReturnGeneral=new TransaccionParameterReturnGeneral(); 
		
			TransaccionBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Transaccion Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.transaccion=new Transaccion();
			this.transaccions = new ArrayList<Transaccion>();
			this.transaccionsAux = new ArrayList<Transaccion>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccionLogic=new TransaccionLogic();
				this.transaccionLogic.getNewConnexionToDeep("");
			}
			
			//this.transaccionSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.transaccionSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormTransaccion);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoTransaccion!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTransaccion);	
					}
					
					if(this.jInternalFrameImportacionTransaccion!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTransaccion);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByTransaccion!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByTransaccion);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormTransaccion!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormTransaccion);
				this.jInternalFrameDetalleFormTransaccion.setVisible(false);
				this.jInternalFrameDetalleFormTransaccion.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoTransaccion!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTransaccion);
					this.jInternalFrameReporteDinamicoTransaccion.setVisible(false);
					this.jInternalFrameReporteDinamicoTransaccion.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionTransaccion!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionTransaccion);
					this.jInternalFrameImportacionTransaccion.setVisible(false);
					this.jInternalFrameImportacionTransaccion.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByTransaccion!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByTransaccion);
					this.jInternalFrameOrderByTransaccion.setVisible(false);
					this.jInternalFrameOrderByTransaccion.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idTransaccionActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=TransaccionConstantesFunciones.INUMEROPAGINACION;
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
			
			this.transaccionReturnGeneral=new TransaccionParameterReturnGeneral();
			
			this.transaccionParameterGeneral=new TransaccionParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.transaccionLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.transaccionSessionBean.getEsGuardarRelacionado()) {
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
			
			if(TransaccionJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.transaccionSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TransaccionConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.transaccionSessionBean.getEsGuardarRelacionado(),this.transaccionSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TransaccionConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.transaccionSessionBean.getEsGuardarRelacionado(),this.transaccionSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoTransaccion=false;
			this.isVisibilidadCeldaDuplicarTransaccion=true;
			this.isVisibilidadCeldaCopiarTransaccion=true;
			this.isVisibilidadCeldaVerFormTransaccion=true;
			this.isVisibilidadCeldaOrdenTransaccion=true;
			this.isVisibilidadCeldaNuevoRelacionesTransaccion=false;
			this.isVisibilidadCeldaModificarTransaccion=false;
			this.isVisibilidadCeldaActualizarTransaccion=false;
			this.isVisibilidadCeldaEliminarTransaccion=false;
			this.isVisibilidadCeldaCancelarTransaccion=false;
			this.isVisibilidadCeldaGuardarTransaccion=false;
			this.isVisibilidadCeldaGuardarCambiosTransaccion=false;
			
			
			this.isVisibilidadBusquedaPorCodigo=true;
			this.isVisibilidadBusquedaPorIdModuloPorTipoTransaccion=true;
			this.isVisibilidadBusquedaPorNombre=true;
			this.isVisibilidadFK_IdCuentaContable=true;
			this.isVisibilidadFK_IdEmpresa=true;
			this.isVisibilidadFK_IdModulo=true;
			this.isVisibilidadFK_IdSucursal=true;
			this.isVisibilidadFK_IdTipoComprobante=true;
			this.isVisibilidadFK_IdTipoRetencion=true;
			this.isVisibilidadFK_IdTipoTransa=true;
			this.isVisibilidadFK_IdTipoTransaccionModulo=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesTransaccion("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosTransaccion();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioTransaccion(false);
			
			this.setPermisosUsuarioTransaccion();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.transaccionSessionBean.getEsGuardarRelacionado() 
				|| (this.transaccionSessionBean.getEsGuardarRelacionado() && this.transaccionSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioTransaccionClasesRelacionadas();
			}
			
			if(this.transaccionSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioTransaccionClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!TransaccionJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosTransaccion();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualTransaccion();
			}
			
			if(!this.isPermisoBusquedaTransaccion) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasTransaccion.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.transaccionSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioTransaccion,this.isPermisoPaginacionMedioTransaccion,this.isPermisoPaginacionTodoTransaccion);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(TransaccionConstantesFunciones.getTiposSeleccionarTransaccion());
				
				this.tiposColumnasSelect=TransaccionConstantesFunciones.getTiposSeleccionarTransaccion(true);
				
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
			//if(!this.transaccionSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioTransaccion();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,false,true);
				this.setAccionesUsuarioTransaccion(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,false,true);							
				this.setAccionesUsuarioTransaccion(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesTransaccion() ;
			
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
			this.tipotransaLogic=new TipoTransaLogic();
			this.tipocomprobanteLogic=new TipoComprobanteLogic();
			this.tipotransaccionmoduloLogic=new TipoTransaccionModuloLogic();
			this.tiporetencionLogic=new TipoRetencionLogic();
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
				transaccionImplementable= (TransaccionImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TransaccionConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				transaccionImplementableHome= (TransaccionImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TransaccionConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.transaccions= new ArrayList<Transaccion>();
			this.transaccionsEliminados= new ArrayList<Transaccion>();
						
			this.isEsNuevoTransaccion=false;
			this.esParaAccionDesdeFormularioTransaccion=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			//BUSQUEDA INTERNA FK
			this.idCuentaContableActual=0L;
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			this.sucursalsForeignKey=new ArrayList<Sucursal>() ;
			this.modulosForeignKey=new ArrayList<Modulo>() ;
			this.tipotransasForeignKey=new ArrayList<TipoTransa>() ;
			this.tipocomprobantesForeignKey=new ArrayList<TipoComprobante>() ;
			this.tipotransaccionmodulosForeignKey=new ArrayList<TipoTransaccionModulo>() ;
			this.tiporetencionsForeignKey=new ArrayList<TipoRetencion>() ;
			this.cuentacontablesForeignKey=new ArrayList<CuentaContable>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyTransaccion(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroTransaccion();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.transaccionSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			TransaccionBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=TransaccionConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesTransaccion("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingTransaccion(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormTransaccion!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioTransaccion();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioTransaccion();
			}
			
			TransaccionBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasTransaccion.getTabCount(); i++) {
					this.jTabbedPaneBusquedasTransaccion.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasTransaccion.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccionLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessTransaccion(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga Transaccion: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccionLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TransaccionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccionLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectTransaccion() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesTransaccion")) {
				iIndex=this.jInternalFrameDetalleFormTransaccion.jTabbedPaneRelacionesTransaccion.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormTransaccion.jTabbedPaneRelacionesTransaccion.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosTransaccion.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessTransaccion();	
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
	
	public void cargarCombosForeignKeyTransaccion(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyTransaccion(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyTransaccion(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyTransaccionListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyTransaccion();
		
		this.cargarCombosFrameForeignKeyTransaccion();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyTransaccion();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyTransaccion();
		}
	}
	
	

	public void cargarCombosForeignKeyTipoTransa(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyTipoTransaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyTipoTransa();
				this.cargarCombosFrameTipoTransasForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
					this.initActionsCombosForeignKeyModulo("Todos");
				}

			this.recargarComboTablaTipoTransa(this.tipotransasForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyTipoComprobante(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyTipoComprobanteListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyTipoComprobante();
				this.cargarCombosFrameTipoComprobantesForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
					this.initActionsCombosForeignKeyModulo("Todos");
				}

			this.recargarComboTablaTipoComprobante(this.tipocomprobantesForeignKey);

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
					this.initActionsCombosForeignKeyModulo("Todos");
				}

			this.recargarComboTablaTipoTransaccionModulo(this.tipotransaccionmodulosForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyTipoRetencion(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyTipoRetencionListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyTipoRetencion();
				this.cargarCombosFrameTipoRetencionsForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
					this.initActionsCombosForeignKeyModulo("Todos");
				}

			this.recargarComboTablaTipoRetencion(this.tiporetencionsForeignKey);

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
					this.initActionsCombosForeignKeyModulo("Todos");
				}

			this.recargarComboTablaCuentaContable(this.cuentacontablesForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void jButtonNuevoTransaccionActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.transaccionSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormTransaccion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			TransaccionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.transaccion,new Object(),this.transaccionParameterGeneral,this.transaccionReturnGeneral);
			
			
			if(jTableDatosTransaccion.getRowCount()>=1) {
				jTableDatosTransaccion.removeRowSelectionInterval(0, jTableDatosTransaccion.getRowCount()-1);						
			}
			
			this.isEsNuevoTransaccion=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoTransaccion(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesTransaccion(true);			
			//this.transaccion=new Transaccion();
			//this.transaccion.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTransaccion(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTransaccion() ;
			
			if(TransaccionJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTransaccion(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.transaccion);	
			this.actualizarInformacion("INFO_PADRE",false,this.transaccion);				
			
			TransaccionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.transaccion,new Object(),this.transaccionParameterGeneral,this.transaccionReturnGeneral);
			
			if(this.transaccionSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar Transaccion: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			TransaccionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.transaccion,new Object(),this.transaccionParameterGeneral,this.transaccionReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TransaccionConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarTransaccionActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<Transaccion> transaccionsSeleccionados=new ArrayList<Transaccion>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosTransaccion.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosTransaccion.getSelectedRows().length;			
			}
			
			transaccionsSeleccionados=this.getTransaccionsSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoTransaccion--;			
				//Transaccion transaccionAux= new Transaccion();			
				//transaccionAux.setId(this.iIdNuevoTransaccion);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//Transaccion transaccionOrigen=new Transaccion();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(Transaccion transaccionOrigen : transaccionsSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosTransaccion.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							transaccionOrigen =(Transaccion) this.transaccionLogic.getTransaccions().toArray()[this.jTableDatosTransaccion.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							transaccionOrigen =(Transaccion) this.transaccions.toArray()[this.jTableDatosTransaccion.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaTransaccion();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.transaccion.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosTransaccion(transaccionOrigen,this.transaccion,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysTransaccion(this.transaccion);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.transaccionLogic.getTransaccions().add(this.transaccionAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.transaccions.add(this.transaccionAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaTransaccion(false);
				
				this.jTableDatosTransaccion.setRowSelectionInterval(this.getIndiceNuevoTransaccion(), this.getIndiceNuevoTransaccion());
				
				int iLastRow =  this.jTableDatosTransaccion.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTransaccion.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTransaccion.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTransaccion(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,TransaccionConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarTransaccionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<Transaccion> transaccionsSeleccionados=new ArrayList<Transaccion>();									
		
			Transaccion transaccionOrigen=new Transaccion();
			Transaccion transaccionDestino=new Transaccion();
				
			transaccionsSeleccionados=this.getTransaccionsSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosTransaccion.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || transaccionsSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosTransaccion.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						transaccionOrigen =(Transaccion) this.transaccionLogic.getTransaccions().toArray()[this.jTableDatosTransaccion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						transaccionOrigen =(Transaccion) this.transaccions.toArray()[this.jTableDatosTransaccion.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						transaccionDestino =(Transaccion) this.transaccionLogic.getTransaccions().toArray()[this.jTableDatosTransaccion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						transaccionDestino =(Transaccion) this.transaccions.toArray()[this.jTableDatosTransaccion.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				transaccionOrigen =transaccionsSeleccionados.get(0);
				transaccionDestino =transaccionsSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosTransaccion(transaccionOrigen,transaccionDestino,true,false);
				
				transaccionDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(transaccionDestino,transaccionLogic.getTransaccions());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(transaccionDestino,transaccions);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaTransaccion(false);
				
				//this.jTableDatosTransaccion.setRowSelectionInterval(this.getIndiceNuevoTransaccion(), this.getIndiceNuevoTransaccion());
				
				int iLastRow =  this.jTableDatosTransaccion.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTransaccion.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTransaccion.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTransaccion(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransaccionConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormTransaccionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTransaccion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormTransaccion.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransaccionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarTransaccionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesTransaccion.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasTransaccion.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesTransaccion.setVisible(!isVisible);
			this.jPanelPaginacionTransaccion.setVisible(!isVisible);
			this.jPanelAccionesTransaccion.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransaccionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarTransaccionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameTransaccion();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransaccionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoTransaccionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoTransaccion();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransaccionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionTransaccionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionTransaccion();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransaccionConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByTransaccionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByTransaccion();
			
			this.abrirFrameOrderByTransaccion();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransaccionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByTransaccionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByTransaccion();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransaccionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleTransaccion(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormTransaccion);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormTransaccion.isMaximum()) {
					this.jInternalFrameDetalleFormTransaccion.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormTransaccion.setSize(this.jInternalFrameDetalleFormTransaccion.iWidthFormulario,this.jInternalFrameDetalleFormTransaccion.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormTransaccion.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormTransaccion.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormTransaccion.isMaximum()) {
						this.jInternalFrameDetalleFormTransaccion.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormTransaccion.jContentPaneDetalleTransaccion.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormTransaccion.jTabbedPaneRelacionesTransaccion.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormTransaccion.jContentPaneDetalleTransaccion.getWidth(),TransaccionConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTransaccion.jTabbedPaneRelacionesTransaccion.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormTransaccion.jContentPaneDetalleTransaccion.getWidth(),TransaccionConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTransaccion.jTabbedPaneRelacionesTransaccion.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormTransaccion.jContentPaneDetalleTransaccion.getWidth(),TransaccionConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormTransaccion.setVisible(true);
	        this.jInternalFrameDetalleFormTransaccion.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TransaccionConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByTransaccion() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByTransaccion==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByTransaccion=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTransaccion,false,this);
				} else {
					this.jInternalFrameOrderByTransaccion=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTransaccion,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByTransaccion);
				this.jInternalFrameOrderByTransaccion.setVisible(false);
				this.jInternalFrameOrderByTransaccion.setSelected(false);
				
				this.jInternalFrameOrderByTransaccion.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTransaccion"));
				
				this.inicializarActualizarBindingTablaOrderByTransaccion();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionTransaccion() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionTransaccion==null) {
				
				this.jInternalFrameImportacionTransaccion=new ImportacionJInternalFrame(TransaccionConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTransaccion);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionTransaccion);
				this.jInternalFrameImportacionTransaccion.setVisible(false);
				this.jInternalFrameImportacionTransaccion.setSelected(false);


				this.jInternalFrameImportacionTransaccion.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTransaccion"));
				this.jInternalFrameImportacionTransaccion.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTransaccion"));
				this.jInternalFrameImportacionTransaccion.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTransaccion"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoTransaccion() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoTransaccion==null) {
				this.jInternalFrameReporteDinamicoTransaccion=new ReporteDinamicoJInternalFrame(TransaccionConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTransaccion);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTransaccion);
				this.jInternalFrameReporteDinamicoTransaccion.setVisible(false);
				this.jInternalFrameReporteDinamicoTransaccion.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoTransaccion.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTransaccion"));
				this.jInternalFrameReporteDinamicoTransaccion.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTransaccion"));
				this.jInternalFrameReporteDinamicoTransaccion.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTransaccion"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTransaccion();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
					
	public void cerrarFrameDetalleTransaccion() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormTransaccion);
			
	       	this.jInternalFrameDetalleFormTransaccion.setVisible(false);
	        this.jInternalFrameDetalleFormTransaccion.setSelected(false);
			
			//this.jInternalFrameDetalleFormTransaccion.dispose();
			//this.jInternalFrameDetalleFormTransaccion=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TransaccionConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoTransaccion() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoTransaccion.setVisible(true);
	        this.jInternalFrameReporteDinamicoTransaccion.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TransaccionConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionTransaccion() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionTransaccion.setVisible(true);
	        this.jInternalFrameImportacionTransaccion.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TransaccionConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByTransaccion() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByTransaccion.setVisible(true);
	        this.jInternalFrameOrderByTransaccion.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TransaccionConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByTransaccion() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByTransaccion.setVisible(false);
	        this.jInternalFrameOrderByTransaccion.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TransaccionConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoTransaccion() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoTransaccion.setVisible(false);
	        this.jInternalFrameReporteDinamicoTransaccion.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TransaccionConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionTransaccion() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionTransaccion.setVisible(false);
	        this.jInternalFrameImportacionTransaccion.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TransaccionConstantesFunciones.CLASSNAME);
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
						TitledBorder titledBorderTransaccion=(TitledBorder)this.jScrollPanelDatosTransaccion.getBorder();
						TitledBorder titledBorderCuentaContable=(TitledBorder)cuentacontableBeanSwingJInternalFrame.jScrollPanelDatosCuentaContable.getBorder();

						titledBorderCuentaContable.setTitle(titledBorderTransaccion.getTitle() + " -> Cuenta Contable");


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
	
	public void jButtonModificarTransaccionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarTransaccion(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransaccionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarTransaccion(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTransaccion.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesTransaccion(true);
			//this.isEsNuevoTransaccion=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccion =(Transaccion) this.transaccionLogic.getTransaccions().toArray()[this.jTableDatosTransaccion.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.transaccion =(Transaccion) this.transaccions.toArray()[this.jTableDatosTransaccion.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesTransaccion("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTransaccion(false) ;
			
			if(transaccionSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(TransaccionJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTransaccion(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTransaccion(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransaccionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaTransaccionActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosTransaccion.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transaccion =(Transaccion) this.transaccionLogic.getTransaccions().toArray()[this.jTableDatosTransaccion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.transaccion =(Transaccion) this.transaccions.toArray()[this.jTableDatosTransaccion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TransaccionConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarTransaccion(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTransaccion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTransaccion.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesTransaccion(true);
			//this.isEsNuevoTransaccion=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccion =(Transaccion) this.transaccionLogic.getTransaccions().toArray()[this.jTableDatosTransaccion.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.transaccion =(Transaccion) this.transaccions.toArray()[this.jTableDatosTransaccion.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.transaccion.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesTransaccion("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesTransaccion(false) ;
			
			if(TransaccionJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTransaccion(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTransaccion(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransaccionConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
			
			if(sType.equals("CuentaContable")) {
				if(!this.transaccionConstantesFunciones.cargarid_cuenta_contableTransaccion) {
					this.cargarCombosCuentaContablesForeignKeyLista(" where id="+id);
					//this.inicializarActualizarBindingTransaccion(false,false);
					this.cargarCombosFrameCuentaContablesForeignKey("Todos");
				}

				this.setCombosCodigoDesdeBusquedaid_cuenta_contable (id);

				this.recargarComboTablaCuentaContable(this.cuentacontablesForeignKey);

			}
		} catch(Exception e) {
			throw e;
		}
	}
	
				
	
	public void recargarComboTablaTipoTransa(List<TipoTransa> tipotransasForeignKey)throws Exception{
		TableColumn tableColumnTipoTransa=this.jTableDatosTransaccion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTransaccion,TransaccionConstantesFunciones.LABEL_IDTIPOTRANSA));
		TableCellEditor tableCellEditorTipoTransa =tableColumnTipoTransa.getCellEditor();

		TipoTransaTableCell tipotransaTableCellFk=(TipoTransaTableCell)tableCellEditorTipoTransa;

		if(tipotransaTableCellFk!=null) {
			tipotransaTableCellFk.settipotransasForeignKey(tipotransasForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosTransaccion.getSelectedRow();

		//if(intSelectedRow<=0) {
			//tipotransaTableCellFk.setRowActual(intSelectedRow);
			//tipotransaTableCellFk.settipotransasForeignKeyActual(tipotransasForeignKey);
		//}


		if(tipotransaTableCellFk!=null) {
			tipotransaTableCellFk.RecargarTipoTransasForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaTipoComprobante(List<TipoComprobante> tipocomprobantesForeignKey)throws Exception{
		TableColumn tableColumnTipoComprobante=this.jTableDatosTransaccion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTransaccion,TransaccionConstantesFunciones.LABEL_IDTIPOCOMPROBANTE));
		TableCellEditor tableCellEditorTipoComprobante =tableColumnTipoComprobante.getCellEditor();

		TipoComprobanteTableCell tipocomprobanteTableCellFk=(TipoComprobanteTableCell)tableCellEditorTipoComprobante;

		if(tipocomprobanteTableCellFk!=null) {
			tipocomprobanteTableCellFk.settipocomprobantesForeignKey(tipocomprobantesForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosTransaccion.getSelectedRow();

		//if(intSelectedRow<=0) {
			//tipocomprobanteTableCellFk.setRowActual(intSelectedRow);
			//tipocomprobanteTableCellFk.settipocomprobantesForeignKeyActual(tipocomprobantesForeignKey);
		//}


		if(tipocomprobanteTableCellFk!=null) {
			tipocomprobanteTableCellFk.RecargarTipoComprobantesForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaTipoTransaccionModulo(List<TipoTransaccionModulo> tipotransaccionmodulosForeignKey)throws Exception{
		TableColumn tableColumnTipoTransaccionModulo=this.jTableDatosTransaccion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTransaccion,TransaccionConstantesFunciones.LABEL_IDTIPOTRANSACCIONMODULO));
		TableCellEditor tableCellEditorTipoTransaccionModulo =tableColumnTipoTransaccionModulo.getCellEditor();

		TipoTransaccionModuloTableCell tipotransaccionmoduloTableCellFk=(TipoTransaccionModuloTableCell)tableCellEditorTipoTransaccionModulo;

		if(tipotransaccionmoduloTableCellFk!=null) {
			tipotransaccionmoduloTableCellFk.settipotransaccionmodulosForeignKey(tipotransaccionmodulosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosTransaccion.getSelectedRow();

		//if(intSelectedRow<=0) {
			//tipotransaccionmoduloTableCellFk.setRowActual(intSelectedRow);
			//tipotransaccionmoduloTableCellFk.settipotransaccionmodulosForeignKeyActual(tipotransaccionmodulosForeignKey);
		//}


		if(tipotransaccionmoduloTableCellFk!=null) {
			tipotransaccionmoduloTableCellFk.RecargarTipoTransaccionModulosForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaTipoRetencion(List<TipoRetencion> tiporetencionsForeignKey)throws Exception{
		TableColumn tableColumnTipoRetencion=this.jTableDatosTransaccion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTransaccion,TransaccionConstantesFunciones.LABEL_IDTIPORETENCION));
		TableCellEditor tableCellEditorTipoRetencion =tableColumnTipoRetencion.getCellEditor();

		TipoRetencionTableCell tiporetencionTableCellFk=(TipoRetencionTableCell)tableCellEditorTipoRetencion;

		if(tiporetencionTableCellFk!=null) {
			tiporetencionTableCellFk.settiporetencionsForeignKey(tiporetencionsForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosTransaccion.getSelectedRow();

		//if(intSelectedRow<=0) {
			//tiporetencionTableCellFk.setRowActual(intSelectedRow);
			//tiporetencionTableCellFk.settiporetencionsForeignKeyActual(tiporetencionsForeignKey);
		//}


		if(tiporetencionTableCellFk!=null) {
			tiporetencionTableCellFk.RecargarTipoRetencionsForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaCuentaContable(List<CuentaContable> cuentacontablesForeignKey)throws Exception{
		TableColumn tableColumnCuentaContable=this.jTableDatosTransaccion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTransaccion,TransaccionConstantesFunciones.LABEL_IDCUENTACONTABLE));
		TableCellEditor tableCellEditorCuentaContable =tableColumnCuentaContable.getCellEditor();

		CuentaContableTableCell cuentacontableTableCellFk=(CuentaContableTableCell)tableCellEditorCuentaContable;

		if(cuentacontableTableCellFk!=null) {
			cuentacontableTableCellFk.setcuentacontablesForeignKey(cuentacontablesForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosTransaccion.getSelectedRow();

		//if(intSelectedRow<=0) {
			//cuentacontableTableCellFk.setRowActual(intSelectedRow);
			//cuentacontableTableCellFk.setcuentacontablesForeignKeyActual(cuentacontablesForeignKey);
		//}


		if(cuentacontableTableCellFk!=null) {
			cuentacontableTableCellFk.RecargarCuentaContablesForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	

	public void setCombosCodigoDesdeBusquedaid_cuenta_contable (Long id) throws Exception {
		this.setActualCuentaContableForeignKey(id,true,"Todos");

	};
	
	public void jButtonActualizarTransaccionActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccionLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesTransaccion(false);
			
			//if(!this.isEsNuevoTransaccion) {								
				int intSelectedRow = this.jTableDatosTransaccion.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transaccion =(Transaccion) this.transaccionLogic.getTransaccions().toArray()[this.jTableDatosTransaccion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.transaccion =(Transaccion) this.transaccions.toArray()[this.jTableDatosTransaccion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(TransaccionJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualTransaccion(this.transaccion,true);
				this.setVariablesFormularioToObjetoActualForeignKeysTransaccion(this.transaccion);
				
			}
			
			if(this.permiteMantenimiento(this.transaccion)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.transaccionSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoTransaccion=true;
					this.inicializarActualizarBindingTablaTransaccion(false);
					this.isEsNuevoTransaccion=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoTransaccion=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoTransaccion=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTransaccion(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTransaccion(false);
				
				this.habilitarDeshabilitarControlesTransaccion(false);
			
												
				
				if(TransaccionJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleTransaccion();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoTransaccionActionPerformed(evt,transaccionSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualTransaccion(this.transaccion,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosTransaccion.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,transaccionSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccionLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.transaccion.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(Transaccion.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Transaccion.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccionLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TransaccionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccionLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarTransaccionActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccionLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosTransaccion.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccion =(Transaccion) this.transaccionLogic.getTransaccions().toArray()[this.jTableDatosTransaccion.convertRowIndexToModel(intSelectedRow)];
				this.transaccion.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.transaccion =(Transaccion) this.transaccions.toArray()[this.jTableDatosTransaccion.convertRowIndexToModel(intSelectedRow)];
				this.transaccion.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.transaccion)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.transaccionSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((TransaccionModel) this.jTableDatosTransaccion.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoTransaccion=true;
				this.inicializarActualizarBindingTablaTransaccion(false);
				this.isEsNuevoTransaccion=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTransaccion(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTransaccion(false);
				
				this.habilitarDeshabilitarControlesTransaccion(false);
				
				
				
				if(TransaccionJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleTransaccion();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccionLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TransaccionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccionLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarTransaccionActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosTransaccion.getRowCount()>=1) {
				jTableDatosTransaccion.removeRowSelectionInterval(0, jTableDatosTransaccion.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesTransaccion(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaTransaccion(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTransaccion(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTransaccion(false) ;
			
			this.isEsNuevoTransaccion=false;
			
			if(TransaccionJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleTransaccion();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransaccionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosTransaccionActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccionLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingTransaccion(false);
				
				//SI ES MANUAL
				if(TransaccionJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualTransaccion();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccionLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TransaccionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccionLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosTransaccionActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoTransaccion--;			
			//Transaccion transaccionAux= new Transaccion();			
			//transaccionAux.setId(this.iIdNuevoTransaccion);
			
			if(this.jInternalFrameDetalleFormTransaccion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaTransaccion();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysTransaccion(this.transaccion);
			
			this.transaccion.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.transaccionLogic.getTransaccions().add(this.transaccionAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.transaccions.add(this.transaccionAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaTransaccion(false);
			
			this.jTableDatosTransaccion.setRowSelectionInterval(this.getIndiceNuevoTransaccion(), this.getIndiceNuevoTransaccion());
			
			int iLastRow =  this.jTableDatosTransaccion.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosTransaccion.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosTransaccion.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaTransaccion(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TransaccionConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionTransaccionActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccionLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingTransaccion(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTransaccion(false);
			
			//SI ES MANUAL
			if(TransaccionJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTransaccion();
			}
			
			//this.abrirFrameTreeTransaccion();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccionLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccionLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TransaccionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccionLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionTransaccionActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE TransaccionES ?", "MANTENIMIENTO DE Transaccion", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionTransaccion.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralTransaccion();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.transaccionReturnGeneral=transaccionLogic.procesarImportacionTransaccionsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.transaccionParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarTransaccionReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransaccionConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionTransaccionActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionTransaccion.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionTransaccion.setFileImportacion(this.jInternalFrameImportacionTransaccion.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionTransaccion.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionTransaccion.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionTransaccion.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionTransaccion.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransaccionConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoTransaccionActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<Transaccion> transaccionsSeleccionados=new ArrayList<Transaccion>();		

		transaccionsSeleccionados=this.getTransaccionsSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTransaccion.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTransaccion.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("TransaccionBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"TransaccionBaseDesign.jrxml";
			
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
			
			this.generarReporteTransaccions("Todos",transaccionsSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.transaccionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Transaccion",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransaccionConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoTransaccion.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTransaccion.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TransaccionConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TransaccionConstantesFunciones.LABEL_IDSUCURSAL:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Sucursal_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Sucursal_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Sucursal_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Sucursal_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TransaccionConstantesFunciones.LABEL_CODIGO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TransaccionConstantesFunciones.LABEL_NOMBRE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbre_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbre_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbre_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbre_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TransaccionConstantesFunciones.LABEL_IDMODULO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Modulo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Modulo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Modulo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Modulo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TransaccionConstantesFunciones.LABEL_IDTIPOTRANSA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_TipoTransa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_TipoTransa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_TipoTransa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_TipoTransa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TransaccionConstantesFunciones.LABEL_IDTIPOCOMPROBANTE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_TipoComprobante_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_TipoComprobante_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_TipoComprobante_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_TipoComprobante_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TransaccionConstantesFunciones.LABEL_IDTIPOTRANSACCIONMODULO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_TipoTransaccionModulo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_TipoTransaccionModulo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_TipoTransaccionModulo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_TipoTransaccionModulo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TransaccionConstantesFunciones.LABEL_IDTIPORETENCION:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_TipoRetencion_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_TipoRetencion_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_TipoRetencion_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_TipoRetencion_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TransaccionConstantesFunciones.LABEL_IDCUENTACONTABLE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_CuentaContable_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_CuentaContable_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_CuentaContable_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_CuentaContable_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TransaccionConstantesFunciones.LABEL_DESCRIPCION:
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
		
		if(this.jInternalFrameReporteDinamicoTransaccion.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoTransaccion.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoTransaccion.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case TransaccionConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case TransaccionConstantesFunciones.LABEL_IDSUCURSAL:
					sNombreCampoCategoria="id_sucursal";
					break;

				case TransaccionConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoria="codigo";
					break;

				case TransaccionConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;

				case TransaccionConstantesFunciones.LABEL_IDMODULO:
					sNombreCampoCategoria="id_modulo";
					break;

				case TransaccionConstantesFunciones.LABEL_IDTIPOTRANSA:
					sNombreCampoCategoria="id_tipo_transa";
					break;

				case TransaccionConstantesFunciones.LABEL_IDTIPOCOMPROBANTE:
					sNombreCampoCategoria="id_tipo_comprobante";
					break;

				case TransaccionConstantesFunciones.LABEL_IDTIPOTRANSACCIONMODULO:
					sNombreCampoCategoria="id_tipo_transaccion_modulo";
					break;

				case TransaccionConstantesFunciones.LABEL_IDTIPORETENCION:
					sNombreCampoCategoria="id_tipo_retencion";
					break;

				case TransaccionConstantesFunciones.LABEL_IDCUENTACONTABLE:
					sNombreCampoCategoria="id_cuenta_contable";
					break;

				case TransaccionConstantesFunciones.LABEL_DESCRIPCION:
					sNombreCampoCategoria="descripcion";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoTransaccion.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case TransaccionConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case TransaccionConstantesFunciones.LABEL_IDSUCURSAL:
					sNombreCampoCategoriaValor="id_sucursal";
					break;

				case TransaccionConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoriaValor="codigo";
					break;

				case TransaccionConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;

				case TransaccionConstantesFunciones.LABEL_IDMODULO:
					sNombreCampoCategoriaValor="id_modulo";
					break;

				case TransaccionConstantesFunciones.LABEL_IDTIPOTRANSA:
					sNombreCampoCategoriaValor="id_tipo_transa";
					break;

				case TransaccionConstantesFunciones.LABEL_IDTIPOCOMPROBANTE:
					sNombreCampoCategoriaValor="id_tipo_comprobante";
					break;

				case TransaccionConstantesFunciones.LABEL_IDTIPOTRANSACCIONMODULO:
					sNombreCampoCategoriaValor="id_tipo_transaccion_modulo";
					break;

				case TransaccionConstantesFunciones.LABEL_IDTIPORETENCION:
					sNombreCampoCategoriaValor="id_tipo_retencion";
					break;

				case TransaccionConstantesFunciones.LABEL_IDCUENTACONTABLE:
					sNombreCampoCategoriaValor="id_cuenta_contable";
					break;

				case TransaccionConstantesFunciones.LABEL_DESCRIPCION:
					sNombreCampoCategoriaValor="descripcion";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoTransaccion.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTransaccion.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TransaccionConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case TransaccionConstantesFunciones.LABEL_IDSUCURSAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Sucursal",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_sucursal");
					break;

				case TransaccionConstantesFunciones.LABEL_CODIGO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo");
					break;

				case TransaccionConstantesFunciones.LABEL_NOMBRE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre");
					break;

				case TransaccionConstantesFunciones.LABEL_IDMODULO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Modulo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_modulo");
					break;

				case TransaccionConstantesFunciones.LABEL_IDTIPOTRANSA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Movimiento",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_tipo_transa");
					break;

				case TransaccionConstantesFunciones.LABEL_IDTIPOCOMPROBANTE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Tipo Compr.",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_tipo_comprobante");
					break;

				case TransaccionConstantesFunciones.LABEL_IDTIPOTRANSACCIONMODULO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Tipo Transaccion Modulo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_tipo_transaccion_modulo");
					break;

				case TransaccionConstantesFunciones.LABEL_IDTIPORETENCION:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Tipo Retencion",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_tipo_retencion");
					break;

				case TransaccionConstantesFunciones.LABEL_IDCUENTACONTABLE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Cuenta C.",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_cuenta_contable");
					break;

				case TransaccionConstantesFunciones.LABEL_DESCRIPCION:
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
	
	public void jButtonGenerarExcelReporteDinamicoTransaccionActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<Transaccion> transaccionsSeleccionados=new ArrayList<Transaccion>();		
		
		transaccionsSeleccionados=this.getTransaccionsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"transaccion";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("Transaccions");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoTransaccion.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoTransaccion.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case TransaccionConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TransaccionConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(Transaccion transaccion:transaccionsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(transaccion.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TransaccionConstantesFunciones.LABEL_IDSUCURSAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TransaccionConstantesFunciones.LABEL_IDSUCURSAL);
					iRow++;

					for(Transaccion transaccion:transaccionsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(transaccion.getsucursal_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TransaccionConstantesFunciones.LABEL_CODIGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TransaccionConstantesFunciones.LABEL_CODIGO);
					iRow++;

					for(Transaccion transaccion:transaccionsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(transaccion.getcodigo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TransaccionConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TransaccionConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(Transaccion transaccion:transaccionsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(transaccion.getnombre());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TransaccionConstantesFunciones.LABEL_IDMODULO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TransaccionConstantesFunciones.LABEL_IDMODULO);
					iRow++;

					for(Transaccion transaccion:transaccionsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(transaccion.getmodulo_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TransaccionConstantesFunciones.LABEL_IDTIPOTRANSA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TransaccionConstantesFunciones.LABEL_IDTIPOTRANSA);
					iRow++;

					for(Transaccion transaccion:transaccionsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(transaccion.gettipotransa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TransaccionConstantesFunciones.LABEL_IDTIPOCOMPROBANTE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TransaccionConstantesFunciones.LABEL_IDTIPOCOMPROBANTE);
					iRow++;

					for(Transaccion transaccion:transaccionsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(transaccion.gettipocomprobante_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TransaccionConstantesFunciones.LABEL_IDTIPOTRANSACCIONMODULO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TransaccionConstantesFunciones.LABEL_IDTIPOTRANSACCIONMODULO);
					iRow++;

					for(Transaccion transaccion:transaccionsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(transaccion.gettipotransaccionmodulo_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TransaccionConstantesFunciones.LABEL_IDTIPORETENCION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TransaccionConstantesFunciones.LABEL_IDTIPORETENCION);
					iRow++;

					for(Transaccion transaccion:transaccionsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(transaccion.gettiporetencion_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TransaccionConstantesFunciones.LABEL_IDCUENTACONTABLE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TransaccionConstantesFunciones.LABEL_IDCUENTACONTABLE);
					iRow++;

					for(Transaccion transaccion:transaccionsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(transaccion.getcuentacontable_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TransaccionConstantesFunciones.LABEL_DESCRIPCION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TransaccionConstantesFunciones.LABEL_DESCRIPCION);
					iRow++;

					for(Transaccion transaccion:transaccionsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(transaccion.getdescripcion());
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
			//	this.getFilaCabeceraExportarExcelTransaccion(row);				
			//	iRow++;
			//}				
			
			//for(Transaccion transaccionAux:transaccionsSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelTransaccion(transaccionAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.transaccionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Transaccion",JOptionPane.INFORMATION_MESSAGE);
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
				this.transaccionLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTransaccion(false);
			
			//SI ES MANUAL
			if(TransaccionJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTransaccion();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccionLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccionLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccionLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresTransaccionActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccionLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTransaccion(false);
			
			//SI ES MANUAL
			if(TransaccionJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTransaccion();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccionLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccionLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TransaccionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccionLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesTransaccionActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccionLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTransaccion(false);
			
			//SI ES MANUAL
			if(TransaccionJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTransaccion();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccionLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccionLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TransaccionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccionLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaTransaccion() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosTransaccion.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosTransaccion.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosTransaccion.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosTransaccion.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosTransaccion.setMinimumSize(dimensionMinimum);
		this.jTableDatosTransaccion.setMaximumSize(dimensionMaximum);
		this.jTableDatosTransaccion.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingTransaccion(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingTransaccion(esInicializar,true);
	}
	
	public void inicializarActualizarBindingTransaccion(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaTransaccion(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesTransaccion(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.transaccionSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasTransaccion(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTransaccion(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesTransaccion(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !TransaccionJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!TransaccionJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualTransaccion() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaTransaccion();
		
		this.inicializarActualizarBindingBotonesManualTransaccion(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.transaccionSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualTransaccion();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTransaccion() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualTransaccion(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualTransaccion(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosTransaccion.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosTransaccion.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteTransaccion.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormTransaccion!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormTransaccion.jCheckBoxPostAccionNuevoTransaccion.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormTransaccion.jCheckBoxPostAccionSinCerrarTransaccion.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormTransaccion.jCheckBoxPostAccionSinMensajeTransaccion.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosTransaccion.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosTransaccion.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteTransaccion.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormTransaccion!=null) {
				this.jInternalFrameDetalleFormTransaccion.jCheckBoxPostAccionNuevoTransaccion.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormTransaccion.jCheckBoxPostAccionSinCerrarTransaccion.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormTransaccion.jCheckBoxPostAccionSinMensajeTransaccion.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionTransaccion.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionTransaccion.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormTransaccion!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormTransaccion.jComboBoxTiposAccionesFormularioTransaccion.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesTransaccion.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoTransaccion!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTransaccion.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesTransaccion.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesTransaccion.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarTransaccion.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesTransaccion.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoTransaccion!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTransaccion.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesTransaccion.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralTransaccion.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesTransaccion(Boolean esInicializar) throws Exception {
		try	{	
			if(TransaccionJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualTransaccion(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesTransaccion() throws Exception {
		try	{
			if(TransaccionJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualTransaccion();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTransaccion() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormTransaccion.jComboBoxTiposAccionesFormularioTransaccion.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormTransaccion.jComboBoxTiposAccionesFormularioTransaccion.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualTransaccion() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesTransaccion.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesTransaccion.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesTransaccion.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesTransaccion.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesTransaccion.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesTransaccion.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionTransaccion.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionTransaccion.addItem(reporte);
			}
			
			
			if(!this.transaccionSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionTransaccion.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionTransaccion.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesTransaccion.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesTransaccion.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesTransaccion.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesTransaccion.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormTransaccion!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormTransaccion.jComboBoxTiposAccionesFormularioTransaccion.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormTransaccion.jComboBoxTiposAccionesFormularioTransaccion.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarTransaccion.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarTransaccion.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarTransaccion.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTransaccion();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTransaccion() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTransaccion!=null) {
				this.jInternalFrameReporteDinamicoTransaccion.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoTransaccion.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTransaccion!=null) {
				this.jInternalFrameReporteDinamicoTransaccion.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoTransaccion.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoTransaccion!=null) {
				
				if(this.jInternalFrameReporteDinamicoTransaccion.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTransaccion.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTransaccion.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoTransaccion.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTransaccion.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTransaccion.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualTransaccion()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		this.codigoBusquedaPorCodigo=this.jTextFieldcodigoBusquedaPorCodigoTransaccion.getText();
		if(this.jComboBoxid_moduloBusquedaPorIdModuloPorTipoTransaccionTransaccion.getSelectedItem()!=null){this.id_moduloBusquedaPorIdModuloPorTipoTransaccion=((Modulo)this.jComboBoxid_moduloBusquedaPorIdModuloPorTipoTransaccionTransaccion.getSelectedItem()).getId();}
		if(this.jComboBoxid_tipo_transaccion_moduloBusquedaPorIdModuloPorTipoTransaccionTransaccion.getSelectedItem()!=null){this.id_tipo_transaccion_moduloBusquedaPorIdModuloPorTipoTransaccion=((TipoTransaccionModulo)this.jComboBoxid_tipo_transaccion_moduloBusquedaPorIdModuloPorTipoTransaccionTransaccion.getSelectedItem()).getId();}
		this.nombreBusquedaPorNombre=this.jTextAreanombreBusquedaPorNombreTransaccion.getText();
		if(this.jComboBoxid_cuenta_contableFK_IdCuentaContableTransaccion.getSelectedItem()!=null){this.id_cuenta_contableFK_IdCuentaContable=((CuentaContable)this.jComboBoxid_cuenta_contableFK_IdCuentaContableTransaccion.getSelectedItem()).getId();}
		if(this.jComboBoxid_tipo_comprobanteFK_IdTipoComprobanteTransaccion.getSelectedItem()!=null){this.id_tipo_comprobanteFK_IdTipoComprobante=((TipoComprobante)this.jComboBoxid_tipo_comprobanteFK_IdTipoComprobanteTransaccion.getSelectedItem()).getId();}
		if(this.jComboBoxid_tipo_retencionFK_IdTipoRetencionTransaccion.getSelectedItem()!=null){this.id_tipo_retencionFK_IdTipoRetencion=((TipoRetencion)this.jComboBoxid_tipo_retencionFK_IdTipoRetencionTransaccion.getSelectedItem()).getId();}
		if(this.jComboBoxid_tipo_transaFK_IdTipoTransaTransaccion.getSelectedItem()!=null){this.id_tipo_transaFK_IdTipoTransa=((TipoTransa)this.jComboBoxid_tipo_transaFK_IdTipoTransaTransaccion.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasTransaccion(Boolean esInicializar) throws Exception {				
		if(TransaccionJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualTransaccion();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaTransaccion() throws Exception {
		this.inicializarActualizarBindingTablaTransaccion(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByTransaccion() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByTransaccion.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByTransaccion.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTransaccion.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new TransaccionPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByTransaccion.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTransaccion.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new TransaccionPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosTransaccionOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTransaccionOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new TransaccionPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByTransaccion.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTransaccion.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new TransaccionPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByTransaccion.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaTransaccion(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=transaccionLogic.getTransaccions().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=transaccions.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(TransaccionJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosTransaccion.setModel(new TransaccionModel(this.transaccionLogic.getTransaccions(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosTransaccion.setModel(new TransaccionModel(this.transaccions,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByTransaccion!=null && this.jInternalFrameOrderByTransaccion.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByTransaccion();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosTransaccion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTransaccion,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new TransaccionPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+TransaccionConstantesFunciones.SCLASSWEBTITULO,transaccionConstantesFunciones.resaltarSeleccionarTransaccion,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+TransaccionConstantesFunciones.SCLASSWEBTITULO,transaccionConstantesFunciones.resaltarSeleccionarTransaccion,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosTransaccion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTransaccion,TransaccionConstantesFunciones.LABEL_ID));

		if(this.transaccionConstantesFunciones.mostraridTransaccion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TransaccionConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.transaccionConstantesFunciones.resaltaridTransaccion,this.transaccionConstantesFunciones.activaridTransaccion,this,true,"idTransaccion","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.transaccionConstantesFunciones.resaltaridTransaccion,this.transaccionConstantesFunciones.activaridTransaccion,this,true,"idTransaccion","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTransaccion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTransaccion,TransaccionConstantesFunciones.LABEL_IDEMPRESA));

		if(this.transaccionConstantesFunciones.mostrarid_empresaTransaccion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TransaccionConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.transaccionConstantesFunciones.resaltarid_empresaTransaccion,this,this.transaccionConstantesFunciones.activarid_empresaTransaccion));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.transaccionConstantesFunciones.resaltarid_empresaTransaccion,this,this.transaccionConstantesFunciones.activarid_empresaTransaccion,false,"id_empresaTransaccion","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TransaccionPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTransaccion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTransaccion,TransaccionConstantesFunciones.LABEL_IDSUCURSAL));

		if(this.transaccionConstantesFunciones.mostrarid_sucursalTransaccion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TransaccionConstantesFunciones.LABEL_IDSUCURSAL,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new SucursalTableCell(this.sucursalsForeignKey,this.transaccionConstantesFunciones.resaltarid_sucursalTransaccion,this,this.transaccionConstantesFunciones.activarid_sucursalTransaccion));
			tableColumn.setCellEditor(new SucursalTableCell(this.sucursalsForeignKey,this.transaccionConstantesFunciones.resaltarid_sucursalTransaccion,this,this.transaccionConstantesFunciones.activarid_sucursalTransaccion,false,"id_sucursalTransaccion","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TransaccionPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTransaccion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTransaccion,TransaccionConstantesFunciones.LABEL_CODIGO));

		if(this.transaccionConstantesFunciones.mostrarcodigoTransaccion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TransaccionConstantesFunciones.LABEL_CODIGO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.transaccionConstantesFunciones.resaltarcodigoTransaccion,this.transaccionConstantesFunciones.activarcodigoTransaccion,this,true,"codigoTransaccion","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.transaccionConstantesFunciones.resaltarcodigoTransaccion,this.transaccionConstantesFunciones.activarcodigoTransaccion,this,true,"codigoTransaccion","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TransaccionPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTransaccion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTransaccion,TransaccionConstantesFunciones.LABEL_NOMBRE));

		if(this.transaccionConstantesFunciones.mostrarnombreTransaccion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TransaccionConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.transaccionConstantesFunciones.resaltarnombreTransaccion,this.transaccionConstantesFunciones.activarnombreTransaccion,this,true,"nombreTransaccion","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.transaccionConstantesFunciones.resaltarnombreTransaccion,this.transaccionConstantesFunciones.activarnombreTransaccion,this,true,"nombreTransaccion","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100);
			//tableColumn.addPropertyChangeListener(new TransaccionPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTransaccion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTransaccion,TransaccionConstantesFunciones.LABEL_IDMODULO));

		if(this.transaccionConstantesFunciones.mostrarid_moduloTransaccion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TransaccionConstantesFunciones.LABEL_IDMODULO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new ModuloTableCell(this.modulosForeignKey,this.transaccionConstantesFunciones.resaltarid_moduloTransaccion,this,this.transaccionConstantesFunciones.activarid_moduloTransaccion));
			tableColumn.setCellEditor(new ModuloTableCell(this.modulosForeignKey,this.transaccionConstantesFunciones.resaltarid_moduloTransaccion,this,this.transaccionConstantesFunciones.activarid_moduloTransaccion,false,"id_moduloTransaccion","GLOBAL-CON_EVENT_CHANGE"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50);
			//tableColumn.addPropertyChangeListener(new TransaccionPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTransaccion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTransaccion,TransaccionConstantesFunciones.LABEL_IDTIPOTRANSA));

		if(this.transaccionConstantesFunciones.mostrarid_tipo_transaTransaccion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TransaccionConstantesFunciones.LABEL_IDTIPOTRANSA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new TipoTransaTableCell(this.tipotransasForeignKey,this.transaccionConstantesFunciones.resaltarid_tipo_transaTransaccion,this,this.transaccionConstantesFunciones.activarid_tipo_transaTransaccion));
			tableColumn.setCellEditor(new TipoTransaTableCell(this.tipotransasForeignKey,this.transaccionConstantesFunciones.resaltarid_tipo_transaTransaccion,this,this.transaccionConstantesFunciones.activarid_tipo_transaTransaccion,true,"id_tipo_transaTransaccion","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50);
			//tableColumn.addPropertyChangeListener(new TransaccionPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTransaccion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTransaccion,TransaccionConstantesFunciones.LABEL_IDTIPOCOMPROBANTE));

		if(this.transaccionConstantesFunciones.mostrarid_tipo_comprobanteTransaccion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TransaccionConstantesFunciones.LABEL_IDTIPOCOMPROBANTE,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new TipoComprobanteTableCell(this.tipocomprobantesForeignKey,this.transaccionConstantesFunciones.resaltarid_tipo_comprobanteTransaccion,this,this.transaccionConstantesFunciones.activarid_tipo_comprobanteTransaccion));
			tableColumn.setCellEditor(new TipoComprobanteTableCell(this.tipocomprobantesForeignKey,this.transaccionConstantesFunciones.resaltarid_tipo_comprobanteTransaccion,this,this.transaccionConstantesFunciones.activarid_tipo_comprobanteTransaccion,true,"id_tipo_comprobanteTransaccion","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50);
			//tableColumn.addPropertyChangeListener(new TransaccionPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTransaccion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTransaccion,TransaccionConstantesFunciones.LABEL_IDTIPORETENCION));

		if(this.transaccionConstantesFunciones.mostrarid_tipo_retencionTransaccion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TransaccionConstantesFunciones.LABEL_IDTIPORETENCION,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new TipoRetencionTableCell(this.tiporetencionsForeignKey,this.transaccionConstantesFunciones.resaltarid_tipo_retencionTransaccion,this,this.transaccionConstantesFunciones.activarid_tipo_retencionTransaccion));
			tableColumn.setCellEditor(new TipoRetencionTableCell(this.tiporetencionsForeignKey,this.transaccionConstantesFunciones.resaltarid_tipo_retencionTransaccion,this,this.transaccionConstantesFunciones.activarid_tipo_retencionTransaccion,true,"id_tipo_retencionTransaccion","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TransaccionPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTransaccion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTransaccion,TransaccionConstantesFunciones.LABEL_IDCUENTACONTABLE));

		if(this.transaccionConstantesFunciones.mostrarid_cuenta_contableTransaccion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TransaccionConstantesFunciones.LABEL_IDCUENTACONTABLE,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new CuentaContableTableCell(this.cuentacontablesForeignKey,this.transaccionConstantesFunciones.resaltarid_cuenta_contableTransaccion,this,this.transaccionConstantesFunciones.activarid_cuenta_contableTransaccion));
			tableColumn.setCellEditor(new CuentaContableTableCell(this.cuentacontablesForeignKey,this.transaccionConstantesFunciones.resaltarid_cuenta_contableTransaccion,this,this.transaccionConstantesFunciones.activarid_cuenta_contableTransaccion,true,"id_cuenta_contableTransaccion","CON_BUSQUEDA"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70);
			//tableColumn.addPropertyChangeListener(new TransaccionPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTransaccion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTransaccion,TransaccionConstantesFunciones.LABEL_DESCRIPCION));

		if(this.transaccionConstantesFunciones.mostrardescripcionTransaccion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TransaccionConstantesFunciones.LABEL_DESCRIPCION,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.transaccionConstantesFunciones.resaltardescripcionTransaccion,this.transaccionConstantesFunciones.activardescripcionTransaccion,this,true,"descripcionTransaccion","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.transaccionConstantesFunciones.resaltardescripcionTransaccion,this.transaccionConstantesFunciones.activardescripcionTransaccion,this,true,"descripcionTransaccion","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TransaccionPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.transaccionSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.transaccionSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.transaccionSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTransaccion.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.transaccionSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.transaccionSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTransaccion.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarTransaccion && this.isPermisoGuardarCambiosTransaccion) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.transaccionSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.transaccionSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosTransaccion.addColumn(tableColumn);
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
			
			this.jTableDatosTransaccion.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTransaccion && this.isPermisoGuardarCambiosTransaccion) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTransaccion && this.isPermisoGuardarCambiosTransaccion) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosTransaccion.moveColumn(this.jTableDatosTransaccion.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosTransaccion.moveColumn(this.jTableDatosTransaccion.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosTransaccion.moveColumn(this.jTableDatosTransaccion.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosTransaccion.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosTransaccion.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosTransaccion,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!TransaccionJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosTransaccion.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosTransaccion.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!TransaccionJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!TransaccionJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosTransaccion.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosTransaccion.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosTransaccion.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=transaccionLogic.getTransaccions().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=transaccions.size()-1;
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
		//this.jTableDatosTransaccion.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosTransaccion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosTransaccion();
			
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
				
				//this.isEsNuevoTransaccion=false;
					
				TransaccionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.transaccion,new Object(),this.transaccionParameterGeneral,this.transaccionReturnGeneral);
			
				if(this.transaccionSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormTransaccion==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTransaccion.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTransaccion.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transaccion =(Transaccion) this.transaccionLogic.getTransaccions().toArray()[this.jTableDatosTransaccion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.transaccion =(Transaccion) this.transaccions.toArray()[this.jTableDatosTransaccion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.transaccion.getsType().equals("DUPLICADO")
				   || this.transaccion.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoTransaccion=true;
				
				} else {
					this.isEsNuevoTransaccion=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.transaccionSessionBean.getEsGuardarRelacionado()) {
					if(this.transaccion.getId()>=0 && !this.transaccion.getIsNew()) {						
						this.isEsNuevoTransaccion=false;
						
					} else {
						this.isEsNuevoTransaccion=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoTransaccion(esRelaciones);						
				
				this.seleccionarTransaccion(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.transaccion.getId()<0) {
					this.isEsNuevoTransaccion=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarTransaccion(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarTransaccion(evt,rowIndex);
				}	
				
				if(this.transaccionSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion Transaccion: " + this.dDif); 
					}
				}								
				
				TransaccionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.transaccion,new Object(),this.transaccionParameterGeneral,this.transaccionReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarTransaccion(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.transaccion)) {
					if(this.transaccion.getId()>0) {
						this.transaccion.setIsDeleted(true);
						
						this.transaccionsEliminados.add(this.transaccion);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.transaccionLogic.getTransaccions().remove(this.transaccion);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.transaccions.remove(this.transaccion);				
					}
					
					
					((TransaccionModel) this.jTableDatosTransaccion.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaTransaccion(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,TransaccionConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarTransaccion(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoTransaccion) {
			
			if(this.jInternalFrameDetalleFormTransaccion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTransaccion.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTransaccion.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transaccion =(Transaccion) this.transaccionLogic.getTransaccions().toArray()[this.jTableDatosTransaccion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.transaccion =(Transaccion) this.transaccions.toArray()[this.jTableDatosTransaccion.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(TransaccionJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioTransaccion(this.transaccion);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.transaccionConstantesFunciones.cargarid_empresaTransaccion || this.transaccionConstantesFunciones.event_dependid_empresaTransaccion) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.transaccion.getid_empresa());
									//this.inicializarActualizarBindingTransaccion(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(transaccion.getEmpresa()!=null) {
							this.empresasForeignKey.add(transaccion.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.transaccion.getid_empresa(),false,"Formulario");

					//Sucursal
					if(!this.transaccionConstantesFunciones.cargarid_sucursalTransaccion || this.transaccionConstantesFunciones.event_dependid_sucursalTransaccion) {
						//this.cargarCombosSucursalsForeignKeyLista(" where id="+this.transaccion.getid_sucursal());
									//this.inicializarActualizarBindingTransaccion(false,false);
						this.sucursalsForeignKey=new ArrayList<Sucursal>();

						if(transaccion.getSucursal()!=null) {
							this.sucursalsForeignKey.add(transaccion.getSucursal());
						}

						this.addItemDefectoCombosForeignKeySucursal();
						this.cargarCombosFrameSucursalsForeignKey("Todos");
					}
					this.setActualSucursalForeignKey(this.transaccion.getid_sucursal(),false,"Formulario");

					//Modulo
					if(!this.transaccionConstantesFunciones.cargarid_moduloTransaccion || this.transaccionConstantesFunciones.event_dependid_moduloTransaccion) {
						//this.cargarCombosModulosForeignKeyLista(" where id="+this.transaccion.getid_modulo());
									//this.inicializarActualizarBindingTransaccion(false,false);
						this.modulosForeignKey=new ArrayList<Modulo>();

						if(transaccion.getModulo()!=null) {
							this.modulosForeignKey.add(transaccion.getModulo());
						}

						this.addItemDefectoCombosForeignKeyModulo();
						this.cargarCombosFrameModulosForeignKey("Todos");
					}
					this.setActualModuloForeignKey(this.transaccion.getid_modulo(),false,"Formulario");

					//TipoTransa
					if(!this.transaccionConstantesFunciones.cargarid_tipo_transaTransaccion || this.transaccionConstantesFunciones.event_dependid_tipo_transaTransaccion) {
						//this.cargarCombosTipoTransasForeignKeyLista(" where id="+this.transaccion.getid_tipo_transa());
									//this.inicializarActualizarBindingTransaccion(false,false);
						this.tipotransasForeignKey=new ArrayList<TipoTransa>();

						if(transaccion.getTipoTransa()!=null) {
							this.tipotransasForeignKey.add(transaccion.getTipoTransa());
						}

						this.addItemDefectoCombosForeignKeyTipoTransa();
						this.cargarCombosFrameTipoTransasForeignKey("Todos");
					}
					this.setActualTipoTransaForeignKey(this.transaccion.getid_tipo_transa(),false,"Formulario");

					//TipoComprobante
					if(!this.transaccionConstantesFunciones.cargarid_tipo_comprobanteTransaccion || this.transaccionConstantesFunciones.event_dependid_tipo_comprobanteTransaccion) {
						//this.cargarCombosTipoComprobantesForeignKeyLista(" where id="+this.transaccion.getid_tipo_comprobante());
									//this.inicializarActualizarBindingTransaccion(false,false);
						this.tipocomprobantesForeignKey=new ArrayList<TipoComprobante>();

						if(transaccion.getTipoComprobante()!=null) {
							this.tipocomprobantesForeignKey.add(transaccion.getTipoComprobante());
						}

						this.addItemDefectoCombosForeignKeyTipoComprobante();
						this.cargarCombosFrameTipoComprobantesForeignKey("Todos");
					}
					this.setActualTipoComprobanteForeignKey(this.transaccion.getid_tipo_comprobante(),false,"Formulario");

					//TipoTransaccionModulo
					if(!this.transaccionConstantesFunciones.cargarid_tipo_transaccion_moduloTransaccion || this.transaccionConstantesFunciones.event_dependid_tipo_transaccion_moduloTransaccion) {
						//this.cargarCombosTipoTransaccionModulosForeignKeyLista(" where id="+this.transaccion.getid_tipo_transaccion_modulo());
									//this.inicializarActualizarBindingTransaccion(false,false);
						this.tipotransaccionmodulosForeignKey=new ArrayList<TipoTransaccionModulo>();

						if(transaccion.getTipoTransaccionModulo()!=null) {
							this.tipotransaccionmodulosForeignKey.add(transaccion.getTipoTransaccionModulo());
						}

						this.addItemDefectoCombosForeignKeyTipoTransaccionModulo();
						this.cargarCombosFrameTipoTransaccionModulosForeignKey("Todos");
					}
					this.setActualTipoTransaccionModuloForeignKey(this.transaccion.getid_tipo_transaccion_modulo(),false,"Formulario");

					//TipoRetencion
					if(!this.transaccionConstantesFunciones.cargarid_tipo_retencionTransaccion || this.transaccionConstantesFunciones.event_dependid_tipo_retencionTransaccion) {
						//this.cargarCombosTipoRetencionsForeignKeyLista(" where id="+this.transaccion.getid_tipo_retencion());
									//this.inicializarActualizarBindingTransaccion(false,false);
						this.tiporetencionsForeignKey=new ArrayList<TipoRetencion>();

						if(transaccion.getTipoRetencion()!=null) {
							this.tiporetencionsForeignKey.add(transaccion.getTipoRetencion());
						}

						this.addItemDefectoCombosForeignKeyTipoRetencion();
						this.cargarCombosFrameTipoRetencionsForeignKey("Todos");
					}
					this.setActualTipoRetencionForeignKey(this.transaccion.getid_tipo_retencion(),false,"Formulario");

					//CuentaContable
					if(!this.transaccionConstantesFunciones.cargarid_cuenta_contableTransaccion || this.transaccionConstantesFunciones.event_dependid_cuenta_contableTransaccion) {
						//this.cargarCombosCuentaContablesForeignKeyLista(" where id="+this.transaccion.getid_cuenta_contable());
									//this.inicializarActualizarBindingTransaccion(false,false);
						this.cuentacontablesForeignKey=new ArrayList<CuentaContable>();

						if(transaccion.getCuentaContable()!=null) {
							this.cuentacontablesForeignKey.add(transaccion.getCuentaContable());
						}

						this.addItemDefectoCombosForeignKeyCuentaContable();
						this.cargarCombosFrameCuentaContablesForeignKey("Todos");
					}
					this.setActualCuentaContableForeignKey(this.transaccion.getid_cuenta_contable(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesTransaccion("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesTransaccion(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTransaccion() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransaccionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoTransaccion(Transaccion transaccion) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoTransaccion(transaccion,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoTransaccion(Transaccion transaccion,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioTransaccion(transaccion);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyTransaccion(transaccion,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyTransaccion(transaccion);
	}
	
	public void setVariablesObjetoActualToFormularioTransaccion(Transaccion transaccion) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormTransaccion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormTransaccion.jLabelidTransaccion.setText(transaccion.getId().toString());
			this.jInternalFrameDetalleFormTransaccion.jTextFieldcodigoTransaccion.setText(transaccion.getcodigo());
			this.jInternalFrameDetalleFormTransaccion.jTextAreanombreTransaccion.setText(transaccion.getnombre());
			this.jInternalFrameDetalleFormTransaccion.jTextAreadescripcionTransaccion.setText(transaccion.getdescripcion());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TransaccionConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,Transaccion transaccionLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,transaccionLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,Transaccion transaccionLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				transaccionLocal=this.transaccion;
			} else {
				transaccionLocal=this.transaccionAnterior;
			}
		}
		
		if(this.permiteMantenimiento(transaccionLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoTransaccion(transaccionLocal,true);
					
					if(transaccionSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(transaccionLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.transaccionSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(transaccionLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoTransaccion(Transaccion transaccion,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTransaccion(transaccion,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysTransaccion(transaccion);
	}
	
	public void setVariablesFormularioToObjetoActualTransaccion(Transaccion transaccion,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTransaccion(transaccion,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualTransaccion(Transaccion transaccion,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormTransaccion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormTransaccion.jLabelidTransaccion.getText()==null || this.jInternalFrameDetalleFormTransaccion.jLabelidTransaccion.getText()=="" || this.jInternalFrameDetalleFormTransaccion.jLabelidTransaccion.getText()=="Id") {
				this.jInternalFrameDetalleFormTransaccion.jLabelidTransaccion.setText("0");
			}

			if(conColumnasBase) {transaccion.setId(Long.parseLong(this.jInternalFrameDetalleFormTransaccion.jLabelidTransaccion.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TransaccionConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTransaccion.jLabelIdTransaccion,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			transaccion.setcodigo(this.jInternalFrameDetalleFormTransaccion.jTextFieldcodigoTransaccion.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TransaccionConstantesFunciones.LABEL_CODIGO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTransaccion.jLabelcodigoTransaccion,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			transaccion.setnombre(this.jInternalFrameDetalleFormTransaccion.jTextAreanombreTransaccion.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TransaccionConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTransaccion.jLabelnombreTransaccion,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			transaccion.setdescripcion(this.jInternalFrameDetalleFormTransaccion.jTextAreadescripcionTransaccion.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TransaccionConstantesFunciones.LABEL_DESCRIPCION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTransaccion.jLabeldescripcionTransaccion,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TransaccionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTransaccion(Transaccion transaccionBean,Transaccion transaccion,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conDefault || (!conDefault && transaccionBean.getid_tipo_transa()!=null && !transaccionBean.getid_tipo_transa().equals(-1L))) {transaccion.setid_tipo_transa(transaccionBean.getid_tipo_transa());}
			if(conDefault || (!conDefault && transaccionBean.getid_tipo_comprobante()!=null && !transaccionBean.getid_tipo_comprobante().equals(null))) {transaccion.setid_tipo_comprobante(transaccionBean.getid_tipo_comprobante());}
			if(conDefault || (!conDefault && transaccionBean.getid_tipo_retencion()!=null && !transaccionBean.getid_tipo_retencion().equals(-1L))) {transaccion.setid_tipo_retencion(transaccionBean.getid_tipo_retencion());}
			if(conDefault || (!conDefault && transaccionBean.getid_cuenta_contable()!=null && !transaccionBean.getid_cuenta_contable().equals(null))) {transaccion.setid_cuenta_contable(transaccionBean.getid_cuenta_contable());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TransaccionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosTransaccion(Transaccion transaccionOrigen,Transaccion transaccion,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && transaccionOrigen.getId()!=null && !transaccionOrigen.getId().equals(0L))) {transaccion.setId(transaccionOrigen.getId());}}
			if(conDefault || (!conDefault && transaccionOrigen.getcodigo()!=null && !transaccionOrigen.getcodigo().equals(""))) {transaccion.setcodigo(transaccionOrigen.getcodigo());}
			if(conDefault || (!conDefault && transaccionOrigen.getnombre()!=null && !transaccionOrigen.getnombre().equals(""))) {transaccion.setnombre(transaccionOrigen.getnombre());}
			if(conDefault || (!conDefault && transaccionOrigen.getid_tipo_transa()!=null && !transaccionOrigen.getid_tipo_transa().equals(-1L))) {transaccion.setid_tipo_transa(transaccionOrigen.getid_tipo_transa());}
			if(conDefault || (!conDefault && transaccionOrigen.getid_tipo_comprobante()!=null && !transaccionOrigen.getid_tipo_comprobante().equals(null))) {transaccion.setid_tipo_comprobante(transaccionOrigen.getid_tipo_comprobante());}
			if(conDefault || (!conDefault && transaccionOrigen.getid_tipo_transaccion_modulo()!=null && !transaccionOrigen.getid_tipo_transaccion_modulo().equals(null))) {transaccion.setid_tipo_transaccion_modulo(transaccionOrigen.getid_tipo_transaccion_modulo());}
			if(conDefault || (!conDefault && transaccionOrigen.getid_tipo_retencion()!=null && !transaccionOrigen.getid_tipo_retencion().equals(-1L))) {transaccion.setid_tipo_retencion(transaccionOrigen.getid_tipo_retencion());}
			if(conDefault || (!conDefault && transaccionOrigen.getid_cuenta_contable()!=null && !transaccionOrigen.getid_cuenta_contable().equals(null))) {transaccion.setid_cuenta_contable(transaccionOrigen.getid_cuenta_contable());}
			if(conDefault || (!conDefault && transaccionOrigen.getdescripcion()!=null && !transaccionOrigen.getdescripcion().equals(""))) {transaccion.setdescripcion(transaccionOrigen.getdescripcion());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TransaccionConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTransaccion(Transaccion transaccion) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTransaccion.jLabelidTransaccion.setText(transaccion.getId().toString());
			this.jInternalFrameDetalleFormTransaccion.jTextFieldcodigoTransaccion.setText(transaccion.getcodigo());
			this.jInternalFrameDetalleFormTransaccion.jTextAreanombreTransaccion.setText(transaccion.getnombre());
			this.jInternalFrameDetalleFormTransaccion.jTextAreadescripcionTransaccion.setText(transaccion.getdescripcion());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransaccionConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTransaccion(TransaccionBean transaccionBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTransaccion.jLabelidTransaccion.setText(transaccionBean.getId().toString());
			this.jInternalFrameDetalleFormTransaccion.jTextFieldcodigoTransaccion.setText(transaccionBean.getcodigo());
			this.jInternalFrameDetalleFormTransaccion.jTextAreanombreTransaccion.setText(transaccionBean.getnombre());
			this.jInternalFrameDetalleFormTransaccion.jTextAreadescripcionTransaccion.setText(transaccionBean.getdescripcion());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransaccionConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanTransaccion(TransaccionParameterReturnGeneral transaccionReturnGeneral,TransaccionBean transaccionBean,Boolean conDefault) throws Exception { 
		try {
			Transaccion transaccionLocal=new Transaccion();
			
			transaccionLocal=transaccionReturnGeneral.getTransaccion();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && transaccionLocal.getId()!=null && !transaccionLocal.getId().equals(0L))) {transaccionBean.setId(transaccionLocal.getId());}}
			if(conDefault || (!conDefault && transaccionLocal.getcodigo()!=null && !transaccionLocal.getcodigo().equals(""))) {transaccionBean.setcodigo(transaccionLocal.getcodigo());}
			if(conDefault || (!conDefault && transaccionLocal.getnombre()!=null && !transaccionLocal.getnombre().equals(""))) {transaccionBean.setnombre(transaccionLocal.getnombre());}
			if(conDefault || (!conDefault && transaccionLocal.getid_tipo_transa()!=null && !transaccionLocal.getid_tipo_transa().equals(-1L))) {transaccionBean.setid_tipo_transa(transaccionLocal.getid_tipo_transa());}
			if(conDefault || (!conDefault && transaccionLocal.getid_tipo_comprobante()!=null && !transaccionLocal.getid_tipo_comprobante().equals(null))) {transaccionBean.setid_tipo_comprobante(transaccionLocal.getid_tipo_comprobante());}
			if(conDefault || (!conDefault && transaccionLocal.getid_tipo_retencion()!=null && !transaccionLocal.getid_tipo_retencion().equals(-1L))) {transaccionBean.setid_tipo_retencion(transaccionLocal.getid_tipo_retencion());}
			if(conDefault || (!conDefault && transaccionLocal.getid_cuenta_contable()!=null && !transaccionLocal.getid_cuenta_contable().equals(null))) {transaccionBean.setid_cuenta_contable(transaccionLocal.getid_cuenta_contable());}
			if(conDefault || (!conDefault && transaccionLocal.getdescripcion()!=null && !transaccionLocal.getdescripcion().equals(""))) {transaccionBean.setdescripcion(transaccionLocal.getdescripcion());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransaccionConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxTransaccionGenerico(Long idTransaccionSeleccionado,JComboBox jComboBoxTransaccion,List<Transaccion> transaccionsLocal)throws Exception {
		try {
			Transaccion  transaccionTemp=null;

			for(Transaccion transaccionAux:transaccionsLocal) {
				if(transaccionAux.getId()!=null && transaccionAux.getId().equals(idTransaccionSeleccionado)) {
					transaccionTemp=transaccionAux;
					break;
				}
			}

			jComboBoxTransaccion.setSelectedItem(transaccionTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxTransaccionGenerico(JComboBox jComboBoxTransaccion,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxTransaccion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTransaccion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxTransaccion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTransaccion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTransaccion.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxTransaccion.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTransaccion.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxTransaccion.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxTransaccion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxTransaccion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,TransaccionConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			transaccion=(Transaccion) transaccionLogic.getTransaccions().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			transaccion =(Transaccion) transaccions.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!transaccion.getIsNew() && !transaccion.getIsChanged() && !transaccion.getIsDeleted()) {
				sDescripcion=transaccion.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=transaccion.getempresa_descripcion();
			}
		}

		if(sTipo.equals("Sucursal")) {
			//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
			if(!transaccion.getIsNew() && !transaccion.getIsChanged() && !transaccion.getIsDeleted()) {
				sDescripcion=transaccion.getsucursal_descripcion();
			} else {
				//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
				sDescripcion=transaccion.getsucursal_descripcion();
			}
		}

		if(sTipo.equals("Modulo")) {
			//sDescripcion=this.getActualModuloForeignKeyDescripcion((Long)value);
			if(!transaccion.getIsNew() && !transaccion.getIsChanged() && !transaccion.getIsDeleted()) {
				sDescripcion=transaccion.getmodulo_descripcion();
			} else {
				//sDescripcion=this.getActualModuloForeignKeyDescripcion((Long)value);
				sDescripcion=transaccion.getmodulo_descripcion();
			}
		}

		if(sTipo.equals("TipoTransa")) {
			//sDescripcion=this.getActualTipoTransaForeignKeyDescripcion((Long)value);
			if(!transaccion.getIsNew() && !transaccion.getIsChanged() && !transaccion.getIsDeleted()) {
				sDescripcion=transaccion.gettipotransa_descripcion();
			} else {
				//sDescripcion=this.getActualTipoTransaForeignKeyDescripcion((Long)value);
				sDescripcion=transaccion.gettipotransa_descripcion();
			}
		}

		if(sTipo.equals("TipoComprobante")) {
			//sDescripcion=this.getActualTipoComprobanteForeignKeyDescripcion((Long)value);
			if(!transaccion.getIsNew() && !transaccion.getIsChanged() && !transaccion.getIsDeleted()) {
				sDescripcion=transaccion.gettipocomprobante_descripcion();
			} else {
				//sDescripcion=this.getActualTipoComprobanteForeignKeyDescripcion((Long)value);
				sDescripcion=transaccion.gettipocomprobante_descripcion();
			}
		}

		if(sTipo.equals("TipoTransaccionModulo")) {
			//sDescripcion=this.getActualTipoTransaccionModuloForeignKeyDescripcion((Long)value);
			if(!transaccion.getIsNew() && !transaccion.getIsChanged() && !transaccion.getIsDeleted()) {
				sDescripcion=transaccion.gettipotransaccionmodulo_descripcion();
			} else {
				//ES DEPENDIENTE, SE FORZA DESDE DESCRIPCION
				sDescripcion=transaccion.gettipotransaccionmodulo_descripcion();
			}
		}

		if(sTipo.equals("TipoRetencion")) {
			//sDescripcion=this.getActualTipoRetencionForeignKeyDescripcion((Long)value);
			if(!transaccion.getIsNew() && !transaccion.getIsChanged() && !transaccion.getIsDeleted()) {
				sDescripcion=transaccion.gettiporetencion_descripcion();
			} else {
				//sDescripcion=this.getActualTipoRetencionForeignKeyDescripcion((Long)value);
				sDescripcion=transaccion.gettiporetencion_descripcion();
			}
		}

		if(sTipo.equals("CuentaContable")) {
			//sDescripcion=this.getActualCuentaContableForeignKeyDescripcion((Long)value);
			if(!transaccion.getIsNew() && !transaccion.getIsChanged() && !transaccion.getIsDeleted()) {
				sDescripcion=transaccion.getcuentacontable_descripcion();
			} else {
				//sDescripcion=this.getActualCuentaContableForeignKeyDescripcion((Long)value);
				sDescripcion=transaccion.getcuentacontable_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		Transaccion transaccionRow=new Transaccion();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			transaccionRow=(Transaccion) transaccionLogic.getTransaccions().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			transaccionRow=(Transaccion) transaccions.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualTransaccion(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoTransaccion.setVisible((this.isVisibilidadCeldaNuevoTransaccion && this.isPermisoNuevoTransaccion));			
			this.jButtonDuplicarTransaccion.setVisible((this.isVisibilidadCeldaDuplicarTransaccion && this.isPermisoDuplicarTransaccion));			
			this.jButtonCopiarTransaccion.setVisible((this.isVisibilidadCeldaCopiarTransaccion && this.isPermisoCopiarTransaccion));
			this.jButtonVerFormTransaccion.setVisible((this.isVisibilidadCeldaVerFormTransaccion && this.isPermisoVerFormTransaccion));
			
			this.jButtonAbrirOrderByTransaccion.setVisible((this.isVisibilidadCeldaOrdenTransaccion && this.isPermisoOrdenTransaccion));			
			
			this.jButtonNuevoRelacionesTransaccion.setVisible((this.isVisibilidadCeldaNuevoRelacionesTransaccion && this.isPermisoNuevoTransaccion));			
			this.jButtonNuevoGuardarCambiosTransaccion.setVisible((this.isVisibilidadCeldaNuevoTransaccion && this.isPermisoNuevoTransaccion && this.isPermisoGuardarCambiosTransaccion));
			
			if(this.jInternalFrameDetalleFormTransaccion!=null) {
			this.jInternalFrameDetalleFormTransaccion.jButtonModificarTransaccion.setVisible((this.isVisibilidadCeldaModificarTransaccion && this.isPermisoActualizarTransaccion));	
			this.jInternalFrameDetalleFormTransaccion.jButtonActualizarTransaccion.setVisible((this.isVisibilidadCeldaActualizarTransaccion && this.isPermisoActualizarTransaccion));	
			this.jInternalFrameDetalleFormTransaccion.jButtonEliminarTransaccion.setVisible((this.isVisibilidadCeldaEliminarTransaccion && this.isPermisoEliminarTransaccion));
			this.jInternalFrameDetalleFormTransaccion.jButtonCancelarTransaccion.setVisible(this.isVisibilidadCeldaCancelarTransaccion);							
			this.jInternalFrameDetalleFormTransaccion.jButtonGuardarCambiosTransaccion.setVisible((this.isVisibilidadCeldaGuardarTransaccion && this.isPermisoGuardarCambiosTransaccion));			
			
			}
						
			this.jButtonGuardarCambiosTablaTransaccion.setVisible((this.isVisibilidadCeldaGuardarCambiosTransaccion && this.isPermisoGuardarCambiosTransaccion));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarTransaccion.setVisible((this.isVisibilidadCeldaNuevoTransaccion && this.isPermisoNuevoTransaccion));						
			this.jButtonDuplicarToolBarTransaccion.setVisible((this.isVisibilidadCeldaDuplicarTransaccion && this.isPermisoDuplicarTransaccion));						
			this.jButtonCopiarToolBarTransaccion.setVisible((this.isVisibilidadCeldaCopiarTransaccion && this.isPermisoCopiarTransaccion));			
			this.jButtonVerFormToolBarTransaccion.setVisible((this.isVisibilidadCeldaVerFormTransaccion && this.isPermisoVerFormTransaccion));			
			this.jButtonAbrirOrderByToolBarTransaccion.setVisible((this.isVisibilidadCeldaOrdenTransaccion && this.isPermisoOrdenTransaccion));
			this.jButtonNuevoRelacionesToolBarTransaccion.setVisible((this.isVisibilidadCeldaNuevoRelacionesTransaccion && this.isPermisoNuevoTransaccion));			
			this.jButtonNuevoGuardarCambiosToolBarTransaccion.setVisible((this.isVisibilidadCeldaNuevoTransaccion && this.isPermisoNuevoTransaccion && this.isPermisoGuardarCambiosTransaccion));			
			
			if(this.jInternalFrameDetalleFormTransaccion!=null) {
			this.jInternalFrameDetalleFormTransaccion.jButtonModificarToolBarTransaccion.setVisible((this.isVisibilidadCeldaModificarTransaccion && this.isPermisoActualizarTransaccion));	
			this.jInternalFrameDetalleFormTransaccion.jButtonActualizarToolBarTransaccion.setVisible((this.isVisibilidadCeldaActualizarTransaccion  && this.isPermisoActualizarTransaccion));	
			this.jInternalFrameDetalleFormTransaccion.jButtonEliminarToolBarTransaccion.setVisible((this.isVisibilidadCeldaEliminarTransaccion && this.isPermisoEliminarTransaccion));
			this.jInternalFrameDetalleFormTransaccion.jButtonCancelarToolBarTransaccion.setVisible(this.isVisibilidadCeldaCancelarTransaccion);				
			this.jInternalFrameDetalleFormTransaccion.jButtonGuardarCambiosToolBarTransaccion.setVisible((this.isVisibilidadCeldaGuardarTransaccion && this.isPermisoGuardarCambiosTransaccion));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarTransaccion.setVisible((this.isVisibilidadCeldaGuardarCambiosTransaccion && this.isPermisoGuardarCambiosTransaccion));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoTransaccion.setVisible((this.isVisibilidadCeldaNuevoTransaccion && this.isPermisoNuevoTransaccion));			
			this.jMenuItemDuplicarTransaccion.setVisible((this.isVisibilidadCeldaDuplicarTransaccion && this.isPermisoDuplicarTransaccion));			
			this.jMenuItemCopiarTransaccion.setVisible((this.isVisibilidadCeldaCopiarTransaccion && this.isPermisoCopiarTransaccion));			
			this.jMenuItemVerFormTransaccion.setVisible((this.isVisibilidadCeldaVerFormTransaccion && this.isPermisoVerFormTransaccion));			
			this.jMenuItemAbrirOrderByTransaccion.setVisible((this.isVisibilidadCeldaOrdenTransaccion && this.isPermisoOrdenTransaccion));			
			//this.jMenuItemMostrarOcultarTransaccion.setVisible((this.isVisibilidadCeldaOrdenTransaccion && this.isPermisoOrdenTransaccion));
			this.jMenuItemDetalleAbrirOrderByTransaccion.setVisible((this.isVisibilidadCeldaOrdenTransaccion && this.isPermisoOrdenTransaccion));			
			//this.jMenuItemDetalleMostrarOcultarTransaccion.setVisible((this.isVisibilidadCeldaOrdenTransaccion && this.isPermisoOrdenTransaccion));			
			this.jMenuItemNuevoRelacionesTransaccion.setVisible((this.isVisibilidadCeldaNuevoRelacionesTransaccion && this.isPermisoNuevoTransaccion));			
			this.jMenuItemNuevoGuardarCambiosTransaccion.setVisible((this.isVisibilidadCeldaNuevoTransaccion && this.isPermisoNuevoTransaccion && this.isPermisoGuardarCambiosTransaccion));									
			
			if(this.jInternalFrameDetalleFormTransaccion!=null) {
			this.jInternalFrameDetalleFormTransaccion.jMenuItemModificarTransaccion.setVisible((this.isVisibilidadCeldaModificarTransaccion && this.isPermisoActualizarTransaccion));	
			this.jInternalFrameDetalleFormTransaccion.jMenuItemActualizarTransaccion.setVisible((this.isVisibilidadCeldaActualizarTransaccion && this.isPermisoActualizarTransaccion));	
			this.jInternalFrameDetalleFormTransaccion.jMenuItemEliminarTransaccion.setVisible((this.isVisibilidadCeldaEliminarTransaccion && this.isPermisoEliminarTransaccion));
			this.jInternalFrameDetalleFormTransaccion.jMenuItemCancelarTransaccion.setVisible(this.isVisibilidadCeldaCancelarTransaccion);				
			}
			
			this.jMenuItemGuardarCambiosTransaccion.setVisible((this.isVisibilidadCeldaGuardarTransaccion && this.isPermisoGuardarCambiosTransaccion));						
			this.jMenuItemGuardarCambiosTablaTransaccion.setVisible((this.isVisibilidadCeldaGuardarCambiosTransaccion && this.isPermisoGuardarCambiosTransaccion));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoTransaccion=this.jButtonNuevoTransaccion.isVisible();
			this.isVisibilidadCeldaDuplicarTransaccion=this.jButtonDuplicarTransaccion.isVisible();
			this.isVisibilidadCeldaCopiarTransaccion=this.jButtonCopiarTransaccion.isVisible();
			this.isVisibilidadCeldaVerFormTransaccion=this.jButtonVerFormTransaccion.isVisible();
			
			this.isVisibilidadCeldaOrdenTransaccion=this.jButtonAbrirOrderByTransaccion.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesTransaccion=this.jButtonNuevoRelacionesTransaccion.isVisible();
			this.isVisibilidadCeldaModificarTransaccion=this.jButtonModificarTransaccion.isVisible();
			
			if(this.jInternalFrameDetalleFormTransaccion!=null) {
			this.isVisibilidadCeldaActualizarTransaccion=this.jInternalFrameDetalleFormTransaccion.jButtonActualizarTransaccion.isVisible();
			this.isVisibilidadCeldaEliminarTransaccion=this.jInternalFrameDetalleFormTransaccion.jButtonEliminarTransaccion.isVisible();
			this.isVisibilidadCeldaCancelarTransaccion=this.jInternalFrameDetalleFormTransaccion.jButtonCancelarTransaccion.isVisible();
			this.isVisibilidadCeldaGuardarTransaccion=this.jInternalFrameDetalleFormTransaccion.jButtonGuardarCambiosTransaccion.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosTransaccion=this.jButtonGuardarCambiosTablaTransaccion.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoTransaccion=this.jButtonNuevoToolBarTransaccion.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTransaccion=this.jButtonNuevoRelacionesToolBarTransaccion.isVisible();
			
			if(this.jInternalFrameDetalleFormTransaccion!=null) {
			this.isVisibilidadCeldaModificarTransaccion=this.jInternalFrameDetalleFormTransaccion.jButtonModificarToolBarTransaccion.isVisible();
			this.isVisibilidadCeldaActualizarTransaccion=this.jInternalFrameDetalleFormTransaccion.jButtonActualizarToolBarTransaccion.isVisible();
			this.isVisibilidadCeldaEliminarTransaccion=this.jInternalFrameDetalleFormTransaccion.jButtonEliminarToolBarTransaccion.isVisible();
			this.isVisibilidadCeldaCancelarTransaccion=this.jInternalFrameDetalleFormTransaccion.jButtonCancelarToolBarTransaccion.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTransaccion=this.jButtonGuardarCambiosToolBarTransaccion.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTransaccion=this.jButtonGuardarCambiosTablaToolBarTransaccion.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoTransaccion=this.jMenuItemNuevoTransaccion.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTransaccion=this.jMenuItemNuevoRelacionesTransaccion.isVisible();
			
			if(this.jInternalFrameDetalleFormTransaccion!=null) {
			this.isVisibilidadCeldaModificarTransaccion=this.jInternalFrameDetalleFormTransaccion.jMenuItemModificarTransaccion.isVisible();
			this.isVisibilidadCeldaActualizarTransaccion=this.jInternalFrameDetalleFormTransaccion.jMenuItemActualizarTransaccion.isVisible();
			this.isVisibilidadCeldaEliminarTransaccion=this.jInternalFrameDetalleFormTransaccion.jMenuItemEliminarTransaccion.isVisible();
			this.isVisibilidadCeldaCancelarTransaccion=this.jInternalFrameDetalleFormTransaccion.jMenuItemCancelarTransaccion.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTransaccion=this.jMenuItemGuardarCambiosTransaccion.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTransaccion=this.jMenuItemGuardarCambiosTablaTransaccion.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesTransaccion(Boolean esInicializar) {
		if(TransaccionJInternalFrame.ISBINDING_MANUAL) {			
			if(this.transaccionSessionBean.getConGuardarRelaciones()) {
				//if(this.transaccionSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesTransaccion();
			}
			
			this.inicializarActualizarBindingBotonesManualTransaccion(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualTransaccion() {
		this.jButtonNuevoTransaccion.setVisible(this.isPermisoNuevoTransaccion);			
		this.jButtonDuplicarTransaccion.setVisible(this.isPermisoDuplicarTransaccion);			
		this.jButtonCopiarTransaccion.setVisible(this.isPermisoCopiarTransaccion);			
		this.jButtonVerFormTransaccion.setVisible(this.isPermisoVerFormTransaccion);			
		
		this.jButtonAbrirOrderByTransaccion.setVisible(this.isPermisoOrdenTransaccion);					
		
		this.jButtonNuevoRelacionesTransaccion.setVisible(this.isPermisoNuevoTransaccion);			
		
		if(this.jInternalFrameDetalleFormTransaccion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTransaccion.jButtonModificarTransaccion.setVisible(this.isPermisoActualizarTransaccion);	
			this.jInternalFrameDetalleFormTransaccion.jButtonActualizarTransaccion.setVisible(this.isPermisoActualizarTransaccion);	
			this.jInternalFrameDetalleFormTransaccion.jButtonEliminarTransaccion.setVisible(this.isPermisoEliminarTransaccion);
			this.jInternalFrameDetalleFormTransaccion.jButtonCancelarTransaccion.setVisible(this.isVisibilidadCeldaCancelarTransaccion);						
			this.jInternalFrameDetalleFormTransaccion.jButtonGuardarCambiosTransaccion.setVisible(this.isPermisoGuardarCambiosTransaccion);							
		}
		
		this.jButtonGuardarCambiosTablaTransaccion.setVisible(this.isPermisoActualizarTransaccion);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleTransaccion() {
		this.jInternalFrameDetalleFormTransaccion.jButtonModificarTransaccion.setVisible(this.isPermisoActualizarTransaccion);	
		this.jInternalFrameDetalleFormTransaccion.jButtonActualizarTransaccion.setVisible(this.isPermisoActualizarTransaccion);	
		this.jInternalFrameDetalleFormTransaccion.jButtonEliminarTransaccion.setVisible(this.isPermisoEliminarTransaccion);
		this.jInternalFrameDetalleFormTransaccion.jButtonCancelarTransaccion.setVisible(this.isVisibilidadCeldaCancelarTransaccion);							
		this.jInternalFrameDetalleFormTransaccion.jButtonGuardarCambiosTransaccion.setVisible((this.isVisibilidadCeldaGuardarTransaccion && this.isPermisoGuardarCambiosTransaccion));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosTransaccion() {
		if(TransaccionJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualTransaccion();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesTransaccion() {
	}
	
	public void jTableDatosTransaccionListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarTransaccion(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransaccionConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidTransaccionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transaccionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTransaccion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTransaccion(this.gettransaccion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTransaccion(this.transaccion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.transaccion =(Transaccion) this.transaccionLogic.getTransaccions().toArray()[this.jTableDatosTransaccion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.transaccion =(Transaccion) this.transaccions.toArray()[this.jTableDatosTransaccion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.transaccion==null) {
						this.transaccion = new Transaccion();
					}

					this.setVariablesFormularioToObjetoActualTransaccion(this.transaccion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTransaccion(this.transaccion);
				}

				if(this.transaccion.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.transaccion.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTransaccion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transaccionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transaccionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TransaccionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transaccionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaTransaccionUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccionLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebTransaccion(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTransaccion.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosTransaccion.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosTransaccion.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transaccion =(Transaccion) this.transaccionLogic.getTransaccions().toArray()[this.jTableDatosTransaccion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.transaccion =(Transaccion) this.transaccions.toArray()[this.jTableDatosTransaccion.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualTransaccion(this.gettransaccion(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysTransaccion(this.transaccion);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.transaccionLogic.getConnexion());

				if(this.transaccion.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.transaccion.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderTransaccion=(TitledBorder)this.jScrollPanelDatosTransaccion.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderTransaccion.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccionLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TransaccionConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccionLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaTransaccionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transaccionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTransaccion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTransaccion(this.gettransaccion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTransaccion(this.transaccion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.transaccion =(Transaccion) this.transaccionLogic.getTransaccions().toArray()[this.jTableDatosTransaccion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.transaccion =(Transaccion) this.transaccions.toArray()[this.jTableDatosTransaccion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.transaccion==null) {
						this.transaccion = new Transaccion();
					}

					this.setVariablesFormularioToObjetoActualTransaccion(this.transaccion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTransaccion(this.transaccion);
				}

				if(this.transaccion.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.transaccion.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTransaccion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transaccionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transaccionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TransaccionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transaccionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_sucursalTransaccionUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccionLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisosucursal=true;

			idTienePermisosucursal=this.tienePermisosUsuarioEnPaginaWebTransaccion(SucursalConstantesFunciones.CLASSNAME);

			if(idTienePermisosucursal) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTransaccion.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosTransaccion.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosTransaccion.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transaccion =(Transaccion) this.transaccionLogic.getTransaccions().toArray()[this.jTableDatosTransaccion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.transaccion =(Transaccion) this.transaccions.toArray()[this.jTableDatosTransaccion.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualTransaccion(this.gettransaccion(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysTransaccion(this.transaccion);

				this.sucursalBeanSwingJInternalFrame=new SucursalBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.sucursalBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.sucursalBeanSwingJInternalFrame.getSucursalLogic().setConnexion(this.transaccionLogic.getConnexion());

				if(this.transaccion.getid_sucursal()!=null) {
					this.sucursalBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.sucursalBeanSwingJInternalFrame.setIdActual(this.transaccion.getid_sucursal());
					this.sucursalBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.inicializarActualizarBindingTablaSucursal();
				}

				JInternalFrameBase jinternalFrame =this.sucursalBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderTransaccion=(TitledBorder)this.jScrollPanelDatosTransaccion.getBorder();
				TitledBorder titledBordersucursal=(TitledBorder)this.sucursalBeanSwingJInternalFrame.jScrollPanelDatosSucursal.getBorder();

				titledBordersucursal.setTitle(titledBorderTransaccion.getTitle() + " -> Sucursal");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccionLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TransaccionConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccionLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_sucursalTransaccionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transaccionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTransaccion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTransaccion(this.gettransaccion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTransaccion(this.transaccion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.transaccion =(Transaccion) this.transaccionLogic.getTransaccions().toArray()[this.jTableDatosTransaccion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.transaccion =(Transaccion) this.transaccions.toArray()[this.jTableDatosTransaccion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.transaccion==null) {
						this.transaccion = new Transaccion();
					}

					this.setVariablesFormularioToObjetoActualTransaccion(this.transaccion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTransaccion(this.transaccion);
				}

				if(this.transaccion.getid_sucursal()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_sucursal = "+this.transaccion.getid_sucursal().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTransaccion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transaccionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transaccionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TransaccionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transaccionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigoTransaccionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transaccionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTransaccion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTransaccion(this.gettransaccion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTransaccion(this.transaccion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.transaccion =(Transaccion) this.transaccionLogic.getTransaccions().toArray()[this.jTableDatosTransaccion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.transaccion =(Transaccion) this.transaccions.toArray()[this.jTableDatosTransaccion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.transaccion==null) {
						this.transaccion = new Transaccion();
					}

					this.setVariablesFormularioToObjetoActualTransaccion(this.transaccion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTransaccion(this.transaccion);
				}

				if(this.transaccion.getcodigo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo like '%"+this.transaccion.getcodigo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTransaccion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transaccionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transaccionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TransaccionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transaccionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreTransaccionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transaccionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTransaccion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTransaccion(this.gettransaccion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTransaccion(this.transaccion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.transaccion =(Transaccion) this.transaccionLogic.getTransaccions().toArray()[this.jTableDatosTransaccion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.transaccion =(Transaccion) this.transaccions.toArray()[this.jTableDatosTransaccion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.transaccion==null) {
						this.transaccion = new Transaccion();
					}

					this.setVariablesFormularioToObjetoActualTransaccion(this.transaccion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTransaccion(this.transaccion);
				}

				if(this.transaccion.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.transaccion.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTransaccion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transaccionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transaccionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TransaccionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transaccionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_moduloTransaccionUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccionLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisomodulo=true;

			idTienePermisomodulo=this.tienePermisosUsuarioEnPaginaWebTransaccion(ModuloConstantesFunciones.CLASSNAME);

			if(idTienePermisomodulo) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTransaccion.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosTransaccion.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosTransaccion.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transaccion =(Transaccion) this.transaccionLogic.getTransaccions().toArray()[this.jTableDatosTransaccion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.transaccion =(Transaccion) this.transaccions.toArray()[this.jTableDatosTransaccion.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualTransaccion(this.gettransaccion(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysTransaccion(this.transaccion);

				this.moduloBeanSwingJInternalFrame=new ModuloBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.moduloBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.moduloBeanSwingJInternalFrame.getModuloLogic().setConnexion(this.transaccionLogic.getConnexion());

				if(this.transaccion.getid_modulo()!=null) {
					this.moduloBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.moduloBeanSwingJInternalFrame.setIdActual(this.transaccion.getid_modulo());
					this.moduloBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.moduloBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.moduloBeanSwingJInternalFrame.inicializarActualizarBindingTablaModulo();
				}

				JInternalFrameBase jinternalFrame =this.moduloBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderTransaccion=(TitledBorder)this.jScrollPanelDatosTransaccion.getBorder();
				TitledBorder titledBordermodulo=(TitledBorder)this.moduloBeanSwingJInternalFrame.jScrollPanelDatosModulo.getBorder();

				titledBordermodulo.setTitle(titledBorderTransaccion.getTitle() + " -> Modulo");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccionLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TransaccionConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccionLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_moduloTransaccionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transaccionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTransaccion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTransaccion(this.gettransaccion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTransaccion(this.transaccion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.transaccion =(Transaccion) this.transaccionLogic.getTransaccions().toArray()[this.jTableDatosTransaccion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.transaccion =(Transaccion) this.transaccions.toArray()[this.jTableDatosTransaccion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.transaccion==null) {
						this.transaccion = new Transaccion();
					}

					this.setVariablesFormularioToObjetoActualTransaccion(this.transaccion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTransaccion(this.transaccion);
				}

				if(this.transaccion.getid_modulo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_modulo = "+this.transaccion.getid_modulo().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTransaccion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transaccionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transaccionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TransaccionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transaccionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_tipo_transaTransaccionUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccionLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisotipotransa=true;

			idTienePermisotipotransa=this.tienePermisosUsuarioEnPaginaWebTransaccion(TipoTransaConstantesFunciones.CLASSNAME);

			if(idTienePermisotipotransa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTransaccion.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosTransaccion.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosTransaccion.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transaccion =(Transaccion) this.transaccionLogic.getTransaccions().toArray()[this.jTableDatosTransaccion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.transaccion =(Transaccion) this.transaccions.toArray()[this.jTableDatosTransaccion.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualTransaccion(this.gettransaccion(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysTransaccion(this.transaccion);

				this.tipotransaBeanSwingJInternalFrame=new TipoTransaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.tipotransaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.tipotransaBeanSwingJInternalFrame.getTipoTransaLogic().setConnexion(this.transaccionLogic.getConnexion());

				if(this.transaccion.getid_tipo_transa()!=null) {
					this.tipotransaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.tipotransaBeanSwingJInternalFrame.setIdActual(this.transaccion.getid_tipo_transa());
					this.tipotransaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.tipotransaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.tipotransaBeanSwingJInternalFrame.inicializarActualizarBindingTablaTipoTransa();
				}

				JInternalFrameBase jinternalFrame =this.tipotransaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderTransaccion=(TitledBorder)this.jScrollPanelDatosTransaccion.getBorder();
				TitledBorder titledBordertipotransa=(TitledBorder)this.tipotransaBeanSwingJInternalFrame.jScrollPanelDatosTipoTransa.getBorder();

				titledBordertipotransa.setTitle(titledBorderTransaccion.getTitle() + " -> Tipo Transa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccionLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TransaccionConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccionLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_tipo_transaTransaccionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transaccionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTransaccion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTransaccion(this.gettransaccion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTransaccion(this.transaccion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.transaccion =(Transaccion) this.transaccionLogic.getTransaccions().toArray()[this.jTableDatosTransaccion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.transaccion =(Transaccion) this.transaccions.toArray()[this.jTableDatosTransaccion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.transaccion==null) {
						this.transaccion = new Transaccion();
					}

					this.setVariablesFormularioToObjetoActualTransaccion(this.transaccion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTransaccion(this.transaccion);
				}

				if(this.transaccion.getid_tipo_transa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_tipo_transa = "+this.transaccion.getid_tipo_transa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTransaccion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transaccionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transaccionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TransaccionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transaccionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_tipo_comprobanteTransaccionUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccionLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisotipocomprobante=true;

			idTienePermisotipocomprobante=this.tienePermisosUsuarioEnPaginaWebTransaccion(TipoComprobanteConstantesFunciones.CLASSNAME);

			if(idTienePermisotipocomprobante) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTransaccion.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosTransaccion.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosTransaccion.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transaccion =(Transaccion) this.transaccionLogic.getTransaccions().toArray()[this.jTableDatosTransaccion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.transaccion =(Transaccion) this.transaccions.toArray()[this.jTableDatosTransaccion.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualTransaccion(this.gettransaccion(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysTransaccion(this.transaccion);

				this.tipocomprobanteBeanSwingJInternalFrame=new TipoComprobanteBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.tipocomprobanteBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.tipocomprobanteBeanSwingJInternalFrame.getTipoComprobanteLogic().setConnexion(this.transaccionLogic.getConnexion());

				if(this.transaccion.getid_tipo_comprobante()!=null) {
					this.tipocomprobanteBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.tipocomprobanteBeanSwingJInternalFrame.setIdActual(this.transaccion.getid_tipo_comprobante());
					this.tipocomprobanteBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.tipocomprobanteBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.tipocomprobanteBeanSwingJInternalFrame.inicializarActualizarBindingTablaTipoComprobante();
				}

				JInternalFrameBase jinternalFrame =this.tipocomprobanteBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderTransaccion=(TitledBorder)this.jScrollPanelDatosTransaccion.getBorder();
				TitledBorder titledBordertipocomprobante=(TitledBorder)this.tipocomprobanteBeanSwingJInternalFrame.jScrollPanelDatosTipoComprobante.getBorder();

				titledBordertipocomprobante.setTitle(titledBorderTransaccion.getTitle() + " -> Tipo Comprobante");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccionLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TransaccionConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccionLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_tipo_comprobanteTransaccionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transaccionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTransaccion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTransaccion(this.gettransaccion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTransaccion(this.transaccion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.transaccion =(Transaccion) this.transaccionLogic.getTransaccions().toArray()[this.jTableDatosTransaccion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.transaccion =(Transaccion) this.transaccions.toArray()[this.jTableDatosTransaccion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.transaccion==null) {
						this.transaccion = new Transaccion();
					}

					this.setVariablesFormularioToObjetoActualTransaccion(this.transaccion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTransaccion(this.transaccion);
				}

				if(this.transaccion.getid_tipo_comprobante()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_tipo_comprobante = "+this.transaccion.getid_tipo_comprobante().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTransaccion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transaccionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transaccionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TransaccionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transaccionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_tipo_transaccion_moduloTransaccionUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccionLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisotipotransaccionmodulo=true;

			idTienePermisotipotransaccionmodulo=this.tienePermisosUsuarioEnPaginaWebTransaccion(TipoTransaccionModuloConstantesFunciones.CLASSNAME);

			if(idTienePermisotipotransaccionmodulo) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTransaccion.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosTransaccion.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosTransaccion.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transaccion =(Transaccion) this.transaccionLogic.getTransaccions().toArray()[this.jTableDatosTransaccion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.transaccion =(Transaccion) this.transaccions.toArray()[this.jTableDatosTransaccion.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualTransaccion(this.gettransaccion(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysTransaccion(this.transaccion);

				this.tipotransaccionmoduloBeanSwingJInternalFrame=new TipoTransaccionModuloBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.tipotransaccionmoduloBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.tipotransaccionmoduloBeanSwingJInternalFrame.getTipoTransaccionModuloLogic().setConnexion(this.transaccionLogic.getConnexion());

				if(this.transaccion.getid_tipo_transaccion_modulo()!=null) {
					this.tipotransaccionmoduloBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.tipotransaccionmoduloBeanSwingJInternalFrame.setIdActual(this.transaccion.getid_tipo_transaccion_modulo());
					this.tipotransaccionmoduloBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.tipotransaccionmoduloBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.tipotransaccionmoduloBeanSwingJInternalFrame.inicializarActualizarBindingTablaTipoTransaccionModulo();
				}

				JInternalFrameBase jinternalFrame =this.tipotransaccionmoduloBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderTransaccion=(TitledBorder)this.jScrollPanelDatosTransaccion.getBorder();
				TitledBorder titledBordertipotransaccionmodulo=(TitledBorder)this.tipotransaccionmoduloBeanSwingJInternalFrame.jScrollPanelDatosTipoTransaccionModulo.getBorder();

				titledBordertipotransaccionmodulo.setTitle(titledBorderTransaccion.getTitle() + " -> Tipo Transaccion Modulo");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccionLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TransaccionConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccionLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_tipo_transaccion_moduloTransaccionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transaccionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTransaccion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTransaccion(this.gettransaccion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTransaccion(this.transaccion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.transaccion =(Transaccion) this.transaccionLogic.getTransaccions().toArray()[this.jTableDatosTransaccion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.transaccion =(Transaccion) this.transaccions.toArray()[this.jTableDatosTransaccion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.transaccion==null) {
						this.transaccion = new Transaccion();
					}

					this.setVariablesFormularioToObjetoActualTransaccion(this.transaccion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTransaccion(this.transaccion);
				}

				if(this.transaccion.getid_tipo_transaccion_modulo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_tipo_transaccion_modulo = "+this.transaccion.getid_tipo_transaccion_modulo().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTransaccion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transaccionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transaccionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TransaccionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transaccionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_tipo_retencionTransaccionUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccionLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisotiporetencion=true;

			idTienePermisotiporetencion=this.tienePermisosUsuarioEnPaginaWebTransaccion(TipoRetencionConstantesFunciones.CLASSNAME);

			if(idTienePermisotiporetencion) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTransaccion.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosTransaccion.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosTransaccion.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transaccion =(Transaccion) this.transaccionLogic.getTransaccions().toArray()[this.jTableDatosTransaccion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.transaccion =(Transaccion) this.transaccions.toArray()[this.jTableDatosTransaccion.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualTransaccion(this.gettransaccion(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysTransaccion(this.transaccion);

				this.tiporetencionBeanSwingJInternalFrame=new TipoRetencionBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.tiporetencionBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.tiporetencionBeanSwingJInternalFrame.getTipoRetencionLogic().setConnexion(this.transaccionLogic.getConnexion());

				if(this.transaccion.getid_tipo_retencion()!=null) {
					this.tiporetencionBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.tiporetencionBeanSwingJInternalFrame.setIdActual(this.transaccion.getid_tipo_retencion());
					this.tiporetencionBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.tiporetencionBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.tiporetencionBeanSwingJInternalFrame.inicializarActualizarBindingTablaTipoRetencion();
				}

				JInternalFrameBase jinternalFrame =this.tiporetencionBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderTransaccion=(TitledBorder)this.jScrollPanelDatosTransaccion.getBorder();
				TitledBorder titledBordertiporetencion=(TitledBorder)this.tiporetencionBeanSwingJInternalFrame.jScrollPanelDatosTipoRetencion.getBorder();

				titledBordertiporetencion.setTitle(titledBorderTransaccion.getTitle() + " -> Tipo Retencion ");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccionLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TransaccionConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccionLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_tipo_retencionTransaccionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transaccionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTransaccion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTransaccion(this.gettransaccion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTransaccion(this.transaccion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.transaccion =(Transaccion) this.transaccionLogic.getTransaccions().toArray()[this.jTableDatosTransaccion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.transaccion =(Transaccion) this.transaccions.toArray()[this.jTableDatosTransaccion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.transaccion==null) {
						this.transaccion = new Transaccion();
					}

					this.setVariablesFormularioToObjetoActualTransaccion(this.transaccion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTransaccion(this.transaccion);
				}

				if(this.transaccion.getid_tipo_retencion()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_tipo_retencion = "+this.transaccion.getid_tipo_retencion().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTransaccion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transaccionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transaccionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TransaccionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transaccionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_cuenta_contableTransaccionActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
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


			TitledBorder titledBorderTransaccion=null;
			TitledBorder titledBordercuentacontable=null;

			if(!this.jScrollPanelDatosTransaccion.getBorder().getClass().equals(EmptyBorder.class)) {
				titledBorderTransaccion=(TitledBorder)this.jScrollPanelDatosTransaccion.getBorder();
				titledBordercuentacontable=(TitledBorder)this.cuentacontableBeanSwingJInternalFrame.jScrollPanelDatosCuentaContable.getBorder();

				titledBordercuentacontable.setTitle(titledBorderTransaccion.getTitle() + " -> Cuenta Contable");
			}

			if(!Constantes.CON_VARIAS_VENTANAS) {
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
			}

			this.jDesktopPane.add(jinternalFrame);

			jinternalFrame.setSelected(true);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransaccionConstantesFunciones.CLASSNAME);
		}
	}

	public void jButtonid_cuenta_contableTransaccionUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccionLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisocuentacontable=true;

			idTienePermisocuentacontable=this.tienePermisosUsuarioEnPaginaWebTransaccion(CuentaContableConstantesFunciones.CLASSNAME);

			if(idTienePermisocuentacontable) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTransaccion.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosTransaccion.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosTransaccion.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transaccion =(Transaccion) this.transaccionLogic.getTransaccions().toArray()[this.jTableDatosTransaccion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.transaccion =(Transaccion) this.transaccions.toArray()[this.jTableDatosTransaccion.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualTransaccion(this.gettransaccion(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysTransaccion(this.transaccion);

				this.cuentacontableBeanSwingJInternalFrame=new CuentaContableBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.cuentacontableBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.cuentacontableBeanSwingJInternalFrame.getCuentaContableLogic().setConnexion(this.transaccionLogic.getConnexion());

				if(this.transaccion.getid_cuenta_contable()!=null) {
					this.cuentacontableBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.cuentacontableBeanSwingJInternalFrame.setIdActual(this.transaccion.getid_cuenta_contable());
					this.cuentacontableBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.cuentacontableBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.cuentacontableBeanSwingJInternalFrame.inicializarActualizarBindingTablaCuentaContable();
				}

				JInternalFrameBase jinternalFrame =this.cuentacontableBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderTransaccion=(TitledBorder)this.jScrollPanelDatosTransaccion.getBorder();
				TitledBorder titledBordercuentacontable=(TitledBorder)this.cuentacontableBeanSwingJInternalFrame.jScrollPanelDatosCuentaContable.getBorder();

				titledBordercuentacontable.setTitle(titledBorderTransaccion.getTitle() + " -> Cuenta Contable");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccionLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TransaccionConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccionLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_cuenta_contableTransaccionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transaccionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTransaccion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTransaccion(this.gettransaccion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTransaccion(this.transaccion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.transaccion =(Transaccion) this.transaccionLogic.getTransaccions().toArray()[this.jTableDatosTransaccion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.transaccion =(Transaccion) this.transaccions.toArray()[this.jTableDatosTransaccion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.transaccion==null) {
						this.transaccion = new Transaccion();
					}

					this.setVariablesFormularioToObjetoActualTransaccion(this.transaccion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTransaccion(this.transaccion);
				}

				if(this.transaccion.getid_cuenta_contable()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_cuenta_contable = "+this.transaccion.getid_cuenta_contable().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTransaccion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transaccionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transaccionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TransaccionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transaccionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtondescripcionTransaccionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transaccionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTransaccion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTransaccion(this.gettransaccion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTransaccion(this.transaccion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.transaccion =(Transaccion) this.transaccionLogic.getTransaccions().toArray()[this.jTableDatosTransaccion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.transaccion =(Transaccion) this.transaccions.toArray()[this.jTableDatosTransaccion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.transaccion==null) {
						this.transaccion = new Transaccion();
					}

					this.setVariablesFormularioToObjetoActualTransaccion(this.transaccion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTransaccion(this.transaccion);
				}

				if(this.transaccion.getdescripcion()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where descripcion like '%"+this.transaccion.getdescripcion()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTransaccion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transaccionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transaccionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TransaccionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transaccionLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonBusquedaPorCodigoTransaccionActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccionLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingTransaccion(false,false);

			this.getTransaccionsBusquedaPorCodigo();

			this.inicializarActualizarBindingTransaccion(false);

			//if(TransaccionBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingTransaccion(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccionLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TransaccionConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccionLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonBusquedaPorIdModuloPorTipoTransaccionTransaccionActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccionLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingTransaccion(false,false);

			this.getTransaccionsBusquedaPorIdModuloPorTipoTransaccion();

			this.inicializarActualizarBindingTransaccion(false);

			//if(TransaccionBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingTransaccion(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccionLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TransaccionConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccionLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonBusquedaPorNombreTransaccionActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccionLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingTransaccion(false,false);

			this.getTransaccionsBusquedaPorNombre();

			this.inicializarActualizarBindingTransaccion(false);

			//if(TransaccionBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingTransaccion(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccionLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TransaccionConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccionLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdCuentaContableTransaccionActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccionLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingTransaccion(false,false);

			this.getTransaccionsFK_IdCuentaContable();

			this.inicializarActualizarBindingTransaccion(false);

			//if(TransaccionBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingTransaccion(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccionLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TransaccionConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccionLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaTransaccionActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccionLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingTransaccion(false,false);

			this.getTransaccionsFK_IdEmpresa();

			this.inicializarActualizarBindingTransaccion(false);

			//if(TransaccionBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingTransaccion(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccionLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TransaccionConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccionLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdModuloTransaccionActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccionLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingTransaccion(false,false);

			this.getTransaccionsFK_IdModulo();

			this.inicializarActualizarBindingTransaccion(false);

			//if(TransaccionBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingTransaccion(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccionLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TransaccionConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccionLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdSucursalTransaccionActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccionLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingTransaccion(false,false);

			this.getTransaccionsFK_IdSucursal();

			this.inicializarActualizarBindingTransaccion(false);

			//if(TransaccionBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingTransaccion(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccionLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TransaccionConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccionLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdTipoComprobanteTransaccionActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccionLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingTransaccion(false,false);

			this.getTransaccionsFK_IdTipoComprobante();

			this.inicializarActualizarBindingTransaccion(false);

			//if(TransaccionBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingTransaccion(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccionLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TransaccionConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccionLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdTipoRetencionTransaccionActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccionLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingTransaccion(false,false);

			this.getTransaccionsFK_IdTipoRetencion();

			this.inicializarActualizarBindingTransaccion(false);

			//if(TransaccionBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingTransaccion(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccionLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TransaccionConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccionLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdTipoTransaTransaccionActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccionLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingTransaccion(false,false);

			this.getTransaccionsFK_IdTipoTransa();

			this.inicializarActualizarBindingTransaccion(false);

			//if(TransaccionBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingTransaccion(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccionLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TransaccionConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccionLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdTipoTransaccionModuloTransaccionActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccionLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingTransaccion(false,false);

			this.getTransaccionsFK_IdTipoTransaccionModulo();

			this.inicializarActualizarBindingTransaccion(false);

			//if(TransaccionBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingTransaccion(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccionLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TransaccionConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccionLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameTransaccion() {
		if(this.jInternalFrameDetalleFormTransaccion!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormTransaccion!=null) {
			this.jInternalFrameDetalleFormTransaccion.setVisible(false);	    			
			this.jInternalFrameDetalleFormTransaccion.dispose();
			this.jInternalFrameDetalleFormTransaccion=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoTransaccion!=null) {
			this.jInternalFrameReporteDinamicoTransaccion.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoTransaccion.dispose();
			this.jInternalFrameReporteDinamicoTransaccion=null;
		}
		
		if(this.jInternalFrameImportacionTransaccion!=null) {
			this.jInternalFrameImportacionTransaccion.setVisible(false);	    			
			this.jInternalFrameImportacionTransaccion.dispose();
			this.jInternalFrameImportacionTransaccion=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessTransaccion();
			
			TransaccionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.transaccion,new Object(),this.transaccionParameterGeneral,this.transaccionReturnGeneral);
			
			
			if(sTipo.equals("NuevoTransaccion")) {
				jButtonNuevoTransaccionActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarTransaccion")) {
				jButtonDuplicarTransaccionActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarTransaccion")) {
				jButtonCopiarTransaccionActionPerformed(evt);
			} else if(sTipo.equals("VerFormTransaccion")) {
				jButtonVerFormTransaccionActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarTransaccion")) {
				jButtonNuevoTransaccionActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarTransaccion")) {
				jButtonDuplicarTransaccionActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoTransaccion")) {
				jButtonNuevoTransaccionActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarTransaccion")) {
				jButtonDuplicarTransaccionActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesTransaccion")) {
				jButtonNuevoTransaccionActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarTransaccion")) {
				jButtonNuevoTransaccionActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesTransaccion")) {
				jButtonNuevoTransaccionActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarTransaccion")) {
				jButtonModificarTransaccionActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarTransaccion")) {
				jButtonModificarTransaccionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarTransaccion")) {
				jButtonModificarTransaccionActionPerformed(evt);
			} else if(sTipo.equals("ActualizarTransaccion")) {
				jButtonActualizarTransaccionActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarTransaccion")) {
				jButtonActualizarTransaccionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarTransaccion")) {
				jButtonActualizarTransaccionActionPerformed(evt);
			} else if(sTipo.equals("EliminarTransaccion")) {
				jButtonEliminarTransaccionActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarTransaccion")) {
				jButtonEliminarTransaccionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarTransaccion")) {
				jButtonEliminarTransaccionActionPerformed(evt);
			} else if(sTipo.equals("CancelarTransaccion")) {
				jButtonCancelarTransaccionActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarTransaccion")) {
				jButtonCancelarTransaccionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarTransaccion")) {
				jButtonCancelarTransaccionActionPerformed(evt);
			} else if(sTipo.equals("CerrarTransaccion")) {
				jButtonCerrarTransaccionActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarTransaccion")) {
				jButtonCerrarTransaccionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarTransaccion")) {
				jButtonCerrarTransaccionActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarTransaccion")) {
				jButtonMostrarOcultarTransaccionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarTransaccion")) {
				jButtonCancelarTransaccionActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTransaccion")) {
				jButtonGuardarCambiosTransaccionActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarTransaccion")) {
				jButtonGuardarCambiosTransaccionActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarTransaccion")) {
				jButtonCopiarTransaccionActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarTransaccion")) {
				jButtonVerFormTransaccionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTransaccion")) {
				jButtonGuardarCambiosTransaccionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarTransaccion")) {
				jButtonCopiarTransaccionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormTransaccion")) {
				jButtonVerFormTransaccionActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaTransaccion")) {
				jButtonGuardarCambiosTransaccionActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarTransaccion")) {
				jButtonGuardarCambiosTransaccionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaTransaccion")) {
				jButtonGuardarCambiosTransaccionActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionTransaccion")) {
				jButtonRecargarInformacionTransaccionActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarTransaccion")) {
				jButtonRecargarInformacionTransaccionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionTransaccion")) {
				jButtonRecargarInformacionTransaccionActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresTransaccion")) {
				jButtonAnterioresTransaccionActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarTransaccion")) {
				jButtonAnterioresTransaccionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreTransaccion")) {
				jButtonAnterioresTransaccionActionPerformed(evt);
			} else if(sTipo.equals("SiguientesTransaccion")) {
				jButtonSiguientesTransaccionActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarTransaccion")) {
				jButtonSiguientesTransaccionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesTransaccion")) {
				jButtonSiguientesTransaccionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByTransaccion") || sTipo.equals("MenuItemDetalleAbrirOrderByTransaccion")) {
				jButtonAbrirOrderByTransaccionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarTransaccion") || sTipo.equals("MenuItemDetalleMostrarOcultarTransaccion")) {
				jButtonMostrarOcultarTransaccionActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosTransaccion")) {
				jButtonNuevoGuardarCambiosTransaccionActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarTransaccion")) {
				jButtonNuevoGuardarCambiosTransaccionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosTransaccion")) {
				jButtonNuevoGuardarCambiosTransaccionActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoTransaccion")) {
				jButtonCerrarReporteDinamicoTransaccionActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoTransaccion")) {
				jButtonGenerarReporteDinamicoTransaccionActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoTransaccion")) {
				
				jButtonGenerarExcelReporteDinamicoTransaccionActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionTransaccion")) {
				jButtonCerrarImportacionTransaccionActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionTransaccion")) {
				
				jButtonGenerarImportacionTransaccionActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionTransaccion")) {
				
				jButtonAbrirImportacionTransaccionActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesTransaccion")) {
				jComboBoxTiposAccionesTransaccionActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesTransaccion")) {
				jComboBoxTiposRelacionesTransaccionActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioTransaccion")) {
				jComboBoxTiposAccionesTransaccionActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarTransaccion")) {
				
				jComboBoxTiposSeleccionarTransaccionActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralTransaccion")) {
				jTextFieldValorCampoGeneralTransaccionActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByTransaccion")) {
				jButtonAbrirOrderByTransaccionActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarTransaccion")) {
				jButtonAbrirOrderByTransaccionActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByTransaccion")) {
				jButtonCerrarOrderByTransaccionActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTransaccionBusqueda")) {
				this.jButtonidTransaccionBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaTransaccionUpdate")) {
				this.jButtonid_empresaTransaccionUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaTransaccionBusqueda")) {
				this.jButtonid_empresaTransaccionBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalTransaccionUpdate")) {
				this.jButtonid_sucursalTransaccionUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalTransaccionBusqueda")) {
				this.jButtonid_sucursalTransaccionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoTransaccionBusqueda")) {
				this.jButtoncodigoTransaccionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTransaccionBusqueda")) {
				this.jButtonnombreTransaccionBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_moduloTransaccionUpdate")) {
				this.jButtonid_moduloTransaccionUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_moduloTransaccionBusqueda")) {
				this.jButtonid_moduloTransaccionBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_transaTransaccionUpdate")) {
				this.jButtonid_tipo_transaTransaccionUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_transaTransaccionBusqueda")) {
				this.jButtonid_tipo_transaTransaccionBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_comprobanteTransaccionUpdate")) {
				this.jButtonid_tipo_comprobanteTransaccionUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_comprobanteTransaccionBusqueda")) {
				this.jButtonid_tipo_comprobanteTransaccionBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_transaccion_moduloTransaccionUpdate")) {
				this.jButtonid_tipo_transaccion_moduloTransaccionUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_transaccion_moduloTransaccionBusqueda")) {
				this.jButtonid_tipo_transaccion_moduloTransaccionBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_retencionTransaccionUpdate")) {
				this.jButtonid_tipo_retencionTransaccionUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_retencionTransaccionBusqueda")) {
				this.jButtonid_tipo_retencionTransaccionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_cuenta_contableTransaccion")) {
				this.jButtonid_cuenta_contableTransaccionActionPerformed(evt);
			}
			//BUSQUEDA ARBOL CAMPO
			else if(sTipo.equals("id_cuenta_contableTransaccionArbol")) {
				this.abrirFrameTreeCuentaContable("BUSQUEDA_FK");
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_cuenta_contableTransaccionUpdate")) {
				this.jButtonid_cuenta_contableTransaccionUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_cuenta_contableTransaccionBusqueda")) {
				this.jButtonid_cuenta_contableTransaccionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descripcionTransaccionBusqueda")) {
				this.jButtondescripcionTransaccionBusquedaActionPerformed(evt);
			}
			
			
			else if(sTipo.equals("id_cuenta_contableTransaccion")) {
				this.jButtonid_cuenta_contableTransaccionActionPerformed(evt);
			}
			
			
			else if(sTipo.equals("BusquedaPorCodigoTransaccion")) {
				this.jButtonBusquedaPorCodigoTransaccionActionPerformed(evt);
			}
			else if(sTipo.equals("BusquedaPorIdModuloPorTipoTransaccionTransaccion")) {
				this.jButtonBusquedaPorIdModuloPorTipoTransaccionTransaccionActionPerformed(evt);
			}
			else if(sTipo.equals("BusquedaPorNombreTransaccion")) {
				this.jButtonBusquedaPorNombreTransaccionActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdCuentaContableTransaccion")) {
				this.jButtonFK_IdCuentaContableTransaccionActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdTipoComprobanteTransaccion")) {
				this.jButtonFK_IdTipoComprobanteTransaccionActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdTipoRetencionTransaccion")) {
				this.jButtonFK_IdTipoRetencionTransaccionActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdTipoTransaTransaccion")) {
				this.jButtonFK_IdTipoTransaTransaccionActionPerformed(evt);
			}
			
			;
			
			
			TransaccionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.transaccion,new Object(),this.transaccionParameterGeneral,this.transaccionReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TransaccionConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessTransaccion();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTransaccionActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.transaccion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.transaccion);
				
				TransaccionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.transaccion,new Object(),this.transaccionParameterGeneral,this.transaccionReturnGeneral);
				
				


				
				TransaccionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.transaccion,new Object(),this.transaccionParameterGeneral,this.transaccionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Transaccion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Transaccion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,TransaccionConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			Transaccion transaccionLocal=null;
			
			if(!this.getEsControlTabla()) {
				transaccionLocal=this.transaccion;
			} else {
				transaccionLocal=this.transaccionAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TransaccionConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.transaccion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.transaccion);
				
				TransaccionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.transaccion,new Object(),this.transaccionParameterGeneral,this.transaccionReturnGeneral);
							
				
				


				
				TransaccionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.transaccion,new Object(),this.transaccionParameterGeneral,this.transaccionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Transaccion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Transaccion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TransaccionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTransaccionActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTransaccion.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transaccionAnterior =(Transaccion) this.transaccionLogic.getTransaccions().toArray()[this.jTableDatosTransaccion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.transaccionAnterior =(Transaccion) this.transaccions.toArray()[this.jTableDatosTransaccion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TransaccionConstantesFunciones.CLASSNAME);
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
			
			TransaccionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.transaccion,new Object(),this.transaccionParameterGeneral,this.transaccionReturnGeneral);
			
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
			
			


			
			TransaccionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.transaccion,new Object(),this.transaccionParameterGeneral,this.transaccionReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TransaccionConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TransaccionConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TransaccionConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTransaccionActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.transaccion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.transaccion);
				
				TransaccionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.transaccion,new Object(),this.transaccionParameterGeneral,this.transaccionReturnGeneral);
								
						
				


				
				TransaccionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.transaccion,new Object(),this.transaccionParameterGeneral,this.transaccionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Transaccion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Transaccion.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TransaccionConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.transaccion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.transaccion);
				
				TransaccionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.transaccion,new Object(),this.transaccionParameterGeneral,this.transaccionReturnGeneral);
								
				
				


				
				TransaccionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.transaccion,new Object(),this.transaccionParameterGeneral,this.transaccionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Transaccion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Transaccion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TransaccionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTransaccionActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTransaccion.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transaccionAnterior =(Transaccion) this.transaccionLogic.getTransaccions().toArray()[this.jTableDatosTransaccion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.transaccionAnterior =(Transaccion) this.transaccions.toArray()[this.jTableDatosTransaccion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TransaccionConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.transaccion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.transaccion);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TransaccionConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTransaccionActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTransaccion.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transaccionAnterior =(Transaccion) this.transaccionLogic.getTransaccions().toArray()[this.jTableDatosTransaccion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.transaccionAnterior =(Transaccion) this.transaccions.toArray()[this.jTableDatosTransaccion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TransaccionConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTransaccionActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.transaccion);
			
			this.actualizarInformacion("INFO_PADRE",false,this.transaccion);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TransaccionConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.transaccion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.transaccion);
				
				TransaccionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.transaccion,new Object(),this.transaccionParameterGeneral,this.transaccionReturnGeneral);
							
				
				


				
				TransaccionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.transaccion,new Object(),this.transaccionParameterGeneral,this.transaccionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Transaccion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Transaccion.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TransaccionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTransaccionActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTransaccion.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.transaccionAnterior =(Transaccion) this.transaccionLogic.getTransaccions().toArray()[this.jTableDatosTransaccion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.transaccionAnterior =(Transaccion) this.transaccions.toArray()[this.jTableDatosTransaccion.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TransaccionConstantesFunciones.CLASSNAME);
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
			
			TransaccionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.transaccion,new Object(),this.transaccionParameterGeneral,this.transaccionReturnGeneral);
			
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
			
			


			
			TransaccionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.transaccion,new Object(),this.transaccionParameterGeneral,this.transaccionReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TransaccionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TransaccionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TransaccionConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTransaccionActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.transaccion);
			
			this.actualizarInformacion("INFO_PADRE",false,this.transaccion);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TransaccionConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.transaccion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.transaccion);
				
				TransaccionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.transaccion,new Object(),this.transaccionParameterGeneral,this.transaccionReturnGeneral);
								
				
				


				
				TransaccionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.transaccion,new Object(),this.transaccionParameterGeneral,this.transaccionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Transaccion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Transaccion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TransaccionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTransaccionActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTransaccion.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transaccionAnterior =(Transaccion) this.transaccionLogic.getTransaccions().toArray()[this.jTableDatosTransaccion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.transaccionAnterior =(Transaccion) this.transaccions.toArray()[this.jTableDatosTransaccion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TransaccionConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTransaccionActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.transaccion);
			
			this.actualizarInformacion("INFO_PADRE",false,this.transaccion);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TransaccionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTransaccionActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.transaccion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.transaccion);
				
				TransaccionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.transaccion,new Object(),this.transaccionParameterGeneral,this.transaccionReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosTransaccion")) {
					jCheckBoxSeleccionarTodosTransaccionItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosTransaccion")) {
					jCheckBoxSeleccionadosTransaccionItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarTransaccion")) {
					
				}
				
				


				
				
				TransaccionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.transaccion,new Object(),this.transaccionParameterGeneral,this.transaccionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Transaccion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Transaccion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TransaccionConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.transaccion);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.transaccion);
				
				TransaccionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.transaccion,new Object(),this.transaccionParameterGeneral,this.transaccionReturnGeneral);
												
				
				


				
				
				TransaccionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.transaccion,new Object(),this.transaccionParameterGeneral,this.transaccionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Transaccion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Transaccion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TransaccionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTransaccionActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTransaccion.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.transaccionAnterior =(Transaccion) this.transaccionLogic.getTransaccions().toArray()[this.jTableDatosTransaccion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.transaccionAnterior =(Transaccion) this.transaccions.toArray()[this.jTableDatosTransaccion.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TransaccionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTransaccionActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.transaccion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.transaccion);
				
				TransaccionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.transaccion,new Object(),this.transaccionParameterGeneral,this.transaccionReturnGeneral);
				
				
				TransaccionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.transaccion,new Object(),this.transaccionParameterGeneral,this.transaccionReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TransaccionConstantesFunciones.CLASSNAME);
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
			
			TransaccionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.transaccion,new Object(),this.transaccionParameterGeneral,this.transaccionReturnGeneral);
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
			
			


			if(sTipo.equals("id_moduloTransaccion")) {
				if(jComboBoxGenerico==null) {
					jComboBoxGenerico=this.jInternalFrameDetalleFormTransaccion.jComboBoxid_moduloTransaccion;
				}

				if(this.transaccionSessionBean.getConGuardarRelaciones()) {
					//classes=TransaccionConstantesFunciones.getClassesRelationshipsOfTransaccion(new ArrayList<Classe>(),DeepLoadType.NONE);
				}


				this.procesarActionsCombosForeignKeyModulo(jComboBoxGenerico,"Formulario");

				this.recargarFormTransaccion(sTipo,"Formulario",eventoGlobalTipo,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,"COMBOBOX",classes,false,esControlTabla);
			}
			 else if(sTipo.equals("jComboBoxid_moduloBusquedaPorIdModuloPorTipoTransaccionTransaccion")) {
				this.procesarActionsCombosForeignKeyModulo(jComboBoxid_moduloBusquedaPorIdModuloPorTipoTransaccionTransaccion,"BusquedaPorIdModuloPorTipoTransaccion");
				//recargarFormTransaccionModulo(jComboBoxid_moduloBusquedaPorIdModuloPorTipoTransaccionTransaccion,"BusquedaPorIdModuloPorTipoTransaccion");
			}
			
			TransaccionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.transaccion,new Object(),this.transaccionParameterGeneral,this.transaccionReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TransaccionConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTransaccionActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.transaccion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.transaccion);
				
				TransaccionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.transaccion,new Object(),this.transaccionParameterGeneral,this.transaccionReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


			if(sTipo.equals("id_moduloTransaccion")) {
				if(jComboBoxGenerico==null) {
					jComboBoxGenerico=this.jInternalFrameDetalleFormTransaccion.jComboBoxid_moduloTransaccion;
				}

				if(this.transaccionSessionBean.getConGuardarRelaciones()) {
					//classes=TransaccionConstantesFunciones.getClassesRelationshipsOfTransaccion(new ArrayList<Classe>(),DeepLoadType.NONE);
				}


				this.procesarActionsCombosForeignKeyModulo(jComboBoxGenerico,"Formulario");

				this.recargarFormTransaccion(sTipo,"Formulario",eventoGlobalTipo,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,"COMBOBOX",classes,false,esControlTabla);
			}
			 else if(sTipo.equals("jComboBoxid_moduloBusquedaPorIdModuloPorTipoTransaccionTransaccion")) {
				this.procesarActionsCombosForeignKeyModulo(jComboBoxid_moduloBusquedaPorIdModuloPorTipoTransaccionTransaccion,"BusquedaPorIdModuloPorTipoTransaccion");
				//recargarFormTransaccionModulo(jComboBoxid_moduloBusquedaPorIdModuloPorTipoTransaccionTransaccion,"BusquedaPorIdModuloPorTipoTransaccion");
			}
				
				TransaccionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.transaccion,new Object(),this.transaccionParameterGeneral,this.transaccionReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Transaccion.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Transaccion.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TransaccionConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.transaccion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.transaccion);
				
				TransaccionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.transaccion,new Object(),this.transaccionParameterGeneral,this.transaccionReturnGeneral);
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
				
				


			if(sTipo.equals("id_moduloTransaccion")) {
				if(jComboBoxGenerico==null) {
					jComboBoxGenerico=this.jInternalFrameDetalleFormTransaccion.jComboBoxid_moduloTransaccion;
				}

				if(this.transaccionSessionBean.getConGuardarRelaciones()) {
					//classes=TransaccionConstantesFunciones.getClassesRelationshipsOfTransaccion(new ArrayList<Classe>(),DeepLoadType.NONE);
				}


				this.procesarActionsCombosForeignKeyModulo(jComboBoxGenerico,"Formulario");

				this.recargarFormTransaccion(sTipo,"Formulario",eventoGlobalTipo,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,"COMBOBOX",classes,false,esControlTabla);
			}
			 else if(sTipo.equals("jComboBoxid_moduloBusquedaPorIdModuloPorTipoTransaccionTransaccion")) {
				this.procesarActionsCombosForeignKeyModulo(jComboBoxid_moduloBusquedaPorIdModuloPorTipoTransaccionTransaccion,"BusquedaPorIdModuloPorTipoTransaccion");
				//recargarFormTransaccionModulo(jComboBoxid_moduloBusquedaPorIdModuloPorTipoTransaccionTransaccion,"BusquedaPorIdModuloPorTipoTransaccion");
			}
				
				TransaccionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.transaccion,new Object(),this.transaccionParameterGeneral,this.transaccionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Transaccion.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Transaccion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TransaccionConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTransaccionActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTransaccion.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transaccionAnterior =(Transaccion) this.transaccionLogic.getTransaccions().toArray()[this.jTableDatosTransaccion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.transaccionAnterior =(Transaccion) this.transaccions.toArray()[this.jTableDatosTransaccion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TransaccionConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				TransaccionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.transaccion,new Object(),this.transaccionParameterGeneral,this.transaccionReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarTransaccion")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosTransaccionListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosTransaccion.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.transaccion =(Transaccion) this.transaccionLogic.getTransaccions().toArray()[this.jTableDatosTransaccion.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.transaccion =(Transaccion) this.transaccions.toArray()[this.jTableDatosTransaccion.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.transaccion);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarTransaccion")) {
				
				}
				
				TransaccionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.transaccion,new Object(),this.transaccionParameterGeneral,this.transaccionReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TransaccionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			TransaccionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.transaccion,new Object(),this.transaccionParameterGeneral,this.transaccionReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarTransaccion")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosTransaccion.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarTransaccion")) {
			
			}
			
			TransaccionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.transaccion,new Object(),this.transaccionParameterGeneral,this.transaccionReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TransaccionConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessTransaccion();
			
			TransaccionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.transaccion,new Object(),this.transaccionParameterGeneral,this.transaccionReturnGeneral);
			
			if(sTipo.equals("NuevoTransaccion")) {
				jButtonNuevoTransaccionActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarTransaccion")) {
				jButtonDuplicarTransaccionActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarTransaccion")) {
				jButtonCopiarTransaccionActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormTransaccion")) {
				jButtonVerFormTransaccionActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesTransaccion")) {
				jButtonNuevoTransaccionActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarTransaccion")) {
				jButtonModificarTransaccionActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarTransaccion")) {
				jButtonActualizarTransaccionActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarTransaccion")) {
				jButtonEliminarTransaccionActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaTransaccion")) {
				jButtonGuardarCambiosTransaccionActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarTransaccion")) {
				jButtonCancelarTransaccionActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarTransaccion")) {
				jButtonCerrarTransaccionActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTransaccion")) {
				jButtonGuardarCambiosTransaccionActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosTransaccion")) {
				jButtonNuevoGuardarCambiosTransaccionActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByTransaccion")) {
				jButtonAbrirOrderByTransaccionActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionTransaccion")) {
				jButtonRecargarInformacionTransaccionActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresTransaccion")) {
				jButtonAnterioresTransaccionActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesTransaccion")) {
				jButtonSiguientesTransaccionActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTransaccionBusqueda")) {
				this.jButtonidTransaccionBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaTransaccionUpdate")) {
				this.jButtonid_empresaTransaccionUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaTransaccionBusqueda")) {
				this.jButtonid_empresaTransaccionBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalTransaccionUpdate")) {
				this.jButtonid_sucursalTransaccionUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalTransaccionBusqueda")) {
				this.jButtonid_sucursalTransaccionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoTransaccionBusqueda")) {
				this.jButtoncodigoTransaccionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTransaccionBusqueda")) {
				this.jButtonnombreTransaccionBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_moduloTransaccionUpdate")) {
				this.jButtonid_moduloTransaccionUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_moduloTransaccionBusqueda")) {
				this.jButtonid_moduloTransaccionBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_transaTransaccionUpdate")) {
				this.jButtonid_tipo_transaTransaccionUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_transaTransaccionBusqueda")) {
				this.jButtonid_tipo_transaTransaccionBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_comprobanteTransaccionUpdate")) {
				this.jButtonid_tipo_comprobanteTransaccionUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_comprobanteTransaccionBusqueda")) {
				this.jButtonid_tipo_comprobanteTransaccionBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_transaccion_moduloTransaccionUpdate")) {
				this.jButtonid_tipo_transaccion_moduloTransaccionUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_transaccion_moduloTransaccionBusqueda")) {
				this.jButtonid_tipo_transaccion_moduloTransaccionBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_retencionTransaccionUpdate")) {
				this.jButtonid_tipo_retencionTransaccionUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_retencionTransaccionBusqueda")) {
				this.jButtonid_tipo_retencionTransaccionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_cuenta_contableTransaccion")) {
				this.jButtonid_cuenta_contableTransaccionActionPerformed(evt);
			}
			//BUSQUEDA ARBOL CAMPO
			else if(sTipo.equals("id_cuenta_contableTransaccionArbol")) {
				this.abrirFrameTreeCuentaContable("BUSQUEDA_FK");
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_cuenta_contableTransaccionUpdate")) {
				this.jButtonid_cuenta_contableTransaccionUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_cuenta_contableTransaccionBusqueda")) {
				this.jButtonid_cuenta_contableTransaccionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descripcionTransaccionBusqueda")) {
				this.jButtondescripcionTransaccionBusquedaActionPerformed(evt);
			}
			
			TransaccionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.transaccion,new Object(),this.transaccionParameterGeneral,this.transaccionReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TransaccionConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessTransaccion();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			TransaccionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.transaccion,new Object(),this.transaccionParameterGeneral,this.transaccionReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameTransaccion")) {
				closingInternalFrameTransaccion();
				
			} else if(sTipo.equals("jButtonCancelarTransaccion")) {
				JInternalFrameBase jInternalFrameDetalleFormTransaccion = (JInternalFrameBase)evt.getSource();
	            	
	            TransaccionBeanSwingJInternalFrame jInternalFrameParent=(TransaccionBeanSwingJInternalFrame)jInternalFrameDetalleFormTransaccion.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarTransaccionActionPerformed(null);
			}
			
			TransaccionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.transaccion,new Object(),this.transaccionParameterGeneral,this.transaccionReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TransaccionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormTransaccion(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormTransaccion(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormTransaccion(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.transaccion)) {
			if(!esControlTabla) {
				if(TransaccionJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualTransaccion(this.transaccion,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTransaccion(this.transaccion);			
				}
				
				if(this.transaccionSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualTransaccion(this.transaccion,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.transaccionReturnGeneral=transaccionLogic.procesarEventosTransaccionsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.transaccionLogic.getTransaccions(),this.transaccion,this.transaccionParameterGeneral,this.isEsNuevoTransaccion,classes);//this.transaccionLogic.getTransaccion()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanTransaccion(this.transaccionReturnGeneral,this.transaccionBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.transaccionSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanTransaccion(classes,this.transaccionReturnGeneral,this.transaccionBean,false);
					}
						
					if(this.transaccionReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyTransaccion(this.transaccionReturnGeneral.getTransaccion());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioTransaccion(this.transaccionReturnGeneral.getTransaccion());	
					}
						
					if(this.transaccionReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioTransaccion(this.transaccionReturnGeneral.getTransaccion(),classes);//this.transaccionBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioTransaccion(this.transaccion,classes);//this.transaccionBean);									
				}
			
				if(TransaccionJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualTransaccion(this.transaccion,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTransaccion(this.transaccion);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.transaccionAnterior!=null) {
						this.transaccion=this.transaccionAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.transaccionReturnGeneral=transaccionLogic.procesarEventosTransaccionsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.transaccionLogic.getTransaccions(),this.transaccion,this.transaccionParameterGeneral,this.isEsNuevoTransaccion,classes);//this.transaccionLogic.getTransaccion()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.transaccionSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.transaccionSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.transaccionReturnGeneral.getTransaccion(),transaccionLogic.getTransaccions());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.transaccionReturnGeneral.getTransaccion(),this.transaccions);
				}
				//ARCHITECTURE
				
				//this.jTableDatosTransaccion.repaint();
				
				//((AbstractTableModel) this.jTableDatosTransaccion.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosTransaccion();
			}
		}
	}
	
	public void actualizarVisualTableDatosTransaccion() throws Exception {
		
		TransaccionModel transaccionModel=(TransaccionModel)this.jTableDatosTransaccion.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			transaccionModel.transaccions=this.transaccionLogic.getTransaccions();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			transaccionModel.transaccions=this.transaccions;
		}
		
		
		((TransaccionModel) this.jTableDatosTransaccion.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaTransaccion() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.gettransaccionAnterior(),this.transaccionLogic.getTransaccions());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.gettransaccionAnterior(),this.transaccions);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosTransaccion();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioTransaccion(Transaccion transaccion,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransaccionConstantesFunciones.CLASSNAME);
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
										
				TransaccionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.transaccion,new Object(),generalEntityParameterGeneral,this.transaccionReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.transaccionSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=TransaccionConstantesFunciones.getClassesRelationshipsOfTransaccion(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=TransaccionConstantesFunciones.getClassesRelationshipsFromStringsOfTransaccion(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormTransaccion(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				TransaccionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.transaccion,new Object(),generalEntityParameterGeneral,this.transaccionReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TransaccionConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioTransaccion(TransaccionBean transaccionBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransaccionConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanTransaccion(ArrayList<Classe> classes,TransaccionReturnGeneral transaccionReturnGeneral,TransaccionBean transaccionBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualTransaccion(Transaccion transaccion,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.transaccion)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormTransaccion = new TransaccionDetalleFormJInternalFrame(jDesktopPane,this.transaccionSessionBean.getConGuardarRelaciones(),this.transaccionSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormTransaccion);
		this.jInternalFrameDetalleFormTransaccion.setVisible(false);
		this.jInternalFrameDetalleFormTransaccion.setSelected(false);						
		
		this.jInternalFrameDetalleFormTransaccion.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormTransaccion.transaccionLogic=this.transaccionLogic;
		
		this.cargarCombosFrameForeignKeyTransaccion("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleTransaccion();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTransaccion();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyTransaccion("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyTransaccion();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormTransaccion.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTransaccion"));
		
		this.jInternalFrameDetalleFormTransaccion.jButtonModificarTransaccion.addActionListener(new ButtonActionListener(this,"ModificarTransaccion"));

		
		this.jInternalFrameDetalleFormTransaccion.jButtonModificarToolBarTransaccion.addActionListener(new ButtonActionListener(this,"ModificarToolBarTransaccion"));
					
		this.jInternalFrameDetalleFormTransaccion.jMenuItemModificarTransaccion.addActionListener(new ButtonActionListener(this,"MenuItemModificarTransaccion"));		
		
		
		
		this.jInternalFrameDetalleFormTransaccion.jButtonActualizarTransaccion.addActionListener (new ButtonActionListener(this,"ActualizarTransaccion"));
		
		
		this.jInternalFrameDetalleFormTransaccion.jButtonActualizarToolBarTransaccion.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTransaccion"));
						
		this.jInternalFrameDetalleFormTransaccion.jMenuItemActualizarTransaccion.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTransaccion"));		
		
		
		
		this.jInternalFrameDetalleFormTransaccion.jButtonEliminarTransaccion.addActionListener (new ButtonActionListener(this,"EliminarTransaccion"));
		
		
		this.jInternalFrameDetalleFormTransaccion.jButtonEliminarToolBarTransaccion.addActionListener (new ButtonActionListener(this,"EliminarToolBarTransaccion"));
								
		this.jInternalFrameDetalleFormTransaccion.jMenuItemEliminarTransaccion.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTransaccion"));		
		
		
		
		this.jInternalFrameDetalleFormTransaccion.jButtonCancelarTransaccion.addActionListener (new ButtonActionListener(this,"CancelarTransaccion"));
		
		
		this.jInternalFrameDetalleFormTransaccion.jButtonCancelarToolBarTransaccion.addActionListener (new ButtonActionListener(this,"CancelarToolBarTransaccion"));
					
		this.jInternalFrameDetalleFormTransaccion.jMenuItemCancelarTransaccion.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTransaccion"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormTransaccion.jMenuItemDetalleCerrarTransaccion.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTransaccion"));		
		
		
		
		this.jInternalFrameDetalleFormTransaccion.jButtonGuardarCambiosToolBarTransaccion.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTransaccion"));
		
		
		
		this.jInternalFrameDetalleFormTransaccion.jButtonGuardarCambiosToolBarTransaccion.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTransaccion"));
		
		
		
		this.jInternalFrameDetalleFormTransaccion.jComboBoxTiposAccionesFormularioTransaccion.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTransaccion"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTransaccion.jButtonidTransaccionBusqueda.addActionListener(new ButtonActionListener(this,"idTransaccionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTransaccion.jButtonid_empresaTransaccionUpdate.addActionListener(new ButtonActionListener(this,"id_empresaTransaccionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTransaccion.jButtonid_empresaTransaccionBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaTransaccionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTransaccion.jButtonid_sucursalTransaccionUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalTransaccionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTransaccion.jButtonid_sucursalTransaccionBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalTransaccionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTransaccion.jButtoncodigoTransaccionBusqueda.addActionListener(new ButtonActionListener(this,"codigoTransaccionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTransaccion.jButtonnombreTransaccionBusqueda.addActionListener(new ButtonActionListener(this,"nombreTransaccionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTransaccion.jButtonid_moduloTransaccionUpdate.addActionListener(new ButtonActionListener(this,"id_moduloTransaccionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTransaccion.jButtonid_moduloTransaccionBusqueda.addActionListener(new ButtonActionListener(this,"id_moduloTransaccionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTransaccion.jButtonid_tipo_transaTransaccionUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_transaTransaccionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTransaccion.jButtonid_tipo_transaTransaccionBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_transaTransaccionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTransaccion.jButtonid_tipo_comprobanteTransaccionUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_comprobanteTransaccionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTransaccion.jButtonid_tipo_comprobanteTransaccionBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_comprobanteTransaccionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTransaccion.jButtonid_tipo_transaccion_moduloTransaccionUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_transaccion_moduloTransaccionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTransaccion.jButtonid_tipo_transaccion_moduloTransaccionBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_transaccion_moduloTransaccionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTransaccion.jButtonid_tipo_retencionTransaccionUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_retencionTransaccionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTransaccion.jButtonid_tipo_retencionTransaccionBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_retencionTransaccionBusqueda"));
		//jButtonid_cuenta_contableTransaccion.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_cuenta_contableTransaccionActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormTransaccion.jButtonid_cuenta_contableTransaccion.addActionListener(new ButtonActionListener(this,"id_cuenta_contableTransaccion"));
		//jButtonid_cuenta_contableTransaccionArbol.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			abrirFrameTreeCuentaContable("BUSQUEDA_FK");
		//		}
		//	}
		//);

		//BUSQUEDA ARBOL CAMPO
		this.jInternalFrameDetalleFormTransaccion.jButtonid_cuenta_contableTransaccionArbol.addActionListener(new ButtonActionListener(this,"id_cuenta_contableTransaccionArbol"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTransaccion.jButtonid_cuenta_contableTransaccionUpdate.addActionListener(new ButtonActionListener(this,"id_cuenta_contableTransaccionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTransaccion.jButtonid_cuenta_contableTransaccionBusqueda.addActionListener(new ButtonActionListener(this,"id_cuenta_contableTransaccionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTransaccion.jButtondescripcionTransaccionBusqueda.addActionListener(new ButtonActionListener(this,"descripcionTransaccionBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormTransaccion.jTabbedPaneRelacionesTransaccion.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTransaccion"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameTransaccion"));
		
		if(this.jInternalFrameDetalleFormTransaccion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTransaccion.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTransaccion"));
		}
		
		this.jTableDatosTransaccion.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarTransaccion"));
		
		this.jTableDatosTransaccion.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarTransaccion"));
		
		this.jButtonNuevoTransaccion.addActionListener(new ButtonActionListener(this,"NuevoTransaccion"));
		
		this.jButtonDuplicarTransaccion.addActionListener(new ButtonActionListener(this,"DuplicarTransaccion"));
		
		this.jButtonCopiarTransaccion.addActionListener(new ButtonActionListener(this,"CopiarTransaccion"));
		
		this.jButtonVerFormTransaccion.addActionListener(new ButtonActionListener(this,"VerFormTransaccion"));
		
		
		this.jButtonNuevoToolBarTransaccion.addActionListener(new ButtonActionListener(this,"NuevoToolBarTransaccion"));
			
		this.jButtonDuplicarToolBarTransaccion.addActionListener(new ButtonActionListener(this,"DuplicarToolBarTransaccion"));
			
		this.jMenuItemNuevoTransaccion.addActionListener (new ButtonActionListener(this,"MenuItemNuevoTransaccion"));
			
		this.jMenuItemDuplicarTransaccion.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarTransaccion"));		
		
		
		this.jButtonNuevoRelacionesTransaccion.addActionListener (new ButtonActionListener(this,"NuevoRelacionesTransaccion"));
		
		
		this.jButtonNuevoRelacionesToolBarTransaccion.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarTransaccion"));
			
		this.jMenuItemNuevoRelacionesTransaccion.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesTransaccion"));		
		
		
		if(this.jInternalFrameDetalleFormTransaccion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTransaccion.jButtonModificarTransaccion.addActionListener(new ButtonActionListener(this,"ModificarTransaccion"));
		}
		
		
		if(this.jInternalFrameDetalleFormTransaccion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTransaccion.jButtonModificarToolBarTransaccion.addActionListener(new ButtonActionListener(this,"ModificarToolBarTransaccion"));
			
			this.jInternalFrameDetalleFormTransaccion.jMenuItemModificarTransaccion.addActionListener(new ButtonActionListener(this,"MenuItemModificarTransaccion"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTransaccion!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormTransaccion.jButtonActualizarTransaccion.addActionListener (new ButtonActionListener(this,"ActualizarTransaccion"));
		}
		
		
		if(this.jInternalFrameDetalleFormTransaccion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTransaccion.jButtonActualizarToolBarTransaccion.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTransaccion"));
				
			this.jInternalFrameDetalleFormTransaccion.jMenuItemActualizarTransaccion.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTransaccion"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTransaccion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTransaccion.jButtonEliminarTransaccion.addActionListener (new ButtonActionListener(this,"EliminarTransaccion"));
		}
		
		
		if(this.jInternalFrameDetalleFormTransaccion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTransaccion.jButtonEliminarToolBarTransaccion.addActionListener (new ButtonActionListener(this,"EliminarToolBarTransaccion"));
						
			this.jInternalFrameDetalleFormTransaccion.jMenuItemEliminarTransaccion.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTransaccion"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTransaccion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTransaccion.jButtonCancelarTransaccion.addActionListener (new ButtonActionListener(this,"CancelarTransaccion"));
		}
		
		
		if(this.jInternalFrameDetalleFormTransaccion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTransaccion.jButtonCancelarToolBarTransaccion.addActionListener (new ButtonActionListener(this,"CancelarToolBarTransaccion"));
			
			this.jInternalFrameDetalleFormTransaccion.jMenuItemCancelarTransaccion.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTransaccion"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarTransaccion.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarTransaccion"));		
		
		
		this.jButtonCerrarTransaccion.addActionListener (new ButtonActionListener(this,"CerrarTransaccion"));
		
		
		this.jButtonCerrarToolBarTransaccion.addActionListener (new ButtonActionListener(this,"CerrarToolBarTransaccion"));
			
		this.jMenuItemCerrarTransaccion.addActionListener (new ButtonActionListener(this,"MenuItemCerrarTransaccion"));
			
		if(this.jInternalFrameDetalleFormTransaccion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTransaccion.jMenuItemDetalleCerrarTransaccion.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTransaccion"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTransaccion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTransaccion.jButtonGuardarCambiosTransaccion.addActionListener (new ButtonActionListener(this,"GuardarCambiosTransaccion"));
		}
		
		
		if(this.jInternalFrameDetalleFormTransaccion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTransaccion.jButtonGuardarCambiosToolBarTransaccion.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTransaccion"));
		}
		
		this.jButtonCopiarToolBarTransaccion.addActionListener (new ButtonActionListener(this,"CopiarToolBarTransaccion"));
			
		this.jButtonVerFormToolBarTransaccion.addActionListener (new ButtonActionListener(this,"VerFormToolBarTransaccion"));
		
		this.jMenuItemGuardarCambiosTransaccion.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosTransaccion"));
			
		this.jMenuItemCopiarTransaccion.addActionListener (new ButtonActionListener(this,"MenuItemCopiarTransaccion"));		
		
		this.jMenuItemVerFormTransaccion.addActionListener (new ButtonActionListener(this,"MenuItemVerFormTransaccion"));		
		
		
		this.jButtonGuardarCambiosTablaTransaccion.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTransaccion"));
		
		
		this.jButtonGuardarCambiosTablaToolBarTransaccion.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarTransaccion"));
			
		this.jMenuItemGuardarCambiosTablaTransaccion.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTransaccion"));		
		
		
		
		this.jButtonRecargarInformacionTransaccion.addActionListener (new ButtonActionListener(this,"RecargarInformacionTransaccion"));
					
		this.jButtonRecargarInformacionToolBarTransaccion.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarTransaccion"));
		
		this.jMenuItemRecargarInformacionTransaccion.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionTransaccion"));		
		
		
		
		this.jButtonAnterioresTransaccion.addActionListener (new ButtonActionListener(this,"AnterioresTransaccion"));
		
		
		this.jButtonAnterioresToolBarTransaccion.addActionListener (new ButtonActionListener(this,"AnterioresToolBarTransaccion"));
		
		this.jMenuItemAnterioresTransaccion.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresTransaccion"));		
		
		
		this.jButtonSiguientesTransaccion.addActionListener (new ButtonActionListener(this,"SiguientesTransaccion"));
		
		
		this.jButtonSiguientesToolBarTransaccion.addActionListener (new ButtonActionListener(this,"SiguientesToolBarTransaccion"));
			
		this.jMenuItemSiguientesTransaccion.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesTransaccion"));
			
		this.jMenuItemAbrirOrderByTransaccion.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByTransaccion"));
			
		this.jMenuItemMostrarOcultarTransaccion.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarTransaccion"));
			
		this.jMenuItemDetalleAbrirOrderByTransaccion.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByTransaccion"));
			
		this.jMenuItemDetalleMostarOcultarTransaccion.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarTransaccion"));		
		
		
		this.jButtonNuevoGuardarCambiosTransaccion.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosTransaccion"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarTransaccion.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarTransaccion"));
			
		this.jMenuItemNuevoGuardarCambiosTransaccion.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosTransaccion"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosTransaccion.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosTransaccion"));

		this.jCheckBoxSeleccionadosTransaccion.addItemListener(new CheckBoxItemListener(this,"SeleccionadosTransaccion"));
		
		if(this.jInternalFrameDetalleFormTransaccion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTransaccion.jComboBoxTiposAccionesFormularioTransaccion.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTransaccion"));
		}
		
		
		this.jComboBoxTiposRelacionesTransaccion.addActionListener (new ButtonActionListener(this,"TiposRelacionesTransaccion"));
			
		this.jComboBoxTiposAccionesTransaccion.addActionListener (new ButtonActionListener(this,"TiposAccionesTransaccion"));
					
		this.jComboBoxTiposSeleccionarTransaccion.addActionListener (new ButtonActionListener(this,"TiposSeleccionarTransaccion"));
			
		this.jTextFieldValorCampoGeneralTransaccion.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralTransaccion"));		
		
		
		if(this.jInternalFrameDetalleFormTransaccion!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTransaccion.jButtonidTransaccionBusqueda.addActionListener(new ButtonActionListener(this,"idTransaccionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTransaccion.jButtonid_empresaTransaccionUpdate.addActionListener(new ButtonActionListener(this,"id_empresaTransaccionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTransaccion.jButtonid_empresaTransaccionBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaTransaccionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTransaccion.jButtonid_sucursalTransaccionUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalTransaccionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTransaccion.jButtonid_sucursalTransaccionBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalTransaccionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTransaccion.jButtoncodigoTransaccionBusqueda.addActionListener(new ButtonActionListener(this,"codigoTransaccionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTransaccion.jButtonnombreTransaccionBusqueda.addActionListener(new ButtonActionListener(this,"nombreTransaccionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTransaccion.jButtonid_moduloTransaccionUpdate.addActionListener(new ButtonActionListener(this,"id_moduloTransaccionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTransaccion.jButtonid_moduloTransaccionBusqueda.addActionListener(new ButtonActionListener(this,"id_moduloTransaccionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTransaccion.jButtonid_tipo_transaTransaccionUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_transaTransaccionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTransaccion.jButtonid_tipo_transaTransaccionBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_transaTransaccionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTransaccion.jButtonid_tipo_comprobanteTransaccionUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_comprobanteTransaccionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTransaccion.jButtonid_tipo_comprobanteTransaccionBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_comprobanteTransaccionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTransaccion.jButtonid_tipo_transaccion_moduloTransaccionUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_transaccion_moduloTransaccionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTransaccion.jButtonid_tipo_transaccion_moduloTransaccionBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_transaccion_moduloTransaccionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTransaccion.jButtonid_tipo_retencionTransaccionUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_retencionTransaccionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTransaccion.jButtonid_tipo_retencionTransaccionBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_retencionTransaccionBusqueda"));
		//jButtonid_cuenta_contableTransaccion.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_cuenta_contableTransaccionActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormTransaccion.jButtonid_cuenta_contableTransaccion.addActionListener(new ButtonActionListener(this,"id_cuenta_contableTransaccion"));
		//jButtonid_cuenta_contableTransaccionArbol.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			abrirFrameTreeCuentaContable("BUSQUEDA_FK");
		//		}
		//	}
		//);

		//BUSQUEDA ARBOL CAMPO
		this.jInternalFrameDetalleFormTransaccion.jButtonid_cuenta_contableTransaccionArbol.addActionListener(new ButtonActionListener(this,"id_cuenta_contableTransaccionArbol"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTransaccion.jButtonid_cuenta_contableTransaccionUpdate.addActionListener(new ButtonActionListener(this,"id_cuenta_contableTransaccionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTransaccion.jButtonid_cuenta_contableTransaccionBusqueda.addActionListener(new ButtonActionListener(this,"id_cuenta_contableTransaccionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTransaccion.jButtondescripcionTransaccionBusqueda.addActionListener(new ButtonActionListener(this,"descripcionTransaccionBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonBusquedaPorCodigoTransaccion.addActionListener(new ButtonActionListener(this,"BusquedaPorCodigoTransaccion"));

			this.jButtonBusquedaPorIdModuloPorTipoTransaccionTransaccion.addActionListener(new ButtonActionListener(this,"BusquedaPorIdModuloPorTipoTransaccionTransaccion"));

			this.jButtonBusquedaPorNombreTransaccion.addActionListener(new ButtonActionListener(this,"BusquedaPorNombreTransaccion"));

			this.jButtonFK_IdCuentaContableTransaccion.addActionListener(new ButtonActionListener(this,"FK_IdCuentaContableTransaccion"));

			this.jButtonBuscarFK_IdCuentaContableid_cuenta_contableTransaccion.addActionListener(new ButtonActionListener(this,"id_cuenta_contableTransaccion"));

			this.jButtonFK_IdTipoComprobanteTransaccion.addActionListener(new ButtonActionListener(this,"FK_IdTipoComprobanteTransaccion"));

			this.jButtonFK_IdTipoRetencionTransaccion.addActionListener(new ButtonActionListener(this,"FK_IdTipoRetencionTransaccion"));

			this.jButtonFK_IdTipoTransaTransaccion.addActionListener(new ButtonActionListener(this,"FK_IdTipoTransaTransaccion"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoTransaccion!=null) {
				this.jInternalFrameReporteDinamicoTransaccion.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTransaccion"));
				this.jInternalFrameReporteDinamicoTransaccion.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTransaccion"));
				this.jInternalFrameReporteDinamicoTransaccion.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTransaccion"));
			}
			
			//this.jButtonCerrarReporteDinamicoTransaccion.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTransaccion"));				
			//this.jButtonGenerarReporteDinamicoTransaccion.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTransaccion"));
			//this.jButtonGenerarExcelReporteDinamicoTransaccion.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTransaccion"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionTransaccion!=null) {
				this.jInternalFrameImportacionTransaccion.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTransaccion"));
				this.jInternalFrameImportacionTransaccion.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTransaccion"));
				this.jInternalFrameImportacionTransaccion.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTransaccion"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByTransaccion.addActionListener (new ButtonActionListener(this,"AbrirOrderByTransaccion"));
			
			this.jButtonAbrirOrderByToolBarTransaccion.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarTransaccion"));			
			
			if(this.jInternalFrameOrderByTransaccion!=null) {
				this.jInternalFrameOrderByTransaccion.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTransaccion"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormTransaccion!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormTransaccion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTransaccion.jTabbedPaneRelacionesTransaccion.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTransaccion"));
		
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
            		closingInternalFrameTransaccion();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormTransaccion.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormTransaccion = (JInternalFrameBase)event.getSource();
	            	
	            TransaccionBeanSwingJInternalFrame jInternalFrameParent=(TransaccionBeanSwingJInternalFrame)jInternalFrameDetalleFormTransaccion.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarTransaccionActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosTransaccion.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosTransaccionListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosTransaccion.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosTransaccion.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoTransaccion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTransaccionActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarTransaccion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTransaccionActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoTransaccion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTransaccionActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoTransaccion";
		inputMap = this.jButtonNuevoTransaccion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoTransaccion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTransaccionActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesTransaccion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTransaccionActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarTransaccion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTransaccionActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesTransaccion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTransaccionActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesTransaccion";
		inputMap = this.jButtonNuevoRelacionesTransaccion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesTransaccion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTransaccionActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarTransaccion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTransaccionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarTransaccion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTransaccionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarTransaccion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTransaccionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarTransaccion";
		inputMap = this.jButtonModificarTransaccion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarTransaccion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarTransaccionActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarTransaccion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTransaccionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarTransaccion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTransaccionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarTransaccion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTransaccionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarTransaccion";
		inputMap = this.jButtonActualizarTransaccion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarTransaccion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarTransaccionActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarTransaccion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTransaccionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarTransaccion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTransaccionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarTransaccion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTransaccionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarTransaccion";
		inputMap = this.jButtonEliminarTransaccion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarTransaccion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarTransaccionActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarTransaccion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTransaccionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarTransaccion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTransaccionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarTransaccion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTransaccionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarTransaccion";
		inputMap = this.jButtonCancelarTransaccion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarTransaccion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarTransaccionActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarTransaccion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTransaccionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarTransaccion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTransaccionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarTransaccion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTransaccionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarTransaccion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarTransaccionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarTransaccionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarTransaccion";
		inputMap = this.jButtonCerrarTransaccion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarTransaccion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarTransaccionActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormTransaccion.jButtonGuardarCambiosTransaccion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTransaccionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarTransaccion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTransaccionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTransaccion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTransaccionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaTransaccion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTransaccionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarTransaccion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTransaccionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaTransaccion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTransaccionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosTransaccion";
		inputMap = this.jInternalFrameDetalleFormTransaccion.jButtonGuardarCambiosTransaccion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormTransaccion.jButtonGuardarCambiosTransaccion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosTransaccionActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionTransaccion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTransaccionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarTransaccion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTransaccionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionTransaccion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTransaccionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresTransaccion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTransaccionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarTransaccion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTransaccionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresTransaccion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTransaccionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesTransaccion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTransaccionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarTransaccion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTransaccionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesTransaccion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTransaccionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosTransaccion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTransaccionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarTransaccion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTransaccionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosTransaccion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTransaccionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosTransaccion.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosTransaccionItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesTransaccion.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesTransaccionActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarTransaccion.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarTransaccionActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralTransaccion.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralTransaccionActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTransaccion.jButtonidTransaccionBusqueda.addActionListener(new ButtonActionListener(this,"idTransaccionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTransaccion.jButtonid_empresaTransaccionUpdate.addActionListener(new ButtonActionListener(this,"id_empresaTransaccionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTransaccion.jButtonid_empresaTransaccionBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaTransaccionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTransaccion.jButtonid_sucursalTransaccionUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalTransaccionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTransaccion.jButtonid_sucursalTransaccionBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalTransaccionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTransaccion.jButtoncodigoTransaccionBusqueda.addActionListener(new ButtonActionListener(this,"codigoTransaccionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTransaccion.jButtonnombreTransaccionBusqueda.addActionListener(new ButtonActionListener(this,"nombreTransaccionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTransaccion.jButtonid_moduloTransaccionUpdate.addActionListener(new ButtonActionListener(this,"id_moduloTransaccionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTransaccion.jButtonid_moduloTransaccionBusqueda.addActionListener(new ButtonActionListener(this,"id_moduloTransaccionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTransaccion.jButtonid_tipo_transaTransaccionUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_transaTransaccionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTransaccion.jButtonid_tipo_transaTransaccionBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_transaTransaccionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTransaccion.jButtonid_tipo_comprobanteTransaccionUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_comprobanteTransaccionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTransaccion.jButtonid_tipo_comprobanteTransaccionBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_comprobanteTransaccionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTransaccion.jButtonid_tipo_transaccion_moduloTransaccionUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_transaccion_moduloTransaccionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTransaccion.jButtonid_tipo_transaccion_moduloTransaccionBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_transaccion_moduloTransaccionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTransaccion.jButtonid_tipo_retencionTransaccionUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_retencionTransaccionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTransaccion.jButtonid_tipo_retencionTransaccionBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_retencionTransaccionBusqueda"));
		//jButtonid_cuenta_contableTransaccion.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_cuenta_contableTransaccionActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormTransaccion.jButtonid_cuenta_contableTransaccion.addActionListener(new ButtonActionListener(this,"id_cuenta_contableTransaccion"));
		//jButtonid_cuenta_contableTransaccionArbol.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			abrirFrameTreeCuentaContable("BUSQUEDA_FK");
		//		}
		//	}
		//);

		//BUSQUEDA ARBOL CAMPO
		this.jInternalFrameDetalleFormTransaccion.jButtonid_cuenta_contableTransaccionArbol.addActionListener(new ButtonActionListener(this,"id_cuenta_contableTransaccionArbol"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTransaccion.jButtonid_cuenta_contableTransaccionUpdate.addActionListener(new ButtonActionListener(this,"id_cuenta_contableTransaccionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTransaccion.jButtonid_cuenta_contableTransaccionBusqueda.addActionListener(new ButtonActionListener(this,"id_cuenta_contableTransaccionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTransaccion.jButtondescripcionTransaccionBusqueda.addActionListener(new ButtonActionListener(this,"descripcionTransaccionBusqueda"));
		
		
		this.jButtonBusquedaPorCodigoTransaccion.addActionListener(new ButtonActionListener(this,"BusquedaPorCodigoTransaccion"));

		this.jButtonBusquedaPorIdModuloPorTipoTransaccionTransaccion.addActionListener(new ButtonActionListener(this,"BusquedaPorIdModuloPorTipoTransaccionTransaccion"));

		this.jButtonBusquedaPorNombreTransaccion.addActionListener(new ButtonActionListener(this,"BusquedaPorNombreTransaccion"));

		this.jButtonFK_IdCuentaContableTransaccion.addActionListener(new ButtonActionListener(this,"FK_IdCuentaContableTransaccion"));

		this.jButtonBuscarFK_IdCuentaContableid_cuenta_contableTransaccion.addActionListener(new ButtonActionListener(this,"id_cuenta_contableTransaccion"));

		this.jButtonFK_IdTipoComprobanteTransaccion.addActionListener(new ButtonActionListener(this,"FK_IdTipoComprobanteTransaccion"));

		this.jButtonFK_IdTipoRetencionTransaccion.addActionListener(new ButtonActionListener(this,"FK_IdTipoRetencionTransaccion"));

		this.jButtonFK_IdTipoTransaTransaccion.addActionListener(new ButtonActionListener(this,"FK_IdTipoTransaTransaccion"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoTransaccion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoTransaccionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoTransaccion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoTransaccionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoTransaccion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoTransaccionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionTransaccion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionTransaccionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionTransaccion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionTransaccionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionTransaccion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionTransaccionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarTransaccionActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarTransaccion.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransaccionConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosTransaccion(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(Transaccion transaccionAux:this.transaccionLogic.getTransaccions()) {
					transaccionAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Transaccion transaccionAux:transaccions) {
					transaccionAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransaccionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosTransaccionItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTransaccion(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(Transaccion transaccionAux:this.transaccionLogic.getTransaccions()) {
						transaccionAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(Transaccion transaccionAux:transaccions) {
						transaccionAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(Transaccion transaccionAux:this.transaccionLogic.getTransaccions()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(Transaccion transaccionAux:transaccions) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaTransaccion(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTransaccion.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTransaccion.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTransaccion,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransaccionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosTransaccionItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTransaccion(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosTransaccion.getSelectedRows();
			
			Transaccion transaccionLocal=new Transaccion();
			
			//this.seleccionarTodosTransaccion(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					transaccionLocal =(Transaccion) this.transaccionLogic.getTransaccions().toArray()[this.jTableDatosTransaccion.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					transaccionLocal =(Transaccion) this.transaccions.toArray()[this.jTableDatosTransaccion.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				transaccionLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(Transaccion transaccionAux:this.transaccionLogic.getTransaccions()) {
						transaccionAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(Transaccion transaccionAux:transaccions) {
						transaccionAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaTransaccion(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTransaccion.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTransaccion.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTransaccion,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransaccionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualTransaccionItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransaccionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarTransaccionParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransaccionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralTransaccionActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingTransaccion(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralTransaccion.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(Transaccion transaccionAux:this.transaccionLogic.getTransaccions()) {
				
						if(sTipoSeleccionar.equals(TransaccionConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							transaccionAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TransaccionConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							transaccionAux.setnombre(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TransaccionConstantesFunciones.LABEL_DESCRIPCION)) {
							existe=true;
							transaccionAux.setdescripcion(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Transaccion transaccionAux:transaccions) {
					
						if(sTipoSeleccionar.equals(TransaccionConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							transaccionAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TransaccionConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							transaccionAux.setnombre(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TransaccionConstantesFunciones.LABEL_DESCRIPCION)) {
							existe=true;
							transaccionAux.setdescripcion(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaTransaccion(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransaccionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesTransaccionActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingTransaccion(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioTransaccion=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesTransaccion.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormTransaccion.jComboBoxTiposAccionesFormularioTransaccion.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteTransaccion) {				
					conSplash=true;//false;										
					
					//this.startProcessTransaccion(conSplash);
				
					this.generarReporteTransaccionsSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTransaccion.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTransaccion.jComboBoxTiposAccionesFormularioTransaccion.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoTransaccionsSeleccionados();
				//this.jComboBoxTiposAccionesTransaccion.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTransaccionsSeleccionados(false);
				//this.jComboBoxTiposAccionesTransaccion.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTransaccionsSeleccionados(true);
				//this.jComboBoxTiposAccionesTransaccion.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTransaccion();
				
				this.exportarTransaccionsSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTransaccion.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTransaccion.jComboBoxTiposAccionesFormularioTransaccion.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionTransaccions();
				//this.importarTransaccions();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTransaccion.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTransaccion.jComboBoxTiposAccionesFormularioTransaccion.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTransaccion();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelTransaccionsSeleccionados();
				//this.jComboBoxTiposAccionesTransaccion.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Transaccion", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessTransaccion();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoTransaccion)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyTransaccion(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Transaccion",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTransaccion.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTransaccion.jComboBoxTiposAccionesFormularioTransaccion.setSelectedIndex(0);					
				}	
			} 			
			else if(TransaccionBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteTransaccion) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessTransaccion(conSplash);
					
						//this.actualizarParametrosGeneralTransaccion();
						
						this.generarReporteProcesoAccionTransaccionsSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesTransaccion.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormTransaccion.jComboBoxTiposAccionesFormularioTransaccion.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(TransaccionBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO TransaccionES SELECCIONADOS?", "MANTENIMIENTO DE Transaccion", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessTransaccion();
				
						this.actualizarParametrosGeneralTransaccion();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.transaccionReturnGeneral=transaccionLogic.procesarAccionTransaccionsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.transaccionLogic.getTransaccions(),this.transaccionParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarTransaccionReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesTransaccion.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormTransaccion.jComboBoxTiposAccionesFormularioTransaccion.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralTransaccion();
					
					TransaccionBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarTransaccionReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesTransaccion.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormTransaccion.jComboBoxTiposAccionesFormularioTransaccion.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,TransaccionConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessTransaccion(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesTransaccionActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessTransaccion();
			
			if(this.jInternalFrameDetalleFormTransaccion==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<Transaccion> transaccionsSeleccionados=new ArrayList<Transaccion>();		
			Transaccion transaccion=new Transaccion();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingTransaccion(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesTransaccion.getSelectedItem();
			
			
			
			
			transaccionsSeleccionados=this.getTransaccionsSeleccionados(true);
			//this.sTipoAccion;
			
			if(transaccionsSeleccionados.size()==1) {
				for(Transaccion transaccionAux:transaccionsSeleccionados) {
					transaccion=transaccionAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransaccionConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessTransaccion();
			
      		//this.finishProcessTransaccion(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarTransaccionReturnGeneral() throws Exception {
		if(this.transaccionReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.transaccionReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.transaccionReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.transaccionReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.transaccionReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.transaccionReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingTransaccion(false);
		}
		
		if(this.transaccionReturnGeneral.getConRetornoLista() || this.transaccionReturnGeneral.getConRetornoObjeto()) {
			if(this.transaccionReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.transaccionLogic.setTransaccions(this.transaccionReturnGeneral.getTransaccions());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.transaccionReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.transaccionLogic.setTransaccion(this.transaccionReturnGeneral.getTransaccion());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingTransaccion(false);
		}
	}
	
	public void actualizarParametrosGeneralTransaccion() throws Exception {
		
		
	}
	
	public ArrayList<Transaccion> getTransaccionsSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<Transaccion> transaccionsSeleccionados=new ArrayList<Transaccion>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioTransaccion) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(Transaccion transaccionAux:transaccionLogic.getTransaccions()) {
					if(transaccionAux.getIsSelected()) {
						transaccionsSeleccionados.add(transaccionAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Transaccion transaccionAux:this.transaccions) {
					if(transaccionAux.getIsSelected()) {
						transaccionsSeleccionados.add(transaccionAux);				
					}
				}
			}
			
			if(transaccionsSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						transaccionsSeleccionados.addAll(this.transaccionLogic.getTransaccions());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						transaccionsSeleccionados.addAll(this.transaccions);				
					}
				}
			}
		} else {
			transaccionsSeleccionados.add(this.transaccion);
		}
		
		return transaccionsSeleccionados;
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
	
	public void generarReporteTransaccionsSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalTransaccionsSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoTransaccionsSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTransaccionsSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTransaccionsSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Transaccion",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesTransaccionsSeleccionados() throws Exception {
		ArrayList<Transaccion> transaccionsSeleccionados=new ArrayList<Transaccion>();		
		
		transaccionsSeleccionados=this.getTransaccionsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteTransaccions("Todos",transaccionsSeleccionados);
		
	}	
	
	public void generarReporteNormalTransaccionsSeleccionados() throws Exception {
		ArrayList<Transaccion> transaccionsSeleccionados=new ArrayList<Transaccion>();		
		
		transaccionsSeleccionados=this.getTransaccionsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteTransaccions("Todos",transaccionsSeleccionados);
	}		
	
	public void generarReporteProcesoAccionTransaccionsSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<Transaccion> transaccionsSeleccionados=new ArrayList<Transaccion>();
		
		transaccionsSeleccionados=this.getTransaccionsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteTransaccions("Todos",transaccionsSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoTransaccionsSeleccionados() throws Exception {
		ArrayList<Transaccion> transaccionsSeleccionados=new ArrayList<Transaccion>();		
		
		
		this.abrirInicializarFrameReporteDinamicoTransaccion();
		
		
		transaccionsSeleccionados=this.getTransaccionsSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoTransaccion();
		
		
		//this.generarReporteTransaccions("Todos",transaccionsSeleccionados ,transaccionImplementable,transaccionImplementableHome);
	}
	
	public void mostrarImportacionTransaccions() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionTransaccion();
		
		this.abrirFrameImportacionTransaccion();		
		
			
		//this.generarReporteTransaccions("Todos",transaccionsSeleccionados ,transaccionImplementable,transaccionImplementableHome);
	}
	
	public void importarTransaccions() throws Exception {		
	
	}
	
	public void exportarTransaccionsSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelTransaccionsSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoTransaccionsSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlTransaccionsSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Transaccion",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoTransaccionsSeleccionados() throws Exception {
		ArrayList<Transaccion> transaccionsSeleccionados=new ArrayList<Transaccion>();		
		
		transaccionsSeleccionados=this.getTransaccionsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"transaccion."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarTransaccion(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(Transaccion transaccionAux:transaccionsSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarTransaccion(transaccionAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//transaccionAux.setsDetalleGeneralEntityReporte(transaccionAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.transaccionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Transaccion",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarTransaccion(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=TransaccionConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TransaccionConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TransaccionConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TransaccionConstantesFunciones.LABEL_IDSUCURSAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TransaccionConstantesFunciones.LABEL_CODIGO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TransaccionConstantesFunciones.LABEL_NOMBRE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TransaccionConstantesFunciones.LABEL_IDMODULO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TransaccionConstantesFunciones.LABEL_IDTIPOTRANSA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TransaccionConstantesFunciones.LABEL_IDTIPOCOMPROBANTE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TransaccionConstantesFunciones.LABEL_IDTIPOTRANSACCIONMODULO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TransaccionConstantesFunciones.LABEL_IDTIPORETENCION;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TransaccionConstantesFunciones.LABEL_IDCUENTACONTABLE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TransaccionConstantesFunciones.LABEL_DESCRIPCION;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarTransaccion(Transaccion transaccion,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=transaccion.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=transaccion.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=transaccion.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=transaccion.getsucursal_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=transaccion.getcodigo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=transaccion.getnombre();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=transaccion.getmodulo_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=transaccion.gettipotransa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=transaccion.gettipocomprobante_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=transaccion.gettipotransaccionmodulo_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=transaccion.gettiporetencion_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=transaccion.getcuentacontable_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=transaccion.getdescripcion();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelTransaccionsSeleccionados() throws Exception {
		ArrayList<Transaccion> transaccionsSeleccionados=new ArrayList<Transaccion>();		
		
		transaccionsSeleccionados=this.getTransaccionsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"transaccion.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("Transaccions");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelTransaccion(row);				
				iRow++;
			}				
			
			for(Transaccion transaccionAux:transaccionsSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelTransaccion(transaccionAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.transaccionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Transaccion",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlTransaccionsSeleccionados() throws Exception {
		ArrayList<Transaccion> transaccionsSeleccionados=new ArrayList<Transaccion>();		
		
		transaccionsSeleccionados=this.getTransaccionsSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"transaccion.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("transaccions");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("transaccion");
			//elementRoot.appendChild(element);
		
			for(Transaccion transaccionAux:transaccionsSeleccionados) {
				element = document.createElement("transaccion");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlTransaccion(transaccionAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.transaccionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Transaccion",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelTransaccion(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(TransaccionConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(TransaccionConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(TransaccionConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(TransaccionConstantesFunciones.LABEL_IDSUCURSAL);
		cell = row.createCell(iColumn++);cell.setCellValue(TransaccionConstantesFunciones.LABEL_CODIGO);
		cell = row.createCell(iColumn++);cell.setCellValue(TransaccionConstantesFunciones.LABEL_NOMBRE);
		cell = row.createCell(iColumn++);cell.setCellValue(TransaccionConstantesFunciones.LABEL_IDMODULO);
		cell = row.createCell(iColumn++);cell.setCellValue(TransaccionConstantesFunciones.LABEL_IDTIPOTRANSA);
		cell = row.createCell(iColumn++);cell.setCellValue(TransaccionConstantesFunciones.LABEL_IDTIPOCOMPROBANTE);
		cell = row.createCell(iColumn++);cell.setCellValue(TransaccionConstantesFunciones.LABEL_IDTIPOTRANSACCIONMODULO);
		cell = row.createCell(iColumn++);cell.setCellValue(TransaccionConstantesFunciones.LABEL_IDTIPORETENCION);
		cell = row.createCell(iColumn++);cell.setCellValue(TransaccionConstantesFunciones.LABEL_IDCUENTACONTABLE);
		cell = row.createCell(iColumn++);cell.setCellValue(TransaccionConstantesFunciones.LABEL_DESCRIPCION);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelTransaccion(Transaccion transaccion,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(transaccion.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(transaccion.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(transaccion.getsucursal_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(transaccion.getcodigo());
		cell = row.createCell(iColumn++);cell.setCellValue(transaccion.getnombre());
		cell = row.createCell(iColumn++);cell.setCellValue(transaccion.getmodulo_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(transaccion.gettipotransa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(transaccion.gettipocomprobante_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(transaccion.gettipotransaccionmodulo_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(transaccion.gettiporetencion_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(transaccion.getcuentacontable_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(transaccion.getdescripcion());				
	}
	
	public void setFilaDatosExportarXmlTransaccion(Transaccion transaccion,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(TransaccionConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(transaccion.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(TransaccionConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(transaccion.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(TransaccionConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(transaccion.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementsucursal_descripcion = document.createElement(TransaccionConstantesFunciones.IDSUCURSAL);
		elementsucursal_descripcion.appendChild(document.createTextNode(transaccion.getsucursal_descripcion()));
		element.appendChild(elementsucursal_descripcion);

		Element elementcodigo = document.createElement(TransaccionConstantesFunciones.CODIGO);
		elementcodigo.appendChild(document.createTextNode(transaccion.getcodigo().trim()));
		element.appendChild(elementcodigo);

		Element elementnombre = document.createElement(TransaccionConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(transaccion.getnombre().trim()));
		element.appendChild(elementnombre);

		Element elementmodulo_descripcion = document.createElement(TransaccionConstantesFunciones.IDMODULO);
		elementmodulo_descripcion.appendChild(document.createTextNode(transaccion.getmodulo_descripcion()));
		element.appendChild(elementmodulo_descripcion);

		Element elementtipotransa_descripcion = document.createElement(TransaccionConstantesFunciones.IDTIPOTRANSA);
		elementtipotransa_descripcion.appendChild(document.createTextNode(transaccion.gettipotransa_descripcion()));
		element.appendChild(elementtipotransa_descripcion);

		Element elementtipocomprobante_descripcion = document.createElement(TransaccionConstantesFunciones.IDTIPOCOMPROBANTE);
		elementtipocomprobante_descripcion.appendChild(document.createTextNode(transaccion.gettipocomprobante_descripcion()));
		element.appendChild(elementtipocomprobante_descripcion);

		Element elementtipotransaccionmodulo_descripcion = document.createElement(TransaccionConstantesFunciones.IDTIPOTRANSACCIONMODULO);
		elementtipotransaccionmodulo_descripcion.appendChild(document.createTextNode(transaccion.gettipotransaccionmodulo_descripcion()));
		element.appendChild(elementtipotransaccionmodulo_descripcion);

		Element elementtiporetencion_descripcion = document.createElement(TransaccionConstantesFunciones.IDTIPORETENCION);
		elementtiporetencion_descripcion.appendChild(document.createTextNode(transaccion.gettiporetencion_descripcion()));
		element.appendChild(elementtiporetencion_descripcion);

		Element elementcuentacontable_descripcion = document.createElement(TransaccionConstantesFunciones.IDCUENTACONTABLE);
		elementcuentacontable_descripcion.appendChild(document.createTextNode(transaccion.getcuentacontable_descripcion()));
		element.appendChild(elementcuentacontable_descripcion);

		Element elementdescripcion = document.createElement(TransaccionConstantesFunciones.DESCRIPCION);
		elementdescripcion.appendChild(document.createTextNode(transaccion.getdescripcion().trim()));
		element.appendChild(elementdescripcion);
	}
	
	public void generarReporteGroupGenericoTransaccionsSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<Transaccion> transaccionsSeleccionados=new ArrayList<Transaccion>();
		
		transaccionsSeleccionados=this.getTransaccionsSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoTransaccion(transaccionsSeleccionados);
		
		this.generarReporteTransaccions("Todos",transaccionsSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoTransaccion(ArrayList<Transaccion> transaccionsSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(Transaccion transaccionAux:transaccionsSeleccionados) {
				transaccionAux.setsDetalleGeneralEntityReporte(transaccionAux.toString());
			
				if(sTipoSeleccionar.equals(TransaccionConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					transaccionAux.setsDescripcionGeneralEntityReporte1(transaccionAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(TransaccionConstantesFunciones.LABEL_IDSUCURSAL)) {
					existe=true;
					transaccionAux.setsDescripcionGeneralEntityReporte1(transaccionAux.getsucursal_descripcion());
				}
				 else if(sTipoSeleccionar.equals(TransaccionConstantesFunciones.LABEL_CODIGO)) {
					existe=true;
					transaccionAux.setsDescripcionGeneralEntityReporte1(transaccionAux.getcodigo());
				}
				 else if(sTipoSeleccionar.equals(TransaccionConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					transaccionAux.setsDescripcionGeneralEntityReporte1(transaccionAux.getnombre());
				}
				 else if(sTipoSeleccionar.equals(TransaccionConstantesFunciones.LABEL_IDMODULO)) {
					existe=true;
					transaccionAux.setsDescripcionGeneralEntityReporte1(transaccionAux.getmodulo_descripcion());
				}
				 else if(sTipoSeleccionar.equals(TransaccionConstantesFunciones.LABEL_IDTIPOTRANSA)) {
					existe=true;
					transaccionAux.setsDescripcionGeneralEntityReporte1(transaccionAux.gettipotransa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(TransaccionConstantesFunciones.LABEL_IDTIPOCOMPROBANTE)) {
					existe=true;
					transaccionAux.setsDescripcionGeneralEntityReporte1(transaccionAux.gettipocomprobante_descripcion());
				}
				 else if(sTipoSeleccionar.equals(TransaccionConstantesFunciones.LABEL_IDTIPOTRANSACCIONMODULO)) {
					existe=true;
					transaccionAux.setsDescripcionGeneralEntityReporte1(transaccionAux.gettipotransaccionmodulo_descripcion());
				}
				 else if(sTipoSeleccionar.equals(TransaccionConstantesFunciones.LABEL_IDTIPORETENCION)) {
					existe=true;
					transaccionAux.setsDescripcionGeneralEntityReporte1(transaccionAux.gettiporetencion_descripcion());
				}
				 else if(sTipoSeleccionar.equals(TransaccionConstantesFunciones.LABEL_IDCUENTACONTABLE)) {
					existe=true;
					transaccionAux.setsDescripcionGeneralEntityReporte1(transaccionAux.getcuentacontable_descripcion());
				}
				 else if(sTipoSeleccionar.equals(TransaccionConstantesFunciones.LABEL_DESCRIPCION)) {
					existe=true;
					transaccionAux.setsDescripcionGeneralEntityReporte1(transaccionAux.getdescripcion());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransaccionConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesTransaccion(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoTransaccion=true;
				this.isVisibilidadCeldaNuevoRelacionesTransaccion=true;
				this.isVisibilidadCeldaGuardarCambiosTransaccion=true;
			}
			
			this.isVisibilidadCeldaModificarTransaccion=false;
			this.isVisibilidadCeldaActualizarTransaccion=false;
			this.isVisibilidadCeldaEliminarTransaccion=false;
			this.isVisibilidadCeldaCancelarTransaccion=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTransaccion=true;
				} else {
					this.isVisibilidadCeldaGuardarTransaccion=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoTransaccion=false;
			this.isVisibilidadCeldaNuevoRelacionesTransaccion=false;
			this.isVisibilidadCeldaGuardarCambiosTransaccion=false;
			this.isVisibilidadCeldaModificarTransaccion=false;
			this.isVisibilidadCeldaActualizarTransaccion=true;
			this.isVisibilidadCeldaEliminarTransaccion=false;
			this.isVisibilidadCeldaCancelarTransaccion=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTransaccion=true;
				} else {
					this.isVisibilidadCeldaGuardarTransaccion=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoTransaccion=false;
			this.isVisibilidadCeldaNuevoRelacionesTransaccion=false;
			this.isVisibilidadCeldaGuardarCambiosTransaccion=false;
			this.isVisibilidadCeldaModificarTransaccion=false;
			this.isVisibilidadCeldaActualizarTransaccion=true;
			this.isVisibilidadCeldaEliminarTransaccion=true;
			this.isVisibilidadCeldaCancelarTransaccion=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTransaccion=true;
				} else {
					this.isVisibilidadCeldaGuardarTransaccion=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoTransaccion=false;
			this.isVisibilidadCeldaNuevoRelacionesTransaccion=false;
			this.isVisibilidadCeldaGuardarCambiosTransaccion=false;
			this.isVisibilidadCeldaModificarTransaccion=false;
			this.isVisibilidadCeldaActualizarTransaccion=true;
			this.isVisibilidadCeldaEliminarTransaccion=false;
			this.isVisibilidadCeldaCancelarTransaccion=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTransaccion=false;
				} else {
					this.isVisibilidadCeldaGuardarTransaccion=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoTransaccion=true;
			this.isVisibilidadCeldaNuevoRelacionesTransaccion=true;
			this.isVisibilidadCeldaGuardarCambiosTransaccion=true;
			this.isVisibilidadCeldaModificarTransaccion=false;
			this.isVisibilidadCeldaActualizarTransaccion=false;
			this.isVisibilidadCeldaEliminarTransaccion=false;
			this.isVisibilidadCeldaCancelarTransaccion=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTransaccion=true;
				} else {
					this.isVisibilidadCeldaGuardarTransaccion=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoTransaccion=false;
			this.isVisibilidadCeldaNuevoRelacionesTransaccion=false;
			this.isVisibilidadCeldaGuardarCambiosTransaccion=false;
			this.isVisibilidadCeldaActualizarTransaccion=false;
			this.isVisibilidadCeldaEliminarTransaccion=false;
			this.isVisibilidadCeldaCancelarTransaccion=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTransaccion=false;
				} else {
					this.isVisibilidadCeldaGuardarTransaccion=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoTransaccion=false;
			this.isVisibilidadCeldaNuevoRelacionesTransaccion=false;
			this.isVisibilidadCeldaGuardarCambiosTransaccion=false;
			this.isVisibilidadCeldaModificarTransaccion=true;
			this.isVisibilidadCeldaActualizarTransaccion=false;
			this.isVisibilidadCeldaEliminarTransaccion=false;
			this.isVisibilidadCeldaCancelarTransaccion=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTransaccion=false;
				} else {
					this.isVisibilidadCeldaGuardarTransaccion=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(TransaccionJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoTransaccion=true;
			this.isVisibilidadCeldaNuevoRelacionesTransaccion=true;
			this.isVisibilidadCeldaGuardarCambiosTransaccion=true;
		} else {
			this.actualizarEstadoPanelsTransaccion(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarTransaccion=false;
			//this.isVisibilidadCeldaVerFormTransaccion=false;
			this.isVisibilidadCeldaDuplicarTransaccion=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!transaccionSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesTransaccion=false;
		} else {
			this.isVisibilidadCeldaNuevoTransaccion=false;
			this.isVisibilidadCeldaGuardarCambiosTransaccion=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(transaccionSessionBean.getEsGuardarRelacionado()) {
			if(!transaccionSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesTransaccion=false;												
			}
			
			this.jButtonCerrarTransaccion.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesTransaccion=false;
		}
		
		if(!this.permiteMantenimiento(this.transaccion)) {
			this.isVisibilidadCeldaActualizarTransaccion=false;
			this.isVisibilidadCeldaEliminarTransaccion=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesTransaccion() {
	}
	
	public void actualizarEstadoPanelsTransaccion(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionTransaccion!=null) {
				this.jScrollPanelDatosEdicionTransaccion.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTransaccion!=null) {
				this.jTabbedPaneBusquedasTransaccion.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTransaccion!=null) {
				this.jScrollPanelDatosTransaccion.setVisible(true);
			}
			
			if(this.jPanelPaginacionTransaccion!=null) {
				this.jPanelPaginacionTransaccion.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTransaccion!=null) {
				this.jPanelParametrosReportesTransaccion.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionTransaccion!=null) {
				this.jScrollPanelDatosEdicionTransaccion.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTransaccion!=null) {
				this.jTabbedPaneBusquedasTransaccion.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosTransaccion!=null) {
				this.jScrollPanelDatosTransaccion.setVisible(false);
			}
			
			if(this.jPanelPaginacionTransaccion!=null) {
				this.jPanelPaginacionTransaccion.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTransaccion!=null) {
				this.jPanelParametrosReportesTransaccion.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionTransaccion!=null) {
				this.jScrollPanelDatosEdicionTransaccion.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTransaccion!=null) {
				this.jTabbedPaneBusquedasTransaccion.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTransaccion!=null) {
				this.jScrollPanelDatosTransaccion.setVisible(false);
			}
			
			if(this.jPanelPaginacionTransaccion!=null) {
				this.jPanelPaginacionTransaccion.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTransaccion!=null) {
				this.jPanelParametrosReportesTransaccion.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionTransaccion!=null) {
				this.jScrollPanelDatosEdicionTransaccion.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTransaccion!=null) {
				this.jTabbedPaneBusquedasTransaccion.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTransaccion!=null) {
				this.jScrollPanelDatosTransaccion.setVisible(false);
			}
			
			if(this.jPanelPaginacionTransaccion!=null) {
				this.jPanelPaginacionTransaccion.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTransaccion!=null) {
				this.jPanelParametrosReportesTransaccion.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionTransaccion!=null) {
				this.jScrollPanelDatosEdicionTransaccion.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTransaccion!=null) {
				this.jTabbedPaneBusquedasTransaccion.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTransaccion!=null) {
				this.jScrollPanelDatosTransaccion.setVisible(true);
			}
			
			if(this.jPanelPaginacionTransaccion!=null) {
				this.jPanelPaginacionTransaccion.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTransaccion!=null) {
				this.jPanelParametrosReportesTransaccion.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionTransaccion!=null) {
				this.jScrollPanelDatosEdicionTransaccion.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTransaccion!=null) {
				this.jTabbedPaneBusquedasTransaccion.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTransaccion!=null) {
				this.jScrollPanelDatosTransaccion.setVisible(true);
			}
			
			if(this.jPanelPaginacionTransaccion!=null) {
				this.jPanelPaginacionTransaccion.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTransaccion!=null) {
				this.jPanelParametrosReportesTransaccion.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionTransaccion!=null) {
				this.jScrollPanelDatosEdicionTransaccion.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTransaccion!=null) {
				this.jTabbedPaneBusquedasTransaccion.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTransaccion!=null) {
				this.jScrollPanelDatosTransaccion.setVisible(true);
			}
			
			if(this.jPanelPaginacionTransaccion!=null) {
				this.jPanelPaginacionTransaccion.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTransaccion!=null) {
				this.jPanelParametrosReportesTransaccion.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.transaccionSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasTransaccion!=null) {
					this.jTabbedPaneBusquedasTransaccion.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesTransaccion!=null) {
				this.jPanelParametrosReportesTransaccion.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.transaccionSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTransaccion!=null) {
				this.jTabbedPaneBusquedasTransaccion.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesTransaccion!=null) {
				this.jPanelParametrosReportesTransaccion.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadBusquedaPorCodigo=isParaEmpresaNegation;
			if(!this.isVisibilidadBusquedaPorCodigo) {this.jTabbedPaneBusquedasTransaccion.remove(jPanelBusquedaPorCodigoTransaccion);}

			this.isVisibilidadBusquedaPorIdModuloPorTipoTransaccion=isParaEmpresaNegation;
			if(!this.isVisibilidadBusquedaPorIdModuloPorTipoTransaccion) {this.jTabbedPaneBusquedasTransaccion.remove(jPanelBusquedaPorIdModuloPorTipoTransaccionTransaccion);}

			this.isVisibilidadBusquedaPorNombre=isParaEmpresaNegation;
			if(!this.isVisibilidadBusquedaPorNombre) {this.jTabbedPaneBusquedasTransaccion.remove(jPanelBusquedaPorNombreTransaccion);}

			this.isVisibilidadFK_IdCuentaContable=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdCuentaContable) {this.jTabbedPaneBusquedasTransaccion.remove(jPanelFK_IdCuentaContableTransaccion);}

			this.isVisibilidadFK_IdTipoComprobante=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdTipoComprobante) {this.jTabbedPaneBusquedasTransaccion.remove(jPanelFK_IdTipoComprobanteTransaccion);}

			this.isVisibilidadFK_IdTipoRetencion=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdTipoRetencion) {this.jTabbedPaneBusquedasTransaccion.remove(jPanelFK_IdTipoRetencionTransaccion);}

			this.isVisibilidadFK_IdTipoTransa=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdTipoTransa) {this.jTabbedPaneBusquedasTransaccion.remove(jPanelFK_IdTipoTransaTransaccion);}
		}
		
	}

	public void setVisibilidadBusquedasParaSucursal(Boolean isParaSucursal){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaSucursalNegation=!isParaSucursal;

			this.isVisibilidadBusquedaPorCodigo=isParaSucursalNegation;
			if(!this.isVisibilidadBusquedaPorCodigo) {this.jTabbedPaneBusquedasTransaccion.remove(jPanelBusquedaPorCodigoTransaccion);}

			this.isVisibilidadBusquedaPorIdModuloPorTipoTransaccion=isParaSucursalNegation;
			if(!this.isVisibilidadBusquedaPorIdModuloPorTipoTransaccion) {this.jTabbedPaneBusquedasTransaccion.remove(jPanelBusquedaPorIdModuloPorTipoTransaccionTransaccion);}

			this.isVisibilidadBusquedaPorNombre=isParaSucursalNegation;
			if(!this.isVisibilidadBusquedaPorNombre) {this.jTabbedPaneBusquedasTransaccion.remove(jPanelBusquedaPorNombreTransaccion);}

			this.isVisibilidadFK_IdCuentaContable=isParaSucursalNegation;
			if(!this.isVisibilidadFK_IdCuentaContable) {this.jTabbedPaneBusquedasTransaccion.remove(jPanelFK_IdCuentaContableTransaccion);}

			this.isVisibilidadFK_IdTipoComprobante=isParaSucursalNegation;
			if(!this.isVisibilidadFK_IdTipoComprobante) {this.jTabbedPaneBusquedasTransaccion.remove(jPanelFK_IdTipoComprobanteTransaccion);}

			this.isVisibilidadFK_IdTipoRetencion=isParaSucursalNegation;
			if(!this.isVisibilidadFK_IdTipoRetencion) {this.jTabbedPaneBusquedasTransaccion.remove(jPanelFK_IdTipoRetencionTransaccion);}

			this.isVisibilidadFK_IdTipoTransa=isParaSucursalNegation;
			if(!this.isVisibilidadFK_IdTipoTransa) {this.jTabbedPaneBusquedasTransaccion.remove(jPanelFK_IdTipoTransaTransaccion);}
		}
		
	}

	public void setVisibilidadBusquedasParaModulo(Boolean isParaModulo){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaModuloNegation=!isParaModulo;

			this.isVisibilidadBusquedaPorCodigo=isParaModuloNegation;
			if(!this.isVisibilidadBusquedaPorCodigo) {this.jTabbedPaneBusquedasTransaccion.remove(jPanelBusquedaPorCodigoTransaccion);}

			this.isVisibilidadBusquedaPorIdModuloPorTipoTransaccion=isParaModulo;
			if(!this.isVisibilidadBusquedaPorIdModuloPorTipoTransaccion) {this.jTabbedPaneBusquedasTransaccion.remove(jPanelBusquedaPorIdModuloPorTipoTransaccionTransaccion);}

			this.isVisibilidadBusquedaPorNombre=isParaModuloNegation;
			if(!this.isVisibilidadBusquedaPorNombre) {this.jTabbedPaneBusquedasTransaccion.remove(jPanelBusquedaPorNombreTransaccion);}

			this.isVisibilidadFK_IdCuentaContable=isParaModuloNegation;
			if(!this.isVisibilidadFK_IdCuentaContable) {this.jTabbedPaneBusquedasTransaccion.remove(jPanelFK_IdCuentaContableTransaccion);}

			this.isVisibilidadFK_IdTipoComprobante=isParaModuloNegation;
			if(!this.isVisibilidadFK_IdTipoComprobante) {this.jTabbedPaneBusquedasTransaccion.remove(jPanelFK_IdTipoComprobanteTransaccion);}

			this.isVisibilidadFK_IdTipoRetencion=isParaModuloNegation;
			if(!this.isVisibilidadFK_IdTipoRetencion) {this.jTabbedPaneBusquedasTransaccion.remove(jPanelFK_IdTipoRetencionTransaccion);}

			this.isVisibilidadFK_IdTipoTransa=isParaModuloNegation;
			if(!this.isVisibilidadFK_IdTipoTransa) {this.jTabbedPaneBusquedasTransaccion.remove(jPanelFK_IdTipoTransaTransaccion);}
		}
		
	}

	public void setVisibilidadBusquedasParaTipoTransa(Boolean isParaTipoTransa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaTipoTransaNegation=!isParaTipoTransa;

			this.isVisibilidadBusquedaPorCodigo=isParaTipoTransaNegation;
			if(!this.isVisibilidadBusquedaPorCodigo) {this.jTabbedPaneBusquedasTransaccion.remove(jPanelBusquedaPorCodigoTransaccion);}

			this.isVisibilidadBusquedaPorIdModuloPorTipoTransaccion=isParaTipoTransaNegation;
			if(!this.isVisibilidadBusquedaPorIdModuloPorTipoTransaccion) {this.jTabbedPaneBusquedasTransaccion.remove(jPanelBusquedaPorIdModuloPorTipoTransaccionTransaccion);}

			this.isVisibilidadBusquedaPorNombre=isParaTipoTransaNegation;
			if(!this.isVisibilidadBusquedaPorNombre) {this.jTabbedPaneBusquedasTransaccion.remove(jPanelBusquedaPorNombreTransaccion);}

			this.isVisibilidadFK_IdCuentaContable=isParaTipoTransaNegation;
			if(!this.isVisibilidadFK_IdCuentaContable) {this.jTabbedPaneBusquedasTransaccion.remove(jPanelFK_IdCuentaContableTransaccion);}

			this.isVisibilidadFK_IdTipoComprobante=isParaTipoTransaNegation;
			if(!this.isVisibilidadFK_IdTipoComprobante) {this.jTabbedPaneBusquedasTransaccion.remove(jPanelFK_IdTipoComprobanteTransaccion);}

			this.isVisibilidadFK_IdTipoRetencion=isParaTipoTransaNegation;
			if(!this.isVisibilidadFK_IdTipoRetencion) {this.jTabbedPaneBusquedasTransaccion.remove(jPanelFK_IdTipoRetencionTransaccion);}

			this.isVisibilidadFK_IdTipoTransa=isParaTipoTransa;
			if(!this.isVisibilidadFK_IdTipoTransa) {this.jTabbedPaneBusquedasTransaccion.remove(jPanelFK_IdTipoTransaTransaccion);}
		}
		
	}

	public void setVisibilidadBusquedasParaTipoComprobante(Boolean isParaTipoComprobante){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaTipoComprobanteNegation=!isParaTipoComprobante;

			this.isVisibilidadBusquedaPorCodigo=isParaTipoComprobanteNegation;
			if(!this.isVisibilidadBusquedaPorCodigo) {this.jTabbedPaneBusquedasTransaccion.remove(jPanelBusquedaPorCodigoTransaccion);}

			this.isVisibilidadBusquedaPorIdModuloPorTipoTransaccion=isParaTipoComprobanteNegation;
			if(!this.isVisibilidadBusquedaPorIdModuloPorTipoTransaccion) {this.jTabbedPaneBusquedasTransaccion.remove(jPanelBusquedaPorIdModuloPorTipoTransaccionTransaccion);}

			this.isVisibilidadBusquedaPorNombre=isParaTipoComprobanteNegation;
			if(!this.isVisibilidadBusquedaPorNombre) {this.jTabbedPaneBusquedasTransaccion.remove(jPanelBusquedaPorNombreTransaccion);}

			this.isVisibilidadFK_IdCuentaContable=isParaTipoComprobanteNegation;
			if(!this.isVisibilidadFK_IdCuentaContable) {this.jTabbedPaneBusquedasTransaccion.remove(jPanelFK_IdCuentaContableTransaccion);}

			this.isVisibilidadFK_IdTipoComprobante=isParaTipoComprobante;
			if(!this.isVisibilidadFK_IdTipoComprobante) {this.jTabbedPaneBusquedasTransaccion.remove(jPanelFK_IdTipoComprobanteTransaccion);}

			this.isVisibilidadFK_IdTipoRetencion=isParaTipoComprobanteNegation;
			if(!this.isVisibilidadFK_IdTipoRetencion) {this.jTabbedPaneBusquedasTransaccion.remove(jPanelFK_IdTipoRetencionTransaccion);}

			this.isVisibilidadFK_IdTipoTransa=isParaTipoComprobanteNegation;
			if(!this.isVisibilidadFK_IdTipoTransa) {this.jTabbedPaneBusquedasTransaccion.remove(jPanelFK_IdTipoTransaTransaccion);}
		}
		
	}

	public void setVisibilidadBusquedasParaTipoTransaccionModulo(Boolean isParaTipoTransaccionModulo){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaTipoTransaccionModuloNegation=!isParaTipoTransaccionModulo;

			this.isVisibilidadBusquedaPorCodigo=isParaTipoTransaccionModuloNegation;
			if(!this.isVisibilidadBusquedaPorCodigo) {this.jTabbedPaneBusquedasTransaccion.remove(jPanelBusquedaPorCodigoTransaccion);}

			this.isVisibilidadBusquedaPorIdModuloPorTipoTransaccion=isParaTipoTransaccionModulo;
			if(!this.isVisibilidadBusquedaPorIdModuloPorTipoTransaccion) {this.jTabbedPaneBusquedasTransaccion.remove(jPanelBusquedaPorIdModuloPorTipoTransaccionTransaccion);}

			this.isVisibilidadBusquedaPorNombre=isParaTipoTransaccionModuloNegation;
			if(!this.isVisibilidadBusquedaPorNombre) {this.jTabbedPaneBusquedasTransaccion.remove(jPanelBusquedaPorNombreTransaccion);}

			this.isVisibilidadFK_IdCuentaContable=isParaTipoTransaccionModuloNegation;
			if(!this.isVisibilidadFK_IdCuentaContable) {this.jTabbedPaneBusquedasTransaccion.remove(jPanelFK_IdCuentaContableTransaccion);}

			this.isVisibilidadFK_IdTipoComprobante=isParaTipoTransaccionModuloNegation;
			if(!this.isVisibilidadFK_IdTipoComprobante) {this.jTabbedPaneBusquedasTransaccion.remove(jPanelFK_IdTipoComprobanteTransaccion);}

			this.isVisibilidadFK_IdTipoRetencion=isParaTipoTransaccionModuloNegation;
			if(!this.isVisibilidadFK_IdTipoRetencion) {this.jTabbedPaneBusquedasTransaccion.remove(jPanelFK_IdTipoRetencionTransaccion);}

			this.isVisibilidadFK_IdTipoTransa=isParaTipoTransaccionModuloNegation;
			if(!this.isVisibilidadFK_IdTipoTransa) {this.jTabbedPaneBusquedasTransaccion.remove(jPanelFK_IdTipoTransaTransaccion);}
		}
		
	}

	public void setVisibilidadBusquedasParaTipoRetencion(Boolean isParaTipoRetencion){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaTipoRetencionNegation=!isParaTipoRetencion;

			this.isVisibilidadBusquedaPorCodigo=isParaTipoRetencionNegation;
			if(!this.isVisibilidadBusquedaPorCodigo) {this.jTabbedPaneBusquedasTransaccion.remove(jPanelBusquedaPorCodigoTransaccion);}

			this.isVisibilidadBusquedaPorIdModuloPorTipoTransaccion=isParaTipoRetencionNegation;
			if(!this.isVisibilidadBusquedaPorIdModuloPorTipoTransaccion) {this.jTabbedPaneBusquedasTransaccion.remove(jPanelBusquedaPorIdModuloPorTipoTransaccionTransaccion);}

			this.isVisibilidadBusquedaPorNombre=isParaTipoRetencionNegation;
			if(!this.isVisibilidadBusquedaPorNombre) {this.jTabbedPaneBusquedasTransaccion.remove(jPanelBusquedaPorNombreTransaccion);}

			this.isVisibilidadFK_IdCuentaContable=isParaTipoRetencionNegation;
			if(!this.isVisibilidadFK_IdCuentaContable) {this.jTabbedPaneBusquedasTransaccion.remove(jPanelFK_IdCuentaContableTransaccion);}

			this.isVisibilidadFK_IdTipoComprobante=isParaTipoRetencionNegation;
			if(!this.isVisibilidadFK_IdTipoComprobante) {this.jTabbedPaneBusquedasTransaccion.remove(jPanelFK_IdTipoComprobanteTransaccion);}

			this.isVisibilidadFK_IdTipoRetencion=isParaTipoRetencion;
			if(!this.isVisibilidadFK_IdTipoRetencion) {this.jTabbedPaneBusquedasTransaccion.remove(jPanelFK_IdTipoRetencionTransaccion);}

			this.isVisibilidadFK_IdTipoTransa=isParaTipoRetencionNegation;
			if(!this.isVisibilidadFK_IdTipoTransa) {this.jTabbedPaneBusquedasTransaccion.remove(jPanelFK_IdTipoTransaTransaccion);}
		}
		
	}

	public void setVisibilidadBusquedasParaCuentaContable(Boolean isParaCuentaContable){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaCuentaContableNegation=!isParaCuentaContable;

			this.isVisibilidadBusquedaPorCodigo=isParaCuentaContableNegation;
			if(!this.isVisibilidadBusquedaPorCodigo) {this.jTabbedPaneBusquedasTransaccion.remove(jPanelBusquedaPorCodigoTransaccion);}

			this.isVisibilidadBusquedaPorIdModuloPorTipoTransaccion=isParaCuentaContableNegation;
			if(!this.isVisibilidadBusquedaPorIdModuloPorTipoTransaccion) {this.jTabbedPaneBusquedasTransaccion.remove(jPanelBusquedaPorIdModuloPorTipoTransaccionTransaccion);}

			this.isVisibilidadBusquedaPorNombre=isParaCuentaContableNegation;
			if(!this.isVisibilidadBusquedaPorNombre) {this.jTabbedPaneBusquedasTransaccion.remove(jPanelBusquedaPorNombreTransaccion);}

			this.isVisibilidadFK_IdCuentaContable=isParaCuentaContable;
			if(!this.isVisibilidadFK_IdCuentaContable) {this.jTabbedPaneBusquedasTransaccion.remove(jPanelFK_IdCuentaContableTransaccion);}

			this.isVisibilidadFK_IdTipoComprobante=isParaCuentaContableNegation;
			if(!this.isVisibilidadFK_IdTipoComprobante) {this.jTabbedPaneBusquedasTransaccion.remove(jPanelFK_IdTipoComprobanteTransaccion);}

			this.isVisibilidadFK_IdTipoRetencion=isParaCuentaContableNegation;
			if(!this.isVisibilidadFK_IdTipoRetencion) {this.jTabbedPaneBusquedasTransaccion.remove(jPanelFK_IdTipoRetencionTransaccion);}

			this.isVisibilidadFK_IdTipoTransa=isParaCuentaContableNegation;
			if(!this.isVisibilidadFK_IdTipoTransa) {this.jTabbedPaneBusquedasTransaccion.remove(jPanelFK_IdTipoTransaTransaccion);}
		}
		
	}
	
	
	
	

	public String registrarSesionTransaccionParaBusquedaCuentaContables() throws Exception {
		Boolean isPaginaPopupCuentaContable=false;

		try {

			if(transaccionSessionBean==null) {
				transaccionSessionBean=new TransaccionSessionBean();
			}

			if(cuentacontableSessionBean==null) {
				cuentacontableSessionBean=new CuentaContableSessionBean();
			}

			cuentacontableSessionBean.setsPathNavegacionActual(transaccionSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+CuentaContableConstantesFunciones.SCLASSWEBTITULO);
			cuentacontableSessionBean.setisPermiteRecargarInformacion(false);
			cuentacontableSessionBean.setisPaginaPopup(true);
			isPaginaPopupCuentaContable=cuentacontableSessionBean.getisPaginaPopup();
			cuentacontableSessionBean.setisPaginaPopup(false);
			cuentacontableSessionBean.setEstaModoBusqueda(true);
			cuentacontableSessionBean.setsFuncionBusquedaRapida("window.opener.transaccionFuncionGeneral.setCombosCodigoDesdeBusquedaid_cuenta_contable(TO_REPLACE);");
			cuentacontableSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeCuentaContable(true);
			cuentacontableSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeCuentaContable(TransaccionConstantesFunciones.SNOMBREOPCION);
			//cuentacontableSessionBean.setisBusquedaDesdeForeignKeySesionTransaccion(true);
			//cuentacontableSessionBean.setlidTransaccionActual(this.idTransaccionActual);

			transaccionSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyTransaccion(true);
			transaccionSessionBean.setlIdTransaccionActualForeignKey(this.idTransaccionActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
			return "";
	}
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//TransaccionSessionBean transaccionSessionBean=new TransaccionSessionBean();
		
		if(this.transaccionSessionBean==null) {
			this.transaccionSessionBean=new TransaccionSessionBean();
		}
		
		this.transaccionSessionBean.setsUltimaBusquedaTransaccion(this.getsAccionBusqueda());
		this.transaccionSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.transaccionSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("BusquedaPorCodigo")) {
			transaccionSessionBean.setcodigo(this.getcodigoBusquedaPorCodigo());	
		}
		else if(this.getsAccionBusqueda().equals("BusquedaPorIdModuloPorTipoTransaccion")) {
			transaccionSessionBean.setid_modulo(this.getid_moduloBusquedaPorIdModuloPorTipoTransaccion());	
			transaccionSessionBean.setid_tipo_transaccion_modulo(this.getid_tipo_transaccion_moduloBusquedaPorIdModuloPorTipoTransaccion());	
		}
		else if(this.getsAccionBusqueda().equals("BusquedaPorNombre")) {
			transaccionSessionBean.setnombre(this.getnombreBusquedaPorNombre());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdCuentaContable")) {
			transaccionSessionBean.setid_cuenta_contable(this.getid_cuenta_contableFK_IdCuentaContable());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			transaccionSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdModulo")) {
			transaccionSessionBean.setid_modulo(this.getid_moduloFK_IdModulo());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdSucursal")) {
			transaccionSessionBean.setid_sucursal(this.getid_sucursalFK_IdSucursal());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdTipoComprobante")) {
			transaccionSessionBean.setid_tipo_comprobante(this.getid_tipo_comprobanteFK_IdTipoComprobante());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdTipoRetencion")) {
			transaccionSessionBean.setid_tipo_retencion(this.getid_tipo_retencionFK_IdTipoRetencion());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdTipoTransa")) {
			transaccionSessionBean.setid_tipo_transa(this.getid_tipo_transaFK_IdTipoTransa());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//TransaccionSessionBean transaccionSessionBean=new TransaccionSessionBean();
		
		if(this.transaccionSessionBean==null) {
			this.transaccionSessionBean=new TransaccionSessionBean();
		}
		
		if(this.transaccionSessionBean.getsUltimaBusquedaTransaccion()!=null&&!this.transaccionSessionBean.getsUltimaBusquedaTransaccion().equals("")) {
			this.setsAccionBusqueda(transaccionSessionBean.getsUltimaBusquedaTransaccion());
			this.setiNumeroPaginacion(transaccionSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(transaccionSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("BusquedaPorCodigo")) {
				this.setcodigoBusquedaPorCodigo(transaccionSessionBean.getcodigo());
				transaccionSessionBean.setcodigo("");
			}
			 else if(this.getsAccionBusqueda().equals("BusquedaPorIdModuloPorTipoTransaccion")) {
				this.setid_moduloBusquedaPorIdModuloPorTipoTransaccion(transaccionSessionBean.getid_modulo());
				transaccionSessionBean.setid_modulo(-1L);
				this.setid_tipo_transaccion_moduloBusquedaPorIdModuloPorTipoTransaccion(transaccionSessionBean.getid_tipo_transaccion_modulo());
				transaccionSessionBean.setid_tipo_transaccion_modulo(null);
			}
			 else if(this.getsAccionBusqueda().equals("BusquedaPorNombre")) {
				this.setnombreBusquedaPorNombre(transaccionSessionBean.getnombre());
				transaccionSessionBean.setnombre("");
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdCuentaContable")) {
				this.setid_cuenta_contableFK_IdCuentaContable(transaccionSessionBean.getid_cuenta_contable());
				transaccionSessionBean.setid_cuenta_contable(null);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(transaccionSessionBean.getid_empresa());
				transaccionSessionBean.setid_empresa(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdModulo")) {
				this.setid_moduloFK_IdModulo(transaccionSessionBean.getid_modulo());
				transaccionSessionBean.setid_modulo(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdSucursal")) {
				this.setid_sucursalFK_IdSucursal(transaccionSessionBean.getid_sucursal());
				transaccionSessionBean.setid_sucursal(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdTipoComprobante")) {
				this.setid_tipo_comprobanteFK_IdTipoComprobante(transaccionSessionBean.getid_tipo_comprobante());
				transaccionSessionBean.setid_tipo_comprobante(null);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdTipoRetencion")) {
				this.setid_tipo_retencionFK_IdTipoRetencion(transaccionSessionBean.getid_tipo_retencion());
				transaccionSessionBean.setid_tipo_retencion(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdTipoTransa")) {
				this.setid_tipo_transaFK_IdTipoTransa(transaccionSessionBean.getid_tipo_transa());
				transaccionSessionBean.setid_tipo_transa(-1L);
			}
		}
		
		this.transaccionSessionBean.setsUltimaBusquedaTransaccion("");
		this.transaccionSessionBean.setiNumeroPaginacion(TransaccionConstantesFunciones.INUMEROPAGINACION);
		this.transaccionSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaTransaccion(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioTransaccion() {
		this.updateBorderResaltarBusquedasFormularioTransaccion();
		this.updateVisibilidadBusquedasFormularioTransaccion();
		this.updateHabilitarBusquedasFormularioTransaccion();
	}
	
	public void updateBorderResaltarBusquedasFormularioTransaccion() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasTransaccion.getComponents().length>0) {
	

		if(this.transaccionConstantesFunciones.resaltarBusquedaPorCodigoTransaccion!=null) {
			index= this.jTabbedPaneBusquedasTransaccion.indexOfComponent(this.jPanelBusquedaPorCodigoTransaccion);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTransaccion.getComponent(index);
				jPanel.setBorder(this.transaccionConstantesFunciones.resaltarBusquedaPorCodigoTransaccion);
			}
		}

		if(this.transaccionConstantesFunciones.resaltarBusquedaPorIdModuloPorTipoTransaccionTransaccion!=null) {
			index= this.jTabbedPaneBusquedasTransaccion.indexOfComponent(this.jPanelBusquedaPorIdModuloPorTipoTransaccionTransaccion);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTransaccion.getComponent(index);
				jPanel.setBorder(this.transaccionConstantesFunciones.resaltarBusquedaPorIdModuloPorTipoTransaccionTransaccion);
			}
		}

		if(this.transaccionConstantesFunciones.resaltarBusquedaPorNombreTransaccion!=null) {
			index= this.jTabbedPaneBusquedasTransaccion.indexOfComponent(this.jPanelBusquedaPorNombreTransaccion);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTransaccion.getComponent(index);
				jPanel.setBorder(this.transaccionConstantesFunciones.resaltarBusquedaPorNombreTransaccion);
			}
		}

		if(this.transaccionConstantesFunciones.resaltarFK_IdCuentaContableTransaccion!=null) {
			index= this.jTabbedPaneBusquedasTransaccion.indexOfComponent(this.jPanelFK_IdCuentaContableTransaccion);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTransaccion.getComponent(index);
				jPanel.setBorder(this.transaccionConstantesFunciones.resaltarFK_IdCuentaContableTransaccion);
			}
		}

		if(this.transaccionConstantesFunciones.resaltarFK_IdTipoComprobanteTransaccion!=null) {
			index= this.jTabbedPaneBusquedasTransaccion.indexOfComponent(this.jPanelFK_IdTipoComprobanteTransaccion);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTransaccion.getComponent(index);
				jPanel.setBorder(this.transaccionConstantesFunciones.resaltarFK_IdTipoComprobanteTransaccion);
			}
		}

		if(this.transaccionConstantesFunciones.resaltarFK_IdTipoRetencionTransaccion!=null) {
			index= this.jTabbedPaneBusquedasTransaccion.indexOfComponent(this.jPanelFK_IdTipoRetencionTransaccion);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTransaccion.getComponent(index);
				jPanel.setBorder(this.transaccionConstantesFunciones.resaltarFK_IdTipoRetencionTransaccion);
			}
		}

		if(this.transaccionConstantesFunciones.resaltarFK_IdTipoTransaTransaccion!=null) {
			index= this.jTabbedPaneBusquedasTransaccion.indexOfComponent(this.jPanelFK_IdTipoTransaTransaccion);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTransaccion.getComponent(index);
				jPanel.setBorder(this.transaccionConstantesFunciones.resaltarFK_IdTipoTransaTransaccion);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioTransaccion() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasTransaccion.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasTransaccion.indexOfComponent(this.jPanelBusquedaPorCodigoTransaccion);
			jPanel=(JPanel)this.jTabbedPaneBusquedasTransaccion.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.transaccionConstantesFunciones.mostrarBusquedaPorCodigoTransaccion);
			if(!this.transaccionConstantesFunciones.mostrarBusquedaPorCodigoTransaccion && index>-1) {
				this.jTabbedPaneBusquedasTransaccion.remove(index);
			}

			index= this.jTabbedPaneBusquedasTransaccion.indexOfComponent(this.jPanelBusquedaPorIdModuloPorTipoTransaccionTransaccion);
			jPanel=(JPanel)this.jTabbedPaneBusquedasTransaccion.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.transaccionConstantesFunciones.mostrarBusquedaPorIdModuloPorTipoTransaccionTransaccion);
			if(!this.transaccionConstantesFunciones.mostrarBusquedaPorIdModuloPorTipoTransaccionTransaccion && index>-1) {
				this.jTabbedPaneBusquedasTransaccion.remove(index);
			}

			index= this.jTabbedPaneBusquedasTransaccion.indexOfComponent(this.jPanelBusquedaPorNombreTransaccion);
			jPanel=(JPanel)this.jTabbedPaneBusquedasTransaccion.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.transaccionConstantesFunciones.mostrarBusquedaPorNombreTransaccion);
			if(!this.transaccionConstantesFunciones.mostrarBusquedaPorNombreTransaccion && index>-1) {
				this.jTabbedPaneBusquedasTransaccion.remove(index);
			}

			index= this.jTabbedPaneBusquedasTransaccion.indexOfComponent(this.jPanelFK_IdCuentaContableTransaccion);
			jPanel=(JPanel)this.jTabbedPaneBusquedasTransaccion.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.transaccionConstantesFunciones.mostrarFK_IdCuentaContableTransaccion);
			if(!this.transaccionConstantesFunciones.mostrarFK_IdCuentaContableTransaccion && index>-1) {
				this.jTabbedPaneBusquedasTransaccion.remove(index);
			}

			index= this.jTabbedPaneBusquedasTransaccion.indexOfComponent(this.jPanelFK_IdTipoComprobanteTransaccion);
			jPanel=(JPanel)this.jTabbedPaneBusquedasTransaccion.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.transaccionConstantesFunciones.mostrarFK_IdTipoComprobanteTransaccion);
			if(!this.transaccionConstantesFunciones.mostrarFK_IdTipoComprobanteTransaccion && index>-1) {
				this.jTabbedPaneBusquedasTransaccion.remove(index);
			}

			index= this.jTabbedPaneBusquedasTransaccion.indexOfComponent(this.jPanelFK_IdTipoRetencionTransaccion);
			jPanel=(JPanel)this.jTabbedPaneBusquedasTransaccion.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.transaccionConstantesFunciones.mostrarFK_IdTipoRetencionTransaccion);
			if(!this.transaccionConstantesFunciones.mostrarFK_IdTipoRetencionTransaccion && index>-1) {
				this.jTabbedPaneBusquedasTransaccion.remove(index);
			}

			index= this.jTabbedPaneBusquedasTransaccion.indexOfComponent(this.jPanelFK_IdTipoTransaTransaccion);
			jPanel=(JPanel)this.jTabbedPaneBusquedasTransaccion.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.transaccionConstantesFunciones.mostrarFK_IdTipoTransaTransaccion);
			if(!this.transaccionConstantesFunciones.mostrarFK_IdTipoTransaTransaccion && index>-1) {
				this.jTabbedPaneBusquedasTransaccion.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioTransaccion() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasTransaccion.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasTransaccion.indexOfComponent(this.jPanelBusquedaPorCodigoTransaccion);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasTransaccion.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.transaccionConstantesFunciones.activarBusquedaPorCodigoTransaccion);
				this.jTabbedPaneBusquedasTransaccion.setEnabledAt(index,this.transaccionConstantesFunciones.activarBusquedaPorCodigoTransaccion);
			}

			index= this.jTabbedPaneBusquedasTransaccion.indexOfComponent(this.jPanelBusquedaPorIdModuloPorTipoTransaccionTransaccion);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasTransaccion.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.transaccionConstantesFunciones.activarBusquedaPorIdModuloPorTipoTransaccionTransaccion);
				this.jTabbedPaneBusquedasTransaccion.setEnabledAt(index,this.transaccionConstantesFunciones.activarBusquedaPorIdModuloPorTipoTransaccionTransaccion);
			}

			index= this.jTabbedPaneBusquedasTransaccion.indexOfComponent(this.jPanelBusquedaPorNombreTransaccion);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasTransaccion.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.transaccionConstantesFunciones.activarBusquedaPorNombreTransaccion);
				this.jTabbedPaneBusquedasTransaccion.setEnabledAt(index,this.transaccionConstantesFunciones.activarBusquedaPorNombreTransaccion);
			}

			index= this.jTabbedPaneBusquedasTransaccion.indexOfComponent(this.jPanelFK_IdCuentaContableTransaccion);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasTransaccion.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.transaccionConstantesFunciones.activarFK_IdCuentaContableTransaccion);
				this.jTabbedPaneBusquedasTransaccion.setEnabledAt(index,this.transaccionConstantesFunciones.activarFK_IdCuentaContableTransaccion);
			}

			index= this.jTabbedPaneBusquedasTransaccion.indexOfComponent(this.jPanelFK_IdTipoComprobanteTransaccion);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasTransaccion.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.transaccionConstantesFunciones.activarFK_IdTipoComprobanteTransaccion);
				this.jTabbedPaneBusquedasTransaccion.setEnabledAt(index,this.transaccionConstantesFunciones.activarFK_IdTipoComprobanteTransaccion);
			}

			index= this.jTabbedPaneBusquedasTransaccion.indexOfComponent(this.jPanelFK_IdTipoRetencionTransaccion);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasTransaccion.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.transaccionConstantesFunciones.activarFK_IdTipoRetencionTransaccion);
				this.jTabbedPaneBusquedasTransaccion.setEnabledAt(index,this.transaccionConstantesFunciones.activarFK_IdTipoRetencionTransaccion);
			}

			index= this.jTabbedPaneBusquedasTransaccion.indexOfComponent(this.jPanelFK_IdTipoTransaTransaccion);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasTransaccion.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.transaccionConstantesFunciones.activarFK_IdTipoTransaTransaccion);
				this.jTabbedPaneBusquedasTransaccion.setEnabledAt(index,this.transaccionConstantesFunciones.activarFK_IdTipoTransaTransaccion);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaTransaccion(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("BusquedaPorCodigo")) {
			index= this.jTabbedPaneBusquedasTransaccion.indexOfComponent(this.jPanelBusquedaPorCodigoTransaccion);

			this.jTabbedPaneBusquedasTransaccion.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTransaccion.getComponent(index);

			this.transaccionConstantesFunciones.setResaltarBusquedaPorCodigoTransaccion(resaltar);

			jPanel.setBorder(this.transaccionConstantesFunciones.resaltarBusquedaPorCodigoTransaccion);
			existe=true;
		}
		else if(sTipoBusqueda.equals("BusquedaPorIdModuloPorTipoTransaccion")) {
			index= this.jTabbedPaneBusquedasTransaccion.indexOfComponent(this.jPanelBusquedaPorIdModuloPorTipoTransaccionTransaccion);

			this.jTabbedPaneBusquedasTransaccion.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTransaccion.getComponent(index);

			this.transaccionConstantesFunciones.setResaltarBusquedaPorIdModuloPorTipoTransaccionTransaccion(resaltar);

			jPanel.setBorder(this.transaccionConstantesFunciones.resaltarBusquedaPorIdModuloPorTipoTransaccionTransaccion);
			existe=true;
		}
		else if(sTipoBusqueda.equals("BusquedaPorNombre")) {
			index= this.jTabbedPaneBusquedasTransaccion.indexOfComponent(this.jPanelBusquedaPorNombreTransaccion);

			this.jTabbedPaneBusquedasTransaccion.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTransaccion.getComponent(index);

			this.transaccionConstantesFunciones.setResaltarBusquedaPorNombreTransaccion(resaltar);

			jPanel.setBorder(this.transaccionConstantesFunciones.resaltarBusquedaPorNombreTransaccion);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdCuentaContable")) {
			index= this.jTabbedPaneBusquedasTransaccion.indexOfComponent(this.jPanelFK_IdCuentaContableTransaccion);

			this.jTabbedPaneBusquedasTransaccion.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTransaccion.getComponent(index);

			this.transaccionConstantesFunciones.setResaltarFK_IdCuentaContableTransaccion(resaltar);

			jPanel.setBorder(this.transaccionConstantesFunciones.resaltarFK_IdCuentaContableTransaccion);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdTipoComprobante")) {
			index= this.jTabbedPaneBusquedasTransaccion.indexOfComponent(this.jPanelFK_IdTipoComprobanteTransaccion);

			this.jTabbedPaneBusquedasTransaccion.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTransaccion.getComponent(index);

			this.transaccionConstantesFunciones.setResaltarFK_IdTipoComprobanteTransaccion(resaltar);

			jPanel.setBorder(this.transaccionConstantesFunciones.resaltarFK_IdTipoComprobanteTransaccion);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdTipoRetencion")) {
			index= this.jTabbedPaneBusquedasTransaccion.indexOfComponent(this.jPanelFK_IdTipoRetencionTransaccion);

			this.jTabbedPaneBusquedasTransaccion.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTransaccion.getComponent(index);

			this.transaccionConstantesFunciones.setResaltarFK_IdTipoRetencionTransaccion(resaltar);

			jPanel.setBorder(this.transaccionConstantesFunciones.resaltarFK_IdTipoRetencionTransaccion);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdTipoTransa")) {
			index= this.jTabbedPaneBusquedasTransaccion.indexOfComponent(this.jPanelFK_IdTipoTransaTransaccion);

			this.jTabbedPaneBusquedasTransaccion.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTransaccion.getComponent(index);

			this.transaccionConstantesFunciones.setResaltarFK_IdTipoTransaTransaccion(resaltar);

			jPanel.setBorder(this.transaccionConstantesFunciones.resaltarFK_IdTipoTransaTransaccion);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarTransaccion.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioTransaccion() throws Exception {

		if(this.jInternalFrameDetalleFormTransaccion==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioTransaccion();
		this.updateVisibilidadResaltarControlesFormularioTransaccion();
		this.updateHabilitarResaltarControlesFormularioTransaccion();
		
	}
	
	public void updateBorderResaltarControlesFormularioTransaccion() throws Exception {
		if(this.jInternalFrameDetalleFormTransaccion==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.transaccionConstantesFunciones.resaltaridTransaccion!=null && this.jInternalFrameDetalleFormTransaccion!=null) {this.jInternalFrameDetalleFormTransaccion.jLabelidTransaccion.setBorder(this.transaccionConstantesFunciones.resaltaridTransaccion);}
		if(this.transaccionConstantesFunciones.resaltarid_empresaTransaccion!=null && this.jInternalFrameDetalleFormTransaccion!=null) {this.jInternalFrameDetalleFormTransaccion.jComboBoxid_empresaTransaccion.setBorder(this.transaccionConstantesFunciones.resaltarid_empresaTransaccion);}
		if(this.transaccionConstantesFunciones.resaltarid_sucursalTransaccion!=null && this.jInternalFrameDetalleFormTransaccion!=null) {this.jInternalFrameDetalleFormTransaccion.jComboBoxid_sucursalTransaccion.setBorder(this.transaccionConstantesFunciones.resaltarid_sucursalTransaccion);}
		if(this.transaccionConstantesFunciones.resaltarcodigoTransaccion!=null && this.jInternalFrameDetalleFormTransaccion!=null) {this.jInternalFrameDetalleFormTransaccion.jTextFieldcodigoTransaccion.setBorder(this.transaccionConstantesFunciones.resaltarcodigoTransaccion);}
		if(this.transaccionConstantesFunciones.resaltarnombreTransaccion!=null && this.jInternalFrameDetalleFormTransaccion!=null) {this.jInternalFrameDetalleFormTransaccion.jTextAreanombreTransaccion.setBorder(this.transaccionConstantesFunciones.resaltarnombreTransaccion);}
		if(this.transaccionConstantesFunciones.resaltarid_moduloTransaccion!=null && this.jInternalFrameDetalleFormTransaccion!=null) {this.jInternalFrameDetalleFormTransaccion.jComboBoxid_moduloTransaccion.setBorder(this.transaccionConstantesFunciones.resaltarid_moduloTransaccion);}
		if(this.transaccionConstantesFunciones.resaltarid_tipo_transaTransaccion!=null && this.jInternalFrameDetalleFormTransaccion!=null) {this.jInternalFrameDetalleFormTransaccion.jComboBoxid_tipo_transaTransaccion.setBorder(this.transaccionConstantesFunciones.resaltarid_tipo_transaTransaccion);}
		if(this.transaccionConstantesFunciones.resaltarid_tipo_comprobanteTransaccion!=null && this.jInternalFrameDetalleFormTransaccion!=null) {this.jInternalFrameDetalleFormTransaccion.jComboBoxid_tipo_comprobanteTransaccion.setBorder(this.transaccionConstantesFunciones.resaltarid_tipo_comprobanteTransaccion);}
		if(this.transaccionConstantesFunciones.resaltarid_tipo_transaccion_moduloTransaccion!=null && this.jInternalFrameDetalleFormTransaccion!=null) {this.jInternalFrameDetalleFormTransaccion.jComboBoxid_tipo_transaccion_moduloTransaccion.setBorder(this.transaccionConstantesFunciones.resaltarid_tipo_transaccion_moduloTransaccion);}
		if(this.transaccionConstantesFunciones.resaltarid_tipo_retencionTransaccion!=null && this.jInternalFrameDetalleFormTransaccion!=null) {this.jInternalFrameDetalleFormTransaccion.jComboBoxid_tipo_retencionTransaccion.setBorder(this.transaccionConstantesFunciones.resaltarid_tipo_retencionTransaccion);}
		if(this.transaccionConstantesFunciones.resaltarid_cuenta_contableTransaccion!=null && this.jInternalFrameDetalleFormTransaccion!=null) {this.jInternalFrameDetalleFormTransaccion.jComboBoxid_cuenta_contableTransaccion.setBorder(this.transaccionConstantesFunciones.resaltarid_cuenta_contableTransaccion);}
		if(this.transaccionConstantesFunciones.resaltardescripcionTransaccion!=null && this.jInternalFrameDetalleFormTransaccion!=null) {this.jInternalFrameDetalleFormTransaccion.jTextAreadescripcionTransaccion.setBorder(this.transaccionConstantesFunciones.resaltardescripcionTransaccion);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioTransaccion() throws Exception {		
		if(this.jInternalFrameDetalleFormTransaccion==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTransaccion!=null) {
	
		//this.jInternalFrameDetalleFormTransaccion.jLabelidTransaccion.setVisible(this.transaccionConstantesFunciones.mostraridTransaccion);
		this.jInternalFrameDetalleFormTransaccion.jPanelidTransaccion.setVisible(this.transaccionConstantesFunciones.mostraridTransaccion);
		//this.jInternalFrameDetalleFormTransaccion.jComboBoxid_empresaTransaccion.setVisible(this.transaccionConstantesFunciones.mostrarid_empresaTransaccion);
		this.jInternalFrameDetalleFormTransaccion.jPanelid_empresaTransaccion.setVisible(this.transaccionConstantesFunciones.mostrarid_empresaTransaccion);
		//this.jInternalFrameDetalleFormTransaccion.jComboBoxid_sucursalTransaccion.setVisible(this.transaccionConstantesFunciones.mostrarid_sucursalTransaccion);
		this.jInternalFrameDetalleFormTransaccion.jPanelid_sucursalTransaccion.setVisible(this.transaccionConstantesFunciones.mostrarid_sucursalTransaccion);
		//this.jInternalFrameDetalleFormTransaccion.jTextFieldcodigoTransaccion.setVisible(this.transaccionConstantesFunciones.mostrarcodigoTransaccion);
		this.jInternalFrameDetalleFormTransaccion.jPanelcodigoTransaccion.setVisible(this.transaccionConstantesFunciones.mostrarcodigoTransaccion);
		//this.jInternalFrameDetalleFormTransaccion.jTextAreanombreTransaccion.setVisible(this.transaccionConstantesFunciones.mostrarnombreTransaccion);
		this.jInternalFrameDetalleFormTransaccion.jPanelnombreTransaccion.setVisible(this.transaccionConstantesFunciones.mostrarnombreTransaccion);
		//this.jInternalFrameDetalleFormTransaccion.jComboBoxid_moduloTransaccion.setVisible(this.transaccionConstantesFunciones.mostrarid_moduloTransaccion);
		this.jInternalFrameDetalleFormTransaccion.jPanelid_moduloTransaccion.setVisible(this.transaccionConstantesFunciones.mostrarid_moduloTransaccion);
		//this.jInternalFrameDetalleFormTransaccion.jComboBoxid_tipo_transaTransaccion.setVisible(this.transaccionConstantesFunciones.mostrarid_tipo_transaTransaccion);
		this.jInternalFrameDetalleFormTransaccion.jPanelid_tipo_transaTransaccion.setVisible(this.transaccionConstantesFunciones.mostrarid_tipo_transaTransaccion);
		//this.jInternalFrameDetalleFormTransaccion.jComboBoxid_tipo_comprobanteTransaccion.setVisible(this.transaccionConstantesFunciones.mostrarid_tipo_comprobanteTransaccion);
		this.jInternalFrameDetalleFormTransaccion.jPanelid_tipo_comprobanteTransaccion.setVisible(this.transaccionConstantesFunciones.mostrarid_tipo_comprobanteTransaccion);
		//this.jInternalFrameDetalleFormTransaccion.jComboBoxid_tipo_transaccion_moduloTransaccion.setVisible(this.transaccionConstantesFunciones.mostrarid_tipo_transaccion_moduloTransaccion);
		this.jInternalFrameDetalleFormTransaccion.jPanelid_tipo_transaccion_moduloTransaccion.setVisible(this.transaccionConstantesFunciones.mostrarid_tipo_transaccion_moduloTransaccion);
		//this.jInternalFrameDetalleFormTransaccion.jComboBoxid_tipo_retencionTransaccion.setVisible(this.transaccionConstantesFunciones.mostrarid_tipo_retencionTransaccion);
		this.jInternalFrameDetalleFormTransaccion.jPanelid_tipo_retencionTransaccion.setVisible(this.transaccionConstantesFunciones.mostrarid_tipo_retencionTransaccion);
		//this.jInternalFrameDetalleFormTransaccion.jComboBoxid_cuenta_contableTransaccion.setVisible(this.transaccionConstantesFunciones.mostrarid_cuenta_contableTransaccion);
		this.jInternalFrameDetalleFormTransaccion.jPanelid_cuenta_contableTransaccion.setVisible(this.transaccionConstantesFunciones.mostrarid_cuenta_contableTransaccion);
			this.jInternalFrameDetalleFormTransaccion.jButtonid_cuenta_contableTransaccion.setVisible(this.transaccionConstantesFunciones.mostrarid_cuenta_contableTransaccion);
		//this.jInternalFrameDetalleFormTransaccion.jTextAreadescripcionTransaccion.setVisible(this.transaccionConstantesFunciones.mostrardescripcionTransaccion);
		this.jInternalFrameDetalleFormTransaccion.jPaneldescripcionTransaccion.setVisible(this.transaccionConstantesFunciones.mostrardescripcionTransaccion);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioTransaccion() throws Exception {
		if(this.jInternalFrameDetalleFormTransaccion==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTransaccion!=null) {
	
		this.jInternalFrameDetalleFormTransaccion.jLabelidTransaccion.setEnabled(this.transaccionConstantesFunciones.activaridTransaccion);
		this.jInternalFrameDetalleFormTransaccion.jComboBoxid_empresaTransaccion.setEnabled(this.transaccionConstantesFunciones.activarid_empresaTransaccion);
		this.jInternalFrameDetalleFormTransaccion.jComboBoxid_sucursalTransaccion.setEnabled(this.transaccionConstantesFunciones.activarid_sucursalTransaccion);
		this.jInternalFrameDetalleFormTransaccion.jTextFieldcodigoTransaccion.setEnabled(this.transaccionConstantesFunciones.activarcodigoTransaccion);
		this.jInternalFrameDetalleFormTransaccion.jTextAreanombreTransaccion.setEnabled(this.transaccionConstantesFunciones.activarnombreTransaccion);
		this.jInternalFrameDetalleFormTransaccion.jComboBoxid_moduloTransaccion.setEnabled(this.transaccionConstantesFunciones.activarid_moduloTransaccion);
		this.jInternalFrameDetalleFormTransaccion.jComboBoxid_tipo_transaTransaccion.setEnabled(this.transaccionConstantesFunciones.activarid_tipo_transaTransaccion);
		this.jInternalFrameDetalleFormTransaccion.jComboBoxid_tipo_comprobanteTransaccion.setEnabled(this.transaccionConstantesFunciones.activarid_tipo_comprobanteTransaccion);
		this.jInternalFrameDetalleFormTransaccion.jComboBoxid_tipo_transaccion_moduloTransaccion.setEnabled(this.transaccionConstantesFunciones.activarid_tipo_transaccion_moduloTransaccion);
		this.jInternalFrameDetalleFormTransaccion.jComboBoxid_tipo_retencionTransaccion.setEnabled(this.transaccionConstantesFunciones.activarid_tipo_retencionTransaccion);
		this.jInternalFrameDetalleFormTransaccion.jComboBoxid_cuenta_contableTransaccion.setEnabled(this.transaccionConstantesFunciones.activarid_cuenta_contableTransaccion);
			this.jInternalFrameDetalleFormTransaccion.jButtonid_cuenta_contableTransaccion.setEnabled(this.transaccionConstantesFunciones.activarid_cuenta_contableTransaccion);
		this.jInternalFrameDetalleFormTransaccion.jTextAreadescripcionTransaccion.setEnabled(this.transaccionConstantesFunciones.activardescripcionTransaccion);
		}
	}
	
		
}