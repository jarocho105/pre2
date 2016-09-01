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

import com.bydan.erp.puntoventa.util.ReciboPuntoVentaConstantesFunciones;
import com.bydan.erp.puntoventa.util.ReciboPuntoVentaParameterReturnGeneral;
//import com.bydan.erp.puntoventa.util.ReciboPuntoVentaParameterGeneral;
//import com.bydan.erp.puntoventa.presentation.report.source.ReciboPuntoVentaBean;
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

import com.bydan.erp.cartera.business.logic.*;
import com.bydan.erp.tesoreria.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.puntoventa.business.entity.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;


import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;

import com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.auxiliar.*;






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


import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.tesoreria.business.entity.*;
import com.bydan.erp.cartera.util.*;
import com.bydan.erp.tesoreria.util.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class ReciboPuntoVentaBeanSwingJInternalFrame extends ReciboPuntoVentaJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(ReciboPuntoVentaBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<ReciboPuntoVenta> recibopuntoventaValidator = new ClassValidator<ReciboPuntoVenta>(ReciboPuntoVenta.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public ReciboPuntoVenta recibopuntoventa;	
	public ReciboPuntoVenta recibopuntoventaAux;
	public ReciboPuntoVenta recibopuntoventaAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public ReciboPuntoVenta recibopuntoventaTotales;
	public Long idReciboPuntoVentaActual;
	public Long iIdNuevoReciboPuntoVenta=0L;
	public int rowIndexActual=0;
	
	
	
	
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
	
	public Boolean isPermisoTodoReciboPuntoVenta;
	public Boolean isPermisoNuevoReciboPuntoVenta;
	public Boolean isPermisoActualizarReciboPuntoVenta;
	public Boolean isPermisoActualizarOriginalReciboPuntoVenta;
	public Boolean isPermisoEliminarReciboPuntoVenta;
	public Boolean isPermisoGuardarCambiosReciboPuntoVenta;
	public Boolean isPermisoConsultaReciboPuntoVenta;
	public Boolean isPermisoBusquedaReciboPuntoVenta;
	public Boolean isPermisoReporteReciboPuntoVenta;
	public Boolean isPermisoPaginacionMedioReciboPuntoVenta;
	public Boolean isPermisoPaginacionAltoReciboPuntoVenta;
	public Boolean isPermisoPaginacionTodoReciboPuntoVenta;
	public Boolean isPermisoCopiarReciboPuntoVenta;
	public Boolean isPermisoVerFormReciboPuntoVenta;
	public Boolean isPermisoDuplicarReciboPuntoVenta;
	public Boolean isPermisoOrdenReciboPuntoVenta;
	
	
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
	
	public ReciboPuntoVentaParameterReturnGeneral recibopuntoventaReturnGeneral;
	public ReciboPuntoVentaParameterReturnGeneral recibopuntoventaParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoReciboPuntoVenta=false;
	public Boolean esParaAccionDesdeFormularioReciboPuntoVenta=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected ReciboPuntoVentaSessionBeanAdditional recibopuntoventaSessionBeanAdditional=null;
	
	public ReciboPuntoVentaSessionBeanAdditional getReciboPuntoVentaSessionBeanAdditional() {
		return this.recibopuntoventaSessionBeanAdditional;
	}
	
	public void setReciboPuntoVentaSessionBeanAdditional(ReciboPuntoVentaSessionBeanAdditional recibopuntoventaSessionBeanAdditional) {
		try {
			this.recibopuntoventaSessionBeanAdditional=recibopuntoventaSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected ReciboPuntoVentaBeanSwingJInternalFrameAdditional recibopuntoventaBeanSwingJInternalFrameAdditional=null;
	//public class ReciboPuntoVentaBeanSwingJInternalFrame
	
	public ReciboPuntoVentaBeanSwingJInternalFrameAdditional getReciboPuntoVentaBeanSwingJInternalFrameAdditional() {
		return this.recibopuntoventaBeanSwingJInternalFrameAdditional;
	}
	
	public void setReciboPuntoVentaBeanSwingJInternalFrameAdditional(ReciboPuntoVentaBeanSwingJInternalFrameAdditional recibopuntoventaBeanSwingJInternalFrameAdditional) {
		try {
			this.recibopuntoventaBeanSwingJInternalFrameAdditional=recibopuntoventaBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public ReciboPuntoVentaLogic recibopuntoventaLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public ReciboPuntoVenta recibopuntoventaBean;
	public ReciboPuntoVentaConstantesFunciones recibopuntoventaConstantesFunciones;
	//public ReciboPuntoVentaParameterReturnGeneral recibopuntoventaReturnGeneral;
	
	//FK
	
	public ClienteLogic clienteLogic;
	public BancoLogic bancoLogic;
	
	//PARAMETROS
	
	
	//public List<ReciboPuntoVenta> recibopuntoventas;	
	//public List<ReciboPuntoVenta> recibopuntoventasEliminados;
	//public List<ReciboPuntoVenta> recibopuntoventasAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoReciboPuntoVenta=false;
	public Boolean isVisibilidadCeldaDuplicarReciboPuntoVenta=true;
	public Boolean isVisibilidadCeldaCopiarReciboPuntoVenta=true;
	public Boolean isVisibilidadCeldaVerFormReciboPuntoVenta=true;
	public Boolean isVisibilidadCeldaOrdenReciboPuntoVenta=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesReciboPuntoVenta=false;
	public Boolean isVisibilidadCeldaModificarReciboPuntoVenta=false;
	public Boolean isVisibilidadCeldaActualizarReciboPuntoVenta=false;
	public Boolean isVisibilidadCeldaEliminarReciboPuntoVenta=false;
	public Boolean isVisibilidadCeldaCancelarReciboPuntoVenta=false;
	public Boolean isVisibilidadCeldaGuardarReciboPuntoVenta=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosReciboPuntoVenta=false;	
	
	
	public Boolean isVisibilidadFK_IdBanco=false;
	public Boolean isVisibilidadFK_IdCliente=false;
	
	public Long getiIdNuevoReciboPuntoVenta() {
		return this.iIdNuevoReciboPuntoVenta;
	}

	public void setiIdNuevoReciboPuntoVenta(Long iIdNuevoReciboPuntoVenta) {
		this.iIdNuevoReciboPuntoVenta = iIdNuevoReciboPuntoVenta;
	}
	
	public Long getidReciboPuntoVentaActual() {
		return this.idReciboPuntoVentaActual;
	}

	public void setidReciboPuntoVentaActual(Long idReciboPuntoVentaActual) {
		this.idReciboPuntoVentaActual = idReciboPuntoVentaActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public ReciboPuntoVenta getrecibopuntoventa() {
		return this.recibopuntoventa;
	}

	public void setrecibopuntoventa(ReciboPuntoVenta recibopuntoventa) {
		this.recibopuntoventa = recibopuntoventa;
	}
	
	public ReciboPuntoVenta getrecibopuntoventaAux() {
		return this.recibopuntoventaAux;
	}

	public void setrecibopuntoventaAux(ReciboPuntoVenta recibopuntoventaAux) {
		this.recibopuntoventaAux = recibopuntoventaAux;
	}				
	
	public ReciboPuntoVenta getrecibopuntoventaAnterior() {
		return this.recibopuntoventaAnterior;
	}

	public void setrecibopuntoventaAnterior(ReciboPuntoVenta recibopuntoventaAnterior) {
		this.recibopuntoventaAnterior = recibopuntoventaAnterior;
	}	
	
	public ReciboPuntoVenta getrecibopuntoventaTotales() {
		return this.recibopuntoventaTotales;
	}

	public void setrecibopuntoventaTotales(ReciboPuntoVenta recibopuntoventaTotales) {
		this.recibopuntoventaTotales = recibopuntoventaTotales;
	}	
	
	public ReciboPuntoVenta getrecibopuntoventaBean() {
		return this.recibopuntoventaBean;
	}

	public void setrecibopuntoventaBean(ReciboPuntoVenta recibopuntoventaBean) {
		this.recibopuntoventaBean = recibopuntoventaBean;
	}	
	
	public ReciboPuntoVentaParameterReturnGeneral getrecibopuntoventaReturnGeneral() {
		return this.recibopuntoventaReturnGeneral;
	}

	public void setrecibopuntoventaReturnGeneral(ReciboPuntoVentaParameterReturnGeneral recibopuntoventaReturnGeneral) {
		this.recibopuntoventaReturnGeneral = recibopuntoventaReturnGeneral;
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

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public ReciboPuntoVentaLogic getReciboPuntoVentaLogic()	{		
		return recibopuntoventaLogic;
	}

	public void setReciboPuntoVentaLogic(ReciboPuntoVentaLogic recibopuntoventaLogic) {
		this.recibopuntoventaLogic = recibopuntoventaLogic;
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
	
	public Boolean getIsEsNuevoReciboPuntoVenta() {
		return isEsNuevoReciboPuntoVenta;
	}

	public void setIsEsNuevoReciboPuntoVenta(Boolean isEsNuevoReciboPuntoVenta) {
		this.isEsNuevoReciboPuntoVenta = isEsNuevoReciboPuntoVenta;
	}

	public Boolean getEsParaAccionDesdeFormularioReciboPuntoVenta() {
		return esParaAccionDesdeFormularioReciboPuntoVenta;
	}
	
	public void setEsParaAccionDesdeFormularioReciboPuntoVenta(Boolean esParaAccionDesdeFormularioReciboPuntoVenta) {
		this.esParaAccionDesdeFormularioReciboPuntoVenta = esParaAccionDesdeFormularioReciboPuntoVenta;
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

			clienteLogic.getClienteDataAccess().setIsForForeingKeyData(true);

			if(this.recibopuntoventaSessionBean==null) {
				this.recibopuntoventaSessionBean=new ReciboPuntoVentaSessionBean();
			}

			if(!this.recibopuntoventaSessionBean.getisBusquedaDesdeForeignKeySesionCliente()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					clienteLogic.getClienteDataAccess().setIsForForeingKeyData(true);

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
					clienteLogic.getEntityWithConnection(recibopuntoventaSessionBean.getlidClienteActual());
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

			bancoLogic.getBancoDataAccess().setIsForForeingKeyData(true);

			if(this.recibopuntoventaSessionBean==null) {
				this.recibopuntoventaSessionBean=new ReciboPuntoVentaSessionBean();
			}

			if(!this.recibopuntoventaSessionBean.getisBusquedaDesdeForeignKeySesionBanco()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					bancoLogic.getBancoDataAccess().setIsForForeingKeyData(true);

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
					bancoLogic.getEntityWithConnection(recibopuntoventaSessionBean.getlidBancoActual());
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

					if(this.recibopuntoventa!=null) {
						this.recibopuntoventa.setCliente(clienteTemp);
					}

					if(this.jInternalFrameDetalleFormReciboPuntoVenta!=null) {
						this.jInternalFrameDetalleFormReciboPuntoVenta.jComboBoxid_clienteReciboPuntoVenta.setSelectedItem(clienteTemp);
					}
				} else {
					//jComboBoxid_clienteReciboPuntoVenta.setSelectedItem(clienteTemp);
					if(this.jInternalFrameDetalleFormReciboPuntoVenta!=null) {
						if(this.jInternalFrameDetalleFormReciboPuntoVenta.jComboBoxid_clienteReciboPuntoVenta.getItemCount()>0) {
							this.jInternalFrameDetalleFormReciboPuntoVenta.jComboBoxid_clienteReciboPuntoVenta.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdCliente") || sFormularioTipoBusqueda.equals("Todos")){
					if(clienteTemp!=null && jComboBoxid_clienteFK_IdClienteReciboPuntoVenta!=null) {
						jComboBoxid_clienteFK_IdClienteReciboPuntoVenta.setSelectedItem(clienteTemp);
					} else {
						if(jComboBoxid_clienteFK_IdClienteReciboPuntoVenta!=null) {
							//jComboBoxid_clienteFK_IdClienteReciboPuntoVenta.setSelectedItem(clienteTemp);
							if(jComboBoxid_clienteFK_IdClienteReciboPuntoVenta.getItemCount()>0) {
								jComboBoxid_clienteFK_IdClienteReciboPuntoVenta.setSelectedIndex(0);
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
	public void setActualClienteForeignKeyGenerico(Long idClienteSeleccionado,JComboBox jComboBoxid_clienteReciboPuntoVentaGenerico)throws Exception
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
				jComboBoxid_clienteReciboPuntoVentaGenerico.setSelectedItem(clienteTemp);
			} else {
				if(jComboBoxid_clienteReciboPuntoVentaGenerico!=null && jComboBoxid_clienteReciboPuntoVentaGenerico.getItemCount()>0) {
					jComboBoxid_clienteReciboPuntoVentaGenerico.setSelectedIndex(0);
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

					if(this.recibopuntoventa!=null) {
						this.recibopuntoventa.setBanco(bancoTemp);
					}

					if(this.jInternalFrameDetalleFormReciboPuntoVenta!=null) {
						this.jInternalFrameDetalleFormReciboPuntoVenta.jComboBoxid_bancoReciboPuntoVenta.setSelectedItem(bancoTemp);
					}
				} else {
					//jComboBoxid_bancoReciboPuntoVenta.setSelectedItem(bancoTemp);
					if(this.jInternalFrameDetalleFormReciboPuntoVenta!=null) {
						if(this.jInternalFrameDetalleFormReciboPuntoVenta.jComboBoxid_bancoReciboPuntoVenta.getItemCount()>0) {
							this.jInternalFrameDetalleFormReciboPuntoVenta.jComboBoxid_bancoReciboPuntoVenta.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdBanco") || sFormularioTipoBusqueda.equals("Todos")){
					if(bancoTemp!=null && jComboBoxid_bancoFK_IdBancoReciboPuntoVenta!=null) {
						jComboBoxid_bancoFK_IdBancoReciboPuntoVenta.setSelectedItem(bancoTemp);
					} else {
						if(jComboBoxid_bancoFK_IdBancoReciboPuntoVenta!=null) {
							//jComboBoxid_bancoFK_IdBancoReciboPuntoVenta.setSelectedItem(bancoTemp);
							if(jComboBoxid_bancoFK_IdBancoReciboPuntoVenta.getItemCount()>0) {
								jComboBoxid_bancoFK_IdBancoReciboPuntoVenta.setSelectedIndex(0);
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
	public void setActualBancoForeignKeyGenerico(Long idBancoSeleccionado,JComboBox jComboBoxid_bancoReciboPuntoVentaGenerico)throws Exception
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
				jComboBoxid_bancoReciboPuntoVentaGenerico.setSelectedItem(bancoTemp);
			} else {
				if(jComboBoxid_bancoReciboPuntoVentaGenerico!=null && jComboBoxid_bancoReciboPuntoVentaGenerico.getItemCount()>0) {
					jComboBoxid_bancoReciboPuntoVentaGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarClienteForeignKey(ReciboPuntoVenta recibopuntoventa,JComboBox jComboBoxid_clienteReciboPuntoVentaGenerico)throws Exception
	{
		try
		{
			Cliente  clienteAux=new Cliente();

			if(jComboBoxid_clienteReciboPuntoVentaGenerico==null) {
				clienteAux=(Cliente)this.jInternalFrameDetalleFormReciboPuntoVenta.jComboBoxid_clienteReciboPuntoVenta.getSelectedItem();
			} else {
				clienteAux=(Cliente)jComboBoxid_clienteReciboPuntoVentaGenerico.getSelectedItem();
			}

			if(clienteAux!=null && clienteAux.getId()!=null) {
				recibopuntoventa.setid_cliente(clienteAux.getId());
				recibopuntoventa.setcliente_descripcion(ReciboPuntoVentaConstantesFunciones.getClienteDescripcion(clienteAux));
				recibopuntoventa.setCliente(clienteAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarBancoForeignKey(ReciboPuntoVenta recibopuntoventa,JComboBox jComboBoxid_bancoReciboPuntoVentaGenerico)throws Exception
	{
		try
		{
			Banco  bancoAux=new Banco();

			if(jComboBoxid_bancoReciboPuntoVentaGenerico==null) {
				bancoAux=(Banco)this.jInternalFrameDetalleFormReciboPuntoVenta.jComboBoxid_bancoReciboPuntoVenta.getSelectedItem();
			} else {
				bancoAux=(Banco)jComboBoxid_bancoReciboPuntoVentaGenerico.getSelectedItem();
			}

			if(bancoAux!=null && bancoAux.getId()!=null) {
				recibopuntoventa.setid_banco(bancoAux.getId());
				recibopuntoventa.setbanco_descripcion(ReciboPuntoVentaConstantesFunciones.getBancoDescripcion(bancoAux));
				recibopuntoventa.setBanco(bancoAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	
	


		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameClientesForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingCliente=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!ReciboPuntoVentaJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormReciboPuntoVenta!=null) { 
							this.jInternalFrameDetalleFormReciboPuntoVenta.jComboBoxid_clienteReciboPuntoVenta.removeAllItems();

							for(Cliente cliente:this.clientesForeignKey) {
								this.jInternalFrameDetalleFormReciboPuntoVenta.jComboBoxid_clienteReciboPuntoVenta.addItem(cliente);
							}
						}
					}

					if(this.jInternalFrameDetalleFormReciboPuntoVenta!=null) { 
					}

					if(!ReciboPuntoVentaJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdCliente") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ReciboPuntoVentaJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_clienteFK_IdClienteReciboPuntoVenta.removeAllItems();

							for(Cliente cliente:this.clientesForeignKey) {
								this.jComboBoxid_clienteFK_IdClienteReciboPuntoVenta.addItem(cliente);
							}
						}

						if(!ReciboPuntoVentaJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

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

					if(!ReciboPuntoVentaJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormReciboPuntoVenta!=null) { 
							this.jInternalFrameDetalleFormReciboPuntoVenta.jComboBoxid_bancoReciboPuntoVenta.removeAllItems();

							for(Banco banco:this.bancosForeignKey) {
								this.jInternalFrameDetalleFormReciboPuntoVenta.jComboBoxid_bancoReciboPuntoVenta.addItem(banco);
							}
						}
					}

					if(this.jInternalFrameDetalleFormReciboPuntoVenta!=null) { 
					}

					if(!ReciboPuntoVentaJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdBanco") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ReciboPuntoVentaJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_bancoFK_IdBancoReciboPuntoVenta.removeAllItems();

							for(Banco banco:this.bancosForeignKey) {
								this.jComboBoxid_bancoFK_IdBancoReciboPuntoVenta.addItem(banco);
							}
						}

						if(!ReciboPuntoVentaJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

	


		public void setSelectedItemCombosFrameClienteForeignKey(Cliente cliente,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormReciboPuntoVenta!=null) {
							this.jInternalFrameDetalleFormReciboPuntoVenta.jComboBoxid_clienteReciboPuntoVenta.setSelectedItem(cliente);
						}
					} else {
						if(this.jInternalFrameDetalleFormReciboPuntoVenta!=null) {
							this.jInternalFrameDetalleFormReciboPuntoVenta.jComboBoxid_clienteReciboPuntoVenta.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_clienteFK_IdClienteReciboPuntoVenta.setSelectedItem(cliente);
						} else {
							this.jComboBoxid_clienteFK_IdClienteReciboPuntoVenta.setSelectedIndex(iIndexSelected);
						}

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
						if(this.jInternalFrameDetalleFormReciboPuntoVenta!=null) {
							this.jInternalFrameDetalleFormReciboPuntoVenta.jComboBoxid_bancoReciboPuntoVenta.setSelectedItem(banco);
						}
					} else {
						if(this.jInternalFrameDetalleFormReciboPuntoVenta!=null) {
							this.jInternalFrameDetalleFormReciboPuntoVenta.jComboBoxid_bancoReciboPuntoVenta.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_bancoFK_IdBancoReciboPuntoVenta.setSelectedItem(banco);
						} else {
							this.jComboBoxid_bancoFK_IdBancoReciboPuntoVenta.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesReciboPuntoVenta() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			ReciboPuntoVentaConstantesFunciones.refrescarForeignKeysDescripcionesReciboPuntoVenta(this.recibopuntoventaLogic.getReciboPuntoVentas());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			ReciboPuntoVentaConstantesFunciones.refrescarForeignKeysDescripcionesReciboPuntoVenta(this.recibopuntoventas);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Cliente.class));
		classes.add(new Classe(Banco.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//recibopuntoventaLogic.setReciboPuntoVentas(this.recibopuntoventas);
			recibopuntoventaLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public ReciboPuntoVentaParameterReturnGeneral getReciboPuntoVentaParameterGeneral() {
		return this.recibopuntoventaParameterGeneral;
	}
	
	public void setReciboPuntoVentaParameterGeneral(ReciboPuntoVentaParameterReturnGeneral recibopuntoventaParameterGeneral) {
		this.recibopuntoventaParameterGeneral = recibopuntoventaParameterGeneral;
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
	
	public Boolean getIsPermisoTodoReciboPuntoVenta() {
		return isPermisoTodoReciboPuntoVenta;
	}

	public void setIsPermisoTodoReciboPuntoVenta(Boolean isPermisoTodoReciboPuntoVenta) {
		this.isPermisoTodoReciboPuntoVenta = isPermisoTodoReciboPuntoVenta;
	}

	public Boolean getIsPermisoNuevoReciboPuntoVenta() {
		return isPermisoNuevoReciboPuntoVenta;
	}

	public void setIsPermisoNuevoReciboPuntoVenta(Boolean isPermisoNuevoReciboPuntoVenta) {
		this.isPermisoNuevoReciboPuntoVenta = isPermisoNuevoReciboPuntoVenta;
	}

	public Boolean getIsPermisoActualizarReciboPuntoVenta() {
		return isPermisoActualizarReciboPuntoVenta;
	}

	public void setIsPermisoActualizarReciboPuntoVenta(Boolean isPermisoActualizarReciboPuntoVenta) {
		this.isPermisoActualizarReciboPuntoVenta = isPermisoActualizarReciboPuntoVenta;
	}

	public Boolean getIsPermisoEliminarReciboPuntoVenta() {
		return isPermisoEliminarReciboPuntoVenta;
	}

	public void setIsPermisoEliminarReciboPuntoVenta(Boolean isPermisoEliminarReciboPuntoVenta) {
		this.isPermisoEliminarReciboPuntoVenta = isPermisoEliminarReciboPuntoVenta;
	}

	public Boolean getIsPermisoGuardarCambiosReciboPuntoVenta() {
		return isPermisoGuardarCambiosReciboPuntoVenta;
	}

	public void setIsPermisoGuardarCambiosReciboPuntoVenta(Boolean isPermisoGuardarCambiosReciboPuntoVenta) {
		this.isPermisoGuardarCambiosReciboPuntoVenta = isPermisoGuardarCambiosReciboPuntoVenta;
	}
	
	public Boolean getIsPermisoConsultaReciboPuntoVenta() {
		return isPermisoConsultaReciboPuntoVenta;
	}

	public void setIsPermisoConsultaReciboPuntoVenta(Boolean isPermisoConsultaReciboPuntoVenta) {
		this.isPermisoConsultaReciboPuntoVenta = isPermisoConsultaReciboPuntoVenta;
	}

	public Boolean getIsPermisoBusquedaReciboPuntoVenta() {
		return isPermisoBusquedaReciboPuntoVenta;
	}

	public void setIsPermisoBusquedaReciboPuntoVenta(Boolean isPermisoBusquedaReciboPuntoVenta) {
		this.isPermisoBusquedaReciboPuntoVenta = isPermisoBusquedaReciboPuntoVenta;
	}

	public Boolean getIsPermisoReporteReciboPuntoVenta() {
		return isPermisoReporteReciboPuntoVenta;
	}

	public void setIsPermisoReporteReciboPuntoVenta(Boolean isPermisoReporteReciboPuntoVenta) {
		this.isPermisoReporteReciboPuntoVenta = isPermisoReporteReciboPuntoVenta;
	}
	
	public Boolean getIsPermisoPaginacionMedioReciboPuntoVenta() {
		return isPermisoPaginacionMedioReciboPuntoVenta;
	}

	public void setIsPermisoPaginacionMedioReciboPuntoVenta(Boolean isPermisoPaginacionMedioReciboPuntoVenta) {
		this.isPermisoPaginacionMedioReciboPuntoVenta = isPermisoPaginacionMedioReciboPuntoVenta;
	}
	
	public Boolean getIsPermisoPaginacionTodoReciboPuntoVenta() {
		return isPermisoPaginacionTodoReciboPuntoVenta;
	}

	public void setIsPermisoPaginacionTodoReciboPuntoVenta(Boolean isPermisoPaginacionTodoReciboPuntoVenta) {
		this.isPermisoPaginacionTodoReciboPuntoVenta = isPermisoPaginacionTodoReciboPuntoVenta;
	}
	
	public Boolean getIsPermisoPaginacionAltoReciboPuntoVenta() {
		return isPermisoPaginacionAltoReciboPuntoVenta;
	}

	public void setIsPermisoPaginacionAltoReciboPuntoVenta(Boolean isPermisoPaginacionAltoReciboPuntoVenta) {
		this.isPermisoPaginacionAltoReciboPuntoVenta = isPermisoPaginacionAltoReciboPuntoVenta;
	}
	
	public Boolean getIsPermisoCopiarReciboPuntoVenta() {
		return isPermisoCopiarReciboPuntoVenta;
	}

	public void setIsPermisoCopiarReciboPuntoVenta(Boolean isPermisoCopiarReciboPuntoVenta) {
		this.isPermisoCopiarReciboPuntoVenta = isPermisoCopiarReciboPuntoVenta;
	}
	
	public Boolean getIsPermisoVerFormReciboPuntoVenta() {
		return isPermisoVerFormReciboPuntoVenta;
	}

	public void setIsPermisoVerFormReciboPuntoVenta(Boolean isPermisoVerFormReciboPuntoVenta) {
		this.isPermisoVerFormReciboPuntoVenta = isPermisoVerFormReciboPuntoVenta;
	}
	
	public Boolean getIsPermisoDuplicarReciboPuntoVenta() {
		return isPermisoDuplicarReciboPuntoVenta;
	}

	public void setIsPermisoDuplicarReciboPuntoVenta(Boolean isPermisoDuplicarReciboPuntoVenta) {
		this.isPermisoDuplicarReciboPuntoVenta = isPermisoDuplicarReciboPuntoVenta;
	}
	
	public Boolean getIsPermisoOrdenReciboPuntoVenta() {
		return isPermisoOrdenReciboPuntoVenta;
	}

	public void setIsPermisoOrdenReciboPuntoVenta(Boolean isPermisoOrdenReciboPuntoVenta) {
		this.isPermisoOrdenReciboPuntoVenta = isPermisoOrdenReciboPuntoVenta;
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
	
	public Boolean getIsVisibilidadCeldaNuevoReciboPuntoVenta() {
		return isVisibilidadCeldaNuevoReciboPuntoVenta;
	}

	public void setIsVisibilidadCeldaNuevoReciboPuntoVenta(Boolean isVisibilidadCeldaNuevoReciboPuntoVenta) {
		this.isVisibilidadCeldaNuevoReciboPuntoVenta = isVisibilidadCeldaNuevoReciboPuntoVenta;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarReciboPuntoVenta() {
		return isVisibilidadCeldaDuplicarReciboPuntoVenta;
	}

	public void setIsVisibilidadCeldaDuplicarReciboPuntoVenta(Boolean isVisibilidadCeldaDuplicarReciboPuntoVenta) {
		this.isVisibilidadCeldaDuplicarReciboPuntoVenta = isVisibilidadCeldaDuplicarReciboPuntoVenta;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarReciboPuntoVenta() {
		return isVisibilidadCeldaCopiarReciboPuntoVenta;
	}

	public void setIsVisibilidadCeldaCopiarReciboPuntoVenta(Boolean isVisibilidadCeldaCopiarReciboPuntoVenta) {
		this.isVisibilidadCeldaCopiarReciboPuntoVenta = isVisibilidadCeldaCopiarReciboPuntoVenta;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormReciboPuntoVenta() {
		return isVisibilidadCeldaVerFormReciboPuntoVenta;
	}

	public void setIsVisibilidadCeldaVerFormReciboPuntoVenta(Boolean isVisibilidadCeldaVerFormReciboPuntoVenta) {
		this.isVisibilidadCeldaVerFormReciboPuntoVenta = isVisibilidadCeldaVerFormReciboPuntoVenta;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenReciboPuntoVenta() {
		return isVisibilidadCeldaOrdenReciboPuntoVenta;
	}

	public void setIsVisibilidadCeldaOrdenReciboPuntoVenta(Boolean isVisibilidadCeldaOrdenReciboPuntoVenta) {
		this.isVisibilidadCeldaOrdenReciboPuntoVenta = isVisibilidadCeldaOrdenReciboPuntoVenta;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesReciboPuntoVenta() {
		return isVisibilidadCeldaNuevoRelacionesReciboPuntoVenta;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesReciboPuntoVenta(Boolean isVisibilidadCeldaNuevoRelacionesReciboPuntoVenta) {
		this.isVisibilidadCeldaNuevoRelacionesReciboPuntoVenta = isVisibilidadCeldaNuevoRelacionesReciboPuntoVenta;
	}
	
	public Boolean getIsVisibilidadCeldaModificarReciboPuntoVenta() {
		return isVisibilidadCeldaModificarReciboPuntoVenta;
	}

	public void setIsVisibilidadCeldaModificarReciboPuntoVenta(Boolean isVisibilidadCeldaModificarReciboPuntoVenta) {
		this.isVisibilidadCeldaModificarReciboPuntoVenta = isVisibilidadCeldaModificarReciboPuntoVenta;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarReciboPuntoVenta() {
		return isVisibilidadCeldaActualizarReciboPuntoVenta;
	}

	public void setIsVisibilidadCeldaActualizarReciboPuntoVenta(Boolean isVisibilidadCeldaActualizarReciboPuntoVenta) {
		this.isVisibilidadCeldaActualizarReciboPuntoVenta = isVisibilidadCeldaActualizarReciboPuntoVenta;
	}

	public Boolean getIsVisibilidadCeldaEliminarReciboPuntoVenta() {
		return isVisibilidadCeldaEliminarReciboPuntoVenta;
	}

	public void setIsVisibilidadCeldaEliminarReciboPuntoVenta(Boolean isVisibilidadCeldaEliminarReciboPuntoVenta) {
		this.isVisibilidadCeldaEliminarReciboPuntoVenta = isVisibilidadCeldaEliminarReciboPuntoVenta;
	}

	public Boolean getIsVisibilidadCeldaCancelarReciboPuntoVenta() {
		return isVisibilidadCeldaCancelarReciboPuntoVenta;
	}

	public void setIsVisibilidadCeldaCancelarReciboPuntoVenta(Boolean isVisibilidadCeldaCancelarReciboPuntoVenta) {
		this.isVisibilidadCeldaCancelarReciboPuntoVenta = isVisibilidadCeldaCancelarReciboPuntoVenta;
	}

	public Boolean getIsVisibilidadCeldaGuardarReciboPuntoVenta() {
		return isVisibilidadCeldaGuardarReciboPuntoVenta;
	}

	public void setIsVisibilidadCeldaGuardarReciboPuntoVenta(Boolean isVisibilidadCeldaGuardarReciboPuntoVenta) {
		this.isVisibilidadCeldaGuardarReciboPuntoVenta = isVisibilidadCeldaGuardarReciboPuntoVenta;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosReciboPuntoVenta() {
		return isVisibilidadCeldaGuardarCambiosReciboPuntoVenta;
	}

	public void setIsVisibilidadCeldaGuardarCambiosReciboPuntoVenta(Boolean isVisibilidadCeldaGuardarCambiosReciboPuntoVenta) {
		this.isVisibilidadCeldaGuardarCambiosReciboPuntoVenta = isVisibilidadCeldaGuardarCambiosReciboPuntoVenta;
	}
		
	public ReciboPuntoVentaSessionBean getrecibopuntoventaSessionBean() {
		return this.recibopuntoventaSessionBean;
	}
	
	public void setrecibopuntoventaSessionBean(ReciboPuntoVentaSessionBean recibopuntoventaSessionBean) {
		this.recibopuntoventaSessionBean=recibopuntoventaSessionBean;
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

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysReciboPuntoVenta(ReciboPuntoVenta recibopuntoventa)throws Exception {
		try {
			
				this.setActualParaGuardarClienteForeignKey(recibopuntoventa,null);
				this.setActualParaGuardarBancoForeignKey(recibopuntoventa,null);
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
	
	public void bugActualizarReferenciaActual(ReciboPuntoVenta recibopuntoventa,ReciboPuntoVenta recibopuntoventaAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalReciboPuntoVenta(recibopuntoventa);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		recibopuntoventaAux.setId(recibopuntoventa.getId());
		recibopuntoventaAux.setVersionRow(recibopuntoventa.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessReciboPuntoVenta();
		
			int intSelectedRow = this.jTableDatosReciboPuntoVenta.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.recibopuntoventa =(ReciboPuntoVenta) this.recibopuntoventaLogic.getReciboPuntoVentas().toArray()[this.jTableDatosReciboPuntoVenta.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.recibopuntoventa =(ReciboPuntoVenta) this.recibopuntoventas.toArray()[this.jTableDatosReciboPuntoVenta.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(ReciboPuntoVentaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualReciboPuntoVenta(this.recibopuntoventa,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysReciboPuntoVenta(this.recibopuntoventa);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = recibopuntoventaValidator.getInvalidValues(this.recibopuntoventa);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			recibopuntoventaLogic.setDatosCliente(datosCliente);
			recibopuntoventaLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				recibopuntoventaAux=new  ReciboPuntoVenta();
				
				recibopuntoventaAux.setIsNew(true);
				recibopuntoventaAux.setIsChanged(true);
				
				recibopuntoventaAux.setReciboPuntoVentaOriginal(this.recibopuntoventa);
				
				recibopuntoventaAux.setId(this.recibopuntoventa.getId());	
				recibopuntoventaAux.setVersionRow(this.recibopuntoventa.getVersionRow());	
				recibopuntoventaAux.setid_cliente(this.recibopuntoventa.getid_cliente());	
				recibopuntoventaAux.setid_banco(this.recibopuntoventa.getid_banco());	
				recibopuntoventaAux.setvalor_efectivo(this.recibopuntoventa.getvalor_efectivo());	
				recibopuntoventaAux.setvalor_cheque(this.recibopuntoventa.getvalor_cheque());	
				recibopuntoventaAux.setnumero_cheque(this.recibopuntoventa.getnumero_cheque());	
				recibopuntoventaAux.setfecha(this.recibopuntoventa.getfecha());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.recibopuntoventaSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.recibopuntoventaSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(recibopuntoventaAux,recibopuntoventaLogic.getReciboPuntoVentas());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(recibopuntoventaAux,recibopuntoventas);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.recibopuntoventaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.recibopuntoventaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						recibopuntoventaLogic.saveReciboPuntoVentas();//WithConnection
						//recibopuntoventaLogic.getSetVersionRowReciboPuntoVentas();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.recibopuntoventa,recibopuntoventaAux);
					
					this.refrescarForeignKeysDescripcionesReciboPuntoVenta();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.recibopuntoventaSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE	
						
						if(!this.recibopuntoventaSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								recibopuntoventaLogic.saveReciboPuntoVentaRelaciones(recibopuntoventaAux);//WithConnection
								//recibopuntoventaLogic.getSetVersionRowReciboPuntoVentas();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.recibopuntoventa,recibopuntoventaAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE	
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.recibopuntoventaSessionBean.getEstaModoGuardarRelaciones() 
									|| this.recibopuntoventaSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(recibopuntoventaAux,recibopuntoventaLogic.getReciboPuntoVentas());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(recibopuntoventaAux,recibopuntoventas);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.recibopuntoventa,recibopuntoventaAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				recibopuntoventaAux=new  ReciboPuntoVenta();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.recibopuntoventaSessionBean.getEsGuardarRelacionado() 
					|| (this.recibopuntoventaSessionBean.getEsGuardarRelacionado() && this.recibopuntoventa.getId()>=0)) {
						
					recibopuntoventaAux.setIsNew(false);
				}
				
				recibopuntoventaAux.setIsDeleted(false);
			
				recibopuntoventaAux.setId(this.recibopuntoventa.getId());	
				recibopuntoventaAux.setVersionRow(this.recibopuntoventa.getVersionRow());	
				recibopuntoventaAux.setid_cliente(this.recibopuntoventa.getid_cliente());	
				recibopuntoventaAux.setid_banco(this.recibopuntoventa.getid_banco());	
				recibopuntoventaAux.setvalor_efectivo(this.recibopuntoventa.getvalor_efectivo());	
				recibopuntoventaAux.setvalor_cheque(this.recibopuntoventa.getvalor_cheque());	
				recibopuntoventaAux.setnumero_cheque(this.recibopuntoventa.getnumero_cheque());	
				recibopuntoventaAux.setfecha(this.recibopuntoventa.getfecha());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(recibopuntoventaAux,recibopuntoventaLogic.getReciboPuntoVentas());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(recibopuntoventaAux,recibopuntoventas);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.recibopuntoventaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.recibopuntoventaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						recibopuntoventaLogic.saveReciboPuntoVentas();//WithConnection
						//recibopuntoventaLogic.getSetVersionRowReciboPuntoVentas();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.recibopuntoventa,recibopuntoventaAux);
					
					this.refrescarForeignKeysDescripcionesReciboPuntoVenta();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.recibopuntoventaSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						if(!this.recibopuntoventaSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								recibopuntoventaLogic.saveReciboPuntoVentaRelaciones(recibopuntoventaAux);//WithConnection
								//recibopuntoventaLogic.getSetVersionRowReciboPuntoVentas();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.recibopuntoventa,recibopuntoventaAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.recibopuntoventaSessionBean.getEstaModoGuardarRelaciones() 
									|| this.recibopuntoventaSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(recibopuntoventaAux,recibopuntoventaLogic.getReciboPuntoVentas());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(recibopuntoventaAux,recibopuntoventas);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.recibopuntoventa,recibopuntoventaAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				recibopuntoventaAux=new  ReciboPuntoVenta();
				
				recibopuntoventaAux.setIsNew(false);
				recibopuntoventaAux.setIsChanged(false);
				
				recibopuntoventaAux.setIsDeleted(true);
				
				recibopuntoventaAux.setId(this.recibopuntoventa.getId());	
				recibopuntoventaAux.setVersionRow(this.recibopuntoventa.getVersionRow());	
				recibopuntoventaAux.setid_cliente(this.recibopuntoventa.getid_cliente());	
				recibopuntoventaAux.setid_banco(this.recibopuntoventa.getid_banco());	
				recibopuntoventaAux.setvalor_efectivo(this.recibopuntoventa.getvalor_efectivo());	
				recibopuntoventaAux.setvalor_cheque(this.recibopuntoventa.getvalor_cheque());	
				recibopuntoventaAux.setnumero_cheque(this.recibopuntoventa.getnumero_cheque());	
				recibopuntoventaAux.setfecha(this.recibopuntoventa.getfecha());	
				
				if(this.recibopuntoventaSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.recibopuntoventaAux.getId()>=0) {	
						this.recibopuntoventasEliminados.add(recibopuntoventaAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(recibopuntoventaAux,recibopuntoventaLogic.getReciboPuntoVentas());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(recibopuntoventaAux,recibopuntoventas);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.recibopuntoventaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.recibopuntoventaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						recibopuntoventaLogic.saveReciboPuntoVentas();//WithConnection
						//recibopuntoventaLogic.getSetVersionRowReciboPuntoVentas();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.recibopuntoventaSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						
						if(!this.recibopuntoventaSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								recibopuntoventaLogic.saveReciboPuntoVentaRelaciones(recibopuntoventaAux);//WithConnection
								//recibopuntoventaLogic.getSetVersionRowReciboPuntoVentas();//WithConnection
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
							if(this.recibopuntoventaSessionBean.getEstaModoGuardarRelaciones() 
								|| this.recibopuntoventaSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(recibopuntoventaAux,recibopuntoventaLogic.getReciboPuntoVentas());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(recibopuntoventaAux,recibopuntoventas);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.recibopuntoventaLogic.getReciboPuntoVentas().addAll(this.recibopuntoventasEliminados);
					
					recibopuntoventaLogic.saveReciboPuntoVentas();//WithConnection
					//recibopuntoventaLogic.getSetVersionRowReciboPuntoVentas();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesReciboPuntoVenta();
				
				this.recibopuntoventasEliminados= new ArrayList<ReciboPuntoVenta>();		
			}
			
			if(this.recibopuntoventaSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.recibopuntoventaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Recibo Punto Venta GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Recibo Punto Venta",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.recibopuntoventa=recibopuntoventaAux;
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
      		//this.finishProcessReciboPuntoVenta();
      	}
		
	}	
	
	public void actualizarRelaciones(ReciboPuntoVenta recibopuntoventaLocal) throws Exception {
		
		if(this.recibopuntoventaSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(ReciboPuntoVenta recibopuntoventaLocal) throws Exception {	
		if(this.recibopuntoventaSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(ClienteDetalleFormJInternalFrame.class)) {
				ClienteBeanSwingJInternalFrame clienteBeanSwingJInternalFrameLocal=(ClienteBeanSwingJInternalFrame) ((ClienteDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				clienteBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoCliente(clienteBeanSwingJInternalFrameLocal.getcliente(),true);
				clienteBeanSwingJInternalFrameLocal.actualizarLista(clienteBeanSwingJInternalFrameLocal.cliente,this.clientesForeignKey);

				clienteBeanSwingJInternalFrameLocal.actualizarRelaciones(clienteBeanSwingJInternalFrameLocal.cliente);

				recibopuntoventaLocal.setCliente(clienteBeanSwingJInternalFrameLocal.cliente);

				this.addItemDefectoCombosForeignKeyCliente();
				this.cargarCombosFrameClientesForeignKey("Formulario");
				this.setActualClienteForeignKey(clienteBeanSwingJInternalFrameLocal.cliente.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(BancoDetalleFormJInternalFrame.class)) {
				BancoBeanSwingJInternalFrame bancoBeanSwingJInternalFrameLocal=(BancoBeanSwingJInternalFrame) ((BancoDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				bancoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoBanco(bancoBeanSwingJInternalFrameLocal.getbanco(),true);
				bancoBeanSwingJInternalFrameLocal.actualizarLista(bancoBeanSwingJInternalFrameLocal.banco,this.bancosForeignKey);

				bancoBeanSwingJInternalFrameLocal.actualizarRelaciones(bancoBeanSwingJInternalFrameLocal.banco);

				recibopuntoventaLocal.setBanco(bancoBeanSwingJInternalFrameLocal.banco);

				this.addItemDefectoCombosForeignKeyBanco();
				this.cargarCombosFrameBancosForeignKey("Formulario");
				this.setActualBancoForeignKey(bancoBeanSwingJInternalFrameLocal.banco.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarReciboPuntoVentaActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosReciboPuntoVenta.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.recibopuntoventa =(ReciboPuntoVenta) this.recibopuntoventaLogic.getReciboPuntoVentas().toArray()[this.jTableDatosReciboPuntoVenta.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.recibopuntoventa =(ReciboPuntoVenta) this.recibopuntoventas.toArray()[this.jTableDatosReciboPuntoVenta.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = recibopuntoventaValidator.getInvalidValues(this.recibopuntoventa);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(ReciboPuntoVenta recibopuntoventa,List<ReciboPuntoVenta> recibopuntoventas) throws Exception {
		try	{		
			ReciboPuntoVentaConstantesFunciones.actualizarLista(recibopuntoventa,recibopuntoventas,this.recibopuntoventaSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(ReciboPuntoVenta recibopuntoventa,List<ReciboPuntoVenta> recibopuntoventas) throws Exception {
		try	{			
			ReciboPuntoVentaConstantesFunciones.actualizarSelectedLista(recibopuntoventa,recibopuntoventas);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<ReciboPuntoVenta> recibopuntoventasLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				recibopuntoventasLocal=this.recibopuntoventaLogic.getReciboPuntoVentas();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				recibopuntoventasLocal=this.recibopuntoventas;
			}
			//ARCHITECTURE
		
			for(ReciboPuntoVenta recibopuntoventaLocal:recibopuntoventasLocal) {
				if(this.permiteMantenimiento(recibopuntoventaLocal) && recibopuntoventaLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+ReciboPuntoVentaConstantesFunciones.getReciboPuntoVentaLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(ReciboPuntoVentaConstantesFunciones.IDCLIENTE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormReciboPuntoVenta.jLabelid_clienteReciboPuntoVenta,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ReciboPuntoVentaConstantesFunciones.IDBANCO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormReciboPuntoVenta.jLabelid_bancoReciboPuntoVenta,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ReciboPuntoVentaConstantesFunciones.VALOREFECTIVO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormReciboPuntoVenta.jLabelvalor_efectivoReciboPuntoVenta,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ReciboPuntoVentaConstantesFunciones.VALORCHEQUE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormReciboPuntoVenta.jLabelvalor_chequeReciboPuntoVenta,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ReciboPuntoVentaConstantesFunciones.NUMEROCHEQUE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormReciboPuntoVenta.jLabelnumero_chequeReciboPuntoVenta,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ReciboPuntoVentaConstantesFunciones.FECHA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormReciboPuntoVenta.jLabelfechaReciboPuntoVenta,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormReciboPuntoVenta!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormReciboPuntoVenta.jLabelid_clienteReciboPuntoVenta,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormReciboPuntoVenta.jLabelid_bancoReciboPuntoVenta,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormReciboPuntoVenta.jLabelvalor_efectivoReciboPuntoVenta,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormReciboPuntoVenta.jLabelvalor_chequeReciboPuntoVenta,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormReciboPuntoVenta.jLabelnumero_chequeReciboPuntoVenta,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormReciboPuntoVenta.jLabelfechaReciboPuntoVenta,"");
		
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
		this.iIdNuevoReciboPuntoVenta--;	
		
		
		this.recibopuntoventaAux=new ReciboPuntoVenta();
		
		this.recibopuntoventaAux.setId(this.iIdNuevoReciboPuntoVenta);
		this.recibopuntoventaAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.recibopuntoventaLogic.getReciboPuntoVentas().add(this.recibopuntoventaAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.recibopuntoventas.add(this.recibopuntoventaAux);
		}
		//ARCHITECTURE
		
		this.recibopuntoventa=this.recibopuntoventaAux;
		
		if(ReciboPuntoVentaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioReciboPuntoVenta(this.recibopuntoventa);
			this.setVariablesObjetoActualToFormularioForeignKeyReciboPuntoVenta(this.recibopuntoventa);
		}
				
		//this.setDefaultControlesReciboPuntoVenta();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyReciboPuntoVenta();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyReciboPuntoVenta();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyReciboPuntoVenta();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualReciboPuntoVenta(this.recibopuntoventaBean,this.recibopuntoventa,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysReciboPuntoVenta(this.recibopuntoventa);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(ReciboPuntoVentaConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.recibopuntoventaSessionBean.getConGuardarRelaciones()) {
			classes=ReciboPuntoVentaConstantesFunciones.getClassesRelationshipsOfReciboPuntoVenta(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.recibopuntoventaReturnGeneral=recibopuntoventaLogic.procesarEventosReciboPuntoVentasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.recibopuntoventaLogic.getReciboPuntoVentas(),this.recibopuntoventa,this.recibopuntoventaParameterGeneral,this.isEsNuevoReciboPuntoVenta,classes);//this.recibopuntoventaLogic.getReciboPuntoVenta()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanReciboPuntoVenta(this.recibopuntoventaReturnGeneral,this.recibopuntoventaBean,false);
		
		if(this.recibopuntoventaReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyReciboPuntoVenta(this.recibopuntoventaReturnGeneral.getReciboPuntoVenta());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioReciboPuntoVenta(this.recibopuntoventaReturnGeneral.getReciboPuntoVenta());
		}
		
		if(this.recibopuntoventaReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioReciboPuntoVenta(this.recibopuntoventaReturnGeneral.getReciboPuntoVenta(),classes);//this.recibopuntoventaBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualReciboPuntoVenta(this.recibopuntoventa,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyReciboPuntoVenta();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyReciboPuntoVenta();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			ReciboPuntoVentaBeanSwingJInternalFrameAdditional.RecargarFormReciboPuntoVenta(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingReciboPuntoVenta(false);
						
			if(recibopuntoventaSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(ReciboPuntoVentaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualReciboPuntoVenta();
			}
			
			this.actualizarVisualTableDatosReciboPuntoVenta();
			
			this.jTableDatosReciboPuntoVenta.setRowSelectionInterval(this.getIndiceNuevoReciboPuntoVenta(), this.getIndiceNuevoReciboPuntoVenta());
			
			this.seleccionarFilaTablaReciboPuntoVentaActual();
						
			this.actualizarEstadoCeldasBotonesReciboPuntoVenta("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesReciboPuntoVenta(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormReciboPuntoVenta.jTextFieldvalor_efectivoReciboPuntoVenta.setEnabled(isHabilitar && this.recibopuntoventaConstantesFunciones.activarvalor_efectivoReciboPuntoVenta);
		this.jInternalFrameDetalleFormReciboPuntoVenta.jTextFieldvalor_chequeReciboPuntoVenta.setEnabled(isHabilitar && this.recibopuntoventaConstantesFunciones.activarvalor_chequeReciboPuntoVenta);
		this.jInternalFrameDetalleFormReciboPuntoVenta.jTextFieldnumero_chequeReciboPuntoVenta.setEnabled(isHabilitar && this.recibopuntoventaConstantesFunciones.activarnumero_chequeReciboPuntoVenta);
		this.jInternalFrameDetalleFormReciboPuntoVenta.jDateChooserfechaReciboPuntoVenta.setEnabled(isHabilitar && this.recibopuntoventaConstantesFunciones.activarfechaReciboPuntoVenta);	
		
		this.jInternalFrameDetalleFormReciboPuntoVenta.jComboBoxid_clienteReciboPuntoVenta.setEnabled(isHabilitar && this.recibopuntoventaConstantesFunciones.activarid_clienteReciboPuntoVenta);
		this.jInternalFrameDetalleFormReciboPuntoVenta.jComboBoxid_bancoReciboPuntoVenta.setEnabled(isHabilitar && this.recibopuntoventaConstantesFunciones.activarid_bancoReciboPuntoVenta);
	};
	
	public void setDefaultControlesReciboPuntoVenta() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoReciboPuntoVenta(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.recibopuntoventaSessionBean.setConGuardarRelaciones(true);			
			this.recibopuntoventaSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormReciboPuntoVenta.jTabbedPaneRelacionesReciboPuntoVenta.setVisible(true);
			
					
		} else {
			//this.recibopuntoventaSessionBean.setConGuardarRelaciones(false);			
			this.recibopuntoventaSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormReciboPuntoVenta.jTabbedPaneRelacionesReciboPuntoVenta.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoReciboPuntoVenta() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ReciboPuntoVenta recibopuntoventaAux:this.recibopuntoventaLogic.getReciboPuntoVentas()) {
				if(recibopuntoventaAux.getId().equals(this.iIdNuevoReciboPuntoVenta)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ReciboPuntoVenta recibopuntoventaAux:this.recibopuntoventas) {
				if(recibopuntoventaAux.getId().equals(this.iIdNuevoReciboPuntoVenta)) {
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
	
	public int getIndiceActualReciboPuntoVenta(ReciboPuntoVenta recibopuntoventa,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ReciboPuntoVenta recibopuntoventaAux:this.recibopuntoventaLogic.getReciboPuntoVentas()) {
				if(recibopuntoventaAux.getId().equals(recibopuntoventa.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ReciboPuntoVenta recibopuntoventaAux:this.recibopuntoventas) {
				if(recibopuntoventaAux.getId().equals(recibopuntoventa.getId())) {
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
	
	public void setCamposBaseDesdeOriginalReciboPuntoVenta(ReciboPuntoVenta recibopuntoventaOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ReciboPuntoVenta recibopuntoventaAux:this.recibopuntoventaLogic.getReciboPuntoVentas()) {
				if(recibopuntoventaAux.getReciboPuntoVentaOriginal().getId().equals(recibopuntoventaOriginal.getId())) {
					existe=true;
					recibopuntoventaOriginal.setId(recibopuntoventaAux.getId());
					recibopuntoventaOriginal.setVersionRow(recibopuntoventaAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ReciboPuntoVenta recibopuntoventaAux:this.recibopuntoventas) {
				if(recibopuntoventaAux.getReciboPuntoVentaOriginal().getId().equals(recibopuntoventaOriginal.getId())) {
					existe=true;
					recibopuntoventaOriginal.setId(recibopuntoventaAux.getId());
					recibopuntoventaOriginal.setVersionRow(recibopuntoventaAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosReciboPuntoVenta(Boolean esParaCancelar) throws Exception {
		recibopuntoventasAux=new ArrayList<ReciboPuntoVenta>();
		recibopuntoventaAux=new ReciboPuntoVenta();
		
		if(!this.recibopuntoventaSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(ReciboPuntoVenta recibopuntoventaAux:this.recibopuntoventaLogic.getReciboPuntoVentas()) {
					if(recibopuntoventaAux.getId()<0) {
						recibopuntoventasAux.add(recibopuntoventaAux);
					}		
				}
				this.iIdNuevoReciboPuntoVenta=0L;
				this.recibopuntoventaLogic.getReciboPuntoVentas().removeAll(recibopuntoventasAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ReciboPuntoVenta recibopuntoventaAux:this.recibopuntoventas) {
					if(recibopuntoventaAux.getId()<0) {
						recibopuntoventasAux.add(recibopuntoventaAux);
					}		
				}
				this.iIdNuevoReciboPuntoVenta=0L;
				this.recibopuntoventas.removeAll(recibopuntoventasAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoReciboPuntoVenta 
					&& this.recibopuntoventaLogic.getReciboPuntoVentas().size()>0
					) {
					recibopuntoventaAux=this.recibopuntoventaLogic.getReciboPuntoVentas().get(this.recibopuntoventaLogic.getReciboPuntoVentas().size() - 1);
				
					if(recibopuntoventaAux.getId()<0) {
						this.recibopuntoventaLogic.getReciboPuntoVentas().remove(recibopuntoventaAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoReciboPuntoVenta && this.recibopuntoventas.size()>0) {
					recibopuntoventaAux=this.recibopuntoventas.get(this.recibopuntoventas.size() - 1);
				
					if(recibopuntoventaAux.getId()<0) {
						this.recibopuntoventas.remove(recibopuntoventaAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoReciboPuntoVenta(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(recibopuntoventa.getId()<0) {
				this.recibopuntoventaLogic.getReciboPuntoVentas().remove(this.recibopuntoventa);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(recibopuntoventa.getId()<0) {
				this.recibopuntoventas.remove(this.recibopuntoventa);
			}
		}			
	}
	
	public void setEstadosInicialesReciboPuntoVenta(List<ReciboPuntoVenta> recibopuntoventasAux) throws Exception {
		ReciboPuntoVentaConstantesFunciones.setEstadosInicialesReciboPuntoVenta(recibopuntoventasAux);
	}
	
	public void setEstadosInicialesReciboPuntoVenta(ReciboPuntoVenta recibopuntoventaAux) throws Exception {
		ReciboPuntoVentaConstantesFunciones.setEstadosInicialesReciboPuntoVenta(recibopuntoventaAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarReciboPuntoVentaActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesReciboPuntoVenta("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ReciboPuntoVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarReciboPuntoVentaActual()) {
				if(!this.isEsNuevoReciboPuntoVenta) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesReciboPuntoVenta("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoReciboPuntoVenta=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ReciboPuntoVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarReciboPuntoVentaActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Recibo Punto Venta ?", "MANTENIMIENTO DE Recibo Punto Venta", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesReciboPuntoVenta("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ReciboPuntoVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ReciboPuntoVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(ReciboPuntoVenta recibopuntoventa) throws Exception {
		ReciboPuntoVentaConstantesFunciones.seleccionarAsignar(this.recibopuntoventa,recibopuntoventa);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarReciboPuntoVenta=this.isPermisoActualizarOriginalReciboPuntoVenta;
			
			
			this.seleccionarAsignar(recibopuntoventa);
			
			

			idClienteActual=recibopuntoventa.getid_cliente();
			this.seleccionarClienteActual();
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			ReciboPuntoVentaConstantesFunciones.quitarEspaciosReciboPuntoVenta(this.recibopuntoventa,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesReciboPuntoVenta("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ReciboPuntoVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.recibopuntoventaSessionBean.setsFuncionBusquedaRapida(this.recibopuntoventaSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ReciboPuntoVentaConstantesFunciones.CLASSNAME);
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
			if(this.isEsNuevoReciboPuntoVenta) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosReciboPuntoVenta(esParaCancelar);				
				this.cancelarNuevoReciboPuntoVenta(esParaCancelar);								
			}
			
			this.recibopuntoventa=new ReciboPuntoVenta();
			
			this.inicializarReciboPuntoVenta();
			
			this.actualizarEstadoCeldasBotonesReciboPuntoVenta("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ReciboPuntoVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarReciboPuntoVenta() throws Exception {
		try {
			ReciboPuntoVentaConstantesFunciones.inicializarReciboPuntoVenta(this.recibopuntoventa);
			
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
			FuncionesSwing.manageException(this, e,logger,ReciboPuntoVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.recibopuntoventaLogic.getReciboPuntoVentas().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ReciboPuntoVentaConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteReciboPuntoVentas(String sAccionBusqueda,List<ReciboPuntoVenta> recibopuntoventasParaReportes) throws Exception {
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
					sPathReporteFinal="ReciboPuntoVenta"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="ReciboPuntoVentaMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("ReciboPuntoVentaMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="ReciboPuntoVenta"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Recibo Punto Ventas");		
		parameters.put("busquedapor", ReciboPuntoVentaConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceReciboPuntoVenta=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			ReciboPuntoVentaConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			ReciboPuntoVentaConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceReciboPuntoVenta=new JRBeanArrayDataSource(ReciboPuntoVentaJInternalFrame.TraerReciboPuntoVentaBeans(recibopuntoventasParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceReciboPuntoVenta);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+ReciboPuntoVentaConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+ReciboPuntoVentaConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(ReciboPuntoVentaBean.TraerReciboPuntoVentaBeans(recibopuntoventasParaReportes).toArray()));
							
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
				this.generarExcelReporteReciboPuntoVentas(sAccionBusqueda,sTipoArchivoReporte,recibopuntoventasParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalReciboPuntoVentas(sAccionBusqueda,sTipoArchivoReporte,recibopuntoventasParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoReciboPuntoVentaActionPerformed(null);
					//this.generarExcelReporteReciboPuntoVentas(sAccionBusqueda,sTipoArchivoReporte,recibopuntoventasParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalReciboPuntoVentas(sAccionBusqueda,sTipoArchivoReporte,recibopuntoventasParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesReciboPuntoVentas(sAccionBusqueda,sTipoArchivoReporte,recibopuntoventasParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesReciboPuntoVentas(sAccionBusqueda,sTipoArchivoReporte,recibopuntoventasParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteReciboPuntoVentas(String sAccionBusqueda,String sTipoArchivoReporte,List<ReciboPuntoVenta> recibopuntoventasParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"recibopuntoventa";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ReciboPuntoVentas");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderReciboPuntoVenta("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(ReciboPuntoVenta recibopuntoventa : recibopuntoventasParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			ReciboPuntoVentaConstantesFunciones.generarExcelReporteDataReciboPuntoVenta("NORMAL",row,workbook,recibopuntoventa,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.recibopuntoventaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Recibo Punto Venta",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderReciboPuntoVenta(String sTipo,Row row,Workbook workbook) {
		
		ReciboPuntoVentaConstantesFunciones.generarExcelReporteHeaderReciboPuntoVenta(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalReciboPuntoVentas(String sAccionBusqueda,String sTipoArchivoReporte,List<ReciboPuntoVenta> recibopuntoventasParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"recibopuntoventa_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ReciboPuntoVentas");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(ReciboPuntoVenta recibopuntoventa : recibopuntoventasParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(ReciboPuntoVentaConstantesFunciones.getReciboPuntoVentaDescripcion(recibopuntoventa));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ReciboPuntoVentaConstantesFunciones.LABEL_IDCLIENTE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ReciboPuntoVentaConstantesFunciones.LABEL_IDCLIENTE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(recibopuntoventa.getcliente_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ReciboPuntoVentaConstantesFunciones.LABEL_IDBANCO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ReciboPuntoVentaConstantesFunciones.LABEL_IDBANCO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(recibopuntoventa.getbanco_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ReciboPuntoVentaConstantesFunciones.LABEL_VALOREFECTIVO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ReciboPuntoVentaConstantesFunciones.LABEL_VALOREFECTIVO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(recibopuntoventa.getvalor_efectivo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ReciboPuntoVentaConstantesFunciones.LABEL_VALORCHEQUE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ReciboPuntoVentaConstantesFunciones.LABEL_VALORCHEQUE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(recibopuntoventa.getvalor_cheque());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ReciboPuntoVentaConstantesFunciones.LABEL_NUMEROCHEQUE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ReciboPuntoVentaConstantesFunciones.LABEL_NUMEROCHEQUE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(recibopuntoventa.getnumero_cheque());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ReciboPuntoVentaConstantesFunciones.LABEL_FECHA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ReciboPuntoVentaConstantesFunciones.LABEL_FECHA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(recibopuntoventa.getfecha());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.recibopuntoventaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Recibo Punto Venta",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesReciboPuntoVentas(String sAccionBusqueda,String sTipoArchivoReporte,List<ReciboPuntoVenta> recibopuntoventasParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<ReciboPuntoVenta> recibopuntoventasRespaldo=null;
		
		classes=ReciboPuntoVentaConstantesFunciones.getClassesRelationshipsOfReciboPuntoVenta(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.recibopuntoventaLogic.setDatosCliente(this.datosCliente);
		this.recibopuntoventaLogic.setDatosDeep(this.datosDeep);
		this.recibopuntoventaLogic.setIsConDeep(true);
		
		recibopuntoventasRespaldo=this.recibopuntoventaLogic.getReciboPuntoVentas();
		
		this.recibopuntoventaLogic.setReciboPuntoVentas(recibopuntoventasParaReportes);	
		this.recibopuntoventaLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		recibopuntoventasParaReportes=this.recibopuntoventaLogic.getReciboPuntoVentas();
		this.recibopuntoventaLogic.setReciboPuntoVentas(recibopuntoventasRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"recibopuntoventa_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ReciboPuntoVentas");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderReciboPuntoVenta("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(ReciboPuntoVenta recibopuntoventa : recibopuntoventasParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderReciboPuntoVenta("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			ReciboPuntoVentaConstantesFunciones.generarExcelReporteDataReciboPuntoVenta("NORMAL",row,workbook,recibopuntoventa,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(ReciboPuntoVentaConstantesFunciones.getReciboPuntoVentaDescripcion(recibopuntoventa));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.recibopuntoventaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Recibo Punto Venta",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoReciboPuntoVenta.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoReciboPuntoVenta.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoReciboPuntoVenta.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoReciboPuntoVenta.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessReciboPuntoVenta() throws Exception {		
		this.startProcessReciboPuntoVenta(true);
	}
	
	public void startProcessReciboPuntoVenta(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasReciboPuntoVenta ,this.jPanelParametrosReportesReciboPuntoVenta, this.jScrollPanelDatosReciboPuntoVenta,this.jPanelPaginacionReciboPuntoVenta, this.jScrollPanelDatosEdicionReciboPuntoVenta, this.jPanelAccionesReciboPuntoVenta,this.jPanelAccionesFormularioReciboPuntoVenta,this.jmenuBarReciboPuntoVenta,this.jmenuBarDetalleReciboPuntoVenta,this.jTtoolBarReciboPuntoVenta,this.jTtoolBarDetalleReciboPuntoVenta);		
		
		final JTabbedPane jTabbedPaneBusquedasReciboPuntoVenta=this.jTabbedPaneBusquedasReciboPuntoVenta; 
		
		final JPanel jPanelParametrosReportesReciboPuntoVenta=this.jPanelParametrosReportesReciboPuntoVenta;
		//final JScrollPane jScrollPanelDatosReciboPuntoVenta=this.jScrollPanelDatosReciboPuntoVenta;
		final JTable jTableDatosReciboPuntoVenta=this.jTableDatosReciboPuntoVenta;		
		final JPanel jPanelPaginacionReciboPuntoVenta=this.jPanelPaginacionReciboPuntoVenta;
		//final JScrollPane jScrollPanelDatosEdicionReciboPuntoVenta=this.jScrollPanelDatosEdicionReciboPuntoVenta;
		final JPanel jPanelAccionesReciboPuntoVenta=this.jPanelAccionesReciboPuntoVenta;
		
		JPanel jPanelCamposAuxiliarReciboPuntoVenta=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarReciboPuntoVenta=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormReciboPuntoVenta!=null) {
			jPanelCamposAuxiliarReciboPuntoVenta=this.jInternalFrameDetalleFormReciboPuntoVenta.jPanelCamposReciboPuntoVenta;
			jPanelAccionesFormularioAuxiliarReciboPuntoVenta=this.jInternalFrameDetalleFormReciboPuntoVenta.jPanelAccionesFormularioReciboPuntoVenta;
		}
		
		final JPanel jPanelCamposReciboPuntoVenta=jPanelCamposAuxiliarReciboPuntoVenta;
		final JPanel jPanelAccionesFormularioReciboPuntoVenta=jPanelAccionesFormularioAuxiliarReciboPuntoVenta;
		
		
		final JMenuBar jmenuBarReciboPuntoVenta=this.jmenuBarReciboPuntoVenta;
		final JToolBar jTtoolBarReciboPuntoVenta=this.jTtoolBarReciboPuntoVenta;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarReciboPuntoVenta=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarReciboPuntoVenta=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormReciboPuntoVenta!=null) {
			jmenuBarDetalleAuxiliarReciboPuntoVenta=this.jInternalFrameDetalleFormReciboPuntoVenta.jmenuBarDetalleReciboPuntoVenta;
			jTtoolBarDetalleAuxiliarReciboPuntoVenta=this.jInternalFrameDetalleFormReciboPuntoVenta.jTtoolBarDetalleReciboPuntoVenta;
		}
		
		final JMenuBar jmenuBarDetalleReciboPuntoVenta=jmenuBarDetalleAuxiliarReciboPuntoVenta;
		final JToolBar jTtoolBarDetalleReciboPuntoVenta=jTtoolBarDetalleAuxiliarReciboPuntoVenta;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasReciboPuntoVenta;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesReciboPuntoVenta;
			processRunnable.jTableDatos=jTableDatosReciboPuntoVenta;
			processRunnable.jPanelCampos=jPanelCamposReciboPuntoVenta;
			processRunnable.jPanelPaginacion=jPanelPaginacionReciboPuntoVenta;
			processRunnable.jPanelAcciones=jPanelAccionesReciboPuntoVenta;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioReciboPuntoVenta;
			
			
			processRunnable.jmenuBar=jmenuBarReciboPuntoVenta;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleReciboPuntoVenta;
			processRunnable.jTtoolBar=jTtoolBarReciboPuntoVenta;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleReciboPuntoVenta;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasReciboPuntoVenta ,jPanelParametrosReportesReciboPuntoVenta,jTableDatosReciboPuntoVenta, /*jScrollPanelDatosReciboPuntoVenta,*/jPanelCamposReciboPuntoVenta,jPanelPaginacionReciboPuntoVenta, /*jScrollPanelDatosEdicionReciboPuntoVenta,*/ jPanelAccionesReciboPuntoVenta,jPanelAccionesFormularioReciboPuntoVenta,jmenuBarReciboPuntoVenta,jmenuBarDetalleReciboPuntoVenta,jTtoolBarReciboPuntoVenta,jTtoolBarDetalleReciboPuntoVenta);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasReciboPuntoVenta ,jPanelParametrosReportesReciboPuntoVenta, jScrollPanelDatosReciboPuntoVenta,jPanelPaginacionReciboPuntoVenta, jScrollPanelDatosEdicionReciboPuntoVenta, jPanelAccionesReciboPuntoVenta,jPanelAccionesFormularioReciboPuntoVenta,jmenuBarReciboPuntoVenta,jmenuBarDetalleReciboPuntoVenta,jTtoolBarReciboPuntoVenta,jTtoolBarDetalleReciboPuntoVenta);
						
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
	
	public void finishProcessReciboPuntoVenta() {// throws Exception 
		this.finishProcessReciboPuntoVenta(true);
	}
	
	public void finishProcessReciboPuntoVenta(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasReciboPuntoVenta ,this.jPanelParametrosReportesReciboPuntoVenta, this.jScrollPanelDatosReciboPuntoVenta,this.jPanelPaginacionReciboPuntoVenta, this.jScrollPanelDatosEdicionReciboPuntoVenta, this.jPanelAccionesReciboPuntoVenta,this.jPanelAccionesFormularioReciboPuntoVenta,this.jmenuBarReciboPuntoVenta,this.jmenuBarDetalleReciboPuntoVenta,this.jTtoolBarReciboPuntoVenta,this.jTtoolBarDetalleReciboPuntoVenta);		
		
		final JTabbedPane jTabbedPaneBusquedasReciboPuntoVenta=this.jTabbedPaneBusquedasReciboPuntoVenta; 
		
		final JPanel jPanelParametrosReportesReciboPuntoVenta=this.jPanelParametrosReportesReciboPuntoVenta;
		//final JScrollPane jScrollPanelDatosReciboPuntoVenta=this.jScrollPanelDatosReciboPuntoVenta;
		final JTable jTableDatosReciboPuntoVenta=this.jTableDatosReciboPuntoVenta;		
		final JPanel jPanelPaginacionReciboPuntoVenta=this.jPanelPaginacionReciboPuntoVenta;
		//final JScrollPane jScrollPanelDatosEdicionReciboPuntoVenta=this.jScrollPanelDatosEdicionReciboPuntoVenta;
		final JPanel jPanelAccionesReciboPuntoVenta=this.jPanelAccionesReciboPuntoVenta;
		
		JPanel jPanelCamposAuxiliarReciboPuntoVenta=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarReciboPuntoVenta=new JPanel();
		
		if(this.jInternalFrameDetalleFormReciboPuntoVenta!=null) {
			jPanelCamposAuxiliarReciboPuntoVenta=this.jInternalFrameDetalleFormReciboPuntoVenta.jPanelCamposReciboPuntoVenta;
			jPanelAccionesFormularioAuxiliarReciboPuntoVenta=this.jInternalFrameDetalleFormReciboPuntoVenta.jPanelAccionesFormularioReciboPuntoVenta;
		}
		
		final JPanel jPanelCamposReciboPuntoVenta=jPanelCamposAuxiliarReciboPuntoVenta;
		final JPanel jPanelAccionesFormularioReciboPuntoVenta=jPanelAccionesFormularioAuxiliarReciboPuntoVenta;
		
		
		final JMenuBar jmenuBarReciboPuntoVenta=this.jmenuBarReciboPuntoVenta;		
		final JToolBar jTtoolBarReciboPuntoVenta=this.jTtoolBarReciboPuntoVenta;
				
		JMenuBar jmenuBarDetalleAuxiliarReciboPuntoVenta=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarReciboPuntoVenta=new JToolBar();
		
		if(this.jInternalFrameDetalleFormReciboPuntoVenta!=null) {
			jmenuBarDetalleAuxiliarReciboPuntoVenta=this.jInternalFrameDetalleFormReciboPuntoVenta.jmenuBarDetalleReciboPuntoVenta;
			jTtoolBarDetalleAuxiliarReciboPuntoVenta=this.jInternalFrameDetalleFormReciboPuntoVenta.jTtoolBarDetalleReciboPuntoVenta;		
		}
		
		final JMenuBar jmenuBarDetalleReciboPuntoVenta=jmenuBarDetalleAuxiliarReciboPuntoVenta;
		final JToolBar jTtoolBarDetalleReciboPuntoVenta=jTtoolBarDetalleAuxiliarReciboPuntoVenta;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasReciboPuntoVenta;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesReciboPuntoVenta;
			processRunnable.jTableDatos=jTableDatosReciboPuntoVenta;
			processRunnable.jPanelCampos=jPanelCamposReciboPuntoVenta;
			processRunnable.jPanelPaginacion=jPanelPaginacionReciboPuntoVenta;
			processRunnable.jPanelAcciones=jPanelAccionesReciboPuntoVenta;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioReciboPuntoVenta;
			
			
			processRunnable.jmenuBar=jmenuBarReciboPuntoVenta;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleReciboPuntoVenta;
			processRunnable.jTtoolBar=jTtoolBarReciboPuntoVenta;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleReciboPuntoVenta;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasReciboPuntoVenta ,jPanelParametrosReportesReciboPuntoVenta, jTableDatosReciboPuntoVenta,/*jScrollPanelDatosReciboPuntoVenta,*/jPanelCamposReciboPuntoVenta,jPanelPaginacionReciboPuntoVenta, /*jScrollPanelDatosEdicionReciboPuntoVenta,*/ jPanelAccionesReciboPuntoVenta,jPanelAccionesFormularioReciboPuntoVenta,jmenuBarReciboPuntoVenta,jmenuBarDetalleReciboPuntoVenta,jTtoolBarReciboPuntoVenta,jTtoolBarDetalleReciboPuntoVenta));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesReciboPuntoVenta(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarReciboPuntoVenta(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuReciboPuntoVenta(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarReciboPuntoVenta(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarReciboPuntoVenta,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleReciboPuntoVenta,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuReciboPuntoVenta(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarReciboPuntoVenta,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleReciboPuntoVenta,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.recibopuntoventaConstantesFunciones.getsFinalQueryReciboPuntoVenta();
		String  finalQueryPaginacionTodos=this.recibopuntoventaConstantesFunciones.getsFinalQueryReciboPuntoVenta();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=ReciboPuntoVentaConstantesFunciones.getArrayColumnasGlobalesNoReciboPuntoVenta(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=ReciboPuntoVentaConstantesFunciones.getArrayColumnasGlobalesReciboPuntoVenta(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,ReciboPuntoVentaConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.recibopuntoventasEliminados= new ArrayList<ReciboPuntoVenta>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessReciboPuntoVenta();
		
				///*ReciboPuntoVentaSessionBean*/this.recibopuntoventaSessionBean=new ReciboPuntoVentaSessionBean();
			
			if(this.recibopuntoventaSessionBean==null) {
				this.recibopuntoventaSessionBean=new ReciboPuntoVentaSessionBean();
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
					this.iNumeroPaginacion=ReciboPuntoVentaConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=ReciboPuntoVentaConstantesFunciones.getClassesForeignKeysOfReciboPuntoVenta(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/recibopuntoventa."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			recibopuntoventasAux= new ArrayList<ReciboPuntoVenta>();
			
				
			recibopuntoventaLogic.setDatosCliente(this.datosCliente);
			recibopuntoventaLogic.setDatosDeep(this.datosDeep);
			recibopuntoventaLogic.setIsConDeep(true);
			
			
			recibopuntoventaLogic.getReciboPuntoVentaDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					recibopuntoventaLogic.getTodosReciboPuntoVentas(finalQueryGlobal,pagination);
					
					//recibopuntoventaLogic.getTodosReciboPuntoVentasWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(recibopuntoventaLogic.getReciboPuntoVentas()==null|| recibopuntoventaLogic.getReciboPuntoVentas().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							recibopuntoventasAux= new ArrayList<ReciboPuntoVenta>();
							recibopuntoventasAux.addAll(recibopuntoventaLogic.getReciboPuntoVentas());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							recibopuntoventasAux= new ArrayList<ReciboPuntoVenta>();
							recibopuntoventasAux.addAll(recibopuntoventas);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							recibopuntoventaLogic.getTodosReciboPuntoVentas(finalQueryGlobal+"",this.pagination);												
							
							//recibopuntoventaLogic.getTodosReciboPuntoVentasWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteReciboPuntoVentas("Todos",recibopuntoventaLogic.getReciboPuntoVentas() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							recibopuntoventaLogic.setReciboPuntoVentas(new ArrayList<ReciboPuntoVenta>());					
							recibopuntoventaLogic.getReciboPuntoVentas().addAll(recibopuntoventasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							recibopuntoventas=new ArrayList<ReciboPuntoVenta>();
							recibopuntoventas.addAll(recibopuntoventasAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idReciboPuntoVenta=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idReciboPuntoVenta=this.idActual;
				
				} else if(this.idReciboPuntoVentaActual!=null && this.idReciboPuntoVentaActual!=0L) {
					idReciboPuntoVenta=idReciboPuntoVentaActual;
				}
				
					
				this.sDetalleReporte=ReciboPuntoVentaConstantesFunciones.getDetalleIndicePorId(idReciboPuntoVenta);
				
				this.recibopuntoventas=new ArrayList<ReciboPuntoVenta>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					recibopuntoventaLogic.getEntity(idReciboPuntoVenta);
					
					//recibopuntoventaLogic.getEntityWithConnection(idReciboPuntoVenta);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					recibopuntoventaLogic.setReciboPuntoVentas(new ArrayList<ReciboPuntoVenta>());
					recibopuntoventaLogic.getReciboPuntoVentas().add(recibopuntoventaLogic.getReciboPuntoVenta());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.recibopuntoventas=new ArrayList<ReciboPuntoVenta>();
					this.recibopuntoventas.add(recibopuntoventa);
				}
				
				if(recibopuntoventaLogic.getReciboPuntoVenta()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdBanco")) {
				this.sDetalleReporte=ReciboPuntoVentaConstantesFunciones.getDetalleIndiceFK_IdBanco(id_bancoFK_IdBanco);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					recibopuntoventaLogic.getReciboPuntoVentasFK_IdBanco(finalQueryGlobal,pagination,id_bancoFK_IdBanco);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ReciboPuntoVentaConstantesFunciones.getDetalleIndiceFK_IdBanco(id_bancoFK_IdBanco);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ReciboPuntoVentaConstantesFunciones.getDetalleIndiceFK_IdBanco(id_bancoFK_IdBanco);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=recibopuntoventaLogic.getReciboPuntoVentas()==null||recibopuntoventaLogic.getReciboPuntoVentas().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=recibopuntoventas==null|| recibopuntoventas.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						recibopuntoventasAux=new ArrayList<ReciboPuntoVenta>();
						recibopuntoventasAux.addAll(recibopuntoventaLogic.getReciboPuntoVentas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							recibopuntoventasAux=new ArrayList<ReciboPuntoVenta>();
							recibopuntoventasAux.addAll(recibopuntoventas);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							recibopuntoventaLogic.getReciboPuntoVentasFK_IdBanco(finalQueryGlobal,pagination,id_bancoFK_IdBanco);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ReciboPuntoVentaConstantesFunciones.getDetalleIndiceFK_IdBanco(id_bancoFK_IdBanco);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ReciboPuntoVentaConstantesFunciones.getDetalleIndiceFK_IdBanco(id_bancoFK_IdBanco);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteReciboPuntoVentas("FK_IdBanco",recibopuntoventaLogic.getReciboPuntoVentas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteReciboPuntoVentas("FK_IdBanco",recibopuntoventas);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						recibopuntoventaLogic.setReciboPuntoVentas(new ArrayList<ReciboPuntoVenta>());
						recibopuntoventaLogic.getReciboPuntoVentas().addAll(recibopuntoventasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							recibopuntoventas=new ArrayList<ReciboPuntoVenta>();
							recibopuntoventas.addAll(recibopuntoventasAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdCliente")) {
				this.sDetalleReporte=ReciboPuntoVentaConstantesFunciones.getDetalleIndiceFK_IdCliente(id_clienteFK_IdCliente);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					recibopuntoventaLogic.getReciboPuntoVentasFK_IdCliente(finalQueryGlobal,pagination,id_clienteFK_IdCliente);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ReciboPuntoVentaConstantesFunciones.getDetalleIndiceFK_IdCliente(id_clienteFK_IdCliente);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ReciboPuntoVentaConstantesFunciones.getDetalleIndiceFK_IdCliente(id_clienteFK_IdCliente);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=recibopuntoventaLogic.getReciboPuntoVentas()==null||recibopuntoventaLogic.getReciboPuntoVentas().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=recibopuntoventas==null|| recibopuntoventas.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						recibopuntoventasAux=new ArrayList<ReciboPuntoVenta>();
						recibopuntoventasAux.addAll(recibopuntoventaLogic.getReciboPuntoVentas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							recibopuntoventasAux=new ArrayList<ReciboPuntoVenta>();
							recibopuntoventasAux.addAll(recibopuntoventas);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							recibopuntoventaLogic.getReciboPuntoVentasFK_IdCliente(finalQueryGlobal,pagination,id_clienteFK_IdCliente);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ReciboPuntoVentaConstantesFunciones.getDetalleIndiceFK_IdCliente(id_clienteFK_IdCliente);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ReciboPuntoVentaConstantesFunciones.getDetalleIndiceFK_IdCliente(id_clienteFK_IdCliente);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteReciboPuntoVentas("FK_IdCliente",recibopuntoventaLogic.getReciboPuntoVentas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteReciboPuntoVentas("FK_IdCliente",recibopuntoventas);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						recibopuntoventaLogic.setReciboPuntoVentas(new ArrayList<ReciboPuntoVenta>());
						recibopuntoventaLogic.getReciboPuntoVentas().addAll(recibopuntoventasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							recibopuntoventas=new ArrayList<ReciboPuntoVenta>();
							recibopuntoventas.addAll(recibopuntoventasAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesReciboPuntoVenta();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessReciboPuntoVenta();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=recibopuntoventaLogic.getReciboPuntoVentas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=recibopuntoventas.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=recibopuntoventaLogic.getReciboPuntoVentas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=recibopuntoventas.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(ReciboPuntoVenta recibopuntoventa) {
		Boolean permite=true;
		
		if(this.recibopuntoventa.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=ReciboPuntoVentaConstantesFunciones.getOrderByListaReciboPuntoVenta();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=ReciboPuntoVentaConstantesFunciones.getOrderByListaReciboPuntoVenta();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ReciboPuntoVenta recibopuntoventa:recibopuntoventaLogic.getReciboPuntoVentas()) {
				if(recibopuntoventa.getsType().equals(Constantes2.S_TOTALES)) {
					recibopuntoventaTotales=recibopuntoventa;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ReciboPuntoVenta recibopuntoventa:this.recibopuntoventas) {
				if(recibopuntoventa.getsType().equals(Constantes2.S_TOTALES)) {
					recibopuntoventaTotales=recibopuntoventa;
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
			this.recibopuntoventaAux=new ReciboPuntoVenta();
			this.recibopuntoventaAux.setsType(Constantes2.S_TOTALES);
			this.recibopuntoventaAux.setIsNew(false);
			this.recibopuntoventaAux.setIsChanged(false);
			this.recibopuntoventaAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				ReciboPuntoVentaConstantesFunciones.TotalizarValoresFilaReciboPuntoVenta(this.recibopuntoventaLogic.getReciboPuntoVentas(),this.recibopuntoventaAux);
				
				this.recibopuntoventaLogic.getReciboPuntoVentas().add(this.recibopuntoventaAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				ReciboPuntoVentaConstantesFunciones.TotalizarValoresFilaReciboPuntoVenta(this.recibopuntoventas,this.recibopuntoventaAux);
				
				this.recibopuntoventas.add(this.recibopuntoventaAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		recibopuntoventaTotales=new ReciboPuntoVenta();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.recibopuntoventaLogic.getReciboPuntoVentas().remove(recibopuntoventaTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.recibopuntoventas.remove(recibopuntoventaTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		recibopuntoventaTotales=new ReciboPuntoVenta();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ReciboPuntoVenta recibopuntoventa:recibopuntoventaLogic.getReciboPuntoVentas()) {
				if(recibopuntoventa.getsType().equals(Constantes2.S_TOTALES)) {
					recibopuntoventaTotales=recibopuntoventa;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				ReciboPuntoVentaConstantesFunciones.TotalizarValoresFilaReciboPuntoVenta(this.recibopuntoventaLogic.getReciboPuntoVentas(),recibopuntoventaTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ReciboPuntoVenta recibopuntoventa:this.recibopuntoventas) {
				if(recibopuntoventa.getsType().equals(Constantes2.S_TOTALES)) {
					recibopuntoventaTotales=recibopuntoventa;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				ReciboPuntoVentaConstantesFunciones.TotalizarValoresFilaReciboPuntoVenta(this.recibopuntoventas,recibopuntoventaTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ReciboPuntoVentaConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getReciboPuntoVentasFK_IdBanco()throws Exception {
		try {
			sAccionBusqueda="FK_IdBanco";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getReciboPuntoVentasFK_IdCliente()throws Exception {
		try {
			sAccionBusqueda="FK_IdCliente";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getReciboPuntoVentasFK_IdBanco(String sFinalQuery,Long id_banco)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					recibopuntoventaLogic.getReciboPuntoVentasFK_IdBanco(sFinalQuery,this.pagination,id_banco);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getReciboPuntoVentasFK_IdCliente(String sFinalQuery,Long id_cliente)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					recibopuntoventaLogic.getReciboPuntoVentasFK_IdCliente(sFinalQuery,this.pagination,id_cliente);
				
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
	
	public void inicializarPermisosReciboPuntoVenta() {
		this.isPermisoTodoReciboPuntoVenta=false;
		this.isPermisoNuevoReciboPuntoVenta=false;
		this.isPermisoActualizarReciboPuntoVenta=false;
		this.isPermisoActualizarOriginalReciboPuntoVenta=false;
		this.isPermisoEliminarReciboPuntoVenta=false;
		this.isPermisoGuardarCambiosReciboPuntoVenta=false;
		this.isPermisoConsultaReciboPuntoVenta=false;
		this.isPermisoBusquedaReciboPuntoVenta=false;
		this.isPermisoReporteReciboPuntoVenta=false;		
		this.isPermisoOrdenReciboPuntoVenta=false;		
		this.isPermisoPaginacionMedioReciboPuntoVenta=false;		
		this.isPermisoPaginacionAltoReciboPuntoVenta=false;
		this.isPermisoPaginacionTodoReciboPuntoVenta=false;
		this.isPermisoCopiarReciboPuntoVenta=false;		
		this.isPermisoVerFormReciboPuntoVenta=false;		
		this.isPermisoDuplicarReciboPuntoVenta=false;		
		this.isPermisoOrdenReciboPuntoVenta=false;		
	}
	
	public void setPermisosUsuarioReciboPuntoVenta(Boolean isPermiso) {
		this.isPermisoTodoReciboPuntoVenta=isPermiso;
		this.isPermisoNuevoReciboPuntoVenta=isPermiso;
		this.isPermisoActualizarReciboPuntoVenta=isPermiso;
		this.isPermisoActualizarOriginalReciboPuntoVenta=isPermiso;
		this.isPermisoEliminarReciboPuntoVenta=isPermiso;
		this.isPermisoGuardarCambiosReciboPuntoVenta=isPermiso;
		this.isPermisoConsultaReciboPuntoVenta=isPermiso;
		this.isPermisoBusquedaReciboPuntoVenta=isPermiso;
		this.isPermisoReporteReciboPuntoVenta=isPermiso;
		this.isPermisoOrdenReciboPuntoVenta=isPermiso;		
		this.isPermisoPaginacionMedioReciboPuntoVenta=isPermiso;		
		this.isPermisoPaginacionAltoReciboPuntoVenta=isPermiso;		
		this.isPermisoPaginacionTodoReciboPuntoVenta=isPermiso;		
		this.isPermisoCopiarReciboPuntoVenta=isPermiso;		
		this.isPermisoVerFormReciboPuntoVenta=isPermiso;		
		this.isPermisoDuplicarReciboPuntoVenta=isPermiso;
		this.isPermisoOrdenReciboPuntoVenta=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioReciboPuntoVenta(Boolean isPermiso) {
		//this.isPermisoTodoReciboPuntoVenta=isPermiso;
		this.isPermisoNuevoReciboPuntoVenta=isPermiso;
		this.isPermisoActualizarReciboPuntoVenta=isPermiso;
		this.isPermisoActualizarOriginalReciboPuntoVenta=isPermiso;
		this.isPermisoEliminarReciboPuntoVenta=isPermiso;
		this.isPermisoGuardarCambiosReciboPuntoVenta=isPermiso;
		//this.isPermisoConsultaReciboPuntoVenta=isPermiso;
		//this.isPermisoBusquedaReciboPuntoVenta=isPermiso;
		//this.isPermisoReporteReciboPuntoVenta=isPermiso;
		//this.isPermisoOrdenReciboPuntoVenta=isPermiso;		
		//this.isPermisoPaginacionMedioReciboPuntoVenta=isPermiso;		
		//this.isPermisoPaginacionAltoReciboPuntoVenta=isPermiso;		
		//this.isPermisoPaginacionTodoReciboPuntoVenta=isPermiso;		
		//this.isPermisoCopiarReciboPuntoVenta=isPermiso;		
		//this.isPermisoDuplicarReciboPuntoVenta=isPermiso;
		//this.isPermisoOrdenReciboPuntoVenta=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioReciboPuntoVentaClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(ReciboPuntoVentaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebReciboPuntoVenta(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioReciboPuntoVentaClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioReciboPuntoVentaClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionReciboPuntoVentaClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioReciboPuntoVentaClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioReciboPuntoVenta() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(ReciboPuntoVentaJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.recibopuntoventaSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, ReciboPuntoVentaConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoReciboPuntoVenta=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarReciboPuntoVenta=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalReciboPuntoVenta=this.isPermisoActualizarReciboPuntoVenta;
			this.isPermisoEliminarReciboPuntoVenta=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosReciboPuntoVenta=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaReciboPuntoVenta=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaReciboPuntoVenta=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoReciboPuntoVenta=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteReciboPuntoVenta=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenReciboPuntoVenta=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioReciboPuntoVenta=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoReciboPuntoVenta=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoReciboPuntoVenta=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarReciboPuntoVenta=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormReciboPuntoVenta=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarReciboPuntoVenta=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenReciboPuntoVenta=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.recibopuntoventaSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosReciboPuntoVenta.setToolTipText(this.jTableDatosReciboPuntoVenta.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioReciboPuntoVenta(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioReciboPuntoVenta(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(ReciboPuntoVentaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(ReciboPuntoVentaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioReciboPuntoVenta() throws Exception {
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
	public void inicializarCombosForeignKeyReciboPuntoVentaListas()throws Exception {
		try	{						
			
				this.clientesForeignKey=new ArrayList();
				this.bancosForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyReciboPuntoVentaListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(ReciboPuntoVentaJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyReciboPuntoVentaListas(false);
			} else {
			
				this.cargarCombosForeignKeyClienteListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyBancoListas(cargarCombosDependencia,sFinalQueryCombo);
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
	
	public void cargarCombosLoteForeignKeyReciboPuntoVentaListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			ReciboPuntoVentaParameterReturnGeneral recibopuntoventaReturnGeneral=new ReciboPuntoVentaParameterReturnGeneral();
						
			


				String finalQueryGlobalCliente="";

				if(((this.clientesForeignKey==null||this.clientesForeignKey.size()<=0) && this.recibopuntoventaConstantesFunciones.cargarid_clienteReciboPuntoVenta)
					 || (this.esRecargarFks && this.recibopuntoventaConstantesFunciones.cargarid_clienteReciboPuntoVenta)) {

					if(!this.recibopuntoventaSessionBean.getisBusquedaDesdeForeignKeySesionCliente()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=ClienteConstantesFunciones.getArrayColumnasGlobalesCliente(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalCliente=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,ClienteConstantesFunciones.TABLENAME);

						finalQueryGlobalCliente=Funciones.GetFinalQueryAppend(finalQueryGlobalCliente, "");
						finalQueryGlobalCliente+=ClienteConstantesFunciones.SFINALQUERY;

						//this.cargarCombosClientesForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalCliente=" WHERE " + ConstantesSql.ID + "="+recibopuntoventaSessionBean.getlidClienteActual();
					}
				} else {
					finalQueryGlobalCliente="NONE";
				}


				String finalQueryGlobalBanco="";

				if(((this.bancosForeignKey==null||this.bancosForeignKey.size()<=0) && this.recibopuntoventaConstantesFunciones.cargarid_bancoReciboPuntoVenta)
					 || (this.esRecargarFks && this.recibopuntoventaConstantesFunciones.cargarid_bancoReciboPuntoVenta)) {

					if(!this.recibopuntoventaSessionBean.getisBusquedaDesdeForeignKeySesionBanco()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=BancoConstantesFunciones.getArrayColumnasGlobalesBanco(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalBanco=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,BancoConstantesFunciones.TABLENAME);

						finalQueryGlobalBanco=Funciones.GetFinalQueryAppend(finalQueryGlobalBanco, "");
						finalQueryGlobalBanco+=BancoConstantesFunciones.SFINALQUERY;

						//this.cargarCombosBancosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalBanco=" WHERE " + ConstantesSql.ID + "="+recibopuntoventaSessionBean.getlidBancoActual();
					}
				} else {
					finalQueryGlobalBanco="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				recibopuntoventaReturnGeneral=recibopuntoventaLogic.cargarCombosLoteForeignKeyReciboPuntoVenta(finalQueryGlobalCliente,finalQueryGlobalBanco);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalCliente.equals("NONE")) {
				this.clientesForeignKey=recibopuntoventaReturnGeneral.getclientesForeignKey();
			}

			if(!finalQueryGlobalBanco.equals("NONE")) {
				this.bancosForeignKey=recibopuntoventaReturnGeneral.getbancosForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyReciboPuntoVenta()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyCliente();
			this.addItemDefectoCombosForeignKeyBanco();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyCliente()throws Exception {
		try {
			if(this.recibopuntoventaSessionBean==null) {
				this.recibopuntoventaSessionBean=new ReciboPuntoVentaSessionBean();
			}

			if(!this.recibopuntoventaSessionBean.getisBusquedaDesdeForeignKeySesionCliente()) {
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

	public void addItemDefectoCombosForeignKeyBanco()throws Exception {
		try {

			if(!this.recibopuntoventaSessionBean.getisBusquedaDesdeForeignKeySesionBanco()) {
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
	
	public void initActionsCombosTodosForeignKeyReciboPuntoVenta()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyReciboPuntoVenta(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyReciboPuntoVenta()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
				this.recibopuntoventa.setfecha(this.parametroGeneralUsuario.getfecha_sistema());
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyReciboPuntoVenta();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyReciboPuntoVenta(ReciboPuntoVenta recibopuntoventa)throws Exception {	
		try {
			
			this.setActualClienteForeignKey(recibopuntoventa.getid_cliente(),false,"Formulario");
			this.setActualBancoForeignKey(recibopuntoventa.getid_banco(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyReciboPuntoVenta(ReciboPuntoVenta recibopuntoventa,String sTipoEvento)throws Exception {	
		try {
			
			

				if(recibopuntoventa.getCliente()!=null && !sTipoEvento.equals("id_clienteReciboPuntoVenta")) { //sTipoEvento Evita Bucle Infinito

					this.clientesForeignKey=new ArrayList<Cliente>();
					this.clientesForeignKey.add(recibopuntoventa.getCliente());

					this.addItemDefectoCombosForeignKeyCliente();
					this.cargarCombosFrameClientesForeignKey("Todos");
				}
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyReciboPuntoVenta()throws Exception {	
		try {
			
			this.setActualClienteForeignKey(this.recibopuntoventaConstantesFunciones.getid_cliente(),false,"Formulario");
			this.setActualBancoForeignKey(this.recibopuntoventaConstantesFunciones.getid_banco(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyReciboPuntoVenta()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyReciboPuntoVenta()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyReciboPuntoVenta()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroReciboPuntoVenta()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyReciboPuntoVenta()throws Exception {
		try {
			

			this.cargarCombosFrameClientesForeignKey("Todos");
			this.cargarCombosFrameBancosForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyReciboPuntoVenta(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameClientesForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameBancosForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyReciboPuntoVenta()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormReciboPuntoVenta.jComboBoxid_clienteReciboPuntoVenta!=null && this.jInternalFrameDetalleFormReciboPuntoVenta.jComboBoxid_clienteReciboPuntoVenta.getItemCount()>0) {
				this.jInternalFrameDetalleFormReciboPuntoVenta.jComboBoxid_clienteReciboPuntoVenta.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormReciboPuntoVenta.jComboBoxid_bancoReciboPuntoVenta!=null && this.jInternalFrameDetalleFormReciboPuntoVenta.jComboBoxid_bancoReciboPuntoVenta.getItemCount()>0) {
				this.jInternalFrameDetalleFormReciboPuntoVenta.jComboBoxid_bancoReciboPuntoVenta.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	




	
	

	public ReciboPuntoVentaBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public ReciboPuntoVentaBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public ReciboPuntoVentaBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.recibopuntoventaSessionBean=new ReciboPuntoVentaSessionBean(); 
		this.recibopuntoventaConstantesFunciones=new ReciboPuntoVentaConstantesFunciones(); 
		this.recibopuntoventaBean=new ReciboPuntoVenta();//(this.recibopuntoventaConstantesFunciones); 		
		this.recibopuntoventaReturnGeneral=new ReciboPuntoVentaParameterReturnGeneral(); 
		
		this.recibopuntoventaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.recibopuntoventaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public ReciboPuntoVentaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public ReciboPuntoVentaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public ReciboPuntoVentaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessReciboPuntoVenta(true);
			
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
			
			this.recibopuntoventaConstantesFunciones=new ReciboPuntoVentaConstantesFunciones(); 
			this.recibopuntoventaBean=new ReciboPuntoVenta();//this.recibopuntoventaConstantesFunciones); 			
			this.recibopuntoventaReturnGeneral=new ReciboPuntoVentaParameterReturnGeneral(); 
		
			ReciboPuntoVentaBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Recibo Punto Venta Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			this.conTotales=true;
			
			
			this.recibopuntoventa=new ReciboPuntoVenta();
			this.recibopuntoventas = new ArrayList<ReciboPuntoVenta>();
			this.recibopuntoventasAux = new ArrayList<ReciboPuntoVenta>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.recibopuntoventaLogic=new ReciboPuntoVentaLogic();
				this.recibopuntoventaLogic.getNewConnexionToDeep("");
			}
			
			//this.recibopuntoventaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.recibopuntoventaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormReciboPuntoVenta);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoReciboPuntoVenta!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoReciboPuntoVenta);	
					}
					
					if(this.jInternalFrameImportacionReciboPuntoVenta!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionReciboPuntoVenta);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByReciboPuntoVenta!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByReciboPuntoVenta);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormReciboPuntoVenta!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormReciboPuntoVenta);
				this.jInternalFrameDetalleFormReciboPuntoVenta.setVisible(false);
				this.jInternalFrameDetalleFormReciboPuntoVenta.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoReciboPuntoVenta!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoReciboPuntoVenta);
					this.jInternalFrameReporteDinamicoReciboPuntoVenta.setVisible(false);
					this.jInternalFrameReporteDinamicoReciboPuntoVenta.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionReciboPuntoVenta!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionReciboPuntoVenta);
					this.jInternalFrameImportacionReciboPuntoVenta.setVisible(false);
					this.jInternalFrameImportacionReciboPuntoVenta.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByReciboPuntoVenta!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByReciboPuntoVenta);
					this.jInternalFrameOrderByReciboPuntoVenta.setVisible(false);
					this.jInternalFrameOrderByReciboPuntoVenta.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idReciboPuntoVentaActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=ReciboPuntoVentaConstantesFunciones.INUMEROPAGINACION;
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
			
			this.recibopuntoventaReturnGeneral=new ReciboPuntoVentaParameterReturnGeneral();
			
			this.recibopuntoventaParameterGeneral=new ReciboPuntoVentaParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.recibopuntoventaLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.recibopuntoventaSessionBean.getEsGuardarRelacionado()) {
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
			
			if(ReciboPuntoVentaJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.recibopuntoventaSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,ReciboPuntoVentaConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.recibopuntoventaSessionBean.getEsGuardarRelacionado(),this.recibopuntoventaSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,ReciboPuntoVentaConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.recibopuntoventaSessionBean.getEsGuardarRelacionado(),this.recibopuntoventaSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoReciboPuntoVenta=false;
			this.isVisibilidadCeldaDuplicarReciboPuntoVenta=true;
			this.isVisibilidadCeldaCopiarReciboPuntoVenta=true;
			this.isVisibilidadCeldaVerFormReciboPuntoVenta=true;
			this.isVisibilidadCeldaOrdenReciboPuntoVenta=true;
			this.isVisibilidadCeldaNuevoRelacionesReciboPuntoVenta=false;
			this.isVisibilidadCeldaModificarReciboPuntoVenta=false;
			this.isVisibilidadCeldaActualizarReciboPuntoVenta=false;
			this.isVisibilidadCeldaEliminarReciboPuntoVenta=false;
			this.isVisibilidadCeldaCancelarReciboPuntoVenta=false;
			this.isVisibilidadCeldaGuardarReciboPuntoVenta=false;
			this.isVisibilidadCeldaGuardarCambiosReciboPuntoVenta=false;
			
			
			this.isVisibilidadFK_IdBanco=true;
			this.isVisibilidadFK_IdCliente=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesReciboPuntoVenta("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosReciboPuntoVenta();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioReciboPuntoVenta(false);
			
			this.setPermisosUsuarioReciboPuntoVenta();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.recibopuntoventaSessionBean.getEsGuardarRelacionado() 
				|| (this.recibopuntoventaSessionBean.getEsGuardarRelacionado() && this.recibopuntoventaSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioReciboPuntoVentaClasesRelacionadas();
			}
			
			if(this.recibopuntoventaSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioReciboPuntoVentaClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!ReciboPuntoVentaJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosReciboPuntoVenta();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualReciboPuntoVenta();
			}
			
			if(!this.isPermisoBusquedaReciboPuntoVenta) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasReciboPuntoVenta.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.recibopuntoventaSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(true);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(true);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioReciboPuntoVenta,this.isPermisoPaginacionMedioReciboPuntoVenta,this.isPermisoPaginacionTodoReciboPuntoVenta);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(ReciboPuntoVentaConstantesFunciones.getTiposSeleccionarReciboPuntoVenta());
				
				this.tiposColumnasSelect=ReciboPuntoVentaConstantesFunciones.getTiposSeleccionarReciboPuntoVenta(true);
				
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
			//if(!this.recibopuntoventaSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioReciboPuntoVenta();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(true,false,true);
				this.setAccionesUsuarioReciboPuntoVenta(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(true,false,true);							
				this.setAccionesUsuarioReciboPuntoVenta(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesReciboPuntoVenta() ;
			
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
			
			this.clienteLogic=new ClienteLogic();
			this.bancoLogic=new BancoLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				recibopuntoventaImplementable= (ReciboPuntoVentaImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+ReciboPuntoVentaConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				recibopuntoventaImplementableHome= (ReciboPuntoVentaImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+ReciboPuntoVentaConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.recibopuntoventas= new ArrayList<ReciboPuntoVenta>();
			this.recibopuntoventasEliminados= new ArrayList<ReciboPuntoVenta>();
						
			this.isEsNuevoReciboPuntoVenta=false;
			this.esParaAccionDesdeFormularioReciboPuntoVenta=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			//BUSQUEDA INTERNA FK
			this.idClienteActual=0L;
			
			//INICIALIZAR LISTAS FK
			
			this.clientesForeignKey=new ArrayList<Cliente>() ;
			this.bancosForeignKey=new ArrayList<Banco>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyReciboPuntoVenta(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroReciboPuntoVenta();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.recibopuntoventaSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			ReciboPuntoVentaBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=ReciboPuntoVentaConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesReciboPuntoVenta("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingReciboPuntoVenta(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormReciboPuntoVenta!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioReciboPuntoVenta();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioReciboPuntoVenta();
			}
			
			ReciboPuntoVentaBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasReciboPuntoVenta.getTabCount(); i++) {
					this.jTabbedPaneBusquedasReciboPuntoVenta.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasReciboPuntoVenta.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.recibopuntoventaLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessReciboPuntoVenta(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga ReciboPuntoVenta: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.recibopuntoventaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ReciboPuntoVentaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.recibopuntoventaLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectReciboPuntoVenta() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesReciboPuntoVenta")) {
				iIndex=this.jInternalFrameDetalleFormReciboPuntoVenta.jTabbedPaneRelacionesReciboPuntoVenta.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormReciboPuntoVenta.jTabbedPaneRelacionesReciboPuntoVenta.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosReciboPuntoVenta.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessReciboPuntoVenta();	
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
	
	public void cargarCombosForeignKeyReciboPuntoVenta(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyReciboPuntoVenta(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyReciboPuntoVenta(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyReciboPuntoVentaListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyReciboPuntoVenta();
		
		this.cargarCombosFrameForeignKeyReciboPuntoVenta();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyReciboPuntoVenta();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyReciboPuntoVenta();
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
	
	public void jButtonNuevoReciboPuntoVentaActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.recibopuntoventaSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormReciboPuntoVenta==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			ReciboPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.recibopuntoventa,new Object(),this.recibopuntoventaParameterGeneral,this.recibopuntoventaReturnGeneral);
			
			
			if(jTableDatosReciboPuntoVenta.getRowCount()>=1) {
				jTableDatosReciboPuntoVenta.removeRowSelectionInterval(0, jTableDatosReciboPuntoVenta.getRowCount()-1);						
			}
			
			this.isEsNuevoReciboPuntoVenta=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoReciboPuntoVenta(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesReciboPuntoVenta(true);			
			//this.recibopuntoventa=new ReciboPuntoVenta();
			//this.recibopuntoventa.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesReciboPuntoVenta(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualReciboPuntoVenta() ;
			
			if(ReciboPuntoVentaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleReciboPuntoVenta(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.recibopuntoventa);	
			this.actualizarInformacion("INFO_PADRE",false,this.recibopuntoventa);				
			
			ReciboPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.recibopuntoventa,new Object(),this.recibopuntoventaParameterGeneral,this.recibopuntoventaReturnGeneral);
			
			if(this.recibopuntoventaSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar ReciboPuntoVenta: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			ReciboPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.recibopuntoventa,new Object(),this.recibopuntoventaParameterGeneral,this.recibopuntoventaReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,ReciboPuntoVentaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarReciboPuntoVentaActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<ReciboPuntoVenta> recibopuntoventasSeleccionados=new ArrayList<ReciboPuntoVenta>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosReciboPuntoVenta.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosReciboPuntoVenta.getSelectedRows().length;			
			}
			
			recibopuntoventasSeleccionados=this.getReciboPuntoVentasSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoReciboPuntoVenta--;			
				//ReciboPuntoVenta recibopuntoventaAux= new ReciboPuntoVenta();			
				//recibopuntoventaAux.setId(this.iIdNuevoReciboPuntoVenta);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//ReciboPuntoVenta recibopuntoventaOrigen=new ReciboPuntoVenta();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(ReciboPuntoVenta recibopuntoventaOrigen : recibopuntoventasSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosReciboPuntoVenta.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							recibopuntoventaOrigen =(ReciboPuntoVenta) this.recibopuntoventaLogic.getReciboPuntoVentas().toArray()[this.jTableDatosReciboPuntoVenta.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							recibopuntoventaOrigen =(ReciboPuntoVenta) this.recibopuntoventas.toArray()[this.jTableDatosReciboPuntoVenta.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaReciboPuntoVenta();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.recibopuntoventa.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosReciboPuntoVenta(recibopuntoventaOrigen,this.recibopuntoventa,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysReciboPuntoVenta(this.recibopuntoventa);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.recibopuntoventaLogic.getReciboPuntoVentas().add(this.recibopuntoventaAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.recibopuntoventas.add(this.recibopuntoventaAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaReciboPuntoVenta(false);
				
				this.jTableDatosReciboPuntoVenta.setRowSelectionInterval(this.getIndiceNuevoReciboPuntoVenta(), this.getIndiceNuevoReciboPuntoVenta());
				
				int iLastRow =  this.jTableDatosReciboPuntoVenta.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosReciboPuntoVenta.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosReciboPuntoVenta.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaReciboPuntoVenta(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,ReciboPuntoVentaConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarReciboPuntoVentaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<ReciboPuntoVenta> recibopuntoventasSeleccionados=new ArrayList<ReciboPuntoVenta>();									
		
			ReciboPuntoVenta recibopuntoventaOrigen=new ReciboPuntoVenta();
			ReciboPuntoVenta recibopuntoventaDestino=new ReciboPuntoVenta();
				
			recibopuntoventasSeleccionados=this.getReciboPuntoVentasSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosReciboPuntoVenta.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || recibopuntoventasSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosReciboPuntoVenta.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						recibopuntoventaOrigen =(ReciboPuntoVenta) this.recibopuntoventaLogic.getReciboPuntoVentas().toArray()[this.jTableDatosReciboPuntoVenta.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						recibopuntoventaOrigen =(ReciboPuntoVenta) this.recibopuntoventas.toArray()[this.jTableDatosReciboPuntoVenta.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						recibopuntoventaDestino =(ReciboPuntoVenta) this.recibopuntoventaLogic.getReciboPuntoVentas().toArray()[this.jTableDatosReciboPuntoVenta.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						recibopuntoventaDestino =(ReciboPuntoVenta) this.recibopuntoventas.toArray()[this.jTableDatosReciboPuntoVenta.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				recibopuntoventaOrigen =recibopuntoventasSeleccionados.get(0);
				recibopuntoventaDestino =recibopuntoventasSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosReciboPuntoVenta(recibopuntoventaOrigen,recibopuntoventaDestino,true,false);
				
				recibopuntoventaDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(recibopuntoventaDestino,recibopuntoventaLogic.getReciboPuntoVentas());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(recibopuntoventaDestino,recibopuntoventas);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaReciboPuntoVenta(false);
				
				//this.jTableDatosReciboPuntoVenta.setRowSelectionInterval(this.getIndiceNuevoReciboPuntoVenta(), this.getIndiceNuevoReciboPuntoVenta());
				
				int iLastRow =  this.jTableDatosReciboPuntoVenta.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosReciboPuntoVenta.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosReciboPuntoVenta.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaReciboPuntoVenta(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ReciboPuntoVentaConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormReciboPuntoVentaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormReciboPuntoVenta==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormReciboPuntoVenta.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ReciboPuntoVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarReciboPuntoVentaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesReciboPuntoVenta.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasReciboPuntoVenta.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesReciboPuntoVenta.setVisible(!isVisible);
			this.jPanelPaginacionReciboPuntoVenta.setVisible(!isVisible);
			this.jPanelAccionesReciboPuntoVenta.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ReciboPuntoVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReciboPuntoVentaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameReciboPuntoVenta();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ReciboPuntoVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoReciboPuntoVentaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoReciboPuntoVenta();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ReciboPuntoVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionReciboPuntoVentaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionReciboPuntoVenta();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ReciboPuntoVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByReciboPuntoVentaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByReciboPuntoVenta();
			
			this.abrirFrameOrderByReciboPuntoVenta();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ReciboPuntoVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByReciboPuntoVentaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByReciboPuntoVenta();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ReciboPuntoVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleReciboPuntoVenta(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormReciboPuntoVenta);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormReciboPuntoVenta.isMaximum()) {
					this.jInternalFrameDetalleFormReciboPuntoVenta.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormReciboPuntoVenta.setSize(this.jInternalFrameDetalleFormReciboPuntoVenta.iWidthFormulario,this.jInternalFrameDetalleFormReciboPuntoVenta.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormReciboPuntoVenta.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormReciboPuntoVenta.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormReciboPuntoVenta.isMaximum()) {
						this.jInternalFrameDetalleFormReciboPuntoVenta.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormReciboPuntoVenta.jContentPaneDetalleReciboPuntoVenta.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormReciboPuntoVenta.jTabbedPaneRelacionesReciboPuntoVenta.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormReciboPuntoVenta.jContentPaneDetalleReciboPuntoVenta.getWidth(),ReciboPuntoVentaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormReciboPuntoVenta.jTabbedPaneRelacionesReciboPuntoVenta.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormReciboPuntoVenta.jContentPaneDetalleReciboPuntoVenta.getWidth(),ReciboPuntoVentaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormReciboPuntoVenta.jTabbedPaneRelacionesReciboPuntoVenta.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormReciboPuntoVenta.jContentPaneDetalleReciboPuntoVenta.getWidth(),ReciboPuntoVentaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormReciboPuntoVenta.setVisible(true);
	        this.jInternalFrameDetalleFormReciboPuntoVenta.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ReciboPuntoVentaConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByReciboPuntoVenta() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByReciboPuntoVenta==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByReciboPuntoVenta=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByReciboPuntoVenta,false,this);
				} else {
					this.jInternalFrameOrderByReciboPuntoVenta=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByReciboPuntoVenta,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByReciboPuntoVenta);
				this.jInternalFrameOrderByReciboPuntoVenta.setVisible(false);
				this.jInternalFrameOrderByReciboPuntoVenta.setSelected(false);
				
				this.jInternalFrameOrderByReciboPuntoVenta.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByReciboPuntoVenta"));
				
				this.inicializarActualizarBindingTablaOrderByReciboPuntoVenta();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionReciboPuntoVenta() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionReciboPuntoVenta==null) {
				
				this.jInternalFrameImportacionReciboPuntoVenta=new ImportacionJInternalFrame(ReciboPuntoVentaConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionReciboPuntoVenta);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionReciboPuntoVenta);
				this.jInternalFrameImportacionReciboPuntoVenta.setVisible(false);
				this.jInternalFrameImportacionReciboPuntoVenta.setSelected(false);


				this.jInternalFrameImportacionReciboPuntoVenta.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionReciboPuntoVenta"));
				this.jInternalFrameImportacionReciboPuntoVenta.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionReciboPuntoVenta"));
				this.jInternalFrameImportacionReciboPuntoVenta.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionReciboPuntoVenta"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoReciboPuntoVenta() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoReciboPuntoVenta==null) {
				this.jInternalFrameReporteDinamicoReciboPuntoVenta=new ReporteDinamicoJInternalFrame(ReciboPuntoVentaConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoReciboPuntoVenta);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoReciboPuntoVenta);
				this.jInternalFrameReporteDinamicoReciboPuntoVenta.setVisible(false);
				this.jInternalFrameReporteDinamicoReciboPuntoVenta.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoReciboPuntoVenta.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoReciboPuntoVenta"));
				this.jInternalFrameReporteDinamicoReciboPuntoVenta.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoReciboPuntoVenta"));
				this.jInternalFrameReporteDinamicoReciboPuntoVenta.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoReciboPuntoVenta"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualReciboPuntoVenta();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleReciboPuntoVenta() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormReciboPuntoVenta);
			
	       	this.jInternalFrameDetalleFormReciboPuntoVenta.setVisible(false);
	        this.jInternalFrameDetalleFormReciboPuntoVenta.setSelected(false);
			
			//this.jInternalFrameDetalleFormReciboPuntoVenta.dispose();
			//this.jInternalFrameDetalleFormReciboPuntoVenta=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ReciboPuntoVentaConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoReciboPuntoVenta() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoReciboPuntoVenta.setVisible(true);
	        this.jInternalFrameReporteDinamicoReciboPuntoVenta.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ReciboPuntoVentaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionReciboPuntoVenta() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionReciboPuntoVenta.setVisible(true);
	        this.jInternalFrameImportacionReciboPuntoVenta.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ReciboPuntoVentaConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByReciboPuntoVenta() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByReciboPuntoVenta.setVisible(true);
	        this.jInternalFrameOrderByReciboPuntoVenta.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ReciboPuntoVentaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByReciboPuntoVenta() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByReciboPuntoVenta.setVisible(false);
	        this.jInternalFrameOrderByReciboPuntoVenta.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ReciboPuntoVentaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoReciboPuntoVenta() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoReciboPuntoVenta.setVisible(false);
	        this.jInternalFrameReporteDinamicoReciboPuntoVenta.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ReciboPuntoVentaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionReciboPuntoVenta() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionReciboPuntoVenta.setVisible(false);
	        this.jInternalFrameImportacionReciboPuntoVenta.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ReciboPuntoVentaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarReciboPuntoVentaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarReciboPuntoVenta(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ReciboPuntoVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarReciboPuntoVenta(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosReciboPuntoVenta.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesReciboPuntoVenta(true);
			//this.isEsNuevoReciboPuntoVenta=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.recibopuntoventa =(ReciboPuntoVenta) this.recibopuntoventaLogic.getReciboPuntoVentas().toArray()[this.jTableDatosReciboPuntoVenta.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.recibopuntoventa =(ReciboPuntoVenta) this.recibopuntoventas.toArray()[this.jTableDatosReciboPuntoVenta.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesReciboPuntoVenta("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesReciboPuntoVenta(false) ;
			
			if(recibopuntoventaSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(ReciboPuntoVentaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleReciboPuntoVenta(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualReciboPuntoVenta(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ReciboPuntoVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaReciboPuntoVentaActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosReciboPuntoVenta.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.recibopuntoventa =(ReciboPuntoVenta) this.recibopuntoventaLogic.getReciboPuntoVentas().toArray()[this.jTableDatosReciboPuntoVenta.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.recibopuntoventa =(ReciboPuntoVenta) this.recibopuntoventas.toArray()[this.jTableDatosReciboPuntoVenta.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ReciboPuntoVentaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarReciboPuntoVenta(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormReciboPuntoVenta==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosReciboPuntoVenta.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesReciboPuntoVenta(true);
			//this.isEsNuevoReciboPuntoVenta=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.recibopuntoventa =(ReciboPuntoVenta) this.recibopuntoventaLogic.getReciboPuntoVentas().toArray()[this.jTableDatosReciboPuntoVenta.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.recibopuntoventa =(ReciboPuntoVenta) this.recibopuntoventas.toArray()[this.jTableDatosReciboPuntoVenta.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.recibopuntoventa.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesReciboPuntoVenta("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesReciboPuntoVenta(false) ;
			
			if(ReciboPuntoVentaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleReciboPuntoVenta(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualReciboPuntoVenta(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ReciboPuntoVentaConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
			
			if(sType.equals("Cliente")) {
				if(!this.recibopuntoventaConstantesFunciones.cargarid_clienteReciboPuntoVenta) {
					this.cargarCombosClientesForeignKeyLista(" where id="+id);
					//this.inicializarActualizarBindingReciboPuntoVenta(false,false);
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
		TableColumn tableColumnCliente=this.jTableDatosReciboPuntoVenta.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosReciboPuntoVenta,ReciboPuntoVentaConstantesFunciones.LABEL_IDCLIENTE));
		TableCellEditor tableCellEditorCliente =tableColumnCliente.getCellEditor();

		ClienteTableCell clienteTableCellFk=(ClienteTableCell)tableCellEditorCliente;

		if(clienteTableCellFk!=null) {
			clienteTableCellFk.setclientesForeignKey(clientesForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosReciboPuntoVenta.getSelectedRow();

		//if(intSelectedRow<=0) {
			//clienteTableCellFk.setRowActual(intSelectedRow);
			//clienteTableCellFk.setclientesForeignKeyActual(clientesForeignKey);
		//}


		if(clienteTableCellFk!=null) {
			clienteTableCellFk.RecargarClientesForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaBanco(List<Banco> bancosForeignKey)throws Exception{
		TableColumn tableColumnBanco=this.jTableDatosReciboPuntoVenta.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosReciboPuntoVenta,ReciboPuntoVentaConstantesFunciones.LABEL_IDBANCO));
		TableCellEditor tableCellEditorBanco =tableColumnBanco.getCellEditor();

		BancoTableCell bancoTableCellFk=(BancoTableCell)tableCellEditorBanco;

		if(bancoTableCellFk!=null) {
			bancoTableCellFk.setbancosForeignKey(bancosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosReciboPuntoVenta.getSelectedRow();

		//if(intSelectedRow<=0) {
			//bancoTableCellFk.setRowActual(intSelectedRow);
			//bancoTableCellFk.setbancosForeignKeyActual(bancosForeignKey);
		//}


		if(bancoTableCellFk!=null) {
			bancoTableCellFk.RecargarBancosForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	

	public void setCombosCodigoDesdeBusquedaid_cliente (Long id) throws Exception {
		this.setActualClienteForeignKey(id,true,"Todos");

	};
	
	public void jButtonActualizarReciboPuntoVentaActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.recibopuntoventaLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesReciboPuntoVenta(false);
			
			//if(!this.isEsNuevoReciboPuntoVenta) {								
				int intSelectedRow = this.jTableDatosReciboPuntoVenta.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.recibopuntoventa =(ReciboPuntoVenta) this.recibopuntoventaLogic.getReciboPuntoVentas().toArray()[this.jTableDatosReciboPuntoVenta.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.recibopuntoventa =(ReciboPuntoVenta) this.recibopuntoventas.toArray()[this.jTableDatosReciboPuntoVenta.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(ReciboPuntoVentaJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualReciboPuntoVenta(this.recibopuntoventa,true);
				this.setVariablesFormularioToObjetoActualForeignKeysReciboPuntoVenta(this.recibopuntoventa);
				
			}
			
			if(this.permiteMantenimiento(this.recibopuntoventa)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.recibopuntoventaSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoReciboPuntoVenta=true;
					this.inicializarActualizarBindingTablaReciboPuntoVenta(false);
					this.isEsNuevoReciboPuntoVenta=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoReciboPuntoVenta=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoReciboPuntoVenta=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesReciboPuntoVenta(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualReciboPuntoVenta(false);
				
				this.habilitarDeshabilitarControlesReciboPuntoVenta(false);
			
												
				
				if(ReciboPuntoVentaJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleReciboPuntoVenta();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoReciboPuntoVentaActionPerformed(evt,recibopuntoventaSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualReciboPuntoVenta(this.recibopuntoventa,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosReciboPuntoVenta.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,recibopuntoventaSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.recibopuntoventaLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.recibopuntoventa.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(ReciboPuntoVenta.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ReciboPuntoVenta.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.recibopuntoventaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ReciboPuntoVentaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.recibopuntoventaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarReciboPuntoVentaActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.recibopuntoventaLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosReciboPuntoVenta.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.recibopuntoventa =(ReciboPuntoVenta) this.recibopuntoventaLogic.getReciboPuntoVentas().toArray()[this.jTableDatosReciboPuntoVenta.convertRowIndexToModel(intSelectedRow)];
				this.recibopuntoventa.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.recibopuntoventa =(ReciboPuntoVenta) this.recibopuntoventas.toArray()[this.jTableDatosReciboPuntoVenta.convertRowIndexToModel(intSelectedRow)];
				this.recibopuntoventa.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.recibopuntoventa)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.recibopuntoventaSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((ReciboPuntoVentaModel) this.jTableDatosReciboPuntoVenta.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoReciboPuntoVenta=true;
				this.inicializarActualizarBindingTablaReciboPuntoVenta(false);
				this.isEsNuevoReciboPuntoVenta=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesReciboPuntoVenta(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualReciboPuntoVenta(false);
				
				this.habilitarDeshabilitarControlesReciboPuntoVenta(false);
				
				
				
				if(ReciboPuntoVentaJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleReciboPuntoVenta();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.recibopuntoventaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.recibopuntoventaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ReciboPuntoVentaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.recibopuntoventaLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarReciboPuntoVentaActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosReciboPuntoVenta.getRowCount()>=1) {
				jTableDatosReciboPuntoVenta.removeRowSelectionInterval(0, jTableDatosReciboPuntoVenta.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesReciboPuntoVenta(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaReciboPuntoVenta(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesReciboPuntoVenta(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualReciboPuntoVenta(false) ;
			
			this.isEsNuevoReciboPuntoVenta=false;
			
			if(ReciboPuntoVentaJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleReciboPuntoVenta();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ReciboPuntoVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosReciboPuntoVentaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.recibopuntoventaLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingReciboPuntoVenta(false);
				
				//SI ES MANUAL
				if(ReciboPuntoVentaJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualReciboPuntoVenta();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.recibopuntoventaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.recibopuntoventaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ReciboPuntoVentaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.recibopuntoventaLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosReciboPuntoVentaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoReciboPuntoVenta--;			
			//ReciboPuntoVenta recibopuntoventaAux= new ReciboPuntoVenta();			
			//recibopuntoventaAux.setId(this.iIdNuevoReciboPuntoVenta);
			
			if(this.jInternalFrameDetalleFormReciboPuntoVenta==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaReciboPuntoVenta();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysReciboPuntoVenta(this.recibopuntoventa);
			
			this.recibopuntoventa.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.recibopuntoventaLogic.getReciboPuntoVentas().add(this.recibopuntoventaAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.recibopuntoventas.add(this.recibopuntoventaAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaReciboPuntoVenta(false);
			
			this.jTableDatosReciboPuntoVenta.setRowSelectionInterval(this.getIndiceNuevoReciboPuntoVenta(), this.getIndiceNuevoReciboPuntoVenta());
			
			int iLastRow =  this.jTableDatosReciboPuntoVenta.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosReciboPuntoVenta.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosReciboPuntoVenta.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaReciboPuntoVenta(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,ReciboPuntoVentaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionReciboPuntoVentaActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.recibopuntoventaLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingReciboPuntoVenta(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingReciboPuntoVenta(false);
			
			//SI ES MANUAL
			if(ReciboPuntoVentaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualReciboPuntoVenta();
			}
			
			//this.abrirFrameTreeReciboPuntoVenta();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.recibopuntoventaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.recibopuntoventaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ReciboPuntoVentaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.recibopuntoventaLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionReciboPuntoVentaActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Recibo Punto VentaS ?", "MANTENIMIENTO DE Recibo Punto Venta", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionReciboPuntoVenta.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralReciboPuntoVenta();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.recibopuntoventaReturnGeneral=recibopuntoventaLogic.procesarImportacionReciboPuntoVentasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.recibopuntoventaParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarReciboPuntoVentaReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ReciboPuntoVentaConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionReciboPuntoVentaActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionReciboPuntoVenta.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionReciboPuntoVenta.setFileImportacion(this.jInternalFrameImportacionReciboPuntoVenta.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionReciboPuntoVenta.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionReciboPuntoVenta.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionReciboPuntoVenta.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionReciboPuntoVenta.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ReciboPuntoVentaConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoReciboPuntoVentaActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<ReciboPuntoVenta> recibopuntoventasSeleccionados=new ArrayList<ReciboPuntoVenta>();		

		recibopuntoventasSeleccionados=this.getReciboPuntoVentasSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoReciboPuntoVenta.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoReciboPuntoVenta.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("ReciboPuntoVentaBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"ReciboPuntoVentaBaseDesign.jrxml";
			
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
			
			this.generarReporteReciboPuntoVentas("Todos",recibopuntoventasSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.recibopuntoventaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Recibo Punto Venta",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ReciboPuntoVentaConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoReciboPuntoVenta.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoReciboPuntoVenta.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case ReciboPuntoVentaConstantesFunciones.LABEL_IDCLIENTE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Cliente_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Cliente_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Cliente_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Cliente_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ReciboPuntoVentaConstantesFunciones.LABEL_IDBANCO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Banco_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Banco_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Banco_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Banco_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ReciboPuntoVentaConstantesFunciones.LABEL_VALOREFECTIVO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_lorEfectivo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_lorEfectivo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_lorEfectivo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_lorEfectivo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ReciboPuntoVentaConstantesFunciones.LABEL_VALORCHEQUE:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_lorCheque_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_lorCheque_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_lorCheque_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_lorCheque_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ReciboPuntoVentaConstantesFunciones.LABEL_NUMEROCHEQUE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_meroCheque_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_meroCheque_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_meroCheque_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_meroCheque_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ReciboPuntoVentaConstantesFunciones.LABEL_FECHA:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_cha_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_cha_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_cha_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_cha_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoReciboPuntoVenta.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoReciboPuntoVenta.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoReciboPuntoVenta.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case ReciboPuntoVentaConstantesFunciones.LABEL_IDCLIENTE:
					sNombreCampoCategoria="id_cliente";
					break;

				case ReciboPuntoVentaConstantesFunciones.LABEL_IDBANCO:
					sNombreCampoCategoria="id_banco";
					break;

				case ReciboPuntoVentaConstantesFunciones.LABEL_VALOREFECTIVO:
					sNombreCampoCategoria="valor_efectivo";
					break;

				case ReciboPuntoVentaConstantesFunciones.LABEL_VALORCHEQUE:
					sNombreCampoCategoria="valor_cheque";
					break;

				case ReciboPuntoVentaConstantesFunciones.LABEL_NUMEROCHEQUE:
					sNombreCampoCategoria="numero_cheque";
					break;

				case ReciboPuntoVentaConstantesFunciones.LABEL_FECHA:
					sNombreCampoCategoria="fecha";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoReciboPuntoVenta.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case ReciboPuntoVentaConstantesFunciones.LABEL_IDCLIENTE:
					sNombreCampoCategoriaValor="id_cliente";
					break;

				case ReciboPuntoVentaConstantesFunciones.LABEL_IDBANCO:
					sNombreCampoCategoriaValor="id_banco";
					break;

				case ReciboPuntoVentaConstantesFunciones.LABEL_VALOREFECTIVO:
					sNombreCampoCategoriaValor="valor_efectivo";
					break;

				case ReciboPuntoVentaConstantesFunciones.LABEL_VALORCHEQUE:
					sNombreCampoCategoriaValor="valor_cheque";
					break;

				case ReciboPuntoVentaConstantesFunciones.LABEL_NUMEROCHEQUE:
					sNombreCampoCategoriaValor="numero_cheque";
					break;

				case ReciboPuntoVentaConstantesFunciones.LABEL_FECHA:
					sNombreCampoCategoriaValor="fecha";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoReciboPuntoVenta.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoReciboPuntoVenta.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case ReciboPuntoVentaConstantesFunciones.LABEL_IDCLIENTE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Cliente",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_cliente");
					break;

				case ReciboPuntoVentaConstantesFunciones.LABEL_IDBANCO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Banco",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_banco");
					break;

				case ReciboPuntoVentaConstantesFunciones.LABEL_VALOREFECTIVO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Valor Efectivo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"valor_efectivo");
					break;

				case ReciboPuntoVentaConstantesFunciones.LABEL_VALORCHEQUE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Valor Cheque",sNombreCampoCategoria,sNombreCampoCategoriaValor,"valor_cheque");
					break;

				case ReciboPuntoVentaConstantesFunciones.LABEL_NUMEROCHEQUE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Numero Cheque",sNombreCampoCategoria,sNombreCampoCategoriaValor,"numero_cheque");
					break;

				case ReciboPuntoVentaConstantesFunciones.LABEL_FECHA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Fecha",sNombreCampoCategoria,sNombreCampoCategoriaValor,"fecha");
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
	
	public void jButtonGenerarExcelReporteDinamicoReciboPuntoVentaActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<ReciboPuntoVenta> recibopuntoventasSeleccionados=new ArrayList<ReciboPuntoVenta>();		
		
		recibopuntoventasSeleccionados=this.getReciboPuntoVentasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"recibopuntoventa";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("ReciboPuntoVentas");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoReciboPuntoVenta.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoReciboPuntoVenta.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case ReciboPuntoVentaConstantesFunciones.LABEL_IDCLIENTE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ReciboPuntoVentaConstantesFunciones.LABEL_IDCLIENTE);
					iRow++;

					for(ReciboPuntoVenta recibopuntoventa:recibopuntoventasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(recibopuntoventa.getcliente_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ReciboPuntoVentaConstantesFunciones.LABEL_IDBANCO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ReciboPuntoVentaConstantesFunciones.LABEL_IDBANCO);
					iRow++;

					for(ReciboPuntoVenta recibopuntoventa:recibopuntoventasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(recibopuntoventa.getbanco_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ReciboPuntoVentaConstantesFunciones.LABEL_VALOREFECTIVO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ReciboPuntoVentaConstantesFunciones.LABEL_VALOREFECTIVO);
					iRow++;

					for(ReciboPuntoVenta recibopuntoventa:recibopuntoventasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(recibopuntoventa.getvalor_efectivo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ReciboPuntoVentaConstantesFunciones.LABEL_VALORCHEQUE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ReciboPuntoVentaConstantesFunciones.LABEL_VALORCHEQUE);
					iRow++;

					for(ReciboPuntoVenta recibopuntoventa:recibopuntoventasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(recibopuntoventa.getvalor_cheque());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ReciboPuntoVentaConstantesFunciones.LABEL_NUMEROCHEQUE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ReciboPuntoVentaConstantesFunciones.LABEL_NUMEROCHEQUE);
					iRow++;

					for(ReciboPuntoVenta recibopuntoventa:recibopuntoventasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(recibopuntoventa.getnumero_cheque());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ReciboPuntoVentaConstantesFunciones.LABEL_FECHA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ReciboPuntoVentaConstantesFunciones.LABEL_FECHA);
					iRow++;

					for(ReciboPuntoVenta recibopuntoventa:recibopuntoventasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(recibopuntoventa.getfecha());
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
			//	this.getFilaCabeceraExportarExcelReciboPuntoVenta(row);				
			//	iRow++;
			//}				
			
			//for(ReciboPuntoVenta recibopuntoventaAux:recibopuntoventasSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelReciboPuntoVenta(recibopuntoventaAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.recibopuntoventaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Recibo Punto Venta",JOptionPane.INFORMATION_MESSAGE);
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
				this.recibopuntoventaLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingReciboPuntoVenta(false);
			
			//SI ES MANUAL
			if(ReciboPuntoVentaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualReciboPuntoVenta();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.recibopuntoventaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.recibopuntoventaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.recibopuntoventaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresReciboPuntoVentaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.recibopuntoventaLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingReciboPuntoVenta(false);
			
			//SI ES MANUAL
			if(ReciboPuntoVentaJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualReciboPuntoVenta();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.recibopuntoventaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.recibopuntoventaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ReciboPuntoVentaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.recibopuntoventaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesReciboPuntoVentaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.recibopuntoventaLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingReciboPuntoVenta(false);
			
			//SI ES MANUAL
			if(ReciboPuntoVentaJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualReciboPuntoVenta();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.recibopuntoventaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.recibopuntoventaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ReciboPuntoVentaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.recibopuntoventaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaReciboPuntoVenta() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosReciboPuntoVenta.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosReciboPuntoVenta.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosReciboPuntoVenta.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosReciboPuntoVenta.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosReciboPuntoVenta.setMinimumSize(dimensionMinimum);
		this.jTableDatosReciboPuntoVenta.setMaximumSize(dimensionMaximum);
		this.jTableDatosReciboPuntoVenta.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingReciboPuntoVenta(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingReciboPuntoVenta(esInicializar,true);
	}
	
	public void inicializarActualizarBindingReciboPuntoVenta(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaReciboPuntoVenta(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesReciboPuntoVenta(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.recibopuntoventaSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasReciboPuntoVenta(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesReciboPuntoVenta(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesReciboPuntoVenta(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !ReciboPuntoVentaJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!ReciboPuntoVentaJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualReciboPuntoVenta() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaReciboPuntoVenta();
		
		this.inicializarActualizarBindingBotonesManualReciboPuntoVenta(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.recibopuntoventaSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualReciboPuntoVenta();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesReciboPuntoVenta() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualReciboPuntoVenta(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualReciboPuntoVenta(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosReciboPuntoVenta.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosReciboPuntoVenta.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteReciboPuntoVenta.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormReciboPuntoVenta!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormReciboPuntoVenta.jCheckBoxPostAccionNuevoReciboPuntoVenta.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormReciboPuntoVenta.jCheckBoxPostAccionSinCerrarReciboPuntoVenta.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormReciboPuntoVenta.jCheckBoxPostAccionSinMensajeReciboPuntoVenta.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosReciboPuntoVenta.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosReciboPuntoVenta.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteReciboPuntoVenta.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormReciboPuntoVenta!=null) {
				this.jInternalFrameDetalleFormReciboPuntoVenta.jCheckBoxPostAccionNuevoReciboPuntoVenta.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormReciboPuntoVenta.jCheckBoxPostAccionSinCerrarReciboPuntoVenta.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormReciboPuntoVenta.jCheckBoxPostAccionSinMensajeReciboPuntoVenta.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionReciboPuntoVenta.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionReciboPuntoVenta.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormReciboPuntoVenta!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormReciboPuntoVenta.jComboBoxTiposAccionesFormularioReciboPuntoVenta.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesReciboPuntoVenta.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoReciboPuntoVenta!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoReciboPuntoVenta.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesReciboPuntoVenta.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesReciboPuntoVenta.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarReciboPuntoVenta.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesReciboPuntoVenta.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoReciboPuntoVenta!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoReciboPuntoVenta.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesReciboPuntoVenta.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralReciboPuntoVenta.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesReciboPuntoVenta(Boolean esInicializar) throws Exception {
		try	{	
			if(ReciboPuntoVentaJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualReciboPuntoVenta(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesReciboPuntoVenta() throws Exception {
		try	{
			if(ReciboPuntoVentaJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualReciboPuntoVenta();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleReciboPuntoVenta() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormReciboPuntoVenta.jComboBoxTiposAccionesFormularioReciboPuntoVenta.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormReciboPuntoVenta.jComboBoxTiposAccionesFormularioReciboPuntoVenta.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualReciboPuntoVenta() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesReciboPuntoVenta.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesReciboPuntoVenta.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesReciboPuntoVenta.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesReciboPuntoVenta.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesReciboPuntoVenta.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesReciboPuntoVenta.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionReciboPuntoVenta.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionReciboPuntoVenta.addItem(reporte);
			}
			
			
			if(!this.recibopuntoventaSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionReciboPuntoVenta.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionReciboPuntoVenta.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesReciboPuntoVenta.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesReciboPuntoVenta.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesReciboPuntoVenta.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesReciboPuntoVenta.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormReciboPuntoVenta!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormReciboPuntoVenta.jComboBoxTiposAccionesFormularioReciboPuntoVenta.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormReciboPuntoVenta.jComboBoxTiposAccionesFormularioReciboPuntoVenta.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarReciboPuntoVenta.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarReciboPuntoVenta.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarReciboPuntoVenta.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualReciboPuntoVenta();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualReciboPuntoVenta() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoReciboPuntoVenta!=null) {
				this.jInternalFrameReporteDinamicoReciboPuntoVenta.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoReciboPuntoVenta.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoReciboPuntoVenta!=null) {
				this.jInternalFrameReporteDinamicoReciboPuntoVenta.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoReciboPuntoVenta.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoReciboPuntoVenta!=null) {
				
				if(this.jInternalFrameReporteDinamicoReciboPuntoVenta.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoReciboPuntoVenta.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoReciboPuntoVenta.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoReciboPuntoVenta.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoReciboPuntoVenta.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoReciboPuntoVenta.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
				
				//TIPOS COLUMNAS CATEGORIA DINAMICO
				if(this.jInternalFrameReporteDinamicoReciboPuntoVenta.getjComboBoxColumnaCategoriaGrafico()!=null) {
					this.jInternalFrameReporteDinamicoReciboPuntoVenta.getjComboBoxColumnaCategoriaGrafico().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoria=ReciboPuntoVentaConstantesFunciones.getTiposSeleccionarReciboPuntoVenta(true,true,false,true,true);
						
					for(Reporte reporte:tiposColumnasCategoria) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoReciboPuntoVenta.getjComboBoxColumnaCategoriaGrafico().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS CATEGORIA VALOR DINAMICO
				if(this.jInternalFrameReporteDinamicoReciboPuntoVenta.getjComboBoxColumnaCategoriaValor()!=null) {
					this.jInternalFrameReporteDinamicoReciboPuntoVenta.getjComboBoxColumnaCategoriaValor().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoriaValor=ReciboPuntoVentaConstantesFunciones.getTiposSeleccionarReciboPuntoVenta(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasCategoriaValor) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoReciboPuntoVenta.getjComboBoxColumnaCategoriaValor().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS VALOR
				defaultListModel=new DefaultListModel<Reporte>();
					
				if(this.jInternalFrameReporteDinamicoReciboPuntoVenta.getjListColumnasValoresGrafico()!=null) {
					this.jInternalFrameReporteDinamicoReciboPuntoVenta.getjListColumnasValoresGrafico().removeAll();
						
					ArrayList<Reporte> tiposColumnasValor=ReciboPuntoVentaConstantesFunciones.getTiposSeleccionarReciboPuntoVenta(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasValor) {//this.tiposSeleccionar
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoReciboPuntoVenta.getjListColumnasValoresGrafico().setModel(defaultListModel);									
						
				}
					
				//TIPOS GRAFICOS REPORTES DINAMICOS
				if(this.jInternalFrameReporteDinamicoReciboPuntoVenta.getjComboBoxTiposGraficosReportesDinamico()!=null) {
					this.jInternalFrameReporteDinamicoReciboPuntoVenta.getjComboBoxTiposGraficosReportesDinamico().removeAllItems();
						
					for(Reporte reporte:this.tiposGraficosReportes) {
						this.jInternalFrameReporteDinamicoReciboPuntoVenta.getjComboBoxTiposGraficosReportesDinamico().addItem(reporte);
					}
					
				}
			
			
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualReciboPuntoVenta()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_bancoFK_IdBancoReciboPuntoVenta.getSelectedItem()!=null){this.id_bancoFK_IdBanco=((Banco)this.jComboBoxid_bancoFK_IdBancoReciboPuntoVenta.getSelectedItem()).getId();}
		if(this.jComboBoxid_clienteFK_IdClienteReciboPuntoVenta.getSelectedItem()!=null){this.id_clienteFK_IdCliente=((Cliente)this.jComboBoxid_clienteFK_IdClienteReciboPuntoVenta.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasReciboPuntoVenta(Boolean esInicializar) throws Exception {				
		if(ReciboPuntoVentaJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualReciboPuntoVenta();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaReciboPuntoVenta() throws Exception {
		this.inicializarActualizarBindingTablaReciboPuntoVenta(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByReciboPuntoVenta() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByReciboPuntoVenta.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByReciboPuntoVenta.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByReciboPuntoVenta.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new ReciboPuntoVentaPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByReciboPuntoVenta.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByReciboPuntoVenta.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new ReciboPuntoVentaPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosReciboPuntoVentaOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosReciboPuntoVentaOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new ReciboPuntoVentaPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByReciboPuntoVenta.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByReciboPuntoVenta.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new ReciboPuntoVentaPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByReciboPuntoVenta.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaReciboPuntoVenta(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=recibopuntoventaLogic.getReciboPuntoVentas().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=recibopuntoventas.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(ReciboPuntoVentaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosReciboPuntoVenta.setModel(new ReciboPuntoVentaModel(this.recibopuntoventaLogic.getReciboPuntoVentas(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosReciboPuntoVenta.setModel(new ReciboPuntoVentaModel(this.recibopuntoventas,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByReciboPuntoVenta!=null && this.jInternalFrameOrderByReciboPuntoVenta.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByReciboPuntoVenta();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosReciboPuntoVenta.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosReciboPuntoVenta,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new ReciboPuntoVentaPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+ReciboPuntoVentaConstantesFunciones.SCLASSWEBTITULO,recibopuntoventaConstantesFunciones.resaltarSeleccionarReciboPuntoVenta,iSizeTabla,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+ReciboPuntoVentaConstantesFunciones.SCLASSWEBTITULO,recibopuntoventaConstantesFunciones.resaltarSeleccionarReciboPuntoVenta,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosReciboPuntoVenta.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosReciboPuntoVenta,ReciboPuntoVentaConstantesFunciones.LABEL_ID));

		if(this.recibopuntoventaConstantesFunciones.mostraridReciboPuntoVenta && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ReciboPuntoVentaConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.recibopuntoventaConstantesFunciones.resaltaridReciboPuntoVenta,this.recibopuntoventaConstantesFunciones.activaridReciboPuntoVenta,iSizeTabla,this,true,"idReciboPuntoVenta","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.recibopuntoventaConstantesFunciones.resaltaridReciboPuntoVenta,this.recibopuntoventaConstantesFunciones.activaridReciboPuntoVenta,this,true,"idReciboPuntoVenta","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosReciboPuntoVenta.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosReciboPuntoVenta,ReciboPuntoVentaConstantesFunciones.LABEL_IDCLIENTE));

		if(this.recibopuntoventaConstantesFunciones.mostrarid_clienteReciboPuntoVenta && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ReciboPuntoVentaConstantesFunciones.LABEL_IDCLIENTE,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new ClienteTableCell(this.clientesForeignKey,this.recibopuntoventaConstantesFunciones.resaltarid_clienteReciboPuntoVenta,this,this.recibopuntoventaConstantesFunciones.activarid_clienteReciboPuntoVenta,iSizeTabla));
			tableColumn.setCellEditor(new ClienteTableCell(this.clientesForeignKey,this.recibopuntoventaConstantesFunciones.resaltarid_clienteReciboPuntoVenta,this,this.recibopuntoventaConstantesFunciones.activarid_clienteReciboPuntoVenta,true,"id_clienteReciboPuntoVenta","CON_BUSQUEDA"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75);
			//tableColumn.addPropertyChangeListener(new ReciboPuntoVentaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosReciboPuntoVenta.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosReciboPuntoVenta,ReciboPuntoVentaConstantesFunciones.LABEL_IDBANCO));

		if(this.recibopuntoventaConstantesFunciones.mostrarid_bancoReciboPuntoVenta && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ReciboPuntoVentaConstantesFunciones.LABEL_IDBANCO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new BancoTableCell(this.bancosForeignKey,this.recibopuntoventaConstantesFunciones.resaltarid_bancoReciboPuntoVenta,this,this.recibopuntoventaConstantesFunciones.activarid_bancoReciboPuntoVenta,iSizeTabla));
			tableColumn.setCellEditor(new BancoTableCell(this.bancosForeignKey,this.recibopuntoventaConstantesFunciones.resaltarid_bancoReciboPuntoVenta,this,this.recibopuntoventaConstantesFunciones.activarid_bancoReciboPuntoVenta,true,"id_bancoReciboPuntoVenta","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ReciboPuntoVentaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosReciboPuntoVenta.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosReciboPuntoVenta,ReciboPuntoVentaConstantesFunciones.LABEL_VALOREFECTIVO));

		if(this.recibopuntoventaConstantesFunciones.mostrarvalor_efectivoReciboPuntoVenta && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ReciboPuntoVentaConstantesFunciones.LABEL_VALOREFECTIVO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.recibopuntoventaConstantesFunciones.resaltarvalor_efectivoReciboPuntoVenta,this.recibopuntoventaConstantesFunciones.activarvalor_efectivoReciboPuntoVenta,iSizeTabla,this,true,"valor_efectivoReciboPuntoVenta","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.recibopuntoventaConstantesFunciones.resaltarvalor_efectivoReciboPuntoVenta,this.recibopuntoventaConstantesFunciones.activarvalor_efectivoReciboPuntoVenta,this,true,"valor_efectivoReciboPuntoVenta","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new ReciboPuntoVentaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosReciboPuntoVenta.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosReciboPuntoVenta,ReciboPuntoVentaConstantesFunciones.LABEL_VALORCHEQUE));

		if(this.recibopuntoventaConstantesFunciones.mostrarvalor_chequeReciboPuntoVenta && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ReciboPuntoVentaConstantesFunciones.LABEL_VALORCHEQUE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.recibopuntoventaConstantesFunciones.resaltarvalor_chequeReciboPuntoVenta,this.recibopuntoventaConstantesFunciones.activarvalor_chequeReciboPuntoVenta,iSizeTabla,this,true,"valor_chequeReciboPuntoVenta","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.recibopuntoventaConstantesFunciones.resaltarvalor_chequeReciboPuntoVenta,this.recibopuntoventaConstantesFunciones.activarvalor_chequeReciboPuntoVenta,this,true,"valor_chequeReciboPuntoVenta","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new ReciboPuntoVentaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosReciboPuntoVenta.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosReciboPuntoVenta,ReciboPuntoVentaConstantesFunciones.LABEL_NUMEROCHEQUE));

		if(this.recibopuntoventaConstantesFunciones.mostrarnumero_chequeReciboPuntoVenta && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ReciboPuntoVentaConstantesFunciones.LABEL_NUMEROCHEQUE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.recibopuntoventaConstantesFunciones.resaltarnumero_chequeReciboPuntoVenta,this.recibopuntoventaConstantesFunciones.activarnumero_chequeReciboPuntoVenta,iSizeTabla,this,true,"numero_chequeReciboPuntoVenta","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.recibopuntoventaConstantesFunciones.resaltarnumero_chequeReciboPuntoVenta,this.recibopuntoventaConstantesFunciones.activarnumero_chequeReciboPuntoVenta,this,true,"numero_chequeReciboPuntoVenta","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ReciboPuntoVentaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosReciboPuntoVenta.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosReciboPuntoVenta,ReciboPuntoVentaConstantesFunciones.LABEL_FECHA));

		if(this.recibopuntoventaConstantesFunciones.mostrarfechaReciboPuntoVenta && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ReciboPuntoVentaConstantesFunciones.LABEL_FECHA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new DateRenderer(this.recibopuntoventaConstantesFunciones.resaltarfechaReciboPuntoVenta,this.recibopuntoventaConstantesFunciones.activarfechaReciboPuntoVenta,iSizeTabla,this,true,"fechaReciboPuntoVenta","BASICO"));
			tableColumn.setCellEditor(new DateEditorRenderer(this.recibopuntoventaConstantesFunciones.resaltarfechaReciboPuntoVenta,this.recibopuntoventaConstantesFunciones.activarfechaReciboPuntoVenta,this,true,"fechaReciboPuntoVenta","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30);
			//tableColumn.addPropertyChangeListener(new ReciboPuntoVentaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.recibopuntoventaSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.recibopuntoventaSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.recibopuntoventaSessionBean.getEsGuardarRelacionado(),iSizeTabla));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosReciboPuntoVenta.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.recibopuntoventaSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.recibopuntoventaSessionBean.getEsGuardarRelacionado(),iSizeTabla));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosReciboPuntoVenta.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarReciboPuntoVenta && this.isPermisoGuardarCambiosReciboPuntoVenta) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.recibopuntoventaSessionBean.getEsGuardarRelacionado(),iSizeTabla));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.recibopuntoventaSessionBean.getEsGuardarRelacionado(),iSizeTabla));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosReciboPuntoVenta.addColumn(tableColumn);
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
			
			this.jTableDatosReciboPuntoVenta.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarReciboPuntoVenta && this.isPermisoGuardarCambiosReciboPuntoVenta) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarReciboPuntoVenta && this.isPermisoGuardarCambiosReciboPuntoVenta) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosReciboPuntoVenta.moveColumn(this.jTableDatosReciboPuntoVenta.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosReciboPuntoVenta.moveColumn(this.jTableDatosReciboPuntoVenta.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosReciboPuntoVenta.moveColumn(this.jTableDatosReciboPuntoVenta.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosReciboPuntoVenta.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosReciboPuntoVenta.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosReciboPuntoVenta,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!ReciboPuntoVentaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosReciboPuntoVenta.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosReciboPuntoVenta.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!ReciboPuntoVentaJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!ReciboPuntoVentaJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosReciboPuntoVenta.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosReciboPuntoVenta.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosReciboPuntoVenta.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=recibopuntoventaLogic.getReciboPuntoVentas().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=recibopuntoventas.size()-1;
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
		//this.jTableDatosReciboPuntoVenta.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosReciboPuntoVenta.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosReciboPuntoVenta();
			
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
				
				//this.isEsNuevoReciboPuntoVenta=false;
					
				ReciboPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.recibopuntoventa,new Object(),this.recibopuntoventaParameterGeneral,this.recibopuntoventaReturnGeneral);
			
				if(this.recibopuntoventaSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormReciboPuntoVenta==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosReciboPuntoVenta.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosReciboPuntoVenta.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.recibopuntoventa =(ReciboPuntoVenta) this.recibopuntoventaLogic.getReciboPuntoVentas().toArray()[this.jTableDatosReciboPuntoVenta.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.recibopuntoventa =(ReciboPuntoVenta) this.recibopuntoventas.toArray()[this.jTableDatosReciboPuntoVenta.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.recibopuntoventa.getsType().equals("DUPLICADO")
				   || this.recibopuntoventa.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoReciboPuntoVenta=true;
				
				} else {
					this.isEsNuevoReciboPuntoVenta=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.recibopuntoventaSessionBean.getEsGuardarRelacionado()) {
					if(this.recibopuntoventa.getId()>=0 && !this.recibopuntoventa.getIsNew()) {						
						this.isEsNuevoReciboPuntoVenta=false;
						
					} else {
						this.isEsNuevoReciboPuntoVenta=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoReciboPuntoVenta(esRelaciones);						
				
				this.seleccionarReciboPuntoVenta(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.recibopuntoventa.getId()<0) {
					this.isEsNuevoReciboPuntoVenta=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarReciboPuntoVenta(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarReciboPuntoVenta(evt,rowIndex);
				}	
				
				if(this.recibopuntoventaSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion ReciboPuntoVenta: " + this.dDif); 
					}
				}								
				
				ReciboPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.recibopuntoventa,new Object(),this.recibopuntoventaParameterGeneral,this.recibopuntoventaReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarReciboPuntoVenta(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.recibopuntoventa)) {
					if(this.recibopuntoventa.getId()>0) {
						this.recibopuntoventa.setIsDeleted(true);
						
						this.recibopuntoventasEliminados.add(this.recibopuntoventa);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.recibopuntoventaLogic.getReciboPuntoVentas().remove(this.recibopuntoventa);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.recibopuntoventas.remove(this.recibopuntoventa);				
					}
					
					
					((ReciboPuntoVentaModel) this.jTableDatosReciboPuntoVenta.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaReciboPuntoVenta(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,ReciboPuntoVentaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarReciboPuntoVenta(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoReciboPuntoVenta) {
			
			if(this.jInternalFrameDetalleFormReciboPuntoVenta==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosReciboPuntoVenta.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosReciboPuntoVenta.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.recibopuntoventa =(ReciboPuntoVenta) this.recibopuntoventaLogic.getReciboPuntoVentas().toArray()[this.jTableDatosReciboPuntoVenta.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.recibopuntoventa =(ReciboPuntoVenta) this.recibopuntoventas.toArray()[this.jTableDatosReciboPuntoVenta.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(ReciboPuntoVentaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioReciboPuntoVenta(this.recibopuntoventa);
				}
				
				//ARCHITECTURE
				try {
					

					//Cliente
					if(!this.recibopuntoventaConstantesFunciones.cargarid_clienteReciboPuntoVenta || this.recibopuntoventaConstantesFunciones.event_dependid_clienteReciboPuntoVenta) {
						//this.cargarCombosClientesForeignKeyLista(" where id="+this.recibopuntoventa.getid_cliente());
									//this.inicializarActualizarBindingReciboPuntoVenta(false,false);
						this.clientesForeignKey=new ArrayList<Cliente>();

						if(recibopuntoventa.getCliente()!=null) {
							this.clientesForeignKey.add(recibopuntoventa.getCliente());
						}

						this.addItemDefectoCombosForeignKeyCliente();
						this.cargarCombosFrameClientesForeignKey("Todos");
					}
					this.setActualClienteForeignKey(this.recibopuntoventa.getid_cliente(),false,"Formulario");

					//Banco
					if(!this.recibopuntoventaConstantesFunciones.cargarid_bancoReciboPuntoVenta || this.recibopuntoventaConstantesFunciones.event_dependid_bancoReciboPuntoVenta) {
						//this.cargarCombosBancosForeignKeyLista(" where id="+this.recibopuntoventa.getid_banco());
									//this.inicializarActualizarBindingReciboPuntoVenta(false,false);
						this.bancosForeignKey=new ArrayList<Banco>();

						if(recibopuntoventa.getBanco()!=null) {
							this.bancosForeignKey.add(recibopuntoventa.getBanco());
						}

						this.addItemDefectoCombosForeignKeyBanco();
						this.cargarCombosFrameBancosForeignKey("Todos");
					}
					this.setActualBancoForeignKey(this.recibopuntoventa.getid_banco(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesReciboPuntoVenta("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesReciboPuntoVenta(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualReciboPuntoVenta() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ReciboPuntoVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoReciboPuntoVenta(ReciboPuntoVenta recibopuntoventa) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoReciboPuntoVenta(recibopuntoventa,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoReciboPuntoVenta(ReciboPuntoVenta recibopuntoventa,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioReciboPuntoVenta(recibopuntoventa);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyReciboPuntoVenta(recibopuntoventa,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyReciboPuntoVenta(recibopuntoventa);
	}
	
	public void setVariablesObjetoActualToFormularioReciboPuntoVenta(ReciboPuntoVenta recibopuntoventa) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormReciboPuntoVenta==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormReciboPuntoVenta.jLabelidReciboPuntoVenta.setText(recibopuntoventa.getId().toString());
			this.jInternalFrameDetalleFormReciboPuntoVenta.jTextFieldvalor_efectivoReciboPuntoVenta.setText(recibopuntoventa.getvalor_efectivo().toString());
			this.jInternalFrameDetalleFormReciboPuntoVenta.jTextFieldvalor_chequeReciboPuntoVenta.setText(recibopuntoventa.getvalor_cheque().toString());
			this.jInternalFrameDetalleFormReciboPuntoVenta.jTextFieldnumero_chequeReciboPuntoVenta.setText(recibopuntoventa.getnumero_cheque());
			this.jInternalFrameDetalleFormReciboPuntoVenta.jDateChooserfechaReciboPuntoVenta.setDate(recibopuntoventa.getfecha());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ReciboPuntoVentaConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,ReciboPuntoVenta recibopuntoventaLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,recibopuntoventaLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,ReciboPuntoVenta recibopuntoventaLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				recibopuntoventaLocal=this.recibopuntoventa;
			} else {
				recibopuntoventaLocal=this.recibopuntoventaAnterior;
			}
		}
		
		if(this.permiteMantenimiento(recibopuntoventaLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoReciboPuntoVenta(recibopuntoventaLocal,true);
					
					if(recibopuntoventaSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(recibopuntoventaLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.recibopuntoventaSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(recibopuntoventaLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoReciboPuntoVenta(ReciboPuntoVenta recibopuntoventa,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualReciboPuntoVenta(recibopuntoventa,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysReciboPuntoVenta(recibopuntoventa);
	}
	
	public void setVariablesFormularioToObjetoActualReciboPuntoVenta(ReciboPuntoVenta recibopuntoventa,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualReciboPuntoVenta(recibopuntoventa,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualReciboPuntoVenta(ReciboPuntoVenta recibopuntoventa,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormReciboPuntoVenta==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormReciboPuntoVenta.jLabelidReciboPuntoVenta.getText()==null || this.jInternalFrameDetalleFormReciboPuntoVenta.jLabelidReciboPuntoVenta.getText()=="" || this.jInternalFrameDetalleFormReciboPuntoVenta.jLabelidReciboPuntoVenta.getText()=="Id") {
				this.jInternalFrameDetalleFormReciboPuntoVenta.jLabelidReciboPuntoVenta.setText("0");
			}

			if(conColumnasBase) {recibopuntoventa.setId(Long.parseLong(this.jInternalFrameDetalleFormReciboPuntoVenta.jLabelidReciboPuntoVenta.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ReciboPuntoVentaConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormReciboPuntoVenta.jLabelIdReciboPuntoVenta,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			recibopuntoventa.setvalor_efectivo(Double.parseDouble(this.jInternalFrameDetalleFormReciboPuntoVenta.jTextFieldvalor_efectivoReciboPuntoVenta.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ReciboPuntoVentaConstantesFunciones.LABEL_VALOREFECTIVO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormReciboPuntoVenta.jLabelvalor_efectivoReciboPuntoVenta,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			recibopuntoventa.setvalor_cheque(Double.parseDouble(this.jInternalFrameDetalleFormReciboPuntoVenta.jTextFieldvalor_chequeReciboPuntoVenta.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ReciboPuntoVentaConstantesFunciones.LABEL_VALORCHEQUE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormReciboPuntoVenta.jLabelvalor_chequeReciboPuntoVenta,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			recibopuntoventa.setnumero_cheque(this.jInternalFrameDetalleFormReciboPuntoVenta.jTextFieldnumero_chequeReciboPuntoVenta.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ReciboPuntoVentaConstantesFunciones.LABEL_NUMEROCHEQUE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormReciboPuntoVenta.jLabelnumero_chequeReciboPuntoVenta,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			recibopuntoventa.setfecha(this.jInternalFrameDetalleFormReciboPuntoVenta.jDateChooserfechaReciboPuntoVenta.getDate());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ReciboPuntoVentaConstantesFunciones.LABEL_FECHA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormReciboPuntoVenta.jLabelfechaReciboPuntoVenta,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ReciboPuntoVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualReciboPuntoVenta(ReciboPuntoVenta recibopuntoventaBean,ReciboPuntoVenta recibopuntoventa,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conDefault || (!conDefault && recibopuntoventaBean.getid_cliente()!=null && !recibopuntoventaBean.getid_cliente().equals(-1L))) {recibopuntoventa.setid_cliente(recibopuntoventaBean.getid_cliente());}
			if(conDefault || (!conDefault && recibopuntoventaBean.getid_banco()!=null && !recibopuntoventaBean.getid_banco().equals(-1L))) {recibopuntoventa.setid_banco(recibopuntoventaBean.getid_banco());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ReciboPuntoVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosReciboPuntoVenta(ReciboPuntoVenta recibopuntoventaOrigen,ReciboPuntoVenta recibopuntoventa,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && recibopuntoventaOrigen.getId()!=null && !recibopuntoventaOrigen.getId().equals(0L))) {recibopuntoventa.setId(recibopuntoventaOrigen.getId());}}
			if(conDefault || (!conDefault && recibopuntoventaOrigen.getid_cliente()!=null && !recibopuntoventaOrigen.getid_cliente().equals(-1L))) {recibopuntoventa.setid_cliente(recibopuntoventaOrigen.getid_cliente());}
			if(conDefault || (!conDefault && recibopuntoventaOrigen.getid_banco()!=null && !recibopuntoventaOrigen.getid_banco().equals(-1L))) {recibopuntoventa.setid_banco(recibopuntoventaOrigen.getid_banco());}
			if(conDefault || (!conDefault && recibopuntoventaOrigen.getvalor_efectivo()!=null && !recibopuntoventaOrigen.getvalor_efectivo().equals(0.0))) {recibopuntoventa.setvalor_efectivo(recibopuntoventaOrigen.getvalor_efectivo());}
			if(conDefault || (!conDefault && recibopuntoventaOrigen.getvalor_cheque()!=null && !recibopuntoventaOrigen.getvalor_cheque().equals(0.0))) {recibopuntoventa.setvalor_cheque(recibopuntoventaOrigen.getvalor_cheque());}
			if(conDefault || (!conDefault && recibopuntoventaOrigen.getnumero_cheque()!=null && !recibopuntoventaOrigen.getnumero_cheque().equals(""))) {recibopuntoventa.setnumero_cheque(recibopuntoventaOrigen.getnumero_cheque());}
			if(conDefault || (!conDefault && recibopuntoventaOrigen.getfecha()!=null && !recibopuntoventaOrigen.getfecha().equals(new Date()))) {recibopuntoventa.setfecha(recibopuntoventaOrigen.getfecha());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ReciboPuntoVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioReciboPuntoVenta(ReciboPuntoVenta recibopuntoventa) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormReciboPuntoVenta.jLabelidReciboPuntoVenta.setText(recibopuntoventa.getId().toString());
			this.jInternalFrameDetalleFormReciboPuntoVenta.jTextFieldvalor_efectivoReciboPuntoVenta.setText(recibopuntoventa.getvalor_efectivo().toString());
			this.jInternalFrameDetalleFormReciboPuntoVenta.jTextFieldvalor_chequeReciboPuntoVenta.setText(recibopuntoventa.getvalor_cheque().toString());
			this.jInternalFrameDetalleFormReciboPuntoVenta.jTextFieldnumero_chequeReciboPuntoVenta.setText(recibopuntoventa.getnumero_cheque());
			this.jInternalFrameDetalleFormReciboPuntoVenta.jDateChooserfechaReciboPuntoVenta.setDate(recibopuntoventa.getfecha());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ReciboPuntoVentaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioReciboPuntoVenta(ReciboPuntoVentaBean recibopuntoventaBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormReciboPuntoVenta.jLabelidReciboPuntoVenta.setText(recibopuntoventaBean.getId().toString());
			this.jInternalFrameDetalleFormReciboPuntoVenta.jTextFieldvalor_efectivoReciboPuntoVenta.setText(recibopuntoventaBean.getvalor_efectivo().toString());
			this.jInternalFrameDetalleFormReciboPuntoVenta.jTextFieldvalor_chequeReciboPuntoVenta.setText(recibopuntoventaBean.getvalor_cheque().toString());
			this.jInternalFrameDetalleFormReciboPuntoVenta.jTextFieldnumero_chequeReciboPuntoVenta.setText(recibopuntoventaBean.getnumero_cheque());
			this.jInternalFrameDetalleFormReciboPuntoVenta.jDateChooserfechaReciboPuntoVenta.setDate(recibopuntoventaBean.getfecha());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ReciboPuntoVentaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanReciboPuntoVenta(ReciboPuntoVentaParameterReturnGeneral recibopuntoventaReturnGeneral,ReciboPuntoVentaBean recibopuntoventaBean,Boolean conDefault) throws Exception { 
		try {
			ReciboPuntoVenta recibopuntoventaLocal=new ReciboPuntoVenta();
			
			recibopuntoventaLocal=recibopuntoventaReturnGeneral.getReciboPuntoVenta();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && recibopuntoventaLocal.getId()!=null && !recibopuntoventaLocal.getId().equals(0L))) {recibopuntoventaBean.setId(recibopuntoventaLocal.getId());}}
			if(conDefault || (!conDefault && recibopuntoventaLocal.getid_cliente()!=null && !recibopuntoventaLocal.getid_cliente().equals(-1L))) {recibopuntoventaBean.setid_cliente(recibopuntoventaLocal.getid_cliente());}
			if(conDefault || (!conDefault && recibopuntoventaLocal.getid_banco()!=null && !recibopuntoventaLocal.getid_banco().equals(-1L))) {recibopuntoventaBean.setid_banco(recibopuntoventaLocal.getid_banco());}
			if(conDefault || (!conDefault && recibopuntoventaLocal.getvalor_efectivo()!=null && !recibopuntoventaLocal.getvalor_efectivo().equals(0.0))) {recibopuntoventaBean.setvalor_efectivo(recibopuntoventaLocal.getvalor_efectivo());}
			if(conDefault || (!conDefault && recibopuntoventaLocal.getvalor_cheque()!=null && !recibopuntoventaLocal.getvalor_cheque().equals(0.0))) {recibopuntoventaBean.setvalor_cheque(recibopuntoventaLocal.getvalor_cheque());}
			if(conDefault || (!conDefault && recibopuntoventaLocal.getnumero_cheque()!=null && !recibopuntoventaLocal.getnumero_cheque().equals(""))) {recibopuntoventaBean.setnumero_cheque(recibopuntoventaLocal.getnumero_cheque());}
			if(conDefault || (!conDefault && recibopuntoventaLocal.getfecha()!=null && !recibopuntoventaLocal.getfecha().equals(new Date()))) {recibopuntoventaBean.setfecha(recibopuntoventaLocal.getfecha());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ReciboPuntoVentaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxReciboPuntoVentaGenerico(Long idReciboPuntoVentaSeleccionado,JComboBox jComboBoxReciboPuntoVenta,List<ReciboPuntoVenta> recibopuntoventasLocal)throws Exception {
		try {
			ReciboPuntoVenta  recibopuntoventaTemp=null;

			for(ReciboPuntoVenta recibopuntoventaAux:recibopuntoventasLocal) {
				if(recibopuntoventaAux.getId()!=null && recibopuntoventaAux.getId().equals(idReciboPuntoVentaSeleccionado)) {
					recibopuntoventaTemp=recibopuntoventaAux;
					break;
				}
			}

			jComboBoxReciboPuntoVenta.setSelectedItem(recibopuntoventaTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxReciboPuntoVentaGenerico(JComboBox jComboBoxReciboPuntoVenta,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxReciboPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxReciboPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxReciboPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxReciboPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxReciboPuntoVenta.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxReciboPuntoVenta.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxReciboPuntoVenta.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxReciboPuntoVenta.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxReciboPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxReciboPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,ReciboPuntoVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			recibopuntoventa=(ReciboPuntoVenta) recibopuntoventaLogic.getReciboPuntoVentas().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			recibopuntoventa =(ReciboPuntoVenta) recibopuntoventas.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Cliente")) {
			//sDescripcion=this.getActualClienteForeignKeyDescripcion((Long)value);
			if(!recibopuntoventa.getIsNew() && !recibopuntoventa.getIsChanged() && !recibopuntoventa.getIsDeleted()) {
				sDescripcion=recibopuntoventa.getcliente_descripcion();
			} else {
				//sDescripcion=this.getActualClienteForeignKeyDescripcion((Long)value);
				sDescripcion=recibopuntoventa.getcliente_descripcion();
			}
		}

		if(sTipo.equals("Banco")) {
			//sDescripcion=this.getActualBancoForeignKeyDescripcion((Long)value);
			if(!recibopuntoventa.getIsNew() && !recibopuntoventa.getIsChanged() && !recibopuntoventa.getIsDeleted()) {
				sDescripcion=recibopuntoventa.getbanco_descripcion();
			} else {
				//sDescripcion=this.getActualBancoForeignKeyDescripcion((Long)value);
				sDescripcion=recibopuntoventa.getbanco_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		ReciboPuntoVenta recibopuntoventaRow=new ReciboPuntoVenta();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			recibopuntoventaRow=(ReciboPuntoVenta) recibopuntoventaLogic.getReciboPuntoVentas().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			recibopuntoventaRow=(ReciboPuntoVenta) recibopuntoventas.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualReciboPuntoVenta(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoReciboPuntoVenta.setVisible((this.isVisibilidadCeldaNuevoReciboPuntoVenta && this.isPermisoNuevoReciboPuntoVenta));			
			this.jButtonDuplicarReciboPuntoVenta.setVisible((this.isVisibilidadCeldaDuplicarReciboPuntoVenta && this.isPermisoDuplicarReciboPuntoVenta));			
			this.jButtonCopiarReciboPuntoVenta.setVisible((this.isVisibilidadCeldaCopiarReciboPuntoVenta && this.isPermisoCopiarReciboPuntoVenta));
			this.jButtonVerFormReciboPuntoVenta.setVisible((this.isVisibilidadCeldaVerFormReciboPuntoVenta && this.isPermisoVerFormReciboPuntoVenta));
			
			this.jButtonAbrirOrderByReciboPuntoVenta.setVisible((this.isVisibilidadCeldaOrdenReciboPuntoVenta && this.isPermisoOrdenReciboPuntoVenta));			
			
			this.jButtonNuevoRelacionesReciboPuntoVenta.setVisible((this.isVisibilidadCeldaNuevoRelacionesReciboPuntoVenta && this.isPermisoNuevoReciboPuntoVenta));			
			this.jButtonNuevoGuardarCambiosReciboPuntoVenta.setVisible((this.isVisibilidadCeldaNuevoReciboPuntoVenta && this.isPermisoNuevoReciboPuntoVenta && this.isPermisoGuardarCambiosReciboPuntoVenta));
			
			if(this.jInternalFrameDetalleFormReciboPuntoVenta!=null) {
			this.jInternalFrameDetalleFormReciboPuntoVenta.jButtonModificarReciboPuntoVenta.setVisible((this.isVisibilidadCeldaModificarReciboPuntoVenta && this.isPermisoActualizarReciboPuntoVenta));	
			this.jInternalFrameDetalleFormReciboPuntoVenta.jButtonActualizarReciboPuntoVenta.setVisible((this.isVisibilidadCeldaActualizarReciboPuntoVenta && this.isPermisoActualizarReciboPuntoVenta));	
			this.jInternalFrameDetalleFormReciboPuntoVenta.jButtonEliminarReciboPuntoVenta.setVisible((this.isVisibilidadCeldaEliminarReciboPuntoVenta && this.isPermisoEliminarReciboPuntoVenta));
			this.jInternalFrameDetalleFormReciboPuntoVenta.jButtonCancelarReciboPuntoVenta.setVisible(this.isVisibilidadCeldaCancelarReciboPuntoVenta);							
			this.jInternalFrameDetalleFormReciboPuntoVenta.jButtonGuardarCambiosReciboPuntoVenta.setVisible((this.isVisibilidadCeldaGuardarReciboPuntoVenta && this.isPermisoGuardarCambiosReciboPuntoVenta));			
			
			}
						
			this.jButtonGuardarCambiosTablaReciboPuntoVenta.setVisible((this.isVisibilidadCeldaGuardarCambiosReciboPuntoVenta && this.isPermisoGuardarCambiosReciboPuntoVenta));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarReciboPuntoVenta.setVisible((this.isVisibilidadCeldaNuevoReciboPuntoVenta && this.isPermisoNuevoReciboPuntoVenta));						
			this.jButtonDuplicarToolBarReciboPuntoVenta.setVisible((this.isVisibilidadCeldaDuplicarReciboPuntoVenta && this.isPermisoDuplicarReciboPuntoVenta));						
			this.jButtonCopiarToolBarReciboPuntoVenta.setVisible((this.isVisibilidadCeldaCopiarReciboPuntoVenta && this.isPermisoCopiarReciboPuntoVenta));			
			this.jButtonVerFormToolBarReciboPuntoVenta.setVisible((this.isVisibilidadCeldaVerFormReciboPuntoVenta && this.isPermisoVerFormReciboPuntoVenta));			
			this.jButtonAbrirOrderByToolBarReciboPuntoVenta.setVisible((this.isVisibilidadCeldaOrdenReciboPuntoVenta && this.isPermisoOrdenReciboPuntoVenta));
			this.jButtonNuevoRelacionesToolBarReciboPuntoVenta.setVisible((this.isVisibilidadCeldaNuevoRelacionesReciboPuntoVenta && this.isPermisoNuevoReciboPuntoVenta));			
			this.jButtonNuevoGuardarCambiosToolBarReciboPuntoVenta.setVisible((this.isVisibilidadCeldaNuevoReciboPuntoVenta && this.isPermisoNuevoReciboPuntoVenta && this.isPermisoGuardarCambiosReciboPuntoVenta));			
			
			if(this.jInternalFrameDetalleFormReciboPuntoVenta!=null) {
			this.jInternalFrameDetalleFormReciboPuntoVenta.jButtonModificarToolBarReciboPuntoVenta.setVisible((this.isVisibilidadCeldaModificarReciboPuntoVenta && this.isPermisoActualizarReciboPuntoVenta));	
			this.jInternalFrameDetalleFormReciboPuntoVenta.jButtonActualizarToolBarReciboPuntoVenta.setVisible((this.isVisibilidadCeldaActualizarReciboPuntoVenta  && this.isPermisoActualizarReciboPuntoVenta));	
			this.jInternalFrameDetalleFormReciboPuntoVenta.jButtonEliminarToolBarReciboPuntoVenta.setVisible((this.isVisibilidadCeldaEliminarReciboPuntoVenta && this.isPermisoEliminarReciboPuntoVenta));
			this.jInternalFrameDetalleFormReciboPuntoVenta.jButtonCancelarToolBarReciboPuntoVenta.setVisible(this.isVisibilidadCeldaCancelarReciboPuntoVenta);				
			this.jInternalFrameDetalleFormReciboPuntoVenta.jButtonGuardarCambiosToolBarReciboPuntoVenta.setVisible((this.isVisibilidadCeldaGuardarReciboPuntoVenta && this.isPermisoGuardarCambiosReciboPuntoVenta));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarReciboPuntoVenta.setVisible((this.isVisibilidadCeldaGuardarCambiosReciboPuntoVenta && this.isPermisoGuardarCambiosReciboPuntoVenta));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoReciboPuntoVenta.setVisible((this.isVisibilidadCeldaNuevoReciboPuntoVenta && this.isPermisoNuevoReciboPuntoVenta));			
			this.jMenuItemDuplicarReciboPuntoVenta.setVisible((this.isVisibilidadCeldaDuplicarReciboPuntoVenta && this.isPermisoDuplicarReciboPuntoVenta));			
			this.jMenuItemCopiarReciboPuntoVenta.setVisible((this.isVisibilidadCeldaCopiarReciboPuntoVenta && this.isPermisoCopiarReciboPuntoVenta));			
			this.jMenuItemVerFormReciboPuntoVenta.setVisible((this.isVisibilidadCeldaVerFormReciboPuntoVenta && this.isPermisoVerFormReciboPuntoVenta));			
			this.jMenuItemAbrirOrderByReciboPuntoVenta.setVisible((this.isVisibilidadCeldaOrdenReciboPuntoVenta && this.isPermisoOrdenReciboPuntoVenta));			
			//this.jMenuItemMostrarOcultarReciboPuntoVenta.setVisible((this.isVisibilidadCeldaOrdenReciboPuntoVenta && this.isPermisoOrdenReciboPuntoVenta));
			this.jMenuItemDetalleAbrirOrderByReciboPuntoVenta.setVisible((this.isVisibilidadCeldaOrdenReciboPuntoVenta && this.isPermisoOrdenReciboPuntoVenta));			
			//this.jMenuItemDetalleMostrarOcultarReciboPuntoVenta.setVisible((this.isVisibilidadCeldaOrdenReciboPuntoVenta && this.isPermisoOrdenReciboPuntoVenta));			
			this.jMenuItemNuevoRelacionesReciboPuntoVenta.setVisible((this.isVisibilidadCeldaNuevoRelacionesReciboPuntoVenta && this.isPermisoNuevoReciboPuntoVenta));			
			this.jMenuItemNuevoGuardarCambiosReciboPuntoVenta.setVisible((this.isVisibilidadCeldaNuevoReciboPuntoVenta && this.isPermisoNuevoReciboPuntoVenta && this.isPermisoGuardarCambiosReciboPuntoVenta));									
			
			if(this.jInternalFrameDetalleFormReciboPuntoVenta!=null) {
			this.jInternalFrameDetalleFormReciboPuntoVenta.jMenuItemModificarReciboPuntoVenta.setVisible((this.isVisibilidadCeldaModificarReciboPuntoVenta && this.isPermisoActualizarReciboPuntoVenta));	
			this.jInternalFrameDetalleFormReciboPuntoVenta.jMenuItemActualizarReciboPuntoVenta.setVisible((this.isVisibilidadCeldaActualizarReciboPuntoVenta && this.isPermisoActualizarReciboPuntoVenta));	
			this.jInternalFrameDetalleFormReciboPuntoVenta.jMenuItemEliminarReciboPuntoVenta.setVisible((this.isVisibilidadCeldaEliminarReciboPuntoVenta && this.isPermisoEliminarReciboPuntoVenta));
			this.jInternalFrameDetalleFormReciboPuntoVenta.jMenuItemCancelarReciboPuntoVenta.setVisible(this.isVisibilidadCeldaCancelarReciboPuntoVenta);				
			}
			
			this.jMenuItemGuardarCambiosReciboPuntoVenta.setVisible((this.isVisibilidadCeldaGuardarReciboPuntoVenta && this.isPermisoGuardarCambiosReciboPuntoVenta));						
			this.jMenuItemGuardarCambiosTablaReciboPuntoVenta.setVisible((this.isVisibilidadCeldaGuardarCambiosReciboPuntoVenta && this.isPermisoGuardarCambiosReciboPuntoVenta));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoReciboPuntoVenta=this.jButtonNuevoReciboPuntoVenta.isVisible();
			this.isVisibilidadCeldaDuplicarReciboPuntoVenta=this.jButtonDuplicarReciboPuntoVenta.isVisible();
			this.isVisibilidadCeldaCopiarReciboPuntoVenta=this.jButtonCopiarReciboPuntoVenta.isVisible();
			this.isVisibilidadCeldaVerFormReciboPuntoVenta=this.jButtonVerFormReciboPuntoVenta.isVisible();
			
			this.isVisibilidadCeldaOrdenReciboPuntoVenta=this.jButtonAbrirOrderByReciboPuntoVenta.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesReciboPuntoVenta=this.jButtonNuevoRelacionesReciboPuntoVenta.isVisible();
			this.isVisibilidadCeldaModificarReciboPuntoVenta=this.jButtonModificarReciboPuntoVenta.isVisible();
			
			if(this.jInternalFrameDetalleFormReciboPuntoVenta!=null) {
			this.isVisibilidadCeldaActualizarReciboPuntoVenta=this.jInternalFrameDetalleFormReciboPuntoVenta.jButtonActualizarReciboPuntoVenta.isVisible();
			this.isVisibilidadCeldaEliminarReciboPuntoVenta=this.jInternalFrameDetalleFormReciboPuntoVenta.jButtonEliminarReciboPuntoVenta.isVisible();
			this.isVisibilidadCeldaCancelarReciboPuntoVenta=this.jInternalFrameDetalleFormReciboPuntoVenta.jButtonCancelarReciboPuntoVenta.isVisible();
			this.isVisibilidadCeldaGuardarReciboPuntoVenta=this.jInternalFrameDetalleFormReciboPuntoVenta.jButtonGuardarCambiosReciboPuntoVenta.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosReciboPuntoVenta=this.jButtonGuardarCambiosTablaReciboPuntoVenta.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoReciboPuntoVenta=this.jButtonNuevoToolBarReciboPuntoVenta.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesReciboPuntoVenta=this.jButtonNuevoRelacionesToolBarReciboPuntoVenta.isVisible();
			
			if(this.jInternalFrameDetalleFormReciboPuntoVenta!=null) {
			this.isVisibilidadCeldaModificarReciboPuntoVenta=this.jInternalFrameDetalleFormReciboPuntoVenta.jButtonModificarToolBarReciboPuntoVenta.isVisible();
			this.isVisibilidadCeldaActualizarReciboPuntoVenta=this.jInternalFrameDetalleFormReciboPuntoVenta.jButtonActualizarToolBarReciboPuntoVenta.isVisible();
			this.isVisibilidadCeldaEliminarReciboPuntoVenta=this.jInternalFrameDetalleFormReciboPuntoVenta.jButtonEliminarToolBarReciboPuntoVenta.isVisible();
			this.isVisibilidadCeldaCancelarReciboPuntoVenta=this.jInternalFrameDetalleFormReciboPuntoVenta.jButtonCancelarToolBarReciboPuntoVenta.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarReciboPuntoVenta=this.jButtonGuardarCambiosToolBarReciboPuntoVenta.isVisible();
			this.isVisibilidadCeldaGuardarCambiosReciboPuntoVenta=this.jButtonGuardarCambiosTablaToolBarReciboPuntoVenta.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoReciboPuntoVenta=this.jMenuItemNuevoReciboPuntoVenta.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesReciboPuntoVenta=this.jMenuItemNuevoRelacionesReciboPuntoVenta.isVisible();
			
			if(this.jInternalFrameDetalleFormReciboPuntoVenta!=null) {
			this.isVisibilidadCeldaModificarReciboPuntoVenta=this.jInternalFrameDetalleFormReciboPuntoVenta.jMenuItemModificarReciboPuntoVenta.isVisible();
			this.isVisibilidadCeldaActualizarReciboPuntoVenta=this.jInternalFrameDetalleFormReciboPuntoVenta.jMenuItemActualizarReciboPuntoVenta.isVisible();
			this.isVisibilidadCeldaEliminarReciboPuntoVenta=this.jInternalFrameDetalleFormReciboPuntoVenta.jMenuItemEliminarReciboPuntoVenta.isVisible();
			this.isVisibilidadCeldaCancelarReciboPuntoVenta=this.jInternalFrameDetalleFormReciboPuntoVenta.jMenuItemCancelarReciboPuntoVenta.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarReciboPuntoVenta=this.jMenuItemGuardarCambiosReciboPuntoVenta.isVisible();
			this.isVisibilidadCeldaGuardarCambiosReciboPuntoVenta=this.jMenuItemGuardarCambiosTablaReciboPuntoVenta.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesReciboPuntoVenta(Boolean esInicializar) {
		if(ReciboPuntoVentaJInternalFrame.ISBINDING_MANUAL) {			
			if(this.recibopuntoventaSessionBean.getConGuardarRelaciones()) {
				//if(this.recibopuntoventaSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesReciboPuntoVenta();
			}
			
			this.inicializarActualizarBindingBotonesManualReciboPuntoVenta(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualReciboPuntoVenta() {
		this.jButtonNuevoReciboPuntoVenta.setVisible(this.isPermisoNuevoReciboPuntoVenta);			
		this.jButtonDuplicarReciboPuntoVenta.setVisible(this.isPermisoDuplicarReciboPuntoVenta);			
		this.jButtonCopiarReciboPuntoVenta.setVisible(this.isPermisoCopiarReciboPuntoVenta);			
		this.jButtonVerFormReciboPuntoVenta.setVisible(this.isPermisoVerFormReciboPuntoVenta);			
		
		this.jButtonAbrirOrderByReciboPuntoVenta.setVisible(this.isPermisoOrdenReciboPuntoVenta);					
		
		this.jButtonNuevoRelacionesReciboPuntoVenta.setVisible(this.isPermisoNuevoReciboPuntoVenta);			
		
		if(this.jInternalFrameDetalleFormReciboPuntoVenta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormReciboPuntoVenta.jButtonModificarReciboPuntoVenta.setVisible(this.isPermisoActualizarReciboPuntoVenta);	
			this.jInternalFrameDetalleFormReciboPuntoVenta.jButtonActualizarReciboPuntoVenta.setVisible(this.isPermisoActualizarReciboPuntoVenta);	
			this.jInternalFrameDetalleFormReciboPuntoVenta.jButtonEliminarReciboPuntoVenta.setVisible(this.isPermisoEliminarReciboPuntoVenta);
			this.jInternalFrameDetalleFormReciboPuntoVenta.jButtonCancelarReciboPuntoVenta.setVisible(this.isVisibilidadCeldaCancelarReciboPuntoVenta);						
			this.jInternalFrameDetalleFormReciboPuntoVenta.jButtonGuardarCambiosReciboPuntoVenta.setVisible(this.isPermisoGuardarCambiosReciboPuntoVenta);							
		}
		
		this.jButtonGuardarCambiosTablaReciboPuntoVenta.setVisible(this.isPermisoActualizarReciboPuntoVenta);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleReciboPuntoVenta() {
		this.jInternalFrameDetalleFormReciboPuntoVenta.jButtonModificarReciboPuntoVenta.setVisible(this.isPermisoActualizarReciboPuntoVenta);	
		this.jInternalFrameDetalleFormReciboPuntoVenta.jButtonActualizarReciboPuntoVenta.setVisible(this.isPermisoActualizarReciboPuntoVenta);	
		this.jInternalFrameDetalleFormReciboPuntoVenta.jButtonEliminarReciboPuntoVenta.setVisible(this.isPermisoEliminarReciboPuntoVenta);
		this.jInternalFrameDetalleFormReciboPuntoVenta.jButtonCancelarReciboPuntoVenta.setVisible(this.isVisibilidadCeldaCancelarReciboPuntoVenta);							
		this.jInternalFrameDetalleFormReciboPuntoVenta.jButtonGuardarCambiosReciboPuntoVenta.setVisible((this.isVisibilidadCeldaGuardarReciboPuntoVenta && this.isPermisoGuardarCambiosReciboPuntoVenta));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosReciboPuntoVenta() {
		if(ReciboPuntoVentaJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualReciboPuntoVenta();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesReciboPuntoVenta() {
	}
	
	public void jTableDatosReciboPuntoVentaListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarReciboPuntoVenta(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ReciboPuntoVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidReciboPuntoVentaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.recibopuntoventaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosReciboPuntoVenta.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualReciboPuntoVenta(this.getrecibopuntoventa(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysReciboPuntoVenta(this.recibopuntoventa);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.recibopuntoventa =(ReciboPuntoVenta) this.recibopuntoventaLogic.getReciboPuntoVentas().toArray()[this.jTableDatosReciboPuntoVenta.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.recibopuntoventa =(ReciboPuntoVenta) this.recibopuntoventas.toArray()[this.jTableDatosReciboPuntoVenta.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.recibopuntoventa==null) {
						this.recibopuntoventa = new ReciboPuntoVenta();
					}

					this.setVariablesFormularioToObjetoActualReciboPuntoVenta(this.recibopuntoventa,true);
					this.setVariablesFormularioToObjetoActualForeignKeysReciboPuntoVenta(this.recibopuntoventa);
				}

				if(this.recibopuntoventa.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.recibopuntoventa.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingReciboPuntoVenta(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.recibopuntoventaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.recibopuntoventaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ReciboPuntoVentaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.recibopuntoventaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_clienteReciboPuntoVentaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
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


			TitledBorder titledBorderReciboPuntoVenta=null;
			TitledBorder titledBordercliente=null;

			if(!this.jScrollPanelDatosReciboPuntoVenta.getBorder().getClass().equals(EmptyBorder.class)) {
				titledBorderReciboPuntoVenta=(TitledBorder)this.jScrollPanelDatosReciboPuntoVenta.getBorder();
				titledBordercliente=(TitledBorder)this.clienteBeanSwingJInternalFrame.jScrollPanelDatosCliente.getBorder();

				titledBordercliente.setTitle(titledBorderReciboPuntoVenta.getTitle() + " -> Cliente");
			}

			if(!Constantes.CON_VARIAS_VENTANAS) {
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
			}

			this.jDesktopPane.add(jinternalFrame);

			jinternalFrame.setSelected(true);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ReciboPuntoVentaConstantesFunciones.CLASSNAME);
		}
	}

	public void jButtonid_clienteReciboPuntoVentaUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.recibopuntoventaLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisocliente=true;

			idTienePermisocliente=this.tienePermisosUsuarioEnPaginaWebReciboPuntoVenta(ClienteConstantesFunciones.CLASSNAME);

			if(idTienePermisocliente) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosReciboPuntoVenta.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosReciboPuntoVenta.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosReciboPuntoVenta.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.recibopuntoventa =(ReciboPuntoVenta) this.recibopuntoventaLogic.getReciboPuntoVentas().toArray()[this.jTableDatosReciboPuntoVenta.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.recibopuntoventa =(ReciboPuntoVenta) this.recibopuntoventas.toArray()[this.jTableDatosReciboPuntoVenta.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualReciboPuntoVenta(this.getrecibopuntoventa(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysReciboPuntoVenta(this.recibopuntoventa);

				this.clienteBeanSwingJInternalFrame=new ClienteBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.clienteBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.clienteBeanSwingJInternalFrame.getClienteLogic().setConnexion(this.recibopuntoventaLogic.getConnexion());

				if(this.recibopuntoventa.getid_cliente()!=null) {
					this.clienteBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.clienteBeanSwingJInternalFrame.setIdActual(this.recibopuntoventa.getid_cliente());
					this.clienteBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.clienteBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.clienteBeanSwingJInternalFrame.inicializarActualizarBindingTablaCliente();
				}

				JInternalFrameBase jinternalFrame =this.clienteBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderReciboPuntoVenta=(TitledBorder)this.jScrollPanelDatosReciboPuntoVenta.getBorder();
				TitledBorder titledBordercliente=(TitledBorder)this.clienteBeanSwingJInternalFrame.jScrollPanelDatosCliente.getBorder();

				titledBordercliente.setTitle(titledBorderReciboPuntoVenta.getTitle() + " -> Cliente");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.recibopuntoventaLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.recibopuntoventaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ReciboPuntoVentaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.recibopuntoventaLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_clienteReciboPuntoVentaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.recibopuntoventaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosReciboPuntoVenta.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualReciboPuntoVenta(this.getrecibopuntoventa(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysReciboPuntoVenta(this.recibopuntoventa);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.recibopuntoventa =(ReciboPuntoVenta) this.recibopuntoventaLogic.getReciboPuntoVentas().toArray()[this.jTableDatosReciboPuntoVenta.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.recibopuntoventa =(ReciboPuntoVenta) this.recibopuntoventas.toArray()[this.jTableDatosReciboPuntoVenta.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.recibopuntoventa==null) {
						this.recibopuntoventa = new ReciboPuntoVenta();
					}

					this.setVariablesFormularioToObjetoActualReciboPuntoVenta(this.recibopuntoventa,true);
					this.setVariablesFormularioToObjetoActualForeignKeysReciboPuntoVenta(this.recibopuntoventa);
				}

				if(this.recibopuntoventa.getid_cliente()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_cliente = "+this.recibopuntoventa.getid_cliente().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingReciboPuntoVenta(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.recibopuntoventaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.recibopuntoventaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ReciboPuntoVentaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.recibopuntoventaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_bancoReciboPuntoVentaUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.recibopuntoventaLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisobanco=true;

			idTienePermisobanco=this.tienePermisosUsuarioEnPaginaWebReciboPuntoVenta(BancoConstantesFunciones.CLASSNAME);

			if(idTienePermisobanco) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosReciboPuntoVenta.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosReciboPuntoVenta.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosReciboPuntoVenta.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.recibopuntoventa =(ReciboPuntoVenta) this.recibopuntoventaLogic.getReciboPuntoVentas().toArray()[this.jTableDatosReciboPuntoVenta.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.recibopuntoventa =(ReciboPuntoVenta) this.recibopuntoventas.toArray()[this.jTableDatosReciboPuntoVenta.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualReciboPuntoVenta(this.getrecibopuntoventa(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysReciboPuntoVenta(this.recibopuntoventa);

				this.bancoBeanSwingJInternalFrame=new BancoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.bancoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.bancoBeanSwingJInternalFrame.getBancoLogic().setConnexion(this.recibopuntoventaLogic.getConnexion());

				if(this.recibopuntoventa.getid_banco()!=null) {
					this.bancoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.bancoBeanSwingJInternalFrame.setIdActual(this.recibopuntoventa.getid_banco());
					this.bancoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.bancoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.bancoBeanSwingJInternalFrame.inicializarActualizarBindingTablaBanco();
				}

				JInternalFrameBase jinternalFrame =this.bancoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderReciboPuntoVenta=(TitledBorder)this.jScrollPanelDatosReciboPuntoVenta.getBorder();
				TitledBorder titledBorderbanco=(TitledBorder)this.bancoBeanSwingJInternalFrame.jScrollPanelDatosBanco.getBorder();

				titledBorderbanco.setTitle(titledBorderReciboPuntoVenta.getTitle() + " -> Banco");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.recibopuntoventaLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.recibopuntoventaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ReciboPuntoVentaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.recibopuntoventaLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_bancoReciboPuntoVentaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.recibopuntoventaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosReciboPuntoVenta.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualReciboPuntoVenta(this.getrecibopuntoventa(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysReciboPuntoVenta(this.recibopuntoventa);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.recibopuntoventa =(ReciboPuntoVenta) this.recibopuntoventaLogic.getReciboPuntoVentas().toArray()[this.jTableDatosReciboPuntoVenta.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.recibopuntoventa =(ReciboPuntoVenta) this.recibopuntoventas.toArray()[this.jTableDatosReciboPuntoVenta.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.recibopuntoventa==null) {
						this.recibopuntoventa = new ReciboPuntoVenta();
					}

					this.setVariablesFormularioToObjetoActualReciboPuntoVenta(this.recibopuntoventa,true);
					this.setVariablesFormularioToObjetoActualForeignKeysReciboPuntoVenta(this.recibopuntoventa);
				}

				if(this.recibopuntoventa.getid_banco()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_banco = "+this.recibopuntoventa.getid_banco().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingReciboPuntoVenta(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.recibopuntoventaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.recibopuntoventaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ReciboPuntoVentaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.recibopuntoventaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonvalor_efectivoReciboPuntoVentaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.recibopuntoventaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosReciboPuntoVenta.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualReciboPuntoVenta(this.getrecibopuntoventa(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysReciboPuntoVenta(this.recibopuntoventa);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.recibopuntoventa =(ReciboPuntoVenta) this.recibopuntoventaLogic.getReciboPuntoVentas().toArray()[this.jTableDatosReciboPuntoVenta.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.recibopuntoventa =(ReciboPuntoVenta) this.recibopuntoventas.toArray()[this.jTableDatosReciboPuntoVenta.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.recibopuntoventa==null) {
						this.recibopuntoventa = new ReciboPuntoVenta();
					}

					this.setVariablesFormularioToObjetoActualReciboPuntoVenta(this.recibopuntoventa,true);
					this.setVariablesFormularioToObjetoActualForeignKeysReciboPuntoVenta(this.recibopuntoventa);
				}

				if(this.recibopuntoventa.getvalor_efectivo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where valor_efectivo = "+this.recibopuntoventa.getvalor_efectivo().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingReciboPuntoVenta(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.recibopuntoventaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.recibopuntoventaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ReciboPuntoVentaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.recibopuntoventaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonvalor_chequeReciboPuntoVentaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.recibopuntoventaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosReciboPuntoVenta.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualReciboPuntoVenta(this.getrecibopuntoventa(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysReciboPuntoVenta(this.recibopuntoventa);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.recibopuntoventa =(ReciboPuntoVenta) this.recibopuntoventaLogic.getReciboPuntoVentas().toArray()[this.jTableDatosReciboPuntoVenta.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.recibopuntoventa =(ReciboPuntoVenta) this.recibopuntoventas.toArray()[this.jTableDatosReciboPuntoVenta.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.recibopuntoventa==null) {
						this.recibopuntoventa = new ReciboPuntoVenta();
					}

					this.setVariablesFormularioToObjetoActualReciboPuntoVenta(this.recibopuntoventa,true);
					this.setVariablesFormularioToObjetoActualForeignKeysReciboPuntoVenta(this.recibopuntoventa);
				}

				if(this.recibopuntoventa.getvalor_cheque()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where valor_cheque = "+this.recibopuntoventa.getvalor_cheque().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingReciboPuntoVenta(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.recibopuntoventaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.recibopuntoventaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ReciboPuntoVentaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.recibopuntoventaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnumero_chequeReciboPuntoVentaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.recibopuntoventaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosReciboPuntoVenta.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualReciboPuntoVenta(this.getrecibopuntoventa(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysReciboPuntoVenta(this.recibopuntoventa);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.recibopuntoventa =(ReciboPuntoVenta) this.recibopuntoventaLogic.getReciboPuntoVentas().toArray()[this.jTableDatosReciboPuntoVenta.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.recibopuntoventa =(ReciboPuntoVenta) this.recibopuntoventas.toArray()[this.jTableDatosReciboPuntoVenta.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.recibopuntoventa==null) {
						this.recibopuntoventa = new ReciboPuntoVenta();
					}

					this.setVariablesFormularioToObjetoActualReciboPuntoVenta(this.recibopuntoventa,true);
					this.setVariablesFormularioToObjetoActualForeignKeysReciboPuntoVenta(this.recibopuntoventa);
				}

				if(this.recibopuntoventa.getnumero_cheque()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where numero_cheque like '%"+this.recibopuntoventa.getnumero_cheque()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingReciboPuntoVenta(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.recibopuntoventaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.recibopuntoventaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ReciboPuntoVentaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.recibopuntoventaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfechaReciboPuntoVentaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.recibopuntoventaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosReciboPuntoVenta.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualReciboPuntoVenta(this.getrecibopuntoventa(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysReciboPuntoVenta(this.recibopuntoventa);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.recibopuntoventa =(ReciboPuntoVenta) this.recibopuntoventaLogic.getReciboPuntoVentas().toArray()[this.jTableDatosReciboPuntoVenta.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.recibopuntoventa =(ReciboPuntoVenta) this.recibopuntoventas.toArray()[this.jTableDatosReciboPuntoVenta.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.recibopuntoventa==null) {
						this.recibopuntoventa = new ReciboPuntoVenta();
					}

					this.setVariablesFormularioToObjetoActualReciboPuntoVenta(this.recibopuntoventa,true);
					this.setVariablesFormularioToObjetoActualForeignKeysReciboPuntoVenta(this.recibopuntoventa);
				}

				if(this.recibopuntoventa.getfecha()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha = '"+Funciones2.getStringPostgresDate(this.recibopuntoventa.getfecha())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingReciboPuntoVenta(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.recibopuntoventaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.recibopuntoventaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ReciboPuntoVentaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.recibopuntoventaLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdBancoReciboPuntoVentaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.recibopuntoventaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingReciboPuntoVenta(false,false);

			this.getReciboPuntoVentasFK_IdBanco();

			this.inicializarActualizarBindingReciboPuntoVenta(false);

			//if(ReciboPuntoVentaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingReciboPuntoVenta(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.recibopuntoventaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.recibopuntoventaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ReciboPuntoVentaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.recibopuntoventaLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdClienteReciboPuntoVentaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.recibopuntoventaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingReciboPuntoVenta(false,false);

			this.getReciboPuntoVentasFK_IdCliente();

			this.inicializarActualizarBindingReciboPuntoVenta(false);

			//if(ReciboPuntoVentaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingReciboPuntoVenta(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.recibopuntoventaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.recibopuntoventaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ReciboPuntoVentaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.recibopuntoventaLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameReciboPuntoVenta() {
		if(this.jInternalFrameDetalleFormReciboPuntoVenta!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormReciboPuntoVenta!=null) {
			this.jInternalFrameDetalleFormReciboPuntoVenta.setVisible(false);	    			
			this.jInternalFrameDetalleFormReciboPuntoVenta.dispose();
			this.jInternalFrameDetalleFormReciboPuntoVenta=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoReciboPuntoVenta!=null) {
			this.jInternalFrameReporteDinamicoReciboPuntoVenta.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoReciboPuntoVenta.dispose();
			this.jInternalFrameReporteDinamicoReciboPuntoVenta=null;
		}
		
		if(this.jInternalFrameImportacionReciboPuntoVenta!=null) {
			this.jInternalFrameImportacionReciboPuntoVenta.setVisible(false);	    			
			this.jInternalFrameImportacionReciboPuntoVenta.dispose();
			this.jInternalFrameImportacionReciboPuntoVenta=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessReciboPuntoVenta();
			
			ReciboPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.recibopuntoventa,new Object(),this.recibopuntoventaParameterGeneral,this.recibopuntoventaReturnGeneral);
			
			
			if(sTipo.equals("NuevoReciboPuntoVenta")) {
				jButtonNuevoReciboPuntoVentaActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarReciboPuntoVenta")) {
				jButtonDuplicarReciboPuntoVentaActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarReciboPuntoVenta")) {
				jButtonCopiarReciboPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("VerFormReciboPuntoVenta")) {
				jButtonVerFormReciboPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarReciboPuntoVenta")) {
				jButtonNuevoReciboPuntoVentaActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarReciboPuntoVenta")) {
				jButtonDuplicarReciboPuntoVentaActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoReciboPuntoVenta")) {
				jButtonNuevoReciboPuntoVentaActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarReciboPuntoVenta")) {
				jButtonDuplicarReciboPuntoVentaActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesReciboPuntoVenta")) {
				jButtonNuevoReciboPuntoVentaActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarReciboPuntoVenta")) {
				jButtonNuevoReciboPuntoVentaActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesReciboPuntoVenta")) {
				jButtonNuevoReciboPuntoVentaActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarReciboPuntoVenta")) {
				jButtonModificarReciboPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarReciboPuntoVenta")) {
				jButtonModificarReciboPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarReciboPuntoVenta")) {
				jButtonModificarReciboPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("ActualizarReciboPuntoVenta")) {
				jButtonActualizarReciboPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarReciboPuntoVenta")) {
				jButtonActualizarReciboPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarReciboPuntoVenta")) {
				jButtonActualizarReciboPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("EliminarReciboPuntoVenta")) {
				jButtonEliminarReciboPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarReciboPuntoVenta")) {
				jButtonEliminarReciboPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarReciboPuntoVenta")) {
				jButtonEliminarReciboPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("CancelarReciboPuntoVenta")) {
				jButtonCancelarReciboPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarReciboPuntoVenta")) {
				jButtonCancelarReciboPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarReciboPuntoVenta")) {
				jButtonCancelarReciboPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("CerrarReciboPuntoVenta")) {
				jButtonCerrarReciboPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarReciboPuntoVenta")) {
				jButtonCerrarReciboPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarReciboPuntoVenta")) {
				jButtonCerrarReciboPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarReciboPuntoVenta")) {
				jButtonMostrarOcultarReciboPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarReciboPuntoVenta")) {
				jButtonCancelarReciboPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosReciboPuntoVenta")) {
				jButtonGuardarCambiosReciboPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarReciboPuntoVenta")) {
				jButtonGuardarCambiosReciboPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarReciboPuntoVenta")) {
				jButtonCopiarReciboPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarReciboPuntoVenta")) {
				jButtonVerFormReciboPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosReciboPuntoVenta")) {
				jButtonGuardarCambiosReciboPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarReciboPuntoVenta")) {
				jButtonCopiarReciboPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormReciboPuntoVenta")) {
				jButtonVerFormReciboPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaReciboPuntoVenta")) {
				jButtonGuardarCambiosReciboPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarReciboPuntoVenta")) {
				jButtonGuardarCambiosReciboPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaReciboPuntoVenta")) {
				jButtonGuardarCambiosReciboPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionReciboPuntoVenta")) {
				jButtonRecargarInformacionReciboPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarReciboPuntoVenta")) {
				jButtonRecargarInformacionReciboPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionReciboPuntoVenta")) {
				jButtonRecargarInformacionReciboPuntoVentaActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresReciboPuntoVenta")) {
				jButtonAnterioresReciboPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarReciboPuntoVenta")) {
				jButtonAnterioresReciboPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreReciboPuntoVenta")) {
				jButtonAnterioresReciboPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("SiguientesReciboPuntoVenta")) {
				jButtonSiguientesReciboPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarReciboPuntoVenta")) {
				jButtonSiguientesReciboPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesReciboPuntoVenta")) {
				jButtonSiguientesReciboPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByReciboPuntoVenta") || sTipo.equals("MenuItemDetalleAbrirOrderByReciboPuntoVenta")) {
				jButtonAbrirOrderByReciboPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarReciboPuntoVenta") || sTipo.equals("MenuItemDetalleMostrarOcultarReciboPuntoVenta")) {
				jButtonMostrarOcultarReciboPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosReciboPuntoVenta")) {
				jButtonNuevoGuardarCambiosReciboPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarReciboPuntoVenta")) {
				jButtonNuevoGuardarCambiosReciboPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosReciboPuntoVenta")) {
				jButtonNuevoGuardarCambiosReciboPuntoVentaActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoReciboPuntoVenta")) {
				jButtonCerrarReporteDinamicoReciboPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoReciboPuntoVenta")) {
				jButtonGenerarReporteDinamicoReciboPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoReciboPuntoVenta")) {
				
				jButtonGenerarExcelReporteDinamicoReciboPuntoVentaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionReciboPuntoVenta")) {
				jButtonCerrarImportacionReciboPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionReciboPuntoVenta")) {
				
				jButtonGenerarImportacionReciboPuntoVentaActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionReciboPuntoVenta")) {
				
				jButtonAbrirImportacionReciboPuntoVentaActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesReciboPuntoVenta")) {
				jComboBoxTiposAccionesReciboPuntoVentaActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesReciboPuntoVenta")) {
				jComboBoxTiposRelacionesReciboPuntoVentaActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioReciboPuntoVenta")) {
				jComboBoxTiposAccionesReciboPuntoVentaActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarReciboPuntoVenta")) {
				
				jComboBoxTiposSeleccionarReciboPuntoVentaActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralReciboPuntoVenta")) {
				jTextFieldValorCampoGeneralReciboPuntoVentaActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByReciboPuntoVenta")) {
				jButtonAbrirOrderByReciboPuntoVentaActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarReciboPuntoVenta")) {
				jButtonAbrirOrderByReciboPuntoVentaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByReciboPuntoVenta")) {
				jButtonCerrarOrderByReciboPuntoVentaActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idReciboPuntoVentaBusqueda")) {
				this.jButtonidReciboPuntoVentaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_clienteReciboPuntoVenta")) {
				this.jButtonid_clienteReciboPuntoVentaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_clienteReciboPuntoVentaUpdate")) {
				this.jButtonid_clienteReciboPuntoVentaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_clienteReciboPuntoVentaBusqueda")) {
				this.jButtonid_clienteReciboPuntoVentaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_bancoReciboPuntoVentaUpdate")) {
				this.jButtonid_bancoReciboPuntoVentaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_bancoReciboPuntoVentaBusqueda")) {
				this.jButtonid_bancoReciboPuntoVentaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("valor_efectivoReciboPuntoVentaBusqueda")) {
				this.jButtonvalor_efectivoReciboPuntoVentaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("valor_chequeReciboPuntoVentaBusqueda")) {
				this.jButtonvalor_chequeReciboPuntoVentaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_chequeReciboPuntoVentaBusqueda")) {
				this.jButtonnumero_chequeReciboPuntoVentaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fechaReciboPuntoVentaBusqueda")) {
				this.jButtonfechaReciboPuntoVentaBusquedaActionPerformed(evt);
			}
			
			
			else if(sTipo.equals("id_clienteReciboPuntoVenta")) {
				this.jButtonid_clienteReciboPuntoVentaActionPerformed(evt);
			}
			
			
			else if(sTipo.equals("FK_IdBancoReciboPuntoVenta")) {
				this.jButtonFK_IdBancoReciboPuntoVentaActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdClienteReciboPuntoVenta")) {
				this.jButtonFK_IdClienteReciboPuntoVentaActionPerformed(evt);
			}
			
			;
			
			
			ReciboPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.recibopuntoventa,new Object(),this.recibopuntoventaParameterGeneral,this.recibopuntoventaReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ReciboPuntoVentaConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessReciboPuntoVenta();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaReciboPuntoVentaActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.recibopuntoventa);
				
				this.actualizarInformacion("INFO_PADRE",false,this.recibopuntoventa);
				
				ReciboPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.recibopuntoventa,new Object(),this.recibopuntoventaParameterGeneral,this.recibopuntoventaReturnGeneral);
				
				


				
				ReciboPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.recibopuntoventa,new Object(),this.recibopuntoventaParameterGeneral,this.recibopuntoventaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ReciboPuntoVenta.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ReciboPuntoVenta.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,ReciboPuntoVentaConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			ReciboPuntoVenta recibopuntoventaLocal=null;
			
			if(!this.getEsControlTabla()) {
				recibopuntoventaLocal=this.recibopuntoventa;
			} else {
				recibopuntoventaLocal=this.recibopuntoventaAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ReciboPuntoVentaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.recibopuntoventa);
				
				this.actualizarInformacion("INFO_PADRE",false,this.recibopuntoventa);
				
				ReciboPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.recibopuntoventa,new Object(),this.recibopuntoventaParameterGeneral,this.recibopuntoventaReturnGeneral);
							
				
				


				
				ReciboPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.recibopuntoventa,new Object(),this.recibopuntoventaParameterGeneral,this.recibopuntoventaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ReciboPuntoVenta.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ReciboPuntoVenta.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ReciboPuntoVentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaReciboPuntoVentaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosReciboPuntoVenta.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.recibopuntoventaAnterior =(ReciboPuntoVenta) this.recibopuntoventaLogic.getReciboPuntoVentas().toArray()[this.jTableDatosReciboPuntoVenta.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.recibopuntoventaAnterior =(ReciboPuntoVenta) this.recibopuntoventas.toArray()[this.jTableDatosReciboPuntoVenta.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ReciboPuntoVentaConstantesFunciones.CLASSNAME);
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
			
			ReciboPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.recibopuntoventa,new Object(),this.recibopuntoventaParameterGeneral,this.recibopuntoventaReturnGeneral);
			
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
			
			


			
			ReciboPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.recibopuntoventa,new Object(),this.recibopuntoventaParameterGeneral,this.recibopuntoventaReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ReciboPuntoVentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ReciboPuntoVentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ReciboPuntoVentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaReciboPuntoVentaActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.recibopuntoventa);
				
				this.actualizarInformacion("INFO_PADRE",false,this.recibopuntoventa);
				
				ReciboPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.recibopuntoventa,new Object(),this.recibopuntoventaParameterGeneral,this.recibopuntoventaReturnGeneral);
								
						
				


				
				ReciboPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.recibopuntoventa,new Object(),this.recibopuntoventaParameterGeneral,this.recibopuntoventaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ReciboPuntoVenta.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ReciboPuntoVenta.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ReciboPuntoVentaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.recibopuntoventa);
				
				this.actualizarInformacion("INFO_PADRE",false,this.recibopuntoventa);
				
				ReciboPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.recibopuntoventa,new Object(),this.recibopuntoventaParameterGeneral,this.recibopuntoventaReturnGeneral);
								
				
				


				
				ReciboPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.recibopuntoventa,new Object(),this.recibopuntoventaParameterGeneral,this.recibopuntoventaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ReciboPuntoVenta.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ReciboPuntoVenta.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ReciboPuntoVentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaReciboPuntoVentaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosReciboPuntoVenta.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.recibopuntoventaAnterior =(ReciboPuntoVenta) this.recibopuntoventaLogic.getReciboPuntoVentas().toArray()[this.jTableDatosReciboPuntoVenta.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.recibopuntoventaAnterior =(ReciboPuntoVenta) this.recibopuntoventas.toArray()[this.jTableDatosReciboPuntoVenta.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ReciboPuntoVentaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.recibopuntoventa);
				
				this.actualizarInformacion("INFO_PADRE",false,this.recibopuntoventa);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ReciboPuntoVentaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaReciboPuntoVentaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosReciboPuntoVenta.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.recibopuntoventaAnterior =(ReciboPuntoVenta) this.recibopuntoventaLogic.getReciboPuntoVentas().toArray()[this.jTableDatosReciboPuntoVenta.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.recibopuntoventaAnterior =(ReciboPuntoVenta) this.recibopuntoventas.toArray()[this.jTableDatosReciboPuntoVenta.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ReciboPuntoVentaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaReciboPuntoVentaActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.recibopuntoventa);
			
			this.actualizarInformacion("INFO_PADRE",false,this.recibopuntoventa);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ReciboPuntoVentaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.recibopuntoventa);
				
				this.actualizarInformacion("INFO_PADRE",false,this.recibopuntoventa);
				
				ReciboPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.recibopuntoventa,new Object(),this.recibopuntoventaParameterGeneral,this.recibopuntoventaReturnGeneral);
							
				
				


				
				ReciboPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.recibopuntoventa,new Object(),this.recibopuntoventaParameterGeneral,this.recibopuntoventaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ReciboPuntoVenta.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ReciboPuntoVenta.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ReciboPuntoVentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaReciboPuntoVentaActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosReciboPuntoVenta.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.recibopuntoventaAnterior =(ReciboPuntoVenta) this.recibopuntoventaLogic.getReciboPuntoVentas().toArray()[this.jTableDatosReciboPuntoVenta.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.recibopuntoventaAnterior =(ReciboPuntoVenta) this.recibopuntoventas.toArray()[this.jTableDatosReciboPuntoVenta.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ReciboPuntoVentaConstantesFunciones.CLASSNAME);
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
			
			ReciboPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.recibopuntoventa,new Object(),this.recibopuntoventaParameterGeneral,this.recibopuntoventaReturnGeneral);
			
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
			
			


			
			ReciboPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.recibopuntoventa,new Object(),this.recibopuntoventaParameterGeneral,this.recibopuntoventaReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ReciboPuntoVentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ReciboPuntoVentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ReciboPuntoVentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaReciboPuntoVentaActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.recibopuntoventa);
			
			this.actualizarInformacion("INFO_PADRE",false,this.recibopuntoventa);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ReciboPuntoVentaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.recibopuntoventa);
				
				this.actualizarInformacion("INFO_PADRE",false,this.recibopuntoventa);
				
				ReciboPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.recibopuntoventa,new Object(),this.recibopuntoventaParameterGeneral,this.recibopuntoventaReturnGeneral);
								
				
				


				
				ReciboPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.recibopuntoventa,new Object(),this.recibopuntoventaParameterGeneral,this.recibopuntoventaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ReciboPuntoVenta.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ReciboPuntoVenta.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ReciboPuntoVentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaReciboPuntoVentaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosReciboPuntoVenta.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.recibopuntoventaAnterior =(ReciboPuntoVenta) this.recibopuntoventaLogic.getReciboPuntoVentas().toArray()[this.jTableDatosReciboPuntoVenta.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.recibopuntoventaAnterior =(ReciboPuntoVenta) this.recibopuntoventas.toArray()[this.jTableDatosReciboPuntoVenta.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ReciboPuntoVentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaReciboPuntoVentaActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.recibopuntoventa);
			
			this.actualizarInformacion("INFO_PADRE",false,this.recibopuntoventa);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ReciboPuntoVentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaReciboPuntoVentaActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.recibopuntoventa);
				
				this.actualizarInformacion("INFO_PADRE",false,this.recibopuntoventa);
				
				ReciboPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.recibopuntoventa,new Object(),this.recibopuntoventaParameterGeneral,this.recibopuntoventaReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosReciboPuntoVenta")) {
					jCheckBoxSeleccionarTodosReciboPuntoVentaItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosReciboPuntoVenta")) {
					jCheckBoxSeleccionadosReciboPuntoVentaItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarReciboPuntoVenta")) {
					
				}
				
				


				
				
				ReciboPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.recibopuntoventa,new Object(),this.recibopuntoventaParameterGeneral,this.recibopuntoventaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ReciboPuntoVenta.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ReciboPuntoVenta.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ReciboPuntoVentaConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.recibopuntoventa);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.recibopuntoventa);
				
				ReciboPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.recibopuntoventa,new Object(),this.recibopuntoventaParameterGeneral,this.recibopuntoventaReturnGeneral);
												
				
				


				
				
				ReciboPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.recibopuntoventa,new Object(),this.recibopuntoventaParameterGeneral,this.recibopuntoventaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ReciboPuntoVenta.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ReciboPuntoVenta.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ReciboPuntoVentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaReciboPuntoVentaActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosReciboPuntoVenta.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.recibopuntoventaAnterior =(ReciboPuntoVenta) this.recibopuntoventaLogic.getReciboPuntoVentas().toArray()[this.jTableDatosReciboPuntoVenta.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.recibopuntoventaAnterior =(ReciboPuntoVenta) this.recibopuntoventas.toArray()[this.jTableDatosReciboPuntoVenta.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ReciboPuntoVentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaReciboPuntoVentaActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.recibopuntoventa);
				
				this.actualizarInformacion("INFO_PADRE",false,this.recibopuntoventa);
				
				ReciboPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.recibopuntoventa,new Object(),this.recibopuntoventaParameterGeneral,this.recibopuntoventaReturnGeneral);
				
				
				ReciboPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.recibopuntoventa,new Object(),this.recibopuntoventaParameterGeneral,this.recibopuntoventaReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ReciboPuntoVentaConstantesFunciones.CLASSNAME);
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
			
			ReciboPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.recibopuntoventa,new Object(),this.recibopuntoventaParameterGeneral,this.recibopuntoventaReturnGeneral);
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
			
			


			
			ReciboPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.recibopuntoventa,new Object(),this.recibopuntoventaParameterGeneral,this.recibopuntoventaReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ReciboPuntoVentaConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaReciboPuntoVentaActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.recibopuntoventa);
				
				this.actualizarInformacion("INFO_PADRE",false,this.recibopuntoventa);
				
				ReciboPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.recibopuntoventa,new Object(),this.recibopuntoventaParameterGeneral,this.recibopuntoventaReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				ReciboPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.recibopuntoventa,new Object(),this.recibopuntoventaParameterGeneral,this.recibopuntoventaReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ReciboPuntoVenta.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ReciboPuntoVenta.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ReciboPuntoVentaConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.recibopuntoventa);
				
				this.actualizarInformacion("INFO_PADRE",false,this.recibopuntoventa);
				
				ReciboPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.recibopuntoventa,new Object(),this.recibopuntoventaParameterGeneral,this.recibopuntoventaReturnGeneral);
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
				
				


				
				ReciboPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.recibopuntoventa,new Object(),this.recibopuntoventaParameterGeneral,this.recibopuntoventaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ReciboPuntoVenta.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ReciboPuntoVenta.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ReciboPuntoVentaConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaReciboPuntoVentaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosReciboPuntoVenta.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.recibopuntoventaAnterior =(ReciboPuntoVenta) this.recibopuntoventaLogic.getReciboPuntoVentas().toArray()[this.jTableDatosReciboPuntoVenta.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.recibopuntoventaAnterior =(ReciboPuntoVenta) this.recibopuntoventas.toArray()[this.jTableDatosReciboPuntoVenta.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ReciboPuntoVentaConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				ReciboPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.recibopuntoventa,new Object(),this.recibopuntoventaParameterGeneral,this.recibopuntoventaReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarReciboPuntoVenta")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosReciboPuntoVentaListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosReciboPuntoVenta.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.recibopuntoventa =(ReciboPuntoVenta) this.recibopuntoventaLogic.getReciboPuntoVentas().toArray()[this.jTableDatosReciboPuntoVenta.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.recibopuntoventa =(ReciboPuntoVenta) this.recibopuntoventas.toArray()[this.jTableDatosReciboPuntoVenta.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.recibopuntoventa);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarReciboPuntoVenta")) {
				
				}
				
				ReciboPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.recibopuntoventa,new Object(),this.recibopuntoventaParameterGeneral,this.recibopuntoventaReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ReciboPuntoVentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			ReciboPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.recibopuntoventa,new Object(),this.recibopuntoventaParameterGeneral,this.recibopuntoventaReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarReciboPuntoVenta")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosReciboPuntoVenta.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarReciboPuntoVenta")) {
			
			}
			
			ReciboPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.recibopuntoventa,new Object(),this.recibopuntoventaParameterGeneral,this.recibopuntoventaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ReciboPuntoVentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessReciboPuntoVenta();
			
			ReciboPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.recibopuntoventa,new Object(),this.recibopuntoventaParameterGeneral,this.recibopuntoventaReturnGeneral);
			
			if(sTipo.equals("NuevoReciboPuntoVenta")) {
				jButtonNuevoReciboPuntoVentaActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarReciboPuntoVenta")) {
				jButtonDuplicarReciboPuntoVentaActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarReciboPuntoVenta")) {
				jButtonCopiarReciboPuntoVentaActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormReciboPuntoVenta")) {
				jButtonVerFormReciboPuntoVentaActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesReciboPuntoVenta")) {
				jButtonNuevoReciboPuntoVentaActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarReciboPuntoVenta")) {
				jButtonModificarReciboPuntoVentaActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarReciboPuntoVenta")) {
				jButtonActualizarReciboPuntoVentaActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarReciboPuntoVenta")) {
				jButtonEliminarReciboPuntoVentaActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaReciboPuntoVenta")) {
				jButtonGuardarCambiosReciboPuntoVentaActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarReciboPuntoVenta")) {
				jButtonCancelarReciboPuntoVentaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarReciboPuntoVenta")) {
				jButtonCerrarReciboPuntoVentaActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosReciboPuntoVenta")) {
				jButtonGuardarCambiosReciboPuntoVentaActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosReciboPuntoVenta")) {
				jButtonNuevoGuardarCambiosReciboPuntoVentaActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByReciboPuntoVenta")) {
				jButtonAbrirOrderByReciboPuntoVentaActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionReciboPuntoVenta")) {
				jButtonRecargarInformacionReciboPuntoVentaActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresReciboPuntoVenta")) {
				jButtonAnterioresReciboPuntoVentaActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesReciboPuntoVenta")) {
				jButtonSiguientesReciboPuntoVentaActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idReciboPuntoVentaBusqueda")) {
				this.jButtonidReciboPuntoVentaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_clienteReciboPuntoVenta")) {
				this.jButtonid_clienteReciboPuntoVentaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_clienteReciboPuntoVentaUpdate")) {
				this.jButtonid_clienteReciboPuntoVentaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_clienteReciboPuntoVentaBusqueda")) {
				this.jButtonid_clienteReciboPuntoVentaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_bancoReciboPuntoVentaUpdate")) {
				this.jButtonid_bancoReciboPuntoVentaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_bancoReciboPuntoVentaBusqueda")) {
				this.jButtonid_bancoReciboPuntoVentaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("valor_efectivoReciboPuntoVentaBusqueda")) {
				this.jButtonvalor_efectivoReciboPuntoVentaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("valor_chequeReciboPuntoVentaBusqueda")) {
				this.jButtonvalor_chequeReciboPuntoVentaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_chequeReciboPuntoVentaBusqueda")) {
				this.jButtonnumero_chequeReciboPuntoVentaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fechaReciboPuntoVentaBusqueda")) {
				this.jButtonfechaReciboPuntoVentaBusquedaActionPerformed(evt);
			}
			
			ReciboPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.recibopuntoventa,new Object(),this.recibopuntoventaParameterGeneral,this.recibopuntoventaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ReciboPuntoVentaConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessReciboPuntoVenta();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			ReciboPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.recibopuntoventa,new Object(),this.recibopuntoventaParameterGeneral,this.recibopuntoventaReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameReciboPuntoVenta")) {
				closingInternalFrameReciboPuntoVenta();
				
			} else if(sTipo.equals("jButtonCancelarReciboPuntoVenta")) {
				JInternalFrameBase jInternalFrameDetalleFormReciboPuntoVenta = (JInternalFrameBase)evt.getSource();
	            	
	            ReciboPuntoVentaBeanSwingJInternalFrame jInternalFrameParent=(ReciboPuntoVentaBeanSwingJInternalFrame)jInternalFrameDetalleFormReciboPuntoVenta.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarReciboPuntoVentaActionPerformed(null);
			}
			
			ReciboPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.recibopuntoventa,new Object(),this.recibopuntoventaParameterGeneral,this.recibopuntoventaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ReciboPuntoVentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormReciboPuntoVenta(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormReciboPuntoVenta(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormReciboPuntoVenta(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.recibopuntoventa)) {
			if(!esControlTabla) {
				if(ReciboPuntoVentaJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualReciboPuntoVenta(this.recibopuntoventa,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysReciboPuntoVenta(this.recibopuntoventa);			
				}
				
				if(this.recibopuntoventaSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualReciboPuntoVenta(this.recibopuntoventa,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.recibopuntoventaReturnGeneral=recibopuntoventaLogic.procesarEventosReciboPuntoVentasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.recibopuntoventaLogic.getReciboPuntoVentas(),this.recibopuntoventa,this.recibopuntoventaParameterGeneral,this.isEsNuevoReciboPuntoVenta,classes);//this.recibopuntoventaLogic.getReciboPuntoVenta()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanReciboPuntoVenta(this.recibopuntoventaReturnGeneral,this.recibopuntoventaBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.recibopuntoventaSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanReciboPuntoVenta(classes,this.recibopuntoventaReturnGeneral,this.recibopuntoventaBean,false);
					}
						
					if(this.recibopuntoventaReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyReciboPuntoVenta(this.recibopuntoventaReturnGeneral.getReciboPuntoVenta());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioReciboPuntoVenta(this.recibopuntoventaReturnGeneral.getReciboPuntoVenta());	
					}
						
					if(this.recibopuntoventaReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioReciboPuntoVenta(this.recibopuntoventaReturnGeneral.getReciboPuntoVenta(),classes);//this.recibopuntoventaBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioReciboPuntoVenta(this.recibopuntoventa,classes);//this.recibopuntoventaBean);									
				}
			
				if(ReciboPuntoVentaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualReciboPuntoVenta(this.recibopuntoventa,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysReciboPuntoVenta(this.recibopuntoventa);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.recibopuntoventaAnterior!=null) {
						this.recibopuntoventa=this.recibopuntoventaAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.recibopuntoventaReturnGeneral=recibopuntoventaLogic.procesarEventosReciboPuntoVentasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.recibopuntoventaLogic.getReciboPuntoVentas(),this.recibopuntoventa,this.recibopuntoventaParameterGeneral,this.isEsNuevoReciboPuntoVenta,classes);//this.recibopuntoventaLogic.getReciboPuntoVenta()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.recibopuntoventaSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.recibopuntoventaSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.recibopuntoventaReturnGeneral.getReciboPuntoVenta(),recibopuntoventaLogic.getReciboPuntoVentas());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.recibopuntoventaReturnGeneral.getReciboPuntoVenta(),this.recibopuntoventas);
				}
				//ARCHITECTURE
				
				//this.jTableDatosReciboPuntoVenta.repaint();
				
				//((AbstractTableModel) this.jTableDatosReciboPuntoVenta.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosReciboPuntoVenta();
			}
		}
	}
	
	public void actualizarVisualTableDatosReciboPuntoVenta() throws Exception {
		
		ReciboPuntoVentaModel recibopuntoventaModel=(ReciboPuntoVentaModel)this.jTableDatosReciboPuntoVenta.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			recibopuntoventaModel.recibopuntoventas=this.recibopuntoventaLogic.getReciboPuntoVentas();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			recibopuntoventaModel.recibopuntoventas=this.recibopuntoventas;
		}
		
		
		((ReciboPuntoVentaModel) this.jTableDatosReciboPuntoVenta.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaReciboPuntoVenta() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getrecibopuntoventaAnterior(),this.recibopuntoventaLogic.getReciboPuntoVentas());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getrecibopuntoventaAnterior(),this.recibopuntoventas);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosReciboPuntoVenta();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioReciboPuntoVenta(ReciboPuntoVenta recibopuntoventa,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ReciboPuntoVentaConstantesFunciones.CLASSNAME);
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
										
				ReciboPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.recibopuntoventa,new Object(),generalEntityParameterGeneral,this.recibopuntoventaReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.recibopuntoventaSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=ReciboPuntoVentaConstantesFunciones.getClassesRelationshipsOfReciboPuntoVenta(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=ReciboPuntoVentaConstantesFunciones.getClassesRelationshipsFromStringsOfReciboPuntoVenta(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormReciboPuntoVenta(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				ReciboPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.recibopuntoventa,new Object(),generalEntityParameterGeneral,this.recibopuntoventaReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ReciboPuntoVentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioReciboPuntoVenta(ReciboPuntoVentaBean recibopuntoventaBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ReciboPuntoVentaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanReciboPuntoVenta(ArrayList<Classe> classes,ReciboPuntoVentaReturnGeneral recibopuntoventaReturnGeneral,ReciboPuntoVentaBean recibopuntoventaBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualReciboPuntoVenta(ReciboPuntoVenta recibopuntoventa,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.recibopuntoventa)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormReciboPuntoVenta = new ReciboPuntoVentaDetalleFormJInternalFrame(jDesktopPane,this.recibopuntoventaSessionBean.getConGuardarRelaciones(),this.recibopuntoventaSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormReciboPuntoVenta);
		this.jInternalFrameDetalleFormReciboPuntoVenta.setVisible(false);
		this.jInternalFrameDetalleFormReciboPuntoVenta.setSelected(false);						
		
		this.jInternalFrameDetalleFormReciboPuntoVenta.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormReciboPuntoVenta.recibopuntoventaLogic=this.recibopuntoventaLogic;
		
		this.cargarCombosFrameForeignKeyReciboPuntoVenta("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleReciboPuntoVenta();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleReciboPuntoVenta();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyReciboPuntoVenta("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyReciboPuntoVenta();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormReciboPuntoVenta.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarReciboPuntoVenta"));
		
		this.jInternalFrameDetalleFormReciboPuntoVenta.jButtonModificarReciboPuntoVenta.addActionListener(new ButtonActionListener(this,"ModificarReciboPuntoVenta"));

		
		this.jInternalFrameDetalleFormReciboPuntoVenta.jButtonModificarToolBarReciboPuntoVenta.addActionListener(new ButtonActionListener(this,"ModificarToolBarReciboPuntoVenta"));
					
		this.jInternalFrameDetalleFormReciboPuntoVenta.jMenuItemModificarReciboPuntoVenta.addActionListener(new ButtonActionListener(this,"MenuItemModificarReciboPuntoVenta"));		
		
		
		
		this.jInternalFrameDetalleFormReciboPuntoVenta.jButtonActualizarReciboPuntoVenta.addActionListener (new ButtonActionListener(this,"ActualizarReciboPuntoVenta"));
		
		
		this.jInternalFrameDetalleFormReciboPuntoVenta.jButtonActualizarToolBarReciboPuntoVenta.addActionListener(new ButtonActionListener(this,"ActualizarToolBarReciboPuntoVenta"));
						
		this.jInternalFrameDetalleFormReciboPuntoVenta.jMenuItemActualizarReciboPuntoVenta.addActionListener (new ButtonActionListener(this,"MenuItemActualizarReciboPuntoVenta"));		
		
		
		
		this.jInternalFrameDetalleFormReciboPuntoVenta.jButtonEliminarReciboPuntoVenta.addActionListener (new ButtonActionListener(this,"EliminarReciboPuntoVenta"));
		
		
		this.jInternalFrameDetalleFormReciboPuntoVenta.jButtonEliminarToolBarReciboPuntoVenta.addActionListener (new ButtonActionListener(this,"EliminarToolBarReciboPuntoVenta"));
								
		this.jInternalFrameDetalleFormReciboPuntoVenta.jMenuItemEliminarReciboPuntoVenta.addActionListener (new ButtonActionListener(this,"MenuItemEliminarReciboPuntoVenta"));		
		
		
		
		this.jInternalFrameDetalleFormReciboPuntoVenta.jButtonCancelarReciboPuntoVenta.addActionListener (new ButtonActionListener(this,"CancelarReciboPuntoVenta"));
		
		
		this.jInternalFrameDetalleFormReciboPuntoVenta.jButtonCancelarToolBarReciboPuntoVenta.addActionListener (new ButtonActionListener(this,"CancelarToolBarReciboPuntoVenta"));
					
		this.jInternalFrameDetalleFormReciboPuntoVenta.jMenuItemCancelarReciboPuntoVenta.addActionListener (new ButtonActionListener(this,"MenuItemCancelarReciboPuntoVenta"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormReciboPuntoVenta.jMenuItemDetalleCerrarReciboPuntoVenta.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarReciboPuntoVenta"));		
		
		
		
		this.jInternalFrameDetalleFormReciboPuntoVenta.jButtonGuardarCambiosToolBarReciboPuntoVenta.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarReciboPuntoVenta"));
		
		
		
		this.jInternalFrameDetalleFormReciboPuntoVenta.jButtonGuardarCambiosToolBarReciboPuntoVenta.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarReciboPuntoVenta"));
		
		
		
		this.jInternalFrameDetalleFormReciboPuntoVenta.jComboBoxTiposAccionesFormularioReciboPuntoVenta.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioReciboPuntoVenta"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormReciboPuntoVenta.jButtonidReciboPuntoVentaBusqueda.addActionListener(new ButtonActionListener(this,"idReciboPuntoVentaBusqueda"));
		//jButtonid_clienteReciboPuntoVenta.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_clienteReciboPuntoVentaActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormReciboPuntoVenta.jButtonid_clienteReciboPuntoVenta.addActionListener(new ButtonActionListener(this,"id_clienteReciboPuntoVenta"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormReciboPuntoVenta.jButtonid_clienteReciboPuntoVentaUpdate.addActionListener(new ButtonActionListener(this,"id_clienteReciboPuntoVentaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormReciboPuntoVenta.jButtonid_clienteReciboPuntoVentaBusqueda.addActionListener(new ButtonActionListener(this,"id_clienteReciboPuntoVentaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormReciboPuntoVenta.jButtonid_bancoReciboPuntoVentaUpdate.addActionListener(new ButtonActionListener(this,"id_bancoReciboPuntoVentaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormReciboPuntoVenta.jButtonid_bancoReciboPuntoVentaBusqueda.addActionListener(new ButtonActionListener(this,"id_bancoReciboPuntoVentaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormReciboPuntoVenta.jButtonvalor_efectivoReciboPuntoVentaBusqueda.addActionListener(new ButtonActionListener(this,"valor_efectivoReciboPuntoVentaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormReciboPuntoVenta.jButtonvalor_chequeReciboPuntoVentaBusqueda.addActionListener(new ButtonActionListener(this,"valor_chequeReciboPuntoVentaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormReciboPuntoVenta.jButtonnumero_chequeReciboPuntoVentaBusqueda.addActionListener(new ButtonActionListener(this,"numero_chequeReciboPuntoVentaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormReciboPuntoVenta.jButtonfechaReciboPuntoVentaBusqueda.addActionListener(new ButtonActionListener(this,"fechaReciboPuntoVentaBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormReciboPuntoVenta.jTabbedPaneRelacionesReciboPuntoVenta.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesReciboPuntoVenta"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameReciboPuntoVenta"));
		
		if(this.jInternalFrameDetalleFormReciboPuntoVenta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormReciboPuntoVenta.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarReciboPuntoVenta"));
		}
		
		this.jTableDatosReciboPuntoVenta.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarReciboPuntoVenta"));
		
		this.jTableDatosReciboPuntoVenta.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarReciboPuntoVenta"));
		
		this.jButtonNuevoReciboPuntoVenta.addActionListener(new ButtonActionListener(this,"NuevoReciboPuntoVenta"));
		
		this.jButtonDuplicarReciboPuntoVenta.addActionListener(new ButtonActionListener(this,"DuplicarReciboPuntoVenta"));
		
		this.jButtonCopiarReciboPuntoVenta.addActionListener(new ButtonActionListener(this,"CopiarReciboPuntoVenta"));
		
		this.jButtonVerFormReciboPuntoVenta.addActionListener(new ButtonActionListener(this,"VerFormReciboPuntoVenta"));
		
		
		this.jButtonNuevoToolBarReciboPuntoVenta.addActionListener(new ButtonActionListener(this,"NuevoToolBarReciboPuntoVenta"));
			
		this.jButtonDuplicarToolBarReciboPuntoVenta.addActionListener(new ButtonActionListener(this,"DuplicarToolBarReciboPuntoVenta"));
			
		this.jMenuItemNuevoReciboPuntoVenta.addActionListener (new ButtonActionListener(this,"MenuItemNuevoReciboPuntoVenta"));
			
		this.jMenuItemDuplicarReciboPuntoVenta.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarReciboPuntoVenta"));		
		
		
		this.jButtonNuevoRelacionesReciboPuntoVenta.addActionListener (new ButtonActionListener(this,"NuevoRelacionesReciboPuntoVenta"));
		
		
		this.jButtonNuevoRelacionesToolBarReciboPuntoVenta.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarReciboPuntoVenta"));
			
		this.jMenuItemNuevoRelacionesReciboPuntoVenta.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesReciboPuntoVenta"));		
		
		
		if(this.jInternalFrameDetalleFormReciboPuntoVenta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormReciboPuntoVenta.jButtonModificarReciboPuntoVenta.addActionListener(new ButtonActionListener(this,"ModificarReciboPuntoVenta"));
		}
		
		
		if(this.jInternalFrameDetalleFormReciboPuntoVenta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormReciboPuntoVenta.jButtonModificarToolBarReciboPuntoVenta.addActionListener(new ButtonActionListener(this,"ModificarToolBarReciboPuntoVenta"));
			
			this.jInternalFrameDetalleFormReciboPuntoVenta.jMenuItemModificarReciboPuntoVenta.addActionListener(new ButtonActionListener(this,"MenuItemModificarReciboPuntoVenta"));		
		}
		
		
		if(this.jInternalFrameDetalleFormReciboPuntoVenta!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormReciboPuntoVenta.jButtonActualizarReciboPuntoVenta.addActionListener (new ButtonActionListener(this,"ActualizarReciboPuntoVenta"));
		}
		
		
		if(this.jInternalFrameDetalleFormReciboPuntoVenta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormReciboPuntoVenta.jButtonActualizarToolBarReciboPuntoVenta.addActionListener(new ButtonActionListener(this,"ActualizarToolBarReciboPuntoVenta"));
				
			this.jInternalFrameDetalleFormReciboPuntoVenta.jMenuItemActualizarReciboPuntoVenta.addActionListener (new ButtonActionListener(this,"MenuItemActualizarReciboPuntoVenta"));		
		}
		
		
		if(this.jInternalFrameDetalleFormReciboPuntoVenta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormReciboPuntoVenta.jButtonEliminarReciboPuntoVenta.addActionListener (new ButtonActionListener(this,"EliminarReciboPuntoVenta"));
		}
		
		
		if(this.jInternalFrameDetalleFormReciboPuntoVenta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormReciboPuntoVenta.jButtonEliminarToolBarReciboPuntoVenta.addActionListener (new ButtonActionListener(this,"EliminarToolBarReciboPuntoVenta"));
						
			this.jInternalFrameDetalleFormReciboPuntoVenta.jMenuItemEliminarReciboPuntoVenta.addActionListener (new ButtonActionListener(this,"MenuItemEliminarReciboPuntoVenta"));		
		}
		
		
		if(this.jInternalFrameDetalleFormReciboPuntoVenta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormReciboPuntoVenta.jButtonCancelarReciboPuntoVenta.addActionListener (new ButtonActionListener(this,"CancelarReciboPuntoVenta"));
		}
		
		
		if(this.jInternalFrameDetalleFormReciboPuntoVenta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormReciboPuntoVenta.jButtonCancelarToolBarReciboPuntoVenta.addActionListener (new ButtonActionListener(this,"CancelarToolBarReciboPuntoVenta"));
			
			this.jInternalFrameDetalleFormReciboPuntoVenta.jMenuItemCancelarReciboPuntoVenta.addActionListener (new ButtonActionListener(this,"MenuItemCancelarReciboPuntoVenta"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarReciboPuntoVenta.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarReciboPuntoVenta"));		
		
		
		this.jButtonCerrarReciboPuntoVenta.addActionListener (new ButtonActionListener(this,"CerrarReciboPuntoVenta"));
		
		
		this.jButtonCerrarToolBarReciboPuntoVenta.addActionListener (new ButtonActionListener(this,"CerrarToolBarReciboPuntoVenta"));
			
		this.jMenuItemCerrarReciboPuntoVenta.addActionListener (new ButtonActionListener(this,"MenuItemCerrarReciboPuntoVenta"));
			
		if(this.jInternalFrameDetalleFormReciboPuntoVenta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormReciboPuntoVenta.jMenuItemDetalleCerrarReciboPuntoVenta.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarReciboPuntoVenta"));		
		}
		
		
		if(this.jInternalFrameDetalleFormReciboPuntoVenta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormReciboPuntoVenta.jButtonGuardarCambiosReciboPuntoVenta.addActionListener (new ButtonActionListener(this,"GuardarCambiosReciboPuntoVenta"));
		}
		
		
		if(this.jInternalFrameDetalleFormReciboPuntoVenta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormReciboPuntoVenta.jButtonGuardarCambiosToolBarReciboPuntoVenta.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarReciboPuntoVenta"));
		}
		
		this.jButtonCopiarToolBarReciboPuntoVenta.addActionListener (new ButtonActionListener(this,"CopiarToolBarReciboPuntoVenta"));
			
		this.jButtonVerFormToolBarReciboPuntoVenta.addActionListener (new ButtonActionListener(this,"VerFormToolBarReciboPuntoVenta"));
		
		this.jMenuItemGuardarCambiosReciboPuntoVenta.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosReciboPuntoVenta"));
			
		this.jMenuItemCopiarReciboPuntoVenta.addActionListener (new ButtonActionListener(this,"MenuItemCopiarReciboPuntoVenta"));		
		
		this.jMenuItemVerFormReciboPuntoVenta.addActionListener (new ButtonActionListener(this,"MenuItemVerFormReciboPuntoVenta"));		
		
		
		this.jButtonGuardarCambiosTablaReciboPuntoVenta.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaReciboPuntoVenta"));
		
		
		this.jButtonGuardarCambiosTablaToolBarReciboPuntoVenta.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarReciboPuntoVenta"));
			
		this.jMenuItemGuardarCambiosTablaReciboPuntoVenta.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaReciboPuntoVenta"));		
		
		
		
		this.jButtonRecargarInformacionReciboPuntoVenta.addActionListener (new ButtonActionListener(this,"RecargarInformacionReciboPuntoVenta"));
					
		this.jButtonRecargarInformacionToolBarReciboPuntoVenta.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarReciboPuntoVenta"));
		
		this.jMenuItemRecargarInformacionReciboPuntoVenta.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionReciboPuntoVenta"));		
		
		
		
		this.jButtonAnterioresReciboPuntoVenta.addActionListener (new ButtonActionListener(this,"AnterioresReciboPuntoVenta"));
		
		
		this.jButtonAnterioresToolBarReciboPuntoVenta.addActionListener (new ButtonActionListener(this,"AnterioresToolBarReciboPuntoVenta"));
		
		this.jMenuItemAnterioresReciboPuntoVenta.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresReciboPuntoVenta"));		
		
		
		this.jButtonSiguientesReciboPuntoVenta.addActionListener (new ButtonActionListener(this,"SiguientesReciboPuntoVenta"));
		
		
		this.jButtonSiguientesToolBarReciboPuntoVenta.addActionListener (new ButtonActionListener(this,"SiguientesToolBarReciboPuntoVenta"));
			
		this.jMenuItemSiguientesReciboPuntoVenta.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesReciboPuntoVenta"));
			
		this.jMenuItemAbrirOrderByReciboPuntoVenta.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByReciboPuntoVenta"));
			
		this.jMenuItemMostrarOcultarReciboPuntoVenta.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarReciboPuntoVenta"));
			
		this.jMenuItemDetalleAbrirOrderByReciboPuntoVenta.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByReciboPuntoVenta"));
			
		this.jMenuItemDetalleMostarOcultarReciboPuntoVenta.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarReciboPuntoVenta"));		
		
		
		this.jButtonNuevoGuardarCambiosReciboPuntoVenta.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosReciboPuntoVenta"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarReciboPuntoVenta.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarReciboPuntoVenta"));
			
		this.jMenuItemNuevoGuardarCambiosReciboPuntoVenta.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosReciboPuntoVenta"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosReciboPuntoVenta.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosReciboPuntoVenta"));

		this.jCheckBoxSeleccionadosReciboPuntoVenta.addItemListener(new CheckBoxItemListener(this,"SeleccionadosReciboPuntoVenta"));
		
		if(this.jInternalFrameDetalleFormReciboPuntoVenta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormReciboPuntoVenta.jComboBoxTiposAccionesFormularioReciboPuntoVenta.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioReciboPuntoVenta"));
		}
		
		
		this.jComboBoxTiposRelacionesReciboPuntoVenta.addActionListener (new ButtonActionListener(this,"TiposRelacionesReciboPuntoVenta"));
			
		this.jComboBoxTiposAccionesReciboPuntoVenta.addActionListener (new ButtonActionListener(this,"TiposAccionesReciboPuntoVenta"));
					
		this.jComboBoxTiposSeleccionarReciboPuntoVenta.addActionListener (new ButtonActionListener(this,"TiposSeleccionarReciboPuntoVenta"));
			
		this.jTextFieldValorCampoGeneralReciboPuntoVenta.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralReciboPuntoVenta"));		
		
		
		if(this.jInternalFrameDetalleFormReciboPuntoVenta!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormReciboPuntoVenta.jButtonidReciboPuntoVentaBusqueda.addActionListener(new ButtonActionListener(this,"idReciboPuntoVentaBusqueda"));
		//jButtonid_clienteReciboPuntoVenta.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_clienteReciboPuntoVentaActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormReciboPuntoVenta.jButtonid_clienteReciboPuntoVenta.addActionListener(new ButtonActionListener(this,"id_clienteReciboPuntoVenta"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormReciboPuntoVenta.jButtonid_clienteReciboPuntoVentaUpdate.addActionListener(new ButtonActionListener(this,"id_clienteReciboPuntoVentaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormReciboPuntoVenta.jButtonid_clienteReciboPuntoVentaBusqueda.addActionListener(new ButtonActionListener(this,"id_clienteReciboPuntoVentaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormReciboPuntoVenta.jButtonid_bancoReciboPuntoVentaUpdate.addActionListener(new ButtonActionListener(this,"id_bancoReciboPuntoVentaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormReciboPuntoVenta.jButtonid_bancoReciboPuntoVentaBusqueda.addActionListener(new ButtonActionListener(this,"id_bancoReciboPuntoVentaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormReciboPuntoVenta.jButtonvalor_efectivoReciboPuntoVentaBusqueda.addActionListener(new ButtonActionListener(this,"valor_efectivoReciboPuntoVentaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormReciboPuntoVenta.jButtonvalor_chequeReciboPuntoVentaBusqueda.addActionListener(new ButtonActionListener(this,"valor_chequeReciboPuntoVentaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormReciboPuntoVenta.jButtonnumero_chequeReciboPuntoVentaBusqueda.addActionListener(new ButtonActionListener(this,"numero_chequeReciboPuntoVentaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormReciboPuntoVenta.jButtonfechaReciboPuntoVentaBusqueda.addActionListener(new ButtonActionListener(this,"fechaReciboPuntoVentaBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonFK_IdBancoReciboPuntoVenta.addActionListener(new ButtonActionListener(this,"FK_IdBancoReciboPuntoVenta"));

			this.jButtonFK_IdClienteReciboPuntoVenta.addActionListener(new ButtonActionListener(this,"FK_IdClienteReciboPuntoVenta"));

			this.jButtonBuscarFK_IdClienteid_clienteReciboPuntoVenta.addActionListener(new ButtonActionListener(this,"id_clienteReciboPuntoVenta"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoReciboPuntoVenta!=null) {
				this.jInternalFrameReporteDinamicoReciboPuntoVenta.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoReciboPuntoVenta"));
				this.jInternalFrameReporteDinamicoReciboPuntoVenta.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoReciboPuntoVenta"));
				this.jInternalFrameReporteDinamicoReciboPuntoVenta.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoReciboPuntoVenta"));
			}
			
			//this.jButtonCerrarReporteDinamicoReciboPuntoVenta.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoReciboPuntoVenta"));				
			//this.jButtonGenerarReporteDinamicoReciboPuntoVenta.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoReciboPuntoVenta"));
			//this.jButtonGenerarExcelReporteDinamicoReciboPuntoVenta.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoReciboPuntoVenta"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionReciboPuntoVenta!=null) {
				this.jInternalFrameImportacionReciboPuntoVenta.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionReciboPuntoVenta"));
				this.jInternalFrameImportacionReciboPuntoVenta.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionReciboPuntoVenta"));
				this.jInternalFrameImportacionReciboPuntoVenta.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionReciboPuntoVenta"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByReciboPuntoVenta.addActionListener (new ButtonActionListener(this,"AbrirOrderByReciboPuntoVenta"));
			
			this.jButtonAbrirOrderByToolBarReciboPuntoVenta.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarReciboPuntoVenta"));			
			
			if(this.jInternalFrameOrderByReciboPuntoVenta!=null) {
				this.jInternalFrameOrderByReciboPuntoVenta.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByReciboPuntoVenta"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormReciboPuntoVenta!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormReciboPuntoVenta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormReciboPuntoVenta.jTabbedPaneRelacionesReciboPuntoVenta.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesReciboPuntoVenta"));
		
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
            		closingInternalFrameReciboPuntoVenta();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormReciboPuntoVenta.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormReciboPuntoVenta = (JInternalFrameBase)event.getSource();
	            	
	            ReciboPuntoVentaBeanSwingJInternalFrame jInternalFrameParent=(ReciboPuntoVentaBeanSwingJInternalFrame)jInternalFrameDetalleFormReciboPuntoVenta.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarReciboPuntoVentaActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosReciboPuntoVenta.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosReciboPuntoVentaListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosReciboPuntoVenta.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosReciboPuntoVenta.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoReciboPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoReciboPuntoVentaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarReciboPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoReciboPuntoVentaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoReciboPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoReciboPuntoVentaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoReciboPuntoVenta";
		inputMap = this.jButtonNuevoReciboPuntoVenta.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoReciboPuntoVenta.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoReciboPuntoVentaActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesReciboPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoReciboPuntoVentaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarReciboPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoReciboPuntoVentaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesReciboPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoReciboPuntoVentaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesReciboPuntoVenta";
		inputMap = this.jButtonNuevoRelacionesReciboPuntoVenta.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesReciboPuntoVenta.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoReciboPuntoVentaActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarReciboPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarReciboPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarReciboPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarReciboPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarReciboPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarReciboPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarReciboPuntoVenta";
		inputMap = this.jButtonModificarReciboPuntoVenta.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarReciboPuntoVenta.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarReciboPuntoVentaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarReciboPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarReciboPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarReciboPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarReciboPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarReciboPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarReciboPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarReciboPuntoVenta";
		inputMap = this.jButtonActualizarReciboPuntoVenta.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarReciboPuntoVenta.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarReciboPuntoVentaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarReciboPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarReciboPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarReciboPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarReciboPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarReciboPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarReciboPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarReciboPuntoVenta";
		inputMap = this.jButtonEliminarReciboPuntoVenta.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarReciboPuntoVenta.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarReciboPuntoVentaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarReciboPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarReciboPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarReciboPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarReciboPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarReciboPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarReciboPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarReciboPuntoVenta";
		inputMap = this.jButtonCancelarReciboPuntoVenta.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarReciboPuntoVenta.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarReciboPuntoVentaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarReciboPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReciboPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarReciboPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReciboPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarReciboPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReciboPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarReciboPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarReciboPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarReciboPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarReciboPuntoVenta";
		inputMap = this.jButtonCerrarReciboPuntoVenta.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarReciboPuntoVenta.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarReciboPuntoVentaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormReciboPuntoVenta.jButtonGuardarCambiosReciboPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosReciboPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarReciboPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosReciboPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosReciboPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosReciboPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaReciboPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosReciboPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarReciboPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosReciboPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaReciboPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosReciboPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosReciboPuntoVenta";
		inputMap = this.jInternalFrameDetalleFormReciboPuntoVenta.jButtonGuardarCambiosReciboPuntoVenta.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormReciboPuntoVenta.jButtonGuardarCambiosReciboPuntoVenta.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosReciboPuntoVentaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionReciboPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionReciboPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarReciboPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionReciboPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionReciboPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionReciboPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresReciboPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresReciboPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarReciboPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresReciboPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresReciboPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresReciboPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesReciboPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesReciboPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarReciboPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesReciboPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesReciboPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesReciboPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosReciboPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosReciboPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarReciboPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosReciboPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosReciboPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosReciboPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosReciboPuntoVenta.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosReciboPuntoVentaItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesReciboPuntoVenta.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesReciboPuntoVentaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarReciboPuntoVenta.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarReciboPuntoVentaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralReciboPuntoVenta.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralReciboPuntoVentaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormReciboPuntoVenta.jButtonidReciboPuntoVentaBusqueda.addActionListener(new ButtonActionListener(this,"idReciboPuntoVentaBusqueda"));
		//jButtonid_clienteReciboPuntoVenta.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_clienteReciboPuntoVentaActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormReciboPuntoVenta.jButtonid_clienteReciboPuntoVenta.addActionListener(new ButtonActionListener(this,"id_clienteReciboPuntoVenta"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormReciboPuntoVenta.jButtonid_clienteReciboPuntoVentaUpdate.addActionListener(new ButtonActionListener(this,"id_clienteReciboPuntoVentaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormReciboPuntoVenta.jButtonid_clienteReciboPuntoVentaBusqueda.addActionListener(new ButtonActionListener(this,"id_clienteReciboPuntoVentaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormReciboPuntoVenta.jButtonid_bancoReciboPuntoVentaUpdate.addActionListener(new ButtonActionListener(this,"id_bancoReciboPuntoVentaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormReciboPuntoVenta.jButtonid_bancoReciboPuntoVentaBusqueda.addActionListener(new ButtonActionListener(this,"id_bancoReciboPuntoVentaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormReciboPuntoVenta.jButtonvalor_efectivoReciboPuntoVentaBusqueda.addActionListener(new ButtonActionListener(this,"valor_efectivoReciboPuntoVentaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormReciboPuntoVenta.jButtonvalor_chequeReciboPuntoVentaBusqueda.addActionListener(new ButtonActionListener(this,"valor_chequeReciboPuntoVentaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormReciboPuntoVenta.jButtonnumero_chequeReciboPuntoVentaBusqueda.addActionListener(new ButtonActionListener(this,"numero_chequeReciboPuntoVentaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormReciboPuntoVenta.jButtonfechaReciboPuntoVentaBusqueda.addActionListener(new ButtonActionListener(this,"fechaReciboPuntoVentaBusqueda"));
		
		
		this.jButtonFK_IdBancoReciboPuntoVenta.addActionListener(new ButtonActionListener(this,"FK_IdBancoReciboPuntoVenta"));

		this.jButtonFK_IdClienteReciboPuntoVenta.addActionListener(new ButtonActionListener(this,"FK_IdClienteReciboPuntoVenta"));

		this.jButtonBuscarFK_IdClienteid_clienteReciboPuntoVenta.addActionListener(new ButtonActionListener(this,"id_clienteReciboPuntoVenta"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoReciboPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoReciboPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoReciboPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoReciboPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoReciboPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoReciboPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionReciboPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionReciboPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionReciboPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionReciboPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionReciboPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionReciboPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarReciboPuntoVentaActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarReciboPuntoVenta.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ReciboPuntoVentaConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosReciboPuntoVenta(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(ReciboPuntoVenta recibopuntoventaAux:this.recibopuntoventaLogic.getReciboPuntoVentas()) {
					recibopuntoventaAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ReciboPuntoVenta recibopuntoventaAux:recibopuntoventas) {
					recibopuntoventaAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ReciboPuntoVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosReciboPuntoVentaItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingReciboPuntoVenta(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(ReciboPuntoVenta recibopuntoventaAux:this.recibopuntoventaLogic.getReciboPuntoVentas()) {
						recibopuntoventaAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ReciboPuntoVenta recibopuntoventaAux:recibopuntoventas) {
						recibopuntoventaAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(ReciboPuntoVenta recibopuntoventaAux:this.recibopuntoventaLogic.getReciboPuntoVentas()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ReciboPuntoVenta recibopuntoventaAux:recibopuntoventas) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaReciboPuntoVenta(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosReciboPuntoVenta.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosReciboPuntoVenta.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosReciboPuntoVenta,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ReciboPuntoVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosReciboPuntoVentaItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingReciboPuntoVenta(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosReciboPuntoVenta.getSelectedRows();
			
			ReciboPuntoVenta recibopuntoventaLocal=new ReciboPuntoVenta();
			
			//this.seleccionarTodosReciboPuntoVenta(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					recibopuntoventaLocal =(ReciboPuntoVenta) this.recibopuntoventaLogic.getReciboPuntoVentas().toArray()[this.jTableDatosReciboPuntoVenta.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					recibopuntoventaLocal =(ReciboPuntoVenta) this.recibopuntoventas.toArray()[this.jTableDatosReciboPuntoVenta.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				recibopuntoventaLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(ReciboPuntoVenta recibopuntoventaAux:this.recibopuntoventaLogic.getReciboPuntoVentas()) {
						recibopuntoventaAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ReciboPuntoVenta recibopuntoventaAux:recibopuntoventas) {
						recibopuntoventaAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaReciboPuntoVenta(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosReciboPuntoVenta.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosReciboPuntoVenta.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosReciboPuntoVenta,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ReciboPuntoVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualReciboPuntoVentaItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ReciboPuntoVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarReciboPuntoVentaParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ReciboPuntoVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralReciboPuntoVentaActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingReciboPuntoVenta(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralReciboPuntoVenta.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(ReciboPuntoVenta recibopuntoventaAux:this.recibopuntoventaLogic.getReciboPuntoVentas()) {
				
						if(sTipoSeleccionar.equals(ReciboPuntoVentaConstantesFunciones.LABEL_VALOREFECTIVO)) {
							existe=true;
							recibopuntoventaAux.setvalor_efectivo(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ReciboPuntoVentaConstantesFunciones.LABEL_VALORCHEQUE)) {
							existe=true;
							recibopuntoventaAux.setvalor_cheque(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ReciboPuntoVentaConstantesFunciones.LABEL_NUMEROCHEQUE)) {
							existe=true;
							recibopuntoventaAux.setnumero_cheque(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ReciboPuntoVentaConstantesFunciones.LABEL_FECHA)) {
							existe=true;
							recibopuntoventaAux.setfecha(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ReciboPuntoVenta recibopuntoventaAux:recibopuntoventas) {
					
						if(sTipoSeleccionar.equals(ReciboPuntoVentaConstantesFunciones.LABEL_VALOREFECTIVO)) {
							existe=true;
							recibopuntoventaAux.setvalor_efectivo(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ReciboPuntoVentaConstantesFunciones.LABEL_VALORCHEQUE)) {
							existe=true;
							recibopuntoventaAux.setvalor_cheque(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ReciboPuntoVentaConstantesFunciones.LABEL_NUMEROCHEQUE)) {
							existe=true;
							recibopuntoventaAux.setnumero_cheque(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ReciboPuntoVentaConstantesFunciones.LABEL_FECHA)) {
							existe=true;
							recibopuntoventaAux.setfecha(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaReciboPuntoVenta(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ReciboPuntoVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesReciboPuntoVentaActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingReciboPuntoVenta(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioReciboPuntoVenta=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesReciboPuntoVenta.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormReciboPuntoVenta.jComboBoxTiposAccionesFormularioReciboPuntoVenta.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteReciboPuntoVenta) {				
					conSplash=true;//false;										
					
					//this.startProcessReciboPuntoVenta(conSplash);
				
					this.generarReporteReciboPuntoVentasSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesReciboPuntoVenta.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormReciboPuntoVenta.jComboBoxTiposAccionesFormularioReciboPuntoVenta.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoReciboPuntoVentasSeleccionados();
				//this.jComboBoxTiposAccionesReciboPuntoVenta.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoReciboPuntoVentasSeleccionados(false);
				//this.jComboBoxTiposAccionesReciboPuntoVenta.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoReciboPuntoVentasSeleccionados(true);
				//this.jComboBoxTiposAccionesReciboPuntoVenta.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessReciboPuntoVenta();
				
				this.exportarReciboPuntoVentasSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesReciboPuntoVenta.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormReciboPuntoVenta.jComboBoxTiposAccionesFormularioReciboPuntoVenta.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionReciboPuntoVentas();
				//this.importarReciboPuntoVentas();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesReciboPuntoVenta.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormReciboPuntoVenta.jComboBoxTiposAccionesFormularioReciboPuntoVenta.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessReciboPuntoVenta();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelReciboPuntoVentasSeleccionados();
				//this.jComboBoxTiposAccionesReciboPuntoVenta.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Recibo Punto Venta", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessReciboPuntoVenta();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoReciboPuntoVenta)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyReciboPuntoVenta(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Recibo Punto Venta",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesReciboPuntoVenta.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormReciboPuntoVenta.jComboBoxTiposAccionesFormularioReciboPuntoVenta.setSelectedIndex(0);					
				}	
			} 			
			else if(ReciboPuntoVentaBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteReciboPuntoVenta) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessReciboPuntoVenta(conSplash);
					
						//this.actualizarParametrosGeneralReciboPuntoVenta();
						
						this.generarReporteProcesoAccionReciboPuntoVentasSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesReciboPuntoVenta.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormReciboPuntoVenta.jComboBoxTiposAccionesFormularioReciboPuntoVenta.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(ReciboPuntoVentaBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Recibo Punto VentaS SELECCIONADOS?", "MANTENIMIENTO DE Recibo Punto Venta", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessReciboPuntoVenta();
				
						this.actualizarParametrosGeneralReciboPuntoVenta();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.recibopuntoventaReturnGeneral=recibopuntoventaLogic.procesarAccionReciboPuntoVentasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.recibopuntoventaLogic.getReciboPuntoVentas(),this.recibopuntoventaParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarReciboPuntoVentaReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesReciboPuntoVenta.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormReciboPuntoVenta.jComboBoxTiposAccionesFormularioReciboPuntoVenta.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralReciboPuntoVenta();
					
					ReciboPuntoVentaBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarReciboPuntoVentaReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesReciboPuntoVenta.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormReciboPuntoVenta.jComboBoxTiposAccionesFormularioReciboPuntoVenta.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,ReciboPuntoVentaConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessReciboPuntoVenta(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesReciboPuntoVentaActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessReciboPuntoVenta();
			
			if(this.jInternalFrameDetalleFormReciboPuntoVenta==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<ReciboPuntoVenta> recibopuntoventasSeleccionados=new ArrayList<ReciboPuntoVenta>();		
			ReciboPuntoVenta recibopuntoventa=new ReciboPuntoVenta();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingReciboPuntoVenta(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesReciboPuntoVenta.getSelectedItem();
			
			
			
			
			recibopuntoventasSeleccionados=this.getReciboPuntoVentasSeleccionados(true);
			//this.sTipoAccion;
			
			if(recibopuntoventasSeleccionados.size()==1) {
				for(ReciboPuntoVenta recibopuntoventaAux:recibopuntoventasSeleccionados) {
					recibopuntoventa=recibopuntoventaAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ReciboPuntoVentaConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessReciboPuntoVenta();
			
      		//this.finishProcessReciboPuntoVenta(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarReciboPuntoVentaReturnGeneral() throws Exception {
		if(this.recibopuntoventaReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.recibopuntoventaReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.recibopuntoventaReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.recibopuntoventaReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.recibopuntoventaReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.recibopuntoventaReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingReciboPuntoVenta(false);
		}
		
		if(this.recibopuntoventaReturnGeneral.getConRetornoLista() || this.recibopuntoventaReturnGeneral.getConRetornoObjeto()) {
			if(this.recibopuntoventaReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.recibopuntoventaLogic.setReciboPuntoVentas(this.recibopuntoventaReturnGeneral.getReciboPuntoVentas());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.recibopuntoventaReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.recibopuntoventaLogic.setReciboPuntoVenta(this.recibopuntoventaReturnGeneral.getReciboPuntoVenta());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingReciboPuntoVenta(false);
		}
	}
	
	public void actualizarParametrosGeneralReciboPuntoVenta() throws Exception {
		
		
	}
	
	public ArrayList<ReciboPuntoVenta> getReciboPuntoVentasSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<ReciboPuntoVenta> recibopuntoventasSeleccionados=new ArrayList<ReciboPuntoVenta>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioReciboPuntoVenta) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(ReciboPuntoVenta recibopuntoventaAux:recibopuntoventaLogic.getReciboPuntoVentas()) {
					if(recibopuntoventaAux.getIsSelected()) {
						recibopuntoventasSeleccionados.add(recibopuntoventaAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ReciboPuntoVenta recibopuntoventaAux:this.recibopuntoventas) {
					if(recibopuntoventaAux.getIsSelected()) {
						recibopuntoventasSeleccionados.add(recibopuntoventaAux);				
					}
				}
			}
			
			if(recibopuntoventasSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						recibopuntoventasSeleccionados.addAll(this.recibopuntoventaLogic.getReciboPuntoVentas());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						recibopuntoventasSeleccionados.addAll(this.recibopuntoventas);				
					}
				}
			}
		} else {
			recibopuntoventasSeleccionados.add(this.recibopuntoventa);
		}
		
		return recibopuntoventasSeleccionados;
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
	
	public void generarReporteReciboPuntoVentasSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalReciboPuntoVentasSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoReciboPuntoVentasSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoReciboPuntoVentasSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoReciboPuntoVentasSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Recibo Punto Venta",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesReciboPuntoVentasSeleccionados() throws Exception {
		ArrayList<ReciboPuntoVenta> recibopuntoventasSeleccionados=new ArrayList<ReciboPuntoVenta>();		
		
		recibopuntoventasSeleccionados=this.getReciboPuntoVentasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteReciboPuntoVentas("Todos",recibopuntoventasSeleccionados);
		
	}	
	
	public void generarReporteNormalReciboPuntoVentasSeleccionados() throws Exception {
		ArrayList<ReciboPuntoVenta> recibopuntoventasSeleccionados=new ArrayList<ReciboPuntoVenta>();		
		
		recibopuntoventasSeleccionados=this.getReciboPuntoVentasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteReciboPuntoVentas("Todos",recibopuntoventasSeleccionados);
	}		
	
	public void generarReporteProcesoAccionReciboPuntoVentasSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<ReciboPuntoVenta> recibopuntoventasSeleccionados=new ArrayList<ReciboPuntoVenta>();
		
		recibopuntoventasSeleccionados=this.getReciboPuntoVentasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteReciboPuntoVentas("Todos",recibopuntoventasSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoReciboPuntoVentasSeleccionados() throws Exception {
		ArrayList<ReciboPuntoVenta> recibopuntoventasSeleccionados=new ArrayList<ReciboPuntoVenta>();		
		
		
		this.abrirInicializarFrameReporteDinamicoReciboPuntoVenta();
		
		
		recibopuntoventasSeleccionados=this.getReciboPuntoVentasSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoReciboPuntoVenta();
		
		
		//this.generarReporteReciboPuntoVentas("Todos",recibopuntoventasSeleccionados ,recibopuntoventaImplementable,recibopuntoventaImplementableHome);
	}
	
	public void mostrarImportacionReciboPuntoVentas() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionReciboPuntoVenta();
		
		this.abrirFrameImportacionReciboPuntoVenta();		
		
			
		//this.generarReporteReciboPuntoVentas("Todos",recibopuntoventasSeleccionados ,recibopuntoventaImplementable,recibopuntoventaImplementableHome);
	}
	
	public void importarReciboPuntoVentas() throws Exception {		
	
	}
	
	public void exportarReciboPuntoVentasSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelReciboPuntoVentasSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoReciboPuntoVentasSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlReciboPuntoVentasSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Recibo Punto Venta",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoReciboPuntoVentasSeleccionados() throws Exception {
		ArrayList<ReciboPuntoVenta> recibopuntoventasSeleccionados=new ArrayList<ReciboPuntoVenta>();		
		
		recibopuntoventasSeleccionados=this.getReciboPuntoVentasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"recibopuntoventa."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarReciboPuntoVenta(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(ReciboPuntoVenta recibopuntoventaAux:recibopuntoventasSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarReciboPuntoVenta(recibopuntoventaAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//recibopuntoventaAux.setsDetalleGeneralEntityReporte(recibopuntoventaAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.recibopuntoventaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Recibo Punto Venta",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarReciboPuntoVenta(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=ReciboPuntoVentaConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ReciboPuntoVentaConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ReciboPuntoVentaConstantesFunciones.LABEL_IDCLIENTE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ReciboPuntoVentaConstantesFunciones.LABEL_IDBANCO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ReciboPuntoVentaConstantesFunciones.LABEL_VALOREFECTIVO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ReciboPuntoVentaConstantesFunciones.LABEL_VALORCHEQUE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ReciboPuntoVentaConstantesFunciones.LABEL_NUMEROCHEQUE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ReciboPuntoVentaConstantesFunciones.LABEL_FECHA;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarReciboPuntoVenta(ReciboPuntoVenta recibopuntoventa,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=recibopuntoventa.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=recibopuntoventa.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=recibopuntoventa.getcliente_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=recibopuntoventa.getbanco_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=recibopuntoventa.getvalor_efectivo().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=recibopuntoventa.getvalor_cheque().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=recibopuntoventa.getnumero_cheque();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=recibopuntoventa.getfecha().toString();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelReciboPuntoVentasSeleccionados() throws Exception {
		ArrayList<ReciboPuntoVenta> recibopuntoventasSeleccionados=new ArrayList<ReciboPuntoVenta>();		
		
		recibopuntoventasSeleccionados=this.getReciboPuntoVentasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"recibopuntoventa.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("ReciboPuntoVentas");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelReciboPuntoVenta(row);				
				iRow++;
			}				
			
			for(ReciboPuntoVenta recibopuntoventaAux:recibopuntoventasSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelReciboPuntoVenta(recibopuntoventaAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.recibopuntoventaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Recibo Punto Venta",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlReciboPuntoVentasSeleccionados() throws Exception {
		ArrayList<ReciboPuntoVenta> recibopuntoventasSeleccionados=new ArrayList<ReciboPuntoVenta>();		
		
		recibopuntoventasSeleccionados=this.getReciboPuntoVentasSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"recibopuntoventa.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("recibopuntoventas");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("recibopuntoventa");
			//elementRoot.appendChild(element);
		
			for(ReciboPuntoVenta recibopuntoventaAux:recibopuntoventasSeleccionados) {
				element = document.createElement("recibopuntoventa");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlReciboPuntoVenta(recibopuntoventaAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.recibopuntoventaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Recibo Punto Venta",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelReciboPuntoVenta(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(ReciboPuntoVentaConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(ReciboPuntoVentaConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(ReciboPuntoVentaConstantesFunciones.LABEL_IDCLIENTE);
		cell = row.createCell(iColumn++);cell.setCellValue(ReciboPuntoVentaConstantesFunciones.LABEL_IDBANCO);
		cell = row.createCell(iColumn++);cell.setCellValue(ReciboPuntoVentaConstantesFunciones.LABEL_VALOREFECTIVO);
		cell = row.createCell(iColumn++);cell.setCellValue(ReciboPuntoVentaConstantesFunciones.LABEL_VALORCHEQUE);
		cell = row.createCell(iColumn++);cell.setCellValue(ReciboPuntoVentaConstantesFunciones.LABEL_NUMEROCHEQUE);
		cell = row.createCell(iColumn++);cell.setCellValue(ReciboPuntoVentaConstantesFunciones.LABEL_FECHA);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelReciboPuntoVenta(ReciboPuntoVenta recibopuntoventa,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(recibopuntoventa.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(recibopuntoventa.getcliente_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(recibopuntoventa.getbanco_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(recibopuntoventa.getvalor_efectivo());
		cell = row.createCell(iColumn++);cell.setCellValue(recibopuntoventa.getvalor_cheque());
		cell = row.createCell(iColumn++);cell.setCellValue(recibopuntoventa.getnumero_cheque());
		cell = row.createCell(iColumn++);cell.setCellValue(recibopuntoventa.getfecha());				
	}
	
	public void setFilaDatosExportarXmlReciboPuntoVenta(ReciboPuntoVenta recibopuntoventa,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(ReciboPuntoVentaConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(recibopuntoventa.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(ReciboPuntoVentaConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(recibopuntoventa.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementcliente_descripcion = document.createElement(ReciboPuntoVentaConstantesFunciones.IDCLIENTE);
		elementcliente_descripcion.appendChild(document.createTextNode(recibopuntoventa.getcliente_descripcion()));
		element.appendChild(elementcliente_descripcion);

		Element elementbanco_descripcion = document.createElement(ReciboPuntoVentaConstantesFunciones.IDBANCO);
		elementbanco_descripcion.appendChild(document.createTextNode(recibopuntoventa.getbanco_descripcion()));
		element.appendChild(elementbanco_descripcion);

		Element elementvalor_efectivo = document.createElement(ReciboPuntoVentaConstantesFunciones.VALOREFECTIVO);
		elementvalor_efectivo.appendChild(document.createTextNode(recibopuntoventa.getvalor_efectivo().toString().trim()));
		element.appendChild(elementvalor_efectivo);

		Element elementvalor_cheque = document.createElement(ReciboPuntoVentaConstantesFunciones.VALORCHEQUE);
		elementvalor_cheque.appendChild(document.createTextNode(recibopuntoventa.getvalor_cheque().toString().trim()));
		element.appendChild(elementvalor_cheque);

		Element elementnumero_cheque = document.createElement(ReciboPuntoVentaConstantesFunciones.NUMEROCHEQUE);
		elementnumero_cheque.appendChild(document.createTextNode(recibopuntoventa.getnumero_cheque().trim()));
		element.appendChild(elementnumero_cheque);

		Element elementfecha = document.createElement(ReciboPuntoVentaConstantesFunciones.FECHA);
		elementfecha.appendChild(document.createTextNode(recibopuntoventa.getfecha().toString().trim()));
		element.appendChild(elementfecha);
	}
	
	public void generarReporteGroupGenericoReciboPuntoVentasSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<ReciboPuntoVenta> recibopuntoventasSeleccionados=new ArrayList<ReciboPuntoVenta>();
		
		recibopuntoventasSeleccionados=this.getReciboPuntoVentasSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoReciboPuntoVenta(recibopuntoventasSeleccionados);
		
		this.generarReporteReciboPuntoVentas("Todos",recibopuntoventasSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoReciboPuntoVenta(ArrayList<ReciboPuntoVenta> recibopuntoventasSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(ReciboPuntoVenta recibopuntoventaAux:recibopuntoventasSeleccionados) {
				recibopuntoventaAux.setsDetalleGeneralEntityReporte(recibopuntoventaAux.toString());
			
				if(sTipoSeleccionar.equals(ReciboPuntoVentaConstantesFunciones.LABEL_IDCLIENTE)) {
					existe=true;
					recibopuntoventaAux.setsDescripcionGeneralEntityReporte1(recibopuntoventaAux.getcliente_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ReciboPuntoVentaConstantesFunciones.LABEL_IDBANCO)) {
					existe=true;
					recibopuntoventaAux.setsDescripcionGeneralEntityReporte1(recibopuntoventaAux.getbanco_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ReciboPuntoVentaConstantesFunciones.LABEL_NUMEROCHEQUE)) {
					existe=true;
					recibopuntoventaAux.setsDescripcionGeneralEntityReporte1(recibopuntoventaAux.getnumero_cheque());
				}
				 else if(sTipoSeleccionar.equals(ReciboPuntoVentaConstantesFunciones.LABEL_FECHA)) {
					existe=true;
					recibopuntoventaAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(recibopuntoventaAux.getfecha()));
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ReciboPuntoVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesReciboPuntoVenta(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoReciboPuntoVenta=true;
				this.isVisibilidadCeldaNuevoRelacionesReciboPuntoVenta=true;
				this.isVisibilidadCeldaGuardarCambiosReciboPuntoVenta=true;
			}
			
			this.isVisibilidadCeldaModificarReciboPuntoVenta=false;
			this.isVisibilidadCeldaActualizarReciboPuntoVenta=false;
			this.isVisibilidadCeldaEliminarReciboPuntoVenta=false;
			this.isVisibilidadCeldaCancelarReciboPuntoVenta=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarReciboPuntoVenta=true;
				} else {
					this.isVisibilidadCeldaGuardarReciboPuntoVenta=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoReciboPuntoVenta=false;
			this.isVisibilidadCeldaNuevoRelacionesReciboPuntoVenta=false;
			this.isVisibilidadCeldaGuardarCambiosReciboPuntoVenta=false;
			this.isVisibilidadCeldaModificarReciboPuntoVenta=false;
			this.isVisibilidadCeldaActualizarReciboPuntoVenta=true;
			this.isVisibilidadCeldaEliminarReciboPuntoVenta=false;
			this.isVisibilidadCeldaCancelarReciboPuntoVenta=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarReciboPuntoVenta=true;
				} else {
					this.isVisibilidadCeldaGuardarReciboPuntoVenta=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoReciboPuntoVenta=false;
			this.isVisibilidadCeldaNuevoRelacionesReciboPuntoVenta=false;
			this.isVisibilidadCeldaGuardarCambiosReciboPuntoVenta=false;
			this.isVisibilidadCeldaModificarReciboPuntoVenta=false;
			this.isVisibilidadCeldaActualizarReciboPuntoVenta=true;
			this.isVisibilidadCeldaEliminarReciboPuntoVenta=true;
			this.isVisibilidadCeldaCancelarReciboPuntoVenta=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarReciboPuntoVenta=true;
				} else {
					this.isVisibilidadCeldaGuardarReciboPuntoVenta=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoReciboPuntoVenta=false;
			this.isVisibilidadCeldaNuevoRelacionesReciboPuntoVenta=false;
			this.isVisibilidadCeldaGuardarCambiosReciboPuntoVenta=false;
			this.isVisibilidadCeldaModificarReciboPuntoVenta=false;
			this.isVisibilidadCeldaActualizarReciboPuntoVenta=true;
			this.isVisibilidadCeldaEliminarReciboPuntoVenta=false;
			this.isVisibilidadCeldaCancelarReciboPuntoVenta=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarReciboPuntoVenta=false;
				} else {
					this.isVisibilidadCeldaGuardarReciboPuntoVenta=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoReciboPuntoVenta=true;
			this.isVisibilidadCeldaNuevoRelacionesReciboPuntoVenta=true;
			this.isVisibilidadCeldaGuardarCambiosReciboPuntoVenta=true;
			this.isVisibilidadCeldaModificarReciboPuntoVenta=false;
			this.isVisibilidadCeldaActualizarReciboPuntoVenta=false;
			this.isVisibilidadCeldaEliminarReciboPuntoVenta=false;
			this.isVisibilidadCeldaCancelarReciboPuntoVenta=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarReciboPuntoVenta=true;
				} else {
					this.isVisibilidadCeldaGuardarReciboPuntoVenta=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoReciboPuntoVenta=false;
			this.isVisibilidadCeldaNuevoRelacionesReciboPuntoVenta=false;
			this.isVisibilidadCeldaGuardarCambiosReciboPuntoVenta=false;
			this.isVisibilidadCeldaActualizarReciboPuntoVenta=false;
			this.isVisibilidadCeldaEliminarReciboPuntoVenta=false;
			this.isVisibilidadCeldaCancelarReciboPuntoVenta=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarReciboPuntoVenta=false;
				} else {
					this.isVisibilidadCeldaGuardarReciboPuntoVenta=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoReciboPuntoVenta=false;
			this.isVisibilidadCeldaNuevoRelacionesReciboPuntoVenta=false;
			this.isVisibilidadCeldaGuardarCambiosReciboPuntoVenta=false;
			this.isVisibilidadCeldaModificarReciboPuntoVenta=true;
			this.isVisibilidadCeldaActualizarReciboPuntoVenta=false;
			this.isVisibilidadCeldaEliminarReciboPuntoVenta=false;
			this.isVisibilidadCeldaCancelarReciboPuntoVenta=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarReciboPuntoVenta=false;
				} else {
					this.isVisibilidadCeldaGuardarReciboPuntoVenta=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(ReciboPuntoVentaJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoReciboPuntoVenta=true;
			this.isVisibilidadCeldaNuevoRelacionesReciboPuntoVenta=true;
			this.isVisibilidadCeldaGuardarCambiosReciboPuntoVenta=true;
		} else {
			this.actualizarEstadoPanelsReciboPuntoVenta(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarReciboPuntoVenta=false;
			//this.isVisibilidadCeldaVerFormReciboPuntoVenta=false;
			this.isVisibilidadCeldaDuplicarReciboPuntoVenta=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!recibopuntoventaSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesReciboPuntoVenta=false;
		} else {
			this.isVisibilidadCeldaNuevoReciboPuntoVenta=false;
			this.isVisibilidadCeldaGuardarCambiosReciboPuntoVenta=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(recibopuntoventaSessionBean.getEsGuardarRelacionado()) {
			if(!recibopuntoventaSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesReciboPuntoVenta=false;												
			}
			
			this.jButtonCerrarReciboPuntoVenta.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesReciboPuntoVenta=false;
		}
		
		if(!this.permiteMantenimiento(this.recibopuntoventa)) {
			this.isVisibilidadCeldaActualizarReciboPuntoVenta=false;
			this.isVisibilidadCeldaEliminarReciboPuntoVenta=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesReciboPuntoVenta() {
	}
	
	public void actualizarEstadoPanelsReciboPuntoVenta(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionReciboPuntoVenta!=null) {
				this.jScrollPanelDatosEdicionReciboPuntoVenta.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasReciboPuntoVenta!=null) {
				this.jTabbedPaneBusquedasReciboPuntoVenta.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosReciboPuntoVenta!=null) {
				this.jScrollPanelDatosReciboPuntoVenta.setVisible(true);
			}
			
			if(this.jPanelPaginacionReciboPuntoVenta!=null) {
				this.jPanelPaginacionReciboPuntoVenta.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesReciboPuntoVenta!=null) {
				this.jPanelParametrosReportesReciboPuntoVenta.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionReciboPuntoVenta!=null) {
				this.jScrollPanelDatosEdicionReciboPuntoVenta.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasReciboPuntoVenta!=null) {
				this.jTabbedPaneBusquedasReciboPuntoVenta.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosReciboPuntoVenta!=null) {
				this.jScrollPanelDatosReciboPuntoVenta.setVisible(false);
			}
			
			if(this.jPanelPaginacionReciboPuntoVenta!=null) {
				this.jPanelPaginacionReciboPuntoVenta.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesReciboPuntoVenta!=null) {
				this.jPanelParametrosReportesReciboPuntoVenta.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionReciboPuntoVenta!=null) {
				this.jScrollPanelDatosEdicionReciboPuntoVenta.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasReciboPuntoVenta!=null) {
				this.jTabbedPaneBusquedasReciboPuntoVenta.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosReciboPuntoVenta!=null) {
				this.jScrollPanelDatosReciboPuntoVenta.setVisible(false);
			}
			
			if(this.jPanelPaginacionReciboPuntoVenta!=null) {
				this.jPanelPaginacionReciboPuntoVenta.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesReciboPuntoVenta!=null) {
				this.jPanelParametrosReportesReciboPuntoVenta.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionReciboPuntoVenta!=null) {
				this.jScrollPanelDatosEdicionReciboPuntoVenta.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasReciboPuntoVenta!=null) {
				this.jTabbedPaneBusquedasReciboPuntoVenta.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosReciboPuntoVenta!=null) {
				this.jScrollPanelDatosReciboPuntoVenta.setVisible(false);
			}
			
			if(this.jPanelPaginacionReciboPuntoVenta!=null) {
				this.jPanelPaginacionReciboPuntoVenta.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesReciboPuntoVenta!=null) {
				this.jPanelParametrosReportesReciboPuntoVenta.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionReciboPuntoVenta!=null) {
				this.jScrollPanelDatosEdicionReciboPuntoVenta.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasReciboPuntoVenta!=null) {
				this.jTabbedPaneBusquedasReciboPuntoVenta.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosReciboPuntoVenta!=null) {
				this.jScrollPanelDatosReciboPuntoVenta.setVisible(true);
			}
			
			if(this.jPanelPaginacionReciboPuntoVenta!=null) {
				this.jPanelPaginacionReciboPuntoVenta.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesReciboPuntoVenta!=null) {
				this.jPanelParametrosReportesReciboPuntoVenta.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionReciboPuntoVenta!=null) {
				this.jScrollPanelDatosEdicionReciboPuntoVenta.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasReciboPuntoVenta!=null) {
				this.jTabbedPaneBusquedasReciboPuntoVenta.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosReciboPuntoVenta!=null) {
				this.jScrollPanelDatosReciboPuntoVenta.setVisible(true);
			}
			
			if(this.jPanelPaginacionReciboPuntoVenta!=null) {
				this.jPanelPaginacionReciboPuntoVenta.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesReciboPuntoVenta!=null) {
				this.jPanelParametrosReportesReciboPuntoVenta.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionReciboPuntoVenta!=null) {
				this.jScrollPanelDatosEdicionReciboPuntoVenta.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasReciboPuntoVenta!=null) {
				this.jTabbedPaneBusquedasReciboPuntoVenta.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosReciboPuntoVenta!=null) {
				this.jScrollPanelDatosReciboPuntoVenta.setVisible(true);
			}
			
			if(this.jPanelPaginacionReciboPuntoVenta!=null) {
				this.jPanelPaginacionReciboPuntoVenta.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesReciboPuntoVenta!=null) {
				this.jPanelParametrosReportesReciboPuntoVenta.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.recibopuntoventaSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasReciboPuntoVenta!=null) {
					this.jTabbedPaneBusquedasReciboPuntoVenta.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesReciboPuntoVenta!=null) {
				this.jPanelParametrosReportesReciboPuntoVenta.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.recibopuntoventaSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasReciboPuntoVenta!=null) {
				this.jTabbedPaneBusquedasReciboPuntoVenta.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesReciboPuntoVenta!=null) {
				this.jPanelParametrosReportesReciboPuntoVenta.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaCliente(Boolean isParaCliente){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaClienteNegation=!isParaCliente;

			this.isVisibilidadFK_IdBanco=isParaClienteNegation;
			if(!this.isVisibilidadFK_IdBanco) {this.jTabbedPaneBusquedasReciboPuntoVenta.remove(jPanelFK_IdBancoReciboPuntoVenta);}

			this.isVisibilidadFK_IdCliente=isParaCliente;
			if(!this.isVisibilidadFK_IdCliente) {this.jTabbedPaneBusquedasReciboPuntoVenta.remove(jPanelFK_IdClienteReciboPuntoVenta);}
		}
		
	}

	public void setVisibilidadBusquedasParaBanco(Boolean isParaBanco){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaBancoNegation=!isParaBanco;

			this.isVisibilidadFK_IdBanco=isParaBanco;
			if(!this.isVisibilidadFK_IdBanco) {this.jTabbedPaneBusquedasReciboPuntoVenta.remove(jPanelFK_IdBancoReciboPuntoVenta);}

			this.isVisibilidadFK_IdCliente=isParaBancoNegation;
			if(!this.isVisibilidadFK_IdCliente) {this.jTabbedPaneBusquedasReciboPuntoVenta.remove(jPanelFK_IdClienteReciboPuntoVenta);}
		}
		
	}
	
	
	
	

	public String registrarSesionReciboPuntoVentaParaBusquedaClientes() throws Exception {
		Boolean isPaginaPopupCliente=false;

		try {

			if(recibopuntoventaSessionBean==null) {
				recibopuntoventaSessionBean=new ReciboPuntoVentaSessionBean();
			}

			if(clienteSessionBean==null) {
				clienteSessionBean=new ClienteSessionBean();
			}

			clienteSessionBean.setsPathNavegacionActual(recibopuntoventaSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+ClienteConstantesFunciones.SCLASSWEBTITULO);
			clienteSessionBean.setisPermiteRecargarInformacion(false);
			clienteSessionBean.setisPaginaPopup(true);
			isPaginaPopupCliente=clienteSessionBean.getisPaginaPopup();
			clienteSessionBean.setisPaginaPopup(false);
			clienteSessionBean.setEstaModoBusqueda(true);
			clienteSessionBean.setsFuncionBusquedaRapida("window.opener.recibopuntoventaFuncionGeneral.setCombosCodigoDesdeBusquedaid_cliente(TO_REPLACE);");
			clienteSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeCliente(true);
			clienteSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeCliente(ReciboPuntoVentaConstantesFunciones.SNOMBREOPCION);
			//clienteSessionBean.setisBusquedaDesdeForeignKeySesionReciboPuntoVenta(true);
			//clienteSessionBean.setlidReciboPuntoVentaActual(this.idReciboPuntoVentaActual);

			recibopuntoventaSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyReciboPuntoVenta(true);
			recibopuntoventaSessionBean.setlIdReciboPuntoVentaActualForeignKey(this.idReciboPuntoVentaActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
			return "";
	}
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//ReciboPuntoVentaSessionBean recibopuntoventaSessionBean=new ReciboPuntoVentaSessionBean();
		
		if(this.recibopuntoventaSessionBean==null) {
			this.recibopuntoventaSessionBean=new ReciboPuntoVentaSessionBean();
		}
		
		this.recibopuntoventaSessionBean.setsUltimaBusquedaReciboPuntoVenta(this.getsAccionBusqueda());
		this.recibopuntoventaSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.recibopuntoventaSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdBanco")) {
			recibopuntoventaSessionBean.setid_banco(this.getid_bancoFK_IdBanco());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdCliente")) {
			recibopuntoventaSessionBean.setid_cliente(this.getid_clienteFK_IdCliente());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//ReciboPuntoVentaSessionBean recibopuntoventaSessionBean=new ReciboPuntoVentaSessionBean();
		
		if(this.recibopuntoventaSessionBean==null) {
			this.recibopuntoventaSessionBean=new ReciboPuntoVentaSessionBean();
		}
		
		if(this.recibopuntoventaSessionBean.getsUltimaBusquedaReciboPuntoVenta()!=null&&!this.recibopuntoventaSessionBean.getsUltimaBusquedaReciboPuntoVenta().equals("")) {
			this.setsAccionBusqueda(recibopuntoventaSessionBean.getsUltimaBusquedaReciboPuntoVenta());
			this.setiNumeroPaginacion(recibopuntoventaSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(recibopuntoventaSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdBanco")) {
				this.setid_bancoFK_IdBanco(recibopuntoventaSessionBean.getid_banco());
				recibopuntoventaSessionBean.setid_banco(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdCliente")) {
				this.setid_clienteFK_IdCliente(recibopuntoventaSessionBean.getid_cliente());
				recibopuntoventaSessionBean.setid_cliente(-1L);
			}
		}
		
		this.recibopuntoventaSessionBean.setsUltimaBusquedaReciboPuntoVenta("");
		this.recibopuntoventaSessionBean.setiNumeroPaginacion(ReciboPuntoVentaConstantesFunciones.INUMEROPAGINACION);
		this.recibopuntoventaSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaReciboPuntoVenta(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioReciboPuntoVenta() {
		this.updateBorderResaltarBusquedasFormularioReciboPuntoVenta();
		this.updateVisibilidadBusquedasFormularioReciboPuntoVenta();
		this.updateHabilitarBusquedasFormularioReciboPuntoVenta();
	}
	
	public void updateBorderResaltarBusquedasFormularioReciboPuntoVenta() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasReciboPuntoVenta.getComponents().length>0) {
	

		if(this.recibopuntoventaConstantesFunciones.resaltarFK_IdBancoReciboPuntoVenta!=null) {
			index= this.jTabbedPaneBusquedasReciboPuntoVenta.indexOfComponent(this.jPanelFK_IdBancoReciboPuntoVenta);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasReciboPuntoVenta.getComponent(index);
				jPanel.setBorder(this.recibopuntoventaConstantesFunciones.resaltarFK_IdBancoReciboPuntoVenta);
			}
		}

		if(this.recibopuntoventaConstantesFunciones.resaltarFK_IdClienteReciboPuntoVenta!=null) {
			index= this.jTabbedPaneBusquedasReciboPuntoVenta.indexOfComponent(this.jPanelFK_IdClienteReciboPuntoVenta);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasReciboPuntoVenta.getComponent(index);
				jPanel.setBorder(this.recibopuntoventaConstantesFunciones.resaltarFK_IdClienteReciboPuntoVenta);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioReciboPuntoVenta() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasReciboPuntoVenta.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasReciboPuntoVenta.indexOfComponent(this.jPanelFK_IdBancoReciboPuntoVenta);
			jPanel=(JPanel)this.jTabbedPaneBusquedasReciboPuntoVenta.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.recibopuntoventaConstantesFunciones.mostrarFK_IdBancoReciboPuntoVenta);
			if(!this.recibopuntoventaConstantesFunciones.mostrarFK_IdBancoReciboPuntoVenta && index>-1) {
				this.jTabbedPaneBusquedasReciboPuntoVenta.remove(index);
			}

			index= this.jTabbedPaneBusquedasReciboPuntoVenta.indexOfComponent(this.jPanelFK_IdClienteReciboPuntoVenta);
			jPanel=(JPanel)this.jTabbedPaneBusquedasReciboPuntoVenta.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.recibopuntoventaConstantesFunciones.mostrarFK_IdClienteReciboPuntoVenta);
			if(!this.recibopuntoventaConstantesFunciones.mostrarFK_IdClienteReciboPuntoVenta && index>-1) {
				this.jTabbedPaneBusquedasReciboPuntoVenta.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioReciboPuntoVenta() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasReciboPuntoVenta.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasReciboPuntoVenta.indexOfComponent(this.jPanelFK_IdBancoReciboPuntoVenta);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasReciboPuntoVenta.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.recibopuntoventaConstantesFunciones.activarFK_IdBancoReciboPuntoVenta);
				this.jTabbedPaneBusquedasReciboPuntoVenta.setEnabledAt(index,this.recibopuntoventaConstantesFunciones.activarFK_IdBancoReciboPuntoVenta);
			}

			index= this.jTabbedPaneBusquedasReciboPuntoVenta.indexOfComponent(this.jPanelFK_IdClienteReciboPuntoVenta);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasReciboPuntoVenta.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.recibopuntoventaConstantesFunciones.activarFK_IdClienteReciboPuntoVenta);
				this.jTabbedPaneBusquedasReciboPuntoVenta.setEnabledAt(index,this.recibopuntoventaConstantesFunciones.activarFK_IdClienteReciboPuntoVenta);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaReciboPuntoVenta(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("FK_IdBanco")) {
			index= this.jTabbedPaneBusquedasReciboPuntoVenta.indexOfComponent(this.jPanelFK_IdBancoReciboPuntoVenta);

			this.jTabbedPaneBusquedasReciboPuntoVenta.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasReciboPuntoVenta.getComponent(index);

			this.recibopuntoventaConstantesFunciones.setResaltarFK_IdBancoReciboPuntoVenta(resaltar);

			jPanel.setBorder(this.recibopuntoventaConstantesFunciones.resaltarFK_IdBancoReciboPuntoVenta);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdCliente")) {
			index= this.jTabbedPaneBusquedasReciboPuntoVenta.indexOfComponent(this.jPanelFK_IdClienteReciboPuntoVenta);

			this.jTabbedPaneBusquedasReciboPuntoVenta.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasReciboPuntoVenta.getComponent(index);

			this.recibopuntoventaConstantesFunciones.setResaltarFK_IdClienteReciboPuntoVenta(resaltar);

			jPanel.setBorder(this.recibopuntoventaConstantesFunciones.resaltarFK_IdClienteReciboPuntoVenta);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarReciboPuntoVenta.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioReciboPuntoVenta() throws Exception {

		if(this.jInternalFrameDetalleFormReciboPuntoVenta==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioReciboPuntoVenta();
		this.updateVisibilidadResaltarControlesFormularioReciboPuntoVenta();
		this.updateHabilitarResaltarControlesFormularioReciboPuntoVenta();
		
	}
	
	public void updateBorderResaltarControlesFormularioReciboPuntoVenta() throws Exception {
		if(this.jInternalFrameDetalleFormReciboPuntoVenta==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.recibopuntoventaConstantesFunciones.resaltaridReciboPuntoVenta!=null && this.jInternalFrameDetalleFormReciboPuntoVenta!=null) {this.jInternalFrameDetalleFormReciboPuntoVenta.jLabelidReciboPuntoVenta.setBorder(this.recibopuntoventaConstantesFunciones.resaltaridReciboPuntoVenta);}
		if(this.recibopuntoventaConstantesFunciones.resaltarid_clienteReciboPuntoVenta!=null && this.jInternalFrameDetalleFormReciboPuntoVenta!=null) {this.jInternalFrameDetalleFormReciboPuntoVenta.jComboBoxid_clienteReciboPuntoVenta.setBorder(this.recibopuntoventaConstantesFunciones.resaltarid_clienteReciboPuntoVenta);}
		if(this.recibopuntoventaConstantesFunciones.resaltarid_bancoReciboPuntoVenta!=null && this.jInternalFrameDetalleFormReciboPuntoVenta!=null) {this.jInternalFrameDetalleFormReciboPuntoVenta.jComboBoxid_bancoReciboPuntoVenta.setBorder(this.recibopuntoventaConstantesFunciones.resaltarid_bancoReciboPuntoVenta);}
		if(this.recibopuntoventaConstantesFunciones.resaltarvalor_efectivoReciboPuntoVenta!=null && this.jInternalFrameDetalleFormReciboPuntoVenta!=null) {this.jInternalFrameDetalleFormReciboPuntoVenta.jTextFieldvalor_efectivoReciboPuntoVenta.setBorder(this.recibopuntoventaConstantesFunciones.resaltarvalor_efectivoReciboPuntoVenta);}
		if(this.recibopuntoventaConstantesFunciones.resaltarvalor_chequeReciboPuntoVenta!=null && this.jInternalFrameDetalleFormReciboPuntoVenta!=null) {this.jInternalFrameDetalleFormReciboPuntoVenta.jTextFieldvalor_chequeReciboPuntoVenta.setBorder(this.recibopuntoventaConstantesFunciones.resaltarvalor_chequeReciboPuntoVenta);}
		if(this.recibopuntoventaConstantesFunciones.resaltarnumero_chequeReciboPuntoVenta!=null && this.jInternalFrameDetalleFormReciboPuntoVenta!=null) {this.jInternalFrameDetalleFormReciboPuntoVenta.jTextFieldnumero_chequeReciboPuntoVenta.setBorder(this.recibopuntoventaConstantesFunciones.resaltarnumero_chequeReciboPuntoVenta);}
		if(this.recibopuntoventaConstantesFunciones.resaltarfechaReciboPuntoVenta!=null && this.jInternalFrameDetalleFormReciboPuntoVenta!=null) {this.jInternalFrameDetalleFormReciboPuntoVenta.jDateChooserfechaReciboPuntoVenta.setBorder(this.recibopuntoventaConstantesFunciones.resaltarfechaReciboPuntoVenta);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioReciboPuntoVenta() throws Exception {		
		if(this.jInternalFrameDetalleFormReciboPuntoVenta==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormReciboPuntoVenta!=null) {
	
		//this.jInternalFrameDetalleFormReciboPuntoVenta.jLabelidReciboPuntoVenta.setVisible(this.recibopuntoventaConstantesFunciones.mostraridReciboPuntoVenta);
		this.jInternalFrameDetalleFormReciboPuntoVenta.jPanelidReciboPuntoVenta.setVisible(this.recibopuntoventaConstantesFunciones.mostraridReciboPuntoVenta);
		//this.jInternalFrameDetalleFormReciboPuntoVenta.jComboBoxid_clienteReciboPuntoVenta.setVisible(this.recibopuntoventaConstantesFunciones.mostrarid_clienteReciboPuntoVenta);
		this.jInternalFrameDetalleFormReciboPuntoVenta.jPanelid_clienteReciboPuntoVenta.setVisible(this.recibopuntoventaConstantesFunciones.mostrarid_clienteReciboPuntoVenta);
			this.jInternalFrameDetalleFormReciboPuntoVenta.jButtonid_clienteReciboPuntoVenta.setVisible(this.recibopuntoventaConstantesFunciones.mostrarid_clienteReciboPuntoVenta);
		//this.jInternalFrameDetalleFormReciboPuntoVenta.jComboBoxid_bancoReciboPuntoVenta.setVisible(this.recibopuntoventaConstantesFunciones.mostrarid_bancoReciboPuntoVenta);
		this.jInternalFrameDetalleFormReciboPuntoVenta.jPanelid_bancoReciboPuntoVenta.setVisible(this.recibopuntoventaConstantesFunciones.mostrarid_bancoReciboPuntoVenta);
		//this.jInternalFrameDetalleFormReciboPuntoVenta.jTextFieldvalor_efectivoReciboPuntoVenta.setVisible(this.recibopuntoventaConstantesFunciones.mostrarvalor_efectivoReciboPuntoVenta);
		this.jInternalFrameDetalleFormReciboPuntoVenta.jPanelvalor_efectivoReciboPuntoVenta.setVisible(this.recibopuntoventaConstantesFunciones.mostrarvalor_efectivoReciboPuntoVenta);
		//this.jInternalFrameDetalleFormReciboPuntoVenta.jTextFieldvalor_chequeReciboPuntoVenta.setVisible(this.recibopuntoventaConstantesFunciones.mostrarvalor_chequeReciboPuntoVenta);
		this.jInternalFrameDetalleFormReciboPuntoVenta.jPanelvalor_chequeReciboPuntoVenta.setVisible(this.recibopuntoventaConstantesFunciones.mostrarvalor_chequeReciboPuntoVenta);
		//this.jInternalFrameDetalleFormReciboPuntoVenta.jTextFieldnumero_chequeReciboPuntoVenta.setVisible(this.recibopuntoventaConstantesFunciones.mostrarnumero_chequeReciboPuntoVenta);
		this.jInternalFrameDetalleFormReciboPuntoVenta.jPanelnumero_chequeReciboPuntoVenta.setVisible(this.recibopuntoventaConstantesFunciones.mostrarnumero_chequeReciboPuntoVenta);
		//this.jInternalFrameDetalleFormReciboPuntoVenta.jDateChooserfechaReciboPuntoVenta.setVisible(this.recibopuntoventaConstantesFunciones.mostrarfechaReciboPuntoVenta);
		this.jInternalFrameDetalleFormReciboPuntoVenta.jPanelfechaReciboPuntoVenta.setVisible(this.recibopuntoventaConstantesFunciones.mostrarfechaReciboPuntoVenta);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioReciboPuntoVenta() throws Exception {
		if(this.jInternalFrameDetalleFormReciboPuntoVenta==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormReciboPuntoVenta!=null) {
	
		this.jInternalFrameDetalleFormReciboPuntoVenta.jLabelidReciboPuntoVenta.setEnabled(this.recibopuntoventaConstantesFunciones.activaridReciboPuntoVenta);
		this.jInternalFrameDetalleFormReciboPuntoVenta.jComboBoxid_clienteReciboPuntoVenta.setEnabled(this.recibopuntoventaConstantesFunciones.activarid_clienteReciboPuntoVenta);
			this.jInternalFrameDetalleFormReciboPuntoVenta.jButtonid_clienteReciboPuntoVenta.setEnabled(this.recibopuntoventaConstantesFunciones.activarid_clienteReciboPuntoVenta);
		this.jInternalFrameDetalleFormReciboPuntoVenta.jComboBoxid_bancoReciboPuntoVenta.setEnabled(this.recibopuntoventaConstantesFunciones.activarid_bancoReciboPuntoVenta);
		this.jInternalFrameDetalleFormReciboPuntoVenta.jTextFieldvalor_efectivoReciboPuntoVenta.setEnabled(this.recibopuntoventaConstantesFunciones.activarvalor_efectivoReciboPuntoVenta);
		this.jInternalFrameDetalleFormReciboPuntoVenta.jTextFieldvalor_chequeReciboPuntoVenta.setEnabled(this.recibopuntoventaConstantesFunciones.activarvalor_chequeReciboPuntoVenta);
		this.jInternalFrameDetalleFormReciboPuntoVenta.jTextFieldnumero_chequeReciboPuntoVenta.setEnabled(this.recibopuntoventaConstantesFunciones.activarnumero_chequeReciboPuntoVenta);
		this.jInternalFrameDetalleFormReciboPuntoVenta.jDateChooserfechaReciboPuntoVenta.setEnabled(this.recibopuntoventaConstantesFunciones.activarfechaReciboPuntoVenta);
		}
	}
	
		
}