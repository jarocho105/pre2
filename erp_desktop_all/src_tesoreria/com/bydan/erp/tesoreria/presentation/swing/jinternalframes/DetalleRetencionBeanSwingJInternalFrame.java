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

import com.bydan.erp.tesoreria.util.DetalleRetencionConstantesFunciones;
import com.bydan.erp.tesoreria.util.DetalleRetencionParameterReturnGeneral;
//import com.bydan.erp.tesoreria.util.DetalleRetencionParameterGeneral;
//import com.bydan.erp.tesoreria.presentation.report.source.DetalleRetencionBean;
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
import com.bydan.erp.contabilidad.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.tesoreria.business.entity.*;
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
import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.contabilidad.util.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class DetalleRetencionBeanSwingJInternalFrame extends DetalleRetencionJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(DetalleRetencionBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<DetalleRetencion> detalleretencionValidator = new ClassValidator<DetalleRetencion>(DetalleRetencion.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public DetalleRetencion detalleretencion;	
	public DetalleRetencion detalleretencionAux;
	public DetalleRetencion detalleretencionAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public DetalleRetencion detalleretencionTotales;
	public Long idDetalleRetencionActual;
	public Long iIdNuevoDetalleRetencion=0L;
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

	public String sFinalQueryComboEmpresaDestino="";

	public List<Empresa> empresadestinosForeignKey;

	public List<Empresa> getempresadestinosForeignKey() {
		return empresadestinosForeignKey;
	}

	public void setempresadestinosForeignKey(List<Empresa> empresadestinosForeignKey) {
		this.empresadestinosForeignKey = empresadestinosForeignKey;
	}

	//OBJETO FK ACTUAL
	public Empresa empresadestinoForeignKey;

	public Empresa getempresadestinoForeignKey() {
		return empresadestinoForeignKey;
	}

	public void setempresadestinoForeignKey(Empresa empresadestinoForeignKey) {
		this.empresadestinoForeignKey = empresadestinoForeignKey;
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

	public String sFinalQueryComboCuentaContableCredito="";

	public List<CuentaContable> cuentacontablecreditosForeignKey;

	public List<CuentaContable> getcuentacontablecreditosForeignKey() {
		return cuentacontablecreditosForeignKey;
	}

	public void setcuentacontablecreditosForeignKey(List<CuentaContable> cuentacontablecreditosForeignKey) {
		this.cuentacontablecreditosForeignKey = cuentacontablecreditosForeignKey;
	}

	//OBJETO FK ACTUAL
	public CuentaContable cuentacontablecreditoForeignKey;

	public CuentaContable getcuentacontablecreditoForeignKey() {
		return cuentacontablecreditoForeignKey;
	}

	public void setcuentacontablecreditoForeignKey(CuentaContable cuentacontablecreditoForeignKey) {
		this.cuentacontablecreditoForeignKey = cuentacontablecreditoForeignKey;
	}

		
	
	
	
	//BUSQUEDA INTERNA FK
	public Long idCuentaContableActual=0L;

	public Long getidCuentaContableActual() {
		return idCuentaContableActual;
	}

	public void setidCuentaContableActual(Long idCuentaContableActual) {
		this.idCuentaContableActual= idCuentaContableActual;
	}
	public Long idCuentaContableCreditoActual=0L;

	public Long getidCuentaContableCreditoActual() {
		return idCuentaContableCreditoActual;
	}

	public void setidCuentaContableCreditoActual(Long idCuentaContableCreditoActual) {
		this.idCuentaContableCreditoActual= idCuentaContableCreditoActual;
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
	
	public Boolean isPermisoTodoDetalleRetencion;
	public Boolean isPermisoNuevoDetalleRetencion;
	public Boolean isPermisoActualizarDetalleRetencion;
	public Boolean isPermisoActualizarOriginalDetalleRetencion;
	public Boolean isPermisoEliminarDetalleRetencion;
	public Boolean isPermisoGuardarCambiosDetalleRetencion;
	public Boolean isPermisoConsultaDetalleRetencion;
	public Boolean isPermisoBusquedaDetalleRetencion;
	public Boolean isPermisoReporteDetalleRetencion;
	public Boolean isPermisoPaginacionMedioDetalleRetencion;
	public Boolean isPermisoPaginacionAltoDetalleRetencion;
	public Boolean isPermisoPaginacionTodoDetalleRetencion;
	public Boolean isPermisoCopiarDetalleRetencion;
	public Boolean isPermisoVerFormDetalleRetencion;
	public Boolean isPermisoDuplicarDetalleRetencion;
	public Boolean isPermisoOrdenDetalleRetencion;
	
	
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
	
	public DetalleRetencionParameterReturnGeneral detalleretencionReturnGeneral;
	public DetalleRetencionParameterReturnGeneral detalleretencionParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoDetalleRetencion=false;
	public Boolean esParaAccionDesdeFormularioDetalleRetencion=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected DetalleRetencionSessionBeanAdditional detalleretencionSessionBeanAdditional=null;
	
	public DetalleRetencionSessionBeanAdditional getDetalleRetencionSessionBeanAdditional() {
		return this.detalleretencionSessionBeanAdditional;
	}
	
	public void setDetalleRetencionSessionBeanAdditional(DetalleRetencionSessionBeanAdditional detalleretencionSessionBeanAdditional) {
		try {
			this.detalleretencionSessionBeanAdditional=detalleretencionSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected DetalleRetencionBeanSwingJInternalFrameAdditional detalleretencionBeanSwingJInternalFrameAdditional=null;
	//public class DetalleRetencionBeanSwingJInternalFrame
	
	public DetalleRetencionBeanSwingJInternalFrameAdditional getDetalleRetencionBeanSwingJInternalFrameAdditional() {
		return this.detalleretencionBeanSwingJInternalFrameAdditional;
	}
	
	public void setDetalleRetencionBeanSwingJInternalFrameAdditional(DetalleRetencionBeanSwingJInternalFrameAdditional detalleretencionBeanSwingJInternalFrameAdditional) {
		try {
			this.detalleretencionBeanSwingJInternalFrameAdditional=detalleretencionBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public DetalleRetencionLogic detalleretencionLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public DetalleRetencion detalleretencionBean;
	public DetalleRetencionConstantesFunciones detalleretencionConstantesFunciones;
	//public DetalleRetencionParameterReturnGeneral detalleretencionReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	public EmpresaLogic empresadestinoLogic;
	public CuentaContableLogic cuentacontableLogic;
	public CuentaContableLogic cuentacontablecreditoLogic;
	
	//PARAMETROS
	
	
	//public List<DetalleRetencion> detalleretencions;	
	//public List<DetalleRetencion> detalleretencionsEliminados;
	//public List<DetalleRetencion> detalleretencionsAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoDetalleRetencion=false;
	public Boolean isVisibilidadCeldaDuplicarDetalleRetencion=true;
	public Boolean isVisibilidadCeldaCopiarDetalleRetencion=true;
	public Boolean isVisibilidadCeldaVerFormDetalleRetencion=true;
	public Boolean isVisibilidadCeldaOrdenDetalleRetencion=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesDetalleRetencion=false;
	public Boolean isVisibilidadCeldaModificarDetalleRetencion=false;
	public Boolean isVisibilidadCeldaActualizarDetalleRetencion=false;
	public Boolean isVisibilidadCeldaEliminarDetalleRetencion=false;
	public Boolean isVisibilidadCeldaCancelarDetalleRetencion=false;
	public Boolean isVisibilidadCeldaGuardarDetalleRetencion=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosDetalleRetencion=false;	
	
	
	public Boolean isVisibilidadFK_IdCuentaContable=false;
	public Boolean isVisibilidadFK_IdCuentaContableCredito=false;
	public Boolean isVisibilidadFK_IdDetalleRetencion=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	
	public Long getiIdNuevoDetalleRetencion() {
		return this.iIdNuevoDetalleRetencion;
	}

	public void setiIdNuevoDetalleRetencion(Long iIdNuevoDetalleRetencion) {
		this.iIdNuevoDetalleRetencion = iIdNuevoDetalleRetencion;
	}
	
	public Long getidDetalleRetencionActual() {
		return this.idDetalleRetencionActual;
	}

	public void setidDetalleRetencionActual(Long idDetalleRetencionActual) {
		this.idDetalleRetencionActual = idDetalleRetencionActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public DetalleRetencion getdetalleretencion() {
		return this.detalleretencion;
	}

	public void setdetalleretencion(DetalleRetencion detalleretencion) {
		this.detalleretencion = detalleretencion;
	}
	
	public DetalleRetencion getdetalleretencionAux() {
		return this.detalleretencionAux;
	}

	public void setdetalleretencionAux(DetalleRetencion detalleretencionAux) {
		this.detalleretencionAux = detalleretencionAux;
	}				
	
	public DetalleRetencion getdetalleretencionAnterior() {
		return this.detalleretencionAnterior;
	}

	public void setdetalleretencionAnterior(DetalleRetencion detalleretencionAnterior) {
		this.detalleretencionAnterior = detalleretencionAnterior;
	}	
	
	public DetalleRetencion getdetalleretencionTotales() {
		return this.detalleretencionTotales;
	}

	public void setdetalleretencionTotales(DetalleRetencion detalleretencionTotales) {
		this.detalleretencionTotales = detalleretencionTotales;
	}	
	
	public DetalleRetencion getdetalleretencionBean() {
		return this.detalleretencionBean;
	}

	public void setdetalleretencionBean(DetalleRetencion detalleretencionBean) {
		this.detalleretencionBean = detalleretencionBean;
	}	
	
	public DetalleRetencionParameterReturnGeneral getdetalleretencionReturnGeneral() {
		return this.detalleretencionReturnGeneral;
	}

	public void setdetalleretencionReturnGeneral(DetalleRetencionParameterReturnGeneral detalleretencionReturnGeneral) {
		this.detalleretencionReturnGeneral = detalleretencionReturnGeneral;
	}	
	
	
	public Long id_cuenta_contableFK_IdCuentaContable=-1L;

	public Long getid_cuenta_contableFK_IdCuentaContable() {
		return this.id_cuenta_contableFK_IdCuentaContable;
	}

	public void setid_cuenta_contableFK_IdCuentaContable(Long id_cuenta_contableFK_IdCuentaContable) {
		this.id_cuenta_contableFK_IdCuentaContable = id_cuenta_contableFK_IdCuentaContable;
	}

	public Long id_cuenta_contable_creditoFK_IdCuentaContableCredito=-1L;

	public Long getid_cuenta_contable_creditoFK_IdCuentaContableCredito() {
		return this.id_cuenta_contable_creditoFK_IdCuentaContableCredito;
	}

	public void setid_cuenta_contable_creditoFK_IdCuentaContableCredito(Long id_cuenta_contable_creditoFK_IdCuentaContableCredito) {
		this.id_cuenta_contable_creditoFK_IdCuentaContableCredito = id_cuenta_contable_creditoFK_IdCuentaContableCredito;
	}

	public Long id_empresa_destinoFK_IdDetalleRetencion=-1L;

	public Long getid_empresa_destinoFK_IdDetalleRetencion() {
		return this.id_empresa_destinoFK_IdDetalleRetencion;
	}

	public void setid_empresa_destinoFK_IdDetalleRetencion(Long id_empresa_destinoFK_IdDetalleRetencion) {
		this.id_empresa_destinoFK_IdDetalleRetencion = id_empresa_destinoFK_IdDetalleRetencion;
	}

	public Long id_empresaFK_IdEmpresa=-1L;

	public Long getid_empresaFK_IdEmpresa() {
		return this.id_empresaFK_IdEmpresa;
	}

	public void setid_empresaFK_IdEmpresa(Long id_empresaFK_IdEmpresa) {
		this.id_empresaFK_IdEmpresa = id_empresaFK_IdEmpresa;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public DetalleRetencionLogic getDetalleRetencionLogic()	{		
		return detalleretencionLogic;
	}

	public void setDetalleRetencionLogic(DetalleRetencionLogic detalleretencionLogic) {
		this.detalleretencionLogic = detalleretencionLogic;
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
	
	public Boolean getIsEsNuevoDetalleRetencion() {
		return isEsNuevoDetalleRetencion;
	}

	public void setIsEsNuevoDetalleRetencion(Boolean isEsNuevoDetalleRetencion) {
		this.isEsNuevoDetalleRetencion = isEsNuevoDetalleRetencion;
	}

	public Boolean getEsParaAccionDesdeFormularioDetalleRetencion() {
		return esParaAccionDesdeFormularioDetalleRetencion;
	}
	
	public void setEsParaAccionDesdeFormularioDetalleRetencion(Boolean esParaAccionDesdeFormularioDetalleRetencion) {
		this.esParaAccionDesdeFormularioDetalleRetencion = esParaAccionDesdeFormularioDetalleRetencion;
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

			if(this.detalleretencionSessionBean==null) {
				this.detalleretencionSessionBean=new DetalleRetencionSessionBean();
			}

			if(!this.detalleretencionSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(detalleretencionSessionBean.getlidEmpresaActual());
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

	public void cargarCombosEmpresaDestinosForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.empresadestinosForeignKey=new ArrayList<Empresa>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			EmpresaLogic empresaLogic=new EmpresaLogic();

			//empresaLogic.getEmpresaDataAccess().setIsForForeingKeyData(true);

			if(this.detalleretencionSessionBean==null) {
				this.detalleretencionSessionBean=new DetalleRetencionSessionBean();
			}

			if(!this.detalleretencionSessionBean.getisBusquedaDesdeForeignKeySesionEmpresaDestino()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//empresadestinoLogic.getEmpresaDataAccess().setIsForForeingKeyData(true);

					empresaLogic.getTodosEmpresasWithConnection(sFinalQuery,new Pagination());

					this.empresadestinosForeignKey=empresaLogic.getEmpresas();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaEmpresaDestino(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					empresaLogic.getEntityWithConnection(detalleretencionSessionBean.getlidEmpresaDestinoActual());
					this.empresadestinosForeignKey.add(empresaLogic.getEmpresa());
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

			if(this.detalleretencionSessionBean==null) {
				this.detalleretencionSessionBean=new DetalleRetencionSessionBean();
			}

			if(!this.detalleretencionSessionBean.getisBusquedaDesdeForeignKeySesionCuentaContable()) {
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
					cuentacontableLogic.getEntityWithConnection(detalleretencionSessionBean.getlidCuentaContableActual());
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

	public void cargarCombosCuentaContableCreditosForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.cuentacontablecreditosForeignKey=new ArrayList<CuentaContable>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			CuentaContableLogic cuentacontableLogic=new CuentaContableLogic();

			//cuentacontableLogic.getCuentaContableDataAccess().setIsForForeingKeyData(true);

			if(this.detalleretencionSessionBean==null) {
				this.detalleretencionSessionBean=new DetalleRetencionSessionBean();
			}

			if(!this.detalleretencionSessionBean.getisBusquedaDesdeForeignKeySesionCuentaContableCredito()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//cuentacontablecreditoLogic.getCuentaContableDataAccess().setIsForForeingKeyData(true);

					cuentacontableLogic.getTodosCuentaContablesWithConnection(sFinalQuery,new Pagination());

					this.cuentacontablecreditosForeignKey=cuentacontableLogic.getCuentaContables();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaCuentaContableCredito(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					cuentacontableLogic.getEntityWithConnection(detalleretencionSessionBean.getlidCuentaContableCreditoActual());
					this.cuentacontablecreditosForeignKey.add(cuentacontableLogic.getCuentaContable());
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

					if(this.detalleretencion!=null) {
						this.detalleretencion.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormDetalleRetencion!=null) {
						this.jInternalFrameDetalleFormDetalleRetencion.jComboBoxid_empresaDetalleRetencion.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaDetalleRetencion.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormDetalleRetencion!=null) {
						if(this.jInternalFrameDetalleFormDetalleRetencion.jComboBoxid_empresaDetalleRetencion.getItemCount()>0) {
							this.jInternalFrameDetalleFormDetalleRetencion.jComboBoxid_empresaDetalleRetencion.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaDetalleRetencionGenerico)throws Exception
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
				jComboBoxid_empresaDetalleRetencionGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaDetalleRetencionGenerico!=null && jComboBoxid_empresaDetalleRetencionGenerico.getItemCount()>0) {
					jComboBoxid_empresaDetalleRetencionGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualEmpresaDestinoForeignKey(Long idEmpresaDestinoSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Empresa  empresadestinoTemp=null;

			for(Empresa empresadestinoAux:empresadestinosForeignKey) {
				if(empresadestinoAux.getId()!=null && empresadestinoAux.getId().equals(idEmpresaDestinoSeleccionado)) {
					empresadestinoTemp=empresadestinoAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(empresadestinoTemp!=null) {

					if(this.detalleretencion!=null) {
						this.detalleretencion.setEmpresaDestino(empresadestinoTemp);
					}

					if(this.jInternalFrameDetalleFormDetalleRetencion!=null) {
						this.jInternalFrameDetalleFormDetalleRetencion.jComboBoxid_empresa_destinoDetalleRetencion.setSelectedItem(empresadestinoTemp);
					}
				} else {
					//jComboBoxid_empresa_destinoDetalleRetencion.setSelectedItem(empresadestinoTemp);
					if(this.jInternalFrameDetalleFormDetalleRetencion!=null) {
						if(this.jInternalFrameDetalleFormDetalleRetencion.jComboBoxid_empresa_destinoDetalleRetencion.getItemCount()>0) {
							this.jInternalFrameDetalleFormDetalleRetencion.jComboBoxid_empresa_destinoDetalleRetencion.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdDetalleRetencion") || sFormularioTipoBusqueda.equals("Todos")){
					if(empresadestinoTemp!=null && jComboBoxid_empresa_destinoFK_IdDetalleRetencionDetalleRetencion!=null) {
						jComboBoxid_empresa_destinoFK_IdDetalleRetencionDetalleRetencion.setSelectedItem(empresadestinoTemp);
					} else {
						if(jComboBoxid_empresa_destinoFK_IdDetalleRetencionDetalleRetencion!=null) {
							//jComboBoxid_empresa_destinoFK_IdDetalleRetencionDetalleRetencion.setSelectedItem(empresadestinoTemp);
							if(jComboBoxid_empresa_destinoFK_IdDetalleRetencionDetalleRetencion.getItemCount()>0) {
								jComboBoxid_empresa_destinoFK_IdDetalleRetencionDetalleRetencion.setSelectedIndex(0);
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

	public String getActualEmpresaDestinoForeignKeyDescripcion(Long idEmpresaDestinoSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Empresa  empresadestinoTemp=null;

			for(Empresa empresadestinoAux:empresadestinosForeignKey) {
				if(empresadestinoAux.getId()!=null && empresadestinoAux.getId().equals(idEmpresaDestinoSeleccionado)) {
					empresadestinoTemp=empresadestinoAux;
					break;
				}
			}


			sDescripcion=EmpresaConstantesFunciones.getEmpresaDescripcion(empresadestinoTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualEmpresaDestinoForeignKeyGenerico(Long idEmpresaDestinoSeleccionado,JComboBox jComboBoxid_empresa_destinoDetalleRetencionGenerico)throws Exception
	{
		try
		{
			Empresa  empresadestinoTemp=null;

			for(Empresa empresadestinoAux:empresadestinosForeignKey) {
				if(empresadestinoAux.getId()!=null && empresadestinoAux.getId().equals(idEmpresaDestinoSeleccionado)) {
					empresadestinoTemp=empresadestinoAux;
					break;
				}
			}

			if(empresadestinoTemp!=null) {
				jComboBoxid_empresa_destinoDetalleRetencionGenerico.setSelectedItem(empresadestinoTemp);
			} else {
				if(jComboBoxid_empresa_destinoDetalleRetencionGenerico!=null && jComboBoxid_empresa_destinoDetalleRetencionGenerico.getItemCount()>0) {
					jComboBoxid_empresa_destinoDetalleRetencionGenerico.setSelectedIndex(0);
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

					if(this.detalleretencion!=null) {
						this.detalleretencion.setCuentaContable(cuentacontableTemp);
					}

					if(this.jInternalFrameDetalleFormDetalleRetencion!=null) {
						this.jInternalFrameDetalleFormDetalleRetencion.jComboBoxid_cuenta_contableDetalleRetencion.setSelectedItem(cuentacontableTemp);
					}
				} else {
					//jComboBoxid_cuenta_contableDetalleRetencion.setSelectedItem(cuentacontableTemp);
					if(this.jInternalFrameDetalleFormDetalleRetencion!=null) {
						if(this.jInternalFrameDetalleFormDetalleRetencion.jComboBoxid_cuenta_contableDetalleRetencion.getItemCount()>0) {
							this.jInternalFrameDetalleFormDetalleRetencion.jComboBoxid_cuenta_contableDetalleRetencion.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdCuentaContable") || sFormularioTipoBusqueda.equals("Todos")){
					if(cuentacontableTemp!=null && jComboBoxid_cuenta_contableFK_IdCuentaContableDetalleRetencion!=null) {
						jComboBoxid_cuenta_contableFK_IdCuentaContableDetalleRetencion.setSelectedItem(cuentacontableTemp);
					} else {
						if(jComboBoxid_cuenta_contableFK_IdCuentaContableDetalleRetencion!=null) {
							//jComboBoxid_cuenta_contableFK_IdCuentaContableDetalleRetencion.setSelectedItem(cuentacontableTemp);
							if(jComboBoxid_cuenta_contableFK_IdCuentaContableDetalleRetencion.getItemCount()>0) {
								jComboBoxid_cuenta_contableFK_IdCuentaContableDetalleRetencion.setSelectedIndex(0);
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
	public void setActualCuentaContableForeignKeyGenerico(Long idCuentaContableSeleccionado,JComboBox jComboBoxid_cuenta_contableDetalleRetencionGenerico)throws Exception
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
				jComboBoxid_cuenta_contableDetalleRetencionGenerico.setSelectedItem(cuentacontableTemp);
			} else {
				if(jComboBoxid_cuenta_contableDetalleRetencionGenerico!=null && jComboBoxid_cuenta_contableDetalleRetencionGenerico.getItemCount()>0) {
					jComboBoxid_cuenta_contableDetalleRetencionGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualCuentaContableCreditoForeignKey(Long idCuentaContableCreditoSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			CuentaContable  cuentacontablecreditoTemp=null;

			for(CuentaContable cuentacontablecreditoAux:cuentacontablecreditosForeignKey) {
				if(cuentacontablecreditoAux.getId()!=null && cuentacontablecreditoAux.getId().equals(idCuentaContableCreditoSeleccionado)) {
					cuentacontablecreditoTemp=cuentacontablecreditoAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(cuentacontablecreditoTemp!=null) {

					if(this.detalleretencion!=null) {
						this.detalleretencion.setCuentaContableCredito(cuentacontablecreditoTemp);
					}

					if(this.jInternalFrameDetalleFormDetalleRetencion!=null) {
						this.jInternalFrameDetalleFormDetalleRetencion.jComboBoxid_cuenta_contable_creditoDetalleRetencion.setSelectedItem(cuentacontablecreditoTemp);
					}
				} else {
					//jComboBoxid_cuenta_contable_creditoDetalleRetencion.setSelectedItem(cuentacontablecreditoTemp);
					if(this.jInternalFrameDetalleFormDetalleRetencion!=null) {
						if(this.jInternalFrameDetalleFormDetalleRetencion.jComboBoxid_cuenta_contable_creditoDetalleRetencion.getItemCount()>0) {
							this.jInternalFrameDetalleFormDetalleRetencion.jComboBoxid_cuenta_contable_creditoDetalleRetencion.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdCuentaContableCredito") || sFormularioTipoBusqueda.equals("Todos")){
					if(cuentacontablecreditoTemp!=null && jComboBoxid_cuenta_contable_creditoFK_IdCuentaContableCreditoDetalleRetencion!=null) {
						jComboBoxid_cuenta_contable_creditoFK_IdCuentaContableCreditoDetalleRetencion.setSelectedItem(cuentacontablecreditoTemp);
					} else {
						if(jComboBoxid_cuenta_contable_creditoFK_IdCuentaContableCreditoDetalleRetencion!=null) {
							//jComboBoxid_cuenta_contable_creditoFK_IdCuentaContableCreditoDetalleRetencion.setSelectedItem(cuentacontablecreditoTemp);
							if(jComboBoxid_cuenta_contable_creditoFK_IdCuentaContableCreditoDetalleRetencion.getItemCount()>0) {
								jComboBoxid_cuenta_contable_creditoFK_IdCuentaContableCreditoDetalleRetencion.setSelectedIndex(0);
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

	public String getActualCuentaContableCreditoForeignKeyDescripcion(Long idCuentaContableCreditoSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			CuentaContable  cuentacontablecreditoTemp=null;

			for(CuentaContable cuentacontablecreditoAux:cuentacontablecreditosForeignKey) {
				if(cuentacontablecreditoAux.getId()!=null && cuentacontablecreditoAux.getId().equals(idCuentaContableCreditoSeleccionado)) {
					cuentacontablecreditoTemp=cuentacontablecreditoAux;
					break;
				}
			}


			sDescripcion=CuentaContableConstantesFunciones.getCuentaContableDescripcion(cuentacontablecreditoTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualCuentaContableCreditoForeignKeyGenerico(Long idCuentaContableCreditoSeleccionado,JComboBox jComboBoxid_cuenta_contable_creditoDetalleRetencionGenerico)throws Exception
	{
		try
		{
			CuentaContable  cuentacontablecreditoTemp=null;

			for(CuentaContable cuentacontablecreditoAux:cuentacontablecreditosForeignKey) {
				if(cuentacontablecreditoAux.getId()!=null && cuentacontablecreditoAux.getId().equals(idCuentaContableCreditoSeleccionado)) {
					cuentacontablecreditoTemp=cuentacontablecreditoAux;
					break;
				}
			}

			if(cuentacontablecreditoTemp!=null) {
				jComboBoxid_cuenta_contable_creditoDetalleRetencionGenerico.setSelectedItem(cuentacontablecreditoTemp);
			} else {
				if(jComboBoxid_cuenta_contable_creditoDetalleRetencionGenerico!=null && jComboBoxid_cuenta_contable_creditoDetalleRetencionGenerico.getItemCount()>0) {
					jComboBoxid_cuenta_contable_creditoDetalleRetencionGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(DetalleRetencion detalleretencion,JComboBox jComboBoxid_empresaDetalleRetencionGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaDetalleRetencionGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormDetalleRetencion.jComboBoxid_empresaDetalleRetencion.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaDetalleRetencionGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				detalleretencion.setid_empresa(empresaAux.getId());
				detalleretencion.setempresa_descripcion(DetalleRetencionConstantesFunciones.getEmpresaDescripcion(empresaAux));
				detalleretencion.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaDestinoForeignKey(DetalleRetencion detalleretencion,JComboBox jComboBoxid_empresa_destinoDetalleRetencionGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresa_destinoDetalleRetencionGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormDetalleRetencion.jComboBoxid_empresa_destinoDetalleRetencion.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresa_destinoDetalleRetencionGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				detalleretencion.setid_empresa_destino(empresaAux.getId());
				detalleretencion.setempresadestino_descripcion(DetalleRetencionConstantesFunciones.getEmpresaDestinoDescripcion(empresaAux));
				detalleretencion.setEmpresaDestino(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarCuentaContableForeignKey(DetalleRetencion detalleretencion,JComboBox jComboBoxid_cuenta_contableDetalleRetencionGenerico)throws Exception
	{
		try
		{
			CuentaContable  cuentacontableAux=new CuentaContable();

			if(jComboBoxid_cuenta_contableDetalleRetencionGenerico==null) {
				cuentacontableAux=(CuentaContable)this.jInternalFrameDetalleFormDetalleRetencion.jComboBoxid_cuenta_contableDetalleRetencion.getSelectedItem();
			} else {
				cuentacontableAux=(CuentaContable)jComboBoxid_cuenta_contableDetalleRetencionGenerico.getSelectedItem();
			}

			if(cuentacontableAux!=null && cuentacontableAux.getId()!=null) {
				detalleretencion.setid_cuenta_contable(cuentacontableAux.getId());
				detalleretencion.setcuentacontable_descripcion(DetalleRetencionConstantesFunciones.getCuentaContableDescripcion(cuentacontableAux));
				detalleretencion.setCuentaContable(cuentacontableAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarCuentaContableCreditoForeignKey(DetalleRetencion detalleretencion,JComboBox jComboBoxid_cuenta_contable_creditoDetalleRetencionGenerico)throws Exception
	{
		try
		{
			CuentaContable  cuentacontableAux=new CuentaContable();

			if(jComboBoxid_cuenta_contable_creditoDetalleRetencionGenerico==null) {
				cuentacontableAux=(CuentaContable)this.jInternalFrameDetalleFormDetalleRetencion.jComboBoxid_cuenta_contable_creditoDetalleRetencion.getSelectedItem();
			} else {
				cuentacontableAux=(CuentaContable)jComboBoxid_cuenta_contable_creditoDetalleRetencionGenerico.getSelectedItem();
			}

			if(cuentacontableAux!=null && cuentacontableAux.getId()!=null) {
				detalleretencion.setid_cuenta_contable_credito(cuentacontableAux.getId());
				detalleretencion.setcuentacontablecredito_descripcion(DetalleRetencionConstantesFunciones.getCuentaContableCreditoDescripcion(cuentacontableAux));
				detalleretencion.setCuentaContableCredito(cuentacontableAux);			}
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

					if(!DetalleRetencionJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormDetalleRetencion!=null) { 
							this.jInternalFrameDetalleFormDetalleRetencion.jComboBoxid_empresaDetalleRetencion.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormDetalleRetencion.jComboBoxid_empresaDetalleRetencion.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormDetalleRetencion!=null) { 
					}

					if(!DetalleRetencionJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameEmpresaDestinosForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingEmpresa=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!DetalleRetencionJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormDetalleRetencion!=null) { 
							this.jInternalFrameDetalleFormDetalleRetencion.jComboBoxid_empresa_destinoDetalleRetencion.removeAllItems();

							for(Empresa empresadestino:this.empresadestinosForeignKey) {
								this.jInternalFrameDetalleFormDetalleRetencion.jComboBoxid_empresa_destinoDetalleRetencion.addItem(empresadestino);
							}
						}
					}

					if(this.jInternalFrameDetalleFormDetalleRetencion!=null) { 
					}

					if(!DetalleRetencionJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdDetalleRetencion") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!DetalleRetencionJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_empresa_destinoFK_IdDetalleRetencionDetalleRetencion.removeAllItems();

							for(Empresa empresadestino:this.empresadestinosForeignKey) {
								this.jComboBoxid_empresa_destinoFK_IdDetalleRetencionDetalleRetencion.addItem(empresadestino);
							}
						}

						if(!DetalleRetencionJInternalFrame.ISBINDING_MANUAL) {
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

					if(!DetalleRetencionJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormDetalleRetencion!=null) { 
							this.jInternalFrameDetalleFormDetalleRetencion.jComboBoxid_cuenta_contableDetalleRetencion.removeAllItems();

							for(CuentaContable cuentacontable:this.cuentacontablesForeignKey) {
								this.jInternalFrameDetalleFormDetalleRetencion.jComboBoxid_cuenta_contableDetalleRetencion.addItem(cuentacontable);
							}
						}
					}

					if(this.jInternalFrameDetalleFormDetalleRetencion!=null) { 
					}

					if(!DetalleRetencionJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdCuentaContable") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!DetalleRetencionJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_cuenta_contableFK_IdCuentaContableDetalleRetencion.removeAllItems();

							for(CuentaContable cuentacontable:this.cuentacontablesForeignKey) {
								this.jComboBoxid_cuenta_contableFK_IdCuentaContableDetalleRetencion.addItem(cuentacontable);
							}
						}

						if(!DetalleRetencionJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameCuentaContableCreditosForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingCuentaContable=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!DetalleRetencionJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormDetalleRetencion!=null) { 
							this.jInternalFrameDetalleFormDetalleRetencion.jComboBoxid_cuenta_contable_creditoDetalleRetencion.removeAllItems();

							for(CuentaContable cuentacontablecredito:this.cuentacontablecreditosForeignKey) {
								this.jInternalFrameDetalleFormDetalleRetencion.jComboBoxid_cuenta_contable_creditoDetalleRetencion.addItem(cuentacontablecredito);
							}
						}
					}

					if(this.jInternalFrameDetalleFormDetalleRetencion!=null) { 
					}

					if(!DetalleRetencionJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdCuentaContableCredito") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!DetalleRetencionJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_cuenta_contable_creditoFK_IdCuentaContableCreditoDetalleRetencion.removeAllItems();

							for(CuentaContable cuentacontablecredito:this.cuentacontablecreditosForeignKey) {
								this.jComboBoxid_cuenta_contable_creditoFK_IdCuentaContableCreditoDetalleRetencion.addItem(cuentacontablecredito);
							}
						}

						if(!DetalleRetencionJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormDetalleRetencion!=null) {
							this.jInternalFrameDetalleFormDetalleRetencion.jComboBoxid_empresaDetalleRetencion.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormDetalleRetencion!=null) {
							this.jInternalFrameDetalleFormDetalleRetencion.jComboBoxid_empresaDetalleRetencion.setSelectedIndex(iIndexSelected);
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

		public void setSelectedItemCombosFrameEmpresaDestinoForeignKey(Empresa empresadestino,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormDetalleRetencion!=null) {
							this.jInternalFrameDetalleFormDetalleRetencion.jComboBoxid_empresa_destinoDetalleRetencion.setSelectedItem(empresadestino);
						}
					} else {
						if(this.jInternalFrameDetalleFormDetalleRetencion!=null) {
							this.jInternalFrameDetalleFormDetalleRetencion.jComboBoxid_empresa_destinoDetalleRetencion.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_empresa_destinoFK_IdDetalleRetencionDetalleRetencion.setSelectedItem(empresadestino);
						} else {
							this.jComboBoxid_empresa_destinoFK_IdDetalleRetencionDetalleRetencion.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormDetalleRetencion!=null) {
							this.jInternalFrameDetalleFormDetalleRetencion.jComboBoxid_cuenta_contableDetalleRetencion.setSelectedItem(cuentacontable);
						}
					} else {
						if(this.jInternalFrameDetalleFormDetalleRetencion!=null) {
							this.jInternalFrameDetalleFormDetalleRetencion.jComboBoxid_cuenta_contableDetalleRetencion.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_cuenta_contableFK_IdCuentaContableDetalleRetencion.setSelectedItem(cuentacontable);
						} else {
							this.jComboBoxid_cuenta_contableFK_IdCuentaContableDetalleRetencion.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameCuentaContableCreditoForeignKey(CuentaContable cuentacontablecredito,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormDetalleRetencion!=null) {
							this.jInternalFrameDetalleFormDetalleRetencion.jComboBoxid_cuenta_contable_creditoDetalleRetencion.setSelectedItem(cuentacontablecredito);
						}
					} else {
						if(this.jInternalFrameDetalleFormDetalleRetencion!=null) {
							this.jInternalFrameDetalleFormDetalleRetencion.jComboBoxid_cuenta_contable_creditoDetalleRetencion.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_cuenta_contable_creditoFK_IdCuentaContableCreditoDetalleRetencion.setSelectedItem(cuentacontablecredito);
						} else {
							this.jComboBoxid_cuenta_contable_creditoFK_IdCuentaContableCreditoDetalleRetencion.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesDetalleRetencion() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			DetalleRetencionConstantesFunciones.refrescarForeignKeysDescripcionesDetalleRetencion(this.detalleretencionLogic.getDetalleRetencions());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			DetalleRetencionConstantesFunciones.refrescarForeignKeysDescripcionesDetalleRetencion(this.detalleretencions);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
		classes.add(new Classe(CuentaContable.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//detalleretencionLogic.setDetalleRetencions(this.detalleretencions);
			detalleretencionLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public DetalleRetencionParameterReturnGeneral getDetalleRetencionParameterGeneral() {
		return this.detalleretencionParameterGeneral;
	}
	
	public void setDetalleRetencionParameterGeneral(DetalleRetencionParameterReturnGeneral detalleretencionParameterGeneral) {
		this.detalleretencionParameterGeneral = detalleretencionParameterGeneral;
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
	
	public Boolean getIsPermisoTodoDetalleRetencion() {
		return isPermisoTodoDetalleRetencion;
	}

	public void setIsPermisoTodoDetalleRetencion(Boolean isPermisoTodoDetalleRetencion) {
		this.isPermisoTodoDetalleRetencion = isPermisoTodoDetalleRetencion;
	}

	public Boolean getIsPermisoNuevoDetalleRetencion() {
		return isPermisoNuevoDetalleRetencion;
	}

	public void setIsPermisoNuevoDetalleRetencion(Boolean isPermisoNuevoDetalleRetencion) {
		this.isPermisoNuevoDetalleRetencion = isPermisoNuevoDetalleRetencion;
	}

	public Boolean getIsPermisoActualizarDetalleRetencion() {
		return isPermisoActualizarDetalleRetencion;
	}

	public void setIsPermisoActualizarDetalleRetencion(Boolean isPermisoActualizarDetalleRetencion) {
		this.isPermisoActualizarDetalleRetencion = isPermisoActualizarDetalleRetencion;
	}

	public Boolean getIsPermisoEliminarDetalleRetencion() {
		return isPermisoEliminarDetalleRetencion;
	}

	public void setIsPermisoEliminarDetalleRetencion(Boolean isPermisoEliminarDetalleRetencion) {
		this.isPermisoEliminarDetalleRetencion = isPermisoEliminarDetalleRetencion;
	}

	public Boolean getIsPermisoGuardarCambiosDetalleRetencion() {
		return isPermisoGuardarCambiosDetalleRetencion;
	}

	public void setIsPermisoGuardarCambiosDetalleRetencion(Boolean isPermisoGuardarCambiosDetalleRetencion) {
		this.isPermisoGuardarCambiosDetalleRetencion = isPermisoGuardarCambiosDetalleRetencion;
	}
	
	public Boolean getIsPermisoConsultaDetalleRetencion() {
		return isPermisoConsultaDetalleRetencion;
	}

	public void setIsPermisoConsultaDetalleRetencion(Boolean isPermisoConsultaDetalleRetencion) {
		this.isPermisoConsultaDetalleRetencion = isPermisoConsultaDetalleRetencion;
	}

	public Boolean getIsPermisoBusquedaDetalleRetencion() {
		return isPermisoBusquedaDetalleRetencion;
	}

	public void setIsPermisoBusquedaDetalleRetencion(Boolean isPermisoBusquedaDetalleRetencion) {
		this.isPermisoBusquedaDetalleRetencion = isPermisoBusquedaDetalleRetencion;
	}

	public Boolean getIsPermisoReporteDetalleRetencion() {
		return isPermisoReporteDetalleRetencion;
	}

	public void setIsPermisoReporteDetalleRetencion(Boolean isPermisoReporteDetalleRetencion) {
		this.isPermisoReporteDetalleRetencion = isPermisoReporteDetalleRetencion;
	}
	
	public Boolean getIsPermisoPaginacionMedioDetalleRetencion() {
		return isPermisoPaginacionMedioDetalleRetencion;
	}

	public void setIsPermisoPaginacionMedioDetalleRetencion(Boolean isPermisoPaginacionMedioDetalleRetencion) {
		this.isPermisoPaginacionMedioDetalleRetencion = isPermisoPaginacionMedioDetalleRetencion;
	}
	
	public Boolean getIsPermisoPaginacionTodoDetalleRetencion() {
		return isPermisoPaginacionTodoDetalleRetencion;
	}

	public void setIsPermisoPaginacionTodoDetalleRetencion(Boolean isPermisoPaginacionTodoDetalleRetencion) {
		this.isPermisoPaginacionTodoDetalleRetencion = isPermisoPaginacionTodoDetalleRetencion;
	}
	
	public Boolean getIsPermisoPaginacionAltoDetalleRetencion() {
		return isPermisoPaginacionAltoDetalleRetencion;
	}

	public void setIsPermisoPaginacionAltoDetalleRetencion(Boolean isPermisoPaginacionAltoDetalleRetencion) {
		this.isPermisoPaginacionAltoDetalleRetencion = isPermisoPaginacionAltoDetalleRetencion;
	}
	
	public Boolean getIsPermisoCopiarDetalleRetencion() {
		return isPermisoCopiarDetalleRetencion;
	}

	public void setIsPermisoCopiarDetalleRetencion(Boolean isPermisoCopiarDetalleRetencion) {
		this.isPermisoCopiarDetalleRetencion = isPermisoCopiarDetalleRetencion;
	}
	
	public Boolean getIsPermisoVerFormDetalleRetencion() {
		return isPermisoVerFormDetalleRetencion;
	}

	public void setIsPermisoVerFormDetalleRetencion(Boolean isPermisoVerFormDetalleRetencion) {
		this.isPermisoVerFormDetalleRetencion = isPermisoVerFormDetalleRetencion;
	}
	
	public Boolean getIsPermisoDuplicarDetalleRetencion() {
		return isPermisoDuplicarDetalleRetencion;
	}

	public void setIsPermisoDuplicarDetalleRetencion(Boolean isPermisoDuplicarDetalleRetencion) {
		this.isPermisoDuplicarDetalleRetencion = isPermisoDuplicarDetalleRetencion;
	}
	
	public Boolean getIsPermisoOrdenDetalleRetencion() {
		return isPermisoOrdenDetalleRetencion;
	}

	public void setIsPermisoOrdenDetalleRetencion(Boolean isPermisoOrdenDetalleRetencion) {
		this.isPermisoOrdenDetalleRetencion = isPermisoOrdenDetalleRetencion;
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
	
	public Boolean getIsVisibilidadCeldaNuevoDetalleRetencion() {
		return isVisibilidadCeldaNuevoDetalleRetencion;
	}

	public void setIsVisibilidadCeldaNuevoDetalleRetencion(Boolean isVisibilidadCeldaNuevoDetalleRetencion) {
		this.isVisibilidadCeldaNuevoDetalleRetencion = isVisibilidadCeldaNuevoDetalleRetencion;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarDetalleRetencion() {
		return isVisibilidadCeldaDuplicarDetalleRetencion;
	}

	public void setIsVisibilidadCeldaDuplicarDetalleRetencion(Boolean isVisibilidadCeldaDuplicarDetalleRetencion) {
		this.isVisibilidadCeldaDuplicarDetalleRetencion = isVisibilidadCeldaDuplicarDetalleRetencion;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarDetalleRetencion() {
		return isVisibilidadCeldaCopiarDetalleRetencion;
	}

	public void setIsVisibilidadCeldaCopiarDetalleRetencion(Boolean isVisibilidadCeldaCopiarDetalleRetencion) {
		this.isVisibilidadCeldaCopiarDetalleRetencion = isVisibilidadCeldaCopiarDetalleRetencion;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormDetalleRetencion() {
		return isVisibilidadCeldaVerFormDetalleRetencion;
	}

	public void setIsVisibilidadCeldaVerFormDetalleRetencion(Boolean isVisibilidadCeldaVerFormDetalleRetencion) {
		this.isVisibilidadCeldaVerFormDetalleRetencion = isVisibilidadCeldaVerFormDetalleRetencion;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenDetalleRetencion() {
		return isVisibilidadCeldaOrdenDetalleRetencion;
	}

	public void setIsVisibilidadCeldaOrdenDetalleRetencion(Boolean isVisibilidadCeldaOrdenDetalleRetencion) {
		this.isVisibilidadCeldaOrdenDetalleRetencion = isVisibilidadCeldaOrdenDetalleRetencion;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesDetalleRetencion() {
		return isVisibilidadCeldaNuevoRelacionesDetalleRetencion;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesDetalleRetencion(Boolean isVisibilidadCeldaNuevoRelacionesDetalleRetencion) {
		this.isVisibilidadCeldaNuevoRelacionesDetalleRetencion = isVisibilidadCeldaNuevoRelacionesDetalleRetencion;
	}
	
	public Boolean getIsVisibilidadCeldaModificarDetalleRetencion() {
		return isVisibilidadCeldaModificarDetalleRetencion;
	}

	public void setIsVisibilidadCeldaModificarDetalleRetencion(Boolean isVisibilidadCeldaModificarDetalleRetencion) {
		this.isVisibilidadCeldaModificarDetalleRetencion = isVisibilidadCeldaModificarDetalleRetencion;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarDetalleRetencion() {
		return isVisibilidadCeldaActualizarDetalleRetencion;
	}

	public void setIsVisibilidadCeldaActualizarDetalleRetencion(Boolean isVisibilidadCeldaActualizarDetalleRetencion) {
		this.isVisibilidadCeldaActualizarDetalleRetencion = isVisibilidadCeldaActualizarDetalleRetencion;
	}

	public Boolean getIsVisibilidadCeldaEliminarDetalleRetencion() {
		return isVisibilidadCeldaEliminarDetalleRetencion;
	}

	public void setIsVisibilidadCeldaEliminarDetalleRetencion(Boolean isVisibilidadCeldaEliminarDetalleRetencion) {
		this.isVisibilidadCeldaEliminarDetalleRetencion = isVisibilidadCeldaEliminarDetalleRetencion;
	}

	public Boolean getIsVisibilidadCeldaCancelarDetalleRetencion() {
		return isVisibilidadCeldaCancelarDetalleRetencion;
	}

	public void setIsVisibilidadCeldaCancelarDetalleRetencion(Boolean isVisibilidadCeldaCancelarDetalleRetencion) {
		this.isVisibilidadCeldaCancelarDetalleRetencion = isVisibilidadCeldaCancelarDetalleRetencion;
	}

	public Boolean getIsVisibilidadCeldaGuardarDetalleRetencion() {
		return isVisibilidadCeldaGuardarDetalleRetencion;
	}

	public void setIsVisibilidadCeldaGuardarDetalleRetencion(Boolean isVisibilidadCeldaGuardarDetalleRetencion) {
		this.isVisibilidadCeldaGuardarDetalleRetencion = isVisibilidadCeldaGuardarDetalleRetencion;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosDetalleRetencion() {
		return isVisibilidadCeldaGuardarCambiosDetalleRetencion;
	}

	public void setIsVisibilidadCeldaGuardarCambiosDetalleRetencion(Boolean isVisibilidadCeldaGuardarCambiosDetalleRetencion) {
		this.isVisibilidadCeldaGuardarCambiosDetalleRetencion = isVisibilidadCeldaGuardarCambiosDetalleRetencion;
	}
		
	public DetalleRetencionSessionBean getdetalleretencionSessionBean() {
		return this.detalleretencionSessionBean;
	}
	
	public void setdetalleretencionSessionBean(DetalleRetencionSessionBean detalleretencionSessionBean) {
		this.detalleretencionSessionBean=detalleretencionSessionBean;
	}
	
	
	public Boolean getisVisibilidadFK_IdCuentaContable() {
		return this.isVisibilidadFK_IdCuentaContable;
	}

	public void setisVisibilidadFK_IdCuentaContable(Boolean isVisibilidadFK_IdCuentaContable) {
		this.isVisibilidadFK_IdCuentaContable=isVisibilidadFK_IdCuentaContable;
	}

	public Boolean getisVisibilidadFK_IdCuentaContableCredito() {
		return this.isVisibilidadFK_IdCuentaContableCredito;
	}

	public void setisVisibilidadFK_IdCuentaContableCredito(Boolean isVisibilidadFK_IdCuentaContableCredito) {
		this.isVisibilidadFK_IdCuentaContableCredito=isVisibilidadFK_IdCuentaContableCredito;
	}

	public Boolean getisVisibilidadFK_IdDetalleRetencion() {
		return this.isVisibilidadFK_IdDetalleRetencion;
	}

	public void setisVisibilidadFK_IdDetalleRetencion(Boolean isVisibilidadFK_IdDetalleRetencion) {
		this.isVisibilidadFK_IdDetalleRetencion=isVisibilidadFK_IdDetalleRetencion;
	}

	public Boolean getisVisibilidadFK_IdEmpresa() {
		return this.isVisibilidadFK_IdEmpresa;
	}

	public void setisVisibilidadFK_IdEmpresa(Boolean isVisibilidadFK_IdEmpresa) {
		this.isVisibilidadFK_IdEmpresa=isVisibilidadFK_IdEmpresa;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysDetalleRetencion(DetalleRetencion detalleretencion)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(detalleretencion,null);
				this.setActualParaGuardarEmpresaDestinoForeignKey(detalleretencion,null);
				this.setActualParaGuardarCuentaContableForeignKey(detalleretencion,null);
				this.setActualParaGuardarCuentaContableCreditoForeignKey(detalleretencion,null);
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
	
	public void bugActualizarReferenciaActual(DetalleRetencion detalleretencion,DetalleRetencion detalleretencionAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalDetalleRetencion(detalleretencion);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		detalleretencionAux.setId(detalleretencion.getId());
		detalleretencionAux.setVersionRow(detalleretencion.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessDetalleRetencion();
		
			int intSelectedRow = this.jTableDatosDetalleRetencion.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleretencion =(DetalleRetencion) this.detalleretencionLogic.getDetalleRetencions().toArray()[this.jTableDatosDetalleRetencion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.detalleretencion =(DetalleRetencion) this.detalleretencions.toArray()[this.jTableDatosDetalleRetencion.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(DetalleRetencionJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualDetalleRetencion(this.detalleretencion,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysDetalleRetencion(this.detalleretencion);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = detalleretencionValidator.getInvalidValues(this.detalleretencion);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			detalleretencionLogic.setDatosCliente(datosCliente);
			detalleretencionLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				detalleretencionAux=new  DetalleRetencion();
				
				detalleretencionAux.setIsNew(true);
				detalleretencionAux.setIsChanged(true);
				
				detalleretencionAux.setDetalleRetencionOriginal(this.detalleretencion);
				
				detalleretencionAux.setId(this.detalleretencion.getId());	
				detalleretencionAux.setVersionRow(this.detalleretencion.getVersionRow());	
				detalleretencionAux.setid_empresa(this.detalleretencion.getid_empresa());	
				detalleretencionAux.setid_empresa_destino(this.detalleretencion.getid_empresa_destino());	
				detalleretencionAux.setid_cuenta_contable(this.detalleretencion.getid_cuenta_contable());	
				detalleretencionAux.setid_cuenta_contable_credito(this.detalleretencion.getid_cuenta_contable_credito());	
				detalleretencionAux.setdescripcion(this.detalleretencion.getdescripcion());	
				detalleretencionAux.setporcentaje(this.detalleretencion.getporcentaje());	
				detalleretencionAux.setmonto_minimo(this.detalleretencion.getmonto_minimo());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.detalleretencionSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.detalleretencionSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(detalleretencionAux,detalleretencionLogic.getDetalleRetencions());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(detalleretencionAux,detalleretencions);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.detalleretencionSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.detalleretencionSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						detalleretencionLogic.saveDetalleRetencions();//WithConnection
						//detalleretencionLogic.getSetVersionRowDetalleRetencions();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.detalleretencion,detalleretencionAux);
					
					this.refrescarForeignKeysDescripcionesDetalleRetencion();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.detalleretencionSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE	
						
						if(!this.detalleretencionSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								detalleretencionLogic.saveDetalleRetencionRelaciones(detalleretencionAux);//WithConnection
								//detalleretencionLogic.getSetVersionRowDetalleRetencions();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.detalleretencion,detalleretencionAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE	
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.detalleretencionSessionBean.getEstaModoGuardarRelaciones() 
									|| this.detalleretencionSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(detalleretencionAux,detalleretencionLogic.getDetalleRetencions());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(detalleretencionAux,detalleretencions);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.detalleretencion,detalleretencionAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				detalleretencionAux=new  DetalleRetencion();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.detalleretencionSessionBean.getEsGuardarRelacionado() 
					|| (this.detalleretencionSessionBean.getEsGuardarRelacionado() && this.detalleretencion.getId()>=0)) {
						
					detalleretencionAux.setIsNew(false);
				}
				
				detalleretencionAux.setIsDeleted(false);
			
				detalleretencionAux.setId(this.detalleretencion.getId());	
				detalleretencionAux.setVersionRow(this.detalleretencion.getVersionRow());	
				detalleretencionAux.setid_empresa(this.detalleretencion.getid_empresa());	
				detalleretencionAux.setid_empresa_destino(this.detalleretencion.getid_empresa_destino());	
				detalleretencionAux.setid_cuenta_contable(this.detalleretencion.getid_cuenta_contable());	
				detalleretencionAux.setid_cuenta_contable_credito(this.detalleretencion.getid_cuenta_contable_credito());	
				detalleretencionAux.setdescripcion(this.detalleretencion.getdescripcion());	
				detalleretencionAux.setporcentaje(this.detalleretencion.getporcentaje());	
				detalleretencionAux.setmonto_minimo(this.detalleretencion.getmonto_minimo());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(detalleretencionAux,detalleretencionLogic.getDetalleRetencions());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(detalleretencionAux,detalleretencions);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.detalleretencionSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.detalleretencionSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						detalleretencionLogic.saveDetalleRetencions();//WithConnection
						//detalleretencionLogic.getSetVersionRowDetalleRetencions();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.detalleretencion,detalleretencionAux);
					
					this.refrescarForeignKeysDescripcionesDetalleRetencion();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.detalleretencionSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						if(!this.detalleretencionSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								detalleretencionLogic.saveDetalleRetencionRelaciones(detalleretencionAux);//WithConnection
								//detalleretencionLogic.getSetVersionRowDetalleRetencions();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.detalleretencion,detalleretencionAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.detalleretencionSessionBean.getEstaModoGuardarRelaciones() 
									|| this.detalleretencionSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(detalleretencionAux,detalleretencionLogic.getDetalleRetencions());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(detalleretencionAux,detalleretencions);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.detalleretencion,detalleretencionAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				detalleretencionAux=new  DetalleRetencion();
				
				detalleretencionAux.setIsNew(false);
				detalleretencionAux.setIsChanged(false);
				
				detalleretencionAux.setIsDeleted(true);
				
				detalleretencionAux.setId(this.detalleretencion.getId());	
				detalleretencionAux.setVersionRow(this.detalleretencion.getVersionRow());	
				detalleretencionAux.setid_empresa(this.detalleretencion.getid_empresa());	
				detalleretencionAux.setid_empresa_destino(this.detalleretencion.getid_empresa_destino());	
				detalleretencionAux.setid_cuenta_contable(this.detalleretencion.getid_cuenta_contable());	
				detalleretencionAux.setid_cuenta_contable_credito(this.detalleretencion.getid_cuenta_contable_credito());	
				detalleretencionAux.setdescripcion(this.detalleretencion.getdescripcion());	
				detalleretencionAux.setporcentaje(this.detalleretencion.getporcentaje());	
				detalleretencionAux.setmonto_minimo(this.detalleretencion.getmonto_minimo());	
				
				if(this.detalleretencionSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.detalleretencionAux.getId()>=0) {	
						this.detalleretencionsEliminados.add(detalleretencionAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(detalleretencionAux,detalleretencionLogic.getDetalleRetencions());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(detalleretencionAux,detalleretencions);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.detalleretencionSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.detalleretencionSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						detalleretencionLogic.saveDetalleRetencions();//WithConnection
						//detalleretencionLogic.getSetVersionRowDetalleRetencions();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.detalleretencionSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						
						if(!this.detalleretencionSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								detalleretencionLogic.saveDetalleRetencionRelaciones(detalleretencionAux);//WithConnection
								//detalleretencionLogic.getSetVersionRowDetalleRetencions();//WithConnection
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
							if(this.detalleretencionSessionBean.getEstaModoGuardarRelaciones() 
								|| this.detalleretencionSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(detalleretencionAux,detalleretencionLogic.getDetalleRetencions());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(detalleretencionAux,detalleretencions);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleretencionLogic.getDetalleRetencions().addAll(this.detalleretencionsEliminados);
					
					detalleretencionLogic.saveDetalleRetencions();//WithConnection
					//detalleretencionLogic.getSetVersionRowDetalleRetencions();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesDetalleRetencion();
				
				this.detalleretencionsEliminados= new ArrayList<DetalleRetencion>();		
			}
			
			if(this.detalleretencionSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.detalleretencionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Detalle Retencion GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Detalle Retencion",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.detalleretencion=detalleretencionAux;
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
      		//this.finishProcessDetalleRetencion();
      	}
		
	}	
	
	public void actualizarRelaciones(DetalleRetencion detalleretencionLocal) throws Exception {
		
		if(this.detalleretencionSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(DetalleRetencion detalleretencionLocal) throws Exception {	
		if(this.detalleretencionSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				detalleretencionLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresadestinoBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresadestinoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresadestinoBeanSwingJInternalFrameLocal.getempresa(),true);
				empresadestinoBeanSwingJInternalFrameLocal.actualizarLista(empresadestinoBeanSwingJInternalFrameLocal.empresa,this.empresadestinosForeignKey);

				empresadestinoBeanSwingJInternalFrameLocal.actualizarRelaciones(empresadestinoBeanSwingJInternalFrameLocal.empresa);

				detalleretencionLocal.setEmpresaDestino(empresadestinoBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresaDestino();
				this.cargarCombosFrameEmpresaDestinosForeignKey("Formulario");
				this.setActualEmpresaDestinoForeignKey(empresadestinoBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(CuentaContableDetalleFormJInternalFrame.class)) {
				CuentaContableBeanSwingJInternalFrame cuentacontableBeanSwingJInternalFrameLocal=(CuentaContableBeanSwingJInternalFrame) ((CuentaContableDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				cuentacontableBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoCuentaContable(cuentacontableBeanSwingJInternalFrameLocal.getcuentacontable(),true);
				cuentacontableBeanSwingJInternalFrameLocal.actualizarLista(cuentacontableBeanSwingJInternalFrameLocal.cuentacontable,this.cuentacontablesForeignKey);

				cuentacontableBeanSwingJInternalFrameLocal.actualizarRelaciones(cuentacontableBeanSwingJInternalFrameLocal.cuentacontable);

				detalleretencionLocal.setCuentaContable(cuentacontableBeanSwingJInternalFrameLocal.cuentacontable);

				this.addItemDefectoCombosForeignKeyCuentaContable();
				this.cargarCombosFrameCuentaContablesForeignKey("Formulario");
				this.setActualCuentaContableForeignKey(cuentacontableBeanSwingJInternalFrameLocal.cuentacontable.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(CuentaContableDetalleFormJInternalFrame.class)) {
				CuentaContableBeanSwingJInternalFrame cuentacontablecreditoBeanSwingJInternalFrameLocal=(CuentaContableBeanSwingJInternalFrame) ((CuentaContableDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				cuentacontablecreditoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoCuentaContable(cuentacontablecreditoBeanSwingJInternalFrameLocal.getcuentacontable(),true);
				cuentacontablecreditoBeanSwingJInternalFrameLocal.actualizarLista(cuentacontablecreditoBeanSwingJInternalFrameLocal.cuentacontable,this.cuentacontablecreditosForeignKey);

				cuentacontablecreditoBeanSwingJInternalFrameLocal.actualizarRelaciones(cuentacontablecreditoBeanSwingJInternalFrameLocal.cuentacontable);

				detalleretencionLocal.setCuentaContableCredito(cuentacontablecreditoBeanSwingJInternalFrameLocal.cuentacontable);

				this.addItemDefectoCombosForeignKeyCuentaContableCredito();
				this.cargarCombosFrameCuentaContableCreditosForeignKey("Formulario");
				this.setActualCuentaContableCreditoForeignKey(cuentacontablecreditoBeanSwingJInternalFrameLocal.cuentacontable.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarDetalleRetencionActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosDetalleRetencion.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.detalleretencion =(DetalleRetencion) this.detalleretencionLogic.getDetalleRetencions().toArray()[this.jTableDatosDetalleRetencion.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.detalleretencion =(DetalleRetencion) this.detalleretencions.toArray()[this.jTableDatosDetalleRetencion.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = detalleretencionValidator.getInvalidValues(this.detalleretencion);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(DetalleRetencion detalleretencion,List<DetalleRetencion> detalleretencions) throws Exception {
		try	{		
			DetalleRetencionConstantesFunciones.actualizarLista(detalleretencion,detalleretencions,this.detalleretencionSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(DetalleRetencion detalleretencion,List<DetalleRetencion> detalleretencions) throws Exception {
		try	{			
			DetalleRetencionConstantesFunciones.actualizarSelectedLista(detalleretencion,detalleretencions);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<DetalleRetencion> detalleretencionsLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				detalleretencionsLocal=this.detalleretencionLogic.getDetalleRetencions();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				detalleretencionsLocal=this.detalleretencions;
			}
			//ARCHITECTURE
		
			for(DetalleRetencion detalleretencionLocal:detalleretencionsLocal) {
				if(this.permiteMantenimiento(detalleretencionLocal) && detalleretencionLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+DetalleRetencionConstantesFunciones.getDetalleRetencionLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(DetalleRetencionConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetalleRetencion.jLabelid_empresaDetalleRetencion,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DetalleRetencionConstantesFunciones.IDEMPRESADESTINO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetalleRetencion.jLabelid_empresa_destinoDetalleRetencion,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DetalleRetencionConstantesFunciones.IDCUENTACONTABLE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetalleRetencion.jLabelid_cuenta_contableDetalleRetencion,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DetalleRetencionConstantesFunciones.IDCUENTACONTABLECREDITO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetalleRetencion.jLabelid_cuenta_contable_creditoDetalleRetencion,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DetalleRetencionConstantesFunciones.DESCRIPCION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetalleRetencion.jLabeldescripcionDetalleRetencion,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DetalleRetencionConstantesFunciones.PORCENTAJE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetalleRetencion.jLabelporcentajeDetalleRetencion,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DetalleRetencionConstantesFunciones.MONTOMINIMO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetalleRetencion.jLabelmonto_minimoDetalleRetencion,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormDetalleRetencion!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDetalleRetencion.jLabelid_empresaDetalleRetencion,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDetalleRetencion.jLabelid_empresa_destinoDetalleRetencion,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDetalleRetencion.jLabelid_cuenta_contableDetalleRetencion,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDetalleRetencion.jLabelid_cuenta_contable_creditoDetalleRetencion,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDetalleRetencion.jLabeldescripcionDetalleRetencion,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDetalleRetencion.jLabelporcentajeDetalleRetencion,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDetalleRetencion.jLabelmonto_minimoDetalleRetencion,"");
		
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
		this.iIdNuevoDetalleRetencion--;	
		
		
		this.detalleretencionAux=new DetalleRetencion();
		
		this.detalleretencionAux.setId(this.iIdNuevoDetalleRetencion);
		this.detalleretencionAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.detalleretencionLogic.getDetalleRetencions().add(this.detalleretencionAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.detalleretencions.add(this.detalleretencionAux);
		}
		//ARCHITECTURE
		
		this.detalleretencion=this.detalleretencionAux;
		
		if(DetalleRetencionJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioDetalleRetencion(this.detalleretencion);
			this.setVariablesObjetoActualToFormularioForeignKeyDetalleRetencion(this.detalleretencion);
		}
				
		//this.setDefaultControlesDetalleRetencion();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyDetalleRetencion();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyDetalleRetencion();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyDetalleRetencion();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualDetalleRetencion(this.detalleretencionBean,this.detalleretencion,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysDetalleRetencion(this.detalleretencion);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(DetalleRetencionConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.detalleretencionSessionBean.getConGuardarRelaciones()) {
			classes=DetalleRetencionConstantesFunciones.getClassesRelationshipsOfDetalleRetencion(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.detalleretencionReturnGeneral=detalleretencionLogic.procesarEventosDetalleRetencionsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.detalleretencionLogic.getDetalleRetencions(),this.detalleretencion,this.detalleretencionParameterGeneral,this.isEsNuevoDetalleRetencion,classes);//this.detalleretencionLogic.getDetalleRetencion()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanDetalleRetencion(this.detalleretencionReturnGeneral,this.detalleretencionBean,false);
		
		if(this.detalleretencionReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyDetalleRetencion(this.detalleretencionReturnGeneral.getDetalleRetencion());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioDetalleRetencion(this.detalleretencionReturnGeneral.getDetalleRetencion());
		}
		
		if(this.detalleretencionReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioDetalleRetencion(this.detalleretencionReturnGeneral.getDetalleRetencion(),classes);//this.detalleretencionBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualDetalleRetencion(this.detalleretencion,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyDetalleRetencion();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyDetalleRetencion();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			DetalleRetencionBeanSwingJInternalFrameAdditional.RecargarFormDetalleRetencion(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingDetalleRetencion(false);
						
			if(detalleretencionSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(DetalleRetencionJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualDetalleRetencion();
			}
			
			this.actualizarVisualTableDatosDetalleRetencion();
			
			this.jTableDatosDetalleRetencion.setRowSelectionInterval(this.getIndiceNuevoDetalleRetencion(), this.getIndiceNuevoDetalleRetencion());
			
			this.seleccionarFilaTablaDetalleRetencionActual();
						
			this.actualizarEstadoCeldasBotonesDetalleRetencion("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesDetalleRetencion(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormDetalleRetencion.jTextAreadescripcionDetalleRetencion.setEnabled(isHabilitar && this.detalleretencionConstantesFunciones.activardescripcionDetalleRetencion);
		this.jInternalFrameDetalleFormDetalleRetencion.jTextFieldporcentajeDetalleRetencion.setEnabled(isHabilitar && this.detalleretencionConstantesFunciones.activarporcentajeDetalleRetencion);
		this.jInternalFrameDetalleFormDetalleRetencion.jTextFieldmonto_minimoDetalleRetencion.setEnabled(isHabilitar && this.detalleretencionConstantesFunciones.activarmonto_minimoDetalleRetencion);	
		//
		this.jInternalFrameDetalleFormDetalleRetencion.jComboBoxid_empresaDetalleRetencion.setEnabled(isHabilitar && this.detalleretencionConstantesFunciones.activarid_empresaDetalleRetencion);
		this.jInternalFrameDetalleFormDetalleRetencion.jComboBoxid_empresa_destinoDetalleRetencion.setEnabled(isHabilitar && this.detalleretencionConstantesFunciones.activarid_empresa_destinoDetalleRetencion);
		this.jInternalFrameDetalleFormDetalleRetencion.jComboBoxid_cuenta_contableDetalleRetencion.setEnabled(isHabilitar && this.detalleretencionConstantesFunciones.activarid_cuenta_contableDetalleRetencion);
		this.jInternalFrameDetalleFormDetalleRetencion.jComboBoxid_cuenta_contable_creditoDetalleRetencion.setEnabled(isHabilitar && this.detalleretencionConstantesFunciones.activarid_cuenta_contable_creditoDetalleRetencion);
	};
	
	public void setDefaultControlesDetalleRetencion() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoDetalleRetencion(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.detalleretencionSessionBean.setConGuardarRelaciones(true);			
			this.detalleretencionSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormDetalleRetencion.jTabbedPaneRelacionesDetalleRetencion.setVisible(true);
			
					
		} else {
			//this.detalleretencionSessionBean.setConGuardarRelaciones(false);			
			this.detalleretencionSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormDetalleRetencion.jTabbedPaneRelacionesDetalleRetencion.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoDetalleRetencion() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(DetalleRetencion detalleretencionAux:this.detalleretencionLogic.getDetalleRetencions()) {
				if(detalleretencionAux.getId().equals(this.iIdNuevoDetalleRetencion)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(DetalleRetencion detalleretencionAux:this.detalleretencions) {
				if(detalleretencionAux.getId().equals(this.iIdNuevoDetalleRetencion)) {
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
	
	public int getIndiceActualDetalleRetencion(DetalleRetencion detalleretencion,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(DetalleRetencion detalleretencionAux:this.detalleretencionLogic.getDetalleRetencions()) {
				if(detalleretencionAux.getId().equals(detalleretencion.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(DetalleRetencion detalleretencionAux:this.detalleretencions) {
				if(detalleretencionAux.getId().equals(detalleretencion.getId())) {
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
	
	public void setCamposBaseDesdeOriginalDetalleRetencion(DetalleRetencion detalleretencionOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(DetalleRetencion detalleretencionAux:this.detalleretencionLogic.getDetalleRetencions()) {
				if(detalleretencionAux.getDetalleRetencionOriginal().getId().equals(detalleretencionOriginal.getId())) {
					existe=true;
					detalleretencionOriginal.setId(detalleretencionAux.getId());
					detalleretencionOriginal.setVersionRow(detalleretencionAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(DetalleRetencion detalleretencionAux:this.detalleretencions) {
				if(detalleretencionAux.getDetalleRetencionOriginal().getId().equals(detalleretencionOriginal.getId())) {
					existe=true;
					detalleretencionOriginal.setId(detalleretencionAux.getId());
					detalleretencionOriginal.setVersionRow(detalleretencionAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosDetalleRetencion(Boolean esParaCancelar) throws Exception {
		detalleretencionsAux=new ArrayList<DetalleRetencion>();
		detalleretencionAux=new DetalleRetencion();
		
		if(!this.detalleretencionSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(DetalleRetencion detalleretencionAux:this.detalleretencionLogic.getDetalleRetencions()) {
					if(detalleretencionAux.getId()<0) {
						detalleretencionsAux.add(detalleretencionAux);
					}		
				}
				this.iIdNuevoDetalleRetencion=0L;
				this.detalleretencionLogic.getDetalleRetencions().removeAll(detalleretencionsAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(DetalleRetencion detalleretencionAux:this.detalleretencions) {
					if(detalleretencionAux.getId()<0) {
						detalleretencionsAux.add(detalleretencionAux);
					}		
				}
				this.iIdNuevoDetalleRetencion=0L;
				this.detalleretencions.removeAll(detalleretencionsAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoDetalleRetencion 
					&& this.detalleretencionLogic.getDetalleRetencions().size()>0
					) {
					detalleretencionAux=this.detalleretencionLogic.getDetalleRetencions().get(this.detalleretencionLogic.getDetalleRetencions().size() - 1);
				
					if(detalleretencionAux.getId()<0) {
						this.detalleretencionLogic.getDetalleRetencions().remove(detalleretencionAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoDetalleRetencion && this.detalleretencions.size()>0) {
					detalleretencionAux=this.detalleretencions.get(this.detalleretencions.size() - 1);
				
					if(detalleretencionAux.getId()<0) {
						this.detalleretencions.remove(detalleretencionAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoDetalleRetencion(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(detalleretencion.getId()<0) {
				this.detalleretencionLogic.getDetalleRetencions().remove(this.detalleretencion);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(detalleretencion.getId()<0) {
				this.detalleretencions.remove(this.detalleretencion);
			}
		}			
	}
	
	public void setEstadosInicialesDetalleRetencion(List<DetalleRetencion> detalleretencionsAux) throws Exception {
		DetalleRetencionConstantesFunciones.setEstadosInicialesDetalleRetencion(detalleretencionsAux);
	}
	
	public void setEstadosInicialesDetalleRetencion(DetalleRetencion detalleretencionAux) throws Exception {
		DetalleRetencionConstantesFunciones.setEstadosInicialesDetalleRetencion(detalleretencionAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarDetalleRetencionActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesDetalleRetencion("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,DetalleRetencionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarDetalleRetencionActual()) {
				if(!this.isEsNuevoDetalleRetencion) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesDetalleRetencion("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoDetalleRetencion=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,DetalleRetencionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarDetalleRetencionActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Detalle Retencion ?", "MANTENIMIENTO DE Detalle Retencion", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesDetalleRetencion("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,DetalleRetencionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleRetencionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(DetalleRetencion detalleretencion) throws Exception {
		DetalleRetencionConstantesFunciones.seleccionarAsignar(this.detalleretencion,detalleretencion);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarDetalleRetencion=this.isPermisoActualizarOriginalDetalleRetencion;
			
			
			this.seleccionarAsignar(detalleretencion);
			
			

			idCuentaContableActual=detalleretencion.getid_cuenta_contable();
			this.seleccionarCuentaContableActual();

			idCuentaContableCreditoActual=detalleretencion.getid_cuenta_contable_credito();
			this.seleccionarCuentaContableCreditoActual();
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			DetalleRetencionConstantesFunciones.quitarEspaciosDetalleRetencion(this.detalleretencion,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesDetalleRetencion("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleRetencionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.detalleretencionSessionBean.setsFuncionBusquedaRapida(this.detalleretencionSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleRetencionConstantesFunciones.CLASSNAME);
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
	public void seleccionarCuentaContableCreditoActual() throws Exception {
		try	{
			CuentaContable cuentacontablecreditoAux=new CuentaContable();

			if(this.idCuentaContableCreditoActual != null && this.idCuentaContableCreditoActual>0) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					cuentacontablecreditoLogic.getEntityWithConnection(this.idCuentaContableCreditoActual);
					cuentacontablecreditoAux= cuentacontablecreditoLogic.getCuentaContable();
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE

				cuentacontablecreditosForeignKey=new ArrayList<CuentaContable>();
				cuentacontablecreditosForeignKey.add(cuentacontablecreditoAux);
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
			if(this.isEsNuevoDetalleRetencion) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosDetalleRetencion(esParaCancelar);				
				this.cancelarNuevoDetalleRetencion(esParaCancelar);								
			}
			
			this.detalleretencion=new DetalleRetencion();
			
			this.inicializarDetalleRetencion();
			
			this.actualizarEstadoCeldasBotonesDetalleRetencion("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleRetencionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarDetalleRetencion() throws Exception {
		try {
			DetalleRetencionConstantesFunciones.inicializarDetalleRetencion(this.detalleretencion);
			
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
			FuncionesSwing.manageException(this, e,logger,DetalleRetencionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.detalleretencionLogic.getDetalleRetencions().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleRetencionConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteDetalleRetencions(String sAccionBusqueda,List<DetalleRetencion> detalleretencionsParaReportes) throws Exception {
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
					sPathReporteFinal="DetalleRetencion"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="DetalleRetencionMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("DetalleRetencionMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="DetalleRetencion"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Detalle Retenciones");		
		parameters.put("busquedapor", DetalleRetencionConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceDetalleRetencion=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			DetalleRetencionConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			DetalleRetencionConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceDetalleRetencion=new JRBeanArrayDataSource(DetalleRetencionJInternalFrame.TraerDetalleRetencionBeans(detalleretencionsParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceDetalleRetencion);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+DetalleRetencionConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+DetalleRetencionConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(DetalleRetencionBean.TraerDetalleRetencionBeans(detalleretencionsParaReportes).toArray()));
							
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
				this.generarExcelReporteDetalleRetencions(sAccionBusqueda,sTipoArchivoReporte,detalleretencionsParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalDetalleRetencions(sAccionBusqueda,sTipoArchivoReporte,detalleretencionsParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoDetalleRetencionActionPerformed(null);
					//this.generarExcelReporteDetalleRetencions(sAccionBusqueda,sTipoArchivoReporte,detalleretencionsParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalDetalleRetencions(sAccionBusqueda,sTipoArchivoReporte,detalleretencionsParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesDetalleRetencions(sAccionBusqueda,sTipoArchivoReporte,detalleretencionsParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesDetalleRetencions(sAccionBusqueda,sTipoArchivoReporte,detalleretencionsParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteDetalleRetencions(String sAccionBusqueda,String sTipoArchivoReporte,List<DetalleRetencion> detalleretencionsParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"detalleretencion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("DetalleRetencions");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderDetalleRetencion("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(DetalleRetencion detalleretencion : detalleretencionsParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			DetalleRetencionConstantesFunciones.generarExcelReporteDataDetalleRetencion("NORMAL",row,workbook,detalleretencion,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.detalleretencionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Detalle Retencion",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderDetalleRetencion(String sTipo,Row row,Workbook workbook) {
		
		DetalleRetencionConstantesFunciones.generarExcelReporteHeaderDetalleRetencion(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalDetalleRetencions(String sAccionBusqueda,String sTipoArchivoReporte,List<DetalleRetencion> detalleretencionsParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"detalleretencion_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("DetalleRetencions");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(DetalleRetencion detalleretencion : detalleretencionsParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(DetalleRetencionConstantesFunciones.getDetalleRetencionDescripcion(detalleretencion));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DetalleRetencionConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DetalleRetencionConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(detalleretencion.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DetalleRetencionConstantesFunciones.LABEL_IDEMPRESADESTINO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DetalleRetencionConstantesFunciones.LABEL_IDEMPRESADESTINO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(detalleretencion.getempresadestino_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DetalleRetencionConstantesFunciones.LABEL_IDCUENTACONTABLE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DetalleRetencionConstantesFunciones.LABEL_IDCUENTACONTABLE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(detalleretencion.getcuentacontable_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DetalleRetencionConstantesFunciones.LABEL_IDCUENTACONTABLECREDITO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DetalleRetencionConstantesFunciones.LABEL_IDCUENTACONTABLECREDITO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(detalleretencion.getcuentacontablecredito_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DetalleRetencionConstantesFunciones.LABEL_DESCRIPCION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DetalleRetencionConstantesFunciones.LABEL_DESCRIPCION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(detalleretencion.getdescripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DetalleRetencionConstantesFunciones.LABEL_PORCENTAJE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DetalleRetencionConstantesFunciones.LABEL_PORCENTAJE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(detalleretencion.getporcentaje());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DetalleRetencionConstantesFunciones.LABEL_MONTOMINIMO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DetalleRetencionConstantesFunciones.LABEL_MONTOMINIMO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(detalleretencion.getmonto_minimo());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.detalleretencionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Detalle Retencion",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesDetalleRetencions(String sAccionBusqueda,String sTipoArchivoReporte,List<DetalleRetencion> detalleretencionsParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<DetalleRetencion> detalleretencionsRespaldo=null;
		
		classes=DetalleRetencionConstantesFunciones.getClassesRelationshipsOfDetalleRetencion(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.detalleretencionLogic.setDatosCliente(this.datosCliente);
		this.detalleretencionLogic.setDatosDeep(this.datosDeep);
		this.detalleretencionLogic.setIsConDeep(true);
		
		detalleretencionsRespaldo=this.detalleretencionLogic.getDetalleRetencions();
		
		this.detalleretencionLogic.setDetalleRetencions(detalleretencionsParaReportes);	
		this.detalleretencionLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		detalleretencionsParaReportes=this.detalleretencionLogic.getDetalleRetencions();
		this.detalleretencionLogic.setDetalleRetencions(detalleretencionsRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"detalleretencion_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("DetalleRetencions");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderDetalleRetencion("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(DetalleRetencion detalleretencion : detalleretencionsParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderDetalleRetencion("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			DetalleRetencionConstantesFunciones.generarExcelReporteDataDetalleRetencion("NORMAL",row,workbook,detalleretencion,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(DetalleRetencionConstantesFunciones.getDetalleRetencionDescripcion(detalleretencion));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.detalleretencionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Detalle Retencion",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoDetalleRetencion.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoDetalleRetencion.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoDetalleRetencion.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoDetalleRetencion.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessDetalleRetencion() throws Exception {		
		this.startProcessDetalleRetencion(true);
	}
	
	public void startProcessDetalleRetencion(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasDetalleRetencion ,this.jPanelParametrosReportesDetalleRetencion, this.jScrollPanelDatosDetalleRetencion,this.jPanelPaginacionDetalleRetencion, this.jScrollPanelDatosEdicionDetalleRetencion, this.jPanelAccionesDetalleRetencion,this.jPanelAccionesFormularioDetalleRetencion,this.jmenuBarDetalleRetencion,this.jmenuBarDetalleDetalleRetencion,this.jTtoolBarDetalleRetencion,this.jTtoolBarDetalleDetalleRetencion);		
		
		final JTabbedPane jTabbedPaneBusquedasDetalleRetencion=this.jTabbedPaneBusquedasDetalleRetencion; 
		
		final JPanel jPanelParametrosReportesDetalleRetencion=this.jPanelParametrosReportesDetalleRetencion;
		//final JScrollPane jScrollPanelDatosDetalleRetencion=this.jScrollPanelDatosDetalleRetencion;
		final JTable jTableDatosDetalleRetencion=this.jTableDatosDetalleRetencion;		
		final JPanel jPanelPaginacionDetalleRetencion=this.jPanelPaginacionDetalleRetencion;
		//final JScrollPane jScrollPanelDatosEdicionDetalleRetencion=this.jScrollPanelDatosEdicionDetalleRetencion;
		final JPanel jPanelAccionesDetalleRetencion=this.jPanelAccionesDetalleRetencion;
		
		JPanel jPanelCamposAuxiliarDetalleRetencion=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarDetalleRetencion=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormDetalleRetencion!=null) {
			jPanelCamposAuxiliarDetalleRetencion=this.jInternalFrameDetalleFormDetalleRetencion.jPanelCamposDetalleRetencion;
			jPanelAccionesFormularioAuxiliarDetalleRetencion=this.jInternalFrameDetalleFormDetalleRetencion.jPanelAccionesFormularioDetalleRetencion;
		}
		
		final JPanel jPanelCamposDetalleRetencion=jPanelCamposAuxiliarDetalleRetencion;
		final JPanel jPanelAccionesFormularioDetalleRetencion=jPanelAccionesFormularioAuxiliarDetalleRetencion;
		
		
		final JMenuBar jmenuBarDetalleRetencion=this.jmenuBarDetalleRetencion;
		final JToolBar jTtoolBarDetalleRetencion=this.jTtoolBarDetalleRetencion;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarDetalleRetencion=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarDetalleRetencion=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormDetalleRetencion!=null) {
			jmenuBarDetalleAuxiliarDetalleRetencion=this.jInternalFrameDetalleFormDetalleRetencion.jmenuBarDetalleDetalleRetencion;
			jTtoolBarDetalleAuxiliarDetalleRetencion=this.jInternalFrameDetalleFormDetalleRetencion.jTtoolBarDetalleDetalleRetencion;
		}
		
		final JMenuBar jmenuBarDetalleDetalleRetencion=jmenuBarDetalleAuxiliarDetalleRetencion;
		final JToolBar jTtoolBarDetalleDetalleRetencion=jTtoolBarDetalleAuxiliarDetalleRetencion;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasDetalleRetencion;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesDetalleRetencion;
			processRunnable.jTableDatos=jTableDatosDetalleRetencion;
			processRunnable.jPanelCampos=jPanelCamposDetalleRetencion;
			processRunnable.jPanelPaginacion=jPanelPaginacionDetalleRetencion;
			processRunnable.jPanelAcciones=jPanelAccionesDetalleRetencion;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioDetalleRetencion;
			
			
			processRunnable.jmenuBar=jmenuBarDetalleRetencion;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleDetalleRetencion;
			processRunnable.jTtoolBar=jTtoolBarDetalleRetencion;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleDetalleRetencion;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasDetalleRetencion ,jPanelParametrosReportesDetalleRetencion,jTableDatosDetalleRetencion, /*jScrollPanelDatosDetalleRetencion,*/jPanelCamposDetalleRetencion,jPanelPaginacionDetalleRetencion, /*jScrollPanelDatosEdicionDetalleRetencion,*/ jPanelAccionesDetalleRetencion,jPanelAccionesFormularioDetalleRetencion,jmenuBarDetalleRetencion,jmenuBarDetalleDetalleRetencion,jTtoolBarDetalleRetencion,jTtoolBarDetalleDetalleRetencion);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasDetalleRetencion ,jPanelParametrosReportesDetalleRetencion, jScrollPanelDatosDetalleRetencion,jPanelPaginacionDetalleRetencion, jScrollPanelDatosEdicionDetalleRetencion, jPanelAccionesDetalleRetencion,jPanelAccionesFormularioDetalleRetencion,jmenuBarDetalleRetencion,jmenuBarDetalleDetalleRetencion,jTtoolBarDetalleRetencion,jTtoolBarDetalleDetalleRetencion);
						
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
	
	public void finishProcessDetalleRetencion() {// throws Exception 
		this.finishProcessDetalleRetencion(true);
	}
	
	public void finishProcessDetalleRetencion(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasDetalleRetencion ,this.jPanelParametrosReportesDetalleRetencion, this.jScrollPanelDatosDetalleRetencion,this.jPanelPaginacionDetalleRetencion, this.jScrollPanelDatosEdicionDetalleRetencion, this.jPanelAccionesDetalleRetencion,this.jPanelAccionesFormularioDetalleRetencion,this.jmenuBarDetalleRetencion,this.jmenuBarDetalleDetalleRetencion,this.jTtoolBarDetalleRetencion,this.jTtoolBarDetalleDetalleRetencion);		
		
		final JTabbedPane jTabbedPaneBusquedasDetalleRetencion=this.jTabbedPaneBusquedasDetalleRetencion; 
		
		final JPanel jPanelParametrosReportesDetalleRetencion=this.jPanelParametrosReportesDetalleRetencion;
		//final JScrollPane jScrollPanelDatosDetalleRetencion=this.jScrollPanelDatosDetalleRetencion;
		final JTable jTableDatosDetalleRetencion=this.jTableDatosDetalleRetencion;		
		final JPanel jPanelPaginacionDetalleRetencion=this.jPanelPaginacionDetalleRetencion;
		//final JScrollPane jScrollPanelDatosEdicionDetalleRetencion=this.jScrollPanelDatosEdicionDetalleRetencion;
		final JPanel jPanelAccionesDetalleRetencion=this.jPanelAccionesDetalleRetencion;
		
		JPanel jPanelCamposAuxiliarDetalleRetencion=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarDetalleRetencion=new JPanel();
		
		if(this.jInternalFrameDetalleFormDetalleRetencion!=null) {
			jPanelCamposAuxiliarDetalleRetencion=this.jInternalFrameDetalleFormDetalleRetencion.jPanelCamposDetalleRetencion;
			jPanelAccionesFormularioAuxiliarDetalleRetencion=this.jInternalFrameDetalleFormDetalleRetencion.jPanelAccionesFormularioDetalleRetencion;
		}
		
		final JPanel jPanelCamposDetalleRetencion=jPanelCamposAuxiliarDetalleRetencion;
		final JPanel jPanelAccionesFormularioDetalleRetencion=jPanelAccionesFormularioAuxiliarDetalleRetencion;
		
		
		final JMenuBar jmenuBarDetalleRetencion=this.jmenuBarDetalleRetencion;		
		final JToolBar jTtoolBarDetalleRetencion=this.jTtoolBarDetalleRetencion;
				
		JMenuBar jmenuBarDetalleAuxiliarDetalleRetencion=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarDetalleRetencion=new JToolBar();
		
		if(this.jInternalFrameDetalleFormDetalleRetencion!=null) {
			jmenuBarDetalleAuxiliarDetalleRetencion=this.jInternalFrameDetalleFormDetalleRetencion.jmenuBarDetalleDetalleRetencion;
			jTtoolBarDetalleAuxiliarDetalleRetencion=this.jInternalFrameDetalleFormDetalleRetencion.jTtoolBarDetalleDetalleRetencion;		
		}
		
		final JMenuBar jmenuBarDetalleDetalleRetencion=jmenuBarDetalleAuxiliarDetalleRetencion;
		final JToolBar jTtoolBarDetalleDetalleRetencion=jTtoolBarDetalleAuxiliarDetalleRetencion;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasDetalleRetencion;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesDetalleRetencion;
			processRunnable.jTableDatos=jTableDatosDetalleRetencion;
			processRunnable.jPanelCampos=jPanelCamposDetalleRetencion;
			processRunnable.jPanelPaginacion=jPanelPaginacionDetalleRetencion;
			processRunnable.jPanelAcciones=jPanelAccionesDetalleRetencion;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioDetalleRetencion;
			
			
			processRunnable.jmenuBar=jmenuBarDetalleRetencion;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleDetalleRetencion;
			processRunnable.jTtoolBar=jTtoolBarDetalleRetencion;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleDetalleRetencion;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasDetalleRetencion ,jPanelParametrosReportesDetalleRetencion, jTableDatosDetalleRetencion,/*jScrollPanelDatosDetalleRetencion,*/jPanelCamposDetalleRetencion,jPanelPaginacionDetalleRetencion, /*jScrollPanelDatosEdicionDetalleRetencion,*/ jPanelAccionesDetalleRetencion,jPanelAccionesFormularioDetalleRetencion,jmenuBarDetalleRetencion,jmenuBarDetalleDetalleRetencion,jTtoolBarDetalleRetencion,jTtoolBarDetalleDetalleRetencion));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesDetalleRetencion(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarDetalleRetencion(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuDetalleRetencion(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarDetalleRetencion(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleRetencion,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleDetalleRetencion,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuDetalleRetencion(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleRetencion,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleDetalleRetencion,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.detalleretencionConstantesFunciones.getsFinalQueryDetalleRetencion();
		String  finalQueryPaginacionTodos=this.detalleretencionConstantesFunciones.getsFinalQueryDetalleRetencion();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=DetalleRetencionConstantesFunciones.getArrayColumnasGlobalesNoDetalleRetencion(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=DetalleRetencionConstantesFunciones.getArrayColumnasGlobalesDetalleRetencion(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,DetalleRetencionConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.detalleretencionsEliminados= new ArrayList<DetalleRetencion>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessDetalleRetencion();
		
				///*DetalleRetencionSessionBean*/this.detalleretencionSessionBean=new DetalleRetencionSessionBean();
			
			if(this.detalleretencionSessionBean==null) {
				this.detalleretencionSessionBean=new DetalleRetencionSessionBean();
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
					this.iNumeroPaginacion=DetalleRetencionConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=DetalleRetencionConstantesFunciones.getClassesForeignKeysOfDetalleRetencion(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/detalleretencion."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			detalleretencionsAux= new ArrayList<DetalleRetencion>();
			
				
			detalleretencionLogic.setDatosCliente(this.datosCliente);
			detalleretencionLogic.setDatosDeep(this.datosDeep);
			detalleretencionLogic.setIsConDeep(true);
			
			
			detalleretencionLogic.getDetalleRetencionDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					detalleretencionLogic.getTodosDetalleRetencions(finalQueryGlobal,pagination);
					
					//detalleretencionLogic.getTodosDetalleRetencionsWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(detalleretencionLogic.getDetalleRetencions()==null|| detalleretencionLogic.getDetalleRetencions().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							detalleretencionsAux= new ArrayList<DetalleRetencion>();
							detalleretencionsAux.addAll(detalleretencionLogic.getDetalleRetencions());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							detalleretencionsAux= new ArrayList<DetalleRetencion>();
							detalleretencionsAux.addAll(detalleretencions);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							detalleretencionLogic.getTodosDetalleRetencions(finalQueryGlobal+"",this.pagination);												
							
							//detalleretencionLogic.getTodosDetalleRetencionsWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteDetalleRetencions("Todos",detalleretencionLogic.getDetalleRetencions() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							detalleretencionLogic.setDetalleRetencions(new ArrayList<DetalleRetencion>());					
							detalleretencionLogic.getDetalleRetencions().addAll(detalleretencionsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							detalleretencions=new ArrayList<DetalleRetencion>();
							detalleretencions.addAll(detalleretencionsAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idDetalleRetencion=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idDetalleRetencion=this.idActual;
				
				} else if(this.idDetalleRetencionActual!=null && this.idDetalleRetencionActual!=0L) {
					idDetalleRetencion=idDetalleRetencionActual;
				}
				
					
				this.sDetalleReporte=DetalleRetencionConstantesFunciones.getDetalleIndicePorId(idDetalleRetencion);
				
				this.detalleretencions=new ArrayList<DetalleRetencion>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					detalleretencionLogic.getEntity(idDetalleRetencion);
					
					//detalleretencionLogic.getEntityWithConnection(idDetalleRetencion);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					detalleretencionLogic.setDetalleRetencions(new ArrayList<DetalleRetencion>());
					detalleretencionLogic.getDetalleRetencions().add(detalleretencionLogic.getDetalleRetencion());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.detalleretencions=new ArrayList<DetalleRetencion>();
					this.detalleretencions.add(detalleretencion);
				}
				
				if(detalleretencionLogic.getDetalleRetencion()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdCuentaContable")) {
				this.sDetalleReporte=DetalleRetencionConstantesFunciones.getDetalleIndiceFK_IdCuentaContable(id_cuenta_contableFK_IdCuentaContable);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					detalleretencionLogic.getDetalleRetencionsFK_IdCuentaContable(finalQueryGlobal,pagination,id_cuenta_contableFK_IdCuentaContable);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DetalleRetencionConstantesFunciones.getDetalleIndiceFK_IdCuentaContable(id_cuenta_contableFK_IdCuentaContable);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DetalleRetencionConstantesFunciones.getDetalleIndiceFK_IdCuentaContable(id_cuenta_contableFK_IdCuentaContable);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=detalleretencionLogic.getDetalleRetencions()==null||detalleretencionLogic.getDetalleRetencions().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=detalleretencions==null|| detalleretencions.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						detalleretencionsAux=new ArrayList<DetalleRetencion>();
						detalleretencionsAux.addAll(detalleretencionLogic.getDetalleRetencions());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							detalleretencionsAux=new ArrayList<DetalleRetencion>();
							detalleretencionsAux.addAll(detalleretencions);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							detalleretencionLogic.getDetalleRetencionsFK_IdCuentaContable(finalQueryGlobal,pagination,id_cuenta_contableFK_IdCuentaContable);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DetalleRetencionConstantesFunciones.getDetalleIndiceFK_IdCuentaContable(id_cuenta_contableFK_IdCuentaContable);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DetalleRetencionConstantesFunciones.getDetalleIndiceFK_IdCuentaContable(id_cuenta_contableFK_IdCuentaContable);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteDetalleRetencions("FK_IdCuentaContable",detalleretencionLogic.getDetalleRetencions());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteDetalleRetencions("FK_IdCuentaContable",detalleretencions);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						detalleretencionLogic.setDetalleRetencions(new ArrayList<DetalleRetencion>());
						detalleretencionLogic.getDetalleRetencions().addAll(detalleretencionsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							detalleretencions=new ArrayList<DetalleRetencion>();
							detalleretencions.addAll(detalleretencionsAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdCuentaContableCredito")) {
				this.sDetalleReporte=DetalleRetencionConstantesFunciones.getDetalleIndiceFK_IdCuentaContableCredito(id_cuenta_contable_creditoFK_IdCuentaContableCredito);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					detalleretencionLogic.getDetalleRetencionsFK_IdCuentaContableCredito(finalQueryGlobal,pagination,id_cuenta_contable_creditoFK_IdCuentaContableCredito);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DetalleRetencionConstantesFunciones.getDetalleIndiceFK_IdCuentaContableCredito(id_cuenta_contable_creditoFK_IdCuentaContableCredito);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DetalleRetencionConstantesFunciones.getDetalleIndiceFK_IdCuentaContableCredito(id_cuenta_contable_creditoFK_IdCuentaContableCredito);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=detalleretencionLogic.getDetalleRetencions()==null||detalleretencionLogic.getDetalleRetencions().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=detalleretencions==null|| detalleretencions.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						detalleretencionsAux=new ArrayList<DetalleRetencion>();
						detalleretencionsAux.addAll(detalleretencionLogic.getDetalleRetencions());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							detalleretencionsAux=new ArrayList<DetalleRetencion>();
							detalleretencionsAux.addAll(detalleretencions);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							detalleretencionLogic.getDetalleRetencionsFK_IdCuentaContableCredito(finalQueryGlobal,pagination,id_cuenta_contable_creditoFK_IdCuentaContableCredito);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DetalleRetencionConstantesFunciones.getDetalleIndiceFK_IdCuentaContableCredito(id_cuenta_contable_creditoFK_IdCuentaContableCredito);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DetalleRetencionConstantesFunciones.getDetalleIndiceFK_IdCuentaContableCredito(id_cuenta_contable_creditoFK_IdCuentaContableCredito);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteDetalleRetencions("FK_IdCuentaContableCredito",detalleretencionLogic.getDetalleRetencions());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteDetalleRetencions("FK_IdCuentaContableCredito",detalleretencions);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						detalleretencionLogic.setDetalleRetencions(new ArrayList<DetalleRetencion>());
						detalleretencionLogic.getDetalleRetencions().addAll(detalleretencionsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							detalleretencions=new ArrayList<DetalleRetencion>();
							detalleretencions.addAll(detalleretencionsAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdDetalleRetencion")) {
				this.sDetalleReporte=DetalleRetencionConstantesFunciones.getDetalleIndiceFK_IdDetalleRetencion(id_empresa_destinoFK_IdDetalleRetencion);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					detalleretencionLogic.getDetalleRetencionsFK_IdDetalleRetencion(finalQueryGlobal,pagination,id_empresa_destinoFK_IdDetalleRetencion);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DetalleRetencionConstantesFunciones.getDetalleIndiceFK_IdDetalleRetencion(id_empresa_destinoFK_IdDetalleRetencion);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DetalleRetencionConstantesFunciones.getDetalleIndiceFK_IdDetalleRetencion(id_empresa_destinoFK_IdDetalleRetencion);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=detalleretencionLogic.getDetalleRetencions()==null||detalleretencionLogic.getDetalleRetencions().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=detalleretencions==null|| detalleretencions.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						detalleretencionsAux=new ArrayList<DetalleRetencion>();
						detalleretencionsAux.addAll(detalleretencionLogic.getDetalleRetencions());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							detalleretencionsAux=new ArrayList<DetalleRetencion>();
							detalleretencionsAux.addAll(detalleretencions);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							detalleretencionLogic.getDetalleRetencionsFK_IdDetalleRetencion(finalQueryGlobal,pagination,id_empresa_destinoFK_IdDetalleRetencion);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DetalleRetencionConstantesFunciones.getDetalleIndiceFK_IdDetalleRetencion(id_empresa_destinoFK_IdDetalleRetencion);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DetalleRetencionConstantesFunciones.getDetalleIndiceFK_IdDetalleRetencion(id_empresa_destinoFK_IdDetalleRetencion);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteDetalleRetencions("FK_IdDetalleRetencion",detalleretencionLogic.getDetalleRetencions());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteDetalleRetencions("FK_IdDetalleRetencion",detalleretencions);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						detalleretencionLogic.setDetalleRetencions(new ArrayList<DetalleRetencion>());
						detalleretencionLogic.getDetalleRetencions().addAll(detalleretencionsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							detalleretencions=new ArrayList<DetalleRetencion>();
							detalleretencions.addAll(detalleretencionsAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=DetalleRetencionConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					detalleretencionLogic.getDetalleRetencionsFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DetalleRetencionConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DetalleRetencionConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=detalleretencionLogic.getDetalleRetencions()==null||detalleretencionLogic.getDetalleRetencions().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=detalleretencions==null|| detalleretencions.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						detalleretencionsAux=new ArrayList<DetalleRetencion>();
						detalleretencionsAux.addAll(detalleretencionLogic.getDetalleRetencions());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							detalleretencionsAux=new ArrayList<DetalleRetencion>();
							detalleretencionsAux.addAll(detalleretencions);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							detalleretencionLogic.getDetalleRetencionsFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DetalleRetencionConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DetalleRetencionConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteDetalleRetencions("FK_IdEmpresa",detalleretencionLogic.getDetalleRetencions());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteDetalleRetencions("FK_IdEmpresa",detalleretencions);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						detalleretencionLogic.setDetalleRetencions(new ArrayList<DetalleRetencion>());
						detalleretencionLogic.getDetalleRetencions().addAll(detalleretencionsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							detalleretencions=new ArrayList<DetalleRetencion>();
							detalleretencions.addAll(detalleretencionsAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesDetalleRetencion();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessDetalleRetencion();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=detalleretencionLogic.getDetalleRetencions().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=detalleretencions.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=detalleretencionLogic.getDetalleRetencions().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=detalleretencions.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(DetalleRetencion detalleretencion) {
		Boolean permite=true;
		
		if(this.detalleretencion.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=DetalleRetencionConstantesFunciones.getOrderByListaDetalleRetencion();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=DetalleRetencionConstantesFunciones.getOrderByListaDetalleRetencion();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(DetalleRetencion detalleretencion:detalleretencionLogic.getDetalleRetencions()) {
				if(detalleretencion.getsType().equals(Constantes2.S_TOTALES)) {
					detalleretencionTotales=detalleretencion;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(DetalleRetencion detalleretencion:this.detalleretencions) {
				if(detalleretencion.getsType().equals(Constantes2.S_TOTALES)) {
					detalleretencionTotales=detalleretencion;
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
			this.detalleretencionAux=new DetalleRetencion();
			this.detalleretencionAux.setsType(Constantes2.S_TOTALES);
			this.detalleretencionAux.setIsNew(false);
			this.detalleretencionAux.setIsChanged(false);
			this.detalleretencionAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				DetalleRetencionConstantesFunciones.TotalizarValoresFilaDetalleRetencion(this.detalleretencionLogic.getDetalleRetencions(),this.detalleretencionAux);
				
				this.detalleretencionLogic.getDetalleRetencions().add(this.detalleretencionAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				DetalleRetencionConstantesFunciones.TotalizarValoresFilaDetalleRetencion(this.detalleretencions,this.detalleretencionAux);
				
				this.detalleretencions.add(this.detalleretencionAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		detalleretencionTotales=new DetalleRetencion();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.detalleretencionLogic.getDetalleRetencions().remove(detalleretencionTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.detalleretencions.remove(detalleretencionTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		detalleretencionTotales=new DetalleRetencion();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(DetalleRetencion detalleretencion:detalleretencionLogic.getDetalleRetencions()) {
				if(detalleretencion.getsType().equals(Constantes2.S_TOTALES)) {
					detalleretencionTotales=detalleretencion;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				DetalleRetencionConstantesFunciones.TotalizarValoresFilaDetalleRetencion(this.detalleretencionLogic.getDetalleRetencions(),detalleretencionTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(DetalleRetencion detalleretencion:this.detalleretencions) {
				if(detalleretencion.getsType().equals(Constantes2.S_TOTALES)) {
					detalleretencionTotales=detalleretencion;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				DetalleRetencionConstantesFunciones.TotalizarValoresFilaDetalleRetencion(this.detalleretencions,detalleretencionTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleRetencionConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getDetalleRetencionsFK_IdCuentaContable()throws Exception {
		try {
			sAccionBusqueda="FK_IdCuentaContable";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getDetalleRetencionsFK_IdCuentaContableCredito()throws Exception {
		try {
			sAccionBusqueda="FK_IdCuentaContableCredito";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getDetalleRetencionsFK_IdDetalleRetencion()throws Exception {
		try {
			sAccionBusqueda="FK_IdDetalleRetencion";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getDetalleRetencionsFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getDetalleRetencionsFK_IdCuentaContable(String sFinalQuery,Long id_cuenta_contable)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					detalleretencionLogic.getDetalleRetencionsFK_IdCuentaContable(sFinalQuery,this.pagination,id_cuenta_contable);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getDetalleRetencionsFK_IdCuentaContableCredito(String sFinalQuery,Long id_cuenta_contable_credito)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					detalleretencionLogic.getDetalleRetencionsFK_IdCuentaContableCredito(sFinalQuery,this.pagination,id_cuenta_contable_credito);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getDetalleRetencionsFK_IdDetalleRetencion(String sFinalQuery,Long id_empresa_destino)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					detalleretencionLogic.getDetalleRetencionsFK_IdDetalleRetencion(sFinalQuery,this.pagination,id_empresa_destino);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getDetalleRetencionsFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					detalleretencionLogic.getDetalleRetencionsFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
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
	
	public void inicializarPermisosDetalleRetencion() {
		this.isPermisoTodoDetalleRetencion=false;
		this.isPermisoNuevoDetalleRetencion=false;
		this.isPermisoActualizarDetalleRetencion=false;
		this.isPermisoActualizarOriginalDetalleRetencion=false;
		this.isPermisoEliminarDetalleRetencion=false;
		this.isPermisoGuardarCambiosDetalleRetencion=false;
		this.isPermisoConsultaDetalleRetencion=false;
		this.isPermisoBusquedaDetalleRetencion=false;
		this.isPermisoReporteDetalleRetencion=false;		
		this.isPermisoOrdenDetalleRetencion=false;		
		this.isPermisoPaginacionMedioDetalleRetencion=false;		
		this.isPermisoPaginacionAltoDetalleRetencion=false;
		this.isPermisoPaginacionTodoDetalleRetencion=false;
		this.isPermisoCopiarDetalleRetencion=false;		
		this.isPermisoVerFormDetalleRetencion=false;		
		this.isPermisoDuplicarDetalleRetencion=false;		
		this.isPermisoOrdenDetalleRetencion=false;		
	}
	
	public void setPermisosUsuarioDetalleRetencion(Boolean isPermiso) {
		this.isPermisoTodoDetalleRetencion=isPermiso;
		this.isPermisoNuevoDetalleRetencion=isPermiso;
		this.isPermisoActualizarDetalleRetencion=isPermiso;
		this.isPermisoActualizarOriginalDetalleRetencion=isPermiso;
		this.isPermisoEliminarDetalleRetencion=isPermiso;
		this.isPermisoGuardarCambiosDetalleRetencion=isPermiso;
		this.isPermisoConsultaDetalleRetencion=isPermiso;
		this.isPermisoBusquedaDetalleRetencion=isPermiso;
		this.isPermisoReporteDetalleRetencion=isPermiso;
		this.isPermisoOrdenDetalleRetencion=isPermiso;		
		this.isPermisoPaginacionMedioDetalleRetencion=isPermiso;		
		this.isPermisoPaginacionAltoDetalleRetencion=isPermiso;		
		this.isPermisoPaginacionTodoDetalleRetencion=isPermiso;		
		this.isPermisoCopiarDetalleRetencion=isPermiso;		
		this.isPermisoVerFormDetalleRetencion=isPermiso;		
		this.isPermisoDuplicarDetalleRetencion=isPermiso;
		this.isPermisoOrdenDetalleRetencion=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioDetalleRetencion(Boolean isPermiso) {
		//this.isPermisoTodoDetalleRetencion=isPermiso;
		this.isPermisoNuevoDetalleRetencion=isPermiso;
		this.isPermisoActualizarDetalleRetencion=isPermiso;
		this.isPermisoActualizarOriginalDetalleRetencion=isPermiso;
		this.isPermisoEliminarDetalleRetencion=isPermiso;
		this.isPermisoGuardarCambiosDetalleRetencion=isPermiso;
		//this.isPermisoConsultaDetalleRetencion=isPermiso;
		//this.isPermisoBusquedaDetalleRetencion=isPermiso;
		//this.isPermisoReporteDetalleRetencion=isPermiso;
		//this.isPermisoOrdenDetalleRetencion=isPermiso;		
		//this.isPermisoPaginacionMedioDetalleRetencion=isPermiso;		
		//this.isPermisoPaginacionAltoDetalleRetencion=isPermiso;		
		//this.isPermisoPaginacionTodoDetalleRetencion=isPermiso;		
		//this.isPermisoCopiarDetalleRetencion=isPermiso;		
		//this.isPermisoDuplicarDetalleRetencion=isPermiso;
		//this.isPermisoOrdenDetalleRetencion=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioDetalleRetencionClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(DetalleRetencionJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebDetalleRetencion(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioDetalleRetencionClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioDetalleRetencionClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionDetalleRetencionClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioDetalleRetencionClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioDetalleRetencion() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(DetalleRetencionJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.detalleretencionSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, DetalleRetencionConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoDetalleRetencion=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarDetalleRetencion=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalDetalleRetencion=this.isPermisoActualizarDetalleRetencion;
			this.isPermisoEliminarDetalleRetencion=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosDetalleRetencion=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaDetalleRetencion=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaDetalleRetencion=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoDetalleRetencion=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteDetalleRetencion=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenDetalleRetencion=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioDetalleRetencion=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoDetalleRetencion=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoDetalleRetencion=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarDetalleRetencion=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormDetalleRetencion=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarDetalleRetencion=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenDetalleRetencion=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.detalleretencionSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosDetalleRetencion.setToolTipText(this.jTableDatosDetalleRetencion.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioDetalleRetencion(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioDetalleRetencion(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(DetalleRetencionJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(DetalleRetencionJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioDetalleRetencion() throws Exception {
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
	public void inicializarCombosForeignKeyDetalleRetencionListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
				this.empresadestinosForeignKey=new ArrayList();
				this.cuentacontablesForeignKey=new ArrayList();
				this.cuentacontablecreditosForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyDetalleRetencionListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(DetalleRetencionJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyDetalleRetencionListas(false);
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyEmpresaDestinoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyCuentaContableListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyCuentaContableCreditoListas(cargarCombosDependencia,sFinalQueryCombo);
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

	public void cargarCombosForeignKeyEmpresaDestinoListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.empresadestinosForeignKey==null||this.empresadestinosForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=EmpresaConstantesFunciones.SFINALQUERY;

				this.cargarCombosEmpresaDestinosForeignKeyLista(finalQueryGlobal);
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

	public void cargarCombosForeignKeyCuentaContableCreditoListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.cuentacontablecreditosForeignKey==null||this.cuentacontablecreditosForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=CuentaContableConstantesFunciones.getArrayColumnasGlobalesCuentaContable(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,CuentaContableConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=CuentaContableConstantesFunciones.SFINALQUERY;

				this.cargarCombosCuentaContableCreditosForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void cargarCombosLoteForeignKeyDetalleRetencionListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			DetalleRetencionParameterReturnGeneral detalleretencionReturnGeneral=new DetalleRetencionParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.detalleretencionConstantesFunciones.cargarid_empresaDetalleRetencion)
					 || (this.esRecargarFks && this.detalleretencionConstantesFunciones.cargarid_empresaDetalleRetencion)) {

					if(!this.detalleretencionSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+detalleretencionSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}


				String finalQueryGlobalEmpresaDestino="";

				if(((this.empresadestinosForeignKey==null||this.empresadestinosForeignKey.size()<=0) && this.detalleretencionConstantesFunciones.cargarid_empresa_destinoDetalleRetencion)
					 || (this.esRecargarFks && this.detalleretencionConstantesFunciones.cargarid_empresa_destinoDetalleRetencion)) {

					if(!this.detalleretencionSessionBean.getisBusquedaDesdeForeignKeySesionEmpresaDestino()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresaDestino=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresaDestino=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresaDestino, "");
						finalQueryGlobalEmpresaDestino+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresaDestinosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresaDestino=" WHERE " + ConstantesSql.ID + "="+detalleretencionSessionBean.getlidEmpresaDestinoActual();
					}
				} else {
					finalQueryGlobalEmpresaDestino="NONE";
				}


				String finalQueryGlobalCuentaContable="";

				if(((this.cuentacontablesForeignKey==null||this.cuentacontablesForeignKey.size()<=0) && this.detalleretencionConstantesFunciones.cargarid_cuenta_contableDetalleRetencion)
					 || (this.esRecargarFks && this.detalleretencionConstantesFunciones.cargarid_cuenta_contableDetalleRetencion)) {

					if(!this.detalleretencionSessionBean.getisBusquedaDesdeForeignKeySesionCuentaContable()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();

						this.arrDatoGeneralNo.add("id_modulo");

						arrColumnasGlobales=CuentaContableConstantesFunciones.getArrayColumnasGlobalesCuentaContable(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalCuentaContable=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,CuentaContableConstantesFunciones.TABLENAME);

						finalQueryGlobalCuentaContable=Funciones.GetFinalQueryAppend(finalQueryGlobalCuentaContable, "");
						finalQueryGlobalCuentaContable+=CuentaContableConstantesFunciones.SFINALQUERY;

						//this.cargarCombosCuentaContablesForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalCuentaContable=" WHERE " + ConstantesSql.ID + "="+detalleretencionSessionBean.getlidCuentaContableActual();
					}
				} else {
					finalQueryGlobalCuentaContable="NONE";
				}


				String finalQueryGlobalCuentaContableCredito="";

				if(((this.cuentacontablecreditosForeignKey==null||this.cuentacontablecreditosForeignKey.size()<=0) && this.detalleretencionConstantesFunciones.cargarid_cuenta_contable_creditoDetalleRetencion)
					 || (this.esRecargarFks && this.detalleretencionConstantesFunciones.cargarid_cuenta_contable_creditoDetalleRetencion)) {

					if(!this.detalleretencionSessionBean.getisBusquedaDesdeForeignKeySesionCuentaContableCredito()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();

						this.arrDatoGeneralNo.add("id_modulo");

						arrColumnasGlobales=CuentaContableConstantesFunciones.getArrayColumnasGlobalesCuentaContable(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalCuentaContableCredito=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,CuentaContableConstantesFunciones.TABLENAME);

						finalQueryGlobalCuentaContableCredito=Funciones.GetFinalQueryAppend(finalQueryGlobalCuentaContableCredito, "");
						finalQueryGlobalCuentaContableCredito+=CuentaContableConstantesFunciones.SFINALQUERY;

						//this.cargarCombosCuentaContableCreditosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalCuentaContableCredito=" WHERE " + ConstantesSql.ID + "="+detalleretencionSessionBean.getlidCuentaContableCreditoActual();
					}
				} else {
					finalQueryGlobalCuentaContableCredito="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				detalleretencionReturnGeneral=detalleretencionLogic.cargarCombosLoteForeignKeyDetalleRetencion(finalQueryGlobalEmpresa,finalQueryGlobalEmpresaDestino,finalQueryGlobalCuentaContable,finalQueryGlobalCuentaContableCredito);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=detalleretencionReturnGeneral.getempresasForeignKey();
			}

			if(!finalQueryGlobalEmpresaDestino.equals("NONE")) {
				this.empresadestinosForeignKey=detalleretencionReturnGeneral.getempresadestinosForeignKey();
			}

			if(!finalQueryGlobalCuentaContable.equals("NONE")) {
				this.cuentacontablesForeignKey=detalleretencionReturnGeneral.getcuentacontablesForeignKey();
			}

			if(!finalQueryGlobalCuentaContableCredito.equals("NONE")) {
				this.cuentacontablecreditosForeignKey=detalleretencionReturnGeneral.getcuentacontablecreditosForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyDetalleRetencion()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeyEmpresaDestino();
			this.addItemDefectoCombosForeignKeyCuentaContable();
			this.addItemDefectoCombosForeignKeyCuentaContableCredito();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.detalleretencionSessionBean==null) {
				this.detalleretencionSessionBean=new DetalleRetencionSessionBean();
			}

			if(!this.detalleretencionSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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

	public void addItemDefectoCombosForeignKeyEmpresaDestino()throws Exception {
		try {

			if(!this.detalleretencionSessionBean.getisBusquedaDesdeForeignKeySesionEmpresaDestino()) {
				Empresa empresadestino=new Empresa();
				EmpresaConstantesFunciones.setEmpresaDescripcion(empresadestino,Constantes.SMENSAJE_ESCOJA_OPCION);
				empresadestino.setId(null);

				if(!EmpresaConstantesFunciones.ExisteEnLista(this.empresadestinosForeignKey,empresadestino,true)) {

					this.empresadestinosForeignKey.add(0,empresadestino);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyCuentaContable()throws Exception {
		try {

			if(!this.detalleretencionSessionBean.getisBusquedaDesdeForeignKeySesionCuentaContable()) {
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

	public void addItemDefectoCombosForeignKeyCuentaContableCredito()throws Exception {
		try {

			if(!this.detalleretencionSessionBean.getisBusquedaDesdeForeignKeySesionCuentaContableCredito()) {
				CuentaContable cuentacontablecredito=new CuentaContable();
				CuentaContableConstantesFunciones.setCuentaContableDescripcion(cuentacontablecredito,Constantes.SMENSAJE_ESCOJA_OPCION);
				cuentacontablecredito.setId(null);

				if(!CuentaContableConstantesFunciones.ExisteEnLista(this.cuentacontablecreditosForeignKey,cuentacontablecredito,true)) {

					this.cuentacontablecreditosForeignKey.add(0,cuentacontablecredito);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void initActionsCombosTodosForeignKeyDetalleRetencion()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyDetalleRetencion(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyDetalleRetencion()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyDetalleRetencion();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyDetalleRetencion(DetalleRetencion detalleretencion)throws Exception {	
		try {
			
			this.setActualEmpresaDestinoForeignKey(detalleretencion.getid_empresa_destino(),false,"Formulario");
			this.setActualCuentaContableForeignKey(detalleretencion.getid_cuenta_contable(),false,"Formulario");
			this.setActualCuentaContableCreditoForeignKey(detalleretencion.getid_cuenta_contable_credito(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyDetalleRetencion(DetalleRetencion detalleretencion,String sTipoEvento)throws Exception {	
		try {
			
			

				if(detalleretencion.getCuentaContable()!=null && !sTipoEvento.equals("id_cuenta_contableDetalleRetencion")) { //sTipoEvento Evita Bucle Infinito

					this.cuentacontablesForeignKey=new ArrayList<CuentaContable>();
					this.cuentacontablesForeignKey.add(detalleretencion.getCuentaContable());

					this.addItemDefectoCombosForeignKeyCuentaContable();
					this.cargarCombosFrameCuentaContablesForeignKey("Todos");
				}

				if(detalleretencion.getCuentaContableCredito()!=null && !sTipoEvento.equals("id_cuenta_contable_creditoDetalleRetencion")) { //sTipoEvento Evita Bucle Infinito

					this.cuentacontablecreditosForeignKey=new ArrayList<CuentaContable>();
					this.cuentacontablecreditosForeignKey.add(detalleretencion.getCuentaContableCredito());

					this.addItemDefectoCombosForeignKeyCuentaContableCredito();
					this.cargarCombosFrameCuentaContableCreditosForeignKey("Todos");
				}
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyDetalleRetencion()throws Exception {	
		try {
			
			this.setActualEmpresaDestinoForeignKey(this.detalleretencionConstantesFunciones.getid_empresa_destino(),false,"Formulario");
			this.setActualCuentaContableForeignKey(this.detalleretencionConstantesFunciones.getid_cuenta_contable(),false,"Formulario");
			this.setActualCuentaContableCreditoForeignKey(this.detalleretencionConstantesFunciones.getid_cuenta_contable_credito(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyDetalleRetencion()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyDetalleRetencion()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyDetalleRetencion()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroDetalleRetencion()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyDetalleRetencion()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameEmpresaDestinosForeignKey("Todos");
			this.cargarCombosFrameCuentaContablesForeignKey("Todos");
			this.cargarCombosFrameCuentaContableCreditosForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyDetalleRetencion(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameEmpresaDestinosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameCuentaContablesForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameCuentaContableCreditosForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyDetalleRetencion()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormDetalleRetencion.jComboBoxid_empresaDetalleRetencion!=null && this.jInternalFrameDetalleFormDetalleRetencion.jComboBoxid_empresaDetalleRetencion.getItemCount()>0) {
				this.jInternalFrameDetalleFormDetalleRetencion.jComboBoxid_empresaDetalleRetencion.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormDetalleRetencion.jComboBoxid_empresa_destinoDetalleRetencion!=null && this.jInternalFrameDetalleFormDetalleRetencion.jComboBoxid_empresa_destinoDetalleRetencion.getItemCount()>0) {
				this.jInternalFrameDetalleFormDetalleRetencion.jComboBoxid_empresa_destinoDetalleRetencion.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormDetalleRetencion.jComboBoxid_cuenta_contableDetalleRetencion!=null && this.jInternalFrameDetalleFormDetalleRetencion.jComboBoxid_cuenta_contableDetalleRetencion.getItemCount()>0) {
				this.jInternalFrameDetalleFormDetalleRetencion.jComboBoxid_cuenta_contableDetalleRetencion.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormDetalleRetencion.jComboBoxid_cuenta_contable_creditoDetalleRetencion!=null && this.jInternalFrameDetalleFormDetalleRetencion.jComboBoxid_cuenta_contable_creditoDetalleRetencion.getItemCount()>0) {
				this.jInternalFrameDetalleFormDetalleRetencion.jComboBoxid_cuenta_contable_creditoDetalleRetencion.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	








	
	

	public DetalleRetencionBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public DetalleRetencionBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public DetalleRetencionBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.detalleretencionSessionBean=new DetalleRetencionSessionBean(); 
		this.detalleretencionConstantesFunciones=new DetalleRetencionConstantesFunciones(); 
		this.detalleretencionBean=new DetalleRetencion();//(this.detalleretencionConstantesFunciones); 		
		this.detalleretencionReturnGeneral=new DetalleRetencionParameterReturnGeneral(); 
		
		this.detalleretencionSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.detalleretencionSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public DetalleRetencionBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public DetalleRetencionBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public DetalleRetencionBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessDetalleRetencion(true);
			
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
			
			this.detalleretencionConstantesFunciones=new DetalleRetencionConstantesFunciones(); 
			this.detalleretencionBean=new DetalleRetencion();//this.detalleretencionConstantesFunciones); 			
			this.detalleretencionReturnGeneral=new DetalleRetencionParameterReturnGeneral(); 
		
			DetalleRetencionBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Detalle Retencion Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			this.conTotales=true;
			
			
			this.detalleretencion=new DetalleRetencion();
			this.detalleretencions = new ArrayList<DetalleRetencion>();
			this.detalleretencionsAux = new ArrayList<DetalleRetencion>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleretencionLogic=new DetalleRetencionLogic();
				this.detalleretencionLogic.getNewConnexionToDeep("");
			}
			
			//this.detalleretencionSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.detalleretencionSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormDetalleRetencion);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoDetalleRetencion!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoDetalleRetencion);	
					}
					
					if(this.jInternalFrameImportacionDetalleRetencion!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionDetalleRetencion);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByDetalleRetencion!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByDetalleRetencion);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormDetalleRetencion!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormDetalleRetencion);
				this.jInternalFrameDetalleFormDetalleRetencion.setVisible(false);
				this.jInternalFrameDetalleFormDetalleRetencion.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoDetalleRetencion!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoDetalleRetencion);
					this.jInternalFrameReporteDinamicoDetalleRetencion.setVisible(false);
					this.jInternalFrameReporteDinamicoDetalleRetencion.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionDetalleRetencion!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionDetalleRetencion);
					this.jInternalFrameImportacionDetalleRetencion.setVisible(false);
					this.jInternalFrameImportacionDetalleRetencion.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByDetalleRetencion!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByDetalleRetencion);
					this.jInternalFrameOrderByDetalleRetencion.setVisible(false);
					this.jInternalFrameOrderByDetalleRetencion.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idDetalleRetencionActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=DetalleRetencionConstantesFunciones.INUMEROPAGINACION;
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
			
			this.detalleretencionReturnGeneral=new DetalleRetencionParameterReturnGeneral();
			
			this.detalleretencionParameterGeneral=new DetalleRetencionParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.detalleretencionLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.detalleretencionSessionBean.getEsGuardarRelacionado()) {
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
			
			if(DetalleRetencionJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.detalleretencionSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,DetalleRetencionConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.detalleretencionSessionBean.getEsGuardarRelacionado(),this.detalleretencionSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,DetalleRetencionConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.detalleretencionSessionBean.getEsGuardarRelacionado(),this.detalleretencionSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoDetalleRetencion=false;
			this.isVisibilidadCeldaDuplicarDetalleRetencion=true;
			this.isVisibilidadCeldaCopiarDetalleRetencion=true;
			this.isVisibilidadCeldaVerFormDetalleRetencion=true;
			this.isVisibilidadCeldaOrdenDetalleRetencion=true;
			this.isVisibilidadCeldaNuevoRelacionesDetalleRetencion=false;
			this.isVisibilidadCeldaModificarDetalleRetencion=false;
			this.isVisibilidadCeldaActualizarDetalleRetencion=false;
			this.isVisibilidadCeldaEliminarDetalleRetencion=false;
			this.isVisibilidadCeldaCancelarDetalleRetencion=false;
			this.isVisibilidadCeldaGuardarDetalleRetencion=false;
			this.isVisibilidadCeldaGuardarCambiosDetalleRetencion=false;
			
			
			this.isVisibilidadFK_IdCuentaContable=true;
			this.isVisibilidadFK_IdCuentaContableCredito=true;
			this.isVisibilidadFK_IdDetalleRetencion=true;
			this.isVisibilidadFK_IdEmpresa=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesDetalleRetencion("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosDetalleRetencion();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioDetalleRetencion(false);
			
			this.setPermisosUsuarioDetalleRetencion();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.detalleretencionSessionBean.getEsGuardarRelacionado() 
				|| (this.detalleretencionSessionBean.getEsGuardarRelacionado() && this.detalleretencionSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioDetalleRetencionClasesRelacionadas();
			}
			
			if(this.detalleretencionSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioDetalleRetencionClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!DetalleRetencionJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosDetalleRetencion();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualDetalleRetencion();
			}
			
			if(!this.isPermisoBusquedaDetalleRetencion) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasDetalleRetencion.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.detalleretencionSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(true);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(true);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioDetalleRetencion,this.isPermisoPaginacionMedioDetalleRetencion,this.isPermisoPaginacionTodoDetalleRetencion);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(DetalleRetencionConstantesFunciones.getTiposSeleccionarDetalleRetencion());
				
				this.tiposColumnasSelect=DetalleRetencionConstantesFunciones.getTiposSeleccionarDetalleRetencion(true);
				
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
			//if(!this.detalleretencionSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioDetalleRetencion();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(true,false,true);
				this.setAccionesUsuarioDetalleRetencion(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(true,false,true);							
				this.setAccionesUsuarioDetalleRetencion(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesDetalleRetencion() ;
			
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
			this.empresadestinoLogic=new EmpresaLogic();
			this.cuentacontableLogic=new CuentaContableLogic();
			this.cuentacontablecreditoLogic=new CuentaContableLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				detalleretencionImplementable= (DetalleRetencionImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+DetalleRetencionConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				detalleretencionImplementableHome= (DetalleRetencionImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+DetalleRetencionConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.detalleretencions= new ArrayList<DetalleRetencion>();
			this.detalleretencionsEliminados= new ArrayList<DetalleRetencion>();
						
			this.isEsNuevoDetalleRetencion=false;
			this.esParaAccionDesdeFormularioDetalleRetencion=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			//BUSQUEDA INTERNA FK
			this.idCuentaContableActual=0L;
			this.idCuentaContableCreditoActual=0L;
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			this.empresadestinosForeignKey=new ArrayList<Empresa>() ;
			this.cuentacontablesForeignKey=new ArrayList<CuentaContable>() ;
			this.cuentacontablecreditosForeignKey=new ArrayList<CuentaContable>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyDetalleRetencion(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroDetalleRetencion();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.detalleretencionSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			DetalleRetencionBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=DetalleRetencionConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesDetalleRetencion("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingDetalleRetencion(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormDetalleRetencion!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioDetalleRetencion();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioDetalleRetencion();
			}
			
			DetalleRetencionBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasDetalleRetencion.getTabCount(); i++) {
					this.jTabbedPaneBusquedasDetalleRetencion.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasDetalleRetencion.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleretencionLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessDetalleRetencion(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga DetalleRetencion: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleretencionLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,DetalleRetencionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleretencionLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectDetalleRetencion() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesDetalleRetencion")) {
				iIndex=this.jInternalFrameDetalleFormDetalleRetencion.jTabbedPaneRelacionesDetalleRetencion.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormDetalleRetencion.jTabbedPaneRelacionesDetalleRetencion.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosDetalleRetencion.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessDetalleRetencion();	
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
	
	public void cargarCombosForeignKeyDetalleRetencion(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyDetalleRetencion(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyDetalleRetencion(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyDetalleRetencionListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyDetalleRetencion();
		
		this.cargarCombosFrameForeignKeyDetalleRetencion();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyDetalleRetencion();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyDetalleRetencion();
		}
	}
	
	

	public void cargarCombosForeignKeyEmpresaDestino(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyEmpresaDestinoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyEmpresaDestino();
				this.cargarCombosFrameEmpresaDestinosForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaEmpresaDestino(this.empresadestinosForeignKey);

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

	public void cargarCombosForeignKeyCuentaContableCredito(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyCuentaContableCreditoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyCuentaContableCredito();
				this.cargarCombosFrameCuentaContableCreditosForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaCuentaContableCredito(this.cuentacontablecreditosForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void jButtonNuevoDetalleRetencionActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.detalleretencionSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormDetalleRetencion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			DetalleRetencionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.detalleretencion,new Object(),this.detalleretencionParameterGeneral,this.detalleretencionReturnGeneral);
			
			
			if(jTableDatosDetalleRetencion.getRowCount()>=1) {
				jTableDatosDetalleRetencion.removeRowSelectionInterval(0, jTableDatosDetalleRetencion.getRowCount()-1);						
			}
			
			this.isEsNuevoDetalleRetencion=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoDetalleRetencion(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesDetalleRetencion(true);			
			//this.detalleretencion=new DetalleRetencion();
			//this.detalleretencion.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesDetalleRetencion(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualDetalleRetencion() ;
			
			if(DetalleRetencionJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleDetalleRetencion(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.detalleretencion);	
			this.actualizarInformacion("INFO_PADRE",false,this.detalleretencion);				
			
			DetalleRetencionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.detalleretencion,new Object(),this.detalleretencionParameterGeneral,this.detalleretencionReturnGeneral);
			
			if(this.detalleretencionSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar DetalleRetencion: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			DetalleRetencionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.detalleretencion,new Object(),this.detalleretencionParameterGeneral,this.detalleretencionReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,DetalleRetencionConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarDetalleRetencionActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<DetalleRetencion> detalleretencionsSeleccionados=new ArrayList<DetalleRetencion>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosDetalleRetencion.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosDetalleRetencion.getSelectedRows().length;			
			}
			
			detalleretencionsSeleccionados=this.getDetalleRetencionsSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoDetalleRetencion--;			
				//DetalleRetencion detalleretencionAux= new DetalleRetencion();			
				//detalleretencionAux.setId(this.iIdNuevoDetalleRetencion);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//DetalleRetencion detalleretencionOrigen=new DetalleRetencion();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(DetalleRetencion detalleretencionOrigen : detalleretencionsSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosDetalleRetencion.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							detalleretencionOrigen =(DetalleRetencion) this.detalleretencionLogic.getDetalleRetencions().toArray()[this.jTableDatosDetalleRetencion.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							detalleretencionOrigen =(DetalleRetencion) this.detalleretencions.toArray()[this.jTableDatosDetalleRetencion.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaDetalleRetencion();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.detalleretencion.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosDetalleRetencion(detalleretencionOrigen,this.detalleretencion,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleRetencion(this.detalleretencion);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.detalleretencionLogic.getDetalleRetencions().add(this.detalleretencionAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.detalleretencions.add(this.detalleretencionAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaDetalleRetencion(false);
				
				this.jTableDatosDetalleRetencion.setRowSelectionInterval(this.getIndiceNuevoDetalleRetencion(), this.getIndiceNuevoDetalleRetencion());
				
				int iLastRow =  this.jTableDatosDetalleRetencion.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosDetalleRetencion.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosDetalleRetencion.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaDetalleRetencion(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,DetalleRetencionConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarDetalleRetencionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<DetalleRetencion> detalleretencionsSeleccionados=new ArrayList<DetalleRetencion>();									
		
			DetalleRetencion detalleretencionOrigen=new DetalleRetencion();
			DetalleRetencion detalleretencionDestino=new DetalleRetencion();
				
			detalleretencionsSeleccionados=this.getDetalleRetencionsSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosDetalleRetencion.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || detalleretencionsSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosDetalleRetencion.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						detalleretencionOrigen =(DetalleRetencion) this.detalleretencionLogic.getDetalleRetencions().toArray()[this.jTableDatosDetalleRetencion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						detalleretencionOrigen =(DetalleRetencion) this.detalleretencions.toArray()[this.jTableDatosDetalleRetencion.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						detalleretencionDestino =(DetalleRetencion) this.detalleretencionLogic.getDetalleRetencions().toArray()[this.jTableDatosDetalleRetencion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						detalleretencionDestino =(DetalleRetencion) this.detalleretencions.toArray()[this.jTableDatosDetalleRetencion.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				detalleretencionOrigen =detalleretencionsSeleccionados.get(0);
				detalleretencionDestino =detalleretencionsSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosDetalleRetencion(detalleretencionOrigen,detalleretencionDestino,true,false);
				
				detalleretencionDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(detalleretencionDestino,detalleretencionLogic.getDetalleRetencions());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(detalleretencionDestino,detalleretencions);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaDetalleRetencion(false);
				
				//this.jTableDatosDetalleRetencion.setRowSelectionInterval(this.getIndiceNuevoDetalleRetencion(), this.getIndiceNuevoDetalleRetencion());
				
				int iLastRow =  this.jTableDatosDetalleRetencion.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosDetalleRetencion.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosDetalleRetencion.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaDetalleRetencion(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleRetencionConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormDetalleRetencionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormDetalleRetencion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormDetalleRetencion.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleRetencionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarDetalleRetencionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesDetalleRetencion.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasDetalleRetencion.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesDetalleRetencion.setVisible(!isVisible);
			this.jPanelPaginacionDetalleRetencion.setVisible(!isVisible);
			this.jPanelAccionesDetalleRetencion.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleRetencionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarDetalleRetencionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameDetalleRetencion();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleRetencionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoDetalleRetencionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoDetalleRetencion();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleRetencionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionDetalleRetencionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionDetalleRetencion();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleRetencionConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByDetalleRetencionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByDetalleRetencion();
			
			this.abrirFrameOrderByDetalleRetencion();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleRetencionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByDetalleRetencionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByDetalleRetencion();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleRetencionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleDetalleRetencion(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormDetalleRetencion);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormDetalleRetencion.isMaximum()) {
					this.jInternalFrameDetalleFormDetalleRetencion.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormDetalleRetencion.setSize(this.jInternalFrameDetalleFormDetalleRetencion.iWidthFormulario,this.jInternalFrameDetalleFormDetalleRetencion.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormDetalleRetencion.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormDetalleRetencion.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormDetalleRetencion.isMaximum()) {
						this.jInternalFrameDetalleFormDetalleRetencion.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormDetalleRetencion.jContentPaneDetalleDetalleRetencion.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormDetalleRetencion.jTabbedPaneRelacionesDetalleRetencion.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormDetalleRetencion.jContentPaneDetalleDetalleRetencion.getWidth(),DetalleRetencionConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormDetalleRetencion.jTabbedPaneRelacionesDetalleRetencion.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormDetalleRetencion.jContentPaneDetalleDetalleRetencion.getWidth(),DetalleRetencionConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormDetalleRetencion.jTabbedPaneRelacionesDetalleRetencion.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormDetalleRetencion.jContentPaneDetalleDetalleRetencion.getWidth(),DetalleRetencionConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormDetalleRetencion.setVisible(true);
	        this.jInternalFrameDetalleFormDetalleRetencion.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DetalleRetencionConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByDetalleRetencion() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByDetalleRetencion==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByDetalleRetencion=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByDetalleRetencion,false,this);
				} else {
					this.jInternalFrameOrderByDetalleRetencion=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByDetalleRetencion,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByDetalleRetencion);
				this.jInternalFrameOrderByDetalleRetencion.setVisible(false);
				this.jInternalFrameOrderByDetalleRetencion.setSelected(false);
				
				this.jInternalFrameOrderByDetalleRetencion.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByDetalleRetencion"));
				
				this.inicializarActualizarBindingTablaOrderByDetalleRetencion();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionDetalleRetencion() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionDetalleRetencion==null) {
				
				this.jInternalFrameImportacionDetalleRetencion=new ImportacionJInternalFrame(DetalleRetencionConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionDetalleRetencion);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionDetalleRetencion);
				this.jInternalFrameImportacionDetalleRetencion.setVisible(false);
				this.jInternalFrameImportacionDetalleRetencion.setSelected(false);


				this.jInternalFrameImportacionDetalleRetencion.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionDetalleRetencion"));
				this.jInternalFrameImportacionDetalleRetencion.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionDetalleRetencion"));
				this.jInternalFrameImportacionDetalleRetencion.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionDetalleRetencion"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoDetalleRetencion() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoDetalleRetencion==null) {
				this.jInternalFrameReporteDinamicoDetalleRetencion=new ReporteDinamicoJInternalFrame(DetalleRetencionConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoDetalleRetencion);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoDetalleRetencion);
				this.jInternalFrameReporteDinamicoDetalleRetencion.setVisible(false);
				this.jInternalFrameReporteDinamicoDetalleRetencion.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoDetalleRetencion.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoDetalleRetencion"));
				this.jInternalFrameReporteDinamicoDetalleRetencion.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoDetalleRetencion"));
				this.jInternalFrameReporteDinamicoDetalleRetencion.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoDetalleRetencion"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualDetalleRetencion();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleDetalleRetencion() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormDetalleRetencion);
			
	       	this.jInternalFrameDetalleFormDetalleRetencion.setVisible(false);
	        this.jInternalFrameDetalleFormDetalleRetencion.setSelected(false);
			
			//this.jInternalFrameDetalleFormDetalleRetencion.dispose();
			//this.jInternalFrameDetalleFormDetalleRetencion=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DetalleRetencionConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoDetalleRetencion() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoDetalleRetencion.setVisible(true);
	        this.jInternalFrameReporteDinamicoDetalleRetencion.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DetalleRetencionConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionDetalleRetencion() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionDetalleRetencion.setVisible(true);
	        this.jInternalFrameImportacionDetalleRetencion.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DetalleRetencionConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByDetalleRetencion() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByDetalleRetencion.setVisible(true);
	        this.jInternalFrameOrderByDetalleRetencion.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DetalleRetencionConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByDetalleRetencion() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByDetalleRetencion.setVisible(false);
	        this.jInternalFrameOrderByDetalleRetencion.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DetalleRetencionConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoDetalleRetencion() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoDetalleRetencion.setVisible(false);
	        this.jInternalFrameReporteDinamicoDetalleRetencion.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DetalleRetencionConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionDetalleRetencion() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionDetalleRetencion.setVisible(false);
	        this.jInternalFrameImportacionDetalleRetencion.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DetalleRetencionConstantesFunciones.CLASSNAME);
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
						TitledBorder titledBorderDetalleRetencion=(TitledBorder)this.jScrollPanelDatosDetalleRetencion.getBorder();
						TitledBorder titledBorderCuentaContable=(TitledBorder)cuentacontableBeanSwingJInternalFrame.jScrollPanelDatosCuentaContable.getBorder();

						titledBorderCuentaContable.setTitle(titledBorderDetalleRetencion.getTitle() + " -> Cuenta Contable");


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

				public void abrirFrameTreeCuentaContableCredito(String sTipoProceso) { //throws Exception
					try {
						//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
						//this.jDesktopPane.add(jInternalFrameTreeCuentaContable);
						CuentaContableBeanSwingJInternalFrame cuentacontableBeanSwingJInternalFrame=new CuentaContableBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.BUSQUEDA,false,false,false,true);
						cuentacontableBeanSwingJInternalFrame.setJInternalFrameParent(this);
						cuentacontableBeanSwingJInternalFrame.jInternalFrameTreeCuentaContable.setsTipoProceso(sTipoProceso);

						if(sTipoProceso.equals("BUSQUEDA_FK")) {
							cuentacontableBeanSwingJInternalFrame.jInternalFrameTreeCuentaContable.sTipoBusqueda="CuentaContableCredito";
						}

						cuentacontableBeanSwingJInternalFrame.getTodosCuentaContableArbol();
						cuentacontableBeanSwingJInternalFrame.jInternalFrameTreeCuentaContable.setCuentaContables(cuentacontableBeanSwingJInternalFrame.cuentacontablesArbol);
						cuentacontableBeanSwingJInternalFrame.jInternalFrameTreeCuentaContable.CargarTreeCuentaContable();
						cuentacontableBeanSwingJInternalFrame.jInternalFrameTreeCuentaContable.setVisible(true);
						cuentacontableBeanSwingJInternalFrame.jInternalFrameTreeCuentaContable.setSelected(true);

						//SE CAMBIA PARENT ORIGINAL PARA QUE RETORNE EN ESTE FORMULARIO
						cuentacontableBeanSwingJInternalFrame.jInternalFrameTreeCuentaContable.jInternalFrameParent=this;
						TitledBorder titledBorderDetalleRetencion=(TitledBorder)this.jScrollPanelDatosDetalleRetencion.getBorder();
						TitledBorder titledBorderCuentaContableCredito=(TitledBorder)cuentacontableBeanSwingJInternalFrame.jScrollPanelDatosCuentaContable.getBorder();

						titledBorderCuentaContableCredito.setTitle(titledBorderDetalleRetencion.getTitle() + " -> Cuenta Contable");


						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,cuentacontableBeanSwingJInternalFrame);
						}
						this.jDesktopPane.add(cuentacontableBeanSwingJInternalFrame);

					} catch (Exception e) {
						e.getStackTrace();
						//Funciones<%=getFrameworkDomain()%>.manageException(this, e,logger,<%=GetNombreClaseC(TablaBase.ToString())%>ConstantesFunciones.CLASSNAME);
					}
				}

				public void cerrarFrameTreeCuentaContableCredito(CuentaContableBeanSwingJInternalFrame jInternalFrameTreeCuentaContable) throws Exception {
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
	
	public void jButtonModificarDetalleRetencionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarDetalleRetencion(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleRetencionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarDetalleRetencion(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosDetalleRetencion.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesDetalleRetencion(true);
			//this.isEsNuevoDetalleRetencion=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleretencion =(DetalleRetencion) this.detalleretencionLogic.getDetalleRetencions().toArray()[this.jTableDatosDetalleRetencion.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.detalleretencion =(DetalleRetencion) this.detalleretencions.toArray()[this.jTableDatosDetalleRetencion.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesDetalleRetencion("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesDetalleRetencion(false) ;
			
			if(detalleretencionSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(DetalleRetencionJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleDetalleRetencion(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualDetalleRetencion(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleRetencionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaDetalleRetencionActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosDetalleRetencion.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleretencion =(DetalleRetencion) this.detalleretencionLogic.getDetalleRetencions().toArray()[this.jTableDatosDetalleRetencion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.detalleretencion =(DetalleRetencion) this.detalleretencions.toArray()[this.jTableDatosDetalleRetencion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleRetencionConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarDetalleRetencion(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormDetalleRetencion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosDetalleRetencion.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesDetalleRetencion(true);
			//this.isEsNuevoDetalleRetencion=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleretencion =(DetalleRetencion) this.detalleretencionLogic.getDetalleRetencions().toArray()[this.jTableDatosDetalleRetencion.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.detalleretencion =(DetalleRetencion) this.detalleretencions.toArray()[this.jTableDatosDetalleRetencion.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.detalleretencion.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesDetalleRetencion("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesDetalleRetencion(false) ;
			
			if(DetalleRetencionJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleDetalleRetencion(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualDetalleRetencion(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleRetencionConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
			
			if(sType.equals("CuentaContable")) {
				if(!this.detalleretencionConstantesFunciones.cargarid_cuenta_contableDetalleRetencion) {
					this.cargarCombosCuentaContablesForeignKeyLista(" where id="+id);
					//this.inicializarActualizarBindingDetalleRetencion(false,false);
					this.cargarCombosFrameCuentaContablesForeignKey("Todos");
				}

				this.setCombosCodigoDesdeBusquedaid_cuenta_contable (id);

				this.recargarComboTablaCuentaContable(this.cuentacontablesForeignKey);

			}
			
			if(sType.equals("CuentaContableCredito")) {
				if(!this.detalleretencionConstantesFunciones.cargarid_cuenta_contable_creditoDetalleRetencion) {
					this.cargarCombosCuentaContableCreditosForeignKeyLista(" where id="+id);
					//this.inicializarActualizarBindingDetalleRetencion(false,false);
					this.cargarCombosFrameCuentaContableCreditosForeignKey("Todos");
				}

				this.setCombosCodigoDesdeBusquedaid_cuenta_contable_credito (id);

				this.recargarComboTablaCuentaContableCredito(this.cuentacontablecreditosForeignKey);

			}
		} catch(Exception e) {
			throw e;
		}
	}
	
		
	
	public void recargarComboTablaEmpresaDestino(List<Empresa> empresadestinosForeignKey)throws Exception{
		TableColumn tableColumnEmpresaDestino=this.jTableDatosDetalleRetencion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetalleRetencion,DetalleRetencionConstantesFunciones.LABEL_IDEMPRESADESTINO));
		TableCellEditor tableCellEditorEmpresaDestino =tableColumnEmpresaDestino.getCellEditor();

		EmpresaTableCell empresaTableCellFk=(EmpresaTableCell)tableCellEditorEmpresaDestino;

		if(empresaTableCellFk!=null) {
			empresaTableCellFk.setempresasForeignKey(empresadestinosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosDetalleRetencion.getSelectedRow();

		//if(intSelectedRow<=0) {
			//empresaTableCellFk.setRowActual(intSelectedRow);
			//empresaTableCellFk.setempresasForeignKeyActual(empresadestinosForeignKey);
		//}


		if(empresaTableCellFk!=null) {
			empresaTableCellFk.RecargarEmpresasForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaCuentaContable(List<CuentaContable> cuentacontablesForeignKey)throws Exception{
		TableColumn tableColumnCuentaContable=this.jTableDatosDetalleRetencion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetalleRetencion,DetalleRetencionConstantesFunciones.LABEL_IDCUENTACONTABLE));
		TableCellEditor tableCellEditorCuentaContable =tableColumnCuentaContable.getCellEditor();

		CuentaContableTableCell cuentacontableTableCellFk=(CuentaContableTableCell)tableCellEditorCuentaContable;

		if(cuentacontableTableCellFk!=null) {
			cuentacontableTableCellFk.setcuentacontablesForeignKey(cuentacontablesForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosDetalleRetencion.getSelectedRow();

		//if(intSelectedRow<=0) {
			//cuentacontableTableCellFk.setRowActual(intSelectedRow);
			//cuentacontableTableCellFk.setcuentacontablesForeignKeyActual(cuentacontablesForeignKey);
		//}


		if(cuentacontableTableCellFk!=null) {
			cuentacontableTableCellFk.RecargarCuentaContablesForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaCuentaContableCredito(List<CuentaContable> cuentacontablecreditosForeignKey)throws Exception{
		TableColumn tableColumnCuentaContableCredito=this.jTableDatosDetalleRetencion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetalleRetencion,DetalleRetencionConstantesFunciones.LABEL_IDCUENTACONTABLECREDITO));
		TableCellEditor tableCellEditorCuentaContableCredito =tableColumnCuentaContableCredito.getCellEditor();

		CuentaContableTableCell cuentacontableTableCellFk=(CuentaContableTableCell)tableCellEditorCuentaContableCredito;

		if(cuentacontableTableCellFk!=null) {
			cuentacontableTableCellFk.setcuentacontablesForeignKey(cuentacontablecreditosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosDetalleRetencion.getSelectedRow();

		//if(intSelectedRow<=0) {
			//cuentacontableTableCellFk.setRowActual(intSelectedRow);
			//cuentacontableTableCellFk.setcuentacontablesForeignKeyActual(cuentacontablecreditosForeignKey);
		//}


		if(cuentacontableTableCellFk!=null) {
			cuentacontableTableCellFk.RecargarCuentaContablesForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	

	public void setCombosCodigoDesdeBusquedaid_cuenta_contable (Long id) throws Exception {
		this.setActualCuentaContableForeignKey(id,true,"Todos");

	};
	

	public void setCombosCodigoDesdeBusquedaid_cuenta_contable_credito (Long id) throws Exception {
		this.setActualCuentaContableCreditoForeignKey(id,true,"Todos");

	};
	
	public void jButtonActualizarDetalleRetencionActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleretencionLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesDetalleRetencion(false);
			
			//if(!this.isEsNuevoDetalleRetencion) {								
				int intSelectedRow = this.jTableDatosDetalleRetencion.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleretencion =(DetalleRetencion) this.detalleretencionLogic.getDetalleRetencions().toArray()[this.jTableDatosDetalleRetencion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.detalleretencion =(DetalleRetencion) this.detalleretencions.toArray()[this.jTableDatosDetalleRetencion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(DetalleRetencionJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualDetalleRetencion(this.detalleretencion,true);
				this.setVariablesFormularioToObjetoActualForeignKeysDetalleRetencion(this.detalleretencion);
				
			}
			
			if(this.permiteMantenimiento(this.detalleretencion)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.detalleretencionSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoDetalleRetencion=true;
					this.inicializarActualizarBindingTablaDetalleRetencion(false);
					this.isEsNuevoDetalleRetencion=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoDetalleRetencion=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoDetalleRetencion=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesDetalleRetencion(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualDetalleRetencion(false);
				
				this.habilitarDeshabilitarControlesDetalleRetencion(false);
			
												
				
				if(DetalleRetencionJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleDetalleRetencion();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoDetalleRetencionActionPerformed(evt,detalleretencionSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualDetalleRetencion(this.detalleretencion,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosDetalleRetencion.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,detalleretencionSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleretencionLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.detalleretencion.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(DetalleRetencion.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DetalleRetencion.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleretencionLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,DetalleRetencionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleretencionLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarDetalleRetencionActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleretencionLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosDetalleRetencion.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleretencion =(DetalleRetencion) this.detalleretencionLogic.getDetalleRetencions().toArray()[this.jTableDatosDetalleRetencion.convertRowIndexToModel(intSelectedRow)];
				this.detalleretencion.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.detalleretencion =(DetalleRetencion) this.detalleretencions.toArray()[this.jTableDatosDetalleRetencion.convertRowIndexToModel(intSelectedRow)];
				this.detalleretencion.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.detalleretencion)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.detalleretencionSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((DetalleRetencionModel) this.jTableDatosDetalleRetencion.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoDetalleRetencion=true;
				this.inicializarActualizarBindingTablaDetalleRetencion(false);
				this.isEsNuevoDetalleRetencion=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesDetalleRetencion(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualDetalleRetencion(false);
				
				this.habilitarDeshabilitarControlesDetalleRetencion(false);
				
				
				
				if(DetalleRetencionJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleDetalleRetencion();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleretencionLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleretencionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DetalleRetencionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleretencionLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarDetalleRetencionActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosDetalleRetencion.getRowCount()>=1) {
				jTableDatosDetalleRetencion.removeRowSelectionInterval(0, jTableDatosDetalleRetencion.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesDetalleRetencion(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaDetalleRetencion(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesDetalleRetencion(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualDetalleRetencion(false) ;
			
			this.isEsNuevoDetalleRetencion=false;
			
			if(DetalleRetencionJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleDetalleRetencion();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleRetencionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosDetalleRetencionActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleretencionLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingDetalleRetencion(false);
				
				//SI ES MANUAL
				if(DetalleRetencionJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualDetalleRetencion();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleretencionLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleretencionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DetalleRetencionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleretencionLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosDetalleRetencionActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoDetalleRetencion--;			
			//DetalleRetencion detalleretencionAux= new DetalleRetencion();			
			//detalleretencionAux.setId(this.iIdNuevoDetalleRetencion);
			
			if(this.jInternalFrameDetalleFormDetalleRetencion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaDetalleRetencion();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysDetalleRetencion(this.detalleretencion);
			
			this.detalleretencion.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.detalleretencionLogic.getDetalleRetencions().add(this.detalleretencionAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.detalleretencions.add(this.detalleretencionAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaDetalleRetencion(false);
			
			this.jTableDatosDetalleRetencion.setRowSelectionInterval(this.getIndiceNuevoDetalleRetencion(), this.getIndiceNuevoDetalleRetencion());
			
			int iLastRow =  this.jTableDatosDetalleRetencion.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosDetalleRetencion.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosDetalleRetencion.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaDetalleRetencion(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,DetalleRetencionConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionDetalleRetencionActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleretencionLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingDetalleRetencion(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingDetalleRetencion(false);
			
			//SI ES MANUAL
			if(DetalleRetencionJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualDetalleRetencion();
			}
			
			//this.abrirFrameTreeDetalleRetencion();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleretencionLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleretencionLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,DetalleRetencionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleretencionLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionDetalleRetencionActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Detalle RetencionES ?", "MANTENIMIENTO DE Detalle Retencion", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionDetalleRetencion.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralDetalleRetencion();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.detalleretencionReturnGeneral=detalleretencionLogic.procesarImportacionDetalleRetencionsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.detalleretencionParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarDetalleRetencionReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleRetencionConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionDetalleRetencionActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionDetalleRetencion.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionDetalleRetencion.setFileImportacion(this.jInternalFrameImportacionDetalleRetencion.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionDetalleRetencion.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionDetalleRetencion.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionDetalleRetencion.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionDetalleRetencion.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleRetencionConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoDetalleRetencionActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<DetalleRetencion> detalleretencionsSeleccionados=new ArrayList<DetalleRetencion>();		

		detalleretencionsSeleccionados=this.getDetalleRetencionsSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoDetalleRetencion.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoDetalleRetencion.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("DetalleRetencionBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"DetalleRetencionBaseDesign.jrxml";
			
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
			
			this.generarReporteDetalleRetencions("Todos",detalleretencionsSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.detalleretencionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Detalle Retencion",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleRetencionConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoDetalleRetencion.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoDetalleRetencion.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case DetalleRetencionConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DetalleRetencionConstantesFunciones.LABEL_IDEMPRESADESTINO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_EmpresaDestino_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_EmpresaDestino_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_EmpresaDestino_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_EmpresaDestino_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DetalleRetencionConstantesFunciones.LABEL_IDCUENTACONTABLE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_CuentaContable_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_CuentaContable_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_CuentaContable_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_CuentaContable_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DetalleRetencionConstantesFunciones.LABEL_IDCUENTACONTABLECREDITO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_CuentaContableCredito_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_CuentaContableCredito_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_CuentaContableCredito_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_CuentaContableCredito_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DetalleRetencionConstantesFunciones.LABEL_DESCRIPCION:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_scripcion_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_scripcion_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_scripcion_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_scripcion_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DetalleRetencionConstantesFunciones.LABEL_PORCENTAJE:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_rcentaje_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_rcentaje_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_rcentaje_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_rcentaje_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DetalleRetencionConstantesFunciones.LABEL_MONTOMINIMO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_ntoMinimo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_ntoMinimo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_ntoMinimo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_ntoMinimo_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoDetalleRetencion.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoDetalleRetencion.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoDetalleRetencion.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case DetalleRetencionConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case DetalleRetencionConstantesFunciones.LABEL_IDEMPRESADESTINO:
					sNombreCampoCategoria="id_empresa_destino";
					break;

				case DetalleRetencionConstantesFunciones.LABEL_IDCUENTACONTABLE:
					sNombreCampoCategoria="id_cuenta_contable";
					break;

				case DetalleRetencionConstantesFunciones.LABEL_IDCUENTACONTABLECREDITO:
					sNombreCampoCategoria="id_cuenta_contable_credito";
					break;

				case DetalleRetencionConstantesFunciones.LABEL_DESCRIPCION:
					sNombreCampoCategoria="descripcion";
					break;

				case DetalleRetencionConstantesFunciones.LABEL_PORCENTAJE:
					sNombreCampoCategoria="porcentaje";
					break;

				case DetalleRetencionConstantesFunciones.LABEL_MONTOMINIMO:
					sNombreCampoCategoria="monto_minimo";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoDetalleRetencion.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case DetalleRetencionConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case DetalleRetencionConstantesFunciones.LABEL_IDEMPRESADESTINO:
					sNombreCampoCategoriaValor="id_empresa_destino";
					break;

				case DetalleRetencionConstantesFunciones.LABEL_IDCUENTACONTABLE:
					sNombreCampoCategoriaValor="id_cuenta_contable";
					break;

				case DetalleRetencionConstantesFunciones.LABEL_IDCUENTACONTABLECREDITO:
					sNombreCampoCategoriaValor="id_cuenta_contable_credito";
					break;

				case DetalleRetencionConstantesFunciones.LABEL_DESCRIPCION:
					sNombreCampoCategoriaValor="descripcion";
					break;

				case DetalleRetencionConstantesFunciones.LABEL_PORCENTAJE:
					sNombreCampoCategoriaValor="porcentaje";
					break;

				case DetalleRetencionConstantesFunciones.LABEL_MONTOMINIMO:
					sNombreCampoCategoriaValor="monto_minimo";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoDetalleRetencion.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoDetalleRetencion.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case DetalleRetencionConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case DetalleRetencionConstantesFunciones.LABEL_IDEMPRESADESTINO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa Destino",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa_destino");
					break;

				case DetalleRetencionConstantesFunciones.LABEL_IDCUENTACONTABLE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Cuenta Contable",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_cuenta_contable");
					break;

				case DetalleRetencionConstantesFunciones.LABEL_IDCUENTACONTABLECREDITO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Cuenta Contable Credito",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_cuenta_contable_credito");
					break;

				case DetalleRetencionConstantesFunciones.LABEL_DESCRIPCION:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Descripcion",sNombreCampoCategoria,sNombreCampoCategoriaValor,"descripcion");
					break;

				case DetalleRetencionConstantesFunciones.LABEL_PORCENTAJE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Porcentaje",sNombreCampoCategoria,sNombreCampoCategoriaValor,"porcentaje");
					break;

				case DetalleRetencionConstantesFunciones.LABEL_MONTOMINIMO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Monto Minimo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"monto_minimo");
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
	
	public void jButtonGenerarExcelReporteDinamicoDetalleRetencionActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<DetalleRetencion> detalleretencionsSeleccionados=new ArrayList<DetalleRetencion>();		
		
		detalleretencionsSeleccionados=this.getDetalleRetencionsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"detalleretencion";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("DetalleRetencions");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoDetalleRetencion.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoDetalleRetencion.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case DetalleRetencionConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DetalleRetencionConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(DetalleRetencion detalleretencion:detalleretencionsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(detalleretencion.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DetalleRetencionConstantesFunciones.LABEL_IDEMPRESADESTINO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DetalleRetencionConstantesFunciones.LABEL_IDEMPRESADESTINO);
					iRow++;

					for(DetalleRetencion detalleretencion:detalleretencionsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(detalleretencion.getempresadestino_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DetalleRetencionConstantesFunciones.LABEL_IDCUENTACONTABLE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DetalleRetencionConstantesFunciones.LABEL_IDCUENTACONTABLE);
					iRow++;

					for(DetalleRetencion detalleretencion:detalleretencionsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(detalleretencion.getcuentacontable_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DetalleRetencionConstantesFunciones.LABEL_IDCUENTACONTABLECREDITO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DetalleRetencionConstantesFunciones.LABEL_IDCUENTACONTABLECREDITO);
					iRow++;

					for(DetalleRetencion detalleretencion:detalleretencionsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(detalleretencion.getcuentacontablecredito_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DetalleRetencionConstantesFunciones.LABEL_DESCRIPCION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DetalleRetencionConstantesFunciones.LABEL_DESCRIPCION);
					iRow++;

					for(DetalleRetencion detalleretencion:detalleretencionsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(detalleretencion.getdescripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DetalleRetencionConstantesFunciones.LABEL_PORCENTAJE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DetalleRetencionConstantesFunciones.LABEL_PORCENTAJE);
					iRow++;

					for(DetalleRetencion detalleretencion:detalleretencionsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(detalleretencion.getporcentaje());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DetalleRetencionConstantesFunciones.LABEL_MONTOMINIMO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DetalleRetencionConstantesFunciones.LABEL_MONTOMINIMO);
					iRow++;

					for(DetalleRetencion detalleretencion:detalleretencionsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(detalleretencion.getmonto_minimo());
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
			//	this.getFilaCabeceraExportarExcelDetalleRetencion(row);				
			//	iRow++;
			//}				
			
			//for(DetalleRetencion detalleretencionAux:detalleretencionsSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelDetalleRetencion(detalleretencionAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.detalleretencionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Detalle Retencion",JOptionPane.INFORMATION_MESSAGE);
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
				this.detalleretencionLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingDetalleRetencion(false);
			
			//SI ES MANUAL
			if(DetalleRetencionJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualDetalleRetencion();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleretencionLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleretencionLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleretencionLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresDetalleRetencionActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleretencionLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingDetalleRetencion(false);
			
			//SI ES MANUAL
			if(DetalleRetencionJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualDetalleRetencion();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleretencionLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleretencionLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,DetalleRetencionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleretencionLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesDetalleRetencionActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleretencionLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingDetalleRetencion(false);
			
			//SI ES MANUAL
			if(DetalleRetencionJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualDetalleRetencion();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleretencionLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleretencionLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,DetalleRetencionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleretencionLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaDetalleRetencion() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosDetalleRetencion.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosDetalleRetencion.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosDetalleRetencion.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosDetalleRetencion.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosDetalleRetencion.setMinimumSize(dimensionMinimum);
		this.jTableDatosDetalleRetencion.setMaximumSize(dimensionMaximum);
		this.jTableDatosDetalleRetencion.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingDetalleRetencion(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingDetalleRetencion(esInicializar,true);
	}
	
	public void inicializarActualizarBindingDetalleRetencion(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaDetalleRetencion(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesDetalleRetencion(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.detalleretencionSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasDetalleRetencion(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesDetalleRetencion(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesDetalleRetencion(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !DetalleRetencionJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!DetalleRetencionJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualDetalleRetencion() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaDetalleRetencion();
		
		this.inicializarActualizarBindingBotonesManualDetalleRetencion(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.detalleretencionSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualDetalleRetencion();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesDetalleRetencion() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualDetalleRetencion(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualDetalleRetencion(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosDetalleRetencion.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosDetalleRetencion.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteDetalleRetencion.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormDetalleRetencion!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormDetalleRetencion.jCheckBoxPostAccionNuevoDetalleRetencion.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormDetalleRetencion.jCheckBoxPostAccionSinCerrarDetalleRetencion.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormDetalleRetencion.jCheckBoxPostAccionSinMensajeDetalleRetencion.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosDetalleRetencion.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosDetalleRetencion.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteDetalleRetencion.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormDetalleRetencion!=null) {
				this.jInternalFrameDetalleFormDetalleRetencion.jCheckBoxPostAccionNuevoDetalleRetencion.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormDetalleRetencion.jCheckBoxPostAccionSinCerrarDetalleRetencion.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormDetalleRetencion.jCheckBoxPostAccionSinMensajeDetalleRetencion.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionDetalleRetencion.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionDetalleRetencion.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormDetalleRetencion!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormDetalleRetencion.jComboBoxTiposAccionesFormularioDetalleRetencion.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesDetalleRetencion.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoDetalleRetencion!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoDetalleRetencion.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesDetalleRetencion.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesDetalleRetencion.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarDetalleRetencion.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesDetalleRetencion.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoDetalleRetencion!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoDetalleRetencion.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesDetalleRetencion.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralDetalleRetencion.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesDetalleRetencion(Boolean esInicializar) throws Exception {
		try	{	
			if(DetalleRetencionJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualDetalleRetencion(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesDetalleRetencion() throws Exception {
		try	{
			if(DetalleRetencionJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualDetalleRetencion();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleDetalleRetencion() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormDetalleRetencion.jComboBoxTiposAccionesFormularioDetalleRetencion.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormDetalleRetencion.jComboBoxTiposAccionesFormularioDetalleRetencion.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualDetalleRetencion() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesDetalleRetencion.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesDetalleRetencion.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesDetalleRetencion.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesDetalleRetencion.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesDetalleRetencion.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesDetalleRetencion.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionDetalleRetencion.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionDetalleRetencion.addItem(reporte);
			}
			
			
			if(!this.detalleretencionSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionDetalleRetencion.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionDetalleRetencion.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesDetalleRetencion.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesDetalleRetencion.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesDetalleRetencion.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesDetalleRetencion.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormDetalleRetencion!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormDetalleRetencion.jComboBoxTiposAccionesFormularioDetalleRetencion.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormDetalleRetencion.jComboBoxTiposAccionesFormularioDetalleRetencion.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarDetalleRetencion.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarDetalleRetencion.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarDetalleRetencion.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualDetalleRetencion();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualDetalleRetencion() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoDetalleRetencion!=null) {
				this.jInternalFrameReporteDinamicoDetalleRetencion.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoDetalleRetencion.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoDetalleRetencion!=null) {
				this.jInternalFrameReporteDinamicoDetalleRetencion.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoDetalleRetencion.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoDetalleRetencion!=null) {
				
				if(this.jInternalFrameReporteDinamicoDetalleRetencion.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoDetalleRetencion.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoDetalleRetencion.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoDetalleRetencion.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoDetalleRetencion.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoDetalleRetencion.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
				
				//TIPOS COLUMNAS CATEGORIA DINAMICO
				if(this.jInternalFrameReporteDinamicoDetalleRetencion.getjComboBoxColumnaCategoriaGrafico()!=null) {
					this.jInternalFrameReporteDinamicoDetalleRetencion.getjComboBoxColumnaCategoriaGrafico().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoria=DetalleRetencionConstantesFunciones.getTiposSeleccionarDetalleRetencion(true,true,false,true,true);
						
					for(Reporte reporte:tiposColumnasCategoria) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoDetalleRetencion.getjComboBoxColumnaCategoriaGrafico().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS CATEGORIA VALOR DINAMICO
				if(this.jInternalFrameReporteDinamicoDetalleRetencion.getjComboBoxColumnaCategoriaValor()!=null) {
					this.jInternalFrameReporteDinamicoDetalleRetencion.getjComboBoxColumnaCategoriaValor().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoriaValor=DetalleRetencionConstantesFunciones.getTiposSeleccionarDetalleRetencion(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasCategoriaValor) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoDetalleRetencion.getjComboBoxColumnaCategoriaValor().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS VALOR
				defaultListModel=new DefaultListModel<Reporte>();
					
				if(this.jInternalFrameReporteDinamicoDetalleRetencion.getjListColumnasValoresGrafico()!=null) {
					this.jInternalFrameReporteDinamicoDetalleRetencion.getjListColumnasValoresGrafico().removeAll();
						
					ArrayList<Reporte> tiposColumnasValor=DetalleRetencionConstantesFunciones.getTiposSeleccionarDetalleRetencion(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasValor) {//this.tiposSeleccionar
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoDetalleRetencion.getjListColumnasValoresGrafico().setModel(defaultListModel);									
						
				}
					
				//TIPOS GRAFICOS REPORTES DINAMICOS
				if(this.jInternalFrameReporteDinamicoDetalleRetencion.getjComboBoxTiposGraficosReportesDinamico()!=null) {
					this.jInternalFrameReporteDinamicoDetalleRetencion.getjComboBoxTiposGraficosReportesDinamico().removeAllItems();
						
					for(Reporte reporte:this.tiposGraficosReportes) {
						this.jInternalFrameReporteDinamicoDetalleRetencion.getjComboBoxTiposGraficosReportesDinamico().addItem(reporte);
					}
					
				}
			
			
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualDetalleRetencion()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_cuenta_contableFK_IdCuentaContableDetalleRetencion.getSelectedItem()!=null){this.id_cuenta_contableFK_IdCuentaContable=((CuentaContable)this.jComboBoxid_cuenta_contableFK_IdCuentaContableDetalleRetencion.getSelectedItem()).getId();}
		if(this.jComboBoxid_cuenta_contable_creditoFK_IdCuentaContableCreditoDetalleRetencion.getSelectedItem()!=null){this.id_cuenta_contable_creditoFK_IdCuentaContableCredito=((CuentaContable)this.jComboBoxid_cuenta_contable_creditoFK_IdCuentaContableCreditoDetalleRetencion.getSelectedItem()).getId();}
		if(this.jComboBoxid_empresa_destinoFK_IdDetalleRetencionDetalleRetencion.getSelectedItem()!=null){this.id_empresa_destinoFK_IdDetalleRetencion=((Empresa)this.jComboBoxid_empresa_destinoFK_IdDetalleRetencionDetalleRetencion.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasDetalleRetencion(Boolean esInicializar) throws Exception {				
		if(DetalleRetencionJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualDetalleRetencion();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaDetalleRetencion() throws Exception {
		this.inicializarActualizarBindingTablaDetalleRetencion(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByDetalleRetencion() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByDetalleRetencion.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByDetalleRetencion.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByDetalleRetencion.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new DetalleRetencionPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByDetalleRetencion.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByDetalleRetencion.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new DetalleRetencionPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosDetalleRetencionOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetalleRetencionOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new DetalleRetencionPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByDetalleRetencion.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByDetalleRetencion.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new DetalleRetencionPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByDetalleRetencion.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaDetalleRetencion(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=detalleretencionLogic.getDetalleRetencions().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=detalleretencions.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(DetalleRetencionJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosDetalleRetencion.setModel(new DetalleRetencionModel(this.detalleretencionLogic.getDetalleRetencions(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosDetalleRetencion.setModel(new DetalleRetencionModel(this.detalleretencions,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByDetalleRetencion!=null && this.jInternalFrameOrderByDetalleRetencion.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByDetalleRetencion();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosDetalleRetencion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetalleRetencion,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new DetalleRetencionPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+DetalleRetencionConstantesFunciones.SCLASSWEBTITULO,detalleretencionConstantesFunciones.resaltarSeleccionarDetalleRetencion,iSizeTabla,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+DetalleRetencionConstantesFunciones.SCLASSWEBTITULO,detalleretencionConstantesFunciones.resaltarSeleccionarDetalleRetencion,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosDetalleRetencion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetalleRetencion,DetalleRetencionConstantesFunciones.LABEL_ID));

		if(this.detalleretencionConstantesFunciones.mostraridDetalleRetencion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DetalleRetencionConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.detalleretencionConstantesFunciones.resaltaridDetalleRetencion,this.detalleretencionConstantesFunciones.activaridDetalleRetencion,iSizeTabla,this,true,"idDetalleRetencion","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.detalleretencionConstantesFunciones.resaltaridDetalleRetencion,this.detalleretencionConstantesFunciones.activaridDetalleRetencion,this,true,"idDetalleRetencion","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDetalleRetencion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetalleRetencion,DetalleRetencionConstantesFunciones.LABEL_IDEMPRESA));

		if(this.detalleretencionConstantesFunciones.mostrarid_empresaDetalleRetencion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DetalleRetencionConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.detalleretencionConstantesFunciones.resaltarid_empresaDetalleRetencion,this,this.detalleretencionConstantesFunciones.activarid_empresaDetalleRetencion,iSizeTabla));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.detalleretencionConstantesFunciones.resaltarid_empresaDetalleRetencion,this,this.detalleretencionConstantesFunciones.activarid_empresaDetalleRetencion,false,"id_empresaDetalleRetencion","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new DetalleRetencionPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDetalleRetencion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetalleRetencion,DetalleRetencionConstantesFunciones.LABEL_IDEMPRESADESTINO));

		if(this.detalleretencionConstantesFunciones.mostrarid_empresa_destinoDetalleRetencion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DetalleRetencionConstantesFunciones.LABEL_IDEMPRESADESTINO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresadestinosForeignKey,this.detalleretencionConstantesFunciones.resaltarid_empresa_destinoDetalleRetencion,this,this.detalleretencionConstantesFunciones.activarid_empresa_destinoDetalleRetencion,iSizeTabla));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresadestinosForeignKey,this.detalleretencionConstantesFunciones.resaltarid_empresa_destinoDetalleRetencion,this,this.detalleretencionConstantesFunciones.activarid_empresa_destinoDetalleRetencion,true,"id_empresa_destinoDetalleRetencion","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new DetalleRetencionPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDetalleRetencion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetalleRetencion,DetalleRetencionConstantesFunciones.LABEL_IDCUENTACONTABLE));

		if(this.detalleretencionConstantesFunciones.mostrarid_cuenta_contableDetalleRetencion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DetalleRetencionConstantesFunciones.LABEL_IDCUENTACONTABLE,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new CuentaContableTableCell(this.cuentacontablesForeignKey,this.detalleretencionConstantesFunciones.resaltarid_cuenta_contableDetalleRetencion,this,this.detalleretencionConstantesFunciones.activarid_cuenta_contableDetalleRetencion,iSizeTabla));
			tableColumn.setCellEditor(new CuentaContableTableCell(this.cuentacontablesForeignKey,this.detalleretencionConstantesFunciones.resaltarid_cuenta_contableDetalleRetencion,this,this.detalleretencionConstantesFunciones.activarid_cuenta_contableDetalleRetencion,true,"id_cuenta_contableDetalleRetencion","CON_BUSQUEDA"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70);
			//tableColumn.addPropertyChangeListener(new DetalleRetencionPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDetalleRetencion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetalleRetencion,DetalleRetencionConstantesFunciones.LABEL_IDCUENTACONTABLECREDITO));

		if(this.detalleretencionConstantesFunciones.mostrarid_cuenta_contable_creditoDetalleRetencion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DetalleRetencionConstantesFunciones.LABEL_IDCUENTACONTABLECREDITO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new CuentaContableTableCell(this.cuentacontablecreditosForeignKey,this.detalleretencionConstantesFunciones.resaltarid_cuenta_contable_creditoDetalleRetencion,this,this.detalleretencionConstantesFunciones.activarid_cuenta_contable_creditoDetalleRetencion,iSizeTabla));
			tableColumn.setCellEditor(new CuentaContableTableCell(this.cuentacontablecreditosForeignKey,this.detalleretencionConstantesFunciones.resaltarid_cuenta_contable_creditoDetalleRetencion,this,this.detalleretencionConstantesFunciones.activarid_cuenta_contable_creditoDetalleRetencion,true,"id_cuenta_contable_creditoDetalleRetencion","CON_BUSQUEDA"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70);
			//tableColumn.addPropertyChangeListener(new DetalleRetencionPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDetalleRetencion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetalleRetencion,DetalleRetencionConstantesFunciones.LABEL_DESCRIPCION));

		if(this.detalleretencionConstantesFunciones.mostrardescripcionDetalleRetencion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DetalleRetencionConstantesFunciones.LABEL_DESCRIPCION,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.detalleretencionConstantesFunciones.resaltardescripcionDetalleRetencion,this.detalleretencionConstantesFunciones.activardescripcionDetalleRetencion,iSizeTabla,this,true,"descripcionDetalleRetencion","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.detalleretencionConstantesFunciones.resaltardescripcionDetalleRetencion,this.detalleretencionConstantesFunciones.activardescripcionDetalleRetencion,this,true,"descripcionDetalleRetencion","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new DetalleRetencionPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDetalleRetencion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetalleRetencion,DetalleRetencionConstantesFunciones.LABEL_PORCENTAJE));

		if(this.detalleretencionConstantesFunciones.mostrarporcentajeDetalleRetencion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DetalleRetencionConstantesFunciones.LABEL_PORCENTAJE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.detalleretencionConstantesFunciones.resaltarporcentajeDetalleRetencion,this.detalleretencionConstantesFunciones.activarporcentajeDetalleRetencion,iSizeTabla,this,true,"porcentajeDetalleRetencion","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.detalleretencionConstantesFunciones.resaltarporcentajeDetalleRetencion,this.detalleretencionConstantesFunciones.activarporcentajeDetalleRetencion,this,true,"porcentajeDetalleRetencion","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new DetalleRetencionPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDetalleRetencion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetalleRetencion,DetalleRetencionConstantesFunciones.LABEL_MONTOMINIMO));

		if(this.detalleretencionConstantesFunciones.mostrarmonto_minimoDetalleRetencion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DetalleRetencionConstantesFunciones.LABEL_MONTOMINIMO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.detalleretencionConstantesFunciones.resaltarmonto_minimoDetalleRetencion,this.detalleretencionConstantesFunciones.activarmonto_minimoDetalleRetencion,iSizeTabla,this,true,"monto_minimoDetalleRetencion","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.detalleretencionConstantesFunciones.resaltarmonto_minimoDetalleRetencion,this.detalleretencionConstantesFunciones.activarmonto_minimoDetalleRetencion,this,true,"monto_minimoDetalleRetencion","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new DetalleRetencionPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.detalleretencionSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.detalleretencionSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.detalleretencionSessionBean.getEsGuardarRelacionado(),iSizeTabla));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosDetalleRetencion.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.detalleretencionSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.detalleretencionSessionBean.getEsGuardarRelacionado(),iSizeTabla));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosDetalleRetencion.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarDetalleRetencion && this.isPermisoGuardarCambiosDetalleRetencion) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.detalleretencionSessionBean.getEsGuardarRelacionado(),iSizeTabla));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.detalleretencionSessionBean.getEsGuardarRelacionado(),iSizeTabla));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosDetalleRetencion.addColumn(tableColumn);
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
			
			this.jTableDatosDetalleRetencion.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarDetalleRetencion && this.isPermisoGuardarCambiosDetalleRetencion) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarDetalleRetencion && this.isPermisoGuardarCambiosDetalleRetencion) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosDetalleRetencion.moveColumn(this.jTableDatosDetalleRetencion.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosDetalleRetencion.moveColumn(this.jTableDatosDetalleRetencion.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosDetalleRetencion.moveColumn(this.jTableDatosDetalleRetencion.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosDetalleRetencion.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosDetalleRetencion.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosDetalleRetencion,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!DetalleRetencionJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosDetalleRetencion.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosDetalleRetencion.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!DetalleRetencionJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!DetalleRetencionJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosDetalleRetencion.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosDetalleRetencion.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosDetalleRetencion.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=detalleretencionLogic.getDetalleRetencions().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=detalleretencions.size()-1;
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
		//this.jTableDatosDetalleRetencion.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosDetalleRetencion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosDetalleRetencion();
			
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
				
				//this.isEsNuevoDetalleRetencion=false;
					
				DetalleRetencionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.detalleretencion,new Object(),this.detalleretencionParameterGeneral,this.detalleretencionReturnGeneral);
			
				if(this.detalleretencionSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormDetalleRetencion==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosDetalleRetencion.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosDetalleRetencion.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleretencion =(DetalleRetencion) this.detalleretencionLogic.getDetalleRetencions().toArray()[this.jTableDatosDetalleRetencion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.detalleretencion =(DetalleRetencion) this.detalleretencions.toArray()[this.jTableDatosDetalleRetencion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.detalleretencion.getsType().equals("DUPLICADO")
				   || this.detalleretencion.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoDetalleRetencion=true;
				
				} else {
					this.isEsNuevoDetalleRetencion=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.detalleretencionSessionBean.getEsGuardarRelacionado()) {
					if(this.detalleretencion.getId()>=0 && !this.detalleretencion.getIsNew()) {						
						this.isEsNuevoDetalleRetencion=false;
						
					} else {
						this.isEsNuevoDetalleRetencion=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoDetalleRetencion(esRelaciones);						
				
				this.seleccionarDetalleRetencion(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.detalleretencion.getId()<0) {
					this.isEsNuevoDetalleRetencion=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarDetalleRetencion(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarDetalleRetencion(evt,rowIndex);
				}	
				
				if(this.detalleretencionSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion DetalleRetencion: " + this.dDif); 
					}
				}								
				
				DetalleRetencionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.detalleretencion,new Object(),this.detalleretencionParameterGeneral,this.detalleretencionReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarDetalleRetencion(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.detalleretencion)) {
					if(this.detalleretencion.getId()>0) {
						this.detalleretencion.setIsDeleted(true);
						
						this.detalleretencionsEliminados.add(this.detalleretencion);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.detalleretencionLogic.getDetalleRetencions().remove(this.detalleretencion);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.detalleretencions.remove(this.detalleretencion);				
					}
					
					
					((DetalleRetencionModel) this.jTableDatosDetalleRetencion.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaDetalleRetencion(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,DetalleRetencionConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarDetalleRetencion(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoDetalleRetencion) {
			
			if(this.jInternalFrameDetalleFormDetalleRetencion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosDetalleRetencion.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosDetalleRetencion.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleretencion =(DetalleRetencion) this.detalleretencionLogic.getDetalleRetencions().toArray()[this.jTableDatosDetalleRetencion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.detalleretencion =(DetalleRetencion) this.detalleretencions.toArray()[this.jTableDatosDetalleRetencion.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(DetalleRetencionJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioDetalleRetencion(this.detalleretencion);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.detalleretencionConstantesFunciones.cargarid_empresaDetalleRetencion || this.detalleretencionConstantesFunciones.event_dependid_empresaDetalleRetencion) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.detalleretencion.getid_empresa());
									//this.inicializarActualizarBindingDetalleRetencion(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(detalleretencion.getEmpresa()!=null) {
							this.empresasForeignKey.add(detalleretencion.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.detalleretencion.getid_empresa(),false,"Formulario");

					//EmpresaDestino
					if(!this.detalleretencionConstantesFunciones.cargarid_empresa_destinoDetalleRetencion || this.detalleretencionConstantesFunciones.event_dependid_empresa_destinoDetalleRetencion) {
						//this.cargarCombosEmpresaDestinosForeignKeyLista(" where id="+this.detalleretencion.getid_empresa_destino());
									//this.inicializarActualizarBindingDetalleRetencion(false,false);
						this.empresadestinosForeignKey=new ArrayList<Empresa>();

						if(detalleretencion.getEmpresaDestino()!=null) {
							this.empresadestinosForeignKey.add(detalleretencion.getEmpresaDestino());
						}

						this.addItemDefectoCombosForeignKeyEmpresaDestino();
						this.cargarCombosFrameEmpresaDestinosForeignKey("Todos");
					}
					this.setActualEmpresaDestinoForeignKey(this.detalleretencion.getid_empresa_destino(),false,"Formulario");

					//CuentaContable
					if(!this.detalleretencionConstantesFunciones.cargarid_cuenta_contableDetalleRetencion || this.detalleretencionConstantesFunciones.event_dependid_cuenta_contableDetalleRetencion) {
						//this.cargarCombosCuentaContablesForeignKeyLista(" where id="+this.detalleretencion.getid_cuenta_contable());
									//this.inicializarActualizarBindingDetalleRetencion(false,false);
						this.cuentacontablesForeignKey=new ArrayList<CuentaContable>();

						if(detalleretencion.getCuentaContable()!=null) {
							this.cuentacontablesForeignKey.add(detalleretencion.getCuentaContable());
						}

						this.addItemDefectoCombosForeignKeyCuentaContable();
						this.cargarCombosFrameCuentaContablesForeignKey("Todos");
					}
					this.setActualCuentaContableForeignKey(this.detalleretencion.getid_cuenta_contable(),false,"Formulario");

					//CuentaContableCredito
					if(!this.detalleretencionConstantesFunciones.cargarid_cuenta_contable_creditoDetalleRetencion || this.detalleretencionConstantesFunciones.event_dependid_cuenta_contable_creditoDetalleRetencion) {
						//this.cargarCombosCuentaContableCreditosForeignKeyLista(" where id="+this.detalleretencion.getid_cuenta_contable_credito());
									//this.inicializarActualizarBindingDetalleRetencion(false,false);
						this.cuentacontablecreditosForeignKey=new ArrayList<CuentaContable>();

						if(detalleretencion.getCuentaContableCredito()!=null) {
							this.cuentacontablecreditosForeignKey.add(detalleretencion.getCuentaContableCredito());
						}

						this.addItemDefectoCombosForeignKeyCuentaContableCredito();
						this.cargarCombosFrameCuentaContableCreditosForeignKey("Todos");
					}
					this.setActualCuentaContableCreditoForeignKey(this.detalleretencion.getid_cuenta_contable_credito(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesDetalleRetencion("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesDetalleRetencion(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualDetalleRetencion() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleRetencionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoDetalleRetencion(DetalleRetencion detalleretencion) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoDetalleRetencion(detalleretencion,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoDetalleRetencion(DetalleRetencion detalleretencion,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioDetalleRetencion(detalleretencion);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyDetalleRetencion(detalleretencion,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyDetalleRetencion(detalleretencion);
	}
	
	public void setVariablesObjetoActualToFormularioDetalleRetencion(DetalleRetencion detalleretencion) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormDetalleRetencion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormDetalleRetencion.jLabelidDetalleRetencion.setText(detalleretencion.getId().toString());
			this.jInternalFrameDetalleFormDetalleRetencion.jTextAreadescripcionDetalleRetencion.setText(detalleretencion.getdescripcion());
			this.jInternalFrameDetalleFormDetalleRetencion.jTextFieldporcentajeDetalleRetencion.setText(detalleretencion.getporcentaje().toString());
			this.jInternalFrameDetalleFormDetalleRetencion.jTextFieldmonto_minimoDetalleRetencion.setText(detalleretencion.getmonto_minimo().toString());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,DetalleRetencionConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,DetalleRetencion detalleretencionLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,detalleretencionLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,DetalleRetencion detalleretencionLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				detalleretencionLocal=this.detalleretencion;
			} else {
				detalleretencionLocal=this.detalleretencionAnterior;
			}
		}
		
		if(this.permiteMantenimiento(detalleretencionLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoDetalleRetencion(detalleretencionLocal,true);
					
					if(detalleretencionSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(detalleretencionLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.detalleretencionSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(detalleretencionLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoDetalleRetencion(DetalleRetencion detalleretencion,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualDetalleRetencion(detalleretencion,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysDetalleRetencion(detalleretencion);
	}
	
	public void setVariablesFormularioToObjetoActualDetalleRetencion(DetalleRetencion detalleretencion,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualDetalleRetencion(detalleretencion,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualDetalleRetencion(DetalleRetencion detalleretencion,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormDetalleRetencion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormDetalleRetencion.jLabelidDetalleRetencion.getText()==null || this.jInternalFrameDetalleFormDetalleRetencion.jLabelidDetalleRetencion.getText()=="" || this.jInternalFrameDetalleFormDetalleRetencion.jLabelidDetalleRetencion.getText()=="Id") {
				this.jInternalFrameDetalleFormDetalleRetencion.jLabelidDetalleRetencion.setText("0");
			}

			if(conColumnasBase) {detalleretencion.setId(Long.parseLong(this.jInternalFrameDetalleFormDetalleRetencion.jLabelidDetalleRetencion.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+DetalleRetencionConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetalleRetencion.jLabelIdDetalleRetencion,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			detalleretencion.setdescripcion(this.jInternalFrameDetalleFormDetalleRetencion.jTextAreadescripcionDetalleRetencion.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+DetalleRetencionConstantesFunciones.LABEL_DESCRIPCION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetalleRetencion.jLabeldescripcionDetalleRetencion,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			detalleretencion.setporcentaje(Double.parseDouble(this.jInternalFrameDetalleFormDetalleRetencion.jTextFieldporcentajeDetalleRetencion.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+DetalleRetencionConstantesFunciones.LABEL_PORCENTAJE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetalleRetencion.jLabelporcentajeDetalleRetencion,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			detalleretencion.setmonto_minimo(Double.parseDouble(this.jInternalFrameDetalleFormDetalleRetencion.jTextFieldmonto_minimoDetalleRetencion.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+DetalleRetencionConstantesFunciones.LABEL_MONTOMINIMO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetalleRetencion.jLabelmonto_minimoDetalleRetencion,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,DetalleRetencionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualDetalleRetencion(DetalleRetencion detalleretencionBean,DetalleRetencion detalleretencion,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conDefault || (!conDefault && detalleretencionBean.getid_empresa_destino()!=null && !detalleretencionBean.getid_empresa_destino().equals(-1L))) {detalleretencion.setid_empresa_destino(detalleretencionBean.getid_empresa_destino());}
			if(conDefault || (!conDefault && detalleretencionBean.getid_cuenta_contable()!=null && !detalleretencionBean.getid_cuenta_contable().equals(-1L))) {detalleretencion.setid_cuenta_contable(detalleretencionBean.getid_cuenta_contable());}
			if(conDefault || (!conDefault && detalleretencionBean.getid_cuenta_contable_credito()!=null && !detalleretencionBean.getid_cuenta_contable_credito().equals(-1L))) {detalleretencion.setid_cuenta_contable_credito(detalleretencionBean.getid_cuenta_contable_credito());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,DetalleRetencionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosDetalleRetencion(DetalleRetencion detalleretencionOrigen,DetalleRetencion detalleretencion,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && detalleretencionOrigen.getId()!=null && !detalleretencionOrigen.getId().equals(0L))) {detalleretencion.setId(detalleretencionOrigen.getId());}}
			if(conDefault || (!conDefault && detalleretencionOrigen.getid_empresa_destino()!=null && !detalleretencionOrigen.getid_empresa_destino().equals(-1L))) {detalleretencion.setid_empresa_destino(detalleretencionOrigen.getid_empresa_destino());}
			if(conDefault || (!conDefault && detalleretencionOrigen.getid_cuenta_contable()!=null && !detalleretencionOrigen.getid_cuenta_contable().equals(-1L))) {detalleretencion.setid_cuenta_contable(detalleretencionOrigen.getid_cuenta_contable());}
			if(conDefault || (!conDefault && detalleretencionOrigen.getid_cuenta_contable_credito()!=null && !detalleretencionOrigen.getid_cuenta_contable_credito().equals(-1L))) {detalleretencion.setid_cuenta_contable_credito(detalleretencionOrigen.getid_cuenta_contable_credito());}
			if(conDefault || (!conDefault && detalleretencionOrigen.getdescripcion()!=null && !detalleretencionOrigen.getdescripcion().equals(""))) {detalleretencion.setdescripcion(detalleretencionOrigen.getdescripcion());}
			if(conDefault || (!conDefault && detalleretencionOrigen.getporcentaje()!=null && !detalleretencionOrigen.getporcentaje().equals(0.0))) {detalleretencion.setporcentaje(detalleretencionOrigen.getporcentaje());}
			if(conDefault || (!conDefault && detalleretencionOrigen.getmonto_minimo()!=null && !detalleretencionOrigen.getmonto_minimo().equals(0.0))) {detalleretencion.setmonto_minimo(detalleretencionOrigen.getmonto_minimo());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,DetalleRetencionConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioDetalleRetencion(DetalleRetencion detalleretencion) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormDetalleRetencion.jLabelidDetalleRetencion.setText(detalleretencion.getId().toString());
			this.jInternalFrameDetalleFormDetalleRetencion.jTextAreadescripcionDetalleRetencion.setText(detalleretencion.getdescripcion());
			this.jInternalFrameDetalleFormDetalleRetencion.jTextFieldporcentajeDetalleRetencion.setText(detalleretencion.getporcentaje().toString());
			this.jInternalFrameDetalleFormDetalleRetencion.jTextFieldmonto_minimoDetalleRetencion.setText(detalleretencion.getmonto_minimo().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleRetencionConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioDetalleRetencion(DetalleRetencionBean detalleretencionBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormDetalleRetencion.jLabelidDetalleRetencion.setText(detalleretencionBean.getId().toString());
			this.jInternalFrameDetalleFormDetalleRetencion.jTextAreadescripcionDetalleRetencion.setText(detalleretencionBean.getdescripcion());
			this.jInternalFrameDetalleFormDetalleRetencion.jTextFieldporcentajeDetalleRetencion.setText(detalleretencionBean.getporcentaje().toString());
			this.jInternalFrameDetalleFormDetalleRetencion.jTextFieldmonto_minimoDetalleRetencion.setText(detalleretencionBean.getmonto_minimo().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleRetencionConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanDetalleRetencion(DetalleRetencionParameterReturnGeneral detalleretencionReturnGeneral,DetalleRetencionBean detalleretencionBean,Boolean conDefault) throws Exception { 
		try {
			DetalleRetencion detalleretencionLocal=new DetalleRetencion();
			
			detalleretencionLocal=detalleretencionReturnGeneral.getDetalleRetencion();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && detalleretencionLocal.getId()!=null && !detalleretencionLocal.getId().equals(0L))) {detalleretencionBean.setId(detalleretencionLocal.getId());}}
			if(conDefault || (!conDefault && detalleretencionLocal.getid_empresa_destino()!=null && !detalleretencionLocal.getid_empresa_destino().equals(-1L))) {detalleretencionBean.setid_empresa_destino(detalleretencionLocal.getid_empresa_destino());}
			if(conDefault || (!conDefault && detalleretencionLocal.getid_cuenta_contable()!=null && !detalleretencionLocal.getid_cuenta_contable().equals(-1L))) {detalleretencionBean.setid_cuenta_contable(detalleretencionLocal.getid_cuenta_contable());}
			if(conDefault || (!conDefault && detalleretencionLocal.getid_cuenta_contable_credito()!=null && !detalleretencionLocal.getid_cuenta_contable_credito().equals(-1L))) {detalleretencionBean.setid_cuenta_contable_credito(detalleretencionLocal.getid_cuenta_contable_credito());}
			if(conDefault || (!conDefault && detalleretencionLocal.getdescripcion()!=null && !detalleretencionLocal.getdescripcion().equals(""))) {detalleretencionBean.setdescripcion(detalleretencionLocal.getdescripcion());}
			if(conDefault || (!conDefault && detalleretencionLocal.getporcentaje()!=null && !detalleretencionLocal.getporcentaje().equals(0.0))) {detalleretencionBean.setporcentaje(detalleretencionLocal.getporcentaje());}
			if(conDefault || (!conDefault && detalleretencionLocal.getmonto_minimo()!=null && !detalleretencionLocal.getmonto_minimo().equals(0.0))) {detalleretencionBean.setmonto_minimo(detalleretencionLocal.getmonto_minimo());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleRetencionConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxDetalleRetencionGenerico(Long idDetalleRetencionSeleccionado,JComboBox jComboBoxDetalleRetencion,List<DetalleRetencion> detalleretencionsLocal)throws Exception {
		try {
			DetalleRetencion  detalleretencionTemp=null;

			for(DetalleRetencion detalleretencionAux:detalleretencionsLocal) {
				if(detalleretencionAux.getId()!=null && detalleretencionAux.getId().equals(idDetalleRetencionSeleccionado)) {
					detalleretencionTemp=detalleretencionAux;
					break;
				}
			}

			jComboBoxDetalleRetencion.setSelectedItem(detalleretencionTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxDetalleRetencionGenerico(JComboBox jComboBoxDetalleRetencion,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxDetalleRetencion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxDetalleRetencion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxDetalleRetencion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxDetalleRetencion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxDetalleRetencion.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxDetalleRetencion.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxDetalleRetencion.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxDetalleRetencion.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxDetalleRetencion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxDetalleRetencion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,DetalleRetencionConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			detalleretencion=(DetalleRetencion) detalleretencionLogic.getDetalleRetencions().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			detalleretencion =(DetalleRetencion) detalleretencions.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!detalleretencion.getIsNew() && !detalleretencion.getIsChanged() && !detalleretencion.getIsDeleted()) {
				sDescripcion=detalleretencion.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=detalleretencion.getempresa_descripcion();
			}
		}

		if(sTipo.equals("EmpresaDestino")) {
			//sDescripcion=this.getActualEmpresaDestinoForeignKeyDescripcion((Long)value);
			if(!detalleretencion.getIsNew() && !detalleretencion.getIsChanged() && !detalleretencion.getIsDeleted()) {
				sDescripcion=detalleretencion.getempresadestino_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaDestinoForeignKeyDescripcion((Long)value);
				sDescripcion=detalleretencion.getempresadestino_descripcion();
			}
		}

		if(sTipo.equals("CuentaContable")) {
			//sDescripcion=this.getActualCuentaContableForeignKeyDescripcion((Long)value);
			if(!detalleretencion.getIsNew() && !detalleretencion.getIsChanged() && !detalleretencion.getIsDeleted()) {
				sDescripcion=detalleretencion.getcuentacontable_descripcion();
			} else {
				//sDescripcion=this.getActualCuentaContableForeignKeyDescripcion((Long)value);
				sDescripcion=detalleretencion.getcuentacontable_descripcion();
			}
		}

		if(sTipo.equals("CuentaContableCredito")) {
			//sDescripcion=this.getActualCuentaContableCreditoForeignKeyDescripcion((Long)value);
			if(!detalleretencion.getIsNew() && !detalleretencion.getIsChanged() && !detalleretencion.getIsDeleted()) {
				sDescripcion=detalleretencion.getcuentacontablecredito_descripcion();
			} else {
				//sDescripcion=this.getActualCuentaContableCreditoForeignKeyDescripcion((Long)value);
				sDescripcion=detalleretencion.getcuentacontablecredito_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		DetalleRetencion detalleretencionRow=new DetalleRetencion();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			detalleretencionRow=(DetalleRetencion) detalleretencionLogic.getDetalleRetencions().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			detalleretencionRow=(DetalleRetencion) detalleretencions.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualDetalleRetencion(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoDetalleRetencion.setVisible((this.isVisibilidadCeldaNuevoDetalleRetencion && this.isPermisoNuevoDetalleRetencion));			
			this.jButtonDuplicarDetalleRetencion.setVisible((this.isVisibilidadCeldaDuplicarDetalleRetencion && this.isPermisoDuplicarDetalleRetencion));			
			this.jButtonCopiarDetalleRetencion.setVisible((this.isVisibilidadCeldaCopiarDetalleRetencion && this.isPermisoCopiarDetalleRetencion));
			this.jButtonVerFormDetalleRetencion.setVisible((this.isVisibilidadCeldaVerFormDetalleRetencion && this.isPermisoVerFormDetalleRetencion));
			
			this.jButtonAbrirOrderByDetalleRetencion.setVisible((this.isVisibilidadCeldaOrdenDetalleRetencion && this.isPermisoOrdenDetalleRetencion));			
			
			this.jButtonNuevoRelacionesDetalleRetencion.setVisible((this.isVisibilidadCeldaNuevoRelacionesDetalleRetencion && this.isPermisoNuevoDetalleRetencion));			
			this.jButtonNuevoGuardarCambiosDetalleRetencion.setVisible((this.isVisibilidadCeldaNuevoDetalleRetencion && this.isPermisoNuevoDetalleRetencion && this.isPermisoGuardarCambiosDetalleRetencion));
			
			if(this.jInternalFrameDetalleFormDetalleRetencion!=null) {
			this.jInternalFrameDetalleFormDetalleRetencion.jButtonModificarDetalleRetencion.setVisible((this.isVisibilidadCeldaModificarDetalleRetencion && this.isPermisoActualizarDetalleRetencion));	
			this.jInternalFrameDetalleFormDetalleRetencion.jButtonActualizarDetalleRetencion.setVisible((this.isVisibilidadCeldaActualizarDetalleRetencion && this.isPermisoActualizarDetalleRetencion));	
			this.jInternalFrameDetalleFormDetalleRetencion.jButtonEliminarDetalleRetencion.setVisible((this.isVisibilidadCeldaEliminarDetalleRetencion && this.isPermisoEliminarDetalleRetencion));
			this.jInternalFrameDetalleFormDetalleRetencion.jButtonCancelarDetalleRetencion.setVisible(this.isVisibilidadCeldaCancelarDetalleRetencion);							
			this.jInternalFrameDetalleFormDetalleRetencion.jButtonGuardarCambiosDetalleRetencion.setVisible((this.isVisibilidadCeldaGuardarDetalleRetencion && this.isPermisoGuardarCambiosDetalleRetencion));			
			
			}
						
			this.jButtonGuardarCambiosTablaDetalleRetencion.setVisible((this.isVisibilidadCeldaGuardarCambiosDetalleRetencion && this.isPermisoGuardarCambiosDetalleRetencion));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarDetalleRetencion.setVisible((this.isVisibilidadCeldaNuevoDetalleRetencion && this.isPermisoNuevoDetalleRetencion));						
			this.jButtonDuplicarToolBarDetalleRetencion.setVisible((this.isVisibilidadCeldaDuplicarDetalleRetencion && this.isPermisoDuplicarDetalleRetencion));						
			this.jButtonCopiarToolBarDetalleRetencion.setVisible((this.isVisibilidadCeldaCopiarDetalleRetencion && this.isPermisoCopiarDetalleRetencion));			
			this.jButtonVerFormToolBarDetalleRetencion.setVisible((this.isVisibilidadCeldaVerFormDetalleRetencion && this.isPermisoVerFormDetalleRetencion));			
			this.jButtonAbrirOrderByToolBarDetalleRetencion.setVisible((this.isVisibilidadCeldaOrdenDetalleRetencion && this.isPermisoOrdenDetalleRetencion));
			this.jButtonNuevoRelacionesToolBarDetalleRetencion.setVisible((this.isVisibilidadCeldaNuevoRelacionesDetalleRetencion && this.isPermisoNuevoDetalleRetencion));			
			this.jButtonNuevoGuardarCambiosToolBarDetalleRetencion.setVisible((this.isVisibilidadCeldaNuevoDetalleRetencion && this.isPermisoNuevoDetalleRetencion && this.isPermisoGuardarCambiosDetalleRetencion));			
			
			if(this.jInternalFrameDetalleFormDetalleRetencion!=null) {
			this.jInternalFrameDetalleFormDetalleRetencion.jButtonModificarToolBarDetalleRetencion.setVisible((this.isVisibilidadCeldaModificarDetalleRetencion && this.isPermisoActualizarDetalleRetencion));	
			this.jInternalFrameDetalleFormDetalleRetencion.jButtonActualizarToolBarDetalleRetencion.setVisible((this.isVisibilidadCeldaActualizarDetalleRetencion  && this.isPermisoActualizarDetalleRetencion));	
			this.jInternalFrameDetalleFormDetalleRetencion.jButtonEliminarToolBarDetalleRetencion.setVisible((this.isVisibilidadCeldaEliminarDetalleRetencion && this.isPermisoEliminarDetalleRetencion));
			this.jInternalFrameDetalleFormDetalleRetencion.jButtonCancelarToolBarDetalleRetencion.setVisible(this.isVisibilidadCeldaCancelarDetalleRetencion);				
			this.jInternalFrameDetalleFormDetalleRetencion.jButtonGuardarCambiosToolBarDetalleRetencion.setVisible((this.isVisibilidadCeldaGuardarDetalleRetencion && this.isPermisoGuardarCambiosDetalleRetencion));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarDetalleRetencion.setVisible((this.isVisibilidadCeldaGuardarCambiosDetalleRetencion && this.isPermisoGuardarCambiosDetalleRetencion));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoDetalleRetencion.setVisible((this.isVisibilidadCeldaNuevoDetalleRetencion && this.isPermisoNuevoDetalleRetencion));			
			this.jMenuItemDuplicarDetalleRetencion.setVisible((this.isVisibilidadCeldaDuplicarDetalleRetencion && this.isPermisoDuplicarDetalleRetencion));			
			this.jMenuItemCopiarDetalleRetencion.setVisible((this.isVisibilidadCeldaCopiarDetalleRetencion && this.isPermisoCopiarDetalleRetencion));			
			this.jMenuItemVerFormDetalleRetencion.setVisible((this.isVisibilidadCeldaVerFormDetalleRetencion && this.isPermisoVerFormDetalleRetencion));			
			this.jMenuItemAbrirOrderByDetalleRetencion.setVisible((this.isVisibilidadCeldaOrdenDetalleRetencion && this.isPermisoOrdenDetalleRetencion));			
			//this.jMenuItemMostrarOcultarDetalleRetencion.setVisible((this.isVisibilidadCeldaOrdenDetalleRetencion && this.isPermisoOrdenDetalleRetencion));
			this.jMenuItemDetalleAbrirOrderByDetalleRetencion.setVisible((this.isVisibilidadCeldaOrdenDetalleRetencion && this.isPermisoOrdenDetalleRetencion));			
			//this.jMenuItemDetalleMostrarOcultarDetalleRetencion.setVisible((this.isVisibilidadCeldaOrdenDetalleRetencion && this.isPermisoOrdenDetalleRetencion));			
			this.jMenuItemNuevoRelacionesDetalleRetencion.setVisible((this.isVisibilidadCeldaNuevoRelacionesDetalleRetencion && this.isPermisoNuevoDetalleRetencion));			
			this.jMenuItemNuevoGuardarCambiosDetalleRetencion.setVisible((this.isVisibilidadCeldaNuevoDetalleRetencion && this.isPermisoNuevoDetalleRetencion && this.isPermisoGuardarCambiosDetalleRetencion));									
			
			if(this.jInternalFrameDetalleFormDetalleRetencion!=null) {
			this.jInternalFrameDetalleFormDetalleRetencion.jMenuItemModificarDetalleRetencion.setVisible((this.isVisibilidadCeldaModificarDetalleRetencion && this.isPermisoActualizarDetalleRetencion));	
			this.jInternalFrameDetalleFormDetalleRetencion.jMenuItemActualizarDetalleRetencion.setVisible((this.isVisibilidadCeldaActualizarDetalleRetencion && this.isPermisoActualizarDetalleRetencion));	
			this.jInternalFrameDetalleFormDetalleRetencion.jMenuItemEliminarDetalleRetencion.setVisible((this.isVisibilidadCeldaEliminarDetalleRetencion && this.isPermisoEliminarDetalleRetencion));
			this.jInternalFrameDetalleFormDetalleRetencion.jMenuItemCancelarDetalleRetencion.setVisible(this.isVisibilidadCeldaCancelarDetalleRetencion);				
			}
			
			this.jMenuItemGuardarCambiosDetalleRetencion.setVisible((this.isVisibilidadCeldaGuardarDetalleRetencion && this.isPermisoGuardarCambiosDetalleRetencion));						
			this.jMenuItemGuardarCambiosTablaDetalleRetencion.setVisible((this.isVisibilidadCeldaGuardarCambiosDetalleRetencion && this.isPermisoGuardarCambiosDetalleRetencion));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoDetalleRetencion=this.jButtonNuevoDetalleRetencion.isVisible();
			this.isVisibilidadCeldaDuplicarDetalleRetencion=this.jButtonDuplicarDetalleRetencion.isVisible();
			this.isVisibilidadCeldaCopiarDetalleRetencion=this.jButtonCopiarDetalleRetencion.isVisible();
			this.isVisibilidadCeldaVerFormDetalleRetencion=this.jButtonVerFormDetalleRetencion.isVisible();
			
			this.isVisibilidadCeldaOrdenDetalleRetencion=this.jButtonAbrirOrderByDetalleRetencion.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesDetalleRetencion=this.jButtonNuevoRelacionesDetalleRetencion.isVisible();
			this.isVisibilidadCeldaModificarDetalleRetencion=this.jButtonModificarDetalleRetencion.isVisible();
			
			if(this.jInternalFrameDetalleFormDetalleRetencion!=null) {
			this.isVisibilidadCeldaActualizarDetalleRetencion=this.jInternalFrameDetalleFormDetalleRetencion.jButtonActualizarDetalleRetencion.isVisible();
			this.isVisibilidadCeldaEliminarDetalleRetencion=this.jInternalFrameDetalleFormDetalleRetencion.jButtonEliminarDetalleRetencion.isVisible();
			this.isVisibilidadCeldaCancelarDetalleRetencion=this.jInternalFrameDetalleFormDetalleRetencion.jButtonCancelarDetalleRetencion.isVisible();
			this.isVisibilidadCeldaGuardarDetalleRetencion=this.jInternalFrameDetalleFormDetalleRetencion.jButtonGuardarCambiosDetalleRetencion.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosDetalleRetencion=this.jButtonGuardarCambiosTablaDetalleRetencion.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoDetalleRetencion=this.jButtonNuevoToolBarDetalleRetencion.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesDetalleRetencion=this.jButtonNuevoRelacionesToolBarDetalleRetencion.isVisible();
			
			if(this.jInternalFrameDetalleFormDetalleRetencion!=null) {
			this.isVisibilidadCeldaModificarDetalleRetencion=this.jInternalFrameDetalleFormDetalleRetencion.jButtonModificarToolBarDetalleRetencion.isVisible();
			this.isVisibilidadCeldaActualizarDetalleRetencion=this.jInternalFrameDetalleFormDetalleRetencion.jButtonActualizarToolBarDetalleRetencion.isVisible();
			this.isVisibilidadCeldaEliminarDetalleRetencion=this.jInternalFrameDetalleFormDetalleRetencion.jButtonEliminarToolBarDetalleRetencion.isVisible();
			this.isVisibilidadCeldaCancelarDetalleRetencion=this.jInternalFrameDetalleFormDetalleRetencion.jButtonCancelarToolBarDetalleRetencion.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarDetalleRetencion=this.jButtonGuardarCambiosToolBarDetalleRetencion.isVisible();
			this.isVisibilidadCeldaGuardarCambiosDetalleRetencion=this.jButtonGuardarCambiosTablaToolBarDetalleRetencion.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoDetalleRetencion=this.jMenuItemNuevoDetalleRetencion.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesDetalleRetencion=this.jMenuItemNuevoRelacionesDetalleRetencion.isVisible();
			
			if(this.jInternalFrameDetalleFormDetalleRetencion!=null) {
			this.isVisibilidadCeldaModificarDetalleRetencion=this.jInternalFrameDetalleFormDetalleRetencion.jMenuItemModificarDetalleRetencion.isVisible();
			this.isVisibilidadCeldaActualizarDetalleRetencion=this.jInternalFrameDetalleFormDetalleRetencion.jMenuItemActualizarDetalleRetencion.isVisible();
			this.isVisibilidadCeldaEliminarDetalleRetencion=this.jInternalFrameDetalleFormDetalleRetencion.jMenuItemEliminarDetalleRetencion.isVisible();
			this.isVisibilidadCeldaCancelarDetalleRetencion=this.jInternalFrameDetalleFormDetalleRetencion.jMenuItemCancelarDetalleRetencion.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarDetalleRetencion=this.jMenuItemGuardarCambiosDetalleRetencion.isVisible();
			this.isVisibilidadCeldaGuardarCambiosDetalleRetencion=this.jMenuItemGuardarCambiosTablaDetalleRetencion.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesDetalleRetencion(Boolean esInicializar) {
		if(DetalleRetencionJInternalFrame.ISBINDING_MANUAL) {			
			if(this.detalleretencionSessionBean.getConGuardarRelaciones()) {
				//if(this.detalleretencionSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesDetalleRetencion();
			}
			
			this.inicializarActualizarBindingBotonesManualDetalleRetencion(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualDetalleRetencion() {
		this.jButtonNuevoDetalleRetencion.setVisible(this.isPermisoNuevoDetalleRetencion);			
		this.jButtonDuplicarDetalleRetencion.setVisible(this.isPermisoDuplicarDetalleRetencion);			
		this.jButtonCopiarDetalleRetencion.setVisible(this.isPermisoCopiarDetalleRetencion);			
		this.jButtonVerFormDetalleRetencion.setVisible(this.isPermisoVerFormDetalleRetencion);			
		
		this.jButtonAbrirOrderByDetalleRetencion.setVisible(this.isPermisoOrdenDetalleRetencion);					
		
		this.jButtonNuevoRelacionesDetalleRetencion.setVisible(this.isPermisoNuevoDetalleRetencion);			
		
		if(this.jInternalFrameDetalleFormDetalleRetencion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetalleRetencion.jButtonModificarDetalleRetencion.setVisible(this.isPermisoActualizarDetalleRetencion);	
			this.jInternalFrameDetalleFormDetalleRetencion.jButtonActualizarDetalleRetencion.setVisible(this.isPermisoActualizarDetalleRetencion);	
			this.jInternalFrameDetalleFormDetalleRetencion.jButtonEliminarDetalleRetencion.setVisible(this.isPermisoEliminarDetalleRetencion);
			this.jInternalFrameDetalleFormDetalleRetencion.jButtonCancelarDetalleRetencion.setVisible(this.isVisibilidadCeldaCancelarDetalleRetencion);						
			this.jInternalFrameDetalleFormDetalleRetencion.jButtonGuardarCambiosDetalleRetencion.setVisible(this.isPermisoGuardarCambiosDetalleRetencion);							
		}
		
		this.jButtonGuardarCambiosTablaDetalleRetencion.setVisible(this.isPermisoActualizarDetalleRetencion);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleDetalleRetencion() {
		this.jInternalFrameDetalleFormDetalleRetencion.jButtonModificarDetalleRetencion.setVisible(this.isPermisoActualizarDetalleRetencion);	
		this.jInternalFrameDetalleFormDetalleRetencion.jButtonActualizarDetalleRetencion.setVisible(this.isPermisoActualizarDetalleRetencion);	
		this.jInternalFrameDetalleFormDetalleRetencion.jButtonEliminarDetalleRetencion.setVisible(this.isPermisoEliminarDetalleRetencion);
		this.jInternalFrameDetalleFormDetalleRetencion.jButtonCancelarDetalleRetencion.setVisible(this.isVisibilidadCeldaCancelarDetalleRetencion);							
		this.jInternalFrameDetalleFormDetalleRetencion.jButtonGuardarCambiosDetalleRetencion.setVisible((this.isVisibilidadCeldaGuardarDetalleRetencion && this.isPermisoGuardarCambiosDetalleRetencion));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosDetalleRetencion() {
		if(DetalleRetencionJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualDetalleRetencion();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesDetalleRetencion() {
	}
	
	public void jTableDatosDetalleRetencionListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarDetalleRetencion(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleRetencionConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidDetalleRetencionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleretencionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetalleRetencion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDetalleRetencion(this.getdetalleretencion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleRetencion(this.detalleretencion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detalleretencion =(DetalleRetencion) this.detalleretencionLogic.getDetalleRetencions().toArray()[this.jTableDatosDetalleRetencion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.detalleretencion =(DetalleRetencion) this.detalleretencions.toArray()[this.jTableDatosDetalleRetencion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.detalleretencion==null) {
						this.detalleretencion = new DetalleRetencion();
					}

					this.setVariablesFormularioToObjetoActualDetalleRetencion(this.detalleretencion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleRetencion(this.detalleretencion);
				}

				if(this.detalleretencion.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.detalleretencion.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDetalleRetencion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleretencionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleretencionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DetalleRetencionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleretencionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaDetalleRetencionUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleretencionLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebDetalleRetencion(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetalleRetencion.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosDetalleRetencion.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosDetalleRetencion.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleretencion =(DetalleRetencion) this.detalleretencionLogic.getDetalleRetencions().toArray()[this.jTableDatosDetalleRetencion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.detalleretencion =(DetalleRetencion) this.detalleretencions.toArray()[this.jTableDatosDetalleRetencion.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualDetalleRetencion(this.getdetalleretencion(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysDetalleRetencion(this.detalleretencion);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.detalleretencionLogic.getConnexion());

				if(this.detalleretencion.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.detalleretencion.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderDetalleRetencion=(TitledBorder)this.jScrollPanelDatosDetalleRetencion.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderDetalleRetencion.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleretencionLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleretencionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DetalleRetencionConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleretencionLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaDetalleRetencionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleretencionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetalleRetencion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDetalleRetencion(this.getdetalleretencion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleRetencion(this.detalleretencion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detalleretencion =(DetalleRetencion) this.detalleretencionLogic.getDetalleRetencions().toArray()[this.jTableDatosDetalleRetencion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.detalleretencion =(DetalleRetencion) this.detalleretencions.toArray()[this.jTableDatosDetalleRetencion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.detalleretencion==null) {
						this.detalleretencion = new DetalleRetencion();
					}

					this.setVariablesFormularioToObjetoActualDetalleRetencion(this.detalleretencion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleRetencion(this.detalleretencion);
				}

				if(this.detalleretencion.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.detalleretencion.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDetalleRetencion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleretencionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleretencionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DetalleRetencionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleretencionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresa_destinoDetalleRetencionUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleretencionLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresadestino=true;

			idTienePermisoempresadestino=this.tienePermisosUsuarioEnPaginaWebDetalleRetencion(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresadestino) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetalleRetencion.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosDetalleRetencion.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosDetalleRetencion.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleretencion =(DetalleRetencion) this.detalleretencionLogic.getDetalleRetencions().toArray()[this.jTableDatosDetalleRetencion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.detalleretencion =(DetalleRetencion) this.detalleretencions.toArray()[this.jTableDatosDetalleRetencion.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualDetalleRetencion(this.getdetalleretencion(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysDetalleRetencion(this.detalleretencion);

				this.empresadestinoBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresadestinoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresadestinoBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.detalleretencionLogic.getConnexion());

				if(this.detalleretencion.getid_empresa_destino()!=null) {
					this.empresadestinoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresadestinoBeanSwingJInternalFrame.setIdActual(this.detalleretencion.getid_empresa_destino());
					this.empresadestinoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresadestinoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresadestinoBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresadestinoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderDetalleRetencion=(TitledBorder)this.jScrollPanelDatosDetalleRetencion.getBorder();
				TitledBorder titledBorderempresadestino=(TitledBorder)this.empresadestinoBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresadestino.setTitle(titledBorderDetalleRetencion.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleretencionLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleretencionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DetalleRetencionConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleretencionLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresa_destinoDetalleRetencionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleretencionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetalleRetencion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDetalleRetencion(this.getdetalleretencion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleRetencion(this.detalleretencion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detalleretencion =(DetalleRetencion) this.detalleretencionLogic.getDetalleRetencions().toArray()[this.jTableDatosDetalleRetencion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.detalleretencion =(DetalleRetencion) this.detalleretencions.toArray()[this.jTableDatosDetalleRetencion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.detalleretencion==null) {
						this.detalleretencion = new DetalleRetencion();
					}

					this.setVariablesFormularioToObjetoActualDetalleRetencion(this.detalleretencion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleRetencion(this.detalleretencion);
				}

				if(this.detalleretencion.getid_empresa_destino()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa_destino = "+this.detalleretencion.getid_empresa_destino().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDetalleRetencion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleretencionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleretencionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DetalleRetencionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleretencionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_cuenta_contableDetalleRetencionActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
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


			TitledBorder titledBorderDetalleRetencion=null;
			TitledBorder titledBordercuentacontable=null;

			if(!this.jScrollPanelDatosDetalleRetencion.getBorder().getClass().equals(EmptyBorder.class)) {
				titledBorderDetalleRetencion=(TitledBorder)this.jScrollPanelDatosDetalleRetencion.getBorder();
				titledBordercuentacontable=(TitledBorder)this.cuentacontableBeanSwingJInternalFrame.jScrollPanelDatosCuentaContable.getBorder();

				titledBordercuentacontable.setTitle(titledBorderDetalleRetencion.getTitle() + " -> Cuenta Contable");
			}

			if(!Constantes.CON_VARIAS_VENTANAS) {
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
			}

			this.jDesktopPane.add(jinternalFrame);

			jinternalFrame.setSelected(true);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleRetencionConstantesFunciones.CLASSNAME);
		}
	}

	public void jButtonid_cuenta_contableDetalleRetencionUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleretencionLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisocuentacontable=true;

			idTienePermisocuentacontable=this.tienePermisosUsuarioEnPaginaWebDetalleRetencion(CuentaContableConstantesFunciones.CLASSNAME);

			if(idTienePermisocuentacontable) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetalleRetencion.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosDetalleRetencion.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosDetalleRetencion.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleretencion =(DetalleRetencion) this.detalleretencionLogic.getDetalleRetencions().toArray()[this.jTableDatosDetalleRetencion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.detalleretencion =(DetalleRetencion) this.detalleretencions.toArray()[this.jTableDatosDetalleRetencion.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualDetalleRetencion(this.getdetalleretencion(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysDetalleRetencion(this.detalleretencion);

				this.cuentacontableBeanSwingJInternalFrame=new CuentaContableBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.cuentacontableBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.cuentacontableBeanSwingJInternalFrame.getCuentaContableLogic().setConnexion(this.detalleretencionLogic.getConnexion());

				if(this.detalleretencion.getid_cuenta_contable()!=null) {
					this.cuentacontableBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.cuentacontableBeanSwingJInternalFrame.setIdActual(this.detalleretencion.getid_cuenta_contable());
					this.cuentacontableBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.cuentacontableBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.cuentacontableBeanSwingJInternalFrame.inicializarActualizarBindingTablaCuentaContable();
				}

				JInternalFrameBase jinternalFrame =this.cuentacontableBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderDetalleRetencion=(TitledBorder)this.jScrollPanelDatosDetalleRetencion.getBorder();
				TitledBorder titledBordercuentacontable=(TitledBorder)this.cuentacontableBeanSwingJInternalFrame.jScrollPanelDatosCuentaContable.getBorder();

				titledBordercuentacontable.setTitle(titledBorderDetalleRetencion.getTitle() + " -> Cuenta Contable");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleretencionLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleretencionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DetalleRetencionConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleretencionLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_cuenta_contableDetalleRetencionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleretencionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetalleRetencion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDetalleRetencion(this.getdetalleretencion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleRetencion(this.detalleretencion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detalleretencion =(DetalleRetencion) this.detalleretencionLogic.getDetalleRetencions().toArray()[this.jTableDatosDetalleRetencion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.detalleretencion =(DetalleRetencion) this.detalleretencions.toArray()[this.jTableDatosDetalleRetencion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.detalleretencion==null) {
						this.detalleretencion = new DetalleRetencion();
					}

					this.setVariablesFormularioToObjetoActualDetalleRetencion(this.detalleretencion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleRetencion(this.detalleretencion);
				}

				if(this.detalleretencion.getid_cuenta_contable()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_cuenta_contable = "+this.detalleretencion.getid_cuenta_contable().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDetalleRetencion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleretencionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleretencionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DetalleRetencionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleretencionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_cuenta_contable_creditoDetalleRetencionActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {
			this.cuentacontablecreditoBeanSwingJInternalFrame=new CuentaContableBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.BUSQUEDA,false,false,false,true);
			this.cuentacontablecreditoBeanSwingJInternalFrame.setJInternalFrameParent(this);
			this.cuentacontablecreditoBeanSwingJInternalFrame.sTipoBusqueda="CuentaContableCredito";

			if(!this.sFinalQueryGeneral_cuentacontablecredito.equals("")) {
				this.cuentacontablecreditoBeanSwingJInternalFrame.setsFinalQueryGeneral(this.sFinalQueryGeneral_cuentacontablecredito);
				this.cuentacontablecreditoBeanSwingJInternalFrame.sAccionBusqueda="Query";


				this.cuentacontablecreditoBeanSwingJInternalFrame.procesarBusqueda(this.cuentacontablecreditoBeanSwingJInternalFrame.sAccionBusqueda);
				this.cuentacontablecreditoBeanSwingJInternalFrame.inicializarActualizarBindingCuentaContable(false);
			}

			if(!this.sFinalQueryComboCuentaContableCredito.equals("") && false) {
			}


			JInternalFrameBase jinternalFrame =this.cuentacontablecreditoBeanSwingJInternalFrame;
			jinternalFrame.setAutoscrolls(true);
			//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
			jinternalFrame.setVisible(true); 


			TitledBorder titledBorderDetalleRetencion=null;
			TitledBorder titledBordercuentacontablecredito=null;

			if(!this.jScrollPanelDatosDetalleRetencion.getBorder().getClass().equals(EmptyBorder.class)) {
				titledBorderDetalleRetencion=(TitledBorder)this.jScrollPanelDatosDetalleRetencion.getBorder();
				titledBordercuentacontablecredito=(TitledBorder)this.cuentacontablecreditoBeanSwingJInternalFrame.jScrollPanelDatosCuentaContable.getBorder();

				titledBordercuentacontablecredito.setTitle(titledBorderDetalleRetencion.getTitle() + " -> Cuenta Contable");
			}

			if(!Constantes.CON_VARIAS_VENTANAS) {
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
			}

			this.jDesktopPane.add(jinternalFrame);

			jinternalFrame.setSelected(true);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleRetencionConstantesFunciones.CLASSNAME);
		}
	}

	public void jButtonid_cuenta_contable_creditoDetalleRetencionUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleretencionLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisocuentacontablecredito=true;

			idTienePermisocuentacontablecredito=this.tienePermisosUsuarioEnPaginaWebDetalleRetencion(CuentaContableConstantesFunciones.CLASSNAME);

			if(idTienePermisocuentacontablecredito) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetalleRetencion.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosDetalleRetencion.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosDetalleRetencion.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleretencion =(DetalleRetencion) this.detalleretencionLogic.getDetalleRetencions().toArray()[this.jTableDatosDetalleRetencion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.detalleretencion =(DetalleRetencion) this.detalleretencions.toArray()[this.jTableDatosDetalleRetencion.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualDetalleRetencion(this.getdetalleretencion(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysDetalleRetencion(this.detalleretencion);

				this.cuentacontablecreditoBeanSwingJInternalFrame=new CuentaContableBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.cuentacontablecreditoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.cuentacontablecreditoBeanSwingJInternalFrame.getCuentaContableLogic().setConnexion(this.detalleretencionLogic.getConnexion());

				if(this.detalleretencion.getid_cuenta_contable_credito()!=null) {
					this.cuentacontablecreditoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.cuentacontablecreditoBeanSwingJInternalFrame.setIdActual(this.detalleretencion.getid_cuenta_contable_credito());
					this.cuentacontablecreditoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.cuentacontablecreditoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.cuentacontablecreditoBeanSwingJInternalFrame.inicializarActualizarBindingTablaCuentaContable();
				}

				JInternalFrameBase jinternalFrame =this.cuentacontablecreditoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderDetalleRetencion=(TitledBorder)this.jScrollPanelDatosDetalleRetencion.getBorder();
				TitledBorder titledBordercuentacontablecredito=(TitledBorder)this.cuentacontablecreditoBeanSwingJInternalFrame.jScrollPanelDatosCuentaContable.getBorder();

				titledBordercuentacontablecredito.setTitle(titledBorderDetalleRetencion.getTitle() + " -> Cuenta Contable");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleretencionLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleretencionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DetalleRetencionConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleretencionLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_cuenta_contable_creditoDetalleRetencionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleretencionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetalleRetencion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDetalleRetencion(this.getdetalleretencion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleRetencion(this.detalleretencion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detalleretencion =(DetalleRetencion) this.detalleretencionLogic.getDetalleRetencions().toArray()[this.jTableDatosDetalleRetencion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.detalleretencion =(DetalleRetencion) this.detalleretencions.toArray()[this.jTableDatosDetalleRetencion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.detalleretencion==null) {
						this.detalleretencion = new DetalleRetencion();
					}

					this.setVariablesFormularioToObjetoActualDetalleRetencion(this.detalleretencion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleRetencion(this.detalleretencion);
				}

				if(this.detalleretencion.getid_cuenta_contable_credito()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_cuenta_contable_credito = "+this.detalleretencion.getid_cuenta_contable_credito().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDetalleRetencion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleretencionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleretencionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DetalleRetencionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleretencionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtondescripcionDetalleRetencionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleretencionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetalleRetencion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDetalleRetencion(this.getdetalleretencion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleRetencion(this.detalleretencion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detalleretencion =(DetalleRetencion) this.detalleretencionLogic.getDetalleRetencions().toArray()[this.jTableDatosDetalleRetencion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.detalleretencion =(DetalleRetencion) this.detalleretencions.toArray()[this.jTableDatosDetalleRetencion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.detalleretencion==null) {
						this.detalleretencion = new DetalleRetencion();
					}

					this.setVariablesFormularioToObjetoActualDetalleRetencion(this.detalleretencion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleRetencion(this.detalleretencion);
				}

				if(this.detalleretencion.getdescripcion()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where descripcion like '%"+this.detalleretencion.getdescripcion()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDetalleRetencion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleretencionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleretencionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DetalleRetencionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleretencionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonporcentajeDetalleRetencionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleretencionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetalleRetencion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDetalleRetencion(this.getdetalleretencion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleRetencion(this.detalleretencion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detalleretencion =(DetalleRetencion) this.detalleretencionLogic.getDetalleRetencions().toArray()[this.jTableDatosDetalleRetencion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.detalleretencion =(DetalleRetencion) this.detalleretencions.toArray()[this.jTableDatosDetalleRetencion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.detalleretencion==null) {
						this.detalleretencion = new DetalleRetencion();
					}

					this.setVariablesFormularioToObjetoActualDetalleRetencion(this.detalleretencion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleRetencion(this.detalleretencion);
				}

				if(this.detalleretencion.getporcentaje()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where porcentaje = "+this.detalleretencion.getporcentaje().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDetalleRetencion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleretencionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleretencionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DetalleRetencionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleretencionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonmonto_minimoDetalleRetencionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleretencionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetalleRetencion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDetalleRetencion(this.getdetalleretencion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleRetencion(this.detalleretencion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detalleretencion =(DetalleRetencion) this.detalleretencionLogic.getDetalleRetencions().toArray()[this.jTableDatosDetalleRetencion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.detalleretencion =(DetalleRetencion) this.detalleretencions.toArray()[this.jTableDatosDetalleRetencion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.detalleretencion==null) {
						this.detalleretencion = new DetalleRetencion();
					}

					this.setVariablesFormularioToObjetoActualDetalleRetencion(this.detalleretencion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleRetencion(this.detalleretencion);
				}

				if(this.detalleretencion.getmonto_minimo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where monto_minimo = "+this.detalleretencion.getmonto_minimo().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDetalleRetencion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleretencionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleretencionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DetalleRetencionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleretencionLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdCuentaContableDetalleRetencionActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleretencionLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingDetalleRetencion(false,false);

			this.getDetalleRetencionsFK_IdCuentaContable();

			this.inicializarActualizarBindingDetalleRetencion(false);

			//if(DetalleRetencionBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingDetalleRetencion(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleretencionLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleretencionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DetalleRetencionConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleretencionLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdCuentaContableCreditoDetalleRetencionActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleretencionLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingDetalleRetencion(false,false);

			this.getDetalleRetencionsFK_IdCuentaContableCredito();

			this.inicializarActualizarBindingDetalleRetencion(false);

			//if(DetalleRetencionBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingDetalleRetencion(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleretencionLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleretencionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DetalleRetencionConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleretencionLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdDetalleRetencionDetalleRetencionActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleretencionLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingDetalleRetencion(false,false);

			this.getDetalleRetencionsFK_IdDetalleRetencion();

			this.inicializarActualizarBindingDetalleRetencion(false);

			//if(DetalleRetencionBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingDetalleRetencion(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleretencionLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleretencionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DetalleRetencionConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleretencionLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaDetalleRetencionActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleretencionLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingDetalleRetencion(false,false);

			this.getDetalleRetencionsFK_IdEmpresa();

			this.inicializarActualizarBindingDetalleRetencion(false);

			//if(DetalleRetencionBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingDetalleRetencion(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleretencionLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleretencionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DetalleRetencionConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleretencionLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameDetalleRetencion() {
		if(this.jInternalFrameDetalleFormDetalleRetencion!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormDetalleRetencion!=null) {
			this.jInternalFrameDetalleFormDetalleRetencion.setVisible(false);	    			
			this.jInternalFrameDetalleFormDetalleRetencion.dispose();
			this.jInternalFrameDetalleFormDetalleRetencion=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoDetalleRetencion!=null) {
			this.jInternalFrameReporteDinamicoDetalleRetencion.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoDetalleRetencion.dispose();
			this.jInternalFrameReporteDinamicoDetalleRetencion=null;
		}
		
		if(this.jInternalFrameImportacionDetalleRetencion!=null) {
			this.jInternalFrameImportacionDetalleRetencion.setVisible(false);	    			
			this.jInternalFrameImportacionDetalleRetencion.dispose();
			this.jInternalFrameImportacionDetalleRetencion=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessDetalleRetencion();
			
			DetalleRetencionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.detalleretencion,new Object(),this.detalleretencionParameterGeneral,this.detalleretencionReturnGeneral);
			
			
			if(sTipo.equals("NuevoDetalleRetencion")) {
				jButtonNuevoDetalleRetencionActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarDetalleRetencion")) {
				jButtonDuplicarDetalleRetencionActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarDetalleRetencion")) {
				jButtonCopiarDetalleRetencionActionPerformed(evt);
			} else if(sTipo.equals("VerFormDetalleRetencion")) {
				jButtonVerFormDetalleRetencionActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarDetalleRetencion")) {
				jButtonNuevoDetalleRetencionActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarDetalleRetencion")) {
				jButtonDuplicarDetalleRetencionActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoDetalleRetencion")) {
				jButtonNuevoDetalleRetencionActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarDetalleRetencion")) {
				jButtonDuplicarDetalleRetencionActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesDetalleRetencion")) {
				jButtonNuevoDetalleRetencionActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarDetalleRetencion")) {
				jButtonNuevoDetalleRetencionActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesDetalleRetencion")) {
				jButtonNuevoDetalleRetencionActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarDetalleRetencion")) {
				jButtonModificarDetalleRetencionActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarDetalleRetencion")) {
				jButtonModificarDetalleRetencionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarDetalleRetencion")) {
				jButtonModificarDetalleRetencionActionPerformed(evt);
			} else if(sTipo.equals("ActualizarDetalleRetencion")) {
				jButtonActualizarDetalleRetencionActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarDetalleRetencion")) {
				jButtonActualizarDetalleRetencionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarDetalleRetencion")) {
				jButtonActualizarDetalleRetencionActionPerformed(evt);
			} else if(sTipo.equals("EliminarDetalleRetencion")) {
				jButtonEliminarDetalleRetencionActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarDetalleRetencion")) {
				jButtonEliminarDetalleRetencionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarDetalleRetencion")) {
				jButtonEliminarDetalleRetencionActionPerformed(evt);
			} else if(sTipo.equals("CancelarDetalleRetencion")) {
				jButtonCancelarDetalleRetencionActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarDetalleRetencion")) {
				jButtonCancelarDetalleRetencionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarDetalleRetencion")) {
				jButtonCancelarDetalleRetencionActionPerformed(evt);
			} else if(sTipo.equals("CerrarDetalleRetencion")) {
				jButtonCerrarDetalleRetencionActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarDetalleRetencion")) {
				jButtonCerrarDetalleRetencionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarDetalleRetencion")) {
				jButtonCerrarDetalleRetencionActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarDetalleRetencion")) {
				jButtonMostrarOcultarDetalleRetencionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarDetalleRetencion")) {
				jButtonCancelarDetalleRetencionActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosDetalleRetencion")) {
				jButtonGuardarCambiosDetalleRetencionActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarDetalleRetencion")) {
				jButtonGuardarCambiosDetalleRetencionActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarDetalleRetencion")) {
				jButtonCopiarDetalleRetencionActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarDetalleRetencion")) {
				jButtonVerFormDetalleRetencionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosDetalleRetencion")) {
				jButtonGuardarCambiosDetalleRetencionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarDetalleRetencion")) {
				jButtonCopiarDetalleRetencionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormDetalleRetencion")) {
				jButtonVerFormDetalleRetencionActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaDetalleRetencion")) {
				jButtonGuardarCambiosDetalleRetencionActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarDetalleRetencion")) {
				jButtonGuardarCambiosDetalleRetencionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaDetalleRetencion")) {
				jButtonGuardarCambiosDetalleRetencionActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionDetalleRetencion")) {
				jButtonRecargarInformacionDetalleRetencionActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarDetalleRetencion")) {
				jButtonRecargarInformacionDetalleRetencionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionDetalleRetencion")) {
				jButtonRecargarInformacionDetalleRetencionActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresDetalleRetencion")) {
				jButtonAnterioresDetalleRetencionActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarDetalleRetencion")) {
				jButtonAnterioresDetalleRetencionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreDetalleRetencion")) {
				jButtonAnterioresDetalleRetencionActionPerformed(evt);
			} else if(sTipo.equals("SiguientesDetalleRetencion")) {
				jButtonSiguientesDetalleRetencionActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarDetalleRetencion")) {
				jButtonSiguientesDetalleRetencionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesDetalleRetencion")) {
				jButtonSiguientesDetalleRetencionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByDetalleRetencion") || sTipo.equals("MenuItemDetalleAbrirOrderByDetalleRetencion")) {
				jButtonAbrirOrderByDetalleRetencionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarDetalleRetencion") || sTipo.equals("MenuItemDetalleMostrarOcultarDetalleRetencion")) {
				jButtonMostrarOcultarDetalleRetencionActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosDetalleRetencion")) {
				jButtonNuevoGuardarCambiosDetalleRetencionActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarDetalleRetencion")) {
				jButtonNuevoGuardarCambiosDetalleRetencionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosDetalleRetencion")) {
				jButtonNuevoGuardarCambiosDetalleRetencionActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoDetalleRetencion")) {
				jButtonCerrarReporteDinamicoDetalleRetencionActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoDetalleRetencion")) {
				jButtonGenerarReporteDinamicoDetalleRetencionActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoDetalleRetencion")) {
				
				jButtonGenerarExcelReporteDinamicoDetalleRetencionActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionDetalleRetencion")) {
				jButtonCerrarImportacionDetalleRetencionActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionDetalleRetencion")) {
				
				jButtonGenerarImportacionDetalleRetencionActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionDetalleRetencion")) {
				
				jButtonAbrirImportacionDetalleRetencionActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesDetalleRetencion")) {
				jComboBoxTiposAccionesDetalleRetencionActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesDetalleRetencion")) {
				jComboBoxTiposRelacionesDetalleRetencionActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioDetalleRetencion")) {
				jComboBoxTiposAccionesDetalleRetencionActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarDetalleRetencion")) {
				
				jComboBoxTiposSeleccionarDetalleRetencionActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralDetalleRetencion")) {
				jTextFieldValorCampoGeneralDetalleRetencionActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByDetalleRetencion")) {
				jButtonAbrirOrderByDetalleRetencionActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarDetalleRetencion")) {
				jButtonAbrirOrderByDetalleRetencionActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByDetalleRetencion")) {
				jButtonCerrarOrderByDetalleRetencionActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idDetalleRetencionBusqueda")) {
				this.jButtonidDetalleRetencionBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaDetalleRetencionUpdate")) {
				this.jButtonid_empresaDetalleRetencionUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaDetalleRetencionBusqueda")) {
				this.jButtonid_empresaDetalleRetencionBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresa_destinoDetalleRetencionUpdate")) {
				this.jButtonid_empresa_destinoDetalleRetencionUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresa_destinoDetalleRetencionBusqueda")) {
				this.jButtonid_empresa_destinoDetalleRetencionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_cuenta_contableDetalleRetencion")) {
				this.jButtonid_cuenta_contableDetalleRetencionActionPerformed(evt);
			}
			//BUSQUEDA ARBOL CAMPO
			else if(sTipo.equals("id_cuenta_contableDetalleRetencionArbol")) {
				this.abrirFrameTreeCuentaContable("BUSQUEDA_FK");
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_cuenta_contableDetalleRetencionUpdate")) {
				this.jButtonid_cuenta_contableDetalleRetencionUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_cuenta_contableDetalleRetencionBusqueda")) {
				this.jButtonid_cuenta_contableDetalleRetencionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_cuenta_contable_creditoDetalleRetencion")) {
				this.jButtonid_cuenta_contable_creditoDetalleRetencionActionPerformed(evt);
			}
			//BUSQUEDA ARBOL CAMPO
			else if(sTipo.equals("id_cuenta_contable_creditoDetalleRetencionArbol")) {
				this.abrirFrameTreeCuentaContableCredito("BUSQUEDA_FK");
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_cuenta_contable_creditoDetalleRetencionUpdate")) {
				this.jButtonid_cuenta_contable_creditoDetalleRetencionUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_cuenta_contable_creditoDetalleRetencionBusqueda")) {
				this.jButtonid_cuenta_contable_creditoDetalleRetencionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descripcionDetalleRetencionBusqueda")) {
				this.jButtondescripcionDetalleRetencionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("porcentajeDetalleRetencionBusqueda")) {
				this.jButtonporcentajeDetalleRetencionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("monto_minimoDetalleRetencionBusqueda")) {
				this.jButtonmonto_minimoDetalleRetencionBusquedaActionPerformed(evt);
			}
			
			
			else if(sTipo.equals("id_cuenta_contableDetalleRetencion")) {
				this.jButtonid_cuenta_contableDetalleRetencionActionPerformed(evt);
			}
			else if(sTipo.equals("id_cuenta_contable_creditoDetalleRetencion")) {
				this.jButtonid_cuenta_contable_creditoDetalleRetencionActionPerformed(evt);
			}
			
			
			else if(sTipo.equals("FK_IdCuentaContableDetalleRetencion")) {
				this.jButtonFK_IdCuentaContableDetalleRetencionActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdCuentaContableCreditoDetalleRetencion")) {
				this.jButtonFK_IdCuentaContableCreditoDetalleRetencionActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdDetalleRetencionDetalleRetencion")) {
				this.jButtonFK_IdDetalleRetencionDetalleRetencionActionPerformed(evt);
			}
			
			;
			
			
			DetalleRetencionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.detalleretencion,new Object(),this.detalleretencionParameterGeneral,this.detalleretencionReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleRetencionConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessDetalleRetencion();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaDetalleRetencionActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.detalleretencion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.detalleretencion);
				
				DetalleRetencionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detalleretencion,new Object(),this.detalleretencionParameterGeneral,this.detalleretencionReturnGeneral);
				
				


				
				DetalleRetencionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detalleretencion,new Object(),this.detalleretencionParameterGeneral,this.detalleretencionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DetalleRetencion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DetalleRetencion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,DetalleRetencionConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			DetalleRetencion detalleretencionLocal=null;
			
			if(!this.getEsControlTabla()) {
				detalleretencionLocal=this.detalleretencion;
			} else {
				detalleretencionLocal=this.detalleretencionAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleRetencionConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.detalleretencion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.detalleretencion);
				
				DetalleRetencionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detalleretencion,new Object(),this.detalleretencionParameterGeneral,this.detalleretencionReturnGeneral);
							
				
				


				
				DetalleRetencionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detalleretencion,new Object(),this.detalleretencionParameterGeneral,this.detalleretencionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DetalleRetencion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DetalleRetencion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleRetencionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDetalleRetencionActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosDetalleRetencion.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleretencionAnterior =(DetalleRetencion) this.detalleretencionLogic.getDetalleRetencions().toArray()[this.jTableDatosDetalleRetencion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.detalleretencionAnterior =(DetalleRetencion) this.detalleretencions.toArray()[this.jTableDatosDetalleRetencion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleRetencionConstantesFunciones.CLASSNAME);
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
			
			DetalleRetencionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detalleretencion,new Object(),this.detalleretencionParameterGeneral,this.detalleretencionReturnGeneral);
			
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
			
			


			
			DetalleRetencionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detalleretencion,new Object(),this.detalleretencionParameterGeneral,this.detalleretencionReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleRetencionConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleRetencionConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleRetencionConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaDetalleRetencionActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.detalleretencion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.detalleretencion);
				
				DetalleRetencionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detalleretencion,new Object(),this.detalleretencionParameterGeneral,this.detalleretencionReturnGeneral);
								
						
				


				
				DetalleRetencionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detalleretencion,new Object(),this.detalleretencionParameterGeneral,this.detalleretencionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DetalleRetencion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DetalleRetencion.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleRetencionConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.detalleretencion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.detalleretencion);
				
				DetalleRetencionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detalleretencion,new Object(),this.detalleretencionParameterGeneral,this.detalleretencionReturnGeneral);
								
				
				


				
				DetalleRetencionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detalleretencion,new Object(),this.detalleretencionParameterGeneral,this.detalleretencionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DetalleRetencion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DetalleRetencion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleRetencionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDetalleRetencionActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosDetalleRetencion.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleretencionAnterior =(DetalleRetencion) this.detalleretencionLogic.getDetalleRetencions().toArray()[this.jTableDatosDetalleRetencion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.detalleretencionAnterior =(DetalleRetencion) this.detalleretencions.toArray()[this.jTableDatosDetalleRetencion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleRetencionConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.detalleretencion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.detalleretencion);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleRetencionConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDetalleRetencionActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosDetalleRetencion.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleretencionAnterior =(DetalleRetencion) this.detalleretencionLogic.getDetalleRetencions().toArray()[this.jTableDatosDetalleRetencion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.detalleretencionAnterior =(DetalleRetencion) this.detalleretencions.toArray()[this.jTableDatosDetalleRetencion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleRetencionConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDetalleRetencionActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.detalleretencion);
			
			this.actualizarInformacion("INFO_PADRE",false,this.detalleretencion);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleRetencionConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.detalleretencion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.detalleretencion);
				
				DetalleRetencionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detalleretencion,new Object(),this.detalleretencionParameterGeneral,this.detalleretencionReturnGeneral);
							
				
				


				
				DetalleRetencionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detalleretencion,new Object(),this.detalleretencionParameterGeneral,this.detalleretencionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DetalleRetencion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DetalleRetencion.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleRetencionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaDetalleRetencionActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosDetalleRetencion.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detalleretencionAnterior =(DetalleRetencion) this.detalleretencionLogic.getDetalleRetencions().toArray()[this.jTableDatosDetalleRetencion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.detalleretencionAnterior =(DetalleRetencion) this.detalleretencions.toArray()[this.jTableDatosDetalleRetencion.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleRetencionConstantesFunciones.CLASSNAME);
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
			
			DetalleRetencionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detalleretencion,new Object(),this.detalleretencionParameterGeneral,this.detalleretencionReturnGeneral);
			
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
			
			


			
			DetalleRetencionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detalleretencion,new Object(),this.detalleretencionParameterGeneral,this.detalleretencionReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleRetencionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleRetencionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleRetencionConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDetalleRetencionActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.detalleretencion);
			
			this.actualizarInformacion("INFO_PADRE",false,this.detalleretencion);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleRetencionConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.detalleretencion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.detalleretencion);
				
				DetalleRetencionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detalleretencion,new Object(),this.detalleretencionParameterGeneral,this.detalleretencionReturnGeneral);
								
				
				


				
				DetalleRetencionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detalleretencion,new Object(),this.detalleretencionParameterGeneral,this.detalleretencionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DetalleRetencion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DetalleRetencion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleRetencionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDetalleRetencionActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosDetalleRetencion.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleretencionAnterior =(DetalleRetencion) this.detalleretencionLogic.getDetalleRetencions().toArray()[this.jTableDatosDetalleRetencion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.detalleretencionAnterior =(DetalleRetencion) this.detalleretencions.toArray()[this.jTableDatosDetalleRetencion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleRetencionConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDetalleRetencionActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.detalleretencion);
			
			this.actualizarInformacion("INFO_PADRE",false,this.detalleretencion);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleRetencionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaDetalleRetencionActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.detalleretencion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.detalleretencion);
				
				DetalleRetencionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.detalleretencion,new Object(),this.detalleretencionParameterGeneral,this.detalleretencionReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosDetalleRetencion")) {
					jCheckBoxSeleccionarTodosDetalleRetencionItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosDetalleRetencion")) {
					jCheckBoxSeleccionadosDetalleRetencionItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarDetalleRetencion")) {
					
				}
				
				


				
				
				DetalleRetencionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.detalleretencion,new Object(),this.detalleretencionParameterGeneral,this.detalleretencionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DetalleRetencion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DetalleRetencion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleRetencionConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.detalleretencion);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.detalleretencion);
				
				DetalleRetencionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.detalleretencion,new Object(),this.detalleretencionParameterGeneral,this.detalleretencionReturnGeneral);
												
				
				


				
				
				DetalleRetencionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.detalleretencion,new Object(),this.detalleretencionParameterGeneral,this.detalleretencionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DetalleRetencion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DetalleRetencion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleRetencionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaDetalleRetencionActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosDetalleRetencion.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detalleretencionAnterior =(DetalleRetencion) this.detalleretencionLogic.getDetalleRetencions().toArray()[this.jTableDatosDetalleRetencion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.detalleretencionAnterior =(DetalleRetencion) this.detalleretencions.toArray()[this.jTableDatosDetalleRetencion.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleRetencionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaDetalleRetencionActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.detalleretencion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.detalleretencion);
				
				DetalleRetencionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.detalleretencion,new Object(),this.detalleretencionParameterGeneral,this.detalleretencionReturnGeneral);
				
				
				DetalleRetencionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.detalleretencion,new Object(),this.detalleretencionParameterGeneral,this.detalleretencionReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleRetencionConstantesFunciones.CLASSNAME);
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
			
			DetalleRetencionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.detalleretencion,new Object(),this.detalleretencionParameterGeneral,this.detalleretencionReturnGeneral);
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
			
			


			
			DetalleRetencionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detalleretencion,new Object(),this.detalleretencionParameterGeneral,this.detalleretencionReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleRetencionConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaDetalleRetencionActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.detalleretencion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.detalleretencion);
				
				DetalleRetencionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.detalleretencion,new Object(),this.detalleretencionParameterGeneral,this.detalleretencionReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				DetalleRetencionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detalleretencion,new Object(),this.detalleretencionParameterGeneral,this.detalleretencionReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DetalleRetencion.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DetalleRetencion.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleRetencionConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.detalleretencion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.detalleretencion);
				
				DetalleRetencionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.detalleretencion,new Object(),this.detalleretencionParameterGeneral,this.detalleretencionReturnGeneral);
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
				
				


				
				DetalleRetencionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detalleretencion,new Object(),this.detalleretencionParameterGeneral,this.detalleretencionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DetalleRetencion.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DetalleRetencion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleRetencionConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDetalleRetencionActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosDetalleRetencion.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleretencionAnterior =(DetalleRetencion) this.detalleretencionLogic.getDetalleRetencions().toArray()[this.jTableDatosDetalleRetencion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.detalleretencionAnterior =(DetalleRetencion) this.detalleretencions.toArray()[this.jTableDatosDetalleRetencion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleRetencionConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				DetalleRetencionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detalleretencion,new Object(),this.detalleretencionParameterGeneral,this.detalleretencionReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarDetalleRetencion")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosDetalleRetencionListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosDetalleRetencion.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.detalleretencion =(DetalleRetencion) this.detalleretencionLogic.getDetalleRetencions().toArray()[this.jTableDatosDetalleRetencion.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.detalleretencion =(DetalleRetencion) this.detalleretencions.toArray()[this.jTableDatosDetalleRetencion.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.detalleretencion);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarDetalleRetencion")) {
				
				}
				
				DetalleRetencionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detalleretencion,new Object(),this.detalleretencionParameterGeneral,this.detalleretencionReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleRetencionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			DetalleRetencionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.detalleretencion,new Object(),this.detalleretencionParameterGeneral,this.detalleretencionReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarDetalleRetencion")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosDetalleRetencion.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarDetalleRetencion")) {
			
			}
			
			DetalleRetencionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.detalleretencion,new Object(),this.detalleretencionParameterGeneral,this.detalleretencionReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleRetencionConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessDetalleRetencion();
			
			DetalleRetencionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.detalleretencion,new Object(),this.detalleretencionParameterGeneral,this.detalleretencionReturnGeneral);
			
			if(sTipo.equals("NuevoDetalleRetencion")) {
				jButtonNuevoDetalleRetencionActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarDetalleRetencion")) {
				jButtonDuplicarDetalleRetencionActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarDetalleRetencion")) {
				jButtonCopiarDetalleRetencionActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormDetalleRetencion")) {
				jButtonVerFormDetalleRetencionActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesDetalleRetencion")) {
				jButtonNuevoDetalleRetencionActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarDetalleRetencion")) {
				jButtonModificarDetalleRetencionActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarDetalleRetencion")) {
				jButtonActualizarDetalleRetencionActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarDetalleRetencion")) {
				jButtonEliminarDetalleRetencionActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaDetalleRetencion")) {
				jButtonGuardarCambiosDetalleRetencionActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarDetalleRetencion")) {
				jButtonCancelarDetalleRetencionActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarDetalleRetencion")) {
				jButtonCerrarDetalleRetencionActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosDetalleRetencion")) {
				jButtonGuardarCambiosDetalleRetencionActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosDetalleRetencion")) {
				jButtonNuevoGuardarCambiosDetalleRetencionActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByDetalleRetencion")) {
				jButtonAbrirOrderByDetalleRetencionActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionDetalleRetencion")) {
				jButtonRecargarInformacionDetalleRetencionActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresDetalleRetencion")) {
				jButtonAnterioresDetalleRetencionActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesDetalleRetencion")) {
				jButtonSiguientesDetalleRetencionActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idDetalleRetencionBusqueda")) {
				this.jButtonidDetalleRetencionBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaDetalleRetencionUpdate")) {
				this.jButtonid_empresaDetalleRetencionUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaDetalleRetencionBusqueda")) {
				this.jButtonid_empresaDetalleRetencionBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresa_destinoDetalleRetencionUpdate")) {
				this.jButtonid_empresa_destinoDetalleRetencionUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresa_destinoDetalleRetencionBusqueda")) {
				this.jButtonid_empresa_destinoDetalleRetencionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_cuenta_contableDetalleRetencion")) {
				this.jButtonid_cuenta_contableDetalleRetencionActionPerformed(evt);
			}
			//BUSQUEDA ARBOL CAMPO
			else if(sTipo.equals("id_cuenta_contableDetalleRetencionArbol")) {
				this.abrirFrameTreeCuentaContable("BUSQUEDA_FK");
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_cuenta_contableDetalleRetencionUpdate")) {
				this.jButtonid_cuenta_contableDetalleRetencionUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_cuenta_contableDetalleRetencionBusqueda")) {
				this.jButtonid_cuenta_contableDetalleRetencionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_cuenta_contable_creditoDetalleRetencion")) {
				this.jButtonid_cuenta_contable_creditoDetalleRetencionActionPerformed(evt);
			}
			//BUSQUEDA ARBOL CAMPO
			else if(sTipo.equals("id_cuenta_contable_creditoDetalleRetencionArbol")) {
				this.abrirFrameTreeCuentaContableCredito("BUSQUEDA_FK");
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_cuenta_contable_creditoDetalleRetencionUpdate")) {
				this.jButtonid_cuenta_contable_creditoDetalleRetencionUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_cuenta_contable_creditoDetalleRetencionBusqueda")) {
				this.jButtonid_cuenta_contable_creditoDetalleRetencionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descripcionDetalleRetencionBusqueda")) {
				this.jButtondescripcionDetalleRetencionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("porcentajeDetalleRetencionBusqueda")) {
				this.jButtonporcentajeDetalleRetencionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("monto_minimoDetalleRetencionBusqueda")) {
				this.jButtonmonto_minimoDetalleRetencionBusquedaActionPerformed(evt);
			}
			
			DetalleRetencionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.detalleretencion,new Object(),this.detalleretencionParameterGeneral,this.detalleretencionReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleRetencionConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessDetalleRetencion();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			DetalleRetencionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.detalleretencion,new Object(),this.detalleretencionParameterGeneral,this.detalleretencionReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameDetalleRetencion")) {
				closingInternalFrameDetalleRetencion();
				
			} else if(sTipo.equals("jButtonCancelarDetalleRetencion")) {
				JInternalFrameBase jInternalFrameDetalleFormDetalleRetencion = (JInternalFrameBase)evt.getSource();
	            	
	            DetalleRetencionBeanSwingJInternalFrame jInternalFrameParent=(DetalleRetencionBeanSwingJInternalFrame)jInternalFrameDetalleFormDetalleRetencion.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarDetalleRetencionActionPerformed(null);
			}
			
			DetalleRetencionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.detalleretencion,new Object(),this.detalleretencionParameterGeneral,this.detalleretencionReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleRetencionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormDetalleRetencion(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormDetalleRetencion(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormDetalleRetencion(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.detalleretencion)) {
			if(!esControlTabla) {
				if(DetalleRetencionJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualDetalleRetencion(this.detalleretencion,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleRetencion(this.detalleretencion);			
				}
				
				if(this.detalleretencionSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualDetalleRetencion(this.detalleretencion,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.detalleretencionReturnGeneral=detalleretencionLogic.procesarEventosDetalleRetencionsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.detalleretencionLogic.getDetalleRetencions(),this.detalleretencion,this.detalleretencionParameterGeneral,this.isEsNuevoDetalleRetencion,classes);//this.detalleretencionLogic.getDetalleRetencion()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanDetalleRetencion(this.detalleretencionReturnGeneral,this.detalleretencionBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.detalleretencionSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanDetalleRetencion(classes,this.detalleretencionReturnGeneral,this.detalleretencionBean,false);
					}
						
					if(this.detalleretencionReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyDetalleRetencion(this.detalleretencionReturnGeneral.getDetalleRetencion());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioDetalleRetencion(this.detalleretencionReturnGeneral.getDetalleRetencion());	
					}
						
					if(this.detalleretencionReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioDetalleRetencion(this.detalleretencionReturnGeneral.getDetalleRetencion(),classes);//this.detalleretencionBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioDetalleRetencion(this.detalleretencion,classes);//this.detalleretencionBean);									
				}
			
				if(DetalleRetencionJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualDetalleRetencion(this.detalleretencion,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleRetencion(this.detalleretencion);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.detalleretencionAnterior!=null) {
						this.detalleretencion=this.detalleretencionAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.detalleretencionReturnGeneral=detalleretencionLogic.procesarEventosDetalleRetencionsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.detalleretencionLogic.getDetalleRetencions(),this.detalleretencion,this.detalleretencionParameterGeneral,this.isEsNuevoDetalleRetencion,classes);//this.detalleretencionLogic.getDetalleRetencion()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.detalleretencionSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.detalleretencionSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.detalleretencionReturnGeneral.getDetalleRetencion(),detalleretencionLogic.getDetalleRetencions());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.detalleretencionReturnGeneral.getDetalleRetencion(),this.detalleretencions);
				}
				//ARCHITECTURE
				
				//this.jTableDatosDetalleRetencion.repaint();
				
				//((AbstractTableModel) this.jTableDatosDetalleRetencion.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosDetalleRetencion();
			}
		}
	}
	
	public void actualizarVisualTableDatosDetalleRetencion() throws Exception {
		
		DetalleRetencionModel detalleretencionModel=(DetalleRetencionModel)this.jTableDatosDetalleRetencion.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			detalleretencionModel.detalleretencions=this.detalleretencionLogic.getDetalleRetencions();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			detalleretencionModel.detalleretencions=this.detalleretencions;
		}
		
		
		((DetalleRetencionModel) this.jTableDatosDetalleRetencion.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaDetalleRetencion() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getdetalleretencionAnterior(),this.detalleretencionLogic.getDetalleRetencions());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getdetalleretencionAnterior(),this.detalleretencions);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosDetalleRetencion();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioDetalleRetencion(DetalleRetencion detalleretencion,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleRetencionConstantesFunciones.CLASSNAME);
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
										
				DetalleRetencionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.detalleretencion,new Object(),generalEntityParameterGeneral,this.detalleretencionReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.detalleretencionSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=DetalleRetencionConstantesFunciones.getClassesRelationshipsOfDetalleRetencion(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=DetalleRetencionConstantesFunciones.getClassesRelationshipsFromStringsOfDetalleRetencion(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormDetalleRetencion(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				DetalleRetencionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.detalleretencion,new Object(),generalEntityParameterGeneral,this.detalleretencionReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleRetencionConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioDetalleRetencion(DetalleRetencionBean detalleretencionBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleRetencionConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanDetalleRetencion(ArrayList<Classe> classes,DetalleRetencionReturnGeneral detalleretencionReturnGeneral,DetalleRetencionBean detalleretencionBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualDetalleRetencion(DetalleRetencion detalleretencion,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.detalleretencion)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormDetalleRetencion = new DetalleRetencionDetalleFormJInternalFrame(jDesktopPane,this.detalleretencionSessionBean.getConGuardarRelaciones(),this.detalleretencionSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormDetalleRetencion);
		this.jInternalFrameDetalleFormDetalleRetencion.setVisible(false);
		this.jInternalFrameDetalleFormDetalleRetencion.setSelected(false);						
		
		this.jInternalFrameDetalleFormDetalleRetencion.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormDetalleRetencion.detalleretencionLogic=this.detalleretencionLogic;
		
		this.cargarCombosFrameForeignKeyDetalleRetencion("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleDetalleRetencion();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleDetalleRetencion();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyDetalleRetencion("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyDetalleRetencion();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormDetalleRetencion.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarDetalleRetencion"));
		
		this.jInternalFrameDetalleFormDetalleRetencion.jButtonModificarDetalleRetencion.addActionListener(new ButtonActionListener(this,"ModificarDetalleRetencion"));

		
		this.jInternalFrameDetalleFormDetalleRetencion.jButtonModificarToolBarDetalleRetencion.addActionListener(new ButtonActionListener(this,"ModificarToolBarDetalleRetencion"));
					
		this.jInternalFrameDetalleFormDetalleRetencion.jMenuItemModificarDetalleRetencion.addActionListener(new ButtonActionListener(this,"MenuItemModificarDetalleRetencion"));		
		
		
		
		this.jInternalFrameDetalleFormDetalleRetencion.jButtonActualizarDetalleRetencion.addActionListener (new ButtonActionListener(this,"ActualizarDetalleRetencion"));
		
		
		this.jInternalFrameDetalleFormDetalleRetencion.jButtonActualizarToolBarDetalleRetencion.addActionListener(new ButtonActionListener(this,"ActualizarToolBarDetalleRetencion"));
						
		this.jInternalFrameDetalleFormDetalleRetencion.jMenuItemActualizarDetalleRetencion.addActionListener (new ButtonActionListener(this,"MenuItemActualizarDetalleRetencion"));		
		
		
		
		this.jInternalFrameDetalleFormDetalleRetencion.jButtonEliminarDetalleRetencion.addActionListener (new ButtonActionListener(this,"EliminarDetalleRetencion"));
		
		
		this.jInternalFrameDetalleFormDetalleRetencion.jButtonEliminarToolBarDetalleRetencion.addActionListener (new ButtonActionListener(this,"EliminarToolBarDetalleRetencion"));
								
		this.jInternalFrameDetalleFormDetalleRetencion.jMenuItemEliminarDetalleRetencion.addActionListener (new ButtonActionListener(this,"MenuItemEliminarDetalleRetencion"));		
		
		
		
		this.jInternalFrameDetalleFormDetalleRetencion.jButtonCancelarDetalleRetencion.addActionListener (new ButtonActionListener(this,"CancelarDetalleRetencion"));
		
		
		this.jInternalFrameDetalleFormDetalleRetencion.jButtonCancelarToolBarDetalleRetencion.addActionListener (new ButtonActionListener(this,"CancelarToolBarDetalleRetencion"));
					
		this.jInternalFrameDetalleFormDetalleRetencion.jMenuItemCancelarDetalleRetencion.addActionListener (new ButtonActionListener(this,"MenuItemCancelarDetalleRetencion"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormDetalleRetencion.jMenuItemDetalleCerrarDetalleRetencion.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarDetalleRetencion"));		
		
		
		
		this.jInternalFrameDetalleFormDetalleRetencion.jButtonGuardarCambiosToolBarDetalleRetencion.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarDetalleRetencion"));
		
		
		
		this.jInternalFrameDetalleFormDetalleRetencion.jButtonGuardarCambiosToolBarDetalleRetencion.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarDetalleRetencion"));
		
		
		
		this.jInternalFrameDetalleFormDetalleRetencion.jComboBoxTiposAccionesFormularioDetalleRetencion.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioDetalleRetencion"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleRetencion.jButtonidDetalleRetencionBusqueda.addActionListener(new ButtonActionListener(this,"idDetalleRetencionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetalleRetencion.jButtonid_empresaDetalleRetencionUpdate.addActionListener(new ButtonActionListener(this,"id_empresaDetalleRetencionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleRetencion.jButtonid_empresaDetalleRetencionBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaDetalleRetencionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetalleRetencion.jButtonid_empresa_destinoDetalleRetencionUpdate.addActionListener(new ButtonActionListener(this,"id_empresa_destinoDetalleRetencionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleRetencion.jButtonid_empresa_destinoDetalleRetencionBusqueda.addActionListener(new ButtonActionListener(this,"id_empresa_destinoDetalleRetencionBusqueda"));
		//jButtonid_cuenta_contableDetalleRetencion.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_cuenta_contableDetalleRetencionActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormDetalleRetencion.jButtonid_cuenta_contableDetalleRetencion.addActionListener(new ButtonActionListener(this,"id_cuenta_contableDetalleRetencion"));
		//jButtonid_cuenta_contableDetalleRetencionArbol.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			abrirFrameTreeCuentaContable("BUSQUEDA_FK");
		//		}
		//	}
		//);

		//BUSQUEDA ARBOL CAMPO
		this.jInternalFrameDetalleFormDetalleRetencion.jButtonid_cuenta_contableDetalleRetencionArbol.addActionListener(new ButtonActionListener(this,"id_cuenta_contableDetalleRetencionArbol"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetalleRetencion.jButtonid_cuenta_contableDetalleRetencionUpdate.addActionListener(new ButtonActionListener(this,"id_cuenta_contableDetalleRetencionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleRetencion.jButtonid_cuenta_contableDetalleRetencionBusqueda.addActionListener(new ButtonActionListener(this,"id_cuenta_contableDetalleRetencionBusqueda"));
		//jButtonid_cuenta_contable_creditoDetalleRetencion.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_cuenta_contable_creditoDetalleRetencionActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormDetalleRetencion.jButtonid_cuenta_contable_creditoDetalleRetencion.addActionListener(new ButtonActionListener(this,"id_cuenta_contable_creditoDetalleRetencion"));
		//jButtonid_cuenta_contable_creditoDetalleRetencionArbol.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			abrirFrameTreeCuentaContableCredito("BUSQUEDA_FK");
		//		}
		//	}
		//);

		//BUSQUEDA ARBOL CAMPO
		this.jInternalFrameDetalleFormDetalleRetencion.jButtonid_cuenta_contable_creditoDetalleRetencionArbol.addActionListener(new ButtonActionListener(this,"id_cuenta_contable_creditoDetalleRetencionArbol"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetalleRetencion.jButtonid_cuenta_contable_creditoDetalleRetencionUpdate.addActionListener(new ButtonActionListener(this,"id_cuenta_contable_creditoDetalleRetencionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleRetencion.jButtonid_cuenta_contable_creditoDetalleRetencionBusqueda.addActionListener(new ButtonActionListener(this,"id_cuenta_contable_creditoDetalleRetencionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleRetencion.jButtondescripcionDetalleRetencionBusqueda.addActionListener(new ButtonActionListener(this,"descripcionDetalleRetencionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleRetencion.jButtonporcentajeDetalleRetencionBusqueda.addActionListener(new ButtonActionListener(this,"porcentajeDetalleRetencionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleRetencion.jButtonmonto_minimoDetalleRetencionBusqueda.addActionListener(new ButtonActionListener(this,"monto_minimoDetalleRetencionBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormDetalleRetencion.jTabbedPaneRelacionesDetalleRetencion.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesDetalleRetencion"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameDetalleRetencion"));
		
		if(this.jInternalFrameDetalleFormDetalleRetencion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetalleRetencion.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarDetalleRetencion"));
		}
		
		this.jTableDatosDetalleRetencion.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarDetalleRetencion"));
		
		this.jTableDatosDetalleRetencion.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarDetalleRetencion"));
		
		this.jButtonNuevoDetalleRetencion.addActionListener(new ButtonActionListener(this,"NuevoDetalleRetencion"));
		
		this.jButtonDuplicarDetalleRetencion.addActionListener(new ButtonActionListener(this,"DuplicarDetalleRetencion"));
		
		this.jButtonCopiarDetalleRetencion.addActionListener(new ButtonActionListener(this,"CopiarDetalleRetencion"));
		
		this.jButtonVerFormDetalleRetencion.addActionListener(new ButtonActionListener(this,"VerFormDetalleRetencion"));
		
		
		this.jButtonNuevoToolBarDetalleRetencion.addActionListener(new ButtonActionListener(this,"NuevoToolBarDetalleRetencion"));
			
		this.jButtonDuplicarToolBarDetalleRetencion.addActionListener(new ButtonActionListener(this,"DuplicarToolBarDetalleRetencion"));
			
		this.jMenuItemNuevoDetalleRetencion.addActionListener (new ButtonActionListener(this,"MenuItemNuevoDetalleRetencion"));
			
		this.jMenuItemDuplicarDetalleRetencion.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarDetalleRetencion"));		
		
		
		this.jButtonNuevoRelacionesDetalleRetencion.addActionListener (new ButtonActionListener(this,"NuevoRelacionesDetalleRetencion"));
		
		
		this.jButtonNuevoRelacionesToolBarDetalleRetencion.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarDetalleRetencion"));
			
		this.jMenuItemNuevoRelacionesDetalleRetencion.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesDetalleRetencion"));		
		
		
		if(this.jInternalFrameDetalleFormDetalleRetencion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetalleRetencion.jButtonModificarDetalleRetencion.addActionListener(new ButtonActionListener(this,"ModificarDetalleRetencion"));
		}
		
		
		if(this.jInternalFrameDetalleFormDetalleRetencion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetalleRetencion.jButtonModificarToolBarDetalleRetencion.addActionListener(new ButtonActionListener(this,"ModificarToolBarDetalleRetencion"));
			
			this.jInternalFrameDetalleFormDetalleRetencion.jMenuItemModificarDetalleRetencion.addActionListener(new ButtonActionListener(this,"MenuItemModificarDetalleRetencion"));		
		}
		
		
		if(this.jInternalFrameDetalleFormDetalleRetencion!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormDetalleRetencion.jButtonActualizarDetalleRetencion.addActionListener (new ButtonActionListener(this,"ActualizarDetalleRetencion"));
		}
		
		
		if(this.jInternalFrameDetalleFormDetalleRetencion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetalleRetencion.jButtonActualizarToolBarDetalleRetencion.addActionListener(new ButtonActionListener(this,"ActualizarToolBarDetalleRetencion"));
				
			this.jInternalFrameDetalleFormDetalleRetencion.jMenuItemActualizarDetalleRetencion.addActionListener (new ButtonActionListener(this,"MenuItemActualizarDetalleRetencion"));		
		}
		
		
		if(this.jInternalFrameDetalleFormDetalleRetencion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetalleRetencion.jButtonEliminarDetalleRetencion.addActionListener (new ButtonActionListener(this,"EliminarDetalleRetencion"));
		}
		
		
		if(this.jInternalFrameDetalleFormDetalleRetencion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetalleRetencion.jButtonEliminarToolBarDetalleRetencion.addActionListener (new ButtonActionListener(this,"EliminarToolBarDetalleRetencion"));
						
			this.jInternalFrameDetalleFormDetalleRetencion.jMenuItemEliminarDetalleRetencion.addActionListener (new ButtonActionListener(this,"MenuItemEliminarDetalleRetencion"));		
		}
		
		
		if(this.jInternalFrameDetalleFormDetalleRetencion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetalleRetencion.jButtonCancelarDetalleRetencion.addActionListener (new ButtonActionListener(this,"CancelarDetalleRetencion"));
		}
		
		
		if(this.jInternalFrameDetalleFormDetalleRetencion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetalleRetencion.jButtonCancelarToolBarDetalleRetencion.addActionListener (new ButtonActionListener(this,"CancelarToolBarDetalleRetencion"));
			
			this.jInternalFrameDetalleFormDetalleRetencion.jMenuItemCancelarDetalleRetencion.addActionListener (new ButtonActionListener(this,"MenuItemCancelarDetalleRetencion"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarDetalleRetencion.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarDetalleRetencion"));		
		
		
		this.jButtonCerrarDetalleRetencion.addActionListener (new ButtonActionListener(this,"CerrarDetalleRetencion"));
		
		
		this.jButtonCerrarToolBarDetalleRetencion.addActionListener (new ButtonActionListener(this,"CerrarToolBarDetalleRetencion"));
			
		this.jMenuItemCerrarDetalleRetencion.addActionListener (new ButtonActionListener(this,"MenuItemCerrarDetalleRetencion"));
			
		if(this.jInternalFrameDetalleFormDetalleRetencion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetalleRetencion.jMenuItemDetalleCerrarDetalleRetencion.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarDetalleRetencion"));		
		}
		
		
		if(this.jInternalFrameDetalleFormDetalleRetencion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetalleRetencion.jButtonGuardarCambiosDetalleRetencion.addActionListener (new ButtonActionListener(this,"GuardarCambiosDetalleRetencion"));
		}
		
		
		if(this.jInternalFrameDetalleFormDetalleRetencion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetalleRetencion.jButtonGuardarCambiosToolBarDetalleRetencion.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarDetalleRetencion"));
		}
		
		this.jButtonCopiarToolBarDetalleRetencion.addActionListener (new ButtonActionListener(this,"CopiarToolBarDetalleRetencion"));
			
		this.jButtonVerFormToolBarDetalleRetencion.addActionListener (new ButtonActionListener(this,"VerFormToolBarDetalleRetencion"));
		
		this.jMenuItemGuardarCambiosDetalleRetencion.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosDetalleRetencion"));
			
		this.jMenuItemCopiarDetalleRetencion.addActionListener (new ButtonActionListener(this,"MenuItemCopiarDetalleRetencion"));		
		
		this.jMenuItemVerFormDetalleRetencion.addActionListener (new ButtonActionListener(this,"MenuItemVerFormDetalleRetencion"));		
		
		
		this.jButtonGuardarCambiosTablaDetalleRetencion.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaDetalleRetencion"));
		
		
		this.jButtonGuardarCambiosTablaToolBarDetalleRetencion.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarDetalleRetencion"));
			
		this.jMenuItemGuardarCambiosTablaDetalleRetencion.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaDetalleRetencion"));		
		
		
		
		this.jButtonRecargarInformacionDetalleRetencion.addActionListener (new ButtonActionListener(this,"RecargarInformacionDetalleRetencion"));
					
		this.jButtonRecargarInformacionToolBarDetalleRetencion.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarDetalleRetencion"));
		
		this.jMenuItemRecargarInformacionDetalleRetencion.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionDetalleRetencion"));		
		
		
		
		this.jButtonAnterioresDetalleRetencion.addActionListener (new ButtonActionListener(this,"AnterioresDetalleRetencion"));
		
		
		this.jButtonAnterioresToolBarDetalleRetencion.addActionListener (new ButtonActionListener(this,"AnterioresToolBarDetalleRetencion"));
		
		this.jMenuItemAnterioresDetalleRetencion.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresDetalleRetencion"));		
		
		
		this.jButtonSiguientesDetalleRetencion.addActionListener (new ButtonActionListener(this,"SiguientesDetalleRetencion"));
		
		
		this.jButtonSiguientesToolBarDetalleRetencion.addActionListener (new ButtonActionListener(this,"SiguientesToolBarDetalleRetencion"));
			
		this.jMenuItemSiguientesDetalleRetencion.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesDetalleRetencion"));
			
		this.jMenuItemAbrirOrderByDetalleRetencion.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByDetalleRetencion"));
			
		this.jMenuItemMostrarOcultarDetalleRetencion.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarDetalleRetencion"));
			
		this.jMenuItemDetalleAbrirOrderByDetalleRetencion.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByDetalleRetencion"));
			
		this.jMenuItemDetalleMostarOcultarDetalleRetencion.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarDetalleRetencion"));		
		
		
		this.jButtonNuevoGuardarCambiosDetalleRetencion.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosDetalleRetencion"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarDetalleRetencion.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarDetalleRetencion"));
			
		this.jMenuItemNuevoGuardarCambiosDetalleRetencion.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosDetalleRetencion"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosDetalleRetencion.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosDetalleRetencion"));

		this.jCheckBoxSeleccionadosDetalleRetencion.addItemListener(new CheckBoxItemListener(this,"SeleccionadosDetalleRetencion"));
		
		if(this.jInternalFrameDetalleFormDetalleRetencion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetalleRetencion.jComboBoxTiposAccionesFormularioDetalleRetencion.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioDetalleRetencion"));
		}
		
		
		this.jComboBoxTiposRelacionesDetalleRetencion.addActionListener (new ButtonActionListener(this,"TiposRelacionesDetalleRetencion"));
			
		this.jComboBoxTiposAccionesDetalleRetencion.addActionListener (new ButtonActionListener(this,"TiposAccionesDetalleRetencion"));
					
		this.jComboBoxTiposSeleccionarDetalleRetencion.addActionListener (new ButtonActionListener(this,"TiposSeleccionarDetalleRetencion"));
			
		this.jTextFieldValorCampoGeneralDetalleRetencion.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralDetalleRetencion"));		
		
		
		if(this.jInternalFrameDetalleFormDetalleRetencion!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleRetencion.jButtonidDetalleRetencionBusqueda.addActionListener(new ButtonActionListener(this,"idDetalleRetencionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetalleRetencion.jButtonid_empresaDetalleRetencionUpdate.addActionListener(new ButtonActionListener(this,"id_empresaDetalleRetencionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleRetencion.jButtonid_empresaDetalleRetencionBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaDetalleRetencionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetalleRetencion.jButtonid_empresa_destinoDetalleRetencionUpdate.addActionListener(new ButtonActionListener(this,"id_empresa_destinoDetalleRetencionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleRetencion.jButtonid_empresa_destinoDetalleRetencionBusqueda.addActionListener(new ButtonActionListener(this,"id_empresa_destinoDetalleRetencionBusqueda"));
		//jButtonid_cuenta_contableDetalleRetencion.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_cuenta_contableDetalleRetencionActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormDetalleRetencion.jButtonid_cuenta_contableDetalleRetencion.addActionListener(new ButtonActionListener(this,"id_cuenta_contableDetalleRetencion"));
		//jButtonid_cuenta_contableDetalleRetencionArbol.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			abrirFrameTreeCuentaContable("BUSQUEDA_FK");
		//		}
		//	}
		//);

		//BUSQUEDA ARBOL CAMPO
		this.jInternalFrameDetalleFormDetalleRetencion.jButtonid_cuenta_contableDetalleRetencionArbol.addActionListener(new ButtonActionListener(this,"id_cuenta_contableDetalleRetencionArbol"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetalleRetencion.jButtonid_cuenta_contableDetalleRetencionUpdate.addActionListener(new ButtonActionListener(this,"id_cuenta_contableDetalleRetencionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleRetencion.jButtonid_cuenta_contableDetalleRetencionBusqueda.addActionListener(new ButtonActionListener(this,"id_cuenta_contableDetalleRetencionBusqueda"));
		//jButtonid_cuenta_contable_creditoDetalleRetencion.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_cuenta_contable_creditoDetalleRetencionActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormDetalleRetencion.jButtonid_cuenta_contable_creditoDetalleRetencion.addActionListener(new ButtonActionListener(this,"id_cuenta_contable_creditoDetalleRetencion"));
		//jButtonid_cuenta_contable_creditoDetalleRetencionArbol.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			abrirFrameTreeCuentaContableCredito("BUSQUEDA_FK");
		//		}
		//	}
		//);

		//BUSQUEDA ARBOL CAMPO
		this.jInternalFrameDetalleFormDetalleRetencion.jButtonid_cuenta_contable_creditoDetalleRetencionArbol.addActionListener(new ButtonActionListener(this,"id_cuenta_contable_creditoDetalleRetencionArbol"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetalleRetencion.jButtonid_cuenta_contable_creditoDetalleRetencionUpdate.addActionListener(new ButtonActionListener(this,"id_cuenta_contable_creditoDetalleRetencionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleRetencion.jButtonid_cuenta_contable_creditoDetalleRetencionBusqueda.addActionListener(new ButtonActionListener(this,"id_cuenta_contable_creditoDetalleRetencionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleRetencion.jButtondescripcionDetalleRetencionBusqueda.addActionListener(new ButtonActionListener(this,"descripcionDetalleRetencionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleRetencion.jButtonporcentajeDetalleRetencionBusqueda.addActionListener(new ButtonActionListener(this,"porcentajeDetalleRetencionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleRetencion.jButtonmonto_minimoDetalleRetencionBusqueda.addActionListener(new ButtonActionListener(this,"monto_minimoDetalleRetencionBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonFK_IdCuentaContableDetalleRetencion.addActionListener(new ButtonActionListener(this,"FK_IdCuentaContableDetalleRetencion"));

			this.jButtonBuscarFK_IdCuentaContableid_cuenta_contableDetalleRetencion.addActionListener(new ButtonActionListener(this,"id_cuenta_contableDetalleRetencion"));

			this.jButtonFK_IdCuentaContableCreditoDetalleRetencion.addActionListener(new ButtonActionListener(this,"FK_IdCuentaContableCreditoDetalleRetencion"));

			this.jButtonBuscarFK_IdCuentaContableCreditoid_cuenta_contable_creditoDetalleRetencion.addActionListener(new ButtonActionListener(this,"id_cuenta_contable_creditoDetalleRetencion"));

			this.jButtonFK_IdDetalleRetencionDetalleRetencion.addActionListener(new ButtonActionListener(this,"FK_IdDetalleRetencionDetalleRetencion"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoDetalleRetencion!=null) {
				this.jInternalFrameReporteDinamicoDetalleRetencion.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoDetalleRetencion"));
				this.jInternalFrameReporteDinamicoDetalleRetencion.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoDetalleRetencion"));
				this.jInternalFrameReporteDinamicoDetalleRetencion.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoDetalleRetencion"));
			}
			
			//this.jButtonCerrarReporteDinamicoDetalleRetencion.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoDetalleRetencion"));				
			//this.jButtonGenerarReporteDinamicoDetalleRetencion.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoDetalleRetencion"));
			//this.jButtonGenerarExcelReporteDinamicoDetalleRetencion.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoDetalleRetencion"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionDetalleRetencion!=null) {
				this.jInternalFrameImportacionDetalleRetencion.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionDetalleRetencion"));
				this.jInternalFrameImportacionDetalleRetencion.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionDetalleRetencion"));
				this.jInternalFrameImportacionDetalleRetencion.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionDetalleRetencion"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByDetalleRetencion.addActionListener (new ButtonActionListener(this,"AbrirOrderByDetalleRetencion"));
			
			this.jButtonAbrirOrderByToolBarDetalleRetencion.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarDetalleRetencion"));			
			
			if(this.jInternalFrameOrderByDetalleRetencion!=null) {
				this.jInternalFrameOrderByDetalleRetencion.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByDetalleRetencion"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormDetalleRetencion!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormDetalleRetencion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetalleRetencion.jTabbedPaneRelacionesDetalleRetencion.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesDetalleRetencion"));
		
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
            		closingInternalFrameDetalleRetencion();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormDetalleRetencion.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormDetalleRetencion = (JInternalFrameBase)event.getSource();
	            	
	            DetalleRetencionBeanSwingJInternalFrame jInternalFrameParent=(DetalleRetencionBeanSwingJInternalFrame)jInternalFrameDetalleFormDetalleRetencion.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarDetalleRetencionActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosDetalleRetencion.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosDetalleRetencionListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosDetalleRetencion.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosDetalleRetencion.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoDetalleRetencion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoDetalleRetencionActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarDetalleRetencion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoDetalleRetencionActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoDetalleRetencion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoDetalleRetencionActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoDetalleRetencion";
		inputMap = this.jButtonNuevoDetalleRetencion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoDetalleRetencion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoDetalleRetencionActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesDetalleRetencion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoDetalleRetencionActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarDetalleRetencion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoDetalleRetencionActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesDetalleRetencion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoDetalleRetencionActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesDetalleRetencion";
		inputMap = this.jButtonNuevoRelacionesDetalleRetencion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesDetalleRetencion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoDetalleRetencionActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarDetalleRetencion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarDetalleRetencionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarDetalleRetencion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarDetalleRetencionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarDetalleRetencion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarDetalleRetencionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarDetalleRetencion";
		inputMap = this.jButtonModificarDetalleRetencion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarDetalleRetencion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarDetalleRetencionActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarDetalleRetencion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarDetalleRetencionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarDetalleRetencion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarDetalleRetencionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarDetalleRetencion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarDetalleRetencionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarDetalleRetencion";
		inputMap = this.jButtonActualizarDetalleRetencion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarDetalleRetencion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarDetalleRetencionActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarDetalleRetencion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarDetalleRetencionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarDetalleRetencion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarDetalleRetencionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarDetalleRetencion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarDetalleRetencionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarDetalleRetencion";
		inputMap = this.jButtonEliminarDetalleRetencion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarDetalleRetencion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarDetalleRetencionActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarDetalleRetencion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarDetalleRetencionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarDetalleRetencion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarDetalleRetencionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarDetalleRetencion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarDetalleRetencionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarDetalleRetencion";
		inputMap = this.jButtonCancelarDetalleRetencion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarDetalleRetencion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarDetalleRetencionActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarDetalleRetencion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarDetalleRetencionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarDetalleRetencion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarDetalleRetencionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarDetalleRetencion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarDetalleRetencionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarDetalleRetencion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarDetalleRetencionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarDetalleRetencionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarDetalleRetencion";
		inputMap = this.jButtonCerrarDetalleRetencion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarDetalleRetencion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarDetalleRetencionActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormDetalleRetencion.jButtonGuardarCambiosDetalleRetencion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosDetalleRetencionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarDetalleRetencion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosDetalleRetencionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosDetalleRetencion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosDetalleRetencionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaDetalleRetencion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosDetalleRetencionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarDetalleRetencion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosDetalleRetencionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaDetalleRetencion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosDetalleRetencionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosDetalleRetencion";
		inputMap = this.jInternalFrameDetalleFormDetalleRetencion.jButtonGuardarCambiosDetalleRetencion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormDetalleRetencion.jButtonGuardarCambiosDetalleRetencion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosDetalleRetencionActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionDetalleRetencion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionDetalleRetencionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarDetalleRetencion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionDetalleRetencionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionDetalleRetencion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionDetalleRetencionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresDetalleRetencion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresDetalleRetencionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarDetalleRetencion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresDetalleRetencionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresDetalleRetencion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresDetalleRetencionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesDetalleRetencion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesDetalleRetencionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarDetalleRetencion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesDetalleRetencionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesDetalleRetencion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesDetalleRetencionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosDetalleRetencion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosDetalleRetencionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarDetalleRetencion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosDetalleRetencionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosDetalleRetencion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosDetalleRetencionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosDetalleRetencion.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosDetalleRetencionItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesDetalleRetencion.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesDetalleRetencionActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarDetalleRetencion.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarDetalleRetencionActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralDetalleRetencion.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralDetalleRetencionActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleRetencion.jButtonidDetalleRetencionBusqueda.addActionListener(new ButtonActionListener(this,"idDetalleRetencionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetalleRetencion.jButtonid_empresaDetalleRetencionUpdate.addActionListener(new ButtonActionListener(this,"id_empresaDetalleRetencionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleRetencion.jButtonid_empresaDetalleRetencionBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaDetalleRetencionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetalleRetencion.jButtonid_empresa_destinoDetalleRetencionUpdate.addActionListener(new ButtonActionListener(this,"id_empresa_destinoDetalleRetencionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleRetencion.jButtonid_empresa_destinoDetalleRetencionBusqueda.addActionListener(new ButtonActionListener(this,"id_empresa_destinoDetalleRetencionBusqueda"));
		//jButtonid_cuenta_contableDetalleRetencion.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_cuenta_contableDetalleRetencionActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormDetalleRetencion.jButtonid_cuenta_contableDetalleRetencion.addActionListener(new ButtonActionListener(this,"id_cuenta_contableDetalleRetencion"));
		//jButtonid_cuenta_contableDetalleRetencionArbol.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			abrirFrameTreeCuentaContable("BUSQUEDA_FK");
		//		}
		//	}
		//);

		//BUSQUEDA ARBOL CAMPO
		this.jInternalFrameDetalleFormDetalleRetencion.jButtonid_cuenta_contableDetalleRetencionArbol.addActionListener(new ButtonActionListener(this,"id_cuenta_contableDetalleRetencionArbol"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetalleRetencion.jButtonid_cuenta_contableDetalleRetencionUpdate.addActionListener(new ButtonActionListener(this,"id_cuenta_contableDetalleRetencionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleRetencion.jButtonid_cuenta_contableDetalleRetencionBusqueda.addActionListener(new ButtonActionListener(this,"id_cuenta_contableDetalleRetencionBusqueda"));
		//jButtonid_cuenta_contable_creditoDetalleRetencion.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_cuenta_contable_creditoDetalleRetencionActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormDetalleRetencion.jButtonid_cuenta_contable_creditoDetalleRetencion.addActionListener(new ButtonActionListener(this,"id_cuenta_contable_creditoDetalleRetencion"));
		//jButtonid_cuenta_contable_creditoDetalleRetencionArbol.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			abrirFrameTreeCuentaContableCredito("BUSQUEDA_FK");
		//		}
		//	}
		//);

		//BUSQUEDA ARBOL CAMPO
		this.jInternalFrameDetalleFormDetalleRetencion.jButtonid_cuenta_contable_creditoDetalleRetencionArbol.addActionListener(new ButtonActionListener(this,"id_cuenta_contable_creditoDetalleRetencionArbol"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetalleRetencion.jButtonid_cuenta_contable_creditoDetalleRetencionUpdate.addActionListener(new ButtonActionListener(this,"id_cuenta_contable_creditoDetalleRetencionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleRetencion.jButtonid_cuenta_contable_creditoDetalleRetencionBusqueda.addActionListener(new ButtonActionListener(this,"id_cuenta_contable_creditoDetalleRetencionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleRetencion.jButtondescripcionDetalleRetencionBusqueda.addActionListener(new ButtonActionListener(this,"descripcionDetalleRetencionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleRetencion.jButtonporcentajeDetalleRetencionBusqueda.addActionListener(new ButtonActionListener(this,"porcentajeDetalleRetencionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleRetencion.jButtonmonto_minimoDetalleRetencionBusqueda.addActionListener(new ButtonActionListener(this,"monto_minimoDetalleRetencionBusqueda"));
		
		
		this.jButtonFK_IdCuentaContableDetalleRetencion.addActionListener(new ButtonActionListener(this,"FK_IdCuentaContableDetalleRetencion"));

		this.jButtonBuscarFK_IdCuentaContableid_cuenta_contableDetalleRetencion.addActionListener(new ButtonActionListener(this,"id_cuenta_contableDetalleRetencion"));

		this.jButtonFK_IdCuentaContableCreditoDetalleRetencion.addActionListener(new ButtonActionListener(this,"FK_IdCuentaContableCreditoDetalleRetencion"));

		this.jButtonBuscarFK_IdCuentaContableCreditoid_cuenta_contable_creditoDetalleRetencion.addActionListener(new ButtonActionListener(this,"id_cuenta_contable_creditoDetalleRetencion"));

		this.jButtonFK_IdDetalleRetencionDetalleRetencion.addActionListener(new ButtonActionListener(this,"FK_IdDetalleRetencionDetalleRetencion"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoDetalleRetencion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoDetalleRetencionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoDetalleRetencion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoDetalleRetencionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoDetalleRetencion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoDetalleRetencionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionDetalleRetencion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionDetalleRetencionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionDetalleRetencion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionDetalleRetencionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionDetalleRetencion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionDetalleRetencionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarDetalleRetencionActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarDetalleRetencion.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleRetencionConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosDetalleRetencion(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(DetalleRetencion detalleretencionAux:this.detalleretencionLogic.getDetalleRetencions()) {
					detalleretencionAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(DetalleRetencion detalleretencionAux:detalleretencions) {
					detalleretencionAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleRetencionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosDetalleRetencionItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingDetalleRetencion(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(DetalleRetencion detalleretencionAux:this.detalleretencionLogic.getDetalleRetencions()) {
						detalleretencionAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(DetalleRetencion detalleretencionAux:detalleretencions) {
						detalleretencionAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(DetalleRetencion detalleretencionAux:this.detalleretencionLogic.getDetalleRetencions()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(DetalleRetencion detalleretencionAux:detalleretencions) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaDetalleRetencion(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosDetalleRetencion.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosDetalleRetencion.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosDetalleRetencion,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleRetencionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosDetalleRetencionItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingDetalleRetencion(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosDetalleRetencion.getSelectedRows();
			
			DetalleRetencion detalleretencionLocal=new DetalleRetencion();
			
			//this.seleccionarTodosDetalleRetencion(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					detalleretencionLocal =(DetalleRetencion) this.detalleretencionLogic.getDetalleRetencions().toArray()[this.jTableDatosDetalleRetencion.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					detalleretencionLocal =(DetalleRetencion) this.detalleretencions.toArray()[this.jTableDatosDetalleRetencion.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				detalleretencionLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(DetalleRetencion detalleretencionAux:this.detalleretencionLogic.getDetalleRetencions()) {
						detalleretencionAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(DetalleRetencion detalleretencionAux:detalleretencions) {
						detalleretencionAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaDetalleRetencion(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosDetalleRetencion.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosDetalleRetencion.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosDetalleRetencion,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleRetencionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualDetalleRetencionItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleRetencionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarDetalleRetencionParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleRetencionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralDetalleRetencionActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingDetalleRetencion(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralDetalleRetencion.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(DetalleRetencion detalleretencionAux:this.detalleretencionLogic.getDetalleRetencions()) {
				
						if(sTipoSeleccionar.equals(DetalleRetencionConstantesFunciones.LABEL_DESCRIPCION)) {
							existe=true;
							detalleretencionAux.setdescripcion(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(DetalleRetencionConstantesFunciones.LABEL_PORCENTAJE)) {
							existe=true;
							detalleretencionAux.setporcentaje(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(DetalleRetencionConstantesFunciones.LABEL_MONTOMINIMO)) {
							existe=true;
							detalleretencionAux.setmonto_minimo(Double.parseDouble(this.sValorCampoGeneral));
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(DetalleRetencion detalleretencionAux:detalleretencions) {
					
						if(sTipoSeleccionar.equals(DetalleRetencionConstantesFunciones.LABEL_DESCRIPCION)) {
							existe=true;
							detalleretencionAux.setdescripcion(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(DetalleRetencionConstantesFunciones.LABEL_PORCENTAJE)) {
							existe=true;
							detalleretencionAux.setporcentaje(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(DetalleRetencionConstantesFunciones.LABEL_MONTOMINIMO)) {
							existe=true;
							detalleretencionAux.setmonto_minimo(Double.parseDouble(this.sValorCampoGeneral));
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaDetalleRetencion(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleRetencionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesDetalleRetencionActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingDetalleRetencion(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioDetalleRetencion=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesDetalleRetencion.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormDetalleRetencion.jComboBoxTiposAccionesFormularioDetalleRetencion.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteDetalleRetencion) {				
					conSplash=true;//false;										
					
					//this.startProcessDetalleRetencion(conSplash);
				
					this.generarReporteDetalleRetencionsSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesDetalleRetencion.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormDetalleRetencion.jComboBoxTiposAccionesFormularioDetalleRetencion.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoDetalleRetencionsSeleccionados();
				//this.jComboBoxTiposAccionesDetalleRetencion.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoDetalleRetencionsSeleccionados(false);
				//this.jComboBoxTiposAccionesDetalleRetencion.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoDetalleRetencionsSeleccionados(true);
				//this.jComboBoxTiposAccionesDetalleRetencion.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessDetalleRetencion();
				
				this.exportarDetalleRetencionsSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesDetalleRetencion.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormDetalleRetencion.jComboBoxTiposAccionesFormularioDetalleRetencion.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionDetalleRetencions();
				//this.importarDetalleRetencions();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesDetalleRetencion.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormDetalleRetencion.jComboBoxTiposAccionesFormularioDetalleRetencion.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessDetalleRetencion();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelDetalleRetencionsSeleccionados();
				//this.jComboBoxTiposAccionesDetalleRetencion.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Detalle Retencion", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessDetalleRetencion();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoDetalleRetencion)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyDetalleRetencion(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Detalle Retencion",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesDetalleRetencion.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormDetalleRetencion.jComboBoxTiposAccionesFormularioDetalleRetencion.setSelectedIndex(0);					
				}	
			} 			
			else if(DetalleRetencionBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteDetalleRetencion) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessDetalleRetencion(conSplash);
					
						//this.actualizarParametrosGeneralDetalleRetencion();
						
						this.generarReporteProcesoAccionDetalleRetencionsSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesDetalleRetencion.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormDetalleRetencion.jComboBoxTiposAccionesFormularioDetalleRetencion.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(DetalleRetencionBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Detalle RetencionES SELECCIONADOS?", "MANTENIMIENTO DE Detalle Retencion", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessDetalleRetencion();
				
						this.actualizarParametrosGeneralDetalleRetencion();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.detalleretencionReturnGeneral=detalleretencionLogic.procesarAccionDetalleRetencionsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.detalleretencionLogic.getDetalleRetencions(),this.detalleretencionParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarDetalleRetencionReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesDetalleRetencion.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormDetalleRetencion.jComboBoxTiposAccionesFormularioDetalleRetencion.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralDetalleRetencion();
					
					DetalleRetencionBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarDetalleRetencionReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesDetalleRetencion.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormDetalleRetencion.jComboBoxTiposAccionesFormularioDetalleRetencion.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,DetalleRetencionConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessDetalleRetencion(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesDetalleRetencionActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessDetalleRetencion();
			
			if(this.jInternalFrameDetalleFormDetalleRetencion==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<DetalleRetencion> detalleretencionsSeleccionados=new ArrayList<DetalleRetencion>();		
			DetalleRetencion detalleretencion=new DetalleRetencion();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingDetalleRetencion(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesDetalleRetencion.getSelectedItem();
			
			
			
			
			detalleretencionsSeleccionados=this.getDetalleRetencionsSeleccionados(true);
			//this.sTipoAccion;
			
			if(detalleretencionsSeleccionados.size()==1) {
				for(DetalleRetencion detalleretencionAux:detalleretencionsSeleccionados) {
					detalleretencion=detalleretencionAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleRetencionConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessDetalleRetencion();
			
      		//this.finishProcessDetalleRetencion(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarDetalleRetencionReturnGeneral() throws Exception {
		if(this.detalleretencionReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.detalleretencionReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.detalleretencionReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.detalleretencionReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.detalleretencionReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.detalleretencionReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingDetalleRetencion(false);
		}
		
		if(this.detalleretencionReturnGeneral.getConRetornoLista() || this.detalleretencionReturnGeneral.getConRetornoObjeto()) {
			if(this.detalleretencionReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.detalleretencionLogic.setDetalleRetencions(this.detalleretencionReturnGeneral.getDetalleRetencions());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.detalleretencionReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.detalleretencionLogic.setDetalleRetencion(this.detalleretencionReturnGeneral.getDetalleRetencion());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingDetalleRetencion(false);
		}
	}
	
	public void actualizarParametrosGeneralDetalleRetencion() throws Exception {
		
		
	}
	
	public ArrayList<DetalleRetencion> getDetalleRetencionsSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<DetalleRetencion> detalleretencionsSeleccionados=new ArrayList<DetalleRetencion>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioDetalleRetencion) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(DetalleRetencion detalleretencionAux:detalleretencionLogic.getDetalleRetencions()) {
					if(detalleretencionAux.getIsSelected()) {
						detalleretencionsSeleccionados.add(detalleretencionAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(DetalleRetencion detalleretencionAux:this.detalleretencions) {
					if(detalleretencionAux.getIsSelected()) {
						detalleretencionsSeleccionados.add(detalleretencionAux);				
					}
				}
			}
			
			if(detalleretencionsSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						detalleretencionsSeleccionados.addAll(this.detalleretencionLogic.getDetalleRetencions());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						detalleretencionsSeleccionados.addAll(this.detalleretencions);				
					}
				}
			}
		} else {
			detalleretencionsSeleccionados.add(this.detalleretencion);
		}
		
		return detalleretencionsSeleccionados;
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
	
	public void generarReporteDetalleRetencionsSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalDetalleRetencionsSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoDetalleRetencionsSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoDetalleRetencionsSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoDetalleRetencionsSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Detalle Retencion",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesDetalleRetencionsSeleccionados() throws Exception {
		ArrayList<DetalleRetencion> detalleretencionsSeleccionados=new ArrayList<DetalleRetencion>();		
		
		detalleretencionsSeleccionados=this.getDetalleRetencionsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteDetalleRetencions("Todos",detalleretencionsSeleccionados);
		
	}	
	
	public void generarReporteNormalDetalleRetencionsSeleccionados() throws Exception {
		ArrayList<DetalleRetencion> detalleretencionsSeleccionados=new ArrayList<DetalleRetencion>();		
		
		detalleretencionsSeleccionados=this.getDetalleRetencionsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteDetalleRetencions("Todos",detalleretencionsSeleccionados);
	}		
	
	public void generarReporteProcesoAccionDetalleRetencionsSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<DetalleRetencion> detalleretencionsSeleccionados=new ArrayList<DetalleRetencion>();
		
		detalleretencionsSeleccionados=this.getDetalleRetencionsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteDetalleRetencions("Todos",detalleretencionsSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoDetalleRetencionsSeleccionados() throws Exception {
		ArrayList<DetalleRetencion> detalleretencionsSeleccionados=new ArrayList<DetalleRetencion>();		
		
		
		this.abrirInicializarFrameReporteDinamicoDetalleRetencion();
		
		
		detalleretencionsSeleccionados=this.getDetalleRetencionsSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoDetalleRetencion();
		
		
		//this.generarReporteDetalleRetencions("Todos",detalleretencionsSeleccionados ,detalleretencionImplementable,detalleretencionImplementableHome);
	}
	
	public void mostrarImportacionDetalleRetencions() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionDetalleRetencion();
		
		this.abrirFrameImportacionDetalleRetencion();		
		
			
		//this.generarReporteDetalleRetencions("Todos",detalleretencionsSeleccionados ,detalleretencionImplementable,detalleretencionImplementableHome);
	}
	
	public void importarDetalleRetencions() throws Exception {		
	
	}
	
	public void exportarDetalleRetencionsSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelDetalleRetencionsSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoDetalleRetencionsSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlDetalleRetencionsSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Detalle Retencion",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoDetalleRetencionsSeleccionados() throws Exception {
		ArrayList<DetalleRetencion> detalleretencionsSeleccionados=new ArrayList<DetalleRetencion>();		
		
		detalleretencionsSeleccionados=this.getDetalleRetencionsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"detalleretencion."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarDetalleRetencion(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(DetalleRetencion detalleretencionAux:detalleretencionsSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarDetalleRetencion(detalleretencionAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//detalleretencionAux.setsDetalleGeneralEntityReporte(detalleretencionAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.detalleretencionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Detalle Retencion",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarDetalleRetencion(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=DetalleRetencionConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DetalleRetencionConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DetalleRetencionConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DetalleRetencionConstantesFunciones.LABEL_IDEMPRESADESTINO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DetalleRetencionConstantesFunciones.LABEL_IDCUENTACONTABLE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DetalleRetencionConstantesFunciones.LABEL_IDCUENTACONTABLECREDITO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DetalleRetencionConstantesFunciones.LABEL_DESCRIPCION;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DetalleRetencionConstantesFunciones.LABEL_PORCENTAJE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DetalleRetencionConstantesFunciones.LABEL_MONTOMINIMO;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarDetalleRetencion(DetalleRetencion detalleretencion,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=detalleretencion.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=detalleretencion.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=detalleretencion.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=detalleretencion.getempresadestino_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=detalleretencion.getcuentacontable_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=detalleretencion.getcuentacontablecredito_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=detalleretencion.getdescripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=detalleretencion.getporcentaje().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=detalleretencion.getmonto_minimo().toString();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelDetalleRetencionsSeleccionados() throws Exception {
		ArrayList<DetalleRetencion> detalleretencionsSeleccionados=new ArrayList<DetalleRetencion>();		
		
		detalleretencionsSeleccionados=this.getDetalleRetencionsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"detalleretencion.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("DetalleRetencions");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelDetalleRetencion(row);				
				iRow++;
			}				
			
			for(DetalleRetencion detalleretencionAux:detalleretencionsSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelDetalleRetencion(detalleretencionAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.detalleretencionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Detalle Retencion",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlDetalleRetencionsSeleccionados() throws Exception {
		ArrayList<DetalleRetencion> detalleretencionsSeleccionados=new ArrayList<DetalleRetencion>();		
		
		detalleretencionsSeleccionados=this.getDetalleRetencionsSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"detalleretencion.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("detalleretencions");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("detalleretencion");
			//elementRoot.appendChild(element);
		
			for(DetalleRetencion detalleretencionAux:detalleretencionsSeleccionados) {
				element = document.createElement("detalleretencion");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlDetalleRetencion(detalleretencionAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.detalleretencionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Detalle Retencion",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelDetalleRetencion(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(DetalleRetencionConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(DetalleRetencionConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(DetalleRetencionConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(DetalleRetencionConstantesFunciones.LABEL_IDEMPRESADESTINO);
		cell = row.createCell(iColumn++);cell.setCellValue(DetalleRetencionConstantesFunciones.LABEL_IDCUENTACONTABLE);
		cell = row.createCell(iColumn++);cell.setCellValue(DetalleRetencionConstantesFunciones.LABEL_IDCUENTACONTABLECREDITO);
		cell = row.createCell(iColumn++);cell.setCellValue(DetalleRetencionConstantesFunciones.LABEL_DESCRIPCION);
		cell = row.createCell(iColumn++);cell.setCellValue(DetalleRetencionConstantesFunciones.LABEL_PORCENTAJE);
		cell = row.createCell(iColumn++);cell.setCellValue(DetalleRetencionConstantesFunciones.LABEL_MONTOMINIMO);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelDetalleRetencion(DetalleRetencion detalleretencion,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(detalleretencion.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(detalleretencion.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(detalleretencion.getempresadestino_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(detalleretencion.getcuentacontable_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(detalleretencion.getcuentacontablecredito_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(detalleretencion.getdescripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(detalleretencion.getporcentaje());
		cell = row.createCell(iColumn++);cell.setCellValue(detalleretencion.getmonto_minimo());				
	}
	
	public void setFilaDatosExportarXmlDetalleRetencion(DetalleRetencion detalleretencion,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(DetalleRetencionConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(detalleretencion.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(DetalleRetencionConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(detalleretencion.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(DetalleRetencionConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(detalleretencion.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementempresadestino_descripcion = document.createElement(DetalleRetencionConstantesFunciones.IDEMPRESADESTINO);
		elementempresadestino_descripcion.appendChild(document.createTextNode(detalleretencion.getempresadestino_descripcion()));
		element.appendChild(elementempresadestino_descripcion);

		Element elementcuentacontable_descripcion = document.createElement(DetalleRetencionConstantesFunciones.IDCUENTACONTABLE);
		elementcuentacontable_descripcion.appendChild(document.createTextNode(detalleretencion.getcuentacontable_descripcion()));
		element.appendChild(elementcuentacontable_descripcion);

		Element elementcuentacontablecredito_descripcion = document.createElement(DetalleRetencionConstantesFunciones.IDCUENTACONTABLECREDITO);
		elementcuentacontablecredito_descripcion.appendChild(document.createTextNode(detalleretencion.getcuentacontablecredito_descripcion()));
		element.appendChild(elementcuentacontablecredito_descripcion);

		Element elementdescripcion = document.createElement(DetalleRetencionConstantesFunciones.DESCRIPCION);
		elementdescripcion.appendChild(document.createTextNode(detalleretencion.getdescripcion().trim()));
		element.appendChild(elementdescripcion);

		Element elementporcentaje = document.createElement(DetalleRetencionConstantesFunciones.PORCENTAJE);
		elementporcentaje.appendChild(document.createTextNode(detalleretencion.getporcentaje().toString().trim()));
		element.appendChild(elementporcentaje);

		Element elementmonto_minimo = document.createElement(DetalleRetencionConstantesFunciones.MONTOMINIMO);
		elementmonto_minimo.appendChild(document.createTextNode(detalleretencion.getmonto_minimo().toString().trim()));
		element.appendChild(elementmonto_minimo);
	}
	
	public void generarReporteGroupGenericoDetalleRetencionsSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<DetalleRetencion> detalleretencionsSeleccionados=new ArrayList<DetalleRetencion>();
		
		detalleretencionsSeleccionados=this.getDetalleRetencionsSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoDetalleRetencion(detalleretencionsSeleccionados);
		
		this.generarReporteDetalleRetencions("Todos",detalleretencionsSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoDetalleRetencion(ArrayList<DetalleRetencion> detalleretencionsSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(DetalleRetencion detalleretencionAux:detalleretencionsSeleccionados) {
				detalleretencionAux.setsDetalleGeneralEntityReporte(detalleretencionAux.toString());
			
				if(sTipoSeleccionar.equals(DetalleRetencionConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					detalleretencionAux.setsDescripcionGeneralEntityReporte1(detalleretencionAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(DetalleRetencionConstantesFunciones.LABEL_IDEMPRESADESTINO)) {
					existe=true;
					detalleretencionAux.setsDescripcionGeneralEntityReporte1(detalleretencionAux.getempresadestino_descripcion());
				}
				 else if(sTipoSeleccionar.equals(DetalleRetencionConstantesFunciones.LABEL_IDCUENTACONTABLE)) {
					existe=true;
					detalleretencionAux.setsDescripcionGeneralEntityReporte1(detalleretencionAux.getcuentacontable_descripcion());
				}
				 else if(sTipoSeleccionar.equals(DetalleRetencionConstantesFunciones.LABEL_IDCUENTACONTABLECREDITO)) {
					existe=true;
					detalleretencionAux.setsDescripcionGeneralEntityReporte1(detalleretencionAux.getcuentacontablecredito_descripcion());
				}
				 else if(sTipoSeleccionar.equals(DetalleRetencionConstantesFunciones.LABEL_DESCRIPCION)) {
					existe=true;
					detalleretencionAux.setsDescripcionGeneralEntityReporte1(detalleretencionAux.getdescripcion());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleRetencionConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesDetalleRetencion(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoDetalleRetencion=true;
				this.isVisibilidadCeldaNuevoRelacionesDetalleRetencion=true;
				this.isVisibilidadCeldaGuardarCambiosDetalleRetencion=true;
			}
			
			this.isVisibilidadCeldaModificarDetalleRetencion=false;
			this.isVisibilidadCeldaActualizarDetalleRetencion=false;
			this.isVisibilidadCeldaEliminarDetalleRetencion=false;
			this.isVisibilidadCeldaCancelarDetalleRetencion=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarDetalleRetencion=true;
				} else {
					this.isVisibilidadCeldaGuardarDetalleRetencion=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoDetalleRetencion=false;
			this.isVisibilidadCeldaNuevoRelacionesDetalleRetencion=false;
			this.isVisibilidadCeldaGuardarCambiosDetalleRetencion=false;
			this.isVisibilidadCeldaModificarDetalleRetencion=false;
			this.isVisibilidadCeldaActualizarDetalleRetencion=true;
			this.isVisibilidadCeldaEliminarDetalleRetencion=false;
			this.isVisibilidadCeldaCancelarDetalleRetencion=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarDetalleRetencion=true;
				} else {
					this.isVisibilidadCeldaGuardarDetalleRetencion=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoDetalleRetencion=false;
			this.isVisibilidadCeldaNuevoRelacionesDetalleRetencion=false;
			this.isVisibilidadCeldaGuardarCambiosDetalleRetencion=false;
			this.isVisibilidadCeldaModificarDetalleRetencion=false;
			this.isVisibilidadCeldaActualizarDetalleRetencion=true;
			this.isVisibilidadCeldaEliminarDetalleRetencion=true;
			this.isVisibilidadCeldaCancelarDetalleRetencion=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarDetalleRetencion=true;
				} else {
					this.isVisibilidadCeldaGuardarDetalleRetencion=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoDetalleRetencion=false;
			this.isVisibilidadCeldaNuevoRelacionesDetalleRetencion=false;
			this.isVisibilidadCeldaGuardarCambiosDetalleRetencion=false;
			this.isVisibilidadCeldaModificarDetalleRetencion=false;
			this.isVisibilidadCeldaActualizarDetalleRetencion=true;
			this.isVisibilidadCeldaEliminarDetalleRetencion=false;
			this.isVisibilidadCeldaCancelarDetalleRetencion=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarDetalleRetencion=false;
				} else {
					this.isVisibilidadCeldaGuardarDetalleRetencion=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoDetalleRetencion=true;
			this.isVisibilidadCeldaNuevoRelacionesDetalleRetencion=true;
			this.isVisibilidadCeldaGuardarCambiosDetalleRetencion=true;
			this.isVisibilidadCeldaModificarDetalleRetencion=false;
			this.isVisibilidadCeldaActualizarDetalleRetencion=false;
			this.isVisibilidadCeldaEliminarDetalleRetencion=false;
			this.isVisibilidadCeldaCancelarDetalleRetencion=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarDetalleRetencion=true;
				} else {
					this.isVisibilidadCeldaGuardarDetalleRetencion=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoDetalleRetencion=false;
			this.isVisibilidadCeldaNuevoRelacionesDetalleRetencion=false;
			this.isVisibilidadCeldaGuardarCambiosDetalleRetencion=false;
			this.isVisibilidadCeldaActualizarDetalleRetencion=false;
			this.isVisibilidadCeldaEliminarDetalleRetencion=false;
			this.isVisibilidadCeldaCancelarDetalleRetencion=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarDetalleRetencion=false;
				} else {
					this.isVisibilidadCeldaGuardarDetalleRetencion=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoDetalleRetencion=false;
			this.isVisibilidadCeldaNuevoRelacionesDetalleRetencion=false;
			this.isVisibilidadCeldaGuardarCambiosDetalleRetencion=false;
			this.isVisibilidadCeldaModificarDetalleRetencion=true;
			this.isVisibilidadCeldaActualizarDetalleRetencion=false;
			this.isVisibilidadCeldaEliminarDetalleRetencion=false;
			this.isVisibilidadCeldaCancelarDetalleRetencion=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarDetalleRetencion=false;
				} else {
					this.isVisibilidadCeldaGuardarDetalleRetencion=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(DetalleRetencionJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoDetalleRetencion=true;
			this.isVisibilidadCeldaNuevoRelacionesDetalleRetencion=true;
			this.isVisibilidadCeldaGuardarCambiosDetalleRetencion=true;
		} else {
			this.actualizarEstadoPanelsDetalleRetencion(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarDetalleRetencion=false;
			//this.isVisibilidadCeldaVerFormDetalleRetencion=false;
			this.isVisibilidadCeldaDuplicarDetalleRetencion=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!detalleretencionSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesDetalleRetencion=false;
		} else {
			this.isVisibilidadCeldaNuevoDetalleRetencion=false;
			this.isVisibilidadCeldaGuardarCambiosDetalleRetencion=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(detalleretencionSessionBean.getEsGuardarRelacionado()) {
			if(!detalleretencionSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesDetalleRetencion=false;												
			}
			
			this.jButtonCerrarDetalleRetencion.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesDetalleRetencion=false;
		}
		
		if(!this.permiteMantenimiento(this.detalleretencion)) {
			this.isVisibilidadCeldaActualizarDetalleRetencion=false;
			this.isVisibilidadCeldaEliminarDetalleRetencion=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesDetalleRetencion() {
	}
	
	public void actualizarEstadoPanelsDetalleRetencion(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionDetalleRetencion!=null) {
				this.jScrollPanelDatosEdicionDetalleRetencion.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDetalleRetencion!=null) {
				this.jTabbedPaneBusquedasDetalleRetencion.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosDetalleRetencion!=null) {
				this.jScrollPanelDatosDetalleRetencion.setVisible(true);
			}
			
			if(this.jPanelPaginacionDetalleRetencion!=null) {
				this.jPanelPaginacionDetalleRetencion.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesDetalleRetencion!=null) {
				this.jPanelParametrosReportesDetalleRetencion.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionDetalleRetencion!=null) {
				this.jScrollPanelDatosEdicionDetalleRetencion.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDetalleRetencion!=null) {
				this.jTabbedPaneBusquedasDetalleRetencion.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosDetalleRetencion!=null) {
				this.jScrollPanelDatosDetalleRetencion.setVisible(false);
			}
			
			if(this.jPanelPaginacionDetalleRetencion!=null) {
				this.jPanelPaginacionDetalleRetencion.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesDetalleRetencion!=null) {
				this.jPanelParametrosReportesDetalleRetencion.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionDetalleRetencion!=null) {
				this.jScrollPanelDatosEdicionDetalleRetencion.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDetalleRetencion!=null) {
				this.jTabbedPaneBusquedasDetalleRetencion.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosDetalleRetencion!=null) {
				this.jScrollPanelDatosDetalleRetencion.setVisible(false);
			}
			
			if(this.jPanelPaginacionDetalleRetencion!=null) {
				this.jPanelPaginacionDetalleRetencion.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesDetalleRetencion!=null) {
				this.jPanelParametrosReportesDetalleRetencion.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionDetalleRetencion!=null) {
				this.jScrollPanelDatosEdicionDetalleRetencion.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDetalleRetencion!=null) {
				this.jTabbedPaneBusquedasDetalleRetencion.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosDetalleRetencion!=null) {
				this.jScrollPanelDatosDetalleRetencion.setVisible(false);
			}
			
			if(this.jPanelPaginacionDetalleRetencion!=null) {
				this.jPanelPaginacionDetalleRetencion.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesDetalleRetencion!=null) {
				this.jPanelParametrosReportesDetalleRetencion.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionDetalleRetencion!=null) {
				this.jScrollPanelDatosEdicionDetalleRetencion.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDetalleRetencion!=null) {
				this.jTabbedPaneBusquedasDetalleRetencion.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosDetalleRetencion!=null) {
				this.jScrollPanelDatosDetalleRetencion.setVisible(true);
			}
			
			if(this.jPanelPaginacionDetalleRetencion!=null) {
				this.jPanelPaginacionDetalleRetencion.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesDetalleRetencion!=null) {
				this.jPanelParametrosReportesDetalleRetencion.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionDetalleRetencion!=null) {
				this.jScrollPanelDatosEdicionDetalleRetencion.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDetalleRetencion!=null) {
				this.jTabbedPaneBusquedasDetalleRetencion.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosDetalleRetencion!=null) {
				this.jScrollPanelDatosDetalleRetencion.setVisible(true);
			}
			
			if(this.jPanelPaginacionDetalleRetencion!=null) {
				this.jPanelPaginacionDetalleRetencion.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesDetalleRetencion!=null) {
				this.jPanelParametrosReportesDetalleRetencion.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionDetalleRetencion!=null) {
				this.jScrollPanelDatosEdicionDetalleRetencion.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDetalleRetencion!=null) {
				this.jTabbedPaneBusquedasDetalleRetencion.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosDetalleRetencion!=null) {
				this.jScrollPanelDatosDetalleRetencion.setVisible(true);
			}
			
			if(this.jPanelPaginacionDetalleRetencion!=null) {
				this.jPanelPaginacionDetalleRetencion.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesDetalleRetencion!=null) {
				this.jPanelParametrosReportesDetalleRetencion.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.detalleretencionSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasDetalleRetencion!=null) {
					this.jTabbedPaneBusquedasDetalleRetencion.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesDetalleRetencion!=null) {
				this.jPanelParametrosReportesDetalleRetencion.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.detalleretencionSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDetalleRetencion!=null) {
				this.jTabbedPaneBusquedasDetalleRetencion.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesDetalleRetencion!=null) {
				this.jPanelParametrosReportesDetalleRetencion.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadFK_IdCuentaContable=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdCuentaContable) {this.jTabbedPaneBusquedasDetalleRetencion.remove(jPanelFK_IdCuentaContableDetalleRetencion);}

			this.isVisibilidadFK_IdCuentaContableCredito=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdCuentaContableCredito) {this.jTabbedPaneBusquedasDetalleRetencion.remove(jPanelFK_IdCuentaContableCreditoDetalleRetencion);}

			this.isVisibilidadFK_IdDetalleRetencion=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdDetalleRetencion) {this.jTabbedPaneBusquedasDetalleRetencion.remove(jPanelFK_IdDetalleRetencionDetalleRetencion);}
		}
		
	}

	public void setVisibilidadBusquedasParaEmpresaDestino(Boolean isParaEmpresaDestino){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaDestinoNegation=!isParaEmpresaDestino;

			this.isVisibilidadFK_IdCuentaContable=isParaEmpresaDestinoNegation;
			if(!this.isVisibilidadFK_IdCuentaContable) {this.jTabbedPaneBusquedasDetalleRetencion.remove(jPanelFK_IdCuentaContableDetalleRetencion);}

			this.isVisibilidadFK_IdCuentaContableCredito=isParaEmpresaDestinoNegation;
			if(!this.isVisibilidadFK_IdCuentaContableCredito) {this.jTabbedPaneBusquedasDetalleRetencion.remove(jPanelFK_IdCuentaContableCreditoDetalleRetencion);}

			this.isVisibilidadFK_IdDetalleRetencion=isParaEmpresaDestino;
			if(!this.isVisibilidadFK_IdDetalleRetencion) {this.jTabbedPaneBusquedasDetalleRetencion.remove(jPanelFK_IdDetalleRetencionDetalleRetencion);}
		}
		
	}

	public void setVisibilidadBusquedasParaCuentaContable(Boolean isParaCuentaContable){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaCuentaContableNegation=!isParaCuentaContable;

			this.isVisibilidadFK_IdCuentaContable=isParaCuentaContable;
			if(!this.isVisibilidadFK_IdCuentaContable) {this.jTabbedPaneBusquedasDetalleRetencion.remove(jPanelFK_IdCuentaContableDetalleRetencion);}

			this.isVisibilidadFK_IdCuentaContableCredito=isParaCuentaContableNegation;
			if(!this.isVisibilidadFK_IdCuentaContableCredito) {this.jTabbedPaneBusquedasDetalleRetencion.remove(jPanelFK_IdCuentaContableCreditoDetalleRetencion);}

			this.isVisibilidadFK_IdDetalleRetencion=isParaCuentaContableNegation;
			if(!this.isVisibilidadFK_IdDetalleRetencion) {this.jTabbedPaneBusquedasDetalleRetencion.remove(jPanelFK_IdDetalleRetencionDetalleRetencion);}
		}
		
	}

	public void setVisibilidadBusquedasParaCuentaContableCredito(Boolean isParaCuentaContableCredito){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaCuentaContableCreditoNegation=!isParaCuentaContableCredito;

			this.isVisibilidadFK_IdCuentaContable=isParaCuentaContableCreditoNegation;
			if(!this.isVisibilidadFK_IdCuentaContable) {this.jTabbedPaneBusquedasDetalleRetencion.remove(jPanelFK_IdCuentaContableDetalleRetencion);}

			this.isVisibilidadFK_IdCuentaContableCredito=isParaCuentaContableCredito;
			if(!this.isVisibilidadFK_IdCuentaContableCredito) {this.jTabbedPaneBusquedasDetalleRetencion.remove(jPanelFK_IdCuentaContableCreditoDetalleRetencion);}

			this.isVisibilidadFK_IdDetalleRetencion=isParaCuentaContableCreditoNegation;
			if(!this.isVisibilidadFK_IdDetalleRetencion) {this.jTabbedPaneBusquedasDetalleRetencion.remove(jPanelFK_IdDetalleRetencionDetalleRetencion);}
		}
		
	}
	
	
	
	

	public String registrarSesionDetalleRetencionParaBusquedaCuentaContables() throws Exception {
		Boolean isPaginaPopupCuentaContable=false;

		try {

			if(detalleretencionSessionBean==null) {
				detalleretencionSessionBean=new DetalleRetencionSessionBean();
			}

			if(cuentacontableSessionBean==null) {
				cuentacontableSessionBean=new CuentaContableSessionBean();
			}

			cuentacontableSessionBean.setsPathNavegacionActual(detalleretencionSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+CuentaContableConstantesFunciones.SCLASSWEBTITULO);
			cuentacontableSessionBean.setisPermiteRecargarInformacion(false);
			cuentacontableSessionBean.setisPaginaPopup(true);
			isPaginaPopupCuentaContable=cuentacontableSessionBean.getisPaginaPopup();
			cuentacontableSessionBean.setisPaginaPopup(false);
			cuentacontableSessionBean.setEstaModoBusqueda(true);
			cuentacontableSessionBean.setsFuncionBusquedaRapida("window.opener.detalleretencionFuncionGeneral.setCombosCodigoDesdeBusquedaid_cuenta_contable(TO_REPLACE);");
			cuentacontableSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeCuentaContable(true);
			cuentacontableSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeCuentaContable(DetalleRetencionConstantesFunciones.SNOMBREOPCION);
			//cuentacontableSessionBean.setisBusquedaDesdeForeignKeySesionDetalleRetencion(true);
			//cuentacontableSessionBean.setlidDetalleRetencionActual(this.idDetalleRetencionActual);

			detalleretencionSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyDetalleRetencion(true);
			detalleretencionSessionBean.setlIdDetalleRetencionActualForeignKey(this.idDetalleRetencionActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
			return "";
	}

	public String registrarSesionDetalleRetencionParaBusquedaCuentaContableCreditos() throws Exception {
		Boolean isPaginaPopupCuentaContable=false;

		try {

			if(detalleretencionSessionBean==null) {
				detalleretencionSessionBean=new DetalleRetencionSessionBean();
			}

			if(cuentacontablecreditoSessionBean==null) {
				cuentacontablecreditoSessionBean=new CuentaContableSessionBean();
			}

			cuentacontablecreditoSessionBean.setsPathNavegacionActual(detalleretencionSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+CuentaContableConstantesFunciones.SCLASSWEBTITULO);
			cuentacontablecreditoSessionBean.setisPermiteRecargarInformacion(false);
			cuentacontablecreditoSessionBean.setisPaginaPopup(true);
			isPaginaPopupCuentaContable=cuentacontablecreditoSessionBean.getisPaginaPopup();
			cuentacontablecreditoSessionBean.setisPaginaPopup(false);
			cuentacontablecreditoSessionBean.setEstaModoBusqueda(true);
			cuentacontablecreditoSessionBean.setsFuncionBusquedaRapida("window.opener.detalleretencionFuncionGeneral.setCombosCodigoDesdeBusquedaid_cuenta_contable_credito(TO_REPLACE);");
			cuentacontablecreditoSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeCuentaContable(true);
			cuentacontablecreditoSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeCuentaContable(DetalleRetencionConstantesFunciones.SNOMBREOPCION);
			//cuentacontableSessionBean.setisBusquedaDesdeForeignKeySesionDetalleRetencion(true);
			//cuentacontableSessionBean.setlidDetalleRetencionActual(this.idDetalleRetencionActual);

			detalleretencionSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyDetalleRetencion(true);
			detalleretencionSessionBean.setlIdDetalleRetencionActualForeignKey(this.idDetalleRetencionActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
			return "";
	}
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//DetalleRetencionSessionBean detalleretencionSessionBean=new DetalleRetencionSessionBean();
		
		if(this.detalleretencionSessionBean==null) {
			this.detalleretencionSessionBean=new DetalleRetencionSessionBean();
		}
		
		this.detalleretencionSessionBean.setsUltimaBusquedaDetalleRetencion(this.getsAccionBusqueda());
		this.detalleretencionSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.detalleretencionSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdCuentaContable")) {
			detalleretencionSessionBean.setid_cuenta_contable(this.getid_cuenta_contableFK_IdCuentaContable());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdCuentaContableCredito")) {
			detalleretencionSessionBean.setid_cuenta_contable_credito(this.getid_cuenta_contable_creditoFK_IdCuentaContableCredito());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdDetalleRetencion")) {
			detalleretencionSessionBean.setid_empresa_destino(this.getid_empresa_destinoFK_IdDetalleRetencion());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			detalleretencionSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//DetalleRetencionSessionBean detalleretencionSessionBean=new DetalleRetencionSessionBean();
		
		if(this.detalleretencionSessionBean==null) {
			this.detalleretencionSessionBean=new DetalleRetencionSessionBean();
		}
		
		if(this.detalleretencionSessionBean.getsUltimaBusquedaDetalleRetencion()!=null&&!this.detalleretencionSessionBean.getsUltimaBusquedaDetalleRetencion().equals("")) {
			this.setsAccionBusqueda(detalleretencionSessionBean.getsUltimaBusquedaDetalleRetencion());
			this.setiNumeroPaginacion(detalleretencionSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(detalleretencionSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdCuentaContable")) {
				this.setid_cuenta_contableFK_IdCuentaContable(detalleretencionSessionBean.getid_cuenta_contable());
				detalleretencionSessionBean.setid_cuenta_contable(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdCuentaContableCredito")) {
				this.setid_cuenta_contable_creditoFK_IdCuentaContableCredito(detalleretencionSessionBean.getid_cuenta_contable_credito());
				detalleretencionSessionBean.setid_cuenta_contable_credito(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdDetalleRetencion")) {
				this.setid_empresa_destinoFK_IdDetalleRetencion(detalleretencionSessionBean.getid_empresa_destino());
				detalleretencionSessionBean.setid_empresa_destino(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(detalleretencionSessionBean.getid_empresa());
				detalleretencionSessionBean.setid_empresa(-1L);
			}
		}
		
		this.detalleretencionSessionBean.setsUltimaBusquedaDetalleRetencion("");
		this.detalleretencionSessionBean.setiNumeroPaginacion(DetalleRetencionConstantesFunciones.INUMEROPAGINACION);
		this.detalleretencionSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaDetalleRetencion(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioDetalleRetencion() {
		this.updateBorderResaltarBusquedasFormularioDetalleRetencion();
		this.updateVisibilidadBusquedasFormularioDetalleRetencion();
		this.updateHabilitarBusquedasFormularioDetalleRetencion();
	}
	
	public void updateBorderResaltarBusquedasFormularioDetalleRetencion() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasDetalleRetencion.getComponents().length>0) {
	

		if(this.detalleretencionConstantesFunciones.resaltarFK_IdCuentaContableDetalleRetencion!=null) {
			index= this.jTabbedPaneBusquedasDetalleRetencion.indexOfComponent(this.jPanelFK_IdCuentaContableDetalleRetencion);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasDetalleRetencion.getComponent(index);
				jPanel.setBorder(this.detalleretencionConstantesFunciones.resaltarFK_IdCuentaContableDetalleRetencion);
			}
		}

		if(this.detalleretencionConstantesFunciones.resaltarFK_IdCuentaContableCreditoDetalleRetencion!=null) {
			index= this.jTabbedPaneBusquedasDetalleRetencion.indexOfComponent(this.jPanelFK_IdCuentaContableCreditoDetalleRetencion);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasDetalleRetencion.getComponent(index);
				jPanel.setBorder(this.detalleretencionConstantesFunciones.resaltarFK_IdCuentaContableCreditoDetalleRetencion);
			}
		}

		if(this.detalleretencionConstantesFunciones.resaltarFK_IdDetalleRetencionDetalleRetencion!=null) {
			index= this.jTabbedPaneBusquedasDetalleRetencion.indexOfComponent(this.jPanelFK_IdDetalleRetencionDetalleRetencion);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasDetalleRetencion.getComponent(index);
				jPanel.setBorder(this.detalleretencionConstantesFunciones.resaltarFK_IdDetalleRetencionDetalleRetencion);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioDetalleRetencion() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasDetalleRetencion.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasDetalleRetencion.indexOfComponent(this.jPanelFK_IdCuentaContableDetalleRetencion);
			jPanel=(JPanel)this.jTabbedPaneBusquedasDetalleRetencion.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.detalleretencionConstantesFunciones.mostrarFK_IdCuentaContableDetalleRetencion);
			if(!this.detalleretencionConstantesFunciones.mostrarFK_IdCuentaContableDetalleRetencion && index>-1) {
				this.jTabbedPaneBusquedasDetalleRetencion.remove(index);
			}

			index= this.jTabbedPaneBusquedasDetalleRetencion.indexOfComponent(this.jPanelFK_IdCuentaContableCreditoDetalleRetencion);
			jPanel=(JPanel)this.jTabbedPaneBusquedasDetalleRetencion.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.detalleretencionConstantesFunciones.mostrarFK_IdCuentaContableCreditoDetalleRetencion);
			if(!this.detalleretencionConstantesFunciones.mostrarFK_IdCuentaContableCreditoDetalleRetencion && index>-1) {
				this.jTabbedPaneBusquedasDetalleRetencion.remove(index);
			}

			index= this.jTabbedPaneBusquedasDetalleRetencion.indexOfComponent(this.jPanelFK_IdDetalleRetencionDetalleRetencion);
			jPanel=(JPanel)this.jTabbedPaneBusquedasDetalleRetencion.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.detalleretencionConstantesFunciones.mostrarFK_IdDetalleRetencionDetalleRetencion);
			if(!this.detalleretencionConstantesFunciones.mostrarFK_IdDetalleRetencionDetalleRetencion && index>-1) {
				this.jTabbedPaneBusquedasDetalleRetencion.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioDetalleRetencion() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasDetalleRetencion.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasDetalleRetencion.indexOfComponent(this.jPanelFK_IdCuentaContableDetalleRetencion);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasDetalleRetencion.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.detalleretencionConstantesFunciones.activarFK_IdCuentaContableDetalleRetencion);
				this.jTabbedPaneBusquedasDetalleRetencion.setEnabledAt(index,this.detalleretencionConstantesFunciones.activarFK_IdCuentaContableDetalleRetencion);
			}

			index= this.jTabbedPaneBusquedasDetalleRetencion.indexOfComponent(this.jPanelFK_IdCuentaContableCreditoDetalleRetencion);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasDetalleRetencion.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.detalleretencionConstantesFunciones.activarFK_IdCuentaContableCreditoDetalleRetencion);
				this.jTabbedPaneBusquedasDetalleRetencion.setEnabledAt(index,this.detalleretencionConstantesFunciones.activarFK_IdCuentaContableCreditoDetalleRetencion);
			}

			index= this.jTabbedPaneBusquedasDetalleRetencion.indexOfComponent(this.jPanelFK_IdDetalleRetencionDetalleRetencion);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasDetalleRetencion.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.detalleretencionConstantesFunciones.activarFK_IdDetalleRetencionDetalleRetencion);
				this.jTabbedPaneBusquedasDetalleRetencion.setEnabledAt(index,this.detalleretencionConstantesFunciones.activarFK_IdDetalleRetencionDetalleRetencion);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaDetalleRetencion(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("FK_IdCuentaContable")) {
			index= this.jTabbedPaneBusquedasDetalleRetencion.indexOfComponent(this.jPanelFK_IdCuentaContableDetalleRetencion);

			this.jTabbedPaneBusquedasDetalleRetencion.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasDetalleRetencion.getComponent(index);

			this.detalleretencionConstantesFunciones.setResaltarFK_IdCuentaContableDetalleRetencion(resaltar);

			jPanel.setBorder(this.detalleretencionConstantesFunciones.resaltarFK_IdCuentaContableDetalleRetencion);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdCuentaContableCredito")) {
			index= this.jTabbedPaneBusquedasDetalleRetencion.indexOfComponent(this.jPanelFK_IdCuentaContableCreditoDetalleRetencion);

			this.jTabbedPaneBusquedasDetalleRetencion.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasDetalleRetencion.getComponent(index);

			this.detalleretencionConstantesFunciones.setResaltarFK_IdCuentaContableCreditoDetalleRetencion(resaltar);

			jPanel.setBorder(this.detalleretencionConstantesFunciones.resaltarFK_IdCuentaContableCreditoDetalleRetencion);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdDetalleRetencion")) {
			index= this.jTabbedPaneBusquedasDetalleRetencion.indexOfComponent(this.jPanelFK_IdDetalleRetencionDetalleRetencion);

			this.jTabbedPaneBusquedasDetalleRetencion.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasDetalleRetencion.getComponent(index);

			this.detalleretencionConstantesFunciones.setResaltarFK_IdDetalleRetencionDetalleRetencion(resaltar);

			jPanel.setBorder(this.detalleretencionConstantesFunciones.resaltarFK_IdDetalleRetencionDetalleRetencion);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarDetalleRetencion.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioDetalleRetencion() throws Exception {

		if(this.jInternalFrameDetalleFormDetalleRetencion==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioDetalleRetencion();
		this.updateVisibilidadResaltarControlesFormularioDetalleRetencion();
		this.updateHabilitarResaltarControlesFormularioDetalleRetencion();
		
	}
	
	public void updateBorderResaltarControlesFormularioDetalleRetencion() throws Exception {
		if(this.jInternalFrameDetalleFormDetalleRetencion==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.detalleretencionConstantesFunciones.resaltaridDetalleRetencion!=null && this.jInternalFrameDetalleFormDetalleRetencion!=null) {this.jInternalFrameDetalleFormDetalleRetencion.jLabelidDetalleRetencion.setBorder(this.detalleretencionConstantesFunciones.resaltaridDetalleRetencion);}
		if(this.detalleretencionConstantesFunciones.resaltarid_empresaDetalleRetencion!=null && this.jInternalFrameDetalleFormDetalleRetencion!=null) {this.jInternalFrameDetalleFormDetalleRetencion.jComboBoxid_empresaDetalleRetencion.setBorder(this.detalleretencionConstantesFunciones.resaltarid_empresaDetalleRetencion);}
		if(this.detalleretencionConstantesFunciones.resaltarid_empresa_destinoDetalleRetencion!=null && this.jInternalFrameDetalleFormDetalleRetencion!=null) {this.jInternalFrameDetalleFormDetalleRetencion.jComboBoxid_empresa_destinoDetalleRetencion.setBorder(this.detalleretencionConstantesFunciones.resaltarid_empresa_destinoDetalleRetencion);}
		if(this.detalleretencionConstantesFunciones.resaltarid_cuenta_contableDetalleRetencion!=null && this.jInternalFrameDetalleFormDetalleRetencion!=null) {this.jInternalFrameDetalleFormDetalleRetencion.jComboBoxid_cuenta_contableDetalleRetencion.setBorder(this.detalleretencionConstantesFunciones.resaltarid_cuenta_contableDetalleRetencion);}
		if(this.detalleretencionConstantesFunciones.resaltarid_cuenta_contable_creditoDetalleRetencion!=null && this.jInternalFrameDetalleFormDetalleRetencion!=null) {this.jInternalFrameDetalleFormDetalleRetencion.jComboBoxid_cuenta_contable_creditoDetalleRetencion.setBorder(this.detalleretencionConstantesFunciones.resaltarid_cuenta_contable_creditoDetalleRetencion);}
		if(this.detalleretencionConstantesFunciones.resaltardescripcionDetalleRetencion!=null && this.jInternalFrameDetalleFormDetalleRetencion!=null) {this.jInternalFrameDetalleFormDetalleRetencion.jTextAreadescripcionDetalleRetencion.setBorder(this.detalleretencionConstantesFunciones.resaltardescripcionDetalleRetencion);}
		if(this.detalleretencionConstantesFunciones.resaltarporcentajeDetalleRetencion!=null && this.jInternalFrameDetalleFormDetalleRetencion!=null) {this.jInternalFrameDetalleFormDetalleRetencion.jTextFieldporcentajeDetalleRetencion.setBorder(this.detalleretencionConstantesFunciones.resaltarporcentajeDetalleRetencion);}
		if(this.detalleretencionConstantesFunciones.resaltarmonto_minimoDetalleRetencion!=null && this.jInternalFrameDetalleFormDetalleRetencion!=null) {this.jInternalFrameDetalleFormDetalleRetencion.jTextFieldmonto_minimoDetalleRetencion.setBorder(this.detalleretencionConstantesFunciones.resaltarmonto_minimoDetalleRetencion);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioDetalleRetencion() throws Exception {		
		if(this.jInternalFrameDetalleFormDetalleRetencion==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormDetalleRetencion!=null) {
	
		//this.jInternalFrameDetalleFormDetalleRetencion.jLabelidDetalleRetencion.setVisible(this.detalleretencionConstantesFunciones.mostraridDetalleRetencion);
		this.jInternalFrameDetalleFormDetalleRetencion.jPanelidDetalleRetencion.setVisible(this.detalleretencionConstantesFunciones.mostraridDetalleRetencion);
		//this.jInternalFrameDetalleFormDetalleRetencion.jComboBoxid_empresaDetalleRetencion.setVisible(this.detalleretencionConstantesFunciones.mostrarid_empresaDetalleRetencion);
		this.jInternalFrameDetalleFormDetalleRetencion.jPanelid_empresaDetalleRetencion.setVisible(this.detalleretencionConstantesFunciones.mostrarid_empresaDetalleRetencion);
		//this.jInternalFrameDetalleFormDetalleRetencion.jComboBoxid_empresa_destinoDetalleRetencion.setVisible(this.detalleretencionConstantesFunciones.mostrarid_empresa_destinoDetalleRetencion);
		this.jInternalFrameDetalleFormDetalleRetencion.jPanelid_empresa_destinoDetalleRetencion.setVisible(this.detalleretencionConstantesFunciones.mostrarid_empresa_destinoDetalleRetencion);
		//this.jInternalFrameDetalleFormDetalleRetencion.jComboBoxid_cuenta_contableDetalleRetencion.setVisible(this.detalleretencionConstantesFunciones.mostrarid_cuenta_contableDetalleRetencion);
		this.jInternalFrameDetalleFormDetalleRetencion.jPanelid_cuenta_contableDetalleRetencion.setVisible(this.detalleretencionConstantesFunciones.mostrarid_cuenta_contableDetalleRetencion);
			this.jInternalFrameDetalleFormDetalleRetencion.jButtonid_cuenta_contableDetalleRetencion.setVisible(this.detalleretencionConstantesFunciones.mostrarid_cuenta_contableDetalleRetencion);
		//this.jInternalFrameDetalleFormDetalleRetencion.jComboBoxid_cuenta_contable_creditoDetalleRetencion.setVisible(this.detalleretencionConstantesFunciones.mostrarid_cuenta_contable_creditoDetalleRetencion);
		this.jInternalFrameDetalleFormDetalleRetencion.jPanelid_cuenta_contable_creditoDetalleRetencion.setVisible(this.detalleretencionConstantesFunciones.mostrarid_cuenta_contable_creditoDetalleRetencion);
			this.jInternalFrameDetalleFormDetalleRetencion.jButtonid_cuenta_contable_creditoDetalleRetencion.setVisible(this.detalleretencionConstantesFunciones.mostrarid_cuenta_contable_creditoDetalleRetencion);
		//this.jInternalFrameDetalleFormDetalleRetencion.jTextAreadescripcionDetalleRetencion.setVisible(this.detalleretencionConstantesFunciones.mostrardescripcionDetalleRetencion);
		this.jInternalFrameDetalleFormDetalleRetencion.jPaneldescripcionDetalleRetencion.setVisible(this.detalleretencionConstantesFunciones.mostrardescripcionDetalleRetencion);
		//this.jInternalFrameDetalleFormDetalleRetencion.jTextFieldporcentajeDetalleRetencion.setVisible(this.detalleretencionConstantesFunciones.mostrarporcentajeDetalleRetencion);
		this.jInternalFrameDetalleFormDetalleRetencion.jPanelporcentajeDetalleRetencion.setVisible(this.detalleretencionConstantesFunciones.mostrarporcentajeDetalleRetencion);
		//this.jInternalFrameDetalleFormDetalleRetencion.jTextFieldmonto_minimoDetalleRetencion.setVisible(this.detalleretencionConstantesFunciones.mostrarmonto_minimoDetalleRetencion);
		this.jInternalFrameDetalleFormDetalleRetencion.jPanelmonto_minimoDetalleRetencion.setVisible(this.detalleretencionConstantesFunciones.mostrarmonto_minimoDetalleRetencion);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioDetalleRetencion() throws Exception {
		if(this.jInternalFrameDetalleFormDetalleRetencion==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormDetalleRetencion!=null) {
	
		this.jInternalFrameDetalleFormDetalleRetencion.jLabelidDetalleRetencion.setEnabled(this.detalleretencionConstantesFunciones.activaridDetalleRetencion);
		this.jInternalFrameDetalleFormDetalleRetencion.jComboBoxid_empresaDetalleRetencion.setEnabled(this.detalleretencionConstantesFunciones.activarid_empresaDetalleRetencion);
		this.jInternalFrameDetalleFormDetalleRetencion.jComboBoxid_empresa_destinoDetalleRetencion.setEnabled(this.detalleretencionConstantesFunciones.activarid_empresa_destinoDetalleRetencion);
		this.jInternalFrameDetalleFormDetalleRetencion.jComboBoxid_cuenta_contableDetalleRetencion.setEnabled(this.detalleretencionConstantesFunciones.activarid_cuenta_contableDetalleRetencion);
			this.jInternalFrameDetalleFormDetalleRetencion.jButtonid_cuenta_contableDetalleRetencion.setEnabled(this.detalleretencionConstantesFunciones.activarid_cuenta_contableDetalleRetencion);
		this.jInternalFrameDetalleFormDetalleRetencion.jComboBoxid_cuenta_contable_creditoDetalleRetencion.setEnabled(this.detalleretencionConstantesFunciones.activarid_cuenta_contable_creditoDetalleRetencion);
			this.jInternalFrameDetalleFormDetalleRetencion.jButtonid_cuenta_contable_creditoDetalleRetencion.setEnabled(this.detalleretencionConstantesFunciones.activarid_cuenta_contable_creditoDetalleRetencion);
		this.jInternalFrameDetalleFormDetalleRetencion.jTextAreadescripcionDetalleRetencion.setEnabled(this.detalleretencionConstantesFunciones.activardescripcionDetalleRetencion);
		this.jInternalFrameDetalleFormDetalleRetencion.jTextFieldporcentajeDetalleRetencion.setEnabled(this.detalleretencionConstantesFunciones.activarporcentajeDetalleRetencion);
		this.jInternalFrameDetalleFormDetalleRetencion.jTextFieldmonto_minimoDetalleRetencion.setEnabled(this.detalleretencionConstantesFunciones.activarmonto_minimoDetalleRetencion);
		}
	}
	
		
}