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
package com.bydan.erp.puntoventa.presentation.swing.jinternalframes.report;




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

//import com.bydan.erp.puntoventa.util.ComprobanteTarjetaConstantesFunciones;
import com.bydan.erp.puntoventa.util.report.ComprobanteTarjetaParameterReturnGeneral;
//import com.bydan.erp.puntoventa.util.report.ComprobanteTarjetaParameterGeneral;
//import com.bydan.erp.puntoventa.presentation.report.source.report.ComprobanteTarjetaBean;
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

import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.auxiliar.report.*;
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
import com.bydan.erp.puntoventa.resources.reportes.report.AuxiliarReportes;

import com.bydan.erp.puntoventa.util.*;

import com.bydan.erp.puntoventa.util.report.*;
import com.bydan.erp.puntoventa.business.logic.report.*;

import com.bydan.erp.seguridad.business.logic.*;
import com.bydan.erp.cartera.business.logic.*;
import com.bydan.erp.puntoventa.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.puntoventa.business.entity.*;
import com.bydan.erp.puntoventa.business.entity.report.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.*;

import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar.*;
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


import com.bydan.erp.puntoventa.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.puntoventa.presentation.web.jsf.sessionbean.report.*;

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
import com.bydan.erp.puntoventa.business.entity.*;
import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.cartera.util.*;
import com.bydan.erp.puntoventa.util.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.puntoventa.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class ComprobanteTarjetaBeanSwingJInternalFrame extends ComprobanteTarjetaJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(ComprobanteTarjetaBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<ComprobanteTarjeta> comprobantetarjetaValidator = new ClassValidator<ComprobanteTarjeta>(ComprobanteTarjeta.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public ComprobanteTarjeta comprobantetarjeta;	
	public ComprobanteTarjeta comprobantetarjetaAux;
	public ComprobanteTarjeta comprobantetarjetaAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public ComprobanteTarjeta comprobantetarjetaTotales;
	public Long idComprobanteTarjetaActual;
	public Long iIdNuevoComprobanteTarjeta=0L;
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

	public String sFinalQueryComboCaja="";

	public List<Caja> cajasForeignKey;

	public List<Caja> getcajasForeignKey() {
		return cajasForeignKey;
	}

	public void setcajasForeignKey(List<Caja> cajasForeignKey) {
		this.cajasForeignKey = cajasForeignKey;
	}

	//OBJETO FK ACTUAL
	public Caja cajaForeignKey;

	public Caja getcajaForeignKey() {
		return cajaForeignKey;
	}

	public void setcajaForeignKey(Caja cajaForeignKey) {
		this.cajaForeignKey = cajaForeignKey;
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
	
	public Boolean isPermisoTodoComprobanteTarjeta;
	public Boolean isPermisoNuevoComprobanteTarjeta;
	public Boolean isPermisoActualizarComprobanteTarjeta;
	public Boolean isPermisoActualizarOriginalComprobanteTarjeta;
	public Boolean isPermisoEliminarComprobanteTarjeta;
	public Boolean isPermisoGuardarCambiosComprobanteTarjeta;
	public Boolean isPermisoConsultaComprobanteTarjeta;
	public Boolean isPermisoBusquedaComprobanteTarjeta;
	public Boolean isPermisoReporteComprobanteTarjeta;
	public Boolean isPermisoPaginacionMedioComprobanteTarjeta;
	public Boolean isPermisoPaginacionAltoComprobanteTarjeta;
	public Boolean isPermisoPaginacionTodoComprobanteTarjeta;
	public Boolean isPermisoCopiarComprobanteTarjeta;
	public Boolean isPermisoVerFormComprobanteTarjeta;
	public Boolean isPermisoDuplicarComprobanteTarjeta;
	public Boolean isPermisoOrdenComprobanteTarjeta;
	
	
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
	
	public ComprobanteTarjetaParameterReturnGeneral comprobantetarjetaReturnGeneral;
	public ComprobanteTarjetaParameterReturnGeneral comprobantetarjetaParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoComprobanteTarjeta=false;
	public Boolean esParaAccionDesdeFormularioComprobanteTarjeta=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected ComprobanteTarjetaSessionBeanAdditional comprobantetarjetaSessionBeanAdditional=null;
	
	public ComprobanteTarjetaSessionBeanAdditional getComprobanteTarjetaSessionBeanAdditional() {
		return this.comprobantetarjetaSessionBeanAdditional;
	}
	
	public void setComprobanteTarjetaSessionBeanAdditional(ComprobanteTarjetaSessionBeanAdditional comprobantetarjetaSessionBeanAdditional) {
		try {
			this.comprobantetarjetaSessionBeanAdditional=comprobantetarjetaSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected ComprobanteTarjetaBeanSwingJInternalFrameAdditional comprobantetarjetaBeanSwingJInternalFrameAdditional=null;
	//public class ComprobanteTarjetaBeanSwingJInternalFrame
	
	public ComprobanteTarjetaBeanSwingJInternalFrameAdditional getComprobanteTarjetaBeanSwingJInternalFrameAdditional() {
		return this.comprobantetarjetaBeanSwingJInternalFrameAdditional;
	}
	
	public void setComprobanteTarjetaBeanSwingJInternalFrameAdditional(ComprobanteTarjetaBeanSwingJInternalFrameAdditional comprobantetarjetaBeanSwingJInternalFrameAdditional) {
		try {
			this.comprobantetarjetaBeanSwingJInternalFrameAdditional=comprobantetarjetaBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public ComprobanteTarjetaLogic comprobantetarjetaLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public ComprobanteTarjeta comprobantetarjetaBean;
	public ComprobanteTarjetaConstantesFunciones comprobantetarjetaConstantesFunciones;
	//public ComprobanteTarjetaParameterReturnGeneral comprobantetarjetaReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	public SucursalLogic sucursalLogic;
	public ClienteLogic clienteLogic;
	public CajaLogic cajaLogic;
	
	//PARAMETROS
	
	
	//public List<ComprobanteTarjeta> comprobantetarjetas;	
	//public List<ComprobanteTarjeta> comprobantetarjetasEliminados;
	//public List<ComprobanteTarjeta> comprobantetarjetasAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoComprobanteTarjeta=false;
	public Boolean isVisibilidadCeldaDuplicarComprobanteTarjeta=true;
	public Boolean isVisibilidadCeldaCopiarComprobanteTarjeta=true;
	public Boolean isVisibilidadCeldaVerFormComprobanteTarjeta=true;
	public Boolean isVisibilidadCeldaOrdenComprobanteTarjeta=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesComprobanteTarjeta=false;
	public Boolean isVisibilidadCeldaModificarComprobanteTarjeta=false;
	public Boolean isVisibilidadCeldaActualizarComprobanteTarjeta=false;
	public Boolean isVisibilidadCeldaEliminarComprobanteTarjeta=false;
	public Boolean isVisibilidadCeldaCancelarComprobanteTarjeta=false;
	public Boolean isVisibilidadCeldaGuardarComprobanteTarjeta=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosComprobanteTarjeta=false;	
	
	
	public Boolean isVisibilidadBusquedaComprobanteTarjeta=false;
	public Boolean isVisibilidadFK_IdCaja=false;
	public Boolean isVisibilidadFK_IdCliente=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	public Boolean isVisibilidadFK_IdSucursal=false;
	
	public Long getiIdNuevoComprobanteTarjeta() {
		return this.iIdNuevoComprobanteTarjeta;
	}

	public void setiIdNuevoComprobanteTarjeta(Long iIdNuevoComprobanteTarjeta) {
		this.iIdNuevoComprobanteTarjeta = iIdNuevoComprobanteTarjeta;
	}
	
	public Long getidComprobanteTarjetaActual() {
		return this.idComprobanteTarjetaActual;
	}

	public void setidComprobanteTarjetaActual(Long idComprobanteTarjetaActual) {
		this.idComprobanteTarjetaActual = idComprobanteTarjetaActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public ComprobanteTarjeta getcomprobantetarjeta() {
		return this.comprobantetarjeta;
	}

	public void setcomprobantetarjeta(ComprobanteTarjeta comprobantetarjeta) {
		this.comprobantetarjeta = comprobantetarjeta;
	}
	
	public ComprobanteTarjeta getcomprobantetarjetaAux() {
		return this.comprobantetarjetaAux;
	}

	public void setcomprobantetarjetaAux(ComprobanteTarjeta comprobantetarjetaAux) {
		this.comprobantetarjetaAux = comprobantetarjetaAux;
	}				
	
	public ComprobanteTarjeta getcomprobantetarjetaAnterior() {
		return this.comprobantetarjetaAnterior;
	}

	public void setcomprobantetarjetaAnterior(ComprobanteTarjeta comprobantetarjetaAnterior) {
		this.comprobantetarjetaAnterior = comprobantetarjetaAnterior;
	}	
	
	public ComprobanteTarjeta getcomprobantetarjetaTotales() {
		return this.comprobantetarjetaTotales;
	}

	public void setcomprobantetarjetaTotales(ComprobanteTarjeta comprobantetarjetaTotales) {
		this.comprobantetarjetaTotales = comprobantetarjetaTotales;
	}	
	
	public ComprobanteTarjeta getcomprobantetarjetaBean() {
		return this.comprobantetarjetaBean;
	}

	public void setcomprobantetarjetaBean(ComprobanteTarjeta comprobantetarjetaBean) {
		this.comprobantetarjetaBean = comprobantetarjetaBean;
	}	
	
	public ComprobanteTarjetaParameterReturnGeneral getcomprobantetarjetaReturnGeneral() {
		return this.comprobantetarjetaReturnGeneral;
	}

	public void setcomprobantetarjetaReturnGeneral(ComprobanteTarjetaParameterReturnGeneral comprobantetarjetaReturnGeneral) {
		this.comprobantetarjetaReturnGeneral = comprobantetarjetaReturnGeneral;
	}	
	
	
	public Date fecha_inicioBusquedaComprobanteTarjeta=new Date();

	public Date getfecha_inicioBusquedaComprobanteTarjeta() {
		return this.fecha_inicioBusquedaComprobanteTarjeta;
	}

	public void setfecha_inicioBusquedaComprobanteTarjeta(Date fecha_inicioBusquedaComprobanteTarjeta) {
		this.fecha_inicioBusquedaComprobanteTarjeta = fecha_inicioBusquedaComprobanteTarjeta;
	}

;
	public Date fecha_finBusquedaComprobanteTarjeta=new Date();

	public Date getfecha_finBusquedaComprobanteTarjeta() {
		return this.fecha_finBusquedaComprobanteTarjeta;
	}

	public void setfecha_finBusquedaComprobanteTarjeta(Date fecha_finBusquedaComprobanteTarjeta) {
		this.fecha_finBusquedaComprobanteTarjeta = fecha_finBusquedaComprobanteTarjeta;
	}

	public Long id_cajaFK_IdCaja=-1L;

	public Long getid_cajaFK_IdCaja() {
		return this.id_cajaFK_IdCaja;
	}

	public void setid_cajaFK_IdCaja(Long id_cajaFK_IdCaja) {
		this.id_cajaFK_IdCaja = id_cajaFK_IdCaja;
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

	public Long id_sucursalFK_IdSucursal=-1L;

	public Long getid_sucursalFK_IdSucursal() {
		return this.id_sucursalFK_IdSucursal;
	}

	public void setid_sucursalFK_IdSucursal(Long id_sucursalFK_IdSucursal) {
		this.id_sucursalFK_IdSucursal = id_sucursalFK_IdSucursal;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public ComprobanteTarjetaLogic getComprobanteTarjetaLogic()	{		
		return comprobantetarjetaLogic;
	}

	public void setComprobanteTarjetaLogic(ComprobanteTarjetaLogic comprobantetarjetaLogic) {
		this.comprobantetarjetaLogic = comprobantetarjetaLogic;
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
	
	public Boolean getIsEsNuevoComprobanteTarjeta() {
		return isEsNuevoComprobanteTarjeta;
	}

	public void setIsEsNuevoComprobanteTarjeta(Boolean isEsNuevoComprobanteTarjeta) {
		this.isEsNuevoComprobanteTarjeta = isEsNuevoComprobanteTarjeta;
	}

	public Boolean getEsParaAccionDesdeFormularioComprobanteTarjeta() {
		return esParaAccionDesdeFormularioComprobanteTarjeta;
	}
	
	public void setEsParaAccionDesdeFormularioComprobanteTarjeta(Boolean esParaAccionDesdeFormularioComprobanteTarjeta) {
		this.esParaAccionDesdeFormularioComprobanteTarjeta = esParaAccionDesdeFormularioComprobanteTarjeta;
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

			if(this.comprobantetarjetaSessionBean==null) {
				this.comprobantetarjetaSessionBean=new ComprobanteTarjetaSessionBean();
			}

			if(!this.comprobantetarjetaSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(comprobantetarjetaSessionBean.getlidEmpresaActual());
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

			if(this.comprobantetarjetaSessionBean==null) {
				this.comprobantetarjetaSessionBean=new ComprobanteTarjetaSessionBean();
			}

			if(!this.comprobantetarjetaSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
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
					sucursalLogic.getEntityWithConnection(comprobantetarjetaSessionBean.getlidSucursalActual());
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

			if(this.comprobantetarjetaSessionBean==null) {
				this.comprobantetarjetaSessionBean=new ComprobanteTarjetaSessionBean();
			}

			if(!this.comprobantetarjetaSessionBean.getisBusquedaDesdeForeignKeySesionCliente()) {
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
					clienteLogic.getEntityWithConnection(comprobantetarjetaSessionBean.getlidClienteActual());
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

	public void cargarCombosCajasForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.cajasForeignKey=new ArrayList<Caja>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			CajaLogic cajaLogic=new CajaLogic();

			//cajaLogic.getCajaDataAccess().setIsForForeingKeyData(true);

			if(this.comprobantetarjetaSessionBean==null) {
				this.comprobantetarjetaSessionBean=new ComprobanteTarjetaSessionBean();
			}

			if(!this.comprobantetarjetaSessionBean.getisBusquedaDesdeForeignKeySesionCaja()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//cajaLogic.getCajaDataAccess().setIsForForeingKeyData(true);

					cajaLogic.getTodosCajasWithConnection(sFinalQuery,new Pagination());

					this.cajasForeignKey=cajaLogic.getCajas();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaCaja(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					cajaLogic.getEntityWithConnection(comprobantetarjetaSessionBean.getlidCajaActual());
					this.cajasForeignKey.add(cajaLogic.getCaja());
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

					if(this.comprobantetarjeta!=null) {
						this.comprobantetarjeta.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormComprobanteTarjeta!=null) {
						this.jInternalFrameDetalleFormComprobanteTarjeta.jComboBoxid_empresaComprobanteTarjeta.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaComprobanteTarjeta.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormComprobanteTarjeta!=null) {
						if(this.jInternalFrameDetalleFormComprobanteTarjeta.jComboBoxid_empresaComprobanteTarjeta.getItemCount()>0) {
							this.jInternalFrameDetalleFormComprobanteTarjeta.jComboBoxid_empresaComprobanteTarjeta.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaComprobanteTarjetaGenerico)throws Exception
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
				jComboBoxid_empresaComprobanteTarjetaGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaComprobanteTarjetaGenerico!=null && jComboBoxid_empresaComprobanteTarjetaGenerico.getItemCount()>0) {
					jComboBoxid_empresaComprobanteTarjetaGenerico.setSelectedIndex(0);
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

					if(this.comprobantetarjeta!=null) {
						this.comprobantetarjeta.setSucursal(sucursalTemp);
					}

					if(this.jInternalFrameDetalleFormComprobanteTarjeta!=null) {
						this.jInternalFrameDetalleFormComprobanteTarjeta.jComboBoxid_sucursalComprobanteTarjeta.setSelectedItem(sucursalTemp);
					}
				} else {
					//jComboBoxid_sucursalComprobanteTarjeta.setSelectedItem(sucursalTemp);
					if(this.jInternalFrameDetalleFormComprobanteTarjeta!=null) {
						if(this.jInternalFrameDetalleFormComprobanteTarjeta.jComboBoxid_sucursalComprobanteTarjeta.getItemCount()>0) {
							this.jInternalFrameDetalleFormComprobanteTarjeta.jComboBoxid_sucursalComprobanteTarjeta.setSelectedIndex(0);
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
	public void setActualSucursalForeignKeyGenerico(Long idSucursalSeleccionado,JComboBox jComboBoxid_sucursalComprobanteTarjetaGenerico)throws Exception
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
				jComboBoxid_sucursalComprobanteTarjetaGenerico.setSelectedItem(sucursalTemp);
			} else {
				if(jComboBoxid_sucursalComprobanteTarjetaGenerico!=null && jComboBoxid_sucursalComprobanteTarjetaGenerico.getItemCount()>0) {
					jComboBoxid_sucursalComprobanteTarjetaGenerico.setSelectedIndex(0);
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

					if(this.comprobantetarjeta!=null) {
						this.comprobantetarjeta.setCliente(clienteTemp);
					}

					if(this.jInternalFrameDetalleFormComprobanteTarjeta!=null) {
						this.jInternalFrameDetalleFormComprobanteTarjeta.jComboBoxid_clienteComprobanteTarjeta.setSelectedItem(clienteTemp);
					}
				} else {
					//jComboBoxid_clienteComprobanteTarjeta.setSelectedItem(clienteTemp);
					if(this.jInternalFrameDetalleFormComprobanteTarjeta!=null) {
						if(this.jInternalFrameDetalleFormComprobanteTarjeta.jComboBoxid_clienteComprobanteTarjeta.getItemCount()>0) {
							this.jInternalFrameDetalleFormComprobanteTarjeta.jComboBoxid_clienteComprobanteTarjeta.setSelectedIndex(0);
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
	public void setActualClienteForeignKeyGenerico(Long idClienteSeleccionado,JComboBox jComboBoxid_clienteComprobanteTarjetaGenerico)throws Exception
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
				jComboBoxid_clienteComprobanteTarjetaGenerico.setSelectedItem(clienteTemp);
			} else {
				if(jComboBoxid_clienteComprobanteTarjetaGenerico!=null && jComboBoxid_clienteComprobanteTarjetaGenerico.getItemCount()>0) {
					jComboBoxid_clienteComprobanteTarjetaGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualCajaForeignKey(Long idCajaSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Caja  cajaTemp=null;

			for(Caja cajaAux:cajasForeignKey) {
				if(cajaAux.getId()!=null && cajaAux.getId().equals(idCajaSeleccionado)) {
					cajaTemp=cajaAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(cajaTemp!=null) {

					if(this.comprobantetarjeta!=null) {
						this.comprobantetarjeta.setCaja(cajaTemp);
					}

					if(this.jInternalFrameDetalleFormComprobanteTarjeta!=null) {
						this.jInternalFrameDetalleFormComprobanteTarjeta.jComboBoxid_cajaComprobanteTarjeta.setSelectedItem(cajaTemp);
					}
				} else {
					//jComboBoxid_cajaComprobanteTarjeta.setSelectedItem(cajaTemp);
					if(this.jInternalFrameDetalleFormComprobanteTarjeta!=null) {
						if(this.jInternalFrameDetalleFormComprobanteTarjeta.jComboBoxid_cajaComprobanteTarjeta.getItemCount()>0) {
							this.jInternalFrameDetalleFormComprobanteTarjeta.jComboBoxid_cajaComprobanteTarjeta.setSelectedIndex(0);
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

	public String getActualCajaForeignKeyDescripcion(Long idCajaSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Caja  cajaTemp=null;

			for(Caja cajaAux:cajasForeignKey) {
				if(cajaAux.getId()!=null && cajaAux.getId().equals(idCajaSeleccionado)) {
					cajaTemp=cajaAux;
					break;
				}
			}


			sDescripcion=CajaConstantesFunciones.getCajaDescripcion(cajaTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualCajaForeignKeyGenerico(Long idCajaSeleccionado,JComboBox jComboBoxid_cajaComprobanteTarjetaGenerico)throws Exception
	{
		try
		{
			Caja  cajaTemp=null;

			for(Caja cajaAux:cajasForeignKey) {
				if(cajaAux.getId()!=null && cajaAux.getId().equals(idCajaSeleccionado)) {
					cajaTemp=cajaAux;
					break;
				}
			}

			if(cajaTemp!=null) {
				jComboBoxid_cajaComprobanteTarjetaGenerico.setSelectedItem(cajaTemp);
			} else {
				if(jComboBoxid_cajaComprobanteTarjetaGenerico!=null && jComboBoxid_cajaComprobanteTarjetaGenerico.getItemCount()>0) {
					jComboBoxid_cajaComprobanteTarjetaGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(ComprobanteTarjeta comprobantetarjeta,JComboBox jComboBoxid_empresaComprobanteTarjetaGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaComprobanteTarjetaGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormComprobanteTarjeta.jComboBoxid_empresaComprobanteTarjeta.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaComprobanteTarjetaGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				comprobantetarjeta.setid_empresa(empresaAux.getId());
				comprobantetarjeta.setempresa_descripcion(ComprobanteTarjetaConstantesFunciones.getEmpresaDescripcion(empresaAux));
				comprobantetarjeta.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarSucursalForeignKey(ComprobanteTarjeta comprobantetarjeta,JComboBox jComboBoxid_sucursalComprobanteTarjetaGenerico)throws Exception
	{
		try
		{
			Sucursal  sucursalAux=new Sucursal();

			if(jComboBoxid_sucursalComprobanteTarjetaGenerico==null) {
				sucursalAux=(Sucursal)this.jInternalFrameDetalleFormComprobanteTarjeta.jComboBoxid_sucursalComprobanteTarjeta.getSelectedItem();
			} else {
				sucursalAux=(Sucursal)jComboBoxid_sucursalComprobanteTarjetaGenerico.getSelectedItem();
			}

			if(sucursalAux!=null && sucursalAux.getId()!=null) {
				comprobantetarjeta.setid_sucursal(sucursalAux.getId());
				comprobantetarjeta.setsucursal_descripcion(ComprobanteTarjetaConstantesFunciones.getSucursalDescripcion(sucursalAux));
				comprobantetarjeta.setSucursal(sucursalAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarClienteForeignKey(ComprobanteTarjeta comprobantetarjeta,JComboBox jComboBoxid_clienteComprobanteTarjetaGenerico)throws Exception
	{
		try
		{
			Cliente  clienteAux=new Cliente();

			if(jComboBoxid_clienteComprobanteTarjetaGenerico==null) {
				clienteAux=(Cliente)this.jInternalFrameDetalleFormComprobanteTarjeta.jComboBoxid_clienteComprobanteTarjeta.getSelectedItem();
			} else {
				clienteAux=(Cliente)jComboBoxid_clienteComprobanteTarjetaGenerico.getSelectedItem();
			}

			if(clienteAux!=null && clienteAux.getId()!=null) {
				comprobantetarjeta.setid_cliente(clienteAux.getId());
				comprobantetarjeta.setcliente_descripcion(ComprobanteTarjetaConstantesFunciones.getClienteDescripcion(clienteAux));
				comprobantetarjeta.setCliente(clienteAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarCajaForeignKey(ComprobanteTarjeta comprobantetarjeta,JComboBox jComboBoxid_cajaComprobanteTarjetaGenerico)throws Exception
	{
		try
		{
			Caja  cajaAux=new Caja();

			if(jComboBoxid_cajaComprobanteTarjetaGenerico==null) {
				cajaAux=(Caja)this.jInternalFrameDetalleFormComprobanteTarjeta.jComboBoxid_cajaComprobanteTarjeta.getSelectedItem();
			} else {
				cajaAux=(Caja)jComboBoxid_cajaComprobanteTarjetaGenerico.getSelectedItem();
			}

			if(cajaAux!=null && cajaAux.getId()!=null) {
				comprobantetarjeta.setid_caja(cajaAux.getId());
				comprobantetarjeta.setcaja_descripcion(ComprobanteTarjetaConstantesFunciones.getCajaDescripcion(cajaAux));
				comprobantetarjeta.setCaja(cajaAux);			}
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

					if(!ComprobanteTarjetaJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormComprobanteTarjeta!=null) { 
							this.jInternalFrameDetalleFormComprobanteTarjeta.jComboBoxid_empresaComprobanteTarjeta.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormComprobanteTarjeta.jComboBoxid_empresaComprobanteTarjeta.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormComprobanteTarjeta!=null) { 
					}

					if(!ComprobanteTarjetaJInternalFrame.ISBINDING_MANUAL) {
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

					if(!ComprobanteTarjetaJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormComprobanteTarjeta!=null) { 
							this.jInternalFrameDetalleFormComprobanteTarjeta.jComboBoxid_sucursalComprobanteTarjeta.removeAllItems();

							for(Sucursal sucursal:this.sucursalsForeignKey) {
								this.jInternalFrameDetalleFormComprobanteTarjeta.jComboBoxid_sucursalComprobanteTarjeta.addItem(sucursal);
							}
						}
					}

					if(this.jInternalFrameDetalleFormComprobanteTarjeta!=null) { 
					}

					if(!ComprobanteTarjetaJInternalFrame.ISBINDING_MANUAL) {
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

					if(!ComprobanteTarjetaJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormComprobanteTarjeta!=null) { 
							this.jInternalFrameDetalleFormComprobanteTarjeta.jComboBoxid_clienteComprobanteTarjeta.removeAllItems();

							for(Cliente cliente:this.clientesForeignKey) {
								this.jInternalFrameDetalleFormComprobanteTarjeta.jComboBoxid_clienteComprobanteTarjeta.addItem(cliente);
							}
						}
					}

					if(this.jInternalFrameDetalleFormComprobanteTarjeta!=null) { 
					}

					if(!ComprobanteTarjetaJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameCajasForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingCaja=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!ComprobanteTarjetaJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormComprobanteTarjeta!=null) { 
							this.jInternalFrameDetalleFormComprobanteTarjeta.jComboBoxid_cajaComprobanteTarjeta.removeAllItems();

							for(Caja caja:this.cajasForeignKey) {
								this.jInternalFrameDetalleFormComprobanteTarjeta.jComboBoxid_cajaComprobanteTarjeta.addItem(caja);
							}
						}
					}

					if(this.jInternalFrameDetalleFormComprobanteTarjeta!=null) { 
					}

					if(!ComprobanteTarjetaJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormComprobanteTarjeta!=null) {
							this.jInternalFrameDetalleFormComprobanteTarjeta.jComboBoxid_empresaComprobanteTarjeta.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormComprobanteTarjeta!=null) {
							this.jInternalFrameDetalleFormComprobanteTarjeta.jComboBoxid_empresaComprobanteTarjeta.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormComprobanteTarjeta!=null) {
							this.jInternalFrameDetalleFormComprobanteTarjeta.jComboBoxid_sucursalComprobanteTarjeta.setSelectedItem(sucursal);
						}
					} else {
						if(this.jInternalFrameDetalleFormComprobanteTarjeta!=null) {
							this.jInternalFrameDetalleFormComprobanteTarjeta.jComboBoxid_sucursalComprobanteTarjeta.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormComprobanteTarjeta!=null) {
							this.jInternalFrameDetalleFormComprobanteTarjeta.jComboBoxid_clienteComprobanteTarjeta.setSelectedItem(cliente);
						}
					} else {
						if(this.jInternalFrameDetalleFormComprobanteTarjeta!=null) {
							this.jInternalFrameDetalleFormComprobanteTarjeta.jComboBoxid_clienteComprobanteTarjeta.setSelectedIndex(iIndexSelected);
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

		public void setSelectedItemCombosFrameCajaForeignKey(Caja caja,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormComprobanteTarjeta!=null) {
							this.jInternalFrameDetalleFormComprobanteTarjeta.jComboBoxid_cajaComprobanteTarjeta.setSelectedItem(caja);
						}
					} else {
						if(this.jInternalFrameDetalleFormComprobanteTarjeta!=null) {
							this.jInternalFrameDetalleFormComprobanteTarjeta.jComboBoxid_cajaComprobanteTarjeta.setSelectedIndex(iIndexSelected);
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

	


	
	public void refrescarForeignKeysDescripcionesComprobanteTarjeta() throws Exception {
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
		
	public ComprobanteTarjetaParameterReturnGeneral getComprobanteTarjetaParameterGeneral() {
		return this.comprobantetarjetaParameterGeneral;
	}
	
	public void setComprobanteTarjetaParameterGeneral(ComprobanteTarjetaParameterReturnGeneral comprobantetarjetaParameterGeneral) {
		this.comprobantetarjetaParameterGeneral = comprobantetarjetaParameterGeneral;
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
	
	public Boolean getIsPermisoTodoComprobanteTarjeta() {
		return isPermisoTodoComprobanteTarjeta;
	}

	public void setIsPermisoTodoComprobanteTarjeta(Boolean isPermisoTodoComprobanteTarjeta) {
		this.isPermisoTodoComprobanteTarjeta = isPermisoTodoComprobanteTarjeta;
	}

	public Boolean getIsPermisoNuevoComprobanteTarjeta() {
		return isPermisoNuevoComprobanteTarjeta;
	}

	public void setIsPermisoNuevoComprobanteTarjeta(Boolean isPermisoNuevoComprobanteTarjeta) {
		this.isPermisoNuevoComprobanteTarjeta = isPermisoNuevoComprobanteTarjeta;
	}

	public Boolean getIsPermisoActualizarComprobanteTarjeta() {
		return isPermisoActualizarComprobanteTarjeta;
	}

	public void setIsPermisoActualizarComprobanteTarjeta(Boolean isPermisoActualizarComprobanteTarjeta) {
		this.isPermisoActualizarComprobanteTarjeta = isPermisoActualizarComprobanteTarjeta;
	}

	public Boolean getIsPermisoEliminarComprobanteTarjeta() {
		return isPermisoEliminarComprobanteTarjeta;
	}

	public void setIsPermisoEliminarComprobanteTarjeta(Boolean isPermisoEliminarComprobanteTarjeta) {
		this.isPermisoEliminarComprobanteTarjeta = isPermisoEliminarComprobanteTarjeta;
	}

	public Boolean getIsPermisoGuardarCambiosComprobanteTarjeta() {
		return isPermisoGuardarCambiosComprobanteTarjeta;
	}

	public void setIsPermisoGuardarCambiosComprobanteTarjeta(Boolean isPermisoGuardarCambiosComprobanteTarjeta) {
		this.isPermisoGuardarCambiosComprobanteTarjeta = isPermisoGuardarCambiosComprobanteTarjeta;
	}
	
	public Boolean getIsPermisoConsultaComprobanteTarjeta() {
		return isPermisoConsultaComprobanteTarjeta;
	}

	public void setIsPermisoConsultaComprobanteTarjeta(Boolean isPermisoConsultaComprobanteTarjeta) {
		this.isPermisoConsultaComprobanteTarjeta = isPermisoConsultaComprobanteTarjeta;
	}

	public Boolean getIsPermisoBusquedaComprobanteTarjeta() {
		return isPermisoBusquedaComprobanteTarjeta;
	}

	public void setIsPermisoBusquedaComprobanteTarjeta(Boolean isPermisoBusquedaComprobanteTarjeta) {
		this.isPermisoBusquedaComprobanteTarjeta = isPermisoBusquedaComprobanteTarjeta;
	}

	public Boolean getIsPermisoReporteComprobanteTarjeta() {
		return isPermisoReporteComprobanteTarjeta;
	}

	public void setIsPermisoReporteComprobanteTarjeta(Boolean isPermisoReporteComprobanteTarjeta) {
		this.isPermisoReporteComprobanteTarjeta = isPermisoReporteComprobanteTarjeta;
	}
	
	public Boolean getIsPermisoPaginacionMedioComprobanteTarjeta() {
		return isPermisoPaginacionMedioComprobanteTarjeta;
	}

	public void setIsPermisoPaginacionMedioComprobanteTarjeta(Boolean isPermisoPaginacionMedioComprobanteTarjeta) {
		this.isPermisoPaginacionMedioComprobanteTarjeta = isPermisoPaginacionMedioComprobanteTarjeta;
	}
	
	public Boolean getIsPermisoPaginacionTodoComprobanteTarjeta() {
		return isPermisoPaginacionTodoComprobanteTarjeta;
	}

	public void setIsPermisoPaginacionTodoComprobanteTarjeta(Boolean isPermisoPaginacionTodoComprobanteTarjeta) {
		this.isPermisoPaginacionTodoComprobanteTarjeta = isPermisoPaginacionTodoComprobanteTarjeta;
	}
	
	public Boolean getIsPermisoPaginacionAltoComprobanteTarjeta() {
		return isPermisoPaginacionAltoComprobanteTarjeta;
	}

	public void setIsPermisoPaginacionAltoComprobanteTarjeta(Boolean isPermisoPaginacionAltoComprobanteTarjeta) {
		this.isPermisoPaginacionAltoComprobanteTarjeta = isPermisoPaginacionAltoComprobanteTarjeta;
	}
	
	public Boolean getIsPermisoCopiarComprobanteTarjeta() {
		return isPermisoCopiarComprobanteTarjeta;
	}

	public void setIsPermisoCopiarComprobanteTarjeta(Boolean isPermisoCopiarComprobanteTarjeta) {
		this.isPermisoCopiarComprobanteTarjeta = isPermisoCopiarComprobanteTarjeta;
	}
	
	public Boolean getIsPermisoVerFormComprobanteTarjeta() {
		return isPermisoVerFormComprobanteTarjeta;
	}

	public void setIsPermisoVerFormComprobanteTarjeta(Boolean isPermisoVerFormComprobanteTarjeta) {
		this.isPermisoVerFormComprobanteTarjeta = isPermisoVerFormComprobanteTarjeta;
	}
	
	public Boolean getIsPermisoDuplicarComprobanteTarjeta() {
		return isPermisoDuplicarComprobanteTarjeta;
	}

	public void setIsPermisoDuplicarComprobanteTarjeta(Boolean isPermisoDuplicarComprobanteTarjeta) {
		this.isPermisoDuplicarComprobanteTarjeta = isPermisoDuplicarComprobanteTarjeta;
	}
	
	public Boolean getIsPermisoOrdenComprobanteTarjeta() {
		return isPermisoOrdenComprobanteTarjeta;
	}

	public void setIsPermisoOrdenComprobanteTarjeta(Boolean isPermisoOrdenComprobanteTarjeta) {
		this.isPermisoOrdenComprobanteTarjeta = isPermisoOrdenComprobanteTarjeta;
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
	
	public Boolean getIsVisibilidadCeldaNuevoComprobanteTarjeta() {
		return isVisibilidadCeldaNuevoComprobanteTarjeta;
	}

	public void setIsVisibilidadCeldaNuevoComprobanteTarjeta(Boolean isVisibilidadCeldaNuevoComprobanteTarjeta) {
		this.isVisibilidadCeldaNuevoComprobanteTarjeta = isVisibilidadCeldaNuevoComprobanteTarjeta;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarComprobanteTarjeta() {
		return isVisibilidadCeldaDuplicarComprobanteTarjeta;
	}

	public void setIsVisibilidadCeldaDuplicarComprobanteTarjeta(Boolean isVisibilidadCeldaDuplicarComprobanteTarjeta) {
		this.isVisibilidadCeldaDuplicarComprobanteTarjeta = isVisibilidadCeldaDuplicarComprobanteTarjeta;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarComprobanteTarjeta() {
		return isVisibilidadCeldaCopiarComprobanteTarjeta;
	}

	public void setIsVisibilidadCeldaCopiarComprobanteTarjeta(Boolean isVisibilidadCeldaCopiarComprobanteTarjeta) {
		this.isVisibilidadCeldaCopiarComprobanteTarjeta = isVisibilidadCeldaCopiarComprobanteTarjeta;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormComprobanteTarjeta() {
		return isVisibilidadCeldaVerFormComprobanteTarjeta;
	}

	public void setIsVisibilidadCeldaVerFormComprobanteTarjeta(Boolean isVisibilidadCeldaVerFormComprobanteTarjeta) {
		this.isVisibilidadCeldaVerFormComprobanteTarjeta = isVisibilidadCeldaVerFormComprobanteTarjeta;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenComprobanteTarjeta() {
		return isVisibilidadCeldaOrdenComprobanteTarjeta;
	}

	public void setIsVisibilidadCeldaOrdenComprobanteTarjeta(Boolean isVisibilidadCeldaOrdenComprobanteTarjeta) {
		this.isVisibilidadCeldaOrdenComprobanteTarjeta = isVisibilidadCeldaOrdenComprobanteTarjeta;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesComprobanteTarjeta() {
		return isVisibilidadCeldaNuevoRelacionesComprobanteTarjeta;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesComprobanteTarjeta(Boolean isVisibilidadCeldaNuevoRelacionesComprobanteTarjeta) {
		this.isVisibilidadCeldaNuevoRelacionesComprobanteTarjeta = isVisibilidadCeldaNuevoRelacionesComprobanteTarjeta;
	}
	
	public Boolean getIsVisibilidadCeldaModificarComprobanteTarjeta() {
		return isVisibilidadCeldaModificarComprobanteTarjeta;
	}

	public void setIsVisibilidadCeldaModificarComprobanteTarjeta(Boolean isVisibilidadCeldaModificarComprobanteTarjeta) {
		this.isVisibilidadCeldaModificarComprobanteTarjeta = isVisibilidadCeldaModificarComprobanteTarjeta;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarComprobanteTarjeta() {
		return isVisibilidadCeldaActualizarComprobanteTarjeta;
	}

	public void setIsVisibilidadCeldaActualizarComprobanteTarjeta(Boolean isVisibilidadCeldaActualizarComprobanteTarjeta) {
		this.isVisibilidadCeldaActualizarComprobanteTarjeta = isVisibilidadCeldaActualizarComprobanteTarjeta;
	}

	public Boolean getIsVisibilidadCeldaEliminarComprobanteTarjeta() {
		return isVisibilidadCeldaEliminarComprobanteTarjeta;
	}

	public void setIsVisibilidadCeldaEliminarComprobanteTarjeta(Boolean isVisibilidadCeldaEliminarComprobanteTarjeta) {
		this.isVisibilidadCeldaEliminarComprobanteTarjeta = isVisibilidadCeldaEliminarComprobanteTarjeta;
	}

	public Boolean getIsVisibilidadCeldaCancelarComprobanteTarjeta() {
		return isVisibilidadCeldaCancelarComprobanteTarjeta;
	}

	public void setIsVisibilidadCeldaCancelarComprobanteTarjeta(Boolean isVisibilidadCeldaCancelarComprobanteTarjeta) {
		this.isVisibilidadCeldaCancelarComprobanteTarjeta = isVisibilidadCeldaCancelarComprobanteTarjeta;
	}

	public Boolean getIsVisibilidadCeldaGuardarComprobanteTarjeta() {
		return isVisibilidadCeldaGuardarComprobanteTarjeta;
	}

	public void setIsVisibilidadCeldaGuardarComprobanteTarjeta(Boolean isVisibilidadCeldaGuardarComprobanteTarjeta) {
		this.isVisibilidadCeldaGuardarComprobanteTarjeta = isVisibilidadCeldaGuardarComprobanteTarjeta;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosComprobanteTarjeta() {
		return isVisibilidadCeldaGuardarCambiosComprobanteTarjeta;
	}

	public void setIsVisibilidadCeldaGuardarCambiosComprobanteTarjeta(Boolean isVisibilidadCeldaGuardarCambiosComprobanteTarjeta) {
		this.isVisibilidadCeldaGuardarCambiosComprobanteTarjeta = isVisibilidadCeldaGuardarCambiosComprobanteTarjeta;
	}
		
	public ComprobanteTarjetaSessionBean getcomprobantetarjetaSessionBean() {
		return this.comprobantetarjetaSessionBean;
	}
	
	public void setcomprobantetarjetaSessionBean(ComprobanteTarjetaSessionBean comprobantetarjetaSessionBean) {
		this.comprobantetarjetaSessionBean=comprobantetarjetaSessionBean;
	}
	
	
	public Boolean getisVisibilidadBusquedaComprobanteTarjeta() {
		return this.isVisibilidadBusquedaComprobanteTarjeta;
	}

	public void setisVisibilidadBusquedaComprobanteTarjeta(Boolean isVisibilidadBusquedaComprobanteTarjeta) {
		this.isVisibilidadBusquedaComprobanteTarjeta=isVisibilidadBusquedaComprobanteTarjeta;
	}

	public Boolean getisVisibilidadFK_IdCaja() {
		return this.isVisibilidadFK_IdCaja;
	}

	public void setisVisibilidadFK_IdCaja(Boolean isVisibilidadFK_IdCaja) {
		this.isVisibilidadFK_IdCaja=isVisibilidadFK_IdCaja;
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

	public Boolean getisVisibilidadFK_IdSucursal() {
		return this.isVisibilidadFK_IdSucursal;
	}

	public void setisVisibilidadFK_IdSucursal(Boolean isVisibilidadFK_IdSucursal) {
		this.isVisibilidadFK_IdSucursal=isVisibilidadFK_IdSucursal;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysComprobanteTarjeta(ComprobanteTarjeta comprobantetarjeta)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(comprobantetarjeta,null);
				this.setActualParaGuardarSucursalForeignKey(comprobantetarjeta,null);
				this.setActualParaGuardarClienteForeignKey(comprobantetarjeta,null);
				this.setActualParaGuardarCajaForeignKey(comprobantetarjeta,null);
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
	
	public void bugActualizarReferenciaActual(ComprobanteTarjeta comprobantetarjeta,ComprobanteTarjeta comprobantetarjetaAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalComprobanteTarjeta(comprobantetarjeta);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		comprobantetarjetaAux.setId(comprobantetarjeta.getId());
		comprobantetarjetaAux.setVersionRow(comprobantetarjeta.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
	}	
	
	public void actualizarRelaciones(ComprobanteTarjeta comprobantetarjetaLocal) throws Exception {
		
		if(this.comprobantetarjetaSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(ComprobanteTarjeta comprobantetarjetaLocal) throws Exception {	
		if(this.comprobantetarjetaSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				comprobantetarjetaLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(SucursalDetalleFormJInternalFrame.class)) {
				SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrameLocal=(SucursalBeanSwingJInternalFrame) ((SucursalDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				sucursalBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoSucursal(sucursalBeanSwingJInternalFrameLocal.getsucursal(),true);
				sucursalBeanSwingJInternalFrameLocal.actualizarLista(sucursalBeanSwingJInternalFrameLocal.sucursal,this.sucursalsForeignKey);

				sucursalBeanSwingJInternalFrameLocal.actualizarRelaciones(sucursalBeanSwingJInternalFrameLocal.sucursal);

				comprobantetarjetaLocal.setSucursal(sucursalBeanSwingJInternalFrameLocal.sucursal);

				this.addItemDefectoCombosForeignKeySucursal();
				this.cargarCombosFrameSucursalsForeignKey("Formulario");
				this.setActualSucursalForeignKey(sucursalBeanSwingJInternalFrameLocal.sucursal.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(ClienteDetalleFormJInternalFrame.class)) {
				ClienteBeanSwingJInternalFrame clienteBeanSwingJInternalFrameLocal=(ClienteBeanSwingJInternalFrame) ((ClienteDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				clienteBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoCliente(clienteBeanSwingJInternalFrameLocal.getcliente(),true);
				clienteBeanSwingJInternalFrameLocal.actualizarLista(clienteBeanSwingJInternalFrameLocal.cliente,this.clientesForeignKey);

				clienteBeanSwingJInternalFrameLocal.actualizarRelaciones(clienteBeanSwingJInternalFrameLocal.cliente);

				comprobantetarjetaLocal.setCliente(clienteBeanSwingJInternalFrameLocal.cliente);

				this.addItemDefectoCombosForeignKeyCliente();
				this.cargarCombosFrameClientesForeignKey("Formulario");
				this.setActualClienteForeignKey(clienteBeanSwingJInternalFrameLocal.cliente.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(CajaDetalleFormJInternalFrame.class)) {
				CajaBeanSwingJInternalFrame cajaBeanSwingJInternalFrameLocal=(CajaBeanSwingJInternalFrame) ((CajaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				cajaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoCaja(cajaBeanSwingJInternalFrameLocal.getcaja(),true);
				cajaBeanSwingJInternalFrameLocal.actualizarLista(cajaBeanSwingJInternalFrameLocal.caja,this.cajasForeignKey);

				cajaBeanSwingJInternalFrameLocal.actualizarRelaciones(cajaBeanSwingJInternalFrameLocal.caja);

				comprobantetarjetaLocal.setCaja(cajaBeanSwingJInternalFrameLocal.caja);

				this.addItemDefectoCombosForeignKeyCaja();
				this.cargarCombosFrameCajasForeignKey("Formulario");
				this.setActualCajaForeignKey(cajaBeanSwingJInternalFrameLocal.caja.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarComprobanteTarjetaActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosComprobanteTarjeta.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.comprobantetarjeta =(ComprobanteTarjeta) this.comprobantetarjetaLogic.getComprobanteTarjetas().toArray()[this.jTableDatosComprobanteTarjeta.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.comprobantetarjeta =(ComprobanteTarjeta) this.comprobantetarjetas.toArray()[this.jTableDatosComprobanteTarjeta.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = comprobantetarjetaValidator.getInvalidValues(this.comprobantetarjeta);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(ComprobanteTarjeta comprobantetarjeta,List<ComprobanteTarjeta> comprobantetarjetas) throws Exception {
	}		
	
	public void actualizarSelectedLista(ComprobanteTarjeta comprobantetarjeta,List<ComprobanteTarjeta> comprobantetarjetas) throws Exception {
		try	{			
			ComprobanteTarjetaConstantesFunciones.actualizarSelectedLista(comprobantetarjeta,comprobantetarjetas);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<ComprobanteTarjeta> comprobantetarjetasLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				comprobantetarjetasLocal=this.comprobantetarjetaLogic.getComprobanteTarjetas();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				comprobantetarjetasLocal=this.comprobantetarjetas;
			}
			//ARCHITECTURE
		
			for(ComprobanteTarjeta comprobantetarjetaLocal:comprobantetarjetasLocal) {
				if(this.permiteMantenimiento(comprobantetarjetaLocal) && comprobantetarjetaLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+ComprobanteTarjetaConstantesFunciones.getComprobanteTarjetaLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(ComprobanteTarjetaConstantesFunciones.IDCLIENTE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormComprobanteTarjeta.jLabelid_clienteComprobanteTarjeta,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ComprobanteTarjetaConstantesFunciones.IDCAJA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormComprobanteTarjeta.jLabelid_cajaComprobanteTarjeta,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ComprobanteTarjetaConstantesFunciones.NOMBRECAJA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormComprobanteTarjeta.jLabelnombre_cajaComprobanteTarjeta,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ComprobanteTarjetaConstantesFunciones.SECUENCIAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormComprobanteTarjeta.jLabelsecuencialComprobanteTarjeta,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ComprobanteTarjetaConstantesFunciones.FECHA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormComprobanteTarjeta.jLabelfechaComprobanteTarjeta,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ComprobanteTarjetaConstantesFunciones.CODIGOCLIENTE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormComprobanteTarjeta.jLabelcodigo_clienteComprobanteTarjeta,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ComprobanteTarjetaConstantesFunciones.NOMBRECLIENTE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormComprobanteTarjeta.jLabelnombre_clienteComprobanteTarjeta,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ComprobanteTarjetaConstantesFunciones.SUBTOTAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormComprobanteTarjeta.jLabelsubtotalComprobanteTarjeta,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ComprobanteTarjetaConstantesFunciones.IVA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormComprobanteTarjeta.jLabelivaComprobanteTarjeta,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ComprobanteTarjetaConstantesFunciones.DESCUENTO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormComprobanteTarjeta.jLabeldescuentoComprobanteTarjeta,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ComprobanteTarjetaConstantesFunciones.FINANCIAMIENTO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormComprobanteTarjeta.jLabelfinanciamientoComprobanteTarjeta,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ComprobanteTarjetaConstantesFunciones.FLETE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormComprobanteTarjeta.jLabelfleteComprobanteTarjeta,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ComprobanteTarjetaConstantesFunciones.ICE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormComprobanteTarjeta.jLabeliceComprobanteTarjeta,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ComprobanteTarjetaConstantesFunciones.TOTAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormComprobanteTarjeta.jLabeltotalComprobanteTarjeta,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ComprobanteTarjetaConstantesFunciones.VALOR)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormComprobanteTarjeta.jLabelvalorComprobanteTarjeta,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ComprobanteTarjetaConstantesFunciones.FECHAFORMAPAGO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormComprobanteTarjeta.jLabelfecha_forma_pagoComprobanteTarjeta,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ComprobanteTarjetaConstantesFunciones.NUMERO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormComprobanteTarjeta.jLabelnumeroComprobanteTarjeta,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ComprobanteTarjetaConstantesFunciones.TARJETAHABIENTE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormComprobanteTarjeta.jLabeltarjeta_habienteComprobanteTarjeta,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ComprobanteTarjetaConstantesFunciones.AUTORIZACION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormComprobanteTarjeta.jLabelautorizacionComprobanteTarjeta,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ComprobanteTarjetaConstantesFunciones.VOUCHER)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormComprobanteTarjeta.jLabelvoucherComprobanteTarjeta,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ComprobanteTarjetaConstantesFunciones.LOTE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormComprobanteTarjeta.jLabelloteComprobanteTarjeta,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormComprobanteTarjeta!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormComprobanteTarjeta.jLabelid_clienteComprobanteTarjeta,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormComprobanteTarjeta.jLabelid_cajaComprobanteTarjeta,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormComprobanteTarjeta.jLabelnombre_cajaComprobanteTarjeta,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormComprobanteTarjeta.jLabelsecuencialComprobanteTarjeta,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormComprobanteTarjeta.jLabelfechaComprobanteTarjeta,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormComprobanteTarjeta.jLabelcodigo_clienteComprobanteTarjeta,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormComprobanteTarjeta.jLabelnombre_clienteComprobanteTarjeta,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormComprobanteTarjeta.jLabelsubtotalComprobanteTarjeta,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormComprobanteTarjeta.jLabelivaComprobanteTarjeta,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormComprobanteTarjeta.jLabeldescuentoComprobanteTarjeta,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormComprobanteTarjeta.jLabelfinanciamientoComprobanteTarjeta,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormComprobanteTarjeta.jLabelfleteComprobanteTarjeta,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormComprobanteTarjeta.jLabeliceComprobanteTarjeta,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormComprobanteTarjeta.jLabeltotalComprobanteTarjeta,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormComprobanteTarjeta.jLabelvalorComprobanteTarjeta,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormComprobanteTarjeta.jLabelfecha_forma_pagoComprobanteTarjeta,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormComprobanteTarjeta.jLabelnumeroComprobanteTarjeta,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormComprobanteTarjeta.jLabeltarjeta_habienteComprobanteTarjeta,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormComprobanteTarjeta.jLabelautorizacionComprobanteTarjeta,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormComprobanteTarjeta.jLabelvoucherComprobanteTarjeta,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormComprobanteTarjeta.jLabelloteComprobanteTarjeta,"");
		
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
		this.iIdNuevoComprobanteTarjeta--;	
		
		
		this.comprobantetarjetaAux=new ComprobanteTarjeta();
		
		this.comprobantetarjetaAux.setId(this.iIdNuevoComprobanteTarjeta);
		this.comprobantetarjetaAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.comprobantetarjetaLogic.getComprobanteTarjetas().add(this.comprobantetarjetaAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.comprobantetarjetas.add(this.comprobantetarjetaAux);
		}
		//ARCHITECTURE
		
		this.comprobantetarjeta=this.comprobantetarjetaAux;
		
		if(ComprobanteTarjetaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioComprobanteTarjeta(this.comprobantetarjeta);
			this.setVariablesObjetoActualToFormularioForeignKeyComprobanteTarjeta(this.comprobantetarjeta);
		}
				
		//this.setDefaultControlesComprobanteTarjeta();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyComprobanteTarjeta();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyComprobanteTarjeta();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyComprobanteTarjeta();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualComprobanteTarjeta(this.comprobantetarjetaBean,this.comprobantetarjeta,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysComprobanteTarjeta(this.comprobantetarjeta);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanComprobanteTarjeta(this.comprobantetarjetaReturnGeneral,this.comprobantetarjetaBean,false);
		
		if(this.comprobantetarjetaReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyComprobanteTarjeta(this.comprobantetarjetaReturnGeneral.getComprobanteTarjeta());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioComprobanteTarjeta(this.comprobantetarjetaReturnGeneral.getComprobanteTarjeta());
		}
		
		if(this.comprobantetarjetaReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioComprobanteTarjeta(this.comprobantetarjetaReturnGeneral.getComprobanteTarjeta(),classes);//this.comprobantetarjetaBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualComprobanteTarjeta(this.comprobantetarjeta,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyComprobanteTarjeta();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyComprobanteTarjeta();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			ComprobanteTarjetaBeanSwingJInternalFrameAdditional.RecargarFormComprobanteTarjeta(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingComprobanteTarjeta(false);
						
			if(comprobantetarjetaSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(ComprobanteTarjetaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualComprobanteTarjeta();
			}
			
			this.actualizarVisualTableDatosComprobanteTarjeta();
			
			this.jTableDatosComprobanteTarjeta.setRowSelectionInterval(this.getIndiceNuevoComprobanteTarjeta(), this.getIndiceNuevoComprobanteTarjeta());
			
			this.seleccionarFilaTablaComprobanteTarjetaActual();
						
			this.actualizarEstadoCeldasBotonesComprobanteTarjeta("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesComprobanteTarjeta(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormComprobanteTarjeta.jDateChooserfecha_inicioComprobanteTarjeta.setEnabled(isHabilitar && this.comprobantetarjetaConstantesFunciones.activarfecha_inicioComprobanteTarjeta);
		this.jInternalFrameDetalleFormComprobanteTarjeta.jDateChooserfecha_finComprobanteTarjeta.setEnabled(isHabilitar && this.comprobantetarjetaConstantesFunciones.activarfecha_finComprobanteTarjeta);
		this.jInternalFrameDetalleFormComprobanteTarjeta.jTextAreanombre_cajaComprobanteTarjeta.setEnabled(isHabilitar && this.comprobantetarjetaConstantesFunciones.activarnombre_cajaComprobanteTarjeta);
		this.jInternalFrameDetalleFormComprobanteTarjeta.jTextFieldsecuencialComprobanteTarjeta.setEnabled(isHabilitar && this.comprobantetarjetaConstantesFunciones.activarsecuencialComprobanteTarjeta);
		this.jInternalFrameDetalleFormComprobanteTarjeta.jDateChooserfechaComprobanteTarjeta.setEnabled(isHabilitar && this.comprobantetarjetaConstantesFunciones.activarfechaComprobanteTarjeta);
		this.jInternalFrameDetalleFormComprobanteTarjeta.jTextFieldcodigo_clienteComprobanteTarjeta.setEnabled(isHabilitar && this.comprobantetarjetaConstantesFunciones.activarcodigo_clienteComprobanteTarjeta);
		this.jInternalFrameDetalleFormComprobanteTarjeta.jTextAreanombre_clienteComprobanteTarjeta.setEnabled(isHabilitar && this.comprobantetarjetaConstantesFunciones.activarnombre_clienteComprobanteTarjeta);
		this.jInternalFrameDetalleFormComprobanteTarjeta.jTextFieldsubtotalComprobanteTarjeta.setEnabled(isHabilitar && this.comprobantetarjetaConstantesFunciones.activarsubtotalComprobanteTarjeta);
		this.jInternalFrameDetalleFormComprobanteTarjeta.jTextFieldivaComprobanteTarjeta.setEnabled(isHabilitar && this.comprobantetarjetaConstantesFunciones.activarivaComprobanteTarjeta);
		this.jInternalFrameDetalleFormComprobanteTarjeta.jTextFielddescuentoComprobanteTarjeta.setEnabled(isHabilitar && this.comprobantetarjetaConstantesFunciones.activardescuentoComprobanteTarjeta);
		this.jInternalFrameDetalleFormComprobanteTarjeta.jTextFieldfinanciamientoComprobanteTarjeta.setEnabled(isHabilitar && this.comprobantetarjetaConstantesFunciones.activarfinanciamientoComprobanteTarjeta);
		this.jInternalFrameDetalleFormComprobanteTarjeta.jTextFieldfleteComprobanteTarjeta.setEnabled(isHabilitar && this.comprobantetarjetaConstantesFunciones.activarfleteComprobanteTarjeta);
		this.jInternalFrameDetalleFormComprobanteTarjeta.jTextFieldiceComprobanteTarjeta.setEnabled(isHabilitar && this.comprobantetarjetaConstantesFunciones.activariceComprobanteTarjeta);
		this.jInternalFrameDetalleFormComprobanteTarjeta.jTextFieldtotalComprobanteTarjeta.setEnabled(isHabilitar && this.comprobantetarjetaConstantesFunciones.activartotalComprobanteTarjeta);
		this.jInternalFrameDetalleFormComprobanteTarjeta.jTextFieldvalorComprobanteTarjeta.setEnabled(isHabilitar && this.comprobantetarjetaConstantesFunciones.activarvalorComprobanteTarjeta);
		this.jInternalFrameDetalleFormComprobanteTarjeta.jDateChooserfecha_forma_pagoComprobanteTarjeta.setEnabled(isHabilitar && this.comprobantetarjetaConstantesFunciones.activarfecha_forma_pagoComprobanteTarjeta);
		this.jInternalFrameDetalleFormComprobanteTarjeta.jTextFieldnumeroComprobanteTarjeta.setEnabled(isHabilitar && this.comprobantetarjetaConstantesFunciones.activarnumeroComprobanteTarjeta);
		this.jInternalFrameDetalleFormComprobanteTarjeta.jTextAreatarjeta_habienteComprobanteTarjeta.setEnabled(isHabilitar && this.comprobantetarjetaConstantesFunciones.activartarjeta_habienteComprobanteTarjeta);
		this.jInternalFrameDetalleFormComprobanteTarjeta.jTextAreaautorizacionComprobanteTarjeta.setEnabled(isHabilitar && this.comprobantetarjetaConstantesFunciones.activarautorizacionComprobanteTarjeta);
		this.jInternalFrameDetalleFormComprobanteTarjeta.jTextFieldvoucherComprobanteTarjeta.setEnabled(isHabilitar && this.comprobantetarjetaConstantesFunciones.activarvoucherComprobanteTarjeta);
		this.jInternalFrameDetalleFormComprobanteTarjeta.jTextFieldloteComprobanteTarjeta.setEnabled(isHabilitar && this.comprobantetarjetaConstantesFunciones.activarloteComprobanteTarjeta);	
		//
		this.jInternalFrameDetalleFormComprobanteTarjeta.jComboBoxid_empresaComprobanteTarjeta.setEnabled(isHabilitar && this.comprobantetarjetaConstantesFunciones.activarid_empresaComprobanteTarjeta);//
		this.jInternalFrameDetalleFormComprobanteTarjeta.jComboBoxid_sucursalComprobanteTarjeta.setEnabled(isHabilitar && this.comprobantetarjetaConstantesFunciones.activarid_sucursalComprobanteTarjeta);//
		this.jInternalFrameDetalleFormComprobanteTarjeta.jComboBoxid_clienteComprobanteTarjeta.setEnabled(isHabilitar && this.comprobantetarjetaConstantesFunciones.activarid_clienteComprobanteTarjeta);//
		this.jInternalFrameDetalleFormComprobanteTarjeta.jComboBoxid_cajaComprobanteTarjeta.setEnabled(isHabilitar && this.comprobantetarjetaConstantesFunciones.activarid_cajaComprobanteTarjeta);
	};
	
	public void setDefaultControlesComprobanteTarjeta() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoComprobanteTarjeta(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.comprobantetarjetaSessionBean.setConGuardarRelaciones(true);			
			this.comprobantetarjetaSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormComprobanteTarjeta.jTabbedPaneRelacionesComprobanteTarjeta.setVisible(true);
			
					
		} else {
			//this.comprobantetarjetaSessionBean.setConGuardarRelaciones(false);			
			this.comprobantetarjetaSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormComprobanteTarjeta.jTabbedPaneRelacionesComprobanteTarjeta.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoComprobanteTarjeta() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ComprobanteTarjeta comprobantetarjetaAux:this.comprobantetarjetaLogic.getComprobanteTarjetas()) {
				if(comprobantetarjetaAux.getId().equals(this.iIdNuevoComprobanteTarjeta)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ComprobanteTarjeta comprobantetarjetaAux:this.comprobantetarjetas) {
				if(comprobantetarjetaAux.getId().equals(this.iIdNuevoComprobanteTarjeta)) {
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
	
	public int getIndiceActualComprobanteTarjeta(ComprobanteTarjeta comprobantetarjeta,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ComprobanteTarjeta comprobantetarjetaAux:this.comprobantetarjetaLogic.getComprobanteTarjetas()) {
				if(comprobantetarjetaAux.getId().equals(comprobantetarjeta.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ComprobanteTarjeta comprobantetarjetaAux:this.comprobantetarjetas) {
				if(comprobantetarjetaAux.getId().equals(comprobantetarjeta.getId())) {
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
	
	public void setCamposBaseDesdeOriginalComprobanteTarjeta(ComprobanteTarjeta comprobantetarjetaOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ComprobanteTarjeta comprobantetarjetaAux:this.comprobantetarjetaLogic.getComprobanteTarjetas()) {
				if(comprobantetarjetaAux.getComprobanteTarjetaOriginal().getId().equals(comprobantetarjetaOriginal.getId())) {
					existe=true;
					comprobantetarjetaOriginal.setId(comprobantetarjetaAux.getId());
					comprobantetarjetaOriginal.setVersionRow(comprobantetarjetaAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ComprobanteTarjeta comprobantetarjetaAux:this.comprobantetarjetas) {
				if(comprobantetarjetaAux.getComprobanteTarjetaOriginal().getId().equals(comprobantetarjetaOriginal.getId())) {
					existe=true;
					comprobantetarjetaOriginal.setId(comprobantetarjetaAux.getId());
					comprobantetarjetaOriginal.setVersionRow(comprobantetarjetaAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosComprobanteTarjeta(Boolean esParaCancelar) throws Exception {
		comprobantetarjetasAux=new ArrayList<ComprobanteTarjeta>();
		comprobantetarjetaAux=new ComprobanteTarjeta();
		
		if(!this.comprobantetarjetaSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(ComprobanteTarjeta comprobantetarjetaAux:this.comprobantetarjetaLogic.getComprobanteTarjetas()) {
					if(comprobantetarjetaAux.getId()<0) {
						comprobantetarjetasAux.add(comprobantetarjetaAux);
					}		
				}
				this.iIdNuevoComprobanteTarjeta=0L;
				this.comprobantetarjetaLogic.getComprobanteTarjetas().removeAll(comprobantetarjetasAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ComprobanteTarjeta comprobantetarjetaAux:this.comprobantetarjetas) {
					if(comprobantetarjetaAux.getId()<0) {
						comprobantetarjetasAux.add(comprobantetarjetaAux);
					}		
				}
				this.iIdNuevoComprobanteTarjeta=0L;
				this.comprobantetarjetas.removeAll(comprobantetarjetasAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoComprobanteTarjeta 
					&& this.comprobantetarjetaLogic.getComprobanteTarjetas().size()>0
					) {
					comprobantetarjetaAux=this.comprobantetarjetaLogic.getComprobanteTarjetas().get(this.comprobantetarjetaLogic.getComprobanteTarjetas().size() - 1);
				
					if(comprobantetarjetaAux.getId()<0) {
						this.comprobantetarjetaLogic.getComprobanteTarjetas().remove(comprobantetarjetaAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoComprobanteTarjeta && this.comprobantetarjetas.size()>0) {
					comprobantetarjetaAux=this.comprobantetarjetas.get(this.comprobantetarjetas.size() - 1);
				
					if(comprobantetarjetaAux.getId()<0) {
						this.comprobantetarjetas.remove(comprobantetarjetaAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoComprobanteTarjeta(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(comprobantetarjeta.getId()<0) {
				this.comprobantetarjetaLogic.getComprobanteTarjetas().remove(this.comprobantetarjeta);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(comprobantetarjeta.getId()<0) {
				this.comprobantetarjetas.remove(this.comprobantetarjeta);
			}
		}			
	}
	
	public void setEstadosInicialesComprobanteTarjeta(List<ComprobanteTarjeta> comprobantetarjetasAux) throws Exception {
		ComprobanteTarjetaConstantesFunciones.setEstadosInicialesComprobanteTarjeta(comprobantetarjetasAux);
	}
	
	public void setEstadosInicialesComprobanteTarjeta(ComprobanteTarjeta comprobantetarjetaAux) throws Exception {
		ComprobanteTarjetaConstantesFunciones.setEstadosInicialesComprobanteTarjeta(comprobantetarjetaAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarComprobanteTarjetaActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesComprobanteTarjeta("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ComprobanteTarjetaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarComprobanteTarjetaActual()) {
				if(!this.isEsNuevoComprobanteTarjeta) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesComprobanteTarjeta("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoComprobanteTarjeta=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ComprobanteTarjetaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarComprobanteTarjetaActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Comprobante Tarjeta ?", "MANTENIMIENTO DE Comprobante Tarjeta", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesComprobanteTarjeta("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ComprobanteTarjetaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComprobanteTarjetaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(ComprobanteTarjeta comprobantetarjeta) throws Exception {
		ComprobanteTarjetaConstantesFunciones.seleccionarAsignar(this.comprobantetarjeta,comprobantetarjeta);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarComprobanteTarjeta=this.isPermisoActualizarOriginalComprobanteTarjeta;
			
			
			this.seleccionarAsignar(comprobantetarjeta);
			
			
			
			
			
			this.actualizarEstadoCeldasBotonesComprobanteTarjeta("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComprobanteTarjetaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.comprobantetarjetaSessionBean.setsFuncionBusquedaRapida(this.comprobantetarjetaSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComprobanteTarjetaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoComprobanteTarjeta) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosComprobanteTarjeta(esParaCancelar);				
				this.cancelarNuevoComprobanteTarjeta(esParaCancelar);								
			}
			
			this.comprobantetarjeta=new ComprobanteTarjeta();
			
			this.inicializarComprobanteTarjeta();
			
			this.actualizarEstadoCeldasBotonesComprobanteTarjeta("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComprobanteTarjetaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarComprobanteTarjeta() throws Exception {
		try {
			ComprobanteTarjetaConstantesFunciones.inicializarComprobanteTarjeta(this.comprobantetarjeta);
			
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
			FuncionesSwing.manageException(this, e,logger,ComprobanteTarjetaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.comprobantetarjetaLogic.getComprobanteTarjetas().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComprobanteTarjetaConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteComprobanteTarjetas(String sAccionBusqueda,List<ComprobanteTarjeta> comprobantetarjetasParaReportes) throws Exception {
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
					sPathReporteFinal="ComprobanteTarjeta"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="ComprobanteTarjetaMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("ComprobanteTarjetaMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="ComprobanteTarjeta"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Comprobante Tarjetas");		
		parameters.put("busquedapor", ComprobanteTarjetaConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceComprobanteTarjeta=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			ComprobanteTarjetaConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			ComprobanteTarjetaConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceComprobanteTarjeta=new JRBeanArrayDataSource(ComprobanteTarjetaJInternalFrame.TraerComprobanteTarjetaBeans(comprobantetarjetasParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceComprobanteTarjeta);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+ComprobanteTarjetaConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+ComprobanteTarjetaConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(ComprobanteTarjetaBean.TraerComprobanteTarjetaBeans(comprobantetarjetasParaReportes).toArray()));
							
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
				this.generarExcelReporteComprobanteTarjetas(sAccionBusqueda,sTipoArchivoReporte,comprobantetarjetasParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalComprobanteTarjetas(sAccionBusqueda,sTipoArchivoReporte,comprobantetarjetasParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoComprobanteTarjetaActionPerformed(null);
					//this.generarExcelReporteComprobanteTarjetas(sAccionBusqueda,sTipoArchivoReporte,comprobantetarjetasParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalComprobanteTarjetas(sAccionBusqueda,sTipoArchivoReporte,comprobantetarjetasParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesComprobanteTarjetas(sAccionBusqueda,sTipoArchivoReporte,comprobantetarjetasParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesComprobanteTarjetas(sAccionBusqueda,sTipoArchivoReporte,comprobantetarjetasParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteComprobanteTarjetas(String sAccionBusqueda,String sTipoArchivoReporte,List<ComprobanteTarjeta> comprobantetarjetasParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"comprobantetarjeta";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ComprobanteTarjetas");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderComprobanteTarjeta("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(ComprobanteTarjeta comprobantetarjeta : comprobantetarjetasParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			ComprobanteTarjetaConstantesFunciones.generarExcelReporteDataComprobanteTarjeta("NORMAL",row,workbook,comprobantetarjeta,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.comprobantetarjetaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Comprobante Tarjeta",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderComprobanteTarjeta(String sTipo,Row row,Workbook workbook) {
		
		ComprobanteTarjetaConstantesFunciones.generarExcelReporteHeaderComprobanteTarjeta(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalComprobanteTarjetas(String sAccionBusqueda,String sTipoArchivoReporte,List<ComprobanteTarjeta> comprobantetarjetasParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"comprobantetarjeta_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ComprobanteTarjetas");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(ComprobanteTarjeta comprobantetarjeta : comprobantetarjetasParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(ComprobanteTarjetaConstantesFunciones.getComprobanteTarjetaDescripcion(comprobantetarjeta));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ComprobanteTarjetaConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ComprobanteTarjetaConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(comprobantetarjeta.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ComprobanteTarjetaConstantesFunciones.LABEL_IDSUCURSAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ComprobanteTarjetaConstantesFunciones.LABEL_IDSUCURSAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(comprobantetarjeta.getsucursal_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ComprobanteTarjetaConstantesFunciones.LABEL_IDCLIENTE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ComprobanteTarjetaConstantesFunciones.LABEL_IDCLIENTE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(comprobantetarjeta.getcliente_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ComprobanteTarjetaConstantesFunciones.LABEL_IDCAJA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ComprobanteTarjetaConstantesFunciones.LABEL_IDCAJA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(comprobantetarjeta.getcaja_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ComprobanteTarjetaConstantesFunciones.LABEL_FECHAINICIO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ComprobanteTarjetaConstantesFunciones.LABEL_FECHAINICIO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(comprobantetarjeta.getfecha_inicio());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ComprobanteTarjetaConstantesFunciones.LABEL_FECHAFIN))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ComprobanteTarjetaConstantesFunciones.LABEL_FECHAFIN);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(comprobantetarjeta.getfecha_fin());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ComprobanteTarjetaConstantesFunciones.LABEL_NOMBRECAJA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ComprobanteTarjetaConstantesFunciones.LABEL_NOMBRECAJA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(comprobantetarjeta.getnombre_caja());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ComprobanteTarjetaConstantesFunciones.LABEL_SECUENCIAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ComprobanteTarjetaConstantesFunciones.LABEL_SECUENCIAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(comprobantetarjeta.getsecuencial());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ComprobanteTarjetaConstantesFunciones.LABEL_FECHA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ComprobanteTarjetaConstantesFunciones.LABEL_FECHA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(comprobantetarjeta.getfecha());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ComprobanteTarjetaConstantesFunciones.LABEL_CODIGOCLIENTE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ComprobanteTarjetaConstantesFunciones.LABEL_CODIGOCLIENTE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(comprobantetarjeta.getcodigo_cliente());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ComprobanteTarjetaConstantesFunciones.LABEL_NOMBRECLIENTE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ComprobanteTarjetaConstantesFunciones.LABEL_NOMBRECLIENTE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(comprobantetarjeta.getnombre_cliente());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ComprobanteTarjetaConstantesFunciones.LABEL_SUBTOTAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ComprobanteTarjetaConstantesFunciones.LABEL_SUBTOTAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(comprobantetarjeta.getsubtotal());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ComprobanteTarjetaConstantesFunciones.LABEL_IVA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ComprobanteTarjetaConstantesFunciones.LABEL_IVA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(comprobantetarjeta.getiva());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ComprobanteTarjetaConstantesFunciones.LABEL_DESCUENTO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ComprobanteTarjetaConstantesFunciones.LABEL_DESCUENTO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(comprobantetarjeta.getdescuento());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ComprobanteTarjetaConstantesFunciones.LABEL_FINANCIAMIENTO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ComprobanteTarjetaConstantesFunciones.LABEL_FINANCIAMIENTO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(comprobantetarjeta.getfinanciamiento());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ComprobanteTarjetaConstantesFunciones.LABEL_FLETE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ComprobanteTarjetaConstantesFunciones.LABEL_FLETE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(comprobantetarjeta.getflete());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ComprobanteTarjetaConstantesFunciones.LABEL_ICE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ComprobanteTarjetaConstantesFunciones.LABEL_ICE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(comprobantetarjeta.getice());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ComprobanteTarjetaConstantesFunciones.LABEL_TOTAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ComprobanteTarjetaConstantesFunciones.LABEL_TOTAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(comprobantetarjeta.gettotal());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ComprobanteTarjetaConstantesFunciones.LABEL_VALOR))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ComprobanteTarjetaConstantesFunciones.LABEL_VALOR);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(comprobantetarjeta.getvalor());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ComprobanteTarjetaConstantesFunciones.LABEL_FECHAFORMAPAGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ComprobanteTarjetaConstantesFunciones.LABEL_FECHAFORMAPAGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(comprobantetarjeta.getfecha_forma_pago());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ComprobanteTarjetaConstantesFunciones.LABEL_NUMERO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ComprobanteTarjetaConstantesFunciones.LABEL_NUMERO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(comprobantetarjeta.getnumero());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ComprobanteTarjetaConstantesFunciones.LABEL_TARJETAHABIENTE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ComprobanteTarjetaConstantesFunciones.LABEL_TARJETAHABIENTE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(comprobantetarjeta.gettarjeta_habiente());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ComprobanteTarjetaConstantesFunciones.LABEL_AUTORIZACION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ComprobanteTarjetaConstantesFunciones.LABEL_AUTORIZACION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(comprobantetarjeta.getautorizacion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ComprobanteTarjetaConstantesFunciones.LABEL_VOUCHER))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ComprobanteTarjetaConstantesFunciones.LABEL_VOUCHER);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(comprobantetarjeta.getvoucher());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ComprobanteTarjetaConstantesFunciones.LABEL_LOTE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ComprobanteTarjetaConstantesFunciones.LABEL_LOTE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(comprobantetarjeta.getlote());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.comprobantetarjetaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Comprobante Tarjeta",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesComprobanteTarjetas(String sAccionBusqueda,String sTipoArchivoReporte,List<ComprobanteTarjeta> comprobantetarjetasParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<ComprobanteTarjeta> comprobantetarjetasRespaldo=null;
		
		classes=ComprobanteTarjetaConstantesFunciones.getClassesRelationshipsOfComprobanteTarjeta(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.comprobantetarjetaLogic.setDatosCliente(this.datosCliente);
		this.comprobantetarjetaLogic.setDatosDeep(this.datosDeep);
		this.comprobantetarjetaLogic.setIsConDeep(true);
		
		comprobantetarjetasRespaldo=this.comprobantetarjetaLogic.getComprobanteTarjetas();
		
		this.comprobantetarjetaLogic.setComprobanteTarjetas(comprobantetarjetasParaReportes);	
		this.comprobantetarjetaLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		comprobantetarjetasParaReportes=this.comprobantetarjetaLogic.getComprobanteTarjetas();
		this.comprobantetarjetaLogic.setComprobanteTarjetas(comprobantetarjetasRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"comprobantetarjeta_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ComprobanteTarjetas");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderComprobanteTarjeta("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(ComprobanteTarjeta comprobantetarjeta : comprobantetarjetasParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderComprobanteTarjeta("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			ComprobanteTarjetaConstantesFunciones.generarExcelReporteDataComprobanteTarjeta("NORMAL",row,workbook,comprobantetarjeta,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(ComprobanteTarjetaConstantesFunciones.getComprobanteTarjetaDescripcion(comprobantetarjeta));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.comprobantetarjetaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Comprobante Tarjeta",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoComprobanteTarjeta.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoComprobanteTarjeta.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoComprobanteTarjeta.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoComprobanteTarjeta.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessComprobanteTarjeta() throws Exception {		
		this.startProcessComprobanteTarjeta(true);
	}
	
	public void startProcessComprobanteTarjeta(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasComprobanteTarjeta ,this.jPanelParametrosReportesComprobanteTarjeta, this.jScrollPanelDatosComprobanteTarjeta,this.jPanelPaginacionComprobanteTarjeta, this.jScrollPanelDatosEdicionComprobanteTarjeta, this.jPanelAccionesComprobanteTarjeta,this.jPanelAccionesFormularioComprobanteTarjeta,this.jmenuBarComprobanteTarjeta,this.jmenuBarDetalleComprobanteTarjeta,this.jTtoolBarComprobanteTarjeta,this.jTtoolBarDetalleComprobanteTarjeta);		
		
		final JTabbedPane jTabbedPaneBusquedasComprobanteTarjeta=this.jTabbedPaneBusquedasComprobanteTarjeta; 
		
		final JPanel jPanelParametrosReportesComprobanteTarjeta=this.jPanelParametrosReportesComprobanteTarjeta;
		//final JScrollPane jScrollPanelDatosComprobanteTarjeta=this.jScrollPanelDatosComprobanteTarjeta;
		final JTable jTableDatosComprobanteTarjeta=this.jTableDatosComprobanteTarjeta;		
		final JPanel jPanelPaginacionComprobanteTarjeta=this.jPanelPaginacionComprobanteTarjeta;
		//final JScrollPane jScrollPanelDatosEdicionComprobanteTarjeta=this.jScrollPanelDatosEdicionComprobanteTarjeta;
		final JPanel jPanelAccionesComprobanteTarjeta=this.jPanelAccionesComprobanteTarjeta;
		
		JPanel jPanelCamposAuxiliarComprobanteTarjeta=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarComprobanteTarjeta=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormComprobanteTarjeta!=null) {
			jPanelCamposAuxiliarComprobanteTarjeta=this.jInternalFrameDetalleFormComprobanteTarjeta.jPanelCamposComprobanteTarjeta;
			jPanelAccionesFormularioAuxiliarComprobanteTarjeta=this.jInternalFrameDetalleFormComprobanteTarjeta.jPanelAccionesFormularioComprobanteTarjeta;
		}
		
		final JPanel jPanelCamposComprobanteTarjeta=jPanelCamposAuxiliarComprobanteTarjeta;
		final JPanel jPanelAccionesFormularioComprobanteTarjeta=jPanelAccionesFormularioAuxiliarComprobanteTarjeta;
		
		
		final JMenuBar jmenuBarComprobanteTarjeta=this.jmenuBarComprobanteTarjeta;
		final JToolBar jTtoolBarComprobanteTarjeta=this.jTtoolBarComprobanteTarjeta;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarComprobanteTarjeta=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarComprobanteTarjeta=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormComprobanteTarjeta!=null) {
			jmenuBarDetalleAuxiliarComprobanteTarjeta=this.jInternalFrameDetalleFormComprobanteTarjeta.jmenuBarDetalleComprobanteTarjeta;
			jTtoolBarDetalleAuxiliarComprobanteTarjeta=this.jInternalFrameDetalleFormComprobanteTarjeta.jTtoolBarDetalleComprobanteTarjeta;
		}
		
		final JMenuBar jmenuBarDetalleComprobanteTarjeta=jmenuBarDetalleAuxiliarComprobanteTarjeta;
		final JToolBar jTtoolBarDetalleComprobanteTarjeta=jTtoolBarDetalleAuxiliarComprobanteTarjeta;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasComprobanteTarjeta;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesComprobanteTarjeta;
			processRunnable.jTableDatos=jTableDatosComprobanteTarjeta;
			processRunnable.jPanelCampos=jPanelCamposComprobanteTarjeta;
			processRunnable.jPanelPaginacion=jPanelPaginacionComprobanteTarjeta;
			processRunnable.jPanelAcciones=jPanelAccionesComprobanteTarjeta;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioComprobanteTarjeta;
			
			
			processRunnable.jmenuBar=jmenuBarComprobanteTarjeta;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleComprobanteTarjeta;
			processRunnable.jTtoolBar=jTtoolBarComprobanteTarjeta;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleComprobanteTarjeta;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasComprobanteTarjeta ,jPanelParametrosReportesComprobanteTarjeta,jTableDatosComprobanteTarjeta, /*jScrollPanelDatosComprobanteTarjeta,*/jPanelCamposComprobanteTarjeta,jPanelPaginacionComprobanteTarjeta, /*jScrollPanelDatosEdicionComprobanteTarjeta,*/ jPanelAccionesComprobanteTarjeta,jPanelAccionesFormularioComprobanteTarjeta,jmenuBarComprobanteTarjeta,jmenuBarDetalleComprobanteTarjeta,jTtoolBarComprobanteTarjeta,jTtoolBarDetalleComprobanteTarjeta);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasComprobanteTarjeta ,jPanelParametrosReportesComprobanteTarjeta, jScrollPanelDatosComprobanteTarjeta,jPanelPaginacionComprobanteTarjeta, jScrollPanelDatosEdicionComprobanteTarjeta, jPanelAccionesComprobanteTarjeta,jPanelAccionesFormularioComprobanteTarjeta,jmenuBarComprobanteTarjeta,jmenuBarDetalleComprobanteTarjeta,jTtoolBarComprobanteTarjeta,jTtoolBarDetalleComprobanteTarjeta);
						
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
	
	public void finishProcessComprobanteTarjeta() {// throws Exception 
		this.finishProcessComprobanteTarjeta(true);
	}
	
	public void finishProcessComprobanteTarjeta(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasComprobanteTarjeta ,this.jPanelParametrosReportesComprobanteTarjeta, this.jScrollPanelDatosComprobanteTarjeta,this.jPanelPaginacionComprobanteTarjeta, this.jScrollPanelDatosEdicionComprobanteTarjeta, this.jPanelAccionesComprobanteTarjeta,this.jPanelAccionesFormularioComprobanteTarjeta,this.jmenuBarComprobanteTarjeta,this.jmenuBarDetalleComprobanteTarjeta,this.jTtoolBarComprobanteTarjeta,this.jTtoolBarDetalleComprobanteTarjeta);		
		
		final JTabbedPane jTabbedPaneBusquedasComprobanteTarjeta=this.jTabbedPaneBusquedasComprobanteTarjeta; 
		
		final JPanel jPanelParametrosReportesComprobanteTarjeta=this.jPanelParametrosReportesComprobanteTarjeta;
		//final JScrollPane jScrollPanelDatosComprobanteTarjeta=this.jScrollPanelDatosComprobanteTarjeta;
		final JTable jTableDatosComprobanteTarjeta=this.jTableDatosComprobanteTarjeta;		
		final JPanel jPanelPaginacionComprobanteTarjeta=this.jPanelPaginacionComprobanteTarjeta;
		//final JScrollPane jScrollPanelDatosEdicionComprobanteTarjeta=this.jScrollPanelDatosEdicionComprobanteTarjeta;
		final JPanel jPanelAccionesComprobanteTarjeta=this.jPanelAccionesComprobanteTarjeta;
		
		JPanel jPanelCamposAuxiliarComprobanteTarjeta=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarComprobanteTarjeta=new JPanel();
		
		if(this.jInternalFrameDetalleFormComprobanteTarjeta!=null) {
			jPanelCamposAuxiliarComprobanteTarjeta=this.jInternalFrameDetalleFormComprobanteTarjeta.jPanelCamposComprobanteTarjeta;
			jPanelAccionesFormularioAuxiliarComprobanteTarjeta=this.jInternalFrameDetalleFormComprobanteTarjeta.jPanelAccionesFormularioComprobanteTarjeta;
		}
		
		final JPanel jPanelCamposComprobanteTarjeta=jPanelCamposAuxiliarComprobanteTarjeta;
		final JPanel jPanelAccionesFormularioComprobanteTarjeta=jPanelAccionesFormularioAuxiliarComprobanteTarjeta;
		
		
		final JMenuBar jmenuBarComprobanteTarjeta=this.jmenuBarComprobanteTarjeta;		
		final JToolBar jTtoolBarComprobanteTarjeta=this.jTtoolBarComprobanteTarjeta;
				
		JMenuBar jmenuBarDetalleAuxiliarComprobanteTarjeta=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarComprobanteTarjeta=new JToolBar();
		
		if(this.jInternalFrameDetalleFormComprobanteTarjeta!=null) {
			jmenuBarDetalleAuxiliarComprobanteTarjeta=this.jInternalFrameDetalleFormComprobanteTarjeta.jmenuBarDetalleComprobanteTarjeta;
			jTtoolBarDetalleAuxiliarComprobanteTarjeta=this.jInternalFrameDetalleFormComprobanteTarjeta.jTtoolBarDetalleComprobanteTarjeta;		
		}
		
		final JMenuBar jmenuBarDetalleComprobanteTarjeta=jmenuBarDetalleAuxiliarComprobanteTarjeta;
		final JToolBar jTtoolBarDetalleComprobanteTarjeta=jTtoolBarDetalleAuxiliarComprobanteTarjeta;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasComprobanteTarjeta;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesComprobanteTarjeta;
			processRunnable.jTableDatos=jTableDatosComprobanteTarjeta;
			processRunnable.jPanelCampos=jPanelCamposComprobanteTarjeta;
			processRunnable.jPanelPaginacion=jPanelPaginacionComprobanteTarjeta;
			processRunnable.jPanelAcciones=jPanelAccionesComprobanteTarjeta;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioComprobanteTarjeta;
			
			
			processRunnable.jmenuBar=jmenuBarComprobanteTarjeta;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleComprobanteTarjeta;
			processRunnable.jTtoolBar=jTtoolBarComprobanteTarjeta;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleComprobanteTarjeta;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasComprobanteTarjeta ,jPanelParametrosReportesComprobanteTarjeta, jTableDatosComprobanteTarjeta,/*jScrollPanelDatosComprobanteTarjeta,*/jPanelCamposComprobanteTarjeta,jPanelPaginacionComprobanteTarjeta, /*jScrollPanelDatosEdicionComprobanteTarjeta,*/ jPanelAccionesComprobanteTarjeta,jPanelAccionesFormularioComprobanteTarjeta,jmenuBarComprobanteTarjeta,jmenuBarDetalleComprobanteTarjeta,jTtoolBarComprobanteTarjeta,jTtoolBarDetalleComprobanteTarjeta));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesComprobanteTarjeta(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarComprobanteTarjeta(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuComprobanteTarjeta(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarComprobanteTarjeta(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarComprobanteTarjeta,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleComprobanteTarjeta,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuComprobanteTarjeta(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarComprobanteTarjeta,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleComprobanteTarjeta,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.comprobantetarjetaConstantesFunciones.getsFinalQueryComprobanteTarjeta();
		String  finalQueryPaginacionTodos=this.comprobantetarjetaConstantesFunciones.getsFinalQueryComprobanteTarjeta();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=ComprobanteTarjetaConstantesFunciones.getArrayColumnasGlobalesNoComprobanteTarjeta(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=ComprobanteTarjetaConstantesFunciones.getArrayColumnasGlobalesComprobanteTarjeta(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,ComprobanteTarjetaConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.comprobantetarjetasEliminados= new ArrayList<ComprobanteTarjeta>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessComprobanteTarjeta();
		
				///*ComprobanteTarjetaSessionBean*/this.comprobantetarjetaSessionBean=new ComprobanteTarjetaSessionBean();
			
			if(this.comprobantetarjetaSessionBean==null) {
				this.comprobantetarjetaSessionBean=new ComprobanteTarjetaSessionBean();
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
					this.iNumeroPaginacion=ComprobanteTarjetaConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=ComprobanteTarjetaConstantesFunciones.getClassesForeignKeysOfComprobanteTarjeta(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/comprobantetarjeta."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			comprobantetarjetasAux= new ArrayList<ComprobanteTarjeta>();
			
				
			comprobantetarjetaLogic.setDatosCliente(this.datosCliente);
			comprobantetarjetaLogic.setDatosDeep(this.datosDeep);
			comprobantetarjetaLogic.setIsConDeep(true);
			
			
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
			}
			
		
			else if(sAccionBusqueda.equals("BusquedaComprobanteTarjeta")) {
				this.sDetalleReporte=ComprobanteTarjetaConstantesFunciones.getDetalleIndiceBusquedaComprobanteTarjeta(fecha_inicioBusquedaComprobanteTarjeta,fecha_finBusquedaComprobanteTarjeta);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					comprobantetarjetaLogic.getComprobanteTarjetasBusquedaComprobanteTarjeta(finalQueryGlobal,pagination,this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,fecha_inicioBusquedaComprobanteTarjeta,fecha_finBusquedaComprobanteTarjeta);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ComprobanteTarjetaConstantesFunciones.getDetalleIndiceBusquedaComprobanteTarjeta(fecha_inicioBusquedaComprobanteTarjeta,fecha_finBusquedaComprobanteTarjeta);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ComprobanteTarjetaConstantesFunciones.getDetalleIndiceBusquedaComprobanteTarjeta(fecha_inicioBusquedaComprobanteTarjeta,fecha_finBusquedaComprobanteTarjeta);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=comprobantetarjetaLogic.getComprobanteTarjetas()==null||comprobantetarjetaLogic.getComprobanteTarjetas().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=comprobantetarjetas==null|| comprobantetarjetas.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						comprobantetarjetasAux=new ArrayList<ComprobanteTarjeta>();
						comprobantetarjetasAux.addAll(comprobantetarjetaLogic.getComprobanteTarjetas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							comprobantetarjetasAux=new ArrayList<ComprobanteTarjeta>();
							comprobantetarjetasAux.addAll(comprobantetarjetas);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							comprobantetarjetaLogic.getComprobanteTarjetasBusquedaComprobanteTarjeta(finalQueryGlobal,pagination,this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,fecha_inicioBusquedaComprobanteTarjeta,fecha_finBusquedaComprobanteTarjeta);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ComprobanteTarjetaConstantesFunciones.getDetalleIndiceBusquedaComprobanteTarjeta(fecha_inicioBusquedaComprobanteTarjeta,fecha_finBusquedaComprobanteTarjeta);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ComprobanteTarjetaConstantesFunciones.getDetalleIndiceBusquedaComprobanteTarjeta(fecha_inicioBusquedaComprobanteTarjeta,fecha_finBusquedaComprobanteTarjeta);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteComprobanteTarjetas("BusquedaComprobanteTarjeta",comprobantetarjetaLogic.getComprobanteTarjetas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteComprobanteTarjetas("BusquedaComprobanteTarjeta",comprobantetarjetas);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						comprobantetarjetaLogic.setComprobanteTarjetas(new ArrayList<ComprobanteTarjeta>());
						comprobantetarjetaLogic.getComprobanteTarjetas().addAll(comprobantetarjetasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							comprobantetarjetas=new ArrayList<ComprobanteTarjeta>();
							comprobantetarjetas.addAll(comprobantetarjetasAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesComprobanteTarjeta();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessComprobanteTarjeta();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=comprobantetarjetaLogic.getComprobanteTarjetas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=comprobantetarjetas.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=comprobantetarjetaLogic.getComprobanteTarjetas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=comprobantetarjetas.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(ComprobanteTarjeta comprobantetarjeta) {
		Boolean permite=true;
		
		if(this.comprobantetarjeta.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=ComprobanteTarjetaConstantesFunciones.getOrderByListaComprobanteTarjeta();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=ComprobanteTarjetaConstantesFunciones.getOrderByListaComprobanteTarjeta();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ComprobanteTarjeta comprobantetarjeta:comprobantetarjetaLogic.getComprobanteTarjetas()) {
				if(comprobantetarjeta.getsType().equals(Constantes2.S_TOTALES)) {
					comprobantetarjetaTotales=comprobantetarjeta;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ComprobanteTarjeta comprobantetarjeta:this.comprobantetarjetas) {
				if(comprobantetarjeta.getsType().equals(Constantes2.S_TOTALES)) {
					comprobantetarjetaTotales=comprobantetarjeta;
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
			this.comprobantetarjetaAux=new ComprobanteTarjeta();
			this.comprobantetarjetaAux.setsType(Constantes2.S_TOTALES);
			this.comprobantetarjetaAux.setIsNew(false);
			this.comprobantetarjetaAux.setIsChanged(false);
			this.comprobantetarjetaAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				//ComprobanteTarjetaConstantesFunciones.TotalizarValoresFilaComprobanteTarjeta(this.comprobantetarjetaLogic.getComprobanteTarjetas(),this.comprobantetarjetaAux);
				
				//this.comprobantetarjetaLogic.getComprobanteTarjetas().add(this.comprobantetarjetaAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				ComprobanteTarjetaConstantesFunciones.TotalizarValoresFilaComprobanteTarjeta(this.comprobantetarjetas,this.comprobantetarjetaAux);
				
				this.comprobantetarjetas.add(this.comprobantetarjetaAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		comprobantetarjetaTotales=new ComprobanteTarjeta();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.comprobantetarjetaLogic.getComprobanteTarjetas().remove(comprobantetarjetaTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.comprobantetarjetas.remove(comprobantetarjetaTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		comprobantetarjetaTotales=new ComprobanteTarjeta();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ComprobanteTarjeta comprobantetarjeta:comprobantetarjetaLogic.getComprobanteTarjetas()) {
				if(comprobantetarjeta.getsType().equals(Constantes2.S_TOTALES)) {
					comprobantetarjetaTotales=comprobantetarjeta;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				ComprobanteTarjetaConstantesFunciones.TotalizarValoresFilaComprobanteTarjeta(this.comprobantetarjetaLogic.getComprobanteTarjetas(),comprobantetarjetaTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ComprobanteTarjeta comprobantetarjeta:this.comprobantetarjetas) {
				if(comprobantetarjeta.getsType().equals(Constantes2.S_TOTALES)) {
					comprobantetarjetaTotales=comprobantetarjeta;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				ComprobanteTarjetaConstantesFunciones.TotalizarValoresFilaComprobanteTarjeta(this.comprobantetarjetas,comprobantetarjetaTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComprobanteTarjetaConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getComprobanteTarjetasBusquedaComprobanteTarjeta()throws Exception {
		try {
			sAccionBusqueda="BusquedaComprobanteTarjeta";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getComprobanteTarjetasFK_IdCaja()throws Exception {
		try {
			sAccionBusqueda="FK_IdCaja";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getComprobanteTarjetasFK_IdCliente()throws Exception {
		try {
			sAccionBusqueda="FK_IdCliente";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getComprobanteTarjetasFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getComprobanteTarjetasFK_IdSucursal()throws Exception {
		try {
			sAccionBusqueda="FK_IdSucursal";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getComprobanteTarjetasBusquedaComprobanteTarjeta(String sFinalQuery,Date fecha_inicio,Date fecha_fin)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//comprobantetarjetaLogic.getComprobanteTarjetasBusquedaComprobanteTarjeta(sFinalQuery,this.pagination,fecha_inicio,fecha_fin);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getComprobanteTarjetasFK_IdCaja(String sFinalQuery,Long id_caja)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//comprobantetarjetaLogic.getComprobanteTarjetasFK_IdCaja(sFinalQuery,this.pagination,id_caja);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getComprobanteTarjetasFK_IdCliente(String sFinalQuery,Long id_cliente)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//comprobantetarjetaLogic.getComprobanteTarjetasFK_IdCliente(sFinalQuery,this.pagination,id_cliente);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getComprobanteTarjetasFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//comprobantetarjetaLogic.getComprobanteTarjetasFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getComprobanteTarjetasFK_IdSucursal(String sFinalQuery,Long id_sucursal)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//comprobantetarjetaLogic.getComprobanteTarjetasFK_IdSucursal(sFinalQuery,this.pagination,id_sucursal);
				
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
	
	public void inicializarPermisosComprobanteTarjeta() {
		this.isPermisoTodoComprobanteTarjeta=false;
		this.isPermisoNuevoComprobanteTarjeta=false;
		this.isPermisoActualizarComprobanteTarjeta=false;
		this.isPermisoActualizarOriginalComprobanteTarjeta=false;
		this.isPermisoEliminarComprobanteTarjeta=false;
		this.isPermisoGuardarCambiosComprobanteTarjeta=false;
		this.isPermisoConsultaComprobanteTarjeta=true;
		this.isPermisoBusquedaComprobanteTarjeta=true;
		this.isPermisoReporteComprobanteTarjeta=true;
		this.isPermisoOrdenComprobanteTarjeta=false;		
		this.isPermisoPaginacionMedioComprobanteTarjeta=false;		
		this.isPermisoPaginacionAltoComprobanteTarjeta=false;		
		this.isPermisoPaginacionTodoComprobanteTarjeta=false;		
		this.isPermisoCopiarComprobanteTarjeta=false;		
		this.isPermisoVerFormComprobanteTarjeta=false;		
		this.isPermisoDuplicarComprobanteTarjeta=false;
		this.isPermisoOrdenComprobanteTarjeta=false;
	}
	
	public void setPermisosUsuarioComprobanteTarjeta(Boolean isPermiso) {
		this.isPermisoTodoComprobanteTarjeta=isPermiso;
		this.isPermisoNuevoComprobanteTarjeta=isPermiso;
		this.isPermisoActualizarComprobanteTarjeta=isPermiso;
		this.isPermisoActualizarOriginalComprobanteTarjeta=isPermiso;
		this.isPermisoEliminarComprobanteTarjeta=isPermiso;
		this.isPermisoGuardarCambiosComprobanteTarjeta=isPermiso;
		this.isPermisoConsultaComprobanteTarjeta=isPermiso;
		this.isPermisoBusquedaComprobanteTarjeta=isPermiso;
		this.isPermisoReporteComprobanteTarjeta=isPermiso;
		this.isPermisoOrdenComprobanteTarjeta=isPermiso;		
		this.isPermisoPaginacionMedioComprobanteTarjeta=isPermiso;		
		this.isPermisoPaginacionAltoComprobanteTarjeta=isPermiso;		
		this.isPermisoPaginacionTodoComprobanteTarjeta=isPermiso;		
		this.isPermisoCopiarComprobanteTarjeta=isPermiso;		
		this.isPermisoVerFormComprobanteTarjeta=isPermiso;		
		this.isPermisoDuplicarComprobanteTarjeta=isPermiso;
		this.isPermisoOrdenComprobanteTarjeta=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioComprobanteTarjeta(Boolean isPermiso) {
		//this.isPermisoTodoComprobanteTarjeta=isPermiso;
		this.isPermisoNuevoComprobanteTarjeta=isPermiso;
		this.isPermisoActualizarComprobanteTarjeta=isPermiso;
		this.isPermisoActualizarOriginalComprobanteTarjeta=isPermiso;
		this.isPermisoEliminarComprobanteTarjeta=isPermiso;
		this.isPermisoGuardarCambiosComprobanteTarjeta=isPermiso;
		//this.isPermisoConsultaComprobanteTarjeta=isPermiso;
		//this.isPermisoBusquedaComprobanteTarjeta=isPermiso;
		//this.isPermisoReporteComprobanteTarjeta=isPermiso;
		//this.isPermisoOrdenComprobanteTarjeta=isPermiso;		
		//this.isPermisoPaginacionMedioComprobanteTarjeta=isPermiso;		
		//this.isPermisoPaginacionAltoComprobanteTarjeta=isPermiso;		
		//this.isPermisoPaginacionTodoComprobanteTarjeta=isPermiso;		
		//this.isPermisoCopiarComprobanteTarjeta=isPermiso;		
		//this.isPermisoDuplicarComprobanteTarjeta=isPermiso;
		//this.isPermisoOrdenComprobanteTarjeta=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioComprobanteTarjetaClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(ComprobanteTarjetaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebComprobanteTarjeta(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioComprobanteTarjetaClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioComprobanteTarjetaClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionComprobanteTarjetaClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioComprobanteTarjetaClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioComprobanteTarjeta() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(ComprobanteTarjetaJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.comprobantetarjetaSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, ComprobanteTarjetaConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoComprobanteTarjeta=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarComprobanteTarjeta=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalComprobanteTarjeta=this.isPermisoActualizarComprobanteTarjeta;
			this.isPermisoEliminarComprobanteTarjeta=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosComprobanteTarjeta=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaComprobanteTarjeta=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaComprobanteTarjeta=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoComprobanteTarjeta=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteComprobanteTarjeta=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenComprobanteTarjeta=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioComprobanteTarjeta=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoComprobanteTarjeta=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoComprobanteTarjeta=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarComprobanteTarjeta=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormComprobanteTarjeta=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarComprobanteTarjeta=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenComprobanteTarjeta=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.comprobantetarjetaSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosComprobanteTarjeta.setToolTipText(this.jTableDatosComprobanteTarjeta.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioComprobanteTarjeta(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioComprobanteTarjeta(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(ComprobanteTarjetaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(ComprobanteTarjetaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioComprobanteTarjeta() throws Exception {
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
	public void inicializarCombosForeignKeyComprobanteTarjetaListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
				this.sucursalsForeignKey=new ArrayList();
				this.clientesForeignKey=new ArrayList();
				this.cajasForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyComprobanteTarjetaListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(ComprobanteTarjetaJInternalFrame.ISLOAD_FKLOTE) {
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeySucursalListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyClienteListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyCajaListas(cargarCombosDependencia,sFinalQueryCombo);
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

	public void cargarCombosForeignKeyCajaListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.cajasForeignKey==null||this.cajasForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=CajaConstantesFunciones.getArrayColumnasGlobalesCaja(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,CajaConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=CajaConstantesFunciones.SFINALQUERY;

				this.cargarCombosCajasForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}
	
	
	public void addItemDefectoCombosTodosForeignKeyComprobanteTarjeta()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeySucursal();
			this.addItemDefectoCombosForeignKeyCliente();
			this.addItemDefectoCombosForeignKeyCaja();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.comprobantetarjetaSessionBean==null) {
				this.comprobantetarjetaSessionBean=new ComprobanteTarjetaSessionBean();
			}

			if(!this.comprobantetarjetaSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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

			if(!this.comprobantetarjetaSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
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

			if(!this.comprobantetarjetaSessionBean.getisBusquedaDesdeForeignKeySesionCliente()) {
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

	public void addItemDefectoCombosForeignKeyCaja()throws Exception {
		try {

			if(!this.comprobantetarjetaSessionBean.getisBusquedaDesdeForeignKeySesionCaja()) {
				Caja caja=new Caja();
				CajaConstantesFunciones.setCajaDescripcion(caja,Constantes.SMENSAJE_ESCOJA_OPCION);
				caja.setId(null);

				if(!CajaConstantesFunciones.ExisteEnLista(this.cajasForeignKey,caja,true)) {

					this.cajasForeignKey.add(0,caja);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void initActionsCombosTodosForeignKeyComprobanteTarjeta()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyComprobanteTarjeta(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyComprobanteTarjeta()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyComprobanteTarjeta();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyComprobanteTarjeta(ComprobanteTarjeta comprobantetarjeta)throws Exception {	
		try {
			
			this.setActualClienteForeignKey(comprobantetarjeta.getid_cliente(),false,"Formulario");
			this.setActualCajaForeignKey(comprobantetarjeta.getid_caja(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyComprobanteTarjeta(ComprobanteTarjeta comprobantetarjeta,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyComprobanteTarjeta()throws Exception {	
		try {
			
			this.setActualClienteForeignKey(this.comprobantetarjetaConstantesFunciones.getid_cliente(),false,"Formulario");
			this.setActualCajaForeignKey(this.comprobantetarjetaConstantesFunciones.getid_caja(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyComprobanteTarjeta()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyComprobanteTarjeta()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyComprobanteTarjeta()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroComprobanteTarjeta()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyComprobanteTarjeta()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameSucursalsForeignKey("Todos");
			this.cargarCombosFrameClientesForeignKey("Todos");
			this.cargarCombosFrameCajasForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyComprobanteTarjeta(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameSucursalsForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameClientesForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameCajasForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyComprobanteTarjeta()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormComprobanteTarjeta.jComboBoxid_empresaComprobanteTarjeta!=null && this.jInternalFrameDetalleFormComprobanteTarjeta.jComboBoxid_empresaComprobanteTarjeta.getItemCount()>0) {
				this.jInternalFrameDetalleFormComprobanteTarjeta.jComboBoxid_empresaComprobanteTarjeta.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormComprobanteTarjeta.jComboBoxid_sucursalComprobanteTarjeta!=null && this.jInternalFrameDetalleFormComprobanteTarjeta.jComboBoxid_sucursalComprobanteTarjeta.getItemCount()>0) {
				this.jInternalFrameDetalleFormComprobanteTarjeta.jComboBoxid_sucursalComprobanteTarjeta.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormComprobanteTarjeta.jComboBoxid_clienteComprobanteTarjeta!=null && this.jInternalFrameDetalleFormComprobanteTarjeta.jComboBoxid_clienteComprobanteTarjeta.getItemCount()>0) {
				this.jInternalFrameDetalleFormComprobanteTarjeta.jComboBoxid_clienteComprobanteTarjeta.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormComprobanteTarjeta.jComboBoxid_cajaComprobanteTarjeta!=null && this.jInternalFrameDetalleFormComprobanteTarjeta.jComboBoxid_cajaComprobanteTarjeta.getItemCount()>0) {
				this.jInternalFrameDetalleFormComprobanteTarjeta.jComboBoxid_cajaComprobanteTarjeta.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	








	
	

	public ComprobanteTarjetaBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public ComprobanteTarjetaBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public ComprobanteTarjetaBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.comprobantetarjetaSessionBean=new ComprobanteTarjetaSessionBean(); 
		this.comprobantetarjetaConstantesFunciones=new ComprobanteTarjetaConstantesFunciones(); 
		this.comprobantetarjetaBean=new ComprobanteTarjeta();//(this.comprobantetarjetaConstantesFunciones); 		
		this.comprobantetarjetaReturnGeneral=new ComprobanteTarjetaParameterReturnGeneral(); 
		
		this.comprobantetarjetaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.comprobantetarjetaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public ComprobanteTarjetaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public ComprobanteTarjetaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public ComprobanteTarjetaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessComprobanteTarjeta(true);
			
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
			
			this.comprobantetarjetaConstantesFunciones=new ComprobanteTarjetaConstantesFunciones(); 
			this.comprobantetarjetaBean=new ComprobanteTarjeta();//this.comprobantetarjetaConstantesFunciones); 			
			this.comprobantetarjetaReturnGeneral=new ComprobanteTarjetaParameterReturnGeneral(); 
		
			ComprobanteTarjetaBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Comprobante Tarjeta Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			this.conTotales=true;
			
			
			this.comprobantetarjeta=new ComprobanteTarjeta();
			this.comprobantetarjetas = new ArrayList<ComprobanteTarjeta>();
			this.comprobantetarjetasAux = new ArrayList<ComprobanteTarjeta>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comprobantetarjetaLogic=new ComprobanteTarjetaLogic();
				this.comprobantetarjetaLogic.getNewConnexionToDeep("");
			}
			
			//this.comprobantetarjetaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.comprobantetarjetaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormComprobanteTarjeta);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoComprobanteTarjeta!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoComprobanteTarjeta);	
					}
					
					if(this.jInternalFrameImportacionComprobanteTarjeta!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionComprobanteTarjeta);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByComprobanteTarjeta!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByComprobanteTarjeta);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormComprobanteTarjeta!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormComprobanteTarjeta);
				this.jInternalFrameDetalleFormComprobanteTarjeta.setVisible(false);
				this.jInternalFrameDetalleFormComprobanteTarjeta.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoComprobanteTarjeta!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoComprobanteTarjeta);
					this.jInternalFrameReporteDinamicoComprobanteTarjeta.setVisible(false);
					this.jInternalFrameReporteDinamicoComprobanteTarjeta.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionComprobanteTarjeta!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionComprobanteTarjeta);
					this.jInternalFrameImportacionComprobanteTarjeta.setVisible(false);
					this.jInternalFrameImportacionComprobanteTarjeta.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByComprobanteTarjeta!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByComprobanteTarjeta);
					this.jInternalFrameOrderByComprobanteTarjeta.setVisible(false);
					this.jInternalFrameOrderByComprobanteTarjeta.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idComprobanteTarjetaActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=ComprobanteTarjetaConstantesFunciones.INUMEROPAGINACION;
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
			
			this.comprobantetarjetaReturnGeneral=new ComprobanteTarjetaParameterReturnGeneral();
			
			this.comprobantetarjetaParameterGeneral=new ComprobanteTarjetaParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.comprobantetarjetaLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.comprobantetarjetaSessionBean.getEsGuardarRelacionado()) {
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
			
			if(ComprobanteTarjetaJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.comprobantetarjetaSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,ComprobanteTarjetaConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.comprobantetarjetaSessionBean.getEsGuardarRelacionado(),this.comprobantetarjetaSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,ComprobanteTarjetaConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.comprobantetarjetaSessionBean.getEsGuardarRelacionado(),this.comprobantetarjetaSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoComprobanteTarjeta=false;
			this.isVisibilidadCeldaDuplicarComprobanteTarjeta=true;
			this.isVisibilidadCeldaCopiarComprobanteTarjeta=true;
			this.isVisibilidadCeldaVerFormComprobanteTarjeta=true;
			this.isVisibilidadCeldaOrdenComprobanteTarjeta=true;
			this.isVisibilidadCeldaNuevoRelacionesComprobanteTarjeta=false;
			this.isVisibilidadCeldaModificarComprobanteTarjeta=false;
			this.isVisibilidadCeldaActualizarComprobanteTarjeta=false;
			this.isVisibilidadCeldaEliminarComprobanteTarjeta=false;
			this.isVisibilidadCeldaCancelarComprobanteTarjeta=false;
			this.isVisibilidadCeldaGuardarComprobanteTarjeta=false;
			this.isVisibilidadCeldaGuardarCambiosComprobanteTarjeta=false;
			
			
			this.isVisibilidadBusquedaComprobanteTarjeta=true;
			this.isVisibilidadFK_IdCaja=true;
			this.isVisibilidadFK_IdCliente=true;
			this.isVisibilidadFK_IdEmpresa=true;
			this.isVisibilidadFK_IdSucursal=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesComprobanteTarjeta("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosComprobanteTarjeta();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioComprobanteTarjeta(false);
			
			this.setPermisosUsuarioComprobanteTarjeta();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.comprobantetarjetaSessionBean.getEsGuardarRelacionado() 
				|| (this.comprobantetarjetaSessionBean.getEsGuardarRelacionado() && this.comprobantetarjetaSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioComprobanteTarjetaClasesRelacionadas();
			}
			
			if(this.comprobantetarjetaSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioComprobanteTarjetaClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!ComprobanteTarjetaJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosComprobanteTarjeta();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualComprobanteTarjeta();
			}
			
			if(!this.isPermisoBusquedaComprobanteTarjeta) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasComprobanteTarjeta.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.comprobantetarjetaSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(true);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(true);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(true,true,true);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(ComprobanteTarjetaConstantesFunciones.getTiposSeleccionarComprobanteTarjeta());
				
				this.tiposColumnasSelect=ComprobanteTarjetaConstantesFunciones.getTiposSeleccionarComprobanteTarjeta(true);
				
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
			//if(!this.comprobantetarjetaSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioComprobanteTarjeta();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(true,false,false);
				this.setAccionesUsuarioComprobanteTarjeta(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(true,false,false);							
				this.setAccionesUsuarioComprobanteTarjeta(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesComprobanteTarjeta() ;
			
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
			this.cajaLogic=new CajaLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				comprobantetarjetaImplementable= (ComprobanteTarjetaImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+ComprobanteTarjetaConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				comprobantetarjetaImplementableHome= (ComprobanteTarjetaImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+ComprobanteTarjetaConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.comprobantetarjetas= new ArrayList<ComprobanteTarjeta>();
			this.comprobantetarjetasEliminados= new ArrayList<ComprobanteTarjeta>();
						
			this.isEsNuevoComprobanteTarjeta=false;
			this.esParaAccionDesdeFormularioComprobanteTarjeta=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			this.sucursalsForeignKey=new ArrayList<Sucursal>() ;
			this.clientesForeignKey=new ArrayList<Cliente>() ;
			this.cajasForeignKey=new ArrayList<Caja>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyComprobanteTarjeta(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroComprobanteTarjeta();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.comprobantetarjetaSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			ComprobanteTarjetaBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=ComprobanteTarjetaConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesComprobanteTarjeta("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingComprobanteTarjeta(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormComprobanteTarjeta!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioComprobanteTarjeta();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioComprobanteTarjeta();
			}
			
			ComprobanteTarjetaBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasComprobanteTarjeta.getTabCount(); i++) {
					this.jTabbedPaneBusquedasComprobanteTarjeta.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasComprobanteTarjeta.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comprobantetarjetaLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessComprobanteTarjeta(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga ComprobanteTarjeta: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comprobantetarjetaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ComprobanteTarjetaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comprobantetarjetaLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectComprobanteTarjeta() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesComprobanteTarjeta")) {
				iIndex=this.jInternalFrameDetalleFormComprobanteTarjeta.jTabbedPaneRelacionesComprobanteTarjeta.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormComprobanteTarjeta.jTabbedPaneRelacionesComprobanteTarjeta.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosComprobanteTarjeta.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessComprobanteTarjeta();	
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
	
	public void cargarCombosForeignKeyComprobanteTarjeta(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyComprobanteTarjeta(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyComprobanteTarjeta(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyComprobanteTarjetaListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyComprobanteTarjeta();
		
		this.cargarCombosFrameForeignKeyComprobanteTarjeta();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyComprobanteTarjeta();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyComprobanteTarjeta();
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

	public void cargarCombosForeignKeyCaja(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyCajaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyCaja();
				this.cargarCombosFrameCajasForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaCaja(this.cajasForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void jButtonNuevoComprobanteTarjetaActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.comprobantetarjetaSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormComprobanteTarjeta==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			ComprobanteTarjetaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.comprobantetarjeta,new Object(),this.comprobantetarjetaParameterGeneral,this.comprobantetarjetaReturnGeneral);
			
			
			if(jTableDatosComprobanteTarjeta.getRowCount()>=1) {
				jTableDatosComprobanteTarjeta.removeRowSelectionInterval(0, jTableDatosComprobanteTarjeta.getRowCount()-1);						
			}
			
			this.isEsNuevoComprobanteTarjeta=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoComprobanteTarjeta(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesComprobanteTarjeta(true);			
			//this.comprobantetarjeta=new ComprobanteTarjeta();
			//this.comprobantetarjeta.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesComprobanteTarjeta(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualComprobanteTarjeta() ;
			
			if(ComprobanteTarjetaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleComprobanteTarjeta(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.comprobantetarjeta);	
			this.actualizarInformacion("INFO_PADRE",false,this.comprobantetarjeta);				
			
			ComprobanteTarjetaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.comprobantetarjeta,new Object(),this.comprobantetarjetaParameterGeneral,this.comprobantetarjetaReturnGeneral);
			
			if(this.comprobantetarjetaSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar ComprobanteTarjeta: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			ComprobanteTarjetaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.comprobantetarjeta,new Object(),this.comprobantetarjetaParameterGeneral,this.comprobantetarjetaReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,ComprobanteTarjetaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarComprobanteTarjetaActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<ComprobanteTarjeta> comprobantetarjetasSeleccionados=new ArrayList<ComprobanteTarjeta>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosComprobanteTarjeta.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosComprobanteTarjeta.getSelectedRows().length;			
			}
			
			comprobantetarjetasSeleccionados=this.getComprobanteTarjetasSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoComprobanteTarjeta--;			
				//ComprobanteTarjeta comprobantetarjetaAux= new ComprobanteTarjeta();			
				//comprobantetarjetaAux.setId(this.iIdNuevoComprobanteTarjeta);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//ComprobanteTarjeta comprobantetarjetaOrigen=new ComprobanteTarjeta();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(ComprobanteTarjeta comprobantetarjetaOrigen : comprobantetarjetasSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosComprobanteTarjeta.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							comprobantetarjetaOrigen =(ComprobanteTarjeta) this.comprobantetarjetaLogic.getComprobanteTarjetas().toArray()[this.jTableDatosComprobanteTarjeta.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							comprobantetarjetaOrigen =(ComprobanteTarjeta) this.comprobantetarjetas.toArray()[this.jTableDatosComprobanteTarjeta.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaComprobanteTarjeta();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.comprobantetarjeta.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosComprobanteTarjeta(comprobantetarjetaOrigen,this.comprobantetarjeta,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysComprobanteTarjeta(this.comprobantetarjeta);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.comprobantetarjetaLogic.getComprobanteTarjetas().add(this.comprobantetarjetaAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.comprobantetarjetas.add(this.comprobantetarjetaAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaComprobanteTarjeta(false);
				
				this.jTableDatosComprobanteTarjeta.setRowSelectionInterval(this.getIndiceNuevoComprobanteTarjeta(), this.getIndiceNuevoComprobanteTarjeta());
				
				int iLastRow =  this.jTableDatosComprobanteTarjeta.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosComprobanteTarjeta.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosComprobanteTarjeta.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaComprobanteTarjeta(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,ComprobanteTarjetaConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarComprobanteTarjetaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<ComprobanteTarjeta> comprobantetarjetasSeleccionados=new ArrayList<ComprobanteTarjeta>();									
		
			ComprobanteTarjeta comprobantetarjetaOrigen=new ComprobanteTarjeta();
			ComprobanteTarjeta comprobantetarjetaDestino=new ComprobanteTarjeta();
				
			comprobantetarjetasSeleccionados=this.getComprobanteTarjetasSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosComprobanteTarjeta.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || comprobantetarjetasSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosComprobanteTarjeta.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						comprobantetarjetaOrigen =(ComprobanteTarjeta) this.comprobantetarjetaLogic.getComprobanteTarjetas().toArray()[this.jTableDatosComprobanteTarjeta.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						comprobantetarjetaOrigen =(ComprobanteTarjeta) this.comprobantetarjetas.toArray()[this.jTableDatosComprobanteTarjeta.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						comprobantetarjetaDestino =(ComprobanteTarjeta) this.comprobantetarjetaLogic.getComprobanteTarjetas().toArray()[this.jTableDatosComprobanteTarjeta.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						comprobantetarjetaDestino =(ComprobanteTarjeta) this.comprobantetarjetas.toArray()[this.jTableDatosComprobanteTarjeta.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				comprobantetarjetaOrigen =comprobantetarjetasSeleccionados.get(0);
				comprobantetarjetaDestino =comprobantetarjetasSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosComprobanteTarjeta(comprobantetarjetaOrigen,comprobantetarjetaDestino,true,false);
				
				comprobantetarjetaDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(comprobantetarjetaDestino,comprobantetarjetaLogic.getComprobanteTarjetas());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(comprobantetarjetaDestino,comprobantetarjetas);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaComprobanteTarjeta(false);
				
				//this.jTableDatosComprobanteTarjeta.setRowSelectionInterval(this.getIndiceNuevoComprobanteTarjeta(), this.getIndiceNuevoComprobanteTarjeta());
				
				int iLastRow =  this.jTableDatosComprobanteTarjeta.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosComprobanteTarjeta.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosComprobanteTarjeta.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaComprobanteTarjeta(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComprobanteTarjetaConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormComprobanteTarjetaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormComprobanteTarjeta==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormComprobanteTarjeta.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComprobanteTarjetaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarComprobanteTarjetaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesComprobanteTarjeta.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasComprobanteTarjeta.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesComprobanteTarjeta.setVisible(!isVisible);
			this.jPanelPaginacionComprobanteTarjeta.setVisible(!isVisible);
			this.jPanelAccionesComprobanteTarjeta.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComprobanteTarjetaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarComprobanteTarjetaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameComprobanteTarjeta();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComprobanteTarjetaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoComprobanteTarjetaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoComprobanteTarjeta();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComprobanteTarjetaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionComprobanteTarjetaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionComprobanteTarjeta();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComprobanteTarjetaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByComprobanteTarjetaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByComprobanteTarjeta();
			
			this.abrirFrameOrderByComprobanteTarjeta();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComprobanteTarjetaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByComprobanteTarjetaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByComprobanteTarjeta();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComprobanteTarjetaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleComprobanteTarjeta(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormComprobanteTarjeta);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormComprobanteTarjeta.isMaximum()) {
					this.jInternalFrameDetalleFormComprobanteTarjeta.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormComprobanteTarjeta.setSize(this.jInternalFrameDetalleFormComprobanteTarjeta.iWidthFormulario,this.jInternalFrameDetalleFormComprobanteTarjeta.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormComprobanteTarjeta.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormComprobanteTarjeta.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormComprobanteTarjeta.isMaximum()) {
						this.jInternalFrameDetalleFormComprobanteTarjeta.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormComprobanteTarjeta.jContentPaneDetalleComprobanteTarjeta.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormComprobanteTarjeta.jTabbedPaneRelacionesComprobanteTarjeta.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormComprobanteTarjeta.jContentPaneDetalleComprobanteTarjeta.getWidth(),ComprobanteTarjetaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormComprobanteTarjeta.jTabbedPaneRelacionesComprobanteTarjeta.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormComprobanteTarjeta.jContentPaneDetalleComprobanteTarjeta.getWidth(),ComprobanteTarjetaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormComprobanteTarjeta.jTabbedPaneRelacionesComprobanteTarjeta.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormComprobanteTarjeta.jContentPaneDetalleComprobanteTarjeta.getWidth(),ComprobanteTarjetaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormComprobanteTarjeta.setVisible(true);
	        this.jInternalFrameDetalleFormComprobanteTarjeta.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ComprobanteTarjetaConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByComprobanteTarjeta() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByComprobanteTarjeta==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByComprobanteTarjeta=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByComprobanteTarjeta,false,this);
				} else {
					this.jInternalFrameOrderByComprobanteTarjeta=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByComprobanteTarjeta,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByComprobanteTarjeta);
				this.jInternalFrameOrderByComprobanteTarjeta.setVisible(false);
				this.jInternalFrameOrderByComprobanteTarjeta.setSelected(false);
				
				this.jInternalFrameOrderByComprobanteTarjeta.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByComprobanteTarjeta"));
				
				this.inicializarActualizarBindingTablaOrderByComprobanteTarjeta();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionComprobanteTarjeta() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionComprobanteTarjeta==null) {
				
				this.jInternalFrameImportacionComprobanteTarjeta=new ImportacionJInternalFrame(ComprobanteTarjetaConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionComprobanteTarjeta);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionComprobanteTarjeta);
				this.jInternalFrameImportacionComprobanteTarjeta.setVisible(false);
				this.jInternalFrameImportacionComprobanteTarjeta.setSelected(false);


				this.jInternalFrameImportacionComprobanteTarjeta.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionComprobanteTarjeta"));
				this.jInternalFrameImportacionComprobanteTarjeta.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionComprobanteTarjeta"));
				this.jInternalFrameImportacionComprobanteTarjeta.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionComprobanteTarjeta"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoComprobanteTarjeta() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoComprobanteTarjeta==null) {
				this.jInternalFrameReporteDinamicoComprobanteTarjeta=new ReporteDinamicoJInternalFrame(ComprobanteTarjetaConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoComprobanteTarjeta);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoComprobanteTarjeta);
				this.jInternalFrameReporteDinamicoComprobanteTarjeta.setVisible(false);
				this.jInternalFrameReporteDinamicoComprobanteTarjeta.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoComprobanteTarjeta.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoComprobanteTarjeta"));
				this.jInternalFrameReporteDinamicoComprobanteTarjeta.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoComprobanteTarjeta"));
				this.jInternalFrameReporteDinamicoComprobanteTarjeta.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoComprobanteTarjeta"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualComprobanteTarjeta();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleComprobanteTarjeta() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormComprobanteTarjeta);
			
	       	this.jInternalFrameDetalleFormComprobanteTarjeta.setVisible(false);
	        this.jInternalFrameDetalleFormComprobanteTarjeta.setSelected(false);
			
			//this.jInternalFrameDetalleFormComprobanteTarjeta.dispose();
			//this.jInternalFrameDetalleFormComprobanteTarjeta=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ComprobanteTarjetaConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoComprobanteTarjeta() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoComprobanteTarjeta.setVisible(true);
	        this.jInternalFrameReporteDinamicoComprobanteTarjeta.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ComprobanteTarjetaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionComprobanteTarjeta() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionComprobanteTarjeta.setVisible(true);
	        this.jInternalFrameImportacionComprobanteTarjeta.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ComprobanteTarjetaConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByComprobanteTarjeta() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByComprobanteTarjeta.setVisible(true);
	        this.jInternalFrameOrderByComprobanteTarjeta.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ComprobanteTarjetaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByComprobanteTarjeta() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByComprobanteTarjeta.setVisible(false);
	        this.jInternalFrameOrderByComprobanteTarjeta.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ComprobanteTarjetaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoComprobanteTarjeta() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoComprobanteTarjeta.setVisible(false);
	        this.jInternalFrameReporteDinamicoComprobanteTarjeta.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ComprobanteTarjetaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionComprobanteTarjeta() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionComprobanteTarjeta.setVisible(false);
	        this.jInternalFrameImportacionComprobanteTarjeta.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ComprobanteTarjetaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarComprobanteTarjetaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarComprobanteTarjeta(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComprobanteTarjetaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarComprobanteTarjeta(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosComprobanteTarjeta.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesComprobanteTarjeta(true);
			//this.isEsNuevoComprobanteTarjeta=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comprobantetarjeta =(ComprobanteTarjeta) this.comprobantetarjetaLogic.getComprobanteTarjetas().toArray()[this.jTableDatosComprobanteTarjeta.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.comprobantetarjeta =(ComprobanteTarjeta) this.comprobantetarjetas.toArray()[this.jTableDatosComprobanteTarjeta.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesComprobanteTarjeta("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesComprobanteTarjeta(false) ;
			
			if(comprobantetarjetaSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(ComprobanteTarjetaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleComprobanteTarjeta(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualComprobanteTarjeta(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComprobanteTarjetaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaComprobanteTarjetaActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosComprobanteTarjeta.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantetarjeta =(ComprobanteTarjeta) this.comprobantetarjetaLogic.getComprobanteTarjetas().toArray()[this.jTableDatosComprobanteTarjeta.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.comprobantetarjeta =(ComprobanteTarjeta) this.comprobantetarjetas.toArray()[this.jTableDatosComprobanteTarjeta.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComprobanteTarjetaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarComprobanteTarjeta(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormComprobanteTarjeta==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosComprobanteTarjeta.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesComprobanteTarjeta(true);
			//this.isEsNuevoComprobanteTarjeta=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comprobantetarjeta =(ComprobanteTarjeta) this.comprobantetarjetaLogic.getComprobanteTarjetas().toArray()[this.jTableDatosComprobanteTarjeta.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.comprobantetarjeta =(ComprobanteTarjeta) this.comprobantetarjetas.toArray()[this.jTableDatosComprobanteTarjeta.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.comprobantetarjeta.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesComprobanteTarjeta("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesComprobanteTarjeta(false) ;
			
			if(ComprobanteTarjetaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleComprobanteTarjeta(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualComprobanteTarjeta(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComprobanteTarjetaConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
			
	
	public void recargarComboTablaCliente(List<Cliente> clientesForeignKey)throws Exception{
		TableColumn tableColumnCliente=this.jTableDatosComprobanteTarjeta.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosComprobanteTarjeta,ComprobanteTarjetaConstantesFunciones.LABEL_IDCLIENTE));
		TableCellEditor tableCellEditorCliente =tableColumnCliente.getCellEditor();

		ClienteTableCell clienteTableCellFk=(ClienteTableCell)tableCellEditorCliente;

		if(clienteTableCellFk!=null) {
			clienteTableCellFk.setclientesForeignKey(clientesForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosComprobanteTarjeta.getSelectedRow();

		//if(intSelectedRow<=0) {
			//clienteTableCellFk.setRowActual(intSelectedRow);
			//clienteTableCellFk.setclientesForeignKeyActual(clientesForeignKey);
		//}


		if(clienteTableCellFk!=null) {
			clienteTableCellFk.RecargarClientesForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaCaja(List<Caja> cajasForeignKey)throws Exception{
		TableColumn tableColumnCaja=this.jTableDatosComprobanteTarjeta.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosComprobanteTarjeta,ComprobanteTarjetaConstantesFunciones.LABEL_IDCAJA));
		TableCellEditor tableCellEditorCaja =tableColumnCaja.getCellEditor();

		CajaTableCell cajaTableCellFk=(CajaTableCell)tableCellEditorCaja;

		if(cajaTableCellFk!=null) {
			cajaTableCellFk.setcajasForeignKey(cajasForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosComprobanteTarjeta.getSelectedRow();

		//if(intSelectedRow<=0) {
			//cajaTableCellFk.setRowActual(intSelectedRow);
			//cajaTableCellFk.setcajasForeignKeyActual(cajasForeignKey);
		//}


		if(cajaTableCellFk!=null) {
			cajaTableCellFk.RecargarCajasForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	
	public void jButtonActualizarComprobanteTarjetaActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comprobantetarjetaLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesComprobanteTarjeta(false);
			
			//if(!this.isEsNuevoComprobanteTarjeta) {								
				int intSelectedRow = this.jTableDatosComprobanteTarjeta.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantetarjeta =(ComprobanteTarjeta) this.comprobantetarjetaLogic.getComprobanteTarjetas().toArray()[this.jTableDatosComprobanteTarjeta.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.comprobantetarjeta =(ComprobanteTarjeta) this.comprobantetarjetas.toArray()[this.jTableDatosComprobanteTarjeta.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(ComprobanteTarjetaJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualComprobanteTarjeta(this.comprobantetarjeta,true);
				this.setVariablesFormularioToObjetoActualForeignKeysComprobanteTarjeta(this.comprobantetarjeta);
				
			}
			
			if(this.permiteMantenimiento(this.comprobantetarjeta)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.comprobantetarjetaSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoComprobanteTarjeta=true;
					this.inicializarActualizarBindingTablaComprobanteTarjeta(false);
					this.isEsNuevoComprobanteTarjeta=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoComprobanteTarjeta=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoComprobanteTarjeta=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesComprobanteTarjeta(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualComprobanteTarjeta(false);
				
				this.habilitarDeshabilitarControlesComprobanteTarjeta(false);
			
												
				
				if(ComprobanteTarjetaJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleComprobanteTarjeta();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoComprobanteTarjetaActionPerformed(evt,comprobantetarjetaSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualComprobanteTarjeta(this.comprobantetarjeta,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosComprobanteTarjeta.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,comprobantetarjetaSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comprobantetarjetaLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.comprobantetarjeta.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(ComprobanteTarjeta.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ComprobanteTarjeta.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comprobantetarjetaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ComprobanteTarjetaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comprobantetarjetaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarComprobanteTarjetaActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comprobantetarjetaLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosComprobanteTarjeta.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comprobantetarjeta =(ComprobanteTarjeta) this.comprobantetarjetaLogic.getComprobanteTarjetas().toArray()[this.jTableDatosComprobanteTarjeta.convertRowIndexToModel(intSelectedRow)];
				this.comprobantetarjeta.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.comprobantetarjeta =(ComprobanteTarjeta) this.comprobantetarjetas.toArray()[this.jTableDatosComprobanteTarjeta.convertRowIndexToModel(intSelectedRow)];
				this.comprobantetarjeta.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.comprobantetarjeta)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.comprobantetarjetaSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((ComprobanteTarjetaModel) this.jTableDatosComprobanteTarjeta.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoComprobanteTarjeta=true;
				this.inicializarActualizarBindingTablaComprobanteTarjeta(false);
				this.isEsNuevoComprobanteTarjeta=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesComprobanteTarjeta(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualComprobanteTarjeta(false);
				
				this.habilitarDeshabilitarControlesComprobanteTarjeta(false);
				
				
				
				if(ComprobanteTarjetaJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleComprobanteTarjeta();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comprobantetarjetaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comprobantetarjetaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ComprobanteTarjetaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comprobantetarjetaLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarComprobanteTarjetaActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosComprobanteTarjeta.getRowCount()>=1) {
				jTableDatosComprobanteTarjeta.removeRowSelectionInterval(0, jTableDatosComprobanteTarjeta.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesComprobanteTarjeta(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaComprobanteTarjeta(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesComprobanteTarjeta(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualComprobanteTarjeta(false) ;
			
			this.isEsNuevoComprobanteTarjeta=false;
			
			if(ComprobanteTarjetaJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleComprobanteTarjeta();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComprobanteTarjetaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosComprobanteTarjetaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comprobantetarjetaLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingComprobanteTarjeta(false);
				
				//SI ES MANUAL
				if(ComprobanteTarjetaJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualComprobanteTarjeta();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comprobantetarjetaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comprobantetarjetaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ComprobanteTarjetaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comprobantetarjetaLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosComprobanteTarjetaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoComprobanteTarjeta--;			
			//ComprobanteTarjeta comprobantetarjetaAux= new ComprobanteTarjeta();			
			//comprobantetarjetaAux.setId(this.iIdNuevoComprobanteTarjeta);
			
			if(this.jInternalFrameDetalleFormComprobanteTarjeta==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaComprobanteTarjeta();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysComprobanteTarjeta(this.comprobantetarjeta);
			
			this.comprobantetarjeta.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.comprobantetarjetaLogic.getComprobanteTarjetas().add(this.comprobantetarjetaAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.comprobantetarjetas.add(this.comprobantetarjetaAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaComprobanteTarjeta(false);
			
			this.jTableDatosComprobanteTarjeta.setRowSelectionInterval(this.getIndiceNuevoComprobanteTarjeta(), this.getIndiceNuevoComprobanteTarjeta());
			
			int iLastRow =  this.jTableDatosComprobanteTarjeta.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosComprobanteTarjeta.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosComprobanteTarjeta.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaComprobanteTarjeta(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,ComprobanteTarjetaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionComprobanteTarjetaActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comprobantetarjetaLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingComprobanteTarjeta(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingComprobanteTarjeta(false);
			
			//SI ES MANUAL
			if(ComprobanteTarjetaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualComprobanteTarjeta();
			}
			
			//this.abrirFrameTreeComprobanteTarjeta();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comprobantetarjetaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comprobantetarjetaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ComprobanteTarjetaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comprobantetarjetaLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionComprobanteTarjetaActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComprobanteTarjetaConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionComprobanteTarjetaActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionComprobanteTarjeta.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionComprobanteTarjeta.setFileImportacion(this.jInternalFrameImportacionComprobanteTarjeta.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionComprobanteTarjeta.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionComprobanteTarjeta.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionComprobanteTarjeta.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionComprobanteTarjeta.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComprobanteTarjetaConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoComprobanteTarjetaActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<ComprobanteTarjeta> comprobantetarjetasSeleccionados=new ArrayList<ComprobanteTarjeta>();		

		comprobantetarjetasSeleccionados=this.getComprobanteTarjetasSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoComprobanteTarjeta.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoComprobanteTarjeta.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("ComprobanteTarjetaBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"ComprobanteTarjetaBaseDesign.jrxml";
			
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
			
			this.generarReporteComprobanteTarjetas("Todos",comprobantetarjetasSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.comprobantetarjetaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Comprobante Tarjeta",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComprobanteTarjetaConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoComprobanteTarjeta.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoComprobanteTarjeta.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case ComprobanteTarjetaConstantesFunciones.LABEL_IDCLIENTE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Cliente_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Cliente_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Cliente_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Cliente_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ComprobanteTarjetaConstantesFunciones.LABEL_IDCAJA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Caja_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Caja_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Caja_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Caja_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ComprobanteTarjetaConstantesFunciones.LABEL_NOMBRECAJA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreCaja_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreCaja_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreCaja_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreCaja_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ComprobanteTarjetaConstantesFunciones.LABEL_SECUENCIAL:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_cuencial_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_cuencial_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_cuencial_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_cuencial_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ComprobanteTarjetaConstantesFunciones.LABEL_FECHA:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_cha_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_cha_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_cha_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_cha_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ComprobanteTarjetaConstantesFunciones.LABEL_CODIGOCLIENTE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digoCliente_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digoCliente_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digoCliente_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digoCliente_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ComprobanteTarjetaConstantesFunciones.LABEL_NOMBRECLIENTE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreCliente_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreCliente_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreCliente_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreCliente_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ComprobanteTarjetaConstantesFunciones.LABEL_SUBTOTAL:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_btotal_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_btotal_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_btotal_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_btotal_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ComprobanteTarjetaConstantesFunciones.LABEL_IVA:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_a_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_a_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_a_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_a_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ComprobanteTarjetaConstantesFunciones.LABEL_DESCUENTO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_scuento_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_scuento_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_scuento_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_scuento_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ComprobanteTarjetaConstantesFunciones.LABEL_FINANCIAMIENTO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_nanciamiento_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_nanciamiento_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_nanciamiento_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_nanciamiento_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ComprobanteTarjetaConstantesFunciones.LABEL_FLETE:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_ete_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_ete_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_ete_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_ete_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ComprobanteTarjetaConstantesFunciones.LABEL_ICE:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_e_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_e_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_e_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_e_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ComprobanteTarjetaConstantesFunciones.LABEL_TOTAL:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_tal_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_tal_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_tal_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_tal_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ComprobanteTarjetaConstantesFunciones.LABEL_VALOR:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_lor_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_lor_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_lor_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_lor_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ComprobanteTarjetaConstantesFunciones.LABEL_FECHAFORMAPAGO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_chaFormaPago_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_chaFormaPago_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_chaFormaPago_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_chaFormaPago_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ComprobanteTarjetaConstantesFunciones.LABEL_NUMERO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mero_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mero_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mero_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mero_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ComprobanteTarjetaConstantesFunciones.LABEL_TARJETAHABIENTE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_rjetaHabiente_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_rjetaHabiente_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_rjetaHabiente_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_rjetaHabiente_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ComprobanteTarjetaConstantesFunciones.LABEL_AUTORIZACION:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_torizacion_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_torizacion_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_torizacion_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_torizacion_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ComprobanteTarjetaConstantesFunciones.LABEL_VOUCHER:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_ucher_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_ucher_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_ucher_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_ucher_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ComprobanteTarjetaConstantesFunciones.LABEL_LOTE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_te_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_te_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_te_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_te_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoComprobanteTarjeta.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoComprobanteTarjeta.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoComprobanteTarjeta.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case ComprobanteTarjetaConstantesFunciones.LABEL_IDCLIENTE:
					sNombreCampoCategoria="id_cliente";
					break;

				case ComprobanteTarjetaConstantesFunciones.LABEL_IDCAJA:
					sNombreCampoCategoria="id_caja";
					break;

				case ComprobanteTarjetaConstantesFunciones.LABEL_NOMBRECAJA:
					sNombreCampoCategoria="nombre_caja";
					break;

				case ComprobanteTarjetaConstantesFunciones.LABEL_SECUENCIAL:
					sNombreCampoCategoria="secuencial";
					break;

				case ComprobanteTarjetaConstantesFunciones.LABEL_FECHA:
					sNombreCampoCategoria="fecha";
					break;

				case ComprobanteTarjetaConstantesFunciones.LABEL_CODIGOCLIENTE:
					sNombreCampoCategoria="codigo_cliente";
					break;

				case ComprobanteTarjetaConstantesFunciones.LABEL_NOMBRECLIENTE:
					sNombreCampoCategoria="nombre_cliente";
					break;

				case ComprobanteTarjetaConstantesFunciones.LABEL_SUBTOTAL:
					sNombreCampoCategoria="subtotal";
					break;

				case ComprobanteTarjetaConstantesFunciones.LABEL_IVA:
					sNombreCampoCategoria="iva";
					break;

				case ComprobanteTarjetaConstantesFunciones.LABEL_DESCUENTO:
					sNombreCampoCategoria="descuento";
					break;

				case ComprobanteTarjetaConstantesFunciones.LABEL_FINANCIAMIENTO:
					sNombreCampoCategoria="financiamiento";
					break;

				case ComprobanteTarjetaConstantesFunciones.LABEL_FLETE:
					sNombreCampoCategoria="flete";
					break;

				case ComprobanteTarjetaConstantesFunciones.LABEL_ICE:
					sNombreCampoCategoria="ice";
					break;

				case ComprobanteTarjetaConstantesFunciones.LABEL_TOTAL:
					sNombreCampoCategoria="total";
					break;

				case ComprobanteTarjetaConstantesFunciones.LABEL_VALOR:
					sNombreCampoCategoria="valor";
					break;

				case ComprobanteTarjetaConstantesFunciones.LABEL_FECHAFORMAPAGO:
					sNombreCampoCategoria="fecha_forma_pago";
					break;

				case ComprobanteTarjetaConstantesFunciones.LABEL_NUMERO:
					sNombreCampoCategoria="numero";
					break;

				case ComprobanteTarjetaConstantesFunciones.LABEL_TARJETAHABIENTE:
					sNombreCampoCategoria="tarjeta_habiente";
					break;

				case ComprobanteTarjetaConstantesFunciones.LABEL_AUTORIZACION:
					sNombreCampoCategoria="autorizacion";
					break;

				case ComprobanteTarjetaConstantesFunciones.LABEL_VOUCHER:
					sNombreCampoCategoria="voucher";
					break;

				case ComprobanteTarjetaConstantesFunciones.LABEL_LOTE:
					sNombreCampoCategoria="lote";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoComprobanteTarjeta.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case ComprobanteTarjetaConstantesFunciones.LABEL_IDCLIENTE:
					sNombreCampoCategoriaValor="id_cliente";
					break;

				case ComprobanteTarjetaConstantesFunciones.LABEL_IDCAJA:
					sNombreCampoCategoriaValor="id_caja";
					break;

				case ComprobanteTarjetaConstantesFunciones.LABEL_NOMBRECAJA:
					sNombreCampoCategoriaValor="nombre_caja";
					break;

				case ComprobanteTarjetaConstantesFunciones.LABEL_SECUENCIAL:
					sNombreCampoCategoriaValor="secuencial";
					break;

				case ComprobanteTarjetaConstantesFunciones.LABEL_FECHA:
					sNombreCampoCategoriaValor="fecha";
					break;

				case ComprobanteTarjetaConstantesFunciones.LABEL_CODIGOCLIENTE:
					sNombreCampoCategoriaValor="codigo_cliente";
					break;

				case ComprobanteTarjetaConstantesFunciones.LABEL_NOMBRECLIENTE:
					sNombreCampoCategoriaValor="nombre_cliente";
					break;

				case ComprobanteTarjetaConstantesFunciones.LABEL_SUBTOTAL:
					sNombreCampoCategoriaValor="subtotal";
					break;

				case ComprobanteTarjetaConstantesFunciones.LABEL_IVA:
					sNombreCampoCategoriaValor="iva";
					break;

				case ComprobanteTarjetaConstantesFunciones.LABEL_DESCUENTO:
					sNombreCampoCategoriaValor="descuento";
					break;

				case ComprobanteTarjetaConstantesFunciones.LABEL_FINANCIAMIENTO:
					sNombreCampoCategoriaValor="financiamiento";
					break;

				case ComprobanteTarjetaConstantesFunciones.LABEL_FLETE:
					sNombreCampoCategoriaValor="flete";
					break;

				case ComprobanteTarjetaConstantesFunciones.LABEL_ICE:
					sNombreCampoCategoriaValor="ice";
					break;

				case ComprobanteTarjetaConstantesFunciones.LABEL_TOTAL:
					sNombreCampoCategoriaValor="total";
					break;

				case ComprobanteTarjetaConstantesFunciones.LABEL_VALOR:
					sNombreCampoCategoriaValor="valor";
					break;

				case ComprobanteTarjetaConstantesFunciones.LABEL_FECHAFORMAPAGO:
					sNombreCampoCategoriaValor="fecha_forma_pago";
					break;

				case ComprobanteTarjetaConstantesFunciones.LABEL_NUMERO:
					sNombreCampoCategoriaValor="numero";
					break;

				case ComprobanteTarjetaConstantesFunciones.LABEL_TARJETAHABIENTE:
					sNombreCampoCategoriaValor="tarjeta_habiente";
					break;

				case ComprobanteTarjetaConstantesFunciones.LABEL_AUTORIZACION:
					sNombreCampoCategoriaValor="autorizacion";
					break;

				case ComprobanteTarjetaConstantesFunciones.LABEL_VOUCHER:
					sNombreCampoCategoriaValor="voucher";
					break;

				case ComprobanteTarjetaConstantesFunciones.LABEL_LOTE:
					sNombreCampoCategoriaValor="lote";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoComprobanteTarjeta.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoComprobanteTarjeta.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case ComprobanteTarjetaConstantesFunciones.LABEL_IDCLIENTE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Cliente",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_cliente");
					break;

				case ComprobanteTarjetaConstantesFunciones.LABEL_IDCAJA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Caja",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_caja");
					break;

				case ComprobanteTarjetaConstantesFunciones.LABEL_NOMBRECAJA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Caja",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_caja");
					break;

				case ComprobanteTarjetaConstantesFunciones.LABEL_SECUENCIAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Secuencial",sNombreCampoCategoria,sNombreCampoCategoriaValor,"secuencial");
					break;

				case ComprobanteTarjetaConstantesFunciones.LABEL_FECHA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Fecha",sNombreCampoCategoria,sNombreCampoCategoriaValor,"fecha");
					break;

				case ComprobanteTarjetaConstantesFunciones.LABEL_CODIGOCLIENTE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo Cliente",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo_cliente");
					break;

				case ComprobanteTarjetaConstantesFunciones.LABEL_NOMBRECLIENTE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Cliente",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_cliente");
					break;

				case ComprobanteTarjetaConstantesFunciones.LABEL_SUBTOTAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Subtotal",sNombreCampoCategoria,sNombreCampoCategoriaValor,"subtotal");
					break;

				case ComprobanteTarjetaConstantesFunciones.LABEL_IVA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Iva",sNombreCampoCategoria,sNombreCampoCategoriaValor,"iva");
					break;

				case ComprobanteTarjetaConstantesFunciones.LABEL_DESCUENTO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Descuento",sNombreCampoCategoria,sNombreCampoCategoriaValor,"descuento");
					break;

				case ComprobanteTarjetaConstantesFunciones.LABEL_FINANCIAMIENTO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Financiamiento",sNombreCampoCategoria,sNombreCampoCategoriaValor,"financiamiento");
					break;

				case ComprobanteTarjetaConstantesFunciones.LABEL_FLETE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Flete",sNombreCampoCategoria,sNombreCampoCategoriaValor,"flete");
					break;

				case ComprobanteTarjetaConstantesFunciones.LABEL_ICE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Ice",sNombreCampoCategoria,sNombreCampoCategoriaValor,"ice");
					break;

				case ComprobanteTarjetaConstantesFunciones.LABEL_TOTAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Total",sNombreCampoCategoria,sNombreCampoCategoriaValor,"total");
					break;

				case ComprobanteTarjetaConstantesFunciones.LABEL_VALOR:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Valor",sNombreCampoCategoria,sNombreCampoCategoriaValor,"valor");
					break;

				case ComprobanteTarjetaConstantesFunciones.LABEL_FECHAFORMAPAGO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Fecha Forma Pago",sNombreCampoCategoria,sNombreCampoCategoriaValor,"fecha_forma_pago");
					break;

				case ComprobanteTarjetaConstantesFunciones.LABEL_NUMERO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Numero",sNombreCampoCategoria,sNombreCampoCategoriaValor,"numero");
					break;

				case ComprobanteTarjetaConstantesFunciones.LABEL_TARJETAHABIENTE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Tarjeta Habiente",sNombreCampoCategoria,sNombreCampoCategoriaValor,"tarjeta_habiente");
					break;

				case ComprobanteTarjetaConstantesFunciones.LABEL_AUTORIZACION:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Autorizacion",sNombreCampoCategoria,sNombreCampoCategoriaValor,"autorizacion");
					break;

				case ComprobanteTarjetaConstantesFunciones.LABEL_VOUCHER:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Voucher",sNombreCampoCategoria,sNombreCampoCategoriaValor,"voucher");
					break;

				case ComprobanteTarjetaConstantesFunciones.LABEL_LOTE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Lote",sNombreCampoCategoria,sNombreCampoCategoriaValor,"lote");
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
	
	public void jButtonGenerarExcelReporteDinamicoComprobanteTarjetaActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<ComprobanteTarjeta> comprobantetarjetasSeleccionados=new ArrayList<ComprobanteTarjeta>();		
		
		comprobantetarjetasSeleccionados=this.getComprobanteTarjetasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"comprobantetarjeta";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("ComprobanteTarjetas");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoComprobanteTarjeta.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoComprobanteTarjeta.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case ComprobanteTarjetaConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ComprobanteTarjetaConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(ComprobanteTarjeta comprobantetarjeta:comprobantetarjetasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(comprobantetarjeta.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ComprobanteTarjetaConstantesFunciones.LABEL_IDSUCURSAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ComprobanteTarjetaConstantesFunciones.LABEL_IDSUCURSAL);
					iRow++;

					for(ComprobanteTarjeta comprobantetarjeta:comprobantetarjetasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(comprobantetarjeta.getsucursal_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ComprobanteTarjetaConstantesFunciones.LABEL_IDCLIENTE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ComprobanteTarjetaConstantesFunciones.LABEL_IDCLIENTE);
					iRow++;

					for(ComprobanteTarjeta comprobantetarjeta:comprobantetarjetasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(comprobantetarjeta.getcliente_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ComprobanteTarjetaConstantesFunciones.LABEL_IDCAJA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ComprobanteTarjetaConstantesFunciones.LABEL_IDCAJA);
					iRow++;

					for(ComprobanteTarjeta comprobantetarjeta:comprobantetarjetasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(comprobantetarjeta.getcaja_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ComprobanteTarjetaConstantesFunciones.LABEL_FECHAINICIO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ComprobanteTarjetaConstantesFunciones.LABEL_FECHAINICIO);
					iRow++;

					for(ComprobanteTarjeta comprobantetarjeta:comprobantetarjetasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(comprobantetarjeta.getfecha_inicio());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ComprobanteTarjetaConstantesFunciones.LABEL_FECHAFIN:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ComprobanteTarjetaConstantesFunciones.LABEL_FECHAFIN);
					iRow++;

					for(ComprobanteTarjeta comprobantetarjeta:comprobantetarjetasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(comprobantetarjeta.getfecha_fin());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ComprobanteTarjetaConstantesFunciones.LABEL_NOMBRECAJA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ComprobanteTarjetaConstantesFunciones.LABEL_NOMBRECAJA);
					iRow++;

					for(ComprobanteTarjeta comprobantetarjeta:comprobantetarjetasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(comprobantetarjeta.getnombre_caja());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ComprobanteTarjetaConstantesFunciones.LABEL_SECUENCIAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ComprobanteTarjetaConstantesFunciones.LABEL_SECUENCIAL);
					iRow++;

					for(ComprobanteTarjeta comprobantetarjeta:comprobantetarjetasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(comprobantetarjeta.getsecuencial());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ComprobanteTarjetaConstantesFunciones.LABEL_FECHA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ComprobanteTarjetaConstantesFunciones.LABEL_FECHA);
					iRow++;

					for(ComprobanteTarjeta comprobantetarjeta:comprobantetarjetasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(comprobantetarjeta.getfecha());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ComprobanteTarjetaConstantesFunciones.LABEL_CODIGOCLIENTE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ComprobanteTarjetaConstantesFunciones.LABEL_CODIGOCLIENTE);
					iRow++;

					for(ComprobanteTarjeta comprobantetarjeta:comprobantetarjetasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(comprobantetarjeta.getcodigo_cliente());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ComprobanteTarjetaConstantesFunciones.LABEL_NOMBRECLIENTE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ComprobanteTarjetaConstantesFunciones.LABEL_NOMBRECLIENTE);
					iRow++;

					for(ComprobanteTarjeta comprobantetarjeta:comprobantetarjetasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(comprobantetarjeta.getnombre_cliente());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ComprobanteTarjetaConstantesFunciones.LABEL_SUBTOTAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ComprobanteTarjetaConstantesFunciones.LABEL_SUBTOTAL);
					iRow++;

					for(ComprobanteTarjeta comprobantetarjeta:comprobantetarjetasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(comprobantetarjeta.getsubtotal());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ComprobanteTarjetaConstantesFunciones.LABEL_IVA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ComprobanteTarjetaConstantesFunciones.LABEL_IVA);
					iRow++;

					for(ComprobanteTarjeta comprobantetarjeta:comprobantetarjetasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(comprobantetarjeta.getiva());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ComprobanteTarjetaConstantesFunciones.LABEL_DESCUENTO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ComprobanteTarjetaConstantesFunciones.LABEL_DESCUENTO);
					iRow++;

					for(ComprobanteTarjeta comprobantetarjeta:comprobantetarjetasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(comprobantetarjeta.getdescuento());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ComprobanteTarjetaConstantesFunciones.LABEL_FINANCIAMIENTO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ComprobanteTarjetaConstantesFunciones.LABEL_FINANCIAMIENTO);
					iRow++;

					for(ComprobanteTarjeta comprobantetarjeta:comprobantetarjetasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(comprobantetarjeta.getfinanciamiento());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ComprobanteTarjetaConstantesFunciones.LABEL_FLETE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ComprobanteTarjetaConstantesFunciones.LABEL_FLETE);
					iRow++;

					for(ComprobanteTarjeta comprobantetarjeta:comprobantetarjetasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(comprobantetarjeta.getflete());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ComprobanteTarjetaConstantesFunciones.LABEL_ICE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ComprobanteTarjetaConstantesFunciones.LABEL_ICE);
					iRow++;

					for(ComprobanteTarjeta comprobantetarjeta:comprobantetarjetasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(comprobantetarjeta.getice());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ComprobanteTarjetaConstantesFunciones.LABEL_TOTAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ComprobanteTarjetaConstantesFunciones.LABEL_TOTAL);
					iRow++;

					for(ComprobanteTarjeta comprobantetarjeta:comprobantetarjetasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(comprobantetarjeta.gettotal());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ComprobanteTarjetaConstantesFunciones.LABEL_VALOR:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ComprobanteTarjetaConstantesFunciones.LABEL_VALOR);
					iRow++;

					for(ComprobanteTarjeta comprobantetarjeta:comprobantetarjetasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(comprobantetarjeta.getvalor());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ComprobanteTarjetaConstantesFunciones.LABEL_FECHAFORMAPAGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ComprobanteTarjetaConstantesFunciones.LABEL_FECHAFORMAPAGO);
					iRow++;

					for(ComprobanteTarjeta comprobantetarjeta:comprobantetarjetasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(comprobantetarjeta.getfecha_forma_pago());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ComprobanteTarjetaConstantesFunciones.LABEL_NUMERO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ComprobanteTarjetaConstantesFunciones.LABEL_NUMERO);
					iRow++;

					for(ComprobanteTarjeta comprobantetarjeta:comprobantetarjetasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(comprobantetarjeta.getnumero());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ComprobanteTarjetaConstantesFunciones.LABEL_TARJETAHABIENTE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ComprobanteTarjetaConstantesFunciones.LABEL_TARJETAHABIENTE);
					iRow++;

					for(ComprobanteTarjeta comprobantetarjeta:comprobantetarjetasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(comprobantetarjeta.gettarjeta_habiente());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ComprobanteTarjetaConstantesFunciones.LABEL_AUTORIZACION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ComprobanteTarjetaConstantesFunciones.LABEL_AUTORIZACION);
					iRow++;

					for(ComprobanteTarjeta comprobantetarjeta:comprobantetarjetasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(comprobantetarjeta.getautorizacion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ComprobanteTarjetaConstantesFunciones.LABEL_VOUCHER:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ComprobanteTarjetaConstantesFunciones.LABEL_VOUCHER);
					iRow++;

					for(ComprobanteTarjeta comprobantetarjeta:comprobantetarjetasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(comprobantetarjeta.getvoucher());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ComprobanteTarjetaConstantesFunciones.LABEL_LOTE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ComprobanteTarjetaConstantesFunciones.LABEL_LOTE);
					iRow++;

					for(ComprobanteTarjeta comprobantetarjeta:comprobantetarjetasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(comprobantetarjeta.getlote());
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
			//	this.getFilaCabeceraExportarExcelComprobanteTarjeta(row);				
			//	iRow++;
			//}				
			
			//for(ComprobanteTarjeta comprobantetarjetaAux:comprobantetarjetasSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelComprobanteTarjeta(comprobantetarjetaAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.comprobantetarjetaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Comprobante Tarjeta",JOptionPane.INFORMATION_MESSAGE);
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
				this.comprobantetarjetaLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingComprobanteTarjeta(false);
			
			//SI ES MANUAL
			if(ComprobanteTarjetaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualComprobanteTarjeta();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comprobantetarjetaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comprobantetarjetaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comprobantetarjetaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresComprobanteTarjetaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comprobantetarjetaLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingComprobanteTarjeta(false);
			
			//SI ES MANUAL
			if(ComprobanteTarjetaJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualComprobanteTarjeta();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comprobantetarjetaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comprobantetarjetaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ComprobanteTarjetaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comprobantetarjetaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesComprobanteTarjetaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comprobantetarjetaLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingComprobanteTarjeta(false);
			
			//SI ES MANUAL
			if(ComprobanteTarjetaJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualComprobanteTarjeta();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comprobantetarjetaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comprobantetarjetaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ComprobanteTarjetaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comprobantetarjetaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaComprobanteTarjeta() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosComprobanteTarjeta.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosComprobanteTarjeta.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosComprobanteTarjeta.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosComprobanteTarjeta.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosComprobanteTarjeta.setMinimumSize(dimensionMinimum);
		this.jTableDatosComprobanteTarjeta.setMaximumSize(dimensionMaximum);
		this.jTableDatosComprobanteTarjeta.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingComprobanteTarjeta(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingComprobanteTarjeta(esInicializar,true);
	}
	
	public void inicializarActualizarBindingComprobanteTarjeta(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaComprobanteTarjeta(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesComprobanteTarjeta(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.comprobantetarjetaSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasComprobanteTarjeta(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesComprobanteTarjeta(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesComprobanteTarjeta(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !ComprobanteTarjetaJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!ComprobanteTarjetaJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualComprobanteTarjeta() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaComprobanteTarjeta();
		
		this.inicializarActualizarBindingBotonesManualComprobanteTarjeta(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.comprobantetarjetaSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualComprobanteTarjeta();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesComprobanteTarjeta() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualComprobanteTarjeta(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualComprobanteTarjeta(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosComprobanteTarjeta.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosComprobanteTarjeta.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteComprobanteTarjeta.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormComprobanteTarjeta!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormComprobanteTarjeta.jCheckBoxPostAccionNuevoComprobanteTarjeta.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormComprobanteTarjeta.jCheckBoxPostAccionSinCerrarComprobanteTarjeta.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormComprobanteTarjeta.jCheckBoxPostAccionSinMensajeComprobanteTarjeta.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosComprobanteTarjeta.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosComprobanteTarjeta.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteComprobanteTarjeta.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormComprobanteTarjeta!=null) {
				this.jInternalFrameDetalleFormComprobanteTarjeta.jCheckBoxPostAccionNuevoComprobanteTarjeta.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormComprobanteTarjeta.jCheckBoxPostAccionSinCerrarComprobanteTarjeta.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormComprobanteTarjeta.jCheckBoxPostAccionSinMensajeComprobanteTarjeta.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionComprobanteTarjeta.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionComprobanteTarjeta.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormComprobanteTarjeta!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormComprobanteTarjeta.jComboBoxTiposAccionesFormularioComprobanteTarjeta.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesComprobanteTarjeta.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoComprobanteTarjeta!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoComprobanteTarjeta.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesComprobanteTarjeta.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesComprobanteTarjeta.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarComprobanteTarjeta.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesComprobanteTarjeta.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoComprobanteTarjeta!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoComprobanteTarjeta.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesComprobanteTarjeta.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralComprobanteTarjeta.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesComprobanteTarjeta(Boolean esInicializar) throws Exception {
		try	{	
			if(ComprobanteTarjetaJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualComprobanteTarjeta(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesComprobanteTarjeta() throws Exception {
		try	{
			if(ComprobanteTarjetaJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualComprobanteTarjeta();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleComprobanteTarjeta() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormComprobanteTarjeta.jComboBoxTiposAccionesFormularioComprobanteTarjeta.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormComprobanteTarjeta.jComboBoxTiposAccionesFormularioComprobanteTarjeta.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualComprobanteTarjeta() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesComprobanteTarjeta.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesComprobanteTarjeta.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesComprobanteTarjeta.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesComprobanteTarjeta.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesComprobanteTarjeta.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesComprobanteTarjeta.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionComprobanteTarjeta.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionComprobanteTarjeta.addItem(reporte);
			}
			
			
			if(!this.comprobantetarjetaSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionComprobanteTarjeta.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionComprobanteTarjeta.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesComprobanteTarjeta.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesComprobanteTarjeta.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesComprobanteTarjeta.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesComprobanteTarjeta.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormComprobanteTarjeta!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormComprobanteTarjeta.jComboBoxTiposAccionesFormularioComprobanteTarjeta.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormComprobanteTarjeta.jComboBoxTiposAccionesFormularioComprobanteTarjeta.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarComprobanteTarjeta.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarComprobanteTarjeta.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarComprobanteTarjeta.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualComprobanteTarjeta();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualComprobanteTarjeta() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoComprobanteTarjeta!=null) {
				this.jInternalFrameReporteDinamicoComprobanteTarjeta.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoComprobanteTarjeta.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoComprobanteTarjeta!=null) {
				this.jInternalFrameReporteDinamicoComprobanteTarjeta.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoComprobanteTarjeta.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoComprobanteTarjeta!=null) {
				
				if(this.jInternalFrameReporteDinamicoComprobanteTarjeta.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoComprobanteTarjeta.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoComprobanteTarjeta.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoComprobanteTarjeta.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoComprobanteTarjeta.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoComprobanteTarjeta.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
				
				//TIPOS COLUMNAS CATEGORIA DINAMICO
				if(this.jInternalFrameReporteDinamicoComprobanteTarjeta.getjComboBoxColumnaCategoriaGrafico()!=null) {
					this.jInternalFrameReporteDinamicoComprobanteTarjeta.getjComboBoxColumnaCategoriaGrafico().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoria=ComprobanteTarjetaConstantesFunciones.getTiposSeleccionarComprobanteTarjeta(true,true,false,true,true);
						
					for(Reporte reporte:tiposColumnasCategoria) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoComprobanteTarjeta.getjComboBoxColumnaCategoriaGrafico().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS CATEGORIA VALOR DINAMICO
				if(this.jInternalFrameReporteDinamicoComprobanteTarjeta.getjComboBoxColumnaCategoriaValor()!=null) {
					this.jInternalFrameReporteDinamicoComprobanteTarjeta.getjComboBoxColumnaCategoriaValor().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoriaValor=ComprobanteTarjetaConstantesFunciones.getTiposSeleccionarComprobanteTarjeta(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasCategoriaValor) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoComprobanteTarjeta.getjComboBoxColumnaCategoriaValor().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS VALOR
				defaultListModel=new DefaultListModel<Reporte>();
					
				if(this.jInternalFrameReporteDinamicoComprobanteTarjeta.getjListColumnasValoresGrafico()!=null) {
					this.jInternalFrameReporteDinamicoComprobanteTarjeta.getjListColumnasValoresGrafico().removeAll();
						
					ArrayList<Reporte> tiposColumnasValor=ComprobanteTarjetaConstantesFunciones.getTiposSeleccionarComprobanteTarjeta(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasValor) {//this.tiposSeleccionar
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoComprobanteTarjeta.getjListColumnasValoresGrafico().setModel(defaultListModel);									
						
				}
					
				//TIPOS GRAFICOS REPORTES DINAMICOS
				if(this.jInternalFrameReporteDinamicoComprobanteTarjeta.getjComboBoxTiposGraficosReportesDinamico()!=null) {
					this.jInternalFrameReporteDinamicoComprobanteTarjeta.getjComboBoxTiposGraficosReportesDinamico().removeAllItems();
						
					for(Reporte reporte:this.tiposGraficosReportes) {
						this.jInternalFrameReporteDinamicoComprobanteTarjeta.getjComboBoxTiposGraficosReportesDinamico().addItem(reporte);
					}
					
				}
			
			
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualComprobanteTarjeta()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		this.fecha_inicioBusquedaComprobanteTarjeta=new Date(this.jDateChooserfecha_inicioBusquedaComprobanteTarjetaComprobanteTarjeta.getDate().getTime());
		this.fecha_finBusquedaComprobanteTarjeta=new Date(this.jDateChooserfecha_finBusquedaComprobanteTarjetaComprobanteTarjeta.getDate().getTime());
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasComprobanteTarjeta(Boolean esInicializar) throws Exception {				
		if(ComprobanteTarjetaJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualComprobanteTarjeta();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaComprobanteTarjeta() throws Exception {
		this.inicializarActualizarBindingTablaComprobanteTarjeta(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByComprobanteTarjeta() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByComprobanteTarjeta.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByComprobanteTarjeta.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByComprobanteTarjeta.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new ComprobanteTarjetaPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByComprobanteTarjeta.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByComprobanteTarjeta.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new ComprobanteTarjetaPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosComprobanteTarjetaOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosComprobanteTarjetaOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new ComprobanteTarjetaPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByComprobanteTarjeta.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByComprobanteTarjeta.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new ComprobanteTarjetaPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByComprobanteTarjeta.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaComprobanteTarjeta(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=comprobantetarjetaLogic.getComprobanteTarjetas().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=comprobantetarjetas.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(ComprobanteTarjetaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosComprobanteTarjeta.setModel(new ComprobanteTarjetaModel(this.comprobantetarjetaLogic.getComprobanteTarjetas(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosComprobanteTarjeta.setModel(new ComprobanteTarjetaModel(this.comprobantetarjetas,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByComprobanteTarjeta!=null && this.jInternalFrameOrderByComprobanteTarjeta.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByComprobanteTarjeta();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosComprobanteTarjeta.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosComprobanteTarjeta,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new ComprobanteTarjetaPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+ComprobanteTarjetaConstantesFunciones.SCLASSWEBTITULO,comprobantetarjetaConstantesFunciones.resaltarSeleccionarComprobanteTarjeta,iSizeTabla,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+ComprobanteTarjetaConstantesFunciones.SCLASSWEBTITULO,comprobantetarjetaConstantesFunciones.resaltarSeleccionarComprobanteTarjeta,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosComprobanteTarjeta.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosComprobanteTarjeta,ComprobanteTarjetaConstantesFunciones.LABEL_ID));

		if(this.comprobantetarjetaConstantesFunciones.mostraridComprobanteTarjeta && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ComprobanteTarjetaConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.comprobantetarjetaConstantesFunciones.resaltaridComprobanteTarjeta,this.comprobantetarjetaConstantesFunciones.activaridComprobanteTarjeta,iSizeTabla,this,true,"idComprobanteTarjeta","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.comprobantetarjetaConstantesFunciones.resaltaridComprobanteTarjeta,this.comprobantetarjetaConstantesFunciones.activaridComprobanteTarjeta,this,true,"idComprobanteTarjeta","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosComprobanteTarjeta.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosComprobanteTarjeta,ComprobanteTarjetaConstantesFunciones.LABEL_NOMBRECAJA));

		if(this.comprobantetarjetaConstantesFunciones.mostrarnombre_cajaComprobanteTarjeta && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ComprobanteTarjetaConstantesFunciones.LABEL_NOMBRECAJA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.comprobantetarjetaConstantesFunciones.resaltarnombre_cajaComprobanteTarjeta,this.comprobantetarjetaConstantesFunciones.activarnombre_cajaComprobanteTarjeta,iSizeTabla,this,true,"nombre_cajaComprobanteTarjeta","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.comprobantetarjetaConstantesFunciones.resaltarnombre_cajaComprobanteTarjeta,this.comprobantetarjetaConstantesFunciones.activarnombre_cajaComprobanteTarjeta,this,true,"nombre_cajaComprobanteTarjeta","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ComprobanteTarjetaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosComprobanteTarjeta.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosComprobanteTarjeta,ComprobanteTarjetaConstantesFunciones.LABEL_SECUENCIAL));

		if(this.comprobantetarjetaConstantesFunciones.mostrarsecuencialComprobanteTarjeta && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ComprobanteTarjetaConstantesFunciones.LABEL_SECUENCIAL,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.comprobantetarjetaConstantesFunciones.resaltarsecuencialComprobanteTarjeta,this.comprobantetarjetaConstantesFunciones.activarsecuencialComprobanteTarjeta,iSizeTabla,this,true,"secuencialComprobanteTarjeta","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.comprobantetarjetaConstantesFunciones.resaltarsecuencialComprobanteTarjeta,this.comprobantetarjetaConstantesFunciones.activarsecuencialComprobanteTarjeta,this,true,"secuencialComprobanteTarjeta","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ComprobanteTarjetaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosComprobanteTarjeta.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosComprobanteTarjeta,ComprobanteTarjetaConstantesFunciones.LABEL_FECHA));

		if(this.comprobantetarjetaConstantesFunciones.mostrarfechaComprobanteTarjeta && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ComprobanteTarjetaConstantesFunciones.LABEL_FECHA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new DateRenderer(this.comprobantetarjetaConstantesFunciones.resaltarfechaComprobanteTarjeta,this.comprobantetarjetaConstantesFunciones.activarfechaComprobanteTarjeta,iSizeTabla,this,true,"fechaComprobanteTarjeta","BASICO"));
			tableColumn.setCellEditor(new DateEditorRenderer(this.comprobantetarjetaConstantesFunciones.resaltarfechaComprobanteTarjeta,this.comprobantetarjetaConstantesFunciones.activarfechaComprobanteTarjeta,this,true,"fechaComprobanteTarjeta","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30);
			//tableColumn.addPropertyChangeListener(new ComprobanteTarjetaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosComprobanteTarjeta.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosComprobanteTarjeta,ComprobanteTarjetaConstantesFunciones.LABEL_CODIGOCLIENTE));

		if(this.comprobantetarjetaConstantesFunciones.mostrarcodigo_clienteComprobanteTarjeta && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ComprobanteTarjetaConstantesFunciones.LABEL_CODIGOCLIENTE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.comprobantetarjetaConstantesFunciones.resaltarcodigo_clienteComprobanteTarjeta,this.comprobantetarjetaConstantesFunciones.activarcodigo_clienteComprobanteTarjeta,iSizeTabla,this,true,"codigo_clienteComprobanteTarjeta","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.comprobantetarjetaConstantesFunciones.resaltarcodigo_clienteComprobanteTarjeta,this.comprobantetarjetaConstantesFunciones.activarcodigo_clienteComprobanteTarjeta,this,true,"codigo_clienteComprobanteTarjeta","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ComprobanteTarjetaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosComprobanteTarjeta.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosComprobanteTarjeta,ComprobanteTarjetaConstantesFunciones.LABEL_NOMBRECLIENTE));

		if(this.comprobantetarjetaConstantesFunciones.mostrarnombre_clienteComprobanteTarjeta && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ComprobanteTarjetaConstantesFunciones.LABEL_NOMBRECLIENTE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.comprobantetarjetaConstantesFunciones.resaltarnombre_clienteComprobanteTarjeta,this.comprobantetarjetaConstantesFunciones.activarnombre_clienteComprobanteTarjeta,iSizeTabla,this,true,"nombre_clienteComprobanteTarjeta","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.comprobantetarjetaConstantesFunciones.resaltarnombre_clienteComprobanteTarjeta,this.comprobantetarjetaConstantesFunciones.activarnombre_clienteComprobanteTarjeta,this,true,"nombre_clienteComprobanteTarjeta","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ComprobanteTarjetaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosComprobanteTarjeta.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosComprobanteTarjeta,ComprobanteTarjetaConstantesFunciones.LABEL_SUBTOTAL));

		if(this.comprobantetarjetaConstantesFunciones.mostrarsubtotalComprobanteTarjeta && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ComprobanteTarjetaConstantesFunciones.LABEL_SUBTOTAL,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.comprobantetarjetaConstantesFunciones.resaltarsubtotalComprobanteTarjeta,this.comprobantetarjetaConstantesFunciones.activarsubtotalComprobanteTarjeta,iSizeTabla,this,true,"subtotalComprobanteTarjeta","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.comprobantetarjetaConstantesFunciones.resaltarsubtotalComprobanteTarjeta,this.comprobantetarjetaConstantesFunciones.activarsubtotalComprobanteTarjeta,this,true,"subtotalComprobanteTarjeta","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new ComprobanteTarjetaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosComprobanteTarjeta.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosComprobanteTarjeta,ComprobanteTarjetaConstantesFunciones.LABEL_IVA));

		if(this.comprobantetarjetaConstantesFunciones.mostrarivaComprobanteTarjeta && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ComprobanteTarjetaConstantesFunciones.LABEL_IVA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.comprobantetarjetaConstantesFunciones.resaltarivaComprobanteTarjeta,this.comprobantetarjetaConstantesFunciones.activarivaComprobanteTarjeta,iSizeTabla,this,true,"ivaComprobanteTarjeta","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.comprobantetarjetaConstantesFunciones.resaltarivaComprobanteTarjeta,this.comprobantetarjetaConstantesFunciones.activarivaComprobanteTarjeta,this,true,"ivaComprobanteTarjeta","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new ComprobanteTarjetaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosComprobanteTarjeta.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosComprobanteTarjeta,ComprobanteTarjetaConstantesFunciones.LABEL_DESCUENTO));

		if(this.comprobantetarjetaConstantesFunciones.mostrardescuentoComprobanteTarjeta && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ComprobanteTarjetaConstantesFunciones.LABEL_DESCUENTO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.comprobantetarjetaConstantesFunciones.resaltardescuentoComprobanteTarjeta,this.comprobantetarjetaConstantesFunciones.activardescuentoComprobanteTarjeta,iSizeTabla,this,true,"descuentoComprobanteTarjeta","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.comprobantetarjetaConstantesFunciones.resaltardescuentoComprobanteTarjeta,this.comprobantetarjetaConstantesFunciones.activardescuentoComprobanteTarjeta,this,true,"descuentoComprobanteTarjeta","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new ComprobanteTarjetaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosComprobanteTarjeta.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosComprobanteTarjeta,ComprobanteTarjetaConstantesFunciones.LABEL_FINANCIAMIENTO));

		if(this.comprobantetarjetaConstantesFunciones.mostrarfinanciamientoComprobanteTarjeta && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ComprobanteTarjetaConstantesFunciones.LABEL_FINANCIAMIENTO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.comprobantetarjetaConstantesFunciones.resaltarfinanciamientoComprobanteTarjeta,this.comprobantetarjetaConstantesFunciones.activarfinanciamientoComprobanteTarjeta,iSizeTabla,this,true,"financiamientoComprobanteTarjeta","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.comprobantetarjetaConstantesFunciones.resaltarfinanciamientoComprobanteTarjeta,this.comprobantetarjetaConstantesFunciones.activarfinanciamientoComprobanteTarjeta,this,true,"financiamientoComprobanteTarjeta","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new ComprobanteTarjetaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosComprobanteTarjeta.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosComprobanteTarjeta,ComprobanteTarjetaConstantesFunciones.LABEL_FLETE));

		if(this.comprobantetarjetaConstantesFunciones.mostrarfleteComprobanteTarjeta && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ComprobanteTarjetaConstantesFunciones.LABEL_FLETE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.comprobantetarjetaConstantesFunciones.resaltarfleteComprobanteTarjeta,this.comprobantetarjetaConstantesFunciones.activarfleteComprobanteTarjeta,iSizeTabla,this,true,"fleteComprobanteTarjeta","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.comprobantetarjetaConstantesFunciones.resaltarfleteComprobanteTarjeta,this.comprobantetarjetaConstantesFunciones.activarfleteComprobanteTarjeta,this,true,"fleteComprobanteTarjeta","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new ComprobanteTarjetaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosComprobanteTarjeta.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosComprobanteTarjeta,ComprobanteTarjetaConstantesFunciones.LABEL_ICE));

		if(this.comprobantetarjetaConstantesFunciones.mostrariceComprobanteTarjeta && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ComprobanteTarjetaConstantesFunciones.LABEL_ICE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.comprobantetarjetaConstantesFunciones.resaltariceComprobanteTarjeta,this.comprobantetarjetaConstantesFunciones.activariceComprobanteTarjeta,iSizeTabla,this,true,"iceComprobanteTarjeta","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.comprobantetarjetaConstantesFunciones.resaltariceComprobanteTarjeta,this.comprobantetarjetaConstantesFunciones.activariceComprobanteTarjeta,this,true,"iceComprobanteTarjeta","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new ComprobanteTarjetaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosComprobanteTarjeta.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosComprobanteTarjeta,ComprobanteTarjetaConstantesFunciones.LABEL_TOTAL));

		if(this.comprobantetarjetaConstantesFunciones.mostrartotalComprobanteTarjeta && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ComprobanteTarjetaConstantesFunciones.LABEL_TOTAL,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.comprobantetarjetaConstantesFunciones.resaltartotalComprobanteTarjeta,this.comprobantetarjetaConstantesFunciones.activartotalComprobanteTarjeta,iSizeTabla,this,true,"totalComprobanteTarjeta","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.comprobantetarjetaConstantesFunciones.resaltartotalComprobanteTarjeta,this.comprobantetarjetaConstantesFunciones.activartotalComprobanteTarjeta,this,true,"totalComprobanteTarjeta","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new ComprobanteTarjetaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosComprobanteTarjeta.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosComprobanteTarjeta,ComprobanteTarjetaConstantesFunciones.LABEL_VALOR));

		if(this.comprobantetarjetaConstantesFunciones.mostrarvalorComprobanteTarjeta && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ComprobanteTarjetaConstantesFunciones.LABEL_VALOR,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.comprobantetarjetaConstantesFunciones.resaltarvalorComprobanteTarjeta,this.comprobantetarjetaConstantesFunciones.activarvalorComprobanteTarjeta,iSizeTabla,this,true,"valorComprobanteTarjeta","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.comprobantetarjetaConstantesFunciones.resaltarvalorComprobanteTarjeta,this.comprobantetarjetaConstantesFunciones.activarvalorComprobanteTarjeta,this,true,"valorComprobanteTarjeta","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new ComprobanteTarjetaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosComprobanteTarjeta.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosComprobanteTarjeta,ComprobanteTarjetaConstantesFunciones.LABEL_FECHAFORMAPAGO));

		if(this.comprobantetarjetaConstantesFunciones.mostrarfecha_forma_pagoComprobanteTarjeta && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ComprobanteTarjetaConstantesFunciones.LABEL_FECHAFORMAPAGO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new DateRenderer(this.comprobantetarjetaConstantesFunciones.resaltarfecha_forma_pagoComprobanteTarjeta,this.comprobantetarjetaConstantesFunciones.activarfecha_forma_pagoComprobanteTarjeta,iSizeTabla,this,true,"fecha_forma_pagoComprobanteTarjeta","BASICO"));
			tableColumn.setCellEditor(new DateEditorRenderer(this.comprobantetarjetaConstantesFunciones.resaltarfecha_forma_pagoComprobanteTarjeta,this.comprobantetarjetaConstantesFunciones.activarfecha_forma_pagoComprobanteTarjeta,this,true,"fecha_forma_pagoComprobanteTarjeta","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30);
			//tableColumn.addPropertyChangeListener(new ComprobanteTarjetaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosComprobanteTarjeta.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosComprobanteTarjeta,ComprobanteTarjetaConstantesFunciones.LABEL_NUMERO));

		if(this.comprobantetarjetaConstantesFunciones.mostrarnumeroComprobanteTarjeta && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ComprobanteTarjetaConstantesFunciones.LABEL_NUMERO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.comprobantetarjetaConstantesFunciones.resaltarnumeroComprobanteTarjeta,this.comprobantetarjetaConstantesFunciones.activarnumeroComprobanteTarjeta,iSizeTabla,this,true,"numeroComprobanteTarjeta","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.comprobantetarjetaConstantesFunciones.resaltarnumeroComprobanteTarjeta,this.comprobantetarjetaConstantesFunciones.activarnumeroComprobanteTarjeta,this,true,"numeroComprobanteTarjeta","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ComprobanteTarjetaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosComprobanteTarjeta.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosComprobanteTarjeta,ComprobanteTarjetaConstantesFunciones.LABEL_TARJETAHABIENTE));

		if(this.comprobantetarjetaConstantesFunciones.mostrartarjeta_habienteComprobanteTarjeta && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ComprobanteTarjetaConstantesFunciones.LABEL_TARJETAHABIENTE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.comprobantetarjetaConstantesFunciones.resaltartarjeta_habienteComprobanteTarjeta,this.comprobantetarjetaConstantesFunciones.activartarjeta_habienteComprobanteTarjeta,iSizeTabla,this,true,"tarjeta_habienteComprobanteTarjeta","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.comprobantetarjetaConstantesFunciones.resaltartarjeta_habienteComprobanteTarjeta,this.comprobantetarjetaConstantesFunciones.activartarjeta_habienteComprobanteTarjeta,this,true,"tarjeta_habienteComprobanteTarjeta","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ComprobanteTarjetaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosComprobanteTarjeta.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosComprobanteTarjeta,ComprobanteTarjetaConstantesFunciones.LABEL_AUTORIZACION));

		if(this.comprobantetarjetaConstantesFunciones.mostrarautorizacionComprobanteTarjeta && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ComprobanteTarjetaConstantesFunciones.LABEL_AUTORIZACION,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.comprobantetarjetaConstantesFunciones.resaltarautorizacionComprobanteTarjeta,this.comprobantetarjetaConstantesFunciones.activarautorizacionComprobanteTarjeta,iSizeTabla,this,true,"autorizacionComprobanteTarjeta","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.comprobantetarjetaConstantesFunciones.resaltarautorizacionComprobanteTarjeta,this.comprobantetarjetaConstantesFunciones.activarautorizacionComprobanteTarjeta,this,true,"autorizacionComprobanteTarjeta","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ComprobanteTarjetaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosComprobanteTarjeta.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosComprobanteTarjeta,ComprobanteTarjetaConstantesFunciones.LABEL_VOUCHER));

		if(this.comprobantetarjetaConstantesFunciones.mostrarvoucherComprobanteTarjeta && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ComprobanteTarjetaConstantesFunciones.LABEL_VOUCHER,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.comprobantetarjetaConstantesFunciones.resaltarvoucherComprobanteTarjeta,this.comprobantetarjetaConstantesFunciones.activarvoucherComprobanteTarjeta,iSizeTabla,this,true,"voucherComprobanteTarjeta","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.comprobantetarjetaConstantesFunciones.resaltarvoucherComprobanteTarjeta,this.comprobantetarjetaConstantesFunciones.activarvoucherComprobanteTarjeta,this,true,"voucherComprobanteTarjeta","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ComprobanteTarjetaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosComprobanteTarjeta.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosComprobanteTarjeta,ComprobanteTarjetaConstantesFunciones.LABEL_LOTE));

		if(this.comprobantetarjetaConstantesFunciones.mostrarloteComprobanteTarjeta && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ComprobanteTarjetaConstantesFunciones.LABEL_LOTE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.comprobantetarjetaConstantesFunciones.resaltarloteComprobanteTarjeta,this.comprobantetarjetaConstantesFunciones.activarloteComprobanteTarjeta,iSizeTabla,this,true,"loteComprobanteTarjeta","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.comprobantetarjetaConstantesFunciones.resaltarloteComprobanteTarjeta,this.comprobantetarjetaConstantesFunciones.activarloteComprobanteTarjeta,this,true,"loteComprobanteTarjeta","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ComprobanteTarjetaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.comprobantetarjetaSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.comprobantetarjetaSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.comprobantetarjetaSessionBean.getEsGuardarRelacionado(),iSizeTabla));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosComprobanteTarjeta.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.comprobantetarjetaSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.comprobantetarjetaSessionBean.getEsGuardarRelacionado(),iSizeTabla));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosComprobanteTarjeta.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarComprobanteTarjeta && this.isPermisoGuardarCambiosComprobanteTarjeta) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.comprobantetarjetaSessionBean.getEsGuardarRelacionado(),iSizeTabla));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.comprobantetarjetaSessionBean.getEsGuardarRelacionado(),iSizeTabla));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosComprobanteTarjeta.addColumn(tableColumn);
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
			
			this.jTableDatosComprobanteTarjeta.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarComprobanteTarjeta && this.isPermisoGuardarCambiosComprobanteTarjeta) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarComprobanteTarjeta && this.isPermisoGuardarCambiosComprobanteTarjeta) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosComprobanteTarjeta.moveColumn(this.jTableDatosComprobanteTarjeta.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosComprobanteTarjeta.moveColumn(this.jTableDatosComprobanteTarjeta.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosComprobanteTarjeta.moveColumn(this.jTableDatosComprobanteTarjeta.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosComprobanteTarjeta.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosComprobanteTarjeta.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosComprobanteTarjeta,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!ComprobanteTarjetaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosComprobanteTarjeta.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosComprobanteTarjeta.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!ComprobanteTarjetaJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!ComprobanteTarjetaJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosComprobanteTarjeta.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosComprobanteTarjeta.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosComprobanteTarjeta.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							//iSize=comprobantetarjetaLogic.getComprobanteTarjetas().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=comprobantetarjetas.size()-1;
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
		//this.jTableDatosComprobanteTarjeta.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosComprobanteTarjeta.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosComprobanteTarjeta();
			
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
				
				//this.isEsNuevoComprobanteTarjeta=false;
					
				ComprobanteTarjetaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.comprobantetarjeta,new Object(),this.comprobantetarjetaParameterGeneral,this.comprobantetarjetaReturnGeneral);
			
				if(this.comprobantetarjetaSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormComprobanteTarjeta==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosComprobanteTarjeta.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosComprobanteTarjeta.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantetarjeta =(ComprobanteTarjeta) this.comprobantetarjetaLogic.getComprobanteTarjetas().toArray()[this.jTableDatosComprobanteTarjeta.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.comprobantetarjeta =(ComprobanteTarjeta) this.comprobantetarjetas.toArray()[this.jTableDatosComprobanteTarjeta.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.comprobantetarjeta.getsType().equals("DUPLICADO")
				   || this.comprobantetarjeta.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoComprobanteTarjeta=true;
				
				} else {
					this.isEsNuevoComprobanteTarjeta=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.comprobantetarjetaSessionBean.getEsGuardarRelacionado()) {
					if(this.comprobantetarjeta.getId()>=0 && !this.comprobantetarjeta.getIsNew()) {						
						this.isEsNuevoComprobanteTarjeta=false;
						
					} else {
						this.isEsNuevoComprobanteTarjeta=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoComprobanteTarjeta(esRelaciones);						
				
				this.seleccionarComprobanteTarjeta(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.comprobantetarjeta.getId()<0) {
					this.isEsNuevoComprobanteTarjeta=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarComprobanteTarjeta(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarComprobanteTarjeta(evt,rowIndex);
				}	
				
				if(this.comprobantetarjetaSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion ComprobanteTarjeta: " + this.dDif); 
					}
				}								
				
				ComprobanteTarjetaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.comprobantetarjeta,new Object(),this.comprobantetarjetaParameterGeneral,this.comprobantetarjetaReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarComprobanteTarjeta(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.comprobantetarjeta)) {
					if(this.comprobantetarjeta.getId()>0) {
						this.comprobantetarjeta.setIsDeleted(true);
						
						this.comprobantetarjetasEliminados.add(this.comprobantetarjeta);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.comprobantetarjetaLogic.getComprobanteTarjetas().remove(this.comprobantetarjeta);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.comprobantetarjetas.remove(this.comprobantetarjeta);				
					}
					
					
					((ComprobanteTarjetaModel) this.jTableDatosComprobanteTarjeta.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaComprobanteTarjeta(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,ComprobanteTarjetaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarComprobanteTarjeta(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoComprobanteTarjeta) {
			
			if(this.jInternalFrameDetalleFormComprobanteTarjeta==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosComprobanteTarjeta.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosComprobanteTarjeta.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantetarjeta =(ComprobanteTarjeta) this.comprobantetarjetaLogic.getComprobanteTarjetas().toArray()[this.jTableDatosComprobanteTarjeta.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.comprobantetarjeta =(ComprobanteTarjeta) this.comprobantetarjetas.toArray()[this.jTableDatosComprobanteTarjeta.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(ComprobanteTarjetaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioComprobanteTarjeta(this.comprobantetarjeta);
				}
				
				//ARCHITECTURE
				try {
					

					//Cliente
					if(!this.comprobantetarjetaConstantesFunciones.cargarid_clienteComprobanteTarjeta || this.comprobantetarjetaConstantesFunciones.event_dependid_clienteComprobanteTarjeta) {
						//this.cargarCombosClientesForeignKeyLista(" where id="+this.comprobantetarjeta.getid_cliente());
									//this.inicializarActualizarBindingComprobanteTarjeta(false,false);
						this.clientesForeignKey=new ArrayList<Cliente>();

						if(comprobantetarjeta.getCliente()!=null) {
							this.clientesForeignKey.add(comprobantetarjeta.getCliente());
						}

						this.addItemDefectoCombosForeignKeyCliente();
						this.cargarCombosFrameClientesForeignKey("Todos");
					}
					this.setActualClienteForeignKey(this.comprobantetarjeta.getid_cliente(),false,"Formulario");

					//Caja
					if(!this.comprobantetarjetaConstantesFunciones.cargarid_cajaComprobanteTarjeta || this.comprobantetarjetaConstantesFunciones.event_dependid_cajaComprobanteTarjeta) {
						//this.cargarCombosCajasForeignKeyLista(" where id="+this.comprobantetarjeta.getid_caja());
									//this.inicializarActualizarBindingComprobanteTarjeta(false,false);
						this.cajasForeignKey=new ArrayList<Caja>();

						if(comprobantetarjeta.getCaja()!=null) {
							this.cajasForeignKey.add(comprobantetarjeta.getCaja());
						}

						this.addItemDefectoCombosForeignKeyCaja();
						this.cargarCombosFrameCajasForeignKey("Todos");
					}
					this.setActualCajaForeignKey(this.comprobantetarjeta.getid_caja(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesComprobanteTarjeta("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesComprobanteTarjeta(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualComprobanteTarjeta() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComprobanteTarjetaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoComprobanteTarjeta(ComprobanteTarjeta comprobantetarjeta) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoComprobanteTarjeta(comprobantetarjeta,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoComprobanteTarjeta(ComprobanteTarjeta comprobantetarjeta,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioComprobanteTarjeta(comprobantetarjeta);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyComprobanteTarjeta(comprobantetarjeta,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyComprobanteTarjeta(comprobantetarjeta);
	}
	
	public void setVariablesObjetoActualToFormularioComprobanteTarjeta(ComprobanteTarjeta comprobantetarjeta) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormComprobanteTarjeta==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormComprobanteTarjeta.jLabelidComprobanteTarjeta.setText(comprobantetarjeta.getId().toString());
			this.jInternalFrameDetalleFormComprobanteTarjeta.jTextAreanombre_cajaComprobanteTarjeta.setText(comprobantetarjeta.getnombre_caja());
			this.jInternalFrameDetalleFormComprobanteTarjeta.jTextFieldsecuencialComprobanteTarjeta.setText(comprobantetarjeta.getsecuencial());
			this.jInternalFrameDetalleFormComprobanteTarjeta.jDateChooserfechaComprobanteTarjeta.setDate(comprobantetarjeta.getfecha());
			this.jInternalFrameDetalleFormComprobanteTarjeta.jTextFieldcodigo_clienteComprobanteTarjeta.setText(comprobantetarjeta.getcodigo_cliente());
			this.jInternalFrameDetalleFormComprobanteTarjeta.jTextAreanombre_clienteComprobanteTarjeta.setText(comprobantetarjeta.getnombre_cliente());
			this.jInternalFrameDetalleFormComprobanteTarjeta.jTextFieldsubtotalComprobanteTarjeta.setText(comprobantetarjeta.getsubtotal().toString());
			this.jInternalFrameDetalleFormComprobanteTarjeta.jTextFieldivaComprobanteTarjeta.setText(comprobantetarjeta.getiva().toString());
			this.jInternalFrameDetalleFormComprobanteTarjeta.jTextFielddescuentoComprobanteTarjeta.setText(comprobantetarjeta.getdescuento().toString());
			this.jInternalFrameDetalleFormComprobanteTarjeta.jTextFieldfinanciamientoComprobanteTarjeta.setText(comprobantetarjeta.getfinanciamiento().toString());
			this.jInternalFrameDetalleFormComprobanteTarjeta.jTextFieldfleteComprobanteTarjeta.setText(comprobantetarjeta.getflete().toString());
			this.jInternalFrameDetalleFormComprobanteTarjeta.jTextFieldiceComprobanteTarjeta.setText(comprobantetarjeta.getice().toString());
			this.jInternalFrameDetalleFormComprobanteTarjeta.jTextFieldtotalComprobanteTarjeta.setText(comprobantetarjeta.gettotal().toString());
			this.jInternalFrameDetalleFormComprobanteTarjeta.jTextFieldvalorComprobanteTarjeta.setText(comprobantetarjeta.getvalor().toString());
			this.jInternalFrameDetalleFormComprobanteTarjeta.jDateChooserfecha_forma_pagoComprobanteTarjeta.setDate(comprobantetarjeta.getfecha_forma_pago());
			this.jInternalFrameDetalleFormComprobanteTarjeta.jTextFieldnumeroComprobanteTarjeta.setText(comprobantetarjeta.getnumero());
			this.jInternalFrameDetalleFormComprobanteTarjeta.jTextAreatarjeta_habienteComprobanteTarjeta.setText(comprobantetarjeta.gettarjeta_habiente());
			this.jInternalFrameDetalleFormComprobanteTarjeta.jTextAreaautorizacionComprobanteTarjeta.setText(comprobantetarjeta.getautorizacion());
			this.jInternalFrameDetalleFormComprobanteTarjeta.jTextFieldvoucherComprobanteTarjeta.setText(comprobantetarjeta.getvoucher());
			this.jInternalFrameDetalleFormComprobanteTarjeta.jTextFieldloteComprobanteTarjeta.setText(comprobantetarjeta.getlote());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ComprobanteTarjetaConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,ComprobanteTarjeta comprobantetarjetaLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,comprobantetarjetaLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,ComprobanteTarjeta comprobantetarjetaLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				comprobantetarjetaLocal=this.comprobantetarjeta;
			} else {
				comprobantetarjetaLocal=this.comprobantetarjetaAnterior;
			}
		}
		
		if(this.permiteMantenimiento(comprobantetarjetaLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoComprobanteTarjeta(comprobantetarjetaLocal,true);
					
					if(comprobantetarjetaSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(comprobantetarjetaLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.comprobantetarjetaSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(comprobantetarjetaLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoComprobanteTarjeta(ComprobanteTarjeta comprobantetarjeta,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualComprobanteTarjeta(comprobantetarjeta,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysComprobanteTarjeta(comprobantetarjeta);
	}
	
	public void setVariablesFormularioToObjetoActualComprobanteTarjeta(ComprobanteTarjeta comprobantetarjeta,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualComprobanteTarjeta(comprobantetarjeta,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualComprobanteTarjeta(ComprobanteTarjeta comprobantetarjeta,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormComprobanteTarjeta==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormComprobanteTarjeta.jLabelidComprobanteTarjeta.getText()==null || this.jInternalFrameDetalleFormComprobanteTarjeta.jLabelidComprobanteTarjeta.getText()=="" || this.jInternalFrameDetalleFormComprobanteTarjeta.jLabelidComprobanteTarjeta.getText()=="Id") {
				this.jInternalFrameDetalleFormComprobanteTarjeta.jLabelidComprobanteTarjeta.setText("0");
			}

			if(conColumnasBase) {comprobantetarjeta.setId(Long.parseLong(this.jInternalFrameDetalleFormComprobanteTarjeta.jLabelidComprobanteTarjeta.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ComprobanteTarjetaConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormComprobanteTarjeta.jLabelIdComprobanteTarjeta,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			comprobantetarjeta.setnombre_caja(this.jInternalFrameDetalleFormComprobanteTarjeta.jTextAreanombre_cajaComprobanteTarjeta.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ComprobanteTarjetaConstantesFunciones.LABEL_NOMBRECAJA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormComprobanteTarjeta.jLabelnombre_cajaComprobanteTarjeta,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			comprobantetarjeta.setsecuencial(this.jInternalFrameDetalleFormComprobanteTarjeta.jTextFieldsecuencialComprobanteTarjeta.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ComprobanteTarjetaConstantesFunciones.LABEL_SECUENCIAL+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormComprobanteTarjeta.jLabelsecuencialComprobanteTarjeta,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			comprobantetarjeta.setfecha(this.jInternalFrameDetalleFormComprobanteTarjeta.jDateChooserfechaComprobanteTarjeta.getDate());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ComprobanteTarjetaConstantesFunciones.LABEL_FECHA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormComprobanteTarjeta.jLabelfechaComprobanteTarjeta,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			comprobantetarjeta.setcodigo_cliente(this.jInternalFrameDetalleFormComprobanteTarjeta.jTextFieldcodigo_clienteComprobanteTarjeta.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ComprobanteTarjetaConstantesFunciones.LABEL_CODIGOCLIENTE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormComprobanteTarjeta.jLabelcodigo_clienteComprobanteTarjeta,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			comprobantetarjeta.setnombre_cliente(this.jInternalFrameDetalleFormComprobanteTarjeta.jTextAreanombre_clienteComprobanteTarjeta.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ComprobanteTarjetaConstantesFunciones.LABEL_NOMBRECLIENTE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormComprobanteTarjeta.jLabelnombre_clienteComprobanteTarjeta,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			comprobantetarjeta.setsubtotal(Double.parseDouble(this.jInternalFrameDetalleFormComprobanteTarjeta.jTextFieldsubtotalComprobanteTarjeta.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ComprobanteTarjetaConstantesFunciones.LABEL_SUBTOTAL+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormComprobanteTarjeta.jLabelsubtotalComprobanteTarjeta,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			comprobantetarjeta.setiva(Double.parseDouble(this.jInternalFrameDetalleFormComprobanteTarjeta.jTextFieldivaComprobanteTarjeta.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ComprobanteTarjetaConstantesFunciones.LABEL_IVA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormComprobanteTarjeta.jLabelivaComprobanteTarjeta,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			comprobantetarjeta.setdescuento(Double.parseDouble(this.jInternalFrameDetalleFormComprobanteTarjeta.jTextFielddescuentoComprobanteTarjeta.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ComprobanteTarjetaConstantesFunciones.LABEL_DESCUENTO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormComprobanteTarjeta.jLabeldescuentoComprobanteTarjeta,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			comprobantetarjeta.setfinanciamiento(Double.parseDouble(this.jInternalFrameDetalleFormComprobanteTarjeta.jTextFieldfinanciamientoComprobanteTarjeta.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ComprobanteTarjetaConstantesFunciones.LABEL_FINANCIAMIENTO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormComprobanteTarjeta.jLabelfinanciamientoComprobanteTarjeta,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			comprobantetarjeta.setflete(Double.parseDouble(this.jInternalFrameDetalleFormComprobanteTarjeta.jTextFieldfleteComprobanteTarjeta.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ComprobanteTarjetaConstantesFunciones.LABEL_FLETE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormComprobanteTarjeta.jLabelfleteComprobanteTarjeta,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			comprobantetarjeta.setice(Double.parseDouble(this.jInternalFrameDetalleFormComprobanteTarjeta.jTextFieldiceComprobanteTarjeta.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ComprobanteTarjetaConstantesFunciones.LABEL_ICE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormComprobanteTarjeta.jLabeliceComprobanteTarjeta,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			comprobantetarjeta.settotal(Double.parseDouble(this.jInternalFrameDetalleFormComprobanteTarjeta.jTextFieldtotalComprobanteTarjeta.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ComprobanteTarjetaConstantesFunciones.LABEL_TOTAL+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormComprobanteTarjeta.jLabeltotalComprobanteTarjeta,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			comprobantetarjeta.setvalor(Double.parseDouble(this.jInternalFrameDetalleFormComprobanteTarjeta.jTextFieldvalorComprobanteTarjeta.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ComprobanteTarjetaConstantesFunciones.LABEL_VALOR+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormComprobanteTarjeta.jLabelvalorComprobanteTarjeta,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			comprobantetarjeta.setfecha_forma_pago(this.jInternalFrameDetalleFormComprobanteTarjeta.jDateChooserfecha_forma_pagoComprobanteTarjeta.getDate());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ComprobanteTarjetaConstantesFunciones.LABEL_FECHAFORMAPAGO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormComprobanteTarjeta.jLabelfecha_forma_pagoComprobanteTarjeta,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			comprobantetarjeta.setnumero(this.jInternalFrameDetalleFormComprobanteTarjeta.jTextFieldnumeroComprobanteTarjeta.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ComprobanteTarjetaConstantesFunciones.LABEL_NUMERO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormComprobanteTarjeta.jLabelnumeroComprobanteTarjeta,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			comprobantetarjeta.settarjeta_habiente(this.jInternalFrameDetalleFormComprobanteTarjeta.jTextAreatarjeta_habienteComprobanteTarjeta.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ComprobanteTarjetaConstantesFunciones.LABEL_TARJETAHABIENTE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormComprobanteTarjeta.jLabeltarjeta_habienteComprobanteTarjeta,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			comprobantetarjeta.setautorizacion(this.jInternalFrameDetalleFormComprobanteTarjeta.jTextAreaautorizacionComprobanteTarjeta.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ComprobanteTarjetaConstantesFunciones.LABEL_AUTORIZACION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormComprobanteTarjeta.jLabelautorizacionComprobanteTarjeta,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			comprobantetarjeta.setvoucher(this.jInternalFrameDetalleFormComprobanteTarjeta.jTextFieldvoucherComprobanteTarjeta.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ComprobanteTarjetaConstantesFunciones.LABEL_VOUCHER+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormComprobanteTarjeta.jLabelvoucherComprobanteTarjeta,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			comprobantetarjeta.setlote(this.jInternalFrameDetalleFormComprobanteTarjeta.jTextFieldloteComprobanteTarjeta.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ComprobanteTarjetaConstantesFunciones.LABEL_LOTE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormComprobanteTarjeta.jLabelloteComprobanteTarjeta,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ComprobanteTarjetaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualComprobanteTarjeta(ComprobanteTarjeta comprobantetarjetaBean,ComprobanteTarjeta comprobantetarjeta,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ComprobanteTarjetaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosComprobanteTarjeta(ComprobanteTarjeta comprobantetarjetaOrigen,ComprobanteTarjeta comprobantetarjeta,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && comprobantetarjetaOrigen.getId()!=null && !comprobantetarjetaOrigen.getId().equals(0L))) {comprobantetarjeta.setId(comprobantetarjetaOrigen.getId());}}
			if(conDefault || (!conDefault && comprobantetarjetaOrigen.getid_cliente()!=null && !comprobantetarjetaOrigen.getid_cliente().equals(-1L))) {comprobantetarjeta.setid_cliente(comprobantetarjetaOrigen.getid_cliente());}
			if(conDefault || (!conDefault && comprobantetarjetaOrigen.getid_caja()!=null && !comprobantetarjetaOrigen.getid_caja().equals(-1L))) {comprobantetarjeta.setid_caja(comprobantetarjetaOrigen.getid_caja());}
			if(conDefault || (!conDefault && comprobantetarjetaOrigen.getfecha_inicio()!=null && !comprobantetarjetaOrigen.getfecha_inicio().equals(new Date()))) {comprobantetarjeta.setfecha_inicio(comprobantetarjetaOrigen.getfecha_inicio());}
			if(conDefault || (!conDefault && comprobantetarjetaOrigen.getfecha_fin()!=null && !comprobantetarjetaOrigen.getfecha_fin().equals(new Date()))) {comprobantetarjeta.setfecha_fin(comprobantetarjetaOrigen.getfecha_fin());}
			if(conDefault || (!conDefault && comprobantetarjetaOrigen.getnombre_caja()!=null && !comprobantetarjetaOrigen.getnombre_caja().equals(""))) {comprobantetarjeta.setnombre_caja(comprobantetarjetaOrigen.getnombre_caja());}
			if(conDefault || (!conDefault && comprobantetarjetaOrigen.getsecuencial()!=null && !comprobantetarjetaOrigen.getsecuencial().equals(""))) {comprobantetarjeta.setsecuencial(comprobantetarjetaOrigen.getsecuencial());}
			if(conDefault || (!conDefault && comprobantetarjetaOrigen.getfecha()!=null && !comprobantetarjetaOrigen.getfecha().equals(new Date()))) {comprobantetarjeta.setfecha(comprobantetarjetaOrigen.getfecha());}
			if(conDefault || (!conDefault && comprobantetarjetaOrigen.getcodigo_cliente()!=null && !comprobantetarjetaOrigen.getcodigo_cliente().equals(""))) {comprobantetarjeta.setcodigo_cliente(comprobantetarjetaOrigen.getcodigo_cliente());}
			if(conDefault || (!conDefault && comprobantetarjetaOrigen.getnombre_cliente()!=null && !comprobantetarjetaOrigen.getnombre_cliente().equals(""))) {comprobantetarjeta.setnombre_cliente(comprobantetarjetaOrigen.getnombre_cliente());}
			if(conDefault || (!conDefault && comprobantetarjetaOrigen.getsubtotal()!=null && !comprobantetarjetaOrigen.getsubtotal().equals(0.0))) {comprobantetarjeta.setsubtotal(comprobantetarjetaOrigen.getsubtotal());}
			if(conDefault || (!conDefault && comprobantetarjetaOrigen.getiva()!=null && !comprobantetarjetaOrigen.getiva().equals(0.0))) {comprobantetarjeta.setiva(comprobantetarjetaOrigen.getiva());}
			if(conDefault || (!conDefault && comprobantetarjetaOrigen.getdescuento()!=null && !comprobantetarjetaOrigen.getdescuento().equals(0.0))) {comprobantetarjeta.setdescuento(comprobantetarjetaOrigen.getdescuento());}
			if(conDefault || (!conDefault && comprobantetarjetaOrigen.getfinanciamiento()!=null && !comprobantetarjetaOrigen.getfinanciamiento().equals(0.0))) {comprobantetarjeta.setfinanciamiento(comprobantetarjetaOrigen.getfinanciamiento());}
			if(conDefault || (!conDefault && comprobantetarjetaOrigen.getflete()!=null && !comprobantetarjetaOrigen.getflete().equals(0.0))) {comprobantetarjeta.setflete(comprobantetarjetaOrigen.getflete());}
			if(conDefault || (!conDefault && comprobantetarjetaOrigen.getice()!=null && !comprobantetarjetaOrigen.getice().equals(0.0))) {comprobantetarjeta.setice(comprobantetarjetaOrigen.getice());}
			if(conDefault || (!conDefault && comprobantetarjetaOrigen.gettotal()!=null && !comprobantetarjetaOrigen.gettotal().equals(0.0))) {comprobantetarjeta.settotal(comprobantetarjetaOrigen.gettotal());}
			if(conDefault || (!conDefault && comprobantetarjetaOrigen.getvalor()!=null && !comprobantetarjetaOrigen.getvalor().equals(0.0))) {comprobantetarjeta.setvalor(comprobantetarjetaOrigen.getvalor());}
			if(conDefault || (!conDefault && comprobantetarjetaOrigen.getfecha_forma_pago()!=null && !comprobantetarjetaOrigen.getfecha_forma_pago().equals(new Date()))) {comprobantetarjeta.setfecha_forma_pago(comprobantetarjetaOrigen.getfecha_forma_pago());}
			if(conDefault || (!conDefault && comprobantetarjetaOrigen.getnumero()!=null && !comprobantetarjetaOrigen.getnumero().equals(""))) {comprobantetarjeta.setnumero(comprobantetarjetaOrigen.getnumero());}
			if(conDefault || (!conDefault && comprobantetarjetaOrigen.gettarjeta_habiente()!=null && !comprobantetarjetaOrigen.gettarjeta_habiente().equals(""))) {comprobantetarjeta.settarjeta_habiente(comprobantetarjetaOrigen.gettarjeta_habiente());}
			if(conDefault || (!conDefault && comprobantetarjetaOrigen.getautorizacion()!=null && !comprobantetarjetaOrigen.getautorizacion().equals(""))) {comprobantetarjeta.setautorizacion(comprobantetarjetaOrigen.getautorizacion());}
			if(conDefault || (!conDefault && comprobantetarjetaOrigen.getvoucher()!=null && !comprobantetarjetaOrigen.getvoucher().equals(""))) {comprobantetarjeta.setvoucher(comprobantetarjetaOrigen.getvoucher());}
			if(conDefault || (!conDefault && comprobantetarjetaOrigen.getlote()!=null && !comprobantetarjetaOrigen.getlote().equals(""))) {comprobantetarjeta.setlote(comprobantetarjetaOrigen.getlote());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ComprobanteTarjetaConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioComprobanteTarjeta(ComprobanteTarjeta comprobantetarjeta) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormComprobanteTarjeta.jLabelidComprobanteTarjeta.setText(comprobantetarjeta.getId().toString());
			this.jInternalFrameDetalleFormComprobanteTarjeta.jTextAreanombre_cajaComprobanteTarjeta.setText(comprobantetarjeta.getnombre_caja());
			this.jInternalFrameDetalleFormComprobanteTarjeta.jTextFieldsecuencialComprobanteTarjeta.setText(comprobantetarjeta.getsecuencial());
			this.jInternalFrameDetalleFormComprobanteTarjeta.jDateChooserfechaComprobanteTarjeta.setDate(comprobantetarjeta.getfecha());
			this.jInternalFrameDetalleFormComprobanteTarjeta.jTextFieldcodigo_clienteComprobanteTarjeta.setText(comprobantetarjeta.getcodigo_cliente());
			this.jInternalFrameDetalleFormComprobanteTarjeta.jTextAreanombre_clienteComprobanteTarjeta.setText(comprobantetarjeta.getnombre_cliente());
			this.jInternalFrameDetalleFormComprobanteTarjeta.jTextFieldsubtotalComprobanteTarjeta.setText(comprobantetarjeta.getsubtotal().toString());
			this.jInternalFrameDetalleFormComprobanteTarjeta.jTextFieldivaComprobanteTarjeta.setText(comprobantetarjeta.getiva().toString());
			this.jInternalFrameDetalleFormComprobanteTarjeta.jTextFielddescuentoComprobanteTarjeta.setText(comprobantetarjeta.getdescuento().toString());
			this.jInternalFrameDetalleFormComprobanteTarjeta.jTextFieldfinanciamientoComprobanteTarjeta.setText(comprobantetarjeta.getfinanciamiento().toString());
			this.jInternalFrameDetalleFormComprobanteTarjeta.jTextFieldfleteComprobanteTarjeta.setText(comprobantetarjeta.getflete().toString());
			this.jInternalFrameDetalleFormComprobanteTarjeta.jTextFieldiceComprobanteTarjeta.setText(comprobantetarjeta.getice().toString());
			this.jInternalFrameDetalleFormComprobanteTarjeta.jTextFieldtotalComprobanteTarjeta.setText(comprobantetarjeta.gettotal().toString());
			this.jInternalFrameDetalleFormComprobanteTarjeta.jTextFieldvalorComprobanteTarjeta.setText(comprobantetarjeta.getvalor().toString());
			this.jInternalFrameDetalleFormComprobanteTarjeta.jDateChooserfecha_forma_pagoComprobanteTarjeta.setDate(comprobantetarjeta.getfecha_forma_pago());
			this.jInternalFrameDetalleFormComprobanteTarjeta.jTextFieldnumeroComprobanteTarjeta.setText(comprobantetarjeta.getnumero());
			this.jInternalFrameDetalleFormComprobanteTarjeta.jTextAreatarjeta_habienteComprobanteTarjeta.setText(comprobantetarjeta.gettarjeta_habiente());
			this.jInternalFrameDetalleFormComprobanteTarjeta.jTextAreaautorizacionComprobanteTarjeta.setText(comprobantetarjeta.getautorizacion());
			this.jInternalFrameDetalleFormComprobanteTarjeta.jTextFieldvoucherComprobanteTarjeta.setText(comprobantetarjeta.getvoucher());
			this.jInternalFrameDetalleFormComprobanteTarjeta.jTextFieldloteComprobanteTarjeta.setText(comprobantetarjeta.getlote());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComprobanteTarjetaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioComprobanteTarjeta(ComprobanteTarjetaBean comprobantetarjetaBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormComprobanteTarjeta.jLabelidComprobanteTarjeta.setText(comprobantetarjetaBean.getId().toString());
			this.jInternalFrameDetalleFormComprobanteTarjeta.jTextAreanombre_cajaComprobanteTarjeta.setText(comprobantetarjetaBean.getnombre_caja());
			this.jInternalFrameDetalleFormComprobanteTarjeta.jTextFieldsecuencialComprobanteTarjeta.setText(comprobantetarjetaBean.getsecuencial());
			this.jInternalFrameDetalleFormComprobanteTarjeta.jDateChooserfechaComprobanteTarjeta.setDate(comprobantetarjetaBean.getfecha());
			this.jInternalFrameDetalleFormComprobanteTarjeta.jTextFieldcodigo_clienteComprobanteTarjeta.setText(comprobantetarjetaBean.getcodigo_cliente());
			this.jInternalFrameDetalleFormComprobanteTarjeta.jTextAreanombre_clienteComprobanteTarjeta.setText(comprobantetarjetaBean.getnombre_cliente());
			this.jInternalFrameDetalleFormComprobanteTarjeta.jTextFieldsubtotalComprobanteTarjeta.setText(comprobantetarjetaBean.getsubtotal().toString());
			this.jInternalFrameDetalleFormComprobanteTarjeta.jTextFieldivaComprobanteTarjeta.setText(comprobantetarjetaBean.getiva().toString());
			this.jInternalFrameDetalleFormComprobanteTarjeta.jTextFielddescuentoComprobanteTarjeta.setText(comprobantetarjetaBean.getdescuento().toString());
			this.jInternalFrameDetalleFormComprobanteTarjeta.jTextFieldfinanciamientoComprobanteTarjeta.setText(comprobantetarjetaBean.getfinanciamiento().toString());
			this.jInternalFrameDetalleFormComprobanteTarjeta.jTextFieldfleteComprobanteTarjeta.setText(comprobantetarjetaBean.getflete().toString());
			this.jInternalFrameDetalleFormComprobanteTarjeta.jTextFieldiceComprobanteTarjeta.setText(comprobantetarjetaBean.getice().toString());
			this.jInternalFrameDetalleFormComprobanteTarjeta.jTextFieldtotalComprobanteTarjeta.setText(comprobantetarjetaBean.gettotal().toString());
			this.jInternalFrameDetalleFormComprobanteTarjeta.jTextFieldvalorComprobanteTarjeta.setText(comprobantetarjetaBean.getvalor().toString());
			this.jInternalFrameDetalleFormComprobanteTarjeta.jDateChooserfecha_forma_pagoComprobanteTarjeta.setDate(comprobantetarjetaBean.getfecha_forma_pago());
			this.jInternalFrameDetalleFormComprobanteTarjeta.jTextFieldnumeroComprobanteTarjeta.setText(comprobantetarjetaBean.getnumero());
			this.jInternalFrameDetalleFormComprobanteTarjeta.jTextAreatarjeta_habienteComprobanteTarjeta.setText(comprobantetarjetaBean.gettarjeta_habiente());
			this.jInternalFrameDetalleFormComprobanteTarjeta.jTextAreaautorizacionComprobanteTarjeta.setText(comprobantetarjetaBean.getautorizacion());
			this.jInternalFrameDetalleFormComprobanteTarjeta.jTextFieldvoucherComprobanteTarjeta.setText(comprobantetarjetaBean.getvoucher());
			this.jInternalFrameDetalleFormComprobanteTarjeta.jTextFieldloteComprobanteTarjeta.setText(comprobantetarjetaBean.getlote());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComprobanteTarjetaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanComprobanteTarjeta(ComprobanteTarjetaParameterReturnGeneral comprobantetarjetaReturnGeneral,ComprobanteTarjetaBean comprobantetarjetaBean,Boolean conDefault) throws Exception { 
		try {
			ComprobanteTarjeta comprobantetarjetaLocal=new ComprobanteTarjeta();
			
			comprobantetarjetaLocal=comprobantetarjetaReturnGeneral.getComprobanteTarjeta();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && comprobantetarjetaLocal.getId()!=null && !comprobantetarjetaLocal.getId().equals(0L))) {comprobantetarjetaBean.setId(comprobantetarjetaLocal.getId());}}
			if(conDefault || (!conDefault && comprobantetarjetaLocal.getnombre_caja()!=null && !comprobantetarjetaLocal.getnombre_caja().equals(""))) {comprobantetarjetaBean.setnombre_caja(comprobantetarjetaLocal.getnombre_caja());}
			if(conDefault || (!conDefault && comprobantetarjetaLocal.getsecuencial()!=null && !comprobantetarjetaLocal.getsecuencial().equals(""))) {comprobantetarjetaBean.setsecuencial(comprobantetarjetaLocal.getsecuencial());}
			if(conDefault || (!conDefault && comprobantetarjetaLocal.getfecha()!=null && !comprobantetarjetaLocal.getfecha().equals(new Date()))) {comprobantetarjetaBean.setfecha(comprobantetarjetaLocal.getfecha());}
			if(conDefault || (!conDefault && comprobantetarjetaLocal.getcodigo_cliente()!=null && !comprobantetarjetaLocal.getcodigo_cliente().equals(""))) {comprobantetarjetaBean.setcodigo_cliente(comprobantetarjetaLocal.getcodigo_cliente());}
			if(conDefault || (!conDefault && comprobantetarjetaLocal.getnombre_cliente()!=null && !comprobantetarjetaLocal.getnombre_cliente().equals(""))) {comprobantetarjetaBean.setnombre_cliente(comprobantetarjetaLocal.getnombre_cliente());}
			if(conDefault || (!conDefault && comprobantetarjetaLocal.getsubtotal()!=null && !comprobantetarjetaLocal.getsubtotal().equals(0.0))) {comprobantetarjetaBean.setsubtotal(comprobantetarjetaLocal.getsubtotal());}
			if(conDefault || (!conDefault && comprobantetarjetaLocal.getiva()!=null && !comprobantetarjetaLocal.getiva().equals(0.0))) {comprobantetarjetaBean.setiva(comprobantetarjetaLocal.getiva());}
			if(conDefault || (!conDefault && comprobantetarjetaLocal.getdescuento()!=null && !comprobantetarjetaLocal.getdescuento().equals(0.0))) {comprobantetarjetaBean.setdescuento(comprobantetarjetaLocal.getdescuento());}
			if(conDefault || (!conDefault && comprobantetarjetaLocal.getfinanciamiento()!=null && !comprobantetarjetaLocal.getfinanciamiento().equals(0.0))) {comprobantetarjetaBean.setfinanciamiento(comprobantetarjetaLocal.getfinanciamiento());}
			if(conDefault || (!conDefault && comprobantetarjetaLocal.getflete()!=null && !comprobantetarjetaLocal.getflete().equals(0.0))) {comprobantetarjetaBean.setflete(comprobantetarjetaLocal.getflete());}
			if(conDefault || (!conDefault && comprobantetarjetaLocal.getice()!=null && !comprobantetarjetaLocal.getice().equals(0.0))) {comprobantetarjetaBean.setice(comprobantetarjetaLocal.getice());}
			if(conDefault || (!conDefault && comprobantetarjetaLocal.gettotal()!=null && !comprobantetarjetaLocal.gettotal().equals(0.0))) {comprobantetarjetaBean.settotal(comprobantetarjetaLocal.gettotal());}
			if(conDefault || (!conDefault && comprobantetarjetaLocal.getvalor()!=null && !comprobantetarjetaLocal.getvalor().equals(0.0))) {comprobantetarjetaBean.setvalor(comprobantetarjetaLocal.getvalor());}
			if(conDefault || (!conDefault && comprobantetarjetaLocal.getfecha_forma_pago()!=null && !comprobantetarjetaLocal.getfecha_forma_pago().equals(new Date()))) {comprobantetarjetaBean.setfecha_forma_pago(comprobantetarjetaLocal.getfecha_forma_pago());}
			if(conDefault || (!conDefault && comprobantetarjetaLocal.getnumero()!=null && !comprobantetarjetaLocal.getnumero().equals(""))) {comprobantetarjetaBean.setnumero(comprobantetarjetaLocal.getnumero());}
			if(conDefault || (!conDefault && comprobantetarjetaLocal.gettarjeta_habiente()!=null && !comprobantetarjetaLocal.gettarjeta_habiente().equals(""))) {comprobantetarjetaBean.settarjeta_habiente(comprobantetarjetaLocal.gettarjeta_habiente());}
			if(conDefault || (!conDefault && comprobantetarjetaLocal.getautorizacion()!=null && !comprobantetarjetaLocal.getautorizacion().equals(""))) {comprobantetarjetaBean.setautorizacion(comprobantetarjetaLocal.getautorizacion());}
			if(conDefault || (!conDefault && comprobantetarjetaLocal.getvoucher()!=null && !comprobantetarjetaLocal.getvoucher().equals(""))) {comprobantetarjetaBean.setvoucher(comprobantetarjetaLocal.getvoucher());}
			if(conDefault || (!conDefault && comprobantetarjetaLocal.getlote()!=null && !comprobantetarjetaLocal.getlote().equals(""))) {comprobantetarjetaBean.setlote(comprobantetarjetaLocal.getlote());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComprobanteTarjetaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxComprobanteTarjetaGenerico(Long idComprobanteTarjetaSeleccionado,JComboBox jComboBoxComprobanteTarjeta,List<ComprobanteTarjeta> comprobantetarjetasLocal)throws Exception {
		try {
			ComprobanteTarjeta  comprobantetarjetaTemp=null;

			for(ComprobanteTarjeta comprobantetarjetaAux:comprobantetarjetasLocal) {
				if(comprobantetarjetaAux.getId()!=null && comprobantetarjetaAux.getId().equals(idComprobanteTarjetaSeleccionado)) {
					comprobantetarjetaTemp=comprobantetarjetaAux;
					break;
				}
			}

			jComboBoxComprobanteTarjeta.setSelectedItem(comprobantetarjetaTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxComprobanteTarjetaGenerico(JComboBox jComboBoxComprobanteTarjeta,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxComprobanteTarjeta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxComprobanteTarjeta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxComprobanteTarjeta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxComprobanteTarjeta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxComprobanteTarjeta.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxComprobanteTarjeta.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxComprobanteTarjeta.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxComprobanteTarjeta.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxComprobanteTarjeta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxComprobanteTarjeta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,ComprobanteTarjetaConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			comprobantetarjeta=(ComprobanteTarjeta) comprobantetarjetaLogic.getComprobanteTarjetas().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			comprobantetarjeta =(ComprobanteTarjeta) comprobantetarjetas.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!comprobantetarjeta.getIsNew() && !comprobantetarjeta.getIsChanged() && !comprobantetarjeta.getIsDeleted()) {
				sDescripcion=comprobantetarjeta.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=comprobantetarjeta.getempresa_descripcion();
			}
		}

		if(sTipo.equals("Sucursal")) {
			//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
			if(!comprobantetarjeta.getIsNew() && !comprobantetarjeta.getIsChanged() && !comprobantetarjeta.getIsDeleted()) {
				sDescripcion=comprobantetarjeta.getsucursal_descripcion();
			} else {
				//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
				sDescripcion=comprobantetarjeta.getsucursal_descripcion();
			}
		}

		if(sTipo.equals("Cliente")) {
			//sDescripcion=this.getActualClienteForeignKeyDescripcion((Long)value);
			if(!comprobantetarjeta.getIsNew() && !comprobantetarjeta.getIsChanged() && !comprobantetarjeta.getIsDeleted()) {
				sDescripcion=comprobantetarjeta.getcliente_descripcion();
			} else {
				//sDescripcion=this.getActualClienteForeignKeyDescripcion((Long)value);
				sDescripcion=comprobantetarjeta.getcliente_descripcion();
			}
		}

		if(sTipo.equals("Caja")) {
			//sDescripcion=this.getActualCajaForeignKeyDescripcion((Long)value);
			if(!comprobantetarjeta.getIsNew() && !comprobantetarjeta.getIsChanged() && !comprobantetarjeta.getIsDeleted()) {
				sDescripcion=comprobantetarjeta.getcaja_descripcion();
			} else {
				//sDescripcion=this.getActualCajaForeignKeyDescripcion((Long)value);
				sDescripcion=comprobantetarjeta.getcaja_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		ComprobanteTarjeta comprobantetarjetaRow=new ComprobanteTarjeta();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			comprobantetarjetaRow=(ComprobanteTarjeta) comprobantetarjetaLogic.getComprobanteTarjetas().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			comprobantetarjetaRow=(ComprobanteTarjeta) comprobantetarjetas.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualComprobanteTarjeta(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoComprobanteTarjeta.setVisible((this.isVisibilidadCeldaNuevoComprobanteTarjeta && this.isPermisoNuevoComprobanteTarjeta));			
			this.jButtonDuplicarComprobanteTarjeta.setVisible((this.isVisibilidadCeldaDuplicarComprobanteTarjeta && this.isPermisoDuplicarComprobanteTarjeta));			
			this.jButtonCopiarComprobanteTarjeta.setVisible((this.isVisibilidadCeldaCopiarComprobanteTarjeta && this.isPermisoCopiarComprobanteTarjeta));
			this.jButtonVerFormComprobanteTarjeta.setVisible((this.isVisibilidadCeldaVerFormComprobanteTarjeta && this.isPermisoVerFormComprobanteTarjeta));
			
			this.jButtonAbrirOrderByComprobanteTarjeta.setVisible((this.isVisibilidadCeldaOrdenComprobanteTarjeta && this.isPermisoOrdenComprobanteTarjeta));			
			
			this.jButtonNuevoRelacionesComprobanteTarjeta.setVisible((this.isVisibilidadCeldaNuevoRelacionesComprobanteTarjeta && this.isPermisoNuevoComprobanteTarjeta));			
			this.jButtonNuevoGuardarCambiosComprobanteTarjeta.setVisible((this.isVisibilidadCeldaNuevoComprobanteTarjeta && this.isPermisoNuevoComprobanteTarjeta && this.isPermisoGuardarCambiosComprobanteTarjeta));
			
			if(this.jInternalFrameDetalleFormComprobanteTarjeta!=null) {
			this.jInternalFrameDetalleFormComprobanteTarjeta.jButtonModificarComprobanteTarjeta.setVisible((this.isVisibilidadCeldaModificarComprobanteTarjeta && this.isPermisoActualizarComprobanteTarjeta));	
			this.jInternalFrameDetalleFormComprobanteTarjeta.jButtonActualizarComprobanteTarjeta.setVisible((this.isVisibilidadCeldaActualizarComprobanteTarjeta && this.isPermisoActualizarComprobanteTarjeta));	
			this.jInternalFrameDetalleFormComprobanteTarjeta.jButtonEliminarComprobanteTarjeta.setVisible((this.isVisibilidadCeldaEliminarComprobanteTarjeta && this.isPermisoEliminarComprobanteTarjeta));
			this.jInternalFrameDetalleFormComprobanteTarjeta.jButtonCancelarComprobanteTarjeta.setVisible(this.isVisibilidadCeldaCancelarComprobanteTarjeta);							
			this.jInternalFrameDetalleFormComprobanteTarjeta.jButtonGuardarCambiosComprobanteTarjeta.setVisible((this.isVisibilidadCeldaGuardarComprobanteTarjeta && this.isPermisoGuardarCambiosComprobanteTarjeta));			
			
			}
						
			this.jButtonGuardarCambiosTablaComprobanteTarjeta.setVisible((this.isVisibilidadCeldaGuardarCambiosComprobanteTarjeta && this.isPermisoGuardarCambiosComprobanteTarjeta));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarComprobanteTarjeta.setVisible((this.isVisibilidadCeldaNuevoComprobanteTarjeta && this.isPermisoNuevoComprobanteTarjeta));						
			this.jButtonDuplicarToolBarComprobanteTarjeta.setVisible((this.isVisibilidadCeldaDuplicarComprobanteTarjeta && this.isPermisoDuplicarComprobanteTarjeta));						
			this.jButtonCopiarToolBarComprobanteTarjeta.setVisible((this.isVisibilidadCeldaCopiarComprobanteTarjeta && this.isPermisoCopiarComprobanteTarjeta));			
			this.jButtonVerFormToolBarComprobanteTarjeta.setVisible((this.isVisibilidadCeldaVerFormComprobanteTarjeta && this.isPermisoVerFormComprobanteTarjeta));			
			this.jButtonAbrirOrderByToolBarComprobanteTarjeta.setVisible((this.isVisibilidadCeldaOrdenComprobanteTarjeta && this.isPermisoOrdenComprobanteTarjeta));
			this.jButtonNuevoRelacionesToolBarComprobanteTarjeta.setVisible((this.isVisibilidadCeldaNuevoRelacionesComprobanteTarjeta && this.isPermisoNuevoComprobanteTarjeta));			
			this.jButtonNuevoGuardarCambiosToolBarComprobanteTarjeta.setVisible((this.isVisibilidadCeldaNuevoComprobanteTarjeta && this.isPermisoNuevoComprobanteTarjeta && this.isPermisoGuardarCambiosComprobanteTarjeta));			
			
			if(this.jInternalFrameDetalleFormComprobanteTarjeta!=null) {
			this.jInternalFrameDetalleFormComprobanteTarjeta.jButtonModificarToolBarComprobanteTarjeta.setVisible((this.isVisibilidadCeldaModificarComprobanteTarjeta && this.isPermisoActualizarComprobanteTarjeta));	
			this.jInternalFrameDetalleFormComprobanteTarjeta.jButtonActualizarToolBarComprobanteTarjeta.setVisible((this.isVisibilidadCeldaActualizarComprobanteTarjeta  && this.isPermisoActualizarComprobanteTarjeta));	
			this.jInternalFrameDetalleFormComprobanteTarjeta.jButtonEliminarToolBarComprobanteTarjeta.setVisible((this.isVisibilidadCeldaEliminarComprobanteTarjeta && this.isPermisoEliminarComprobanteTarjeta));
			this.jInternalFrameDetalleFormComprobanteTarjeta.jButtonCancelarToolBarComprobanteTarjeta.setVisible(this.isVisibilidadCeldaCancelarComprobanteTarjeta);				
			this.jInternalFrameDetalleFormComprobanteTarjeta.jButtonGuardarCambiosToolBarComprobanteTarjeta.setVisible((this.isVisibilidadCeldaGuardarComprobanteTarjeta && this.isPermisoGuardarCambiosComprobanteTarjeta));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarComprobanteTarjeta.setVisible((this.isVisibilidadCeldaGuardarCambiosComprobanteTarjeta && this.isPermisoGuardarCambiosComprobanteTarjeta));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoComprobanteTarjeta.setVisible((this.isVisibilidadCeldaNuevoComprobanteTarjeta && this.isPermisoNuevoComprobanteTarjeta));			
			this.jMenuItemDuplicarComprobanteTarjeta.setVisible((this.isVisibilidadCeldaDuplicarComprobanteTarjeta && this.isPermisoDuplicarComprobanteTarjeta));			
			this.jMenuItemCopiarComprobanteTarjeta.setVisible((this.isVisibilidadCeldaCopiarComprobanteTarjeta && this.isPermisoCopiarComprobanteTarjeta));			
			this.jMenuItemVerFormComprobanteTarjeta.setVisible((this.isVisibilidadCeldaVerFormComprobanteTarjeta && this.isPermisoVerFormComprobanteTarjeta));			
			this.jMenuItemAbrirOrderByComprobanteTarjeta.setVisible((this.isVisibilidadCeldaOrdenComprobanteTarjeta && this.isPermisoOrdenComprobanteTarjeta));			
			//this.jMenuItemMostrarOcultarComprobanteTarjeta.setVisible((this.isVisibilidadCeldaOrdenComprobanteTarjeta && this.isPermisoOrdenComprobanteTarjeta));
			this.jMenuItemDetalleAbrirOrderByComprobanteTarjeta.setVisible((this.isVisibilidadCeldaOrdenComprobanteTarjeta && this.isPermisoOrdenComprobanteTarjeta));			
			//this.jMenuItemDetalleMostrarOcultarComprobanteTarjeta.setVisible((this.isVisibilidadCeldaOrdenComprobanteTarjeta && this.isPermisoOrdenComprobanteTarjeta));			
			this.jMenuItemNuevoRelacionesComprobanteTarjeta.setVisible((this.isVisibilidadCeldaNuevoRelacionesComprobanteTarjeta && this.isPermisoNuevoComprobanteTarjeta));			
			this.jMenuItemNuevoGuardarCambiosComprobanteTarjeta.setVisible((this.isVisibilidadCeldaNuevoComprobanteTarjeta && this.isPermisoNuevoComprobanteTarjeta && this.isPermisoGuardarCambiosComprobanteTarjeta));									
			
			if(this.jInternalFrameDetalleFormComprobanteTarjeta!=null) {
			this.jInternalFrameDetalleFormComprobanteTarjeta.jMenuItemModificarComprobanteTarjeta.setVisible((this.isVisibilidadCeldaModificarComprobanteTarjeta && this.isPermisoActualizarComprobanteTarjeta));	
			this.jInternalFrameDetalleFormComprobanteTarjeta.jMenuItemActualizarComprobanteTarjeta.setVisible((this.isVisibilidadCeldaActualizarComprobanteTarjeta && this.isPermisoActualizarComprobanteTarjeta));	
			this.jInternalFrameDetalleFormComprobanteTarjeta.jMenuItemEliminarComprobanteTarjeta.setVisible((this.isVisibilidadCeldaEliminarComprobanteTarjeta && this.isPermisoEliminarComprobanteTarjeta));
			this.jInternalFrameDetalleFormComprobanteTarjeta.jMenuItemCancelarComprobanteTarjeta.setVisible(this.isVisibilidadCeldaCancelarComprobanteTarjeta);				
			}
			
			this.jMenuItemGuardarCambiosComprobanteTarjeta.setVisible((this.isVisibilidadCeldaGuardarComprobanteTarjeta && this.isPermisoGuardarCambiosComprobanteTarjeta));						
			this.jMenuItemGuardarCambiosTablaComprobanteTarjeta.setVisible((this.isVisibilidadCeldaGuardarCambiosComprobanteTarjeta && this.isPermisoGuardarCambiosComprobanteTarjeta));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoComprobanteTarjeta=this.jButtonNuevoComprobanteTarjeta.isVisible();
			this.isVisibilidadCeldaDuplicarComprobanteTarjeta=this.jButtonDuplicarComprobanteTarjeta.isVisible();
			this.isVisibilidadCeldaCopiarComprobanteTarjeta=this.jButtonCopiarComprobanteTarjeta.isVisible();
			this.isVisibilidadCeldaVerFormComprobanteTarjeta=this.jButtonVerFormComprobanteTarjeta.isVisible();
			
			this.isVisibilidadCeldaOrdenComprobanteTarjeta=this.jButtonAbrirOrderByComprobanteTarjeta.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesComprobanteTarjeta=this.jButtonNuevoRelacionesComprobanteTarjeta.isVisible();
			this.isVisibilidadCeldaModificarComprobanteTarjeta=this.jButtonModificarComprobanteTarjeta.isVisible();
			
			if(this.jInternalFrameDetalleFormComprobanteTarjeta!=null) {
			this.isVisibilidadCeldaActualizarComprobanteTarjeta=this.jInternalFrameDetalleFormComprobanteTarjeta.jButtonActualizarComprobanteTarjeta.isVisible();
			this.isVisibilidadCeldaEliminarComprobanteTarjeta=this.jInternalFrameDetalleFormComprobanteTarjeta.jButtonEliminarComprobanteTarjeta.isVisible();
			this.isVisibilidadCeldaCancelarComprobanteTarjeta=this.jInternalFrameDetalleFormComprobanteTarjeta.jButtonCancelarComprobanteTarjeta.isVisible();
			this.isVisibilidadCeldaGuardarComprobanteTarjeta=this.jInternalFrameDetalleFormComprobanteTarjeta.jButtonGuardarCambiosComprobanteTarjeta.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosComprobanteTarjeta=this.jButtonGuardarCambiosTablaComprobanteTarjeta.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoComprobanteTarjeta=this.jButtonNuevoToolBarComprobanteTarjeta.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesComprobanteTarjeta=this.jButtonNuevoRelacionesToolBarComprobanteTarjeta.isVisible();
			
			if(this.jInternalFrameDetalleFormComprobanteTarjeta!=null) {
			this.isVisibilidadCeldaModificarComprobanteTarjeta=this.jInternalFrameDetalleFormComprobanteTarjeta.jButtonModificarToolBarComprobanteTarjeta.isVisible();
			this.isVisibilidadCeldaActualizarComprobanteTarjeta=this.jInternalFrameDetalleFormComprobanteTarjeta.jButtonActualizarToolBarComprobanteTarjeta.isVisible();
			this.isVisibilidadCeldaEliminarComprobanteTarjeta=this.jInternalFrameDetalleFormComprobanteTarjeta.jButtonEliminarToolBarComprobanteTarjeta.isVisible();
			this.isVisibilidadCeldaCancelarComprobanteTarjeta=this.jInternalFrameDetalleFormComprobanteTarjeta.jButtonCancelarToolBarComprobanteTarjeta.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarComprobanteTarjeta=this.jButtonGuardarCambiosToolBarComprobanteTarjeta.isVisible();
			this.isVisibilidadCeldaGuardarCambiosComprobanteTarjeta=this.jButtonGuardarCambiosTablaToolBarComprobanteTarjeta.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoComprobanteTarjeta=this.jMenuItemNuevoComprobanteTarjeta.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesComprobanteTarjeta=this.jMenuItemNuevoRelacionesComprobanteTarjeta.isVisible();
			
			if(this.jInternalFrameDetalleFormComprobanteTarjeta!=null) {
			this.isVisibilidadCeldaModificarComprobanteTarjeta=this.jInternalFrameDetalleFormComprobanteTarjeta.jMenuItemModificarComprobanteTarjeta.isVisible();
			this.isVisibilidadCeldaActualizarComprobanteTarjeta=this.jInternalFrameDetalleFormComprobanteTarjeta.jMenuItemActualizarComprobanteTarjeta.isVisible();
			this.isVisibilidadCeldaEliminarComprobanteTarjeta=this.jInternalFrameDetalleFormComprobanteTarjeta.jMenuItemEliminarComprobanteTarjeta.isVisible();
			this.isVisibilidadCeldaCancelarComprobanteTarjeta=this.jInternalFrameDetalleFormComprobanteTarjeta.jMenuItemCancelarComprobanteTarjeta.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarComprobanteTarjeta=this.jMenuItemGuardarCambiosComprobanteTarjeta.isVisible();
			this.isVisibilidadCeldaGuardarCambiosComprobanteTarjeta=this.jMenuItemGuardarCambiosTablaComprobanteTarjeta.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesComprobanteTarjeta(Boolean esInicializar) {
		if(ComprobanteTarjetaJInternalFrame.ISBINDING_MANUAL) {			
			if(this.comprobantetarjetaSessionBean.getConGuardarRelaciones()) {
				//if(this.comprobantetarjetaSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesComprobanteTarjeta();
			}
			
			this.inicializarActualizarBindingBotonesManualComprobanteTarjeta(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualComprobanteTarjeta() {
		this.jButtonNuevoComprobanteTarjeta.setVisible(this.isPermisoNuevoComprobanteTarjeta);			
		this.jButtonDuplicarComprobanteTarjeta.setVisible(this.isPermisoDuplicarComprobanteTarjeta);			
		this.jButtonCopiarComprobanteTarjeta.setVisible(this.isPermisoCopiarComprobanteTarjeta);			
		this.jButtonVerFormComprobanteTarjeta.setVisible(this.isPermisoVerFormComprobanteTarjeta);			
		
		this.jButtonAbrirOrderByComprobanteTarjeta.setVisible(this.isPermisoOrdenComprobanteTarjeta);					
		
		this.jButtonNuevoRelacionesComprobanteTarjeta.setVisible(this.isPermisoNuevoComprobanteTarjeta);			
		
		if(this.jInternalFrameDetalleFormComprobanteTarjeta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormComprobanteTarjeta.jButtonModificarComprobanteTarjeta.setVisible(this.isPermisoActualizarComprobanteTarjeta);	
			this.jInternalFrameDetalleFormComprobanteTarjeta.jButtonActualizarComprobanteTarjeta.setVisible(this.isPermisoActualizarComprobanteTarjeta);	
			this.jInternalFrameDetalleFormComprobanteTarjeta.jButtonEliminarComprobanteTarjeta.setVisible(this.isPermisoEliminarComprobanteTarjeta);
			this.jInternalFrameDetalleFormComprobanteTarjeta.jButtonCancelarComprobanteTarjeta.setVisible(this.isVisibilidadCeldaCancelarComprobanteTarjeta);						
			this.jInternalFrameDetalleFormComprobanteTarjeta.jButtonGuardarCambiosComprobanteTarjeta.setVisible(this.isPermisoGuardarCambiosComprobanteTarjeta);							
		}
		
		this.jButtonGuardarCambiosTablaComprobanteTarjeta.setVisible(this.isPermisoActualizarComprobanteTarjeta);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleComprobanteTarjeta() {
		this.jInternalFrameDetalleFormComprobanteTarjeta.jButtonModificarComprobanteTarjeta.setVisible(this.isPermisoActualizarComprobanteTarjeta);	
		this.jInternalFrameDetalleFormComprobanteTarjeta.jButtonActualizarComprobanteTarjeta.setVisible(this.isPermisoActualizarComprobanteTarjeta);	
		this.jInternalFrameDetalleFormComprobanteTarjeta.jButtonEliminarComprobanteTarjeta.setVisible(this.isPermisoEliminarComprobanteTarjeta);
		this.jInternalFrameDetalleFormComprobanteTarjeta.jButtonCancelarComprobanteTarjeta.setVisible(this.isVisibilidadCeldaCancelarComprobanteTarjeta);							
		this.jInternalFrameDetalleFormComprobanteTarjeta.jButtonGuardarCambiosComprobanteTarjeta.setVisible((this.isVisibilidadCeldaGuardarComprobanteTarjeta && this.isPermisoGuardarCambiosComprobanteTarjeta));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosComprobanteTarjeta() {
		if(ComprobanteTarjetaJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualComprobanteTarjeta();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesComprobanteTarjeta() {
	}
	
	public void jTableDatosComprobanteTarjetaListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarComprobanteTarjeta(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComprobanteTarjetaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidComprobanteTarjetaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantetarjetaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosComprobanteTarjeta.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualComprobanteTarjeta(this.getcomprobantetarjeta(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysComprobanteTarjeta(this.comprobantetarjeta);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.comprobantetarjeta =(ComprobanteTarjeta) this.comprobantetarjetaLogic.getComprobanteTarjetas().toArray()[this.jTableDatosComprobanteTarjeta.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.comprobantetarjeta =(ComprobanteTarjeta) this.comprobantetarjetas.toArray()[this.jTableDatosComprobanteTarjeta.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.comprobantetarjeta==null) {
						this.comprobantetarjeta = new ComprobanteTarjeta();
					}

					this.setVariablesFormularioToObjetoActualComprobanteTarjeta(this.comprobantetarjeta,true);
					this.setVariablesFormularioToObjetoActualForeignKeysComprobanteTarjeta(this.comprobantetarjeta);
				}

				if(this.comprobantetarjeta.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.comprobantetarjeta.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingComprobanteTarjeta(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantetarjetaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantetarjetaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ComprobanteTarjetaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantetarjetaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaComprobanteTarjetaUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comprobantetarjetaLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebComprobanteTarjeta(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosComprobanteTarjeta.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosComprobanteTarjeta.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosComprobanteTarjeta.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantetarjeta =(ComprobanteTarjeta) this.comprobantetarjetaLogic.getComprobanteTarjetas().toArray()[this.jTableDatosComprobanteTarjeta.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.comprobantetarjeta =(ComprobanteTarjeta) this.comprobantetarjetas.toArray()[this.jTableDatosComprobanteTarjeta.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualComprobanteTarjeta(this.getcomprobantetarjeta(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysComprobanteTarjeta(this.comprobantetarjeta);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.comprobantetarjetaLogic.getConnexion());

				if(this.comprobantetarjeta.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.comprobantetarjeta.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderComprobanteTarjeta=(TitledBorder)this.jScrollPanelDatosComprobanteTarjeta.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderComprobanteTarjeta.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comprobantetarjetaLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comprobantetarjetaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ComprobanteTarjetaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comprobantetarjetaLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaComprobanteTarjetaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantetarjetaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosComprobanteTarjeta.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualComprobanteTarjeta(this.getcomprobantetarjeta(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysComprobanteTarjeta(this.comprobantetarjeta);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.comprobantetarjeta =(ComprobanteTarjeta) this.comprobantetarjetaLogic.getComprobanteTarjetas().toArray()[this.jTableDatosComprobanteTarjeta.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.comprobantetarjeta =(ComprobanteTarjeta) this.comprobantetarjetas.toArray()[this.jTableDatosComprobanteTarjeta.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.comprobantetarjeta==null) {
						this.comprobantetarjeta = new ComprobanteTarjeta();
					}

					this.setVariablesFormularioToObjetoActualComprobanteTarjeta(this.comprobantetarjeta,true);
					this.setVariablesFormularioToObjetoActualForeignKeysComprobanteTarjeta(this.comprobantetarjeta);
				}

				if(this.comprobantetarjeta.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.comprobantetarjeta.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingComprobanteTarjeta(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantetarjetaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantetarjetaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ComprobanteTarjetaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantetarjetaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_sucursalComprobanteTarjetaUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comprobantetarjetaLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisosucursal=true;

			idTienePermisosucursal=this.tienePermisosUsuarioEnPaginaWebComprobanteTarjeta(SucursalConstantesFunciones.CLASSNAME);

			if(idTienePermisosucursal) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosComprobanteTarjeta.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosComprobanteTarjeta.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosComprobanteTarjeta.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantetarjeta =(ComprobanteTarjeta) this.comprobantetarjetaLogic.getComprobanteTarjetas().toArray()[this.jTableDatosComprobanteTarjeta.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.comprobantetarjeta =(ComprobanteTarjeta) this.comprobantetarjetas.toArray()[this.jTableDatosComprobanteTarjeta.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualComprobanteTarjeta(this.getcomprobantetarjeta(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysComprobanteTarjeta(this.comprobantetarjeta);

				this.sucursalBeanSwingJInternalFrame=new SucursalBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.sucursalBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.sucursalBeanSwingJInternalFrame.getSucursalLogic().setConnexion(this.comprobantetarjetaLogic.getConnexion());

				if(this.comprobantetarjeta.getid_sucursal()!=null) {
					this.sucursalBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.sucursalBeanSwingJInternalFrame.setIdActual(this.comprobantetarjeta.getid_sucursal());
					this.sucursalBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.inicializarActualizarBindingTablaSucursal();
				}

				JInternalFrameBase jinternalFrame =this.sucursalBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderComprobanteTarjeta=(TitledBorder)this.jScrollPanelDatosComprobanteTarjeta.getBorder();
				TitledBorder titledBordersucursal=(TitledBorder)this.sucursalBeanSwingJInternalFrame.jScrollPanelDatosSucursal.getBorder();

				titledBordersucursal.setTitle(titledBorderComprobanteTarjeta.getTitle() + " -> Sucursal");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comprobantetarjetaLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comprobantetarjetaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ComprobanteTarjetaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comprobantetarjetaLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_sucursalComprobanteTarjetaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantetarjetaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosComprobanteTarjeta.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualComprobanteTarjeta(this.getcomprobantetarjeta(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysComprobanteTarjeta(this.comprobantetarjeta);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.comprobantetarjeta =(ComprobanteTarjeta) this.comprobantetarjetaLogic.getComprobanteTarjetas().toArray()[this.jTableDatosComprobanteTarjeta.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.comprobantetarjeta =(ComprobanteTarjeta) this.comprobantetarjetas.toArray()[this.jTableDatosComprobanteTarjeta.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.comprobantetarjeta==null) {
						this.comprobantetarjeta = new ComprobanteTarjeta();
					}

					this.setVariablesFormularioToObjetoActualComprobanteTarjeta(this.comprobantetarjeta,true);
					this.setVariablesFormularioToObjetoActualForeignKeysComprobanteTarjeta(this.comprobantetarjeta);
				}

				if(this.comprobantetarjeta.getid_sucursal()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_sucursal = "+this.comprobantetarjeta.getid_sucursal().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingComprobanteTarjeta(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantetarjetaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantetarjetaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ComprobanteTarjetaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantetarjetaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_clienteComprobanteTarjetaUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comprobantetarjetaLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisocliente=true;

			idTienePermisocliente=this.tienePermisosUsuarioEnPaginaWebComprobanteTarjeta(ClienteConstantesFunciones.CLASSNAME);

			if(idTienePermisocliente) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosComprobanteTarjeta.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosComprobanteTarjeta.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosComprobanteTarjeta.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantetarjeta =(ComprobanteTarjeta) this.comprobantetarjetaLogic.getComprobanteTarjetas().toArray()[this.jTableDatosComprobanteTarjeta.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.comprobantetarjeta =(ComprobanteTarjeta) this.comprobantetarjetas.toArray()[this.jTableDatosComprobanteTarjeta.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualComprobanteTarjeta(this.getcomprobantetarjeta(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysComprobanteTarjeta(this.comprobantetarjeta);

				this.clienteBeanSwingJInternalFrame=new ClienteBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.clienteBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.clienteBeanSwingJInternalFrame.getClienteLogic().setConnexion(this.comprobantetarjetaLogic.getConnexion());

				if(this.comprobantetarjeta.getid_cliente()!=null) {
					this.clienteBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.clienteBeanSwingJInternalFrame.setIdActual(this.comprobantetarjeta.getid_cliente());
					this.clienteBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.clienteBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.clienteBeanSwingJInternalFrame.inicializarActualizarBindingTablaCliente();
				}

				JInternalFrameBase jinternalFrame =this.clienteBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderComprobanteTarjeta=(TitledBorder)this.jScrollPanelDatosComprobanteTarjeta.getBorder();
				TitledBorder titledBordercliente=(TitledBorder)this.clienteBeanSwingJInternalFrame.jScrollPanelDatosCliente.getBorder();

				titledBordercliente.setTitle(titledBorderComprobanteTarjeta.getTitle() + " -> Cliente");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comprobantetarjetaLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comprobantetarjetaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ComprobanteTarjetaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comprobantetarjetaLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_clienteComprobanteTarjetaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantetarjetaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosComprobanteTarjeta.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualComprobanteTarjeta(this.getcomprobantetarjeta(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysComprobanteTarjeta(this.comprobantetarjeta);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.comprobantetarjeta =(ComprobanteTarjeta) this.comprobantetarjetaLogic.getComprobanteTarjetas().toArray()[this.jTableDatosComprobanteTarjeta.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.comprobantetarjeta =(ComprobanteTarjeta) this.comprobantetarjetas.toArray()[this.jTableDatosComprobanteTarjeta.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.comprobantetarjeta==null) {
						this.comprobantetarjeta = new ComprobanteTarjeta();
					}

					this.setVariablesFormularioToObjetoActualComprobanteTarjeta(this.comprobantetarjeta,true);
					this.setVariablesFormularioToObjetoActualForeignKeysComprobanteTarjeta(this.comprobantetarjeta);
				}

				if(this.comprobantetarjeta.getid_cliente()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_cliente = "+this.comprobantetarjeta.getid_cliente().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingComprobanteTarjeta(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantetarjetaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantetarjetaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ComprobanteTarjetaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantetarjetaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_cajaComprobanteTarjetaUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comprobantetarjetaLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisocaja=true;

			idTienePermisocaja=this.tienePermisosUsuarioEnPaginaWebComprobanteTarjeta(CajaConstantesFunciones.CLASSNAME);

			if(idTienePermisocaja) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosComprobanteTarjeta.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosComprobanteTarjeta.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosComprobanteTarjeta.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantetarjeta =(ComprobanteTarjeta) this.comprobantetarjetaLogic.getComprobanteTarjetas().toArray()[this.jTableDatosComprobanteTarjeta.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.comprobantetarjeta =(ComprobanteTarjeta) this.comprobantetarjetas.toArray()[this.jTableDatosComprobanteTarjeta.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualComprobanteTarjeta(this.getcomprobantetarjeta(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysComprobanteTarjeta(this.comprobantetarjeta);

				this.cajaBeanSwingJInternalFrame=new CajaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.cajaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.cajaBeanSwingJInternalFrame.getCajaLogic().setConnexion(this.comprobantetarjetaLogic.getConnexion());

				if(this.comprobantetarjeta.getid_caja()!=null) {
					this.cajaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.cajaBeanSwingJInternalFrame.setIdActual(this.comprobantetarjeta.getid_caja());
					this.cajaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.cajaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.cajaBeanSwingJInternalFrame.inicializarActualizarBindingTablaCaja();
				}

				JInternalFrameBase jinternalFrame =this.cajaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderComprobanteTarjeta=(TitledBorder)this.jScrollPanelDatosComprobanteTarjeta.getBorder();
				TitledBorder titledBordercaja=(TitledBorder)this.cajaBeanSwingJInternalFrame.jScrollPanelDatosCaja.getBorder();

				titledBordercaja.setTitle(titledBorderComprobanteTarjeta.getTitle() + " -> Caja");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comprobantetarjetaLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comprobantetarjetaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ComprobanteTarjetaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comprobantetarjetaLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_cajaComprobanteTarjetaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantetarjetaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosComprobanteTarjeta.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualComprobanteTarjeta(this.getcomprobantetarjeta(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysComprobanteTarjeta(this.comprobantetarjeta);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.comprobantetarjeta =(ComprobanteTarjeta) this.comprobantetarjetaLogic.getComprobanteTarjetas().toArray()[this.jTableDatosComprobanteTarjeta.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.comprobantetarjeta =(ComprobanteTarjeta) this.comprobantetarjetas.toArray()[this.jTableDatosComprobanteTarjeta.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.comprobantetarjeta==null) {
						this.comprobantetarjeta = new ComprobanteTarjeta();
					}

					this.setVariablesFormularioToObjetoActualComprobanteTarjeta(this.comprobantetarjeta,true);
					this.setVariablesFormularioToObjetoActualForeignKeysComprobanteTarjeta(this.comprobantetarjeta);
				}

				if(this.comprobantetarjeta.getid_caja()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_caja = "+this.comprobantetarjeta.getid_caja().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingComprobanteTarjeta(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantetarjetaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantetarjetaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ComprobanteTarjetaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantetarjetaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_inicioComprobanteTarjetaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantetarjetaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosComprobanteTarjeta.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualComprobanteTarjeta(this.getcomprobantetarjeta(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysComprobanteTarjeta(this.comprobantetarjeta);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.comprobantetarjeta =(ComprobanteTarjeta) this.comprobantetarjetaLogic.getComprobanteTarjetas().toArray()[this.jTableDatosComprobanteTarjeta.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.comprobantetarjeta =(ComprobanteTarjeta) this.comprobantetarjetas.toArray()[this.jTableDatosComprobanteTarjeta.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.comprobantetarjeta==null) {
						this.comprobantetarjeta = new ComprobanteTarjeta();
					}

					this.setVariablesFormularioToObjetoActualComprobanteTarjeta(this.comprobantetarjeta,true);
					this.setVariablesFormularioToObjetoActualForeignKeysComprobanteTarjeta(this.comprobantetarjeta);
				}

				if(this.comprobantetarjeta.getfecha_inicio()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_inicio = '"+Funciones2.getStringPostgresDate(this.comprobantetarjeta.getfecha_inicio())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingComprobanteTarjeta(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantetarjetaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantetarjetaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ComprobanteTarjetaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantetarjetaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_finComprobanteTarjetaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantetarjetaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosComprobanteTarjeta.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualComprobanteTarjeta(this.getcomprobantetarjeta(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysComprobanteTarjeta(this.comprobantetarjeta);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.comprobantetarjeta =(ComprobanteTarjeta) this.comprobantetarjetaLogic.getComprobanteTarjetas().toArray()[this.jTableDatosComprobanteTarjeta.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.comprobantetarjeta =(ComprobanteTarjeta) this.comprobantetarjetas.toArray()[this.jTableDatosComprobanteTarjeta.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.comprobantetarjeta==null) {
						this.comprobantetarjeta = new ComprobanteTarjeta();
					}

					this.setVariablesFormularioToObjetoActualComprobanteTarjeta(this.comprobantetarjeta,true);
					this.setVariablesFormularioToObjetoActualForeignKeysComprobanteTarjeta(this.comprobantetarjeta);
				}

				if(this.comprobantetarjeta.getfecha_fin()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_fin = '"+Funciones2.getStringPostgresDate(this.comprobantetarjeta.getfecha_fin())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingComprobanteTarjeta(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantetarjetaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantetarjetaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ComprobanteTarjetaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantetarjetaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_cajaComprobanteTarjetaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantetarjetaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosComprobanteTarjeta.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualComprobanteTarjeta(this.getcomprobantetarjeta(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysComprobanteTarjeta(this.comprobantetarjeta);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.comprobantetarjeta =(ComprobanteTarjeta) this.comprobantetarjetaLogic.getComprobanteTarjetas().toArray()[this.jTableDatosComprobanteTarjeta.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.comprobantetarjeta =(ComprobanteTarjeta) this.comprobantetarjetas.toArray()[this.jTableDatosComprobanteTarjeta.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.comprobantetarjeta==null) {
						this.comprobantetarjeta = new ComprobanteTarjeta();
					}

					this.setVariablesFormularioToObjetoActualComprobanteTarjeta(this.comprobantetarjeta,true);
					this.setVariablesFormularioToObjetoActualForeignKeysComprobanteTarjeta(this.comprobantetarjeta);
				}

				if(this.comprobantetarjeta.getnombre_caja()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_caja like '%"+this.comprobantetarjeta.getnombre_caja()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingComprobanteTarjeta(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantetarjetaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantetarjetaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ComprobanteTarjetaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantetarjetaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonsecuencialComprobanteTarjetaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantetarjetaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosComprobanteTarjeta.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualComprobanteTarjeta(this.getcomprobantetarjeta(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysComprobanteTarjeta(this.comprobantetarjeta);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.comprobantetarjeta =(ComprobanteTarjeta) this.comprobantetarjetaLogic.getComprobanteTarjetas().toArray()[this.jTableDatosComprobanteTarjeta.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.comprobantetarjeta =(ComprobanteTarjeta) this.comprobantetarjetas.toArray()[this.jTableDatosComprobanteTarjeta.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.comprobantetarjeta==null) {
						this.comprobantetarjeta = new ComprobanteTarjeta();
					}

					this.setVariablesFormularioToObjetoActualComprobanteTarjeta(this.comprobantetarjeta,true);
					this.setVariablesFormularioToObjetoActualForeignKeysComprobanteTarjeta(this.comprobantetarjeta);
				}

				if(this.comprobantetarjeta.getsecuencial()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where secuencial like '%"+this.comprobantetarjeta.getsecuencial()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingComprobanteTarjeta(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantetarjetaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantetarjetaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ComprobanteTarjetaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantetarjetaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfechaComprobanteTarjetaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantetarjetaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosComprobanteTarjeta.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualComprobanteTarjeta(this.getcomprobantetarjeta(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysComprobanteTarjeta(this.comprobantetarjeta);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.comprobantetarjeta =(ComprobanteTarjeta) this.comprobantetarjetaLogic.getComprobanteTarjetas().toArray()[this.jTableDatosComprobanteTarjeta.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.comprobantetarjeta =(ComprobanteTarjeta) this.comprobantetarjetas.toArray()[this.jTableDatosComprobanteTarjeta.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.comprobantetarjeta==null) {
						this.comprobantetarjeta = new ComprobanteTarjeta();
					}

					this.setVariablesFormularioToObjetoActualComprobanteTarjeta(this.comprobantetarjeta,true);
					this.setVariablesFormularioToObjetoActualForeignKeysComprobanteTarjeta(this.comprobantetarjeta);
				}

				if(this.comprobantetarjeta.getfecha()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha = '"+Funciones2.getStringPostgresDate(this.comprobantetarjeta.getfecha())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingComprobanteTarjeta(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantetarjetaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantetarjetaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ComprobanteTarjetaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantetarjetaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigo_clienteComprobanteTarjetaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantetarjetaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosComprobanteTarjeta.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualComprobanteTarjeta(this.getcomprobantetarjeta(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysComprobanteTarjeta(this.comprobantetarjeta);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.comprobantetarjeta =(ComprobanteTarjeta) this.comprobantetarjetaLogic.getComprobanteTarjetas().toArray()[this.jTableDatosComprobanteTarjeta.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.comprobantetarjeta =(ComprobanteTarjeta) this.comprobantetarjetas.toArray()[this.jTableDatosComprobanteTarjeta.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.comprobantetarjeta==null) {
						this.comprobantetarjeta = new ComprobanteTarjeta();
					}

					this.setVariablesFormularioToObjetoActualComprobanteTarjeta(this.comprobantetarjeta,true);
					this.setVariablesFormularioToObjetoActualForeignKeysComprobanteTarjeta(this.comprobantetarjeta);
				}

				if(this.comprobantetarjeta.getcodigo_cliente()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo_cliente like '%"+this.comprobantetarjeta.getcodigo_cliente()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingComprobanteTarjeta(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantetarjetaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantetarjetaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ComprobanteTarjetaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantetarjetaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_clienteComprobanteTarjetaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantetarjetaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosComprobanteTarjeta.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualComprobanteTarjeta(this.getcomprobantetarjeta(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysComprobanteTarjeta(this.comprobantetarjeta);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.comprobantetarjeta =(ComprobanteTarjeta) this.comprobantetarjetaLogic.getComprobanteTarjetas().toArray()[this.jTableDatosComprobanteTarjeta.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.comprobantetarjeta =(ComprobanteTarjeta) this.comprobantetarjetas.toArray()[this.jTableDatosComprobanteTarjeta.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.comprobantetarjeta==null) {
						this.comprobantetarjeta = new ComprobanteTarjeta();
					}

					this.setVariablesFormularioToObjetoActualComprobanteTarjeta(this.comprobantetarjeta,true);
					this.setVariablesFormularioToObjetoActualForeignKeysComprobanteTarjeta(this.comprobantetarjeta);
				}

				if(this.comprobantetarjeta.getnombre_cliente()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_cliente like '%"+this.comprobantetarjeta.getnombre_cliente()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingComprobanteTarjeta(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantetarjetaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantetarjetaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ComprobanteTarjetaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantetarjetaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonsubtotalComprobanteTarjetaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantetarjetaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosComprobanteTarjeta.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualComprobanteTarjeta(this.getcomprobantetarjeta(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysComprobanteTarjeta(this.comprobantetarjeta);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.comprobantetarjeta =(ComprobanteTarjeta) this.comprobantetarjetaLogic.getComprobanteTarjetas().toArray()[this.jTableDatosComprobanteTarjeta.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.comprobantetarjeta =(ComprobanteTarjeta) this.comprobantetarjetas.toArray()[this.jTableDatosComprobanteTarjeta.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.comprobantetarjeta==null) {
						this.comprobantetarjeta = new ComprobanteTarjeta();
					}

					this.setVariablesFormularioToObjetoActualComprobanteTarjeta(this.comprobantetarjeta,true);
					this.setVariablesFormularioToObjetoActualForeignKeysComprobanteTarjeta(this.comprobantetarjeta);
				}

				if(this.comprobantetarjeta.getsubtotal()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where subtotal = "+this.comprobantetarjeta.getsubtotal().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingComprobanteTarjeta(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantetarjetaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantetarjetaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ComprobanteTarjetaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantetarjetaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonivaComprobanteTarjetaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantetarjetaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosComprobanteTarjeta.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualComprobanteTarjeta(this.getcomprobantetarjeta(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysComprobanteTarjeta(this.comprobantetarjeta);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.comprobantetarjeta =(ComprobanteTarjeta) this.comprobantetarjetaLogic.getComprobanteTarjetas().toArray()[this.jTableDatosComprobanteTarjeta.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.comprobantetarjeta =(ComprobanteTarjeta) this.comprobantetarjetas.toArray()[this.jTableDatosComprobanteTarjeta.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.comprobantetarjeta==null) {
						this.comprobantetarjeta = new ComprobanteTarjeta();
					}

					this.setVariablesFormularioToObjetoActualComprobanteTarjeta(this.comprobantetarjeta,true);
					this.setVariablesFormularioToObjetoActualForeignKeysComprobanteTarjeta(this.comprobantetarjeta);
				}

				if(this.comprobantetarjeta.getiva()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where iva = "+this.comprobantetarjeta.getiva().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingComprobanteTarjeta(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantetarjetaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantetarjetaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ComprobanteTarjetaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantetarjetaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtondescuentoComprobanteTarjetaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantetarjetaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosComprobanteTarjeta.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualComprobanteTarjeta(this.getcomprobantetarjeta(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysComprobanteTarjeta(this.comprobantetarjeta);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.comprobantetarjeta =(ComprobanteTarjeta) this.comprobantetarjetaLogic.getComprobanteTarjetas().toArray()[this.jTableDatosComprobanteTarjeta.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.comprobantetarjeta =(ComprobanteTarjeta) this.comprobantetarjetas.toArray()[this.jTableDatosComprobanteTarjeta.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.comprobantetarjeta==null) {
						this.comprobantetarjeta = new ComprobanteTarjeta();
					}

					this.setVariablesFormularioToObjetoActualComprobanteTarjeta(this.comprobantetarjeta,true);
					this.setVariablesFormularioToObjetoActualForeignKeysComprobanteTarjeta(this.comprobantetarjeta);
				}

				if(this.comprobantetarjeta.getdescuento()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where descuento = "+this.comprobantetarjeta.getdescuento().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingComprobanteTarjeta(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantetarjetaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantetarjetaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ComprobanteTarjetaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantetarjetaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfinanciamientoComprobanteTarjetaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantetarjetaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosComprobanteTarjeta.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualComprobanteTarjeta(this.getcomprobantetarjeta(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysComprobanteTarjeta(this.comprobantetarjeta);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.comprobantetarjeta =(ComprobanteTarjeta) this.comprobantetarjetaLogic.getComprobanteTarjetas().toArray()[this.jTableDatosComprobanteTarjeta.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.comprobantetarjeta =(ComprobanteTarjeta) this.comprobantetarjetas.toArray()[this.jTableDatosComprobanteTarjeta.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.comprobantetarjeta==null) {
						this.comprobantetarjeta = new ComprobanteTarjeta();
					}

					this.setVariablesFormularioToObjetoActualComprobanteTarjeta(this.comprobantetarjeta,true);
					this.setVariablesFormularioToObjetoActualForeignKeysComprobanteTarjeta(this.comprobantetarjeta);
				}

				if(this.comprobantetarjeta.getfinanciamiento()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where financiamiento = "+this.comprobantetarjeta.getfinanciamiento().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingComprobanteTarjeta(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantetarjetaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantetarjetaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ComprobanteTarjetaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantetarjetaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfleteComprobanteTarjetaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantetarjetaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosComprobanteTarjeta.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualComprobanteTarjeta(this.getcomprobantetarjeta(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysComprobanteTarjeta(this.comprobantetarjeta);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.comprobantetarjeta =(ComprobanteTarjeta) this.comprobantetarjetaLogic.getComprobanteTarjetas().toArray()[this.jTableDatosComprobanteTarjeta.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.comprobantetarjeta =(ComprobanteTarjeta) this.comprobantetarjetas.toArray()[this.jTableDatosComprobanteTarjeta.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.comprobantetarjeta==null) {
						this.comprobantetarjeta = new ComprobanteTarjeta();
					}

					this.setVariablesFormularioToObjetoActualComprobanteTarjeta(this.comprobantetarjeta,true);
					this.setVariablesFormularioToObjetoActualForeignKeysComprobanteTarjeta(this.comprobantetarjeta);
				}

				if(this.comprobantetarjeta.getflete()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where flete = "+this.comprobantetarjeta.getflete().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingComprobanteTarjeta(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantetarjetaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantetarjetaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ComprobanteTarjetaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantetarjetaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoniceComprobanteTarjetaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantetarjetaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosComprobanteTarjeta.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualComprobanteTarjeta(this.getcomprobantetarjeta(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysComprobanteTarjeta(this.comprobantetarjeta);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.comprobantetarjeta =(ComprobanteTarjeta) this.comprobantetarjetaLogic.getComprobanteTarjetas().toArray()[this.jTableDatosComprobanteTarjeta.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.comprobantetarjeta =(ComprobanteTarjeta) this.comprobantetarjetas.toArray()[this.jTableDatosComprobanteTarjeta.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.comprobantetarjeta==null) {
						this.comprobantetarjeta = new ComprobanteTarjeta();
					}

					this.setVariablesFormularioToObjetoActualComprobanteTarjeta(this.comprobantetarjeta,true);
					this.setVariablesFormularioToObjetoActualForeignKeysComprobanteTarjeta(this.comprobantetarjeta);
				}

				if(this.comprobantetarjeta.getice()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where ice = "+this.comprobantetarjeta.getice().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingComprobanteTarjeta(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantetarjetaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantetarjetaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ComprobanteTarjetaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantetarjetaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtontotalComprobanteTarjetaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantetarjetaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosComprobanteTarjeta.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualComprobanteTarjeta(this.getcomprobantetarjeta(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysComprobanteTarjeta(this.comprobantetarjeta);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.comprobantetarjeta =(ComprobanteTarjeta) this.comprobantetarjetaLogic.getComprobanteTarjetas().toArray()[this.jTableDatosComprobanteTarjeta.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.comprobantetarjeta =(ComprobanteTarjeta) this.comprobantetarjetas.toArray()[this.jTableDatosComprobanteTarjeta.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.comprobantetarjeta==null) {
						this.comprobantetarjeta = new ComprobanteTarjeta();
					}

					this.setVariablesFormularioToObjetoActualComprobanteTarjeta(this.comprobantetarjeta,true);
					this.setVariablesFormularioToObjetoActualForeignKeysComprobanteTarjeta(this.comprobantetarjeta);
				}

				if(this.comprobantetarjeta.gettotal()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where total = "+this.comprobantetarjeta.gettotal().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingComprobanteTarjeta(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantetarjetaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantetarjetaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ComprobanteTarjetaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantetarjetaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonvalorComprobanteTarjetaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantetarjetaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosComprobanteTarjeta.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualComprobanteTarjeta(this.getcomprobantetarjeta(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysComprobanteTarjeta(this.comprobantetarjeta);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.comprobantetarjeta =(ComprobanteTarjeta) this.comprobantetarjetaLogic.getComprobanteTarjetas().toArray()[this.jTableDatosComprobanteTarjeta.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.comprobantetarjeta =(ComprobanteTarjeta) this.comprobantetarjetas.toArray()[this.jTableDatosComprobanteTarjeta.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.comprobantetarjeta==null) {
						this.comprobantetarjeta = new ComprobanteTarjeta();
					}

					this.setVariablesFormularioToObjetoActualComprobanteTarjeta(this.comprobantetarjeta,true);
					this.setVariablesFormularioToObjetoActualForeignKeysComprobanteTarjeta(this.comprobantetarjeta);
				}

				if(this.comprobantetarjeta.getvalor()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where valor = "+this.comprobantetarjeta.getvalor().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingComprobanteTarjeta(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantetarjetaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantetarjetaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ComprobanteTarjetaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantetarjetaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_forma_pagoComprobanteTarjetaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantetarjetaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosComprobanteTarjeta.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualComprobanteTarjeta(this.getcomprobantetarjeta(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysComprobanteTarjeta(this.comprobantetarjeta);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.comprobantetarjeta =(ComprobanteTarjeta) this.comprobantetarjetaLogic.getComprobanteTarjetas().toArray()[this.jTableDatosComprobanteTarjeta.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.comprobantetarjeta =(ComprobanteTarjeta) this.comprobantetarjetas.toArray()[this.jTableDatosComprobanteTarjeta.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.comprobantetarjeta==null) {
						this.comprobantetarjeta = new ComprobanteTarjeta();
					}

					this.setVariablesFormularioToObjetoActualComprobanteTarjeta(this.comprobantetarjeta,true);
					this.setVariablesFormularioToObjetoActualForeignKeysComprobanteTarjeta(this.comprobantetarjeta);
				}

				if(this.comprobantetarjeta.getfecha_forma_pago()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_forma_pago = '"+Funciones2.getStringPostgresDate(this.comprobantetarjeta.getfecha_forma_pago())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingComprobanteTarjeta(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantetarjetaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantetarjetaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ComprobanteTarjetaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantetarjetaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnumeroComprobanteTarjetaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantetarjetaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosComprobanteTarjeta.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualComprobanteTarjeta(this.getcomprobantetarjeta(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysComprobanteTarjeta(this.comprobantetarjeta);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.comprobantetarjeta =(ComprobanteTarjeta) this.comprobantetarjetaLogic.getComprobanteTarjetas().toArray()[this.jTableDatosComprobanteTarjeta.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.comprobantetarjeta =(ComprobanteTarjeta) this.comprobantetarjetas.toArray()[this.jTableDatosComprobanteTarjeta.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.comprobantetarjeta==null) {
						this.comprobantetarjeta = new ComprobanteTarjeta();
					}

					this.setVariablesFormularioToObjetoActualComprobanteTarjeta(this.comprobantetarjeta,true);
					this.setVariablesFormularioToObjetoActualForeignKeysComprobanteTarjeta(this.comprobantetarjeta);
				}

				if(this.comprobantetarjeta.getnumero()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where numero like '%"+this.comprobantetarjeta.getnumero()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingComprobanteTarjeta(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantetarjetaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantetarjetaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ComprobanteTarjetaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantetarjetaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtontarjeta_habienteComprobanteTarjetaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantetarjetaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosComprobanteTarjeta.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualComprobanteTarjeta(this.getcomprobantetarjeta(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysComprobanteTarjeta(this.comprobantetarjeta);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.comprobantetarjeta =(ComprobanteTarjeta) this.comprobantetarjetaLogic.getComprobanteTarjetas().toArray()[this.jTableDatosComprobanteTarjeta.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.comprobantetarjeta =(ComprobanteTarjeta) this.comprobantetarjetas.toArray()[this.jTableDatosComprobanteTarjeta.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.comprobantetarjeta==null) {
						this.comprobantetarjeta = new ComprobanteTarjeta();
					}

					this.setVariablesFormularioToObjetoActualComprobanteTarjeta(this.comprobantetarjeta,true);
					this.setVariablesFormularioToObjetoActualForeignKeysComprobanteTarjeta(this.comprobantetarjeta);
				}

				if(this.comprobantetarjeta.gettarjeta_habiente()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where tarjeta_habiente like '%"+this.comprobantetarjeta.gettarjeta_habiente()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingComprobanteTarjeta(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantetarjetaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantetarjetaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ComprobanteTarjetaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantetarjetaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonautorizacionComprobanteTarjetaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantetarjetaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosComprobanteTarjeta.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualComprobanteTarjeta(this.getcomprobantetarjeta(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysComprobanteTarjeta(this.comprobantetarjeta);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.comprobantetarjeta =(ComprobanteTarjeta) this.comprobantetarjetaLogic.getComprobanteTarjetas().toArray()[this.jTableDatosComprobanteTarjeta.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.comprobantetarjeta =(ComprobanteTarjeta) this.comprobantetarjetas.toArray()[this.jTableDatosComprobanteTarjeta.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.comprobantetarjeta==null) {
						this.comprobantetarjeta = new ComprobanteTarjeta();
					}

					this.setVariablesFormularioToObjetoActualComprobanteTarjeta(this.comprobantetarjeta,true);
					this.setVariablesFormularioToObjetoActualForeignKeysComprobanteTarjeta(this.comprobantetarjeta);
				}

				if(this.comprobantetarjeta.getautorizacion()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where autorizacion like '%"+this.comprobantetarjeta.getautorizacion()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingComprobanteTarjeta(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantetarjetaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantetarjetaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ComprobanteTarjetaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantetarjetaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonvoucherComprobanteTarjetaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantetarjetaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosComprobanteTarjeta.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualComprobanteTarjeta(this.getcomprobantetarjeta(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysComprobanteTarjeta(this.comprobantetarjeta);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.comprobantetarjeta =(ComprobanteTarjeta) this.comprobantetarjetaLogic.getComprobanteTarjetas().toArray()[this.jTableDatosComprobanteTarjeta.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.comprobantetarjeta =(ComprobanteTarjeta) this.comprobantetarjetas.toArray()[this.jTableDatosComprobanteTarjeta.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.comprobantetarjeta==null) {
						this.comprobantetarjeta = new ComprobanteTarjeta();
					}

					this.setVariablesFormularioToObjetoActualComprobanteTarjeta(this.comprobantetarjeta,true);
					this.setVariablesFormularioToObjetoActualForeignKeysComprobanteTarjeta(this.comprobantetarjeta);
				}

				if(this.comprobantetarjeta.getvoucher()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where voucher like '%"+this.comprobantetarjeta.getvoucher()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingComprobanteTarjeta(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantetarjetaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantetarjetaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ComprobanteTarjetaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantetarjetaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonloteComprobanteTarjetaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantetarjetaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosComprobanteTarjeta.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualComprobanteTarjeta(this.getcomprobantetarjeta(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysComprobanteTarjeta(this.comprobantetarjeta);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.comprobantetarjeta =(ComprobanteTarjeta) this.comprobantetarjetaLogic.getComprobanteTarjetas().toArray()[this.jTableDatosComprobanteTarjeta.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.comprobantetarjeta =(ComprobanteTarjeta) this.comprobantetarjetas.toArray()[this.jTableDatosComprobanteTarjeta.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.comprobantetarjeta==null) {
						this.comprobantetarjeta = new ComprobanteTarjeta();
					}

					this.setVariablesFormularioToObjetoActualComprobanteTarjeta(this.comprobantetarjeta,true);
					this.setVariablesFormularioToObjetoActualForeignKeysComprobanteTarjeta(this.comprobantetarjeta);
				}

				if(this.comprobantetarjeta.getlote()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where lote like '%"+this.comprobantetarjeta.getlote()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingComprobanteTarjeta(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantetarjetaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantetarjetaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ComprobanteTarjetaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantetarjetaLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonBusquedaComprobanteTarjetaComprobanteTarjetaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comprobantetarjetaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingComprobanteTarjeta(false,false);

			this.getComprobanteTarjetasBusquedaComprobanteTarjeta();

			this.inicializarActualizarBindingComprobanteTarjeta(false);

			//if(ComprobanteTarjetaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingComprobanteTarjeta(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comprobantetarjetaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comprobantetarjetaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ComprobanteTarjetaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comprobantetarjetaLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdCajaComprobanteTarjetaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comprobantetarjetaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingComprobanteTarjeta(false,false);

			this.getComprobanteTarjetasFK_IdCaja();

			this.inicializarActualizarBindingComprobanteTarjeta(false);

			//if(ComprobanteTarjetaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingComprobanteTarjeta(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comprobantetarjetaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comprobantetarjetaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ComprobanteTarjetaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comprobantetarjetaLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdClienteComprobanteTarjetaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comprobantetarjetaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingComprobanteTarjeta(false,false);

			this.getComprobanteTarjetasFK_IdCliente();

			this.inicializarActualizarBindingComprobanteTarjeta(false);

			//if(ComprobanteTarjetaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingComprobanteTarjeta(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comprobantetarjetaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comprobantetarjetaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ComprobanteTarjetaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comprobantetarjetaLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaComprobanteTarjetaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comprobantetarjetaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingComprobanteTarjeta(false,false);

			this.getComprobanteTarjetasFK_IdEmpresa();

			this.inicializarActualizarBindingComprobanteTarjeta(false);

			//if(ComprobanteTarjetaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingComprobanteTarjeta(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comprobantetarjetaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comprobantetarjetaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ComprobanteTarjetaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comprobantetarjetaLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdSucursalComprobanteTarjetaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comprobantetarjetaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingComprobanteTarjeta(false,false);

			this.getComprobanteTarjetasFK_IdSucursal();

			this.inicializarActualizarBindingComprobanteTarjeta(false);

			//if(ComprobanteTarjetaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingComprobanteTarjeta(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comprobantetarjetaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comprobantetarjetaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ComprobanteTarjetaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comprobantetarjetaLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameComprobanteTarjeta() {
		if(this.jInternalFrameDetalleFormComprobanteTarjeta!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormComprobanteTarjeta!=null) {
			this.jInternalFrameDetalleFormComprobanteTarjeta.setVisible(false);	    			
			this.jInternalFrameDetalleFormComprobanteTarjeta.dispose();
			this.jInternalFrameDetalleFormComprobanteTarjeta=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoComprobanteTarjeta!=null) {
			this.jInternalFrameReporteDinamicoComprobanteTarjeta.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoComprobanteTarjeta.dispose();
			this.jInternalFrameReporteDinamicoComprobanteTarjeta=null;
		}
		
		if(this.jInternalFrameImportacionComprobanteTarjeta!=null) {
			this.jInternalFrameImportacionComprobanteTarjeta.setVisible(false);	    			
			this.jInternalFrameImportacionComprobanteTarjeta.dispose();
			this.jInternalFrameImportacionComprobanteTarjeta=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessComprobanteTarjeta();
			
			ComprobanteTarjetaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.comprobantetarjeta,new Object(),this.comprobantetarjetaParameterGeneral,this.comprobantetarjetaReturnGeneral);
			
			
			if(sTipo.equals("NuevoComprobanteTarjeta")) {
				jButtonNuevoComprobanteTarjetaActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarComprobanteTarjeta")) {
				jButtonDuplicarComprobanteTarjetaActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarComprobanteTarjeta")) {
				jButtonCopiarComprobanteTarjetaActionPerformed(evt);
			} else if(sTipo.equals("VerFormComprobanteTarjeta")) {
				jButtonVerFormComprobanteTarjetaActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarComprobanteTarjeta")) {
				jButtonNuevoComprobanteTarjetaActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarComprobanteTarjeta")) {
				jButtonDuplicarComprobanteTarjetaActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoComprobanteTarjeta")) {
				jButtonNuevoComprobanteTarjetaActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarComprobanteTarjeta")) {
				jButtonDuplicarComprobanteTarjetaActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesComprobanteTarjeta")) {
				jButtonNuevoComprobanteTarjetaActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarComprobanteTarjeta")) {
				jButtonNuevoComprobanteTarjetaActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesComprobanteTarjeta")) {
				jButtonNuevoComprobanteTarjetaActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarComprobanteTarjeta")) {
				jButtonModificarComprobanteTarjetaActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarComprobanteTarjeta")) {
				jButtonModificarComprobanteTarjetaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarComprobanteTarjeta")) {
				jButtonModificarComprobanteTarjetaActionPerformed(evt);
			} else if(sTipo.equals("ActualizarComprobanteTarjeta")) {
				jButtonActualizarComprobanteTarjetaActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarComprobanteTarjeta")) {
				jButtonActualizarComprobanteTarjetaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarComprobanteTarjeta")) {
				jButtonActualizarComprobanteTarjetaActionPerformed(evt);
			} else if(sTipo.equals("EliminarComprobanteTarjeta")) {
				jButtonEliminarComprobanteTarjetaActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarComprobanteTarjeta")) {
				jButtonEliminarComprobanteTarjetaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarComprobanteTarjeta")) {
				jButtonEliminarComprobanteTarjetaActionPerformed(evt);
			} else if(sTipo.equals("CancelarComprobanteTarjeta")) {
				jButtonCancelarComprobanteTarjetaActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarComprobanteTarjeta")) {
				jButtonCancelarComprobanteTarjetaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarComprobanteTarjeta")) {
				jButtonCancelarComprobanteTarjetaActionPerformed(evt);
			} else if(sTipo.equals("CerrarComprobanteTarjeta")) {
				jButtonCerrarComprobanteTarjetaActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarComprobanteTarjeta")) {
				jButtonCerrarComprobanteTarjetaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarComprobanteTarjeta")) {
				jButtonCerrarComprobanteTarjetaActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarComprobanteTarjeta")) {
				jButtonMostrarOcultarComprobanteTarjetaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarComprobanteTarjeta")) {
				jButtonCancelarComprobanteTarjetaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosComprobanteTarjeta")) {
				jButtonGuardarCambiosComprobanteTarjetaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarComprobanteTarjeta")) {
				jButtonGuardarCambiosComprobanteTarjetaActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarComprobanteTarjeta")) {
				jButtonCopiarComprobanteTarjetaActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarComprobanteTarjeta")) {
				jButtonVerFormComprobanteTarjetaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosComprobanteTarjeta")) {
				jButtonGuardarCambiosComprobanteTarjetaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarComprobanteTarjeta")) {
				jButtonCopiarComprobanteTarjetaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormComprobanteTarjeta")) {
				jButtonVerFormComprobanteTarjetaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaComprobanteTarjeta")) {
				jButtonGuardarCambiosComprobanteTarjetaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarComprobanteTarjeta")) {
				jButtonGuardarCambiosComprobanteTarjetaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaComprobanteTarjeta")) {
				jButtonGuardarCambiosComprobanteTarjetaActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionComprobanteTarjeta")) {
				jButtonRecargarInformacionComprobanteTarjetaActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarComprobanteTarjeta")) {
				jButtonRecargarInformacionComprobanteTarjetaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionComprobanteTarjeta")) {
				jButtonRecargarInformacionComprobanteTarjetaActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresComprobanteTarjeta")) {
				jButtonAnterioresComprobanteTarjetaActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarComprobanteTarjeta")) {
				jButtonAnterioresComprobanteTarjetaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreComprobanteTarjeta")) {
				jButtonAnterioresComprobanteTarjetaActionPerformed(evt);
			} else if(sTipo.equals("SiguientesComprobanteTarjeta")) {
				jButtonSiguientesComprobanteTarjetaActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarComprobanteTarjeta")) {
				jButtonSiguientesComprobanteTarjetaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesComprobanteTarjeta")) {
				jButtonSiguientesComprobanteTarjetaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByComprobanteTarjeta") || sTipo.equals("MenuItemDetalleAbrirOrderByComprobanteTarjeta")) {
				jButtonAbrirOrderByComprobanteTarjetaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarComprobanteTarjeta") || sTipo.equals("MenuItemDetalleMostrarOcultarComprobanteTarjeta")) {
				jButtonMostrarOcultarComprobanteTarjetaActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosComprobanteTarjeta")) {
				jButtonNuevoGuardarCambiosComprobanteTarjetaActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarComprobanteTarjeta")) {
				jButtonNuevoGuardarCambiosComprobanteTarjetaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosComprobanteTarjeta")) {
				jButtonNuevoGuardarCambiosComprobanteTarjetaActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoComprobanteTarjeta")) {
				jButtonCerrarReporteDinamicoComprobanteTarjetaActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoComprobanteTarjeta")) {
				jButtonGenerarReporteDinamicoComprobanteTarjetaActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoComprobanteTarjeta")) {
				
				jButtonGenerarExcelReporteDinamicoComprobanteTarjetaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionComprobanteTarjeta")) {
				jButtonCerrarImportacionComprobanteTarjetaActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionComprobanteTarjeta")) {
				
				jButtonGenerarImportacionComprobanteTarjetaActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionComprobanteTarjeta")) {
				
				jButtonAbrirImportacionComprobanteTarjetaActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesComprobanteTarjeta")) {
				jComboBoxTiposAccionesComprobanteTarjetaActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesComprobanteTarjeta")) {
				jComboBoxTiposRelacionesComprobanteTarjetaActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioComprobanteTarjeta")) {
				jComboBoxTiposAccionesComprobanteTarjetaActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarComprobanteTarjeta")) {
				
				jComboBoxTiposSeleccionarComprobanteTarjetaActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralComprobanteTarjeta")) {
				jTextFieldValorCampoGeneralComprobanteTarjetaActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByComprobanteTarjeta")) {
				jButtonAbrirOrderByComprobanteTarjetaActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarComprobanteTarjeta")) {
				jButtonAbrirOrderByComprobanteTarjetaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByComprobanteTarjeta")) {
				jButtonCerrarOrderByComprobanteTarjetaActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idComprobanteTarjetaBusqueda")) {
				this.jButtonidComprobanteTarjetaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaComprobanteTarjetaUpdate")) {
				this.jButtonid_empresaComprobanteTarjetaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaComprobanteTarjetaBusqueda")) {
				this.jButtonid_empresaComprobanteTarjetaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalComprobanteTarjetaUpdate")) {
				this.jButtonid_sucursalComprobanteTarjetaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalComprobanteTarjetaBusqueda")) {
				this.jButtonid_sucursalComprobanteTarjetaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_clienteComprobanteTarjetaUpdate")) {
				this.jButtonid_clienteComprobanteTarjetaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_clienteComprobanteTarjetaBusqueda")) {
				this.jButtonid_clienteComprobanteTarjetaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_cajaComprobanteTarjetaUpdate")) {
				this.jButtonid_cajaComprobanteTarjetaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_cajaComprobanteTarjetaBusqueda")) {
				this.jButtonid_cajaComprobanteTarjetaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_inicioComprobanteTarjetaBusqueda")) {
				this.jButtonfecha_inicioComprobanteTarjetaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_finComprobanteTarjetaBusqueda")) {
				this.jButtonfecha_finComprobanteTarjetaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_cajaComprobanteTarjetaBusqueda")) {
				this.jButtonnombre_cajaComprobanteTarjetaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("secuencialComprobanteTarjetaBusqueda")) {
				this.jButtonsecuencialComprobanteTarjetaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fechaComprobanteTarjetaBusqueda")) {
				this.jButtonfechaComprobanteTarjetaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigo_clienteComprobanteTarjetaBusqueda")) {
				this.jButtoncodigo_clienteComprobanteTarjetaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_clienteComprobanteTarjetaBusqueda")) {
				this.jButtonnombre_clienteComprobanteTarjetaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("subtotalComprobanteTarjetaBusqueda")) {
				this.jButtonsubtotalComprobanteTarjetaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("ivaComprobanteTarjetaBusqueda")) {
				this.jButtonivaComprobanteTarjetaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descuentoComprobanteTarjetaBusqueda")) {
				this.jButtondescuentoComprobanteTarjetaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("financiamientoComprobanteTarjetaBusqueda")) {
				this.jButtonfinanciamientoComprobanteTarjetaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fleteComprobanteTarjetaBusqueda")) {
				this.jButtonfleteComprobanteTarjetaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("iceComprobanteTarjetaBusqueda")) {
				this.jButtoniceComprobanteTarjetaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("totalComprobanteTarjetaBusqueda")) {
				this.jButtontotalComprobanteTarjetaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("valorComprobanteTarjetaBusqueda")) {
				this.jButtonvalorComprobanteTarjetaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_forma_pagoComprobanteTarjetaBusqueda")) {
				this.jButtonfecha_forma_pagoComprobanteTarjetaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numeroComprobanteTarjetaBusqueda")) {
				this.jButtonnumeroComprobanteTarjetaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("tarjeta_habienteComprobanteTarjetaBusqueda")) {
				this.jButtontarjeta_habienteComprobanteTarjetaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("autorizacionComprobanteTarjetaBusqueda")) {
				this.jButtonautorizacionComprobanteTarjetaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("voucherComprobanteTarjetaBusqueda")) {
				this.jButtonvoucherComprobanteTarjetaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("loteComprobanteTarjetaBusqueda")) {
				this.jButtonloteComprobanteTarjetaBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("BusquedaComprobanteTarjetaComprobanteTarjeta")) {
				this.jButtonBusquedaComprobanteTarjetaComprobanteTarjetaActionPerformed(evt);
			}
			
			;
			
			
			ComprobanteTarjetaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.comprobantetarjeta,new Object(),this.comprobantetarjetaParameterGeneral,this.comprobantetarjetaReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComprobanteTarjetaConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessComprobanteTarjeta();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaComprobanteTarjetaActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.comprobantetarjeta);
				
				this.actualizarInformacion("INFO_PADRE",false,this.comprobantetarjeta);
				
				ComprobanteTarjetaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.comprobantetarjeta,new Object(),this.comprobantetarjetaParameterGeneral,this.comprobantetarjetaReturnGeneral);
				
				


				
				ComprobanteTarjetaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.comprobantetarjeta,new Object(),this.comprobantetarjetaParameterGeneral,this.comprobantetarjetaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ComprobanteTarjeta.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ComprobanteTarjeta.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,ComprobanteTarjetaConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			ComprobanteTarjeta comprobantetarjetaLocal=null;
			
			if(!this.getEsControlTabla()) {
				comprobantetarjetaLocal=this.comprobantetarjeta;
			} else {
				comprobantetarjetaLocal=this.comprobantetarjetaAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComprobanteTarjetaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.comprobantetarjeta);
				
				this.actualizarInformacion("INFO_PADRE",false,this.comprobantetarjeta);
				
				ComprobanteTarjetaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.comprobantetarjeta,new Object(),this.comprobantetarjetaParameterGeneral,this.comprobantetarjetaReturnGeneral);
							
				
				


				
				ComprobanteTarjetaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.comprobantetarjeta,new Object(),this.comprobantetarjetaParameterGeneral,this.comprobantetarjetaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ComprobanteTarjeta.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ComprobanteTarjeta.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComprobanteTarjetaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaComprobanteTarjetaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosComprobanteTarjeta.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantetarjetaAnterior =(ComprobanteTarjeta) this.comprobantetarjetaLogic.getComprobanteTarjetas().toArray()[this.jTableDatosComprobanteTarjeta.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.comprobantetarjetaAnterior =(ComprobanteTarjeta) this.comprobantetarjetas.toArray()[this.jTableDatosComprobanteTarjeta.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComprobanteTarjetaConstantesFunciones.CLASSNAME);
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
			
			ComprobanteTarjetaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.comprobantetarjeta,new Object(),this.comprobantetarjetaParameterGeneral,this.comprobantetarjetaReturnGeneral);
			
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
			
			


			
			ComprobanteTarjetaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.comprobantetarjeta,new Object(),this.comprobantetarjetaParameterGeneral,this.comprobantetarjetaReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComprobanteTarjetaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComprobanteTarjetaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComprobanteTarjetaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaComprobanteTarjetaActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.comprobantetarjeta);
				
				this.actualizarInformacion("INFO_PADRE",false,this.comprobantetarjeta);
				
				ComprobanteTarjetaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.comprobantetarjeta,new Object(),this.comprobantetarjetaParameterGeneral,this.comprobantetarjetaReturnGeneral);
								
						
				


				
				ComprobanteTarjetaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.comprobantetarjeta,new Object(),this.comprobantetarjetaParameterGeneral,this.comprobantetarjetaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ComprobanteTarjeta.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ComprobanteTarjeta.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComprobanteTarjetaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.comprobantetarjeta);
				
				this.actualizarInformacion("INFO_PADRE",false,this.comprobantetarjeta);
				
				ComprobanteTarjetaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.comprobantetarjeta,new Object(),this.comprobantetarjetaParameterGeneral,this.comprobantetarjetaReturnGeneral);
								
				
				


				
				ComprobanteTarjetaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.comprobantetarjeta,new Object(),this.comprobantetarjetaParameterGeneral,this.comprobantetarjetaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ComprobanteTarjeta.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ComprobanteTarjeta.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComprobanteTarjetaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaComprobanteTarjetaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosComprobanteTarjeta.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantetarjetaAnterior =(ComprobanteTarjeta) this.comprobantetarjetaLogic.getComprobanteTarjetas().toArray()[this.jTableDatosComprobanteTarjeta.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.comprobantetarjetaAnterior =(ComprobanteTarjeta) this.comprobantetarjetas.toArray()[this.jTableDatosComprobanteTarjeta.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComprobanteTarjetaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.comprobantetarjeta);
				
				this.actualizarInformacion("INFO_PADRE",false,this.comprobantetarjeta);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComprobanteTarjetaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaComprobanteTarjetaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosComprobanteTarjeta.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantetarjetaAnterior =(ComprobanteTarjeta) this.comprobantetarjetaLogic.getComprobanteTarjetas().toArray()[this.jTableDatosComprobanteTarjeta.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.comprobantetarjetaAnterior =(ComprobanteTarjeta) this.comprobantetarjetas.toArray()[this.jTableDatosComprobanteTarjeta.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComprobanteTarjetaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaComprobanteTarjetaActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.comprobantetarjeta);
			
			this.actualizarInformacion("INFO_PADRE",false,this.comprobantetarjeta);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComprobanteTarjetaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.comprobantetarjeta);
				
				this.actualizarInformacion("INFO_PADRE",false,this.comprobantetarjeta);
				
				ComprobanteTarjetaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.comprobantetarjeta,new Object(),this.comprobantetarjetaParameterGeneral,this.comprobantetarjetaReturnGeneral);
							
				
				


				
				ComprobanteTarjetaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.comprobantetarjeta,new Object(),this.comprobantetarjetaParameterGeneral,this.comprobantetarjetaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ComprobanteTarjeta.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ComprobanteTarjeta.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComprobanteTarjetaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaComprobanteTarjetaActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosComprobanteTarjeta.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.comprobantetarjetaAnterior =(ComprobanteTarjeta) this.comprobantetarjetaLogic.getComprobanteTarjetas().toArray()[this.jTableDatosComprobanteTarjeta.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.comprobantetarjetaAnterior =(ComprobanteTarjeta) this.comprobantetarjetas.toArray()[this.jTableDatosComprobanteTarjeta.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComprobanteTarjetaConstantesFunciones.CLASSNAME);
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
			
			ComprobanteTarjetaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.comprobantetarjeta,new Object(),this.comprobantetarjetaParameterGeneral,this.comprobantetarjetaReturnGeneral);
			
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
			
			


			
			ComprobanteTarjetaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.comprobantetarjeta,new Object(),this.comprobantetarjetaParameterGeneral,this.comprobantetarjetaReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComprobanteTarjetaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComprobanteTarjetaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComprobanteTarjetaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaComprobanteTarjetaActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.comprobantetarjeta);
			
			this.actualizarInformacion("INFO_PADRE",false,this.comprobantetarjeta);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComprobanteTarjetaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.comprobantetarjeta);
				
				this.actualizarInformacion("INFO_PADRE",false,this.comprobantetarjeta);
				
				ComprobanteTarjetaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.comprobantetarjeta,new Object(),this.comprobantetarjetaParameterGeneral,this.comprobantetarjetaReturnGeneral);
								
				
				


				
				ComprobanteTarjetaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.comprobantetarjeta,new Object(),this.comprobantetarjetaParameterGeneral,this.comprobantetarjetaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ComprobanteTarjeta.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ComprobanteTarjeta.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComprobanteTarjetaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaComprobanteTarjetaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosComprobanteTarjeta.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantetarjetaAnterior =(ComprobanteTarjeta) this.comprobantetarjetaLogic.getComprobanteTarjetas().toArray()[this.jTableDatosComprobanteTarjeta.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.comprobantetarjetaAnterior =(ComprobanteTarjeta) this.comprobantetarjetas.toArray()[this.jTableDatosComprobanteTarjeta.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComprobanteTarjetaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaComprobanteTarjetaActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.comprobantetarjeta);
			
			this.actualizarInformacion("INFO_PADRE",false,this.comprobantetarjeta);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComprobanteTarjetaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaComprobanteTarjetaActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.comprobantetarjeta);
				
				this.actualizarInformacion("INFO_PADRE",false,this.comprobantetarjeta);
				
				ComprobanteTarjetaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.comprobantetarjeta,new Object(),this.comprobantetarjetaParameterGeneral,this.comprobantetarjetaReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosComprobanteTarjeta")) {
					jCheckBoxSeleccionarTodosComprobanteTarjetaItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosComprobanteTarjeta")) {
					jCheckBoxSeleccionadosComprobanteTarjetaItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarComprobanteTarjeta")) {
					
				}
				
				


				
				
				ComprobanteTarjetaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.comprobantetarjeta,new Object(),this.comprobantetarjetaParameterGeneral,this.comprobantetarjetaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ComprobanteTarjeta.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ComprobanteTarjeta.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComprobanteTarjetaConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.comprobantetarjeta);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.comprobantetarjeta);
				
				ComprobanteTarjetaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.comprobantetarjeta,new Object(),this.comprobantetarjetaParameterGeneral,this.comprobantetarjetaReturnGeneral);
												
				
				


				
				
				ComprobanteTarjetaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.comprobantetarjeta,new Object(),this.comprobantetarjetaParameterGeneral,this.comprobantetarjetaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ComprobanteTarjeta.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ComprobanteTarjeta.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComprobanteTarjetaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaComprobanteTarjetaActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosComprobanteTarjeta.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.comprobantetarjetaAnterior =(ComprobanteTarjeta) this.comprobantetarjetaLogic.getComprobanteTarjetas().toArray()[this.jTableDatosComprobanteTarjeta.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.comprobantetarjetaAnterior =(ComprobanteTarjeta) this.comprobantetarjetas.toArray()[this.jTableDatosComprobanteTarjeta.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComprobanteTarjetaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaComprobanteTarjetaActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.comprobantetarjeta);
				
				this.actualizarInformacion("INFO_PADRE",false,this.comprobantetarjeta);
				
				ComprobanteTarjetaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.comprobantetarjeta,new Object(),this.comprobantetarjetaParameterGeneral,this.comprobantetarjetaReturnGeneral);
				
				
				ComprobanteTarjetaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.comprobantetarjeta,new Object(),this.comprobantetarjetaParameterGeneral,this.comprobantetarjetaReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComprobanteTarjetaConstantesFunciones.CLASSNAME);
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
			
			ComprobanteTarjetaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.comprobantetarjeta,new Object(),this.comprobantetarjetaParameterGeneral,this.comprobantetarjetaReturnGeneral);
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
			
			


			
			ComprobanteTarjetaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.comprobantetarjeta,new Object(),this.comprobantetarjetaParameterGeneral,this.comprobantetarjetaReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComprobanteTarjetaConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaComprobanteTarjetaActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.comprobantetarjeta);
				
				this.actualizarInformacion("INFO_PADRE",false,this.comprobantetarjeta);
				
				ComprobanteTarjetaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.comprobantetarjeta,new Object(),this.comprobantetarjetaParameterGeneral,this.comprobantetarjetaReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				ComprobanteTarjetaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.comprobantetarjeta,new Object(),this.comprobantetarjetaParameterGeneral,this.comprobantetarjetaReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ComprobanteTarjeta.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ComprobanteTarjeta.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComprobanteTarjetaConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.comprobantetarjeta);
				
				this.actualizarInformacion("INFO_PADRE",false,this.comprobantetarjeta);
				
				ComprobanteTarjetaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.comprobantetarjeta,new Object(),this.comprobantetarjetaParameterGeneral,this.comprobantetarjetaReturnGeneral);
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
				
				


				
				ComprobanteTarjetaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.comprobantetarjeta,new Object(),this.comprobantetarjetaParameterGeneral,this.comprobantetarjetaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ComprobanteTarjeta.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ComprobanteTarjeta.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComprobanteTarjetaConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaComprobanteTarjetaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosComprobanteTarjeta.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantetarjetaAnterior =(ComprobanteTarjeta) this.comprobantetarjetaLogic.getComprobanteTarjetas().toArray()[this.jTableDatosComprobanteTarjeta.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.comprobantetarjetaAnterior =(ComprobanteTarjeta) this.comprobantetarjetas.toArray()[this.jTableDatosComprobanteTarjeta.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComprobanteTarjetaConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				ComprobanteTarjetaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.comprobantetarjeta,new Object(),this.comprobantetarjetaParameterGeneral,this.comprobantetarjetaReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarComprobanteTarjeta")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosComprobanteTarjetaListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosComprobanteTarjeta.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.comprobantetarjeta =(ComprobanteTarjeta) this.comprobantetarjetaLogic.getComprobanteTarjetas().toArray()[this.jTableDatosComprobanteTarjeta.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.comprobantetarjeta =(ComprobanteTarjeta) this.comprobantetarjetas.toArray()[this.jTableDatosComprobanteTarjeta.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.comprobantetarjeta);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarComprobanteTarjeta")) {
				
				}
				
				ComprobanteTarjetaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.comprobantetarjeta,new Object(),this.comprobantetarjetaParameterGeneral,this.comprobantetarjetaReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComprobanteTarjetaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			ComprobanteTarjetaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.comprobantetarjeta,new Object(),this.comprobantetarjetaParameterGeneral,this.comprobantetarjetaReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarComprobanteTarjeta")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosComprobanteTarjeta.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarComprobanteTarjeta")) {
			
			}
			
			ComprobanteTarjetaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.comprobantetarjeta,new Object(),this.comprobantetarjetaParameterGeneral,this.comprobantetarjetaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComprobanteTarjetaConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessComprobanteTarjeta();
			
			ComprobanteTarjetaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.comprobantetarjeta,new Object(),this.comprobantetarjetaParameterGeneral,this.comprobantetarjetaReturnGeneral);
			
			if(sTipo.equals("NuevoComprobanteTarjeta")) {
				jButtonNuevoComprobanteTarjetaActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarComprobanteTarjeta")) {
				jButtonDuplicarComprobanteTarjetaActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarComprobanteTarjeta")) {
				jButtonCopiarComprobanteTarjetaActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormComprobanteTarjeta")) {
				jButtonVerFormComprobanteTarjetaActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesComprobanteTarjeta")) {
				jButtonNuevoComprobanteTarjetaActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarComprobanteTarjeta")) {
				jButtonModificarComprobanteTarjetaActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarComprobanteTarjeta")) {
				jButtonActualizarComprobanteTarjetaActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarComprobanteTarjeta")) {
				jButtonEliminarComprobanteTarjetaActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaComprobanteTarjeta")) {
				jButtonGuardarCambiosComprobanteTarjetaActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarComprobanteTarjeta")) {
				jButtonCancelarComprobanteTarjetaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarComprobanteTarjeta")) {
				jButtonCerrarComprobanteTarjetaActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosComprobanteTarjeta")) {
				jButtonGuardarCambiosComprobanteTarjetaActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosComprobanteTarjeta")) {
				jButtonNuevoGuardarCambiosComprobanteTarjetaActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByComprobanteTarjeta")) {
				jButtonAbrirOrderByComprobanteTarjetaActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionComprobanteTarjeta")) {
				jButtonRecargarInformacionComprobanteTarjetaActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresComprobanteTarjeta")) {
				jButtonAnterioresComprobanteTarjetaActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesComprobanteTarjeta")) {
				jButtonSiguientesComprobanteTarjetaActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idComprobanteTarjetaBusqueda")) {
				this.jButtonidComprobanteTarjetaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaComprobanteTarjetaUpdate")) {
				this.jButtonid_empresaComprobanteTarjetaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaComprobanteTarjetaBusqueda")) {
				this.jButtonid_empresaComprobanteTarjetaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalComprobanteTarjetaUpdate")) {
				this.jButtonid_sucursalComprobanteTarjetaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalComprobanteTarjetaBusqueda")) {
				this.jButtonid_sucursalComprobanteTarjetaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_clienteComprobanteTarjetaUpdate")) {
				this.jButtonid_clienteComprobanteTarjetaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_clienteComprobanteTarjetaBusqueda")) {
				this.jButtonid_clienteComprobanteTarjetaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_cajaComprobanteTarjetaUpdate")) {
				this.jButtonid_cajaComprobanteTarjetaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_cajaComprobanteTarjetaBusqueda")) {
				this.jButtonid_cajaComprobanteTarjetaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_inicioComprobanteTarjetaBusqueda")) {
				this.jButtonfecha_inicioComprobanteTarjetaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_finComprobanteTarjetaBusqueda")) {
				this.jButtonfecha_finComprobanteTarjetaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_cajaComprobanteTarjetaBusqueda")) {
				this.jButtonnombre_cajaComprobanteTarjetaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("secuencialComprobanteTarjetaBusqueda")) {
				this.jButtonsecuencialComprobanteTarjetaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fechaComprobanteTarjetaBusqueda")) {
				this.jButtonfechaComprobanteTarjetaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigo_clienteComprobanteTarjetaBusqueda")) {
				this.jButtoncodigo_clienteComprobanteTarjetaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_clienteComprobanteTarjetaBusqueda")) {
				this.jButtonnombre_clienteComprobanteTarjetaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("subtotalComprobanteTarjetaBusqueda")) {
				this.jButtonsubtotalComprobanteTarjetaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("ivaComprobanteTarjetaBusqueda")) {
				this.jButtonivaComprobanteTarjetaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descuentoComprobanteTarjetaBusqueda")) {
				this.jButtondescuentoComprobanteTarjetaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("financiamientoComprobanteTarjetaBusqueda")) {
				this.jButtonfinanciamientoComprobanteTarjetaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fleteComprobanteTarjetaBusqueda")) {
				this.jButtonfleteComprobanteTarjetaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("iceComprobanteTarjetaBusqueda")) {
				this.jButtoniceComprobanteTarjetaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("totalComprobanteTarjetaBusqueda")) {
				this.jButtontotalComprobanteTarjetaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("valorComprobanteTarjetaBusqueda")) {
				this.jButtonvalorComprobanteTarjetaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_forma_pagoComprobanteTarjetaBusqueda")) {
				this.jButtonfecha_forma_pagoComprobanteTarjetaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numeroComprobanteTarjetaBusqueda")) {
				this.jButtonnumeroComprobanteTarjetaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("tarjeta_habienteComprobanteTarjetaBusqueda")) {
				this.jButtontarjeta_habienteComprobanteTarjetaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("autorizacionComprobanteTarjetaBusqueda")) {
				this.jButtonautorizacionComprobanteTarjetaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("voucherComprobanteTarjetaBusqueda")) {
				this.jButtonvoucherComprobanteTarjetaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("loteComprobanteTarjetaBusqueda")) {
				this.jButtonloteComprobanteTarjetaBusquedaActionPerformed(evt);
			}
			
			ComprobanteTarjetaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.comprobantetarjeta,new Object(),this.comprobantetarjetaParameterGeneral,this.comprobantetarjetaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComprobanteTarjetaConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessComprobanteTarjeta();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			ComprobanteTarjetaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.comprobantetarjeta,new Object(),this.comprobantetarjetaParameterGeneral,this.comprobantetarjetaReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameComprobanteTarjeta")) {
				closingInternalFrameComprobanteTarjeta();
				
			} else if(sTipo.equals("jButtonCancelarComprobanteTarjeta")) {
				JInternalFrameBase jInternalFrameDetalleFormComprobanteTarjeta = (JInternalFrameBase)evt.getSource();
	            	
	            ComprobanteTarjetaBeanSwingJInternalFrame jInternalFrameParent=(ComprobanteTarjetaBeanSwingJInternalFrame)jInternalFrameDetalleFormComprobanteTarjeta.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarComprobanteTarjetaActionPerformed(null);
			}
			
			ComprobanteTarjetaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.comprobantetarjeta,new Object(),this.comprobantetarjetaParameterGeneral,this.comprobantetarjetaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComprobanteTarjetaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormComprobanteTarjeta(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormComprobanteTarjeta(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormComprobanteTarjeta(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.comprobantetarjeta)) {
			if(!esControlTabla) {
				if(ComprobanteTarjetaJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualComprobanteTarjeta(this.comprobantetarjeta,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysComprobanteTarjeta(this.comprobantetarjeta);			
				}
				
				if(this.comprobantetarjetaSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualComprobanteTarjeta(this.comprobantetarjeta,classes);				
				}
			
				if(conIrServidorAplicacion) {
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanComprobanteTarjeta(this.comprobantetarjetaReturnGeneral,this.comprobantetarjetaBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.comprobantetarjetaSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanComprobanteTarjeta(classes,this.comprobantetarjetaReturnGeneral,this.comprobantetarjetaBean,false);
					}
						
					if(this.comprobantetarjetaReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyComprobanteTarjeta(this.comprobantetarjetaReturnGeneral.getComprobanteTarjeta());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioComprobanteTarjeta(this.comprobantetarjetaReturnGeneral.getComprobanteTarjeta());	
					}
						
					if(this.comprobantetarjetaReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioComprobanteTarjeta(this.comprobantetarjetaReturnGeneral.getComprobanteTarjeta(),classes);//this.comprobantetarjetaBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioComprobanteTarjeta(this.comprobantetarjeta,classes);//this.comprobantetarjetaBean);									
				}
			
				if(ComprobanteTarjetaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualComprobanteTarjeta(this.comprobantetarjeta,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysComprobanteTarjeta(this.comprobantetarjeta);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.comprobantetarjetaAnterior!=null) {
						this.comprobantetarjeta=this.comprobantetarjetaAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.comprobantetarjetaSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.comprobantetarjetaSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.comprobantetarjetaReturnGeneral.getComprobanteTarjeta(),comprobantetarjetaLogic.getComprobanteTarjetas());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.comprobantetarjetaReturnGeneral.getComprobanteTarjeta(),this.comprobantetarjetas);
				}
				//ARCHITECTURE
				
				//this.jTableDatosComprobanteTarjeta.repaint();
				
				//((AbstractTableModel) this.jTableDatosComprobanteTarjeta.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosComprobanteTarjeta();
			}
		}
	}
	
	public void actualizarVisualTableDatosComprobanteTarjeta() throws Exception {
		
		ComprobanteTarjetaModel comprobantetarjetaModel=(ComprobanteTarjetaModel)this.jTableDatosComprobanteTarjeta.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			comprobantetarjetaModel.comprobantetarjetas=this.comprobantetarjetaLogic.getComprobanteTarjetas();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			comprobantetarjetaModel.comprobantetarjetas=this.comprobantetarjetas;
		}
		
		
		((ComprobanteTarjetaModel) this.jTableDatosComprobanteTarjeta.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaComprobanteTarjeta() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getcomprobantetarjetaAnterior(),this.comprobantetarjetaLogic.getComprobanteTarjetas());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getcomprobantetarjetaAnterior(),this.comprobantetarjetas);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosComprobanteTarjeta();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioComprobanteTarjeta(ComprobanteTarjeta comprobantetarjeta,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComprobanteTarjetaConstantesFunciones.CLASSNAME);
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
										
				ComprobanteTarjetaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.comprobantetarjeta,new Object(),generalEntityParameterGeneral,this.comprobantetarjetaReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.comprobantetarjetaSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=ComprobanteTarjetaConstantesFunciones.getClassesRelationshipsOfComprobanteTarjeta(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=ComprobanteTarjetaConstantesFunciones.getClassesRelationshipsFromStringsOfComprobanteTarjeta(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormComprobanteTarjeta(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				ComprobanteTarjetaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.comprobantetarjeta,new Object(),generalEntityParameterGeneral,this.comprobantetarjetaReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComprobanteTarjetaConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioComprobanteTarjeta(ComprobanteTarjetaBean comprobantetarjetaBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComprobanteTarjetaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanComprobanteTarjeta(ArrayList<Classe> classes,ComprobanteTarjetaReturnGeneral comprobantetarjetaReturnGeneral,ComprobanteTarjetaBean comprobantetarjetaBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualComprobanteTarjeta(ComprobanteTarjeta comprobantetarjeta,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.comprobantetarjeta)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormComprobanteTarjeta = new ComprobanteTarjetaDetalleFormJInternalFrame(jDesktopPane,this.comprobantetarjetaSessionBean.getConGuardarRelaciones(),this.comprobantetarjetaSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormComprobanteTarjeta);
		this.jInternalFrameDetalleFormComprobanteTarjeta.setVisible(false);
		this.jInternalFrameDetalleFormComprobanteTarjeta.setSelected(false);						
		
		this.jInternalFrameDetalleFormComprobanteTarjeta.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormComprobanteTarjeta.comprobantetarjetaLogic=this.comprobantetarjetaLogic;
		
		this.cargarCombosFrameForeignKeyComprobanteTarjeta("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleComprobanteTarjeta();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleComprobanteTarjeta();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyComprobanteTarjeta("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyComprobanteTarjeta();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormComprobanteTarjeta.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarComprobanteTarjeta"));
		
		this.jInternalFrameDetalleFormComprobanteTarjeta.jButtonModificarComprobanteTarjeta.addActionListener(new ButtonActionListener(this,"ModificarComprobanteTarjeta"));

		
		this.jInternalFrameDetalleFormComprobanteTarjeta.jButtonModificarToolBarComprobanteTarjeta.addActionListener(new ButtonActionListener(this,"ModificarToolBarComprobanteTarjeta"));
					
		this.jInternalFrameDetalleFormComprobanteTarjeta.jMenuItemModificarComprobanteTarjeta.addActionListener(new ButtonActionListener(this,"MenuItemModificarComprobanteTarjeta"));		
		
		
		
		this.jInternalFrameDetalleFormComprobanteTarjeta.jButtonActualizarComprobanteTarjeta.addActionListener (new ButtonActionListener(this,"ActualizarComprobanteTarjeta"));
		
		
		this.jInternalFrameDetalleFormComprobanteTarjeta.jButtonActualizarToolBarComprobanteTarjeta.addActionListener(new ButtonActionListener(this,"ActualizarToolBarComprobanteTarjeta"));
						
		this.jInternalFrameDetalleFormComprobanteTarjeta.jMenuItemActualizarComprobanteTarjeta.addActionListener (new ButtonActionListener(this,"MenuItemActualizarComprobanteTarjeta"));		
		
		
		
		this.jInternalFrameDetalleFormComprobanteTarjeta.jButtonEliminarComprobanteTarjeta.addActionListener (new ButtonActionListener(this,"EliminarComprobanteTarjeta"));
		
		
		this.jInternalFrameDetalleFormComprobanteTarjeta.jButtonEliminarToolBarComprobanteTarjeta.addActionListener (new ButtonActionListener(this,"EliminarToolBarComprobanteTarjeta"));
								
		this.jInternalFrameDetalleFormComprobanteTarjeta.jMenuItemEliminarComprobanteTarjeta.addActionListener (new ButtonActionListener(this,"MenuItemEliminarComprobanteTarjeta"));		
		
		
		
		this.jInternalFrameDetalleFormComprobanteTarjeta.jButtonCancelarComprobanteTarjeta.addActionListener (new ButtonActionListener(this,"CancelarComprobanteTarjeta"));
		
		
		this.jInternalFrameDetalleFormComprobanteTarjeta.jButtonCancelarToolBarComprobanteTarjeta.addActionListener (new ButtonActionListener(this,"CancelarToolBarComprobanteTarjeta"));
					
		this.jInternalFrameDetalleFormComprobanteTarjeta.jMenuItemCancelarComprobanteTarjeta.addActionListener (new ButtonActionListener(this,"MenuItemCancelarComprobanteTarjeta"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormComprobanteTarjeta.jMenuItemDetalleCerrarComprobanteTarjeta.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarComprobanteTarjeta"));		
		
		
		
		this.jInternalFrameDetalleFormComprobanteTarjeta.jButtonGuardarCambiosToolBarComprobanteTarjeta.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarComprobanteTarjeta"));
		
		
		
		this.jInternalFrameDetalleFormComprobanteTarjeta.jButtonGuardarCambiosToolBarComprobanteTarjeta.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarComprobanteTarjeta"));
		
		
		
		this.jInternalFrameDetalleFormComprobanteTarjeta.jComboBoxTiposAccionesFormularioComprobanteTarjeta.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioComprobanteTarjeta"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComprobanteTarjeta.jButtonidComprobanteTarjetaBusqueda.addActionListener(new ButtonActionListener(this,"idComprobanteTarjetaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormComprobanteTarjeta.jButtonid_empresaComprobanteTarjetaUpdate.addActionListener(new ButtonActionListener(this,"id_empresaComprobanteTarjetaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComprobanteTarjeta.jButtonid_empresaComprobanteTarjetaBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaComprobanteTarjetaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormComprobanteTarjeta.jButtonid_sucursalComprobanteTarjetaUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalComprobanteTarjetaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComprobanteTarjeta.jButtonid_sucursalComprobanteTarjetaBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalComprobanteTarjetaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormComprobanteTarjeta.jButtonid_clienteComprobanteTarjetaUpdate.addActionListener(new ButtonActionListener(this,"id_clienteComprobanteTarjetaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComprobanteTarjeta.jButtonid_clienteComprobanteTarjetaBusqueda.addActionListener(new ButtonActionListener(this,"id_clienteComprobanteTarjetaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormComprobanteTarjeta.jButtonid_cajaComprobanteTarjetaUpdate.addActionListener(new ButtonActionListener(this,"id_cajaComprobanteTarjetaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComprobanteTarjeta.jButtonid_cajaComprobanteTarjetaBusqueda.addActionListener(new ButtonActionListener(this,"id_cajaComprobanteTarjetaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComprobanteTarjeta.jButtonfecha_inicioComprobanteTarjetaBusqueda.addActionListener(new ButtonActionListener(this,"fecha_inicioComprobanteTarjetaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComprobanteTarjeta.jButtonfecha_finComprobanteTarjetaBusqueda.addActionListener(new ButtonActionListener(this,"fecha_finComprobanteTarjetaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComprobanteTarjeta.jButtonnombre_cajaComprobanteTarjetaBusqueda.addActionListener(new ButtonActionListener(this,"nombre_cajaComprobanteTarjetaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComprobanteTarjeta.jButtonsecuencialComprobanteTarjetaBusqueda.addActionListener(new ButtonActionListener(this,"secuencialComprobanteTarjetaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComprobanteTarjeta.jButtonfechaComprobanteTarjetaBusqueda.addActionListener(new ButtonActionListener(this,"fechaComprobanteTarjetaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComprobanteTarjeta.jButtoncodigo_clienteComprobanteTarjetaBusqueda.addActionListener(new ButtonActionListener(this,"codigo_clienteComprobanteTarjetaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComprobanteTarjeta.jButtonnombre_clienteComprobanteTarjetaBusqueda.addActionListener(new ButtonActionListener(this,"nombre_clienteComprobanteTarjetaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComprobanteTarjeta.jButtonsubtotalComprobanteTarjetaBusqueda.addActionListener(new ButtonActionListener(this,"subtotalComprobanteTarjetaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComprobanteTarjeta.jButtonivaComprobanteTarjetaBusqueda.addActionListener(new ButtonActionListener(this,"ivaComprobanteTarjetaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComprobanteTarjeta.jButtondescuentoComprobanteTarjetaBusqueda.addActionListener(new ButtonActionListener(this,"descuentoComprobanteTarjetaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComprobanteTarjeta.jButtonfinanciamientoComprobanteTarjetaBusqueda.addActionListener(new ButtonActionListener(this,"financiamientoComprobanteTarjetaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComprobanteTarjeta.jButtonfleteComprobanteTarjetaBusqueda.addActionListener(new ButtonActionListener(this,"fleteComprobanteTarjetaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComprobanteTarjeta.jButtoniceComprobanteTarjetaBusqueda.addActionListener(new ButtonActionListener(this,"iceComprobanteTarjetaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComprobanteTarjeta.jButtontotalComprobanteTarjetaBusqueda.addActionListener(new ButtonActionListener(this,"totalComprobanteTarjetaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComprobanteTarjeta.jButtonvalorComprobanteTarjetaBusqueda.addActionListener(new ButtonActionListener(this,"valorComprobanteTarjetaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComprobanteTarjeta.jButtonfecha_forma_pagoComprobanteTarjetaBusqueda.addActionListener(new ButtonActionListener(this,"fecha_forma_pagoComprobanteTarjetaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComprobanteTarjeta.jButtonnumeroComprobanteTarjetaBusqueda.addActionListener(new ButtonActionListener(this,"numeroComprobanteTarjetaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComprobanteTarjeta.jButtontarjeta_habienteComprobanteTarjetaBusqueda.addActionListener(new ButtonActionListener(this,"tarjeta_habienteComprobanteTarjetaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComprobanteTarjeta.jButtonautorizacionComprobanteTarjetaBusqueda.addActionListener(new ButtonActionListener(this,"autorizacionComprobanteTarjetaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComprobanteTarjeta.jButtonvoucherComprobanteTarjetaBusqueda.addActionListener(new ButtonActionListener(this,"voucherComprobanteTarjetaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComprobanteTarjeta.jButtonloteComprobanteTarjetaBusqueda.addActionListener(new ButtonActionListener(this,"loteComprobanteTarjetaBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormComprobanteTarjeta.jTabbedPaneRelacionesComprobanteTarjeta.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesComprobanteTarjeta"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameComprobanteTarjeta"));
		
		if(this.jInternalFrameDetalleFormComprobanteTarjeta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormComprobanteTarjeta.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarComprobanteTarjeta"));
		}
		
		this.jTableDatosComprobanteTarjeta.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarComprobanteTarjeta"));
		
		this.jTableDatosComprobanteTarjeta.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarComprobanteTarjeta"));
		
		this.jButtonNuevoComprobanteTarjeta.addActionListener(new ButtonActionListener(this,"NuevoComprobanteTarjeta"));
		
		this.jButtonDuplicarComprobanteTarjeta.addActionListener(new ButtonActionListener(this,"DuplicarComprobanteTarjeta"));
		
		this.jButtonCopiarComprobanteTarjeta.addActionListener(new ButtonActionListener(this,"CopiarComprobanteTarjeta"));
		
		this.jButtonVerFormComprobanteTarjeta.addActionListener(new ButtonActionListener(this,"VerFormComprobanteTarjeta"));
		
		
		this.jButtonNuevoToolBarComprobanteTarjeta.addActionListener(new ButtonActionListener(this,"NuevoToolBarComprobanteTarjeta"));
			
		this.jButtonDuplicarToolBarComprobanteTarjeta.addActionListener(new ButtonActionListener(this,"DuplicarToolBarComprobanteTarjeta"));
			
		this.jMenuItemNuevoComprobanteTarjeta.addActionListener (new ButtonActionListener(this,"MenuItemNuevoComprobanteTarjeta"));
			
		this.jMenuItemDuplicarComprobanteTarjeta.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarComprobanteTarjeta"));		
		
		
		this.jButtonNuevoRelacionesComprobanteTarjeta.addActionListener (new ButtonActionListener(this,"NuevoRelacionesComprobanteTarjeta"));
		
		
		this.jButtonNuevoRelacionesToolBarComprobanteTarjeta.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarComprobanteTarjeta"));
			
		this.jMenuItemNuevoRelacionesComprobanteTarjeta.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesComprobanteTarjeta"));		
		
		
		if(this.jInternalFrameDetalleFormComprobanteTarjeta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormComprobanteTarjeta.jButtonModificarComprobanteTarjeta.addActionListener(new ButtonActionListener(this,"ModificarComprobanteTarjeta"));
		}
		
		
		if(this.jInternalFrameDetalleFormComprobanteTarjeta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormComprobanteTarjeta.jButtonModificarToolBarComprobanteTarjeta.addActionListener(new ButtonActionListener(this,"ModificarToolBarComprobanteTarjeta"));
			
			this.jInternalFrameDetalleFormComprobanteTarjeta.jMenuItemModificarComprobanteTarjeta.addActionListener(new ButtonActionListener(this,"MenuItemModificarComprobanteTarjeta"));		
		}
		
		
		if(this.jInternalFrameDetalleFormComprobanteTarjeta!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormComprobanteTarjeta.jButtonActualizarComprobanteTarjeta.addActionListener (new ButtonActionListener(this,"ActualizarComprobanteTarjeta"));
		}
		
		
		if(this.jInternalFrameDetalleFormComprobanteTarjeta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormComprobanteTarjeta.jButtonActualizarToolBarComprobanteTarjeta.addActionListener(new ButtonActionListener(this,"ActualizarToolBarComprobanteTarjeta"));
				
			this.jInternalFrameDetalleFormComprobanteTarjeta.jMenuItemActualizarComprobanteTarjeta.addActionListener (new ButtonActionListener(this,"MenuItemActualizarComprobanteTarjeta"));		
		}
		
		
		if(this.jInternalFrameDetalleFormComprobanteTarjeta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormComprobanteTarjeta.jButtonEliminarComprobanteTarjeta.addActionListener (new ButtonActionListener(this,"EliminarComprobanteTarjeta"));
		}
		
		
		if(this.jInternalFrameDetalleFormComprobanteTarjeta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormComprobanteTarjeta.jButtonEliminarToolBarComprobanteTarjeta.addActionListener (new ButtonActionListener(this,"EliminarToolBarComprobanteTarjeta"));
						
			this.jInternalFrameDetalleFormComprobanteTarjeta.jMenuItemEliminarComprobanteTarjeta.addActionListener (new ButtonActionListener(this,"MenuItemEliminarComprobanteTarjeta"));		
		}
		
		
		if(this.jInternalFrameDetalleFormComprobanteTarjeta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormComprobanteTarjeta.jButtonCancelarComprobanteTarjeta.addActionListener (new ButtonActionListener(this,"CancelarComprobanteTarjeta"));
		}
		
		
		if(this.jInternalFrameDetalleFormComprobanteTarjeta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormComprobanteTarjeta.jButtonCancelarToolBarComprobanteTarjeta.addActionListener (new ButtonActionListener(this,"CancelarToolBarComprobanteTarjeta"));
			
			this.jInternalFrameDetalleFormComprobanteTarjeta.jMenuItemCancelarComprobanteTarjeta.addActionListener (new ButtonActionListener(this,"MenuItemCancelarComprobanteTarjeta"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarComprobanteTarjeta.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarComprobanteTarjeta"));		
		
		
		this.jButtonCerrarComprobanteTarjeta.addActionListener (new ButtonActionListener(this,"CerrarComprobanteTarjeta"));
		
		
		this.jButtonCerrarToolBarComprobanteTarjeta.addActionListener (new ButtonActionListener(this,"CerrarToolBarComprobanteTarjeta"));
			
		this.jMenuItemCerrarComprobanteTarjeta.addActionListener (new ButtonActionListener(this,"MenuItemCerrarComprobanteTarjeta"));
			
		if(this.jInternalFrameDetalleFormComprobanteTarjeta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormComprobanteTarjeta.jMenuItemDetalleCerrarComprobanteTarjeta.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarComprobanteTarjeta"));		
		}
		
		
		if(this.jInternalFrameDetalleFormComprobanteTarjeta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormComprobanteTarjeta.jButtonGuardarCambiosComprobanteTarjeta.addActionListener (new ButtonActionListener(this,"GuardarCambiosComprobanteTarjeta"));
		}
		
		
		if(this.jInternalFrameDetalleFormComprobanteTarjeta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormComprobanteTarjeta.jButtonGuardarCambiosToolBarComprobanteTarjeta.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarComprobanteTarjeta"));
		}
		
		this.jButtonCopiarToolBarComprobanteTarjeta.addActionListener (new ButtonActionListener(this,"CopiarToolBarComprobanteTarjeta"));
			
		this.jButtonVerFormToolBarComprobanteTarjeta.addActionListener (new ButtonActionListener(this,"VerFormToolBarComprobanteTarjeta"));
		
		this.jMenuItemGuardarCambiosComprobanteTarjeta.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosComprobanteTarjeta"));
			
		this.jMenuItemCopiarComprobanteTarjeta.addActionListener (new ButtonActionListener(this,"MenuItemCopiarComprobanteTarjeta"));		
		
		this.jMenuItemVerFormComprobanteTarjeta.addActionListener (new ButtonActionListener(this,"MenuItemVerFormComprobanteTarjeta"));		
		
		
		this.jButtonGuardarCambiosTablaComprobanteTarjeta.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaComprobanteTarjeta"));
		
		
		this.jButtonGuardarCambiosTablaToolBarComprobanteTarjeta.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarComprobanteTarjeta"));
			
		this.jMenuItemGuardarCambiosTablaComprobanteTarjeta.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaComprobanteTarjeta"));		
		
		
		
		this.jButtonRecargarInformacionComprobanteTarjeta.addActionListener (new ButtonActionListener(this,"RecargarInformacionComprobanteTarjeta"));
					
		this.jButtonRecargarInformacionToolBarComprobanteTarjeta.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarComprobanteTarjeta"));
		
		this.jMenuItemRecargarInformacionComprobanteTarjeta.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionComprobanteTarjeta"));		
		
		
		
		this.jButtonAnterioresComprobanteTarjeta.addActionListener (new ButtonActionListener(this,"AnterioresComprobanteTarjeta"));
		
		
		this.jButtonAnterioresToolBarComprobanteTarjeta.addActionListener (new ButtonActionListener(this,"AnterioresToolBarComprobanteTarjeta"));
		
		this.jMenuItemAnterioresComprobanteTarjeta.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresComprobanteTarjeta"));		
		
		
		this.jButtonSiguientesComprobanteTarjeta.addActionListener (new ButtonActionListener(this,"SiguientesComprobanteTarjeta"));
		
		
		this.jButtonSiguientesToolBarComprobanteTarjeta.addActionListener (new ButtonActionListener(this,"SiguientesToolBarComprobanteTarjeta"));
			
		this.jMenuItemSiguientesComprobanteTarjeta.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesComprobanteTarjeta"));
			
		this.jMenuItemAbrirOrderByComprobanteTarjeta.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByComprobanteTarjeta"));
			
		this.jMenuItemMostrarOcultarComprobanteTarjeta.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarComprobanteTarjeta"));
			
		this.jMenuItemDetalleAbrirOrderByComprobanteTarjeta.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByComprobanteTarjeta"));
			
		this.jMenuItemDetalleMostarOcultarComprobanteTarjeta.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarComprobanteTarjeta"));		
		
		
		this.jButtonNuevoGuardarCambiosComprobanteTarjeta.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosComprobanteTarjeta"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarComprobanteTarjeta.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarComprobanteTarjeta"));
			
		this.jMenuItemNuevoGuardarCambiosComprobanteTarjeta.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosComprobanteTarjeta"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosComprobanteTarjeta.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosComprobanteTarjeta"));

		this.jCheckBoxSeleccionadosComprobanteTarjeta.addItemListener(new CheckBoxItemListener(this,"SeleccionadosComprobanteTarjeta"));
		
		if(this.jInternalFrameDetalleFormComprobanteTarjeta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormComprobanteTarjeta.jComboBoxTiposAccionesFormularioComprobanteTarjeta.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioComprobanteTarjeta"));
		}
		
		
		this.jComboBoxTiposRelacionesComprobanteTarjeta.addActionListener (new ButtonActionListener(this,"TiposRelacionesComprobanteTarjeta"));
			
		this.jComboBoxTiposAccionesComprobanteTarjeta.addActionListener (new ButtonActionListener(this,"TiposAccionesComprobanteTarjeta"));
					
		this.jComboBoxTiposSeleccionarComprobanteTarjeta.addActionListener (new ButtonActionListener(this,"TiposSeleccionarComprobanteTarjeta"));
			
		this.jTextFieldValorCampoGeneralComprobanteTarjeta.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralComprobanteTarjeta"));		
		
		
		if(this.jInternalFrameDetalleFormComprobanteTarjeta!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComprobanteTarjeta.jButtonidComprobanteTarjetaBusqueda.addActionListener(new ButtonActionListener(this,"idComprobanteTarjetaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormComprobanteTarjeta.jButtonid_empresaComprobanteTarjetaUpdate.addActionListener(new ButtonActionListener(this,"id_empresaComprobanteTarjetaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComprobanteTarjeta.jButtonid_empresaComprobanteTarjetaBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaComprobanteTarjetaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormComprobanteTarjeta.jButtonid_sucursalComprobanteTarjetaUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalComprobanteTarjetaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComprobanteTarjeta.jButtonid_sucursalComprobanteTarjetaBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalComprobanteTarjetaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormComprobanteTarjeta.jButtonid_clienteComprobanteTarjetaUpdate.addActionListener(new ButtonActionListener(this,"id_clienteComprobanteTarjetaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComprobanteTarjeta.jButtonid_clienteComprobanteTarjetaBusqueda.addActionListener(new ButtonActionListener(this,"id_clienteComprobanteTarjetaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormComprobanteTarjeta.jButtonid_cajaComprobanteTarjetaUpdate.addActionListener(new ButtonActionListener(this,"id_cajaComprobanteTarjetaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComprobanteTarjeta.jButtonid_cajaComprobanteTarjetaBusqueda.addActionListener(new ButtonActionListener(this,"id_cajaComprobanteTarjetaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComprobanteTarjeta.jButtonfecha_inicioComprobanteTarjetaBusqueda.addActionListener(new ButtonActionListener(this,"fecha_inicioComprobanteTarjetaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComprobanteTarjeta.jButtonfecha_finComprobanteTarjetaBusqueda.addActionListener(new ButtonActionListener(this,"fecha_finComprobanteTarjetaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComprobanteTarjeta.jButtonnombre_cajaComprobanteTarjetaBusqueda.addActionListener(new ButtonActionListener(this,"nombre_cajaComprobanteTarjetaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComprobanteTarjeta.jButtonsecuencialComprobanteTarjetaBusqueda.addActionListener(new ButtonActionListener(this,"secuencialComprobanteTarjetaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComprobanteTarjeta.jButtonfechaComprobanteTarjetaBusqueda.addActionListener(new ButtonActionListener(this,"fechaComprobanteTarjetaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComprobanteTarjeta.jButtoncodigo_clienteComprobanteTarjetaBusqueda.addActionListener(new ButtonActionListener(this,"codigo_clienteComprobanteTarjetaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComprobanteTarjeta.jButtonnombre_clienteComprobanteTarjetaBusqueda.addActionListener(new ButtonActionListener(this,"nombre_clienteComprobanteTarjetaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComprobanteTarjeta.jButtonsubtotalComprobanteTarjetaBusqueda.addActionListener(new ButtonActionListener(this,"subtotalComprobanteTarjetaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComprobanteTarjeta.jButtonivaComprobanteTarjetaBusqueda.addActionListener(new ButtonActionListener(this,"ivaComprobanteTarjetaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComprobanteTarjeta.jButtondescuentoComprobanteTarjetaBusqueda.addActionListener(new ButtonActionListener(this,"descuentoComprobanteTarjetaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComprobanteTarjeta.jButtonfinanciamientoComprobanteTarjetaBusqueda.addActionListener(new ButtonActionListener(this,"financiamientoComprobanteTarjetaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComprobanteTarjeta.jButtonfleteComprobanteTarjetaBusqueda.addActionListener(new ButtonActionListener(this,"fleteComprobanteTarjetaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComprobanteTarjeta.jButtoniceComprobanteTarjetaBusqueda.addActionListener(new ButtonActionListener(this,"iceComprobanteTarjetaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComprobanteTarjeta.jButtontotalComprobanteTarjetaBusqueda.addActionListener(new ButtonActionListener(this,"totalComprobanteTarjetaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComprobanteTarjeta.jButtonvalorComprobanteTarjetaBusqueda.addActionListener(new ButtonActionListener(this,"valorComprobanteTarjetaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComprobanteTarjeta.jButtonfecha_forma_pagoComprobanteTarjetaBusqueda.addActionListener(new ButtonActionListener(this,"fecha_forma_pagoComprobanteTarjetaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComprobanteTarjeta.jButtonnumeroComprobanteTarjetaBusqueda.addActionListener(new ButtonActionListener(this,"numeroComprobanteTarjetaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComprobanteTarjeta.jButtontarjeta_habienteComprobanteTarjetaBusqueda.addActionListener(new ButtonActionListener(this,"tarjeta_habienteComprobanteTarjetaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComprobanteTarjeta.jButtonautorizacionComprobanteTarjetaBusqueda.addActionListener(new ButtonActionListener(this,"autorizacionComprobanteTarjetaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComprobanteTarjeta.jButtonvoucherComprobanteTarjetaBusqueda.addActionListener(new ButtonActionListener(this,"voucherComprobanteTarjetaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComprobanteTarjeta.jButtonloteComprobanteTarjetaBusqueda.addActionListener(new ButtonActionListener(this,"loteComprobanteTarjetaBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonBusquedaComprobanteTarjetaComprobanteTarjeta.addActionListener(new ButtonActionListener(this,"BusquedaComprobanteTarjetaComprobanteTarjeta"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoComprobanteTarjeta!=null) {
				this.jInternalFrameReporteDinamicoComprobanteTarjeta.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoComprobanteTarjeta"));
				this.jInternalFrameReporteDinamicoComprobanteTarjeta.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoComprobanteTarjeta"));
				this.jInternalFrameReporteDinamicoComprobanteTarjeta.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoComprobanteTarjeta"));
			}
			
			//this.jButtonCerrarReporteDinamicoComprobanteTarjeta.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoComprobanteTarjeta"));				
			//this.jButtonGenerarReporteDinamicoComprobanteTarjeta.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoComprobanteTarjeta"));
			//this.jButtonGenerarExcelReporteDinamicoComprobanteTarjeta.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoComprobanteTarjeta"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionComprobanteTarjeta!=null) {
				this.jInternalFrameImportacionComprobanteTarjeta.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionComprobanteTarjeta"));
				this.jInternalFrameImportacionComprobanteTarjeta.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionComprobanteTarjeta"));
				this.jInternalFrameImportacionComprobanteTarjeta.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionComprobanteTarjeta"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByComprobanteTarjeta.addActionListener (new ButtonActionListener(this,"AbrirOrderByComprobanteTarjeta"));
			
			this.jButtonAbrirOrderByToolBarComprobanteTarjeta.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarComprobanteTarjeta"));			
			
			if(this.jInternalFrameOrderByComprobanteTarjeta!=null) {
				this.jInternalFrameOrderByComprobanteTarjeta.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByComprobanteTarjeta"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormComprobanteTarjeta!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormComprobanteTarjeta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormComprobanteTarjeta.jTabbedPaneRelacionesComprobanteTarjeta.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesComprobanteTarjeta"));
		
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
            		closingInternalFrameComprobanteTarjeta();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormComprobanteTarjeta.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormComprobanteTarjeta = (JInternalFrameBase)event.getSource();
	            	
	            ComprobanteTarjetaBeanSwingJInternalFrame jInternalFrameParent=(ComprobanteTarjetaBeanSwingJInternalFrame)jInternalFrameDetalleFormComprobanteTarjeta.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarComprobanteTarjetaActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosComprobanteTarjeta.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosComprobanteTarjetaListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosComprobanteTarjeta.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosComprobanteTarjeta.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoComprobanteTarjeta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoComprobanteTarjetaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarComprobanteTarjeta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoComprobanteTarjetaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoComprobanteTarjeta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoComprobanteTarjetaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoComprobanteTarjeta";
		inputMap = this.jButtonNuevoComprobanteTarjeta.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoComprobanteTarjeta.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoComprobanteTarjetaActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesComprobanteTarjeta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoComprobanteTarjetaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarComprobanteTarjeta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoComprobanteTarjetaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesComprobanteTarjeta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoComprobanteTarjetaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesComprobanteTarjeta";
		inputMap = this.jButtonNuevoRelacionesComprobanteTarjeta.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesComprobanteTarjeta.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoComprobanteTarjetaActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarComprobanteTarjeta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarComprobanteTarjetaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarComprobanteTarjeta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarComprobanteTarjetaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarComprobanteTarjeta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarComprobanteTarjetaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarComprobanteTarjeta";
		inputMap = this.jButtonModificarComprobanteTarjeta.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarComprobanteTarjeta.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarComprobanteTarjetaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarComprobanteTarjeta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarComprobanteTarjetaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarComprobanteTarjeta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarComprobanteTarjetaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarComprobanteTarjeta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarComprobanteTarjetaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarComprobanteTarjeta";
		inputMap = this.jButtonActualizarComprobanteTarjeta.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarComprobanteTarjeta.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarComprobanteTarjetaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarComprobanteTarjeta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarComprobanteTarjetaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarComprobanteTarjeta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarComprobanteTarjetaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarComprobanteTarjeta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarComprobanteTarjetaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarComprobanteTarjeta";
		inputMap = this.jButtonEliminarComprobanteTarjeta.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarComprobanteTarjeta.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarComprobanteTarjetaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarComprobanteTarjeta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarComprobanteTarjetaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarComprobanteTarjeta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarComprobanteTarjetaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarComprobanteTarjeta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarComprobanteTarjetaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarComprobanteTarjeta";
		inputMap = this.jButtonCancelarComprobanteTarjeta.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarComprobanteTarjeta.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarComprobanteTarjetaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarComprobanteTarjeta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarComprobanteTarjetaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarComprobanteTarjeta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarComprobanteTarjetaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarComprobanteTarjeta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarComprobanteTarjetaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarComprobanteTarjeta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarComprobanteTarjetaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarComprobanteTarjetaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarComprobanteTarjeta";
		inputMap = this.jButtonCerrarComprobanteTarjeta.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarComprobanteTarjeta.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarComprobanteTarjetaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormComprobanteTarjeta.jButtonGuardarCambiosComprobanteTarjeta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosComprobanteTarjetaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarComprobanteTarjeta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosComprobanteTarjetaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosComprobanteTarjeta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosComprobanteTarjetaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaComprobanteTarjeta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosComprobanteTarjetaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarComprobanteTarjeta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosComprobanteTarjetaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaComprobanteTarjeta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosComprobanteTarjetaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosComprobanteTarjeta";
		inputMap = this.jInternalFrameDetalleFormComprobanteTarjeta.jButtonGuardarCambiosComprobanteTarjeta.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormComprobanteTarjeta.jButtonGuardarCambiosComprobanteTarjeta.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosComprobanteTarjetaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionComprobanteTarjeta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionComprobanteTarjetaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarComprobanteTarjeta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionComprobanteTarjetaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionComprobanteTarjeta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionComprobanteTarjetaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresComprobanteTarjeta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresComprobanteTarjetaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarComprobanteTarjeta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresComprobanteTarjetaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresComprobanteTarjeta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresComprobanteTarjetaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesComprobanteTarjeta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesComprobanteTarjetaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarComprobanteTarjeta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesComprobanteTarjetaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesComprobanteTarjeta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesComprobanteTarjetaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosComprobanteTarjeta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosComprobanteTarjetaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarComprobanteTarjeta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosComprobanteTarjetaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosComprobanteTarjeta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosComprobanteTarjetaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosComprobanteTarjeta.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosComprobanteTarjetaItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesComprobanteTarjeta.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesComprobanteTarjetaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarComprobanteTarjeta.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarComprobanteTarjetaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralComprobanteTarjeta.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralComprobanteTarjetaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComprobanteTarjeta.jButtonidComprobanteTarjetaBusqueda.addActionListener(new ButtonActionListener(this,"idComprobanteTarjetaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormComprobanteTarjeta.jButtonid_empresaComprobanteTarjetaUpdate.addActionListener(new ButtonActionListener(this,"id_empresaComprobanteTarjetaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComprobanteTarjeta.jButtonid_empresaComprobanteTarjetaBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaComprobanteTarjetaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormComprobanteTarjeta.jButtonid_sucursalComprobanteTarjetaUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalComprobanteTarjetaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComprobanteTarjeta.jButtonid_sucursalComprobanteTarjetaBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalComprobanteTarjetaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormComprobanteTarjeta.jButtonid_clienteComprobanteTarjetaUpdate.addActionListener(new ButtonActionListener(this,"id_clienteComprobanteTarjetaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComprobanteTarjeta.jButtonid_clienteComprobanteTarjetaBusqueda.addActionListener(new ButtonActionListener(this,"id_clienteComprobanteTarjetaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormComprobanteTarjeta.jButtonid_cajaComprobanteTarjetaUpdate.addActionListener(new ButtonActionListener(this,"id_cajaComprobanteTarjetaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComprobanteTarjeta.jButtonid_cajaComprobanteTarjetaBusqueda.addActionListener(new ButtonActionListener(this,"id_cajaComprobanteTarjetaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComprobanteTarjeta.jButtonfecha_inicioComprobanteTarjetaBusqueda.addActionListener(new ButtonActionListener(this,"fecha_inicioComprobanteTarjetaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComprobanteTarjeta.jButtonfecha_finComprobanteTarjetaBusqueda.addActionListener(new ButtonActionListener(this,"fecha_finComprobanteTarjetaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComprobanteTarjeta.jButtonnombre_cajaComprobanteTarjetaBusqueda.addActionListener(new ButtonActionListener(this,"nombre_cajaComprobanteTarjetaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComprobanteTarjeta.jButtonsecuencialComprobanteTarjetaBusqueda.addActionListener(new ButtonActionListener(this,"secuencialComprobanteTarjetaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComprobanteTarjeta.jButtonfechaComprobanteTarjetaBusqueda.addActionListener(new ButtonActionListener(this,"fechaComprobanteTarjetaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComprobanteTarjeta.jButtoncodigo_clienteComprobanteTarjetaBusqueda.addActionListener(new ButtonActionListener(this,"codigo_clienteComprobanteTarjetaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComprobanteTarjeta.jButtonnombre_clienteComprobanteTarjetaBusqueda.addActionListener(new ButtonActionListener(this,"nombre_clienteComprobanteTarjetaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComprobanteTarjeta.jButtonsubtotalComprobanteTarjetaBusqueda.addActionListener(new ButtonActionListener(this,"subtotalComprobanteTarjetaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComprobanteTarjeta.jButtonivaComprobanteTarjetaBusqueda.addActionListener(new ButtonActionListener(this,"ivaComprobanteTarjetaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComprobanteTarjeta.jButtondescuentoComprobanteTarjetaBusqueda.addActionListener(new ButtonActionListener(this,"descuentoComprobanteTarjetaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComprobanteTarjeta.jButtonfinanciamientoComprobanteTarjetaBusqueda.addActionListener(new ButtonActionListener(this,"financiamientoComprobanteTarjetaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComprobanteTarjeta.jButtonfleteComprobanteTarjetaBusqueda.addActionListener(new ButtonActionListener(this,"fleteComprobanteTarjetaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComprobanteTarjeta.jButtoniceComprobanteTarjetaBusqueda.addActionListener(new ButtonActionListener(this,"iceComprobanteTarjetaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComprobanteTarjeta.jButtontotalComprobanteTarjetaBusqueda.addActionListener(new ButtonActionListener(this,"totalComprobanteTarjetaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComprobanteTarjeta.jButtonvalorComprobanteTarjetaBusqueda.addActionListener(new ButtonActionListener(this,"valorComprobanteTarjetaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComprobanteTarjeta.jButtonfecha_forma_pagoComprobanteTarjetaBusqueda.addActionListener(new ButtonActionListener(this,"fecha_forma_pagoComprobanteTarjetaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComprobanteTarjeta.jButtonnumeroComprobanteTarjetaBusqueda.addActionListener(new ButtonActionListener(this,"numeroComprobanteTarjetaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComprobanteTarjeta.jButtontarjeta_habienteComprobanteTarjetaBusqueda.addActionListener(new ButtonActionListener(this,"tarjeta_habienteComprobanteTarjetaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComprobanteTarjeta.jButtonautorizacionComprobanteTarjetaBusqueda.addActionListener(new ButtonActionListener(this,"autorizacionComprobanteTarjetaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComprobanteTarjeta.jButtonvoucherComprobanteTarjetaBusqueda.addActionListener(new ButtonActionListener(this,"voucherComprobanteTarjetaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComprobanteTarjeta.jButtonloteComprobanteTarjetaBusqueda.addActionListener(new ButtonActionListener(this,"loteComprobanteTarjetaBusqueda"));
		
		
		this.jButtonBusquedaComprobanteTarjetaComprobanteTarjeta.addActionListener(new ButtonActionListener(this,"BusquedaComprobanteTarjetaComprobanteTarjeta"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoComprobanteTarjeta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoComprobanteTarjetaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoComprobanteTarjeta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoComprobanteTarjetaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoComprobanteTarjeta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoComprobanteTarjetaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionComprobanteTarjeta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionComprobanteTarjetaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionComprobanteTarjeta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionComprobanteTarjetaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionComprobanteTarjeta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionComprobanteTarjetaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarComprobanteTarjetaActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarComprobanteTarjeta.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComprobanteTarjetaConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosComprobanteTarjeta(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(ComprobanteTarjeta comprobantetarjetaAux:this.comprobantetarjetaLogic.getComprobanteTarjetas()) {
					comprobantetarjetaAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ComprobanteTarjeta comprobantetarjetaAux:comprobantetarjetas) {
					comprobantetarjetaAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComprobanteTarjetaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosComprobanteTarjetaItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingComprobanteTarjeta(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(ComprobanteTarjeta comprobantetarjetaAux:this.comprobantetarjetaLogic.getComprobanteTarjetas()) {
						comprobantetarjetaAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ComprobanteTarjeta comprobantetarjetaAux:comprobantetarjetas) {
						comprobantetarjetaAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(ComprobanteTarjeta comprobantetarjetaAux:this.comprobantetarjetaLogic.getComprobanteTarjetas()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ComprobanteTarjeta comprobantetarjetaAux:comprobantetarjetas) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaComprobanteTarjeta(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosComprobanteTarjeta.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosComprobanteTarjeta.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosComprobanteTarjeta,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComprobanteTarjetaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosComprobanteTarjetaItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingComprobanteTarjeta(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosComprobanteTarjeta.getSelectedRows();
			
			ComprobanteTarjeta comprobantetarjetaLocal=new ComprobanteTarjeta();
			
			//this.seleccionarTodosComprobanteTarjeta(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					comprobantetarjetaLocal =(ComprobanteTarjeta) this.comprobantetarjetaLogic.getComprobanteTarjetas().toArray()[this.jTableDatosComprobanteTarjeta.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					comprobantetarjetaLocal =(ComprobanteTarjeta) this.comprobantetarjetas.toArray()[this.jTableDatosComprobanteTarjeta.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				comprobantetarjetaLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(ComprobanteTarjeta comprobantetarjetaAux:this.comprobantetarjetaLogic.getComprobanteTarjetas()) {
						comprobantetarjetaAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ComprobanteTarjeta comprobantetarjetaAux:comprobantetarjetas) {
						comprobantetarjetaAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaComprobanteTarjeta(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosComprobanteTarjeta.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosComprobanteTarjeta.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosComprobanteTarjeta,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComprobanteTarjetaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualComprobanteTarjetaItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComprobanteTarjetaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarComprobanteTarjetaParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComprobanteTarjetaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralComprobanteTarjetaActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingComprobanteTarjeta(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralComprobanteTarjeta.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(ComprobanteTarjeta comprobantetarjetaAux:this.comprobantetarjetaLogic.getComprobanteTarjetas()) {
				
						if(sTipoSeleccionar.equals(ComprobanteTarjetaConstantesFunciones.LABEL_FECHAINICIO)) {
							existe=true;
							comprobantetarjetaAux.setfecha_inicio(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ComprobanteTarjetaConstantesFunciones.LABEL_FECHAFIN)) {
							existe=true;
							comprobantetarjetaAux.setfecha_fin(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ComprobanteTarjetaConstantesFunciones.LABEL_NOMBRECAJA)) {
							existe=true;
							comprobantetarjetaAux.setnombre_caja(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ComprobanteTarjetaConstantesFunciones.LABEL_SECUENCIAL)) {
							existe=true;
							comprobantetarjetaAux.setsecuencial(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ComprobanteTarjetaConstantesFunciones.LABEL_FECHA)) {
							existe=true;
							comprobantetarjetaAux.setfecha(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ComprobanteTarjetaConstantesFunciones.LABEL_CODIGOCLIENTE)) {
							existe=true;
							comprobantetarjetaAux.setcodigo_cliente(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ComprobanteTarjetaConstantesFunciones.LABEL_NOMBRECLIENTE)) {
							existe=true;
							comprobantetarjetaAux.setnombre_cliente(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ComprobanteTarjetaConstantesFunciones.LABEL_SUBTOTAL)) {
							existe=true;
							comprobantetarjetaAux.setsubtotal(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ComprobanteTarjetaConstantesFunciones.LABEL_IVA)) {
							existe=true;
							comprobantetarjetaAux.setiva(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ComprobanteTarjetaConstantesFunciones.LABEL_DESCUENTO)) {
							existe=true;
							comprobantetarjetaAux.setdescuento(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ComprobanteTarjetaConstantesFunciones.LABEL_FINANCIAMIENTO)) {
							existe=true;
							comprobantetarjetaAux.setfinanciamiento(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ComprobanteTarjetaConstantesFunciones.LABEL_FLETE)) {
							existe=true;
							comprobantetarjetaAux.setflete(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ComprobanteTarjetaConstantesFunciones.LABEL_ICE)) {
							existe=true;
							comprobantetarjetaAux.setice(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ComprobanteTarjetaConstantesFunciones.LABEL_TOTAL)) {
							existe=true;
							comprobantetarjetaAux.settotal(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ComprobanteTarjetaConstantesFunciones.LABEL_VALOR)) {
							existe=true;
							comprobantetarjetaAux.setvalor(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ComprobanteTarjetaConstantesFunciones.LABEL_FECHAFORMAPAGO)) {
							existe=true;
							comprobantetarjetaAux.setfecha_forma_pago(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ComprobanteTarjetaConstantesFunciones.LABEL_NUMERO)) {
							existe=true;
							comprobantetarjetaAux.setnumero(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ComprobanteTarjetaConstantesFunciones.LABEL_TARJETAHABIENTE)) {
							existe=true;
							comprobantetarjetaAux.settarjeta_habiente(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ComprobanteTarjetaConstantesFunciones.LABEL_AUTORIZACION)) {
							existe=true;
							comprobantetarjetaAux.setautorizacion(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ComprobanteTarjetaConstantesFunciones.LABEL_VOUCHER)) {
							existe=true;
							comprobantetarjetaAux.setvoucher(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ComprobanteTarjetaConstantesFunciones.LABEL_LOTE)) {
							existe=true;
							comprobantetarjetaAux.setlote(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ComprobanteTarjeta comprobantetarjetaAux:comprobantetarjetas) {
					
						if(sTipoSeleccionar.equals(ComprobanteTarjetaConstantesFunciones.LABEL_FECHAINICIO)) {
							existe=true;
							comprobantetarjetaAux.setfecha_inicio(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ComprobanteTarjetaConstantesFunciones.LABEL_FECHAFIN)) {
							existe=true;
							comprobantetarjetaAux.setfecha_fin(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ComprobanteTarjetaConstantesFunciones.LABEL_NOMBRECAJA)) {
							existe=true;
							comprobantetarjetaAux.setnombre_caja(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ComprobanteTarjetaConstantesFunciones.LABEL_SECUENCIAL)) {
							existe=true;
							comprobantetarjetaAux.setsecuencial(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ComprobanteTarjetaConstantesFunciones.LABEL_FECHA)) {
							existe=true;
							comprobantetarjetaAux.setfecha(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ComprobanteTarjetaConstantesFunciones.LABEL_CODIGOCLIENTE)) {
							existe=true;
							comprobantetarjetaAux.setcodigo_cliente(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ComprobanteTarjetaConstantesFunciones.LABEL_NOMBRECLIENTE)) {
							existe=true;
							comprobantetarjetaAux.setnombre_cliente(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ComprobanteTarjetaConstantesFunciones.LABEL_SUBTOTAL)) {
							existe=true;
							comprobantetarjetaAux.setsubtotal(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ComprobanteTarjetaConstantesFunciones.LABEL_IVA)) {
							existe=true;
							comprobantetarjetaAux.setiva(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ComprobanteTarjetaConstantesFunciones.LABEL_DESCUENTO)) {
							existe=true;
							comprobantetarjetaAux.setdescuento(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ComprobanteTarjetaConstantesFunciones.LABEL_FINANCIAMIENTO)) {
							existe=true;
							comprobantetarjetaAux.setfinanciamiento(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ComprobanteTarjetaConstantesFunciones.LABEL_FLETE)) {
							existe=true;
							comprobantetarjetaAux.setflete(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ComprobanteTarjetaConstantesFunciones.LABEL_ICE)) {
							existe=true;
							comprobantetarjetaAux.setice(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ComprobanteTarjetaConstantesFunciones.LABEL_TOTAL)) {
							existe=true;
							comprobantetarjetaAux.settotal(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ComprobanteTarjetaConstantesFunciones.LABEL_VALOR)) {
							existe=true;
							comprobantetarjetaAux.setvalor(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ComprobanteTarjetaConstantesFunciones.LABEL_FECHAFORMAPAGO)) {
							existe=true;
							comprobantetarjetaAux.setfecha_forma_pago(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ComprobanteTarjetaConstantesFunciones.LABEL_NUMERO)) {
							existe=true;
							comprobantetarjetaAux.setnumero(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ComprobanteTarjetaConstantesFunciones.LABEL_TARJETAHABIENTE)) {
							existe=true;
							comprobantetarjetaAux.settarjeta_habiente(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ComprobanteTarjetaConstantesFunciones.LABEL_AUTORIZACION)) {
							existe=true;
							comprobantetarjetaAux.setautorizacion(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ComprobanteTarjetaConstantesFunciones.LABEL_VOUCHER)) {
							existe=true;
							comprobantetarjetaAux.setvoucher(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ComprobanteTarjetaConstantesFunciones.LABEL_LOTE)) {
							existe=true;
							comprobantetarjetaAux.setlote(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaComprobanteTarjeta(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComprobanteTarjetaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesComprobanteTarjetaActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingComprobanteTarjeta(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioComprobanteTarjeta=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesComprobanteTarjeta.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormComprobanteTarjeta.jComboBoxTiposAccionesFormularioComprobanteTarjeta.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteComprobanteTarjeta) {				
					conSplash=true;//false;										
					
					//this.startProcessComprobanteTarjeta(conSplash);
				
					this.generarReporteComprobanteTarjetasSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesComprobanteTarjeta.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormComprobanteTarjeta.jComboBoxTiposAccionesFormularioComprobanteTarjeta.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoComprobanteTarjetasSeleccionados();
				//this.jComboBoxTiposAccionesComprobanteTarjeta.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoComprobanteTarjetasSeleccionados(false);
				//this.jComboBoxTiposAccionesComprobanteTarjeta.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoComprobanteTarjetasSeleccionados(true);
				//this.jComboBoxTiposAccionesComprobanteTarjeta.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessComprobanteTarjeta();
				
				this.exportarComprobanteTarjetasSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesComprobanteTarjeta.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormComprobanteTarjeta.jComboBoxTiposAccionesFormularioComprobanteTarjeta.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionComprobanteTarjetas();
				//this.importarComprobanteTarjetas();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesComprobanteTarjeta.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormComprobanteTarjeta.jComboBoxTiposAccionesFormularioComprobanteTarjeta.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessComprobanteTarjeta();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelComprobanteTarjetasSeleccionados();
				//this.jComboBoxTiposAccionesComprobanteTarjeta.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Comprobante Tarjeta", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessComprobanteTarjeta();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoComprobanteTarjeta)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyComprobanteTarjeta(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Comprobante Tarjeta",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesComprobanteTarjeta.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormComprobanteTarjeta.jComboBoxTiposAccionesFormularioComprobanteTarjeta.setSelectedIndex(0);					
				}	
			} 			
			else if(ComprobanteTarjetaBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteComprobanteTarjeta) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessComprobanteTarjeta(conSplash);
					
						//this.actualizarParametrosGeneralComprobanteTarjeta();
						
						this.generarReporteProcesoAccionComprobanteTarjetasSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesComprobanteTarjeta.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormComprobanteTarjeta.jComboBoxTiposAccionesFormularioComprobanteTarjeta.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(ComprobanteTarjetaBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Comprobante TarjetaS SELECCIONADOS?", "MANTENIMIENTO DE Comprobante Tarjeta", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessComprobanteTarjeta();
				
						this.actualizarParametrosGeneralComprobanteTarjeta();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.comprobantetarjetaReturnGeneral=comprobantetarjetaLogic.procesarAccionComprobanteTarjetasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.comprobantetarjetaLogic.getComprobanteTarjetas(),this.comprobantetarjetaParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarComprobanteTarjetaReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesComprobanteTarjeta.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormComprobanteTarjeta.jComboBoxTiposAccionesFormularioComprobanteTarjeta.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralComprobanteTarjeta();
					
					ComprobanteTarjetaBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarComprobanteTarjetaReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesComprobanteTarjeta.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormComprobanteTarjeta.jComboBoxTiposAccionesFormularioComprobanteTarjeta.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,ComprobanteTarjetaConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessComprobanteTarjeta(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesComprobanteTarjetaActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessComprobanteTarjeta();
			
			if(this.jInternalFrameDetalleFormComprobanteTarjeta==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<ComprobanteTarjeta> comprobantetarjetasSeleccionados=new ArrayList<ComprobanteTarjeta>();		
			ComprobanteTarjeta comprobantetarjeta=new ComprobanteTarjeta();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingComprobanteTarjeta(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesComprobanteTarjeta.getSelectedItem();
			
			
			
			
			comprobantetarjetasSeleccionados=this.getComprobanteTarjetasSeleccionados(true);
			//this.sTipoAccion;
			
			if(comprobantetarjetasSeleccionados.size()==1) {
				for(ComprobanteTarjeta comprobantetarjetaAux:comprobantetarjetasSeleccionados) {
					comprobantetarjeta=comprobantetarjetaAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComprobanteTarjetaConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessComprobanteTarjeta();
			
      		//this.finishProcessComprobanteTarjeta(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarComprobanteTarjetaReturnGeneral() throws Exception {
		if(this.comprobantetarjetaReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.comprobantetarjetaReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.comprobantetarjetaReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.comprobantetarjetaReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.comprobantetarjetaReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.comprobantetarjetaReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingComprobanteTarjeta(false);
		}
		
		if(this.comprobantetarjetaReturnGeneral.getConRetornoLista() || this.comprobantetarjetaReturnGeneral.getConRetornoObjeto()) {
			if(this.comprobantetarjetaReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.comprobantetarjetaLogic.setComprobanteTarjetas(this.comprobantetarjetaReturnGeneral.getComprobanteTarjetas());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			
			this.inicializarActualizarBindingComprobanteTarjeta(false);
		}
	}
	
	public void actualizarParametrosGeneralComprobanteTarjeta() throws Exception {
		
		
	}
	
	public ArrayList<ComprobanteTarjeta> getComprobanteTarjetasSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<ComprobanteTarjeta> comprobantetarjetasSeleccionados=new ArrayList<ComprobanteTarjeta>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioComprobanteTarjeta) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(ComprobanteTarjeta comprobantetarjetaAux:comprobantetarjetaLogic.getComprobanteTarjetas()) {
					if(comprobantetarjetaAux.getIsSelected()) {
						comprobantetarjetasSeleccionados.add(comprobantetarjetaAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ComprobanteTarjeta comprobantetarjetaAux:this.comprobantetarjetas) {
					if(comprobantetarjetaAux.getIsSelected()) {
						comprobantetarjetasSeleccionados.add(comprobantetarjetaAux);				
					}
				}
			}
			
			if(comprobantetarjetasSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						comprobantetarjetasSeleccionados.addAll(this.comprobantetarjetaLogic.getComprobanteTarjetas());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						comprobantetarjetasSeleccionados.addAll(this.comprobantetarjetas);				
					}
				}
			}
		} else {
			comprobantetarjetasSeleccionados.add(this.comprobantetarjeta);
		}
		
		return comprobantetarjetasSeleccionados;
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
	
	public void generarReporteComprobanteTarjetasSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalComprobanteTarjetasSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoComprobanteTarjetasSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoComprobanteTarjetasSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoComprobanteTarjetasSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Comprobante Tarjeta",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesComprobanteTarjetasSeleccionados() throws Exception {
		ArrayList<ComprobanteTarjeta> comprobantetarjetasSeleccionados=new ArrayList<ComprobanteTarjeta>();		
		
		comprobantetarjetasSeleccionados=this.getComprobanteTarjetasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteComprobanteTarjetas("Todos",comprobantetarjetasSeleccionados);
		
	}	
	
	public void generarReporteNormalComprobanteTarjetasSeleccionados() throws Exception {
		ArrayList<ComprobanteTarjeta> comprobantetarjetasSeleccionados=new ArrayList<ComprobanteTarjeta>();		
		
		comprobantetarjetasSeleccionados=this.getComprobanteTarjetasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteComprobanteTarjetas("Todos",comprobantetarjetasSeleccionados);
	}		
	
	public void generarReporteProcesoAccionComprobanteTarjetasSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<ComprobanteTarjeta> comprobantetarjetasSeleccionados=new ArrayList<ComprobanteTarjeta>();
		
		comprobantetarjetasSeleccionados=this.getComprobanteTarjetasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteComprobanteTarjetas("Todos",comprobantetarjetasSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoComprobanteTarjetasSeleccionados() throws Exception {
		ArrayList<ComprobanteTarjeta> comprobantetarjetasSeleccionados=new ArrayList<ComprobanteTarjeta>();		
		
		
		this.abrirInicializarFrameReporteDinamicoComprobanteTarjeta();
		
		
		comprobantetarjetasSeleccionados=this.getComprobanteTarjetasSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoComprobanteTarjeta();
		
		
		//this.generarReporteComprobanteTarjetas("Todos",comprobantetarjetasSeleccionados ,comprobantetarjetaImplementable,comprobantetarjetaImplementableHome);
	}
	
	public void mostrarImportacionComprobanteTarjetas() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionComprobanteTarjeta();
		
		this.abrirFrameImportacionComprobanteTarjeta();		
		
			
		//this.generarReporteComprobanteTarjetas("Todos",comprobantetarjetasSeleccionados ,comprobantetarjetaImplementable,comprobantetarjetaImplementableHome);
	}
	
	public void importarComprobanteTarjetas() throws Exception {		
	
	}
	
	public void exportarComprobanteTarjetasSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelComprobanteTarjetasSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoComprobanteTarjetasSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlComprobanteTarjetasSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Comprobante Tarjeta",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoComprobanteTarjetasSeleccionados() throws Exception {
		ArrayList<ComprobanteTarjeta> comprobantetarjetasSeleccionados=new ArrayList<ComprobanteTarjeta>();		
		
		comprobantetarjetasSeleccionados=this.getComprobanteTarjetasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"comprobantetarjeta."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarComprobanteTarjeta(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(ComprobanteTarjeta comprobantetarjetaAux:comprobantetarjetasSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarComprobanteTarjeta(comprobantetarjetaAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//comprobantetarjetaAux.setsDetalleGeneralEntityReporte(comprobantetarjetaAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.comprobantetarjetaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Comprobante Tarjeta",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarComprobanteTarjeta(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=ComprobanteTarjetaConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ComprobanteTarjetaConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ComprobanteTarjetaConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ComprobanteTarjetaConstantesFunciones.LABEL_IDSUCURSAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ComprobanteTarjetaConstantesFunciones.LABEL_IDCLIENTE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ComprobanteTarjetaConstantesFunciones.LABEL_IDCAJA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ComprobanteTarjetaConstantesFunciones.LABEL_FECHAINICIO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ComprobanteTarjetaConstantesFunciones.LABEL_FECHAFIN;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ComprobanteTarjetaConstantesFunciones.LABEL_NOMBRECAJA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ComprobanteTarjetaConstantesFunciones.LABEL_SECUENCIAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ComprobanteTarjetaConstantesFunciones.LABEL_FECHA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ComprobanteTarjetaConstantesFunciones.LABEL_CODIGOCLIENTE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ComprobanteTarjetaConstantesFunciones.LABEL_NOMBRECLIENTE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ComprobanteTarjetaConstantesFunciones.LABEL_SUBTOTAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ComprobanteTarjetaConstantesFunciones.LABEL_IVA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ComprobanteTarjetaConstantesFunciones.LABEL_DESCUENTO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ComprobanteTarjetaConstantesFunciones.LABEL_FINANCIAMIENTO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ComprobanteTarjetaConstantesFunciones.LABEL_FLETE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ComprobanteTarjetaConstantesFunciones.LABEL_ICE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ComprobanteTarjetaConstantesFunciones.LABEL_TOTAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ComprobanteTarjetaConstantesFunciones.LABEL_VALOR;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ComprobanteTarjetaConstantesFunciones.LABEL_FECHAFORMAPAGO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ComprobanteTarjetaConstantesFunciones.LABEL_NUMERO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ComprobanteTarjetaConstantesFunciones.LABEL_TARJETAHABIENTE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ComprobanteTarjetaConstantesFunciones.LABEL_AUTORIZACION;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ComprobanteTarjetaConstantesFunciones.LABEL_VOUCHER;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ComprobanteTarjetaConstantesFunciones.LABEL_LOTE;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarComprobanteTarjeta(ComprobanteTarjeta comprobantetarjeta,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=comprobantetarjeta.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=comprobantetarjeta.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=comprobantetarjeta.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=comprobantetarjeta.getsucursal_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=comprobantetarjeta.getcliente_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=comprobantetarjeta.getcaja_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=comprobantetarjeta.getfecha_inicio().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=comprobantetarjeta.getfecha_fin().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=comprobantetarjeta.getnombre_caja();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=comprobantetarjeta.getsecuencial();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=comprobantetarjeta.getfecha().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=comprobantetarjeta.getcodigo_cliente();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=comprobantetarjeta.getnombre_cliente();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=comprobantetarjeta.getsubtotal().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=comprobantetarjeta.getiva().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=comprobantetarjeta.getdescuento().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=comprobantetarjeta.getfinanciamiento().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=comprobantetarjeta.getflete().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=comprobantetarjeta.getice().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=comprobantetarjeta.gettotal().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=comprobantetarjeta.getvalor().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=comprobantetarjeta.getfecha_forma_pago().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=comprobantetarjeta.getnumero();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=comprobantetarjeta.gettarjeta_habiente();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=comprobantetarjeta.getautorizacion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=comprobantetarjeta.getvoucher();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=comprobantetarjeta.getlote();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelComprobanteTarjetasSeleccionados() throws Exception {
		ArrayList<ComprobanteTarjeta> comprobantetarjetasSeleccionados=new ArrayList<ComprobanteTarjeta>();		
		
		comprobantetarjetasSeleccionados=this.getComprobanteTarjetasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"comprobantetarjeta.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("ComprobanteTarjetas");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelComprobanteTarjeta(row);				
				iRow++;
			}				
			
			for(ComprobanteTarjeta comprobantetarjetaAux:comprobantetarjetasSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelComprobanteTarjeta(comprobantetarjetaAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.comprobantetarjetaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Comprobante Tarjeta",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlComprobanteTarjetasSeleccionados() throws Exception {
		ArrayList<ComprobanteTarjeta> comprobantetarjetasSeleccionados=new ArrayList<ComprobanteTarjeta>();		
		
		comprobantetarjetasSeleccionados=this.getComprobanteTarjetasSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"comprobantetarjeta.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("comprobantetarjetas");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("comprobantetarjeta");
			//elementRoot.appendChild(element);
		
			for(ComprobanteTarjeta comprobantetarjetaAux:comprobantetarjetasSeleccionados) {
				element = document.createElement("comprobantetarjeta");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlComprobanteTarjeta(comprobantetarjetaAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.comprobantetarjetaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Comprobante Tarjeta",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelComprobanteTarjeta(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(ComprobanteTarjetaConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(ComprobanteTarjetaConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(ComprobanteTarjetaConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(ComprobanteTarjetaConstantesFunciones.LABEL_IDSUCURSAL);
		cell = row.createCell(iColumn++);cell.setCellValue(ComprobanteTarjetaConstantesFunciones.LABEL_IDCLIENTE);
		cell = row.createCell(iColumn++);cell.setCellValue(ComprobanteTarjetaConstantesFunciones.LABEL_IDCAJA);
		cell = row.createCell(iColumn++);cell.setCellValue(ComprobanteTarjetaConstantesFunciones.LABEL_FECHAINICIO);
		cell = row.createCell(iColumn++);cell.setCellValue(ComprobanteTarjetaConstantesFunciones.LABEL_FECHAFIN);
		cell = row.createCell(iColumn++);cell.setCellValue(ComprobanteTarjetaConstantesFunciones.LABEL_NOMBRECAJA);
		cell = row.createCell(iColumn++);cell.setCellValue(ComprobanteTarjetaConstantesFunciones.LABEL_SECUENCIAL);
		cell = row.createCell(iColumn++);cell.setCellValue(ComprobanteTarjetaConstantesFunciones.LABEL_FECHA);
		cell = row.createCell(iColumn++);cell.setCellValue(ComprobanteTarjetaConstantesFunciones.LABEL_CODIGOCLIENTE);
		cell = row.createCell(iColumn++);cell.setCellValue(ComprobanteTarjetaConstantesFunciones.LABEL_NOMBRECLIENTE);
		cell = row.createCell(iColumn++);cell.setCellValue(ComprobanteTarjetaConstantesFunciones.LABEL_SUBTOTAL);
		cell = row.createCell(iColumn++);cell.setCellValue(ComprobanteTarjetaConstantesFunciones.LABEL_IVA);
		cell = row.createCell(iColumn++);cell.setCellValue(ComprobanteTarjetaConstantesFunciones.LABEL_DESCUENTO);
		cell = row.createCell(iColumn++);cell.setCellValue(ComprobanteTarjetaConstantesFunciones.LABEL_FINANCIAMIENTO);
		cell = row.createCell(iColumn++);cell.setCellValue(ComprobanteTarjetaConstantesFunciones.LABEL_FLETE);
		cell = row.createCell(iColumn++);cell.setCellValue(ComprobanteTarjetaConstantesFunciones.LABEL_ICE);
		cell = row.createCell(iColumn++);cell.setCellValue(ComprobanteTarjetaConstantesFunciones.LABEL_TOTAL);
		cell = row.createCell(iColumn++);cell.setCellValue(ComprobanteTarjetaConstantesFunciones.LABEL_VALOR);
		cell = row.createCell(iColumn++);cell.setCellValue(ComprobanteTarjetaConstantesFunciones.LABEL_FECHAFORMAPAGO);
		cell = row.createCell(iColumn++);cell.setCellValue(ComprobanteTarjetaConstantesFunciones.LABEL_NUMERO);
		cell = row.createCell(iColumn++);cell.setCellValue(ComprobanteTarjetaConstantesFunciones.LABEL_TARJETAHABIENTE);
		cell = row.createCell(iColumn++);cell.setCellValue(ComprobanteTarjetaConstantesFunciones.LABEL_AUTORIZACION);
		cell = row.createCell(iColumn++);cell.setCellValue(ComprobanteTarjetaConstantesFunciones.LABEL_VOUCHER);
		cell = row.createCell(iColumn++);cell.setCellValue(ComprobanteTarjetaConstantesFunciones.LABEL_LOTE);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelComprobanteTarjeta(ComprobanteTarjeta comprobantetarjeta,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(comprobantetarjeta.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(comprobantetarjeta.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(comprobantetarjeta.getsucursal_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(comprobantetarjeta.getcliente_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(comprobantetarjeta.getcaja_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(comprobantetarjeta.getfecha_inicio());
		cell = row.createCell(iColumn++);cell.setCellValue(comprobantetarjeta.getfecha_fin());
		cell = row.createCell(iColumn++);cell.setCellValue(comprobantetarjeta.getnombre_caja());
		cell = row.createCell(iColumn++);cell.setCellValue(comprobantetarjeta.getsecuencial());
		cell = row.createCell(iColumn++);cell.setCellValue(comprobantetarjeta.getfecha());
		cell = row.createCell(iColumn++);cell.setCellValue(comprobantetarjeta.getcodigo_cliente());
		cell = row.createCell(iColumn++);cell.setCellValue(comprobantetarjeta.getnombre_cliente());
		cell = row.createCell(iColumn++);cell.setCellValue(comprobantetarjeta.getsubtotal());
		cell = row.createCell(iColumn++);cell.setCellValue(comprobantetarjeta.getiva());
		cell = row.createCell(iColumn++);cell.setCellValue(comprobantetarjeta.getdescuento());
		cell = row.createCell(iColumn++);cell.setCellValue(comprobantetarjeta.getfinanciamiento());
		cell = row.createCell(iColumn++);cell.setCellValue(comprobantetarjeta.getflete());
		cell = row.createCell(iColumn++);cell.setCellValue(comprobantetarjeta.getice());
		cell = row.createCell(iColumn++);cell.setCellValue(comprobantetarjeta.gettotal());
		cell = row.createCell(iColumn++);cell.setCellValue(comprobantetarjeta.getvalor());
		cell = row.createCell(iColumn++);cell.setCellValue(comprobantetarjeta.getfecha_forma_pago());
		cell = row.createCell(iColumn++);cell.setCellValue(comprobantetarjeta.getnumero());
		cell = row.createCell(iColumn++);cell.setCellValue(comprobantetarjeta.gettarjeta_habiente());
		cell = row.createCell(iColumn++);cell.setCellValue(comprobantetarjeta.getautorizacion());
		cell = row.createCell(iColumn++);cell.setCellValue(comprobantetarjeta.getvoucher());
		cell = row.createCell(iColumn++);cell.setCellValue(comprobantetarjeta.getlote());				
	}
	
	public void setFilaDatosExportarXmlComprobanteTarjeta(ComprobanteTarjeta comprobantetarjeta,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(ComprobanteTarjetaConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(comprobantetarjeta.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(ComprobanteTarjetaConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(comprobantetarjeta.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(ComprobanteTarjetaConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(comprobantetarjeta.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementsucursal_descripcion = document.createElement(ComprobanteTarjetaConstantesFunciones.IDSUCURSAL);
		elementsucursal_descripcion.appendChild(document.createTextNode(comprobantetarjeta.getsucursal_descripcion()));
		element.appendChild(elementsucursal_descripcion);

		Element elementcliente_descripcion = document.createElement(ComprobanteTarjetaConstantesFunciones.IDCLIENTE);
		elementcliente_descripcion.appendChild(document.createTextNode(comprobantetarjeta.getcliente_descripcion()));
		element.appendChild(elementcliente_descripcion);

		Element elementcaja_descripcion = document.createElement(ComprobanteTarjetaConstantesFunciones.IDCAJA);
		elementcaja_descripcion.appendChild(document.createTextNode(comprobantetarjeta.getcaja_descripcion()));
		element.appendChild(elementcaja_descripcion);

		Element elementfecha_inicio = document.createElement(ComprobanteTarjetaConstantesFunciones.FECHAINICIO);
		elementfecha_inicio.appendChild(document.createTextNode(comprobantetarjeta.getfecha_inicio().toString().trim()));
		element.appendChild(elementfecha_inicio);

		Element elementfecha_fin = document.createElement(ComprobanteTarjetaConstantesFunciones.FECHAFIN);
		elementfecha_fin.appendChild(document.createTextNode(comprobantetarjeta.getfecha_fin().toString().trim()));
		element.appendChild(elementfecha_fin);

		Element elementnombre_caja = document.createElement(ComprobanteTarjetaConstantesFunciones.NOMBRECAJA);
		elementnombre_caja.appendChild(document.createTextNode(comprobantetarjeta.getnombre_caja().trim()));
		element.appendChild(elementnombre_caja);

		Element elementsecuencial = document.createElement(ComprobanteTarjetaConstantesFunciones.SECUENCIAL);
		elementsecuencial.appendChild(document.createTextNode(comprobantetarjeta.getsecuencial().trim()));
		element.appendChild(elementsecuencial);

		Element elementfecha = document.createElement(ComprobanteTarjetaConstantesFunciones.FECHA);
		elementfecha.appendChild(document.createTextNode(comprobantetarjeta.getfecha().toString().trim()));
		element.appendChild(elementfecha);

		Element elementcodigo_cliente = document.createElement(ComprobanteTarjetaConstantesFunciones.CODIGOCLIENTE);
		elementcodigo_cliente.appendChild(document.createTextNode(comprobantetarjeta.getcodigo_cliente().trim()));
		element.appendChild(elementcodigo_cliente);

		Element elementnombre_cliente = document.createElement(ComprobanteTarjetaConstantesFunciones.NOMBRECLIENTE);
		elementnombre_cliente.appendChild(document.createTextNode(comprobantetarjeta.getnombre_cliente().trim()));
		element.appendChild(elementnombre_cliente);

		Element elementsubtotal = document.createElement(ComprobanteTarjetaConstantesFunciones.SUBTOTAL);
		elementsubtotal.appendChild(document.createTextNode(comprobantetarjeta.getsubtotal().toString().trim()));
		element.appendChild(elementsubtotal);

		Element elementiva = document.createElement(ComprobanteTarjetaConstantesFunciones.IVA);
		elementiva.appendChild(document.createTextNode(comprobantetarjeta.getiva().toString().trim()));
		element.appendChild(elementiva);

		Element elementdescuento = document.createElement(ComprobanteTarjetaConstantesFunciones.DESCUENTO);
		elementdescuento.appendChild(document.createTextNode(comprobantetarjeta.getdescuento().toString().trim()));
		element.appendChild(elementdescuento);

		Element elementfinanciamiento = document.createElement(ComprobanteTarjetaConstantesFunciones.FINANCIAMIENTO);
		elementfinanciamiento.appendChild(document.createTextNode(comprobantetarjeta.getfinanciamiento().toString().trim()));
		element.appendChild(elementfinanciamiento);

		Element elementflete = document.createElement(ComprobanteTarjetaConstantesFunciones.FLETE);
		elementflete.appendChild(document.createTextNode(comprobantetarjeta.getflete().toString().trim()));
		element.appendChild(elementflete);

		Element elementice = document.createElement(ComprobanteTarjetaConstantesFunciones.ICE);
		elementice.appendChild(document.createTextNode(comprobantetarjeta.getice().toString().trim()));
		element.appendChild(elementice);

		Element elementtotal = document.createElement(ComprobanteTarjetaConstantesFunciones.TOTAL);
		elementtotal.appendChild(document.createTextNode(comprobantetarjeta.gettotal().toString().trim()));
		element.appendChild(elementtotal);

		Element elementvalor = document.createElement(ComprobanteTarjetaConstantesFunciones.VALOR);
		elementvalor.appendChild(document.createTextNode(comprobantetarjeta.getvalor().toString().trim()));
		element.appendChild(elementvalor);

		Element elementfecha_forma_pago = document.createElement(ComprobanteTarjetaConstantesFunciones.FECHAFORMAPAGO);
		elementfecha_forma_pago.appendChild(document.createTextNode(comprobantetarjeta.getfecha_forma_pago().toString().trim()));
		element.appendChild(elementfecha_forma_pago);

		Element elementnumero = document.createElement(ComprobanteTarjetaConstantesFunciones.NUMERO);
		elementnumero.appendChild(document.createTextNode(comprobantetarjeta.getnumero().trim()));
		element.appendChild(elementnumero);

		Element elementtarjeta_habiente = document.createElement(ComprobanteTarjetaConstantesFunciones.TARJETAHABIENTE);
		elementtarjeta_habiente.appendChild(document.createTextNode(comprobantetarjeta.gettarjeta_habiente().trim()));
		element.appendChild(elementtarjeta_habiente);

		Element elementautorizacion = document.createElement(ComprobanteTarjetaConstantesFunciones.AUTORIZACION);
		elementautorizacion.appendChild(document.createTextNode(comprobantetarjeta.getautorizacion().trim()));
		element.appendChild(elementautorizacion);

		Element elementvoucher = document.createElement(ComprobanteTarjetaConstantesFunciones.VOUCHER);
		elementvoucher.appendChild(document.createTextNode(comprobantetarjeta.getvoucher().trim()));
		element.appendChild(elementvoucher);

		Element elementlote = document.createElement(ComprobanteTarjetaConstantesFunciones.LOTE);
		elementlote.appendChild(document.createTextNode(comprobantetarjeta.getlote().trim()));
		element.appendChild(elementlote);
	}
	
	public void generarReporteGroupGenericoComprobanteTarjetasSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<ComprobanteTarjeta> comprobantetarjetasSeleccionados=new ArrayList<ComprobanteTarjeta>();
		
		comprobantetarjetasSeleccionados=this.getComprobanteTarjetasSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoComprobanteTarjeta(comprobantetarjetasSeleccionados);
		
		this.generarReporteComprobanteTarjetas("Todos",comprobantetarjetasSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoComprobanteTarjeta(ArrayList<ComprobanteTarjeta> comprobantetarjetasSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(ComprobanteTarjeta comprobantetarjetaAux:comprobantetarjetasSeleccionados) {
				comprobantetarjetaAux.setsDetalleGeneralEntityReporte(comprobantetarjetaAux.toString());
			
				if(sTipoSeleccionar.equals(ComprobanteTarjetaConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					comprobantetarjetaAux.setsDescripcionGeneralEntityReporte1(comprobantetarjetaAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ComprobanteTarjetaConstantesFunciones.LABEL_IDSUCURSAL)) {
					existe=true;
					comprobantetarjetaAux.setsDescripcionGeneralEntityReporte1(comprobantetarjetaAux.getsucursal_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ComprobanteTarjetaConstantesFunciones.LABEL_IDCLIENTE)) {
					existe=true;
					comprobantetarjetaAux.setsDescripcionGeneralEntityReporte1(comprobantetarjetaAux.getcliente_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ComprobanteTarjetaConstantesFunciones.LABEL_IDCAJA)) {
					existe=true;
					comprobantetarjetaAux.setsDescripcionGeneralEntityReporte1(comprobantetarjetaAux.getcaja_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ComprobanteTarjetaConstantesFunciones.LABEL_FECHAINICIO)) {
					existe=true;
					comprobantetarjetaAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(comprobantetarjetaAux.getfecha_inicio()));
				}
				 else if(sTipoSeleccionar.equals(ComprobanteTarjetaConstantesFunciones.LABEL_FECHAFIN)) {
					existe=true;
					comprobantetarjetaAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(comprobantetarjetaAux.getfecha_fin()));
				}
				 else if(sTipoSeleccionar.equals(ComprobanteTarjetaConstantesFunciones.LABEL_NOMBRECAJA)) {
					existe=true;
					comprobantetarjetaAux.setsDescripcionGeneralEntityReporte1(comprobantetarjetaAux.getnombre_caja());
				}
				 else if(sTipoSeleccionar.equals(ComprobanteTarjetaConstantesFunciones.LABEL_SECUENCIAL)) {
					existe=true;
					comprobantetarjetaAux.setsDescripcionGeneralEntityReporte1(comprobantetarjetaAux.getsecuencial());
				}
				 else if(sTipoSeleccionar.equals(ComprobanteTarjetaConstantesFunciones.LABEL_FECHA)) {
					existe=true;
					comprobantetarjetaAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(comprobantetarjetaAux.getfecha()));
				}
				 else if(sTipoSeleccionar.equals(ComprobanteTarjetaConstantesFunciones.LABEL_CODIGOCLIENTE)) {
					existe=true;
					comprobantetarjetaAux.setsDescripcionGeneralEntityReporte1(comprobantetarjetaAux.getcodigo_cliente());
				}
				 else if(sTipoSeleccionar.equals(ComprobanteTarjetaConstantesFunciones.LABEL_NOMBRECLIENTE)) {
					existe=true;
					comprobantetarjetaAux.setsDescripcionGeneralEntityReporte1(comprobantetarjetaAux.getnombre_cliente());
				}
				 else if(sTipoSeleccionar.equals(ComprobanteTarjetaConstantesFunciones.LABEL_FECHAFORMAPAGO)) {
					existe=true;
					comprobantetarjetaAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(comprobantetarjetaAux.getfecha_forma_pago()));
				}
				 else if(sTipoSeleccionar.equals(ComprobanteTarjetaConstantesFunciones.LABEL_NUMERO)) {
					existe=true;
					comprobantetarjetaAux.setsDescripcionGeneralEntityReporte1(comprobantetarjetaAux.getnumero());
				}
				 else if(sTipoSeleccionar.equals(ComprobanteTarjetaConstantesFunciones.LABEL_TARJETAHABIENTE)) {
					existe=true;
					comprobantetarjetaAux.setsDescripcionGeneralEntityReporte1(comprobantetarjetaAux.gettarjeta_habiente());
				}
				 else if(sTipoSeleccionar.equals(ComprobanteTarjetaConstantesFunciones.LABEL_AUTORIZACION)) {
					existe=true;
					comprobantetarjetaAux.setsDescripcionGeneralEntityReporte1(comprobantetarjetaAux.getautorizacion());
				}
				 else if(sTipoSeleccionar.equals(ComprobanteTarjetaConstantesFunciones.LABEL_VOUCHER)) {
					existe=true;
					comprobantetarjetaAux.setsDescripcionGeneralEntityReporte1(comprobantetarjetaAux.getvoucher());
				}
				 else if(sTipoSeleccionar.equals(ComprobanteTarjetaConstantesFunciones.LABEL_LOTE)) {
					existe=true;
					comprobantetarjetaAux.setsDescripcionGeneralEntityReporte1(comprobantetarjetaAux.getlote());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComprobanteTarjetaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesComprobanteTarjeta(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoComprobanteTarjeta=true;
				this.isVisibilidadCeldaNuevoRelacionesComprobanteTarjeta=true;
				this.isVisibilidadCeldaGuardarCambiosComprobanteTarjeta=true;
			}
			
			this.isVisibilidadCeldaModificarComprobanteTarjeta=false;
			this.isVisibilidadCeldaActualizarComprobanteTarjeta=false;
			this.isVisibilidadCeldaEliminarComprobanteTarjeta=false;
			this.isVisibilidadCeldaCancelarComprobanteTarjeta=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarComprobanteTarjeta=true;
				} else {
					this.isVisibilidadCeldaGuardarComprobanteTarjeta=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoComprobanteTarjeta=false;
			this.isVisibilidadCeldaNuevoRelacionesComprobanteTarjeta=false;
			this.isVisibilidadCeldaGuardarCambiosComprobanteTarjeta=false;
			this.isVisibilidadCeldaModificarComprobanteTarjeta=false;
			this.isVisibilidadCeldaActualizarComprobanteTarjeta=true;
			this.isVisibilidadCeldaEliminarComprobanteTarjeta=false;
			this.isVisibilidadCeldaCancelarComprobanteTarjeta=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarComprobanteTarjeta=true;
				} else {
					this.isVisibilidadCeldaGuardarComprobanteTarjeta=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoComprobanteTarjeta=false;
			this.isVisibilidadCeldaNuevoRelacionesComprobanteTarjeta=false;
			this.isVisibilidadCeldaGuardarCambiosComprobanteTarjeta=false;
			this.isVisibilidadCeldaModificarComprobanteTarjeta=false;
			this.isVisibilidadCeldaActualizarComprobanteTarjeta=true;
			this.isVisibilidadCeldaEliminarComprobanteTarjeta=true;
			this.isVisibilidadCeldaCancelarComprobanteTarjeta=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarComprobanteTarjeta=true;
				} else {
					this.isVisibilidadCeldaGuardarComprobanteTarjeta=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoComprobanteTarjeta=false;
			this.isVisibilidadCeldaNuevoRelacionesComprobanteTarjeta=false;
			this.isVisibilidadCeldaGuardarCambiosComprobanteTarjeta=false;
			this.isVisibilidadCeldaModificarComprobanteTarjeta=false;
			this.isVisibilidadCeldaActualizarComprobanteTarjeta=true;
			this.isVisibilidadCeldaEliminarComprobanteTarjeta=false;
			this.isVisibilidadCeldaCancelarComprobanteTarjeta=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarComprobanteTarjeta=false;
				} else {
					this.isVisibilidadCeldaGuardarComprobanteTarjeta=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoComprobanteTarjeta=true;
			this.isVisibilidadCeldaNuevoRelacionesComprobanteTarjeta=true;
			this.isVisibilidadCeldaGuardarCambiosComprobanteTarjeta=true;
			this.isVisibilidadCeldaModificarComprobanteTarjeta=false;
			this.isVisibilidadCeldaActualizarComprobanteTarjeta=false;
			this.isVisibilidadCeldaEliminarComprobanteTarjeta=false;
			this.isVisibilidadCeldaCancelarComprobanteTarjeta=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarComprobanteTarjeta=true;
				} else {
					this.isVisibilidadCeldaGuardarComprobanteTarjeta=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoComprobanteTarjeta=false;
			this.isVisibilidadCeldaNuevoRelacionesComprobanteTarjeta=false;
			this.isVisibilidadCeldaGuardarCambiosComprobanteTarjeta=false;
			this.isVisibilidadCeldaActualizarComprobanteTarjeta=false;
			this.isVisibilidadCeldaEliminarComprobanteTarjeta=false;
			this.isVisibilidadCeldaCancelarComprobanteTarjeta=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarComprobanteTarjeta=false;
				} else {
					this.isVisibilidadCeldaGuardarComprobanteTarjeta=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoComprobanteTarjeta=false;
			this.isVisibilidadCeldaNuevoRelacionesComprobanteTarjeta=false;
			this.isVisibilidadCeldaGuardarCambiosComprobanteTarjeta=false;
			this.isVisibilidadCeldaModificarComprobanteTarjeta=true;
			this.isVisibilidadCeldaActualizarComprobanteTarjeta=false;
			this.isVisibilidadCeldaEliminarComprobanteTarjeta=false;
			this.isVisibilidadCeldaCancelarComprobanteTarjeta=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarComprobanteTarjeta=false;
				} else {
					this.isVisibilidadCeldaGuardarComprobanteTarjeta=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(ComprobanteTarjetaJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoComprobanteTarjeta=true;
			this.isVisibilidadCeldaNuevoRelacionesComprobanteTarjeta=true;
			this.isVisibilidadCeldaGuardarCambiosComprobanteTarjeta=true;
		} else {
			this.actualizarEstadoPanelsComprobanteTarjeta(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarComprobanteTarjeta=false;
			//this.isVisibilidadCeldaVerFormComprobanteTarjeta=false;
			this.isVisibilidadCeldaDuplicarComprobanteTarjeta=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!comprobantetarjetaSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesComprobanteTarjeta=false;
		} else {
			this.isVisibilidadCeldaNuevoComprobanteTarjeta=false;
			this.isVisibilidadCeldaGuardarCambiosComprobanteTarjeta=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(comprobantetarjetaSessionBean.getEsGuardarRelacionado()) {
			if(!comprobantetarjetaSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesComprobanteTarjeta=false;												
			}
			
			this.jButtonCerrarComprobanteTarjeta.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesComprobanteTarjeta=false;
		}
		
		if(!this.permiteMantenimiento(this.comprobantetarjeta)) {
			this.isVisibilidadCeldaActualizarComprobanteTarjeta=false;
			this.isVisibilidadCeldaEliminarComprobanteTarjeta=false;
		}
		
		
		//SE DESHABILITA SIEMPRE
		this.isVisibilidadCeldaNuevoComprobanteTarjeta=false;
		this.isVisibilidadCeldaNuevoRelacionesComprobanteTarjeta=false;
		this.isVisibilidadCeldaGuardarCambiosComprobanteTarjeta=false;
		//this.isVisibilidadCeldaModificarComprobanteTarjeta=true;
		this.isVisibilidadCeldaActualizarComprobanteTarjeta=false;
		this.isVisibilidadCeldaEliminarComprobanteTarjeta=false;
		//this.isVisibilidadCeldaCancelarComprobanteTarjeta=true;			
		this.isVisibilidadCeldaGuardarComprobanteTarjeta=false;
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesComprobanteTarjeta() {
	}
	
	public void actualizarEstadoPanelsComprobanteTarjeta(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionComprobanteTarjeta!=null) {
				this.jScrollPanelDatosEdicionComprobanteTarjeta.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasComprobanteTarjeta!=null) {
				this.jTabbedPaneBusquedasComprobanteTarjeta.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosComprobanteTarjeta!=null) {
				this.jScrollPanelDatosComprobanteTarjeta.setVisible(true);
			}
			
			if(this.jPanelPaginacionComprobanteTarjeta!=null) {
				this.jPanelPaginacionComprobanteTarjeta.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesComprobanteTarjeta!=null) {
				this.jPanelParametrosReportesComprobanteTarjeta.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionComprobanteTarjeta!=null) {
				this.jScrollPanelDatosEdicionComprobanteTarjeta.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasComprobanteTarjeta!=null) {
				this.jTabbedPaneBusquedasComprobanteTarjeta.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosComprobanteTarjeta!=null) {
				this.jScrollPanelDatosComprobanteTarjeta.setVisible(false);
			}
			
			if(this.jPanelPaginacionComprobanteTarjeta!=null) {
				this.jPanelPaginacionComprobanteTarjeta.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesComprobanteTarjeta!=null) {
				this.jPanelParametrosReportesComprobanteTarjeta.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionComprobanteTarjeta!=null) {
				this.jScrollPanelDatosEdicionComprobanteTarjeta.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasComprobanteTarjeta!=null) {
				this.jTabbedPaneBusquedasComprobanteTarjeta.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosComprobanteTarjeta!=null) {
				this.jScrollPanelDatosComprobanteTarjeta.setVisible(false);
			}
			
			if(this.jPanelPaginacionComprobanteTarjeta!=null) {
				this.jPanelPaginacionComprobanteTarjeta.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesComprobanteTarjeta!=null) {
				this.jPanelParametrosReportesComprobanteTarjeta.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionComprobanteTarjeta!=null) {
				this.jScrollPanelDatosEdicionComprobanteTarjeta.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasComprobanteTarjeta!=null) {
				this.jTabbedPaneBusquedasComprobanteTarjeta.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosComprobanteTarjeta!=null) {
				this.jScrollPanelDatosComprobanteTarjeta.setVisible(false);
			}
			
			if(this.jPanelPaginacionComprobanteTarjeta!=null) {
				this.jPanelPaginacionComprobanteTarjeta.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesComprobanteTarjeta!=null) {
				this.jPanelParametrosReportesComprobanteTarjeta.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionComprobanteTarjeta!=null) {
				this.jScrollPanelDatosEdicionComprobanteTarjeta.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasComprobanteTarjeta!=null) {
				this.jTabbedPaneBusquedasComprobanteTarjeta.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosComprobanteTarjeta!=null) {
				this.jScrollPanelDatosComprobanteTarjeta.setVisible(true);
			}
			
			if(this.jPanelPaginacionComprobanteTarjeta!=null) {
				this.jPanelPaginacionComprobanteTarjeta.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesComprobanteTarjeta!=null) {
				this.jPanelParametrosReportesComprobanteTarjeta.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionComprobanteTarjeta!=null) {
				this.jScrollPanelDatosEdicionComprobanteTarjeta.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasComprobanteTarjeta!=null) {
				this.jTabbedPaneBusquedasComprobanteTarjeta.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosComprobanteTarjeta!=null) {
				this.jScrollPanelDatosComprobanteTarjeta.setVisible(true);
			}
			
			if(this.jPanelPaginacionComprobanteTarjeta!=null) {
				this.jPanelPaginacionComprobanteTarjeta.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesComprobanteTarjeta!=null) {
				this.jPanelParametrosReportesComprobanteTarjeta.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionComprobanteTarjeta!=null) {
				this.jScrollPanelDatosEdicionComprobanteTarjeta.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasComprobanteTarjeta!=null) {
				this.jTabbedPaneBusquedasComprobanteTarjeta.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosComprobanteTarjeta!=null) {
				this.jScrollPanelDatosComprobanteTarjeta.setVisible(true);
			}
			
			if(this.jPanelPaginacionComprobanteTarjeta!=null) {
				this.jPanelPaginacionComprobanteTarjeta.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesComprobanteTarjeta!=null) {
				this.jPanelParametrosReportesComprobanteTarjeta.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.comprobantetarjetaSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasComprobanteTarjeta!=null) {
					this.jTabbedPaneBusquedasComprobanteTarjeta.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesComprobanteTarjeta!=null) {
				this.jPanelParametrosReportesComprobanteTarjeta.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.comprobantetarjetaSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasComprobanteTarjeta!=null) {
				this.jTabbedPaneBusquedasComprobanteTarjeta.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesComprobanteTarjeta!=null) {
				this.jPanelParametrosReportesComprobanteTarjeta.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadBusquedaComprobanteTarjeta=isParaEmpresaNegation;
			if(!this.isVisibilidadBusquedaComprobanteTarjeta) {this.jTabbedPaneBusquedasComprobanteTarjeta.remove(jPanelBusquedaComprobanteTarjetaComprobanteTarjeta);}
		}
		
	}

	public void setVisibilidadBusquedasParaSucursal(Boolean isParaSucursal){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaSucursalNegation=!isParaSucursal;

			this.isVisibilidadBusquedaComprobanteTarjeta=isParaSucursalNegation;
			if(!this.isVisibilidadBusquedaComprobanteTarjeta) {this.jTabbedPaneBusquedasComprobanteTarjeta.remove(jPanelBusquedaComprobanteTarjetaComprobanteTarjeta);}
		}
		
	}

	public void setVisibilidadBusquedasParaCliente(Boolean isParaCliente){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaClienteNegation=!isParaCliente;

			this.isVisibilidadBusquedaComprobanteTarjeta=isParaClienteNegation;
			if(!this.isVisibilidadBusquedaComprobanteTarjeta) {this.jTabbedPaneBusquedasComprobanteTarjeta.remove(jPanelBusquedaComprobanteTarjetaComprobanteTarjeta);}
		}
		
	}

	public void setVisibilidadBusquedasParaCaja(Boolean isParaCaja){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaCajaNegation=!isParaCaja;

			this.isVisibilidadBusquedaComprobanteTarjeta=isParaCajaNegation;
			if(!this.isVisibilidadBusquedaComprobanteTarjeta) {this.jTabbedPaneBusquedasComprobanteTarjeta.remove(jPanelBusquedaComprobanteTarjetaComprobanteTarjeta);}
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
			
			this.inicializarActualizarBindingTablaComprobanteTarjeta(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioComprobanteTarjeta() {
		this.updateBorderResaltarBusquedasFormularioComprobanteTarjeta();
		this.updateVisibilidadBusquedasFormularioComprobanteTarjeta();
		this.updateHabilitarBusquedasFormularioComprobanteTarjeta();
	}
	
	public void updateBorderResaltarBusquedasFormularioComprobanteTarjeta() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasComprobanteTarjeta.getComponents().length>0) {
	

		if(this.comprobantetarjetaConstantesFunciones.resaltarBusquedaComprobanteTarjetaComprobanteTarjeta!=null) {
			index= this.jTabbedPaneBusquedasComprobanteTarjeta.indexOfComponent(this.jPanelBusquedaComprobanteTarjetaComprobanteTarjeta);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasComprobanteTarjeta.getComponent(index);
				jPanel.setBorder(this.comprobantetarjetaConstantesFunciones.resaltarBusquedaComprobanteTarjetaComprobanteTarjeta);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioComprobanteTarjeta() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasComprobanteTarjeta.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasComprobanteTarjeta.indexOfComponent(this.jPanelBusquedaComprobanteTarjetaComprobanteTarjeta);
			jPanel=(JPanel)this.jTabbedPaneBusquedasComprobanteTarjeta.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.comprobantetarjetaConstantesFunciones.mostrarBusquedaComprobanteTarjetaComprobanteTarjeta);
			if(!this.comprobantetarjetaConstantesFunciones.mostrarBusquedaComprobanteTarjetaComprobanteTarjeta && index>-1) {
				this.jTabbedPaneBusquedasComprobanteTarjeta.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioComprobanteTarjeta() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasComprobanteTarjeta.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasComprobanteTarjeta.indexOfComponent(this.jPanelBusquedaComprobanteTarjetaComprobanteTarjeta);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasComprobanteTarjeta.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.comprobantetarjetaConstantesFunciones.activarBusquedaComprobanteTarjetaComprobanteTarjeta);
				this.jTabbedPaneBusquedasComprobanteTarjeta.setEnabledAt(index,this.comprobantetarjetaConstantesFunciones.activarBusquedaComprobanteTarjetaComprobanteTarjeta);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaComprobanteTarjeta(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("BusquedaComprobanteTarjeta")) {
			index= this.jTabbedPaneBusquedasComprobanteTarjeta.indexOfComponent(this.jPanelBusquedaComprobanteTarjetaComprobanteTarjeta);

			this.jTabbedPaneBusquedasComprobanteTarjeta.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasComprobanteTarjeta.getComponent(index);

			this.comprobantetarjetaConstantesFunciones.setResaltarBusquedaComprobanteTarjetaComprobanteTarjeta(resaltar);

			jPanel.setBorder(this.comprobantetarjetaConstantesFunciones.resaltarBusquedaComprobanteTarjetaComprobanteTarjeta);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarComprobanteTarjeta.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioComprobanteTarjeta() throws Exception {

		if(this.jInternalFrameDetalleFormComprobanteTarjeta==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioComprobanteTarjeta();
		this.updateVisibilidadResaltarControlesFormularioComprobanteTarjeta();
		this.updateHabilitarResaltarControlesFormularioComprobanteTarjeta();
		
	}
	
	public void updateBorderResaltarControlesFormularioComprobanteTarjeta() throws Exception {
		if(this.jInternalFrameDetalleFormComprobanteTarjeta==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.comprobantetarjetaConstantesFunciones.resaltaridComprobanteTarjeta!=null && this.jInternalFrameDetalleFormComprobanteTarjeta!=null) {this.jInternalFrameDetalleFormComprobanteTarjeta.jLabelidComprobanteTarjeta.setBorder(this.comprobantetarjetaConstantesFunciones.resaltaridComprobanteTarjeta);}
		if(this.comprobantetarjetaConstantesFunciones.resaltarid_empresaComprobanteTarjeta!=null && this.jInternalFrameDetalleFormComprobanteTarjeta!=null) {this.jInternalFrameDetalleFormComprobanteTarjeta.jComboBoxid_empresaComprobanteTarjeta.setBorder(this.comprobantetarjetaConstantesFunciones.resaltarid_empresaComprobanteTarjeta);}
		if(this.comprobantetarjetaConstantesFunciones.resaltarid_sucursalComprobanteTarjeta!=null && this.jInternalFrameDetalleFormComprobanteTarjeta!=null) {this.jInternalFrameDetalleFormComprobanteTarjeta.jComboBoxid_sucursalComprobanteTarjeta.setBorder(this.comprobantetarjetaConstantesFunciones.resaltarid_sucursalComprobanteTarjeta);}
		if(this.comprobantetarjetaConstantesFunciones.resaltarid_clienteComprobanteTarjeta!=null && this.jInternalFrameDetalleFormComprobanteTarjeta!=null) {this.jInternalFrameDetalleFormComprobanteTarjeta.jComboBoxid_clienteComprobanteTarjeta.setBorder(this.comprobantetarjetaConstantesFunciones.resaltarid_clienteComprobanteTarjeta);}
		if(this.comprobantetarjetaConstantesFunciones.resaltarid_cajaComprobanteTarjeta!=null && this.jInternalFrameDetalleFormComprobanteTarjeta!=null) {this.jInternalFrameDetalleFormComprobanteTarjeta.jComboBoxid_cajaComprobanteTarjeta.setBorder(this.comprobantetarjetaConstantesFunciones.resaltarid_cajaComprobanteTarjeta);}
		if(this.comprobantetarjetaConstantesFunciones.resaltarfecha_inicioComprobanteTarjeta!=null && this.jInternalFrameDetalleFormComprobanteTarjeta!=null) {this.jInternalFrameDetalleFormComprobanteTarjeta.jDateChooserfecha_inicioComprobanteTarjeta.setBorder(this.comprobantetarjetaConstantesFunciones.resaltarfecha_inicioComprobanteTarjeta);}
		if(this.comprobantetarjetaConstantesFunciones.resaltarfecha_finComprobanteTarjeta!=null && this.jInternalFrameDetalleFormComprobanteTarjeta!=null) {this.jInternalFrameDetalleFormComprobanteTarjeta.jDateChooserfecha_finComprobanteTarjeta.setBorder(this.comprobantetarjetaConstantesFunciones.resaltarfecha_finComprobanteTarjeta);}
		if(this.comprobantetarjetaConstantesFunciones.resaltarnombre_cajaComprobanteTarjeta!=null && this.jInternalFrameDetalleFormComprobanteTarjeta!=null) {this.jInternalFrameDetalleFormComprobanteTarjeta.jTextAreanombre_cajaComprobanteTarjeta.setBorder(this.comprobantetarjetaConstantesFunciones.resaltarnombre_cajaComprobanteTarjeta);}
		if(this.comprobantetarjetaConstantesFunciones.resaltarsecuencialComprobanteTarjeta!=null && this.jInternalFrameDetalleFormComprobanteTarjeta!=null) {this.jInternalFrameDetalleFormComprobanteTarjeta.jTextFieldsecuencialComprobanteTarjeta.setBorder(this.comprobantetarjetaConstantesFunciones.resaltarsecuencialComprobanteTarjeta);}
		if(this.comprobantetarjetaConstantesFunciones.resaltarfechaComprobanteTarjeta!=null && this.jInternalFrameDetalleFormComprobanteTarjeta!=null) {this.jInternalFrameDetalleFormComprobanteTarjeta.jDateChooserfechaComprobanteTarjeta.setBorder(this.comprobantetarjetaConstantesFunciones.resaltarfechaComprobanteTarjeta);}
		if(this.comprobantetarjetaConstantesFunciones.resaltarcodigo_clienteComprobanteTarjeta!=null && this.jInternalFrameDetalleFormComprobanteTarjeta!=null) {this.jInternalFrameDetalleFormComprobanteTarjeta.jTextFieldcodigo_clienteComprobanteTarjeta.setBorder(this.comprobantetarjetaConstantesFunciones.resaltarcodigo_clienteComprobanteTarjeta);}
		if(this.comprobantetarjetaConstantesFunciones.resaltarnombre_clienteComprobanteTarjeta!=null && this.jInternalFrameDetalleFormComprobanteTarjeta!=null) {this.jInternalFrameDetalleFormComprobanteTarjeta.jTextAreanombre_clienteComprobanteTarjeta.setBorder(this.comprobantetarjetaConstantesFunciones.resaltarnombre_clienteComprobanteTarjeta);}
		if(this.comprobantetarjetaConstantesFunciones.resaltarsubtotalComprobanteTarjeta!=null && this.jInternalFrameDetalleFormComprobanteTarjeta!=null) {this.jInternalFrameDetalleFormComprobanteTarjeta.jTextFieldsubtotalComprobanteTarjeta.setBorder(this.comprobantetarjetaConstantesFunciones.resaltarsubtotalComprobanteTarjeta);}
		if(this.comprobantetarjetaConstantesFunciones.resaltarivaComprobanteTarjeta!=null && this.jInternalFrameDetalleFormComprobanteTarjeta!=null) {this.jInternalFrameDetalleFormComprobanteTarjeta.jTextFieldivaComprobanteTarjeta.setBorder(this.comprobantetarjetaConstantesFunciones.resaltarivaComprobanteTarjeta);}
		if(this.comprobantetarjetaConstantesFunciones.resaltardescuentoComprobanteTarjeta!=null && this.jInternalFrameDetalleFormComprobanteTarjeta!=null) {this.jInternalFrameDetalleFormComprobanteTarjeta.jTextFielddescuentoComprobanteTarjeta.setBorder(this.comprobantetarjetaConstantesFunciones.resaltardescuentoComprobanteTarjeta);}
		if(this.comprobantetarjetaConstantesFunciones.resaltarfinanciamientoComprobanteTarjeta!=null && this.jInternalFrameDetalleFormComprobanteTarjeta!=null) {this.jInternalFrameDetalleFormComprobanteTarjeta.jTextFieldfinanciamientoComprobanteTarjeta.setBorder(this.comprobantetarjetaConstantesFunciones.resaltarfinanciamientoComprobanteTarjeta);}
		if(this.comprobantetarjetaConstantesFunciones.resaltarfleteComprobanteTarjeta!=null && this.jInternalFrameDetalleFormComprobanteTarjeta!=null) {this.jInternalFrameDetalleFormComprobanteTarjeta.jTextFieldfleteComprobanteTarjeta.setBorder(this.comprobantetarjetaConstantesFunciones.resaltarfleteComprobanteTarjeta);}
		if(this.comprobantetarjetaConstantesFunciones.resaltariceComprobanteTarjeta!=null && this.jInternalFrameDetalleFormComprobanteTarjeta!=null) {this.jInternalFrameDetalleFormComprobanteTarjeta.jTextFieldiceComprobanteTarjeta.setBorder(this.comprobantetarjetaConstantesFunciones.resaltariceComprobanteTarjeta);}
		if(this.comprobantetarjetaConstantesFunciones.resaltartotalComprobanteTarjeta!=null && this.jInternalFrameDetalleFormComprobanteTarjeta!=null) {this.jInternalFrameDetalleFormComprobanteTarjeta.jTextFieldtotalComprobanteTarjeta.setBorder(this.comprobantetarjetaConstantesFunciones.resaltartotalComprobanteTarjeta);}
		if(this.comprobantetarjetaConstantesFunciones.resaltarvalorComprobanteTarjeta!=null && this.jInternalFrameDetalleFormComprobanteTarjeta!=null) {this.jInternalFrameDetalleFormComprobanteTarjeta.jTextFieldvalorComprobanteTarjeta.setBorder(this.comprobantetarjetaConstantesFunciones.resaltarvalorComprobanteTarjeta);}
		if(this.comprobantetarjetaConstantesFunciones.resaltarfecha_forma_pagoComprobanteTarjeta!=null && this.jInternalFrameDetalleFormComprobanteTarjeta!=null) {this.jInternalFrameDetalleFormComprobanteTarjeta.jDateChooserfecha_forma_pagoComprobanteTarjeta.setBorder(this.comprobantetarjetaConstantesFunciones.resaltarfecha_forma_pagoComprobanteTarjeta);}
		if(this.comprobantetarjetaConstantesFunciones.resaltarnumeroComprobanteTarjeta!=null && this.jInternalFrameDetalleFormComprobanteTarjeta!=null) {this.jInternalFrameDetalleFormComprobanteTarjeta.jTextFieldnumeroComprobanteTarjeta.setBorder(this.comprobantetarjetaConstantesFunciones.resaltarnumeroComprobanteTarjeta);}
		if(this.comprobantetarjetaConstantesFunciones.resaltartarjeta_habienteComprobanteTarjeta!=null && this.jInternalFrameDetalleFormComprobanteTarjeta!=null) {this.jInternalFrameDetalleFormComprobanteTarjeta.jTextAreatarjeta_habienteComprobanteTarjeta.setBorder(this.comprobantetarjetaConstantesFunciones.resaltartarjeta_habienteComprobanteTarjeta);}
		if(this.comprobantetarjetaConstantesFunciones.resaltarautorizacionComprobanteTarjeta!=null && this.jInternalFrameDetalleFormComprobanteTarjeta!=null) {this.jInternalFrameDetalleFormComprobanteTarjeta.jTextAreaautorizacionComprobanteTarjeta.setBorder(this.comprobantetarjetaConstantesFunciones.resaltarautorizacionComprobanteTarjeta);}
		if(this.comprobantetarjetaConstantesFunciones.resaltarvoucherComprobanteTarjeta!=null && this.jInternalFrameDetalleFormComprobanteTarjeta!=null) {this.jInternalFrameDetalleFormComprobanteTarjeta.jTextFieldvoucherComprobanteTarjeta.setBorder(this.comprobantetarjetaConstantesFunciones.resaltarvoucherComprobanteTarjeta);}
		if(this.comprobantetarjetaConstantesFunciones.resaltarloteComprobanteTarjeta!=null && this.jInternalFrameDetalleFormComprobanteTarjeta!=null) {this.jInternalFrameDetalleFormComprobanteTarjeta.jTextFieldloteComprobanteTarjeta.setBorder(this.comprobantetarjetaConstantesFunciones.resaltarloteComprobanteTarjeta);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioComprobanteTarjeta() throws Exception {		
		if(this.jInternalFrameDetalleFormComprobanteTarjeta==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormComprobanteTarjeta!=null) {
	
		//this.jInternalFrameDetalleFormComprobanteTarjeta.jLabelidComprobanteTarjeta.setVisible(this.comprobantetarjetaConstantesFunciones.mostraridComprobanteTarjeta);
		this.jInternalFrameDetalleFormComprobanteTarjeta.jPanelidComprobanteTarjeta.setVisible(this.comprobantetarjetaConstantesFunciones.mostraridComprobanteTarjeta);
		//this.jInternalFrameDetalleFormComprobanteTarjeta.jComboBoxid_empresaComprobanteTarjeta.setVisible(this.comprobantetarjetaConstantesFunciones.mostrarid_empresaComprobanteTarjeta);
		this.jInternalFrameDetalleFormComprobanteTarjeta.jPanelid_empresaComprobanteTarjeta.setVisible(this.comprobantetarjetaConstantesFunciones.mostrarid_empresaComprobanteTarjeta);
		//this.jInternalFrameDetalleFormComprobanteTarjeta.jComboBoxid_sucursalComprobanteTarjeta.setVisible(this.comprobantetarjetaConstantesFunciones.mostrarid_sucursalComprobanteTarjeta);
		this.jInternalFrameDetalleFormComprobanteTarjeta.jPanelid_sucursalComprobanteTarjeta.setVisible(this.comprobantetarjetaConstantesFunciones.mostrarid_sucursalComprobanteTarjeta);
		//this.jInternalFrameDetalleFormComprobanteTarjeta.jComboBoxid_clienteComprobanteTarjeta.setVisible(this.comprobantetarjetaConstantesFunciones.mostrarid_clienteComprobanteTarjeta);
		this.jInternalFrameDetalleFormComprobanteTarjeta.jPanelid_clienteComprobanteTarjeta.setVisible(this.comprobantetarjetaConstantesFunciones.mostrarid_clienteComprobanteTarjeta);
		//this.jInternalFrameDetalleFormComprobanteTarjeta.jComboBoxid_cajaComprobanteTarjeta.setVisible(this.comprobantetarjetaConstantesFunciones.mostrarid_cajaComprobanteTarjeta);
		this.jInternalFrameDetalleFormComprobanteTarjeta.jPanelid_cajaComprobanteTarjeta.setVisible(this.comprobantetarjetaConstantesFunciones.mostrarid_cajaComprobanteTarjeta);
		//this.jInternalFrameDetalleFormComprobanteTarjeta.jDateChooserfecha_inicioComprobanteTarjeta.setVisible(this.comprobantetarjetaConstantesFunciones.mostrarfecha_inicioComprobanteTarjeta);
		this.jInternalFrameDetalleFormComprobanteTarjeta.jPanelfecha_inicioComprobanteTarjeta.setVisible(this.comprobantetarjetaConstantesFunciones.mostrarfecha_inicioComprobanteTarjeta);
		//this.jInternalFrameDetalleFormComprobanteTarjeta.jDateChooserfecha_finComprobanteTarjeta.setVisible(this.comprobantetarjetaConstantesFunciones.mostrarfecha_finComprobanteTarjeta);
		this.jInternalFrameDetalleFormComprobanteTarjeta.jPanelfecha_finComprobanteTarjeta.setVisible(this.comprobantetarjetaConstantesFunciones.mostrarfecha_finComprobanteTarjeta);
		//this.jInternalFrameDetalleFormComprobanteTarjeta.jTextAreanombre_cajaComprobanteTarjeta.setVisible(this.comprobantetarjetaConstantesFunciones.mostrarnombre_cajaComprobanteTarjeta);
		this.jInternalFrameDetalleFormComprobanteTarjeta.jPanelnombre_cajaComprobanteTarjeta.setVisible(this.comprobantetarjetaConstantesFunciones.mostrarnombre_cajaComprobanteTarjeta);
		//this.jInternalFrameDetalleFormComprobanteTarjeta.jTextFieldsecuencialComprobanteTarjeta.setVisible(this.comprobantetarjetaConstantesFunciones.mostrarsecuencialComprobanteTarjeta);
		this.jInternalFrameDetalleFormComprobanteTarjeta.jPanelsecuencialComprobanteTarjeta.setVisible(this.comprobantetarjetaConstantesFunciones.mostrarsecuencialComprobanteTarjeta);
		//this.jInternalFrameDetalleFormComprobanteTarjeta.jDateChooserfechaComprobanteTarjeta.setVisible(this.comprobantetarjetaConstantesFunciones.mostrarfechaComprobanteTarjeta);
		this.jInternalFrameDetalleFormComprobanteTarjeta.jPanelfechaComprobanteTarjeta.setVisible(this.comprobantetarjetaConstantesFunciones.mostrarfechaComprobanteTarjeta);
		//this.jInternalFrameDetalleFormComprobanteTarjeta.jTextFieldcodigo_clienteComprobanteTarjeta.setVisible(this.comprobantetarjetaConstantesFunciones.mostrarcodigo_clienteComprobanteTarjeta);
		this.jInternalFrameDetalleFormComprobanteTarjeta.jPanelcodigo_clienteComprobanteTarjeta.setVisible(this.comprobantetarjetaConstantesFunciones.mostrarcodigo_clienteComprobanteTarjeta);
		//this.jInternalFrameDetalleFormComprobanteTarjeta.jTextAreanombre_clienteComprobanteTarjeta.setVisible(this.comprobantetarjetaConstantesFunciones.mostrarnombre_clienteComprobanteTarjeta);
		this.jInternalFrameDetalleFormComprobanteTarjeta.jPanelnombre_clienteComprobanteTarjeta.setVisible(this.comprobantetarjetaConstantesFunciones.mostrarnombre_clienteComprobanteTarjeta);
		//this.jInternalFrameDetalleFormComprobanteTarjeta.jTextFieldsubtotalComprobanteTarjeta.setVisible(this.comprobantetarjetaConstantesFunciones.mostrarsubtotalComprobanteTarjeta);
		this.jInternalFrameDetalleFormComprobanteTarjeta.jPanelsubtotalComprobanteTarjeta.setVisible(this.comprobantetarjetaConstantesFunciones.mostrarsubtotalComprobanteTarjeta);
		//this.jInternalFrameDetalleFormComprobanteTarjeta.jTextFieldivaComprobanteTarjeta.setVisible(this.comprobantetarjetaConstantesFunciones.mostrarivaComprobanteTarjeta);
		this.jInternalFrameDetalleFormComprobanteTarjeta.jPanelivaComprobanteTarjeta.setVisible(this.comprobantetarjetaConstantesFunciones.mostrarivaComprobanteTarjeta);
		//this.jInternalFrameDetalleFormComprobanteTarjeta.jTextFielddescuentoComprobanteTarjeta.setVisible(this.comprobantetarjetaConstantesFunciones.mostrardescuentoComprobanteTarjeta);
		this.jInternalFrameDetalleFormComprobanteTarjeta.jPaneldescuentoComprobanteTarjeta.setVisible(this.comprobantetarjetaConstantesFunciones.mostrardescuentoComprobanteTarjeta);
		//this.jInternalFrameDetalleFormComprobanteTarjeta.jTextFieldfinanciamientoComprobanteTarjeta.setVisible(this.comprobantetarjetaConstantesFunciones.mostrarfinanciamientoComprobanteTarjeta);
		this.jInternalFrameDetalleFormComprobanteTarjeta.jPanelfinanciamientoComprobanteTarjeta.setVisible(this.comprobantetarjetaConstantesFunciones.mostrarfinanciamientoComprobanteTarjeta);
		//this.jInternalFrameDetalleFormComprobanteTarjeta.jTextFieldfleteComprobanteTarjeta.setVisible(this.comprobantetarjetaConstantesFunciones.mostrarfleteComprobanteTarjeta);
		this.jInternalFrameDetalleFormComprobanteTarjeta.jPanelfleteComprobanteTarjeta.setVisible(this.comprobantetarjetaConstantesFunciones.mostrarfleteComprobanteTarjeta);
		//this.jInternalFrameDetalleFormComprobanteTarjeta.jTextFieldiceComprobanteTarjeta.setVisible(this.comprobantetarjetaConstantesFunciones.mostrariceComprobanteTarjeta);
		this.jInternalFrameDetalleFormComprobanteTarjeta.jPaneliceComprobanteTarjeta.setVisible(this.comprobantetarjetaConstantesFunciones.mostrariceComprobanteTarjeta);
		//this.jInternalFrameDetalleFormComprobanteTarjeta.jTextFieldtotalComprobanteTarjeta.setVisible(this.comprobantetarjetaConstantesFunciones.mostrartotalComprobanteTarjeta);
		this.jInternalFrameDetalleFormComprobanteTarjeta.jPaneltotalComprobanteTarjeta.setVisible(this.comprobantetarjetaConstantesFunciones.mostrartotalComprobanteTarjeta);
		//this.jInternalFrameDetalleFormComprobanteTarjeta.jTextFieldvalorComprobanteTarjeta.setVisible(this.comprobantetarjetaConstantesFunciones.mostrarvalorComprobanteTarjeta);
		this.jInternalFrameDetalleFormComprobanteTarjeta.jPanelvalorComprobanteTarjeta.setVisible(this.comprobantetarjetaConstantesFunciones.mostrarvalorComprobanteTarjeta);
		//this.jInternalFrameDetalleFormComprobanteTarjeta.jDateChooserfecha_forma_pagoComprobanteTarjeta.setVisible(this.comprobantetarjetaConstantesFunciones.mostrarfecha_forma_pagoComprobanteTarjeta);
		this.jInternalFrameDetalleFormComprobanteTarjeta.jPanelfecha_forma_pagoComprobanteTarjeta.setVisible(this.comprobantetarjetaConstantesFunciones.mostrarfecha_forma_pagoComprobanteTarjeta);
		//this.jInternalFrameDetalleFormComprobanteTarjeta.jTextFieldnumeroComprobanteTarjeta.setVisible(this.comprobantetarjetaConstantesFunciones.mostrarnumeroComprobanteTarjeta);
		this.jInternalFrameDetalleFormComprobanteTarjeta.jPanelnumeroComprobanteTarjeta.setVisible(this.comprobantetarjetaConstantesFunciones.mostrarnumeroComprobanteTarjeta);
		//this.jInternalFrameDetalleFormComprobanteTarjeta.jTextAreatarjeta_habienteComprobanteTarjeta.setVisible(this.comprobantetarjetaConstantesFunciones.mostrartarjeta_habienteComprobanteTarjeta);
		this.jInternalFrameDetalleFormComprobanteTarjeta.jPaneltarjeta_habienteComprobanteTarjeta.setVisible(this.comprobantetarjetaConstantesFunciones.mostrartarjeta_habienteComprobanteTarjeta);
		//this.jInternalFrameDetalleFormComprobanteTarjeta.jTextAreaautorizacionComprobanteTarjeta.setVisible(this.comprobantetarjetaConstantesFunciones.mostrarautorizacionComprobanteTarjeta);
		this.jInternalFrameDetalleFormComprobanteTarjeta.jPanelautorizacionComprobanteTarjeta.setVisible(this.comprobantetarjetaConstantesFunciones.mostrarautorizacionComprobanteTarjeta);
		//this.jInternalFrameDetalleFormComprobanteTarjeta.jTextFieldvoucherComprobanteTarjeta.setVisible(this.comprobantetarjetaConstantesFunciones.mostrarvoucherComprobanteTarjeta);
		this.jInternalFrameDetalleFormComprobanteTarjeta.jPanelvoucherComprobanteTarjeta.setVisible(this.comprobantetarjetaConstantesFunciones.mostrarvoucherComprobanteTarjeta);
		//this.jInternalFrameDetalleFormComprobanteTarjeta.jTextFieldloteComprobanteTarjeta.setVisible(this.comprobantetarjetaConstantesFunciones.mostrarloteComprobanteTarjeta);
		this.jInternalFrameDetalleFormComprobanteTarjeta.jPanelloteComprobanteTarjeta.setVisible(this.comprobantetarjetaConstantesFunciones.mostrarloteComprobanteTarjeta);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioComprobanteTarjeta() throws Exception {
		if(this.jInternalFrameDetalleFormComprobanteTarjeta==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormComprobanteTarjeta!=null) {
	
		this.jInternalFrameDetalleFormComprobanteTarjeta.jLabelidComprobanteTarjeta.setEnabled(this.comprobantetarjetaConstantesFunciones.activaridComprobanteTarjeta);
		this.jInternalFrameDetalleFormComprobanteTarjeta.jComboBoxid_empresaComprobanteTarjeta.setEnabled(this.comprobantetarjetaConstantesFunciones.activarid_empresaComprobanteTarjeta);
		this.jInternalFrameDetalleFormComprobanteTarjeta.jComboBoxid_sucursalComprobanteTarjeta.setEnabled(this.comprobantetarjetaConstantesFunciones.activarid_sucursalComprobanteTarjeta);
		this.jInternalFrameDetalleFormComprobanteTarjeta.jComboBoxid_clienteComprobanteTarjeta.setEnabled(this.comprobantetarjetaConstantesFunciones.activarid_clienteComprobanteTarjeta);
		this.jInternalFrameDetalleFormComprobanteTarjeta.jComboBoxid_cajaComprobanteTarjeta.setEnabled(this.comprobantetarjetaConstantesFunciones.activarid_cajaComprobanteTarjeta);
		this.jInternalFrameDetalleFormComprobanteTarjeta.jDateChooserfecha_inicioComprobanteTarjeta.setEnabled(this.comprobantetarjetaConstantesFunciones.activarfecha_inicioComprobanteTarjeta);
		this.jInternalFrameDetalleFormComprobanteTarjeta.jDateChooserfecha_finComprobanteTarjeta.setEnabled(this.comprobantetarjetaConstantesFunciones.activarfecha_finComprobanteTarjeta);
		this.jInternalFrameDetalleFormComprobanteTarjeta.jTextAreanombre_cajaComprobanteTarjeta.setEnabled(this.comprobantetarjetaConstantesFunciones.activarnombre_cajaComprobanteTarjeta);
		this.jInternalFrameDetalleFormComprobanteTarjeta.jTextFieldsecuencialComprobanteTarjeta.setEnabled(this.comprobantetarjetaConstantesFunciones.activarsecuencialComprobanteTarjeta);
		this.jInternalFrameDetalleFormComprobanteTarjeta.jDateChooserfechaComprobanteTarjeta.setEnabled(this.comprobantetarjetaConstantesFunciones.activarfechaComprobanteTarjeta);
		this.jInternalFrameDetalleFormComprobanteTarjeta.jTextFieldcodigo_clienteComprobanteTarjeta.setEnabled(this.comprobantetarjetaConstantesFunciones.activarcodigo_clienteComprobanteTarjeta);
		this.jInternalFrameDetalleFormComprobanteTarjeta.jTextAreanombre_clienteComprobanteTarjeta.setEnabled(this.comprobantetarjetaConstantesFunciones.activarnombre_clienteComprobanteTarjeta);
		this.jInternalFrameDetalleFormComprobanteTarjeta.jTextFieldsubtotalComprobanteTarjeta.setEnabled(this.comprobantetarjetaConstantesFunciones.activarsubtotalComprobanteTarjeta);
		this.jInternalFrameDetalleFormComprobanteTarjeta.jTextFieldivaComprobanteTarjeta.setEnabled(this.comprobantetarjetaConstantesFunciones.activarivaComprobanteTarjeta);
		this.jInternalFrameDetalleFormComprobanteTarjeta.jTextFielddescuentoComprobanteTarjeta.setEnabled(this.comprobantetarjetaConstantesFunciones.activardescuentoComprobanteTarjeta);
		this.jInternalFrameDetalleFormComprobanteTarjeta.jTextFieldfinanciamientoComprobanteTarjeta.setEnabled(this.comprobantetarjetaConstantesFunciones.activarfinanciamientoComprobanteTarjeta);
		this.jInternalFrameDetalleFormComprobanteTarjeta.jTextFieldfleteComprobanteTarjeta.setEnabled(this.comprobantetarjetaConstantesFunciones.activarfleteComprobanteTarjeta);
		this.jInternalFrameDetalleFormComprobanteTarjeta.jTextFieldiceComprobanteTarjeta.setEnabled(this.comprobantetarjetaConstantesFunciones.activariceComprobanteTarjeta);
		this.jInternalFrameDetalleFormComprobanteTarjeta.jTextFieldtotalComprobanteTarjeta.setEnabled(this.comprobantetarjetaConstantesFunciones.activartotalComprobanteTarjeta);
		this.jInternalFrameDetalleFormComprobanteTarjeta.jTextFieldvalorComprobanteTarjeta.setEnabled(this.comprobantetarjetaConstantesFunciones.activarvalorComprobanteTarjeta);
		this.jInternalFrameDetalleFormComprobanteTarjeta.jDateChooserfecha_forma_pagoComprobanteTarjeta.setEnabled(this.comprobantetarjetaConstantesFunciones.activarfecha_forma_pagoComprobanteTarjeta);
		this.jInternalFrameDetalleFormComprobanteTarjeta.jTextFieldnumeroComprobanteTarjeta.setEnabled(this.comprobantetarjetaConstantesFunciones.activarnumeroComprobanteTarjeta);
		this.jInternalFrameDetalleFormComprobanteTarjeta.jTextAreatarjeta_habienteComprobanteTarjeta.setEnabled(this.comprobantetarjetaConstantesFunciones.activartarjeta_habienteComprobanteTarjeta);
		this.jInternalFrameDetalleFormComprobanteTarjeta.jTextAreaautorizacionComprobanteTarjeta.setEnabled(this.comprobantetarjetaConstantesFunciones.activarautorizacionComprobanteTarjeta);
		this.jInternalFrameDetalleFormComprobanteTarjeta.jTextFieldvoucherComprobanteTarjeta.setEnabled(this.comprobantetarjetaConstantesFunciones.activarvoucherComprobanteTarjeta);
		this.jInternalFrameDetalleFormComprobanteTarjeta.jTextFieldloteComprobanteTarjeta.setEnabled(this.comprobantetarjetaConstantesFunciones.activarloteComprobanteTarjeta);
		}
	}
	
		
}