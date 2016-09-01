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
package com.bydan.erp.sris.presentation.swing.jinternalframes;




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

import com.bydan.erp.sris.util.FacturaDiarioConstantesFunciones;
import com.bydan.erp.sris.util.FacturaDiarioParameterReturnGeneral;
//import com.bydan.erp.sris.util.FacturaDiarioParameterGeneral;
//import com.bydan.erp.sris.presentation.report.source.FacturaDiarioBean;
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

import com.bydan.erp.sris.presentation.swing.jinternalframes.auxiliar.*;
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
import com.bydan.erp.sris.resources.reportes.AuxiliarReportes;


import com.bydan.erp.sris.util.*;
import com.bydan.erp.sris.business.logic.*;

import com.bydan.erp.seguridad.business.logic.*;
import com.bydan.erp.cartera.business.logic.*;
import com.bydan.erp.contabilidad.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.sris.business.entity.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;

import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;
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


import com.bydan.erp.sris.presentation.web.jsf.sessionbean.*;

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
import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.cartera.util.*;
import com.bydan.erp.contabilidad.util.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class FacturaDiarioBeanSwingJInternalFrame extends FacturaDiarioJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(FacturaDiarioBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<FacturaDiario> facturadiarioValidator = new ClassValidator<FacturaDiario>(FacturaDiario.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public FacturaDiario facturadiario;	
	public FacturaDiario facturadiarioAux;
	public FacturaDiario facturadiarioAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public FacturaDiario facturadiarioTotales;
	public Long idFacturaDiarioActual;
	public Long iIdNuevoFacturaDiario=0L;
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

	public String sFinalQueryComboPeriodoDeclara="";

	public List<PeriodoDeclara> periododeclarasForeignKey;

	public List<PeriodoDeclara> getperiododeclarasForeignKey() {
		return periododeclarasForeignKey;
	}

	public void setperiododeclarasForeignKey(List<PeriodoDeclara> periododeclarasForeignKey) {
		this.periododeclarasForeignKey = periododeclarasForeignKey;
	}

	//OBJETO FK ACTUAL
	public PeriodoDeclara periododeclaraForeignKey;

	public PeriodoDeclara getperiododeclaraForeignKey() {
		return periododeclaraForeignKey;
	}

	public void setperiododeclaraForeignKey(PeriodoDeclara periododeclaraForeignKey) {
		this.periododeclaraForeignKey = periododeclaraForeignKey;
	}

	public String sFinalQueryComboTipoIva="";

	public List<TipoIva> tipoivasForeignKey;

	public List<TipoIva> gettipoivasForeignKey() {
		return tipoivasForeignKey;
	}

	public void settipoivasForeignKey(List<TipoIva> tipoivasForeignKey) {
		this.tipoivasForeignKey = tipoivasForeignKey;
	}

	//OBJETO FK ACTUAL
	public TipoIva tipoivaForeignKey;

	public TipoIva gettipoivaForeignKey() {
		return tipoivaForeignKey;
	}

	public void settipoivaForeignKey(TipoIva tipoivaForeignKey) {
		this.tipoivaForeignKey = tipoivaForeignKey;
	}

		
	
	
	
	//BUSQUEDA INTERNA FK
	public Long idClienteActual=0L;

	public Long getidClienteActual() {
		return idClienteActual;
	}

	public void setidClienteActual(Long idClienteActual) {
		this.idClienteActual= idClienteActual;
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
	
	public Boolean isPermisoTodoFacturaDiario;
	public Boolean isPermisoNuevoFacturaDiario;
	public Boolean isPermisoActualizarFacturaDiario;
	public Boolean isPermisoActualizarOriginalFacturaDiario;
	public Boolean isPermisoEliminarFacturaDiario;
	public Boolean isPermisoGuardarCambiosFacturaDiario;
	public Boolean isPermisoConsultaFacturaDiario;
	public Boolean isPermisoBusquedaFacturaDiario;
	public Boolean isPermisoReporteFacturaDiario;
	public Boolean isPermisoPaginacionMedioFacturaDiario;
	public Boolean isPermisoPaginacionAltoFacturaDiario;
	public Boolean isPermisoPaginacionTodoFacturaDiario;
	public Boolean isPermisoCopiarFacturaDiario;
	public Boolean isPermisoVerFormFacturaDiario;
	public Boolean isPermisoDuplicarFacturaDiario;
	public Boolean isPermisoOrdenFacturaDiario;
	
	
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
	
	public FacturaDiarioParameterReturnGeneral facturadiarioReturnGeneral;
	public FacturaDiarioParameterReturnGeneral facturadiarioParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoFacturaDiario=false;
	public Boolean esParaAccionDesdeFormularioFacturaDiario=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected FacturaDiarioSessionBeanAdditional facturadiarioSessionBeanAdditional=null;
	
	public FacturaDiarioSessionBeanAdditional getFacturaDiarioSessionBeanAdditional() {
		return this.facturadiarioSessionBeanAdditional;
	}
	
	public void setFacturaDiarioSessionBeanAdditional(FacturaDiarioSessionBeanAdditional facturadiarioSessionBeanAdditional) {
		try {
			this.facturadiarioSessionBeanAdditional=facturadiarioSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected FacturaDiarioBeanSwingJInternalFrameAdditional facturadiarioBeanSwingJInternalFrameAdditional=null;
	//public class FacturaDiarioBeanSwingJInternalFrame
	
	public FacturaDiarioBeanSwingJInternalFrameAdditional getFacturaDiarioBeanSwingJInternalFrameAdditional() {
		return this.facturadiarioBeanSwingJInternalFrameAdditional;
	}
	
	public void setFacturaDiarioBeanSwingJInternalFrameAdditional(FacturaDiarioBeanSwingJInternalFrameAdditional facturadiarioBeanSwingJInternalFrameAdditional) {
		try {
			this.facturadiarioBeanSwingJInternalFrameAdditional=facturadiarioBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public FacturaDiarioLogic facturadiarioLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public FacturaDiario facturadiarioBean;
	public FacturaDiarioConstantesFunciones facturadiarioConstantesFunciones;
	//public FacturaDiarioParameterReturnGeneral facturadiarioReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	public SucursalLogic sucursalLogic;
	public ClienteLogic clienteLogic;
	public PeriodoDeclaraLogic periododeclaraLogic;
	public TipoIvaLogic tipoivaLogic;
	
	//PARAMETROS
	
	
	//public List<FacturaDiario> facturadiarios;	
	//public List<FacturaDiario> facturadiariosEliminados;
	//public List<FacturaDiario> facturadiariosAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoFacturaDiario=false;
	public Boolean isVisibilidadCeldaDuplicarFacturaDiario=true;
	public Boolean isVisibilidadCeldaCopiarFacturaDiario=true;
	public Boolean isVisibilidadCeldaVerFormFacturaDiario=true;
	public Boolean isVisibilidadCeldaOrdenFacturaDiario=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesFacturaDiario=false;
	public Boolean isVisibilidadCeldaModificarFacturaDiario=false;
	public Boolean isVisibilidadCeldaActualizarFacturaDiario=false;
	public Boolean isVisibilidadCeldaEliminarFacturaDiario=false;
	public Boolean isVisibilidadCeldaCancelarFacturaDiario=false;
	public Boolean isVisibilidadCeldaGuardarFacturaDiario=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosFacturaDiario=false;	
	
	
	public Boolean isVisibilidadFK_IdCliente=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	public Boolean isVisibilidadFK_IdPeriodoDeclara=false;
	public Boolean isVisibilidadFK_IdSucursal=false;
	public Boolean isVisibilidadFK_IdTipoIva=false;
	
	public Long getiIdNuevoFacturaDiario() {
		return this.iIdNuevoFacturaDiario;
	}

	public void setiIdNuevoFacturaDiario(Long iIdNuevoFacturaDiario) {
		this.iIdNuevoFacturaDiario = iIdNuevoFacturaDiario;
	}
	
	public Long getidFacturaDiarioActual() {
		return this.idFacturaDiarioActual;
	}

	public void setidFacturaDiarioActual(Long idFacturaDiarioActual) {
		this.idFacturaDiarioActual = idFacturaDiarioActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public FacturaDiario getfacturadiario() {
		return this.facturadiario;
	}

	public void setfacturadiario(FacturaDiario facturadiario) {
		this.facturadiario = facturadiario;
	}
	
	public FacturaDiario getfacturadiarioAux() {
		return this.facturadiarioAux;
	}

	public void setfacturadiarioAux(FacturaDiario facturadiarioAux) {
		this.facturadiarioAux = facturadiarioAux;
	}				
	
	public FacturaDiario getfacturadiarioAnterior() {
		return this.facturadiarioAnterior;
	}

	public void setfacturadiarioAnterior(FacturaDiario facturadiarioAnterior) {
		this.facturadiarioAnterior = facturadiarioAnterior;
	}	
	
	public FacturaDiario getfacturadiarioTotales() {
		return this.facturadiarioTotales;
	}

	public void setfacturadiarioTotales(FacturaDiario facturadiarioTotales) {
		this.facturadiarioTotales = facturadiarioTotales;
	}	
	
	public FacturaDiario getfacturadiarioBean() {
		return this.facturadiarioBean;
	}

	public void setfacturadiarioBean(FacturaDiario facturadiarioBean) {
		this.facturadiarioBean = facturadiarioBean;
	}	
	
	public FacturaDiarioParameterReturnGeneral getfacturadiarioReturnGeneral() {
		return this.facturadiarioReturnGeneral;
	}

	public void setfacturadiarioReturnGeneral(FacturaDiarioParameterReturnGeneral facturadiarioReturnGeneral) {
		this.facturadiarioReturnGeneral = facturadiarioReturnGeneral;
	}	
	
	
	public Long id_clienteFK_IdCliente=-1L;

	public Long getid_clienteFK_IdCliente() {
		return this.id_clienteFK_IdCliente;
	}

	public void setid_clienteFK_IdCliente(Long id_clienteFK_IdCliente) {
		this.id_clienteFK_IdCliente = id_clienteFK_IdCliente;
	}

	public Long id_empresaFK_IdEmpresa=-1L;

	public Long getid_empresaFK_IdEmpresa() {
		return this.id_empresaFK_IdEmpresa;
	}

	public void setid_empresaFK_IdEmpresa(Long id_empresaFK_IdEmpresa) {
		this.id_empresaFK_IdEmpresa = id_empresaFK_IdEmpresa;
	}

	public Long id_periodo_declaraFK_IdPeriodoDeclara=-1L;

	public Long getid_periodo_declaraFK_IdPeriodoDeclara() {
		return this.id_periodo_declaraFK_IdPeriodoDeclara;
	}

	public void setid_periodo_declaraFK_IdPeriodoDeclara(Long id_periodo_declaraFK_IdPeriodoDeclara) {
		this.id_periodo_declaraFK_IdPeriodoDeclara = id_periodo_declaraFK_IdPeriodoDeclara;
	}

	public Long id_sucursalFK_IdSucursal=-1L;

	public Long getid_sucursalFK_IdSucursal() {
		return this.id_sucursalFK_IdSucursal;
	}

	public void setid_sucursalFK_IdSucursal(Long id_sucursalFK_IdSucursal) {
		this.id_sucursalFK_IdSucursal = id_sucursalFK_IdSucursal;
	}

	public Long id_tipo_ivaFK_IdTipoIva=-1L;

	public Long getid_tipo_ivaFK_IdTipoIva() {
		return this.id_tipo_ivaFK_IdTipoIva;
	}

	public void setid_tipo_ivaFK_IdTipoIva(Long id_tipo_ivaFK_IdTipoIva) {
		this.id_tipo_ivaFK_IdTipoIva = id_tipo_ivaFK_IdTipoIva;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public FacturaDiarioLogic getFacturaDiarioLogic()	{		
		return facturadiarioLogic;
	}

	public void setFacturaDiarioLogic(FacturaDiarioLogic facturadiarioLogic) {
		this.facturadiarioLogic = facturadiarioLogic;
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
	
	public Boolean getIsEsNuevoFacturaDiario() {
		return isEsNuevoFacturaDiario;
	}

	public void setIsEsNuevoFacturaDiario(Boolean isEsNuevoFacturaDiario) {
		this.isEsNuevoFacturaDiario = isEsNuevoFacturaDiario;
	}

	public Boolean getEsParaAccionDesdeFormularioFacturaDiario() {
		return esParaAccionDesdeFormularioFacturaDiario;
	}
	
	public void setEsParaAccionDesdeFormularioFacturaDiario(Boolean esParaAccionDesdeFormularioFacturaDiario) {
		this.esParaAccionDesdeFormularioFacturaDiario = esParaAccionDesdeFormularioFacturaDiario;
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

			if(this.facturadiarioSessionBean==null) {
				this.facturadiarioSessionBean=new FacturaDiarioSessionBean();
			}

			if(!this.facturadiarioSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(facturadiarioSessionBean.getlidEmpresaActual());
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

			if(this.facturadiarioSessionBean==null) {
				this.facturadiarioSessionBean=new FacturaDiarioSessionBean();
			}

			if(!this.facturadiarioSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
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
					sucursalLogic.getEntityWithConnection(facturadiarioSessionBean.getlidSucursalActual());
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

			if(this.facturadiarioSessionBean==null) {
				this.facturadiarioSessionBean=new FacturaDiarioSessionBean();
			}

			if(!this.facturadiarioSessionBean.getisBusquedaDesdeForeignKeySesionCliente()) {
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
					clienteLogic.getEntityWithConnection(facturadiarioSessionBean.getlidClienteActual());
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

	public void cargarCombosPeriodoDeclarasForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.periododeclarasForeignKey=new ArrayList<PeriodoDeclara>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			PeriodoDeclaraLogic periododeclaraLogic=new PeriodoDeclaraLogic();

			//periododeclaraLogic.getPeriodoDeclaraDataAccess().setIsForForeingKeyData(true);

			if(this.facturadiarioSessionBean==null) {
				this.facturadiarioSessionBean=new FacturaDiarioSessionBean();
			}

			if(!this.facturadiarioSessionBean.getisBusquedaDesdeForeignKeySesionPeriodoDeclara()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//periododeclaraLogic.getPeriodoDeclaraDataAccess().setIsForForeingKeyData(true);

					periododeclaraLogic.getTodosPeriodoDeclarasWithConnection(sFinalQuery,new Pagination());

					this.periododeclarasForeignKey=periododeclaraLogic.getPeriodoDeclaras();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaPeriodoDeclara(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					periododeclaraLogic.getEntityWithConnection(facturadiarioSessionBean.getlidPeriodoDeclaraActual());
					this.periododeclarasForeignKey.add(periododeclaraLogic.getPeriodoDeclara());
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

	public void cargarCombosTipoIvasForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.tipoivasForeignKey=new ArrayList<TipoIva>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			TipoIvaLogic tipoivaLogic=new TipoIvaLogic();

			//tipoivaLogic.getTipoIvaDataAccess().setIsForForeingKeyData(true);

			if(this.facturadiarioSessionBean==null) {
				this.facturadiarioSessionBean=new FacturaDiarioSessionBean();
			}

			if(!this.facturadiarioSessionBean.getisBusquedaDesdeForeignKeySesionTipoIva()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//tipoivaLogic.getTipoIvaDataAccess().setIsForForeingKeyData(true);

					tipoivaLogic.getTodosTipoIvasWithConnection(sFinalQuery,new Pagination());

					this.tipoivasForeignKey=tipoivaLogic.getTipoIvas();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaTipoIva(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipoivaLogic.getEntityWithConnection(facturadiarioSessionBean.getlidTipoIvaActual());
					this.tipoivasForeignKey.add(tipoivaLogic.getTipoIva());
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

					if(this.facturadiario!=null) {
						this.facturadiario.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormFacturaDiario!=null) {
						this.jInternalFrameDetalleFormFacturaDiario.jComboBoxid_empresaFacturaDiario.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaFacturaDiario.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormFacturaDiario!=null) {
						if(this.jInternalFrameDetalleFormFacturaDiario.jComboBoxid_empresaFacturaDiario.getItemCount()>0) {
							this.jInternalFrameDetalleFormFacturaDiario.jComboBoxid_empresaFacturaDiario.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaFacturaDiarioGenerico)throws Exception
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
				jComboBoxid_empresaFacturaDiarioGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaFacturaDiarioGenerico!=null && jComboBoxid_empresaFacturaDiarioGenerico.getItemCount()>0) {
					jComboBoxid_empresaFacturaDiarioGenerico.setSelectedIndex(0);
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

					if(this.facturadiario!=null) {
						this.facturadiario.setSucursal(sucursalTemp);
					}

					if(this.jInternalFrameDetalleFormFacturaDiario!=null) {
						this.jInternalFrameDetalleFormFacturaDiario.jComboBoxid_sucursalFacturaDiario.setSelectedItem(sucursalTemp);
					}
				} else {
					//jComboBoxid_sucursalFacturaDiario.setSelectedItem(sucursalTemp);
					if(this.jInternalFrameDetalleFormFacturaDiario!=null) {
						if(this.jInternalFrameDetalleFormFacturaDiario.jComboBoxid_sucursalFacturaDiario.getItemCount()>0) {
							this.jInternalFrameDetalleFormFacturaDiario.jComboBoxid_sucursalFacturaDiario.setSelectedIndex(0);
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
	public void setActualSucursalForeignKeyGenerico(Long idSucursalSeleccionado,JComboBox jComboBoxid_sucursalFacturaDiarioGenerico)throws Exception
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
				jComboBoxid_sucursalFacturaDiarioGenerico.setSelectedItem(sucursalTemp);
			} else {
				if(jComboBoxid_sucursalFacturaDiarioGenerico!=null && jComboBoxid_sucursalFacturaDiarioGenerico.getItemCount()>0) {
					jComboBoxid_sucursalFacturaDiarioGenerico.setSelectedIndex(0);
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

					if(this.facturadiario!=null) {
						this.facturadiario.setCliente(clienteTemp);
					}

					if(this.jInternalFrameDetalleFormFacturaDiario!=null) {
						this.jInternalFrameDetalleFormFacturaDiario.jComboBoxid_clienteFacturaDiario.setSelectedItem(clienteTemp);
					}
				} else {
					//jComboBoxid_clienteFacturaDiario.setSelectedItem(clienteTemp);
					if(this.jInternalFrameDetalleFormFacturaDiario!=null) {
						if(this.jInternalFrameDetalleFormFacturaDiario.jComboBoxid_clienteFacturaDiario.getItemCount()>0) {
							this.jInternalFrameDetalleFormFacturaDiario.jComboBoxid_clienteFacturaDiario.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdCliente") || sFormularioTipoBusqueda.equals("Todos")){
					if(clienteTemp!=null && jComboBoxid_clienteFK_IdClienteFacturaDiario!=null) {
						jComboBoxid_clienteFK_IdClienteFacturaDiario.setSelectedItem(clienteTemp);
					} else {
						if(jComboBoxid_clienteFK_IdClienteFacturaDiario!=null) {
							//jComboBoxid_clienteFK_IdClienteFacturaDiario.setSelectedItem(clienteTemp);
							if(jComboBoxid_clienteFK_IdClienteFacturaDiario.getItemCount()>0) {
								jComboBoxid_clienteFK_IdClienteFacturaDiario.setSelectedIndex(0);
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
	public void setActualClienteForeignKeyGenerico(Long idClienteSeleccionado,JComboBox jComboBoxid_clienteFacturaDiarioGenerico)throws Exception
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
				jComboBoxid_clienteFacturaDiarioGenerico.setSelectedItem(clienteTemp);
			} else {
				if(jComboBoxid_clienteFacturaDiarioGenerico!=null && jComboBoxid_clienteFacturaDiarioGenerico.getItemCount()>0) {
					jComboBoxid_clienteFacturaDiarioGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualPeriodoDeclaraForeignKey(Long idPeriodoDeclaraSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			PeriodoDeclara  periododeclaraTemp=null;

			for(PeriodoDeclara periododeclaraAux:periododeclarasForeignKey) {
				if(periododeclaraAux.getId()!=null && periododeclaraAux.getId().equals(idPeriodoDeclaraSeleccionado)) {
					periododeclaraTemp=periododeclaraAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(periododeclaraTemp!=null) {

					if(this.facturadiario!=null) {
						this.facturadiario.setPeriodoDeclara(periododeclaraTemp);
					}

					if(this.jInternalFrameDetalleFormFacturaDiario!=null) {
						this.jInternalFrameDetalleFormFacturaDiario.jComboBoxid_periodo_declaraFacturaDiario.setSelectedItem(periododeclaraTemp);
					}
				} else {
					//jComboBoxid_periodo_declaraFacturaDiario.setSelectedItem(periododeclaraTemp);
					if(this.jInternalFrameDetalleFormFacturaDiario!=null) {
						if(this.jInternalFrameDetalleFormFacturaDiario.jComboBoxid_periodo_declaraFacturaDiario.getItemCount()>0) {
							this.jInternalFrameDetalleFormFacturaDiario.jComboBoxid_periodo_declaraFacturaDiario.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdPeriodoDeclara") || sFormularioTipoBusqueda.equals("Todos")){
					if(periododeclaraTemp!=null && jComboBoxid_periodo_declaraFK_IdPeriodoDeclaraFacturaDiario!=null) {
						jComboBoxid_periodo_declaraFK_IdPeriodoDeclaraFacturaDiario.setSelectedItem(periododeclaraTemp);
					} else {
						if(jComboBoxid_periodo_declaraFK_IdPeriodoDeclaraFacturaDiario!=null) {
							//jComboBoxid_periodo_declaraFK_IdPeriodoDeclaraFacturaDiario.setSelectedItem(periododeclaraTemp);
							if(jComboBoxid_periodo_declaraFK_IdPeriodoDeclaraFacturaDiario.getItemCount()>0) {
								jComboBoxid_periodo_declaraFK_IdPeriodoDeclaraFacturaDiario.setSelectedIndex(0);
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

	public String getActualPeriodoDeclaraForeignKeyDescripcion(Long idPeriodoDeclaraSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			PeriodoDeclara  periododeclaraTemp=null;

			for(PeriodoDeclara periododeclaraAux:periododeclarasForeignKey) {
				if(periododeclaraAux.getId()!=null && periododeclaraAux.getId().equals(idPeriodoDeclaraSeleccionado)) {
					periododeclaraTemp=periododeclaraAux;
					break;
				}
			}


			sDescripcion=PeriodoDeclaraConstantesFunciones.getPeriodoDeclaraDescripcion(periododeclaraTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualPeriodoDeclaraForeignKeyGenerico(Long idPeriodoDeclaraSeleccionado,JComboBox jComboBoxid_periodo_declaraFacturaDiarioGenerico)throws Exception
	{
		try
		{
			PeriodoDeclara  periododeclaraTemp=null;

			for(PeriodoDeclara periododeclaraAux:periododeclarasForeignKey) {
				if(periododeclaraAux.getId()!=null && periododeclaraAux.getId().equals(idPeriodoDeclaraSeleccionado)) {
					periododeclaraTemp=periododeclaraAux;
					break;
				}
			}

			if(periododeclaraTemp!=null) {
				jComboBoxid_periodo_declaraFacturaDiarioGenerico.setSelectedItem(periododeclaraTemp);
			} else {
				if(jComboBoxid_periodo_declaraFacturaDiarioGenerico!=null && jComboBoxid_periodo_declaraFacturaDiarioGenerico.getItemCount()>0) {
					jComboBoxid_periodo_declaraFacturaDiarioGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualTipoIvaForeignKey(Long idTipoIvaSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			TipoIva  tipoivaTemp=null;

			for(TipoIva tipoivaAux:tipoivasForeignKey) {
				if(tipoivaAux.getId()!=null && tipoivaAux.getId().equals(idTipoIvaSeleccionado)) {
					tipoivaTemp=tipoivaAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(tipoivaTemp!=null) {

					if(this.facturadiario!=null) {
						this.facturadiario.setTipoIva(tipoivaTemp);
					}

					if(this.jInternalFrameDetalleFormFacturaDiario!=null) {
						this.jInternalFrameDetalleFormFacturaDiario.jComboBoxid_tipo_ivaFacturaDiario.setSelectedItem(tipoivaTemp);
					}
				} else {
					//jComboBoxid_tipo_ivaFacturaDiario.setSelectedItem(tipoivaTemp);
					if(this.jInternalFrameDetalleFormFacturaDiario!=null) {
						if(this.jInternalFrameDetalleFormFacturaDiario.jComboBoxid_tipo_ivaFacturaDiario.getItemCount()>0) {
							this.jInternalFrameDetalleFormFacturaDiario.jComboBoxid_tipo_ivaFacturaDiario.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdTipoIva") || sFormularioTipoBusqueda.equals("Todos")){
					if(tipoivaTemp!=null && jComboBoxid_tipo_ivaFK_IdTipoIvaFacturaDiario!=null) {
						jComboBoxid_tipo_ivaFK_IdTipoIvaFacturaDiario.setSelectedItem(tipoivaTemp);
					} else {
						if(jComboBoxid_tipo_ivaFK_IdTipoIvaFacturaDiario!=null) {
							//jComboBoxid_tipo_ivaFK_IdTipoIvaFacturaDiario.setSelectedItem(tipoivaTemp);
							if(jComboBoxid_tipo_ivaFK_IdTipoIvaFacturaDiario.getItemCount()>0) {
								jComboBoxid_tipo_ivaFK_IdTipoIvaFacturaDiario.setSelectedIndex(0);
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

	public String getActualTipoIvaForeignKeyDescripcion(Long idTipoIvaSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			TipoIva  tipoivaTemp=null;

			for(TipoIva tipoivaAux:tipoivasForeignKey) {
				if(tipoivaAux.getId()!=null && tipoivaAux.getId().equals(idTipoIvaSeleccionado)) {
					tipoivaTemp=tipoivaAux;
					break;
				}
			}


			sDescripcion=TipoIvaConstantesFunciones.getTipoIvaDescripcion(tipoivaTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualTipoIvaForeignKeyGenerico(Long idTipoIvaSeleccionado,JComboBox jComboBoxid_tipo_ivaFacturaDiarioGenerico)throws Exception
	{
		try
		{
			TipoIva  tipoivaTemp=null;

			for(TipoIva tipoivaAux:tipoivasForeignKey) {
				if(tipoivaAux.getId()!=null && tipoivaAux.getId().equals(idTipoIvaSeleccionado)) {
					tipoivaTemp=tipoivaAux;
					break;
				}
			}

			if(tipoivaTemp!=null) {
				jComboBoxid_tipo_ivaFacturaDiarioGenerico.setSelectedItem(tipoivaTemp);
			} else {
				if(jComboBoxid_tipo_ivaFacturaDiarioGenerico!=null && jComboBoxid_tipo_ivaFacturaDiarioGenerico.getItemCount()>0) {
					jComboBoxid_tipo_ivaFacturaDiarioGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(FacturaDiario facturadiario,JComboBox jComboBoxid_empresaFacturaDiarioGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaFacturaDiarioGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormFacturaDiario.jComboBoxid_empresaFacturaDiario.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaFacturaDiarioGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				facturadiario.setid_empresa(empresaAux.getId());
				facturadiario.setempresa_descripcion(FacturaDiarioConstantesFunciones.getEmpresaDescripcion(empresaAux));
				facturadiario.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarSucursalForeignKey(FacturaDiario facturadiario,JComboBox jComboBoxid_sucursalFacturaDiarioGenerico)throws Exception
	{
		try
		{
			Sucursal  sucursalAux=new Sucursal();

			if(jComboBoxid_sucursalFacturaDiarioGenerico==null) {
				sucursalAux=(Sucursal)this.jInternalFrameDetalleFormFacturaDiario.jComboBoxid_sucursalFacturaDiario.getSelectedItem();
			} else {
				sucursalAux=(Sucursal)jComboBoxid_sucursalFacturaDiarioGenerico.getSelectedItem();
			}

			if(sucursalAux!=null && sucursalAux.getId()!=null) {
				facturadiario.setid_sucursal(sucursalAux.getId());
				facturadiario.setsucursal_descripcion(FacturaDiarioConstantesFunciones.getSucursalDescripcion(sucursalAux));
				facturadiario.setSucursal(sucursalAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarClienteForeignKey(FacturaDiario facturadiario,JComboBox jComboBoxid_clienteFacturaDiarioGenerico)throws Exception
	{
		try
		{
			Cliente  clienteAux=new Cliente();

			if(jComboBoxid_clienteFacturaDiarioGenerico==null) {
				clienteAux=(Cliente)this.jInternalFrameDetalleFormFacturaDiario.jComboBoxid_clienteFacturaDiario.getSelectedItem();
			} else {
				clienteAux=(Cliente)jComboBoxid_clienteFacturaDiarioGenerico.getSelectedItem();
			}

			if(clienteAux!=null && clienteAux.getId()!=null) {
				facturadiario.setid_cliente(clienteAux.getId());
				facturadiario.setcliente_descripcion(FacturaDiarioConstantesFunciones.getClienteDescripcion(clienteAux));
				facturadiario.setCliente(clienteAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarPeriodoDeclaraForeignKey(FacturaDiario facturadiario,JComboBox jComboBoxid_periodo_declaraFacturaDiarioGenerico)throws Exception
	{
		try
		{
			PeriodoDeclara  periododeclaraAux=new PeriodoDeclara();

			if(jComboBoxid_periodo_declaraFacturaDiarioGenerico==null) {
				periododeclaraAux=(PeriodoDeclara)this.jInternalFrameDetalleFormFacturaDiario.jComboBoxid_periodo_declaraFacturaDiario.getSelectedItem();
			} else {
				periododeclaraAux=(PeriodoDeclara)jComboBoxid_periodo_declaraFacturaDiarioGenerico.getSelectedItem();
			}

			if(periododeclaraAux!=null && periododeclaraAux.getId()!=null) {
				facturadiario.setid_periodo_declara(periododeclaraAux.getId());
				facturadiario.setperiododeclara_descripcion(FacturaDiarioConstantesFunciones.getPeriodoDeclaraDescripcion(periododeclaraAux));
				facturadiario.setPeriodoDeclara(periododeclaraAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarTipoIvaForeignKey(FacturaDiario facturadiario,JComboBox jComboBoxid_tipo_ivaFacturaDiarioGenerico)throws Exception
	{
		try
		{
			TipoIva  tipoivaAux=new TipoIva();

			if(jComboBoxid_tipo_ivaFacturaDiarioGenerico==null) {
				tipoivaAux=(TipoIva)this.jInternalFrameDetalleFormFacturaDiario.jComboBoxid_tipo_ivaFacturaDiario.getSelectedItem();
			} else {
				tipoivaAux=(TipoIva)jComboBoxid_tipo_ivaFacturaDiarioGenerico.getSelectedItem();
			}

			if(tipoivaAux!=null && tipoivaAux.getId()!=null) {
				facturadiario.setid_tipo_iva(tipoivaAux.getId());
				facturadiario.settipoiva_descripcion(FacturaDiarioConstantesFunciones.getTipoIvaDescripcion(tipoivaAux));
				facturadiario.setTipoIva(tipoivaAux);			}
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

					if(!FacturaDiarioJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormFacturaDiario!=null) { 
							this.jInternalFrameDetalleFormFacturaDiario.jComboBoxid_empresaFacturaDiario.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormFacturaDiario.jComboBoxid_empresaFacturaDiario.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormFacturaDiario!=null) { 
					}

					if(!FacturaDiarioJInternalFrame.ISBINDING_MANUAL) {
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

					if(!FacturaDiarioJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormFacturaDiario!=null) { 
							this.jInternalFrameDetalleFormFacturaDiario.jComboBoxid_sucursalFacturaDiario.removeAllItems();

							for(Sucursal sucursal:this.sucursalsForeignKey) {
								this.jInternalFrameDetalleFormFacturaDiario.jComboBoxid_sucursalFacturaDiario.addItem(sucursal);
							}
						}
					}

					if(this.jInternalFrameDetalleFormFacturaDiario!=null) { 
					}

					if(!FacturaDiarioJInternalFrame.ISBINDING_MANUAL) {
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

					if(!FacturaDiarioJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormFacturaDiario!=null) { 
							this.jInternalFrameDetalleFormFacturaDiario.jComboBoxid_clienteFacturaDiario.removeAllItems();

							for(Cliente cliente:this.clientesForeignKey) {
								this.jInternalFrameDetalleFormFacturaDiario.jComboBoxid_clienteFacturaDiario.addItem(cliente);
							}
						}
					}

					if(this.jInternalFrameDetalleFormFacturaDiario!=null) { 
					}

					if(!FacturaDiarioJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdCliente") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!FacturaDiarioJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_clienteFK_IdClienteFacturaDiario.removeAllItems();

							for(Cliente cliente:this.clientesForeignKey) {
								this.jComboBoxid_clienteFK_IdClienteFacturaDiario.addItem(cliente);
							}
						}

						if(!FacturaDiarioJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFramePeriodoDeclarasForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingPeriodoDeclara=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!FacturaDiarioJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormFacturaDiario!=null) { 
							this.jInternalFrameDetalleFormFacturaDiario.jComboBoxid_periodo_declaraFacturaDiario.removeAllItems();

							for(PeriodoDeclara periododeclara:this.periododeclarasForeignKey) {
								this.jInternalFrameDetalleFormFacturaDiario.jComboBoxid_periodo_declaraFacturaDiario.addItem(periododeclara);
							}
						}
					}

					if(this.jInternalFrameDetalleFormFacturaDiario!=null) { 
					}

					if(!FacturaDiarioJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdPeriodoDeclara") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!FacturaDiarioJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_periodo_declaraFK_IdPeriodoDeclaraFacturaDiario.removeAllItems();

							for(PeriodoDeclara periododeclara:this.periododeclarasForeignKey) {
								this.jComboBoxid_periodo_declaraFK_IdPeriodoDeclaraFacturaDiario.addItem(periododeclara);
							}
						}

						if(!FacturaDiarioJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameTipoIvasForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingTipoIva=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!FacturaDiarioJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormFacturaDiario!=null) { 
							this.jInternalFrameDetalleFormFacturaDiario.jComboBoxid_tipo_ivaFacturaDiario.removeAllItems();

							for(TipoIva tipoiva:this.tipoivasForeignKey) {
								this.jInternalFrameDetalleFormFacturaDiario.jComboBoxid_tipo_ivaFacturaDiario.addItem(tipoiva);
							}
						}
					}

					if(this.jInternalFrameDetalleFormFacturaDiario!=null) { 
					}

					if(!FacturaDiarioJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdTipoIva") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!FacturaDiarioJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_tipo_ivaFK_IdTipoIvaFacturaDiario.removeAllItems();

							for(TipoIva tipoiva:this.tipoivasForeignKey) {
								this.jComboBoxid_tipo_ivaFK_IdTipoIvaFacturaDiario.addItem(tipoiva);
							}
						}

						if(!FacturaDiarioJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormFacturaDiario!=null) {
							this.jInternalFrameDetalleFormFacturaDiario.jComboBoxid_empresaFacturaDiario.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormFacturaDiario!=null) {
							this.jInternalFrameDetalleFormFacturaDiario.jComboBoxid_empresaFacturaDiario.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormFacturaDiario!=null) {
							this.jInternalFrameDetalleFormFacturaDiario.jComboBoxid_sucursalFacturaDiario.setSelectedItem(sucursal);
						}
					} else {
						if(this.jInternalFrameDetalleFormFacturaDiario!=null) {
							this.jInternalFrameDetalleFormFacturaDiario.jComboBoxid_sucursalFacturaDiario.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormFacturaDiario!=null) {
							this.jInternalFrameDetalleFormFacturaDiario.jComboBoxid_clienteFacturaDiario.setSelectedItem(cliente);
						}
					} else {
						if(this.jInternalFrameDetalleFormFacturaDiario!=null) {
							this.jInternalFrameDetalleFormFacturaDiario.jComboBoxid_clienteFacturaDiario.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_clienteFK_IdClienteFacturaDiario.setSelectedItem(cliente);
						} else {
							this.jComboBoxid_clienteFK_IdClienteFacturaDiario.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFramePeriodoDeclaraForeignKey(PeriodoDeclara periododeclara,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormFacturaDiario!=null) {
							this.jInternalFrameDetalleFormFacturaDiario.jComboBoxid_periodo_declaraFacturaDiario.setSelectedItem(periododeclara);
						}
					} else {
						if(this.jInternalFrameDetalleFormFacturaDiario!=null) {
							this.jInternalFrameDetalleFormFacturaDiario.jComboBoxid_periodo_declaraFacturaDiario.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_periodo_declaraFK_IdPeriodoDeclaraFacturaDiario.setSelectedItem(periododeclara);
						} else {
							this.jComboBoxid_periodo_declaraFK_IdPeriodoDeclaraFacturaDiario.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameTipoIvaForeignKey(TipoIva tipoiva,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormFacturaDiario!=null) {
							this.jInternalFrameDetalleFormFacturaDiario.jComboBoxid_tipo_ivaFacturaDiario.setSelectedItem(tipoiva);
						}
					} else {
						if(this.jInternalFrameDetalleFormFacturaDiario!=null) {
							this.jInternalFrameDetalleFormFacturaDiario.jComboBoxid_tipo_ivaFacturaDiario.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_tipo_ivaFK_IdTipoIvaFacturaDiario.setSelectedItem(tipoiva);
						} else {
							this.jComboBoxid_tipo_ivaFK_IdTipoIvaFacturaDiario.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesFacturaDiario() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			FacturaDiarioConstantesFunciones.refrescarForeignKeysDescripcionesFacturaDiario(this.facturadiarioLogic.getFacturaDiarios());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			FacturaDiarioConstantesFunciones.refrescarForeignKeysDescripcionesFacturaDiario(this.facturadiarios);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
		classes.add(new Classe(Sucursal.class));
		classes.add(new Classe(Cliente.class));
		classes.add(new Classe(PeriodoDeclara.class));
		classes.add(new Classe(TipoIva.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//facturadiarioLogic.setFacturaDiarios(this.facturadiarios);
			facturadiarioLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public FacturaDiarioParameterReturnGeneral getFacturaDiarioParameterGeneral() {
		return this.facturadiarioParameterGeneral;
	}
	
	public void setFacturaDiarioParameterGeneral(FacturaDiarioParameterReturnGeneral facturadiarioParameterGeneral) {
		this.facturadiarioParameterGeneral = facturadiarioParameterGeneral;
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
	
	public Boolean getIsPermisoTodoFacturaDiario() {
		return isPermisoTodoFacturaDiario;
	}

	public void setIsPermisoTodoFacturaDiario(Boolean isPermisoTodoFacturaDiario) {
		this.isPermisoTodoFacturaDiario = isPermisoTodoFacturaDiario;
	}

	public Boolean getIsPermisoNuevoFacturaDiario() {
		return isPermisoNuevoFacturaDiario;
	}

	public void setIsPermisoNuevoFacturaDiario(Boolean isPermisoNuevoFacturaDiario) {
		this.isPermisoNuevoFacturaDiario = isPermisoNuevoFacturaDiario;
	}

	public Boolean getIsPermisoActualizarFacturaDiario() {
		return isPermisoActualizarFacturaDiario;
	}

	public void setIsPermisoActualizarFacturaDiario(Boolean isPermisoActualizarFacturaDiario) {
		this.isPermisoActualizarFacturaDiario = isPermisoActualizarFacturaDiario;
	}

	public Boolean getIsPermisoEliminarFacturaDiario() {
		return isPermisoEliminarFacturaDiario;
	}

	public void setIsPermisoEliminarFacturaDiario(Boolean isPermisoEliminarFacturaDiario) {
		this.isPermisoEliminarFacturaDiario = isPermisoEliminarFacturaDiario;
	}

	public Boolean getIsPermisoGuardarCambiosFacturaDiario() {
		return isPermisoGuardarCambiosFacturaDiario;
	}

	public void setIsPermisoGuardarCambiosFacturaDiario(Boolean isPermisoGuardarCambiosFacturaDiario) {
		this.isPermisoGuardarCambiosFacturaDiario = isPermisoGuardarCambiosFacturaDiario;
	}
	
	public Boolean getIsPermisoConsultaFacturaDiario() {
		return isPermisoConsultaFacturaDiario;
	}

	public void setIsPermisoConsultaFacturaDiario(Boolean isPermisoConsultaFacturaDiario) {
		this.isPermisoConsultaFacturaDiario = isPermisoConsultaFacturaDiario;
	}

	public Boolean getIsPermisoBusquedaFacturaDiario() {
		return isPermisoBusquedaFacturaDiario;
	}

	public void setIsPermisoBusquedaFacturaDiario(Boolean isPermisoBusquedaFacturaDiario) {
		this.isPermisoBusquedaFacturaDiario = isPermisoBusquedaFacturaDiario;
	}

	public Boolean getIsPermisoReporteFacturaDiario() {
		return isPermisoReporteFacturaDiario;
	}

	public void setIsPermisoReporteFacturaDiario(Boolean isPermisoReporteFacturaDiario) {
		this.isPermisoReporteFacturaDiario = isPermisoReporteFacturaDiario;
	}
	
	public Boolean getIsPermisoPaginacionMedioFacturaDiario() {
		return isPermisoPaginacionMedioFacturaDiario;
	}

	public void setIsPermisoPaginacionMedioFacturaDiario(Boolean isPermisoPaginacionMedioFacturaDiario) {
		this.isPermisoPaginacionMedioFacturaDiario = isPermisoPaginacionMedioFacturaDiario;
	}
	
	public Boolean getIsPermisoPaginacionTodoFacturaDiario() {
		return isPermisoPaginacionTodoFacturaDiario;
	}

	public void setIsPermisoPaginacionTodoFacturaDiario(Boolean isPermisoPaginacionTodoFacturaDiario) {
		this.isPermisoPaginacionTodoFacturaDiario = isPermisoPaginacionTodoFacturaDiario;
	}
	
	public Boolean getIsPermisoPaginacionAltoFacturaDiario() {
		return isPermisoPaginacionAltoFacturaDiario;
	}

	public void setIsPermisoPaginacionAltoFacturaDiario(Boolean isPermisoPaginacionAltoFacturaDiario) {
		this.isPermisoPaginacionAltoFacturaDiario = isPermisoPaginacionAltoFacturaDiario;
	}
	
	public Boolean getIsPermisoCopiarFacturaDiario() {
		return isPermisoCopiarFacturaDiario;
	}

	public void setIsPermisoCopiarFacturaDiario(Boolean isPermisoCopiarFacturaDiario) {
		this.isPermisoCopiarFacturaDiario = isPermisoCopiarFacturaDiario;
	}
	
	public Boolean getIsPermisoVerFormFacturaDiario() {
		return isPermisoVerFormFacturaDiario;
	}

	public void setIsPermisoVerFormFacturaDiario(Boolean isPermisoVerFormFacturaDiario) {
		this.isPermisoVerFormFacturaDiario = isPermisoVerFormFacturaDiario;
	}
	
	public Boolean getIsPermisoDuplicarFacturaDiario() {
		return isPermisoDuplicarFacturaDiario;
	}

	public void setIsPermisoDuplicarFacturaDiario(Boolean isPermisoDuplicarFacturaDiario) {
		this.isPermisoDuplicarFacturaDiario = isPermisoDuplicarFacturaDiario;
	}
	
	public Boolean getIsPermisoOrdenFacturaDiario() {
		return isPermisoOrdenFacturaDiario;
	}

	public void setIsPermisoOrdenFacturaDiario(Boolean isPermisoOrdenFacturaDiario) {
		this.isPermisoOrdenFacturaDiario = isPermisoOrdenFacturaDiario;
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
	
	public Boolean getIsVisibilidadCeldaNuevoFacturaDiario() {
		return isVisibilidadCeldaNuevoFacturaDiario;
	}

	public void setIsVisibilidadCeldaNuevoFacturaDiario(Boolean isVisibilidadCeldaNuevoFacturaDiario) {
		this.isVisibilidadCeldaNuevoFacturaDiario = isVisibilidadCeldaNuevoFacturaDiario;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarFacturaDiario() {
		return isVisibilidadCeldaDuplicarFacturaDiario;
	}

	public void setIsVisibilidadCeldaDuplicarFacturaDiario(Boolean isVisibilidadCeldaDuplicarFacturaDiario) {
		this.isVisibilidadCeldaDuplicarFacturaDiario = isVisibilidadCeldaDuplicarFacturaDiario;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarFacturaDiario() {
		return isVisibilidadCeldaCopiarFacturaDiario;
	}

	public void setIsVisibilidadCeldaCopiarFacturaDiario(Boolean isVisibilidadCeldaCopiarFacturaDiario) {
		this.isVisibilidadCeldaCopiarFacturaDiario = isVisibilidadCeldaCopiarFacturaDiario;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormFacturaDiario() {
		return isVisibilidadCeldaVerFormFacturaDiario;
	}

	public void setIsVisibilidadCeldaVerFormFacturaDiario(Boolean isVisibilidadCeldaVerFormFacturaDiario) {
		this.isVisibilidadCeldaVerFormFacturaDiario = isVisibilidadCeldaVerFormFacturaDiario;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenFacturaDiario() {
		return isVisibilidadCeldaOrdenFacturaDiario;
	}

	public void setIsVisibilidadCeldaOrdenFacturaDiario(Boolean isVisibilidadCeldaOrdenFacturaDiario) {
		this.isVisibilidadCeldaOrdenFacturaDiario = isVisibilidadCeldaOrdenFacturaDiario;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesFacturaDiario() {
		return isVisibilidadCeldaNuevoRelacionesFacturaDiario;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesFacturaDiario(Boolean isVisibilidadCeldaNuevoRelacionesFacturaDiario) {
		this.isVisibilidadCeldaNuevoRelacionesFacturaDiario = isVisibilidadCeldaNuevoRelacionesFacturaDiario;
	}
	
	public Boolean getIsVisibilidadCeldaModificarFacturaDiario() {
		return isVisibilidadCeldaModificarFacturaDiario;
	}

	public void setIsVisibilidadCeldaModificarFacturaDiario(Boolean isVisibilidadCeldaModificarFacturaDiario) {
		this.isVisibilidadCeldaModificarFacturaDiario = isVisibilidadCeldaModificarFacturaDiario;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarFacturaDiario() {
		return isVisibilidadCeldaActualizarFacturaDiario;
	}

	public void setIsVisibilidadCeldaActualizarFacturaDiario(Boolean isVisibilidadCeldaActualizarFacturaDiario) {
		this.isVisibilidadCeldaActualizarFacturaDiario = isVisibilidadCeldaActualizarFacturaDiario;
	}

	public Boolean getIsVisibilidadCeldaEliminarFacturaDiario() {
		return isVisibilidadCeldaEliminarFacturaDiario;
	}

	public void setIsVisibilidadCeldaEliminarFacturaDiario(Boolean isVisibilidadCeldaEliminarFacturaDiario) {
		this.isVisibilidadCeldaEliminarFacturaDiario = isVisibilidadCeldaEliminarFacturaDiario;
	}

	public Boolean getIsVisibilidadCeldaCancelarFacturaDiario() {
		return isVisibilidadCeldaCancelarFacturaDiario;
	}

	public void setIsVisibilidadCeldaCancelarFacturaDiario(Boolean isVisibilidadCeldaCancelarFacturaDiario) {
		this.isVisibilidadCeldaCancelarFacturaDiario = isVisibilidadCeldaCancelarFacturaDiario;
	}

	public Boolean getIsVisibilidadCeldaGuardarFacturaDiario() {
		return isVisibilidadCeldaGuardarFacturaDiario;
	}

	public void setIsVisibilidadCeldaGuardarFacturaDiario(Boolean isVisibilidadCeldaGuardarFacturaDiario) {
		this.isVisibilidadCeldaGuardarFacturaDiario = isVisibilidadCeldaGuardarFacturaDiario;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosFacturaDiario() {
		return isVisibilidadCeldaGuardarCambiosFacturaDiario;
	}

	public void setIsVisibilidadCeldaGuardarCambiosFacturaDiario(Boolean isVisibilidadCeldaGuardarCambiosFacturaDiario) {
		this.isVisibilidadCeldaGuardarCambiosFacturaDiario = isVisibilidadCeldaGuardarCambiosFacturaDiario;
	}
		
	public FacturaDiarioSessionBean getfacturadiarioSessionBean() {
		return this.facturadiarioSessionBean;
	}
	
	public void setfacturadiarioSessionBean(FacturaDiarioSessionBean facturadiarioSessionBean) {
		this.facturadiarioSessionBean=facturadiarioSessionBean;
	}
	
	
	public Boolean getisVisibilidadFK_IdCliente() {
		return this.isVisibilidadFK_IdCliente;
	}

	public void setisVisibilidadFK_IdCliente(Boolean isVisibilidadFK_IdCliente) {
		this.isVisibilidadFK_IdCliente=isVisibilidadFK_IdCliente;
	}

	public Boolean getisVisibilidadFK_IdEmpresa() {
		return this.isVisibilidadFK_IdEmpresa;
	}

	public void setisVisibilidadFK_IdEmpresa(Boolean isVisibilidadFK_IdEmpresa) {
		this.isVisibilidadFK_IdEmpresa=isVisibilidadFK_IdEmpresa;
	}

	public Boolean getisVisibilidadFK_IdPeriodoDeclara() {
		return this.isVisibilidadFK_IdPeriodoDeclara;
	}

	public void setisVisibilidadFK_IdPeriodoDeclara(Boolean isVisibilidadFK_IdPeriodoDeclara) {
		this.isVisibilidadFK_IdPeriodoDeclara=isVisibilidadFK_IdPeriodoDeclara;
	}

	public Boolean getisVisibilidadFK_IdSucursal() {
		return this.isVisibilidadFK_IdSucursal;
	}

	public void setisVisibilidadFK_IdSucursal(Boolean isVisibilidadFK_IdSucursal) {
		this.isVisibilidadFK_IdSucursal=isVisibilidadFK_IdSucursal;
	}

	public Boolean getisVisibilidadFK_IdTipoIva() {
		return this.isVisibilidadFK_IdTipoIva;
	}

	public void setisVisibilidadFK_IdTipoIva(Boolean isVisibilidadFK_IdTipoIva) {
		this.isVisibilidadFK_IdTipoIva=isVisibilidadFK_IdTipoIva;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysFacturaDiario(FacturaDiario facturadiario)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(facturadiario,null);
				this.setActualParaGuardarSucursalForeignKey(facturadiario,null);
				this.setActualParaGuardarClienteForeignKey(facturadiario,null);
				this.setActualParaGuardarPeriodoDeclaraForeignKey(facturadiario,null);
				this.setActualParaGuardarTipoIvaForeignKey(facturadiario,null);
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
	
	public void bugActualizarReferenciaActual(FacturaDiario facturadiario,FacturaDiario facturadiarioAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalFacturaDiario(facturadiario);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		facturadiarioAux.setId(facturadiario.getId());
		facturadiarioAux.setVersionRow(facturadiario.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessFacturaDiario();
		
			int intSelectedRow = this.jTableDatosFacturaDiario.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturadiario =(FacturaDiario) this.facturadiarioLogic.getFacturaDiarios().toArray()[this.jTableDatosFacturaDiario.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.facturadiario =(FacturaDiario) this.facturadiarios.toArray()[this.jTableDatosFacturaDiario.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(FacturaDiarioJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualFacturaDiario(this.facturadiario,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysFacturaDiario(this.facturadiario);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = facturadiarioValidator.getInvalidValues(this.facturadiario);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			facturadiarioLogic.setDatosCliente(datosCliente);
			facturadiarioLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				facturadiarioAux=new  FacturaDiario();
				
				facturadiarioAux.setIsNew(true);
				facturadiarioAux.setIsChanged(true);
				
				facturadiarioAux.setFacturaDiarioOriginal(this.facturadiario);
				
				facturadiarioAux.setId(this.facturadiario.getId());	
				facturadiarioAux.setVersionRow(this.facturadiario.getVersionRow());	
				facturadiarioAux.setid_empresa(this.facturadiario.getid_empresa());	
				facturadiarioAux.setid_sucursal(this.facturadiario.getid_sucursal());	
				facturadiarioAux.setid_cliente(this.facturadiario.getid_cliente());	
				facturadiarioAux.setid_periodo_declara(this.facturadiario.getid_periodo_declara());	
				facturadiarioAux.setid_tipo_iva(this.facturadiario.getid_tipo_iva());	
				facturadiarioAux.setfecha_emision(this.facturadiario.getfecha_emision());	
				facturadiarioAux.setfecha_vencimiento(this.facturadiario.getfecha_vencimiento());	
				facturadiarioAux.setnumero_serie(this.facturadiario.getnumero_serie());	
				facturadiarioAux.setruc(this.facturadiario.getruc());	
				facturadiarioAux.setnumero_autoriza(this.facturadiario.getnumero_autoriza());	
				facturadiarioAux.setes_devolucion(this.facturadiario.getes_devolucion());	
				facturadiarioAux.setvalor_factura(this.facturadiario.getvalor_factura());	
				facturadiarioAux.setbase_imponible(this.facturadiario.getbase_imponible());	
				facturadiarioAux.setmonto_iva(this.facturadiario.getmonto_iva());	
				facturadiarioAux.setbim_tarjeta(this.facturadiario.getbim_tarjeta());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.facturadiarioSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.facturadiarioSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(facturadiarioAux,facturadiarioLogic.getFacturaDiarios());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(facturadiarioAux,facturadiarios);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.facturadiarioSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.facturadiarioSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						facturadiarioLogic.saveFacturaDiarios();//WithConnection
						//facturadiarioLogic.getSetVersionRowFacturaDiarios();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.facturadiario,facturadiarioAux);
					
					this.refrescarForeignKeysDescripcionesFacturaDiario();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.facturadiarioSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE	
						
						if(!this.facturadiarioSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								facturadiarioLogic.saveFacturaDiarioRelaciones(facturadiarioAux);//WithConnection
								//facturadiarioLogic.getSetVersionRowFacturaDiarios();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.facturadiario,facturadiarioAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE	
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.facturadiarioSessionBean.getEstaModoGuardarRelaciones() 
									|| this.facturadiarioSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(facturadiarioAux,facturadiarioLogic.getFacturaDiarios());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(facturadiarioAux,facturadiarios);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.facturadiario,facturadiarioAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				facturadiarioAux=new  FacturaDiario();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.facturadiarioSessionBean.getEsGuardarRelacionado() 
					|| (this.facturadiarioSessionBean.getEsGuardarRelacionado() && this.facturadiario.getId()>=0)) {
						
					facturadiarioAux.setIsNew(false);
				}
				
				facturadiarioAux.setIsDeleted(false);
			
				facturadiarioAux.setId(this.facturadiario.getId());	
				facturadiarioAux.setVersionRow(this.facturadiario.getVersionRow());	
				facturadiarioAux.setid_empresa(this.facturadiario.getid_empresa());	
				facturadiarioAux.setid_sucursal(this.facturadiario.getid_sucursal());	
				facturadiarioAux.setid_cliente(this.facturadiario.getid_cliente());	
				facturadiarioAux.setid_periodo_declara(this.facturadiario.getid_periodo_declara());	
				facturadiarioAux.setid_tipo_iva(this.facturadiario.getid_tipo_iva());	
				facturadiarioAux.setfecha_emision(this.facturadiario.getfecha_emision());	
				facturadiarioAux.setfecha_vencimiento(this.facturadiario.getfecha_vencimiento());	
				facturadiarioAux.setnumero_serie(this.facturadiario.getnumero_serie());	
				facturadiarioAux.setruc(this.facturadiario.getruc());	
				facturadiarioAux.setnumero_autoriza(this.facturadiario.getnumero_autoriza());	
				facturadiarioAux.setes_devolucion(this.facturadiario.getes_devolucion());	
				facturadiarioAux.setvalor_factura(this.facturadiario.getvalor_factura());	
				facturadiarioAux.setbase_imponible(this.facturadiario.getbase_imponible());	
				facturadiarioAux.setmonto_iva(this.facturadiario.getmonto_iva());	
				facturadiarioAux.setbim_tarjeta(this.facturadiario.getbim_tarjeta());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(facturadiarioAux,facturadiarioLogic.getFacturaDiarios());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(facturadiarioAux,facturadiarios);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.facturadiarioSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.facturadiarioSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						facturadiarioLogic.saveFacturaDiarios();//WithConnection
						//facturadiarioLogic.getSetVersionRowFacturaDiarios();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.facturadiario,facturadiarioAux);
					
					this.refrescarForeignKeysDescripcionesFacturaDiario();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.facturadiarioSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						if(!this.facturadiarioSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								facturadiarioLogic.saveFacturaDiarioRelaciones(facturadiarioAux);//WithConnection
								//facturadiarioLogic.getSetVersionRowFacturaDiarios();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.facturadiario,facturadiarioAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.facturadiarioSessionBean.getEstaModoGuardarRelaciones() 
									|| this.facturadiarioSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(facturadiarioAux,facturadiarioLogic.getFacturaDiarios());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(facturadiarioAux,facturadiarios);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.facturadiario,facturadiarioAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				facturadiarioAux=new  FacturaDiario();
				
				facturadiarioAux.setIsNew(false);
				facturadiarioAux.setIsChanged(false);
				
				facturadiarioAux.setIsDeleted(true);
				
				facturadiarioAux.setId(this.facturadiario.getId());	
				facturadiarioAux.setVersionRow(this.facturadiario.getVersionRow());	
				facturadiarioAux.setid_empresa(this.facturadiario.getid_empresa());	
				facturadiarioAux.setid_sucursal(this.facturadiario.getid_sucursal());	
				facturadiarioAux.setid_cliente(this.facturadiario.getid_cliente());	
				facturadiarioAux.setid_periodo_declara(this.facturadiario.getid_periodo_declara());	
				facturadiarioAux.setid_tipo_iva(this.facturadiario.getid_tipo_iva());	
				facturadiarioAux.setfecha_emision(this.facturadiario.getfecha_emision());	
				facturadiarioAux.setfecha_vencimiento(this.facturadiario.getfecha_vencimiento());	
				facturadiarioAux.setnumero_serie(this.facturadiario.getnumero_serie());	
				facturadiarioAux.setruc(this.facturadiario.getruc());	
				facturadiarioAux.setnumero_autoriza(this.facturadiario.getnumero_autoriza());	
				facturadiarioAux.setes_devolucion(this.facturadiario.getes_devolucion());	
				facturadiarioAux.setvalor_factura(this.facturadiario.getvalor_factura());	
				facturadiarioAux.setbase_imponible(this.facturadiario.getbase_imponible());	
				facturadiarioAux.setmonto_iva(this.facturadiario.getmonto_iva());	
				facturadiarioAux.setbim_tarjeta(this.facturadiario.getbim_tarjeta());	
				
				if(this.facturadiarioSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.facturadiarioAux.getId()>=0) {	
						this.facturadiariosEliminados.add(facturadiarioAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(facturadiarioAux,facturadiarioLogic.getFacturaDiarios());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(facturadiarioAux,facturadiarios);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.facturadiarioSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.facturadiarioSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						facturadiarioLogic.saveFacturaDiarios();//WithConnection
						//facturadiarioLogic.getSetVersionRowFacturaDiarios();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.facturadiarioSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						
						if(!this.facturadiarioSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								facturadiarioLogic.saveFacturaDiarioRelaciones(facturadiarioAux);//WithConnection
								//facturadiarioLogic.getSetVersionRowFacturaDiarios();//WithConnection
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
							if(this.facturadiarioSessionBean.getEstaModoGuardarRelaciones() 
								|| this.facturadiarioSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(facturadiarioAux,facturadiarioLogic.getFacturaDiarios());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(facturadiarioAux,facturadiarios);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturadiarioLogic.getFacturaDiarios().addAll(this.facturadiariosEliminados);
					
					facturadiarioLogic.saveFacturaDiarios();//WithConnection
					//facturadiarioLogic.getSetVersionRowFacturaDiarios();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesFacturaDiario();
				
				this.facturadiariosEliminados= new ArrayList<FacturaDiario>();		
			}
			
			if(this.facturadiarioSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.facturadiarioSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Factura Diario GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Factura Diario",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.facturadiario=facturadiarioAux;
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
      		//this.finishProcessFacturaDiario();
      	}
		
	}	
	
	public void actualizarRelaciones(FacturaDiario facturadiarioLocal) throws Exception {
		
		if(this.facturadiarioSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(FacturaDiario facturadiarioLocal) throws Exception {	
		if(this.facturadiarioSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				facturadiarioLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(SucursalDetalleFormJInternalFrame.class)) {
				SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrameLocal=(SucursalBeanSwingJInternalFrame) ((SucursalDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				sucursalBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoSucursal(sucursalBeanSwingJInternalFrameLocal.getsucursal(),true);
				sucursalBeanSwingJInternalFrameLocal.actualizarLista(sucursalBeanSwingJInternalFrameLocal.sucursal,this.sucursalsForeignKey);

				sucursalBeanSwingJInternalFrameLocal.actualizarRelaciones(sucursalBeanSwingJInternalFrameLocal.sucursal);

				facturadiarioLocal.setSucursal(sucursalBeanSwingJInternalFrameLocal.sucursal);

				this.addItemDefectoCombosForeignKeySucursal();
				this.cargarCombosFrameSucursalsForeignKey("Formulario");
				this.setActualSucursalForeignKey(sucursalBeanSwingJInternalFrameLocal.sucursal.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(ClienteDetalleFormJInternalFrame.class)) {
				ClienteBeanSwingJInternalFrame clienteBeanSwingJInternalFrameLocal=(ClienteBeanSwingJInternalFrame) ((ClienteDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				clienteBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoCliente(clienteBeanSwingJInternalFrameLocal.getcliente(),true);
				clienteBeanSwingJInternalFrameLocal.actualizarLista(clienteBeanSwingJInternalFrameLocal.cliente,this.clientesForeignKey);

				clienteBeanSwingJInternalFrameLocal.actualizarRelaciones(clienteBeanSwingJInternalFrameLocal.cliente);

				facturadiarioLocal.setCliente(clienteBeanSwingJInternalFrameLocal.cliente);

				this.addItemDefectoCombosForeignKeyCliente();
				this.cargarCombosFrameClientesForeignKey("Formulario");
				this.setActualClienteForeignKey(clienteBeanSwingJInternalFrameLocal.cliente.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(PeriodoDeclaraDetalleFormJInternalFrame.class)) {
				PeriodoDeclaraBeanSwingJInternalFrame periododeclaraBeanSwingJInternalFrameLocal=(PeriodoDeclaraBeanSwingJInternalFrame) ((PeriodoDeclaraDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				periododeclaraBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoPeriodoDeclara(periododeclaraBeanSwingJInternalFrameLocal.getperiododeclara(),true);
				periododeclaraBeanSwingJInternalFrameLocal.actualizarLista(periododeclaraBeanSwingJInternalFrameLocal.periododeclara,this.periododeclarasForeignKey);

				periododeclaraBeanSwingJInternalFrameLocal.actualizarRelaciones(periododeclaraBeanSwingJInternalFrameLocal.periododeclara);

				facturadiarioLocal.setPeriodoDeclara(periododeclaraBeanSwingJInternalFrameLocal.periododeclara);

				this.addItemDefectoCombosForeignKeyPeriodoDeclara();
				this.cargarCombosFramePeriodoDeclarasForeignKey("Formulario");
				this.setActualPeriodoDeclaraForeignKey(periododeclaraBeanSwingJInternalFrameLocal.periododeclara.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(TipoIvaDetalleFormJInternalFrame.class)) {
				TipoIvaBeanSwingJInternalFrame tipoivaBeanSwingJInternalFrameLocal=(TipoIvaBeanSwingJInternalFrame) ((TipoIvaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				tipoivaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoTipoIva(tipoivaBeanSwingJInternalFrameLocal.gettipoiva(),true);
				tipoivaBeanSwingJInternalFrameLocal.actualizarLista(tipoivaBeanSwingJInternalFrameLocal.tipoiva,this.tipoivasForeignKey);

				tipoivaBeanSwingJInternalFrameLocal.actualizarRelaciones(tipoivaBeanSwingJInternalFrameLocal.tipoiva);

				facturadiarioLocal.setTipoIva(tipoivaBeanSwingJInternalFrameLocal.tipoiva);

				this.addItemDefectoCombosForeignKeyTipoIva();
				this.cargarCombosFrameTipoIvasForeignKey("Formulario");
				this.setActualTipoIvaForeignKey(tipoivaBeanSwingJInternalFrameLocal.tipoiva.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarFacturaDiarioActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosFacturaDiario.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.facturadiario =(FacturaDiario) this.facturadiarioLogic.getFacturaDiarios().toArray()[this.jTableDatosFacturaDiario.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.facturadiario =(FacturaDiario) this.facturadiarios.toArray()[this.jTableDatosFacturaDiario.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = facturadiarioValidator.getInvalidValues(this.facturadiario);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(FacturaDiario facturadiario,List<FacturaDiario> facturadiarios) throws Exception {
		try	{		
			FacturaDiarioConstantesFunciones.actualizarLista(facturadiario,facturadiarios,this.facturadiarioSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(FacturaDiario facturadiario,List<FacturaDiario> facturadiarios) throws Exception {
		try	{			
			FacturaDiarioConstantesFunciones.actualizarSelectedLista(facturadiario,facturadiarios);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<FacturaDiario> facturadiariosLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				facturadiariosLocal=this.facturadiarioLogic.getFacturaDiarios();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				facturadiariosLocal=this.facturadiarios;
			}
			//ARCHITECTURE
		
			for(FacturaDiario facturadiarioLocal:facturadiariosLocal) {
				if(this.permiteMantenimiento(facturadiarioLocal) && facturadiarioLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+FacturaDiarioConstantesFunciones.getFacturaDiarioLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(FacturaDiarioConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormFacturaDiario.jLabelid_empresaFacturaDiario,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(FacturaDiarioConstantesFunciones.IDSUCURSAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormFacturaDiario.jLabelid_sucursalFacturaDiario,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(FacturaDiarioConstantesFunciones.IDCLIENTE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormFacturaDiario.jLabelid_clienteFacturaDiario,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(FacturaDiarioConstantesFunciones.IDPERIODODECLARA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormFacturaDiario.jLabelid_periodo_declaraFacturaDiario,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(FacturaDiarioConstantesFunciones.IDTIPOIVA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormFacturaDiario.jLabelid_tipo_ivaFacturaDiario,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(FacturaDiarioConstantesFunciones.FECHAEMISION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormFacturaDiario.jLabelfecha_emisionFacturaDiario,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(FacturaDiarioConstantesFunciones.FECHAVENCIMIENTO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormFacturaDiario.jLabelfecha_vencimientoFacturaDiario,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(FacturaDiarioConstantesFunciones.NUMEROSERIE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormFacturaDiario.jLabelnumero_serieFacturaDiario,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(FacturaDiarioConstantesFunciones.RUC)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormFacturaDiario.jLabelrucFacturaDiario,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(FacturaDiarioConstantesFunciones.NUMEROAUTORIZA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormFacturaDiario.jLabelnumero_autorizaFacturaDiario,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(FacturaDiarioConstantesFunciones.ESDEVOLUCION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormFacturaDiario.jLabeles_devolucionFacturaDiario,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(FacturaDiarioConstantesFunciones.VALORFACTURA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormFacturaDiario.jLabelvalor_facturaFacturaDiario,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(FacturaDiarioConstantesFunciones.BASEIMPONIBLE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormFacturaDiario.jLabelbase_imponibleFacturaDiario,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(FacturaDiarioConstantesFunciones.MONTOIVA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormFacturaDiario.jLabelmonto_ivaFacturaDiario,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(FacturaDiarioConstantesFunciones.BIMTARJETA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormFacturaDiario.jLabelbim_tarjetaFacturaDiario,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormFacturaDiario!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormFacturaDiario.jLabelid_empresaFacturaDiario,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormFacturaDiario.jLabelid_sucursalFacturaDiario,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormFacturaDiario.jLabelid_clienteFacturaDiario,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormFacturaDiario.jLabelid_periodo_declaraFacturaDiario,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormFacturaDiario.jLabelid_tipo_ivaFacturaDiario,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormFacturaDiario.jLabelfecha_emisionFacturaDiario,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormFacturaDiario.jLabelfecha_vencimientoFacturaDiario,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormFacturaDiario.jLabelnumero_serieFacturaDiario,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormFacturaDiario.jLabelrucFacturaDiario,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormFacturaDiario.jLabelnumero_autorizaFacturaDiario,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormFacturaDiario.jLabeles_devolucionFacturaDiario,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormFacturaDiario.jLabelvalor_facturaFacturaDiario,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormFacturaDiario.jLabelbase_imponibleFacturaDiario,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormFacturaDiario.jLabelmonto_ivaFacturaDiario,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormFacturaDiario.jLabelbim_tarjetaFacturaDiario,"");
		
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
		this.iIdNuevoFacturaDiario--;	
		
		
		this.facturadiarioAux=new FacturaDiario();
		
		this.facturadiarioAux.setId(this.iIdNuevoFacturaDiario);
		this.facturadiarioAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.facturadiarioLogic.getFacturaDiarios().add(this.facturadiarioAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.facturadiarios.add(this.facturadiarioAux);
		}
		//ARCHITECTURE
		
		this.facturadiario=this.facturadiarioAux;
		
		if(FacturaDiarioJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioFacturaDiario(this.facturadiario);
			this.setVariablesObjetoActualToFormularioForeignKeyFacturaDiario(this.facturadiario);
		}
				
		//this.setDefaultControlesFacturaDiario();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyFacturaDiario();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyFacturaDiario();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyFacturaDiario();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualFacturaDiario(this.facturadiarioBean,this.facturadiario,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysFacturaDiario(this.facturadiario);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(FacturaDiarioConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.facturadiarioSessionBean.getConGuardarRelaciones()) {
			classes=FacturaDiarioConstantesFunciones.getClassesRelationshipsOfFacturaDiario(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.facturadiarioReturnGeneral=facturadiarioLogic.procesarEventosFacturaDiariosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.facturadiarioLogic.getFacturaDiarios(),this.facturadiario,this.facturadiarioParameterGeneral,this.isEsNuevoFacturaDiario,classes);//this.facturadiarioLogic.getFacturaDiario()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanFacturaDiario(this.facturadiarioReturnGeneral,this.facturadiarioBean,false);
		
		if(this.facturadiarioReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyFacturaDiario(this.facturadiarioReturnGeneral.getFacturaDiario());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioFacturaDiario(this.facturadiarioReturnGeneral.getFacturaDiario());
		}
		
		if(this.facturadiarioReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioFacturaDiario(this.facturadiarioReturnGeneral.getFacturaDiario(),classes);//this.facturadiarioBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualFacturaDiario(this.facturadiario,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyFacturaDiario();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyFacturaDiario();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			FacturaDiarioBeanSwingJInternalFrameAdditional.RecargarFormFacturaDiario(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingFacturaDiario(false);
						
			if(facturadiarioSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(FacturaDiarioJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualFacturaDiario();
			}
			
			this.actualizarVisualTableDatosFacturaDiario();
			
			this.jTableDatosFacturaDiario.setRowSelectionInterval(this.getIndiceNuevoFacturaDiario(), this.getIndiceNuevoFacturaDiario());
			
			this.seleccionarFilaTablaFacturaDiarioActual();
						
			this.actualizarEstadoCeldasBotonesFacturaDiario("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesFacturaDiario(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormFacturaDiario.jDateChooserfecha_emisionFacturaDiario.setEnabled(isHabilitar && this.facturadiarioConstantesFunciones.activarfecha_emisionFacturaDiario);
		this.jInternalFrameDetalleFormFacturaDiario.jDateChooserfecha_vencimientoFacturaDiario.setEnabled(isHabilitar && this.facturadiarioConstantesFunciones.activarfecha_vencimientoFacturaDiario);
		this.jInternalFrameDetalleFormFacturaDiario.jTextFieldnumero_serieFacturaDiario.setEnabled(isHabilitar && this.facturadiarioConstantesFunciones.activarnumero_serieFacturaDiario);
		this.jInternalFrameDetalleFormFacturaDiario.jTextFieldrucFacturaDiario.setEnabled(isHabilitar && this.facturadiarioConstantesFunciones.activarrucFacturaDiario);
		this.jInternalFrameDetalleFormFacturaDiario.jTextFieldnumero_autorizaFacturaDiario.setEnabled(isHabilitar && this.facturadiarioConstantesFunciones.activarnumero_autorizaFacturaDiario);
		this.jInternalFrameDetalleFormFacturaDiario.jCheckBoxes_devolucionFacturaDiario.setEnabled(isHabilitar && this.facturadiarioConstantesFunciones.activares_devolucionFacturaDiario);
		this.jInternalFrameDetalleFormFacturaDiario.jTextFieldvalor_facturaFacturaDiario.setEnabled(isHabilitar && this.facturadiarioConstantesFunciones.activarvalor_facturaFacturaDiario);
		this.jInternalFrameDetalleFormFacturaDiario.jTextFieldbase_imponibleFacturaDiario.setEnabled(isHabilitar && this.facturadiarioConstantesFunciones.activarbase_imponibleFacturaDiario);
		this.jInternalFrameDetalleFormFacturaDiario.jTextFieldmonto_ivaFacturaDiario.setEnabled(isHabilitar && this.facturadiarioConstantesFunciones.activarmonto_ivaFacturaDiario);
		this.jInternalFrameDetalleFormFacturaDiario.jTextFieldbim_tarjetaFacturaDiario.setEnabled(isHabilitar && this.facturadiarioConstantesFunciones.activarbim_tarjetaFacturaDiario);	
		//
		this.jInternalFrameDetalleFormFacturaDiario.jComboBoxid_empresaFacturaDiario.setEnabled(isHabilitar && this.facturadiarioConstantesFunciones.activarid_empresaFacturaDiario);//
		this.jInternalFrameDetalleFormFacturaDiario.jComboBoxid_sucursalFacturaDiario.setEnabled(isHabilitar && this.facturadiarioConstantesFunciones.activarid_sucursalFacturaDiario);
		this.jInternalFrameDetalleFormFacturaDiario.jComboBoxid_clienteFacturaDiario.setEnabled(isHabilitar && this.facturadiarioConstantesFunciones.activarid_clienteFacturaDiario);
		this.jInternalFrameDetalleFormFacturaDiario.jComboBoxid_periodo_declaraFacturaDiario.setEnabled(isHabilitar && this.facturadiarioConstantesFunciones.activarid_periodo_declaraFacturaDiario);
		this.jInternalFrameDetalleFormFacturaDiario.jComboBoxid_tipo_ivaFacturaDiario.setEnabled(isHabilitar && this.facturadiarioConstantesFunciones.activarid_tipo_ivaFacturaDiario);
	};
	
	public void setDefaultControlesFacturaDiario() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoFacturaDiario(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.facturadiarioSessionBean.setConGuardarRelaciones(true);			
			this.facturadiarioSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormFacturaDiario.jTabbedPaneRelacionesFacturaDiario.setVisible(true);
			
					
		} else {
			//this.facturadiarioSessionBean.setConGuardarRelaciones(false);			
			this.facturadiarioSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormFacturaDiario.jTabbedPaneRelacionesFacturaDiario.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoFacturaDiario() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(FacturaDiario facturadiarioAux:this.facturadiarioLogic.getFacturaDiarios()) {
				if(facturadiarioAux.getId().equals(this.iIdNuevoFacturaDiario)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(FacturaDiario facturadiarioAux:this.facturadiarios) {
				if(facturadiarioAux.getId().equals(this.iIdNuevoFacturaDiario)) {
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
	
	public int getIndiceActualFacturaDiario(FacturaDiario facturadiario,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(FacturaDiario facturadiarioAux:this.facturadiarioLogic.getFacturaDiarios()) {
				if(facturadiarioAux.getId().equals(facturadiario.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(FacturaDiario facturadiarioAux:this.facturadiarios) {
				if(facturadiarioAux.getId().equals(facturadiario.getId())) {
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
	
	public void setCamposBaseDesdeOriginalFacturaDiario(FacturaDiario facturadiarioOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(FacturaDiario facturadiarioAux:this.facturadiarioLogic.getFacturaDiarios()) {
				if(facturadiarioAux.getFacturaDiarioOriginal().getId().equals(facturadiarioOriginal.getId())) {
					existe=true;
					facturadiarioOriginal.setId(facturadiarioAux.getId());
					facturadiarioOriginal.setVersionRow(facturadiarioAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(FacturaDiario facturadiarioAux:this.facturadiarios) {
				if(facturadiarioAux.getFacturaDiarioOriginal().getId().equals(facturadiarioOriginal.getId())) {
					existe=true;
					facturadiarioOriginal.setId(facturadiarioAux.getId());
					facturadiarioOriginal.setVersionRow(facturadiarioAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosFacturaDiario(Boolean esParaCancelar) throws Exception {
		facturadiariosAux=new ArrayList<FacturaDiario>();
		facturadiarioAux=new FacturaDiario();
		
		if(!this.facturadiarioSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(FacturaDiario facturadiarioAux:this.facturadiarioLogic.getFacturaDiarios()) {
					if(facturadiarioAux.getId()<0) {
						facturadiariosAux.add(facturadiarioAux);
					}		
				}
				this.iIdNuevoFacturaDiario=0L;
				this.facturadiarioLogic.getFacturaDiarios().removeAll(facturadiariosAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(FacturaDiario facturadiarioAux:this.facturadiarios) {
					if(facturadiarioAux.getId()<0) {
						facturadiariosAux.add(facturadiarioAux);
					}		
				}
				this.iIdNuevoFacturaDiario=0L;
				this.facturadiarios.removeAll(facturadiariosAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoFacturaDiario 
					&& this.facturadiarioLogic.getFacturaDiarios().size()>0
					) {
					facturadiarioAux=this.facturadiarioLogic.getFacturaDiarios().get(this.facturadiarioLogic.getFacturaDiarios().size() - 1);
				
					if(facturadiarioAux.getId()<0) {
						this.facturadiarioLogic.getFacturaDiarios().remove(facturadiarioAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoFacturaDiario && this.facturadiarios.size()>0) {
					facturadiarioAux=this.facturadiarios.get(this.facturadiarios.size() - 1);
				
					if(facturadiarioAux.getId()<0) {
						this.facturadiarios.remove(facturadiarioAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoFacturaDiario(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(facturadiario.getId()<0) {
				this.facturadiarioLogic.getFacturaDiarios().remove(this.facturadiario);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(facturadiario.getId()<0) {
				this.facturadiarios.remove(this.facturadiario);
			}
		}			
	}
	
	public void setEstadosInicialesFacturaDiario(List<FacturaDiario> facturadiariosAux) throws Exception {
		FacturaDiarioConstantesFunciones.setEstadosInicialesFacturaDiario(facturadiariosAux);
	}
	
	public void setEstadosInicialesFacturaDiario(FacturaDiario facturadiarioAux) throws Exception {
		FacturaDiarioConstantesFunciones.setEstadosInicialesFacturaDiario(facturadiarioAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarFacturaDiarioActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesFacturaDiario("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,FacturaDiarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarFacturaDiarioActual()) {
				if(!this.isEsNuevoFacturaDiario) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesFacturaDiario("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoFacturaDiario=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,FacturaDiarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarFacturaDiarioActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Factura Diario ?", "MANTENIMIENTO DE Factura Diario", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesFacturaDiario("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,FacturaDiarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FacturaDiarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(FacturaDiario facturadiario) throws Exception {
		FacturaDiarioConstantesFunciones.seleccionarAsignar(this.facturadiario,facturadiario);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarFacturaDiario=this.isPermisoActualizarOriginalFacturaDiario;
			
			
			this.seleccionarAsignar(facturadiario);
			
			

			idClienteActual=facturadiario.getid_cliente();
			this.seleccionarClienteActual();
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			FacturaDiarioConstantesFunciones.quitarEspaciosFacturaDiario(this.facturadiario,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesFacturaDiario("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FacturaDiarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.facturadiarioSessionBean.setsFuncionBusquedaRapida(this.facturadiarioSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FacturaDiarioConstantesFunciones.CLASSNAME);
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
			if(this.isEsNuevoFacturaDiario) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosFacturaDiario(esParaCancelar);				
				this.cancelarNuevoFacturaDiario(esParaCancelar);								
			}
			
			this.facturadiario=new FacturaDiario();
			
			this.inicializarFacturaDiario();
			
			this.actualizarEstadoCeldasBotonesFacturaDiario("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FacturaDiarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarFacturaDiario() throws Exception {
		try {
			FacturaDiarioConstantesFunciones.inicializarFacturaDiario(this.facturadiario);
			
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
			FuncionesSwing.manageException(this, e,logger,FacturaDiarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.facturadiarioLogic.getFacturaDiarios().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FacturaDiarioConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteFacturaDiarios(String sAccionBusqueda,List<FacturaDiario> facturadiariosParaReportes) throws Exception {
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
					sPathReporteFinal="FacturaDiario"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="FacturaDiarioMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("FacturaDiarioMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="FacturaDiario"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Factura Diarios");		
		parameters.put("busquedapor", FacturaDiarioConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceFacturaDiario=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			FacturaDiarioConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			FacturaDiarioConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceFacturaDiario=new JRBeanArrayDataSource(FacturaDiarioJInternalFrame.TraerFacturaDiarioBeans(facturadiariosParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceFacturaDiario);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+FacturaDiarioConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+FacturaDiarioConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(FacturaDiarioBean.TraerFacturaDiarioBeans(facturadiariosParaReportes).toArray()));
							
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
				this.generarExcelReporteFacturaDiarios(sAccionBusqueda,sTipoArchivoReporte,facturadiariosParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalFacturaDiarios(sAccionBusqueda,sTipoArchivoReporte,facturadiariosParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoFacturaDiarioActionPerformed(null);
					//this.generarExcelReporteFacturaDiarios(sAccionBusqueda,sTipoArchivoReporte,facturadiariosParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalFacturaDiarios(sAccionBusqueda,sTipoArchivoReporte,facturadiariosParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesFacturaDiarios(sAccionBusqueda,sTipoArchivoReporte,facturadiariosParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesFacturaDiarios(sAccionBusqueda,sTipoArchivoReporte,facturadiariosParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteFacturaDiarios(String sAccionBusqueda,String sTipoArchivoReporte,List<FacturaDiario> facturadiariosParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"facturadiario";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("FacturaDiarios");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderFacturaDiario("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(FacturaDiario facturadiario : facturadiariosParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			FacturaDiarioConstantesFunciones.generarExcelReporteDataFacturaDiario("NORMAL",row,workbook,facturadiario,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.facturadiarioSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Factura Diario",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderFacturaDiario(String sTipo,Row row,Workbook workbook) {
		
		FacturaDiarioConstantesFunciones.generarExcelReporteHeaderFacturaDiario(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalFacturaDiarios(String sAccionBusqueda,String sTipoArchivoReporte,List<FacturaDiario> facturadiariosParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"facturadiario_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("FacturaDiarios");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(FacturaDiario facturadiario : facturadiariosParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(FacturaDiarioConstantesFunciones.getFacturaDiarioDescripcion(facturadiario));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(FacturaDiarioConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(FacturaDiarioConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(facturadiario.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(FacturaDiarioConstantesFunciones.LABEL_IDSUCURSAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(FacturaDiarioConstantesFunciones.LABEL_IDSUCURSAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(facturadiario.getsucursal_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(FacturaDiarioConstantesFunciones.LABEL_IDCLIENTE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(FacturaDiarioConstantesFunciones.LABEL_IDCLIENTE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(facturadiario.getcliente_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(FacturaDiarioConstantesFunciones.LABEL_IDPERIODODECLARA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(FacturaDiarioConstantesFunciones.LABEL_IDPERIODODECLARA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(facturadiario.getperiododeclara_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(FacturaDiarioConstantesFunciones.LABEL_IDTIPOIVA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(FacturaDiarioConstantesFunciones.LABEL_IDTIPOIVA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(facturadiario.gettipoiva_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(FacturaDiarioConstantesFunciones.LABEL_FECHAEMISION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(FacturaDiarioConstantesFunciones.LABEL_FECHAEMISION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(facturadiario.getfecha_emision());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(FacturaDiarioConstantesFunciones.LABEL_FECHAVENCIMIENTO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(FacturaDiarioConstantesFunciones.LABEL_FECHAVENCIMIENTO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(facturadiario.getfecha_vencimiento());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(FacturaDiarioConstantesFunciones.LABEL_NUMEROSERIE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(FacturaDiarioConstantesFunciones.LABEL_NUMEROSERIE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(facturadiario.getnumero_serie());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(FacturaDiarioConstantesFunciones.LABEL_RUC))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(FacturaDiarioConstantesFunciones.LABEL_RUC);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(facturadiario.getruc());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(FacturaDiarioConstantesFunciones.LABEL_NUMEROAUTORIZA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(FacturaDiarioConstantesFunciones.LABEL_NUMEROAUTORIZA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(facturadiario.getnumero_autoriza());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(FacturaDiarioConstantesFunciones.LABEL_ESDEVOLUCION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(FacturaDiarioConstantesFunciones.LABEL_ESDEVOLUCION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(Funciones2.getDescripcionBoolean(facturadiario.getes_devolucion()));


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(FacturaDiarioConstantesFunciones.LABEL_VALORFACTURA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(FacturaDiarioConstantesFunciones.LABEL_VALORFACTURA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(facturadiario.getvalor_factura());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(FacturaDiarioConstantesFunciones.LABEL_BASEIMPONIBLE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(FacturaDiarioConstantesFunciones.LABEL_BASEIMPONIBLE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(facturadiario.getbase_imponible());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(FacturaDiarioConstantesFunciones.LABEL_MONTOIVA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(FacturaDiarioConstantesFunciones.LABEL_MONTOIVA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(facturadiario.getmonto_iva());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(FacturaDiarioConstantesFunciones.LABEL_BIMTARJETA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(FacturaDiarioConstantesFunciones.LABEL_BIMTARJETA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(facturadiario.getbim_tarjeta());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.facturadiarioSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Factura Diario",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesFacturaDiarios(String sAccionBusqueda,String sTipoArchivoReporte,List<FacturaDiario> facturadiariosParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<FacturaDiario> facturadiariosRespaldo=null;
		
		classes=FacturaDiarioConstantesFunciones.getClassesRelationshipsOfFacturaDiario(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.facturadiarioLogic.setDatosCliente(this.datosCliente);
		this.facturadiarioLogic.setDatosDeep(this.datosDeep);
		this.facturadiarioLogic.setIsConDeep(true);
		
		facturadiariosRespaldo=this.facturadiarioLogic.getFacturaDiarios();
		
		this.facturadiarioLogic.setFacturaDiarios(facturadiariosParaReportes);	
		this.facturadiarioLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		facturadiariosParaReportes=this.facturadiarioLogic.getFacturaDiarios();
		this.facturadiarioLogic.setFacturaDiarios(facturadiariosRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"facturadiario_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("FacturaDiarios");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderFacturaDiario("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(FacturaDiario facturadiario : facturadiariosParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderFacturaDiario("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			FacturaDiarioConstantesFunciones.generarExcelReporteDataFacturaDiario("NORMAL",row,workbook,facturadiario,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(FacturaDiarioConstantesFunciones.getFacturaDiarioDescripcion(facturadiario));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.facturadiarioSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Factura Diario",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoFacturaDiario.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoFacturaDiario.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoFacturaDiario.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoFacturaDiario.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessFacturaDiario() throws Exception {		
		this.startProcessFacturaDiario(true);
	}
	
	public void startProcessFacturaDiario(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasFacturaDiario ,this.jPanelParametrosReportesFacturaDiario, this.jScrollPanelDatosFacturaDiario,this.jPanelPaginacionFacturaDiario, this.jScrollPanelDatosEdicionFacturaDiario, this.jPanelAccionesFacturaDiario,this.jPanelAccionesFormularioFacturaDiario,this.jmenuBarFacturaDiario,this.jmenuBarDetalleFacturaDiario,this.jTtoolBarFacturaDiario,this.jTtoolBarDetalleFacturaDiario);		
		
		final JTabbedPane jTabbedPaneBusquedasFacturaDiario=this.jTabbedPaneBusquedasFacturaDiario; 
		
		final JPanel jPanelParametrosReportesFacturaDiario=this.jPanelParametrosReportesFacturaDiario;
		//final JScrollPane jScrollPanelDatosFacturaDiario=this.jScrollPanelDatosFacturaDiario;
		final JTable jTableDatosFacturaDiario=this.jTableDatosFacturaDiario;		
		final JPanel jPanelPaginacionFacturaDiario=this.jPanelPaginacionFacturaDiario;
		//final JScrollPane jScrollPanelDatosEdicionFacturaDiario=this.jScrollPanelDatosEdicionFacturaDiario;
		final JPanel jPanelAccionesFacturaDiario=this.jPanelAccionesFacturaDiario;
		
		JPanel jPanelCamposAuxiliarFacturaDiario=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarFacturaDiario=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormFacturaDiario!=null) {
			jPanelCamposAuxiliarFacturaDiario=this.jInternalFrameDetalleFormFacturaDiario.jPanelCamposFacturaDiario;
			jPanelAccionesFormularioAuxiliarFacturaDiario=this.jInternalFrameDetalleFormFacturaDiario.jPanelAccionesFormularioFacturaDiario;
		}
		
		final JPanel jPanelCamposFacturaDiario=jPanelCamposAuxiliarFacturaDiario;
		final JPanel jPanelAccionesFormularioFacturaDiario=jPanelAccionesFormularioAuxiliarFacturaDiario;
		
		
		final JMenuBar jmenuBarFacturaDiario=this.jmenuBarFacturaDiario;
		final JToolBar jTtoolBarFacturaDiario=this.jTtoolBarFacturaDiario;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarFacturaDiario=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarFacturaDiario=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormFacturaDiario!=null) {
			jmenuBarDetalleAuxiliarFacturaDiario=this.jInternalFrameDetalleFormFacturaDiario.jmenuBarDetalleFacturaDiario;
			jTtoolBarDetalleAuxiliarFacturaDiario=this.jInternalFrameDetalleFormFacturaDiario.jTtoolBarDetalleFacturaDiario;
		}
		
		final JMenuBar jmenuBarDetalleFacturaDiario=jmenuBarDetalleAuxiliarFacturaDiario;
		final JToolBar jTtoolBarDetalleFacturaDiario=jTtoolBarDetalleAuxiliarFacturaDiario;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasFacturaDiario;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesFacturaDiario;
			processRunnable.jTableDatos=jTableDatosFacturaDiario;
			processRunnable.jPanelCampos=jPanelCamposFacturaDiario;
			processRunnable.jPanelPaginacion=jPanelPaginacionFacturaDiario;
			processRunnable.jPanelAcciones=jPanelAccionesFacturaDiario;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioFacturaDiario;
			
			
			processRunnable.jmenuBar=jmenuBarFacturaDiario;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleFacturaDiario;
			processRunnable.jTtoolBar=jTtoolBarFacturaDiario;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleFacturaDiario;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasFacturaDiario ,jPanelParametrosReportesFacturaDiario,jTableDatosFacturaDiario, /*jScrollPanelDatosFacturaDiario,*/jPanelCamposFacturaDiario,jPanelPaginacionFacturaDiario, /*jScrollPanelDatosEdicionFacturaDiario,*/ jPanelAccionesFacturaDiario,jPanelAccionesFormularioFacturaDiario,jmenuBarFacturaDiario,jmenuBarDetalleFacturaDiario,jTtoolBarFacturaDiario,jTtoolBarDetalleFacturaDiario);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasFacturaDiario ,jPanelParametrosReportesFacturaDiario, jScrollPanelDatosFacturaDiario,jPanelPaginacionFacturaDiario, jScrollPanelDatosEdicionFacturaDiario, jPanelAccionesFacturaDiario,jPanelAccionesFormularioFacturaDiario,jmenuBarFacturaDiario,jmenuBarDetalleFacturaDiario,jTtoolBarFacturaDiario,jTtoolBarDetalleFacturaDiario);
						
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
	
	public void finishProcessFacturaDiario() {// throws Exception 
		this.finishProcessFacturaDiario(true);
	}
	
	public void finishProcessFacturaDiario(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasFacturaDiario ,this.jPanelParametrosReportesFacturaDiario, this.jScrollPanelDatosFacturaDiario,this.jPanelPaginacionFacturaDiario, this.jScrollPanelDatosEdicionFacturaDiario, this.jPanelAccionesFacturaDiario,this.jPanelAccionesFormularioFacturaDiario,this.jmenuBarFacturaDiario,this.jmenuBarDetalleFacturaDiario,this.jTtoolBarFacturaDiario,this.jTtoolBarDetalleFacturaDiario);		
		
		final JTabbedPane jTabbedPaneBusquedasFacturaDiario=this.jTabbedPaneBusquedasFacturaDiario; 
		
		final JPanel jPanelParametrosReportesFacturaDiario=this.jPanelParametrosReportesFacturaDiario;
		//final JScrollPane jScrollPanelDatosFacturaDiario=this.jScrollPanelDatosFacturaDiario;
		final JTable jTableDatosFacturaDiario=this.jTableDatosFacturaDiario;		
		final JPanel jPanelPaginacionFacturaDiario=this.jPanelPaginacionFacturaDiario;
		//final JScrollPane jScrollPanelDatosEdicionFacturaDiario=this.jScrollPanelDatosEdicionFacturaDiario;
		final JPanel jPanelAccionesFacturaDiario=this.jPanelAccionesFacturaDiario;
		
		JPanel jPanelCamposAuxiliarFacturaDiario=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarFacturaDiario=new JPanel();
		
		if(this.jInternalFrameDetalleFormFacturaDiario!=null) {
			jPanelCamposAuxiliarFacturaDiario=this.jInternalFrameDetalleFormFacturaDiario.jPanelCamposFacturaDiario;
			jPanelAccionesFormularioAuxiliarFacturaDiario=this.jInternalFrameDetalleFormFacturaDiario.jPanelAccionesFormularioFacturaDiario;
		}
		
		final JPanel jPanelCamposFacturaDiario=jPanelCamposAuxiliarFacturaDiario;
		final JPanel jPanelAccionesFormularioFacturaDiario=jPanelAccionesFormularioAuxiliarFacturaDiario;
		
		
		final JMenuBar jmenuBarFacturaDiario=this.jmenuBarFacturaDiario;		
		final JToolBar jTtoolBarFacturaDiario=this.jTtoolBarFacturaDiario;
				
		JMenuBar jmenuBarDetalleAuxiliarFacturaDiario=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarFacturaDiario=new JToolBar();
		
		if(this.jInternalFrameDetalleFormFacturaDiario!=null) {
			jmenuBarDetalleAuxiliarFacturaDiario=this.jInternalFrameDetalleFormFacturaDiario.jmenuBarDetalleFacturaDiario;
			jTtoolBarDetalleAuxiliarFacturaDiario=this.jInternalFrameDetalleFormFacturaDiario.jTtoolBarDetalleFacturaDiario;		
		}
		
		final JMenuBar jmenuBarDetalleFacturaDiario=jmenuBarDetalleAuxiliarFacturaDiario;
		final JToolBar jTtoolBarDetalleFacturaDiario=jTtoolBarDetalleAuxiliarFacturaDiario;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasFacturaDiario;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesFacturaDiario;
			processRunnable.jTableDatos=jTableDatosFacturaDiario;
			processRunnable.jPanelCampos=jPanelCamposFacturaDiario;
			processRunnable.jPanelPaginacion=jPanelPaginacionFacturaDiario;
			processRunnable.jPanelAcciones=jPanelAccionesFacturaDiario;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioFacturaDiario;
			
			
			processRunnable.jmenuBar=jmenuBarFacturaDiario;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleFacturaDiario;
			processRunnable.jTtoolBar=jTtoolBarFacturaDiario;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleFacturaDiario;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasFacturaDiario ,jPanelParametrosReportesFacturaDiario, jTableDatosFacturaDiario,/*jScrollPanelDatosFacturaDiario,*/jPanelCamposFacturaDiario,jPanelPaginacionFacturaDiario, /*jScrollPanelDatosEdicionFacturaDiario,*/ jPanelAccionesFacturaDiario,jPanelAccionesFormularioFacturaDiario,jmenuBarFacturaDiario,jmenuBarDetalleFacturaDiario,jTtoolBarFacturaDiario,jTtoolBarDetalleFacturaDiario));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesFacturaDiario(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarFacturaDiario(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuFacturaDiario(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarFacturaDiario(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarFacturaDiario,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleFacturaDiario,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuFacturaDiario(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarFacturaDiario,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleFacturaDiario,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.facturadiarioConstantesFunciones.getsFinalQueryFacturaDiario();
		String  finalQueryPaginacionTodos=this.facturadiarioConstantesFunciones.getsFinalQueryFacturaDiario();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=FacturaDiarioConstantesFunciones.getArrayColumnasGlobalesNoFacturaDiario(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=FacturaDiarioConstantesFunciones.getArrayColumnasGlobalesFacturaDiario(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,FacturaDiarioConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.facturadiariosEliminados= new ArrayList<FacturaDiario>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessFacturaDiario();
		
				///*FacturaDiarioSessionBean*/this.facturadiarioSessionBean=new FacturaDiarioSessionBean();
			
			if(this.facturadiarioSessionBean==null) {
				this.facturadiarioSessionBean=new FacturaDiarioSessionBean();
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
					this.iNumeroPaginacion=FacturaDiarioConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=FacturaDiarioConstantesFunciones.getClassesForeignKeysOfFacturaDiario(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/facturadiario."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			facturadiariosAux= new ArrayList<FacturaDiario>();
			
				
			facturadiarioLogic.setDatosCliente(this.datosCliente);
			facturadiarioLogic.setDatosDeep(this.datosDeep);
			facturadiarioLogic.setIsConDeep(true);
			
			
			facturadiarioLogic.getFacturaDiarioDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					facturadiarioLogic.getTodosFacturaDiarios(finalQueryGlobal,pagination);
					
					//facturadiarioLogic.getTodosFacturaDiariosWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(facturadiarioLogic.getFacturaDiarios()==null|| facturadiarioLogic.getFacturaDiarios().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							facturadiariosAux= new ArrayList<FacturaDiario>();
							facturadiariosAux.addAll(facturadiarioLogic.getFacturaDiarios());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							facturadiariosAux= new ArrayList<FacturaDiario>();
							facturadiariosAux.addAll(facturadiarios);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							facturadiarioLogic.getTodosFacturaDiarios(finalQueryGlobal+"",this.pagination);												
							
							//facturadiarioLogic.getTodosFacturaDiariosWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteFacturaDiarios("Todos",facturadiarioLogic.getFacturaDiarios() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							facturadiarioLogic.setFacturaDiarios(new ArrayList<FacturaDiario>());					
							facturadiarioLogic.getFacturaDiarios().addAll(facturadiariosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							facturadiarios=new ArrayList<FacturaDiario>();
							facturadiarios.addAll(facturadiariosAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idFacturaDiario=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idFacturaDiario=this.idActual;
				
				} else if(this.idFacturaDiarioActual!=null && this.idFacturaDiarioActual!=0L) {
					idFacturaDiario=idFacturaDiarioActual;
				}
				
					
				this.sDetalleReporte=FacturaDiarioConstantesFunciones.getDetalleIndicePorId(idFacturaDiario);
				
				this.facturadiarios=new ArrayList<FacturaDiario>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					facturadiarioLogic.getEntity(idFacturaDiario);
					
					//facturadiarioLogic.getEntityWithConnection(idFacturaDiario);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					facturadiarioLogic.setFacturaDiarios(new ArrayList<FacturaDiario>());
					facturadiarioLogic.getFacturaDiarios().add(facturadiarioLogic.getFacturaDiario());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.facturadiarios=new ArrayList<FacturaDiario>();
					this.facturadiarios.add(facturadiario);
				}
				
				if(facturadiarioLogic.getFacturaDiario()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdCliente")) {
				this.sDetalleReporte=FacturaDiarioConstantesFunciones.getDetalleIndiceFK_IdCliente(id_clienteFK_IdCliente);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					facturadiarioLogic.getFacturaDiariosFK_IdCliente(finalQueryGlobal,pagination,id_clienteFK_IdCliente);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=FacturaDiarioConstantesFunciones.getDetalleIndiceFK_IdCliente(id_clienteFK_IdCliente);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=FacturaDiarioConstantesFunciones.getDetalleIndiceFK_IdCliente(id_clienteFK_IdCliente);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=facturadiarioLogic.getFacturaDiarios()==null||facturadiarioLogic.getFacturaDiarios().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=facturadiarios==null|| facturadiarios.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						facturadiariosAux=new ArrayList<FacturaDiario>();
						facturadiariosAux.addAll(facturadiarioLogic.getFacturaDiarios());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							facturadiariosAux=new ArrayList<FacturaDiario>();
							facturadiariosAux.addAll(facturadiarios);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							facturadiarioLogic.getFacturaDiariosFK_IdCliente(finalQueryGlobal,pagination,id_clienteFK_IdCliente);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=FacturaDiarioConstantesFunciones.getDetalleIndiceFK_IdCliente(id_clienteFK_IdCliente);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=FacturaDiarioConstantesFunciones.getDetalleIndiceFK_IdCliente(id_clienteFK_IdCliente);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteFacturaDiarios("FK_IdCliente",facturadiarioLogic.getFacturaDiarios());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteFacturaDiarios("FK_IdCliente",facturadiarios);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						facturadiarioLogic.setFacturaDiarios(new ArrayList<FacturaDiario>());
						facturadiarioLogic.getFacturaDiarios().addAll(facturadiariosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							facturadiarios=new ArrayList<FacturaDiario>();
							facturadiarios.addAll(facturadiariosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=FacturaDiarioConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					facturadiarioLogic.getFacturaDiariosFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=FacturaDiarioConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=FacturaDiarioConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=facturadiarioLogic.getFacturaDiarios()==null||facturadiarioLogic.getFacturaDiarios().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=facturadiarios==null|| facturadiarios.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						facturadiariosAux=new ArrayList<FacturaDiario>();
						facturadiariosAux.addAll(facturadiarioLogic.getFacturaDiarios());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							facturadiariosAux=new ArrayList<FacturaDiario>();
							facturadiariosAux.addAll(facturadiarios);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							facturadiarioLogic.getFacturaDiariosFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=FacturaDiarioConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=FacturaDiarioConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteFacturaDiarios("FK_IdEmpresa",facturadiarioLogic.getFacturaDiarios());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteFacturaDiarios("FK_IdEmpresa",facturadiarios);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						facturadiarioLogic.setFacturaDiarios(new ArrayList<FacturaDiario>());
						facturadiarioLogic.getFacturaDiarios().addAll(facturadiariosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							facturadiarios=new ArrayList<FacturaDiario>();
							facturadiarios.addAll(facturadiariosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdPeriodoDeclara")) {
				this.sDetalleReporte=FacturaDiarioConstantesFunciones.getDetalleIndiceFK_IdPeriodoDeclara(id_periodo_declaraFK_IdPeriodoDeclara);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					facturadiarioLogic.getFacturaDiariosFK_IdPeriodoDeclara(finalQueryGlobal,pagination,id_periodo_declaraFK_IdPeriodoDeclara);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=FacturaDiarioConstantesFunciones.getDetalleIndiceFK_IdPeriodoDeclara(id_periodo_declaraFK_IdPeriodoDeclara);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=FacturaDiarioConstantesFunciones.getDetalleIndiceFK_IdPeriodoDeclara(id_periodo_declaraFK_IdPeriodoDeclara);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=facturadiarioLogic.getFacturaDiarios()==null||facturadiarioLogic.getFacturaDiarios().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=facturadiarios==null|| facturadiarios.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						facturadiariosAux=new ArrayList<FacturaDiario>();
						facturadiariosAux.addAll(facturadiarioLogic.getFacturaDiarios());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							facturadiariosAux=new ArrayList<FacturaDiario>();
							facturadiariosAux.addAll(facturadiarios);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							facturadiarioLogic.getFacturaDiariosFK_IdPeriodoDeclara(finalQueryGlobal,pagination,id_periodo_declaraFK_IdPeriodoDeclara);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=FacturaDiarioConstantesFunciones.getDetalleIndiceFK_IdPeriodoDeclara(id_periodo_declaraFK_IdPeriodoDeclara);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=FacturaDiarioConstantesFunciones.getDetalleIndiceFK_IdPeriodoDeclara(id_periodo_declaraFK_IdPeriodoDeclara);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteFacturaDiarios("FK_IdPeriodoDeclara",facturadiarioLogic.getFacturaDiarios());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteFacturaDiarios("FK_IdPeriodoDeclara",facturadiarios);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						facturadiarioLogic.setFacturaDiarios(new ArrayList<FacturaDiario>());
						facturadiarioLogic.getFacturaDiarios().addAll(facturadiariosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							facturadiarios=new ArrayList<FacturaDiario>();
							facturadiarios.addAll(facturadiariosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdSucursal")) {
				this.sDetalleReporte=FacturaDiarioConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					facturadiarioLogic.getFacturaDiariosFK_IdSucursal(finalQueryGlobal,pagination,id_sucursalFK_IdSucursal);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=FacturaDiarioConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=FacturaDiarioConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=facturadiarioLogic.getFacturaDiarios()==null||facturadiarioLogic.getFacturaDiarios().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=facturadiarios==null|| facturadiarios.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						facturadiariosAux=new ArrayList<FacturaDiario>();
						facturadiariosAux.addAll(facturadiarioLogic.getFacturaDiarios());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							facturadiariosAux=new ArrayList<FacturaDiario>();
							facturadiariosAux.addAll(facturadiarios);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							facturadiarioLogic.getFacturaDiariosFK_IdSucursal(finalQueryGlobal,pagination,id_sucursalFK_IdSucursal);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=FacturaDiarioConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=FacturaDiarioConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteFacturaDiarios("FK_IdSucursal",facturadiarioLogic.getFacturaDiarios());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteFacturaDiarios("FK_IdSucursal",facturadiarios);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						facturadiarioLogic.setFacturaDiarios(new ArrayList<FacturaDiario>());
						facturadiarioLogic.getFacturaDiarios().addAll(facturadiariosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							facturadiarios=new ArrayList<FacturaDiario>();
							facturadiarios.addAll(facturadiariosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdTipoIva")) {
				this.sDetalleReporte=FacturaDiarioConstantesFunciones.getDetalleIndiceFK_IdTipoIva(id_tipo_ivaFK_IdTipoIva);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					facturadiarioLogic.getFacturaDiariosFK_IdTipoIva(finalQueryGlobal,pagination,id_tipo_ivaFK_IdTipoIva);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=FacturaDiarioConstantesFunciones.getDetalleIndiceFK_IdTipoIva(id_tipo_ivaFK_IdTipoIva);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=FacturaDiarioConstantesFunciones.getDetalleIndiceFK_IdTipoIva(id_tipo_ivaFK_IdTipoIva);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=facturadiarioLogic.getFacturaDiarios()==null||facturadiarioLogic.getFacturaDiarios().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=facturadiarios==null|| facturadiarios.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						facturadiariosAux=new ArrayList<FacturaDiario>();
						facturadiariosAux.addAll(facturadiarioLogic.getFacturaDiarios());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							facturadiariosAux=new ArrayList<FacturaDiario>();
							facturadiariosAux.addAll(facturadiarios);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							facturadiarioLogic.getFacturaDiariosFK_IdTipoIva(finalQueryGlobal,pagination,id_tipo_ivaFK_IdTipoIva);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=FacturaDiarioConstantesFunciones.getDetalleIndiceFK_IdTipoIva(id_tipo_ivaFK_IdTipoIva);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=FacturaDiarioConstantesFunciones.getDetalleIndiceFK_IdTipoIva(id_tipo_ivaFK_IdTipoIva);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteFacturaDiarios("FK_IdTipoIva",facturadiarioLogic.getFacturaDiarios());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteFacturaDiarios("FK_IdTipoIva",facturadiarios);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						facturadiarioLogic.setFacturaDiarios(new ArrayList<FacturaDiario>());
						facturadiarioLogic.getFacturaDiarios().addAll(facturadiariosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							facturadiarios=new ArrayList<FacturaDiario>();
							facturadiarios.addAll(facturadiariosAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesFacturaDiario();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessFacturaDiario();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=facturadiarioLogic.getFacturaDiarios().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=facturadiarios.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=facturadiarioLogic.getFacturaDiarios().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=facturadiarios.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(FacturaDiario facturadiario) {
		Boolean permite=true;
		
		if(this.facturadiario.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=FacturaDiarioConstantesFunciones.getOrderByListaFacturaDiario();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=FacturaDiarioConstantesFunciones.getOrderByListaFacturaDiario();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(FacturaDiario facturadiario:facturadiarioLogic.getFacturaDiarios()) {
				if(facturadiario.getsType().equals(Constantes2.S_TOTALES)) {
					facturadiarioTotales=facturadiario;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(FacturaDiario facturadiario:this.facturadiarios) {
				if(facturadiario.getsType().equals(Constantes2.S_TOTALES)) {
					facturadiarioTotales=facturadiario;
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
			this.facturadiarioAux=new FacturaDiario();
			this.facturadiarioAux.setsType(Constantes2.S_TOTALES);
			this.facturadiarioAux.setIsNew(false);
			this.facturadiarioAux.setIsChanged(false);
			this.facturadiarioAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				FacturaDiarioConstantesFunciones.TotalizarValoresFilaFacturaDiario(this.facturadiarioLogic.getFacturaDiarios(),this.facturadiarioAux);
				
				this.facturadiarioLogic.getFacturaDiarios().add(this.facturadiarioAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				FacturaDiarioConstantesFunciones.TotalizarValoresFilaFacturaDiario(this.facturadiarios,this.facturadiarioAux);
				
				this.facturadiarios.add(this.facturadiarioAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		facturadiarioTotales=new FacturaDiario();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.facturadiarioLogic.getFacturaDiarios().remove(facturadiarioTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.facturadiarios.remove(facturadiarioTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		facturadiarioTotales=new FacturaDiario();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(FacturaDiario facturadiario:facturadiarioLogic.getFacturaDiarios()) {
				if(facturadiario.getsType().equals(Constantes2.S_TOTALES)) {
					facturadiarioTotales=facturadiario;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				FacturaDiarioConstantesFunciones.TotalizarValoresFilaFacturaDiario(this.facturadiarioLogic.getFacturaDiarios(),facturadiarioTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(FacturaDiario facturadiario:this.facturadiarios) {
				if(facturadiario.getsType().equals(Constantes2.S_TOTALES)) {
					facturadiarioTotales=facturadiario;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				FacturaDiarioConstantesFunciones.TotalizarValoresFilaFacturaDiario(this.facturadiarios,facturadiarioTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FacturaDiarioConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getFacturaDiariosFK_IdCliente()throws Exception {
		try {
			sAccionBusqueda="FK_IdCliente";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getFacturaDiariosFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getFacturaDiariosFK_IdPeriodoDeclara()throws Exception {
		try {
			sAccionBusqueda="FK_IdPeriodoDeclara";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getFacturaDiariosFK_IdSucursal()throws Exception {
		try {
			sAccionBusqueda="FK_IdSucursal";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getFacturaDiariosFK_IdTipoIva()throws Exception {
		try {
			sAccionBusqueda="FK_IdTipoIva";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getFacturaDiariosFK_IdCliente(String sFinalQuery,Long id_cliente)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					facturadiarioLogic.getFacturaDiariosFK_IdCliente(sFinalQuery,this.pagination,id_cliente);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getFacturaDiariosFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					facturadiarioLogic.getFacturaDiariosFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getFacturaDiariosFK_IdPeriodoDeclara(String sFinalQuery,Long id_periodo_declara)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					facturadiarioLogic.getFacturaDiariosFK_IdPeriodoDeclara(sFinalQuery,this.pagination,id_periodo_declara);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getFacturaDiariosFK_IdSucursal(String sFinalQuery,Long id_sucursal)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					facturadiarioLogic.getFacturaDiariosFK_IdSucursal(sFinalQuery,this.pagination,id_sucursal);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getFacturaDiariosFK_IdTipoIva(String sFinalQuery,Long id_tipo_iva)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					facturadiarioLogic.getFacturaDiariosFK_IdTipoIva(sFinalQuery,this.pagination,id_tipo_iva);
				
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
	
	public void inicializarPermisosFacturaDiario() {
		this.isPermisoTodoFacturaDiario=false;
		this.isPermisoNuevoFacturaDiario=false;
		this.isPermisoActualizarFacturaDiario=false;
		this.isPermisoActualizarOriginalFacturaDiario=false;
		this.isPermisoEliminarFacturaDiario=false;
		this.isPermisoGuardarCambiosFacturaDiario=false;
		this.isPermisoConsultaFacturaDiario=false;
		this.isPermisoBusquedaFacturaDiario=false;
		this.isPermisoReporteFacturaDiario=false;		
		this.isPermisoOrdenFacturaDiario=false;		
		this.isPermisoPaginacionMedioFacturaDiario=false;		
		this.isPermisoPaginacionAltoFacturaDiario=false;
		this.isPermisoPaginacionTodoFacturaDiario=false;
		this.isPermisoCopiarFacturaDiario=false;		
		this.isPermisoVerFormFacturaDiario=false;		
		this.isPermisoDuplicarFacturaDiario=false;		
		this.isPermisoOrdenFacturaDiario=false;		
	}
	
	public void setPermisosUsuarioFacturaDiario(Boolean isPermiso) {
		this.isPermisoTodoFacturaDiario=isPermiso;
		this.isPermisoNuevoFacturaDiario=isPermiso;
		this.isPermisoActualizarFacturaDiario=isPermiso;
		this.isPermisoActualizarOriginalFacturaDiario=isPermiso;
		this.isPermisoEliminarFacturaDiario=isPermiso;
		this.isPermisoGuardarCambiosFacturaDiario=isPermiso;
		this.isPermisoConsultaFacturaDiario=isPermiso;
		this.isPermisoBusquedaFacturaDiario=isPermiso;
		this.isPermisoReporteFacturaDiario=isPermiso;
		this.isPermisoOrdenFacturaDiario=isPermiso;		
		this.isPermisoPaginacionMedioFacturaDiario=isPermiso;		
		this.isPermisoPaginacionAltoFacturaDiario=isPermiso;		
		this.isPermisoPaginacionTodoFacturaDiario=isPermiso;		
		this.isPermisoCopiarFacturaDiario=isPermiso;		
		this.isPermisoVerFormFacturaDiario=isPermiso;		
		this.isPermisoDuplicarFacturaDiario=isPermiso;
		this.isPermisoOrdenFacturaDiario=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioFacturaDiario(Boolean isPermiso) {
		//this.isPermisoTodoFacturaDiario=isPermiso;
		this.isPermisoNuevoFacturaDiario=isPermiso;
		this.isPermisoActualizarFacturaDiario=isPermiso;
		this.isPermisoActualizarOriginalFacturaDiario=isPermiso;
		this.isPermisoEliminarFacturaDiario=isPermiso;
		this.isPermisoGuardarCambiosFacturaDiario=isPermiso;
		//this.isPermisoConsultaFacturaDiario=isPermiso;
		//this.isPermisoBusquedaFacturaDiario=isPermiso;
		//this.isPermisoReporteFacturaDiario=isPermiso;
		//this.isPermisoOrdenFacturaDiario=isPermiso;		
		//this.isPermisoPaginacionMedioFacturaDiario=isPermiso;		
		//this.isPermisoPaginacionAltoFacturaDiario=isPermiso;		
		//this.isPermisoPaginacionTodoFacturaDiario=isPermiso;		
		//this.isPermisoCopiarFacturaDiario=isPermiso;		
		//this.isPermisoDuplicarFacturaDiario=isPermiso;
		//this.isPermisoOrdenFacturaDiario=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioFacturaDiarioClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(FacturaDiarioJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebFacturaDiario(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioFacturaDiarioClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioFacturaDiarioClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionFacturaDiarioClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioFacturaDiarioClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioFacturaDiario() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(FacturaDiarioJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.facturadiarioSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, FacturaDiarioConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoFacturaDiario=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarFacturaDiario=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalFacturaDiario=this.isPermisoActualizarFacturaDiario;
			this.isPermisoEliminarFacturaDiario=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosFacturaDiario=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaFacturaDiario=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaFacturaDiario=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoFacturaDiario=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteFacturaDiario=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenFacturaDiario=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioFacturaDiario=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoFacturaDiario=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoFacturaDiario=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarFacturaDiario=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormFacturaDiario=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarFacturaDiario=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenFacturaDiario=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.facturadiarioSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosFacturaDiario.setToolTipText(this.jTableDatosFacturaDiario.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioFacturaDiario(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioFacturaDiario(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(FacturaDiarioJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(FacturaDiarioJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioFacturaDiario() throws Exception {
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
	public void inicializarCombosForeignKeyFacturaDiarioListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
				this.sucursalsForeignKey=new ArrayList();
				this.clientesForeignKey=new ArrayList();
				this.periododeclarasForeignKey=new ArrayList();
				this.tipoivasForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyFacturaDiarioListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(FacturaDiarioJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyFacturaDiarioListas(false);
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeySucursalListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyClienteListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyPeriodoDeclaraListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyTipoIvaListas(cargarCombosDependencia,sFinalQueryCombo);
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

	public void cargarCombosForeignKeyPeriodoDeclaraListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.periododeclarasForeignKey==null||this.periododeclarasForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=PeriodoDeclaraConstantesFunciones.getArrayColumnasGlobalesPeriodoDeclara(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,PeriodoDeclaraConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=PeriodoDeclaraConstantesFunciones.SFINALQUERY;

				this.cargarCombosPeriodoDeclarasForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyTipoIvaListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.tipoivasForeignKey==null||this.tipoivasForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=TipoIvaConstantesFunciones.getArrayColumnasGlobalesTipoIva(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TipoIvaConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=TipoIvaConstantesFunciones.SFINALQUERY;

				this.cargarCombosTipoIvasForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void cargarCombosLoteForeignKeyFacturaDiarioListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			FacturaDiarioParameterReturnGeneral facturadiarioReturnGeneral=new FacturaDiarioParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.facturadiarioConstantesFunciones.cargarid_empresaFacturaDiario)
					 || (this.esRecargarFks && this.facturadiarioConstantesFunciones.cargarid_empresaFacturaDiario)) {

					if(!this.facturadiarioSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+facturadiarioSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}


				String finalQueryGlobalSucursal="";

				if(((this.sucursalsForeignKey==null||this.sucursalsForeignKey.size()<=0) && this.facturadiarioConstantesFunciones.cargarid_sucursalFacturaDiario)
					 || (this.esRecargarFks && this.facturadiarioConstantesFunciones.cargarid_sucursalFacturaDiario)) {

					if(!this.facturadiarioSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=SucursalConstantesFunciones.getArrayColumnasGlobalesSucursal(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalSucursal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,SucursalConstantesFunciones.TABLENAME);

						finalQueryGlobalSucursal=Funciones.GetFinalQueryAppend(finalQueryGlobalSucursal, "");
						finalQueryGlobalSucursal+=SucursalConstantesFunciones.SFINALQUERY;

						//this.cargarCombosSucursalsForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalSucursal=" WHERE " + ConstantesSql.ID + "="+facturadiarioSessionBean.getlidSucursalActual();
					}
				} else {
					finalQueryGlobalSucursal="NONE";
				}


				String finalQueryGlobalCliente="";

				if(((this.clientesForeignKey==null||this.clientesForeignKey.size()<=0) && this.facturadiarioConstantesFunciones.cargarid_clienteFacturaDiario)
					 || (this.esRecargarFks && this.facturadiarioConstantesFunciones.cargarid_clienteFacturaDiario)) {

					if(!this.facturadiarioSessionBean.getisBusquedaDesdeForeignKeySesionCliente()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=ClienteConstantesFunciones.getArrayColumnasGlobalesCliente(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalCliente=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,ClienteConstantesFunciones.TABLENAME);

						finalQueryGlobalCliente=Funciones.GetFinalQueryAppend(finalQueryGlobalCliente, "");
						finalQueryGlobalCliente+=ClienteConstantesFunciones.SFINALQUERY;

						//this.cargarCombosClientesForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalCliente=" WHERE " + ConstantesSql.ID + "="+facturadiarioSessionBean.getlidClienteActual();
					}
				} else {
					finalQueryGlobalCliente="NONE";
				}


				String finalQueryGlobalPeriodoDeclara="";

				if(((this.periododeclarasForeignKey==null||this.periododeclarasForeignKey.size()<=0) && this.facturadiarioConstantesFunciones.cargarid_periodo_declaraFacturaDiario)
					 || (this.esRecargarFks && this.facturadiarioConstantesFunciones.cargarid_periodo_declaraFacturaDiario)) {

					if(!this.facturadiarioSessionBean.getisBusquedaDesdeForeignKeySesionPeriodoDeclara()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=PeriodoDeclaraConstantesFunciones.getArrayColumnasGlobalesPeriodoDeclara(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalPeriodoDeclara=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,PeriodoDeclaraConstantesFunciones.TABLENAME);

						finalQueryGlobalPeriodoDeclara=Funciones.GetFinalQueryAppend(finalQueryGlobalPeriodoDeclara, "");
						finalQueryGlobalPeriodoDeclara+=PeriodoDeclaraConstantesFunciones.SFINALQUERY;

						//this.cargarCombosPeriodoDeclarasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalPeriodoDeclara=" WHERE " + ConstantesSql.ID + "="+facturadiarioSessionBean.getlidPeriodoDeclaraActual();
					}
				} else {
					finalQueryGlobalPeriodoDeclara="NONE";
				}


				String finalQueryGlobalTipoIva="";

				if(((this.tipoivasForeignKey==null||this.tipoivasForeignKey.size()<=0) && this.facturadiarioConstantesFunciones.cargarid_tipo_ivaFacturaDiario)
					 || (this.esRecargarFks && this.facturadiarioConstantesFunciones.cargarid_tipo_ivaFacturaDiario)) {

					if(!this.facturadiarioSessionBean.getisBusquedaDesdeForeignKeySesionTipoIva()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=TipoIvaConstantesFunciones.getArrayColumnasGlobalesTipoIva(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalTipoIva=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TipoIvaConstantesFunciones.TABLENAME);

						finalQueryGlobalTipoIva=Funciones.GetFinalQueryAppend(finalQueryGlobalTipoIva, "");
						finalQueryGlobalTipoIva+=TipoIvaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosTipoIvasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalTipoIva=" WHERE " + ConstantesSql.ID + "="+facturadiarioSessionBean.getlidTipoIvaActual();
					}
				} else {
					finalQueryGlobalTipoIva="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				facturadiarioReturnGeneral=facturadiarioLogic.cargarCombosLoteForeignKeyFacturaDiario(finalQueryGlobalEmpresa,finalQueryGlobalSucursal,finalQueryGlobalCliente,finalQueryGlobalPeriodoDeclara,finalQueryGlobalTipoIva);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=facturadiarioReturnGeneral.getempresasForeignKey();
			}

			if(!finalQueryGlobalSucursal.equals("NONE")) {
				this.sucursalsForeignKey=facturadiarioReturnGeneral.getsucursalsForeignKey();
			}

			if(!finalQueryGlobalCliente.equals("NONE")) {
				this.clientesForeignKey=facturadiarioReturnGeneral.getclientesForeignKey();
			}

			if(!finalQueryGlobalPeriodoDeclara.equals("NONE")) {
				this.periododeclarasForeignKey=facturadiarioReturnGeneral.getperiododeclarasForeignKey();
			}

			if(!finalQueryGlobalTipoIva.equals("NONE")) {
				this.tipoivasForeignKey=facturadiarioReturnGeneral.gettipoivasForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyFacturaDiario()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeySucursal();
			this.addItemDefectoCombosForeignKeyCliente();
			this.addItemDefectoCombosForeignKeyPeriodoDeclara();
			this.addItemDefectoCombosForeignKeyTipoIva();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.facturadiarioSessionBean==null) {
				this.facturadiarioSessionBean=new FacturaDiarioSessionBean();
			}

			if(!this.facturadiarioSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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

			if(!this.facturadiarioSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
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

	public void addItemDefectoCombosForeignKeyCliente()throws Exception {
		try {

			if(!this.facturadiarioSessionBean.getisBusquedaDesdeForeignKeySesionCliente()) {
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

	public void addItemDefectoCombosForeignKeyPeriodoDeclara()throws Exception {
		try {

			if(!this.facturadiarioSessionBean.getisBusquedaDesdeForeignKeySesionPeriodoDeclara()) {
				PeriodoDeclara periododeclara=new PeriodoDeclara();
				PeriodoDeclaraConstantesFunciones.setPeriodoDeclaraDescripcion(periododeclara,Constantes.SMENSAJE_ESCOJA_OPCION);
				periododeclara.setId(null);

				if(!PeriodoDeclaraConstantesFunciones.ExisteEnLista(this.periododeclarasForeignKey,periododeclara,true)) {

					this.periododeclarasForeignKey.add(0,periododeclara);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyTipoIva()throws Exception {
		try {

			if(!this.facturadiarioSessionBean.getisBusquedaDesdeForeignKeySesionTipoIva()) {
				TipoIva tipoiva=new TipoIva();
				TipoIvaConstantesFunciones.setTipoIvaDescripcion(tipoiva,Constantes.SMENSAJE_ESCOJA_OPCION);
				tipoiva.setId(null);

				if(!TipoIvaConstantesFunciones.ExisteEnLista(this.tipoivasForeignKey,tipoiva,true)) {

					this.tipoivasForeignKey.add(0,tipoiva);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void initActionsCombosTodosForeignKeyFacturaDiario()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyFacturaDiario(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyFacturaDiario()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
				this.setActualSucursalForeignKey(this.parametroGeneralUsuario.getid_sucursal(),false,"Formulario");
			
			
				this.facturadiario.setfecha_emision(this.parametroGeneralUsuario.getfecha_sistema());
				this.facturadiario.setfecha_vencimiento(this.parametroGeneralUsuario.getfecha_sistema());
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyFacturaDiario();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyFacturaDiario(FacturaDiario facturadiario)throws Exception {	
		try {
			
			this.setActualClienteForeignKey(facturadiario.getid_cliente(),false,"Formulario");
			this.setActualPeriodoDeclaraForeignKey(facturadiario.getid_periodo_declara(),false,"Formulario");
			this.setActualTipoIvaForeignKey(facturadiario.getid_tipo_iva(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyFacturaDiario(FacturaDiario facturadiario,String sTipoEvento)throws Exception {	
		try {
			
			

				if(facturadiario.getCliente()!=null && !sTipoEvento.equals("id_clienteFacturaDiario")) { //sTipoEvento Evita Bucle Infinito

					this.clientesForeignKey=new ArrayList<Cliente>();
					this.clientesForeignKey.add(facturadiario.getCliente());

					this.addItemDefectoCombosForeignKeyCliente();
					this.cargarCombosFrameClientesForeignKey("Todos");
				}
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyFacturaDiario()throws Exception {	
		try {
			
			this.setActualClienteForeignKey(this.facturadiarioConstantesFunciones.getid_cliente(),false,"Formulario");
			this.setActualPeriodoDeclaraForeignKey(this.facturadiarioConstantesFunciones.getid_periodo_declara(),false,"Formulario");
			this.setActualTipoIvaForeignKey(this.facturadiarioConstantesFunciones.getid_tipo_iva(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyFacturaDiario()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyFacturaDiario()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyFacturaDiario()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroFacturaDiario()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyFacturaDiario()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameSucursalsForeignKey("Todos");
			this.cargarCombosFrameClientesForeignKey("Todos");
			this.cargarCombosFramePeriodoDeclarasForeignKey("Todos");
			this.cargarCombosFrameTipoIvasForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyFacturaDiario(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameSucursalsForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameClientesForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFramePeriodoDeclarasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameTipoIvasForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyFacturaDiario()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormFacturaDiario.jComboBoxid_empresaFacturaDiario!=null && this.jInternalFrameDetalleFormFacturaDiario.jComboBoxid_empresaFacturaDiario.getItemCount()>0) {
				this.jInternalFrameDetalleFormFacturaDiario.jComboBoxid_empresaFacturaDiario.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormFacturaDiario.jComboBoxid_sucursalFacturaDiario!=null && this.jInternalFrameDetalleFormFacturaDiario.jComboBoxid_sucursalFacturaDiario.getItemCount()>0) {
				this.jInternalFrameDetalleFormFacturaDiario.jComboBoxid_sucursalFacturaDiario.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormFacturaDiario.jComboBoxid_clienteFacturaDiario!=null && this.jInternalFrameDetalleFormFacturaDiario.jComboBoxid_clienteFacturaDiario.getItemCount()>0) {
				this.jInternalFrameDetalleFormFacturaDiario.jComboBoxid_clienteFacturaDiario.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormFacturaDiario.jComboBoxid_periodo_declaraFacturaDiario!=null && this.jInternalFrameDetalleFormFacturaDiario.jComboBoxid_periodo_declaraFacturaDiario.getItemCount()>0) {
				this.jInternalFrameDetalleFormFacturaDiario.jComboBoxid_periodo_declaraFacturaDiario.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormFacturaDiario.jComboBoxid_tipo_ivaFacturaDiario!=null && this.jInternalFrameDetalleFormFacturaDiario.jComboBoxid_tipo_ivaFacturaDiario.getItemCount()>0) {
				this.jInternalFrameDetalleFormFacturaDiario.jComboBoxid_tipo_ivaFacturaDiario.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	










	
	

	public FacturaDiarioBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public FacturaDiarioBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public FacturaDiarioBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.facturadiarioSessionBean=new FacturaDiarioSessionBean(); 
		this.facturadiarioConstantesFunciones=new FacturaDiarioConstantesFunciones(); 
		this.facturadiarioBean=new FacturaDiario();//(this.facturadiarioConstantesFunciones); 		
		this.facturadiarioReturnGeneral=new FacturaDiarioParameterReturnGeneral(); 
		
		this.facturadiarioSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.facturadiarioSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public FacturaDiarioBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public FacturaDiarioBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public FacturaDiarioBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessFacturaDiario(true);
			
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
			
			this.facturadiarioConstantesFunciones=new FacturaDiarioConstantesFunciones(); 
			this.facturadiarioBean=new FacturaDiario();//this.facturadiarioConstantesFunciones); 			
			this.facturadiarioReturnGeneral=new FacturaDiarioParameterReturnGeneral(); 
		
			FacturaDiarioBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Factura Diario Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			this.conTotales=true;
			
			
			this.facturadiario=new FacturaDiario();
			this.facturadiarios = new ArrayList<FacturaDiario>();
			this.facturadiariosAux = new ArrayList<FacturaDiario>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturadiarioLogic=new FacturaDiarioLogic();
				this.facturadiarioLogic.getNewConnexionToDeep("");
			}
			
			//this.facturadiarioSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.facturadiarioSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormFacturaDiario);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoFacturaDiario!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoFacturaDiario);	
					}
					
					if(this.jInternalFrameImportacionFacturaDiario!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionFacturaDiario);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByFacturaDiario!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByFacturaDiario);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormFacturaDiario!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormFacturaDiario);
				this.jInternalFrameDetalleFormFacturaDiario.setVisible(false);
				this.jInternalFrameDetalleFormFacturaDiario.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoFacturaDiario!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoFacturaDiario);
					this.jInternalFrameReporteDinamicoFacturaDiario.setVisible(false);
					this.jInternalFrameReporteDinamicoFacturaDiario.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionFacturaDiario!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionFacturaDiario);
					this.jInternalFrameImportacionFacturaDiario.setVisible(false);
					this.jInternalFrameImportacionFacturaDiario.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByFacturaDiario!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByFacturaDiario);
					this.jInternalFrameOrderByFacturaDiario.setVisible(false);
					this.jInternalFrameOrderByFacturaDiario.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idFacturaDiarioActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=FacturaDiarioConstantesFunciones.INUMEROPAGINACION;
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
			
			this.facturadiarioReturnGeneral=new FacturaDiarioParameterReturnGeneral();
			
			this.facturadiarioParameterGeneral=new FacturaDiarioParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.facturadiarioLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.facturadiarioSessionBean.getEsGuardarRelacionado()) {
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
			
			if(FacturaDiarioJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.facturadiarioSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,FacturaDiarioConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.facturadiarioSessionBean.getEsGuardarRelacionado(),this.facturadiarioSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,FacturaDiarioConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.facturadiarioSessionBean.getEsGuardarRelacionado(),this.facturadiarioSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoFacturaDiario=false;
			this.isVisibilidadCeldaDuplicarFacturaDiario=true;
			this.isVisibilidadCeldaCopiarFacturaDiario=true;
			this.isVisibilidadCeldaVerFormFacturaDiario=true;
			this.isVisibilidadCeldaOrdenFacturaDiario=true;
			this.isVisibilidadCeldaNuevoRelacionesFacturaDiario=false;
			this.isVisibilidadCeldaModificarFacturaDiario=false;
			this.isVisibilidadCeldaActualizarFacturaDiario=false;
			this.isVisibilidadCeldaEliminarFacturaDiario=false;
			this.isVisibilidadCeldaCancelarFacturaDiario=false;
			this.isVisibilidadCeldaGuardarFacturaDiario=false;
			this.isVisibilidadCeldaGuardarCambiosFacturaDiario=false;
			
			
			this.isVisibilidadFK_IdCliente=true;
			this.isVisibilidadFK_IdEmpresa=true;
			this.isVisibilidadFK_IdPeriodoDeclara=true;
			this.isVisibilidadFK_IdSucursal=true;
			this.isVisibilidadFK_IdTipoIva=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesFacturaDiario("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosFacturaDiario();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioFacturaDiario(false);
			
			this.setPermisosUsuarioFacturaDiario();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.facturadiarioSessionBean.getEsGuardarRelacionado() 
				|| (this.facturadiarioSessionBean.getEsGuardarRelacionado() && this.facturadiarioSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioFacturaDiarioClasesRelacionadas();
			}
			
			if(this.facturadiarioSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioFacturaDiarioClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!FacturaDiarioJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosFacturaDiario();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualFacturaDiario();
			}
			
			if(!this.isPermisoBusquedaFacturaDiario) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasFacturaDiario.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.facturadiarioSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(true);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(true);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioFacturaDiario,this.isPermisoPaginacionMedioFacturaDiario,this.isPermisoPaginacionTodoFacturaDiario);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(FacturaDiarioConstantesFunciones.getTiposSeleccionarFacturaDiario());
				
				this.tiposColumnasSelect=FacturaDiarioConstantesFunciones.getTiposSeleccionarFacturaDiario(true);
				
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
			//if(!this.facturadiarioSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioFacturaDiario();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(true,false,true);
				this.setAccionesUsuarioFacturaDiario(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(true,false,true);							
				this.setAccionesUsuarioFacturaDiario(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesFacturaDiario() ;
			
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
			this.clienteLogic=new ClienteLogic();
			this.periododeclaraLogic=new PeriodoDeclaraLogic();
			this.tipoivaLogic=new TipoIvaLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				facturadiarioImplementable= (FacturaDiarioImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+FacturaDiarioConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				facturadiarioImplementableHome= (FacturaDiarioImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+FacturaDiarioConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.facturadiarios= new ArrayList<FacturaDiario>();
			this.facturadiariosEliminados= new ArrayList<FacturaDiario>();
						
			this.isEsNuevoFacturaDiario=false;
			this.esParaAccionDesdeFormularioFacturaDiario=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			//BUSQUEDA INTERNA FK
			this.idClienteActual=0L;
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			this.sucursalsForeignKey=new ArrayList<Sucursal>() ;
			this.clientesForeignKey=new ArrayList<Cliente>() ;
			this.periododeclarasForeignKey=new ArrayList<PeriodoDeclara>() ;
			this.tipoivasForeignKey=new ArrayList<TipoIva>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyFacturaDiario(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroFacturaDiario();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.facturadiarioSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			FacturaDiarioBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=FacturaDiarioConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesFacturaDiario("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingFacturaDiario(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormFacturaDiario!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioFacturaDiario();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioFacturaDiario();
			}
			
			FacturaDiarioBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasFacturaDiario.getTabCount(); i++) {
					this.jTabbedPaneBusquedasFacturaDiario.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasFacturaDiario.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturadiarioLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessFacturaDiario(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga FacturaDiario: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturadiarioLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,FacturaDiarioConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturadiarioLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectFacturaDiario() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesFacturaDiario")) {
				iIndex=this.jInternalFrameDetalleFormFacturaDiario.jTabbedPaneRelacionesFacturaDiario.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormFacturaDiario.jTabbedPaneRelacionesFacturaDiario.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosFacturaDiario.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessFacturaDiario();	
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
	
	public void cargarCombosForeignKeyFacturaDiario(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyFacturaDiario(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyFacturaDiario(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyFacturaDiarioListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyFacturaDiario();
		
		this.cargarCombosFrameForeignKeyFacturaDiario();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyFacturaDiario();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyFacturaDiario();
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

	public void cargarCombosForeignKeyPeriodoDeclara(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyPeriodoDeclaraListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyPeriodoDeclara();
				this.cargarCombosFramePeriodoDeclarasForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaPeriodoDeclara(this.periododeclarasForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyTipoIva(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyTipoIvaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyTipoIva();
				this.cargarCombosFrameTipoIvasForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaTipoIva(this.tipoivasForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void jButtonNuevoFacturaDiarioActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.facturadiarioSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormFacturaDiario==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			FacturaDiarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.facturadiario,new Object(),this.facturadiarioParameterGeneral,this.facturadiarioReturnGeneral);
			
			
			if(jTableDatosFacturaDiario.getRowCount()>=1) {
				jTableDatosFacturaDiario.removeRowSelectionInterval(0, jTableDatosFacturaDiario.getRowCount()-1);						
			}
			
			this.isEsNuevoFacturaDiario=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoFacturaDiario(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesFacturaDiario(true);			
			//this.facturadiario=new FacturaDiario();
			//this.facturadiario.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesFacturaDiario(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualFacturaDiario() ;
			
			if(FacturaDiarioJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleFacturaDiario(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.facturadiario);	
			this.actualizarInformacion("INFO_PADRE",false,this.facturadiario);				
			
			FacturaDiarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.facturadiario,new Object(),this.facturadiarioParameterGeneral,this.facturadiarioReturnGeneral);
			
			if(this.facturadiarioSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar FacturaDiario: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			FacturaDiarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.facturadiario,new Object(),this.facturadiarioParameterGeneral,this.facturadiarioReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,FacturaDiarioConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarFacturaDiarioActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<FacturaDiario> facturadiariosSeleccionados=new ArrayList<FacturaDiario>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosFacturaDiario.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosFacturaDiario.getSelectedRows().length;			
			}
			
			facturadiariosSeleccionados=this.getFacturaDiariosSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoFacturaDiario--;			
				//FacturaDiario facturadiarioAux= new FacturaDiario();			
				//facturadiarioAux.setId(this.iIdNuevoFacturaDiario);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//FacturaDiario facturadiarioOrigen=new FacturaDiario();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(FacturaDiario facturadiarioOrigen : facturadiariosSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosFacturaDiario.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							facturadiarioOrigen =(FacturaDiario) this.facturadiarioLogic.getFacturaDiarios().toArray()[this.jTableDatosFacturaDiario.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							facturadiarioOrigen =(FacturaDiario) this.facturadiarios.toArray()[this.jTableDatosFacturaDiario.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaFacturaDiario();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.facturadiario.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosFacturaDiario(facturadiarioOrigen,this.facturadiario,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysFacturaDiario(this.facturadiario);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.facturadiarioLogic.getFacturaDiarios().add(this.facturadiarioAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.facturadiarios.add(this.facturadiarioAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaFacturaDiario(false);
				
				this.jTableDatosFacturaDiario.setRowSelectionInterval(this.getIndiceNuevoFacturaDiario(), this.getIndiceNuevoFacturaDiario());
				
				int iLastRow =  this.jTableDatosFacturaDiario.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosFacturaDiario.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosFacturaDiario.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaFacturaDiario(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,FacturaDiarioConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarFacturaDiarioActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<FacturaDiario> facturadiariosSeleccionados=new ArrayList<FacturaDiario>();									
		
			FacturaDiario facturadiarioOrigen=new FacturaDiario();
			FacturaDiario facturadiarioDestino=new FacturaDiario();
				
			facturadiariosSeleccionados=this.getFacturaDiariosSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosFacturaDiario.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || facturadiariosSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosFacturaDiario.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						facturadiarioOrigen =(FacturaDiario) this.facturadiarioLogic.getFacturaDiarios().toArray()[this.jTableDatosFacturaDiario.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						facturadiarioOrigen =(FacturaDiario) this.facturadiarios.toArray()[this.jTableDatosFacturaDiario.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						facturadiarioDestino =(FacturaDiario) this.facturadiarioLogic.getFacturaDiarios().toArray()[this.jTableDatosFacturaDiario.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						facturadiarioDestino =(FacturaDiario) this.facturadiarios.toArray()[this.jTableDatosFacturaDiario.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				facturadiarioOrigen =facturadiariosSeleccionados.get(0);
				facturadiarioDestino =facturadiariosSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosFacturaDiario(facturadiarioOrigen,facturadiarioDestino,true,false);
				
				facturadiarioDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(facturadiarioDestino,facturadiarioLogic.getFacturaDiarios());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(facturadiarioDestino,facturadiarios);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaFacturaDiario(false);
				
				//this.jTableDatosFacturaDiario.setRowSelectionInterval(this.getIndiceNuevoFacturaDiario(), this.getIndiceNuevoFacturaDiario());
				
				int iLastRow =  this.jTableDatosFacturaDiario.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosFacturaDiario.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosFacturaDiario.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaFacturaDiario(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FacturaDiarioConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormFacturaDiarioActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormFacturaDiario==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormFacturaDiario.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FacturaDiarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarFacturaDiarioActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesFacturaDiario.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasFacturaDiario.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesFacturaDiario.setVisible(!isVisible);
			this.jPanelPaginacionFacturaDiario.setVisible(!isVisible);
			this.jPanelAccionesFacturaDiario.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FacturaDiarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarFacturaDiarioActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameFacturaDiario();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FacturaDiarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoFacturaDiarioActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoFacturaDiario();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FacturaDiarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionFacturaDiarioActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionFacturaDiario();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FacturaDiarioConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByFacturaDiarioActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByFacturaDiario();
			
			this.abrirFrameOrderByFacturaDiario();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FacturaDiarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByFacturaDiarioActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByFacturaDiario();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FacturaDiarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleFacturaDiario(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormFacturaDiario);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormFacturaDiario.isMaximum()) {
					this.jInternalFrameDetalleFormFacturaDiario.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormFacturaDiario.setSize(this.jInternalFrameDetalleFormFacturaDiario.iWidthFormulario,this.jInternalFrameDetalleFormFacturaDiario.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormFacturaDiario.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormFacturaDiario.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormFacturaDiario.isMaximum()) {
						this.jInternalFrameDetalleFormFacturaDiario.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormFacturaDiario.jContentPaneDetalleFacturaDiario.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormFacturaDiario.jTabbedPaneRelacionesFacturaDiario.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormFacturaDiario.jContentPaneDetalleFacturaDiario.getWidth(),FacturaDiarioConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormFacturaDiario.jTabbedPaneRelacionesFacturaDiario.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormFacturaDiario.jContentPaneDetalleFacturaDiario.getWidth(),FacturaDiarioConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormFacturaDiario.jTabbedPaneRelacionesFacturaDiario.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormFacturaDiario.jContentPaneDetalleFacturaDiario.getWidth(),FacturaDiarioConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormFacturaDiario.setVisible(true);
	        this.jInternalFrameDetalleFormFacturaDiario.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,FacturaDiarioConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByFacturaDiario() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByFacturaDiario==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByFacturaDiario=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByFacturaDiario,false,this);
				} else {
					this.jInternalFrameOrderByFacturaDiario=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByFacturaDiario,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByFacturaDiario);
				this.jInternalFrameOrderByFacturaDiario.setVisible(false);
				this.jInternalFrameOrderByFacturaDiario.setSelected(false);
				
				this.jInternalFrameOrderByFacturaDiario.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByFacturaDiario"));
				
				this.inicializarActualizarBindingTablaOrderByFacturaDiario();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionFacturaDiario() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionFacturaDiario==null) {
				
				this.jInternalFrameImportacionFacturaDiario=new ImportacionJInternalFrame(FacturaDiarioConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionFacturaDiario);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionFacturaDiario);
				this.jInternalFrameImportacionFacturaDiario.setVisible(false);
				this.jInternalFrameImportacionFacturaDiario.setSelected(false);


				this.jInternalFrameImportacionFacturaDiario.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionFacturaDiario"));
				this.jInternalFrameImportacionFacturaDiario.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionFacturaDiario"));
				this.jInternalFrameImportacionFacturaDiario.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionFacturaDiario"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoFacturaDiario() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoFacturaDiario==null) {
				this.jInternalFrameReporteDinamicoFacturaDiario=new ReporteDinamicoJInternalFrame(FacturaDiarioConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoFacturaDiario);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoFacturaDiario);
				this.jInternalFrameReporteDinamicoFacturaDiario.setVisible(false);
				this.jInternalFrameReporteDinamicoFacturaDiario.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoFacturaDiario.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoFacturaDiario"));
				this.jInternalFrameReporteDinamicoFacturaDiario.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoFacturaDiario"));
				this.jInternalFrameReporteDinamicoFacturaDiario.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoFacturaDiario"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualFacturaDiario();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleFacturaDiario() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormFacturaDiario);
			
	       	this.jInternalFrameDetalleFormFacturaDiario.setVisible(false);
	        this.jInternalFrameDetalleFormFacturaDiario.setSelected(false);
			
			//this.jInternalFrameDetalleFormFacturaDiario.dispose();
			//this.jInternalFrameDetalleFormFacturaDiario=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,FacturaDiarioConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoFacturaDiario() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoFacturaDiario.setVisible(true);
	        this.jInternalFrameReporteDinamicoFacturaDiario.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,FacturaDiarioConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionFacturaDiario() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionFacturaDiario.setVisible(true);
	        this.jInternalFrameImportacionFacturaDiario.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,FacturaDiarioConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByFacturaDiario() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByFacturaDiario.setVisible(true);
	        this.jInternalFrameOrderByFacturaDiario.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,FacturaDiarioConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByFacturaDiario() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByFacturaDiario.setVisible(false);
	        this.jInternalFrameOrderByFacturaDiario.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,FacturaDiarioConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoFacturaDiario() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoFacturaDiario.setVisible(false);
	        this.jInternalFrameReporteDinamicoFacturaDiario.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,FacturaDiarioConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionFacturaDiario() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionFacturaDiario.setVisible(false);
	        this.jInternalFrameImportacionFacturaDiario.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,FacturaDiarioConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarFacturaDiarioActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarFacturaDiario(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FacturaDiarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarFacturaDiario(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosFacturaDiario.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesFacturaDiario(true);
			//this.isEsNuevoFacturaDiario=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturadiario =(FacturaDiario) this.facturadiarioLogic.getFacturaDiarios().toArray()[this.jTableDatosFacturaDiario.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.facturadiario =(FacturaDiario) this.facturadiarios.toArray()[this.jTableDatosFacturaDiario.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesFacturaDiario("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesFacturaDiario(false) ;
			
			if(facturadiarioSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(FacturaDiarioJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleFacturaDiario(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualFacturaDiario(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FacturaDiarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaFacturaDiarioActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosFacturaDiario.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturadiario =(FacturaDiario) this.facturadiarioLogic.getFacturaDiarios().toArray()[this.jTableDatosFacturaDiario.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.facturadiario =(FacturaDiario) this.facturadiarios.toArray()[this.jTableDatosFacturaDiario.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FacturaDiarioConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarFacturaDiario(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormFacturaDiario==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosFacturaDiario.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesFacturaDiario(true);
			//this.isEsNuevoFacturaDiario=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturadiario =(FacturaDiario) this.facturadiarioLogic.getFacturaDiarios().toArray()[this.jTableDatosFacturaDiario.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.facturadiario =(FacturaDiario) this.facturadiarios.toArray()[this.jTableDatosFacturaDiario.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.facturadiario.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesFacturaDiario("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesFacturaDiario(false) ;
			
			if(FacturaDiarioJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleFacturaDiario(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualFacturaDiario(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FacturaDiarioConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
			
			if(sType.equals("Cliente")) {
				if(!this.facturadiarioConstantesFunciones.cargarid_clienteFacturaDiario) {
					this.cargarCombosClientesForeignKeyLista(" where id="+id);
					//this.inicializarActualizarBindingFacturaDiario(false,false);
					this.cargarCombosFrameClientesForeignKey("Todos");
				}

				this.setCombosCodigoDesdeBusquedaid_cliente (id);

				this.recargarComboTablaCliente(this.clientesForeignKey);

			}
		} catch(Exception e) {
			throw e;
		}
	}
	
			
	
	public void recargarComboTablaCliente(List<Cliente> clientesForeignKey)throws Exception{
		TableColumn tableColumnCliente=this.jTableDatosFacturaDiario.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosFacturaDiario,FacturaDiarioConstantesFunciones.LABEL_IDCLIENTE));
		TableCellEditor tableCellEditorCliente =tableColumnCliente.getCellEditor();

		ClienteTableCell clienteTableCellFk=(ClienteTableCell)tableCellEditorCliente;

		if(clienteTableCellFk!=null) {
			clienteTableCellFk.setclientesForeignKey(clientesForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosFacturaDiario.getSelectedRow();

		//if(intSelectedRow<=0) {
			//clienteTableCellFk.setRowActual(intSelectedRow);
			//clienteTableCellFk.setclientesForeignKeyActual(clientesForeignKey);
		//}


		if(clienteTableCellFk!=null) {
			clienteTableCellFk.RecargarClientesForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaPeriodoDeclara(List<PeriodoDeclara> periododeclarasForeignKey)throws Exception{
		TableColumn tableColumnPeriodoDeclara=this.jTableDatosFacturaDiario.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosFacturaDiario,FacturaDiarioConstantesFunciones.LABEL_IDPERIODODECLARA));
		TableCellEditor tableCellEditorPeriodoDeclara =tableColumnPeriodoDeclara.getCellEditor();

		PeriodoDeclaraTableCell periododeclaraTableCellFk=(PeriodoDeclaraTableCell)tableCellEditorPeriodoDeclara;

		if(periododeclaraTableCellFk!=null) {
			periododeclaraTableCellFk.setperiododeclarasForeignKey(periododeclarasForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosFacturaDiario.getSelectedRow();

		//if(intSelectedRow<=0) {
			//periododeclaraTableCellFk.setRowActual(intSelectedRow);
			//periododeclaraTableCellFk.setperiododeclarasForeignKeyActual(periododeclarasForeignKey);
		//}


		if(periododeclaraTableCellFk!=null) {
			periododeclaraTableCellFk.RecargarPeriodoDeclarasForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaTipoIva(List<TipoIva> tipoivasForeignKey)throws Exception{
		TableColumn tableColumnTipoIva=this.jTableDatosFacturaDiario.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosFacturaDiario,FacturaDiarioConstantesFunciones.LABEL_IDTIPOIVA));
		TableCellEditor tableCellEditorTipoIva =tableColumnTipoIva.getCellEditor();

		TipoIvaTableCell tipoivaTableCellFk=(TipoIvaTableCell)tableCellEditorTipoIva;

		if(tipoivaTableCellFk!=null) {
			tipoivaTableCellFk.settipoivasForeignKey(tipoivasForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosFacturaDiario.getSelectedRow();

		//if(intSelectedRow<=0) {
			//tipoivaTableCellFk.setRowActual(intSelectedRow);
			//tipoivaTableCellFk.settipoivasForeignKeyActual(tipoivasForeignKey);
		//}


		if(tipoivaTableCellFk!=null) {
			tipoivaTableCellFk.RecargarTipoIvasForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	

	public void setCombosCodigoDesdeBusquedaid_cliente (Long id) throws Exception {
		this.setActualClienteForeignKey(id,true,"Todos");

	};
	
	public void jButtonActualizarFacturaDiarioActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturadiarioLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesFacturaDiario(false);
			
			//if(!this.isEsNuevoFacturaDiario) {								
				int intSelectedRow = this.jTableDatosFacturaDiario.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturadiario =(FacturaDiario) this.facturadiarioLogic.getFacturaDiarios().toArray()[this.jTableDatosFacturaDiario.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.facturadiario =(FacturaDiario) this.facturadiarios.toArray()[this.jTableDatosFacturaDiario.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(FacturaDiarioJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualFacturaDiario(this.facturadiario,true);
				this.setVariablesFormularioToObjetoActualForeignKeysFacturaDiario(this.facturadiario);
				
			}
			
			if(this.permiteMantenimiento(this.facturadiario)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.facturadiarioSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoFacturaDiario=true;
					this.inicializarActualizarBindingTablaFacturaDiario(false);
					this.isEsNuevoFacturaDiario=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoFacturaDiario=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoFacturaDiario=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesFacturaDiario(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualFacturaDiario(false);
				
				this.habilitarDeshabilitarControlesFacturaDiario(false);
			
												
				
				if(FacturaDiarioJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleFacturaDiario();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoFacturaDiarioActionPerformed(evt,facturadiarioSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualFacturaDiario(this.facturadiario,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosFacturaDiario.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,facturadiarioSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturadiarioLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.facturadiario.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(FacturaDiario.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",FacturaDiario.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturadiarioLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,FacturaDiarioConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturadiarioLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarFacturaDiarioActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturadiarioLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosFacturaDiario.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturadiario =(FacturaDiario) this.facturadiarioLogic.getFacturaDiarios().toArray()[this.jTableDatosFacturaDiario.convertRowIndexToModel(intSelectedRow)];
				this.facturadiario.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.facturadiario =(FacturaDiario) this.facturadiarios.toArray()[this.jTableDatosFacturaDiario.convertRowIndexToModel(intSelectedRow)];
				this.facturadiario.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.facturadiario)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.facturadiarioSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((FacturaDiarioModel) this.jTableDatosFacturaDiario.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoFacturaDiario=true;
				this.inicializarActualizarBindingTablaFacturaDiario(false);
				this.isEsNuevoFacturaDiario=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesFacturaDiario(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualFacturaDiario(false);
				
				this.habilitarDeshabilitarControlesFacturaDiario(false);
				
				
				
				if(FacturaDiarioJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleFacturaDiario();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturadiarioLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturadiarioLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,FacturaDiarioConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturadiarioLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarFacturaDiarioActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosFacturaDiario.getRowCount()>=1) {
				jTableDatosFacturaDiario.removeRowSelectionInterval(0, jTableDatosFacturaDiario.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesFacturaDiario(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaFacturaDiario(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesFacturaDiario(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualFacturaDiario(false) ;
			
			this.isEsNuevoFacturaDiario=false;
			
			if(FacturaDiarioJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleFacturaDiario();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FacturaDiarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosFacturaDiarioActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturadiarioLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingFacturaDiario(false);
				
				//SI ES MANUAL
				if(FacturaDiarioJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualFacturaDiario();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturadiarioLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturadiarioLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,FacturaDiarioConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturadiarioLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosFacturaDiarioActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoFacturaDiario--;			
			//FacturaDiario facturadiarioAux= new FacturaDiario();			
			//facturadiarioAux.setId(this.iIdNuevoFacturaDiario);
			
			if(this.jInternalFrameDetalleFormFacturaDiario==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaFacturaDiario();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysFacturaDiario(this.facturadiario);
			
			this.facturadiario.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.facturadiarioLogic.getFacturaDiarios().add(this.facturadiarioAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.facturadiarios.add(this.facturadiarioAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaFacturaDiario(false);
			
			this.jTableDatosFacturaDiario.setRowSelectionInterval(this.getIndiceNuevoFacturaDiario(), this.getIndiceNuevoFacturaDiario());
			
			int iLastRow =  this.jTableDatosFacturaDiario.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosFacturaDiario.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosFacturaDiario.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaFacturaDiario(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,FacturaDiarioConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionFacturaDiarioActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturadiarioLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingFacturaDiario(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingFacturaDiario(false);
			
			//SI ES MANUAL
			if(FacturaDiarioJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualFacturaDiario();
			}
			
			//this.abrirFrameTreeFacturaDiario();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturadiarioLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturadiarioLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,FacturaDiarioConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturadiarioLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionFacturaDiarioActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Factura DiarioS ?", "MANTENIMIENTO DE Factura Diario", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionFacturaDiario.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralFacturaDiario();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.facturadiarioReturnGeneral=facturadiarioLogic.procesarImportacionFacturaDiariosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.facturadiarioParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarFacturaDiarioReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FacturaDiarioConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionFacturaDiarioActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionFacturaDiario.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionFacturaDiario.setFileImportacion(this.jInternalFrameImportacionFacturaDiario.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionFacturaDiario.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionFacturaDiario.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionFacturaDiario.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionFacturaDiario.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FacturaDiarioConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoFacturaDiarioActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<FacturaDiario> facturadiariosSeleccionados=new ArrayList<FacturaDiario>();		

		facturadiariosSeleccionados=this.getFacturaDiariosSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoFacturaDiario.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoFacturaDiario.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("FacturaDiarioBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"FacturaDiarioBaseDesign.jrxml";
			
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
			
			this.generarReporteFacturaDiarios("Todos",facturadiariosSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.facturadiarioSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Factura Diario",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FacturaDiarioConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoFacturaDiario.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoFacturaDiario.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case FacturaDiarioConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case FacturaDiarioConstantesFunciones.LABEL_IDSUCURSAL:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Sucursal_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Sucursal_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Sucursal_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Sucursal_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case FacturaDiarioConstantesFunciones.LABEL_IDCLIENTE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Cliente_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Cliente_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Cliente_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Cliente_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case FacturaDiarioConstantesFunciones.LABEL_IDPERIODODECLARA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_PeriodoDeclara_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_PeriodoDeclara_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_PeriodoDeclara_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_PeriodoDeclara_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case FacturaDiarioConstantesFunciones.LABEL_IDTIPOIVA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_TipoIva_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_TipoIva_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_TipoIva_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_TipoIva_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case FacturaDiarioConstantesFunciones.LABEL_FECHAEMISION:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_chaEmision_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_chaEmision_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_chaEmision_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_chaEmision_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case FacturaDiarioConstantesFunciones.LABEL_FECHAVENCIMIENTO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_chaVencimiento_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_chaVencimiento_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_chaVencimiento_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_chaVencimiento_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case FacturaDiarioConstantesFunciones.LABEL_NUMEROSERIE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_meroSerie_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_meroSerie_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_meroSerie_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_meroSerie_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case FacturaDiarioConstantesFunciones.LABEL_RUC:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_c_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_c_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_c_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_c_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case FacturaDiarioConstantesFunciones.LABEL_NUMEROAUTORIZA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_meroAutoriza_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_meroAutoriza_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_meroAutoriza_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_meroAutoriza_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case FacturaDiarioConstantesFunciones.LABEL_ESDEVOLUCION:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Devolucion_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Devolucion_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Devolucion_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Devolucion_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case FacturaDiarioConstantesFunciones.LABEL_VALORFACTURA:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_lorFactura_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_lorFactura_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_lorFactura_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_lorFactura_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case FacturaDiarioConstantesFunciones.LABEL_BASEIMPONIBLE:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_seImponible_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_seImponible_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_seImponible_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_seImponible_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case FacturaDiarioConstantesFunciones.LABEL_MONTOIVA:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_ntoIva_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_ntoIva_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_ntoIva_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_ntoIva_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case FacturaDiarioConstantesFunciones.LABEL_BIMTARJETA:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mTarjeta_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mTarjeta_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mTarjeta_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mTarjeta_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoFacturaDiario.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoFacturaDiario.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoFacturaDiario.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case FacturaDiarioConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case FacturaDiarioConstantesFunciones.LABEL_IDSUCURSAL:
					sNombreCampoCategoria="id_sucursal";
					break;

				case FacturaDiarioConstantesFunciones.LABEL_IDCLIENTE:
					sNombreCampoCategoria="id_cliente";
					break;

				case FacturaDiarioConstantesFunciones.LABEL_IDPERIODODECLARA:
					sNombreCampoCategoria="id_periodo_declara";
					break;

				case FacturaDiarioConstantesFunciones.LABEL_IDTIPOIVA:
					sNombreCampoCategoria="id_tipo_iva";
					break;

				case FacturaDiarioConstantesFunciones.LABEL_FECHAEMISION:
					sNombreCampoCategoria="fecha_emision";
					break;

				case FacturaDiarioConstantesFunciones.LABEL_FECHAVENCIMIENTO:
					sNombreCampoCategoria="fecha_vencimiento";
					break;

				case FacturaDiarioConstantesFunciones.LABEL_NUMEROSERIE:
					sNombreCampoCategoria="numero_serie";
					break;

				case FacturaDiarioConstantesFunciones.LABEL_RUC:
					sNombreCampoCategoria="ruc";
					break;

				case FacturaDiarioConstantesFunciones.LABEL_NUMEROAUTORIZA:
					sNombreCampoCategoria="numero_autoriza";
					break;

				case FacturaDiarioConstantesFunciones.LABEL_ESDEVOLUCION:
					sNombreCampoCategoria="es_devolucion";
					break;

				case FacturaDiarioConstantesFunciones.LABEL_VALORFACTURA:
					sNombreCampoCategoria="valor_factura";
					break;

				case FacturaDiarioConstantesFunciones.LABEL_BASEIMPONIBLE:
					sNombreCampoCategoria="base_imponible";
					break;

				case FacturaDiarioConstantesFunciones.LABEL_MONTOIVA:
					sNombreCampoCategoria="monto_iva";
					break;

				case FacturaDiarioConstantesFunciones.LABEL_BIMTARJETA:
					sNombreCampoCategoria="bim_tarjeta";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoFacturaDiario.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case FacturaDiarioConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case FacturaDiarioConstantesFunciones.LABEL_IDSUCURSAL:
					sNombreCampoCategoriaValor="id_sucursal";
					break;

				case FacturaDiarioConstantesFunciones.LABEL_IDCLIENTE:
					sNombreCampoCategoriaValor="id_cliente";
					break;

				case FacturaDiarioConstantesFunciones.LABEL_IDPERIODODECLARA:
					sNombreCampoCategoriaValor="id_periodo_declara";
					break;

				case FacturaDiarioConstantesFunciones.LABEL_IDTIPOIVA:
					sNombreCampoCategoriaValor="id_tipo_iva";
					break;

				case FacturaDiarioConstantesFunciones.LABEL_FECHAEMISION:
					sNombreCampoCategoriaValor="fecha_emision";
					break;

				case FacturaDiarioConstantesFunciones.LABEL_FECHAVENCIMIENTO:
					sNombreCampoCategoriaValor="fecha_vencimiento";
					break;

				case FacturaDiarioConstantesFunciones.LABEL_NUMEROSERIE:
					sNombreCampoCategoriaValor="numero_serie";
					break;

				case FacturaDiarioConstantesFunciones.LABEL_RUC:
					sNombreCampoCategoriaValor="ruc";
					break;

				case FacturaDiarioConstantesFunciones.LABEL_NUMEROAUTORIZA:
					sNombreCampoCategoriaValor="numero_autoriza";
					break;

				case FacturaDiarioConstantesFunciones.LABEL_ESDEVOLUCION:
					sNombreCampoCategoriaValor="es_devolucion";
					break;

				case FacturaDiarioConstantesFunciones.LABEL_VALORFACTURA:
					sNombreCampoCategoriaValor="valor_factura";
					break;

				case FacturaDiarioConstantesFunciones.LABEL_BASEIMPONIBLE:
					sNombreCampoCategoriaValor="base_imponible";
					break;

				case FacturaDiarioConstantesFunciones.LABEL_MONTOIVA:
					sNombreCampoCategoriaValor="monto_iva";
					break;

				case FacturaDiarioConstantesFunciones.LABEL_BIMTARJETA:
					sNombreCampoCategoriaValor="bim_tarjeta";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoFacturaDiario.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoFacturaDiario.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case FacturaDiarioConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case FacturaDiarioConstantesFunciones.LABEL_IDSUCURSAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Sucursal",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_sucursal");
					break;

				case FacturaDiarioConstantesFunciones.LABEL_IDCLIENTE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Cliente",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_cliente");
					break;

				case FacturaDiarioConstantesFunciones.LABEL_IDPERIODODECLARA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Periodo Declara",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_periodo_declara");
					break;

				case FacturaDiarioConstantesFunciones.LABEL_IDTIPOIVA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Tipo Iva",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_tipo_iva");
					break;

				case FacturaDiarioConstantesFunciones.LABEL_FECHAEMISION:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Fecha Emision",sNombreCampoCategoria,sNombreCampoCategoriaValor,"fecha_emision");
					break;

				case FacturaDiarioConstantesFunciones.LABEL_FECHAVENCIMIENTO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Fecha Vencimiento",sNombreCampoCategoria,sNombreCampoCategoriaValor,"fecha_vencimiento");
					break;

				case FacturaDiarioConstantesFunciones.LABEL_NUMEROSERIE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Numero Serie",sNombreCampoCategoria,sNombreCampoCategoriaValor,"numero_serie");
					break;

				case FacturaDiarioConstantesFunciones.LABEL_RUC:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Ruc",sNombreCampoCategoria,sNombreCampoCategoriaValor,"ruc");
					break;

				case FacturaDiarioConstantesFunciones.LABEL_NUMEROAUTORIZA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Numero Autoriza",sNombreCampoCategoria,sNombreCampoCategoriaValor,"numero_autoriza");
					break;

				case FacturaDiarioConstantesFunciones.LABEL_ESDEVOLUCION:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Es Devolucion",sNombreCampoCategoria,sNombreCampoCategoriaValor,"es_devolucion");
					break;

				case FacturaDiarioConstantesFunciones.LABEL_VALORFACTURA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Valor Factura",sNombreCampoCategoria,sNombreCampoCategoriaValor,"valor_factura");
					break;

				case FacturaDiarioConstantesFunciones.LABEL_BASEIMPONIBLE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Base Imponible",sNombreCampoCategoria,sNombreCampoCategoriaValor,"base_imponible");
					break;

				case FacturaDiarioConstantesFunciones.LABEL_MONTOIVA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Monto Iva",sNombreCampoCategoria,sNombreCampoCategoriaValor,"monto_iva");
					break;

				case FacturaDiarioConstantesFunciones.LABEL_BIMTARJETA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Bim Tarjeta",sNombreCampoCategoria,sNombreCampoCategoriaValor,"bim_tarjeta");
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
	
	public void jButtonGenerarExcelReporteDinamicoFacturaDiarioActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<FacturaDiario> facturadiariosSeleccionados=new ArrayList<FacturaDiario>();		
		
		facturadiariosSeleccionados=this.getFacturaDiariosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"facturadiario";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("FacturaDiarios");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoFacturaDiario.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoFacturaDiario.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case FacturaDiarioConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(FacturaDiarioConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(FacturaDiario facturadiario:facturadiariosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(facturadiario.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case FacturaDiarioConstantesFunciones.LABEL_IDSUCURSAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(FacturaDiarioConstantesFunciones.LABEL_IDSUCURSAL);
					iRow++;

					for(FacturaDiario facturadiario:facturadiariosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(facturadiario.getsucursal_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case FacturaDiarioConstantesFunciones.LABEL_IDCLIENTE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(FacturaDiarioConstantesFunciones.LABEL_IDCLIENTE);
					iRow++;

					for(FacturaDiario facturadiario:facturadiariosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(facturadiario.getcliente_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case FacturaDiarioConstantesFunciones.LABEL_IDPERIODODECLARA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(FacturaDiarioConstantesFunciones.LABEL_IDPERIODODECLARA);
					iRow++;

					for(FacturaDiario facturadiario:facturadiariosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(facturadiario.getperiododeclara_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case FacturaDiarioConstantesFunciones.LABEL_IDTIPOIVA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(FacturaDiarioConstantesFunciones.LABEL_IDTIPOIVA);
					iRow++;

					for(FacturaDiario facturadiario:facturadiariosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(facturadiario.gettipoiva_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case FacturaDiarioConstantesFunciones.LABEL_FECHAEMISION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(FacturaDiarioConstantesFunciones.LABEL_FECHAEMISION);
					iRow++;

					for(FacturaDiario facturadiario:facturadiariosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(facturadiario.getfecha_emision());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case FacturaDiarioConstantesFunciones.LABEL_FECHAVENCIMIENTO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(FacturaDiarioConstantesFunciones.LABEL_FECHAVENCIMIENTO);
					iRow++;

					for(FacturaDiario facturadiario:facturadiariosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(facturadiario.getfecha_vencimiento());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case FacturaDiarioConstantesFunciones.LABEL_NUMEROSERIE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(FacturaDiarioConstantesFunciones.LABEL_NUMEROSERIE);
					iRow++;

					for(FacturaDiario facturadiario:facturadiariosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(facturadiario.getnumero_serie());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case FacturaDiarioConstantesFunciones.LABEL_RUC:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(FacturaDiarioConstantesFunciones.LABEL_RUC);
					iRow++;

					for(FacturaDiario facturadiario:facturadiariosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(facturadiario.getruc());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case FacturaDiarioConstantesFunciones.LABEL_NUMEROAUTORIZA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(FacturaDiarioConstantesFunciones.LABEL_NUMEROAUTORIZA);
					iRow++;

					for(FacturaDiario facturadiario:facturadiariosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(facturadiario.getnumero_autoriza());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case FacturaDiarioConstantesFunciones.LABEL_ESDEVOLUCION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(FacturaDiarioConstantesFunciones.LABEL_ESDEVOLUCION);
					iRow++;

					for(FacturaDiario facturadiario:facturadiariosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(facturadiario.getes_devolucion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case FacturaDiarioConstantesFunciones.LABEL_VALORFACTURA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(FacturaDiarioConstantesFunciones.LABEL_VALORFACTURA);
					iRow++;

					for(FacturaDiario facturadiario:facturadiariosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(facturadiario.getvalor_factura());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case FacturaDiarioConstantesFunciones.LABEL_BASEIMPONIBLE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(FacturaDiarioConstantesFunciones.LABEL_BASEIMPONIBLE);
					iRow++;

					for(FacturaDiario facturadiario:facturadiariosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(facturadiario.getbase_imponible());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case FacturaDiarioConstantesFunciones.LABEL_MONTOIVA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(FacturaDiarioConstantesFunciones.LABEL_MONTOIVA);
					iRow++;

					for(FacturaDiario facturadiario:facturadiariosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(facturadiario.getmonto_iva());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case FacturaDiarioConstantesFunciones.LABEL_BIMTARJETA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(FacturaDiarioConstantesFunciones.LABEL_BIMTARJETA);
					iRow++;

					for(FacturaDiario facturadiario:facturadiariosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(facturadiario.getbim_tarjeta());
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
			//	this.getFilaCabeceraExportarExcelFacturaDiario(row);				
			//	iRow++;
			//}				
			
			//for(FacturaDiario facturadiarioAux:facturadiariosSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelFacturaDiario(facturadiarioAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.facturadiarioSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Factura Diario",JOptionPane.INFORMATION_MESSAGE);
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
				this.facturadiarioLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingFacturaDiario(false);
			
			//SI ES MANUAL
			if(FacturaDiarioJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualFacturaDiario();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturadiarioLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturadiarioLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturadiarioLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresFacturaDiarioActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturadiarioLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingFacturaDiario(false);
			
			//SI ES MANUAL
			if(FacturaDiarioJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualFacturaDiario();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturadiarioLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturadiarioLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,FacturaDiarioConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturadiarioLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesFacturaDiarioActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturadiarioLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingFacturaDiario(false);
			
			//SI ES MANUAL
			if(FacturaDiarioJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualFacturaDiario();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturadiarioLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturadiarioLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,FacturaDiarioConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturadiarioLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaFacturaDiario() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosFacturaDiario.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosFacturaDiario.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosFacturaDiario.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosFacturaDiario.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosFacturaDiario.setMinimumSize(dimensionMinimum);
		this.jTableDatosFacturaDiario.setMaximumSize(dimensionMaximum);
		this.jTableDatosFacturaDiario.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingFacturaDiario(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingFacturaDiario(esInicializar,true);
	}
	
	public void inicializarActualizarBindingFacturaDiario(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaFacturaDiario(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesFacturaDiario(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.facturadiarioSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasFacturaDiario(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesFacturaDiario(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesFacturaDiario(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !FacturaDiarioJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!FacturaDiarioJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualFacturaDiario() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaFacturaDiario();
		
		this.inicializarActualizarBindingBotonesManualFacturaDiario(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.facturadiarioSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualFacturaDiario();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesFacturaDiario() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualFacturaDiario(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualFacturaDiario(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosFacturaDiario.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosFacturaDiario.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteFacturaDiario.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormFacturaDiario!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormFacturaDiario.jCheckBoxPostAccionNuevoFacturaDiario.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormFacturaDiario.jCheckBoxPostAccionSinCerrarFacturaDiario.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormFacturaDiario.jCheckBoxPostAccionSinMensajeFacturaDiario.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosFacturaDiario.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosFacturaDiario.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteFacturaDiario.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormFacturaDiario!=null) {
				this.jInternalFrameDetalleFormFacturaDiario.jCheckBoxPostAccionNuevoFacturaDiario.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormFacturaDiario.jCheckBoxPostAccionSinCerrarFacturaDiario.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormFacturaDiario.jCheckBoxPostAccionSinMensajeFacturaDiario.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionFacturaDiario.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionFacturaDiario.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormFacturaDiario!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormFacturaDiario.jComboBoxTiposAccionesFormularioFacturaDiario.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesFacturaDiario.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoFacturaDiario!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoFacturaDiario.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesFacturaDiario.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesFacturaDiario.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarFacturaDiario.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesFacturaDiario.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoFacturaDiario!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoFacturaDiario.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesFacturaDiario.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralFacturaDiario.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesFacturaDiario(Boolean esInicializar) throws Exception {
		try	{	
			if(FacturaDiarioJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualFacturaDiario(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesFacturaDiario() throws Exception {
		try	{
			if(FacturaDiarioJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFacturaDiario();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleFacturaDiario() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormFacturaDiario.jComboBoxTiposAccionesFormularioFacturaDiario.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormFacturaDiario.jComboBoxTiposAccionesFormularioFacturaDiario.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFacturaDiario() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesFacturaDiario.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesFacturaDiario.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesFacturaDiario.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesFacturaDiario.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesFacturaDiario.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesFacturaDiario.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionFacturaDiario.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionFacturaDiario.addItem(reporte);
			}
			
			
			if(!this.facturadiarioSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionFacturaDiario.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionFacturaDiario.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesFacturaDiario.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesFacturaDiario.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesFacturaDiario.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesFacturaDiario.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormFacturaDiario!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormFacturaDiario.jComboBoxTiposAccionesFormularioFacturaDiario.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormFacturaDiario.jComboBoxTiposAccionesFormularioFacturaDiario.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarFacturaDiario.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarFacturaDiario.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarFacturaDiario.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualFacturaDiario();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualFacturaDiario() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoFacturaDiario!=null) {
				this.jInternalFrameReporteDinamicoFacturaDiario.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoFacturaDiario.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoFacturaDiario!=null) {
				this.jInternalFrameReporteDinamicoFacturaDiario.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoFacturaDiario.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoFacturaDiario!=null) {
				
				if(this.jInternalFrameReporteDinamicoFacturaDiario.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoFacturaDiario.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoFacturaDiario.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoFacturaDiario.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoFacturaDiario.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoFacturaDiario.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
				
				//TIPOS COLUMNAS CATEGORIA DINAMICO
				if(this.jInternalFrameReporteDinamicoFacturaDiario.getjComboBoxColumnaCategoriaGrafico()!=null) {
					this.jInternalFrameReporteDinamicoFacturaDiario.getjComboBoxColumnaCategoriaGrafico().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoria=FacturaDiarioConstantesFunciones.getTiposSeleccionarFacturaDiario(true,true,false,true,true);
						
					for(Reporte reporte:tiposColumnasCategoria) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoFacturaDiario.getjComboBoxColumnaCategoriaGrafico().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS CATEGORIA VALOR DINAMICO
				if(this.jInternalFrameReporteDinamicoFacturaDiario.getjComboBoxColumnaCategoriaValor()!=null) {
					this.jInternalFrameReporteDinamicoFacturaDiario.getjComboBoxColumnaCategoriaValor().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoriaValor=FacturaDiarioConstantesFunciones.getTiposSeleccionarFacturaDiario(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasCategoriaValor) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoFacturaDiario.getjComboBoxColumnaCategoriaValor().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS VALOR
				defaultListModel=new DefaultListModel<Reporte>();
					
				if(this.jInternalFrameReporteDinamicoFacturaDiario.getjListColumnasValoresGrafico()!=null) {
					this.jInternalFrameReporteDinamicoFacturaDiario.getjListColumnasValoresGrafico().removeAll();
						
					ArrayList<Reporte> tiposColumnasValor=FacturaDiarioConstantesFunciones.getTiposSeleccionarFacturaDiario(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasValor) {//this.tiposSeleccionar
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoFacturaDiario.getjListColumnasValoresGrafico().setModel(defaultListModel);									
						
				}
					
				//TIPOS GRAFICOS REPORTES DINAMICOS
				if(this.jInternalFrameReporteDinamicoFacturaDiario.getjComboBoxTiposGraficosReportesDinamico()!=null) {
					this.jInternalFrameReporteDinamicoFacturaDiario.getjComboBoxTiposGraficosReportesDinamico().removeAllItems();
						
					for(Reporte reporte:this.tiposGraficosReportes) {
						this.jInternalFrameReporteDinamicoFacturaDiario.getjComboBoxTiposGraficosReportesDinamico().addItem(reporte);
					}
					
				}
			
			
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualFacturaDiario()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_clienteFK_IdClienteFacturaDiario.getSelectedItem()!=null){this.id_clienteFK_IdCliente=((Cliente)this.jComboBoxid_clienteFK_IdClienteFacturaDiario.getSelectedItem()).getId();}
		if(this.jComboBoxid_periodo_declaraFK_IdPeriodoDeclaraFacturaDiario.getSelectedItem()!=null){this.id_periodo_declaraFK_IdPeriodoDeclara=((PeriodoDeclara)this.jComboBoxid_periodo_declaraFK_IdPeriodoDeclaraFacturaDiario.getSelectedItem()).getId();}
		if(this.jComboBoxid_tipo_ivaFK_IdTipoIvaFacturaDiario.getSelectedItem()!=null){this.id_tipo_ivaFK_IdTipoIva=((TipoIva)this.jComboBoxid_tipo_ivaFK_IdTipoIvaFacturaDiario.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasFacturaDiario(Boolean esInicializar) throws Exception {				
		if(FacturaDiarioJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualFacturaDiario();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaFacturaDiario() throws Exception {
		this.inicializarActualizarBindingTablaFacturaDiario(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByFacturaDiario() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByFacturaDiario.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByFacturaDiario.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByFacturaDiario.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new FacturaDiarioPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByFacturaDiario.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByFacturaDiario.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new FacturaDiarioPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosFacturaDiarioOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosFacturaDiarioOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new FacturaDiarioPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByFacturaDiario.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByFacturaDiario.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new FacturaDiarioPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByFacturaDiario.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaFacturaDiario(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=facturadiarioLogic.getFacturaDiarios().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=facturadiarios.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(FacturaDiarioJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosFacturaDiario.setModel(new FacturaDiarioModel(this.facturadiarioLogic.getFacturaDiarios(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosFacturaDiario.setModel(new FacturaDiarioModel(this.facturadiarios,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByFacturaDiario!=null && this.jInternalFrameOrderByFacturaDiario.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByFacturaDiario();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosFacturaDiario.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosFacturaDiario,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new FacturaDiarioPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+FacturaDiarioConstantesFunciones.SCLASSWEBTITULO,facturadiarioConstantesFunciones.resaltarSeleccionarFacturaDiario,iSizeTabla,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+FacturaDiarioConstantesFunciones.SCLASSWEBTITULO,facturadiarioConstantesFunciones.resaltarSeleccionarFacturaDiario,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosFacturaDiario.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosFacturaDiario,FacturaDiarioConstantesFunciones.LABEL_ID));

		if(this.facturadiarioConstantesFunciones.mostraridFacturaDiario && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,FacturaDiarioConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.facturadiarioConstantesFunciones.resaltaridFacturaDiario,this.facturadiarioConstantesFunciones.activaridFacturaDiario,iSizeTabla,this,true,"idFacturaDiario","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.facturadiarioConstantesFunciones.resaltaridFacturaDiario,this.facturadiarioConstantesFunciones.activaridFacturaDiario,this,true,"idFacturaDiario","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosFacturaDiario.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosFacturaDiario,FacturaDiarioConstantesFunciones.LABEL_IDEMPRESA));

		if(this.facturadiarioConstantesFunciones.mostrarid_empresaFacturaDiario && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,FacturaDiarioConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.facturadiarioConstantesFunciones.resaltarid_empresaFacturaDiario,this,this.facturadiarioConstantesFunciones.activarid_empresaFacturaDiario,iSizeTabla));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.facturadiarioConstantesFunciones.resaltarid_empresaFacturaDiario,this,this.facturadiarioConstantesFunciones.activarid_empresaFacturaDiario,false,"id_empresaFacturaDiario","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new FacturaDiarioPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosFacturaDiario.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosFacturaDiario,FacturaDiarioConstantesFunciones.LABEL_IDSUCURSAL));

		if(this.facturadiarioConstantesFunciones.mostrarid_sucursalFacturaDiario && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,FacturaDiarioConstantesFunciones.LABEL_IDSUCURSAL,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new SucursalTableCell(this.sucursalsForeignKey,this.facturadiarioConstantesFunciones.resaltarid_sucursalFacturaDiario,this,this.facturadiarioConstantesFunciones.activarid_sucursalFacturaDiario,iSizeTabla));
			tableColumn.setCellEditor(new SucursalTableCell(this.sucursalsForeignKey,this.facturadiarioConstantesFunciones.resaltarid_sucursalFacturaDiario,this,this.facturadiarioConstantesFunciones.activarid_sucursalFacturaDiario,false,"id_sucursalFacturaDiario","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new FacturaDiarioPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosFacturaDiario.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosFacturaDiario,FacturaDiarioConstantesFunciones.LABEL_IDCLIENTE));

		if(this.facturadiarioConstantesFunciones.mostrarid_clienteFacturaDiario && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,FacturaDiarioConstantesFunciones.LABEL_IDCLIENTE,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new ClienteTableCell(this.clientesForeignKey,this.facturadiarioConstantesFunciones.resaltarid_clienteFacturaDiario,this,this.facturadiarioConstantesFunciones.activarid_clienteFacturaDiario,iSizeTabla));
			tableColumn.setCellEditor(new ClienteTableCell(this.clientesForeignKey,this.facturadiarioConstantesFunciones.resaltarid_clienteFacturaDiario,this,this.facturadiarioConstantesFunciones.activarid_clienteFacturaDiario,true,"id_clienteFacturaDiario","CON_BUSQUEDA"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75);
			//tableColumn.addPropertyChangeListener(new FacturaDiarioPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosFacturaDiario.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosFacturaDiario,FacturaDiarioConstantesFunciones.LABEL_IDPERIODODECLARA));

		if(this.facturadiarioConstantesFunciones.mostrarid_periodo_declaraFacturaDiario && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,FacturaDiarioConstantesFunciones.LABEL_IDPERIODODECLARA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new PeriodoDeclaraTableCell(this.periododeclarasForeignKey,this.facturadiarioConstantesFunciones.resaltarid_periodo_declaraFacturaDiario,this,this.facturadiarioConstantesFunciones.activarid_periodo_declaraFacturaDiario,iSizeTabla));
			tableColumn.setCellEditor(new PeriodoDeclaraTableCell(this.periododeclarasForeignKey,this.facturadiarioConstantesFunciones.resaltarid_periodo_declaraFacturaDiario,this,this.facturadiarioConstantesFunciones.activarid_periodo_declaraFacturaDiario,true,"id_periodo_declaraFacturaDiario","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new FacturaDiarioPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosFacturaDiario.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosFacturaDiario,FacturaDiarioConstantesFunciones.LABEL_IDTIPOIVA));

		if(this.facturadiarioConstantesFunciones.mostrarid_tipo_ivaFacturaDiario && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,FacturaDiarioConstantesFunciones.LABEL_IDTIPOIVA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new TipoIvaTableCell(this.tipoivasForeignKey,this.facturadiarioConstantesFunciones.resaltarid_tipo_ivaFacturaDiario,this,this.facturadiarioConstantesFunciones.activarid_tipo_ivaFacturaDiario,iSizeTabla));
			tableColumn.setCellEditor(new TipoIvaTableCell(this.tipoivasForeignKey,this.facturadiarioConstantesFunciones.resaltarid_tipo_ivaFacturaDiario,this,this.facturadiarioConstantesFunciones.activarid_tipo_ivaFacturaDiario,true,"id_tipo_ivaFacturaDiario","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new FacturaDiarioPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosFacturaDiario.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosFacturaDiario,FacturaDiarioConstantesFunciones.LABEL_FECHAEMISION));

		if(this.facturadiarioConstantesFunciones.mostrarfecha_emisionFacturaDiario && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,FacturaDiarioConstantesFunciones.LABEL_FECHAEMISION,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new DateRenderer(this.facturadiarioConstantesFunciones.resaltarfecha_emisionFacturaDiario,this.facturadiarioConstantesFunciones.activarfecha_emisionFacturaDiario,iSizeTabla,this,true,"fecha_emisionFacturaDiario","BASICO"));
			tableColumn.setCellEditor(new DateEditorRenderer(this.facturadiarioConstantesFunciones.resaltarfecha_emisionFacturaDiario,this.facturadiarioConstantesFunciones.activarfecha_emisionFacturaDiario,this,true,"fecha_emisionFacturaDiario","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30);
			//tableColumn.addPropertyChangeListener(new FacturaDiarioPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosFacturaDiario.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosFacturaDiario,FacturaDiarioConstantesFunciones.LABEL_FECHAVENCIMIENTO));

		if(this.facturadiarioConstantesFunciones.mostrarfecha_vencimientoFacturaDiario && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,FacturaDiarioConstantesFunciones.LABEL_FECHAVENCIMIENTO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new DateRenderer(this.facturadiarioConstantesFunciones.resaltarfecha_vencimientoFacturaDiario,this.facturadiarioConstantesFunciones.activarfecha_vencimientoFacturaDiario,iSizeTabla,this,true,"fecha_vencimientoFacturaDiario","BASICO"));
			tableColumn.setCellEditor(new DateEditorRenderer(this.facturadiarioConstantesFunciones.resaltarfecha_vencimientoFacturaDiario,this.facturadiarioConstantesFunciones.activarfecha_vencimientoFacturaDiario,this,true,"fecha_vencimientoFacturaDiario","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30);
			//tableColumn.addPropertyChangeListener(new FacturaDiarioPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosFacturaDiario.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosFacturaDiario,FacturaDiarioConstantesFunciones.LABEL_NUMEROSERIE));

		if(this.facturadiarioConstantesFunciones.mostrarnumero_serieFacturaDiario && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,FacturaDiarioConstantesFunciones.LABEL_NUMEROSERIE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.facturadiarioConstantesFunciones.resaltarnumero_serieFacturaDiario,this.facturadiarioConstantesFunciones.activarnumero_serieFacturaDiario,iSizeTabla,this,true,"numero_serieFacturaDiario","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.facturadiarioConstantesFunciones.resaltarnumero_serieFacturaDiario,this.facturadiarioConstantesFunciones.activarnumero_serieFacturaDiario,this,true,"numero_serieFacturaDiario","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new FacturaDiarioPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosFacturaDiario.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosFacturaDiario,FacturaDiarioConstantesFunciones.LABEL_RUC));

		if(this.facturadiarioConstantesFunciones.mostrarrucFacturaDiario && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,FacturaDiarioConstantesFunciones.LABEL_RUC,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.facturadiarioConstantesFunciones.resaltarrucFacturaDiario,this.facturadiarioConstantesFunciones.activarrucFacturaDiario,iSizeTabla,this,true,"rucFacturaDiario","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.facturadiarioConstantesFunciones.resaltarrucFacturaDiario,this.facturadiarioConstantesFunciones.activarrucFacturaDiario,this,true,"rucFacturaDiario","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new FacturaDiarioPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosFacturaDiario.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosFacturaDiario,FacturaDiarioConstantesFunciones.LABEL_NUMEROAUTORIZA));

		if(this.facturadiarioConstantesFunciones.mostrarnumero_autorizaFacturaDiario && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,FacturaDiarioConstantesFunciones.LABEL_NUMEROAUTORIZA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.facturadiarioConstantesFunciones.resaltarnumero_autorizaFacturaDiario,this.facturadiarioConstantesFunciones.activarnumero_autorizaFacturaDiario,iSizeTabla,this,true,"numero_autorizaFacturaDiario","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.facturadiarioConstantesFunciones.resaltarnumero_autorizaFacturaDiario,this.facturadiarioConstantesFunciones.activarnumero_autorizaFacturaDiario,this,true,"numero_autorizaFacturaDiario","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new FacturaDiarioPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosFacturaDiario.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosFacturaDiario,FacturaDiarioConstantesFunciones.LABEL_ESDEVOLUCION));

		if(this.facturadiarioConstantesFunciones.mostrares_devolucionFacturaDiario && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,FacturaDiarioConstantesFunciones.LABEL_ESDEVOLUCION,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new BooleanRenderer(this.facturadiarioConstantesFunciones.resaltares_devolucionFacturaDiario,this.facturadiarioConstantesFunciones.activares_devolucionFacturaDiario,iSizeTabla));
			tableColumn.setCellEditor(new BooleanEditorRenderer(this.facturadiarioConstantesFunciones.resaltares_devolucionFacturaDiario,this.facturadiarioConstantesFunciones.activares_devolucionFacturaDiario,this,true,"es_devolucionFacturaDiario","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new FacturaDiarioPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosFacturaDiario.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosFacturaDiario,FacturaDiarioConstantesFunciones.LABEL_VALORFACTURA));

		if(this.facturadiarioConstantesFunciones.mostrarvalor_facturaFacturaDiario && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,FacturaDiarioConstantesFunciones.LABEL_VALORFACTURA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.facturadiarioConstantesFunciones.resaltarvalor_facturaFacturaDiario,this.facturadiarioConstantesFunciones.activarvalor_facturaFacturaDiario,iSizeTabla,this,true,"valor_facturaFacturaDiario","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.facturadiarioConstantesFunciones.resaltarvalor_facturaFacturaDiario,this.facturadiarioConstantesFunciones.activarvalor_facturaFacturaDiario,this,true,"valor_facturaFacturaDiario","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new FacturaDiarioPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosFacturaDiario.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosFacturaDiario,FacturaDiarioConstantesFunciones.LABEL_BASEIMPONIBLE));

		if(this.facturadiarioConstantesFunciones.mostrarbase_imponibleFacturaDiario && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,FacturaDiarioConstantesFunciones.LABEL_BASEIMPONIBLE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.facturadiarioConstantesFunciones.resaltarbase_imponibleFacturaDiario,this.facturadiarioConstantesFunciones.activarbase_imponibleFacturaDiario,iSizeTabla,this,true,"base_imponibleFacturaDiario","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.facturadiarioConstantesFunciones.resaltarbase_imponibleFacturaDiario,this.facturadiarioConstantesFunciones.activarbase_imponibleFacturaDiario,this,true,"base_imponibleFacturaDiario","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new FacturaDiarioPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosFacturaDiario.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosFacturaDiario,FacturaDiarioConstantesFunciones.LABEL_MONTOIVA));

		if(this.facturadiarioConstantesFunciones.mostrarmonto_ivaFacturaDiario && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,FacturaDiarioConstantesFunciones.LABEL_MONTOIVA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.facturadiarioConstantesFunciones.resaltarmonto_ivaFacturaDiario,this.facturadiarioConstantesFunciones.activarmonto_ivaFacturaDiario,iSizeTabla,this,true,"monto_ivaFacturaDiario","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.facturadiarioConstantesFunciones.resaltarmonto_ivaFacturaDiario,this.facturadiarioConstantesFunciones.activarmonto_ivaFacturaDiario,this,true,"monto_ivaFacturaDiario","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new FacturaDiarioPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosFacturaDiario.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosFacturaDiario,FacturaDiarioConstantesFunciones.LABEL_BIMTARJETA));

		if(this.facturadiarioConstantesFunciones.mostrarbim_tarjetaFacturaDiario && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,FacturaDiarioConstantesFunciones.LABEL_BIMTARJETA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.facturadiarioConstantesFunciones.resaltarbim_tarjetaFacturaDiario,this.facturadiarioConstantesFunciones.activarbim_tarjetaFacturaDiario,iSizeTabla,this,true,"bim_tarjetaFacturaDiario","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.facturadiarioConstantesFunciones.resaltarbim_tarjetaFacturaDiario,this.facturadiarioConstantesFunciones.activarbim_tarjetaFacturaDiario,this,true,"bim_tarjetaFacturaDiario","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new FacturaDiarioPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.facturadiarioSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.facturadiarioSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.facturadiarioSessionBean.getEsGuardarRelacionado(),iSizeTabla));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosFacturaDiario.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.facturadiarioSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.facturadiarioSessionBean.getEsGuardarRelacionado(),iSizeTabla));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosFacturaDiario.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarFacturaDiario && this.isPermisoGuardarCambiosFacturaDiario) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.facturadiarioSessionBean.getEsGuardarRelacionado(),iSizeTabla));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.facturadiarioSessionBean.getEsGuardarRelacionado(),iSizeTabla));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosFacturaDiario.addColumn(tableColumn);
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
			
			this.jTableDatosFacturaDiario.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarFacturaDiario && this.isPermisoGuardarCambiosFacturaDiario) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarFacturaDiario && this.isPermisoGuardarCambiosFacturaDiario) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosFacturaDiario.moveColumn(this.jTableDatosFacturaDiario.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosFacturaDiario.moveColumn(this.jTableDatosFacturaDiario.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosFacturaDiario.moveColumn(this.jTableDatosFacturaDiario.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosFacturaDiario.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosFacturaDiario.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosFacturaDiario,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!FacturaDiarioJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosFacturaDiario.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosFacturaDiario.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!FacturaDiarioJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!FacturaDiarioJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosFacturaDiario.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosFacturaDiario.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosFacturaDiario.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=facturadiarioLogic.getFacturaDiarios().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=facturadiarios.size()-1;
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
		//this.jTableDatosFacturaDiario.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosFacturaDiario.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosFacturaDiario();
			
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
				
				//this.isEsNuevoFacturaDiario=false;
					
				FacturaDiarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.facturadiario,new Object(),this.facturadiarioParameterGeneral,this.facturadiarioReturnGeneral);
			
				if(this.facturadiarioSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormFacturaDiario==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosFacturaDiario.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosFacturaDiario.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturadiario =(FacturaDiario) this.facturadiarioLogic.getFacturaDiarios().toArray()[this.jTableDatosFacturaDiario.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.facturadiario =(FacturaDiario) this.facturadiarios.toArray()[this.jTableDatosFacturaDiario.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.facturadiario.getsType().equals("DUPLICADO")
				   || this.facturadiario.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoFacturaDiario=true;
				
				} else {
					this.isEsNuevoFacturaDiario=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.facturadiarioSessionBean.getEsGuardarRelacionado()) {
					if(this.facturadiario.getId()>=0 && !this.facturadiario.getIsNew()) {						
						this.isEsNuevoFacturaDiario=false;
						
					} else {
						this.isEsNuevoFacturaDiario=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoFacturaDiario(esRelaciones);						
				
				this.seleccionarFacturaDiario(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.facturadiario.getId()<0) {
					this.isEsNuevoFacturaDiario=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarFacturaDiario(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarFacturaDiario(evt,rowIndex);
				}	
				
				if(this.facturadiarioSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion FacturaDiario: " + this.dDif); 
					}
				}								
				
				FacturaDiarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.facturadiario,new Object(),this.facturadiarioParameterGeneral,this.facturadiarioReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarFacturaDiario(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.facturadiario)) {
					if(this.facturadiario.getId()>0) {
						this.facturadiario.setIsDeleted(true);
						
						this.facturadiariosEliminados.add(this.facturadiario);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.facturadiarioLogic.getFacturaDiarios().remove(this.facturadiario);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.facturadiarios.remove(this.facturadiario);				
					}
					
					
					((FacturaDiarioModel) this.jTableDatosFacturaDiario.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaFacturaDiario(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,FacturaDiarioConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarFacturaDiario(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoFacturaDiario) {
			
			if(this.jInternalFrameDetalleFormFacturaDiario==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosFacturaDiario.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosFacturaDiario.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturadiario =(FacturaDiario) this.facturadiarioLogic.getFacturaDiarios().toArray()[this.jTableDatosFacturaDiario.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.facturadiario =(FacturaDiario) this.facturadiarios.toArray()[this.jTableDatosFacturaDiario.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(FacturaDiarioJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioFacturaDiario(this.facturadiario);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.facturadiarioConstantesFunciones.cargarid_empresaFacturaDiario || this.facturadiarioConstantesFunciones.event_dependid_empresaFacturaDiario) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.facturadiario.getid_empresa());
									//this.inicializarActualizarBindingFacturaDiario(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(facturadiario.getEmpresa()!=null) {
							this.empresasForeignKey.add(facturadiario.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.facturadiario.getid_empresa(),false,"Formulario");

					//Sucursal
					if(!this.facturadiarioConstantesFunciones.cargarid_sucursalFacturaDiario || this.facturadiarioConstantesFunciones.event_dependid_sucursalFacturaDiario) {
						//this.cargarCombosSucursalsForeignKeyLista(" where id="+this.facturadiario.getid_sucursal());
									//this.inicializarActualizarBindingFacturaDiario(false,false);
						this.sucursalsForeignKey=new ArrayList<Sucursal>();

						if(facturadiario.getSucursal()!=null) {
							this.sucursalsForeignKey.add(facturadiario.getSucursal());
						}

						this.addItemDefectoCombosForeignKeySucursal();
						this.cargarCombosFrameSucursalsForeignKey("Todos");
					}
					this.setActualSucursalForeignKey(this.facturadiario.getid_sucursal(),false,"Formulario");

					//Cliente
					if(!this.facturadiarioConstantesFunciones.cargarid_clienteFacturaDiario || this.facturadiarioConstantesFunciones.event_dependid_clienteFacturaDiario) {
						//this.cargarCombosClientesForeignKeyLista(" where id="+this.facturadiario.getid_cliente());
									//this.inicializarActualizarBindingFacturaDiario(false,false);
						this.clientesForeignKey=new ArrayList<Cliente>();

						if(facturadiario.getCliente()!=null) {
							this.clientesForeignKey.add(facturadiario.getCliente());
						}

						this.addItemDefectoCombosForeignKeyCliente();
						this.cargarCombosFrameClientesForeignKey("Todos");
					}
					this.setActualClienteForeignKey(this.facturadiario.getid_cliente(),false,"Formulario");

					//PeriodoDeclara
					if(!this.facturadiarioConstantesFunciones.cargarid_periodo_declaraFacturaDiario || this.facturadiarioConstantesFunciones.event_dependid_periodo_declaraFacturaDiario) {
						//this.cargarCombosPeriodoDeclarasForeignKeyLista(" where id="+this.facturadiario.getid_periodo_declara());
									//this.inicializarActualizarBindingFacturaDiario(false,false);
						this.periododeclarasForeignKey=new ArrayList<PeriodoDeclara>();

						if(facturadiario.getPeriodoDeclara()!=null) {
							this.periododeclarasForeignKey.add(facturadiario.getPeriodoDeclara());
						}

						this.addItemDefectoCombosForeignKeyPeriodoDeclara();
						this.cargarCombosFramePeriodoDeclarasForeignKey("Todos");
					}
					this.setActualPeriodoDeclaraForeignKey(this.facturadiario.getid_periodo_declara(),false,"Formulario");

					//TipoIva
					if(!this.facturadiarioConstantesFunciones.cargarid_tipo_ivaFacturaDiario || this.facturadiarioConstantesFunciones.event_dependid_tipo_ivaFacturaDiario) {
						//this.cargarCombosTipoIvasForeignKeyLista(" where id="+this.facturadiario.getid_tipo_iva());
									//this.inicializarActualizarBindingFacturaDiario(false,false);
						this.tipoivasForeignKey=new ArrayList<TipoIva>();

						if(facturadiario.getTipoIva()!=null) {
							this.tipoivasForeignKey.add(facturadiario.getTipoIva());
						}

						this.addItemDefectoCombosForeignKeyTipoIva();
						this.cargarCombosFrameTipoIvasForeignKey("Todos");
					}
					this.setActualTipoIvaForeignKey(this.facturadiario.getid_tipo_iva(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesFacturaDiario("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesFacturaDiario(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualFacturaDiario() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FacturaDiarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoFacturaDiario(FacturaDiario facturadiario) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoFacturaDiario(facturadiario,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoFacturaDiario(FacturaDiario facturadiario,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioFacturaDiario(facturadiario);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyFacturaDiario(facturadiario,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyFacturaDiario(facturadiario);
	}
	
	public void setVariablesObjetoActualToFormularioFacturaDiario(FacturaDiario facturadiario) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormFacturaDiario==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormFacturaDiario.jLabelidFacturaDiario.setText(facturadiario.getId().toString());
			this.jInternalFrameDetalleFormFacturaDiario.jDateChooserfecha_emisionFacturaDiario.setDate(facturadiario.getfecha_emision());
			this.jInternalFrameDetalleFormFacturaDiario.jDateChooserfecha_vencimientoFacturaDiario.setDate(facturadiario.getfecha_vencimiento());
			this.jInternalFrameDetalleFormFacturaDiario.jTextFieldnumero_serieFacturaDiario.setText(facturadiario.getnumero_serie());
			this.jInternalFrameDetalleFormFacturaDiario.jTextFieldrucFacturaDiario.setText(facturadiario.getruc());
			this.jInternalFrameDetalleFormFacturaDiario.jTextFieldnumero_autorizaFacturaDiario.setText(facturadiario.getnumero_autoriza());
			this.jInternalFrameDetalleFormFacturaDiario.jCheckBoxes_devolucionFacturaDiario.setSelected(facturadiario.getes_devolucion());
			this.jInternalFrameDetalleFormFacturaDiario.jTextFieldvalor_facturaFacturaDiario.setText(facturadiario.getvalor_factura().toString());
			this.jInternalFrameDetalleFormFacturaDiario.jTextFieldbase_imponibleFacturaDiario.setText(facturadiario.getbase_imponible().toString());
			this.jInternalFrameDetalleFormFacturaDiario.jTextFieldmonto_ivaFacturaDiario.setText(facturadiario.getmonto_iva().toString());
			this.jInternalFrameDetalleFormFacturaDiario.jTextFieldbim_tarjetaFacturaDiario.setText(facturadiario.getbim_tarjeta().toString());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,FacturaDiarioConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,FacturaDiario facturadiarioLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,facturadiarioLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,FacturaDiario facturadiarioLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				facturadiarioLocal=this.facturadiario;
			} else {
				facturadiarioLocal=this.facturadiarioAnterior;
			}
		}
		
		if(this.permiteMantenimiento(facturadiarioLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoFacturaDiario(facturadiarioLocal,true);
					
					if(facturadiarioSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(facturadiarioLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.facturadiarioSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(facturadiarioLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoFacturaDiario(FacturaDiario facturadiario,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualFacturaDiario(facturadiario,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysFacturaDiario(facturadiario);
	}
	
	public void setVariablesFormularioToObjetoActualFacturaDiario(FacturaDiario facturadiario,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualFacturaDiario(facturadiario,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualFacturaDiario(FacturaDiario facturadiario,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormFacturaDiario==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormFacturaDiario.jLabelidFacturaDiario.getText()==null || this.jInternalFrameDetalleFormFacturaDiario.jLabelidFacturaDiario.getText()=="" || this.jInternalFrameDetalleFormFacturaDiario.jLabelidFacturaDiario.getText()=="Id") {
				this.jInternalFrameDetalleFormFacturaDiario.jLabelidFacturaDiario.setText("0");
			}

			if(conColumnasBase) {facturadiario.setId(Long.parseLong(this.jInternalFrameDetalleFormFacturaDiario.jLabelidFacturaDiario.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+FacturaDiarioConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormFacturaDiario.jLabelIdFacturaDiario,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			facturadiario.setfecha_emision(this.jInternalFrameDetalleFormFacturaDiario.jDateChooserfecha_emisionFacturaDiario.getDate());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+FacturaDiarioConstantesFunciones.LABEL_FECHAEMISION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormFacturaDiario.jLabelfecha_emisionFacturaDiario,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			facturadiario.setfecha_vencimiento(this.jInternalFrameDetalleFormFacturaDiario.jDateChooserfecha_vencimientoFacturaDiario.getDate());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+FacturaDiarioConstantesFunciones.LABEL_FECHAVENCIMIENTO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormFacturaDiario.jLabelfecha_vencimientoFacturaDiario,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			facturadiario.setnumero_serie(this.jInternalFrameDetalleFormFacturaDiario.jTextFieldnumero_serieFacturaDiario.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+FacturaDiarioConstantesFunciones.LABEL_NUMEROSERIE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormFacturaDiario.jLabelnumero_serieFacturaDiario,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			facturadiario.setruc(this.jInternalFrameDetalleFormFacturaDiario.jTextFieldrucFacturaDiario.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+FacturaDiarioConstantesFunciones.LABEL_RUC+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormFacturaDiario.jLabelrucFacturaDiario,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			facturadiario.setnumero_autoriza(this.jInternalFrameDetalleFormFacturaDiario.jTextFieldnumero_autorizaFacturaDiario.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+FacturaDiarioConstantesFunciones.LABEL_NUMEROAUTORIZA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormFacturaDiario.jLabelnumero_autorizaFacturaDiario,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			facturadiario.setes_devolucion(this.jInternalFrameDetalleFormFacturaDiario.jCheckBoxes_devolucionFacturaDiario.isSelected());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+FacturaDiarioConstantesFunciones.LABEL_ESDEVOLUCION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormFacturaDiario.jLabeles_devolucionFacturaDiario,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			facturadiario.setvalor_factura(Double.parseDouble(this.jInternalFrameDetalleFormFacturaDiario.jTextFieldvalor_facturaFacturaDiario.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+FacturaDiarioConstantesFunciones.LABEL_VALORFACTURA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormFacturaDiario.jLabelvalor_facturaFacturaDiario,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			facturadiario.setbase_imponible(Double.parseDouble(this.jInternalFrameDetalleFormFacturaDiario.jTextFieldbase_imponibleFacturaDiario.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+FacturaDiarioConstantesFunciones.LABEL_BASEIMPONIBLE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormFacturaDiario.jLabelbase_imponibleFacturaDiario,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			facturadiario.setmonto_iva(Double.parseDouble(this.jInternalFrameDetalleFormFacturaDiario.jTextFieldmonto_ivaFacturaDiario.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+FacturaDiarioConstantesFunciones.LABEL_MONTOIVA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormFacturaDiario.jLabelmonto_ivaFacturaDiario,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			facturadiario.setbim_tarjeta(Double.parseDouble(this.jInternalFrameDetalleFormFacturaDiario.jTextFieldbim_tarjetaFacturaDiario.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+FacturaDiarioConstantesFunciones.LABEL_BIMTARJETA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormFacturaDiario.jLabelbim_tarjetaFacturaDiario,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,FacturaDiarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualFacturaDiario(FacturaDiario facturadiarioBean,FacturaDiario facturadiario,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conDefault || (!conDefault && facturadiarioBean.getid_cliente()!=null && !facturadiarioBean.getid_cliente().equals(-1L))) {facturadiario.setid_cliente(facturadiarioBean.getid_cliente());}
			if(conDefault || (!conDefault && facturadiarioBean.getid_periodo_declara()!=null && !facturadiarioBean.getid_periodo_declara().equals(-1L))) {facturadiario.setid_periodo_declara(facturadiarioBean.getid_periodo_declara());}
			if(conDefault || (!conDefault && facturadiarioBean.getid_tipo_iva()!=null && !facturadiarioBean.getid_tipo_iva().equals(-1L))) {facturadiario.setid_tipo_iva(facturadiarioBean.getid_tipo_iva());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,FacturaDiarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosFacturaDiario(FacturaDiario facturadiarioOrigen,FacturaDiario facturadiario,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && facturadiarioOrigen.getId()!=null && !facturadiarioOrigen.getId().equals(0L))) {facturadiario.setId(facturadiarioOrigen.getId());}}
			if(conDefault || (!conDefault && facturadiarioOrigen.getid_cliente()!=null && !facturadiarioOrigen.getid_cliente().equals(-1L))) {facturadiario.setid_cliente(facturadiarioOrigen.getid_cliente());}
			if(conDefault || (!conDefault && facturadiarioOrigen.getid_periodo_declara()!=null && !facturadiarioOrigen.getid_periodo_declara().equals(-1L))) {facturadiario.setid_periodo_declara(facturadiarioOrigen.getid_periodo_declara());}
			if(conDefault || (!conDefault && facturadiarioOrigen.getid_tipo_iva()!=null && !facturadiarioOrigen.getid_tipo_iva().equals(-1L))) {facturadiario.setid_tipo_iva(facturadiarioOrigen.getid_tipo_iva());}
			if(conDefault || (!conDefault && facturadiarioOrigen.getfecha_emision()!=null && !facturadiarioOrigen.getfecha_emision().equals(new Date()))) {facturadiario.setfecha_emision(facturadiarioOrigen.getfecha_emision());}
			if(conDefault || (!conDefault && facturadiarioOrigen.getfecha_vencimiento()!=null && !facturadiarioOrigen.getfecha_vencimiento().equals(new Date()))) {facturadiario.setfecha_vencimiento(facturadiarioOrigen.getfecha_vencimiento());}
			if(conDefault || (!conDefault && facturadiarioOrigen.getnumero_serie()!=null && !facturadiarioOrigen.getnumero_serie().equals(""))) {facturadiario.setnumero_serie(facturadiarioOrigen.getnumero_serie());}
			if(conDefault || (!conDefault && facturadiarioOrigen.getruc()!=null && !facturadiarioOrigen.getruc().equals(""))) {facturadiario.setruc(facturadiarioOrigen.getruc());}
			if(conDefault || (!conDefault && facturadiarioOrigen.getnumero_autoriza()!=null && !facturadiarioOrigen.getnumero_autoriza().equals(""))) {facturadiario.setnumero_autoriza(facturadiarioOrigen.getnumero_autoriza());}
			if(conDefault || (!conDefault && facturadiarioOrigen.getes_devolucion()!=null && !facturadiarioOrigen.getes_devolucion().equals(false))) {facturadiario.setes_devolucion(facturadiarioOrigen.getes_devolucion());}
			if(conDefault || (!conDefault && facturadiarioOrigen.getvalor_factura()!=null && !facturadiarioOrigen.getvalor_factura().equals(0.0))) {facturadiario.setvalor_factura(facturadiarioOrigen.getvalor_factura());}
			if(conDefault || (!conDefault && facturadiarioOrigen.getbase_imponible()!=null && !facturadiarioOrigen.getbase_imponible().equals(0.0))) {facturadiario.setbase_imponible(facturadiarioOrigen.getbase_imponible());}
			if(conDefault || (!conDefault && facturadiarioOrigen.getmonto_iva()!=null && !facturadiarioOrigen.getmonto_iva().equals(0.0))) {facturadiario.setmonto_iva(facturadiarioOrigen.getmonto_iva());}
			if(conDefault || (!conDefault && facturadiarioOrigen.getbim_tarjeta()!=null && !facturadiarioOrigen.getbim_tarjeta().equals(0.0))) {facturadiario.setbim_tarjeta(facturadiarioOrigen.getbim_tarjeta());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,FacturaDiarioConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioFacturaDiario(FacturaDiario facturadiario) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormFacturaDiario.jLabelidFacturaDiario.setText(facturadiario.getId().toString());
			this.jInternalFrameDetalleFormFacturaDiario.jDateChooserfecha_emisionFacturaDiario.setDate(facturadiario.getfecha_emision());
			this.jInternalFrameDetalleFormFacturaDiario.jDateChooserfecha_vencimientoFacturaDiario.setDate(facturadiario.getfecha_vencimiento());
			this.jInternalFrameDetalleFormFacturaDiario.jTextFieldnumero_serieFacturaDiario.setText(facturadiario.getnumero_serie());
			this.jInternalFrameDetalleFormFacturaDiario.jTextFieldrucFacturaDiario.setText(facturadiario.getruc());
			this.jInternalFrameDetalleFormFacturaDiario.jTextFieldnumero_autorizaFacturaDiario.setText(facturadiario.getnumero_autoriza());
			this.jInternalFrameDetalleFormFacturaDiario.jCheckBoxes_devolucionFacturaDiario.setSelected(facturadiario.getes_devolucion());
			this.jInternalFrameDetalleFormFacturaDiario.jTextFieldvalor_facturaFacturaDiario.setText(facturadiario.getvalor_factura().toString());
			this.jInternalFrameDetalleFormFacturaDiario.jTextFieldbase_imponibleFacturaDiario.setText(facturadiario.getbase_imponible().toString());
			this.jInternalFrameDetalleFormFacturaDiario.jTextFieldmonto_ivaFacturaDiario.setText(facturadiario.getmonto_iva().toString());
			this.jInternalFrameDetalleFormFacturaDiario.jTextFieldbim_tarjetaFacturaDiario.setText(facturadiario.getbim_tarjeta().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FacturaDiarioConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioFacturaDiario(FacturaDiarioBean facturadiarioBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormFacturaDiario.jLabelidFacturaDiario.setText(facturadiarioBean.getId().toString());
			this.jInternalFrameDetalleFormFacturaDiario.jDateChooserfecha_emisionFacturaDiario.setDate(facturadiarioBean.getfecha_emision());
			this.jInternalFrameDetalleFormFacturaDiario.jDateChooserfecha_vencimientoFacturaDiario.setDate(facturadiarioBean.getfecha_vencimiento());
			this.jInternalFrameDetalleFormFacturaDiario.jTextFieldnumero_serieFacturaDiario.setText(facturadiarioBean.getnumero_serie());
			this.jInternalFrameDetalleFormFacturaDiario.jTextFieldrucFacturaDiario.setText(facturadiarioBean.getruc());
			this.jInternalFrameDetalleFormFacturaDiario.jTextFieldnumero_autorizaFacturaDiario.setText(facturadiarioBean.getnumero_autoriza());
			this.jInternalFrameDetalleFormFacturaDiario.jCheckBoxes_devolucionFacturaDiario.setSelected(facturadiarioBean.getes_devolucion());
			this.jInternalFrameDetalleFormFacturaDiario.jTextFieldvalor_facturaFacturaDiario.setText(facturadiarioBean.getvalor_factura().toString());
			this.jInternalFrameDetalleFormFacturaDiario.jTextFieldbase_imponibleFacturaDiario.setText(facturadiarioBean.getbase_imponible().toString());
			this.jInternalFrameDetalleFormFacturaDiario.jTextFieldmonto_ivaFacturaDiario.setText(facturadiarioBean.getmonto_iva().toString());
			this.jInternalFrameDetalleFormFacturaDiario.jTextFieldbim_tarjetaFacturaDiario.setText(facturadiarioBean.getbim_tarjeta().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FacturaDiarioConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanFacturaDiario(FacturaDiarioParameterReturnGeneral facturadiarioReturnGeneral,FacturaDiarioBean facturadiarioBean,Boolean conDefault) throws Exception { 
		try {
			FacturaDiario facturadiarioLocal=new FacturaDiario();
			
			facturadiarioLocal=facturadiarioReturnGeneral.getFacturaDiario();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && facturadiarioLocal.getId()!=null && !facturadiarioLocal.getId().equals(0L))) {facturadiarioBean.setId(facturadiarioLocal.getId());}}
			if(conDefault || (!conDefault && facturadiarioLocal.getid_cliente()!=null && !facturadiarioLocal.getid_cliente().equals(-1L))) {facturadiarioBean.setid_cliente(facturadiarioLocal.getid_cliente());}
			if(conDefault || (!conDefault && facturadiarioLocal.getid_periodo_declara()!=null && !facturadiarioLocal.getid_periodo_declara().equals(-1L))) {facturadiarioBean.setid_periodo_declara(facturadiarioLocal.getid_periodo_declara());}
			if(conDefault || (!conDefault && facturadiarioLocal.getid_tipo_iva()!=null && !facturadiarioLocal.getid_tipo_iva().equals(-1L))) {facturadiarioBean.setid_tipo_iva(facturadiarioLocal.getid_tipo_iva());}
			if(conDefault || (!conDefault && facturadiarioLocal.getfecha_emision()!=null && !facturadiarioLocal.getfecha_emision().equals(new Date()))) {facturadiarioBean.setfecha_emision(facturadiarioLocal.getfecha_emision());}
			if(conDefault || (!conDefault && facturadiarioLocal.getfecha_vencimiento()!=null && !facturadiarioLocal.getfecha_vencimiento().equals(new Date()))) {facturadiarioBean.setfecha_vencimiento(facturadiarioLocal.getfecha_vencimiento());}
			if(conDefault || (!conDefault && facturadiarioLocal.getnumero_serie()!=null && !facturadiarioLocal.getnumero_serie().equals(""))) {facturadiarioBean.setnumero_serie(facturadiarioLocal.getnumero_serie());}
			if(conDefault || (!conDefault && facturadiarioLocal.getruc()!=null && !facturadiarioLocal.getruc().equals(""))) {facturadiarioBean.setruc(facturadiarioLocal.getruc());}
			if(conDefault || (!conDefault && facturadiarioLocal.getnumero_autoriza()!=null && !facturadiarioLocal.getnumero_autoriza().equals(""))) {facturadiarioBean.setnumero_autoriza(facturadiarioLocal.getnumero_autoriza());}
			if(conDefault || (!conDefault && facturadiarioLocal.getes_devolucion()!=null && !facturadiarioLocal.getes_devolucion().equals(false))) {facturadiarioBean.setes_devolucion(facturadiarioLocal.getes_devolucion());}
			if(conDefault || (!conDefault && facturadiarioLocal.getvalor_factura()!=null && !facturadiarioLocal.getvalor_factura().equals(0.0))) {facturadiarioBean.setvalor_factura(facturadiarioLocal.getvalor_factura());}
			if(conDefault || (!conDefault && facturadiarioLocal.getbase_imponible()!=null && !facturadiarioLocal.getbase_imponible().equals(0.0))) {facturadiarioBean.setbase_imponible(facturadiarioLocal.getbase_imponible());}
			if(conDefault || (!conDefault && facturadiarioLocal.getmonto_iva()!=null && !facturadiarioLocal.getmonto_iva().equals(0.0))) {facturadiarioBean.setmonto_iva(facturadiarioLocal.getmonto_iva());}
			if(conDefault || (!conDefault && facturadiarioLocal.getbim_tarjeta()!=null && !facturadiarioLocal.getbim_tarjeta().equals(0.0))) {facturadiarioBean.setbim_tarjeta(facturadiarioLocal.getbim_tarjeta());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FacturaDiarioConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxFacturaDiarioGenerico(Long idFacturaDiarioSeleccionado,JComboBox jComboBoxFacturaDiario,List<FacturaDiario> facturadiariosLocal)throws Exception {
		try {
			FacturaDiario  facturadiarioTemp=null;

			for(FacturaDiario facturadiarioAux:facturadiariosLocal) {
				if(facturadiarioAux.getId()!=null && facturadiarioAux.getId().equals(idFacturaDiarioSeleccionado)) {
					facturadiarioTemp=facturadiarioAux;
					break;
				}
			}

			jComboBoxFacturaDiario.setSelectedItem(facturadiarioTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxFacturaDiarioGenerico(JComboBox jComboBoxFacturaDiario,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxFacturaDiario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxFacturaDiario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxFacturaDiario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxFacturaDiario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxFacturaDiario.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxFacturaDiario.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxFacturaDiario.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxFacturaDiario.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxFacturaDiario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxFacturaDiario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,FacturaDiarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			facturadiario=(FacturaDiario) facturadiarioLogic.getFacturaDiarios().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			facturadiario =(FacturaDiario) facturadiarios.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!facturadiario.getIsNew() && !facturadiario.getIsChanged() && !facturadiario.getIsDeleted()) {
				sDescripcion=facturadiario.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=facturadiario.getempresa_descripcion();
			}
		}

		if(sTipo.equals("Sucursal")) {
			//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
			if(!facturadiario.getIsNew() && !facturadiario.getIsChanged() && !facturadiario.getIsDeleted()) {
				sDescripcion=facturadiario.getsucursal_descripcion();
			} else {
				//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
				sDescripcion=facturadiario.getsucursal_descripcion();
			}
		}

		if(sTipo.equals("Cliente")) {
			//sDescripcion=this.getActualClienteForeignKeyDescripcion((Long)value);
			if(!facturadiario.getIsNew() && !facturadiario.getIsChanged() && !facturadiario.getIsDeleted()) {
				sDescripcion=facturadiario.getcliente_descripcion();
			} else {
				//sDescripcion=this.getActualClienteForeignKeyDescripcion((Long)value);
				sDescripcion=facturadiario.getcliente_descripcion();
			}
		}

		if(sTipo.equals("PeriodoDeclara")) {
			//sDescripcion=this.getActualPeriodoDeclaraForeignKeyDescripcion((Long)value);
			if(!facturadiario.getIsNew() && !facturadiario.getIsChanged() && !facturadiario.getIsDeleted()) {
				sDescripcion=facturadiario.getperiododeclara_descripcion();
			} else {
				//sDescripcion=this.getActualPeriodoDeclaraForeignKeyDescripcion((Long)value);
				sDescripcion=facturadiario.getperiododeclara_descripcion();
			}
		}

		if(sTipo.equals("TipoIva")) {
			//sDescripcion=this.getActualTipoIvaForeignKeyDescripcion((Long)value);
			if(!facturadiario.getIsNew() && !facturadiario.getIsChanged() && !facturadiario.getIsDeleted()) {
				sDescripcion=facturadiario.gettipoiva_descripcion();
			} else {
				//sDescripcion=this.getActualTipoIvaForeignKeyDescripcion((Long)value);
				sDescripcion=facturadiario.gettipoiva_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		FacturaDiario facturadiarioRow=new FacturaDiario();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			facturadiarioRow=(FacturaDiario) facturadiarioLogic.getFacturaDiarios().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			facturadiarioRow=(FacturaDiario) facturadiarios.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualFacturaDiario(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoFacturaDiario.setVisible((this.isVisibilidadCeldaNuevoFacturaDiario && this.isPermisoNuevoFacturaDiario));			
			this.jButtonDuplicarFacturaDiario.setVisible((this.isVisibilidadCeldaDuplicarFacturaDiario && this.isPermisoDuplicarFacturaDiario));			
			this.jButtonCopiarFacturaDiario.setVisible((this.isVisibilidadCeldaCopiarFacturaDiario && this.isPermisoCopiarFacturaDiario));
			this.jButtonVerFormFacturaDiario.setVisible((this.isVisibilidadCeldaVerFormFacturaDiario && this.isPermisoVerFormFacturaDiario));
			
			this.jButtonAbrirOrderByFacturaDiario.setVisible((this.isVisibilidadCeldaOrdenFacturaDiario && this.isPermisoOrdenFacturaDiario));			
			
			this.jButtonNuevoRelacionesFacturaDiario.setVisible((this.isVisibilidadCeldaNuevoRelacionesFacturaDiario && this.isPermisoNuevoFacturaDiario));			
			this.jButtonNuevoGuardarCambiosFacturaDiario.setVisible((this.isVisibilidadCeldaNuevoFacturaDiario && this.isPermisoNuevoFacturaDiario && this.isPermisoGuardarCambiosFacturaDiario));
			
			if(this.jInternalFrameDetalleFormFacturaDiario!=null) {
			this.jInternalFrameDetalleFormFacturaDiario.jButtonModificarFacturaDiario.setVisible((this.isVisibilidadCeldaModificarFacturaDiario && this.isPermisoActualizarFacturaDiario));	
			this.jInternalFrameDetalleFormFacturaDiario.jButtonActualizarFacturaDiario.setVisible((this.isVisibilidadCeldaActualizarFacturaDiario && this.isPermisoActualizarFacturaDiario));	
			this.jInternalFrameDetalleFormFacturaDiario.jButtonEliminarFacturaDiario.setVisible((this.isVisibilidadCeldaEliminarFacturaDiario && this.isPermisoEliminarFacturaDiario));
			this.jInternalFrameDetalleFormFacturaDiario.jButtonCancelarFacturaDiario.setVisible(this.isVisibilidadCeldaCancelarFacturaDiario);							
			this.jInternalFrameDetalleFormFacturaDiario.jButtonGuardarCambiosFacturaDiario.setVisible((this.isVisibilidadCeldaGuardarFacturaDiario && this.isPermisoGuardarCambiosFacturaDiario));			
			
			}
						
			this.jButtonGuardarCambiosTablaFacturaDiario.setVisible((this.isVisibilidadCeldaGuardarCambiosFacturaDiario && this.isPermisoGuardarCambiosFacturaDiario));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarFacturaDiario.setVisible((this.isVisibilidadCeldaNuevoFacturaDiario && this.isPermisoNuevoFacturaDiario));						
			this.jButtonDuplicarToolBarFacturaDiario.setVisible((this.isVisibilidadCeldaDuplicarFacturaDiario && this.isPermisoDuplicarFacturaDiario));						
			this.jButtonCopiarToolBarFacturaDiario.setVisible((this.isVisibilidadCeldaCopiarFacturaDiario && this.isPermisoCopiarFacturaDiario));			
			this.jButtonVerFormToolBarFacturaDiario.setVisible((this.isVisibilidadCeldaVerFormFacturaDiario && this.isPermisoVerFormFacturaDiario));			
			this.jButtonAbrirOrderByToolBarFacturaDiario.setVisible((this.isVisibilidadCeldaOrdenFacturaDiario && this.isPermisoOrdenFacturaDiario));
			this.jButtonNuevoRelacionesToolBarFacturaDiario.setVisible((this.isVisibilidadCeldaNuevoRelacionesFacturaDiario && this.isPermisoNuevoFacturaDiario));			
			this.jButtonNuevoGuardarCambiosToolBarFacturaDiario.setVisible((this.isVisibilidadCeldaNuevoFacturaDiario && this.isPermisoNuevoFacturaDiario && this.isPermisoGuardarCambiosFacturaDiario));			
			
			if(this.jInternalFrameDetalleFormFacturaDiario!=null) {
			this.jInternalFrameDetalleFormFacturaDiario.jButtonModificarToolBarFacturaDiario.setVisible((this.isVisibilidadCeldaModificarFacturaDiario && this.isPermisoActualizarFacturaDiario));	
			this.jInternalFrameDetalleFormFacturaDiario.jButtonActualizarToolBarFacturaDiario.setVisible((this.isVisibilidadCeldaActualizarFacturaDiario  && this.isPermisoActualizarFacturaDiario));	
			this.jInternalFrameDetalleFormFacturaDiario.jButtonEliminarToolBarFacturaDiario.setVisible((this.isVisibilidadCeldaEliminarFacturaDiario && this.isPermisoEliminarFacturaDiario));
			this.jInternalFrameDetalleFormFacturaDiario.jButtonCancelarToolBarFacturaDiario.setVisible(this.isVisibilidadCeldaCancelarFacturaDiario);				
			this.jInternalFrameDetalleFormFacturaDiario.jButtonGuardarCambiosToolBarFacturaDiario.setVisible((this.isVisibilidadCeldaGuardarFacturaDiario && this.isPermisoGuardarCambiosFacturaDiario));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarFacturaDiario.setVisible((this.isVisibilidadCeldaGuardarCambiosFacturaDiario && this.isPermisoGuardarCambiosFacturaDiario));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoFacturaDiario.setVisible((this.isVisibilidadCeldaNuevoFacturaDiario && this.isPermisoNuevoFacturaDiario));			
			this.jMenuItemDuplicarFacturaDiario.setVisible((this.isVisibilidadCeldaDuplicarFacturaDiario && this.isPermisoDuplicarFacturaDiario));			
			this.jMenuItemCopiarFacturaDiario.setVisible((this.isVisibilidadCeldaCopiarFacturaDiario && this.isPermisoCopiarFacturaDiario));			
			this.jMenuItemVerFormFacturaDiario.setVisible((this.isVisibilidadCeldaVerFormFacturaDiario && this.isPermisoVerFormFacturaDiario));			
			this.jMenuItemAbrirOrderByFacturaDiario.setVisible((this.isVisibilidadCeldaOrdenFacturaDiario && this.isPermisoOrdenFacturaDiario));			
			//this.jMenuItemMostrarOcultarFacturaDiario.setVisible((this.isVisibilidadCeldaOrdenFacturaDiario && this.isPermisoOrdenFacturaDiario));
			this.jMenuItemDetalleAbrirOrderByFacturaDiario.setVisible((this.isVisibilidadCeldaOrdenFacturaDiario && this.isPermisoOrdenFacturaDiario));			
			//this.jMenuItemDetalleMostrarOcultarFacturaDiario.setVisible((this.isVisibilidadCeldaOrdenFacturaDiario && this.isPermisoOrdenFacturaDiario));			
			this.jMenuItemNuevoRelacionesFacturaDiario.setVisible((this.isVisibilidadCeldaNuevoRelacionesFacturaDiario && this.isPermisoNuevoFacturaDiario));			
			this.jMenuItemNuevoGuardarCambiosFacturaDiario.setVisible((this.isVisibilidadCeldaNuevoFacturaDiario && this.isPermisoNuevoFacturaDiario && this.isPermisoGuardarCambiosFacturaDiario));									
			
			if(this.jInternalFrameDetalleFormFacturaDiario!=null) {
			this.jInternalFrameDetalleFormFacturaDiario.jMenuItemModificarFacturaDiario.setVisible((this.isVisibilidadCeldaModificarFacturaDiario && this.isPermisoActualizarFacturaDiario));	
			this.jInternalFrameDetalleFormFacturaDiario.jMenuItemActualizarFacturaDiario.setVisible((this.isVisibilidadCeldaActualizarFacturaDiario && this.isPermisoActualizarFacturaDiario));	
			this.jInternalFrameDetalleFormFacturaDiario.jMenuItemEliminarFacturaDiario.setVisible((this.isVisibilidadCeldaEliminarFacturaDiario && this.isPermisoEliminarFacturaDiario));
			this.jInternalFrameDetalleFormFacturaDiario.jMenuItemCancelarFacturaDiario.setVisible(this.isVisibilidadCeldaCancelarFacturaDiario);				
			}
			
			this.jMenuItemGuardarCambiosFacturaDiario.setVisible((this.isVisibilidadCeldaGuardarFacturaDiario && this.isPermisoGuardarCambiosFacturaDiario));						
			this.jMenuItemGuardarCambiosTablaFacturaDiario.setVisible((this.isVisibilidadCeldaGuardarCambiosFacturaDiario && this.isPermisoGuardarCambiosFacturaDiario));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoFacturaDiario=this.jButtonNuevoFacturaDiario.isVisible();
			this.isVisibilidadCeldaDuplicarFacturaDiario=this.jButtonDuplicarFacturaDiario.isVisible();
			this.isVisibilidadCeldaCopiarFacturaDiario=this.jButtonCopiarFacturaDiario.isVisible();
			this.isVisibilidadCeldaVerFormFacturaDiario=this.jButtonVerFormFacturaDiario.isVisible();
			
			this.isVisibilidadCeldaOrdenFacturaDiario=this.jButtonAbrirOrderByFacturaDiario.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesFacturaDiario=this.jButtonNuevoRelacionesFacturaDiario.isVisible();
			this.isVisibilidadCeldaModificarFacturaDiario=this.jButtonModificarFacturaDiario.isVisible();
			
			if(this.jInternalFrameDetalleFormFacturaDiario!=null) {
			this.isVisibilidadCeldaActualizarFacturaDiario=this.jInternalFrameDetalleFormFacturaDiario.jButtonActualizarFacturaDiario.isVisible();
			this.isVisibilidadCeldaEliminarFacturaDiario=this.jInternalFrameDetalleFormFacturaDiario.jButtonEliminarFacturaDiario.isVisible();
			this.isVisibilidadCeldaCancelarFacturaDiario=this.jInternalFrameDetalleFormFacturaDiario.jButtonCancelarFacturaDiario.isVisible();
			this.isVisibilidadCeldaGuardarFacturaDiario=this.jInternalFrameDetalleFormFacturaDiario.jButtonGuardarCambiosFacturaDiario.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosFacturaDiario=this.jButtonGuardarCambiosTablaFacturaDiario.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoFacturaDiario=this.jButtonNuevoToolBarFacturaDiario.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesFacturaDiario=this.jButtonNuevoRelacionesToolBarFacturaDiario.isVisible();
			
			if(this.jInternalFrameDetalleFormFacturaDiario!=null) {
			this.isVisibilidadCeldaModificarFacturaDiario=this.jInternalFrameDetalleFormFacturaDiario.jButtonModificarToolBarFacturaDiario.isVisible();
			this.isVisibilidadCeldaActualizarFacturaDiario=this.jInternalFrameDetalleFormFacturaDiario.jButtonActualizarToolBarFacturaDiario.isVisible();
			this.isVisibilidadCeldaEliminarFacturaDiario=this.jInternalFrameDetalleFormFacturaDiario.jButtonEliminarToolBarFacturaDiario.isVisible();
			this.isVisibilidadCeldaCancelarFacturaDiario=this.jInternalFrameDetalleFormFacturaDiario.jButtonCancelarToolBarFacturaDiario.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarFacturaDiario=this.jButtonGuardarCambiosToolBarFacturaDiario.isVisible();
			this.isVisibilidadCeldaGuardarCambiosFacturaDiario=this.jButtonGuardarCambiosTablaToolBarFacturaDiario.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoFacturaDiario=this.jMenuItemNuevoFacturaDiario.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesFacturaDiario=this.jMenuItemNuevoRelacionesFacturaDiario.isVisible();
			
			if(this.jInternalFrameDetalleFormFacturaDiario!=null) {
			this.isVisibilidadCeldaModificarFacturaDiario=this.jInternalFrameDetalleFormFacturaDiario.jMenuItemModificarFacturaDiario.isVisible();
			this.isVisibilidadCeldaActualizarFacturaDiario=this.jInternalFrameDetalleFormFacturaDiario.jMenuItemActualizarFacturaDiario.isVisible();
			this.isVisibilidadCeldaEliminarFacturaDiario=this.jInternalFrameDetalleFormFacturaDiario.jMenuItemEliminarFacturaDiario.isVisible();
			this.isVisibilidadCeldaCancelarFacturaDiario=this.jInternalFrameDetalleFormFacturaDiario.jMenuItemCancelarFacturaDiario.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarFacturaDiario=this.jMenuItemGuardarCambiosFacturaDiario.isVisible();
			this.isVisibilidadCeldaGuardarCambiosFacturaDiario=this.jMenuItemGuardarCambiosTablaFacturaDiario.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesFacturaDiario(Boolean esInicializar) {
		if(FacturaDiarioJInternalFrame.ISBINDING_MANUAL) {			
			if(this.facturadiarioSessionBean.getConGuardarRelaciones()) {
				//if(this.facturadiarioSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesFacturaDiario();
			}
			
			this.inicializarActualizarBindingBotonesManualFacturaDiario(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualFacturaDiario() {
		this.jButtonNuevoFacturaDiario.setVisible(this.isPermisoNuevoFacturaDiario);			
		this.jButtonDuplicarFacturaDiario.setVisible(this.isPermisoDuplicarFacturaDiario);			
		this.jButtonCopiarFacturaDiario.setVisible(this.isPermisoCopiarFacturaDiario);			
		this.jButtonVerFormFacturaDiario.setVisible(this.isPermisoVerFormFacturaDiario);			
		
		this.jButtonAbrirOrderByFacturaDiario.setVisible(this.isPermisoOrdenFacturaDiario);					
		
		this.jButtonNuevoRelacionesFacturaDiario.setVisible(this.isPermisoNuevoFacturaDiario);			
		
		if(this.jInternalFrameDetalleFormFacturaDiario!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormFacturaDiario.jButtonModificarFacturaDiario.setVisible(this.isPermisoActualizarFacturaDiario);	
			this.jInternalFrameDetalleFormFacturaDiario.jButtonActualizarFacturaDiario.setVisible(this.isPermisoActualizarFacturaDiario);	
			this.jInternalFrameDetalleFormFacturaDiario.jButtonEliminarFacturaDiario.setVisible(this.isPermisoEliminarFacturaDiario);
			this.jInternalFrameDetalleFormFacturaDiario.jButtonCancelarFacturaDiario.setVisible(this.isVisibilidadCeldaCancelarFacturaDiario);						
			this.jInternalFrameDetalleFormFacturaDiario.jButtonGuardarCambiosFacturaDiario.setVisible(this.isPermisoGuardarCambiosFacturaDiario);							
		}
		
		this.jButtonGuardarCambiosTablaFacturaDiario.setVisible(this.isPermisoActualizarFacturaDiario);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleFacturaDiario() {
		this.jInternalFrameDetalleFormFacturaDiario.jButtonModificarFacturaDiario.setVisible(this.isPermisoActualizarFacturaDiario);	
		this.jInternalFrameDetalleFormFacturaDiario.jButtonActualizarFacturaDiario.setVisible(this.isPermisoActualizarFacturaDiario);	
		this.jInternalFrameDetalleFormFacturaDiario.jButtonEliminarFacturaDiario.setVisible(this.isPermisoEliminarFacturaDiario);
		this.jInternalFrameDetalleFormFacturaDiario.jButtonCancelarFacturaDiario.setVisible(this.isVisibilidadCeldaCancelarFacturaDiario);							
		this.jInternalFrameDetalleFormFacturaDiario.jButtonGuardarCambiosFacturaDiario.setVisible((this.isVisibilidadCeldaGuardarFacturaDiario && this.isPermisoGuardarCambiosFacturaDiario));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosFacturaDiario() {
		if(FacturaDiarioJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualFacturaDiario();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesFacturaDiario() {
	}
	
	public void jTableDatosFacturaDiarioListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarFacturaDiario(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FacturaDiarioConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidFacturaDiarioBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturadiarioLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosFacturaDiario.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualFacturaDiario(this.getfacturadiario(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysFacturaDiario(this.facturadiario);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.facturadiario =(FacturaDiario) this.facturadiarioLogic.getFacturaDiarios().toArray()[this.jTableDatosFacturaDiario.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.facturadiario =(FacturaDiario) this.facturadiarios.toArray()[this.jTableDatosFacturaDiario.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.facturadiario==null) {
						this.facturadiario = new FacturaDiario();
					}

					this.setVariablesFormularioToObjetoActualFacturaDiario(this.facturadiario,true);
					this.setVariablesFormularioToObjetoActualForeignKeysFacturaDiario(this.facturadiario);
				}

				if(this.facturadiario.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.facturadiario.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingFacturaDiario(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturadiarioLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturadiarioLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,FacturaDiarioConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturadiarioLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaFacturaDiarioUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturadiarioLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebFacturaDiario(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosFacturaDiario.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosFacturaDiario.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosFacturaDiario.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturadiario =(FacturaDiario) this.facturadiarioLogic.getFacturaDiarios().toArray()[this.jTableDatosFacturaDiario.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.facturadiario =(FacturaDiario) this.facturadiarios.toArray()[this.jTableDatosFacturaDiario.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualFacturaDiario(this.getfacturadiario(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysFacturaDiario(this.facturadiario);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.facturadiarioLogic.getConnexion());

				if(this.facturadiario.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.facturadiario.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderFacturaDiario=(TitledBorder)this.jScrollPanelDatosFacturaDiario.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderFacturaDiario.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturadiarioLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturadiarioLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,FacturaDiarioConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturadiarioLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaFacturaDiarioBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturadiarioLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosFacturaDiario.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualFacturaDiario(this.getfacturadiario(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysFacturaDiario(this.facturadiario);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.facturadiario =(FacturaDiario) this.facturadiarioLogic.getFacturaDiarios().toArray()[this.jTableDatosFacturaDiario.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.facturadiario =(FacturaDiario) this.facturadiarios.toArray()[this.jTableDatosFacturaDiario.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.facturadiario==null) {
						this.facturadiario = new FacturaDiario();
					}

					this.setVariablesFormularioToObjetoActualFacturaDiario(this.facturadiario,true);
					this.setVariablesFormularioToObjetoActualForeignKeysFacturaDiario(this.facturadiario);
				}

				if(this.facturadiario.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.facturadiario.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingFacturaDiario(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturadiarioLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturadiarioLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,FacturaDiarioConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturadiarioLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_sucursalFacturaDiarioUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturadiarioLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisosucursal=true;

			idTienePermisosucursal=this.tienePermisosUsuarioEnPaginaWebFacturaDiario(SucursalConstantesFunciones.CLASSNAME);

			if(idTienePermisosucursal) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosFacturaDiario.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosFacturaDiario.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosFacturaDiario.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturadiario =(FacturaDiario) this.facturadiarioLogic.getFacturaDiarios().toArray()[this.jTableDatosFacturaDiario.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.facturadiario =(FacturaDiario) this.facturadiarios.toArray()[this.jTableDatosFacturaDiario.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualFacturaDiario(this.getfacturadiario(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysFacturaDiario(this.facturadiario);

				this.sucursalBeanSwingJInternalFrame=new SucursalBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.sucursalBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.sucursalBeanSwingJInternalFrame.getSucursalLogic().setConnexion(this.facturadiarioLogic.getConnexion());

				if(this.facturadiario.getid_sucursal()!=null) {
					this.sucursalBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.sucursalBeanSwingJInternalFrame.setIdActual(this.facturadiario.getid_sucursal());
					this.sucursalBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.inicializarActualizarBindingTablaSucursal();
				}

				JInternalFrameBase jinternalFrame =this.sucursalBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderFacturaDiario=(TitledBorder)this.jScrollPanelDatosFacturaDiario.getBorder();
				TitledBorder titledBordersucursal=(TitledBorder)this.sucursalBeanSwingJInternalFrame.jScrollPanelDatosSucursal.getBorder();

				titledBordersucursal.setTitle(titledBorderFacturaDiario.getTitle() + " -> Sucursal");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturadiarioLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturadiarioLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,FacturaDiarioConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturadiarioLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_sucursalFacturaDiarioBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturadiarioLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosFacturaDiario.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualFacturaDiario(this.getfacturadiario(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysFacturaDiario(this.facturadiario);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.facturadiario =(FacturaDiario) this.facturadiarioLogic.getFacturaDiarios().toArray()[this.jTableDatosFacturaDiario.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.facturadiario =(FacturaDiario) this.facturadiarios.toArray()[this.jTableDatosFacturaDiario.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.facturadiario==null) {
						this.facturadiario = new FacturaDiario();
					}

					this.setVariablesFormularioToObjetoActualFacturaDiario(this.facturadiario,true);
					this.setVariablesFormularioToObjetoActualForeignKeysFacturaDiario(this.facturadiario);
				}

				if(this.facturadiario.getid_sucursal()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_sucursal = "+this.facturadiario.getid_sucursal().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingFacturaDiario(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturadiarioLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturadiarioLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,FacturaDiarioConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturadiarioLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_clienteFacturaDiarioActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
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


			TitledBorder titledBorderFacturaDiario=null;
			TitledBorder titledBordercliente=null;

			if(!this.jScrollPanelDatosFacturaDiario.getBorder().getClass().equals(EmptyBorder.class)) {
				titledBorderFacturaDiario=(TitledBorder)this.jScrollPanelDatosFacturaDiario.getBorder();
				titledBordercliente=(TitledBorder)this.clienteBeanSwingJInternalFrame.jScrollPanelDatosCliente.getBorder();

				titledBordercliente.setTitle(titledBorderFacturaDiario.getTitle() + " -> Cliente");
			}

			if(!Constantes.CON_VARIAS_VENTANAS) {
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
			}

			this.jDesktopPane.add(jinternalFrame);

			jinternalFrame.setSelected(true);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FacturaDiarioConstantesFunciones.CLASSNAME);
		}
	}

	public void jButtonid_clienteFacturaDiarioUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturadiarioLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisocliente=true;

			idTienePermisocliente=this.tienePermisosUsuarioEnPaginaWebFacturaDiario(ClienteConstantesFunciones.CLASSNAME);

			if(idTienePermisocliente) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosFacturaDiario.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosFacturaDiario.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosFacturaDiario.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturadiario =(FacturaDiario) this.facturadiarioLogic.getFacturaDiarios().toArray()[this.jTableDatosFacturaDiario.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.facturadiario =(FacturaDiario) this.facturadiarios.toArray()[this.jTableDatosFacturaDiario.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualFacturaDiario(this.getfacturadiario(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysFacturaDiario(this.facturadiario);

				this.clienteBeanSwingJInternalFrame=new ClienteBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.clienteBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.clienteBeanSwingJInternalFrame.getClienteLogic().setConnexion(this.facturadiarioLogic.getConnexion());

				if(this.facturadiario.getid_cliente()!=null) {
					this.clienteBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.clienteBeanSwingJInternalFrame.setIdActual(this.facturadiario.getid_cliente());
					this.clienteBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.clienteBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.clienteBeanSwingJInternalFrame.inicializarActualizarBindingTablaCliente();
				}

				JInternalFrameBase jinternalFrame =this.clienteBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderFacturaDiario=(TitledBorder)this.jScrollPanelDatosFacturaDiario.getBorder();
				TitledBorder titledBordercliente=(TitledBorder)this.clienteBeanSwingJInternalFrame.jScrollPanelDatosCliente.getBorder();

				titledBordercliente.setTitle(titledBorderFacturaDiario.getTitle() + " -> Cliente");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturadiarioLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturadiarioLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,FacturaDiarioConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturadiarioLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_clienteFacturaDiarioBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturadiarioLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosFacturaDiario.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualFacturaDiario(this.getfacturadiario(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysFacturaDiario(this.facturadiario);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.facturadiario =(FacturaDiario) this.facturadiarioLogic.getFacturaDiarios().toArray()[this.jTableDatosFacturaDiario.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.facturadiario =(FacturaDiario) this.facturadiarios.toArray()[this.jTableDatosFacturaDiario.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.facturadiario==null) {
						this.facturadiario = new FacturaDiario();
					}

					this.setVariablesFormularioToObjetoActualFacturaDiario(this.facturadiario,true);
					this.setVariablesFormularioToObjetoActualForeignKeysFacturaDiario(this.facturadiario);
				}

				if(this.facturadiario.getid_cliente()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_cliente = "+this.facturadiario.getid_cliente().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingFacturaDiario(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturadiarioLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturadiarioLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,FacturaDiarioConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturadiarioLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_periodo_declaraFacturaDiarioUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturadiarioLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoperiododeclara=true;

			idTienePermisoperiododeclara=this.tienePermisosUsuarioEnPaginaWebFacturaDiario(PeriodoDeclaraConstantesFunciones.CLASSNAME);

			if(idTienePermisoperiododeclara) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosFacturaDiario.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosFacturaDiario.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosFacturaDiario.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturadiario =(FacturaDiario) this.facturadiarioLogic.getFacturaDiarios().toArray()[this.jTableDatosFacturaDiario.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.facturadiario =(FacturaDiario) this.facturadiarios.toArray()[this.jTableDatosFacturaDiario.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualFacturaDiario(this.getfacturadiario(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysFacturaDiario(this.facturadiario);

				this.periododeclaraBeanSwingJInternalFrame=new PeriodoDeclaraBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.periododeclaraBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.periododeclaraBeanSwingJInternalFrame.getPeriodoDeclaraLogic().setConnexion(this.facturadiarioLogic.getConnexion());

				if(this.facturadiario.getid_periodo_declara()!=null) {
					this.periododeclaraBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.periododeclaraBeanSwingJInternalFrame.setIdActual(this.facturadiario.getid_periodo_declara());
					this.periododeclaraBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.periododeclaraBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.periododeclaraBeanSwingJInternalFrame.inicializarActualizarBindingTablaPeriodoDeclara();
				}

				JInternalFrameBase jinternalFrame =this.periododeclaraBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderFacturaDiario=(TitledBorder)this.jScrollPanelDatosFacturaDiario.getBorder();
				TitledBorder titledBorderperiododeclara=(TitledBorder)this.periododeclaraBeanSwingJInternalFrame.jScrollPanelDatosPeriodoDeclara.getBorder();

				titledBorderperiododeclara.setTitle(titledBorderFacturaDiario.getTitle() + " -> Periodo Declara");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturadiarioLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturadiarioLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,FacturaDiarioConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturadiarioLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_periodo_declaraFacturaDiarioBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturadiarioLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosFacturaDiario.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualFacturaDiario(this.getfacturadiario(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysFacturaDiario(this.facturadiario);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.facturadiario =(FacturaDiario) this.facturadiarioLogic.getFacturaDiarios().toArray()[this.jTableDatosFacturaDiario.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.facturadiario =(FacturaDiario) this.facturadiarios.toArray()[this.jTableDatosFacturaDiario.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.facturadiario==null) {
						this.facturadiario = new FacturaDiario();
					}

					this.setVariablesFormularioToObjetoActualFacturaDiario(this.facturadiario,true);
					this.setVariablesFormularioToObjetoActualForeignKeysFacturaDiario(this.facturadiario);
				}

				if(this.facturadiario.getid_periodo_declara()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_periodo_declara = "+this.facturadiario.getid_periodo_declara().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingFacturaDiario(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturadiarioLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturadiarioLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,FacturaDiarioConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturadiarioLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_tipo_ivaFacturaDiarioUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturadiarioLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisotipoiva=true;

			idTienePermisotipoiva=this.tienePermisosUsuarioEnPaginaWebFacturaDiario(TipoIvaConstantesFunciones.CLASSNAME);

			if(idTienePermisotipoiva) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosFacturaDiario.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosFacturaDiario.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosFacturaDiario.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturadiario =(FacturaDiario) this.facturadiarioLogic.getFacturaDiarios().toArray()[this.jTableDatosFacturaDiario.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.facturadiario =(FacturaDiario) this.facturadiarios.toArray()[this.jTableDatosFacturaDiario.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualFacturaDiario(this.getfacturadiario(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysFacturaDiario(this.facturadiario);

				this.tipoivaBeanSwingJInternalFrame=new TipoIvaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.tipoivaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.tipoivaBeanSwingJInternalFrame.getTipoIvaLogic().setConnexion(this.facturadiarioLogic.getConnexion());

				if(this.facturadiario.getid_tipo_iva()!=null) {
					this.tipoivaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.tipoivaBeanSwingJInternalFrame.setIdActual(this.facturadiario.getid_tipo_iva());
					this.tipoivaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.tipoivaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.tipoivaBeanSwingJInternalFrame.inicializarActualizarBindingTablaTipoIva();
				}

				JInternalFrameBase jinternalFrame =this.tipoivaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderFacturaDiario=(TitledBorder)this.jScrollPanelDatosFacturaDiario.getBorder();
				TitledBorder titledBordertipoiva=(TitledBorder)this.tipoivaBeanSwingJInternalFrame.jScrollPanelDatosTipoIva.getBorder();

				titledBordertipoiva.setTitle(titledBorderFacturaDiario.getTitle() + " -> Tipo Iva");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturadiarioLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturadiarioLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,FacturaDiarioConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturadiarioLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_tipo_ivaFacturaDiarioBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturadiarioLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosFacturaDiario.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualFacturaDiario(this.getfacturadiario(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysFacturaDiario(this.facturadiario);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.facturadiario =(FacturaDiario) this.facturadiarioLogic.getFacturaDiarios().toArray()[this.jTableDatosFacturaDiario.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.facturadiario =(FacturaDiario) this.facturadiarios.toArray()[this.jTableDatosFacturaDiario.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.facturadiario==null) {
						this.facturadiario = new FacturaDiario();
					}

					this.setVariablesFormularioToObjetoActualFacturaDiario(this.facturadiario,true);
					this.setVariablesFormularioToObjetoActualForeignKeysFacturaDiario(this.facturadiario);
				}

				if(this.facturadiario.getid_tipo_iva()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_tipo_iva = "+this.facturadiario.getid_tipo_iva().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingFacturaDiario(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturadiarioLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturadiarioLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,FacturaDiarioConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturadiarioLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_emisionFacturaDiarioBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturadiarioLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosFacturaDiario.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualFacturaDiario(this.getfacturadiario(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysFacturaDiario(this.facturadiario);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.facturadiario =(FacturaDiario) this.facturadiarioLogic.getFacturaDiarios().toArray()[this.jTableDatosFacturaDiario.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.facturadiario =(FacturaDiario) this.facturadiarios.toArray()[this.jTableDatosFacturaDiario.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.facturadiario==null) {
						this.facturadiario = new FacturaDiario();
					}

					this.setVariablesFormularioToObjetoActualFacturaDiario(this.facturadiario,true);
					this.setVariablesFormularioToObjetoActualForeignKeysFacturaDiario(this.facturadiario);
				}

				if(this.facturadiario.getfecha_emision()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_emision = '"+Funciones2.getStringPostgresDate(this.facturadiario.getfecha_emision())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingFacturaDiario(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturadiarioLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturadiarioLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,FacturaDiarioConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturadiarioLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_vencimientoFacturaDiarioBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturadiarioLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosFacturaDiario.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualFacturaDiario(this.getfacturadiario(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysFacturaDiario(this.facturadiario);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.facturadiario =(FacturaDiario) this.facturadiarioLogic.getFacturaDiarios().toArray()[this.jTableDatosFacturaDiario.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.facturadiario =(FacturaDiario) this.facturadiarios.toArray()[this.jTableDatosFacturaDiario.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.facturadiario==null) {
						this.facturadiario = new FacturaDiario();
					}

					this.setVariablesFormularioToObjetoActualFacturaDiario(this.facturadiario,true);
					this.setVariablesFormularioToObjetoActualForeignKeysFacturaDiario(this.facturadiario);
				}

				if(this.facturadiario.getfecha_vencimiento()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_vencimiento = '"+Funciones2.getStringPostgresDate(this.facturadiario.getfecha_vencimiento())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingFacturaDiario(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturadiarioLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturadiarioLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,FacturaDiarioConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturadiarioLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnumero_serieFacturaDiarioBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturadiarioLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosFacturaDiario.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualFacturaDiario(this.getfacturadiario(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysFacturaDiario(this.facturadiario);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.facturadiario =(FacturaDiario) this.facturadiarioLogic.getFacturaDiarios().toArray()[this.jTableDatosFacturaDiario.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.facturadiario =(FacturaDiario) this.facturadiarios.toArray()[this.jTableDatosFacturaDiario.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.facturadiario==null) {
						this.facturadiario = new FacturaDiario();
					}

					this.setVariablesFormularioToObjetoActualFacturaDiario(this.facturadiario,true);
					this.setVariablesFormularioToObjetoActualForeignKeysFacturaDiario(this.facturadiario);
				}

				if(this.facturadiario.getnumero_serie()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where numero_serie like '%"+this.facturadiario.getnumero_serie()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingFacturaDiario(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturadiarioLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturadiarioLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,FacturaDiarioConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturadiarioLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonrucFacturaDiarioBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturadiarioLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosFacturaDiario.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualFacturaDiario(this.getfacturadiario(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysFacturaDiario(this.facturadiario);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.facturadiario =(FacturaDiario) this.facturadiarioLogic.getFacturaDiarios().toArray()[this.jTableDatosFacturaDiario.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.facturadiario =(FacturaDiario) this.facturadiarios.toArray()[this.jTableDatosFacturaDiario.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.facturadiario==null) {
						this.facturadiario = new FacturaDiario();
					}

					this.setVariablesFormularioToObjetoActualFacturaDiario(this.facturadiario,true);
					this.setVariablesFormularioToObjetoActualForeignKeysFacturaDiario(this.facturadiario);
				}

				if(this.facturadiario.getruc()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where ruc like '%"+this.facturadiario.getruc()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingFacturaDiario(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturadiarioLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturadiarioLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,FacturaDiarioConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturadiarioLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnumero_autorizaFacturaDiarioBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturadiarioLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosFacturaDiario.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualFacturaDiario(this.getfacturadiario(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysFacturaDiario(this.facturadiario);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.facturadiario =(FacturaDiario) this.facturadiarioLogic.getFacturaDiarios().toArray()[this.jTableDatosFacturaDiario.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.facturadiario =(FacturaDiario) this.facturadiarios.toArray()[this.jTableDatosFacturaDiario.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.facturadiario==null) {
						this.facturadiario = new FacturaDiario();
					}

					this.setVariablesFormularioToObjetoActualFacturaDiario(this.facturadiario,true);
					this.setVariablesFormularioToObjetoActualForeignKeysFacturaDiario(this.facturadiario);
				}

				if(this.facturadiario.getnumero_autoriza()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where numero_autoriza like '%"+this.facturadiario.getnumero_autoriza()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingFacturaDiario(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturadiarioLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturadiarioLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,FacturaDiarioConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturadiarioLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtones_devolucionFacturaDiarioBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturadiarioLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosFacturaDiario.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualFacturaDiario(this.getfacturadiario(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysFacturaDiario(this.facturadiario);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.facturadiario =(FacturaDiario) this.facturadiarioLogic.getFacturaDiarios().toArray()[this.jTableDatosFacturaDiario.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.facturadiario =(FacturaDiario) this.facturadiarios.toArray()[this.jTableDatosFacturaDiario.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.facturadiario==null) {
						this.facturadiario = new FacturaDiario();
					}

					this.setVariablesFormularioToObjetoActualFacturaDiario(this.facturadiario,true);
					this.setVariablesFormularioToObjetoActualForeignKeysFacturaDiario(this.facturadiario);
				}

				if(this.facturadiario.getes_devolucion()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where es_devolucion = "+this.facturadiario.getes_devolucion().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingFacturaDiario(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturadiarioLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturadiarioLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,FacturaDiarioConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturadiarioLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonvalor_facturaFacturaDiarioBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturadiarioLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosFacturaDiario.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualFacturaDiario(this.getfacturadiario(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysFacturaDiario(this.facturadiario);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.facturadiario =(FacturaDiario) this.facturadiarioLogic.getFacturaDiarios().toArray()[this.jTableDatosFacturaDiario.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.facturadiario =(FacturaDiario) this.facturadiarios.toArray()[this.jTableDatosFacturaDiario.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.facturadiario==null) {
						this.facturadiario = new FacturaDiario();
					}

					this.setVariablesFormularioToObjetoActualFacturaDiario(this.facturadiario,true);
					this.setVariablesFormularioToObjetoActualForeignKeysFacturaDiario(this.facturadiario);
				}

				if(this.facturadiario.getvalor_factura()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where valor_factura = "+this.facturadiario.getvalor_factura().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingFacturaDiario(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturadiarioLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturadiarioLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,FacturaDiarioConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturadiarioLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonbase_imponibleFacturaDiarioBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturadiarioLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosFacturaDiario.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualFacturaDiario(this.getfacturadiario(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysFacturaDiario(this.facturadiario);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.facturadiario =(FacturaDiario) this.facturadiarioLogic.getFacturaDiarios().toArray()[this.jTableDatosFacturaDiario.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.facturadiario =(FacturaDiario) this.facturadiarios.toArray()[this.jTableDatosFacturaDiario.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.facturadiario==null) {
						this.facturadiario = new FacturaDiario();
					}

					this.setVariablesFormularioToObjetoActualFacturaDiario(this.facturadiario,true);
					this.setVariablesFormularioToObjetoActualForeignKeysFacturaDiario(this.facturadiario);
				}

				if(this.facturadiario.getbase_imponible()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where base_imponible = "+this.facturadiario.getbase_imponible().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingFacturaDiario(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturadiarioLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturadiarioLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,FacturaDiarioConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturadiarioLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonmonto_ivaFacturaDiarioBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturadiarioLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosFacturaDiario.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualFacturaDiario(this.getfacturadiario(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysFacturaDiario(this.facturadiario);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.facturadiario =(FacturaDiario) this.facturadiarioLogic.getFacturaDiarios().toArray()[this.jTableDatosFacturaDiario.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.facturadiario =(FacturaDiario) this.facturadiarios.toArray()[this.jTableDatosFacturaDiario.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.facturadiario==null) {
						this.facturadiario = new FacturaDiario();
					}

					this.setVariablesFormularioToObjetoActualFacturaDiario(this.facturadiario,true);
					this.setVariablesFormularioToObjetoActualForeignKeysFacturaDiario(this.facturadiario);
				}

				if(this.facturadiario.getmonto_iva()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where monto_iva = "+this.facturadiario.getmonto_iva().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingFacturaDiario(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturadiarioLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturadiarioLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,FacturaDiarioConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturadiarioLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonbim_tarjetaFacturaDiarioBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturadiarioLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosFacturaDiario.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualFacturaDiario(this.getfacturadiario(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysFacturaDiario(this.facturadiario);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.facturadiario =(FacturaDiario) this.facturadiarioLogic.getFacturaDiarios().toArray()[this.jTableDatosFacturaDiario.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.facturadiario =(FacturaDiario) this.facturadiarios.toArray()[this.jTableDatosFacturaDiario.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.facturadiario==null) {
						this.facturadiario = new FacturaDiario();
					}

					this.setVariablesFormularioToObjetoActualFacturaDiario(this.facturadiario,true);
					this.setVariablesFormularioToObjetoActualForeignKeysFacturaDiario(this.facturadiario);
				}

				if(this.facturadiario.getbim_tarjeta()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where bim_tarjeta = "+this.facturadiario.getbim_tarjeta().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingFacturaDiario(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturadiarioLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturadiarioLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,FacturaDiarioConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturadiarioLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdClienteFacturaDiarioActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturadiarioLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingFacturaDiario(false,false);

			this.getFacturaDiariosFK_IdCliente();

			this.inicializarActualizarBindingFacturaDiario(false);

			//if(FacturaDiarioBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingFacturaDiario(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturadiarioLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturadiarioLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,FacturaDiarioConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturadiarioLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaFacturaDiarioActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturadiarioLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingFacturaDiario(false,false);

			this.getFacturaDiariosFK_IdEmpresa();

			this.inicializarActualizarBindingFacturaDiario(false);

			//if(FacturaDiarioBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingFacturaDiario(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturadiarioLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturadiarioLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,FacturaDiarioConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturadiarioLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdPeriodoDeclaraFacturaDiarioActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturadiarioLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingFacturaDiario(false,false);

			this.getFacturaDiariosFK_IdPeriodoDeclara();

			this.inicializarActualizarBindingFacturaDiario(false);

			//if(FacturaDiarioBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingFacturaDiario(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturadiarioLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturadiarioLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,FacturaDiarioConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturadiarioLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdSucursalFacturaDiarioActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturadiarioLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingFacturaDiario(false,false);

			this.getFacturaDiariosFK_IdSucursal();

			this.inicializarActualizarBindingFacturaDiario(false);

			//if(FacturaDiarioBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingFacturaDiario(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturadiarioLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturadiarioLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,FacturaDiarioConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturadiarioLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdTipoIvaFacturaDiarioActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturadiarioLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingFacturaDiario(false,false);

			this.getFacturaDiariosFK_IdTipoIva();

			this.inicializarActualizarBindingFacturaDiario(false);

			//if(FacturaDiarioBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingFacturaDiario(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturadiarioLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturadiarioLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,FacturaDiarioConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.facturadiarioLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameFacturaDiario() {
		if(this.jInternalFrameDetalleFormFacturaDiario!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormFacturaDiario!=null) {
			this.jInternalFrameDetalleFormFacturaDiario.setVisible(false);	    			
			this.jInternalFrameDetalleFormFacturaDiario.dispose();
			this.jInternalFrameDetalleFormFacturaDiario=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoFacturaDiario!=null) {
			this.jInternalFrameReporteDinamicoFacturaDiario.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoFacturaDiario.dispose();
			this.jInternalFrameReporteDinamicoFacturaDiario=null;
		}
		
		if(this.jInternalFrameImportacionFacturaDiario!=null) {
			this.jInternalFrameImportacionFacturaDiario.setVisible(false);	    			
			this.jInternalFrameImportacionFacturaDiario.dispose();
			this.jInternalFrameImportacionFacturaDiario=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessFacturaDiario();
			
			FacturaDiarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.facturadiario,new Object(),this.facturadiarioParameterGeneral,this.facturadiarioReturnGeneral);
			
			
			if(sTipo.equals("NuevoFacturaDiario")) {
				jButtonNuevoFacturaDiarioActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarFacturaDiario")) {
				jButtonDuplicarFacturaDiarioActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarFacturaDiario")) {
				jButtonCopiarFacturaDiarioActionPerformed(evt);
			} else if(sTipo.equals("VerFormFacturaDiario")) {
				jButtonVerFormFacturaDiarioActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarFacturaDiario")) {
				jButtonNuevoFacturaDiarioActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarFacturaDiario")) {
				jButtonDuplicarFacturaDiarioActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoFacturaDiario")) {
				jButtonNuevoFacturaDiarioActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarFacturaDiario")) {
				jButtonDuplicarFacturaDiarioActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesFacturaDiario")) {
				jButtonNuevoFacturaDiarioActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarFacturaDiario")) {
				jButtonNuevoFacturaDiarioActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesFacturaDiario")) {
				jButtonNuevoFacturaDiarioActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarFacturaDiario")) {
				jButtonModificarFacturaDiarioActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarFacturaDiario")) {
				jButtonModificarFacturaDiarioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarFacturaDiario")) {
				jButtonModificarFacturaDiarioActionPerformed(evt);
			} else if(sTipo.equals("ActualizarFacturaDiario")) {
				jButtonActualizarFacturaDiarioActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarFacturaDiario")) {
				jButtonActualizarFacturaDiarioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarFacturaDiario")) {
				jButtonActualizarFacturaDiarioActionPerformed(evt);
			} else if(sTipo.equals("EliminarFacturaDiario")) {
				jButtonEliminarFacturaDiarioActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarFacturaDiario")) {
				jButtonEliminarFacturaDiarioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarFacturaDiario")) {
				jButtonEliminarFacturaDiarioActionPerformed(evt);
			} else if(sTipo.equals("CancelarFacturaDiario")) {
				jButtonCancelarFacturaDiarioActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarFacturaDiario")) {
				jButtonCancelarFacturaDiarioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarFacturaDiario")) {
				jButtonCancelarFacturaDiarioActionPerformed(evt);
			} else if(sTipo.equals("CerrarFacturaDiario")) {
				jButtonCerrarFacturaDiarioActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarFacturaDiario")) {
				jButtonCerrarFacturaDiarioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarFacturaDiario")) {
				jButtonCerrarFacturaDiarioActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarFacturaDiario")) {
				jButtonMostrarOcultarFacturaDiarioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarFacturaDiario")) {
				jButtonCancelarFacturaDiarioActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosFacturaDiario")) {
				jButtonGuardarCambiosFacturaDiarioActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarFacturaDiario")) {
				jButtonGuardarCambiosFacturaDiarioActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarFacturaDiario")) {
				jButtonCopiarFacturaDiarioActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarFacturaDiario")) {
				jButtonVerFormFacturaDiarioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosFacturaDiario")) {
				jButtonGuardarCambiosFacturaDiarioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarFacturaDiario")) {
				jButtonCopiarFacturaDiarioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormFacturaDiario")) {
				jButtonVerFormFacturaDiarioActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaFacturaDiario")) {
				jButtonGuardarCambiosFacturaDiarioActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarFacturaDiario")) {
				jButtonGuardarCambiosFacturaDiarioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaFacturaDiario")) {
				jButtonGuardarCambiosFacturaDiarioActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionFacturaDiario")) {
				jButtonRecargarInformacionFacturaDiarioActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarFacturaDiario")) {
				jButtonRecargarInformacionFacturaDiarioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionFacturaDiario")) {
				jButtonRecargarInformacionFacturaDiarioActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresFacturaDiario")) {
				jButtonAnterioresFacturaDiarioActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarFacturaDiario")) {
				jButtonAnterioresFacturaDiarioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreFacturaDiario")) {
				jButtonAnterioresFacturaDiarioActionPerformed(evt);
			} else if(sTipo.equals("SiguientesFacturaDiario")) {
				jButtonSiguientesFacturaDiarioActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarFacturaDiario")) {
				jButtonSiguientesFacturaDiarioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesFacturaDiario")) {
				jButtonSiguientesFacturaDiarioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByFacturaDiario") || sTipo.equals("MenuItemDetalleAbrirOrderByFacturaDiario")) {
				jButtonAbrirOrderByFacturaDiarioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarFacturaDiario") || sTipo.equals("MenuItemDetalleMostrarOcultarFacturaDiario")) {
				jButtonMostrarOcultarFacturaDiarioActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosFacturaDiario")) {
				jButtonNuevoGuardarCambiosFacturaDiarioActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarFacturaDiario")) {
				jButtonNuevoGuardarCambiosFacturaDiarioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosFacturaDiario")) {
				jButtonNuevoGuardarCambiosFacturaDiarioActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoFacturaDiario")) {
				jButtonCerrarReporteDinamicoFacturaDiarioActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoFacturaDiario")) {
				jButtonGenerarReporteDinamicoFacturaDiarioActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoFacturaDiario")) {
				
				jButtonGenerarExcelReporteDinamicoFacturaDiarioActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionFacturaDiario")) {
				jButtonCerrarImportacionFacturaDiarioActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionFacturaDiario")) {
				
				jButtonGenerarImportacionFacturaDiarioActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionFacturaDiario")) {
				
				jButtonAbrirImportacionFacturaDiarioActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesFacturaDiario")) {
				jComboBoxTiposAccionesFacturaDiarioActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesFacturaDiario")) {
				jComboBoxTiposRelacionesFacturaDiarioActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioFacturaDiario")) {
				jComboBoxTiposAccionesFacturaDiarioActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarFacturaDiario")) {
				
				jComboBoxTiposSeleccionarFacturaDiarioActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralFacturaDiario")) {
				jTextFieldValorCampoGeneralFacturaDiarioActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByFacturaDiario")) {
				jButtonAbrirOrderByFacturaDiarioActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarFacturaDiario")) {
				jButtonAbrirOrderByFacturaDiarioActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByFacturaDiario")) {
				jButtonCerrarOrderByFacturaDiarioActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idFacturaDiarioBusqueda")) {
				this.jButtonidFacturaDiarioBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaFacturaDiarioUpdate")) {
				this.jButtonid_empresaFacturaDiarioUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaFacturaDiarioBusqueda")) {
				this.jButtonid_empresaFacturaDiarioBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalFacturaDiarioUpdate")) {
				this.jButtonid_sucursalFacturaDiarioUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalFacturaDiarioBusqueda")) {
				this.jButtonid_sucursalFacturaDiarioBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_clienteFacturaDiario")) {
				this.jButtonid_clienteFacturaDiarioActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_clienteFacturaDiarioUpdate")) {
				this.jButtonid_clienteFacturaDiarioUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_clienteFacturaDiarioBusqueda")) {
				this.jButtonid_clienteFacturaDiarioBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_periodo_declaraFacturaDiarioUpdate")) {
				this.jButtonid_periodo_declaraFacturaDiarioUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_periodo_declaraFacturaDiarioBusqueda")) {
				this.jButtonid_periodo_declaraFacturaDiarioBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_ivaFacturaDiarioUpdate")) {
				this.jButtonid_tipo_ivaFacturaDiarioUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_ivaFacturaDiarioBusqueda")) {
				this.jButtonid_tipo_ivaFacturaDiarioBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_emisionFacturaDiarioBusqueda")) {
				this.jButtonfecha_emisionFacturaDiarioBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_vencimientoFacturaDiarioBusqueda")) {
				this.jButtonfecha_vencimientoFacturaDiarioBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_serieFacturaDiarioBusqueda")) {
				this.jButtonnumero_serieFacturaDiarioBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("rucFacturaDiarioBusqueda")) {
				this.jButtonrucFacturaDiarioBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_autorizaFacturaDiarioBusqueda")) {
				this.jButtonnumero_autorizaFacturaDiarioBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("es_devolucionFacturaDiarioBusqueda")) {
				this.jButtones_devolucionFacturaDiarioBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("valor_facturaFacturaDiarioBusqueda")) {
				this.jButtonvalor_facturaFacturaDiarioBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("base_imponibleFacturaDiarioBusqueda")) {
				this.jButtonbase_imponibleFacturaDiarioBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("monto_ivaFacturaDiarioBusqueda")) {
				this.jButtonmonto_ivaFacturaDiarioBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("bim_tarjetaFacturaDiarioBusqueda")) {
				this.jButtonbim_tarjetaFacturaDiarioBusquedaActionPerformed(evt);
			}
			
			
			else if(sTipo.equals("id_clienteFacturaDiario")) {
				this.jButtonid_clienteFacturaDiarioActionPerformed(evt);
			}
			
			
			else if(sTipo.equals("FK_IdClienteFacturaDiario")) {
				this.jButtonFK_IdClienteFacturaDiarioActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdPeriodoDeclaraFacturaDiario")) {
				this.jButtonFK_IdPeriodoDeclaraFacturaDiarioActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdTipoIvaFacturaDiario")) {
				this.jButtonFK_IdTipoIvaFacturaDiarioActionPerformed(evt);
			}
			
			;
			
			
			FacturaDiarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.facturadiario,new Object(),this.facturadiarioParameterGeneral,this.facturadiarioReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FacturaDiarioConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessFacturaDiario();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaFacturaDiarioActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.facturadiario);
				
				this.actualizarInformacion("INFO_PADRE",false,this.facturadiario);
				
				FacturaDiarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.facturadiario,new Object(),this.facturadiarioParameterGeneral,this.facturadiarioReturnGeneral);
				
				


				
				FacturaDiarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.facturadiario,new Object(),this.facturadiarioParameterGeneral,this.facturadiarioReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(FacturaDiario.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",FacturaDiario.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,FacturaDiarioConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			FacturaDiario facturadiarioLocal=null;
			
			if(!this.getEsControlTabla()) {
				facturadiarioLocal=this.facturadiario;
			} else {
				facturadiarioLocal=this.facturadiarioAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FacturaDiarioConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.facturadiario);
				
				this.actualizarInformacion("INFO_PADRE",false,this.facturadiario);
				
				FacturaDiarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.facturadiario,new Object(),this.facturadiarioParameterGeneral,this.facturadiarioReturnGeneral);
							
				
				


				
				FacturaDiarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.facturadiario,new Object(),this.facturadiarioParameterGeneral,this.facturadiarioReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(FacturaDiario.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",FacturaDiario.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FacturaDiarioConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaFacturaDiarioActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosFacturaDiario.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturadiarioAnterior =(FacturaDiario) this.facturadiarioLogic.getFacturaDiarios().toArray()[this.jTableDatosFacturaDiario.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.facturadiarioAnterior =(FacturaDiario) this.facturadiarios.toArray()[this.jTableDatosFacturaDiario.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FacturaDiarioConstantesFunciones.CLASSNAME);
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
			
			FacturaDiarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.facturadiario,new Object(),this.facturadiarioParameterGeneral,this.facturadiarioReturnGeneral);
			
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
			
			


			
			FacturaDiarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.facturadiario,new Object(),this.facturadiarioParameterGeneral,this.facturadiarioReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FacturaDiarioConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FacturaDiarioConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FacturaDiarioConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaFacturaDiarioActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.facturadiario);
				
				this.actualizarInformacion("INFO_PADRE",false,this.facturadiario);
				
				FacturaDiarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.facturadiario,new Object(),this.facturadiarioParameterGeneral,this.facturadiarioReturnGeneral);
								
						
				


				
				FacturaDiarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.facturadiario,new Object(),this.facturadiarioParameterGeneral,this.facturadiarioReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(FacturaDiario.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",FacturaDiario.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FacturaDiarioConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.facturadiario);
				
				this.actualizarInformacion("INFO_PADRE",false,this.facturadiario);
				
				FacturaDiarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.facturadiario,new Object(),this.facturadiarioParameterGeneral,this.facturadiarioReturnGeneral);
								
				
				


				
				FacturaDiarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.facturadiario,new Object(),this.facturadiarioParameterGeneral,this.facturadiarioReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(FacturaDiario.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",FacturaDiario.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FacturaDiarioConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaFacturaDiarioActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosFacturaDiario.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturadiarioAnterior =(FacturaDiario) this.facturadiarioLogic.getFacturaDiarios().toArray()[this.jTableDatosFacturaDiario.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.facturadiarioAnterior =(FacturaDiario) this.facturadiarios.toArray()[this.jTableDatosFacturaDiario.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FacturaDiarioConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.facturadiario);
				
				this.actualizarInformacion("INFO_PADRE",false,this.facturadiario);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FacturaDiarioConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaFacturaDiarioActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosFacturaDiario.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturadiarioAnterior =(FacturaDiario) this.facturadiarioLogic.getFacturaDiarios().toArray()[this.jTableDatosFacturaDiario.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.facturadiarioAnterior =(FacturaDiario) this.facturadiarios.toArray()[this.jTableDatosFacturaDiario.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FacturaDiarioConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaFacturaDiarioActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.facturadiario);
			
			this.actualizarInformacion("INFO_PADRE",false,this.facturadiario);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FacturaDiarioConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.facturadiario);
				
				this.actualizarInformacion("INFO_PADRE",false,this.facturadiario);
				
				FacturaDiarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.facturadiario,new Object(),this.facturadiarioParameterGeneral,this.facturadiarioReturnGeneral);
							
				
				


				
				FacturaDiarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.facturadiario,new Object(),this.facturadiarioParameterGeneral,this.facturadiarioReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(FacturaDiario.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",FacturaDiario.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FacturaDiarioConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaFacturaDiarioActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosFacturaDiario.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.facturadiarioAnterior =(FacturaDiario) this.facturadiarioLogic.getFacturaDiarios().toArray()[this.jTableDatosFacturaDiario.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.facturadiarioAnterior =(FacturaDiario) this.facturadiarios.toArray()[this.jTableDatosFacturaDiario.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FacturaDiarioConstantesFunciones.CLASSNAME);
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
			
			FacturaDiarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.facturadiario,new Object(),this.facturadiarioParameterGeneral,this.facturadiarioReturnGeneral);
			
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
			
			


			
			FacturaDiarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.facturadiario,new Object(),this.facturadiarioParameterGeneral,this.facturadiarioReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FacturaDiarioConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FacturaDiarioConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FacturaDiarioConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaFacturaDiarioActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.facturadiario);
			
			this.actualizarInformacion("INFO_PADRE",false,this.facturadiario);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FacturaDiarioConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.facturadiario);
				
				this.actualizarInformacion("INFO_PADRE",false,this.facturadiario);
				
				FacturaDiarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.facturadiario,new Object(),this.facturadiarioParameterGeneral,this.facturadiarioReturnGeneral);
								
				
				


				
				FacturaDiarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.facturadiario,new Object(),this.facturadiarioParameterGeneral,this.facturadiarioReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(FacturaDiario.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",FacturaDiario.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FacturaDiarioConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaFacturaDiarioActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosFacturaDiario.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturadiarioAnterior =(FacturaDiario) this.facturadiarioLogic.getFacturaDiarios().toArray()[this.jTableDatosFacturaDiario.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.facturadiarioAnterior =(FacturaDiario) this.facturadiarios.toArray()[this.jTableDatosFacturaDiario.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FacturaDiarioConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaFacturaDiarioActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.facturadiario);
			
			this.actualizarInformacion("INFO_PADRE",false,this.facturadiario);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FacturaDiarioConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaFacturaDiarioActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.facturadiario);
				
				this.actualizarInformacion("INFO_PADRE",false,this.facturadiario);
				
				FacturaDiarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.facturadiario,new Object(),this.facturadiarioParameterGeneral,this.facturadiarioReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosFacturaDiario")) {
					jCheckBoxSeleccionarTodosFacturaDiarioItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosFacturaDiario")) {
					jCheckBoxSeleccionadosFacturaDiarioItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarFacturaDiario")) {
					
				}
				
				


				
				
				FacturaDiarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.facturadiario,new Object(),this.facturadiarioParameterGeneral,this.facturadiarioReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(FacturaDiario.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",FacturaDiario.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FacturaDiarioConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.facturadiario);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.facturadiario);
				
				FacturaDiarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.facturadiario,new Object(),this.facturadiarioParameterGeneral,this.facturadiarioReturnGeneral);
												
				
				


				
				
				FacturaDiarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.facturadiario,new Object(),this.facturadiarioParameterGeneral,this.facturadiarioReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(FacturaDiario.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",FacturaDiario.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FacturaDiarioConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaFacturaDiarioActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosFacturaDiario.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.facturadiarioAnterior =(FacturaDiario) this.facturadiarioLogic.getFacturaDiarios().toArray()[this.jTableDatosFacturaDiario.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.facturadiarioAnterior =(FacturaDiario) this.facturadiarios.toArray()[this.jTableDatosFacturaDiario.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FacturaDiarioConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaFacturaDiarioActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.facturadiario);
				
				this.actualizarInformacion("INFO_PADRE",false,this.facturadiario);
				
				FacturaDiarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.facturadiario,new Object(),this.facturadiarioParameterGeneral,this.facturadiarioReturnGeneral);
				
				
				FacturaDiarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.facturadiario,new Object(),this.facturadiarioParameterGeneral,this.facturadiarioReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FacturaDiarioConstantesFunciones.CLASSNAME);
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
			
			FacturaDiarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.facturadiario,new Object(),this.facturadiarioParameterGeneral,this.facturadiarioReturnGeneral);
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
			
			


			
			FacturaDiarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.facturadiario,new Object(),this.facturadiarioParameterGeneral,this.facturadiarioReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FacturaDiarioConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaFacturaDiarioActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.facturadiario);
				
				this.actualizarInformacion("INFO_PADRE",false,this.facturadiario);
				
				FacturaDiarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.facturadiario,new Object(),this.facturadiarioParameterGeneral,this.facturadiarioReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				FacturaDiarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.facturadiario,new Object(),this.facturadiarioParameterGeneral,this.facturadiarioReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(FacturaDiario.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",FacturaDiario.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FacturaDiarioConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.facturadiario);
				
				this.actualizarInformacion("INFO_PADRE",false,this.facturadiario);
				
				FacturaDiarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.facturadiario,new Object(),this.facturadiarioParameterGeneral,this.facturadiarioReturnGeneral);
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
				
				


				
				FacturaDiarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.facturadiario,new Object(),this.facturadiarioParameterGeneral,this.facturadiarioReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(FacturaDiario.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",FacturaDiario.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FacturaDiarioConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaFacturaDiarioActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosFacturaDiario.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.facturadiarioAnterior =(FacturaDiario) this.facturadiarioLogic.getFacturaDiarios().toArray()[this.jTableDatosFacturaDiario.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.facturadiarioAnterior =(FacturaDiario) this.facturadiarios.toArray()[this.jTableDatosFacturaDiario.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FacturaDiarioConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				FacturaDiarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.facturadiario,new Object(),this.facturadiarioParameterGeneral,this.facturadiarioReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarFacturaDiario")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosFacturaDiarioListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosFacturaDiario.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.facturadiario =(FacturaDiario) this.facturadiarioLogic.getFacturaDiarios().toArray()[this.jTableDatosFacturaDiario.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.facturadiario =(FacturaDiario) this.facturadiarios.toArray()[this.jTableDatosFacturaDiario.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.facturadiario);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarFacturaDiario")) {
				
				}
				
				FacturaDiarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.facturadiario,new Object(),this.facturadiarioParameterGeneral,this.facturadiarioReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FacturaDiarioConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			FacturaDiarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.facturadiario,new Object(),this.facturadiarioParameterGeneral,this.facturadiarioReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarFacturaDiario")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosFacturaDiario.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarFacturaDiario")) {
			
			}
			
			FacturaDiarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.facturadiario,new Object(),this.facturadiarioParameterGeneral,this.facturadiarioReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FacturaDiarioConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessFacturaDiario();
			
			FacturaDiarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.facturadiario,new Object(),this.facturadiarioParameterGeneral,this.facturadiarioReturnGeneral);
			
			if(sTipo.equals("NuevoFacturaDiario")) {
				jButtonNuevoFacturaDiarioActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarFacturaDiario")) {
				jButtonDuplicarFacturaDiarioActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarFacturaDiario")) {
				jButtonCopiarFacturaDiarioActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormFacturaDiario")) {
				jButtonVerFormFacturaDiarioActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesFacturaDiario")) {
				jButtonNuevoFacturaDiarioActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarFacturaDiario")) {
				jButtonModificarFacturaDiarioActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarFacturaDiario")) {
				jButtonActualizarFacturaDiarioActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarFacturaDiario")) {
				jButtonEliminarFacturaDiarioActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaFacturaDiario")) {
				jButtonGuardarCambiosFacturaDiarioActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarFacturaDiario")) {
				jButtonCancelarFacturaDiarioActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarFacturaDiario")) {
				jButtonCerrarFacturaDiarioActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosFacturaDiario")) {
				jButtonGuardarCambiosFacturaDiarioActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosFacturaDiario")) {
				jButtonNuevoGuardarCambiosFacturaDiarioActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByFacturaDiario")) {
				jButtonAbrirOrderByFacturaDiarioActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionFacturaDiario")) {
				jButtonRecargarInformacionFacturaDiarioActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresFacturaDiario")) {
				jButtonAnterioresFacturaDiarioActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesFacturaDiario")) {
				jButtonSiguientesFacturaDiarioActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idFacturaDiarioBusqueda")) {
				this.jButtonidFacturaDiarioBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaFacturaDiarioUpdate")) {
				this.jButtonid_empresaFacturaDiarioUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaFacturaDiarioBusqueda")) {
				this.jButtonid_empresaFacturaDiarioBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalFacturaDiarioUpdate")) {
				this.jButtonid_sucursalFacturaDiarioUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalFacturaDiarioBusqueda")) {
				this.jButtonid_sucursalFacturaDiarioBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_clienteFacturaDiario")) {
				this.jButtonid_clienteFacturaDiarioActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_clienteFacturaDiarioUpdate")) {
				this.jButtonid_clienteFacturaDiarioUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_clienteFacturaDiarioBusqueda")) {
				this.jButtonid_clienteFacturaDiarioBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_periodo_declaraFacturaDiarioUpdate")) {
				this.jButtonid_periodo_declaraFacturaDiarioUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_periodo_declaraFacturaDiarioBusqueda")) {
				this.jButtonid_periodo_declaraFacturaDiarioBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_ivaFacturaDiarioUpdate")) {
				this.jButtonid_tipo_ivaFacturaDiarioUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_ivaFacturaDiarioBusqueda")) {
				this.jButtonid_tipo_ivaFacturaDiarioBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_emisionFacturaDiarioBusqueda")) {
				this.jButtonfecha_emisionFacturaDiarioBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_vencimientoFacturaDiarioBusqueda")) {
				this.jButtonfecha_vencimientoFacturaDiarioBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_serieFacturaDiarioBusqueda")) {
				this.jButtonnumero_serieFacturaDiarioBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("rucFacturaDiarioBusqueda")) {
				this.jButtonrucFacturaDiarioBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_autorizaFacturaDiarioBusqueda")) {
				this.jButtonnumero_autorizaFacturaDiarioBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("es_devolucionFacturaDiarioBusqueda")) {
				this.jButtones_devolucionFacturaDiarioBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("valor_facturaFacturaDiarioBusqueda")) {
				this.jButtonvalor_facturaFacturaDiarioBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("base_imponibleFacturaDiarioBusqueda")) {
				this.jButtonbase_imponibleFacturaDiarioBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("monto_ivaFacturaDiarioBusqueda")) {
				this.jButtonmonto_ivaFacturaDiarioBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("bim_tarjetaFacturaDiarioBusqueda")) {
				this.jButtonbim_tarjetaFacturaDiarioBusquedaActionPerformed(evt);
			}
			
			FacturaDiarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.facturadiario,new Object(),this.facturadiarioParameterGeneral,this.facturadiarioReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FacturaDiarioConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessFacturaDiario();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			FacturaDiarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.facturadiario,new Object(),this.facturadiarioParameterGeneral,this.facturadiarioReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameFacturaDiario")) {
				closingInternalFrameFacturaDiario();
				
			} else if(sTipo.equals("jButtonCancelarFacturaDiario")) {
				JInternalFrameBase jInternalFrameDetalleFormFacturaDiario = (JInternalFrameBase)evt.getSource();
	            	
	            FacturaDiarioBeanSwingJInternalFrame jInternalFrameParent=(FacturaDiarioBeanSwingJInternalFrame)jInternalFrameDetalleFormFacturaDiario.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarFacturaDiarioActionPerformed(null);
			}
			
			FacturaDiarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.facturadiario,new Object(),this.facturadiarioParameterGeneral,this.facturadiarioReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FacturaDiarioConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormFacturaDiario(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormFacturaDiario(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormFacturaDiario(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.facturadiario)) {
			if(!esControlTabla) {
				if(FacturaDiarioJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualFacturaDiario(this.facturadiario,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysFacturaDiario(this.facturadiario);			
				}
				
				if(this.facturadiarioSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualFacturaDiario(this.facturadiario,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.facturadiarioReturnGeneral=facturadiarioLogic.procesarEventosFacturaDiariosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.facturadiarioLogic.getFacturaDiarios(),this.facturadiario,this.facturadiarioParameterGeneral,this.isEsNuevoFacturaDiario,classes);//this.facturadiarioLogic.getFacturaDiario()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanFacturaDiario(this.facturadiarioReturnGeneral,this.facturadiarioBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.facturadiarioSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanFacturaDiario(classes,this.facturadiarioReturnGeneral,this.facturadiarioBean,false);
					}
						
					if(this.facturadiarioReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyFacturaDiario(this.facturadiarioReturnGeneral.getFacturaDiario());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioFacturaDiario(this.facturadiarioReturnGeneral.getFacturaDiario());	
					}
						
					if(this.facturadiarioReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioFacturaDiario(this.facturadiarioReturnGeneral.getFacturaDiario(),classes);//this.facturadiarioBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioFacturaDiario(this.facturadiario,classes);//this.facturadiarioBean);									
				}
			
				if(FacturaDiarioJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualFacturaDiario(this.facturadiario,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysFacturaDiario(this.facturadiario);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.facturadiarioAnterior!=null) {
						this.facturadiario=this.facturadiarioAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.facturadiarioReturnGeneral=facturadiarioLogic.procesarEventosFacturaDiariosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.facturadiarioLogic.getFacturaDiarios(),this.facturadiario,this.facturadiarioParameterGeneral,this.isEsNuevoFacturaDiario,classes);//this.facturadiarioLogic.getFacturaDiario()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.facturadiarioSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.facturadiarioSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.facturadiarioReturnGeneral.getFacturaDiario(),facturadiarioLogic.getFacturaDiarios());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.facturadiarioReturnGeneral.getFacturaDiario(),this.facturadiarios);
				}
				//ARCHITECTURE
				
				//this.jTableDatosFacturaDiario.repaint();
				
				//((AbstractTableModel) this.jTableDatosFacturaDiario.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosFacturaDiario();
			}
		}
	}
	
	public void actualizarVisualTableDatosFacturaDiario() throws Exception {
		
		FacturaDiarioModel facturadiarioModel=(FacturaDiarioModel)this.jTableDatosFacturaDiario.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			facturadiarioModel.facturadiarios=this.facturadiarioLogic.getFacturaDiarios();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			facturadiarioModel.facturadiarios=this.facturadiarios;
		}
		
		
		((FacturaDiarioModel) this.jTableDatosFacturaDiario.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaFacturaDiario() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getfacturadiarioAnterior(),this.facturadiarioLogic.getFacturaDiarios());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getfacturadiarioAnterior(),this.facturadiarios);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosFacturaDiario();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioFacturaDiario(FacturaDiario facturadiario,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FacturaDiarioConstantesFunciones.CLASSNAME);
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
										
				FacturaDiarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.facturadiario,new Object(),generalEntityParameterGeneral,this.facturadiarioReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.facturadiarioSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=FacturaDiarioConstantesFunciones.getClassesRelationshipsOfFacturaDiario(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=FacturaDiarioConstantesFunciones.getClassesRelationshipsFromStringsOfFacturaDiario(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormFacturaDiario(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				FacturaDiarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.facturadiario,new Object(),generalEntityParameterGeneral,this.facturadiarioReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FacturaDiarioConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioFacturaDiario(FacturaDiarioBean facturadiarioBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FacturaDiarioConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanFacturaDiario(ArrayList<Classe> classes,FacturaDiarioReturnGeneral facturadiarioReturnGeneral,FacturaDiarioBean facturadiarioBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualFacturaDiario(FacturaDiario facturadiario,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.facturadiario)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormFacturaDiario = new FacturaDiarioDetalleFormJInternalFrame(jDesktopPane,this.facturadiarioSessionBean.getConGuardarRelaciones(),this.facturadiarioSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormFacturaDiario);
		this.jInternalFrameDetalleFormFacturaDiario.setVisible(false);
		this.jInternalFrameDetalleFormFacturaDiario.setSelected(false);						
		
		this.jInternalFrameDetalleFormFacturaDiario.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormFacturaDiario.facturadiarioLogic=this.facturadiarioLogic;
		
		this.cargarCombosFrameForeignKeyFacturaDiario("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleFacturaDiario();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleFacturaDiario();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyFacturaDiario("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyFacturaDiario();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormFacturaDiario.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarFacturaDiario"));
		
		this.jInternalFrameDetalleFormFacturaDiario.jButtonModificarFacturaDiario.addActionListener(new ButtonActionListener(this,"ModificarFacturaDiario"));

		
		this.jInternalFrameDetalleFormFacturaDiario.jButtonModificarToolBarFacturaDiario.addActionListener(new ButtonActionListener(this,"ModificarToolBarFacturaDiario"));
					
		this.jInternalFrameDetalleFormFacturaDiario.jMenuItemModificarFacturaDiario.addActionListener(new ButtonActionListener(this,"MenuItemModificarFacturaDiario"));		
		
		
		
		this.jInternalFrameDetalleFormFacturaDiario.jButtonActualizarFacturaDiario.addActionListener (new ButtonActionListener(this,"ActualizarFacturaDiario"));
		
		
		this.jInternalFrameDetalleFormFacturaDiario.jButtonActualizarToolBarFacturaDiario.addActionListener(new ButtonActionListener(this,"ActualizarToolBarFacturaDiario"));
						
		this.jInternalFrameDetalleFormFacturaDiario.jMenuItemActualizarFacturaDiario.addActionListener (new ButtonActionListener(this,"MenuItemActualizarFacturaDiario"));		
		
		
		
		this.jInternalFrameDetalleFormFacturaDiario.jButtonEliminarFacturaDiario.addActionListener (new ButtonActionListener(this,"EliminarFacturaDiario"));
		
		
		this.jInternalFrameDetalleFormFacturaDiario.jButtonEliminarToolBarFacturaDiario.addActionListener (new ButtonActionListener(this,"EliminarToolBarFacturaDiario"));
								
		this.jInternalFrameDetalleFormFacturaDiario.jMenuItemEliminarFacturaDiario.addActionListener (new ButtonActionListener(this,"MenuItemEliminarFacturaDiario"));		
		
		
		
		this.jInternalFrameDetalleFormFacturaDiario.jButtonCancelarFacturaDiario.addActionListener (new ButtonActionListener(this,"CancelarFacturaDiario"));
		
		
		this.jInternalFrameDetalleFormFacturaDiario.jButtonCancelarToolBarFacturaDiario.addActionListener (new ButtonActionListener(this,"CancelarToolBarFacturaDiario"));
					
		this.jInternalFrameDetalleFormFacturaDiario.jMenuItemCancelarFacturaDiario.addActionListener (new ButtonActionListener(this,"MenuItemCancelarFacturaDiario"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormFacturaDiario.jMenuItemDetalleCerrarFacturaDiario.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarFacturaDiario"));		
		
		
		
		this.jInternalFrameDetalleFormFacturaDiario.jButtonGuardarCambiosToolBarFacturaDiario.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarFacturaDiario"));
		
		
		
		this.jInternalFrameDetalleFormFacturaDiario.jButtonGuardarCambiosToolBarFacturaDiario.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarFacturaDiario"));
		
		
		
		this.jInternalFrameDetalleFormFacturaDiario.jComboBoxTiposAccionesFormularioFacturaDiario.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioFacturaDiario"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFacturaDiario.jButtonidFacturaDiarioBusqueda.addActionListener(new ButtonActionListener(this,"idFacturaDiarioBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormFacturaDiario.jButtonid_empresaFacturaDiarioUpdate.addActionListener(new ButtonActionListener(this,"id_empresaFacturaDiarioUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFacturaDiario.jButtonid_empresaFacturaDiarioBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaFacturaDiarioBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormFacturaDiario.jButtonid_sucursalFacturaDiarioUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalFacturaDiarioUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFacturaDiario.jButtonid_sucursalFacturaDiarioBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalFacturaDiarioBusqueda"));
		//jButtonid_clienteFacturaDiario.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_clienteFacturaDiarioActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormFacturaDiario.jButtonid_clienteFacturaDiario.addActionListener(new ButtonActionListener(this,"id_clienteFacturaDiario"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormFacturaDiario.jButtonid_clienteFacturaDiarioUpdate.addActionListener(new ButtonActionListener(this,"id_clienteFacturaDiarioUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFacturaDiario.jButtonid_clienteFacturaDiarioBusqueda.addActionListener(new ButtonActionListener(this,"id_clienteFacturaDiarioBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormFacturaDiario.jButtonid_periodo_declaraFacturaDiarioUpdate.addActionListener(new ButtonActionListener(this,"id_periodo_declaraFacturaDiarioUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFacturaDiario.jButtonid_periodo_declaraFacturaDiarioBusqueda.addActionListener(new ButtonActionListener(this,"id_periodo_declaraFacturaDiarioBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormFacturaDiario.jButtonid_tipo_ivaFacturaDiarioUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_ivaFacturaDiarioUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFacturaDiario.jButtonid_tipo_ivaFacturaDiarioBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_ivaFacturaDiarioBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFacturaDiario.jButtonfecha_emisionFacturaDiarioBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emisionFacturaDiarioBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFacturaDiario.jButtonfecha_vencimientoFacturaDiarioBusqueda.addActionListener(new ButtonActionListener(this,"fecha_vencimientoFacturaDiarioBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFacturaDiario.jButtonnumero_serieFacturaDiarioBusqueda.addActionListener(new ButtonActionListener(this,"numero_serieFacturaDiarioBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFacturaDiario.jButtonrucFacturaDiarioBusqueda.addActionListener(new ButtonActionListener(this,"rucFacturaDiarioBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFacturaDiario.jButtonnumero_autorizaFacturaDiarioBusqueda.addActionListener(new ButtonActionListener(this,"numero_autorizaFacturaDiarioBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFacturaDiario.jButtones_devolucionFacturaDiarioBusqueda.addActionListener(new ButtonActionListener(this,"es_devolucionFacturaDiarioBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFacturaDiario.jButtonvalor_facturaFacturaDiarioBusqueda.addActionListener(new ButtonActionListener(this,"valor_facturaFacturaDiarioBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFacturaDiario.jButtonbase_imponibleFacturaDiarioBusqueda.addActionListener(new ButtonActionListener(this,"base_imponibleFacturaDiarioBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFacturaDiario.jButtonmonto_ivaFacturaDiarioBusqueda.addActionListener(new ButtonActionListener(this,"monto_ivaFacturaDiarioBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFacturaDiario.jButtonbim_tarjetaFacturaDiarioBusqueda.addActionListener(new ButtonActionListener(this,"bim_tarjetaFacturaDiarioBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormFacturaDiario.jTabbedPaneRelacionesFacturaDiario.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesFacturaDiario"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameFacturaDiario"));
		
		if(this.jInternalFrameDetalleFormFacturaDiario!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormFacturaDiario.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarFacturaDiario"));
		}
		
		this.jTableDatosFacturaDiario.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarFacturaDiario"));
		
		this.jTableDatosFacturaDiario.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarFacturaDiario"));
		
		this.jButtonNuevoFacturaDiario.addActionListener(new ButtonActionListener(this,"NuevoFacturaDiario"));
		
		this.jButtonDuplicarFacturaDiario.addActionListener(new ButtonActionListener(this,"DuplicarFacturaDiario"));
		
		this.jButtonCopiarFacturaDiario.addActionListener(new ButtonActionListener(this,"CopiarFacturaDiario"));
		
		this.jButtonVerFormFacturaDiario.addActionListener(new ButtonActionListener(this,"VerFormFacturaDiario"));
		
		
		this.jButtonNuevoToolBarFacturaDiario.addActionListener(new ButtonActionListener(this,"NuevoToolBarFacturaDiario"));
			
		this.jButtonDuplicarToolBarFacturaDiario.addActionListener(new ButtonActionListener(this,"DuplicarToolBarFacturaDiario"));
			
		this.jMenuItemNuevoFacturaDiario.addActionListener (new ButtonActionListener(this,"MenuItemNuevoFacturaDiario"));
			
		this.jMenuItemDuplicarFacturaDiario.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarFacturaDiario"));		
		
		
		this.jButtonNuevoRelacionesFacturaDiario.addActionListener (new ButtonActionListener(this,"NuevoRelacionesFacturaDiario"));
		
		
		this.jButtonNuevoRelacionesToolBarFacturaDiario.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarFacturaDiario"));
			
		this.jMenuItemNuevoRelacionesFacturaDiario.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesFacturaDiario"));		
		
		
		if(this.jInternalFrameDetalleFormFacturaDiario!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormFacturaDiario.jButtonModificarFacturaDiario.addActionListener(new ButtonActionListener(this,"ModificarFacturaDiario"));
		}
		
		
		if(this.jInternalFrameDetalleFormFacturaDiario!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormFacturaDiario.jButtonModificarToolBarFacturaDiario.addActionListener(new ButtonActionListener(this,"ModificarToolBarFacturaDiario"));
			
			this.jInternalFrameDetalleFormFacturaDiario.jMenuItemModificarFacturaDiario.addActionListener(new ButtonActionListener(this,"MenuItemModificarFacturaDiario"));		
		}
		
		
		if(this.jInternalFrameDetalleFormFacturaDiario!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormFacturaDiario.jButtonActualizarFacturaDiario.addActionListener (new ButtonActionListener(this,"ActualizarFacturaDiario"));
		}
		
		
		if(this.jInternalFrameDetalleFormFacturaDiario!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormFacturaDiario.jButtonActualizarToolBarFacturaDiario.addActionListener(new ButtonActionListener(this,"ActualizarToolBarFacturaDiario"));
				
			this.jInternalFrameDetalleFormFacturaDiario.jMenuItemActualizarFacturaDiario.addActionListener (new ButtonActionListener(this,"MenuItemActualizarFacturaDiario"));		
		}
		
		
		if(this.jInternalFrameDetalleFormFacturaDiario!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormFacturaDiario.jButtonEliminarFacturaDiario.addActionListener (new ButtonActionListener(this,"EliminarFacturaDiario"));
		}
		
		
		if(this.jInternalFrameDetalleFormFacturaDiario!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormFacturaDiario.jButtonEliminarToolBarFacturaDiario.addActionListener (new ButtonActionListener(this,"EliminarToolBarFacturaDiario"));
						
			this.jInternalFrameDetalleFormFacturaDiario.jMenuItemEliminarFacturaDiario.addActionListener (new ButtonActionListener(this,"MenuItemEliminarFacturaDiario"));		
		}
		
		
		if(this.jInternalFrameDetalleFormFacturaDiario!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormFacturaDiario.jButtonCancelarFacturaDiario.addActionListener (new ButtonActionListener(this,"CancelarFacturaDiario"));
		}
		
		
		if(this.jInternalFrameDetalleFormFacturaDiario!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormFacturaDiario.jButtonCancelarToolBarFacturaDiario.addActionListener (new ButtonActionListener(this,"CancelarToolBarFacturaDiario"));
			
			this.jInternalFrameDetalleFormFacturaDiario.jMenuItemCancelarFacturaDiario.addActionListener (new ButtonActionListener(this,"MenuItemCancelarFacturaDiario"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarFacturaDiario.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarFacturaDiario"));		
		
		
		this.jButtonCerrarFacturaDiario.addActionListener (new ButtonActionListener(this,"CerrarFacturaDiario"));
		
		
		this.jButtonCerrarToolBarFacturaDiario.addActionListener (new ButtonActionListener(this,"CerrarToolBarFacturaDiario"));
			
		this.jMenuItemCerrarFacturaDiario.addActionListener (new ButtonActionListener(this,"MenuItemCerrarFacturaDiario"));
			
		if(this.jInternalFrameDetalleFormFacturaDiario!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormFacturaDiario.jMenuItemDetalleCerrarFacturaDiario.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarFacturaDiario"));		
		}
		
		
		if(this.jInternalFrameDetalleFormFacturaDiario!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormFacturaDiario.jButtonGuardarCambiosFacturaDiario.addActionListener (new ButtonActionListener(this,"GuardarCambiosFacturaDiario"));
		}
		
		
		if(this.jInternalFrameDetalleFormFacturaDiario!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormFacturaDiario.jButtonGuardarCambiosToolBarFacturaDiario.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarFacturaDiario"));
		}
		
		this.jButtonCopiarToolBarFacturaDiario.addActionListener (new ButtonActionListener(this,"CopiarToolBarFacturaDiario"));
			
		this.jButtonVerFormToolBarFacturaDiario.addActionListener (new ButtonActionListener(this,"VerFormToolBarFacturaDiario"));
		
		this.jMenuItemGuardarCambiosFacturaDiario.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosFacturaDiario"));
			
		this.jMenuItemCopiarFacturaDiario.addActionListener (new ButtonActionListener(this,"MenuItemCopiarFacturaDiario"));		
		
		this.jMenuItemVerFormFacturaDiario.addActionListener (new ButtonActionListener(this,"MenuItemVerFormFacturaDiario"));		
		
		
		this.jButtonGuardarCambiosTablaFacturaDiario.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaFacturaDiario"));
		
		
		this.jButtonGuardarCambiosTablaToolBarFacturaDiario.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarFacturaDiario"));
			
		this.jMenuItemGuardarCambiosTablaFacturaDiario.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaFacturaDiario"));		
		
		
		
		this.jButtonRecargarInformacionFacturaDiario.addActionListener (new ButtonActionListener(this,"RecargarInformacionFacturaDiario"));
					
		this.jButtonRecargarInformacionToolBarFacturaDiario.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarFacturaDiario"));
		
		this.jMenuItemRecargarInformacionFacturaDiario.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionFacturaDiario"));		
		
		
		
		this.jButtonAnterioresFacturaDiario.addActionListener (new ButtonActionListener(this,"AnterioresFacturaDiario"));
		
		
		this.jButtonAnterioresToolBarFacturaDiario.addActionListener (new ButtonActionListener(this,"AnterioresToolBarFacturaDiario"));
		
		this.jMenuItemAnterioresFacturaDiario.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresFacturaDiario"));		
		
		
		this.jButtonSiguientesFacturaDiario.addActionListener (new ButtonActionListener(this,"SiguientesFacturaDiario"));
		
		
		this.jButtonSiguientesToolBarFacturaDiario.addActionListener (new ButtonActionListener(this,"SiguientesToolBarFacturaDiario"));
			
		this.jMenuItemSiguientesFacturaDiario.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesFacturaDiario"));
			
		this.jMenuItemAbrirOrderByFacturaDiario.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByFacturaDiario"));
			
		this.jMenuItemMostrarOcultarFacturaDiario.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarFacturaDiario"));
			
		this.jMenuItemDetalleAbrirOrderByFacturaDiario.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByFacturaDiario"));
			
		this.jMenuItemDetalleMostarOcultarFacturaDiario.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarFacturaDiario"));		
		
		
		this.jButtonNuevoGuardarCambiosFacturaDiario.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosFacturaDiario"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarFacturaDiario.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarFacturaDiario"));
			
		this.jMenuItemNuevoGuardarCambiosFacturaDiario.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosFacturaDiario"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosFacturaDiario.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosFacturaDiario"));

		this.jCheckBoxSeleccionadosFacturaDiario.addItemListener(new CheckBoxItemListener(this,"SeleccionadosFacturaDiario"));
		
		if(this.jInternalFrameDetalleFormFacturaDiario!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormFacturaDiario.jComboBoxTiposAccionesFormularioFacturaDiario.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioFacturaDiario"));
		}
		
		
		this.jComboBoxTiposRelacionesFacturaDiario.addActionListener (new ButtonActionListener(this,"TiposRelacionesFacturaDiario"));
			
		this.jComboBoxTiposAccionesFacturaDiario.addActionListener (new ButtonActionListener(this,"TiposAccionesFacturaDiario"));
					
		this.jComboBoxTiposSeleccionarFacturaDiario.addActionListener (new ButtonActionListener(this,"TiposSeleccionarFacturaDiario"));
			
		this.jTextFieldValorCampoGeneralFacturaDiario.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralFacturaDiario"));		
		
		
		if(this.jInternalFrameDetalleFormFacturaDiario!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFacturaDiario.jButtonidFacturaDiarioBusqueda.addActionListener(new ButtonActionListener(this,"idFacturaDiarioBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormFacturaDiario.jButtonid_empresaFacturaDiarioUpdate.addActionListener(new ButtonActionListener(this,"id_empresaFacturaDiarioUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFacturaDiario.jButtonid_empresaFacturaDiarioBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaFacturaDiarioBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormFacturaDiario.jButtonid_sucursalFacturaDiarioUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalFacturaDiarioUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFacturaDiario.jButtonid_sucursalFacturaDiarioBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalFacturaDiarioBusqueda"));
		//jButtonid_clienteFacturaDiario.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_clienteFacturaDiarioActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormFacturaDiario.jButtonid_clienteFacturaDiario.addActionListener(new ButtonActionListener(this,"id_clienteFacturaDiario"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormFacturaDiario.jButtonid_clienteFacturaDiarioUpdate.addActionListener(new ButtonActionListener(this,"id_clienteFacturaDiarioUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFacturaDiario.jButtonid_clienteFacturaDiarioBusqueda.addActionListener(new ButtonActionListener(this,"id_clienteFacturaDiarioBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormFacturaDiario.jButtonid_periodo_declaraFacturaDiarioUpdate.addActionListener(new ButtonActionListener(this,"id_periodo_declaraFacturaDiarioUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFacturaDiario.jButtonid_periodo_declaraFacturaDiarioBusqueda.addActionListener(new ButtonActionListener(this,"id_periodo_declaraFacturaDiarioBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormFacturaDiario.jButtonid_tipo_ivaFacturaDiarioUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_ivaFacturaDiarioUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFacturaDiario.jButtonid_tipo_ivaFacturaDiarioBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_ivaFacturaDiarioBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFacturaDiario.jButtonfecha_emisionFacturaDiarioBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emisionFacturaDiarioBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFacturaDiario.jButtonfecha_vencimientoFacturaDiarioBusqueda.addActionListener(new ButtonActionListener(this,"fecha_vencimientoFacturaDiarioBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFacturaDiario.jButtonnumero_serieFacturaDiarioBusqueda.addActionListener(new ButtonActionListener(this,"numero_serieFacturaDiarioBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFacturaDiario.jButtonrucFacturaDiarioBusqueda.addActionListener(new ButtonActionListener(this,"rucFacturaDiarioBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFacturaDiario.jButtonnumero_autorizaFacturaDiarioBusqueda.addActionListener(new ButtonActionListener(this,"numero_autorizaFacturaDiarioBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFacturaDiario.jButtones_devolucionFacturaDiarioBusqueda.addActionListener(new ButtonActionListener(this,"es_devolucionFacturaDiarioBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFacturaDiario.jButtonvalor_facturaFacturaDiarioBusqueda.addActionListener(new ButtonActionListener(this,"valor_facturaFacturaDiarioBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFacturaDiario.jButtonbase_imponibleFacturaDiarioBusqueda.addActionListener(new ButtonActionListener(this,"base_imponibleFacturaDiarioBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFacturaDiario.jButtonmonto_ivaFacturaDiarioBusqueda.addActionListener(new ButtonActionListener(this,"monto_ivaFacturaDiarioBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFacturaDiario.jButtonbim_tarjetaFacturaDiarioBusqueda.addActionListener(new ButtonActionListener(this,"bim_tarjetaFacturaDiarioBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonFK_IdClienteFacturaDiario.addActionListener(new ButtonActionListener(this,"FK_IdClienteFacturaDiario"));

			this.jButtonBuscarFK_IdClienteid_clienteFacturaDiario.addActionListener(new ButtonActionListener(this,"id_clienteFacturaDiario"));

			this.jButtonFK_IdPeriodoDeclaraFacturaDiario.addActionListener(new ButtonActionListener(this,"FK_IdPeriodoDeclaraFacturaDiario"));

			this.jButtonFK_IdTipoIvaFacturaDiario.addActionListener(new ButtonActionListener(this,"FK_IdTipoIvaFacturaDiario"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoFacturaDiario!=null) {
				this.jInternalFrameReporteDinamicoFacturaDiario.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoFacturaDiario"));
				this.jInternalFrameReporteDinamicoFacturaDiario.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoFacturaDiario"));
				this.jInternalFrameReporteDinamicoFacturaDiario.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoFacturaDiario"));
			}
			
			//this.jButtonCerrarReporteDinamicoFacturaDiario.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoFacturaDiario"));				
			//this.jButtonGenerarReporteDinamicoFacturaDiario.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoFacturaDiario"));
			//this.jButtonGenerarExcelReporteDinamicoFacturaDiario.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoFacturaDiario"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionFacturaDiario!=null) {
				this.jInternalFrameImportacionFacturaDiario.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionFacturaDiario"));
				this.jInternalFrameImportacionFacturaDiario.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionFacturaDiario"));
				this.jInternalFrameImportacionFacturaDiario.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionFacturaDiario"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByFacturaDiario.addActionListener (new ButtonActionListener(this,"AbrirOrderByFacturaDiario"));
			
			this.jButtonAbrirOrderByToolBarFacturaDiario.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarFacturaDiario"));			
			
			if(this.jInternalFrameOrderByFacturaDiario!=null) {
				this.jInternalFrameOrderByFacturaDiario.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByFacturaDiario"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormFacturaDiario!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormFacturaDiario!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormFacturaDiario.jTabbedPaneRelacionesFacturaDiario.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesFacturaDiario"));
		
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
            		closingInternalFrameFacturaDiario();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormFacturaDiario.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormFacturaDiario = (JInternalFrameBase)event.getSource();
	            	
	            FacturaDiarioBeanSwingJInternalFrame jInternalFrameParent=(FacturaDiarioBeanSwingJInternalFrame)jInternalFrameDetalleFormFacturaDiario.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarFacturaDiarioActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosFacturaDiario.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosFacturaDiarioListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosFacturaDiario.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosFacturaDiario.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoFacturaDiario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoFacturaDiarioActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarFacturaDiario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoFacturaDiarioActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoFacturaDiario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoFacturaDiarioActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoFacturaDiario";
		inputMap = this.jButtonNuevoFacturaDiario.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoFacturaDiario.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoFacturaDiarioActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesFacturaDiario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoFacturaDiarioActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarFacturaDiario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoFacturaDiarioActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesFacturaDiario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoFacturaDiarioActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesFacturaDiario";
		inputMap = this.jButtonNuevoRelacionesFacturaDiario.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesFacturaDiario.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoFacturaDiarioActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarFacturaDiario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarFacturaDiarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarFacturaDiario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarFacturaDiarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarFacturaDiario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarFacturaDiarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarFacturaDiario";
		inputMap = this.jButtonModificarFacturaDiario.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarFacturaDiario.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarFacturaDiarioActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarFacturaDiario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarFacturaDiarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarFacturaDiario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarFacturaDiarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarFacturaDiario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarFacturaDiarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarFacturaDiario";
		inputMap = this.jButtonActualizarFacturaDiario.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarFacturaDiario.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarFacturaDiarioActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarFacturaDiario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarFacturaDiarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarFacturaDiario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarFacturaDiarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarFacturaDiario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarFacturaDiarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarFacturaDiario";
		inputMap = this.jButtonEliminarFacturaDiario.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarFacturaDiario.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarFacturaDiarioActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarFacturaDiario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarFacturaDiarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarFacturaDiario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarFacturaDiarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarFacturaDiario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarFacturaDiarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarFacturaDiario";
		inputMap = this.jButtonCancelarFacturaDiario.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarFacturaDiario.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarFacturaDiarioActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarFacturaDiario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarFacturaDiarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarFacturaDiario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarFacturaDiarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarFacturaDiario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarFacturaDiarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarFacturaDiario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarFacturaDiarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarFacturaDiarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarFacturaDiario";
		inputMap = this.jButtonCerrarFacturaDiario.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarFacturaDiario.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarFacturaDiarioActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormFacturaDiario.jButtonGuardarCambiosFacturaDiario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosFacturaDiarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarFacturaDiario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosFacturaDiarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosFacturaDiario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosFacturaDiarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaFacturaDiario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosFacturaDiarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarFacturaDiario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosFacturaDiarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaFacturaDiario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosFacturaDiarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosFacturaDiario";
		inputMap = this.jInternalFrameDetalleFormFacturaDiario.jButtonGuardarCambiosFacturaDiario.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormFacturaDiario.jButtonGuardarCambiosFacturaDiario.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosFacturaDiarioActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionFacturaDiario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionFacturaDiarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarFacturaDiario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionFacturaDiarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionFacturaDiario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionFacturaDiarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresFacturaDiario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresFacturaDiarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarFacturaDiario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresFacturaDiarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresFacturaDiario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresFacturaDiarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesFacturaDiario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesFacturaDiarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarFacturaDiario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesFacturaDiarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesFacturaDiario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesFacturaDiarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosFacturaDiario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosFacturaDiarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarFacturaDiario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosFacturaDiarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosFacturaDiario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosFacturaDiarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosFacturaDiario.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosFacturaDiarioItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesFacturaDiario.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesFacturaDiarioActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarFacturaDiario.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarFacturaDiarioActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralFacturaDiario.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralFacturaDiarioActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFacturaDiario.jButtonidFacturaDiarioBusqueda.addActionListener(new ButtonActionListener(this,"idFacturaDiarioBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormFacturaDiario.jButtonid_empresaFacturaDiarioUpdate.addActionListener(new ButtonActionListener(this,"id_empresaFacturaDiarioUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFacturaDiario.jButtonid_empresaFacturaDiarioBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaFacturaDiarioBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormFacturaDiario.jButtonid_sucursalFacturaDiarioUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalFacturaDiarioUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFacturaDiario.jButtonid_sucursalFacturaDiarioBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalFacturaDiarioBusqueda"));
		//jButtonid_clienteFacturaDiario.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_clienteFacturaDiarioActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormFacturaDiario.jButtonid_clienteFacturaDiario.addActionListener(new ButtonActionListener(this,"id_clienteFacturaDiario"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormFacturaDiario.jButtonid_clienteFacturaDiarioUpdate.addActionListener(new ButtonActionListener(this,"id_clienteFacturaDiarioUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFacturaDiario.jButtonid_clienteFacturaDiarioBusqueda.addActionListener(new ButtonActionListener(this,"id_clienteFacturaDiarioBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormFacturaDiario.jButtonid_periodo_declaraFacturaDiarioUpdate.addActionListener(new ButtonActionListener(this,"id_periodo_declaraFacturaDiarioUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFacturaDiario.jButtonid_periodo_declaraFacturaDiarioBusqueda.addActionListener(new ButtonActionListener(this,"id_periodo_declaraFacturaDiarioBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormFacturaDiario.jButtonid_tipo_ivaFacturaDiarioUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_ivaFacturaDiarioUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFacturaDiario.jButtonid_tipo_ivaFacturaDiarioBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_ivaFacturaDiarioBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFacturaDiario.jButtonfecha_emisionFacturaDiarioBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emisionFacturaDiarioBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFacturaDiario.jButtonfecha_vencimientoFacturaDiarioBusqueda.addActionListener(new ButtonActionListener(this,"fecha_vencimientoFacturaDiarioBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFacturaDiario.jButtonnumero_serieFacturaDiarioBusqueda.addActionListener(new ButtonActionListener(this,"numero_serieFacturaDiarioBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFacturaDiario.jButtonrucFacturaDiarioBusqueda.addActionListener(new ButtonActionListener(this,"rucFacturaDiarioBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFacturaDiario.jButtonnumero_autorizaFacturaDiarioBusqueda.addActionListener(new ButtonActionListener(this,"numero_autorizaFacturaDiarioBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFacturaDiario.jButtones_devolucionFacturaDiarioBusqueda.addActionListener(new ButtonActionListener(this,"es_devolucionFacturaDiarioBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFacturaDiario.jButtonvalor_facturaFacturaDiarioBusqueda.addActionListener(new ButtonActionListener(this,"valor_facturaFacturaDiarioBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFacturaDiario.jButtonbase_imponibleFacturaDiarioBusqueda.addActionListener(new ButtonActionListener(this,"base_imponibleFacturaDiarioBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFacturaDiario.jButtonmonto_ivaFacturaDiarioBusqueda.addActionListener(new ButtonActionListener(this,"monto_ivaFacturaDiarioBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFacturaDiario.jButtonbim_tarjetaFacturaDiarioBusqueda.addActionListener(new ButtonActionListener(this,"bim_tarjetaFacturaDiarioBusqueda"));
		
		
		this.jButtonFK_IdClienteFacturaDiario.addActionListener(new ButtonActionListener(this,"FK_IdClienteFacturaDiario"));

		this.jButtonBuscarFK_IdClienteid_clienteFacturaDiario.addActionListener(new ButtonActionListener(this,"id_clienteFacturaDiario"));

		this.jButtonFK_IdPeriodoDeclaraFacturaDiario.addActionListener(new ButtonActionListener(this,"FK_IdPeriodoDeclaraFacturaDiario"));

		this.jButtonFK_IdTipoIvaFacturaDiario.addActionListener(new ButtonActionListener(this,"FK_IdTipoIvaFacturaDiario"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoFacturaDiario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoFacturaDiarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoFacturaDiario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoFacturaDiarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoFacturaDiario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoFacturaDiarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionFacturaDiario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionFacturaDiarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionFacturaDiario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionFacturaDiarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionFacturaDiario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionFacturaDiarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarFacturaDiarioActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarFacturaDiario.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FacturaDiarioConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosFacturaDiario(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(FacturaDiario facturadiarioAux:this.facturadiarioLogic.getFacturaDiarios()) {
					facturadiarioAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(FacturaDiario facturadiarioAux:facturadiarios) {
					facturadiarioAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FacturaDiarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosFacturaDiarioItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingFacturaDiario(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(FacturaDiario facturadiarioAux:this.facturadiarioLogic.getFacturaDiarios()) {
						facturadiarioAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(FacturaDiario facturadiarioAux:facturadiarios) {
						facturadiarioAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(FacturaDiario facturadiarioAux:this.facturadiarioLogic.getFacturaDiarios()) {
					
						if(sTipoSeleccionar.equals(FacturaDiarioConstantesFunciones.LABEL_ESDEVOLUCION)) {
							existe=true;
							facturadiarioAux.setes_devolucion(this.isSeleccionarTodos);
						}
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(FacturaDiario facturadiarioAux:facturadiarios) {
						
						if(sTipoSeleccionar.equals(FacturaDiarioConstantesFunciones.LABEL_ESDEVOLUCION)) {
							existe=true;
							facturadiarioAux.setes_devolucion(this.isSeleccionarTodos);
						}
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaFacturaDiario(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosFacturaDiario.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosFacturaDiario.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosFacturaDiario,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FacturaDiarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosFacturaDiarioItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingFacturaDiario(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosFacturaDiario.getSelectedRows();
			
			FacturaDiario facturadiarioLocal=new FacturaDiario();
			
			//this.seleccionarTodosFacturaDiario(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					facturadiarioLocal =(FacturaDiario) this.facturadiarioLogic.getFacturaDiarios().toArray()[this.jTableDatosFacturaDiario.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					facturadiarioLocal =(FacturaDiario) this.facturadiarios.toArray()[this.jTableDatosFacturaDiario.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				facturadiarioLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(FacturaDiario facturadiarioAux:this.facturadiarioLogic.getFacturaDiarios()) {
						facturadiarioAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(FacturaDiario facturadiarioAux:facturadiarios) {
						facturadiarioAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaFacturaDiario(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosFacturaDiario.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosFacturaDiario.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosFacturaDiario,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FacturaDiarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualFacturaDiarioItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FacturaDiarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarFacturaDiarioParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FacturaDiarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralFacturaDiarioActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingFacturaDiario(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralFacturaDiario.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(FacturaDiario facturadiarioAux:this.facturadiarioLogic.getFacturaDiarios()) {
				
						if(sTipoSeleccionar.equals(FacturaDiarioConstantesFunciones.LABEL_FECHAEMISION)) {
							existe=true;
							facturadiarioAux.setfecha_emision(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(FacturaDiarioConstantesFunciones.LABEL_FECHAVENCIMIENTO)) {
							existe=true;
							facturadiarioAux.setfecha_vencimiento(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(FacturaDiarioConstantesFunciones.LABEL_NUMEROSERIE)) {
							existe=true;
							facturadiarioAux.setnumero_serie(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(FacturaDiarioConstantesFunciones.LABEL_RUC)) {
							existe=true;
							facturadiarioAux.setruc(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(FacturaDiarioConstantesFunciones.LABEL_NUMEROAUTORIZA)) {
							existe=true;
							facturadiarioAux.setnumero_autoriza(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(FacturaDiarioConstantesFunciones.LABEL_VALORFACTURA)) {
							existe=true;
							facturadiarioAux.setvalor_factura(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(FacturaDiarioConstantesFunciones.LABEL_BASEIMPONIBLE)) {
							existe=true;
							facturadiarioAux.setbase_imponible(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(FacturaDiarioConstantesFunciones.LABEL_MONTOIVA)) {
							existe=true;
							facturadiarioAux.setmonto_iva(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(FacturaDiarioConstantesFunciones.LABEL_BIMTARJETA)) {
							existe=true;
							facturadiarioAux.setbim_tarjeta(Double.parseDouble(this.sValorCampoGeneral));
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(FacturaDiario facturadiarioAux:facturadiarios) {
					
						if(sTipoSeleccionar.equals(FacturaDiarioConstantesFunciones.LABEL_FECHAEMISION)) {
							existe=true;
							facturadiarioAux.setfecha_emision(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(FacturaDiarioConstantesFunciones.LABEL_FECHAVENCIMIENTO)) {
							existe=true;
							facturadiarioAux.setfecha_vencimiento(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(FacturaDiarioConstantesFunciones.LABEL_NUMEROSERIE)) {
							existe=true;
							facturadiarioAux.setnumero_serie(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(FacturaDiarioConstantesFunciones.LABEL_RUC)) {
							existe=true;
							facturadiarioAux.setruc(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(FacturaDiarioConstantesFunciones.LABEL_NUMEROAUTORIZA)) {
							existe=true;
							facturadiarioAux.setnumero_autoriza(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(FacturaDiarioConstantesFunciones.LABEL_VALORFACTURA)) {
							existe=true;
							facturadiarioAux.setvalor_factura(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(FacturaDiarioConstantesFunciones.LABEL_BASEIMPONIBLE)) {
							existe=true;
							facturadiarioAux.setbase_imponible(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(FacturaDiarioConstantesFunciones.LABEL_MONTOIVA)) {
							existe=true;
							facturadiarioAux.setmonto_iva(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(FacturaDiarioConstantesFunciones.LABEL_BIMTARJETA)) {
							existe=true;
							facturadiarioAux.setbim_tarjeta(Double.parseDouble(this.sValorCampoGeneral));
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaFacturaDiario(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FacturaDiarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesFacturaDiarioActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingFacturaDiario(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioFacturaDiario=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesFacturaDiario.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormFacturaDiario.jComboBoxTiposAccionesFormularioFacturaDiario.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteFacturaDiario) {				
					conSplash=true;//false;										
					
					//this.startProcessFacturaDiario(conSplash);
				
					this.generarReporteFacturaDiariosSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesFacturaDiario.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormFacturaDiario.jComboBoxTiposAccionesFormularioFacturaDiario.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoFacturaDiariosSeleccionados();
				//this.jComboBoxTiposAccionesFacturaDiario.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoFacturaDiariosSeleccionados(false);
				//this.jComboBoxTiposAccionesFacturaDiario.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoFacturaDiariosSeleccionados(true);
				//this.jComboBoxTiposAccionesFacturaDiario.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessFacturaDiario();
				
				this.exportarFacturaDiariosSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesFacturaDiario.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormFacturaDiario.jComboBoxTiposAccionesFormularioFacturaDiario.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionFacturaDiarios();
				//this.importarFacturaDiarios();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesFacturaDiario.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormFacturaDiario.jComboBoxTiposAccionesFormularioFacturaDiario.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessFacturaDiario();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelFacturaDiariosSeleccionados();
				//this.jComboBoxTiposAccionesFacturaDiario.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Factura Diario", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessFacturaDiario();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoFacturaDiario)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyFacturaDiario(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Factura Diario",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesFacturaDiario.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormFacturaDiario.jComboBoxTiposAccionesFormularioFacturaDiario.setSelectedIndex(0);					
				}	
			} 			
			else if(FacturaDiarioBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteFacturaDiario) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessFacturaDiario(conSplash);
					
						//this.actualizarParametrosGeneralFacturaDiario();
						
						this.generarReporteProcesoAccionFacturaDiariosSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesFacturaDiario.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormFacturaDiario.jComboBoxTiposAccionesFormularioFacturaDiario.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(FacturaDiarioBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Factura DiarioS SELECCIONADOS?", "MANTENIMIENTO DE Factura Diario", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessFacturaDiario();
				
						this.actualizarParametrosGeneralFacturaDiario();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.facturadiarioReturnGeneral=facturadiarioLogic.procesarAccionFacturaDiariosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.facturadiarioLogic.getFacturaDiarios(),this.facturadiarioParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarFacturaDiarioReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesFacturaDiario.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormFacturaDiario.jComboBoxTiposAccionesFormularioFacturaDiario.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralFacturaDiario();
					
					FacturaDiarioBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarFacturaDiarioReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesFacturaDiario.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormFacturaDiario.jComboBoxTiposAccionesFormularioFacturaDiario.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,FacturaDiarioConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessFacturaDiario(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesFacturaDiarioActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessFacturaDiario();
			
			if(this.jInternalFrameDetalleFormFacturaDiario==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<FacturaDiario> facturadiariosSeleccionados=new ArrayList<FacturaDiario>();		
			FacturaDiario facturadiario=new FacturaDiario();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingFacturaDiario(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesFacturaDiario.getSelectedItem();
			
			
			
			
			facturadiariosSeleccionados=this.getFacturaDiariosSeleccionados(true);
			//this.sTipoAccion;
			
			if(facturadiariosSeleccionados.size()==1) {
				for(FacturaDiario facturadiarioAux:facturadiariosSeleccionados) {
					facturadiario=facturadiarioAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FacturaDiarioConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessFacturaDiario();
			
      		//this.finishProcessFacturaDiario(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarFacturaDiarioReturnGeneral() throws Exception {
		if(this.facturadiarioReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.facturadiarioReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.facturadiarioReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.facturadiarioReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.facturadiarioReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.facturadiarioReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingFacturaDiario(false);
		}
		
		if(this.facturadiarioReturnGeneral.getConRetornoLista() || this.facturadiarioReturnGeneral.getConRetornoObjeto()) {
			if(this.facturadiarioReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.facturadiarioLogic.setFacturaDiarios(this.facturadiarioReturnGeneral.getFacturaDiarios());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.facturadiarioReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.facturadiarioLogic.setFacturaDiario(this.facturadiarioReturnGeneral.getFacturaDiario());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingFacturaDiario(false);
		}
	}
	
	public void actualizarParametrosGeneralFacturaDiario() throws Exception {
		
		
	}
	
	public ArrayList<FacturaDiario> getFacturaDiariosSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<FacturaDiario> facturadiariosSeleccionados=new ArrayList<FacturaDiario>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioFacturaDiario) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(FacturaDiario facturadiarioAux:facturadiarioLogic.getFacturaDiarios()) {
					if(facturadiarioAux.getIsSelected()) {
						facturadiariosSeleccionados.add(facturadiarioAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(FacturaDiario facturadiarioAux:this.facturadiarios) {
					if(facturadiarioAux.getIsSelected()) {
						facturadiariosSeleccionados.add(facturadiarioAux);				
					}
				}
			}
			
			if(facturadiariosSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						facturadiariosSeleccionados.addAll(this.facturadiarioLogic.getFacturaDiarios());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						facturadiariosSeleccionados.addAll(this.facturadiarios);				
					}
				}
			}
		} else {
			facturadiariosSeleccionados.add(this.facturadiario);
		}
		
		return facturadiariosSeleccionados;
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
	
	public void generarReporteFacturaDiariosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalFacturaDiariosSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoFacturaDiariosSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoFacturaDiariosSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoFacturaDiariosSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Factura Diario",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesFacturaDiariosSeleccionados() throws Exception {
		ArrayList<FacturaDiario> facturadiariosSeleccionados=new ArrayList<FacturaDiario>();		
		
		facturadiariosSeleccionados=this.getFacturaDiariosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteFacturaDiarios("Todos",facturadiariosSeleccionados);
		
	}	
	
	public void generarReporteNormalFacturaDiariosSeleccionados() throws Exception {
		ArrayList<FacturaDiario> facturadiariosSeleccionados=new ArrayList<FacturaDiario>();		
		
		facturadiariosSeleccionados=this.getFacturaDiariosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteFacturaDiarios("Todos",facturadiariosSeleccionados);
	}		
	
	public void generarReporteProcesoAccionFacturaDiariosSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<FacturaDiario> facturadiariosSeleccionados=new ArrayList<FacturaDiario>();
		
		facturadiariosSeleccionados=this.getFacturaDiariosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteFacturaDiarios("Todos",facturadiariosSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoFacturaDiariosSeleccionados() throws Exception {
		ArrayList<FacturaDiario> facturadiariosSeleccionados=new ArrayList<FacturaDiario>();		
		
		
		this.abrirInicializarFrameReporteDinamicoFacturaDiario();
		
		
		facturadiariosSeleccionados=this.getFacturaDiariosSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoFacturaDiario();
		
		
		//this.generarReporteFacturaDiarios("Todos",facturadiariosSeleccionados ,facturadiarioImplementable,facturadiarioImplementableHome);
	}
	
	public void mostrarImportacionFacturaDiarios() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionFacturaDiario();
		
		this.abrirFrameImportacionFacturaDiario();		
		
			
		//this.generarReporteFacturaDiarios("Todos",facturadiariosSeleccionados ,facturadiarioImplementable,facturadiarioImplementableHome);
	}
	
	public void importarFacturaDiarios() throws Exception {		
	
	}
	
	public void exportarFacturaDiariosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelFacturaDiariosSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoFacturaDiariosSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlFacturaDiariosSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Factura Diario",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoFacturaDiariosSeleccionados() throws Exception {
		ArrayList<FacturaDiario> facturadiariosSeleccionados=new ArrayList<FacturaDiario>();		
		
		facturadiariosSeleccionados=this.getFacturaDiariosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"facturadiario."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarFacturaDiario(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(FacturaDiario facturadiarioAux:facturadiariosSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarFacturaDiario(facturadiarioAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//facturadiarioAux.setsDetalleGeneralEntityReporte(facturadiarioAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.facturadiarioSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Factura Diario",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarFacturaDiario(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=FacturaDiarioConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=FacturaDiarioConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=FacturaDiarioConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=FacturaDiarioConstantesFunciones.LABEL_IDSUCURSAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=FacturaDiarioConstantesFunciones.LABEL_IDCLIENTE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=FacturaDiarioConstantesFunciones.LABEL_IDPERIODODECLARA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=FacturaDiarioConstantesFunciones.LABEL_IDTIPOIVA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=FacturaDiarioConstantesFunciones.LABEL_FECHAEMISION;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=FacturaDiarioConstantesFunciones.LABEL_FECHAVENCIMIENTO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=FacturaDiarioConstantesFunciones.LABEL_NUMEROSERIE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=FacturaDiarioConstantesFunciones.LABEL_RUC;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=FacturaDiarioConstantesFunciones.LABEL_NUMEROAUTORIZA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=FacturaDiarioConstantesFunciones.LABEL_ESDEVOLUCION;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=FacturaDiarioConstantesFunciones.LABEL_VALORFACTURA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=FacturaDiarioConstantesFunciones.LABEL_BASEIMPONIBLE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=FacturaDiarioConstantesFunciones.LABEL_MONTOIVA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=FacturaDiarioConstantesFunciones.LABEL_BIMTARJETA;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarFacturaDiario(FacturaDiario facturadiario,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=facturadiario.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=facturadiario.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=facturadiario.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=facturadiario.getsucursal_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=facturadiario.getcliente_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=facturadiario.getperiododeclara_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=facturadiario.gettipoiva_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=facturadiario.getfecha_emision().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=facturadiario.getfecha_vencimiento().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=facturadiario.getnumero_serie();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=facturadiario.getruc();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=facturadiario.getnumero_autoriza();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=facturadiario.getes_devolucion().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=facturadiario.getvalor_factura().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=facturadiario.getbase_imponible().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=facturadiario.getmonto_iva().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=facturadiario.getbim_tarjeta().toString();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelFacturaDiariosSeleccionados() throws Exception {
		ArrayList<FacturaDiario> facturadiariosSeleccionados=new ArrayList<FacturaDiario>();		
		
		facturadiariosSeleccionados=this.getFacturaDiariosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"facturadiario.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("FacturaDiarios");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelFacturaDiario(row);				
				iRow++;
			}				
			
			for(FacturaDiario facturadiarioAux:facturadiariosSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelFacturaDiario(facturadiarioAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.facturadiarioSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Factura Diario",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlFacturaDiariosSeleccionados() throws Exception {
		ArrayList<FacturaDiario> facturadiariosSeleccionados=new ArrayList<FacturaDiario>();		
		
		facturadiariosSeleccionados=this.getFacturaDiariosSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"facturadiario.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("facturadiarios");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("facturadiario");
			//elementRoot.appendChild(element);
		
			for(FacturaDiario facturadiarioAux:facturadiariosSeleccionados) {
				element = document.createElement("facturadiario");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlFacturaDiario(facturadiarioAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.facturadiarioSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Factura Diario",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelFacturaDiario(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(FacturaDiarioConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(FacturaDiarioConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(FacturaDiarioConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(FacturaDiarioConstantesFunciones.LABEL_IDSUCURSAL);
		cell = row.createCell(iColumn++);cell.setCellValue(FacturaDiarioConstantesFunciones.LABEL_IDCLIENTE);
		cell = row.createCell(iColumn++);cell.setCellValue(FacturaDiarioConstantesFunciones.LABEL_IDPERIODODECLARA);
		cell = row.createCell(iColumn++);cell.setCellValue(FacturaDiarioConstantesFunciones.LABEL_IDTIPOIVA);
		cell = row.createCell(iColumn++);cell.setCellValue(FacturaDiarioConstantesFunciones.LABEL_FECHAEMISION);
		cell = row.createCell(iColumn++);cell.setCellValue(FacturaDiarioConstantesFunciones.LABEL_FECHAVENCIMIENTO);
		cell = row.createCell(iColumn++);cell.setCellValue(FacturaDiarioConstantesFunciones.LABEL_NUMEROSERIE);
		cell = row.createCell(iColumn++);cell.setCellValue(FacturaDiarioConstantesFunciones.LABEL_RUC);
		cell = row.createCell(iColumn++);cell.setCellValue(FacturaDiarioConstantesFunciones.LABEL_NUMEROAUTORIZA);
		cell = row.createCell(iColumn++);cell.setCellValue(FacturaDiarioConstantesFunciones.LABEL_ESDEVOLUCION);
		cell = row.createCell(iColumn++);cell.setCellValue(FacturaDiarioConstantesFunciones.LABEL_VALORFACTURA);
		cell = row.createCell(iColumn++);cell.setCellValue(FacturaDiarioConstantesFunciones.LABEL_BASEIMPONIBLE);
		cell = row.createCell(iColumn++);cell.setCellValue(FacturaDiarioConstantesFunciones.LABEL_MONTOIVA);
		cell = row.createCell(iColumn++);cell.setCellValue(FacturaDiarioConstantesFunciones.LABEL_BIMTARJETA);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelFacturaDiario(FacturaDiario facturadiario,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(facturadiario.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(facturadiario.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(facturadiario.getsucursal_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(facturadiario.getcliente_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(facturadiario.getperiododeclara_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(facturadiario.gettipoiva_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(facturadiario.getfecha_emision());
		cell = row.createCell(iColumn++);cell.setCellValue(facturadiario.getfecha_vencimiento());
		cell = row.createCell(iColumn++);cell.setCellValue(facturadiario.getnumero_serie());
		cell = row.createCell(iColumn++);cell.setCellValue(facturadiario.getruc());
		cell = row.createCell(iColumn++);cell.setCellValue(facturadiario.getnumero_autoriza());
		cell = row.createCell(iColumn++);cell.setCellValue(facturadiario.getes_devolucion());
		cell = row.createCell(iColumn++);cell.setCellValue(facturadiario.getvalor_factura());
		cell = row.createCell(iColumn++);cell.setCellValue(facturadiario.getbase_imponible());
		cell = row.createCell(iColumn++);cell.setCellValue(facturadiario.getmonto_iva());
		cell = row.createCell(iColumn++);cell.setCellValue(facturadiario.getbim_tarjeta());				
	}
	
	public void setFilaDatosExportarXmlFacturaDiario(FacturaDiario facturadiario,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(FacturaDiarioConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(facturadiario.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(FacturaDiarioConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(facturadiario.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(FacturaDiarioConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(facturadiario.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementsucursal_descripcion = document.createElement(FacturaDiarioConstantesFunciones.IDSUCURSAL);
		elementsucursal_descripcion.appendChild(document.createTextNode(facturadiario.getsucursal_descripcion()));
		element.appendChild(elementsucursal_descripcion);

		Element elementcliente_descripcion = document.createElement(FacturaDiarioConstantesFunciones.IDCLIENTE);
		elementcliente_descripcion.appendChild(document.createTextNode(facturadiario.getcliente_descripcion()));
		element.appendChild(elementcliente_descripcion);

		Element elementperiododeclara_descripcion = document.createElement(FacturaDiarioConstantesFunciones.IDPERIODODECLARA);
		elementperiododeclara_descripcion.appendChild(document.createTextNode(facturadiario.getperiododeclara_descripcion()));
		element.appendChild(elementperiododeclara_descripcion);

		Element elementtipoiva_descripcion = document.createElement(FacturaDiarioConstantesFunciones.IDTIPOIVA);
		elementtipoiva_descripcion.appendChild(document.createTextNode(facturadiario.gettipoiva_descripcion()));
		element.appendChild(elementtipoiva_descripcion);

		Element elementfecha_emision = document.createElement(FacturaDiarioConstantesFunciones.FECHAEMISION);
		elementfecha_emision.appendChild(document.createTextNode(facturadiario.getfecha_emision().toString().trim()));
		element.appendChild(elementfecha_emision);

		Element elementfecha_vencimiento = document.createElement(FacturaDiarioConstantesFunciones.FECHAVENCIMIENTO);
		elementfecha_vencimiento.appendChild(document.createTextNode(facturadiario.getfecha_vencimiento().toString().trim()));
		element.appendChild(elementfecha_vencimiento);

		Element elementnumero_serie = document.createElement(FacturaDiarioConstantesFunciones.NUMEROSERIE);
		elementnumero_serie.appendChild(document.createTextNode(facturadiario.getnumero_serie().trim()));
		element.appendChild(elementnumero_serie);

		Element elementruc = document.createElement(FacturaDiarioConstantesFunciones.RUC);
		elementruc.appendChild(document.createTextNode(facturadiario.getruc().trim()));
		element.appendChild(elementruc);

		Element elementnumero_autoriza = document.createElement(FacturaDiarioConstantesFunciones.NUMEROAUTORIZA);
		elementnumero_autoriza.appendChild(document.createTextNode(facturadiario.getnumero_autoriza().trim()));
		element.appendChild(elementnumero_autoriza);

		Element elementes_devolucion = document.createElement(FacturaDiarioConstantesFunciones.ESDEVOLUCION);
		elementes_devolucion.appendChild(document.createTextNode(facturadiario.getes_devolucion().toString().trim()));
		element.appendChild(elementes_devolucion);

		Element elementvalor_factura = document.createElement(FacturaDiarioConstantesFunciones.VALORFACTURA);
		elementvalor_factura.appendChild(document.createTextNode(facturadiario.getvalor_factura().toString().trim()));
		element.appendChild(elementvalor_factura);

		Element elementbase_imponible = document.createElement(FacturaDiarioConstantesFunciones.BASEIMPONIBLE);
		elementbase_imponible.appendChild(document.createTextNode(facturadiario.getbase_imponible().toString().trim()));
		element.appendChild(elementbase_imponible);

		Element elementmonto_iva = document.createElement(FacturaDiarioConstantesFunciones.MONTOIVA);
		elementmonto_iva.appendChild(document.createTextNode(facturadiario.getmonto_iva().toString().trim()));
		element.appendChild(elementmonto_iva);

		Element elementbim_tarjeta = document.createElement(FacturaDiarioConstantesFunciones.BIMTARJETA);
		elementbim_tarjeta.appendChild(document.createTextNode(facturadiario.getbim_tarjeta().toString().trim()));
		element.appendChild(elementbim_tarjeta);
	}
	
	public void generarReporteGroupGenericoFacturaDiariosSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<FacturaDiario> facturadiariosSeleccionados=new ArrayList<FacturaDiario>();
		
		facturadiariosSeleccionados=this.getFacturaDiariosSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoFacturaDiario(facturadiariosSeleccionados);
		
		this.generarReporteFacturaDiarios("Todos",facturadiariosSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoFacturaDiario(ArrayList<FacturaDiario> facturadiariosSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(FacturaDiario facturadiarioAux:facturadiariosSeleccionados) {
				facturadiarioAux.setsDetalleGeneralEntityReporte(facturadiarioAux.toString());
			
				if(sTipoSeleccionar.equals(FacturaDiarioConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					facturadiarioAux.setsDescripcionGeneralEntityReporte1(facturadiarioAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(FacturaDiarioConstantesFunciones.LABEL_IDSUCURSAL)) {
					existe=true;
					facturadiarioAux.setsDescripcionGeneralEntityReporte1(facturadiarioAux.getsucursal_descripcion());
				}
				 else if(sTipoSeleccionar.equals(FacturaDiarioConstantesFunciones.LABEL_IDCLIENTE)) {
					existe=true;
					facturadiarioAux.setsDescripcionGeneralEntityReporte1(facturadiarioAux.getcliente_descripcion());
				}
				 else if(sTipoSeleccionar.equals(FacturaDiarioConstantesFunciones.LABEL_IDPERIODODECLARA)) {
					existe=true;
					facturadiarioAux.setsDescripcionGeneralEntityReporte1(facturadiarioAux.getperiododeclara_descripcion());
				}
				 else if(sTipoSeleccionar.equals(FacturaDiarioConstantesFunciones.LABEL_IDTIPOIVA)) {
					existe=true;
					facturadiarioAux.setsDescripcionGeneralEntityReporte1(facturadiarioAux.gettipoiva_descripcion());
				}
				 else if(sTipoSeleccionar.equals(FacturaDiarioConstantesFunciones.LABEL_FECHAEMISION)) {
					existe=true;
					facturadiarioAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(facturadiarioAux.getfecha_emision()));
				}
				 else if(sTipoSeleccionar.equals(FacturaDiarioConstantesFunciones.LABEL_FECHAVENCIMIENTO)) {
					existe=true;
					facturadiarioAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(facturadiarioAux.getfecha_vencimiento()));
				}
				 else if(sTipoSeleccionar.equals(FacturaDiarioConstantesFunciones.LABEL_NUMEROSERIE)) {
					existe=true;
					facturadiarioAux.setsDescripcionGeneralEntityReporte1(facturadiarioAux.getnumero_serie());
				}
				 else if(sTipoSeleccionar.equals(FacturaDiarioConstantesFunciones.LABEL_RUC)) {
					existe=true;
					facturadiarioAux.setsDescripcionGeneralEntityReporte1(facturadiarioAux.getruc());
				}
				 else if(sTipoSeleccionar.equals(FacturaDiarioConstantesFunciones.LABEL_NUMEROAUTORIZA)) {
					existe=true;
					facturadiarioAux.setsDescripcionGeneralEntityReporte1(facturadiarioAux.getnumero_autoriza());
				}
				 else if(sTipoSeleccionar.equals(FacturaDiarioConstantesFunciones.LABEL_ESDEVOLUCION)) {
					existe=true;
					facturadiarioAux.setsDescripcionGeneralEntityReporte1(Funciones2.getDescripcionBoolean(facturadiarioAux.getes_devolucion()));
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FacturaDiarioConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesFacturaDiario(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoFacturaDiario=true;
				this.isVisibilidadCeldaNuevoRelacionesFacturaDiario=true;
				this.isVisibilidadCeldaGuardarCambiosFacturaDiario=true;
			}
			
			this.isVisibilidadCeldaModificarFacturaDiario=false;
			this.isVisibilidadCeldaActualizarFacturaDiario=false;
			this.isVisibilidadCeldaEliminarFacturaDiario=false;
			this.isVisibilidadCeldaCancelarFacturaDiario=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarFacturaDiario=true;
				} else {
					this.isVisibilidadCeldaGuardarFacturaDiario=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoFacturaDiario=false;
			this.isVisibilidadCeldaNuevoRelacionesFacturaDiario=false;
			this.isVisibilidadCeldaGuardarCambiosFacturaDiario=false;
			this.isVisibilidadCeldaModificarFacturaDiario=false;
			this.isVisibilidadCeldaActualizarFacturaDiario=true;
			this.isVisibilidadCeldaEliminarFacturaDiario=false;
			this.isVisibilidadCeldaCancelarFacturaDiario=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarFacturaDiario=true;
				} else {
					this.isVisibilidadCeldaGuardarFacturaDiario=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoFacturaDiario=false;
			this.isVisibilidadCeldaNuevoRelacionesFacturaDiario=false;
			this.isVisibilidadCeldaGuardarCambiosFacturaDiario=false;
			this.isVisibilidadCeldaModificarFacturaDiario=false;
			this.isVisibilidadCeldaActualizarFacturaDiario=true;
			this.isVisibilidadCeldaEliminarFacturaDiario=true;
			this.isVisibilidadCeldaCancelarFacturaDiario=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarFacturaDiario=true;
				} else {
					this.isVisibilidadCeldaGuardarFacturaDiario=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoFacturaDiario=false;
			this.isVisibilidadCeldaNuevoRelacionesFacturaDiario=false;
			this.isVisibilidadCeldaGuardarCambiosFacturaDiario=false;
			this.isVisibilidadCeldaModificarFacturaDiario=false;
			this.isVisibilidadCeldaActualizarFacturaDiario=true;
			this.isVisibilidadCeldaEliminarFacturaDiario=false;
			this.isVisibilidadCeldaCancelarFacturaDiario=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarFacturaDiario=false;
				} else {
					this.isVisibilidadCeldaGuardarFacturaDiario=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoFacturaDiario=true;
			this.isVisibilidadCeldaNuevoRelacionesFacturaDiario=true;
			this.isVisibilidadCeldaGuardarCambiosFacturaDiario=true;
			this.isVisibilidadCeldaModificarFacturaDiario=false;
			this.isVisibilidadCeldaActualizarFacturaDiario=false;
			this.isVisibilidadCeldaEliminarFacturaDiario=false;
			this.isVisibilidadCeldaCancelarFacturaDiario=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarFacturaDiario=true;
				} else {
					this.isVisibilidadCeldaGuardarFacturaDiario=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoFacturaDiario=false;
			this.isVisibilidadCeldaNuevoRelacionesFacturaDiario=false;
			this.isVisibilidadCeldaGuardarCambiosFacturaDiario=false;
			this.isVisibilidadCeldaActualizarFacturaDiario=false;
			this.isVisibilidadCeldaEliminarFacturaDiario=false;
			this.isVisibilidadCeldaCancelarFacturaDiario=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarFacturaDiario=false;
				} else {
					this.isVisibilidadCeldaGuardarFacturaDiario=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoFacturaDiario=false;
			this.isVisibilidadCeldaNuevoRelacionesFacturaDiario=false;
			this.isVisibilidadCeldaGuardarCambiosFacturaDiario=false;
			this.isVisibilidadCeldaModificarFacturaDiario=true;
			this.isVisibilidadCeldaActualizarFacturaDiario=false;
			this.isVisibilidadCeldaEliminarFacturaDiario=false;
			this.isVisibilidadCeldaCancelarFacturaDiario=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarFacturaDiario=false;
				} else {
					this.isVisibilidadCeldaGuardarFacturaDiario=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(FacturaDiarioJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoFacturaDiario=true;
			this.isVisibilidadCeldaNuevoRelacionesFacturaDiario=true;
			this.isVisibilidadCeldaGuardarCambiosFacturaDiario=true;
		} else {
			this.actualizarEstadoPanelsFacturaDiario(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarFacturaDiario=false;
			//this.isVisibilidadCeldaVerFormFacturaDiario=false;
			this.isVisibilidadCeldaDuplicarFacturaDiario=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!facturadiarioSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesFacturaDiario=false;
		} else {
			this.isVisibilidadCeldaNuevoFacturaDiario=false;
			this.isVisibilidadCeldaGuardarCambiosFacturaDiario=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(facturadiarioSessionBean.getEsGuardarRelacionado()) {
			if(!facturadiarioSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesFacturaDiario=false;												
			}
			
			this.jButtonCerrarFacturaDiario.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesFacturaDiario=false;
		}
		
		if(!this.permiteMantenimiento(this.facturadiario)) {
			this.isVisibilidadCeldaActualizarFacturaDiario=false;
			this.isVisibilidadCeldaEliminarFacturaDiario=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesFacturaDiario() {
	}
	
	public void actualizarEstadoPanelsFacturaDiario(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionFacturaDiario!=null) {
				this.jScrollPanelDatosEdicionFacturaDiario.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasFacturaDiario!=null) {
				this.jTabbedPaneBusquedasFacturaDiario.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosFacturaDiario!=null) {
				this.jScrollPanelDatosFacturaDiario.setVisible(true);
			}
			
			if(this.jPanelPaginacionFacturaDiario!=null) {
				this.jPanelPaginacionFacturaDiario.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesFacturaDiario!=null) {
				this.jPanelParametrosReportesFacturaDiario.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionFacturaDiario!=null) {
				this.jScrollPanelDatosEdicionFacturaDiario.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasFacturaDiario!=null) {
				this.jTabbedPaneBusquedasFacturaDiario.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosFacturaDiario!=null) {
				this.jScrollPanelDatosFacturaDiario.setVisible(false);
			}
			
			if(this.jPanelPaginacionFacturaDiario!=null) {
				this.jPanelPaginacionFacturaDiario.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesFacturaDiario!=null) {
				this.jPanelParametrosReportesFacturaDiario.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionFacturaDiario!=null) {
				this.jScrollPanelDatosEdicionFacturaDiario.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasFacturaDiario!=null) {
				this.jTabbedPaneBusquedasFacturaDiario.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosFacturaDiario!=null) {
				this.jScrollPanelDatosFacturaDiario.setVisible(false);
			}
			
			if(this.jPanelPaginacionFacturaDiario!=null) {
				this.jPanelPaginacionFacturaDiario.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesFacturaDiario!=null) {
				this.jPanelParametrosReportesFacturaDiario.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionFacturaDiario!=null) {
				this.jScrollPanelDatosEdicionFacturaDiario.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasFacturaDiario!=null) {
				this.jTabbedPaneBusquedasFacturaDiario.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosFacturaDiario!=null) {
				this.jScrollPanelDatosFacturaDiario.setVisible(false);
			}
			
			if(this.jPanelPaginacionFacturaDiario!=null) {
				this.jPanelPaginacionFacturaDiario.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesFacturaDiario!=null) {
				this.jPanelParametrosReportesFacturaDiario.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionFacturaDiario!=null) {
				this.jScrollPanelDatosEdicionFacturaDiario.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasFacturaDiario!=null) {
				this.jTabbedPaneBusquedasFacturaDiario.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosFacturaDiario!=null) {
				this.jScrollPanelDatosFacturaDiario.setVisible(true);
			}
			
			if(this.jPanelPaginacionFacturaDiario!=null) {
				this.jPanelPaginacionFacturaDiario.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesFacturaDiario!=null) {
				this.jPanelParametrosReportesFacturaDiario.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionFacturaDiario!=null) {
				this.jScrollPanelDatosEdicionFacturaDiario.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasFacturaDiario!=null) {
				this.jTabbedPaneBusquedasFacturaDiario.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosFacturaDiario!=null) {
				this.jScrollPanelDatosFacturaDiario.setVisible(true);
			}
			
			if(this.jPanelPaginacionFacturaDiario!=null) {
				this.jPanelPaginacionFacturaDiario.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesFacturaDiario!=null) {
				this.jPanelParametrosReportesFacturaDiario.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionFacturaDiario!=null) {
				this.jScrollPanelDatosEdicionFacturaDiario.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasFacturaDiario!=null) {
				this.jTabbedPaneBusquedasFacturaDiario.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosFacturaDiario!=null) {
				this.jScrollPanelDatosFacturaDiario.setVisible(true);
			}
			
			if(this.jPanelPaginacionFacturaDiario!=null) {
				this.jPanelPaginacionFacturaDiario.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesFacturaDiario!=null) {
				this.jPanelParametrosReportesFacturaDiario.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.facturadiarioSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasFacturaDiario!=null) {
					this.jTabbedPaneBusquedasFacturaDiario.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesFacturaDiario!=null) {
				this.jPanelParametrosReportesFacturaDiario.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.facturadiarioSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasFacturaDiario!=null) {
				this.jTabbedPaneBusquedasFacturaDiario.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesFacturaDiario!=null) {
				this.jPanelParametrosReportesFacturaDiario.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadFK_IdCliente=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdCliente) {this.jTabbedPaneBusquedasFacturaDiario.remove(jPanelFK_IdClienteFacturaDiario);}

			this.isVisibilidadFK_IdPeriodoDeclara=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdPeriodoDeclara) {this.jTabbedPaneBusquedasFacturaDiario.remove(jPanelFK_IdPeriodoDeclaraFacturaDiario);}

			this.isVisibilidadFK_IdTipoIva=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdTipoIva) {this.jTabbedPaneBusquedasFacturaDiario.remove(jPanelFK_IdTipoIvaFacturaDiario);}
		}
		
	}

	public void setVisibilidadBusquedasParaSucursal(Boolean isParaSucursal){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaSucursalNegation=!isParaSucursal;

			this.isVisibilidadFK_IdCliente=isParaSucursalNegation;
			if(!this.isVisibilidadFK_IdCliente) {this.jTabbedPaneBusquedasFacturaDiario.remove(jPanelFK_IdClienteFacturaDiario);}

			this.isVisibilidadFK_IdPeriodoDeclara=isParaSucursalNegation;
			if(!this.isVisibilidadFK_IdPeriodoDeclara) {this.jTabbedPaneBusquedasFacturaDiario.remove(jPanelFK_IdPeriodoDeclaraFacturaDiario);}

			this.isVisibilidadFK_IdTipoIva=isParaSucursalNegation;
			if(!this.isVisibilidadFK_IdTipoIva) {this.jTabbedPaneBusquedasFacturaDiario.remove(jPanelFK_IdTipoIvaFacturaDiario);}
		}
		
	}

	public void setVisibilidadBusquedasParaCliente(Boolean isParaCliente){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaClienteNegation=!isParaCliente;

			this.isVisibilidadFK_IdCliente=isParaCliente;
			if(!this.isVisibilidadFK_IdCliente) {this.jTabbedPaneBusquedasFacturaDiario.remove(jPanelFK_IdClienteFacturaDiario);}

			this.isVisibilidadFK_IdPeriodoDeclara=isParaClienteNegation;
			if(!this.isVisibilidadFK_IdPeriodoDeclara) {this.jTabbedPaneBusquedasFacturaDiario.remove(jPanelFK_IdPeriodoDeclaraFacturaDiario);}

			this.isVisibilidadFK_IdTipoIva=isParaClienteNegation;
			if(!this.isVisibilidadFK_IdTipoIva) {this.jTabbedPaneBusquedasFacturaDiario.remove(jPanelFK_IdTipoIvaFacturaDiario);}
		}
		
	}

	public void setVisibilidadBusquedasParaPeriodoDeclara(Boolean isParaPeriodoDeclara){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaPeriodoDeclaraNegation=!isParaPeriodoDeclara;

			this.isVisibilidadFK_IdCliente=isParaPeriodoDeclaraNegation;
			if(!this.isVisibilidadFK_IdCliente) {this.jTabbedPaneBusquedasFacturaDiario.remove(jPanelFK_IdClienteFacturaDiario);}

			this.isVisibilidadFK_IdPeriodoDeclara=isParaPeriodoDeclara;
			if(!this.isVisibilidadFK_IdPeriodoDeclara) {this.jTabbedPaneBusquedasFacturaDiario.remove(jPanelFK_IdPeriodoDeclaraFacturaDiario);}

			this.isVisibilidadFK_IdTipoIva=isParaPeriodoDeclaraNegation;
			if(!this.isVisibilidadFK_IdTipoIva) {this.jTabbedPaneBusquedasFacturaDiario.remove(jPanelFK_IdTipoIvaFacturaDiario);}
		}
		
	}

	public void setVisibilidadBusquedasParaTipoIva(Boolean isParaTipoIva){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaTipoIvaNegation=!isParaTipoIva;

			this.isVisibilidadFK_IdCliente=isParaTipoIvaNegation;
			if(!this.isVisibilidadFK_IdCliente) {this.jTabbedPaneBusquedasFacturaDiario.remove(jPanelFK_IdClienteFacturaDiario);}

			this.isVisibilidadFK_IdPeriodoDeclara=isParaTipoIvaNegation;
			if(!this.isVisibilidadFK_IdPeriodoDeclara) {this.jTabbedPaneBusquedasFacturaDiario.remove(jPanelFK_IdPeriodoDeclaraFacturaDiario);}

			this.isVisibilidadFK_IdTipoIva=isParaTipoIva;
			if(!this.isVisibilidadFK_IdTipoIva) {this.jTabbedPaneBusquedasFacturaDiario.remove(jPanelFK_IdTipoIvaFacturaDiario);}
		}
		
	}
	
	
	
	

	public String registrarSesionFacturaDiarioParaBusquedaClientes() throws Exception {
		Boolean isPaginaPopupCliente=false;

		try {

			if(facturadiarioSessionBean==null) {
				facturadiarioSessionBean=new FacturaDiarioSessionBean();
			}

			if(clienteSessionBean==null) {
				clienteSessionBean=new ClienteSessionBean();
			}

			clienteSessionBean.setsPathNavegacionActual(facturadiarioSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+ClienteConstantesFunciones.SCLASSWEBTITULO);
			clienteSessionBean.setisPermiteRecargarInformacion(false);
			clienteSessionBean.setisPaginaPopup(true);
			isPaginaPopupCliente=clienteSessionBean.getisPaginaPopup();
			clienteSessionBean.setisPaginaPopup(false);
			clienteSessionBean.setEstaModoBusqueda(true);
			clienteSessionBean.setsFuncionBusquedaRapida("window.opener.facturadiarioFuncionGeneral.setCombosCodigoDesdeBusquedaid_cliente(TO_REPLACE);");
			clienteSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeCliente(true);
			clienteSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeCliente(FacturaDiarioConstantesFunciones.SNOMBREOPCION);
			//clienteSessionBean.setisBusquedaDesdeForeignKeySesionFacturaDiario(true);
			//clienteSessionBean.setlidFacturaDiarioActual(this.idFacturaDiarioActual);

			facturadiarioSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyFacturaDiario(true);
			facturadiarioSessionBean.setlIdFacturaDiarioActualForeignKey(this.idFacturaDiarioActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
			return "";
	}
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//FacturaDiarioSessionBean facturadiarioSessionBean=new FacturaDiarioSessionBean();
		
		if(this.facturadiarioSessionBean==null) {
			this.facturadiarioSessionBean=new FacturaDiarioSessionBean();
		}
		
		this.facturadiarioSessionBean.setsUltimaBusquedaFacturaDiario(this.getsAccionBusqueda());
		this.facturadiarioSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.facturadiarioSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdCliente")) {
			facturadiarioSessionBean.setid_cliente(this.getid_clienteFK_IdCliente());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			facturadiarioSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdPeriodoDeclara")) {
			facturadiarioSessionBean.setid_periodo_declara(this.getid_periodo_declaraFK_IdPeriodoDeclara());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdSucursal")) {
			facturadiarioSessionBean.setid_sucursal(this.getid_sucursalFK_IdSucursal());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdTipoIva")) {
			facturadiarioSessionBean.setid_tipo_iva(this.getid_tipo_ivaFK_IdTipoIva());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//FacturaDiarioSessionBean facturadiarioSessionBean=new FacturaDiarioSessionBean();
		
		if(this.facturadiarioSessionBean==null) {
			this.facturadiarioSessionBean=new FacturaDiarioSessionBean();
		}
		
		if(this.facturadiarioSessionBean.getsUltimaBusquedaFacturaDiario()!=null&&!this.facturadiarioSessionBean.getsUltimaBusquedaFacturaDiario().equals("")) {
			this.setsAccionBusqueda(facturadiarioSessionBean.getsUltimaBusquedaFacturaDiario());
			this.setiNumeroPaginacion(facturadiarioSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(facturadiarioSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdCliente")) {
				this.setid_clienteFK_IdCliente(facturadiarioSessionBean.getid_cliente());
				facturadiarioSessionBean.setid_cliente(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(facturadiarioSessionBean.getid_empresa());
				facturadiarioSessionBean.setid_empresa(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdPeriodoDeclara")) {
				this.setid_periodo_declaraFK_IdPeriodoDeclara(facturadiarioSessionBean.getid_periodo_declara());
				facturadiarioSessionBean.setid_periodo_declara(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdSucursal")) {
				this.setid_sucursalFK_IdSucursal(facturadiarioSessionBean.getid_sucursal());
				facturadiarioSessionBean.setid_sucursal(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdTipoIva")) {
				this.setid_tipo_ivaFK_IdTipoIva(facturadiarioSessionBean.getid_tipo_iva());
				facturadiarioSessionBean.setid_tipo_iva(-1L);
			}
		}
		
		this.facturadiarioSessionBean.setsUltimaBusquedaFacturaDiario("");
		this.facturadiarioSessionBean.setiNumeroPaginacion(FacturaDiarioConstantesFunciones.INUMEROPAGINACION);
		this.facturadiarioSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaFacturaDiario(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioFacturaDiario() {
		this.updateBorderResaltarBusquedasFormularioFacturaDiario();
		this.updateVisibilidadBusquedasFormularioFacturaDiario();
		this.updateHabilitarBusquedasFormularioFacturaDiario();
	}
	
	public void updateBorderResaltarBusquedasFormularioFacturaDiario() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasFacturaDiario.getComponents().length>0) {
	

		if(this.facturadiarioConstantesFunciones.resaltarFK_IdClienteFacturaDiario!=null) {
			index= this.jTabbedPaneBusquedasFacturaDiario.indexOfComponent(this.jPanelFK_IdClienteFacturaDiario);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasFacturaDiario.getComponent(index);
				jPanel.setBorder(this.facturadiarioConstantesFunciones.resaltarFK_IdClienteFacturaDiario);
			}
		}

		if(this.facturadiarioConstantesFunciones.resaltarFK_IdPeriodoDeclaraFacturaDiario!=null) {
			index= this.jTabbedPaneBusquedasFacturaDiario.indexOfComponent(this.jPanelFK_IdPeriodoDeclaraFacturaDiario);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasFacturaDiario.getComponent(index);
				jPanel.setBorder(this.facturadiarioConstantesFunciones.resaltarFK_IdPeriodoDeclaraFacturaDiario);
			}
		}

		if(this.facturadiarioConstantesFunciones.resaltarFK_IdTipoIvaFacturaDiario!=null) {
			index= this.jTabbedPaneBusquedasFacturaDiario.indexOfComponent(this.jPanelFK_IdTipoIvaFacturaDiario);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasFacturaDiario.getComponent(index);
				jPanel.setBorder(this.facturadiarioConstantesFunciones.resaltarFK_IdTipoIvaFacturaDiario);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioFacturaDiario() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasFacturaDiario.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasFacturaDiario.indexOfComponent(this.jPanelFK_IdClienteFacturaDiario);
			jPanel=(JPanel)this.jTabbedPaneBusquedasFacturaDiario.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.facturadiarioConstantesFunciones.mostrarFK_IdClienteFacturaDiario);
			if(!this.facturadiarioConstantesFunciones.mostrarFK_IdClienteFacturaDiario && index>-1) {
				this.jTabbedPaneBusquedasFacturaDiario.remove(index);
			}

			index= this.jTabbedPaneBusquedasFacturaDiario.indexOfComponent(this.jPanelFK_IdPeriodoDeclaraFacturaDiario);
			jPanel=(JPanel)this.jTabbedPaneBusquedasFacturaDiario.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.facturadiarioConstantesFunciones.mostrarFK_IdPeriodoDeclaraFacturaDiario);
			if(!this.facturadiarioConstantesFunciones.mostrarFK_IdPeriodoDeclaraFacturaDiario && index>-1) {
				this.jTabbedPaneBusquedasFacturaDiario.remove(index);
			}

			index= this.jTabbedPaneBusquedasFacturaDiario.indexOfComponent(this.jPanelFK_IdTipoIvaFacturaDiario);
			jPanel=(JPanel)this.jTabbedPaneBusquedasFacturaDiario.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.facturadiarioConstantesFunciones.mostrarFK_IdTipoIvaFacturaDiario);
			if(!this.facturadiarioConstantesFunciones.mostrarFK_IdTipoIvaFacturaDiario && index>-1) {
				this.jTabbedPaneBusquedasFacturaDiario.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioFacturaDiario() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasFacturaDiario.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasFacturaDiario.indexOfComponent(this.jPanelFK_IdClienteFacturaDiario);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasFacturaDiario.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.facturadiarioConstantesFunciones.activarFK_IdClienteFacturaDiario);
				this.jTabbedPaneBusquedasFacturaDiario.setEnabledAt(index,this.facturadiarioConstantesFunciones.activarFK_IdClienteFacturaDiario);
			}

			index= this.jTabbedPaneBusquedasFacturaDiario.indexOfComponent(this.jPanelFK_IdPeriodoDeclaraFacturaDiario);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasFacturaDiario.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.facturadiarioConstantesFunciones.activarFK_IdPeriodoDeclaraFacturaDiario);
				this.jTabbedPaneBusquedasFacturaDiario.setEnabledAt(index,this.facturadiarioConstantesFunciones.activarFK_IdPeriodoDeclaraFacturaDiario);
			}

			index= this.jTabbedPaneBusquedasFacturaDiario.indexOfComponent(this.jPanelFK_IdTipoIvaFacturaDiario);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasFacturaDiario.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.facturadiarioConstantesFunciones.activarFK_IdTipoIvaFacturaDiario);
				this.jTabbedPaneBusquedasFacturaDiario.setEnabledAt(index,this.facturadiarioConstantesFunciones.activarFK_IdTipoIvaFacturaDiario);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaFacturaDiario(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("FK_IdCliente")) {
			index= this.jTabbedPaneBusquedasFacturaDiario.indexOfComponent(this.jPanelFK_IdClienteFacturaDiario);

			this.jTabbedPaneBusquedasFacturaDiario.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasFacturaDiario.getComponent(index);

			this.facturadiarioConstantesFunciones.setResaltarFK_IdClienteFacturaDiario(resaltar);

			jPanel.setBorder(this.facturadiarioConstantesFunciones.resaltarFK_IdClienteFacturaDiario);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdPeriodoDeclara")) {
			index= this.jTabbedPaneBusquedasFacturaDiario.indexOfComponent(this.jPanelFK_IdPeriodoDeclaraFacturaDiario);

			this.jTabbedPaneBusquedasFacturaDiario.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasFacturaDiario.getComponent(index);

			this.facturadiarioConstantesFunciones.setResaltarFK_IdPeriodoDeclaraFacturaDiario(resaltar);

			jPanel.setBorder(this.facturadiarioConstantesFunciones.resaltarFK_IdPeriodoDeclaraFacturaDiario);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdTipoIva")) {
			index= this.jTabbedPaneBusquedasFacturaDiario.indexOfComponent(this.jPanelFK_IdTipoIvaFacturaDiario);

			this.jTabbedPaneBusquedasFacturaDiario.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasFacturaDiario.getComponent(index);

			this.facturadiarioConstantesFunciones.setResaltarFK_IdTipoIvaFacturaDiario(resaltar);

			jPanel.setBorder(this.facturadiarioConstantesFunciones.resaltarFK_IdTipoIvaFacturaDiario);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarFacturaDiario.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioFacturaDiario() throws Exception {

		if(this.jInternalFrameDetalleFormFacturaDiario==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioFacturaDiario();
		this.updateVisibilidadResaltarControlesFormularioFacturaDiario();
		this.updateHabilitarResaltarControlesFormularioFacturaDiario();
		
	}
	
	public void updateBorderResaltarControlesFormularioFacturaDiario() throws Exception {
		if(this.jInternalFrameDetalleFormFacturaDiario==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.facturadiarioConstantesFunciones.resaltaridFacturaDiario!=null && this.jInternalFrameDetalleFormFacturaDiario!=null) {this.jInternalFrameDetalleFormFacturaDiario.jLabelidFacturaDiario.setBorder(this.facturadiarioConstantesFunciones.resaltaridFacturaDiario);}
		if(this.facturadiarioConstantesFunciones.resaltarid_empresaFacturaDiario!=null && this.jInternalFrameDetalleFormFacturaDiario!=null) {this.jInternalFrameDetalleFormFacturaDiario.jComboBoxid_empresaFacturaDiario.setBorder(this.facturadiarioConstantesFunciones.resaltarid_empresaFacturaDiario);}
		if(this.facturadiarioConstantesFunciones.resaltarid_sucursalFacturaDiario!=null && this.jInternalFrameDetalleFormFacturaDiario!=null) {this.jInternalFrameDetalleFormFacturaDiario.jComboBoxid_sucursalFacturaDiario.setBorder(this.facturadiarioConstantesFunciones.resaltarid_sucursalFacturaDiario);}
		if(this.facturadiarioConstantesFunciones.resaltarid_clienteFacturaDiario!=null && this.jInternalFrameDetalleFormFacturaDiario!=null) {this.jInternalFrameDetalleFormFacturaDiario.jComboBoxid_clienteFacturaDiario.setBorder(this.facturadiarioConstantesFunciones.resaltarid_clienteFacturaDiario);}
		if(this.facturadiarioConstantesFunciones.resaltarid_periodo_declaraFacturaDiario!=null && this.jInternalFrameDetalleFormFacturaDiario!=null) {this.jInternalFrameDetalleFormFacturaDiario.jComboBoxid_periodo_declaraFacturaDiario.setBorder(this.facturadiarioConstantesFunciones.resaltarid_periodo_declaraFacturaDiario);}
		if(this.facturadiarioConstantesFunciones.resaltarid_tipo_ivaFacturaDiario!=null && this.jInternalFrameDetalleFormFacturaDiario!=null) {this.jInternalFrameDetalleFormFacturaDiario.jComboBoxid_tipo_ivaFacturaDiario.setBorder(this.facturadiarioConstantesFunciones.resaltarid_tipo_ivaFacturaDiario);}
		if(this.facturadiarioConstantesFunciones.resaltarfecha_emisionFacturaDiario!=null && this.jInternalFrameDetalleFormFacturaDiario!=null) {this.jInternalFrameDetalleFormFacturaDiario.jDateChooserfecha_emisionFacturaDiario.setBorder(this.facturadiarioConstantesFunciones.resaltarfecha_emisionFacturaDiario);}
		if(this.facturadiarioConstantesFunciones.resaltarfecha_vencimientoFacturaDiario!=null && this.jInternalFrameDetalleFormFacturaDiario!=null) {this.jInternalFrameDetalleFormFacturaDiario.jDateChooserfecha_vencimientoFacturaDiario.setBorder(this.facturadiarioConstantesFunciones.resaltarfecha_vencimientoFacturaDiario);}
		if(this.facturadiarioConstantesFunciones.resaltarnumero_serieFacturaDiario!=null && this.jInternalFrameDetalleFormFacturaDiario!=null) {this.jInternalFrameDetalleFormFacturaDiario.jTextFieldnumero_serieFacturaDiario.setBorder(this.facturadiarioConstantesFunciones.resaltarnumero_serieFacturaDiario);}
		if(this.facturadiarioConstantesFunciones.resaltarrucFacturaDiario!=null && this.jInternalFrameDetalleFormFacturaDiario!=null) {this.jInternalFrameDetalleFormFacturaDiario.jTextFieldrucFacturaDiario.setBorder(this.facturadiarioConstantesFunciones.resaltarrucFacturaDiario);}
		if(this.facturadiarioConstantesFunciones.resaltarnumero_autorizaFacturaDiario!=null && this.jInternalFrameDetalleFormFacturaDiario!=null) {this.jInternalFrameDetalleFormFacturaDiario.jTextFieldnumero_autorizaFacturaDiario.setBorder(this.facturadiarioConstantesFunciones.resaltarnumero_autorizaFacturaDiario);}
		if(this.facturadiarioConstantesFunciones.resaltares_devolucionFacturaDiario!=null && this.jInternalFrameDetalleFormFacturaDiario!=null) {this.jInternalFrameDetalleFormFacturaDiario.jCheckBoxes_devolucionFacturaDiario.setBorderPainted(true);this.jInternalFrameDetalleFormFacturaDiario.jCheckBoxes_devolucionFacturaDiario.setBorder(this.facturadiarioConstantesFunciones.resaltares_devolucionFacturaDiario);}
		if(this.facturadiarioConstantesFunciones.resaltarvalor_facturaFacturaDiario!=null && this.jInternalFrameDetalleFormFacturaDiario!=null) {this.jInternalFrameDetalleFormFacturaDiario.jTextFieldvalor_facturaFacturaDiario.setBorder(this.facturadiarioConstantesFunciones.resaltarvalor_facturaFacturaDiario);}
		if(this.facturadiarioConstantesFunciones.resaltarbase_imponibleFacturaDiario!=null && this.jInternalFrameDetalleFormFacturaDiario!=null) {this.jInternalFrameDetalleFormFacturaDiario.jTextFieldbase_imponibleFacturaDiario.setBorder(this.facturadiarioConstantesFunciones.resaltarbase_imponibleFacturaDiario);}
		if(this.facturadiarioConstantesFunciones.resaltarmonto_ivaFacturaDiario!=null && this.jInternalFrameDetalleFormFacturaDiario!=null) {this.jInternalFrameDetalleFormFacturaDiario.jTextFieldmonto_ivaFacturaDiario.setBorder(this.facturadiarioConstantesFunciones.resaltarmonto_ivaFacturaDiario);}
		if(this.facturadiarioConstantesFunciones.resaltarbim_tarjetaFacturaDiario!=null && this.jInternalFrameDetalleFormFacturaDiario!=null) {this.jInternalFrameDetalleFormFacturaDiario.jTextFieldbim_tarjetaFacturaDiario.setBorder(this.facturadiarioConstantesFunciones.resaltarbim_tarjetaFacturaDiario);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioFacturaDiario() throws Exception {		
		if(this.jInternalFrameDetalleFormFacturaDiario==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormFacturaDiario!=null) {
	
		//this.jInternalFrameDetalleFormFacturaDiario.jLabelidFacturaDiario.setVisible(this.facturadiarioConstantesFunciones.mostraridFacturaDiario);
		this.jInternalFrameDetalleFormFacturaDiario.jPanelidFacturaDiario.setVisible(this.facturadiarioConstantesFunciones.mostraridFacturaDiario);
		//this.jInternalFrameDetalleFormFacturaDiario.jComboBoxid_empresaFacturaDiario.setVisible(this.facturadiarioConstantesFunciones.mostrarid_empresaFacturaDiario);
		this.jInternalFrameDetalleFormFacturaDiario.jPanelid_empresaFacturaDiario.setVisible(this.facturadiarioConstantesFunciones.mostrarid_empresaFacturaDiario);
		//this.jInternalFrameDetalleFormFacturaDiario.jComboBoxid_sucursalFacturaDiario.setVisible(this.facturadiarioConstantesFunciones.mostrarid_sucursalFacturaDiario);
		this.jInternalFrameDetalleFormFacturaDiario.jPanelid_sucursalFacturaDiario.setVisible(this.facturadiarioConstantesFunciones.mostrarid_sucursalFacturaDiario);
		//this.jInternalFrameDetalleFormFacturaDiario.jComboBoxid_clienteFacturaDiario.setVisible(this.facturadiarioConstantesFunciones.mostrarid_clienteFacturaDiario);
		this.jInternalFrameDetalleFormFacturaDiario.jPanelid_clienteFacturaDiario.setVisible(this.facturadiarioConstantesFunciones.mostrarid_clienteFacturaDiario);
			this.jInternalFrameDetalleFormFacturaDiario.jButtonid_clienteFacturaDiario.setVisible(this.facturadiarioConstantesFunciones.mostrarid_clienteFacturaDiario);
		//this.jInternalFrameDetalleFormFacturaDiario.jComboBoxid_periodo_declaraFacturaDiario.setVisible(this.facturadiarioConstantesFunciones.mostrarid_periodo_declaraFacturaDiario);
		this.jInternalFrameDetalleFormFacturaDiario.jPanelid_periodo_declaraFacturaDiario.setVisible(this.facturadiarioConstantesFunciones.mostrarid_periodo_declaraFacturaDiario);
		//this.jInternalFrameDetalleFormFacturaDiario.jComboBoxid_tipo_ivaFacturaDiario.setVisible(this.facturadiarioConstantesFunciones.mostrarid_tipo_ivaFacturaDiario);
		this.jInternalFrameDetalleFormFacturaDiario.jPanelid_tipo_ivaFacturaDiario.setVisible(this.facturadiarioConstantesFunciones.mostrarid_tipo_ivaFacturaDiario);
		//this.jInternalFrameDetalleFormFacturaDiario.jDateChooserfecha_emisionFacturaDiario.setVisible(this.facturadiarioConstantesFunciones.mostrarfecha_emisionFacturaDiario);
		this.jInternalFrameDetalleFormFacturaDiario.jPanelfecha_emisionFacturaDiario.setVisible(this.facturadiarioConstantesFunciones.mostrarfecha_emisionFacturaDiario);
		//this.jInternalFrameDetalleFormFacturaDiario.jDateChooserfecha_vencimientoFacturaDiario.setVisible(this.facturadiarioConstantesFunciones.mostrarfecha_vencimientoFacturaDiario);
		this.jInternalFrameDetalleFormFacturaDiario.jPanelfecha_vencimientoFacturaDiario.setVisible(this.facturadiarioConstantesFunciones.mostrarfecha_vencimientoFacturaDiario);
		//this.jInternalFrameDetalleFormFacturaDiario.jTextFieldnumero_serieFacturaDiario.setVisible(this.facturadiarioConstantesFunciones.mostrarnumero_serieFacturaDiario);
		this.jInternalFrameDetalleFormFacturaDiario.jPanelnumero_serieFacturaDiario.setVisible(this.facturadiarioConstantesFunciones.mostrarnumero_serieFacturaDiario);
		//this.jInternalFrameDetalleFormFacturaDiario.jTextFieldrucFacturaDiario.setVisible(this.facturadiarioConstantesFunciones.mostrarrucFacturaDiario);
		this.jInternalFrameDetalleFormFacturaDiario.jPanelrucFacturaDiario.setVisible(this.facturadiarioConstantesFunciones.mostrarrucFacturaDiario);
		//this.jInternalFrameDetalleFormFacturaDiario.jTextFieldnumero_autorizaFacturaDiario.setVisible(this.facturadiarioConstantesFunciones.mostrarnumero_autorizaFacturaDiario);
		this.jInternalFrameDetalleFormFacturaDiario.jPanelnumero_autorizaFacturaDiario.setVisible(this.facturadiarioConstantesFunciones.mostrarnumero_autorizaFacturaDiario);
		//this.jInternalFrameDetalleFormFacturaDiario.jCheckBoxes_devolucionFacturaDiario.setVisible(this.facturadiarioConstantesFunciones.mostrares_devolucionFacturaDiario);
		this.jInternalFrameDetalleFormFacturaDiario.jPaneles_devolucionFacturaDiario.setVisible(this.facturadiarioConstantesFunciones.mostrares_devolucionFacturaDiario);
		//this.jInternalFrameDetalleFormFacturaDiario.jTextFieldvalor_facturaFacturaDiario.setVisible(this.facturadiarioConstantesFunciones.mostrarvalor_facturaFacturaDiario);
		this.jInternalFrameDetalleFormFacturaDiario.jPanelvalor_facturaFacturaDiario.setVisible(this.facturadiarioConstantesFunciones.mostrarvalor_facturaFacturaDiario);
		//this.jInternalFrameDetalleFormFacturaDiario.jTextFieldbase_imponibleFacturaDiario.setVisible(this.facturadiarioConstantesFunciones.mostrarbase_imponibleFacturaDiario);
		this.jInternalFrameDetalleFormFacturaDiario.jPanelbase_imponibleFacturaDiario.setVisible(this.facturadiarioConstantesFunciones.mostrarbase_imponibleFacturaDiario);
		//this.jInternalFrameDetalleFormFacturaDiario.jTextFieldmonto_ivaFacturaDiario.setVisible(this.facturadiarioConstantesFunciones.mostrarmonto_ivaFacturaDiario);
		this.jInternalFrameDetalleFormFacturaDiario.jPanelmonto_ivaFacturaDiario.setVisible(this.facturadiarioConstantesFunciones.mostrarmonto_ivaFacturaDiario);
		//this.jInternalFrameDetalleFormFacturaDiario.jTextFieldbim_tarjetaFacturaDiario.setVisible(this.facturadiarioConstantesFunciones.mostrarbim_tarjetaFacturaDiario);
		this.jInternalFrameDetalleFormFacturaDiario.jPanelbim_tarjetaFacturaDiario.setVisible(this.facturadiarioConstantesFunciones.mostrarbim_tarjetaFacturaDiario);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioFacturaDiario() throws Exception {
		if(this.jInternalFrameDetalleFormFacturaDiario==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormFacturaDiario!=null) {
	
		this.jInternalFrameDetalleFormFacturaDiario.jLabelidFacturaDiario.setEnabled(this.facturadiarioConstantesFunciones.activaridFacturaDiario);
		this.jInternalFrameDetalleFormFacturaDiario.jComboBoxid_empresaFacturaDiario.setEnabled(this.facturadiarioConstantesFunciones.activarid_empresaFacturaDiario);
		this.jInternalFrameDetalleFormFacturaDiario.jComboBoxid_sucursalFacturaDiario.setEnabled(this.facturadiarioConstantesFunciones.activarid_sucursalFacturaDiario);
		this.jInternalFrameDetalleFormFacturaDiario.jComboBoxid_clienteFacturaDiario.setEnabled(this.facturadiarioConstantesFunciones.activarid_clienteFacturaDiario);
			this.jInternalFrameDetalleFormFacturaDiario.jButtonid_clienteFacturaDiario.setEnabled(this.facturadiarioConstantesFunciones.activarid_clienteFacturaDiario);
		this.jInternalFrameDetalleFormFacturaDiario.jComboBoxid_periodo_declaraFacturaDiario.setEnabled(this.facturadiarioConstantesFunciones.activarid_periodo_declaraFacturaDiario);
		this.jInternalFrameDetalleFormFacturaDiario.jComboBoxid_tipo_ivaFacturaDiario.setEnabled(this.facturadiarioConstantesFunciones.activarid_tipo_ivaFacturaDiario);
		this.jInternalFrameDetalleFormFacturaDiario.jDateChooserfecha_emisionFacturaDiario.setEnabled(this.facturadiarioConstantesFunciones.activarfecha_emisionFacturaDiario);
		this.jInternalFrameDetalleFormFacturaDiario.jDateChooserfecha_vencimientoFacturaDiario.setEnabled(this.facturadiarioConstantesFunciones.activarfecha_vencimientoFacturaDiario);
		this.jInternalFrameDetalleFormFacturaDiario.jTextFieldnumero_serieFacturaDiario.setEnabled(this.facturadiarioConstantesFunciones.activarnumero_serieFacturaDiario);
		this.jInternalFrameDetalleFormFacturaDiario.jTextFieldrucFacturaDiario.setEnabled(this.facturadiarioConstantesFunciones.activarrucFacturaDiario);
		this.jInternalFrameDetalleFormFacturaDiario.jTextFieldnumero_autorizaFacturaDiario.setEnabled(this.facturadiarioConstantesFunciones.activarnumero_autorizaFacturaDiario);
		this.jInternalFrameDetalleFormFacturaDiario.jCheckBoxes_devolucionFacturaDiario.setEnabled(this.facturadiarioConstantesFunciones.activares_devolucionFacturaDiario);
		this.jInternalFrameDetalleFormFacturaDiario.jTextFieldvalor_facturaFacturaDiario.setEnabled(this.facturadiarioConstantesFunciones.activarvalor_facturaFacturaDiario);
		this.jInternalFrameDetalleFormFacturaDiario.jTextFieldbase_imponibleFacturaDiario.setEnabled(this.facturadiarioConstantesFunciones.activarbase_imponibleFacturaDiario);
		this.jInternalFrameDetalleFormFacturaDiario.jTextFieldmonto_ivaFacturaDiario.setEnabled(this.facturadiarioConstantesFunciones.activarmonto_ivaFacturaDiario);
		this.jInternalFrameDetalleFormFacturaDiario.jTextFieldbim_tarjetaFacturaDiario.setEnabled(this.facturadiarioConstantesFunciones.activarbim_tarjetaFacturaDiario);
		}
	}
	
		
}