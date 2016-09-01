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

import com.bydan.erp.cartera.util.DetalleRecapConstantesFunciones;
import com.bydan.erp.cartera.util.DetalleRecapParameterReturnGeneral;
//import com.bydan.erp.cartera.util.DetalleRecapParameterGeneral;
//import com.bydan.erp.cartera.presentation.report.source.DetalleRecapBean;
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
import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.contabilidad.util.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class DetalleRecapBeanSwingJInternalFrame extends DetalleRecapJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(DetalleRecapBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<DetalleRecap> detallerecapValidator = new ClassValidator<DetalleRecap>(DetalleRecap.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public DetalleRecap detallerecap;	
	public DetalleRecap detallerecapAux;
	public DetalleRecap detallerecapAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public DetalleRecap detallerecapTotales;
	public Long idDetalleRecapActual;
	public Long iIdNuevoDetalleRecap=0L;
	public int rowIndexActual=0;
	
	
	
	
	public String sFinalQueryComboRecap="";

	public List<Recap> recapsForeignKey;

	public List<Recap> getrecapsForeignKey() {
		return recapsForeignKey;
	}

	public void setrecapsForeignKey(List<Recap> recapsForeignKey) {
		this.recapsForeignKey = recapsForeignKey;
	}

	//OBJETO FK ACTUAL
	public Recap recapForeignKey;

	public Recap getrecapForeignKey() {
		return recapForeignKey;
	}

	public void setrecapForeignKey(Recap recapForeignKey) {
		this.recapForeignKey = recapForeignKey;
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

	public String sFinalQueryComboDetalleCliente="";

	public List<DetalleCliente> detalleclientesForeignKey;

	public List<DetalleCliente> getdetalleclientesForeignKey() {
		return detalleclientesForeignKey;
	}

	public void setdetalleclientesForeignKey(List<DetalleCliente> detalleclientesForeignKey) {
		this.detalleclientesForeignKey = detalleclientesForeignKey;
	}

	//OBJETO FK ACTUAL
	public DetalleCliente detalleclienteForeignKey;

	public DetalleCliente getdetalleclienteForeignKey() {
		return detalleclienteForeignKey;
	}

	public void setdetalleclienteForeignKey(DetalleCliente detalleclienteForeignKey) {
		this.detalleclienteForeignKey = detalleclienteForeignKey;
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
	
	public Boolean isPermisoTodoDetalleRecap;
	public Boolean isPermisoNuevoDetalleRecap;
	public Boolean isPermisoActualizarDetalleRecap;
	public Boolean isPermisoActualizarOriginalDetalleRecap;
	public Boolean isPermisoEliminarDetalleRecap;
	public Boolean isPermisoGuardarCambiosDetalleRecap;
	public Boolean isPermisoConsultaDetalleRecap;
	public Boolean isPermisoBusquedaDetalleRecap;
	public Boolean isPermisoReporteDetalleRecap;
	public Boolean isPermisoPaginacionMedioDetalleRecap;
	public Boolean isPermisoPaginacionAltoDetalleRecap;
	public Boolean isPermisoPaginacionTodoDetalleRecap;
	public Boolean isPermisoCopiarDetalleRecap;
	public Boolean isPermisoVerFormDetalleRecap;
	public Boolean isPermisoDuplicarDetalleRecap;
	public Boolean isPermisoOrdenDetalleRecap;
	
	
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
	
	public DetalleRecapParameterReturnGeneral detallerecapReturnGeneral;
	public DetalleRecapParameterReturnGeneral detallerecapParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoDetalleRecap=false;
	public Boolean esParaAccionDesdeFormularioDetalleRecap=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected DetalleRecapSessionBeanAdditional detallerecapSessionBeanAdditional=null;
	
	public DetalleRecapSessionBeanAdditional getDetalleRecapSessionBeanAdditional() {
		return this.detallerecapSessionBeanAdditional;
	}
	
	public void setDetalleRecapSessionBeanAdditional(DetalleRecapSessionBeanAdditional detallerecapSessionBeanAdditional) {
		try {
			this.detallerecapSessionBeanAdditional=detallerecapSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected DetalleRecapBeanSwingJInternalFrameAdditional detallerecapBeanSwingJInternalFrameAdditional=null;
	//public class DetalleRecapBeanSwingJInternalFrame
	
	public DetalleRecapBeanSwingJInternalFrameAdditional getDetalleRecapBeanSwingJInternalFrameAdditional() {
		return this.detallerecapBeanSwingJInternalFrameAdditional;
	}
	
	public void setDetalleRecapBeanSwingJInternalFrameAdditional(DetalleRecapBeanSwingJInternalFrameAdditional detallerecapBeanSwingJInternalFrameAdditional) {
		try {
			this.detallerecapBeanSwingJInternalFrameAdditional=detallerecapBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public DetalleRecapLogic detallerecapLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public DetalleRecap detallerecapBean;
	public DetalleRecapConstantesFunciones detallerecapConstantesFunciones;
	//public DetalleRecapParameterReturnGeneral detallerecapReturnGeneral;
	
	//FK
	
	public RecapLogic recapLogic;
	public EmpresaLogic empresaLogic;
	public SucursalLogic sucursalLogic;
	public EjercicioLogic ejercicioLogic;
	public DetalleClienteLogic detalleclienteLogic;
	public ClienteLogic clienteLogic;
	
	//PARAMETROS
	
	
	//public List<DetalleRecap> detallerecaps;	
	//public List<DetalleRecap> detallerecapsEliminados;
	//public List<DetalleRecap> detallerecapsAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoDetalleRecap=false;
	public Boolean isVisibilidadCeldaDuplicarDetalleRecap=true;
	public Boolean isVisibilidadCeldaCopiarDetalleRecap=true;
	public Boolean isVisibilidadCeldaVerFormDetalleRecap=true;
	public Boolean isVisibilidadCeldaOrdenDetalleRecap=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesDetalleRecap=false;
	public Boolean isVisibilidadCeldaModificarDetalleRecap=false;
	public Boolean isVisibilidadCeldaActualizarDetalleRecap=false;
	public Boolean isVisibilidadCeldaEliminarDetalleRecap=false;
	public Boolean isVisibilidadCeldaCancelarDetalleRecap=false;
	public Boolean isVisibilidadCeldaGuardarDetalleRecap=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosDetalleRecap=false;	
	
	
	public Boolean isVisibilidadFK_IdCliente=false;
	public Boolean isVisibilidadFK_IdDetalleCliente=false;
	public Boolean isVisibilidadFK_IdEjercicio=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	public Boolean isVisibilidadFK_IdRecap=false;
	public Boolean isVisibilidadFK_IdSucursal=false;
	
	public Long getiIdNuevoDetalleRecap() {
		return this.iIdNuevoDetalleRecap;
	}

	public void setiIdNuevoDetalleRecap(Long iIdNuevoDetalleRecap) {
		this.iIdNuevoDetalleRecap = iIdNuevoDetalleRecap;
	}
	
	public Long getidDetalleRecapActual() {
		return this.idDetalleRecapActual;
	}

	public void setidDetalleRecapActual(Long idDetalleRecapActual) {
		this.idDetalleRecapActual = idDetalleRecapActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public DetalleRecap getdetallerecap() {
		return this.detallerecap;
	}

	public void setdetallerecap(DetalleRecap detallerecap) {
		this.detallerecap = detallerecap;
	}
	
	public DetalleRecap getdetallerecapAux() {
		return this.detallerecapAux;
	}

	public void setdetallerecapAux(DetalleRecap detallerecapAux) {
		this.detallerecapAux = detallerecapAux;
	}				
	
	public DetalleRecap getdetallerecapAnterior() {
		return this.detallerecapAnterior;
	}

	public void setdetallerecapAnterior(DetalleRecap detallerecapAnterior) {
		this.detallerecapAnterior = detallerecapAnterior;
	}	
	
	public DetalleRecap getdetallerecapTotales() {
		return this.detallerecapTotales;
	}

	public void setdetallerecapTotales(DetalleRecap detallerecapTotales) {
		this.detallerecapTotales = detallerecapTotales;
	}	
	
	public DetalleRecap getdetallerecapBean() {
		return this.detallerecapBean;
	}

	public void setdetallerecapBean(DetalleRecap detallerecapBean) {
		this.detallerecapBean = detallerecapBean;
	}	
	
	public DetalleRecapParameterReturnGeneral getdetallerecapReturnGeneral() {
		return this.detallerecapReturnGeneral;
	}

	public void setdetallerecapReturnGeneral(DetalleRecapParameterReturnGeneral detallerecapReturnGeneral) {
		this.detallerecapReturnGeneral = detallerecapReturnGeneral;
	}	
	
	
	public Long id_clienteFK_IdCliente=-1L;

	public Long getid_clienteFK_IdCliente() {
		return this.id_clienteFK_IdCliente;
	}

	public void setid_clienteFK_IdCliente(Long id_clienteFK_IdCliente) {
		this.id_clienteFK_IdCliente = id_clienteFK_IdCliente;
	}

	public Long id_detalle_clienteFK_IdDetalleCliente=-1L;

	public Long getid_detalle_clienteFK_IdDetalleCliente() {
		return this.id_detalle_clienteFK_IdDetalleCliente;
	}

	public void setid_detalle_clienteFK_IdDetalleCliente(Long id_detalle_clienteFK_IdDetalleCliente) {
		this.id_detalle_clienteFK_IdDetalleCliente = id_detalle_clienteFK_IdDetalleCliente;
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

	public Long id_recapFK_IdRecap=-1L;

	public Long getid_recapFK_IdRecap() {
		return this.id_recapFK_IdRecap;
	}

	public void setid_recapFK_IdRecap(Long id_recapFK_IdRecap) {
		this.id_recapFK_IdRecap = id_recapFK_IdRecap;
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
	
	
	public DetalleRecapLogic getDetalleRecapLogic()	{		
		return detallerecapLogic;
	}

	public void setDetalleRecapLogic(DetalleRecapLogic detallerecapLogic) {
		this.detallerecapLogic = detallerecapLogic;
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
	
	public Boolean getIsEsNuevoDetalleRecap() {
		return isEsNuevoDetalleRecap;
	}

	public void setIsEsNuevoDetalleRecap(Boolean isEsNuevoDetalleRecap) {
		this.isEsNuevoDetalleRecap = isEsNuevoDetalleRecap;
	}

	public Boolean getEsParaAccionDesdeFormularioDetalleRecap() {
		return esParaAccionDesdeFormularioDetalleRecap;
	}
	
	public void setEsParaAccionDesdeFormularioDetalleRecap(Boolean esParaAccionDesdeFormularioDetalleRecap) {
		this.esParaAccionDesdeFormularioDetalleRecap = esParaAccionDesdeFormularioDetalleRecap;
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
	
	
	public void cargarCombosRecapsForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.recapsForeignKey=new ArrayList<Recap>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			RecapLogic recapLogic=new RecapLogic();

			recapLogic.getRecapDataAccess().setIsForForeingKeyData(true);

			if(this.detallerecapSessionBean==null) {
				this.detallerecapSessionBean=new DetalleRecapSessionBean();
			}

			if(!this.detallerecapSessionBean.getisBusquedaDesdeForeignKeySesionRecap()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					recapLogic.getRecapDataAccess().setIsForForeingKeyData(true);

					recapLogic.getTodosRecapsWithConnection(sFinalQuery,new Pagination());

					this.recapsForeignKey=recapLogic.getRecaps();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaRecap(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					recapLogic.getEntityWithConnection(detallerecapSessionBean.getlidRecapActual());
					this.recapsForeignKey.add(recapLogic.getRecap());
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

			if(this.detallerecapSessionBean==null) {
				this.detallerecapSessionBean=new DetalleRecapSessionBean();
			}

			if(!this.detallerecapSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(detallerecapSessionBean.getlidEmpresaActual());
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

			if(this.detallerecapSessionBean==null) {
				this.detallerecapSessionBean=new DetalleRecapSessionBean();
			}

			if(!this.detallerecapSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
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
					sucursalLogic.getEntityWithConnection(detallerecapSessionBean.getlidSucursalActual());
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

			if(this.detallerecapSessionBean==null) {
				this.detallerecapSessionBean=new DetalleRecapSessionBean();
			}

			if(!this.detallerecapSessionBean.getisBusquedaDesdeForeignKeySesionEjercicio()) {
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
					ejercicioLogic.getEntityWithConnection(detallerecapSessionBean.getlidEjercicioActual());
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

	public void cargarCombosDetalleClientesForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.detalleclientesForeignKey=new ArrayList<DetalleCliente>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			DetalleClienteLogic detalleclienteLogic=new DetalleClienteLogic();

			//detalleclienteLogic.getDetalleClienteDataAccess().setIsForForeingKeyData(true);

			if(this.detallerecapSessionBean==null) {
				this.detallerecapSessionBean=new DetalleRecapSessionBean();
			}

			if(!this.detallerecapSessionBean.getisBusquedaDesdeForeignKeySesionDetalleCliente()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//detalleclienteLogic.getDetalleClienteDataAccess().setIsForForeingKeyData(true);

					detalleclienteLogic.getTodosDetalleClientesWithConnection(sFinalQuery,new Pagination());

					this.detalleclientesForeignKey=detalleclienteLogic.getDetalleClientes();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaDetalleCliente(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					detalleclienteLogic.getEntityWithConnection(detallerecapSessionBean.getlidDetalleClienteActual());
					this.detalleclientesForeignKey.add(detalleclienteLogic.getDetalleCliente());
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

			if(this.detallerecapSessionBean==null) {
				this.detallerecapSessionBean=new DetalleRecapSessionBean();
			}

			if(!this.detallerecapSessionBean.getisBusquedaDesdeForeignKeySesionCliente()) {
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
					clienteLogic.getEntityWithConnection(detallerecapSessionBean.getlidClienteActual());
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

	
	
	public void setActualRecapForeignKey(Long idRecapSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Recap  recapTemp=null;

			for(Recap recapAux:recapsForeignKey) {
				if(recapAux.getId()!=null && recapAux.getId().equals(idRecapSeleccionado)) {
					recapTemp=recapAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(recapTemp!=null) {

					if(this.detallerecap!=null) {
						this.detallerecap.setRecap(recapTemp);
					}

					if(this.jInternalFrameDetalleFormDetalleRecap!=null) {
						this.jInternalFrameDetalleFormDetalleRecap.jComboBoxid_recapDetalleRecap.setSelectedItem(recapTemp);
					}
				} else {
					//jComboBoxid_recapDetalleRecap.setSelectedItem(recapTemp);
					if(this.jInternalFrameDetalleFormDetalleRecap!=null) {
						if(this.jInternalFrameDetalleFormDetalleRecap.jComboBoxid_recapDetalleRecap.getItemCount()>0) {
							this.jInternalFrameDetalleFormDetalleRecap.jComboBoxid_recapDetalleRecap.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdRecap") || sFormularioTipoBusqueda.equals("Todos")){
					if(recapTemp!=null && jComboBoxid_recapFK_IdRecapDetalleRecap!=null) {
						jComboBoxid_recapFK_IdRecapDetalleRecap.setSelectedItem(recapTemp);
					} else {
						if(jComboBoxid_recapFK_IdRecapDetalleRecap!=null) {
							//jComboBoxid_recapFK_IdRecapDetalleRecap.setSelectedItem(recapTemp);
							if(jComboBoxid_recapFK_IdRecapDetalleRecap.getItemCount()>0) {
								jComboBoxid_recapFK_IdRecapDetalleRecap.setSelectedIndex(0);
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

	public String getActualRecapForeignKeyDescripcion(Long idRecapSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Recap  recapTemp=null;

			for(Recap recapAux:recapsForeignKey) {
				if(recapAux.getId()!=null && recapAux.getId().equals(idRecapSeleccionado)) {
					recapTemp=recapAux;
					break;
				}
			}


			sDescripcion=RecapConstantesFunciones.getRecapDescripcion(recapTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualRecapForeignKeyGenerico(Long idRecapSeleccionado,JComboBox jComboBoxid_recapDetalleRecapGenerico)throws Exception
	{
		try
		{
			Recap  recapTemp=null;

			for(Recap recapAux:recapsForeignKey) {
				if(recapAux.getId()!=null && recapAux.getId().equals(idRecapSeleccionado)) {
					recapTemp=recapAux;
					break;
				}
			}

			if(recapTemp!=null) {
				jComboBoxid_recapDetalleRecapGenerico.setSelectedItem(recapTemp);
			} else {
				if(jComboBoxid_recapDetalleRecapGenerico!=null && jComboBoxid_recapDetalleRecapGenerico.getItemCount()>0) {
					jComboBoxid_recapDetalleRecapGenerico.setSelectedIndex(0);
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

					if(this.detallerecap!=null) {
						this.detallerecap.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormDetalleRecap!=null) {
						this.jInternalFrameDetalleFormDetalleRecap.jComboBoxid_empresaDetalleRecap.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaDetalleRecap.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormDetalleRecap!=null) {
						if(this.jInternalFrameDetalleFormDetalleRecap.jComboBoxid_empresaDetalleRecap.getItemCount()>0) {
							this.jInternalFrameDetalleFormDetalleRecap.jComboBoxid_empresaDetalleRecap.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaDetalleRecapGenerico)throws Exception
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
				jComboBoxid_empresaDetalleRecapGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaDetalleRecapGenerico!=null && jComboBoxid_empresaDetalleRecapGenerico.getItemCount()>0) {
					jComboBoxid_empresaDetalleRecapGenerico.setSelectedIndex(0);
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

					if(this.detallerecap!=null) {
						this.detallerecap.setSucursal(sucursalTemp);
					}

					if(this.jInternalFrameDetalleFormDetalleRecap!=null) {
						this.jInternalFrameDetalleFormDetalleRecap.jComboBoxid_sucursalDetalleRecap.setSelectedItem(sucursalTemp);
					}
				} else {
					//jComboBoxid_sucursalDetalleRecap.setSelectedItem(sucursalTemp);
					if(this.jInternalFrameDetalleFormDetalleRecap!=null) {
						if(this.jInternalFrameDetalleFormDetalleRecap.jComboBoxid_sucursalDetalleRecap.getItemCount()>0) {
							this.jInternalFrameDetalleFormDetalleRecap.jComboBoxid_sucursalDetalleRecap.setSelectedIndex(0);
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
	public void setActualSucursalForeignKeyGenerico(Long idSucursalSeleccionado,JComboBox jComboBoxid_sucursalDetalleRecapGenerico)throws Exception
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
				jComboBoxid_sucursalDetalleRecapGenerico.setSelectedItem(sucursalTemp);
			} else {
				if(jComboBoxid_sucursalDetalleRecapGenerico!=null && jComboBoxid_sucursalDetalleRecapGenerico.getItemCount()>0) {
					jComboBoxid_sucursalDetalleRecapGenerico.setSelectedIndex(0);
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

					if(this.detallerecap!=null) {
						this.detallerecap.setEjercicio(ejercicioTemp);
					}

					if(this.jInternalFrameDetalleFormDetalleRecap!=null) {
						this.jInternalFrameDetalleFormDetalleRecap.jComboBoxid_ejercicioDetalleRecap.setSelectedItem(ejercicioTemp);
					}
				} else {
					//jComboBoxid_ejercicioDetalleRecap.setSelectedItem(ejercicioTemp);
					if(this.jInternalFrameDetalleFormDetalleRecap!=null) {
						if(this.jInternalFrameDetalleFormDetalleRecap.jComboBoxid_ejercicioDetalleRecap.getItemCount()>0) {
							this.jInternalFrameDetalleFormDetalleRecap.jComboBoxid_ejercicioDetalleRecap.setSelectedIndex(0);
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
	public void setActualEjercicioForeignKeyGenerico(Long idEjercicioSeleccionado,JComboBox jComboBoxid_ejercicioDetalleRecapGenerico)throws Exception
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
				jComboBoxid_ejercicioDetalleRecapGenerico.setSelectedItem(ejercicioTemp);
			} else {
				if(jComboBoxid_ejercicioDetalleRecapGenerico!=null && jComboBoxid_ejercicioDetalleRecapGenerico.getItemCount()>0) {
					jComboBoxid_ejercicioDetalleRecapGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualDetalleClienteForeignKey(Long idDetalleClienteSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			DetalleCliente  detalleclienteTemp=null;

			for(DetalleCliente detalleclienteAux:detalleclientesForeignKey) {
				if(detalleclienteAux.getId()!=null && detalleclienteAux.getId().equals(idDetalleClienteSeleccionado)) {
					detalleclienteTemp=detalleclienteAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(detalleclienteTemp!=null) {

					if(this.detallerecap!=null) {
						this.detallerecap.setDetalleCliente(detalleclienteTemp);
					}

					if(this.jInternalFrameDetalleFormDetalleRecap!=null) {
						this.jInternalFrameDetalleFormDetalleRecap.jComboBoxid_detalle_clienteDetalleRecap.setSelectedItem(detalleclienteTemp);
					}
				} else {
					//jComboBoxid_detalle_clienteDetalleRecap.setSelectedItem(detalleclienteTemp);
					if(this.jInternalFrameDetalleFormDetalleRecap!=null) {
						if(this.jInternalFrameDetalleFormDetalleRecap.jComboBoxid_detalle_clienteDetalleRecap.getItemCount()>0) {
							this.jInternalFrameDetalleFormDetalleRecap.jComboBoxid_detalle_clienteDetalleRecap.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdDetalleCliente") || sFormularioTipoBusqueda.equals("Todos")){
					if(detalleclienteTemp!=null && jComboBoxid_detalle_clienteFK_IdDetalleClienteDetalleRecap!=null) {
						jComboBoxid_detalle_clienteFK_IdDetalleClienteDetalleRecap.setSelectedItem(detalleclienteTemp);
					} else {
						if(jComboBoxid_detalle_clienteFK_IdDetalleClienteDetalleRecap!=null) {
							//jComboBoxid_detalle_clienteFK_IdDetalleClienteDetalleRecap.setSelectedItem(detalleclienteTemp);
							if(jComboBoxid_detalle_clienteFK_IdDetalleClienteDetalleRecap.getItemCount()>0) {
								jComboBoxid_detalle_clienteFK_IdDetalleClienteDetalleRecap.setSelectedIndex(0);
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

	public String getActualDetalleClienteForeignKeyDescripcion(Long idDetalleClienteSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			DetalleCliente  detalleclienteTemp=null;

			for(DetalleCliente detalleclienteAux:detalleclientesForeignKey) {
				if(detalleclienteAux.getId()!=null && detalleclienteAux.getId().equals(idDetalleClienteSeleccionado)) {
					detalleclienteTemp=detalleclienteAux;
					break;
				}
			}


			sDescripcion=DetalleClienteConstantesFunciones.getDetalleClienteDescripcion(detalleclienteTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualDetalleClienteForeignKeyGenerico(Long idDetalleClienteSeleccionado,JComboBox jComboBoxid_detalle_clienteDetalleRecapGenerico)throws Exception
	{
		try
		{
			DetalleCliente  detalleclienteTemp=null;

			for(DetalleCliente detalleclienteAux:detalleclientesForeignKey) {
				if(detalleclienteAux.getId()!=null && detalleclienteAux.getId().equals(idDetalleClienteSeleccionado)) {
					detalleclienteTemp=detalleclienteAux;
					break;
				}
			}

			if(detalleclienteTemp!=null) {
				jComboBoxid_detalle_clienteDetalleRecapGenerico.setSelectedItem(detalleclienteTemp);
			} else {
				if(jComboBoxid_detalle_clienteDetalleRecapGenerico!=null && jComboBoxid_detalle_clienteDetalleRecapGenerico.getItemCount()>0) {
					jComboBoxid_detalle_clienteDetalleRecapGenerico.setSelectedIndex(0);
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

					if(this.detallerecap!=null) {
						this.detallerecap.setCliente(clienteTemp);
					}

					if(this.jInternalFrameDetalleFormDetalleRecap!=null) {
						this.jInternalFrameDetalleFormDetalleRecap.jComboBoxid_clienteDetalleRecap.setSelectedItem(clienteTemp);
					}
				} else {
					//jComboBoxid_clienteDetalleRecap.setSelectedItem(clienteTemp);
					if(this.jInternalFrameDetalleFormDetalleRecap!=null) {
						if(this.jInternalFrameDetalleFormDetalleRecap.jComboBoxid_clienteDetalleRecap.getItemCount()>0) {
							this.jInternalFrameDetalleFormDetalleRecap.jComboBoxid_clienteDetalleRecap.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdCliente") || sFormularioTipoBusqueda.equals("Todos")){
					if(clienteTemp!=null && jComboBoxid_clienteFK_IdClienteDetalleRecap!=null) {
						jComboBoxid_clienteFK_IdClienteDetalleRecap.setSelectedItem(clienteTemp);
					} else {
						if(jComboBoxid_clienteFK_IdClienteDetalleRecap!=null) {
							//jComboBoxid_clienteFK_IdClienteDetalleRecap.setSelectedItem(clienteTemp);
							if(jComboBoxid_clienteFK_IdClienteDetalleRecap.getItemCount()>0) {
								jComboBoxid_clienteFK_IdClienteDetalleRecap.setSelectedIndex(0);
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
	public void setActualClienteForeignKeyGenerico(Long idClienteSeleccionado,JComboBox jComboBoxid_clienteDetalleRecapGenerico)throws Exception
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
				jComboBoxid_clienteDetalleRecapGenerico.setSelectedItem(clienteTemp);
			} else {
				if(jComboBoxid_clienteDetalleRecapGenerico!=null && jComboBoxid_clienteDetalleRecapGenerico.getItemCount()>0) {
					jComboBoxid_clienteDetalleRecapGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarRecapForeignKey(DetalleRecap detallerecap,JComboBox jComboBoxid_recapDetalleRecapGenerico)throws Exception
	{
		try
		{
			Recap  recapAux=new Recap();

			if(jComboBoxid_recapDetalleRecapGenerico==null) {
				recapAux=(Recap)this.jInternalFrameDetalleFormDetalleRecap.jComboBoxid_recapDetalleRecap.getSelectedItem();
			} else {
				recapAux=(Recap)jComboBoxid_recapDetalleRecapGenerico.getSelectedItem();
			}

			if(recapAux!=null && recapAux.getId()!=null) {
				detallerecap.setid_recap(recapAux.getId());
				detallerecap.setrecap_descripcion(DetalleRecapConstantesFunciones.getRecapDescripcion(recapAux));
				detallerecap.setRecap(recapAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(DetalleRecap detallerecap,JComboBox jComboBoxid_empresaDetalleRecapGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaDetalleRecapGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormDetalleRecap.jComboBoxid_empresaDetalleRecap.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaDetalleRecapGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				detallerecap.setid_empresa(empresaAux.getId());
				detallerecap.setempresa_descripcion(DetalleRecapConstantesFunciones.getEmpresaDescripcion(empresaAux));
				detallerecap.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarSucursalForeignKey(DetalleRecap detallerecap,JComboBox jComboBoxid_sucursalDetalleRecapGenerico)throws Exception
	{
		try
		{
			Sucursal  sucursalAux=new Sucursal();

			if(jComboBoxid_sucursalDetalleRecapGenerico==null) {
				sucursalAux=(Sucursal)this.jInternalFrameDetalleFormDetalleRecap.jComboBoxid_sucursalDetalleRecap.getSelectedItem();
			} else {
				sucursalAux=(Sucursal)jComboBoxid_sucursalDetalleRecapGenerico.getSelectedItem();
			}

			if(sucursalAux!=null && sucursalAux.getId()!=null) {
				detallerecap.setid_sucursal(sucursalAux.getId());
				detallerecap.setsucursal_descripcion(DetalleRecapConstantesFunciones.getSucursalDescripcion(sucursalAux));
				detallerecap.setSucursal(sucursalAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEjercicioForeignKey(DetalleRecap detallerecap,JComboBox jComboBoxid_ejercicioDetalleRecapGenerico)throws Exception
	{
		try
		{
			Ejercicio  ejercicioAux=new Ejercicio();

			if(jComboBoxid_ejercicioDetalleRecapGenerico==null) {
				ejercicioAux=(Ejercicio)this.jInternalFrameDetalleFormDetalleRecap.jComboBoxid_ejercicioDetalleRecap.getSelectedItem();
			} else {
				ejercicioAux=(Ejercicio)jComboBoxid_ejercicioDetalleRecapGenerico.getSelectedItem();
			}

			if(ejercicioAux!=null && ejercicioAux.getId()!=null) {
				detallerecap.setid_ejercicio(ejercicioAux.getId());
				detallerecap.setejercicio_descripcion(DetalleRecapConstantesFunciones.getEjercicioDescripcion(ejercicioAux));
				detallerecap.setEjercicio(ejercicioAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarDetalleClienteForeignKey(DetalleRecap detallerecap,JComboBox jComboBoxid_detalle_clienteDetalleRecapGenerico)throws Exception
	{
		try
		{
			DetalleCliente  detalleclienteAux=new DetalleCliente();

			if(jComboBoxid_detalle_clienteDetalleRecapGenerico==null) {
				detalleclienteAux=(DetalleCliente)this.jInternalFrameDetalleFormDetalleRecap.jComboBoxid_detalle_clienteDetalleRecap.getSelectedItem();
			} else {
				detalleclienteAux=(DetalleCliente)jComboBoxid_detalle_clienteDetalleRecapGenerico.getSelectedItem();
			}

			if(detalleclienteAux!=null && detalleclienteAux.getId()!=null) {
				detallerecap.setid_detalle_cliente(detalleclienteAux.getId());
				detallerecap.setdetallecliente_descripcion(DetalleRecapConstantesFunciones.getDetalleClienteDescripcion(detalleclienteAux));
				detallerecap.setDetalleCliente(detalleclienteAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarClienteForeignKey(DetalleRecap detallerecap,JComboBox jComboBoxid_clienteDetalleRecapGenerico)throws Exception
	{
		try
		{
			Cliente  clienteAux=new Cliente();

			if(jComboBoxid_clienteDetalleRecapGenerico==null) {
				clienteAux=(Cliente)this.jInternalFrameDetalleFormDetalleRecap.jComboBoxid_clienteDetalleRecap.getSelectedItem();
			} else {
				clienteAux=(Cliente)jComboBoxid_clienteDetalleRecapGenerico.getSelectedItem();
			}

			if(clienteAux!=null && clienteAux.getId()!=null) {
				detallerecap.setid_cliente(clienteAux.getId());
				detallerecap.setcliente_descripcion(DetalleRecapConstantesFunciones.getClienteDescripcion(clienteAux));
				detallerecap.setCliente(clienteAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	
	


		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameRecapsForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingRecap=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!DetalleRecapJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormDetalleRecap!=null) { 
							this.jInternalFrameDetalleFormDetalleRecap.jComboBoxid_recapDetalleRecap.removeAllItems();

							for(Recap recap:this.recapsForeignKey) {
								this.jInternalFrameDetalleFormDetalleRecap.jComboBoxid_recapDetalleRecap.addItem(recap);
							}
						}
					}

					if(this.jInternalFrameDetalleFormDetalleRecap!=null) { 
					}

					if(!DetalleRecapJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdRecap") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!DetalleRecapJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_recapFK_IdRecapDetalleRecap.removeAllItems();

							for(Recap recap:this.recapsForeignKey) {
								this.jComboBoxid_recapFK_IdRecapDetalleRecap.addItem(recap);
							}
						}

						if(!DetalleRecapJInternalFrame.ISBINDING_MANUAL) {
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

					if(!DetalleRecapJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormDetalleRecap!=null) { 
							this.jInternalFrameDetalleFormDetalleRecap.jComboBoxid_empresaDetalleRecap.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormDetalleRecap.jComboBoxid_empresaDetalleRecap.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormDetalleRecap!=null) { 
					}

					if(!DetalleRecapJInternalFrame.ISBINDING_MANUAL) {
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

					if(!DetalleRecapJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormDetalleRecap!=null) { 
							this.jInternalFrameDetalleFormDetalleRecap.jComboBoxid_sucursalDetalleRecap.removeAllItems();

							for(Sucursal sucursal:this.sucursalsForeignKey) {
								this.jInternalFrameDetalleFormDetalleRecap.jComboBoxid_sucursalDetalleRecap.addItem(sucursal);
							}
						}
					}

					if(this.jInternalFrameDetalleFormDetalleRecap!=null) { 
					}

					if(!DetalleRecapJInternalFrame.ISBINDING_MANUAL) {
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

					if(!DetalleRecapJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormDetalleRecap!=null) { 
							this.jInternalFrameDetalleFormDetalleRecap.jComboBoxid_ejercicioDetalleRecap.removeAllItems();

							for(Ejercicio ejercicio:this.ejerciciosForeignKey) {
								this.jInternalFrameDetalleFormDetalleRecap.jComboBoxid_ejercicioDetalleRecap.addItem(ejercicio);
							}
						}
					}

					if(this.jInternalFrameDetalleFormDetalleRecap!=null) { 
					}

					if(!DetalleRecapJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameDetalleClientesForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingDetalleCliente=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!DetalleRecapJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormDetalleRecap!=null) { 
							this.jInternalFrameDetalleFormDetalleRecap.jComboBoxid_detalle_clienteDetalleRecap.removeAllItems();

							for(DetalleCliente detallecliente:this.detalleclientesForeignKey) {
								this.jInternalFrameDetalleFormDetalleRecap.jComboBoxid_detalle_clienteDetalleRecap.addItem(detallecliente);
							}
						}
					}

					if(this.jInternalFrameDetalleFormDetalleRecap!=null) { 
					}

					if(!DetalleRecapJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdDetalleCliente") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!DetalleRecapJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_detalle_clienteFK_IdDetalleClienteDetalleRecap.removeAllItems();

							for(DetalleCliente detallecliente:this.detalleclientesForeignKey) {
								this.jComboBoxid_detalle_clienteFK_IdDetalleClienteDetalleRecap.addItem(detallecliente);
							}
						}

						if(!DetalleRecapJInternalFrame.ISBINDING_MANUAL) {
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

					if(!DetalleRecapJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormDetalleRecap!=null) { 
							this.jInternalFrameDetalleFormDetalleRecap.jComboBoxid_clienteDetalleRecap.removeAllItems();

							for(Cliente cliente:this.clientesForeignKey) {
								this.jInternalFrameDetalleFormDetalleRecap.jComboBoxid_clienteDetalleRecap.addItem(cliente);
							}
						}
					}

					if(this.jInternalFrameDetalleFormDetalleRecap!=null) { 
					}

					if(!DetalleRecapJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdCliente") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!DetalleRecapJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_clienteFK_IdClienteDetalleRecap.removeAllItems();

							for(Cliente cliente:this.clientesForeignKey) {
								this.jComboBoxid_clienteFK_IdClienteDetalleRecap.addItem(cliente);
							}
						}

						if(!DetalleRecapJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

	


		public void setSelectedItemCombosFrameRecapForeignKey(Recap recap,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormDetalleRecap!=null) {
							this.jInternalFrameDetalleFormDetalleRecap.jComboBoxid_recapDetalleRecap.setSelectedItem(recap);
						}
					} else {
						if(this.jInternalFrameDetalleFormDetalleRecap!=null) {
							this.jInternalFrameDetalleFormDetalleRecap.jComboBoxid_recapDetalleRecap.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_recapFK_IdRecapDetalleRecap.setSelectedItem(recap);
						} else {
							this.jComboBoxid_recapFK_IdRecapDetalleRecap.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormDetalleRecap!=null) {
							this.jInternalFrameDetalleFormDetalleRecap.jComboBoxid_empresaDetalleRecap.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormDetalleRecap!=null) {
							this.jInternalFrameDetalleFormDetalleRecap.jComboBoxid_empresaDetalleRecap.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormDetalleRecap!=null) {
							this.jInternalFrameDetalleFormDetalleRecap.jComboBoxid_sucursalDetalleRecap.setSelectedItem(sucursal);
						}
					} else {
						if(this.jInternalFrameDetalleFormDetalleRecap!=null) {
							this.jInternalFrameDetalleFormDetalleRecap.jComboBoxid_sucursalDetalleRecap.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormDetalleRecap!=null) {
							this.jInternalFrameDetalleFormDetalleRecap.jComboBoxid_ejercicioDetalleRecap.setSelectedItem(ejercicio);
						}
					} else {
						if(this.jInternalFrameDetalleFormDetalleRecap!=null) {
							this.jInternalFrameDetalleFormDetalleRecap.jComboBoxid_ejercicioDetalleRecap.setSelectedIndex(iIndexSelected);
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

		public void setSelectedItemCombosFrameDetalleClienteForeignKey(DetalleCliente detallecliente,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormDetalleRecap!=null) {
							this.jInternalFrameDetalleFormDetalleRecap.jComboBoxid_detalle_clienteDetalleRecap.setSelectedItem(detallecliente);
						}
					} else {
						if(this.jInternalFrameDetalleFormDetalleRecap!=null) {
							this.jInternalFrameDetalleFormDetalleRecap.jComboBoxid_detalle_clienteDetalleRecap.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_detalle_clienteFK_IdDetalleClienteDetalleRecap.setSelectedItem(detallecliente);
						} else {
							this.jComboBoxid_detalle_clienteFK_IdDetalleClienteDetalleRecap.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormDetalleRecap!=null) {
							this.jInternalFrameDetalleFormDetalleRecap.jComboBoxid_clienteDetalleRecap.setSelectedItem(cliente);
						}
					} else {
						if(this.jInternalFrameDetalleFormDetalleRecap!=null) {
							this.jInternalFrameDetalleFormDetalleRecap.jComboBoxid_clienteDetalleRecap.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_clienteFK_IdClienteDetalleRecap.setSelectedItem(cliente);
						} else {
							this.jComboBoxid_clienteFK_IdClienteDetalleRecap.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesDetalleRecap() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			DetalleRecapConstantesFunciones.refrescarForeignKeysDescripcionesDetalleRecap(this.detallerecapLogic.getDetalleRecaps());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			DetalleRecapConstantesFunciones.refrescarForeignKeysDescripcionesDetalleRecap(this.detallerecaps);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Recap.class));
		classes.add(new Classe(Empresa.class));
		classes.add(new Classe(Sucursal.class));
		classes.add(new Classe(Ejercicio.class));
		classes.add(new Classe(DetalleCliente.class));
		classes.add(new Classe(Cliente.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//detallerecapLogic.setDetalleRecaps(this.detallerecaps);
			detallerecapLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public DetalleRecapParameterReturnGeneral getDetalleRecapParameterGeneral() {
		return this.detallerecapParameterGeneral;
	}
	
	public void setDetalleRecapParameterGeneral(DetalleRecapParameterReturnGeneral detallerecapParameterGeneral) {
		this.detallerecapParameterGeneral = detallerecapParameterGeneral;
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
	
	public Boolean getIsPermisoTodoDetalleRecap() {
		return isPermisoTodoDetalleRecap;
	}

	public void setIsPermisoTodoDetalleRecap(Boolean isPermisoTodoDetalleRecap) {
		this.isPermisoTodoDetalleRecap = isPermisoTodoDetalleRecap;
	}

	public Boolean getIsPermisoNuevoDetalleRecap() {
		return isPermisoNuevoDetalleRecap;
	}

	public void setIsPermisoNuevoDetalleRecap(Boolean isPermisoNuevoDetalleRecap) {
		this.isPermisoNuevoDetalleRecap = isPermisoNuevoDetalleRecap;
	}

	public Boolean getIsPermisoActualizarDetalleRecap() {
		return isPermisoActualizarDetalleRecap;
	}

	public void setIsPermisoActualizarDetalleRecap(Boolean isPermisoActualizarDetalleRecap) {
		this.isPermisoActualizarDetalleRecap = isPermisoActualizarDetalleRecap;
	}

	public Boolean getIsPermisoEliminarDetalleRecap() {
		return isPermisoEliminarDetalleRecap;
	}

	public void setIsPermisoEliminarDetalleRecap(Boolean isPermisoEliminarDetalleRecap) {
		this.isPermisoEliminarDetalleRecap = isPermisoEliminarDetalleRecap;
	}

	public Boolean getIsPermisoGuardarCambiosDetalleRecap() {
		return isPermisoGuardarCambiosDetalleRecap;
	}

	public void setIsPermisoGuardarCambiosDetalleRecap(Boolean isPermisoGuardarCambiosDetalleRecap) {
		this.isPermisoGuardarCambiosDetalleRecap = isPermisoGuardarCambiosDetalleRecap;
	}
	
	public Boolean getIsPermisoConsultaDetalleRecap() {
		return isPermisoConsultaDetalleRecap;
	}

	public void setIsPermisoConsultaDetalleRecap(Boolean isPermisoConsultaDetalleRecap) {
		this.isPermisoConsultaDetalleRecap = isPermisoConsultaDetalleRecap;
	}

	public Boolean getIsPermisoBusquedaDetalleRecap() {
		return isPermisoBusquedaDetalleRecap;
	}

	public void setIsPermisoBusquedaDetalleRecap(Boolean isPermisoBusquedaDetalleRecap) {
		this.isPermisoBusquedaDetalleRecap = isPermisoBusquedaDetalleRecap;
	}

	public Boolean getIsPermisoReporteDetalleRecap() {
		return isPermisoReporteDetalleRecap;
	}

	public void setIsPermisoReporteDetalleRecap(Boolean isPermisoReporteDetalleRecap) {
		this.isPermisoReporteDetalleRecap = isPermisoReporteDetalleRecap;
	}
	
	public Boolean getIsPermisoPaginacionMedioDetalleRecap() {
		return isPermisoPaginacionMedioDetalleRecap;
	}

	public void setIsPermisoPaginacionMedioDetalleRecap(Boolean isPermisoPaginacionMedioDetalleRecap) {
		this.isPermisoPaginacionMedioDetalleRecap = isPermisoPaginacionMedioDetalleRecap;
	}
	
	public Boolean getIsPermisoPaginacionTodoDetalleRecap() {
		return isPermisoPaginacionTodoDetalleRecap;
	}

	public void setIsPermisoPaginacionTodoDetalleRecap(Boolean isPermisoPaginacionTodoDetalleRecap) {
		this.isPermisoPaginacionTodoDetalleRecap = isPermisoPaginacionTodoDetalleRecap;
	}
	
	public Boolean getIsPermisoPaginacionAltoDetalleRecap() {
		return isPermisoPaginacionAltoDetalleRecap;
	}

	public void setIsPermisoPaginacionAltoDetalleRecap(Boolean isPermisoPaginacionAltoDetalleRecap) {
		this.isPermisoPaginacionAltoDetalleRecap = isPermisoPaginacionAltoDetalleRecap;
	}
	
	public Boolean getIsPermisoCopiarDetalleRecap() {
		return isPermisoCopiarDetalleRecap;
	}

	public void setIsPermisoCopiarDetalleRecap(Boolean isPermisoCopiarDetalleRecap) {
		this.isPermisoCopiarDetalleRecap = isPermisoCopiarDetalleRecap;
	}
	
	public Boolean getIsPermisoVerFormDetalleRecap() {
		return isPermisoVerFormDetalleRecap;
	}

	public void setIsPermisoVerFormDetalleRecap(Boolean isPermisoVerFormDetalleRecap) {
		this.isPermisoVerFormDetalleRecap = isPermisoVerFormDetalleRecap;
	}
	
	public Boolean getIsPermisoDuplicarDetalleRecap() {
		return isPermisoDuplicarDetalleRecap;
	}

	public void setIsPermisoDuplicarDetalleRecap(Boolean isPermisoDuplicarDetalleRecap) {
		this.isPermisoDuplicarDetalleRecap = isPermisoDuplicarDetalleRecap;
	}
	
	public Boolean getIsPermisoOrdenDetalleRecap() {
		return isPermisoOrdenDetalleRecap;
	}

	public void setIsPermisoOrdenDetalleRecap(Boolean isPermisoOrdenDetalleRecap) {
		this.isPermisoOrdenDetalleRecap = isPermisoOrdenDetalleRecap;
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
	
	public Boolean getIsVisibilidadCeldaNuevoDetalleRecap() {
		return isVisibilidadCeldaNuevoDetalleRecap;
	}

	public void setIsVisibilidadCeldaNuevoDetalleRecap(Boolean isVisibilidadCeldaNuevoDetalleRecap) {
		this.isVisibilidadCeldaNuevoDetalleRecap = isVisibilidadCeldaNuevoDetalleRecap;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarDetalleRecap() {
		return isVisibilidadCeldaDuplicarDetalleRecap;
	}

	public void setIsVisibilidadCeldaDuplicarDetalleRecap(Boolean isVisibilidadCeldaDuplicarDetalleRecap) {
		this.isVisibilidadCeldaDuplicarDetalleRecap = isVisibilidadCeldaDuplicarDetalleRecap;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarDetalleRecap() {
		return isVisibilidadCeldaCopiarDetalleRecap;
	}

	public void setIsVisibilidadCeldaCopiarDetalleRecap(Boolean isVisibilidadCeldaCopiarDetalleRecap) {
		this.isVisibilidadCeldaCopiarDetalleRecap = isVisibilidadCeldaCopiarDetalleRecap;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormDetalleRecap() {
		return isVisibilidadCeldaVerFormDetalleRecap;
	}

	public void setIsVisibilidadCeldaVerFormDetalleRecap(Boolean isVisibilidadCeldaVerFormDetalleRecap) {
		this.isVisibilidadCeldaVerFormDetalleRecap = isVisibilidadCeldaVerFormDetalleRecap;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenDetalleRecap() {
		return isVisibilidadCeldaOrdenDetalleRecap;
	}

	public void setIsVisibilidadCeldaOrdenDetalleRecap(Boolean isVisibilidadCeldaOrdenDetalleRecap) {
		this.isVisibilidadCeldaOrdenDetalleRecap = isVisibilidadCeldaOrdenDetalleRecap;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesDetalleRecap() {
		return isVisibilidadCeldaNuevoRelacionesDetalleRecap;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesDetalleRecap(Boolean isVisibilidadCeldaNuevoRelacionesDetalleRecap) {
		this.isVisibilidadCeldaNuevoRelacionesDetalleRecap = isVisibilidadCeldaNuevoRelacionesDetalleRecap;
	}
	
	public Boolean getIsVisibilidadCeldaModificarDetalleRecap() {
		return isVisibilidadCeldaModificarDetalleRecap;
	}

	public void setIsVisibilidadCeldaModificarDetalleRecap(Boolean isVisibilidadCeldaModificarDetalleRecap) {
		this.isVisibilidadCeldaModificarDetalleRecap = isVisibilidadCeldaModificarDetalleRecap;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarDetalleRecap() {
		return isVisibilidadCeldaActualizarDetalleRecap;
	}

	public void setIsVisibilidadCeldaActualizarDetalleRecap(Boolean isVisibilidadCeldaActualizarDetalleRecap) {
		this.isVisibilidadCeldaActualizarDetalleRecap = isVisibilidadCeldaActualizarDetalleRecap;
	}

	public Boolean getIsVisibilidadCeldaEliminarDetalleRecap() {
		return isVisibilidadCeldaEliminarDetalleRecap;
	}

	public void setIsVisibilidadCeldaEliminarDetalleRecap(Boolean isVisibilidadCeldaEliminarDetalleRecap) {
		this.isVisibilidadCeldaEliminarDetalleRecap = isVisibilidadCeldaEliminarDetalleRecap;
	}

	public Boolean getIsVisibilidadCeldaCancelarDetalleRecap() {
		return isVisibilidadCeldaCancelarDetalleRecap;
	}

	public void setIsVisibilidadCeldaCancelarDetalleRecap(Boolean isVisibilidadCeldaCancelarDetalleRecap) {
		this.isVisibilidadCeldaCancelarDetalleRecap = isVisibilidadCeldaCancelarDetalleRecap;
	}

	public Boolean getIsVisibilidadCeldaGuardarDetalleRecap() {
		return isVisibilidadCeldaGuardarDetalleRecap;
	}

	public void setIsVisibilidadCeldaGuardarDetalleRecap(Boolean isVisibilidadCeldaGuardarDetalleRecap) {
		this.isVisibilidadCeldaGuardarDetalleRecap = isVisibilidadCeldaGuardarDetalleRecap;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosDetalleRecap() {
		return isVisibilidadCeldaGuardarCambiosDetalleRecap;
	}

	public void setIsVisibilidadCeldaGuardarCambiosDetalleRecap(Boolean isVisibilidadCeldaGuardarCambiosDetalleRecap) {
		this.isVisibilidadCeldaGuardarCambiosDetalleRecap = isVisibilidadCeldaGuardarCambiosDetalleRecap;
	}
		
	public DetalleRecapSessionBean getdetallerecapSessionBean() {
		return this.detallerecapSessionBean;
	}
	
	public void setdetallerecapSessionBean(DetalleRecapSessionBean detallerecapSessionBean) {
		this.detallerecapSessionBean=detallerecapSessionBean;
	}
	
	
	public Boolean getisVisibilidadFK_IdCliente() {
		return this.isVisibilidadFK_IdCliente;
	}

	public void setisVisibilidadFK_IdCliente(Boolean isVisibilidadFK_IdCliente) {
		this.isVisibilidadFK_IdCliente=isVisibilidadFK_IdCliente;
	}

	public Boolean getisVisibilidadFK_IdDetalleCliente() {
		return this.isVisibilidadFK_IdDetalleCliente;
	}

	public void setisVisibilidadFK_IdDetalleCliente(Boolean isVisibilidadFK_IdDetalleCliente) {
		this.isVisibilidadFK_IdDetalleCliente=isVisibilidadFK_IdDetalleCliente;
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

	public Boolean getisVisibilidadFK_IdRecap() {
		return this.isVisibilidadFK_IdRecap;
	}

	public void setisVisibilidadFK_IdRecap(Boolean isVisibilidadFK_IdRecap) {
		this.isVisibilidadFK_IdRecap=isVisibilidadFK_IdRecap;
	}

	public Boolean getisVisibilidadFK_IdSucursal() {
		return this.isVisibilidadFK_IdSucursal;
	}

	public void setisVisibilidadFK_IdSucursal(Boolean isVisibilidadFK_IdSucursal) {
		this.isVisibilidadFK_IdSucursal=isVisibilidadFK_IdSucursal;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysDetalleRecap(DetalleRecap detallerecap)throws Exception {
		try {
			
				this.setActualParaGuardarRecapForeignKey(detallerecap,null);
				this.setActualParaGuardarEmpresaForeignKey(detallerecap,null);
				this.setActualParaGuardarSucursalForeignKey(detallerecap,null);
				this.setActualParaGuardarEjercicioForeignKey(detallerecap,null);
				this.setActualParaGuardarDetalleClienteForeignKey(detallerecap,null);
				this.setActualParaGuardarClienteForeignKey(detallerecap,null);
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
	
	public void bugActualizarReferenciaActual(DetalleRecap detallerecap,DetalleRecap detallerecapAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalDetalleRecap(detallerecap);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		detallerecapAux.setId(detallerecap.getId());
		detallerecapAux.setVersionRow(detallerecap.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessDetalleRecap();
		
			int intSelectedRow = this.jTableDatosDetalleRecap.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallerecap =(DetalleRecap) this.detallerecapLogic.getDetalleRecaps().toArray()[this.jTableDatosDetalleRecap.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.detallerecap =(DetalleRecap) this.detallerecaps.toArray()[this.jTableDatosDetalleRecap.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(DetalleRecapJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualDetalleRecap(this.detallerecap,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysDetalleRecap(this.detallerecap);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = detallerecapValidator.getInvalidValues(this.detallerecap);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			detallerecapLogic.setDatosCliente(datosCliente);
			detallerecapLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				detallerecapAux=new  DetalleRecap();
				
				detallerecapAux.setIsNew(true);
				detallerecapAux.setIsChanged(true);
				
				detallerecapAux.setDetalleRecapOriginal(this.detallerecap);
				
				detallerecapAux.setId(this.detallerecap.getId());	
				detallerecapAux.setVersionRow(this.detallerecap.getVersionRow());	
				detallerecapAux.setid_recap(this.detallerecap.getid_recap());	
				detallerecapAux.setid_empresa(this.detallerecap.getid_empresa());	
				detallerecapAux.setid_sucursal(this.detallerecap.getid_sucursal());	
				detallerecapAux.setid_ejercicio(this.detallerecap.getid_ejercicio());	
				detallerecapAux.setid_detalle_cliente(this.detallerecap.getid_detalle_cliente());	
				detallerecapAux.setid_cliente(this.detallerecap.getid_cliente());	
				detallerecapAux.setvalor(this.detallerecap.getvalor());	
				detallerecapAux.setiva_porcentaje(this.detallerecap.getiva_porcentaje());	
				detallerecapAux.settotal(this.detallerecap.gettotal());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.detallerecapSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.detallerecapSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(detallerecapAux,detallerecapLogic.getDetalleRecaps());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(detallerecapAux,detallerecaps);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.detallerecapSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.detallerecapSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						detallerecapLogic.saveDetalleRecaps();//WithConnection
						//detallerecapLogic.getSetVersionRowDetalleRecaps();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.detallerecap,detallerecapAux);
					
					this.refrescarForeignKeysDescripcionesDetalleRecap();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.detallerecapSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE	
						
						if(!this.detallerecapSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								detallerecapLogic.saveDetalleRecapRelaciones(detallerecapAux);//WithConnection
								//detallerecapLogic.getSetVersionRowDetalleRecaps();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.detallerecap,detallerecapAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE	
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.detallerecapSessionBean.getEstaModoGuardarRelaciones() 
									|| this.detallerecapSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(detallerecapAux,detallerecapLogic.getDetalleRecaps());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(detallerecapAux,detallerecaps);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.detallerecap,detallerecapAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				detallerecapAux=new  DetalleRecap();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.detallerecapSessionBean.getEsGuardarRelacionado() 
					|| (this.detallerecapSessionBean.getEsGuardarRelacionado() && this.detallerecap.getId()>=0)) {
						
					detallerecapAux.setIsNew(false);
				}
				
				detallerecapAux.setIsDeleted(false);
			
				detallerecapAux.setId(this.detallerecap.getId());	
				detallerecapAux.setVersionRow(this.detallerecap.getVersionRow());	
				detallerecapAux.setid_recap(this.detallerecap.getid_recap());	
				detallerecapAux.setid_empresa(this.detallerecap.getid_empresa());	
				detallerecapAux.setid_sucursal(this.detallerecap.getid_sucursal());	
				detallerecapAux.setid_ejercicio(this.detallerecap.getid_ejercicio());	
				detallerecapAux.setid_detalle_cliente(this.detallerecap.getid_detalle_cliente());	
				detallerecapAux.setid_cliente(this.detallerecap.getid_cliente());	
				detallerecapAux.setvalor(this.detallerecap.getvalor());	
				detallerecapAux.setiva_porcentaje(this.detallerecap.getiva_porcentaje());	
				detallerecapAux.settotal(this.detallerecap.gettotal());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(detallerecapAux,detallerecapLogic.getDetalleRecaps());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(detallerecapAux,detallerecaps);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.detallerecapSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.detallerecapSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						detallerecapLogic.saveDetalleRecaps();//WithConnection
						//detallerecapLogic.getSetVersionRowDetalleRecaps();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.detallerecap,detallerecapAux);
					
					this.refrescarForeignKeysDescripcionesDetalleRecap();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.detallerecapSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						if(!this.detallerecapSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								detallerecapLogic.saveDetalleRecapRelaciones(detallerecapAux);//WithConnection
								//detallerecapLogic.getSetVersionRowDetalleRecaps();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.detallerecap,detallerecapAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.detallerecapSessionBean.getEstaModoGuardarRelaciones() 
									|| this.detallerecapSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(detallerecapAux,detallerecapLogic.getDetalleRecaps());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(detallerecapAux,detallerecaps);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.detallerecap,detallerecapAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				detallerecapAux=new  DetalleRecap();
				
				detallerecapAux.setIsNew(false);
				detallerecapAux.setIsChanged(false);
				
				detallerecapAux.setIsDeleted(true);
				
				detallerecapAux.setId(this.detallerecap.getId());	
				detallerecapAux.setVersionRow(this.detallerecap.getVersionRow());	
				detallerecapAux.setid_recap(this.detallerecap.getid_recap());	
				detallerecapAux.setid_empresa(this.detallerecap.getid_empresa());	
				detallerecapAux.setid_sucursal(this.detallerecap.getid_sucursal());	
				detallerecapAux.setid_ejercicio(this.detallerecap.getid_ejercicio());	
				detallerecapAux.setid_detalle_cliente(this.detallerecap.getid_detalle_cliente());	
				detallerecapAux.setid_cliente(this.detallerecap.getid_cliente());	
				detallerecapAux.setvalor(this.detallerecap.getvalor());	
				detallerecapAux.setiva_porcentaje(this.detallerecap.getiva_porcentaje());	
				detallerecapAux.settotal(this.detallerecap.gettotal());	
				
				if(this.detallerecapSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.detallerecapAux.getId()>=0) {	
						this.detallerecapsEliminados.add(detallerecapAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(detallerecapAux,detallerecapLogic.getDetalleRecaps());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(detallerecapAux,detallerecaps);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.detallerecapSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.detallerecapSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						detallerecapLogic.saveDetalleRecaps();//WithConnection
						//detallerecapLogic.getSetVersionRowDetalleRecaps();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.detallerecapSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						
						if(!this.detallerecapSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								detallerecapLogic.saveDetalleRecapRelaciones(detallerecapAux);//WithConnection
								//detallerecapLogic.getSetVersionRowDetalleRecaps();//WithConnection
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
							if(this.detallerecapSessionBean.getEstaModoGuardarRelaciones() 
								|| this.detallerecapSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(detallerecapAux,detallerecapLogic.getDetalleRecaps());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(detallerecapAux,detallerecaps);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallerecapLogic.getDetalleRecaps().addAll(this.detallerecapsEliminados);
					
					detallerecapLogic.saveDetalleRecaps();//WithConnection
					//detallerecapLogic.getSetVersionRowDetalleRecaps();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesDetalleRecap();
				
				this.detallerecapsEliminados= new ArrayList<DetalleRecap>();		
			}
			
			if(this.detallerecapSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.detallerecapSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Detalle Recap GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Detalle Recap",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.detallerecap=detallerecapAux;
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
      		//this.finishProcessDetalleRecap();
      	}
		
	}	
	
	public void actualizarRelaciones(DetalleRecap detallerecapLocal) throws Exception {
		
		if(this.detallerecapSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(DetalleRecap detallerecapLocal) throws Exception {	
		if(this.detallerecapSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(RecapDetalleFormJInternalFrame.class)) {
				RecapBeanSwingJInternalFrame recapBeanSwingJInternalFrameLocal=(RecapBeanSwingJInternalFrame) ((RecapDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				recapBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoRecap(recapBeanSwingJInternalFrameLocal.getrecap(),true);
				recapBeanSwingJInternalFrameLocal.actualizarLista(recapBeanSwingJInternalFrameLocal.recap,this.recapsForeignKey);

				recapBeanSwingJInternalFrameLocal.actualizarRelaciones(recapBeanSwingJInternalFrameLocal.recap);

				detallerecapLocal.setRecap(recapBeanSwingJInternalFrameLocal.recap);

				this.addItemDefectoCombosForeignKeyRecap();
				this.cargarCombosFrameRecapsForeignKey("Formulario");
				this.setActualRecapForeignKey(recapBeanSwingJInternalFrameLocal.recap.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				detallerecapLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(SucursalDetalleFormJInternalFrame.class)) {
				SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrameLocal=(SucursalBeanSwingJInternalFrame) ((SucursalDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				sucursalBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoSucursal(sucursalBeanSwingJInternalFrameLocal.getsucursal(),true);
				sucursalBeanSwingJInternalFrameLocal.actualizarLista(sucursalBeanSwingJInternalFrameLocal.sucursal,this.sucursalsForeignKey);

				sucursalBeanSwingJInternalFrameLocal.actualizarRelaciones(sucursalBeanSwingJInternalFrameLocal.sucursal);

				detallerecapLocal.setSucursal(sucursalBeanSwingJInternalFrameLocal.sucursal);

				this.addItemDefectoCombosForeignKeySucursal();
				this.cargarCombosFrameSucursalsForeignKey("Formulario");
				this.setActualSucursalForeignKey(sucursalBeanSwingJInternalFrameLocal.sucursal.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(EjercicioDetalleFormJInternalFrame.class)) {
				EjercicioBeanSwingJInternalFrame ejercicioBeanSwingJInternalFrameLocal=(EjercicioBeanSwingJInternalFrame) ((EjercicioDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				ejercicioBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEjercicio(ejercicioBeanSwingJInternalFrameLocal.getejercicio(),true);
				ejercicioBeanSwingJInternalFrameLocal.actualizarLista(ejercicioBeanSwingJInternalFrameLocal.ejercicio,this.ejerciciosForeignKey);

				ejercicioBeanSwingJInternalFrameLocal.actualizarRelaciones(ejercicioBeanSwingJInternalFrameLocal.ejercicio);

				detallerecapLocal.setEjercicio(ejercicioBeanSwingJInternalFrameLocal.ejercicio);

				this.addItemDefectoCombosForeignKeyEjercicio();
				this.cargarCombosFrameEjerciciosForeignKey("Formulario");
				this.setActualEjercicioForeignKey(ejercicioBeanSwingJInternalFrameLocal.ejercicio.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(DetalleClienteDetalleFormJInternalFrame.class)) {
				DetalleClienteBeanSwingJInternalFrame detalleclienteBeanSwingJInternalFrameLocal=(DetalleClienteBeanSwingJInternalFrame) ((DetalleClienteDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				detalleclienteBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoDetalleCliente(detalleclienteBeanSwingJInternalFrameLocal.getdetallecliente(),true);
				detalleclienteBeanSwingJInternalFrameLocal.actualizarLista(detalleclienteBeanSwingJInternalFrameLocal.detallecliente,this.detalleclientesForeignKey);

				detalleclienteBeanSwingJInternalFrameLocal.actualizarRelaciones(detalleclienteBeanSwingJInternalFrameLocal.detallecliente);

				detallerecapLocal.setDetalleCliente(detalleclienteBeanSwingJInternalFrameLocal.detallecliente);

				this.addItemDefectoCombosForeignKeyDetalleCliente();
				this.cargarCombosFrameDetalleClientesForeignKey("Formulario");
				this.setActualDetalleClienteForeignKey(detalleclienteBeanSwingJInternalFrameLocal.detallecliente.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(ClienteDetalleFormJInternalFrame.class)) {
				ClienteBeanSwingJInternalFrame clienteBeanSwingJInternalFrameLocal=(ClienteBeanSwingJInternalFrame) ((ClienteDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				clienteBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoCliente(clienteBeanSwingJInternalFrameLocal.getcliente(),true);
				clienteBeanSwingJInternalFrameLocal.actualizarLista(clienteBeanSwingJInternalFrameLocal.cliente,this.clientesForeignKey);

				clienteBeanSwingJInternalFrameLocal.actualizarRelaciones(clienteBeanSwingJInternalFrameLocal.cliente);

				detallerecapLocal.setCliente(clienteBeanSwingJInternalFrameLocal.cliente);

				this.addItemDefectoCombosForeignKeyCliente();
				this.cargarCombosFrameClientesForeignKey("Formulario");
				this.setActualClienteForeignKey(clienteBeanSwingJInternalFrameLocal.cliente.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarDetalleRecapActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosDetalleRecap.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.detallerecap =(DetalleRecap) this.detallerecapLogic.getDetalleRecaps().toArray()[this.jTableDatosDetalleRecap.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.detallerecap =(DetalleRecap) this.detallerecaps.toArray()[this.jTableDatosDetalleRecap.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = detallerecapValidator.getInvalidValues(this.detallerecap);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(DetalleRecap detallerecap,List<DetalleRecap> detallerecaps) throws Exception {
		try	{		
			DetalleRecapConstantesFunciones.actualizarLista(detallerecap,detallerecaps,this.detallerecapSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(DetalleRecap detallerecap,List<DetalleRecap> detallerecaps) throws Exception {
		try	{			
			DetalleRecapConstantesFunciones.actualizarSelectedLista(detallerecap,detallerecaps);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<DetalleRecap> detallerecapsLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				detallerecapsLocal=this.detallerecapLogic.getDetalleRecaps();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				detallerecapsLocal=this.detallerecaps;
			}
			//ARCHITECTURE
		
			for(DetalleRecap detallerecapLocal:detallerecapsLocal) {
				if(this.permiteMantenimiento(detallerecapLocal) && detallerecapLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+DetalleRecapConstantesFunciones.getDetalleRecapLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(DetalleRecapConstantesFunciones.IDRECAP)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetalleRecap.jLabelid_recapDetalleRecap,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DetalleRecapConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetalleRecap.jLabelid_empresaDetalleRecap,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DetalleRecapConstantesFunciones.IDSUCURSAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetalleRecap.jLabelid_sucursalDetalleRecap,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DetalleRecapConstantesFunciones.IDEJERCICIO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetalleRecap.jLabelid_ejercicioDetalleRecap,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DetalleRecapConstantesFunciones.IDDETALLECLIENTE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetalleRecap.jLabelid_detalle_clienteDetalleRecap,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DetalleRecapConstantesFunciones.IDCLIENTE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetalleRecap.jLabelid_clienteDetalleRecap,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DetalleRecapConstantesFunciones.VALOR)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetalleRecap.jLabelvalorDetalleRecap,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DetalleRecapConstantesFunciones.IVAPORCENTAJE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetalleRecap.jLabeliva_porcentajeDetalleRecap,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DetalleRecapConstantesFunciones.TOTAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetalleRecap.jLabeltotalDetalleRecap,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormDetalleRecap!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDetalleRecap.jLabelid_recapDetalleRecap,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDetalleRecap.jLabelid_empresaDetalleRecap,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDetalleRecap.jLabelid_sucursalDetalleRecap,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDetalleRecap.jLabelid_ejercicioDetalleRecap,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDetalleRecap.jLabelid_detalle_clienteDetalleRecap,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDetalleRecap.jLabelid_clienteDetalleRecap,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDetalleRecap.jLabelvalorDetalleRecap,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDetalleRecap.jLabeliva_porcentajeDetalleRecap,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDetalleRecap.jLabeltotalDetalleRecap,"");
		
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
		this.iIdNuevoDetalleRecap--;	
		
		
		this.detallerecapAux=new DetalleRecap();
		
		this.detallerecapAux.setId(this.iIdNuevoDetalleRecap);
		this.detallerecapAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.detallerecapLogic.getDetalleRecaps().add(this.detallerecapAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.detallerecaps.add(this.detallerecapAux);
		}
		//ARCHITECTURE
		
		this.detallerecap=this.detallerecapAux;
		
		if(DetalleRecapJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioDetalleRecap(this.detallerecap);
			this.setVariablesObjetoActualToFormularioForeignKeyDetalleRecap(this.detallerecap);
		}
				
		//this.setDefaultControlesDetalleRecap();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyDetalleRecap();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyDetalleRecap();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyDetalleRecap();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualDetalleRecap(this.detallerecapBean,this.detallerecap,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysDetalleRecap(this.detallerecap);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(DetalleRecapConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.detallerecapSessionBean.getConGuardarRelaciones()) {
			classes=DetalleRecapConstantesFunciones.getClassesRelationshipsOfDetalleRecap(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.detallerecapReturnGeneral=detallerecapLogic.procesarEventosDetalleRecapsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.detallerecapLogic.getDetalleRecaps(),this.detallerecap,this.detallerecapParameterGeneral,this.isEsNuevoDetalleRecap,classes);//this.detallerecapLogic.getDetalleRecap()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanDetalleRecap(this.detallerecapReturnGeneral,this.detallerecapBean,false);
		
		if(this.detallerecapReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyDetalleRecap(this.detallerecapReturnGeneral.getDetalleRecap());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioDetalleRecap(this.detallerecapReturnGeneral.getDetalleRecap());
		}
		
		if(this.detallerecapReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioDetalleRecap(this.detallerecapReturnGeneral.getDetalleRecap(),classes);//this.detallerecapBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualDetalleRecap(this.detallerecap,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyDetalleRecap();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyDetalleRecap();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			DetalleRecapBeanSwingJInternalFrameAdditional.RecargarFormDetalleRecap(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingDetalleRecap(false);
						
			if(detallerecapSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(DetalleRecapJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualDetalleRecap();
			}
			
			this.actualizarVisualTableDatosDetalleRecap();
			
			this.jTableDatosDetalleRecap.setRowSelectionInterval(this.getIndiceNuevoDetalleRecap(), this.getIndiceNuevoDetalleRecap());
			
			this.seleccionarFilaTablaDetalleRecapActual();
						
			this.actualizarEstadoCeldasBotonesDetalleRecap("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesDetalleRecap(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormDetalleRecap.jTextFieldvalorDetalleRecap.setEnabled(isHabilitar && this.detallerecapConstantesFunciones.activarvalorDetalleRecap);
		this.jInternalFrameDetalleFormDetalleRecap.jTextFieldiva_porcentajeDetalleRecap.setEnabled(isHabilitar && this.detallerecapConstantesFunciones.activariva_porcentajeDetalleRecap);
		this.jInternalFrameDetalleFormDetalleRecap.jTextFieldtotalDetalleRecap.setEnabled(isHabilitar && this.detallerecapConstantesFunciones.activartotalDetalleRecap);	
		
		this.jInternalFrameDetalleFormDetalleRecap.jComboBoxid_recapDetalleRecap.setEnabled(isHabilitar && this.detallerecapConstantesFunciones.activarid_recapDetalleRecap);//
		this.jInternalFrameDetalleFormDetalleRecap.jComboBoxid_empresaDetalleRecap.setEnabled(isHabilitar && this.detallerecapConstantesFunciones.activarid_empresaDetalleRecap);//
		this.jInternalFrameDetalleFormDetalleRecap.jComboBoxid_sucursalDetalleRecap.setEnabled(isHabilitar && this.detallerecapConstantesFunciones.activarid_sucursalDetalleRecap);//
		this.jInternalFrameDetalleFormDetalleRecap.jComboBoxid_ejercicioDetalleRecap.setEnabled(isHabilitar && this.detallerecapConstantesFunciones.activarid_ejercicioDetalleRecap);
		this.jInternalFrameDetalleFormDetalleRecap.jComboBoxid_detalle_clienteDetalleRecap.setEnabled(isHabilitar && this.detallerecapConstantesFunciones.activarid_detalle_clienteDetalleRecap);
		this.jInternalFrameDetalleFormDetalleRecap.jComboBoxid_clienteDetalleRecap.setEnabled(isHabilitar && this.detallerecapConstantesFunciones.activarid_clienteDetalleRecap);
	};
	
	public void setDefaultControlesDetalleRecap() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoDetalleRecap(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.detallerecapSessionBean.setConGuardarRelaciones(true);			
			this.detallerecapSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormDetalleRecap.jTabbedPaneRelacionesDetalleRecap.setVisible(true);
			
					
		} else {
			//this.detallerecapSessionBean.setConGuardarRelaciones(false);			
			this.detallerecapSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormDetalleRecap.jTabbedPaneRelacionesDetalleRecap.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoDetalleRecap() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(DetalleRecap detallerecapAux:this.detallerecapLogic.getDetalleRecaps()) {
				if(detallerecapAux.getId().equals(this.iIdNuevoDetalleRecap)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(DetalleRecap detallerecapAux:this.detallerecaps) {
				if(detallerecapAux.getId().equals(this.iIdNuevoDetalleRecap)) {
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
	
	public int getIndiceActualDetalleRecap(DetalleRecap detallerecap,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(DetalleRecap detallerecapAux:this.detallerecapLogic.getDetalleRecaps()) {
				if(detallerecapAux.getId().equals(detallerecap.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(DetalleRecap detallerecapAux:this.detallerecaps) {
				if(detallerecapAux.getId().equals(detallerecap.getId())) {
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
	
	public void setCamposBaseDesdeOriginalDetalleRecap(DetalleRecap detallerecapOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(DetalleRecap detallerecapAux:this.detallerecapLogic.getDetalleRecaps()) {
				if(detallerecapAux.getDetalleRecapOriginal().getId().equals(detallerecapOriginal.getId())) {
					existe=true;
					detallerecapOriginal.setId(detallerecapAux.getId());
					detallerecapOriginal.setVersionRow(detallerecapAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(DetalleRecap detallerecapAux:this.detallerecaps) {
				if(detallerecapAux.getDetalleRecapOriginal().getId().equals(detallerecapOriginal.getId())) {
					existe=true;
					detallerecapOriginal.setId(detallerecapAux.getId());
					detallerecapOriginal.setVersionRow(detallerecapAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosDetalleRecap(Boolean esParaCancelar) throws Exception {
		detallerecapsAux=new ArrayList<DetalleRecap>();
		detallerecapAux=new DetalleRecap();
		
		if(!this.detallerecapSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(DetalleRecap detallerecapAux:this.detallerecapLogic.getDetalleRecaps()) {
					if(detallerecapAux.getId()<0) {
						detallerecapsAux.add(detallerecapAux);
					}		
				}
				this.iIdNuevoDetalleRecap=0L;
				this.detallerecapLogic.getDetalleRecaps().removeAll(detallerecapsAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(DetalleRecap detallerecapAux:this.detallerecaps) {
					if(detallerecapAux.getId()<0) {
						detallerecapsAux.add(detallerecapAux);
					}		
				}
				this.iIdNuevoDetalleRecap=0L;
				this.detallerecaps.removeAll(detallerecapsAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoDetalleRecap 
					&& this.detallerecapLogic.getDetalleRecaps().size()>0
					) {
					detallerecapAux=this.detallerecapLogic.getDetalleRecaps().get(this.detallerecapLogic.getDetalleRecaps().size() - 1);
				
					if(detallerecapAux.getId()<0) {
						this.detallerecapLogic.getDetalleRecaps().remove(detallerecapAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoDetalleRecap && this.detallerecaps.size()>0) {
					detallerecapAux=this.detallerecaps.get(this.detallerecaps.size() - 1);
				
					if(detallerecapAux.getId()<0) {
						this.detallerecaps.remove(detallerecapAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoDetalleRecap(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(detallerecap.getId()<0) {
				this.detallerecapLogic.getDetalleRecaps().remove(this.detallerecap);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(detallerecap.getId()<0) {
				this.detallerecaps.remove(this.detallerecap);
			}
		}			
	}
	
	public void setEstadosInicialesDetalleRecap(List<DetalleRecap> detallerecapsAux) throws Exception {
		DetalleRecapConstantesFunciones.setEstadosInicialesDetalleRecap(detallerecapsAux);
	}
	
	public void setEstadosInicialesDetalleRecap(DetalleRecap detallerecapAux) throws Exception {
		DetalleRecapConstantesFunciones.setEstadosInicialesDetalleRecap(detallerecapAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarDetalleRecapActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesDetalleRecap("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,DetalleRecapConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarDetalleRecapActual()) {
				if(!this.isEsNuevoDetalleRecap) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesDetalleRecap("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoDetalleRecap=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,DetalleRecapConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarDetalleRecapActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Detalle Recap ?", "MANTENIMIENTO DE Detalle Recap", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesDetalleRecap("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,DetalleRecapConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleRecapConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(DetalleRecap detallerecap) throws Exception {
		DetalleRecapConstantesFunciones.seleccionarAsignar(this.detallerecap,detallerecap);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarDetalleRecap=this.isPermisoActualizarOriginalDetalleRecap;
			
			
			this.seleccionarAsignar(detallerecap);
			
			

			idClienteActual=detallerecap.getid_cliente();
			this.seleccionarClienteActual();
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			DetalleRecapConstantesFunciones.quitarEspaciosDetalleRecap(this.detallerecap,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesDetalleRecap("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleRecapConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.detallerecapSessionBean.setsFuncionBusquedaRapida(this.detallerecapSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleRecapConstantesFunciones.CLASSNAME);
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
			if(this.isEsNuevoDetalleRecap) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosDetalleRecap(esParaCancelar);				
				this.cancelarNuevoDetalleRecap(esParaCancelar);								
			}
			
			this.detallerecap=new DetalleRecap();
			
			this.inicializarDetalleRecap();
			
			this.actualizarEstadoCeldasBotonesDetalleRecap("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleRecapConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarDetalleRecap() throws Exception {
		try {
			DetalleRecapConstantesFunciones.inicializarDetalleRecap(this.detallerecap);
			
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
			FuncionesSwing.manageException(this, e,logger,DetalleRecapConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.detallerecapLogic.getDetalleRecaps().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleRecapConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteDetalleRecaps(String sAccionBusqueda,List<DetalleRecap> detallerecapsParaReportes) throws Exception {
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
					sPathReporteFinal="DetalleRecap"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="DetalleRecapMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("DetalleRecapMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="DetalleRecap"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Detalle Recapes");		
		parameters.put("busquedapor", DetalleRecapConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceDetalleRecap=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			DetalleRecapConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			DetalleRecapConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceDetalleRecap=new JRBeanArrayDataSource(DetalleRecapJInternalFrame.TraerDetalleRecapBeans(detallerecapsParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceDetalleRecap);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+DetalleRecapConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+DetalleRecapConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(DetalleRecapBean.TraerDetalleRecapBeans(detallerecapsParaReportes).toArray()));
							
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
				this.generarExcelReporteDetalleRecaps(sAccionBusqueda,sTipoArchivoReporte,detallerecapsParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalDetalleRecaps(sAccionBusqueda,sTipoArchivoReporte,detallerecapsParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoDetalleRecapActionPerformed(null);
					//this.generarExcelReporteDetalleRecaps(sAccionBusqueda,sTipoArchivoReporte,detallerecapsParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalDetalleRecaps(sAccionBusqueda,sTipoArchivoReporte,detallerecapsParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesDetalleRecaps(sAccionBusqueda,sTipoArchivoReporte,detallerecapsParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesDetalleRecaps(sAccionBusqueda,sTipoArchivoReporte,detallerecapsParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteDetalleRecaps(String sAccionBusqueda,String sTipoArchivoReporte,List<DetalleRecap> detallerecapsParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"detallerecap";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("DetalleRecaps");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderDetalleRecap("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(DetalleRecap detallerecap : detallerecapsParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			DetalleRecapConstantesFunciones.generarExcelReporteDataDetalleRecap("NORMAL",row,workbook,detallerecap,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.detallerecapSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Detalle Recap",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderDetalleRecap(String sTipo,Row row,Workbook workbook) {
		
		DetalleRecapConstantesFunciones.generarExcelReporteHeaderDetalleRecap(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalDetalleRecaps(String sAccionBusqueda,String sTipoArchivoReporte,List<DetalleRecap> detallerecapsParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"detallerecap_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("DetalleRecaps");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(DetalleRecap detallerecap : detallerecapsParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(DetalleRecapConstantesFunciones.getDetalleRecapDescripcion(detallerecap));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DetalleRecapConstantesFunciones.LABEL_IDRECAP))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DetalleRecapConstantesFunciones.LABEL_IDRECAP);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(detallerecap.getrecap_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DetalleRecapConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DetalleRecapConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(detallerecap.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DetalleRecapConstantesFunciones.LABEL_IDSUCURSAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DetalleRecapConstantesFunciones.LABEL_IDSUCURSAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(detallerecap.getsucursal_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DetalleRecapConstantesFunciones.LABEL_IDEJERCICIO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DetalleRecapConstantesFunciones.LABEL_IDEJERCICIO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(detallerecap.getejercicio_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DetalleRecapConstantesFunciones.LABEL_IDDETALLECLIENTE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DetalleRecapConstantesFunciones.LABEL_IDDETALLECLIENTE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(detallerecap.getdetallecliente_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DetalleRecapConstantesFunciones.LABEL_IDCLIENTE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DetalleRecapConstantesFunciones.LABEL_IDCLIENTE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(detallerecap.getcliente_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DetalleRecapConstantesFunciones.LABEL_VALOR))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DetalleRecapConstantesFunciones.LABEL_VALOR);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(detallerecap.getvalor());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DetalleRecapConstantesFunciones.LABEL_IVAPORCENTAJE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DetalleRecapConstantesFunciones.LABEL_IVAPORCENTAJE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(detallerecap.getiva_porcentaje());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DetalleRecapConstantesFunciones.LABEL_TOTAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DetalleRecapConstantesFunciones.LABEL_TOTAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(detallerecap.gettotal());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.detallerecapSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Detalle Recap",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesDetalleRecaps(String sAccionBusqueda,String sTipoArchivoReporte,List<DetalleRecap> detallerecapsParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<DetalleRecap> detallerecapsRespaldo=null;
		
		classes=DetalleRecapConstantesFunciones.getClassesRelationshipsOfDetalleRecap(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.detallerecapLogic.setDatosCliente(this.datosCliente);
		this.detallerecapLogic.setDatosDeep(this.datosDeep);
		this.detallerecapLogic.setIsConDeep(true);
		
		detallerecapsRespaldo=this.detallerecapLogic.getDetalleRecaps();
		
		this.detallerecapLogic.setDetalleRecaps(detallerecapsParaReportes);	
		this.detallerecapLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		detallerecapsParaReportes=this.detallerecapLogic.getDetalleRecaps();
		this.detallerecapLogic.setDetalleRecaps(detallerecapsRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"detallerecap_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("DetalleRecaps");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderDetalleRecap("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(DetalleRecap detallerecap : detallerecapsParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderDetalleRecap("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			DetalleRecapConstantesFunciones.generarExcelReporteDataDetalleRecap("NORMAL",row,workbook,detallerecap,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(DetalleRecapConstantesFunciones.getDetalleRecapDescripcion(detallerecap));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.detallerecapSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Detalle Recap",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoDetalleRecap.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoDetalleRecap.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoDetalleRecap.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoDetalleRecap.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessDetalleRecap() throws Exception {		
		this.startProcessDetalleRecap(true);
	}
	
	public void startProcessDetalleRecap(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasDetalleRecap ,this.jPanelParametrosReportesDetalleRecap, this.jScrollPanelDatosDetalleRecap,this.jPanelPaginacionDetalleRecap, this.jScrollPanelDatosEdicionDetalleRecap, this.jPanelAccionesDetalleRecap,this.jPanelAccionesFormularioDetalleRecap,this.jmenuBarDetalleRecap,this.jmenuBarDetalleDetalleRecap,this.jTtoolBarDetalleRecap,this.jTtoolBarDetalleDetalleRecap);		
		
		final JTabbedPane jTabbedPaneBusquedasDetalleRecap=this.jTabbedPaneBusquedasDetalleRecap; 
		
		final JPanel jPanelParametrosReportesDetalleRecap=this.jPanelParametrosReportesDetalleRecap;
		//final JScrollPane jScrollPanelDatosDetalleRecap=this.jScrollPanelDatosDetalleRecap;
		final JTable jTableDatosDetalleRecap=this.jTableDatosDetalleRecap;		
		final JPanel jPanelPaginacionDetalleRecap=this.jPanelPaginacionDetalleRecap;
		//final JScrollPane jScrollPanelDatosEdicionDetalleRecap=this.jScrollPanelDatosEdicionDetalleRecap;
		final JPanel jPanelAccionesDetalleRecap=this.jPanelAccionesDetalleRecap;
		
		JPanel jPanelCamposAuxiliarDetalleRecap=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarDetalleRecap=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormDetalleRecap!=null) {
			jPanelCamposAuxiliarDetalleRecap=this.jInternalFrameDetalleFormDetalleRecap.jPanelCamposDetalleRecap;
			jPanelAccionesFormularioAuxiliarDetalleRecap=this.jInternalFrameDetalleFormDetalleRecap.jPanelAccionesFormularioDetalleRecap;
		}
		
		final JPanel jPanelCamposDetalleRecap=jPanelCamposAuxiliarDetalleRecap;
		final JPanel jPanelAccionesFormularioDetalleRecap=jPanelAccionesFormularioAuxiliarDetalleRecap;
		
		
		final JMenuBar jmenuBarDetalleRecap=this.jmenuBarDetalleRecap;
		final JToolBar jTtoolBarDetalleRecap=this.jTtoolBarDetalleRecap;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarDetalleRecap=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarDetalleRecap=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormDetalleRecap!=null) {
			jmenuBarDetalleAuxiliarDetalleRecap=this.jInternalFrameDetalleFormDetalleRecap.jmenuBarDetalleDetalleRecap;
			jTtoolBarDetalleAuxiliarDetalleRecap=this.jInternalFrameDetalleFormDetalleRecap.jTtoolBarDetalleDetalleRecap;
		}
		
		final JMenuBar jmenuBarDetalleDetalleRecap=jmenuBarDetalleAuxiliarDetalleRecap;
		final JToolBar jTtoolBarDetalleDetalleRecap=jTtoolBarDetalleAuxiliarDetalleRecap;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasDetalleRecap;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesDetalleRecap;
			processRunnable.jTableDatos=jTableDatosDetalleRecap;
			processRunnable.jPanelCampos=jPanelCamposDetalleRecap;
			processRunnable.jPanelPaginacion=jPanelPaginacionDetalleRecap;
			processRunnable.jPanelAcciones=jPanelAccionesDetalleRecap;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioDetalleRecap;
			
			
			processRunnable.jmenuBar=jmenuBarDetalleRecap;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleDetalleRecap;
			processRunnable.jTtoolBar=jTtoolBarDetalleRecap;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleDetalleRecap;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasDetalleRecap ,jPanelParametrosReportesDetalleRecap,jTableDatosDetalleRecap, /*jScrollPanelDatosDetalleRecap,*/jPanelCamposDetalleRecap,jPanelPaginacionDetalleRecap, /*jScrollPanelDatosEdicionDetalleRecap,*/ jPanelAccionesDetalleRecap,jPanelAccionesFormularioDetalleRecap,jmenuBarDetalleRecap,jmenuBarDetalleDetalleRecap,jTtoolBarDetalleRecap,jTtoolBarDetalleDetalleRecap);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasDetalleRecap ,jPanelParametrosReportesDetalleRecap, jScrollPanelDatosDetalleRecap,jPanelPaginacionDetalleRecap, jScrollPanelDatosEdicionDetalleRecap, jPanelAccionesDetalleRecap,jPanelAccionesFormularioDetalleRecap,jmenuBarDetalleRecap,jmenuBarDetalleDetalleRecap,jTtoolBarDetalleRecap,jTtoolBarDetalleDetalleRecap);
						
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
	
	public void finishProcessDetalleRecap() {// throws Exception 
		this.finishProcessDetalleRecap(true);
	}
	
	public void finishProcessDetalleRecap(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasDetalleRecap ,this.jPanelParametrosReportesDetalleRecap, this.jScrollPanelDatosDetalleRecap,this.jPanelPaginacionDetalleRecap, this.jScrollPanelDatosEdicionDetalleRecap, this.jPanelAccionesDetalleRecap,this.jPanelAccionesFormularioDetalleRecap,this.jmenuBarDetalleRecap,this.jmenuBarDetalleDetalleRecap,this.jTtoolBarDetalleRecap,this.jTtoolBarDetalleDetalleRecap);		
		
		final JTabbedPane jTabbedPaneBusquedasDetalleRecap=this.jTabbedPaneBusquedasDetalleRecap; 
		
		final JPanel jPanelParametrosReportesDetalleRecap=this.jPanelParametrosReportesDetalleRecap;
		//final JScrollPane jScrollPanelDatosDetalleRecap=this.jScrollPanelDatosDetalleRecap;
		final JTable jTableDatosDetalleRecap=this.jTableDatosDetalleRecap;		
		final JPanel jPanelPaginacionDetalleRecap=this.jPanelPaginacionDetalleRecap;
		//final JScrollPane jScrollPanelDatosEdicionDetalleRecap=this.jScrollPanelDatosEdicionDetalleRecap;
		final JPanel jPanelAccionesDetalleRecap=this.jPanelAccionesDetalleRecap;
		
		JPanel jPanelCamposAuxiliarDetalleRecap=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarDetalleRecap=new JPanel();
		
		if(this.jInternalFrameDetalleFormDetalleRecap!=null) {
			jPanelCamposAuxiliarDetalleRecap=this.jInternalFrameDetalleFormDetalleRecap.jPanelCamposDetalleRecap;
			jPanelAccionesFormularioAuxiliarDetalleRecap=this.jInternalFrameDetalleFormDetalleRecap.jPanelAccionesFormularioDetalleRecap;
		}
		
		final JPanel jPanelCamposDetalleRecap=jPanelCamposAuxiliarDetalleRecap;
		final JPanel jPanelAccionesFormularioDetalleRecap=jPanelAccionesFormularioAuxiliarDetalleRecap;
		
		
		final JMenuBar jmenuBarDetalleRecap=this.jmenuBarDetalleRecap;		
		final JToolBar jTtoolBarDetalleRecap=this.jTtoolBarDetalleRecap;
				
		JMenuBar jmenuBarDetalleAuxiliarDetalleRecap=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarDetalleRecap=new JToolBar();
		
		if(this.jInternalFrameDetalleFormDetalleRecap!=null) {
			jmenuBarDetalleAuxiliarDetalleRecap=this.jInternalFrameDetalleFormDetalleRecap.jmenuBarDetalleDetalleRecap;
			jTtoolBarDetalleAuxiliarDetalleRecap=this.jInternalFrameDetalleFormDetalleRecap.jTtoolBarDetalleDetalleRecap;		
		}
		
		final JMenuBar jmenuBarDetalleDetalleRecap=jmenuBarDetalleAuxiliarDetalleRecap;
		final JToolBar jTtoolBarDetalleDetalleRecap=jTtoolBarDetalleAuxiliarDetalleRecap;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasDetalleRecap;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesDetalleRecap;
			processRunnable.jTableDatos=jTableDatosDetalleRecap;
			processRunnable.jPanelCampos=jPanelCamposDetalleRecap;
			processRunnable.jPanelPaginacion=jPanelPaginacionDetalleRecap;
			processRunnable.jPanelAcciones=jPanelAccionesDetalleRecap;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioDetalleRecap;
			
			
			processRunnable.jmenuBar=jmenuBarDetalleRecap;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleDetalleRecap;
			processRunnable.jTtoolBar=jTtoolBarDetalleRecap;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleDetalleRecap;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasDetalleRecap ,jPanelParametrosReportesDetalleRecap, jTableDatosDetalleRecap,/*jScrollPanelDatosDetalleRecap,*/jPanelCamposDetalleRecap,jPanelPaginacionDetalleRecap, /*jScrollPanelDatosEdicionDetalleRecap,*/ jPanelAccionesDetalleRecap,jPanelAccionesFormularioDetalleRecap,jmenuBarDetalleRecap,jmenuBarDetalleDetalleRecap,jTtoolBarDetalleRecap,jTtoolBarDetalleDetalleRecap));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesDetalleRecap(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarDetalleRecap(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuDetalleRecap(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarDetalleRecap(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleRecap,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleDetalleRecap,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuDetalleRecap(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleRecap,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleDetalleRecap,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.detallerecapConstantesFunciones.getsFinalQueryDetalleRecap();
		String  finalQueryPaginacionTodos=this.detallerecapConstantesFunciones.getsFinalQueryDetalleRecap();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=DetalleRecapConstantesFunciones.getArrayColumnasGlobalesNoDetalleRecap(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=DetalleRecapConstantesFunciones.getArrayColumnasGlobalesDetalleRecap(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,DetalleRecapConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.detallerecapsEliminados= new ArrayList<DetalleRecap>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessDetalleRecap();
		
				///*DetalleRecapSessionBean*/this.detallerecapSessionBean=new DetalleRecapSessionBean();
			
			if(this.detallerecapSessionBean==null) {
				this.detallerecapSessionBean=new DetalleRecapSessionBean();
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
					this.iNumeroPaginacion=DetalleRecapConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=DetalleRecapConstantesFunciones.getClassesForeignKeysOfDetalleRecap(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/detallerecap."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			detallerecapsAux= new ArrayList<DetalleRecap>();
			
				
			detallerecapLogic.setDatosCliente(this.datosCliente);
			detallerecapLogic.setDatosDeep(this.datosDeep);
			detallerecapLogic.setIsConDeep(true);
			
			
			detallerecapLogic.getDetalleRecapDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					detallerecapLogic.getTodosDetalleRecaps(finalQueryGlobal,pagination);
					
					//detallerecapLogic.getTodosDetalleRecapsWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(detallerecapLogic.getDetalleRecaps()==null|| detallerecapLogic.getDetalleRecaps().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							detallerecapsAux= new ArrayList<DetalleRecap>();
							detallerecapsAux.addAll(detallerecapLogic.getDetalleRecaps());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							detallerecapsAux= new ArrayList<DetalleRecap>();
							detallerecapsAux.addAll(detallerecaps);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							detallerecapLogic.getTodosDetalleRecaps(finalQueryGlobal+"",this.pagination);												
							
							//detallerecapLogic.getTodosDetalleRecapsWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteDetalleRecaps("Todos",detallerecapLogic.getDetalleRecaps() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							detallerecapLogic.setDetalleRecaps(new ArrayList<DetalleRecap>());					
							detallerecapLogic.getDetalleRecaps().addAll(detallerecapsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							detallerecaps=new ArrayList<DetalleRecap>();
							detallerecaps.addAll(detallerecapsAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idDetalleRecap=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idDetalleRecap=this.idActual;
				
				} else if(this.idDetalleRecapActual!=null && this.idDetalleRecapActual!=0L) {
					idDetalleRecap=idDetalleRecapActual;
				}
				
					
				this.sDetalleReporte=DetalleRecapConstantesFunciones.getDetalleIndicePorId(idDetalleRecap);
				
				this.detallerecaps=new ArrayList<DetalleRecap>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					detallerecapLogic.getEntity(idDetalleRecap);
					
					//detallerecapLogic.getEntityWithConnection(idDetalleRecap);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					detallerecapLogic.setDetalleRecaps(new ArrayList<DetalleRecap>());
					detallerecapLogic.getDetalleRecaps().add(detallerecapLogic.getDetalleRecap());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.detallerecaps=new ArrayList<DetalleRecap>();
					this.detallerecaps.add(detallerecap);
				}
				
				if(detallerecapLogic.getDetalleRecap()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdCliente")) {
				this.sDetalleReporte=DetalleRecapConstantesFunciones.getDetalleIndiceFK_IdCliente(id_clienteFK_IdCliente);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					detallerecapLogic.getDetalleRecapsFK_IdCliente(finalQueryGlobal,pagination,id_clienteFK_IdCliente);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DetalleRecapConstantesFunciones.getDetalleIndiceFK_IdCliente(id_clienteFK_IdCliente);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DetalleRecapConstantesFunciones.getDetalleIndiceFK_IdCliente(id_clienteFK_IdCliente);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=detallerecapLogic.getDetalleRecaps()==null||detallerecapLogic.getDetalleRecaps().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=detallerecaps==null|| detallerecaps.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						detallerecapsAux=new ArrayList<DetalleRecap>();
						detallerecapsAux.addAll(detallerecapLogic.getDetalleRecaps());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							detallerecapsAux=new ArrayList<DetalleRecap>();
							detallerecapsAux.addAll(detallerecaps);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							detallerecapLogic.getDetalleRecapsFK_IdCliente(finalQueryGlobal,pagination,id_clienteFK_IdCliente);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DetalleRecapConstantesFunciones.getDetalleIndiceFK_IdCliente(id_clienteFK_IdCliente);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DetalleRecapConstantesFunciones.getDetalleIndiceFK_IdCliente(id_clienteFK_IdCliente);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteDetalleRecaps("FK_IdCliente",detallerecapLogic.getDetalleRecaps());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteDetalleRecaps("FK_IdCliente",detallerecaps);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						detallerecapLogic.setDetalleRecaps(new ArrayList<DetalleRecap>());
						detallerecapLogic.getDetalleRecaps().addAll(detallerecapsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							detallerecaps=new ArrayList<DetalleRecap>();
							detallerecaps.addAll(detallerecapsAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdDetalleCliente")) {
				this.sDetalleReporte=DetalleRecapConstantesFunciones.getDetalleIndiceFK_IdDetalleCliente(id_detalle_clienteFK_IdDetalleCliente);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					detallerecapLogic.getDetalleRecapsFK_IdDetalleCliente(finalQueryGlobal,pagination,id_detalle_clienteFK_IdDetalleCliente);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DetalleRecapConstantesFunciones.getDetalleIndiceFK_IdDetalleCliente(id_detalle_clienteFK_IdDetalleCliente);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DetalleRecapConstantesFunciones.getDetalleIndiceFK_IdDetalleCliente(id_detalle_clienteFK_IdDetalleCliente);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=detallerecapLogic.getDetalleRecaps()==null||detallerecapLogic.getDetalleRecaps().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=detallerecaps==null|| detallerecaps.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						detallerecapsAux=new ArrayList<DetalleRecap>();
						detallerecapsAux.addAll(detallerecapLogic.getDetalleRecaps());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							detallerecapsAux=new ArrayList<DetalleRecap>();
							detallerecapsAux.addAll(detallerecaps);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							detallerecapLogic.getDetalleRecapsFK_IdDetalleCliente(finalQueryGlobal,pagination,id_detalle_clienteFK_IdDetalleCliente);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DetalleRecapConstantesFunciones.getDetalleIndiceFK_IdDetalleCliente(id_detalle_clienteFK_IdDetalleCliente);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DetalleRecapConstantesFunciones.getDetalleIndiceFK_IdDetalleCliente(id_detalle_clienteFK_IdDetalleCliente);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteDetalleRecaps("FK_IdDetalleCliente",detallerecapLogic.getDetalleRecaps());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteDetalleRecaps("FK_IdDetalleCliente",detallerecaps);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						detallerecapLogic.setDetalleRecaps(new ArrayList<DetalleRecap>());
						detallerecapLogic.getDetalleRecaps().addAll(detallerecapsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							detallerecaps=new ArrayList<DetalleRecap>();
							detallerecaps.addAll(detallerecapsAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdEjercicio")) {
				this.sDetalleReporte=DetalleRecapConstantesFunciones.getDetalleIndiceFK_IdEjercicio(id_ejercicioFK_IdEjercicio);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					detallerecapLogic.getDetalleRecapsFK_IdEjercicio(finalQueryGlobal,pagination,id_ejercicioFK_IdEjercicio);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DetalleRecapConstantesFunciones.getDetalleIndiceFK_IdEjercicio(id_ejercicioFK_IdEjercicio);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DetalleRecapConstantesFunciones.getDetalleIndiceFK_IdEjercicio(id_ejercicioFK_IdEjercicio);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=detallerecapLogic.getDetalleRecaps()==null||detallerecapLogic.getDetalleRecaps().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=detallerecaps==null|| detallerecaps.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						detallerecapsAux=new ArrayList<DetalleRecap>();
						detallerecapsAux.addAll(detallerecapLogic.getDetalleRecaps());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							detallerecapsAux=new ArrayList<DetalleRecap>();
							detallerecapsAux.addAll(detallerecaps);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							detallerecapLogic.getDetalleRecapsFK_IdEjercicio(finalQueryGlobal,pagination,id_ejercicioFK_IdEjercicio);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DetalleRecapConstantesFunciones.getDetalleIndiceFK_IdEjercicio(id_ejercicioFK_IdEjercicio);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DetalleRecapConstantesFunciones.getDetalleIndiceFK_IdEjercicio(id_ejercicioFK_IdEjercicio);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteDetalleRecaps("FK_IdEjercicio",detallerecapLogic.getDetalleRecaps());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteDetalleRecaps("FK_IdEjercicio",detallerecaps);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						detallerecapLogic.setDetalleRecaps(new ArrayList<DetalleRecap>());
						detallerecapLogic.getDetalleRecaps().addAll(detallerecapsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							detallerecaps=new ArrayList<DetalleRecap>();
							detallerecaps.addAll(detallerecapsAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=DetalleRecapConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					detallerecapLogic.getDetalleRecapsFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DetalleRecapConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DetalleRecapConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=detallerecapLogic.getDetalleRecaps()==null||detallerecapLogic.getDetalleRecaps().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=detallerecaps==null|| detallerecaps.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						detallerecapsAux=new ArrayList<DetalleRecap>();
						detallerecapsAux.addAll(detallerecapLogic.getDetalleRecaps());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							detallerecapsAux=new ArrayList<DetalleRecap>();
							detallerecapsAux.addAll(detallerecaps);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							detallerecapLogic.getDetalleRecapsFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DetalleRecapConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DetalleRecapConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteDetalleRecaps("FK_IdEmpresa",detallerecapLogic.getDetalleRecaps());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteDetalleRecaps("FK_IdEmpresa",detallerecaps);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						detallerecapLogic.setDetalleRecaps(new ArrayList<DetalleRecap>());
						detallerecapLogic.getDetalleRecaps().addAll(detallerecapsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							detallerecaps=new ArrayList<DetalleRecap>();
							detallerecaps.addAll(detallerecapsAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdRecap")) {
				this.sDetalleReporte=DetalleRecapConstantesFunciones.getDetalleIndiceFK_IdRecap(id_recapFK_IdRecap);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					detallerecapLogic.getDetalleRecapsFK_IdRecap(finalQueryGlobal,pagination,id_recapFK_IdRecap);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DetalleRecapConstantesFunciones.getDetalleIndiceFK_IdRecap(id_recapFK_IdRecap);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DetalleRecapConstantesFunciones.getDetalleIndiceFK_IdRecap(id_recapFK_IdRecap);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=detallerecapLogic.getDetalleRecaps()==null||detallerecapLogic.getDetalleRecaps().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=detallerecaps==null|| detallerecaps.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						detallerecapsAux=new ArrayList<DetalleRecap>();
						detallerecapsAux.addAll(detallerecapLogic.getDetalleRecaps());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							detallerecapsAux=new ArrayList<DetalleRecap>();
							detallerecapsAux.addAll(detallerecaps);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							detallerecapLogic.getDetalleRecapsFK_IdRecap(finalQueryGlobal,pagination,id_recapFK_IdRecap);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DetalleRecapConstantesFunciones.getDetalleIndiceFK_IdRecap(id_recapFK_IdRecap);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DetalleRecapConstantesFunciones.getDetalleIndiceFK_IdRecap(id_recapFK_IdRecap);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteDetalleRecaps("FK_IdRecap",detallerecapLogic.getDetalleRecaps());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteDetalleRecaps("FK_IdRecap",detallerecaps);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						detallerecapLogic.setDetalleRecaps(new ArrayList<DetalleRecap>());
						detallerecapLogic.getDetalleRecaps().addAll(detallerecapsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							detallerecaps=new ArrayList<DetalleRecap>();
							detallerecaps.addAll(detallerecapsAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdSucursal")) {
				this.sDetalleReporte=DetalleRecapConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					detallerecapLogic.getDetalleRecapsFK_IdSucursal(finalQueryGlobal,pagination,id_sucursalFK_IdSucursal);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DetalleRecapConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DetalleRecapConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=detallerecapLogic.getDetalleRecaps()==null||detallerecapLogic.getDetalleRecaps().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=detallerecaps==null|| detallerecaps.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						detallerecapsAux=new ArrayList<DetalleRecap>();
						detallerecapsAux.addAll(detallerecapLogic.getDetalleRecaps());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							detallerecapsAux=new ArrayList<DetalleRecap>();
							detallerecapsAux.addAll(detallerecaps);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							detallerecapLogic.getDetalleRecapsFK_IdSucursal(finalQueryGlobal,pagination,id_sucursalFK_IdSucursal);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DetalleRecapConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DetalleRecapConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteDetalleRecaps("FK_IdSucursal",detallerecapLogic.getDetalleRecaps());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteDetalleRecaps("FK_IdSucursal",detallerecaps);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						detallerecapLogic.setDetalleRecaps(new ArrayList<DetalleRecap>());
						detallerecapLogic.getDetalleRecaps().addAll(detallerecapsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							detallerecaps=new ArrayList<DetalleRecap>();
							detallerecaps.addAll(detallerecapsAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesDetalleRecap();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessDetalleRecap();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=detallerecapLogic.getDetalleRecaps().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=detallerecaps.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=detallerecapLogic.getDetalleRecaps().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=detallerecaps.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(DetalleRecap detallerecap) {
		Boolean permite=true;
		
		if(this.detallerecap.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=DetalleRecapConstantesFunciones.getOrderByListaDetalleRecap();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=DetalleRecapConstantesFunciones.getOrderByListaDetalleRecap();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(DetalleRecap detallerecap:detallerecapLogic.getDetalleRecaps()) {
				if(detallerecap.getsType().equals(Constantes2.S_TOTALES)) {
					detallerecapTotales=detallerecap;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(DetalleRecap detallerecap:this.detallerecaps) {
				if(detallerecap.getsType().equals(Constantes2.S_TOTALES)) {
					detallerecapTotales=detallerecap;
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
			this.detallerecapAux=new DetalleRecap();
			this.detallerecapAux.setsType(Constantes2.S_TOTALES);
			this.detallerecapAux.setIsNew(false);
			this.detallerecapAux.setIsChanged(false);
			this.detallerecapAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				DetalleRecapConstantesFunciones.TotalizarValoresFilaDetalleRecap(this.detallerecapLogic.getDetalleRecaps(),this.detallerecapAux);
				
				this.detallerecapLogic.getDetalleRecaps().add(this.detallerecapAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				DetalleRecapConstantesFunciones.TotalizarValoresFilaDetalleRecap(this.detallerecaps,this.detallerecapAux);
				
				this.detallerecaps.add(this.detallerecapAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		detallerecapTotales=new DetalleRecap();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.detallerecapLogic.getDetalleRecaps().remove(detallerecapTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.detallerecaps.remove(detallerecapTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		detallerecapTotales=new DetalleRecap();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(DetalleRecap detallerecap:detallerecapLogic.getDetalleRecaps()) {
				if(detallerecap.getsType().equals(Constantes2.S_TOTALES)) {
					detallerecapTotales=detallerecap;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				DetalleRecapConstantesFunciones.TotalizarValoresFilaDetalleRecap(this.detallerecapLogic.getDetalleRecaps(),detallerecapTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(DetalleRecap detallerecap:this.detallerecaps) {
				if(detallerecap.getsType().equals(Constantes2.S_TOTALES)) {
					detallerecapTotales=detallerecap;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				DetalleRecapConstantesFunciones.TotalizarValoresFilaDetalleRecap(this.detallerecaps,detallerecapTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleRecapConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getDetalleRecapsFK_IdCliente()throws Exception {
		try {
			sAccionBusqueda="FK_IdCliente";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getDetalleRecapsFK_IdDetalleCliente()throws Exception {
		try {
			sAccionBusqueda="FK_IdDetalleCliente";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getDetalleRecapsFK_IdEjercicio()throws Exception {
		try {
			sAccionBusqueda="FK_IdEjercicio";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getDetalleRecapsFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getDetalleRecapsFK_IdRecap()throws Exception {
		try {
			sAccionBusqueda="FK_IdRecap";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getDetalleRecapsFK_IdSucursal()throws Exception {
		try {
			sAccionBusqueda="FK_IdSucursal";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getDetalleRecapsFK_IdCliente(String sFinalQuery,Long id_cliente)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					detallerecapLogic.getDetalleRecapsFK_IdCliente(sFinalQuery,this.pagination,id_cliente);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getDetalleRecapsFK_IdDetalleCliente(String sFinalQuery,Long id_detalle_cliente)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					detallerecapLogic.getDetalleRecapsFK_IdDetalleCliente(sFinalQuery,this.pagination,id_detalle_cliente);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getDetalleRecapsFK_IdEjercicio(String sFinalQuery,Long id_ejercicio)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					detallerecapLogic.getDetalleRecapsFK_IdEjercicio(sFinalQuery,this.pagination,id_ejercicio);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getDetalleRecapsFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					detallerecapLogic.getDetalleRecapsFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getDetalleRecapsFK_IdRecap(String sFinalQuery,Long id_recap)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					detallerecapLogic.getDetalleRecapsFK_IdRecap(sFinalQuery,this.pagination,id_recap);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getDetalleRecapsFK_IdSucursal(String sFinalQuery,Long id_sucursal)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					detallerecapLogic.getDetalleRecapsFK_IdSucursal(sFinalQuery,this.pagination,id_sucursal);
				
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
	
	public void inicializarPermisosDetalleRecap() {
		this.isPermisoTodoDetalleRecap=false;
		this.isPermisoNuevoDetalleRecap=false;
		this.isPermisoActualizarDetalleRecap=false;
		this.isPermisoActualizarOriginalDetalleRecap=false;
		this.isPermisoEliminarDetalleRecap=false;
		this.isPermisoGuardarCambiosDetalleRecap=false;
		this.isPermisoConsultaDetalleRecap=false;
		this.isPermisoBusquedaDetalleRecap=false;
		this.isPermisoReporteDetalleRecap=false;		
		this.isPermisoOrdenDetalleRecap=false;		
		this.isPermisoPaginacionMedioDetalleRecap=false;		
		this.isPermisoPaginacionAltoDetalleRecap=false;
		this.isPermisoPaginacionTodoDetalleRecap=false;
		this.isPermisoCopiarDetalleRecap=false;		
		this.isPermisoVerFormDetalleRecap=false;		
		this.isPermisoDuplicarDetalleRecap=false;		
		this.isPermisoOrdenDetalleRecap=false;		
	}
	
	public void setPermisosUsuarioDetalleRecap(Boolean isPermiso) {
		this.isPermisoTodoDetalleRecap=isPermiso;
		this.isPermisoNuevoDetalleRecap=isPermiso;
		this.isPermisoActualizarDetalleRecap=isPermiso;
		this.isPermisoActualizarOriginalDetalleRecap=isPermiso;
		this.isPermisoEliminarDetalleRecap=isPermiso;
		this.isPermisoGuardarCambiosDetalleRecap=isPermiso;
		this.isPermisoConsultaDetalleRecap=isPermiso;
		this.isPermisoBusquedaDetalleRecap=isPermiso;
		this.isPermisoReporteDetalleRecap=isPermiso;
		this.isPermisoOrdenDetalleRecap=isPermiso;		
		this.isPermisoPaginacionMedioDetalleRecap=isPermiso;		
		this.isPermisoPaginacionAltoDetalleRecap=isPermiso;		
		this.isPermisoPaginacionTodoDetalleRecap=isPermiso;		
		this.isPermisoCopiarDetalleRecap=isPermiso;		
		this.isPermisoVerFormDetalleRecap=isPermiso;		
		this.isPermisoDuplicarDetalleRecap=isPermiso;
		this.isPermisoOrdenDetalleRecap=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioDetalleRecap(Boolean isPermiso) {
		//this.isPermisoTodoDetalleRecap=isPermiso;
		this.isPermisoNuevoDetalleRecap=isPermiso;
		this.isPermisoActualizarDetalleRecap=isPermiso;
		this.isPermisoActualizarOriginalDetalleRecap=isPermiso;
		this.isPermisoEliminarDetalleRecap=isPermiso;
		this.isPermisoGuardarCambiosDetalleRecap=isPermiso;
		//this.isPermisoConsultaDetalleRecap=isPermiso;
		//this.isPermisoBusquedaDetalleRecap=isPermiso;
		//this.isPermisoReporteDetalleRecap=isPermiso;
		//this.isPermisoOrdenDetalleRecap=isPermiso;		
		//this.isPermisoPaginacionMedioDetalleRecap=isPermiso;		
		//this.isPermisoPaginacionAltoDetalleRecap=isPermiso;		
		//this.isPermisoPaginacionTodoDetalleRecap=isPermiso;		
		//this.isPermisoCopiarDetalleRecap=isPermiso;		
		//this.isPermisoDuplicarDetalleRecap=isPermiso;
		//this.isPermisoOrdenDetalleRecap=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioDetalleRecapClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(DetalleRecapJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebDetalleRecap(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioDetalleRecapClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioDetalleRecapClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionDetalleRecapClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioDetalleRecapClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioDetalleRecap() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(DetalleRecapJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.detallerecapSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, DetalleRecapConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoDetalleRecap=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarDetalleRecap=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalDetalleRecap=this.isPermisoActualizarDetalleRecap;
			this.isPermisoEliminarDetalleRecap=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosDetalleRecap=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaDetalleRecap=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaDetalleRecap=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoDetalleRecap=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteDetalleRecap=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenDetalleRecap=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioDetalleRecap=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoDetalleRecap=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoDetalleRecap=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarDetalleRecap=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormDetalleRecap=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarDetalleRecap=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenDetalleRecap=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.detallerecapSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosDetalleRecap.setToolTipText(this.jTableDatosDetalleRecap.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioDetalleRecap(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioDetalleRecap(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(DetalleRecapJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(DetalleRecapJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioDetalleRecap() throws Exception {
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
	public void inicializarCombosForeignKeyDetalleRecapListas()throws Exception {
		try	{						
			
				this.recapsForeignKey=new ArrayList();
				this.empresasForeignKey=new ArrayList();
				this.sucursalsForeignKey=new ArrayList();
				this.ejerciciosForeignKey=new ArrayList();
				this.detalleclientesForeignKey=new ArrayList();
				this.clientesForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyDetalleRecapListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(DetalleRecapJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyDetalleRecapListas(false);
			} else {
			
				this.cargarCombosForeignKeyRecapListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeySucursalListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyEjercicioListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyDetalleClienteListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyClienteListas(cargarCombosDependencia,sFinalQueryCombo);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	

	public void cargarCombosForeignKeyRecapListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.recapsForeignKey==null||this.recapsForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=RecapConstantesFunciones.getArrayColumnasGlobalesRecap(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,RecapConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=RecapConstantesFunciones.SFINALQUERY;

				this.cargarCombosRecapsForeignKeyLista(finalQueryGlobal);
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

	public void cargarCombosForeignKeyDetalleClienteListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.detalleclientesForeignKey==null||this.detalleclientesForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=DetalleClienteConstantesFunciones.getArrayColumnasGlobalesDetalleCliente(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,DetalleClienteConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=DetalleClienteConstantesFunciones.SFINALQUERY;

				this.cargarCombosDetalleClientesForeignKeyLista(finalQueryGlobal);
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
	
	public void cargarCombosLoteForeignKeyDetalleRecapListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			DetalleRecapParameterReturnGeneral detallerecapReturnGeneral=new DetalleRecapParameterReturnGeneral();
						
			


				String finalQueryGlobalRecap="";

				if(((this.recapsForeignKey==null||this.recapsForeignKey.size()<=0) && this.detallerecapConstantesFunciones.cargarid_recapDetalleRecap)
					 || (this.esRecargarFks && this.detallerecapConstantesFunciones.cargarid_recapDetalleRecap)) {

					if(!this.detallerecapSessionBean.getisBusquedaDesdeForeignKeySesionRecap()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=RecapConstantesFunciones.getArrayColumnasGlobalesRecap(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalRecap=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,RecapConstantesFunciones.TABLENAME);

						finalQueryGlobalRecap=Funciones.GetFinalQueryAppend(finalQueryGlobalRecap, "");
						finalQueryGlobalRecap+=RecapConstantesFunciones.SFINALQUERY;

						//this.cargarCombosRecapsForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalRecap=" WHERE " + ConstantesSql.ID + "="+detallerecapSessionBean.getlidRecapActual();
					}
				} else {
					finalQueryGlobalRecap="NONE";
				}


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.detallerecapConstantesFunciones.cargarid_empresaDetalleRecap)
					 || (this.esRecargarFks && this.detallerecapConstantesFunciones.cargarid_empresaDetalleRecap)) {

					if(!this.detallerecapSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+detallerecapSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}


				String finalQueryGlobalSucursal="";

				if(((this.sucursalsForeignKey==null||this.sucursalsForeignKey.size()<=0) && this.detallerecapConstantesFunciones.cargarid_sucursalDetalleRecap)
					 || (this.esRecargarFks && this.detallerecapConstantesFunciones.cargarid_sucursalDetalleRecap)) {

					if(!this.detallerecapSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=SucursalConstantesFunciones.getArrayColumnasGlobalesSucursal(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalSucursal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,SucursalConstantesFunciones.TABLENAME);

						finalQueryGlobalSucursal=Funciones.GetFinalQueryAppend(finalQueryGlobalSucursal, "");
						finalQueryGlobalSucursal+=SucursalConstantesFunciones.SFINALQUERY;

						//this.cargarCombosSucursalsForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalSucursal=" WHERE " + ConstantesSql.ID + "="+detallerecapSessionBean.getlidSucursalActual();
					}
				} else {
					finalQueryGlobalSucursal="NONE";
				}


				String finalQueryGlobalEjercicio="";

				if(((this.ejerciciosForeignKey==null||this.ejerciciosForeignKey.size()<=0) && this.detallerecapConstantesFunciones.cargarid_ejercicioDetalleRecap)
					 || (this.esRecargarFks && this.detallerecapConstantesFunciones.cargarid_ejercicioDetalleRecap)) {

					if(!this.detallerecapSessionBean.getisBusquedaDesdeForeignKeySesionEjercicio()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EjercicioConstantesFunciones.getArrayColumnasGlobalesEjercicio(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEjercicio=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EjercicioConstantesFunciones.TABLENAME);

						finalQueryGlobalEjercicio=Funciones.GetFinalQueryAppend(finalQueryGlobalEjercicio, "");
						finalQueryGlobalEjercicio+=EjercicioConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEjerciciosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEjercicio=" WHERE " + ConstantesSql.ID + "="+detallerecapSessionBean.getlidEjercicioActual();
					}
				} else {
					finalQueryGlobalEjercicio="NONE";
				}


				String finalQueryGlobalDetalleCliente="";

				if(((this.detalleclientesForeignKey==null||this.detalleclientesForeignKey.size()<=0) && this.detallerecapConstantesFunciones.cargarid_detalle_clienteDetalleRecap)
					 || (this.esRecargarFks && this.detallerecapConstantesFunciones.cargarid_detalle_clienteDetalleRecap)) {

					if(!this.detallerecapSessionBean.getisBusquedaDesdeForeignKeySesionDetalleCliente()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=DetalleClienteConstantesFunciones.getArrayColumnasGlobalesDetalleCliente(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalDetalleCliente=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,DetalleClienteConstantesFunciones.TABLENAME);

						finalQueryGlobalDetalleCliente=Funciones.GetFinalQueryAppend(finalQueryGlobalDetalleCliente, "");
						finalQueryGlobalDetalleCliente+=DetalleClienteConstantesFunciones.SFINALQUERY;

						//this.cargarCombosDetalleClientesForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalDetalleCliente=" WHERE " + ConstantesSql.ID + "="+detallerecapSessionBean.getlidDetalleClienteActual();
					}
				} else {
					finalQueryGlobalDetalleCliente="NONE";
				}


				String finalQueryGlobalCliente="";

				if(((this.clientesForeignKey==null||this.clientesForeignKey.size()<=0) && this.detallerecapConstantesFunciones.cargarid_clienteDetalleRecap)
					 || (this.esRecargarFks && this.detallerecapConstantesFunciones.cargarid_clienteDetalleRecap)) {

					if(!this.detallerecapSessionBean.getisBusquedaDesdeForeignKeySesionCliente()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=ClienteConstantesFunciones.getArrayColumnasGlobalesCliente(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalCliente=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,ClienteConstantesFunciones.TABLENAME);

						finalQueryGlobalCliente=Funciones.GetFinalQueryAppend(finalQueryGlobalCliente, "");
						finalQueryGlobalCliente+=ClienteConstantesFunciones.SFINALQUERY;

						//this.cargarCombosClientesForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalCliente=" WHERE " + ConstantesSql.ID + "="+detallerecapSessionBean.getlidClienteActual();
					}
				} else {
					finalQueryGlobalCliente="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				detallerecapReturnGeneral=detallerecapLogic.cargarCombosLoteForeignKeyDetalleRecap(finalQueryGlobalRecap,finalQueryGlobalEmpresa,finalQueryGlobalSucursal,finalQueryGlobalEjercicio,finalQueryGlobalDetalleCliente,finalQueryGlobalCliente);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalRecap.equals("NONE")) {
				this.recapsForeignKey=detallerecapReturnGeneral.getrecapsForeignKey();
			}

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=detallerecapReturnGeneral.getempresasForeignKey();
			}

			if(!finalQueryGlobalSucursal.equals("NONE")) {
				this.sucursalsForeignKey=detallerecapReturnGeneral.getsucursalsForeignKey();
			}

			if(!finalQueryGlobalEjercicio.equals("NONE")) {
				this.ejerciciosForeignKey=detallerecapReturnGeneral.getejerciciosForeignKey();
			}

			if(!finalQueryGlobalDetalleCliente.equals("NONE")) {
				this.detalleclientesForeignKey=detallerecapReturnGeneral.getdetalleclientesForeignKey();
			}

			if(!finalQueryGlobalCliente.equals("NONE")) {
				this.clientesForeignKey=detallerecapReturnGeneral.getclientesForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyDetalleRecap()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyRecap();
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeySucursal();
			this.addItemDefectoCombosForeignKeyEjercicio();
			this.addItemDefectoCombosForeignKeyDetalleCliente();
			this.addItemDefectoCombosForeignKeyCliente();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyRecap()throws Exception {
		try {
			if(this.detallerecapSessionBean==null) {
				this.detallerecapSessionBean=new DetalleRecapSessionBean();
			}

			if(!this.detallerecapSessionBean.getisBusquedaDesdeForeignKeySesionRecap()) {
				Recap recap=new Recap();
				RecapConstantesFunciones.setRecapDescripcion(recap,Constantes.SMENSAJE_ESCOJA_OPCION);
				recap.setId(null);

				if(!RecapConstantesFunciones.ExisteEnLista(this.recapsForeignKey,recap,true)) {

					this.recapsForeignKey.add(0,recap);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {

			if(!this.detallerecapSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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

			if(!this.detallerecapSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
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

			if(!this.detallerecapSessionBean.getisBusquedaDesdeForeignKeySesionEjercicio()) {
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

	public void addItemDefectoCombosForeignKeyDetalleCliente()throws Exception {
		try {

			if(!this.detallerecapSessionBean.getisBusquedaDesdeForeignKeySesionDetalleCliente()) {
				DetalleCliente detallecliente=new DetalleCliente();
				DetalleClienteConstantesFunciones.setDetalleClienteDescripcion(detallecliente,Constantes.SMENSAJE_ESCOJA_OPCION);
				detallecliente.setId(null);

				if(!DetalleClienteConstantesFunciones.ExisteEnLista(this.detalleclientesForeignKey,detallecliente,true)) {

					this.detalleclientesForeignKey.add(0,detallecliente);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyCliente()throws Exception {
		try {

			if(!this.detallerecapSessionBean.getisBusquedaDesdeForeignKeySesionCliente()) {
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
	
	public void initActionsCombosTodosForeignKeyDetalleRecap()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyDetalleRecap(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyDetalleRecap()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
				this.setActualSucursalForeignKey(this.parametroGeneralUsuario.getid_sucursal(),false,"Formulario");
				this.setActualEjercicioForeignKey(this.parametroGeneralUsuario.getid_ejercicio(),false,"Formulario");
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyDetalleRecap();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyDetalleRecap(DetalleRecap detallerecap)throws Exception {	
		try {
			
			this.setActualRecapForeignKey(detallerecap.getid_recap(),false,"Formulario");
			this.setActualDetalleClienteForeignKey(detallerecap.getid_detalle_cliente(),false,"Formulario");
			this.setActualClienteForeignKey(detallerecap.getid_cliente(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyDetalleRecap(DetalleRecap detallerecap,String sTipoEvento)throws Exception {	
		try {
			
			

				if(detallerecap.getCliente()!=null && !sTipoEvento.equals("id_clienteDetalleRecap")) { //sTipoEvento Evita Bucle Infinito

					this.clientesForeignKey=new ArrayList<Cliente>();
					this.clientesForeignKey.add(detallerecap.getCliente());

					this.addItemDefectoCombosForeignKeyCliente();
					this.cargarCombosFrameClientesForeignKey("Todos");
				}
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyDetalleRecap()throws Exception {	
		try {
			
			this.setActualRecapForeignKey(this.detallerecapConstantesFunciones.getid_recap(),false,"Formulario");
			this.setActualDetalleClienteForeignKey(this.detallerecapConstantesFunciones.getid_detalle_cliente(),false,"Formulario");
			this.setActualClienteForeignKey(this.detallerecapConstantesFunciones.getid_cliente(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyDetalleRecap()throws Exception {	
		try {
			

				if(this.jInternalFrameDetalleFormDetalleRecap!=null) {
					Ejercicio ejercicioActual=(Ejercicio)this.jInternalFrameDetalleFormDetalleRecap.jComboBoxid_ejercicioDetalleRecap.getSelectedItem();
				}
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyDetalleRecap()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyDetalleRecap()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroDetalleRecap()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyDetalleRecap()throws Exception {
		try {
			

			this.cargarCombosFrameRecapsForeignKey("Todos");
			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameSucursalsForeignKey("Todos");
			this.cargarCombosFrameEjerciciosForeignKey("Todos");
			this.cargarCombosFrameDetalleClientesForeignKey("Todos");
			this.cargarCombosFrameClientesForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyDetalleRecap(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameRecapsForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameSucursalsForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameEjerciciosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameDetalleClientesForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameClientesForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyDetalleRecap()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormDetalleRecap.jComboBoxid_recapDetalleRecap!=null && this.jInternalFrameDetalleFormDetalleRecap.jComboBoxid_recapDetalleRecap.getItemCount()>0) {
				this.jInternalFrameDetalleFormDetalleRecap.jComboBoxid_recapDetalleRecap.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormDetalleRecap.jComboBoxid_empresaDetalleRecap!=null && this.jInternalFrameDetalleFormDetalleRecap.jComboBoxid_empresaDetalleRecap.getItemCount()>0) {
				this.jInternalFrameDetalleFormDetalleRecap.jComboBoxid_empresaDetalleRecap.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormDetalleRecap.jComboBoxid_sucursalDetalleRecap!=null && this.jInternalFrameDetalleFormDetalleRecap.jComboBoxid_sucursalDetalleRecap.getItemCount()>0) {
				this.jInternalFrameDetalleFormDetalleRecap.jComboBoxid_sucursalDetalleRecap.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormDetalleRecap.jComboBoxid_ejercicioDetalleRecap!=null && this.jInternalFrameDetalleFormDetalleRecap.jComboBoxid_ejercicioDetalleRecap.getItemCount()>0) {
				this.jInternalFrameDetalleFormDetalleRecap.jComboBoxid_ejercicioDetalleRecap.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormDetalleRecap.jComboBoxid_detalle_clienteDetalleRecap!=null && this.jInternalFrameDetalleFormDetalleRecap.jComboBoxid_detalle_clienteDetalleRecap.getItemCount()>0) {
				this.jInternalFrameDetalleFormDetalleRecap.jComboBoxid_detalle_clienteDetalleRecap.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormDetalleRecap.jComboBoxid_clienteDetalleRecap!=null && this.jInternalFrameDetalleFormDetalleRecap.jComboBoxid_clienteDetalleRecap.getItemCount()>0) {
				this.jInternalFrameDetalleFormDetalleRecap.jComboBoxid_clienteDetalleRecap.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	












	
	

	public DetalleRecapBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public DetalleRecapBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public DetalleRecapBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.detallerecapSessionBean=new DetalleRecapSessionBean(); 
		this.detallerecapConstantesFunciones=new DetalleRecapConstantesFunciones(); 
		this.detallerecapBean=new DetalleRecap();//(this.detallerecapConstantesFunciones); 		
		this.detallerecapReturnGeneral=new DetalleRecapParameterReturnGeneral(); 
		
		this.detallerecapSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.detallerecapSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public DetalleRecapBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public DetalleRecapBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public DetalleRecapBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessDetalleRecap(true);
			
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
			
			this.detallerecapConstantesFunciones=new DetalleRecapConstantesFunciones(); 
			this.detallerecapBean=new DetalleRecap();//this.detallerecapConstantesFunciones); 			
			this.detallerecapReturnGeneral=new DetalleRecapParameterReturnGeneral(); 
		
			DetalleRecapBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Detalle Recap Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			this.conTotales=true;
			
			
			this.detallerecap=new DetalleRecap();
			this.detallerecaps = new ArrayList<DetalleRecap>();
			this.detallerecapsAux = new ArrayList<DetalleRecap>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallerecapLogic=new DetalleRecapLogic();
				this.detallerecapLogic.getNewConnexionToDeep("");
			}
			
			//this.detallerecapSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.detallerecapSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormDetalleRecap);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoDetalleRecap!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoDetalleRecap);	
					}
					
					if(this.jInternalFrameImportacionDetalleRecap!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionDetalleRecap);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByDetalleRecap!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByDetalleRecap);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormDetalleRecap!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormDetalleRecap);
				this.jInternalFrameDetalleFormDetalleRecap.setVisible(false);
				this.jInternalFrameDetalleFormDetalleRecap.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoDetalleRecap!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoDetalleRecap);
					this.jInternalFrameReporteDinamicoDetalleRecap.setVisible(false);
					this.jInternalFrameReporteDinamicoDetalleRecap.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionDetalleRecap!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionDetalleRecap);
					this.jInternalFrameImportacionDetalleRecap.setVisible(false);
					this.jInternalFrameImportacionDetalleRecap.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByDetalleRecap!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByDetalleRecap);
					this.jInternalFrameOrderByDetalleRecap.setVisible(false);
					this.jInternalFrameOrderByDetalleRecap.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idDetalleRecapActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=DetalleRecapConstantesFunciones.INUMEROPAGINACION;
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
			
			this.detallerecapReturnGeneral=new DetalleRecapParameterReturnGeneral();
			
			this.detallerecapParameterGeneral=new DetalleRecapParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.detallerecapLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.detallerecapSessionBean.getEsGuardarRelacionado()) {
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
			
			if(DetalleRecapJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.detallerecapSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,DetalleRecapConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.detallerecapSessionBean.getEsGuardarRelacionado(),this.detallerecapSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,DetalleRecapConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.detallerecapSessionBean.getEsGuardarRelacionado(),this.detallerecapSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoDetalleRecap=false;
			this.isVisibilidadCeldaDuplicarDetalleRecap=true;
			this.isVisibilidadCeldaCopiarDetalleRecap=true;
			this.isVisibilidadCeldaVerFormDetalleRecap=true;
			this.isVisibilidadCeldaOrdenDetalleRecap=true;
			this.isVisibilidadCeldaNuevoRelacionesDetalleRecap=false;
			this.isVisibilidadCeldaModificarDetalleRecap=false;
			this.isVisibilidadCeldaActualizarDetalleRecap=false;
			this.isVisibilidadCeldaEliminarDetalleRecap=false;
			this.isVisibilidadCeldaCancelarDetalleRecap=false;
			this.isVisibilidadCeldaGuardarDetalleRecap=false;
			this.isVisibilidadCeldaGuardarCambiosDetalleRecap=false;
			
			
			this.isVisibilidadFK_IdCliente=true;
			this.isVisibilidadFK_IdDetalleCliente=true;
			this.isVisibilidadFK_IdEjercicio=true;
			this.isVisibilidadFK_IdEmpresa=true;
			this.isVisibilidadFK_IdRecap=true;
			this.isVisibilidadFK_IdSucursal=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesDetalleRecap("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosDetalleRecap();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioDetalleRecap(false);
			
			this.setPermisosUsuarioDetalleRecap();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.detallerecapSessionBean.getEsGuardarRelacionado() 
				|| (this.detallerecapSessionBean.getEsGuardarRelacionado() && this.detallerecapSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioDetalleRecapClasesRelacionadas();
			}
			
			if(this.detallerecapSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioDetalleRecapClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!DetalleRecapJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosDetalleRecap();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualDetalleRecap();
			}
			
			if(!this.isPermisoBusquedaDetalleRecap) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasDetalleRecap.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.detallerecapSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(true);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(true);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioDetalleRecap,this.isPermisoPaginacionMedioDetalleRecap,this.isPermisoPaginacionTodoDetalleRecap);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(DetalleRecapConstantesFunciones.getTiposSeleccionarDetalleRecap());
				
				this.tiposColumnasSelect=DetalleRecapConstantesFunciones.getTiposSeleccionarDetalleRecap(true);
				
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
			//if(!this.detallerecapSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioDetalleRecap();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(true,false,true);
				this.setAccionesUsuarioDetalleRecap(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(true,false,true);							
				this.setAccionesUsuarioDetalleRecap(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesDetalleRecap() ;
			
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
			
			this.recapLogic=new RecapLogic();
			this.empresaLogic=new EmpresaLogic();
			this.sucursalLogic=new SucursalLogic();
			this.ejercicioLogic=new EjercicioLogic();
			this.detalleclienteLogic=new DetalleClienteLogic();
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
				detallerecapImplementable= (DetalleRecapImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+DetalleRecapConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				detallerecapImplementableHome= (DetalleRecapImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+DetalleRecapConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.detallerecaps= new ArrayList<DetalleRecap>();
			this.detallerecapsEliminados= new ArrayList<DetalleRecap>();
						
			this.isEsNuevoDetalleRecap=false;
			this.esParaAccionDesdeFormularioDetalleRecap=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			//BUSQUEDA INTERNA FK
			this.idClienteActual=0L;
			
			//INICIALIZAR LISTAS FK
			
			this.recapsForeignKey=new ArrayList<Recap>() ;
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			this.sucursalsForeignKey=new ArrayList<Sucursal>() ;
			this.ejerciciosForeignKey=new ArrayList<Ejercicio>() ;
			this.detalleclientesForeignKey=new ArrayList<DetalleCliente>() ;
			this.clientesForeignKey=new ArrayList<Cliente>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyDetalleRecap(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroDetalleRecap();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.detallerecapSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			DetalleRecapBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=DetalleRecapConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesDetalleRecap("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingDetalleRecap(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormDetalleRecap!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioDetalleRecap();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioDetalleRecap();
			}
			
			DetalleRecapBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasDetalleRecap.getTabCount(); i++) {
					this.jTabbedPaneBusquedasDetalleRecap.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasDetalleRecap.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallerecapLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessDetalleRecap(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga DetalleRecap: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallerecapLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,DetalleRecapConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallerecapLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectDetalleRecap() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesDetalleRecap")) {
				iIndex=this.jInternalFrameDetalleFormDetalleRecap.jTabbedPaneRelacionesDetalleRecap.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormDetalleRecap.jTabbedPaneRelacionesDetalleRecap.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosDetalleRecap.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessDetalleRecap();	
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
	
	public void cargarCombosForeignKeyDetalleRecap(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyDetalleRecap(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyDetalleRecap(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyDetalleRecapListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyDetalleRecap();
		
		this.cargarCombosFrameForeignKeyDetalleRecap();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyDetalleRecap();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyDetalleRecap();
		}
	}
	
	

	public void cargarCombosForeignKeyRecap(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyRecapListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyRecap();
				this.cargarCombosFrameRecapsForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaRecap(this.recapsForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyDetalleCliente(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyDetalleClienteListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyDetalleCliente();
				this.cargarCombosFrameDetalleClientesForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaDetalleCliente(this.detalleclientesForeignKey);

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
	
	public void jButtonNuevoDetalleRecapActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.detallerecapSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormDetalleRecap==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			DetalleRecapBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.detallerecap,new Object(),this.detallerecapParameterGeneral,this.detallerecapReturnGeneral);
			
			
			if(jTableDatosDetalleRecap.getRowCount()>=1) {
				jTableDatosDetalleRecap.removeRowSelectionInterval(0, jTableDatosDetalleRecap.getRowCount()-1);						
			}
			
			this.isEsNuevoDetalleRecap=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoDetalleRecap(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesDetalleRecap(true);			
			//this.detallerecap=new DetalleRecap();
			//this.detallerecap.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesDetalleRecap(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualDetalleRecap() ;
			
			if(DetalleRecapJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleDetalleRecap(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.detallerecap);	
			this.actualizarInformacion("INFO_PADRE",false,this.detallerecap);				
			
			DetalleRecapBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.detallerecap,new Object(),this.detallerecapParameterGeneral,this.detallerecapReturnGeneral);
			
			if(this.detallerecapSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar DetalleRecap: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			DetalleRecapBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.detallerecap,new Object(),this.detallerecapParameterGeneral,this.detallerecapReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,DetalleRecapConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarDetalleRecapActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<DetalleRecap> detallerecapsSeleccionados=new ArrayList<DetalleRecap>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosDetalleRecap.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosDetalleRecap.getSelectedRows().length;			
			}
			
			detallerecapsSeleccionados=this.getDetalleRecapsSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoDetalleRecap--;			
				//DetalleRecap detallerecapAux= new DetalleRecap();			
				//detallerecapAux.setId(this.iIdNuevoDetalleRecap);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//DetalleRecap detallerecapOrigen=new DetalleRecap();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(DetalleRecap detallerecapOrigen : detallerecapsSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosDetalleRecap.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							detallerecapOrigen =(DetalleRecap) this.detallerecapLogic.getDetalleRecaps().toArray()[this.jTableDatosDetalleRecap.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							detallerecapOrigen =(DetalleRecap) this.detallerecaps.toArray()[this.jTableDatosDetalleRecap.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaDetalleRecap();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.detallerecap.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosDetalleRecap(detallerecapOrigen,this.detallerecap,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleRecap(this.detallerecap);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.detallerecapLogic.getDetalleRecaps().add(this.detallerecapAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.detallerecaps.add(this.detallerecapAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaDetalleRecap(false);
				
				this.jTableDatosDetalleRecap.setRowSelectionInterval(this.getIndiceNuevoDetalleRecap(), this.getIndiceNuevoDetalleRecap());
				
				int iLastRow =  this.jTableDatosDetalleRecap.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosDetalleRecap.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosDetalleRecap.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaDetalleRecap(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,DetalleRecapConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarDetalleRecapActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<DetalleRecap> detallerecapsSeleccionados=new ArrayList<DetalleRecap>();									
		
			DetalleRecap detallerecapOrigen=new DetalleRecap();
			DetalleRecap detallerecapDestino=new DetalleRecap();
				
			detallerecapsSeleccionados=this.getDetalleRecapsSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosDetalleRecap.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || detallerecapsSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosDetalleRecap.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						detallerecapOrigen =(DetalleRecap) this.detallerecapLogic.getDetalleRecaps().toArray()[this.jTableDatosDetalleRecap.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						detallerecapOrigen =(DetalleRecap) this.detallerecaps.toArray()[this.jTableDatosDetalleRecap.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						detallerecapDestino =(DetalleRecap) this.detallerecapLogic.getDetalleRecaps().toArray()[this.jTableDatosDetalleRecap.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						detallerecapDestino =(DetalleRecap) this.detallerecaps.toArray()[this.jTableDatosDetalleRecap.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				detallerecapOrigen =detallerecapsSeleccionados.get(0);
				detallerecapDestino =detallerecapsSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosDetalleRecap(detallerecapOrigen,detallerecapDestino,true,false);
				
				detallerecapDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(detallerecapDestino,detallerecapLogic.getDetalleRecaps());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(detallerecapDestino,detallerecaps);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaDetalleRecap(false);
				
				//this.jTableDatosDetalleRecap.setRowSelectionInterval(this.getIndiceNuevoDetalleRecap(), this.getIndiceNuevoDetalleRecap());
				
				int iLastRow =  this.jTableDatosDetalleRecap.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosDetalleRecap.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosDetalleRecap.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaDetalleRecap(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleRecapConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormDetalleRecapActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormDetalleRecap==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormDetalleRecap.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleRecapConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarDetalleRecapActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesDetalleRecap.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasDetalleRecap.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesDetalleRecap.setVisible(!isVisible);
			this.jPanelPaginacionDetalleRecap.setVisible(!isVisible);
			this.jPanelAccionesDetalleRecap.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleRecapConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarDetalleRecapActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameDetalleRecap();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleRecapConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoDetalleRecapActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoDetalleRecap();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleRecapConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionDetalleRecapActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionDetalleRecap();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleRecapConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByDetalleRecapActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByDetalleRecap();
			
			this.abrirFrameOrderByDetalleRecap();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleRecapConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByDetalleRecapActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByDetalleRecap();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleRecapConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleDetalleRecap(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormDetalleRecap);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormDetalleRecap.isMaximum()) {
					this.jInternalFrameDetalleFormDetalleRecap.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormDetalleRecap.setSize(this.jInternalFrameDetalleFormDetalleRecap.iWidthFormulario,this.jInternalFrameDetalleFormDetalleRecap.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormDetalleRecap.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormDetalleRecap.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormDetalleRecap.isMaximum()) {
						this.jInternalFrameDetalleFormDetalleRecap.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormDetalleRecap.jContentPaneDetalleDetalleRecap.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormDetalleRecap.jTabbedPaneRelacionesDetalleRecap.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormDetalleRecap.jContentPaneDetalleDetalleRecap.getWidth(),DetalleRecapConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormDetalleRecap.jTabbedPaneRelacionesDetalleRecap.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormDetalleRecap.jContentPaneDetalleDetalleRecap.getWidth(),DetalleRecapConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormDetalleRecap.jTabbedPaneRelacionesDetalleRecap.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormDetalleRecap.jContentPaneDetalleDetalleRecap.getWidth(),DetalleRecapConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormDetalleRecap.setVisible(true);
	        this.jInternalFrameDetalleFormDetalleRecap.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DetalleRecapConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByDetalleRecap() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByDetalleRecap==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByDetalleRecap=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByDetalleRecap,false,this);
				} else {
					this.jInternalFrameOrderByDetalleRecap=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByDetalleRecap,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByDetalleRecap);
				this.jInternalFrameOrderByDetalleRecap.setVisible(false);
				this.jInternalFrameOrderByDetalleRecap.setSelected(false);
				
				this.jInternalFrameOrderByDetalleRecap.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByDetalleRecap"));
				
				this.inicializarActualizarBindingTablaOrderByDetalleRecap();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionDetalleRecap() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionDetalleRecap==null) {
				
				this.jInternalFrameImportacionDetalleRecap=new ImportacionJInternalFrame(DetalleRecapConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionDetalleRecap);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionDetalleRecap);
				this.jInternalFrameImportacionDetalleRecap.setVisible(false);
				this.jInternalFrameImportacionDetalleRecap.setSelected(false);


				this.jInternalFrameImportacionDetalleRecap.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionDetalleRecap"));
				this.jInternalFrameImportacionDetalleRecap.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionDetalleRecap"));
				this.jInternalFrameImportacionDetalleRecap.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionDetalleRecap"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoDetalleRecap() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoDetalleRecap==null) {
				this.jInternalFrameReporteDinamicoDetalleRecap=new ReporteDinamicoJInternalFrame(DetalleRecapConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoDetalleRecap);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoDetalleRecap);
				this.jInternalFrameReporteDinamicoDetalleRecap.setVisible(false);
				this.jInternalFrameReporteDinamicoDetalleRecap.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoDetalleRecap.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoDetalleRecap"));
				this.jInternalFrameReporteDinamicoDetalleRecap.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoDetalleRecap"));
				this.jInternalFrameReporteDinamicoDetalleRecap.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoDetalleRecap"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualDetalleRecap();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleDetalleRecap() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormDetalleRecap);
			
	       	this.jInternalFrameDetalleFormDetalleRecap.setVisible(false);
	        this.jInternalFrameDetalleFormDetalleRecap.setSelected(false);
			
			//this.jInternalFrameDetalleFormDetalleRecap.dispose();
			//this.jInternalFrameDetalleFormDetalleRecap=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DetalleRecapConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoDetalleRecap() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoDetalleRecap.setVisible(true);
	        this.jInternalFrameReporteDinamicoDetalleRecap.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DetalleRecapConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionDetalleRecap() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionDetalleRecap.setVisible(true);
	        this.jInternalFrameImportacionDetalleRecap.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DetalleRecapConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByDetalleRecap() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByDetalleRecap.setVisible(true);
	        this.jInternalFrameOrderByDetalleRecap.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DetalleRecapConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByDetalleRecap() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByDetalleRecap.setVisible(false);
	        this.jInternalFrameOrderByDetalleRecap.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DetalleRecapConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoDetalleRecap() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoDetalleRecap.setVisible(false);
	        this.jInternalFrameReporteDinamicoDetalleRecap.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DetalleRecapConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionDetalleRecap() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionDetalleRecap.setVisible(false);
	        this.jInternalFrameImportacionDetalleRecap.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DetalleRecapConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarDetalleRecapActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarDetalleRecap(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleRecapConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarDetalleRecap(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosDetalleRecap.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesDetalleRecap(true);
			//this.isEsNuevoDetalleRecap=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallerecap =(DetalleRecap) this.detallerecapLogic.getDetalleRecaps().toArray()[this.jTableDatosDetalleRecap.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.detallerecap =(DetalleRecap) this.detallerecaps.toArray()[this.jTableDatosDetalleRecap.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesDetalleRecap("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesDetalleRecap(false) ;
			
			if(detallerecapSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(DetalleRecapJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleDetalleRecap(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualDetalleRecap(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleRecapConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaDetalleRecapActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosDetalleRecap.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallerecap =(DetalleRecap) this.detallerecapLogic.getDetalleRecaps().toArray()[this.jTableDatosDetalleRecap.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.detallerecap =(DetalleRecap) this.detallerecaps.toArray()[this.jTableDatosDetalleRecap.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleRecapConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarDetalleRecap(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormDetalleRecap==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosDetalleRecap.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesDetalleRecap(true);
			//this.isEsNuevoDetalleRecap=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallerecap =(DetalleRecap) this.detallerecapLogic.getDetalleRecaps().toArray()[this.jTableDatosDetalleRecap.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.detallerecap =(DetalleRecap) this.detallerecaps.toArray()[this.jTableDatosDetalleRecap.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.detallerecap.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesDetalleRecap("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesDetalleRecap(false) ;
			
			if(DetalleRecapJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleDetalleRecap(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualDetalleRecap(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleRecapConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
			
			if(sType.equals("Cliente")) {
				if(!this.detallerecapConstantesFunciones.cargarid_clienteDetalleRecap) {
					this.cargarCombosClientesForeignKeyLista(" where id="+id);
					//this.inicializarActualizarBindingDetalleRecap(false,false);
					this.cargarCombosFrameClientesForeignKey("Todos");
				}

				this.setCombosCodigoDesdeBusquedaid_cliente (id);

				this.recargarComboTablaCliente(this.clientesForeignKey);

			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	public void recargarComboTablaRecap(List<Recap> recapsForeignKey)throws Exception{
		TableColumn tableColumnRecap=this.jTableDatosDetalleRecap.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetalleRecap,DetalleRecapConstantesFunciones.LABEL_IDRECAP));
		TableCellEditor tableCellEditorRecap =tableColumnRecap.getCellEditor();

		RecapTableCell recapTableCellFk=(RecapTableCell)tableCellEditorRecap;

		if(recapTableCellFk!=null) {
			recapTableCellFk.setrecapsForeignKey(recapsForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosDetalleRecap.getSelectedRow();

		//if(intSelectedRow<=0) {
			//recapTableCellFk.setRowActual(intSelectedRow);
			//recapTableCellFk.setrecapsForeignKeyActual(recapsForeignKey);
		//}


		if(recapTableCellFk!=null) {
			recapTableCellFk.RecargarRecapsForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
				
	
	public void recargarComboTablaDetalleCliente(List<DetalleCliente> detalleclientesForeignKey)throws Exception{
		TableColumn tableColumnDetalleCliente=this.jTableDatosDetalleRecap.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetalleRecap,DetalleRecapConstantesFunciones.LABEL_IDDETALLECLIENTE));
		TableCellEditor tableCellEditorDetalleCliente =tableColumnDetalleCliente.getCellEditor();

		DetalleClienteTableCell detalleclienteTableCellFk=(DetalleClienteTableCell)tableCellEditorDetalleCliente;

		if(detalleclienteTableCellFk!=null) {
			detalleclienteTableCellFk.setdetalleclientesForeignKey(detalleclientesForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosDetalleRecap.getSelectedRow();

		//if(intSelectedRow<=0) {
			//detalleclienteTableCellFk.setRowActual(intSelectedRow);
			//detalleclienteTableCellFk.setdetalleclientesForeignKeyActual(detalleclientesForeignKey);
		//}


		if(detalleclienteTableCellFk!=null) {
			detalleclienteTableCellFk.RecargarDetalleClientesForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaCliente(List<Cliente> clientesForeignKey)throws Exception{
		TableColumn tableColumnCliente=this.jTableDatosDetalleRecap.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetalleRecap,DetalleRecapConstantesFunciones.LABEL_IDCLIENTE));
		TableCellEditor tableCellEditorCliente =tableColumnCliente.getCellEditor();

		ClienteTableCell clienteTableCellFk=(ClienteTableCell)tableCellEditorCliente;

		if(clienteTableCellFk!=null) {
			clienteTableCellFk.setclientesForeignKey(clientesForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosDetalleRecap.getSelectedRow();

		//if(intSelectedRow<=0) {
			//clienteTableCellFk.setRowActual(intSelectedRow);
			//clienteTableCellFk.setclientesForeignKeyActual(clientesForeignKey);
		//}


		if(clienteTableCellFk!=null) {
			clienteTableCellFk.RecargarClientesForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	

	public void setCombosCodigoDesdeBusquedaid_cliente (Long id) throws Exception {
		this.setActualClienteForeignKey(id,true,"Todos");

	};
	
	public void jButtonActualizarDetalleRecapActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallerecapLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesDetalleRecap(false);
			
			//if(!this.isEsNuevoDetalleRecap) {								
				int intSelectedRow = this.jTableDatosDetalleRecap.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallerecap =(DetalleRecap) this.detallerecapLogic.getDetalleRecaps().toArray()[this.jTableDatosDetalleRecap.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.detallerecap =(DetalleRecap) this.detallerecaps.toArray()[this.jTableDatosDetalleRecap.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(DetalleRecapJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualDetalleRecap(this.detallerecap,true);
				this.setVariablesFormularioToObjetoActualForeignKeysDetalleRecap(this.detallerecap);
				
			}
			
			if(this.permiteMantenimiento(this.detallerecap)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.detallerecapSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoDetalleRecap=true;
					this.inicializarActualizarBindingTablaDetalleRecap(false);
					this.isEsNuevoDetalleRecap=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoDetalleRecap=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoDetalleRecap=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesDetalleRecap(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualDetalleRecap(false);
				
				this.habilitarDeshabilitarControlesDetalleRecap(false);
			
												
				
				if(DetalleRecapJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleDetalleRecap();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoDetalleRecapActionPerformed(evt,detallerecapSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualDetalleRecap(this.detallerecap,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosDetalleRecap.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,detallerecapSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallerecapLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.detallerecap.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(DetalleRecap.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DetalleRecap.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallerecapLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,DetalleRecapConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallerecapLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarDetalleRecapActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallerecapLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosDetalleRecap.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallerecap =(DetalleRecap) this.detallerecapLogic.getDetalleRecaps().toArray()[this.jTableDatosDetalleRecap.convertRowIndexToModel(intSelectedRow)];
				this.detallerecap.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.detallerecap =(DetalleRecap) this.detallerecaps.toArray()[this.jTableDatosDetalleRecap.convertRowIndexToModel(intSelectedRow)];
				this.detallerecap.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.detallerecap)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.detallerecapSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((DetalleRecapModel) this.jTableDatosDetalleRecap.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoDetalleRecap=true;
				this.inicializarActualizarBindingTablaDetalleRecap(false);
				this.isEsNuevoDetalleRecap=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesDetalleRecap(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualDetalleRecap(false);
				
				this.habilitarDeshabilitarControlesDetalleRecap(false);
				
				
				
				if(DetalleRecapJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleDetalleRecap();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallerecapLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallerecapLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DetalleRecapConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallerecapLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarDetalleRecapActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosDetalleRecap.getRowCount()>=1) {
				jTableDatosDetalleRecap.removeRowSelectionInterval(0, jTableDatosDetalleRecap.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesDetalleRecap(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaDetalleRecap(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesDetalleRecap(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualDetalleRecap(false) ;
			
			this.isEsNuevoDetalleRecap=false;
			
			if(DetalleRecapJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleDetalleRecap();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleRecapConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosDetalleRecapActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallerecapLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingDetalleRecap(false);
				
				//SI ES MANUAL
				if(DetalleRecapJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualDetalleRecap();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallerecapLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallerecapLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DetalleRecapConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallerecapLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosDetalleRecapActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoDetalleRecap--;			
			//DetalleRecap detallerecapAux= new DetalleRecap();			
			//detallerecapAux.setId(this.iIdNuevoDetalleRecap);
			
			if(this.jInternalFrameDetalleFormDetalleRecap==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaDetalleRecap();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysDetalleRecap(this.detallerecap);
			
			this.detallerecap.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.detallerecapLogic.getDetalleRecaps().add(this.detallerecapAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.detallerecaps.add(this.detallerecapAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaDetalleRecap(false);
			
			this.jTableDatosDetalleRecap.setRowSelectionInterval(this.getIndiceNuevoDetalleRecap(), this.getIndiceNuevoDetalleRecap());
			
			int iLastRow =  this.jTableDatosDetalleRecap.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosDetalleRecap.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosDetalleRecap.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaDetalleRecap(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,DetalleRecapConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionDetalleRecapActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallerecapLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingDetalleRecap(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingDetalleRecap(false);
			
			//SI ES MANUAL
			if(DetalleRecapJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualDetalleRecap();
			}
			
			//this.abrirFrameTreeDetalleRecap();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallerecapLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallerecapLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,DetalleRecapConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallerecapLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionDetalleRecapActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Detalle RecapES ?", "MANTENIMIENTO DE Detalle Recap", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionDetalleRecap.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralDetalleRecap();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.detallerecapReturnGeneral=detallerecapLogic.procesarImportacionDetalleRecapsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.detallerecapParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarDetalleRecapReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleRecapConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionDetalleRecapActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionDetalleRecap.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionDetalleRecap.setFileImportacion(this.jInternalFrameImportacionDetalleRecap.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionDetalleRecap.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionDetalleRecap.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionDetalleRecap.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionDetalleRecap.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleRecapConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoDetalleRecapActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<DetalleRecap> detallerecapsSeleccionados=new ArrayList<DetalleRecap>();		

		detallerecapsSeleccionados=this.getDetalleRecapsSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoDetalleRecap.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoDetalleRecap.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("DetalleRecapBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"DetalleRecapBaseDesign.jrxml";
			
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
			
			this.generarReporteDetalleRecaps("Todos",detallerecapsSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.detallerecapSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Detalle Recap",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleRecapConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoDetalleRecap.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoDetalleRecap.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case DetalleRecapConstantesFunciones.LABEL_IDRECAP:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Recap_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Recap_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Recap_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Recap_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DetalleRecapConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DetalleRecapConstantesFunciones.LABEL_IDSUCURSAL:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Sucursal_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Sucursal_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Sucursal_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Sucursal_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DetalleRecapConstantesFunciones.LABEL_IDEJERCICIO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Ejercicio_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Ejercicio_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Ejercicio_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Ejercicio_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DetalleRecapConstantesFunciones.LABEL_IDDETALLECLIENTE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_DetalleCliente_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_DetalleCliente_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_DetalleCliente_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_DetalleCliente_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DetalleRecapConstantesFunciones.LABEL_IDCLIENTE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Cliente_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Cliente_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Cliente_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Cliente_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DetalleRecapConstantesFunciones.LABEL_VALOR:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_lor_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_lor_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_lor_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_lor_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DetalleRecapConstantesFunciones.LABEL_IVAPORCENTAJE:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_aPorcentaje_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_aPorcentaje_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_aPorcentaje_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_aPorcentaje_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DetalleRecapConstantesFunciones.LABEL_TOTAL:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_tal_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_tal_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_tal_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_tal_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoDetalleRecap.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoDetalleRecap.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoDetalleRecap.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case DetalleRecapConstantesFunciones.LABEL_IDRECAP:
					sNombreCampoCategoria="id_recap";
					break;

				case DetalleRecapConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case DetalleRecapConstantesFunciones.LABEL_IDSUCURSAL:
					sNombreCampoCategoria="id_sucursal";
					break;

				case DetalleRecapConstantesFunciones.LABEL_IDEJERCICIO:
					sNombreCampoCategoria="id_ejercicio";
					break;

				case DetalleRecapConstantesFunciones.LABEL_IDDETALLECLIENTE:
					sNombreCampoCategoria="id_detalle_cliente";
					break;

				case DetalleRecapConstantesFunciones.LABEL_IDCLIENTE:
					sNombreCampoCategoria="id_cliente";
					break;

				case DetalleRecapConstantesFunciones.LABEL_VALOR:
					sNombreCampoCategoria="valor";
					break;

				case DetalleRecapConstantesFunciones.LABEL_IVAPORCENTAJE:
					sNombreCampoCategoria="iva_porcentaje";
					break;

				case DetalleRecapConstantesFunciones.LABEL_TOTAL:
					sNombreCampoCategoria="total";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoDetalleRecap.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case DetalleRecapConstantesFunciones.LABEL_IDRECAP:
					sNombreCampoCategoriaValor="id_recap";
					break;

				case DetalleRecapConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case DetalleRecapConstantesFunciones.LABEL_IDSUCURSAL:
					sNombreCampoCategoriaValor="id_sucursal";
					break;

				case DetalleRecapConstantesFunciones.LABEL_IDEJERCICIO:
					sNombreCampoCategoriaValor="id_ejercicio";
					break;

				case DetalleRecapConstantesFunciones.LABEL_IDDETALLECLIENTE:
					sNombreCampoCategoriaValor="id_detalle_cliente";
					break;

				case DetalleRecapConstantesFunciones.LABEL_IDCLIENTE:
					sNombreCampoCategoriaValor="id_cliente";
					break;

				case DetalleRecapConstantesFunciones.LABEL_VALOR:
					sNombreCampoCategoriaValor="valor";
					break;

				case DetalleRecapConstantesFunciones.LABEL_IVAPORCENTAJE:
					sNombreCampoCategoriaValor="iva_porcentaje";
					break;

				case DetalleRecapConstantesFunciones.LABEL_TOTAL:
					sNombreCampoCategoriaValor="total";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoDetalleRecap.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoDetalleRecap.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case DetalleRecapConstantesFunciones.LABEL_IDRECAP:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Recap",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_recap");
					break;

				case DetalleRecapConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case DetalleRecapConstantesFunciones.LABEL_IDSUCURSAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Sucursal",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_sucursal");
					break;

				case DetalleRecapConstantesFunciones.LABEL_IDEJERCICIO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Ejercicio",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_ejercicio");
					break;

				case DetalleRecapConstantesFunciones.LABEL_IDDETALLECLIENTE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Detalle Cliente",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_detalle_cliente");
					break;

				case DetalleRecapConstantesFunciones.LABEL_IDCLIENTE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Cliente",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_cliente");
					break;

				case DetalleRecapConstantesFunciones.LABEL_VALOR:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Valor",sNombreCampoCategoria,sNombreCampoCategoriaValor,"valor");
					break;

				case DetalleRecapConstantesFunciones.LABEL_IVAPORCENTAJE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Iva Porcentaje",sNombreCampoCategoria,sNombreCampoCategoriaValor,"iva_porcentaje");
					break;

				case DetalleRecapConstantesFunciones.LABEL_TOTAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Total",sNombreCampoCategoria,sNombreCampoCategoriaValor,"total");
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
	
	public void jButtonGenerarExcelReporteDinamicoDetalleRecapActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<DetalleRecap> detallerecapsSeleccionados=new ArrayList<DetalleRecap>();		
		
		detallerecapsSeleccionados=this.getDetalleRecapsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"detallerecap";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("DetalleRecaps");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoDetalleRecap.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoDetalleRecap.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case DetalleRecapConstantesFunciones.LABEL_IDRECAP:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DetalleRecapConstantesFunciones.LABEL_IDRECAP);
					iRow++;

					for(DetalleRecap detallerecap:detallerecapsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(detallerecap.getrecap_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DetalleRecapConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DetalleRecapConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(DetalleRecap detallerecap:detallerecapsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(detallerecap.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DetalleRecapConstantesFunciones.LABEL_IDSUCURSAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DetalleRecapConstantesFunciones.LABEL_IDSUCURSAL);
					iRow++;

					for(DetalleRecap detallerecap:detallerecapsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(detallerecap.getsucursal_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DetalleRecapConstantesFunciones.LABEL_IDEJERCICIO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DetalleRecapConstantesFunciones.LABEL_IDEJERCICIO);
					iRow++;

					for(DetalleRecap detallerecap:detallerecapsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(detallerecap.getejercicio_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DetalleRecapConstantesFunciones.LABEL_IDDETALLECLIENTE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DetalleRecapConstantesFunciones.LABEL_IDDETALLECLIENTE);
					iRow++;

					for(DetalleRecap detallerecap:detallerecapsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(detallerecap.getdetallecliente_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DetalleRecapConstantesFunciones.LABEL_IDCLIENTE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DetalleRecapConstantesFunciones.LABEL_IDCLIENTE);
					iRow++;

					for(DetalleRecap detallerecap:detallerecapsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(detallerecap.getcliente_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DetalleRecapConstantesFunciones.LABEL_VALOR:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DetalleRecapConstantesFunciones.LABEL_VALOR);
					iRow++;

					for(DetalleRecap detallerecap:detallerecapsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(detallerecap.getvalor());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DetalleRecapConstantesFunciones.LABEL_IVAPORCENTAJE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DetalleRecapConstantesFunciones.LABEL_IVAPORCENTAJE);
					iRow++;

					for(DetalleRecap detallerecap:detallerecapsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(detallerecap.getiva_porcentaje());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DetalleRecapConstantesFunciones.LABEL_TOTAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DetalleRecapConstantesFunciones.LABEL_TOTAL);
					iRow++;

					for(DetalleRecap detallerecap:detallerecapsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(detallerecap.gettotal());
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
			//	this.getFilaCabeceraExportarExcelDetalleRecap(row);				
			//	iRow++;
			//}				
			
			//for(DetalleRecap detallerecapAux:detallerecapsSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelDetalleRecap(detallerecapAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.detallerecapSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Detalle Recap",JOptionPane.INFORMATION_MESSAGE);
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
				this.detallerecapLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingDetalleRecap(false);
			
			//SI ES MANUAL
			if(DetalleRecapJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualDetalleRecap();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallerecapLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallerecapLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallerecapLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresDetalleRecapActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallerecapLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingDetalleRecap(false);
			
			//SI ES MANUAL
			if(DetalleRecapJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualDetalleRecap();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallerecapLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallerecapLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,DetalleRecapConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallerecapLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesDetalleRecapActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallerecapLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingDetalleRecap(false);
			
			//SI ES MANUAL
			if(DetalleRecapJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualDetalleRecap();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallerecapLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallerecapLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,DetalleRecapConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallerecapLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaDetalleRecap() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosDetalleRecap.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosDetalleRecap.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosDetalleRecap.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosDetalleRecap.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosDetalleRecap.setMinimumSize(dimensionMinimum);
		this.jTableDatosDetalleRecap.setMaximumSize(dimensionMaximum);
		this.jTableDatosDetalleRecap.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingDetalleRecap(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingDetalleRecap(esInicializar,true);
	}
	
	public void inicializarActualizarBindingDetalleRecap(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaDetalleRecap(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesDetalleRecap(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.detallerecapSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasDetalleRecap(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesDetalleRecap(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesDetalleRecap(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !DetalleRecapJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!DetalleRecapJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualDetalleRecap() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaDetalleRecap();
		
		this.inicializarActualizarBindingBotonesManualDetalleRecap(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.detallerecapSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualDetalleRecap();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesDetalleRecap() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualDetalleRecap(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualDetalleRecap(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosDetalleRecap.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosDetalleRecap.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteDetalleRecap.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormDetalleRecap!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormDetalleRecap.jCheckBoxPostAccionNuevoDetalleRecap.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormDetalleRecap.jCheckBoxPostAccionSinCerrarDetalleRecap.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormDetalleRecap.jCheckBoxPostAccionSinMensajeDetalleRecap.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosDetalleRecap.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosDetalleRecap.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteDetalleRecap.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormDetalleRecap!=null) {
				this.jInternalFrameDetalleFormDetalleRecap.jCheckBoxPostAccionNuevoDetalleRecap.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormDetalleRecap.jCheckBoxPostAccionSinCerrarDetalleRecap.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormDetalleRecap.jCheckBoxPostAccionSinMensajeDetalleRecap.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionDetalleRecap.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionDetalleRecap.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormDetalleRecap!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormDetalleRecap.jComboBoxTiposAccionesFormularioDetalleRecap.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesDetalleRecap.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoDetalleRecap!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoDetalleRecap.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesDetalleRecap.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesDetalleRecap.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarDetalleRecap.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesDetalleRecap.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoDetalleRecap!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoDetalleRecap.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesDetalleRecap.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralDetalleRecap.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesDetalleRecap(Boolean esInicializar) throws Exception {
		try	{	
			if(DetalleRecapJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualDetalleRecap(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesDetalleRecap() throws Exception {
		try	{
			if(DetalleRecapJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualDetalleRecap();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleDetalleRecap() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormDetalleRecap.jComboBoxTiposAccionesFormularioDetalleRecap.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormDetalleRecap.jComboBoxTiposAccionesFormularioDetalleRecap.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualDetalleRecap() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesDetalleRecap.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesDetalleRecap.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesDetalleRecap.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesDetalleRecap.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesDetalleRecap.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesDetalleRecap.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionDetalleRecap.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionDetalleRecap.addItem(reporte);
			}
			
			
			if(!this.detallerecapSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionDetalleRecap.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionDetalleRecap.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesDetalleRecap.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesDetalleRecap.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesDetalleRecap.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesDetalleRecap.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormDetalleRecap!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormDetalleRecap.jComboBoxTiposAccionesFormularioDetalleRecap.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormDetalleRecap.jComboBoxTiposAccionesFormularioDetalleRecap.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarDetalleRecap.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarDetalleRecap.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarDetalleRecap.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualDetalleRecap();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualDetalleRecap() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoDetalleRecap!=null) {
				this.jInternalFrameReporteDinamicoDetalleRecap.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoDetalleRecap.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoDetalleRecap!=null) {
				this.jInternalFrameReporteDinamicoDetalleRecap.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoDetalleRecap.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoDetalleRecap!=null) {
				
				if(this.jInternalFrameReporteDinamicoDetalleRecap.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoDetalleRecap.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoDetalleRecap.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoDetalleRecap.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoDetalleRecap.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoDetalleRecap.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
				
				//TIPOS COLUMNAS CATEGORIA DINAMICO
				if(this.jInternalFrameReporteDinamicoDetalleRecap.getjComboBoxColumnaCategoriaGrafico()!=null) {
					this.jInternalFrameReporteDinamicoDetalleRecap.getjComboBoxColumnaCategoriaGrafico().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoria=DetalleRecapConstantesFunciones.getTiposSeleccionarDetalleRecap(true,true,false,true,true);
						
					for(Reporte reporte:tiposColumnasCategoria) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoDetalleRecap.getjComboBoxColumnaCategoriaGrafico().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS CATEGORIA VALOR DINAMICO
				if(this.jInternalFrameReporteDinamicoDetalleRecap.getjComboBoxColumnaCategoriaValor()!=null) {
					this.jInternalFrameReporteDinamicoDetalleRecap.getjComboBoxColumnaCategoriaValor().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoriaValor=DetalleRecapConstantesFunciones.getTiposSeleccionarDetalleRecap(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasCategoriaValor) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoDetalleRecap.getjComboBoxColumnaCategoriaValor().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS VALOR
				defaultListModel=new DefaultListModel<Reporte>();
					
				if(this.jInternalFrameReporteDinamicoDetalleRecap.getjListColumnasValoresGrafico()!=null) {
					this.jInternalFrameReporteDinamicoDetalleRecap.getjListColumnasValoresGrafico().removeAll();
						
					ArrayList<Reporte> tiposColumnasValor=DetalleRecapConstantesFunciones.getTiposSeleccionarDetalleRecap(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasValor) {//this.tiposSeleccionar
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoDetalleRecap.getjListColumnasValoresGrafico().setModel(defaultListModel);									
						
				}
					
				//TIPOS GRAFICOS REPORTES DINAMICOS
				if(this.jInternalFrameReporteDinamicoDetalleRecap.getjComboBoxTiposGraficosReportesDinamico()!=null) {
					this.jInternalFrameReporteDinamicoDetalleRecap.getjComboBoxTiposGraficosReportesDinamico().removeAllItems();
						
					for(Reporte reporte:this.tiposGraficosReportes) {
						this.jInternalFrameReporteDinamicoDetalleRecap.getjComboBoxTiposGraficosReportesDinamico().addItem(reporte);
					}
					
				}
			
			
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualDetalleRecap()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_clienteFK_IdClienteDetalleRecap.getSelectedItem()!=null){this.id_clienteFK_IdCliente=((Cliente)this.jComboBoxid_clienteFK_IdClienteDetalleRecap.getSelectedItem()).getId();}
		if(this.jComboBoxid_detalle_clienteFK_IdDetalleClienteDetalleRecap.getSelectedItem()!=null){this.id_detalle_clienteFK_IdDetalleCliente=((DetalleCliente)this.jComboBoxid_detalle_clienteFK_IdDetalleClienteDetalleRecap.getSelectedItem()).getId();}
		if(this.jComboBoxid_recapFK_IdRecapDetalleRecap.getSelectedItem()!=null){this.id_recapFK_IdRecap=((Recap)this.jComboBoxid_recapFK_IdRecapDetalleRecap.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasDetalleRecap(Boolean esInicializar) throws Exception {				
		if(DetalleRecapJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualDetalleRecap();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaDetalleRecap() throws Exception {
		this.inicializarActualizarBindingTablaDetalleRecap(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByDetalleRecap() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByDetalleRecap.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByDetalleRecap.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByDetalleRecap.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new DetalleRecapPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByDetalleRecap.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByDetalleRecap.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new DetalleRecapPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosDetalleRecapOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetalleRecapOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new DetalleRecapPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByDetalleRecap.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByDetalleRecap.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new DetalleRecapPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByDetalleRecap.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaDetalleRecap(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=detallerecapLogic.getDetalleRecaps().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=detallerecaps.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(DetalleRecapJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosDetalleRecap.setModel(new DetalleRecapModel(this.detallerecapLogic.getDetalleRecaps(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosDetalleRecap.setModel(new DetalleRecapModel(this.detallerecaps,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByDetalleRecap!=null && this.jInternalFrameOrderByDetalleRecap.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByDetalleRecap();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosDetalleRecap.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetalleRecap,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new DetalleRecapPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+DetalleRecapConstantesFunciones.SCLASSWEBTITULO,detallerecapConstantesFunciones.resaltarSeleccionarDetalleRecap,iSizeTabla,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+DetalleRecapConstantesFunciones.SCLASSWEBTITULO,detallerecapConstantesFunciones.resaltarSeleccionarDetalleRecap,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosDetalleRecap.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetalleRecap,DetalleRecapConstantesFunciones.LABEL_ID));

		if(this.detallerecapConstantesFunciones.mostraridDetalleRecap && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DetalleRecapConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.detallerecapConstantesFunciones.resaltaridDetalleRecap,this.detallerecapConstantesFunciones.activaridDetalleRecap,iSizeTabla,this,true,"idDetalleRecap","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.detallerecapConstantesFunciones.resaltaridDetalleRecap,this.detallerecapConstantesFunciones.activaridDetalleRecap,this,true,"idDetalleRecap","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDetalleRecap.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetalleRecap,DetalleRecapConstantesFunciones.LABEL_IDRECAP));

		if(this.detallerecapConstantesFunciones.mostrarid_recapDetalleRecap && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DetalleRecapConstantesFunciones.LABEL_IDRECAP,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new RecapTableCell(this.recapsForeignKey,this.detallerecapConstantesFunciones.resaltarid_recapDetalleRecap,this,this.detallerecapConstantesFunciones.activarid_recapDetalleRecap,iSizeTabla));
			tableColumn.setCellEditor(new RecapTableCell(this.recapsForeignKey,this.detallerecapConstantesFunciones.resaltarid_recapDetalleRecap,this,this.detallerecapConstantesFunciones.activarid_recapDetalleRecap,true,"id_recapDetalleRecap","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new DetalleRecapPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDetalleRecap.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetalleRecap,DetalleRecapConstantesFunciones.LABEL_IDEMPRESA));

		if(this.detallerecapConstantesFunciones.mostrarid_empresaDetalleRecap && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DetalleRecapConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.detallerecapConstantesFunciones.resaltarid_empresaDetalleRecap,this,this.detallerecapConstantesFunciones.activarid_empresaDetalleRecap,iSizeTabla));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.detallerecapConstantesFunciones.resaltarid_empresaDetalleRecap,this,this.detallerecapConstantesFunciones.activarid_empresaDetalleRecap,false,"id_empresaDetalleRecap","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new DetalleRecapPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDetalleRecap.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetalleRecap,DetalleRecapConstantesFunciones.LABEL_IDSUCURSAL));

		if(this.detallerecapConstantesFunciones.mostrarid_sucursalDetalleRecap && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DetalleRecapConstantesFunciones.LABEL_IDSUCURSAL,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new SucursalTableCell(this.sucursalsForeignKey,this.detallerecapConstantesFunciones.resaltarid_sucursalDetalleRecap,this,this.detallerecapConstantesFunciones.activarid_sucursalDetalleRecap,iSizeTabla));
			tableColumn.setCellEditor(new SucursalTableCell(this.sucursalsForeignKey,this.detallerecapConstantesFunciones.resaltarid_sucursalDetalleRecap,this,this.detallerecapConstantesFunciones.activarid_sucursalDetalleRecap,false,"id_sucursalDetalleRecap","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new DetalleRecapPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDetalleRecap.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetalleRecap,DetalleRecapConstantesFunciones.LABEL_IDEJERCICIO));

		if(this.detallerecapConstantesFunciones.mostrarid_ejercicioDetalleRecap && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DetalleRecapConstantesFunciones.LABEL_IDEJERCICIO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EjercicioTableCell(this.ejerciciosForeignKey,this.detallerecapConstantesFunciones.resaltarid_ejercicioDetalleRecap,this,this.detallerecapConstantesFunciones.activarid_ejercicioDetalleRecap,iSizeTabla));
			tableColumn.setCellEditor(new EjercicioTableCell(this.ejerciciosForeignKey,this.detallerecapConstantesFunciones.resaltarid_ejercicioDetalleRecap,this,this.detallerecapConstantesFunciones.activarid_ejercicioDetalleRecap,false,"id_ejercicioDetalleRecap","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new DetalleRecapPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDetalleRecap.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetalleRecap,DetalleRecapConstantesFunciones.LABEL_IDDETALLECLIENTE));

		if(this.detallerecapConstantesFunciones.mostrarid_detalle_clienteDetalleRecap && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DetalleRecapConstantesFunciones.LABEL_IDDETALLECLIENTE,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new DetalleClienteTableCell(this.detalleclientesForeignKey,this.detallerecapConstantesFunciones.resaltarid_detalle_clienteDetalleRecap,this,this.detallerecapConstantesFunciones.activarid_detalle_clienteDetalleRecap,iSizeTabla));
			tableColumn.setCellEditor(new DetalleClienteTableCell(this.detalleclientesForeignKey,this.detallerecapConstantesFunciones.resaltarid_detalle_clienteDetalleRecap,this,this.detallerecapConstantesFunciones.activarid_detalle_clienteDetalleRecap,true,"id_detalle_clienteDetalleRecap","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new DetalleRecapPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDetalleRecap.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetalleRecap,DetalleRecapConstantesFunciones.LABEL_IDCLIENTE));

		if(this.detallerecapConstantesFunciones.mostrarid_clienteDetalleRecap && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DetalleRecapConstantesFunciones.LABEL_IDCLIENTE,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new ClienteTableCell(this.clientesForeignKey,this.detallerecapConstantesFunciones.resaltarid_clienteDetalleRecap,this,this.detallerecapConstantesFunciones.activarid_clienteDetalleRecap,iSizeTabla));
			tableColumn.setCellEditor(new ClienteTableCell(this.clientesForeignKey,this.detallerecapConstantesFunciones.resaltarid_clienteDetalleRecap,this,this.detallerecapConstantesFunciones.activarid_clienteDetalleRecap,true,"id_clienteDetalleRecap","CON_BUSQUEDA"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75);
			//tableColumn.addPropertyChangeListener(new DetalleRecapPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDetalleRecap.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetalleRecap,DetalleRecapConstantesFunciones.LABEL_VALOR));

		if(this.detallerecapConstantesFunciones.mostrarvalorDetalleRecap && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DetalleRecapConstantesFunciones.LABEL_VALOR,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.detallerecapConstantesFunciones.resaltarvalorDetalleRecap,this.detallerecapConstantesFunciones.activarvalorDetalleRecap,iSizeTabla,this,true,"valorDetalleRecap","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.detallerecapConstantesFunciones.resaltarvalorDetalleRecap,this.detallerecapConstantesFunciones.activarvalorDetalleRecap,this,true,"valorDetalleRecap","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new DetalleRecapPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDetalleRecap.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetalleRecap,DetalleRecapConstantesFunciones.LABEL_IVAPORCENTAJE));

		if(this.detallerecapConstantesFunciones.mostrariva_porcentajeDetalleRecap && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DetalleRecapConstantesFunciones.LABEL_IVAPORCENTAJE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.detallerecapConstantesFunciones.resaltariva_porcentajeDetalleRecap,this.detallerecapConstantesFunciones.activariva_porcentajeDetalleRecap,iSizeTabla,this,true,"iva_porcentajeDetalleRecap","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.detallerecapConstantesFunciones.resaltariva_porcentajeDetalleRecap,this.detallerecapConstantesFunciones.activariva_porcentajeDetalleRecap,this,true,"iva_porcentajeDetalleRecap","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new DetalleRecapPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDetalleRecap.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetalleRecap,DetalleRecapConstantesFunciones.LABEL_TOTAL));

		if(this.detallerecapConstantesFunciones.mostrartotalDetalleRecap && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DetalleRecapConstantesFunciones.LABEL_TOTAL,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.detallerecapConstantesFunciones.resaltartotalDetalleRecap,this.detallerecapConstantesFunciones.activartotalDetalleRecap,iSizeTabla,this,true,"totalDetalleRecap","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.detallerecapConstantesFunciones.resaltartotalDetalleRecap,this.detallerecapConstantesFunciones.activartotalDetalleRecap,this,true,"totalDetalleRecap","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new DetalleRecapPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.detallerecapSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.detallerecapSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.detallerecapSessionBean.getEsGuardarRelacionado(),iSizeTabla));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosDetalleRecap.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.detallerecapSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.detallerecapSessionBean.getEsGuardarRelacionado(),iSizeTabla));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosDetalleRecap.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarDetalleRecap && this.isPermisoGuardarCambiosDetalleRecap) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.detallerecapSessionBean.getEsGuardarRelacionado(),iSizeTabla));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.detallerecapSessionBean.getEsGuardarRelacionado(),iSizeTabla));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosDetalleRecap.addColumn(tableColumn);
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
			
			this.jTableDatosDetalleRecap.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarDetalleRecap && this.isPermisoGuardarCambiosDetalleRecap) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarDetalleRecap && this.isPermisoGuardarCambiosDetalleRecap) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosDetalleRecap.moveColumn(this.jTableDatosDetalleRecap.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosDetalleRecap.moveColumn(this.jTableDatosDetalleRecap.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosDetalleRecap.moveColumn(this.jTableDatosDetalleRecap.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosDetalleRecap.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosDetalleRecap.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosDetalleRecap,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!DetalleRecapJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosDetalleRecap.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosDetalleRecap.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!DetalleRecapJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!DetalleRecapJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosDetalleRecap.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosDetalleRecap.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosDetalleRecap.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=detallerecapLogic.getDetalleRecaps().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=detallerecaps.size()-1;
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
		//this.jTableDatosDetalleRecap.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosDetalleRecap.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosDetalleRecap();
			
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
				
				//this.isEsNuevoDetalleRecap=false;
					
				DetalleRecapBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.detallerecap,new Object(),this.detallerecapParameterGeneral,this.detallerecapReturnGeneral);
			
				if(this.detallerecapSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormDetalleRecap==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosDetalleRecap.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosDetalleRecap.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallerecap =(DetalleRecap) this.detallerecapLogic.getDetalleRecaps().toArray()[this.jTableDatosDetalleRecap.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.detallerecap =(DetalleRecap) this.detallerecaps.toArray()[this.jTableDatosDetalleRecap.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.detallerecap.getsType().equals("DUPLICADO")
				   || this.detallerecap.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoDetalleRecap=true;
				
				} else {
					this.isEsNuevoDetalleRecap=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.detallerecapSessionBean.getEsGuardarRelacionado()) {
					if(this.detallerecap.getId()>=0 && !this.detallerecap.getIsNew()) {						
						this.isEsNuevoDetalleRecap=false;
						
					} else {
						this.isEsNuevoDetalleRecap=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoDetalleRecap(esRelaciones);						
				
				this.seleccionarDetalleRecap(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.detallerecap.getId()<0) {
					this.isEsNuevoDetalleRecap=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarDetalleRecap(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarDetalleRecap(evt,rowIndex);
				}	
				
				if(this.detallerecapSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion DetalleRecap: " + this.dDif); 
					}
				}								
				
				DetalleRecapBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.detallerecap,new Object(),this.detallerecapParameterGeneral,this.detallerecapReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarDetalleRecap(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.detallerecap)) {
					if(this.detallerecap.getId()>0) {
						this.detallerecap.setIsDeleted(true);
						
						this.detallerecapsEliminados.add(this.detallerecap);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.detallerecapLogic.getDetalleRecaps().remove(this.detallerecap);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.detallerecaps.remove(this.detallerecap);				
					}
					
					
					((DetalleRecapModel) this.jTableDatosDetalleRecap.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaDetalleRecap(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,DetalleRecapConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarDetalleRecap(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoDetalleRecap) {
			
			if(this.jInternalFrameDetalleFormDetalleRecap==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosDetalleRecap.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosDetalleRecap.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallerecap =(DetalleRecap) this.detallerecapLogic.getDetalleRecaps().toArray()[this.jTableDatosDetalleRecap.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.detallerecap =(DetalleRecap) this.detallerecaps.toArray()[this.jTableDatosDetalleRecap.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(DetalleRecapJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioDetalleRecap(this.detallerecap);
				}
				
				//ARCHITECTURE
				try {
					

					//Recap
					if(!this.detallerecapConstantesFunciones.cargarid_recapDetalleRecap || this.detallerecapConstantesFunciones.event_dependid_recapDetalleRecap) {
						//this.cargarCombosRecapsForeignKeyLista(" where id="+this.detallerecap.getid_recap());
									//this.inicializarActualizarBindingDetalleRecap(false,false);
						this.recapsForeignKey=new ArrayList<Recap>();

						if(detallerecap.getRecap()!=null) {
							this.recapsForeignKey.add(detallerecap.getRecap());
						}

						this.addItemDefectoCombosForeignKeyRecap();
						this.cargarCombosFrameRecapsForeignKey("Todos");
					}
					this.setActualRecapForeignKey(this.detallerecap.getid_recap(),false,"Formulario");

					//Empresa
					if(!this.detallerecapConstantesFunciones.cargarid_empresaDetalleRecap || this.detallerecapConstantesFunciones.event_dependid_empresaDetalleRecap) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.detallerecap.getid_empresa());
									//this.inicializarActualizarBindingDetalleRecap(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(detallerecap.getEmpresa()!=null) {
							this.empresasForeignKey.add(detallerecap.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.detallerecap.getid_empresa(),false,"Formulario");

					//Sucursal
					if(!this.detallerecapConstantesFunciones.cargarid_sucursalDetalleRecap || this.detallerecapConstantesFunciones.event_dependid_sucursalDetalleRecap) {
						//this.cargarCombosSucursalsForeignKeyLista(" where id="+this.detallerecap.getid_sucursal());
									//this.inicializarActualizarBindingDetalleRecap(false,false);
						this.sucursalsForeignKey=new ArrayList<Sucursal>();

						if(detallerecap.getSucursal()!=null) {
							this.sucursalsForeignKey.add(detallerecap.getSucursal());
						}

						this.addItemDefectoCombosForeignKeySucursal();
						this.cargarCombosFrameSucursalsForeignKey("Todos");
					}
					this.setActualSucursalForeignKey(this.detallerecap.getid_sucursal(),false,"Formulario");

					//Ejercicio
					if(!this.detallerecapConstantesFunciones.cargarid_ejercicioDetalleRecap || this.detallerecapConstantesFunciones.event_dependid_ejercicioDetalleRecap) {
						//this.cargarCombosEjerciciosForeignKeyLista(" where id="+this.detallerecap.getid_ejercicio());
									//this.inicializarActualizarBindingDetalleRecap(false,false);
						this.ejerciciosForeignKey=new ArrayList<Ejercicio>();

						if(detallerecap.getEjercicio()!=null) {
							this.ejerciciosForeignKey.add(detallerecap.getEjercicio());
						}

						this.addItemDefectoCombosForeignKeyEjercicio();
						this.cargarCombosFrameEjerciciosForeignKey("Todos");
					}
					this.setActualEjercicioForeignKey(this.detallerecap.getid_ejercicio(),false,"Formulario");

					//DetalleCliente
					if(!this.detallerecapConstantesFunciones.cargarid_detalle_clienteDetalleRecap || this.detallerecapConstantesFunciones.event_dependid_detalle_clienteDetalleRecap) {
						//this.cargarCombosDetalleClientesForeignKeyLista(" where id="+this.detallerecap.getid_detalle_cliente());
									//this.inicializarActualizarBindingDetalleRecap(false,false);
						this.detalleclientesForeignKey=new ArrayList<DetalleCliente>();

						if(detallerecap.getDetalleCliente()!=null) {
							this.detalleclientesForeignKey.add(detallerecap.getDetalleCliente());
						}

						this.addItemDefectoCombosForeignKeyDetalleCliente();
						this.cargarCombosFrameDetalleClientesForeignKey("Todos");
					}
					this.setActualDetalleClienteForeignKey(this.detallerecap.getid_detalle_cliente(),false,"Formulario");

					//Cliente
					if(!this.detallerecapConstantesFunciones.cargarid_clienteDetalleRecap || this.detallerecapConstantesFunciones.event_dependid_clienteDetalleRecap) {
						//this.cargarCombosClientesForeignKeyLista(" where id="+this.detallerecap.getid_cliente());
									//this.inicializarActualizarBindingDetalleRecap(false,false);
						this.clientesForeignKey=new ArrayList<Cliente>();

						if(detallerecap.getCliente()!=null) {
							this.clientesForeignKey.add(detallerecap.getCliente());
						}

						this.addItemDefectoCombosForeignKeyCliente();
						this.cargarCombosFrameClientesForeignKey("Todos");
					}
					this.setActualClienteForeignKey(this.detallerecap.getid_cliente(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesDetalleRecap("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesDetalleRecap(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualDetalleRecap() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleRecapConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoDetalleRecap(DetalleRecap detallerecap) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoDetalleRecap(detallerecap,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoDetalleRecap(DetalleRecap detallerecap,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioDetalleRecap(detallerecap);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyDetalleRecap(detallerecap,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyDetalleRecap(detallerecap);
	}
	
	public void setVariablesObjetoActualToFormularioDetalleRecap(DetalleRecap detallerecap) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormDetalleRecap==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormDetalleRecap.jLabelidDetalleRecap.setText(detallerecap.getId().toString());
			this.jInternalFrameDetalleFormDetalleRecap.jTextFieldvalorDetalleRecap.setText(detallerecap.getvalor().toString());
			this.jInternalFrameDetalleFormDetalleRecap.jTextFieldiva_porcentajeDetalleRecap.setText(detallerecap.getiva_porcentaje().toString());
			this.jInternalFrameDetalleFormDetalleRecap.jTextFieldtotalDetalleRecap.setText(detallerecap.gettotal().toString());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,DetalleRecapConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,DetalleRecap detallerecapLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,detallerecapLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,DetalleRecap detallerecapLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				detallerecapLocal=this.detallerecap;
			} else {
				detallerecapLocal=this.detallerecapAnterior;
			}
		}
		
		if(this.permiteMantenimiento(detallerecapLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoDetalleRecap(detallerecapLocal,true);
					
					if(detallerecapSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(detallerecapLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.detallerecapSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(detallerecapLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoDetalleRecap(DetalleRecap detallerecap,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualDetalleRecap(detallerecap,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysDetalleRecap(detallerecap);
	}
	
	public void setVariablesFormularioToObjetoActualDetalleRecap(DetalleRecap detallerecap,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualDetalleRecap(detallerecap,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualDetalleRecap(DetalleRecap detallerecap,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormDetalleRecap==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormDetalleRecap.jLabelidDetalleRecap.getText()==null || this.jInternalFrameDetalleFormDetalleRecap.jLabelidDetalleRecap.getText()=="" || this.jInternalFrameDetalleFormDetalleRecap.jLabelidDetalleRecap.getText()=="Id") {
				this.jInternalFrameDetalleFormDetalleRecap.jLabelidDetalleRecap.setText("0");
			}

			if(conColumnasBase) {detallerecap.setId(Long.parseLong(this.jInternalFrameDetalleFormDetalleRecap.jLabelidDetalleRecap.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+DetalleRecapConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetalleRecap.jLabelIdDetalleRecap,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			detallerecap.setvalor(Double.parseDouble(this.jInternalFrameDetalleFormDetalleRecap.jTextFieldvalorDetalleRecap.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+DetalleRecapConstantesFunciones.LABEL_VALOR+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetalleRecap.jLabelvalorDetalleRecap,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			detallerecap.setiva_porcentaje(Double.parseDouble(this.jInternalFrameDetalleFormDetalleRecap.jTextFieldiva_porcentajeDetalleRecap.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+DetalleRecapConstantesFunciones.LABEL_IVAPORCENTAJE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetalleRecap.jLabeliva_porcentajeDetalleRecap,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			detallerecap.settotal(Double.parseDouble(this.jInternalFrameDetalleFormDetalleRecap.jTextFieldtotalDetalleRecap.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+DetalleRecapConstantesFunciones.LABEL_TOTAL+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetalleRecap.jLabeltotalDetalleRecap,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,DetalleRecapConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualDetalleRecap(DetalleRecap detallerecapBean,DetalleRecap detallerecap,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conDefault || (!conDefault && detallerecapBean.getid_recap()!=null && !detallerecapBean.getid_recap().equals(-1L))) {detallerecap.setid_recap(detallerecapBean.getid_recap());}
			if(conDefault || (!conDefault && detallerecapBean.getid_detalle_cliente()!=null && !detallerecapBean.getid_detalle_cliente().equals(-1L))) {detallerecap.setid_detalle_cliente(detallerecapBean.getid_detalle_cliente());}
			if(conDefault || (!conDefault && detallerecapBean.getid_cliente()!=null && !detallerecapBean.getid_cliente().equals(-1L))) {detallerecap.setid_cliente(detallerecapBean.getid_cliente());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,DetalleRecapConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosDetalleRecap(DetalleRecap detallerecapOrigen,DetalleRecap detallerecap,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && detallerecapOrigen.getId()!=null && !detallerecapOrigen.getId().equals(0L))) {detallerecap.setId(detallerecapOrigen.getId());}}
			if(conDefault || (!conDefault && detallerecapOrigen.getid_recap()!=null && !detallerecapOrigen.getid_recap().equals(-1L))) {detallerecap.setid_recap(detallerecapOrigen.getid_recap());}
			if(conDefault || (!conDefault && detallerecapOrigen.getid_detalle_cliente()!=null && !detallerecapOrigen.getid_detalle_cliente().equals(-1L))) {detallerecap.setid_detalle_cliente(detallerecapOrigen.getid_detalle_cliente());}
			if(conDefault || (!conDefault && detallerecapOrigen.getid_cliente()!=null && !detallerecapOrigen.getid_cliente().equals(-1L))) {detallerecap.setid_cliente(detallerecapOrigen.getid_cliente());}
			if(conDefault || (!conDefault && detallerecapOrigen.getvalor()!=null && !detallerecapOrigen.getvalor().equals(0.0))) {detallerecap.setvalor(detallerecapOrigen.getvalor());}
			if(conDefault || (!conDefault && detallerecapOrigen.getiva_porcentaje()!=null && !detallerecapOrigen.getiva_porcentaje().equals(0.0))) {detallerecap.setiva_porcentaje(detallerecapOrigen.getiva_porcentaje());}
			if(conDefault || (!conDefault && detallerecapOrigen.gettotal()!=null && !detallerecapOrigen.gettotal().equals(0.0))) {detallerecap.settotal(detallerecapOrigen.gettotal());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,DetalleRecapConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioDetalleRecap(DetalleRecap detallerecap) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormDetalleRecap.jLabelidDetalleRecap.setText(detallerecap.getId().toString());
			this.jInternalFrameDetalleFormDetalleRecap.jTextFieldvalorDetalleRecap.setText(detallerecap.getvalor().toString());
			this.jInternalFrameDetalleFormDetalleRecap.jTextFieldiva_porcentajeDetalleRecap.setText(detallerecap.getiva_porcentaje().toString());
			this.jInternalFrameDetalleFormDetalleRecap.jTextFieldtotalDetalleRecap.setText(detallerecap.gettotal().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleRecapConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioDetalleRecap(DetalleRecapBean detallerecapBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormDetalleRecap.jLabelidDetalleRecap.setText(detallerecapBean.getId().toString());
			this.jInternalFrameDetalleFormDetalleRecap.jTextFieldvalorDetalleRecap.setText(detallerecapBean.getvalor().toString());
			this.jInternalFrameDetalleFormDetalleRecap.jTextFieldiva_porcentajeDetalleRecap.setText(detallerecapBean.getiva_porcentaje().toString());
			this.jInternalFrameDetalleFormDetalleRecap.jTextFieldtotalDetalleRecap.setText(detallerecapBean.gettotal().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleRecapConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanDetalleRecap(DetalleRecapParameterReturnGeneral detallerecapReturnGeneral,DetalleRecapBean detallerecapBean,Boolean conDefault) throws Exception { 
		try {
			DetalleRecap detallerecapLocal=new DetalleRecap();
			
			detallerecapLocal=detallerecapReturnGeneral.getDetalleRecap();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && detallerecapLocal.getId()!=null && !detallerecapLocal.getId().equals(0L))) {detallerecapBean.setId(detallerecapLocal.getId());}}
			if(conDefault || (!conDefault && detallerecapLocal.getid_recap()!=null && !detallerecapLocal.getid_recap().equals(-1L))) {detallerecapBean.setid_recap(detallerecapLocal.getid_recap());}
			if(conDefault || (!conDefault && detallerecapLocal.getid_detalle_cliente()!=null && !detallerecapLocal.getid_detalle_cliente().equals(-1L))) {detallerecapBean.setid_detalle_cliente(detallerecapLocal.getid_detalle_cliente());}
			if(conDefault || (!conDefault && detallerecapLocal.getid_cliente()!=null && !detallerecapLocal.getid_cliente().equals(-1L))) {detallerecapBean.setid_cliente(detallerecapLocal.getid_cliente());}
			if(conDefault || (!conDefault && detallerecapLocal.getvalor()!=null && !detallerecapLocal.getvalor().equals(0.0))) {detallerecapBean.setvalor(detallerecapLocal.getvalor());}
			if(conDefault || (!conDefault && detallerecapLocal.getiva_porcentaje()!=null && !detallerecapLocal.getiva_porcentaje().equals(0.0))) {detallerecapBean.setiva_porcentaje(detallerecapLocal.getiva_porcentaje());}
			if(conDefault || (!conDefault && detallerecapLocal.gettotal()!=null && !detallerecapLocal.gettotal().equals(0.0))) {detallerecapBean.settotal(detallerecapLocal.gettotal());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleRecapConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxDetalleRecapGenerico(Long idDetalleRecapSeleccionado,JComboBox jComboBoxDetalleRecap,List<DetalleRecap> detallerecapsLocal)throws Exception {
		try {
			DetalleRecap  detallerecapTemp=null;

			for(DetalleRecap detallerecapAux:detallerecapsLocal) {
				if(detallerecapAux.getId()!=null && detallerecapAux.getId().equals(idDetalleRecapSeleccionado)) {
					detallerecapTemp=detallerecapAux;
					break;
				}
			}

			jComboBoxDetalleRecap.setSelectedItem(detallerecapTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxDetalleRecapGenerico(JComboBox jComboBoxDetalleRecap,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxDetalleRecap.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxDetalleRecap.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxDetalleRecap.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxDetalleRecap.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxDetalleRecap.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxDetalleRecap.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxDetalleRecap.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxDetalleRecap.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxDetalleRecap.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxDetalleRecap.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,DetalleRecapConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			detallerecap=(DetalleRecap) detallerecapLogic.getDetalleRecaps().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			detallerecap =(DetalleRecap) detallerecaps.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Recap")) {
			//sDescripcion=this.getActualRecapForeignKeyDescripcion((Long)value);
			if(!detallerecap.getIsNew() && !detallerecap.getIsChanged() && !detallerecap.getIsDeleted()) {
				sDescripcion=detallerecap.getrecap_descripcion();
			} else {
				//sDescripcion=this.getActualRecapForeignKeyDescripcion((Long)value);
				sDescripcion=detallerecap.getrecap_descripcion();
			}
		}

		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!detallerecap.getIsNew() && !detallerecap.getIsChanged() && !detallerecap.getIsDeleted()) {
				sDescripcion=detallerecap.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=detallerecap.getempresa_descripcion();
			}
		}

		if(sTipo.equals("Sucursal")) {
			//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
			if(!detallerecap.getIsNew() && !detallerecap.getIsChanged() && !detallerecap.getIsDeleted()) {
				sDescripcion=detallerecap.getsucursal_descripcion();
			} else {
				//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
				sDescripcion=detallerecap.getsucursal_descripcion();
			}
		}

		if(sTipo.equals("Ejercicio")) {
			//sDescripcion=this.getActualEjercicioForeignKeyDescripcion((Long)value);
			if(!detallerecap.getIsNew() && !detallerecap.getIsChanged() && !detallerecap.getIsDeleted()) {
				sDescripcion=detallerecap.getejercicio_descripcion();
			} else {
				//sDescripcion=this.getActualEjercicioForeignKeyDescripcion((Long)value);
				sDescripcion=detallerecap.getejercicio_descripcion();
			}
		}

		if(sTipo.equals("DetalleCliente")) {
			//sDescripcion=this.getActualDetalleClienteForeignKeyDescripcion((Long)value);
			if(!detallerecap.getIsNew() && !detallerecap.getIsChanged() && !detallerecap.getIsDeleted()) {
				sDescripcion=detallerecap.getdetallecliente_descripcion();
			} else {
				//sDescripcion=this.getActualDetalleClienteForeignKeyDescripcion((Long)value);
				sDescripcion=detallerecap.getdetallecliente_descripcion();
			}
		}

		if(sTipo.equals("Cliente")) {
			//sDescripcion=this.getActualClienteForeignKeyDescripcion((Long)value);
			if(!detallerecap.getIsNew() && !detallerecap.getIsChanged() && !detallerecap.getIsDeleted()) {
				sDescripcion=detallerecap.getcliente_descripcion();
			} else {
				//sDescripcion=this.getActualClienteForeignKeyDescripcion((Long)value);
				sDescripcion=detallerecap.getcliente_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		DetalleRecap detallerecapRow=new DetalleRecap();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			detallerecapRow=(DetalleRecap) detallerecapLogic.getDetalleRecaps().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			detallerecapRow=(DetalleRecap) detallerecaps.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualDetalleRecap(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoDetalleRecap.setVisible((this.isVisibilidadCeldaNuevoDetalleRecap && this.isPermisoNuevoDetalleRecap));			
			this.jButtonDuplicarDetalleRecap.setVisible((this.isVisibilidadCeldaDuplicarDetalleRecap && this.isPermisoDuplicarDetalleRecap));			
			this.jButtonCopiarDetalleRecap.setVisible((this.isVisibilidadCeldaCopiarDetalleRecap && this.isPermisoCopiarDetalleRecap));
			this.jButtonVerFormDetalleRecap.setVisible((this.isVisibilidadCeldaVerFormDetalleRecap && this.isPermisoVerFormDetalleRecap));
			
			this.jButtonAbrirOrderByDetalleRecap.setVisible((this.isVisibilidadCeldaOrdenDetalleRecap && this.isPermisoOrdenDetalleRecap));			
			
			this.jButtonNuevoRelacionesDetalleRecap.setVisible((this.isVisibilidadCeldaNuevoRelacionesDetalleRecap && this.isPermisoNuevoDetalleRecap));			
			this.jButtonNuevoGuardarCambiosDetalleRecap.setVisible((this.isVisibilidadCeldaNuevoDetalleRecap && this.isPermisoNuevoDetalleRecap && this.isPermisoGuardarCambiosDetalleRecap));
			
			if(this.jInternalFrameDetalleFormDetalleRecap!=null) {
			this.jInternalFrameDetalleFormDetalleRecap.jButtonModificarDetalleRecap.setVisible((this.isVisibilidadCeldaModificarDetalleRecap && this.isPermisoActualizarDetalleRecap));	
			this.jInternalFrameDetalleFormDetalleRecap.jButtonActualizarDetalleRecap.setVisible((this.isVisibilidadCeldaActualizarDetalleRecap && this.isPermisoActualizarDetalleRecap));	
			this.jInternalFrameDetalleFormDetalleRecap.jButtonEliminarDetalleRecap.setVisible((this.isVisibilidadCeldaEliminarDetalleRecap && this.isPermisoEliminarDetalleRecap));
			this.jInternalFrameDetalleFormDetalleRecap.jButtonCancelarDetalleRecap.setVisible(this.isVisibilidadCeldaCancelarDetalleRecap);							
			this.jInternalFrameDetalleFormDetalleRecap.jButtonGuardarCambiosDetalleRecap.setVisible((this.isVisibilidadCeldaGuardarDetalleRecap && this.isPermisoGuardarCambiosDetalleRecap));			
			
			}
						
			this.jButtonGuardarCambiosTablaDetalleRecap.setVisible((this.isVisibilidadCeldaGuardarCambiosDetalleRecap && this.isPermisoGuardarCambiosDetalleRecap));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarDetalleRecap.setVisible((this.isVisibilidadCeldaNuevoDetalleRecap && this.isPermisoNuevoDetalleRecap));						
			this.jButtonDuplicarToolBarDetalleRecap.setVisible((this.isVisibilidadCeldaDuplicarDetalleRecap && this.isPermisoDuplicarDetalleRecap));						
			this.jButtonCopiarToolBarDetalleRecap.setVisible((this.isVisibilidadCeldaCopiarDetalleRecap && this.isPermisoCopiarDetalleRecap));			
			this.jButtonVerFormToolBarDetalleRecap.setVisible((this.isVisibilidadCeldaVerFormDetalleRecap && this.isPermisoVerFormDetalleRecap));			
			this.jButtonAbrirOrderByToolBarDetalleRecap.setVisible((this.isVisibilidadCeldaOrdenDetalleRecap && this.isPermisoOrdenDetalleRecap));
			this.jButtonNuevoRelacionesToolBarDetalleRecap.setVisible((this.isVisibilidadCeldaNuevoRelacionesDetalleRecap && this.isPermisoNuevoDetalleRecap));			
			this.jButtonNuevoGuardarCambiosToolBarDetalleRecap.setVisible((this.isVisibilidadCeldaNuevoDetalleRecap && this.isPermisoNuevoDetalleRecap && this.isPermisoGuardarCambiosDetalleRecap));			
			
			if(this.jInternalFrameDetalleFormDetalleRecap!=null) {
			this.jInternalFrameDetalleFormDetalleRecap.jButtonModificarToolBarDetalleRecap.setVisible((this.isVisibilidadCeldaModificarDetalleRecap && this.isPermisoActualizarDetalleRecap));	
			this.jInternalFrameDetalleFormDetalleRecap.jButtonActualizarToolBarDetalleRecap.setVisible((this.isVisibilidadCeldaActualizarDetalleRecap  && this.isPermisoActualizarDetalleRecap));	
			this.jInternalFrameDetalleFormDetalleRecap.jButtonEliminarToolBarDetalleRecap.setVisible((this.isVisibilidadCeldaEliminarDetalleRecap && this.isPermisoEliminarDetalleRecap));
			this.jInternalFrameDetalleFormDetalleRecap.jButtonCancelarToolBarDetalleRecap.setVisible(this.isVisibilidadCeldaCancelarDetalleRecap);				
			this.jInternalFrameDetalleFormDetalleRecap.jButtonGuardarCambiosToolBarDetalleRecap.setVisible((this.isVisibilidadCeldaGuardarDetalleRecap && this.isPermisoGuardarCambiosDetalleRecap));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarDetalleRecap.setVisible((this.isVisibilidadCeldaGuardarCambiosDetalleRecap && this.isPermisoGuardarCambiosDetalleRecap));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoDetalleRecap.setVisible((this.isVisibilidadCeldaNuevoDetalleRecap && this.isPermisoNuevoDetalleRecap));			
			this.jMenuItemDuplicarDetalleRecap.setVisible((this.isVisibilidadCeldaDuplicarDetalleRecap && this.isPermisoDuplicarDetalleRecap));			
			this.jMenuItemCopiarDetalleRecap.setVisible((this.isVisibilidadCeldaCopiarDetalleRecap && this.isPermisoCopiarDetalleRecap));			
			this.jMenuItemVerFormDetalleRecap.setVisible((this.isVisibilidadCeldaVerFormDetalleRecap && this.isPermisoVerFormDetalleRecap));			
			this.jMenuItemAbrirOrderByDetalleRecap.setVisible((this.isVisibilidadCeldaOrdenDetalleRecap && this.isPermisoOrdenDetalleRecap));			
			//this.jMenuItemMostrarOcultarDetalleRecap.setVisible((this.isVisibilidadCeldaOrdenDetalleRecap && this.isPermisoOrdenDetalleRecap));
			this.jMenuItemDetalleAbrirOrderByDetalleRecap.setVisible((this.isVisibilidadCeldaOrdenDetalleRecap && this.isPermisoOrdenDetalleRecap));			
			//this.jMenuItemDetalleMostrarOcultarDetalleRecap.setVisible((this.isVisibilidadCeldaOrdenDetalleRecap && this.isPermisoOrdenDetalleRecap));			
			this.jMenuItemNuevoRelacionesDetalleRecap.setVisible((this.isVisibilidadCeldaNuevoRelacionesDetalleRecap && this.isPermisoNuevoDetalleRecap));			
			this.jMenuItemNuevoGuardarCambiosDetalleRecap.setVisible((this.isVisibilidadCeldaNuevoDetalleRecap && this.isPermisoNuevoDetalleRecap && this.isPermisoGuardarCambiosDetalleRecap));									
			
			if(this.jInternalFrameDetalleFormDetalleRecap!=null) {
			this.jInternalFrameDetalleFormDetalleRecap.jMenuItemModificarDetalleRecap.setVisible((this.isVisibilidadCeldaModificarDetalleRecap && this.isPermisoActualizarDetalleRecap));	
			this.jInternalFrameDetalleFormDetalleRecap.jMenuItemActualizarDetalleRecap.setVisible((this.isVisibilidadCeldaActualizarDetalleRecap && this.isPermisoActualizarDetalleRecap));	
			this.jInternalFrameDetalleFormDetalleRecap.jMenuItemEliminarDetalleRecap.setVisible((this.isVisibilidadCeldaEliminarDetalleRecap && this.isPermisoEliminarDetalleRecap));
			this.jInternalFrameDetalleFormDetalleRecap.jMenuItemCancelarDetalleRecap.setVisible(this.isVisibilidadCeldaCancelarDetalleRecap);				
			}
			
			this.jMenuItemGuardarCambiosDetalleRecap.setVisible((this.isVisibilidadCeldaGuardarDetalleRecap && this.isPermisoGuardarCambiosDetalleRecap));						
			this.jMenuItemGuardarCambiosTablaDetalleRecap.setVisible((this.isVisibilidadCeldaGuardarCambiosDetalleRecap && this.isPermisoGuardarCambiosDetalleRecap));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoDetalleRecap=this.jButtonNuevoDetalleRecap.isVisible();
			this.isVisibilidadCeldaDuplicarDetalleRecap=this.jButtonDuplicarDetalleRecap.isVisible();
			this.isVisibilidadCeldaCopiarDetalleRecap=this.jButtonCopiarDetalleRecap.isVisible();
			this.isVisibilidadCeldaVerFormDetalleRecap=this.jButtonVerFormDetalleRecap.isVisible();
			
			this.isVisibilidadCeldaOrdenDetalleRecap=this.jButtonAbrirOrderByDetalleRecap.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesDetalleRecap=this.jButtonNuevoRelacionesDetalleRecap.isVisible();
			this.isVisibilidadCeldaModificarDetalleRecap=this.jButtonModificarDetalleRecap.isVisible();
			
			if(this.jInternalFrameDetalleFormDetalleRecap!=null) {
			this.isVisibilidadCeldaActualizarDetalleRecap=this.jInternalFrameDetalleFormDetalleRecap.jButtonActualizarDetalleRecap.isVisible();
			this.isVisibilidadCeldaEliminarDetalleRecap=this.jInternalFrameDetalleFormDetalleRecap.jButtonEliminarDetalleRecap.isVisible();
			this.isVisibilidadCeldaCancelarDetalleRecap=this.jInternalFrameDetalleFormDetalleRecap.jButtonCancelarDetalleRecap.isVisible();
			this.isVisibilidadCeldaGuardarDetalleRecap=this.jInternalFrameDetalleFormDetalleRecap.jButtonGuardarCambiosDetalleRecap.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosDetalleRecap=this.jButtonGuardarCambiosTablaDetalleRecap.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoDetalleRecap=this.jButtonNuevoToolBarDetalleRecap.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesDetalleRecap=this.jButtonNuevoRelacionesToolBarDetalleRecap.isVisible();
			
			if(this.jInternalFrameDetalleFormDetalleRecap!=null) {
			this.isVisibilidadCeldaModificarDetalleRecap=this.jInternalFrameDetalleFormDetalleRecap.jButtonModificarToolBarDetalleRecap.isVisible();
			this.isVisibilidadCeldaActualizarDetalleRecap=this.jInternalFrameDetalleFormDetalleRecap.jButtonActualizarToolBarDetalleRecap.isVisible();
			this.isVisibilidadCeldaEliminarDetalleRecap=this.jInternalFrameDetalleFormDetalleRecap.jButtonEliminarToolBarDetalleRecap.isVisible();
			this.isVisibilidadCeldaCancelarDetalleRecap=this.jInternalFrameDetalleFormDetalleRecap.jButtonCancelarToolBarDetalleRecap.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarDetalleRecap=this.jButtonGuardarCambiosToolBarDetalleRecap.isVisible();
			this.isVisibilidadCeldaGuardarCambiosDetalleRecap=this.jButtonGuardarCambiosTablaToolBarDetalleRecap.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoDetalleRecap=this.jMenuItemNuevoDetalleRecap.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesDetalleRecap=this.jMenuItemNuevoRelacionesDetalleRecap.isVisible();
			
			if(this.jInternalFrameDetalleFormDetalleRecap!=null) {
			this.isVisibilidadCeldaModificarDetalleRecap=this.jInternalFrameDetalleFormDetalleRecap.jMenuItemModificarDetalleRecap.isVisible();
			this.isVisibilidadCeldaActualizarDetalleRecap=this.jInternalFrameDetalleFormDetalleRecap.jMenuItemActualizarDetalleRecap.isVisible();
			this.isVisibilidadCeldaEliminarDetalleRecap=this.jInternalFrameDetalleFormDetalleRecap.jMenuItemEliminarDetalleRecap.isVisible();
			this.isVisibilidadCeldaCancelarDetalleRecap=this.jInternalFrameDetalleFormDetalleRecap.jMenuItemCancelarDetalleRecap.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarDetalleRecap=this.jMenuItemGuardarCambiosDetalleRecap.isVisible();
			this.isVisibilidadCeldaGuardarCambiosDetalleRecap=this.jMenuItemGuardarCambiosTablaDetalleRecap.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesDetalleRecap(Boolean esInicializar) {
		if(DetalleRecapJInternalFrame.ISBINDING_MANUAL) {			
			if(this.detallerecapSessionBean.getConGuardarRelaciones()) {
				//if(this.detallerecapSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesDetalleRecap();
			}
			
			this.inicializarActualizarBindingBotonesManualDetalleRecap(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualDetalleRecap() {
		this.jButtonNuevoDetalleRecap.setVisible(this.isPermisoNuevoDetalleRecap);			
		this.jButtonDuplicarDetalleRecap.setVisible(this.isPermisoDuplicarDetalleRecap);			
		this.jButtonCopiarDetalleRecap.setVisible(this.isPermisoCopiarDetalleRecap);			
		this.jButtonVerFormDetalleRecap.setVisible(this.isPermisoVerFormDetalleRecap);			
		
		this.jButtonAbrirOrderByDetalleRecap.setVisible(this.isPermisoOrdenDetalleRecap);					
		
		this.jButtonNuevoRelacionesDetalleRecap.setVisible(this.isPermisoNuevoDetalleRecap);			
		
		if(this.jInternalFrameDetalleFormDetalleRecap!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetalleRecap.jButtonModificarDetalleRecap.setVisible(this.isPermisoActualizarDetalleRecap);	
			this.jInternalFrameDetalleFormDetalleRecap.jButtonActualizarDetalleRecap.setVisible(this.isPermisoActualizarDetalleRecap);	
			this.jInternalFrameDetalleFormDetalleRecap.jButtonEliminarDetalleRecap.setVisible(this.isPermisoEliminarDetalleRecap);
			this.jInternalFrameDetalleFormDetalleRecap.jButtonCancelarDetalleRecap.setVisible(this.isVisibilidadCeldaCancelarDetalleRecap);						
			this.jInternalFrameDetalleFormDetalleRecap.jButtonGuardarCambiosDetalleRecap.setVisible(this.isPermisoGuardarCambiosDetalleRecap);							
		}
		
		this.jButtonGuardarCambiosTablaDetalleRecap.setVisible(this.isPermisoActualizarDetalleRecap);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleDetalleRecap() {
		this.jInternalFrameDetalleFormDetalleRecap.jButtonModificarDetalleRecap.setVisible(this.isPermisoActualizarDetalleRecap);	
		this.jInternalFrameDetalleFormDetalleRecap.jButtonActualizarDetalleRecap.setVisible(this.isPermisoActualizarDetalleRecap);	
		this.jInternalFrameDetalleFormDetalleRecap.jButtonEliminarDetalleRecap.setVisible(this.isPermisoEliminarDetalleRecap);
		this.jInternalFrameDetalleFormDetalleRecap.jButtonCancelarDetalleRecap.setVisible(this.isVisibilidadCeldaCancelarDetalleRecap);							
		this.jInternalFrameDetalleFormDetalleRecap.jButtonGuardarCambiosDetalleRecap.setVisible((this.isVisibilidadCeldaGuardarDetalleRecap && this.isPermisoGuardarCambiosDetalleRecap));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosDetalleRecap() {
		if(DetalleRecapJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualDetalleRecap();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesDetalleRecap() {
	}
	
	public void jTableDatosDetalleRecapListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarDetalleRecap(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleRecapConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidDetalleRecapBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallerecapLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetalleRecap.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDetalleRecap(this.getdetallerecap(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleRecap(this.detallerecap);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detallerecap =(DetalleRecap) this.detallerecapLogic.getDetalleRecaps().toArray()[this.jTableDatosDetalleRecap.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.detallerecap =(DetalleRecap) this.detallerecaps.toArray()[this.jTableDatosDetalleRecap.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.detallerecap==null) {
						this.detallerecap = new DetalleRecap();
					}

					this.setVariablesFormularioToObjetoActualDetalleRecap(this.detallerecap,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleRecap(this.detallerecap);
				}

				if(this.detallerecap.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.detallerecap.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDetalleRecap(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallerecapLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallerecapLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DetalleRecapConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallerecapLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_recapDetalleRecapUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallerecapLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisorecap=true;

			idTienePermisorecap=this.tienePermisosUsuarioEnPaginaWebDetalleRecap(RecapConstantesFunciones.CLASSNAME);

			if(idTienePermisorecap) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetalleRecap.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosDetalleRecap.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosDetalleRecap.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallerecap =(DetalleRecap) this.detallerecapLogic.getDetalleRecaps().toArray()[this.jTableDatosDetalleRecap.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.detallerecap =(DetalleRecap) this.detallerecaps.toArray()[this.jTableDatosDetalleRecap.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualDetalleRecap(this.getdetallerecap(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysDetalleRecap(this.detallerecap);

				this.recapBeanSwingJInternalFrame=new RecapBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.recapBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.recapBeanSwingJInternalFrame.getRecapLogic().setConnexion(this.detallerecapLogic.getConnexion());

				if(this.detallerecap.getid_recap()!=null) {
					this.recapBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.recapBeanSwingJInternalFrame.setIdActual(this.detallerecap.getid_recap());
					this.recapBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.recapBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.recapBeanSwingJInternalFrame.inicializarActualizarBindingTablaRecap();
				}

				JInternalFrameBase jinternalFrame =this.recapBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderDetalleRecap=(TitledBorder)this.jScrollPanelDatosDetalleRecap.getBorder();
				TitledBorder titledBorderrecap=(TitledBorder)this.recapBeanSwingJInternalFrame.jScrollPanelDatosRecap.getBorder();

				titledBorderrecap.setTitle(titledBorderDetalleRecap.getTitle() + " -> Recap");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallerecapLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallerecapLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DetalleRecapConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallerecapLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_recapDetalleRecapBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallerecapLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetalleRecap.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDetalleRecap(this.getdetallerecap(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleRecap(this.detallerecap);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detallerecap =(DetalleRecap) this.detallerecapLogic.getDetalleRecaps().toArray()[this.jTableDatosDetalleRecap.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.detallerecap =(DetalleRecap) this.detallerecaps.toArray()[this.jTableDatosDetalleRecap.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.detallerecap==null) {
						this.detallerecap = new DetalleRecap();
					}

					this.setVariablesFormularioToObjetoActualDetalleRecap(this.detallerecap,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleRecap(this.detallerecap);
				}

				if(this.detallerecap.getid_recap()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_recap = "+this.detallerecap.getid_recap().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDetalleRecap(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallerecapLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallerecapLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DetalleRecapConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallerecapLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaDetalleRecapUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallerecapLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebDetalleRecap(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetalleRecap.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosDetalleRecap.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosDetalleRecap.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallerecap =(DetalleRecap) this.detallerecapLogic.getDetalleRecaps().toArray()[this.jTableDatosDetalleRecap.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.detallerecap =(DetalleRecap) this.detallerecaps.toArray()[this.jTableDatosDetalleRecap.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualDetalleRecap(this.getdetallerecap(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysDetalleRecap(this.detallerecap);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.detallerecapLogic.getConnexion());

				if(this.detallerecap.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.detallerecap.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderDetalleRecap=(TitledBorder)this.jScrollPanelDatosDetalleRecap.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderDetalleRecap.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallerecapLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallerecapLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DetalleRecapConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallerecapLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaDetalleRecapBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallerecapLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetalleRecap.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDetalleRecap(this.getdetallerecap(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleRecap(this.detallerecap);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detallerecap =(DetalleRecap) this.detallerecapLogic.getDetalleRecaps().toArray()[this.jTableDatosDetalleRecap.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.detallerecap =(DetalleRecap) this.detallerecaps.toArray()[this.jTableDatosDetalleRecap.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.detallerecap==null) {
						this.detallerecap = new DetalleRecap();
					}

					this.setVariablesFormularioToObjetoActualDetalleRecap(this.detallerecap,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleRecap(this.detallerecap);
				}

				if(this.detallerecap.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.detallerecap.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDetalleRecap(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallerecapLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallerecapLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DetalleRecapConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallerecapLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_sucursalDetalleRecapUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallerecapLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisosucursal=true;

			idTienePermisosucursal=this.tienePermisosUsuarioEnPaginaWebDetalleRecap(SucursalConstantesFunciones.CLASSNAME);

			if(idTienePermisosucursal) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetalleRecap.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosDetalleRecap.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosDetalleRecap.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallerecap =(DetalleRecap) this.detallerecapLogic.getDetalleRecaps().toArray()[this.jTableDatosDetalleRecap.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.detallerecap =(DetalleRecap) this.detallerecaps.toArray()[this.jTableDatosDetalleRecap.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualDetalleRecap(this.getdetallerecap(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysDetalleRecap(this.detallerecap);

				this.sucursalBeanSwingJInternalFrame=new SucursalBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.sucursalBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.sucursalBeanSwingJInternalFrame.getSucursalLogic().setConnexion(this.detallerecapLogic.getConnexion());

				if(this.detallerecap.getid_sucursal()!=null) {
					this.sucursalBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.sucursalBeanSwingJInternalFrame.setIdActual(this.detallerecap.getid_sucursal());
					this.sucursalBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.inicializarActualizarBindingTablaSucursal();
				}

				JInternalFrameBase jinternalFrame =this.sucursalBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderDetalleRecap=(TitledBorder)this.jScrollPanelDatosDetalleRecap.getBorder();
				TitledBorder titledBordersucursal=(TitledBorder)this.sucursalBeanSwingJInternalFrame.jScrollPanelDatosSucursal.getBorder();

				titledBordersucursal.setTitle(titledBorderDetalleRecap.getTitle() + " -> Sucursal");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallerecapLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallerecapLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DetalleRecapConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallerecapLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_sucursalDetalleRecapBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallerecapLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetalleRecap.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDetalleRecap(this.getdetallerecap(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleRecap(this.detallerecap);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detallerecap =(DetalleRecap) this.detallerecapLogic.getDetalleRecaps().toArray()[this.jTableDatosDetalleRecap.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.detallerecap =(DetalleRecap) this.detallerecaps.toArray()[this.jTableDatosDetalleRecap.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.detallerecap==null) {
						this.detallerecap = new DetalleRecap();
					}

					this.setVariablesFormularioToObjetoActualDetalleRecap(this.detallerecap,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleRecap(this.detallerecap);
				}

				if(this.detallerecap.getid_sucursal()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_sucursal = "+this.detallerecap.getid_sucursal().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDetalleRecap(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallerecapLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallerecapLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DetalleRecapConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallerecapLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_ejercicioDetalleRecapUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallerecapLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoejercicio=true;

			idTienePermisoejercicio=this.tienePermisosUsuarioEnPaginaWebDetalleRecap(EjercicioConstantesFunciones.CLASSNAME);

			if(idTienePermisoejercicio) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetalleRecap.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosDetalleRecap.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosDetalleRecap.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallerecap =(DetalleRecap) this.detallerecapLogic.getDetalleRecaps().toArray()[this.jTableDatosDetalleRecap.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.detallerecap =(DetalleRecap) this.detallerecaps.toArray()[this.jTableDatosDetalleRecap.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualDetalleRecap(this.getdetallerecap(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysDetalleRecap(this.detallerecap);

				this.ejercicioBeanSwingJInternalFrame=new EjercicioBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.ejercicioBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.ejercicioBeanSwingJInternalFrame.getEjercicioLogic().setConnexion(this.detallerecapLogic.getConnexion());

				if(this.detallerecap.getid_ejercicio()!=null) {
					this.ejercicioBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.ejercicioBeanSwingJInternalFrame.setIdActual(this.detallerecap.getid_ejercicio());
					this.ejercicioBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.ejercicioBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.ejercicioBeanSwingJInternalFrame.inicializarActualizarBindingTablaEjercicio();
				}

				JInternalFrameBase jinternalFrame =this.ejercicioBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderDetalleRecap=(TitledBorder)this.jScrollPanelDatosDetalleRecap.getBorder();
				TitledBorder titledBorderejercicio=(TitledBorder)this.ejercicioBeanSwingJInternalFrame.jScrollPanelDatosEjercicio.getBorder();

				titledBorderejercicio.setTitle(titledBorderDetalleRecap.getTitle() + " -> Ejercicio");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallerecapLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallerecapLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DetalleRecapConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallerecapLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_ejercicioDetalleRecapBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallerecapLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetalleRecap.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDetalleRecap(this.getdetallerecap(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleRecap(this.detallerecap);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detallerecap =(DetalleRecap) this.detallerecapLogic.getDetalleRecaps().toArray()[this.jTableDatosDetalleRecap.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.detallerecap =(DetalleRecap) this.detallerecaps.toArray()[this.jTableDatosDetalleRecap.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.detallerecap==null) {
						this.detallerecap = new DetalleRecap();
					}

					this.setVariablesFormularioToObjetoActualDetalleRecap(this.detallerecap,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleRecap(this.detallerecap);
				}

				if(this.detallerecap.getid_ejercicio()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_ejercicio = "+this.detallerecap.getid_ejercicio().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDetalleRecap(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallerecapLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallerecapLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DetalleRecapConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallerecapLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_detalle_clienteDetalleRecapUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallerecapLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisodetallecliente=true;

			idTienePermisodetallecliente=this.tienePermisosUsuarioEnPaginaWebDetalleRecap(DetalleClienteConstantesFunciones.CLASSNAME);

			if(idTienePermisodetallecliente) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetalleRecap.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosDetalleRecap.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosDetalleRecap.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallerecap =(DetalleRecap) this.detallerecapLogic.getDetalleRecaps().toArray()[this.jTableDatosDetalleRecap.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.detallerecap =(DetalleRecap) this.detallerecaps.toArray()[this.jTableDatosDetalleRecap.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualDetalleRecap(this.getdetallerecap(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysDetalleRecap(this.detallerecap);

				this.detalleclienteBeanSwingJInternalFrame=new DetalleClienteBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.detalleclienteBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.detalleclienteBeanSwingJInternalFrame.getDetalleClienteLogic().setConnexion(this.detallerecapLogic.getConnexion());

				if(this.detallerecap.getid_detalle_cliente()!=null) {
					this.detalleclienteBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.detalleclienteBeanSwingJInternalFrame.setIdActual(this.detallerecap.getid_detalle_cliente());
					this.detalleclienteBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.detalleclienteBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.detalleclienteBeanSwingJInternalFrame.inicializarActualizarBindingTablaDetalleCliente();
				}

				JInternalFrameBase jinternalFrame =this.detalleclienteBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderDetalleRecap=(TitledBorder)this.jScrollPanelDatosDetalleRecap.getBorder();
				TitledBorder titledBorderdetallecliente=(TitledBorder)this.detalleclienteBeanSwingJInternalFrame.jScrollPanelDatosDetalleCliente.getBorder();

				titledBorderdetallecliente.setTitle(titledBorderDetalleRecap.getTitle() + " -> Detalle Cliente");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallerecapLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallerecapLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DetalleRecapConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallerecapLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_detalle_clienteDetalleRecapBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallerecapLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetalleRecap.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDetalleRecap(this.getdetallerecap(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleRecap(this.detallerecap);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detallerecap =(DetalleRecap) this.detallerecapLogic.getDetalleRecaps().toArray()[this.jTableDatosDetalleRecap.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.detallerecap =(DetalleRecap) this.detallerecaps.toArray()[this.jTableDatosDetalleRecap.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.detallerecap==null) {
						this.detallerecap = new DetalleRecap();
					}

					this.setVariablesFormularioToObjetoActualDetalleRecap(this.detallerecap,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleRecap(this.detallerecap);
				}

				if(this.detallerecap.getid_detalle_cliente()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_detalle_cliente = "+this.detallerecap.getid_detalle_cliente().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDetalleRecap(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallerecapLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallerecapLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DetalleRecapConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallerecapLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_clienteDetalleRecapActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
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


			TitledBorder titledBorderDetalleRecap=null;
			TitledBorder titledBordercliente=null;

			if(!this.jScrollPanelDatosDetalleRecap.getBorder().getClass().equals(EmptyBorder.class)) {
				titledBorderDetalleRecap=(TitledBorder)this.jScrollPanelDatosDetalleRecap.getBorder();
				titledBordercliente=(TitledBorder)this.clienteBeanSwingJInternalFrame.jScrollPanelDatosCliente.getBorder();

				titledBordercliente.setTitle(titledBorderDetalleRecap.getTitle() + " -> Cliente");
			}

			if(!Constantes.CON_VARIAS_VENTANAS) {
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
			}

			this.jDesktopPane.add(jinternalFrame);

			jinternalFrame.setSelected(true);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleRecapConstantesFunciones.CLASSNAME);
		}
	}

	public void jButtonid_clienteDetalleRecapUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallerecapLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisocliente=true;

			idTienePermisocliente=this.tienePermisosUsuarioEnPaginaWebDetalleRecap(ClienteConstantesFunciones.CLASSNAME);

			if(idTienePermisocliente) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetalleRecap.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosDetalleRecap.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosDetalleRecap.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallerecap =(DetalleRecap) this.detallerecapLogic.getDetalleRecaps().toArray()[this.jTableDatosDetalleRecap.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.detallerecap =(DetalleRecap) this.detallerecaps.toArray()[this.jTableDatosDetalleRecap.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualDetalleRecap(this.getdetallerecap(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysDetalleRecap(this.detallerecap);

				this.clienteBeanSwingJInternalFrame=new ClienteBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.clienteBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.clienteBeanSwingJInternalFrame.getClienteLogic().setConnexion(this.detallerecapLogic.getConnexion());

				if(this.detallerecap.getid_cliente()!=null) {
					this.clienteBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.clienteBeanSwingJInternalFrame.setIdActual(this.detallerecap.getid_cliente());
					this.clienteBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.clienteBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.clienteBeanSwingJInternalFrame.inicializarActualizarBindingTablaCliente();
				}

				JInternalFrameBase jinternalFrame =this.clienteBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderDetalleRecap=(TitledBorder)this.jScrollPanelDatosDetalleRecap.getBorder();
				TitledBorder titledBordercliente=(TitledBorder)this.clienteBeanSwingJInternalFrame.jScrollPanelDatosCliente.getBorder();

				titledBordercliente.setTitle(titledBorderDetalleRecap.getTitle() + " -> Cliente");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallerecapLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallerecapLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DetalleRecapConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallerecapLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_clienteDetalleRecapBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallerecapLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetalleRecap.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDetalleRecap(this.getdetallerecap(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleRecap(this.detallerecap);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detallerecap =(DetalleRecap) this.detallerecapLogic.getDetalleRecaps().toArray()[this.jTableDatosDetalleRecap.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.detallerecap =(DetalleRecap) this.detallerecaps.toArray()[this.jTableDatosDetalleRecap.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.detallerecap==null) {
						this.detallerecap = new DetalleRecap();
					}

					this.setVariablesFormularioToObjetoActualDetalleRecap(this.detallerecap,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleRecap(this.detallerecap);
				}

				if(this.detallerecap.getid_cliente()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_cliente = "+this.detallerecap.getid_cliente().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDetalleRecap(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallerecapLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallerecapLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DetalleRecapConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallerecapLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonvalorDetalleRecapBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallerecapLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetalleRecap.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDetalleRecap(this.getdetallerecap(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleRecap(this.detallerecap);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detallerecap =(DetalleRecap) this.detallerecapLogic.getDetalleRecaps().toArray()[this.jTableDatosDetalleRecap.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.detallerecap =(DetalleRecap) this.detallerecaps.toArray()[this.jTableDatosDetalleRecap.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.detallerecap==null) {
						this.detallerecap = new DetalleRecap();
					}

					this.setVariablesFormularioToObjetoActualDetalleRecap(this.detallerecap,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleRecap(this.detallerecap);
				}

				if(this.detallerecap.getvalor()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where valor = "+this.detallerecap.getvalor().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDetalleRecap(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallerecapLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallerecapLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DetalleRecapConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallerecapLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoniva_porcentajeDetalleRecapBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallerecapLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetalleRecap.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDetalleRecap(this.getdetallerecap(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleRecap(this.detallerecap);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detallerecap =(DetalleRecap) this.detallerecapLogic.getDetalleRecaps().toArray()[this.jTableDatosDetalleRecap.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.detallerecap =(DetalleRecap) this.detallerecaps.toArray()[this.jTableDatosDetalleRecap.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.detallerecap==null) {
						this.detallerecap = new DetalleRecap();
					}

					this.setVariablesFormularioToObjetoActualDetalleRecap(this.detallerecap,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleRecap(this.detallerecap);
				}

				if(this.detallerecap.getiva_porcentaje()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where iva_porcentaje = "+this.detallerecap.getiva_porcentaje().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDetalleRecap(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallerecapLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallerecapLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DetalleRecapConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallerecapLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtontotalDetalleRecapBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallerecapLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetalleRecap.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDetalleRecap(this.getdetallerecap(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleRecap(this.detallerecap);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detallerecap =(DetalleRecap) this.detallerecapLogic.getDetalleRecaps().toArray()[this.jTableDatosDetalleRecap.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.detallerecap =(DetalleRecap) this.detallerecaps.toArray()[this.jTableDatosDetalleRecap.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.detallerecap==null) {
						this.detallerecap = new DetalleRecap();
					}

					this.setVariablesFormularioToObjetoActualDetalleRecap(this.detallerecap,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleRecap(this.detallerecap);
				}

				if(this.detallerecap.gettotal()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where total = "+this.detallerecap.gettotal().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDetalleRecap(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallerecapLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallerecapLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DetalleRecapConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallerecapLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdClienteDetalleRecapActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallerecapLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingDetalleRecap(false,false);

			this.getDetalleRecapsFK_IdCliente();

			this.inicializarActualizarBindingDetalleRecap(false);

			//if(DetalleRecapBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingDetalleRecap(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallerecapLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallerecapLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DetalleRecapConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallerecapLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdDetalleClienteDetalleRecapActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallerecapLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingDetalleRecap(false,false);

			this.getDetalleRecapsFK_IdDetalleCliente();

			this.inicializarActualizarBindingDetalleRecap(false);

			//if(DetalleRecapBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingDetalleRecap(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallerecapLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallerecapLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DetalleRecapConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallerecapLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEjercicioDetalleRecapActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallerecapLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingDetalleRecap(false,false);

			this.getDetalleRecapsFK_IdEjercicio();

			this.inicializarActualizarBindingDetalleRecap(false);

			//if(DetalleRecapBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingDetalleRecap(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallerecapLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallerecapLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DetalleRecapConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallerecapLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaDetalleRecapActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallerecapLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingDetalleRecap(false,false);

			this.getDetalleRecapsFK_IdEmpresa();

			this.inicializarActualizarBindingDetalleRecap(false);

			//if(DetalleRecapBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingDetalleRecap(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallerecapLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallerecapLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DetalleRecapConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallerecapLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdRecapDetalleRecapActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallerecapLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingDetalleRecap(false,false);

			this.getDetalleRecapsFK_IdRecap();

			this.inicializarActualizarBindingDetalleRecap(false);

			//if(DetalleRecapBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingDetalleRecap(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallerecapLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallerecapLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DetalleRecapConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallerecapLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdSucursalDetalleRecapActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallerecapLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingDetalleRecap(false,false);

			this.getDetalleRecapsFK_IdSucursal();

			this.inicializarActualizarBindingDetalleRecap(false);

			//if(DetalleRecapBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingDetalleRecap(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallerecapLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallerecapLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DetalleRecapConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallerecapLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameDetalleRecap() {
		if(this.jInternalFrameDetalleFormDetalleRecap!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormDetalleRecap!=null) {
			this.jInternalFrameDetalleFormDetalleRecap.setVisible(false);	    			
			this.jInternalFrameDetalleFormDetalleRecap.dispose();
			this.jInternalFrameDetalleFormDetalleRecap=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoDetalleRecap!=null) {
			this.jInternalFrameReporteDinamicoDetalleRecap.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoDetalleRecap.dispose();
			this.jInternalFrameReporteDinamicoDetalleRecap=null;
		}
		
		if(this.jInternalFrameImportacionDetalleRecap!=null) {
			this.jInternalFrameImportacionDetalleRecap.setVisible(false);	    			
			this.jInternalFrameImportacionDetalleRecap.dispose();
			this.jInternalFrameImportacionDetalleRecap=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessDetalleRecap();
			
			DetalleRecapBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.detallerecap,new Object(),this.detallerecapParameterGeneral,this.detallerecapReturnGeneral);
			
			
			if(sTipo.equals("NuevoDetalleRecap")) {
				jButtonNuevoDetalleRecapActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarDetalleRecap")) {
				jButtonDuplicarDetalleRecapActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarDetalleRecap")) {
				jButtonCopiarDetalleRecapActionPerformed(evt);
			} else if(sTipo.equals("VerFormDetalleRecap")) {
				jButtonVerFormDetalleRecapActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarDetalleRecap")) {
				jButtonNuevoDetalleRecapActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarDetalleRecap")) {
				jButtonDuplicarDetalleRecapActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoDetalleRecap")) {
				jButtonNuevoDetalleRecapActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarDetalleRecap")) {
				jButtonDuplicarDetalleRecapActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesDetalleRecap")) {
				jButtonNuevoDetalleRecapActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarDetalleRecap")) {
				jButtonNuevoDetalleRecapActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesDetalleRecap")) {
				jButtonNuevoDetalleRecapActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarDetalleRecap")) {
				jButtonModificarDetalleRecapActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarDetalleRecap")) {
				jButtonModificarDetalleRecapActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarDetalleRecap")) {
				jButtonModificarDetalleRecapActionPerformed(evt);
			} else if(sTipo.equals("ActualizarDetalleRecap")) {
				jButtonActualizarDetalleRecapActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarDetalleRecap")) {
				jButtonActualizarDetalleRecapActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarDetalleRecap")) {
				jButtonActualizarDetalleRecapActionPerformed(evt);
			} else if(sTipo.equals("EliminarDetalleRecap")) {
				jButtonEliminarDetalleRecapActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarDetalleRecap")) {
				jButtonEliminarDetalleRecapActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarDetalleRecap")) {
				jButtonEliminarDetalleRecapActionPerformed(evt);
			} else if(sTipo.equals("CancelarDetalleRecap")) {
				jButtonCancelarDetalleRecapActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarDetalleRecap")) {
				jButtonCancelarDetalleRecapActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarDetalleRecap")) {
				jButtonCancelarDetalleRecapActionPerformed(evt);
			} else if(sTipo.equals("CerrarDetalleRecap")) {
				jButtonCerrarDetalleRecapActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarDetalleRecap")) {
				jButtonCerrarDetalleRecapActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarDetalleRecap")) {
				jButtonCerrarDetalleRecapActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarDetalleRecap")) {
				jButtonMostrarOcultarDetalleRecapActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarDetalleRecap")) {
				jButtonCancelarDetalleRecapActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosDetalleRecap")) {
				jButtonGuardarCambiosDetalleRecapActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarDetalleRecap")) {
				jButtonGuardarCambiosDetalleRecapActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarDetalleRecap")) {
				jButtonCopiarDetalleRecapActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarDetalleRecap")) {
				jButtonVerFormDetalleRecapActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosDetalleRecap")) {
				jButtonGuardarCambiosDetalleRecapActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarDetalleRecap")) {
				jButtonCopiarDetalleRecapActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormDetalleRecap")) {
				jButtonVerFormDetalleRecapActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaDetalleRecap")) {
				jButtonGuardarCambiosDetalleRecapActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarDetalleRecap")) {
				jButtonGuardarCambiosDetalleRecapActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaDetalleRecap")) {
				jButtonGuardarCambiosDetalleRecapActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionDetalleRecap")) {
				jButtonRecargarInformacionDetalleRecapActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarDetalleRecap")) {
				jButtonRecargarInformacionDetalleRecapActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionDetalleRecap")) {
				jButtonRecargarInformacionDetalleRecapActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresDetalleRecap")) {
				jButtonAnterioresDetalleRecapActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarDetalleRecap")) {
				jButtonAnterioresDetalleRecapActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreDetalleRecap")) {
				jButtonAnterioresDetalleRecapActionPerformed(evt);
			} else if(sTipo.equals("SiguientesDetalleRecap")) {
				jButtonSiguientesDetalleRecapActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarDetalleRecap")) {
				jButtonSiguientesDetalleRecapActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesDetalleRecap")) {
				jButtonSiguientesDetalleRecapActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByDetalleRecap") || sTipo.equals("MenuItemDetalleAbrirOrderByDetalleRecap")) {
				jButtonAbrirOrderByDetalleRecapActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarDetalleRecap") || sTipo.equals("MenuItemDetalleMostrarOcultarDetalleRecap")) {
				jButtonMostrarOcultarDetalleRecapActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosDetalleRecap")) {
				jButtonNuevoGuardarCambiosDetalleRecapActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarDetalleRecap")) {
				jButtonNuevoGuardarCambiosDetalleRecapActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosDetalleRecap")) {
				jButtonNuevoGuardarCambiosDetalleRecapActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoDetalleRecap")) {
				jButtonCerrarReporteDinamicoDetalleRecapActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoDetalleRecap")) {
				jButtonGenerarReporteDinamicoDetalleRecapActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoDetalleRecap")) {
				
				jButtonGenerarExcelReporteDinamicoDetalleRecapActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionDetalleRecap")) {
				jButtonCerrarImportacionDetalleRecapActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionDetalleRecap")) {
				
				jButtonGenerarImportacionDetalleRecapActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionDetalleRecap")) {
				
				jButtonAbrirImportacionDetalleRecapActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesDetalleRecap")) {
				jComboBoxTiposAccionesDetalleRecapActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesDetalleRecap")) {
				jComboBoxTiposRelacionesDetalleRecapActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioDetalleRecap")) {
				jComboBoxTiposAccionesDetalleRecapActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarDetalleRecap")) {
				
				jComboBoxTiposSeleccionarDetalleRecapActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralDetalleRecap")) {
				jTextFieldValorCampoGeneralDetalleRecapActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByDetalleRecap")) {
				jButtonAbrirOrderByDetalleRecapActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarDetalleRecap")) {
				jButtonAbrirOrderByDetalleRecapActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByDetalleRecap")) {
				jButtonCerrarOrderByDetalleRecapActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idDetalleRecapBusqueda")) {
				this.jButtonidDetalleRecapBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_recapDetalleRecapUpdate")) {
				this.jButtonid_recapDetalleRecapUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_recapDetalleRecapBusqueda")) {
				this.jButtonid_recapDetalleRecapBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaDetalleRecapUpdate")) {
				this.jButtonid_empresaDetalleRecapUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaDetalleRecapBusqueda")) {
				this.jButtonid_empresaDetalleRecapBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalDetalleRecapUpdate")) {
				this.jButtonid_sucursalDetalleRecapUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalDetalleRecapBusqueda")) {
				this.jButtonid_sucursalDetalleRecapBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_ejercicioDetalleRecapUpdate")) {
				this.jButtonid_ejercicioDetalleRecapUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_ejercicioDetalleRecapBusqueda")) {
				this.jButtonid_ejercicioDetalleRecapBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_detalle_clienteDetalleRecapUpdate")) {
				this.jButtonid_detalle_clienteDetalleRecapUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_detalle_clienteDetalleRecapBusqueda")) {
				this.jButtonid_detalle_clienteDetalleRecapBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_clienteDetalleRecap")) {
				this.jButtonid_clienteDetalleRecapActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_clienteDetalleRecapUpdate")) {
				this.jButtonid_clienteDetalleRecapUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_clienteDetalleRecapBusqueda")) {
				this.jButtonid_clienteDetalleRecapBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("valorDetalleRecapBusqueda")) {
				this.jButtonvalorDetalleRecapBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("iva_porcentajeDetalleRecapBusqueda")) {
				this.jButtoniva_porcentajeDetalleRecapBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("totalDetalleRecapBusqueda")) {
				this.jButtontotalDetalleRecapBusquedaActionPerformed(evt);
			}
			
			
			else if(sTipo.equals("id_clienteDetalleRecap")) {
				this.jButtonid_clienteDetalleRecapActionPerformed(evt);
			}
			
			
			else if(sTipo.equals("FK_IdClienteDetalleRecap")) {
				this.jButtonFK_IdClienteDetalleRecapActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdDetalleClienteDetalleRecap")) {
				this.jButtonFK_IdDetalleClienteDetalleRecapActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdRecapDetalleRecap")) {
				this.jButtonFK_IdRecapDetalleRecapActionPerformed(evt);
			}
			
			;
			
			
			DetalleRecapBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.detallerecap,new Object(),this.detallerecapParameterGeneral,this.detallerecapReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleRecapConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessDetalleRecap();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaDetalleRecapActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.detallerecap);
				
				this.actualizarInformacion("INFO_PADRE",false,this.detallerecap);
				
				DetalleRecapBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detallerecap,new Object(),this.detallerecapParameterGeneral,this.detallerecapReturnGeneral);
				
				


				
				DetalleRecapBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detallerecap,new Object(),this.detallerecapParameterGeneral,this.detallerecapReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DetalleRecap.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DetalleRecap.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,DetalleRecapConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			DetalleRecap detallerecapLocal=null;
			
			if(!this.getEsControlTabla()) {
				detallerecapLocal=this.detallerecap;
			} else {
				detallerecapLocal=this.detallerecapAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleRecapConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.detallerecap);
				
				this.actualizarInformacion("INFO_PADRE",false,this.detallerecap);
				
				DetalleRecapBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detallerecap,new Object(),this.detallerecapParameterGeneral,this.detallerecapReturnGeneral);
							
				
				


				
				DetalleRecapBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detallerecap,new Object(),this.detallerecapParameterGeneral,this.detallerecapReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DetalleRecap.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DetalleRecap.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleRecapConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDetalleRecapActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosDetalleRecap.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallerecapAnterior =(DetalleRecap) this.detallerecapLogic.getDetalleRecaps().toArray()[this.jTableDatosDetalleRecap.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.detallerecapAnterior =(DetalleRecap) this.detallerecaps.toArray()[this.jTableDatosDetalleRecap.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleRecapConstantesFunciones.CLASSNAME);
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
			
			DetalleRecapBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detallerecap,new Object(),this.detallerecapParameterGeneral,this.detallerecapReturnGeneral);
			
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
			
			


			
			DetalleRecapBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detallerecap,new Object(),this.detallerecapParameterGeneral,this.detallerecapReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleRecapConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleRecapConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleRecapConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaDetalleRecapActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.detallerecap);
				
				this.actualizarInformacion("INFO_PADRE",false,this.detallerecap);
				
				DetalleRecapBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detallerecap,new Object(),this.detallerecapParameterGeneral,this.detallerecapReturnGeneral);
								
						
				


				
				DetalleRecapBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detallerecap,new Object(),this.detallerecapParameterGeneral,this.detallerecapReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DetalleRecap.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DetalleRecap.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleRecapConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.detallerecap);
				
				this.actualizarInformacion("INFO_PADRE",false,this.detallerecap);
				
				DetalleRecapBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detallerecap,new Object(),this.detallerecapParameterGeneral,this.detallerecapReturnGeneral);
								
				
				


				
				DetalleRecapBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detallerecap,new Object(),this.detallerecapParameterGeneral,this.detallerecapReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DetalleRecap.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DetalleRecap.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleRecapConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDetalleRecapActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosDetalleRecap.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallerecapAnterior =(DetalleRecap) this.detallerecapLogic.getDetalleRecaps().toArray()[this.jTableDatosDetalleRecap.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.detallerecapAnterior =(DetalleRecap) this.detallerecaps.toArray()[this.jTableDatosDetalleRecap.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleRecapConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.detallerecap);
				
				this.actualizarInformacion("INFO_PADRE",false,this.detallerecap);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleRecapConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDetalleRecapActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosDetalleRecap.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallerecapAnterior =(DetalleRecap) this.detallerecapLogic.getDetalleRecaps().toArray()[this.jTableDatosDetalleRecap.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.detallerecapAnterior =(DetalleRecap) this.detallerecaps.toArray()[this.jTableDatosDetalleRecap.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleRecapConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDetalleRecapActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.detallerecap);
			
			this.actualizarInformacion("INFO_PADRE",false,this.detallerecap);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleRecapConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.detallerecap);
				
				this.actualizarInformacion("INFO_PADRE",false,this.detallerecap);
				
				DetalleRecapBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detallerecap,new Object(),this.detallerecapParameterGeneral,this.detallerecapReturnGeneral);
							
				
				


				
				DetalleRecapBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detallerecap,new Object(),this.detallerecapParameterGeneral,this.detallerecapReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DetalleRecap.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DetalleRecap.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleRecapConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaDetalleRecapActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosDetalleRecap.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detallerecapAnterior =(DetalleRecap) this.detallerecapLogic.getDetalleRecaps().toArray()[this.jTableDatosDetalleRecap.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.detallerecapAnterior =(DetalleRecap) this.detallerecaps.toArray()[this.jTableDatosDetalleRecap.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleRecapConstantesFunciones.CLASSNAME);
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
			
			DetalleRecapBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detallerecap,new Object(),this.detallerecapParameterGeneral,this.detallerecapReturnGeneral);
			
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
			
			


			
			DetalleRecapBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detallerecap,new Object(),this.detallerecapParameterGeneral,this.detallerecapReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleRecapConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleRecapConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleRecapConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDetalleRecapActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.detallerecap);
			
			this.actualizarInformacion("INFO_PADRE",false,this.detallerecap);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleRecapConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.detallerecap);
				
				this.actualizarInformacion("INFO_PADRE",false,this.detallerecap);
				
				DetalleRecapBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detallerecap,new Object(),this.detallerecapParameterGeneral,this.detallerecapReturnGeneral);
								
				
				


				
				DetalleRecapBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detallerecap,new Object(),this.detallerecapParameterGeneral,this.detallerecapReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DetalleRecap.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DetalleRecap.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleRecapConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDetalleRecapActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosDetalleRecap.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallerecapAnterior =(DetalleRecap) this.detallerecapLogic.getDetalleRecaps().toArray()[this.jTableDatosDetalleRecap.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.detallerecapAnterior =(DetalleRecap) this.detallerecaps.toArray()[this.jTableDatosDetalleRecap.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleRecapConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDetalleRecapActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.detallerecap);
			
			this.actualizarInformacion("INFO_PADRE",false,this.detallerecap);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleRecapConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaDetalleRecapActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.detallerecap);
				
				this.actualizarInformacion("INFO_PADRE",false,this.detallerecap);
				
				DetalleRecapBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.detallerecap,new Object(),this.detallerecapParameterGeneral,this.detallerecapReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosDetalleRecap")) {
					jCheckBoxSeleccionarTodosDetalleRecapItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosDetalleRecap")) {
					jCheckBoxSeleccionadosDetalleRecapItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarDetalleRecap")) {
					
				}
				
				


				
				
				DetalleRecapBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.detallerecap,new Object(),this.detallerecapParameterGeneral,this.detallerecapReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DetalleRecap.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DetalleRecap.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleRecapConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.detallerecap);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.detallerecap);
				
				DetalleRecapBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.detallerecap,new Object(),this.detallerecapParameterGeneral,this.detallerecapReturnGeneral);
												
				
				


				
				
				DetalleRecapBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.detallerecap,new Object(),this.detallerecapParameterGeneral,this.detallerecapReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DetalleRecap.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DetalleRecap.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleRecapConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaDetalleRecapActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosDetalleRecap.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detallerecapAnterior =(DetalleRecap) this.detallerecapLogic.getDetalleRecaps().toArray()[this.jTableDatosDetalleRecap.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.detallerecapAnterior =(DetalleRecap) this.detallerecaps.toArray()[this.jTableDatosDetalleRecap.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleRecapConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaDetalleRecapActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.detallerecap);
				
				this.actualizarInformacion("INFO_PADRE",false,this.detallerecap);
				
				DetalleRecapBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.detallerecap,new Object(),this.detallerecapParameterGeneral,this.detallerecapReturnGeneral);
				
				
				DetalleRecapBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.detallerecap,new Object(),this.detallerecapParameterGeneral,this.detallerecapReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleRecapConstantesFunciones.CLASSNAME);
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
			
			DetalleRecapBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.detallerecap,new Object(),this.detallerecapParameterGeneral,this.detallerecapReturnGeneral);
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
			
			


			
			DetalleRecapBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detallerecap,new Object(),this.detallerecapParameterGeneral,this.detallerecapReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleRecapConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaDetalleRecapActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.detallerecap);
				
				this.actualizarInformacion("INFO_PADRE",false,this.detallerecap);
				
				DetalleRecapBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.detallerecap,new Object(),this.detallerecapParameterGeneral,this.detallerecapReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				DetalleRecapBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detallerecap,new Object(),this.detallerecapParameterGeneral,this.detallerecapReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DetalleRecap.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DetalleRecap.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleRecapConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.detallerecap);
				
				this.actualizarInformacion("INFO_PADRE",false,this.detallerecap);
				
				DetalleRecapBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.detallerecap,new Object(),this.detallerecapParameterGeneral,this.detallerecapReturnGeneral);
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
				
				


				
				DetalleRecapBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detallerecap,new Object(),this.detallerecapParameterGeneral,this.detallerecapReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DetalleRecap.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DetalleRecap.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleRecapConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDetalleRecapActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosDetalleRecap.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallerecapAnterior =(DetalleRecap) this.detallerecapLogic.getDetalleRecaps().toArray()[this.jTableDatosDetalleRecap.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.detallerecapAnterior =(DetalleRecap) this.detallerecaps.toArray()[this.jTableDatosDetalleRecap.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleRecapConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				DetalleRecapBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detallerecap,new Object(),this.detallerecapParameterGeneral,this.detallerecapReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarDetalleRecap")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosDetalleRecapListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosDetalleRecap.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.detallerecap =(DetalleRecap) this.detallerecapLogic.getDetalleRecaps().toArray()[this.jTableDatosDetalleRecap.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.detallerecap =(DetalleRecap) this.detallerecaps.toArray()[this.jTableDatosDetalleRecap.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.detallerecap);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarDetalleRecap")) {
				
				}
				
				DetalleRecapBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detallerecap,new Object(),this.detallerecapParameterGeneral,this.detallerecapReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleRecapConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			DetalleRecapBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.detallerecap,new Object(),this.detallerecapParameterGeneral,this.detallerecapReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarDetalleRecap")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosDetalleRecap.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarDetalleRecap")) {
			
			}
			
			DetalleRecapBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.detallerecap,new Object(),this.detallerecapParameterGeneral,this.detallerecapReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleRecapConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessDetalleRecap();
			
			DetalleRecapBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.detallerecap,new Object(),this.detallerecapParameterGeneral,this.detallerecapReturnGeneral);
			
			if(sTipo.equals("NuevoDetalleRecap")) {
				jButtonNuevoDetalleRecapActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarDetalleRecap")) {
				jButtonDuplicarDetalleRecapActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarDetalleRecap")) {
				jButtonCopiarDetalleRecapActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormDetalleRecap")) {
				jButtonVerFormDetalleRecapActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesDetalleRecap")) {
				jButtonNuevoDetalleRecapActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarDetalleRecap")) {
				jButtonModificarDetalleRecapActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarDetalleRecap")) {
				jButtonActualizarDetalleRecapActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarDetalleRecap")) {
				jButtonEliminarDetalleRecapActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaDetalleRecap")) {
				jButtonGuardarCambiosDetalleRecapActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarDetalleRecap")) {
				jButtonCancelarDetalleRecapActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarDetalleRecap")) {
				jButtonCerrarDetalleRecapActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosDetalleRecap")) {
				jButtonGuardarCambiosDetalleRecapActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosDetalleRecap")) {
				jButtonNuevoGuardarCambiosDetalleRecapActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByDetalleRecap")) {
				jButtonAbrirOrderByDetalleRecapActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionDetalleRecap")) {
				jButtonRecargarInformacionDetalleRecapActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresDetalleRecap")) {
				jButtonAnterioresDetalleRecapActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesDetalleRecap")) {
				jButtonSiguientesDetalleRecapActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idDetalleRecapBusqueda")) {
				this.jButtonidDetalleRecapBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_recapDetalleRecapUpdate")) {
				this.jButtonid_recapDetalleRecapUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_recapDetalleRecapBusqueda")) {
				this.jButtonid_recapDetalleRecapBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaDetalleRecapUpdate")) {
				this.jButtonid_empresaDetalleRecapUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaDetalleRecapBusqueda")) {
				this.jButtonid_empresaDetalleRecapBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalDetalleRecapUpdate")) {
				this.jButtonid_sucursalDetalleRecapUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalDetalleRecapBusqueda")) {
				this.jButtonid_sucursalDetalleRecapBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_ejercicioDetalleRecapUpdate")) {
				this.jButtonid_ejercicioDetalleRecapUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_ejercicioDetalleRecapBusqueda")) {
				this.jButtonid_ejercicioDetalleRecapBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_detalle_clienteDetalleRecapUpdate")) {
				this.jButtonid_detalle_clienteDetalleRecapUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_detalle_clienteDetalleRecapBusqueda")) {
				this.jButtonid_detalle_clienteDetalleRecapBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_clienteDetalleRecap")) {
				this.jButtonid_clienteDetalleRecapActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_clienteDetalleRecapUpdate")) {
				this.jButtonid_clienteDetalleRecapUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_clienteDetalleRecapBusqueda")) {
				this.jButtonid_clienteDetalleRecapBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("valorDetalleRecapBusqueda")) {
				this.jButtonvalorDetalleRecapBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("iva_porcentajeDetalleRecapBusqueda")) {
				this.jButtoniva_porcentajeDetalleRecapBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("totalDetalleRecapBusqueda")) {
				this.jButtontotalDetalleRecapBusquedaActionPerformed(evt);
			}
			
			DetalleRecapBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.detallerecap,new Object(),this.detallerecapParameterGeneral,this.detallerecapReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleRecapConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessDetalleRecap();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			DetalleRecapBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.detallerecap,new Object(),this.detallerecapParameterGeneral,this.detallerecapReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameDetalleRecap")) {
				closingInternalFrameDetalleRecap();
				
			} else if(sTipo.equals("jButtonCancelarDetalleRecap")) {
				JInternalFrameBase jInternalFrameDetalleFormDetalleRecap = (JInternalFrameBase)evt.getSource();
	            	
	            DetalleRecapBeanSwingJInternalFrame jInternalFrameParent=(DetalleRecapBeanSwingJInternalFrame)jInternalFrameDetalleFormDetalleRecap.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarDetalleRecapActionPerformed(null);
			}
			
			DetalleRecapBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.detallerecap,new Object(),this.detallerecapParameterGeneral,this.detallerecapReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleRecapConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormDetalleRecap(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormDetalleRecap(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormDetalleRecap(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.detallerecap)) {
			if(!esControlTabla) {
				if(DetalleRecapJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualDetalleRecap(this.detallerecap,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleRecap(this.detallerecap);			
				}
				
				if(this.detallerecapSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualDetalleRecap(this.detallerecap,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.detallerecapReturnGeneral=detallerecapLogic.procesarEventosDetalleRecapsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.detallerecapLogic.getDetalleRecaps(),this.detallerecap,this.detallerecapParameterGeneral,this.isEsNuevoDetalleRecap,classes);//this.detallerecapLogic.getDetalleRecap()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanDetalleRecap(this.detallerecapReturnGeneral,this.detallerecapBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.detallerecapSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanDetalleRecap(classes,this.detallerecapReturnGeneral,this.detallerecapBean,false);
					}
						
					if(this.detallerecapReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyDetalleRecap(this.detallerecapReturnGeneral.getDetalleRecap());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioDetalleRecap(this.detallerecapReturnGeneral.getDetalleRecap());	
					}
						
					if(this.detallerecapReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioDetalleRecap(this.detallerecapReturnGeneral.getDetalleRecap(),classes);//this.detallerecapBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioDetalleRecap(this.detallerecap,classes);//this.detallerecapBean);									
				}
			
				if(DetalleRecapJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualDetalleRecap(this.detallerecap,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleRecap(this.detallerecap);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.detallerecapAnterior!=null) {
						this.detallerecap=this.detallerecapAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.detallerecapReturnGeneral=detallerecapLogic.procesarEventosDetalleRecapsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.detallerecapLogic.getDetalleRecaps(),this.detallerecap,this.detallerecapParameterGeneral,this.isEsNuevoDetalleRecap,classes);//this.detallerecapLogic.getDetalleRecap()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.detallerecapSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.detallerecapSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.detallerecapReturnGeneral.getDetalleRecap(),detallerecapLogic.getDetalleRecaps());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.detallerecapReturnGeneral.getDetalleRecap(),this.detallerecaps);
				}
				//ARCHITECTURE
				
				//this.jTableDatosDetalleRecap.repaint();
				
				//((AbstractTableModel) this.jTableDatosDetalleRecap.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosDetalleRecap();
			}
		}
	}
	
	public void actualizarVisualTableDatosDetalleRecap() throws Exception {
		
		DetalleRecapModel detallerecapModel=(DetalleRecapModel)this.jTableDatosDetalleRecap.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			detallerecapModel.detallerecaps=this.detallerecapLogic.getDetalleRecaps();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			detallerecapModel.detallerecaps=this.detallerecaps;
		}
		
		
		((DetalleRecapModel) this.jTableDatosDetalleRecap.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaDetalleRecap() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getdetallerecapAnterior(),this.detallerecapLogic.getDetalleRecaps());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getdetallerecapAnterior(),this.detallerecaps);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosDetalleRecap();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioDetalleRecap(DetalleRecap detallerecap,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleRecapConstantesFunciones.CLASSNAME);
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
										
				DetalleRecapBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.detallerecap,new Object(),generalEntityParameterGeneral,this.detallerecapReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.detallerecapSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=DetalleRecapConstantesFunciones.getClassesRelationshipsOfDetalleRecap(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=DetalleRecapConstantesFunciones.getClassesRelationshipsFromStringsOfDetalleRecap(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormDetalleRecap(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				DetalleRecapBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.detallerecap,new Object(),generalEntityParameterGeneral,this.detallerecapReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleRecapConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioDetalleRecap(DetalleRecapBean detallerecapBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleRecapConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanDetalleRecap(ArrayList<Classe> classes,DetalleRecapReturnGeneral detallerecapReturnGeneral,DetalleRecapBean detallerecapBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualDetalleRecap(DetalleRecap detallerecap,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.detallerecap)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormDetalleRecap = new DetalleRecapDetalleFormJInternalFrame(jDesktopPane,this.detallerecapSessionBean.getConGuardarRelaciones(),this.detallerecapSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormDetalleRecap);
		this.jInternalFrameDetalleFormDetalleRecap.setVisible(false);
		this.jInternalFrameDetalleFormDetalleRecap.setSelected(false);						
		
		this.jInternalFrameDetalleFormDetalleRecap.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormDetalleRecap.detallerecapLogic=this.detallerecapLogic;
		
		this.cargarCombosFrameForeignKeyDetalleRecap("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleDetalleRecap();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleDetalleRecap();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyDetalleRecap("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyDetalleRecap();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormDetalleRecap.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarDetalleRecap"));
		
		this.jInternalFrameDetalleFormDetalleRecap.jButtonModificarDetalleRecap.addActionListener(new ButtonActionListener(this,"ModificarDetalleRecap"));

		
		this.jInternalFrameDetalleFormDetalleRecap.jButtonModificarToolBarDetalleRecap.addActionListener(new ButtonActionListener(this,"ModificarToolBarDetalleRecap"));
					
		this.jInternalFrameDetalleFormDetalleRecap.jMenuItemModificarDetalleRecap.addActionListener(new ButtonActionListener(this,"MenuItemModificarDetalleRecap"));		
		
		
		
		this.jInternalFrameDetalleFormDetalleRecap.jButtonActualizarDetalleRecap.addActionListener (new ButtonActionListener(this,"ActualizarDetalleRecap"));
		
		
		this.jInternalFrameDetalleFormDetalleRecap.jButtonActualizarToolBarDetalleRecap.addActionListener(new ButtonActionListener(this,"ActualizarToolBarDetalleRecap"));
						
		this.jInternalFrameDetalleFormDetalleRecap.jMenuItemActualizarDetalleRecap.addActionListener (new ButtonActionListener(this,"MenuItemActualizarDetalleRecap"));		
		
		
		
		this.jInternalFrameDetalleFormDetalleRecap.jButtonEliminarDetalleRecap.addActionListener (new ButtonActionListener(this,"EliminarDetalleRecap"));
		
		
		this.jInternalFrameDetalleFormDetalleRecap.jButtonEliminarToolBarDetalleRecap.addActionListener (new ButtonActionListener(this,"EliminarToolBarDetalleRecap"));
								
		this.jInternalFrameDetalleFormDetalleRecap.jMenuItemEliminarDetalleRecap.addActionListener (new ButtonActionListener(this,"MenuItemEliminarDetalleRecap"));		
		
		
		
		this.jInternalFrameDetalleFormDetalleRecap.jButtonCancelarDetalleRecap.addActionListener (new ButtonActionListener(this,"CancelarDetalleRecap"));
		
		
		this.jInternalFrameDetalleFormDetalleRecap.jButtonCancelarToolBarDetalleRecap.addActionListener (new ButtonActionListener(this,"CancelarToolBarDetalleRecap"));
					
		this.jInternalFrameDetalleFormDetalleRecap.jMenuItemCancelarDetalleRecap.addActionListener (new ButtonActionListener(this,"MenuItemCancelarDetalleRecap"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormDetalleRecap.jMenuItemDetalleCerrarDetalleRecap.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarDetalleRecap"));		
		
		
		
		this.jInternalFrameDetalleFormDetalleRecap.jButtonGuardarCambiosToolBarDetalleRecap.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarDetalleRecap"));
		
		
		
		this.jInternalFrameDetalleFormDetalleRecap.jButtonGuardarCambiosToolBarDetalleRecap.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarDetalleRecap"));
		
		
		
		this.jInternalFrameDetalleFormDetalleRecap.jComboBoxTiposAccionesFormularioDetalleRecap.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioDetalleRecap"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleRecap.jButtonidDetalleRecapBusqueda.addActionListener(new ButtonActionListener(this,"idDetalleRecapBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetalleRecap.jButtonid_recapDetalleRecapUpdate.addActionListener(new ButtonActionListener(this,"id_recapDetalleRecapUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleRecap.jButtonid_recapDetalleRecapBusqueda.addActionListener(new ButtonActionListener(this,"id_recapDetalleRecapBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetalleRecap.jButtonid_empresaDetalleRecapUpdate.addActionListener(new ButtonActionListener(this,"id_empresaDetalleRecapUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleRecap.jButtonid_empresaDetalleRecapBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaDetalleRecapBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetalleRecap.jButtonid_sucursalDetalleRecapUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalDetalleRecapUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleRecap.jButtonid_sucursalDetalleRecapBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalDetalleRecapBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetalleRecap.jButtonid_ejercicioDetalleRecapUpdate.addActionListener(new ButtonActionListener(this,"id_ejercicioDetalleRecapUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleRecap.jButtonid_ejercicioDetalleRecapBusqueda.addActionListener(new ButtonActionListener(this,"id_ejercicioDetalleRecapBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetalleRecap.jButtonid_detalle_clienteDetalleRecapUpdate.addActionListener(new ButtonActionListener(this,"id_detalle_clienteDetalleRecapUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleRecap.jButtonid_detalle_clienteDetalleRecapBusqueda.addActionListener(new ButtonActionListener(this,"id_detalle_clienteDetalleRecapBusqueda"));
		//jButtonid_clienteDetalleRecap.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_clienteDetalleRecapActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormDetalleRecap.jButtonid_clienteDetalleRecap.addActionListener(new ButtonActionListener(this,"id_clienteDetalleRecap"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetalleRecap.jButtonid_clienteDetalleRecapUpdate.addActionListener(new ButtonActionListener(this,"id_clienteDetalleRecapUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleRecap.jButtonid_clienteDetalleRecapBusqueda.addActionListener(new ButtonActionListener(this,"id_clienteDetalleRecapBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleRecap.jButtonvalorDetalleRecapBusqueda.addActionListener(new ButtonActionListener(this,"valorDetalleRecapBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleRecap.jButtoniva_porcentajeDetalleRecapBusqueda.addActionListener(new ButtonActionListener(this,"iva_porcentajeDetalleRecapBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleRecap.jButtontotalDetalleRecapBusqueda.addActionListener(new ButtonActionListener(this,"totalDetalleRecapBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormDetalleRecap.jTabbedPaneRelacionesDetalleRecap.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesDetalleRecap"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameDetalleRecap"));
		
		if(this.jInternalFrameDetalleFormDetalleRecap!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetalleRecap.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarDetalleRecap"));
		}
		
		this.jTableDatosDetalleRecap.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarDetalleRecap"));
		
		this.jTableDatosDetalleRecap.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarDetalleRecap"));
		
		this.jButtonNuevoDetalleRecap.addActionListener(new ButtonActionListener(this,"NuevoDetalleRecap"));
		
		this.jButtonDuplicarDetalleRecap.addActionListener(new ButtonActionListener(this,"DuplicarDetalleRecap"));
		
		this.jButtonCopiarDetalleRecap.addActionListener(new ButtonActionListener(this,"CopiarDetalleRecap"));
		
		this.jButtonVerFormDetalleRecap.addActionListener(new ButtonActionListener(this,"VerFormDetalleRecap"));
		
		
		this.jButtonNuevoToolBarDetalleRecap.addActionListener(new ButtonActionListener(this,"NuevoToolBarDetalleRecap"));
			
		this.jButtonDuplicarToolBarDetalleRecap.addActionListener(new ButtonActionListener(this,"DuplicarToolBarDetalleRecap"));
			
		this.jMenuItemNuevoDetalleRecap.addActionListener (new ButtonActionListener(this,"MenuItemNuevoDetalleRecap"));
			
		this.jMenuItemDuplicarDetalleRecap.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarDetalleRecap"));		
		
		
		this.jButtonNuevoRelacionesDetalleRecap.addActionListener (new ButtonActionListener(this,"NuevoRelacionesDetalleRecap"));
		
		
		this.jButtonNuevoRelacionesToolBarDetalleRecap.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarDetalleRecap"));
			
		this.jMenuItemNuevoRelacionesDetalleRecap.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesDetalleRecap"));		
		
		
		if(this.jInternalFrameDetalleFormDetalleRecap!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetalleRecap.jButtonModificarDetalleRecap.addActionListener(new ButtonActionListener(this,"ModificarDetalleRecap"));
		}
		
		
		if(this.jInternalFrameDetalleFormDetalleRecap!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetalleRecap.jButtonModificarToolBarDetalleRecap.addActionListener(new ButtonActionListener(this,"ModificarToolBarDetalleRecap"));
			
			this.jInternalFrameDetalleFormDetalleRecap.jMenuItemModificarDetalleRecap.addActionListener(new ButtonActionListener(this,"MenuItemModificarDetalleRecap"));		
		}
		
		
		if(this.jInternalFrameDetalleFormDetalleRecap!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormDetalleRecap.jButtonActualizarDetalleRecap.addActionListener (new ButtonActionListener(this,"ActualizarDetalleRecap"));
		}
		
		
		if(this.jInternalFrameDetalleFormDetalleRecap!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetalleRecap.jButtonActualizarToolBarDetalleRecap.addActionListener(new ButtonActionListener(this,"ActualizarToolBarDetalleRecap"));
				
			this.jInternalFrameDetalleFormDetalleRecap.jMenuItemActualizarDetalleRecap.addActionListener (new ButtonActionListener(this,"MenuItemActualizarDetalleRecap"));		
		}
		
		
		if(this.jInternalFrameDetalleFormDetalleRecap!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetalleRecap.jButtonEliminarDetalleRecap.addActionListener (new ButtonActionListener(this,"EliminarDetalleRecap"));
		}
		
		
		if(this.jInternalFrameDetalleFormDetalleRecap!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetalleRecap.jButtonEliminarToolBarDetalleRecap.addActionListener (new ButtonActionListener(this,"EliminarToolBarDetalleRecap"));
						
			this.jInternalFrameDetalleFormDetalleRecap.jMenuItemEliminarDetalleRecap.addActionListener (new ButtonActionListener(this,"MenuItemEliminarDetalleRecap"));		
		}
		
		
		if(this.jInternalFrameDetalleFormDetalleRecap!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetalleRecap.jButtonCancelarDetalleRecap.addActionListener (new ButtonActionListener(this,"CancelarDetalleRecap"));
		}
		
		
		if(this.jInternalFrameDetalleFormDetalleRecap!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetalleRecap.jButtonCancelarToolBarDetalleRecap.addActionListener (new ButtonActionListener(this,"CancelarToolBarDetalleRecap"));
			
			this.jInternalFrameDetalleFormDetalleRecap.jMenuItemCancelarDetalleRecap.addActionListener (new ButtonActionListener(this,"MenuItemCancelarDetalleRecap"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarDetalleRecap.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarDetalleRecap"));		
		
		
		this.jButtonCerrarDetalleRecap.addActionListener (new ButtonActionListener(this,"CerrarDetalleRecap"));
		
		
		this.jButtonCerrarToolBarDetalleRecap.addActionListener (new ButtonActionListener(this,"CerrarToolBarDetalleRecap"));
			
		this.jMenuItemCerrarDetalleRecap.addActionListener (new ButtonActionListener(this,"MenuItemCerrarDetalleRecap"));
			
		if(this.jInternalFrameDetalleFormDetalleRecap!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetalleRecap.jMenuItemDetalleCerrarDetalleRecap.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarDetalleRecap"));		
		}
		
		
		if(this.jInternalFrameDetalleFormDetalleRecap!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetalleRecap.jButtonGuardarCambiosDetalleRecap.addActionListener (new ButtonActionListener(this,"GuardarCambiosDetalleRecap"));
		}
		
		
		if(this.jInternalFrameDetalleFormDetalleRecap!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetalleRecap.jButtonGuardarCambiosToolBarDetalleRecap.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarDetalleRecap"));
		}
		
		this.jButtonCopiarToolBarDetalleRecap.addActionListener (new ButtonActionListener(this,"CopiarToolBarDetalleRecap"));
			
		this.jButtonVerFormToolBarDetalleRecap.addActionListener (new ButtonActionListener(this,"VerFormToolBarDetalleRecap"));
		
		this.jMenuItemGuardarCambiosDetalleRecap.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosDetalleRecap"));
			
		this.jMenuItemCopiarDetalleRecap.addActionListener (new ButtonActionListener(this,"MenuItemCopiarDetalleRecap"));		
		
		this.jMenuItemVerFormDetalleRecap.addActionListener (new ButtonActionListener(this,"MenuItemVerFormDetalleRecap"));		
		
		
		this.jButtonGuardarCambiosTablaDetalleRecap.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaDetalleRecap"));
		
		
		this.jButtonGuardarCambiosTablaToolBarDetalleRecap.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarDetalleRecap"));
			
		this.jMenuItemGuardarCambiosTablaDetalleRecap.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaDetalleRecap"));		
		
		
		
		this.jButtonRecargarInformacionDetalleRecap.addActionListener (new ButtonActionListener(this,"RecargarInformacionDetalleRecap"));
					
		this.jButtonRecargarInformacionToolBarDetalleRecap.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarDetalleRecap"));
		
		this.jMenuItemRecargarInformacionDetalleRecap.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionDetalleRecap"));		
		
		
		
		this.jButtonAnterioresDetalleRecap.addActionListener (new ButtonActionListener(this,"AnterioresDetalleRecap"));
		
		
		this.jButtonAnterioresToolBarDetalleRecap.addActionListener (new ButtonActionListener(this,"AnterioresToolBarDetalleRecap"));
		
		this.jMenuItemAnterioresDetalleRecap.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresDetalleRecap"));		
		
		
		this.jButtonSiguientesDetalleRecap.addActionListener (new ButtonActionListener(this,"SiguientesDetalleRecap"));
		
		
		this.jButtonSiguientesToolBarDetalleRecap.addActionListener (new ButtonActionListener(this,"SiguientesToolBarDetalleRecap"));
			
		this.jMenuItemSiguientesDetalleRecap.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesDetalleRecap"));
			
		this.jMenuItemAbrirOrderByDetalleRecap.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByDetalleRecap"));
			
		this.jMenuItemMostrarOcultarDetalleRecap.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarDetalleRecap"));
			
		this.jMenuItemDetalleAbrirOrderByDetalleRecap.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByDetalleRecap"));
			
		this.jMenuItemDetalleMostarOcultarDetalleRecap.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarDetalleRecap"));		
		
		
		this.jButtonNuevoGuardarCambiosDetalleRecap.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosDetalleRecap"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarDetalleRecap.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarDetalleRecap"));
			
		this.jMenuItemNuevoGuardarCambiosDetalleRecap.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosDetalleRecap"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosDetalleRecap.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosDetalleRecap"));

		this.jCheckBoxSeleccionadosDetalleRecap.addItemListener(new CheckBoxItemListener(this,"SeleccionadosDetalleRecap"));
		
		if(this.jInternalFrameDetalleFormDetalleRecap!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetalleRecap.jComboBoxTiposAccionesFormularioDetalleRecap.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioDetalleRecap"));
		}
		
		
		this.jComboBoxTiposRelacionesDetalleRecap.addActionListener (new ButtonActionListener(this,"TiposRelacionesDetalleRecap"));
			
		this.jComboBoxTiposAccionesDetalleRecap.addActionListener (new ButtonActionListener(this,"TiposAccionesDetalleRecap"));
					
		this.jComboBoxTiposSeleccionarDetalleRecap.addActionListener (new ButtonActionListener(this,"TiposSeleccionarDetalleRecap"));
			
		this.jTextFieldValorCampoGeneralDetalleRecap.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralDetalleRecap"));		
		
		
		if(this.jInternalFrameDetalleFormDetalleRecap!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleRecap.jButtonidDetalleRecapBusqueda.addActionListener(new ButtonActionListener(this,"idDetalleRecapBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetalleRecap.jButtonid_recapDetalleRecapUpdate.addActionListener(new ButtonActionListener(this,"id_recapDetalleRecapUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleRecap.jButtonid_recapDetalleRecapBusqueda.addActionListener(new ButtonActionListener(this,"id_recapDetalleRecapBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetalleRecap.jButtonid_empresaDetalleRecapUpdate.addActionListener(new ButtonActionListener(this,"id_empresaDetalleRecapUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleRecap.jButtonid_empresaDetalleRecapBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaDetalleRecapBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetalleRecap.jButtonid_sucursalDetalleRecapUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalDetalleRecapUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleRecap.jButtonid_sucursalDetalleRecapBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalDetalleRecapBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetalleRecap.jButtonid_ejercicioDetalleRecapUpdate.addActionListener(new ButtonActionListener(this,"id_ejercicioDetalleRecapUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleRecap.jButtonid_ejercicioDetalleRecapBusqueda.addActionListener(new ButtonActionListener(this,"id_ejercicioDetalleRecapBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetalleRecap.jButtonid_detalle_clienteDetalleRecapUpdate.addActionListener(new ButtonActionListener(this,"id_detalle_clienteDetalleRecapUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleRecap.jButtonid_detalle_clienteDetalleRecapBusqueda.addActionListener(new ButtonActionListener(this,"id_detalle_clienteDetalleRecapBusqueda"));
		//jButtonid_clienteDetalleRecap.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_clienteDetalleRecapActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormDetalleRecap.jButtonid_clienteDetalleRecap.addActionListener(new ButtonActionListener(this,"id_clienteDetalleRecap"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetalleRecap.jButtonid_clienteDetalleRecapUpdate.addActionListener(new ButtonActionListener(this,"id_clienteDetalleRecapUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleRecap.jButtonid_clienteDetalleRecapBusqueda.addActionListener(new ButtonActionListener(this,"id_clienteDetalleRecapBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleRecap.jButtonvalorDetalleRecapBusqueda.addActionListener(new ButtonActionListener(this,"valorDetalleRecapBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleRecap.jButtoniva_porcentajeDetalleRecapBusqueda.addActionListener(new ButtonActionListener(this,"iva_porcentajeDetalleRecapBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleRecap.jButtontotalDetalleRecapBusqueda.addActionListener(new ButtonActionListener(this,"totalDetalleRecapBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonFK_IdClienteDetalleRecap.addActionListener(new ButtonActionListener(this,"FK_IdClienteDetalleRecap"));

			this.jButtonBuscarFK_IdClienteid_clienteDetalleRecap.addActionListener(new ButtonActionListener(this,"id_clienteDetalleRecap"));

			this.jButtonFK_IdDetalleClienteDetalleRecap.addActionListener(new ButtonActionListener(this,"FK_IdDetalleClienteDetalleRecap"));

			this.jButtonFK_IdRecapDetalleRecap.addActionListener(new ButtonActionListener(this,"FK_IdRecapDetalleRecap"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoDetalleRecap!=null) {
				this.jInternalFrameReporteDinamicoDetalleRecap.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoDetalleRecap"));
				this.jInternalFrameReporteDinamicoDetalleRecap.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoDetalleRecap"));
				this.jInternalFrameReporteDinamicoDetalleRecap.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoDetalleRecap"));
			}
			
			//this.jButtonCerrarReporteDinamicoDetalleRecap.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoDetalleRecap"));				
			//this.jButtonGenerarReporteDinamicoDetalleRecap.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoDetalleRecap"));
			//this.jButtonGenerarExcelReporteDinamicoDetalleRecap.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoDetalleRecap"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionDetalleRecap!=null) {
				this.jInternalFrameImportacionDetalleRecap.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionDetalleRecap"));
				this.jInternalFrameImportacionDetalleRecap.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionDetalleRecap"));
				this.jInternalFrameImportacionDetalleRecap.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionDetalleRecap"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByDetalleRecap.addActionListener (new ButtonActionListener(this,"AbrirOrderByDetalleRecap"));
			
			this.jButtonAbrirOrderByToolBarDetalleRecap.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarDetalleRecap"));			
			
			if(this.jInternalFrameOrderByDetalleRecap!=null) {
				this.jInternalFrameOrderByDetalleRecap.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByDetalleRecap"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormDetalleRecap!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormDetalleRecap!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetalleRecap.jTabbedPaneRelacionesDetalleRecap.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesDetalleRecap"));
		
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
            		closingInternalFrameDetalleRecap();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormDetalleRecap.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormDetalleRecap = (JInternalFrameBase)event.getSource();
	            	
	            DetalleRecapBeanSwingJInternalFrame jInternalFrameParent=(DetalleRecapBeanSwingJInternalFrame)jInternalFrameDetalleFormDetalleRecap.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarDetalleRecapActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosDetalleRecap.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosDetalleRecapListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosDetalleRecap.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosDetalleRecap.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoDetalleRecap.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoDetalleRecapActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarDetalleRecap.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoDetalleRecapActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoDetalleRecap.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoDetalleRecapActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoDetalleRecap";
		inputMap = this.jButtonNuevoDetalleRecap.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoDetalleRecap.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoDetalleRecapActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesDetalleRecap.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoDetalleRecapActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarDetalleRecap.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoDetalleRecapActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesDetalleRecap.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoDetalleRecapActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesDetalleRecap";
		inputMap = this.jButtonNuevoRelacionesDetalleRecap.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesDetalleRecap.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoDetalleRecapActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarDetalleRecap.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarDetalleRecapActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarDetalleRecap.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarDetalleRecapActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarDetalleRecap.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarDetalleRecapActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarDetalleRecap";
		inputMap = this.jButtonModificarDetalleRecap.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarDetalleRecap.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarDetalleRecapActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarDetalleRecap.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarDetalleRecapActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarDetalleRecap.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarDetalleRecapActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarDetalleRecap.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarDetalleRecapActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarDetalleRecap";
		inputMap = this.jButtonActualizarDetalleRecap.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarDetalleRecap.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarDetalleRecapActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarDetalleRecap.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarDetalleRecapActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarDetalleRecap.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarDetalleRecapActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarDetalleRecap.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarDetalleRecapActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarDetalleRecap";
		inputMap = this.jButtonEliminarDetalleRecap.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarDetalleRecap.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarDetalleRecapActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarDetalleRecap.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarDetalleRecapActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarDetalleRecap.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarDetalleRecapActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarDetalleRecap.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarDetalleRecapActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarDetalleRecap";
		inputMap = this.jButtonCancelarDetalleRecap.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarDetalleRecap.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarDetalleRecapActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarDetalleRecap.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarDetalleRecapActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarDetalleRecap.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarDetalleRecapActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarDetalleRecap.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarDetalleRecapActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarDetalleRecap.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarDetalleRecapActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarDetalleRecapActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarDetalleRecap";
		inputMap = this.jButtonCerrarDetalleRecap.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarDetalleRecap.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarDetalleRecapActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormDetalleRecap.jButtonGuardarCambiosDetalleRecap.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosDetalleRecapActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarDetalleRecap.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosDetalleRecapActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosDetalleRecap.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosDetalleRecapActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaDetalleRecap.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosDetalleRecapActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarDetalleRecap.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosDetalleRecapActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaDetalleRecap.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosDetalleRecapActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosDetalleRecap";
		inputMap = this.jInternalFrameDetalleFormDetalleRecap.jButtonGuardarCambiosDetalleRecap.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormDetalleRecap.jButtonGuardarCambiosDetalleRecap.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosDetalleRecapActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionDetalleRecap.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionDetalleRecapActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarDetalleRecap.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionDetalleRecapActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionDetalleRecap.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionDetalleRecapActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresDetalleRecap.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresDetalleRecapActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarDetalleRecap.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresDetalleRecapActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresDetalleRecap.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresDetalleRecapActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesDetalleRecap.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesDetalleRecapActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarDetalleRecap.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesDetalleRecapActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesDetalleRecap.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesDetalleRecapActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosDetalleRecap.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosDetalleRecapActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarDetalleRecap.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosDetalleRecapActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosDetalleRecap.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosDetalleRecapActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosDetalleRecap.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosDetalleRecapItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesDetalleRecap.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesDetalleRecapActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarDetalleRecap.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarDetalleRecapActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralDetalleRecap.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralDetalleRecapActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleRecap.jButtonidDetalleRecapBusqueda.addActionListener(new ButtonActionListener(this,"idDetalleRecapBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetalleRecap.jButtonid_recapDetalleRecapUpdate.addActionListener(new ButtonActionListener(this,"id_recapDetalleRecapUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleRecap.jButtonid_recapDetalleRecapBusqueda.addActionListener(new ButtonActionListener(this,"id_recapDetalleRecapBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetalleRecap.jButtonid_empresaDetalleRecapUpdate.addActionListener(new ButtonActionListener(this,"id_empresaDetalleRecapUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleRecap.jButtonid_empresaDetalleRecapBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaDetalleRecapBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetalleRecap.jButtonid_sucursalDetalleRecapUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalDetalleRecapUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleRecap.jButtonid_sucursalDetalleRecapBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalDetalleRecapBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetalleRecap.jButtonid_ejercicioDetalleRecapUpdate.addActionListener(new ButtonActionListener(this,"id_ejercicioDetalleRecapUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleRecap.jButtonid_ejercicioDetalleRecapBusqueda.addActionListener(new ButtonActionListener(this,"id_ejercicioDetalleRecapBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetalleRecap.jButtonid_detalle_clienteDetalleRecapUpdate.addActionListener(new ButtonActionListener(this,"id_detalle_clienteDetalleRecapUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleRecap.jButtonid_detalle_clienteDetalleRecapBusqueda.addActionListener(new ButtonActionListener(this,"id_detalle_clienteDetalleRecapBusqueda"));
		//jButtonid_clienteDetalleRecap.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_clienteDetalleRecapActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormDetalleRecap.jButtonid_clienteDetalleRecap.addActionListener(new ButtonActionListener(this,"id_clienteDetalleRecap"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetalleRecap.jButtonid_clienteDetalleRecapUpdate.addActionListener(new ButtonActionListener(this,"id_clienteDetalleRecapUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleRecap.jButtonid_clienteDetalleRecapBusqueda.addActionListener(new ButtonActionListener(this,"id_clienteDetalleRecapBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleRecap.jButtonvalorDetalleRecapBusqueda.addActionListener(new ButtonActionListener(this,"valorDetalleRecapBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleRecap.jButtoniva_porcentajeDetalleRecapBusqueda.addActionListener(new ButtonActionListener(this,"iva_porcentajeDetalleRecapBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleRecap.jButtontotalDetalleRecapBusqueda.addActionListener(new ButtonActionListener(this,"totalDetalleRecapBusqueda"));
		
		
		this.jButtonFK_IdClienteDetalleRecap.addActionListener(new ButtonActionListener(this,"FK_IdClienteDetalleRecap"));

		this.jButtonBuscarFK_IdClienteid_clienteDetalleRecap.addActionListener(new ButtonActionListener(this,"id_clienteDetalleRecap"));

		this.jButtonFK_IdDetalleClienteDetalleRecap.addActionListener(new ButtonActionListener(this,"FK_IdDetalleClienteDetalleRecap"));

		this.jButtonFK_IdRecapDetalleRecap.addActionListener(new ButtonActionListener(this,"FK_IdRecapDetalleRecap"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoDetalleRecap.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoDetalleRecapActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoDetalleRecap.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoDetalleRecapActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoDetalleRecap.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoDetalleRecapActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionDetalleRecap.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionDetalleRecapActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionDetalleRecap.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionDetalleRecapActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionDetalleRecap.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionDetalleRecapActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarDetalleRecapActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarDetalleRecap.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleRecapConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosDetalleRecap(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(DetalleRecap detallerecapAux:this.detallerecapLogic.getDetalleRecaps()) {
					detallerecapAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(DetalleRecap detallerecapAux:detallerecaps) {
					detallerecapAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleRecapConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosDetalleRecapItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingDetalleRecap(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(DetalleRecap detallerecapAux:this.detallerecapLogic.getDetalleRecaps()) {
						detallerecapAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(DetalleRecap detallerecapAux:detallerecaps) {
						detallerecapAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(DetalleRecap detallerecapAux:this.detallerecapLogic.getDetalleRecaps()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(DetalleRecap detallerecapAux:detallerecaps) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaDetalleRecap(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosDetalleRecap.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosDetalleRecap.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosDetalleRecap,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleRecapConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosDetalleRecapItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingDetalleRecap(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosDetalleRecap.getSelectedRows();
			
			DetalleRecap detallerecapLocal=new DetalleRecap();
			
			//this.seleccionarTodosDetalleRecap(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					detallerecapLocal =(DetalleRecap) this.detallerecapLogic.getDetalleRecaps().toArray()[this.jTableDatosDetalleRecap.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					detallerecapLocal =(DetalleRecap) this.detallerecaps.toArray()[this.jTableDatosDetalleRecap.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				detallerecapLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(DetalleRecap detallerecapAux:this.detallerecapLogic.getDetalleRecaps()) {
						detallerecapAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(DetalleRecap detallerecapAux:detallerecaps) {
						detallerecapAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaDetalleRecap(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosDetalleRecap.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosDetalleRecap.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosDetalleRecap,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleRecapConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualDetalleRecapItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleRecapConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarDetalleRecapParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleRecapConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralDetalleRecapActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingDetalleRecap(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralDetalleRecap.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(DetalleRecap detallerecapAux:this.detallerecapLogic.getDetalleRecaps()) {
				
						if(sTipoSeleccionar.equals(DetalleRecapConstantesFunciones.LABEL_VALOR)) {
							existe=true;
							detallerecapAux.setvalor(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(DetalleRecapConstantesFunciones.LABEL_IVAPORCENTAJE)) {
							existe=true;
							detallerecapAux.setiva_porcentaje(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(DetalleRecapConstantesFunciones.LABEL_TOTAL)) {
							existe=true;
							detallerecapAux.settotal(Double.parseDouble(this.sValorCampoGeneral));
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(DetalleRecap detallerecapAux:detallerecaps) {
					
						if(sTipoSeleccionar.equals(DetalleRecapConstantesFunciones.LABEL_VALOR)) {
							existe=true;
							detallerecapAux.setvalor(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(DetalleRecapConstantesFunciones.LABEL_IVAPORCENTAJE)) {
							existe=true;
							detallerecapAux.setiva_porcentaje(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(DetalleRecapConstantesFunciones.LABEL_TOTAL)) {
							existe=true;
							detallerecapAux.settotal(Double.parseDouble(this.sValorCampoGeneral));
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaDetalleRecap(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleRecapConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesDetalleRecapActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingDetalleRecap(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioDetalleRecap=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesDetalleRecap.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormDetalleRecap.jComboBoxTiposAccionesFormularioDetalleRecap.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteDetalleRecap) {				
					conSplash=true;//false;										
					
					//this.startProcessDetalleRecap(conSplash);
				
					this.generarReporteDetalleRecapsSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesDetalleRecap.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormDetalleRecap.jComboBoxTiposAccionesFormularioDetalleRecap.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoDetalleRecapsSeleccionados();
				//this.jComboBoxTiposAccionesDetalleRecap.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoDetalleRecapsSeleccionados(false);
				//this.jComboBoxTiposAccionesDetalleRecap.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoDetalleRecapsSeleccionados(true);
				//this.jComboBoxTiposAccionesDetalleRecap.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessDetalleRecap();
				
				this.exportarDetalleRecapsSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesDetalleRecap.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormDetalleRecap.jComboBoxTiposAccionesFormularioDetalleRecap.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionDetalleRecaps();
				//this.importarDetalleRecaps();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesDetalleRecap.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormDetalleRecap.jComboBoxTiposAccionesFormularioDetalleRecap.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessDetalleRecap();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelDetalleRecapsSeleccionados();
				//this.jComboBoxTiposAccionesDetalleRecap.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Detalle Recap", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessDetalleRecap();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoDetalleRecap)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyDetalleRecap(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Detalle Recap",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesDetalleRecap.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormDetalleRecap.jComboBoxTiposAccionesFormularioDetalleRecap.setSelectedIndex(0);					
				}	
			} 			
			else if(DetalleRecapBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteDetalleRecap) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessDetalleRecap(conSplash);
					
						//this.actualizarParametrosGeneralDetalleRecap();
						
						this.generarReporteProcesoAccionDetalleRecapsSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesDetalleRecap.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormDetalleRecap.jComboBoxTiposAccionesFormularioDetalleRecap.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(DetalleRecapBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Detalle RecapES SELECCIONADOS?", "MANTENIMIENTO DE Detalle Recap", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessDetalleRecap();
				
						this.actualizarParametrosGeneralDetalleRecap();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.detallerecapReturnGeneral=detallerecapLogic.procesarAccionDetalleRecapsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.detallerecapLogic.getDetalleRecaps(),this.detallerecapParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarDetalleRecapReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesDetalleRecap.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormDetalleRecap.jComboBoxTiposAccionesFormularioDetalleRecap.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralDetalleRecap();
					
					DetalleRecapBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarDetalleRecapReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesDetalleRecap.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormDetalleRecap.jComboBoxTiposAccionesFormularioDetalleRecap.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,DetalleRecapConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessDetalleRecap(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesDetalleRecapActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessDetalleRecap();
			
			if(this.jInternalFrameDetalleFormDetalleRecap==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<DetalleRecap> detallerecapsSeleccionados=new ArrayList<DetalleRecap>();		
			DetalleRecap detallerecap=new DetalleRecap();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingDetalleRecap(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesDetalleRecap.getSelectedItem();
			
			
			
			
			detallerecapsSeleccionados=this.getDetalleRecapsSeleccionados(true);
			//this.sTipoAccion;
			
			if(detallerecapsSeleccionados.size()==1) {
				for(DetalleRecap detallerecapAux:detallerecapsSeleccionados) {
					detallerecap=detallerecapAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleRecapConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessDetalleRecap();
			
      		//this.finishProcessDetalleRecap(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarDetalleRecapReturnGeneral() throws Exception {
		if(this.detallerecapReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.detallerecapReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.detallerecapReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.detallerecapReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.detallerecapReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.detallerecapReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingDetalleRecap(false);
		}
		
		if(this.detallerecapReturnGeneral.getConRetornoLista() || this.detallerecapReturnGeneral.getConRetornoObjeto()) {
			if(this.detallerecapReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.detallerecapLogic.setDetalleRecaps(this.detallerecapReturnGeneral.getDetalleRecaps());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.detallerecapReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.detallerecapLogic.setDetalleRecap(this.detallerecapReturnGeneral.getDetalleRecap());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingDetalleRecap(false);
		}
	}
	
	public void actualizarParametrosGeneralDetalleRecap() throws Exception {
		
		
	}
	
	public ArrayList<DetalleRecap> getDetalleRecapsSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<DetalleRecap> detallerecapsSeleccionados=new ArrayList<DetalleRecap>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioDetalleRecap) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(DetalleRecap detallerecapAux:detallerecapLogic.getDetalleRecaps()) {
					if(detallerecapAux.getIsSelected()) {
						detallerecapsSeleccionados.add(detallerecapAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(DetalleRecap detallerecapAux:this.detallerecaps) {
					if(detallerecapAux.getIsSelected()) {
						detallerecapsSeleccionados.add(detallerecapAux);				
					}
				}
			}
			
			if(detallerecapsSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						detallerecapsSeleccionados.addAll(this.detallerecapLogic.getDetalleRecaps());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						detallerecapsSeleccionados.addAll(this.detallerecaps);				
					}
				}
			}
		} else {
			detallerecapsSeleccionados.add(this.detallerecap);
		}
		
		return detallerecapsSeleccionados;
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
	
	public void generarReporteDetalleRecapsSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalDetalleRecapsSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoDetalleRecapsSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoDetalleRecapsSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoDetalleRecapsSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Detalle Recap",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesDetalleRecapsSeleccionados() throws Exception {
		ArrayList<DetalleRecap> detallerecapsSeleccionados=new ArrayList<DetalleRecap>();		
		
		detallerecapsSeleccionados=this.getDetalleRecapsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteDetalleRecaps("Todos",detallerecapsSeleccionados);
		
	}	
	
	public void generarReporteNormalDetalleRecapsSeleccionados() throws Exception {
		ArrayList<DetalleRecap> detallerecapsSeleccionados=new ArrayList<DetalleRecap>();		
		
		detallerecapsSeleccionados=this.getDetalleRecapsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteDetalleRecaps("Todos",detallerecapsSeleccionados);
	}		
	
	public void generarReporteProcesoAccionDetalleRecapsSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<DetalleRecap> detallerecapsSeleccionados=new ArrayList<DetalleRecap>();
		
		detallerecapsSeleccionados=this.getDetalleRecapsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteDetalleRecaps("Todos",detallerecapsSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoDetalleRecapsSeleccionados() throws Exception {
		ArrayList<DetalleRecap> detallerecapsSeleccionados=new ArrayList<DetalleRecap>();		
		
		
		this.abrirInicializarFrameReporteDinamicoDetalleRecap();
		
		
		detallerecapsSeleccionados=this.getDetalleRecapsSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoDetalleRecap();
		
		
		//this.generarReporteDetalleRecaps("Todos",detallerecapsSeleccionados ,detallerecapImplementable,detallerecapImplementableHome);
	}
	
	public void mostrarImportacionDetalleRecaps() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionDetalleRecap();
		
		this.abrirFrameImportacionDetalleRecap();		
		
			
		//this.generarReporteDetalleRecaps("Todos",detallerecapsSeleccionados ,detallerecapImplementable,detallerecapImplementableHome);
	}
	
	public void importarDetalleRecaps() throws Exception {		
	
	}
	
	public void exportarDetalleRecapsSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelDetalleRecapsSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoDetalleRecapsSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlDetalleRecapsSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Detalle Recap",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoDetalleRecapsSeleccionados() throws Exception {
		ArrayList<DetalleRecap> detallerecapsSeleccionados=new ArrayList<DetalleRecap>();		
		
		detallerecapsSeleccionados=this.getDetalleRecapsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"detallerecap."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarDetalleRecap(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(DetalleRecap detallerecapAux:detallerecapsSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarDetalleRecap(detallerecapAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//detallerecapAux.setsDetalleGeneralEntityReporte(detallerecapAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.detallerecapSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Detalle Recap",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarDetalleRecap(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=DetalleRecapConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DetalleRecapConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DetalleRecapConstantesFunciones.LABEL_IDRECAP;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DetalleRecapConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DetalleRecapConstantesFunciones.LABEL_IDSUCURSAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DetalleRecapConstantesFunciones.LABEL_IDEJERCICIO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DetalleRecapConstantesFunciones.LABEL_IDDETALLECLIENTE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DetalleRecapConstantesFunciones.LABEL_IDCLIENTE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DetalleRecapConstantesFunciones.LABEL_VALOR;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DetalleRecapConstantesFunciones.LABEL_IVAPORCENTAJE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DetalleRecapConstantesFunciones.LABEL_TOTAL;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarDetalleRecap(DetalleRecap detallerecap,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=detallerecap.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=detallerecap.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=detallerecap.getrecap_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=detallerecap.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=detallerecap.getsucursal_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=detallerecap.getejercicio_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=detallerecap.getdetallecliente_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=detallerecap.getcliente_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=detallerecap.getvalor().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=detallerecap.getiva_porcentaje().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=detallerecap.gettotal().toString();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelDetalleRecapsSeleccionados() throws Exception {
		ArrayList<DetalleRecap> detallerecapsSeleccionados=new ArrayList<DetalleRecap>();		
		
		detallerecapsSeleccionados=this.getDetalleRecapsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"detallerecap.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("DetalleRecaps");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelDetalleRecap(row);				
				iRow++;
			}				
			
			for(DetalleRecap detallerecapAux:detallerecapsSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelDetalleRecap(detallerecapAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.detallerecapSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Detalle Recap",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlDetalleRecapsSeleccionados() throws Exception {
		ArrayList<DetalleRecap> detallerecapsSeleccionados=new ArrayList<DetalleRecap>();		
		
		detallerecapsSeleccionados=this.getDetalleRecapsSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"detallerecap.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("detallerecaps");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("detallerecap");
			//elementRoot.appendChild(element);
		
			for(DetalleRecap detallerecapAux:detallerecapsSeleccionados) {
				element = document.createElement("detallerecap");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlDetalleRecap(detallerecapAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.detallerecapSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Detalle Recap",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelDetalleRecap(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(DetalleRecapConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(DetalleRecapConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(DetalleRecapConstantesFunciones.LABEL_IDRECAP);
		cell = row.createCell(iColumn++);cell.setCellValue(DetalleRecapConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(DetalleRecapConstantesFunciones.LABEL_IDSUCURSAL);
		cell = row.createCell(iColumn++);cell.setCellValue(DetalleRecapConstantesFunciones.LABEL_IDEJERCICIO);
		cell = row.createCell(iColumn++);cell.setCellValue(DetalleRecapConstantesFunciones.LABEL_IDDETALLECLIENTE);
		cell = row.createCell(iColumn++);cell.setCellValue(DetalleRecapConstantesFunciones.LABEL_IDCLIENTE);
		cell = row.createCell(iColumn++);cell.setCellValue(DetalleRecapConstantesFunciones.LABEL_VALOR);
		cell = row.createCell(iColumn++);cell.setCellValue(DetalleRecapConstantesFunciones.LABEL_IVAPORCENTAJE);
		cell = row.createCell(iColumn++);cell.setCellValue(DetalleRecapConstantesFunciones.LABEL_TOTAL);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelDetalleRecap(DetalleRecap detallerecap,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(detallerecap.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(detallerecap.getrecap_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(detallerecap.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(detallerecap.getsucursal_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(detallerecap.getejercicio_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(detallerecap.getdetallecliente_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(detallerecap.getcliente_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(detallerecap.getvalor());
		cell = row.createCell(iColumn++);cell.setCellValue(detallerecap.getiva_porcentaje());
		cell = row.createCell(iColumn++);cell.setCellValue(detallerecap.gettotal());				
	}
	
	public void setFilaDatosExportarXmlDetalleRecap(DetalleRecap detallerecap,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(DetalleRecapConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(detallerecap.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(DetalleRecapConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(detallerecap.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementrecap_descripcion = document.createElement(DetalleRecapConstantesFunciones.IDRECAP);
		elementrecap_descripcion.appendChild(document.createTextNode(detallerecap.getrecap_descripcion()));
		element.appendChild(elementrecap_descripcion);

		Element elementempresa_descripcion = document.createElement(DetalleRecapConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(detallerecap.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementsucursal_descripcion = document.createElement(DetalleRecapConstantesFunciones.IDSUCURSAL);
		elementsucursal_descripcion.appendChild(document.createTextNode(detallerecap.getsucursal_descripcion()));
		element.appendChild(elementsucursal_descripcion);

		Element elementejercicio_descripcion = document.createElement(DetalleRecapConstantesFunciones.IDEJERCICIO);
		elementejercicio_descripcion.appendChild(document.createTextNode(detallerecap.getejercicio_descripcion()));
		element.appendChild(elementejercicio_descripcion);

		Element elementdetallecliente_descripcion = document.createElement(DetalleRecapConstantesFunciones.IDDETALLECLIENTE);
		elementdetallecliente_descripcion.appendChild(document.createTextNode(detallerecap.getdetallecliente_descripcion()));
		element.appendChild(elementdetallecliente_descripcion);

		Element elementcliente_descripcion = document.createElement(DetalleRecapConstantesFunciones.IDCLIENTE);
		elementcliente_descripcion.appendChild(document.createTextNode(detallerecap.getcliente_descripcion()));
		element.appendChild(elementcliente_descripcion);

		Element elementvalor = document.createElement(DetalleRecapConstantesFunciones.VALOR);
		elementvalor.appendChild(document.createTextNode(detallerecap.getvalor().toString().trim()));
		element.appendChild(elementvalor);

		Element elementiva_porcentaje = document.createElement(DetalleRecapConstantesFunciones.IVAPORCENTAJE);
		elementiva_porcentaje.appendChild(document.createTextNode(detallerecap.getiva_porcentaje().toString().trim()));
		element.appendChild(elementiva_porcentaje);

		Element elementtotal = document.createElement(DetalleRecapConstantesFunciones.TOTAL);
		elementtotal.appendChild(document.createTextNode(detallerecap.gettotal().toString().trim()));
		element.appendChild(elementtotal);
	}
	
	public void generarReporteGroupGenericoDetalleRecapsSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<DetalleRecap> detallerecapsSeleccionados=new ArrayList<DetalleRecap>();
		
		detallerecapsSeleccionados=this.getDetalleRecapsSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoDetalleRecap(detallerecapsSeleccionados);
		
		this.generarReporteDetalleRecaps("Todos",detallerecapsSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoDetalleRecap(ArrayList<DetalleRecap> detallerecapsSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(DetalleRecap detallerecapAux:detallerecapsSeleccionados) {
				detallerecapAux.setsDetalleGeneralEntityReporte(detallerecapAux.toString());
			
				if(sTipoSeleccionar.equals(DetalleRecapConstantesFunciones.LABEL_IDRECAP)) {
					existe=true;
					detallerecapAux.setsDescripcionGeneralEntityReporte1(detallerecapAux.getrecap_descripcion());
				}
				 else if(sTipoSeleccionar.equals(DetalleRecapConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					detallerecapAux.setsDescripcionGeneralEntityReporte1(detallerecapAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(DetalleRecapConstantesFunciones.LABEL_IDSUCURSAL)) {
					existe=true;
					detallerecapAux.setsDescripcionGeneralEntityReporte1(detallerecapAux.getsucursal_descripcion());
				}
				 else if(sTipoSeleccionar.equals(DetalleRecapConstantesFunciones.LABEL_IDEJERCICIO)) {
					existe=true;
					detallerecapAux.setsDescripcionGeneralEntityReporte1(detallerecapAux.getejercicio_descripcion());
				}
				 else if(sTipoSeleccionar.equals(DetalleRecapConstantesFunciones.LABEL_IDDETALLECLIENTE)) {
					existe=true;
					detallerecapAux.setsDescripcionGeneralEntityReporte1(detallerecapAux.getdetallecliente_descripcion());
				}
				 else if(sTipoSeleccionar.equals(DetalleRecapConstantesFunciones.LABEL_IDCLIENTE)) {
					existe=true;
					detallerecapAux.setsDescripcionGeneralEntityReporte1(detallerecapAux.getcliente_descripcion());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleRecapConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesDetalleRecap(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoDetalleRecap=true;
				this.isVisibilidadCeldaNuevoRelacionesDetalleRecap=true;
				this.isVisibilidadCeldaGuardarCambiosDetalleRecap=true;
			}
			
			this.isVisibilidadCeldaModificarDetalleRecap=false;
			this.isVisibilidadCeldaActualizarDetalleRecap=false;
			this.isVisibilidadCeldaEliminarDetalleRecap=false;
			this.isVisibilidadCeldaCancelarDetalleRecap=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarDetalleRecap=true;
				} else {
					this.isVisibilidadCeldaGuardarDetalleRecap=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoDetalleRecap=false;
			this.isVisibilidadCeldaNuevoRelacionesDetalleRecap=false;
			this.isVisibilidadCeldaGuardarCambiosDetalleRecap=false;
			this.isVisibilidadCeldaModificarDetalleRecap=false;
			this.isVisibilidadCeldaActualizarDetalleRecap=true;
			this.isVisibilidadCeldaEliminarDetalleRecap=false;
			this.isVisibilidadCeldaCancelarDetalleRecap=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarDetalleRecap=true;
				} else {
					this.isVisibilidadCeldaGuardarDetalleRecap=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoDetalleRecap=false;
			this.isVisibilidadCeldaNuevoRelacionesDetalleRecap=false;
			this.isVisibilidadCeldaGuardarCambiosDetalleRecap=false;
			this.isVisibilidadCeldaModificarDetalleRecap=false;
			this.isVisibilidadCeldaActualizarDetalleRecap=true;
			this.isVisibilidadCeldaEliminarDetalleRecap=true;
			this.isVisibilidadCeldaCancelarDetalleRecap=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarDetalleRecap=true;
				} else {
					this.isVisibilidadCeldaGuardarDetalleRecap=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoDetalleRecap=false;
			this.isVisibilidadCeldaNuevoRelacionesDetalleRecap=false;
			this.isVisibilidadCeldaGuardarCambiosDetalleRecap=false;
			this.isVisibilidadCeldaModificarDetalleRecap=false;
			this.isVisibilidadCeldaActualizarDetalleRecap=true;
			this.isVisibilidadCeldaEliminarDetalleRecap=false;
			this.isVisibilidadCeldaCancelarDetalleRecap=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarDetalleRecap=false;
				} else {
					this.isVisibilidadCeldaGuardarDetalleRecap=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoDetalleRecap=true;
			this.isVisibilidadCeldaNuevoRelacionesDetalleRecap=true;
			this.isVisibilidadCeldaGuardarCambiosDetalleRecap=true;
			this.isVisibilidadCeldaModificarDetalleRecap=false;
			this.isVisibilidadCeldaActualizarDetalleRecap=false;
			this.isVisibilidadCeldaEliminarDetalleRecap=false;
			this.isVisibilidadCeldaCancelarDetalleRecap=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarDetalleRecap=true;
				} else {
					this.isVisibilidadCeldaGuardarDetalleRecap=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoDetalleRecap=false;
			this.isVisibilidadCeldaNuevoRelacionesDetalleRecap=false;
			this.isVisibilidadCeldaGuardarCambiosDetalleRecap=false;
			this.isVisibilidadCeldaActualizarDetalleRecap=false;
			this.isVisibilidadCeldaEliminarDetalleRecap=false;
			this.isVisibilidadCeldaCancelarDetalleRecap=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarDetalleRecap=false;
				} else {
					this.isVisibilidadCeldaGuardarDetalleRecap=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoDetalleRecap=false;
			this.isVisibilidadCeldaNuevoRelacionesDetalleRecap=false;
			this.isVisibilidadCeldaGuardarCambiosDetalleRecap=false;
			this.isVisibilidadCeldaModificarDetalleRecap=true;
			this.isVisibilidadCeldaActualizarDetalleRecap=false;
			this.isVisibilidadCeldaEliminarDetalleRecap=false;
			this.isVisibilidadCeldaCancelarDetalleRecap=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarDetalleRecap=false;
				} else {
					this.isVisibilidadCeldaGuardarDetalleRecap=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(DetalleRecapJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoDetalleRecap=true;
			this.isVisibilidadCeldaNuevoRelacionesDetalleRecap=true;
			this.isVisibilidadCeldaGuardarCambiosDetalleRecap=true;
		} else {
			this.actualizarEstadoPanelsDetalleRecap(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarDetalleRecap=false;
			//this.isVisibilidadCeldaVerFormDetalleRecap=false;
			this.isVisibilidadCeldaDuplicarDetalleRecap=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!detallerecapSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesDetalleRecap=false;
		} else {
			this.isVisibilidadCeldaNuevoDetalleRecap=false;
			this.isVisibilidadCeldaGuardarCambiosDetalleRecap=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(detallerecapSessionBean.getEsGuardarRelacionado()) {
			if(!detallerecapSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesDetalleRecap=false;												
			}
			
			this.jButtonCerrarDetalleRecap.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesDetalleRecap=false;
		}
		
		if(!this.permiteMantenimiento(this.detallerecap)) {
			this.isVisibilidadCeldaActualizarDetalleRecap=false;
			this.isVisibilidadCeldaEliminarDetalleRecap=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesDetalleRecap() {
	}
	
	public void actualizarEstadoPanelsDetalleRecap(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionDetalleRecap!=null) {
				this.jScrollPanelDatosEdicionDetalleRecap.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDetalleRecap!=null) {
				this.jTabbedPaneBusquedasDetalleRecap.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosDetalleRecap!=null) {
				this.jScrollPanelDatosDetalleRecap.setVisible(true);
			}
			
			if(this.jPanelPaginacionDetalleRecap!=null) {
				this.jPanelPaginacionDetalleRecap.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesDetalleRecap!=null) {
				this.jPanelParametrosReportesDetalleRecap.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionDetalleRecap!=null) {
				this.jScrollPanelDatosEdicionDetalleRecap.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDetalleRecap!=null) {
				this.jTabbedPaneBusquedasDetalleRecap.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosDetalleRecap!=null) {
				this.jScrollPanelDatosDetalleRecap.setVisible(false);
			}
			
			if(this.jPanelPaginacionDetalleRecap!=null) {
				this.jPanelPaginacionDetalleRecap.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesDetalleRecap!=null) {
				this.jPanelParametrosReportesDetalleRecap.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionDetalleRecap!=null) {
				this.jScrollPanelDatosEdicionDetalleRecap.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDetalleRecap!=null) {
				this.jTabbedPaneBusquedasDetalleRecap.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosDetalleRecap!=null) {
				this.jScrollPanelDatosDetalleRecap.setVisible(false);
			}
			
			if(this.jPanelPaginacionDetalleRecap!=null) {
				this.jPanelPaginacionDetalleRecap.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesDetalleRecap!=null) {
				this.jPanelParametrosReportesDetalleRecap.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionDetalleRecap!=null) {
				this.jScrollPanelDatosEdicionDetalleRecap.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDetalleRecap!=null) {
				this.jTabbedPaneBusquedasDetalleRecap.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosDetalleRecap!=null) {
				this.jScrollPanelDatosDetalleRecap.setVisible(false);
			}
			
			if(this.jPanelPaginacionDetalleRecap!=null) {
				this.jPanelPaginacionDetalleRecap.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesDetalleRecap!=null) {
				this.jPanelParametrosReportesDetalleRecap.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionDetalleRecap!=null) {
				this.jScrollPanelDatosEdicionDetalleRecap.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDetalleRecap!=null) {
				this.jTabbedPaneBusquedasDetalleRecap.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosDetalleRecap!=null) {
				this.jScrollPanelDatosDetalleRecap.setVisible(true);
			}
			
			if(this.jPanelPaginacionDetalleRecap!=null) {
				this.jPanelPaginacionDetalleRecap.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesDetalleRecap!=null) {
				this.jPanelParametrosReportesDetalleRecap.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionDetalleRecap!=null) {
				this.jScrollPanelDatosEdicionDetalleRecap.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDetalleRecap!=null) {
				this.jTabbedPaneBusquedasDetalleRecap.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosDetalleRecap!=null) {
				this.jScrollPanelDatosDetalleRecap.setVisible(true);
			}
			
			if(this.jPanelPaginacionDetalleRecap!=null) {
				this.jPanelPaginacionDetalleRecap.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesDetalleRecap!=null) {
				this.jPanelParametrosReportesDetalleRecap.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionDetalleRecap!=null) {
				this.jScrollPanelDatosEdicionDetalleRecap.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDetalleRecap!=null) {
				this.jTabbedPaneBusquedasDetalleRecap.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosDetalleRecap!=null) {
				this.jScrollPanelDatosDetalleRecap.setVisible(true);
			}
			
			if(this.jPanelPaginacionDetalleRecap!=null) {
				this.jPanelPaginacionDetalleRecap.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesDetalleRecap!=null) {
				this.jPanelParametrosReportesDetalleRecap.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.detallerecapSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasDetalleRecap!=null) {
					this.jTabbedPaneBusquedasDetalleRecap.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesDetalleRecap!=null) {
				this.jPanelParametrosReportesDetalleRecap.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.detallerecapSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDetalleRecap!=null) {
				this.jTabbedPaneBusquedasDetalleRecap.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesDetalleRecap!=null) {
				this.jPanelParametrosReportesDetalleRecap.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaRecap(Boolean isParaRecap){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaRecapNegation=!isParaRecap;

			this.isVisibilidadFK_IdCliente=isParaRecapNegation;
			if(!this.isVisibilidadFK_IdCliente) {this.jTabbedPaneBusquedasDetalleRecap.remove(jPanelFK_IdClienteDetalleRecap);}

			this.isVisibilidadFK_IdDetalleCliente=isParaRecapNegation;
			if(!this.isVisibilidadFK_IdDetalleCliente) {this.jTabbedPaneBusquedasDetalleRecap.remove(jPanelFK_IdDetalleClienteDetalleRecap);}

			this.isVisibilidadFK_IdRecap=isParaRecap;
			if(!this.isVisibilidadFK_IdRecap) {this.jTabbedPaneBusquedasDetalleRecap.remove(jPanelFK_IdRecapDetalleRecap);}
		}
		
	}

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadFK_IdCliente=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdCliente) {this.jTabbedPaneBusquedasDetalleRecap.remove(jPanelFK_IdClienteDetalleRecap);}

			this.isVisibilidadFK_IdDetalleCliente=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdDetalleCliente) {this.jTabbedPaneBusquedasDetalleRecap.remove(jPanelFK_IdDetalleClienteDetalleRecap);}

			this.isVisibilidadFK_IdRecap=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdRecap) {this.jTabbedPaneBusquedasDetalleRecap.remove(jPanelFK_IdRecapDetalleRecap);}
		}
		
	}

	public void setVisibilidadBusquedasParaSucursal(Boolean isParaSucursal){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaSucursalNegation=!isParaSucursal;

			this.isVisibilidadFK_IdCliente=isParaSucursalNegation;
			if(!this.isVisibilidadFK_IdCliente) {this.jTabbedPaneBusquedasDetalleRecap.remove(jPanelFK_IdClienteDetalleRecap);}

			this.isVisibilidadFK_IdDetalleCliente=isParaSucursalNegation;
			if(!this.isVisibilidadFK_IdDetalleCliente) {this.jTabbedPaneBusquedasDetalleRecap.remove(jPanelFK_IdDetalleClienteDetalleRecap);}

			this.isVisibilidadFK_IdRecap=isParaSucursalNegation;
			if(!this.isVisibilidadFK_IdRecap) {this.jTabbedPaneBusquedasDetalleRecap.remove(jPanelFK_IdRecapDetalleRecap);}
		}
		
	}

	public void setVisibilidadBusquedasParaEjercicio(Boolean isParaEjercicio){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEjercicioNegation=!isParaEjercicio;

			this.isVisibilidadFK_IdCliente=isParaEjercicioNegation;
			if(!this.isVisibilidadFK_IdCliente) {this.jTabbedPaneBusquedasDetalleRecap.remove(jPanelFK_IdClienteDetalleRecap);}

			this.isVisibilidadFK_IdDetalleCliente=isParaEjercicioNegation;
			if(!this.isVisibilidadFK_IdDetalleCliente) {this.jTabbedPaneBusquedasDetalleRecap.remove(jPanelFK_IdDetalleClienteDetalleRecap);}

			this.isVisibilidadFK_IdRecap=isParaEjercicioNegation;
			if(!this.isVisibilidadFK_IdRecap) {this.jTabbedPaneBusquedasDetalleRecap.remove(jPanelFK_IdRecapDetalleRecap);}
		}
		
	}

	public void setVisibilidadBusquedasParaDetalleCliente(Boolean isParaDetalleCliente){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaDetalleClienteNegation=!isParaDetalleCliente;

			this.isVisibilidadFK_IdCliente=isParaDetalleClienteNegation;
			if(!this.isVisibilidadFK_IdCliente) {this.jTabbedPaneBusquedasDetalleRecap.remove(jPanelFK_IdClienteDetalleRecap);}

			this.isVisibilidadFK_IdDetalleCliente=isParaDetalleCliente;
			if(!this.isVisibilidadFK_IdDetalleCliente) {this.jTabbedPaneBusquedasDetalleRecap.remove(jPanelFK_IdDetalleClienteDetalleRecap);}

			this.isVisibilidadFK_IdRecap=isParaDetalleClienteNegation;
			if(!this.isVisibilidadFK_IdRecap) {this.jTabbedPaneBusquedasDetalleRecap.remove(jPanelFK_IdRecapDetalleRecap);}
		}
		
	}

	public void setVisibilidadBusquedasParaCliente(Boolean isParaCliente){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaClienteNegation=!isParaCliente;

			this.isVisibilidadFK_IdCliente=isParaCliente;
			if(!this.isVisibilidadFK_IdCliente) {this.jTabbedPaneBusquedasDetalleRecap.remove(jPanelFK_IdClienteDetalleRecap);}

			this.isVisibilidadFK_IdDetalleCliente=isParaClienteNegation;
			if(!this.isVisibilidadFK_IdDetalleCliente) {this.jTabbedPaneBusquedasDetalleRecap.remove(jPanelFK_IdDetalleClienteDetalleRecap);}

			this.isVisibilidadFK_IdRecap=isParaClienteNegation;
			if(!this.isVisibilidadFK_IdRecap) {this.jTabbedPaneBusquedasDetalleRecap.remove(jPanelFK_IdRecapDetalleRecap);}
		}
		
	}
	
	
	
	

	public String registrarSesionDetalleRecapParaBusquedaClientes() throws Exception {
		Boolean isPaginaPopupCliente=false;

		try {

			if(detallerecapSessionBean==null) {
				detallerecapSessionBean=new DetalleRecapSessionBean();
			}

			if(clienteSessionBean==null) {
				clienteSessionBean=new ClienteSessionBean();
			}

			clienteSessionBean.setsPathNavegacionActual(detallerecapSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+ClienteConstantesFunciones.SCLASSWEBTITULO);
			clienteSessionBean.setisPermiteRecargarInformacion(false);
			clienteSessionBean.setisPaginaPopup(true);
			isPaginaPopupCliente=clienteSessionBean.getisPaginaPopup();
			clienteSessionBean.setisPaginaPopup(false);
			clienteSessionBean.setEstaModoBusqueda(true);
			clienteSessionBean.setsFuncionBusquedaRapida("window.opener.detallerecapFuncionGeneral.setCombosCodigoDesdeBusquedaid_cliente(TO_REPLACE);");
			clienteSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeCliente(true);
			clienteSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeCliente(DetalleRecapConstantesFunciones.SNOMBREOPCION);
			//clienteSessionBean.setisBusquedaDesdeForeignKeySesionDetalleRecap(true);
			//clienteSessionBean.setlidDetalleRecapActual(this.idDetalleRecapActual);

			detallerecapSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyDetalleRecap(true);
			detallerecapSessionBean.setlIdDetalleRecapActualForeignKey(this.idDetalleRecapActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
			return "";
	}
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//DetalleRecapSessionBean detallerecapSessionBean=new DetalleRecapSessionBean();
		
		if(this.detallerecapSessionBean==null) {
			this.detallerecapSessionBean=new DetalleRecapSessionBean();
		}
		
		this.detallerecapSessionBean.setsUltimaBusquedaDetalleRecap(this.getsAccionBusqueda());
		this.detallerecapSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.detallerecapSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdCliente")) {
			detallerecapSessionBean.setid_cliente(this.getid_clienteFK_IdCliente());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdDetalleCliente")) {
			detallerecapSessionBean.setid_detalle_cliente(this.getid_detalle_clienteFK_IdDetalleCliente());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdEjercicio")) {
			detallerecapSessionBean.setid_ejercicio(this.getid_ejercicioFK_IdEjercicio());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			detallerecapSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdRecap")) {
			detallerecapSessionBean.setid_recap(this.getid_recapFK_IdRecap());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdSucursal")) {
			detallerecapSessionBean.setid_sucursal(this.getid_sucursalFK_IdSucursal());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//DetalleRecapSessionBean detallerecapSessionBean=new DetalleRecapSessionBean();
		
		if(this.detallerecapSessionBean==null) {
			this.detallerecapSessionBean=new DetalleRecapSessionBean();
		}
		
		if(this.detallerecapSessionBean.getsUltimaBusquedaDetalleRecap()!=null&&!this.detallerecapSessionBean.getsUltimaBusquedaDetalleRecap().equals("")) {
			this.setsAccionBusqueda(detallerecapSessionBean.getsUltimaBusquedaDetalleRecap());
			this.setiNumeroPaginacion(detallerecapSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(detallerecapSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdCliente")) {
				this.setid_clienteFK_IdCliente(detallerecapSessionBean.getid_cliente());
				detallerecapSessionBean.setid_cliente(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdDetalleCliente")) {
				this.setid_detalle_clienteFK_IdDetalleCliente(detallerecapSessionBean.getid_detalle_cliente());
				detallerecapSessionBean.setid_detalle_cliente(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdEjercicio")) {
				this.setid_ejercicioFK_IdEjercicio(detallerecapSessionBean.getid_ejercicio());
				detallerecapSessionBean.setid_ejercicio(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(detallerecapSessionBean.getid_empresa());
				detallerecapSessionBean.setid_empresa(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdRecap")) {
				this.setid_recapFK_IdRecap(detallerecapSessionBean.getid_recap());
				detallerecapSessionBean.setid_recap(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdSucursal")) {
				this.setid_sucursalFK_IdSucursal(detallerecapSessionBean.getid_sucursal());
				detallerecapSessionBean.setid_sucursal(-1L);
			}
		}
		
		this.detallerecapSessionBean.setsUltimaBusquedaDetalleRecap("");
		this.detallerecapSessionBean.setiNumeroPaginacion(DetalleRecapConstantesFunciones.INUMEROPAGINACION);
		this.detallerecapSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaDetalleRecap(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioDetalleRecap() {
		this.updateBorderResaltarBusquedasFormularioDetalleRecap();
		this.updateVisibilidadBusquedasFormularioDetalleRecap();
		this.updateHabilitarBusquedasFormularioDetalleRecap();
	}
	
	public void updateBorderResaltarBusquedasFormularioDetalleRecap() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasDetalleRecap.getComponents().length>0) {
	

		if(this.detallerecapConstantesFunciones.resaltarFK_IdClienteDetalleRecap!=null) {
			index= this.jTabbedPaneBusquedasDetalleRecap.indexOfComponent(this.jPanelFK_IdClienteDetalleRecap);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasDetalleRecap.getComponent(index);
				jPanel.setBorder(this.detallerecapConstantesFunciones.resaltarFK_IdClienteDetalleRecap);
			}
		}

		if(this.detallerecapConstantesFunciones.resaltarFK_IdDetalleClienteDetalleRecap!=null) {
			index= this.jTabbedPaneBusquedasDetalleRecap.indexOfComponent(this.jPanelFK_IdDetalleClienteDetalleRecap);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasDetalleRecap.getComponent(index);
				jPanel.setBorder(this.detallerecapConstantesFunciones.resaltarFK_IdDetalleClienteDetalleRecap);
			}
		}

		if(this.detallerecapConstantesFunciones.resaltarFK_IdRecapDetalleRecap!=null) {
			index= this.jTabbedPaneBusquedasDetalleRecap.indexOfComponent(this.jPanelFK_IdRecapDetalleRecap);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasDetalleRecap.getComponent(index);
				jPanel.setBorder(this.detallerecapConstantesFunciones.resaltarFK_IdRecapDetalleRecap);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioDetalleRecap() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasDetalleRecap.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasDetalleRecap.indexOfComponent(this.jPanelFK_IdClienteDetalleRecap);
			jPanel=(JPanel)this.jTabbedPaneBusquedasDetalleRecap.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.detallerecapConstantesFunciones.mostrarFK_IdClienteDetalleRecap);
			if(!this.detallerecapConstantesFunciones.mostrarFK_IdClienteDetalleRecap && index>-1) {
				this.jTabbedPaneBusquedasDetalleRecap.remove(index);
			}

			index= this.jTabbedPaneBusquedasDetalleRecap.indexOfComponent(this.jPanelFK_IdDetalleClienteDetalleRecap);
			jPanel=(JPanel)this.jTabbedPaneBusquedasDetalleRecap.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.detallerecapConstantesFunciones.mostrarFK_IdDetalleClienteDetalleRecap);
			if(!this.detallerecapConstantesFunciones.mostrarFK_IdDetalleClienteDetalleRecap && index>-1) {
				this.jTabbedPaneBusquedasDetalleRecap.remove(index);
			}

			index= this.jTabbedPaneBusquedasDetalleRecap.indexOfComponent(this.jPanelFK_IdRecapDetalleRecap);
			jPanel=(JPanel)this.jTabbedPaneBusquedasDetalleRecap.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.detallerecapConstantesFunciones.mostrarFK_IdRecapDetalleRecap);
			if(!this.detallerecapConstantesFunciones.mostrarFK_IdRecapDetalleRecap && index>-1) {
				this.jTabbedPaneBusquedasDetalleRecap.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioDetalleRecap() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasDetalleRecap.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasDetalleRecap.indexOfComponent(this.jPanelFK_IdClienteDetalleRecap);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasDetalleRecap.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.detallerecapConstantesFunciones.activarFK_IdClienteDetalleRecap);
				this.jTabbedPaneBusquedasDetalleRecap.setEnabledAt(index,this.detallerecapConstantesFunciones.activarFK_IdClienteDetalleRecap);
			}

			index= this.jTabbedPaneBusquedasDetalleRecap.indexOfComponent(this.jPanelFK_IdDetalleClienteDetalleRecap);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasDetalleRecap.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.detallerecapConstantesFunciones.activarFK_IdDetalleClienteDetalleRecap);
				this.jTabbedPaneBusquedasDetalleRecap.setEnabledAt(index,this.detallerecapConstantesFunciones.activarFK_IdDetalleClienteDetalleRecap);
			}

			index= this.jTabbedPaneBusquedasDetalleRecap.indexOfComponent(this.jPanelFK_IdRecapDetalleRecap);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasDetalleRecap.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.detallerecapConstantesFunciones.activarFK_IdRecapDetalleRecap);
				this.jTabbedPaneBusquedasDetalleRecap.setEnabledAt(index,this.detallerecapConstantesFunciones.activarFK_IdRecapDetalleRecap);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaDetalleRecap(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("FK_IdCliente")) {
			index= this.jTabbedPaneBusquedasDetalleRecap.indexOfComponent(this.jPanelFK_IdClienteDetalleRecap);

			this.jTabbedPaneBusquedasDetalleRecap.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasDetalleRecap.getComponent(index);

			this.detallerecapConstantesFunciones.setResaltarFK_IdClienteDetalleRecap(resaltar);

			jPanel.setBorder(this.detallerecapConstantesFunciones.resaltarFK_IdClienteDetalleRecap);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdDetalleCliente")) {
			index= this.jTabbedPaneBusquedasDetalleRecap.indexOfComponent(this.jPanelFK_IdDetalleClienteDetalleRecap);

			this.jTabbedPaneBusquedasDetalleRecap.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasDetalleRecap.getComponent(index);

			this.detallerecapConstantesFunciones.setResaltarFK_IdDetalleClienteDetalleRecap(resaltar);

			jPanel.setBorder(this.detallerecapConstantesFunciones.resaltarFK_IdDetalleClienteDetalleRecap);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdRecap")) {
			index= this.jTabbedPaneBusquedasDetalleRecap.indexOfComponent(this.jPanelFK_IdRecapDetalleRecap);

			this.jTabbedPaneBusquedasDetalleRecap.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasDetalleRecap.getComponent(index);

			this.detallerecapConstantesFunciones.setResaltarFK_IdRecapDetalleRecap(resaltar);

			jPanel.setBorder(this.detallerecapConstantesFunciones.resaltarFK_IdRecapDetalleRecap);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarDetalleRecap.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioDetalleRecap() throws Exception {

		if(this.jInternalFrameDetalleFormDetalleRecap==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioDetalleRecap();
		this.updateVisibilidadResaltarControlesFormularioDetalleRecap();
		this.updateHabilitarResaltarControlesFormularioDetalleRecap();
		
	}
	
	public void updateBorderResaltarControlesFormularioDetalleRecap() throws Exception {
		if(this.jInternalFrameDetalleFormDetalleRecap==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.detallerecapConstantesFunciones.resaltaridDetalleRecap!=null && this.jInternalFrameDetalleFormDetalleRecap!=null) {this.jInternalFrameDetalleFormDetalleRecap.jLabelidDetalleRecap.setBorder(this.detallerecapConstantesFunciones.resaltaridDetalleRecap);}
		if(this.detallerecapConstantesFunciones.resaltarid_recapDetalleRecap!=null && this.jInternalFrameDetalleFormDetalleRecap!=null) {this.jInternalFrameDetalleFormDetalleRecap.jComboBoxid_recapDetalleRecap.setBorder(this.detallerecapConstantesFunciones.resaltarid_recapDetalleRecap);}
		if(this.detallerecapConstantesFunciones.resaltarid_empresaDetalleRecap!=null && this.jInternalFrameDetalleFormDetalleRecap!=null) {this.jInternalFrameDetalleFormDetalleRecap.jComboBoxid_empresaDetalleRecap.setBorder(this.detallerecapConstantesFunciones.resaltarid_empresaDetalleRecap);}
		if(this.detallerecapConstantesFunciones.resaltarid_sucursalDetalleRecap!=null && this.jInternalFrameDetalleFormDetalleRecap!=null) {this.jInternalFrameDetalleFormDetalleRecap.jComboBoxid_sucursalDetalleRecap.setBorder(this.detallerecapConstantesFunciones.resaltarid_sucursalDetalleRecap);}
		if(this.detallerecapConstantesFunciones.resaltarid_ejercicioDetalleRecap!=null && this.jInternalFrameDetalleFormDetalleRecap!=null) {this.jInternalFrameDetalleFormDetalleRecap.jComboBoxid_ejercicioDetalleRecap.setBorder(this.detallerecapConstantesFunciones.resaltarid_ejercicioDetalleRecap);}
		if(this.detallerecapConstantesFunciones.resaltarid_detalle_clienteDetalleRecap!=null && this.jInternalFrameDetalleFormDetalleRecap!=null) {this.jInternalFrameDetalleFormDetalleRecap.jComboBoxid_detalle_clienteDetalleRecap.setBorder(this.detallerecapConstantesFunciones.resaltarid_detalle_clienteDetalleRecap);}
		if(this.detallerecapConstantesFunciones.resaltarid_clienteDetalleRecap!=null && this.jInternalFrameDetalleFormDetalleRecap!=null) {this.jInternalFrameDetalleFormDetalleRecap.jComboBoxid_clienteDetalleRecap.setBorder(this.detallerecapConstantesFunciones.resaltarid_clienteDetalleRecap);}
		if(this.detallerecapConstantesFunciones.resaltarvalorDetalleRecap!=null && this.jInternalFrameDetalleFormDetalleRecap!=null) {this.jInternalFrameDetalleFormDetalleRecap.jTextFieldvalorDetalleRecap.setBorder(this.detallerecapConstantesFunciones.resaltarvalorDetalleRecap);}
		if(this.detallerecapConstantesFunciones.resaltariva_porcentajeDetalleRecap!=null && this.jInternalFrameDetalleFormDetalleRecap!=null) {this.jInternalFrameDetalleFormDetalleRecap.jTextFieldiva_porcentajeDetalleRecap.setBorder(this.detallerecapConstantesFunciones.resaltariva_porcentajeDetalleRecap);}
		if(this.detallerecapConstantesFunciones.resaltartotalDetalleRecap!=null && this.jInternalFrameDetalleFormDetalleRecap!=null) {this.jInternalFrameDetalleFormDetalleRecap.jTextFieldtotalDetalleRecap.setBorder(this.detallerecapConstantesFunciones.resaltartotalDetalleRecap);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioDetalleRecap() throws Exception {		
		if(this.jInternalFrameDetalleFormDetalleRecap==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormDetalleRecap!=null) {
	
		//this.jInternalFrameDetalleFormDetalleRecap.jLabelidDetalleRecap.setVisible(this.detallerecapConstantesFunciones.mostraridDetalleRecap);
		this.jInternalFrameDetalleFormDetalleRecap.jPanelidDetalleRecap.setVisible(this.detallerecapConstantesFunciones.mostraridDetalleRecap);
		//this.jInternalFrameDetalleFormDetalleRecap.jComboBoxid_recapDetalleRecap.setVisible(this.detallerecapConstantesFunciones.mostrarid_recapDetalleRecap);
		this.jInternalFrameDetalleFormDetalleRecap.jPanelid_recapDetalleRecap.setVisible(this.detallerecapConstantesFunciones.mostrarid_recapDetalleRecap);
		//this.jInternalFrameDetalleFormDetalleRecap.jComboBoxid_empresaDetalleRecap.setVisible(this.detallerecapConstantesFunciones.mostrarid_empresaDetalleRecap);
		this.jInternalFrameDetalleFormDetalleRecap.jPanelid_empresaDetalleRecap.setVisible(this.detallerecapConstantesFunciones.mostrarid_empresaDetalleRecap);
		//this.jInternalFrameDetalleFormDetalleRecap.jComboBoxid_sucursalDetalleRecap.setVisible(this.detallerecapConstantesFunciones.mostrarid_sucursalDetalleRecap);
		this.jInternalFrameDetalleFormDetalleRecap.jPanelid_sucursalDetalleRecap.setVisible(this.detallerecapConstantesFunciones.mostrarid_sucursalDetalleRecap);
		//this.jInternalFrameDetalleFormDetalleRecap.jComboBoxid_ejercicioDetalleRecap.setVisible(this.detallerecapConstantesFunciones.mostrarid_ejercicioDetalleRecap);
		this.jInternalFrameDetalleFormDetalleRecap.jPanelid_ejercicioDetalleRecap.setVisible(this.detallerecapConstantesFunciones.mostrarid_ejercicioDetalleRecap);
		//this.jInternalFrameDetalleFormDetalleRecap.jComboBoxid_detalle_clienteDetalleRecap.setVisible(this.detallerecapConstantesFunciones.mostrarid_detalle_clienteDetalleRecap);
		this.jInternalFrameDetalleFormDetalleRecap.jPanelid_detalle_clienteDetalleRecap.setVisible(this.detallerecapConstantesFunciones.mostrarid_detalle_clienteDetalleRecap);
		//this.jInternalFrameDetalleFormDetalleRecap.jComboBoxid_clienteDetalleRecap.setVisible(this.detallerecapConstantesFunciones.mostrarid_clienteDetalleRecap);
		this.jInternalFrameDetalleFormDetalleRecap.jPanelid_clienteDetalleRecap.setVisible(this.detallerecapConstantesFunciones.mostrarid_clienteDetalleRecap);
			this.jInternalFrameDetalleFormDetalleRecap.jButtonid_clienteDetalleRecap.setVisible(this.detallerecapConstantesFunciones.mostrarid_clienteDetalleRecap);
		//this.jInternalFrameDetalleFormDetalleRecap.jTextFieldvalorDetalleRecap.setVisible(this.detallerecapConstantesFunciones.mostrarvalorDetalleRecap);
		this.jInternalFrameDetalleFormDetalleRecap.jPanelvalorDetalleRecap.setVisible(this.detallerecapConstantesFunciones.mostrarvalorDetalleRecap);
		//this.jInternalFrameDetalleFormDetalleRecap.jTextFieldiva_porcentajeDetalleRecap.setVisible(this.detallerecapConstantesFunciones.mostrariva_porcentajeDetalleRecap);
		this.jInternalFrameDetalleFormDetalleRecap.jPaneliva_porcentajeDetalleRecap.setVisible(this.detallerecapConstantesFunciones.mostrariva_porcentajeDetalleRecap);
		//this.jInternalFrameDetalleFormDetalleRecap.jTextFieldtotalDetalleRecap.setVisible(this.detallerecapConstantesFunciones.mostrartotalDetalleRecap);
		this.jInternalFrameDetalleFormDetalleRecap.jPaneltotalDetalleRecap.setVisible(this.detallerecapConstantesFunciones.mostrartotalDetalleRecap);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioDetalleRecap() throws Exception {
		if(this.jInternalFrameDetalleFormDetalleRecap==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormDetalleRecap!=null) {
	
		this.jInternalFrameDetalleFormDetalleRecap.jLabelidDetalleRecap.setEnabled(this.detallerecapConstantesFunciones.activaridDetalleRecap);
		this.jInternalFrameDetalleFormDetalleRecap.jComboBoxid_recapDetalleRecap.setEnabled(this.detallerecapConstantesFunciones.activarid_recapDetalleRecap);
		this.jInternalFrameDetalleFormDetalleRecap.jComboBoxid_empresaDetalleRecap.setEnabled(this.detallerecapConstantesFunciones.activarid_empresaDetalleRecap);
		this.jInternalFrameDetalleFormDetalleRecap.jComboBoxid_sucursalDetalleRecap.setEnabled(this.detallerecapConstantesFunciones.activarid_sucursalDetalleRecap);
		this.jInternalFrameDetalleFormDetalleRecap.jComboBoxid_ejercicioDetalleRecap.setEnabled(this.detallerecapConstantesFunciones.activarid_ejercicioDetalleRecap);
		this.jInternalFrameDetalleFormDetalleRecap.jComboBoxid_detalle_clienteDetalleRecap.setEnabled(this.detallerecapConstantesFunciones.activarid_detalle_clienteDetalleRecap);
		this.jInternalFrameDetalleFormDetalleRecap.jComboBoxid_clienteDetalleRecap.setEnabled(this.detallerecapConstantesFunciones.activarid_clienteDetalleRecap);
			this.jInternalFrameDetalleFormDetalleRecap.jButtonid_clienteDetalleRecap.setEnabled(this.detallerecapConstantesFunciones.activarid_clienteDetalleRecap);
		this.jInternalFrameDetalleFormDetalleRecap.jTextFieldvalorDetalleRecap.setEnabled(this.detallerecapConstantesFunciones.activarvalorDetalleRecap);
		this.jInternalFrameDetalleFormDetalleRecap.jTextFieldiva_porcentajeDetalleRecap.setEnabled(this.detallerecapConstantesFunciones.activariva_porcentajeDetalleRecap);
		this.jInternalFrameDetalleFormDetalleRecap.jTextFieldtotalDetalleRecap.setEnabled(this.detallerecapConstantesFunciones.activartotalDetalleRecap);
		}
	}
	
		
}