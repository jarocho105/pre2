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
package com.bydan.erp.facturacion.presentation.swing.jinternalframes.report;




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

//import com.bydan.erp.facturacion.util.ProcesoPedidosConstantesFunciones;
import com.bydan.erp.facturacion.util.report.ProcesoPedidosParameterReturnGeneral;
//import com.bydan.erp.facturacion.util.report.ProcesoPedidosParameterGeneral;
//import com.bydan.erp.facturacion.presentation.report.source.report.ProcesoPedidosBean;
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

import com.bydan.erp.facturacion.presentation.swing.jinternalframes.auxiliar.report.*;
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
import com.bydan.erp.facturacion.resources.reportes.report.AuxiliarReportes;

import com.bydan.erp.facturacion.util.*;

import com.bydan.erp.facturacion.util.report.*;
import com.bydan.erp.facturacion.business.logic.report.*;

import com.bydan.erp.seguridad.business.logic.*;
import com.bydan.erp.cartera.business.logic.*;
import com.bydan.erp.comisiones.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.facturacion.business.entity.*;
import com.bydan.erp.facturacion.business.entity.report.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.comisiones.presentation.swing.jinternalframes.*;

import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.comisiones.presentation.swing.jinternalframes.auxiliar.*;






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


import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.report.*;

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
import com.bydan.erp.comisiones.business.entity.*;
import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.cartera.util.*;
import com.bydan.erp.comisiones.util.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.comisiones.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class ProcesoPedidosBeanSwingJInternalFrame extends ProcesoPedidosJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(ProcesoPedidosBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<ProcesoPedidos> procesopedidosValidator = new ClassValidator<ProcesoPedidos>(ProcesoPedidos.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public ProcesoPedidos procesopedidos;	
	public ProcesoPedidos procesopedidosAux;
	public ProcesoPedidos procesopedidosAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public ProcesoPedidos procesopedidosTotales;
	public Long idProcesoPedidosActual;
	public Long iIdNuevoProcesoPedidos=0L;
	public int rowIndexActual=0;
	
	
	
	
	public String sFinalQueryComboCiudad="";

	public List<Ciudad> ciudadsForeignKey;

	public List<Ciudad> getciudadsForeignKey() {
		return ciudadsForeignKey;
	}

	public void setciudadsForeignKey(List<Ciudad> ciudadsForeignKey) {
		this.ciudadsForeignKey = ciudadsForeignKey;
	}

	//OBJETO FK ACTUAL
	public Ciudad ciudadForeignKey;

	public Ciudad getciudadForeignKey() {
		return ciudadForeignKey;
	}

	public void setciudadForeignKey(Ciudad ciudadForeignKey) {
		this.ciudadForeignKey = ciudadForeignKey;
	}

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

	public String sFinalQueryComboVendedor="";

	public List<Vendedor> vendedorsForeignKey;

	public List<Vendedor> getvendedorsForeignKey() {
		return vendedorsForeignKey;
	}

	public void setvendedorsForeignKey(List<Vendedor> vendedorsForeignKey) {
		this.vendedorsForeignKey = vendedorsForeignKey;
	}

	//OBJETO FK ACTUAL
	public Vendedor vendedorForeignKey;

	public Vendedor getvendedorForeignKey() {
		return vendedorForeignKey;
	}

	public void setvendedorForeignKey(Vendedor vendedorForeignKey) {
		this.vendedorForeignKey = vendedorForeignKey;
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
	
	public Boolean isPermisoTodoProcesoPedidos;
	public Boolean isPermisoNuevoProcesoPedidos;
	public Boolean isPermisoActualizarProcesoPedidos;
	public Boolean isPermisoActualizarOriginalProcesoPedidos;
	public Boolean isPermisoEliminarProcesoPedidos;
	public Boolean isPermisoGuardarCambiosProcesoPedidos;
	public Boolean isPermisoConsultaProcesoPedidos;
	public Boolean isPermisoBusquedaProcesoPedidos;
	public Boolean isPermisoReporteProcesoPedidos;
	public Boolean isPermisoPaginacionMedioProcesoPedidos;
	public Boolean isPermisoPaginacionAltoProcesoPedidos;
	public Boolean isPermisoPaginacionTodoProcesoPedidos;
	public Boolean isPermisoCopiarProcesoPedidos;
	public Boolean isPermisoVerFormProcesoPedidos;
	public Boolean isPermisoDuplicarProcesoPedidos;
	public Boolean isPermisoOrdenProcesoPedidos;
	
	
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
	
	public ProcesoPedidosParameterReturnGeneral procesopedidosReturnGeneral;
	public ProcesoPedidosParameterReturnGeneral procesopedidosParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoProcesoPedidos=false;
	public Boolean esParaAccionDesdeFormularioProcesoPedidos=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected ProcesoPedidosSessionBeanAdditional procesopedidosSessionBeanAdditional=null;
	
	public ProcesoPedidosSessionBeanAdditional getProcesoPedidosSessionBeanAdditional() {
		return this.procesopedidosSessionBeanAdditional;
	}
	
	public void setProcesoPedidosSessionBeanAdditional(ProcesoPedidosSessionBeanAdditional procesopedidosSessionBeanAdditional) {
		try {
			this.procesopedidosSessionBeanAdditional=procesopedidosSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected ProcesoPedidosBeanSwingJInternalFrameAdditional procesopedidosBeanSwingJInternalFrameAdditional=null;
	//public class ProcesoPedidosBeanSwingJInternalFrame
	
	public ProcesoPedidosBeanSwingJInternalFrameAdditional getProcesoPedidosBeanSwingJInternalFrameAdditional() {
		return this.procesopedidosBeanSwingJInternalFrameAdditional;
	}
	
	public void setProcesoPedidosBeanSwingJInternalFrameAdditional(ProcesoPedidosBeanSwingJInternalFrameAdditional procesopedidosBeanSwingJInternalFrameAdditional) {
		try {
			this.procesopedidosBeanSwingJInternalFrameAdditional=procesopedidosBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public ProcesoPedidosLogic procesopedidosLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public ProcesoPedidos procesopedidosBean;
	public ProcesoPedidosConstantesFunciones procesopedidosConstantesFunciones;
	//public ProcesoPedidosParameterReturnGeneral procesopedidosReturnGeneral;
	
	//FK
	
	public CiudadLogic ciudadLogic;
	public ZonaLogic zonaLogic;
	public GrupoClienteLogic grupoclienteLogic;
	public VendedorLogic vendedorLogic;
	
	//PARAMETROS
	
	
	//public List<ProcesoPedidos> procesopedidoss;	
	//public List<ProcesoPedidos> procesopedidossEliminados;
	//public List<ProcesoPedidos> procesopedidossAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoProcesoPedidos=false;
	public Boolean isVisibilidadCeldaDuplicarProcesoPedidos=true;
	public Boolean isVisibilidadCeldaCopiarProcesoPedidos=true;
	public Boolean isVisibilidadCeldaVerFormProcesoPedidos=true;
	public Boolean isVisibilidadCeldaOrdenProcesoPedidos=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesProcesoPedidos=false;
	public Boolean isVisibilidadCeldaModificarProcesoPedidos=false;
	public Boolean isVisibilidadCeldaActualizarProcesoPedidos=false;
	public Boolean isVisibilidadCeldaEliminarProcesoPedidos=false;
	public Boolean isVisibilidadCeldaCancelarProcesoPedidos=false;
	public Boolean isVisibilidadCeldaGuardarProcesoPedidos=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosProcesoPedidos=false;	
	
	
	public Boolean isVisibilidadBusquedaProcesoPedidos=false;
	public Boolean isVisibilidadFK_IdCiudad=false;
	public Boolean isVisibilidadFK_IdGrupoCliente=false;
	public Boolean isVisibilidadFK_IdVendedor=false;
	public Boolean isVisibilidadFK_IdZona=false;
	
	public Long getiIdNuevoProcesoPedidos() {
		return this.iIdNuevoProcesoPedidos;
	}

	public void setiIdNuevoProcesoPedidos(Long iIdNuevoProcesoPedidos) {
		this.iIdNuevoProcesoPedidos = iIdNuevoProcesoPedidos;
	}
	
	public Long getidProcesoPedidosActual() {
		return this.idProcesoPedidosActual;
	}

	public void setidProcesoPedidosActual(Long idProcesoPedidosActual) {
		this.idProcesoPedidosActual = idProcesoPedidosActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public ProcesoPedidos getprocesopedidos() {
		return this.procesopedidos;
	}

	public void setprocesopedidos(ProcesoPedidos procesopedidos) {
		this.procesopedidos = procesopedidos;
	}
	
	public ProcesoPedidos getprocesopedidosAux() {
		return this.procesopedidosAux;
	}

	public void setprocesopedidosAux(ProcesoPedidos procesopedidosAux) {
		this.procesopedidosAux = procesopedidosAux;
	}				
	
	public ProcesoPedidos getprocesopedidosAnterior() {
		return this.procesopedidosAnterior;
	}

	public void setprocesopedidosAnterior(ProcesoPedidos procesopedidosAnterior) {
		this.procesopedidosAnterior = procesopedidosAnterior;
	}	
	
	public ProcesoPedidos getprocesopedidosTotales() {
		return this.procesopedidosTotales;
	}

	public void setprocesopedidosTotales(ProcesoPedidos procesopedidosTotales) {
		this.procesopedidosTotales = procesopedidosTotales;
	}	
	
	public ProcesoPedidos getprocesopedidosBean() {
		return this.procesopedidosBean;
	}

	public void setprocesopedidosBean(ProcesoPedidos procesopedidosBean) {
		this.procesopedidosBean = procesopedidosBean;
	}	
	
	public ProcesoPedidosParameterReturnGeneral getprocesopedidosReturnGeneral() {
		return this.procesopedidosReturnGeneral;
	}

	public void setprocesopedidosReturnGeneral(ProcesoPedidosParameterReturnGeneral procesopedidosReturnGeneral) {
		this.procesopedidosReturnGeneral = procesopedidosReturnGeneral;
	}	
	
	
	public Long id_ciudadBusquedaProcesoPedidos=-1L;

	public Long getid_ciudadBusquedaProcesoPedidos() {
		return this.id_ciudadBusquedaProcesoPedidos;
	}

	public void setid_ciudadBusquedaProcesoPedidos(Long id_ciudadBusquedaProcesoPedidos) {
		this.id_ciudadBusquedaProcesoPedidos = id_ciudadBusquedaProcesoPedidos;
	}

;
	public Long id_zonaBusquedaProcesoPedidos=-1L;

	public Long getid_zonaBusquedaProcesoPedidos() {
		return this.id_zonaBusquedaProcesoPedidos;
	}

	public void setid_zonaBusquedaProcesoPedidos(Long id_zonaBusquedaProcesoPedidos) {
		this.id_zonaBusquedaProcesoPedidos = id_zonaBusquedaProcesoPedidos;
	}

;
	public Long id_grupo_clienteBusquedaProcesoPedidos=-1L;

	public Long getid_grupo_clienteBusquedaProcesoPedidos() {
		return this.id_grupo_clienteBusquedaProcesoPedidos;
	}

	public void setid_grupo_clienteBusquedaProcesoPedidos(Long id_grupo_clienteBusquedaProcesoPedidos) {
		this.id_grupo_clienteBusquedaProcesoPedidos = id_grupo_clienteBusquedaProcesoPedidos;
	}

;
	public Long id_vendedorBusquedaProcesoPedidos=-1L;

	public Long getid_vendedorBusquedaProcesoPedidos() {
		return this.id_vendedorBusquedaProcesoPedidos;
	}

	public void setid_vendedorBusquedaProcesoPedidos(Long id_vendedorBusquedaProcesoPedidos) {
		this.id_vendedorBusquedaProcesoPedidos = id_vendedorBusquedaProcesoPedidos;
	}

	public Long id_ciudadFK_IdCiudad=-1L;

	public Long getid_ciudadFK_IdCiudad() {
		return this.id_ciudadFK_IdCiudad;
	}

	public void setid_ciudadFK_IdCiudad(Long id_ciudadFK_IdCiudad) {
		this.id_ciudadFK_IdCiudad = id_ciudadFK_IdCiudad;
	}

	public Long id_grupo_clienteFK_IdGrupoCliente=-1L;

	public Long getid_grupo_clienteFK_IdGrupoCliente() {
		return this.id_grupo_clienteFK_IdGrupoCliente;
	}

	public void setid_grupo_clienteFK_IdGrupoCliente(Long id_grupo_clienteFK_IdGrupoCliente) {
		this.id_grupo_clienteFK_IdGrupoCliente = id_grupo_clienteFK_IdGrupoCliente;
	}

	public Long id_vendedorFK_IdVendedor=-1L;

	public Long getid_vendedorFK_IdVendedor() {
		return this.id_vendedorFK_IdVendedor;
	}

	public void setid_vendedorFK_IdVendedor(Long id_vendedorFK_IdVendedor) {
		this.id_vendedorFK_IdVendedor = id_vendedorFK_IdVendedor;
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
	
	
	public ProcesoPedidosLogic getProcesoPedidosLogic()	{		
		return procesopedidosLogic;
	}

	public void setProcesoPedidosLogic(ProcesoPedidosLogic procesopedidosLogic) {
		this.procesopedidosLogic = procesopedidosLogic;
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
	
	public Boolean getIsEsNuevoProcesoPedidos() {
		return isEsNuevoProcesoPedidos;
	}

	public void setIsEsNuevoProcesoPedidos(Boolean isEsNuevoProcesoPedidos) {
		this.isEsNuevoProcesoPedidos = isEsNuevoProcesoPedidos;
	}

	public Boolean getEsParaAccionDesdeFormularioProcesoPedidos() {
		return esParaAccionDesdeFormularioProcesoPedidos;
	}
	
	public void setEsParaAccionDesdeFormularioProcesoPedidos(Boolean esParaAccionDesdeFormularioProcesoPedidos) {
		this.esParaAccionDesdeFormularioProcesoPedidos = esParaAccionDesdeFormularioProcesoPedidos;
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
	
	
	public void cargarCombosCiudadsForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.ciudadsForeignKey=new ArrayList<Ciudad>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			CiudadLogic ciudadLogic=new CiudadLogic();

			ciudadLogic.getCiudadDataAccess().setIsForForeingKeyData(true);

			if(this.procesopedidosSessionBean==null) {
				this.procesopedidosSessionBean=new ProcesoPedidosSessionBean();
			}

			if(!this.procesopedidosSessionBean.getisBusquedaDesdeForeignKeySesionCiudad()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					ciudadLogic.getCiudadDataAccess().setIsForForeingKeyData(true);

					ciudadLogic.getTodosCiudadsWithConnection(sFinalQuery,new Pagination());

					this.ciudadsForeignKey=ciudadLogic.getCiudads();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaCiudad(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					ciudadLogic.getEntityWithConnection(procesopedidosSessionBean.getlidCiudadActual());
					this.ciudadsForeignKey.add(ciudadLogic.getCiudad());
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

			if(this.procesopedidosSessionBean==null) {
				this.procesopedidosSessionBean=new ProcesoPedidosSessionBean();
			}

			if(!this.procesopedidosSessionBean.getisBusquedaDesdeForeignKeySesionZona()) {
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
					zonaLogic.getEntityWithConnection(procesopedidosSessionBean.getlidZonaActual());
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

			if(this.procesopedidosSessionBean==null) {
				this.procesopedidosSessionBean=new ProcesoPedidosSessionBean();
			}

			if(!this.procesopedidosSessionBean.getisBusquedaDesdeForeignKeySesionGrupoCliente()) {
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
					grupoclienteLogic.getEntityWithConnection(procesopedidosSessionBean.getlidGrupoClienteActual());
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

	public void cargarCombosVendedorsForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.vendedorsForeignKey=new ArrayList<Vendedor>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			VendedorLogic vendedorLogic=new VendedorLogic();

			vendedorLogic.getVendedorDataAccess().setIsForForeingKeyData(true);

			if(this.procesopedidosSessionBean==null) {
				this.procesopedidosSessionBean=new ProcesoPedidosSessionBean();
			}

			if(!this.procesopedidosSessionBean.getisBusquedaDesdeForeignKeySesionVendedor()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					vendedorLogic.getVendedorDataAccess().setIsForForeingKeyData(true);

					vendedorLogic.getTodosVendedorsWithConnection(sFinalQuery,new Pagination());

					this.vendedorsForeignKey=vendedorLogic.getVendedors();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaVendedor(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					vendedorLogic.getEntityWithConnection(procesopedidosSessionBean.getlidVendedorActual());
					this.vendedorsForeignKey.add(vendedorLogic.getVendedor());
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

	
	
	public void setActualCiudadForeignKey(Long idCiudadSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Ciudad  ciudadTemp=null;

			for(Ciudad ciudadAux:ciudadsForeignKey) {
				if(ciudadAux.getId()!=null && ciudadAux.getId().equals(idCiudadSeleccionado)) {
					ciudadTemp=ciudadAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(ciudadTemp!=null) {

					if(this.procesopedidos!=null) {
						this.procesopedidos.setCiudad(ciudadTemp);
					}

					if(this.jInternalFrameDetalleFormProcesoPedidos!=null) {
						this.jInternalFrameDetalleFormProcesoPedidos.jComboBoxid_ciudadProcesoPedidos.setSelectedItem(ciudadTemp);
					}
				} else {
					//jComboBoxid_ciudadProcesoPedidos.setSelectedItem(ciudadTemp);
					if(this.jInternalFrameDetalleFormProcesoPedidos!=null) {
						if(this.jInternalFrameDetalleFormProcesoPedidos.jComboBoxid_ciudadProcesoPedidos.getItemCount()>0) {
							this.jInternalFrameDetalleFormProcesoPedidos.jComboBoxid_ciudadProcesoPedidos.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaProcesoPedidos") || sFormularioTipoBusqueda.equals("Todos")){
					if(ciudadTemp!=null && jComboBoxid_ciudadBusquedaProcesoPedidosProcesoPedidos!=null) {
						jComboBoxid_ciudadBusquedaProcesoPedidosProcesoPedidos.setSelectedItem(ciudadTemp);
					} else {
						if(jComboBoxid_ciudadBusquedaProcesoPedidosProcesoPedidos!=null) {
							//jComboBoxid_ciudadBusquedaProcesoPedidosProcesoPedidos.setSelectedItem(ciudadTemp);
							if(jComboBoxid_ciudadBusquedaProcesoPedidosProcesoPedidos.getItemCount()>0) {
								jComboBoxid_ciudadBusquedaProcesoPedidosProcesoPedidos.setSelectedIndex(0);
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

	public String getActualCiudadForeignKeyDescripcion(Long idCiudadSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Ciudad  ciudadTemp=null;

			for(Ciudad ciudadAux:ciudadsForeignKey) {
				if(ciudadAux.getId()!=null && ciudadAux.getId().equals(idCiudadSeleccionado)) {
					ciudadTemp=ciudadAux;
					break;
				}
			}


			sDescripcion=CiudadConstantesFunciones.getCiudadDescripcion(ciudadTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualCiudadForeignKeyGenerico(Long idCiudadSeleccionado,JComboBox jComboBoxid_ciudadProcesoPedidosGenerico)throws Exception
	{
		try
		{
			Ciudad  ciudadTemp=null;

			for(Ciudad ciudadAux:ciudadsForeignKey) {
				if(ciudadAux.getId()!=null && ciudadAux.getId().equals(idCiudadSeleccionado)) {
					ciudadTemp=ciudadAux;
					break;
				}
			}

			if(ciudadTemp!=null) {
				jComboBoxid_ciudadProcesoPedidosGenerico.setSelectedItem(ciudadTemp);
			} else {
				if(jComboBoxid_ciudadProcesoPedidosGenerico!=null && jComboBoxid_ciudadProcesoPedidosGenerico.getItemCount()>0) {
					jComboBoxid_ciudadProcesoPedidosGenerico.setSelectedIndex(0);
				}
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

					if(this.procesopedidos!=null) {
						this.procesopedidos.setZona(zonaTemp);
					}

					if(this.jInternalFrameDetalleFormProcesoPedidos!=null) {
						this.jInternalFrameDetalleFormProcesoPedidos.jComboBoxid_zonaProcesoPedidos.setSelectedItem(zonaTemp);
					}
				} else {
					//jComboBoxid_zonaProcesoPedidos.setSelectedItem(zonaTemp);
					if(this.jInternalFrameDetalleFormProcesoPedidos!=null) {
						if(this.jInternalFrameDetalleFormProcesoPedidos.jComboBoxid_zonaProcesoPedidos.getItemCount()>0) {
							this.jInternalFrameDetalleFormProcesoPedidos.jComboBoxid_zonaProcesoPedidos.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaProcesoPedidos") || sFormularioTipoBusqueda.equals("Todos")){
					if(zonaTemp!=null && jComboBoxid_zonaBusquedaProcesoPedidosProcesoPedidos!=null) {
						jComboBoxid_zonaBusquedaProcesoPedidosProcesoPedidos.setSelectedItem(zonaTemp);
					} else {
						if(jComboBoxid_zonaBusquedaProcesoPedidosProcesoPedidos!=null) {
							//jComboBoxid_zonaBusquedaProcesoPedidosProcesoPedidos.setSelectedItem(zonaTemp);
							if(jComboBoxid_zonaBusquedaProcesoPedidosProcesoPedidos.getItemCount()>0) {
								jComboBoxid_zonaBusquedaProcesoPedidosProcesoPedidos.setSelectedIndex(0);
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
	public void setActualZonaForeignKeyGenerico(Long idZonaSeleccionado,JComboBox jComboBoxid_zonaProcesoPedidosGenerico)throws Exception
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
				jComboBoxid_zonaProcesoPedidosGenerico.setSelectedItem(zonaTemp);
			} else {
				if(jComboBoxid_zonaProcesoPedidosGenerico!=null && jComboBoxid_zonaProcesoPedidosGenerico.getItemCount()>0) {
					jComboBoxid_zonaProcesoPedidosGenerico.setSelectedIndex(0);
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

					if(this.procesopedidos!=null) {
						this.procesopedidos.setGrupoCliente(grupoclienteTemp);
					}

					if(this.jInternalFrameDetalleFormProcesoPedidos!=null) {
						this.jInternalFrameDetalleFormProcesoPedidos.jComboBoxid_grupo_clienteProcesoPedidos.setSelectedItem(grupoclienteTemp);
					}
				} else {
					//jComboBoxid_grupo_clienteProcesoPedidos.setSelectedItem(grupoclienteTemp);
					if(this.jInternalFrameDetalleFormProcesoPedidos!=null) {
						if(this.jInternalFrameDetalleFormProcesoPedidos.jComboBoxid_grupo_clienteProcesoPedidos.getItemCount()>0) {
							this.jInternalFrameDetalleFormProcesoPedidos.jComboBoxid_grupo_clienteProcesoPedidos.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaProcesoPedidos") || sFormularioTipoBusqueda.equals("Todos")){
					if(grupoclienteTemp!=null && jComboBoxid_grupo_clienteBusquedaProcesoPedidosProcesoPedidos!=null) {
						jComboBoxid_grupo_clienteBusquedaProcesoPedidosProcesoPedidos.setSelectedItem(grupoclienteTemp);
					} else {
						if(jComboBoxid_grupo_clienteBusquedaProcesoPedidosProcesoPedidos!=null) {
							//jComboBoxid_grupo_clienteBusquedaProcesoPedidosProcesoPedidos.setSelectedItem(grupoclienteTemp);
							if(jComboBoxid_grupo_clienteBusquedaProcesoPedidosProcesoPedidos.getItemCount()>0) {
								jComboBoxid_grupo_clienteBusquedaProcesoPedidosProcesoPedidos.setSelectedIndex(0);
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
	public void setActualGrupoClienteForeignKeyGenerico(Long idGrupoClienteSeleccionado,JComboBox jComboBoxid_grupo_clienteProcesoPedidosGenerico)throws Exception
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
				jComboBoxid_grupo_clienteProcesoPedidosGenerico.setSelectedItem(grupoclienteTemp);
			} else {
				if(jComboBoxid_grupo_clienteProcesoPedidosGenerico!=null && jComboBoxid_grupo_clienteProcesoPedidosGenerico.getItemCount()>0) {
					jComboBoxid_grupo_clienteProcesoPedidosGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualVendedorForeignKey(Long idVendedorSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Vendedor  vendedorTemp=null;

			for(Vendedor vendedorAux:vendedorsForeignKey) {
				if(vendedorAux.getId()!=null && vendedorAux.getId().equals(idVendedorSeleccionado)) {
					vendedorTemp=vendedorAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(vendedorTemp!=null) {

					if(this.procesopedidos!=null) {
						this.procesopedidos.setVendedor(vendedorTemp);
					}

					if(this.jInternalFrameDetalleFormProcesoPedidos!=null) {
						this.jInternalFrameDetalleFormProcesoPedidos.jComboBoxid_vendedorProcesoPedidos.setSelectedItem(vendedorTemp);
					}
				} else {
					//jComboBoxid_vendedorProcesoPedidos.setSelectedItem(vendedorTemp);
					if(this.jInternalFrameDetalleFormProcesoPedidos!=null) {
						if(this.jInternalFrameDetalleFormProcesoPedidos.jComboBoxid_vendedorProcesoPedidos.getItemCount()>0) {
							this.jInternalFrameDetalleFormProcesoPedidos.jComboBoxid_vendedorProcesoPedidos.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaProcesoPedidos") || sFormularioTipoBusqueda.equals("Todos")){
					if(vendedorTemp!=null && jComboBoxid_vendedorBusquedaProcesoPedidosProcesoPedidos!=null) {
						jComboBoxid_vendedorBusquedaProcesoPedidosProcesoPedidos.setSelectedItem(vendedorTemp);
					} else {
						if(jComboBoxid_vendedorBusquedaProcesoPedidosProcesoPedidos!=null) {
							//jComboBoxid_vendedorBusquedaProcesoPedidosProcesoPedidos.setSelectedItem(vendedorTemp);
							if(jComboBoxid_vendedorBusquedaProcesoPedidosProcesoPedidos.getItemCount()>0) {
								jComboBoxid_vendedorBusquedaProcesoPedidosProcesoPedidos.setSelectedIndex(0);
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

	public String getActualVendedorForeignKeyDescripcion(Long idVendedorSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Vendedor  vendedorTemp=null;

			for(Vendedor vendedorAux:vendedorsForeignKey) {
				if(vendedorAux.getId()!=null && vendedorAux.getId().equals(idVendedorSeleccionado)) {
					vendedorTemp=vendedorAux;
					break;
				}
			}


			sDescripcion=VendedorConstantesFunciones.getVendedorDescripcion(vendedorTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualVendedorForeignKeyGenerico(Long idVendedorSeleccionado,JComboBox jComboBoxid_vendedorProcesoPedidosGenerico)throws Exception
	{
		try
		{
			Vendedor  vendedorTemp=null;

			for(Vendedor vendedorAux:vendedorsForeignKey) {
				if(vendedorAux.getId()!=null && vendedorAux.getId().equals(idVendedorSeleccionado)) {
					vendedorTemp=vendedorAux;
					break;
				}
			}

			if(vendedorTemp!=null) {
				jComboBoxid_vendedorProcesoPedidosGenerico.setSelectedItem(vendedorTemp);
			} else {
				if(jComboBoxid_vendedorProcesoPedidosGenerico!=null && jComboBoxid_vendedorProcesoPedidosGenerico.getItemCount()>0) {
					jComboBoxid_vendedorProcesoPedidosGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarCiudadForeignKey(ProcesoPedidos procesopedidos,JComboBox jComboBoxid_ciudadProcesoPedidosGenerico)throws Exception
	{
		try
		{
			Ciudad  ciudadAux=new Ciudad();

			if(jComboBoxid_ciudadProcesoPedidosGenerico==null) {
				ciudadAux=(Ciudad)this.jInternalFrameDetalleFormProcesoPedidos.jComboBoxid_ciudadProcesoPedidos.getSelectedItem();
			} else {
				ciudadAux=(Ciudad)jComboBoxid_ciudadProcesoPedidosGenerico.getSelectedItem();
			}

			if(ciudadAux!=null && ciudadAux.getId()!=null) {
				procesopedidos.setid_ciudad(ciudadAux.getId());
				procesopedidos.setciudad_descripcion(ProcesoPedidosConstantesFunciones.getCiudadDescripcion(ciudadAux));
				procesopedidos.setCiudad(ciudadAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarZonaForeignKey(ProcesoPedidos procesopedidos,JComboBox jComboBoxid_zonaProcesoPedidosGenerico)throws Exception
	{
		try
		{
			Zona  zonaAux=new Zona();

			if(jComboBoxid_zonaProcesoPedidosGenerico==null) {
				zonaAux=(Zona)this.jInternalFrameDetalleFormProcesoPedidos.jComboBoxid_zonaProcesoPedidos.getSelectedItem();
			} else {
				zonaAux=(Zona)jComboBoxid_zonaProcesoPedidosGenerico.getSelectedItem();
			}

			if(zonaAux!=null && zonaAux.getId()!=null) {
				procesopedidos.setid_zona(zonaAux.getId());
				procesopedidos.setzona_descripcion(ProcesoPedidosConstantesFunciones.getZonaDescripcion(zonaAux));
				procesopedidos.setZona(zonaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarGrupoClienteForeignKey(ProcesoPedidos procesopedidos,JComboBox jComboBoxid_grupo_clienteProcesoPedidosGenerico)throws Exception
	{
		try
		{
			GrupoCliente  grupoclienteAux=new GrupoCliente();

			if(jComboBoxid_grupo_clienteProcesoPedidosGenerico==null) {
				grupoclienteAux=(GrupoCliente)this.jInternalFrameDetalleFormProcesoPedidos.jComboBoxid_grupo_clienteProcesoPedidos.getSelectedItem();
			} else {
				grupoclienteAux=(GrupoCliente)jComboBoxid_grupo_clienteProcesoPedidosGenerico.getSelectedItem();
			}

			if(grupoclienteAux!=null && grupoclienteAux.getId()!=null) {
				procesopedidos.setid_grupo_cliente(grupoclienteAux.getId());
				procesopedidos.setgrupocliente_descripcion(ProcesoPedidosConstantesFunciones.getGrupoClienteDescripcion(grupoclienteAux));
				procesopedidos.setGrupoCliente(grupoclienteAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarVendedorForeignKey(ProcesoPedidos procesopedidos,JComboBox jComboBoxid_vendedorProcesoPedidosGenerico)throws Exception
	{
		try
		{
			Vendedor  vendedorAux=new Vendedor();

			if(jComboBoxid_vendedorProcesoPedidosGenerico==null) {
				vendedorAux=(Vendedor)this.jInternalFrameDetalleFormProcesoPedidos.jComboBoxid_vendedorProcesoPedidos.getSelectedItem();
			} else {
				vendedorAux=(Vendedor)jComboBoxid_vendedorProcesoPedidosGenerico.getSelectedItem();
			}

			if(vendedorAux!=null && vendedorAux.getId()!=null) {
				procesopedidos.setid_vendedor(vendedorAux.getId());
				procesopedidos.setvendedor_descripcion(ProcesoPedidosConstantesFunciones.getVendedorDescripcion(vendedorAux));
				procesopedidos.setVendedor(vendedorAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	
	


		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameCiudadsForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingCiudad=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!ProcesoPedidosJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormProcesoPedidos!=null) { 
							this.jInternalFrameDetalleFormProcesoPedidos.jComboBoxid_ciudadProcesoPedidos.removeAllItems();

							for(Ciudad ciudad:this.ciudadsForeignKey) {
								this.jInternalFrameDetalleFormProcesoPedidos.jComboBoxid_ciudadProcesoPedidos.addItem(ciudad);
							}
						}
					}

					if(this.jInternalFrameDetalleFormProcesoPedidos!=null) { 
					}

					if(!ProcesoPedidosJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaProcesoPedidos") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ProcesoPedidosJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_ciudadBusquedaProcesoPedidosProcesoPedidos.removeAllItems();

							for(Ciudad ciudad:this.ciudadsForeignKey) {
								this.jComboBoxid_ciudadBusquedaProcesoPedidosProcesoPedidos.addItem(ciudad);
							}
						}

						if(!ProcesoPedidosJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameZonasForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingZona=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!ProcesoPedidosJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormProcesoPedidos!=null) { 
							this.jInternalFrameDetalleFormProcesoPedidos.jComboBoxid_zonaProcesoPedidos.removeAllItems();

							for(Zona zona:this.zonasForeignKey) {
								this.jInternalFrameDetalleFormProcesoPedidos.jComboBoxid_zonaProcesoPedidos.addItem(zona);
							}
						}
					}

					if(this.jInternalFrameDetalleFormProcesoPedidos!=null) { 
					}

					if(!ProcesoPedidosJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaProcesoPedidos") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ProcesoPedidosJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_zonaBusquedaProcesoPedidosProcesoPedidos.removeAllItems();

							for(Zona zona:this.zonasForeignKey) {
								this.jComboBoxid_zonaBusquedaProcesoPedidosProcesoPedidos.addItem(zona);
							}
						}

						if(!ProcesoPedidosJInternalFrame.ISBINDING_MANUAL) {
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

					if(!ProcesoPedidosJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormProcesoPedidos!=null) { 
							this.jInternalFrameDetalleFormProcesoPedidos.jComboBoxid_grupo_clienteProcesoPedidos.removeAllItems();

							for(GrupoCliente grupocliente:this.grupoclientesForeignKey) {
								this.jInternalFrameDetalleFormProcesoPedidos.jComboBoxid_grupo_clienteProcesoPedidos.addItem(grupocliente);
							}
						}
					}

					if(this.jInternalFrameDetalleFormProcesoPedidos!=null) { 
					}

					if(!ProcesoPedidosJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaProcesoPedidos") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ProcesoPedidosJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_grupo_clienteBusquedaProcesoPedidosProcesoPedidos.removeAllItems();

							for(GrupoCliente grupocliente:this.grupoclientesForeignKey) {
								this.jComboBoxid_grupo_clienteBusquedaProcesoPedidosProcesoPedidos.addItem(grupocliente);
							}
						}

						if(!ProcesoPedidosJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameVendedorsForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingVendedor=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!ProcesoPedidosJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormProcesoPedidos!=null) { 
							this.jInternalFrameDetalleFormProcesoPedidos.jComboBoxid_vendedorProcesoPedidos.removeAllItems();

							for(Vendedor vendedor:this.vendedorsForeignKey) {
								this.jInternalFrameDetalleFormProcesoPedidos.jComboBoxid_vendedorProcesoPedidos.addItem(vendedor);
							}
						}
					}

					if(this.jInternalFrameDetalleFormProcesoPedidos!=null) { 
					}

					if(!ProcesoPedidosJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaProcesoPedidos") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ProcesoPedidosJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_vendedorBusquedaProcesoPedidosProcesoPedidos.removeAllItems();

							for(Vendedor vendedor:this.vendedorsForeignKey) {
								this.jComboBoxid_vendedorBusquedaProcesoPedidosProcesoPedidos.addItem(vendedor);
							}
						}

						if(!ProcesoPedidosJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

	


		public void setSelectedItemCombosFrameCiudadForeignKey(Ciudad ciudad,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormProcesoPedidos!=null) {
							this.jInternalFrameDetalleFormProcesoPedidos.jComboBoxid_ciudadProcesoPedidos.setSelectedItem(ciudad);
						}
					} else {
						if(this.jInternalFrameDetalleFormProcesoPedidos!=null) {
							this.jInternalFrameDetalleFormProcesoPedidos.jComboBoxid_ciudadProcesoPedidos.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_ciudadBusquedaProcesoPedidosProcesoPedidos.setSelectedItem(ciudad);
						} else {
							this.jComboBoxid_ciudadBusquedaProcesoPedidosProcesoPedidos.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameZonaForeignKey(Zona zona,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormProcesoPedidos!=null) {
							this.jInternalFrameDetalleFormProcesoPedidos.jComboBoxid_zonaProcesoPedidos.setSelectedItem(zona);
						}
					} else {
						if(this.jInternalFrameDetalleFormProcesoPedidos!=null) {
							this.jInternalFrameDetalleFormProcesoPedidos.jComboBoxid_zonaProcesoPedidos.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_zonaBusquedaProcesoPedidosProcesoPedidos.setSelectedItem(zona);
						} else {
							this.jComboBoxid_zonaBusquedaProcesoPedidosProcesoPedidos.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormProcesoPedidos!=null) {
							this.jInternalFrameDetalleFormProcesoPedidos.jComboBoxid_grupo_clienteProcesoPedidos.setSelectedItem(grupocliente);
						}
					} else {
						if(this.jInternalFrameDetalleFormProcesoPedidos!=null) {
							this.jInternalFrameDetalleFormProcesoPedidos.jComboBoxid_grupo_clienteProcesoPedidos.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_grupo_clienteBusquedaProcesoPedidosProcesoPedidos.setSelectedItem(grupocliente);
						} else {
							this.jComboBoxid_grupo_clienteBusquedaProcesoPedidosProcesoPedidos.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameVendedorForeignKey(Vendedor vendedor,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormProcesoPedidos!=null) {
							this.jInternalFrameDetalleFormProcesoPedidos.jComboBoxid_vendedorProcesoPedidos.setSelectedItem(vendedor);
						}
					} else {
						if(this.jInternalFrameDetalleFormProcesoPedidos!=null) {
							this.jInternalFrameDetalleFormProcesoPedidos.jComboBoxid_vendedorProcesoPedidos.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_vendedorBusquedaProcesoPedidosProcesoPedidos.setSelectedItem(vendedor);
						} else {
							this.jComboBoxid_vendedorBusquedaProcesoPedidosProcesoPedidos.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesProcesoPedidos() throws Exception {
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
		
	public ProcesoPedidosParameterReturnGeneral getProcesoPedidosParameterGeneral() {
		return this.procesopedidosParameterGeneral;
	}
	
	public void setProcesoPedidosParameterGeneral(ProcesoPedidosParameterReturnGeneral procesopedidosParameterGeneral) {
		this.procesopedidosParameterGeneral = procesopedidosParameterGeneral;
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
	
	public Boolean getIsPermisoTodoProcesoPedidos() {
		return isPermisoTodoProcesoPedidos;
	}

	public void setIsPermisoTodoProcesoPedidos(Boolean isPermisoTodoProcesoPedidos) {
		this.isPermisoTodoProcesoPedidos = isPermisoTodoProcesoPedidos;
	}

	public Boolean getIsPermisoNuevoProcesoPedidos() {
		return isPermisoNuevoProcesoPedidos;
	}

	public void setIsPermisoNuevoProcesoPedidos(Boolean isPermisoNuevoProcesoPedidos) {
		this.isPermisoNuevoProcesoPedidos = isPermisoNuevoProcesoPedidos;
	}

	public Boolean getIsPermisoActualizarProcesoPedidos() {
		return isPermisoActualizarProcesoPedidos;
	}

	public void setIsPermisoActualizarProcesoPedidos(Boolean isPermisoActualizarProcesoPedidos) {
		this.isPermisoActualizarProcesoPedidos = isPermisoActualizarProcesoPedidos;
	}

	public Boolean getIsPermisoEliminarProcesoPedidos() {
		return isPermisoEliminarProcesoPedidos;
	}

	public void setIsPermisoEliminarProcesoPedidos(Boolean isPermisoEliminarProcesoPedidos) {
		this.isPermisoEliminarProcesoPedidos = isPermisoEliminarProcesoPedidos;
	}

	public Boolean getIsPermisoGuardarCambiosProcesoPedidos() {
		return isPermisoGuardarCambiosProcesoPedidos;
	}

	public void setIsPermisoGuardarCambiosProcesoPedidos(Boolean isPermisoGuardarCambiosProcesoPedidos) {
		this.isPermisoGuardarCambiosProcesoPedidos = isPermisoGuardarCambiosProcesoPedidos;
	}
	
	public Boolean getIsPermisoConsultaProcesoPedidos() {
		return isPermisoConsultaProcesoPedidos;
	}

	public void setIsPermisoConsultaProcesoPedidos(Boolean isPermisoConsultaProcesoPedidos) {
		this.isPermisoConsultaProcesoPedidos = isPermisoConsultaProcesoPedidos;
	}

	public Boolean getIsPermisoBusquedaProcesoPedidos() {
		return isPermisoBusquedaProcesoPedidos;
	}

	public void setIsPermisoBusquedaProcesoPedidos(Boolean isPermisoBusquedaProcesoPedidos) {
		this.isPermisoBusquedaProcesoPedidos = isPermisoBusquedaProcesoPedidos;
	}

	public Boolean getIsPermisoReporteProcesoPedidos() {
		return isPermisoReporteProcesoPedidos;
	}

	public void setIsPermisoReporteProcesoPedidos(Boolean isPermisoReporteProcesoPedidos) {
		this.isPermisoReporteProcesoPedidos = isPermisoReporteProcesoPedidos;
	}
	
	public Boolean getIsPermisoPaginacionMedioProcesoPedidos() {
		return isPermisoPaginacionMedioProcesoPedidos;
	}

	public void setIsPermisoPaginacionMedioProcesoPedidos(Boolean isPermisoPaginacionMedioProcesoPedidos) {
		this.isPermisoPaginacionMedioProcesoPedidos = isPermisoPaginacionMedioProcesoPedidos;
	}
	
	public Boolean getIsPermisoPaginacionTodoProcesoPedidos() {
		return isPermisoPaginacionTodoProcesoPedidos;
	}

	public void setIsPermisoPaginacionTodoProcesoPedidos(Boolean isPermisoPaginacionTodoProcesoPedidos) {
		this.isPermisoPaginacionTodoProcesoPedidos = isPermisoPaginacionTodoProcesoPedidos;
	}
	
	public Boolean getIsPermisoPaginacionAltoProcesoPedidos() {
		return isPermisoPaginacionAltoProcesoPedidos;
	}

	public void setIsPermisoPaginacionAltoProcesoPedidos(Boolean isPermisoPaginacionAltoProcesoPedidos) {
		this.isPermisoPaginacionAltoProcesoPedidos = isPermisoPaginacionAltoProcesoPedidos;
	}
	
	public Boolean getIsPermisoCopiarProcesoPedidos() {
		return isPermisoCopiarProcesoPedidos;
	}

	public void setIsPermisoCopiarProcesoPedidos(Boolean isPermisoCopiarProcesoPedidos) {
		this.isPermisoCopiarProcesoPedidos = isPermisoCopiarProcesoPedidos;
	}
	
	public Boolean getIsPermisoVerFormProcesoPedidos() {
		return isPermisoVerFormProcesoPedidos;
	}

	public void setIsPermisoVerFormProcesoPedidos(Boolean isPermisoVerFormProcesoPedidos) {
		this.isPermisoVerFormProcesoPedidos = isPermisoVerFormProcesoPedidos;
	}
	
	public Boolean getIsPermisoDuplicarProcesoPedidos() {
		return isPermisoDuplicarProcesoPedidos;
	}

	public void setIsPermisoDuplicarProcesoPedidos(Boolean isPermisoDuplicarProcesoPedidos) {
		this.isPermisoDuplicarProcesoPedidos = isPermisoDuplicarProcesoPedidos;
	}
	
	public Boolean getIsPermisoOrdenProcesoPedidos() {
		return isPermisoOrdenProcesoPedidos;
	}

	public void setIsPermisoOrdenProcesoPedidos(Boolean isPermisoOrdenProcesoPedidos) {
		this.isPermisoOrdenProcesoPedidos = isPermisoOrdenProcesoPedidos;
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
	
	public Boolean getIsVisibilidadCeldaNuevoProcesoPedidos() {
		return isVisibilidadCeldaNuevoProcesoPedidos;
	}

	public void setIsVisibilidadCeldaNuevoProcesoPedidos(Boolean isVisibilidadCeldaNuevoProcesoPedidos) {
		this.isVisibilidadCeldaNuevoProcesoPedidos = isVisibilidadCeldaNuevoProcesoPedidos;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarProcesoPedidos() {
		return isVisibilidadCeldaDuplicarProcesoPedidos;
	}

	public void setIsVisibilidadCeldaDuplicarProcesoPedidos(Boolean isVisibilidadCeldaDuplicarProcesoPedidos) {
		this.isVisibilidadCeldaDuplicarProcesoPedidos = isVisibilidadCeldaDuplicarProcesoPedidos;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarProcesoPedidos() {
		return isVisibilidadCeldaCopiarProcesoPedidos;
	}

	public void setIsVisibilidadCeldaCopiarProcesoPedidos(Boolean isVisibilidadCeldaCopiarProcesoPedidos) {
		this.isVisibilidadCeldaCopiarProcesoPedidos = isVisibilidadCeldaCopiarProcesoPedidos;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormProcesoPedidos() {
		return isVisibilidadCeldaVerFormProcesoPedidos;
	}

	public void setIsVisibilidadCeldaVerFormProcesoPedidos(Boolean isVisibilidadCeldaVerFormProcesoPedidos) {
		this.isVisibilidadCeldaVerFormProcesoPedidos = isVisibilidadCeldaVerFormProcesoPedidos;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenProcesoPedidos() {
		return isVisibilidadCeldaOrdenProcesoPedidos;
	}

	public void setIsVisibilidadCeldaOrdenProcesoPedidos(Boolean isVisibilidadCeldaOrdenProcesoPedidos) {
		this.isVisibilidadCeldaOrdenProcesoPedidos = isVisibilidadCeldaOrdenProcesoPedidos;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesProcesoPedidos() {
		return isVisibilidadCeldaNuevoRelacionesProcesoPedidos;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesProcesoPedidos(Boolean isVisibilidadCeldaNuevoRelacionesProcesoPedidos) {
		this.isVisibilidadCeldaNuevoRelacionesProcesoPedidos = isVisibilidadCeldaNuevoRelacionesProcesoPedidos;
	}
	
	public Boolean getIsVisibilidadCeldaModificarProcesoPedidos() {
		return isVisibilidadCeldaModificarProcesoPedidos;
	}

	public void setIsVisibilidadCeldaModificarProcesoPedidos(Boolean isVisibilidadCeldaModificarProcesoPedidos) {
		this.isVisibilidadCeldaModificarProcesoPedidos = isVisibilidadCeldaModificarProcesoPedidos;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarProcesoPedidos() {
		return isVisibilidadCeldaActualizarProcesoPedidos;
	}

	public void setIsVisibilidadCeldaActualizarProcesoPedidos(Boolean isVisibilidadCeldaActualizarProcesoPedidos) {
		this.isVisibilidadCeldaActualizarProcesoPedidos = isVisibilidadCeldaActualizarProcesoPedidos;
	}

	public Boolean getIsVisibilidadCeldaEliminarProcesoPedidos() {
		return isVisibilidadCeldaEliminarProcesoPedidos;
	}

	public void setIsVisibilidadCeldaEliminarProcesoPedidos(Boolean isVisibilidadCeldaEliminarProcesoPedidos) {
		this.isVisibilidadCeldaEliminarProcesoPedidos = isVisibilidadCeldaEliminarProcesoPedidos;
	}

	public Boolean getIsVisibilidadCeldaCancelarProcesoPedidos() {
		return isVisibilidadCeldaCancelarProcesoPedidos;
	}

	public void setIsVisibilidadCeldaCancelarProcesoPedidos(Boolean isVisibilidadCeldaCancelarProcesoPedidos) {
		this.isVisibilidadCeldaCancelarProcesoPedidos = isVisibilidadCeldaCancelarProcesoPedidos;
	}

	public Boolean getIsVisibilidadCeldaGuardarProcesoPedidos() {
		return isVisibilidadCeldaGuardarProcesoPedidos;
	}

	public void setIsVisibilidadCeldaGuardarProcesoPedidos(Boolean isVisibilidadCeldaGuardarProcesoPedidos) {
		this.isVisibilidadCeldaGuardarProcesoPedidos = isVisibilidadCeldaGuardarProcesoPedidos;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosProcesoPedidos() {
		return isVisibilidadCeldaGuardarCambiosProcesoPedidos;
	}

	public void setIsVisibilidadCeldaGuardarCambiosProcesoPedidos(Boolean isVisibilidadCeldaGuardarCambiosProcesoPedidos) {
		this.isVisibilidadCeldaGuardarCambiosProcesoPedidos = isVisibilidadCeldaGuardarCambiosProcesoPedidos;
	}
		
	public ProcesoPedidosSessionBean getprocesopedidosSessionBean() {
		return this.procesopedidosSessionBean;
	}
	
	public void setprocesopedidosSessionBean(ProcesoPedidosSessionBean procesopedidosSessionBean) {
		this.procesopedidosSessionBean=procesopedidosSessionBean;
	}
	
	
	public Boolean getisVisibilidadBusquedaProcesoPedidos() {
		return this.isVisibilidadBusquedaProcesoPedidos;
	}

	public void setisVisibilidadBusquedaProcesoPedidos(Boolean isVisibilidadBusquedaProcesoPedidos) {
		this.isVisibilidadBusquedaProcesoPedidos=isVisibilidadBusquedaProcesoPedidos;
	}

	public Boolean getisVisibilidadFK_IdCiudad() {
		return this.isVisibilidadFK_IdCiudad;
	}

	public void setisVisibilidadFK_IdCiudad(Boolean isVisibilidadFK_IdCiudad) {
		this.isVisibilidadFK_IdCiudad=isVisibilidadFK_IdCiudad;
	}

	public Boolean getisVisibilidadFK_IdGrupoCliente() {
		return this.isVisibilidadFK_IdGrupoCliente;
	}

	public void setisVisibilidadFK_IdGrupoCliente(Boolean isVisibilidadFK_IdGrupoCliente) {
		this.isVisibilidadFK_IdGrupoCliente=isVisibilidadFK_IdGrupoCliente;
	}

	public Boolean getisVisibilidadFK_IdVendedor() {
		return this.isVisibilidadFK_IdVendedor;
	}

	public void setisVisibilidadFK_IdVendedor(Boolean isVisibilidadFK_IdVendedor) {
		this.isVisibilidadFK_IdVendedor=isVisibilidadFK_IdVendedor;
	}

	public Boolean getisVisibilidadFK_IdZona() {
		return this.isVisibilidadFK_IdZona;
	}

	public void setisVisibilidadFK_IdZona(Boolean isVisibilidadFK_IdZona) {
		this.isVisibilidadFK_IdZona=isVisibilidadFK_IdZona;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysProcesoPedidos(ProcesoPedidos procesopedidos)throws Exception {
		try {
			
				this.setActualParaGuardarCiudadForeignKey(procesopedidos,null);
				this.setActualParaGuardarZonaForeignKey(procesopedidos,null);
				this.setActualParaGuardarGrupoClienteForeignKey(procesopedidos,null);
				this.setActualParaGuardarVendedorForeignKey(procesopedidos,null);
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
	
	public void bugActualizarReferenciaActual(ProcesoPedidos procesopedidos,ProcesoPedidos procesopedidosAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalProcesoPedidos(procesopedidos);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		procesopedidosAux.setId(procesopedidos.getId());
		procesopedidosAux.setVersionRow(procesopedidos.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
	}	
	
	public void actualizarRelaciones(ProcesoPedidos procesopedidosLocal) throws Exception {
		
		if(this.procesopedidosSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(ProcesoPedidos procesopedidosLocal) throws Exception {	
		if(this.procesopedidosSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(CiudadDetalleFormJInternalFrame.class)) {
				CiudadBeanSwingJInternalFrame ciudadBeanSwingJInternalFrameLocal=(CiudadBeanSwingJInternalFrame) ((CiudadDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				ciudadBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoCiudad(ciudadBeanSwingJInternalFrameLocal.getciudad(),true);
				ciudadBeanSwingJInternalFrameLocal.actualizarLista(ciudadBeanSwingJInternalFrameLocal.ciudad,this.ciudadsForeignKey);

				ciudadBeanSwingJInternalFrameLocal.actualizarRelaciones(ciudadBeanSwingJInternalFrameLocal.ciudad);

				procesopedidosLocal.setCiudad(ciudadBeanSwingJInternalFrameLocal.ciudad);

				this.addItemDefectoCombosForeignKeyCiudad();
				this.cargarCombosFrameCiudadsForeignKey("Formulario");
				this.setActualCiudadForeignKey(ciudadBeanSwingJInternalFrameLocal.ciudad.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(ZonaDetalleFormJInternalFrame.class)) {
				ZonaBeanSwingJInternalFrame zonaBeanSwingJInternalFrameLocal=(ZonaBeanSwingJInternalFrame) ((ZonaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				zonaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoZona(zonaBeanSwingJInternalFrameLocal.getzona(),true);
				zonaBeanSwingJInternalFrameLocal.actualizarLista(zonaBeanSwingJInternalFrameLocal.zona,this.zonasForeignKey);

				zonaBeanSwingJInternalFrameLocal.actualizarRelaciones(zonaBeanSwingJInternalFrameLocal.zona);

				procesopedidosLocal.setZona(zonaBeanSwingJInternalFrameLocal.zona);

				this.addItemDefectoCombosForeignKeyZona();
				this.cargarCombosFrameZonasForeignKey("Formulario");
				this.setActualZonaForeignKey(zonaBeanSwingJInternalFrameLocal.zona.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(GrupoClienteDetalleFormJInternalFrame.class)) {
				GrupoClienteBeanSwingJInternalFrame grupoclienteBeanSwingJInternalFrameLocal=(GrupoClienteBeanSwingJInternalFrame) ((GrupoClienteDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				grupoclienteBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoGrupoCliente(grupoclienteBeanSwingJInternalFrameLocal.getgrupocliente(),true);
				grupoclienteBeanSwingJInternalFrameLocal.actualizarLista(grupoclienteBeanSwingJInternalFrameLocal.grupocliente,this.grupoclientesForeignKey);

				grupoclienteBeanSwingJInternalFrameLocal.actualizarRelaciones(grupoclienteBeanSwingJInternalFrameLocal.grupocliente);

				procesopedidosLocal.setGrupoCliente(grupoclienteBeanSwingJInternalFrameLocal.grupocliente);

				this.addItemDefectoCombosForeignKeyGrupoCliente();
				this.cargarCombosFrameGrupoClientesForeignKey("Formulario");
				this.setActualGrupoClienteForeignKey(grupoclienteBeanSwingJInternalFrameLocal.grupocliente.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(VendedorDetalleFormJInternalFrame.class)) {
				VendedorBeanSwingJInternalFrame vendedorBeanSwingJInternalFrameLocal=(VendedorBeanSwingJInternalFrame) ((VendedorDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				vendedorBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoVendedor(vendedorBeanSwingJInternalFrameLocal.getvendedor(),true);
				vendedorBeanSwingJInternalFrameLocal.actualizarLista(vendedorBeanSwingJInternalFrameLocal.vendedor,this.vendedorsForeignKey);

				vendedorBeanSwingJInternalFrameLocal.actualizarRelaciones(vendedorBeanSwingJInternalFrameLocal.vendedor);

				procesopedidosLocal.setVendedor(vendedorBeanSwingJInternalFrameLocal.vendedor);

				this.addItemDefectoCombosForeignKeyVendedor();
				this.cargarCombosFrameVendedorsForeignKey("Formulario");
				this.setActualVendedorForeignKey(vendedorBeanSwingJInternalFrameLocal.vendedor.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarProcesoPedidosActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosProcesoPedidos.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.procesopedidos =(ProcesoPedidos) this.procesopedidosLogic.getProcesoPedidoss().toArray()[this.jTableDatosProcesoPedidos.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.procesopedidos =(ProcesoPedidos) this.procesopedidoss.toArray()[this.jTableDatosProcesoPedidos.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = procesopedidosValidator.getInvalidValues(this.procesopedidos);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(ProcesoPedidos procesopedidos,List<ProcesoPedidos> procesopedidoss) throws Exception {
	}		
	
	public void actualizarSelectedLista(ProcesoPedidos procesopedidos,List<ProcesoPedidos> procesopedidoss) throws Exception {
		try	{			
			ProcesoPedidosConstantesFunciones.actualizarSelectedLista(procesopedidos,procesopedidoss);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<ProcesoPedidos> procesopedidossLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				procesopedidossLocal=this.procesopedidosLogic.getProcesoPedidoss();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				procesopedidossLocal=this.procesopedidoss;
			}
			//ARCHITECTURE
		
			for(ProcesoPedidos procesopedidosLocal:procesopedidossLocal) {
				if(this.permiteMantenimiento(procesopedidosLocal) && procesopedidosLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+ProcesoPedidosConstantesFunciones.getProcesoPedidosLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(ProcesoPedidosConstantesFunciones.NOMBREPROVINCIA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProcesoPedidos.jLabelnombre_provinciaProcesoPedidos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ProcesoPedidosConstantesFunciones.NOMBRECIUDAD)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProcesoPedidos.jLabelnombre_ciudadProcesoPedidos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ProcesoPedidosConstantesFunciones.NOMBREZONA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProcesoPedidos.jLabelnombre_zonaProcesoPedidos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ProcesoPedidosConstantesFunciones.NOMBREGRUPOCLIENTE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProcesoPedidos.jLabelnombre_grupo_clienteProcesoPedidos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ProcesoPedidosConstantesFunciones.NOMBREVENDEDOR)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProcesoPedidos.jLabelnombre_vendedorProcesoPedidos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ProcesoPedidosConstantesFunciones.CODIGO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProcesoPedidos.jLabelcodigoProcesoPedidos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ProcesoPedidosConstantesFunciones.NOMBRECOMPLETO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProcesoPedidos.jLabelnombre_completoProcesoPedidos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ProcesoPedidosConstantesFunciones.NUMERO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProcesoPedidos.jLabelnumeroProcesoPedidos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ProcesoPedidosConstantesFunciones.NUMEROAUTORIZACION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProcesoPedidos.jLabelnumero_autorizacionProcesoPedidos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ProcesoPedidosConstantesFunciones.TOTAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProcesoPedidos.jLabeltotalProcesoPedidos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ProcesoPedidosConstantesFunciones.FECHAEMISION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProcesoPedidos.jLabelfecha_emisionProcesoPedidos,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormProcesoPedidos!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProcesoPedidos.jLabelnombre_provinciaProcesoPedidos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProcesoPedidos.jLabelnombre_ciudadProcesoPedidos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProcesoPedidos.jLabelnombre_zonaProcesoPedidos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProcesoPedidos.jLabelnombre_grupo_clienteProcesoPedidos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProcesoPedidos.jLabelnombre_vendedorProcesoPedidos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProcesoPedidos.jLabelcodigoProcesoPedidos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProcesoPedidos.jLabelnombre_completoProcesoPedidos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProcesoPedidos.jLabelnumeroProcesoPedidos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProcesoPedidos.jLabelnumero_autorizacionProcesoPedidos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProcesoPedidos.jLabeltotalProcesoPedidos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProcesoPedidos.jLabelfecha_emisionProcesoPedidos,"");
		
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
		this.iIdNuevoProcesoPedidos--;	
		
		
		this.procesopedidosAux=new ProcesoPedidos();
		
		this.procesopedidosAux.setId(this.iIdNuevoProcesoPedidos);
		this.procesopedidosAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.procesopedidosLogic.getProcesoPedidoss().add(this.procesopedidosAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.procesopedidoss.add(this.procesopedidosAux);
		}
		//ARCHITECTURE
		
		this.procesopedidos=this.procesopedidosAux;
		
		if(ProcesoPedidosJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioProcesoPedidos(this.procesopedidos);
			this.setVariablesObjetoActualToFormularioForeignKeyProcesoPedidos(this.procesopedidos);
		}
				
		//this.setDefaultControlesProcesoPedidos();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyProcesoPedidos();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyProcesoPedidos();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyProcesoPedidos();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualProcesoPedidos(this.procesopedidosBean,this.procesopedidos,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysProcesoPedidos(this.procesopedidos);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanProcesoPedidos(this.procesopedidosReturnGeneral,this.procesopedidosBean,false);
		
		if(this.procesopedidosReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyProcesoPedidos(this.procesopedidosReturnGeneral.getProcesoPedidos());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioProcesoPedidos(this.procesopedidosReturnGeneral.getProcesoPedidos());
		}
		
		if(this.procesopedidosReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioProcesoPedidos(this.procesopedidosReturnGeneral.getProcesoPedidos(),classes);//this.procesopedidosBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualProcesoPedidos(this.procesopedidos,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyProcesoPedidos();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyProcesoPedidos();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			ProcesoPedidosBeanSwingJInternalFrameAdditional.RecargarFormProcesoPedidos(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingProcesoPedidos(false);
						
			if(procesopedidosSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(ProcesoPedidosJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualProcesoPedidos();
			}
			
			this.actualizarVisualTableDatosProcesoPedidos();
			
			this.jTableDatosProcesoPedidos.setRowSelectionInterval(this.getIndiceNuevoProcesoPedidos(), this.getIndiceNuevoProcesoPedidos());
			
			this.seleccionarFilaTablaProcesoPedidosActual();
						
			this.actualizarEstadoCeldasBotonesProcesoPedidos("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesProcesoPedidos(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormProcesoPedidos.jTextAreanombre_provinciaProcesoPedidos.setEnabled(isHabilitar && this.procesopedidosConstantesFunciones.activarnombre_provinciaProcesoPedidos);
		this.jInternalFrameDetalleFormProcesoPedidos.jTextAreanombre_ciudadProcesoPedidos.setEnabled(isHabilitar && this.procesopedidosConstantesFunciones.activarnombre_ciudadProcesoPedidos);
		this.jInternalFrameDetalleFormProcesoPedidos.jTextFieldnombre_zonaProcesoPedidos.setEnabled(isHabilitar && this.procesopedidosConstantesFunciones.activarnombre_zonaProcesoPedidos);
		this.jInternalFrameDetalleFormProcesoPedidos.jTextAreanombre_grupo_clienteProcesoPedidos.setEnabled(isHabilitar && this.procesopedidosConstantesFunciones.activarnombre_grupo_clienteProcesoPedidos);
		this.jInternalFrameDetalleFormProcesoPedidos.jTextAreanombre_vendedorProcesoPedidos.setEnabled(isHabilitar && this.procesopedidosConstantesFunciones.activarnombre_vendedorProcesoPedidos);
		this.jInternalFrameDetalleFormProcesoPedidos.jTextFieldcodigoProcesoPedidos.setEnabled(isHabilitar && this.procesopedidosConstantesFunciones.activarcodigoProcesoPedidos);
		this.jInternalFrameDetalleFormProcesoPedidos.jTextAreanombre_completoProcesoPedidos.setEnabled(isHabilitar && this.procesopedidosConstantesFunciones.activarnombre_completoProcesoPedidos);
		this.jInternalFrameDetalleFormProcesoPedidos.jTextFieldnumeroProcesoPedidos.setEnabled(isHabilitar && this.procesopedidosConstantesFunciones.activarnumeroProcesoPedidos);
		this.jInternalFrameDetalleFormProcesoPedidos.jTextFieldnumero_autorizacionProcesoPedidos.setEnabled(isHabilitar && this.procesopedidosConstantesFunciones.activarnumero_autorizacionProcesoPedidos);
		this.jInternalFrameDetalleFormProcesoPedidos.jTextFieldtotalProcesoPedidos.setEnabled(isHabilitar && this.procesopedidosConstantesFunciones.activartotalProcesoPedidos);
		this.jInternalFrameDetalleFormProcesoPedidos.jDateChooserfecha_emisionProcesoPedidos.setEnabled(isHabilitar && this.procesopedidosConstantesFunciones.activarfecha_emisionProcesoPedidos);	
		
		this.jInternalFrameDetalleFormProcesoPedidos.jComboBoxid_ciudadProcesoPedidos.setEnabled(isHabilitar && this.procesopedidosConstantesFunciones.activarid_ciudadProcesoPedidos);
		this.jInternalFrameDetalleFormProcesoPedidos.jComboBoxid_zonaProcesoPedidos.setEnabled(isHabilitar && this.procesopedidosConstantesFunciones.activarid_zonaProcesoPedidos);
		this.jInternalFrameDetalleFormProcesoPedidos.jComboBoxid_grupo_clienteProcesoPedidos.setEnabled(isHabilitar && this.procesopedidosConstantesFunciones.activarid_grupo_clienteProcesoPedidos);
		this.jInternalFrameDetalleFormProcesoPedidos.jComboBoxid_vendedorProcesoPedidos.setEnabled(isHabilitar && this.procesopedidosConstantesFunciones.activarid_vendedorProcesoPedidos);
	};
	
	public void setDefaultControlesProcesoPedidos() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoProcesoPedidos(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.procesopedidosSessionBean.setConGuardarRelaciones(true);			
			this.procesopedidosSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormProcesoPedidos.jTabbedPaneRelacionesProcesoPedidos.setVisible(true);
			
					
		} else {
			//this.procesopedidosSessionBean.setConGuardarRelaciones(false);			
			this.procesopedidosSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormProcesoPedidos.jTabbedPaneRelacionesProcesoPedidos.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoProcesoPedidos() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ProcesoPedidos procesopedidosAux:this.procesopedidosLogic.getProcesoPedidoss()) {
				if(procesopedidosAux.getId().equals(this.iIdNuevoProcesoPedidos)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ProcesoPedidos procesopedidosAux:this.procesopedidoss) {
				if(procesopedidosAux.getId().equals(this.iIdNuevoProcesoPedidos)) {
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
	
	public int getIndiceActualProcesoPedidos(ProcesoPedidos procesopedidos,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ProcesoPedidos procesopedidosAux:this.procesopedidosLogic.getProcesoPedidoss()) {
				if(procesopedidosAux.getId().equals(procesopedidos.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ProcesoPedidos procesopedidosAux:this.procesopedidoss) {
				if(procesopedidosAux.getId().equals(procesopedidos.getId())) {
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
	
	public void setCamposBaseDesdeOriginalProcesoPedidos(ProcesoPedidos procesopedidosOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ProcesoPedidos procesopedidosAux:this.procesopedidosLogic.getProcesoPedidoss()) {
				if(procesopedidosAux.getProcesoPedidosOriginal().getId().equals(procesopedidosOriginal.getId())) {
					existe=true;
					procesopedidosOriginal.setId(procesopedidosAux.getId());
					procesopedidosOriginal.setVersionRow(procesopedidosAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ProcesoPedidos procesopedidosAux:this.procesopedidoss) {
				if(procesopedidosAux.getProcesoPedidosOriginal().getId().equals(procesopedidosOriginal.getId())) {
					existe=true;
					procesopedidosOriginal.setId(procesopedidosAux.getId());
					procesopedidosOriginal.setVersionRow(procesopedidosAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosProcesoPedidos(Boolean esParaCancelar) throws Exception {
		procesopedidossAux=new ArrayList<ProcesoPedidos>();
		procesopedidosAux=new ProcesoPedidos();
		
		if(!this.procesopedidosSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(ProcesoPedidos procesopedidosAux:this.procesopedidosLogic.getProcesoPedidoss()) {
					if(procesopedidosAux.getId()<0) {
						procesopedidossAux.add(procesopedidosAux);
					}		
				}
				this.iIdNuevoProcesoPedidos=0L;
				this.procesopedidosLogic.getProcesoPedidoss().removeAll(procesopedidossAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ProcesoPedidos procesopedidosAux:this.procesopedidoss) {
					if(procesopedidosAux.getId()<0) {
						procesopedidossAux.add(procesopedidosAux);
					}		
				}
				this.iIdNuevoProcesoPedidos=0L;
				this.procesopedidoss.removeAll(procesopedidossAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoProcesoPedidos 
					&& this.procesopedidosLogic.getProcesoPedidoss().size()>0
					) {
					procesopedidosAux=this.procesopedidosLogic.getProcesoPedidoss().get(this.procesopedidosLogic.getProcesoPedidoss().size() - 1);
				
					if(procesopedidosAux.getId()<0) {
						this.procesopedidosLogic.getProcesoPedidoss().remove(procesopedidosAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoProcesoPedidos && this.procesopedidoss.size()>0) {
					procesopedidosAux=this.procesopedidoss.get(this.procesopedidoss.size() - 1);
				
					if(procesopedidosAux.getId()<0) {
						this.procesopedidoss.remove(procesopedidosAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoProcesoPedidos(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(procesopedidos.getId()<0) {
				this.procesopedidosLogic.getProcesoPedidoss().remove(this.procesopedidos);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(procesopedidos.getId()<0) {
				this.procesopedidoss.remove(this.procesopedidos);
			}
		}			
	}
	
	public void setEstadosInicialesProcesoPedidos(List<ProcesoPedidos> procesopedidossAux) throws Exception {
		ProcesoPedidosConstantesFunciones.setEstadosInicialesProcesoPedidos(procesopedidossAux);
	}
	
	public void setEstadosInicialesProcesoPedidos(ProcesoPedidos procesopedidosAux) throws Exception {
		ProcesoPedidosConstantesFunciones.setEstadosInicialesProcesoPedidos(procesopedidosAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarProcesoPedidosActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesProcesoPedidos("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProcesoPedidosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarProcesoPedidosActual()) {
				if(!this.isEsNuevoProcesoPedidos) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesProcesoPedidos("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoProcesoPedidos=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProcesoPedidosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarProcesoPedidosActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Proceso Pedidos ?", "MANTENIMIENTO DE Proceso Pedidos", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesProcesoPedidos("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProcesoPedidosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoPedidosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(ProcesoPedidos procesopedidos) throws Exception {
		ProcesoPedidosConstantesFunciones.seleccionarAsignar(this.procesopedidos,procesopedidos);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarProcesoPedidos=this.isPermisoActualizarOriginalProcesoPedidos;
			
			
			this.seleccionarAsignar(procesopedidos);
			
			
			
			
			
			this.actualizarEstadoCeldasBotonesProcesoPedidos("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoPedidosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.procesopedidosSessionBean.setsFuncionBusquedaRapida(this.procesopedidosSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoPedidosConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoProcesoPedidos) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosProcesoPedidos(esParaCancelar);				
				this.cancelarNuevoProcesoPedidos(esParaCancelar);								
			}
			
			this.procesopedidos=new ProcesoPedidos();
			
			this.inicializarProcesoPedidos();
			
			this.actualizarEstadoCeldasBotonesProcesoPedidos("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoPedidosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarProcesoPedidos() throws Exception {
		try {
			ProcesoPedidosConstantesFunciones.inicializarProcesoPedidos(this.procesopedidos);
			
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
			FuncionesSwing.manageException(this, e,logger,ProcesoPedidosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.procesopedidosLogic.getProcesoPedidoss().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoPedidosConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteProcesoPedidoss(String sAccionBusqueda,List<ProcesoPedidos> procesopedidossParaReportes) throws Exception {
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
					sPathReporteFinal="ProcesoPedidos"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="ProcesoPedidosMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("ProcesoPedidosMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="ProcesoPedidos"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Proceso Pedidoses");		
		parameters.put("busquedapor", ProcesoPedidosConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceProcesoPedidos=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			ProcesoPedidosConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			ProcesoPedidosConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceProcesoPedidos=new JRBeanArrayDataSource(ProcesoPedidosJInternalFrame.TraerProcesoPedidosBeans(procesopedidossParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceProcesoPedidos);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+ProcesoPedidosConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+ProcesoPedidosConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(ProcesoPedidosBean.TraerProcesoPedidosBeans(procesopedidossParaReportes).toArray()));
							
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
				this.generarExcelReporteProcesoPedidoss(sAccionBusqueda,sTipoArchivoReporte,procesopedidossParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalProcesoPedidoss(sAccionBusqueda,sTipoArchivoReporte,procesopedidossParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoProcesoPedidosActionPerformed(null);
					//this.generarExcelReporteProcesoPedidoss(sAccionBusqueda,sTipoArchivoReporte,procesopedidossParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalProcesoPedidoss(sAccionBusqueda,sTipoArchivoReporte,procesopedidossParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesProcesoPedidoss(sAccionBusqueda,sTipoArchivoReporte,procesopedidossParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesProcesoPedidoss(sAccionBusqueda,sTipoArchivoReporte,procesopedidossParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteProcesoPedidoss(String sAccionBusqueda,String sTipoArchivoReporte,List<ProcesoPedidos> procesopedidossParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"procesopedidos";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ProcesoPedidoss");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderProcesoPedidos("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(ProcesoPedidos procesopedidos : procesopedidossParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			ProcesoPedidosConstantesFunciones.generarExcelReporteDataProcesoPedidos("NORMAL",row,workbook,procesopedidos,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.procesopedidosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Proceso Pedidos",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderProcesoPedidos(String sTipo,Row row,Workbook workbook) {
		
		ProcesoPedidosConstantesFunciones.generarExcelReporteHeaderProcesoPedidos(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalProcesoPedidoss(String sAccionBusqueda,String sTipoArchivoReporte,List<ProcesoPedidos> procesopedidossParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"procesopedidos_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ProcesoPedidoss");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(ProcesoPedidos procesopedidos : procesopedidossParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(ProcesoPedidosConstantesFunciones.getProcesoPedidosDescripcion(procesopedidos));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProcesoPedidosConstantesFunciones.LABEL_IDCIUDAD))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProcesoPedidosConstantesFunciones.LABEL_IDCIUDAD);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(procesopedidos.getciudad_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProcesoPedidosConstantesFunciones.LABEL_IDZONA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProcesoPedidosConstantesFunciones.LABEL_IDZONA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(procesopedidos.getzona_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProcesoPedidosConstantesFunciones.LABEL_IDGRUPOCLIENTE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProcesoPedidosConstantesFunciones.LABEL_IDGRUPOCLIENTE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(procesopedidos.getgrupocliente_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProcesoPedidosConstantesFunciones.LABEL_IDVENDEDOR))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProcesoPedidosConstantesFunciones.LABEL_IDVENDEDOR);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(procesopedidos.getvendedor_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProcesoPedidosConstantesFunciones.LABEL_NOMBREPROVINCIA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProcesoPedidosConstantesFunciones.LABEL_NOMBREPROVINCIA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(procesopedidos.getnombre_provincia());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProcesoPedidosConstantesFunciones.LABEL_NOMBRECIUDAD))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProcesoPedidosConstantesFunciones.LABEL_NOMBRECIUDAD);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(procesopedidos.getnombre_ciudad());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProcesoPedidosConstantesFunciones.LABEL_NOMBREZONA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProcesoPedidosConstantesFunciones.LABEL_NOMBREZONA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(procesopedidos.getnombre_zona());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProcesoPedidosConstantesFunciones.LABEL_NOMBREGRUPOCLIENTE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProcesoPedidosConstantesFunciones.LABEL_NOMBREGRUPOCLIENTE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(procesopedidos.getnombre_grupo_cliente());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProcesoPedidosConstantesFunciones.LABEL_NOMBREVENDEDOR))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProcesoPedidosConstantesFunciones.LABEL_NOMBREVENDEDOR);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(procesopedidos.getnombre_vendedor());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProcesoPedidosConstantesFunciones.LABEL_CODIGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProcesoPedidosConstantesFunciones.LABEL_CODIGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(procesopedidos.getcodigo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProcesoPedidosConstantesFunciones.LABEL_NOMBRECOMPLETO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProcesoPedidosConstantesFunciones.LABEL_NOMBRECOMPLETO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(procesopedidos.getnombre_completo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProcesoPedidosConstantesFunciones.LABEL_NUMERO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProcesoPedidosConstantesFunciones.LABEL_NUMERO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(procesopedidos.getnumero());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProcesoPedidosConstantesFunciones.LABEL_NUMEROAUTORIZACION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProcesoPedidosConstantesFunciones.LABEL_NUMEROAUTORIZACION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(procesopedidos.getnumero_autorizacion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProcesoPedidosConstantesFunciones.LABEL_TOTAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProcesoPedidosConstantesFunciones.LABEL_TOTAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(procesopedidos.gettotal());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProcesoPedidosConstantesFunciones.LABEL_FECHAEMISION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProcesoPedidosConstantesFunciones.LABEL_FECHAEMISION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(procesopedidos.getfecha_emision());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.procesopedidosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Proceso Pedidos",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesProcesoPedidoss(String sAccionBusqueda,String sTipoArchivoReporte,List<ProcesoPedidos> procesopedidossParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<ProcesoPedidos> procesopedidossRespaldo=null;
		
		classes=ProcesoPedidosConstantesFunciones.getClassesRelationshipsOfProcesoPedidos(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.procesopedidosLogic.setDatosCliente(this.datosCliente);
		this.procesopedidosLogic.setDatosDeep(this.datosDeep);
		this.procesopedidosLogic.setIsConDeep(true);
		
		procesopedidossRespaldo=this.procesopedidosLogic.getProcesoPedidoss();
		
		this.procesopedidosLogic.setProcesoPedidoss(procesopedidossParaReportes);	
		this.procesopedidosLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		procesopedidossParaReportes=this.procesopedidosLogic.getProcesoPedidoss();
		this.procesopedidosLogic.setProcesoPedidoss(procesopedidossRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"procesopedidos_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ProcesoPedidoss");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderProcesoPedidos("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(ProcesoPedidos procesopedidos : procesopedidossParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderProcesoPedidos("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			ProcesoPedidosConstantesFunciones.generarExcelReporteDataProcesoPedidos("NORMAL",row,workbook,procesopedidos,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(ProcesoPedidosConstantesFunciones.getProcesoPedidosDescripcion(procesopedidos));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.procesopedidosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Proceso Pedidos",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoProcesoPedidos.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoProcesoPedidos.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoProcesoPedidos.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoProcesoPedidos.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessProcesoPedidos() throws Exception {		
		this.startProcessProcesoPedidos(true);
	}
	
	public void startProcessProcesoPedidos(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasProcesoPedidos ,this.jPanelParametrosReportesProcesoPedidos, this.jScrollPanelDatosProcesoPedidos,this.jPanelPaginacionProcesoPedidos, this.jScrollPanelDatosEdicionProcesoPedidos, this.jPanelAccionesProcesoPedidos,this.jPanelAccionesFormularioProcesoPedidos,this.jmenuBarProcesoPedidos,this.jmenuBarDetalleProcesoPedidos,this.jTtoolBarProcesoPedidos,this.jTtoolBarDetalleProcesoPedidos);		
		
		final JTabbedPane jTabbedPaneBusquedasProcesoPedidos=this.jTabbedPaneBusquedasProcesoPedidos; 
		
		final JPanel jPanelParametrosReportesProcesoPedidos=this.jPanelParametrosReportesProcesoPedidos;
		//final JScrollPane jScrollPanelDatosProcesoPedidos=this.jScrollPanelDatosProcesoPedidos;
		final JTable jTableDatosProcesoPedidos=this.jTableDatosProcesoPedidos;		
		final JPanel jPanelPaginacionProcesoPedidos=this.jPanelPaginacionProcesoPedidos;
		//final JScrollPane jScrollPanelDatosEdicionProcesoPedidos=this.jScrollPanelDatosEdicionProcesoPedidos;
		final JPanel jPanelAccionesProcesoPedidos=this.jPanelAccionesProcesoPedidos;
		
		JPanel jPanelCamposAuxiliarProcesoPedidos=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarProcesoPedidos=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormProcesoPedidos!=null) {
			jPanelCamposAuxiliarProcesoPedidos=this.jInternalFrameDetalleFormProcesoPedidos.jPanelCamposProcesoPedidos;
			jPanelAccionesFormularioAuxiliarProcesoPedidos=this.jInternalFrameDetalleFormProcesoPedidos.jPanelAccionesFormularioProcesoPedidos;
		}
		
		final JPanel jPanelCamposProcesoPedidos=jPanelCamposAuxiliarProcesoPedidos;
		final JPanel jPanelAccionesFormularioProcesoPedidos=jPanelAccionesFormularioAuxiliarProcesoPedidos;
		
		
		final JMenuBar jmenuBarProcesoPedidos=this.jmenuBarProcesoPedidos;
		final JToolBar jTtoolBarProcesoPedidos=this.jTtoolBarProcesoPedidos;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarProcesoPedidos=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarProcesoPedidos=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormProcesoPedidos!=null) {
			jmenuBarDetalleAuxiliarProcesoPedidos=this.jInternalFrameDetalleFormProcesoPedidos.jmenuBarDetalleProcesoPedidos;
			jTtoolBarDetalleAuxiliarProcesoPedidos=this.jInternalFrameDetalleFormProcesoPedidos.jTtoolBarDetalleProcesoPedidos;
		}
		
		final JMenuBar jmenuBarDetalleProcesoPedidos=jmenuBarDetalleAuxiliarProcesoPedidos;
		final JToolBar jTtoolBarDetalleProcesoPedidos=jTtoolBarDetalleAuxiliarProcesoPedidos;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasProcesoPedidos;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesProcesoPedidos;
			processRunnable.jTableDatos=jTableDatosProcesoPedidos;
			processRunnable.jPanelCampos=jPanelCamposProcesoPedidos;
			processRunnable.jPanelPaginacion=jPanelPaginacionProcesoPedidos;
			processRunnable.jPanelAcciones=jPanelAccionesProcesoPedidos;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioProcesoPedidos;
			
			
			processRunnable.jmenuBar=jmenuBarProcesoPedidos;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleProcesoPedidos;
			processRunnable.jTtoolBar=jTtoolBarProcesoPedidos;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleProcesoPedidos;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasProcesoPedidos ,jPanelParametrosReportesProcesoPedidos,jTableDatosProcesoPedidos, /*jScrollPanelDatosProcesoPedidos,*/jPanelCamposProcesoPedidos,jPanelPaginacionProcesoPedidos, /*jScrollPanelDatosEdicionProcesoPedidos,*/ jPanelAccionesProcesoPedidos,jPanelAccionesFormularioProcesoPedidos,jmenuBarProcesoPedidos,jmenuBarDetalleProcesoPedidos,jTtoolBarProcesoPedidos,jTtoolBarDetalleProcesoPedidos);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasProcesoPedidos ,jPanelParametrosReportesProcesoPedidos, jScrollPanelDatosProcesoPedidos,jPanelPaginacionProcesoPedidos, jScrollPanelDatosEdicionProcesoPedidos, jPanelAccionesProcesoPedidos,jPanelAccionesFormularioProcesoPedidos,jmenuBarProcesoPedidos,jmenuBarDetalleProcesoPedidos,jTtoolBarProcesoPedidos,jTtoolBarDetalleProcesoPedidos);
						
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
	
	public void finishProcessProcesoPedidos() {// throws Exception 
		this.finishProcessProcesoPedidos(true);
	}
	
	public void finishProcessProcesoPedidos(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasProcesoPedidos ,this.jPanelParametrosReportesProcesoPedidos, this.jScrollPanelDatosProcesoPedidos,this.jPanelPaginacionProcesoPedidos, this.jScrollPanelDatosEdicionProcesoPedidos, this.jPanelAccionesProcesoPedidos,this.jPanelAccionesFormularioProcesoPedidos,this.jmenuBarProcesoPedidos,this.jmenuBarDetalleProcesoPedidos,this.jTtoolBarProcesoPedidos,this.jTtoolBarDetalleProcesoPedidos);		
		
		final JTabbedPane jTabbedPaneBusquedasProcesoPedidos=this.jTabbedPaneBusquedasProcesoPedidos; 
		
		final JPanel jPanelParametrosReportesProcesoPedidos=this.jPanelParametrosReportesProcesoPedidos;
		//final JScrollPane jScrollPanelDatosProcesoPedidos=this.jScrollPanelDatosProcesoPedidos;
		final JTable jTableDatosProcesoPedidos=this.jTableDatosProcesoPedidos;		
		final JPanel jPanelPaginacionProcesoPedidos=this.jPanelPaginacionProcesoPedidos;
		//final JScrollPane jScrollPanelDatosEdicionProcesoPedidos=this.jScrollPanelDatosEdicionProcesoPedidos;
		final JPanel jPanelAccionesProcesoPedidos=this.jPanelAccionesProcesoPedidos;
		
		JPanel jPanelCamposAuxiliarProcesoPedidos=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarProcesoPedidos=new JPanel();
		
		if(this.jInternalFrameDetalleFormProcesoPedidos!=null) {
			jPanelCamposAuxiliarProcesoPedidos=this.jInternalFrameDetalleFormProcesoPedidos.jPanelCamposProcesoPedidos;
			jPanelAccionesFormularioAuxiliarProcesoPedidos=this.jInternalFrameDetalleFormProcesoPedidos.jPanelAccionesFormularioProcesoPedidos;
		}
		
		final JPanel jPanelCamposProcesoPedidos=jPanelCamposAuxiliarProcesoPedidos;
		final JPanel jPanelAccionesFormularioProcesoPedidos=jPanelAccionesFormularioAuxiliarProcesoPedidos;
		
		
		final JMenuBar jmenuBarProcesoPedidos=this.jmenuBarProcesoPedidos;		
		final JToolBar jTtoolBarProcesoPedidos=this.jTtoolBarProcesoPedidos;
				
		JMenuBar jmenuBarDetalleAuxiliarProcesoPedidos=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarProcesoPedidos=new JToolBar();
		
		if(this.jInternalFrameDetalleFormProcesoPedidos!=null) {
			jmenuBarDetalleAuxiliarProcesoPedidos=this.jInternalFrameDetalleFormProcesoPedidos.jmenuBarDetalleProcesoPedidos;
			jTtoolBarDetalleAuxiliarProcesoPedidos=this.jInternalFrameDetalleFormProcesoPedidos.jTtoolBarDetalleProcesoPedidos;		
		}
		
		final JMenuBar jmenuBarDetalleProcesoPedidos=jmenuBarDetalleAuxiliarProcesoPedidos;
		final JToolBar jTtoolBarDetalleProcesoPedidos=jTtoolBarDetalleAuxiliarProcesoPedidos;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasProcesoPedidos;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesProcesoPedidos;
			processRunnable.jTableDatos=jTableDatosProcesoPedidos;
			processRunnable.jPanelCampos=jPanelCamposProcesoPedidos;
			processRunnable.jPanelPaginacion=jPanelPaginacionProcesoPedidos;
			processRunnable.jPanelAcciones=jPanelAccionesProcesoPedidos;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioProcesoPedidos;
			
			
			processRunnable.jmenuBar=jmenuBarProcesoPedidos;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleProcesoPedidos;
			processRunnable.jTtoolBar=jTtoolBarProcesoPedidos;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleProcesoPedidos;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasProcesoPedidos ,jPanelParametrosReportesProcesoPedidos, jTableDatosProcesoPedidos,/*jScrollPanelDatosProcesoPedidos,*/jPanelCamposProcesoPedidos,jPanelPaginacionProcesoPedidos, /*jScrollPanelDatosEdicionProcesoPedidos,*/ jPanelAccionesProcesoPedidos,jPanelAccionesFormularioProcesoPedidos,jmenuBarProcesoPedidos,jmenuBarDetalleProcesoPedidos,jTtoolBarProcesoPedidos,jTtoolBarDetalleProcesoPedidos));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesProcesoPedidos(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarProcesoPedidos(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuProcesoPedidos(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarProcesoPedidos(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarProcesoPedidos,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleProcesoPedidos,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuProcesoPedidos(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarProcesoPedidos,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleProcesoPedidos,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.procesopedidosConstantesFunciones.getsFinalQueryProcesoPedidos();
		String  finalQueryPaginacionTodos=this.procesopedidosConstantesFunciones.getsFinalQueryProcesoPedidos();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=ProcesoPedidosConstantesFunciones.getArrayColumnasGlobalesNoProcesoPedidos(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=ProcesoPedidosConstantesFunciones.getArrayColumnasGlobalesProcesoPedidos(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,ProcesoPedidosConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.procesopedidossEliminados= new ArrayList<ProcesoPedidos>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessProcesoPedidos();
		
				///*ProcesoPedidosSessionBean*/this.procesopedidosSessionBean=new ProcesoPedidosSessionBean();
			
			if(this.procesopedidosSessionBean==null) {
				this.procesopedidosSessionBean=new ProcesoPedidosSessionBean();
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
					this.iNumeroPaginacion=ProcesoPedidosConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=ProcesoPedidosConstantesFunciones.getClassesForeignKeysOfProcesoPedidos(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/procesopedidos."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			procesopedidossAux= new ArrayList<ProcesoPedidos>();
			
				
			procesopedidosLogic.setDatosCliente(this.datosCliente);
			procesopedidosLogic.setDatosDeep(this.datosDeep);
			procesopedidosLogic.setIsConDeep(true);
			
			
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
			}
			
		
			else if(sAccionBusqueda.equals("BusquedaProcesoPedidos")) {
				this.sDetalleReporte=ProcesoPedidosConstantesFunciones.getDetalleIndiceBusquedaProcesoPedidos(id_ciudadBusquedaProcesoPedidos,id_zonaBusquedaProcesoPedidos,id_grupo_clienteBusquedaProcesoPedidos,id_vendedorBusquedaProcesoPedidos);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					procesopedidosLogic.getProcesoPedidossBusquedaProcesoPedidos(finalQueryGlobal,pagination,this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,id_ciudadBusquedaProcesoPedidos,id_zonaBusquedaProcesoPedidos,id_grupo_clienteBusquedaProcesoPedidos,id_vendedorBusquedaProcesoPedidos);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ProcesoPedidosConstantesFunciones.getDetalleIndiceBusquedaProcesoPedidos(id_ciudadBusquedaProcesoPedidos,id_zonaBusquedaProcesoPedidos,id_grupo_clienteBusquedaProcesoPedidos,id_vendedorBusquedaProcesoPedidos);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ProcesoPedidosConstantesFunciones.getDetalleIndiceBusquedaProcesoPedidos(id_ciudadBusquedaProcesoPedidos,id_zonaBusquedaProcesoPedidos,id_grupo_clienteBusquedaProcesoPedidos,id_vendedorBusquedaProcesoPedidos);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=procesopedidosLogic.getProcesoPedidoss()==null||procesopedidosLogic.getProcesoPedidoss().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=procesopedidoss==null|| procesopedidoss.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						procesopedidossAux=new ArrayList<ProcesoPedidos>();
						procesopedidossAux.addAll(procesopedidosLogic.getProcesoPedidoss());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							procesopedidossAux=new ArrayList<ProcesoPedidos>();
							procesopedidossAux.addAll(procesopedidoss);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							procesopedidosLogic.getProcesoPedidossBusquedaProcesoPedidos(finalQueryGlobal,pagination,this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,id_ciudadBusquedaProcesoPedidos,id_zonaBusquedaProcesoPedidos,id_grupo_clienteBusquedaProcesoPedidos,id_vendedorBusquedaProcesoPedidos);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ProcesoPedidosConstantesFunciones.getDetalleIndiceBusquedaProcesoPedidos(id_ciudadBusquedaProcesoPedidos,id_zonaBusquedaProcesoPedidos,id_grupo_clienteBusquedaProcesoPedidos,id_vendedorBusquedaProcesoPedidos);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ProcesoPedidosConstantesFunciones.getDetalleIndiceBusquedaProcesoPedidos(id_ciudadBusquedaProcesoPedidos,id_zonaBusquedaProcesoPedidos,id_grupo_clienteBusquedaProcesoPedidos,id_vendedorBusquedaProcesoPedidos);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteProcesoPedidoss("BusquedaProcesoPedidos",procesopedidosLogic.getProcesoPedidoss());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteProcesoPedidoss("BusquedaProcesoPedidos",procesopedidoss);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						procesopedidosLogic.setProcesoPedidoss(new ArrayList<ProcesoPedidos>());
						procesopedidosLogic.getProcesoPedidoss().addAll(procesopedidossAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							procesopedidoss=new ArrayList<ProcesoPedidos>();
							procesopedidoss.addAll(procesopedidossAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesProcesoPedidos();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessProcesoPedidos();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=procesopedidosLogic.getProcesoPedidoss().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=procesopedidoss.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=procesopedidosLogic.getProcesoPedidoss().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=procesopedidoss.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(ProcesoPedidos procesopedidos) {
		Boolean permite=true;
		
		if(this.procesopedidos.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=ProcesoPedidosConstantesFunciones.getOrderByListaProcesoPedidos();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=ProcesoPedidosConstantesFunciones.getOrderByListaProcesoPedidos();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ProcesoPedidos procesopedidos:procesopedidosLogic.getProcesoPedidoss()) {
				if(procesopedidos.getsType().equals(Constantes2.S_TOTALES)) {
					procesopedidosTotales=procesopedidos;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ProcesoPedidos procesopedidos:this.procesopedidoss) {
				if(procesopedidos.getsType().equals(Constantes2.S_TOTALES)) {
					procesopedidosTotales=procesopedidos;
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
			this.procesopedidosAux=new ProcesoPedidos();
			this.procesopedidosAux.setsType(Constantes2.S_TOTALES);
			this.procesopedidosAux.setIsNew(false);
			this.procesopedidosAux.setIsChanged(false);
			this.procesopedidosAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				//ProcesoPedidosConstantesFunciones.TotalizarValoresFilaProcesoPedidos(this.procesopedidosLogic.getProcesoPedidoss(),this.procesopedidosAux);
				
				//this.procesopedidosLogic.getProcesoPedidoss().add(this.procesopedidosAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				ProcesoPedidosConstantesFunciones.TotalizarValoresFilaProcesoPedidos(this.procesopedidoss,this.procesopedidosAux);
				
				this.procesopedidoss.add(this.procesopedidosAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		procesopedidosTotales=new ProcesoPedidos();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.procesopedidosLogic.getProcesoPedidoss().remove(procesopedidosTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.procesopedidoss.remove(procesopedidosTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		procesopedidosTotales=new ProcesoPedidos();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ProcesoPedidos procesopedidos:procesopedidosLogic.getProcesoPedidoss()) {
				if(procesopedidos.getsType().equals(Constantes2.S_TOTALES)) {
					procesopedidosTotales=procesopedidos;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				ProcesoPedidosConstantesFunciones.TotalizarValoresFilaProcesoPedidos(this.procesopedidosLogic.getProcesoPedidoss(),procesopedidosTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ProcesoPedidos procesopedidos:this.procesopedidoss) {
				if(procesopedidos.getsType().equals(Constantes2.S_TOTALES)) {
					procesopedidosTotales=procesopedidos;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				ProcesoPedidosConstantesFunciones.TotalizarValoresFilaProcesoPedidos(this.procesopedidoss,procesopedidosTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoPedidosConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getProcesoPedidossBusquedaProcesoPedidos()throws Exception {
		try {
			sAccionBusqueda="BusquedaProcesoPedidos";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getProcesoPedidossFK_IdCiudad()throws Exception {
		try {
			sAccionBusqueda="FK_IdCiudad";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getProcesoPedidossFK_IdGrupoCliente()throws Exception {
		try {
			sAccionBusqueda="FK_IdGrupoCliente";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getProcesoPedidossFK_IdVendedor()throws Exception {
		try {
			sAccionBusqueda="FK_IdVendedor";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getProcesoPedidossFK_IdZona()throws Exception {
		try {
			sAccionBusqueda="FK_IdZona";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getProcesoPedidossBusquedaProcesoPedidos(String sFinalQuery,Long id_ciudad,Long id_zona,Long id_grupo_cliente,Long id_vendedor)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//procesopedidosLogic.getProcesoPedidossBusquedaProcesoPedidos(sFinalQuery,this.pagination,id_ciudad,id_zona,id_grupo_cliente,id_vendedor);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getProcesoPedidossFK_IdCiudad(String sFinalQuery,Long id_ciudad)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//procesopedidosLogic.getProcesoPedidossFK_IdCiudad(sFinalQuery,this.pagination,id_ciudad);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getProcesoPedidossFK_IdGrupoCliente(String sFinalQuery,Long id_grupo_cliente)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//procesopedidosLogic.getProcesoPedidossFK_IdGrupoCliente(sFinalQuery,this.pagination,id_grupo_cliente);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getProcesoPedidossFK_IdVendedor(String sFinalQuery,Long id_vendedor)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//procesopedidosLogic.getProcesoPedidossFK_IdVendedor(sFinalQuery,this.pagination,id_vendedor);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getProcesoPedidossFK_IdZona(String sFinalQuery,Long id_zona)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//procesopedidosLogic.getProcesoPedidossFK_IdZona(sFinalQuery,this.pagination,id_zona);
				
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
	
	public void inicializarPermisosProcesoPedidos() {
		this.isPermisoTodoProcesoPedidos=false;
		this.isPermisoNuevoProcesoPedidos=false;
		this.isPermisoActualizarProcesoPedidos=false;
		this.isPermisoActualizarOriginalProcesoPedidos=false;
		this.isPermisoEliminarProcesoPedidos=false;
		this.isPermisoGuardarCambiosProcesoPedidos=false;
		this.isPermisoConsultaProcesoPedidos=true;
		this.isPermisoBusquedaProcesoPedidos=true;
		this.isPermisoReporteProcesoPedidos=true;
		this.isPermisoOrdenProcesoPedidos=false;		
		this.isPermisoPaginacionMedioProcesoPedidos=false;		
		this.isPermisoPaginacionAltoProcesoPedidos=false;		
		this.isPermisoPaginacionTodoProcesoPedidos=false;		
		this.isPermisoCopiarProcesoPedidos=false;		
		this.isPermisoVerFormProcesoPedidos=false;		
		this.isPermisoDuplicarProcesoPedidos=false;
		this.isPermisoOrdenProcesoPedidos=false;
	}
	
	public void setPermisosUsuarioProcesoPedidos(Boolean isPermiso) {
		this.isPermisoTodoProcesoPedidos=isPermiso;
		this.isPermisoNuevoProcesoPedidos=isPermiso;
		this.isPermisoActualizarProcesoPedidos=isPermiso;
		this.isPermisoActualizarOriginalProcesoPedidos=isPermiso;
		this.isPermisoEliminarProcesoPedidos=isPermiso;
		this.isPermisoGuardarCambiosProcesoPedidos=isPermiso;
		this.isPermisoConsultaProcesoPedidos=isPermiso;
		this.isPermisoBusquedaProcesoPedidos=isPermiso;
		this.isPermisoReporteProcesoPedidos=isPermiso;
		this.isPermisoOrdenProcesoPedidos=isPermiso;		
		this.isPermisoPaginacionMedioProcesoPedidos=isPermiso;		
		this.isPermisoPaginacionAltoProcesoPedidos=isPermiso;		
		this.isPermisoPaginacionTodoProcesoPedidos=isPermiso;		
		this.isPermisoCopiarProcesoPedidos=isPermiso;		
		this.isPermisoVerFormProcesoPedidos=isPermiso;		
		this.isPermisoDuplicarProcesoPedidos=isPermiso;
		this.isPermisoOrdenProcesoPedidos=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioProcesoPedidos(Boolean isPermiso) {
		//this.isPermisoTodoProcesoPedidos=isPermiso;
		this.isPermisoNuevoProcesoPedidos=isPermiso;
		this.isPermisoActualizarProcesoPedidos=isPermiso;
		this.isPermisoActualizarOriginalProcesoPedidos=isPermiso;
		this.isPermisoEliminarProcesoPedidos=isPermiso;
		this.isPermisoGuardarCambiosProcesoPedidos=isPermiso;
		//this.isPermisoConsultaProcesoPedidos=isPermiso;
		//this.isPermisoBusquedaProcesoPedidos=isPermiso;
		//this.isPermisoReporteProcesoPedidos=isPermiso;
		//this.isPermisoOrdenProcesoPedidos=isPermiso;		
		//this.isPermisoPaginacionMedioProcesoPedidos=isPermiso;		
		//this.isPermisoPaginacionAltoProcesoPedidos=isPermiso;		
		//this.isPermisoPaginacionTodoProcesoPedidos=isPermiso;		
		//this.isPermisoCopiarProcesoPedidos=isPermiso;		
		//this.isPermisoDuplicarProcesoPedidos=isPermiso;
		//this.isPermisoOrdenProcesoPedidos=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioProcesoPedidosClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(ProcesoPedidosJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebProcesoPedidos(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioProcesoPedidosClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioProcesoPedidosClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionProcesoPedidosClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioProcesoPedidosClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioProcesoPedidos() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(ProcesoPedidosJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.procesopedidosSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, ProcesoPedidosConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoProcesoPedidos=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarProcesoPedidos=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalProcesoPedidos=this.isPermisoActualizarProcesoPedidos;
			this.isPermisoEliminarProcesoPedidos=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosProcesoPedidos=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaProcesoPedidos=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaProcesoPedidos=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoProcesoPedidos=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteProcesoPedidos=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenProcesoPedidos=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioProcesoPedidos=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoProcesoPedidos=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoProcesoPedidos=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarProcesoPedidos=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormProcesoPedidos=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarProcesoPedidos=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenProcesoPedidos=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.procesopedidosSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosProcesoPedidos.setToolTipText(this.jTableDatosProcesoPedidos.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioProcesoPedidos(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioProcesoPedidos(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(ProcesoPedidosJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(ProcesoPedidosJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioProcesoPedidos() throws Exception {
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
	public void inicializarCombosForeignKeyProcesoPedidosListas()throws Exception {
		try	{						
			
				this.ciudadsForeignKey=new ArrayList();
				this.zonasForeignKey=new ArrayList();
				this.grupoclientesForeignKey=new ArrayList();
				this.vendedorsForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyProcesoPedidosListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(ProcesoPedidosJInternalFrame.ISLOAD_FKLOTE) {
			} else {
			
				this.cargarCombosForeignKeyCiudadListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyZonaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyGrupoClienteListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyVendedorListas(cargarCombosDependencia,sFinalQueryCombo);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	

	public void cargarCombosForeignKeyCiudadListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.ciudadsForeignKey==null||this.ciudadsForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=CiudadConstantesFunciones.getArrayColumnasGlobalesCiudad(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,CiudadConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=CiudadConstantesFunciones.SFINALQUERY;

				this.cargarCombosCiudadsForeignKeyLista(finalQueryGlobal);
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

	public void cargarCombosForeignKeyVendedorListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.vendedorsForeignKey==null||this.vendedorsForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=VendedorConstantesFunciones.getArrayColumnasGlobalesVendedor(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,VendedorConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=VendedorConstantesFunciones.SFINALQUERY;

				this.cargarCombosVendedorsForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}
	
	
	public void addItemDefectoCombosTodosForeignKeyProcesoPedidos()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyCiudad();
			this.addItemDefectoCombosForeignKeyZona();
			this.addItemDefectoCombosForeignKeyGrupoCliente();
			this.addItemDefectoCombosForeignKeyVendedor();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyCiudad()throws Exception {
		try {
			if(this.procesopedidosSessionBean==null) {
				this.procesopedidosSessionBean=new ProcesoPedidosSessionBean();
			}

			if(!this.procesopedidosSessionBean.getisBusquedaDesdeForeignKeySesionCiudad()) {
				Ciudad ciudad=new Ciudad();
				CiudadConstantesFunciones.setCiudadDescripcion(ciudad,Constantes.SMENSAJE_ESCOJA_OPCION);
				ciudad.setId(null);

				if(!CiudadConstantesFunciones.ExisteEnLista(this.ciudadsForeignKey,ciudad,true)) {

					this.ciudadsForeignKey.add(0,ciudad);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyZona()throws Exception {
		try {

			if(!this.procesopedidosSessionBean.getisBusquedaDesdeForeignKeySesionZona()) {
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

			if(!this.procesopedidosSessionBean.getisBusquedaDesdeForeignKeySesionGrupoCliente()) {
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

	public void addItemDefectoCombosForeignKeyVendedor()throws Exception {
		try {

			if(!this.procesopedidosSessionBean.getisBusquedaDesdeForeignKeySesionVendedor()) {
				Vendedor vendedor=new Vendedor();
				VendedorConstantesFunciones.setVendedorDescripcion(vendedor,Constantes.SMENSAJE_ESCOJA_OPCION);
				vendedor.setId(null);

				if(!VendedorConstantesFunciones.ExisteEnLista(this.vendedorsForeignKey,vendedor,true)) {

					this.vendedorsForeignKey.add(0,vendedor);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void initActionsCombosTodosForeignKeyProcesoPedidos()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyProcesoPedidos(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyProcesoPedidos()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyProcesoPedidos();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyProcesoPedidos(ProcesoPedidos procesopedidos)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyProcesoPedidos(ProcesoPedidos procesopedidos,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyProcesoPedidos()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyProcesoPedidos()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyProcesoPedidos()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyProcesoPedidos()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroProcesoPedidos()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyProcesoPedidos()throws Exception {
		try {
			

			this.cargarCombosFrameCiudadsForeignKey("Todos");
			this.cargarCombosFrameZonasForeignKey("Todos");
			this.cargarCombosFrameGrupoClientesForeignKey("Todos");
			this.cargarCombosFrameVendedorsForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyProcesoPedidos(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameCiudadsForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameZonasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameGrupoClientesForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameVendedorsForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyProcesoPedidos()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormProcesoPedidos.jComboBoxid_ciudadProcesoPedidos!=null && this.jInternalFrameDetalleFormProcesoPedidos.jComboBoxid_ciudadProcesoPedidos.getItemCount()>0) {
				this.jInternalFrameDetalleFormProcesoPedidos.jComboBoxid_ciudadProcesoPedidos.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormProcesoPedidos.jComboBoxid_zonaProcesoPedidos!=null && this.jInternalFrameDetalleFormProcesoPedidos.jComboBoxid_zonaProcesoPedidos.getItemCount()>0) {
				this.jInternalFrameDetalleFormProcesoPedidos.jComboBoxid_zonaProcesoPedidos.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormProcesoPedidos.jComboBoxid_grupo_clienteProcesoPedidos!=null && this.jInternalFrameDetalleFormProcesoPedidos.jComboBoxid_grupo_clienteProcesoPedidos.getItemCount()>0) {
				this.jInternalFrameDetalleFormProcesoPedidos.jComboBoxid_grupo_clienteProcesoPedidos.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormProcesoPedidos.jComboBoxid_vendedorProcesoPedidos!=null && this.jInternalFrameDetalleFormProcesoPedidos.jComboBoxid_vendedorProcesoPedidos.getItemCount()>0) {
				this.jInternalFrameDetalleFormProcesoPedidos.jComboBoxid_vendedorProcesoPedidos.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	








	
	

	public ProcesoPedidosBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public ProcesoPedidosBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public ProcesoPedidosBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.procesopedidosSessionBean=new ProcesoPedidosSessionBean(); 
		this.procesopedidosConstantesFunciones=new ProcesoPedidosConstantesFunciones(); 
		this.procesopedidosBean=new ProcesoPedidos();//(this.procesopedidosConstantesFunciones); 		
		this.procesopedidosReturnGeneral=new ProcesoPedidosParameterReturnGeneral(); 
		
		this.procesopedidosSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.procesopedidosSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public ProcesoPedidosBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public ProcesoPedidosBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public ProcesoPedidosBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessProcesoPedidos(true);
			
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
			
			this.procesopedidosConstantesFunciones=new ProcesoPedidosConstantesFunciones(); 
			this.procesopedidosBean=new ProcesoPedidos();//this.procesopedidosConstantesFunciones); 			
			this.procesopedidosReturnGeneral=new ProcesoPedidosParameterReturnGeneral(); 
		
			ProcesoPedidosBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Proceso Pedidos Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			this.conTotales=true;
			
			
			this.procesopedidos=new ProcesoPedidos();
			this.procesopedidoss = new ArrayList<ProcesoPedidos>();
			this.procesopedidossAux = new ArrayList<ProcesoPedidos>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesopedidosLogic=new ProcesoPedidosLogic();
				this.procesopedidosLogic.getNewConnexionToDeep("");
			}
			
			//this.procesopedidosSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.procesopedidosSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormProcesoPedidos);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoProcesoPedidos!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoProcesoPedidos);	
					}
					
					if(this.jInternalFrameImportacionProcesoPedidos!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionProcesoPedidos);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByProcesoPedidos!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByProcesoPedidos);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormProcesoPedidos!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormProcesoPedidos);
				this.jInternalFrameDetalleFormProcesoPedidos.setVisible(false);
				this.jInternalFrameDetalleFormProcesoPedidos.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoProcesoPedidos!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoProcesoPedidos);
					this.jInternalFrameReporteDinamicoProcesoPedidos.setVisible(false);
					this.jInternalFrameReporteDinamicoProcesoPedidos.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionProcesoPedidos!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionProcesoPedidos);
					this.jInternalFrameImportacionProcesoPedidos.setVisible(false);
					this.jInternalFrameImportacionProcesoPedidos.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByProcesoPedidos!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByProcesoPedidos);
					this.jInternalFrameOrderByProcesoPedidos.setVisible(false);
					this.jInternalFrameOrderByProcesoPedidos.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idProcesoPedidosActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=ProcesoPedidosConstantesFunciones.INUMEROPAGINACION;
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
			
			this.procesopedidosReturnGeneral=new ProcesoPedidosParameterReturnGeneral();
			
			this.procesopedidosParameterGeneral=new ProcesoPedidosParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.procesopedidosLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.procesopedidosSessionBean.getEsGuardarRelacionado()) {
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
			
			if(ProcesoPedidosJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.procesopedidosSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,ProcesoPedidosConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.procesopedidosSessionBean.getEsGuardarRelacionado(),this.procesopedidosSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,ProcesoPedidosConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.procesopedidosSessionBean.getEsGuardarRelacionado(),this.procesopedidosSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoProcesoPedidos=false;
			this.isVisibilidadCeldaDuplicarProcesoPedidos=true;
			this.isVisibilidadCeldaCopiarProcesoPedidos=true;
			this.isVisibilidadCeldaVerFormProcesoPedidos=true;
			this.isVisibilidadCeldaOrdenProcesoPedidos=true;
			this.isVisibilidadCeldaNuevoRelacionesProcesoPedidos=false;
			this.isVisibilidadCeldaModificarProcesoPedidos=false;
			this.isVisibilidadCeldaActualizarProcesoPedidos=false;
			this.isVisibilidadCeldaEliminarProcesoPedidos=false;
			this.isVisibilidadCeldaCancelarProcesoPedidos=false;
			this.isVisibilidadCeldaGuardarProcesoPedidos=false;
			this.isVisibilidadCeldaGuardarCambiosProcesoPedidos=false;
			
			
			this.isVisibilidadBusquedaProcesoPedidos=true;
			this.isVisibilidadFK_IdCiudad=true;
			this.isVisibilidadFK_IdGrupoCliente=true;
			this.isVisibilidadFK_IdVendedor=true;
			this.isVisibilidadFK_IdZona=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesProcesoPedidos("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosProcesoPedidos();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioProcesoPedidos(false);
			
			this.setPermisosUsuarioProcesoPedidos();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.procesopedidosSessionBean.getEsGuardarRelacionado() 
				|| (this.procesopedidosSessionBean.getEsGuardarRelacionado() && this.procesopedidosSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioProcesoPedidosClasesRelacionadas();
			}
			
			if(this.procesopedidosSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioProcesoPedidosClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!ProcesoPedidosJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosProcesoPedidos();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualProcesoPedidos();
			}
			
			if(!this.isPermisoBusquedaProcesoPedidos) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasProcesoPedidos.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.procesopedidosSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(true);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(true);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(true,true,true);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(ProcesoPedidosConstantesFunciones.getTiposSeleccionarProcesoPedidos());
				
				this.tiposColumnasSelect=ProcesoPedidosConstantesFunciones.getTiposSeleccionarProcesoPedidos(true);
				
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
			//if(!this.procesopedidosSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioProcesoPedidos();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(true,false,false);
				this.setAccionesUsuarioProcesoPedidos(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(true,false,false);							
				this.setAccionesUsuarioProcesoPedidos(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesProcesoPedidos() ;
			
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
			
			this.ciudadLogic=new CiudadLogic();
			this.zonaLogic=new ZonaLogic();
			this.grupoclienteLogic=new GrupoClienteLogic();
			this.vendedorLogic=new VendedorLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				procesopedidosImplementable= (ProcesoPedidosImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+ProcesoPedidosConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				procesopedidosImplementableHome= (ProcesoPedidosImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+ProcesoPedidosConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.procesopedidoss= new ArrayList<ProcesoPedidos>();
			this.procesopedidossEliminados= new ArrayList<ProcesoPedidos>();
						
			this.isEsNuevoProcesoPedidos=false;
			this.esParaAccionDesdeFormularioProcesoPedidos=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.ciudadsForeignKey=new ArrayList<Ciudad>() ;
			this.zonasForeignKey=new ArrayList<Zona>() ;
			this.grupoclientesForeignKey=new ArrayList<GrupoCliente>() ;
			this.vendedorsForeignKey=new ArrayList<Vendedor>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyProcesoPedidos(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroProcesoPedidos();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.procesopedidosSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			ProcesoPedidosBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=ProcesoPedidosConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesProcesoPedidos("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingProcesoPedidos(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormProcesoPedidos!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioProcesoPedidos();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioProcesoPedidos();
			}
			
			ProcesoPedidosBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasProcesoPedidos.getTabCount(); i++) {
					this.jTabbedPaneBusquedasProcesoPedidos.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasProcesoPedidos.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesopedidosLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessProcesoPedidos(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga ProcesoPedidos: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesopedidosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ProcesoPedidosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesopedidosLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectProcesoPedidos() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesProcesoPedidos")) {
				iIndex=this.jInternalFrameDetalleFormProcesoPedidos.jTabbedPaneRelacionesProcesoPedidos.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormProcesoPedidos.jTabbedPaneRelacionesProcesoPedidos.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosProcesoPedidos.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessProcesoPedidos();	
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
	
	public void cargarCombosForeignKeyProcesoPedidos(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyProcesoPedidos(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyProcesoPedidos(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyProcesoPedidosListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyProcesoPedidos();
		
		this.cargarCombosFrameForeignKeyProcesoPedidos();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyProcesoPedidos();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyProcesoPedidos();
		}
	}
	
	

	public void cargarCombosForeignKeyCiudad(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyCiudadListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyCiudad();
				this.cargarCombosFrameCiudadsForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaCiudad(this.ciudadsForeignKey);

		} catch(Exception e) {
			throw e;
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

	public void cargarCombosForeignKeyVendedor(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyVendedorListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyVendedor();
				this.cargarCombosFrameVendedorsForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaVendedor(this.vendedorsForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void jButtonNuevoProcesoPedidosActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.procesopedidosSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormProcesoPedidos==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			ProcesoPedidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.procesopedidos,new Object(),this.procesopedidosParameterGeneral,this.procesopedidosReturnGeneral);
			
			
			if(jTableDatosProcesoPedidos.getRowCount()>=1) {
				jTableDatosProcesoPedidos.removeRowSelectionInterval(0, jTableDatosProcesoPedidos.getRowCount()-1);						
			}
			
			this.isEsNuevoProcesoPedidos=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoProcesoPedidos(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesProcesoPedidos(true);			
			//this.procesopedidos=new ProcesoPedidos();
			//this.procesopedidos.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesProcesoPedidos(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualProcesoPedidos() ;
			
			if(ProcesoPedidosJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleProcesoPedidos(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.procesopedidos);	
			this.actualizarInformacion("INFO_PADRE",false,this.procesopedidos);				
			
			ProcesoPedidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.procesopedidos,new Object(),this.procesopedidosParameterGeneral,this.procesopedidosReturnGeneral);
			
			if(this.procesopedidosSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar ProcesoPedidos: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			ProcesoPedidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.procesopedidos,new Object(),this.procesopedidosParameterGeneral,this.procesopedidosReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,ProcesoPedidosConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarProcesoPedidosActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<ProcesoPedidos> procesopedidossSeleccionados=new ArrayList<ProcesoPedidos>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosProcesoPedidos.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosProcesoPedidos.getSelectedRows().length;			
			}
			
			procesopedidossSeleccionados=this.getProcesoPedidossSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoProcesoPedidos--;			
				//ProcesoPedidos procesopedidosAux= new ProcesoPedidos();			
				//procesopedidosAux.setId(this.iIdNuevoProcesoPedidos);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//ProcesoPedidos procesopedidosOrigen=new ProcesoPedidos();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(ProcesoPedidos procesopedidosOrigen : procesopedidossSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosProcesoPedidos.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							procesopedidosOrigen =(ProcesoPedidos) this.procesopedidosLogic.getProcesoPedidoss().toArray()[this.jTableDatosProcesoPedidos.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							procesopedidosOrigen =(ProcesoPedidos) this.procesopedidoss.toArray()[this.jTableDatosProcesoPedidos.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaProcesoPedidos();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.procesopedidos.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosProcesoPedidos(procesopedidosOrigen,this.procesopedidos,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoPedidos(this.procesopedidos);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.procesopedidosLogic.getProcesoPedidoss().add(this.procesopedidosAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.procesopedidoss.add(this.procesopedidosAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaProcesoPedidos(false);
				
				this.jTableDatosProcesoPedidos.setRowSelectionInterval(this.getIndiceNuevoProcesoPedidos(), this.getIndiceNuevoProcesoPedidos());
				
				int iLastRow =  this.jTableDatosProcesoPedidos.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosProcesoPedidos.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosProcesoPedidos.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaProcesoPedidos(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,ProcesoPedidosConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarProcesoPedidosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<ProcesoPedidos> procesopedidossSeleccionados=new ArrayList<ProcesoPedidos>();									
		
			ProcesoPedidos procesopedidosOrigen=new ProcesoPedidos();
			ProcesoPedidos procesopedidosDestino=new ProcesoPedidos();
				
			procesopedidossSeleccionados=this.getProcesoPedidossSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosProcesoPedidos.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || procesopedidossSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosProcesoPedidos.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						procesopedidosOrigen =(ProcesoPedidos) this.procesopedidosLogic.getProcesoPedidoss().toArray()[this.jTableDatosProcesoPedidos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						procesopedidosOrigen =(ProcesoPedidos) this.procesopedidoss.toArray()[this.jTableDatosProcesoPedidos.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						procesopedidosDestino =(ProcesoPedidos) this.procesopedidosLogic.getProcesoPedidoss().toArray()[this.jTableDatosProcesoPedidos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						procesopedidosDestino =(ProcesoPedidos) this.procesopedidoss.toArray()[this.jTableDatosProcesoPedidos.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				procesopedidosOrigen =procesopedidossSeleccionados.get(0);
				procesopedidosDestino =procesopedidossSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosProcesoPedidos(procesopedidosOrigen,procesopedidosDestino,true,false);
				
				procesopedidosDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(procesopedidosDestino,procesopedidosLogic.getProcesoPedidoss());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(procesopedidosDestino,procesopedidoss);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaProcesoPedidos(false);
				
				//this.jTableDatosProcesoPedidos.setRowSelectionInterval(this.getIndiceNuevoProcesoPedidos(), this.getIndiceNuevoProcesoPedidos());
				
				int iLastRow =  this.jTableDatosProcesoPedidos.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosProcesoPedidos.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosProcesoPedidos.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaProcesoPedidos(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoPedidosConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormProcesoPedidosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormProcesoPedidos==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormProcesoPedidos.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoPedidosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarProcesoPedidosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesProcesoPedidos.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasProcesoPedidos.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesProcesoPedidos.setVisible(!isVisible);
			this.jPanelPaginacionProcesoPedidos.setVisible(!isVisible);
			this.jPanelAccionesProcesoPedidos.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoPedidosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarProcesoPedidosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameProcesoPedidos();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoPedidosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoProcesoPedidosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoProcesoPedidos();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoPedidosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionProcesoPedidosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionProcesoPedidos();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoPedidosConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByProcesoPedidosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByProcesoPedidos();
			
			this.abrirFrameOrderByProcesoPedidos();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoPedidosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByProcesoPedidosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByProcesoPedidos();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoPedidosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleProcesoPedidos(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormProcesoPedidos);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormProcesoPedidos.isMaximum()) {
					this.jInternalFrameDetalleFormProcesoPedidos.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormProcesoPedidos.setSize(this.jInternalFrameDetalleFormProcesoPedidos.iWidthFormulario,this.jInternalFrameDetalleFormProcesoPedidos.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormProcesoPedidos.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormProcesoPedidos.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormProcesoPedidos.isMaximum()) {
						this.jInternalFrameDetalleFormProcesoPedidos.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormProcesoPedidos.jContentPaneDetalleProcesoPedidos.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormProcesoPedidos.jTabbedPaneRelacionesProcesoPedidos.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormProcesoPedidos.jContentPaneDetalleProcesoPedidos.getWidth(),ProcesoPedidosConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormProcesoPedidos.jTabbedPaneRelacionesProcesoPedidos.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormProcesoPedidos.jContentPaneDetalleProcesoPedidos.getWidth(),ProcesoPedidosConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormProcesoPedidos.jTabbedPaneRelacionesProcesoPedidos.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormProcesoPedidos.jContentPaneDetalleProcesoPedidos.getWidth(),ProcesoPedidosConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormProcesoPedidos.setVisible(true);
	        this.jInternalFrameDetalleFormProcesoPedidos.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProcesoPedidosConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByProcesoPedidos() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByProcesoPedidos==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByProcesoPedidos=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByProcesoPedidos,false,this);
				} else {
					this.jInternalFrameOrderByProcesoPedidos=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByProcesoPedidos,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByProcesoPedidos);
				this.jInternalFrameOrderByProcesoPedidos.setVisible(false);
				this.jInternalFrameOrderByProcesoPedidos.setSelected(false);
				
				this.jInternalFrameOrderByProcesoPedidos.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByProcesoPedidos"));
				
				this.inicializarActualizarBindingTablaOrderByProcesoPedidos();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionProcesoPedidos() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionProcesoPedidos==null) {
				
				this.jInternalFrameImportacionProcesoPedidos=new ImportacionJInternalFrame(ProcesoPedidosConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionProcesoPedidos);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionProcesoPedidos);
				this.jInternalFrameImportacionProcesoPedidos.setVisible(false);
				this.jInternalFrameImportacionProcesoPedidos.setSelected(false);


				this.jInternalFrameImportacionProcesoPedidos.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionProcesoPedidos"));
				this.jInternalFrameImportacionProcesoPedidos.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionProcesoPedidos"));
				this.jInternalFrameImportacionProcesoPedidos.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionProcesoPedidos"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoProcesoPedidos() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoProcesoPedidos==null) {
				this.jInternalFrameReporteDinamicoProcesoPedidos=new ReporteDinamicoJInternalFrame(ProcesoPedidosConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoProcesoPedidos);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoProcesoPedidos);
				this.jInternalFrameReporteDinamicoProcesoPedidos.setVisible(false);
				this.jInternalFrameReporteDinamicoProcesoPedidos.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoProcesoPedidos.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoProcesoPedidos"));
				this.jInternalFrameReporteDinamicoProcesoPedidos.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoProcesoPedidos"));
				this.jInternalFrameReporteDinamicoProcesoPedidos.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoProcesoPedidos"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualProcesoPedidos();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleProcesoPedidos() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormProcesoPedidos);
			
	       	this.jInternalFrameDetalleFormProcesoPedidos.setVisible(false);
	        this.jInternalFrameDetalleFormProcesoPedidos.setSelected(false);
			
			//this.jInternalFrameDetalleFormProcesoPedidos.dispose();
			//this.jInternalFrameDetalleFormProcesoPedidos=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProcesoPedidosConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoProcesoPedidos() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoProcesoPedidos.setVisible(true);
	        this.jInternalFrameReporteDinamicoProcesoPedidos.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProcesoPedidosConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionProcesoPedidos() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionProcesoPedidos.setVisible(true);
	        this.jInternalFrameImportacionProcesoPedidos.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProcesoPedidosConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByProcesoPedidos() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByProcesoPedidos.setVisible(true);
	        this.jInternalFrameOrderByProcesoPedidos.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProcesoPedidosConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByProcesoPedidos() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByProcesoPedidos.setVisible(false);
	        this.jInternalFrameOrderByProcesoPedidos.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProcesoPedidosConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoProcesoPedidos() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoProcesoPedidos.setVisible(false);
	        this.jInternalFrameReporteDinamicoProcesoPedidos.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProcesoPedidosConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionProcesoPedidos() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionProcesoPedidos.setVisible(false);
	        this.jInternalFrameImportacionProcesoPedidos.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProcesoPedidosConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarProcesoPedidosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarProcesoPedidos(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoPedidosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarProcesoPedidos(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosProcesoPedidos.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesProcesoPedidos(true);
			//this.isEsNuevoProcesoPedidos=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesopedidos =(ProcesoPedidos) this.procesopedidosLogic.getProcesoPedidoss().toArray()[this.jTableDatosProcesoPedidos.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.procesopedidos =(ProcesoPedidos) this.procesopedidoss.toArray()[this.jTableDatosProcesoPedidos.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesProcesoPedidos("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesProcesoPedidos(false) ;
			
			if(procesopedidosSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(ProcesoPedidosJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleProcesoPedidos(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualProcesoPedidos(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoPedidosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaProcesoPedidosActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosProcesoPedidos.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesopedidos =(ProcesoPedidos) this.procesopedidosLogic.getProcesoPedidoss().toArray()[this.jTableDatosProcesoPedidos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.procesopedidos =(ProcesoPedidos) this.procesopedidoss.toArray()[this.jTableDatosProcesoPedidos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoPedidosConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarProcesoPedidos(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormProcesoPedidos==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosProcesoPedidos.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesProcesoPedidos(true);
			//this.isEsNuevoProcesoPedidos=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesopedidos =(ProcesoPedidos) this.procesopedidosLogic.getProcesoPedidoss().toArray()[this.jTableDatosProcesoPedidos.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.procesopedidos =(ProcesoPedidos) this.procesopedidoss.toArray()[this.jTableDatosProcesoPedidos.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.procesopedidos.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesProcesoPedidos("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesProcesoPedidos(false) ;
			
			if(ProcesoPedidosJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleProcesoPedidos(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualProcesoPedidos(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoPedidosConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	public void recargarComboTablaCiudad(List<Ciudad> ciudadsForeignKey)throws Exception{
		TableColumn tableColumnCiudad=this.jTableDatosProcesoPedidos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProcesoPedidos,ProcesoPedidosConstantesFunciones.LABEL_IDCIUDAD));
		TableCellEditor tableCellEditorCiudad =tableColumnCiudad.getCellEditor();

		CiudadTableCell ciudadTableCellFk=(CiudadTableCell)tableCellEditorCiudad;

		if(ciudadTableCellFk!=null) {
			ciudadTableCellFk.setciudadsForeignKey(ciudadsForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosProcesoPedidos.getSelectedRow();

		//if(intSelectedRow<=0) {
			//ciudadTableCellFk.setRowActual(intSelectedRow);
			//ciudadTableCellFk.setciudadsForeignKeyActual(ciudadsForeignKey);
		//}


		if(ciudadTableCellFk!=null) {
			ciudadTableCellFk.RecargarCiudadsForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaZona(List<Zona> zonasForeignKey)throws Exception{
		TableColumn tableColumnZona=this.jTableDatosProcesoPedidos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProcesoPedidos,ProcesoPedidosConstantesFunciones.LABEL_IDZONA));
		TableCellEditor tableCellEditorZona =tableColumnZona.getCellEditor();

		ZonaTableCell zonaTableCellFk=(ZonaTableCell)tableCellEditorZona;

		if(zonaTableCellFk!=null) {
			zonaTableCellFk.setzonasForeignKey(zonasForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosProcesoPedidos.getSelectedRow();

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
		TableColumn tableColumnGrupoCliente=this.jTableDatosProcesoPedidos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProcesoPedidos,ProcesoPedidosConstantesFunciones.LABEL_IDGRUPOCLIENTE));
		TableCellEditor tableCellEditorGrupoCliente =tableColumnGrupoCliente.getCellEditor();

		GrupoClienteTableCell grupoclienteTableCellFk=(GrupoClienteTableCell)tableCellEditorGrupoCliente;

		if(grupoclienteTableCellFk!=null) {
			grupoclienteTableCellFk.setgrupoclientesForeignKey(grupoclientesForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosProcesoPedidos.getSelectedRow();

		//if(intSelectedRow<=0) {
			//grupoclienteTableCellFk.setRowActual(intSelectedRow);
			//grupoclienteTableCellFk.setgrupoclientesForeignKeyActual(grupoclientesForeignKey);
		//}


		if(grupoclienteTableCellFk!=null) {
			grupoclienteTableCellFk.RecargarGrupoClientesForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaVendedor(List<Vendedor> vendedorsForeignKey)throws Exception{
		TableColumn tableColumnVendedor=this.jTableDatosProcesoPedidos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProcesoPedidos,ProcesoPedidosConstantesFunciones.LABEL_IDVENDEDOR));
		TableCellEditor tableCellEditorVendedor =tableColumnVendedor.getCellEditor();

		VendedorTableCell vendedorTableCellFk=(VendedorTableCell)tableCellEditorVendedor;

		if(vendedorTableCellFk!=null) {
			vendedorTableCellFk.setvendedorsForeignKey(vendedorsForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosProcesoPedidos.getSelectedRow();

		//if(intSelectedRow<=0) {
			//vendedorTableCellFk.setRowActual(intSelectedRow);
			//vendedorTableCellFk.setvendedorsForeignKeyActual(vendedorsForeignKey);
		//}


		if(vendedorTableCellFk!=null) {
			vendedorTableCellFk.RecargarVendedorsForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	
	public void jButtonActualizarProcesoPedidosActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesopedidosLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesProcesoPedidos(false);
			
			//if(!this.isEsNuevoProcesoPedidos) {								
				int intSelectedRow = this.jTableDatosProcesoPedidos.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesopedidos =(ProcesoPedidos) this.procesopedidosLogic.getProcesoPedidoss().toArray()[this.jTableDatosProcesoPedidos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.procesopedidos =(ProcesoPedidos) this.procesopedidoss.toArray()[this.jTableDatosProcesoPedidos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(ProcesoPedidosJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualProcesoPedidos(this.procesopedidos,true);
				this.setVariablesFormularioToObjetoActualForeignKeysProcesoPedidos(this.procesopedidos);
				
			}
			
			if(this.permiteMantenimiento(this.procesopedidos)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.procesopedidosSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoProcesoPedidos=true;
					this.inicializarActualizarBindingTablaProcesoPedidos(false);
					this.isEsNuevoProcesoPedidos=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoProcesoPedidos=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoProcesoPedidos=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesProcesoPedidos(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualProcesoPedidos(false);
				
				this.habilitarDeshabilitarControlesProcesoPedidos(false);
			
												
				
				if(ProcesoPedidosJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleProcesoPedidos();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoProcesoPedidosActionPerformed(evt,procesopedidosSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualProcesoPedidos(this.procesopedidos,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosProcesoPedidos.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,procesopedidosSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesopedidosLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.procesopedidos.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(ProcesoPedidos.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesoPedidos.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesopedidosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ProcesoPedidosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesopedidosLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarProcesoPedidosActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesopedidosLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosProcesoPedidos.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesopedidos =(ProcesoPedidos) this.procesopedidosLogic.getProcesoPedidoss().toArray()[this.jTableDatosProcesoPedidos.convertRowIndexToModel(intSelectedRow)];
				this.procesopedidos.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.procesopedidos =(ProcesoPedidos) this.procesopedidoss.toArray()[this.jTableDatosProcesoPedidos.convertRowIndexToModel(intSelectedRow)];
				this.procesopedidos.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.procesopedidos)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.procesopedidosSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((ProcesoPedidosModel) this.jTableDatosProcesoPedidos.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoProcesoPedidos=true;
				this.inicializarActualizarBindingTablaProcesoPedidos(false);
				this.isEsNuevoProcesoPedidos=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesProcesoPedidos(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualProcesoPedidos(false);
				
				this.habilitarDeshabilitarControlesProcesoPedidos(false);
				
				
				
				if(ProcesoPedidosJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleProcesoPedidos();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesopedidosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesopedidosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProcesoPedidosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesopedidosLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarProcesoPedidosActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosProcesoPedidos.getRowCount()>=1) {
				jTableDatosProcesoPedidos.removeRowSelectionInterval(0, jTableDatosProcesoPedidos.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesProcesoPedidos(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaProcesoPedidos(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesProcesoPedidos(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualProcesoPedidos(false) ;
			
			this.isEsNuevoProcesoPedidos=false;
			
			if(ProcesoPedidosJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleProcesoPedidos();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoPedidosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosProcesoPedidosActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesopedidosLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingProcesoPedidos(false);
				
				//SI ES MANUAL
				if(ProcesoPedidosJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualProcesoPedidos();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesopedidosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesopedidosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProcesoPedidosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesopedidosLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosProcesoPedidosActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoProcesoPedidos--;			
			//ProcesoPedidos procesopedidosAux= new ProcesoPedidos();			
			//procesopedidosAux.setId(this.iIdNuevoProcesoPedidos);
			
			if(this.jInternalFrameDetalleFormProcesoPedidos==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaProcesoPedidos();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysProcesoPedidos(this.procesopedidos);
			
			this.procesopedidos.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.procesopedidosLogic.getProcesoPedidoss().add(this.procesopedidosAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.procesopedidoss.add(this.procesopedidosAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaProcesoPedidos(false);
			
			this.jTableDatosProcesoPedidos.setRowSelectionInterval(this.getIndiceNuevoProcesoPedidos(), this.getIndiceNuevoProcesoPedidos());
			
			int iLastRow =  this.jTableDatosProcesoPedidos.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosProcesoPedidos.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosProcesoPedidos.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaProcesoPedidos(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,ProcesoPedidosConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionProcesoPedidosActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesopedidosLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingProcesoPedidos(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingProcesoPedidos(false);
			
			//SI ES MANUAL
			if(ProcesoPedidosJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualProcesoPedidos();
			}
			
			//this.abrirFrameTreeProcesoPedidos();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesopedidosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesopedidosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ProcesoPedidosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesopedidosLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionProcesoPedidosActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoPedidosConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionProcesoPedidosActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionProcesoPedidos.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionProcesoPedidos.setFileImportacion(this.jInternalFrameImportacionProcesoPedidos.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionProcesoPedidos.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionProcesoPedidos.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionProcesoPedidos.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionProcesoPedidos.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoPedidosConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoProcesoPedidosActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<ProcesoPedidos> procesopedidossSeleccionados=new ArrayList<ProcesoPedidos>();		

		procesopedidossSeleccionados=this.getProcesoPedidossSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoProcesoPedidos.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoProcesoPedidos.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("ProcesoPedidosBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"ProcesoPedidosBaseDesign.jrxml";
			
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
			
			this.generarReporteProcesoPedidoss("Todos",procesopedidossSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.procesopedidosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Proceso Pedidos",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoPedidosConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoProcesoPedidos.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoProcesoPedidos.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case ProcesoPedidosConstantesFunciones.LABEL_NOMBREPROVINCIA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreProvincia_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreProvincia_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreProvincia_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreProvincia_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ProcesoPedidosConstantesFunciones.LABEL_NOMBRECIUDAD:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreCiudad_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreCiudad_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreCiudad_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreCiudad_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ProcesoPedidosConstantesFunciones.LABEL_NOMBREZONA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreZona_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreZona_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreZona_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreZona_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ProcesoPedidosConstantesFunciones.LABEL_NOMBREGRUPOCLIENTE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreGrupoCliente_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreGrupoCliente_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreGrupoCliente_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreGrupoCliente_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ProcesoPedidosConstantesFunciones.LABEL_NOMBREVENDEDOR:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreVendedor_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreVendedor_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreVendedor_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreVendedor_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ProcesoPedidosConstantesFunciones.LABEL_CODIGO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ProcesoPedidosConstantesFunciones.LABEL_NOMBRECOMPLETO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreCompleto_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreCompleto_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreCompleto_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreCompleto_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ProcesoPedidosConstantesFunciones.LABEL_NUMERO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mero_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mero_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mero_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mero_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ProcesoPedidosConstantesFunciones.LABEL_NUMEROAUTORIZACION:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_meroAutorizacion_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_meroAutorizacion_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_meroAutorizacion_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_meroAutorizacion_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ProcesoPedidosConstantesFunciones.LABEL_TOTAL:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_tal_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_tal_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_tal_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_tal_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ProcesoPedidosConstantesFunciones.LABEL_FECHAEMISION:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_chaEmision_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_chaEmision_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_chaEmision_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_chaEmision_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoProcesoPedidos.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoProcesoPedidos.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoProcesoPedidos.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case ProcesoPedidosConstantesFunciones.LABEL_NOMBREPROVINCIA:
					sNombreCampoCategoria="nombre_provincia";
					break;

				case ProcesoPedidosConstantesFunciones.LABEL_NOMBRECIUDAD:
					sNombreCampoCategoria="nombre_ciudad";
					break;

				case ProcesoPedidosConstantesFunciones.LABEL_NOMBREZONA:
					sNombreCampoCategoria="nombre_zona";
					break;

				case ProcesoPedidosConstantesFunciones.LABEL_NOMBREGRUPOCLIENTE:
					sNombreCampoCategoria="nombre_grupo_cliente";
					break;

				case ProcesoPedidosConstantesFunciones.LABEL_NOMBREVENDEDOR:
					sNombreCampoCategoria="nombre_vendedor";
					break;

				case ProcesoPedidosConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoria="codigo";
					break;

				case ProcesoPedidosConstantesFunciones.LABEL_NOMBRECOMPLETO:
					sNombreCampoCategoria="nombre_completo";
					break;

				case ProcesoPedidosConstantesFunciones.LABEL_NUMERO:
					sNombreCampoCategoria="numero";
					break;

				case ProcesoPedidosConstantesFunciones.LABEL_NUMEROAUTORIZACION:
					sNombreCampoCategoria="numero_autorizacion";
					break;

				case ProcesoPedidosConstantesFunciones.LABEL_TOTAL:
					sNombreCampoCategoria="total";
					break;

				case ProcesoPedidosConstantesFunciones.LABEL_FECHAEMISION:
					sNombreCampoCategoria="fecha_emision";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoProcesoPedidos.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case ProcesoPedidosConstantesFunciones.LABEL_NOMBREPROVINCIA:
					sNombreCampoCategoriaValor="nombre_provincia";
					break;

				case ProcesoPedidosConstantesFunciones.LABEL_NOMBRECIUDAD:
					sNombreCampoCategoriaValor="nombre_ciudad";
					break;

				case ProcesoPedidosConstantesFunciones.LABEL_NOMBREZONA:
					sNombreCampoCategoriaValor="nombre_zona";
					break;

				case ProcesoPedidosConstantesFunciones.LABEL_NOMBREGRUPOCLIENTE:
					sNombreCampoCategoriaValor="nombre_grupo_cliente";
					break;

				case ProcesoPedidosConstantesFunciones.LABEL_NOMBREVENDEDOR:
					sNombreCampoCategoriaValor="nombre_vendedor";
					break;

				case ProcesoPedidosConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoriaValor="codigo";
					break;

				case ProcesoPedidosConstantesFunciones.LABEL_NOMBRECOMPLETO:
					sNombreCampoCategoriaValor="nombre_completo";
					break;

				case ProcesoPedidosConstantesFunciones.LABEL_NUMERO:
					sNombreCampoCategoriaValor="numero";
					break;

				case ProcesoPedidosConstantesFunciones.LABEL_NUMEROAUTORIZACION:
					sNombreCampoCategoriaValor="numero_autorizacion";
					break;

				case ProcesoPedidosConstantesFunciones.LABEL_TOTAL:
					sNombreCampoCategoriaValor="total";
					break;

				case ProcesoPedidosConstantesFunciones.LABEL_FECHAEMISION:
					sNombreCampoCategoriaValor="fecha_emision";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoProcesoPedidos.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoProcesoPedidos.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case ProcesoPedidosConstantesFunciones.LABEL_NOMBREPROVINCIA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Provincia",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_provincia");
					break;

				case ProcesoPedidosConstantesFunciones.LABEL_NOMBRECIUDAD:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Ciudad",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_ciudad");
					break;

				case ProcesoPedidosConstantesFunciones.LABEL_NOMBREZONA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Zona",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_zona");
					break;

				case ProcesoPedidosConstantesFunciones.LABEL_NOMBREGRUPOCLIENTE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Grupo Cliente",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_grupo_cliente");
					break;

				case ProcesoPedidosConstantesFunciones.LABEL_NOMBREVENDEDOR:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Vendedor",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_vendedor");
					break;

				case ProcesoPedidosConstantesFunciones.LABEL_CODIGO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo");
					break;

				case ProcesoPedidosConstantesFunciones.LABEL_NOMBRECOMPLETO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Completo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_completo");
					break;

				case ProcesoPedidosConstantesFunciones.LABEL_NUMERO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Numero",sNombreCampoCategoria,sNombreCampoCategoriaValor,"numero");
					break;

				case ProcesoPedidosConstantesFunciones.LABEL_NUMEROAUTORIZACION:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Numero Autorizacion",sNombreCampoCategoria,sNombreCampoCategoriaValor,"numero_autorizacion");
					break;

				case ProcesoPedidosConstantesFunciones.LABEL_TOTAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Total",sNombreCampoCategoria,sNombreCampoCategoriaValor,"total");
					break;

				case ProcesoPedidosConstantesFunciones.LABEL_FECHAEMISION:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Fecha Emision",sNombreCampoCategoria,sNombreCampoCategoriaValor,"fecha_emision");
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
	
	public void jButtonGenerarExcelReporteDinamicoProcesoPedidosActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<ProcesoPedidos> procesopedidossSeleccionados=new ArrayList<ProcesoPedidos>();		
		
		procesopedidossSeleccionados=this.getProcesoPedidossSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"procesopedidos";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("ProcesoPedidoss");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoProcesoPedidos.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoProcesoPedidos.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case ProcesoPedidosConstantesFunciones.LABEL_IDCIUDAD:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProcesoPedidosConstantesFunciones.LABEL_IDCIUDAD);
					iRow++;

					for(ProcesoPedidos procesopedidos:procesopedidossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(procesopedidos.getciudad_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProcesoPedidosConstantesFunciones.LABEL_IDZONA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProcesoPedidosConstantesFunciones.LABEL_IDZONA);
					iRow++;

					for(ProcesoPedidos procesopedidos:procesopedidossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(procesopedidos.getzona_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProcesoPedidosConstantesFunciones.LABEL_IDGRUPOCLIENTE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProcesoPedidosConstantesFunciones.LABEL_IDGRUPOCLIENTE);
					iRow++;

					for(ProcesoPedidos procesopedidos:procesopedidossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(procesopedidos.getgrupocliente_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProcesoPedidosConstantesFunciones.LABEL_IDVENDEDOR:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProcesoPedidosConstantesFunciones.LABEL_IDVENDEDOR);
					iRow++;

					for(ProcesoPedidos procesopedidos:procesopedidossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(procesopedidos.getvendedor_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProcesoPedidosConstantesFunciones.LABEL_NOMBREPROVINCIA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProcesoPedidosConstantesFunciones.LABEL_NOMBREPROVINCIA);
					iRow++;

					for(ProcesoPedidos procesopedidos:procesopedidossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(procesopedidos.getnombre_provincia());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProcesoPedidosConstantesFunciones.LABEL_NOMBRECIUDAD:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProcesoPedidosConstantesFunciones.LABEL_NOMBRECIUDAD);
					iRow++;

					for(ProcesoPedidos procesopedidos:procesopedidossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(procesopedidos.getnombre_ciudad());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProcesoPedidosConstantesFunciones.LABEL_NOMBREZONA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProcesoPedidosConstantesFunciones.LABEL_NOMBREZONA);
					iRow++;

					for(ProcesoPedidos procesopedidos:procesopedidossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(procesopedidos.getnombre_zona());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProcesoPedidosConstantesFunciones.LABEL_NOMBREGRUPOCLIENTE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProcesoPedidosConstantesFunciones.LABEL_NOMBREGRUPOCLIENTE);
					iRow++;

					for(ProcesoPedidos procesopedidos:procesopedidossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(procesopedidos.getnombre_grupo_cliente());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProcesoPedidosConstantesFunciones.LABEL_NOMBREVENDEDOR:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProcesoPedidosConstantesFunciones.LABEL_NOMBREVENDEDOR);
					iRow++;

					for(ProcesoPedidos procesopedidos:procesopedidossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(procesopedidos.getnombre_vendedor());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProcesoPedidosConstantesFunciones.LABEL_CODIGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProcesoPedidosConstantesFunciones.LABEL_CODIGO);
					iRow++;

					for(ProcesoPedidos procesopedidos:procesopedidossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(procesopedidos.getcodigo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProcesoPedidosConstantesFunciones.LABEL_NOMBRECOMPLETO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProcesoPedidosConstantesFunciones.LABEL_NOMBRECOMPLETO);
					iRow++;

					for(ProcesoPedidos procesopedidos:procesopedidossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(procesopedidos.getnombre_completo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProcesoPedidosConstantesFunciones.LABEL_NUMERO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProcesoPedidosConstantesFunciones.LABEL_NUMERO);
					iRow++;

					for(ProcesoPedidos procesopedidos:procesopedidossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(procesopedidos.getnumero());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProcesoPedidosConstantesFunciones.LABEL_NUMEROAUTORIZACION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProcesoPedidosConstantesFunciones.LABEL_NUMEROAUTORIZACION);
					iRow++;

					for(ProcesoPedidos procesopedidos:procesopedidossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(procesopedidos.getnumero_autorizacion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProcesoPedidosConstantesFunciones.LABEL_TOTAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProcesoPedidosConstantesFunciones.LABEL_TOTAL);
					iRow++;

					for(ProcesoPedidos procesopedidos:procesopedidossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(procesopedidos.gettotal());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProcesoPedidosConstantesFunciones.LABEL_FECHAEMISION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProcesoPedidosConstantesFunciones.LABEL_FECHAEMISION);
					iRow++;

					for(ProcesoPedidos procesopedidos:procesopedidossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(procesopedidos.getfecha_emision());
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
			//	this.getFilaCabeceraExportarExcelProcesoPedidos(row);				
			//	iRow++;
			//}				
			
			//for(ProcesoPedidos procesopedidosAux:procesopedidossSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelProcesoPedidos(procesopedidosAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.procesopedidosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Proceso Pedidos",JOptionPane.INFORMATION_MESSAGE);
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
				this.procesopedidosLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingProcesoPedidos(false);
			
			//SI ES MANUAL
			if(ProcesoPedidosJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualProcesoPedidos();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesopedidosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesopedidosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesopedidosLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresProcesoPedidosActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesopedidosLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingProcesoPedidos(false);
			
			//SI ES MANUAL
			if(ProcesoPedidosJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualProcesoPedidos();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesopedidosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesopedidosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ProcesoPedidosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesopedidosLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesProcesoPedidosActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesopedidosLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingProcesoPedidos(false);
			
			//SI ES MANUAL
			if(ProcesoPedidosJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualProcesoPedidos();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesopedidosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesopedidosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ProcesoPedidosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesopedidosLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaProcesoPedidos() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosProcesoPedidos.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosProcesoPedidos.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosProcesoPedidos.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosProcesoPedidos.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosProcesoPedidos.setMinimumSize(dimensionMinimum);
		this.jTableDatosProcesoPedidos.setMaximumSize(dimensionMaximum);
		this.jTableDatosProcesoPedidos.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingProcesoPedidos(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingProcesoPedidos(esInicializar,true);
	}
	
	public void inicializarActualizarBindingProcesoPedidos(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaProcesoPedidos(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesProcesoPedidos(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.procesopedidosSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasProcesoPedidos(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesProcesoPedidos(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesProcesoPedidos(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !ProcesoPedidosJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!ProcesoPedidosJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualProcesoPedidos() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaProcesoPedidos();
		
		this.inicializarActualizarBindingBotonesManualProcesoPedidos(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.procesopedidosSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualProcesoPedidos();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesProcesoPedidos() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualProcesoPedidos(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualProcesoPedidos(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosProcesoPedidos.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosProcesoPedidos.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteProcesoPedidos.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormProcesoPedidos!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormProcesoPedidos.jCheckBoxPostAccionNuevoProcesoPedidos.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormProcesoPedidos.jCheckBoxPostAccionSinCerrarProcesoPedidos.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormProcesoPedidos.jCheckBoxPostAccionSinMensajeProcesoPedidos.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosProcesoPedidos.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosProcesoPedidos.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteProcesoPedidos.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormProcesoPedidos!=null) {
				this.jInternalFrameDetalleFormProcesoPedidos.jCheckBoxPostAccionNuevoProcesoPedidos.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormProcesoPedidos.jCheckBoxPostAccionSinCerrarProcesoPedidos.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormProcesoPedidos.jCheckBoxPostAccionSinMensajeProcesoPedidos.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionProcesoPedidos.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionProcesoPedidos.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormProcesoPedidos!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormProcesoPedidos.jComboBoxTiposAccionesFormularioProcesoPedidos.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesProcesoPedidos.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoProcesoPedidos!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoProcesoPedidos.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesProcesoPedidos.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesProcesoPedidos.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarProcesoPedidos.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesProcesoPedidos.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoProcesoPedidos!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoProcesoPedidos.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesProcesoPedidos.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralProcesoPedidos.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesProcesoPedidos(Boolean esInicializar) throws Exception {
		try	{	
			if(ProcesoPedidosJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualProcesoPedidos(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesProcesoPedidos() throws Exception {
		try	{
			if(ProcesoPedidosJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualProcesoPedidos();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleProcesoPedidos() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormProcesoPedidos.jComboBoxTiposAccionesFormularioProcesoPedidos.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormProcesoPedidos.jComboBoxTiposAccionesFormularioProcesoPedidos.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualProcesoPedidos() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesProcesoPedidos.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesProcesoPedidos.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesProcesoPedidos.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesProcesoPedidos.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesProcesoPedidos.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesProcesoPedidos.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionProcesoPedidos.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionProcesoPedidos.addItem(reporte);
			}
			
			
			if(!this.procesopedidosSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionProcesoPedidos.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionProcesoPedidos.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesProcesoPedidos.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesProcesoPedidos.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesProcesoPedidos.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesProcesoPedidos.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormProcesoPedidos!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormProcesoPedidos.jComboBoxTiposAccionesFormularioProcesoPedidos.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormProcesoPedidos.jComboBoxTiposAccionesFormularioProcesoPedidos.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarProcesoPedidos.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarProcesoPedidos.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarProcesoPedidos.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualProcesoPedidos();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualProcesoPedidos() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoProcesoPedidos!=null) {
				this.jInternalFrameReporteDinamicoProcesoPedidos.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoProcesoPedidos.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoProcesoPedidos!=null) {
				this.jInternalFrameReporteDinamicoProcesoPedidos.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoProcesoPedidos.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoProcesoPedidos!=null) {
				
				if(this.jInternalFrameReporteDinamicoProcesoPedidos.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoProcesoPedidos.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoProcesoPedidos.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoProcesoPedidos.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoProcesoPedidos.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoProcesoPedidos.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
				
				//TIPOS COLUMNAS CATEGORIA DINAMICO
				if(this.jInternalFrameReporteDinamicoProcesoPedidos.getjComboBoxColumnaCategoriaGrafico()!=null) {
					this.jInternalFrameReporteDinamicoProcesoPedidos.getjComboBoxColumnaCategoriaGrafico().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoria=ProcesoPedidosConstantesFunciones.getTiposSeleccionarProcesoPedidos(true,true,false,true,true);
						
					for(Reporte reporte:tiposColumnasCategoria) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoProcesoPedidos.getjComboBoxColumnaCategoriaGrafico().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS CATEGORIA VALOR DINAMICO
				if(this.jInternalFrameReporteDinamicoProcesoPedidos.getjComboBoxColumnaCategoriaValor()!=null) {
					this.jInternalFrameReporteDinamicoProcesoPedidos.getjComboBoxColumnaCategoriaValor().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoriaValor=ProcesoPedidosConstantesFunciones.getTiposSeleccionarProcesoPedidos(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasCategoriaValor) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoProcesoPedidos.getjComboBoxColumnaCategoriaValor().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS VALOR
				defaultListModel=new DefaultListModel<Reporte>();
					
				if(this.jInternalFrameReporteDinamicoProcesoPedidos.getjListColumnasValoresGrafico()!=null) {
					this.jInternalFrameReporteDinamicoProcesoPedidos.getjListColumnasValoresGrafico().removeAll();
						
					ArrayList<Reporte> tiposColumnasValor=ProcesoPedidosConstantesFunciones.getTiposSeleccionarProcesoPedidos(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasValor) {//this.tiposSeleccionar
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoProcesoPedidos.getjListColumnasValoresGrafico().setModel(defaultListModel);									
						
				}
					
				//TIPOS GRAFICOS REPORTES DINAMICOS
				if(this.jInternalFrameReporteDinamicoProcesoPedidos.getjComboBoxTiposGraficosReportesDinamico()!=null) {
					this.jInternalFrameReporteDinamicoProcesoPedidos.getjComboBoxTiposGraficosReportesDinamico().removeAllItems();
						
					for(Reporte reporte:this.tiposGraficosReportes) {
						this.jInternalFrameReporteDinamicoProcesoPedidos.getjComboBoxTiposGraficosReportesDinamico().addItem(reporte);
					}
					
				}
			
			
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualProcesoPedidos()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_ciudadBusquedaProcesoPedidosProcesoPedidos.getSelectedItem()!=null){this.id_ciudadBusquedaProcesoPedidos=((Ciudad)this.jComboBoxid_ciudadBusquedaProcesoPedidosProcesoPedidos.getSelectedItem()).getId();}
		if(this.jComboBoxid_zonaBusquedaProcesoPedidosProcesoPedidos.getSelectedItem()!=null){this.id_zonaBusquedaProcesoPedidos=((Zona)this.jComboBoxid_zonaBusquedaProcesoPedidosProcesoPedidos.getSelectedItem()).getId();}
		if(this.jComboBoxid_grupo_clienteBusquedaProcesoPedidosProcesoPedidos.getSelectedItem()!=null){this.id_grupo_clienteBusquedaProcesoPedidos=((GrupoCliente)this.jComboBoxid_grupo_clienteBusquedaProcesoPedidosProcesoPedidos.getSelectedItem()).getId();}
		if(this.jComboBoxid_vendedorBusquedaProcesoPedidosProcesoPedidos.getSelectedItem()!=null){this.id_vendedorBusquedaProcesoPedidos=((Vendedor)this.jComboBoxid_vendedorBusquedaProcesoPedidosProcesoPedidos.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasProcesoPedidos(Boolean esInicializar) throws Exception {				
		if(ProcesoPedidosJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualProcesoPedidos();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaProcesoPedidos() throws Exception {
		this.inicializarActualizarBindingTablaProcesoPedidos(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByProcesoPedidos() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByProcesoPedidos.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByProcesoPedidos.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByProcesoPedidos.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new ProcesoPedidosPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByProcesoPedidos.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByProcesoPedidos.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new ProcesoPedidosPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosProcesoPedidosOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProcesoPedidosOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new ProcesoPedidosPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByProcesoPedidos.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByProcesoPedidos.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new ProcesoPedidosPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByProcesoPedidos.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaProcesoPedidos(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=procesopedidosLogic.getProcesoPedidoss().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=procesopedidoss.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(ProcesoPedidosJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosProcesoPedidos.setModel(new ProcesoPedidosModel(this.procesopedidosLogic.getProcesoPedidoss(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosProcesoPedidos.setModel(new ProcesoPedidosModel(this.procesopedidoss,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByProcesoPedidos!=null && this.jInternalFrameOrderByProcesoPedidos.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByProcesoPedidos();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosProcesoPedidos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProcesoPedidos,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new ProcesoPedidosPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+ProcesoPedidosConstantesFunciones.SCLASSWEBTITULO,procesopedidosConstantesFunciones.resaltarSeleccionarProcesoPedidos,iSizeTabla,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+ProcesoPedidosConstantesFunciones.SCLASSWEBTITULO,procesopedidosConstantesFunciones.resaltarSeleccionarProcesoPedidos,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosProcesoPedidos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProcesoPedidos,ProcesoPedidosConstantesFunciones.LABEL_ID));

		if(this.procesopedidosConstantesFunciones.mostraridProcesoPedidos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProcesoPedidosConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.procesopedidosConstantesFunciones.resaltaridProcesoPedidos,this.procesopedidosConstantesFunciones.activaridProcesoPedidos,iSizeTabla,this,true,"idProcesoPedidos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.procesopedidosConstantesFunciones.resaltaridProcesoPedidos,this.procesopedidosConstantesFunciones.activaridProcesoPedidos,this,true,"idProcesoPedidos","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProcesoPedidos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProcesoPedidos,ProcesoPedidosConstantesFunciones.LABEL_NOMBREPROVINCIA));

		if(this.procesopedidosConstantesFunciones.mostrarnombre_provinciaProcesoPedidos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProcesoPedidosConstantesFunciones.LABEL_NOMBREPROVINCIA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.procesopedidosConstantesFunciones.resaltarnombre_provinciaProcesoPedidos,this.procesopedidosConstantesFunciones.activarnombre_provinciaProcesoPedidos,iSizeTabla,this,true,"nombre_provinciaProcesoPedidos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.procesopedidosConstantesFunciones.resaltarnombre_provinciaProcesoPedidos,this.procesopedidosConstantesFunciones.activarnombre_provinciaProcesoPedidos,this,true,"nombre_provinciaProcesoPedidos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ProcesoPedidosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProcesoPedidos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProcesoPedidos,ProcesoPedidosConstantesFunciones.LABEL_NOMBRECIUDAD));

		if(this.procesopedidosConstantesFunciones.mostrarnombre_ciudadProcesoPedidos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProcesoPedidosConstantesFunciones.LABEL_NOMBRECIUDAD,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.procesopedidosConstantesFunciones.resaltarnombre_ciudadProcesoPedidos,this.procesopedidosConstantesFunciones.activarnombre_ciudadProcesoPedidos,iSizeTabla,this,true,"nombre_ciudadProcesoPedidos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.procesopedidosConstantesFunciones.resaltarnombre_ciudadProcesoPedidos,this.procesopedidosConstantesFunciones.activarnombre_ciudadProcesoPedidos,this,true,"nombre_ciudadProcesoPedidos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ProcesoPedidosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProcesoPedidos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProcesoPedidos,ProcesoPedidosConstantesFunciones.LABEL_NOMBREZONA));

		if(this.procesopedidosConstantesFunciones.mostrarnombre_zonaProcesoPedidos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProcesoPedidosConstantesFunciones.LABEL_NOMBREZONA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.procesopedidosConstantesFunciones.resaltarnombre_zonaProcesoPedidos,this.procesopedidosConstantesFunciones.activarnombre_zonaProcesoPedidos,iSizeTabla,this,true,"nombre_zonaProcesoPedidos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.procesopedidosConstantesFunciones.resaltarnombre_zonaProcesoPedidos,this.procesopedidosConstantesFunciones.activarnombre_zonaProcesoPedidos,this,true,"nombre_zonaProcesoPedidos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ProcesoPedidosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProcesoPedidos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProcesoPedidos,ProcesoPedidosConstantesFunciones.LABEL_NOMBREGRUPOCLIENTE));

		if(this.procesopedidosConstantesFunciones.mostrarnombre_grupo_clienteProcesoPedidos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProcesoPedidosConstantesFunciones.LABEL_NOMBREGRUPOCLIENTE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.procesopedidosConstantesFunciones.resaltarnombre_grupo_clienteProcesoPedidos,this.procesopedidosConstantesFunciones.activarnombre_grupo_clienteProcesoPedidos,iSizeTabla,this,true,"nombre_grupo_clienteProcesoPedidos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.procesopedidosConstantesFunciones.resaltarnombre_grupo_clienteProcesoPedidos,this.procesopedidosConstantesFunciones.activarnombre_grupo_clienteProcesoPedidos,this,true,"nombre_grupo_clienteProcesoPedidos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ProcesoPedidosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProcesoPedidos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProcesoPedidos,ProcesoPedidosConstantesFunciones.LABEL_NOMBREVENDEDOR));

		if(this.procesopedidosConstantesFunciones.mostrarnombre_vendedorProcesoPedidos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProcesoPedidosConstantesFunciones.LABEL_NOMBREVENDEDOR,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.procesopedidosConstantesFunciones.resaltarnombre_vendedorProcesoPedidos,this.procesopedidosConstantesFunciones.activarnombre_vendedorProcesoPedidos,iSizeTabla,this,true,"nombre_vendedorProcesoPedidos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.procesopedidosConstantesFunciones.resaltarnombre_vendedorProcesoPedidos,this.procesopedidosConstantesFunciones.activarnombre_vendedorProcesoPedidos,this,true,"nombre_vendedorProcesoPedidos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ProcesoPedidosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProcesoPedidos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProcesoPedidos,ProcesoPedidosConstantesFunciones.LABEL_CODIGO));

		if(this.procesopedidosConstantesFunciones.mostrarcodigoProcesoPedidos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProcesoPedidosConstantesFunciones.LABEL_CODIGO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.procesopedidosConstantesFunciones.resaltarcodigoProcesoPedidos,this.procesopedidosConstantesFunciones.activarcodigoProcesoPedidos,iSizeTabla,this,true,"codigoProcesoPedidos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.procesopedidosConstantesFunciones.resaltarcodigoProcesoPedidos,this.procesopedidosConstantesFunciones.activarcodigoProcesoPedidos,this,true,"codigoProcesoPedidos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ProcesoPedidosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProcesoPedidos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProcesoPedidos,ProcesoPedidosConstantesFunciones.LABEL_NOMBRECOMPLETO));

		if(this.procesopedidosConstantesFunciones.mostrarnombre_completoProcesoPedidos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProcesoPedidosConstantesFunciones.LABEL_NOMBRECOMPLETO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.procesopedidosConstantesFunciones.resaltarnombre_completoProcesoPedidos,this.procesopedidosConstantesFunciones.activarnombre_completoProcesoPedidos,iSizeTabla,this,true,"nombre_completoProcesoPedidos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.procesopedidosConstantesFunciones.resaltarnombre_completoProcesoPedidos,this.procesopedidosConstantesFunciones.activarnombre_completoProcesoPedidos,this,true,"nombre_completoProcesoPedidos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ProcesoPedidosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProcesoPedidos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProcesoPedidos,ProcesoPedidosConstantesFunciones.LABEL_NUMERO));

		if(this.procesopedidosConstantesFunciones.mostrarnumeroProcesoPedidos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProcesoPedidosConstantesFunciones.LABEL_NUMERO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.procesopedidosConstantesFunciones.resaltarnumeroProcesoPedidos,this.procesopedidosConstantesFunciones.activarnumeroProcesoPedidos,iSizeTabla,this,true,"numeroProcesoPedidos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.procesopedidosConstantesFunciones.resaltarnumeroProcesoPedidos,this.procesopedidosConstantesFunciones.activarnumeroProcesoPedidos,this,true,"numeroProcesoPedidos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ProcesoPedidosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProcesoPedidos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProcesoPedidos,ProcesoPedidosConstantesFunciones.LABEL_NUMEROAUTORIZACION));

		if(this.procesopedidosConstantesFunciones.mostrarnumero_autorizacionProcesoPedidos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProcesoPedidosConstantesFunciones.LABEL_NUMEROAUTORIZACION,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.procesopedidosConstantesFunciones.resaltarnumero_autorizacionProcesoPedidos,this.procesopedidosConstantesFunciones.activarnumero_autorizacionProcesoPedidos,iSizeTabla,this,true,"numero_autorizacionProcesoPedidos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.procesopedidosConstantesFunciones.resaltarnumero_autorizacionProcesoPedidos,this.procesopedidosConstantesFunciones.activarnumero_autorizacionProcesoPedidos,this,true,"numero_autorizacionProcesoPedidos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ProcesoPedidosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProcesoPedidos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProcesoPedidos,ProcesoPedidosConstantesFunciones.LABEL_TOTAL));

		if(this.procesopedidosConstantesFunciones.mostrartotalProcesoPedidos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProcesoPedidosConstantesFunciones.LABEL_TOTAL,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.procesopedidosConstantesFunciones.resaltartotalProcesoPedidos,this.procesopedidosConstantesFunciones.activartotalProcesoPedidos,iSizeTabla,this,true,"totalProcesoPedidos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.procesopedidosConstantesFunciones.resaltartotalProcesoPedidos,this.procesopedidosConstantesFunciones.activartotalProcesoPedidos,this,true,"totalProcesoPedidos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new ProcesoPedidosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProcesoPedidos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProcesoPedidos,ProcesoPedidosConstantesFunciones.LABEL_FECHAEMISION));

		if(this.procesopedidosConstantesFunciones.mostrarfecha_emisionProcesoPedidos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProcesoPedidosConstantesFunciones.LABEL_FECHAEMISION,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new DateRenderer(this.procesopedidosConstantesFunciones.resaltarfecha_emisionProcesoPedidos,this.procesopedidosConstantesFunciones.activarfecha_emisionProcesoPedidos,iSizeTabla,this,true,"fecha_emisionProcesoPedidos","BASICO"));
			tableColumn.setCellEditor(new DateEditorRenderer(this.procesopedidosConstantesFunciones.resaltarfecha_emisionProcesoPedidos,this.procesopedidosConstantesFunciones.activarfecha_emisionProcesoPedidos,this,true,"fecha_emisionProcesoPedidos","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30);
			//tableColumn.addPropertyChangeListener(new ProcesoPedidosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.procesopedidosSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.procesopedidosSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.procesopedidosSessionBean.getEsGuardarRelacionado(),iSizeTabla));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosProcesoPedidos.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.procesopedidosSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.procesopedidosSessionBean.getEsGuardarRelacionado(),iSizeTabla));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosProcesoPedidos.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarProcesoPedidos && this.isPermisoGuardarCambiosProcesoPedidos) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.procesopedidosSessionBean.getEsGuardarRelacionado(),iSizeTabla));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.procesopedidosSessionBean.getEsGuardarRelacionado(),iSizeTabla));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosProcesoPedidos.addColumn(tableColumn);
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
			
			this.jTableDatosProcesoPedidos.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarProcesoPedidos && this.isPermisoGuardarCambiosProcesoPedidos) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarProcesoPedidos && this.isPermisoGuardarCambiosProcesoPedidos) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosProcesoPedidos.moveColumn(this.jTableDatosProcesoPedidos.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosProcesoPedidos.moveColumn(this.jTableDatosProcesoPedidos.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosProcesoPedidos.moveColumn(this.jTableDatosProcesoPedidos.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosProcesoPedidos.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosProcesoPedidos.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosProcesoPedidos,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!ProcesoPedidosJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosProcesoPedidos.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosProcesoPedidos.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!ProcesoPedidosJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!ProcesoPedidosJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosProcesoPedidos.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosProcesoPedidos.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosProcesoPedidos.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							//iSize=procesopedidosLogic.getProcesoPedidoss().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=procesopedidoss.size()-1;
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
		//this.jTableDatosProcesoPedidos.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosProcesoPedidos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosProcesoPedidos();
			
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
				
				//this.isEsNuevoProcesoPedidos=false;
					
				ProcesoPedidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.procesopedidos,new Object(),this.procesopedidosParameterGeneral,this.procesopedidosReturnGeneral);
			
				if(this.procesopedidosSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormProcesoPedidos==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosProcesoPedidos.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosProcesoPedidos.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesopedidos =(ProcesoPedidos) this.procesopedidosLogic.getProcesoPedidoss().toArray()[this.jTableDatosProcesoPedidos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.procesopedidos =(ProcesoPedidos) this.procesopedidoss.toArray()[this.jTableDatosProcesoPedidos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.procesopedidos.getsType().equals("DUPLICADO")
				   || this.procesopedidos.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoProcesoPedidos=true;
				
				} else {
					this.isEsNuevoProcesoPedidos=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.procesopedidosSessionBean.getEsGuardarRelacionado()) {
					if(this.procesopedidos.getId()>=0 && !this.procesopedidos.getIsNew()) {						
						this.isEsNuevoProcesoPedidos=false;
						
					} else {
						this.isEsNuevoProcesoPedidos=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoProcesoPedidos(esRelaciones);						
				
				this.seleccionarProcesoPedidos(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.procesopedidos.getId()<0) {
					this.isEsNuevoProcesoPedidos=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarProcesoPedidos(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarProcesoPedidos(evt,rowIndex);
				}	
				
				if(this.procesopedidosSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion ProcesoPedidos: " + this.dDif); 
					}
				}								
				
				ProcesoPedidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.procesopedidos,new Object(),this.procesopedidosParameterGeneral,this.procesopedidosReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarProcesoPedidos(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.procesopedidos)) {
					if(this.procesopedidos.getId()>0) {
						this.procesopedidos.setIsDeleted(true);
						
						this.procesopedidossEliminados.add(this.procesopedidos);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.procesopedidosLogic.getProcesoPedidoss().remove(this.procesopedidos);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.procesopedidoss.remove(this.procesopedidos);				
					}
					
					
					((ProcesoPedidosModel) this.jTableDatosProcesoPedidos.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaProcesoPedidos(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,ProcesoPedidosConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarProcesoPedidos(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoProcesoPedidos) {
			
			if(this.jInternalFrameDetalleFormProcesoPedidos==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosProcesoPedidos.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosProcesoPedidos.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesopedidos =(ProcesoPedidos) this.procesopedidosLogic.getProcesoPedidoss().toArray()[this.jTableDatosProcesoPedidos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.procesopedidos =(ProcesoPedidos) this.procesopedidoss.toArray()[this.jTableDatosProcesoPedidos.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(ProcesoPedidosJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioProcesoPedidos(this.procesopedidos);
				}
				
				//ARCHITECTURE
				try {
					
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesProcesoPedidos("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesProcesoPedidos(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualProcesoPedidos() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoPedidosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoProcesoPedidos(ProcesoPedidos procesopedidos) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoProcesoPedidos(procesopedidos,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoProcesoPedidos(ProcesoPedidos procesopedidos,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioProcesoPedidos(procesopedidos);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyProcesoPedidos(procesopedidos,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyProcesoPedidos(procesopedidos);
	}
	
	public void setVariablesObjetoActualToFormularioProcesoPedidos(ProcesoPedidos procesopedidos) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormProcesoPedidos==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormProcesoPedidos.jLabelidProcesoPedidos.setText(procesopedidos.getId().toString());
			this.jInternalFrameDetalleFormProcesoPedidos.jTextAreanombre_provinciaProcesoPedidos.setText(procesopedidos.getnombre_provincia());
			this.jInternalFrameDetalleFormProcesoPedidos.jTextAreanombre_ciudadProcesoPedidos.setText(procesopedidos.getnombre_ciudad());
			this.jInternalFrameDetalleFormProcesoPedidos.jTextFieldnombre_zonaProcesoPedidos.setText(procesopedidos.getnombre_zona());
			this.jInternalFrameDetalleFormProcesoPedidos.jTextAreanombre_grupo_clienteProcesoPedidos.setText(procesopedidos.getnombre_grupo_cliente());
			this.jInternalFrameDetalleFormProcesoPedidos.jTextAreanombre_vendedorProcesoPedidos.setText(procesopedidos.getnombre_vendedor());
			this.jInternalFrameDetalleFormProcesoPedidos.jTextFieldcodigoProcesoPedidos.setText(procesopedidos.getcodigo());
			this.jInternalFrameDetalleFormProcesoPedidos.jTextAreanombre_completoProcesoPedidos.setText(procesopedidos.getnombre_completo());
			this.jInternalFrameDetalleFormProcesoPedidos.jTextFieldnumeroProcesoPedidos.setText(procesopedidos.getnumero());
			this.jInternalFrameDetalleFormProcesoPedidos.jTextFieldnumero_autorizacionProcesoPedidos.setText(procesopedidos.getnumero_autorizacion());
			this.jInternalFrameDetalleFormProcesoPedidos.jTextFieldtotalProcesoPedidos.setText(procesopedidos.gettotal().toString());
			this.jInternalFrameDetalleFormProcesoPedidos.jDateChooserfecha_emisionProcesoPedidos.setDate(procesopedidos.getfecha_emision());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProcesoPedidosConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,ProcesoPedidos procesopedidosLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,procesopedidosLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,ProcesoPedidos procesopedidosLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				procesopedidosLocal=this.procesopedidos;
			} else {
				procesopedidosLocal=this.procesopedidosAnterior;
			}
		}
		
		if(this.permiteMantenimiento(procesopedidosLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoProcesoPedidos(procesopedidosLocal,true);
					
					if(procesopedidosSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(procesopedidosLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.procesopedidosSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(procesopedidosLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoProcesoPedidos(ProcesoPedidos procesopedidos,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualProcesoPedidos(procesopedidos,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysProcesoPedidos(procesopedidos);
	}
	
	public void setVariablesFormularioToObjetoActualProcesoPedidos(ProcesoPedidos procesopedidos,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualProcesoPedidos(procesopedidos,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualProcesoPedidos(ProcesoPedidos procesopedidos,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormProcesoPedidos==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormProcesoPedidos.jLabelidProcesoPedidos.getText()==null || this.jInternalFrameDetalleFormProcesoPedidos.jLabelidProcesoPedidos.getText()=="" || this.jInternalFrameDetalleFormProcesoPedidos.jLabelidProcesoPedidos.getText()=="Id") {
				this.jInternalFrameDetalleFormProcesoPedidos.jLabelidProcesoPedidos.setText("0");
			}

			if(conColumnasBase) {procesopedidos.setId(Long.parseLong(this.jInternalFrameDetalleFormProcesoPedidos.jLabelidProcesoPedidos.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ProcesoPedidosConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProcesoPedidos.jLabelIdProcesoPedidos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			procesopedidos.setnombre_provincia(this.jInternalFrameDetalleFormProcesoPedidos.jTextAreanombre_provinciaProcesoPedidos.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ProcesoPedidosConstantesFunciones.LABEL_NOMBREPROVINCIA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProcesoPedidos.jLabelnombre_provinciaProcesoPedidos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			procesopedidos.setnombre_ciudad(this.jInternalFrameDetalleFormProcesoPedidos.jTextAreanombre_ciudadProcesoPedidos.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ProcesoPedidosConstantesFunciones.LABEL_NOMBRECIUDAD+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProcesoPedidos.jLabelnombre_ciudadProcesoPedidos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			procesopedidos.setnombre_zona(this.jInternalFrameDetalleFormProcesoPedidos.jTextFieldnombre_zonaProcesoPedidos.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ProcesoPedidosConstantesFunciones.LABEL_NOMBREZONA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProcesoPedidos.jLabelnombre_zonaProcesoPedidos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			procesopedidos.setnombre_grupo_cliente(this.jInternalFrameDetalleFormProcesoPedidos.jTextAreanombre_grupo_clienteProcesoPedidos.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ProcesoPedidosConstantesFunciones.LABEL_NOMBREGRUPOCLIENTE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProcesoPedidos.jLabelnombre_grupo_clienteProcesoPedidos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			procesopedidos.setnombre_vendedor(this.jInternalFrameDetalleFormProcesoPedidos.jTextAreanombre_vendedorProcesoPedidos.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ProcesoPedidosConstantesFunciones.LABEL_NOMBREVENDEDOR+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProcesoPedidos.jLabelnombre_vendedorProcesoPedidos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			procesopedidos.setcodigo(this.jInternalFrameDetalleFormProcesoPedidos.jTextFieldcodigoProcesoPedidos.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ProcesoPedidosConstantesFunciones.LABEL_CODIGO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProcesoPedidos.jLabelcodigoProcesoPedidos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			procesopedidos.setnombre_completo(this.jInternalFrameDetalleFormProcesoPedidos.jTextAreanombre_completoProcesoPedidos.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ProcesoPedidosConstantesFunciones.LABEL_NOMBRECOMPLETO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProcesoPedidos.jLabelnombre_completoProcesoPedidos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			procesopedidos.setnumero(this.jInternalFrameDetalleFormProcesoPedidos.jTextFieldnumeroProcesoPedidos.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ProcesoPedidosConstantesFunciones.LABEL_NUMERO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProcesoPedidos.jLabelnumeroProcesoPedidos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			procesopedidos.setnumero_autorizacion(this.jInternalFrameDetalleFormProcesoPedidos.jTextFieldnumero_autorizacionProcesoPedidos.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ProcesoPedidosConstantesFunciones.LABEL_NUMEROAUTORIZACION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProcesoPedidos.jLabelnumero_autorizacionProcesoPedidos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			procesopedidos.settotal(Double.parseDouble(this.jInternalFrameDetalleFormProcesoPedidos.jTextFieldtotalProcesoPedidos.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ProcesoPedidosConstantesFunciones.LABEL_TOTAL+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProcesoPedidos.jLabeltotalProcesoPedidos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			procesopedidos.setfecha_emision(this.jInternalFrameDetalleFormProcesoPedidos.jDateChooserfecha_emisionProcesoPedidos.getDate());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ProcesoPedidosConstantesFunciones.LABEL_FECHAEMISION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProcesoPedidos.jLabelfecha_emisionProcesoPedidos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProcesoPedidosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualProcesoPedidos(ProcesoPedidos procesopedidosBean,ProcesoPedidos procesopedidos,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProcesoPedidosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosProcesoPedidos(ProcesoPedidos procesopedidosOrigen,ProcesoPedidos procesopedidos,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && procesopedidosOrigen.getId()!=null && !procesopedidosOrigen.getId().equals(0L))) {procesopedidos.setId(procesopedidosOrigen.getId());}}
			if(conDefault || (!conDefault && procesopedidosOrigen.getnombre_provincia()!=null && !procesopedidosOrigen.getnombre_provincia().equals(""))) {procesopedidos.setnombre_provincia(procesopedidosOrigen.getnombre_provincia());}
			if(conDefault || (!conDefault && procesopedidosOrigen.getnombre_ciudad()!=null && !procesopedidosOrigen.getnombre_ciudad().equals(""))) {procesopedidos.setnombre_ciudad(procesopedidosOrigen.getnombre_ciudad());}
			if(conDefault || (!conDefault && procesopedidosOrigen.getnombre_zona()!=null && !procesopedidosOrigen.getnombre_zona().equals(""))) {procesopedidos.setnombre_zona(procesopedidosOrigen.getnombre_zona());}
			if(conDefault || (!conDefault && procesopedidosOrigen.getnombre_grupo_cliente()!=null && !procesopedidosOrigen.getnombre_grupo_cliente().equals(""))) {procesopedidos.setnombre_grupo_cliente(procesopedidosOrigen.getnombre_grupo_cliente());}
			if(conDefault || (!conDefault && procesopedidosOrigen.getnombre_vendedor()!=null && !procesopedidosOrigen.getnombre_vendedor().equals(""))) {procesopedidos.setnombre_vendedor(procesopedidosOrigen.getnombre_vendedor());}
			if(conDefault || (!conDefault && procesopedidosOrigen.getcodigo()!=null && !procesopedidosOrigen.getcodigo().equals(""))) {procesopedidos.setcodigo(procesopedidosOrigen.getcodigo());}
			if(conDefault || (!conDefault && procesopedidosOrigen.getnombre_completo()!=null && !procesopedidosOrigen.getnombre_completo().equals(""))) {procesopedidos.setnombre_completo(procesopedidosOrigen.getnombre_completo());}
			if(conDefault || (!conDefault && procesopedidosOrigen.getnumero()!=null && !procesopedidosOrigen.getnumero().equals(""))) {procesopedidos.setnumero(procesopedidosOrigen.getnumero());}
			if(conDefault || (!conDefault && procesopedidosOrigen.getnumero_autorizacion()!=null && !procesopedidosOrigen.getnumero_autorizacion().equals(""))) {procesopedidos.setnumero_autorizacion(procesopedidosOrigen.getnumero_autorizacion());}
			if(conDefault || (!conDefault && procesopedidosOrigen.gettotal()!=null && !procesopedidosOrigen.gettotal().equals(0.0))) {procesopedidos.settotal(procesopedidosOrigen.gettotal());}
			if(conDefault || (!conDefault && procesopedidosOrigen.getfecha_emision()!=null && !procesopedidosOrigen.getfecha_emision().equals(new Date()))) {procesopedidos.setfecha_emision(procesopedidosOrigen.getfecha_emision());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProcesoPedidosConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioProcesoPedidos(ProcesoPedidos procesopedidos) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormProcesoPedidos.jLabelidProcesoPedidos.setText(procesopedidos.getId().toString());
			this.jInternalFrameDetalleFormProcesoPedidos.jTextAreanombre_provinciaProcesoPedidos.setText(procesopedidos.getnombre_provincia());
			this.jInternalFrameDetalleFormProcesoPedidos.jTextAreanombre_ciudadProcesoPedidos.setText(procesopedidos.getnombre_ciudad());
			this.jInternalFrameDetalleFormProcesoPedidos.jTextFieldnombre_zonaProcesoPedidos.setText(procesopedidos.getnombre_zona());
			this.jInternalFrameDetalleFormProcesoPedidos.jTextAreanombre_grupo_clienteProcesoPedidos.setText(procesopedidos.getnombre_grupo_cliente());
			this.jInternalFrameDetalleFormProcesoPedidos.jTextAreanombre_vendedorProcesoPedidos.setText(procesopedidos.getnombre_vendedor());
			this.jInternalFrameDetalleFormProcesoPedidos.jTextFieldcodigoProcesoPedidos.setText(procesopedidos.getcodigo());
			this.jInternalFrameDetalleFormProcesoPedidos.jTextAreanombre_completoProcesoPedidos.setText(procesopedidos.getnombre_completo());
			this.jInternalFrameDetalleFormProcesoPedidos.jTextFieldnumeroProcesoPedidos.setText(procesopedidos.getnumero());
			this.jInternalFrameDetalleFormProcesoPedidos.jTextFieldnumero_autorizacionProcesoPedidos.setText(procesopedidos.getnumero_autorizacion());
			this.jInternalFrameDetalleFormProcesoPedidos.jTextFieldtotalProcesoPedidos.setText(procesopedidos.gettotal().toString());
			this.jInternalFrameDetalleFormProcesoPedidos.jDateChooserfecha_emisionProcesoPedidos.setDate(procesopedidos.getfecha_emision());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoPedidosConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioProcesoPedidos(ProcesoPedidosBean procesopedidosBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormProcesoPedidos.jLabelidProcesoPedidos.setText(procesopedidosBean.getId().toString());
			this.jInternalFrameDetalleFormProcesoPedidos.jTextAreanombre_provinciaProcesoPedidos.setText(procesopedidosBean.getnombre_provincia());
			this.jInternalFrameDetalleFormProcesoPedidos.jTextAreanombre_ciudadProcesoPedidos.setText(procesopedidosBean.getnombre_ciudad());
			this.jInternalFrameDetalleFormProcesoPedidos.jTextFieldnombre_zonaProcesoPedidos.setText(procesopedidosBean.getnombre_zona());
			this.jInternalFrameDetalleFormProcesoPedidos.jTextAreanombre_grupo_clienteProcesoPedidos.setText(procesopedidosBean.getnombre_grupo_cliente());
			this.jInternalFrameDetalleFormProcesoPedidos.jTextAreanombre_vendedorProcesoPedidos.setText(procesopedidosBean.getnombre_vendedor());
			this.jInternalFrameDetalleFormProcesoPedidos.jTextFieldcodigoProcesoPedidos.setText(procesopedidosBean.getcodigo());
			this.jInternalFrameDetalleFormProcesoPedidos.jTextAreanombre_completoProcesoPedidos.setText(procesopedidosBean.getnombre_completo());
			this.jInternalFrameDetalleFormProcesoPedidos.jTextFieldnumeroProcesoPedidos.setText(procesopedidosBean.getnumero());
			this.jInternalFrameDetalleFormProcesoPedidos.jTextFieldnumero_autorizacionProcesoPedidos.setText(procesopedidosBean.getnumero_autorizacion());
			this.jInternalFrameDetalleFormProcesoPedidos.jTextFieldtotalProcesoPedidos.setText(procesopedidosBean.gettotal().toString());
			this.jInternalFrameDetalleFormProcesoPedidos.jDateChooserfecha_emisionProcesoPedidos.setDate(procesopedidosBean.getfecha_emision());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoPedidosConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanProcesoPedidos(ProcesoPedidosParameterReturnGeneral procesopedidosReturnGeneral,ProcesoPedidosBean procesopedidosBean,Boolean conDefault) throws Exception { 
		try {
			ProcesoPedidos procesopedidosLocal=new ProcesoPedidos();
			
			procesopedidosLocal=procesopedidosReturnGeneral.getProcesoPedidos();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && procesopedidosLocal.getId()!=null && !procesopedidosLocal.getId().equals(0L))) {procesopedidosBean.setId(procesopedidosLocal.getId());}}
			if(conDefault || (!conDefault && procesopedidosLocal.getnombre_provincia()!=null && !procesopedidosLocal.getnombre_provincia().equals(""))) {procesopedidosBean.setnombre_provincia(procesopedidosLocal.getnombre_provincia());}
			if(conDefault || (!conDefault && procesopedidosLocal.getnombre_ciudad()!=null && !procesopedidosLocal.getnombre_ciudad().equals(""))) {procesopedidosBean.setnombre_ciudad(procesopedidosLocal.getnombre_ciudad());}
			if(conDefault || (!conDefault && procesopedidosLocal.getnombre_zona()!=null && !procesopedidosLocal.getnombre_zona().equals(""))) {procesopedidosBean.setnombre_zona(procesopedidosLocal.getnombre_zona());}
			if(conDefault || (!conDefault && procesopedidosLocal.getnombre_grupo_cliente()!=null && !procesopedidosLocal.getnombre_grupo_cliente().equals(""))) {procesopedidosBean.setnombre_grupo_cliente(procesopedidosLocal.getnombre_grupo_cliente());}
			if(conDefault || (!conDefault && procesopedidosLocal.getnombre_vendedor()!=null && !procesopedidosLocal.getnombre_vendedor().equals(""))) {procesopedidosBean.setnombre_vendedor(procesopedidosLocal.getnombre_vendedor());}
			if(conDefault || (!conDefault && procesopedidosLocal.getcodigo()!=null && !procesopedidosLocal.getcodigo().equals(""))) {procesopedidosBean.setcodigo(procesopedidosLocal.getcodigo());}
			if(conDefault || (!conDefault && procesopedidosLocal.getnombre_completo()!=null && !procesopedidosLocal.getnombre_completo().equals(""))) {procesopedidosBean.setnombre_completo(procesopedidosLocal.getnombre_completo());}
			if(conDefault || (!conDefault && procesopedidosLocal.getnumero()!=null && !procesopedidosLocal.getnumero().equals(""))) {procesopedidosBean.setnumero(procesopedidosLocal.getnumero());}
			if(conDefault || (!conDefault && procesopedidosLocal.getnumero_autorizacion()!=null && !procesopedidosLocal.getnumero_autorizacion().equals(""))) {procesopedidosBean.setnumero_autorizacion(procesopedidosLocal.getnumero_autorizacion());}
			if(conDefault || (!conDefault && procesopedidosLocal.gettotal()!=null && !procesopedidosLocal.gettotal().equals(0.0))) {procesopedidosBean.settotal(procesopedidosLocal.gettotal());}
			if(conDefault || (!conDefault && procesopedidosLocal.getfecha_emision()!=null && !procesopedidosLocal.getfecha_emision().equals(new Date()))) {procesopedidosBean.setfecha_emision(procesopedidosLocal.getfecha_emision());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoPedidosConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxProcesoPedidosGenerico(Long idProcesoPedidosSeleccionado,JComboBox jComboBoxProcesoPedidos,List<ProcesoPedidos> procesopedidossLocal)throws Exception {
		try {
			ProcesoPedidos  procesopedidosTemp=null;

			for(ProcesoPedidos procesopedidosAux:procesopedidossLocal) {
				if(procesopedidosAux.getId()!=null && procesopedidosAux.getId().equals(idProcesoPedidosSeleccionado)) {
					procesopedidosTemp=procesopedidosAux;
					break;
				}
			}

			jComboBoxProcesoPedidos.setSelectedItem(procesopedidosTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxProcesoPedidosGenerico(JComboBox jComboBoxProcesoPedidos,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxProcesoPedidos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxProcesoPedidos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxProcesoPedidos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxProcesoPedidos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxProcesoPedidos.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxProcesoPedidos.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxProcesoPedidos.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxProcesoPedidos.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxProcesoPedidos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxProcesoPedidos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,ProcesoPedidosConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			procesopedidos=(ProcesoPedidos) procesopedidosLogic.getProcesoPedidoss().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			procesopedidos =(ProcesoPedidos) procesopedidoss.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Ciudad")) {
			//sDescripcion=this.getActualCiudadForeignKeyDescripcion((Long)value);
			if(!procesopedidos.getIsNew() && !procesopedidos.getIsChanged() && !procesopedidos.getIsDeleted()) {
				sDescripcion=procesopedidos.getciudad_descripcion();
			} else {
				//sDescripcion=this.getActualCiudadForeignKeyDescripcion((Long)value);
				sDescripcion=procesopedidos.getciudad_descripcion();
			}
		}

		if(sTipo.equals("Zona")) {
			//sDescripcion=this.getActualZonaForeignKeyDescripcion((Long)value);
			if(!procesopedidos.getIsNew() && !procesopedidos.getIsChanged() && !procesopedidos.getIsDeleted()) {
				sDescripcion=procesopedidos.getzona_descripcion();
			} else {
				//sDescripcion=this.getActualZonaForeignKeyDescripcion((Long)value);
				sDescripcion=procesopedidos.getzona_descripcion();
			}
		}

		if(sTipo.equals("GrupoCliente")) {
			//sDescripcion=this.getActualGrupoClienteForeignKeyDescripcion((Long)value);
			if(!procesopedidos.getIsNew() && !procesopedidos.getIsChanged() && !procesopedidos.getIsDeleted()) {
				sDescripcion=procesopedidos.getgrupocliente_descripcion();
			} else {
				//sDescripcion=this.getActualGrupoClienteForeignKeyDescripcion((Long)value);
				sDescripcion=procesopedidos.getgrupocliente_descripcion();
			}
		}

		if(sTipo.equals("Vendedor")) {
			//sDescripcion=this.getActualVendedorForeignKeyDescripcion((Long)value);
			if(!procesopedidos.getIsNew() && !procesopedidos.getIsChanged() && !procesopedidos.getIsDeleted()) {
				sDescripcion=procesopedidos.getvendedor_descripcion();
			} else {
				//sDescripcion=this.getActualVendedorForeignKeyDescripcion((Long)value);
				sDescripcion=procesopedidos.getvendedor_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		ProcesoPedidos procesopedidosRow=new ProcesoPedidos();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			procesopedidosRow=(ProcesoPedidos) procesopedidosLogic.getProcesoPedidoss().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			procesopedidosRow=(ProcesoPedidos) procesopedidoss.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualProcesoPedidos(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoProcesoPedidos.setVisible((this.isVisibilidadCeldaNuevoProcesoPedidos && this.isPermisoNuevoProcesoPedidos));			
			this.jButtonDuplicarProcesoPedidos.setVisible((this.isVisibilidadCeldaDuplicarProcesoPedidos && this.isPermisoDuplicarProcesoPedidos));			
			this.jButtonCopiarProcesoPedidos.setVisible((this.isVisibilidadCeldaCopiarProcesoPedidos && this.isPermisoCopiarProcesoPedidos));
			this.jButtonVerFormProcesoPedidos.setVisible((this.isVisibilidadCeldaVerFormProcesoPedidos && this.isPermisoVerFormProcesoPedidos));
			
			this.jButtonAbrirOrderByProcesoPedidos.setVisible((this.isVisibilidadCeldaOrdenProcesoPedidos && this.isPermisoOrdenProcesoPedidos));			
			
			this.jButtonNuevoRelacionesProcesoPedidos.setVisible((this.isVisibilidadCeldaNuevoRelacionesProcesoPedidos && this.isPermisoNuevoProcesoPedidos));			
			this.jButtonNuevoGuardarCambiosProcesoPedidos.setVisible((this.isVisibilidadCeldaNuevoProcesoPedidos && this.isPermisoNuevoProcesoPedidos && this.isPermisoGuardarCambiosProcesoPedidos));
			
			if(this.jInternalFrameDetalleFormProcesoPedidos!=null) {
			this.jInternalFrameDetalleFormProcesoPedidos.jButtonModificarProcesoPedidos.setVisible((this.isVisibilidadCeldaModificarProcesoPedidos && this.isPermisoActualizarProcesoPedidos));	
			this.jInternalFrameDetalleFormProcesoPedidos.jButtonActualizarProcesoPedidos.setVisible((this.isVisibilidadCeldaActualizarProcesoPedidos && this.isPermisoActualizarProcesoPedidos));	
			this.jInternalFrameDetalleFormProcesoPedidos.jButtonEliminarProcesoPedidos.setVisible((this.isVisibilidadCeldaEliminarProcesoPedidos && this.isPermisoEliminarProcesoPedidos));
			this.jInternalFrameDetalleFormProcesoPedidos.jButtonCancelarProcesoPedidos.setVisible(this.isVisibilidadCeldaCancelarProcesoPedidos);							
			this.jInternalFrameDetalleFormProcesoPedidos.jButtonGuardarCambiosProcesoPedidos.setVisible((this.isVisibilidadCeldaGuardarProcesoPedidos && this.isPermisoGuardarCambiosProcesoPedidos));			
			
			}
						
			this.jButtonGuardarCambiosTablaProcesoPedidos.setVisible((this.isVisibilidadCeldaGuardarCambiosProcesoPedidos && this.isPermisoGuardarCambiosProcesoPedidos));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarProcesoPedidos.setVisible((this.isVisibilidadCeldaNuevoProcesoPedidos && this.isPermisoNuevoProcesoPedidos));						
			this.jButtonDuplicarToolBarProcesoPedidos.setVisible((this.isVisibilidadCeldaDuplicarProcesoPedidos && this.isPermisoDuplicarProcesoPedidos));						
			this.jButtonCopiarToolBarProcesoPedidos.setVisible((this.isVisibilidadCeldaCopiarProcesoPedidos && this.isPermisoCopiarProcesoPedidos));			
			this.jButtonVerFormToolBarProcesoPedidos.setVisible((this.isVisibilidadCeldaVerFormProcesoPedidos && this.isPermisoVerFormProcesoPedidos));			
			this.jButtonAbrirOrderByToolBarProcesoPedidos.setVisible((this.isVisibilidadCeldaOrdenProcesoPedidos && this.isPermisoOrdenProcesoPedidos));
			this.jButtonNuevoRelacionesToolBarProcesoPedidos.setVisible((this.isVisibilidadCeldaNuevoRelacionesProcesoPedidos && this.isPermisoNuevoProcesoPedidos));			
			this.jButtonNuevoGuardarCambiosToolBarProcesoPedidos.setVisible((this.isVisibilidadCeldaNuevoProcesoPedidos && this.isPermisoNuevoProcesoPedidos && this.isPermisoGuardarCambiosProcesoPedidos));			
			
			if(this.jInternalFrameDetalleFormProcesoPedidos!=null) {
			this.jInternalFrameDetalleFormProcesoPedidos.jButtonModificarToolBarProcesoPedidos.setVisible((this.isVisibilidadCeldaModificarProcesoPedidos && this.isPermisoActualizarProcesoPedidos));	
			this.jInternalFrameDetalleFormProcesoPedidos.jButtonActualizarToolBarProcesoPedidos.setVisible((this.isVisibilidadCeldaActualizarProcesoPedidos  && this.isPermisoActualizarProcesoPedidos));	
			this.jInternalFrameDetalleFormProcesoPedidos.jButtonEliminarToolBarProcesoPedidos.setVisible((this.isVisibilidadCeldaEliminarProcesoPedidos && this.isPermisoEliminarProcesoPedidos));
			this.jInternalFrameDetalleFormProcesoPedidos.jButtonCancelarToolBarProcesoPedidos.setVisible(this.isVisibilidadCeldaCancelarProcesoPedidos);				
			this.jInternalFrameDetalleFormProcesoPedidos.jButtonGuardarCambiosToolBarProcesoPedidos.setVisible((this.isVisibilidadCeldaGuardarProcesoPedidos && this.isPermisoGuardarCambiosProcesoPedidos));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarProcesoPedidos.setVisible((this.isVisibilidadCeldaGuardarCambiosProcesoPedidos && this.isPermisoGuardarCambiosProcesoPedidos));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoProcesoPedidos.setVisible((this.isVisibilidadCeldaNuevoProcesoPedidos && this.isPermisoNuevoProcesoPedidos));			
			this.jMenuItemDuplicarProcesoPedidos.setVisible((this.isVisibilidadCeldaDuplicarProcesoPedidos && this.isPermisoDuplicarProcesoPedidos));			
			this.jMenuItemCopiarProcesoPedidos.setVisible((this.isVisibilidadCeldaCopiarProcesoPedidos && this.isPermisoCopiarProcesoPedidos));			
			this.jMenuItemVerFormProcesoPedidos.setVisible((this.isVisibilidadCeldaVerFormProcesoPedidos && this.isPermisoVerFormProcesoPedidos));			
			this.jMenuItemAbrirOrderByProcesoPedidos.setVisible((this.isVisibilidadCeldaOrdenProcesoPedidos && this.isPermisoOrdenProcesoPedidos));			
			//this.jMenuItemMostrarOcultarProcesoPedidos.setVisible((this.isVisibilidadCeldaOrdenProcesoPedidos && this.isPermisoOrdenProcesoPedidos));
			this.jMenuItemDetalleAbrirOrderByProcesoPedidos.setVisible((this.isVisibilidadCeldaOrdenProcesoPedidos && this.isPermisoOrdenProcesoPedidos));			
			//this.jMenuItemDetalleMostrarOcultarProcesoPedidos.setVisible((this.isVisibilidadCeldaOrdenProcesoPedidos && this.isPermisoOrdenProcesoPedidos));			
			this.jMenuItemNuevoRelacionesProcesoPedidos.setVisible((this.isVisibilidadCeldaNuevoRelacionesProcesoPedidos && this.isPermisoNuevoProcesoPedidos));			
			this.jMenuItemNuevoGuardarCambiosProcesoPedidos.setVisible((this.isVisibilidadCeldaNuevoProcesoPedidos && this.isPermisoNuevoProcesoPedidos && this.isPermisoGuardarCambiosProcesoPedidos));									
			
			if(this.jInternalFrameDetalleFormProcesoPedidos!=null) {
			this.jInternalFrameDetalleFormProcesoPedidos.jMenuItemModificarProcesoPedidos.setVisible((this.isVisibilidadCeldaModificarProcesoPedidos && this.isPermisoActualizarProcesoPedidos));	
			this.jInternalFrameDetalleFormProcesoPedidos.jMenuItemActualizarProcesoPedidos.setVisible((this.isVisibilidadCeldaActualizarProcesoPedidos && this.isPermisoActualizarProcesoPedidos));	
			this.jInternalFrameDetalleFormProcesoPedidos.jMenuItemEliminarProcesoPedidos.setVisible((this.isVisibilidadCeldaEliminarProcesoPedidos && this.isPermisoEliminarProcesoPedidos));
			this.jInternalFrameDetalleFormProcesoPedidos.jMenuItemCancelarProcesoPedidos.setVisible(this.isVisibilidadCeldaCancelarProcesoPedidos);				
			}
			
			this.jMenuItemGuardarCambiosProcesoPedidos.setVisible((this.isVisibilidadCeldaGuardarProcesoPedidos && this.isPermisoGuardarCambiosProcesoPedidos));						
			this.jMenuItemGuardarCambiosTablaProcesoPedidos.setVisible((this.isVisibilidadCeldaGuardarCambiosProcesoPedidos && this.isPermisoGuardarCambiosProcesoPedidos));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoProcesoPedidos=this.jButtonNuevoProcesoPedidos.isVisible();
			this.isVisibilidadCeldaDuplicarProcesoPedidos=this.jButtonDuplicarProcesoPedidos.isVisible();
			this.isVisibilidadCeldaCopiarProcesoPedidos=this.jButtonCopiarProcesoPedidos.isVisible();
			this.isVisibilidadCeldaVerFormProcesoPedidos=this.jButtonVerFormProcesoPedidos.isVisible();
			
			this.isVisibilidadCeldaOrdenProcesoPedidos=this.jButtonAbrirOrderByProcesoPedidos.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesProcesoPedidos=this.jButtonNuevoRelacionesProcesoPedidos.isVisible();
			this.isVisibilidadCeldaModificarProcesoPedidos=this.jButtonModificarProcesoPedidos.isVisible();
			
			if(this.jInternalFrameDetalleFormProcesoPedidos!=null) {
			this.isVisibilidadCeldaActualizarProcesoPedidos=this.jInternalFrameDetalleFormProcesoPedidos.jButtonActualizarProcesoPedidos.isVisible();
			this.isVisibilidadCeldaEliminarProcesoPedidos=this.jInternalFrameDetalleFormProcesoPedidos.jButtonEliminarProcesoPedidos.isVisible();
			this.isVisibilidadCeldaCancelarProcesoPedidos=this.jInternalFrameDetalleFormProcesoPedidos.jButtonCancelarProcesoPedidos.isVisible();
			this.isVisibilidadCeldaGuardarProcesoPedidos=this.jInternalFrameDetalleFormProcesoPedidos.jButtonGuardarCambiosProcesoPedidos.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosProcesoPedidos=this.jButtonGuardarCambiosTablaProcesoPedidos.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoProcesoPedidos=this.jButtonNuevoToolBarProcesoPedidos.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesProcesoPedidos=this.jButtonNuevoRelacionesToolBarProcesoPedidos.isVisible();
			
			if(this.jInternalFrameDetalleFormProcesoPedidos!=null) {
			this.isVisibilidadCeldaModificarProcesoPedidos=this.jInternalFrameDetalleFormProcesoPedidos.jButtonModificarToolBarProcesoPedidos.isVisible();
			this.isVisibilidadCeldaActualizarProcesoPedidos=this.jInternalFrameDetalleFormProcesoPedidos.jButtonActualizarToolBarProcesoPedidos.isVisible();
			this.isVisibilidadCeldaEliminarProcesoPedidos=this.jInternalFrameDetalleFormProcesoPedidos.jButtonEliminarToolBarProcesoPedidos.isVisible();
			this.isVisibilidadCeldaCancelarProcesoPedidos=this.jInternalFrameDetalleFormProcesoPedidos.jButtonCancelarToolBarProcesoPedidos.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarProcesoPedidos=this.jButtonGuardarCambiosToolBarProcesoPedidos.isVisible();
			this.isVisibilidadCeldaGuardarCambiosProcesoPedidos=this.jButtonGuardarCambiosTablaToolBarProcesoPedidos.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoProcesoPedidos=this.jMenuItemNuevoProcesoPedidos.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesProcesoPedidos=this.jMenuItemNuevoRelacionesProcesoPedidos.isVisible();
			
			if(this.jInternalFrameDetalleFormProcesoPedidos!=null) {
			this.isVisibilidadCeldaModificarProcesoPedidos=this.jInternalFrameDetalleFormProcesoPedidos.jMenuItemModificarProcesoPedidos.isVisible();
			this.isVisibilidadCeldaActualizarProcesoPedidos=this.jInternalFrameDetalleFormProcesoPedidos.jMenuItemActualizarProcesoPedidos.isVisible();
			this.isVisibilidadCeldaEliminarProcesoPedidos=this.jInternalFrameDetalleFormProcesoPedidos.jMenuItemEliminarProcesoPedidos.isVisible();
			this.isVisibilidadCeldaCancelarProcesoPedidos=this.jInternalFrameDetalleFormProcesoPedidos.jMenuItemCancelarProcesoPedidos.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarProcesoPedidos=this.jMenuItemGuardarCambiosProcesoPedidos.isVisible();
			this.isVisibilidadCeldaGuardarCambiosProcesoPedidos=this.jMenuItemGuardarCambiosTablaProcesoPedidos.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesProcesoPedidos(Boolean esInicializar) {
		if(ProcesoPedidosJInternalFrame.ISBINDING_MANUAL) {			
			if(this.procesopedidosSessionBean.getConGuardarRelaciones()) {
				//if(this.procesopedidosSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesProcesoPedidos();
			}
			
			this.inicializarActualizarBindingBotonesManualProcesoPedidos(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualProcesoPedidos() {
		this.jButtonNuevoProcesoPedidos.setVisible(this.isPermisoNuevoProcesoPedidos);			
		this.jButtonDuplicarProcesoPedidos.setVisible(this.isPermisoDuplicarProcesoPedidos);			
		this.jButtonCopiarProcesoPedidos.setVisible(this.isPermisoCopiarProcesoPedidos);			
		this.jButtonVerFormProcesoPedidos.setVisible(this.isPermisoVerFormProcesoPedidos);			
		
		this.jButtonAbrirOrderByProcesoPedidos.setVisible(this.isPermisoOrdenProcesoPedidos);					
		
		this.jButtonNuevoRelacionesProcesoPedidos.setVisible(this.isPermisoNuevoProcesoPedidos);			
		
		if(this.jInternalFrameDetalleFormProcesoPedidos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoPedidos.jButtonModificarProcesoPedidos.setVisible(this.isPermisoActualizarProcesoPedidos);	
			this.jInternalFrameDetalleFormProcesoPedidos.jButtonActualizarProcesoPedidos.setVisible(this.isPermisoActualizarProcesoPedidos);	
			this.jInternalFrameDetalleFormProcesoPedidos.jButtonEliminarProcesoPedidos.setVisible(this.isPermisoEliminarProcesoPedidos);
			this.jInternalFrameDetalleFormProcesoPedidos.jButtonCancelarProcesoPedidos.setVisible(this.isVisibilidadCeldaCancelarProcesoPedidos);						
			this.jInternalFrameDetalleFormProcesoPedidos.jButtonGuardarCambiosProcesoPedidos.setVisible(this.isPermisoGuardarCambiosProcesoPedidos);							
		}
		
		this.jButtonGuardarCambiosTablaProcesoPedidos.setVisible(this.isPermisoActualizarProcesoPedidos);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleProcesoPedidos() {
		this.jInternalFrameDetalleFormProcesoPedidos.jButtonModificarProcesoPedidos.setVisible(this.isPermisoActualizarProcesoPedidos);	
		this.jInternalFrameDetalleFormProcesoPedidos.jButtonActualizarProcesoPedidos.setVisible(this.isPermisoActualizarProcesoPedidos);	
		this.jInternalFrameDetalleFormProcesoPedidos.jButtonEliminarProcesoPedidos.setVisible(this.isPermisoEliminarProcesoPedidos);
		this.jInternalFrameDetalleFormProcesoPedidos.jButtonCancelarProcesoPedidos.setVisible(this.isVisibilidadCeldaCancelarProcesoPedidos);							
		this.jInternalFrameDetalleFormProcesoPedidos.jButtonGuardarCambiosProcesoPedidos.setVisible((this.isVisibilidadCeldaGuardarProcesoPedidos && this.isPermisoGuardarCambiosProcesoPedidos));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosProcesoPedidos() {
		if(ProcesoPedidosJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualProcesoPedidos();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesProcesoPedidos() {
	}
	
	public void jTableDatosProcesoPedidosListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarProcesoPedidos(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoPedidosConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidProcesoPedidosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesopedidosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoPedidos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProcesoPedidos(this.getprocesopedidos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoPedidos(this.procesopedidos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.procesopedidos =(ProcesoPedidos) this.procesopedidosLogic.getProcesoPedidoss().toArray()[this.jTableDatosProcesoPedidos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.procesopedidos =(ProcesoPedidos) this.procesopedidoss.toArray()[this.jTableDatosProcesoPedidos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.procesopedidos==null) {
						this.procesopedidos = new ProcesoPedidos();
					}

					this.setVariablesFormularioToObjetoActualProcesoPedidos(this.procesopedidos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoPedidos(this.procesopedidos);
				}

				if(this.procesopedidos.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.procesopedidos.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProcesoPedidos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesopedidosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesopedidosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProcesoPedidosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesopedidosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_ciudadProcesoPedidosUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesopedidosLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisociudad=true;

			idTienePermisociudad=this.tienePermisosUsuarioEnPaginaWebProcesoPedidos(CiudadConstantesFunciones.CLASSNAME);

			if(idTienePermisociudad) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoPedidos.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosProcesoPedidos.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosProcesoPedidos.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesopedidos =(ProcesoPedidos) this.procesopedidosLogic.getProcesoPedidoss().toArray()[this.jTableDatosProcesoPedidos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.procesopedidos =(ProcesoPedidos) this.procesopedidoss.toArray()[this.jTableDatosProcesoPedidos.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualProcesoPedidos(this.getprocesopedidos(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysProcesoPedidos(this.procesopedidos);

				this.ciudadBeanSwingJInternalFrame=new CiudadBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.ciudadBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.ciudadBeanSwingJInternalFrame.getCiudadLogic().setConnexion(this.procesopedidosLogic.getConnexion());

				if(this.procesopedidos.getid_ciudad()!=null) {
					this.ciudadBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.ciudadBeanSwingJInternalFrame.setIdActual(this.procesopedidos.getid_ciudad());
					this.ciudadBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.ciudadBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.ciudadBeanSwingJInternalFrame.inicializarActualizarBindingTablaCiudad();
				}

				JInternalFrameBase jinternalFrame =this.ciudadBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderProcesoPedidos=(TitledBorder)this.jScrollPanelDatosProcesoPedidos.getBorder();
				TitledBorder titledBorderciudad=(TitledBorder)this.ciudadBeanSwingJInternalFrame.jScrollPanelDatosCiudad.getBorder();

				titledBorderciudad.setTitle(titledBorderProcesoPedidos.getTitle() + " -> Ciudad");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesopedidosLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesopedidosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProcesoPedidosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesopedidosLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_ciudadProcesoPedidosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesopedidosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoPedidos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProcesoPedidos(this.getprocesopedidos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoPedidos(this.procesopedidos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.procesopedidos =(ProcesoPedidos) this.procesopedidosLogic.getProcesoPedidoss().toArray()[this.jTableDatosProcesoPedidos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.procesopedidos =(ProcesoPedidos) this.procesopedidoss.toArray()[this.jTableDatosProcesoPedidos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.procesopedidos==null) {
						this.procesopedidos = new ProcesoPedidos();
					}

					this.setVariablesFormularioToObjetoActualProcesoPedidos(this.procesopedidos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoPedidos(this.procesopedidos);
				}

				if(this.procesopedidos.getid_ciudad()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_ciudad = "+this.procesopedidos.getid_ciudad().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProcesoPedidos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesopedidosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesopedidosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProcesoPedidosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesopedidosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_zonaProcesoPedidosUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesopedidosLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisozona=true;

			idTienePermisozona=this.tienePermisosUsuarioEnPaginaWebProcesoPedidos(ZonaConstantesFunciones.CLASSNAME);

			if(idTienePermisozona) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoPedidos.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosProcesoPedidos.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosProcesoPedidos.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesopedidos =(ProcesoPedidos) this.procesopedidosLogic.getProcesoPedidoss().toArray()[this.jTableDatosProcesoPedidos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.procesopedidos =(ProcesoPedidos) this.procesopedidoss.toArray()[this.jTableDatosProcesoPedidos.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualProcesoPedidos(this.getprocesopedidos(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysProcesoPedidos(this.procesopedidos);

				this.zonaBeanSwingJInternalFrame=new ZonaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.zonaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.zonaBeanSwingJInternalFrame.getZonaLogic().setConnexion(this.procesopedidosLogic.getConnexion());

				if(this.procesopedidos.getid_zona()!=null) {
					this.zonaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.zonaBeanSwingJInternalFrame.setIdActual(this.procesopedidos.getid_zona());
					this.zonaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.zonaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.zonaBeanSwingJInternalFrame.inicializarActualizarBindingTablaZona();
				}

				JInternalFrameBase jinternalFrame =this.zonaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderProcesoPedidos=(TitledBorder)this.jScrollPanelDatosProcesoPedidos.getBorder();
				TitledBorder titledBorderzona=(TitledBorder)this.zonaBeanSwingJInternalFrame.jScrollPanelDatosZona.getBorder();

				titledBorderzona.setTitle(titledBorderProcesoPedidos.getTitle() + " -> Zona");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesopedidosLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesopedidosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProcesoPedidosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesopedidosLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_zonaProcesoPedidosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesopedidosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoPedidos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProcesoPedidos(this.getprocesopedidos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoPedidos(this.procesopedidos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.procesopedidos =(ProcesoPedidos) this.procesopedidosLogic.getProcesoPedidoss().toArray()[this.jTableDatosProcesoPedidos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.procesopedidos =(ProcesoPedidos) this.procesopedidoss.toArray()[this.jTableDatosProcesoPedidos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.procesopedidos==null) {
						this.procesopedidos = new ProcesoPedidos();
					}

					this.setVariablesFormularioToObjetoActualProcesoPedidos(this.procesopedidos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoPedidos(this.procesopedidos);
				}

				if(this.procesopedidos.getid_zona()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_zona = "+this.procesopedidos.getid_zona().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProcesoPedidos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesopedidosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesopedidosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProcesoPedidosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesopedidosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_grupo_clienteProcesoPedidosUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesopedidosLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisogrupocliente=true;

			idTienePermisogrupocliente=this.tienePermisosUsuarioEnPaginaWebProcesoPedidos(GrupoClienteConstantesFunciones.CLASSNAME);

			if(idTienePermisogrupocliente) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoPedidos.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosProcesoPedidos.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosProcesoPedidos.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesopedidos =(ProcesoPedidos) this.procesopedidosLogic.getProcesoPedidoss().toArray()[this.jTableDatosProcesoPedidos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.procesopedidos =(ProcesoPedidos) this.procesopedidoss.toArray()[this.jTableDatosProcesoPedidos.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualProcesoPedidos(this.getprocesopedidos(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysProcesoPedidos(this.procesopedidos);

				this.grupoclienteBeanSwingJInternalFrame=new GrupoClienteBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.grupoclienteBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.grupoclienteBeanSwingJInternalFrame.getGrupoClienteLogic().setConnexion(this.procesopedidosLogic.getConnexion());

				if(this.procesopedidos.getid_grupo_cliente()!=null) {
					this.grupoclienteBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.grupoclienteBeanSwingJInternalFrame.setIdActual(this.procesopedidos.getid_grupo_cliente());
					this.grupoclienteBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.grupoclienteBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.grupoclienteBeanSwingJInternalFrame.inicializarActualizarBindingTablaGrupoCliente();
				}

				JInternalFrameBase jinternalFrame =this.grupoclienteBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderProcesoPedidos=(TitledBorder)this.jScrollPanelDatosProcesoPedidos.getBorder();
				TitledBorder titledBordergrupocliente=(TitledBorder)this.grupoclienteBeanSwingJInternalFrame.jScrollPanelDatosGrupoCliente.getBorder();

				titledBordergrupocliente.setTitle(titledBorderProcesoPedidos.getTitle() + " -> Grupo Cliente");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesopedidosLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesopedidosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProcesoPedidosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesopedidosLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_grupo_clienteProcesoPedidosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesopedidosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoPedidos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProcesoPedidos(this.getprocesopedidos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoPedidos(this.procesopedidos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.procesopedidos =(ProcesoPedidos) this.procesopedidosLogic.getProcesoPedidoss().toArray()[this.jTableDatosProcesoPedidos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.procesopedidos =(ProcesoPedidos) this.procesopedidoss.toArray()[this.jTableDatosProcesoPedidos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.procesopedidos==null) {
						this.procesopedidos = new ProcesoPedidos();
					}

					this.setVariablesFormularioToObjetoActualProcesoPedidos(this.procesopedidos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoPedidos(this.procesopedidos);
				}

				if(this.procesopedidos.getid_grupo_cliente()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_grupo_cliente = "+this.procesopedidos.getid_grupo_cliente().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProcesoPedidos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesopedidosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesopedidosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProcesoPedidosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesopedidosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_vendedorProcesoPedidosUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesopedidosLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisovendedor=true;

			idTienePermisovendedor=this.tienePermisosUsuarioEnPaginaWebProcesoPedidos(VendedorConstantesFunciones.CLASSNAME);

			if(idTienePermisovendedor) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoPedidos.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosProcesoPedidos.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosProcesoPedidos.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesopedidos =(ProcesoPedidos) this.procesopedidosLogic.getProcesoPedidoss().toArray()[this.jTableDatosProcesoPedidos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.procesopedidos =(ProcesoPedidos) this.procesopedidoss.toArray()[this.jTableDatosProcesoPedidos.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualProcesoPedidos(this.getprocesopedidos(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysProcesoPedidos(this.procesopedidos);

				this.vendedorBeanSwingJInternalFrame=new VendedorBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.vendedorBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.vendedorBeanSwingJInternalFrame.getVendedorLogic().setConnexion(this.procesopedidosLogic.getConnexion());

				if(this.procesopedidos.getid_vendedor()!=null) {
					this.vendedorBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.vendedorBeanSwingJInternalFrame.setIdActual(this.procesopedidos.getid_vendedor());
					this.vendedorBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.vendedorBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.vendedorBeanSwingJInternalFrame.inicializarActualizarBindingTablaVendedor();
				}

				JInternalFrameBase jinternalFrame =this.vendedorBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderProcesoPedidos=(TitledBorder)this.jScrollPanelDatosProcesoPedidos.getBorder();
				TitledBorder titledBordervendedor=(TitledBorder)this.vendedorBeanSwingJInternalFrame.jScrollPanelDatosVendedor.getBorder();

				titledBordervendedor.setTitle(titledBorderProcesoPedidos.getTitle() + " -> VENDEDOR");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesopedidosLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesopedidosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProcesoPedidosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesopedidosLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_vendedorProcesoPedidosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesopedidosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoPedidos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProcesoPedidos(this.getprocesopedidos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoPedidos(this.procesopedidos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.procesopedidos =(ProcesoPedidos) this.procesopedidosLogic.getProcesoPedidoss().toArray()[this.jTableDatosProcesoPedidos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.procesopedidos =(ProcesoPedidos) this.procesopedidoss.toArray()[this.jTableDatosProcesoPedidos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.procesopedidos==null) {
						this.procesopedidos = new ProcesoPedidos();
					}

					this.setVariablesFormularioToObjetoActualProcesoPedidos(this.procesopedidos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoPedidos(this.procesopedidos);
				}

				if(this.procesopedidos.getid_vendedor()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_vendedor = "+this.procesopedidos.getid_vendedor().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProcesoPedidos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesopedidosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesopedidosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProcesoPedidosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesopedidosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_provinciaProcesoPedidosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesopedidosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoPedidos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProcesoPedidos(this.getprocesopedidos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoPedidos(this.procesopedidos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.procesopedidos =(ProcesoPedidos) this.procesopedidosLogic.getProcesoPedidoss().toArray()[this.jTableDatosProcesoPedidos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.procesopedidos =(ProcesoPedidos) this.procesopedidoss.toArray()[this.jTableDatosProcesoPedidos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.procesopedidos==null) {
						this.procesopedidos = new ProcesoPedidos();
					}

					this.setVariablesFormularioToObjetoActualProcesoPedidos(this.procesopedidos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoPedidos(this.procesopedidos);
				}

				if(this.procesopedidos.getnombre_provincia()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_provincia like '%"+this.procesopedidos.getnombre_provincia()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProcesoPedidos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesopedidosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesopedidosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProcesoPedidosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesopedidosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_ciudadProcesoPedidosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesopedidosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoPedidos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProcesoPedidos(this.getprocesopedidos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoPedidos(this.procesopedidos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.procesopedidos =(ProcesoPedidos) this.procesopedidosLogic.getProcesoPedidoss().toArray()[this.jTableDatosProcesoPedidos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.procesopedidos =(ProcesoPedidos) this.procesopedidoss.toArray()[this.jTableDatosProcesoPedidos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.procesopedidos==null) {
						this.procesopedidos = new ProcesoPedidos();
					}

					this.setVariablesFormularioToObjetoActualProcesoPedidos(this.procesopedidos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoPedidos(this.procesopedidos);
				}

				if(this.procesopedidos.getnombre_ciudad()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_ciudad like '%"+this.procesopedidos.getnombre_ciudad()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProcesoPedidos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesopedidosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesopedidosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProcesoPedidosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesopedidosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_zonaProcesoPedidosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesopedidosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoPedidos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProcesoPedidos(this.getprocesopedidos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoPedidos(this.procesopedidos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.procesopedidos =(ProcesoPedidos) this.procesopedidosLogic.getProcesoPedidoss().toArray()[this.jTableDatosProcesoPedidos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.procesopedidos =(ProcesoPedidos) this.procesopedidoss.toArray()[this.jTableDatosProcesoPedidos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.procesopedidos==null) {
						this.procesopedidos = new ProcesoPedidos();
					}

					this.setVariablesFormularioToObjetoActualProcesoPedidos(this.procesopedidos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoPedidos(this.procesopedidos);
				}

				if(this.procesopedidos.getnombre_zona()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_zona like '%"+this.procesopedidos.getnombre_zona()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProcesoPedidos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesopedidosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesopedidosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProcesoPedidosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesopedidosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_grupo_clienteProcesoPedidosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesopedidosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoPedidos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProcesoPedidos(this.getprocesopedidos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoPedidos(this.procesopedidos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.procesopedidos =(ProcesoPedidos) this.procesopedidosLogic.getProcesoPedidoss().toArray()[this.jTableDatosProcesoPedidos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.procesopedidos =(ProcesoPedidos) this.procesopedidoss.toArray()[this.jTableDatosProcesoPedidos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.procesopedidos==null) {
						this.procesopedidos = new ProcesoPedidos();
					}

					this.setVariablesFormularioToObjetoActualProcesoPedidos(this.procesopedidos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoPedidos(this.procesopedidos);
				}

				if(this.procesopedidos.getnombre_grupo_cliente()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_grupo_cliente like '%"+this.procesopedidos.getnombre_grupo_cliente()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProcesoPedidos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesopedidosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesopedidosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProcesoPedidosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesopedidosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_vendedorProcesoPedidosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesopedidosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoPedidos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProcesoPedidos(this.getprocesopedidos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoPedidos(this.procesopedidos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.procesopedidos =(ProcesoPedidos) this.procesopedidosLogic.getProcesoPedidoss().toArray()[this.jTableDatosProcesoPedidos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.procesopedidos =(ProcesoPedidos) this.procesopedidoss.toArray()[this.jTableDatosProcesoPedidos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.procesopedidos==null) {
						this.procesopedidos = new ProcesoPedidos();
					}

					this.setVariablesFormularioToObjetoActualProcesoPedidos(this.procesopedidos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoPedidos(this.procesopedidos);
				}

				if(this.procesopedidos.getnombre_vendedor()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_vendedor like '%"+this.procesopedidos.getnombre_vendedor()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProcesoPedidos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesopedidosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesopedidosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProcesoPedidosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesopedidosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigoProcesoPedidosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesopedidosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoPedidos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProcesoPedidos(this.getprocesopedidos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoPedidos(this.procesopedidos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.procesopedidos =(ProcesoPedidos) this.procesopedidosLogic.getProcesoPedidoss().toArray()[this.jTableDatosProcesoPedidos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.procesopedidos =(ProcesoPedidos) this.procesopedidoss.toArray()[this.jTableDatosProcesoPedidos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.procesopedidos==null) {
						this.procesopedidos = new ProcesoPedidos();
					}

					this.setVariablesFormularioToObjetoActualProcesoPedidos(this.procesopedidos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoPedidos(this.procesopedidos);
				}

				if(this.procesopedidos.getcodigo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo like '%"+this.procesopedidos.getcodigo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProcesoPedidos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesopedidosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesopedidosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProcesoPedidosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesopedidosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_completoProcesoPedidosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesopedidosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoPedidos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProcesoPedidos(this.getprocesopedidos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoPedidos(this.procesopedidos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.procesopedidos =(ProcesoPedidos) this.procesopedidosLogic.getProcesoPedidoss().toArray()[this.jTableDatosProcesoPedidos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.procesopedidos =(ProcesoPedidos) this.procesopedidoss.toArray()[this.jTableDatosProcesoPedidos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.procesopedidos==null) {
						this.procesopedidos = new ProcesoPedidos();
					}

					this.setVariablesFormularioToObjetoActualProcesoPedidos(this.procesopedidos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoPedidos(this.procesopedidos);
				}

				if(this.procesopedidos.getnombre_completo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_completo like '%"+this.procesopedidos.getnombre_completo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProcesoPedidos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesopedidosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesopedidosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProcesoPedidosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesopedidosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnumeroProcesoPedidosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesopedidosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoPedidos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProcesoPedidos(this.getprocesopedidos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoPedidos(this.procesopedidos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.procesopedidos =(ProcesoPedidos) this.procesopedidosLogic.getProcesoPedidoss().toArray()[this.jTableDatosProcesoPedidos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.procesopedidos =(ProcesoPedidos) this.procesopedidoss.toArray()[this.jTableDatosProcesoPedidos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.procesopedidos==null) {
						this.procesopedidos = new ProcesoPedidos();
					}

					this.setVariablesFormularioToObjetoActualProcesoPedidos(this.procesopedidos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoPedidos(this.procesopedidos);
				}

				if(this.procesopedidos.getnumero()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where numero like '%"+this.procesopedidos.getnumero()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProcesoPedidos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesopedidosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesopedidosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProcesoPedidosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesopedidosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnumero_autorizacionProcesoPedidosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesopedidosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoPedidos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProcesoPedidos(this.getprocesopedidos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoPedidos(this.procesopedidos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.procesopedidos =(ProcesoPedidos) this.procesopedidosLogic.getProcesoPedidoss().toArray()[this.jTableDatosProcesoPedidos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.procesopedidos =(ProcesoPedidos) this.procesopedidoss.toArray()[this.jTableDatosProcesoPedidos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.procesopedidos==null) {
						this.procesopedidos = new ProcesoPedidos();
					}

					this.setVariablesFormularioToObjetoActualProcesoPedidos(this.procesopedidos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoPedidos(this.procesopedidos);
				}

				if(this.procesopedidos.getnumero_autorizacion()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where numero_autorizacion like '%"+this.procesopedidos.getnumero_autorizacion()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProcesoPedidos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesopedidosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesopedidosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProcesoPedidosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesopedidosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtontotalProcesoPedidosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesopedidosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoPedidos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProcesoPedidos(this.getprocesopedidos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoPedidos(this.procesopedidos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.procesopedidos =(ProcesoPedidos) this.procesopedidosLogic.getProcesoPedidoss().toArray()[this.jTableDatosProcesoPedidos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.procesopedidos =(ProcesoPedidos) this.procesopedidoss.toArray()[this.jTableDatosProcesoPedidos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.procesopedidos==null) {
						this.procesopedidos = new ProcesoPedidos();
					}

					this.setVariablesFormularioToObjetoActualProcesoPedidos(this.procesopedidos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoPedidos(this.procesopedidos);
				}

				if(this.procesopedidos.gettotal()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where total = "+this.procesopedidos.gettotal().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProcesoPedidos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesopedidosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesopedidosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProcesoPedidosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesopedidosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_emisionProcesoPedidosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesopedidosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoPedidos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProcesoPedidos(this.getprocesopedidos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoPedidos(this.procesopedidos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.procesopedidos =(ProcesoPedidos) this.procesopedidosLogic.getProcesoPedidoss().toArray()[this.jTableDatosProcesoPedidos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.procesopedidos =(ProcesoPedidos) this.procesopedidoss.toArray()[this.jTableDatosProcesoPedidos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.procesopedidos==null) {
						this.procesopedidos = new ProcesoPedidos();
					}

					this.setVariablesFormularioToObjetoActualProcesoPedidos(this.procesopedidos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoPedidos(this.procesopedidos);
				}

				if(this.procesopedidos.getfecha_emision()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_emision = '"+Funciones2.getStringPostgresDate(this.procesopedidos.getfecha_emision())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProcesoPedidos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesopedidosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesopedidosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProcesoPedidosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesopedidosLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonBusquedaProcesoPedidosProcesoPedidosActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesopedidosLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingProcesoPedidos(false,false);

			this.getProcesoPedidossBusquedaProcesoPedidos();

			this.inicializarActualizarBindingProcesoPedidos(false);

			//if(ProcesoPedidosBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingProcesoPedidos(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesopedidosLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesopedidosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProcesoPedidosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesopedidosLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdCiudadProcesoPedidosActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesopedidosLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingProcesoPedidos(false,false);

			this.getProcesoPedidossFK_IdCiudad();

			this.inicializarActualizarBindingProcesoPedidos(false);

			//if(ProcesoPedidosBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingProcesoPedidos(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesopedidosLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesopedidosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProcesoPedidosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesopedidosLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdGrupoClienteProcesoPedidosActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesopedidosLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingProcesoPedidos(false,false);

			this.getProcesoPedidossFK_IdGrupoCliente();

			this.inicializarActualizarBindingProcesoPedidos(false);

			//if(ProcesoPedidosBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingProcesoPedidos(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesopedidosLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesopedidosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProcesoPedidosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesopedidosLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdVendedorProcesoPedidosActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesopedidosLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingProcesoPedidos(false,false);

			this.getProcesoPedidossFK_IdVendedor();

			this.inicializarActualizarBindingProcesoPedidos(false);

			//if(ProcesoPedidosBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingProcesoPedidos(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesopedidosLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesopedidosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProcesoPedidosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesopedidosLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdZonaProcesoPedidosActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesopedidosLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingProcesoPedidos(false,false);

			this.getProcesoPedidossFK_IdZona();

			this.inicializarActualizarBindingProcesoPedidos(false);

			//if(ProcesoPedidosBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingProcesoPedidos(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesopedidosLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesopedidosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProcesoPedidosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesopedidosLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameProcesoPedidos() {
		if(this.jInternalFrameDetalleFormProcesoPedidos!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormProcesoPedidos!=null) {
			this.jInternalFrameDetalleFormProcesoPedidos.setVisible(false);	    			
			this.jInternalFrameDetalleFormProcesoPedidos.dispose();
			this.jInternalFrameDetalleFormProcesoPedidos=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoProcesoPedidos!=null) {
			this.jInternalFrameReporteDinamicoProcesoPedidos.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoProcesoPedidos.dispose();
			this.jInternalFrameReporteDinamicoProcesoPedidos=null;
		}
		
		if(this.jInternalFrameImportacionProcesoPedidos!=null) {
			this.jInternalFrameImportacionProcesoPedidos.setVisible(false);	    			
			this.jInternalFrameImportacionProcesoPedidos.dispose();
			this.jInternalFrameImportacionProcesoPedidos=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessProcesoPedidos();
			
			ProcesoPedidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.procesopedidos,new Object(),this.procesopedidosParameterGeneral,this.procesopedidosReturnGeneral);
			
			
			if(sTipo.equals("NuevoProcesoPedidos")) {
				jButtonNuevoProcesoPedidosActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarProcesoPedidos")) {
				jButtonDuplicarProcesoPedidosActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarProcesoPedidos")) {
				jButtonCopiarProcesoPedidosActionPerformed(evt);
			} else if(sTipo.equals("VerFormProcesoPedidos")) {
				jButtonVerFormProcesoPedidosActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarProcesoPedidos")) {
				jButtonNuevoProcesoPedidosActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarProcesoPedidos")) {
				jButtonDuplicarProcesoPedidosActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoProcesoPedidos")) {
				jButtonNuevoProcesoPedidosActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarProcesoPedidos")) {
				jButtonDuplicarProcesoPedidosActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesProcesoPedidos")) {
				jButtonNuevoProcesoPedidosActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarProcesoPedidos")) {
				jButtonNuevoProcesoPedidosActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesProcesoPedidos")) {
				jButtonNuevoProcesoPedidosActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarProcesoPedidos")) {
				jButtonModificarProcesoPedidosActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarProcesoPedidos")) {
				jButtonModificarProcesoPedidosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarProcesoPedidos")) {
				jButtonModificarProcesoPedidosActionPerformed(evt);
			} else if(sTipo.equals("ActualizarProcesoPedidos")) {
				jButtonActualizarProcesoPedidosActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarProcesoPedidos")) {
				jButtonActualizarProcesoPedidosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarProcesoPedidos")) {
				jButtonActualizarProcesoPedidosActionPerformed(evt);
			} else if(sTipo.equals("EliminarProcesoPedidos")) {
				jButtonEliminarProcesoPedidosActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarProcesoPedidos")) {
				jButtonEliminarProcesoPedidosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarProcesoPedidos")) {
				jButtonEliminarProcesoPedidosActionPerformed(evt);
			} else if(sTipo.equals("CancelarProcesoPedidos")) {
				jButtonCancelarProcesoPedidosActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarProcesoPedidos")) {
				jButtonCancelarProcesoPedidosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarProcesoPedidos")) {
				jButtonCancelarProcesoPedidosActionPerformed(evt);
			} else if(sTipo.equals("CerrarProcesoPedidos")) {
				jButtonCerrarProcesoPedidosActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarProcesoPedidos")) {
				jButtonCerrarProcesoPedidosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarProcesoPedidos")) {
				jButtonCerrarProcesoPedidosActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarProcesoPedidos")) {
				jButtonMostrarOcultarProcesoPedidosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarProcesoPedidos")) {
				jButtonCancelarProcesoPedidosActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosProcesoPedidos")) {
				jButtonGuardarCambiosProcesoPedidosActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarProcesoPedidos")) {
				jButtonGuardarCambiosProcesoPedidosActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarProcesoPedidos")) {
				jButtonCopiarProcesoPedidosActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarProcesoPedidos")) {
				jButtonVerFormProcesoPedidosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosProcesoPedidos")) {
				jButtonGuardarCambiosProcesoPedidosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarProcesoPedidos")) {
				jButtonCopiarProcesoPedidosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormProcesoPedidos")) {
				jButtonVerFormProcesoPedidosActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaProcesoPedidos")) {
				jButtonGuardarCambiosProcesoPedidosActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarProcesoPedidos")) {
				jButtonGuardarCambiosProcesoPedidosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaProcesoPedidos")) {
				jButtonGuardarCambiosProcesoPedidosActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionProcesoPedidos")) {
				jButtonRecargarInformacionProcesoPedidosActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarProcesoPedidos")) {
				jButtonRecargarInformacionProcesoPedidosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionProcesoPedidos")) {
				jButtonRecargarInformacionProcesoPedidosActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresProcesoPedidos")) {
				jButtonAnterioresProcesoPedidosActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarProcesoPedidos")) {
				jButtonAnterioresProcesoPedidosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreProcesoPedidos")) {
				jButtonAnterioresProcesoPedidosActionPerformed(evt);
			} else if(sTipo.equals("SiguientesProcesoPedidos")) {
				jButtonSiguientesProcesoPedidosActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarProcesoPedidos")) {
				jButtonSiguientesProcesoPedidosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesProcesoPedidos")) {
				jButtonSiguientesProcesoPedidosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByProcesoPedidos") || sTipo.equals("MenuItemDetalleAbrirOrderByProcesoPedidos")) {
				jButtonAbrirOrderByProcesoPedidosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarProcesoPedidos") || sTipo.equals("MenuItemDetalleMostrarOcultarProcesoPedidos")) {
				jButtonMostrarOcultarProcesoPedidosActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosProcesoPedidos")) {
				jButtonNuevoGuardarCambiosProcesoPedidosActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarProcesoPedidos")) {
				jButtonNuevoGuardarCambiosProcesoPedidosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosProcesoPedidos")) {
				jButtonNuevoGuardarCambiosProcesoPedidosActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoProcesoPedidos")) {
				jButtonCerrarReporteDinamicoProcesoPedidosActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoProcesoPedidos")) {
				jButtonGenerarReporteDinamicoProcesoPedidosActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoProcesoPedidos")) {
				
				jButtonGenerarExcelReporteDinamicoProcesoPedidosActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionProcesoPedidos")) {
				jButtonCerrarImportacionProcesoPedidosActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionProcesoPedidos")) {
				
				jButtonGenerarImportacionProcesoPedidosActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionProcesoPedidos")) {
				
				jButtonAbrirImportacionProcesoPedidosActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesProcesoPedidos")) {
				jComboBoxTiposAccionesProcesoPedidosActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesProcesoPedidos")) {
				jComboBoxTiposRelacionesProcesoPedidosActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioProcesoPedidos")) {
				jComboBoxTiposAccionesProcesoPedidosActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarProcesoPedidos")) {
				
				jComboBoxTiposSeleccionarProcesoPedidosActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralProcesoPedidos")) {
				jTextFieldValorCampoGeneralProcesoPedidosActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByProcesoPedidos")) {
				jButtonAbrirOrderByProcesoPedidosActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarProcesoPedidos")) {
				jButtonAbrirOrderByProcesoPedidosActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByProcesoPedidos")) {
				jButtonCerrarOrderByProcesoPedidosActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idProcesoPedidosBusqueda")) {
				this.jButtonidProcesoPedidosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_ciudadProcesoPedidosUpdate")) {
				this.jButtonid_ciudadProcesoPedidosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_ciudadProcesoPedidosBusqueda")) {
				this.jButtonid_ciudadProcesoPedidosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_zonaProcesoPedidosUpdate")) {
				this.jButtonid_zonaProcesoPedidosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_zonaProcesoPedidosBusqueda")) {
				this.jButtonid_zonaProcesoPedidosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_grupo_clienteProcesoPedidosUpdate")) {
				this.jButtonid_grupo_clienteProcesoPedidosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_grupo_clienteProcesoPedidosBusqueda")) {
				this.jButtonid_grupo_clienteProcesoPedidosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_vendedorProcesoPedidosUpdate")) {
				this.jButtonid_vendedorProcesoPedidosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_vendedorProcesoPedidosBusqueda")) {
				this.jButtonid_vendedorProcesoPedidosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_provinciaProcesoPedidosBusqueda")) {
				this.jButtonnombre_provinciaProcesoPedidosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_ciudadProcesoPedidosBusqueda")) {
				this.jButtonnombre_ciudadProcesoPedidosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_zonaProcesoPedidosBusqueda")) {
				this.jButtonnombre_zonaProcesoPedidosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_grupo_clienteProcesoPedidosBusqueda")) {
				this.jButtonnombre_grupo_clienteProcesoPedidosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_vendedorProcesoPedidosBusqueda")) {
				this.jButtonnombre_vendedorProcesoPedidosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoProcesoPedidosBusqueda")) {
				this.jButtoncodigoProcesoPedidosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_completoProcesoPedidosBusqueda")) {
				this.jButtonnombre_completoProcesoPedidosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numeroProcesoPedidosBusqueda")) {
				this.jButtonnumeroProcesoPedidosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_autorizacionProcesoPedidosBusqueda")) {
				this.jButtonnumero_autorizacionProcesoPedidosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("totalProcesoPedidosBusqueda")) {
				this.jButtontotalProcesoPedidosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_emisionProcesoPedidosBusqueda")) {
				this.jButtonfecha_emisionProcesoPedidosBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("BusquedaProcesoPedidosProcesoPedidos")) {
				this.jButtonBusquedaProcesoPedidosProcesoPedidosActionPerformed(evt);
			}
			
			;
			
			
			ProcesoPedidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.procesopedidos,new Object(),this.procesopedidosParameterGeneral,this.procesopedidosReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoPedidosConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessProcesoPedidos();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProcesoPedidosActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesopedidos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesopedidos);
				
				ProcesoPedidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesopedidos,new Object(),this.procesopedidosParameterGeneral,this.procesopedidosReturnGeneral);
				
				


				
				ProcesoPedidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesopedidos,new Object(),this.procesopedidosParameterGeneral,this.procesopedidosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProcesoPedidos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesoPedidos.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,ProcesoPedidosConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			ProcesoPedidos procesopedidosLocal=null;
			
			if(!this.getEsControlTabla()) {
				procesopedidosLocal=this.procesopedidos;
			} else {
				procesopedidosLocal=this.procesopedidosAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoPedidosConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesopedidos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesopedidos);
				
				ProcesoPedidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesopedidos,new Object(),this.procesopedidosParameterGeneral,this.procesopedidosReturnGeneral);
							
				
				


				
				ProcesoPedidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesopedidos,new Object(),this.procesopedidosParameterGeneral,this.procesopedidosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProcesoPedidos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesoPedidos.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoPedidosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProcesoPedidosActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosProcesoPedidos.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesopedidosAnterior =(ProcesoPedidos) this.procesopedidosLogic.getProcesoPedidoss().toArray()[this.jTableDatosProcesoPedidos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.procesopedidosAnterior =(ProcesoPedidos) this.procesopedidoss.toArray()[this.jTableDatosProcesoPedidos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoPedidosConstantesFunciones.CLASSNAME);
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
			
			ProcesoPedidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesopedidos,new Object(),this.procesopedidosParameterGeneral,this.procesopedidosReturnGeneral);
			
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
			
			


			
			ProcesoPedidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesopedidos,new Object(),this.procesopedidosParameterGeneral,this.procesopedidosReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoPedidosConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoPedidosConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoPedidosConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProcesoPedidosActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesopedidos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesopedidos);
				
				ProcesoPedidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesopedidos,new Object(),this.procesopedidosParameterGeneral,this.procesopedidosReturnGeneral);
								
						
				


				
				ProcesoPedidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesopedidos,new Object(),this.procesopedidosParameterGeneral,this.procesopedidosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProcesoPedidos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesoPedidos.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoPedidosConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesopedidos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesopedidos);
				
				ProcesoPedidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesopedidos,new Object(),this.procesopedidosParameterGeneral,this.procesopedidosReturnGeneral);
								
				
				


				
				ProcesoPedidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesopedidos,new Object(),this.procesopedidosParameterGeneral,this.procesopedidosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProcesoPedidos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesoPedidos.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoPedidosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProcesoPedidosActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosProcesoPedidos.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesopedidosAnterior =(ProcesoPedidos) this.procesopedidosLogic.getProcesoPedidoss().toArray()[this.jTableDatosProcesoPedidos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.procesopedidosAnterior =(ProcesoPedidos) this.procesopedidoss.toArray()[this.jTableDatosProcesoPedidos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoPedidosConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesopedidos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesopedidos);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoPedidosConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProcesoPedidosActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosProcesoPedidos.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesopedidosAnterior =(ProcesoPedidos) this.procesopedidosLogic.getProcesoPedidoss().toArray()[this.jTableDatosProcesoPedidos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.procesopedidosAnterior =(ProcesoPedidos) this.procesopedidoss.toArray()[this.jTableDatosProcesoPedidos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoPedidosConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProcesoPedidosActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.procesopedidos);
			
			this.actualizarInformacion("INFO_PADRE",false,this.procesopedidos);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoPedidosConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesopedidos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesopedidos);
				
				ProcesoPedidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesopedidos,new Object(),this.procesopedidosParameterGeneral,this.procesopedidosReturnGeneral);
							
				
				


				
				ProcesoPedidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesopedidos,new Object(),this.procesopedidosParameterGeneral,this.procesopedidosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProcesoPedidos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesoPedidos.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoPedidosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProcesoPedidosActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosProcesoPedidos.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.procesopedidosAnterior =(ProcesoPedidos) this.procesopedidosLogic.getProcesoPedidoss().toArray()[this.jTableDatosProcesoPedidos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.procesopedidosAnterior =(ProcesoPedidos) this.procesopedidoss.toArray()[this.jTableDatosProcesoPedidos.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoPedidosConstantesFunciones.CLASSNAME);
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
			
			ProcesoPedidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesopedidos,new Object(),this.procesopedidosParameterGeneral,this.procesopedidosReturnGeneral);
			
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
			
			


			
			ProcesoPedidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesopedidos,new Object(),this.procesopedidosParameterGeneral,this.procesopedidosReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoPedidosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoPedidosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoPedidosConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProcesoPedidosActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.procesopedidos);
			
			this.actualizarInformacion("INFO_PADRE",false,this.procesopedidos);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoPedidosConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesopedidos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesopedidos);
				
				ProcesoPedidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesopedidos,new Object(),this.procesopedidosParameterGeneral,this.procesopedidosReturnGeneral);
								
				
				


				
				ProcesoPedidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesopedidos,new Object(),this.procesopedidosParameterGeneral,this.procesopedidosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProcesoPedidos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesoPedidos.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoPedidosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProcesoPedidosActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosProcesoPedidos.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesopedidosAnterior =(ProcesoPedidos) this.procesopedidosLogic.getProcesoPedidoss().toArray()[this.jTableDatosProcesoPedidos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.procesopedidosAnterior =(ProcesoPedidos) this.procesopedidoss.toArray()[this.jTableDatosProcesoPedidos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoPedidosConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProcesoPedidosActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.procesopedidos);
			
			this.actualizarInformacion("INFO_PADRE",false,this.procesopedidos);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoPedidosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProcesoPedidosActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesopedidos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesopedidos);
				
				ProcesoPedidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.procesopedidos,new Object(),this.procesopedidosParameterGeneral,this.procesopedidosReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosProcesoPedidos")) {
					jCheckBoxSeleccionarTodosProcesoPedidosItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosProcesoPedidos")) {
					jCheckBoxSeleccionadosProcesoPedidosItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarProcesoPedidos")) {
					
				}
				
				


				
				
				ProcesoPedidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.procesopedidos,new Object(),this.procesopedidosParameterGeneral,this.procesopedidosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProcesoPedidos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesoPedidos.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoPedidosConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.procesopedidos);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.procesopedidos);
				
				ProcesoPedidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.procesopedidos,new Object(),this.procesopedidosParameterGeneral,this.procesopedidosReturnGeneral);
												
				
				


				
				
				ProcesoPedidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.procesopedidos,new Object(),this.procesopedidosParameterGeneral,this.procesopedidosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProcesoPedidos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesoPedidos.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoPedidosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProcesoPedidosActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosProcesoPedidos.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.procesopedidosAnterior =(ProcesoPedidos) this.procesopedidosLogic.getProcesoPedidoss().toArray()[this.jTableDatosProcesoPedidos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.procesopedidosAnterior =(ProcesoPedidos) this.procesopedidoss.toArray()[this.jTableDatosProcesoPedidos.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoPedidosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProcesoPedidosActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesopedidos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesopedidos);
				
				ProcesoPedidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.procesopedidos,new Object(),this.procesopedidosParameterGeneral,this.procesopedidosReturnGeneral);
				
				
				ProcesoPedidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.procesopedidos,new Object(),this.procesopedidosParameterGeneral,this.procesopedidosReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoPedidosConstantesFunciones.CLASSNAME);
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
			
			ProcesoPedidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.procesopedidos,new Object(),this.procesopedidosParameterGeneral,this.procesopedidosReturnGeneral);
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
			
			


			
			ProcesoPedidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesopedidos,new Object(),this.procesopedidosParameterGeneral,this.procesopedidosReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoPedidosConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProcesoPedidosActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesopedidos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesopedidos);
				
				ProcesoPedidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.procesopedidos,new Object(),this.procesopedidosParameterGeneral,this.procesopedidosReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				ProcesoPedidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesopedidos,new Object(),this.procesopedidosParameterGeneral,this.procesopedidosReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProcesoPedidos.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesoPedidos.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoPedidosConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesopedidos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesopedidos);
				
				ProcesoPedidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.procesopedidos,new Object(),this.procesopedidosParameterGeneral,this.procesopedidosReturnGeneral);
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
				
				


				
				ProcesoPedidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesopedidos,new Object(),this.procesopedidosParameterGeneral,this.procesopedidosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProcesoPedidos.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesoPedidos.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoPedidosConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProcesoPedidosActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosProcesoPedidos.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesopedidosAnterior =(ProcesoPedidos) this.procesopedidosLogic.getProcesoPedidoss().toArray()[this.jTableDatosProcesoPedidos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.procesopedidosAnterior =(ProcesoPedidos) this.procesopedidoss.toArray()[this.jTableDatosProcesoPedidos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoPedidosConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				ProcesoPedidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesopedidos,new Object(),this.procesopedidosParameterGeneral,this.procesopedidosReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarProcesoPedidos")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosProcesoPedidosListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosProcesoPedidos.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.procesopedidos =(ProcesoPedidos) this.procesopedidosLogic.getProcesoPedidoss().toArray()[this.jTableDatosProcesoPedidos.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.procesopedidos =(ProcesoPedidos) this.procesopedidoss.toArray()[this.jTableDatosProcesoPedidos.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.procesopedidos);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarProcesoPedidos")) {
				
				}
				
				ProcesoPedidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesopedidos,new Object(),this.procesopedidosParameterGeneral,this.procesopedidosReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoPedidosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			ProcesoPedidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.procesopedidos,new Object(),this.procesopedidosParameterGeneral,this.procesopedidosReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarProcesoPedidos")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosProcesoPedidos.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarProcesoPedidos")) {
			
			}
			
			ProcesoPedidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.procesopedidos,new Object(),this.procesopedidosParameterGeneral,this.procesopedidosReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoPedidosConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessProcesoPedidos();
			
			ProcesoPedidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.procesopedidos,new Object(),this.procesopedidosParameterGeneral,this.procesopedidosReturnGeneral);
			
			if(sTipo.equals("NuevoProcesoPedidos")) {
				jButtonNuevoProcesoPedidosActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarProcesoPedidos")) {
				jButtonDuplicarProcesoPedidosActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarProcesoPedidos")) {
				jButtonCopiarProcesoPedidosActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormProcesoPedidos")) {
				jButtonVerFormProcesoPedidosActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesProcesoPedidos")) {
				jButtonNuevoProcesoPedidosActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarProcesoPedidos")) {
				jButtonModificarProcesoPedidosActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarProcesoPedidos")) {
				jButtonActualizarProcesoPedidosActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarProcesoPedidos")) {
				jButtonEliminarProcesoPedidosActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaProcesoPedidos")) {
				jButtonGuardarCambiosProcesoPedidosActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarProcesoPedidos")) {
				jButtonCancelarProcesoPedidosActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarProcesoPedidos")) {
				jButtonCerrarProcesoPedidosActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosProcesoPedidos")) {
				jButtonGuardarCambiosProcesoPedidosActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosProcesoPedidos")) {
				jButtonNuevoGuardarCambiosProcesoPedidosActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByProcesoPedidos")) {
				jButtonAbrirOrderByProcesoPedidosActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionProcesoPedidos")) {
				jButtonRecargarInformacionProcesoPedidosActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresProcesoPedidos")) {
				jButtonAnterioresProcesoPedidosActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesProcesoPedidos")) {
				jButtonSiguientesProcesoPedidosActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idProcesoPedidosBusqueda")) {
				this.jButtonidProcesoPedidosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_ciudadProcesoPedidosUpdate")) {
				this.jButtonid_ciudadProcesoPedidosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_ciudadProcesoPedidosBusqueda")) {
				this.jButtonid_ciudadProcesoPedidosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_zonaProcesoPedidosUpdate")) {
				this.jButtonid_zonaProcesoPedidosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_zonaProcesoPedidosBusqueda")) {
				this.jButtonid_zonaProcesoPedidosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_grupo_clienteProcesoPedidosUpdate")) {
				this.jButtonid_grupo_clienteProcesoPedidosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_grupo_clienteProcesoPedidosBusqueda")) {
				this.jButtonid_grupo_clienteProcesoPedidosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_vendedorProcesoPedidosUpdate")) {
				this.jButtonid_vendedorProcesoPedidosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_vendedorProcesoPedidosBusqueda")) {
				this.jButtonid_vendedorProcesoPedidosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_provinciaProcesoPedidosBusqueda")) {
				this.jButtonnombre_provinciaProcesoPedidosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_ciudadProcesoPedidosBusqueda")) {
				this.jButtonnombre_ciudadProcesoPedidosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_zonaProcesoPedidosBusqueda")) {
				this.jButtonnombre_zonaProcesoPedidosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_grupo_clienteProcesoPedidosBusqueda")) {
				this.jButtonnombre_grupo_clienteProcesoPedidosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_vendedorProcesoPedidosBusqueda")) {
				this.jButtonnombre_vendedorProcesoPedidosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoProcesoPedidosBusqueda")) {
				this.jButtoncodigoProcesoPedidosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_completoProcesoPedidosBusqueda")) {
				this.jButtonnombre_completoProcesoPedidosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numeroProcesoPedidosBusqueda")) {
				this.jButtonnumeroProcesoPedidosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_autorizacionProcesoPedidosBusqueda")) {
				this.jButtonnumero_autorizacionProcesoPedidosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("totalProcesoPedidosBusqueda")) {
				this.jButtontotalProcesoPedidosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_emisionProcesoPedidosBusqueda")) {
				this.jButtonfecha_emisionProcesoPedidosBusquedaActionPerformed(evt);
			}
			
			ProcesoPedidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.procesopedidos,new Object(),this.procesopedidosParameterGeneral,this.procesopedidosReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoPedidosConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessProcesoPedidos();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			ProcesoPedidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.procesopedidos,new Object(),this.procesopedidosParameterGeneral,this.procesopedidosReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameProcesoPedidos")) {
				closingInternalFrameProcesoPedidos();
				
			} else if(sTipo.equals("jButtonCancelarProcesoPedidos")) {
				JInternalFrameBase jInternalFrameDetalleFormProcesoPedidos = (JInternalFrameBase)evt.getSource();
	            	
	            ProcesoPedidosBeanSwingJInternalFrame jInternalFrameParent=(ProcesoPedidosBeanSwingJInternalFrame)jInternalFrameDetalleFormProcesoPedidos.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarProcesoPedidosActionPerformed(null);
			}
			
			ProcesoPedidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.procesopedidos,new Object(),this.procesopedidosParameterGeneral,this.procesopedidosReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoPedidosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormProcesoPedidos(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormProcesoPedidos(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormProcesoPedidos(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.procesopedidos)) {
			if(!esControlTabla) {
				if(ProcesoPedidosJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualProcesoPedidos(this.procesopedidos,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoPedidos(this.procesopedidos);			
				}
				
				if(this.procesopedidosSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualProcesoPedidos(this.procesopedidos,classes);				
				}
			
				if(conIrServidorAplicacion) {
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanProcesoPedidos(this.procesopedidosReturnGeneral,this.procesopedidosBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.procesopedidosSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanProcesoPedidos(classes,this.procesopedidosReturnGeneral,this.procesopedidosBean,false);
					}
						
					if(this.procesopedidosReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyProcesoPedidos(this.procesopedidosReturnGeneral.getProcesoPedidos());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioProcesoPedidos(this.procesopedidosReturnGeneral.getProcesoPedidos());	
					}
						
					if(this.procesopedidosReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioProcesoPedidos(this.procesopedidosReturnGeneral.getProcesoPedidos(),classes);//this.procesopedidosBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioProcesoPedidos(this.procesopedidos,classes);//this.procesopedidosBean);									
				}
			
				if(ProcesoPedidosJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualProcesoPedidos(this.procesopedidos,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoPedidos(this.procesopedidos);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.procesopedidosAnterior!=null) {
						this.procesopedidos=this.procesopedidosAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.procesopedidosSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.procesopedidosSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.procesopedidosReturnGeneral.getProcesoPedidos(),procesopedidosLogic.getProcesoPedidoss());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.procesopedidosReturnGeneral.getProcesoPedidos(),this.procesopedidoss);
				}
				//ARCHITECTURE
				
				//this.jTableDatosProcesoPedidos.repaint();
				
				//((AbstractTableModel) this.jTableDatosProcesoPedidos.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosProcesoPedidos();
			}
		}
	}
	
	public void actualizarVisualTableDatosProcesoPedidos() throws Exception {
		
		ProcesoPedidosModel procesopedidosModel=(ProcesoPedidosModel)this.jTableDatosProcesoPedidos.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			procesopedidosModel.procesopedidoss=this.procesopedidosLogic.getProcesoPedidoss();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			procesopedidosModel.procesopedidoss=this.procesopedidoss;
		}
		
		
		((ProcesoPedidosModel) this.jTableDatosProcesoPedidos.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaProcesoPedidos() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getprocesopedidosAnterior(),this.procesopedidosLogic.getProcesoPedidoss());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getprocesopedidosAnterior(),this.procesopedidoss);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosProcesoPedidos();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioProcesoPedidos(ProcesoPedidos procesopedidos,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoPedidosConstantesFunciones.CLASSNAME);
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
										
				ProcesoPedidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.procesopedidos,new Object(),generalEntityParameterGeneral,this.procesopedidosReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.procesopedidosSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=ProcesoPedidosConstantesFunciones.getClassesRelationshipsOfProcesoPedidos(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=ProcesoPedidosConstantesFunciones.getClassesRelationshipsFromStringsOfProcesoPedidos(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormProcesoPedidos(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				ProcesoPedidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.procesopedidos,new Object(),generalEntityParameterGeneral,this.procesopedidosReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoPedidosConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioProcesoPedidos(ProcesoPedidosBean procesopedidosBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoPedidosConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanProcesoPedidos(ArrayList<Classe> classes,ProcesoPedidosReturnGeneral procesopedidosReturnGeneral,ProcesoPedidosBean procesopedidosBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualProcesoPedidos(ProcesoPedidos procesopedidos,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.procesopedidos)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormProcesoPedidos = new ProcesoPedidosDetalleFormJInternalFrame(jDesktopPane,this.procesopedidosSessionBean.getConGuardarRelaciones(),this.procesopedidosSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormProcesoPedidos);
		this.jInternalFrameDetalleFormProcesoPedidos.setVisible(false);
		this.jInternalFrameDetalleFormProcesoPedidos.setSelected(false);						
		
		this.jInternalFrameDetalleFormProcesoPedidos.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormProcesoPedidos.procesopedidosLogic=this.procesopedidosLogic;
		
		this.cargarCombosFrameForeignKeyProcesoPedidos("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleProcesoPedidos();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleProcesoPedidos();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyProcesoPedidos("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyProcesoPedidos();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormProcesoPedidos.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarProcesoPedidos"));
		
		this.jInternalFrameDetalleFormProcesoPedidos.jButtonModificarProcesoPedidos.addActionListener(new ButtonActionListener(this,"ModificarProcesoPedidos"));

		
		this.jInternalFrameDetalleFormProcesoPedidos.jButtonModificarToolBarProcesoPedidos.addActionListener(new ButtonActionListener(this,"ModificarToolBarProcesoPedidos"));
					
		this.jInternalFrameDetalleFormProcesoPedidos.jMenuItemModificarProcesoPedidos.addActionListener(new ButtonActionListener(this,"MenuItemModificarProcesoPedidos"));		
		
		
		
		this.jInternalFrameDetalleFormProcesoPedidos.jButtonActualizarProcesoPedidos.addActionListener (new ButtonActionListener(this,"ActualizarProcesoPedidos"));
		
		
		this.jInternalFrameDetalleFormProcesoPedidos.jButtonActualizarToolBarProcesoPedidos.addActionListener(new ButtonActionListener(this,"ActualizarToolBarProcesoPedidos"));
						
		this.jInternalFrameDetalleFormProcesoPedidos.jMenuItemActualizarProcesoPedidos.addActionListener (new ButtonActionListener(this,"MenuItemActualizarProcesoPedidos"));		
		
		
		
		this.jInternalFrameDetalleFormProcesoPedidos.jButtonEliminarProcesoPedidos.addActionListener (new ButtonActionListener(this,"EliminarProcesoPedidos"));
		
		
		this.jInternalFrameDetalleFormProcesoPedidos.jButtonEliminarToolBarProcesoPedidos.addActionListener (new ButtonActionListener(this,"EliminarToolBarProcesoPedidos"));
								
		this.jInternalFrameDetalleFormProcesoPedidos.jMenuItemEliminarProcesoPedidos.addActionListener (new ButtonActionListener(this,"MenuItemEliminarProcesoPedidos"));		
		
		
		
		this.jInternalFrameDetalleFormProcesoPedidos.jButtonCancelarProcesoPedidos.addActionListener (new ButtonActionListener(this,"CancelarProcesoPedidos"));
		
		
		this.jInternalFrameDetalleFormProcesoPedidos.jButtonCancelarToolBarProcesoPedidos.addActionListener (new ButtonActionListener(this,"CancelarToolBarProcesoPedidos"));
					
		this.jInternalFrameDetalleFormProcesoPedidos.jMenuItemCancelarProcesoPedidos.addActionListener (new ButtonActionListener(this,"MenuItemCancelarProcesoPedidos"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormProcesoPedidos.jMenuItemDetalleCerrarProcesoPedidos.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarProcesoPedidos"));		
		
		
		
		this.jInternalFrameDetalleFormProcesoPedidos.jButtonGuardarCambiosToolBarProcesoPedidos.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarProcesoPedidos"));
		
		
		
		this.jInternalFrameDetalleFormProcesoPedidos.jButtonGuardarCambiosToolBarProcesoPedidos.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarProcesoPedidos"));
		
		
		
		this.jInternalFrameDetalleFormProcesoPedidos.jComboBoxTiposAccionesFormularioProcesoPedidos.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioProcesoPedidos"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoPedidos.jButtonidProcesoPedidosBusqueda.addActionListener(new ButtonActionListener(this,"idProcesoPedidosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesoPedidos.jButtonid_ciudadProcesoPedidosUpdate.addActionListener(new ButtonActionListener(this,"id_ciudadProcesoPedidosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoPedidos.jButtonid_ciudadProcesoPedidosBusqueda.addActionListener(new ButtonActionListener(this,"id_ciudadProcesoPedidosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesoPedidos.jButtonid_zonaProcesoPedidosUpdate.addActionListener(new ButtonActionListener(this,"id_zonaProcesoPedidosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoPedidos.jButtonid_zonaProcesoPedidosBusqueda.addActionListener(new ButtonActionListener(this,"id_zonaProcesoPedidosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesoPedidos.jButtonid_grupo_clienteProcesoPedidosUpdate.addActionListener(new ButtonActionListener(this,"id_grupo_clienteProcesoPedidosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoPedidos.jButtonid_grupo_clienteProcesoPedidosBusqueda.addActionListener(new ButtonActionListener(this,"id_grupo_clienteProcesoPedidosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesoPedidos.jButtonid_vendedorProcesoPedidosUpdate.addActionListener(new ButtonActionListener(this,"id_vendedorProcesoPedidosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoPedidos.jButtonid_vendedorProcesoPedidosBusqueda.addActionListener(new ButtonActionListener(this,"id_vendedorProcesoPedidosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoPedidos.jButtonnombre_provinciaProcesoPedidosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_provinciaProcesoPedidosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoPedidos.jButtonnombre_ciudadProcesoPedidosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_ciudadProcesoPedidosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoPedidos.jButtonnombre_zonaProcesoPedidosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_zonaProcesoPedidosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoPedidos.jButtonnombre_grupo_clienteProcesoPedidosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_grupo_clienteProcesoPedidosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoPedidos.jButtonnombre_vendedorProcesoPedidosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_vendedorProcesoPedidosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoPedidos.jButtoncodigoProcesoPedidosBusqueda.addActionListener(new ButtonActionListener(this,"codigoProcesoPedidosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoPedidos.jButtonnombre_completoProcesoPedidosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_completoProcesoPedidosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoPedidos.jButtonnumeroProcesoPedidosBusqueda.addActionListener(new ButtonActionListener(this,"numeroProcesoPedidosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoPedidos.jButtonnumero_autorizacionProcesoPedidosBusqueda.addActionListener(new ButtonActionListener(this,"numero_autorizacionProcesoPedidosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoPedidos.jButtontotalProcesoPedidosBusqueda.addActionListener(new ButtonActionListener(this,"totalProcesoPedidosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoPedidos.jButtonfecha_emisionProcesoPedidosBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emisionProcesoPedidosBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormProcesoPedidos.jTabbedPaneRelacionesProcesoPedidos.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesProcesoPedidos"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameProcesoPedidos"));
		
		if(this.jInternalFrameDetalleFormProcesoPedidos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoPedidos.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarProcesoPedidos"));
		}
		
		this.jTableDatosProcesoPedidos.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarProcesoPedidos"));
		
		this.jTableDatosProcesoPedidos.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarProcesoPedidos"));
		
		this.jButtonNuevoProcesoPedidos.addActionListener(new ButtonActionListener(this,"NuevoProcesoPedidos"));
		
		this.jButtonDuplicarProcesoPedidos.addActionListener(new ButtonActionListener(this,"DuplicarProcesoPedidos"));
		
		this.jButtonCopiarProcesoPedidos.addActionListener(new ButtonActionListener(this,"CopiarProcesoPedidos"));
		
		this.jButtonVerFormProcesoPedidos.addActionListener(new ButtonActionListener(this,"VerFormProcesoPedidos"));
		
		
		this.jButtonNuevoToolBarProcesoPedidos.addActionListener(new ButtonActionListener(this,"NuevoToolBarProcesoPedidos"));
			
		this.jButtonDuplicarToolBarProcesoPedidos.addActionListener(new ButtonActionListener(this,"DuplicarToolBarProcesoPedidos"));
			
		this.jMenuItemNuevoProcesoPedidos.addActionListener (new ButtonActionListener(this,"MenuItemNuevoProcesoPedidos"));
			
		this.jMenuItemDuplicarProcesoPedidos.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarProcesoPedidos"));		
		
		
		this.jButtonNuevoRelacionesProcesoPedidos.addActionListener (new ButtonActionListener(this,"NuevoRelacionesProcesoPedidos"));
		
		
		this.jButtonNuevoRelacionesToolBarProcesoPedidos.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarProcesoPedidos"));
			
		this.jMenuItemNuevoRelacionesProcesoPedidos.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesProcesoPedidos"));		
		
		
		if(this.jInternalFrameDetalleFormProcesoPedidos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoPedidos.jButtonModificarProcesoPedidos.addActionListener(new ButtonActionListener(this,"ModificarProcesoPedidos"));
		}
		
		
		if(this.jInternalFrameDetalleFormProcesoPedidos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoPedidos.jButtonModificarToolBarProcesoPedidos.addActionListener(new ButtonActionListener(this,"ModificarToolBarProcesoPedidos"));
			
			this.jInternalFrameDetalleFormProcesoPedidos.jMenuItemModificarProcesoPedidos.addActionListener(new ButtonActionListener(this,"MenuItemModificarProcesoPedidos"));		
		}
		
		
		if(this.jInternalFrameDetalleFormProcesoPedidos!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormProcesoPedidos.jButtonActualizarProcesoPedidos.addActionListener (new ButtonActionListener(this,"ActualizarProcesoPedidos"));
		}
		
		
		if(this.jInternalFrameDetalleFormProcesoPedidos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoPedidos.jButtonActualizarToolBarProcesoPedidos.addActionListener(new ButtonActionListener(this,"ActualizarToolBarProcesoPedidos"));
				
			this.jInternalFrameDetalleFormProcesoPedidos.jMenuItemActualizarProcesoPedidos.addActionListener (new ButtonActionListener(this,"MenuItemActualizarProcesoPedidos"));		
		}
		
		
		if(this.jInternalFrameDetalleFormProcesoPedidos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoPedidos.jButtonEliminarProcesoPedidos.addActionListener (new ButtonActionListener(this,"EliminarProcesoPedidos"));
		}
		
		
		if(this.jInternalFrameDetalleFormProcesoPedidos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoPedidos.jButtonEliminarToolBarProcesoPedidos.addActionListener (new ButtonActionListener(this,"EliminarToolBarProcesoPedidos"));
						
			this.jInternalFrameDetalleFormProcesoPedidos.jMenuItemEliminarProcesoPedidos.addActionListener (new ButtonActionListener(this,"MenuItemEliminarProcesoPedidos"));		
		}
		
		
		if(this.jInternalFrameDetalleFormProcesoPedidos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoPedidos.jButtonCancelarProcesoPedidos.addActionListener (new ButtonActionListener(this,"CancelarProcesoPedidos"));
		}
		
		
		if(this.jInternalFrameDetalleFormProcesoPedidos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoPedidos.jButtonCancelarToolBarProcesoPedidos.addActionListener (new ButtonActionListener(this,"CancelarToolBarProcesoPedidos"));
			
			this.jInternalFrameDetalleFormProcesoPedidos.jMenuItemCancelarProcesoPedidos.addActionListener (new ButtonActionListener(this,"MenuItemCancelarProcesoPedidos"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarProcesoPedidos.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarProcesoPedidos"));		
		
		
		this.jButtonCerrarProcesoPedidos.addActionListener (new ButtonActionListener(this,"CerrarProcesoPedidos"));
		
		
		this.jButtonCerrarToolBarProcesoPedidos.addActionListener (new ButtonActionListener(this,"CerrarToolBarProcesoPedidos"));
			
		this.jMenuItemCerrarProcesoPedidos.addActionListener (new ButtonActionListener(this,"MenuItemCerrarProcesoPedidos"));
			
		if(this.jInternalFrameDetalleFormProcesoPedidos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoPedidos.jMenuItemDetalleCerrarProcesoPedidos.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarProcesoPedidos"));		
		}
		
		
		if(this.jInternalFrameDetalleFormProcesoPedidos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoPedidos.jButtonGuardarCambiosProcesoPedidos.addActionListener (new ButtonActionListener(this,"GuardarCambiosProcesoPedidos"));
		}
		
		
		if(this.jInternalFrameDetalleFormProcesoPedidos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoPedidos.jButtonGuardarCambiosToolBarProcesoPedidos.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarProcesoPedidos"));
		}
		
		this.jButtonCopiarToolBarProcesoPedidos.addActionListener (new ButtonActionListener(this,"CopiarToolBarProcesoPedidos"));
			
		this.jButtonVerFormToolBarProcesoPedidos.addActionListener (new ButtonActionListener(this,"VerFormToolBarProcesoPedidos"));
		
		this.jMenuItemGuardarCambiosProcesoPedidos.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosProcesoPedidos"));
			
		this.jMenuItemCopiarProcesoPedidos.addActionListener (new ButtonActionListener(this,"MenuItemCopiarProcesoPedidos"));		
		
		this.jMenuItemVerFormProcesoPedidos.addActionListener (new ButtonActionListener(this,"MenuItemVerFormProcesoPedidos"));		
		
		
		this.jButtonGuardarCambiosTablaProcesoPedidos.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaProcesoPedidos"));
		
		
		this.jButtonGuardarCambiosTablaToolBarProcesoPedidos.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarProcesoPedidos"));
			
		this.jMenuItemGuardarCambiosTablaProcesoPedidos.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaProcesoPedidos"));		
		
		
		
		this.jButtonRecargarInformacionProcesoPedidos.addActionListener (new ButtonActionListener(this,"RecargarInformacionProcesoPedidos"));
					
		this.jButtonRecargarInformacionToolBarProcesoPedidos.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarProcesoPedidos"));
		
		this.jMenuItemRecargarInformacionProcesoPedidos.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionProcesoPedidos"));		
		
		
		
		this.jButtonAnterioresProcesoPedidos.addActionListener (new ButtonActionListener(this,"AnterioresProcesoPedidos"));
		
		
		this.jButtonAnterioresToolBarProcesoPedidos.addActionListener (new ButtonActionListener(this,"AnterioresToolBarProcesoPedidos"));
		
		this.jMenuItemAnterioresProcesoPedidos.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresProcesoPedidos"));		
		
		
		this.jButtonSiguientesProcesoPedidos.addActionListener (new ButtonActionListener(this,"SiguientesProcesoPedidos"));
		
		
		this.jButtonSiguientesToolBarProcesoPedidos.addActionListener (new ButtonActionListener(this,"SiguientesToolBarProcesoPedidos"));
			
		this.jMenuItemSiguientesProcesoPedidos.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesProcesoPedidos"));
			
		this.jMenuItemAbrirOrderByProcesoPedidos.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByProcesoPedidos"));
			
		this.jMenuItemMostrarOcultarProcesoPedidos.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarProcesoPedidos"));
			
		this.jMenuItemDetalleAbrirOrderByProcesoPedidos.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByProcesoPedidos"));
			
		this.jMenuItemDetalleMostarOcultarProcesoPedidos.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarProcesoPedidos"));		
		
		
		this.jButtonNuevoGuardarCambiosProcesoPedidos.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosProcesoPedidos"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarProcesoPedidos.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarProcesoPedidos"));
			
		this.jMenuItemNuevoGuardarCambiosProcesoPedidos.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosProcesoPedidos"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosProcesoPedidos.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosProcesoPedidos"));

		this.jCheckBoxSeleccionadosProcesoPedidos.addItemListener(new CheckBoxItemListener(this,"SeleccionadosProcesoPedidos"));
		
		if(this.jInternalFrameDetalleFormProcesoPedidos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoPedidos.jComboBoxTiposAccionesFormularioProcesoPedidos.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioProcesoPedidos"));
		}
		
		
		this.jComboBoxTiposRelacionesProcesoPedidos.addActionListener (new ButtonActionListener(this,"TiposRelacionesProcesoPedidos"));
			
		this.jComboBoxTiposAccionesProcesoPedidos.addActionListener (new ButtonActionListener(this,"TiposAccionesProcesoPedidos"));
					
		this.jComboBoxTiposSeleccionarProcesoPedidos.addActionListener (new ButtonActionListener(this,"TiposSeleccionarProcesoPedidos"));
			
		this.jTextFieldValorCampoGeneralProcesoPedidos.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralProcesoPedidos"));		
		
		
		if(this.jInternalFrameDetalleFormProcesoPedidos!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoPedidos.jButtonidProcesoPedidosBusqueda.addActionListener(new ButtonActionListener(this,"idProcesoPedidosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesoPedidos.jButtonid_ciudadProcesoPedidosUpdate.addActionListener(new ButtonActionListener(this,"id_ciudadProcesoPedidosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoPedidos.jButtonid_ciudadProcesoPedidosBusqueda.addActionListener(new ButtonActionListener(this,"id_ciudadProcesoPedidosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesoPedidos.jButtonid_zonaProcesoPedidosUpdate.addActionListener(new ButtonActionListener(this,"id_zonaProcesoPedidosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoPedidos.jButtonid_zonaProcesoPedidosBusqueda.addActionListener(new ButtonActionListener(this,"id_zonaProcesoPedidosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesoPedidos.jButtonid_grupo_clienteProcesoPedidosUpdate.addActionListener(new ButtonActionListener(this,"id_grupo_clienteProcesoPedidosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoPedidos.jButtonid_grupo_clienteProcesoPedidosBusqueda.addActionListener(new ButtonActionListener(this,"id_grupo_clienteProcesoPedidosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesoPedidos.jButtonid_vendedorProcesoPedidosUpdate.addActionListener(new ButtonActionListener(this,"id_vendedorProcesoPedidosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoPedidos.jButtonid_vendedorProcesoPedidosBusqueda.addActionListener(new ButtonActionListener(this,"id_vendedorProcesoPedidosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoPedidos.jButtonnombre_provinciaProcesoPedidosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_provinciaProcesoPedidosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoPedidos.jButtonnombre_ciudadProcesoPedidosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_ciudadProcesoPedidosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoPedidos.jButtonnombre_zonaProcesoPedidosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_zonaProcesoPedidosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoPedidos.jButtonnombre_grupo_clienteProcesoPedidosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_grupo_clienteProcesoPedidosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoPedidos.jButtonnombre_vendedorProcesoPedidosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_vendedorProcesoPedidosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoPedidos.jButtoncodigoProcesoPedidosBusqueda.addActionListener(new ButtonActionListener(this,"codigoProcesoPedidosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoPedidos.jButtonnombre_completoProcesoPedidosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_completoProcesoPedidosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoPedidos.jButtonnumeroProcesoPedidosBusqueda.addActionListener(new ButtonActionListener(this,"numeroProcesoPedidosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoPedidos.jButtonnumero_autorizacionProcesoPedidosBusqueda.addActionListener(new ButtonActionListener(this,"numero_autorizacionProcesoPedidosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoPedidos.jButtontotalProcesoPedidosBusqueda.addActionListener(new ButtonActionListener(this,"totalProcesoPedidosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoPedidos.jButtonfecha_emisionProcesoPedidosBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emisionProcesoPedidosBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonBusquedaProcesoPedidosProcesoPedidos.addActionListener(new ButtonActionListener(this,"BusquedaProcesoPedidosProcesoPedidos"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoProcesoPedidos!=null) {
				this.jInternalFrameReporteDinamicoProcesoPedidos.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoProcesoPedidos"));
				this.jInternalFrameReporteDinamicoProcesoPedidos.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoProcesoPedidos"));
				this.jInternalFrameReporteDinamicoProcesoPedidos.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoProcesoPedidos"));
			}
			
			//this.jButtonCerrarReporteDinamicoProcesoPedidos.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoProcesoPedidos"));				
			//this.jButtonGenerarReporteDinamicoProcesoPedidos.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoProcesoPedidos"));
			//this.jButtonGenerarExcelReporteDinamicoProcesoPedidos.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoProcesoPedidos"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionProcesoPedidos!=null) {
				this.jInternalFrameImportacionProcesoPedidos.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionProcesoPedidos"));
				this.jInternalFrameImportacionProcesoPedidos.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionProcesoPedidos"));
				this.jInternalFrameImportacionProcesoPedidos.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionProcesoPedidos"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByProcesoPedidos.addActionListener (new ButtonActionListener(this,"AbrirOrderByProcesoPedidos"));
			
			this.jButtonAbrirOrderByToolBarProcesoPedidos.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarProcesoPedidos"));			
			
			if(this.jInternalFrameOrderByProcesoPedidos!=null) {
				this.jInternalFrameOrderByProcesoPedidos.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByProcesoPedidos"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormProcesoPedidos!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormProcesoPedidos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoPedidos.jTabbedPaneRelacionesProcesoPedidos.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesProcesoPedidos"));
		
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
            		closingInternalFrameProcesoPedidos();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormProcesoPedidos.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormProcesoPedidos = (JInternalFrameBase)event.getSource();
	            	
	            ProcesoPedidosBeanSwingJInternalFrame jInternalFrameParent=(ProcesoPedidosBeanSwingJInternalFrame)jInternalFrameDetalleFormProcesoPedidos.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarProcesoPedidosActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosProcesoPedidos.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosProcesoPedidosListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosProcesoPedidos.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosProcesoPedidos.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoProcesoPedidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProcesoPedidosActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarProcesoPedidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProcesoPedidosActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoProcesoPedidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProcesoPedidosActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoProcesoPedidos";
		inputMap = this.jButtonNuevoProcesoPedidos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoProcesoPedidos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoProcesoPedidosActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesProcesoPedidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProcesoPedidosActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarProcesoPedidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProcesoPedidosActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesProcesoPedidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProcesoPedidosActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesProcesoPedidos";
		inputMap = this.jButtonNuevoRelacionesProcesoPedidos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesProcesoPedidos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoProcesoPedidosActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarProcesoPedidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarProcesoPedidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarProcesoPedidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarProcesoPedidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarProcesoPedidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarProcesoPedidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarProcesoPedidos";
		inputMap = this.jButtonModificarProcesoPedidos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarProcesoPedidos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarProcesoPedidosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarProcesoPedidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarProcesoPedidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarProcesoPedidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarProcesoPedidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarProcesoPedidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarProcesoPedidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarProcesoPedidos";
		inputMap = this.jButtonActualizarProcesoPedidos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarProcesoPedidos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarProcesoPedidosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarProcesoPedidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarProcesoPedidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarProcesoPedidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarProcesoPedidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarProcesoPedidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarProcesoPedidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarProcesoPedidos";
		inputMap = this.jButtonEliminarProcesoPedidos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarProcesoPedidos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarProcesoPedidosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarProcesoPedidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarProcesoPedidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarProcesoPedidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarProcesoPedidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarProcesoPedidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarProcesoPedidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarProcesoPedidos";
		inputMap = this.jButtonCancelarProcesoPedidos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarProcesoPedidos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarProcesoPedidosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarProcesoPedidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarProcesoPedidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarProcesoPedidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarProcesoPedidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarProcesoPedidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarProcesoPedidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarProcesoPedidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarProcesoPedidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarProcesoPedidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarProcesoPedidos";
		inputMap = this.jButtonCerrarProcesoPedidos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarProcesoPedidos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarProcesoPedidosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormProcesoPedidos.jButtonGuardarCambiosProcesoPedidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProcesoPedidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarProcesoPedidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProcesoPedidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosProcesoPedidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProcesoPedidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaProcesoPedidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProcesoPedidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarProcesoPedidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProcesoPedidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaProcesoPedidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProcesoPedidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosProcesoPedidos";
		inputMap = this.jInternalFrameDetalleFormProcesoPedidos.jButtonGuardarCambiosProcesoPedidos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormProcesoPedidos.jButtonGuardarCambiosProcesoPedidos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosProcesoPedidosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionProcesoPedidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionProcesoPedidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarProcesoPedidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionProcesoPedidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionProcesoPedidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionProcesoPedidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresProcesoPedidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresProcesoPedidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarProcesoPedidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresProcesoPedidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresProcesoPedidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresProcesoPedidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesProcesoPedidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesProcesoPedidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarProcesoPedidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesProcesoPedidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesProcesoPedidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesProcesoPedidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosProcesoPedidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosProcesoPedidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarProcesoPedidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosProcesoPedidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosProcesoPedidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosProcesoPedidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosProcesoPedidos.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosProcesoPedidosItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesProcesoPedidos.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesProcesoPedidosActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarProcesoPedidos.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarProcesoPedidosActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralProcesoPedidos.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralProcesoPedidosActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoPedidos.jButtonidProcesoPedidosBusqueda.addActionListener(new ButtonActionListener(this,"idProcesoPedidosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesoPedidos.jButtonid_ciudadProcesoPedidosUpdate.addActionListener(new ButtonActionListener(this,"id_ciudadProcesoPedidosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoPedidos.jButtonid_ciudadProcesoPedidosBusqueda.addActionListener(new ButtonActionListener(this,"id_ciudadProcesoPedidosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesoPedidos.jButtonid_zonaProcesoPedidosUpdate.addActionListener(new ButtonActionListener(this,"id_zonaProcesoPedidosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoPedidos.jButtonid_zonaProcesoPedidosBusqueda.addActionListener(new ButtonActionListener(this,"id_zonaProcesoPedidosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesoPedidos.jButtonid_grupo_clienteProcesoPedidosUpdate.addActionListener(new ButtonActionListener(this,"id_grupo_clienteProcesoPedidosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoPedidos.jButtonid_grupo_clienteProcesoPedidosBusqueda.addActionListener(new ButtonActionListener(this,"id_grupo_clienteProcesoPedidosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesoPedidos.jButtonid_vendedorProcesoPedidosUpdate.addActionListener(new ButtonActionListener(this,"id_vendedorProcesoPedidosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoPedidos.jButtonid_vendedorProcesoPedidosBusqueda.addActionListener(new ButtonActionListener(this,"id_vendedorProcesoPedidosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoPedidos.jButtonnombre_provinciaProcesoPedidosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_provinciaProcesoPedidosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoPedidos.jButtonnombre_ciudadProcesoPedidosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_ciudadProcesoPedidosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoPedidos.jButtonnombre_zonaProcesoPedidosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_zonaProcesoPedidosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoPedidos.jButtonnombre_grupo_clienteProcesoPedidosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_grupo_clienteProcesoPedidosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoPedidos.jButtonnombre_vendedorProcesoPedidosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_vendedorProcesoPedidosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoPedidos.jButtoncodigoProcesoPedidosBusqueda.addActionListener(new ButtonActionListener(this,"codigoProcesoPedidosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoPedidos.jButtonnombre_completoProcesoPedidosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_completoProcesoPedidosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoPedidos.jButtonnumeroProcesoPedidosBusqueda.addActionListener(new ButtonActionListener(this,"numeroProcesoPedidosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoPedidos.jButtonnumero_autorizacionProcesoPedidosBusqueda.addActionListener(new ButtonActionListener(this,"numero_autorizacionProcesoPedidosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoPedidos.jButtontotalProcesoPedidosBusqueda.addActionListener(new ButtonActionListener(this,"totalProcesoPedidosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoPedidos.jButtonfecha_emisionProcesoPedidosBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emisionProcesoPedidosBusqueda"));
		
		
		this.jButtonBusquedaProcesoPedidosProcesoPedidos.addActionListener(new ButtonActionListener(this,"BusquedaProcesoPedidosProcesoPedidos"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoProcesoPedidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoProcesoPedidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoProcesoPedidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoProcesoPedidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoProcesoPedidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoProcesoPedidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionProcesoPedidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionProcesoPedidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionProcesoPedidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionProcesoPedidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionProcesoPedidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionProcesoPedidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarProcesoPedidosActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarProcesoPedidos.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoPedidosConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosProcesoPedidos(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(ProcesoPedidos procesopedidosAux:this.procesopedidosLogic.getProcesoPedidoss()) {
					procesopedidosAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ProcesoPedidos procesopedidosAux:procesopedidoss) {
					procesopedidosAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoPedidosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosProcesoPedidosItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingProcesoPedidos(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(ProcesoPedidos procesopedidosAux:this.procesopedidosLogic.getProcesoPedidoss()) {
						procesopedidosAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ProcesoPedidos procesopedidosAux:procesopedidoss) {
						procesopedidosAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(ProcesoPedidos procesopedidosAux:this.procesopedidosLogic.getProcesoPedidoss()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ProcesoPedidos procesopedidosAux:procesopedidoss) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaProcesoPedidos(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosProcesoPedidos.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosProcesoPedidos.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosProcesoPedidos,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoPedidosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosProcesoPedidosItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingProcesoPedidos(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosProcesoPedidos.getSelectedRows();
			
			ProcesoPedidos procesopedidosLocal=new ProcesoPedidos();
			
			//this.seleccionarTodosProcesoPedidos(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					procesopedidosLocal =(ProcesoPedidos) this.procesopedidosLogic.getProcesoPedidoss().toArray()[this.jTableDatosProcesoPedidos.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					procesopedidosLocal =(ProcesoPedidos) this.procesopedidoss.toArray()[this.jTableDatosProcesoPedidos.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				procesopedidosLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(ProcesoPedidos procesopedidosAux:this.procesopedidosLogic.getProcesoPedidoss()) {
						procesopedidosAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ProcesoPedidos procesopedidosAux:procesopedidoss) {
						procesopedidosAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaProcesoPedidos(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosProcesoPedidos.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosProcesoPedidos.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosProcesoPedidos,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoPedidosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualProcesoPedidosItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoPedidosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarProcesoPedidosParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoPedidosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralProcesoPedidosActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingProcesoPedidos(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralProcesoPedidos.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(ProcesoPedidos procesopedidosAux:this.procesopedidosLogic.getProcesoPedidoss()) {
				
						if(sTipoSeleccionar.equals(ProcesoPedidosConstantesFunciones.LABEL_NOMBREPROVINCIA)) {
							existe=true;
							procesopedidosAux.setnombre_provincia(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ProcesoPedidosConstantesFunciones.LABEL_NOMBRECIUDAD)) {
							existe=true;
							procesopedidosAux.setnombre_ciudad(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ProcesoPedidosConstantesFunciones.LABEL_NOMBREZONA)) {
							existe=true;
							procesopedidosAux.setnombre_zona(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ProcesoPedidosConstantesFunciones.LABEL_NOMBREGRUPOCLIENTE)) {
							existe=true;
							procesopedidosAux.setnombre_grupo_cliente(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ProcesoPedidosConstantesFunciones.LABEL_NOMBREVENDEDOR)) {
							existe=true;
							procesopedidosAux.setnombre_vendedor(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ProcesoPedidosConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							procesopedidosAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ProcesoPedidosConstantesFunciones.LABEL_NOMBRECOMPLETO)) {
							existe=true;
							procesopedidosAux.setnombre_completo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ProcesoPedidosConstantesFunciones.LABEL_NUMERO)) {
							existe=true;
							procesopedidosAux.setnumero(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ProcesoPedidosConstantesFunciones.LABEL_NUMEROAUTORIZACION)) {
							existe=true;
							procesopedidosAux.setnumero_autorizacion(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ProcesoPedidosConstantesFunciones.LABEL_TOTAL)) {
							existe=true;
							procesopedidosAux.settotal(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ProcesoPedidosConstantesFunciones.LABEL_FECHAEMISION)) {
							existe=true;
							procesopedidosAux.setfecha_emision(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ProcesoPedidos procesopedidosAux:procesopedidoss) {
					
						if(sTipoSeleccionar.equals(ProcesoPedidosConstantesFunciones.LABEL_NOMBREPROVINCIA)) {
							existe=true;
							procesopedidosAux.setnombre_provincia(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ProcesoPedidosConstantesFunciones.LABEL_NOMBRECIUDAD)) {
							existe=true;
							procesopedidosAux.setnombre_ciudad(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ProcesoPedidosConstantesFunciones.LABEL_NOMBREZONA)) {
							existe=true;
							procesopedidosAux.setnombre_zona(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ProcesoPedidosConstantesFunciones.LABEL_NOMBREGRUPOCLIENTE)) {
							existe=true;
							procesopedidosAux.setnombre_grupo_cliente(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ProcesoPedidosConstantesFunciones.LABEL_NOMBREVENDEDOR)) {
							existe=true;
							procesopedidosAux.setnombre_vendedor(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ProcesoPedidosConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							procesopedidosAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ProcesoPedidosConstantesFunciones.LABEL_NOMBRECOMPLETO)) {
							existe=true;
							procesopedidosAux.setnombre_completo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ProcesoPedidosConstantesFunciones.LABEL_NUMERO)) {
							existe=true;
							procesopedidosAux.setnumero(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ProcesoPedidosConstantesFunciones.LABEL_NUMEROAUTORIZACION)) {
							existe=true;
							procesopedidosAux.setnumero_autorizacion(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ProcesoPedidosConstantesFunciones.LABEL_TOTAL)) {
							existe=true;
							procesopedidosAux.settotal(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ProcesoPedidosConstantesFunciones.LABEL_FECHAEMISION)) {
							existe=true;
							procesopedidosAux.setfecha_emision(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaProcesoPedidos(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoPedidosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesProcesoPedidosActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingProcesoPedidos(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioProcesoPedidos=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesProcesoPedidos.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormProcesoPedidos.jComboBoxTiposAccionesFormularioProcesoPedidos.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteProcesoPedidos) {				
					conSplash=true;//false;										
					
					//this.startProcessProcesoPedidos(conSplash);
				
					this.generarReporteProcesoPedidossSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesProcesoPedidos.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormProcesoPedidos.jComboBoxTiposAccionesFormularioProcesoPedidos.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoProcesoPedidossSeleccionados();
				//this.jComboBoxTiposAccionesProcesoPedidos.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoProcesoPedidossSeleccionados(false);
				//this.jComboBoxTiposAccionesProcesoPedidos.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoProcesoPedidossSeleccionados(true);
				//this.jComboBoxTiposAccionesProcesoPedidos.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessProcesoPedidos();
				
				this.exportarProcesoPedidossSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesProcesoPedidos.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormProcesoPedidos.jComboBoxTiposAccionesFormularioProcesoPedidos.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionProcesoPedidoss();
				//this.importarProcesoPedidoss();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesProcesoPedidos.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormProcesoPedidos.jComboBoxTiposAccionesFormularioProcesoPedidos.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessProcesoPedidos();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelProcesoPedidossSeleccionados();
				//this.jComboBoxTiposAccionesProcesoPedidos.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Proceso Pedidos", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessProcesoPedidos();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoProcesoPedidos)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyProcesoPedidos(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Proceso Pedidos",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesProcesoPedidos.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormProcesoPedidos.jComboBoxTiposAccionesFormularioProcesoPedidos.setSelectedIndex(0);					
				}	
			} 			
			else if(ProcesoPedidosBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteProcesoPedidos) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessProcesoPedidos(conSplash);
					
						//this.actualizarParametrosGeneralProcesoPedidos();
						
						this.generarReporteProcesoAccionProcesoPedidossSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesProcesoPedidos.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormProcesoPedidos.jComboBoxTiposAccionesFormularioProcesoPedidos.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(ProcesoPedidosBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Proceso PedidosES SELECCIONADOS?", "MANTENIMIENTO DE Proceso Pedidos", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessProcesoPedidos();
				
						this.actualizarParametrosGeneralProcesoPedidos();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.procesopedidosReturnGeneral=procesopedidosLogic.procesarAccionProcesoPedidossWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.procesopedidosLogic.getProcesoPedidoss(),this.procesopedidosParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarProcesoPedidosReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesProcesoPedidos.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormProcesoPedidos.jComboBoxTiposAccionesFormularioProcesoPedidos.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralProcesoPedidos();
					
					ProcesoPedidosBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarProcesoPedidosReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesProcesoPedidos.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormProcesoPedidos.jComboBoxTiposAccionesFormularioProcesoPedidos.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,ProcesoPedidosConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessProcesoPedidos(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesProcesoPedidosActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessProcesoPedidos();
			
			if(this.jInternalFrameDetalleFormProcesoPedidos==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<ProcesoPedidos> procesopedidossSeleccionados=new ArrayList<ProcesoPedidos>();		
			ProcesoPedidos procesopedidos=new ProcesoPedidos();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingProcesoPedidos(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesProcesoPedidos.getSelectedItem();
			
			
			
			
			procesopedidossSeleccionados=this.getProcesoPedidossSeleccionados(true);
			//this.sTipoAccion;
			
			if(procesopedidossSeleccionados.size()==1) {
				for(ProcesoPedidos procesopedidosAux:procesopedidossSeleccionados) {
					procesopedidos=procesopedidosAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoPedidosConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessProcesoPedidos();
			
      		//this.finishProcessProcesoPedidos(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarProcesoPedidosReturnGeneral() throws Exception {
		if(this.procesopedidosReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.procesopedidosReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.procesopedidosReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.procesopedidosReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.procesopedidosReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.procesopedidosReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingProcesoPedidos(false);
		}
		
		if(this.procesopedidosReturnGeneral.getConRetornoLista() || this.procesopedidosReturnGeneral.getConRetornoObjeto()) {
			if(this.procesopedidosReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.procesopedidosLogic.setProcesoPedidoss(this.procesopedidosReturnGeneral.getProcesoPedidoss());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			
			this.inicializarActualizarBindingProcesoPedidos(false);
		}
	}
	
	public void actualizarParametrosGeneralProcesoPedidos() throws Exception {
		
		
	}
	
	public ArrayList<ProcesoPedidos> getProcesoPedidossSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<ProcesoPedidos> procesopedidossSeleccionados=new ArrayList<ProcesoPedidos>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioProcesoPedidos) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(ProcesoPedidos procesopedidosAux:procesopedidosLogic.getProcesoPedidoss()) {
					if(procesopedidosAux.getIsSelected()) {
						procesopedidossSeleccionados.add(procesopedidosAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ProcesoPedidos procesopedidosAux:this.procesopedidoss) {
					if(procesopedidosAux.getIsSelected()) {
						procesopedidossSeleccionados.add(procesopedidosAux);				
					}
				}
			}
			
			if(procesopedidossSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						procesopedidossSeleccionados.addAll(this.procesopedidosLogic.getProcesoPedidoss());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						procesopedidossSeleccionados.addAll(this.procesopedidoss);				
					}
				}
			}
		} else {
			procesopedidossSeleccionados.add(this.procesopedidos);
		}
		
		return procesopedidossSeleccionados;
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
	
	public void generarReporteProcesoPedidossSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalProcesoPedidossSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoProcesoPedidossSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoProcesoPedidossSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoProcesoPedidossSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Proceso Pedidos",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesProcesoPedidossSeleccionados() throws Exception {
		ArrayList<ProcesoPedidos> procesopedidossSeleccionados=new ArrayList<ProcesoPedidos>();		
		
		procesopedidossSeleccionados=this.getProcesoPedidossSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteProcesoPedidoss("Todos",procesopedidossSeleccionados);
		
	}	
	
	public void generarReporteNormalProcesoPedidossSeleccionados() throws Exception {
		ArrayList<ProcesoPedidos> procesopedidossSeleccionados=new ArrayList<ProcesoPedidos>();		
		
		procesopedidossSeleccionados=this.getProcesoPedidossSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteProcesoPedidoss("Todos",procesopedidossSeleccionados);
	}		
	
	public void generarReporteProcesoAccionProcesoPedidossSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<ProcesoPedidos> procesopedidossSeleccionados=new ArrayList<ProcesoPedidos>();
		
		procesopedidossSeleccionados=this.getProcesoPedidossSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteProcesoPedidoss("Todos",procesopedidossSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoProcesoPedidossSeleccionados() throws Exception {
		ArrayList<ProcesoPedidos> procesopedidossSeleccionados=new ArrayList<ProcesoPedidos>();		
		
		
		this.abrirInicializarFrameReporteDinamicoProcesoPedidos();
		
		
		procesopedidossSeleccionados=this.getProcesoPedidossSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoProcesoPedidos();
		
		
		//this.generarReporteProcesoPedidoss("Todos",procesopedidossSeleccionados ,procesopedidosImplementable,procesopedidosImplementableHome);
	}
	
	public void mostrarImportacionProcesoPedidoss() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionProcesoPedidos();
		
		this.abrirFrameImportacionProcesoPedidos();		
		
			
		//this.generarReporteProcesoPedidoss("Todos",procesopedidossSeleccionados ,procesopedidosImplementable,procesopedidosImplementableHome);
	}
	
	public void importarProcesoPedidoss() throws Exception {		
	
	}
	
	public void exportarProcesoPedidossSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelProcesoPedidossSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoProcesoPedidossSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlProcesoPedidossSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Proceso Pedidos",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoProcesoPedidossSeleccionados() throws Exception {
		ArrayList<ProcesoPedidos> procesopedidossSeleccionados=new ArrayList<ProcesoPedidos>();		
		
		procesopedidossSeleccionados=this.getProcesoPedidossSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"procesopedidos."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarProcesoPedidos(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(ProcesoPedidos procesopedidosAux:procesopedidossSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarProcesoPedidos(procesopedidosAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//procesopedidosAux.setsDetalleGeneralEntityReporte(procesopedidosAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.procesopedidosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Proceso Pedidos",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarProcesoPedidos(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=ProcesoPedidosConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProcesoPedidosConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProcesoPedidosConstantesFunciones.LABEL_IDCIUDAD;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProcesoPedidosConstantesFunciones.LABEL_IDZONA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProcesoPedidosConstantesFunciones.LABEL_IDGRUPOCLIENTE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProcesoPedidosConstantesFunciones.LABEL_IDVENDEDOR;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProcesoPedidosConstantesFunciones.LABEL_NOMBREPROVINCIA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProcesoPedidosConstantesFunciones.LABEL_NOMBRECIUDAD;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProcesoPedidosConstantesFunciones.LABEL_NOMBREZONA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProcesoPedidosConstantesFunciones.LABEL_NOMBREGRUPOCLIENTE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProcesoPedidosConstantesFunciones.LABEL_NOMBREVENDEDOR;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProcesoPedidosConstantesFunciones.LABEL_CODIGO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProcesoPedidosConstantesFunciones.LABEL_NOMBRECOMPLETO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProcesoPedidosConstantesFunciones.LABEL_NUMERO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProcesoPedidosConstantesFunciones.LABEL_NUMEROAUTORIZACION;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProcesoPedidosConstantesFunciones.LABEL_TOTAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProcesoPedidosConstantesFunciones.LABEL_FECHAEMISION;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarProcesoPedidos(ProcesoPedidos procesopedidos,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=procesopedidos.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=procesopedidos.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=procesopedidos.getciudad_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=procesopedidos.getzona_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=procesopedidos.getgrupocliente_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=procesopedidos.getvendedor_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=procesopedidos.getnombre_provincia();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=procesopedidos.getnombre_ciudad();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=procesopedidos.getnombre_zona();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=procesopedidos.getnombre_grupo_cliente();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=procesopedidos.getnombre_vendedor();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=procesopedidos.getcodigo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=procesopedidos.getnombre_completo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=procesopedidos.getnumero();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=procesopedidos.getnumero_autorizacion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=procesopedidos.gettotal().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=procesopedidos.getfecha_emision().toString();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelProcesoPedidossSeleccionados() throws Exception {
		ArrayList<ProcesoPedidos> procesopedidossSeleccionados=new ArrayList<ProcesoPedidos>();		
		
		procesopedidossSeleccionados=this.getProcesoPedidossSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"procesopedidos.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("ProcesoPedidoss");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelProcesoPedidos(row);				
				iRow++;
			}				
			
			for(ProcesoPedidos procesopedidosAux:procesopedidossSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelProcesoPedidos(procesopedidosAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.procesopedidosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Proceso Pedidos",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlProcesoPedidossSeleccionados() throws Exception {
		ArrayList<ProcesoPedidos> procesopedidossSeleccionados=new ArrayList<ProcesoPedidos>();		
		
		procesopedidossSeleccionados=this.getProcesoPedidossSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"procesopedidos.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("procesopedidoss");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("procesopedidos");
			//elementRoot.appendChild(element);
		
			for(ProcesoPedidos procesopedidosAux:procesopedidossSeleccionados) {
				element = document.createElement("procesopedidos");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlProcesoPedidos(procesopedidosAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.procesopedidosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Proceso Pedidos",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelProcesoPedidos(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(ProcesoPedidosConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(ProcesoPedidosConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(ProcesoPedidosConstantesFunciones.LABEL_IDCIUDAD);
		cell = row.createCell(iColumn++);cell.setCellValue(ProcesoPedidosConstantesFunciones.LABEL_IDZONA);
		cell = row.createCell(iColumn++);cell.setCellValue(ProcesoPedidosConstantesFunciones.LABEL_IDGRUPOCLIENTE);
		cell = row.createCell(iColumn++);cell.setCellValue(ProcesoPedidosConstantesFunciones.LABEL_IDVENDEDOR);
		cell = row.createCell(iColumn++);cell.setCellValue(ProcesoPedidosConstantesFunciones.LABEL_NOMBREPROVINCIA);
		cell = row.createCell(iColumn++);cell.setCellValue(ProcesoPedidosConstantesFunciones.LABEL_NOMBRECIUDAD);
		cell = row.createCell(iColumn++);cell.setCellValue(ProcesoPedidosConstantesFunciones.LABEL_NOMBREZONA);
		cell = row.createCell(iColumn++);cell.setCellValue(ProcesoPedidosConstantesFunciones.LABEL_NOMBREGRUPOCLIENTE);
		cell = row.createCell(iColumn++);cell.setCellValue(ProcesoPedidosConstantesFunciones.LABEL_NOMBREVENDEDOR);
		cell = row.createCell(iColumn++);cell.setCellValue(ProcesoPedidosConstantesFunciones.LABEL_CODIGO);
		cell = row.createCell(iColumn++);cell.setCellValue(ProcesoPedidosConstantesFunciones.LABEL_NOMBRECOMPLETO);
		cell = row.createCell(iColumn++);cell.setCellValue(ProcesoPedidosConstantesFunciones.LABEL_NUMERO);
		cell = row.createCell(iColumn++);cell.setCellValue(ProcesoPedidosConstantesFunciones.LABEL_NUMEROAUTORIZACION);
		cell = row.createCell(iColumn++);cell.setCellValue(ProcesoPedidosConstantesFunciones.LABEL_TOTAL);
		cell = row.createCell(iColumn++);cell.setCellValue(ProcesoPedidosConstantesFunciones.LABEL_FECHAEMISION);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelProcesoPedidos(ProcesoPedidos procesopedidos,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(procesopedidos.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(procesopedidos.getciudad_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(procesopedidos.getzona_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(procesopedidos.getgrupocliente_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(procesopedidos.getvendedor_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(procesopedidos.getnombre_provincia());
		cell = row.createCell(iColumn++);cell.setCellValue(procesopedidos.getnombre_ciudad());
		cell = row.createCell(iColumn++);cell.setCellValue(procesopedidos.getnombre_zona());
		cell = row.createCell(iColumn++);cell.setCellValue(procesopedidos.getnombre_grupo_cliente());
		cell = row.createCell(iColumn++);cell.setCellValue(procesopedidos.getnombre_vendedor());
		cell = row.createCell(iColumn++);cell.setCellValue(procesopedidos.getcodigo());
		cell = row.createCell(iColumn++);cell.setCellValue(procesopedidos.getnombre_completo());
		cell = row.createCell(iColumn++);cell.setCellValue(procesopedidos.getnumero());
		cell = row.createCell(iColumn++);cell.setCellValue(procesopedidos.getnumero_autorizacion());
		cell = row.createCell(iColumn++);cell.setCellValue(procesopedidos.gettotal());
		cell = row.createCell(iColumn++);cell.setCellValue(procesopedidos.getfecha_emision());				
	}
	
	public void setFilaDatosExportarXmlProcesoPedidos(ProcesoPedidos procesopedidos,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(ProcesoPedidosConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(procesopedidos.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(ProcesoPedidosConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(procesopedidos.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementciudad_descripcion = document.createElement(ProcesoPedidosConstantesFunciones.IDCIUDAD);
		elementciudad_descripcion.appendChild(document.createTextNode(procesopedidos.getciudad_descripcion()));
		element.appendChild(elementciudad_descripcion);

		Element elementzona_descripcion = document.createElement(ProcesoPedidosConstantesFunciones.IDZONA);
		elementzona_descripcion.appendChild(document.createTextNode(procesopedidos.getzona_descripcion()));
		element.appendChild(elementzona_descripcion);

		Element elementgrupocliente_descripcion = document.createElement(ProcesoPedidosConstantesFunciones.IDGRUPOCLIENTE);
		elementgrupocliente_descripcion.appendChild(document.createTextNode(procesopedidos.getgrupocliente_descripcion()));
		element.appendChild(elementgrupocliente_descripcion);

		Element elementvendedor_descripcion = document.createElement(ProcesoPedidosConstantesFunciones.IDVENDEDOR);
		elementvendedor_descripcion.appendChild(document.createTextNode(procesopedidos.getvendedor_descripcion()));
		element.appendChild(elementvendedor_descripcion);

		Element elementnombre_provincia = document.createElement(ProcesoPedidosConstantesFunciones.NOMBREPROVINCIA);
		elementnombre_provincia.appendChild(document.createTextNode(procesopedidos.getnombre_provincia().trim()));
		element.appendChild(elementnombre_provincia);

		Element elementnombre_ciudad = document.createElement(ProcesoPedidosConstantesFunciones.NOMBRECIUDAD);
		elementnombre_ciudad.appendChild(document.createTextNode(procesopedidos.getnombre_ciudad().trim()));
		element.appendChild(elementnombre_ciudad);

		Element elementnombre_zona = document.createElement(ProcesoPedidosConstantesFunciones.NOMBREZONA);
		elementnombre_zona.appendChild(document.createTextNode(procesopedidos.getnombre_zona().trim()));
		element.appendChild(elementnombre_zona);

		Element elementnombre_grupo_cliente = document.createElement(ProcesoPedidosConstantesFunciones.NOMBREGRUPOCLIENTE);
		elementnombre_grupo_cliente.appendChild(document.createTextNode(procesopedidos.getnombre_grupo_cliente().trim()));
		element.appendChild(elementnombre_grupo_cliente);

		Element elementnombre_vendedor = document.createElement(ProcesoPedidosConstantesFunciones.NOMBREVENDEDOR);
		elementnombre_vendedor.appendChild(document.createTextNode(procesopedidos.getnombre_vendedor().trim()));
		element.appendChild(elementnombre_vendedor);

		Element elementcodigo = document.createElement(ProcesoPedidosConstantesFunciones.CODIGO);
		elementcodigo.appendChild(document.createTextNode(procesopedidos.getcodigo().trim()));
		element.appendChild(elementcodigo);

		Element elementnombre_completo = document.createElement(ProcesoPedidosConstantesFunciones.NOMBRECOMPLETO);
		elementnombre_completo.appendChild(document.createTextNode(procesopedidos.getnombre_completo().trim()));
		element.appendChild(elementnombre_completo);

		Element elementnumero = document.createElement(ProcesoPedidosConstantesFunciones.NUMERO);
		elementnumero.appendChild(document.createTextNode(procesopedidos.getnumero().trim()));
		element.appendChild(elementnumero);

		Element elementnumero_autorizacion = document.createElement(ProcesoPedidosConstantesFunciones.NUMEROAUTORIZACION);
		elementnumero_autorizacion.appendChild(document.createTextNode(procesopedidos.getnumero_autorizacion().trim()));
		element.appendChild(elementnumero_autorizacion);

		Element elementtotal = document.createElement(ProcesoPedidosConstantesFunciones.TOTAL);
		elementtotal.appendChild(document.createTextNode(procesopedidos.gettotal().toString().trim()));
		element.appendChild(elementtotal);

		Element elementfecha_emision = document.createElement(ProcesoPedidosConstantesFunciones.FECHAEMISION);
		elementfecha_emision.appendChild(document.createTextNode(procesopedidos.getfecha_emision().toString().trim()));
		element.appendChild(elementfecha_emision);
	}
	
	public void generarReporteGroupGenericoProcesoPedidossSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<ProcesoPedidos> procesopedidossSeleccionados=new ArrayList<ProcesoPedidos>();
		
		procesopedidossSeleccionados=this.getProcesoPedidossSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoProcesoPedidos(procesopedidossSeleccionados);
		
		this.generarReporteProcesoPedidoss("Todos",procesopedidossSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoProcesoPedidos(ArrayList<ProcesoPedidos> procesopedidossSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(ProcesoPedidos procesopedidosAux:procesopedidossSeleccionados) {
				procesopedidosAux.setsDetalleGeneralEntityReporte(procesopedidosAux.toString());
			
				if(sTipoSeleccionar.equals(ProcesoPedidosConstantesFunciones.LABEL_IDCIUDAD)) {
					existe=true;
					procesopedidosAux.setsDescripcionGeneralEntityReporte1(procesopedidosAux.getciudad_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ProcesoPedidosConstantesFunciones.LABEL_IDZONA)) {
					existe=true;
					procesopedidosAux.setsDescripcionGeneralEntityReporte1(procesopedidosAux.getzona_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ProcesoPedidosConstantesFunciones.LABEL_IDGRUPOCLIENTE)) {
					existe=true;
					procesopedidosAux.setsDescripcionGeneralEntityReporte1(procesopedidosAux.getgrupocliente_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ProcesoPedidosConstantesFunciones.LABEL_IDVENDEDOR)) {
					existe=true;
					procesopedidosAux.setsDescripcionGeneralEntityReporte1(procesopedidosAux.getvendedor_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ProcesoPedidosConstantesFunciones.LABEL_NOMBREPROVINCIA)) {
					existe=true;
					procesopedidosAux.setsDescripcionGeneralEntityReporte1(procesopedidosAux.getnombre_provincia());
				}
				 else if(sTipoSeleccionar.equals(ProcesoPedidosConstantesFunciones.LABEL_NOMBRECIUDAD)) {
					existe=true;
					procesopedidosAux.setsDescripcionGeneralEntityReporte1(procesopedidosAux.getnombre_ciudad());
				}
				 else if(sTipoSeleccionar.equals(ProcesoPedidosConstantesFunciones.LABEL_NOMBREZONA)) {
					existe=true;
					procesopedidosAux.setsDescripcionGeneralEntityReporte1(procesopedidosAux.getnombre_zona());
				}
				 else if(sTipoSeleccionar.equals(ProcesoPedidosConstantesFunciones.LABEL_NOMBREGRUPOCLIENTE)) {
					existe=true;
					procesopedidosAux.setsDescripcionGeneralEntityReporte1(procesopedidosAux.getnombre_grupo_cliente());
				}
				 else if(sTipoSeleccionar.equals(ProcesoPedidosConstantesFunciones.LABEL_NOMBREVENDEDOR)) {
					existe=true;
					procesopedidosAux.setsDescripcionGeneralEntityReporte1(procesopedidosAux.getnombre_vendedor());
				}
				 else if(sTipoSeleccionar.equals(ProcesoPedidosConstantesFunciones.LABEL_CODIGO)) {
					existe=true;
					procesopedidosAux.setsDescripcionGeneralEntityReporte1(procesopedidosAux.getcodigo());
				}
				 else if(sTipoSeleccionar.equals(ProcesoPedidosConstantesFunciones.LABEL_NOMBRECOMPLETO)) {
					existe=true;
					procesopedidosAux.setsDescripcionGeneralEntityReporte1(procesopedidosAux.getnombre_completo());
				}
				 else if(sTipoSeleccionar.equals(ProcesoPedidosConstantesFunciones.LABEL_NUMERO)) {
					existe=true;
					procesopedidosAux.setsDescripcionGeneralEntityReporte1(procesopedidosAux.getnumero());
				}
				 else if(sTipoSeleccionar.equals(ProcesoPedidosConstantesFunciones.LABEL_NUMEROAUTORIZACION)) {
					existe=true;
					procesopedidosAux.setsDescripcionGeneralEntityReporte1(procesopedidosAux.getnumero_autorizacion());
				}
				 else if(sTipoSeleccionar.equals(ProcesoPedidosConstantesFunciones.LABEL_FECHAEMISION)) {
					existe=true;
					procesopedidosAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(procesopedidosAux.getfecha_emision()));
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoPedidosConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesProcesoPedidos(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoProcesoPedidos=true;
				this.isVisibilidadCeldaNuevoRelacionesProcesoPedidos=true;
				this.isVisibilidadCeldaGuardarCambiosProcesoPedidos=true;
			}
			
			this.isVisibilidadCeldaModificarProcesoPedidos=false;
			this.isVisibilidadCeldaActualizarProcesoPedidos=false;
			this.isVisibilidadCeldaEliminarProcesoPedidos=false;
			this.isVisibilidadCeldaCancelarProcesoPedidos=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProcesoPedidos=true;
				} else {
					this.isVisibilidadCeldaGuardarProcesoPedidos=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoProcesoPedidos=false;
			this.isVisibilidadCeldaNuevoRelacionesProcesoPedidos=false;
			this.isVisibilidadCeldaGuardarCambiosProcesoPedidos=false;
			this.isVisibilidadCeldaModificarProcesoPedidos=false;
			this.isVisibilidadCeldaActualizarProcesoPedidos=true;
			this.isVisibilidadCeldaEliminarProcesoPedidos=false;
			this.isVisibilidadCeldaCancelarProcesoPedidos=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProcesoPedidos=true;
				} else {
					this.isVisibilidadCeldaGuardarProcesoPedidos=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoProcesoPedidos=false;
			this.isVisibilidadCeldaNuevoRelacionesProcesoPedidos=false;
			this.isVisibilidadCeldaGuardarCambiosProcesoPedidos=false;
			this.isVisibilidadCeldaModificarProcesoPedidos=false;
			this.isVisibilidadCeldaActualizarProcesoPedidos=true;
			this.isVisibilidadCeldaEliminarProcesoPedidos=true;
			this.isVisibilidadCeldaCancelarProcesoPedidos=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProcesoPedidos=true;
				} else {
					this.isVisibilidadCeldaGuardarProcesoPedidos=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoProcesoPedidos=false;
			this.isVisibilidadCeldaNuevoRelacionesProcesoPedidos=false;
			this.isVisibilidadCeldaGuardarCambiosProcesoPedidos=false;
			this.isVisibilidadCeldaModificarProcesoPedidos=false;
			this.isVisibilidadCeldaActualizarProcesoPedidos=true;
			this.isVisibilidadCeldaEliminarProcesoPedidos=false;
			this.isVisibilidadCeldaCancelarProcesoPedidos=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProcesoPedidos=false;
				} else {
					this.isVisibilidadCeldaGuardarProcesoPedidos=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoProcesoPedidos=true;
			this.isVisibilidadCeldaNuevoRelacionesProcesoPedidos=true;
			this.isVisibilidadCeldaGuardarCambiosProcesoPedidos=true;
			this.isVisibilidadCeldaModificarProcesoPedidos=false;
			this.isVisibilidadCeldaActualizarProcesoPedidos=false;
			this.isVisibilidadCeldaEliminarProcesoPedidos=false;
			this.isVisibilidadCeldaCancelarProcesoPedidos=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProcesoPedidos=true;
				} else {
					this.isVisibilidadCeldaGuardarProcesoPedidos=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoProcesoPedidos=false;
			this.isVisibilidadCeldaNuevoRelacionesProcesoPedidos=false;
			this.isVisibilidadCeldaGuardarCambiosProcesoPedidos=false;
			this.isVisibilidadCeldaActualizarProcesoPedidos=false;
			this.isVisibilidadCeldaEliminarProcesoPedidos=false;
			this.isVisibilidadCeldaCancelarProcesoPedidos=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProcesoPedidos=false;
				} else {
					this.isVisibilidadCeldaGuardarProcesoPedidos=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoProcesoPedidos=false;
			this.isVisibilidadCeldaNuevoRelacionesProcesoPedidos=false;
			this.isVisibilidadCeldaGuardarCambiosProcesoPedidos=false;
			this.isVisibilidadCeldaModificarProcesoPedidos=true;
			this.isVisibilidadCeldaActualizarProcesoPedidos=false;
			this.isVisibilidadCeldaEliminarProcesoPedidos=false;
			this.isVisibilidadCeldaCancelarProcesoPedidos=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProcesoPedidos=false;
				} else {
					this.isVisibilidadCeldaGuardarProcesoPedidos=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(ProcesoPedidosJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoProcesoPedidos=true;
			this.isVisibilidadCeldaNuevoRelacionesProcesoPedidos=true;
			this.isVisibilidadCeldaGuardarCambiosProcesoPedidos=true;
		} else {
			this.actualizarEstadoPanelsProcesoPedidos(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarProcesoPedidos=false;
			//this.isVisibilidadCeldaVerFormProcesoPedidos=false;
			this.isVisibilidadCeldaDuplicarProcesoPedidos=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!procesopedidosSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesProcesoPedidos=false;
		} else {
			this.isVisibilidadCeldaNuevoProcesoPedidos=false;
			this.isVisibilidadCeldaGuardarCambiosProcesoPedidos=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(procesopedidosSessionBean.getEsGuardarRelacionado()) {
			if(!procesopedidosSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesProcesoPedidos=false;												
			}
			
			this.jButtonCerrarProcesoPedidos.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesProcesoPedidos=false;
		}
		
		if(!this.permiteMantenimiento(this.procesopedidos)) {
			this.isVisibilidadCeldaActualizarProcesoPedidos=false;
			this.isVisibilidadCeldaEliminarProcesoPedidos=false;
		}
		
		
		//SE DESHABILITA SIEMPRE
		this.isVisibilidadCeldaNuevoProcesoPedidos=false;
		this.isVisibilidadCeldaNuevoRelacionesProcesoPedidos=false;
		this.isVisibilidadCeldaGuardarCambiosProcesoPedidos=false;
		//this.isVisibilidadCeldaModificarProcesoPedidos=true;
		this.isVisibilidadCeldaActualizarProcesoPedidos=false;
		this.isVisibilidadCeldaEliminarProcesoPedidos=false;
		//this.isVisibilidadCeldaCancelarProcesoPedidos=true;			
		this.isVisibilidadCeldaGuardarProcesoPedidos=false;
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesProcesoPedidos() {
	}
	
	public void actualizarEstadoPanelsProcesoPedidos(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionProcesoPedidos!=null) {
				this.jScrollPanelDatosEdicionProcesoPedidos.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProcesoPedidos!=null) {
				this.jTabbedPaneBusquedasProcesoPedidos.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosProcesoPedidos!=null) {
				this.jScrollPanelDatosProcesoPedidos.setVisible(true);
			}
			
			if(this.jPanelPaginacionProcesoPedidos!=null) {
				this.jPanelPaginacionProcesoPedidos.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesProcesoPedidos!=null) {
				this.jPanelParametrosReportesProcesoPedidos.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionProcesoPedidos!=null) {
				this.jScrollPanelDatosEdicionProcesoPedidos.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProcesoPedidos!=null) {
				this.jTabbedPaneBusquedasProcesoPedidos.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosProcesoPedidos!=null) {
				this.jScrollPanelDatosProcesoPedidos.setVisible(false);
			}
			
			if(this.jPanelPaginacionProcesoPedidos!=null) {
				this.jPanelPaginacionProcesoPedidos.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesProcesoPedidos!=null) {
				this.jPanelParametrosReportesProcesoPedidos.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionProcesoPedidos!=null) {
				this.jScrollPanelDatosEdicionProcesoPedidos.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProcesoPedidos!=null) {
				this.jTabbedPaneBusquedasProcesoPedidos.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosProcesoPedidos!=null) {
				this.jScrollPanelDatosProcesoPedidos.setVisible(false);
			}
			
			if(this.jPanelPaginacionProcesoPedidos!=null) {
				this.jPanelPaginacionProcesoPedidos.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesProcesoPedidos!=null) {
				this.jPanelParametrosReportesProcesoPedidos.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionProcesoPedidos!=null) {
				this.jScrollPanelDatosEdicionProcesoPedidos.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProcesoPedidos!=null) {
				this.jTabbedPaneBusquedasProcesoPedidos.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosProcesoPedidos!=null) {
				this.jScrollPanelDatosProcesoPedidos.setVisible(false);
			}
			
			if(this.jPanelPaginacionProcesoPedidos!=null) {
				this.jPanelPaginacionProcesoPedidos.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesProcesoPedidos!=null) {
				this.jPanelParametrosReportesProcesoPedidos.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionProcesoPedidos!=null) {
				this.jScrollPanelDatosEdicionProcesoPedidos.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProcesoPedidos!=null) {
				this.jTabbedPaneBusquedasProcesoPedidos.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosProcesoPedidos!=null) {
				this.jScrollPanelDatosProcesoPedidos.setVisible(true);
			}
			
			if(this.jPanelPaginacionProcesoPedidos!=null) {
				this.jPanelPaginacionProcesoPedidos.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesProcesoPedidos!=null) {
				this.jPanelParametrosReportesProcesoPedidos.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionProcesoPedidos!=null) {
				this.jScrollPanelDatosEdicionProcesoPedidos.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProcesoPedidos!=null) {
				this.jTabbedPaneBusquedasProcesoPedidos.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosProcesoPedidos!=null) {
				this.jScrollPanelDatosProcesoPedidos.setVisible(true);
			}
			
			if(this.jPanelPaginacionProcesoPedidos!=null) {
				this.jPanelPaginacionProcesoPedidos.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesProcesoPedidos!=null) {
				this.jPanelParametrosReportesProcesoPedidos.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionProcesoPedidos!=null) {
				this.jScrollPanelDatosEdicionProcesoPedidos.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProcesoPedidos!=null) {
				this.jTabbedPaneBusquedasProcesoPedidos.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosProcesoPedidos!=null) {
				this.jScrollPanelDatosProcesoPedidos.setVisible(true);
			}
			
			if(this.jPanelPaginacionProcesoPedidos!=null) {
				this.jPanelPaginacionProcesoPedidos.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesProcesoPedidos!=null) {
				this.jPanelParametrosReportesProcesoPedidos.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.procesopedidosSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasProcesoPedidos!=null) {
					this.jTabbedPaneBusquedasProcesoPedidos.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesProcesoPedidos!=null) {
				this.jPanelParametrosReportesProcesoPedidos.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.procesopedidosSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProcesoPedidos!=null) {
				this.jTabbedPaneBusquedasProcesoPedidos.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesProcesoPedidos!=null) {
				this.jPanelParametrosReportesProcesoPedidos.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaCiudad(Boolean isParaCiudad){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaCiudadNegation=!isParaCiudad;

			this.isVisibilidadBusquedaProcesoPedidos=isParaCiudad;
			if(!this.isVisibilidadBusquedaProcesoPedidos) {this.jTabbedPaneBusquedasProcesoPedidos.remove(jPanelBusquedaProcesoPedidosProcesoPedidos);}
		}
		
	}

	public void setVisibilidadBusquedasParaZona(Boolean isParaZona){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaZonaNegation=!isParaZona;

			this.isVisibilidadBusquedaProcesoPedidos=isParaZona;
			if(!this.isVisibilidadBusquedaProcesoPedidos) {this.jTabbedPaneBusquedasProcesoPedidos.remove(jPanelBusquedaProcesoPedidosProcesoPedidos);}
		}
		
	}

	public void setVisibilidadBusquedasParaGrupoCliente(Boolean isParaGrupoCliente){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaGrupoClienteNegation=!isParaGrupoCliente;

			this.isVisibilidadBusquedaProcesoPedidos=isParaGrupoCliente;
			if(!this.isVisibilidadBusquedaProcesoPedidos) {this.jTabbedPaneBusquedasProcesoPedidos.remove(jPanelBusquedaProcesoPedidosProcesoPedidos);}
		}
		
	}

	public void setVisibilidadBusquedasParaVendedor(Boolean isParaVendedor){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaVendedorNegation=!isParaVendedor;

			this.isVisibilidadBusquedaProcesoPedidos=isParaVendedor;
			if(!this.isVisibilidadBusquedaProcesoPedidos) {this.jTabbedPaneBusquedasProcesoPedidos.remove(jPanelBusquedaProcesoPedidosProcesoPedidos);}
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
			
			this.inicializarActualizarBindingTablaProcesoPedidos(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioProcesoPedidos() {
		this.updateBorderResaltarBusquedasFormularioProcesoPedidos();
		this.updateVisibilidadBusquedasFormularioProcesoPedidos();
		this.updateHabilitarBusquedasFormularioProcesoPedidos();
	}
	
	public void updateBorderResaltarBusquedasFormularioProcesoPedidos() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasProcesoPedidos.getComponents().length>0) {
	

		if(this.procesopedidosConstantesFunciones.resaltarBusquedaProcesoPedidosProcesoPedidos!=null) {
			index= this.jTabbedPaneBusquedasProcesoPedidos.indexOfComponent(this.jPanelBusquedaProcesoPedidosProcesoPedidos);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasProcesoPedidos.getComponent(index);
				jPanel.setBorder(this.procesopedidosConstantesFunciones.resaltarBusquedaProcesoPedidosProcesoPedidos);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioProcesoPedidos() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasProcesoPedidos.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasProcesoPedidos.indexOfComponent(this.jPanelBusquedaProcesoPedidosProcesoPedidos);
			jPanel=(JPanel)this.jTabbedPaneBusquedasProcesoPedidos.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.procesopedidosConstantesFunciones.mostrarBusquedaProcesoPedidosProcesoPedidos);
			if(!this.procesopedidosConstantesFunciones.mostrarBusquedaProcesoPedidosProcesoPedidos && index>-1) {
				this.jTabbedPaneBusquedasProcesoPedidos.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioProcesoPedidos() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasProcesoPedidos.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasProcesoPedidos.indexOfComponent(this.jPanelBusquedaProcesoPedidosProcesoPedidos);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasProcesoPedidos.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.procesopedidosConstantesFunciones.activarBusquedaProcesoPedidosProcesoPedidos);
				this.jTabbedPaneBusquedasProcesoPedidos.setEnabledAt(index,this.procesopedidosConstantesFunciones.activarBusquedaProcesoPedidosProcesoPedidos);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaProcesoPedidos(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("BusquedaProcesoPedidos")) {
			index= this.jTabbedPaneBusquedasProcesoPedidos.indexOfComponent(this.jPanelBusquedaProcesoPedidosProcesoPedidos);

			this.jTabbedPaneBusquedasProcesoPedidos.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasProcesoPedidos.getComponent(index);

			this.procesopedidosConstantesFunciones.setResaltarBusquedaProcesoPedidosProcesoPedidos(resaltar);

			jPanel.setBorder(this.procesopedidosConstantesFunciones.resaltarBusquedaProcesoPedidosProcesoPedidos);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarProcesoPedidos.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioProcesoPedidos() throws Exception {

		if(this.jInternalFrameDetalleFormProcesoPedidos==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioProcesoPedidos();
		this.updateVisibilidadResaltarControlesFormularioProcesoPedidos();
		this.updateHabilitarResaltarControlesFormularioProcesoPedidos();
		
	}
	
	public void updateBorderResaltarControlesFormularioProcesoPedidos() throws Exception {
		if(this.jInternalFrameDetalleFormProcesoPedidos==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.procesopedidosConstantesFunciones.resaltaridProcesoPedidos!=null && this.jInternalFrameDetalleFormProcesoPedidos!=null) {this.jInternalFrameDetalleFormProcesoPedidos.jLabelidProcesoPedidos.setBorder(this.procesopedidosConstantesFunciones.resaltaridProcesoPedidos);}
		if(this.procesopedidosConstantesFunciones.resaltarid_ciudadProcesoPedidos!=null && this.jInternalFrameDetalleFormProcesoPedidos!=null) {this.jInternalFrameDetalleFormProcesoPedidos.jComboBoxid_ciudadProcesoPedidos.setBorder(this.procesopedidosConstantesFunciones.resaltarid_ciudadProcesoPedidos);}
		if(this.procesopedidosConstantesFunciones.resaltarid_zonaProcesoPedidos!=null && this.jInternalFrameDetalleFormProcesoPedidos!=null) {this.jInternalFrameDetalleFormProcesoPedidos.jComboBoxid_zonaProcesoPedidos.setBorder(this.procesopedidosConstantesFunciones.resaltarid_zonaProcesoPedidos);}
		if(this.procesopedidosConstantesFunciones.resaltarid_grupo_clienteProcesoPedidos!=null && this.jInternalFrameDetalleFormProcesoPedidos!=null) {this.jInternalFrameDetalleFormProcesoPedidos.jComboBoxid_grupo_clienteProcesoPedidos.setBorder(this.procesopedidosConstantesFunciones.resaltarid_grupo_clienteProcesoPedidos);}
		if(this.procesopedidosConstantesFunciones.resaltarid_vendedorProcesoPedidos!=null && this.jInternalFrameDetalleFormProcesoPedidos!=null) {this.jInternalFrameDetalleFormProcesoPedidos.jComboBoxid_vendedorProcesoPedidos.setBorder(this.procesopedidosConstantesFunciones.resaltarid_vendedorProcesoPedidos);}
		if(this.procesopedidosConstantesFunciones.resaltarnombre_provinciaProcesoPedidos!=null && this.jInternalFrameDetalleFormProcesoPedidos!=null) {this.jInternalFrameDetalleFormProcesoPedidos.jTextAreanombre_provinciaProcesoPedidos.setBorder(this.procesopedidosConstantesFunciones.resaltarnombre_provinciaProcesoPedidos);}
		if(this.procesopedidosConstantesFunciones.resaltarnombre_ciudadProcesoPedidos!=null && this.jInternalFrameDetalleFormProcesoPedidos!=null) {this.jInternalFrameDetalleFormProcesoPedidos.jTextAreanombre_ciudadProcesoPedidos.setBorder(this.procesopedidosConstantesFunciones.resaltarnombre_ciudadProcesoPedidos);}
		if(this.procesopedidosConstantesFunciones.resaltarnombre_zonaProcesoPedidos!=null && this.jInternalFrameDetalleFormProcesoPedidos!=null) {this.jInternalFrameDetalleFormProcesoPedidos.jTextFieldnombre_zonaProcesoPedidos.setBorder(this.procesopedidosConstantesFunciones.resaltarnombre_zonaProcesoPedidos);}
		if(this.procesopedidosConstantesFunciones.resaltarnombre_grupo_clienteProcesoPedidos!=null && this.jInternalFrameDetalleFormProcesoPedidos!=null) {this.jInternalFrameDetalleFormProcesoPedidos.jTextAreanombre_grupo_clienteProcesoPedidos.setBorder(this.procesopedidosConstantesFunciones.resaltarnombre_grupo_clienteProcesoPedidos);}
		if(this.procesopedidosConstantesFunciones.resaltarnombre_vendedorProcesoPedidos!=null && this.jInternalFrameDetalleFormProcesoPedidos!=null) {this.jInternalFrameDetalleFormProcesoPedidos.jTextAreanombre_vendedorProcesoPedidos.setBorder(this.procesopedidosConstantesFunciones.resaltarnombre_vendedorProcesoPedidos);}
		if(this.procesopedidosConstantesFunciones.resaltarcodigoProcesoPedidos!=null && this.jInternalFrameDetalleFormProcesoPedidos!=null) {this.jInternalFrameDetalleFormProcesoPedidos.jTextFieldcodigoProcesoPedidos.setBorder(this.procesopedidosConstantesFunciones.resaltarcodigoProcesoPedidos);}
		if(this.procesopedidosConstantesFunciones.resaltarnombre_completoProcesoPedidos!=null && this.jInternalFrameDetalleFormProcesoPedidos!=null) {this.jInternalFrameDetalleFormProcesoPedidos.jTextAreanombre_completoProcesoPedidos.setBorder(this.procesopedidosConstantesFunciones.resaltarnombre_completoProcesoPedidos);}
		if(this.procesopedidosConstantesFunciones.resaltarnumeroProcesoPedidos!=null && this.jInternalFrameDetalleFormProcesoPedidos!=null) {this.jInternalFrameDetalleFormProcesoPedidos.jTextFieldnumeroProcesoPedidos.setBorder(this.procesopedidosConstantesFunciones.resaltarnumeroProcesoPedidos);}
		if(this.procesopedidosConstantesFunciones.resaltarnumero_autorizacionProcesoPedidos!=null && this.jInternalFrameDetalleFormProcesoPedidos!=null) {this.jInternalFrameDetalleFormProcesoPedidos.jTextFieldnumero_autorizacionProcesoPedidos.setBorder(this.procesopedidosConstantesFunciones.resaltarnumero_autorizacionProcesoPedidos);}
		if(this.procesopedidosConstantesFunciones.resaltartotalProcesoPedidos!=null && this.jInternalFrameDetalleFormProcesoPedidos!=null) {this.jInternalFrameDetalleFormProcesoPedidos.jTextFieldtotalProcesoPedidos.setBorder(this.procesopedidosConstantesFunciones.resaltartotalProcesoPedidos);}
		if(this.procesopedidosConstantesFunciones.resaltarfecha_emisionProcesoPedidos!=null && this.jInternalFrameDetalleFormProcesoPedidos!=null) {this.jInternalFrameDetalleFormProcesoPedidos.jDateChooserfecha_emisionProcesoPedidos.setBorder(this.procesopedidosConstantesFunciones.resaltarfecha_emisionProcesoPedidos);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioProcesoPedidos() throws Exception {		
		if(this.jInternalFrameDetalleFormProcesoPedidos==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormProcesoPedidos!=null) {
	
		//this.jInternalFrameDetalleFormProcesoPedidos.jLabelidProcesoPedidos.setVisible(this.procesopedidosConstantesFunciones.mostraridProcesoPedidos);
		this.jInternalFrameDetalleFormProcesoPedidos.jPanelidProcesoPedidos.setVisible(this.procesopedidosConstantesFunciones.mostraridProcesoPedidos);
		//this.jInternalFrameDetalleFormProcesoPedidos.jComboBoxid_ciudadProcesoPedidos.setVisible(this.procesopedidosConstantesFunciones.mostrarid_ciudadProcesoPedidos);
		this.jInternalFrameDetalleFormProcesoPedidos.jPanelid_ciudadProcesoPedidos.setVisible(this.procesopedidosConstantesFunciones.mostrarid_ciudadProcesoPedidos);
		//this.jInternalFrameDetalleFormProcesoPedidos.jComboBoxid_zonaProcesoPedidos.setVisible(this.procesopedidosConstantesFunciones.mostrarid_zonaProcesoPedidos);
		this.jInternalFrameDetalleFormProcesoPedidos.jPanelid_zonaProcesoPedidos.setVisible(this.procesopedidosConstantesFunciones.mostrarid_zonaProcesoPedidos);
		//this.jInternalFrameDetalleFormProcesoPedidos.jComboBoxid_grupo_clienteProcesoPedidos.setVisible(this.procesopedidosConstantesFunciones.mostrarid_grupo_clienteProcesoPedidos);
		this.jInternalFrameDetalleFormProcesoPedidos.jPanelid_grupo_clienteProcesoPedidos.setVisible(this.procesopedidosConstantesFunciones.mostrarid_grupo_clienteProcesoPedidos);
		//this.jInternalFrameDetalleFormProcesoPedidos.jComboBoxid_vendedorProcesoPedidos.setVisible(this.procesopedidosConstantesFunciones.mostrarid_vendedorProcesoPedidos);
		this.jInternalFrameDetalleFormProcesoPedidos.jPanelid_vendedorProcesoPedidos.setVisible(this.procesopedidosConstantesFunciones.mostrarid_vendedorProcesoPedidos);
		//this.jInternalFrameDetalleFormProcesoPedidos.jTextAreanombre_provinciaProcesoPedidos.setVisible(this.procesopedidosConstantesFunciones.mostrarnombre_provinciaProcesoPedidos);
		this.jInternalFrameDetalleFormProcesoPedidos.jPanelnombre_provinciaProcesoPedidos.setVisible(this.procesopedidosConstantesFunciones.mostrarnombre_provinciaProcesoPedidos);
		//this.jInternalFrameDetalleFormProcesoPedidos.jTextAreanombre_ciudadProcesoPedidos.setVisible(this.procesopedidosConstantesFunciones.mostrarnombre_ciudadProcesoPedidos);
		this.jInternalFrameDetalleFormProcesoPedidos.jPanelnombre_ciudadProcesoPedidos.setVisible(this.procesopedidosConstantesFunciones.mostrarnombre_ciudadProcesoPedidos);
		//this.jInternalFrameDetalleFormProcesoPedidos.jTextFieldnombre_zonaProcesoPedidos.setVisible(this.procesopedidosConstantesFunciones.mostrarnombre_zonaProcesoPedidos);
		this.jInternalFrameDetalleFormProcesoPedidos.jPanelnombre_zonaProcesoPedidos.setVisible(this.procesopedidosConstantesFunciones.mostrarnombre_zonaProcesoPedidos);
		//this.jInternalFrameDetalleFormProcesoPedidos.jTextAreanombre_grupo_clienteProcesoPedidos.setVisible(this.procesopedidosConstantesFunciones.mostrarnombre_grupo_clienteProcesoPedidos);
		this.jInternalFrameDetalleFormProcesoPedidos.jPanelnombre_grupo_clienteProcesoPedidos.setVisible(this.procesopedidosConstantesFunciones.mostrarnombre_grupo_clienteProcesoPedidos);
		//this.jInternalFrameDetalleFormProcesoPedidos.jTextAreanombre_vendedorProcesoPedidos.setVisible(this.procesopedidosConstantesFunciones.mostrarnombre_vendedorProcesoPedidos);
		this.jInternalFrameDetalleFormProcesoPedidos.jPanelnombre_vendedorProcesoPedidos.setVisible(this.procesopedidosConstantesFunciones.mostrarnombre_vendedorProcesoPedidos);
		//this.jInternalFrameDetalleFormProcesoPedidos.jTextFieldcodigoProcesoPedidos.setVisible(this.procesopedidosConstantesFunciones.mostrarcodigoProcesoPedidos);
		this.jInternalFrameDetalleFormProcesoPedidos.jPanelcodigoProcesoPedidos.setVisible(this.procesopedidosConstantesFunciones.mostrarcodigoProcesoPedidos);
		//this.jInternalFrameDetalleFormProcesoPedidos.jTextAreanombre_completoProcesoPedidos.setVisible(this.procesopedidosConstantesFunciones.mostrarnombre_completoProcesoPedidos);
		this.jInternalFrameDetalleFormProcesoPedidos.jPanelnombre_completoProcesoPedidos.setVisible(this.procesopedidosConstantesFunciones.mostrarnombre_completoProcesoPedidos);
		//this.jInternalFrameDetalleFormProcesoPedidos.jTextFieldnumeroProcesoPedidos.setVisible(this.procesopedidosConstantesFunciones.mostrarnumeroProcesoPedidos);
		this.jInternalFrameDetalleFormProcesoPedidos.jPanelnumeroProcesoPedidos.setVisible(this.procesopedidosConstantesFunciones.mostrarnumeroProcesoPedidos);
		//this.jInternalFrameDetalleFormProcesoPedidos.jTextFieldnumero_autorizacionProcesoPedidos.setVisible(this.procesopedidosConstantesFunciones.mostrarnumero_autorizacionProcesoPedidos);
		this.jInternalFrameDetalleFormProcesoPedidos.jPanelnumero_autorizacionProcesoPedidos.setVisible(this.procesopedidosConstantesFunciones.mostrarnumero_autorizacionProcesoPedidos);
		//this.jInternalFrameDetalleFormProcesoPedidos.jTextFieldtotalProcesoPedidos.setVisible(this.procesopedidosConstantesFunciones.mostrartotalProcesoPedidos);
		this.jInternalFrameDetalleFormProcesoPedidos.jPaneltotalProcesoPedidos.setVisible(this.procesopedidosConstantesFunciones.mostrartotalProcesoPedidos);
		//this.jInternalFrameDetalleFormProcesoPedidos.jDateChooserfecha_emisionProcesoPedidos.setVisible(this.procesopedidosConstantesFunciones.mostrarfecha_emisionProcesoPedidos);
		this.jInternalFrameDetalleFormProcesoPedidos.jPanelfecha_emisionProcesoPedidos.setVisible(this.procesopedidosConstantesFunciones.mostrarfecha_emisionProcesoPedidos);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioProcesoPedidos() throws Exception {
		if(this.jInternalFrameDetalleFormProcesoPedidos==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormProcesoPedidos!=null) {
	
		this.jInternalFrameDetalleFormProcesoPedidos.jLabelidProcesoPedidos.setEnabled(this.procesopedidosConstantesFunciones.activaridProcesoPedidos);
		this.jInternalFrameDetalleFormProcesoPedidos.jComboBoxid_ciudadProcesoPedidos.setEnabled(this.procesopedidosConstantesFunciones.activarid_ciudadProcesoPedidos);
		this.jInternalFrameDetalleFormProcesoPedidos.jComboBoxid_zonaProcesoPedidos.setEnabled(this.procesopedidosConstantesFunciones.activarid_zonaProcesoPedidos);
		this.jInternalFrameDetalleFormProcesoPedidos.jComboBoxid_grupo_clienteProcesoPedidos.setEnabled(this.procesopedidosConstantesFunciones.activarid_grupo_clienteProcesoPedidos);
		this.jInternalFrameDetalleFormProcesoPedidos.jComboBoxid_vendedorProcesoPedidos.setEnabled(this.procesopedidosConstantesFunciones.activarid_vendedorProcesoPedidos);
		this.jInternalFrameDetalleFormProcesoPedidos.jTextAreanombre_provinciaProcesoPedidos.setEnabled(this.procesopedidosConstantesFunciones.activarnombre_provinciaProcesoPedidos);
		this.jInternalFrameDetalleFormProcesoPedidos.jTextAreanombre_ciudadProcesoPedidos.setEnabled(this.procesopedidosConstantesFunciones.activarnombre_ciudadProcesoPedidos);
		this.jInternalFrameDetalleFormProcesoPedidos.jTextFieldnombre_zonaProcesoPedidos.setEnabled(this.procesopedidosConstantesFunciones.activarnombre_zonaProcesoPedidos);
		this.jInternalFrameDetalleFormProcesoPedidos.jTextAreanombre_grupo_clienteProcesoPedidos.setEnabled(this.procesopedidosConstantesFunciones.activarnombre_grupo_clienteProcesoPedidos);
		this.jInternalFrameDetalleFormProcesoPedidos.jTextAreanombre_vendedorProcesoPedidos.setEnabled(this.procesopedidosConstantesFunciones.activarnombre_vendedorProcesoPedidos);
		this.jInternalFrameDetalleFormProcesoPedidos.jTextFieldcodigoProcesoPedidos.setEnabled(this.procesopedidosConstantesFunciones.activarcodigoProcesoPedidos);
		this.jInternalFrameDetalleFormProcesoPedidos.jTextAreanombre_completoProcesoPedidos.setEnabled(this.procesopedidosConstantesFunciones.activarnombre_completoProcesoPedidos);
		this.jInternalFrameDetalleFormProcesoPedidos.jTextFieldnumeroProcesoPedidos.setEnabled(this.procesopedidosConstantesFunciones.activarnumeroProcesoPedidos);
		this.jInternalFrameDetalleFormProcesoPedidos.jTextFieldnumero_autorizacionProcesoPedidos.setEnabled(this.procesopedidosConstantesFunciones.activarnumero_autorizacionProcesoPedidos);
		this.jInternalFrameDetalleFormProcesoPedidos.jTextFieldtotalProcesoPedidos.setEnabled(this.procesopedidosConstantesFunciones.activartotalProcesoPedidos);
		this.jInternalFrameDetalleFormProcesoPedidos.jDateChooserfecha_emisionProcesoPedidos.setEnabled(this.procesopedidosConstantesFunciones.activarfecha_emisionProcesoPedidos);
		}
	}
	
		
}