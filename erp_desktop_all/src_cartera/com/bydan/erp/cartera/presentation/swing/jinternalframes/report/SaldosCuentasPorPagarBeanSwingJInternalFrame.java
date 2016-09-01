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
package com.bydan.erp.cartera.presentation.swing.jinternalframes.report;




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

//import com.bydan.erp.cartera.util.SaldosCuentasPorPagarConstantesFunciones;
import com.bydan.erp.cartera.util.report.SaldosCuentasPorPagarParameterReturnGeneral;
//import com.bydan.erp.cartera.util.report.SaldosCuentasPorPagarParameterGeneral;
//import com.bydan.erp.cartera.presentation.report.source.report.SaldosCuentasPorPagarBean;
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

import com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar.report.*;
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
import com.bydan.erp.cartera.resources.reportes.report.AuxiliarReportes;

import com.bydan.erp.cartera.util.*;

import com.bydan.erp.cartera.util.report.*;
import com.bydan.erp.cartera.business.logic.report.*;

import com.bydan.erp.seguridad.business.logic.*;
import com.bydan.erp.cartera.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.cartera.business.entity.report.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;

import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar.*;






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

//import org.hibernate.collection.PersistentBag;

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
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.report.*;

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
import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.cartera.util.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class SaldosCuentasPorPagarBeanSwingJInternalFrame extends SaldosCuentasPorPagarJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(SaldosCuentasPorPagarBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<SaldosCuentasPorPagar> saldoscuentasporpagarValidator = new ClassValidator<SaldosCuentasPorPagar>(SaldosCuentasPorPagar.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public SaldosCuentasPorPagar saldoscuentasporpagar;	
	public SaldosCuentasPorPagar saldoscuentasporpagarAux;
	public SaldosCuentasPorPagar saldoscuentasporpagarAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public SaldosCuentasPorPagar saldoscuentasporpagarTotales;
	public Long idSaldosCuentasPorPagarActual;
	public Long iIdNuevoSaldosCuentasPorPagar=0L;
	public int rowIndexActual=0;
	
	
	
	
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

	public String sFinalQueryComboGrupoCliente="";

	public List<GrupoCliente> grupoclientesForeignKey;

	public List<GrupoCliente> getgrupoclientesForeignKey() {
		return grupoclientesForeignKey;
	}

	public void setgrupoclientesForeignKey(List<GrupoCliente> grupoclientesForeignKey) {
		this.grupoclientesForeignKey = grupoclientesForeignKey;
	}

	//OBJETO FK ACTUAL
	public GrupoCliente grupoclienteForeignKey;

	public GrupoCliente getgrupoclienteForeignKey() {
		return grupoclienteForeignKey;
	}

	public void setgrupoclienteForeignKey(GrupoCliente grupoclienteForeignKey) {
		this.grupoclienteForeignKey = grupoclienteForeignKey;
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
	
	public Boolean isPermisoTodoSaldosCuentasPorPagar;
	public Boolean isPermisoNuevoSaldosCuentasPorPagar;
	public Boolean isPermisoActualizarSaldosCuentasPorPagar;
	public Boolean isPermisoActualizarOriginalSaldosCuentasPorPagar;
	public Boolean isPermisoEliminarSaldosCuentasPorPagar;
	public Boolean isPermisoGuardarCambiosSaldosCuentasPorPagar;
	public Boolean isPermisoConsultaSaldosCuentasPorPagar;
	public Boolean isPermisoBusquedaSaldosCuentasPorPagar;
	public Boolean isPermisoReporteSaldosCuentasPorPagar;
	public Boolean isPermisoPaginacionMedioSaldosCuentasPorPagar;
	public Boolean isPermisoPaginacionAltoSaldosCuentasPorPagar;
	public Boolean isPermisoPaginacionTodoSaldosCuentasPorPagar;
	public Boolean isPermisoCopiarSaldosCuentasPorPagar;
	public Boolean isPermisoVerFormSaldosCuentasPorPagar;
	public Boolean isPermisoDuplicarSaldosCuentasPorPagar;
	public Boolean isPermisoOrdenSaldosCuentasPorPagar;
	
	
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
	
	public SaldosCuentasPorPagarParameterReturnGeneral saldoscuentasporpagarReturnGeneral;
	public SaldosCuentasPorPagarParameterReturnGeneral saldoscuentasporpagarParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoSaldosCuentasPorPagar=false;
	public Boolean esParaAccionDesdeFormularioSaldosCuentasPorPagar=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected SaldosCuentasPorPagarSessionBeanAdditional saldoscuentasporpagarSessionBeanAdditional=null;
	
	public SaldosCuentasPorPagarSessionBeanAdditional getSaldosCuentasPorPagarSessionBeanAdditional() {
		return this.saldoscuentasporpagarSessionBeanAdditional;
	}
	
	public void setSaldosCuentasPorPagarSessionBeanAdditional(SaldosCuentasPorPagarSessionBeanAdditional saldoscuentasporpagarSessionBeanAdditional) {
		try {
			this.saldoscuentasporpagarSessionBeanAdditional=saldoscuentasporpagarSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected SaldosCuentasPorPagarBeanSwingJInternalFrameAdditional saldoscuentasporpagarBeanSwingJInternalFrameAdditional=null;
	//public class SaldosCuentasPorPagarBeanSwingJInternalFrame
	
	public SaldosCuentasPorPagarBeanSwingJInternalFrameAdditional getSaldosCuentasPorPagarBeanSwingJInternalFrameAdditional() {
		return this.saldoscuentasporpagarBeanSwingJInternalFrameAdditional;
	}
	
	public void setSaldosCuentasPorPagarBeanSwingJInternalFrameAdditional(SaldosCuentasPorPagarBeanSwingJInternalFrameAdditional saldoscuentasporpagarBeanSwingJInternalFrameAdditional) {
		try {
			this.saldoscuentasporpagarBeanSwingJInternalFrameAdditional=saldoscuentasporpagarBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public SaldosCuentasPorPagarLogic saldoscuentasporpagarLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public SaldosCuentasPorPagar saldoscuentasporpagarBean;
	public SaldosCuentasPorPagarConstantesFunciones saldoscuentasporpagarConstantesFunciones;
	//public SaldosCuentasPorPagarParameterReturnGeneral saldoscuentasporpagarReturnGeneral;
	
	//FK
	
	public ZonaLogic zonaLogic;
	public GrupoClienteLogic grupoclienteLogic;
	public EmpresaLogic empresaLogic;
	public SucursalLogic sucursalLogic;
	public ClienteLogic clienteLogic;
	
	//PARAMETROS
	
	
	//public List<SaldosCuentasPorPagar> saldoscuentasporpagars;	
	//public List<SaldosCuentasPorPagar> saldoscuentasporpagarsEliminados;
	//public List<SaldosCuentasPorPagar> saldoscuentasporpagarsAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoSaldosCuentasPorPagar=false;
	public Boolean isVisibilidadCeldaDuplicarSaldosCuentasPorPagar=true;
	public Boolean isVisibilidadCeldaCopiarSaldosCuentasPorPagar=true;
	public Boolean isVisibilidadCeldaVerFormSaldosCuentasPorPagar=true;
	public Boolean isVisibilidadCeldaOrdenSaldosCuentasPorPagar=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesSaldosCuentasPorPagar=false;
	public Boolean isVisibilidadCeldaModificarSaldosCuentasPorPagar=false;
	public Boolean isVisibilidadCeldaActualizarSaldosCuentasPorPagar=false;
	public Boolean isVisibilidadCeldaEliminarSaldosCuentasPorPagar=false;
	public Boolean isVisibilidadCeldaCancelarSaldosCuentasPorPagar=false;
	public Boolean isVisibilidadCeldaGuardarSaldosCuentasPorPagar=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosSaldosCuentasPorPagar=false;	
	
	
	public Boolean isVisibilidadBusquedaSaldosCuentasPorPagar=false;
	public Boolean isVisibilidadFK_IdCliente=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	public Boolean isVisibilidadFK_IdGrupoCliente=false;
	public Boolean isVisibilidadFK_IdSucursal=false;
	public Boolean isVisibilidadFK_IdZona=false;
	
	public Long getiIdNuevoSaldosCuentasPorPagar() {
		return this.iIdNuevoSaldosCuentasPorPagar;
	}

	public void setiIdNuevoSaldosCuentasPorPagar(Long iIdNuevoSaldosCuentasPorPagar) {
		this.iIdNuevoSaldosCuentasPorPagar = iIdNuevoSaldosCuentasPorPagar;
	}
	
	public Long getidSaldosCuentasPorPagarActual() {
		return this.idSaldosCuentasPorPagarActual;
	}

	public void setidSaldosCuentasPorPagarActual(Long idSaldosCuentasPorPagarActual) {
		this.idSaldosCuentasPorPagarActual = idSaldosCuentasPorPagarActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public SaldosCuentasPorPagar getsaldoscuentasporpagar() {
		return this.saldoscuentasporpagar;
	}

	public void setsaldoscuentasporpagar(SaldosCuentasPorPagar saldoscuentasporpagar) {
		this.saldoscuentasporpagar = saldoscuentasporpagar;
	}
	
	public SaldosCuentasPorPagar getsaldoscuentasporpagarAux() {
		return this.saldoscuentasporpagarAux;
	}

	public void setsaldoscuentasporpagarAux(SaldosCuentasPorPagar saldoscuentasporpagarAux) {
		this.saldoscuentasporpagarAux = saldoscuentasporpagarAux;
	}				
	
	public SaldosCuentasPorPagar getsaldoscuentasporpagarAnterior() {
		return this.saldoscuentasporpagarAnterior;
	}

	public void setsaldoscuentasporpagarAnterior(SaldosCuentasPorPagar saldoscuentasporpagarAnterior) {
		this.saldoscuentasporpagarAnterior = saldoscuentasporpagarAnterior;
	}	
	
	public SaldosCuentasPorPagar getsaldoscuentasporpagarTotales() {
		return this.saldoscuentasporpagarTotales;
	}

	public void setsaldoscuentasporpagarTotales(SaldosCuentasPorPagar saldoscuentasporpagarTotales) {
		this.saldoscuentasporpagarTotales = saldoscuentasporpagarTotales;
	}	
	
	public SaldosCuentasPorPagar getsaldoscuentasporpagarBean() {
		return this.saldoscuentasporpagarBean;
	}

	public void setsaldoscuentasporpagarBean(SaldosCuentasPorPagar saldoscuentasporpagarBean) {
		this.saldoscuentasporpagarBean = saldoscuentasporpagarBean;
	}	
	
	public SaldosCuentasPorPagarParameterReturnGeneral getsaldoscuentasporpagarReturnGeneral() {
		return this.saldoscuentasporpagarReturnGeneral;
	}

	public void setsaldoscuentasporpagarReturnGeneral(SaldosCuentasPorPagarParameterReturnGeneral saldoscuentasporpagarReturnGeneral) {
		this.saldoscuentasporpagarReturnGeneral = saldoscuentasporpagarReturnGeneral;
	}	
	
	
	public Long id_zonaBusquedaSaldosCuentasPorPagar=-1L;

	public Long getid_zonaBusquedaSaldosCuentasPorPagar() {
		return this.id_zonaBusquedaSaldosCuentasPorPagar;
	}

	public void setid_zonaBusquedaSaldosCuentasPorPagar(Long id_zonaBusquedaSaldosCuentasPorPagar) {
		this.id_zonaBusquedaSaldosCuentasPorPagar = id_zonaBusquedaSaldosCuentasPorPagar;
	}

;
	public Long id_grupo_clienteBusquedaSaldosCuentasPorPagar=-1L;

	public Long getid_grupo_clienteBusquedaSaldosCuentasPorPagar() {
		return this.id_grupo_clienteBusquedaSaldosCuentasPorPagar;
	}

	public void setid_grupo_clienteBusquedaSaldosCuentasPorPagar(Long id_grupo_clienteBusquedaSaldosCuentasPorPagar) {
		this.id_grupo_clienteBusquedaSaldosCuentasPorPagar = id_grupo_clienteBusquedaSaldosCuentasPorPagar;
	}

;
	public Long id_clienteBusquedaSaldosCuentasPorPagar=-1L;

	public Long getid_clienteBusquedaSaldosCuentasPorPagar() {
		return this.id_clienteBusquedaSaldosCuentasPorPagar;
	}

	public void setid_clienteBusquedaSaldosCuentasPorPagar(Long id_clienteBusquedaSaldosCuentasPorPagar) {
		this.id_clienteBusquedaSaldosCuentasPorPagar = id_clienteBusquedaSaldosCuentasPorPagar;
	}

;
	public Date fecha_emision_hastaBusquedaSaldosCuentasPorPagar=new Date();

	public Date getfecha_emision_hastaBusquedaSaldosCuentasPorPagar() {
		return this.fecha_emision_hastaBusquedaSaldosCuentasPorPagar;
	}

	public void setfecha_emision_hastaBusquedaSaldosCuentasPorPagar(Date fecha_emision_hastaBusquedaSaldosCuentasPorPagar) {
		this.fecha_emision_hastaBusquedaSaldosCuentasPorPagar = fecha_emision_hastaBusquedaSaldosCuentasPorPagar;
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

	public Long id_grupo_clienteFK_IdGrupoCliente=-1L;

	public Long getid_grupo_clienteFK_IdGrupoCliente() {
		return this.id_grupo_clienteFK_IdGrupoCliente;
	}

	public void setid_grupo_clienteFK_IdGrupoCliente(Long id_grupo_clienteFK_IdGrupoCliente) {
		this.id_grupo_clienteFK_IdGrupoCliente = id_grupo_clienteFK_IdGrupoCliente;
	}

	public Long id_sucursalFK_IdSucursal=-1L;

	public Long getid_sucursalFK_IdSucursal() {
		return this.id_sucursalFK_IdSucursal;
	}

	public void setid_sucursalFK_IdSucursal(Long id_sucursalFK_IdSucursal) {
		this.id_sucursalFK_IdSucursal = id_sucursalFK_IdSucursal;
	}

	public Long id_zonaFK_IdZona=-1L;

	public Long getid_zonaFK_IdZona() {
		return this.id_zonaFK_IdZona;
	}

	public void setid_zonaFK_IdZona(Long id_zonaFK_IdZona) {
		this.id_zonaFK_IdZona = id_zonaFK_IdZona;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public SaldosCuentasPorPagarLogic getSaldosCuentasPorPagarLogic()	{		
		return saldoscuentasporpagarLogic;
	}

	public void setSaldosCuentasPorPagarLogic(SaldosCuentasPorPagarLogic saldoscuentasporpagarLogic) {
		this.saldoscuentasporpagarLogic = saldoscuentasporpagarLogic;
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
	
	public Boolean getIsEsNuevoSaldosCuentasPorPagar() {
		return isEsNuevoSaldosCuentasPorPagar;
	}

	public void setIsEsNuevoSaldosCuentasPorPagar(Boolean isEsNuevoSaldosCuentasPorPagar) {
		this.isEsNuevoSaldosCuentasPorPagar = isEsNuevoSaldosCuentasPorPagar;
	}

	public Boolean getEsParaAccionDesdeFormularioSaldosCuentasPorPagar() {
		return esParaAccionDesdeFormularioSaldosCuentasPorPagar;
	}
	
	public void setEsParaAccionDesdeFormularioSaldosCuentasPorPagar(Boolean esParaAccionDesdeFormularioSaldosCuentasPorPagar) {
		this.esParaAccionDesdeFormularioSaldosCuentasPorPagar = esParaAccionDesdeFormularioSaldosCuentasPorPagar;
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
	
	
	public void cargarCombosZonasForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.zonasForeignKey=new ArrayList<Zona>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			ZonaLogic zonaLogic=new ZonaLogic();

			zonaLogic.getZonaDataAccess().setIsForForeingKeyData(true);

			if(this.saldoscuentasporpagarSessionBean==null) {
				this.saldoscuentasporpagarSessionBean=new SaldosCuentasPorPagarSessionBean();
			}

			if(!this.saldoscuentasporpagarSessionBean.getisBusquedaDesdeForeignKeySesionZona()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					zonaLogic.getZonaDataAccess().setIsForForeingKeyData(true);

					zonaLogic.getTodosZonasWithConnection(sFinalQuery,new Pagination());

					this.zonasForeignKey=zonaLogic.getZonas();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaZona(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					zonaLogic.getEntityWithConnection(saldoscuentasporpagarSessionBean.getlidZonaActual());
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

	public void cargarCombosGrupoClientesForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.grupoclientesForeignKey=new ArrayList<GrupoCliente>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			GrupoClienteLogic grupoclienteLogic=new GrupoClienteLogic();

			grupoclienteLogic.getGrupoClienteDataAccess().setIsForForeingKeyData(true);

			if(this.saldoscuentasporpagarSessionBean==null) {
				this.saldoscuentasporpagarSessionBean=new SaldosCuentasPorPagarSessionBean();
			}

			if(!this.saldoscuentasporpagarSessionBean.getisBusquedaDesdeForeignKeySesionGrupoCliente()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					grupoclienteLogic.getGrupoClienteDataAccess().setIsForForeingKeyData(true);

					grupoclienteLogic.getTodosGrupoClientesWithConnection(sFinalQuery,new Pagination());

					this.grupoclientesForeignKey=grupoclienteLogic.getGrupoClientes();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaGrupoCliente(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					grupoclienteLogic.getEntityWithConnection(saldoscuentasporpagarSessionBean.getlidGrupoClienteActual());
					this.grupoclientesForeignKey.add(grupoclienteLogic.getGrupoCliente());
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

			if(this.saldoscuentasporpagarSessionBean==null) {
				this.saldoscuentasporpagarSessionBean=new SaldosCuentasPorPagarSessionBean();
			}

			if(!this.saldoscuentasporpagarSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(saldoscuentasporpagarSessionBean.getlidEmpresaActual());
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

			if(this.saldoscuentasporpagarSessionBean==null) {
				this.saldoscuentasporpagarSessionBean=new SaldosCuentasPorPagarSessionBean();
			}

			if(!this.saldoscuentasporpagarSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
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
					sucursalLogic.getEntityWithConnection(saldoscuentasporpagarSessionBean.getlidSucursalActual());
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

			if(this.saldoscuentasporpagarSessionBean==null) {
				this.saldoscuentasporpagarSessionBean=new SaldosCuentasPorPagarSessionBean();
			}

			if(!this.saldoscuentasporpagarSessionBean.getisBusquedaDesdeForeignKeySesionCliente()) {
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
					clienteLogic.getEntityWithConnection(saldoscuentasporpagarSessionBean.getlidClienteActual());
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

					if(this.saldoscuentasporpagar!=null) {
						this.saldoscuentasporpagar.setZona(zonaTemp);
					}

					if(this.jInternalFrameDetalleFormSaldosCuentasPorPagar!=null) {
						this.jInternalFrameDetalleFormSaldosCuentasPorPagar.jComboBoxid_zonaSaldosCuentasPorPagar.setSelectedItem(zonaTemp);
					}
				} else {
					//jComboBoxid_zonaSaldosCuentasPorPagar.setSelectedItem(zonaTemp);
					if(this.jInternalFrameDetalleFormSaldosCuentasPorPagar!=null) {
						if(this.jInternalFrameDetalleFormSaldosCuentasPorPagar.jComboBoxid_zonaSaldosCuentasPorPagar.getItemCount()>0) {
							this.jInternalFrameDetalleFormSaldosCuentasPorPagar.jComboBoxid_zonaSaldosCuentasPorPagar.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaSaldosCuentasPorPagar") || sFormularioTipoBusqueda.equals("Todos")){
					if(zonaTemp!=null && jComboBoxid_zonaBusquedaSaldosCuentasPorPagarSaldosCuentasPorPagar!=null) {
						jComboBoxid_zonaBusquedaSaldosCuentasPorPagarSaldosCuentasPorPagar.setSelectedItem(zonaTemp);
					} else {
						if(jComboBoxid_zonaBusquedaSaldosCuentasPorPagarSaldosCuentasPorPagar!=null) {
							//jComboBoxid_zonaBusquedaSaldosCuentasPorPagarSaldosCuentasPorPagar.setSelectedItem(zonaTemp);
							if(jComboBoxid_zonaBusquedaSaldosCuentasPorPagarSaldosCuentasPorPagar.getItemCount()>0) {
								jComboBoxid_zonaBusquedaSaldosCuentasPorPagarSaldosCuentasPorPagar.setSelectedIndex(0);
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
	public void setActualZonaForeignKeyGenerico(Long idZonaSeleccionado,JComboBox jComboBoxid_zonaSaldosCuentasPorPagarGenerico)throws Exception
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
				jComboBoxid_zonaSaldosCuentasPorPagarGenerico.setSelectedItem(zonaTemp);
			} else {
				if(jComboBoxid_zonaSaldosCuentasPorPagarGenerico!=null && jComboBoxid_zonaSaldosCuentasPorPagarGenerico.getItemCount()>0) {
					jComboBoxid_zonaSaldosCuentasPorPagarGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualGrupoClienteForeignKey(Long idGrupoClienteSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			GrupoCliente  grupoclienteTemp=null;

			for(GrupoCliente grupoclienteAux:grupoclientesForeignKey) {
				if(grupoclienteAux.getId()!=null && grupoclienteAux.getId().equals(idGrupoClienteSeleccionado)) {
					grupoclienteTemp=grupoclienteAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(grupoclienteTemp!=null) {

					if(this.saldoscuentasporpagar!=null) {
						this.saldoscuentasporpagar.setGrupoCliente(grupoclienteTemp);
					}

					if(this.jInternalFrameDetalleFormSaldosCuentasPorPagar!=null) {
						this.jInternalFrameDetalleFormSaldosCuentasPorPagar.jComboBoxid_grupo_clienteSaldosCuentasPorPagar.setSelectedItem(grupoclienteTemp);
					}
				} else {
					//jComboBoxid_grupo_clienteSaldosCuentasPorPagar.setSelectedItem(grupoclienteTemp);
					if(this.jInternalFrameDetalleFormSaldosCuentasPorPagar!=null) {
						if(this.jInternalFrameDetalleFormSaldosCuentasPorPagar.jComboBoxid_grupo_clienteSaldosCuentasPorPagar.getItemCount()>0) {
							this.jInternalFrameDetalleFormSaldosCuentasPorPagar.jComboBoxid_grupo_clienteSaldosCuentasPorPagar.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaSaldosCuentasPorPagar") || sFormularioTipoBusqueda.equals("Todos")){
					if(grupoclienteTemp!=null && jComboBoxid_grupo_clienteBusquedaSaldosCuentasPorPagarSaldosCuentasPorPagar!=null) {
						jComboBoxid_grupo_clienteBusquedaSaldosCuentasPorPagarSaldosCuentasPorPagar.setSelectedItem(grupoclienteTemp);
					} else {
						if(jComboBoxid_grupo_clienteBusquedaSaldosCuentasPorPagarSaldosCuentasPorPagar!=null) {
							//jComboBoxid_grupo_clienteBusquedaSaldosCuentasPorPagarSaldosCuentasPorPagar.setSelectedItem(grupoclienteTemp);
							if(jComboBoxid_grupo_clienteBusquedaSaldosCuentasPorPagarSaldosCuentasPorPagar.getItemCount()>0) {
								jComboBoxid_grupo_clienteBusquedaSaldosCuentasPorPagarSaldosCuentasPorPagar.setSelectedIndex(0);
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

	public String getActualGrupoClienteForeignKeyDescripcion(Long idGrupoClienteSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			GrupoCliente  grupoclienteTemp=null;

			for(GrupoCliente grupoclienteAux:grupoclientesForeignKey) {
				if(grupoclienteAux.getId()!=null && grupoclienteAux.getId().equals(idGrupoClienteSeleccionado)) {
					grupoclienteTemp=grupoclienteAux;
					break;
				}
			}


			sDescripcion=GrupoClienteConstantesFunciones.getGrupoClienteDescripcion(grupoclienteTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualGrupoClienteForeignKeyGenerico(Long idGrupoClienteSeleccionado,JComboBox jComboBoxid_grupo_clienteSaldosCuentasPorPagarGenerico)throws Exception
	{
		try
		{
			GrupoCliente  grupoclienteTemp=null;

			for(GrupoCliente grupoclienteAux:grupoclientesForeignKey) {
				if(grupoclienteAux.getId()!=null && grupoclienteAux.getId().equals(idGrupoClienteSeleccionado)) {
					grupoclienteTemp=grupoclienteAux;
					break;
				}
			}

			if(grupoclienteTemp!=null) {
				jComboBoxid_grupo_clienteSaldosCuentasPorPagarGenerico.setSelectedItem(grupoclienteTemp);
			} else {
				if(jComboBoxid_grupo_clienteSaldosCuentasPorPagarGenerico!=null && jComboBoxid_grupo_clienteSaldosCuentasPorPagarGenerico.getItemCount()>0) {
					jComboBoxid_grupo_clienteSaldosCuentasPorPagarGenerico.setSelectedIndex(0);
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

					if(this.saldoscuentasporpagar!=null) {
						this.saldoscuentasporpagar.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormSaldosCuentasPorPagar!=null) {
						this.jInternalFrameDetalleFormSaldosCuentasPorPagar.jComboBoxid_empresaSaldosCuentasPorPagar.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaSaldosCuentasPorPagar.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormSaldosCuentasPorPagar!=null) {
						if(this.jInternalFrameDetalleFormSaldosCuentasPorPagar.jComboBoxid_empresaSaldosCuentasPorPagar.getItemCount()>0) {
							this.jInternalFrameDetalleFormSaldosCuentasPorPagar.jComboBoxid_empresaSaldosCuentasPorPagar.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaSaldosCuentasPorPagarGenerico)throws Exception
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
				jComboBoxid_empresaSaldosCuentasPorPagarGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaSaldosCuentasPorPagarGenerico!=null && jComboBoxid_empresaSaldosCuentasPorPagarGenerico.getItemCount()>0) {
					jComboBoxid_empresaSaldosCuentasPorPagarGenerico.setSelectedIndex(0);
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

					if(this.saldoscuentasporpagar!=null) {
						this.saldoscuentasporpagar.setSucursal(sucursalTemp);
					}

					if(this.jInternalFrameDetalleFormSaldosCuentasPorPagar!=null) {
						this.jInternalFrameDetalleFormSaldosCuentasPorPagar.jComboBoxid_sucursalSaldosCuentasPorPagar.setSelectedItem(sucursalTemp);
					}
				} else {
					//jComboBoxid_sucursalSaldosCuentasPorPagar.setSelectedItem(sucursalTemp);
					if(this.jInternalFrameDetalleFormSaldosCuentasPorPagar!=null) {
						if(this.jInternalFrameDetalleFormSaldosCuentasPorPagar.jComboBoxid_sucursalSaldosCuentasPorPagar.getItemCount()>0) {
							this.jInternalFrameDetalleFormSaldosCuentasPorPagar.jComboBoxid_sucursalSaldosCuentasPorPagar.setSelectedIndex(0);
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
	public void setActualSucursalForeignKeyGenerico(Long idSucursalSeleccionado,JComboBox jComboBoxid_sucursalSaldosCuentasPorPagarGenerico)throws Exception
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
				jComboBoxid_sucursalSaldosCuentasPorPagarGenerico.setSelectedItem(sucursalTemp);
			} else {
				if(jComboBoxid_sucursalSaldosCuentasPorPagarGenerico!=null && jComboBoxid_sucursalSaldosCuentasPorPagarGenerico.getItemCount()>0) {
					jComboBoxid_sucursalSaldosCuentasPorPagarGenerico.setSelectedIndex(0);
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

					if(this.saldoscuentasporpagar!=null) {
						this.saldoscuentasporpagar.setCliente(clienteTemp);
					}

					if(this.jInternalFrameDetalleFormSaldosCuentasPorPagar!=null) {
						this.jInternalFrameDetalleFormSaldosCuentasPorPagar.jComboBoxid_clienteSaldosCuentasPorPagar.setSelectedItem(clienteTemp);
					}
				} else {
					//jComboBoxid_clienteSaldosCuentasPorPagar.setSelectedItem(clienteTemp);
					if(this.jInternalFrameDetalleFormSaldosCuentasPorPagar!=null) {
						if(this.jInternalFrameDetalleFormSaldosCuentasPorPagar.jComboBoxid_clienteSaldosCuentasPorPagar.getItemCount()>0) {
							this.jInternalFrameDetalleFormSaldosCuentasPorPagar.jComboBoxid_clienteSaldosCuentasPorPagar.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaSaldosCuentasPorPagar") || sFormularioTipoBusqueda.equals("Todos")){
					if(clienteTemp!=null && jComboBoxid_clienteBusquedaSaldosCuentasPorPagarSaldosCuentasPorPagar!=null) {
						jComboBoxid_clienteBusquedaSaldosCuentasPorPagarSaldosCuentasPorPagar.setSelectedItem(clienteTemp);
					} else {
						if(jComboBoxid_clienteBusquedaSaldosCuentasPorPagarSaldosCuentasPorPagar!=null) {
							//jComboBoxid_clienteBusquedaSaldosCuentasPorPagarSaldosCuentasPorPagar.setSelectedItem(clienteTemp);
							if(jComboBoxid_clienteBusquedaSaldosCuentasPorPagarSaldosCuentasPorPagar.getItemCount()>0) {
								jComboBoxid_clienteBusquedaSaldosCuentasPorPagarSaldosCuentasPorPagar.setSelectedIndex(0);
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
	public void setActualClienteForeignKeyGenerico(Long idClienteSeleccionado,JComboBox jComboBoxid_clienteSaldosCuentasPorPagarGenerico)throws Exception
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
				jComboBoxid_clienteSaldosCuentasPorPagarGenerico.setSelectedItem(clienteTemp);
			} else {
				if(jComboBoxid_clienteSaldosCuentasPorPagarGenerico!=null && jComboBoxid_clienteSaldosCuentasPorPagarGenerico.getItemCount()>0) {
					jComboBoxid_clienteSaldosCuentasPorPagarGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarZonaForeignKey(SaldosCuentasPorPagar saldoscuentasporpagar,JComboBox jComboBoxid_zonaSaldosCuentasPorPagarGenerico)throws Exception
	{
		try
		{
			Zona  zonaAux=new Zona();

			if(jComboBoxid_zonaSaldosCuentasPorPagarGenerico==null) {
				zonaAux=(Zona)this.jInternalFrameDetalleFormSaldosCuentasPorPagar.jComboBoxid_zonaSaldosCuentasPorPagar.getSelectedItem();
			} else {
				zonaAux=(Zona)jComboBoxid_zonaSaldosCuentasPorPagarGenerico.getSelectedItem();
			}

			if(zonaAux!=null && zonaAux.getId()!=null) {
				saldoscuentasporpagar.setid_zona(zonaAux.getId());
				saldoscuentasporpagar.setzona_descripcion(SaldosCuentasPorPagarConstantesFunciones.getZonaDescripcion(zonaAux));
				saldoscuentasporpagar.setZona(zonaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarGrupoClienteForeignKey(SaldosCuentasPorPagar saldoscuentasporpagar,JComboBox jComboBoxid_grupo_clienteSaldosCuentasPorPagarGenerico)throws Exception
	{
		try
		{
			GrupoCliente  grupoclienteAux=new GrupoCliente();

			if(jComboBoxid_grupo_clienteSaldosCuentasPorPagarGenerico==null) {
				grupoclienteAux=(GrupoCliente)this.jInternalFrameDetalleFormSaldosCuentasPorPagar.jComboBoxid_grupo_clienteSaldosCuentasPorPagar.getSelectedItem();
			} else {
				grupoclienteAux=(GrupoCliente)jComboBoxid_grupo_clienteSaldosCuentasPorPagarGenerico.getSelectedItem();
			}

			if(grupoclienteAux!=null && grupoclienteAux.getId()!=null) {
				saldoscuentasporpagar.setid_grupo_cliente(grupoclienteAux.getId());
				saldoscuentasporpagar.setgrupocliente_descripcion(SaldosCuentasPorPagarConstantesFunciones.getGrupoClienteDescripcion(grupoclienteAux));
				saldoscuentasporpagar.setGrupoCliente(grupoclienteAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(SaldosCuentasPorPagar saldoscuentasporpagar,JComboBox jComboBoxid_empresaSaldosCuentasPorPagarGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaSaldosCuentasPorPagarGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormSaldosCuentasPorPagar.jComboBoxid_empresaSaldosCuentasPorPagar.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaSaldosCuentasPorPagarGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				saldoscuentasporpagar.setid_empresa(empresaAux.getId());
				saldoscuentasporpagar.setempresa_descripcion(SaldosCuentasPorPagarConstantesFunciones.getEmpresaDescripcion(empresaAux));
				saldoscuentasporpagar.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarSucursalForeignKey(SaldosCuentasPorPagar saldoscuentasporpagar,JComboBox jComboBoxid_sucursalSaldosCuentasPorPagarGenerico)throws Exception
	{
		try
		{
			Sucursal  sucursalAux=new Sucursal();

			if(jComboBoxid_sucursalSaldosCuentasPorPagarGenerico==null) {
				sucursalAux=(Sucursal)this.jInternalFrameDetalleFormSaldosCuentasPorPagar.jComboBoxid_sucursalSaldosCuentasPorPagar.getSelectedItem();
			} else {
				sucursalAux=(Sucursal)jComboBoxid_sucursalSaldosCuentasPorPagarGenerico.getSelectedItem();
			}

			if(sucursalAux!=null && sucursalAux.getId()!=null) {
				saldoscuentasporpagar.setid_sucursal(sucursalAux.getId());
				saldoscuentasporpagar.setsucursal_descripcion(SaldosCuentasPorPagarConstantesFunciones.getSucursalDescripcion(sucursalAux));
				saldoscuentasporpagar.setSucursal(sucursalAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarClienteForeignKey(SaldosCuentasPorPagar saldoscuentasporpagar,JComboBox jComboBoxid_clienteSaldosCuentasPorPagarGenerico)throws Exception
	{
		try
		{
			Cliente  clienteAux=new Cliente();

			if(jComboBoxid_clienteSaldosCuentasPorPagarGenerico==null) {
				clienteAux=(Cliente)this.jInternalFrameDetalleFormSaldosCuentasPorPagar.jComboBoxid_clienteSaldosCuentasPorPagar.getSelectedItem();
			} else {
				clienteAux=(Cliente)jComboBoxid_clienteSaldosCuentasPorPagarGenerico.getSelectedItem();
			}

			if(clienteAux!=null && clienteAux.getId()!=null) {
				saldoscuentasporpagar.setid_cliente(clienteAux.getId());
				saldoscuentasporpagar.setcliente_descripcion(SaldosCuentasPorPagarConstantesFunciones.getClienteDescripcion(clienteAux));
				saldoscuentasporpagar.setCliente(clienteAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	
	


		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameZonasForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingZona=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!SaldosCuentasPorPagarJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormSaldosCuentasPorPagar!=null) { 
							this.jInternalFrameDetalleFormSaldosCuentasPorPagar.jComboBoxid_zonaSaldosCuentasPorPagar.removeAllItems();

							for(Zona zona:this.zonasForeignKey) {
								this.jInternalFrameDetalleFormSaldosCuentasPorPagar.jComboBoxid_zonaSaldosCuentasPorPagar.addItem(zona);
							}
						}
					}

					if(this.jInternalFrameDetalleFormSaldosCuentasPorPagar!=null) { 
					}

					if(!SaldosCuentasPorPagarJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaSaldosCuentasPorPagar") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!SaldosCuentasPorPagarJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_zonaBusquedaSaldosCuentasPorPagarSaldosCuentasPorPagar.removeAllItems();

							for(Zona zona:this.zonasForeignKey) {
								this.jComboBoxid_zonaBusquedaSaldosCuentasPorPagarSaldosCuentasPorPagar.addItem(zona);
							}
						}

						if(!SaldosCuentasPorPagarJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameGrupoClientesForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingGrupoCliente=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!SaldosCuentasPorPagarJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormSaldosCuentasPorPagar!=null) { 
							this.jInternalFrameDetalleFormSaldosCuentasPorPagar.jComboBoxid_grupo_clienteSaldosCuentasPorPagar.removeAllItems();

							for(GrupoCliente grupocliente:this.grupoclientesForeignKey) {
								this.jInternalFrameDetalleFormSaldosCuentasPorPagar.jComboBoxid_grupo_clienteSaldosCuentasPorPagar.addItem(grupocliente);
							}
						}
					}

					if(this.jInternalFrameDetalleFormSaldosCuentasPorPagar!=null) { 
					}

					if(!SaldosCuentasPorPagarJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaSaldosCuentasPorPagar") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!SaldosCuentasPorPagarJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_grupo_clienteBusquedaSaldosCuentasPorPagarSaldosCuentasPorPagar.removeAllItems();

							for(GrupoCliente grupocliente:this.grupoclientesForeignKey) {
								this.jComboBoxid_grupo_clienteBusquedaSaldosCuentasPorPagarSaldosCuentasPorPagar.addItem(grupocliente);
							}
						}

						if(!SaldosCuentasPorPagarJInternalFrame.ISBINDING_MANUAL) {
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

					if(!SaldosCuentasPorPagarJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormSaldosCuentasPorPagar!=null) { 
							this.jInternalFrameDetalleFormSaldosCuentasPorPagar.jComboBoxid_empresaSaldosCuentasPorPagar.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormSaldosCuentasPorPagar.jComboBoxid_empresaSaldosCuentasPorPagar.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormSaldosCuentasPorPagar!=null) { 
					}

					if(!SaldosCuentasPorPagarJInternalFrame.ISBINDING_MANUAL) {
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

					if(!SaldosCuentasPorPagarJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormSaldosCuentasPorPagar!=null) { 
							this.jInternalFrameDetalleFormSaldosCuentasPorPagar.jComboBoxid_sucursalSaldosCuentasPorPagar.removeAllItems();

							for(Sucursal sucursal:this.sucursalsForeignKey) {
								this.jInternalFrameDetalleFormSaldosCuentasPorPagar.jComboBoxid_sucursalSaldosCuentasPorPagar.addItem(sucursal);
							}
						}
					}

					if(this.jInternalFrameDetalleFormSaldosCuentasPorPagar!=null) { 
					}

					if(!SaldosCuentasPorPagarJInternalFrame.ISBINDING_MANUAL) {
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

					if(!SaldosCuentasPorPagarJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormSaldosCuentasPorPagar!=null) { 
							this.jInternalFrameDetalleFormSaldosCuentasPorPagar.jComboBoxid_clienteSaldosCuentasPorPagar.removeAllItems();

							for(Cliente cliente:this.clientesForeignKey) {
								this.jInternalFrameDetalleFormSaldosCuentasPorPagar.jComboBoxid_clienteSaldosCuentasPorPagar.addItem(cliente);
							}
						}
					}

					if(this.jInternalFrameDetalleFormSaldosCuentasPorPagar!=null) { 
					}

					if(!SaldosCuentasPorPagarJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaSaldosCuentasPorPagar") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!SaldosCuentasPorPagarJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_clienteBusquedaSaldosCuentasPorPagarSaldosCuentasPorPagar.removeAllItems();

							for(Cliente cliente:this.clientesForeignKey) {
								this.jComboBoxid_clienteBusquedaSaldosCuentasPorPagarSaldosCuentasPorPagar.addItem(cliente);
							}
						}

						if(!SaldosCuentasPorPagarJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

	


		public void setSelectedItemCombosFrameZonaForeignKey(Zona zona,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormSaldosCuentasPorPagar!=null) {
							this.jInternalFrameDetalleFormSaldosCuentasPorPagar.jComboBoxid_zonaSaldosCuentasPorPagar.setSelectedItem(zona);
						}
					} else {
						if(this.jInternalFrameDetalleFormSaldosCuentasPorPagar!=null) {
							this.jInternalFrameDetalleFormSaldosCuentasPorPagar.jComboBoxid_zonaSaldosCuentasPorPagar.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_zonaBusquedaSaldosCuentasPorPagarSaldosCuentasPorPagar.setSelectedItem(zona);
						} else {
							this.jComboBoxid_zonaBusquedaSaldosCuentasPorPagarSaldosCuentasPorPagar.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameGrupoClienteForeignKey(GrupoCliente grupocliente,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormSaldosCuentasPorPagar!=null) {
							this.jInternalFrameDetalleFormSaldosCuentasPorPagar.jComboBoxid_grupo_clienteSaldosCuentasPorPagar.setSelectedItem(grupocliente);
						}
					} else {
						if(this.jInternalFrameDetalleFormSaldosCuentasPorPagar!=null) {
							this.jInternalFrameDetalleFormSaldosCuentasPorPagar.jComboBoxid_grupo_clienteSaldosCuentasPorPagar.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_grupo_clienteBusquedaSaldosCuentasPorPagarSaldosCuentasPorPagar.setSelectedItem(grupocliente);
						} else {
							this.jComboBoxid_grupo_clienteBusquedaSaldosCuentasPorPagarSaldosCuentasPorPagar.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormSaldosCuentasPorPagar!=null) {
							this.jInternalFrameDetalleFormSaldosCuentasPorPagar.jComboBoxid_empresaSaldosCuentasPorPagar.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormSaldosCuentasPorPagar!=null) {
							this.jInternalFrameDetalleFormSaldosCuentasPorPagar.jComboBoxid_empresaSaldosCuentasPorPagar.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormSaldosCuentasPorPagar!=null) {
							this.jInternalFrameDetalleFormSaldosCuentasPorPagar.jComboBoxid_sucursalSaldosCuentasPorPagar.setSelectedItem(sucursal);
						}
					} else {
						if(this.jInternalFrameDetalleFormSaldosCuentasPorPagar!=null) {
							this.jInternalFrameDetalleFormSaldosCuentasPorPagar.jComboBoxid_sucursalSaldosCuentasPorPagar.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormSaldosCuentasPorPagar!=null) {
							this.jInternalFrameDetalleFormSaldosCuentasPorPagar.jComboBoxid_clienteSaldosCuentasPorPagar.setSelectedItem(cliente);
						}
					} else {
						if(this.jInternalFrameDetalleFormSaldosCuentasPorPagar!=null) {
							this.jInternalFrameDetalleFormSaldosCuentasPorPagar.jComboBoxid_clienteSaldosCuentasPorPagar.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_clienteBusquedaSaldosCuentasPorPagarSaldosCuentasPorPagar.setSelectedItem(cliente);
						} else {
							this.jComboBoxid_clienteBusquedaSaldosCuentasPorPagarSaldosCuentasPorPagar.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesSaldosCuentasPorPagar() throws Exception {
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
		
	public SaldosCuentasPorPagarParameterReturnGeneral getSaldosCuentasPorPagarParameterGeneral() {
		return this.saldoscuentasporpagarParameterGeneral;
	}
	
	public void setSaldosCuentasPorPagarParameterGeneral(SaldosCuentasPorPagarParameterReturnGeneral saldoscuentasporpagarParameterGeneral) {
		this.saldoscuentasporpagarParameterGeneral = saldoscuentasporpagarParameterGeneral;
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
	
	public Boolean getIsPermisoTodoSaldosCuentasPorPagar() {
		return isPermisoTodoSaldosCuentasPorPagar;
	}

	public void setIsPermisoTodoSaldosCuentasPorPagar(Boolean isPermisoTodoSaldosCuentasPorPagar) {
		this.isPermisoTodoSaldosCuentasPorPagar = isPermisoTodoSaldosCuentasPorPagar;
	}

	public Boolean getIsPermisoNuevoSaldosCuentasPorPagar() {
		return isPermisoNuevoSaldosCuentasPorPagar;
	}

	public void setIsPermisoNuevoSaldosCuentasPorPagar(Boolean isPermisoNuevoSaldosCuentasPorPagar) {
		this.isPermisoNuevoSaldosCuentasPorPagar = isPermisoNuevoSaldosCuentasPorPagar;
	}

	public Boolean getIsPermisoActualizarSaldosCuentasPorPagar() {
		return isPermisoActualizarSaldosCuentasPorPagar;
	}

	public void setIsPermisoActualizarSaldosCuentasPorPagar(Boolean isPermisoActualizarSaldosCuentasPorPagar) {
		this.isPermisoActualizarSaldosCuentasPorPagar = isPermisoActualizarSaldosCuentasPorPagar;
	}

	public Boolean getIsPermisoEliminarSaldosCuentasPorPagar() {
		return isPermisoEliminarSaldosCuentasPorPagar;
	}

	public void setIsPermisoEliminarSaldosCuentasPorPagar(Boolean isPermisoEliminarSaldosCuentasPorPagar) {
		this.isPermisoEliminarSaldosCuentasPorPagar = isPermisoEliminarSaldosCuentasPorPagar;
	}

	public Boolean getIsPermisoGuardarCambiosSaldosCuentasPorPagar() {
		return isPermisoGuardarCambiosSaldosCuentasPorPagar;
	}

	public void setIsPermisoGuardarCambiosSaldosCuentasPorPagar(Boolean isPermisoGuardarCambiosSaldosCuentasPorPagar) {
		this.isPermisoGuardarCambiosSaldosCuentasPorPagar = isPermisoGuardarCambiosSaldosCuentasPorPagar;
	}
	
	public Boolean getIsPermisoConsultaSaldosCuentasPorPagar() {
		return isPermisoConsultaSaldosCuentasPorPagar;
	}

	public void setIsPermisoConsultaSaldosCuentasPorPagar(Boolean isPermisoConsultaSaldosCuentasPorPagar) {
		this.isPermisoConsultaSaldosCuentasPorPagar = isPermisoConsultaSaldosCuentasPorPagar;
	}

	public Boolean getIsPermisoBusquedaSaldosCuentasPorPagar() {
		return isPermisoBusquedaSaldosCuentasPorPagar;
	}

	public void setIsPermisoBusquedaSaldosCuentasPorPagar(Boolean isPermisoBusquedaSaldosCuentasPorPagar) {
		this.isPermisoBusquedaSaldosCuentasPorPagar = isPermisoBusquedaSaldosCuentasPorPagar;
	}

	public Boolean getIsPermisoReporteSaldosCuentasPorPagar() {
		return isPermisoReporteSaldosCuentasPorPagar;
	}

	public void setIsPermisoReporteSaldosCuentasPorPagar(Boolean isPermisoReporteSaldosCuentasPorPagar) {
		this.isPermisoReporteSaldosCuentasPorPagar = isPermisoReporteSaldosCuentasPorPagar;
	}
	
	public Boolean getIsPermisoPaginacionMedioSaldosCuentasPorPagar() {
		return isPermisoPaginacionMedioSaldosCuentasPorPagar;
	}

	public void setIsPermisoPaginacionMedioSaldosCuentasPorPagar(Boolean isPermisoPaginacionMedioSaldosCuentasPorPagar) {
		this.isPermisoPaginacionMedioSaldosCuentasPorPagar = isPermisoPaginacionMedioSaldosCuentasPorPagar;
	}
	
	public Boolean getIsPermisoPaginacionTodoSaldosCuentasPorPagar() {
		return isPermisoPaginacionTodoSaldosCuentasPorPagar;
	}

	public void setIsPermisoPaginacionTodoSaldosCuentasPorPagar(Boolean isPermisoPaginacionTodoSaldosCuentasPorPagar) {
		this.isPermisoPaginacionTodoSaldosCuentasPorPagar = isPermisoPaginacionTodoSaldosCuentasPorPagar;
	}
	
	public Boolean getIsPermisoPaginacionAltoSaldosCuentasPorPagar() {
		return isPermisoPaginacionAltoSaldosCuentasPorPagar;
	}

	public void setIsPermisoPaginacionAltoSaldosCuentasPorPagar(Boolean isPermisoPaginacionAltoSaldosCuentasPorPagar) {
		this.isPermisoPaginacionAltoSaldosCuentasPorPagar = isPermisoPaginacionAltoSaldosCuentasPorPagar;
	}
	
	public Boolean getIsPermisoCopiarSaldosCuentasPorPagar() {
		return isPermisoCopiarSaldosCuentasPorPagar;
	}

	public void setIsPermisoCopiarSaldosCuentasPorPagar(Boolean isPermisoCopiarSaldosCuentasPorPagar) {
		this.isPermisoCopiarSaldosCuentasPorPagar = isPermisoCopiarSaldosCuentasPorPagar;
	}
	
	public Boolean getIsPermisoVerFormSaldosCuentasPorPagar() {
		return isPermisoVerFormSaldosCuentasPorPagar;
	}

	public void setIsPermisoVerFormSaldosCuentasPorPagar(Boolean isPermisoVerFormSaldosCuentasPorPagar) {
		this.isPermisoVerFormSaldosCuentasPorPagar = isPermisoVerFormSaldosCuentasPorPagar;
	}
	
	public Boolean getIsPermisoDuplicarSaldosCuentasPorPagar() {
		return isPermisoDuplicarSaldosCuentasPorPagar;
	}

	public void setIsPermisoDuplicarSaldosCuentasPorPagar(Boolean isPermisoDuplicarSaldosCuentasPorPagar) {
		this.isPermisoDuplicarSaldosCuentasPorPagar = isPermisoDuplicarSaldosCuentasPorPagar;
	}
	
	public Boolean getIsPermisoOrdenSaldosCuentasPorPagar() {
		return isPermisoOrdenSaldosCuentasPorPagar;
	}

	public void setIsPermisoOrdenSaldosCuentasPorPagar(Boolean isPermisoOrdenSaldosCuentasPorPagar) {
		this.isPermisoOrdenSaldosCuentasPorPagar = isPermisoOrdenSaldosCuentasPorPagar;
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
	
	public Boolean getIsVisibilidadCeldaNuevoSaldosCuentasPorPagar() {
		return isVisibilidadCeldaNuevoSaldosCuentasPorPagar;
	}

	public void setIsVisibilidadCeldaNuevoSaldosCuentasPorPagar(Boolean isVisibilidadCeldaNuevoSaldosCuentasPorPagar) {
		this.isVisibilidadCeldaNuevoSaldosCuentasPorPagar = isVisibilidadCeldaNuevoSaldosCuentasPorPagar;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarSaldosCuentasPorPagar() {
		return isVisibilidadCeldaDuplicarSaldosCuentasPorPagar;
	}

	public void setIsVisibilidadCeldaDuplicarSaldosCuentasPorPagar(Boolean isVisibilidadCeldaDuplicarSaldosCuentasPorPagar) {
		this.isVisibilidadCeldaDuplicarSaldosCuentasPorPagar = isVisibilidadCeldaDuplicarSaldosCuentasPorPagar;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarSaldosCuentasPorPagar() {
		return isVisibilidadCeldaCopiarSaldosCuentasPorPagar;
	}

	public void setIsVisibilidadCeldaCopiarSaldosCuentasPorPagar(Boolean isVisibilidadCeldaCopiarSaldosCuentasPorPagar) {
		this.isVisibilidadCeldaCopiarSaldosCuentasPorPagar = isVisibilidadCeldaCopiarSaldosCuentasPorPagar;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormSaldosCuentasPorPagar() {
		return isVisibilidadCeldaVerFormSaldosCuentasPorPagar;
	}

	public void setIsVisibilidadCeldaVerFormSaldosCuentasPorPagar(Boolean isVisibilidadCeldaVerFormSaldosCuentasPorPagar) {
		this.isVisibilidadCeldaVerFormSaldosCuentasPorPagar = isVisibilidadCeldaVerFormSaldosCuentasPorPagar;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenSaldosCuentasPorPagar() {
		return isVisibilidadCeldaOrdenSaldosCuentasPorPagar;
	}

	public void setIsVisibilidadCeldaOrdenSaldosCuentasPorPagar(Boolean isVisibilidadCeldaOrdenSaldosCuentasPorPagar) {
		this.isVisibilidadCeldaOrdenSaldosCuentasPorPagar = isVisibilidadCeldaOrdenSaldosCuentasPorPagar;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesSaldosCuentasPorPagar() {
		return isVisibilidadCeldaNuevoRelacionesSaldosCuentasPorPagar;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesSaldosCuentasPorPagar(Boolean isVisibilidadCeldaNuevoRelacionesSaldosCuentasPorPagar) {
		this.isVisibilidadCeldaNuevoRelacionesSaldosCuentasPorPagar = isVisibilidadCeldaNuevoRelacionesSaldosCuentasPorPagar;
	}
	
	public Boolean getIsVisibilidadCeldaModificarSaldosCuentasPorPagar() {
		return isVisibilidadCeldaModificarSaldosCuentasPorPagar;
	}

	public void setIsVisibilidadCeldaModificarSaldosCuentasPorPagar(Boolean isVisibilidadCeldaModificarSaldosCuentasPorPagar) {
		this.isVisibilidadCeldaModificarSaldosCuentasPorPagar = isVisibilidadCeldaModificarSaldosCuentasPorPagar;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarSaldosCuentasPorPagar() {
		return isVisibilidadCeldaActualizarSaldosCuentasPorPagar;
	}

	public void setIsVisibilidadCeldaActualizarSaldosCuentasPorPagar(Boolean isVisibilidadCeldaActualizarSaldosCuentasPorPagar) {
		this.isVisibilidadCeldaActualizarSaldosCuentasPorPagar = isVisibilidadCeldaActualizarSaldosCuentasPorPagar;
	}

	public Boolean getIsVisibilidadCeldaEliminarSaldosCuentasPorPagar() {
		return isVisibilidadCeldaEliminarSaldosCuentasPorPagar;
	}

	public void setIsVisibilidadCeldaEliminarSaldosCuentasPorPagar(Boolean isVisibilidadCeldaEliminarSaldosCuentasPorPagar) {
		this.isVisibilidadCeldaEliminarSaldosCuentasPorPagar = isVisibilidadCeldaEliminarSaldosCuentasPorPagar;
	}

	public Boolean getIsVisibilidadCeldaCancelarSaldosCuentasPorPagar() {
		return isVisibilidadCeldaCancelarSaldosCuentasPorPagar;
	}

	public void setIsVisibilidadCeldaCancelarSaldosCuentasPorPagar(Boolean isVisibilidadCeldaCancelarSaldosCuentasPorPagar) {
		this.isVisibilidadCeldaCancelarSaldosCuentasPorPagar = isVisibilidadCeldaCancelarSaldosCuentasPorPagar;
	}

	public Boolean getIsVisibilidadCeldaGuardarSaldosCuentasPorPagar() {
		return isVisibilidadCeldaGuardarSaldosCuentasPorPagar;
	}

	public void setIsVisibilidadCeldaGuardarSaldosCuentasPorPagar(Boolean isVisibilidadCeldaGuardarSaldosCuentasPorPagar) {
		this.isVisibilidadCeldaGuardarSaldosCuentasPorPagar = isVisibilidadCeldaGuardarSaldosCuentasPorPagar;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosSaldosCuentasPorPagar() {
		return isVisibilidadCeldaGuardarCambiosSaldosCuentasPorPagar;
	}

	public void setIsVisibilidadCeldaGuardarCambiosSaldosCuentasPorPagar(Boolean isVisibilidadCeldaGuardarCambiosSaldosCuentasPorPagar) {
		this.isVisibilidadCeldaGuardarCambiosSaldosCuentasPorPagar = isVisibilidadCeldaGuardarCambiosSaldosCuentasPorPagar;
	}
		
	public SaldosCuentasPorPagarSessionBean getsaldoscuentasporpagarSessionBean() {
		return this.saldoscuentasporpagarSessionBean;
	}
	
	public void setsaldoscuentasporpagarSessionBean(SaldosCuentasPorPagarSessionBean saldoscuentasporpagarSessionBean) {
		this.saldoscuentasporpagarSessionBean=saldoscuentasporpagarSessionBean;
	}
	
	
	public Boolean getisVisibilidadBusquedaSaldosCuentasPorPagar() {
		return this.isVisibilidadBusquedaSaldosCuentasPorPagar;
	}

	public void setisVisibilidadBusquedaSaldosCuentasPorPagar(Boolean isVisibilidadBusquedaSaldosCuentasPorPagar) {
		this.isVisibilidadBusquedaSaldosCuentasPorPagar=isVisibilidadBusquedaSaldosCuentasPorPagar;
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

	public Boolean getisVisibilidadFK_IdGrupoCliente() {
		return this.isVisibilidadFK_IdGrupoCliente;
	}

	public void setisVisibilidadFK_IdGrupoCliente(Boolean isVisibilidadFK_IdGrupoCliente) {
		this.isVisibilidadFK_IdGrupoCliente=isVisibilidadFK_IdGrupoCliente;
	}

	public Boolean getisVisibilidadFK_IdSucursal() {
		return this.isVisibilidadFK_IdSucursal;
	}

	public void setisVisibilidadFK_IdSucursal(Boolean isVisibilidadFK_IdSucursal) {
		this.isVisibilidadFK_IdSucursal=isVisibilidadFK_IdSucursal;
	}

	public Boolean getisVisibilidadFK_IdZona() {
		return this.isVisibilidadFK_IdZona;
	}

	public void setisVisibilidadFK_IdZona(Boolean isVisibilidadFK_IdZona) {
		this.isVisibilidadFK_IdZona=isVisibilidadFK_IdZona;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysSaldosCuentasPorPagar(SaldosCuentasPorPagar saldoscuentasporpagar)throws Exception {
		try {
			
				this.setActualParaGuardarZonaForeignKey(saldoscuentasporpagar,null);
				this.setActualParaGuardarGrupoClienteForeignKey(saldoscuentasporpagar,null);
				this.setActualParaGuardarEmpresaForeignKey(saldoscuentasporpagar,null);
				this.setActualParaGuardarSucursalForeignKey(saldoscuentasporpagar,null);
				this.setActualParaGuardarClienteForeignKey(saldoscuentasporpagar,null);
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
	
	public void bugActualizarReferenciaActual(SaldosCuentasPorPagar saldoscuentasporpagar,SaldosCuentasPorPagar saldoscuentasporpagarAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalSaldosCuentasPorPagar(saldoscuentasporpagar);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		saldoscuentasporpagarAux.setId(saldoscuentasporpagar.getId());
		saldoscuentasporpagarAux.setVersionRow(saldoscuentasporpagar.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
	}	
	
	public void actualizarRelaciones(SaldosCuentasPorPagar saldoscuentasporpagarLocal) throws Exception {
		
		if(this.saldoscuentasporpagarSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(SaldosCuentasPorPagar saldoscuentasporpagarLocal) throws Exception {	
		if(this.saldoscuentasporpagarSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(ZonaDetalleFormJInternalFrame.class)) {
				ZonaBeanSwingJInternalFrame zonaBeanSwingJInternalFrameLocal=(ZonaBeanSwingJInternalFrame) ((ZonaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				zonaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoZona(zonaBeanSwingJInternalFrameLocal.getzona(),true);
				zonaBeanSwingJInternalFrameLocal.actualizarLista(zonaBeanSwingJInternalFrameLocal.zona,this.zonasForeignKey);

				zonaBeanSwingJInternalFrameLocal.actualizarRelaciones(zonaBeanSwingJInternalFrameLocal.zona);

				saldoscuentasporpagarLocal.setZona(zonaBeanSwingJInternalFrameLocal.zona);

				this.addItemDefectoCombosForeignKeyZona();
				this.cargarCombosFrameZonasForeignKey("Formulario");
				this.setActualZonaForeignKey(zonaBeanSwingJInternalFrameLocal.zona.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(GrupoClienteDetalleFormJInternalFrame.class)) {
				GrupoClienteBeanSwingJInternalFrame grupoclienteBeanSwingJInternalFrameLocal=(GrupoClienteBeanSwingJInternalFrame) ((GrupoClienteDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				grupoclienteBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoGrupoCliente(grupoclienteBeanSwingJInternalFrameLocal.getgrupocliente(),true);
				grupoclienteBeanSwingJInternalFrameLocal.actualizarLista(grupoclienteBeanSwingJInternalFrameLocal.grupocliente,this.grupoclientesForeignKey);

				grupoclienteBeanSwingJInternalFrameLocal.actualizarRelaciones(grupoclienteBeanSwingJInternalFrameLocal.grupocliente);

				saldoscuentasporpagarLocal.setGrupoCliente(grupoclienteBeanSwingJInternalFrameLocal.grupocliente);

				this.addItemDefectoCombosForeignKeyGrupoCliente();
				this.cargarCombosFrameGrupoClientesForeignKey("Formulario");
				this.setActualGrupoClienteForeignKey(grupoclienteBeanSwingJInternalFrameLocal.grupocliente.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				saldoscuentasporpagarLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(SucursalDetalleFormJInternalFrame.class)) {
				SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrameLocal=(SucursalBeanSwingJInternalFrame) ((SucursalDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				sucursalBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoSucursal(sucursalBeanSwingJInternalFrameLocal.getsucursal(),true);
				sucursalBeanSwingJInternalFrameLocal.actualizarLista(sucursalBeanSwingJInternalFrameLocal.sucursal,this.sucursalsForeignKey);

				sucursalBeanSwingJInternalFrameLocal.actualizarRelaciones(sucursalBeanSwingJInternalFrameLocal.sucursal);

				saldoscuentasporpagarLocal.setSucursal(sucursalBeanSwingJInternalFrameLocal.sucursal);

				this.addItemDefectoCombosForeignKeySucursal();
				this.cargarCombosFrameSucursalsForeignKey("Formulario");
				this.setActualSucursalForeignKey(sucursalBeanSwingJInternalFrameLocal.sucursal.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(ClienteDetalleFormJInternalFrame.class)) {
				ClienteBeanSwingJInternalFrame clienteBeanSwingJInternalFrameLocal=(ClienteBeanSwingJInternalFrame) ((ClienteDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				clienteBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoCliente(clienteBeanSwingJInternalFrameLocal.getcliente(),true);
				clienteBeanSwingJInternalFrameLocal.actualizarLista(clienteBeanSwingJInternalFrameLocal.cliente,this.clientesForeignKey);

				clienteBeanSwingJInternalFrameLocal.actualizarRelaciones(clienteBeanSwingJInternalFrameLocal.cliente);

				saldoscuentasporpagarLocal.setCliente(clienteBeanSwingJInternalFrameLocal.cliente);

				this.addItemDefectoCombosForeignKeyCliente();
				this.cargarCombosFrameClientesForeignKey("Formulario");
				this.setActualClienteForeignKey(clienteBeanSwingJInternalFrameLocal.cliente.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarSaldosCuentasPorPagarActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosSaldosCuentasPorPagar.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.saldoscuentasporpagar =(SaldosCuentasPorPagar) this.saldoscuentasporpagarLogic.getSaldosCuentasPorPagars().toArray()[this.jTableDatosSaldosCuentasPorPagar.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.saldoscuentasporpagar =(SaldosCuentasPorPagar) this.saldoscuentasporpagars.toArray()[this.jTableDatosSaldosCuentasPorPagar.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = saldoscuentasporpagarValidator.getInvalidValues(this.saldoscuentasporpagar);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(SaldosCuentasPorPagar saldoscuentasporpagar,List<SaldosCuentasPorPagar> saldoscuentasporpagars) throws Exception {
	}		
	
	public void actualizarSelectedLista(SaldosCuentasPorPagar saldoscuentasporpagar,List<SaldosCuentasPorPagar> saldoscuentasporpagars) throws Exception {
		try	{			
			SaldosCuentasPorPagarConstantesFunciones.actualizarSelectedLista(saldoscuentasporpagar,saldoscuentasporpagars);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<SaldosCuentasPorPagar> saldoscuentasporpagarsLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				saldoscuentasporpagarsLocal=this.saldoscuentasporpagarLogic.getSaldosCuentasPorPagars();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				saldoscuentasporpagarsLocal=this.saldoscuentasporpagars;
			}
			//ARCHITECTURE
		
			for(SaldosCuentasPorPagar saldoscuentasporpagarLocal:saldoscuentasporpagarsLocal) {
				if(this.permiteMantenimiento(saldoscuentasporpagarLocal) && saldoscuentasporpagarLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+SaldosCuentasPorPagarConstantesFunciones.getSaldosCuentasPorPagarLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(SaldosCuentasPorPagarConstantesFunciones.CODIGO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSaldosCuentasPorPagar.jLabelcodigoSaldosCuentasPorPagar,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(SaldosCuentasPorPagarConstantesFunciones.NOMBRECOMPLETO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSaldosCuentasPorPagar.jLabelnombre_completoSaldosCuentasPorPagar,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(SaldosCuentasPorPagarConstantesFunciones.DEBITOMONELOCAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSaldosCuentasPorPagar.jLabeldebito_mone_localSaldosCuentasPorPagar,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(SaldosCuentasPorPagarConstantesFunciones.CREDITOMONELOCAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSaldosCuentasPorPagar.jLabelcredito_mone_localSaldosCuentasPorPagar,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(SaldosCuentasPorPagarConstantesFunciones.SALDOANTERIOR)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSaldosCuentasPorPagar.jLabelsaldo_anteriorSaldosCuentasPorPagar,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(SaldosCuentasPorPagarConstantesFunciones.SALDODEBITO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSaldosCuentasPorPagar.jLabelsaldo_debitoSaldosCuentasPorPagar,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(SaldosCuentasPorPagarConstantesFunciones.SALDOCREDITO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSaldosCuentasPorPagar.jLabelsaldo_creditoSaldosCuentasPorPagar,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormSaldosCuentasPorPagar!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormSaldosCuentasPorPagar.jLabelcodigoSaldosCuentasPorPagar,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormSaldosCuentasPorPagar.jLabelnombre_completoSaldosCuentasPorPagar,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormSaldosCuentasPorPagar.jLabeldebito_mone_localSaldosCuentasPorPagar,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormSaldosCuentasPorPagar.jLabelcredito_mone_localSaldosCuentasPorPagar,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormSaldosCuentasPorPagar.jLabelsaldo_anteriorSaldosCuentasPorPagar,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormSaldosCuentasPorPagar.jLabelsaldo_debitoSaldosCuentasPorPagar,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormSaldosCuentasPorPagar.jLabelsaldo_creditoSaldosCuentasPorPagar,"");
		
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
		this.iIdNuevoSaldosCuentasPorPagar--;	
		
		
		this.saldoscuentasporpagarAux=new SaldosCuentasPorPagar();
		
		this.saldoscuentasporpagarAux.setId(this.iIdNuevoSaldosCuentasPorPagar);
		this.saldoscuentasporpagarAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.saldoscuentasporpagarLogic.getSaldosCuentasPorPagars().add(this.saldoscuentasporpagarAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.saldoscuentasporpagars.add(this.saldoscuentasporpagarAux);
		}
		//ARCHITECTURE
		
		this.saldoscuentasporpagar=this.saldoscuentasporpagarAux;
		
		if(SaldosCuentasPorPagarJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioSaldosCuentasPorPagar(this.saldoscuentasporpagar);
			this.setVariablesObjetoActualToFormularioForeignKeySaldosCuentasPorPagar(this.saldoscuentasporpagar);
		}
				
		//this.setDefaultControlesSaldosCuentasPorPagar();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeySaldosCuentasPorPagar();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeySaldosCuentasPorPagar();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeySaldosCuentasPorPagar();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualSaldosCuentasPorPagar(this.saldoscuentasporpagarBean,this.saldoscuentasporpagar,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysSaldosCuentasPorPagar(this.saldoscuentasporpagar);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanSaldosCuentasPorPagar(this.saldoscuentasporpagarReturnGeneral,this.saldoscuentasporpagarBean,false);
		
		if(this.saldoscuentasporpagarReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeySaldosCuentasPorPagar(this.saldoscuentasporpagarReturnGeneral.getSaldosCuentasPorPagar());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioSaldosCuentasPorPagar(this.saldoscuentasporpagarReturnGeneral.getSaldosCuentasPorPagar());
		}
		
		if(this.saldoscuentasporpagarReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioSaldosCuentasPorPagar(this.saldoscuentasporpagarReturnGeneral.getSaldosCuentasPorPagar(),classes);//this.saldoscuentasporpagarBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualSaldosCuentasPorPagar(this.saldoscuentasporpagar,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeySaldosCuentasPorPagar();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeySaldosCuentasPorPagar();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			SaldosCuentasPorPagarBeanSwingJInternalFrameAdditional.RecargarFormSaldosCuentasPorPagar(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingSaldosCuentasPorPagar(false);
						
			if(saldoscuentasporpagarSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(SaldosCuentasPorPagarJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualSaldosCuentasPorPagar();
			}
			
			this.actualizarVisualTableDatosSaldosCuentasPorPagar();
			
			this.jTableDatosSaldosCuentasPorPagar.setRowSelectionInterval(this.getIndiceNuevoSaldosCuentasPorPagar(), this.getIndiceNuevoSaldosCuentasPorPagar());
			
			this.seleccionarFilaTablaSaldosCuentasPorPagarActual();
						
			this.actualizarEstadoCeldasBotonesSaldosCuentasPorPagar("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesSaldosCuentasPorPagar(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormSaldosCuentasPorPagar.jDateChooserfecha_emision_hastaSaldosCuentasPorPagar.setEnabled(isHabilitar && this.saldoscuentasporpagarConstantesFunciones.activarfecha_emision_hastaSaldosCuentasPorPagar);
		this.jInternalFrameDetalleFormSaldosCuentasPorPagar.jTextFieldcodigoSaldosCuentasPorPagar.setEnabled(isHabilitar && this.saldoscuentasporpagarConstantesFunciones.activarcodigoSaldosCuentasPorPagar);
		this.jInternalFrameDetalleFormSaldosCuentasPorPagar.jTextAreanombre_completoSaldosCuentasPorPagar.setEnabled(isHabilitar && this.saldoscuentasporpagarConstantesFunciones.activarnombre_completoSaldosCuentasPorPagar);
		this.jInternalFrameDetalleFormSaldosCuentasPorPagar.jTextFielddebito_mone_localSaldosCuentasPorPagar.setEnabled(isHabilitar && this.saldoscuentasporpagarConstantesFunciones.activardebito_mone_localSaldosCuentasPorPagar);
		this.jInternalFrameDetalleFormSaldosCuentasPorPagar.jTextFieldcredito_mone_localSaldosCuentasPorPagar.setEnabled(isHabilitar && this.saldoscuentasporpagarConstantesFunciones.activarcredito_mone_localSaldosCuentasPorPagar);//
		this.jInternalFrameDetalleFormSaldosCuentasPorPagar.jTextFieldsaldo_anteriorSaldosCuentasPorPagar.setEnabled(isHabilitar && this.saldoscuentasporpagarConstantesFunciones.activarsaldo_anteriorSaldosCuentasPorPagar);
		this.jInternalFrameDetalleFormSaldosCuentasPorPagar.jTextFieldsaldo_debitoSaldosCuentasPorPagar.setEnabled(isHabilitar && this.saldoscuentasporpagarConstantesFunciones.activarsaldo_debitoSaldosCuentasPorPagar);
		this.jInternalFrameDetalleFormSaldosCuentasPorPagar.jTextFieldsaldo_creditoSaldosCuentasPorPagar.setEnabled(isHabilitar && this.saldoscuentasporpagarConstantesFunciones.activarsaldo_creditoSaldosCuentasPorPagar);	
		
		this.jInternalFrameDetalleFormSaldosCuentasPorPagar.jComboBoxid_zonaSaldosCuentasPorPagar.setEnabled(isHabilitar && this.saldoscuentasporpagarConstantesFunciones.activarid_zonaSaldosCuentasPorPagar);
		this.jInternalFrameDetalleFormSaldosCuentasPorPagar.jComboBoxid_grupo_clienteSaldosCuentasPorPagar.setEnabled(isHabilitar && this.saldoscuentasporpagarConstantesFunciones.activarid_grupo_clienteSaldosCuentasPorPagar);//
		this.jInternalFrameDetalleFormSaldosCuentasPorPagar.jComboBoxid_empresaSaldosCuentasPorPagar.setEnabled(isHabilitar && this.saldoscuentasporpagarConstantesFunciones.activarid_empresaSaldosCuentasPorPagar);//
		this.jInternalFrameDetalleFormSaldosCuentasPorPagar.jComboBoxid_sucursalSaldosCuentasPorPagar.setEnabled(isHabilitar && this.saldoscuentasporpagarConstantesFunciones.activarid_sucursalSaldosCuentasPorPagar);
		this.jInternalFrameDetalleFormSaldosCuentasPorPagar.jComboBoxid_clienteSaldosCuentasPorPagar.setEnabled(isHabilitar && this.saldoscuentasporpagarConstantesFunciones.activarid_clienteSaldosCuentasPorPagar);
	};
	
	public void setDefaultControlesSaldosCuentasPorPagar() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoSaldosCuentasPorPagar(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.saldoscuentasporpagarSessionBean.setConGuardarRelaciones(true);			
			this.saldoscuentasporpagarSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormSaldosCuentasPorPagar.jTabbedPaneRelacionesSaldosCuentasPorPagar.setVisible(true);
			
					
		} else {
			//this.saldoscuentasporpagarSessionBean.setConGuardarRelaciones(false);			
			this.saldoscuentasporpagarSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormSaldosCuentasPorPagar.jTabbedPaneRelacionesSaldosCuentasPorPagar.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoSaldosCuentasPorPagar() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(SaldosCuentasPorPagar saldoscuentasporpagarAux:this.saldoscuentasporpagarLogic.getSaldosCuentasPorPagars()) {
				if(saldoscuentasporpagarAux.getId().equals(this.iIdNuevoSaldosCuentasPorPagar)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(SaldosCuentasPorPagar saldoscuentasporpagarAux:this.saldoscuentasporpagars) {
				if(saldoscuentasporpagarAux.getId().equals(this.iIdNuevoSaldosCuentasPorPagar)) {
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
	
	public int getIndiceActualSaldosCuentasPorPagar(SaldosCuentasPorPagar saldoscuentasporpagar,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(SaldosCuentasPorPagar saldoscuentasporpagarAux:this.saldoscuentasporpagarLogic.getSaldosCuentasPorPagars()) {
				if(saldoscuentasporpagarAux.getId().equals(saldoscuentasporpagar.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(SaldosCuentasPorPagar saldoscuentasporpagarAux:this.saldoscuentasporpagars) {
				if(saldoscuentasporpagarAux.getId().equals(saldoscuentasporpagar.getId())) {
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
	
	public void setCamposBaseDesdeOriginalSaldosCuentasPorPagar(SaldosCuentasPorPagar saldoscuentasporpagarOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(SaldosCuentasPorPagar saldoscuentasporpagarAux:this.saldoscuentasporpagarLogic.getSaldosCuentasPorPagars()) {
				if(saldoscuentasporpagarAux.getSaldosCuentasPorPagarOriginal().getId().equals(saldoscuentasporpagarOriginal.getId())) {
					existe=true;
					saldoscuentasporpagarOriginal.setId(saldoscuentasporpagarAux.getId());
					saldoscuentasporpagarOriginal.setVersionRow(saldoscuentasporpagarAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(SaldosCuentasPorPagar saldoscuentasporpagarAux:this.saldoscuentasporpagars) {
				if(saldoscuentasporpagarAux.getSaldosCuentasPorPagarOriginal().getId().equals(saldoscuentasporpagarOriginal.getId())) {
					existe=true;
					saldoscuentasporpagarOriginal.setId(saldoscuentasporpagarAux.getId());
					saldoscuentasporpagarOriginal.setVersionRow(saldoscuentasporpagarAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosSaldosCuentasPorPagar(Boolean esParaCancelar) throws Exception {
		saldoscuentasporpagarsAux=new ArrayList<SaldosCuentasPorPagar>();
		saldoscuentasporpagarAux=new SaldosCuentasPorPagar();
		
		if(!this.saldoscuentasporpagarSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(SaldosCuentasPorPagar saldoscuentasporpagarAux:this.saldoscuentasporpagarLogic.getSaldosCuentasPorPagars()) {
					if(saldoscuentasporpagarAux.getId()<0) {
						saldoscuentasporpagarsAux.add(saldoscuentasporpagarAux);
					}		
				}
				this.iIdNuevoSaldosCuentasPorPagar=0L;
				this.saldoscuentasporpagarLogic.getSaldosCuentasPorPagars().removeAll(saldoscuentasporpagarsAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(SaldosCuentasPorPagar saldoscuentasporpagarAux:this.saldoscuentasporpagars) {
					if(saldoscuentasporpagarAux.getId()<0) {
						saldoscuentasporpagarsAux.add(saldoscuentasporpagarAux);
					}		
				}
				this.iIdNuevoSaldosCuentasPorPagar=0L;
				this.saldoscuentasporpagars.removeAll(saldoscuentasporpagarsAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoSaldosCuentasPorPagar 
					&& this.saldoscuentasporpagarLogic.getSaldosCuentasPorPagars().size()>0
					) {
					saldoscuentasporpagarAux=this.saldoscuentasporpagarLogic.getSaldosCuentasPorPagars().get(this.saldoscuentasporpagarLogic.getSaldosCuentasPorPagars().size() - 1);
				
					if(saldoscuentasporpagarAux.getId()<0) {
						this.saldoscuentasporpagarLogic.getSaldosCuentasPorPagars().remove(saldoscuentasporpagarAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoSaldosCuentasPorPagar && this.saldoscuentasporpagars.size()>0) {
					saldoscuentasporpagarAux=this.saldoscuentasporpagars.get(this.saldoscuentasporpagars.size() - 1);
				
					if(saldoscuentasporpagarAux.getId()<0) {
						this.saldoscuentasporpagars.remove(saldoscuentasporpagarAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoSaldosCuentasPorPagar(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(saldoscuentasporpagar.getId()<0) {
				this.saldoscuentasporpagarLogic.getSaldosCuentasPorPagars().remove(this.saldoscuentasporpagar);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(saldoscuentasporpagar.getId()<0) {
				this.saldoscuentasporpagars.remove(this.saldoscuentasporpagar);
			}
		}			
	}
	
	public void setEstadosInicialesSaldosCuentasPorPagar(List<SaldosCuentasPorPagar> saldoscuentasporpagarsAux) throws Exception {
		SaldosCuentasPorPagarConstantesFunciones.setEstadosInicialesSaldosCuentasPorPagar(saldoscuentasporpagarsAux);
	}
	
	public void setEstadosInicialesSaldosCuentasPorPagar(SaldosCuentasPorPagar saldoscuentasporpagarAux) throws Exception {
		SaldosCuentasPorPagarConstantesFunciones.setEstadosInicialesSaldosCuentasPorPagar(saldoscuentasporpagarAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarSaldosCuentasPorPagarActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesSaldosCuentasPorPagar("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,SaldosCuentasPorPagarConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarSaldosCuentasPorPagarActual()) {
				if(!this.isEsNuevoSaldosCuentasPorPagar) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesSaldosCuentasPorPagar("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoSaldosCuentasPorPagar=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,SaldosCuentasPorPagarConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarSaldosCuentasPorPagarActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Saldos Cuentas Por Pagar ?", "MANTENIMIENTO DE Saldos Cuentas Por Pagar", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesSaldosCuentasPorPagar("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,SaldosCuentasPorPagarConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SaldosCuentasPorPagarConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(SaldosCuentasPorPagar saldoscuentasporpagar) throws Exception {
		SaldosCuentasPorPagarConstantesFunciones.seleccionarAsignar(this.saldoscuentasporpagar,saldoscuentasporpagar);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarSaldosCuentasPorPagar=this.isPermisoActualizarOriginalSaldosCuentasPorPagar;
			
			
			this.seleccionarAsignar(saldoscuentasporpagar);
			
			
			
			
			
			this.actualizarEstadoCeldasBotonesSaldosCuentasPorPagar("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SaldosCuentasPorPagarConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.saldoscuentasporpagarSessionBean.setsFuncionBusquedaRapida(this.saldoscuentasporpagarSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SaldosCuentasPorPagarConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoSaldosCuentasPorPagar) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosSaldosCuentasPorPagar(esParaCancelar);				
				this.cancelarNuevoSaldosCuentasPorPagar(esParaCancelar);								
			}
			
			this.saldoscuentasporpagar=new SaldosCuentasPorPagar();
			
			this.inicializarSaldosCuentasPorPagar();
			
			this.actualizarEstadoCeldasBotonesSaldosCuentasPorPagar("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SaldosCuentasPorPagarConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarSaldosCuentasPorPagar() throws Exception {
		try {
			SaldosCuentasPorPagarConstantesFunciones.inicializarSaldosCuentasPorPagar(this.saldoscuentasporpagar);
			
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
			FuncionesSwing.manageException(this, e,logger,SaldosCuentasPorPagarConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.saldoscuentasporpagarLogic.getSaldosCuentasPorPagars().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SaldosCuentasPorPagarConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteSaldosCuentasPorPagars(String sAccionBusqueda,List<SaldosCuentasPorPagar> saldoscuentasporpagarsParaReportes) throws Exception {
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
					sPathReporteFinal="SaldosCuentasPorPagar"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="SaldosCuentasPorPagarMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("SaldosCuentasPorPagarMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="SaldosCuentasPorPagar"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Saldos Cuentas Por Pagares");		
		parameters.put("busquedapor", SaldosCuentasPorPagarConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceSaldosCuentasPorPagar=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			SaldosCuentasPorPagarConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			SaldosCuentasPorPagarConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceSaldosCuentasPorPagar=new JRBeanArrayDataSource(SaldosCuentasPorPagarJInternalFrame.TraerSaldosCuentasPorPagarBeans(saldoscuentasporpagarsParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceSaldosCuentasPorPagar);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+SaldosCuentasPorPagarConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+SaldosCuentasPorPagarConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(SaldosCuentasPorPagarBean.TraerSaldosCuentasPorPagarBeans(saldoscuentasporpagarsParaReportes).toArray()));
							
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
				this.generarExcelReporteSaldosCuentasPorPagars(sAccionBusqueda,sTipoArchivoReporte,saldoscuentasporpagarsParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalSaldosCuentasPorPagars(sAccionBusqueda,sTipoArchivoReporte,saldoscuentasporpagarsParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoSaldosCuentasPorPagarActionPerformed(null);
					//this.generarExcelReporteSaldosCuentasPorPagars(sAccionBusqueda,sTipoArchivoReporte,saldoscuentasporpagarsParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalSaldosCuentasPorPagars(sAccionBusqueda,sTipoArchivoReporte,saldoscuentasporpagarsParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesSaldosCuentasPorPagars(sAccionBusqueda,sTipoArchivoReporte,saldoscuentasporpagarsParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesSaldosCuentasPorPagars(sAccionBusqueda,sTipoArchivoReporte,saldoscuentasporpagarsParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteSaldosCuentasPorPagars(String sAccionBusqueda,String sTipoArchivoReporte,List<SaldosCuentasPorPagar> saldoscuentasporpagarsParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"saldoscuentasporpagar";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("SaldosCuentasPorPagars");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderSaldosCuentasPorPagar("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(SaldosCuentasPorPagar saldoscuentasporpagar : saldoscuentasporpagarsParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			SaldosCuentasPorPagarConstantesFunciones.generarExcelReporteDataSaldosCuentasPorPagar("NORMAL",row,workbook,saldoscuentasporpagar,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.saldoscuentasporpagarSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Saldos Cuentas Por Pagar",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderSaldosCuentasPorPagar(String sTipo,Row row,Workbook workbook) {
		
		SaldosCuentasPorPagarConstantesFunciones.generarExcelReporteHeaderSaldosCuentasPorPagar(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalSaldosCuentasPorPagars(String sAccionBusqueda,String sTipoArchivoReporte,List<SaldosCuentasPorPagar> saldoscuentasporpagarsParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"saldoscuentasporpagar_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("SaldosCuentasPorPagars");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(SaldosCuentasPorPagar saldoscuentasporpagar : saldoscuentasporpagarsParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(SaldosCuentasPorPagarConstantesFunciones.getSaldosCuentasPorPagarDescripcion(saldoscuentasporpagar));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(SaldosCuentasPorPagarConstantesFunciones.LABEL_IDZONA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(SaldosCuentasPorPagarConstantesFunciones.LABEL_IDZONA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(saldoscuentasporpagar.getzona_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(SaldosCuentasPorPagarConstantesFunciones.LABEL_IDGRUPOCLIENTE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(SaldosCuentasPorPagarConstantesFunciones.LABEL_IDGRUPOCLIENTE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(saldoscuentasporpagar.getgrupocliente_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(SaldosCuentasPorPagarConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(SaldosCuentasPorPagarConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(saldoscuentasporpagar.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(SaldosCuentasPorPagarConstantesFunciones.LABEL_IDSUCURSAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(SaldosCuentasPorPagarConstantesFunciones.LABEL_IDSUCURSAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(saldoscuentasporpagar.getsucursal_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(SaldosCuentasPorPagarConstantesFunciones.LABEL_IDCLIENTE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(SaldosCuentasPorPagarConstantesFunciones.LABEL_IDCLIENTE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(saldoscuentasporpagar.getcliente_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(SaldosCuentasPorPagarConstantesFunciones.LABEL_FECHAEMISIONHASTA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(SaldosCuentasPorPagarConstantesFunciones.LABEL_FECHAEMISIONHASTA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(saldoscuentasporpagar.getfecha_emision_hasta());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(SaldosCuentasPorPagarConstantesFunciones.LABEL_CODIGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(SaldosCuentasPorPagarConstantesFunciones.LABEL_CODIGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(saldoscuentasporpagar.getcodigo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(SaldosCuentasPorPagarConstantesFunciones.LABEL_NOMBRECOMPLETO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(SaldosCuentasPorPagarConstantesFunciones.LABEL_NOMBRECOMPLETO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(saldoscuentasporpagar.getnombre_completo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(SaldosCuentasPorPagarConstantesFunciones.LABEL_DEBITOMONELOCAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(SaldosCuentasPorPagarConstantesFunciones.LABEL_DEBITOMONELOCAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(saldoscuentasporpagar.getdebito_mone_local());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(SaldosCuentasPorPagarConstantesFunciones.LABEL_CREDITOMONELOCAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(SaldosCuentasPorPagarConstantesFunciones.LABEL_CREDITOMONELOCAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(saldoscuentasporpagar.getcredito_mone_local());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(SaldosCuentasPorPagarConstantesFunciones.LABEL_SALDOANTERIOR))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(SaldosCuentasPorPagarConstantesFunciones.LABEL_SALDOANTERIOR);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(saldoscuentasporpagar.getsaldo_anterior());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(SaldosCuentasPorPagarConstantesFunciones.LABEL_SALDODEBITO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(SaldosCuentasPorPagarConstantesFunciones.LABEL_SALDODEBITO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(saldoscuentasporpagar.getsaldo_debito());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(SaldosCuentasPorPagarConstantesFunciones.LABEL_SALDOCREDITO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(SaldosCuentasPorPagarConstantesFunciones.LABEL_SALDOCREDITO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(saldoscuentasporpagar.getsaldo_credito());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.saldoscuentasporpagarSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Saldos Cuentas Por Pagar",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesSaldosCuentasPorPagars(String sAccionBusqueda,String sTipoArchivoReporte,List<SaldosCuentasPorPagar> saldoscuentasporpagarsParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<SaldosCuentasPorPagar> saldoscuentasporpagarsRespaldo=null;
		
		classes=SaldosCuentasPorPagarConstantesFunciones.getClassesRelationshipsOfSaldosCuentasPorPagar(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.saldoscuentasporpagarLogic.setDatosCliente(this.datosCliente);
		this.saldoscuentasporpagarLogic.setDatosDeep(this.datosDeep);
		this.saldoscuentasporpagarLogic.setIsConDeep(true);
		
		saldoscuentasporpagarsRespaldo=this.saldoscuentasporpagarLogic.getSaldosCuentasPorPagars();
		
		this.saldoscuentasporpagarLogic.setSaldosCuentasPorPagars(saldoscuentasporpagarsParaReportes);	
		this.saldoscuentasporpagarLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		saldoscuentasporpagarsParaReportes=this.saldoscuentasporpagarLogic.getSaldosCuentasPorPagars();
		this.saldoscuentasporpagarLogic.setSaldosCuentasPorPagars(saldoscuentasporpagarsRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"saldoscuentasporpagar_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("SaldosCuentasPorPagars");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderSaldosCuentasPorPagar("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(SaldosCuentasPorPagar saldoscuentasporpagar : saldoscuentasporpagarsParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderSaldosCuentasPorPagar("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			SaldosCuentasPorPagarConstantesFunciones.generarExcelReporteDataSaldosCuentasPorPagar("NORMAL",row,workbook,saldoscuentasporpagar,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(SaldosCuentasPorPagarConstantesFunciones.getSaldosCuentasPorPagarDescripcion(saldoscuentasporpagar));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.saldoscuentasporpagarSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Saldos Cuentas Por Pagar",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoSaldosCuentasPorPagar.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoSaldosCuentasPorPagar.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoSaldosCuentasPorPagar.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoSaldosCuentasPorPagar.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessSaldosCuentasPorPagar() throws Exception {		
		this.startProcessSaldosCuentasPorPagar(true);
	}
	
	public void startProcessSaldosCuentasPorPagar(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasSaldosCuentasPorPagar ,this.jPanelParametrosReportesSaldosCuentasPorPagar, this.jScrollPanelDatosSaldosCuentasPorPagar,this.jPanelPaginacionSaldosCuentasPorPagar, this.jScrollPanelDatosEdicionSaldosCuentasPorPagar, this.jPanelAccionesSaldosCuentasPorPagar,this.jPanelAccionesFormularioSaldosCuentasPorPagar,this.jmenuBarSaldosCuentasPorPagar,this.jmenuBarDetalleSaldosCuentasPorPagar,this.jTtoolBarSaldosCuentasPorPagar,this.jTtoolBarDetalleSaldosCuentasPorPagar);		
		
		final JTabbedPane jTabbedPaneBusquedasSaldosCuentasPorPagar=this.jTabbedPaneBusquedasSaldosCuentasPorPagar; 
		
		final JPanel jPanelParametrosReportesSaldosCuentasPorPagar=this.jPanelParametrosReportesSaldosCuentasPorPagar;
		//final JScrollPane jScrollPanelDatosSaldosCuentasPorPagar=this.jScrollPanelDatosSaldosCuentasPorPagar;
		final JTable jTableDatosSaldosCuentasPorPagar=this.jTableDatosSaldosCuentasPorPagar;		
		final JPanel jPanelPaginacionSaldosCuentasPorPagar=this.jPanelPaginacionSaldosCuentasPorPagar;
		//final JScrollPane jScrollPanelDatosEdicionSaldosCuentasPorPagar=this.jScrollPanelDatosEdicionSaldosCuentasPorPagar;
		final JPanel jPanelAccionesSaldosCuentasPorPagar=this.jPanelAccionesSaldosCuentasPorPagar;
		
		JPanel jPanelCamposAuxiliarSaldosCuentasPorPagar=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarSaldosCuentasPorPagar=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormSaldosCuentasPorPagar!=null) {
			jPanelCamposAuxiliarSaldosCuentasPorPagar=this.jInternalFrameDetalleFormSaldosCuentasPorPagar.jPanelCamposSaldosCuentasPorPagar;
			jPanelAccionesFormularioAuxiliarSaldosCuentasPorPagar=this.jInternalFrameDetalleFormSaldosCuentasPorPagar.jPanelAccionesFormularioSaldosCuentasPorPagar;
		}
		
		final JPanel jPanelCamposSaldosCuentasPorPagar=jPanelCamposAuxiliarSaldosCuentasPorPagar;
		final JPanel jPanelAccionesFormularioSaldosCuentasPorPagar=jPanelAccionesFormularioAuxiliarSaldosCuentasPorPagar;
		
		
		final JMenuBar jmenuBarSaldosCuentasPorPagar=this.jmenuBarSaldosCuentasPorPagar;
		final JToolBar jTtoolBarSaldosCuentasPorPagar=this.jTtoolBarSaldosCuentasPorPagar;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarSaldosCuentasPorPagar=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarSaldosCuentasPorPagar=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormSaldosCuentasPorPagar!=null) {
			jmenuBarDetalleAuxiliarSaldosCuentasPorPagar=this.jInternalFrameDetalleFormSaldosCuentasPorPagar.jmenuBarDetalleSaldosCuentasPorPagar;
			jTtoolBarDetalleAuxiliarSaldosCuentasPorPagar=this.jInternalFrameDetalleFormSaldosCuentasPorPagar.jTtoolBarDetalleSaldosCuentasPorPagar;
		}
		
		final JMenuBar jmenuBarDetalleSaldosCuentasPorPagar=jmenuBarDetalleAuxiliarSaldosCuentasPorPagar;
		final JToolBar jTtoolBarDetalleSaldosCuentasPorPagar=jTtoolBarDetalleAuxiliarSaldosCuentasPorPagar;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasSaldosCuentasPorPagar;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesSaldosCuentasPorPagar;
			processRunnable.jTableDatos=jTableDatosSaldosCuentasPorPagar;
			processRunnable.jPanelCampos=jPanelCamposSaldosCuentasPorPagar;
			processRunnable.jPanelPaginacion=jPanelPaginacionSaldosCuentasPorPagar;
			processRunnable.jPanelAcciones=jPanelAccionesSaldosCuentasPorPagar;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioSaldosCuentasPorPagar;
			
			
			processRunnable.jmenuBar=jmenuBarSaldosCuentasPorPagar;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleSaldosCuentasPorPagar;
			processRunnable.jTtoolBar=jTtoolBarSaldosCuentasPorPagar;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleSaldosCuentasPorPagar;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasSaldosCuentasPorPagar ,jPanelParametrosReportesSaldosCuentasPorPagar,jTableDatosSaldosCuentasPorPagar, /*jScrollPanelDatosSaldosCuentasPorPagar,*/jPanelCamposSaldosCuentasPorPagar,jPanelPaginacionSaldosCuentasPorPagar, /*jScrollPanelDatosEdicionSaldosCuentasPorPagar,*/ jPanelAccionesSaldosCuentasPorPagar,jPanelAccionesFormularioSaldosCuentasPorPagar,jmenuBarSaldosCuentasPorPagar,jmenuBarDetalleSaldosCuentasPorPagar,jTtoolBarSaldosCuentasPorPagar,jTtoolBarDetalleSaldosCuentasPorPagar);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasSaldosCuentasPorPagar ,jPanelParametrosReportesSaldosCuentasPorPagar, jScrollPanelDatosSaldosCuentasPorPagar,jPanelPaginacionSaldosCuentasPorPagar, jScrollPanelDatosEdicionSaldosCuentasPorPagar, jPanelAccionesSaldosCuentasPorPagar,jPanelAccionesFormularioSaldosCuentasPorPagar,jmenuBarSaldosCuentasPorPagar,jmenuBarDetalleSaldosCuentasPorPagar,jTtoolBarSaldosCuentasPorPagar,jTtoolBarDetalleSaldosCuentasPorPagar);
						
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
	
	public void finishProcessSaldosCuentasPorPagar() {// throws Exception 
		this.finishProcessSaldosCuentasPorPagar(true);
	}
	
	public void finishProcessSaldosCuentasPorPagar(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasSaldosCuentasPorPagar ,this.jPanelParametrosReportesSaldosCuentasPorPagar, this.jScrollPanelDatosSaldosCuentasPorPagar,this.jPanelPaginacionSaldosCuentasPorPagar, this.jScrollPanelDatosEdicionSaldosCuentasPorPagar, this.jPanelAccionesSaldosCuentasPorPagar,this.jPanelAccionesFormularioSaldosCuentasPorPagar,this.jmenuBarSaldosCuentasPorPagar,this.jmenuBarDetalleSaldosCuentasPorPagar,this.jTtoolBarSaldosCuentasPorPagar,this.jTtoolBarDetalleSaldosCuentasPorPagar);		
		
		final JTabbedPane jTabbedPaneBusquedasSaldosCuentasPorPagar=this.jTabbedPaneBusquedasSaldosCuentasPorPagar; 
		
		final JPanel jPanelParametrosReportesSaldosCuentasPorPagar=this.jPanelParametrosReportesSaldosCuentasPorPagar;
		//final JScrollPane jScrollPanelDatosSaldosCuentasPorPagar=this.jScrollPanelDatosSaldosCuentasPorPagar;
		final JTable jTableDatosSaldosCuentasPorPagar=this.jTableDatosSaldosCuentasPorPagar;		
		final JPanel jPanelPaginacionSaldosCuentasPorPagar=this.jPanelPaginacionSaldosCuentasPorPagar;
		//final JScrollPane jScrollPanelDatosEdicionSaldosCuentasPorPagar=this.jScrollPanelDatosEdicionSaldosCuentasPorPagar;
		final JPanel jPanelAccionesSaldosCuentasPorPagar=this.jPanelAccionesSaldosCuentasPorPagar;
		
		JPanel jPanelCamposAuxiliarSaldosCuentasPorPagar=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarSaldosCuentasPorPagar=new JPanel();
		
		if(this.jInternalFrameDetalleFormSaldosCuentasPorPagar!=null) {
			jPanelCamposAuxiliarSaldosCuentasPorPagar=this.jInternalFrameDetalleFormSaldosCuentasPorPagar.jPanelCamposSaldosCuentasPorPagar;
			jPanelAccionesFormularioAuxiliarSaldosCuentasPorPagar=this.jInternalFrameDetalleFormSaldosCuentasPorPagar.jPanelAccionesFormularioSaldosCuentasPorPagar;
		}
		
		final JPanel jPanelCamposSaldosCuentasPorPagar=jPanelCamposAuxiliarSaldosCuentasPorPagar;
		final JPanel jPanelAccionesFormularioSaldosCuentasPorPagar=jPanelAccionesFormularioAuxiliarSaldosCuentasPorPagar;
		
		
		final JMenuBar jmenuBarSaldosCuentasPorPagar=this.jmenuBarSaldosCuentasPorPagar;		
		final JToolBar jTtoolBarSaldosCuentasPorPagar=this.jTtoolBarSaldosCuentasPorPagar;
				
		JMenuBar jmenuBarDetalleAuxiliarSaldosCuentasPorPagar=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarSaldosCuentasPorPagar=new JToolBar();
		
		if(this.jInternalFrameDetalleFormSaldosCuentasPorPagar!=null) {
			jmenuBarDetalleAuxiliarSaldosCuentasPorPagar=this.jInternalFrameDetalleFormSaldosCuentasPorPagar.jmenuBarDetalleSaldosCuentasPorPagar;
			jTtoolBarDetalleAuxiliarSaldosCuentasPorPagar=this.jInternalFrameDetalleFormSaldosCuentasPorPagar.jTtoolBarDetalleSaldosCuentasPorPagar;		
		}
		
		final JMenuBar jmenuBarDetalleSaldosCuentasPorPagar=jmenuBarDetalleAuxiliarSaldosCuentasPorPagar;
		final JToolBar jTtoolBarDetalleSaldosCuentasPorPagar=jTtoolBarDetalleAuxiliarSaldosCuentasPorPagar;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasSaldosCuentasPorPagar;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesSaldosCuentasPorPagar;
			processRunnable.jTableDatos=jTableDatosSaldosCuentasPorPagar;
			processRunnable.jPanelCampos=jPanelCamposSaldosCuentasPorPagar;
			processRunnable.jPanelPaginacion=jPanelPaginacionSaldosCuentasPorPagar;
			processRunnable.jPanelAcciones=jPanelAccionesSaldosCuentasPorPagar;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioSaldosCuentasPorPagar;
			
			
			processRunnable.jmenuBar=jmenuBarSaldosCuentasPorPagar;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleSaldosCuentasPorPagar;
			processRunnable.jTtoolBar=jTtoolBarSaldosCuentasPorPagar;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleSaldosCuentasPorPagar;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasSaldosCuentasPorPagar ,jPanelParametrosReportesSaldosCuentasPorPagar, jTableDatosSaldosCuentasPorPagar,/*jScrollPanelDatosSaldosCuentasPorPagar,*/jPanelCamposSaldosCuentasPorPagar,jPanelPaginacionSaldosCuentasPorPagar, /*jScrollPanelDatosEdicionSaldosCuentasPorPagar,*/ jPanelAccionesSaldosCuentasPorPagar,jPanelAccionesFormularioSaldosCuentasPorPagar,jmenuBarSaldosCuentasPorPagar,jmenuBarDetalleSaldosCuentasPorPagar,jTtoolBarSaldosCuentasPorPagar,jTtoolBarDetalleSaldosCuentasPorPagar));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesSaldosCuentasPorPagar(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarSaldosCuentasPorPagar(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuSaldosCuentasPorPagar(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarSaldosCuentasPorPagar(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarSaldosCuentasPorPagar,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleSaldosCuentasPorPagar,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuSaldosCuentasPorPagar(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarSaldosCuentasPorPagar,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleSaldosCuentasPorPagar,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.saldoscuentasporpagarConstantesFunciones.getsFinalQuerySaldosCuentasPorPagar();
		String  finalQueryPaginacionTodos=this.saldoscuentasporpagarConstantesFunciones.getsFinalQuerySaldosCuentasPorPagar();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=SaldosCuentasPorPagarConstantesFunciones.getArrayColumnasGlobalesNoSaldosCuentasPorPagar(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=SaldosCuentasPorPagarConstantesFunciones.getArrayColumnasGlobalesSaldosCuentasPorPagar(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,SaldosCuentasPorPagarConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.saldoscuentasporpagarsEliminados= new ArrayList<SaldosCuentasPorPagar>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessSaldosCuentasPorPagar();
		
				///*SaldosCuentasPorPagarSessionBean*/this.saldoscuentasporpagarSessionBean=new SaldosCuentasPorPagarSessionBean();
			
			if(this.saldoscuentasporpagarSessionBean==null) {
				this.saldoscuentasporpagarSessionBean=new SaldosCuentasPorPagarSessionBean();
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
					this.iNumeroPaginacion=SaldosCuentasPorPagarConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=SaldosCuentasPorPagarConstantesFunciones.getClassesForeignKeysOfSaldosCuentasPorPagar(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/saldoscuentasporpagar."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			saldoscuentasporpagarsAux= new ArrayList<SaldosCuentasPorPagar>();
			
				
			saldoscuentasporpagarLogic.setDatosCliente(this.datosCliente);
			saldoscuentasporpagarLogic.setDatosDeep(this.datosDeep);
			saldoscuentasporpagarLogic.setIsConDeep(true);
			
			
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
			}
			
		
			else if(sAccionBusqueda.equals("BusquedaSaldosCuentasPorPagar")) {
				this.sDetalleReporte=SaldosCuentasPorPagarConstantesFunciones.getDetalleIndiceBusquedaSaldosCuentasPorPagar(id_zonaBusquedaSaldosCuentasPorPagar,id_grupo_clienteBusquedaSaldosCuentasPorPagar,id_clienteBusquedaSaldosCuentasPorPagar,fecha_emision_hastaBusquedaSaldosCuentasPorPagar);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					saldoscuentasporpagarLogic.getSaldosCuentasPorPagarsBusquedaSaldosCuentasPorPagar(finalQueryGlobal,pagination,this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,id_zonaBusquedaSaldosCuentasPorPagar,id_grupo_clienteBusquedaSaldosCuentasPorPagar,id_clienteBusquedaSaldosCuentasPorPagar,fecha_emision_hastaBusquedaSaldosCuentasPorPagar);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=SaldosCuentasPorPagarConstantesFunciones.getDetalleIndiceBusquedaSaldosCuentasPorPagar(id_zonaBusquedaSaldosCuentasPorPagar,id_grupo_clienteBusquedaSaldosCuentasPorPagar,id_clienteBusquedaSaldosCuentasPorPagar,fecha_emision_hastaBusquedaSaldosCuentasPorPagar);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=SaldosCuentasPorPagarConstantesFunciones.getDetalleIndiceBusquedaSaldosCuentasPorPagar(id_zonaBusquedaSaldosCuentasPorPagar,id_grupo_clienteBusquedaSaldosCuentasPorPagar,id_clienteBusquedaSaldosCuentasPorPagar,fecha_emision_hastaBusquedaSaldosCuentasPorPagar);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=saldoscuentasporpagarLogic.getSaldosCuentasPorPagars()==null||saldoscuentasporpagarLogic.getSaldosCuentasPorPagars().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=saldoscuentasporpagars==null|| saldoscuentasporpagars.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						saldoscuentasporpagarsAux=new ArrayList<SaldosCuentasPorPagar>();
						saldoscuentasporpagarsAux.addAll(saldoscuentasporpagarLogic.getSaldosCuentasPorPagars());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							saldoscuentasporpagarsAux=new ArrayList<SaldosCuentasPorPagar>();
							saldoscuentasporpagarsAux.addAll(saldoscuentasporpagars);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							saldoscuentasporpagarLogic.getSaldosCuentasPorPagarsBusquedaSaldosCuentasPorPagar(finalQueryGlobal,pagination,this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,id_zonaBusquedaSaldosCuentasPorPagar,id_grupo_clienteBusquedaSaldosCuentasPorPagar,id_clienteBusquedaSaldosCuentasPorPagar,fecha_emision_hastaBusquedaSaldosCuentasPorPagar);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=SaldosCuentasPorPagarConstantesFunciones.getDetalleIndiceBusquedaSaldosCuentasPorPagar(id_zonaBusquedaSaldosCuentasPorPagar,id_grupo_clienteBusquedaSaldosCuentasPorPagar,id_clienteBusquedaSaldosCuentasPorPagar,fecha_emision_hastaBusquedaSaldosCuentasPorPagar);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=SaldosCuentasPorPagarConstantesFunciones.getDetalleIndiceBusquedaSaldosCuentasPorPagar(id_zonaBusquedaSaldosCuentasPorPagar,id_grupo_clienteBusquedaSaldosCuentasPorPagar,id_clienteBusquedaSaldosCuentasPorPagar,fecha_emision_hastaBusquedaSaldosCuentasPorPagar);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteSaldosCuentasPorPagars("BusquedaSaldosCuentasPorPagar",saldoscuentasporpagarLogic.getSaldosCuentasPorPagars());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteSaldosCuentasPorPagars("BusquedaSaldosCuentasPorPagar",saldoscuentasporpagars);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						saldoscuentasporpagarLogic.setSaldosCuentasPorPagars(new ArrayList<SaldosCuentasPorPagar>());
						saldoscuentasporpagarLogic.getSaldosCuentasPorPagars().addAll(saldoscuentasporpagarsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							saldoscuentasporpagars=new ArrayList<SaldosCuentasPorPagar>();
							saldoscuentasporpagars.addAll(saldoscuentasporpagarsAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesSaldosCuentasPorPagar();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessSaldosCuentasPorPagar();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=saldoscuentasporpagarLogic.getSaldosCuentasPorPagars().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=saldoscuentasporpagars.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=saldoscuentasporpagarLogic.getSaldosCuentasPorPagars().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=saldoscuentasporpagars.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(SaldosCuentasPorPagar saldoscuentasporpagar) {
		Boolean permite=true;
		
		if(this.saldoscuentasporpagar.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=SaldosCuentasPorPagarConstantesFunciones.getOrderByListaSaldosCuentasPorPagar();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=SaldosCuentasPorPagarConstantesFunciones.getOrderByListaSaldosCuentasPorPagar();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(SaldosCuentasPorPagar saldoscuentasporpagar:saldoscuentasporpagarLogic.getSaldosCuentasPorPagars()) {
				if(saldoscuentasporpagar.getsType().equals(Constantes2.S_TOTALES)) {
					saldoscuentasporpagarTotales=saldoscuentasporpagar;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(SaldosCuentasPorPagar saldoscuentasporpagar:this.saldoscuentasporpagars) {
				if(saldoscuentasporpagar.getsType().equals(Constantes2.S_TOTALES)) {
					saldoscuentasporpagarTotales=saldoscuentasporpagar;
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
			this.saldoscuentasporpagarAux=new SaldosCuentasPorPagar();
			this.saldoscuentasporpagarAux.setsType(Constantes2.S_TOTALES);
			this.saldoscuentasporpagarAux.setIsNew(false);
			this.saldoscuentasporpagarAux.setIsChanged(false);
			this.saldoscuentasporpagarAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				//SaldosCuentasPorPagarConstantesFunciones.TotalizarValoresFilaSaldosCuentasPorPagar(this.saldoscuentasporpagarLogic.getSaldosCuentasPorPagars(),this.saldoscuentasporpagarAux);
				
				//this.saldoscuentasporpagarLogic.getSaldosCuentasPorPagars().add(this.saldoscuentasporpagarAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				SaldosCuentasPorPagarConstantesFunciones.TotalizarValoresFilaSaldosCuentasPorPagar(this.saldoscuentasporpagars,this.saldoscuentasporpagarAux);
				
				this.saldoscuentasporpagars.add(this.saldoscuentasporpagarAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		saldoscuentasporpagarTotales=new SaldosCuentasPorPagar();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.saldoscuentasporpagarLogic.getSaldosCuentasPorPagars().remove(saldoscuentasporpagarTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.saldoscuentasporpagars.remove(saldoscuentasporpagarTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		saldoscuentasporpagarTotales=new SaldosCuentasPorPagar();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(SaldosCuentasPorPagar saldoscuentasporpagar:saldoscuentasporpagarLogic.getSaldosCuentasPorPagars()) {
				if(saldoscuentasporpagar.getsType().equals(Constantes2.S_TOTALES)) {
					saldoscuentasporpagarTotales=saldoscuentasporpagar;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				SaldosCuentasPorPagarConstantesFunciones.TotalizarValoresFilaSaldosCuentasPorPagar(this.saldoscuentasporpagarLogic.getSaldosCuentasPorPagars(),saldoscuentasporpagarTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(SaldosCuentasPorPagar saldoscuentasporpagar:this.saldoscuentasporpagars) {
				if(saldoscuentasporpagar.getsType().equals(Constantes2.S_TOTALES)) {
					saldoscuentasporpagarTotales=saldoscuentasporpagar;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				SaldosCuentasPorPagarConstantesFunciones.TotalizarValoresFilaSaldosCuentasPorPagar(this.saldoscuentasporpagars,saldoscuentasporpagarTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SaldosCuentasPorPagarConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getSaldosCuentasPorPagarsBusquedaSaldosCuentasPorPagar()throws Exception {
		try {
			sAccionBusqueda="BusquedaSaldosCuentasPorPagar";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getSaldosCuentasPorPagarsFK_IdCliente()throws Exception {
		try {
			sAccionBusqueda="FK_IdCliente";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getSaldosCuentasPorPagarsFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getSaldosCuentasPorPagarsFK_IdGrupoCliente()throws Exception {
		try {
			sAccionBusqueda="FK_IdGrupoCliente";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getSaldosCuentasPorPagarsFK_IdSucursal()throws Exception {
		try {
			sAccionBusqueda="FK_IdSucursal";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getSaldosCuentasPorPagarsFK_IdZona()throws Exception {
		try {
			sAccionBusqueda="FK_IdZona";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getSaldosCuentasPorPagarsBusquedaSaldosCuentasPorPagar(String sFinalQuery,Long id_zona,Long id_grupo_cliente,Long id_cliente,Date fecha_emision_hasta)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//saldoscuentasporpagarLogic.getSaldosCuentasPorPagarsBusquedaSaldosCuentasPorPagar(sFinalQuery,this.pagination,id_zona,id_grupo_cliente,id_cliente,fecha_emision_hasta);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getSaldosCuentasPorPagarsFK_IdCliente(String sFinalQuery,Long id_cliente)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//saldoscuentasporpagarLogic.getSaldosCuentasPorPagarsFK_IdCliente(sFinalQuery,this.pagination,id_cliente);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getSaldosCuentasPorPagarsFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//saldoscuentasporpagarLogic.getSaldosCuentasPorPagarsFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getSaldosCuentasPorPagarsFK_IdGrupoCliente(String sFinalQuery,Long id_grupo_cliente)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//saldoscuentasporpagarLogic.getSaldosCuentasPorPagarsFK_IdGrupoCliente(sFinalQuery,this.pagination,id_grupo_cliente);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getSaldosCuentasPorPagarsFK_IdSucursal(String sFinalQuery,Long id_sucursal)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//saldoscuentasporpagarLogic.getSaldosCuentasPorPagarsFK_IdSucursal(sFinalQuery,this.pagination,id_sucursal);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getSaldosCuentasPorPagarsFK_IdZona(String sFinalQuery,Long id_zona)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//saldoscuentasporpagarLogic.getSaldosCuentasPorPagarsFK_IdZona(sFinalQuery,this.pagination,id_zona);
				
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
								
			//this.procesarBusqueda(sAccionBusqueda);
			
		} catch (Exception e) {
			throw e;
		}
	}		
	
	public void inicializarPermisosSaldosCuentasPorPagar() {
		this.isPermisoTodoSaldosCuentasPorPagar=false;
		this.isPermisoNuevoSaldosCuentasPorPagar=false;
		this.isPermisoActualizarSaldosCuentasPorPagar=false;
		this.isPermisoActualizarOriginalSaldosCuentasPorPagar=false;
		this.isPermisoEliminarSaldosCuentasPorPagar=false;
		this.isPermisoGuardarCambiosSaldosCuentasPorPagar=false;
		this.isPermisoConsultaSaldosCuentasPorPagar=true;
		this.isPermisoBusquedaSaldosCuentasPorPagar=true;
		this.isPermisoReporteSaldosCuentasPorPagar=true;
		this.isPermisoOrdenSaldosCuentasPorPagar=false;		
		this.isPermisoPaginacionMedioSaldosCuentasPorPagar=false;		
		this.isPermisoPaginacionAltoSaldosCuentasPorPagar=false;		
		this.isPermisoPaginacionTodoSaldosCuentasPorPagar=false;		
		this.isPermisoCopiarSaldosCuentasPorPagar=false;		
		this.isPermisoVerFormSaldosCuentasPorPagar=false;		
		this.isPermisoDuplicarSaldosCuentasPorPagar=false;
		this.isPermisoOrdenSaldosCuentasPorPagar=false;
	}
	
	public void setPermisosUsuarioSaldosCuentasPorPagar(Boolean isPermiso) {
		this.isPermisoTodoSaldosCuentasPorPagar=isPermiso;
		this.isPermisoNuevoSaldosCuentasPorPagar=isPermiso;
		this.isPermisoActualizarSaldosCuentasPorPagar=isPermiso;
		this.isPermisoActualizarOriginalSaldosCuentasPorPagar=isPermiso;
		this.isPermisoEliminarSaldosCuentasPorPagar=isPermiso;
		this.isPermisoGuardarCambiosSaldosCuentasPorPagar=isPermiso;
		this.isPermisoConsultaSaldosCuentasPorPagar=isPermiso;
		this.isPermisoBusquedaSaldosCuentasPorPagar=isPermiso;
		this.isPermisoReporteSaldosCuentasPorPagar=isPermiso;
		this.isPermisoOrdenSaldosCuentasPorPagar=isPermiso;		
		this.isPermisoPaginacionMedioSaldosCuentasPorPagar=isPermiso;		
		this.isPermisoPaginacionAltoSaldosCuentasPorPagar=isPermiso;		
		this.isPermisoPaginacionTodoSaldosCuentasPorPagar=isPermiso;		
		this.isPermisoCopiarSaldosCuentasPorPagar=isPermiso;		
		this.isPermisoVerFormSaldosCuentasPorPagar=isPermiso;		
		this.isPermisoDuplicarSaldosCuentasPorPagar=isPermiso;
		this.isPermisoOrdenSaldosCuentasPorPagar=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioSaldosCuentasPorPagar(Boolean isPermiso) {
		//this.isPermisoTodoSaldosCuentasPorPagar=isPermiso;
		this.isPermisoNuevoSaldosCuentasPorPagar=isPermiso;
		this.isPermisoActualizarSaldosCuentasPorPagar=isPermiso;
		this.isPermisoActualizarOriginalSaldosCuentasPorPagar=isPermiso;
		this.isPermisoEliminarSaldosCuentasPorPagar=isPermiso;
		this.isPermisoGuardarCambiosSaldosCuentasPorPagar=isPermiso;
		//this.isPermisoConsultaSaldosCuentasPorPagar=isPermiso;
		//this.isPermisoBusquedaSaldosCuentasPorPagar=isPermiso;
		//this.isPermisoReporteSaldosCuentasPorPagar=isPermiso;
		//this.isPermisoOrdenSaldosCuentasPorPagar=isPermiso;		
		//this.isPermisoPaginacionMedioSaldosCuentasPorPagar=isPermiso;		
		//this.isPermisoPaginacionAltoSaldosCuentasPorPagar=isPermiso;		
		//this.isPermisoPaginacionTodoSaldosCuentasPorPagar=isPermiso;		
		//this.isPermisoCopiarSaldosCuentasPorPagar=isPermiso;		
		//this.isPermisoDuplicarSaldosCuentasPorPagar=isPermiso;
		//this.isPermisoOrdenSaldosCuentasPorPagar=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioSaldosCuentasPorPagarClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(SaldosCuentasPorPagarJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebSaldosCuentasPorPagar(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioSaldosCuentasPorPagarClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioSaldosCuentasPorPagarClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionSaldosCuentasPorPagarClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioSaldosCuentasPorPagarClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioSaldosCuentasPorPagar() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(SaldosCuentasPorPagarJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.saldoscuentasporpagarSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, SaldosCuentasPorPagarConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoSaldosCuentasPorPagar=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarSaldosCuentasPorPagar=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalSaldosCuentasPorPagar=this.isPermisoActualizarSaldosCuentasPorPagar;
			this.isPermisoEliminarSaldosCuentasPorPagar=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosSaldosCuentasPorPagar=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaSaldosCuentasPorPagar=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaSaldosCuentasPorPagar=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoSaldosCuentasPorPagar=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteSaldosCuentasPorPagar=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenSaldosCuentasPorPagar=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioSaldosCuentasPorPagar=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoSaldosCuentasPorPagar=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoSaldosCuentasPorPagar=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarSaldosCuentasPorPagar=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormSaldosCuentasPorPagar=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarSaldosCuentasPorPagar=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenSaldosCuentasPorPagar=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.saldoscuentasporpagarSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosSaldosCuentasPorPagar.setToolTipText(this.jTableDatosSaldosCuentasPorPagar.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioSaldosCuentasPorPagar(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioSaldosCuentasPorPagar(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(SaldosCuentasPorPagarJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(SaldosCuentasPorPagarJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioSaldosCuentasPorPagar() throws Exception {
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
	public void inicializarCombosForeignKeySaldosCuentasPorPagarListas()throws Exception {
		try	{						
			
				this.zonasForeignKey=new ArrayList();
				this.grupoclientesForeignKey=new ArrayList();
				this.empresasForeignKey=new ArrayList();
				this.sucursalsForeignKey=new ArrayList();
				this.clientesForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeySaldosCuentasPorPagarListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(SaldosCuentasPorPagarJInternalFrame.ISLOAD_FKLOTE) {
			} else {
			
				this.cargarCombosForeignKeyZonaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyGrupoClienteListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeySucursalListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyClienteListas(cargarCombosDependencia,sFinalQueryCombo);
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

	public void cargarCombosForeignKeyGrupoClienteListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.grupoclientesForeignKey==null||this.grupoclientesForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=GrupoClienteConstantesFunciones.getArrayColumnasGlobalesGrupoCliente(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,GrupoClienteConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=GrupoClienteConstantesFunciones.SFINALQUERY;

				this.cargarCombosGrupoClientesForeignKeyLista(finalQueryGlobal);
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
	
	
	public void addItemDefectoCombosTodosForeignKeySaldosCuentasPorPagar()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyZona();
			this.addItemDefectoCombosForeignKeyGrupoCliente();
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeySucursal();
			this.addItemDefectoCombosForeignKeyCliente();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyZona()throws Exception {
		try {
			if(this.saldoscuentasporpagarSessionBean==null) {
				this.saldoscuentasporpagarSessionBean=new SaldosCuentasPorPagarSessionBean();
			}

			if(!this.saldoscuentasporpagarSessionBean.getisBusquedaDesdeForeignKeySesionZona()) {
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

	public void addItemDefectoCombosForeignKeyGrupoCliente()throws Exception {
		try {

			if(!this.saldoscuentasporpagarSessionBean.getisBusquedaDesdeForeignKeySesionGrupoCliente()) {
				GrupoCliente grupocliente=new GrupoCliente();
				GrupoClienteConstantesFunciones.setGrupoClienteDescripcion(grupocliente,Constantes.SMENSAJE_ESCOJA_OPCION);
				grupocliente.setId(null);

				if(!GrupoClienteConstantesFunciones.ExisteEnLista(this.grupoclientesForeignKey,grupocliente,true)) {

					this.grupoclientesForeignKey.add(0,grupocliente);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {

			if(!this.saldoscuentasporpagarSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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

			if(!this.saldoscuentasporpagarSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
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

			if(!this.saldoscuentasporpagarSessionBean.getisBusquedaDesdeForeignKeySesionCliente()) {
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
	
	public void initActionsCombosTodosForeignKeySaldosCuentasPorPagar()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeySaldosCuentasPorPagar(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeySaldosCuentasPorPagar()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeySaldosCuentasPorPagar();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeySaldosCuentasPorPagar(SaldosCuentasPorPagar saldoscuentasporpagar)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeySaldosCuentasPorPagar(SaldosCuentasPorPagar saldoscuentasporpagar,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeySaldosCuentasPorPagar()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeySaldosCuentasPorPagar()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeySaldosCuentasPorPagar()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeySaldosCuentasPorPagar()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroSaldosCuentasPorPagar()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeySaldosCuentasPorPagar()throws Exception {
		try {
			

			this.cargarCombosFrameZonasForeignKey("Todos");
			this.cargarCombosFrameGrupoClientesForeignKey("Todos");
			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameSucursalsForeignKey("Todos");
			this.cargarCombosFrameClientesForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeySaldosCuentasPorPagar(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameZonasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameGrupoClientesForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameSucursalsForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameClientesForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeySaldosCuentasPorPagar()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormSaldosCuentasPorPagar.jComboBoxid_zonaSaldosCuentasPorPagar!=null && this.jInternalFrameDetalleFormSaldosCuentasPorPagar.jComboBoxid_zonaSaldosCuentasPorPagar.getItemCount()>0) {
				this.jInternalFrameDetalleFormSaldosCuentasPorPagar.jComboBoxid_zonaSaldosCuentasPorPagar.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormSaldosCuentasPorPagar.jComboBoxid_grupo_clienteSaldosCuentasPorPagar!=null && this.jInternalFrameDetalleFormSaldosCuentasPorPagar.jComboBoxid_grupo_clienteSaldosCuentasPorPagar.getItemCount()>0) {
				this.jInternalFrameDetalleFormSaldosCuentasPorPagar.jComboBoxid_grupo_clienteSaldosCuentasPorPagar.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormSaldosCuentasPorPagar.jComboBoxid_empresaSaldosCuentasPorPagar!=null && this.jInternalFrameDetalleFormSaldosCuentasPorPagar.jComboBoxid_empresaSaldosCuentasPorPagar.getItemCount()>0) {
				this.jInternalFrameDetalleFormSaldosCuentasPorPagar.jComboBoxid_empresaSaldosCuentasPorPagar.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormSaldosCuentasPorPagar.jComboBoxid_sucursalSaldosCuentasPorPagar!=null && this.jInternalFrameDetalleFormSaldosCuentasPorPagar.jComboBoxid_sucursalSaldosCuentasPorPagar.getItemCount()>0) {
				this.jInternalFrameDetalleFormSaldosCuentasPorPagar.jComboBoxid_sucursalSaldosCuentasPorPagar.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormSaldosCuentasPorPagar.jComboBoxid_clienteSaldosCuentasPorPagar!=null && this.jInternalFrameDetalleFormSaldosCuentasPorPagar.jComboBoxid_clienteSaldosCuentasPorPagar.getItemCount()>0) {
				this.jInternalFrameDetalleFormSaldosCuentasPorPagar.jComboBoxid_clienteSaldosCuentasPorPagar.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	










	
	

	public SaldosCuentasPorPagarBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public SaldosCuentasPorPagarBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public SaldosCuentasPorPagarBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.saldoscuentasporpagarSessionBean=new SaldosCuentasPorPagarSessionBean(); 
		this.saldoscuentasporpagarConstantesFunciones=new SaldosCuentasPorPagarConstantesFunciones(); 
		this.saldoscuentasporpagarBean=new SaldosCuentasPorPagar();//(this.saldoscuentasporpagarConstantesFunciones); 		
		this.saldoscuentasporpagarReturnGeneral=new SaldosCuentasPorPagarParameterReturnGeneral(); 
		
		this.saldoscuentasporpagarSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.saldoscuentasporpagarSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public SaldosCuentasPorPagarBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public SaldosCuentasPorPagarBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public SaldosCuentasPorPagarBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessSaldosCuentasPorPagar(true);
			
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
			
			this.saldoscuentasporpagarConstantesFunciones=new SaldosCuentasPorPagarConstantesFunciones(); 
			this.saldoscuentasporpagarBean=new SaldosCuentasPorPagar();//this.saldoscuentasporpagarConstantesFunciones); 			
			this.saldoscuentasporpagarReturnGeneral=new SaldosCuentasPorPagarParameterReturnGeneral(); 
		
			SaldosCuentasPorPagarBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Saldos Cuentas Por Pagar Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			this.conTotales=true;
			
			
			this.saldoscuentasporpagar=new SaldosCuentasPorPagar();
			this.saldoscuentasporpagars = new ArrayList<SaldosCuentasPorPagar>();
			this.saldoscuentasporpagarsAux = new ArrayList<SaldosCuentasPorPagar>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldoscuentasporpagarLogic=new SaldosCuentasPorPagarLogic();
				this.saldoscuentasporpagarLogic.getNewConnexionToDeep("");
			}
			
			//this.saldoscuentasporpagarSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.saldoscuentasporpagarSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormSaldosCuentasPorPagar);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoSaldosCuentasPorPagar!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoSaldosCuentasPorPagar);	
					}
					
					if(this.jInternalFrameImportacionSaldosCuentasPorPagar!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionSaldosCuentasPorPagar);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderBySaldosCuentasPorPagar!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderBySaldosCuentasPorPagar);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormSaldosCuentasPorPagar!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormSaldosCuentasPorPagar);
				this.jInternalFrameDetalleFormSaldosCuentasPorPagar.setVisible(false);
				this.jInternalFrameDetalleFormSaldosCuentasPorPagar.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoSaldosCuentasPorPagar!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoSaldosCuentasPorPagar);
					this.jInternalFrameReporteDinamicoSaldosCuentasPorPagar.setVisible(false);
					this.jInternalFrameReporteDinamicoSaldosCuentasPorPagar.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionSaldosCuentasPorPagar!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionSaldosCuentasPorPagar);
					this.jInternalFrameImportacionSaldosCuentasPorPagar.setVisible(false);
					this.jInternalFrameImportacionSaldosCuentasPorPagar.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderBySaldosCuentasPorPagar!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderBySaldosCuentasPorPagar);
					this.jInternalFrameOrderBySaldosCuentasPorPagar.setVisible(false);
					this.jInternalFrameOrderBySaldosCuentasPorPagar.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idSaldosCuentasPorPagarActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=SaldosCuentasPorPagarConstantesFunciones.INUMEROPAGINACION;
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
			
			this.saldoscuentasporpagarReturnGeneral=new SaldosCuentasPorPagarParameterReturnGeneral();
			
			this.saldoscuentasporpagarParameterGeneral=new SaldosCuentasPorPagarParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.saldoscuentasporpagarLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.saldoscuentasporpagarSessionBean.getEsGuardarRelacionado()) {
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
			
			if(SaldosCuentasPorPagarJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.saldoscuentasporpagarSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,SaldosCuentasPorPagarConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.saldoscuentasporpagarSessionBean.getEsGuardarRelacionado(),this.saldoscuentasporpagarSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,SaldosCuentasPorPagarConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.saldoscuentasporpagarSessionBean.getEsGuardarRelacionado(),this.saldoscuentasporpagarSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoSaldosCuentasPorPagar=false;
			this.isVisibilidadCeldaDuplicarSaldosCuentasPorPagar=true;
			this.isVisibilidadCeldaCopiarSaldosCuentasPorPagar=true;
			this.isVisibilidadCeldaVerFormSaldosCuentasPorPagar=true;
			this.isVisibilidadCeldaOrdenSaldosCuentasPorPagar=true;
			this.isVisibilidadCeldaNuevoRelacionesSaldosCuentasPorPagar=false;
			this.isVisibilidadCeldaModificarSaldosCuentasPorPagar=false;
			this.isVisibilidadCeldaActualizarSaldosCuentasPorPagar=false;
			this.isVisibilidadCeldaEliminarSaldosCuentasPorPagar=false;
			this.isVisibilidadCeldaCancelarSaldosCuentasPorPagar=false;
			this.isVisibilidadCeldaGuardarSaldosCuentasPorPagar=false;
			this.isVisibilidadCeldaGuardarCambiosSaldosCuentasPorPagar=false;
			
			
			this.isVisibilidadBusquedaSaldosCuentasPorPagar=true;
			this.isVisibilidadFK_IdCliente=true;
			this.isVisibilidadFK_IdEmpresa=true;
			this.isVisibilidadFK_IdGrupoCliente=true;
			this.isVisibilidadFK_IdSucursal=true;
			this.isVisibilidadFK_IdZona=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesSaldosCuentasPorPagar("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosSaldosCuentasPorPagar();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioSaldosCuentasPorPagar(false);
			
			this.setPermisosUsuarioSaldosCuentasPorPagar();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.saldoscuentasporpagarSessionBean.getEsGuardarRelacionado() 
				|| (this.saldoscuentasporpagarSessionBean.getEsGuardarRelacionado() && this.saldoscuentasporpagarSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioSaldosCuentasPorPagarClasesRelacionadas();
			}
			
			if(this.saldoscuentasporpagarSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioSaldosCuentasPorPagarClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!SaldosCuentasPorPagarJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosSaldosCuentasPorPagar();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualSaldosCuentasPorPagar();
			}
			
			if(!this.isPermisoBusquedaSaldosCuentasPorPagar) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasSaldosCuentasPorPagar.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.saldoscuentasporpagarSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(true);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(true);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(true,true,true);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(SaldosCuentasPorPagarConstantesFunciones.getTiposSeleccionarSaldosCuentasPorPagar());
				
				this.tiposColumnasSelect=SaldosCuentasPorPagarConstantesFunciones.getTiposSeleccionarSaldosCuentasPorPagar(true);
				
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
			//if(!this.saldoscuentasporpagarSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioSaldosCuentasPorPagar();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(true,false,false);
				this.setAccionesUsuarioSaldosCuentasPorPagar(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(true,false,false);							
				this.setAccionesUsuarioSaldosCuentasPorPagar(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesSaldosCuentasPorPagar() ;
			
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
			
			this.zonaLogic=new ZonaLogic();
			this.grupoclienteLogic=new GrupoClienteLogic();
			this.empresaLogic=new EmpresaLogic();
			this.sucursalLogic=new SucursalLogic();
			this.clienteLogic=new ClienteLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				saldoscuentasporpagarImplementable= (SaldosCuentasPorPagarImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+SaldosCuentasPorPagarConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				saldoscuentasporpagarImplementableHome= (SaldosCuentasPorPagarImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+SaldosCuentasPorPagarConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.saldoscuentasporpagars= new ArrayList<SaldosCuentasPorPagar>();
			this.saldoscuentasporpagarsEliminados= new ArrayList<SaldosCuentasPorPagar>();
						
			this.isEsNuevoSaldosCuentasPorPagar=false;
			this.esParaAccionDesdeFormularioSaldosCuentasPorPagar=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.zonasForeignKey=new ArrayList<Zona>() ;
			this.grupoclientesForeignKey=new ArrayList<GrupoCliente>() ;
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			this.sucursalsForeignKey=new ArrayList<Sucursal>() ;
			this.clientesForeignKey=new ArrayList<Cliente>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeySaldosCuentasPorPagar(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroSaldosCuentasPorPagar();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.saldoscuentasporpagarSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			SaldosCuentasPorPagarBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=SaldosCuentasPorPagarConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesSaldosCuentasPorPagar("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingSaldosCuentasPorPagar(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormSaldosCuentasPorPagar!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioSaldosCuentasPorPagar();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioSaldosCuentasPorPagar();
			}
			
			SaldosCuentasPorPagarBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasSaldosCuentasPorPagar.getTabCount(); i++) {
					this.jTabbedPaneBusquedasSaldosCuentasPorPagar.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasSaldosCuentasPorPagar.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldoscuentasporpagarLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessSaldosCuentasPorPagar(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga SaldosCuentasPorPagar: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldoscuentasporpagarLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,SaldosCuentasPorPagarConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldoscuentasporpagarLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectSaldosCuentasPorPagar() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesSaldosCuentasPorPagar")) {
				iIndex=this.jInternalFrameDetalleFormSaldosCuentasPorPagar.jTabbedPaneRelacionesSaldosCuentasPorPagar.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormSaldosCuentasPorPagar.jTabbedPaneRelacionesSaldosCuentasPorPagar.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosSaldosCuentasPorPagar.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessSaldosCuentasPorPagar();	
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
	
	public void cargarCombosForeignKeySaldosCuentasPorPagar(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeySaldosCuentasPorPagar(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeySaldosCuentasPorPagar(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeySaldosCuentasPorPagarListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeySaldosCuentasPorPagar();
		
		this.cargarCombosFrameForeignKeySaldosCuentasPorPagar();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeySaldosCuentasPorPagar();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeySaldosCuentasPorPagar();
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

	public void cargarCombosForeignKeyGrupoCliente(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyGrupoClienteListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyGrupoCliente();
				this.cargarCombosFrameGrupoClientesForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaGrupoCliente(this.grupoclientesForeignKey);

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
	
	public void jButtonNuevoSaldosCuentasPorPagarActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.saldoscuentasporpagarSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormSaldosCuentasPorPagar==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			SaldosCuentasPorPagarBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.saldoscuentasporpagar,new Object(),this.saldoscuentasporpagarParameterGeneral,this.saldoscuentasporpagarReturnGeneral);
			
			
			if(jTableDatosSaldosCuentasPorPagar.getRowCount()>=1) {
				jTableDatosSaldosCuentasPorPagar.removeRowSelectionInterval(0, jTableDatosSaldosCuentasPorPagar.getRowCount()-1);						
			}
			
			this.isEsNuevoSaldosCuentasPorPagar=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoSaldosCuentasPorPagar(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesSaldosCuentasPorPagar(true);			
			//this.saldoscuentasporpagar=new SaldosCuentasPorPagar();
			//this.saldoscuentasporpagar.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesSaldosCuentasPorPagar(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualSaldosCuentasPorPagar() ;
			
			if(SaldosCuentasPorPagarJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleSaldosCuentasPorPagar(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.saldoscuentasporpagar);	
			this.actualizarInformacion("INFO_PADRE",false,this.saldoscuentasporpagar);				
			
			SaldosCuentasPorPagarBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.saldoscuentasporpagar,new Object(),this.saldoscuentasporpagarParameterGeneral,this.saldoscuentasporpagarReturnGeneral);
			
			if(this.saldoscuentasporpagarSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar SaldosCuentasPorPagar: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			SaldosCuentasPorPagarBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.saldoscuentasporpagar,new Object(),this.saldoscuentasporpagarParameterGeneral,this.saldoscuentasporpagarReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,SaldosCuentasPorPagarConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarSaldosCuentasPorPagarActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<SaldosCuentasPorPagar> saldoscuentasporpagarsSeleccionados=new ArrayList<SaldosCuentasPorPagar>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosSaldosCuentasPorPagar.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosSaldosCuentasPorPagar.getSelectedRows().length;			
			}
			
			saldoscuentasporpagarsSeleccionados=this.getSaldosCuentasPorPagarsSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoSaldosCuentasPorPagar--;			
				//SaldosCuentasPorPagar saldoscuentasporpagarAux= new SaldosCuentasPorPagar();			
				//saldoscuentasporpagarAux.setId(this.iIdNuevoSaldosCuentasPorPagar);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//SaldosCuentasPorPagar saldoscuentasporpagarOrigen=new SaldosCuentasPorPagar();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(SaldosCuentasPorPagar saldoscuentasporpagarOrigen : saldoscuentasporpagarsSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosSaldosCuentasPorPagar.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							saldoscuentasporpagarOrigen =(SaldosCuentasPorPagar) this.saldoscuentasporpagarLogic.getSaldosCuentasPorPagars().toArray()[this.jTableDatosSaldosCuentasPorPagar.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							saldoscuentasporpagarOrigen =(SaldosCuentasPorPagar) this.saldoscuentasporpagars.toArray()[this.jTableDatosSaldosCuentasPorPagar.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaSaldosCuentasPorPagar();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.saldoscuentasporpagar.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosSaldosCuentasPorPagar(saldoscuentasporpagarOrigen,this.saldoscuentasporpagar,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysSaldosCuentasPorPagar(this.saldoscuentasporpagar);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.saldoscuentasporpagarLogic.getSaldosCuentasPorPagars().add(this.saldoscuentasporpagarAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.saldoscuentasporpagars.add(this.saldoscuentasporpagarAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaSaldosCuentasPorPagar(false);
				
				this.jTableDatosSaldosCuentasPorPagar.setRowSelectionInterval(this.getIndiceNuevoSaldosCuentasPorPagar(), this.getIndiceNuevoSaldosCuentasPorPagar());
				
				int iLastRow =  this.jTableDatosSaldosCuentasPorPagar.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosSaldosCuentasPorPagar.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosSaldosCuentasPorPagar.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaSaldosCuentasPorPagar(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,SaldosCuentasPorPagarConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarSaldosCuentasPorPagarActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<SaldosCuentasPorPagar> saldoscuentasporpagarsSeleccionados=new ArrayList<SaldosCuentasPorPagar>();									
		
			SaldosCuentasPorPagar saldoscuentasporpagarOrigen=new SaldosCuentasPorPagar();
			SaldosCuentasPorPagar saldoscuentasporpagarDestino=new SaldosCuentasPorPagar();
				
			saldoscuentasporpagarsSeleccionados=this.getSaldosCuentasPorPagarsSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosSaldosCuentasPorPagar.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || saldoscuentasporpagarsSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosSaldosCuentasPorPagar.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						saldoscuentasporpagarOrigen =(SaldosCuentasPorPagar) this.saldoscuentasporpagarLogic.getSaldosCuentasPorPagars().toArray()[this.jTableDatosSaldosCuentasPorPagar.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						saldoscuentasporpagarOrigen =(SaldosCuentasPorPagar) this.saldoscuentasporpagars.toArray()[this.jTableDatosSaldosCuentasPorPagar.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						saldoscuentasporpagarDestino =(SaldosCuentasPorPagar) this.saldoscuentasporpagarLogic.getSaldosCuentasPorPagars().toArray()[this.jTableDatosSaldosCuentasPorPagar.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						saldoscuentasporpagarDestino =(SaldosCuentasPorPagar) this.saldoscuentasporpagars.toArray()[this.jTableDatosSaldosCuentasPorPagar.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				saldoscuentasporpagarOrigen =saldoscuentasporpagarsSeleccionados.get(0);
				saldoscuentasporpagarDestino =saldoscuentasporpagarsSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosSaldosCuentasPorPagar(saldoscuentasporpagarOrigen,saldoscuentasporpagarDestino,true,false);
				
				saldoscuentasporpagarDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(saldoscuentasporpagarDestino,saldoscuentasporpagarLogic.getSaldosCuentasPorPagars());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(saldoscuentasporpagarDestino,saldoscuentasporpagars);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaSaldosCuentasPorPagar(false);
				
				//this.jTableDatosSaldosCuentasPorPagar.setRowSelectionInterval(this.getIndiceNuevoSaldosCuentasPorPagar(), this.getIndiceNuevoSaldosCuentasPorPagar());
				
				int iLastRow =  this.jTableDatosSaldosCuentasPorPagar.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosSaldosCuentasPorPagar.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosSaldosCuentasPorPagar.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaSaldosCuentasPorPagar(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SaldosCuentasPorPagarConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormSaldosCuentasPorPagarActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormSaldosCuentasPorPagar==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormSaldosCuentasPorPagar.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SaldosCuentasPorPagarConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarSaldosCuentasPorPagarActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesSaldosCuentasPorPagar.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasSaldosCuentasPorPagar.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesSaldosCuentasPorPagar.setVisible(!isVisible);
			this.jPanelPaginacionSaldosCuentasPorPagar.setVisible(!isVisible);
			this.jPanelAccionesSaldosCuentasPorPagar.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SaldosCuentasPorPagarConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarSaldosCuentasPorPagarActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameSaldosCuentasPorPagar();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SaldosCuentasPorPagarConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoSaldosCuentasPorPagarActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoSaldosCuentasPorPagar();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SaldosCuentasPorPagarConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionSaldosCuentasPorPagarActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionSaldosCuentasPorPagar();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SaldosCuentasPorPagarConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderBySaldosCuentasPorPagarActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderBySaldosCuentasPorPagar();
			
			this.abrirFrameOrderBySaldosCuentasPorPagar();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SaldosCuentasPorPagarConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderBySaldosCuentasPorPagarActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderBySaldosCuentasPorPagar();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SaldosCuentasPorPagarConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleSaldosCuentasPorPagar(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormSaldosCuentasPorPagar);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormSaldosCuentasPorPagar.isMaximum()) {
					this.jInternalFrameDetalleFormSaldosCuentasPorPagar.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormSaldosCuentasPorPagar.setSize(this.jInternalFrameDetalleFormSaldosCuentasPorPagar.iWidthFormulario,this.jInternalFrameDetalleFormSaldosCuentasPorPagar.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormSaldosCuentasPorPagar.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormSaldosCuentasPorPagar.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormSaldosCuentasPorPagar.isMaximum()) {
						this.jInternalFrameDetalleFormSaldosCuentasPorPagar.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormSaldosCuentasPorPagar.jContentPaneDetalleSaldosCuentasPorPagar.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormSaldosCuentasPorPagar.jTabbedPaneRelacionesSaldosCuentasPorPagar.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormSaldosCuentasPorPagar.jContentPaneDetalleSaldosCuentasPorPagar.getWidth(),SaldosCuentasPorPagarConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormSaldosCuentasPorPagar.jTabbedPaneRelacionesSaldosCuentasPorPagar.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormSaldosCuentasPorPagar.jContentPaneDetalleSaldosCuentasPorPagar.getWidth(),SaldosCuentasPorPagarConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormSaldosCuentasPorPagar.jTabbedPaneRelacionesSaldosCuentasPorPagar.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormSaldosCuentasPorPagar.jContentPaneDetalleSaldosCuentasPorPagar.getWidth(),SaldosCuentasPorPagarConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormSaldosCuentasPorPagar.setVisible(true);
	        this.jInternalFrameDetalleFormSaldosCuentasPorPagar.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,SaldosCuentasPorPagarConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderBySaldosCuentasPorPagar() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderBySaldosCuentasPorPagar==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderBySaldosCuentasPorPagar=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderBySaldosCuentasPorPagar,false,this);
				} else {
					this.jInternalFrameOrderBySaldosCuentasPorPagar=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderBySaldosCuentasPorPagar,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderBySaldosCuentasPorPagar);
				this.jInternalFrameOrderBySaldosCuentasPorPagar.setVisible(false);
				this.jInternalFrameOrderBySaldosCuentasPorPagar.setSelected(false);
				
				this.jInternalFrameOrderBySaldosCuentasPorPagar.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderBySaldosCuentasPorPagar"));
				
				this.inicializarActualizarBindingTablaOrderBySaldosCuentasPorPagar();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionSaldosCuentasPorPagar() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionSaldosCuentasPorPagar==null) {
				
				this.jInternalFrameImportacionSaldosCuentasPorPagar=new ImportacionJInternalFrame(SaldosCuentasPorPagarConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionSaldosCuentasPorPagar);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionSaldosCuentasPorPagar);
				this.jInternalFrameImportacionSaldosCuentasPorPagar.setVisible(false);
				this.jInternalFrameImportacionSaldosCuentasPorPagar.setSelected(false);


				this.jInternalFrameImportacionSaldosCuentasPorPagar.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionSaldosCuentasPorPagar"));
				this.jInternalFrameImportacionSaldosCuentasPorPagar.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionSaldosCuentasPorPagar"));
				this.jInternalFrameImportacionSaldosCuentasPorPagar.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionSaldosCuentasPorPagar"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoSaldosCuentasPorPagar() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoSaldosCuentasPorPagar==null) {
				this.jInternalFrameReporteDinamicoSaldosCuentasPorPagar=new ReporteDinamicoJInternalFrame(SaldosCuentasPorPagarConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoSaldosCuentasPorPagar);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoSaldosCuentasPorPagar);
				this.jInternalFrameReporteDinamicoSaldosCuentasPorPagar.setVisible(false);
				this.jInternalFrameReporteDinamicoSaldosCuentasPorPagar.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoSaldosCuentasPorPagar.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoSaldosCuentasPorPagar"));
				this.jInternalFrameReporteDinamicoSaldosCuentasPorPagar.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoSaldosCuentasPorPagar"));
				this.jInternalFrameReporteDinamicoSaldosCuentasPorPagar.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoSaldosCuentasPorPagar"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualSaldosCuentasPorPagar();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleSaldosCuentasPorPagar() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormSaldosCuentasPorPagar);
			
	       	this.jInternalFrameDetalleFormSaldosCuentasPorPagar.setVisible(false);
	        this.jInternalFrameDetalleFormSaldosCuentasPorPagar.setSelected(false);
			
			//this.jInternalFrameDetalleFormSaldosCuentasPorPagar.dispose();
			//this.jInternalFrameDetalleFormSaldosCuentasPorPagar=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,SaldosCuentasPorPagarConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoSaldosCuentasPorPagar() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoSaldosCuentasPorPagar.setVisible(true);
	        this.jInternalFrameReporteDinamicoSaldosCuentasPorPagar.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,SaldosCuentasPorPagarConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionSaldosCuentasPorPagar() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionSaldosCuentasPorPagar.setVisible(true);
	        this.jInternalFrameImportacionSaldosCuentasPorPagar.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,SaldosCuentasPorPagarConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderBySaldosCuentasPorPagar() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderBySaldosCuentasPorPagar.setVisible(true);
	        this.jInternalFrameOrderBySaldosCuentasPorPagar.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,SaldosCuentasPorPagarConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderBySaldosCuentasPorPagar() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderBySaldosCuentasPorPagar.setVisible(false);
	        this.jInternalFrameOrderBySaldosCuentasPorPagar.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,SaldosCuentasPorPagarConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoSaldosCuentasPorPagar() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoSaldosCuentasPorPagar.setVisible(false);
	        this.jInternalFrameReporteDinamicoSaldosCuentasPorPagar.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,SaldosCuentasPorPagarConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionSaldosCuentasPorPagar() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionSaldosCuentasPorPagar.setVisible(false);
	        this.jInternalFrameImportacionSaldosCuentasPorPagar.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,SaldosCuentasPorPagarConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarSaldosCuentasPorPagarActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarSaldosCuentasPorPagar(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SaldosCuentasPorPagarConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarSaldosCuentasPorPagar(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosSaldosCuentasPorPagar.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesSaldosCuentasPorPagar(true);
			//this.isEsNuevoSaldosCuentasPorPagar=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldoscuentasporpagar =(SaldosCuentasPorPagar) this.saldoscuentasporpagarLogic.getSaldosCuentasPorPagars().toArray()[this.jTableDatosSaldosCuentasPorPagar.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.saldoscuentasporpagar =(SaldosCuentasPorPagar) this.saldoscuentasporpagars.toArray()[this.jTableDatosSaldosCuentasPorPagar.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesSaldosCuentasPorPagar("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesSaldosCuentasPorPagar(false) ;
			
			if(saldoscuentasporpagarSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(SaldosCuentasPorPagarJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleSaldosCuentasPorPagar(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualSaldosCuentasPorPagar(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SaldosCuentasPorPagarConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaSaldosCuentasPorPagarActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosSaldosCuentasPorPagar.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.saldoscuentasporpagar =(SaldosCuentasPorPagar) this.saldoscuentasporpagarLogic.getSaldosCuentasPorPagars().toArray()[this.jTableDatosSaldosCuentasPorPagar.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.saldoscuentasporpagar =(SaldosCuentasPorPagar) this.saldoscuentasporpagars.toArray()[this.jTableDatosSaldosCuentasPorPagar.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SaldosCuentasPorPagarConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarSaldosCuentasPorPagar(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormSaldosCuentasPorPagar==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosSaldosCuentasPorPagar.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesSaldosCuentasPorPagar(true);
			//this.isEsNuevoSaldosCuentasPorPagar=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldoscuentasporpagar =(SaldosCuentasPorPagar) this.saldoscuentasporpagarLogic.getSaldosCuentasPorPagars().toArray()[this.jTableDatosSaldosCuentasPorPagar.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.saldoscuentasporpagar =(SaldosCuentasPorPagar) this.saldoscuentasporpagars.toArray()[this.jTableDatosSaldosCuentasPorPagar.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.saldoscuentasporpagar.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesSaldosCuentasPorPagar("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesSaldosCuentasPorPagar(false) ;
			
			if(SaldosCuentasPorPagarJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleSaldosCuentasPorPagar(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualSaldosCuentasPorPagar(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SaldosCuentasPorPagarConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	public void recargarComboTablaZona(List<Zona> zonasForeignKey)throws Exception{
		TableColumn tableColumnZona=this.jTableDatosSaldosCuentasPorPagar.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSaldosCuentasPorPagar,SaldosCuentasPorPagarConstantesFunciones.LABEL_IDZONA));
		TableCellEditor tableCellEditorZona =tableColumnZona.getCellEditor();

		ZonaTableCell zonaTableCellFk=(ZonaTableCell)tableCellEditorZona;

		if(zonaTableCellFk!=null) {
			zonaTableCellFk.setzonasForeignKey(zonasForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosSaldosCuentasPorPagar.getSelectedRow();

		//if(intSelectedRow<=0) {
			//zonaTableCellFk.setRowActual(intSelectedRow);
			//zonaTableCellFk.setzonasForeignKeyActual(zonasForeignKey);
		//}


		if(zonaTableCellFk!=null) {
			zonaTableCellFk.RecargarZonasForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaGrupoCliente(List<GrupoCliente> grupoclientesForeignKey)throws Exception{
		TableColumn tableColumnGrupoCliente=this.jTableDatosSaldosCuentasPorPagar.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSaldosCuentasPorPagar,SaldosCuentasPorPagarConstantesFunciones.LABEL_IDGRUPOCLIENTE));
		TableCellEditor tableCellEditorGrupoCliente =tableColumnGrupoCliente.getCellEditor();

		GrupoClienteTableCell grupoclienteTableCellFk=(GrupoClienteTableCell)tableCellEditorGrupoCliente;

		if(grupoclienteTableCellFk!=null) {
			grupoclienteTableCellFk.setgrupoclientesForeignKey(grupoclientesForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosSaldosCuentasPorPagar.getSelectedRow();

		//if(intSelectedRow<=0) {
			//grupoclienteTableCellFk.setRowActual(intSelectedRow);
			//grupoclienteTableCellFk.setgrupoclientesForeignKeyActual(grupoclientesForeignKey);
		//}


		if(grupoclienteTableCellFk!=null) {
			grupoclienteTableCellFk.RecargarGrupoClientesForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
			
	
	public void recargarComboTablaCliente(List<Cliente> clientesForeignKey)throws Exception{
		TableColumn tableColumnCliente=this.jTableDatosSaldosCuentasPorPagar.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSaldosCuentasPorPagar,SaldosCuentasPorPagarConstantesFunciones.LABEL_IDCLIENTE));
		TableCellEditor tableCellEditorCliente =tableColumnCliente.getCellEditor();

		ClienteTableCell clienteTableCellFk=(ClienteTableCell)tableCellEditorCliente;

		if(clienteTableCellFk!=null) {
			clienteTableCellFk.setclientesForeignKey(clientesForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosSaldosCuentasPorPagar.getSelectedRow();

		//if(intSelectedRow<=0) {
			//clienteTableCellFk.setRowActual(intSelectedRow);
			//clienteTableCellFk.setclientesForeignKeyActual(clientesForeignKey);
		//}


		if(clienteTableCellFk!=null) {
			clienteTableCellFk.RecargarClientesForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	
	public void jButtonActualizarSaldosCuentasPorPagarActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldoscuentasporpagarLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesSaldosCuentasPorPagar(false);
			
			//if(!this.isEsNuevoSaldosCuentasPorPagar) {								
				int intSelectedRow = this.jTableDatosSaldosCuentasPorPagar.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.saldoscuentasporpagar =(SaldosCuentasPorPagar) this.saldoscuentasporpagarLogic.getSaldosCuentasPorPagars().toArray()[this.jTableDatosSaldosCuentasPorPagar.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.saldoscuentasporpagar =(SaldosCuentasPorPagar) this.saldoscuentasporpagars.toArray()[this.jTableDatosSaldosCuentasPorPagar.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(SaldosCuentasPorPagarJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualSaldosCuentasPorPagar(this.saldoscuentasporpagar,true);
				this.setVariablesFormularioToObjetoActualForeignKeysSaldosCuentasPorPagar(this.saldoscuentasporpagar);
				
			}
			
			if(this.permiteMantenimiento(this.saldoscuentasporpagar)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.saldoscuentasporpagarSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoSaldosCuentasPorPagar=true;
					this.inicializarActualizarBindingTablaSaldosCuentasPorPagar(false);
					this.isEsNuevoSaldosCuentasPorPagar=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoSaldosCuentasPorPagar=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoSaldosCuentasPorPagar=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesSaldosCuentasPorPagar(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualSaldosCuentasPorPagar(false);
				
				this.habilitarDeshabilitarControlesSaldosCuentasPorPagar(false);
			
												
				
				if(SaldosCuentasPorPagarJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleSaldosCuentasPorPagar();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoSaldosCuentasPorPagarActionPerformed(evt,saldoscuentasporpagarSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualSaldosCuentasPorPagar(this.saldoscuentasporpagar,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosSaldosCuentasPorPagar.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,saldoscuentasporpagarSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldoscuentasporpagarLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.saldoscuentasporpagar.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(SaldosCuentasPorPagar.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",SaldosCuentasPorPagar.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldoscuentasporpagarLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,SaldosCuentasPorPagarConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldoscuentasporpagarLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarSaldosCuentasPorPagarActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldoscuentasporpagarLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosSaldosCuentasPorPagar.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldoscuentasporpagar =(SaldosCuentasPorPagar) this.saldoscuentasporpagarLogic.getSaldosCuentasPorPagars().toArray()[this.jTableDatosSaldosCuentasPorPagar.convertRowIndexToModel(intSelectedRow)];
				this.saldoscuentasporpagar.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.saldoscuentasporpagar =(SaldosCuentasPorPagar) this.saldoscuentasporpagars.toArray()[this.jTableDatosSaldosCuentasPorPagar.convertRowIndexToModel(intSelectedRow)];
				this.saldoscuentasporpagar.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.saldoscuentasporpagar)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.saldoscuentasporpagarSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((SaldosCuentasPorPagarModel) this.jTableDatosSaldosCuentasPorPagar.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoSaldosCuentasPorPagar=true;
				this.inicializarActualizarBindingTablaSaldosCuentasPorPagar(false);
				this.isEsNuevoSaldosCuentasPorPagar=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesSaldosCuentasPorPagar(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualSaldosCuentasPorPagar(false);
				
				this.habilitarDeshabilitarControlesSaldosCuentasPorPagar(false);
				
				
				
				if(SaldosCuentasPorPagarJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleSaldosCuentasPorPagar();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldoscuentasporpagarLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldoscuentasporpagarLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,SaldosCuentasPorPagarConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldoscuentasporpagarLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarSaldosCuentasPorPagarActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosSaldosCuentasPorPagar.getRowCount()>=1) {
				jTableDatosSaldosCuentasPorPagar.removeRowSelectionInterval(0, jTableDatosSaldosCuentasPorPagar.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesSaldosCuentasPorPagar(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaSaldosCuentasPorPagar(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesSaldosCuentasPorPagar(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualSaldosCuentasPorPagar(false) ;
			
			this.isEsNuevoSaldosCuentasPorPagar=false;
			
			if(SaldosCuentasPorPagarJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleSaldosCuentasPorPagar();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SaldosCuentasPorPagarConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosSaldosCuentasPorPagarActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldoscuentasporpagarLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingSaldosCuentasPorPagar(false);
				
				//SI ES MANUAL
				if(SaldosCuentasPorPagarJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualSaldosCuentasPorPagar();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldoscuentasporpagarLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldoscuentasporpagarLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,SaldosCuentasPorPagarConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldoscuentasporpagarLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosSaldosCuentasPorPagarActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoSaldosCuentasPorPagar--;			
			//SaldosCuentasPorPagar saldoscuentasporpagarAux= new SaldosCuentasPorPagar();			
			//saldoscuentasporpagarAux.setId(this.iIdNuevoSaldosCuentasPorPagar);
			
			if(this.jInternalFrameDetalleFormSaldosCuentasPorPagar==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaSaldosCuentasPorPagar();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysSaldosCuentasPorPagar(this.saldoscuentasporpagar);
			
			this.saldoscuentasporpagar.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.saldoscuentasporpagarLogic.getSaldosCuentasPorPagars().add(this.saldoscuentasporpagarAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.saldoscuentasporpagars.add(this.saldoscuentasporpagarAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaSaldosCuentasPorPagar(false);
			
			this.jTableDatosSaldosCuentasPorPagar.setRowSelectionInterval(this.getIndiceNuevoSaldosCuentasPorPagar(), this.getIndiceNuevoSaldosCuentasPorPagar());
			
			int iLastRow =  this.jTableDatosSaldosCuentasPorPagar.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosSaldosCuentasPorPagar.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosSaldosCuentasPorPagar.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaSaldosCuentasPorPagar(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,SaldosCuentasPorPagarConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionSaldosCuentasPorPagarActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldoscuentasporpagarLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingSaldosCuentasPorPagar(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingSaldosCuentasPorPagar(false);
			
			//SI ES MANUAL
			if(SaldosCuentasPorPagarJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualSaldosCuentasPorPagar();
			}
			
			//this.abrirFrameTreeSaldosCuentasPorPagar();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldoscuentasporpagarLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldoscuentasporpagarLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,SaldosCuentasPorPagarConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldoscuentasporpagarLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionSaldosCuentasPorPagarActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SaldosCuentasPorPagarConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionSaldosCuentasPorPagarActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionSaldosCuentasPorPagar.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionSaldosCuentasPorPagar.setFileImportacion(this.jInternalFrameImportacionSaldosCuentasPorPagar.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionSaldosCuentasPorPagar.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionSaldosCuentasPorPagar.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionSaldosCuentasPorPagar.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionSaldosCuentasPorPagar.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SaldosCuentasPorPagarConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoSaldosCuentasPorPagarActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<SaldosCuentasPorPagar> saldoscuentasporpagarsSeleccionados=new ArrayList<SaldosCuentasPorPagar>();		

		saldoscuentasporpagarsSeleccionados=this.getSaldosCuentasPorPagarsSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoSaldosCuentasPorPagar.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoSaldosCuentasPorPagar.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("SaldosCuentasPorPagarBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"SaldosCuentasPorPagarBaseDesign.jrxml";
			
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
			
			this.generarReporteSaldosCuentasPorPagars("Todos",saldoscuentasporpagarsSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.saldoscuentasporpagarSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Saldos Cuentas Por Pagar",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SaldosCuentasPorPagarConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoSaldosCuentasPorPagar.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoSaldosCuentasPorPagar.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case SaldosCuentasPorPagarConstantesFunciones.LABEL_CODIGO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case SaldosCuentasPorPagarConstantesFunciones.LABEL_NOMBRECOMPLETO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreCompleto_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreCompleto_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreCompleto_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreCompleto_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case SaldosCuentasPorPagarConstantesFunciones.LABEL_DEBITOMONELOCAL:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_bitoMoneLocal_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_bitoMoneLocal_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_bitoMoneLocal_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_bitoMoneLocal_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case SaldosCuentasPorPagarConstantesFunciones.LABEL_CREDITOMONELOCAL:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_editoMoneLocal_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_editoMoneLocal_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_editoMoneLocal_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_editoMoneLocal_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case SaldosCuentasPorPagarConstantesFunciones.LABEL_SALDOANTERIOR:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_ldoAnterior_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_ldoAnterior_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_ldoAnterior_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_ldoAnterior_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case SaldosCuentasPorPagarConstantesFunciones.LABEL_SALDODEBITO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_ldoDebito_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_ldoDebito_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_ldoDebito_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_ldoDebito_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case SaldosCuentasPorPagarConstantesFunciones.LABEL_SALDOCREDITO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_ldoCredito_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_ldoCredito_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_ldoCredito_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_ldoCredito_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoSaldosCuentasPorPagar.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoSaldosCuentasPorPagar.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoSaldosCuentasPorPagar.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case SaldosCuentasPorPagarConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoria="codigo";
					break;

				case SaldosCuentasPorPagarConstantesFunciones.LABEL_NOMBRECOMPLETO:
					sNombreCampoCategoria="nombre_completo";
					break;

				case SaldosCuentasPorPagarConstantesFunciones.LABEL_DEBITOMONELOCAL:
					sNombreCampoCategoria="debito_mone_local";
					break;

				case SaldosCuentasPorPagarConstantesFunciones.LABEL_CREDITOMONELOCAL:
					sNombreCampoCategoria="credito_mone_local";
					break;

				case SaldosCuentasPorPagarConstantesFunciones.LABEL_SALDOANTERIOR:
					sNombreCampoCategoria="saldo_anterior";
					break;

				case SaldosCuentasPorPagarConstantesFunciones.LABEL_SALDODEBITO:
					sNombreCampoCategoria="saldo_debito";
					break;

				case SaldosCuentasPorPagarConstantesFunciones.LABEL_SALDOCREDITO:
					sNombreCampoCategoria="saldo_credito";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoSaldosCuentasPorPagar.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case SaldosCuentasPorPagarConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoriaValor="codigo";
					break;

				case SaldosCuentasPorPagarConstantesFunciones.LABEL_NOMBRECOMPLETO:
					sNombreCampoCategoriaValor="nombre_completo";
					break;

				case SaldosCuentasPorPagarConstantesFunciones.LABEL_DEBITOMONELOCAL:
					sNombreCampoCategoriaValor="debito_mone_local";
					break;

				case SaldosCuentasPorPagarConstantesFunciones.LABEL_CREDITOMONELOCAL:
					sNombreCampoCategoriaValor="credito_mone_local";
					break;

				case SaldosCuentasPorPagarConstantesFunciones.LABEL_SALDOANTERIOR:
					sNombreCampoCategoriaValor="saldo_anterior";
					break;

				case SaldosCuentasPorPagarConstantesFunciones.LABEL_SALDODEBITO:
					sNombreCampoCategoriaValor="saldo_debito";
					break;

				case SaldosCuentasPorPagarConstantesFunciones.LABEL_SALDOCREDITO:
					sNombreCampoCategoriaValor="saldo_credito";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoSaldosCuentasPorPagar.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoSaldosCuentasPorPagar.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case SaldosCuentasPorPagarConstantesFunciones.LABEL_CODIGO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo");
					break;

				case SaldosCuentasPorPagarConstantesFunciones.LABEL_NOMBRECOMPLETO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Completo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_completo");
					break;

				case SaldosCuentasPorPagarConstantesFunciones.LABEL_DEBITOMONELOCAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Debito Mone Local",sNombreCampoCategoria,sNombreCampoCategoriaValor,"debito_mone_local");
					break;

				case SaldosCuentasPorPagarConstantesFunciones.LABEL_CREDITOMONELOCAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Credito Mone Local",sNombreCampoCategoria,sNombreCampoCategoriaValor,"credito_mone_local");
					break;

				case SaldosCuentasPorPagarConstantesFunciones.LABEL_SALDOANTERIOR:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Saldo Anterior",sNombreCampoCategoria,sNombreCampoCategoriaValor,"saldo_anterior");
					break;

				case SaldosCuentasPorPagarConstantesFunciones.LABEL_SALDODEBITO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Saldo Debito",sNombreCampoCategoria,sNombreCampoCategoriaValor,"saldo_debito");
					break;

				case SaldosCuentasPorPagarConstantesFunciones.LABEL_SALDOCREDITO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Saldo Credito",sNombreCampoCategoria,sNombreCampoCategoriaValor,"saldo_credito");
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
	
	public void jButtonGenerarExcelReporteDinamicoSaldosCuentasPorPagarActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<SaldosCuentasPorPagar> saldoscuentasporpagarsSeleccionados=new ArrayList<SaldosCuentasPorPagar>();		
		
		saldoscuentasporpagarsSeleccionados=this.getSaldosCuentasPorPagarsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"saldoscuentasporpagar";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("SaldosCuentasPorPagars");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoSaldosCuentasPorPagar.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoSaldosCuentasPorPagar.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case SaldosCuentasPorPagarConstantesFunciones.LABEL_IDZONA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(SaldosCuentasPorPagarConstantesFunciones.LABEL_IDZONA);
					iRow++;

					for(SaldosCuentasPorPagar saldoscuentasporpagar:saldoscuentasporpagarsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(saldoscuentasporpagar.getzona_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case SaldosCuentasPorPagarConstantesFunciones.LABEL_IDGRUPOCLIENTE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(SaldosCuentasPorPagarConstantesFunciones.LABEL_IDGRUPOCLIENTE);
					iRow++;

					for(SaldosCuentasPorPagar saldoscuentasporpagar:saldoscuentasporpagarsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(saldoscuentasporpagar.getgrupocliente_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case SaldosCuentasPorPagarConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(SaldosCuentasPorPagarConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(SaldosCuentasPorPagar saldoscuentasporpagar:saldoscuentasporpagarsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(saldoscuentasporpagar.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case SaldosCuentasPorPagarConstantesFunciones.LABEL_IDSUCURSAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(SaldosCuentasPorPagarConstantesFunciones.LABEL_IDSUCURSAL);
					iRow++;

					for(SaldosCuentasPorPagar saldoscuentasporpagar:saldoscuentasporpagarsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(saldoscuentasporpagar.getsucursal_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case SaldosCuentasPorPagarConstantesFunciones.LABEL_IDCLIENTE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(SaldosCuentasPorPagarConstantesFunciones.LABEL_IDCLIENTE);
					iRow++;

					for(SaldosCuentasPorPagar saldoscuentasporpagar:saldoscuentasporpagarsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(saldoscuentasporpagar.getcliente_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case SaldosCuentasPorPagarConstantesFunciones.LABEL_FECHAEMISIONHASTA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(SaldosCuentasPorPagarConstantesFunciones.LABEL_FECHAEMISIONHASTA);
					iRow++;

					for(SaldosCuentasPorPagar saldoscuentasporpagar:saldoscuentasporpagarsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(saldoscuentasporpagar.getfecha_emision_hasta());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case SaldosCuentasPorPagarConstantesFunciones.LABEL_CODIGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(SaldosCuentasPorPagarConstantesFunciones.LABEL_CODIGO);
					iRow++;

					for(SaldosCuentasPorPagar saldoscuentasporpagar:saldoscuentasporpagarsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(saldoscuentasporpagar.getcodigo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case SaldosCuentasPorPagarConstantesFunciones.LABEL_NOMBRECOMPLETO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(SaldosCuentasPorPagarConstantesFunciones.LABEL_NOMBRECOMPLETO);
					iRow++;

					for(SaldosCuentasPorPagar saldoscuentasporpagar:saldoscuentasporpagarsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(saldoscuentasporpagar.getnombre_completo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case SaldosCuentasPorPagarConstantesFunciones.LABEL_DEBITOMONELOCAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(SaldosCuentasPorPagarConstantesFunciones.LABEL_DEBITOMONELOCAL);
					iRow++;

					for(SaldosCuentasPorPagar saldoscuentasporpagar:saldoscuentasporpagarsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(saldoscuentasporpagar.getdebito_mone_local());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case SaldosCuentasPorPagarConstantesFunciones.LABEL_CREDITOMONELOCAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(SaldosCuentasPorPagarConstantesFunciones.LABEL_CREDITOMONELOCAL);
					iRow++;

					for(SaldosCuentasPorPagar saldoscuentasporpagar:saldoscuentasporpagarsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(saldoscuentasporpagar.getcredito_mone_local());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case SaldosCuentasPorPagarConstantesFunciones.LABEL_SALDOANTERIOR:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(SaldosCuentasPorPagarConstantesFunciones.LABEL_SALDOANTERIOR);
					iRow++;

					for(SaldosCuentasPorPagar saldoscuentasporpagar:saldoscuentasporpagarsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(saldoscuentasporpagar.getsaldo_anterior());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case SaldosCuentasPorPagarConstantesFunciones.LABEL_SALDODEBITO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(SaldosCuentasPorPagarConstantesFunciones.LABEL_SALDODEBITO);
					iRow++;

					for(SaldosCuentasPorPagar saldoscuentasporpagar:saldoscuentasporpagarsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(saldoscuentasporpagar.getsaldo_debito());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case SaldosCuentasPorPagarConstantesFunciones.LABEL_SALDOCREDITO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(SaldosCuentasPorPagarConstantesFunciones.LABEL_SALDOCREDITO);
					iRow++;

					for(SaldosCuentasPorPagar saldoscuentasporpagar:saldoscuentasporpagarsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(saldoscuentasporpagar.getsaldo_credito());
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
			//	this.getFilaCabeceraExportarExcelSaldosCuentasPorPagar(row);				
			//	iRow++;
			//}				
			
			//for(SaldosCuentasPorPagar saldoscuentasporpagarAux:saldoscuentasporpagarsSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelSaldosCuentasPorPagar(saldoscuentasporpagarAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.saldoscuentasporpagarSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Saldos Cuentas Por Pagar",JOptionPane.INFORMATION_MESSAGE);
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
				this.saldoscuentasporpagarLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingSaldosCuentasPorPagar(false);
			
			//SI ES MANUAL
			if(SaldosCuentasPorPagarJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualSaldosCuentasPorPagar();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldoscuentasporpagarLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldoscuentasporpagarLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldoscuentasporpagarLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresSaldosCuentasPorPagarActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldoscuentasporpagarLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingSaldosCuentasPorPagar(false);
			
			//SI ES MANUAL
			if(SaldosCuentasPorPagarJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualSaldosCuentasPorPagar();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldoscuentasporpagarLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldoscuentasporpagarLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,SaldosCuentasPorPagarConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldoscuentasporpagarLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesSaldosCuentasPorPagarActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldoscuentasporpagarLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingSaldosCuentasPorPagar(false);
			
			//SI ES MANUAL
			if(SaldosCuentasPorPagarJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualSaldosCuentasPorPagar();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldoscuentasporpagarLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldoscuentasporpagarLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,SaldosCuentasPorPagarConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldoscuentasporpagarLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaSaldosCuentasPorPagar() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosSaldosCuentasPorPagar.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosSaldosCuentasPorPagar.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosSaldosCuentasPorPagar.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosSaldosCuentasPorPagar.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosSaldosCuentasPorPagar.setMinimumSize(dimensionMinimum);
		this.jTableDatosSaldosCuentasPorPagar.setMaximumSize(dimensionMaximum);
		this.jTableDatosSaldosCuentasPorPagar.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingSaldosCuentasPorPagar(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingSaldosCuentasPorPagar(esInicializar,true);
	}
	
	public void inicializarActualizarBindingSaldosCuentasPorPagar(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaSaldosCuentasPorPagar(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesSaldosCuentasPorPagar(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.saldoscuentasporpagarSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasSaldosCuentasPorPagar(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesSaldosCuentasPorPagar(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesSaldosCuentasPorPagar(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !SaldosCuentasPorPagarJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!SaldosCuentasPorPagarJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualSaldosCuentasPorPagar() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaSaldosCuentasPorPagar();
		
		this.inicializarActualizarBindingBotonesManualSaldosCuentasPorPagar(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.saldoscuentasporpagarSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualSaldosCuentasPorPagar();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesSaldosCuentasPorPagar() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualSaldosCuentasPorPagar(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualSaldosCuentasPorPagar(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosSaldosCuentasPorPagar.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosSaldosCuentasPorPagar.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteSaldosCuentasPorPagar.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormSaldosCuentasPorPagar!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormSaldosCuentasPorPagar.jCheckBoxPostAccionNuevoSaldosCuentasPorPagar.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormSaldosCuentasPorPagar.jCheckBoxPostAccionSinCerrarSaldosCuentasPorPagar.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormSaldosCuentasPorPagar.jCheckBoxPostAccionSinMensajeSaldosCuentasPorPagar.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosSaldosCuentasPorPagar.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosSaldosCuentasPorPagar.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteSaldosCuentasPorPagar.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormSaldosCuentasPorPagar!=null) {
				this.jInternalFrameDetalleFormSaldosCuentasPorPagar.jCheckBoxPostAccionNuevoSaldosCuentasPorPagar.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormSaldosCuentasPorPagar.jCheckBoxPostAccionSinCerrarSaldosCuentasPorPagar.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormSaldosCuentasPorPagar.jCheckBoxPostAccionSinMensajeSaldosCuentasPorPagar.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionSaldosCuentasPorPagar.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionSaldosCuentasPorPagar.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormSaldosCuentasPorPagar!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormSaldosCuentasPorPagar.jComboBoxTiposAccionesFormularioSaldosCuentasPorPagar.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesSaldosCuentasPorPagar.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoSaldosCuentasPorPagar!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoSaldosCuentasPorPagar.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesSaldosCuentasPorPagar.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesSaldosCuentasPorPagar.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarSaldosCuentasPorPagar.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesSaldosCuentasPorPagar.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoSaldosCuentasPorPagar!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoSaldosCuentasPorPagar.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesSaldosCuentasPorPagar.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralSaldosCuentasPorPagar.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesSaldosCuentasPorPagar(Boolean esInicializar) throws Exception {
		try	{	
			if(SaldosCuentasPorPagarJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualSaldosCuentasPorPagar(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesSaldosCuentasPorPagar() throws Exception {
		try	{
			if(SaldosCuentasPorPagarJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualSaldosCuentasPorPagar();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleSaldosCuentasPorPagar() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormSaldosCuentasPorPagar.jComboBoxTiposAccionesFormularioSaldosCuentasPorPagar.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormSaldosCuentasPorPagar.jComboBoxTiposAccionesFormularioSaldosCuentasPorPagar.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualSaldosCuentasPorPagar() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesSaldosCuentasPorPagar.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesSaldosCuentasPorPagar.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesSaldosCuentasPorPagar.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesSaldosCuentasPorPagar.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesSaldosCuentasPorPagar.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesSaldosCuentasPorPagar.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionSaldosCuentasPorPagar.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionSaldosCuentasPorPagar.addItem(reporte);
			}
			
			
			if(!this.saldoscuentasporpagarSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionSaldosCuentasPorPagar.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionSaldosCuentasPorPagar.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesSaldosCuentasPorPagar.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesSaldosCuentasPorPagar.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesSaldosCuentasPorPagar.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesSaldosCuentasPorPagar.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormSaldosCuentasPorPagar!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormSaldosCuentasPorPagar.jComboBoxTiposAccionesFormularioSaldosCuentasPorPagar.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormSaldosCuentasPorPagar.jComboBoxTiposAccionesFormularioSaldosCuentasPorPagar.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarSaldosCuentasPorPagar.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarSaldosCuentasPorPagar.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarSaldosCuentasPorPagar.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualSaldosCuentasPorPagar();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualSaldosCuentasPorPagar() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoSaldosCuentasPorPagar!=null) {
				this.jInternalFrameReporteDinamicoSaldosCuentasPorPagar.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoSaldosCuentasPorPagar.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoSaldosCuentasPorPagar!=null) {
				this.jInternalFrameReporteDinamicoSaldosCuentasPorPagar.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoSaldosCuentasPorPagar.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoSaldosCuentasPorPagar!=null) {
				
				if(this.jInternalFrameReporteDinamicoSaldosCuentasPorPagar.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoSaldosCuentasPorPagar.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoSaldosCuentasPorPagar.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoSaldosCuentasPorPagar.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoSaldosCuentasPorPagar.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoSaldosCuentasPorPagar.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
				
				//TIPOS COLUMNAS CATEGORIA DINAMICO
				if(this.jInternalFrameReporteDinamicoSaldosCuentasPorPagar.getjComboBoxColumnaCategoriaGrafico()!=null) {
					this.jInternalFrameReporteDinamicoSaldosCuentasPorPagar.getjComboBoxColumnaCategoriaGrafico().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoria=SaldosCuentasPorPagarConstantesFunciones.getTiposSeleccionarSaldosCuentasPorPagar(true,true,false,true,true);
						
					for(Reporte reporte:tiposColumnasCategoria) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoSaldosCuentasPorPagar.getjComboBoxColumnaCategoriaGrafico().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS CATEGORIA VALOR DINAMICO
				if(this.jInternalFrameReporteDinamicoSaldosCuentasPorPagar.getjComboBoxColumnaCategoriaValor()!=null) {
					this.jInternalFrameReporteDinamicoSaldosCuentasPorPagar.getjComboBoxColumnaCategoriaValor().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoriaValor=SaldosCuentasPorPagarConstantesFunciones.getTiposSeleccionarSaldosCuentasPorPagar(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasCategoriaValor) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoSaldosCuentasPorPagar.getjComboBoxColumnaCategoriaValor().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS VALOR
				defaultListModel=new DefaultListModel<Reporte>();
					
				if(this.jInternalFrameReporteDinamicoSaldosCuentasPorPagar.getjListColumnasValoresGrafico()!=null) {
					this.jInternalFrameReporteDinamicoSaldosCuentasPorPagar.getjListColumnasValoresGrafico().removeAll();
						
					ArrayList<Reporte> tiposColumnasValor=SaldosCuentasPorPagarConstantesFunciones.getTiposSeleccionarSaldosCuentasPorPagar(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasValor) {//this.tiposSeleccionar
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoSaldosCuentasPorPagar.getjListColumnasValoresGrafico().setModel(defaultListModel);									
						
				}
					
				//TIPOS GRAFICOS REPORTES DINAMICOS
				if(this.jInternalFrameReporteDinamicoSaldosCuentasPorPagar.getjComboBoxTiposGraficosReportesDinamico()!=null) {
					this.jInternalFrameReporteDinamicoSaldosCuentasPorPagar.getjComboBoxTiposGraficosReportesDinamico().removeAllItems();
						
					for(Reporte reporte:this.tiposGraficosReportes) {
						this.jInternalFrameReporteDinamicoSaldosCuentasPorPagar.getjComboBoxTiposGraficosReportesDinamico().addItem(reporte);
					}
					
				}
			
			
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualSaldosCuentasPorPagar()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_zonaBusquedaSaldosCuentasPorPagarSaldosCuentasPorPagar.getSelectedItem()!=null){this.id_zonaBusquedaSaldosCuentasPorPagar=((Zona)this.jComboBoxid_zonaBusquedaSaldosCuentasPorPagarSaldosCuentasPorPagar.getSelectedItem()).getId();}
		if(this.jComboBoxid_grupo_clienteBusquedaSaldosCuentasPorPagarSaldosCuentasPorPagar.getSelectedItem()!=null){this.id_grupo_clienteBusquedaSaldosCuentasPorPagar=((GrupoCliente)this.jComboBoxid_grupo_clienteBusquedaSaldosCuentasPorPagarSaldosCuentasPorPagar.getSelectedItem()).getId();}
		if(this.jComboBoxid_clienteBusquedaSaldosCuentasPorPagarSaldosCuentasPorPagar.getSelectedItem()!=null){this.id_clienteBusquedaSaldosCuentasPorPagar=((Cliente)this.jComboBoxid_clienteBusquedaSaldosCuentasPorPagarSaldosCuentasPorPagar.getSelectedItem()).getId();}
		this.fecha_emision_hastaBusquedaSaldosCuentasPorPagar=new Date(this.jDateChooserfecha_emision_hastaBusquedaSaldosCuentasPorPagarSaldosCuentasPorPagar.getDate().getTime());
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasSaldosCuentasPorPagar(Boolean esInicializar) throws Exception {				
		if(SaldosCuentasPorPagarJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualSaldosCuentasPorPagar();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaSaldosCuentasPorPagar() throws Exception {
		this.inicializarActualizarBindingTablaSaldosCuentasPorPagar(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderBySaldosCuentasPorPagar() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderBySaldosCuentasPorPagar.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderBySaldosCuentasPorPagar.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderBySaldosCuentasPorPagar.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new SaldosCuentasPorPagarPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderBySaldosCuentasPorPagar.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderBySaldosCuentasPorPagar.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new SaldosCuentasPorPagarPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosSaldosCuentasPorPagarOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSaldosCuentasPorPagarOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new SaldosCuentasPorPagarPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderBySaldosCuentasPorPagar.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderBySaldosCuentasPorPagar.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new SaldosCuentasPorPagarPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderBySaldosCuentasPorPagar.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaSaldosCuentasPorPagar(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=saldoscuentasporpagarLogic.getSaldosCuentasPorPagars().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=saldoscuentasporpagars.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(SaldosCuentasPorPagarJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosSaldosCuentasPorPagar.setModel(new SaldosCuentasPorPagarModel(this.saldoscuentasporpagarLogic.getSaldosCuentasPorPagars(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosSaldosCuentasPorPagar.setModel(new SaldosCuentasPorPagarModel(this.saldoscuentasporpagars,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderBySaldosCuentasPorPagar!=null && this.jInternalFrameOrderBySaldosCuentasPorPagar.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderBySaldosCuentasPorPagar();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosSaldosCuentasPorPagar.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSaldosCuentasPorPagar,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new SaldosCuentasPorPagarPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+SaldosCuentasPorPagarConstantesFunciones.SCLASSWEBTITULO,saldoscuentasporpagarConstantesFunciones.resaltarSeleccionarSaldosCuentasPorPagar,iSizeTabla,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+SaldosCuentasPorPagarConstantesFunciones.SCLASSWEBTITULO,saldoscuentasporpagarConstantesFunciones.resaltarSeleccionarSaldosCuentasPorPagar,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosSaldosCuentasPorPagar.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSaldosCuentasPorPagar,SaldosCuentasPorPagarConstantesFunciones.LABEL_ID));

		if(this.saldoscuentasporpagarConstantesFunciones.mostraridSaldosCuentasPorPagar && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,SaldosCuentasPorPagarConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.saldoscuentasporpagarConstantesFunciones.resaltaridSaldosCuentasPorPagar,this.saldoscuentasporpagarConstantesFunciones.activaridSaldosCuentasPorPagar,iSizeTabla,this,true,"idSaldosCuentasPorPagar","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.saldoscuentasporpagarConstantesFunciones.resaltaridSaldosCuentasPorPagar,this.saldoscuentasporpagarConstantesFunciones.activaridSaldosCuentasPorPagar,this,true,"idSaldosCuentasPorPagar","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosSaldosCuentasPorPagar.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSaldosCuentasPorPagar,SaldosCuentasPorPagarConstantesFunciones.LABEL_CODIGO));

		if(this.saldoscuentasporpagarConstantesFunciones.mostrarcodigoSaldosCuentasPorPagar && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,SaldosCuentasPorPagarConstantesFunciones.LABEL_CODIGO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.saldoscuentasporpagarConstantesFunciones.resaltarcodigoSaldosCuentasPorPagar,this.saldoscuentasporpagarConstantesFunciones.activarcodigoSaldosCuentasPorPagar,iSizeTabla,this,true,"codigoSaldosCuentasPorPagar","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.saldoscuentasporpagarConstantesFunciones.resaltarcodigoSaldosCuentasPorPagar,this.saldoscuentasporpagarConstantesFunciones.activarcodigoSaldosCuentasPorPagar,this,true,"codigoSaldosCuentasPorPagar","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new SaldosCuentasPorPagarPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosSaldosCuentasPorPagar.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSaldosCuentasPorPagar,SaldosCuentasPorPagarConstantesFunciones.LABEL_NOMBRECOMPLETO));

		if(this.saldoscuentasporpagarConstantesFunciones.mostrarnombre_completoSaldosCuentasPorPagar && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,SaldosCuentasPorPagarConstantesFunciones.LABEL_NOMBRECOMPLETO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.saldoscuentasporpagarConstantesFunciones.resaltarnombre_completoSaldosCuentasPorPagar,this.saldoscuentasporpagarConstantesFunciones.activarnombre_completoSaldosCuentasPorPagar,iSizeTabla,this,true,"nombre_completoSaldosCuentasPorPagar","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.saldoscuentasporpagarConstantesFunciones.resaltarnombre_completoSaldosCuentasPorPagar,this.saldoscuentasporpagarConstantesFunciones.activarnombre_completoSaldosCuentasPorPagar,this,true,"nombre_completoSaldosCuentasPorPagar","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new SaldosCuentasPorPagarPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosSaldosCuentasPorPagar.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSaldosCuentasPorPagar,SaldosCuentasPorPagarConstantesFunciones.LABEL_DEBITOMONELOCAL));

		if(this.saldoscuentasporpagarConstantesFunciones.mostrardebito_mone_localSaldosCuentasPorPagar && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,SaldosCuentasPorPagarConstantesFunciones.LABEL_DEBITOMONELOCAL,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.saldoscuentasporpagarConstantesFunciones.resaltardebito_mone_localSaldosCuentasPorPagar,this.saldoscuentasporpagarConstantesFunciones.activardebito_mone_localSaldosCuentasPorPagar,iSizeTabla,this,true,"debito_mone_localSaldosCuentasPorPagar","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.saldoscuentasporpagarConstantesFunciones.resaltardebito_mone_localSaldosCuentasPorPagar,this.saldoscuentasporpagarConstantesFunciones.activardebito_mone_localSaldosCuentasPorPagar,this,true,"debito_mone_localSaldosCuentasPorPagar","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new SaldosCuentasPorPagarPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosSaldosCuentasPorPagar.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSaldosCuentasPorPagar,SaldosCuentasPorPagarConstantesFunciones.LABEL_CREDITOMONELOCAL));

		if(this.saldoscuentasporpagarConstantesFunciones.mostrarcredito_mone_localSaldosCuentasPorPagar && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,SaldosCuentasPorPagarConstantesFunciones.LABEL_CREDITOMONELOCAL,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.saldoscuentasporpagarConstantesFunciones.resaltarcredito_mone_localSaldosCuentasPorPagar,this.saldoscuentasporpagarConstantesFunciones.activarcredito_mone_localSaldosCuentasPorPagar,iSizeTabla,this,true,"credito_mone_localSaldosCuentasPorPagar","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.saldoscuentasporpagarConstantesFunciones.resaltarcredito_mone_localSaldosCuentasPorPagar,this.saldoscuentasporpagarConstantesFunciones.activarcredito_mone_localSaldosCuentasPorPagar,this,true,"credito_mone_localSaldosCuentasPorPagar","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new SaldosCuentasPorPagarPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosSaldosCuentasPorPagar.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSaldosCuentasPorPagar,SaldosCuentasPorPagarConstantesFunciones.LABEL_SALDODEBITO));

		if(this.saldoscuentasporpagarConstantesFunciones.mostrarsaldo_debitoSaldosCuentasPorPagar && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,SaldosCuentasPorPagarConstantesFunciones.LABEL_SALDODEBITO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.saldoscuentasporpagarConstantesFunciones.resaltarsaldo_debitoSaldosCuentasPorPagar,this.saldoscuentasporpagarConstantesFunciones.activarsaldo_debitoSaldosCuentasPorPagar,iSizeTabla,this,true,"saldo_debitoSaldosCuentasPorPagar","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.saldoscuentasporpagarConstantesFunciones.resaltarsaldo_debitoSaldosCuentasPorPagar,this.saldoscuentasporpagarConstantesFunciones.activarsaldo_debitoSaldosCuentasPorPagar,this,true,"saldo_debitoSaldosCuentasPorPagar","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new SaldosCuentasPorPagarPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosSaldosCuentasPorPagar.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSaldosCuentasPorPagar,SaldosCuentasPorPagarConstantesFunciones.LABEL_SALDOCREDITO));

		if(this.saldoscuentasporpagarConstantesFunciones.mostrarsaldo_creditoSaldosCuentasPorPagar && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,SaldosCuentasPorPagarConstantesFunciones.LABEL_SALDOCREDITO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.saldoscuentasporpagarConstantesFunciones.resaltarsaldo_creditoSaldosCuentasPorPagar,this.saldoscuentasporpagarConstantesFunciones.activarsaldo_creditoSaldosCuentasPorPagar,iSizeTabla,this,true,"saldo_creditoSaldosCuentasPorPagar","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.saldoscuentasporpagarConstantesFunciones.resaltarsaldo_creditoSaldosCuentasPorPagar,this.saldoscuentasporpagarConstantesFunciones.activarsaldo_creditoSaldosCuentasPorPagar,this,true,"saldo_creditoSaldosCuentasPorPagar","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new SaldosCuentasPorPagarPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.saldoscuentasporpagarSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.saldoscuentasporpagarSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.saldoscuentasporpagarSessionBean.getEsGuardarRelacionado(),iSizeTabla));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosSaldosCuentasPorPagar.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.saldoscuentasporpagarSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.saldoscuentasporpagarSessionBean.getEsGuardarRelacionado(),iSizeTabla));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosSaldosCuentasPorPagar.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarSaldosCuentasPorPagar && this.isPermisoGuardarCambiosSaldosCuentasPorPagar) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.saldoscuentasporpagarSessionBean.getEsGuardarRelacionado(),iSizeTabla));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.saldoscuentasporpagarSessionBean.getEsGuardarRelacionado(),iSizeTabla));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosSaldosCuentasPorPagar.addColumn(tableColumn);
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
			
			this.jTableDatosSaldosCuentasPorPagar.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarSaldosCuentasPorPagar && this.isPermisoGuardarCambiosSaldosCuentasPorPagar) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarSaldosCuentasPorPagar && this.isPermisoGuardarCambiosSaldosCuentasPorPagar) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosSaldosCuentasPorPagar.moveColumn(this.jTableDatosSaldosCuentasPorPagar.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosSaldosCuentasPorPagar.moveColumn(this.jTableDatosSaldosCuentasPorPagar.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosSaldosCuentasPorPagar.moveColumn(this.jTableDatosSaldosCuentasPorPagar.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosSaldosCuentasPorPagar.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosSaldosCuentasPorPagar.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosSaldosCuentasPorPagar,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!SaldosCuentasPorPagarJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosSaldosCuentasPorPagar.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosSaldosCuentasPorPagar.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!SaldosCuentasPorPagarJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!SaldosCuentasPorPagarJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosSaldosCuentasPorPagar.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosSaldosCuentasPorPagar.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosSaldosCuentasPorPagar.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							//iSize=saldoscuentasporpagarLogic.getSaldosCuentasPorPagars().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=saldoscuentasporpagars.size()-1;
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
		//this.jTableDatosSaldosCuentasPorPagar.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosSaldosCuentasPorPagar.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosSaldosCuentasPorPagar();
			
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
				
				//this.isEsNuevoSaldosCuentasPorPagar=false;
					
				SaldosCuentasPorPagarBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.saldoscuentasporpagar,new Object(),this.saldoscuentasporpagarParameterGeneral,this.saldoscuentasporpagarReturnGeneral);
			
				if(this.saldoscuentasporpagarSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormSaldosCuentasPorPagar==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosSaldosCuentasPorPagar.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosSaldosCuentasPorPagar.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.saldoscuentasporpagar =(SaldosCuentasPorPagar) this.saldoscuentasporpagarLogic.getSaldosCuentasPorPagars().toArray()[this.jTableDatosSaldosCuentasPorPagar.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.saldoscuentasporpagar =(SaldosCuentasPorPagar) this.saldoscuentasporpagars.toArray()[this.jTableDatosSaldosCuentasPorPagar.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.saldoscuentasporpagar.getsType().equals("DUPLICADO")
				   || this.saldoscuentasporpagar.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoSaldosCuentasPorPagar=true;
				
				} else {
					this.isEsNuevoSaldosCuentasPorPagar=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.saldoscuentasporpagarSessionBean.getEsGuardarRelacionado()) {
					if(this.saldoscuentasporpagar.getId()>=0 && !this.saldoscuentasporpagar.getIsNew()) {						
						this.isEsNuevoSaldosCuentasPorPagar=false;
						
					} else {
						this.isEsNuevoSaldosCuentasPorPagar=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoSaldosCuentasPorPagar(esRelaciones);						
				
				this.seleccionarSaldosCuentasPorPagar(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.saldoscuentasporpagar.getId()<0) {
					this.isEsNuevoSaldosCuentasPorPagar=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarSaldosCuentasPorPagar(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarSaldosCuentasPorPagar(evt,rowIndex);
				}	
				
				if(this.saldoscuentasporpagarSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion SaldosCuentasPorPagar: " + this.dDif); 
					}
				}								
				
				SaldosCuentasPorPagarBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.saldoscuentasporpagar,new Object(),this.saldoscuentasporpagarParameterGeneral,this.saldoscuentasporpagarReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarSaldosCuentasPorPagar(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.saldoscuentasporpagar)) {
					if(this.saldoscuentasporpagar.getId()>0) {
						this.saldoscuentasporpagar.setIsDeleted(true);
						
						this.saldoscuentasporpagarsEliminados.add(this.saldoscuentasporpagar);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.saldoscuentasporpagarLogic.getSaldosCuentasPorPagars().remove(this.saldoscuentasporpagar);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.saldoscuentasporpagars.remove(this.saldoscuentasporpagar);				
					}
					
					
					((SaldosCuentasPorPagarModel) this.jTableDatosSaldosCuentasPorPagar.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaSaldosCuentasPorPagar(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,SaldosCuentasPorPagarConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarSaldosCuentasPorPagar(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoSaldosCuentasPorPagar) {
			
			if(this.jInternalFrameDetalleFormSaldosCuentasPorPagar==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosSaldosCuentasPorPagar.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosSaldosCuentasPorPagar.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.saldoscuentasporpagar =(SaldosCuentasPorPagar) this.saldoscuentasporpagarLogic.getSaldosCuentasPorPagars().toArray()[this.jTableDatosSaldosCuentasPorPagar.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.saldoscuentasporpagar =(SaldosCuentasPorPagar) this.saldoscuentasporpagars.toArray()[this.jTableDatosSaldosCuentasPorPagar.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(SaldosCuentasPorPagarJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioSaldosCuentasPorPagar(this.saldoscuentasporpagar);
				}
				
				//ARCHITECTURE
				try {
					
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesSaldosCuentasPorPagar("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesSaldosCuentasPorPagar(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualSaldosCuentasPorPagar() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SaldosCuentasPorPagarConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoSaldosCuentasPorPagar(SaldosCuentasPorPagar saldoscuentasporpagar) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoSaldosCuentasPorPagar(saldoscuentasporpagar,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoSaldosCuentasPorPagar(SaldosCuentasPorPagar saldoscuentasporpagar,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioSaldosCuentasPorPagar(saldoscuentasporpagar);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeySaldosCuentasPorPagar(saldoscuentasporpagar,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeySaldosCuentasPorPagar(saldoscuentasporpagar);
	}
	
	public void setVariablesObjetoActualToFormularioSaldosCuentasPorPagar(SaldosCuentasPorPagar saldoscuentasporpagar) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormSaldosCuentasPorPagar==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormSaldosCuentasPorPagar.jLabelidSaldosCuentasPorPagar.setText(saldoscuentasporpagar.getId().toString());
			this.jInternalFrameDetalleFormSaldosCuentasPorPagar.jTextFieldcodigoSaldosCuentasPorPagar.setText(saldoscuentasporpagar.getcodigo());
			this.jInternalFrameDetalleFormSaldosCuentasPorPagar.jTextAreanombre_completoSaldosCuentasPorPagar.setText(saldoscuentasporpagar.getnombre_completo());
			this.jInternalFrameDetalleFormSaldosCuentasPorPagar.jTextFielddebito_mone_localSaldosCuentasPorPagar.setText(saldoscuentasporpagar.getdebito_mone_local().toString());
			this.jInternalFrameDetalleFormSaldosCuentasPorPagar.jTextFieldcredito_mone_localSaldosCuentasPorPagar.setText(saldoscuentasporpagar.getcredito_mone_local().toString());
			this.jInternalFrameDetalleFormSaldosCuentasPorPagar.jTextFieldsaldo_debitoSaldosCuentasPorPagar.setText(saldoscuentasporpagar.getsaldo_debito().toString());
			this.jInternalFrameDetalleFormSaldosCuentasPorPagar.jTextFieldsaldo_creditoSaldosCuentasPorPagar.setText(saldoscuentasporpagar.getsaldo_credito().toString());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,SaldosCuentasPorPagarConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,SaldosCuentasPorPagar saldoscuentasporpagarLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,saldoscuentasporpagarLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,SaldosCuentasPorPagar saldoscuentasporpagarLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				saldoscuentasporpagarLocal=this.saldoscuentasporpagar;
			} else {
				saldoscuentasporpagarLocal=this.saldoscuentasporpagarAnterior;
			}
		}
		
		if(this.permiteMantenimiento(saldoscuentasporpagarLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoSaldosCuentasPorPagar(saldoscuentasporpagarLocal,true);
					
					if(saldoscuentasporpagarSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(saldoscuentasporpagarLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.saldoscuentasporpagarSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(saldoscuentasporpagarLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoSaldosCuentasPorPagar(SaldosCuentasPorPagar saldoscuentasporpagar,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualSaldosCuentasPorPagar(saldoscuentasporpagar,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysSaldosCuentasPorPagar(saldoscuentasporpagar);
	}
	
	public void setVariablesFormularioToObjetoActualSaldosCuentasPorPagar(SaldosCuentasPorPagar saldoscuentasporpagar,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualSaldosCuentasPorPagar(saldoscuentasporpagar,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualSaldosCuentasPorPagar(SaldosCuentasPorPagar saldoscuentasporpagar,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormSaldosCuentasPorPagar==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormSaldosCuentasPorPagar.jLabelidSaldosCuentasPorPagar.getText()==null || this.jInternalFrameDetalleFormSaldosCuentasPorPagar.jLabelidSaldosCuentasPorPagar.getText()=="" || this.jInternalFrameDetalleFormSaldosCuentasPorPagar.jLabelidSaldosCuentasPorPagar.getText()=="Id") {
				this.jInternalFrameDetalleFormSaldosCuentasPorPagar.jLabelidSaldosCuentasPorPagar.setText("0");
			}

			if(conColumnasBase) {saldoscuentasporpagar.setId(Long.parseLong(this.jInternalFrameDetalleFormSaldosCuentasPorPagar.jLabelidSaldosCuentasPorPagar.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+SaldosCuentasPorPagarConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSaldosCuentasPorPagar.jLabelIdSaldosCuentasPorPagar,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			saldoscuentasporpagar.setcodigo(this.jInternalFrameDetalleFormSaldosCuentasPorPagar.jTextFieldcodigoSaldosCuentasPorPagar.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+SaldosCuentasPorPagarConstantesFunciones.LABEL_CODIGO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSaldosCuentasPorPagar.jLabelcodigoSaldosCuentasPorPagar,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			saldoscuentasporpagar.setnombre_completo(this.jInternalFrameDetalleFormSaldosCuentasPorPagar.jTextAreanombre_completoSaldosCuentasPorPagar.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+SaldosCuentasPorPagarConstantesFunciones.LABEL_NOMBRECOMPLETO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSaldosCuentasPorPagar.jLabelnombre_completoSaldosCuentasPorPagar,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			saldoscuentasporpagar.setdebito_mone_local(Double.parseDouble(this.jInternalFrameDetalleFormSaldosCuentasPorPagar.jTextFielddebito_mone_localSaldosCuentasPorPagar.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+SaldosCuentasPorPagarConstantesFunciones.LABEL_DEBITOMONELOCAL+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSaldosCuentasPorPagar.jLabeldebito_mone_localSaldosCuentasPorPagar,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			saldoscuentasporpagar.setcredito_mone_local(Double.parseDouble(this.jInternalFrameDetalleFormSaldosCuentasPorPagar.jTextFieldcredito_mone_localSaldosCuentasPorPagar.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+SaldosCuentasPorPagarConstantesFunciones.LABEL_CREDITOMONELOCAL+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSaldosCuentasPorPagar.jLabelcredito_mone_localSaldosCuentasPorPagar,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			saldoscuentasporpagar.setsaldo_debito(Double.parseDouble(this.jInternalFrameDetalleFormSaldosCuentasPorPagar.jTextFieldsaldo_debitoSaldosCuentasPorPagar.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+SaldosCuentasPorPagarConstantesFunciones.LABEL_SALDODEBITO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSaldosCuentasPorPagar.jLabelsaldo_debitoSaldosCuentasPorPagar,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			saldoscuentasporpagar.setsaldo_credito(Double.parseDouble(this.jInternalFrameDetalleFormSaldosCuentasPorPagar.jTextFieldsaldo_creditoSaldosCuentasPorPagar.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+SaldosCuentasPorPagarConstantesFunciones.LABEL_SALDOCREDITO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSaldosCuentasPorPagar.jLabelsaldo_creditoSaldosCuentasPorPagar,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,SaldosCuentasPorPagarConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualSaldosCuentasPorPagar(SaldosCuentasPorPagar saldoscuentasporpagarBean,SaldosCuentasPorPagar saldoscuentasporpagar,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,SaldosCuentasPorPagarConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosSaldosCuentasPorPagar(SaldosCuentasPorPagar saldoscuentasporpagarOrigen,SaldosCuentasPorPagar saldoscuentasporpagar,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && saldoscuentasporpagarOrigen.getId()!=null && !saldoscuentasporpagarOrigen.getId().equals(0L))) {saldoscuentasporpagar.setId(saldoscuentasporpagarOrigen.getId());}}
			if(conDefault || (!conDefault && saldoscuentasporpagarOrigen.getfecha_emision_hasta()!=null && !saldoscuentasporpagarOrigen.getfecha_emision_hasta().equals(new Date()))) {saldoscuentasporpagar.setfecha_emision_hasta(saldoscuentasporpagarOrigen.getfecha_emision_hasta());}
			if(conDefault || (!conDefault && saldoscuentasporpagarOrigen.getcodigo()!=null && !saldoscuentasporpagarOrigen.getcodigo().equals(""))) {saldoscuentasporpagar.setcodigo(saldoscuentasporpagarOrigen.getcodigo());}
			if(conDefault || (!conDefault && saldoscuentasporpagarOrigen.getnombre_completo()!=null && !saldoscuentasporpagarOrigen.getnombre_completo().equals(""))) {saldoscuentasporpagar.setnombre_completo(saldoscuentasporpagarOrigen.getnombre_completo());}
			if(conDefault || (!conDefault && saldoscuentasporpagarOrigen.getdebito_mone_local()!=null && !saldoscuentasporpagarOrigen.getdebito_mone_local().equals(0.0))) {saldoscuentasporpagar.setdebito_mone_local(saldoscuentasporpagarOrigen.getdebito_mone_local());}
			if(conDefault || (!conDefault && saldoscuentasporpagarOrigen.getcredito_mone_local()!=null && !saldoscuentasporpagarOrigen.getcredito_mone_local().equals(0.0))) {saldoscuentasporpagar.setcredito_mone_local(saldoscuentasporpagarOrigen.getcredito_mone_local());}
			if(conDefault || (!conDefault && saldoscuentasporpagarOrigen.getsaldo_anterior()!=null && !saldoscuentasporpagarOrigen.getsaldo_anterior().equals(0.0))) {saldoscuentasporpagar.setsaldo_anterior(saldoscuentasporpagarOrigen.getsaldo_anterior());}
			if(conDefault || (!conDefault && saldoscuentasporpagarOrigen.getsaldo_debito()!=null && !saldoscuentasporpagarOrigen.getsaldo_debito().equals(0.0))) {saldoscuentasporpagar.setsaldo_debito(saldoscuentasporpagarOrigen.getsaldo_debito());}
			if(conDefault || (!conDefault && saldoscuentasporpagarOrigen.getsaldo_credito()!=null && !saldoscuentasporpagarOrigen.getsaldo_credito().equals(0.0))) {saldoscuentasporpagar.setsaldo_credito(saldoscuentasporpagarOrigen.getsaldo_credito());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,SaldosCuentasPorPagarConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioSaldosCuentasPorPagar(SaldosCuentasPorPagar saldoscuentasporpagar) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormSaldosCuentasPorPagar.jLabelidSaldosCuentasPorPagar.setText(saldoscuentasporpagar.getId().toString());
			this.jInternalFrameDetalleFormSaldosCuentasPorPagar.jTextFieldcodigoSaldosCuentasPorPagar.setText(saldoscuentasporpagar.getcodigo());
			this.jInternalFrameDetalleFormSaldosCuentasPorPagar.jTextAreanombre_completoSaldosCuentasPorPagar.setText(saldoscuentasporpagar.getnombre_completo());
			this.jInternalFrameDetalleFormSaldosCuentasPorPagar.jTextFielddebito_mone_localSaldosCuentasPorPagar.setText(saldoscuentasporpagar.getdebito_mone_local().toString());
			this.jInternalFrameDetalleFormSaldosCuentasPorPagar.jTextFieldcredito_mone_localSaldosCuentasPorPagar.setText(saldoscuentasporpagar.getcredito_mone_local().toString());
			this.jInternalFrameDetalleFormSaldosCuentasPorPagar.jTextFieldsaldo_debitoSaldosCuentasPorPagar.setText(saldoscuentasporpagar.getsaldo_debito().toString());
			this.jInternalFrameDetalleFormSaldosCuentasPorPagar.jTextFieldsaldo_creditoSaldosCuentasPorPagar.setText(saldoscuentasporpagar.getsaldo_credito().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SaldosCuentasPorPagarConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioSaldosCuentasPorPagar(SaldosCuentasPorPagarBean saldoscuentasporpagarBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormSaldosCuentasPorPagar.jLabelidSaldosCuentasPorPagar.setText(saldoscuentasporpagarBean.getId().toString());
			this.jInternalFrameDetalleFormSaldosCuentasPorPagar.jTextFieldcodigoSaldosCuentasPorPagar.setText(saldoscuentasporpagarBean.getcodigo());
			this.jInternalFrameDetalleFormSaldosCuentasPorPagar.jTextAreanombre_completoSaldosCuentasPorPagar.setText(saldoscuentasporpagarBean.getnombre_completo());
			this.jInternalFrameDetalleFormSaldosCuentasPorPagar.jTextFielddebito_mone_localSaldosCuentasPorPagar.setText(saldoscuentasporpagarBean.getdebito_mone_local().toString());
			this.jInternalFrameDetalleFormSaldosCuentasPorPagar.jTextFieldcredito_mone_localSaldosCuentasPorPagar.setText(saldoscuentasporpagarBean.getcredito_mone_local().toString());
			this.jInternalFrameDetalleFormSaldosCuentasPorPagar.jTextFieldsaldo_debitoSaldosCuentasPorPagar.setText(saldoscuentasporpagarBean.getsaldo_debito().toString());
			this.jInternalFrameDetalleFormSaldosCuentasPorPagar.jTextFieldsaldo_creditoSaldosCuentasPorPagar.setText(saldoscuentasporpagarBean.getsaldo_credito().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SaldosCuentasPorPagarConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanSaldosCuentasPorPagar(SaldosCuentasPorPagarParameterReturnGeneral saldoscuentasporpagarReturnGeneral,SaldosCuentasPorPagarBean saldoscuentasporpagarBean,Boolean conDefault) throws Exception { 
		try {
			SaldosCuentasPorPagar saldoscuentasporpagarLocal=new SaldosCuentasPorPagar();
			
			saldoscuentasporpagarLocal=saldoscuentasporpagarReturnGeneral.getSaldosCuentasPorPagar();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && saldoscuentasporpagarLocal.getId()!=null && !saldoscuentasporpagarLocal.getId().equals(0L))) {saldoscuentasporpagarBean.setId(saldoscuentasporpagarLocal.getId());}}
			if(conDefault || (!conDefault && saldoscuentasporpagarLocal.getcodigo()!=null && !saldoscuentasporpagarLocal.getcodigo().equals(""))) {saldoscuentasporpagarBean.setcodigo(saldoscuentasporpagarLocal.getcodigo());}
			if(conDefault || (!conDefault && saldoscuentasporpagarLocal.getnombre_completo()!=null && !saldoscuentasporpagarLocal.getnombre_completo().equals(""))) {saldoscuentasporpagarBean.setnombre_completo(saldoscuentasporpagarLocal.getnombre_completo());}
			if(conDefault || (!conDefault && saldoscuentasporpagarLocal.getdebito_mone_local()!=null && !saldoscuentasporpagarLocal.getdebito_mone_local().equals(0.0))) {saldoscuentasporpagarBean.setdebito_mone_local(saldoscuentasporpagarLocal.getdebito_mone_local());}
			if(conDefault || (!conDefault && saldoscuentasporpagarLocal.getcredito_mone_local()!=null && !saldoscuentasporpagarLocal.getcredito_mone_local().equals(0.0))) {saldoscuentasporpagarBean.setcredito_mone_local(saldoscuentasporpagarLocal.getcredito_mone_local());}
			if(conDefault || (!conDefault && saldoscuentasporpagarLocal.getsaldo_debito()!=null && !saldoscuentasporpagarLocal.getsaldo_debito().equals(0.0))) {saldoscuentasporpagarBean.setsaldo_debito(saldoscuentasporpagarLocal.getsaldo_debito());}
			if(conDefault || (!conDefault && saldoscuentasporpagarLocal.getsaldo_credito()!=null && !saldoscuentasporpagarLocal.getsaldo_credito().equals(0.0))) {saldoscuentasporpagarBean.setsaldo_credito(saldoscuentasporpagarLocal.getsaldo_credito());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SaldosCuentasPorPagarConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxSaldosCuentasPorPagarGenerico(Long idSaldosCuentasPorPagarSeleccionado,JComboBox jComboBoxSaldosCuentasPorPagar,List<SaldosCuentasPorPagar> saldoscuentasporpagarsLocal)throws Exception {
		try {
			SaldosCuentasPorPagar  saldoscuentasporpagarTemp=null;

			for(SaldosCuentasPorPagar saldoscuentasporpagarAux:saldoscuentasporpagarsLocal) {
				if(saldoscuentasporpagarAux.getId()!=null && saldoscuentasporpagarAux.getId().equals(idSaldosCuentasPorPagarSeleccionado)) {
					saldoscuentasporpagarTemp=saldoscuentasporpagarAux;
					break;
				}
			}

			jComboBoxSaldosCuentasPorPagar.setSelectedItem(saldoscuentasporpagarTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxSaldosCuentasPorPagarGenerico(JComboBox jComboBoxSaldosCuentasPorPagar,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxSaldosCuentasPorPagar.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxSaldosCuentasPorPagar.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxSaldosCuentasPorPagar.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxSaldosCuentasPorPagar.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxSaldosCuentasPorPagar.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxSaldosCuentasPorPagar.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxSaldosCuentasPorPagar.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxSaldosCuentasPorPagar.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxSaldosCuentasPorPagar.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxSaldosCuentasPorPagar.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,SaldosCuentasPorPagarConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			saldoscuentasporpagar=(SaldosCuentasPorPagar) saldoscuentasporpagarLogic.getSaldosCuentasPorPagars().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			saldoscuentasporpagar =(SaldosCuentasPorPagar) saldoscuentasporpagars.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Zona")) {
			//sDescripcion=this.getActualZonaForeignKeyDescripcion((Long)value);
			if(!saldoscuentasporpagar.getIsNew() && !saldoscuentasporpagar.getIsChanged() && !saldoscuentasporpagar.getIsDeleted()) {
				sDescripcion=saldoscuentasporpagar.getzona_descripcion();
			} else {
				//sDescripcion=this.getActualZonaForeignKeyDescripcion((Long)value);
				sDescripcion=saldoscuentasporpagar.getzona_descripcion();
			}
		}

		if(sTipo.equals("GrupoCliente")) {
			//sDescripcion=this.getActualGrupoClienteForeignKeyDescripcion((Long)value);
			if(!saldoscuentasporpagar.getIsNew() && !saldoscuentasporpagar.getIsChanged() && !saldoscuentasporpagar.getIsDeleted()) {
				sDescripcion=saldoscuentasporpagar.getgrupocliente_descripcion();
			} else {
				//sDescripcion=this.getActualGrupoClienteForeignKeyDescripcion((Long)value);
				sDescripcion=saldoscuentasporpagar.getgrupocliente_descripcion();
			}
		}

		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!saldoscuentasporpagar.getIsNew() && !saldoscuentasporpagar.getIsChanged() && !saldoscuentasporpagar.getIsDeleted()) {
				sDescripcion=saldoscuentasporpagar.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=saldoscuentasporpagar.getempresa_descripcion();
			}
		}

		if(sTipo.equals("Sucursal")) {
			//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
			if(!saldoscuentasporpagar.getIsNew() && !saldoscuentasporpagar.getIsChanged() && !saldoscuentasporpagar.getIsDeleted()) {
				sDescripcion=saldoscuentasporpagar.getsucursal_descripcion();
			} else {
				//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
				sDescripcion=saldoscuentasporpagar.getsucursal_descripcion();
			}
		}

		if(sTipo.equals("Cliente")) {
			//sDescripcion=this.getActualClienteForeignKeyDescripcion((Long)value);
			if(!saldoscuentasporpagar.getIsNew() && !saldoscuentasporpagar.getIsChanged() && !saldoscuentasporpagar.getIsDeleted()) {
				sDescripcion=saldoscuentasporpagar.getcliente_descripcion();
			} else {
				//sDescripcion=this.getActualClienteForeignKeyDescripcion((Long)value);
				sDescripcion=saldoscuentasporpagar.getcliente_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		SaldosCuentasPorPagar saldoscuentasporpagarRow=new SaldosCuentasPorPagar();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			saldoscuentasporpagarRow=(SaldosCuentasPorPagar) saldoscuentasporpagarLogic.getSaldosCuentasPorPagars().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			saldoscuentasporpagarRow=(SaldosCuentasPorPagar) saldoscuentasporpagars.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualSaldosCuentasPorPagar(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoSaldosCuentasPorPagar.setVisible((this.isVisibilidadCeldaNuevoSaldosCuentasPorPagar && this.isPermisoNuevoSaldosCuentasPorPagar));			
			this.jButtonDuplicarSaldosCuentasPorPagar.setVisible((this.isVisibilidadCeldaDuplicarSaldosCuentasPorPagar && this.isPermisoDuplicarSaldosCuentasPorPagar));			
			this.jButtonCopiarSaldosCuentasPorPagar.setVisible((this.isVisibilidadCeldaCopiarSaldosCuentasPorPagar && this.isPermisoCopiarSaldosCuentasPorPagar));
			this.jButtonVerFormSaldosCuentasPorPagar.setVisible((this.isVisibilidadCeldaVerFormSaldosCuentasPorPagar && this.isPermisoVerFormSaldosCuentasPorPagar));
			
			this.jButtonAbrirOrderBySaldosCuentasPorPagar.setVisible((this.isVisibilidadCeldaOrdenSaldosCuentasPorPagar && this.isPermisoOrdenSaldosCuentasPorPagar));			
			
			this.jButtonNuevoRelacionesSaldosCuentasPorPagar.setVisible((this.isVisibilidadCeldaNuevoRelacionesSaldosCuentasPorPagar && this.isPermisoNuevoSaldosCuentasPorPagar));			
			this.jButtonNuevoGuardarCambiosSaldosCuentasPorPagar.setVisible((this.isVisibilidadCeldaNuevoSaldosCuentasPorPagar && this.isPermisoNuevoSaldosCuentasPorPagar && this.isPermisoGuardarCambiosSaldosCuentasPorPagar));
			
			if(this.jInternalFrameDetalleFormSaldosCuentasPorPagar!=null) {
			this.jInternalFrameDetalleFormSaldosCuentasPorPagar.jButtonModificarSaldosCuentasPorPagar.setVisible((this.isVisibilidadCeldaModificarSaldosCuentasPorPagar && this.isPermisoActualizarSaldosCuentasPorPagar));	
			this.jInternalFrameDetalleFormSaldosCuentasPorPagar.jButtonActualizarSaldosCuentasPorPagar.setVisible((this.isVisibilidadCeldaActualizarSaldosCuentasPorPagar && this.isPermisoActualizarSaldosCuentasPorPagar));	
			this.jInternalFrameDetalleFormSaldosCuentasPorPagar.jButtonEliminarSaldosCuentasPorPagar.setVisible((this.isVisibilidadCeldaEliminarSaldosCuentasPorPagar && this.isPermisoEliminarSaldosCuentasPorPagar));
			this.jInternalFrameDetalleFormSaldosCuentasPorPagar.jButtonCancelarSaldosCuentasPorPagar.setVisible(this.isVisibilidadCeldaCancelarSaldosCuentasPorPagar);							
			this.jInternalFrameDetalleFormSaldosCuentasPorPagar.jButtonGuardarCambiosSaldosCuentasPorPagar.setVisible((this.isVisibilidadCeldaGuardarSaldosCuentasPorPagar && this.isPermisoGuardarCambiosSaldosCuentasPorPagar));			
			
			}
						
			this.jButtonGuardarCambiosTablaSaldosCuentasPorPagar.setVisible((this.isVisibilidadCeldaGuardarCambiosSaldosCuentasPorPagar && this.isPermisoGuardarCambiosSaldosCuentasPorPagar));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarSaldosCuentasPorPagar.setVisible((this.isVisibilidadCeldaNuevoSaldosCuentasPorPagar && this.isPermisoNuevoSaldosCuentasPorPagar));						
			this.jButtonDuplicarToolBarSaldosCuentasPorPagar.setVisible((this.isVisibilidadCeldaDuplicarSaldosCuentasPorPagar && this.isPermisoDuplicarSaldosCuentasPorPagar));						
			this.jButtonCopiarToolBarSaldosCuentasPorPagar.setVisible((this.isVisibilidadCeldaCopiarSaldosCuentasPorPagar && this.isPermisoCopiarSaldosCuentasPorPagar));			
			this.jButtonVerFormToolBarSaldosCuentasPorPagar.setVisible((this.isVisibilidadCeldaVerFormSaldosCuentasPorPagar && this.isPermisoVerFormSaldosCuentasPorPagar));			
			this.jButtonAbrirOrderByToolBarSaldosCuentasPorPagar.setVisible((this.isVisibilidadCeldaOrdenSaldosCuentasPorPagar && this.isPermisoOrdenSaldosCuentasPorPagar));
			this.jButtonNuevoRelacionesToolBarSaldosCuentasPorPagar.setVisible((this.isVisibilidadCeldaNuevoRelacionesSaldosCuentasPorPagar && this.isPermisoNuevoSaldosCuentasPorPagar));			
			this.jButtonNuevoGuardarCambiosToolBarSaldosCuentasPorPagar.setVisible((this.isVisibilidadCeldaNuevoSaldosCuentasPorPagar && this.isPermisoNuevoSaldosCuentasPorPagar && this.isPermisoGuardarCambiosSaldosCuentasPorPagar));			
			
			if(this.jInternalFrameDetalleFormSaldosCuentasPorPagar!=null) {
			this.jInternalFrameDetalleFormSaldosCuentasPorPagar.jButtonModificarToolBarSaldosCuentasPorPagar.setVisible((this.isVisibilidadCeldaModificarSaldosCuentasPorPagar && this.isPermisoActualizarSaldosCuentasPorPagar));	
			this.jInternalFrameDetalleFormSaldosCuentasPorPagar.jButtonActualizarToolBarSaldosCuentasPorPagar.setVisible((this.isVisibilidadCeldaActualizarSaldosCuentasPorPagar  && this.isPermisoActualizarSaldosCuentasPorPagar));	
			this.jInternalFrameDetalleFormSaldosCuentasPorPagar.jButtonEliminarToolBarSaldosCuentasPorPagar.setVisible((this.isVisibilidadCeldaEliminarSaldosCuentasPorPagar && this.isPermisoEliminarSaldosCuentasPorPagar));
			this.jInternalFrameDetalleFormSaldosCuentasPorPagar.jButtonCancelarToolBarSaldosCuentasPorPagar.setVisible(this.isVisibilidadCeldaCancelarSaldosCuentasPorPagar);				
			this.jInternalFrameDetalleFormSaldosCuentasPorPagar.jButtonGuardarCambiosToolBarSaldosCuentasPorPagar.setVisible((this.isVisibilidadCeldaGuardarSaldosCuentasPorPagar && this.isPermisoGuardarCambiosSaldosCuentasPorPagar));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarSaldosCuentasPorPagar.setVisible((this.isVisibilidadCeldaGuardarCambiosSaldosCuentasPorPagar && this.isPermisoGuardarCambiosSaldosCuentasPorPagar));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoSaldosCuentasPorPagar.setVisible((this.isVisibilidadCeldaNuevoSaldosCuentasPorPagar && this.isPermisoNuevoSaldosCuentasPorPagar));			
			this.jMenuItemDuplicarSaldosCuentasPorPagar.setVisible((this.isVisibilidadCeldaDuplicarSaldosCuentasPorPagar && this.isPermisoDuplicarSaldosCuentasPorPagar));			
			this.jMenuItemCopiarSaldosCuentasPorPagar.setVisible((this.isVisibilidadCeldaCopiarSaldosCuentasPorPagar && this.isPermisoCopiarSaldosCuentasPorPagar));			
			this.jMenuItemVerFormSaldosCuentasPorPagar.setVisible((this.isVisibilidadCeldaVerFormSaldosCuentasPorPagar && this.isPermisoVerFormSaldosCuentasPorPagar));			
			this.jMenuItemAbrirOrderBySaldosCuentasPorPagar.setVisible((this.isVisibilidadCeldaOrdenSaldosCuentasPorPagar && this.isPermisoOrdenSaldosCuentasPorPagar));			
			//this.jMenuItemMostrarOcultarSaldosCuentasPorPagar.setVisible((this.isVisibilidadCeldaOrdenSaldosCuentasPorPagar && this.isPermisoOrdenSaldosCuentasPorPagar));
			this.jMenuItemDetalleAbrirOrderBySaldosCuentasPorPagar.setVisible((this.isVisibilidadCeldaOrdenSaldosCuentasPorPagar && this.isPermisoOrdenSaldosCuentasPorPagar));			
			//this.jMenuItemDetalleMostrarOcultarSaldosCuentasPorPagar.setVisible((this.isVisibilidadCeldaOrdenSaldosCuentasPorPagar && this.isPermisoOrdenSaldosCuentasPorPagar));			
			this.jMenuItemNuevoRelacionesSaldosCuentasPorPagar.setVisible((this.isVisibilidadCeldaNuevoRelacionesSaldosCuentasPorPagar && this.isPermisoNuevoSaldosCuentasPorPagar));			
			this.jMenuItemNuevoGuardarCambiosSaldosCuentasPorPagar.setVisible((this.isVisibilidadCeldaNuevoSaldosCuentasPorPagar && this.isPermisoNuevoSaldosCuentasPorPagar && this.isPermisoGuardarCambiosSaldosCuentasPorPagar));									
			
			if(this.jInternalFrameDetalleFormSaldosCuentasPorPagar!=null) {
			this.jInternalFrameDetalleFormSaldosCuentasPorPagar.jMenuItemModificarSaldosCuentasPorPagar.setVisible((this.isVisibilidadCeldaModificarSaldosCuentasPorPagar && this.isPermisoActualizarSaldosCuentasPorPagar));	
			this.jInternalFrameDetalleFormSaldosCuentasPorPagar.jMenuItemActualizarSaldosCuentasPorPagar.setVisible((this.isVisibilidadCeldaActualizarSaldosCuentasPorPagar && this.isPermisoActualizarSaldosCuentasPorPagar));	
			this.jInternalFrameDetalleFormSaldosCuentasPorPagar.jMenuItemEliminarSaldosCuentasPorPagar.setVisible((this.isVisibilidadCeldaEliminarSaldosCuentasPorPagar && this.isPermisoEliminarSaldosCuentasPorPagar));
			this.jInternalFrameDetalleFormSaldosCuentasPorPagar.jMenuItemCancelarSaldosCuentasPorPagar.setVisible(this.isVisibilidadCeldaCancelarSaldosCuentasPorPagar);				
			}
			
			this.jMenuItemGuardarCambiosSaldosCuentasPorPagar.setVisible((this.isVisibilidadCeldaGuardarSaldosCuentasPorPagar && this.isPermisoGuardarCambiosSaldosCuentasPorPagar));						
			this.jMenuItemGuardarCambiosTablaSaldosCuentasPorPagar.setVisible((this.isVisibilidadCeldaGuardarCambiosSaldosCuentasPorPagar && this.isPermisoGuardarCambiosSaldosCuentasPorPagar));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoSaldosCuentasPorPagar=this.jButtonNuevoSaldosCuentasPorPagar.isVisible();
			this.isVisibilidadCeldaDuplicarSaldosCuentasPorPagar=this.jButtonDuplicarSaldosCuentasPorPagar.isVisible();
			this.isVisibilidadCeldaCopiarSaldosCuentasPorPagar=this.jButtonCopiarSaldosCuentasPorPagar.isVisible();
			this.isVisibilidadCeldaVerFormSaldosCuentasPorPagar=this.jButtonVerFormSaldosCuentasPorPagar.isVisible();
			
			this.isVisibilidadCeldaOrdenSaldosCuentasPorPagar=this.jButtonAbrirOrderBySaldosCuentasPorPagar.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesSaldosCuentasPorPagar=this.jButtonNuevoRelacionesSaldosCuentasPorPagar.isVisible();
			this.isVisibilidadCeldaModificarSaldosCuentasPorPagar=this.jButtonModificarSaldosCuentasPorPagar.isVisible();
			
			if(this.jInternalFrameDetalleFormSaldosCuentasPorPagar!=null) {
			this.isVisibilidadCeldaActualizarSaldosCuentasPorPagar=this.jInternalFrameDetalleFormSaldosCuentasPorPagar.jButtonActualizarSaldosCuentasPorPagar.isVisible();
			this.isVisibilidadCeldaEliminarSaldosCuentasPorPagar=this.jInternalFrameDetalleFormSaldosCuentasPorPagar.jButtonEliminarSaldosCuentasPorPagar.isVisible();
			this.isVisibilidadCeldaCancelarSaldosCuentasPorPagar=this.jInternalFrameDetalleFormSaldosCuentasPorPagar.jButtonCancelarSaldosCuentasPorPagar.isVisible();
			this.isVisibilidadCeldaGuardarSaldosCuentasPorPagar=this.jInternalFrameDetalleFormSaldosCuentasPorPagar.jButtonGuardarCambiosSaldosCuentasPorPagar.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosSaldosCuentasPorPagar=this.jButtonGuardarCambiosTablaSaldosCuentasPorPagar.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoSaldosCuentasPorPagar=this.jButtonNuevoToolBarSaldosCuentasPorPagar.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesSaldosCuentasPorPagar=this.jButtonNuevoRelacionesToolBarSaldosCuentasPorPagar.isVisible();
			
			if(this.jInternalFrameDetalleFormSaldosCuentasPorPagar!=null) {
			this.isVisibilidadCeldaModificarSaldosCuentasPorPagar=this.jInternalFrameDetalleFormSaldosCuentasPorPagar.jButtonModificarToolBarSaldosCuentasPorPagar.isVisible();
			this.isVisibilidadCeldaActualizarSaldosCuentasPorPagar=this.jInternalFrameDetalleFormSaldosCuentasPorPagar.jButtonActualizarToolBarSaldosCuentasPorPagar.isVisible();
			this.isVisibilidadCeldaEliminarSaldosCuentasPorPagar=this.jInternalFrameDetalleFormSaldosCuentasPorPagar.jButtonEliminarToolBarSaldosCuentasPorPagar.isVisible();
			this.isVisibilidadCeldaCancelarSaldosCuentasPorPagar=this.jInternalFrameDetalleFormSaldosCuentasPorPagar.jButtonCancelarToolBarSaldosCuentasPorPagar.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarSaldosCuentasPorPagar=this.jButtonGuardarCambiosToolBarSaldosCuentasPorPagar.isVisible();
			this.isVisibilidadCeldaGuardarCambiosSaldosCuentasPorPagar=this.jButtonGuardarCambiosTablaToolBarSaldosCuentasPorPagar.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoSaldosCuentasPorPagar=this.jMenuItemNuevoSaldosCuentasPorPagar.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesSaldosCuentasPorPagar=this.jMenuItemNuevoRelacionesSaldosCuentasPorPagar.isVisible();
			
			if(this.jInternalFrameDetalleFormSaldosCuentasPorPagar!=null) {
			this.isVisibilidadCeldaModificarSaldosCuentasPorPagar=this.jInternalFrameDetalleFormSaldosCuentasPorPagar.jMenuItemModificarSaldosCuentasPorPagar.isVisible();
			this.isVisibilidadCeldaActualizarSaldosCuentasPorPagar=this.jInternalFrameDetalleFormSaldosCuentasPorPagar.jMenuItemActualizarSaldosCuentasPorPagar.isVisible();
			this.isVisibilidadCeldaEliminarSaldosCuentasPorPagar=this.jInternalFrameDetalleFormSaldosCuentasPorPagar.jMenuItemEliminarSaldosCuentasPorPagar.isVisible();
			this.isVisibilidadCeldaCancelarSaldosCuentasPorPagar=this.jInternalFrameDetalleFormSaldosCuentasPorPagar.jMenuItemCancelarSaldosCuentasPorPagar.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarSaldosCuentasPorPagar=this.jMenuItemGuardarCambiosSaldosCuentasPorPagar.isVisible();
			this.isVisibilidadCeldaGuardarCambiosSaldosCuentasPorPagar=this.jMenuItemGuardarCambiosTablaSaldosCuentasPorPagar.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesSaldosCuentasPorPagar(Boolean esInicializar) {
		if(SaldosCuentasPorPagarJInternalFrame.ISBINDING_MANUAL) {			
			if(this.saldoscuentasporpagarSessionBean.getConGuardarRelaciones()) {
				//if(this.saldoscuentasporpagarSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesSaldosCuentasPorPagar();
			}
			
			this.inicializarActualizarBindingBotonesManualSaldosCuentasPorPagar(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualSaldosCuentasPorPagar() {
		this.jButtonNuevoSaldosCuentasPorPagar.setVisible(this.isPermisoNuevoSaldosCuentasPorPagar);			
		this.jButtonDuplicarSaldosCuentasPorPagar.setVisible(this.isPermisoDuplicarSaldosCuentasPorPagar);			
		this.jButtonCopiarSaldosCuentasPorPagar.setVisible(this.isPermisoCopiarSaldosCuentasPorPagar);			
		this.jButtonVerFormSaldosCuentasPorPagar.setVisible(this.isPermisoVerFormSaldosCuentasPorPagar);			
		
		this.jButtonAbrirOrderBySaldosCuentasPorPagar.setVisible(this.isPermisoOrdenSaldosCuentasPorPagar);					
		
		this.jButtonNuevoRelacionesSaldosCuentasPorPagar.setVisible(this.isPermisoNuevoSaldosCuentasPorPagar);			
		
		if(this.jInternalFrameDetalleFormSaldosCuentasPorPagar!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSaldosCuentasPorPagar.jButtonModificarSaldosCuentasPorPagar.setVisible(this.isPermisoActualizarSaldosCuentasPorPagar);	
			this.jInternalFrameDetalleFormSaldosCuentasPorPagar.jButtonActualizarSaldosCuentasPorPagar.setVisible(this.isPermisoActualizarSaldosCuentasPorPagar);	
			this.jInternalFrameDetalleFormSaldosCuentasPorPagar.jButtonEliminarSaldosCuentasPorPagar.setVisible(this.isPermisoEliminarSaldosCuentasPorPagar);
			this.jInternalFrameDetalleFormSaldosCuentasPorPagar.jButtonCancelarSaldosCuentasPorPagar.setVisible(this.isVisibilidadCeldaCancelarSaldosCuentasPorPagar);						
			this.jInternalFrameDetalleFormSaldosCuentasPorPagar.jButtonGuardarCambiosSaldosCuentasPorPagar.setVisible(this.isPermisoGuardarCambiosSaldosCuentasPorPagar);							
		}
		
		this.jButtonGuardarCambiosTablaSaldosCuentasPorPagar.setVisible(this.isPermisoActualizarSaldosCuentasPorPagar);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleSaldosCuentasPorPagar() {
		this.jInternalFrameDetalleFormSaldosCuentasPorPagar.jButtonModificarSaldosCuentasPorPagar.setVisible(this.isPermisoActualizarSaldosCuentasPorPagar);	
		this.jInternalFrameDetalleFormSaldosCuentasPorPagar.jButtonActualizarSaldosCuentasPorPagar.setVisible(this.isPermisoActualizarSaldosCuentasPorPagar);	
		this.jInternalFrameDetalleFormSaldosCuentasPorPagar.jButtonEliminarSaldosCuentasPorPagar.setVisible(this.isPermisoEliminarSaldosCuentasPorPagar);
		this.jInternalFrameDetalleFormSaldosCuentasPorPagar.jButtonCancelarSaldosCuentasPorPagar.setVisible(this.isVisibilidadCeldaCancelarSaldosCuentasPorPagar);							
		this.jInternalFrameDetalleFormSaldosCuentasPorPagar.jButtonGuardarCambiosSaldosCuentasPorPagar.setVisible((this.isVisibilidadCeldaGuardarSaldosCuentasPorPagar && this.isPermisoGuardarCambiosSaldosCuentasPorPagar));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosSaldosCuentasPorPagar() {
		if(SaldosCuentasPorPagarJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualSaldosCuentasPorPagar();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesSaldosCuentasPorPagar() {
	}
	
	public void jTableDatosSaldosCuentasPorPagarListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarSaldosCuentasPorPagar(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SaldosCuentasPorPagarConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidSaldosCuentasPorPagarBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.saldoscuentasporpagarLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSaldosCuentasPorPagar.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualSaldosCuentasPorPagar(this.getsaldoscuentasporpagar(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysSaldosCuentasPorPagar(this.saldoscuentasporpagar);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.saldoscuentasporpagar =(SaldosCuentasPorPagar) this.saldoscuentasporpagarLogic.getSaldosCuentasPorPagars().toArray()[this.jTableDatosSaldosCuentasPorPagar.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.saldoscuentasporpagar =(SaldosCuentasPorPagar) this.saldoscuentasporpagars.toArray()[this.jTableDatosSaldosCuentasPorPagar.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.saldoscuentasporpagar==null) {
						this.saldoscuentasporpagar = new SaldosCuentasPorPagar();
					}

					this.setVariablesFormularioToObjetoActualSaldosCuentasPorPagar(this.saldoscuentasporpagar,true);
					this.setVariablesFormularioToObjetoActualForeignKeysSaldosCuentasPorPagar(this.saldoscuentasporpagar);
				}

				if(this.saldoscuentasporpagar.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.saldoscuentasporpagar.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingSaldosCuentasPorPagar(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.saldoscuentasporpagarLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.saldoscuentasporpagarLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,SaldosCuentasPorPagarConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.saldoscuentasporpagarLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_zonaSaldosCuentasPorPagarUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldoscuentasporpagarLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisozona=true;

			idTienePermisozona=this.tienePermisosUsuarioEnPaginaWebSaldosCuentasPorPagar(ZonaConstantesFunciones.CLASSNAME);

			if(idTienePermisozona) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSaldosCuentasPorPagar.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosSaldosCuentasPorPagar.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosSaldosCuentasPorPagar.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.saldoscuentasporpagar =(SaldosCuentasPorPagar) this.saldoscuentasporpagarLogic.getSaldosCuentasPorPagars().toArray()[this.jTableDatosSaldosCuentasPorPagar.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.saldoscuentasporpagar =(SaldosCuentasPorPagar) this.saldoscuentasporpagars.toArray()[this.jTableDatosSaldosCuentasPorPagar.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualSaldosCuentasPorPagar(this.getsaldoscuentasporpagar(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysSaldosCuentasPorPagar(this.saldoscuentasporpagar);

				this.zonaBeanSwingJInternalFrame=new ZonaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.zonaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.zonaBeanSwingJInternalFrame.getZonaLogic().setConnexion(this.saldoscuentasporpagarLogic.getConnexion());

				if(this.saldoscuentasporpagar.getid_zona()!=null) {
					this.zonaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.zonaBeanSwingJInternalFrame.setIdActual(this.saldoscuentasporpagar.getid_zona());
					this.zonaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.zonaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.zonaBeanSwingJInternalFrame.inicializarActualizarBindingTablaZona();
				}

				JInternalFrameBase jinternalFrame =this.zonaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderSaldosCuentasPorPagar=(TitledBorder)this.jScrollPanelDatosSaldosCuentasPorPagar.getBorder();
				TitledBorder titledBorderzona=(TitledBorder)this.zonaBeanSwingJInternalFrame.jScrollPanelDatosZona.getBorder();

				titledBorderzona.setTitle(titledBorderSaldosCuentasPorPagar.getTitle() + " -> Zona");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldoscuentasporpagarLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldoscuentasporpagarLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,SaldosCuentasPorPagarConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldoscuentasporpagarLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_zonaSaldosCuentasPorPagarBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.saldoscuentasporpagarLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSaldosCuentasPorPagar.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualSaldosCuentasPorPagar(this.getsaldoscuentasporpagar(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysSaldosCuentasPorPagar(this.saldoscuentasporpagar);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.saldoscuentasporpagar =(SaldosCuentasPorPagar) this.saldoscuentasporpagarLogic.getSaldosCuentasPorPagars().toArray()[this.jTableDatosSaldosCuentasPorPagar.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.saldoscuentasporpagar =(SaldosCuentasPorPagar) this.saldoscuentasporpagars.toArray()[this.jTableDatosSaldosCuentasPorPagar.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.saldoscuentasporpagar==null) {
						this.saldoscuentasporpagar = new SaldosCuentasPorPagar();
					}

					this.setVariablesFormularioToObjetoActualSaldosCuentasPorPagar(this.saldoscuentasporpagar,true);
					this.setVariablesFormularioToObjetoActualForeignKeysSaldosCuentasPorPagar(this.saldoscuentasporpagar);
				}

				if(this.saldoscuentasporpagar.getid_zona()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_zona = "+this.saldoscuentasporpagar.getid_zona().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingSaldosCuentasPorPagar(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.saldoscuentasporpagarLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.saldoscuentasporpagarLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,SaldosCuentasPorPagarConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.saldoscuentasporpagarLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_grupo_clienteSaldosCuentasPorPagarUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldoscuentasporpagarLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisogrupocliente=true;

			idTienePermisogrupocliente=this.tienePermisosUsuarioEnPaginaWebSaldosCuentasPorPagar(GrupoClienteConstantesFunciones.CLASSNAME);

			if(idTienePermisogrupocliente) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSaldosCuentasPorPagar.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosSaldosCuentasPorPagar.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosSaldosCuentasPorPagar.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.saldoscuentasporpagar =(SaldosCuentasPorPagar) this.saldoscuentasporpagarLogic.getSaldosCuentasPorPagars().toArray()[this.jTableDatosSaldosCuentasPorPagar.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.saldoscuentasporpagar =(SaldosCuentasPorPagar) this.saldoscuentasporpagars.toArray()[this.jTableDatosSaldosCuentasPorPagar.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualSaldosCuentasPorPagar(this.getsaldoscuentasporpagar(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysSaldosCuentasPorPagar(this.saldoscuentasporpagar);

				this.grupoclienteBeanSwingJInternalFrame=new GrupoClienteBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.grupoclienteBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.grupoclienteBeanSwingJInternalFrame.getGrupoClienteLogic().setConnexion(this.saldoscuentasporpagarLogic.getConnexion());

				if(this.saldoscuentasporpagar.getid_grupo_cliente()!=null) {
					this.grupoclienteBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.grupoclienteBeanSwingJInternalFrame.setIdActual(this.saldoscuentasporpagar.getid_grupo_cliente());
					this.grupoclienteBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.grupoclienteBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.grupoclienteBeanSwingJInternalFrame.inicializarActualizarBindingTablaGrupoCliente();
				}

				JInternalFrameBase jinternalFrame =this.grupoclienteBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderSaldosCuentasPorPagar=(TitledBorder)this.jScrollPanelDatosSaldosCuentasPorPagar.getBorder();
				TitledBorder titledBordergrupocliente=(TitledBorder)this.grupoclienteBeanSwingJInternalFrame.jScrollPanelDatosGrupoCliente.getBorder();

				titledBordergrupocliente.setTitle(titledBorderSaldosCuentasPorPagar.getTitle() + " -> Grupo Cliente");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldoscuentasporpagarLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldoscuentasporpagarLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,SaldosCuentasPorPagarConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldoscuentasporpagarLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_grupo_clienteSaldosCuentasPorPagarBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.saldoscuentasporpagarLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSaldosCuentasPorPagar.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualSaldosCuentasPorPagar(this.getsaldoscuentasporpagar(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysSaldosCuentasPorPagar(this.saldoscuentasporpagar);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.saldoscuentasporpagar =(SaldosCuentasPorPagar) this.saldoscuentasporpagarLogic.getSaldosCuentasPorPagars().toArray()[this.jTableDatosSaldosCuentasPorPagar.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.saldoscuentasporpagar =(SaldosCuentasPorPagar) this.saldoscuentasporpagars.toArray()[this.jTableDatosSaldosCuentasPorPagar.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.saldoscuentasporpagar==null) {
						this.saldoscuentasporpagar = new SaldosCuentasPorPagar();
					}

					this.setVariablesFormularioToObjetoActualSaldosCuentasPorPagar(this.saldoscuentasporpagar,true);
					this.setVariablesFormularioToObjetoActualForeignKeysSaldosCuentasPorPagar(this.saldoscuentasporpagar);
				}

				if(this.saldoscuentasporpagar.getid_grupo_cliente()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_grupo_cliente = "+this.saldoscuentasporpagar.getid_grupo_cliente().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingSaldosCuentasPorPagar(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.saldoscuentasporpagarLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.saldoscuentasporpagarLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,SaldosCuentasPorPagarConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.saldoscuentasporpagarLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaSaldosCuentasPorPagarUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldoscuentasporpagarLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebSaldosCuentasPorPagar(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSaldosCuentasPorPagar.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosSaldosCuentasPorPagar.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosSaldosCuentasPorPagar.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.saldoscuentasporpagar =(SaldosCuentasPorPagar) this.saldoscuentasporpagarLogic.getSaldosCuentasPorPagars().toArray()[this.jTableDatosSaldosCuentasPorPagar.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.saldoscuentasporpagar =(SaldosCuentasPorPagar) this.saldoscuentasporpagars.toArray()[this.jTableDatosSaldosCuentasPorPagar.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualSaldosCuentasPorPagar(this.getsaldoscuentasporpagar(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysSaldosCuentasPorPagar(this.saldoscuentasporpagar);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.saldoscuentasporpagarLogic.getConnexion());

				if(this.saldoscuentasporpagar.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.saldoscuentasporpagar.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderSaldosCuentasPorPagar=(TitledBorder)this.jScrollPanelDatosSaldosCuentasPorPagar.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderSaldosCuentasPorPagar.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldoscuentasporpagarLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldoscuentasporpagarLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,SaldosCuentasPorPagarConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldoscuentasporpagarLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaSaldosCuentasPorPagarBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.saldoscuentasporpagarLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSaldosCuentasPorPagar.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualSaldosCuentasPorPagar(this.getsaldoscuentasporpagar(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysSaldosCuentasPorPagar(this.saldoscuentasporpagar);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.saldoscuentasporpagar =(SaldosCuentasPorPagar) this.saldoscuentasporpagarLogic.getSaldosCuentasPorPagars().toArray()[this.jTableDatosSaldosCuentasPorPagar.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.saldoscuentasporpagar =(SaldosCuentasPorPagar) this.saldoscuentasporpagars.toArray()[this.jTableDatosSaldosCuentasPorPagar.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.saldoscuentasporpagar==null) {
						this.saldoscuentasporpagar = new SaldosCuentasPorPagar();
					}

					this.setVariablesFormularioToObjetoActualSaldosCuentasPorPagar(this.saldoscuentasporpagar,true);
					this.setVariablesFormularioToObjetoActualForeignKeysSaldosCuentasPorPagar(this.saldoscuentasporpagar);
				}

				if(this.saldoscuentasporpagar.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.saldoscuentasporpagar.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingSaldosCuentasPorPagar(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.saldoscuentasporpagarLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.saldoscuentasporpagarLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,SaldosCuentasPorPagarConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.saldoscuentasporpagarLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_sucursalSaldosCuentasPorPagarUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldoscuentasporpagarLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisosucursal=true;

			idTienePermisosucursal=this.tienePermisosUsuarioEnPaginaWebSaldosCuentasPorPagar(SucursalConstantesFunciones.CLASSNAME);

			if(idTienePermisosucursal) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSaldosCuentasPorPagar.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosSaldosCuentasPorPagar.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosSaldosCuentasPorPagar.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.saldoscuentasporpagar =(SaldosCuentasPorPagar) this.saldoscuentasporpagarLogic.getSaldosCuentasPorPagars().toArray()[this.jTableDatosSaldosCuentasPorPagar.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.saldoscuentasporpagar =(SaldosCuentasPorPagar) this.saldoscuentasporpagars.toArray()[this.jTableDatosSaldosCuentasPorPagar.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualSaldosCuentasPorPagar(this.getsaldoscuentasporpagar(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysSaldosCuentasPorPagar(this.saldoscuentasporpagar);

				this.sucursalBeanSwingJInternalFrame=new SucursalBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.sucursalBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.sucursalBeanSwingJInternalFrame.getSucursalLogic().setConnexion(this.saldoscuentasporpagarLogic.getConnexion());

				if(this.saldoscuentasporpagar.getid_sucursal()!=null) {
					this.sucursalBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.sucursalBeanSwingJInternalFrame.setIdActual(this.saldoscuentasporpagar.getid_sucursal());
					this.sucursalBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.inicializarActualizarBindingTablaSucursal();
				}

				JInternalFrameBase jinternalFrame =this.sucursalBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderSaldosCuentasPorPagar=(TitledBorder)this.jScrollPanelDatosSaldosCuentasPorPagar.getBorder();
				TitledBorder titledBordersucursal=(TitledBorder)this.sucursalBeanSwingJInternalFrame.jScrollPanelDatosSucursal.getBorder();

				titledBordersucursal.setTitle(titledBorderSaldosCuentasPorPagar.getTitle() + " -> Sucursal");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldoscuentasporpagarLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldoscuentasporpagarLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,SaldosCuentasPorPagarConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldoscuentasporpagarLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_sucursalSaldosCuentasPorPagarBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.saldoscuentasporpagarLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSaldosCuentasPorPagar.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualSaldosCuentasPorPagar(this.getsaldoscuentasporpagar(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysSaldosCuentasPorPagar(this.saldoscuentasporpagar);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.saldoscuentasporpagar =(SaldosCuentasPorPagar) this.saldoscuentasporpagarLogic.getSaldosCuentasPorPagars().toArray()[this.jTableDatosSaldosCuentasPorPagar.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.saldoscuentasporpagar =(SaldosCuentasPorPagar) this.saldoscuentasporpagars.toArray()[this.jTableDatosSaldosCuentasPorPagar.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.saldoscuentasporpagar==null) {
						this.saldoscuentasporpagar = new SaldosCuentasPorPagar();
					}

					this.setVariablesFormularioToObjetoActualSaldosCuentasPorPagar(this.saldoscuentasporpagar,true);
					this.setVariablesFormularioToObjetoActualForeignKeysSaldosCuentasPorPagar(this.saldoscuentasporpagar);
				}

				if(this.saldoscuentasporpagar.getid_sucursal()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_sucursal = "+this.saldoscuentasporpagar.getid_sucursal().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingSaldosCuentasPorPagar(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.saldoscuentasporpagarLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.saldoscuentasporpagarLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,SaldosCuentasPorPagarConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.saldoscuentasporpagarLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_clienteSaldosCuentasPorPagarUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldoscuentasporpagarLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisocliente=true;

			idTienePermisocliente=this.tienePermisosUsuarioEnPaginaWebSaldosCuentasPorPagar(ClienteConstantesFunciones.CLASSNAME);

			if(idTienePermisocliente) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSaldosCuentasPorPagar.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosSaldosCuentasPorPagar.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosSaldosCuentasPorPagar.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.saldoscuentasporpagar =(SaldosCuentasPorPagar) this.saldoscuentasporpagarLogic.getSaldosCuentasPorPagars().toArray()[this.jTableDatosSaldosCuentasPorPagar.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.saldoscuentasporpagar =(SaldosCuentasPorPagar) this.saldoscuentasporpagars.toArray()[this.jTableDatosSaldosCuentasPorPagar.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualSaldosCuentasPorPagar(this.getsaldoscuentasporpagar(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysSaldosCuentasPorPagar(this.saldoscuentasporpagar);

				this.clienteBeanSwingJInternalFrame=new ClienteBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.clienteBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.clienteBeanSwingJInternalFrame.getClienteLogic().setConnexion(this.saldoscuentasporpagarLogic.getConnexion());

				if(this.saldoscuentasporpagar.getid_cliente()!=null) {
					this.clienteBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.clienteBeanSwingJInternalFrame.setIdActual(this.saldoscuentasporpagar.getid_cliente());
					this.clienteBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.clienteBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.clienteBeanSwingJInternalFrame.inicializarActualizarBindingTablaCliente();
				}

				JInternalFrameBase jinternalFrame =this.clienteBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderSaldosCuentasPorPagar=(TitledBorder)this.jScrollPanelDatosSaldosCuentasPorPagar.getBorder();
				TitledBorder titledBordercliente=(TitledBorder)this.clienteBeanSwingJInternalFrame.jScrollPanelDatosCliente.getBorder();

				titledBordercliente.setTitle(titledBorderSaldosCuentasPorPagar.getTitle() + " -> Cliente");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldoscuentasporpagarLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldoscuentasporpagarLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,SaldosCuentasPorPagarConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldoscuentasporpagarLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_clienteSaldosCuentasPorPagarBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.saldoscuentasporpagarLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSaldosCuentasPorPagar.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualSaldosCuentasPorPagar(this.getsaldoscuentasporpagar(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysSaldosCuentasPorPagar(this.saldoscuentasporpagar);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.saldoscuentasporpagar =(SaldosCuentasPorPagar) this.saldoscuentasporpagarLogic.getSaldosCuentasPorPagars().toArray()[this.jTableDatosSaldosCuentasPorPagar.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.saldoscuentasporpagar =(SaldosCuentasPorPagar) this.saldoscuentasporpagars.toArray()[this.jTableDatosSaldosCuentasPorPagar.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.saldoscuentasporpagar==null) {
						this.saldoscuentasporpagar = new SaldosCuentasPorPagar();
					}

					this.setVariablesFormularioToObjetoActualSaldosCuentasPorPagar(this.saldoscuentasporpagar,true);
					this.setVariablesFormularioToObjetoActualForeignKeysSaldosCuentasPorPagar(this.saldoscuentasporpagar);
				}

				if(this.saldoscuentasporpagar.getid_cliente()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_cliente = "+this.saldoscuentasporpagar.getid_cliente().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingSaldosCuentasPorPagar(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.saldoscuentasporpagarLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.saldoscuentasporpagarLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,SaldosCuentasPorPagarConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.saldoscuentasporpagarLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_emision_hastaSaldosCuentasPorPagarBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.saldoscuentasporpagarLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSaldosCuentasPorPagar.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualSaldosCuentasPorPagar(this.getsaldoscuentasporpagar(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysSaldosCuentasPorPagar(this.saldoscuentasporpagar);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.saldoscuentasporpagar =(SaldosCuentasPorPagar) this.saldoscuentasporpagarLogic.getSaldosCuentasPorPagars().toArray()[this.jTableDatosSaldosCuentasPorPagar.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.saldoscuentasporpagar =(SaldosCuentasPorPagar) this.saldoscuentasporpagars.toArray()[this.jTableDatosSaldosCuentasPorPagar.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.saldoscuentasporpagar==null) {
						this.saldoscuentasporpagar = new SaldosCuentasPorPagar();
					}

					this.setVariablesFormularioToObjetoActualSaldosCuentasPorPagar(this.saldoscuentasporpagar,true);
					this.setVariablesFormularioToObjetoActualForeignKeysSaldosCuentasPorPagar(this.saldoscuentasporpagar);
				}

				if(this.saldoscuentasporpagar.getfecha_emision_hasta()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_emision_hasta = '"+Funciones2.getStringPostgresDate(this.saldoscuentasporpagar.getfecha_emision_hasta())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingSaldosCuentasPorPagar(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.saldoscuentasporpagarLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.saldoscuentasporpagarLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,SaldosCuentasPorPagarConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.saldoscuentasporpagarLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigoSaldosCuentasPorPagarBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.saldoscuentasporpagarLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSaldosCuentasPorPagar.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualSaldosCuentasPorPagar(this.getsaldoscuentasporpagar(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysSaldosCuentasPorPagar(this.saldoscuentasporpagar);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.saldoscuentasporpagar =(SaldosCuentasPorPagar) this.saldoscuentasporpagarLogic.getSaldosCuentasPorPagars().toArray()[this.jTableDatosSaldosCuentasPorPagar.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.saldoscuentasporpagar =(SaldosCuentasPorPagar) this.saldoscuentasporpagars.toArray()[this.jTableDatosSaldosCuentasPorPagar.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.saldoscuentasporpagar==null) {
						this.saldoscuentasporpagar = new SaldosCuentasPorPagar();
					}

					this.setVariablesFormularioToObjetoActualSaldosCuentasPorPagar(this.saldoscuentasporpagar,true);
					this.setVariablesFormularioToObjetoActualForeignKeysSaldosCuentasPorPagar(this.saldoscuentasporpagar);
				}

				if(this.saldoscuentasporpagar.getcodigo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo like '%"+this.saldoscuentasporpagar.getcodigo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingSaldosCuentasPorPagar(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.saldoscuentasporpagarLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.saldoscuentasporpagarLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,SaldosCuentasPorPagarConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.saldoscuentasporpagarLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_completoSaldosCuentasPorPagarBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.saldoscuentasporpagarLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSaldosCuentasPorPagar.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualSaldosCuentasPorPagar(this.getsaldoscuentasporpagar(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysSaldosCuentasPorPagar(this.saldoscuentasporpagar);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.saldoscuentasporpagar =(SaldosCuentasPorPagar) this.saldoscuentasporpagarLogic.getSaldosCuentasPorPagars().toArray()[this.jTableDatosSaldosCuentasPorPagar.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.saldoscuentasporpagar =(SaldosCuentasPorPagar) this.saldoscuentasporpagars.toArray()[this.jTableDatosSaldosCuentasPorPagar.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.saldoscuentasporpagar==null) {
						this.saldoscuentasporpagar = new SaldosCuentasPorPagar();
					}

					this.setVariablesFormularioToObjetoActualSaldosCuentasPorPagar(this.saldoscuentasporpagar,true);
					this.setVariablesFormularioToObjetoActualForeignKeysSaldosCuentasPorPagar(this.saldoscuentasporpagar);
				}

				if(this.saldoscuentasporpagar.getnombre_completo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_completo like '%"+this.saldoscuentasporpagar.getnombre_completo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingSaldosCuentasPorPagar(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.saldoscuentasporpagarLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.saldoscuentasporpagarLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,SaldosCuentasPorPagarConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.saldoscuentasporpagarLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtondebito_mone_localSaldosCuentasPorPagarBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.saldoscuentasporpagarLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSaldosCuentasPorPagar.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualSaldosCuentasPorPagar(this.getsaldoscuentasporpagar(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysSaldosCuentasPorPagar(this.saldoscuentasporpagar);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.saldoscuentasporpagar =(SaldosCuentasPorPagar) this.saldoscuentasporpagarLogic.getSaldosCuentasPorPagars().toArray()[this.jTableDatosSaldosCuentasPorPagar.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.saldoscuentasporpagar =(SaldosCuentasPorPagar) this.saldoscuentasporpagars.toArray()[this.jTableDatosSaldosCuentasPorPagar.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.saldoscuentasporpagar==null) {
						this.saldoscuentasporpagar = new SaldosCuentasPorPagar();
					}

					this.setVariablesFormularioToObjetoActualSaldosCuentasPorPagar(this.saldoscuentasporpagar,true);
					this.setVariablesFormularioToObjetoActualForeignKeysSaldosCuentasPorPagar(this.saldoscuentasporpagar);
				}

				if(this.saldoscuentasporpagar.getdebito_mone_local()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where debito_mone_local = "+this.saldoscuentasporpagar.getdebito_mone_local().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingSaldosCuentasPorPagar(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.saldoscuentasporpagarLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.saldoscuentasporpagarLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,SaldosCuentasPorPagarConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.saldoscuentasporpagarLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncredito_mone_localSaldosCuentasPorPagarBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.saldoscuentasporpagarLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSaldosCuentasPorPagar.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualSaldosCuentasPorPagar(this.getsaldoscuentasporpagar(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysSaldosCuentasPorPagar(this.saldoscuentasporpagar);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.saldoscuentasporpagar =(SaldosCuentasPorPagar) this.saldoscuentasporpagarLogic.getSaldosCuentasPorPagars().toArray()[this.jTableDatosSaldosCuentasPorPagar.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.saldoscuentasporpagar =(SaldosCuentasPorPagar) this.saldoscuentasporpagars.toArray()[this.jTableDatosSaldosCuentasPorPagar.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.saldoscuentasporpagar==null) {
						this.saldoscuentasporpagar = new SaldosCuentasPorPagar();
					}

					this.setVariablesFormularioToObjetoActualSaldosCuentasPorPagar(this.saldoscuentasporpagar,true);
					this.setVariablesFormularioToObjetoActualForeignKeysSaldosCuentasPorPagar(this.saldoscuentasporpagar);
				}

				if(this.saldoscuentasporpagar.getcredito_mone_local()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where credito_mone_local = "+this.saldoscuentasporpagar.getcredito_mone_local().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingSaldosCuentasPorPagar(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.saldoscuentasporpagarLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.saldoscuentasporpagarLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,SaldosCuentasPorPagarConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.saldoscuentasporpagarLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonsaldo_anteriorSaldosCuentasPorPagarBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.saldoscuentasporpagarLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSaldosCuentasPorPagar.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualSaldosCuentasPorPagar(this.getsaldoscuentasporpagar(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysSaldosCuentasPorPagar(this.saldoscuentasporpagar);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.saldoscuentasporpagar =(SaldosCuentasPorPagar) this.saldoscuentasporpagarLogic.getSaldosCuentasPorPagars().toArray()[this.jTableDatosSaldosCuentasPorPagar.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.saldoscuentasporpagar =(SaldosCuentasPorPagar) this.saldoscuentasporpagars.toArray()[this.jTableDatosSaldosCuentasPorPagar.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.saldoscuentasporpagar==null) {
						this.saldoscuentasporpagar = new SaldosCuentasPorPagar();
					}

					this.setVariablesFormularioToObjetoActualSaldosCuentasPorPagar(this.saldoscuentasporpagar,true);
					this.setVariablesFormularioToObjetoActualForeignKeysSaldosCuentasPorPagar(this.saldoscuentasporpagar);
				}

				if(this.saldoscuentasporpagar.getsaldo_anterior()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where saldo_anterior = "+this.saldoscuentasporpagar.getsaldo_anterior().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingSaldosCuentasPorPagar(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.saldoscuentasporpagarLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.saldoscuentasporpagarLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,SaldosCuentasPorPagarConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.saldoscuentasporpagarLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonsaldo_debitoSaldosCuentasPorPagarBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.saldoscuentasporpagarLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSaldosCuentasPorPagar.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualSaldosCuentasPorPagar(this.getsaldoscuentasporpagar(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysSaldosCuentasPorPagar(this.saldoscuentasporpagar);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.saldoscuentasporpagar =(SaldosCuentasPorPagar) this.saldoscuentasporpagarLogic.getSaldosCuentasPorPagars().toArray()[this.jTableDatosSaldosCuentasPorPagar.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.saldoscuentasporpagar =(SaldosCuentasPorPagar) this.saldoscuentasporpagars.toArray()[this.jTableDatosSaldosCuentasPorPagar.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.saldoscuentasporpagar==null) {
						this.saldoscuentasporpagar = new SaldosCuentasPorPagar();
					}

					this.setVariablesFormularioToObjetoActualSaldosCuentasPorPagar(this.saldoscuentasporpagar,true);
					this.setVariablesFormularioToObjetoActualForeignKeysSaldosCuentasPorPagar(this.saldoscuentasporpagar);
				}

				if(this.saldoscuentasporpagar.getsaldo_debito()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where saldo_debito = "+this.saldoscuentasporpagar.getsaldo_debito().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingSaldosCuentasPorPagar(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.saldoscuentasporpagarLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.saldoscuentasporpagarLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,SaldosCuentasPorPagarConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.saldoscuentasporpagarLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonsaldo_creditoSaldosCuentasPorPagarBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.saldoscuentasporpagarLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSaldosCuentasPorPagar.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualSaldosCuentasPorPagar(this.getsaldoscuentasporpagar(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysSaldosCuentasPorPagar(this.saldoscuentasporpagar);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.saldoscuentasporpagar =(SaldosCuentasPorPagar) this.saldoscuentasporpagarLogic.getSaldosCuentasPorPagars().toArray()[this.jTableDatosSaldosCuentasPorPagar.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.saldoscuentasporpagar =(SaldosCuentasPorPagar) this.saldoscuentasporpagars.toArray()[this.jTableDatosSaldosCuentasPorPagar.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.saldoscuentasporpagar==null) {
						this.saldoscuentasporpagar = new SaldosCuentasPorPagar();
					}

					this.setVariablesFormularioToObjetoActualSaldosCuentasPorPagar(this.saldoscuentasporpagar,true);
					this.setVariablesFormularioToObjetoActualForeignKeysSaldosCuentasPorPagar(this.saldoscuentasporpagar);
				}

				if(this.saldoscuentasporpagar.getsaldo_credito()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where saldo_credito = "+this.saldoscuentasporpagar.getsaldo_credito().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingSaldosCuentasPorPagar(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.saldoscuentasporpagarLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.saldoscuentasporpagarLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,SaldosCuentasPorPagarConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.saldoscuentasporpagarLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonBusquedaSaldosCuentasPorPagarSaldosCuentasPorPagarActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldoscuentasporpagarLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingSaldosCuentasPorPagar(false,false);

			this.getSaldosCuentasPorPagarsBusquedaSaldosCuentasPorPagar();

			this.inicializarActualizarBindingSaldosCuentasPorPagar(false);

			//if(SaldosCuentasPorPagarBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingSaldosCuentasPorPagar(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldoscuentasporpagarLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldoscuentasporpagarLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,SaldosCuentasPorPagarConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldoscuentasporpagarLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdClienteSaldosCuentasPorPagarActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldoscuentasporpagarLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingSaldosCuentasPorPagar(false,false);

			this.getSaldosCuentasPorPagarsFK_IdCliente();

			this.inicializarActualizarBindingSaldosCuentasPorPagar(false);

			//if(SaldosCuentasPorPagarBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingSaldosCuentasPorPagar(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldoscuentasporpagarLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldoscuentasporpagarLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,SaldosCuentasPorPagarConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldoscuentasporpagarLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaSaldosCuentasPorPagarActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldoscuentasporpagarLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingSaldosCuentasPorPagar(false,false);

			this.getSaldosCuentasPorPagarsFK_IdEmpresa();

			this.inicializarActualizarBindingSaldosCuentasPorPagar(false);

			//if(SaldosCuentasPorPagarBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingSaldosCuentasPorPagar(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldoscuentasporpagarLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldoscuentasporpagarLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,SaldosCuentasPorPagarConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldoscuentasporpagarLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdGrupoClienteSaldosCuentasPorPagarActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldoscuentasporpagarLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingSaldosCuentasPorPagar(false,false);

			this.getSaldosCuentasPorPagarsFK_IdGrupoCliente();

			this.inicializarActualizarBindingSaldosCuentasPorPagar(false);

			//if(SaldosCuentasPorPagarBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingSaldosCuentasPorPagar(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldoscuentasporpagarLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldoscuentasporpagarLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,SaldosCuentasPorPagarConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldoscuentasporpagarLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdSucursalSaldosCuentasPorPagarActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldoscuentasporpagarLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingSaldosCuentasPorPagar(false,false);

			this.getSaldosCuentasPorPagarsFK_IdSucursal();

			this.inicializarActualizarBindingSaldosCuentasPorPagar(false);

			//if(SaldosCuentasPorPagarBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingSaldosCuentasPorPagar(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldoscuentasporpagarLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldoscuentasporpagarLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,SaldosCuentasPorPagarConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldoscuentasporpagarLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdZonaSaldosCuentasPorPagarActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldoscuentasporpagarLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingSaldosCuentasPorPagar(false,false);

			this.getSaldosCuentasPorPagarsFK_IdZona();

			this.inicializarActualizarBindingSaldosCuentasPorPagar(false);

			//if(SaldosCuentasPorPagarBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingSaldosCuentasPorPagar(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldoscuentasporpagarLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldoscuentasporpagarLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,SaldosCuentasPorPagarConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldoscuentasporpagarLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameSaldosCuentasPorPagar() {
		if(this.jInternalFrameDetalleFormSaldosCuentasPorPagar!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormSaldosCuentasPorPagar!=null) {
			this.jInternalFrameDetalleFormSaldosCuentasPorPagar.setVisible(false);	    			
			this.jInternalFrameDetalleFormSaldosCuentasPorPagar.dispose();
			this.jInternalFrameDetalleFormSaldosCuentasPorPagar=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoSaldosCuentasPorPagar!=null) {
			this.jInternalFrameReporteDinamicoSaldosCuentasPorPagar.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoSaldosCuentasPorPagar.dispose();
			this.jInternalFrameReporteDinamicoSaldosCuentasPorPagar=null;
		}
		
		if(this.jInternalFrameImportacionSaldosCuentasPorPagar!=null) {
			this.jInternalFrameImportacionSaldosCuentasPorPagar.setVisible(false);	    			
			this.jInternalFrameImportacionSaldosCuentasPorPagar.dispose();
			this.jInternalFrameImportacionSaldosCuentasPorPagar=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessSaldosCuentasPorPagar();
			
			SaldosCuentasPorPagarBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.saldoscuentasporpagar,new Object(),this.saldoscuentasporpagarParameterGeneral,this.saldoscuentasporpagarReturnGeneral);
			
			
			if(sTipo.equals("NuevoSaldosCuentasPorPagar")) {
				jButtonNuevoSaldosCuentasPorPagarActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarSaldosCuentasPorPagar")) {
				jButtonDuplicarSaldosCuentasPorPagarActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarSaldosCuentasPorPagar")) {
				jButtonCopiarSaldosCuentasPorPagarActionPerformed(evt);
			} else if(sTipo.equals("VerFormSaldosCuentasPorPagar")) {
				jButtonVerFormSaldosCuentasPorPagarActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarSaldosCuentasPorPagar")) {
				jButtonNuevoSaldosCuentasPorPagarActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarSaldosCuentasPorPagar")) {
				jButtonDuplicarSaldosCuentasPorPagarActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoSaldosCuentasPorPagar")) {
				jButtonNuevoSaldosCuentasPorPagarActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarSaldosCuentasPorPagar")) {
				jButtonDuplicarSaldosCuentasPorPagarActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesSaldosCuentasPorPagar")) {
				jButtonNuevoSaldosCuentasPorPagarActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarSaldosCuentasPorPagar")) {
				jButtonNuevoSaldosCuentasPorPagarActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesSaldosCuentasPorPagar")) {
				jButtonNuevoSaldosCuentasPorPagarActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarSaldosCuentasPorPagar")) {
				jButtonModificarSaldosCuentasPorPagarActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarSaldosCuentasPorPagar")) {
				jButtonModificarSaldosCuentasPorPagarActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarSaldosCuentasPorPagar")) {
				jButtonModificarSaldosCuentasPorPagarActionPerformed(evt);
			} else if(sTipo.equals("ActualizarSaldosCuentasPorPagar")) {
				jButtonActualizarSaldosCuentasPorPagarActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarSaldosCuentasPorPagar")) {
				jButtonActualizarSaldosCuentasPorPagarActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarSaldosCuentasPorPagar")) {
				jButtonActualizarSaldosCuentasPorPagarActionPerformed(evt);
			} else if(sTipo.equals("EliminarSaldosCuentasPorPagar")) {
				jButtonEliminarSaldosCuentasPorPagarActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarSaldosCuentasPorPagar")) {
				jButtonEliminarSaldosCuentasPorPagarActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarSaldosCuentasPorPagar")) {
				jButtonEliminarSaldosCuentasPorPagarActionPerformed(evt);
			} else if(sTipo.equals("CancelarSaldosCuentasPorPagar")) {
				jButtonCancelarSaldosCuentasPorPagarActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarSaldosCuentasPorPagar")) {
				jButtonCancelarSaldosCuentasPorPagarActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarSaldosCuentasPorPagar")) {
				jButtonCancelarSaldosCuentasPorPagarActionPerformed(evt);
			} else if(sTipo.equals("CerrarSaldosCuentasPorPagar")) {
				jButtonCerrarSaldosCuentasPorPagarActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarSaldosCuentasPorPagar")) {
				jButtonCerrarSaldosCuentasPorPagarActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarSaldosCuentasPorPagar")) {
				jButtonCerrarSaldosCuentasPorPagarActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarSaldosCuentasPorPagar")) {
				jButtonMostrarOcultarSaldosCuentasPorPagarActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarSaldosCuentasPorPagar")) {
				jButtonCancelarSaldosCuentasPorPagarActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosSaldosCuentasPorPagar")) {
				jButtonGuardarCambiosSaldosCuentasPorPagarActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarSaldosCuentasPorPagar")) {
				jButtonGuardarCambiosSaldosCuentasPorPagarActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarSaldosCuentasPorPagar")) {
				jButtonCopiarSaldosCuentasPorPagarActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarSaldosCuentasPorPagar")) {
				jButtonVerFormSaldosCuentasPorPagarActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosSaldosCuentasPorPagar")) {
				jButtonGuardarCambiosSaldosCuentasPorPagarActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarSaldosCuentasPorPagar")) {
				jButtonCopiarSaldosCuentasPorPagarActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormSaldosCuentasPorPagar")) {
				jButtonVerFormSaldosCuentasPorPagarActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaSaldosCuentasPorPagar")) {
				jButtonGuardarCambiosSaldosCuentasPorPagarActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarSaldosCuentasPorPagar")) {
				jButtonGuardarCambiosSaldosCuentasPorPagarActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaSaldosCuentasPorPagar")) {
				jButtonGuardarCambiosSaldosCuentasPorPagarActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionSaldosCuentasPorPagar")) {
				jButtonRecargarInformacionSaldosCuentasPorPagarActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarSaldosCuentasPorPagar")) {
				jButtonRecargarInformacionSaldosCuentasPorPagarActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionSaldosCuentasPorPagar")) {
				jButtonRecargarInformacionSaldosCuentasPorPagarActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresSaldosCuentasPorPagar")) {
				jButtonAnterioresSaldosCuentasPorPagarActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarSaldosCuentasPorPagar")) {
				jButtonAnterioresSaldosCuentasPorPagarActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreSaldosCuentasPorPagar")) {
				jButtonAnterioresSaldosCuentasPorPagarActionPerformed(evt);
			} else if(sTipo.equals("SiguientesSaldosCuentasPorPagar")) {
				jButtonSiguientesSaldosCuentasPorPagarActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarSaldosCuentasPorPagar")) {
				jButtonSiguientesSaldosCuentasPorPagarActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesSaldosCuentasPorPagar")) {
				jButtonSiguientesSaldosCuentasPorPagarActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderBySaldosCuentasPorPagar") || sTipo.equals("MenuItemDetalleAbrirOrderBySaldosCuentasPorPagar")) {
				jButtonAbrirOrderBySaldosCuentasPorPagarActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarSaldosCuentasPorPagar") || sTipo.equals("MenuItemDetalleMostrarOcultarSaldosCuentasPorPagar")) {
				jButtonMostrarOcultarSaldosCuentasPorPagarActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosSaldosCuentasPorPagar")) {
				jButtonNuevoGuardarCambiosSaldosCuentasPorPagarActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarSaldosCuentasPorPagar")) {
				jButtonNuevoGuardarCambiosSaldosCuentasPorPagarActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosSaldosCuentasPorPagar")) {
				jButtonNuevoGuardarCambiosSaldosCuentasPorPagarActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoSaldosCuentasPorPagar")) {
				jButtonCerrarReporteDinamicoSaldosCuentasPorPagarActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoSaldosCuentasPorPagar")) {
				jButtonGenerarReporteDinamicoSaldosCuentasPorPagarActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoSaldosCuentasPorPagar")) {
				
				jButtonGenerarExcelReporteDinamicoSaldosCuentasPorPagarActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionSaldosCuentasPorPagar")) {
				jButtonCerrarImportacionSaldosCuentasPorPagarActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionSaldosCuentasPorPagar")) {
				
				jButtonGenerarImportacionSaldosCuentasPorPagarActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionSaldosCuentasPorPagar")) {
				
				jButtonAbrirImportacionSaldosCuentasPorPagarActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesSaldosCuentasPorPagar")) {
				jComboBoxTiposAccionesSaldosCuentasPorPagarActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesSaldosCuentasPorPagar")) {
				jComboBoxTiposRelacionesSaldosCuentasPorPagarActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioSaldosCuentasPorPagar")) {
				jComboBoxTiposAccionesSaldosCuentasPorPagarActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarSaldosCuentasPorPagar")) {
				
				jComboBoxTiposSeleccionarSaldosCuentasPorPagarActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralSaldosCuentasPorPagar")) {
				jTextFieldValorCampoGeneralSaldosCuentasPorPagarActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderBySaldosCuentasPorPagar")) {
				jButtonAbrirOrderBySaldosCuentasPorPagarActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarSaldosCuentasPorPagar")) {
				jButtonAbrirOrderBySaldosCuentasPorPagarActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderBySaldosCuentasPorPagar")) {
				jButtonCerrarOrderBySaldosCuentasPorPagarActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idSaldosCuentasPorPagarBusqueda")) {
				this.jButtonidSaldosCuentasPorPagarBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_zonaSaldosCuentasPorPagarUpdate")) {
				this.jButtonid_zonaSaldosCuentasPorPagarUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_zonaSaldosCuentasPorPagarBusqueda")) {
				this.jButtonid_zonaSaldosCuentasPorPagarBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_grupo_clienteSaldosCuentasPorPagarUpdate")) {
				this.jButtonid_grupo_clienteSaldosCuentasPorPagarUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_grupo_clienteSaldosCuentasPorPagarBusqueda")) {
				this.jButtonid_grupo_clienteSaldosCuentasPorPagarBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaSaldosCuentasPorPagarUpdate")) {
				this.jButtonid_empresaSaldosCuentasPorPagarUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaSaldosCuentasPorPagarBusqueda")) {
				this.jButtonid_empresaSaldosCuentasPorPagarBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalSaldosCuentasPorPagarUpdate")) {
				this.jButtonid_sucursalSaldosCuentasPorPagarUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalSaldosCuentasPorPagarBusqueda")) {
				this.jButtonid_sucursalSaldosCuentasPorPagarBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_clienteSaldosCuentasPorPagarUpdate")) {
				this.jButtonid_clienteSaldosCuentasPorPagarUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_clienteSaldosCuentasPorPagarBusqueda")) {
				this.jButtonid_clienteSaldosCuentasPorPagarBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_emision_hastaSaldosCuentasPorPagarBusqueda")) {
				this.jButtonfecha_emision_hastaSaldosCuentasPorPagarBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoSaldosCuentasPorPagarBusqueda")) {
				this.jButtoncodigoSaldosCuentasPorPagarBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_completoSaldosCuentasPorPagarBusqueda")) {
				this.jButtonnombre_completoSaldosCuentasPorPagarBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("debito_mone_localSaldosCuentasPorPagarBusqueda")) {
				this.jButtondebito_mone_localSaldosCuentasPorPagarBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("credito_mone_localSaldosCuentasPorPagarBusqueda")) {
				this.jButtoncredito_mone_localSaldosCuentasPorPagarBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("saldo_anteriorSaldosCuentasPorPagarBusqueda")) {
				this.jButtonsaldo_anteriorSaldosCuentasPorPagarBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("saldo_debitoSaldosCuentasPorPagarBusqueda")) {
				this.jButtonsaldo_debitoSaldosCuentasPorPagarBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("saldo_creditoSaldosCuentasPorPagarBusqueda")) {
				this.jButtonsaldo_creditoSaldosCuentasPorPagarBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("BusquedaSaldosCuentasPorPagarSaldosCuentasPorPagar")) {
				this.jButtonBusquedaSaldosCuentasPorPagarSaldosCuentasPorPagarActionPerformed(evt);
			}
			
			;
			
			
			SaldosCuentasPorPagarBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.saldoscuentasporpagar,new Object(),this.saldoscuentasporpagarParameterGeneral,this.saldoscuentasporpagarReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SaldosCuentasPorPagarConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessSaldosCuentasPorPagar();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaSaldosCuentasPorPagarActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.saldoscuentasporpagar);
				
				this.actualizarInformacion("INFO_PADRE",false,this.saldoscuentasporpagar);
				
				SaldosCuentasPorPagarBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.saldoscuentasporpagar,new Object(),this.saldoscuentasporpagarParameterGeneral,this.saldoscuentasporpagarReturnGeneral);
				
				


				
				SaldosCuentasPorPagarBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.saldoscuentasporpagar,new Object(),this.saldoscuentasporpagarParameterGeneral,this.saldoscuentasporpagarReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(SaldosCuentasPorPagar.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",SaldosCuentasPorPagar.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,SaldosCuentasPorPagarConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			SaldosCuentasPorPagar saldoscuentasporpagarLocal=null;
			
			if(!this.getEsControlTabla()) {
				saldoscuentasporpagarLocal=this.saldoscuentasporpagar;
			} else {
				saldoscuentasporpagarLocal=this.saldoscuentasporpagarAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SaldosCuentasPorPagarConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.saldoscuentasporpagar);
				
				this.actualizarInformacion("INFO_PADRE",false,this.saldoscuentasporpagar);
				
				SaldosCuentasPorPagarBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.saldoscuentasporpagar,new Object(),this.saldoscuentasporpagarParameterGeneral,this.saldoscuentasporpagarReturnGeneral);
							
				
				


				
				SaldosCuentasPorPagarBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.saldoscuentasporpagar,new Object(),this.saldoscuentasporpagarParameterGeneral,this.saldoscuentasporpagarReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(SaldosCuentasPorPagar.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",SaldosCuentasPorPagar.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SaldosCuentasPorPagarConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaSaldosCuentasPorPagarActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosSaldosCuentasPorPagar.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.saldoscuentasporpagarAnterior =(SaldosCuentasPorPagar) this.saldoscuentasporpagarLogic.getSaldosCuentasPorPagars().toArray()[this.jTableDatosSaldosCuentasPorPagar.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.saldoscuentasporpagarAnterior =(SaldosCuentasPorPagar) this.saldoscuentasporpagars.toArray()[this.jTableDatosSaldosCuentasPorPagar.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SaldosCuentasPorPagarConstantesFunciones.CLASSNAME);
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
			
			SaldosCuentasPorPagarBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.saldoscuentasporpagar,new Object(),this.saldoscuentasporpagarParameterGeneral,this.saldoscuentasporpagarReturnGeneral);
			
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
			
			


			
			SaldosCuentasPorPagarBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.saldoscuentasporpagar,new Object(),this.saldoscuentasporpagarParameterGeneral,this.saldoscuentasporpagarReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SaldosCuentasPorPagarConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SaldosCuentasPorPagarConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SaldosCuentasPorPagarConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaSaldosCuentasPorPagarActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.saldoscuentasporpagar);
				
				this.actualizarInformacion("INFO_PADRE",false,this.saldoscuentasporpagar);
				
				SaldosCuentasPorPagarBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.saldoscuentasporpagar,new Object(),this.saldoscuentasporpagarParameterGeneral,this.saldoscuentasporpagarReturnGeneral);
								
						
				


				
				SaldosCuentasPorPagarBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.saldoscuentasporpagar,new Object(),this.saldoscuentasporpagarParameterGeneral,this.saldoscuentasporpagarReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(SaldosCuentasPorPagar.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",SaldosCuentasPorPagar.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SaldosCuentasPorPagarConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.saldoscuentasporpagar);
				
				this.actualizarInformacion("INFO_PADRE",false,this.saldoscuentasporpagar);
				
				SaldosCuentasPorPagarBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.saldoscuentasporpagar,new Object(),this.saldoscuentasporpagarParameterGeneral,this.saldoscuentasporpagarReturnGeneral);
								
				
				


				
				SaldosCuentasPorPagarBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.saldoscuentasporpagar,new Object(),this.saldoscuentasporpagarParameterGeneral,this.saldoscuentasporpagarReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(SaldosCuentasPorPagar.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",SaldosCuentasPorPagar.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SaldosCuentasPorPagarConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaSaldosCuentasPorPagarActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosSaldosCuentasPorPagar.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.saldoscuentasporpagarAnterior =(SaldosCuentasPorPagar) this.saldoscuentasporpagarLogic.getSaldosCuentasPorPagars().toArray()[this.jTableDatosSaldosCuentasPorPagar.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.saldoscuentasporpagarAnterior =(SaldosCuentasPorPagar) this.saldoscuentasporpagars.toArray()[this.jTableDatosSaldosCuentasPorPagar.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SaldosCuentasPorPagarConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.saldoscuentasporpagar);
				
				this.actualizarInformacion("INFO_PADRE",false,this.saldoscuentasporpagar);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SaldosCuentasPorPagarConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaSaldosCuentasPorPagarActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosSaldosCuentasPorPagar.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.saldoscuentasporpagarAnterior =(SaldosCuentasPorPagar) this.saldoscuentasporpagarLogic.getSaldosCuentasPorPagars().toArray()[this.jTableDatosSaldosCuentasPorPagar.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.saldoscuentasporpagarAnterior =(SaldosCuentasPorPagar) this.saldoscuentasporpagars.toArray()[this.jTableDatosSaldosCuentasPorPagar.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SaldosCuentasPorPagarConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaSaldosCuentasPorPagarActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.saldoscuentasporpagar);
			
			this.actualizarInformacion("INFO_PADRE",false,this.saldoscuentasporpagar);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SaldosCuentasPorPagarConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.saldoscuentasporpagar);
				
				this.actualizarInformacion("INFO_PADRE",false,this.saldoscuentasporpagar);
				
				SaldosCuentasPorPagarBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.saldoscuentasporpagar,new Object(),this.saldoscuentasporpagarParameterGeneral,this.saldoscuentasporpagarReturnGeneral);
							
				
				


				
				SaldosCuentasPorPagarBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.saldoscuentasporpagar,new Object(),this.saldoscuentasporpagarParameterGeneral,this.saldoscuentasporpagarReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(SaldosCuentasPorPagar.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",SaldosCuentasPorPagar.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SaldosCuentasPorPagarConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaSaldosCuentasPorPagarActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosSaldosCuentasPorPagar.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.saldoscuentasporpagarAnterior =(SaldosCuentasPorPagar) this.saldoscuentasporpagarLogic.getSaldosCuentasPorPagars().toArray()[this.jTableDatosSaldosCuentasPorPagar.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.saldoscuentasporpagarAnterior =(SaldosCuentasPorPagar) this.saldoscuentasporpagars.toArray()[this.jTableDatosSaldosCuentasPorPagar.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SaldosCuentasPorPagarConstantesFunciones.CLASSNAME);
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
			
			SaldosCuentasPorPagarBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.saldoscuentasporpagar,new Object(),this.saldoscuentasporpagarParameterGeneral,this.saldoscuentasporpagarReturnGeneral);
			
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
			
			


			
			SaldosCuentasPorPagarBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.saldoscuentasporpagar,new Object(),this.saldoscuentasporpagarParameterGeneral,this.saldoscuentasporpagarReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SaldosCuentasPorPagarConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SaldosCuentasPorPagarConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SaldosCuentasPorPagarConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaSaldosCuentasPorPagarActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.saldoscuentasporpagar);
			
			this.actualizarInformacion("INFO_PADRE",false,this.saldoscuentasporpagar);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SaldosCuentasPorPagarConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.saldoscuentasporpagar);
				
				this.actualizarInformacion("INFO_PADRE",false,this.saldoscuentasporpagar);
				
				SaldosCuentasPorPagarBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.saldoscuentasporpagar,new Object(),this.saldoscuentasporpagarParameterGeneral,this.saldoscuentasporpagarReturnGeneral);
								
				
				


				
				SaldosCuentasPorPagarBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.saldoscuentasporpagar,new Object(),this.saldoscuentasporpagarParameterGeneral,this.saldoscuentasporpagarReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(SaldosCuentasPorPagar.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",SaldosCuentasPorPagar.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SaldosCuentasPorPagarConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaSaldosCuentasPorPagarActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosSaldosCuentasPorPagar.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.saldoscuentasporpagarAnterior =(SaldosCuentasPorPagar) this.saldoscuentasporpagarLogic.getSaldosCuentasPorPagars().toArray()[this.jTableDatosSaldosCuentasPorPagar.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.saldoscuentasporpagarAnterior =(SaldosCuentasPorPagar) this.saldoscuentasporpagars.toArray()[this.jTableDatosSaldosCuentasPorPagar.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SaldosCuentasPorPagarConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaSaldosCuentasPorPagarActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.saldoscuentasporpagar);
			
			this.actualizarInformacion("INFO_PADRE",false,this.saldoscuentasporpagar);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SaldosCuentasPorPagarConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaSaldosCuentasPorPagarActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.saldoscuentasporpagar);
				
				this.actualizarInformacion("INFO_PADRE",false,this.saldoscuentasporpagar);
				
				SaldosCuentasPorPagarBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.saldoscuentasporpagar,new Object(),this.saldoscuentasporpagarParameterGeneral,this.saldoscuentasporpagarReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosSaldosCuentasPorPagar")) {
					jCheckBoxSeleccionarTodosSaldosCuentasPorPagarItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosSaldosCuentasPorPagar")) {
					jCheckBoxSeleccionadosSaldosCuentasPorPagarItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarSaldosCuentasPorPagar")) {
					
				}
				
				


				
				
				SaldosCuentasPorPagarBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.saldoscuentasporpagar,new Object(),this.saldoscuentasporpagarParameterGeneral,this.saldoscuentasporpagarReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(SaldosCuentasPorPagar.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",SaldosCuentasPorPagar.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SaldosCuentasPorPagarConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.saldoscuentasporpagar);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.saldoscuentasporpagar);
				
				SaldosCuentasPorPagarBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.saldoscuentasporpagar,new Object(),this.saldoscuentasporpagarParameterGeneral,this.saldoscuentasporpagarReturnGeneral);
												
				
				


				
				
				SaldosCuentasPorPagarBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.saldoscuentasporpagar,new Object(),this.saldoscuentasporpagarParameterGeneral,this.saldoscuentasporpagarReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(SaldosCuentasPorPagar.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",SaldosCuentasPorPagar.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SaldosCuentasPorPagarConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaSaldosCuentasPorPagarActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosSaldosCuentasPorPagar.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.saldoscuentasporpagarAnterior =(SaldosCuentasPorPagar) this.saldoscuentasporpagarLogic.getSaldosCuentasPorPagars().toArray()[this.jTableDatosSaldosCuentasPorPagar.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.saldoscuentasporpagarAnterior =(SaldosCuentasPorPagar) this.saldoscuentasporpagars.toArray()[this.jTableDatosSaldosCuentasPorPagar.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SaldosCuentasPorPagarConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaSaldosCuentasPorPagarActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.saldoscuentasporpagar);
				
				this.actualizarInformacion("INFO_PADRE",false,this.saldoscuentasporpagar);
				
				SaldosCuentasPorPagarBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.saldoscuentasporpagar,new Object(),this.saldoscuentasporpagarParameterGeneral,this.saldoscuentasporpagarReturnGeneral);
				
				
				SaldosCuentasPorPagarBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.saldoscuentasporpagar,new Object(),this.saldoscuentasporpagarParameterGeneral,this.saldoscuentasporpagarReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SaldosCuentasPorPagarConstantesFunciones.CLASSNAME);
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
			
			SaldosCuentasPorPagarBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.saldoscuentasporpagar,new Object(),this.saldoscuentasporpagarParameterGeneral,this.saldoscuentasporpagarReturnGeneral);
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
			
			


			
			SaldosCuentasPorPagarBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.saldoscuentasporpagar,new Object(),this.saldoscuentasporpagarParameterGeneral,this.saldoscuentasporpagarReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SaldosCuentasPorPagarConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaSaldosCuentasPorPagarActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.saldoscuentasporpagar);
				
				this.actualizarInformacion("INFO_PADRE",false,this.saldoscuentasporpagar);
				
				SaldosCuentasPorPagarBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.saldoscuentasporpagar,new Object(),this.saldoscuentasporpagarParameterGeneral,this.saldoscuentasporpagarReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				SaldosCuentasPorPagarBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.saldoscuentasporpagar,new Object(),this.saldoscuentasporpagarParameterGeneral,this.saldoscuentasporpagarReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(SaldosCuentasPorPagar.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",SaldosCuentasPorPagar.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SaldosCuentasPorPagarConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.saldoscuentasporpagar);
				
				this.actualizarInformacion("INFO_PADRE",false,this.saldoscuentasporpagar);
				
				SaldosCuentasPorPagarBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.saldoscuentasporpagar,new Object(),this.saldoscuentasporpagarParameterGeneral,this.saldoscuentasporpagarReturnGeneral);
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
				
				


				
				SaldosCuentasPorPagarBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.saldoscuentasporpagar,new Object(),this.saldoscuentasporpagarParameterGeneral,this.saldoscuentasporpagarReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(SaldosCuentasPorPagar.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",SaldosCuentasPorPagar.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SaldosCuentasPorPagarConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaSaldosCuentasPorPagarActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosSaldosCuentasPorPagar.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.saldoscuentasporpagarAnterior =(SaldosCuentasPorPagar) this.saldoscuentasporpagarLogic.getSaldosCuentasPorPagars().toArray()[this.jTableDatosSaldosCuentasPorPagar.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.saldoscuentasporpagarAnterior =(SaldosCuentasPorPagar) this.saldoscuentasporpagars.toArray()[this.jTableDatosSaldosCuentasPorPagar.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SaldosCuentasPorPagarConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				SaldosCuentasPorPagarBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.saldoscuentasporpagar,new Object(),this.saldoscuentasporpagarParameterGeneral,this.saldoscuentasporpagarReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarSaldosCuentasPorPagar")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosSaldosCuentasPorPagarListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosSaldosCuentasPorPagar.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.saldoscuentasporpagar =(SaldosCuentasPorPagar) this.saldoscuentasporpagarLogic.getSaldosCuentasPorPagars().toArray()[this.jTableDatosSaldosCuentasPorPagar.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.saldoscuentasporpagar =(SaldosCuentasPorPagar) this.saldoscuentasporpagars.toArray()[this.jTableDatosSaldosCuentasPorPagar.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.saldoscuentasporpagar);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarSaldosCuentasPorPagar")) {
				
				}
				
				SaldosCuentasPorPagarBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.saldoscuentasporpagar,new Object(),this.saldoscuentasporpagarParameterGeneral,this.saldoscuentasporpagarReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SaldosCuentasPorPagarConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			SaldosCuentasPorPagarBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.saldoscuentasporpagar,new Object(),this.saldoscuentasporpagarParameterGeneral,this.saldoscuentasporpagarReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarSaldosCuentasPorPagar")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosSaldosCuentasPorPagar.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarSaldosCuentasPorPagar")) {
			
			}
			
			SaldosCuentasPorPagarBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.saldoscuentasporpagar,new Object(),this.saldoscuentasporpagarParameterGeneral,this.saldoscuentasporpagarReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SaldosCuentasPorPagarConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessSaldosCuentasPorPagar();
			
			SaldosCuentasPorPagarBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.saldoscuentasporpagar,new Object(),this.saldoscuentasporpagarParameterGeneral,this.saldoscuentasporpagarReturnGeneral);
			
			if(sTipo.equals("NuevoSaldosCuentasPorPagar")) {
				jButtonNuevoSaldosCuentasPorPagarActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarSaldosCuentasPorPagar")) {
				jButtonDuplicarSaldosCuentasPorPagarActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarSaldosCuentasPorPagar")) {
				jButtonCopiarSaldosCuentasPorPagarActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormSaldosCuentasPorPagar")) {
				jButtonVerFormSaldosCuentasPorPagarActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesSaldosCuentasPorPagar")) {
				jButtonNuevoSaldosCuentasPorPagarActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarSaldosCuentasPorPagar")) {
				jButtonModificarSaldosCuentasPorPagarActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarSaldosCuentasPorPagar")) {
				jButtonActualizarSaldosCuentasPorPagarActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarSaldosCuentasPorPagar")) {
				jButtonEliminarSaldosCuentasPorPagarActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaSaldosCuentasPorPagar")) {
				jButtonGuardarCambiosSaldosCuentasPorPagarActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarSaldosCuentasPorPagar")) {
				jButtonCancelarSaldosCuentasPorPagarActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarSaldosCuentasPorPagar")) {
				jButtonCerrarSaldosCuentasPorPagarActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosSaldosCuentasPorPagar")) {
				jButtonGuardarCambiosSaldosCuentasPorPagarActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosSaldosCuentasPorPagar")) {
				jButtonNuevoGuardarCambiosSaldosCuentasPorPagarActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderBySaldosCuentasPorPagar")) {
				jButtonAbrirOrderBySaldosCuentasPorPagarActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionSaldosCuentasPorPagar")) {
				jButtonRecargarInformacionSaldosCuentasPorPagarActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresSaldosCuentasPorPagar")) {
				jButtonAnterioresSaldosCuentasPorPagarActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesSaldosCuentasPorPagar")) {
				jButtonSiguientesSaldosCuentasPorPagarActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idSaldosCuentasPorPagarBusqueda")) {
				this.jButtonidSaldosCuentasPorPagarBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_zonaSaldosCuentasPorPagarUpdate")) {
				this.jButtonid_zonaSaldosCuentasPorPagarUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_zonaSaldosCuentasPorPagarBusqueda")) {
				this.jButtonid_zonaSaldosCuentasPorPagarBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_grupo_clienteSaldosCuentasPorPagarUpdate")) {
				this.jButtonid_grupo_clienteSaldosCuentasPorPagarUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_grupo_clienteSaldosCuentasPorPagarBusqueda")) {
				this.jButtonid_grupo_clienteSaldosCuentasPorPagarBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaSaldosCuentasPorPagarUpdate")) {
				this.jButtonid_empresaSaldosCuentasPorPagarUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaSaldosCuentasPorPagarBusqueda")) {
				this.jButtonid_empresaSaldosCuentasPorPagarBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalSaldosCuentasPorPagarUpdate")) {
				this.jButtonid_sucursalSaldosCuentasPorPagarUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalSaldosCuentasPorPagarBusqueda")) {
				this.jButtonid_sucursalSaldosCuentasPorPagarBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_clienteSaldosCuentasPorPagarUpdate")) {
				this.jButtonid_clienteSaldosCuentasPorPagarUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_clienteSaldosCuentasPorPagarBusqueda")) {
				this.jButtonid_clienteSaldosCuentasPorPagarBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_emision_hastaSaldosCuentasPorPagarBusqueda")) {
				this.jButtonfecha_emision_hastaSaldosCuentasPorPagarBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoSaldosCuentasPorPagarBusqueda")) {
				this.jButtoncodigoSaldosCuentasPorPagarBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_completoSaldosCuentasPorPagarBusqueda")) {
				this.jButtonnombre_completoSaldosCuentasPorPagarBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("debito_mone_localSaldosCuentasPorPagarBusqueda")) {
				this.jButtondebito_mone_localSaldosCuentasPorPagarBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("credito_mone_localSaldosCuentasPorPagarBusqueda")) {
				this.jButtoncredito_mone_localSaldosCuentasPorPagarBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("saldo_anteriorSaldosCuentasPorPagarBusqueda")) {
				this.jButtonsaldo_anteriorSaldosCuentasPorPagarBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("saldo_debitoSaldosCuentasPorPagarBusqueda")) {
				this.jButtonsaldo_debitoSaldosCuentasPorPagarBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("saldo_creditoSaldosCuentasPorPagarBusqueda")) {
				this.jButtonsaldo_creditoSaldosCuentasPorPagarBusquedaActionPerformed(evt);
			}
			
			SaldosCuentasPorPagarBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.saldoscuentasporpagar,new Object(),this.saldoscuentasporpagarParameterGeneral,this.saldoscuentasporpagarReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SaldosCuentasPorPagarConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessSaldosCuentasPorPagar();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			SaldosCuentasPorPagarBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.saldoscuentasporpagar,new Object(),this.saldoscuentasporpagarParameterGeneral,this.saldoscuentasporpagarReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameSaldosCuentasPorPagar")) {
				closingInternalFrameSaldosCuentasPorPagar();
				
			} else if(sTipo.equals("jButtonCancelarSaldosCuentasPorPagar")) {
				JInternalFrameBase jInternalFrameDetalleFormSaldosCuentasPorPagar = (JInternalFrameBase)evt.getSource();
	            	
	            SaldosCuentasPorPagarBeanSwingJInternalFrame jInternalFrameParent=(SaldosCuentasPorPagarBeanSwingJInternalFrame)jInternalFrameDetalleFormSaldosCuentasPorPagar.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarSaldosCuentasPorPagarActionPerformed(null);
			}
			
			SaldosCuentasPorPagarBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.saldoscuentasporpagar,new Object(),this.saldoscuentasporpagarParameterGeneral,this.saldoscuentasporpagarReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SaldosCuentasPorPagarConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormSaldosCuentasPorPagar(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormSaldosCuentasPorPagar(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormSaldosCuentasPorPagar(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.saldoscuentasporpagar)) {
			if(!esControlTabla) {
				if(SaldosCuentasPorPagarJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualSaldosCuentasPorPagar(this.saldoscuentasporpagar,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysSaldosCuentasPorPagar(this.saldoscuentasporpagar);			
				}
				
				if(this.saldoscuentasporpagarSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualSaldosCuentasPorPagar(this.saldoscuentasporpagar,classes);				
				}
			
				if(conIrServidorAplicacion) {
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanSaldosCuentasPorPagar(this.saldoscuentasporpagarReturnGeneral,this.saldoscuentasporpagarBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.saldoscuentasporpagarSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanSaldosCuentasPorPagar(classes,this.saldoscuentasporpagarReturnGeneral,this.saldoscuentasporpagarBean,false);
					}
						
					if(this.saldoscuentasporpagarReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeySaldosCuentasPorPagar(this.saldoscuentasporpagarReturnGeneral.getSaldosCuentasPorPagar());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioSaldosCuentasPorPagar(this.saldoscuentasporpagarReturnGeneral.getSaldosCuentasPorPagar());	
					}
						
					if(this.saldoscuentasporpagarReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioSaldosCuentasPorPagar(this.saldoscuentasporpagarReturnGeneral.getSaldosCuentasPorPagar(),classes);//this.saldoscuentasporpagarBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioSaldosCuentasPorPagar(this.saldoscuentasporpagar,classes);//this.saldoscuentasporpagarBean);									
				}
			
				if(SaldosCuentasPorPagarJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualSaldosCuentasPorPagar(this.saldoscuentasporpagar,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysSaldosCuentasPorPagar(this.saldoscuentasporpagar);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.saldoscuentasporpagarAnterior!=null) {
						this.saldoscuentasporpagar=this.saldoscuentasporpagarAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.saldoscuentasporpagarSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.saldoscuentasporpagarSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.saldoscuentasporpagarReturnGeneral.getSaldosCuentasPorPagar(),saldoscuentasporpagarLogic.getSaldosCuentasPorPagars());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.saldoscuentasporpagarReturnGeneral.getSaldosCuentasPorPagar(),this.saldoscuentasporpagars);
				}
				//ARCHITECTURE
				
				//this.jTableDatosSaldosCuentasPorPagar.repaint();
				
				//((AbstractTableModel) this.jTableDatosSaldosCuentasPorPagar.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosSaldosCuentasPorPagar();
			}
		}
	}
	
	public void actualizarVisualTableDatosSaldosCuentasPorPagar() throws Exception {
		
		SaldosCuentasPorPagarModel saldoscuentasporpagarModel=(SaldosCuentasPorPagarModel)this.jTableDatosSaldosCuentasPorPagar.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			saldoscuentasporpagarModel.saldoscuentasporpagars=this.saldoscuentasporpagarLogic.getSaldosCuentasPorPagars();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			saldoscuentasporpagarModel.saldoscuentasporpagars=this.saldoscuentasporpagars;
		}
		
		
		((SaldosCuentasPorPagarModel) this.jTableDatosSaldosCuentasPorPagar.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaSaldosCuentasPorPagar() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getsaldoscuentasporpagarAnterior(),this.saldoscuentasporpagarLogic.getSaldosCuentasPorPagars());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getsaldoscuentasporpagarAnterior(),this.saldoscuentasporpagars);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosSaldosCuentasPorPagar();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioSaldosCuentasPorPagar(SaldosCuentasPorPagar saldoscuentasporpagar,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SaldosCuentasPorPagarConstantesFunciones.CLASSNAME);
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
										
				SaldosCuentasPorPagarBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.saldoscuentasporpagar,new Object(),generalEntityParameterGeneral,this.saldoscuentasporpagarReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.saldoscuentasporpagarSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=SaldosCuentasPorPagarConstantesFunciones.getClassesRelationshipsOfSaldosCuentasPorPagar(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=SaldosCuentasPorPagarConstantesFunciones.getClassesRelationshipsFromStringsOfSaldosCuentasPorPagar(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormSaldosCuentasPorPagar(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				SaldosCuentasPorPagarBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.saldoscuentasporpagar,new Object(),generalEntityParameterGeneral,this.saldoscuentasporpagarReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SaldosCuentasPorPagarConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioSaldosCuentasPorPagar(SaldosCuentasPorPagarBean saldoscuentasporpagarBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SaldosCuentasPorPagarConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanSaldosCuentasPorPagar(ArrayList<Classe> classes,SaldosCuentasPorPagarReturnGeneral saldoscuentasporpagarReturnGeneral,SaldosCuentasPorPagarBean saldoscuentasporpagarBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualSaldosCuentasPorPagar(SaldosCuentasPorPagar saldoscuentasporpagar,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.saldoscuentasporpagar)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormSaldosCuentasPorPagar = new SaldosCuentasPorPagarDetalleFormJInternalFrame(jDesktopPane,this.saldoscuentasporpagarSessionBean.getConGuardarRelaciones(),this.saldoscuentasporpagarSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormSaldosCuentasPorPagar);
		this.jInternalFrameDetalleFormSaldosCuentasPorPagar.setVisible(false);
		this.jInternalFrameDetalleFormSaldosCuentasPorPagar.setSelected(false);						
		
		this.jInternalFrameDetalleFormSaldosCuentasPorPagar.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormSaldosCuentasPorPagar.saldoscuentasporpagarLogic=this.saldoscuentasporpagarLogic;
		
		this.cargarCombosFrameForeignKeySaldosCuentasPorPagar("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleSaldosCuentasPorPagar();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleSaldosCuentasPorPagar();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeySaldosCuentasPorPagar("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeySaldosCuentasPorPagar();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormSaldosCuentasPorPagar.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarSaldosCuentasPorPagar"));
		
		this.jInternalFrameDetalleFormSaldosCuentasPorPagar.jButtonModificarSaldosCuentasPorPagar.addActionListener(new ButtonActionListener(this,"ModificarSaldosCuentasPorPagar"));

		
		this.jInternalFrameDetalleFormSaldosCuentasPorPagar.jButtonModificarToolBarSaldosCuentasPorPagar.addActionListener(new ButtonActionListener(this,"ModificarToolBarSaldosCuentasPorPagar"));
					
		this.jInternalFrameDetalleFormSaldosCuentasPorPagar.jMenuItemModificarSaldosCuentasPorPagar.addActionListener(new ButtonActionListener(this,"MenuItemModificarSaldosCuentasPorPagar"));		
		
		
		
		this.jInternalFrameDetalleFormSaldosCuentasPorPagar.jButtonActualizarSaldosCuentasPorPagar.addActionListener (new ButtonActionListener(this,"ActualizarSaldosCuentasPorPagar"));
		
		
		this.jInternalFrameDetalleFormSaldosCuentasPorPagar.jButtonActualizarToolBarSaldosCuentasPorPagar.addActionListener(new ButtonActionListener(this,"ActualizarToolBarSaldosCuentasPorPagar"));
						
		this.jInternalFrameDetalleFormSaldosCuentasPorPagar.jMenuItemActualizarSaldosCuentasPorPagar.addActionListener (new ButtonActionListener(this,"MenuItemActualizarSaldosCuentasPorPagar"));		
		
		
		
		this.jInternalFrameDetalleFormSaldosCuentasPorPagar.jButtonEliminarSaldosCuentasPorPagar.addActionListener (new ButtonActionListener(this,"EliminarSaldosCuentasPorPagar"));
		
		
		this.jInternalFrameDetalleFormSaldosCuentasPorPagar.jButtonEliminarToolBarSaldosCuentasPorPagar.addActionListener (new ButtonActionListener(this,"EliminarToolBarSaldosCuentasPorPagar"));
								
		this.jInternalFrameDetalleFormSaldosCuentasPorPagar.jMenuItemEliminarSaldosCuentasPorPagar.addActionListener (new ButtonActionListener(this,"MenuItemEliminarSaldosCuentasPorPagar"));		
		
		
		
		this.jInternalFrameDetalleFormSaldosCuentasPorPagar.jButtonCancelarSaldosCuentasPorPagar.addActionListener (new ButtonActionListener(this,"CancelarSaldosCuentasPorPagar"));
		
		
		this.jInternalFrameDetalleFormSaldosCuentasPorPagar.jButtonCancelarToolBarSaldosCuentasPorPagar.addActionListener (new ButtonActionListener(this,"CancelarToolBarSaldosCuentasPorPagar"));
					
		this.jInternalFrameDetalleFormSaldosCuentasPorPagar.jMenuItemCancelarSaldosCuentasPorPagar.addActionListener (new ButtonActionListener(this,"MenuItemCancelarSaldosCuentasPorPagar"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormSaldosCuentasPorPagar.jMenuItemDetalleCerrarSaldosCuentasPorPagar.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarSaldosCuentasPorPagar"));		
		
		
		
		this.jInternalFrameDetalleFormSaldosCuentasPorPagar.jButtonGuardarCambiosToolBarSaldosCuentasPorPagar.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarSaldosCuentasPorPagar"));
		
		
		
		this.jInternalFrameDetalleFormSaldosCuentasPorPagar.jButtonGuardarCambiosToolBarSaldosCuentasPorPagar.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarSaldosCuentasPorPagar"));
		
		
		
		this.jInternalFrameDetalleFormSaldosCuentasPorPagar.jComboBoxTiposAccionesFormularioSaldosCuentasPorPagar.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioSaldosCuentasPorPagar"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSaldosCuentasPorPagar.jButtonidSaldosCuentasPorPagarBusqueda.addActionListener(new ButtonActionListener(this,"idSaldosCuentasPorPagarBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormSaldosCuentasPorPagar.jButtonid_zonaSaldosCuentasPorPagarUpdate.addActionListener(new ButtonActionListener(this,"id_zonaSaldosCuentasPorPagarUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSaldosCuentasPorPagar.jButtonid_zonaSaldosCuentasPorPagarBusqueda.addActionListener(new ButtonActionListener(this,"id_zonaSaldosCuentasPorPagarBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormSaldosCuentasPorPagar.jButtonid_grupo_clienteSaldosCuentasPorPagarUpdate.addActionListener(new ButtonActionListener(this,"id_grupo_clienteSaldosCuentasPorPagarUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSaldosCuentasPorPagar.jButtonid_grupo_clienteSaldosCuentasPorPagarBusqueda.addActionListener(new ButtonActionListener(this,"id_grupo_clienteSaldosCuentasPorPagarBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormSaldosCuentasPorPagar.jButtonid_empresaSaldosCuentasPorPagarUpdate.addActionListener(new ButtonActionListener(this,"id_empresaSaldosCuentasPorPagarUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSaldosCuentasPorPagar.jButtonid_empresaSaldosCuentasPorPagarBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaSaldosCuentasPorPagarBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormSaldosCuentasPorPagar.jButtonid_sucursalSaldosCuentasPorPagarUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalSaldosCuentasPorPagarUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSaldosCuentasPorPagar.jButtonid_sucursalSaldosCuentasPorPagarBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalSaldosCuentasPorPagarBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormSaldosCuentasPorPagar.jButtonid_clienteSaldosCuentasPorPagarUpdate.addActionListener(new ButtonActionListener(this,"id_clienteSaldosCuentasPorPagarUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSaldosCuentasPorPagar.jButtonid_clienteSaldosCuentasPorPagarBusqueda.addActionListener(new ButtonActionListener(this,"id_clienteSaldosCuentasPorPagarBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSaldosCuentasPorPagar.jButtonfecha_emision_hastaSaldosCuentasPorPagarBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emision_hastaSaldosCuentasPorPagarBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSaldosCuentasPorPagar.jButtoncodigoSaldosCuentasPorPagarBusqueda.addActionListener(new ButtonActionListener(this,"codigoSaldosCuentasPorPagarBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSaldosCuentasPorPagar.jButtonnombre_completoSaldosCuentasPorPagarBusqueda.addActionListener(new ButtonActionListener(this,"nombre_completoSaldosCuentasPorPagarBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSaldosCuentasPorPagar.jButtondebito_mone_localSaldosCuentasPorPagarBusqueda.addActionListener(new ButtonActionListener(this,"debito_mone_localSaldosCuentasPorPagarBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSaldosCuentasPorPagar.jButtoncredito_mone_localSaldosCuentasPorPagarBusqueda.addActionListener(new ButtonActionListener(this,"credito_mone_localSaldosCuentasPorPagarBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSaldosCuentasPorPagar.jButtonsaldo_anteriorSaldosCuentasPorPagarBusqueda.addActionListener(new ButtonActionListener(this,"saldo_anteriorSaldosCuentasPorPagarBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSaldosCuentasPorPagar.jButtonsaldo_debitoSaldosCuentasPorPagarBusqueda.addActionListener(new ButtonActionListener(this,"saldo_debitoSaldosCuentasPorPagarBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSaldosCuentasPorPagar.jButtonsaldo_creditoSaldosCuentasPorPagarBusqueda.addActionListener(new ButtonActionListener(this,"saldo_creditoSaldosCuentasPorPagarBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormSaldosCuentasPorPagar.jTabbedPaneRelacionesSaldosCuentasPorPagar.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesSaldosCuentasPorPagar"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameSaldosCuentasPorPagar"));
		
		if(this.jInternalFrameDetalleFormSaldosCuentasPorPagar!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSaldosCuentasPorPagar.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarSaldosCuentasPorPagar"));
		}
		
		this.jTableDatosSaldosCuentasPorPagar.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarSaldosCuentasPorPagar"));
		
		this.jTableDatosSaldosCuentasPorPagar.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarSaldosCuentasPorPagar"));
		
		this.jButtonNuevoSaldosCuentasPorPagar.addActionListener(new ButtonActionListener(this,"NuevoSaldosCuentasPorPagar"));
		
		this.jButtonDuplicarSaldosCuentasPorPagar.addActionListener(new ButtonActionListener(this,"DuplicarSaldosCuentasPorPagar"));
		
		this.jButtonCopiarSaldosCuentasPorPagar.addActionListener(new ButtonActionListener(this,"CopiarSaldosCuentasPorPagar"));
		
		this.jButtonVerFormSaldosCuentasPorPagar.addActionListener(new ButtonActionListener(this,"VerFormSaldosCuentasPorPagar"));
		
		
		this.jButtonNuevoToolBarSaldosCuentasPorPagar.addActionListener(new ButtonActionListener(this,"NuevoToolBarSaldosCuentasPorPagar"));
			
		this.jButtonDuplicarToolBarSaldosCuentasPorPagar.addActionListener(new ButtonActionListener(this,"DuplicarToolBarSaldosCuentasPorPagar"));
			
		this.jMenuItemNuevoSaldosCuentasPorPagar.addActionListener (new ButtonActionListener(this,"MenuItemNuevoSaldosCuentasPorPagar"));
			
		this.jMenuItemDuplicarSaldosCuentasPorPagar.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarSaldosCuentasPorPagar"));		
		
		
		this.jButtonNuevoRelacionesSaldosCuentasPorPagar.addActionListener (new ButtonActionListener(this,"NuevoRelacionesSaldosCuentasPorPagar"));
		
		
		this.jButtonNuevoRelacionesToolBarSaldosCuentasPorPagar.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarSaldosCuentasPorPagar"));
			
		this.jMenuItemNuevoRelacionesSaldosCuentasPorPagar.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesSaldosCuentasPorPagar"));		
		
		
		if(this.jInternalFrameDetalleFormSaldosCuentasPorPagar!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSaldosCuentasPorPagar.jButtonModificarSaldosCuentasPorPagar.addActionListener(new ButtonActionListener(this,"ModificarSaldosCuentasPorPagar"));
		}
		
		
		if(this.jInternalFrameDetalleFormSaldosCuentasPorPagar!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSaldosCuentasPorPagar.jButtonModificarToolBarSaldosCuentasPorPagar.addActionListener(new ButtonActionListener(this,"ModificarToolBarSaldosCuentasPorPagar"));
			
			this.jInternalFrameDetalleFormSaldosCuentasPorPagar.jMenuItemModificarSaldosCuentasPorPagar.addActionListener(new ButtonActionListener(this,"MenuItemModificarSaldosCuentasPorPagar"));		
		}
		
		
		if(this.jInternalFrameDetalleFormSaldosCuentasPorPagar!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormSaldosCuentasPorPagar.jButtonActualizarSaldosCuentasPorPagar.addActionListener (new ButtonActionListener(this,"ActualizarSaldosCuentasPorPagar"));
		}
		
		
		if(this.jInternalFrameDetalleFormSaldosCuentasPorPagar!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSaldosCuentasPorPagar.jButtonActualizarToolBarSaldosCuentasPorPagar.addActionListener(new ButtonActionListener(this,"ActualizarToolBarSaldosCuentasPorPagar"));
				
			this.jInternalFrameDetalleFormSaldosCuentasPorPagar.jMenuItemActualizarSaldosCuentasPorPagar.addActionListener (new ButtonActionListener(this,"MenuItemActualizarSaldosCuentasPorPagar"));		
		}
		
		
		if(this.jInternalFrameDetalleFormSaldosCuentasPorPagar!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSaldosCuentasPorPagar.jButtonEliminarSaldosCuentasPorPagar.addActionListener (new ButtonActionListener(this,"EliminarSaldosCuentasPorPagar"));
		}
		
		
		if(this.jInternalFrameDetalleFormSaldosCuentasPorPagar!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSaldosCuentasPorPagar.jButtonEliminarToolBarSaldosCuentasPorPagar.addActionListener (new ButtonActionListener(this,"EliminarToolBarSaldosCuentasPorPagar"));
						
			this.jInternalFrameDetalleFormSaldosCuentasPorPagar.jMenuItemEliminarSaldosCuentasPorPagar.addActionListener (new ButtonActionListener(this,"MenuItemEliminarSaldosCuentasPorPagar"));		
		}
		
		
		if(this.jInternalFrameDetalleFormSaldosCuentasPorPagar!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSaldosCuentasPorPagar.jButtonCancelarSaldosCuentasPorPagar.addActionListener (new ButtonActionListener(this,"CancelarSaldosCuentasPorPagar"));
		}
		
		
		if(this.jInternalFrameDetalleFormSaldosCuentasPorPagar!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSaldosCuentasPorPagar.jButtonCancelarToolBarSaldosCuentasPorPagar.addActionListener (new ButtonActionListener(this,"CancelarToolBarSaldosCuentasPorPagar"));
			
			this.jInternalFrameDetalleFormSaldosCuentasPorPagar.jMenuItemCancelarSaldosCuentasPorPagar.addActionListener (new ButtonActionListener(this,"MenuItemCancelarSaldosCuentasPorPagar"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarSaldosCuentasPorPagar.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarSaldosCuentasPorPagar"));		
		
		
		this.jButtonCerrarSaldosCuentasPorPagar.addActionListener (new ButtonActionListener(this,"CerrarSaldosCuentasPorPagar"));
		
		
		this.jButtonCerrarToolBarSaldosCuentasPorPagar.addActionListener (new ButtonActionListener(this,"CerrarToolBarSaldosCuentasPorPagar"));
			
		this.jMenuItemCerrarSaldosCuentasPorPagar.addActionListener (new ButtonActionListener(this,"MenuItemCerrarSaldosCuentasPorPagar"));
			
		if(this.jInternalFrameDetalleFormSaldosCuentasPorPagar!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSaldosCuentasPorPagar.jMenuItemDetalleCerrarSaldosCuentasPorPagar.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarSaldosCuentasPorPagar"));		
		}
		
		
		if(this.jInternalFrameDetalleFormSaldosCuentasPorPagar!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSaldosCuentasPorPagar.jButtonGuardarCambiosSaldosCuentasPorPagar.addActionListener (new ButtonActionListener(this,"GuardarCambiosSaldosCuentasPorPagar"));
		}
		
		
		if(this.jInternalFrameDetalleFormSaldosCuentasPorPagar!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSaldosCuentasPorPagar.jButtonGuardarCambiosToolBarSaldosCuentasPorPagar.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarSaldosCuentasPorPagar"));
		}
		
		this.jButtonCopiarToolBarSaldosCuentasPorPagar.addActionListener (new ButtonActionListener(this,"CopiarToolBarSaldosCuentasPorPagar"));
			
		this.jButtonVerFormToolBarSaldosCuentasPorPagar.addActionListener (new ButtonActionListener(this,"VerFormToolBarSaldosCuentasPorPagar"));
		
		this.jMenuItemGuardarCambiosSaldosCuentasPorPagar.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosSaldosCuentasPorPagar"));
			
		this.jMenuItemCopiarSaldosCuentasPorPagar.addActionListener (new ButtonActionListener(this,"MenuItemCopiarSaldosCuentasPorPagar"));		
		
		this.jMenuItemVerFormSaldosCuentasPorPagar.addActionListener (new ButtonActionListener(this,"MenuItemVerFormSaldosCuentasPorPagar"));		
		
		
		this.jButtonGuardarCambiosTablaSaldosCuentasPorPagar.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaSaldosCuentasPorPagar"));
		
		
		this.jButtonGuardarCambiosTablaToolBarSaldosCuentasPorPagar.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarSaldosCuentasPorPagar"));
			
		this.jMenuItemGuardarCambiosTablaSaldosCuentasPorPagar.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaSaldosCuentasPorPagar"));		
		
		
		
		this.jButtonRecargarInformacionSaldosCuentasPorPagar.addActionListener (new ButtonActionListener(this,"RecargarInformacionSaldosCuentasPorPagar"));
					
		this.jButtonRecargarInformacionToolBarSaldosCuentasPorPagar.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarSaldosCuentasPorPagar"));
		
		this.jMenuItemRecargarInformacionSaldosCuentasPorPagar.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionSaldosCuentasPorPagar"));		
		
		
		
		this.jButtonAnterioresSaldosCuentasPorPagar.addActionListener (new ButtonActionListener(this,"AnterioresSaldosCuentasPorPagar"));
		
		
		this.jButtonAnterioresToolBarSaldosCuentasPorPagar.addActionListener (new ButtonActionListener(this,"AnterioresToolBarSaldosCuentasPorPagar"));
		
		this.jMenuItemAnterioresSaldosCuentasPorPagar.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresSaldosCuentasPorPagar"));		
		
		
		this.jButtonSiguientesSaldosCuentasPorPagar.addActionListener (new ButtonActionListener(this,"SiguientesSaldosCuentasPorPagar"));
		
		
		this.jButtonSiguientesToolBarSaldosCuentasPorPagar.addActionListener (new ButtonActionListener(this,"SiguientesToolBarSaldosCuentasPorPagar"));
			
		this.jMenuItemSiguientesSaldosCuentasPorPagar.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesSaldosCuentasPorPagar"));
			
		this.jMenuItemAbrirOrderBySaldosCuentasPorPagar.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderBySaldosCuentasPorPagar"));
			
		this.jMenuItemMostrarOcultarSaldosCuentasPorPagar.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarSaldosCuentasPorPagar"));
			
		this.jMenuItemDetalleAbrirOrderBySaldosCuentasPorPagar.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderBySaldosCuentasPorPagar"));
			
		this.jMenuItemDetalleMostarOcultarSaldosCuentasPorPagar.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarSaldosCuentasPorPagar"));		
		
		
		this.jButtonNuevoGuardarCambiosSaldosCuentasPorPagar.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosSaldosCuentasPorPagar"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarSaldosCuentasPorPagar.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarSaldosCuentasPorPagar"));
			
		this.jMenuItemNuevoGuardarCambiosSaldosCuentasPorPagar.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosSaldosCuentasPorPagar"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosSaldosCuentasPorPagar.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosSaldosCuentasPorPagar"));

		this.jCheckBoxSeleccionadosSaldosCuentasPorPagar.addItemListener(new CheckBoxItemListener(this,"SeleccionadosSaldosCuentasPorPagar"));
		
		if(this.jInternalFrameDetalleFormSaldosCuentasPorPagar!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSaldosCuentasPorPagar.jComboBoxTiposAccionesFormularioSaldosCuentasPorPagar.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioSaldosCuentasPorPagar"));
		}
		
		
		this.jComboBoxTiposRelacionesSaldosCuentasPorPagar.addActionListener (new ButtonActionListener(this,"TiposRelacionesSaldosCuentasPorPagar"));
			
		this.jComboBoxTiposAccionesSaldosCuentasPorPagar.addActionListener (new ButtonActionListener(this,"TiposAccionesSaldosCuentasPorPagar"));
					
		this.jComboBoxTiposSeleccionarSaldosCuentasPorPagar.addActionListener (new ButtonActionListener(this,"TiposSeleccionarSaldosCuentasPorPagar"));
			
		this.jTextFieldValorCampoGeneralSaldosCuentasPorPagar.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralSaldosCuentasPorPagar"));		
		
		
		if(this.jInternalFrameDetalleFormSaldosCuentasPorPagar!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSaldosCuentasPorPagar.jButtonidSaldosCuentasPorPagarBusqueda.addActionListener(new ButtonActionListener(this,"idSaldosCuentasPorPagarBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormSaldosCuentasPorPagar.jButtonid_zonaSaldosCuentasPorPagarUpdate.addActionListener(new ButtonActionListener(this,"id_zonaSaldosCuentasPorPagarUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSaldosCuentasPorPagar.jButtonid_zonaSaldosCuentasPorPagarBusqueda.addActionListener(new ButtonActionListener(this,"id_zonaSaldosCuentasPorPagarBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormSaldosCuentasPorPagar.jButtonid_grupo_clienteSaldosCuentasPorPagarUpdate.addActionListener(new ButtonActionListener(this,"id_grupo_clienteSaldosCuentasPorPagarUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSaldosCuentasPorPagar.jButtonid_grupo_clienteSaldosCuentasPorPagarBusqueda.addActionListener(new ButtonActionListener(this,"id_grupo_clienteSaldosCuentasPorPagarBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormSaldosCuentasPorPagar.jButtonid_empresaSaldosCuentasPorPagarUpdate.addActionListener(new ButtonActionListener(this,"id_empresaSaldosCuentasPorPagarUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSaldosCuentasPorPagar.jButtonid_empresaSaldosCuentasPorPagarBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaSaldosCuentasPorPagarBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormSaldosCuentasPorPagar.jButtonid_sucursalSaldosCuentasPorPagarUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalSaldosCuentasPorPagarUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSaldosCuentasPorPagar.jButtonid_sucursalSaldosCuentasPorPagarBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalSaldosCuentasPorPagarBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormSaldosCuentasPorPagar.jButtonid_clienteSaldosCuentasPorPagarUpdate.addActionListener(new ButtonActionListener(this,"id_clienteSaldosCuentasPorPagarUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSaldosCuentasPorPagar.jButtonid_clienteSaldosCuentasPorPagarBusqueda.addActionListener(new ButtonActionListener(this,"id_clienteSaldosCuentasPorPagarBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSaldosCuentasPorPagar.jButtonfecha_emision_hastaSaldosCuentasPorPagarBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emision_hastaSaldosCuentasPorPagarBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSaldosCuentasPorPagar.jButtoncodigoSaldosCuentasPorPagarBusqueda.addActionListener(new ButtonActionListener(this,"codigoSaldosCuentasPorPagarBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSaldosCuentasPorPagar.jButtonnombre_completoSaldosCuentasPorPagarBusqueda.addActionListener(new ButtonActionListener(this,"nombre_completoSaldosCuentasPorPagarBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSaldosCuentasPorPagar.jButtondebito_mone_localSaldosCuentasPorPagarBusqueda.addActionListener(new ButtonActionListener(this,"debito_mone_localSaldosCuentasPorPagarBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSaldosCuentasPorPagar.jButtoncredito_mone_localSaldosCuentasPorPagarBusqueda.addActionListener(new ButtonActionListener(this,"credito_mone_localSaldosCuentasPorPagarBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSaldosCuentasPorPagar.jButtonsaldo_anteriorSaldosCuentasPorPagarBusqueda.addActionListener(new ButtonActionListener(this,"saldo_anteriorSaldosCuentasPorPagarBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSaldosCuentasPorPagar.jButtonsaldo_debitoSaldosCuentasPorPagarBusqueda.addActionListener(new ButtonActionListener(this,"saldo_debitoSaldosCuentasPorPagarBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSaldosCuentasPorPagar.jButtonsaldo_creditoSaldosCuentasPorPagarBusqueda.addActionListener(new ButtonActionListener(this,"saldo_creditoSaldosCuentasPorPagarBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonBusquedaSaldosCuentasPorPagarSaldosCuentasPorPagar.addActionListener(new ButtonActionListener(this,"BusquedaSaldosCuentasPorPagarSaldosCuentasPorPagar"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoSaldosCuentasPorPagar!=null) {
				this.jInternalFrameReporteDinamicoSaldosCuentasPorPagar.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoSaldosCuentasPorPagar"));
				this.jInternalFrameReporteDinamicoSaldosCuentasPorPagar.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoSaldosCuentasPorPagar"));
				this.jInternalFrameReporteDinamicoSaldosCuentasPorPagar.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoSaldosCuentasPorPagar"));
			}
			
			//this.jButtonCerrarReporteDinamicoSaldosCuentasPorPagar.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoSaldosCuentasPorPagar"));				
			//this.jButtonGenerarReporteDinamicoSaldosCuentasPorPagar.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoSaldosCuentasPorPagar"));
			//this.jButtonGenerarExcelReporteDinamicoSaldosCuentasPorPagar.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoSaldosCuentasPorPagar"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionSaldosCuentasPorPagar!=null) {
				this.jInternalFrameImportacionSaldosCuentasPorPagar.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionSaldosCuentasPorPagar"));
				this.jInternalFrameImportacionSaldosCuentasPorPagar.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionSaldosCuentasPorPagar"));
				this.jInternalFrameImportacionSaldosCuentasPorPagar.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionSaldosCuentasPorPagar"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderBySaldosCuentasPorPagar.addActionListener (new ButtonActionListener(this,"AbrirOrderBySaldosCuentasPorPagar"));
			
			this.jButtonAbrirOrderByToolBarSaldosCuentasPorPagar.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarSaldosCuentasPorPagar"));			
			
			if(this.jInternalFrameOrderBySaldosCuentasPorPagar!=null) {
				this.jInternalFrameOrderBySaldosCuentasPorPagar.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderBySaldosCuentasPorPagar"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormSaldosCuentasPorPagar!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormSaldosCuentasPorPagar!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSaldosCuentasPorPagar.jTabbedPaneRelacionesSaldosCuentasPorPagar.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesSaldosCuentasPorPagar"));
		
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
            		closingInternalFrameSaldosCuentasPorPagar();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormSaldosCuentasPorPagar.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormSaldosCuentasPorPagar = (JInternalFrameBase)event.getSource();
	            	
	            SaldosCuentasPorPagarBeanSwingJInternalFrame jInternalFrameParent=(SaldosCuentasPorPagarBeanSwingJInternalFrame)jInternalFrameDetalleFormSaldosCuentasPorPagar.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarSaldosCuentasPorPagarActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosSaldosCuentasPorPagar.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosSaldosCuentasPorPagarListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosSaldosCuentasPorPagar.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosSaldosCuentasPorPagar.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoSaldosCuentasPorPagar.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoSaldosCuentasPorPagarActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarSaldosCuentasPorPagar.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoSaldosCuentasPorPagarActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoSaldosCuentasPorPagar.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoSaldosCuentasPorPagarActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoSaldosCuentasPorPagar";
		inputMap = this.jButtonNuevoSaldosCuentasPorPagar.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoSaldosCuentasPorPagar.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoSaldosCuentasPorPagarActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesSaldosCuentasPorPagar.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoSaldosCuentasPorPagarActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarSaldosCuentasPorPagar.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoSaldosCuentasPorPagarActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesSaldosCuentasPorPagar.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoSaldosCuentasPorPagarActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesSaldosCuentasPorPagar";
		inputMap = this.jButtonNuevoRelacionesSaldosCuentasPorPagar.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesSaldosCuentasPorPagar.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoSaldosCuentasPorPagarActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarSaldosCuentasPorPagar.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarSaldosCuentasPorPagarActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarSaldosCuentasPorPagar.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarSaldosCuentasPorPagarActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarSaldosCuentasPorPagar.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarSaldosCuentasPorPagarActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarSaldosCuentasPorPagar";
		inputMap = this.jButtonModificarSaldosCuentasPorPagar.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarSaldosCuentasPorPagar.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarSaldosCuentasPorPagarActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarSaldosCuentasPorPagar.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarSaldosCuentasPorPagarActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarSaldosCuentasPorPagar.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarSaldosCuentasPorPagarActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarSaldosCuentasPorPagar.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarSaldosCuentasPorPagarActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarSaldosCuentasPorPagar";
		inputMap = this.jButtonActualizarSaldosCuentasPorPagar.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarSaldosCuentasPorPagar.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarSaldosCuentasPorPagarActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarSaldosCuentasPorPagar.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarSaldosCuentasPorPagarActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarSaldosCuentasPorPagar.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarSaldosCuentasPorPagarActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarSaldosCuentasPorPagar.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarSaldosCuentasPorPagarActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarSaldosCuentasPorPagar";
		inputMap = this.jButtonEliminarSaldosCuentasPorPagar.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarSaldosCuentasPorPagar.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarSaldosCuentasPorPagarActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarSaldosCuentasPorPagar.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarSaldosCuentasPorPagarActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarSaldosCuentasPorPagar.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarSaldosCuentasPorPagarActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarSaldosCuentasPorPagar.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarSaldosCuentasPorPagarActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarSaldosCuentasPorPagar";
		inputMap = this.jButtonCancelarSaldosCuentasPorPagar.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarSaldosCuentasPorPagar.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarSaldosCuentasPorPagarActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarSaldosCuentasPorPagar.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarSaldosCuentasPorPagarActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarSaldosCuentasPorPagar.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarSaldosCuentasPorPagarActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarSaldosCuentasPorPagar.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarSaldosCuentasPorPagarActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarSaldosCuentasPorPagar.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarSaldosCuentasPorPagarActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarSaldosCuentasPorPagarActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarSaldosCuentasPorPagar";
		inputMap = this.jButtonCerrarSaldosCuentasPorPagar.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarSaldosCuentasPorPagar.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarSaldosCuentasPorPagarActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormSaldosCuentasPorPagar.jButtonGuardarCambiosSaldosCuentasPorPagar.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosSaldosCuentasPorPagarActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarSaldosCuentasPorPagar.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosSaldosCuentasPorPagarActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosSaldosCuentasPorPagar.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosSaldosCuentasPorPagarActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaSaldosCuentasPorPagar.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosSaldosCuentasPorPagarActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarSaldosCuentasPorPagar.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosSaldosCuentasPorPagarActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaSaldosCuentasPorPagar.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosSaldosCuentasPorPagarActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosSaldosCuentasPorPagar";
		inputMap = this.jInternalFrameDetalleFormSaldosCuentasPorPagar.jButtonGuardarCambiosSaldosCuentasPorPagar.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormSaldosCuentasPorPagar.jButtonGuardarCambiosSaldosCuentasPorPagar.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosSaldosCuentasPorPagarActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionSaldosCuentasPorPagar.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionSaldosCuentasPorPagarActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarSaldosCuentasPorPagar.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionSaldosCuentasPorPagarActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionSaldosCuentasPorPagar.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionSaldosCuentasPorPagarActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresSaldosCuentasPorPagar.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresSaldosCuentasPorPagarActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarSaldosCuentasPorPagar.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresSaldosCuentasPorPagarActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresSaldosCuentasPorPagar.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresSaldosCuentasPorPagarActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesSaldosCuentasPorPagar.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesSaldosCuentasPorPagarActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarSaldosCuentasPorPagar.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesSaldosCuentasPorPagarActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesSaldosCuentasPorPagar.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesSaldosCuentasPorPagarActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosSaldosCuentasPorPagar.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosSaldosCuentasPorPagarActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarSaldosCuentasPorPagar.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosSaldosCuentasPorPagarActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosSaldosCuentasPorPagar.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosSaldosCuentasPorPagarActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosSaldosCuentasPorPagar.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosSaldosCuentasPorPagarItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesSaldosCuentasPorPagar.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesSaldosCuentasPorPagarActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarSaldosCuentasPorPagar.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarSaldosCuentasPorPagarActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralSaldosCuentasPorPagar.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralSaldosCuentasPorPagarActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSaldosCuentasPorPagar.jButtonidSaldosCuentasPorPagarBusqueda.addActionListener(new ButtonActionListener(this,"idSaldosCuentasPorPagarBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormSaldosCuentasPorPagar.jButtonid_zonaSaldosCuentasPorPagarUpdate.addActionListener(new ButtonActionListener(this,"id_zonaSaldosCuentasPorPagarUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSaldosCuentasPorPagar.jButtonid_zonaSaldosCuentasPorPagarBusqueda.addActionListener(new ButtonActionListener(this,"id_zonaSaldosCuentasPorPagarBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormSaldosCuentasPorPagar.jButtonid_grupo_clienteSaldosCuentasPorPagarUpdate.addActionListener(new ButtonActionListener(this,"id_grupo_clienteSaldosCuentasPorPagarUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSaldosCuentasPorPagar.jButtonid_grupo_clienteSaldosCuentasPorPagarBusqueda.addActionListener(new ButtonActionListener(this,"id_grupo_clienteSaldosCuentasPorPagarBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormSaldosCuentasPorPagar.jButtonid_empresaSaldosCuentasPorPagarUpdate.addActionListener(new ButtonActionListener(this,"id_empresaSaldosCuentasPorPagarUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSaldosCuentasPorPagar.jButtonid_empresaSaldosCuentasPorPagarBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaSaldosCuentasPorPagarBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormSaldosCuentasPorPagar.jButtonid_sucursalSaldosCuentasPorPagarUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalSaldosCuentasPorPagarUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSaldosCuentasPorPagar.jButtonid_sucursalSaldosCuentasPorPagarBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalSaldosCuentasPorPagarBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormSaldosCuentasPorPagar.jButtonid_clienteSaldosCuentasPorPagarUpdate.addActionListener(new ButtonActionListener(this,"id_clienteSaldosCuentasPorPagarUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSaldosCuentasPorPagar.jButtonid_clienteSaldosCuentasPorPagarBusqueda.addActionListener(new ButtonActionListener(this,"id_clienteSaldosCuentasPorPagarBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSaldosCuentasPorPagar.jButtonfecha_emision_hastaSaldosCuentasPorPagarBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emision_hastaSaldosCuentasPorPagarBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSaldosCuentasPorPagar.jButtoncodigoSaldosCuentasPorPagarBusqueda.addActionListener(new ButtonActionListener(this,"codigoSaldosCuentasPorPagarBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSaldosCuentasPorPagar.jButtonnombre_completoSaldosCuentasPorPagarBusqueda.addActionListener(new ButtonActionListener(this,"nombre_completoSaldosCuentasPorPagarBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSaldosCuentasPorPagar.jButtondebito_mone_localSaldosCuentasPorPagarBusqueda.addActionListener(new ButtonActionListener(this,"debito_mone_localSaldosCuentasPorPagarBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSaldosCuentasPorPagar.jButtoncredito_mone_localSaldosCuentasPorPagarBusqueda.addActionListener(new ButtonActionListener(this,"credito_mone_localSaldosCuentasPorPagarBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSaldosCuentasPorPagar.jButtonsaldo_anteriorSaldosCuentasPorPagarBusqueda.addActionListener(new ButtonActionListener(this,"saldo_anteriorSaldosCuentasPorPagarBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSaldosCuentasPorPagar.jButtonsaldo_debitoSaldosCuentasPorPagarBusqueda.addActionListener(new ButtonActionListener(this,"saldo_debitoSaldosCuentasPorPagarBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSaldosCuentasPorPagar.jButtonsaldo_creditoSaldosCuentasPorPagarBusqueda.addActionListener(new ButtonActionListener(this,"saldo_creditoSaldosCuentasPorPagarBusqueda"));
		
		
		this.jButtonBusquedaSaldosCuentasPorPagarSaldosCuentasPorPagar.addActionListener(new ButtonActionListener(this,"BusquedaSaldosCuentasPorPagarSaldosCuentasPorPagar"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoSaldosCuentasPorPagar.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoSaldosCuentasPorPagarActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoSaldosCuentasPorPagar.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoSaldosCuentasPorPagarActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoSaldosCuentasPorPagar.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoSaldosCuentasPorPagarActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionSaldosCuentasPorPagar.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionSaldosCuentasPorPagarActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionSaldosCuentasPorPagar.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionSaldosCuentasPorPagarActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionSaldosCuentasPorPagar.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionSaldosCuentasPorPagarActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarSaldosCuentasPorPagarActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarSaldosCuentasPorPagar.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SaldosCuentasPorPagarConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosSaldosCuentasPorPagar(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(SaldosCuentasPorPagar saldoscuentasporpagarAux:this.saldoscuentasporpagarLogic.getSaldosCuentasPorPagars()) {
					saldoscuentasporpagarAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(SaldosCuentasPorPagar saldoscuentasporpagarAux:saldoscuentasporpagars) {
					saldoscuentasporpagarAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SaldosCuentasPorPagarConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosSaldosCuentasPorPagarItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingSaldosCuentasPorPagar(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(SaldosCuentasPorPagar saldoscuentasporpagarAux:this.saldoscuentasporpagarLogic.getSaldosCuentasPorPagars()) {
						saldoscuentasporpagarAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(SaldosCuentasPorPagar saldoscuentasporpagarAux:saldoscuentasporpagars) {
						saldoscuentasporpagarAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(SaldosCuentasPorPagar saldoscuentasporpagarAux:this.saldoscuentasporpagarLogic.getSaldosCuentasPorPagars()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(SaldosCuentasPorPagar saldoscuentasporpagarAux:saldoscuentasporpagars) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaSaldosCuentasPorPagar(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosSaldosCuentasPorPagar.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosSaldosCuentasPorPagar.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosSaldosCuentasPorPagar,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SaldosCuentasPorPagarConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosSaldosCuentasPorPagarItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingSaldosCuentasPorPagar(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosSaldosCuentasPorPagar.getSelectedRows();
			
			SaldosCuentasPorPagar saldoscuentasporpagarLocal=new SaldosCuentasPorPagar();
			
			//this.seleccionarTodosSaldosCuentasPorPagar(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					saldoscuentasporpagarLocal =(SaldosCuentasPorPagar) this.saldoscuentasporpagarLogic.getSaldosCuentasPorPagars().toArray()[this.jTableDatosSaldosCuentasPorPagar.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					saldoscuentasporpagarLocal =(SaldosCuentasPorPagar) this.saldoscuentasporpagars.toArray()[this.jTableDatosSaldosCuentasPorPagar.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				saldoscuentasporpagarLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(SaldosCuentasPorPagar saldoscuentasporpagarAux:this.saldoscuentasporpagarLogic.getSaldosCuentasPorPagars()) {
						saldoscuentasporpagarAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(SaldosCuentasPorPagar saldoscuentasporpagarAux:saldoscuentasporpagars) {
						saldoscuentasporpagarAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaSaldosCuentasPorPagar(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosSaldosCuentasPorPagar.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosSaldosCuentasPorPagar.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosSaldosCuentasPorPagar,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SaldosCuentasPorPagarConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualSaldosCuentasPorPagarItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SaldosCuentasPorPagarConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarSaldosCuentasPorPagarParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SaldosCuentasPorPagarConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralSaldosCuentasPorPagarActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingSaldosCuentasPorPagar(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralSaldosCuentasPorPagar.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(SaldosCuentasPorPagar saldoscuentasporpagarAux:this.saldoscuentasporpagarLogic.getSaldosCuentasPorPagars()) {
				
						if(sTipoSeleccionar.equals(SaldosCuentasPorPagarConstantesFunciones.LABEL_FECHAEMISIONHASTA)) {
							existe=true;
							saldoscuentasporpagarAux.setfecha_emision_hasta(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(SaldosCuentasPorPagarConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							saldoscuentasporpagarAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(SaldosCuentasPorPagarConstantesFunciones.LABEL_NOMBRECOMPLETO)) {
							existe=true;
							saldoscuentasporpagarAux.setnombre_completo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(SaldosCuentasPorPagarConstantesFunciones.LABEL_DEBITOMONELOCAL)) {
							existe=true;
							saldoscuentasporpagarAux.setdebito_mone_local(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(SaldosCuentasPorPagarConstantesFunciones.LABEL_CREDITOMONELOCAL)) {
							existe=true;
							saldoscuentasporpagarAux.setcredito_mone_local(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(SaldosCuentasPorPagarConstantesFunciones.LABEL_SALDOANTERIOR)) {
							existe=true;
							saldoscuentasporpagarAux.setsaldo_anterior(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(SaldosCuentasPorPagarConstantesFunciones.LABEL_SALDODEBITO)) {
							existe=true;
							saldoscuentasporpagarAux.setsaldo_debito(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(SaldosCuentasPorPagarConstantesFunciones.LABEL_SALDOCREDITO)) {
							existe=true;
							saldoscuentasporpagarAux.setsaldo_credito(Double.parseDouble(this.sValorCampoGeneral));
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(SaldosCuentasPorPagar saldoscuentasporpagarAux:saldoscuentasporpagars) {
					
						if(sTipoSeleccionar.equals(SaldosCuentasPorPagarConstantesFunciones.LABEL_FECHAEMISIONHASTA)) {
							existe=true;
							saldoscuentasporpagarAux.setfecha_emision_hasta(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(SaldosCuentasPorPagarConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							saldoscuentasporpagarAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(SaldosCuentasPorPagarConstantesFunciones.LABEL_NOMBRECOMPLETO)) {
							existe=true;
							saldoscuentasporpagarAux.setnombre_completo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(SaldosCuentasPorPagarConstantesFunciones.LABEL_DEBITOMONELOCAL)) {
							existe=true;
							saldoscuentasporpagarAux.setdebito_mone_local(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(SaldosCuentasPorPagarConstantesFunciones.LABEL_CREDITOMONELOCAL)) {
							existe=true;
							saldoscuentasporpagarAux.setcredito_mone_local(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(SaldosCuentasPorPagarConstantesFunciones.LABEL_SALDOANTERIOR)) {
							existe=true;
							saldoscuentasporpagarAux.setsaldo_anterior(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(SaldosCuentasPorPagarConstantesFunciones.LABEL_SALDODEBITO)) {
							existe=true;
							saldoscuentasporpagarAux.setsaldo_debito(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(SaldosCuentasPorPagarConstantesFunciones.LABEL_SALDOCREDITO)) {
							existe=true;
							saldoscuentasporpagarAux.setsaldo_credito(Double.parseDouble(this.sValorCampoGeneral));
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaSaldosCuentasPorPagar(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SaldosCuentasPorPagarConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesSaldosCuentasPorPagarActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingSaldosCuentasPorPagar(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioSaldosCuentasPorPagar=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesSaldosCuentasPorPagar.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormSaldosCuentasPorPagar.jComboBoxTiposAccionesFormularioSaldosCuentasPorPagar.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteSaldosCuentasPorPagar) {				
					conSplash=true;//false;										
					
					//this.startProcessSaldosCuentasPorPagar(conSplash);
				
					this.generarReporteSaldosCuentasPorPagarsSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesSaldosCuentasPorPagar.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormSaldosCuentasPorPagar.jComboBoxTiposAccionesFormularioSaldosCuentasPorPagar.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoSaldosCuentasPorPagarsSeleccionados();
				//this.jComboBoxTiposAccionesSaldosCuentasPorPagar.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoSaldosCuentasPorPagarsSeleccionados(false);
				//this.jComboBoxTiposAccionesSaldosCuentasPorPagar.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoSaldosCuentasPorPagarsSeleccionados(true);
				//this.jComboBoxTiposAccionesSaldosCuentasPorPagar.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessSaldosCuentasPorPagar();
				
				this.exportarSaldosCuentasPorPagarsSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesSaldosCuentasPorPagar.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormSaldosCuentasPorPagar.jComboBoxTiposAccionesFormularioSaldosCuentasPorPagar.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionSaldosCuentasPorPagars();
				//this.importarSaldosCuentasPorPagars();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesSaldosCuentasPorPagar.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormSaldosCuentasPorPagar.jComboBoxTiposAccionesFormularioSaldosCuentasPorPagar.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessSaldosCuentasPorPagar();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelSaldosCuentasPorPagarsSeleccionados();
				//this.jComboBoxTiposAccionesSaldosCuentasPorPagar.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Saldos Cuentas Por Pagar", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessSaldosCuentasPorPagar();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoSaldosCuentasPorPagar)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeySaldosCuentasPorPagar(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Saldos Cuentas Por Pagar",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesSaldosCuentasPorPagar.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormSaldosCuentasPorPagar.jComboBoxTiposAccionesFormularioSaldosCuentasPorPagar.setSelectedIndex(0);					
				}	
			} 			
			else if(SaldosCuentasPorPagarBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteSaldosCuentasPorPagar) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessSaldosCuentasPorPagar(conSplash);
					
						//this.actualizarParametrosGeneralSaldosCuentasPorPagar();
						
						this.generarReporteProcesoAccionSaldosCuentasPorPagarsSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesSaldosCuentasPorPagar.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormSaldosCuentasPorPagar.jComboBoxTiposAccionesFormularioSaldosCuentasPorPagar.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(SaldosCuentasPorPagarBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Saldos Cuentas Por PagarES SELECCIONADOS?", "MANTENIMIENTO DE Saldos Cuentas Por Pagar", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessSaldosCuentasPorPagar();
				
						this.actualizarParametrosGeneralSaldosCuentasPorPagar();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.saldoscuentasporpagarReturnGeneral=saldoscuentasporpagarLogic.procesarAccionSaldosCuentasPorPagarsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.saldoscuentasporpagarLogic.getSaldosCuentasPorPagars(),this.saldoscuentasporpagarParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarSaldosCuentasPorPagarReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesSaldosCuentasPorPagar.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormSaldosCuentasPorPagar.jComboBoxTiposAccionesFormularioSaldosCuentasPorPagar.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralSaldosCuentasPorPagar();
					
					SaldosCuentasPorPagarBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarSaldosCuentasPorPagarReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesSaldosCuentasPorPagar.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormSaldosCuentasPorPagar.jComboBoxTiposAccionesFormularioSaldosCuentasPorPagar.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,SaldosCuentasPorPagarConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessSaldosCuentasPorPagar(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesSaldosCuentasPorPagarActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessSaldosCuentasPorPagar();
			
			if(this.jInternalFrameDetalleFormSaldosCuentasPorPagar==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<SaldosCuentasPorPagar> saldoscuentasporpagarsSeleccionados=new ArrayList<SaldosCuentasPorPagar>();		
			SaldosCuentasPorPagar saldoscuentasporpagar=new SaldosCuentasPorPagar();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingSaldosCuentasPorPagar(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesSaldosCuentasPorPagar.getSelectedItem();
			
			
			
			
			saldoscuentasporpagarsSeleccionados=this.getSaldosCuentasPorPagarsSeleccionados(true);
			//this.sTipoAccion;
			
			if(saldoscuentasporpagarsSeleccionados.size()==1) {
				for(SaldosCuentasPorPagar saldoscuentasporpagarAux:saldoscuentasporpagarsSeleccionados) {
					saldoscuentasporpagar=saldoscuentasporpagarAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SaldosCuentasPorPagarConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessSaldosCuentasPorPagar();
			
      		//this.finishProcessSaldosCuentasPorPagar(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarSaldosCuentasPorPagarReturnGeneral() throws Exception {
		if(this.saldoscuentasporpagarReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.saldoscuentasporpagarReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.saldoscuentasporpagarReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.saldoscuentasporpagarReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.saldoscuentasporpagarReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.saldoscuentasporpagarReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingSaldosCuentasPorPagar(false);
		}
		
		if(this.saldoscuentasporpagarReturnGeneral.getConRetornoLista() || this.saldoscuentasporpagarReturnGeneral.getConRetornoObjeto()) {
			if(this.saldoscuentasporpagarReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.saldoscuentasporpagarLogic.setSaldosCuentasPorPagars(this.saldoscuentasporpagarReturnGeneral.getSaldosCuentasPorPagars());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			
			this.inicializarActualizarBindingSaldosCuentasPorPagar(false);
		}
	}
	
	public void actualizarParametrosGeneralSaldosCuentasPorPagar() throws Exception {
		
		
	}
	
	public ArrayList<SaldosCuentasPorPagar> getSaldosCuentasPorPagarsSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<SaldosCuentasPorPagar> saldoscuentasporpagarsSeleccionados=new ArrayList<SaldosCuentasPorPagar>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioSaldosCuentasPorPagar) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(SaldosCuentasPorPagar saldoscuentasporpagarAux:saldoscuentasporpagarLogic.getSaldosCuentasPorPagars()) {
					if(saldoscuentasporpagarAux.getIsSelected()) {
						saldoscuentasporpagarsSeleccionados.add(saldoscuentasporpagarAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(SaldosCuentasPorPagar saldoscuentasporpagarAux:this.saldoscuentasporpagars) {
					if(saldoscuentasporpagarAux.getIsSelected()) {
						saldoscuentasporpagarsSeleccionados.add(saldoscuentasporpagarAux);				
					}
				}
			}
			
			if(saldoscuentasporpagarsSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						saldoscuentasporpagarsSeleccionados.addAll(this.saldoscuentasporpagarLogic.getSaldosCuentasPorPagars());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						saldoscuentasporpagarsSeleccionados.addAll(this.saldoscuentasporpagars);				
					}
				}
			}
		} else {
			saldoscuentasporpagarsSeleccionados.add(this.saldoscuentasporpagar);
		}
		
		return saldoscuentasporpagarsSeleccionados;
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
	
	public void generarReporteSaldosCuentasPorPagarsSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalSaldosCuentasPorPagarsSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoSaldosCuentasPorPagarsSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoSaldosCuentasPorPagarsSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoSaldosCuentasPorPagarsSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Saldos Cuentas Por Pagar",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesSaldosCuentasPorPagarsSeleccionados() throws Exception {
		ArrayList<SaldosCuentasPorPagar> saldoscuentasporpagarsSeleccionados=new ArrayList<SaldosCuentasPorPagar>();		
		
		saldoscuentasporpagarsSeleccionados=this.getSaldosCuentasPorPagarsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteSaldosCuentasPorPagars("Todos",saldoscuentasporpagarsSeleccionados);
		
	}	
	
	public void generarReporteNormalSaldosCuentasPorPagarsSeleccionados() throws Exception {
		ArrayList<SaldosCuentasPorPagar> saldoscuentasporpagarsSeleccionados=new ArrayList<SaldosCuentasPorPagar>();		
		
		saldoscuentasporpagarsSeleccionados=this.getSaldosCuentasPorPagarsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteSaldosCuentasPorPagars("Todos",saldoscuentasporpagarsSeleccionados);
	}		
	
	public void generarReporteProcesoAccionSaldosCuentasPorPagarsSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<SaldosCuentasPorPagar> saldoscuentasporpagarsSeleccionados=new ArrayList<SaldosCuentasPorPagar>();
		
		saldoscuentasporpagarsSeleccionados=this.getSaldosCuentasPorPagarsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteSaldosCuentasPorPagars("Todos",saldoscuentasporpagarsSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoSaldosCuentasPorPagarsSeleccionados() throws Exception {
		ArrayList<SaldosCuentasPorPagar> saldoscuentasporpagarsSeleccionados=new ArrayList<SaldosCuentasPorPagar>();		
		
		
		this.abrirInicializarFrameReporteDinamicoSaldosCuentasPorPagar();
		
		
		saldoscuentasporpagarsSeleccionados=this.getSaldosCuentasPorPagarsSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoSaldosCuentasPorPagar();
		
		
		//this.generarReporteSaldosCuentasPorPagars("Todos",saldoscuentasporpagarsSeleccionados ,saldoscuentasporpagarImplementable,saldoscuentasporpagarImplementableHome);
	}
	
	public void mostrarImportacionSaldosCuentasPorPagars() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionSaldosCuentasPorPagar();
		
		this.abrirFrameImportacionSaldosCuentasPorPagar();		
		
			
		//this.generarReporteSaldosCuentasPorPagars("Todos",saldoscuentasporpagarsSeleccionados ,saldoscuentasporpagarImplementable,saldoscuentasporpagarImplementableHome);
	}
	
	public void importarSaldosCuentasPorPagars() throws Exception {		
	
	}
	
	public void exportarSaldosCuentasPorPagarsSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelSaldosCuentasPorPagarsSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoSaldosCuentasPorPagarsSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlSaldosCuentasPorPagarsSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Saldos Cuentas Por Pagar",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoSaldosCuentasPorPagarsSeleccionados() throws Exception {
		ArrayList<SaldosCuentasPorPagar> saldoscuentasporpagarsSeleccionados=new ArrayList<SaldosCuentasPorPagar>();		
		
		saldoscuentasporpagarsSeleccionados=this.getSaldosCuentasPorPagarsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"saldoscuentasporpagar."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarSaldosCuentasPorPagar(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(SaldosCuentasPorPagar saldoscuentasporpagarAux:saldoscuentasporpagarsSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarSaldosCuentasPorPagar(saldoscuentasporpagarAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//saldoscuentasporpagarAux.setsDetalleGeneralEntityReporte(saldoscuentasporpagarAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.saldoscuentasporpagarSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Saldos Cuentas Por Pagar",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarSaldosCuentasPorPagar(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=SaldosCuentasPorPagarConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=SaldosCuentasPorPagarConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=SaldosCuentasPorPagarConstantesFunciones.LABEL_IDZONA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=SaldosCuentasPorPagarConstantesFunciones.LABEL_IDGRUPOCLIENTE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=SaldosCuentasPorPagarConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=SaldosCuentasPorPagarConstantesFunciones.LABEL_IDSUCURSAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=SaldosCuentasPorPagarConstantesFunciones.LABEL_IDCLIENTE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=SaldosCuentasPorPagarConstantesFunciones.LABEL_FECHAEMISIONHASTA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=SaldosCuentasPorPagarConstantesFunciones.LABEL_CODIGO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=SaldosCuentasPorPagarConstantesFunciones.LABEL_NOMBRECOMPLETO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=SaldosCuentasPorPagarConstantesFunciones.LABEL_DEBITOMONELOCAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=SaldosCuentasPorPagarConstantesFunciones.LABEL_CREDITOMONELOCAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=SaldosCuentasPorPagarConstantesFunciones.LABEL_SALDOANTERIOR;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=SaldosCuentasPorPagarConstantesFunciones.LABEL_SALDODEBITO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=SaldosCuentasPorPagarConstantesFunciones.LABEL_SALDOCREDITO;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarSaldosCuentasPorPagar(SaldosCuentasPorPagar saldoscuentasporpagar,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=saldoscuentasporpagar.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=saldoscuentasporpagar.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=saldoscuentasporpagar.getzona_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=saldoscuentasporpagar.getgrupocliente_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=saldoscuentasporpagar.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=saldoscuentasporpagar.getsucursal_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=saldoscuentasporpagar.getcliente_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=saldoscuentasporpagar.getfecha_emision_hasta().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=saldoscuentasporpagar.getcodigo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=saldoscuentasporpagar.getnombre_completo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=saldoscuentasporpagar.getdebito_mone_local().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=saldoscuentasporpagar.getcredito_mone_local().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=saldoscuentasporpagar.getsaldo_anterior().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=saldoscuentasporpagar.getsaldo_debito().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=saldoscuentasporpagar.getsaldo_credito().toString();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelSaldosCuentasPorPagarsSeleccionados() throws Exception {
		ArrayList<SaldosCuentasPorPagar> saldoscuentasporpagarsSeleccionados=new ArrayList<SaldosCuentasPorPagar>();		
		
		saldoscuentasporpagarsSeleccionados=this.getSaldosCuentasPorPagarsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"saldoscuentasporpagar.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("SaldosCuentasPorPagars");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelSaldosCuentasPorPagar(row);				
				iRow++;
			}				
			
			for(SaldosCuentasPorPagar saldoscuentasporpagarAux:saldoscuentasporpagarsSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelSaldosCuentasPorPagar(saldoscuentasporpagarAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.saldoscuentasporpagarSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Saldos Cuentas Por Pagar",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlSaldosCuentasPorPagarsSeleccionados() throws Exception {
		ArrayList<SaldosCuentasPorPagar> saldoscuentasporpagarsSeleccionados=new ArrayList<SaldosCuentasPorPagar>();		
		
		saldoscuentasporpagarsSeleccionados=this.getSaldosCuentasPorPagarsSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"saldoscuentasporpagar.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("saldoscuentasporpagars");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("saldoscuentasporpagar");
			//elementRoot.appendChild(element);
		
			for(SaldosCuentasPorPagar saldoscuentasporpagarAux:saldoscuentasporpagarsSeleccionados) {
				element = document.createElement("saldoscuentasporpagar");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlSaldosCuentasPorPagar(saldoscuentasporpagarAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.saldoscuentasporpagarSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Saldos Cuentas Por Pagar",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelSaldosCuentasPorPagar(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(SaldosCuentasPorPagarConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(SaldosCuentasPorPagarConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(SaldosCuentasPorPagarConstantesFunciones.LABEL_IDZONA);
		cell = row.createCell(iColumn++);cell.setCellValue(SaldosCuentasPorPagarConstantesFunciones.LABEL_IDGRUPOCLIENTE);
		cell = row.createCell(iColumn++);cell.setCellValue(SaldosCuentasPorPagarConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(SaldosCuentasPorPagarConstantesFunciones.LABEL_IDSUCURSAL);
		cell = row.createCell(iColumn++);cell.setCellValue(SaldosCuentasPorPagarConstantesFunciones.LABEL_IDCLIENTE);
		cell = row.createCell(iColumn++);cell.setCellValue(SaldosCuentasPorPagarConstantesFunciones.LABEL_FECHAEMISIONHASTA);
		cell = row.createCell(iColumn++);cell.setCellValue(SaldosCuentasPorPagarConstantesFunciones.LABEL_CODIGO);
		cell = row.createCell(iColumn++);cell.setCellValue(SaldosCuentasPorPagarConstantesFunciones.LABEL_NOMBRECOMPLETO);
		cell = row.createCell(iColumn++);cell.setCellValue(SaldosCuentasPorPagarConstantesFunciones.LABEL_DEBITOMONELOCAL);
		cell = row.createCell(iColumn++);cell.setCellValue(SaldosCuentasPorPagarConstantesFunciones.LABEL_CREDITOMONELOCAL);
		cell = row.createCell(iColumn++);cell.setCellValue(SaldosCuentasPorPagarConstantesFunciones.LABEL_SALDOANTERIOR);
		cell = row.createCell(iColumn++);cell.setCellValue(SaldosCuentasPorPagarConstantesFunciones.LABEL_SALDODEBITO);
		cell = row.createCell(iColumn++);cell.setCellValue(SaldosCuentasPorPagarConstantesFunciones.LABEL_SALDOCREDITO);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelSaldosCuentasPorPagar(SaldosCuentasPorPagar saldoscuentasporpagar,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(saldoscuentasporpagar.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(saldoscuentasporpagar.getzona_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(saldoscuentasporpagar.getgrupocliente_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(saldoscuentasporpagar.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(saldoscuentasporpagar.getsucursal_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(saldoscuentasporpagar.getcliente_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(saldoscuentasporpagar.getfecha_emision_hasta());
		cell = row.createCell(iColumn++);cell.setCellValue(saldoscuentasporpagar.getcodigo());
		cell = row.createCell(iColumn++);cell.setCellValue(saldoscuentasporpagar.getnombre_completo());
		cell = row.createCell(iColumn++);cell.setCellValue(saldoscuentasporpagar.getdebito_mone_local());
		cell = row.createCell(iColumn++);cell.setCellValue(saldoscuentasporpagar.getcredito_mone_local());
		cell = row.createCell(iColumn++);cell.setCellValue(saldoscuentasporpagar.getsaldo_anterior());
		cell = row.createCell(iColumn++);cell.setCellValue(saldoscuentasporpagar.getsaldo_debito());
		cell = row.createCell(iColumn++);cell.setCellValue(saldoscuentasporpagar.getsaldo_credito());				
	}
	
	public void setFilaDatosExportarXmlSaldosCuentasPorPagar(SaldosCuentasPorPagar saldoscuentasporpagar,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(SaldosCuentasPorPagarConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(saldoscuentasporpagar.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(SaldosCuentasPorPagarConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(saldoscuentasporpagar.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementzona_descripcion = document.createElement(SaldosCuentasPorPagarConstantesFunciones.IDZONA);
		elementzona_descripcion.appendChild(document.createTextNode(saldoscuentasporpagar.getzona_descripcion()));
		element.appendChild(elementzona_descripcion);

		Element elementgrupocliente_descripcion = document.createElement(SaldosCuentasPorPagarConstantesFunciones.IDGRUPOCLIENTE);
		elementgrupocliente_descripcion.appendChild(document.createTextNode(saldoscuentasporpagar.getgrupocliente_descripcion()));
		element.appendChild(elementgrupocliente_descripcion);

		Element elementempresa_descripcion = document.createElement(SaldosCuentasPorPagarConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(saldoscuentasporpagar.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementsucursal_descripcion = document.createElement(SaldosCuentasPorPagarConstantesFunciones.IDSUCURSAL);
		elementsucursal_descripcion.appendChild(document.createTextNode(saldoscuentasporpagar.getsucursal_descripcion()));
		element.appendChild(elementsucursal_descripcion);

		Element elementcliente_descripcion = document.createElement(SaldosCuentasPorPagarConstantesFunciones.IDCLIENTE);
		elementcliente_descripcion.appendChild(document.createTextNode(saldoscuentasporpagar.getcliente_descripcion()));
		element.appendChild(elementcliente_descripcion);

		Element elementfecha_emision_hasta = document.createElement(SaldosCuentasPorPagarConstantesFunciones.FECHAEMISIONHASTA);
		elementfecha_emision_hasta.appendChild(document.createTextNode(saldoscuentasporpagar.getfecha_emision_hasta().toString().trim()));
		element.appendChild(elementfecha_emision_hasta);

		Element elementcodigo = document.createElement(SaldosCuentasPorPagarConstantesFunciones.CODIGO);
		elementcodigo.appendChild(document.createTextNode(saldoscuentasporpagar.getcodigo().trim()));
		element.appendChild(elementcodigo);

		Element elementnombre_completo = document.createElement(SaldosCuentasPorPagarConstantesFunciones.NOMBRECOMPLETO);
		elementnombre_completo.appendChild(document.createTextNode(saldoscuentasporpagar.getnombre_completo().trim()));
		element.appendChild(elementnombre_completo);

		Element elementdebito_mone_local = document.createElement(SaldosCuentasPorPagarConstantesFunciones.DEBITOMONELOCAL);
		elementdebito_mone_local.appendChild(document.createTextNode(saldoscuentasporpagar.getdebito_mone_local().toString().trim()));
		element.appendChild(elementdebito_mone_local);

		Element elementcredito_mone_local = document.createElement(SaldosCuentasPorPagarConstantesFunciones.CREDITOMONELOCAL);
		elementcredito_mone_local.appendChild(document.createTextNode(saldoscuentasporpagar.getcredito_mone_local().toString().trim()));
		element.appendChild(elementcredito_mone_local);

		Element elementsaldo_anterior = document.createElement(SaldosCuentasPorPagarConstantesFunciones.SALDOANTERIOR);
		elementsaldo_anterior.appendChild(document.createTextNode(saldoscuentasporpagar.getsaldo_anterior().toString().trim()));
		element.appendChild(elementsaldo_anterior);

		Element elementsaldo_debito = document.createElement(SaldosCuentasPorPagarConstantesFunciones.SALDODEBITO);
		elementsaldo_debito.appendChild(document.createTextNode(saldoscuentasporpagar.getsaldo_debito().toString().trim()));
		element.appendChild(elementsaldo_debito);

		Element elementsaldo_credito = document.createElement(SaldosCuentasPorPagarConstantesFunciones.SALDOCREDITO);
		elementsaldo_credito.appendChild(document.createTextNode(saldoscuentasporpagar.getsaldo_credito().toString().trim()));
		element.appendChild(elementsaldo_credito);
	}
	
	public void generarReporteGroupGenericoSaldosCuentasPorPagarsSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<SaldosCuentasPorPagar> saldoscuentasporpagarsSeleccionados=new ArrayList<SaldosCuentasPorPagar>();
		
		saldoscuentasporpagarsSeleccionados=this.getSaldosCuentasPorPagarsSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoSaldosCuentasPorPagar(saldoscuentasporpagarsSeleccionados);
		
		this.generarReporteSaldosCuentasPorPagars("Todos",saldoscuentasporpagarsSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoSaldosCuentasPorPagar(ArrayList<SaldosCuentasPorPagar> saldoscuentasporpagarsSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(SaldosCuentasPorPagar saldoscuentasporpagarAux:saldoscuentasporpagarsSeleccionados) {
				saldoscuentasporpagarAux.setsDetalleGeneralEntityReporte(saldoscuentasporpagarAux.toString());
			
				if(sTipoSeleccionar.equals(SaldosCuentasPorPagarConstantesFunciones.LABEL_IDZONA)) {
					existe=true;
					saldoscuentasporpagarAux.setsDescripcionGeneralEntityReporte1(saldoscuentasporpagarAux.getzona_descripcion());
				}
				 else if(sTipoSeleccionar.equals(SaldosCuentasPorPagarConstantesFunciones.LABEL_IDGRUPOCLIENTE)) {
					existe=true;
					saldoscuentasporpagarAux.setsDescripcionGeneralEntityReporte1(saldoscuentasporpagarAux.getgrupocliente_descripcion());
				}
				 else if(sTipoSeleccionar.equals(SaldosCuentasPorPagarConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					saldoscuentasporpagarAux.setsDescripcionGeneralEntityReporte1(saldoscuentasporpagarAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(SaldosCuentasPorPagarConstantesFunciones.LABEL_IDSUCURSAL)) {
					existe=true;
					saldoscuentasporpagarAux.setsDescripcionGeneralEntityReporte1(saldoscuentasporpagarAux.getsucursal_descripcion());
				}
				 else if(sTipoSeleccionar.equals(SaldosCuentasPorPagarConstantesFunciones.LABEL_IDCLIENTE)) {
					existe=true;
					saldoscuentasporpagarAux.setsDescripcionGeneralEntityReporte1(saldoscuentasporpagarAux.getcliente_descripcion());
				}
				 else if(sTipoSeleccionar.equals(SaldosCuentasPorPagarConstantesFunciones.LABEL_FECHAEMISIONHASTA)) {
					existe=true;
					saldoscuentasporpagarAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(saldoscuentasporpagarAux.getfecha_emision_hasta()));
				}
				 else if(sTipoSeleccionar.equals(SaldosCuentasPorPagarConstantesFunciones.LABEL_CODIGO)) {
					existe=true;
					saldoscuentasporpagarAux.setsDescripcionGeneralEntityReporte1(saldoscuentasporpagarAux.getcodigo());
				}
				 else if(sTipoSeleccionar.equals(SaldosCuentasPorPagarConstantesFunciones.LABEL_NOMBRECOMPLETO)) {
					existe=true;
					saldoscuentasporpagarAux.setsDescripcionGeneralEntityReporte1(saldoscuentasporpagarAux.getnombre_completo());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SaldosCuentasPorPagarConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesSaldosCuentasPorPagar(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoSaldosCuentasPorPagar=true;
				this.isVisibilidadCeldaNuevoRelacionesSaldosCuentasPorPagar=true;
				this.isVisibilidadCeldaGuardarCambiosSaldosCuentasPorPagar=true;
			}
			
			this.isVisibilidadCeldaModificarSaldosCuentasPorPagar=false;
			this.isVisibilidadCeldaActualizarSaldosCuentasPorPagar=false;
			this.isVisibilidadCeldaEliminarSaldosCuentasPorPagar=false;
			this.isVisibilidadCeldaCancelarSaldosCuentasPorPagar=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarSaldosCuentasPorPagar=true;
				} else {
					this.isVisibilidadCeldaGuardarSaldosCuentasPorPagar=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoSaldosCuentasPorPagar=false;
			this.isVisibilidadCeldaNuevoRelacionesSaldosCuentasPorPagar=false;
			this.isVisibilidadCeldaGuardarCambiosSaldosCuentasPorPagar=false;
			this.isVisibilidadCeldaModificarSaldosCuentasPorPagar=false;
			this.isVisibilidadCeldaActualizarSaldosCuentasPorPagar=true;
			this.isVisibilidadCeldaEliminarSaldosCuentasPorPagar=false;
			this.isVisibilidadCeldaCancelarSaldosCuentasPorPagar=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarSaldosCuentasPorPagar=true;
				} else {
					this.isVisibilidadCeldaGuardarSaldosCuentasPorPagar=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoSaldosCuentasPorPagar=false;
			this.isVisibilidadCeldaNuevoRelacionesSaldosCuentasPorPagar=false;
			this.isVisibilidadCeldaGuardarCambiosSaldosCuentasPorPagar=false;
			this.isVisibilidadCeldaModificarSaldosCuentasPorPagar=false;
			this.isVisibilidadCeldaActualizarSaldosCuentasPorPagar=true;
			this.isVisibilidadCeldaEliminarSaldosCuentasPorPagar=true;
			this.isVisibilidadCeldaCancelarSaldosCuentasPorPagar=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarSaldosCuentasPorPagar=true;
				} else {
					this.isVisibilidadCeldaGuardarSaldosCuentasPorPagar=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoSaldosCuentasPorPagar=false;
			this.isVisibilidadCeldaNuevoRelacionesSaldosCuentasPorPagar=false;
			this.isVisibilidadCeldaGuardarCambiosSaldosCuentasPorPagar=false;
			this.isVisibilidadCeldaModificarSaldosCuentasPorPagar=false;
			this.isVisibilidadCeldaActualizarSaldosCuentasPorPagar=true;
			this.isVisibilidadCeldaEliminarSaldosCuentasPorPagar=false;
			this.isVisibilidadCeldaCancelarSaldosCuentasPorPagar=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarSaldosCuentasPorPagar=false;
				} else {
					this.isVisibilidadCeldaGuardarSaldosCuentasPorPagar=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoSaldosCuentasPorPagar=true;
			this.isVisibilidadCeldaNuevoRelacionesSaldosCuentasPorPagar=true;
			this.isVisibilidadCeldaGuardarCambiosSaldosCuentasPorPagar=true;
			this.isVisibilidadCeldaModificarSaldosCuentasPorPagar=false;
			this.isVisibilidadCeldaActualizarSaldosCuentasPorPagar=false;
			this.isVisibilidadCeldaEliminarSaldosCuentasPorPagar=false;
			this.isVisibilidadCeldaCancelarSaldosCuentasPorPagar=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarSaldosCuentasPorPagar=true;
				} else {
					this.isVisibilidadCeldaGuardarSaldosCuentasPorPagar=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoSaldosCuentasPorPagar=false;
			this.isVisibilidadCeldaNuevoRelacionesSaldosCuentasPorPagar=false;
			this.isVisibilidadCeldaGuardarCambiosSaldosCuentasPorPagar=false;
			this.isVisibilidadCeldaActualizarSaldosCuentasPorPagar=false;
			this.isVisibilidadCeldaEliminarSaldosCuentasPorPagar=false;
			this.isVisibilidadCeldaCancelarSaldosCuentasPorPagar=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarSaldosCuentasPorPagar=false;
				} else {
					this.isVisibilidadCeldaGuardarSaldosCuentasPorPagar=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoSaldosCuentasPorPagar=false;
			this.isVisibilidadCeldaNuevoRelacionesSaldosCuentasPorPagar=false;
			this.isVisibilidadCeldaGuardarCambiosSaldosCuentasPorPagar=false;
			this.isVisibilidadCeldaModificarSaldosCuentasPorPagar=true;
			this.isVisibilidadCeldaActualizarSaldosCuentasPorPagar=false;
			this.isVisibilidadCeldaEliminarSaldosCuentasPorPagar=false;
			this.isVisibilidadCeldaCancelarSaldosCuentasPorPagar=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarSaldosCuentasPorPagar=false;
				} else {
					this.isVisibilidadCeldaGuardarSaldosCuentasPorPagar=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(SaldosCuentasPorPagarJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoSaldosCuentasPorPagar=true;
			this.isVisibilidadCeldaNuevoRelacionesSaldosCuentasPorPagar=true;
			this.isVisibilidadCeldaGuardarCambiosSaldosCuentasPorPagar=true;
		} else {
			this.actualizarEstadoPanelsSaldosCuentasPorPagar(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarSaldosCuentasPorPagar=false;
			//this.isVisibilidadCeldaVerFormSaldosCuentasPorPagar=false;
			this.isVisibilidadCeldaDuplicarSaldosCuentasPorPagar=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!saldoscuentasporpagarSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesSaldosCuentasPorPagar=false;
		} else {
			this.isVisibilidadCeldaNuevoSaldosCuentasPorPagar=false;
			this.isVisibilidadCeldaGuardarCambiosSaldosCuentasPorPagar=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(saldoscuentasporpagarSessionBean.getEsGuardarRelacionado()) {
			if(!saldoscuentasporpagarSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesSaldosCuentasPorPagar=false;												
			}
			
			this.jButtonCerrarSaldosCuentasPorPagar.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesSaldosCuentasPorPagar=false;
		}
		
		if(!this.permiteMantenimiento(this.saldoscuentasporpagar)) {
			this.isVisibilidadCeldaActualizarSaldosCuentasPorPagar=false;
			this.isVisibilidadCeldaEliminarSaldosCuentasPorPagar=false;
		}
		
		
		//SE DESHABILITA SIEMPRE
		this.isVisibilidadCeldaNuevoSaldosCuentasPorPagar=false;
		this.isVisibilidadCeldaNuevoRelacionesSaldosCuentasPorPagar=false;
		this.isVisibilidadCeldaGuardarCambiosSaldosCuentasPorPagar=false;
		//this.isVisibilidadCeldaModificarSaldosCuentasPorPagar=true;
		this.isVisibilidadCeldaActualizarSaldosCuentasPorPagar=false;
		this.isVisibilidadCeldaEliminarSaldosCuentasPorPagar=false;
		//this.isVisibilidadCeldaCancelarSaldosCuentasPorPagar=true;			
		this.isVisibilidadCeldaGuardarSaldosCuentasPorPagar=false;
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesSaldosCuentasPorPagar() {
	}
	
	public void actualizarEstadoPanelsSaldosCuentasPorPagar(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionSaldosCuentasPorPagar!=null) {
				this.jScrollPanelDatosEdicionSaldosCuentasPorPagar.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasSaldosCuentasPorPagar!=null) {
				this.jTabbedPaneBusquedasSaldosCuentasPorPagar.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosSaldosCuentasPorPagar!=null) {
				this.jScrollPanelDatosSaldosCuentasPorPagar.setVisible(true);
			}
			
			if(this.jPanelPaginacionSaldosCuentasPorPagar!=null) {
				this.jPanelPaginacionSaldosCuentasPorPagar.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesSaldosCuentasPorPagar!=null) {
				this.jPanelParametrosReportesSaldosCuentasPorPagar.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionSaldosCuentasPorPagar!=null) {
				this.jScrollPanelDatosEdicionSaldosCuentasPorPagar.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasSaldosCuentasPorPagar!=null) {
				this.jTabbedPaneBusquedasSaldosCuentasPorPagar.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosSaldosCuentasPorPagar!=null) {
				this.jScrollPanelDatosSaldosCuentasPorPagar.setVisible(false);
			}
			
			if(this.jPanelPaginacionSaldosCuentasPorPagar!=null) {
				this.jPanelPaginacionSaldosCuentasPorPagar.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesSaldosCuentasPorPagar!=null) {
				this.jPanelParametrosReportesSaldosCuentasPorPagar.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionSaldosCuentasPorPagar!=null) {
				this.jScrollPanelDatosEdicionSaldosCuentasPorPagar.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasSaldosCuentasPorPagar!=null) {
				this.jTabbedPaneBusquedasSaldosCuentasPorPagar.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosSaldosCuentasPorPagar!=null) {
				this.jScrollPanelDatosSaldosCuentasPorPagar.setVisible(false);
			}
			
			if(this.jPanelPaginacionSaldosCuentasPorPagar!=null) {
				this.jPanelPaginacionSaldosCuentasPorPagar.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesSaldosCuentasPorPagar!=null) {
				this.jPanelParametrosReportesSaldosCuentasPorPagar.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionSaldosCuentasPorPagar!=null) {
				this.jScrollPanelDatosEdicionSaldosCuentasPorPagar.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasSaldosCuentasPorPagar!=null) {
				this.jTabbedPaneBusquedasSaldosCuentasPorPagar.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosSaldosCuentasPorPagar!=null) {
				this.jScrollPanelDatosSaldosCuentasPorPagar.setVisible(false);
			}
			
			if(this.jPanelPaginacionSaldosCuentasPorPagar!=null) {
				this.jPanelPaginacionSaldosCuentasPorPagar.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesSaldosCuentasPorPagar!=null) {
				this.jPanelParametrosReportesSaldosCuentasPorPagar.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionSaldosCuentasPorPagar!=null) {
				this.jScrollPanelDatosEdicionSaldosCuentasPorPagar.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasSaldosCuentasPorPagar!=null) {
				this.jTabbedPaneBusquedasSaldosCuentasPorPagar.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosSaldosCuentasPorPagar!=null) {
				this.jScrollPanelDatosSaldosCuentasPorPagar.setVisible(true);
			}
			
			if(this.jPanelPaginacionSaldosCuentasPorPagar!=null) {
				this.jPanelPaginacionSaldosCuentasPorPagar.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesSaldosCuentasPorPagar!=null) {
				this.jPanelParametrosReportesSaldosCuentasPorPagar.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionSaldosCuentasPorPagar!=null) {
				this.jScrollPanelDatosEdicionSaldosCuentasPorPagar.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasSaldosCuentasPorPagar!=null) {
				this.jTabbedPaneBusquedasSaldosCuentasPorPagar.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosSaldosCuentasPorPagar!=null) {
				this.jScrollPanelDatosSaldosCuentasPorPagar.setVisible(true);
			}
			
			if(this.jPanelPaginacionSaldosCuentasPorPagar!=null) {
				this.jPanelPaginacionSaldosCuentasPorPagar.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesSaldosCuentasPorPagar!=null) {
				this.jPanelParametrosReportesSaldosCuentasPorPagar.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionSaldosCuentasPorPagar!=null) {
				this.jScrollPanelDatosEdicionSaldosCuentasPorPagar.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasSaldosCuentasPorPagar!=null) {
				this.jTabbedPaneBusquedasSaldosCuentasPorPagar.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosSaldosCuentasPorPagar!=null) {
				this.jScrollPanelDatosSaldosCuentasPorPagar.setVisible(true);
			}
			
			if(this.jPanelPaginacionSaldosCuentasPorPagar!=null) {
				this.jPanelPaginacionSaldosCuentasPorPagar.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesSaldosCuentasPorPagar!=null) {
				this.jPanelParametrosReportesSaldosCuentasPorPagar.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.saldoscuentasporpagarSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasSaldosCuentasPorPagar!=null) {
					this.jTabbedPaneBusquedasSaldosCuentasPorPagar.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesSaldosCuentasPorPagar!=null) {
				this.jPanelParametrosReportesSaldosCuentasPorPagar.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.saldoscuentasporpagarSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasSaldosCuentasPorPagar!=null) {
				this.jTabbedPaneBusquedasSaldosCuentasPorPagar.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesSaldosCuentasPorPagar!=null) {
				this.jPanelParametrosReportesSaldosCuentasPorPagar.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaZona(Boolean isParaZona){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaZonaNegation=!isParaZona;

			this.isVisibilidadBusquedaSaldosCuentasPorPagar=isParaZona;
			if(!this.isVisibilidadBusquedaSaldosCuentasPorPagar) {this.jTabbedPaneBusquedasSaldosCuentasPorPagar.remove(jPanelBusquedaSaldosCuentasPorPagarSaldosCuentasPorPagar);}
		}
		
	}

	public void setVisibilidadBusquedasParaGrupoCliente(Boolean isParaGrupoCliente){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaGrupoClienteNegation=!isParaGrupoCliente;

			this.isVisibilidadBusquedaSaldosCuentasPorPagar=isParaGrupoCliente;
			if(!this.isVisibilidadBusquedaSaldosCuentasPorPagar) {this.jTabbedPaneBusquedasSaldosCuentasPorPagar.remove(jPanelBusquedaSaldosCuentasPorPagarSaldosCuentasPorPagar);}
		}
		
	}

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadBusquedaSaldosCuentasPorPagar=isParaEmpresaNegation;
			if(!this.isVisibilidadBusquedaSaldosCuentasPorPagar) {this.jTabbedPaneBusquedasSaldosCuentasPorPagar.remove(jPanelBusquedaSaldosCuentasPorPagarSaldosCuentasPorPagar);}
		}
		
	}

	public void setVisibilidadBusquedasParaSucursal(Boolean isParaSucursal){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaSucursalNegation=!isParaSucursal;

			this.isVisibilidadBusquedaSaldosCuentasPorPagar=isParaSucursalNegation;
			if(!this.isVisibilidadBusquedaSaldosCuentasPorPagar) {this.jTabbedPaneBusquedasSaldosCuentasPorPagar.remove(jPanelBusquedaSaldosCuentasPorPagarSaldosCuentasPorPagar);}
		}
		
	}

	public void setVisibilidadBusquedasParaCliente(Boolean isParaCliente){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaClienteNegation=!isParaCliente;

			this.isVisibilidadBusquedaSaldosCuentasPorPagar=isParaCliente;
			if(!this.isVisibilidadBusquedaSaldosCuentasPorPagar) {this.jTabbedPaneBusquedasSaldosCuentasPorPagar.remove(jPanelBusquedaSaldosCuentasPorPagarSaldosCuentasPorPagar);}
		}
		
	}
	
	
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaSaldosCuentasPorPagar(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioSaldosCuentasPorPagar() {
		this.updateBorderResaltarBusquedasFormularioSaldosCuentasPorPagar();
		this.updateVisibilidadBusquedasFormularioSaldosCuentasPorPagar();
		this.updateHabilitarBusquedasFormularioSaldosCuentasPorPagar();
	}
	
	public void updateBorderResaltarBusquedasFormularioSaldosCuentasPorPagar() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasSaldosCuentasPorPagar.getComponents().length>0) {
	

		if(this.saldoscuentasporpagarConstantesFunciones.resaltarBusquedaSaldosCuentasPorPagarSaldosCuentasPorPagar!=null) {
			index= this.jTabbedPaneBusquedasSaldosCuentasPorPagar.indexOfComponent(this.jPanelBusquedaSaldosCuentasPorPagarSaldosCuentasPorPagar);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasSaldosCuentasPorPagar.getComponent(index);
				jPanel.setBorder(this.saldoscuentasporpagarConstantesFunciones.resaltarBusquedaSaldosCuentasPorPagarSaldosCuentasPorPagar);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioSaldosCuentasPorPagar() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasSaldosCuentasPorPagar.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasSaldosCuentasPorPagar.indexOfComponent(this.jPanelBusquedaSaldosCuentasPorPagarSaldosCuentasPorPagar);
			jPanel=(JPanel)this.jTabbedPaneBusquedasSaldosCuentasPorPagar.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.saldoscuentasporpagarConstantesFunciones.mostrarBusquedaSaldosCuentasPorPagarSaldosCuentasPorPagar);
			if(!this.saldoscuentasporpagarConstantesFunciones.mostrarBusquedaSaldosCuentasPorPagarSaldosCuentasPorPagar && index>-1) {
				this.jTabbedPaneBusquedasSaldosCuentasPorPagar.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioSaldosCuentasPorPagar() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasSaldosCuentasPorPagar.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasSaldosCuentasPorPagar.indexOfComponent(this.jPanelBusquedaSaldosCuentasPorPagarSaldosCuentasPorPagar);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasSaldosCuentasPorPagar.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.saldoscuentasporpagarConstantesFunciones.activarBusquedaSaldosCuentasPorPagarSaldosCuentasPorPagar);
				this.jTabbedPaneBusquedasSaldosCuentasPorPagar.setEnabledAt(index,this.saldoscuentasporpagarConstantesFunciones.activarBusquedaSaldosCuentasPorPagarSaldosCuentasPorPagar);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaSaldosCuentasPorPagar(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("BusquedaSaldosCuentasPorPagar")) {
			index= this.jTabbedPaneBusquedasSaldosCuentasPorPagar.indexOfComponent(this.jPanelBusquedaSaldosCuentasPorPagarSaldosCuentasPorPagar);

			this.jTabbedPaneBusquedasSaldosCuentasPorPagar.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasSaldosCuentasPorPagar.getComponent(index);

			this.saldoscuentasporpagarConstantesFunciones.setResaltarBusquedaSaldosCuentasPorPagarSaldosCuentasPorPagar(resaltar);

			jPanel.setBorder(this.saldoscuentasporpagarConstantesFunciones.resaltarBusquedaSaldosCuentasPorPagarSaldosCuentasPorPagar);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarSaldosCuentasPorPagar.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioSaldosCuentasPorPagar() throws Exception {

		if(this.jInternalFrameDetalleFormSaldosCuentasPorPagar==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioSaldosCuentasPorPagar();
		this.updateVisibilidadResaltarControlesFormularioSaldosCuentasPorPagar();
		this.updateHabilitarResaltarControlesFormularioSaldosCuentasPorPagar();
		
	}
	
	public void updateBorderResaltarControlesFormularioSaldosCuentasPorPagar() throws Exception {
		if(this.jInternalFrameDetalleFormSaldosCuentasPorPagar==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.saldoscuentasporpagarConstantesFunciones.resaltaridSaldosCuentasPorPagar!=null && this.jInternalFrameDetalleFormSaldosCuentasPorPagar!=null) {this.jInternalFrameDetalleFormSaldosCuentasPorPagar.jLabelidSaldosCuentasPorPagar.setBorder(this.saldoscuentasporpagarConstantesFunciones.resaltaridSaldosCuentasPorPagar);}
		if(this.saldoscuentasporpagarConstantesFunciones.resaltarid_zonaSaldosCuentasPorPagar!=null && this.jInternalFrameDetalleFormSaldosCuentasPorPagar!=null) {this.jInternalFrameDetalleFormSaldosCuentasPorPagar.jComboBoxid_zonaSaldosCuentasPorPagar.setBorder(this.saldoscuentasporpagarConstantesFunciones.resaltarid_zonaSaldosCuentasPorPagar);}
		if(this.saldoscuentasporpagarConstantesFunciones.resaltarid_grupo_clienteSaldosCuentasPorPagar!=null && this.jInternalFrameDetalleFormSaldosCuentasPorPagar!=null) {this.jInternalFrameDetalleFormSaldosCuentasPorPagar.jComboBoxid_grupo_clienteSaldosCuentasPorPagar.setBorder(this.saldoscuentasporpagarConstantesFunciones.resaltarid_grupo_clienteSaldosCuentasPorPagar);}
		if(this.saldoscuentasporpagarConstantesFunciones.resaltarid_empresaSaldosCuentasPorPagar!=null && this.jInternalFrameDetalleFormSaldosCuentasPorPagar!=null) {this.jInternalFrameDetalleFormSaldosCuentasPorPagar.jComboBoxid_empresaSaldosCuentasPorPagar.setBorder(this.saldoscuentasporpagarConstantesFunciones.resaltarid_empresaSaldosCuentasPorPagar);}
		if(this.saldoscuentasporpagarConstantesFunciones.resaltarid_sucursalSaldosCuentasPorPagar!=null && this.jInternalFrameDetalleFormSaldosCuentasPorPagar!=null) {this.jInternalFrameDetalleFormSaldosCuentasPorPagar.jComboBoxid_sucursalSaldosCuentasPorPagar.setBorder(this.saldoscuentasporpagarConstantesFunciones.resaltarid_sucursalSaldosCuentasPorPagar);}
		if(this.saldoscuentasporpagarConstantesFunciones.resaltarid_clienteSaldosCuentasPorPagar!=null && this.jInternalFrameDetalleFormSaldosCuentasPorPagar!=null) {this.jInternalFrameDetalleFormSaldosCuentasPorPagar.jComboBoxid_clienteSaldosCuentasPorPagar.setBorder(this.saldoscuentasporpagarConstantesFunciones.resaltarid_clienteSaldosCuentasPorPagar);}
		if(this.saldoscuentasporpagarConstantesFunciones.resaltarfecha_emision_hastaSaldosCuentasPorPagar!=null && this.jInternalFrameDetalleFormSaldosCuentasPorPagar!=null) {this.jInternalFrameDetalleFormSaldosCuentasPorPagar.jDateChooserfecha_emision_hastaSaldosCuentasPorPagar.setBorder(this.saldoscuentasporpagarConstantesFunciones.resaltarfecha_emision_hastaSaldosCuentasPorPagar);}
		if(this.saldoscuentasporpagarConstantesFunciones.resaltarcodigoSaldosCuentasPorPagar!=null && this.jInternalFrameDetalleFormSaldosCuentasPorPagar!=null) {this.jInternalFrameDetalleFormSaldosCuentasPorPagar.jTextFieldcodigoSaldosCuentasPorPagar.setBorder(this.saldoscuentasporpagarConstantesFunciones.resaltarcodigoSaldosCuentasPorPagar);}
		if(this.saldoscuentasporpagarConstantesFunciones.resaltarnombre_completoSaldosCuentasPorPagar!=null && this.jInternalFrameDetalleFormSaldosCuentasPorPagar!=null) {this.jInternalFrameDetalleFormSaldosCuentasPorPagar.jTextAreanombre_completoSaldosCuentasPorPagar.setBorder(this.saldoscuentasporpagarConstantesFunciones.resaltarnombre_completoSaldosCuentasPorPagar);}
		if(this.saldoscuentasporpagarConstantesFunciones.resaltardebito_mone_localSaldosCuentasPorPagar!=null && this.jInternalFrameDetalleFormSaldosCuentasPorPagar!=null) {this.jInternalFrameDetalleFormSaldosCuentasPorPagar.jTextFielddebito_mone_localSaldosCuentasPorPagar.setBorder(this.saldoscuentasporpagarConstantesFunciones.resaltardebito_mone_localSaldosCuentasPorPagar);}
		if(this.saldoscuentasporpagarConstantesFunciones.resaltarcredito_mone_localSaldosCuentasPorPagar!=null && this.jInternalFrameDetalleFormSaldosCuentasPorPagar!=null) {this.jInternalFrameDetalleFormSaldosCuentasPorPagar.jTextFieldcredito_mone_localSaldosCuentasPorPagar.setBorder(this.saldoscuentasporpagarConstantesFunciones.resaltarcredito_mone_localSaldosCuentasPorPagar);}
		if(this.saldoscuentasporpagarConstantesFunciones.resaltarsaldo_anteriorSaldosCuentasPorPagar!=null && this.jInternalFrameDetalleFormSaldosCuentasPorPagar!=null) {this.jInternalFrameDetalleFormSaldosCuentasPorPagar.jTextFieldsaldo_anteriorSaldosCuentasPorPagar.setBorder(this.saldoscuentasporpagarConstantesFunciones.resaltarsaldo_anteriorSaldosCuentasPorPagar);}
		if(this.saldoscuentasporpagarConstantesFunciones.resaltarsaldo_debitoSaldosCuentasPorPagar!=null && this.jInternalFrameDetalleFormSaldosCuentasPorPagar!=null) {this.jInternalFrameDetalleFormSaldosCuentasPorPagar.jTextFieldsaldo_debitoSaldosCuentasPorPagar.setBorder(this.saldoscuentasporpagarConstantesFunciones.resaltarsaldo_debitoSaldosCuentasPorPagar);}
		if(this.saldoscuentasporpagarConstantesFunciones.resaltarsaldo_creditoSaldosCuentasPorPagar!=null && this.jInternalFrameDetalleFormSaldosCuentasPorPagar!=null) {this.jInternalFrameDetalleFormSaldosCuentasPorPagar.jTextFieldsaldo_creditoSaldosCuentasPorPagar.setBorder(this.saldoscuentasporpagarConstantesFunciones.resaltarsaldo_creditoSaldosCuentasPorPagar);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioSaldosCuentasPorPagar() throws Exception {		
		if(this.jInternalFrameDetalleFormSaldosCuentasPorPagar==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormSaldosCuentasPorPagar!=null) {
	
		//this.jInternalFrameDetalleFormSaldosCuentasPorPagar.jLabelidSaldosCuentasPorPagar.setVisible(this.saldoscuentasporpagarConstantesFunciones.mostraridSaldosCuentasPorPagar);
		this.jInternalFrameDetalleFormSaldosCuentasPorPagar.jPanelidSaldosCuentasPorPagar.setVisible(this.saldoscuentasporpagarConstantesFunciones.mostraridSaldosCuentasPorPagar);
		//this.jInternalFrameDetalleFormSaldosCuentasPorPagar.jComboBoxid_zonaSaldosCuentasPorPagar.setVisible(this.saldoscuentasporpagarConstantesFunciones.mostrarid_zonaSaldosCuentasPorPagar);
		this.jInternalFrameDetalleFormSaldosCuentasPorPagar.jPanelid_zonaSaldosCuentasPorPagar.setVisible(this.saldoscuentasporpagarConstantesFunciones.mostrarid_zonaSaldosCuentasPorPagar);
		//this.jInternalFrameDetalleFormSaldosCuentasPorPagar.jComboBoxid_grupo_clienteSaldosCuentasPorPagar.setVisible(this.saldoscuentasporpagarConstantesFunciones.mostrarid_grupo_clienteSaldosCuentasPorPagar);
		this.jInternalFrameDetalleFormSaldosCuentasPorPagar.jPanelid_grupo_clienteSaldosCuentasPorPagar.setVisible(this.saldoscuentasporpagarConstantesFunciones.mostrarid_grupo_clienteSaldosCuentasPorPagar);
		//this.jInternalFrameDetalleFormSaldosCuentasPorPagar.jComboBoxid_empresaSaldosCuentasPorPagar.setVisible(this.saldoscuentasporpagarConstantesFunciones.mostrarid_empresaSaldosCuentasPorPagar);
		this.jInternalFrameDetalleFormSaldosCuentasPorPagar.jPanelid_empresaSaldosCuentasPorPagar.setVisible(this.saldoscuentasporpagarConstantesFunciones.mostrarid_empresaSaldosCuentasPorPagar);
		//this.jInternalFrameDetalleFormSaldosCuentasPorPagar.jComboBoxid_sucursalSaldosCuentasPorPagar.setVisible(this.saldoscuentasporpagarConstantesFunciones.mostrarid_sucursalSaldosCuentasPorPagar);
		this.jInternalFrameDetalleFormSaldosCuentasPorPagar.jPanelid_sucursalSaldosCuentasPorPagar.setVisible(this.saldoscuentasporpagarConstantesFunciones.mostrarid_sucursalSaldosCuentasPorPagar);
		//this.jInternalFrameDetalleFormSaldosCuentasPorPagar.jComboBoxid_clienteSaldosCuentasPorPagar.setVisible(this.saldoscuentasporpagarConstantesFunciones.mostrarid_clienteSaldosCuentasPorPagar);
		this.jInternalFrameDetalleFormSaldosCuentasPorPagar.jPanelid_clienteSaldosCuentasPorPagar.setVisible(this.saldoscuentasporpagarConstantesFunciones.mostrarid_clienteSaldosCuentasPorPagar);
		//this.jInternalFrameDetalleFormSaldosCuentasPorPagar.jDateChooserfecha_emision_hastaSaldosCuentasPorPagar.setVisible(this.saldoscuentasporpagarConstantesFunciones.mostrarfecha_emision_hastaSaldosCuentasPorPagar);
		this.jInternalFrameDetalleFormSaldosCuentasPorPagar.jPanelfecha_emision_hastaSaldosCuentasPorPagar.setVisible(this.saldoscuentasporpagarConstantesFunciones.mostrarfecha_emision_hastaSaldosCuentasPorPagar);
		//this.jInternalFrameDetalleFormSaldosCuentasPorPagar.jTextFieldcodigoSaldosCuentasPorPagar.setVisible(this.saldoscuentasporpagarConstantesFunciones.mostrarcodigoSaldosCuentasPorPagar);
		this.jInternalFrameDetalleFormSaldosCuentasPorPagar.jPanelcodigoSaldosCuentasPorPagar.setVisible(this.saldoscuentasporpagarConstantesFunciones.mostrarcodigoSaldosCuentasPorPagar);
		//this.jInternalFrameDetalleFormSaldosCuentasPorPagar.jTextAreanombre_completoSaldosCuentasPorPagar.setVisible(this.saldoscuentasporpagarConstantesFunciones.mostrarnombre_completoSaldosCuentasPorPagar);
		this.jInternalFrameDetalleFormSaldosCuentasPorPagar.jPanelnombre_completoSaldosCuentasPorPagar.setVisible(this.saldoscuentasporpagarConstantesFunciones.mostrarnombre_completoSaldosCuentasPorPagar);
		//this.jInternalFrameDetalleFormSaldosCuentasPorPagar.jTextFielddebito_mone_localSaldosCuentasPorPagar.setVisible(this.saldoscuentasporpagarConstantesFunciones.mostrardebito_mone_localSaldosCuentasPorPagar);
		this.jInternalFrameDetalleFormSaldosCuentasPorPagar.jPaneldebito_mone_localSaldosCuentasPorPagar.setVisible(this.saldoscuentasporpagarConstantesFunciones.mostrardebito_mone_localSaldosCuentasPorPagar);
		//this.jInternalFrameDetalleFormSaldosCuentasPorPagar.jTextFieldcredito_mone_localSaldosCuentasPorPagar.setVisible(this.saldoscuentasporpagarConstantesFunciones.mostrarcredito_mone_localSaldosCuentasPorPagar);
		this.jInternalFrameDetalleFormSaldosCuentasPorPagar.jPanelcredito_mone_localSaldosCuentasPorPagar.setVisible(this.saldoscuentasporpagarConstantesFunciones.mostrarcredito_mone_localSaldosCuentasPorPagar);
		//this.jInternalFrameDetalleFormSaldosCuentasPorPagar.jTextFieldsaldo_anteriorSaldosCuentasPorPagar.setVisible(this.saldoscuentasporpagarConstantesFunciones.mostrarsaldo_anteriorSaldosCuentasPorPagar);
		this.jInternalFrameDetalleFormSaldosCuentasPorPagar.jPanelsaldo_anteriorSaldosCuentasPorPagar.setVisible(this.saldoscuentasporpagarConstantesFunciones.mostrarsaldo_anteriorSaldosCuentasPorPagar);
		//this.jInternalFrameDetalleFormSaldosCuentasPorPagar.jTextFieldsaldo_debitoSaldosCuentasPorPagar.setVisible(this.saldoscuentasporpagarConstantesFunciones.mostrarsaldo_debitoSaldosCuentasPorPagar);
		this.jInternalFrameDetalleFormSaldosCuentasPorPagar.jPanelsaldo_debitoSaldosCuentasPorPagar.setVisible(this.saldoscuentasporpagarConstantesFunciones.mostrarsaldo_debitoSaldosCuentasPorPagar);
		//this.jInternalFrameDetalleFormSaldosCuentasPorPagar.jTextFieldsaldo_creditoSaldosCuentasPorPagar.setVisible(this.saldoscuentasporpagarConstantesFunciones.mostrarsaldo_creditoSaldosCuentasPorPagar);
		this.jInternalFrameDetalleFormSaldosCuentasPorPagar.jPanelsaldo_creditoSaldosCuentasPorPagar.setVisible(this.saldoscuentasporpagarConstantesFunciones.mostrarsaldo_creditoSaldosCuentasPorPagar);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioSaldosCuentasPorPagar() throws Exception {
		if(this.jInternalFrameDetalleFormSaldosCuentasPorPagar==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormSaldosCuentasPorPagar!=null) {
	
		this.jInternalFrameDetalleFormSaldosCuentasPorPagar.jLabelidSaldosCuentasPorPagar.setEnabled(this.saldoscuentasporpagarConstantesFunciones.activaridSaldosCuentasPorPagar);
		this.jInternalFrameDetalleFormSaldosCuentasPorPagar.jComboBoxid_zonaSaldosCuentasPorPagar.setEnabled(this.saldoscuentasporpagarConstantesFunciones.activarid_zonaSaldosCuentasPorPagar);
		this.jInternalFrameDetalleFormSaldosCuentasPorPagar.jComboBoxid_grupo_clienteSaldosCuentasPorPagar.setEnabled(this.saldoscuentasporpagarConstantesFunciones.activarid_grupo_clienteSaldosCuentasPorPagar);
		this.jInternalFrameDetalleFormSaldosCuentasPorPagar.jComboBoxid_empresaSaldosCuentasPorPagar.setEnabled(this.saldoscuentasporpagarConstantesFunciones.activarid_empresaSaldosCuentasPorPagar);
		this.jInternalFrameDetalleFormSaldosCuentasPorPagar.jComboBoxid_sucursalSaldosCuentasPorPagar.setEnabled(this.saldoscuentasporpagarConstantesFunciones.activarid_sucursalSaldosCuentasPorPagar);
		this.jInternalFrameDetalleFormSaldosCuentasPorPagar.jComboBoxid_clienteSaldosCuentasPorPagar.setEnabled(this.saldoscuentasporpagarConstantesFunciones.activarid_clienteSaldosCuentasPorPagar);
		this.jInternalFrameDetalleFormSaldosCuentasPorPagar.jDateChooserfecha_emision_hastaSaldosCuentasPorPagar.setEnabled(this.saldoscuentasporpagarConstantesFunciones.activarfecha_emision_hastaSaldosCuentasPorPagar);
		this.jInternalFrameDetalleFormSaldosCuentasPorPagar.jTextFieldcodigoSaldosCuentasPorPagar.setEnabled(this.saldoscuentasporpagarConstantesFunciones.activarcodigoSaldosCuentasPorPagar);
		this.jInternalFrameDetalleFormSaldosCuentasPorPagar.jTextAreanombre_completoSaldosCuentasPorPagar.setEnabled(this.saldoscuentasporpagarConstantesFunciones.activarnombre_completoSaldosCuentasPorPagar);
		this.jInternalFrameDetalleFormSaldosCuentasPorPagar.jTextFielddebito_mone_localSaldosCuentasPorPagar.setEnabled(this.saldoscuentasporpagarConstantesFunciones.activardebito_mone_localSaldosCuentasPorPagar);
		this.jInternalFrameDetalleFormSaldosCuentasPorPagar.jTextFieldcredito_mone_localSaldosCuentasPorPagar.setEnabled(this.saldoscuentasporpagarConstantesFunciones.activarcredito_mone_localSaldosCuentasPorPagar);
		this.jInternalFrameDetalleFormSaldosCuentasPorPagar.jTextFieldsaldo_anteriorSaldosCuentasPorPagar.setEnabled(this.saldoscuentasporpagarConstantesFunciones.activarsaldo_anteriorSaldosCuentasPorPagar);
		this.jInternalFrameDetalleFormSaldosCuentasPorPagar.jTextFieldsaldo_debitoSaldosCuentasPorPagar.setEnabled(this.saldoscuentasporpagarConstantesFunciones.activarsaldo_debitoSaldosCuentasPorPagar);
		this.jInternalFrameDetalleFormSaldosCuentasPorPagar.jTextFieldsaldo_creditoSaldosCuentasPorPagar.setEnabled(this.saldoscuentasporpagarConstantesFunciones.activarsaldo_creditoSaldosCuentasPorPagar);
		}
	}
	
		
}